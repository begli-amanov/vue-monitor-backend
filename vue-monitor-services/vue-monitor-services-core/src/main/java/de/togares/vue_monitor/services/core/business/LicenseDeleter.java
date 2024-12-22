package de.togares.vue_monitor.services.core.business;

import de.togares.vue_monitor.services.api.data.License;
import de.togares.vue_monitor.services.core.repository.LicenseRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LicenseDeleter {

    private LicenseRepository repository;

    public LicenseDeleter(LicenseRepository repository) {
        this.repository = repository;
    }

    public void deleteLicense(License license) {
        repository.deleteById(license.getId());
    }

    public void deleteAll(List<License> licenses) {
        repository.deleteAllById(licenses.stream().map(License::getId).toList());
    }

}
