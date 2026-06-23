/**
 * Spring Security Configuration
 *
 * Purpose:
 * - Defines application security rules.
 * - Controls which APIs are public and which require authentication.
 * - Disables CSRF for REST APIs.
 * - Uses STATELESS session management (required for JWT-based authentication).
 * - Allows access to Swagger documentation without login.
 * - Protects all other endpoints by requiring authentication.
 */

package com.onecart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception { 
                http.csrf(csrf -> csrf.disable())

                .sessionManagement(session -> session.sessionCreationPolicy(
                        SessionCreationPolicy.STATELESS))

                .authorizeHttpRequests(auth -> auth

                        // Swagger
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/swagger-ui.html",
                                "/v3/api-docs/**")
                        .permitAll()

                        // Public APIs
                        .requestMatchers(
                                "/api/v1/auth/**")
                        .permitAll()

                        // Protected APIs
                        .anyRequest().authenticated())

                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}