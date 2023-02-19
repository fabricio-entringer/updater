package dev.entringer.updater;

import dev.entringer.updater.config.ConfigProperties;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({ConfigProperties.class, CustomProperties.class})
public class UpdaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpdaterApplication.class, args);
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 0;
    }

}
