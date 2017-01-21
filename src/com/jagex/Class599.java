package com.jagex;

import com.jagex.Class10;
import com.jagex.Class113;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.Class292;
import com.jagex.Class526_Sub3;
import com.jagex.Class636;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Class83;

public class Class599 {
   long aLong7865;
   int[] anIntArray7863;
   short[] aShortArray7864;
   short[] aShortArray7862;

   public Class599(long var1, int[] var3, short[] var4, short[] var5) {
      this.aLong7865 = -3499223771194622523L * var1;
      this.anIntArray7863 = var3;
      this.aShortArray7864 = var4;
      this.aShortArray7862 = var5;
   }

   static void method7075(Class681 var0, int var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
      int var5 = var0.anIntArray8622[3 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class292.method3946(var2, var3, var4, 0 != var5, -99858407);
   }

   static final void method7076(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class636.method7558(var3, var4, var0, -2146828186);
   }

   static final void method7077(Class681 var0, byte var1) {
      var0.anInt8623 -= -1957887669;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class526_Sub3.method9317(var2, (short)-28937);
   }

   static void method7078(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class83 var4 = (Class83)Class10.aClass40_Sub20_62.method89(var3, -1296730287);
      if(var4.method1167(-160161013)) {
         String var5 = var4.aString842;
         if(-1 == var2) {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var5;
         } else {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var2, -339426161)).method3786(var3, var5, -857114266);
         }
      } else {
         int var6 = 1040538721 * var4.anInt843;
         if(var2 == -1) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var6;
         } else {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var2, -280148895)).method3785(var3, var6, -1572922363);
         }
      }

   }

   static void method7079(int var0) {
      Class113.aClass192_1369.method2772(1155978588);
   }

   static final boolean method7080(char var0, int var1) {
      return 160 == var0 || var0 == 32 || var0 == 95 || var0 == 45;
   }
}
