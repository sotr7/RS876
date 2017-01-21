package com.jagex;

import com.jagex.Class11;
import com.jagex.Class111;
import com.jagex.Class195;
import com.jagex.Class446;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class531_Sub1;
import com.jagex.Class655;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import com.jagex.client;

public class Class409 {
   public static final int anInt4371 = 1;
   public static final int anInt4372 = 876;
   public static int anInt4373;

   Class409() throws Throwable {
      throw new Error();
   }

   static final void method4894(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(client.aString11017 != null && var2 < Class11.anInt145 * -190820129) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class655.aClass107Array8488[var2].aString1314;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static final void method4895(Class681 var0, int var1) throws Exception_Sub2 {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      Class446 var5 = Class446.method5309((float)var2, (float)var3, (float)var4);
      Class195.aClass292_Sub1_2182.method3937(var5, -1274508793);
      var5.method5278();
   }

   public static int method4896(int var0, boolean var1, byte var2) {
      if(var1) {
         return 0;
      } else {
         Class526_Sub2 var3 = Class531_Sub1.method9301(var0, var1, 1594386917);
         if(null == var3) {
            return ((Class526_Sub21_Sub2)Class111.aClass40_Sub22_1355.method89(var0, 13501422)).anInt11338 * 1422492421;
         } else {
            int var4 = 0;

            for(int var5 = 0; var5 < var3.anIntArray10331.length; ++var5) {
               if(-1 == var3.anIntArray10331[var5]) {
                  ++var4;
               }
            }

            var4 += ((Class526_Sub21_Sub2)Class111.aClass40_Sub22_1355.method89(var0, -1549351403)).anInt11338 * 1422492421 - var3.anIntArray10331.length;
            return var4;
         }
      }
   }
}
