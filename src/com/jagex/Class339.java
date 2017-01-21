package com.jagex;

import com.jagex.Class199_Sub18;
import com.jagex.Class230;
import com.jagex.Class318_Sub2;
import com.jagex.Class681;

public class Class339 {
   public byte aByte3526;
   public int anInt3527;
   public String aString3528;
   static String aString3529;
   static int[] anIntArray3530;

   static final void method4409(Class681 var0, short var1) {
      if(null != Class318_Sub2.aClass526_Sub9_10065) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
         var0.aClass526_Sub9_8646 = Class318_Sub2.aClass526_Sub9_10065;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method4410(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      if(0 == var2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)Math.pow((double)var2, (double)var3);
      }

   }

   static final void method4411(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(-1 == var2) {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10627, Class230.preferences.aClass711_Sub18_10619.method10015(-1344490348), (short)-26469);
      } else {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10627, var2, (short)-16295);
      }

      Class199_Sub18.method9026((byte)126);
   }
}
