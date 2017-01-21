package com.jagex;

import com.jagex.Class149_Sub1;
import com.jagex.Class165;
import com.jagex.Class221;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class29;
import com.jagex.NPCDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class526_Sub18;
import com.jagex.Class57;
import com.jagex.Class570;
import com.jagex.Class610;
import com.jagex.Class612_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class709;
import com.jagex.Class99;

public class Class408 {
   public static final int anInt4345 = 6;
   public static final int anInt4346 = 9;
   public static final int anInt4347 = 22;
   public static final int anInt4348 = 16;
   public static final int anInt4349 = 3;
   public static final int anInt4350 = 13;
   public static final int anInt4351 = 23;
   public static final int anInt4352 = 19;
   public static final int anInt4353 = 29;
   public static final int anInt4354 = 27;
   public static final int anInt4355 = 5;
   public static final int anInt4356 = 15;
   public static final int anInt4357 = 1;
   public static final int anInt4358 = 7;
   public static final int anInt4359 = 24;
   public static final int anInt4360 = 11;
   public static final int anInt4361 = 17;
   public static final int anInt4362 = 8;
   public static final int anInt4363 = 21;
   public static final int anInt4364 = 10;
   public static final int anInt4365 = 28;
   public static final int anInt4366 = 20;
   public static final int anInt4367 = 4;
   public static final int anInt4368 = 25;
   public static final int anInt4369 = 14;
   public static final int anInt4370 = 26;

   Class408() throws Throwable {
      throw new Error();
   }

   static void method4888(Class709 var0, int var1) {
      Class57.aClass709_688 = var0;
   }

   public static int method4889(byte var0) {
      return Class570.aTwitchTV7639.GetViewerCount();
   }

   static final void method4890(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-37);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class681.method8029(var3, var4, var0, 1364842007);
   }

   static final void method4891(Class681 var0, byte var1) {
      Class612_Sub1 var2 = Class29.method736((byte)-15);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 == null?0:-2015558303 * var2.anInt8023;
   }

   static final void method4892(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class165.method1931(var2, true, -86865730);
   }

   public static void method4893(int var0, int var1, int var2, int var3, Class610 var4, NPC var5, Class639_Sub1_Sub2_Sub1_Sub1 var6, int var7) {
      Class526_Sub18 var8 = new Class526_Sub18();
      var8.anInt10484 = var0 * 435094121;
      var8.anInt10485 = (var1 << 9) * -502332253;
      var8.anInt10480 = -967064791 * (var2 << 9);
      if(var4 != null) {
         var8.aClass610_10501 = var4;
         int var9 = -1450399027 * var4.anInt7993;
         int var10 = var4.anInt7971 * 182793117;
         if(var3 == 1 || 3 == var3) {
            var9 = 182793117 * var4.anInt7971;
            var10 = -1450399027 * var4.anInt7993;
         }

         var8.anInt10487 = -119810509 * (var1 + var9 << 9);
         var8.anInt10509 = -1425665381 * (var2 + var10 << 9);
         var8.anInt10508 = 1429404551 * var4.anInt7992;
         var8.anInt10488 = -1934557329 * (-715291895 * var4.anInt7935 << 9);
         var8.anInt10493 = 390273931 * var4.anInt7995;
         var8.anInt10492 = var4.anInt7972 * 1457613419;
         var8.anInt10507 = 1146814871 * var4.anInt7997;
         var8.anIntArray10510 = var4.anIntArray7998;
         var8.anInt10504 = var4.anInt7947 * -2048547817;
         var8.anInt10503 = var4.anInt8006 * -98908643;
         var8.anInt10491 = -1137973309 * (var4.anInt7994 * -56456565 << 9);
         if(var4.anIntArray7989 != null) {
            var8.aBool10499 = true;
            var8.method9429(1932794306);
         }

         if(var8.anIntArray10510 != null) {
            var8.anInt10494 = (621040627 * var8.anInt10492 + (int)(Math.random() * (double)(var8.anInt10507 * 78886323 - var8.anInt10492 * 621040627))) * -1113060693;
         }

         Class526_Sub18.aClass702_10505.method8176(var8, -641122120);
         Class570.aClass231_7657.method3239(var8.anInt10508 * 1520182179, -2147483647);
         Class570.aClass231_7657.method3201(var8.anIntArray10510, 49623680);
      } else if(var5 != null) {
         var8.aClass639_Sub1_Sub2_Sub1_Sub2_10495 = var5;
         NPCDef var11 = var5.def;
         if(var11.morphisms != null) {
            var8.aBool10499 = true;
            var11 = var11.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         }

         if(null != var11) {
            var8.anInt10487 = (var1 + var11.boundSize * 459047587 << 9) * -119810509;
            var8.anInt10509 = -1425665381 * (var11.boundSize * 459047587 + var2 << 9);
            var8.anInt10508 = Class99.method1282(var5, -1957431466) * -1225578485;
            var8.anInt10488 = -1934557329 * (var11.anInt3332 * 824599275 << 9);
            var8.anInt10493 = var11.anInt3359 * 1061153107;
            var8.anInt10504 = 558118373 * var11.anInt3369;
            var8.anInt10503 = var11.anInt3301 * 1038318735;
            var8.anInt10491 = (-1944680939 * var11.anInt3326 << 9) * -1137973309;
            Class570.aClass231_7657.method3239(var11.anInt3313 * -1515639175, -2147483647);
            Class570.aClass231_7657.method3239(-803450199 * var11.anInt3354, -2147483647);
            Class570.aClass231_7657.method3239(2040989771 * var11.anInt3355, -2147483647);
            Class570.aClass231_7657.method3239(163458111 * var11.anInt3356, -2147483647);
         }

         Class526_Sub18.aClass702_10482.method8176(var8, -326768775);
      } else if(var6 != null) {
         var8.aClass639_Sub1_Sub2_Sub1_Sub1_10496 = var6;
         var8.anInt10487 = (var1 + var6.method10781(-627148024) << 9) * -119810509;
         var8.anInt10509 = (var2 + var6.method10781(-627148024) << 9) * -1425665381;
         var8.anInt10508 = Class149_Sub1.method8355(var6, 811221711) * -1225578485;
         var8.anInt10488 = -1934557329 * (-1469591895 * var6.anInt12179 << 9);
         var8.anInt10493 = 385174739 * var6.anInt12180;
         var8.anInt10504 = 1339953408;
         var8.anInt10503 = 1121573120;
         var8.anInt10491 = 0;
         Class526_Sub18.aClass20_10483.put(var8, (long)(var6.index * 828574411));
         Class570.aClass231_7657.method3239(745424635 * var6.anInt12160, -2147483647);
         Class570.aClass231_7657.method3239(1294430513 * var6.anInt12176, -2147483647);
         Class570.aClass231_7657.method3239(1464497723 * var6.anInt12177, -2147483647);
         Class570.aClass231_7657.method3239(var6.anInt12178 * -689708659, -2147483647);
      }

   }
}
