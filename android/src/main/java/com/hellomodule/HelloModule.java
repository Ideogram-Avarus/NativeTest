package com.hellomodule;

import com.facebook.fbreact.specs.NativeTestSpec;

public class HelloModule implements NativeTestSpec {
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