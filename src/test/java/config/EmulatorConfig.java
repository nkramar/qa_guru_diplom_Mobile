package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:emulator.properties"
})
public interface EmulatorConfig extends Config {
  @Key("platformName")
  String getPlatformName();

  @Key("deviceName")
  String getDeviceName();

  @Key("osVersion")
  String getOsVersion();

}

