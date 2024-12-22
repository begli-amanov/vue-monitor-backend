package de.togares.vue_monitor.services.core.business;

import de.togares.vue_monitor.services.api.data.License;
import de.togares.vue_monitor.services.core.model.LicenseEntity;
import de.togares.vue_monitor.services.core.repository.LicenseRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class LicenseUpserter {

    private LicenseFinder finder;

    private LicenseRepository repository;

    public LicenseUpserter(LicenseFinder finder, LicenseRepository repository) {
        this.finder = finder;
        this.repository = repository;
    }

    @Transactional
    public LicenseEntity upsertLicense(License newState) {
        if (newState.getId() == null) {
            return saveNewLicense(newState);
        } else if (finder.getById(newState.getId()).isEmpty()) {
            // TODO
           throw new RuntimeException("License ID was not null but not found in the database. It must have been deleted in the mean time");
        }

        return updateEntity(newState);
    }

    private LicenseEntity saveNewLicense(License license) {
        LicenseEntity entity = (LicenseEntity) license.copyTo(new LicenseEntity());
        return repository.save(entity);
    }

    private LicenseEntity updateEntity(License newData) {
        LicenseEntity licenseEntity = (LicenseEntity) newData.copyTo(new LicenseEntity(newData.getId()));
        return repository.save(licenseEntity);
    }

}
