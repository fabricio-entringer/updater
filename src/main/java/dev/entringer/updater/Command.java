package dev.entringer.updater;

import dev.entringer.updater.config.ConfigProperties;
import dev.entringer.updater.file.FileService;
import dev.entringer.updater.rest.Release;
import dev.entringer.updater.rest.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.ArrayList;

@ShellComponent
public class Command {
    ReleaseService releaseService;
    FileService fileService;
    ForceQuit forceQuit;
    ConfigProperties configProperties;


    public Command(ReleaseService releaseService, FileService fileService, ForceQuit forceQuit, ConfigProperties configProperties) {
        this.releaseService = releaseService;
        this.fileService = fileService;
        this.forceQuit = forceQuit;
        this.configProperties = configProperties;
    }

    @ShellMethod(value = "Check the remote repository for new version.", key = "check")
    public String apiList() throws IOException {
        Release release = releaseService.getLatestVersionAvailable();
        LocalDateTime fileDate = fileService.getFileCreateDate("C:\\projects\\updater\\updater\\target\\updater-0.0.1-SNAPSHOT.jar");
        String result = "You are using the latest version. " + release.getName();
        if (fileDate.isBefore(release.getPublished_at())) {
            result = "New version available. " + release.getName() + System.lineSeparator() + "Please execute the command <update> to upgrade";
        }
        return result;
    }

    @ShellMethod(value = "Update the file with the latest version downloading from repository", key = "update")
    public void update() throws IOException, URISyntaxException {
        Release release = releaseService.getLatestVersionAvailable();
        fileService.downloadUsingNIO(release.getAssets().get(0).getBrowser_download_url(), "C:\\projects\\updater\\updater\\target\\updater-0.0.1-SNAPSHOT.jar");
        System.out.println("System updated successfully with version: " + release.getName());
        System.out.println("Closing the application. Please open it manually.");
        forceQuit.exit();
    }

    // https://stackoverflow.com/questions/49770449/select-from-a-small-amount-of-options-in-spring-shell

}
