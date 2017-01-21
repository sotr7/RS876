package com.jagex;

import com.jagex.Class149;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class375;
import com.jagex.Class5;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class538;
import com.jagex.Class539;
import com.jagex.Class568;
import com.jagex.Class615;
import com.jagex.Class681;
import com.jagex.Class698;
import com.jagex.Exception_Sub1;

public class Class539_Sub6 extends Class539 {
   public static Class698 aClass698_10363;
   public int anInt10361;
   public int anInt10359;
   public int anInt10360;
   public int anInt10362;

   void method9308(int var1, int var2, int var3, int var4) {
      this.anInt10361 = var1 * -1393444119;
      this.anInt10359 = var2 * 1440818647;
      this.anInt10360 = var3 * 2002592421;
      this.anInt10362 = 2047874621 * var4;
   }

   void method9309(int var1, int var2, int var3, int var4, int var5) {
      this.anInt10361 = var1 * -1393444119;
      this.anInt10359 = var2 * 1440818647;
      this.anInt10360 = var3 * 2002592421;
      this.anInt10362 = 2047874621 * var4;
   }

   Class539_Sub6(int var1, int var2, int var3, int var4) {
      this.anInt10361 = -1393444119 * var1;
      this.anInt10359 = var2 * 1440818647;
      this.anInt10360 = 2002592421 * var3;
      this.anInt10362 = var4 * 2047874621;
   }

   void method9310(int var1, int var2, int var3, int var4) {
      this.anInt10361 = var1 * -1393444119;
      this.anInt10359 = var2 * 1440818647;
      this.anInt10360 = var3 * 2002592421;
      this.anInt10362 = 2047874621 * var4;
   }

   static final void method9311(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-15);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class568.method6837(var3, var4, var0, (byte)1);
   }

   static final void method9312(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2634 = Class615.method7280(var4, var2, -2107999840);
      var0.aBool2560 = true;
   }

   static void method9313(int var0, int var1, byte var2) {
      Class317 var3 = (Class317)Class5.aClass40_Sub2_28.method89(var0, -342884320);
      Class526_Sub21_Sub9 var4 = Class265.method3560(1, (long)(697078941 * var3.aClass143_3405.anInt1674));

      try {
         if(Class526_Sub21_Sub9.aBool11694) {
            var4.anInt11678 = Class538.aClass149_Sub1_7225.method114(var3.aClass143_3405, 1504814846) * 1693201951;
         }

         var4.anInt11678 = var3.method4096(var4.anInt11678 * 1720305119, var1, 543063681) * 1693201951;
         var4.method10584(230428369);
      } catch (Exception_Sub1 var6) {
         Class375.method4671("" + var0, var6, (byte)8);
      }

   }
}
