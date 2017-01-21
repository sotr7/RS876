package com.jagex;

import com.jagex.Class1;
import com.jagex.Class173;
import com.jagex.Class174_Sub1;
import com.jagex.Class184;
import com.jagex.Class192;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class253;
import com.jagex.Class31;
import com.jagex.Class315_Sub1;
import com.jagex.Class323;
import com.jagex.Class348;
import com.jagex.Class403;
import com.jagex.Class425;
import com.jagex.Class44;
import com.jagex.Class442;
import com.jagex.Class506;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub27_Sub1;
import com.jagex.Class526_Sub32;
import com.jagex.Class526_Sub8;
import com.jagex.Class578;
import com.jagex.Class619;
import com.jagex.Class649;
import com.jagex.Class662;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class80;
import com.jagex.Class97_Sub1;
import com.jagex.Interface76;
import com.jagex.client;
import java.awt.Point;

public class Class458 implements Interface76 {
   public static Class458 aClass458_5169 = new Class458(0);
   public static Class458 aClass458_5168 = new Class458(1);
   public static Class458 aClass458_5167 = new Class458(2);
   int anInt5170;

   public int getId() {
      return 653315403 * this.anInt5170;
   }

   public int method21() {
      return 653315403 * this.anInt5170;
   }

   Class458(int var1) {
      this.anInt5170 = var1 * 705451107;
   }

   public static void method5415(int var0) {
      Class31.aClass153_268 = null;
      Class619.aClass153_8122 = null;
      Class526_Sub27_Sub1.aClass153_11625 = null;
      Class31.aClass153_304 = null;
      Class44.aClass153_461 = null;
      Class323.aClass153_3460 = null;
      Class184.aClass153_2117 = null;
      Class506.aClass153_5697 = null;
      Class80.aClass163_824 = null;
      Class403.aClass1_4162 = null;
   }

   static int method5416(Class526_Sub21_Sub6 var0, Class1 var1, byte var2) {
      String var3 = Class253.method3471(var0, (byte)-11);
      int[] var4 = Class578.method6947(var0, -1016315989);
      if(null != var4) {
         var3 = var3 + Class526_Sub8.method9341(var4, -1855000442);
      }

      int var5 = var1.method503(var3, Class442.aClass153Array4878, (byte)-111);
      if(var0.aBool11656) {
         var5 += Class97_Sub1.aClass153_8928.method1825() + 4;
      }

      return var5;
   }

   static void method5417(int var0, int var1) {
      if(Class230.preferences.aClass711_Sub30_10621.method10111(-1066491823) == 0) {
         var0 = -1;
      }

      if(client.anInt11180 * 172478073 != var0) {
         if(var0 != -1) {
            Class649 var2 = (Class649)Class174_Sub1.aClass40_Sub7_9280.method89(var0, -608161954);
            Class173 var3 = var2.method7713((byte)50);
            if(null != var3) {
               Class662.aClass500_8521.setcustomcursor(Class425.aCanvas4798, var3.method2204(true), var3.method2214(), var3.method2176(), new Point(-625878733 * var2.anInt8461, var2.anInt8458 * -234006573));
               client.anInt11180 = var0 * 1125202889;
            } else {
               var0 = -1;
            }
         }

         if(var0 == -1 && -1 != 172478073 * client.anInt11180) {
            Class662.aClass500_8521.setcustomcursor(Class425.aCanvas4798, (int[])null, -1, -1, new Point());
            client.anInt11180 = -1125202889;
         }

      }
   }

   static final void method5418(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class192.method2790(var3, var0, 1538016235);
   }

   static final void method5419(int var0, int var1, byte var2) {
      if(Class348.method4525(var0, (int[])null, -1038527060)) {
         Class315_Sub1.method9077(Class315_Sub1.aClass243Array10033[var0].aClass245Array2459, var1, (byte)-19);
      }
   }

   static final void method5420(Class681 var0, int var1) {
      Class526_Sub32 var2 = (Class526_Sub32)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 524465495 * var2.anInt10600;
   }
}
