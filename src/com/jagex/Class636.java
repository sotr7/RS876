package com.jagex;

import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class495;
import com.jagex.Class499;
import com.jagex.Class545;
import com.jagex.RenderDef;
import com.jagex.Class581;
import com.jagex.Class608;
import com.jagex.Class620;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.client;

public class Class636 {
   int anInt8298;
   int anInt8299;
   int anInt8300;
   int anInt8301;
   int anInt8302;
   int anInt8303;
   int anInt8304;
   int anInt8305;
   int anInt8306;
   int anInt8307;
   int anInt8308;
   int anInt8309;
   public static client aclient8310;

   boolean method7557(Class636 var1, int var2) {
      return 1564278383 * var1.anInt8307 == 1564278383 * this.anInt8307 && var1.anInt8300 * 1014761291 == this.anInt8300 * 1014761291 && var1.anInt8309 * -1026266877 == this.anInt8309 * -1026266877;
   }

   static final void method7558(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.modelType = 413144338;
      var0.aClass294_2677 = null;
      var0.anInt2539 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 1664688705;
      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class545.method6515(var0.uid * 919258769, (byte)98);
      }

   }

   static final void method7559(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -504120843 * var0.aClass526_Sub9_8646.aClass339Array10402[var2].anInt3527;
   }

   public static float method7560(Class440 var0, int var1) {
      Class446 var2 = Class446.method5309(0.0F, 0.0F, 1.0F);
      var2.method5286(var0);
      double var3 = 1.5707963267948966D - Math.acos((double)var2.aFloat4915);
      var2.method5278();
      return (float)var3;
   }

   static int method7561(int var0, int var1) {
      return var0 == 16711935?-1:Class495.method5910(var0, -1566261537);
   }

   public static final boolean method7562(String var0, String var1, String var2, String var3, byte var4) {
      return var0 != null && var2 != null?(!var0.startsWith("#") && !var2.startsWith("#")?var1.equals(var3):var0.equals(var2)):false;
   }

   static void method7563(Class681 var0, int var1) {
      var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1], 331767523)).method3783(Class242.aClass94_2456, 634180151)?1:0;
   }

   static final void method7564(Class681 var0, int var1) {
      Class608.method7159(-134539802);
   }

   public static final int method7565(int var0) {
      return (int)(1000000000L / (-3030308582349352637L * Class499.aLong5602));
   }

   public static void method7566(Class581 var0, int var1, int var2, int var3) {
      Class681 var4 = RenderDef.method6932((byte)-42);
      Class620.method7343(var0, var1, var2, var4, (byte)-34);
   }
}
