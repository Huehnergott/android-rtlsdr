package com.rtlsdr.android;

/**
 * Nearly the same as com.hoho.android.usbserial.driver.UsbId class. Most
 * probable a copy-paste version for customized usage.
 * 
 * @author Huehnergott
 *
 */
public class SdrUsbId {

	public static final int VENDOR_KYE = 0x0458;
	public static final int KYE_RTL2832_707F = 0x707f;

	public static final int VENDOR_RTL = 0x0bda;
	public static final int RTL_RTL2832 = 0x2832;
	public static final int RTL_RTL2838 = 0x2838;

	public static final int VENDOR_TERRATEC = 0x0ccd;
	public static final int TERRATEC_RTL2838_A9 = 0x00a9;
	public static final int TERRATEC_RTL2838_B3 = 0x00b3;
	public static final int TERRATEC_RTL2838_B4 = 0x00b4;
	public static final int TERRATEC_RTL2838_B7 = 0x00b7;
	public static final int TERRATEC_RTL2838_C6 = 0x00c6;
	public static final int TERRATEC_RTL2838_D3 = 0x00d3;
	public static final int TERRATEC_RTL2838_D7 = 0x00d7;
	public static final int TERRATEC_RTL2838_E0 = 0x00e0;
	public static final int TERRATEC_RTL2838_B5 = 0x00b5;
	public static final int TERRATEC_RTL2838_B8 = 0x00b8;
	public static final int TERRATEC_RTL2838_B9 = 0x00b9;
	public static final int TERRATEC_RTL2838_C0 = 0x00c0;

	public static final int VENDOR_COMPRO = 0x185b;
	public static final int COMPRO_620 = 0x0620;;
	public static final int COMPRO_650 = 0x0650;
	public static final int COMPRO_680 = 0x0680;

	public static final int VENDOR_AFATECH = 0x01b80;
	public static final int AFATECH_RTL2838_D393 = 0xd393;
	public static final int AFATECH_RTL2838_D394 = 0xd394;
	public static final int AFATECH_RTL2838_D395 = 0xd395;
	public static final int AFATECH_RTL2838_D396 = 0xd396;
	public static final int AFATECH_RTL2838_D397 = 0xd397;
	public static final int AFATECH_RTL2838_D398 = 0xd398;
	public static final int AFATECH_RTL2838_D39D = 0xd39d;
	public static final int AFATECH_RTL2838_D3A4 = 0xd3a4;

	public static final int VENDOR_DEXATEC = 0x01d19;
	public static final int DEXATEC_1101 = 0x1101;
	public static final int DEXATEC_1102 = 0x1102;
	public static final int DEXATEC_1103 = 0x1103;

	public static final int VENDOR_GTEK = 0x1f4d;
	public static final int GTEK_RTL2838_B803 = 0xb803;
	public static final int GTEK_RTL2838_C803 = 0xC803;
	public static final int GTEK_RTL2838_D286 = 0xd286;
	public static final int GTEK_RTL2838_D803 = 0xD803;

	public static final int VENDOR_FTDI = 0x0403;
	public static final int FTDI_FT232R = 0x6001;

	public static final int VENDOR_ATMEL = 0x03EB;
	public static final int ATMEL_LUFA_CDC_DEMO_APP = 0x2044;

	public static final int VENDOR_ARDUINO = 0x2341;
	public static final int ARDUINO_UNO = 0x0001;
	public static final int ARDUINO_MEGA_2560 = 0x0010;
	public static final int ARDUINO_SERIAL_ADAPTER = 0x003b;
	public static final int ARDUINO_MEGA_ADK = 0x003f;
	public static final int ARDUINO_MEGA_2560_R3 = 0x0042;
	public static final int ARDUINO_UNO_R3 = 0x0043;
	public static final int ARDUINO_MEGA_ADK_R3 = 0x0044;
	public static final int ARDUINO_SERIAL_ADAPTER_R3 = 0x0044;
	public static final int ARDUINO_LEONARDO = 0x8036;

	public static final int VENDOR_VAN_OOIJEN_TECH = 0x16c0;
	public static final int VAN_OOIJEN_TECH_TEENSYDUINO_SERIAL = 0x0483;

	public static final int VENDOR_LEAFLABS = 0x1eaf;
	public static final int LEAFLABS_MAPLE = 0x0004;

	public static final int VENDOR_SILAB = 0x10c4;
	public static final int SILAB_CP2102 = 0xea60;

	public static final int VENDOR_PROLIFIC = 0x067b;
	public static final int PROLIFIC_PL2303 = 0x2303;

	private SdrUsbId() {
		throw new IllegalAccessError("Non-instantiable class.");
	}
}
