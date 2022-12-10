package org.orangehrm.ui.enums.pages;

public enum SubMenuItems {

    /* USER MANAGEMENT */
    USERS("Users"),

    /* JOB */
    JOB_TITLES("Job Titles"),
    PAY_GRADES("Pay Grades"),
    EMPLOYMENT_STATUS("Employment Status"),
    JOB_CATEGORIES("Job Categories"),
    WORK_SHIFTS("Work Shifts"),

    /* ORGANIZATIONS */
    GENERAL_INFORMATION("General Information"),
    LOCATIONS("Locations"),
    STRUCTURE("Structure"),

    /* QUALIFICATIONS */
    SKILLS("Skills"),
    EDUCATION("Education"),
    LICENSES("Licenses"),
    LANGUAGES("Languages"),
    MEMBERSHIPS("Memberships"),

    /* CONFIGURATIONS */
    EMAIL_CONFIGURATION("Email Configuration"),
    EMAIL_SUBSCRIPTIONS("Email Subscriptions"),
    LOCALIZATION("Localization"),
    LANGUAGE_PACKAGES("Language Packages"),
    MODULES("Modules"),
    SOCIAL_MEDIA_AUTHENTICATION("Social Media Authentication"),
    REGISTER_OAUTH_CLIENT("Register OAuth Client"),
    LDAP_CONFIGURATION("LDAP Configuration");



    private final String subMenuItems;

    public String getName()
    {
        return subMenuItems.trim();
    }

    SubMenuItems(String subMenuItems) {
        this.subMenuItems=subMenuItems;
    }
}
