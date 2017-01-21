package com.jagex;

import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class466;
import com.jagex.Buffer;
import com.jagex.LinkableObject;
import com.jagex.Class561;
import com.jagex.Class592;
import com.jagex.NPC;
import com.jagex.NPCDirection;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.client;

public class Class666 {
	static Class466 aClass466_8527;
	static char[] aCharArray8526 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d',
			'\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

	public static boolean method7953(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (0 != var0) {
				char[] var1 = aCharArray8526;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	public static boolean method7954(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (0 != var0) {
				char[] var1 = aCharArray8526;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	Class666() throws Throwable {
		throw new Error();
	}

	static final void processNPCMovement(byte var0) {
		Buffer buffer = client.aClass111_11060.buffer;
		buffer.disableBitAccess(385105555);

		int count = buffer.readBit(8, 673441488);
		int index;
		if (count < 1139938345 * client.npcCount) {
			for (index = count; index < 1139938345 * client.npcCount; ++index) {
				client.removedNpcIndices[(client.removedNpcCount += 1420914505) * 1035645689 - 1] = client.npcsIndicies[index];
			}
		}

		if (count > client.npcCount * 1139938345) {
			throw new RuntimeException();
		} else {
			client.npcCount = 0;

			for (index = 0; index < count; ++index) {
				int npcIndex = client.npcsIndicies[index];
				NPC npc = (NPC) ((LinkableObject) client.npcs.get((long) npcIndex)).anObject10399;

				int moved = buffer.readBit(1, 673441488);
				if (0 == moved) {
					client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = npcIndex;
					npc.lastUpdate = -1436243651 * client.anInt10980;
				} else {
					int type = buffer.readBit(2, 673441488);

					if (type == 0) {
						client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = npcIndex;
						npc.lastUpdate = client.anInt10980 * -1436243651;
						client.anIntArray11055[(client.anInt11065 += -813378921) * 1544015143 - 1] = npcIndex;
					} else {
						NPCDirection firstDirection;
						if (type == 1) {
							client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = npcIndex;
							npc.lastUpdate = client.anInt10980 * -1436243651;
							firstDirection = (NPCDirection) Class561.findIdentifiable(Class592.valuesOf(-1874991208), buffer.readBit(3, 673441488), (byte) -106);
							npc.move(firstDirection, MovementDirection.WALKING.id, -1918787122);
							
							int maskUpdate = buffer.readBit(1, 673441488);
							if (1 == maskUpdate) {
								client.anIntArray11055[(client.anInt11065 += -813378921) * 1544015143 - 1] = npcIndex;
							}
						} else if (type == 2) {
							client.npcsIndicies[(client.npcCount += -465778663) * 1139938345 - 1] = npcIndex;
							npc.lastUpdate = client.anInt10980 * -1436243651;
							if (buffer.readBit(1, 673441488) == 1) {
								firstDirection = (NPCDirection) Class561.findIdentifiable(Class592.valuesOf(-2073330132), buffer.readBit(3, 673441488), (byte) -16);
								npc.move(firstDirection, MovementDirection.RUNNING.id, -2133872537);
								NPCDirection secondDirection = (NPCDirection) Class561.findIdentifiable(Class592.valuesOf(-1672654520), buffer.readBit(3, 673441488), (byte) 0);
								npc.move(secondDirection, MovementDirection.RUNNING.id, -1686986726);
							} else {
								firstDirection = (NPCDirection) Class561.findIdentifiable(Class592.valuesOf(-1676079274), buffer.readBit(3, 673441488), (byte) -108);
								npc.move(firstDirection, MovementDirection.TELEPORTING.id, -1868811992);
							}

							int maskUpdate = buffer.readBit(1, 673441488);
							if (maskUpdate == 1) {
								client.anIntArray11055[(client.anInt11065 += -813378921) * 1544015143 - 1] = npcIndex;
							}
						} else if (3 == type) {
							client.removedNpcIndices[(client.removedNpcCount += 1420914505) * 1035645689 - 1] = npcIndex;
						}
					}
				}
			}

		}
	}

	static final void method7956(Class681 var0, int var1) {
		int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
		InterfaceDef var3 = Class221.method3095(var2, (byte) 7);
		if (var3.aString2593 == null) {
			var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
		} else {
			var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString2593;
		}

	}
}
