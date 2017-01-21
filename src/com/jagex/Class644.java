package com.jagex;

import com.jagex.Class187;
import com.jagex.Class188;
import com.jagex.Class204;
import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class446;
import com.jagex.Class570;
import com.jagex.Class681;

public class Class644 {
   public static final int anInt8431 = 2816;
   public static final int anInt8432 = 13156520;
   public static final float aFloat8433 = 1.1523438F;
   public static final int anInt8434 = -50;
   public static final float aFloat8435 = 1.2F;
   public static final int anInt8436 = -50;
   public static final int anInt8437 = -60;
   public static final int anInt8438 = 16777215;
   public static final int anInt8439 = 0;
   static final int anInt8440 = 5000;
   public static final int anInt8441 = 2816;
   public static final int anInt8442 = 2816;
   public static final float aFloat8443 = 0.69921875F;

   static {
      new Class446(0.6F, 0.6F, 0.6F);
      new Class446(0.3F, 0.3F, 0.3F);
      new Class446(0.3F, 0.3F, 0.5F);
   }

   Class644() throws Throwable {
      throw new Error();
   }

   static final void method7667(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-36);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1379784909 * var3.anInt2522;
   }

   static final void method7668(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      short var5 = 255;
      short var6 = 256;
      Class570.aClass231_7657.method3246(Class188.aClass188_2135, var2, var3, var5, Class187.aClass187_2124.method2723(-1917876519), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, var6, var4, 74337437);
   }

   static String method7669(int var0, short var1) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
