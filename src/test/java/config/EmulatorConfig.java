package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:emulator.properties"
})
public interface EmulatorConfig extends Config {
  @Key("platformNameEm")
  String platformNameEm();

  @Key("deviceNameEm")
  String deviceNameEm();

  @Key("osVersionEm")
  String osVersionEm();

}

