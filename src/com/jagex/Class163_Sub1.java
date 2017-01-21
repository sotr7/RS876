package com.jagex;

import com.jagex.Class1;
import com.jagex.Class103;
import com.jagex.Class113;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class162_Sub2;
import com.jagex.Class163;
import com.jagex.Class173;
import com.jagex.Class173_Sub1;
import com.jagex.Class173_Sub2;
import com.jagex.Class174_Sub1;
import com.jagex.Class181;
import com.jagex.Class207;
import com.jagex.Class215;
import com.jagex.Class242;
import com.jagex.Class294;
import com.jagex.NPCDef;
import com.jagex.Class331;
import com.jagex.Class378;
import com.jagex.Class380_Sub1;
import com.jagex.Class451;
import com.jagex.Class47;
import com.jagex.Class526_Sub33;
import com.jagex.LinkableObject;
import com.jagex.Class539_Sub2;
import com.jagex.Class539_Sub6;
import com.jagex.Class541;
import com.jagex.Class545;
import com.jagex.Class554;
import com.jagex.Class557;
import com.jagex.Class572;
import com.jagex.Class609;
import com.jagex.Class627;
import com.jagex.Class636;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class645;
import com.jagex.Class680;
import com.jagex.Class701;
import com.jagex.client;

public class Class163_Sub1 extends Class163 {
   Class174_Sub1 aClass174_Sub1_9195;
   int[] anIntArray9197;
   int[] anIntArray9198;
   byte[][] aByteArrayArray9196;
   int[] anIntArray9199;
   int[] anIntArray9200;

   Class163_Sub1(Class174_Sub1 var1, Class1 var2, Class173_Sub1[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aClass174_Sub1_9195 = var1;
      this.aClass174_Sub1_9195 = var1;
      this.anIntArray9197 = var4;
      this.anIntArray9198 = var5;
      this.aByteArrayArray9196 = new byte[var3.length][];
      this.anIntArray9199 = new int[var3.length];
      this.anIntArray9200 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         Class173_Sub1 var7 = var3[var6];
         int[] var8 = var7.method2204(false);
         byte[] var9 = this.aByteArrayArray9196[var6] = new byte[var8.length];

         for(int var10 = 0; var10 < var8.length; ++var10) {
            var9[var10] = (byte)(var8[var10] >> 24 & 255);
         }

         this.anIntArray9199[var6] = var7.method2172();
         this.anIntArray9200[var6] = var7.method2170();
      }

   }

   Class163_Sub1(Class174_Sub1 var1, Class1 var2, Class173_Sub2[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aClass174_Sub1_9195 = var1;
      this.aClass174_Sub1_9195 = var1;
      this.anIntArray9197 = var4;
      this.anIntArray9198 = var5;
      this.aByteArrayArray9196 = new byte[var3.length][];
      this.anIntArray9199 = new int[var3.length];
      this.anIntArray9200 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         Class173_Sub2 var7 = var3[var6];
         if(var7.aByteArray9859 != null) {
            this.aByteArrayArray9196[var6] = var7.aByteArray9859;
         } else {
            byte[] var8 = var7.aByteArray9858;
            byte[] var9 = this.aByteArrayArray9196[var6] = new byte[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               var9[var10] = (byte)(var8[var10] == 0?0:-1);
            }
         }

         this.anIntArray9199[var6] = var7.anInt9855;
         this.anIntArray9200[var6] = var7.anInt9853;
      }

   }

   void method8447(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class162 var13, int var14, int var15) {
      Class162_Sub2 var16 = (Class162_Sub2)var13;
      int[] var17 = var16.anIntArray9211;
      int[] var18 = var16.anIntArray9210;
      int var19 = var10 - this.aClass174_Sub1_9195.anInt9247 * -217416947;
      int var20 = var11;
      if(var15 > var11) {
         var20 = var15;
         var5 += (var15 - var11) * this.aClass174_Sub1_9195.anInt9277 * -2145294317;
         var4 += var12 * (var15 - var11);
      }

      int var21 = var15 + var17.length < var11 + var7?var17.length + var15:var11 + var7;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var14 + var17[var22 - var15];
         int var24 = var18[var22 - var15];
         int var25 = var6;
         int var26;
         if(var19 > var23) {
            var26 = var19 - var23;
            if(var26 >= var24) {
               var4 += var9 + var6;
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
            int var28 = var1[var4++] & 255;
            if(0 != var28) {
               int var29 = ((var3 & 16711935) * var28 & -16711936) + ((var3 & '\uff00') * var28 & 16711680) >> 8;
               var28 = 256 - var28;
               int var30 = var2[var5];
               var2[var5++] = ((var28 * (var30 & '\uff00') & 16711680) + (var28 * (var30 & 16711935) & -16711936) >> 8) + var29;
            } else {
               ++var5;
            }
         }

         var4 += var26 + var9;
         var5 += var26 + var8;
      }

   }

