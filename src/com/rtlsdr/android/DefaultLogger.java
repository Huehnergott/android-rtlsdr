package com.rtlsdr.android;

import android.util.Log;

/**
 * Standard android logger implementing our custom log interface. Implement your
 * own logger and use setLogger of SdrSerialDriver to write log to a different
 * place (file, screen, ...)
 * 
 * @author Huehnergott
 *
 */
public class DefaultLogger implements ILogger {

	@Override
	public void log(String tag, String message) {
		Log.e(tag, message);
	}

	@Override
	public void logStat(String key, int value) {
		// do nothing here
	}

}
