package de.togares.vue_monitor.services.core.model;

import de.togares.vue_monitor.services.api.data.License;
import de.togares.vue_monitor.services.api.data.LicenseManufacturer;
import de.togares.vue_monitor.services.api.data.LicenseStatus;
import de.togares.vue_monitor.services.api.data.LicenseVendor;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "license")
public class LicenseEntity extends UUIDBasedEntity implements License.Mutable {

    @Column(name = "name")
    private String name;

    @Column(name = "wbs")
    private String wbs;

    @Lob
    @Column(name = "note")
    private String note;

    // why does liquibase generate type="ENUM" when columnDefinition is not defined?
    @Enumerated(EnumType.STRING)
    @Column(name = "vendor", nullable = false, columnDefinition = "varchar(255)")
    private LicenseVendor vendor;

    @Enumerated(EnumType.STRING)
    @Column(name = "manufacturer", nullable = false, columnDefinition = "varchar(255)")
    private LicenseManufacturer manufacturer;

    @Column(name = "unit_price")
    private BigDecimal price;

    @Column(name = "po")
    private String po;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "status", nullable = false)
    private LicenseStatus status;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    public LicenseEntity() {
    }

    public LicenseEntity(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public UUID getId() {
        return uuid;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public void setVendor(LicenseVendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public void setManufacturer(LicenseManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public void setPo(String po) {
        this.po = po;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void setStatus(LicenseStatus status) {
        this.status = status;
    }

    @Override
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getWbs() {
        return wbs;
    }

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public LicenseVendor getVendor() {
        return vendor;
    }

    @Override
    public LicenseManufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getPo() {
        return po;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public LicenseStatus getStatus() {
        return status;
    }

    @Override
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
