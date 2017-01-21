/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Calendar;

public class Class22 {
	static final String aString206 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	byte[] aByteArray207 = new byte[32];
	static final int anInt208 = 10;
	long[] aLongArray209;
	static long[][] aLongArrayArray210 = new long[8][256];
	static long[] aLongArray211 = new long[11];
	public static final int anInt212 = 64;
	byte[] aByteArray213 = new byte[64];
	long[] aLongArray214;
	int anInt215;
	static final int anInt216 = 512;
	long[] aLongArray217;
	long[] aLongArray218;
	long[] aLongArray219;
	int anInt220 = 0;

	void method667(byte[] is, int i, byte i_0_) {
		aByteArray213[-459028979 * anInt215] |= 128 >>> (anInt220 * -1316784193 & 0x7);
		anInt215 += -1282606907;
		if (-459028979 * anInt215 > 32) {
			while (anInt215 * -459028979 < 64)
				aByteArray213[(anInt215 += -1282606907) * -459028979 - 1] = (byte) 0;
			method668(16711680);
			anInt215 = 0;
		}
		while (-459028979 * anInt215 < 32)
			aByteArray213[(anInt215 += -1282606907) * -459028979 - 1] = (byte) 0;
		System.arraycopy(aByteArray207, 0, aByteArray213, 32, 32);
		method668(16711680);
		int i_1_ = 0;
		int i_2_ = i;
		while (i_1_ < 8) {
			long l = aLongArray214[i_1_];
			is[i_2_] = (byte) (int) (l >>> 56);
			is[1 + i_2_] = (byte) (int) (l >>> 48);
			is[2 + i_2_] = (byte) (int) (l >>> 40);
			is[i_2_ + 3] = (byte) (int) (l >>> 32);
			is[i_2_ + 4] = (byte) (int) (l >>> 24);
			is[i_2_ + 5] = (byte) (int) (l >>> 16);
			is[6 + i_2_] = (byte) (int) (l >>> 8);
			is[7 + i_2_] = (byte) (int) l;
			i_1_++;
			i_2_ += 8;
		}
	}

	void method668(int i) {
		int i_3_ = 0;
		int i_4_ = 0;
		while (i_3_ < 8) {
			aLongArray219[i_3_] = ((long) aByteArray213[i_4_] << 56 ^ ((long) aByteArray213[1 + i_4_] & 0xffL) << 48
					^ ((long) aByteArray213[i_4_ + 2] & 0xffL) << 40 ^ ((long) aByteArray213[i_4_ + 3] & 0xffL) << 32
					^ ((long) aByteArray213[i_4_ + 4] & 0xffL) << 24 ^ ((long) aByteArray213[5 + i_4_] & 0xffL) << 16
					^ ((long) aByteArray213[6 + i_4_] & 0xffL) << 8 ^ (long) aByteArray213[i_4_ + 7] & 0xffL);
			i_3_++;
			i_4_ += 8;
		}
		for (i_3_ = 0; i_3_ < 8; i_3_++)
			aLongArray209[i_3_] = aLongArray219[i_3_] ^ (aLongArray217[i_3_] = aLongArray214[i_3_]);
		for (i_3_ = 1; i_3_ <= 10; i_3_++) {
			for (i_4_ = 0; i_4_ < 8; i_4_++) {
				aLongArray218[i_4_] = 0L;
				int i_5_ = 0;
				int i_6_ = 56;
				while (i_5_ < 8) {
					aLongArray218[i_4_] ^= (aLongArrayArray210[i_5_][((int) (aLongArray217[i_4_ - i_5_ & 0x7] >>> i_6_)
							& 0xff)]);
					i_5_++;
					i_6_ -= 8;
				}
			}
			for (i_4_ = 0; i_4_ < 8; i_4_++)
				aLongArray217[i_4_] = aLongArray218[i_4_];
			aLongArray217[0] ^= aLongArray211[i_3_];
			for (i_4_ = 0; i_4_ < 8; i_4_++) {
				aLongArray218[i_4_] = aLongArray217[i_4_];
				int i_7_ = 0;
				int i_8_ = 56;
				while (i_7_ < 8) {
					aLongArray218[i_4_] ^= (aLongArrayArray210[i_7_][((int) (aLongArray209[i_4_ - i_7_ & 0x7] >>> i_8_)
							& 0xff)]);
					i_7_++;
					i_8_ -= 8;
				}
			}
			for (i_4_ = 0; i_4_ < 8; i_4_++)
				aLongArray209[i_4_] = aLongArray218[i_4_];
		}
		for (i_3_ = 0; i_3_ < 8; i_3_++)
			aLongArray214[i_3_] ^= aLongArray209[i_3_] ^ aLongArray219[i_3_];
	}

	void method669(byte i) {
		for (int i_9_ = 0; i_9_ < 32; i_9_++)
			aByteArray207[i_9_] = (byte) 0;
		anInt215 = 0;
		anInt220 = 0;
		aByteArray213[0] = (byte) 0;
		for (int i_10_ = 0; i_10_ < 8; i_10_++)
			aLongArray214[i_10_] = 0L;
	}

