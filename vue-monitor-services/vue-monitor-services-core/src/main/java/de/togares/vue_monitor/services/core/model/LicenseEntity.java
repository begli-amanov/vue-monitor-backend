package de.togares.vue_monitor.services.core.model;

import de.togares.vue_monitor.services.api.data.License;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "license")
public class LicenseEntity extends UUIDBasedEntity implements License.Mutable {

    private String name;

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
        return UUID.fromString(uuid);
    }
}
