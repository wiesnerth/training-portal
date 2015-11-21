package de.wiesner.trainingsplan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wiesner on 21.11.15.
 */
@ComponentScan
@EnableAutoConfiguration
public class TrainingsplanWebApp {

    public static void main(String[] args) {
        SpringApplication.run(TrainingsplanWebApp.class,args);
    }
}
