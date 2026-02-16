package com.alomora.emd2025.config;

/**
 * Constantes de roles del sistema EMD2025
 * 
 * Estos roles corresponden a los perfiles funcionales del sistema:
 * - ADMINISTRADOR: reportes y gestión de usuarios
 * - MEDICO: consultas y diagnósticos
 * - RECEPCION: registrar pacientes y citas
 * - ENFERMERIA: signos vitales
 * - ARCHIVO: solo lectura
 * 
 * Estos roles se mapean a los roles de base de datos:
 * - ADMINISTRADOR -> db_admin
 * - MEDICO -> db_medico
 * - RECEPCION -> db_recepcion
 * - ENFERMERIA -> db_enfermeria
 * - ARCHIVO -> db_consulta
 */
public class RoleConstants {
    
    public static final String ROLE_ADMINISTRADOR = "ROLE_ADMINISTRADOR";
    public static final String ROLE_MEDICO = "ROLE_MEDICO";
    public static final String ROLE_RECEPCION = "ROLE_RECEPCION";
    public static final String ROLE_ENFERMERIA = "ROLE_ENFERMERIA";
    public static final String ROLE_ARCHIVO = "ROLE_ARCHIVO";
    
    // Mapeo de roles de aplicación a roles de BD
    public static final String DB_ROLE_ADMIN = "db_admin";
    public static final String DB_ROLE_MEDICO = "db_medico";
    public static final String DB_ROLE_RECEPCION = "db_recepcion";
    public static final String DB_ROLE_ENFERMERIA = "db_enfermeria";
    public static final String DB_ROLE_CONSULTA = "db_consulta";
    
    private RoleConstants() {
    }
}
