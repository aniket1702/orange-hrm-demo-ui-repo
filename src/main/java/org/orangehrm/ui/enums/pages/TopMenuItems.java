package org.orangehrm.ui.enums.pages;

public enum TopMenuItems {
    USER_MANAGEMENT("User Management"),
    JOB("Job"),
    ORGANIZATION("Organization"),
    QUALIFICATIONS("Qualifications"),
    NATIONALITIES("Nationalities"),
    CORPORATE_BRANDING("Corporate Branding"),
    CONFIGURATION("Configuration");

    private final String topMenuItemsNames;

    public String getName()
    {
        return topMenuItemsNames.trim();
    }

    TopMenuItems(String topMenuItemsName) {
        this.topMenuItemsNames=topMenuItemsName;
    }
}
