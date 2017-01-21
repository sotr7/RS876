package com.jagex;

import com.jagex.Class108;
import com.jagex.Class11;
import com.jagex.Class201;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.NPCDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class408;
import com.jagex.Class448_Sub1;
import com.jagex.Class451;
import com.jagex.Class526_Sub31;
import com.jagex.Buffer;
import com.jagex.LinkableObject;
import com.jagex.Class539_Sub6;
import com.jagex.Class610;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.client;
import java.awt.Font;
import java.io.File;

public class Class497 {
	static Font aFont5566;
	public static int anInt5567;
	public static String aString5565;
	public static String aString5564;
	static String aString5562;
	public static String aString5563;

	Class497() throws Throwable {
		throw new Error();
	}

	static {
		String var0 = "Unknown";

		try {
			var0 = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception var7) {
			;
		}

		var0.toLowerCase();
		var0 = "Unknown";

		try {
			var0 = System.getProperty("java.version").toLowerCase();
		} catch (Exception var6) {
			;
		}

		var0.toLowerCase();
		var0 = "Unknown";

		try {
			var0 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var5) {
			;
		}

		aString5565 = var0.toLowerCase();
		var0 = "Unknown";

		try {
			var0 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var4) {
			;
		}

		aString5564 = var0.toLowerCase();
		var0 = "Unknown";

		try {
			var0 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var3) {
			;
		}

		aString5562 = var0.toLowerCase();
		aString5563 = String.format("%s (%s) [%s]", new Object[] { aString5565, aString5564, aString5562 });
		var0 = "~/";

		try {
			var0 = System.getProperty("user.home").toLowerCase();
		} catch (Exception var2) {
			;
		}

		new File(var0);
	}

	static final void method5916(Class681 var0, int var1) {
		InterfaceDef var2 = Class221.method3095(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (byte) 51);
		var2.aClass245Array2662 = null;
		var2.aClass245Array2530 = null;
		Class526_Sub31.method9555(var2, (byte) 10);
	}

	static final void method5917(Class681 var0, byte var1) {
		int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
		var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class11) Class448_Sub1.aClass40_Sub1_10233.method89(var2, -191417745)).anInt98 * -1108189599;
	}

	static final void method5918(Class681 var0, int var1) {
		int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
		Class11 var3 = (Class11) Class448_Sub1.aClass40_Sub1_10233.method89(var2, -1924192105);
		var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 2 == 1095415197 * var3.anInt116 ? 1 : 0;
	}

	static final void method5919(Class681 var0, int var1) {
		int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
		InterfaceDef var3 = Class221.method3095(var2, (byte) -98);
		Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
		Class201.method2877(var3, var4, var0, (byte) 28);
	}

	static final void addLocalNpc(int var0, byte var1) {
		Buffer buffer = client.aClass111_11060.buffer;

		while (buffer.available(client.aClass111_11060.currentFrame * -1225783061, (byte) 43) >= 15) {
			int index = buffer.readBit(15, 673441488);
			if (index == 32767) {
				break;
			}

			boolean newNPC = false;
			LinkableObject linkable = (LinkableObject) client.npcs.get((long) index);
			NPC npc;
			if (null == linkable) {
				npc = new NPC(client.aClass505_11204.method6072(-1723200623));
				npc.index = 1016367843 * index;
				linkable = new LinkableObject(npc);
				client.npcs.put(linkable, (long) index);
				client.aClass526_Sub7Array11050[(client.anInt11051 += 253277107) * 2027369339 - 1] = linkable;
				newNPC = true;
			}

			npc = (NPC) linkable.anObject10399;
			client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = index;
			npc.lastUpdate = -1436243651 * client.anInt10980;
			if (npc.def != null && npc.def.method4055(345938152)) {
				Class108.method1352(npc, (byte) -22);
			}

			int direction = buffer.readBit(3, 673441488) + 4 << 11 & 16383;
			int stateUpdate = buffer.readBit(1, 673441488);
			if (1 == stateUpdate) {
				client.anIntArray11055[(client.anInt11065 += -813378921) * 1544015143 - 1] = index;
			}

			int dx = buffer.readBit(var0, 673441488);
			if (dx > (1 << var0 - 1) - 1) {
				dx -= 1 << var0;
			}

			npc.setDefinition((NPCDef) Class76.loader.method89(buffer.readBit(15, 673441488), -1464803435), -1957887669);
			int dy = buffer.readBit(var0, 673441488);
			if (dy > (1 << var0 - 1) - 1) {
				dy -= 1 << var0;
			}

			int plane = buffer.readBit(2, 673441488);
			int discardQueue = buffer.readBit(1, 673441488);
			npc.setBoundSize(459047587 * npc.def.boundSize, (byte) 84);
			npc.anInt11938 = 446106299 * (-739260225 * npc.def.contrast << 3);
			if (newNPC) {
				npc.turn(direction, true, -1139476648);
			}

			npc.move(plane, dx + Class451.localPlayer.screenX[0], Class451.localPlayer.screenY[0] + dy, discardQueue == 1, npc.method10781(-627148024), 534492912);
			if (npc.def.method4055(1903263586)) {
				Class408.method4893(npc.aByte10827, npc.screenX[0], npc.screenY[0], 0, (Class610) null, npc, (Class639_Sub1_Sub2_Sub1_Sub1) null, -1056598282);
			}

			if (newNPC) {
				npc.method10989(54403760);
			}
		}

		buffer.finishBitAccess((byte) 102);
	}

	static final void method5921(Class681 var0, int var1) {
		if (Class539_Sub6.aClass698_10363 == null) {
			var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
		} else {
			var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 2094456825 * Class539_Sub6.aClass698_10363.anInt8766;
		}

	}
}
