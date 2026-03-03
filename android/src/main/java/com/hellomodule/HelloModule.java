package com.hellomodule;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactApplicationContext;


public class HelloModule implements TurboModule {
  public static final String NAME = "HelloModule";

  private final ReactApplicationContext reactContext;

  public HelloModule(ReactApplicationContext context) {
      this.reactContext = context;
  }

  @Override
  public String hello(String name) {
    return "Hello, " + name + "!";
  }
}