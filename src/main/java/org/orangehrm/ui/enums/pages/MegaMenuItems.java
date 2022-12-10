package org.orangehrm.ui.enums.pages;

public enum MegaMenuItems {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    RECRUITMENT("Recruitment"),
    MY_INFO("My Info"),
    PERFORMANCE("Performance"),
    DASHBOARD("Dashboard"),
    DIRECTORY("Directory"),
    MAINTENANCE("Maintenance"),
    BUZZ("Buzz");

    private final String megaMenuItemsNames;

    public String getName()
    {
        return megaMenuItemsNames.trim();
    }

    MegaMenuItems(String megaMenuItemsNames) {
        this.megaMenuItemsNames=megaMenuItemsNames;
    }
}
