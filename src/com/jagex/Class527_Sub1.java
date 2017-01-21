package com.jagex;

import com.jagex.Class527;
import java.util.Random;

public class Class527_Sub1 extends Class527 {
   static float[][] aFloatArrayArray10687 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   int[] anIntArray10686 = new int[512];

   static final float method9734(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public Class527_Sub1(int var1) {
      Random var2 = new Random((long)var1);

      int var3;
      for(var3 = 0; var3 < 256; ++var3) {
         this.anIntArray10686[var3] = this.anIntArray10686[var3 + 256] = var3;
      }

      for(var3 = 0; var3 < 256; ++var3) {
         int var4 = var2.nextInt() & 255;
         int var5 = this.anIntArray10686[var4];
         this.anIntArray10686[var4] = this.anIntArray10686[var4 + 256] = this.anIntArray10686[var3];
         this.anIntArray10686[var3] = this.anIntArray10686[var3 + 256] = var5;
      }

   }

   void method6339(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, float[] var9, int var10) {
      int var11 = (int)((float)var2 * var5 - 1.0F);
      var11 &= 255;
      int var12 = (int)((float)var3 * var6 - 1.0F);
      var12 &= 255;
      int var13 = (int)((float)var4 * var7 - 1.0F);
      var13 &= 255;
      float var14 = (float)var1 * var7;
      int var15 = (int)var14;
      int var16 = var15 + 1;
      float var17 = var14 - (float)var15;
      float var18 = 1.0F - var17;
      float var19 = method9736(var17);
      var15 &= var13;
      var16 &= var13;
      int var20 = this.anIntArray10686[var15];
      int var21 = this.anIntArray10686[var16];

      for(int var22 = 0; var22 < var3; ++var22) {
         float var23 = (float)var22 * var6;
         int var24 = (int)var23;
         int var25 = var24 + 1;
         float var26 = var23 - (float)var24;
         float var27 = 1.0F - var26;
         float var28 = method9736(var26);
         var24 &= var12;
         var25 &= var12;
         int var29 = this.anIntArray10686[var24 + var20];
         int var30 = this.anIntArray10686[var25 + var20];
         int var31 = this.anIntArray10686[var24 + var21];
         int var32 = this.anIntArray10686[var25 + var21];

         for(int var33 = 0; var33 < var2; ++var33) {
            float var34 = (float)var33 * var5;
            int var35 = (int)var34;
            int var36 = var35 + 1;
            float var37 = var34 - (float)var35;
            float var38 = 1.0F - var37;
            float var39 = method9736(var37);
            var35 &= var11;
            var36 &= var11;
            var9[var10++] = var8 * method9734(method9734(method9734(method9737(this.anIntArray10686[var35 + var29] & 7, var38, var27, var18), method9737(this.anIntArray10686[var36 + var29] & 7, var37, var27, var18), var39), method9734(method9737(this.anIntArray10686[var35 + var30] & 7, var38, var26, var18), method9737(this.anIntArray10686[var36 + var30] & 7, var37, var26, var18), var39), var28), method9734(method9734(method9737(this.anIntArray10686[var35 + var31] & 7, var38, var27, var17), method9737(this.anIntArray10686[var36 + var31] & 7, var37, var27, var17), var39), method9734(method9737(this.anIntArray10686[var35 + var32] & 7, var38, var26, var17), method9737(this.anIntArray10686[var36 + var32] & 7, var37, var26, var17), var39), var28), var19);
         }
      }

   }

   static final float method9735(float var0) {
      return var0 * var0 * var0 * (10.0F + (var0 * 6.0F - 15.0F) * var0);
   }

   static final float method9736(float var0) {
      return var0 * var0 * var0 * (10.0F + (var0 * 6.0F - 15.0F) * var0);
   }

   static final float method9737(int var0, float var1, float var2, float var3) {
      float[] var4 = aFloatArrayArray10687[var0];
      return var4[0] * var1 + var4[1] * var2 + var4[2] * var3;
   }

   void method6338(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, float[] var9, int var10) {
      int var11 = (int)((float)var2 * var5 - 1.0F);
      var11 &= 255;
      int var12 = (int)((float)var3 * var6 - 1.0F);
      var12 &= 255;
      int var13 = (int)((float)var4 * var7 - 1.0F);
      var13 &= 255;
      float var14 = (float)var1 * var7;
      int var15 = (int)var14;
      int var16 = var15 + 1;
      float var17 = var14 - (float)var15;
      float var18 = 1.0F - var17;
      float var19 = method9736(var17);
      var15 &= var13;
      var16 &= var13;
      int var20 = this.anIntArray10686[var15];
      int var21 = this.anIntArray10686[var16];

      for(int var22 = 0; var22 < var3; ++var22) {
         float var23 = (float)var22 * var6;
         int var24 = (int)var23;
         int var25 = var24 + 1;
         float var26 = var23 - (float)var24;
         float var27 = 1.0F - var26;
         float var28 = method9736(var26);
         var24 &= var12;
         var25 &= var12;
         int var29 = this.anIntArray10686[var24 + var20];
         int var30 = this.anIntArray10686[var25 + var20];
         int var31 = this.anIntArray10686[var24 + var21];
         int var32 = this.anIntArray10686[var25 + var21];

         for(int var33 = 0; var33 < var2; ++var33) {
            float var34 = (float)var33 * var5;
            int var35 = (int)var34;
            int var36 = var35 + 1;
            float var37 = var34 - (float)var35;
            float var38 = 1.0F - var37;
            float var39 = method9736(var37);
            var35 &= var11;
            var36 &= var11;
            var9[var10++] = var8 * method9734(method9734(method9734(method9737(this.anIntArray10686[var35 + var29] & 7, var38, var27, var18), method9737(this.anIntArray10686[var36 + var29] & 7, var37, var27, var18), var39), method9734(method9737(this.anIntArray10686[var35 + var30] & 7, var38, var26, var18), method9737(this.anIntArray10686[var36 + var30] & 7, var37, var26, var18), var39), var28), method9734(method9734(method9737(this.anIntArray10686[var35 + var31] & 7, var38, var27, var17), method9737(this.anIntArray10686[var36 + var31] & 7, var37, var27, var17), var39), method9734(method9737(this.anIntArray10686[var35 + var32] & 7, var38, var26, var17), method9737(this.anIntArray10686[var36 + var32] & 7, var37, var26, var17), var39), var28), var19);
         }
      }

   }

   void method6340(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, float[] var9, int var10) {
      int var11 = (int)((float)var2 * var5 - 1.0F);
      var11 &= 255;
      int var12 = (int)((float)var3 * var6 - 1.0F);
      var12 &= 255;
      int var13 = (int)((float)var4 * var7 - 1.0F);
      var13 &= 255;
      float var14 = (float)var1 * var7;
      int var15 = (int)var14;
      int var16 = var15 + 1;
      float var17 = var14 - (float)var15;
      float var18 = 1.0F - var17;
      float var19 = method9736(var17);
      var15 &= var13;
      var16 &= var13;
      int var20 = this.anIntArray10686[var15];
      int var21 = this.anIntArray10686[var16];

      for(int var22 = 0; var22 < var3; ++var22) {
         float var23 = (float)var22 * var6;
         int var24 = (int)var23;
         int var25 = var24 + 1;
         float var26 = var23 - (float)var24;
         float var27 = 1.0F - var26;
         float var28 = method9736(var26);
         var24 &= var12;
         var25 &= var12;
         int var29 = this.anIntArray10686[var24 + var20];
         int var30 = this.anIntArray10686[var25 + var20];
         int var31 = this.anIntArray10686[var24 + var21];
         int var32 = this.anIntArray10686[var25 + var21];

         for(int var33 = 0; var33 < var2; ++var33) {
            float var34 = (float)var33 * var5;
            int var35 = (int)var34;
            int var36 = var35 + 1;
            float var37 = var34 - (float)var35;
            float var38 = 1.0F - var37;
            float var39 = method9736(var37);
            var35 &= var11;
            var36 &= var11;
            var9[var10++] = var8 * method9734(method9734(method9734(method9737(this.anIntArray10686[var35 + var29] & 7, var38, var27, var18), method9737(this.anIntArray10686[var36 + var29] & 7, var37, var27, var18), var39), method9734(method9737(this.anIntArray10686[var35 + var30] & 7, var38, var26, var18), method9737(this.anIntArray10686[var36 + var30] & 7, var37, var26, var18), var39), var28), method9734(method9734(method9737(this.anIntArray10686[var35 + var31] & 7, var38, var27, var17), method9737(this.anIntArray10686[var36 + var31] & 7, var37, var27, var17), var39), method9734(method9737(this.anIntArray10686[var35 + var32] & 7, var38, var26, var17), method9737(this.anIntArray10686[var36 + var32] & 7, var37, var26, var17), var39), var28), var19);
         }
      }

   }

   void method6341(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, float[] var9, int var10) {
      int var11 = (int)((float)var2 * var5 - 1.0F);
      var11 &= 255;
      int var12 = (int)((float)var3 * var6 - 1.0F);
      var12 &= 255;
      int var13 = (int)((float)var4 * var7 - 1.0F);
      var13 &= 255;
      float var14 = (float)var1 * var7;
      int var15 = (int)var14;
      int var16 = var15 + 1;
      float var17 = var14 - (float)var15;
      float var18 = 1.0F - var17;
      float var19 = method9736(var17);
      var15 &= var13;
      var16 &= var13;
      int var20 = this.anIntArray10686[var15];
      int var21 = this.anIntArray10686[var16];

      for(int var22 = 0; var22 < var3; ++var22) {
         float var23 = (float)var22 * var6;
         int var24 = (int)var23;
         int var25 = var24 + 1;
         float var26 = var23 - (float)var24;
         float var27 = 1.0F - var26;
         float var28 = method9736(var26);
         var24 &= var12;
         var25 &= var12;
         int var29 = this.anIntArray10686[var24 + var20];
         int var30 = this.anIntArray10686[var25 + var20];
         int var31 = this.anIntArray10686[var24 + var21];
         int var32 = this.anIntArray10686[var25 + var21];

         for(int var33 = 0; var33 < var2; ++var33) {
            float var34 = (float)var33 * var5;
            int var35 = (int)var34;
            int var36 = var35 + 1;
            float var37 = var34 - (float)var35;
            float var38 = 1.0F - var37;
            float var39 = method9736(var37);
            var35 &= var11;
            var36 &= var11;
            var9[var10++] = var8 * method9734(method9734(method9734(method9737(this.anIntArray10686[var35 + var29] & 7, var38, var27, var18), method9737(this.anIntArray10686[var36 + var29] & 7, var37, var27, var18), var39), method9734(method9737(this.anIntArray10686[var35 + var30] & 7, var38, var26, var18), method9737(this.anIntArray10686[var36 + var30] & 7, var37, var26, var18), var39), var28), method9734(method9734(method9737(this.anIntArray10686[var35 + var31] & 7, var38, var27, var17), method9737(this.anIntArray10686[var36 + var31] & 7, var37, var27, var17), var39), method9734(method9737(this.anIntArray10686[var35 + var32] & 7, var38, var26, var17), method9737(this.anIntArray10686[var36 + var32] & 7, var37, var26, var17), var39), var28), var19);
         }
      }

   }
}
