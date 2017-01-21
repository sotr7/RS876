package com.jagex;

import com.jagex.Class116;
import com.jagex.Class192;
import com.jagex.Class230;
import com.jagex.Class466;
import com.jagex.Class499;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class551;
import com.jagex.Class681;
import com.jagex.Class71;
import com.jagex.Class710;
import com.jagex.Interface7;
import com.jagex.client;

public abstract class Class240 implements Interface7 {
   Class466 aClass466_2449;
   Class192 aClass192_2450;

   Class240(Class466 var1, int var2) {
      this.aClass466_2449 = var1;
      this.aClass192_2450 = new Class192(var2);
   }

   static final void method3307(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub12_10613.method9960(2128179612);
   }

   public static final int method3308(String var0, int var1) {
      if(null == var0) {
         return -1;
      } else {
         for(int var2 = 0; var2 < -17244221 * client.anInt11130; ++var2) {
            if(var0.equalsIgnoreCase(client.aClass50Array11290[var2].aString659)) {
               return var2;
            }
         }

         return -1;
      }
   }

   static void method3309(int var0, int var1, int var2, int var3, int var4) {
      float var5 = (float)Class525_Sub1.anInt7110 / (float)Class525_Sub1.anInt7102;
      int var6 = var2;
      int var7 = var3;
      if(var5 < 1.0F) {
         var7 = (int)(var5 * (float)var2);
      } else {
         var6 = (int)((float)var3 / var5);
      }

      var0 -= (var2 - var6) / 2;
      var1 -= (var3 - var7) / 2;
      Class71.anInt800 = -521323797 * (Class525_Sub1.anInt7102 * var0 / var6);
      Class116.anInt1438 = -168152273 * (Class525_Sub1.anInt7110 - Class525_Sub1.anInt7110 * var1 / var7);
      Class525_Sub1.anInt10710 = 608366201;
      Class525_Sub1.anInt10711 = -805427121;
      Class526_Sub21_Sub2.method10420(1680415052);
   }

   static final void method3310(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      if(Class710.aBool8850) {
         Class551.method6647(3, var2, var3, false, -559990376);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = null != Class499.aFrame5603?1:0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }
}
