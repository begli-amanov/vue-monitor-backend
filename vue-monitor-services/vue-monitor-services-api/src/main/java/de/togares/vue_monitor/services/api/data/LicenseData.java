package de.togares.vue_monitor.services.api.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class LicenseData implements License.Mutable {

    private UUID referenceId;
    private String name;
    private String wbs;
    private String note;
    private LicenseVendor vendor;
    private LicenseManufacturer manufacturer;
    private BigDecimal price;
    private String po;
    private int quantity;
    private LicenseStatus status;
    private LocalDate expiryDate;


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

    @Override
    public UUID getId() {
        return referenceId;
    }

}
