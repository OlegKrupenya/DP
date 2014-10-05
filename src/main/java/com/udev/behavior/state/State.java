package com.udev.behavior.state;

/**
 * Created by Taipan on 05.10.2014.
 */
public interface State {
    void handle(Context context, String name);
}
