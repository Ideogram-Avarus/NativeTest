package com.hellomodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = HelloModule.NAME)
public class HelloModule extends HelloModuleSpec {

  public static final String NAME = "HelloModule";

  public HelloModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String hello(String name) {
    return "Hello, " + name + "!";
  }
}