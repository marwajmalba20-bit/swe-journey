package com.marwa.my.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // نوقف هذا الحماية مؤقتاً لأننا نبني API
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/hello").permitAll() // رابط الترحيب مفتوح للجميع
                .anyRequest().authenticated() // أي رابط آخر يحتاج تسجيل دخول
            )
            .httpBasic(org.springframework.security.config.Customizer.withDefaults()); // نستخدم Basic Auth
            
        return http.build();
    }
}