package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})
public interface BrowserStackConfig extends Config{

  @Key("login")
  String getLogin();

  @Key("password")
  String getPassword();

  @Key("app")
  String getApp();

  @Key("deviceName")
  String getDeviceName();

  @Key("osVersion")
  String getOsVersion();

}


