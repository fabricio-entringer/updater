package dev.entringer.updater;

import dev.entringer.updater.config.ConfigProperties;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Config {
    ConfigProperties config;

    public Config(ConfigProperties config) {
        this.config = config;
    }

    @ShellMethod(key = "config list", value = "List all custom configuration.")
    public void listConfig() {
        config.getProfile().forEach(item -> System.out.println(item.getName()));
    }

}
