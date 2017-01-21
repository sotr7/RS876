package com.jagex;

import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class285;
import com.jagex.Class339;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class596;
import com.jagex.Class654;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class76;
import com.jagex.Class87;
import com.jagex.Exception_Sub2;
import com.jagex.client;

public class Class563 {
   public static final int anInt7589 = 16384;
   static final int anInt7590 = 2048;
   static final int anInt7591 = 2048;
   public static final int anInt7592 = 16384;

   Class563() throws Throwable {
      throw new Error();
   }

   public static void method6776(float var0, Class446 var1, Class440 var2, Class446 var3, Class446 var4, Class446 var5, float var6, float var7, float var8, short var9) {
      if(!var3.method5269(var1)) {
         Class446 var10 = Class446.method5309(0.0F, 0.0F, 0.0F);
         Class446 var11 = Class446.method5305(Class446.method5275(var3, var1));
         var11.method5286(var2);
         Class446 var12 = Class446.method5275(var11, var10);
         float var13 = var12.method5276();
         if(var5.aFloat4917 != Float.POSITIVE_INFINITY && !Float.isNaN(var1.aFloat4917) && var13 <= var7 && var13 >= var8) {
            var2.method5187();
            Class446 var14 = Class446.method5309(1.0F, 0.0F, 0.0F);
            Class446 var15 = Class446.method5309(0.0F, 1.0F, 0.0F);
            Class446 var16 = Class446.method5309(0.0F, 0.0F, 1.0F);
            var14.method5286(var2);
            var15.method5286(var2);
            var16.method5286(var2);
            Class446 var17 = Class446.method5309(Class446.method5262(var14, var4), Class446.method5262(var15, var4), Class446.method5262(var16, var4));
            Class446 var18 = Class446.method5305(var17);
            Class446 var19 = Class446.method5309(var12.aFloat4917 * var5.aFloat4917, var12.aFloat4915 * var5.aFloat4915, var12.aFloat4919 * var5.aFloat4919);
            var18.method5307(var19, var0);
            var18.method5264(var6);
            Class446 var20 = Class446.method5285(var14, var18.aFloat4917);
            var20.method5307(var15, var18.aFloat4915);
            var20.method5307(var16, var18.aFloat4919);
            var4.method5267(var20);
            var1.method5272(Class446.method5285(var4, var0));
         } else {
            var1.method5267(var3);
            var4.method5268();
         }

      }
   }

   static final void method6777(Class681 var0, int var1) throws Exception_Sub2 {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class446 var4 = Class446.method5309((float)var2, (float)var2, (float)var2);
      if(var4.aFloat4917 == -1.0F) {
         var4.aFloat4917 = Float.POSITIVE_INFINITY;
      }

      if(var4.aFloat4915 == -1.0F) {
         var4.aFloat4915 = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var4.aFloat4919) {
         var4.aFloat4919 = Float.POSITIVE_INFINITY;
      }

      Class195.aClass292_Sub1_2182.method3896(var4, (byte)29);
      Class195.aClass292_Sub1_2182.method3934((float)var3 / 1000.0F, 136250609);
      var4.method5278();
   }

   public static void method6778(int[] var0, int[] var1, int var2) {
      if(var0 != null && var1 != null) {
         Class339.anIntArray3530 = var0;
         Class692.anIntArray8701 = new int[var0.length];
         Class692.aByteArrayArrayArray8702 = new byte[var0.length][][];

         for(int var3 = 0; var3 < Class339.anIntArray3530.length; ++var3) {
            Class692.aByteArrayArrayArray8702[var3] = new byte[var1[var3]][];
         }

      } else {
         Class339.anIntArray3530 = null;
         Class692.anIntArray8701 = null;
         Class692.aByteArrayArrayArray8702 = (byte[][][])null;
      }
   }

   static void method6779(Class174 var0, int var1, int var2, InterfaceDef var3, int var4) {
      byte var5 = 127;
      byte var6 = 7;

      for(int var7 = 63; var7 >= 0; --var7) {
         int var8 = (var7 & 63) << 10 | (var6 & 7) << 7 | var5 & 127;
         Class654.method7818(false, true, (byte)21);
         int var9 = Class87.anIntArray855[var8];
         Class596.method7055(false, true, 2108175057);
         var0.method2290(var1, var2 + ((63 - var7) * -667181623 * var3.anInt2576 >> 6), var3.anInt2510 * -99858407, 1 + (var3.anInt2576 * -667181623 >> 6), -16777216 | var9, 0);
      }

   }

   static void method6780(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], -499752506)).aString3075;
   }

   static final void method6781(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      boolean var3 = 1 == var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub19_10632, var2, (short)-17923);
      if(!var3) {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub27_10648, 0, (short)-27997);
      }

      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static void method6782(Class681 var0, int var1) {
      var0.anIntArray8622[var0.anInt8623 * -1730576285 - 2] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2], -1385985661)).anIntArrayArray3084[var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1]][0];
      var0.anInt8623 -= -1957887669;
   }

   public static void method6783(int var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(15, (long)var0);
      var2.method10583((byte)-46);
   }

   static final void method6784(Class681 var0, short var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloat11210 >> 3;
   }
}
