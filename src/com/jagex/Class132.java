package com.jagex;

import com.jagex.Class124_Sub1;
import com.jagex.Class124_Sub4;
import com.jagex.Class144;
import com.jagex.Class150;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class234;
import com.jagex.Class402_Sub1_Sub1;
import com.jagex.Class402_Sub2_Sub2;
import com.jagex.Class460;
import com.jagex.Class51;
import com.jagex.Class527_Sub1;
import com.jagex.Class543;

public class Class132 {
   static final int anInt1622 = 128;
   static final int anInt1625 = 16;
   static final int anInt1630 = 4000;
   static final int anInt1632 = 128;
   Class124_Sub1[] aClass124_Sub1Array1627 = null;
   Class124_Sub4 aClass124_Sub4_1634 = null;
   Class124_Sub1[] aClass124_Sub1Array1629 = null;
   Class124_Sub4 aClass124_Sub4_1628 = null;
   Class124_Sub4 aClass124_Sub4_1631 = null;
   boolean aBool1624;
   static Object anObject1626;
   static Object anObject1633;
   static Object anObject1623;

   Class132(Class174_Sub2 var1) {
      this.aBool1624 = var1.aBool9632;
      method1628(var1);
      if(!this.aBool1624) {
         this.aClass124_Sub1Array1627 = new Class124_Sub1[16];

         int var2;
         byte[] var3;
         for(var2 = 0; var2 < 16; ++var2) {
            var3 = Class51.method956(anObject1626, var2 * '\u8000', '\u8000', 1508067232);
            this.aClass124_Sub1Array1627[var2] = new Class124_Sub1(var1, 3553, Class144.aClass144_1683, Class166.aClass166_1884, 128, 128, true, var3, Class144.aClass144_1683, false);
         }

         this.aClass124_Sub1Array1629 = new Class124_Sub1[16];

         for(var2 = 0; var2 < 16; ++var2) {
            var3 = Class51.method956(anObject1633, var2 * '\u8000', '\u8000', 1960193973);
            this.aClass124_Sub1Array1629[var2] = new Class124_Sub1(var1, 3553, Class144.aClass144_1683, Class166.aClass166_1884, 128, 128, true, var3, Class144.aClass144_1683, false);
         }
      } else {
         byte[] var5 = Class460.method5464(anObject1626, false, -326193133);
         this.aClass124_Sub4_1634 = new Class124_Sub4(var1, Class144.aClass144_1683, Class166.aClass166_1884, 128, 128, 16, var5, Class144.aClass144_1683);
         var5 = Class460.method5464(anObject1633, false, 1021406134);
         this.aClass124_Sub4_1628 = new Class124_Sub4(var1, Class144.aClass144_1683, Class166.aClass166_1884, 128, 128, 16, var5, Class144.aClass144_1683);
         Class150 var6 = var1.aClass150_9521;
         if(var6.method1754()) {
            var5 = Class460.method5464(anObject1623, false, 1668634849);
            this.aClass124_Sub4_1631 = new Class124_Sub4(var1, Class144.aClass144_1680, Class166.aClass166_1884, 128, 128, 16);
            Class124_Sub4 var4 = new Class124_Sub4(var1, Class144.aClass144_1682, Class166.aClass166_1884, 128, 128, 16, var5, Class144.aClass144_1682);
            if(!var6.method1752(this.aClass124_Sub4_1631, var4, 2.0F)) {
               this.aClass124_Sub4_1631.method1490();
               this.aClass124_Sub4_1631 = null;
            } else {
               this.aClass124_Sub4_1631.method1474();
            }

            var4.method1490();
         }
      }

   }

   static void method1628(Class174_Sub2 var0) {
      byte[] var2;
      if(anObject1626 == null) {
         Class402_Sub2_Sub2 var1 = new Class402_Sub2_Sub2();
         var2 = var1.method10475(128, 128, 16);
         anObject1626 = Class234.method3275(var2, false, 753627221);
      }

      if(anObject1633 == null) {
         Class402_Sub1_Sub1 var3 = new Class402_Sub1_Sub1();
         var2 = var3.method10476(128, 128, 16);
         anObject1633 = Class234.method3275(var2, false, 1758202840);
      }

      Class150 var4 = var0.aClass150_9521;
      if(var4.method1754() && anObject1623 == null) {
         var2 = Class543.method6492(128, 128, 16, 8, new Class527_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
         anObject1623 = Class234.method3275(var2, false, 764609469);
      }

   }
}
