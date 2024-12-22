package de.togares.vue_monitor.applications.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(VueMonitorApiConfiguration.class)
public class VueMonitorApiApplication extends SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueMonitorApiApplication.class, args);
    }

}
