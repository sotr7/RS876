package com.jagex;

import com.jagex.Class1;
import com.jagex.Class162;
import com.jagex.Class162_Sub2;
import com.jagex.Class163;
import com.jagex.Class173_Sub1;
import com.jagex.Class173_Sub2;
import com.jagex.Class174_Sub1;
import com.jagex.InterfaceDef;
import com.jagex.Class526_Sub2;
import com.jagex.Class531_Sub1;
import com.jagex.Class623;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class163_Sub6 extends Class163 {
   Class174_Sub1 aClass174_Sub1_9902;
   int[] anIntArray9904;
   int[] anIntArray9905;
   byte[][] aByteArrayArray9906;
   int[] anIntArray9907;
   int[] anIntArray9903;

   void method1922(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         if(null == var6) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9903[var1];
            var3 += this.anIntArray9907[var1];
            int var9 = this.anIntArray9904[var1];
            int var10 = this.anIntArray9905[var1];
            int var11 = -2145294317 * this.aClass174_Sub1_9902.anInt9277;
            int var12 = var11 * var3 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
               var16 = this.aClass174_Sub1_9902.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
               var15 += var9 * var16;
               var12 += var16 * var11;
            }

            if(var10 + var3 > -288042733 * this.aClass174_Sub1_9902.anInt9250) {
               var10 -= var10 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
            }

            if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
               var16 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
               var16 = var2 + var9 - 1270312011 * this.aClass174_Sub1_9902.anInt9271;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if((var4 & -16777216) == -16777216) {
                  this.method9002(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9904[var1], var6, var7, var8);
               } else {
                  this.method9001(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9904[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   Class163_Sub6(Class174_Sub1 var1, Class1 var2, Class173_Sub1[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aClass174_Sub1_9902 = var1;
      this.anIntArray9904 = var4;
      this.anIntArray9905 = var5;
      this.aByteArrayArray9906 = new byte[var3.length][];
      this.anIntArray9907 = new int[var3.length];
      this.anIntArray9903 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         int[] var7 = var3[var6].method2204(false);
         byte[] var8 = this.aByteArrayArray9906[var6] = new byte[var7.length];

         for(int var9 = 0; var9 < var7.length; ++var9) {
            int var10 = var7[var9];
            byte var11 = (byte)((var10 & 255) + (var10 >> 16 & 255) * 3 + 4 * (var10 >> 8 & 255) >> 3);
            var8[var9] = var11;
         }

         this.anIntArray9907[var6] = var3[var6].method2172();
         this.anIntArray9903[var6] = var3[var6].method2170();
      }

   }

   void method1908(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         var2 += this.anIntArray9903[var1];
         var3 += this.anIntArray9907[var1];
         int var6 = this.anIntArray9904[var1];
         int var7 = this.anIntArray9905[var1];
         int var8 = this.aClass174_Sub1_9902.anInt9277 * -2145294317;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9902.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
            var12 += var6 * var13;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9902.anInt9250 * -288042733) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
         }

         if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
            var13 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
            var13 = var2 + var6 - this.aClass174_Sub1_9902.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(-16777216 == (var4 & -16777216)) {
               this.method8998(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else if(0 != (var4 & -16777216)) {
               this.method8999(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method8998(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

   void method8999(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var3 >>> 24;
      int var11 = 255 - var10;

      for(int var12 = -var7; var12 < 0; ++var12) {
         for(int var13 = -var6; var13 < 0; ++var13) {
            if(var1[var4++] != 0) {
               int var14 = (var10 * (var3 & '\uff00') & 16711680) + ((var3 & 16711935) * var10 & -16711936) >> 8;
               int var15 = var2[var5];
               var2[var5++] = var14 + ((var11 * (var15 & 16711935) & -16711936) + ((var15 & '\uff00') * var11 & 16711680) >> 8);
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method1907(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         if(null == var6) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9903[var1];
            var3 += this.anIntArray9907[var1];
            int var9 = this.anIntArray9904[var1];
            int var10 = this.anIntArray9905[var1];
            int var11 = -2145294317 * this.aClass174_Sub1_9902.anInt9277;
            int var12 = var11 * var3 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
               var16 = this.aClass174_Sub1_9902.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
               var15 += var9 * var16;
               var12 += var16 * var11;
            }

            if(var10 + var3 > -288042733 * this.aClass174_Sub1_9902.anInt9250) {
               var10 -= var10 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
            }

            if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
               var16 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
               var16 = var2 + var9 - 1270312011 * this.aClass174_Sub1_9902.anInt9271;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if((var4 & -16777216) == -16777216) {
                  this.method9002(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9904[var1], var6, var7, var8);
               } else {
                  this.method9001(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9904[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   void method9000(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

   void method1906(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         var2 += this.anIntArray9903[var1];
         var3 += this.anIntArray9907[var1];
         int var6 = this.anIntArray9904[var1];
         int var7 = this.anIntArray9905[var1];
         int var8 = this.aClass174_Sub1_9902.anInt9277 * -2145294317;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9902.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
            var12 += var6 * var13;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9902.anInt9250 * -288042733) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
         }

         if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
            var13 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
            var13 = var2 + var6 - this.aClass174_Sub1_9902.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(-16777216 == (var4 & -16777216)) {
               this.method8998(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else if(0 != (var4 & -16777216)) {
               this.method8999(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method1912(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         var2 += this.anIntArray9903[var1];
         var3 += this.anIntArray9907[var1];
         int var6 = this.anIntArray9904[var1];
         int var7 = this.anIntArray9905[var1];
         int var8 = this.aClass174_Sub1_9902.anInt9277 * -2145294317;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9902.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
            var12 += var6 * var13;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9902.anInt9250 * -288042733) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
         }

         if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
            var13 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
            var13 = var2 + var6 - this.aClass174_Sub1_9902.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(-16777216 == (var4 & -16777216)) {
               this.method8998(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else if(0 != (var4 & -16777216)) {
               this.method8999(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   void method9001(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class162 var13, int var14, int var15) {
      Class162_Sub2 var16 = (Class162_Sub2)var13;
      int[] var17 = var16.anIntArray9211;
      int[] var18 = var16.anIntArray9210;
      int var19 = var10 - -217416947 * this.aClass174_Sub1_9902.anInt9247;
      int var20 = var11;
      if(var15 > var11) {
         var20 = var15;
         var5 += (var15 - var11) * this.aClass174_Sub1_9902.anInt9277 * -2145294317;
         var4 += (var15 - var11) * var12;
      }

      int var21 = var15 + var17.length < var11 + var7?var17.length + var15:var11 + var7;
      int var22 = var3 >>> 24;
      int var23 = 255 - var22;

      for(int var24 = var20; var24 < var21; ++var24) {
         int var25 = var17[var24 - var15] + var14;
         int var26 = var18[var24 - var15];
         int var27 = var6;
         int var28;
         if(var19 > var25) {
            var28 = var19 - var25;
            if(var28 >= var26) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var26 -= var28;
         } else {
            var28 = var25 - var19;
            if(var28 >= var6) {
               var4 += var6 + var9;
               var5 += var8 + var6;
               continue;
            }

            var4 += var28;
            var27 = var6 - var28;
            var5 += var28;
         }

         var28 = 0;
         if(var27 < var26) {
            var26 = var27;
         } else {
            var28 = var27 - var26;
         }

         for(int var29 = -var26; var29 < 0; ++var29) {
            if(var1[var4++] != 0) {
               int var30 = (var22 * (var3 & 16711935) & -16711936) + ((var3 & '\uff00') * var22 & 16711680) >> 8;
               int var31 = var2[var5];
               var2[var5++] = var30 + (((var31 & 16711935) * var23 & -16711936) + (var23 * (var31 & '\uff00') & 16711680) >> 8);
            } else {
               ++var5;
            }
         }

         var4 += var28 + var9;
         var5 += var8 + var28;
      }

   }

   void method1913(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         if(null == var6) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9903[var1];
            var3 += this.anIntArray9907[var1];
            int var9 = this.anIntArray9904[var1];
            int var10 = this.anIntArray9905[var1];
            int var11 = -2145294317 * this.aClass174_Sub1_9902.anInt9277;
            int var12 = var11 * var3 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
               var16 = this.aClass174_Sub1_9902.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
               var15 += var9 * var16;
               var12 += var16 * var11;
            }

            if(var10 + var3 > -288042733 * this.aClass174_Sub1_9902.anInt9250) {
               var10 -= var10 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
            }

            if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
               var16 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
               var16 = var2 + var9 - 1270312011 * this.aClass174_Sub1_9902.anInt9271;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if((var4 & -16777216) == -16777216) {
                  this.method9002(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9904[var1], var6, var7, var8);
               } else {
                  this.method9001(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9904[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   void method1910(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         var2 += this.anIntArray9903[var1];
         var3 += this.anIntArray9907[var1];
         int var6 = this.anIntArray9904[var1];
         int var7 = this.anIntArray9905[var1];
         int var8 = this.aClass174_Sub1_9902.anInt9277 * -2145294317;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9902.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
            var12 += var6 * var13;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9902.anInt9250 * -288042733) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
         }

         if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
            var13 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
            var13 = var2 + var6 - this.aClass174_Sub1_9902.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(-16777216 == (var4 & -16777216)) {
               this.method8998(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else if(0 != (var4 & -16777216)) {
               this.method8999(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   Class163_Sub6(Class174_Sub1 var1, Class1 var2, Class173_Sub2[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aClass174_Sub1_9902 = var1;
      this.anIntArray9904 = var4;
      this.anIntArray9905 = var5;
      this.aByteArrayArray9906 = new byte[var3.length][];
      this.anIntArray9907 = new int[var3.length];
      this.anIntArray9903 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         this.aByteArrayArray9906[var6] = var3[var6].aByteArray9858;
         this.anIntArray9907[var6] = var3[var6].anInt9855;
         this.anIntArray9903[var6] = var3[var6].anInt9853;
      }

   }

   void method9002(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class162 var13, int var14, int var15) {
      Class162_Sub2 var16 = (Class162_Sub2)var13;
      int[] var17 = var16.anIntArray9211;
      int[] var18 = var16.anIntArray9210;
      int var19 = var11;
      if(var15 > var11) {
         var19 = var15;
         var5 += this.aClass174_Sub1_9902.anInt9277 * -2145294317 * (var15 - var11);
         var4 += (var15 - var11) * var12;
      }

      int var20 = var15 + var17.length < var7 + var11?var15 + var17.length:var11 + var7;

      for(int var21 = var19; var21 < var20; ++var21) {
         int var22 = var17[var21 - var15] + var14;
         int var23 = var18[var21 - var15];
         int var24 = var6;
         int var25;
         if(var10 > var22) {
            var25 = var10 - var22;
            if(var25 >= var23) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var23 -= var25;
         } else {
            var25 = var22 - var10;
            if(var25 >= var6) {
               var4 += var9 + var6;
               var5 += var6 + var8;
               continue;
            }

            var4 += var25;
            var24 = var6 - var25;
            var5 += var25;
         }

         var25 = 0;
         if(var24 < var23) {
            var23 = var24;
         } else {
            var25 = var24 - var23;
         }

         for(int var26 = 0; var26 < var23; ++var26) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var4 += var9 + var25;
         var5 += var8 + var25;
      }

   }

   void method1909(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9902.anIntArray9243 != null) {
         var2 += this.anIntArray9903[var1];
         var3 += this.anIntArray9907[var1];
         int var6 = this.anIntArray9904[var1];
         int var7 = this.anIntArray9905[var1];
         int var8 = this.aClass174_Sub1_9902.anInt9277 * -2145294317;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < 1511023883 * this.aClass174_Sub1_9902.anInt9267) {
            var13 = 1511023883 * this.aClass174_Sub1_9902.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9902.anInt9267 * 1511023883;
            var12 += var6 * var13;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9902.anInt9250 * -288042733) {
            var7 -= var7 + var3 - -288042733 * this.aClass174_Sub1_9902.anInt9250;
         }

         if(var2 < -217416947 * this.aClass174_Sub1_9902.anInt9247) {
            var13 = this.aClass174_Sub1_9902.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = -217416947 * this.aClass174_Sub1_9902.anInt9247;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > this.aClass174_Sub1_9902.anInt9271 * 1270312011) {
            var13 = var2 + var6 - this.aClass174_Sub1_9902.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if(-16777216 == (var4 & -16777216)) {
               this.method8998(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            } else if(0 != (var4 & -16777216)) {
               this.method8999(this.aByteArrayArray9906[var1], this.aClass174_Sub1_9902.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

   static void method9003(int var0, boolean var1, byte var2) {
      Class526_Sub2 var3 = Class531_Sub1.method9301(var0, var1, 1827915904);
      if(null != var3) {
         for(int var4 = 0; var4 < var3.anIntArray10331.length; ++var4) {
            var3.anIntArray10331[var4] = -1;
            var3.anIntArray10329[var4] = 0;
         }

         var3.aClass2Array10332 = null;
      }
   }

   static final void method9004(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      int var4 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class623.method7411(var4, var3, var0, 2121917605);
   }
}
