package com.hellomodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import androidx.annotation.NonNull;

public class HelloModule extends ReactContextBaseJavaModule implements TurboModule {

    public static final String NAME = "HelloModule";

    public HelloModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }

    // Your method (no @Override needed since no spec)
    public String hello(String name) {
        return "Hello, " + name + "!";
    }

    // Required by TurboModule - usually empty unless cleanup needed
    @Override
    public void invalidate() {
        // Optional: cleanup resources here
    }
}