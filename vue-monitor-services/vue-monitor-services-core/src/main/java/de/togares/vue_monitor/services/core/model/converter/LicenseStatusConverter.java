package de.togares.vue_monitor.services.core.model.converter;

import de.togares.vue_monitor.services.api.data.LicenseStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class LicenseStatusConverter implements AttributeConverter<LicenseStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(LicenseStatus attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override
    public LicenseStatus convertToEntityAttribute(Integer dbData) {
        return LicenseStatus.fromValue(dbData);
    }
}
