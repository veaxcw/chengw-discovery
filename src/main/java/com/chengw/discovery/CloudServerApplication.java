package com.chengw.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author veax
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CloudServerApplication.class, args);
        final String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        System.out.println("[----------------------------------------------]");
        System.out.println("> service started: "+ Arrays.toString(activeProfiles));
        System.out.println("[----------------------------------------------]");
    }

}
