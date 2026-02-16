package com.alomora.emd2025.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

/**
 * Configuración de seguridad del sistema EMD2025
 * Implementa seguridad por capas: roles funcionales del sistema
 * 
 * Roles funcionales:
 * - ADMINISTRADOR: reportes y gestión de usuarios
 * - MEDICO: consultas y diagnósticos
 * - RECEPCION: registrar pacientes y citas
 * - ENFERMERIA: signos vitales
 * - ARCHIVO: solo lectura
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    /**
     * Configuración del filtro de seguridad HTTP
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(AbstractHttpConfigurer::disable)
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
            .sessionManagement(session -> 
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                // Endpoints públicos (Swagger y documentación)
                .requestMatchers(
                    "/swagger-ui/**",
                    "/v3/api-docs/**",
                    "/swagger-resources/**",
                    "/webjars/**",
                    "/actuator/**"
                ).permitAll()
                
                // Endpoints de catálogos (lectura pública para formularios)
                .requestMatchers("/api/catalogos/**").permitAll()
                .requestMatchers("/api/catalogosdgis/**").permitAll()
                
                // Endpoints protegidos por rol
                .requestMatchers("/api/emd/personas/**").hasAnyRole("RECEPCION", "ADMINISTRADOR", "MEDICO")
                .requestMatchers("/api/emd/pacientes/**").hasAnyRole("RECEPCION", "ADMINISTRADOR", "MEDICO")
                .requestMatchers("/api/emd/consultas/**").hasAnyRole("MEDICO", "ADMINISTRADOR")
                .requestMatchers("/api/emd/diagnosticos/**").hasAnyRole("MEDICO", "ADMINISTRADOR")
                .requestMatchers("/api/emd/signos-vitales/**").hasAnyRole("ENFERMERIA", "ADMINISTRADOR", "MEDICO")
                .requestMatchers("/api/emd/soap/**").hasAnyRole("MEDICO", "ADMINISTRADOR")
                
                // Endpoints de administración
                .requestMatchers("/api/admin/**").hasRole("ADMINISTRADOR")
                
                // Endpoints de reportes (solo lectura)
                .requestMatchers("/api/reportes/**").hasAnyRole("ADMINISTRADOR", "ARCHIVO")
                
                // Cualquier otro endpoint requiere autenticación
                .anyRequest().authenticated()
            )
            .httpBasic(httpBasic -> {});

        return http.build();
    }

    /**
     * Configuración CORS
     */
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:3000", "http://localhost:4200"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.setAllowCredentials(true);
        
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    /**
     * Codificador de contraseñas
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        List<UserDetails> users = Arrays.asList(
            // Administrador
            User.builder()
                .username("admin")
                .password(passwordEncoder().encode("admin123"))
                .roles("ADMINISTRADOR")
                .build(),
            
            // Médico
            User.builder()
                .username("medico")
                .password(passwordEncoder().encode("medico123"))
                .roles("MEDICO")
                .build(),
            
            // Recepción
            User.builder()
                .username("recepcion")
                .password(passwordEncoder().encode("recepcion123"))
                .roles("RECEPCION")
                .build(),
            
            // Enfermería
            User.builder()
                .username("enfermeria")
                .password(passwordEncoder().encode("enfermeria123"))
                .roles("ENFERMERIA")
                .build(),
            
            // Archivo/Administrativo
            User.builder()
                .username("archivo")
                .password(passwordEncoder().encode("archivo123"))
                .roles("ARCHIVO")
                .build()
        );

        return new InMemoryUserDetailsManager(users);
    }
}
