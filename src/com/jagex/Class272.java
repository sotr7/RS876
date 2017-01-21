package com.jagex;

import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.Class323;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface7;

public class Class272 implements Interface7 {
   public Class method63() {
      return Class285.class;
   }

   public Interface12 method64(int var1, Interface14 var2, int var3) {
      return new Class285(var1, var2);
   }

   public Class method59(int var1) {
      return Class285.class;
   }

   public Class method60() {
      return Class285.class;
   }

   public Class method62() {
      return Class285.class;
   }

   public Interface12 method61(int var1, Interface14 var2) {
      return new Class285(var1, var2);
   }

   static void method3604(Class681 var0, byte var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1], -114241754)).anInt3085 * 523990267;
   }

   static final void method3605(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class323.method4157(var3, var4, var0, (byte)-22);
   }

   static final void method3606(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var2 < 0 || var2 > 5 || 2 == var2) {
         var2 = 3;
      }

      Class285.method3799(var2, false, (byte)94);
   }

   static final void method3607(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub43_10628.method8313(var2, -1701103683);
   }

   static final void method3608(InterfaceDef var0, Class243 var1, Class681 var2, short var3) {
      var0.method3370(1326071452);
   }

   static final void method3609(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
