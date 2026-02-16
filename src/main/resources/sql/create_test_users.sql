-- =====================================================
-- Script para crear usuarios de prueba en la base de datos
-- Sistema EMD2025
-- =====================================================

-- 1. Verificar si existe personal, si no, crear uno genérico
-- =====================================================

-- Crear un registro de personal genérico si no existe
DO $$
DECLARE
    personal_id INTEGER;
BEGIN
    -- Intentar obtener un personal existente
    SELECT id_personal INTO personal_id 
    FROM adminemd.personal_salud_tbl 
    LIMIT 1;
    
    -- Si no existe, crear uno genérico
    IF personal_id IS NULL THEN
        -- Primero necesitamos una persona en emd.personas_tbl
        INSERT INTO emd.personas_tbl (
            activo_persona,
            nombres_persona,
            primer_apellido_persona,
            curp_persona,
            fecha_nacimiento_persona,
            fk_pais_nac,
            fk_entidad_nac,
            fk_sexo_curp
        ) VALUES (
            1,
            'Sistema',
            'Administrador',
            'SIST000000HDFXXX00',
            '1990-01-01',
            (SELECT id_pais FROM catalogosdgis.pais_ctl LIMIT 1),
            (SELECT catalog_key FROM catalogosdgis.entidad_federativa_ctl LIMIT 1),
            (SELECT catalog_key FROM catalogosdgis.sexo_ctl LIMIT 1)
        ) RETURNING id_persona INTO personal_id;
        
        -- Crear personal de salud
        INSERT INTO adminemd.personal_salud_tbl (
            activo_personal,
            fk_persona,
            rfc_personal_salud,
            matricula
        ) VALUES (
            1,
            personal_id,
            'SIST000000XXX',
            'MAT001'
        ) RETURNING id_personal INTO personal_id;
    END IF;
END $$;

-- 2. Crear usuarios de prueba
-- =====================================================

-- Usuario Administrador
INSERT INTO adminemd.usuarios_tbl (
    activo_usuario,
    nombre_usuario,
    contrasenia_usuario,
    fk_personal_usuario,
    es_inicial,
    cuenta_no_bloqueada,
    intentos,
    fecha_registro
)
SELECT 
    1,
    'admin',
    'admin123',
    id_personal,
    false,
    true,
    0,
    CURRENT_DATE
FROM adminemd.personal_salud_tbl
LIMIT 1
ON CONFLICT (nombre_usuario) DO NOTHING;

-- Usuario Médico
INSERT INTO adminemd.usuarios_tbl (
    activo_usuario,
    nombre_usuario,
    contrasenia_usuario,
    fk_personal_usuario,
    es_inicial,
    cuenta_no_bloqueada,
    intentos,
    fecha_registro
)
SELECT 
    1,
    'medico',
    'medico123',
    id_personal,
    false,
    true,
    0,
    CURRENT_DATE
FROM adminemd.personal_salud_tbl
LIMIT 1
ON CONFLICT (nombre_usuario) DO NOTHING;

-- Usuario Recepción
INSERT INTO adminemd.usuarios_tbl (
    activo_usuario,
    nombre_usuario,
    contrasenia_usuario,
    fk_personal_usuario,
    es_inicial,
    cuenta_no_bloqueada,
    intentos,
    fecha_registro
)
SELECT 
    1,
    'recepcion',
    'recepcion123',
    id_personal,
    false,
    true,
    0,
    CURRENT_DATE
FROM adminemd.personal_salud_tbl
LIMIT 1
ON CONFLICT (nombre_usuario) DO NOTHING;

-- Usuario Enfermería
INSERT INTO adminemd.usuarios_tbl (
    activo_usuario,
    nombre_usuario,
    contrasenia_usuario,
    fk_personal_usuario,
    es_inicial,
    cuenta_no_bloqueada,
    intentos,
    fecha_registro
)
SELECT 
    1,
    'enfermeria',
    'enfermeria123',
    id_personal,
    false,
    true,
    0,
    CURRENT_DATE
FROM adminemd.personal_salud_tbl
LIMIT 1
ON CONFLICT (nombre_usuario) DO NOTHING;

-- Usuario Archivo
INSERT INTO adminemd.usuarios_tbl (
    activo_usuario,
    nombre_usuario,
    contrasenia_usuario,
    fk_personal_usuario,
    es_inicial,
    cuenta_no_bloqueada,
    intentos,
    fecha_registro
)
SELECT 
    1,
    'archivo',
    'archivo123',
    id_personal,
    false,
    true,
    0,
    CURRENT_DATE
FROM adminemd.personal_salud_tbl
LIMIT 1
ON CONFLICT (nombre_usuario) DO NOTHING;

-- 3. Verificar usuarios creados
-- =====================================================

SELECT 
    id_usuario,
    nombre_usuario,
    activo_usuario,
    cuenta_no_bloqueada,
    fecha_registro
FROM adminemd.usuarios_tbl
WHERE nombre_usuario IN ('admin', 'medico', 'recepcion', 'enfermeria', 'archivo')
ORDER BY nombre_usuario;
