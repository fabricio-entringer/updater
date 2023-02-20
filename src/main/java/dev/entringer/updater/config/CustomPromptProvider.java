package dev.entringer.updater.config;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class CustomPromptProvider implements PromptProvider {

    @Autowired
    private ConfigProperties config;

    @Override
    public AttributedString getPrompt() {
        if (config.getProfile().size() > 0) {
            return new AttributedString(config.getProfile().size() +" profiles:>",
                    AttributedStyle.BOLD.foreground(AttributedStyle.CYAN).background(AttributedStyle.RED));
        }
        else {
            return new AttributedString("profile-unknown:>",
                    AttributedStyle.BOLD.foreground(AttributedStyle.RED));
        }
    }

}
