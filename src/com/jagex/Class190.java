package com.jagex;

import com.jagex.Class116;
import com.jagex.Class174;
import com.jagex.Class206;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class267;
import com.jagex.Class27;
import com.jagex.Class287;
import com.jagex.Class380_Sub3_Sub1;
import com.jagex.Class388;
import com.jagex.Class411;
import com.jagex.Class506;
import com.jagex.RSByteBuffer;
import com.jagex.Class541;
import com.jagex.Class561;
import com.jagex.Class594;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.Class711_Sub26;

public class Class190 {
   public static int anInt2167;
   int anInt2163;
   int anInt2164;
   int anInt2162;
   int anInt2166;
   int anInt2165;
   Class594 aClass594_2161;

   void method2749(int var1, int var2, int var3, int var4) {
      Class174.method2634(var1, var2, var3, -1681209249 * this.aClass594_2161.anInt7845, -1368490781 * this.anInt2165, this.aClass594_2161.anInt7833 * -1226971375, var4, -1893329337);
      this.anInt2163 = var1 * -1661336393;
      this.anInt2164 = var2 * 893654229;
      this.anInt2162 = 443384193 * var3;
      this.anInt2166 = var4 * 1970317259;
   }

   void method2750(int var1, int var2, int var3, int var4, int var5) {
      Class174.method2634(var1, var2, var3, -1681209249 * this.aClass594_2161.anInt7845, -1368490781 * this.anInt2165, this.aClass594_2161.anInt7833 * -1226971375, var4, -1135945619);
      this.anInt2163 = var1 * -1661336393;
      this.anInt2164 = var2 * 893654229;
      this.anInt2162 = 443384193 * var3;
      this.anInt2166 = var4 * 1970317259;
   }

   void method2751(byte var1) {
      Class174.method2634(-1628694265 * this.anInt2163, -386628483 * this.anInt2164, 1521794689 * this.anInt2162, -1681209249 * this.aClass594_2161.anInt7845, -1, -1226971375 * this.aClass594_2161.anInt7833, -327891485 * this.anInt2166, -653156832);
   }

   boolean method2752(byte var1) {
      if(-1368490781 * this.anInt2165 < 0) {
         return true;
      } else {
         Class610 var2 = (Class610)Class541.aClass40_Sub8_7233.method89(this.anInt2165 * -1368490781, 120845550);
         boolean var3 = var2.method7174(-1226971375 * this.aClass594_2161.anInt7833, -1754405788);
         int[] var4 = var2.method7185(-2082216006);
         if(null != var4) {
            int[] var5 = var4;

            for(int var6 = 0; var6 < var5.length; ++var6) {
               int var7 = var5[var6];
               var3 &= ((Class206)Class388.aClass40_Sub15_4063.method89(var7, -1890468072)).method2900(404092416);
            }
         }

         return var3;
      }
   }

   void method2753(int var1, int var2, int var3, int var4) {
      Class174.method2634(var1, var2, var3, -1681209249 * this.aClass594_2161.anInt7845, -1368490781 * this.anInt2165, this.aClass594_2161.anInt7833 * -1226971375, var4, 1596814451);
      this.anInt2163 = var1 * -1661336393;
      this.anInt2164 = var2 * 893654229;
      this.anInt2162 = 443384193 * var3;
      this.anInt2166 = var4 * 1970317259;
   }

   void method2754(int var1, int var2, int var3, int var4) {
      Class174.method2634(var1, var2, var3, -1681209249 * this.aClass594_2161.anInt7845, -1368490781 * this.anInt2165, this.aClass594_2161.anInt7833 * -1226971375, var4, -1858634692);
      this.anInt2163 = var1 * -1661336393;
      this.anInt2164 = var2 * 893654229;
      this.anInt2162 = 443384193 * var3;
      this.anInt2166 = var4 * 1970317259;
   }

   boolean method2755() {
      if(-1368490781 * this.anInt2165 < 0) {
         return true;
      } else {
         Class610 var1 = (Class610)Class541.aClass40_Sub8_7233.method89(this.anInt2165 * -1368490781, -1147410359);
         boolean var2 = var1.method7174(-1226971375 * this.aClass594_2161.anInt7833, -1754405788);
         int[] var3 = var1.method7185(-2118530484);
         if(null != var3) {
            int[] var4 = var3;

            for(int var5 = 0; var5 < var4.length; ++var5) {
               int var6 = var4[var5];
               var2 &= ((Class206)Class388.aClass40_Sub15_4063.method89(var6, -701610144)).method2900(404092416);
            }
         }

         return var2;
      }
   }

   void method2756(int var1, int var2, int var3, int var4) {
      Class174.method2634(var1, var2, var3, -1681209249 * this.aClass594_2161.anInt7845, -1368490781 * this.anInt2165, this.aClass594_2161.anInt7833 * -1226971375, var4, 250330084);
      this.anInt2163 = var1 * -1661336393;
      this.anInt2164 = var2 * 893654229;
      this.anInt2162 = 443384193 * var3;
      this.anInt2166 = var4 * 1970317259;
   }

   Class190(RSByteBuffer var1) {
      this.anInt2165 = var1.readBigSmart((byte)-33) * 1799006411;
      this.aClass594_2161 = (Class594)Class561.findIdentifiable(Class411.method4905(801196056), var1.readUnsignedByte(333263127), (byte)-2);
   }

   public static Class287 method2757(int var0, int var1) {
      return var0 == Class287.aClass287_3105.anInt3104 * 1711486217?Class287.aClass287_3105:(var0 == Class287.aClass287_3102.anInt3104 * 1711486217?Class287.aClass287_3102:(var0 == 1711486217 * Class287.aClass287_3103.anInt3104?Class287.aClass287_3103:null));
   }

   static void method2758(String[] var0, int var1) {
      if(var0.length > 1) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            if(var0[var2].startsWith("pause")) {
               int var3 = 5;

               try {
                  var3 = Integer.parseInt(var0[var2].substring(6));
               } catch (Exception var5) {
                  ;
               }

               Class27.method722("Pausing for " + var3 + " seconds...", -315839031);
               Class506.aStringArray5696 = var0;
               Class116.anInt1419 = -1489674303 * (var2 + 1);
               Class380_Sub3_Sub1.aLong11404 = (Class255.time((byte)24) + (long)(var3 * 1000)) * 8389726955050873149L;
               return;
            }

            Class116.aString1429 = var0[var2];
            Class711_Sub26.method10086(false, 1619612207);
         }
      } else {
         Class116.aString1429 = Class116.aString1429 + var0[0];
         Class116.anInt1431 += var0[0].length() * -1733740665;
      }

   }

   static final void method2759(InterfaceDef var0, Class681 var1, int var2) {
      byte var3 = 10;
      Class267.method3574(var0, var3, var1, 363078328);
   }
}
