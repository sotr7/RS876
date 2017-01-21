package com.jagex;

import com.jagex.Class10;
import com.jagex.Class169;
import com.jagex.Class231;
import com.jagex.InterfaceDef;
import com.jagex.Class466;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.Interface76;

public class Class159 implements Interface76 {
   public static Class466 aClass466_1768;
   static Class169 aClass169_1769;
   int anInt1766;
   int anInt1767;
   static Class159 aClass159_1760 = new Class159(1, 1);
   static Class159 aClass159_1762 = new Class159(0, 2);
   static Class159 aClass159_1763 = new Class159(4, 3);
   static Class159 aClass159_1765 = new Class159(5, 4);
   static Class159 aClass159_1759 = new Class159(6, 5);
   static Class159 aClass159_1764 = new Class159(3, 6);
   static Class159 aClass159_1761 = new Class159(2, 7);

   public int getId() {
      return this.anInt1767 * 1717161601;
   }

   public int method21() {
      return this.anInt1767 * 1717161601;
   }

   Class159(int var1, int var2) {
      this.anInt1766 = var1 * -1334825945;
      this.anInt1767 = var2 * 748188033;
   }

   static final void method1875(Class681 var0, byte var1) {
      var0.aLongArray8626[(var0.anInt8630 += 1112803603) * -1032509157 - 1] = var0.aLongArray8619[var0.anIntArray8642[-244840757 * var0.anInt8644]];
   }

   static final void method1876(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anInt8623 -= 379191958;
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var5 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class83 var6 = (Class83)Class10.aClass40_Sub20_62.method89(var4, -792771887);
      if(var5 != 1040538721 * var6.anInt843) {
         var3.method3354(var4, var5, 2019513325);
      } else {
         var3.method3356(var4, -1911350669);
      }

   }

   public static int method1877(CharSequence var0, int var1, int var2) {
      return Class231.method3257(var0, var1, true, (byte)-20);
   }
}
