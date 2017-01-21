package com.jagex;

import com.jagex.Class149;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class615;
import com.jagex.Class681;
import com.jagex.client;

public class Class434 {
   public static final int anInt4842 = 4;
   public static final int anInt4843 = 1;
   public static final int anInt4844 = 5;
   public static final int anInt4845 = 6;
   public static final int anInt4846 = 3;
   public static final int anInt4847 = 2;

   Class434() throws Throwable {
      throw new Error();
   }

   static final void method5144(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2614 = Class615.method7280(var4, var2, -1703295934);
      var0.aBool2560 = true;
   }

   static final void method5145(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3 + var2;
   }

   static final void method5146(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub21_10629.method10044(2017384894)?1:0;
   }

   static final void method5147(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2642 = Class615.method7280(var4, var2, -2070997443);
      var0.aBool2560 = true;
   }

   static final void method5148(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aBool11276?1:0;
   }
}
