package com.jagex;

import com.jagex.Class225;
import com.jagex.Class265;
import com.jagex.Class269;
import com.jagex.Class380;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;

public class Class380_Sub1 extends Class380 {
   public static Class269 aClass269_10121;
   public int anInt10119;
   public int anInt10120;

   public static Class380 method9141(RSByteBuffer var0) {
      Class380 var1 = Class225.method3157(var0, -1361309039);
      int var2 = var0.readInt((byte)5);
      int var3 = var0.readInt((byte)5);
      return new Class380_Sub1(var1.aClass384_3932, var1.aClass389_3929, var1.anInt3930 * 1035562863, var1.anInt3931 * 26479163, -219376461 * var1.anInt3936, 874500417 * var1.anInt3933, var1.anInt3934 * -1403557073, 2079046623 * var1.anInt3935, 252950473 * var1.anInt3928, var2, var3);
   }

   public Class394 method346(int var1) {
      return Class394.aClass394_4099;
   }

   public Class394 method345() {
      return Class394.aClass394_4099;
   }

   Class380_Sub1(Class384 var1, Class389 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.anInt10119 = var10 * 1753588587;
      this.anInt10120 = var11 * -1045126591;
   }

   static final void method9142(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var0.aClass526_Sub9_8646.aClass339Array10402[var2].aString3528;
   }

   static final int method9143(byte var0) {
      return 0;
   }

   static void method9144(int var0, int var1, int var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(15, (long)var0);
      var3.method10584(230428369);
      var3.anInt11678 = var1 * 1693201951;
   }
}
