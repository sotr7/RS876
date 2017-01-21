package com.jagex;

import com.jagex.Class440;

public final class Class428 {
   public float[] aFloatArray4804 = new float[9];

   public Class440 method5035() {
      Class440 var1 = new Class440();
      double var2 = (double)(1.0F + this.aFloatArray4804[0] + this.aFloatArray4804[4] + this.aFloatArray4804[8]);
      float var4;
      if(var2 > 1.0E-8D) {
         var4 = (float)(Math.sqrt(var2) * 2.0D);
         var1.aFloat4871 = (this.aFloatArray4804[7] - this.aFloatArray4804[5]) / var4;
         var1.aFloat4868 = (this.aFloatArray4804[2] - this.aFloatArray4804[6]) / var4;
         var1.aFloat4873 = (this.aFloatArray4804[3] - this.aFloatArray4804[1]) / var4;
         var1.aFloat4872 = 0.25F * var4;
      } else if(this.aFloatArray4804[0] > this.aFloatArray4804[4] && this.aFloatArray4804[0] > this.aFloatArray4804[8]) {
         var4 = (float)(Math.sqrt((double)(1.0F + this.aFloatArray4804[0] - this.aFloatArray4804[4] - this.aFloatArray4804[8])) * 2.0D);
         var1.aFloat4871 = 0.25F * var4;
         var1.aFloat4868 = (this.aFloatArray4804[3] + this.aFloatArray4804[1]) / var4;
         var1.aFloat4873 = (this.aFloatArray4804[2] + this.aFloatArray4804[6]) / var4;
         var1.aFloat4872 = (this.aFloatArray4804[7] - this.aFloatArray4804[5]) / var4;
      } else if(this.aFloatArray4804[4] > this.aFloatArray4804[8]) {
         var4 = (float)(Math.sqrt((double)(1.0F + this.aFloatArray4804[4] - this.aFloatArray4804[0] - this.aFloatArray4804[8])) * 2.0D);
         var1.aFloat4871 = (this.aFloatArray4804[3] + this.aFloatArray4804[1]) / var4;
         var1.aFloat4868 = 0.25F * var4;
         var1.aFloat4873 = (this.aFloatArray4804[7] + this.aFloatArray4804[5]) / var4;
         var1.aFloat4872 = (this.aFloatArray4804[2] - this.aFloatArray4804[6]) / var4;
      } else {
         var4 = (float)(Math.sqrt((double)(1.0F + this.aFloatArray4804[8] - this.aFloatArray4804[0] - this.aFloatArray4804[4])) * 2.0D);
         var1.aFloat4871 = (this.aFloatArray4804[2] + this.aFloatArray4804[6]) / var4;
         var1.aFloat4868 = (this.aFloatArray4804[7] + this.aFloatArray4804[5]) / var4;
         var1.aFloat4873 = 0.25F * var4;
         var1.aFloat4872 = (this.aFloatArray4804[3] - this.aFloatArray4804[1]) / var4;
      }

      return var1;
   }

   void method5036() {
      this.aFloatArray4804[0] = 1.0F;
      this.aFloatArray4804[1] = 0.0F;
      this.aFloatArray4804[2] = 0.0F;
      this.aFloatArray4804[3] = 0.0F;
      this.aFloatArray4804[4] = 1.0F;
      this.aFloatArray4804[5] = 0.0F;
      this.aFloatArray4804[6] = 0.0F;
      this.aFloatArray4804[7] = 0.0F;
      this.aFloatArray4804[8] = 1.0F;
   }

   public Class428() {
      this.method5036();
   }

   void method5037() {
      this.aFloatArray4804[0] = 1.0F;
      this.aFloatArray4804[1] = 0.0F;
      this.aFloatArray4804[2] = 0.0F;
      this.aFloatArray4804[3] = 0.0F;
      this.aFloatArray4804[4] = 1.0F;
      this.aFloatArray4804[5] = 0.0F;
      this.aFloatArray4804[6] = 0.0F;
      this.aFloatArray4804[7] = 0.0F;
      this.aFloatArray4804[8] = 1.0F;
   }

   void method5038() {
      this.aFloatArray4804[0] = 1.0F;
      this.aFloatArray4804[1] = 0.0F;
      this.aFloatArray4804[2] = 0.0F;
      this.aFloatArray4804[3] = 0.0F;
      this.aFloatArray4804[4] = 1.0F;
      this.aFloatArray4804[5] = 0.0F;
      this.aFloatArray4804[6] = 0.0F;
      this.aFloatArray4804[7] = 0.0F;
      this.aFloatArray4804[8] = 1.0F;
   }
}
