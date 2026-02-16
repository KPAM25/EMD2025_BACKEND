-- =====================================================
-- Script de creación de roles y permisos en PostgreSQL
-- Sistema EMD2025 - Seguridad por capas
-- =====================================================

-- 1. Crear roles de base de datos
-- =====================================================

-- Rol para administradores (acceso completo)
CREATE ROLE db_admin WITH LOGIN PASSWORD 'admin_emd2025_secure';
COMMENT ON ROLE db_admin IS 'Rol de administrador con acceso completo al sistema';

-- Rol para médicos (consultas y diagnósticos)
CREATE ROLE db_medico WITH LOGIN PASSWORD 'medico_emd2025_secure';
COMMENT ON ROLE db_medico IS 'Rol para médicos: acceso a consultas y diagnósticos';

-- Rol para recepción (pacientes y citas)
CREATE ROLE db_recepcion WITH LOGIN PASSWORD 'recepcion_emd2025_secure';
COMMENT ON ROLE db_recepcion IS 'Rol para recepción: registro de pacientes y citas';

-- Rol para enfermería (signos vitales)
CREATE ROLE db_enfermeria WITH LOGIN PASSWORD 'enfermeria_emd2025_secure';
COMMENT ON ROLE db_enfermeria IS 'Rol para enfermería: registro de signos vitales';

-- Rol para consulta/lectura (solo lectura)
CREATE ROLE db_consulta WITH LOGIN PASSWORD 'consulta_emd2025_secure';
COMMENT ON ROLE db_consulta IS 'Rol para archivo/administrativo: solo lectura';

-- 2. Asignar permisos por esquema
-- =====================================================

-- Permisos en esquema emd (datos principales)
GRANT USAGE ON SCHEMA emd TO db_admin, db_medico, db_recepcion, db_enfermeria, db_consulta;

-- Permisos en esquema catalogos
GRANT USAGE ON SCHEMA catalogos TO db_admin, db_medico, db_recepcion, db_enfermeria, db_consulta;

-- Permisos en esquema catalogosdgis
GRANT USAGE ON SCHEMA catalogosdgis TO db_admin, db_medico, db_recepcion, db_enfermeria, db_consulta;

-- Permisos en esquema adminemd
GRANT USAGE ON SCHEMA adminemd TO db_admin, db_medico, db_recepcion, db_enfermeria, db_consulta;

-- 3. Permisos para ADMINISTRADOR (db_admin) - Acceso completo
-- =====================================================
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA emd TO db_admin;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA catalogos TO db_admin;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA catalogosdgis TO db_admin;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA adminemd TO db_admin;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA emd TO db_admin;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA catalogos TO db_admin;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA catalogosdgis TO db_admin;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA adminemd TO db_admin;

-- 4. Permisos para MÉDICO (db_medico) - Consultas y diagnósticos
-- =====================================================

-- Lectura de catálogos (necesarios para formularios)
GRANT SELECT ON ALL TABLES IN SCHEMA catalogos TO db_medico;
GRANT SELECT ON ALL TABLES IN SCHEMA catalogosdgis TO db_medico;

-- Acceso completo a consultas y diagnósticos
GRANT SELECT, INSERT, UPDATE ON emd.consultas_tbl TO db_medico;
GRANT SELECT, INSERT, UPDATE ON emd.diagnosticos_tbl TO db_medico;
GRANT SELECT, INSERT, UPDATE ON emd.soap_tbl TO db_medico;

-- Lectura de pacientes (para ver historial)
GRANT SELECT ON emd.personas_tbl TO db_medico;
GRANT SELECT ON emd.pacientes_tbl TO db_medico;

-- Lectura de signos vitales
GRANT SELECT ON emd.registro_signos_vitales_tbl TO db_medico;

-- Secuencias necesarias
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA emd TO db_medico;

-- 5. Permisos para RECEPCIÓN (db_recepcion) - Pacientes y citas
-- =====================================================

-- Lectura de catálogos
GRANT SELECT ON ALL TABLES IN SCHEMA catalogos TO db_recepcion;
GRANT SELECT ON ALL TABLES IN SCHEMA catalogosdgis TO db_recepcion;

-- Acceso completo a pacientes
GRANT SELECT, INSERT, UPDATE ON emd.personas_tbl TO db_recepcion;
GRANT SELECT, INSERT, UPDATE ON emd.pacientes_tbl TO db_recepcion;

-- Si existe tabla de citas (agregar cuando se cree)
-- GRANT SELECT, INSERT, UPDATE ON emd.citas_tbl TO db_recepcion;

-- Solo lectura de consultas (para verificar citas)
GRANT SELECT ON emd.consultas_tbl TO db_recepcion;

-- Secuencias necesarias
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA emd TO db_recepcion;

-- 6. Permisos para ENFERMERÍA (db_enfermeria) - Signos vitales
-- =====================================================

-- Lectura de catálogos
GRANT SELECT ON ALL TABLES IN SCHEMA catalogos TO db_enfermeria;
GRANT SELECT ON ALL TABLES IN SCHEMA catalogosdgis TO db_enfermeria;

-- Acceso completo a signos vitales
GRANT SELECT, INSERT, UPDATE ON emd.registro_signos_vitales_tbl TO db_enfermeria;

-- Lectura de pacientes (para identificar al paciente)
GRANT SELECT ON emd.personas_tbl TO db_enfermeria;
GRANT SELECT ON emd.pacientes_tbl TO db_enfermeria;

-- Secuencias necesarias
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA emd TO db_enfermeria;

-- 7. Permisos para CONSULTA/LECTURA (db_consulta) - Solo lectura
-- =====================================================

-- Solo lectura en todos los esquemas
GRANT SELECT ON ALL TABLES IN SCHEMA emd TO db_consulta;
GRANT SELECT ON ALL TABLES IN SCHEMA catalogos TO db_consulta;
GRANT SELECT ON ALL TABLES IN SCHEMA catalogosdgis TO db_consulta;
GRANT SELECT ON ALL TABLES IN SCHEMA adminemd TO db_consulta;

-- 8. Políticas de seguridad adicionales (Row Level Security - opcional)
-- =====================================================

-- Ejemplo: Los médicos solo pueden ver sus propias consultas
/*
ALTER TABLE emd.consultas_tbl ENABLE ROW LEVEL SECURITY;

CREATE POLICY medico_consulta_policy ON emd.consultas_tbl
    FOR ALL
    TO db_medico
    USING (fk_medico = current_user_id());
*/

-- 9. Verificación de permisos
-- =====================================================

-- Ver roles creados
SELECT rolname, rolcanlogin, rolsuper 
FROM pg_roles 
WHERE rolname LIKE 'db_%'
ORDER BY rolname;

-- Ver permisos por rol (ejemplo para médico)
SELECT 
    grantee, 
    table_schema, 
    table_name, 
    privilege_type
FROM information_schema.role_table_grants
WHERE grantee = 'db_medico'
ORDER BY table_schema, table_name;
