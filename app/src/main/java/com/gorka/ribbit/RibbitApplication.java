package com.gorka.ribbit;

import android.app.Application;

import com.gorka.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by padres on 1/06/15.
 */
public class RibbitApplication extends Application {

    public void onCreate() {
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "F814UjKC87VGw6ZudxIDp0sL4L9ixRuDCfITnexO", "BmqNO8HCkXYdjrn8OBiV3c4zrvlv3ZXpH4yMotMm");



        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
