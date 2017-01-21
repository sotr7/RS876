package com.jagex;

import com.jagex.Class124_Sub1;
import com.jagex.Class144;
import com.jagex.Class16;
import com.jagex.Class166;
import com.jagex.Class171;
import com.jagex.Class174_Sub2;
import com.jagex.Class192;
import com.jagex.Class593;
import com.jagex.Class595;
import com.jagex.Class603;
import com.jagex.Interface24;

public class Class154 {
   Class192 aClass192_1725 = new Class192(10485760, 256);
   Class174_Sub2 aClass174_Sub2_1724;
   Interface24 anInterface24_1723;

   Class154(Class174_Sub2 var1, Interface24 var2) {
      this.aClass174_Sub2_1724 = var1;
      this.anInterface24_1723 = var2;
   }

   Class124_Sub1 method1831(Class171 var1, int var2) {
      Class124_Sub1 var3 = (Class124_Sub1)this.aClass192_1725.method2765((long)(var1.anInt2008 * -2107547335));
      if(var3 != null) {
         return var3;
      } else if(!this.method1832(Class595.aClass595_7846, var1, var2)) {
         return null;
      } else {
         if(var2 == -1) {
            var2 = var1.anInt1985 * -1178632371;
         }

         Class124_Sub1 var5;
         if(var1.aBool2013 && this.aClass174_Sub2_1724.method2548()) {
            float[] var6 = this.anInterface24_1723.method146(Class595.aClass595_7846, var1.anInt2008 * -2107547335, 0.7F, var2, var2, false, (byte)105);
            var5 = new Class124_Sub1(this.aClass174_Sub2_1724, 3553, Class144.aClass144_1680, Class166.aClass166_1893, var2, var2, var1.aByte2009 != 0, var6, Class144.aClass144_1680);
         } else {
            int[] var4;
            if(var1.aClass593_1982 == Class593.aClass593_7817 && Class16.method621(var1.aByte1966, 1863218539)) {
               var4 = this.anInterface24_1723.method143(Class595.aClass595_7846, var1.anInt2008 * -2107547335, 0.7F, var2, var2, true, 1664118719);
            } else {
               var4 = this.anInterface24_1723.method144(Class595.aClass595_7846, var1.anInt2008 * -2107547335, 0.7F, var2, var2, false, 2041080236);
            }

            var5 = new Class124_Sub1(this.aClass174_Sub2_1724, 3553, var2, var2, var1.aByte2009 != 0, var4, 0, 0, false);
         }

         var5.method8335(var1.aByte1991 == 1, var1.aByte1992 == 1);
         this.aClass192_1725.method2781(var5, (long)(var1.anInt2008 * -2107547335), var2 * var2, (byte)-118);
         return var5;
      }
   }

   boolean method1832(Class595 var1, Class171 var2, int var3) {
      if(var3 == -1) {
         var3 = var2.anInt1985 * -1178632371;
      }

      return var2.aBool2013 && this.aClass174_Sub2_1724.method2548()?this.anInterface24_1723.method162(var1, var2.anInt2008 * -2107547335, Class603.aClass603_7889, 0.7F, var3, var3, false, 551514652):(var2.aClass593_1982 == Class593.aClass593_7817 && Class16.method621(var2.aByte1966, 1898129436)?this.anInterface24_1723.method162(var1, var2.anInt2008 * -2107547335, Class603.aClass603_7888, 0.7F, var3, var3, true, -1640771410):this.anInterface24_1723.method162(var1, var2.anInt2008 * -2107547335, Class603.aClass603_7887, 0.7F, var3, var3, false, 1395730333));
   }

   void method1833() {
      this.aClass192_1725.method2770(1848993982);
   }

   void method1834() {
      this.aClass192_1725.method2769(5, (byte)-26);
   }

   void method1835() {
      this.aClass192_1725.method2769(5, (byte)-94);
   }

   Class124_Sub1 method1836(Class171 var1) {
      return this.method1831(var1, var1.anInt1985 * -1178632371);
   }

   void method1837() {
      this.aClass192_1725.method2769(5, (byte)-58);
   }

   void method1838() {
      this.aClass192_1725.method2769(5, (byte)-103);
   }

   void method1839() {
      this.aClass192_1725.method2770(1394449259);
   }
}
