package de.togares.vue_monitor.services.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public class UUIDBasedEntity extends AbstractPersistentObject {

    @Id
    @Column(name = "uuid", columnDefinition = "char(36)")
    protected UUID uuid;

}
