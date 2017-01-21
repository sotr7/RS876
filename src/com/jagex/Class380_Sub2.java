package com.jagex;

import com.jagex.Class157;
import com.jagex.Class225;
import com.jagex.Class380;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;

public class Class380_Sub2 extends Class380 {
   public int anInt10139;
   public int anInt10138;

   public static Class380 method9154(RSByteBuffer var0) {
      Class380 var1 = Class225.method3157(var0, -1361309039);
      int var2 = var0.readInt((byte)5);
      int var3 = var0.readInt((byte)5);
      int var4 = var0.readBigSmart((byte)-57);
      return new Class380_Sub2(var1.aClass384_3932, var1.aClass389_3929, 1035562863 * var1.anInt3930, var1.anInt3931 * 26479163, var1.anInt3936 * -219376461, var1.anInt3933 * 874500417, -1403557073 * var1.anInt3934, var1.anInt3935 * 2079046623, 252950473 * var1.anInt3928, var2, var3, var4);
   }

   Class380_Sub2(Class384 var1, Class389 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.anInt10139 = var11 * 441393597;
      this.anInt10138 = -250854001 * var12;
   }

   public Class394 method345() {
      return Class394.aClass394_4100;
   }

   public static Class380 method9155(RSByteBuffer var0) {
      Class380 var1 = Class225.method3157(var0, -1361309039);
      int var2 = var0.readInt((byte)5);
      int var3 = var0.readInt((byte)5);
      int var4 = var0.readBigSmart((byte)18);
      return new Class380_Sub2(var1.aClass384_3932, var1.aClass389_3929, 1035562863 * var1.anInt3930, var1.anInt3931 * 26479163, var1.anInt3936 * -219376461, var1.anInt3933 * 874500417, -1403557073 * var1.anInt3934, var1.anInt3935 * 2079046623, 252950473 * var1.anInt3928, var2, var3, var4);
   }

   public Class394 method346(int var1) {
      return Class394.aClass394_4100;
   }

   static final void method9156(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class157.method1865(var2, var3, var4, false, 2011658280);
   }
}
