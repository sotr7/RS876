package com.jagex;

import com.jagex.Class239;
import com.jagex.Class248;
import com.jagex.Class249;

public class Class257 {
   Class248 aClass248_2819;
   int anInt2814;
   int anInt2816;
   int anInt2811;
   int anInt2813;
   int anInt2815;
   int anInt2820;
   int[] anIntArray2818;
   int[] anIntArray2817;
   int[][] anIntArrayArray2812;

   void method3508(Class248 var1) {
      this.aClass248_2819 = var1;
      this.anInt2814 = this.aClass248_2819.method3418(16);
      this.anInt2816 = this.aClass248_2819.method3418(24);
      this.anInt2811 = this.aClass248_2819.method3418(24);
      this.anInt2813 = this.aClass248_2819.method3418(24) + 1;
      this.anInt2815 = this.aClass248_2819.method3418(6) + 1;
      this.anInt2820 = this.aClass248_2819.method3418(8);
      if(this.anIntArray2818 == null || this.anIntArray2818.length != this.anInt2815) {
         this.anIntArray2818 = new int[this.anInt2815];
      }

      int var2;
      for(var2 = 0; var2 < this.anInt2815; ++var2) {
         int var3 = 0;
         int var4 = this.aClass248_2819.method3418(3);
         boolean var5 = this.aClass248_2819.method3454() != 0;
         if(var5) {
            var3 = this.aClass248_2819.method3418(5);
         }

         this.anIntArray2818[var2] = var3 << 3 | var4;
      }

      if(this.anIntArray2817 == null || this.anIntArray2817.length != this.anInt2815 * 8) {
         this.anIntArray2817 = new int[this.anInt2815 * 8];
      }

      for(var2 = 0; var2 < this.anInt2815 * 8; ++var2) {
         this.anIntArray2817[var2] = (this.anIntArray2818[var2 >> 3] & 1 << (var2 & 7)) != 0?this.aClass248_2819.method3418(8):-1;
      }

   }

   Class239[] method3509(Class239[] var1, int var2, boolean[] var3) {
      int var4 = var1.length;

      int var5;
      int var6;
      for(var5 = 0; var5 < var4; ++var5) {
         if(!var3[var5]) {
            for(var6 = 0; var6 < var2; ++var6) {
               var1[var5].aFloatArray2446[var6] = 0.0F;
            }
         }
      }

      var5 = this.aClass248_2819.aClass249Array2713[this.anInt2820].anInt2763;
      var6 = this.anInt2811 - this.anInt2816;
      int var7 = var6 / this.anInt2813;
      int var8;
      if(this.anIntArrayArray2812 != null && this.anIntArrayArray2812.length == var4 && this.anIntArrayArray2812[0].length == var7) {
         for(var8 = 0; var8 < var4; ++var8) {
            this.method3512(this.anIntArrayArray2812[var8]);
         }
      } else {
         this.anIntArrayArray2812 = new int[var4][var7];
      }

      for(var8 = 0; var8 < 8; ++var8) {
         int var9 = 0;

         while(var9 < var7) {
            int var10;
            int var11;
            int var12;
            if(var8 == 0) {
               for(var10 = 0; var10 < var4; ++var10) {
                  if(!var3[var10]) {
                     var11 = this.aClass248_2819.aClass249Array2713[this.anInt2820].method3460(this.aClass248_2819);

                     for(var12 = var5 - 1; var12 >= 0; --var12) {
                        if(var9 + var12 < var7) {
                           this.anIntArrayArray2812[var10][var9 + var12] = var11 % this.anInt2815;
                        }

                        var11 /= this.anInt2815;
                     }
                  }
               }
            }

            for(var10 = 0; var10 < var5; ++var10) {
               for(var11 = 0; var11 < var4; ++var11) {
                  if(!var3[var11]) {
                     var12 = this.anIntArrayArray2812[var11][var9];
                     int var13 = this.anIntArray2817[var12 * 8 + var8];
                     if(var13 >= 0) {
                        int var14 = this.anInt2816 + var9 * this.anInt2813;
                        Class249 var15 = this.aClass248_2819.aClass249Array2713[var13];
                        int var16;
                        if(this.anInt2814 == 0) {
                           var16 = this.anInt2813 / var15.anInt2763;

                           for(int var20 = 0; var20 < var16; ++var20) {
                              float[] var21 = var15.method3456(this.aClass248_2819);

                              for(int var19 = 0; var19 < var15.anInt2763; ++var19) {
                                 var1[var11].aFloatArray2446[var14 + var20 + var19 * var16] += var21[var19];
                              }
                           }
                        } else if(this.anInt2814 == 1 || this.anInt2814 == 2) {
                           var16 = 0;

                           while(var16 < this.anInt2813) {
                              float[] var17 = var15.method3456(this.aClass248_2819);

                              for(int var18 = 0; var18 < var15.anInt2763; ++var18) {
                                 var1[var11].aFloatArray2446[var14 + var16] += var17[var18];
                                 ++var16;
                              }
                           }
                        }
                     }
                  }
               }

               ++var9;
               if(var9 >= var7) {
                  break;
               }
            }
         }
      }

      return var1;
   }

   void method3510(int[] var1) {
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = 0;
         }

      }
   }

   void method3511(int[] var1) {
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = 0;
         }

      }
   }

   void method3512(int[] var1) {
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = 0;
         }

      }
   }
}
