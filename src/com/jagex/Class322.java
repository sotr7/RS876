package com.jagex;

import com.jagex.Class230;
import com.jagex.Class31;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.RSByteBuffer;
import com.jagex.Class539_Sub4;
import com.jagex.Class681;

public class Class322 {
   static final int anInt3452 = 2;
   static final int anInt3453 = 11;
   static final int anInt3454 = 2048;
   static final int anInt3455 = 6;
   public static RSByteBuffer aClass526_Sub36_3457;
   static int anInt3458;
   static int[] anIntArray3456 = new int[512];

   static {
      byte var0 = 9;

      for(int var1 = var0 - 1; var1 >= 0; --var1) {
         int var2 = 1 << var0 - var1 - 1;
         int var3 = 1 << var0 - var1;

         for(int var4 = var2; var4 < var3; ++var4) {
            anIntArray3456[var4] = (var3 - var4 << 6 >>> var0 - var1 - 1) + (var1 << 6);
         }
      }

   }

   static final void method4150(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class539_Sub4.method9293(var2, var3, false, (short)-24819);
   }

   public static Class526_Sub21_Sub6 method4151(int var0) {
      return Class31.aClass526_Sub21_Sub6_275;
   }

   static final void method4152(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub15_10610.method9986((short)255) == 1?1:0;
   }

   static final void method4153(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 >> 14 & 16383;
   }
}
