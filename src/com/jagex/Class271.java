package com.jagex;

import com.jagex.Class415;
import com.jagex.Class525;
import com.jagex.Class526_Sub21_Sub10;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class673;
import com.jagex.Class681;

public class Class271 {
   static final int anInt2996 = 100;
   static int anInt2999;
   Class526_Sub21_Sub10[] aClass526_Sub21_Sub10Array2997 = new Class526_Sub21_Sub10[100];
   int anInt2998;

   Class526_Sub21_Sub10 method3596(int var1, int var2, String var3, String var4, String var5, String var6, String var7, int var8, Class415 var9, int var10) {
      Class526_Sub21_Sub10 var11 = this.aClass526_Sub21_Sub10Array2997[99];

      for(int var12 = this.anInt2998 * -1738842973; var12 > 0; --var12) {
         if(var12 != 100) {
            this.aClass526_Sub21_Sub10Array2997[var12] = this.aClass526_Sub21_Sub10Array2997[var12 - 1];
         }
      }

      if(null == var11) {
         var11 = new Class526_Sub21_Sub10(var1, var2, var3, var4, var5, var7, var8, var6, var9);
      } else {
         var11.method6332(-1949449864);
         var11.uncache(-1947027358);
         var11.method10640(var1, var2, var3, var4, var5, var7, var8, var6, var9, (byte)66);
      }

      this.aClass526_Sub21_Sub10Array2997[0] = var11;
      if(-1738842973 * this.anInt2998 < 100) {
         this.anInt2998 += -2031864053;
      }

      return var11;
   }

   int method3597() {
      return this.anInt2998 * -1738842973;
   }

   Class526_Sub21_Sub10 method3598(int var1, int var2) {
      return var1 >= 0 && var1 < -1738842973 * this.anInt2998?this.aClass526_Sub21_Sub10Array2997[var1]:null;
   }

   int method3599(byte var1) {
      return this.anInt2998 * -1738842973;
   }

   int method3600() {
      return this.anInt2998 * -1738842973;
   }

   static int method3601(char var0, Class673 var1, int var2) {
      int var3 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      if(var0 == 241 && var1 == Class673.aClass673_8568) {
         var3 = 1762;
      }

      return var3;
   }

   static final void method3602(Class681 var0, byte var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var0.aClass526_Sub21_Sub19_8629.anObjectArray11861[var0.anInt8644 * -244840757];
   }

   static final void method3603(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class525.method6281(var2);
      if(var3 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt11842 * -81547769;
      }

   }
}
