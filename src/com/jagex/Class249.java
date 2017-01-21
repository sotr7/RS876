package com.jagex;

import com.jagex.Class248;
import com.jagex.Class452;

public class Class249 {
   int anInt2763;
   int anInt2761;
   int[] anIntArray2762;
   int anInt2766 = 0;
   int anInt2765 = 0;
   int[] anIntArray2764;
   float[][] aFloatArrayArray2767;
   int[] anIntArray2760;

   float[] method3456(Class248 var1) {
      return this.aFloatArrayArray2767[this.method3460(var1)];
   }

   static int method3457(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var3 = var2;
         int var4 = var1;

         int var5;
         for(var5 = 1; var4 > 1; var4 >>= 1) {
            if(0 != (var4 & 1)) {
               var5 *= var3;
            }

            var3 *= var3;
         }

         int var6;
         if(var4 == 1) {
            var6 = var3 * var5;
         } else {
            var6 = var5;
         }

         if(var6 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   void method3458(Class248 var1) {
      int var2 = var1.method3416();
      int var3 = var1.method3440();
      var1.method3418(24);
      this.anInt2763 = var1.method3418(16);
      this.anInt2761 = var1.method3418(24);
      if(this.anIntArray2762 == null || this.anIntArray2762.length != this.anInt2761) {
         this.anIntArray2762 = new int[this.anInt2761];
      }

      boolean var4 = var1.method3454() != 0;
      int var5;
      int var6;
      int var8;
      if(var4) {
         var5 = 0;

         for(var6 = var1.method3418(5) + 1; var5 < this.anInt2761; ++var6) {
            int var7 = var1.method3418(Class452.method5370(this.anInt2761 - var5, (byte)37));

            for(var8 = 0; var8 < var7; ++var8) {
               this.anIntArray2762[var5++] = var6;
            }
         }
      } else {
         boolean var17 = var1.method3454() != 0;

         for(var6 = 0; var6 < this.anInt2761; ++var6) {
            if(var17 && var1.method3454() == 0) {
               this.anIntArray2762[var6] = 0;
            } else {
               this.anIntArray2762[var6] = var1.method3418(5) + 1;
            }
         }
      }

      this.method3463();
      var5 = var1.method3418(4);
      if(var5 > 0) {
         float var18 = var1.method3415(var1.method3418(32));
         float var19 = var1.method3415(var1.method3418(32));
         var8 = var1.method3418(4) + 1;
         boolean var9 = var1.method3454() != 0;
         int var10;
         if(var5 == 1) {
            var10 = method3457(this.anInt2761, this.anInt2763);
         } else {
            var10 = this.anInt2761 * this.anInt2763;
         }

         this.anIntArray2764 = new int[var10];

         int var11;
         for(var11 = 0; var11 < var10; ++var11) {
            this.anIntArray2764[var11] = var1.method3418(var8);
         }

         this.aFloatArrayArray2767 = new float[this.anInt2761][this.anInt2763];
         float var12;
         int var13;
         int var14;
         if(var5 == 1) {
            for(var11 = 0; var11 < this.anInt2761; ++var11) {
               var12 = 0.0F;
               var13 = 1;

               for(var14 = 0; var14 < this.anInt2763; ++var14) {
                  int var15 = var11 / var13 % var10;
                  float var16 = (float)this.anIntArray2764[var15] * var19 + var18 + var12;
                  this.aFloatArrayArray2767[var11][var14] = var16;
                  if(var9) {
                     var12 = var16;
                  }

                  var13 *= var10;
               }
            }
         } else {
            for(var11 = 0; var11 < this.anInt2761; ++var11) {
               var12 = 0.0F;
               var13 = var11 * this.anInt2763;

               for(var14 = 0; var14 < this.anInt2763; ++var14) {
                  float var20 = (float)this.anIntArray2764[var13] * var19 + var18 + var12;
                  this.aFloatArrayArray2767[var11][var14] = var20;
                  if(var9) {
                     var12 = var20;
                  }

                  ++var13;
               }
            }
         }
      }

      this.anInt2766 = var1.method3416() - var2;
      this.anInt2765 = var1.method3440() - var3;
   }

   static int method3459(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var3 = var2;
         int var4 = var1;

         int var5;
         for(var5 = 1; var4 > 1; var4 >>= 1) {
            if(0 != (var4 & 1)) {
               var5 *= var3;
            }

            var3 *= var3;
         }

         int var6;
         if(var4 == 1) {
            var6 = var3 * var5;
         } else {
            var6 = var5;
         }

         if(var6 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   int method3460(Class248 var1) {
      int var2;
      for(var2 = 0; this.anIntArray2760[var2] >= 0; var2 = var1.method3454() != 0?this.anIntArray2760[var2]:var2 + 1) {
         ;
      }

      return ~this.anIntArray2760[var2];
   }

   static int method3461(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var3 = var2;
         int var4 = var1;

         int var5;
         for(var5 = 1; var4 > 1; var4 >>= 1) {
            if(0 != (var4 & 1)) {
               var5 *= var3;
            }

            var3 *= var3;
         }

         int var6;
         if(var4 == 1) {
            var6 = var3 * var5;
         } else {
            var6 = var5;
         }

         if(var6 <= var0) {
            return var2;
         }

         --var2;
      }
   }

   void method3462() {
      int[] var1 = new int[this.anInt2761];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.anInt2761; ++var3) {
         var4 = this.anIntArray2762[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.anIntArray2760 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.anInt2761; ++var3) {
         var4 = this.anIntArray2762[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.anIntArray2760[var6] == 0) {
                     this.anIntArray2760[var6] = var11;
                  }

                  var6 = this.anIntArray2760[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.anIntArray2760.length) {
                  int[] var12 = new int[this.anIntArray2760.length * 2];

                  for(var10 = 0; var10 < this.anIntArray2760.length; ++var10) {
                     var12[var10] = this.anIntArray2760[var10];
                  }

                  this.anIntArray2760 = var12;
               }

               var8 >>>= 1;
            }

            this.anIntArray2760[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   void method3463() {
      int[] var1 = new int[this.anInt2761];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.anInt2761; ++var3) {
         var4 = this.anIntArray2762[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.anIntArray2760 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.anInt2761; ++var3) {
         var4 = this.anIntArray2762[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.anIntArray2760[var6] == 0) {
                     this.anIntArray2760[var6] = var11;
                  }

                  var6 = this.anIntArray2760[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.anIntArray2760.length) {
                  int[] var12 = new int[this.anIntArray2760.length * 2];

                  for(var10 = 0; var10 < this.anIntArray2760.length; ++var10) {
                     var12[var10] = this.anIntArray2760[var10];
                  }

                  this.anIntArray2760 = var12;
               }

               var8 >>>= 1;
            }

            this.anIntArray2760[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   void method3464(Class248 var1) {
      var1.method3418(this.anInt2765 * 8 + this.anInt2766);
   }

   void method3465() {
      int[] var1 = new int[this.anInt2761];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.anInt2761; ++var3) {
         var4 = this.anIntArray2762[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.anIntArray2760 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.anInt2761; ++var3) {
         var4 = this.anIntArray2762[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.anIntArray2760[var6] == 0) {
                     this.anIntArray2760[var6] = var11;
                  }

                  var6 = this.anIntArray2760[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.anIntArray2760.length) {
                  int[] var12 = new int[this.anIntArray2760.length * 2];

                  for(var10 = 0; var10 < this.anIntArray2760.length; ++var10) {
                     var12[var10] = this.anIntArray2760[var10];
                  }

                  this.anIntArray2760 = var12;
               }

               var8 >>>= 1;
            }

            this.anIntArray2760[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }
}
