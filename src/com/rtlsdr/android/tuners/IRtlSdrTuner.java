package com.rtlsdr.android.tuners;

import java.io.IOException;

/**
 * Interface for RtlSdr capable tuners.
 * 
 * @author Huehnergott
 *
 */
public interface IRtlSdrTuner {
	int exit(int param) throws IOException;

	int init(int param) throws IOException;

	int set_bw(int param, int bw /* Hz */) throws IOException;

	int set_freq(int param, long freq /* Hz */) throws IOException;

	int set_gain(int param, int gain /* tenth dB */) throws IOException;

	int set_gain_mode(int param, boolean manual) throws IOException;

	int set_if_gain(int param, int stage, int gain /* tenth dB */) throws IOException;
}
