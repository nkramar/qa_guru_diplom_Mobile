package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:realDevice.properties"
})
public interface RealDeviceConfig extends Config {

  @Key("platformName")
  String getPlatformName();

  @Key("deviceName")
  String getDeviceName();

  @Key("osVersion")
  String getOsVersion();

}
