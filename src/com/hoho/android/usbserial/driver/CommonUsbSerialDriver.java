/* Copyright 2013 Google Inc.
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
 * Project home page: http://code.google.com/p/usb-serial-for-android/
 */

package com.hoho.android.usbserial.driver;

import java.io.IOException;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;

/**
 * A base class shared by several driver implementations.
 *
 * @author mike wakerly (opensource@hoho.com)
 */
public abstract class CommonUsbSerialDriver implements IUsbSerialDriver {

	public static final int DEFAULT_READ_BUFFER_SIZE = 16 * 16 * 1024;
	public static final int DEFAULT_WRITE_BUFFER_SIZE = 1 * 16 * 1024;

	protected final UsbDevice mDevice;
	protected final UsbDeviceConnection mConnectionBase;
	protected static UsbDeviceConnection mConnection;

	protected final Object mReadBufferLock = new Object();
	protected final Object mWriteBufferLock = new Object();

	/** Internal read buffer. Guarded by {@link #mReadBufferLock}. */
	protected byte[] mReadBuffer;

	/** Internal write buffer. Guarded by {@link #mWriteBufferLock}. */
	protected byte[] mWriteBuffer;

	public CommonUsbSerialDriver(UsbDevice device, UsbDeviceConnection connection) {
		this.mDevice = device;
		this.mConnectionBase = connection;
		mConnection = connection;

		this.mReadBuffer = new byte[DEFAULT_READ_BUFFER_SIZE];
		this.mWriteBuffer = new byte[DEFAULT_WRITE_BUFFER_SIZE];
	}

	public abstract void close() throws IOException;

	public abstract boolean getCD() throws IOException;

	public abstract boolean getCTS() throws IOException;

	/**
	 * Returns the currently-bound USB device.
	 *
	 * @return the device
	 */
	@Override
	public final UsbDevice getDevice() {
		return this.mDevice;
	}

	public abstract boolean getDSR() throws IOException;

	public abstract boolean getDTR() throws IOException;

	public abstract boolean getRI() throws IOException;

	public abstract boolean getRTS() throws IOException;

	public abstract void open() throws IOException;

	public abstract int read(final byte[] dest, final int timeoutMillis) throws IOException;

	public abstract void setDTR(boolean value) throws IOException;

	public abstract void setParameters(int baudRate, int dataBits, int stopBits, int parity) throws IOException;

	/**
	 * Sets the size of the internal buffer used to exchange data with the USB
	 * stack for read operations. Most users should not need to change this.
	 *
	 * @param bufferSize
	 *            the size in bytes
	 */
	public final void setReadBufferSize(int bufferSize) {
		synchronized (this.mReadBufferLock) {
			if (bufferSize == this.mReadBuffer.length) {
				return;
			}
			this.mReadBuffer = new byte[bufferSize];
		}
	}

	public abstract void setRTS(boolean value) throws IOException;

	/**
	 * Sets the size of the internal buffer used to exchange data with the USB
	 * stack for write operations. Most users should not need to change this.
	 *
	 * @param bufferSize
	 *            the size in bytes
	 */
	public final void setWriteBufferSize(int bufferSize) {
		synchronized (this.mWriteBufferLock) {
			if (bufferSize == this.mWriteBuffer.length) {
				return;
			}
			this.mWriteBuffer = new byte[bufferSize];
		}
	}

	public abstract int write(final byte[] src, final int timeoutMillis) throws IOException;

}
