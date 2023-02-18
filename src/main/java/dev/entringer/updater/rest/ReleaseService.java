package dev.entringer.updater.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReleaseService {

    public Release getLatestVersionAvailable() {
        var rest = new RestTemplate();
        var release = rest.getForObject("https://api.github.com/repos/fabricio-entringer/commons/releases/latest", Release.class);
        return release;
    }
}
