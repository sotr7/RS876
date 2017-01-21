package com.jagex;

import com.jagex.Class100;
import com.jagex.Class149;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class174;
import com.jagex.Class174_Sub1;
import com.jagex.Class221;
import com.jagex.Class238;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class310;
import com.jagex.Class310_Sub1;
import com.jagex.Class311;
import com.jagex.Class314;
import com.jagex.Class316;
import com.jagex.Class319;
import com.jagex.Class325_Sub1;
import com.jagex.Class325_Sub2;
import com.jagex.Class325_Sub3;
import com.jagex.Class325_Sub3_Sub1;
import com.jagex.Class330;
import com.jagex.Class332;
import com.jagex.Class380_Sub1;
import com.jagex.Class380_Sub2;
import com.jagex.Class380_Sub3;
import com.jagex.Class380_Sub3_Sub1;
import com.jagex.Class381;
import com.jagex.Class381_Sub1;
import com.jagex.Class382;
import com.jagex.Class387;
import com.jagex.Class390;
import com.jagex.Class394;
import com.jagex.Class397;
import com.jagex.Class399;
import com.jagex.Class454;
import com.jagex.Class466;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub35;
import com.jagex.Class615;
import com.jagex.Class651;
import com.jagex.Class681;
import com.jagex.Interface17;
import com.jagex.Interface33;
import com.jagex.Interface45;
import com.jagex.client;

public class Class312 {
   public static Interface17 anInterface17_3388;
   Class330 aClass330_3385;
   Class466 aClass466_3387;
   Class466 aClass466_3386;

   public Interface33 method4071(Interface45 var1, int var2) {
      if(var1 == null) {
         return null;
      } else {
         Class394 var3 = var1.method346(-1911203062);
         return (Interface33)(var3 == Class394.aClass394_4107?new Class311((Class399)var1):(Class394.aClass394_4102 == var3?new Class319(this.method4072(1515227856), (Class397)var1):(var3 == Class394.aClass394_4103?new Class310(this.aClass466_3387, (Class381)var1):(var3 == Class394.aClass394_4104?new Class310_Sub1(this.aClass466_3387, (Class381_Sub1)var1):(Class394.aClass394_4099 == var3?new Class325_Sub2(this.aClass466_3387, this.aClass466_3386, (Class380_Sub1)var1):(var3 == Class394.aClass394_4100?new Class325_Sub1(this.aClass466_3387, this.aClass466_3386, (Class380_Sub2)var1):(var3 == Class394.aClass394_4108?new Class325_Sub3(this.aClass466_3387, this.aClass466_3386, (Class380_Sub3)var1):(var3 == Class394.aClass394_4105?new Class316(this.aClass466_3387, this.aClass466_3386, (Class382)var1):(var3 == Class394.aClass394_4098?new Class314(this.aClass466_3387, (Class390)var1):(Class394.aClass394_4101 == var3?new Class325_Sub3_Sub1(this.aClass466_3387, this.aClass466_3386, (Class380_Sub3_Sub1)var1):(var3 == Class394.aClass394_4106?new Class332(this.aClass466_3387, this.aClass466_3386, (Class387)var1):null)))))))))));
      }
   }

   Class330 method4072(int var1) {
      if(null == this.aClass330_3385) {
         this.aClass330_3385 = new Class330();
      }

      return this.aClass330_3385;
   }

   public Class312(Class466 var1, Class466 var2) {
      this.aClass466_3387 = var1;
      this.aClass466_3386 = var2;
   }

   public static void method4073(int var0, byte var1) {
      Class100.aBoolArray1206[var0] = false;
      Class651.method7781(var0, (byte)-17);
   }

   static final void method4074(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2468 = Class615.method7280(var4, var2, -1663782822);
      var0.aBool2560 = true;
   }

   static final void method4075(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-17);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.parentId * -537841755;
   }

   static final void method4076(Class681 var0, byte var1) {
      client.aBool11298 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1;
      if(client.aBool11298) {
         Class454.method5393((byte)58);
      }

   }

   static void method4077(Class174 var0, Class526_Sub35 var1, Class238 var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 - 5;
      int var9 = 2 + var4;
      if(0 != 1624164855 * var2.anInt2397) {
         var0.method2356(var8, var9, 10 + var6, 1 + (var4 + var5 - var9), 1624164855 * var2.anInt2397, (byte)18);
      }

      if(0 != var2.anInt2428 * -1821504519) {
         var0.method2284(var8, var9, var6 + 10, 1 + (var4 + var5 - var9), var2.anInt2428 * -1821504519, -1898971122);
      }

      int var10 = 830418303 * var2.anInt2403;
      if(var1.aBool10668 && var2.anInt2404 * 1946251963 != -1) {
         var10 = var2.anInt2404 * 1946251963;
      }

      Class174_Sub1.aClass163_9281.method1915(var2.aString2398, var3, var4, var6, var5, -16777216 | var10, -1409553787 * Class525_Sub1.aClass635_7092.anInt8295, 1, 0, 0, (Class153[])null, (int[])null, (Class162)null, 0, 0, (byte)-60);
   }

   static final void method4078(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass492ArrayArray11265[var3][var2].anInt5522 * 50563227;
   }
}
