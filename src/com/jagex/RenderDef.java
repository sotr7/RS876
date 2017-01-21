package com.jagex;

import com.jagex.Class20;
import com.jagex.Class237;
import com.jagex.InterfaceDef;
import com.jagex.Class31;
import com.jagex.Class40_Sub21;
import com.jagex.Class433;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class460;
import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class588;
import com.jagex.Class679;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Interface12;
import com.jagex.Interface5;
import java.util.Arrays;
import java.util.Iterator;

public class RenderDef implements Interface5, Interface12 {
	public int standAnimation = -1091988301;
	public int walkAnimation = -126041105;
	public int moveType1Anim = 2013971973;
	public int type1_180 = -1152456187;
	public int type1_90 = -298616021;
	public int type1_90_counter = 1335258299;
	public int runAnimation = -153856325;
	public int runRotate180Animation = 1855234777;
	public int runRotate90Animation = -897376457;
	public int runRotate90CounterAnimation = 556259403;
	public int anInt7714 = 0;
	public int anInt7725 = 0;
	public int[] anIntArray7722;
	public int[][] anIntArrayArray7704;
	public int anInt7716 = 0;
	public int anInt7724 = 0;
	public int anInt7723 = 0;
	public int anInt7700 = 0;
	public int anInt7727 = 0;
	public int anInt7720 = 0;
	public int anInt7729 = 0;
	public int anInt7730 = 0;
	public int anInt7731 = 219515623;
	public int walkUpwardsAnimation = 793107371;
	public int anInt7695 = -307802543;
	public int rotate180Animation = -1794388301;
	public int rotate90Animation = -1728954743;
	public int rotate90CounterAnimation = -2143181915;
	public int anInt7732 = -227354615;
	public int anInt7708 = -155609563;
	public int anInt7709 = -255757047;
	public int anInt7718 = 41625093;
	public int anInt7721 = 949711233;
	public int anInt7712 = -594618269;
	public int anInt7713 = 702683517;
	public int[] loopAnimations = null;
	public int[] loopAnimDurations = null;
	public boolean aBool7733 = true;
	public int anInt7726 = 0;
	public int anInt7696 = 0;
	int anInt7693 = 0;
	public int[] anIntArray7699;
	public int[][] anIntArrayArray7698;
	Class445[] aClass445Array7711;

	public void method50(int var1) {
	}

