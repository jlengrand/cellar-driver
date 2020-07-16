package nl.lengrand.cellar;

import nl.lengrand.cellar.utils.NativeUtils;

import java.io.IOException;

public class Dht11Driver {

    static {
        try {
            NativeUtils.loadLibraryFromJar("/libs/raspberry/libdht11.so");
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public native void sayHello();

    public native float[] getTemperatureAndHumidity();
}