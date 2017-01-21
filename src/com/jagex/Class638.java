package com.jagex;

import com.jagex.Class50;
import com.jagex.Class526_Sub2;
import com.jagex.Class531_Sub1;
import com.jagex.Class681;
import com.jagex.client;

public class Class638 {
   Class638() throws Throwable {
      throw new Error();
   }

   static final void method7614(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(2029719417 * client.anInt11288 == 2 && var2 < -17244221 * client.anInt11130) {
         Class50 var3 = client.aClass50Array11290[var2];
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString659;
         if(var3.aString652 != null) {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString652;
         } else {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         }
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   public static int method7615(int var0, int var1, boolean var2, int var3) {
      Class526_Sub2 var4 = Class531_Sub1.method9301(var0, var2, 1758268848);
      if(var4 == null) {
         return 0;
      } else if(var1 == -1) {
         return 0;
      } else {
         int var5 = 0;

         for(int var6 = 0; var6 < var4.anIntArray10329.length; ++var6) {
            if(var4.anIntArray10331[var6] == var1) {
               var5 += var4.anIntArray10329[var6];
            }
         }

         return var5;
      }
   }
}
