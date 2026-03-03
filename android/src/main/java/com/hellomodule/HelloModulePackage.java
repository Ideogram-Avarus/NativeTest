package com.hellomodule;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;

import java.util.HashMap;
import java.util.Map;

public class HelloModulePackage extends TurboReactPackage {

  @Override
  public Object getModule(String name, ReactApplicationContext context) {
    if (name.equals(HelloModule.NAME)) {
      return new HelloModule(context);
    }
    return null;
  }

  @Override
  public ReactModuleInfoProvider getReactModuleInfoProvider() {
    return () -> {
      Map<String, ReactModuleInfo> map = new HashMap<>();
      map.put(
        HelloModule.NAME,
        new ReactModuleInfo(
          HelloModule.NAME,
          HelloModule.NAME,
          false,
          false,
          true,
          false,
          true
        )
      );
      return map;
    };
  }
}
