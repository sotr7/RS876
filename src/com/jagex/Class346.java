package com.jagex;

import com.jagex.Class144;
import com.jagex.Class16;
import com.jagex.Class171;
import com.jagex.Class174_Sub3;
import com.jagex.Class192;
import com.jagex.Class593;
import com.jagex.Class595;
import com.jagex.Class603;
import com.jagex.Interface24;
import com.jagex.Interface38;

public class Class346 {
   Class192 aClass192_3602 = new Class192(10485760, 256);
   Class174_Sub3 aClass174_Sub3_3603;
   Interface24 anInterface24_3601;

   Interface38 method4468(Class171 var1, int var2) {
      long var3 = (long)(var2 << 16 | var1.anInt2008 * -2107547335);
      Interface38 var5 = (Interface38)this.aClass192_3602.method2765(var3);
      if(var5 != null) {
         return var5;
      } else if(!this.method4469(var1, var2)) {
         return null;
      } else {
         if(var2 == -1) {
            var2 = var1.anInt1985 * -1178632371;
         }

         Interface38 var7;
         if(var1.aBool2013 && this.aClass174_Sub3_3603.method2548()) {
            float[] var8 = this.anInterface24_3601.method146(Class595.aClass595_7846, var1.anInt2008 * -2107547335, 0.7F, var2, var2, false, (byte)24);
            var7 = this.aClass174_Sub3_3603.method8831(Class144.aClass144_1680, var2, var2, true, var8);
         } else {
            int[] var6;
            if(var1.aClass593_1982 == Class593.aClass593_7817 && Class16.method621(var1.aByte1966, 1632993666)) {
               var6 = this.anInterface24_3601.method143(Class595.aClass595_7846, var1.anInt2008 * -2107547335, 0.7F, var2, var2, true, 550263597);
            } else {
               var6 = this.anInterface24_3601.method144(Class595.aClass595_7846, var1.anInt2008 * -2107547335, 0.7F, var2, var2, false, 2057084467);
            }

            if(var6 == null) {
               return null;
            }

            var7 = this.aClass174_Sub3_3603.method8906(var2, var2, true, var6);
         }

         var7.method254(var1.aByte1991 == 1, var1.aByte1992 == 1);
         this.aClass192_3602.method2781(var7, var3, var2 * var2, (byte)-88);
         return var7;
      }
   }

   boolean method4469(Class171 var1, int var2) {
      if(var2 == -1) {
         var2 = var1.anInt1985 * -1178632371;
      }

      return var1.aBool2013 && this.aClass174_Sub3_3603.method2548()?this.anInterface24_3601.method162(Class595.aClass595_7846, var1.anInt2008 * -2107547335, Class603.aClass603_7889, 0.7F, var2, var2, false, -444935163):(var1.aClass593_1982 == Class593.aClass593_7817 && Class16.method621(var1.aByte1966, 1352962123)?this.anInterface24_3601.method162(Class595.aClass595_7846, var1.anInt2008 * -2107547335, Class603.aClass603_7888, 0.7F, var2, var2, true, 1105608134):this.anInterface24_3601.method162(Class595.aClass595_7846, var1.anInt2008 * -2107547335, Class603.aClass603_7887, 0.7F, var2, var2, false, -495633582));
   }

   void method4470() {
      this.aClass192_3602.method2769(5, (byte)-52);
   }

   void method4471() {
      this.aClass192_3602.method2770(1250751982);
   }

   void method4472() {
      this.aClass192_3602.method2770(1718148750);
   }

   void method4473() {
      this.aClass192_3602.method2769(5, (byte)-94);
   }

   Interface38 method4474(Class171 var1) {
      return this.method4468(var1, var1.anInt1985 * -1178632371);
   }

   void method4475() {
      this.aClass192_3602.method2769(5, (byte)-66);
   }

   void method4476() {
      this.aClass192_3602.method2769(5, (byte)-86);
   }

   void method4477() {
      this.aClass192_3602.method2769(5, (byte)-32);
   }

   void method4478() {
      this.aClass192_3602.method2769(5, (byte)-36);
   }

   Class346(Class174_Sub3 var1, Interface24 var2) {
      this.aClass174_Sub3_3603 = var1;
      this.anInterface24_3601 = var2;
   }

   void method4479() {
      this.aClass192_3602.method2770(2010345347);
   }
}
