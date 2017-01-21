package com.jagex;

import com.jagex.Class17;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class315_Sub1;
import com.jagex.Class318_Sub2;
import com.jagex.Class602;
import com.jagex.Class681;

public class Class34 {
   public static int[] anIntArray371;
   public int anInt370;
   int anInt369;

   public int method815() {
      return 604797385 * this.anInt370 & 16383;
   }

   public boolean method816(int var1, int var2, int var3, int var4) {
      int var5 = 1391757693 * this.anInt369;
      if(604797385 * this.anInt370 == var1 && 0 == this.anInt369 * 1391757693) {
         return false;
      } else {
         boolean var6;
         int var7;
         if(0 != this.anInt369 * 1391757693) {
            int var8;
            if(1391757693 * this.anInt369 > 0 && var1 > this.anInt370 * 604797385) {
               var7 = this.anInt369 * 1391757693 * this.anInt369 * 1391757693 / (var2 * 2);
               var8 = var7 + 604797385 * this.anInt370;
               if(var8 < var1 && var8 >= 604797385 * this.anInt370) {
                  var6 = true;
               } else {
                  var6 = false;
               }
            } else if(this.anInt369 * 1391757693 < 0 && var1 < 604797385 * this.anInt370) {
               var7 = this.anInt369 * 1391757693 * 1391757693 * this.anInt369 / (var2 * 2);
               var8 = this.anInt370 * 604797385 - var7;
               if(var8 > var1 && var8 <= 604797385 * this.anInt370) {
                  var6 = true;
               } else {
                  var6 = false;
               }
            } else {
               var6 = false;
            }
         } else {
            if(var1 > 604797385 * this.anInt370 && var1 <= var2 + 604797385 * this.anInt370 || var1 < this.anInt370 * 604797385 && var1 >= 604797385 * this.anInt370 - var2) {
               this.anInt370 = var1 * 998174841;
               return false;
            }

            var6 = true;
         }

         if(var6) {
            if(var1 > 604797385 * this.anInt370) {
               this.anInt369 += var2 * 1191901141;
               if(0 != var3 && 1391757693 * this.anInt369 > var3) {
                  this.anInt369 = var3 * 1191901141;
               }
            } else {
               this.anInt369 -= var2 * 1191901141;
               if(0 != var3 && this.anInt369 * 1391757693 < -var3) {
                  this.anInt369 = 1191901141 * -var3;
               }
            }

            if(1391757693 * this.anInt369 != var5) {
               var7 = 1391757693 * this.anInt369 * this.anInt369 * 1391757693 / (var2 * 2);
               if(var1 > this.anInt370 * 604797385) {
                  if(var7 + 604797385 * this.anInt370 > var1) {
                     this.anInt369 = var5 * 1191901141;
                  }
               } else if(var1 < 604797385 * this.anInt370 && this.anInt370 * 604797385 - var7 < var1) {
                  this.anInt369 = 1191901141 * var5;
               }
            }
         } else if(1391757693 * this.anInt369 > 0) {
            this.anInt369 -= var2 * 1191901141;
            if(1391757693 * this.anInt369 < 0) {
               this.anInt369 = 0;
            }
         } else {
            this.anInt369 += 1191901141 * var2;
            if(1391757693 * this.anInt369 > 0) {
               this.anInt369 = 0;
            }
         }

         this.anInt370 += (var5 + 1391757693 * this.anInt369 >> 1) * 998174841;
         return var6;
      }
   }

   public int method817(int var1) {
      return 604797385 * this.anInt370 & 16383;
   }

   public void method818(int var1) {
      this.anInt370 = 998174841 * var1;
      this.anInt369 = 0;
   }

   public void method819(int var1) {
      this.anInt370 = (604797385 * this.anInt370 & 16383) * 998174841;
   }

   public void method820(int var1, int var2) {
      this.anInt370 = 998174841 * var1;
      this.anInt369 = 0;
   }

   public int method821() {
      return 604797385 * this.anInt370 & 16383;
   }

   public int method822() {
      return 604797385 * this.anInt370 & 16383;
   }

   static final void method823(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)32);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class602.method7096(var3, var4, var0, Class318_Sub2.aClass526_Sub9_10065 == var0.aClass526_Sub9_8646?Class258.aClass258_2827:Class258.aClass258_2825, 1340751157);
   }

   static void method824(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class17.method626(2079046623);
   }
}
