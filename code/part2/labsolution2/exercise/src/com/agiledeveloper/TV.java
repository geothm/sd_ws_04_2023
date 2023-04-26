package com.agiledeveloper;

public class TV {
  private int volume = 1;

  public int getVolume() {
    return volume;
  }

  public void setVolume(int value) {
    volume = value;
  }

  public Remote getRemoteControl() {
    return new Remote() {
      @Override
      public void up() {
        volume++;
      }

      @Override
      public void down() {
        volume--;
      }
    };
  }
}
