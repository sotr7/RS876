package com.jagex;

import com.jagex.Class433;

public class Class444 {
   public float aFloat4897;
   public float aFloat4898;
   public float aFloat4899;
   public float aFloat4900;

   public final void method5201() {
      this.aFloat4897 = -this.aFloat4897;
      this.aFloat4898 = -this.aFloat4898;
      this.aFloat4899 = -this.aFloat4899;
      this.aFloat4900 = -this.aFloat4900;
   }

   public void method5202(float var1, float var2, float var3, float var4) {
      this.aFloat4897 = var1;
      this.aFloat4898 = var2;
      this.aFloat4899 = var3;
      this.aFloat4900 = var4;
   }

   public void method5203(Class444 var1) {
      this.method5202(var1.aFloat4897, var1.aFloat4898, var1.aFloat4899, var1.aFloat4900);
   }

   public void method5204(int var1) {
      this.method5202((float)(var1 >> 16 & 255) * 0.003921569F, (float)(var1 >> 8 & 255) * 0.003921569F, (float)(var1 >> 0 & 255) * 0.003921569F, (float)(var1 >> 24 & 255) * 0.003921569F);
   }

   public void method5205(int var1) {
      this.method5202((float)(var1 >> 16 & 255) * 0.003921569F, (float)(var1 >> 8 & 255) * 0.003921569F, (float)(var1 >> 0 & 255) * 0.003921569F, (float)(var1 >> 24 & 255) * 0.003921569F);
   }

   public final void method5206(float var1) {
      this.aFloat4897 *= var1;
      this.aFloat4898 *= var1;
      this.aFloat4899 *= var1;
      this.aFloat4900 *= var1;
   }

   public final void method5207(Class433 var1) {
      float var2 = this.aFloat4897;
      float var3 = this.aFloat4898;
      float var4 = this.aFloat4899;
      float var5 = this.aFloat4900;
      this.aFloat4897 = var1.aFloatArray4841[0] * var2 + var1.aFloatArray4841[4] * var3 + var1.aFloatArray4841[8] * var4 + var1.aFloatArray4841[12] * var5;
      this.aFloat4898 = var1.aFloatArray4841[1] * var2 + var1.aFloatArray4841[5] * var3 + var1.aFloatArray4841[9] * var4 + var1.aFloatArray4841[13] * var5;
      this.aFloat4899 = var1.aFloatArray4841[2] * var2 + var1.aFloatArray4841[6] * var3 + var1.aFloatArray4841[10] * var4 + var1.aFloatArray4841[14] * var5;
      this.aFloat4900 = var1.aFloatArray4841[3] * var2 + var1.aFloatArray4841[7] * var3 + var1.aFloatArray4841[11] * var4 + var1.aFloatArray4841[15] * var5;
   }

   public String toString() {
      return this.aFloat4897 + "," + this.aFloat4898 + "," + this.aFloat4899 + "," + this.aFloat4900;
   }

   public String method5208() {
      return this.aFloat4897 + "," + this.aFloat4898 + "," + this.aFloat4899 + "," + this.aFloat4900;
   }

   public Class444() {
      this.method5215();
   }

   final void method5209() {
      this.aFloat4900 = 0.0F;
      this.aFloat4899 = 0.0F;
      this.aFloat4898 = 0.0F;
      this.aFloat4897 = 0.0F;
   }

   final void method5210() {
      this.aFloat4900 = 0.0F;
      this.aFloat4899 = 0.0F;
      this.aFloat4898 = 0.0F;
      this.aFloat4897 = 0.0F;
   }

   public final void method5211() {
      this.aFloat4897 = -this.aFloat4897;
      this.aFloat4898 = -this.aFloat4898;
      this.aFloat4899 = -this.aFloat4899;
      this.aFloat4900 = -this.aFloat4900;
   }

   public final void method5212() {
      this.aFloat4897 = -this.aFloat4897;
      this.aFloat4898 = -this.aFloat4898;
      this.aFloat4899 = -this.aFloat4899;
      this.aFloat4900 = -this.aFloat4900;
   }

   public final void method5213() {
      this.aFloat4897 = -this.aFloat4897;
      this.aFloat4898 = -this.aFloat4898;
      this.aFloat4899 = -this.aFloat4899;
      this.aFloat4900 = -this.aFloat4900;
   }

   public final void method5214() {
      this.aFloat4897 = -this.aFloat4897;
      this.aFloat4898 = -this.aFloat4898;
      this.aFloat4899 = -this.aFloat4899;
      this.aFloat4900 = -this.aFloat4900;
   }

   public Class444(float var1, float var2, float var3, float var4) {
      this.method5202(var1, var2, var3, var4);
   }

   final void method5215() {
      this.aFloat4900 = 0.0F;
      this.aFloat4899 = 0.0F;
      this.aFloat4898 = 0.0F;
      this.aFloat4897 = 0.0F;
   }

   public final void method5216(float var1) {
      this.aFloat4897 *= var1;
      this.aFloat4898 *= var1;
      this.aFloat4899 *= var1;
      this.aFloat4900 *= var1;
   }
}
