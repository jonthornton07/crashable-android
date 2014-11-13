package com.crashable.demo;

import android.app.Application;

import com.crashable.handlers.CrashableExceptionHandler;

/**
 * Simple demo application that will register the custom error handler at run time.
 * @author jonthornton
 *
 */
public class DemoApplication extends Application{

	@Override
	public void onCreate() {
		super.onCreate();
		//Register the CrashableExceptionHandler so that it can catch the uncaught exceptions
		Thread.setDefaultUncaughtExceptionHandler(new CrashableExceptionHandler());
	}

}
