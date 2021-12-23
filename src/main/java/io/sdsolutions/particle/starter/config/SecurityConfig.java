package io.sdsolutions.particle.starter.config;

import io.sdsolutions.particle.security.config.impl.PassThroughSecurityConfiguration;
import io.sdsolutions.particle.security.services.SecurityService;
import io.sdsolutions.particle.security.services.impl.SecurityServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends PassThroughSecurityConfiguration {

    @Bean
    public SecurityService securityService() {
        return new SecurityServiceImpl();
    }

}
