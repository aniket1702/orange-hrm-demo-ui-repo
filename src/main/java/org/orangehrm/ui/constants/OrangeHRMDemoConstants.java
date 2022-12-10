package org.orangehrm.ui.constants;

import org.orangehrm.ui.configs.ConfigFactory;

public final class OrangeHRMDemoConstants {
    private OrangeHRMDemoConstants(){}

    private static final String BASE_DIRECTORY=System.getProperty("user.dir");
    private static final String BROWSER= ConfigFactory.getConfig().browser();
    private static final String URL=ConfigFactory.getConfig().baseURL();


    public static String getBrowser(){return BROWSER;}
    public static String getURL(){return URL;}
}
