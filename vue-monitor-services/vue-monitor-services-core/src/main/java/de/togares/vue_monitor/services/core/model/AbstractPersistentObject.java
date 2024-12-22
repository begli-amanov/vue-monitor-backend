package de.togares.vue_monitor.services.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

@MappedSuperclass
public class AbstractPersistentObject {

    @Column(name = "creation_date")
    protected LocalDateTime creationDate;

    @Column(name = "modification_date")
    protected LocalDateTime modificationDate;

    @PrePersist
    public void prePersist() {
        this.creationDate = LocalDateTime.now();
    }

    @PreUpdate
    public void beforeUpdate() {
        this.modificationDate = LocalDateTime.now();
    }
}
