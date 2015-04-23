radarworkx.com rtlsdr for android
=======================================

Open source library used by our apps on Android.

android-rtlsdr is a forked version of the bkhall/android-rtlsdr project, hosted on github.
Initially we were using the pre-compiled binaries of librtlsdr and libusb, incorporating some hacks to get this running with JNI and the native usb drivers for java on Android. Unfortunately this is not stable and sometimes it runs into deadlocks outside our code. Luckily there exists native java code for the same purpose in bkhall/android-rtlsdr, but it contains errors and missing files as of April 2015 that are reconstructed in this forking project.
This one should be compilable and usable out of the box, when imported as Android project into Eclipe or Andro Studio.
Use RtlSdrSerialDriver just as in rtl_adsb.c of librtlsdr
for your own project.

See it working in radarworkx.com android applications!

