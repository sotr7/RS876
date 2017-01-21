package com.jagex;

import com.jagex.Class103;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class322;
import com.jagex.Class408;
import com.jagex.Class442;
import com.jagex.Class479;
import com.jagex.Class501;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class531;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class693;
import com.jagex.Class711_Sub8;
import com.jagex.client;

public final class Class643 {
   public static short[][] aShortArrayArray8430;

   Class643() throws Throwable {
      throw new Error();
   }

   static void method7661(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class408.method4889((byte)54);
   }

   static void method7662(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      var0.anIntArray8622[var0.anInt8623 * -1730576285] = Class501.method6016(var0.anIntArray8622[-1730576285 * var0.anInt8623], var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1], 2133306448);
      var0.anInt8623 += -1957887669;
   }

   static final void method7663(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class278.method3685(var3, var4, true, 2, var0, -1576029945);
   }

   static final void method7664(Class681 var0, byte var1) {
      Class526_Sub21_Sub6 var2 = Class442.method5197((byte)106);
      if(Class531.method6379(var2, 1768679693) == 7) {
         int var3 = (int)var2.method10571((byte)45);
         if(var3 >= 0 && var3 <= Class103.anInt1270 * 1609310241) {
            Class639_Sub1_Sub2_Sub1_Sub1 var4 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var3];
            if(null != var4) {
               var0.aClass639_Sub1_Sub2_Sub1_8635 = var4;
               var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
               return;
            }
         }
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method7665(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      long var5 = Class693.method8111(0, 0, 12, var2, var3, var4, 1326548865);
      int var7 = Class479.method5750(var5);
      if(var4 < 1970) {
         --var7;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var7;
   }

   static final void method7666(Class681 var0, int var1) {
      Class711_Sub8.method9915(Class322.method4151(813828993), var0, (byte)-69);
   }
}
