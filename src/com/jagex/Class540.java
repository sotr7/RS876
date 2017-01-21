package com.jagex;

import com.jagex.Class11;
import com.jagex.Class16;
import com.jagex.Class273;
import com.jagex.Class448_Sub1;
import com.jagex.Class474;
import com.jagex.Class533;
import com.jagex.Class612_Sub1;
import com.jagex.Class681;

public class Class540 {
   Class540() throws Throwable {
      throw new Error();
   }

   static int method6452(int var0) {
      return var0 != 9 && 10 != var0?(var0 == 11?8:var0):1;
   }

   static int method6453(int var0) {
      return var0 != 9 && 10 != var0?(var0 == 11?8:var0):1;
   }

   static int method6454(int var0, int var1) {
      if(9 == var1) {
         var0 = var0 + 1 & 3;
      }

      if(var1 == 10) {
         var0 = var0 + 3 & 3;
      }

      if(var1 == 11) {
         var0 = var0 + 3 & 3;
      }

      return var0;
   }

   public static Class273 valueOf(int var0, int var1) {
      Class273[] var2 = Class474.method5649(388504330);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class273 var4 = var2[var3];
         if(var0 == var4.anInt3006 * 676914057) {
            return var4;
         }
      }

      return null;
   }

   static final void method6456(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -312346576)).aString76;
   }

   static void method6457(int var0, int var1, int var2, boolean var3, int var4, boolean var5, int var6) {
      if(var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         Class612_Sub1 var9 = Class16.aClass612_Sub1Array175[var7];
         Class16.aClass612_Sub1Array175[var7] = Class16.aClass612_Sub1Array175[var1];
         Class16.aClass612_Sub1Array175[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            if(Class533.method6394(Class16.aClass612_Sub1Array175[var10], var9, var2, var3, var4, var5, -1725786808) <= 0) {
               Class612_Sub1 var11 = Class16.aClass612_Sub1Array175[var10];
               Class16.aClass612_Sub1Array175[var10] = Class16.aClass612_Sub1Array175[var8];
               Class16.aClass612_Sub1Array175[var8++] = var11;
            }
         }

         Class16.aClass612_Sub1Array175[var1] = Class16.aClass612_Sub1Array175[var8];
         Class16.aClass612_Sub1Array175[var8] = var9;
         method6457(var0, var8 - 1, var2, var3, var4, var5, 876842437);
         method6457(var8 + 1, var1, var2, var3, var4, var5, 1038224917);
      }

   }
}
