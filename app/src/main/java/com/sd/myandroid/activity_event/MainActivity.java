package com.sd.myandroid.activity_event;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.sd.lib.eventact.observer.ActivityCreatedObserver;
import com.sd.lib.eventact.observer.ActivityDestroyedObserver;
import com.sd.lib.eventact.observer.ActivityPausedObserver;
import com.sd.lib.eventact.observer.ActivityResumedObserver;
import com.sd.lib.eventact.observer.ActivityStartedObserver;
import com.sd.lib.eventact.observer.ActivityStoppedObserver;

public class MainActivity extends BaseActivity
{
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        mActivityCreatedObserver.register();
        mActivityStartedObserver.register();
        mActivityResumedObserver.register();
        mActivityPausedObserver.register();
        mActivityStoppedObserver.register();
        mActivityDestroyedObserver.register();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private final ActivityCreatedObserver mActivityCreatedObserver = new ActivityCreatedObserver(this)
    {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState)
        {
            Log.i(TAG, "onActivityCreated");
        }
    };

    private final ActivityStartedObserver mActivityStartedObserver = new ActivityStartedObserver(this)
    {
        @Override
        public void onActivityStarted(Activity activity)
        {
            Log.i(TAG, "onActivityStarted");
        }
    };

    private final ActivityResumedObserver mActivityResumedObserver = new ActivityResumedObserver(this)
    {
        @Override
        public void onActivityResumed(Activity activity)
        {
            Log.i(TAG, "onActivityResumed");
        }
    };

    private final ActivityPausedObserver mActivityPausedObserver = new ActivityPausedObserver(this)
    {
        @Override
        public void onActivityPaused(Activity activity)
        {
            Log.i(TAG, "onActivityPaused");
        }
    };

    private final ActivityStoppedObserver mActivityStoppedObserver = new ActivityStoppedObserver(this)
    {
        @Override
        public void onActivityStopped(Activity activity)
        {
            Log.i(TAG, "onActivityStopped");
        }
    };

    private final ActivityDestroyedObserver mActivityDestroyedObserver = new ActivityDestroyedObserver(this)
    {
        @Override
        public void onActivityDestroyed(Activity activity)
        {
            Log.i(TAG, "onActivityDestroyed");
        }
    };
}
