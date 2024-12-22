package de.togares.vue_monitor.services.api.data;

public enum LicenseStatus {

    VALID(2),
    EXPIRING_SOON(1),
    EXPIRED(-1);

    private final int value;
    LicenseStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static LicenseStatus fromValue(int value) {
        for (LicenseStatus licenseStatus : LicenseStatus.values()) {
            if (licenseStatus.getValue() == value) {
                return licenseStatus;
            }
        }
        return null;
    }
}
