package com.agiledeveloper;

public class RemoteFactory {
  public static Remote createRemoteForTV(TV tv) {
    return tv.getRemoteControl();
  }

  public static Remote createRemoteForFan(Fan fan) {
    return fan.getRemoteControl();
  }

  public static Remote createRemoteForGarage(Garage garage) {
    return garage.getRemoteControl();
  }
}
