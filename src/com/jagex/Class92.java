package com.jagex;

import com.jagex.Class184;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class300;
import com.jagex.Class315_Sub1;
import com.jagex.Class422;
import com.jagex.Class46;
import com.jagex.Class47;
import com.jagex.Class525_Sub1;
import com.jagex.Class554;
import com.jagex.Class592;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.client;

public class Class92 {
   static final int anInt897 = 3;

   Class92() throws Throwable {
      throw new Error();
   }

   static void method1212(int var0, int var1, InterfaceDef var2, int var3) {
      int var4 = var2.anInt2510 * -99858407 + var0;
      int var5 = var1 + 15;
      if(client.aBool11015) {
         int var6 = -256;
         if(client.anInt5627 * -421428705 < 20) {
            var6 = -65536;
         }

         Class422.aClass163_4740.method1896("Fps:" + client.anInt5627 * -421428705 + " (" + 908183553 * client.anInt5618 + " ms)", var4, var5, var6, -1, (byte)-61);
         var5 += 15;
         Runtime var7 = Runtime.getRuntime();
         long var8 = var7.totalMemory() / 1024L;
         long var10 = var8 - var7.freeMemory() / 1024L;
         int var12 = -256;
         if(var10 > 262144L) {
            var12 = -65536;
         }

         Class422.aClass163_4740.method1896("Mem:" + var10 + "/" + var8 + "k", var4, var5, var12, -1, (byte)-40);
         var5 += 15;
         long var13 = client.aClass111_11060.aClass62_1354.method1044((byte)127);
         String var15 = "N/A";
         if(-1L != var13) {
            var15 = var13 + "ms";
            if(var13 > 500L) {
               var15 = Class592.method7026(16711680, -459790802) + var15 + Class592.method7026(16776960, 1206039293);
            }
         }

         Class422.aClass163_4740.method1896("Game: In:" + 637844641 * client.aClass111_11060.anInt1334 + "B/s " + "Out:" + client.aClass111_11060.anInt1338 * -806460581 + "B/s " + "Ping:" + var15, var4, var5, -256, -1, (byte)-60);
         var5 += 15;
         long var16 = client.aClass111_11059.aClass62_1354.method1044((byte)127);
         String var18 = "N/A";
         if(-1L != var16) {
            var18 = var16 + "ms";
            if(var16 > 500L) {
               var18 = Class592.method7026(16711680, -1844890822) + var18 + Class592.method7026(16776960, 1577232682);
            }
         }

         Class422.aClass163_4740.method1896("Lobby: In:" + client.aClass111_11059.anInt1334 * 637844641 + "B/s " + "Out:" + -806460581 * client.aClass111_11059.anInt1338 + "B/s " + "Ping:" + var18, var4, var5, -256, -1, (byte)-25);
         var5 += 15;
         int var19 = Class554.aClass174_7475.method2522() / 1024;
         Class422.aClass163_4740.method1896("Offheap:" + var19 + "k", var4, var5, var19 > 65536?-65536:-256, -1, (byte)-23);
         var5 += 15;
         int var20 = 0;
         int var21 = 0;
         int var22 = 0;

         int var23;
         for(var23 = 0; var23 < Class300.aClass448_Sub1Array3253.length; ++var23) {
            if(null != Class300.aClass448_Sub1Array3253[var23] && Class300.aClass448_Sub1Array3253[var23].method9204((byte)22)) {
               var20 += Class300.aClass448_Sub1Array3253[var23].method9200((byte)0);
               var21 += Class300.aClass448_Sub1Array3253[var23].method9201(-1524612758);
               var22 += Class300.aClass448_Sub1Array3253[var23].method9218(2095226994);
            }
         }

         var23 = var20 == 0?0:100 * var22 / var20;
         int var24 = 0 == var20?0:10000 * var21 / var20;
         String var25 = "Cache:" + Class184.method2709((long)var24, 2, true, Class673.aClass673_8579, -577158686) + "% (" + var23 + "%)";
         Class47.aClass163_643.method1896(var25, var4, var5, -256, -1, (byte)-127);
         var5 += 12;
      }

   }

   static final void method1213(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)2);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class278.method3683(var3, var4, var0, -2139254916);
   }

   public static void method1214(int var0, int var1) {
      Class46 var2 = (Class46)Class525_Sub1.aHashMap10719.get(Integer.valueOf(var0));
      if(var2 == null) {
         var2 = new Class46();
      }

      var2.anInt641 = -21847103 * Class525_Sub1.anInt10713;
      var2.anInt640 = -928702537 * Class525_Sub1.anInt10721;
      Class525_Sub1.aHashMap10719.put(Integer.valueOf(var0), var2);
   }
}
