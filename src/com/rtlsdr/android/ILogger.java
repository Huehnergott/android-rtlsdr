package com.rtlsdr.android;

/**
 * Interface for logging calls. Replaces android default log.
 * 
 * @author Huehnergott
 *
 */
public interface ILogger {

	void log(String tag, String message);

	void logStat(String number, int value);
}
