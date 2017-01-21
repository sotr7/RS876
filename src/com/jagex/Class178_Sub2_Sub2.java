package com.jagex;

import com.jagex.Class124_Sub2;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class171;
import com.jagex.Class174_Sub2;
import com.jagex.Class178_Sub2;
import com.jagex.Class595;
import com.jagex.Class603;
import com.jagex.Interface24;

public class Class178_Sub2_Sub2 extends Class178_Sub2 {
   Class124_Sub2 aClass124_Sub2_11557;
   static int[][] anIntArrayArray11556 = new int[6][];
   Class174_Sub2 aClass174_Sub2_11559;
   int anInt11558;

   Class124_Sub2 method8591() {
      if(this.aClass124_Sub2_11557 == null) {
         Interface24 var1 = this.aClass174_Sub2_11559.anInterface24_2034;
         Class171 var2 = this.aClass174_Sub2_11559.aClass169_2035.method2122(this.anInt11558, (byte)-101);
         if(var2 == null) {
            return null;
         }

         if(!var2.aBool1984) {
            return null;
         }

         if(!var1.method162(Class595.aClass595_7848, this.anInt11558, Class603.aClass603_7888, 1.0F, var2.anInt1985 * -1178632371, var2.anInt1985 * -1178632371, false, 200701802)) {
            return null;
         }

         int[] var3 = var1.method143(Class595.aClass595_7848, this.anInt11558, 1.0F, var2.anInt1985 * -1178632371, var2.anInt1985 * -1178632371, false, 660720711);
         int var4 = var2.anInt1985 * -1178632371 * var2.anInt1985 * -1178632371;
         if(var3 == null) {
            return null;
         }

         for(int var5 = 0; var5 < 6; ++var5) {
            anIntArrayArray11556[var5] = new int[var4];
            System.arraycopy(var3, var4 * var5, anIntArrayArray11556[var5], 0, var4);
         }

         this.aClass124_Sub2_11557 = new Class124_Sub2(this.aClass174_Sub2_11559, Class144.aClass144_1689, Class166.aClass166_1884, var2.anInt1985 * -1178632371, var2.aByte2009 != 0, anIntArrayArray11556);
      }

      return this.aClass124_Sub2_11557;
   }

   Class124_Sub2 method8589() {
      if(this.aClass124_Sub2_11557 == null) {
         Interface24 var1 = this.aClass174_Sub2_11559.anInterface24_2034;
         Class171 var2 = this.aClass174_Sub2_11559.aClass169_2035.method2122(this.anInt11558, (byte)81);
         if(var2 == null) {
            return null;
         }

         if(!var2.aBool1984) {
            return null;
         }

         if(!var1.method162(Class595.aClass595_7848, this.anInt11558, Class603.aClass603_7888, 1.0F, var2.anInt1985 * -1178632371, var2.anInt1985 * -1178632371, false, 539694282)) {
            return null;
         }

         int[] var3 = var1.method143(Class595.aClass595_7848, this.anInt11558, 1.0F, var2.anInt1985 * -1178632371, var2.anInt1985 * -1178632371, false, 1006786335);
         int var4 = var2.anInt1985 * -1178632371 * var2.anInt1985 * -1178632371;
         if(var3 == null) {
            return null;
         }

         for(int var5 = 0; var5 < 6; ++var5) {
            anIntArrayArray11556[var5] = new int[var4];
            System.arraycopy(var3, var4 * var5, anIntArrayArray11556[var5], 0, var4);
         }

         this.aClass124_Sub2_11557 = new Class124_Sub2(this.aClass174_Sub2_11559, Class144.aClass144_1689, Class166.aClass166_1884, var2.anInt1985 * -1178632371, var2.aByte2009 != 0, anIntArrayArray11556);
      }

      return this.aClass124_Sub2_11557;
   }

   Class124_Sub2 method8590() {
      if(this.aClass124_Sub2_11557 == null) {
         Interface24 var1 = this.aClass174_Sub2_11559.anInterface24_2034;
         Class171 var2 = this.aClass174_Sub2_11559.aClass169_2035.method2122(this.anInt11558, (byte)-4);
         if(var2 == null) {
            return null;
         }

         if(!var2.aBool1984) {
            return null;
         }

         if(!var1.method162(Class595.aClass595_7848, this.anInt11558, Class603.aClass603_7888, 1.0F, var2.anInt1985 * -1178632371, var2.anInt1985 * -1178632371, false, 299248795)) {
            return null;
         }

         int[] var3 = var1.method143(Class595.aClass595_7848, this.anInt11558, 1.0F, var2.anInt1985 * -1178632371, var2.anInt1985 * -1178632371, false, 328119775);
         int var4 = var2.anInt1985 * -1178632371 * var2.anInt1985 * -1178632371;
         if(var3 == null) {
            return null;
         }

         for(int var5 = 0; var5 < 6; ++var5) {
            anIntArrayArray11556[var5] = new int[var4];
            System.arraycopy(var3, var4 * var5, anIntArrayArray11556[var5], 0, var4);
         }

         this.aClass124_Sub2_11557 = new Class124_Sub2(this.aClass174_Sub2_11559, Class144.aClass144_1689, Class166.aClass166_1884, var2.anInt1985 * -1178632371, var2.aByte2009 != 0, anIntArrayArray11556);
      }

      return this.aClass124_Sub2_11557;
   }

   Class178_Sub2_Sub2(Class174_Sub2 var1, int var2) {
      this.aClass174_Sub2_11559 = var1;
      this.anInt11558 = var2;
   }
}