	void method670(byte[] is, long l) {
		int i = 0;
		int i_11_ = 8 - ((int) l & 0x7) & 0x7;
		int i_12_ = anInt220 * -1316784193 & 0x7;
		long l_13_ = l;
		int i_14_ = 31;
		int i_15_ = 0;
		for (/**/; i_14_ >= 0; i_14_--) {
			i_15_ += (aByteArray207[i_14_] & 0xff) + ((int) l_13_ & 0xff);
			aByteArray207[i_14_] = (byte) i_15_;
			i_15_ >>>= 8;
			l_13_ >>>= 8;
		}
		while (l > 8L) {
			int i_16_ = is[i] << i_11_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_11_;
			if (i_16_ < 0 || i_16_ >= 256)
				throw new RuntimeException();
			aByteArray213[anInt215 * -459028979] |= i_16_ >>> i_12_;
			anInt215 += -1282606907;
			anInt220 += (8 - i_12_) * 1350334527;
			if (-1316784193 * anInt220 == 512) {
				method668(16711680);
				anInt215 = 0;
				anInt220 = 0;
			}
			aByteArray213[anInt215 * -459028979] = (byte) (i_16_ << 8 - i_12_ & 0xff);
			anInt220 += 1350334527 * i_12_;
			l -= 8L;
			i++;
		}
		int i_17_;
		if (l > 0L) {
			i_17_ = is[i] << i_11_ & 0xff;
			aByteArray213[anInt215 * -459028979] |= i_17_ >>> i_12_;
		} else
			i_17_ = 0;
		if ((long) i_12_ + l < 8L)
			anInt220 += l * 1350334527L;
		else {
			anInt215 += -1282606907;
			anInt220 += (8 - i_12_) * 1350334527;
			l -= (long) (8 - i_12_);
			if (512 == anInt220 * -1316784193) {
				method668(16711680);
				anInt215 = 0;
				anInt220 = 0;
			}
			aByteArray213[anInt215 * -459028979] = (byte) (i_17_ << 8 - i_12_ & 0xff);
			anInt220 += 1350334527 * (int) l;
		}
	}

	void method671() {
		for (int i = 0; i < 32; i++)
			aByteArray207[i] = (byte) 0;
		anInt215 = 0;
		anInt220 = 0;
		aByteArray213[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray214[i] = 0L;
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_18_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			long l = (0 == (i & 0x1) ? (long) (i_18_ >>> 8) : (long) (i_18_ & 0xff));
			long l_19_ = l << 1;
			if (l_19_ >= 256L)
				l_19_ ^= 0x11dL;
			long l_20_ = l_19_ << 1;
			if (l_20_ >= 256L)
				l_20_ ^= 0x11dL;
			long l_21_ = l_20_ ^ l;
			long l_22_ = l_20_ << 1;
			if (l_22_ >= 256L)
				l_22_ ^= 0x11dL;
			long l_23_ = l_22_ ^ l;
			aLongArrayArray210[0][i] = (l << 56 | l << 48 | l_20_ << 40 | l << 32 | l_22_ << 24 | l_21_ << 16
					| l_19_ << 8 | l_23_);
			for (int i_24_ = 1; i_24_ < 8; i_24_++)
				aLongArrayArray210[i_24_][i] = (aLongArrayArray210[i_24_ - 1][i] >>> 8
						| aLongArrayArray210[i_24_ - 1][i] << 56);
		}
		aLongArray211[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_25_ = (i - 1) * 8;
			aLongArray211[i] = (aLongArrayArray210[0][i_25_] & ~0xffffffffffffffL
					^ aLongArrayArray210[1][i_25_ + 1] & 0xff000000000000L
					^ aLongArrayArray210[2][i_25_ + 2] & 0xff0000000000L
					^ aLongArrayArray210[3][i_25_ + 3] & 0xff00000000L ^ aLongArrayArray210[4][4 + i_25_] & 0xff000000L
					^ aLongArrayArray210[5][i_25_ + 5] & 0xff0000L ^ aLongArrayArray210[6][6 + i_25_] & 0xff00L
					^ aLongArrayArray210[7][7 + i_25_] & 0xffL);
		}
	}

	void method672() {
		for (int i = 0; i < 32; i++)
			aByteArray207[i] = (byte) 0;
		anInt215 = 0;
		anInt220 = 0;
		aByteArray213[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray214[i] = 0L;
	}

	void method673() {
		for (int i = 0; i < 32; i++)
			aByteArray207[i] = (byte) 0;
		anInt215 = 0;
		anInt220 = 0;
		aByteArray213[0] = (byte) 0;
		for (int i = 0; i < 8; i++)
			aLongArray214[i] = 0L;
	}

	Class22() {
		anInt215 = 0;
		aLongArray214 = new long[8];
		aLongArray217 = new long[8];
		aLongArray218 = new long[8];
		aLongArray219 = new long[8];
		aLongArray209 = new long[8];
	}

	static final void method674(Class681 class681, byte i) {
		Class679 class679 = (class681.aBool8628 ? class681.aClass679_8631 : class681.aClass679_8621);
		InterfaceDef interfaceDef = class679.aClass245_8600;
		class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285 - 1] = 1724213933
				* interfaceDef.anInt2572;
	}

	static String method675(long l, int i, boolean bool, int i_26_) {
		Calendar calendar;
		if (bool) {
			Class545.method6512(l);
			calendar = Class93.aCalendar898;
		} else {
			Class258.method3514(l);
			calendar = Class93.aCalendar899;
		}
		int i_27_ = calendar.get(5);
		int i_28_ = calendar.get(2) + 1;
		int i_29_ = calendar.get(1);
		int i_30_ = calendar.get(11);
		int i_31_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_27_ / 10)).append(i_27_ % 10).append("/")
				.append(i_28_ / 10).append(i_28_ % 10).append("/").append(i_29_ % 100 / 10).append(i_29_ % 10)
				.append(" ").append(i_30_ / 10).append(i_30_ % 10).append(":").append(i_31_ / 10).append(i_31_ % 10)
				.toString();
	}

	public static final boolean method676(char c, int i) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && c != '<' || c >= '[' && c <= '_' || c >= '{');
	}
}