   void method1908(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9195.anIntArray9243) {
         var2 += this.anIntArray9200[var1];
         var3 += this.anIntArray9199[var1];
         int var6 = this.anIntArray9197[var1];
         int var7 = this.anIntArray9198[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9195.anInt9277;
         int var9 = var8 * var3 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < this.aClass174_Sub1_9195.anInt9267 * 1511023883) {
            var13 = 1511023883 * this.aClass174_Sub1_9195.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
            var7 -= var7 + var3 - this.aClass174_Sub1_9195.anInt9250 * -288042733;
         }

         if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
            var13 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9195.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > 1270312011 * this.aClass174_Sub1_9195.anInt9271) {
            var13 = var6 + var2 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            this.method8448(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
         }
      }
   }

   void method1922(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9195.anIntArray9243 != null) {
         if(null == var6) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9200[var1];
            var3 += this.anIntArray9199[var1];
            int var9 = this.anIntArray9197[var1];
            int var10 = this.anIntArray9198[var1];
            int var11 = this.aClass174_Sub1_9195.anInt9277 * -2145294317;
            int var12 = var2 + var3 * var11;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9195.anInt9267) {
               var16 = this.aClass174_Sub1_9195.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
               var15 += var16 * var9;
               var12 += var11 * var16;
            }

            if(var3 + var10 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
               var10 -= var3 + var10 - -288042733 * this.aClass174_Sub1_9195.anInt9250;
            }

            if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
               var16 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9195.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 + var2 > this.aClass174_Sub1_9195.anInt9271 * 1270312011) {
               var16 = var2 + var9 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               this.method8447(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9197[var1], var6, var7, var8);
            }
         }
      }
   }

   void method1909(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9195.anIntArray9243) {
         var2 += this.anIntArray9200[var1];
         var3 += this.anIntArray9199[var1];
         int var6 = this.anIntArray9197[var1];
         int var7 = this.anIntArray9198[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9195.anInt9277;
         int var9 = var8 * var3 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < this.aClass174_Sub1_9195.anInt9267 * 1511023883) {
            var13 = 1511023883 * this.aClass174_Sub1_9195.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
            var7 -= var7 + var3 - this.aClass174_Sub1_9195.anInt9250 * -288042733;
         }

         if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
            var13 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9195.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > 1270312011 * this.aClass174_Sub1_9195.anInt9271) {
            var13 = var6 + var2 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            this.method8448(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
         }
      }
   }

   void method1910(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9195.anIntArray9243) {
         var2 += this.anIntArray9200[var1];
         var3 += this.anIntArray9199[var1];
         int var6 = this.anIntArray9197[var1];
         int var7 = this.anIntArray9198[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9195.anInt9277;
         int var9 = var8 * var3 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < this.aClass174_Sub1_9195.anInt9267 * 1511023883) {
            var13 = 1511023883 * this.aClass174_Sub1_9195.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
            var7 -= var7 + var3 - this.aClass174_Sub1_9195.anInt9250 * -288042733;
         }

         if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
            var13 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9195.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > 1270312011 * this.aClass174_Sub1_9195.anInt9271) {
            var13 = var6 + var2 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            this.method8448(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
         }
      }
   }

   void method1906(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9195.anIntArray9243) {
         var2 += this.anIntArray9200[var1];
         var3 += this.anIntArray9199[var1];
         int var6 = this.anIntArray9197[var1];
         int var7 = this.anIntArray9198[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9195.anInt9277;
         int var9 = var8 * var3 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < this.aClass174_Sub1_9195.anInt9267 * 1511023883) {
            var13 = 1511023883 * this.aClass174_Sub1_9195.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
            var7 -= var7 + var3 - this.aClass174_Sub1_9195.anInt9250 * -288042733;
         }

         if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
            var13 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9195.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > 1270312011 * this.aClass174_Sub1_9195.anInt9271) {
            var13 = var6 + var2 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            this.method8448(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
         }
      }
   }

   void method1912(char var1, int var2, int var3, int var4, boolean var5) {
      if(null != this.aClass174_Sub1_9195.anIntArray9243) {
         var2 += this.anIntArray9200[var1];
         var3 += this.anIntArray9199[var1];
         int var6 = this.anIntArray9197[var1];
         int var7 = this.anIntArray9198[var1];
         int var8 = -2145294317 * this.aClass174_Sub1_9195.anInt9277;
         int var9 = var8 * var3 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < this.aClass174_Sub1_9195.anInt9267 * 1511023883) {
            var13 = 1511023883 * this.aClass174_Sub1_9195.anInt9267 - var3;
            var7 -= var13;
            var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var3 + var7 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
            var7 -= var7 + var3 - this.aClass174_Sub1_9195.anInt9250 * -288042733;
         }

         if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
            var13 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
            var6 -= var13;
            var2 = this.aClass174_Sub1_9195.anInt9247 * -217416947;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 + var2 > 1270312011 * this.aClass174_Sub1_9195.anInt9271) {
            var13 = var6 + var2 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            this.method8448(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var12, var9, var6, var7, var10, var11);
         }
      }
   }

   void method1907(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9195.anIntArray9243 != null) {
         if(null == var6) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9200[var1];
            var3 += this.anIntArray9199[var1];
            int var9 = this.anIntArray9197[var1];
            int var10 = this.anIntArray9198[var1];
            int var11 = this.aClass174_Sub1_9195.anInt9277 * -2145294317;
            int var12 = var2 + var3 * var11;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9195.anInt9267) {
               var16 = this.aClass174_Sub1_9195.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
               var15 += var16 * var9;
               var12 += var11 * var16;
            }

            if(var3 + var10 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
               var10 -= var3 + var10 - -288042733 * this.aClass174_Sub1_9195.anInt9250;
            }

            if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
               var16 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9195.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 + var2 > this.aClass174_Sub1_9195.anInt9271 * 1270312011) {
               var16 = var2 + var9 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               this.method8447(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9197[var1], var6, var7, var8);
            }
         }
      }
   }

   void method1913(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      if(this.aClass174_Sub1_9195.anIntArray9243 != null) {
         if(null == var6) {
            this.method1908(var1, var2, var3, var4, var5);
         } else {
            var2 += this.anIntArray9200[var1];
            var3 += this.anIntArray9199[var1];
            int var9 = this.anIntArray9197[var1];
            int var10 = this.anIntArray9198[var1];
            int var11 = this.aClass174_Sub1_9195.anInt9277 * -2145294317;
            int var12 = var2 + var3 * var11;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 1511023883 * this.aClass174_Sub1_9195.anInt9267) {
               var16 = this.aClass174_Sub1_9195.anInt9267 * 1511023883 - var3;
               var10 -= var16;
               var3 = this.aClass174_Sub1_9195.anInt9267 * 1511023883;
               var15 += var16 * var9;
               var12 += var11 * var16;
            }

            if(var3 + var10 > this.aClass174_Sub1_9195.anInt9250 * -288042733) {
               var10 -= var3 + var10 - -288042733 * this.aClass174_Sub1_9195.anInt9250;
            }

            if(var2 < this.aClass174_Sub1_9195.anInt9247 * -217416947) {
               var16 = this.aClass174_Sub1_9195.anInt9247 * -217416947 - var2;
               var9 -= var16;
               var2 = -217416947 * this.aClass174_Sub1_9195.anInt9247;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 + var2 > this.aClass174_Sub1_9195.anInt9271 * 1270312011) {
               var16 = var2 + var9 - this.aClass174_Sub1_9195.anInt9271 * 1270312011;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               this.method8447(this.aByteArrayArray9196[var1], this.aClass174_Sub1_9195.anIntArray9243, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray9197[var1], var6, var7, var8);
            }
         }
      }
   }

   void method8448(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var7; var10 < 0; ++var10) {
         for(int var11 = -var6; var11 < 0; ++var11) {
            int var12 = var1[var4++] & 255;
            if(var12 != 0) {
               int var13 = ((var3 & 16711935) * var12 & -16711936) + (var12 * (var3 & '\uff00') & 16711680) >> 8;
               var12 = 256 - var12;
               int var14 = var2[var5];
               var2[var5++] = var13 + (((var14 & '\uff00') * var12 & 16711680) + ((var14 & 16711935) * var12 & -16711936) >> 8);
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method8449(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var7; var10 < 0; ++var10) {
         for(int var11 = -var6; var11 < 0; ++var11) {
            int var12 = var1[var4++] & 255;
            if(var12 != 0) {
               int var13 = ((var3 & 16711935) * var12 & -16711936) + (var12 * (var3 & '\uff00') & 16711680) >> 8;
               var12 = 256 - var12;
               int var14 = var2[var5];
               var2[var5++] = var13 + (((var14 & '\uff00') * var12 & 16711680) + ((var14 & 16711935) * var12 & -16711936) >> 8);
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   static final void method8450(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      int var7 = 1609310241 * Class103.anInt1270;
      int[] var8 = Class103.anIntArray1276;
      client.anInt11251 = 0;
      int var9;
      if(4 == client.anInt11073 * 378016543) {
         var9 = Class645.aClass207Array8445.length;
      } else {
         var9 = var7 + 1139938345 * client.npcCount;
      }

      int var10;
      int var21;
      int var23;
      int var84;
      int var92;
      int var102;
      int var103;
      int var104;
      int var105;
      int var108;
      for(var10 = 0; var10 < var9; ++var10) {
         NPCDef var11 = null;
         Object var13;
         if(4 == 378016543 * client.anInt11073) {
            Class207 var12 = Class645.aClass207Array8445[var10];
            if(!var12.aBool2251) {
               continue;
            }

            var13 = var12.method2913((byte)74);
            if(1242714411 * client.anInt11126 != ((Class639_Sub1_Sub2_Sub1)var13).anInt11891 * -2012893765) {
               continue;
            }

            if(-1817012609 * var12.anInt2250 >= 0) {
               var11 = ((NPC)var13).def;
               if(var11.morphisms != null) {
                  var11 = var11.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
                  if(var11 == null) {
                     continue;
                  }
               }
            }
         } else {
            if(var10 < var7) {
               var13 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var8[var10]];
            } else {
               var13 = (Class639_Sub1_Sub2_Sub1)((LinkableObject)client.npcs.get((long)client.npcsIndicies[var10 - var7])).anObject10399;
               var11 = ((NPC)var13).def;
               if(var11.morphisms != null) {
                  var11 = var11.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
                  if(var11 == null) {
                     continue;
                  }
               }
            }

            if(-1590735993 * ((Class639_Sub1_Sub2_Sub1)var13).anInt11904 < 0 || -2012893765 * ((Class639_Sub1_Sub2_Sub1)var13).anInt11891 != client.anInt11126 * 1242714411 && ((Class639_Sub1_Sub2_Sub1)var13).aByte10827 != Class451.localPlayer.aByte10827) {
               continue;
            }
         }

         Class545.method6514((Class639_Sub1)var13, ((Class639_Sub1_Sub2_Sub1)var13).method9859((byte)-46), false, -914419086);
         if(client.aFloatArray11132[0] >= 0.0F) {
            if(((Class639_Sub1_Sub2_Sub1)var13).method10782(-219223312)) {
               Class541 var83 = ((Class639_Sub1_Sub2_Sub1)var13).method10790((byte)-116);
               if(null != var83 && 912585901 * client.anInt11251 < 1317761325 * client.anInt11252) {
                  String var14 = var83.method6459((byte)87);
                  if(Class380_Sub1.aClass269_10121.method3583(-2123265350)) {
                     var14 = Class380_Sub1.aClass269_10121.method3581(var14, (byte)-27);
                  }

                  client.anIntArray11205[client.anInt11251 * 912585901] = Class680.aClass1_8616.method509(var14, 294581563) / 2;
                  client.anIntArray11253[912585901 * client.anInt11251] = (int)client.aFloatArray11132[0];
                  client.anIntArray11291[client.anInt11251 * 912585901] = (int)client.aFloatArray11132[1];
                  client.aClass541Array11256[client.anInt11251 * 912585901] = var83;
                  client.anInt11251 += -1792241883;
               }
            }

            var84 = (int)(client.aFloatArray11132[1] + (float)var1);
            var84 -= 96898447 * Class680.aClass1_8616.anInt12;
            boolean var88 = false;
            Class557 var17;
            Class153 var20;
            int var28;
            if(!((Class639_Sub1_Sub2_Sub1)var13).aBool11894 && !((Class639_Sub1_Sub2_Sub1)var13).aClass686_11908.method8055(-642758338)) {
               for(Class539_Sub2 var15 = (Class539_Sub2)((Class639_Sub1_Sub2_Sub1)var13).aClass686_11908.method8053((byte)1); null != var15; var15 = (Class539_Sub2)((Class639_Sub1_Sub2_Sub1)var13).aClass686_11908.method8054(556366766)) {
                  Class539_Sub6 var16 = var15.method9264(client.anInt11012, 774225228);
                  if(null == var16) {
                     if(var15.method9261(1496167129)) {
                        var15.method6448(788490316);
                     }
                  } else {
                     var17 = var15.aClass557_10315;
                     Class639_Sub1_Sub2_Sub1_Sub1 var18 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var8[var10]];
                     Class153 var19;
                     if(var18 != null && Class215.aClass215_2271 != var18.aClass215_12182) {
                        if(var18.aClass215_12182 == Class215.aClass215_2269) {
                           var19 = var17.method6703(Class554.aClass174_7475, var17.anInt7524 * 620480965, -1510211239);
                           var20 = var17.method6703(Class554.aClass174_7475, var17.anInt7527 * 454466509, -1445472621);
                        } else {
                           var19 = var17.method6703(Class554.aClass174_7475, 1882687125 * var17.anInt7529, -581399651);
                           var20 = var17.method6703(Class554.aClass174_7475, var17.anInt7528 * -631188979, -759800766);
                        }
                     } else {
                        var19 = var17.method6703(Class554.aClass174_7475, var17.anInt7525 * -1377963217, -1828857218);
                        var20 = var17.method6703(Class554.aClass174_7475, 670284521 * var17.anInt7521, -894887107);
                     }

                     if(null != var19 && var20 != null) {
                        var21 = 255;
                        boolean var22 = true;
                        var23 = client.anInt11012 - -1774666407 * var16.anInt10361;
                        int var24 = var20.method1825() * -1673136851 * var16.anInt10360 / 255;
                        int var25;
                        int var26;
                        if(var16.anInt10362 * 359051541 > var23) {
                           var25 = var17.anInt7522 * 429270803 == 0?0:var23 / (429270803 * var17.anInt7522) * var17.anInt7522 * 429270803;
                           var26 = var20.method1825() * var16.anInt10359 * 1194237415 / 255;
                           var108 = var25 * (var24 - var26) / (359051541 * var16.anInt10362) + var26;
                        } else {
                           var108 = var24;
                           var25 = 359051541 * var16.anInt10362 + -765071727 * var17.anInt7523 - var23;
                           if(1612659805 * var17.anInt7526 >= 0) {
                              var21 = (var25 << 8) / (var17.anInt7523 * -765071727 - 1612659805 * var17.anInt7526);
                           }
                        }

                        if(var16.anInt10360 * -1673136851 > 0 && var108 < 2) {
                           var108 = 2;
                        }

                        var25 = var19.method1771();
                        var26 = (int)(client.aFloatArray11132[0] + (float)var0 - (float)(var19.method1825() >> 1));
                        var84 -= var25;
                        if(var21 >= 0 && var21 < 255) {
                           int var27 = var21 << 24;
                           var28 = var27 | 16777215;
                           var19.method1774(var26, var84, 0, var28, 1);
                           Class554.aClass174_7475.method2317(var26, var84, var26 + var108, var84 + var25);
                           var20.method1774(var26, var84, 0, var28, 1);
                        } else {
                           var19.method1778(var26, var84);
                           Class554.aClass174_7475.method2317(var26, var84, var108 + var26, var84 + var25);
                           var20.method1778(var26, var84);
                        }

                        Class554.aClass174_7475.method2538(var0, var1, var2 + var0, var1 + var3);
                        var84 -= 2;
                        var88 = true;
                     }
                  }
               }
            }

            if(!var88) {
               var84 -= 2 + Class331.aClass613_3498.anInt8037 * -1411097275;
            }

            if(!((Class639_Sub1_Sub2_Sub1)var13).aBool11894) {
               long var29;
               Class173[] var110;
               if(null == var11) {
                  Class639_Sub1_Sub2_Sub1_Sub1 var90 = (Class639_Sub1_Sub2_Sub1_Sub1)var13;

                  for(var92 = 0; var92 < var90.anIntArray12166.length; ++var92) {
                     if(var90.anIntArray12166[var92] >= 0) {
                        var17 = null;
                        var104 = var90.anIntArray12166[var92];
                        var105 = var90.anIntArray12165[var92];
                        var29 = (long)(var105 << 8 | var104);
                        Class153 var97 = (Class153)client.aClass192_11044.method2765(var29);
                        if(null == var97) {
                           var110 = Class181.method2681(Class113.aClass466_1370, var105, 0);
                           if(null == var110) {
                              continue;
                           }

                           var97 = Class554.aClass174_7475.method2310(var110[var104], true);
                           client.aClass192_11044.method2768(var97, var29);
                        }

                        if(null != var97) {
                           var84 -= var97.method1771();
                           var97.method1778((int)((float)var0 + client.aFloatArray11132[0] - 12.0F), var84);
                           var84 -= 2;
                        }
                     }
                  }
               } else {
                  NPC var91 = (NPC)var13;
                  int[] var95 = null != var91.aClass305_12186?var91.aClass305_12186.anIntArray3281:var91.def.headIconSprites;
                  short[] var100 = null != var91.aClass305_12186?var91.aClass305_12186.aShortArray3282:var91.def.headIconSubSprites;
                  if(var100 != null && null != var95) {
                     for(var104 = 0; var104 < var100.length; ++var104) {
                        if(var100[var104] >= 0 && var95[var104] >= 0) {
                           var20 = null;
                           var29 = (long)(var95[var104] << 8 | var100[var104]);
                           var20 = (Class153)client.aClass192_11044.method2765(var29);
                           if(var20 == null) {
                              var110 = Class181.method2681(Class113.aClass466_1370, var95[var104], 0);
                              if(var110 == null) {
                                 continue;
                              }

                              var20 = Class554.aClass174_7475.method2310(var110[var100[var104]], true);
                              client.aClass192_11044.method2768(var20, var29);
                           }

                           if(null != var20) {
                              var84 -= var20.method1771();
                              var20.method1778((int)((float)var0 + client.aFloatArray11132[0] - (float)(var20.method1825() >> 1)), var84);
                              var84 -= 2;
                           }
                        }
                     }
                  }
               }
            }

            int var10000;
            int var93;
            Class113[] var96;
            Class113 var106;
            if(var13 instanceof Class639_Sub1_Sub2_Sub1_Sub1) {
               if(var10 >= 0) {
                  var93 = 0;
                  var96 = client.aClass113Array11018;

                  for(var102 = 0; var102 < var96.length; ++var102) {
                     var106 = var96[var102];
                     if(null != var106 && 10 == -941650287 * var106.anInt1367 && 1579992317 * var106.anInt1361 == var8[var10]) {
                        var20 = Class294.aClass153Array3188[var106.anInt1360 * -236252675];
                        if(var20.method1771() > var93) {
                           var93 = var20.method1771();
                        }

                        var20.method1778((int)(client.aFloatArray11132[0] + (float)var0 - 12.0F), var84 - var20.method1771());
                     }
                  }

                  if(var93 > 0) {
                     var10000 = var84 - (var93 + 2);
                  }
               }
            } else {
               var93 = 0;
               var96 = client.aClass113Array11018;

               for(var102 = 0; var102 < var96.length; ++var102) {
                  var106 = var96[var102];
                  if(var106 != null && -941650287 * var106.anInt1367 == 1 && 1579992317 * var106.anInt1361 == client.npcsIndicies[var10 - var7]) {
                     var20 = Class294.aClass153Array3188[var106.anInt1360 * -236252675];
                     if(var20.method1771() > var93) {
                        var93 = var20.method1771();
                     }

                     boolean var99;
                     if(0 == 1360607351 * var106.anInt1359) {
                        var99 = true;
                     } else {
                        var21 = Class636.method7565(1093647815) * 1000 / (1360607351 * var106.anInt1359) / 2;
                        var99 = client.anInt11012 % (2 * var21) < var21;
                     }

                     if(var99) {
                        var20.method1778((int)((float)var0 + client.aFloatArray11132[0] - 12.0F), var84 - var20.method1771());
                     }
                  }
               }

               if(var93 > 0) {
                  var10000 = var84 - (var93 + 2);
               }
            }

            for(var93 = 0; var93 < -137814315 * Class331.aClass613_3498.anInt8029; ++var93) {
               var92 = ((Class639_Sub1_Sub2_Sub1)var13).anIntArray11907[var93];
               var102 = ((Class639_Sub1_Sub2_Sub1)var13).anIntArray11947[var93];
               Class572 var107 = null;
               var105 = 0;
               if(var102 >= 0) {
                  if(var92 <= client.anInt11012) {
                     continue;
                  }

                  var107 = (Class572)Class526_Sub33.aClass40_Sub14_10659.method89(((Class639_Sub1_Sub2_Sub1)var13).anIntArray11947[var93], -854752643);
                  var105 = -2025196051 * var107.anInt7659;
                  if(null != var107 && var107.anIntArray7682 != null) {
                     var107 = var107.method6903(Class242.aClass94_2456, Class242.aClass94_2456, -214375145);
                     if(null == var107) {
                        ((Class639_Sub1_Sub2_Sub1)var13).anIntArray11907[var93] = -1;
                        continue;
                     }
                  }
               } else if(var92 < 0) {
                  continue;
               }

               var103 = ((Class639_Sub1_Sub2_Sub1)var13).anIntArray11958[var93];
               Class572 var109 = null;
               if(var103 >= 0) {
                  var109 = (Class572)Class526_Sub33.aClass40_Sub14_10659.method89(var103, -2087825860);
                  if(var109 != null && var109.anIntArray7682 != null) {
                     var109 = var109.method6903(Class242.aClass94_2456, Class242.aClass94_2456, -1485220058);
                  }
               }

               if(var92 - var105 <= client.anInt11012) {
                  if(null == var107) {
                     ((Class639_Sub1_Sub2_Sub1)var13).anIntArray11907[var93] = -1;
                  } else {
                     var108 = ((Class639_Sub1_Sub2_Sub1)var13).method9859((byte)-123) / 2;
                     Class545.method6514((Class639_Sub1)var13, var108, false, -914419086);
                     if(client.aFloatArray11132[0] > -1.0F) {
                        client.aFloatArray11132[0] += (float)Class331.aClass613_3498.anIntArray8073[var93];
                        client.aFloatArray11132[1] += (float)Class331.aClass613_3498.anIntArray8031[var93];
                        Class153 var111 = null;
                        Class153 var112 = null;
                        Class153 var113 = null;
                        Class153 var114 = null;
                        var28 = 0;
                        int var31 = 0;
                        int var32 = 0;
                        int var33 = 0;
                        int var34 = 0;
                        int var35 = 0;
                        int var36 = 0;
                        int var37 = 0;
                        Class153 var38 = null;
                        Class153 var39 = null;
                        Class153 var40 = null;
                        Class153 var41 = null;
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        var111 = var107.method6904(Class554.aClass174_7475, (byte)112);
                        if(var111 != null) {
                           var28 = var111.method1825();
                           var111.method1769(client.anIntArray11320);
                           var34 = client.anIntArray11320[0];
                        }

                        var112 = var107.method6907(Class554.aClass174_7475, '\uff00');
                        if(var112 != null) {
                           var31 = var112.method1825();
                           var112.method1769(client.anIntArray11320);
                           var35 = client.anIntArray11320[0];
                        }

                        var113 = var107.method6902(Class554.aClass174_7475, 219119008);
                        if(var113 != null) {
                           var32 = var113.method1825();
                           var113.method1769(client.anIntArray11320);
                           var36 = client.anIntArray11320[0];
                        }

                        var114 = var107.method6899(Class554.aClass174_7475, 297540814);
                        if(null != var114) {
                           var33 = var114.method1825();
                           var114.method1769(client.anIntArray11320);
                           var37 = client.anIntArray11320[0];
                        }

                        if(var109 != null) {
                           var38 = var109.method6904(Class554.aClass174_7475, (byte)31);
                           if(var38 != null) {
                              var42 = var38.method1825();
                              var38.method1769(client.anIntArray11320);
                              var46 = client.anIntArray11320[0];
                           }

                           var39 = var109.method6907(Class554.aClass174_7475, '\uff00');
                           if(var39 != null) {
                              var43 = var39.method1825();
                              var39.method1769(client.anIntArray11320);
                              var47 = client.anIntArray11320[0];
                           }

                           var40 = var109.method6902(Class554.aClass174_7475, -494551155);
                           if(null != var40) {
                              var44 = var40.method1825();
                              var40.method1769(client.anIntArray11320);
                              var48 = client.anIntArray11320[0];
                           }

                           var41 = var109.method6899(Class554.aClass174_7475, 2086644390);
                           if(null != var41) {
                              var45 = var41.method1825();
                              var41.method1769(client.anIntArray11320);
                              var49 = client.anIntArray11320[0];
                           }
                        }

                        Class163 var50 = Class47.aClass163_643;
                        Class163 var51 = Class47.aClass163_643;
                        Class1 var52 = Class701.aClass1_8786;
                        Class1 var53 = Class701.aClass1_8786;
                        int var54 = -165805671 * var107.anInt7667;
                        Class163 var55;
                        Class1 var56;
                        if(var54 >= 0) {
                           var55 = (Class163)Class627.aClass418_8195.method4951(client.anInterface51_11046, var54, true, var107.aBool7676, -1730576285);
                           var56 = Class627.aClass418_8195.method4964(client.anInterface51_11046, var54, (byte)2);
                           if(var55 != null && null != var56) {
                              var50 = var55;
                              var52 = var56;
                           }
                        }

                        if(null != var109) {
                           var54 = var109.anInt7667 * -165805671;
                           if(var54 >= 0) {
                              var55 = (Class163)Class627.aClass418_8195.method4951(client.anInterface51_11046, var54, true, var109.aBool7676, -1730576285);
                              var56 = Class627.aClass418_8195.method4964(client.anInterface51_11046, var54, (byte)2);
                              if(var55 != null && null != var56) {
                                 var51 = var55;
                                 var53 = var56;
                              }
                           }
                        }

                        var55 = null;
                        String var116 = null;
                        boolean var57 = false;
                        int var58 = 0;
                        String var115 = var107.method6901(((Class639_Sub1_Sub2_Sub1)var13).anIntArray11888[var93], 703423808);
                        int var117 = var52.method509(var115, 294581563);
                        if(var109 != null) {
                           var116 = var109.method6901(((Class639_Sub1_Sub2_Sub1)var13).anIntArray11909[var93], 1077372751);
                           var58 = var53.method509(var116, 294581563);
                        }

                        int var59 = 0;
                        int var60 = 0;
                        if(var31 > 0) {
                           var59 = 1 + var117 / var31;
                        }

                        if(var109 != null && var43 > 0) {
                           var60 = 1 + var58 / var43;
                        }

                        int var61 = 0;
                        int var62 = var61;
                        if(var28 > 0) {
                           var61 += var28;
                        }

                        var61 += 2;
                        int var63 = var61;
                        if(var32 > 0) {
                           var61 += var32;
                        }

                        int var64 = var61;
                        int var65 = var61;
                        int var66;
                        if(var31 > 0) {
                           var66 = var31 * var59;
                           var61 += var66;
                           var65 += (var66 - var117) / 2;
                        } else {
                           var61 += var117;
                        }

                        var66 = var61;
                        if(var33 > 0) {
                           var61 += var33;
                        }

                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72;
                        if(var109 != null) {
                           var61 += 2;
                           var67 = var61;
                           if(var42 > 0) {
                              var61 += var42;
                           }

                           var61 += 2;
                           var68 = var61;
                           if(var44 > 0) {
                              var61 += var44;
                           }

                           var69 = var61;
                           var71 = var61;
                           if(var43 > 0) {
                              var72 = var60 * var43;
                              var61 += var72;
                              var71 += (var72 - var58) / 2;
                           } else {
                              var61 += var58;
                           }

                           var70 = var61;
                           if(var45 > 0) {
                              var61 += var45;
                           }
                        }

                        var72 = ((Class639_Sub1_Sub2_Sub1)var13).anIntArray11907[var93] - client.anInt11012;
                        int var73 = -181991419 * var107.anInt7674 - var72 * var107.anInt7674 * -181991419 / (-2025196051 * var107.anInt7659);
                        int var74 = -1967376571 * var107.anInt7675 * var72 / (-2025196051 * var107.anInt7659) + -(var107.anInt7675 * -1967376571);
                        int var75 = (int)((float)var0 + client.aFloatArray11132[0] - (float)(var61 >> 1) + (float)var73);
                        int var76 = (int)((float)var74 + (client.aFloatArray11132[1] + (float)var1 - 12.0F));
                        int var77 = 15 + var76 + 1224256777 * var107.anInt7679;
                        int var78 = 0;
                        if(var109 != null) {
                           var78 = var109.anInt7679 * 1224256777 + 15 + var76;
                        }

                        int var79 = 255;
                        if(1333578273 * var107.anInt7661 >= 0) {
                           var79 = (var72 << 8) / (-2025196051 * var107.anInt7659 - var107.anInt7661 * 1333578273);
                        }

                        int var80;
                        if(var79 >= 0 && var79 < 255) {
                           var80 = var79 << 24;
                           int var81 = var80 | 16777215;
                           if(null != var111) {
                              var111.method1774(var75 + var62 - var34, var76, 0, var81, 1);
                           }

                           if(var113 != null) {
                              var113.method1774(var107.anInt7684 * -1178785627 + (var63 + var75 - var36), var107.anInt7681 * 279787153 + var76, 0, var81, 1);
                           }

                           int var82;
                           if(var112 != null) {
                              for(var82 = 0; var82 < var59; ++var82) {
                                 var112.method1774(var75 + var64 - var35 + var31 * var82 + -1178785627 * var107.anInt7684, var76 + 279787153 * var107.anInt7681, 0, var81, 1);
                              }
                           }

                           if(null != var114) {
                              var114.method1774(var75 + var66 - var37 + -1178785627 * var107.anInt7684, var107.anInt7681 * 279787153 + var76, 0, var81, 1);
                           }

                           var50.method1895(var115, var75 + var65, var77, 1470239855 * var107.anInt7668 | var80, 0, -653399858);
                           if(null != var109) {
                              if(var38 != null) {
                                 var38.method1774(var75 + var67 - var46, var76, 0, var81, 1);
                              }

                              if(var40 != null) {
                                 var40.method1774(var75 + var68 - var48 + -1178785627 * var109.anInt7684, 279787153 * var109.anInt7681 + var76, 0, var81, 1);
                              }

                              if(null != var39) {
                                 for(var82 = 0; var82 < var60; ++var82) {
                                    var39.method1774(var69 + var75 - var47 + var43 * var82 + var109.anInt7684 * -1178785627, var109.anInt7681 * 279787153 + var76, 0, var81, 1);
                                 }
                              }

                              if(var41 != null) {
                                 var41.method1774(var109.anInt7684 * -1178785627 + (var70 + var75 - var49), var109.anInt7681 * 279787153 + var76, 0, var81, 1);
                              }

                              var51.method1895(var116, var75 + var71, var78, 1470239855 * var109.anInt7668 | var80, 0, -828918199);
                           }
                        } else {
                           if(null != var111) {
                              var111.method1778(var75 + var62 - var34, var76);
                           }

                           if(var113 != null) {
                              var113.method1778(var63 + var75 - var36 + -1178785627 * var107.anInt7684, 279787153 * var107.anInt7681 + var76);
                           }

                           if(var112 != null) {
                              for(var80 = 0; var80 < var59; ++var80) {
                                 var112.method1778(var31 * var80 + (var75 + var64 - var35) + -1178785627 * var107.anInt7684, var76 + 279787153 * var107.anInt7681);
                              }
                           }

                           if(var114 != null) {
                              var114.method1778(var75 + var66 - var37 + var107.anInt7684 * -1178785627, var76 + 279787153 * var107.anInt7681);
                           }

                           var50.method1895(var115, var75 + var65, var77, var107.anInt7668 * 1470239855 | -16777216, 0, -1135636523);
                           if(null != var109) {
                              if(null != var38) {
                                 var38.method1778(var67 + var75 - var46, var76);
                              }

                              if(var40 != null) {
                                 var40.method1778(var109.anInt7684 * -1178785627 + (var68 + var75 - var48), var76 + var109.anInt7681 * 279787153);
                              }

                              if(var39 != null) {
                                 for(var80 = 0; var80 < var60; ++var80) {
                                    var39.method1778(var109.anInt7684 * -1178785627 + var80 * var43 + (var75 + var69 - var47), 279787153 * var109.anInt7681 + var76);
                                 }
                              }

                              if(var41 != null) {
                                 var41.method1778(var109.anInt7684 * -1178785627 + (var75 + var70 - var49), 279787153 * var109.anInt7681 + var76);
                              }

                              var51.method1895(var116, var71 + var75, var78, var109.anInt7668 * 1470239855 | -16777216, 0, 415777130);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      int var87;
      for(var10 = 0; var10 < client.anInt11303 * 2146415439; ++var10) {
         var87 = client.anIntArray11109[var10];
         Object var85;
         if(var87 < 2048) {
            var85 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var87];
         } else {
            var85 = (Class639_Sub1_Sub2_Sub1)((LinkableObject)client.npcs.get((long)(var87 - 2048))).anObject10399;
         }

         var84 = client.anIntArray11207[var10];
         Object var89;
         if(var84 < 2048) {
            var89 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var84];
         } else {
            var89 = (Class639_Sub1_Sub2_Sub1)((LinkableObject)client.npcs.get((long)(var84 - 2048))).anObject10399;
         }

         Class378.method4701((Class639_Sub1_Sub2_Sub1)var85, (Class639_Sub1_Sub2_Sub1)var89, (((Class639_Sub1_Sub2_Sub1)var85).anInt11896 -= 257490751) * 898789567, var0, var1, var2, var3, var4, var5, -1898914329);
      }

      var10 = 2 + 96898447 * Class680.aClass1_8616.anInt12 + -1329402501 * Class680.aClass1_8616.anInt14;

      for(var87 = 0; var87 < 912585901 * client.anInt11251; ++var87) {
         int var86 = client.anIntArray11253[var87];
         var84 = client.anIntArray11291[var87];
         int var94 = client.anIntArray11205[var87];
         boolean var98 = true;

         while(var98) {
            var98 = false;

            for(var92 = 0; var92 < var87; ++var92) {
               if(2 + var84 > client.anIntArray11291[var92] - var10 && var84 - var10 < client.anIntArray11291[var92] + 2 && var86 - var94 < client.anIntArray11253[var92] + client.anIntArray11205[var92] && var94 + var86 > client.anIntArray11253[var92] - client.anIntArray11205[var92] && client.anIntArray11291[var92] - var10 < var84) {
                  var84 = client.anIntArray11291[var92] - var10;
                  var98 = true;
               }
            }
         }

         client.anIntArray11291[var87] = var84;
         String var101 = client.aClass541Array11256[var87].method6459((byte)55);
         if(Class380_Sub1.aClass269_10121.method3583(-2066078170)) {
            var101 = Class380_Sub1.aClass269_10121.method3581(var101, (byte)-63);
         }

         if(client.anInt11188 * -499147283 == 0) {
            var102 = 16776960;
            var104 = client.aClass541Array11256[var87].method6460(-535267318);
            if(var104 < 6) {
               var102 = client.anIntArray11297[var104];
            }

            if(var104 == 6) {
               var102 = 1242714411 * client.anInt11126 % 20 < 10?16711680:16776960;
            }

            if(var104 == 7) {
               var102 = client.anInt11126 * 1242714411 % 20 < 10?255:'\uffff';
            }

            if(var104 == 8) {
               var102 = client.anInt11126 * 1242714411 % 20 < 10?'\ub000':8454016;
            }

            if(var104 == 9) {
               var105 = 150 - client.aClass541Array11256[var87].method6470(-2126465867) * 150 / client.aClass541Array11256[var87].method6462(2769418);
               if(var105 < 50) {
                  var102 = 16711680 + 1280 * var105;
               } else if(var105 < 100) {
                  var102 = 16776960 - 327680 * (var105 - 50);
               } else if(var105 < 150) {
                  var102 = (var105 - 100) * 5 + '\uff00';
               }
            }

            if(var104 == 10) {
               var105 = 150 - client.aClass541Array11256[var87].method6470(-2126465867) * 150 / client.aClass541Array11256[var87].method6462(2769418);
               if(var105 < 50) {
                  var102 = 16711680 + 5 * var105;
               } else if(var105 < 100) {
                  var102 = 16711935 - (var105 - 50) * 327680;
               } else if(var105 < 150) {
                  var102 = 255 + (var105 - 100) * 327680 - (var105 - 100) * 5;
               }
            }

            if(var104 == 11) {
               var105 = 150 - client.aClass541Array11256[var87].method6470(-2126465867) * 150 / client.aClass541Array11256[var87].method6462(2769418);
               if(var105 < 50) {
                  var102 = 16777215 - 327685 * var105;
               } else if(var105 < 100) {
                  var102 = '\uff00' + 327685 * (var105 - 50);
               } else if(var105 < 150) {
                  var102 = 16777215 - (var105 - 100) * 327680;
               }
            }

            var105 = var102 | -16777216;
            var103 = client.aClass541Array11256[var87].method6472(-974726768);
            if(0 == var103) {
               Class609.aClass163_7930.method1911(var101, var86 + var0, var1 + var84, var105, -16777216, (byte)-76);
            }

            if(var103 == 1) {
               Class609.aClass163_7930.method1916(var101, var0 + var86, var1 + var84, var105, -16777216, 1242714411 * client.anInt11126, (byte)31);
            }

            if(2 == var103) {
               Class609.aClass163_7930.method1900(var101, var86 + var0, var84 + var1, var105, -16777216, 1242714411 * client.anInt11126, -2036821062);
            }

            if(3 == var103) {
               var21 = 150 - client.aClass541Array11256[var87].method6470(-2126465867) * 150 / client.aClass541Array11256[var87].method6462(2769418);
               Class609.aClass163_7930.method1921(var101, var0 + var86, var84 + var1, var105, -16777216, client.anInt11126 * 1242714411, var21, (byte)-21);
            }

            if(4 == var103) {
               var21 = 150 - client.aClass541Array11256[var87].method6470(-2126465867) * 150 / client.aClass541Array11256[var87].method6462(2769418);
               var108 = var21 * (Class680.aClass1_8616.method509(var101, 294581563) + 100) / 150;
               Class554.aClass174_7475.method2317(var86 + var0 - 50, var1, var0 + var86 + 50, var3 + var1);
               Class609.aClass163_7930.method1895(var101, var86 + var0 + 50 - var108, var84 + var1, var105, -16777216, -1216488943);
               Class554.aClass174_7475.method2538(var0, var1, var0 + var2, var3 + var1);
            }

            if(var103 == 5) {
               var21 = 150 - client.aClass541Array11256[var87].method6470(-2126465867) * 150 / client.aClass541Array11256[var87].method6462(2769418);
               var108 = 0;
               if(var21 < 25) {
                  var108 = var21 - 25;
               } else if(var21 > 125) {
                  var108 = var21 - 125;
               }

               var23 = Class680.aClass1_8616.anInt14 * -1329402501 + Class680.aClass1_8616.anInt12 * 96898447;
               Class554.aClass174_7475.method2317(var0, var1 + var84 - var23 - 1, var2 + var0, 5 + var84 + var1);
               Class609.aClass163_7930.method1911(var101, var86 + var0, var1 + var84 + var108, var105, -16777216, (byte)75);
               Class554.aClass174_7475.method2538(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            Class609.aClass163_7930.method1911(var101, var0 + var86, var1 + var84, -256, -16777216, (byte)17);
         }
      }

   }
}
