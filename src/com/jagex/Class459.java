package com.jagex;

import java.math.BigInteger;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;

public class Class459 {
	Class469[] aClass469Array5171;

	Class459(RSByteBuffer var1, BigInteger var2, BigInteger var3) {
		var1.pos = -285085221;
		int var4 = var1.readUnsignedByte(442759040);
		var1.pos += -266396240 * var4;
		byte[] var5 = new byte[var1.buffer.length - var1.pos * 301018015];
		var1.writeBytes(var5, 0, var5.length, -2022986512);
		byte[] var6;
		if (null != var2 && null != var3) {
			BigInteger var7 = new BigInteger(var5);
			BigInteger var8 = var7.modPow(var2, var3);
			var6 = var8.toByteArray();
		} else {
			var6 = var5;
		}

		if (65 != var6.length && 64 != var6.length) {
			throw new RuntimeException();
		} else {
			boolean aBoolean13199 = true;
			if (aBoolean13199) {
				byte[] var14 = Class200.method2872(var1.buffer, 5, 301018015
						* var1.pos - var5.length - 5, -1542931636);

				int var15;
				for (var15 = 0; var15 < 64; ++var15) {
					if (var6[var15 + 1] != var14[var15]) {
						throw new RuntimeException();
					}
				}
			}

			this.aClass469Array5171 = new Class469[var4];

			for (int var15 = 0; var15 < var4; ++var15) {
				var1.pos = 516891194 + var15 * -266396240;
				int var9 = var1.readInt((byte) 5);
				int var10 = var1.readInt((byte) 5);
				int var11 = var1.readInt((byte) 5);
				int var12 = var1.readInt((byte) 5);
				byte[] var13 = new byte[64];
				var1.writeBytes(var13, 0, 64, -1580997285);
				this.aClass469Array5171[var15] = new Class469(var9, var11,
						var10, var12, var13);
			}

		}
	}

	static boolean method5421(TwitchEvent var0, long var1) {
		if (!Class570.aBool7621) {
			switch (var0.eventType) {
			case 7:
			case 8:
			case 9:
				return false;
			}
		}

		int var3;
		if (var0.eventType == 33) {
			if (Class570.aTwitchWebcamFrameData7647 == null) {
				return false;
			} else {
				var3 = ((TwitchEventResult) var0).result;
				int var4 = Class570.aTwitchTV7639.GetWebcamFrameData(var3,
						Class570.aTwitchWebcamFrameData7647);
				if (0 == var4) {
					if (Class570.aBool7654) {
						Class570.aTwitchWebcamFrameData7647.method8326();
					}

					if (Class570.aBool7646) {
						Class570.aTwitchWebcamFrameData7647.method8327();
					}

					Class115.method1412((byte) -101);
					Class570.aLong7637 = var1 * -27567453160858397L;
					Class476.method5658(33, 0, (byte) -47);
				} else {
					Class570.aClass153_7642 = null;
				}

				return false;
			}
		} else {
			if (30 == var0.eventType) {
				var3 = ((TwitchEventResult) var0).result;
				if (0 != var3 && 1 != var3) {
					if (2 == var3) {
						Class570.aLong7637 = var1 * -27567453160858397L;
					}
				} else {
					Class263.method3546(1888393711);
				}
			}

			if (34 == var0.eventType) {
				Class526_Sub38_Sub2.aTwitchEventLiveStreams11806 = (TwitchEventLiveStreams) var0;
				Class476.method5658(34, 0, (byte) -21);
			}

			return true;
		}
	}

	static final void method5422(Class681 var0, int var1) {
		long var2 = Class255.time((byte) 24);
		var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int) (var2 / 86400000L) - 11745;
	}

	static final void method5423(Class681 var0, int var1) {
		Class679 var2 = var0.aBool8628 ? var0.aClass679_8631
				: var0.aClass679_8621;
		InterfaceDef var3 = var2.aClass245_8600;
		var0.anInt8623 -= 1895959790;
		byte[] var4 = null;
		byte[] var5 = null;

		int var6;
		for (var6 = 0; var6 < 10
				&& var0.anIntArray8622[var6 + var0.anInt8623 * -1730576285] >= 0; var6 += 2) {
			;
		}

		if (var6 > 0) {
			var4 = new byte[var6 / 2];
			var5 = new byte[var6 / 2];

			for (var6 -= 2; var6 >= 0; var6 -= 2) {
				var4[var6 / 2] = (byte) var0.anIntArray8622[var6
						+ var0.anInt8623 * -1730576285];
				var5[var6 / 2] = (byte) var0.anIntArray8622[1 + var6
						+ var0.anInt8623 * -1730576285];
			}
		}

		Class23.method693(var3, var4, var5, var0, (byte) 27);
	}

	static boolean method5424(int var0, int var1) {
		return 18 == var0 || 15 == var0 || var0 == 12;
	}
}
