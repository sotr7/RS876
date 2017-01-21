package com.jagex;

import com.jagex.Class103;
import com.jagex.Class247;
import com.jagex.Class446;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.client;

public class Class30 {
   public static boolean aBool259;

   public long method737(int var1) {
      return System.nanoTime();
   }

   public Class30() {
      System.nanoTime();
   }

   public long method738() {
      return System.nanoTime();
   }

   public long method739() {
      return System.nanoTime();
   }

   public static void method740(float var0, Class446 var1, Class446 var2, Class446 var3, Class446 var4, Class446 var5, float var6, float var7, float var8, float var9, int var10) {
      if(!var2.method5269(var1)) {
         Class446 var11 = Class446.method5275(var2, var1);
         float var12 = var11.method5276();
         if(var6 > 0.0F) {
            var4 = Class446.method5305(var4);
            var4.method5281(var7 * (var12 / var6));
         }

         if(var4.aFloat4917 != Float.POSITIVE_INFINITY && !Float.isNaN(var1.aFloat4917) && var12 <= var8) {
            Class446 var13 = Class446.method5305(var3);
            var13.method5295();
            Class446 var14 = Class446.method5283(var13, var4);
            Class446 var15 = Class446.method5280(var13, var14);
            var15.method5281(0.5F);
            Class446 var16 = Class446.method5305(var3);
            Class446 var17 = Class446.method5305(var11);
            var17.method5295();
            if(var15.aFloat4917 > var17.aFloat4917) {
               if(var11.aFloat4917 < 0.0F) {
                  var16.aFloat4917 += var0 * var4.aFloat4917;
                  if(var16.aFloat4917 > 0.0F) {
                     var16.aFloat4917 = 0.0F;
                  }
               } else {
                  var16.aFloat4917 -= var0 * var4.aFloat4917;
                  if(var16.aFloat4917 < 0.0F) {
                     var16.aFloat4917 = 0.0F;
                  }
               }
            } else if(var13.aFloat4917 < var5.aFloat4917) {
               if(var11.aFloat4917 < 0.0F) {
                  var16.aFloat4917 -= var0 * var4.aFloat4917;
                  if(var16.aFloat4917 < -var5.aFloat4917) {
                     var16.aFloat4917 = -var5.aFloat4917;
                  }
               } else {
                  var16.aFloat4917 += var0 * var4.aFloat4917;
                  if(var16.aFloat4917 > var5.aFloat4917) {
                     var16.aFloat4917 = var5.aFloat4917;
                  }
               }
            }

            if(var15.aFloat4915 > var17.aFloat4915) {
               if(var11.aFloat4915 < 0.0F) {
                  var16.aFloat4915 += var4.aFloat4915 * var0;
                  if(var16.aFloat4915 > 0.0F) {
                     var16.aFloat4915 = 0.0F;
                  }
               } else {
                  var16.aFloat4915 -= var0 * var4.aFloat4915;
                  if(var16.aFloat4915 < 0.0F) {
                     var16.aFloat4915 = 0.0F;
                  }
               }
            } else if(var13.aFloat4915 < var5.aFloat4915) {
               if(var11.aFloat4915 < 0.0F) {
                  var16.aFloat4915 -= var0 * var4.aFloat4915;
                  if(var16.aFloat4915 < -var5.aFloat4915) {
                     var16.aFloat4915 = -var5.aFloat4915;
                  }
               } else {
                  var16.aFloat4915 += var4.aFloat4915 * var0;
                  if(var16.aFloat4915 > var5.aFloat4915) {
                     var16.aFloat4915 = var5.aFloat4915;
                  }
               }
            }

            if(var15.aFloat4919 > var17.aFloat4919) {
               if(var11.aFloat4919 < 0.0F) {
                  var16.aFloat4919 += var4.aFloat4919 * var0;
                  if(var16.aFloat4919 > 0.0F) {
                     var16.aFloat4919 = 0.0F;
                  }
               } else {
                  var16.aFloat4919 -= var0 * var4.aFloat4919;
                  if(var16.aFloat4919 < 0.0F) {
                     var16.aFloat4919 = 0.0F;
                  }
               }
            } else if(var13.aFloat4919 < var5.aFloat4919) {
               if(var11.aFloat4919 < 0.0F) {
                  var16.aFloat4919 -= var4.aFloat4919 * var0;
                  if(var16.aFloat4919 < -var5.aFloat4919) {
                     var16.aFloat4919 = -var5.aFloat4919;
                  }
               } else {
                  var16.aFloat4919 += var0 * var4.aFloat4919;
                  if(var16.aFloat4919 > var5.aFloat4919) {
                     var16.aFloat4919 = var5.aFloat4919;
                  }
               }
            }

            var3.method5288(var16, 0.8F);
            if(var12 < var9 && var3.method5276() < var9) {
               var1.method5267(var2);
               var3.method5268();
            } else {
               var1.method5272(Class446.method5285(var3, var0));
            }

            var13.method5278();
            var16.method5278();
            var17.method5278();
         } else {
            var1.method5267(var2);
            var3.method5268();
         }

      }
   }

   static final void method741(int var0) {
      int var1 = Class103.anInt1270 * 1609310241;
      int[] var2 = Class103.anIntArray1276;

      for(int var3 = 0; var3 < var1; ++var3) {
         Class639_Sub1_Sub2_Sub1_Sub1 var4 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2[var3]];
         if(null != var4) {
            Class247.method3399(var4, false, (byte)2);
         }
      }

   }
}
