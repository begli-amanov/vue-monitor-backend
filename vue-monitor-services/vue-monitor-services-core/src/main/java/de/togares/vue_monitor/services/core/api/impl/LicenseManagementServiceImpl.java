package de.togares.vue_monitor.services.core.api.impl;

import de.togares.vue_monitor.services.api.LicenseManagementService;
import de.togares.vue_monitor.services.api.data.License;
import de.togares.vue_monitor.services.api.data.LicenseData;
import de.togares.vue_monitor.services.core.business.LicenseDeleter;
import de.togares.vue_monitor.services.core.business.LicenseFinder;
import de.togares.vue_monitor.services.core.business.LicenseUpserter;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LicenseManagementServiceImpl implements LicenseManagementService {

    private LicenseFinder finder;
    private LicenseDeleter deleter;
    private LicenseUpserter upserter;

    public LicenseManagementServiceImpl(LicenseFinder finder, LicenseDeleter deleter, LicenseUpserter upserter) {
        this.finder = finder;
        this.deleter = deleter;
        this.upserter = upserter;
    }

    @Override
    public List<LicenseData> listLicenses() {
        return finder.listAllLicenses().stream()
                .map(entity -> (LicenseData) entity.copyTo(new LicenseData(entity.getId())))
                .toList();
    }

    @Override
    public LicenseData getLicense(UUID uuid) {
        return finder.getById(uuid)
                .map(entity -> (LicenseData) entity.copyTo(new LicenseData(entity.getId())))
                .orElse(null);
    }

    @Override
    public void saveLicense(License license) {
        upserter.upsertLicense(license);
    }

    @Override
    public void deleteLicense(License license) {
        deleter.deleteLicense(license);
    }

    @Override
    public void deleteAll(List<License> licenses) {
        deleter.deleteAll(licenses);
    }
}
