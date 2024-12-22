package de.togares.vue_monitor.services.core.business;

import de.togares.vue_monitor.services.core.model.LicenseEntity;
import de.togares.vue_monitor.services.core.repository.LicenseRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class LicenseFinder {

    private LicenseRepository repository;

    public LicenseFinder(LicenseRepository repository) {
        this.repository = repository;
    }

    public List<LicenseEntity> listAllLicenses() {
        return repository.findAll();
    }

    public Optional<LicenseEntity> getById(UUID id) {
        return repository.findById(id);
    }

}
