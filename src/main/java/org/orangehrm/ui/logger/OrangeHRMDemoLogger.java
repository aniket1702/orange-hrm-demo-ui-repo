package org.orangehrm.ui.logger;

import org.orangehrm.ui.enums.loggers.LogType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Consumer;

public final  class OrangeHRMDemoLogger {
    private OrangeHRMDemoLogger(){};

    private static final Consumer<String> PASS = LogManager::pass;
    private static final Consumer<String> FAIL = LogManager::fail;
    private static final Consumer<String> SKIP = LogManager::warn;
    private static final Consumer<String> WARN = LogManager::warn;
    private static final Consumer<String> TRACE = LogManager::trace;
    private static final Consumer<String> FATAL = LogManager::fatal;

    private static final Map<LogType,Consumer<String>> MAP=new EnumMap<>(LogType.class);

    static {
        MAP.put(LogType.PASS, PASS);
        MAP.put(LogType.FAIL, FAIL);
        MAP.put(LogType.SKIP, SKIP);
        MAP.put(LogType.WARN, WARN);
        MAP.put(LogType.TRACE, TRACE);
        MAP.put(LogType.INFO, FATAL);
    }

    public static void log(LogType status, String message) {
        MAP.get(status).accept(message);
    }

}
