/* Class653 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.image.BufferedImage;

public class Class653 implements Interface12, Interface5 {
	public boolean aBool8465;
	int anInt8466;
	public int anInt8467 = 0;
	public int anInt8468 = -2093160633;
	public boolean aBool8469;
	public int anInt8470;
	public int anInt8471;
	public int anInt8472;
	public int anInt8473;
	public boolean aBool8474 = true;
	public int anInt8475;
	public int anInt8476;
	public int anInt8477;
	static final int anInt8478 = 1190717;
	public int anInt8479;
	public int anInt8480;

	static int method7784(int i) {
		if (i == 16711935)
			return -1;
		return Class495.method5910(i, -1566261537);
	}

	public void method82(RSByteBuffer class526_sub36, int i) {
		for (;;) {
			int i_0_ = class526_sub36.readUnsignedByte(-1595253235);
			if (i_0_ == 0)
				break;
			method7786(class526_sub36, i_0_, (byte) -40);
		}
	}

	public void method49(int i, int i_1_) {
		anInt8466 = 1929941937 * i;
	}

	Class653() {
		anInt8470 = -1939628399;
		anInt8471 = -376037888;
		aBool8469 = true;
		anInt8473 = -1831055784;
		aBool8465 = false;
		anInt8472 = 2055181147;
		anInt8475 = 1906936128;
		anInt8477 = -1692780771;
		anInt8476 = -1624173963;
		anInt8479 = 0;
		anInt8480 = -1112807104;
	}

	static int method7785(int i) {
		if (i == 16711935)
			return -1;
		return Class495.method5910(i, -1566261537);
	}

	public void method83(RSByteBuffer class526_sub36) {
		for (;;) {
			int i = class526_sub36.readUnsignedByte(1925125375);
			if (i == 0)
				break;
			method7786(class526_sub36, i, (byte) 35);
		}
	}

	public void method84(RSByteBuffer class526_sub36) {
		for (;;) {
			int i = class526_sub36.readUnsignedByte(461453606);
			if (i == 0)
				break;
			method7786(class526_sub36, i, (byte) 5);
		}
	}

	void method7786(RSByteBuffer class526_sub36, int i, byte i_2_) {
		if (i == 1)
			anInt8467 = Class636.method7561(class526_sub36.read24BitInt(742041327), -2142501790) * -779151931;
		else if (2 == i)
			anInt8468 = class526_sub36.readUnsignedByte(519650882) * 2093160633;
		else if (3 == i) {
			anInt8468 = class526_sub36.readUnsignedShort(19570672) * 2093160633;
			if (65535 == anInt8468 * -1072075383)
				anInt8468 = -2093160633;
		} else if (i == 5)
			aBool8474 = false;
		else if (7 == i)
			anInt8470 = Class636.method7561(class526_sub36.read24BitInt(742041327), -420409096) * 1939628399;
		else if (8 != i) {
			if (9 == i)
				anInt8471 = ((class526_sub36.readUnsignedShort(2063073054) << 2) * -915092721);
			else if (10 == i)
				aBool8469 = false;
			else if (11 == i)
				anInt8473 = class526_sub36.readUnsignedByte(250015400) * 1918601675;
			else if (i == 12)
				aBool8465 = true;
			else if (i == 13)
				anInt8472 = class526_sub36.read24BitInt(742041327) * -1140653449;
			else if (i == 14)
				anInt8475 = ((class526_sub36.readUnsignedByte(-1755377106) << 2) * 1975952933);
			else if (16 == i)
				anInt8477 = class526_sub36.readUnsignedByte(-31032863) * -158225437;
			else if (i == 20)
				anInt8476 = class526_sub36.readUnsignedShort(1918351082) * -2071003061;
			else if (21 == i)
				anInt8479 = class526_sub36.readUnsignedByte(-531022689) * -1084645003;
			else if (i == 22)
				anInt8480 = class526_sub36.readUnsignedShort(854814269) * 1257680805;
		}
	}

	public void method50(int i) {
		anInt8466 = 1929941937 * i;
	}

	public void method51(int i) {
		anInt8466 = 1929941937 * i;
	}

	void method7787(RSByteBuffer class526_sub36, int i) {
		if (i == 1)
			anInt8467 = Class636.method7561(class526_sub36.read24BitInt(742041327), 110284269) * -779151931;
		else if (2 == i)
			anInt8468 = class526_sub36.readUnsignedByte(-1994516191) * 2093160633;
		else if (3 == i) {
			anInt8468 = class526_sub36.readUnsignedShort(689763469) * 2093160633;
			if (65535 == anInt8468 * -1072075383)
				anInt8468 = -2093160633;
		} else if (i == 5)
			aBool8474 = false;
		else if (7 == i)
			anInt8470 = Class636.method7561(class526_sub36.read24BitInt(742041327), 1547604400) * 1939628399;
		else if (8 != i) {
			if (9 == i)
				anInt8471 = (class526_sub36.readUnsignedShort(613694842) << 2) * -915092721;
			else if (10 == i)
				aBool8469 = false;
			else if (11 == i)
				anInt8473 = class526_sub36.readUnsignedByte(-733884073) * 1918601675;
			else if (i == 12)
				aBool8465 = true;
			else if (i == 13)
				anInt8472 = class526_sub36.read24BitInt(742041327) * -1140653449;
			else if (i == 14)
				anInt8475 = ((class526_sub36.readUnsignedByte(-436869169) << 2) * 1975952933);
			else if (16 == i)
				anInt8477 = class526_sub36.readUnsignedByte(671767505) * -158225437;
			else if (i == 20)
				anInt8476 = class526_sub36.readUnsignedShort(595631060) * -2071003061;
			else if (21 == i)
				anInt8479 = class526_sub36.readUnsignedByte(431581323) * -1084645003;
			else if (i == 22)
				anInt8480 = class526_sub36.readUnsignedShort(1744318705) * 1257680805;
		}
	}

	void method7788(RSByteBuffer class526_sub36, int i) {
		if (i == 1)
			anInt8467 = Class636.method7561(class526_sub36.read24BitInt(742041327), 1481237648) * -779151931;
		else if (2 == i)
			anInt8468 = class526_sub36.readUnsignedByte(-1126376356) * 2093160633;
		else if (3 == i) {
			anInt8468 = class526_sub36.readUnsignedShort(298706848) * 2093160633;
			if (65535 == anInt8468 * -1072075383)
				anInt8468 = -2093160633;
		} else if (i == 5)
			aBool8474 = false;
		else if (7 == i)
			anInt8470 = Class636.method7561(class526_sub36.read24BitInt(742041327), 398950855) * 1939628399;
		else if (8 != i) {
			if (9 == i)
				anInt8471 = (class526_sub36.readUnsignedShort(101827371) << 2) * -915092721;
			else if (10 == i)
				aBool8469 = false;
			else if (11 == i)
				anInt8473 = class526_sub36.readUnsignedByte(-1809330336) * 1918601675;
			else if (i == 12)
				aBool8465 = true;
			else if (i == 13)
				anInt8472 = class526_sub36.read24BitInt(742041327) * -1140653449;
			else if (i == 14)
				anInt8475 = ((class526_sub36.readUnsignedByte(-781970198) << 2) * 1975952933);
			else if (16 == i)
				anInt8477 = class526_sub36.readUnsignedByte(-1073464206) * -158225437;
			else if (i == 20)
				anInt8476 = class526_sub36.readUnsignedShort(1626870624) * -2071003061;
			else if (21 == i)
				anInt8479 = class526_sub36.readUnsignedByte(-578840653) * -1084645003;
			else if (i == 22)
				anInt8480 = class526_sub36.readUnsignedShort(1135014569) * 1257680805;
		}
	}

	void method7789(RSByteBuffer class526_sub36, int i) {
		if (i == 1)
			anInt8467 = Class636.method7561(class526_sub36.read24BitInt(742041327), 910115485) * -779151931;
		else if (2 == i)
			anInt8468 = class526_sub36.readUnsignedByte(1530774668) * 2093160633;
		else if (3 == i) {
			anInt8468 = class526_sub36.readUnsignedShort(1225661579) * 2093160633;
			if (65535 == anInt8468 * -1072075383)
				anInt8468 = -2093160633;
		} else if (i == 5)
			aBool8474 = false;
		else if (7 == i)
			anInt8470 = Class636.method7561(class526_sub36.read24BitInt(742041327), 125621181) * 1939628399;
		else if (8 != i) {
			if (9 == i)
				anInt8471 = ((class526_sub36.readUnsignedShort(1659913734) << 2) * -915092721);
			else if (10 == i)
				aBool8469 = false;
			else if (11 == i)
				anInt8473 = class526_sub36.readUnsignedByte(-1056642497) * 1918601675;
			else if (i == 12)
				aBool8465 = true;
			else if (i == 13)
				anInt8472 = class526_sub36.read24BitInt(742041327) * -1140653449;
			else if (i == 14)
				anInt8475 = ((class526_sub36.readUnsignedByte(-1786416459) << 2) * 1975952933);
			else if (16 == i)
				anInt8477 = class526_sub36.readUnsignedByte(22399347) * -158225437;
			else if (i == 20)
				anInt8476 = class526_sub36.readUnsignedShort(1889169706) * -2071003061;
			else if (21 == i)
				anInt8479 = class526_sub36.readUnsignedByte(-140979524) * -1084645003;
			else if (i == 22)
				anInt8480 = class526_sub36.readUnsignedShort(70746887) * 1257680805;
		}
	}

	static int method7790(int i) {
		if (i == 16711935)
			return -1;
		return Class495.method5910(i, -1566261537);
	}

	public void method85() {
		anInt8473 = 1918601675 * (2088260579 * anInt8473 << 8 | 2056770897 * anInt8466);
	}

	public void method81(int i) {
		anInt8473 = 1918601675 * (2088260579 * anInt8473 << 8 | 2056770897 * anInt8466);
	}

	static int method7791(int i) {
		if (i == 16711935)
			return -1;
		return Class495.method5910(i, -1566261537);
	}

	static void method7792(Class526_Sub21_Sub19 class526_sub21_sub19, int i, Class681 class681, byte i_3_) {
		class681.anInt8623 = 0;
		class681.anInt8625 = 0;
		class681.anInt8644 = 873681181;
		class681.aClass526_Sub21_Sub19_8629 = class526_sub21_sub19;
		class681.aClass508Array8634 = class681.aClass526_Sub21_Sub19_8629.aClass508Array11859;
		class681.anIntArray8642 = class681.aClass526_Sub21_Sub19_8629.anIntArray11860;
		Class508 class508 = null;
		class681.anInt8617 = 0;
		class681.aMap8638.clear();
		class681.aMap8638.put(Class452.aClass452_4946, Class242.aClass94_2456.aClass600_1154);
		class681.aMap8638.put(Class452.aClass452_4938, Class538.aClass149_Sub1_7225);
		class681.aMap8638.put(Class452.aClass452_4942, Class414.aClass149_4465);
		if (null != class681.aClass348_8633)
			class681.aMap8638.put(Class452.aClass452_4936, Class219.method3039(class681.aClass348_8633, -547031260));
		if (class681.aClass639_Sub1_Sub2_Sub1_8635 instanceof NPC)
			class681.aMap8638.put(Class452.aClass452_4937,
					(class681.aClass639_Sub1_Sub2_Sub1_8635.anInterface18_11936));
		if (class681.aClass639_Sub1_Sub2_Sub1_8635 instanceof Class639_Sub1_Sub2_Sub1_Sub1)
			class681.aMap8627.put(Class452.aClass452_4946,
					(class681.aClass639_Sub1_Sub2_Sub1_8635.anInterface18_11936));
		if (Class566.aClass223_7610 != null)
			class681.aMap8638.put(Class452.aClass452_4944, Class566.aClass223_7610.method3112(211154835));
		try {
			try {
				Class680.anInt8606 = 0;
				for (;;) {
					Class680.anInt8606 += -834274493;
					if (867232107 * Class680.anInt8606 > i)
						throw new RuntimeException("");
					class508 = (class681.aClass508Array8634[(class681.anInt8644 += -873681181) * -244840757]);
					if (Class680.aBool8610 && (Class680.aString8604 == null
							|| ((class681.aClass526_Sub21_Sub19_8629.aString11858) != null
									&& class681.aClass526_Sub21_Sub19_8629.aString11858
											.indexOf(Class680.aString8604) != -1)))
						System.out.println(new StringBuilder().append(class681.aClass526_Sub21_Sub19_8629.aString11858)
								.append(": ").append(class508).toString());
					if (1 == (class681.anIntArray8642[class681.anInt8644 * -244840757]))
						class681.aBool8628 = true;
					else
						class681.aBool8628 = false;
					if (Class508.aClass508_6009 == class508 && 0 == class681.anInt8617 * 1253690475) {
						Class571.method6894((byte) 0);
						break;
					}
					Class439.method5156(class508, class681, -1553454196);
				}
			} catch (Exception exception) {
				Class329_Sub2.method9120(class681, class508, exception, "S", 571172422);
				Class571.method6894((byte) 0);
			}
		} catch (Exception object) {
			Class571.method6894((byte) 0);
			throw object;
		}
	}

	static final void method7793(Class681 class681, int i) {
		int i_4_ = (class681.anIntArray8622[(class681.anInt8623 -= -1957887669) * -1730576285]);
		InterfaceDef interfaceDef = Class221.method3095(i_4_, (byte) -60);
		Class243 class243 = Class315_Sub1.aClass243Array10033[i_4_ >> 16];
		Class578.method6944(interfaceDef, class243, class681, -1672867388);
	}

	static final void method7794(Class681 class681, byte i) {
		class681.anInt8623 -= -1957887669;
		int i_5_ = class681.anIntArray8622[-1730576285 * class681.anInt8623];
		Class526_Sub21_Sub10 class526_sub21_sub10 = Class196.method2833(i_5_, (byte) 116);
		if (class526_sub21_sub10 != null) {
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285 - 1] = -258291063
					* class526_sub21_sub10.anInt11721;
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629 - 1] = Class214.method2962(
					(9208759340883999679L * class526_sub21_sub10.aLong11722),
					(-398271091 * Class26.aClass673_247.anInt8576), 65535);
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285
					- 1] = class526_sub21_sub10.anInt11723 * -1204898995;
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629
					- 1] = (class526_sub21_sub10.aString11724 != null ? class526_sub21_sub10.aString11724 : "");
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629
					- 1] = (class526_sub21_sub10.aString11725 != null ? class526_sub21_sub10.aString11725 : "");
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629
					- 1] = (class526_sub21_sub10.aString11726 != null ? class526_sub21_sub10.aString11726 : "");
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629
					- 1] = (null != class526_sub21_sub10.aString11727 ? class526_sub21_sub10.aString11727 : "");
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285 - 1] = 1683330373
					* class526_sub21_sub10.anInt11730;
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629
					- 1] = (class526_sub21_sub10.aString11728 != null ? class526_sub21_sub10.aString11728 : "");
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285
					- 1] = (null != class526_sub21_sub10.aClass415_11720
							? class526_sub21_sub10.aClass415_11720.getId() : -1);
		} else {
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629 - 1] = "";
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629 - 1] = "";
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629 - 1] = "";
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629 - 1] = "";
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629 - 1] = "";
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
			class681.anObjectArray8624[(class681.anInt8625 += 2019513325) * 540934629 - 1] = "";
			class681.anIntArray8622[(class681.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
		}
	}

	static final void method7795(InterfaceDef interfaceDef, Class243 class243, Class681 class681, byte i) {
		String string = (String) (class681.anObjectArray8624[(class681.anInt8625 -= 2019513325) * 540934629]);
		if (Class149.method1747(string, class681, (byte) 0) != null)
			string = string.substring(0, string.length() - 1);
		interfaceDef.anObjectArray2607 = Class615.method7280(string, class681, -1812203207);
		interfaceDef.aBool2560 = true;
	}

	public static int[] method7796(BufferedImage bufferedimage, int i) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_6_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i_7_ = 0; i_7_ < is_6_.length; i_7_++)
					is_6_[i_7_] = is[i_7_] + ((is[i_7_] << 16) + (is[i_7_] << 8)) + -16777216;
			} else {
				for (int i_8_ = 0; i_8_ < is_6_.length; i_8_++) {
					int i_9_ = 2 * i_8_;
					is_6_[i_8_] = ((is[i_9_ + 1] << 24) + is[i_9_] + ((is[i_9_] << 16) + (is[i_9_] << 8)));
				}
			}
			return is_6_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0,
				bufferedimage.getWidth());
	}

	static final void method7797(InterfaceDef interfaceDef, Class681 class681, int i) {
		class681.anInt8623 -= -1578695711;
		int i_10_ = class681.anIntArray8622[-1730576285 * class681.anInt8623] - 1;
		int i_11_ = class681.anIntArray8622[1 + class681.anInt8623 * -1730576285];
		int i_12_ = class681.anIntArray8622[2 + class681.anInt8623 * -1730576285];
		if (i_10_ < 0 || i_10_ > 9)
			throw new RuntimeException();
		Class507.method6155(interfaceDef, i_10_, i_11_, i_12_, class681, -752831413);
	}
}
