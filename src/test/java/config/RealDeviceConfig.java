package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:realDevice.properties"
})
public interface RealDeviceConfig extends Config {

  @Key("platformName")
  String platformName();

  @Key("deviceName")
  String deviceName();

  @Key("osVersion")
  String osVersion();

}
