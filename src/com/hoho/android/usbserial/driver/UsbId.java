/* Copyright 2011-2013 Google Inc.
 * Copyright 2013 mike wakerly <opensource@hoho.com>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * Project home page: https://github.com/mik3y/usb-serial-for-android
 */

package com.hoho.android.usbserial.driver;

/**
 * Registry of USB vendor/product ID constants.
 * 
 * Culled from various sources; see <a
 * href="http://www.linux-usb.org/usb.ids">usb.ids</a> for one listing.
 * 
 * @author mike wakerly (opensource@hoho.com)
 */
public final class UsbId {

	public static final int VENDOR_FTDI = 0x0403;
	public static final int FTDI_FT232R = 0x6001;
	public static final int FTDI_FT231X = 0x6015;

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

	public static final int VENDOR_SILABS = 0x10c4;
	public static final int SILABS_CP2102 = 0xea60;
	public static final int SILABS_CP2105 = 0xea70;
	public static final int SILABS_CP2108 = 0xea71;
	public static final int SILABS_CP2110 = 0xea80;

	public static final int VENDOR_PROLIFIC = 0x067b;
	public static final int PROLIFIC_PL2303 = 0x2303;
	public static final int VENDOR_SDR = 0x0bda;
	public static final int SDR_SDR2838 = 0x2838;

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

	public static final int VENDOR_SILAB = 0x10c4;
	public static final int SILAB_CP2102 = 0xea60;

	/*
	 * 0x0bda 0x2832 all of them Generic RTL2832U (e.g. hama nano)
	 * 
	 * 0x0bda 0x2838 E4000 ezcap USB 2.0 DVB-T/DAB/FM dongle
	 * 
	 * 0x0ccd 0x00a9 FC0012 Terratec Cinergy T Stick Black (rev 1)
	 * 
	 * 0x0ccd 0x00b3 FC0013 Terratec NOXON DAB/DAB+ USB dongle (rev 1)
	 * 
	 * 0x0ccd 0x00d3 E4000 Terratec Cinergy T Stick RC (Rev.3)
	 * 
	 * 0x0ccd 0x00e0 E4000 Terratec NOXON DAB/DAB+ USB dongle (rev 2)
	 * 
	 * 0x185b 0x0620 E4000 Compro Videomate U620F
	 * 
	 * 0x185b 0x0650 E4000 Compro Videomate U650F
	 * 
	 * 0x1f4d 0xb803 FC0012 GTek T803
	 * 
	 * 0x1f4d 0xc803 FC0012 Lifeview LV5TDeluxe
	 * 
	 * 0x1b80 0xd3a4 FC0013 Twintech UT-40
	 * 
	 * 0x1d19 0x1101 FC2580 Dexatek DK DVB-T Dongle (Logilink VG0002A)
	 * 
	 * 0x1d19 0x1102 ? Dexatek DK DVB-T Dongle (MSI DigiVox? mini II V3.0)
	 * 
	 * 0x1d19 0x1103 FC2580 Dexatek Technology Ltd. DK 5217 DVB-T Dongle
	 * 
	 * 0x0458 0x707f ? Genius TVGo DVB-T03 USB dongle (Ver. B)
	 * 
	 * 0x1b80 0xd393 FC0012 GIGABYTE GT-U7300
	 * 
	 * 0x1b80 0xd394 ? DIKOM USB-DVBT HD
	 * 
	 * 0x1b80 0xd395 FC0012 Peak 102569AGPK
	 * 
	 * 0x1b80 0xd39d FC0012 SVEON STV20 DVB-T USB & FM
	 */

	private UsbId() {
		throw new IllegalAccessError("Non-instantiable class.");
	}

}
