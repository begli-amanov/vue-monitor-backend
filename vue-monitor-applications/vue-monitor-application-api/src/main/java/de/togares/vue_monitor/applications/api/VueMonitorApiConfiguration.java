package de.togares.vue_monitor.applications.api;

import de.togares.vue_monitor.services.rest_api.VueMonitorRestApiConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        VueMonitorRestApiConfiguration.class
})
public class VueMonitorApiConfiguration {
}
