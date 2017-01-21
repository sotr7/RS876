package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class310_Sub1;
import com.jagex.Class315_Sub1;
import com.jagex.Class332;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class549;
import com.jagex.Class639_Sub1;
import com.jagex.Class642;
import com.jagex.Class681;
import com.jagex.Class93;
import java.util.Date;

public class Class545 {
   public static final int anInt7250 = 2;
   public static final int anInt7251 = 4;
   public static final int anInt7252 = 8;
   public static final int anInt7258 = 1;
   public static final int anInt7263 = 16;
   public static int anInt7266;
   byte aByte7262;
   byte aByte7255;
   int[] anIntArray7260;
   int[] anIntArray7261;
   int[] anIntArray7253;
   short aShort7249;
   short aShort7257;
   short aShort7256;
   short aShort7259;
   short[] aShortArray7254;
   short[] aShortArray7264;
   short[] aShortArray7265;

   Class545(Class549 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      this.aByte7262 = (byte)var2;
      this.aByte7255 = (byte)var3;
      this.anIntArray7260 = new int[4];
      this.anIntArray7261 = new int[4];
      this.anIntArray7253 = new int[4];
      this.anIntArray7260[0] = var4;
      this.anIntArray7260[1] = var5;
      this.anIntArray7260[2] = var6;
      this.anIntArray7260[3] = var7;
      this.anIntArray7261[0] = var8;
      this.anIntArray7261[1] = var9;
      this.anIntArray7261[2] = var10;
      this.anIntArray7261[3] = var11;
      this.anIntArray7253[0] = var12;
      this.anIntArray7253[1] = var13;
      this.anIntArray7253[2] = var14;
      this.anIntArray7253[3] = var15;
      this.aShort7249 = (short)(var4 >> 1705818315 * var1.anInt7316);
      this.aShort7257 = (short)(var6 >> 1705818315 * var1.anInt7316);
      this.aShort7256 = (short)(var12 >> 1705818315 * var1.anInt7316);
      this.aShort7259 = (short)(var14 >> var1.anInt7316 * 1705818315);
      this.aShortArray7254 = new short[4];
      this.aShortArray7264 = new short[4];
      this.aShortArray7265 = new short[4];
   }

   static final void method6510(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-92);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class642.method7658(var3, var4, var0, 580200818);
   }

   static final void method6511(Class681 var0, short var1) {
      Class310_Sub1.method9060(1500756645);
   }

   static void method6512(long var0) {
      Class93.aCalendar898.setTime(new Date(var0));
   }

   static boolean method6513(int var0, int var1) {
      return 8 == var0 || 6 == var0;
   }

   static final void method6514(Class639_Sub1 var0, int var1, boolean var2, int var3) {
      Class332.method4254(var0, var1, false, var2, '\uff00');
   }

   public static void method6515(int var0, byte var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(4, (long)var0);
      var2.method10583((byte)-128);
   }
}
