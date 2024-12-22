package de.togares.vue_monitor.services.api;

import de.togares.vue_monitor.services.api.data.License;
import de.togares.vue_monitor.services.api.data.LicenseData;

import java.util.List;
import java.util.UUID;

public interface LicenseManagementService {

    List<LicenseData> listLicenses();

    LicenseData getLicense(UUID uuid);

    void saveLicense(License license);

    void deleteLicense(License license);

    void deleteAll(List<License> licenses);

}
