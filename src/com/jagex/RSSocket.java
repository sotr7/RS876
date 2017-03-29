package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import com.Launcher;

public class RSSocket {
	public String address;
	public int securePort;
	public int port;
	public int id;
	public static Class466 aClass466_35;
	boolean useSecure = true;
	boolean useProxy = false;

	public boolean method544(RSSocket socket, byte var2) {
		return null == socket ? false
				: -2107114137 * socket.id == this.id * -2107114137
						&& this.address.equals(socket.address)
						&& socket.port * -720149929 == this.port * -720149929
						&& socket.securePort * 2050494641 == 2050494641 * this.securePort;
	}

	public void method545() {
		if (!this.useSecure) {
			this.useSecure = true;
			this.useProxy = true;
		} else if (this.useProxy) {
			this.useProxy = false;
		} else {
			this.useSecure = false;
		}

	}

	public void method546() {
		if (!this.useSecure) {
			this.useSecure = true;
			this.useProxy = true;
		} else if (this.useProxy) {
			this.useProxy = false;
		} else {
			this.useSecure = false;
		}

	}

	public void method547() {
		if (!this.useSecure) {
			this.useSecure = true;
			this.useProxy = true;
		} else if (this.useProxy) {
			this.useProxy = false;
		} else {
			this.useSecure = false;
		}

	}

	public void method548(byte var1) {
		if (!this.useSecure) {
			this.useSecure = true;
			this.useProxy = true;
		} else if (this.useProxy) {
			this.useProxy = false;
		} else {
			this.useSecure = false;
		}

	}

	public Socket method549(int var1) throws IOException {
		if (Launcher.connectNocturne)
			return new Socket(InetAddress.getByName(address), 43594);
		return !this.useProxy ? new Socket(InetAddress.getByName(this.address),
				this.useSecure ? 2050494641 * this.securePort : this.port
						* -720149929) : Class220.method3047(
				this.address,
				this.useSecure ? 2050494641 * this.securePort : this.port
						* -720149929, -2046634871).method719((short) -13588);
	}

	static final void method550(InterfaceDef var0, Class243 var1,
			Class681 var2, byte var3) {
		var0.aBool2553 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669)
				* -1730576285] == 1;
		Class526_Sub31.method9555(var0, (byte) 10);
	}

	static RSByteBuffer method551(byte var0) {
		RSByteBuffer var1 = new RSByteBuffer(518);
		Class32.anIntArray359 = new int[4];
		Class32.anIntArray359[0] = (int) (Math.random() * 9.9999999E7D);
		Class32.anIntArray359[1] = (int) (Math.random() * 9.9999999E7D);
		Class32.anIntArray359[2] = (int) (Math.random() * 9.9999999E7D);
		Class32.anIntArray359[3] = (int) (Math.random() * 9.9999999E7D);
		var1.writeByte(10, -1977135791);
		var1.writeInt(Class32.anIntArray359[0], -357564953);
		var1.writeInt(Class32.anIntArray359[1], -357564953);
		var1.writeInt(Class32.anIntArray359[2], -357564953);
		var1.writeInt(Class32.anIntArray359[3], -357564953);
		return var1;
	}
}
