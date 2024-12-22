package de.togares.vue_monitor.services.api.data;

import de.togares.vue_monitor.common.HasReferenceId;

import java.util.UUID;

public interface License extends HasReferenceId<UUID> {

    String getName();

    default Mutable copyTo(Mutable other) {
        other.setName(getName());
        return other;
    }

    interface Mutable extends License {
        void setName(String name);
    }

}
