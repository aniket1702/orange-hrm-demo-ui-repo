package org.orangehrm.ui.configs;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory
{

    private ConfigFactory(){}

    public static ConfigReader getConfig()
    {
        return ConfigCache.getOrCreate(ConfigReader.class);
    }
}
