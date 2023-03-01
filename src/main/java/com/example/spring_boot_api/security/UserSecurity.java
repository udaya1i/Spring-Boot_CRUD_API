package com.example.spring_boot_api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class UserSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeRequests(
                (req) -> req
                        .antMatchers("/alluser","/userwithid/{id}").permitAll()
                        .anyRequest().authenticated()

        ).formLogin();
        return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        User.UserBuilder user = User.withDefaultPasswordEncoder();
        UserDetails userA = user
                .username("testuser")
                .password("password")
                .roles("Normal")
                .build();
        return new InMemoryUserDetailsManager(userA);
    }
}
