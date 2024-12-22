package de.togares.vue_monitor.services.api.data;

import java.util.UUID;

public class LicenseData implements License.Mutable {

    private UUID referenceId;
    private String name;

    public LicenseData() {
    }

    public LicenseData(UUID referenceId) {
        this.referenceId = referenceId;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public UUID getId() {
        return referenceId;
    }

}