	void decode(RSByteBuffer buffer, int opcode, byte var3) {
		if (1 == opcode) {
			this.standAnimation = buffer.readBigSmart((byte) -68) * 1091988301;
			this.walkAnimation = buffer.readBigSmart((byte) 0) * 126041105;
		} else if (2 == opcode) {
			this.moveType1Anim = buffer.readBigSmart((byte) -93) * -2013971973;
		} else if (3 == opcode) {
			this.type1_180 = buffer.readBigSmart((byte) -53) * 1152456187;
		} else if (4 == opcode) {
			this.type1_90 = buffer.readBigSmart((byte) 28) * 298616021;
		} else if (opcode == 5) {
			this.type1_90_counter = buffer.readBigSmart((byte) 6) * -1335258299;
		} else if (opcode == 6) {
			this.runAnimation = buffer.readBigSmart((byte) -38) * 153856325;
		} else if (opcode == 7) {
			this.runRotate180Animation = buffer.readBigSmart((byte) -87) * -1855234777;
		} else if (8 == opcode) {
			this.runRotate90Animation = buffer.readBigSmart((byte) -47) * 897376457;
		} else if (opcode == 9) {
			this.runRotate90CounterAnimation = buffer.readBigSmart((byte) -13) * -556259403;
		} else if (26 == opcode) {
			this.anInt7714 = (short) (buffer.readUnsignedByte(-1011077750) * 4) * -1930093327;
			this.anInt7725 = (short) (buffer.readUnsignedByte(-969830928) * 4) * 545522517;
		} else {
			int count;
			int var5;
			if (27 == opcode) {
				count = buffer.readUnsignedByte(1289875470);
				if (null == this.anIntArrayArray7704) {
					this.anIntArrayArray7704 = new int[count + 1][];
				} else if (count >= this.anIntArrayArray7704.length) {
					this.anIntArrayArray7704 = (int[][]) ((int[][]) Arrays.copyOf(this.anIntArrayArray7704, count + 1));
				}

				this.anIntArrayArray7704[count] = new int[6];

				for (var5 = 0; var5 < 6; ++var5) {
					this.anIntArrayArray7704[count][var5] = buffer.readShort((byte) 1);
				}
			} else if (28 == opcode) {
				count = buffer.readUnsignedByte(-848524046);
				this.anIntArray7722 = new int[count];

				for (var5 = 0; var5 < count; ++var5) {
					this.anIntArray7722[var5] = buffer.readUnsignedByte(-394915188);
					if (255 == this.anIntArray7722[var5]) {
						this.anIntArray7722[var5] = -1;
					}
				}
			} else if (opcode == 29) {
				this.anInt7716 = buffer.readUnsignedByte(1261897979) * 1801310525;
			} else if (30 == opcode) {
				this.anInt7724 = buffer.readUnsignedShort(1097097674) * 767373475;
			} else if (opcode == 31) {
				this.anInt7723 = buffer.readUnsignedByte(1330126189) * 641101329;
			} else if (32 == opcode) {
				this.anInt7700 = buffer.readUnsignedShort(593584191) * -1372069429;
			} else if (opcode == 33) {
				this.anInt7727 = buffer.readShort((byte) 1) * -54835271;
			} else if (34 == opcode) {
				this.anInt7720 = buffer.readUnsignedByte(2051671385) * -1953377087;
			} else if (opcode == 35) {
				this.anInt7729 = buffer.readUnsignedShort(1076748828) * 142272027;
			} else if (36 == opcode) {
				this.anInt7730 = buffer.readShort((byte) 1) * -482929453;
			} else if (opcode == 37) {
				this.anInt7731 = buffer.readUnsignedByte(1276214664) * -219515623;
			} else if (opcode == 38) {
				this.walkUpwardsAnimation = buffer.readBigSmart((byte) 44) * -793107371;
			} else if (opcode == 39) {
				this.anInt7695 = buffer.readBigSmart((byte) 58) * 307802543;
			} else if (opcode == 40) {
				this.rotate180Animation = buffer.readBigSmart((byte) 14) * 1794388301;
			} else if (41 == opcode) {
				this.rotate90Animation = buffer.readBigSmart((byte) 65) * 1728954743;
			} else if (42 == opcode) {
				this.rotate90CounterAnimation = buffer.readBigSmart((byte) 70) * 2143181915;
			} else if (opcode == 43) {
				buffer.readUnsignedShort(549734783);
			} else if (opcode == 44) {
				buffer.readUnsignedShort(621769155);
			} else if (45 == opcode) {
				this.anInt7732 = buffer.readUnsignedShort(1218465118) * 227354615;
			} else if (opcode == 46) {
				this.anInt7708 = buffer.readBigSmart((byte) 40) * 155609563;
			} else if (47 == opcode) {
				this.anInt7709 = buffer.readBigSmart((byte) -40) * 255757047;
			} else if (opcode == 48) {
				this.anInt7718 = buffer.readBigSmart((byte) -19) * -41625093;
			} else if (49 == opcode) {
				this.anInt7721 = buffer.readBigSmart((byte) -23) * -949711233;
			} else if (opcode == 50) {
				this.anInt7712 = buffer.readBigSmart((byte) 13) * 594618269;
			} else if (opcode == 51) {
				this.anInt7713 = buffer.readBigSmart((byte) 41) * -702683517;
			} else if (52 == opcode) {
				count = buffer.readUnsignedByte(798597554);
				this.loopAnimations = new int[count];
				this.loopAnimDurations = new int[count];

				for (var5 = 0; var5 < count; ++var5) {
					this.loopAnimations[var5] = buffer.readBigSmart((byte) 60);
					int var6 = buffer.readUnsignedByte(1883617847);
					this.loopAnimDurations[var5] = var6;
					this.anInt7693 += var6 * -943424521;
				}
			} else if (opcode == 53) {
				this.aBool7733 = false;
			} else if (opcode == 54) {
				this.anInt7726 = (buffer.readUnsignedByte(-1411914087) << 6) * -444685427;
				this.anInt7696 = (buffer.readUnsignedByte(347470951) << 6) * -778895185;
			} else if (opcode == 55) {
				count = buffer.readUnsignedByte(667798296);
				if (this.anIntArray7699 == null) {
					this.anIntArray7699 = new int[1 + count];
				} else if (count >= this.anIntArray7699.length) {
					this.anIntArray7699 = Arrays.copyOf(this.anIntArray7699, count + 1);
				}

				this.anIntArray7699[count] = buffer.readUnsignedShort(89547223);
			} else if (56 == opcode) {
				count = buffer.readUnsignedByte(-1169426782);
				if (this.anIntArrayArray7698 == null) {
					this.anIntArrayArray7698 = new int[1 + count][];
				} else if (count >= this.anIntArrayArray7698.length) {
					this.anIntArrayArray7698 = (int[][]) ((int[][]) Arrays.copyOf(this.anIntArrayArray7698, 1 + count));
				}

				this.anIntArrayArray7698[count] = new int[3];

				for (var5 = 0; var5 < 3; ++var5) {
					this.anIntArrayArray7698[count][var5] = buffer.readShort((byte) 1);
				}
			}
		}

	}

