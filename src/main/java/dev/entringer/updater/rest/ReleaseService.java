package dev.entringer.updater.rest;

import dev.entringer.updater.config.ConfigProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReleaseService {

    ConfigProperties configProperties;

    public ReleaseService(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    public Release getLatestVersionAvailable() {
        var rest = new RestTemplate();
        return rest.getForObject(configProperties.getRepository() + "/releases/latest", Release.class);
    }
}
