package com.jagex;

import com.jagex.Class192;
import com.jagex.Class195;
import com.jagex.Class199_Sub20;
import com.jagex.Class307;
import com.jagex.Class317;
import com.jagex.Class32;
import com.jagex.Class327;
import com.jagex.Class329_Sub2;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class457;
import com.jagex.Class487;
import com.jagex.RSByteBuffer;
import com.jagex.Class54;
import com.jagex.Class547;
import com.jagex.Class561;
import com.jagex.Class583;
import com.jagex.client;

public class Class471 {
   static int anInt5359;
   static int anInt5361;
   Class457 aClass457_5358;
   int anInt5360;
   int anInt5357;

   int method5628() {
      return this.anInt5360 * 636065139;
   }

   Class457 method5629(int var1) {
      return this.aClass457_5358;
   }

   int method5630(int var1) {
      return this.anInt5360 * 636065139;
   }

   int method5631(short var1) {
      return -1324602291 * this.anInt5357;
   }

   Class471(RSByteBuffer var1) {
      this.aClass457_5358 = (Class457)Class561.findIdentifiable(Class457.method5410(983167483), var1.readUnsignedByte(503659660), (byte)-115);
      this.anInt5360 = var1.readInt((byte)5) * 1705220027;
      if(Class457.UNCOMPRESSED != this.aClass457_5358) {
         this.anInt5357 = var1.readInt((byte)5) * 774827141;
      } else {
         this.anInt5357 = -1932875585 * this.anInt5360;
      }

   }

   int method5632() {
      return -1324602291 * this.anInt5357;
   }

   static void method5633(int var0) {
      Class192 var1 = Class54.aClass192_666;
      synchronized(var1) {
         Class54.aClass192_666.method2772(-1185253263);
      }
   }

   public static void method5634(int var0, int var1, int var2, int var3) {
      var0 <<= 3;
      var1 <<= 3;
      var2 <<= 3;
      if(Class327.anInt3488 * -265840483 == 2) {
         if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297) {
            Class329_Sub2 var4 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-108453040);
            Class440 var5 = new Class440();
            Class440 var6 = new Class440();
            var5.method5193(0.0F, 1.0F, 0.0F, 3.1415927F - (float)(3.141592653589793D * (double)var1 * 2.0D / 16384.0D));
            Class446 var7 = new Class446(1.0F, 0.0F, 0.0F);
            var7.method5286(var5);
            var7.method5270();
            var6.method5188(var7, (float)(2.0D * 3.141592653589793D * (double)var0) / 16384.0F);
            var5.method5194(var6);
            var4.aClass440_10100.method5166(var5);
         }
      } else {
         client.aFloat11210 = (float)var0;
         client.aFloat11105 = (float)var1;
         if(3 == Class327.anInt3488 * -265840483) {
            Class487.anInt5511 = var0 * -567045205;
            Class317.anInt3410 = -1157073499 * var1;
            Class547.anInt7272 = var2 * 1696715943;
         }

         Class199_Sub20.method9034(190461033);
      }

      client.aBool11070 = true;
   }

   static boolean method5635(int var0) {
      return -577726201 * Class32.anInt312 != -1?Class583.method6983(827357890):Class317.method4100(Class32.aString315, Class32.aString344, 513530768);
   }
}
