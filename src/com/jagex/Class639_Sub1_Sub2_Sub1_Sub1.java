/*
 * Class639_Sub1_Sub2_Sub1_Sub1 - Decompiled by JODE Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class639_Sub1_Sub2_Sub1_Sub1 extends Class639_Sub1_Sub2_Sub1 {
	public int anInt12160;
	public String aString12161;
	String aString12162;
	public byte aByte12163 = 0;
	int anInt12164;
	public int[] anIntArray12165;
	public int[] anIntArray12166;
	public int anInt12167;
	public int anInt12168;
	public int anInt12169;
	String aString12170;
	public int anInt12171;
	public int anInt12172;
	public boolean aBool12173;
	public int anInt12174;
	public String aString12175;
	public int anInt12176;
	public int anInt12177;
	public int anInt12178;
	public int anInt12179;
	public int anInt12180;
	public Class633 aClass633_12181;
	public Class215 aClass215_12182;
	public Class624 aClass624_12183;
	public boolean aBool12184;

	public Class526_Sub32 method186(int i) {
		Class596 class596 = client.aClass505_11204.method6128(2015451270);
		return (Class163.method1925(aByte10827, ((int) method7635().aClass446_4816.aFloat4917 + -507706880 * class596.localX), -(int) method7635().aClass446_4816.aFloat4915,
				((int) method7635().aClass446_4816.aFloat4919 + 747559424 * class596.localY), (byte) 46));
	}

	public Class639_Sub1_Sub2_Sub1_Sub1(Class549 class549, int i) {
		super(class549, i, Class506.aClass97_Sub1_Sub1_5698);
		anIntArray12166 = new int[8];
		anIntArray12165 = new int[8];
		anInt12167 = 0;
		anInt12169 = 0;
		anInt12168 = -1370279355;
		anInt12171 = 0;
		anInt12172 = -1830298621;
		aBool12173 = false;
		anInt12174 = 0;
		anInt12160 = -364958771;
		anInt12176 = 555202607;
		anInt12177 = -46854899;
		anInt12178 = 368096955;
		anInt12179 = 0;
		anInt12180 = 574566657;
		aClass215_12182 = Class215.aClass215_2271;
		aClass624_12183 = Class624.aClass624_8175;
		aBool12184 = false;
		method10967((byte) 32);
	}

	public Class295 method197(byte i) {
		return Class295.aClass295_3190;
	}

	public final void decodeAppearance(RSByteBuffer class526_sub36, int i) {
		class526_sub36.pos = 0;
		int i_0_ = class526_sub36.readUnsignedByte(-1056264720);
		byte i_1_ = (byte) (i_0_ & 0x1);
		boolean bool = (i_0_ & 0x4) != 0;
		int i_2_ = super.method10781(-627148024);
		setBoundSize(1 + (i_0_ >> 3 & 0x7), (byte) -14);
		boolean bool_3_ = (i_0_ & 0x40) != 0;
		boolean bool_4_ = (i_0_ & 0x80) != 0;
		Class446 class446 = Class446.method5305(method7635().aClass446_4816);
		class446.aFloat4917 += (float) (method10781(-627148024) - i_2_ << 8);
		class446.aFloat4919 += (float) (method10781(-627148024) - i_2_ << 8);
		method7632(class446);
		class446.method5278();
		if (bool_3_)
			aString12162 = class526_sub36.method9637(-1495866034);
		else
			aString12162 = null;
		if (bool_4_)
			aString12170 = class526_sub36.method9637(-1495866034);
		else
			aString12170 = null;
		aClass624_12183 = ((Class624) Class561.findIdentifiable(Class624.method7418((byte) 68), class526_sub36.readByte((byte) 23), (byte) -123));
		if (Class521.aClass684_7051 == Class684.aClass684_8665 && client.anInt11064 * -1395039251 >= 2)
			aClass624_12183 = Class624.aClass624_8175;
		method10976(class526_sub36, i_1_, (byte) -55);
		aString12175 = class526_sub36.readString(-144108360);
		aString12161 = aString12175;
		if (this == Class451.localPlayer)
			RuntimeException_Sub3.aString12069 = aString12175;
		anInt12167 = class526_sub36.readUnsignedByte(553909152) * -365014159;
		if (bool) {
			anInt12171 = class526_sub36.readUnsignedShort(661759375) * -1415921091;
			if (65535 == anInt12171 * 186410261)
				anInt12171 = 1415921091;
			anInt12169 = -904447381 * anInt12167;
			anInt12168 = -1370279355;
		} else {
			anInt12171 = 0;
			anInt12169 = class526_sub36.readUnsignedByte(-1093590392) * -1340376517;
			anInt12168 = class526_sub36.readUnsignedByte(783921632) * 1370279355;
			if (-1240797325 * anInt12168 == 255)
				anInt12168 = -1370279355;
		}
		int i_5_ = anInt12179 * -1469591895;
		anInt12179 = class526_sub36.readUnsignedByte(-1063170490) * 219723161;
		if (0 != anInt12179 * -1469591895) {
			int i_6_ = 745424635 * anInt12160;
			int i_7_ = 1294430513 * anInt12176;
			int i_8_ = anInt12177 * 1464497723;
			int i_9_ = anInt12178 * -689708659;
			int i_10_ = -1381158401 * anInt12180;
			anInt12160 = class526_sub36.readUnsignedShort(398280110) * 364958771;
			anInt12176 = class526_sub36.readUnsignedShort(885285919) * -555202607;
			anInt12177 = class526_sub36.readUnsignedShort(1908304428) * 46854899;
			anInt12178 = class526_sub36.readUnsignedShort(2074963703) * -368096955;
			anInt12180 = class526_sub36.readUnsignedByte(-201562871) * 1821298175;
			if (anInt12179 * -1469591895 != i_5_ || 745424635 * anInt12160 != i_6_ || i_7_ != 1294430513 * anInt12176 || i_8_ != 1464497723 * anInt12177 || -689708659 * anInt12178 != i_9_
					|| anInt12180 * -1381158401 != i_10_)
				Class81.method1163(this, (byte) 4);
		} else
			Class491.method5875(this, 1873144743);
	}

	public void method10966(RSByteBuffer class526_sub36, byte i) {
		class526_sub36.pos = 0;
		int i_11_ = class526_sub36.readUnsignedByte(874421942);
		for (int i_12_ = 0; i_12_ < anIntArray12166.length; i_12_++) {
			if (0 != (i_11_ & 1 << i_12_)) {
				int i_13_ = class526_sub36.readUnsignedByte(1280404621);
				int i_14_ = class526_sub36.readUnsignedShort(923727134);
				anIntArray12166[i_12_] = i_13_;
				anIntArray12165[i_12_] = i_14_;
			} else {
				anIntArray12166[i_12_] = -1;
				anIntArray12165[i_12_] = -1;
			}
		}
	}

	void method10967(byte i) {
		for (int i_15_ = 0; i_15_ < anIntArray12166.length; i_15_++)
			anIntArray12166[i_15_] = -1;
		for (int i_16_ = 0; i_16_ < anIntArray12165.length; i_16_++)
			anIntArray12165[i_16_] = -1;
	}

	public Class639_Sub1_Sub2_Sub1_Sub1(Class549 class549) {
		super(class549, Class506.aClass97_Sub1_Sub1_5698);
		anIntArray12166 = new int[8];
		anIntArray12165 = new int[8];
		anInt12167 = 0;
		anInt12169 = 0;
		anInt12168 = -1370279355;
		anInt12171 = 0;
		anInt12172 = -1830298621;
		aBool12173 = false;
		anInt12174 = 0;
		anInt12160 = -364958771;
		anInt12176 = 555202607;
		anInt12177 = -46854899;
		anInt12178 = 368096955;
		anInt12179 = 0;
		anInt12180 = 574566657;
		aClass215_12182 = Class215.aClass215_2271;
		aClass624_12183 = Class624.aClass624_8175;
		aBool12184 = false;
		method10967((byte) -48);
	}

	Class555 method9825(Class174 class174, int i) {
		if (aClass633_12181 == null || !method10978(class174, 2048, 1083374847))
			return null;
		Class445 class445 = class174.method2319();
		Class445 class445_17_ = method7623();
		Class430 class430 = method7635();
		int i_18_ = aClass34_11940.method817(-1528609898);
		Class552 class552 = (aClass549_10826.aClass552ArrayArrayArray7287[aByte10827][(int) class430.aClass446_4816.aFloat4917 >> 9][(int) class430.aClass446_4816.aFloat4919 >> 9]);
		if (class552 != null && class552.aClass639_Sub1_Sub3_7355 != null) {
			int i_19_ = (-1438156659 * anInt11902 - class552.aClass639_Sub1_Sub3_7355.aShort11834);
			anInt11902 = -672986555 * (int) ((float) (-1438156659 * anInt11902) - (float) i_19_ / 10.0F);
		} else
			anInt11902 = (-672986555 * (int) ((float) (anInt11902 * -1438156659) - (float) (anInt11902 * -1438156659) / 10.0F));
		class445.method5242(class445_17_);
		class445.method5251(0.0F, (float) (-20 - -1438156659 * anInt11902), 0.0F);
		Class555 class555 = null;
		aBool11913 = false;
		if (Class230.preferences.aClass711_Sub3_10644.method9873(791124755) == 1) {
			RenderDef renderDef = method10786(-16777216);
			if (renderDef.aBool7733
					&& (-1 == aClass633_12181.anInt8252 * -1760242843 || ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, -1621067127))).animateIdle)) {
				Class704 class704 = ((aClass704_11915.method8218((byte) -28) && aClass704_11915.method8227((byte) 24)) ? aClass704_11915 : null);
				Class704_Sub3 class704_sub3 = ((aClass704_Sub3_11914.method8218((byte) -121) && (!aClass704_Sub3_11914.aBool10969 || null == class704)) ? aClass704_Sub3_11914 : null);
				short i_20_ = Class331.aClass613_3498.aShort8042;
				byte i_21_ = Class331.aClass613_3498.aByte8060;
				if (-1760242843 * aClass633_12181.anInt8252 != -1) {
					i_20_ = ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, -1439773447))).aShort3348;
					i_21_ = ((NPCDef) (Class76.loader.method89(aClass633_12181.anInt8252 * -1760242843, 195305142))).aByte3358;
				}
				Object object = null;
				Class168 class168;
				if (i_20_ > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1)
					class168 = Class193.method2808(class174, i_18_, 1194917821 * anInt11889, anInt11900 * -1966848677, anInt11901 * 361060487, aClass168Array11953[0], i_20_, i_21_,
							(class704_sub3 != null ? (Class704) class704_sub3 : class704), -1966164201);
				else
					class168 = Class178.method2666(class174, i_18_, 1194917821 * anInt11889, anInt11900 * -1966848677, 361060487 * anInt11901, 1, aClass168Array11953[0], 0, 0, 160, 240,
							(null != class704_sub3 ? (Class704) class704_sub3 : class704), 842641464);
				if (null != class168) {
					if (aClass164Array10829 == null || (aClass164Array10829.length < aClass168Array11953.length + 1))
						method9835(aClass168Array11953.length + 1, 1749715708);
					class555 = Class463.method5475(true, (short) 6650);
					aBool11913 = true;
					class174.method2328(false);
					class168.method1974(class445, (aClass164Array10829[aClass168Array11953.length]), 0);
					class174.method2328(true);
				}
			}
		}
		if (this == Class451.localPlayer) {
			for (int i_22_ = client.aClass113Array11018.length - 1; i_22_ >= 0; i_22_--) {
				Class113 class113 = client.aClass113Array11018[i_22_];
				if (class113 != null && 1794277271 * class113.anInt1366 != -1) {
					if (1 == class113.anInt1367 * -941650287) {
						LinkableObject class526_sub7 = ((LinkableObject) (client.npcs.get((long) (1579992317 * class113.anInt1361))));
						if (null != class526_sub7) {
							NPC class639_sub1_sub2_sub1_sub2 = ((NPC) class526_sub7.anObject10399);
							Class446 class446 = (Class446.method5275((class639_sub1_sub2_sub1_sub2.method7635().aClass446_4816),
									Class451.localPlayer.method7635().aClass446_4816));
							int i_23_ = (int) class446.aFloat4917;
							int i_24_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_23_, (long) i_24_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
					if (2 == -941650287 * class113.anInt1367) {
						Class446 class446 = (Class451.localPlayer.method7635().aClass446_4816);
						long l = (long) (998231709 * class113.anInt1363 - (int) class446.aFloat4917);
						long l_25_ = (long) (1251476749 * class113.anInt1365 - (int) class446.aFloat4919);
						long l_26_ = (long) (class113.anInt1368 * -1408633395 << 9);
						l_26_ *= l_26_;
						method10968(class174, class445, aClass168Array11953[0], l, l_25_, 1794277271 * class113.anInt1366, l_26_);
					}
					if (10 == class113.anInt1367 * -941650287 && 1579992317 * class113.anInt1361 >= 0 && (1579992317 * class113.anInt1361 < (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154).length)) {
						Class639_Sub1_Sub2_Sub1_Sub1 class639_sub1_sub2_sub1_sub1_27_ = (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[1579992317 * class113.anInt1361]);
						if (class639_sub1_sub2_sub1_sub1_27_ != null) {
							Class446 class446 = (Class446.method5275(class639_sub1_sub2_sub1_sub1_27_.method7635().aClass446_4816,
									Class451.localPlayer.method7635().aClass446_4816));
							int i_28_ = (int) class446.aFloat4917;
							int i_29_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_28_, (long) i_29_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
				}
			}
		}
		class445.method5242(class445_17_);
		class445.method5251(0.0F, (float) (-5 - anInt11902 * -1438156659), 0.0F);
		if (aClass164Array10829 == null || aClass164Array10829.length < aClass168Array11953.length)
			method9835(aClass168Array11953.length, -114609633);
		if (class555 == null)
			class555 = Class463.method5475(true, (short) 5352);
		method10776(class174, aClass168Array11953, class445, false, (byte) 69);
		for (int i_30_ = 0; i_30_ < aClass168Array11953.length; i_30_++) {
			if (null != aClass168Array11953[i_30_])
				aClass168Array11953[i_30_].method1974(class445, aClass164Array10829[i_30_], (Class451.localPlayer == this ? 1 : 0));
			else
				aClass164Array10829[i_30_].aBool1784 = false;
		}
		if (null != aClass614_11950) {
			Class177 class177 = aClass614_11950.method7253();
			class174.method2516(class177);
		}
		for (int i_31_ = 0; i_31_ < aClass168Array11953.length; i_31_++) {
			if (null != aClass168Array11953[i_31_])
				aBool11913 |= aClass168Array11953[i_31_].method2014();
			aClass168Array11953[i_31_] = null;
		}
		anInt11891 = -1513030831 * client.anInt11126;
		return class555;
	}

	void method9834(Class174 class174, int i) {
		if (null != aClass633_12181 && (aBool11930 || method10978(class174, 0, 1013769885))) {
			Class445 class445 = class174.method2319();
			class445.method5244(method7635());
			class445.method5251(0.0F, -5.0F, 0.0F);
			method10776(class174, aClass168Array11953, class445, aBool11930, (byte) 111);
			for (int i_32_ = 0; i_32_ < aClass168Array11953.length; i_32_++)
				aClass168Array11953[i_32_] = null;
		}
	}

	void method10968(Class174 class174, Class445 class445, Class168 class168, long l, long l_33_, int i, long l_34_) {
		long l_35_ = l_33_ * l_33_ + l * l;
		if (l_35_ >= 262144L && l_35_ <= l_34_) {
			int i_36_ = ((int) ((Math.atan2((double) l, (double) l_33_) * 2607.5945876176133) - (double) aClass34_11940.method817(-548920650)) & 0x3fff);
			Class168 class168_37_ = Class277.method3674(class174, i_36_, anInt11889 * 1194917821, -1966848677 * anInt11900, anInt11901 * 361060487, i, 2053958204);
			if (null != class168_37_) {
				class174.method2328(false);
				class168_37_.method1974(class445, null, 0);
				class174.method2328(true);
			}
		}
	}

	public int method10781(int i) {
		if (aClass633_12181 != null && -1 != -1760242843 * aClass633_12181.anInt8252)
			return (((NPCDef) Class76.loader.method89((-1760242843 * (aClass633_12181.anInt8252)), -588540134)).boundSize * 459047587);
		return super.method10781(-627148024);
	}

	public String method10969(boolean bool, int i) {
		if (bool)
			return aString12175;
		return aString12161;
	}

	public final void method10970(int i, int i_38_, byte i_39_, byte i_40_) {
		if (aClass704_11915.method8218((byte) -8) && (aClass704_11915.method8219((byte) 91).anInt2237 * -571300867 == 1)) {
			anIntArray11935 = null;
			aClass704_11915.method8246(-1, (byte) -7);
		}
		for (int i_41_ = 0; i_41_ < aClass510Array11906.length; i_41_++) {
			if (901715121 * aClass510Array11906[i_41_].anInt6980 != -1) {
				Class670 class670 = ((Class670) (Class689.aClass40_Sub12_8692.method89(aClass510Array11906[i_41_].anInt6980 * 901715121, -1063637886)));
				if (class670.aBool8552 && -1 != class670.anInt8550 * 1305328919
						&& (((Class206) Class388.aClass40_Sub15_4063.method89(((class670.anInt8550) * 1305328919), -1443340683)).anInt2237) * -571300867 == 1) {
					aClass510Array11906[i_41_].aClass704_6979.method8246(-1, (byte) -62);
					aClass510Array11906[i_41_].anInt6980 = -2069804113;
				}
			}
		}
		anInt12172 = -1830298621;
		if (i < 0 || i >= client.aClass505_11204.method6056(-1746741811) || i_38_ < 0 || i_38_ >= client.aClass505_11204.method6057(126749238))
			method10971(i, i_38_, 1583856392);
		else if (screenX[0] < 0 || (screenX[0] >= client.aClass505_11204.method6056(-1746741811)) || screenY[0] < 0
				|| (screenY[0] >= client.aClass505_11204.method6057(126749238)))
			method10971(i, i_38_, 2009462420);
		else
			method10972(i, i_38_, i_39_, (byte) 1);
	}

	public void method10971(int i, int i_42_, int i_43_) {
		anInt11943 = 0;
		anInt11948 = 0;
		anInt11957 = 0;
		screenX[0] = i;
		screenY[0] = i_42_;
		int i_44_ = method10781(-627148024);
		Class446 class446 = Class446.method5305(method7635().aClass446_4816);
		class446.aFloat4917 = (float) (i_44_ * 256 + screenX[0] * 512);
		class446.aFloat4919 = (float) (screenY[0] * 512 + 256 * i_44_);
		method7632(class446);
		class446.method5278();
		if (this == Class451.localPlayer)
			client.aClass505_11204.method6100((byte) -71).method7377((byte) 0);
		if (null != aClass614_11950)
			aClass614_11950.method7244();
	}

	final void method10972(int i, int i_45_, byte i_46_, byte i_47_) {
		if (anInt11943 * -577323399 < screenX.length - 1)
			anInt11943 += -808498231;
		for (int i_48_ = -577323399 * anInt11943; i_48_ > 0; i_48_--) {
			screenX[i_48_] = screenX[i_48_ - 1];
			screenY[i_48_] = screenY[i_48_ - 1];
			aByteArray11946[i_48_] = aByteArray11946[i_48_ - 1];
		}
		screenX[0] = i;
		screenY[0] = i_45_;
		aByteArray11946[0] = i_46_;
	}

	public final boolean method10973(byte i) {
		if (null == aClass633_12181)
			return false;
		return true;
	}

	int method10787(byte i) {
		return anInt12164 * -1773443593;
	}

	public int method10788(int i) {
		return -1;
	}

	boolean method9818(Class174 class174, int i, int i_49_, byte i_50_) {
		if (null == aClass633_12181 || !method10978(class174, 131072, 1464005867))
			return false;
		Class445 class445 = method7623();
		boolean bool = false;
		for (int i_51_ = 0; i_51_ < aClass168Array11953.length; i_51_++) {
			if (aClass168Array11953[i_51_] != null && aClass168Array11953[i_51_].aBool1909 && aClass168Array11953[i_51_].method1975(i, i_49_, class445, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_52_ = 0; i_52_ < aClass168Array11953.length; i_52_++)
			aClass168Array11953[i_52_] = null;
		return bool;
	}

	final boolean method9864(byte i) {
		return false;
	}

	final void method9823(Class174 class174, Class639_Sub1 class639_sub1, int i, int i_53_, int i_54_, boolean bool, int i_55_) {
		throw new IllegalStateException();
	}

	int method10772() {
		return anInt12164 * -1773443593;
	}

	public boolean method10782(int i) {
		return Class331.aClass613_3498.aBool8035;
	}

	public void method10974(String string, int i, int i_56_, byte i_57_) {
		method10780(string, i, i_56_, (Class636.method7565(1466056943) * (1187901009 * Class331.aClass613_3498.anInt8043)), -2003655410);
	}

	public int method10808() {
		if (aClass633_12181 != null && -1 != -1760242843 * aClass633_12181.anInt8252)
			return ((((NPCDef) Class76.loader.method89((-1760242843 * (aClass633_12181.anInt8252)), -1240303533)).boundSize) * 459047587);
		return super.method10781(-627148024);
	}

	final void method9842(int i) {
		throw new IllegalStateException();
	}

	Class555 method9844(Class174 class174) {
		if (aClass633_12181 == null || !method10978(class174, 2048, 1270110221))
			return null;
		Class445 class445 = class174.method2319();
		Class445 class445_58_ = method7623();
		Class430 class430 = method7635();
		int i = aClass34_11940.method817(-1799989584);
		Class552 class552 = (aClass549_10826.aClass552ArrayArrayArray7287[aByte10827][(int) class430.aClass446_4816.aFloat4917 >> 9][(int) class430.aClass446_4816.aFloat4919 >> 9]);
		if (class552 != null && class552.aClass639_Sub1_Sub3_7355 != null) {
			int i_59_ = (-1438156659 * anInt11902 - class552.aClass639_Sub1_Sub3_7355.aShort11834);
			anInt11902 = -672986555 * (int) ((float) (-1438156659 * anInt11902) - (float) i_59_ / 10.0F);
		} else
			anInt11902 = (-672986555 * (int) ((float) (anInt11902 * -1438156659) - (float) (anInt11902 * -1438156659) / 10.0F));
		class445.method5242(class445_58_);
		class445.method5251(0.0F, (float) (-20 - -1438156659 * anInt11902), 0.0F);
		Class555 class555 = null;
		aBool11913 = false;
		if (Class230.preferences.aClass711_Sub3_10644.method9873(1316134215) == 1) {
			RenderDef renderDef = method10786(-16777216);
			if (renderDef.aBool7733
					&& (-1 == aClass633_12181.anInt8252 * -1760242843 || ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, -1933685738))).animateIdle)) {
				Class704 class704 = ((aClass704_11915.method8218((byte) -118) && aClass704_11915.method8227((byte) -9)) ? aClass704_11915 : null);
				Class704_Sub3 class704_sub3 = ((aClass704_Sub3_11914.method8218((byte) -23) && (!aClass704_Sub3_11914.aBool10969 || null == class704)) ? aClass704_Sub3_11914 : null);
				short i_60_ = Class331.aClass613_3498.aShort8042;
				byte i_61_ = Class331.aClass613_3498.aByte8060;
				if (-1760242843 * aClass633_12181.anInt8252 != -1) {
					i_60_ = ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, -1447264450))).aShort3348;
					i_61_ = ((NPCDef) (Class76.loader.method89(aClass633_12181.anInt8252 * -1760242843, 213260101))).aByte3358;
				}
				Object object = null;
				Class168 class168;
				if (i_60_ > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1)
					class168 = Class193.method2808(class174, i, 1194917821 * anInt11889, anInt11900 * -1966848677, anInt11901 * 361060487, aClass168Array11953[0], i_60_, i_61_,
							(class704_sub3 != null ? (Class704) class704_sub3 : class704), -1998495898);
				else
					class168 = Class178.method2666(class174, i, 1194917821 * anInt11889, anInt11900 * -1966848677, 361060487 * anInt11901, 1, aClass168Array11953[0], 0, 0, 160, 240,
							(null != class704_sub3 ? (Class704) class704_sub3 : class704), 939229301);
				if (null != class168) {
					if (aClass164Array10829 == null || (aClass164Array10829.length < aClass168Array11953.length + 1))
						method9835(aClass168Array11953.length + 1, 636884964);
					class555 = Class463.method5475(true, (short) 8964);
					aBool11913 = true;
					class174.method2328(false);
					class168.method1974(class445, (aClass164Array10829[aClass168Array11953.length]), 0);
					class174.method2328(true);
				}
			}
		}
		if (this == Class451.localPlayer) {
			for (int i_62_ = client.aClass113Array11018.length - 1; i_62_ >= 0; i_62_--) {
				Class113 class113 = client.aClass113Array11018[i_62_];
				if (class113 != null && 1794277271 * class113.anInt1366 != -1) {
					if (1 == class113.anInt1367 * -941650287) {
						LinkableObject class526_sub7 = ((LinkableObject) (client.npcs.get((long) (1579992317 * class113.anInt1361))));
						if (null != class526_sub7) {
							NPC class639_sub1_sub2_sub1_sub2 = ((NPC) class526_sub7.anObject10399);
							Class446 class446 = (Class446.method5275((class639_sub1_sub2_sub1_sub2.method7635().aClass446_4816),
									Class451.localPlayer.method7635().aClass446_4816));
							int i_63_ = (int) class446.aFloat4917;
							int i_64_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_63_, (long) i_64_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
					if (2 == -941650287 * class113.anInt1367) {
						Class446 class446 = (Class451.localPlayer.method7635().aClass446_4816);
						long l = (long) (998231709 * class113.anInt1363 - (int) class446.aFloat4917);
						long l_65_ = (long) (1251476749 * class113.anInt1365 - (int) class446.aFloat4919);
						long l_66_ = (long) (class113.anInt1368 * -1408633395 << 9);
						l_66_ *= l_66_;
						method10968(class174, class445, aClass168Array11953[0], l, l_65_, 1794277271 * class113.anInt1366, l_66_);
					}
					if (10 == class113.anInt1367 * -941650287 && 1579992317 * class113.anInt1361 >= 0 && (1579992317 * class113.anInt1361 < (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154).length)) {
						Class639_Sub1_Sub2_Sub1_Sub1 class639_sub1_sub2_sub1_sub1_67_ = (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[1579992317 * class113.anInt1361]);
						if (class639_sub1_sub2_sub1_sub1_67_ != null) {
							Class446 class446 = (Class446.method5275(class639_sub1_sub2_sub1_sub1_67_.method7635().aClass446_4816,
									Class451.localPlayer.method7635().aClass446_4816));
							int i_68_ = (int) class446.aFloat4917;
							int i_69_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_68_, (long) i_69_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
				}
			}
		}
		class445.method5242(class445_58_);
		class445.method5251(0.0F, (float) (-5 - anInt11902 * -1438156659), 0.0F);
		if (aClass164Array10829 == null || aClass164Array10829.length < aClass168Array11953.length)
			method9835(aClass168Array11953.length, 1601007860);
		if (class555 == null)
			class555 = Class463.method5475(true, (short) 5007);
		method10776(class174, aClass168Array11953, class445, false, (byte) 48);
		for (int i_70_ = 0; i_70_ < aClass168Array11953.length; i_70_++) {
			if (null != aClass168Array11953[i_70_])
				aClass168Array11953[i_70_].method1974(class445, aClass164Array10829[i_70_], (Class451.localPlayer == this ? 1 : 0));
			else
				aClass164Array10829[i_70_].aBool1784 = false;
		}
		if (null != aClass614_11950) {
			Class177 class177 = aClass614_11950.method7253();
			class174.method2516(class177);
		}
		for (int i_71_ = 0; i_71_ < aClass168Array11953.length; i_71_++) {
			if (null != aClass168Array11953[i_71_])
				aBool11913 |= aClass168Array11953[i_71_].method2014();
			aClass168Array11953[i_71_] = null;
		}
		anInt11891 = -1513030831 * client.anInt11126;
		return class555;
	}

	public Class440 method198(int i) {
		Class440 class440 = Class440.method5192();
		class440.method5160(Class443.method5200(aClass34_11940.anInt370 * 604797385), 0.0F, 0.0F);
		return class440;
	}

	public Class446 method188(int i) {
		return Class446.method5312();
	}

	public int method10795(int i) {
		return -(828574411 * index) - 1;
	}

	public int method92() {
		return index * 828574411;
	}

	public Class526_Sub32 method191() {
		Class596 class596 = client.aClass505_11204.method6128(2112432520);
		return (Class163.method1925(aByte10827, ((int) method7635().aClass446_4816.aFloat4917 + -507706880 * class596.localX), -(int) method7635().aClass446_4816.aFloat4915,
				((int) method7635().aClass446_4816.aFloat4919 + 747559424 * class596.localY), (byte) 83));
	}

	int method10770() {
		return anInt12164 * -1773443593;
	}

	public Class526_Sub32 method192() {
		Class596 class596 = client.aClass505_11204.method6128(2029500953);
		return (Class163.method1925(aByte10827, ((int) method7635().aClass446_4816.aFloat4917 + -507706880 * class596.localX), -(int) method7635().aClass446_4816.aFloat4915,
				((int) method7635().aClass446_4816.aFloat4919 + 747559424 * class596.localY), (byte) 83));
	}

	public Class440 method193() {
		Class440 class440 = Class440.method5192();
		class440.method5160(Class443.method5200(aClass34_11940.anInt370 * 604797385), 0.0F, 0.0F);
		return class440;
	}

	public Class440 method194() {
		Class440 class440 = Class440.method5192();
		class440.method5160(Class443.method5200(aClass34_11940.anInt370 * 604797385), 0.0F, 0.0F);
		return class440;
	}

	public Class440 method195() {
		Class440 class440 = Class440.method5192();
		class440.method5160(Class443.method5200(aClass34_11940.anInt370 * 604797385), 0.0F, 0.0F);
		return class440;
	}

	public Class440 method196() {
		Class440 class440 = Class440.method5192();
		class440.method5160(Class443.method5200(aClass34_11940.anInt370 * 604797385), 0.0F, 0.0F);
		return class440;
	}

	public Class440 method190() {
		Class440 class440 = Class440.method5192();
		class440.method5160(Class443.method5200(aClass34_11940.anInt370 * 604797385), 0.0F, 0.0F);
		return class440;
	}

	public Class446 method185() {
		return Class446.method5312();
	}

	public Class446 method199() {
		return Class446.method5312();
	}

	public Class446 method200() {
		return Class446.method5312();
	}

	public Class295 method189() {
		return Class295.aClass295_3190;
	}

	public Class550 method9856(Class174 class174) {
		return null;
	}

	public int method10813() {
		return -1;
	}

	Class555 method9828(Class174 class174) {
		if (aClass633_12181 == null || !method10978(class174, 2048, 2012687920))
			return null;
		Class445 class445 = class174.method2319();
		Class445 class445_72_ = method7623();
		Class430 class430 = method7635();
		int i = aClass34_11940.method817(-680416783);
		Class552 class552 = (aClass549_10826.aClass552ArrayArrayArray7287[aByte10827][(int) class430.aClass446_4816.aFloat4917 >> 9][(int) class430.aClass446_4816.aFloat4919 >> 9]);
		if (class552 != null && class552.aClass639_Sub1_Sub3_7355 != null) {
			int i_73_ = (-1438156659 * anInt11902 - class552.aClass639_Sub1_Sub3_7355.aShort11834);
			anInt11902 = -672986555 * (int) ((float) (-1438156659 * anInt11902) - (float) i_73_ / 10.0F);
		} else
			anInt11902 = (-672986555 * (int) ((float) (anInt11902 * -1438156659) - (float) (anInt11902 * -1438156659) / 10.0F));
		class445.method5242(class445_72_);
		class445.method5251(0.0F, (float) (-20 - -1438156659 * anInt11902), 0.0F);
		Class555 class555 = null;
		aBool11913 = false;
		if (Class230.preferences.aClass711_Sub3_10644.method9873(1292034072) == 1) {
			RenderDef renderDef = method10786(-16777216);
			if (renderDef.aBool7733
					&& (-1 == aClass633_12181.anInt8252 * -1760242843 || ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, -813719510))).animateIdle)) {
				Class704 class704 = ((aClass704_11915.method8218((byte) -17) && aClass704_11915.method8227((byte) -31)) ? aClass704_11915 : null);
				Class704_Sub3 class704_sub3 = ((aClass704_Sub3_11914.method8218((byte) -42) && (!aClass704_Sub3_11914.aBool10969 || null == class704)) ? aClass704_Sub3_11914 : null);
				short i_74_ = Class331.aClass613_3498.aShort8042;
				byte i_75_ = Class331.aClass613_3498.aByte8060;
				if (-1760242843 * aClass633_12181.anInt8252 != -1) {
					i_74_ = ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, -219097754))).aShort3348;
					i_75_ = ((NPCDef) (Class76.loader.method89(aClass633_12181.anInt8252 * -1760242843, -79016590))).aByte3358;
				}
				Object object = null;
				Class168 class168;
				if (i_74_ > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1)
					class168 = Class193.method2808(class174, i, 1194917821 * anInt11889, anInt11900 * -1966848677, anInt11901 * 361060487, aClass168Array11953[0], i_74_, i_75_,
							(class704_sub3 != null ? (Class704) class704_sub3 : class704), -1845359048);
				else
					class168 = Class178.method2666(class174, i, 1194917821 * anInt11889, anInt11900 * -1966848677, 361060487 * anInt11901, 1, aClass168Array11953[0], 0, 0, 160, 240,
							(null != class704_sub3 ? (Class704) class704_sub3 : class704), 2019831525);
				if (null != class168) {
					if (aClass164Array10829 == null || (aClass164Array10829.length < aClass168Array11953.length + 1))
						method9835(aClass168Array11953.length + 1, 499981057);
					class555 = Class463.method5475(true, (short) 15681);
					aBool11913 = true;
					class174.method2328(false);
					class168.method1974(class445, (aClass164Array10829[aClass168Array11953.length]), 0);
					class174.method2328(true);
				}
			}
		}
		if (this == Class451.localPlayer) {
			for (int i_76_ = client.aClass113Array11018.length - 1; i_76_ >= 0; i_76_--) {
				Class113 class113 = client.aClass113Array11018[i_76_];
				if (class113 != null && 1794277271 * class113.anInt1366 != -1) {
					if (1 == class113.anInt1367 * -941650287) {
						LinkableObject class526_sub7 = ((LinkableObject) (client.npcs.get((long) (1579992317 * class113.anInt1361))));
						if (null != class526_sub7) {
							NPC class639_sub1_sub2_sub1_sub2 = ((NPC) class526_sub7.anObject10399);
							Class446 class446 = (Class446.method5275((class639_sub1_sub2_sub1_sub2.method7635().aClass446_4816),
									Class451.localPlayer.method7635().aClass446_4816));
							int i_77_ = (int) class446.aFloat4917;
							int i_78_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_77_, (long) i_78_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
					if (2 == -941650287 * class113.anInt1367) {
						Class446 class446 = (Class451.localPlayer.method7635().aClass446_4816);
						long l = (long) (998231709 * class113.anInt1363 - (int) class446.aFloat4917);
						long l_79_ = (long) (1251476749 * class113.anInt1365 - (int) class446.aFloat4919);
						long l_80_ = (long) (class113.anInt1368 * -1408633395 << 9);
						l_80_ *= l_80_;
						method10968(class174, class445, aClass168Array11953[0], l, l_79_, 1794277271 * class113.anInt1366, l_80_);
					}
					if (10 == class113.anInt1367 * -941650287 && 1579992317 * class113.anInt1361 >= 0 && (1579992317 * class113.anInt1361 < (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154).length)) {
						Class639_Sub1_Sub2_Sub1_Sub1 class639_sub1_sub2_sub1_sub1_81_ = (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[1579992317 * class113.anInt1361]);
						if (class639_sub1_sub2_sub1_sub1_81_ != null) {
							Class446 class446 = (Class446.method5275(class639_sub1_sub2_sub1_sub1_81_.method7635().aClass446_4816,
									Class451.localPlayer.method7635().aClass446_4816));
							int i_82_ = (int) class446.aFloat4917;
							int i_83_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_82_, (long) i_83_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
				}
			}
		}
		class445.method5242(class445_72_);
		class445.method5251(0.0F, (float) (-5 - anInt11902 * -1438156659), 0.0F);
		if (aClass164Array10829 == null || aClass164Array10829.length < aClass168Array11953.length)
			method9835(aClass168Array11953.length, 750859469);
		if (class555 == null)
			class555 = Class463.method5475(true, (short) 2099);
		method10776(class174, aClass168Array11953, class445, false, (byte) 80);
		for (int i_84_ = 0; i_84_ < aClass168Array11953.length; i_84_++) {
			if (null != aClass168Array11953[i_84_])
				aClass168Array11953[i_84_].method1974(class445, aClass164Array10829[i_84_], (Class451.localPlayer == this ? 1 : 0));
			else
				aClass164Array10829[i_84_].aBool1784 = false;
		}
		if (null != aClass614_11950) {
			Class177 class177 = aClass614_11950.method7253();
			class174.method2516(class177);
		}
		for (int i_85_ = 0; i_85_ < aClass168Array11953.length; i_85_++) {
			if (null != aClass168Array11953[i_85_])
				aBool11913 |= aClass168Array11953[i_85_].method2014();
			aClass168Array11953[i_85_] = null;
		}
		anInt11891 = -1513030831 * client.anInt11126;
		return class555;
	}

	boolean method10975(Class174 class174, int i) {
		int i_86_ = i;
		RenderDef renderDef = method10786(-16777216);
		Class704 class704 = ((aClass704_11915.method8218((byte) -107) && !aClass704_11915.method8227((byte) 30)) ? aClass704_11915 : null);
		Class704_Sub3 class704_sub3 = ((aClass704_Sub3_11914.method8218((byte) -105) && !aBool12173 && (!aClass704_Sub3_11914.aBool10969 || null == class704)) ? aClass704_Sub3_11914 : null);
		int i_87_ = renderDef.anInt7714 * -1579527151;
		int i_88_ = renderDef.anInt7725 * 1378869757;
		if (i_87_ != 0 || 0 != i_88_ || 0 != renderDef.anInt7727 * -1326543223 || 0 != 359293787 * renderDef.anInt7730)
			i |= 0x7;
		int i_89_ = aClass34_11940.method817(-1431316001);
		boolean bool = (aByte11893 != 0 && client.anInt11012 >= anInt11926 * -1334443687 && client.anInt11012 < anInt11933 * 2055682623);
		if (bool)
			i |= 0x80000;
		Class168 class168 = (aClass168Array11953[0] = aClass633_12181.method7504(class174, i, Class227.aClass40_Sub16_2327, Class264.aClass40_Sub9_2970, Class76.loader,
				Class448_Sub1.aClass40_Sub1_10233, Class242.aClass94_2456, Class242.aClass94_2456, class704, class704_sub3, aClass704_Sub2_Sub1Array11916, anIntArray11898, i_89_, true,
				Class710.aClass620_8851, (short) 19461));
		int i_90_ = Class199_Sub19.method9033(549827275);
		if (Class499.anInt5628 * -642600783 < 96 && i_90_ > 50)
			Class311.method4069((byte) 1);
		if (Class521.aClass684_7051 != Class684.aClass684_8665 && i_90_ < 50) {
			int i_91_;
			for (i_91_ = 50 - i_90_; i_91_ > client.anInt11045 * 1047163987; client.anInt11045 += -1950879781)
				Class587.aByteArrayArray7797[1047163987 * client.anInt11045] = new byte[102400];
			while (i_91_ < client.anInt11045 * 1047163987) {
				client.anInt11045 -= -1950879781;
				Class587.aByteArrayArray7797[1047163987 * client.anInt11045] = null;
			}
		} else if (Class521.aClass684_7051 != Class684.aClass684_8665) {
			Class587.aByteArrayArray7797 = new byte[50][];
			client.anInt11045 = 0;
		}
		if (class168 == null)
			return false;
		anInt11892 = class168.method1981() * -839025111;
		anInt11918 = class168.method1985() * 1403769243;
		class168.method2063();
		method10783(class168, 2129134104);
		if (0 != i_87_ || 0 != i_88_) {
			method10801(i_89_, i_87_, i_88_, renderDef.anInt7726 * 699225925, renderDef.anInt7696 * 1863865935, (byte) 97);
			if (anInt11889 * 1194917821 != 0)
				class168.method2076(1194917821 * anInt11889);
			if (0 != -1966848677 * anInt11900)
				class168.method1954(-1966848677 * anInt11900);
			if (anInt11901 * 361060487 != 0)
				class168.method1955(0, anInt11901 * 361060487, 0);
		} else
			method10801(i_89_, method10781(-627148024) << 9, method10781(-627148024) << 9, 0, 0, (byte) 42);
		if (bool)
			class168.method2020(aByte11928, aByte11929, aByte11899, aByte11893 & 0xff);
		if (!aBool12173)
			method10784(class174, renderDef, i_86_, i_87_, i_88_, i_89_, (byte) -32);
		return true;
	}

	void method9848(Class174 class174) {
		if (null != aClass633_12181 && (aBool11930 || method10978(class174, 0, 1058469975))) {
			Class445 class445 = class174.method2319();
			class445.method5244(method7635());
			class445.method5251(0.0F, -5.0F, 0.0F);
			method10776(class174, aClass168Array11953, class445, aBool11930, (byte) 56);
			for (int i = 0; i < aClass168Array11953.length; i++)
				aClass168Array11953[i] = null;
		}
	}

	boolean method9849(Class174 class174, int i, int i_92_) {
		if (null == aClass633_12181 || !method10978(class174, 131072, 1457091510))
			return false;
		Class445 class445 = method7623();
		boolean bool = false;
		for (int i_93_ = 0; i_93_ < aClass168Array11953.length; i_93_++) {
			if (aClass168Array11953[i_93_] != null && aClass168Array11953[i_93_].aBool1909 && aClass168Array11953[i_93_].method1975(i, i_92_, class445, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_94_ = 0; i_94_ < aClass168Array11953.length; i_94_++)
			aClass168Array11953[i_94_] = null;
		return bool;
	}

	final boolean method9850() {
		return false;
	}

	public Class550 method9829(Class174 class174) {
		return null;
	}

	final void method9860(Class174 class174, Class639_Sub1 class639_sub1, int i, int i_95_, int i_96_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method10976(RSByteBuffer class526_sub36, byte i, byte i_97_) {
		aByte12163 = i;
		int i_98_ = -1;
		anInt12174 = 0;
		int[] is = new int[Class710.aClass620_8851.anIntArray8123.length];
		Class19[] class19s = new Class19[Class710.aClass620_8851.anIntArray8123.length];
		Class11[] class11s = new Class11[Class710.aClass620_8851.anIntArray8123.length];
		for (int i_99_ = 0; i_99_ < Class710.aClass620_8851.anIntArray8123.length; i_99_++) {
			if (1 != Class710.aClass620_8851.anIntArray8123[i_99_]) {
				int i_100_ = class526_sub36.readUnsignedByte(1749562167);
				if (0 == i_100_)
					is[i_99_] = 0;
				else {
					int i_101_ = class526_sub36.readUnsignedByte(-1099930585);
					int i_102_ = (i_100_ << 8) + i_101_;
					if (0 == i_99_ && i_102_ == 65535) {
						i_98_ = class526_sub36.readBigSmart((byte) -68);
						anInt12174 = class526_sub36.readUnsignedByte(278529510) * 200846731;
						break;
					}
					if (i_102_ >= 16384) {
						i_102_ -= 16384;
						is[i_99_] = i_102_ | 0x40000000;
						class11s[i_99_] = (Class11) Class448_Sub1.aClass40_Sub1_10233.method89(i_102_, -1760353249);
						int i_103_ = -361554935 * class11s[i_99_].anInt132;
						if (0 != i_103_)
							anInt12174 = 200846731 * i_103_;
					} else
						is[i_99_] = i_102_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_98_ == -1) {
			int i_104_ = class526_sub36.readUnsignedShort(380738048);
			int i_105_ = 0;
			for (int i_106_ = 0; i_106_ < Class710.aClass620_8851.anIntArray8123.length; i_106_++) {
				if (Class710.aClass620_8851.anIntArray8123[i_106_] == 0) {
					if ((i_104_ & 1 << i_105_) != 0)
						class19s[i_106_] = Class630.method7478(class11s[i_106_], class526_sub36, 750341079);
					i_105_++;
				}
			}
		}
		int[] is_107_ = new int[10];
		for (int i_108_ = 0; i_108_ < 10; i_108_++) {
			int i_109_ = class526_sub36.readUnsignedByte(262104957);
			if (Class510.aShortArrayArrayArray6984.length < 1 || i_109_ < 0 || (i_109_ >= Class510.aShortArrayArrayArray6984[i_108_][0].length))
				i_109_ = 0;
			is_107_[i_108_] = i_109_;
		}
		int[] is_110_ = new int[10];
		for (int i_111_ = 0; i_111_ < 10; i_111_++) {
			int i_112_ = class526_sub36.readUnsignedByte(689242370);
			if (Class537.aShortArrayArrayArray7205.length < 1 || i_112_ < 0 || (i_112_ >= Class537.aShortArrayArrayArray7205[i_111_][0].length))
				i_112_ = 0;
			is_110_[i_111_] = i_112_;
		}
		anInt12164 = class526_sub36.readUnsignedShort(769782525) * -1224283193;
		if (aClass633_12181 == null)
			aClass633_12181 = new Class633();
		int i_113_ = aClass633_12181.anInt8252 * -1760242843;
		int[] is_114_ = aClass633_12181.anIntArray8245;
		aClass633_12181.method7519(method10787((byte) -10), is, class19s, is_107_, is_110_, 1 == aByte12163, i_98_, -1321245848);
		if (i_113_ != i_98_) {
			Class446 class446 = Class446.method5305(method7635().aClass446_4816);
			class446.aFloat4917 = (float) ((screenX[0] << 9) + (method10781(-627148024) << 8));
			class446.aFloat4919 = (float) ((screenY[0] << 9) + (method10781(-627148024) << 8));
			method7632(class446);
			class446.method5278();
		}
		if (index * 828574411 == -1204447689 * client.localPlayerIndex && is_114_ != null) {
			for (int i_115_ = 0; i_115_ < is_107_.length; i_115_++) {
				if (is_107_[i_115_] != is_114_[i_115_]) {
					Class448_Sub1.aClass40_Sub1_10233.method10237((byte) 0);
					break;
				}
			}
		}
		if (aClass614_11950 != null)
			aClass614_11950.method7244();
		if (aClass704_Sub3_11914.method8218((byte) -107) && aClass704_Sub3_11914.aBool10969) {
			RenderDef renderDef = method10786(-16777216);
			if (!renderDef.method6921(aClass704_Sub3_11914.method8220(-2106518100), (byte) 43)) {
				aClass704_Sub3_11914.method8246(-1, (byte) -10);
				aClass704_Sub3_11914.aBool10969 = false;
			}
		}
	}

	final void method9847() {
		throw new IllegalStateException();
	}

	public int method10806() {
		if (aClass633_12181 != null && -1 != -1760242843 * aClass633_12181.anInt8252)
			return (((NPCDef) Class76.loader.method89((-1760242843 * (aClass633_12181.anInt8252)), 19880781)).boundSize * 459047587);
		return super.method10781(-627148024);
	}

	public int method10807() {
		if (aClass633_12181 != null && -1 != -1760242843 * aClass633_12181.anInt8252)
			return (((NPCDef) Class76.loader.method89((-1760242843 * (aClass633_12181.anInt8252)), -577366555)).boundSize * 459047587);
		return super.method10781(-627148024);
	}

	public Class550 method9827(Class174 class174, int i) {
		return null;
	}

	public Class550 method9840(Class174 class174) {
		return null;
	}

	Class555 method9858(Class174 class174) {
		if (aClass633_12181 == null || !method10978(class174, 2048, 1398262202))
			return null;
		Class445 class445 = class174.method2319();
		Class445 class445_116_ = method7623();
		Class430 class430 = method7635();
		int i = aClass34_11940.method817(366440457);
		Class552 class552 = (aClass549_10826.aClass552ArrayArrayArray7287[aByte10827][(int) class430.aClass446_4816.aFloat4917 >> 9][(int) class430.aClass446_4816.aFloat4919 >> 9]);
		if (class552 != null && class552.aClass639_Sub1_Sub3_7355 != null) {
			int i_117_ = (-1438156659 * anInt11902 - class552.aClass639_Sub1_Sub3_7355.aShort11834);
			anInt11902 = -672986555 * (int) ((float) (-1438156659 * anInt11902) - (float) i_117_ / 10.0F);
		} else
			anInt11902 = (-672986555 * (int) ((float) (anInt11902 * -1438156659) - (float) (anInt11902 * -1438156659) / 10.0F));
		class445.method5242(class445_116_);
		class445.method5251(0.0F, (float) (-20 - -1438156659 * anInt11902), 0.0F);
		Class555 class555 = null;
		aBool11913 = false;
		if (Class230.preferences.aClass711_Sub3_10644.method9873(410454591) == 1) {
			RenderDef renderDef = method10786(-16777216);
			if (renderDef.aBool7733
					&& (-1 == aClass633_12181.anInt8252 * -1760242843 || ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, 195289496))).animateIdle)) {
				Class704 class704 = ((aClass704_11915.method8218((byte) -76) && aClass704_11915.method8227((byte) 5)) ? aClass704_11915 : null);
				Class704_Sub3 class704_sub3 = ((aClass704_Sub3_11914.method8218((byte) -99) && (!aClass704_Sub3_11914.aBool10969 || null == class704)) ? aClass704_Sub3_11914 : null);
				short i_118_ = Class331.aClass613_3498.aShort8042;
				byte i_119_ = Class331.aClass613_3498.aByte8060;
				if (-1760242843 * aClass633_12181.anInt8252 != -1) {
					i_118_ = ((NPCDef) (Class76.loader.method89(-1760242843 * aClass633_12181.anInt8252, 390563943))).aShort3348;
					i_119_ = ((NPCDef) (Class76.loader.method89(aClass633_12181.anInt8252 * -1760242843, -513663813))).aByte3358;
				}
				Object object = null;
				Class168 class168;
				if (i_118_ > -1 && Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1)
					class168 = Class193.method2808(class174, i, 1194917821 * anInt11889, anInt11900 * -1966848677, anInt11901 * 361060487, aClass168Array11953[0], i_118_, i_119_,
							(class704_sub3 != null ? (Class704) class704_sub3 : class704), -2130666110);
				else
					class168 = Class178.method2666(class174, i, 1194917821 * anInt11889, anInt11900 * -1966848677, 361060487 * anInt11901, 1, aClass168Array11953[0], 0, 0, 160, 240,
							(null != class704_sub3 ? (Class704) class704_sub3 : class704), 2054006496);
				if (null != class168) {
					if (aClass164Array10829 == null || (aClass164Array10829.length < aClass168Array11953.length + 1))
						method9835(aClass168Array11953.length + 1, -536405745);
					class555 = Class463.method5475(true, (short) 4107);
					aBool11913 = true;
					class174.method2328(false);
					class168.method1974(class445, (aClass164Array10829[aClass168Array11953.length]), 0);
					class174.method2328(true);
				}
			}
		}
		if (this == Class451.localPlayer) {
			for (int i_120_ = client.aClass113Array11018.length - 1; i_120_ >= 0; i_120_--) {
				Class113 class113 = client.aClass113Array11018[i_120_];
				if (class113 != null && 1794277271 * class113.anInt1366 != -1) {
					if (1 == class113.anInt1367 * -941650287) {
						LinkableObject class526_sub7 = ((LinkableObject) (client.npcs.get((long) (1579992317 * class113.anInt1361))));
						if (null != class526_sub7) {
							NPC class639_sub1_sub2_sub1_sub2 = ((NPC) class526_sub7.anObject10399);
							Class446 class446 = (Class446.method5275((class639_sub1_sub2_sub1_sub2.method7635().aClass446_4816),
									Class451.localPlayer.method7635().aClass446_4816));
							int i_121_ = (int) class446.aFloat4917;
							int i_122_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_121_, (long) i_122_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
					if (2 == -941650287 * class113.anInt1367) {
						Class446 class446 = (Class451.localPlayer.method7635().aClass446_4816);
						long l = (long) (998231709 * class113.anInt1363 - (int) class446.aFloat4917);
						long l_123_ = (long) (1251476749 * class113.anInt1365 - (int) class446.aFloat4919);
						long l_124_ = (long) (class113.anInt1368 * -1408633395 << 9);
						l_124_ *= l_124_;
						method10968(class174, class445, aClass168Array11953[0], l, l_123_, 1794277271 * class113.anInt1366, l_124_);
					}
					if (10 == class113.anInt1367 * -941650287 && 1579992317 * class113.anInt1361 >= 0 && (1579992317 * class113.anInt1361 < (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154).length)) {
						Class639_Sub1_Sub2_Sub1_Sub1 class639_sub1_sub2_sub1_sub1_125_ = (client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[1579992317 * class113.anInt1361]);
						if (class639_sub1_sub2_sub1_sub1_125_ != null) {
							Class446 class446 = (Class446.method5275(class639_sub1_sub2_sub1_sub1_125_.method7635().aClass446_4816,
									Class451.localPlayer.method7635().aClass446_4816));
							int i_126_ = (int) class446.aFloat4917;
							int i_127_ = (int) class446.aFloat4919;
							method10968(class174, class445, aClass168Array11953[0], (long) i_126_, (long) i_127_, class113.anInt1366 * 1794277271, 92160000L);
						}
					}
				}
			}
		}
		class445.method5242(class445_116_);
		class445.method5251(0.0F, (float) (-5 - anInt11902 * -1438156659), 0.0F);
		if (aClass164Array10829 == null || aClass164Array10829.length < aClass168Array11953.length)
			method9835(aClass168Array11953.length, 247079184);
		if (class555 == null)
			class555 = Class463.method5475(true, (short) 26797);
		method10776(class174, aClass168Array11953, class445, false, (byte) 43);
		for (int i_128_ = 0; i_128_ < aClass168Array11953.length; i_128_++) {
			if (null != aClass168Array11953[i_128_])
				aClass168Array11953[i_128_].method1974(class445, aClass164Array10829[i_128_], (Class451.localPlayer == this ? 1 : 0));
			else
				aClass164Array10829[i_128_].aBool1784 = false;
		}
		if (null != aClass614_11950) {
			Class177 class177 = aClass614_11950.method7253();
			class174.method2516(class177);
		}
		for (int i_129_ = 0; i_129_ < aClass168Array11953.length; i_129_++) {
			if (null != aClass168Array11953[i_129_])
				aBool11913 |= aClass168Array11953[i_129_].method2014();
			aClass168Array11953[i_129_] = null;
		}
		anInt11891 = -1513030831 * client.anInt11126;
		return class555;
	}

	int method10811() {
		return anInt12164 * -1773443593;
	}

	public int method87(int i) {
		return index * 828574411;
	}

	public boolean method10818() {
		return Class331.aClass613_3498.aBool8035;
	}

	public boolean method10816() {
		return Class331.aClass613_3498.aBool8035;
	}

	public boolean method10810() {
		return Class331.aClass613_3498.aBool8035;
	}

	public Class541 method10809() {
		if (aClass541_11903 != null) {
			if (null == aClass541_11903.aString7228)
				return null;
			if (-1527682435 * client.publicTradeStatus == 0 || -1527682435 * client.publicTradeStatus == 3 || (1 == client.publicTradeStatus * -1527682435 && Class607.method7147(aString12161, 1995206889)))
				return aClass541_11903;
		}
		return null;
	}

	public int method10821() {
		return -(828574411 * index) - 1;
	}

	public int method10804() {
		return -(828574411 * index) - 1;
	}

	int method10812() {
		return anInt12164 * -1773443593;
	}

	public Class526_Sub32 method187() {
		Class596 class596 = client.aClass505_11204.method6128(2064462483);
		return (Class163.method1925(aByte10827, ((int) method7635().aClass446_4816.aFloat4917 + -507706880 * class596.localX), -(int) method7635().aClass446_4816.aFloat4915,
				((int) method7635().aClass446_4816.aFloat4919 + 747559424 * class596.localY), (byte) 94));
	}

	final boolean method9851() {
		return false;
	}

	public Class550 method9843(Class174 class174) {
		return null;
	}

	public Class541 method10790(byte i) {
		if (aClass541_11903 != null) {
			if (null == aClass541_11903.aString7228)
				return null;
			if (-1527682435 * client.publicTradeStatus == 0 || -1527682435 * client.publicTradeStatus == 3 || (1 == client.publicTradeStatus * -1527682435 && Class607.method7147(aString12161, 339190387)))
				return aClass541_11903;
		}
		return null;
	}

	public String method10977(boolean bool, byte i) {
		String string = "";
		if (null != aString12162)
			string = aString12162;
		if (bool)
			string = new StringBuilder().append(string).append(aString12175).toString();
		else
			string = new StringBuilder().append(string).append(aString12161).toString();
		if (null != aString12170)
			string = new StringBuilder().append(string).append(aString12170).toString();
		return string;
	}

	boolean method10978(Class174 class174, int i, int i_130_) {
		int i_131_ = i;
		RenderDef renderDef = method10786(-16777216);
		Class704 class704 = ((aClass704_11915.method8218((byte) -31) && !aClass704_11915.method8227((byte) 2)) ? aClass704_11915 : null);
		Class704_Sub3 class704_sub3 = ((aClass704_Sub3_11914.method8218((byte) -85) && !aBool12173 && (!aClass704_Sub3_11914.aBool10969 || null == class704)) ? aClass704_Sub3_11914 : null);
		int i_132_ = renderDef.anInt7714 * -1579527151;
		int i_133_ = renderDef.anInt7725 * 1378869757;
		if (i_132_ != 0 || 0 != i_133_ || 0 != renderDef.anInt7727 * -1326543223 || 0 != 359293787 * renderDef.anInt7730)
			i |= 0x7;
		int i_134_ = aClass34_11940.method817(-536146919);
		boolean bool = (aByte11893 != 0 && client.anInt11012 >= anInt11926 * -1334443687 && client.anInt11012 < anInt11933 * 2055682623);
		if (bool)
			i |= 0x80000;
		Class168 class168 = (aClass168Array11953[0] = aClass633_12181.method7504(class174, i, Class227.aClass40_Sub16_2327, Class264.aClass40_Sub9_2970, Class76.loader,
				Class448_Sub1.aClass40_Sub1_10233, Class242.aClass94_2456, Class242.aClass94_2456, class704, class704_sub3, aClass704_Sub2_Sub1Array11916, anIntArray11898, i_134_, true,
				Class710.aClass620_8851, (short) 14602));
		int i_135_ = Class199_Sub19.method9033(-1459920125);
		if (Class499.anInt5628 * -642600783 < 96 && i_135_ > 50)
			Class311.method4069((byte) 1);
		if (Class521.aClass684_7051 != Class684.aClass684_8665 && i_135_ < 50) {
			int i_136_;
			for (i_136_ = 50 - i_135_; i_136_ > client.anInt11045 * 1047163987; client.anInt11045 += -1950879781)
				Class587.aByteArrayArray7797[1047163987 * client.anInt11045] = new byte[102400];
			while (i_136_ < client.anInt11045 * 1047163987) {
				client.anInt11045 -= -1950879781;
				Class587.aByteArrayArray7797[1047163987 * client.anInt11045] = null;
			}
		} else if (Class521.aClass684_7051 != Class684.aClass684_8665) {
			Class587.aByteArrayArray7797 = new byte[50][];
			client.anInt11045 = 0;
		}
		if (class168 == null)
			return false;
		anInt11892 = class168.method1981() * -839025111;
		anInt11918 = class168.method1985() * 1403769243;
		class168.method2063();
		method10783(class168, 2129134104);
		if (0 != i_132_ || 0 != i_133_) {
			method10801(i_134_, i_132_, i_133_, renderDef.anInt7726 * 699225925, renderDef.anInt7696 * 1863865935, (byte) 61);
			if (anInt11889 * 1194917821 != 0)
				class168.method2076(1194917821 * anInt11889);
			if (0 != -1966848677 * anInt11900)
				class168.method1954(-1966848677 * anInt11900);
			if (anInt11901 * 361060487 != 0)
				class168.method1955(0, anInt11901 * 361060487, 0);
		} else
			method10801(i_134_, method10781(-627148024) << 9, method10781(-627148024) << 9, 0, 0, (byte) 6);
		if (bool)
			class168.method2020(aByte11928, aByte11929, aByte11899, aByte11893 & 0xff);
		if (!aBool12173)
			method10784(class174, renderDef, i_131_, i_132_, i_133_, i_134_, (byte) -13);
		return true;
	}

	public final boolean method10979() {
		if (null == aClass633_12181)
			return false;
		return true;
	}

	final void method9853(Class174 class174, Class639_Sub1 class639_sub1, int i, int i_137_, int i_138_, boolean bool) {
		throw new IllegalStateException();
	}

	static boolean method10980(int i) {
		if (null == Class517.aClass526_Sub21_Sub6_7040)
			return false;
		if (976428997 * Class517.aClass526_Sub21_Sub6_7040.anInt11659 >= 2000)
			Class517.aClass526_Sub21_Sub6_7040.anInt11659 -= 1514608016;
		if (1007 == 976428997 * Class517.aClass526_Sub21_Sub6_7040.anInt11659)
			return true;
		return false;
	}
}
