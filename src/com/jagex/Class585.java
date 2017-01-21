package com.jagex;

import com.jagex.Class454;
import com.jagex.Class466;
import com.jagex.Class499;
import com.jagex.Class504;
import com.jagex.Class681;
import com.jagex.Interface68;
import com.jagex.Interface76;
import com.jagex.client;

public class Class585 implements Interface76, Interface68 {
   static Class466 aClass466_7791;
   int anInt7785;
   Class454[] aClass454Array7790;
   public static Class585 aClass585_7789;
   public static Class585 aClass585_7786;
   public static Class585 aClass585_7787;
   static Class585 aClass585_7788;

   Class585(int var1, String var2, Class454[] var3) {
      this.anInt7785 = -1294604321 * var1;
      this.aClass454Array7790 = var3;
      Class454[] var4 = this.aClass454Array7790;
      int var5 = 0;

      while(var5 < var4.length) {
         Class454 var6 = var4[var5];
         switch(-1546867669 * var6.aClass481_5149.anInt5462) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         default:
            ++var5;
         }
      }

   }

   public int method21() {
      return this.anInt7785 * 57971743;
   }

   static {
      aClass585_7789 = new Class585(0, "", new Class454[]{Class454.aClass454_5019, Class454.aClass454_4997});
      aClass585_7786 = new Class585(1, "", new Class454[]{Class454.aClass454_5019, Class454.aClass454_5019});
      aClass585_7787 = new Class585(2, "", new Class454[]{Class454.aClass454_4997, Class454.aClass454_4997});
      aClass585_7788 = new Class585(3, "", new Class454[]{Class454.aClass454_5019, Class454.aClass454_5019, Class454.aClass454_4997});
   }

   public int getId() {
      return this.anInt7785 * 57971743;
   }

   static final void method6987(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.aByte3633;
   }

   public static Class504 method6988(byte var0) {
      return Class499.aClass504_5624;
   }

   static boolean method6989(CharSequence var0, int var1, boolean var2, byte var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if(var8 == 0) {
               if(45 == var9) {
                  var4 = true;
                  continue;
               }

               if(43 == var9 && var2) {
                  continue;
               }
            }

            int var11;
            if(var9 >= 48 && var9 <= 57) {
               var11 = var9 - 48;
            } else if(var9 >= 65 && var9 <= 90) {
               var11 = var9 - 55;
            } else {
               if(var9 < 97 || var9 > 122) {
                  return false;
               }

               var11 = var9 - 87;
            }

            if(var11 >= var1) {
               return false;
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var1 * var6 + var11;
            if(var10 / var1 != var6) {
               return false;
            }

            var6 = var10;
            var5 = true;
         }

         return var5;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static float method6990(float var0, float var1, int var2) {
      double var3 = Math.atan2((double)var0, (double)var1);
      if(var3 < 0.0D) {
         var3 = 3.141592653589793D + var3 + 3.141592653589793D;
      }

      return (float)var3;
   }

   static final void method6991(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      client.anInt11177 = var0.anIntArray8622[-1730576285 * var0.anInt8623] * 1361564269;
      client.anInt10987 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623] * 378256179;
   }
}
