package com.jagex;

import com.jagex.Class157;
import com.jagex.InterfaceDef;
import com.jagex.Class454;
import com.jagex.Class48;
import com.jagex.Class611;
import com.jagex.Class65;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Exception_Sub3;
import com.jagex.Interface6;

public class Class427 implements Interface6 {
   boolean aBool4803;
   String aString4802;

   public Class48 method55() {
      return Class48.aClass48_645;
   }

   public Class48 method58() {
      return Class48.aClass48_645;
   }

   boolean method5025(byte var1) {
      return this.aBool4803;
   }

   void method5026(int var1) {
      this.aBool4803 = true;
   }

   public Class48 method52(byte var1) {
      return Class48.aClass48_645;
   }

   public Class48 method57() {
      return Class48.aClass48_645;
   }

   public int method21() {
      if(this.aBool4803) {
         return 100;
      } else {
         try {
            return Class611.aClass520_8020.method6247(this.aString4802, 491134625);
         } catch (Exception_Sub3 var2) {
            Class157.method1862(Class65.aClass65_748, var2.aString11353, var2.anInt11354 * 1675998541, var2.getCause(), (byte)-82);
            this.aBool4803 = true;
            return 100;
         }
      }
   }

   public int method53() {
      if(this.aBool4803) {
         return 100;
      } else {
         try {
            return Class611.aClass520_8020.method6247(this.aString4802, 1758249823);
         } catch (Exception_Sub3 var2) {
            Class157.method1862(Class65.aClass65_748, var2.aString11353, var2.anInt11354 * 1675998541, var2.getCause(), (byte)73);
            this.aBool4803 = true;
            return 100;
         }
      }
   }

   public Class48 method54() {
      return Class48.aClass48_645;
   }

   public int method56(int var1) {
      if(this.aBool4803) {
         return 100;
      } else {
         try {
            return Class611.aClass520_8020.method6247(this.aString4802, 1578977172);
         } catch (Exception_Sub3 var3) {
            Class157.method1862(Class65.aClass65_748, var3.aString11353, var3.anInt11354 * 1675998541, var3.getCause(), (byte)-3);
            this.aBool4803 = true;
            return 100;
         }
      }
   }

   Class427(String var1) {
      this.aString4802 = var1;
   }

   boolean method5027() {
      return this.aBool4803;
   }

   boolean method5028() {
      return this.aBool4803;
   }

   void method5029() {
      this.aBool4803 = true;
   }

   public static int method5030(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if((var5 & 1) == 1) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return 0 == var2?var1:(1 == var2?7 - var0 - (var3 - 1):(var2 == 2?7 - var1 - (var4 - 1):var0));
   }

   static final void method5031(Class681 var0, int var1) {
      int var2 = var0.anIntArray8642[-244840757 * var0.anInt8644] >> 16;
      int var3 = var0.anIntArray8642[-244840757 * var0.anInt8644] & '\uffff';
      int var4 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var4 >= 0 && var4 <= 5000) {
         var0.anIntArray8620[var2] = var4;
         byte var5 = -1;
         if(var3 == Class454.aClass454_5019.getId()) {
            var5 = 0;
         }

         for(int var6 = 0; var6 < var4; ++var6) {
            var0.anIntArrayArray8645[var2][var6] = var5;
         }

      } else {
         throw new RuntimeException();
      }
   }

   static final void method5032(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2649 * 769259159;
   }

   static final void method5033(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method5034(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
