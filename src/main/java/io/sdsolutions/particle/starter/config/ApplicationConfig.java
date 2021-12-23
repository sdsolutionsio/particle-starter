package io.sdsolutions.particle.starter.config;

import java.util.ArrayList;
import java.util.List;

import io.sdsolutions.particle.core.config.MasterApplicationConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableWebMvc
@EnableSwagger2
@EnableCaching
public class ApplicationConfig extends MasterApplicationConfig {

    private static final String DOZER_MAPPING_FILE = "dozerBeanMapping.xml";

    protected List<String> getMappingFiles() {
        List<String> files = new ArrayList<>();
        files.add(DOZER_MAPPING_FILE);
        return files;
    }

}
