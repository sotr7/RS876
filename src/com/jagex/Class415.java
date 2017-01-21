package com.jagex;

import com.jagex.Class195;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class277;
import com.jagex.Class526_Sub31;
import com.jagex.Class632;
import com.jagex.Class681;
import com.jagex.Class79;
import com.jagex.Interface76;

public class Class415 implements Interface76 {
   int anInt4473;
   public int anInt4476;
   public boolean aBool4477;
   public boolean aBool4474;
   static Class415 aClass415_4475 = new Class415(0, -1, true, false, true);
   static Class415 aClass415_4466 = new Class415(1, 0, true, true, true);
   static Class415 aClass415_4468 = new Class415(2, 1, true, true, false);
   static Class415 aClass415_4469 = new Class415(3, 8, false, true, true);
   static Class415 aClass415_4470 = new Class415(4, 9, false, false, true);
   static Class415 aClass415_4478 = new Class415(5, 10, false, true, true);
   static Class415 aClass415_4472 = new Class415(6, 11, false, false, true);
   static Class415 aClass415_4471 = new Class415(7, 12, false, false, true);
   static Class415 aClass415_4467 = new Class415(8, 13, false, false, true);

   public int getId() {
      return this.anInt4473 * -1278973949;
   }

   Class415(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.anInt4473 = -587234645 * var1;
      this.anInt4476 = -302184803 * var2;
      this.aBool4477 = var4;
      this.aBool4474 = var5;
   }

   public int method21() {
      return this.anInt4473 * -1278973949;
   }

   public static Class415[] method4930(int var0) {
      return new Class415[]{aClass415_4475, aClass415_4471, aClass415_4469, aClass415_4467, aClass415_4466, aClass415_4468, aClass415_4472, aClass415_4470, aClass415_4478};
   }

   public static String method4931(String var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if(60 == var5 || var5 == 62) {
            var3 += 3;
         }
      }

      StringBuilder var7 = new StringBuilder(var2 + var3);

      for(int var8 = 0; var8 < var2; ++var8) {
         char var6 = var0.charAt(var8);
         if(var6 == 60) {
            var7.append("<lt>");
         } else if(62 == var6) {
            var7.append("<gt>");
         } else {
            var7.append(var6);
         }
      }

      return var7.toString();
   }

   static final void method4932(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2580 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 767821273;
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method4933(InterfaceDef var0, Class681 var1, byte var2) {
      var1.anInt8623 -= 379191958;
      int var3 = var1.anIntArray8622[var1.anInt8623 * -1730576285] - 1;
      int var4 = var1.anIntArray8622[-1730576285 * var1.anInt8623 + 1];
      if(var3 >= 0 && var3 <= 9) {
         Class632.method7490(var0, var3, var4, var1, 1264429708);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method4934(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class277.aClass56_3028.method994(var2, (byte)0).method10679(2077452905);
   }

   static final void method4935(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
   }

   static final void method4936(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub31_10635.method8313(var2, -845313524);
   }

   static final void method4937(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 313661623 * Class195.anInt2183;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class79.anInt821 * 1008504821;
   }
}