	public void method82(RSByteBuffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(442106223);
			if (var3 == 0) {
				return;
			}

			this.decode(var1, var3, (byte) -71);
		}
	}

	RenderDef() {
	}

	public int method6920(byte var1) {
		if (-1 != -169294459 * this.standAnimation) {
			return this.standAnimation * -169294459;
		} else if (null == this.loopAnimations) {
			return -1;
		} else {
			int var2 = (int) (Math.random() * (double) (this.anInt7693 * 919778759));

			int var3;
			for (var3 = 0; var2 >= this.loopAnimDurations[var3]; ++var3) {
				var2 -= this.loopAnimDurations[var3];
			}

			return this.loopAnimations[var3];
		}
	}

	public boolean method6921(int var1, byte var2) {
		if (-1 == var1) {
			return false;
		} else if (this.standAnimation * -169294459 == var1) {
			return true;
		} else {
			if (null != this.loopAnimations) {
				for (int var3 = 0; var3 < this.loopAnimations.length; ++var3) {
					if (this.loopAnimations[var3] == var1) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public Class445[] method6922(int var1) {
		if (this.aClass445Array7711 != null) {
			return this.aClass445Array7711;
		} else if (null == this.anIntArrayArray7704) {
			return null;
		} else {
			this.aClass445Array7711 = new Class445[this.anIntArrayArray7704.length];

			for (int var2 = 0; var2 < this.anIntArrayArray7704.length; ++var2) {
				int var3 = 0;
				int var4 = 0;
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = 0;
				if (this.anIntArrayArray7704[var2] != null) {
					var3 = this.anIntArrayArray7704[var2][0];
					var4 = this.anIntArrayArray7704[var2][1];
					var5 = this.anIntArrayArray7704[var2][2];
					var6 = this.anIntArrayArray7704[var2][3] << 3;
					var7 = this.anIntArrayArray7704[var2][4] << 3;
					var8 = this.anIntArrayArray7704[var2][5] << 3;
				}

				if (var3 != 0 || var4 != 0 || 0 != var5 || var6 != 0 || 0 != var7 || 0 != var8) {
					Class445 var9 = this.aClass445Array7711[var2] = new Class445();
					if (var8 != 0) {
						var9.method5237(0.0F, 0.0F, 1.0F, Class443.method5200(var8));
					}

					if (0 != var6) {
						var9.method5237(1.0F, 0.0F, 0.0F, Class443.method5200(var6));
					}

					if (0 != var7) {
						var9.method5237(0.0F, 1.0F, 0.0F, Class443.method5200(var7));
					}

					var9.method5251((float) var3, (float) var4, (float) var5);
				}
			}

			return this.aClass445Array7711;
		}
	}

	public void method83(RSByteBuffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(336921407);
			if (var2 == 0) {
				return;
			}

			this.decode(var1, var2, (byte) 11);
		}
	}

	public void method84(RSByteBuffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(626081318);
			if (var2 == 0) {
				return;
			}

			this.decode(var1, var2, (byte) -85);
		}
	}

	public void method81(int var1) {
	}

	RenderDef(int var1) {
	}

	public void method51(int var1) {
	}

	public boolean method6924(int var1) {
		if (-1 == var1) {
			return false;
		} else if (this.standAnimation * -169294459 == var1) {
			return true;
		} else {
			if (null != this.loopAnimations) {
				for (int var2 = 0; var2 < this.loopAnimations.length; ++var2) {
					if (this.loopAnimations[var2] == var1) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public int method6926() {
		if (-1 != -169294459 * this.standAnimation) {
			return this.standAnimation * -169294459;
		} else if (null == this.loopAnimations) {
			return -1;
		} else {
			int var1 = (int) (Math.random() * (double) (this.anInt7693 * 919778759));

			int var2;
			for (var2 = 0; var1 >= this.loopAnimDurations[var2]; ++var2) {
				var1 -= this.loopAnimDurations[var2];
			}

			return this.loopAnimations[var2];
		}
	}

	public int[] method6927(int var1) {
		Class20 var2 = new Class20(16);
		Class40_Sub21.method10299(this.standAnimation * -169294459, var2, -159678875);
		int[] var3;
		int var4;
		if (this.loopAnimations != null) {
			var3 = this.loopAnimations;

			for (var4 = 0; var4 < var3.length; ++var4) {
				int var5 = var3[var4];
				Class40_Sub21.method10299(var5, var2, -446466936);
			}
		}

		Class40_Sub21.method10299(2067380477 * this.walkUpwardsAnimation, var2, -11506318);
		Class40_Sub21.method10299(this.anInt7695 * 491996495, var2, 517131414);
		Class40_Sub21.method10299(1714500849 * this.walkAnimation, var2, -1688300288);
		Class40_Sub21.method10299(this.rotate180Animation * -1010143355, var2, 898512775);
		Class40_Sub21.method10299(1306617927 * this.rotate90Animation, var2, -666422438);
		Class40_Sub21.method10299(1046967251 * this.rotate90CounterAnimation, var2, 1815429882);
		Class40_Sub21.method10299(1317568909 * this.runAnimation, var2, -842945332);
		Class40_Sub21.method10299(this.runRotate180Animation * -1340587369, var2, 685306713);
		Class40_Sub21.method10299(this.runRotate90Animation * 1443182969, var2, -1718432148);
		Class40_Sub21.method10299(this.runRotate90CounterAnimation * 84725405, var2, 1141000988);
		Class40_Sub21.method10299(this.moveType1Anim * 455141683, var2, 142831086);
		Class40_Sub21.method10299(this.type1_180 * -566579917, var2, 639104805);
		Class40_Sub21.method10299(this.type1_90 * -721906563, var2, 2077177458);
		Class40_Sub21.method10299(this.type1_90_counter * -2093545587, var2, 1137733641);
		Class40_Sub21.method10299(this.anInt7708 * -2076874157, var2, 658600535);
		Class40_Sub21.method10299(-500869433 * this.anInt7709, var2, -1511858078);
		Class40_Sub21.method10299(this.anInt7718 * -2027927245, var2, 1069720071);
		Class40_Sub21.method10299(this.anInt7721 * 1017721215, var2, 1459494944);
		Class40_Sub21.method10299(this.anInt7712 * -1826777419, var2, 964079563);
		Class40_Sub21.method10299(this.anInt7713 * -926279637, var2, -1171122985);
		var3 = new int[var2.method636(606476450)];
		var4 = 0;

		Class526 var6;
		for (Iterator var7 = var2.iterator(); var7.hasNext(); var3[var4++] = (int) (-6805155999452426801L * var6.aLong7156)) {
			var6 = (Class526) var7.next();
		}

		return var3;
	}

	public boolean method6928(int var1) {
		if (-1 == var1) {
			return false;
		} else if (this.standAnimation * -169294459 == var1) {
			return true;
		} else {
			if (null != this.loopAnimations) {
				for (int var2 = 0; var2 < this.loopAnimations.length; ++var2) {
					if (this.loopAnimations[var2] == var1) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public void method49(int var1, int var2) {
	}

	public void method85() {
	}

	static void method6929(Class681 var0, int var1) {
		var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class588.method7000((byte) 0) ? 1 : 0;
	}

	static final void method6930(Class681 var0, int var1) {
		Class679 var2 = var0.aBool8628 ? var0.aClass679_8631 : var0.aClass679_8621;
		InterfaceDef var3 = var2.aClass245_8600;
		int var4 = -1;
		int var5 = -1;
		Class237 var6 = var3.method3351(Class554.aClass174_7475, (byte) 39);
		if (null != var6) {
			var4 = var6.anInt2393 * 569137057;
			var5 = var6.anInt2392 * -837894619;
		}

		var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
		var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
	}

	static final void method6931(Class681 var0, int var1) {
		Class460.method5466(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (byte) 1);
	}

	static final Class681 method6932(byte var0) {
		if (Class680.anInt8613 * -1387996725 == Class680.anArrayList8607.size()) {
			Class680.anArrayList8607.add(new Class681());
		}

		Class681 var1 = (Class681) Class680.anArrayList8607.get(-1387996725 * Class680.anInt8613);
		Class680.anInt8613 += 1367376867;
		return var1;
	}

	static void method6933(Class433 var0, byte var1) {
		Class31.aClass433_289.method5083(var0);
	}
}
