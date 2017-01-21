package com.jagex;

import com.jagex.Class1;
import com.jagex.Class162;
import com.jagex.Class162_Sub2;
import com.jagex.Class163;
import com.jagex.Class173_Sub2;
import com.jagex.Class174_Sub1;

public class Class163_Sub2 extends Class163 {
   Class174_Sub1 aClass174_Sub1_9451;
   int[] anIntArray9450;
   int[] anIntArray9449;
   byte[][] aByteArrayArray9447;
   int[] anIntArray9452;
   int[] anIntArray9448;
   int[] anIntArray9453;

   void method1906(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9451.anIntArray9243) {
         var2 += this.anIntArray9448[var1];
         var3 += this.anIntArray9452[var1];
         int var6 = this.anIntArray9450[var1];
         int var7 = this.anIntArray9449[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9451.anInt9277;
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9451.anInt9267 - var3;
            var7 -= var13;
            var3 = 1511023883 * this.aClass174_Sub1_9451.anInt9267;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var7 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
         }

         if(var2 < this.aClass174_Sub1_9451.anInt9247 * -217416947) {
            var13 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9451.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var2 + var6 > 1270312011 * this.aClass174_Sub1_9451.anInt9271) {
            var13 = var2 + var6 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(var5) {
               this.method8592(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method8595(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method1908(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9451.anIntArray9243) {
         var2 += this.anIntArray9448[var1];
         var3 += this.anIntArray9452[var1];
         int var6 = this.anIntArray9450[var1];
         int var7 = this.anIntArray9449[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9451.anInt9277;
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9451.anInt9267 - var3;
            var7 -= var13;
            var3 = 1511023883 * this.aClass174_Sub1_9451.anInt9267;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var7 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
         }

         if(var2 < this.aClass174_Sub1_9451.anInt9247 * -217416947) {
            var13 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9451.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var2 + var6 > 1270312011 * this.aClass174_Sub1_9451.anInt9271) {
            var13 = var2 + var6 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(var5) {
               this.method8592(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method8595(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   Class163_Sub2(Class174_Sub1 var1, Class1 var2, Class173_Sub2[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aClass174_Sub1_9451 = var1;
      this.aClass174_Sub1_9451 = var1;
      this.anIntArray9450 = var4;
      this.anIntArray9449 = var5;
      this.aByteArrayArray9447 = new byte[var3.length][];
      this.anIntArray9452 = new int[var3.length];
      this.anIntArray9448 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         this.aByteArrayArray9447[var6] = var3[var6].aByteArray9858;
         this.anIntArray9452[var6] = var3[var6].anInt9855;
         this.anIntArray9448[var6] = var3[var6].anInt9853;
      }

      this.anIntArray9453 = var3[0].anIntArray9857;
   }

   void method8592(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method1922(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9451.anIntArray9243 != null) {
         if(var6 == null) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9448[var1];
            var3 += this.anIntArray9452[var1];
            int var9 = this.anIntArray9450[var1];
            int var10 = this.anIntArray9449[var1];
            int var11 = this.aClass174_Sub1_9451.anInt9277 * -2145294317;
            int var12 = var11 * var3 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
               var16 = this.aClass174_Sub1_9451.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9451.anInt9267 * 1511023883;
               var15 += var16 * var9;
               var12 += var11 * var16;
            }

            if(var10 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
               var10 -= var10 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
            }

            if(var2 < -217416947 * this.aClass174_Sub1_9451.anInt9247) {
               var16 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9451.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > this.aClass174_Sub1_9451.anInt9271 * 1270312011) {
               var16 = var9 + var2 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if(var5) {
                  this.method8594(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9450[var1], var6, var7, var8);
               } else {
                  this.method8593(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9450[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   void method8593(byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, Class162 var14, int var15, int var16) {
      Class162_Sub2 var17 = (Class162_Sub2)var14;
      int[] var18 = var17.anIntArray9211;
      int[] var19 = var17.anIntArray9210;
      int var20 = var11 - -217416947 * this.aClass174_Sub1_9451.anInt9247;
      int var21 = var12;
      if(var16 > var12) {
         var21 = var16;
         var6 += -2145294317 * this.aClass174_Sub1_9451.anInt9277 * (var16 - var12);
         var5 += var13 * (var16 - var12);
      }

      int var22 = var16 + var18.length < var8 + var12?var18.length + var16:var12 + var8;
      boolean var23 = false;

      for(int var24 = var21; var24 < var22; ++var24) {
         int var25 = var18[var24 - var16] + var15;
         int var26 = var19[var24 - var16];
         int var27 = var7;
         int var28;
         if(var20 > var25) {
            var28 = var20 - var25;
            if(var28 >= var26) {
               var5 += var7 + var10;
               var6 += var7 + var9;
               continue;
            }

            var26 -= var28;
         } else {
            var28 = var25 - var20;
            if(var28 >= var7) {
               var5 += var7 + var10;
               var6 += var9 + var7;
               continue;
            }

            var5 += var28;
            var27 = var7 - var28;
            var6 += var28;
         }

         var28 = 0;
         if(var27 < var26) {
            var26 = var27;
         } else {
            var28 = var27 - var26;
         }

         for(int var29 = -var26; var29 < 0; ++var29) {
            byte var30;
            if((var30 = var1[var5++]) != 0) {
               var2[var6++] = var3[var30 & 255];
            } else {
               ++var6;
            }
         }

         var5 += var10 + var28;
         var6 += var28 + var9;
      }

   }

   void method8594(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class162 var13, int var14, int var15) {
      Class162_Sub2 var16 = (Class162_Sub2)var13;
      int[] var17 = var16.anIntArray9211;
      int[] var18 = var16.anIntArray9210;
      int var19 = var10 - this.aClass174_Sub1_9451.anInt9247 * -217416947;
      int var20 = var11;
      if(var15 > var11) {
         var20 = var15;
         var5 += this.aClass174_Sub1_9451.anInt9277 * -2145294317 * (var15 - var11);
         var4 += (var15 - var11) * var12;
      }

      int var21 = var17.length + var15 < var11 + var7?var17.length + var15:var7 + var11;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var14 + var17[var22 - var15];
         int var24 = var18[var22 - var15];
         int var25 = var6;
         int var26;
         if(var19 > var23) {
            var26 = var19 - var23;
            if(var26 >= var24) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var24 -= var26;
         } else {
            var26 = var23 - var19;
            if(var26 >= var6) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var4 += var26;
            var25 = var6 - var26;
            var5 += var26;
         }

         var26 = 0;
         if(var25 < var24) {
            var24 = var25;
         } else {
            var26 = var25 - var24;
         }

         for(int var27 = -var24; var27 < 0; ++var27) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var4 += var26 + var4;
         var5 += var26 + var8;
      }

   }

   void method1909(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9451.anIntArray9243) {
         var2 += this.anIntArray9448[var1];
         var3 += this.anIntArray9452[var1];
         int var6 = this.anIntArray9450[var1];
         int var7 = this.anIntArray9449[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9451.anInt9277;
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9451.anInt9267 - var3;
            var7 -= var13;
            var3 = 1511023883 * this.aClass174_Sub1_9451.anInt9267;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var7 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
         }

         if(var2 < this.aClass174_Sub1_9451.anInt9247 * -217416947) {
            var13 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9451.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var2 + var6 > 1270312011 * this.aClass174_Sub1_9451.anInt9271) {
            var13 = var2 + var6 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(var5) {
               this.method8592(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method8595(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method8595(byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);
      boolean var11 = false;

      for(int var12 = -var7; var12 < 0; ++var12) {
         int var13;
         byte var14;
         for(var13 = var10; var13 < 0; ++var13) {
            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }

            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }
         }

         for(var13 = var6; var13 < 0; ++var13) {
            if((var14 = var1[var4++]) != 0) {
               var2[var5++] = var3[var14 & 255];
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method8596(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method1912(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9451.anIntArray9243) {
         var2 += this.anIntArray9448[var1];
         var3 += this.anIntArray9452[var1];
         int var6 = this.anIntArray9450[var1];
         int var7 = this.anIntArray9449[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9451.anInt9277;
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9451.anInt9267 - var3;
            var7 -= var13;
            var3 = 1511023883 * this.aClass174_Sub1_9451.anInt9267;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var7 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
         }

         if(var2 < this.aClass174_Sub1_9451.anInt9247 * -217416947) {
            var13 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9451.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var2 + var6 > 1270312011 * this.aClass174_Sub1_9451.anInt9271) {
            var13 = var2 + var6 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(var5) {
               this.method8592(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method8595(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method1907(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9451.anIntArray9243 != null) {
         if(var6 == null) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9448[var1];
            var3 += this.anIntArray9452[var1];
            int var9 = this.anIntArray9450[var1];
            int var10 = this.anIntArray9449[var1];
            int var11 = this.aClass174_Sub1_9451.anInt9277 * -2145294317;
            int var12 = var11 * var3 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
               var16 = this.aClass174_Sub1_9451.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9451.anInt9267 * 1511023883;
               var15 += var16 * var9;
               var12 += var11 * var16;
            }

            if(var10 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
               var10 -= var10 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
            }

            if(var2 < -217416947 * this.aClass174_Sub1_9451.anInt9247) {
               var16 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9451.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > this.aClass174_Sub1_9451.anInt9271 * 1270312011) {
               var16 = var9 + var2 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if(var5) {
                  this.method8594(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9450[var1], var6, var7, var8);
               } else {
                  this.method8593(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9450[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   void method1913(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9451.anIntArray9243 != null) {
         if(var6 == null) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9448[var1];
            var3 += this.anIntArray9452[var1];
            int var9 = this.anIntArray9450[var1];
            int var10 = this.anIntArray9449[var1];
            int var11 = this.aClass174_Sub1_9451.anInt9277 * -2145294317;
            int var12 = var11 * var3 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
               var16 = this.aClass174_Sub1_9451.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9451.anInt9267 * 1511023883;
               var15 += var16 * var9;
               var12 += var11 * var16;
            }

            if(var10 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
               var10 -= var10 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
            }

            if(var2 < -217416947 * this.aClass174_Sub1_9451.anInt9247) {
               var16 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9451.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > this.aClass174_Sub1_9451.anInt9271 * 1270312011) {
               var16 = var9 + var2 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if(var5) {
                  this.method8594(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9450[var1], var6, var7, var8);
               } else {
                  this.method8593(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9450[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   void method1910(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9451.anIntArray9243) {
         var2 += this.anIntArray9448[var1];
         var3 += this.anIntArray9452[var1];
         int var6 = this.anIntArray9450[var1];
         int var7 = this.anIntArray9449[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9451.anInt9277;
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9451.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9451.anInt9267 - var3;
            var7 -= var13;
            var3 = 1511023883 * this.aClass174_Sub1_9451.anInt9267;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var7 + var3 > -288042733 * this.aClass174_Sub1_9451.anInt9250) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9451.anInt9250;
         }

         if(var2 < this.aClass174_Sub1_9451.anInt9247 * -217416947) {
            var13 = -217416947 * this.aClass174_Sub1_9451.anInt9247 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9451.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var2 + var6 > 1270312011 * this.aClass174_Sub1_9451.anInt9271) {
            var13 = var2 + var6 - this.aClass174_Sub1_9451.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(var5) {
               this.method8592(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else {
               this.method8595(this.aByteArrayArray9447[var1], this.aClass174_Sub1_9451.anIntArray9243, this.anIntArray9453, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   static void method8597(int var0) {
   }
}
