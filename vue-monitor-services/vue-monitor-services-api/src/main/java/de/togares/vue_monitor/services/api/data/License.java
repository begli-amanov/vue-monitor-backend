package de.togares.vue_monitor.services.api.data;

import de.togares.vue_monitor.common.HasReferenceId;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public interface License extends HasReferenceId<UUID> {

    String getName();
    String getWbs();
    String getNote();
    LicenseVendor getVendor();
    LicenseManufacturer getManufacturer();
    BigDecimal getPrice();
    String getPo();
    int getQuantity();
    LicenseStatus getStatus();
    LocalDate getExpiryDate();

    default Mutable copyTo(Mutable other) {
        other.setName(getName());
        other.setWbs(getWbs());
        other.setNote(getNote());
        other.setVendor(getVendor());
        other.setManufacturer(getManufacturer());
        other.setPrice(getPrice());
        other.setPo(getPo());
        other.setQuantity(getQuantity());
        other.setStatus(getStatus());
        other.setExpiryDate(getExpiryDate());
        return other;
    }

    interface Mutable extends License {
        void setName(String name);
        void setWbs(String wbs);
        void setNote(String note);
        void setVendor(LicenseVendor vendor);
        void setManufacturer(LicenseManufacturer manufacturer);
        void setPrice(BigDecimal price);
        void setPo(String po);
        void setQuantity(int quantity);
        void setStatus(LicenseStatus status);
        void setExpiryDate(LocalDate expiryDate);
    }

}
