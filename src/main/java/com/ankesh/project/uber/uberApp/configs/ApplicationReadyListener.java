package com.ankesh.project.uber.uberApp.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {


        private static final String ANSI_BLUE = "\u001B[34m";
        private static final String ANSI_RED = "\u001B[31m";
        private static final String ANSI_RED_CYAN_BG = "\u001B[1;3;38;5;196m";
        private static final String ANSI_GREEN = "\u001B[32m";
        private static final String ANSI_YELLOW = "\u001B[33m";
        private static final String ANSI_RESET = "\u001B[0m";

        @Value("${server.port}")
        private int serverPort;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        var time = event.getTimeTaken().toSeconds();
        var swaggerUrl = "http://localhost:" + serverPort + "/swagger-ui/index.html#/";
        var localUrl = "http://localhost:" + serverPort;
        var banner = String.join("\n",
                ANSI_RED_CYAN_BG +
                        "-------------------------------------------------------------------------------------------------",
                "|       |",
                "|    Developed By Ankesh       |",
                "|   Started in "+ time + " sec         |",
                "|       URL - " + localUrl + "   |",
                "|     Swagger UI - " + swaggerUrl +  "    |",
                "|                       |",
                "        -------------------------------------------------------------------------------------------------",
                ANSI_RESET
        );
        System.out.println(banner);
    }
}
