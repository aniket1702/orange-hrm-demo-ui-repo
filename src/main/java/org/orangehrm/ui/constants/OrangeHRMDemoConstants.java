package org.orangehrm.ui.constants;

import org.orangehrm.ui.configs.ConfigFactory;

public final class OrangeHRMDemoConstants {
    private OrangeHRMDemoConstants(){}

    private static final String BASE_DIRECTORY=System.getProperty("user.dir");
    private static final String BROWSER= ConfigFactory.getConfig().browser();
    private static final String URL=ConfigFactory.getConfig().baseURL();
    private static final String LOG4J_PATH=BASE_DIRECTORY+"/src/main/resources/properties/log4j.properties";


    public static String getBrowser(){return BROWSER;}
    public static String getURL(){return URL;}
    public static String getLog4jPath(){return LOG4J_PATH;}
}
