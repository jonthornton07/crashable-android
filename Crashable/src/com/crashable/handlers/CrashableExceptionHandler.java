package com.crashable.handlers;

import java.lang.Thread.UncaughtExceptionHandler;

import android.util.Log;

/**
 * The CrashableErrorHandler can be used to catch any uncaught exception handlers, but must be registered on a thread.
 * To register the error handler on a thread, you should use the following in the on create of your application:
 *
 *  Thread.setDefaultUncaughtExceptionHandler(new CrashableErrorHandler());
 *
 *  Note:  This will not prevent your application from crashing, it should just be used to for logging the crash logs
 *  in some unique way.
 *
 * @author jonthornton
 *
 */
public class CrashableExceptionHandler implements UncaughtExceptionHandler{

	private static final String TAG = CrashableExceptionHandler.class.getCanonicalName();

	@Override
	public void uncaughtException(final Thread thread, final Throwable ex) {
		Log.i(TAG, "Exception Thrown.");
	}

}
