package dev.entringer.updater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.commands.Quit;

@ShellComponent
public class ForceQuit implements Quit.Command {

    @Autowired
    private ApplicationContext appContext;

    @ShellMethod(value = "Close the application", key = {"exit", "quit"})
    public void exit() {
        SpringApplication.exit(appContext);
        System.exit(0);
    }


}
