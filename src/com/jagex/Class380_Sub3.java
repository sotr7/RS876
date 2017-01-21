package com.jagex;

import com.jagex.Class225;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class380;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711_Sub1;

public class Class380_Sub3 extends Class380 {
   public int anInt10254;
   public int anInt10258;
   public int anInt10255;
   public int anInt10256;
   public int anInt10253;
   public int anInt10257;

   Class380_Sub3(Class384 var1, Class389 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.anInt10254 = var10 * -685283437;
      this.anInt10258 = var11 * 995153847;
      this.anInt10255 = -159707441 * var12;
      this.anInt10256 = 2096466093 * var13;
      this.anInt10253 = 1351643937 * var14;
      this.anInt10257 = -1127460551 * var15;
   }

   public Class394 method346(int var1) {
      return Class394.aClass394_4108;
   }

   public Class394 method345() {
      return Class394.aClass394_4108;
   }

   public static Class380 method9225(RSByteBuffer var0) {
      Class380 var1 = Class225.method3157(var0, -1361309039);
      int var2 = var0.readBigSmart((byte)-22);
      int var3 = var0.readBigSmart((byte)-92);
      int var4 = var0.readBigSmart((byte)76);
      int var5 = var0.readBigSmart((byte)19);
      int var6 = var0.readBigSmart((byte)25);
      int var7 = var0.readBigSmart((byte)28);
      return new Class380_Sub3(var1.aClass384_3932, var1.aClass389_3929, 1035562863 * var1.anInt3930, var1.anInt3931 * 26479163, var1.anInt3936 * -219376461, 874500417 * var1.anInt3933, var1.anInt3934 * -1403557073, var1.anInt3935 * 2079046623, var1.anInt3928 * 252950473, var2, var3, var4, var5, var6, var7);
   }

   public static Class380 method9226(RSByteBuffer var0) {
      Class380 var1 = Class225.method3157(var0, -1361309039);
      int var2 = var0.readBigSmart((byte)-14);
      int var3 = var0.readBigSmart((byte)67);
      int var4 = var0.readBigSmart((byte)-7);
      int var5 = var0.readBigSmart((byte)-55);
      int var6 = var0.readBigSmart((byte)-4);
      int var7 = var0.readBigSmart((byte)-102);
      return new Class380_Sub3(var1.aClass384_3932, var1.aClass389_3929, 1035562863 * var1.anInt3930, var1.anInt3931 * 26479163, var1.anInt3936 * -219376461, 874500417 * var1.anInt3933, var1.anInt3934 * -1403557073, var1.anInt3935 * 2079046623, var1.anInt3928 * 252950473, var2, var3, var4, var5, var6, var7);
   }

   static final void method9227(boolean var0, Class681 var1, short var2) {
      Class679 var3 = var1.aBool8628?var1.aClass679_8631:var1.aClass679_8621;
      InterfaceDef var4 = var3.aClass245_8600;
      Class243 var5 = var3.aClass243_8599;
      if(var0) {
         Class711_Sub1.method9811(var5, var4, -2027204285);
      } else {
         Class298.method3980(var5, var4, -951397836);
      }

   }
}
