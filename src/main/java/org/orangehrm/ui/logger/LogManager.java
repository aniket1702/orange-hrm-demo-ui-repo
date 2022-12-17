package org.orangehrm.ui.logger;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.orangehrm.ui.constants.OrangeHRMDemoConstants;

public final class LogManager {
    private LogManager(){}

    private static final Logger LOGGER=Logger.getLogger(OrangeHRMDemoLogger.class);

    public static void propertyConfigurator()
    {
        PropertyConfigurator.configure(OrangeHRMDemoConstants.getLog4jPath());
    }

    public static void pass(String message){LOGGER.info(message);}
    public static void fail(String message)
    {
        LOGGER.error(message);
    }
    public static void trace(String message)
    {
        LOGGER.trace(message);
    }
    public static void warn(String message) { LOGGER.warn(message); }

}
