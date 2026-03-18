package org.example.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin")
                .password(passwordEncoder().encode("admin123"))
                .roles("ADMIN")
                .build());
        manager.createUser(User.withUsername("user")
                .password(passwordEncoder().encode("user123"))
                .roles("USER")
                .build());
        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()

                .antMatchers("/login").permitAll()
                .antMatchers("/addStudent").hasRole("ADMIN")
                .antMatchers("/viewStudents").hasAnyRole("ADMIN","USER")
                .anyRequest().authenticated()

                .and()

                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/viewStudents")
                .permitAll()

                .and()

                .logout()
                .logoutSuccessUrl("/login")
                .permitAll()

                .and()

                .csrf().disable();

    }

}