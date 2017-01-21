package com.jagex;

import com.jagex.Class433;

public class Class437 {
   public float aFloat4852;
   public float aFloat4853;
   public float aFloat4854;
   public float aFloat4855;
   public float aFloat4856;
   public float aFloat4858;
   static float[] aFloatArray4851 = new float[8];
   static float[] aFloatArray4857 = new float[8];
   static float[] aFloatArray4850 = new float[8];

   public boolean method5150(int var1, int var2, int var3, int var4, Class433 var5, float var6, float var7, float var8, float var9) {
      boolean var10 = false;
      float var11 = Float.MAX_VALUE;
      float var12 = -3.4028235E38F;
      float var13 = Float.MAX_VALUE;
      float var14 = -3.4028235E38F;
      aFloatArray4851[0] = this.aFloat4856;
      aFloatArray4857[0] = this.aFloat4858;
      aFloatArray4850[0] = this.aFloat4852;
      aFloatArray4851[1] = this.aFloat4853;
      aFloatArray4857[1] = this.aFloat4858;
      aFloatArray4850[1] = this.aFloat4852;
      aFloatArray4851[2] = this.aFloat4856;
      aFloatArray4857[2] = this.aFloat4854;
      aFloatArray4850[2] = this.aFloat4852;
      aFloatArray4851[3] = this.aFloat4853;
      aFloatArray4857[3] = this.aFloat4854;
      aFloatArray4850[3] = this.aFloat4852;
      aFloatArray4851[4] = this.aFloat4856;
      aFloatArray4857[4] = this.aFloat4858;
      aFloatArray4850[4] = this.aFloat4855;
      aFloatArray4851[5] = this.aFloat4853;
      aFloatArray4857[5] = this.aFloat4858;
      aFloatArray4850[5] = this.aFloat4855;
      aFloatArray4851[6] = this.aFloat4856;
      aFloatArray4857[6] = this.aFloat4854;
      aFloatArray4850[6] = this.aFloat4855;
      aFloatArray4851[7] = this.aFloat4853;
      aFloatArray4857[7] = this.aFloat4854;
      aFloatArray4850[7] = this.aFloat4855;

      int var15;
      for(var15 = 0; var15 < 8; ++var15) {
         float var16 = aFloatArray4851[var15];
         float var17 = aFloatArray4857[var15];
         float var18 = aFloatArray4850[var15];
         float var19 = var5.aFloatArray4841[2] * var16 + var5.aFloatArray4841[6] * var17 + var5.aFloatArray4841[10] * var18 + var5.aFloatArray4841[14];
         float var20 = var5.aFloatArray4841[3] * var16 + var5.aFloatArray4841[7] * var17 + var5.aFloatArray4841[11] * var18 + var5.aFloatArray4841[15];
         if(var19 >= -var20) {
            float var21 = var5.aFloatArray4841[0] * var16 + var5.aFloatArray4841[4] * var17 + var5.aFloatArray4841[8] * var18 + var5.aFloatArray4841[12];
            float var22 = var5.aFloatArray4841[1] * var16 + var5.aFloatArray4841[5] * var17 + var5.aFloatArray4841[9] * var18 + var5.aFloatArray4841[13];
            float var23 = var6 + var8 * var21 / var20;
            float var24 = var7 + var9 * var22 / var20;
            if(var23 < var11) {
               var11 = var23;
            }

            if(var23 > var12) {
               var12 = var23;
            }

            if(var24 < var13) {
               var13 = var24;
            }

            if(var24 > var14) {
               var14 = var24;
            }

            var10 = true;
         }
      }

      var15 = var1 + var3;
      int var25 = var2 + var4;
      if(var10 && (float)var15 > var11 && (float)var1 < var12 && (float)var25 > var13 && (float)var2 < var14) {
         return true;
      } else {
         return false;
      }
   }
}
