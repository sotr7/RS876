/* RSByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class RSByteBuffer extends Class526 {
	public static final int anInt10670 = 100;
	public static final int anInt10671 = 5000;
	public int pos;
	public byte[] buffer;
	static int[] anIntArray10674 = new int[256];
	static final int anInt10675 = -306674912;
	public static long[] aLongArray10676;
	static final long aLong10677 = -3932672073523589310L;

	public RSByteBuffer(int i, boolean bool) {
		buffer = Class692.method8104(i, bool, -1098295923);
	}

	public void method9607(int i, int i_0_) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, 303214336);
		else if (i < 16384 && i >= -16384)
			writeShort(49152 + i, -805078716);
		else
			throw new IllegalArgumentException();
	}

	public void writeByte(int i, int i_1_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
	}

	public void writeShort(int i, int i_2_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
	}

	public void method9610(int i, byte i_3_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
	}

	public void writeTriByte(int i, int i_4_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
	}

	public void writeInt(int i, int i_5_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 24);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
	}

	public void method9613(int i, int i_6_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 24);
	}

	public void write40(long l) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 32);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 24);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) l;
	}

	void method9615(int i) {
		if (0 != (i & ~0x7f)) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, -1702818701);
					writeByte(i >>> 21 | 0x80, -73183839);
				}
				writeByte(i >>> 14 | 0x80, -85748303);
			}
			writeByte(i >>> 7 | 0x80, -629227646);
		}
		writeByte(i & 0x7f, 1380321096);
	}

	public void method9616(String string, int i) {
		int i_7_ = string.indexOf('\0');
		if (i_7_ >= 0)
			throw new IllegalArgumentException("");
		pos += (Class85.method1183(string, 0, string.length(), buffer, pos * 301018015, 1508466009) * 801976415);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) 0;
	}

	public void method9617(String string, int i) {
		int i_8_ = string.indexOf('\0');
		if (i_8_ >= 0)
			throw new IllegalArgumentException("");
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) 0;
		pos += (Class85.method1183(string, 0, string.length(), buffer, pos * 301018015, 2110542758) * 801976415);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) 0;
	}

	public void method9618(CharSequence charsequence, int i) {
		int i_9_ = NPCDef.method4064(charsequence, (byte) -12);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) 0;
		method9639(i_9_, 321905384);
		pos += Class297.method3968(buffer, 301018015 * pos, charsequence, (byte) 104) * 801976415;
	}

	public void method9619(byte[] is, int i, int i_10_, int i_11_) {
		for (int i_12_ = i; i_12_ < i + i_10_; i_12_++)
			buffer[(pos += 801976415) * 301018015 - 1] = is[i_12_];
	}

	public void method9620(int i, byte i_13_) {
		if (i < 0 || i > 65535)
			throw new IllegalArgumentException();
		buffer[301018015 * pos - i - 2] = (byte) (i >> 8);
		buffer[pos * 301018015 - i - 1] = (byte) i;
	}

	public void method9621(long l) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 56);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 48);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 40);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 32);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 24);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) l;
	}

	public void method9622(int[] is, int i, int i_14_, short i_15_) {
		int i_16_ = 301018015 * pos;
		pos = i * 801976415;
		int i_17_ = (i_14_ - i) / 8;
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			int i_19_ = readInt((byte) 5);
			int i_20_ = readInt((byte) 5);
			int i_21_ = 0;
			int i_22_ = -1640531527;
			int i_23_ = 32;
			while (i_23_-- > 0) {
				i_19_ += ((i_20_ << 4 ^ i_20_ >>> 5) + i_20_ ^ is[i_21_ & 0x3] + i_21_);
				i_21_ += i_22_;
				i_20_ += (i_19_ + (i_19_ << 4 ^ i_19_ >>> 5) ^ is[i_21_ >>> 11 & 0x3] + i_21_);
			}
			pos -= 2120844024;
			writeInt(i_19_, -357564953);
			writeInt(i_20_, -357564953);
		}
		pos = 801976415 * i_16_;
	}

	public void method9623(int i, int i_24_) {
		if (i < -1)
			throw new IllegalArgumentException();
		if (i == -1)
			writeShort(32767, -805078716);
		else if (i < 32767)
			writeShort(i, -805078716);
		else {
			writeInt(i, -357564953);
			buffer[pos * 301018015 - 4] |= 0x80;
		}
	}

	public int method9624(int i, int i_25_) {
		int i_26_ = Class378.method4702(buffer, i, 301018015 * pos, 1867613570);
		writeInt(i_26_, -357564953);
		return i_26_;
	}

	public int readUnsignedByte(int i) {
		return (buffer[(pos += 801976415) * 301018015 - 1] & 0xff);
	}

	public int readUnsignedShort(int i) {
		pos += 1603952830;
		return ((buffer[301018015 * pos - 1] & 0xff) + ((buffer[pos * 301018015 - 2] & 0xff) << 8));
	}

	public int readShort(byte i) {
		pos += 1603952830;
		int i_27_ = ((buffer[301018015 * pos - 1] & 0xff) + ((buffer[301018015 * pos - 2] & 0xff) << 8));
		if (i_27_ > 32767)
			i_27_ -= 65536;
		return i_27_;
	}

	public int method9628(int i) {
		pos += -1889038051;
		int i_28_ = (((buffer[pos * 301018015 - 2] & 0xff) << 8) + ((buffer[301018015 * pos - 3] & 0xff) << 16)
				+ (buffer[301018015 * pos - 1] & 0xff));
		if (i_28_ > 8388607)
			i_28_ -= 16777216;
		return i_28_;
	}

	public int readInt(byte i) {
		pos += -1087061636;
		return (((buffer[pos * 301018015 - 4] & 0xff) << 24) + ((buffer[301018015 * pos - 3] & 0xff) << 16)
				+ ((buffer[pos * 301018015 - 2] & 0xff) << 8) + (buffer[pos * 301018015 - 1] & 0xff));
	}

	public int method9630(byte i) {
		pos += -1087061636;
		return ((buffer[pos * 301018015 - 4] & 0xff) + (((buffer[301018015 * pos - 2] & 0xff) << 16)
				+ ((buffer[pos * 301018015 - 1] & 0xff) << 24) + ((buffer[pos * 301018015 - 3] & 0xff) << 8)));
	}

	public long method9631(int i) {
		long l = (long) readUnsignedByte(-1311344745) & 0xffffffffL;
		long l_29_ = (long) readInt((byte) 5) & 0xffffffffL;
		return (l << 32) + l_29_;
	}

	public long method9632(int i) {
		long l = (long) readUnsignedShort(1449326568) & 0xffffffffL;
		long l_30_ = (long) readInt((byte) 5) & 0xffffffffL;
		return (l << 32) + l_30_;
	}

	public long method9633(int i, int i_31_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_32_ = i * 8;
		long l = 0L;
		for (/**/; i_32_ >= 0; i_32_ -= 8)
			l |= ((long) (buffer[(pos += 801976415) * 301018015 - 1]) & 0xffL) << i_32_;
		return l;
	}

	public float method9634(byte i) {
		return Float.intBitsToFloat(readInt((byte) 5));
	}

	public int readUnsignedLEShort(byte i) {
		pos += 1603952830;
		return (((buffer[pos * 301018015 - 1] & 0xff) << 8) + (buffer[pos * 301018015 - 2] & 0xff));
	}

	public int readBigSmart(byte i) {
		if (buffer[pos * 301018015] < 0)
			return readInt((byte) 5) & 0x7fffffff;
		int i_33_ = readUnsignedShort(699295693);
		if (32767 == i_33_)
			return -1;
		return i_33_;
	}

	public String method9637(int i) {
		byte i_34_ = buffer[(pos += 801976415) * 301018015 - 1];
		if (0 != i_34_)
			throw new IllegalStateException("");
		int i_35_ = 301018015 * pos;
		while (buffer[(pos += 801976415) * 301018015 - 1] != 0) {
			/* empty */
		}
		int i_36_ = pos * 301018015 - i_35_ - 1;
		if (0 == i_36_)
			return "";
		return Class448.method5334(buffer, i_35_, i_36_, -1454953517);
	}

	public String method9638(int i) {
		byte i_37_ = buffer[(pos += 801976415) * 301018015 - 1];
		if (0 != i_37_)
			throw new IllegalStateException("");
		int i_38_ = method9645(1537470360);
		if (pos * 301018015 + i_38_ > buffer.length)
			throw new IllegalStateException("");
		String string = Class603.method7099(buffer, 301018015 * pos, i_38_, 2144676909);
		pos += 801976415 * i_38_;
		return string;
	}

	void method9639(int i, int i_39_) {
		if (0 != (i & ~0x7f)) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, -333288694);
					writeByte(i >>> 21 | 0x80, -917982259);
				}
				writeByte(i >>> 14 | 0x80, -486208666);
			}
			writeByte(i >>> 7 | 0x80, 1067192860);
		}
		writeByte(i & 0x7f, -1857225019);
	}

	public int readUnsignedSmart(int i) {
		int i_40_ = buffer[301018015 * pos] & 0xff;
		if (i_40_ < 128)
			return readUnsignedByte(794093233) - 64;
		return readUnsignedShort(692195698) - 49152;
	}

	public int readSmart(int i) {
		int i_41_ = buffer[pos * 301018015] & 0xff;
		if (i_41_ < 128)
			return readUnsignedByte(2144128945);
		return readUnsignedShort(1690552645) - 32768;
	}

	public int readDecoratedSmart(int i) {
		int i_42_ = buffer[pos * 301018015] & 0xff;
		if (i_42_ < 128)
			return readUnsignedByte(1626083542) - 1;
		return readUnsignedShort(1103183639) - 32769;
	}

	public byte readByte(byte i) {
		return buffer[(pos += 801976415) * 301018015 - 1];
	}

	public int method9644(int i) {
		if (buffer[pos * 301018015] < 0)
			return readInt((byte) 5) & 0x7fffffff;
		return readUnsignedShort(116382795);
	}

	public RSByteBuffer(int size) {
		buffer = Class692.method8107(size, -15272857);
		pos = 0;
	}

	int method9645(int i) {
		int i_43_ = buffer[(pos += 801976415) * 301018015 - 1];
		int i_44_ = 0;
		for (/**/; i_43_ < 0; i_43_ = buffer[(pos += 801976415) * 301018015 - 1])
			i_44_ = (i_44_ | i_43_ & 0x7f) << 7;
		return i_44_ | i_43_;
	}

	public int method9646() {
		int i = buffer[pos * 301018015] & 0xff;
		if (i < 128)
			return readUnsignedByte(-963137953) - 1;
		return readUnsignedShort(1703064150) - 32769;
	}

	public void method9647(int[] is, int i) {
		int i_45_ = pos * 301018015 / 8;
		pos = 0;
		for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
			int i_47_ = readInt((byte) 5);
			int i_48_ = readInt((byte) 5);
			int i_49_ = 0;
			int i_50_ = -1640531527;
			int i_51_ = 32;
			while (i_51_-- > 0) {
				i_47_ += ((i_48_ << 4 ^ i_48_ >>> 5) + i_48_ ^ is[i_49_ & 0x3] + i_49_);
				i_49_ += i_50_;
				i_48_ += ((i_47_ << 4 ^ i_47_ >>> 5) + i_47_ ^ i_49_ + is[i_49_ >>> 11 & 0x3]);
			}
			pos -= 2120844024;
			writeInt(i_47_, -357564953);
			writeInt(i_48_, -357564953);
		}
	}

	public void method9648(int[] is, int i) {
		int i_52_ = pos * 301018015 / 8;
		pos = 0;
		for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
			int i_54_ = readInt((byte) 5);
			int i_55_ = readInt((byte) 5);
			int i_56_ = -957401312;
			int i_57_ = -1640531527;
			int i_58_ = 32;
			while (i_58_-- > 0) {
				i_55_ -= ((i_54_ << 4 ^ i_54_ >>> 5) + i_54_ ^ i_56_ + is[i_56_ >>> 11 & 0x3]);
				i_56_ -= i_57_;
				i_54_ -= (i_55_ + (i_55_ << 4 ^ i_55_ >>> 5) ^ is[i_56_ & 0x3] + i_56_);
			}
			pos -= 2120844024;
			writeInt(i_54_, -357564953);
			writeInt(i_55_, -357564953);
		}
	}

	public void method9649(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
	}

	public void method9650(int[] is, int i, int i_59_, int i_60_) {
		int i_61_ = pos * 301018015;
		pos = 801976415 * i;
		int i_62_ = (i_59_ - i) / 8;
		for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
			int i_64_ = readInt((byte) 5);
			int i_65_ = readInt((byte) 5);
			int i_66_ = -957401312;
			int i_67_ = -1640531527;
			int i_68_ = 32;
			while (i_68_-- > 0) {
				i_65_ -= (i_64_ + (i_64_ << 4 ^ i_64_ >>> 5) ^ is[i_66_ >>> 11 & 0x3] + i_66_);
				i_66_ -= i_67_;
				i_64_ -= ((i_65_ << 4 ^ i_65_ >>> 5) + i_65_ ^ is[i_66_ & 0x3] + i_66_);
			}
			pos -= 2120844024;
			writeInt(i_64_, -357564953);
			writeInt(i_65_, -357564953);
		}
		pos = i_61_ * 801976415;
	}

	public void method9651(BigInteger biginteger, BigInteger biginteger_69_, byte i) {
		int i_70_ = pos * 301018015;
		pos = 0;
		byte[] is = new byte[i_70_];
		writeBytes(is, 0, i_70_, -1320044521);
		BigInteger biginteger_71_ = new BigInteger(is);
		BigInteger biginteger_72_ = biginteger_71_.modPow(biginteger, biginteger_69_);
		byte[] is_73_ = biginteger_72_.toByteArray();
		pos = 0;
		writeShort(is_73_.length, -805078716);
		method9619(is_73_, 0, is_73_.length, 1412056912);
	}

	public boolean method9652(int i) {
		pos -= -1087061636;
		int i_74_ = Class378.method4702(buffer, 0, pos * 301018015, 1272505289);
		int i_75_ = readInt((byte) 5);
		if (i_75_ == i_74_)
			return true;
		return false;
	}

	public void method9653(long l, int i, int i_76_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_77_ = 8 * i; i_77_ >= 0; i_77_ -= 8)
			buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> i_77_);
	}

	public void write128Byte(int i, int i_78_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (128 - i);
	}

	public int readUnsignedByte128(byte i) {
		return ((buffer[(pos += 801976415) * 301018015 - 1] - 128) & 0xff);
	}

	public int readByteC(byte i) {
		return (0 - buffer[(pos += 801976415) * 301018015 - 1] & 0xff);
	}

	public int readUnsigned128Byte(byte i) {
		return ((128 - buffer[(pos += 801976415) * 301018015 - 1]) & 0xff);
	}

	public byte writeByte128(int i) {
		return (byte) ((buffer[(pos += 801976415) * 301018015 - 1]) - 128);
	}

	public byte readByteC(int i) {
		return (byte) (0 - (buffer[(pos += 801976415) * 301018015 - 1]));
	}

	public byte read128Byte(byte i) {
		return (byte) (128 - (buffer[(pos += 801976415) * 301018015 - 1]));
	}

	public void writeLEShort(int i, byte i_79_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
	}

	public void writeBytes128Reverse(byte[] is, int i, int i_80_, int i_81_) {
		for (int i_82_ = i + i_80_ - 1; i_82_ >= i; i_82_--)
			is[i_82_] = (byte) ((buffer[(pos += 801976415) * 301018015 - 1]) - 128);
	}

	public long method9663(int i) {
		long l = (long) readInt((byte) 5) & 0xffffffffL;
		long l_83_ = (long) readInt((byte) 5) & 0xffffffffL;
		return (l << 32) + l_83_;
	}

	public int readUnsignedShortLE128(short i) {
		pos += 1603952830;
		return ((buffer[pos * 301018015 - 2] - 128 & 0xff) + ((buffer[pos * 301018015 - 1] & 0xff) << 8));
	}

	public int readShort(int i) {
		pos += 1603952830;
		int i_84_ = (((buffer[pos * 301018015 - 1] & 0xff) << 8) + (buffer[301018015 * pos - 2] & 0xff));
		if (i_84_ > 32767)
			i_84_ -= 65536;
		return i_84_;
	}

	public int method9666(int i) {
		pos += 1603952830;
		int i_85_ = (((buffer[301018015 * pos - 2] & 0xff) << 8) + (buffer[301018015 * pos - 1] - 128 & 0xff));
		if (i_85_ > 32767)
			i_85_ -= 65536;
		return i_85_;
	}

	public int readShortLE128(int i) {
		pos += 1603952830;
		int i_86_ = ((buffer[pos * 301018015 - 2] - 128 & 0xff) + ((buffer[pos * 301018015 - 1] & 0xff) << 8));
		if (i_86_ > 32767)
			i_86_ -= 65536;
		return i_86_;
	}

	public int read24BitIntV2(byte i) {
		pos += -1889038051;
		return (((buffer[pos * 301018015 - 1] & 0xff) << 8) + ((buffer[301018015 * pos - 3] & 0xff) << 16)
				+ (buffer[301018015 * pos - 2] & 0xff));
	}

	public void writeIntLE(int i, byte i_87_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 24);
	}

	public void writeIntV1(int i, int i_88_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 24);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
	}

	public void writeIntV2(int i, byte i_89_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 24);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
	}

	public int readIntLE(int i) {
		pos += -1087061636;
		return ((buffer[301018015 * pos - 4] & 0xff) + (((buffer[301018015 * pos - 2] & 0xff) << 16)
				+ ((buffer[pos * 301018015 - 1] & 0xff) << 24) + ((buffer[301018015 * pos - 3] & 0xff) << 8)));
	}

	public int readIntV1(int i) {
		pos += -1087061636;
		return ((buffer[pos * 301018015 - 3] & 0xff) + (((buffer[pos * 301018015 - 1] & 0xff) << 16)
				+ ((buffer[301018015 * pos - 2] & 0xff) << 24) + ((buffer[pos * 301018015 - 4] & 0xff) << 8)));
	}

	public int readIntV2(byte i) {
		pos += -1087061636;
		return ((buffer[301018015 * pos - 2] & 0xff) + (((buffer[301018015 * pos - 3] & 0xff) << 24)
				+ ((buffer[pos * 301018015 - 4] & 0xff) << 16) + ((buffer[pos * 301018015 - 1] & 0xff) << 8)));
	}

	public void method9675(int i) {
		if (buffer != null)
			Class692.method8106(buffer, (byte) -10);
		buffer = null;
	}

	public void method9676(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
	}

	public void method9677(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
	}

	public void method9678(int i, byte i_90_) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		buffer[pos * 301018015 - i - 1] = (byte) i;
	}

	public int method9679() {
		int i = buffer[pos * 301018015] & 0xff;
		if (i < 128)
			return readUnsignedByte(566729151) - 1;
		return readUnsignedShort(1670098422) - 32769;
	}

	public void method9680(long l) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 40);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 32);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 24);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 16);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) (l >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (int) l;
	}

	public void writeByteC(int i, int i_91_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (0 - i);
	}

	public void write128Byte(int i, byte i_92_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (128 + i);
	}

	public int method9683(byte i) {
		int i_93_ = 0;
		int i_94_;
		for (i_94_ = readSmart(-811883858); i_94_ == 32767; i_94_ = readSmart(-361301668))
			i_93_ += 32767;
		i_93_ += i_94_;
		return i_93_;
	}

	public void writeLEShort128(int i, int i_95_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i + 128);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
	}

	public void method9685(int i) {
		if (i < 64 && i >= -64)
			writeByte(64 + i, -2135001357);
		else if (i < 16384 && i >= -16384)
			writeShort(49152 + i, -805078716);
		else
			throw new IllegalArgumentException();
	}

	public int method9686(int i) {
		int i_96_ = 0;
		int i_97_ = 0;
		int i_98_;
		do {
			i_98_ = readUnsignedByte(-97713366);
			i_96_ |= (i_98_ & 0x7f) << i_97_;
			i_97_ += 7;
		} while (i_98_ > 127);
		return i_96_;
	}

	public void method9687(int i) {
		if (i >= 0 && i < 128)
			writeByte(i, 815883771);
		else if (i >= 0 && i < 32768)
			writeShort(i + 32768, -805078716);
		else
			throw new IllegalArgumentException();
	}

	void method9688(int i) {
		if (0 != (i & ~0x7f)) {
			if (0 != (i & ~0x3fff)) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 28 | 0x80, -391819854);
					writeByte(i >>> 21 | 0x80, -798637763);
				}
				writeByte(i >>> 14 | 0x80, -399932880);
			}
			writeByte(i >>> 7 | 0x80, 1146847676);
		}
		writeByte(i & 0x7f, 1315791223);
	}

	public void writeBytes(byte[] is, int i, int i_99_, int i_100_) {
		for (int i_101_ = i; i_101_ < i_99_ + i; i_101_++)
			is[i_101_] = buffer[(pos += 801976415) * 301018015 - 1];
	}

	public void method9690(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (0 - i);
	}

	public int method9691() {
		pos += 1603952830;
		int i = ((buffer[301018015 * pos - 1] & 0xff) + ((buffer[301018015 * pos - 2] & 0xff) << 8));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public int method9692() {
		pos += 1603952830;
		int i = ((buffer[301018015 * pos - 1] & 0xff) + ((buffer[301018015 * pos - 2] & 0xff) << 8));
		if (i > 32767)
			i -= 65536;
		return i;
	}

	public int method9693() {
		pos += -1889038051;
		return (((buffer[301018015 * pos - 3] & 0xff) << 16) + ((buffer[pos * 301018015 - 2] & 0xff) << 8)
				+ (buffer[301018015 * pos - 1] & 0xff));
	}

	public int method9694() {
		pos += -1889038051;
		int i = (((buffer[pos * 301018015 - 2] & 0xff) << 8) + ((buffer[301018015 * pos - 3] & 0xff) << 16)
				+ (buffer[301018015 * pos - 1] & 0xff));
		if (i > 8388607)
			i -= 16777216;
		return i;
	}

	public int method9695() {
		pos += -1087061636;
		return (((buffer[pos * 301018015 - 4] & 0xff) << 24) + ((buffer[301018015 * pos - 3] & 0xff) << 16)
				+ ((buffer[pos * 301018015 - 2] & 0xff) << 8) + (buffer[pos * 301018015 - 1] & 0xff));
	}

	public int method9696() {
		pos += -1087061636;
		return ((buffer[pos * 301018015 - 4] & 0xff) + (((buffer[301018015 * pos - 2] & 0xff) << 16)
				+ ((buffer[pos * 301018015 - 1] & 0xff) << 24) + ((buffer[pos * 301018015 - 3] & 0xff) << 8)));
	}

	public void method9697(RSByteBuffer class526_sub36_102_, int i) {
		method9619(class526_sub36_102_.buffer, 0, 301018015 * class526_sub36_102_.pos, 1957922193);
	}

	public void method9698(int i, byte i_103_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
	}

	public long method9699() {
		long l = (long) readInt((byte) 5) & 0xffffffffL;
		long l_104_ = (long) readInt((byte) 5) & 0xffffffffL;
		return (l << 32) + l_104_;
	}

	public String method9700(byte i) {
		if (buffer[301018015 * pos] == 0) {
			pos += 801976415;
			return null;
		}
		return readString(163743621);
	}

	public void method9701() {
		if (buffer != null)
			Class692.method8106(buffer, (byte) -62);
		buffer = null;
	}

	public int read24BitInt(int i) {
		pos += -1889038051;
		return (((buffer[301018015 * pos - 3] & 0xff) << 16) + ((buffer[pos * 301018015 - 2] & 0xff) << 8)
				+ (buffer[301018015 * pos - 1] & 0xff));
	}

	public int method9703() {
		int i = buffer[301018015 * pos] & 0xff;
		if (i < 128)
			return readUnsignedByte(1962481776) - 64;
		return readUnsignedShort(589209344) - 49152;
	}

	public int readUnsignedShort128(short i) {
		pos += 1603952830;
		return ((buffer[pos * 301018015 - 1] - 128 & 0xff) + ((buffer[301018015 * pos - 2] & 0xff) << 8));
	}

	public RSByteBuffer(byte[] is) {
		buffer = is;
		pos = 0;
	}

	public int method9705() {
		int i = buffer[pos * 301018015] & 0xff;
		if (i < 128)
			return readUnsignedByte(-947827324) - 1;
		return readUnsignedShort(1919167064) - 32769;
	}

	public int method9706() {
		int i = buffer[pos * 301018015] & 0xff;
		if (i < 128)
			return readUnsignedByte(-1189789037) - 1;
		return readUnsignedShort(1756819215) - 32769;
	}

	public int method9707() {
		int i = 0;
		int i_105_;
		for (i_105_ = readSmart(-1169119106); i_105_ == 32767; i_105_ = readSmart(-1800043481))
			i += 32767;
		i += i_105_;
		return i;
	}

	public int method9708() {
		int i = 0;
		int i_106_ = 0;
		int i_107_;
		do {
			i_107_ = readUnsignedByte(193486795);
			i |= (i_107_ & 0x7f) << i_106_;
			i_106_ += 7;
		} while (i_107_ > 127);
		return i;
	}

	public int method9709() {
		int i = 0;
		int i_108_ = 0;
		int i_109_;
		do {
			i_109_ = readUnsignedByte(-1240689200);
			i |= (i_109_ & 0x7f) << i_108_;
			i_108_ += 7;
		} while (i_109_ > 127);
		return i;
	}

	public void method9710(int[] is) {
		int i = pos * 301018015 / 8;
		pos = 0;
		for (int i_110_ = 0; i_110_ < i; i_110_++) {
			int i_111_ = readInt((byte) 5);
			int i_112_ = readInt((byte) 5);
			int i_113_ = 0;
			int i_114_ = -1640531527;
			int i_115_ = 32;
			while (i_115_-- > 0) {
				i_111_ += ((i_112_ << 4 ^ i_112_ >>> 5) + i_112_ ^ is[i_113_ & 0x3] + i_113_);
				i_113_ += i_114_;
				i_112_ += ((i_111_ << 4 ^ i_111_ >>> 5) + i_111_ ^ i_113_ + is[i_113_ >>> 11 & 0x3]);
			}
			pos -= 2120844024;
			writeInt(i_111_, -357564953);
			writeInt(i_112_, -357564953);
		}
	}

	public void method9711(int i, int i_116_) {
		if (i >= 0 && i < 128)
			writeByte(i, -2063330668);
		else if (i >= 0 && i < 32768)
			writeShort(i + 32768, -805078716);
		else
			throw new IllegalArgumentException();
	}

	public void method9712(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 24);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
	}

	public void method9713(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (128 + i);
	}

	public void method9714(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (128 + i);
	}

	public void method9715(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (0 - i);
	}

	public boolean method9716() {
		pos -= -1087061636;
		int i = Class378.method4702(buffer, 0, pos * 301018015, 1799981046);
		int i_117_ = readInt((byte) 5);
		if (i_117_ == i)
			return true;
		return false;
	}

	public String readString(int i) {
		int i_118_ = 301018015 * pos;
		while (buffer[(pos += 801976415) * 301018015 - 1] != 0) {
			/* empty */
		}
		int i_119_ = 301018015 * pos - i_118_ - 1;
		if (0 == i_119_)
			return "";
		return Class448.method5334(buffer, i_118_, i_119_, -1670771507);
	}

	public void writeShort128(int i, byte i_120_) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i + 128);
	}

	public void method9719(int i) {
		if (i >= 0 && i < 128)
			writeByte(i, 129485605);
		else if (i >= 0 && i < 32768)
			writeShort(i + 32768, -805078716);
		else
			throw new IllegalArgumentException();
	}

	public void method9720(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (128 - i);
	}

	public long method9721() {
		long l = (long) readInt((byte) 5) & 0xffffffffL;
		long l_121_ = (long) readInt((byte) 5) & 0xffffffffL;
		return (l << 32) + l_121_;
	}

	public void method9722(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
	}

	public void method9723(int i) {
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) i;
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 8);
		buffer[(pos += 801976415) * 301018015 - 1] = (byte) (i >> 16);
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_122_ = i;
			for (int i_123_ = 0; i_123_ < 8; i_123_++) {
				if (1 == (i_122_ & 0x1))
					i_122_ = i_122_ >>> 1 ^ ~0x12477cdf;
				else
					i_122_ >>>= 1;
			}
			anIntArray10674[i] = i_122_;
		}
		aLongArray10676 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_124_ = 0; i_124_ < 8; i_124_++) {
				if (1L == (l & 0x1L))
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray10676[i] = l;
		}
	}

	public void method9724(int i) {
		if (i < 0 || i > 255)
			throw new IllegalArgumentException();
		buffer[pos * 301018015 - i - 1] = (byte) i;
	}
}
