package de.togares.vue_monitor.services.core.repository;

import de.togares.vue_monitor.services.core.model.LicenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LicenseRepository extends JpaRepository<LicenseEntity, UUID> {
}
