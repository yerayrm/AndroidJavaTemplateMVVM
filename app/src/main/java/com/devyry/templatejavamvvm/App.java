package com.devyry.templatejavamvvm;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import androidx.annotation.NonNull;
import io.fabric.sdk.android.Fabric;
import timber.log.Timber;

/**
 * Created by Yeray Rguez on 01/03/2019.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Crashlytics reporting
        Fabric.with(this, new Crashlytics());

        // Timber Log initialization
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree() {
                @Override
                protected String createStackElementTag(@NonNull StackTraceElement element) {
                    return super.createStackElementTag(element) + ':' + element.getLineNumber();
                }
            });
        } else {
            //Timber.plant(new ReleaseTree());
        }

        // Firebase remote config
        //this.setupRemoteConfig();
    }


    /**
     * This method configure remote config to block old app versions
     */
    /*
    private void setupRemoteConfig() {
        Timber.i("Remote Config - Launch method");
        final FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();

        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setDeveloperModeEnabled(BuildConfig.DEBUG)
                .build();
        firebaseRemoteConfig.setConfigSettings(configSettings);

        Map<String, Object> remoteConfigDefaults = new HashMap<>();
        remoteConfigDefaults.put(ForceUpdateChecker.KEY_MIN_VERSION, ForceUpdateChecker.VALUE_MIN_VERSION);
        remoteConfigDefaults.put(ForceUpdateChecker.KEY_UPDATE_URL, ForceUpdateChecker.VALUE_UPDATE_URL);

        firebaseRemoteConfig.setDefaults(remoteConfigDefaults);

        firebaseRemoteConfig.fetch(3600).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Timber.i("Remote Config - Update remote config values");
                    firebaseRemoteConfig.activateFetched();
                } else {
                    Timber.i("Remote Config - Problem updating values");
                }
            }
        });
    }
    */


}

