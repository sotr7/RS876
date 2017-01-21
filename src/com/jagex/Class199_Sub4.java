package com.jagex;

import com.jagex.Class1;
import com.jagex.Class163;
import com.jagex.Class189;
import com.jagex.Class199;
import com.jagex.Class253;
import com.jagex.Class309;
import com.jagex.Class442;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub8;
import com.jagex.Class578;
import com.jagex.Class97_Sub1;
import com.jagex.client;

public class Class199_Sub4 extends Class199 {
   int anInt9888;

   public void method2858() {
      Class189.aClass190Array2149[this.anInt9888 * 1137983499].method2751((byte)3);
   }

   Class199_Sub4(RSByteBuffer var1) {
      super(var1);
      this.anInt9888 = var1.readUnsignedShort(352344228) * -1706538077;
   }

   public void method2861() {
      Class189.aClass190Array2149[this.anInt9888 * 1137983499].method2751((byte)3);
   }

   public void method2855() {
      Class189.aClass190Array2149[this.anInt9888 * 1137983499].method2751((byte)3);
   }

   public void method2856() {
      Class189.aClass190Array2149[this.anInt9888 * 1137983499].method2751((byte)3);
   }

   public void method2857() {
      Class189.aClass190Array2149[this.anInt9888 * 1137983499].method2751((byte)3);
   }

   public void method2859() {
      Class189.aClass190Array2149[this.anInt9888 * 1137983499].method2751((byte)3);
   }

   public void method2852(byte var1) {
      Class189.aClass190Array2149[this.anInt9888 * 1137983499].method2751((byte)3);
   }

   static void method8996(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Class526_Sub21_Sub6 var7, Class163 var8, Class1 var9, int var10, int var11, byte var12) {
      if(var0 > var2 && var0 < var2 + var4 && var1 > var6 - var9.anInt12 * 96898447 - 1 && var1 < -1329402501 * var9.anInt14 + var6 && var7.aBool11661) {
         var10 = var11;
      }

      int[] var13 = Class578.method6947(var7, -1005999698);
      String var14 = Class253.method3471(var7, (byte)36);
      if(null != var13) {
         var14 = var14 + Class526_Sub8.method9341(var13, -2037932653);
      }

      var8.method1901(var14, 3 + var2, var6, var10, 0, client.aRandom11163, Class309.anInt3378, Class442.aClass153Array4878, (int[])null, 1144081266);
      if(var7.aBool11656) {
         Class97_Sub1.aClass153_8928.method1778(var2 + 5 + var9.method503(var14, Class442.aClass153Array4878, (byte)-34), var6 - 96898447 * var9.anInt12);
      }

   }
}
