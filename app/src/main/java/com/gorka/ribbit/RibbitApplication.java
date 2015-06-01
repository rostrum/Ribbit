package com.gorka.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by padres on 1/06/15.
 */
public class RibbitApplication extends Application {

    public void onCreate() {
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "F814UjKC87VGw6ZudxIDp0sL4L9ixRuDCfITnexO", "BmqNO8HCkXYdjrn8OBiV3c4zrvlv3ZXpH4yMotMm");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }

}
