package com.jagex;

import com.jagex.Class435;
import com.jagex.Class445;
import java.util.Arrays;

public final class Class433 {
   public float[] aFloatArray4841 = new float[16];
   public static Class433 aClass433_4840 = new Class433();

   public void method5081(float var1, float var2, float var3) {
      this.method5092(-10000.0F / var3, 10000.0F / var3, -10000.0F / var3, 10000.0F / var3, var1, var2);
   }

   public Class433(Class433 var1) {
      this.method5083(var1);
   }

   public void method5082(float var1, float var2, float var3, float var4) {
      this.aFloatArray4841[0] = var1;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = var2;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = var3;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = var4;
   }

   public void method5083(Class433 var1) {
      System.arraycopy(var1.aFloatArray4841, 0, this.aFloatArray4841, 0, 16);
   }

   public void method5084(Class433 var1) {
      System.arraycopy(var1.aFloatArray4841, 0, this.aFloatArray4841, 0, 11);
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = 1.0F;
   }

   public void method5085(Class433 var1) {
      float var2 = this.aFloatArray4841[0] * var1.aFloatArray4841[0] + this.aFloatArray4841[1] * var1.aFloatArray4841[4] + this.aFloatArray4841[2] * var1.aFloatArray4841[8] + this.aFloatArray4841[3] * var1.aFloatArray4841[12];
      float var3 = this.aFloatArray4841[0] * var1.aFloatArray4841[1] + this.aFloatArray4841[1] * var1.aFloatArray4841[5] + this.aFloatArray4841[2] * var1.aFloatArray4841[9] + this.aFloatArray4841[3] * var1.aFloatArray4841[13];
      float var4 = this.aFloatArray4841[0] * var1.aFloatArray4841[2] + this.aFloatArray4841[1] * var1.aFloatArray4841[6] + this.aFloatArray4841[2] * var1.aFloatArray4841[10] + this.aFloatArray4841[3] * var1.aFloatArray4841[14];
      float var5 = this.aFloatArray4841[0] * var1.aFloatArray4841[3] + this.aFloatArray4841[1] * var1.aFloatArray4841[7] + this.aFloatArray4841[2] * var1.aFloatArray4841[11] + this.aFloatArray4841[3] * var1.aFloatArray4841[15];
      float var6 = this.aFloatArray4841[4] * var1.aFloatArray4841[0] + this.aFloatArray4841[5] * var1.aFloatArray4841[4] + this.aFloatArray4841[6] * var1.aFloatArray4841[8] + this.aFloatArray4841[7] * var1.aFloatArray4841[12];
      float var7 = this.aFloatArray4841[4] * var1.aFloatArray4841[1] + this.aFloatArray4841[5] * var1.aFloatArray4841[5] + this.aFloatArray4841[6] * var1.aFloatArray4841[9] + this.aFloatArray4841[7] * var1.aFloatArray4841[13];
      float var8 = this.aFloatArray4841[4] * var1.aFloatArray4841[2] + this.aFloatArray4841[5] * var1.aFloatArray4841[6] + this.aFloatArray4841[6] * var1.aFloatArray4841[10] + this.aFloatArray4841[7] * var1.aFloatArray4841[14];
      float var9 = this.aFloatArray4841[4] * var1.aFloatArray4841[3] + this.aFloatArray4841[5] * var1.aFloatArray4841[7] + this.aFloatArray4841[6] * var1.aFloatArray4841[11] + this.aFloatArray4841[7] * var1.aFloatArray4841[15];
      float var10 = this.aFloatArray4841[8] * var1.aFloatArray4841[0] + this.aFloatArray4841[9] * var1.aFloatArray4841[4] + this.aFloatArray4841[10] * var1.aFloatArray4841[8] + this.aFloatArray4841[11] * var1.aFloatArray4841[12];
      float var11 = this.aFloatArray4841[8] * var1.aFloatArray4841[1] + this.aFloatArray4841[9] * var1.aFloatArray4841[5] + this.aFloatArray4841[10] * var1.aFloatArray4841[9] + this.aFloatArray4841[11] * var1.aFloatArray4841[13];
      float var12 = this.aFloatArray4841[8] * var1.aFloatArray4841[2] + this.aFloatArray4841[9] * var1.aFloatArray4841[6] + this.aFloatArray4841[10] * var1.aFloatArray4841[10] + this.aFloatArray4841[11] * var1.aFloatArray4841[14];
      float var13 = this.aFloatArray4841[8] * var1.aFloatArray4841[3] + this.aFloatArray4841[9] * var1.aFloatArray4841[7] + this.aFloatArray4841[10] * var1.aFloatArray4841[11] + this.aFloatArray4841[11] * var1.aFloatArray4841[15];
      float var14 = this.aFloatArray4841[12] * var1.aFloatArray4841[0] + this.aFloatArray4841[13] * var1.aFloatArray4841[4] + this.aFloatArray4841[14] * var1.aFloatArray4841[8] + this.aFloatArray4841[15] * var1.aFloatArray4841[12];
      float var15 = this.aFloatArray4841[12] * var1.aFloatArray4841[1] + this.aFloatArray4841[13] * var1.aFloatArray4841[5] + this.aFloatArray4841[14] * var1.aFloatArray4841[9] + this.aFloatArray4841[15] * var1.aFloatArray4841[13];
      float var16 = this.aFloatArray4841[12] * var1.aFloatArray4841[2] + this.aFloatArray4841[13] * var1.aFloatArray4841[6] + this.aFloatArray4841[14] * var1.aFloatArray4841[10] + this.aFloatArray4841[15] * var1.aFloatArray4841[14];
      float var17 = this.aFloatArray4841[12] * var1.aFloatArray4841[3] + this.aFloatArray4841[13] * var1.aFloatArray4841[7] + this.aFloatArray4841[14] * var1.aFloatArray4841[11] + this.aFloatArray4841[15] * var1.aFloatArray4841[15];
      this.aFloatArray4841[0] = var2;
      this.aFloatArray4841[1] = var3;
      this.aFloatArray4841[2] = var4;
      this.aFloatArray4841[3] = var5;
      this.aFloatArray4841[4] = var6;
      this.aFloatArray4841[5] = var7;
      this.aFloatArray4841[6] = var8;
      this.aFloatArray4841[7] = var9;
      this.aFloatArray4841[8] = var10;
      this.aFloatArray4841[9] = var11;
      this.aFloatArray4841[10] = var12;
      this.aFloatArray4841[11] = var13;
      this.aFloatArray4841[12] = var14;
      this.aFloatArray4841[13] = var15;
      this.aFloatArray4841[14] = var16;
      this.aFloatArray4841[15] = var17;
   }

   public int method5086() {
      byte var1 = 1;
      int var2 = 31 * var1 + Arrays.hashCode(this.aFloatArray4841);
      return var2;
   }

   public int method5087() {
      byte var1 = 1;
      int var2 = 31 * var1 + Arrays.hashCode(this.aFloatArray4841);
      return var2;
   }

   public float[] method5088(float[] var1) {
      var1[0] = this.aFloatArray4841[0];
      var1[1] = this.aFloatArray4841[4];
      var1[2] = this.aFloatArray4841[8];
      var1[3] = this.aFloatArray4841[12];
      var1[4] = this.aFloatArray4841[1];
      var1[5] = this.aFloatArray4841[5];
      var1[6] = this.aFloatArray4841[9];
      var1[7] = this.aFloatArray4841[13];
      var1[8] = this.aFloatArray4841[2];
      var1[9] = this.aFloatArray4841[6];
      var1[10] = this.aFloatArray4841[10];
      var1[11] = this.aFloatArray4841[14];
      var1[12] = this.aFloatArray4841[3];
      var1[13] = this.aFloatArray4841[7];
      var1[14] = this.aFloatArray4841[11];
      var1[15] = this.aFloatArray4841[15];
      return var1;
   }

   public void method5089(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.aFloatArray4841[0] * var1 + this.aFloatArray4841[4] * var2 + this.aFloatArray4841[8] * var3 + this.aFloatArray4841[12];
      var4[1] = this.aFloatArray4841[1] * var1 + this.aFloatArray4841[5] * var2 + this.aFloatArray4841[9] * var3 + this.aFloatArray4841[13];
      var4[2] = this.aFloatArray4841[2] * var1 + this.aFloatArray4841[6] * var2 + this.aFloatArray4841[10] * var3 + this.aFloatArray4841[14];
      if(var4.length > 3) {
         var4[3] = this.aFloatArray4841[3] * var1 + this.aFloatArray4841[7] * var2 + this.aFloatArray4841[11] * var3 + this.aFloatArray4841[15];
      }

   }

   public void method5090(float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      var1[0] = this.aFloatArray4841[0] * var2 + this.aFloatArray4841[4] * var3 + this.aFloatArray4841[8] * var4 + this.aFloatArray4841[12];
      var1[1] = this.aFloatArray4841[1] * var2 + this.aFloatArray4841[5] * var3 + this.aFloatArray4841[9] * var4 + this.aFloatArray4841[13];
      var1[2] = this.aFloatArray4841[2] * var2 + this.aFloatArray4841[6] * var3 + this.aFloatArray4841[10] * var4 + this.aFloatArray4841[14];
   }

   public void method5091(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.aFloatArray4841[0] * var1 + this.aFloatArray4841[4] * var2 + this.aFloatArray4841[8] * var3;
      var4[1] = this.aFloatArray4841[1] * var1 + this.aFloatArray4841[5] * var2 + this.aFloatArray4841[9] * var3;
      var4[2] = this.aFloatArray4841[2] * var1 + this.aFloatArray4841[6] * var2 + this.aFloatArray4841[10] * var3;
      if(var4.length > 3) {
         var4[3] = this.aFloatArray4841[3] * var1 + this.aFloatArray4841[7] * var2 + this.aFloatArray4841[11] * var3;
      }

   }

   public void method5092(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.aFloatArray4841[0] = 2.0F / (var2 - var1);
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = 2.0F / (var4 - var3);
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = 2.0F / (var6 - var5);
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = -(var2 + var1) / (var2 - var1);
      this.aFloatArray4841[13] = -(var4 + var3) / (var4 - var3);
      this.aFloatArray4841[14] = -(var6 + var5) / (var6 - var5);
      this.aFloatArray4841[15] = 1.0F;
   }

   public void method5093(float var1, float var2, float var3, float var4) {
      float var5 = (float)(Math.tan((double)(var3 / 2.0F)) * (double)var1);
      float var6 = (float)(Math.tan((double)(var4 / 2.0F)) * (double)var1);
      this.method5095(-var5, var5, -var6, var6, var1, var2);
   }

   public float[] method5094(float[] var1) {
      System.arraycopy(this.aFloatArray4841, 0, var1, 0, 16);
      return var1;
   }

   void method5095(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.aFloatArray4841[0] = 2.0F * var5 / (var2 - var1);
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = 2.0F * var5 / (var4 - var3);
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = (var2 + var1) / (var2 - var1);
      this.aFloatArray4841[9] = (var4 + var3) / (var4 - var3);
      this.aFloatArray4841[10] = (var6 + var5) / (var6 - var5);
      this.aFloatArray4841[11] = 1.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = -(2.0F * var6 * var5) / (var6 - var5);
      this.aFloatArray4841[15] = 0.0F;
   }

   public void method5096(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.aFloatArray4841[0] = var3 * 2.0F / var7;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = var4 * 2.0F / var8;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 2.0F * var1 / var7 - 1.0F;
      this.aFloatArray4841[9] = 2.0F * var2 / var8 - 1.0F;
      this.aFloatArray4841[10] = (var6 + var5) / (var6 - var5);
      this.aFloatArray4841[11] = 1.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 2.0F * var6 * var5 / (var5 - var6);
      this.aFloatArray4841[15] = 0.0F;
   }

   public void method5097(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.method5092(-(var1 * var9) / var3, var9 * (var7 - var1) / var3, -(var2 * var9) / var4, var9 * (var8 - var2) / var4, var5, var6);
   }

   public float method5098() {
      return -(this.aFloatArray4841[15] + this.aFloatArray4841[14]) / (this.aFloatArray4841[11] + this.aFloatArray4841[10]);
   }

   public float method5099() {
      return (this.aFloatArray4841[14] - this.aFloatArray4841[15]) / (this.aFloatArray4841[11] - this.aFloatArray4841[10]);
   }

   public float[] method5100(float[] var1) {
      float var2 = this.aFloatArray4841[3] + this.aFloatArray4841[0];
      float var3 = this.aFloatArray4841[7] + this.aFloatArray4841[4];
      float var4 = this.aFloatArray4841[11] + this.aFloatArray4841[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] + this.aFloatArray4841[12]) / var5);
      return var1;
   }

   public float[] method5101(float[] var1) {
      float var2 = this.aFloatArray4841[3] - this.aFloatArray4841[0];
      float var3 = this.aFloatArray4841[7] - this.aFloatArray4841[4];
      float var4 = this.aFloatArray4841[11] - this.aFloatArray4841[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] - this.aFloatArray4841[12]) / var5);
      return var1;
   }

   public float[] method5102(float[] var1) {
      float var2 = this.aFloatArray4841[3] + this.aFloatArray4841[1];
      float var3 = this.aFloatArray4841[7] + this.aFloatArray4841[5];
      float var4 = this.aFloatArray4841[11] + this.aFloatArray4841[9];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] + this.aFloatArray4841[13]) / var5);
      return var1;
   }

   public float[] method5103(float[] var1) {
      float var2 = this.aFloatArray4841[3] - this.aFloatArray4841[1];
      float var3 = this.aFloatArray4841[7] - this.aFloatArray4841[5];
      float var4 = this.aFloatArray4841[11] - this.aFloatArray4841[9];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] - this.aFloatArray4841[13]) / var5);
      return var1;
   }

   public void method5104() {
      this.aFloatArray4841[0] = 1.0F;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = 1.0F;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = 1.0F;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = 1.0F;
   }

   public void method5105() {
      float var1 = 1.0F / this.method5140();
      float var2 = (this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[13]) * var1;
      float var3 = (-this.aFloatArray4841[1] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[2] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[3] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[10] * this.aFloatArray4841[13]) * var1;
      float var4 = (this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[14] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[13]) * var1;
      float var5 = (-this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[11] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[10] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[11] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[9] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[10] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[9]) * var1;
      float var6 = (-this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[12]) * var1;
      float var7 = (this.aFloatArray4841[0] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[2] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[3] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[10] * this.aFloatArray4841[12]) * var1;
      float var8 = (-this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[14] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[12]) * var1;
      float var9 = (this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[11] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[10] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[11] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[8] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[10] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[8]) * var1;
      float var10 = (this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var11 = (-this.aFloatArray4841[0] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[1] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var12 = (this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[12] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[13] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[12]) * var1;
      float var13 = (-this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[11] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[9] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[11] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[8] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[9] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[8]) * var1;
      float var14 = (-this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[13] + this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[12] - this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var15 = (this.aFloatArray4841[0] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[0] * this.aFloatArray4841[10] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[1] * this.aFloatArray4841[10] * this.aFloatArray4841[12] + this.aFloatArray4841[2] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[2] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var16 = (-this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[14] + this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[13] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[14] - this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[12] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[13] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[12]) * var1;
      float var17 = (this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[10] - this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[9] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[10] + this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[8] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[9] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[8]) * var1;
      this.aFloatArray4841[0] = var2;
      this.aFloatArray4841[1] = var3;
      this.aFloatArray4841[2] = var4;
      this.aFloatArray4841[3] = var5;
      this.aFloatArray4841[4] = var6;
      this.aFloatArray4841[5] = var7;
      this.aFloatArray4841[6] = var8;
      this.aFloatArray4841[7] = var9;
      this.aFloatArray4841[8] = var10;
      this.aFloatArray4841[9] = var11;
      this.aFloatArray4841[10] = var12;
      this.aFloatArray4841[11] = var13;
      this.aFloatArray4841[12] = var14;
      this.aFloatArray4841[13] = var15;
      this.aFloatArray4841[14] = var16;
      this.aFloatArray4841[15] = var17;
   }

   public void method5106() {
      float var1 = this.aFloatArray4841[0];
      float var2 = this.aFloatArray4841[4];
      float var3 = this.aFloatArray4841[8];
      float var4 = this.aFloatArray4841[12];
      float var5 = this.aFloatArray4841[1];
      float var6 = this.aFloatArray4841[5];
      float var7 = this.aFloatArray4841[9];
      float var8 = this.aFloatArray4841[13];
      float var9 = this.aFloatArray4841[2];
      float var10 = this.aFloatArray4841[6];
      float var11 = this.aFloatArray4841[10];
      float var12 = this.aFloatArray4841[14];
      float var13 = this.aFloatArray4841[3];
      float var14 = this.aFloatArray4841[7];
      float var15 = this.aFloatArray4841[11];
      float var16 = this.aFloatArray4841[15];
      this.aFloatArray4841[0] = var1;
      this.aFloatArray4841[1] = var2;
      this.aFloatArray4841[2] = var3;
      this.aFloatArray4841[3] = var4;
      this.aFloatArray4841[4] = var5;
      this.aFloatArray4841[5] = var6;
      this.aFloatArray4841[6] = var7;
      this.aFloatArray4841[7] = var8;
      this.aFloatArray4841[8] = var9;
      this.aFloatArray4841[9] = var10;
      this.aFloatArray4841[10] = var11;
      this.aFloatArray4841[11] = var12;
      this.aFloatArray4841[12] = var13;
      this.aFloatArray4841[13] = var14;
      this.aFloatArray4841[14] = var15;
      this.aFloatArray4841[15] = var16;
   }

   public float[] method5107(float[] var1) {
      System.arraycopy(this.aFloatArray4841, 0, var1, 0, 16);
      return var1;
   }

   public float[] method5108(float[] var1) {
      System.arraycopy(this.aFloatArray4841, 0, var1, 0, 16);
      var1[3] = 0.0F;
      var1[7] = 0.0F;
      var1[11] = 0.0F;
      var1[12] = 0.0F;
      var1[13] = 0.0F;
      var1[14] = 0.0F;
      var1[15] = 1.0F;
      return var1;
   }

   public float[] method5109(float[] var1) {
      var1[0] = this.aFloatArray4841[0];
      var1[1] = this.aFloatArray4841[1];
      var1[2] = this.aFloatArray4841[2];
      var1[3] = this.aFloatArray4841[4];
      var1[4] = this.aFloatArray4841[5];
      var1[5] = this.aFloatArray4841[6];
      var1[6] = this.aFloatArray4841[8];
      var1[7] = this.aFloatArray4841[9];
      var1[8] = this.aFloatArray4841[10];
      return var1;
   }

   public void method5110(Class445 var1) {
      this.aFloatArray4841[0] = var1.aFloat4902;
      this.aFloatArray4841[1] = var1.aFloat4911;
      this.aFloatArray4841[2] = var1.aFloat4904;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = var1.aFloat4901;
      this.aFloatArray4841[5] = var1.aFloat4906;
      this.aFloatArray4841[6] = var1.aFloat4907;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = var1.aFloat4908;
      this.aFloatArray4841[9] = var1.aFloat4909;
      this.aFloatArray4841[10] = var1.aFloat4905;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = var1.aFloat4910;
      this.aFloatArray4841[13] = var1.aFloat4912;
      this.aFloatArray4841[14] = var1.aFloat4913;
      this.aFloatArray4841[15] = 1.0F;
   }

   public float[] method5111(float[] var1) {
      var1[0] = this.aFloatArray4841[0];
      var1[1] = this.aFloatArray4841[1];
      var1[2] = this.aFloatArray4841[4];
      var1[3] = this.aFloatArray4841[5];
      var1[4] = this.aFloatArray4841[8];
      var1[5] = this.aFloatArray4841[9];
      var1[6] = this.aFloatArray4841[12];
      var1[7] = this.aFloatArray4841[13];
      return var1;
   }

   public float[] method5112(float[] var1) {
      var1[0] = this.aFloatArray4841[0];
      var1[1] = this.aFloatArray4841[4];
      var1[2] = this.aFloatArray4841[8];
      var1[3] = this.aFloatArray4841[12];
      var1[4] = this.aFloatArray4841[1];
      var1[5] = this.aFloatArray4841[5];
      var1[6] = this.aFloatArray4841[9];
      var1[7] = this.aFloatArray4841[13];
      return var1;
   }

   public float[] method5113(float[] var1) {
      var1[0] = this.aFloatArray4841[0];
      var1[1] = this.aFloatArray4841[1];
      var1[2] = 0.0F;
      var1[3] = 0.0F;
      var1[4] = this.aFloatArray4841[4];
      var1[5] = this.aFloatArray4841[5];
      var1[6] = 0.0F;
      var1[7] = 0.0F;
      var1[8] = this.aFloatArray4841[12];
      var1[9] = this.aFloatArray4841[13];
      var1[10] = this.aFloatArray4841[14];
      var1[11] = 0.0F;
      var1[12] = 0.0F;
      var1[13] = 0.0F;
      var1[14] = 0.0F;
      var1[15] = 1.0F;
      return var1;
   }

   public void method5114(int var1, int var2, int var3, float var4, float var5, float var6) {
      float[] var9;
      float[] var10;
      float[] var11;
      float[] var12;
      float[] var13;
      if(var1 != 0) {
         float var7 = Class435.aFloatArray4848[var1 & 16383];
         float var8 = Class435.aFloatArray4849[var1 & 16383];
         this.aFloatArray4841[0] = var7 * (float)var2;
         this.aFloatArray4841[5] = var7 * (float)var3;
         this.aFloatArray4841[1] = var8 * (float)var2;
         this.aFloatArray4841[4] = -var8 * (float)var3;
         this.aFloatArray4841[10] = 1.0F;
         var9 = this.aFloatArray4841;
         var10 = this.aFloatArray4841;
         var11 = this.aFloatArray4841;
         this.aFloatArray4841[9] = 0.0F;
         var11[8] = 0.0F;
         var10[6] = 0.0F;
         var9[2] = 0.0F;
      } else {
         this.aFloatArray4841[0] = (float)var2;
         this.aFloatArray4841[5] = (float)var3;
         this.aFloatArray4841[10] = 1.0F;
         var12 = this.aFloatArray4841;
         var13 = this.aFloatArray4841;
         var9 = this.aFloatArray4841;
         var10 = this.aFloatArray4841;
         var11 = this.aFloatArray4841;
         this.aFloatArray4841[9] = 0.0F;
         var11[8] = 0.0F;
         var10[6] = 0.0F;
         var9[4] = 0.0F;
         var13[2] = 0.0F;
         var12[1] = 0.0F;
      }

      var12 = this.aFloatArray4841;
      var13 = this.aFloatArray4841;
      this.aFloatArray4841[11] = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.aFloatArray4841[15] = 1.0F;
      this.aFloatArray4841[12] = var4;
      this.aFloatArray4841[13] = var5;
      this.aFloatArray4841[14] = var6;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof Class433)) {
         return false;
      } else {
         Class433 var2 = (Class433)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if(this.aFloatArray4841[var3] != var2.aFloatArray4841[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public void method5115() {
      this.aFloatArray4841[0] = 1.0F;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = 1.0F;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = 1.0F;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = 1.0F;
   }

   public boolean method5116() {
      return this.aFloatArray4841[0] == 1.0F && this.aFloatArray4841[1] == 0.0F && this.aFloatArray4841[2] == 0.0F && this.aFloatArray4841[3] == 0.0F && this.aFloatArray4841[4] == 0.0F && this.aFloatArray4841[5] == 1.0F && this.aFloatArray4841[6] == 0.0F && this.aFloatArray4841[7] == 0.0F && this.aFloatArray4841[8] == 0.0F && this.aFloatArray4841[9] == 0.0F && this.aFloatArray4841[10] == 1.0F && this.aFloatArray4841[11] == 0.0F && this.aFloatArray4841[12] == 0.0F && this.aFloatArray4841[13] == 0.0F && this.aFloatArray4841[14] == 0.0F && this.aFloatArray4841[15] == 1.0F;
   }

   public void method5117() {
      this.aFloatArray4841[0] = 1.0F;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = 1.0F;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = 1.0F;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = 1.0F;
   }

   public void method5118(Class433 var1, Class433 var2) {
      float var3 = var1.aFloatArray4841[0] * var2.aFloatArray4841[0] + var1.aFloatArray4841[1] * var2.aFloatArray4841[4] + var1.aFloatArray4841[2] * var2.aFloatArray4841[8] + var1.aFloatArray4841[3] * var2.aFloatArray4841[12];
      float var4 = var1.aFloatArray4841[0] * var2.aFloatArray4841[1] + var1.aFloatArray4841[1] * var2.aFloatArray4841[5] + var1.aFloatArray4841[2] * var2.aFloatArray4841[9] + var1.aFloatArray4841[3] * var2.aFloatArray4841[13];
      float var5 = var1.aFloatArray4841[0] * var2.aFloatArray4841[2] + var1.aFloatArray4841[1] * var2.aFloatArray4841[6] + var1.aFloatArray4841[2] * var2.aFloatArray4841[10] + var1.aFloatArray4841[3] * var2.aFloatArray4841[14];
      float var6 = var1.aFloatArray4841[0] * var2.aFloatArray4841[3] + var1.aFloatArray4841[1] * var2.aFloatArray4841[7] + var1.aFloatArray4841[2] * var2.aFloatArray4841[11] + var1.aFloatArray4841[3] * var2.aFloatArray4841[15];
      float var7 = var1.aFloatArray4841[4] * var2.aFloatArray4841[0] + var1.aFloatArray4841[5] * var2.aFloatArray4841[4] + var1.aFloatArray4841[6] * var2.aFloatArray4841[8] + var1.aFloatArray4841[7] * var2.aFloatArray4841[12];
      float var8 = var1.aFloatArray4841[4] * var2.aFloatArray4841[1] + var1.aFloatArray4841[5] * var2.aFloatArray4841[5] + var1.aFloatArray4841[6] * var2.aFloatArray4841[9] + var1.aFloatArray4841[7] * var2.aFloatArray4841[13];
      float var9 = var1.aFloatArray4841[4] * var2.aFloatArray4841[2] + var1.aFloatArray4841[5] * var2.aFloatArray4841[6] + var1.aFloatArray4841[6] * var2.aFloatArray4841[10] + var1.aFloatArray4841[7] * var2.aFloatArray4841[14];
      float var10 = var1.aFloatArray4841[4] * var2.aFloatArray4841[3] + var1.aFloatArray4841[5] * var2.aFloatArray4841[7] + var1.aFloatArray4841[6] * var2.aFloatArray4841[11] + var1.aFloatArray4841[7] * var2.aFloatArray4841[15];
      float var11 = var1.aFloatArray4841[8] * var2.aFloatArray4841[0] + var1.aFloatArray4841[9] * var2.aFloatArray4841[4] + var1.aFloatArray4841[10] * var2.aFloatArray4841[8] + var1.aFloatArray4841[11] * var2.aFloatArray4841[12];
      float var12 = var1.aFloatArray4841[8] * var2.aFloatArray4841[1] + var1.aFloatArray4841[9] * var2.aFloatArray4841[5] + var1.aFloatArray4841[10] * var2.aFloatArray4841[9] + var1.aFloatArray4841[11] * var2.aFloatArray4841[13];
      float var13 = var1.aFloatArray4841[8] * var2.aFloatArray4841[2] + var1.aFloatArray4841[9] * var2.aFloatArray4841[6] + var1.aFloatArray4841[10] * var2.aFloatArray4841[10] + var1.aFloatArray4841[11] * var2.aFloatArray4841[14];
      float var14 = var1.aFloatArray4841[8] * var2.aFloatArray4841[3] + var1.aFloatArray4841[9] * var2.aFloatArray4841[7] + var1.aFloatArray4841[10] * var2.aFloatArray4841[11] + var1.aFloatArray4841[11] * var2.aFloatArray4841[15];
      float var15 = var1.aFloatArray4841[12] * var2.aFloatArray4841[0] + var1.aFloatArray4841[13] * var2.aFloatArray4841[4] + var1.aFloatArray4841[14] * var2.aFloatArray4841[8] + var1.aFloatArray4841[15] * var2.aFloatArray4841[12];
      float var16 = var1.aFloatArray4841[12] * var2.aFloatArray4841[1] + var1.aFloatArray4841[13] * var2.aFloatArray4841[5] + var1.aFloatArray4841[14] * var2.aFloatArray4841[9] + var1.aFloatArray4841[15] * var2.aFloatArray4841[13];
      float var17 = var1.aFloatArray4841[12] * var2.aFloatArray4841[2] + var1.aFloatArray4841[13] * var2.aFloatArray4841[6] + var1.aFloatArray4841[14] * var2.aFloatArray4841[10] + var1.aFloatArray4841[15] * var2.aFloatArray4841[14];
      float var18 = var1.aFloatArray4841[12] * var2.aFloatArray4841[3] + var1.aFloatArray4841[13] * var2.aFloatArray4841[7] + var1.aFloatArray4841[14] * var2.aFloatArray4841[11] + var1.aFloatArray4841[15] * var2.aFloatArray4841[15];
      this.aFloatArray4841[0] = var3;
      this.aFloatArray4841[1] = var4;
      this.aFloatArray4841[2] = var5;
      this.aFloatArray4841[3] = var6;
      this.aFloatArray4841[4] = var7;
      this.aFloatArray4841[5] = var8;
      this.aFloatArray4841[6] = var9;
      this.aFloatArray4841[7] = var10;
      this.aFloatArray4841[8] = var11;
      this.aFloatArray4841[9] = var12;
      this.aFloatArray4841[10] = var13;
      this.aFloatArray4841[11] = var14;
      this.aFloatArray4841[12] = var15;
      this.aFloatArray4841[13] = var16;
      this.aFloatArray4841[14] = var17;
      this.aFloatArray4841[15] = var18;
   }

   public String method5119() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if(var3 > 0) {
               var1.append("\t");
            }

            var1.append(this.aFloatArray4841[var2 * 4 + var3]);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public boolean method5120(Object var1) {
      if(!(var1 instanceof Class433)) {
         return false;
      } else {
         Class433 var2 = (Class433)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if(this.aFloatArray4841[var3] != var2.aFloatArray4841[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method5121(Object var1) {
      if(!(var1 instanceof Class433)) {
         return false;
      } else {
         Class433 var2 = (Class433)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if(this.aFloatArray4841[var3] != var2.aFloatArray4841[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public Class433() {
      this.method5104();
   }

   public void method5122() {
      this.aFloatArray4841[0] = 1.0F;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = 1.0F;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = 1.0F;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = 1.0F;
   }

   public float method5123() {
      return -(this.aFloatArray4841[15] + this.aFloatArray4841[14]) / (this.aFloatArray4841[11] + this.aFloatArray4841[10]);
   }

   public void method5124() {
      float var1 = 1.0F / this.method5140();
      float var2 = (this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[13]) * var1;
      float var3 = (-this.aFloatArray4841[1] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[2] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[3] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[10] * this.aFloatArray4841[13]) * var1;
      float var4 = (this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[14] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[13]) * var1;
      float var5 = (-this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[11] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[10] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[11] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[9] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[10] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[9]) * var1;
      float var6 = (-this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[12]) * var1;
      float var7 = (this.aFloatArray4841[0] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[2] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[3] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[10] * this.aFloatArray4841[12]) * var1;
      float var8 = (-this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[14] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[12]) * var1;
      float var9 = (this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[11] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[10] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[11] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[8] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[10] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[8]) * var1;
      float var10 = (this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var11 = (-this.aFloatArray4841[0] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[1] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var12 = (this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[12] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[13] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[12]) * var1;
      float var13 = (-this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[11] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[9] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[11] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[8] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[9] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[8]) * var1;
      float var14 = (-this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[13] + this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[12] - this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var15 = (this.aFloatArray4841[0] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[0] * this.aFloatArray4841[10] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[1] * this.aFloatArray4841[10] * this.aFloatArray4841[12] + this.aFloatArray4841[2] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[2] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var16 = (-this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[14] + this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[13] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[14] - this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[12] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[13] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[12]) * var1;
      float var17 = (this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[10] - this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[9] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[10] + this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[8] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[9] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[8]) * var1;
      this.aFloatArray4841[0] = var2;
      this.aFloatArray4841[1] = var3;
      this.aFloatArray4841[2] = var4;
      this.aFloatArray4841[3] = var5;
      this.aFloatArray4841[4] = var6;
      this.aFloatArray4841[5] = var7;
      this.aFloatArray4841[6] = var8;
      this.aFloatArray4841[7] = var9;
      this.aFloatArray4841[8] = var10;
      this.aFloatArray4841[9] = var11;
      this.aFloatArray4841[10] = var12;
      this.aFloatArray4841[11] = var13;
      this.aFloatArray4841[12] = var14;
      this.aFloatArray4841[13] = var15;
      this.aFloatArray4841[14] = var16;
      this.aFloatArray4841[15] = var17;
   }

   public void method5125() {
      float var1 = 1.0F / this.method5140();
      float var2 = (this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[13]) * var1;
      float var3 = (-this.aFloatArray4841[1] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[2] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[3] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[10] * this.aFloatArray4841[13]) * var1;
      float var4 = (this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[14] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[13]) * var1;
      float var5 = (-this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[11] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[10] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[11] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[9] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[10] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[9]) * var1;
      float var6 = (-this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[12]) * var1;
      float var7 = (this.aFloatArray4841[0] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[2] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[3] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[10] * this.aFloatArray4841[12]) * var1;
      float var8 = (-this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[14] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[12]) * var1;
      float var9 = (this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[11] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[10] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[11] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[8] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[10] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[8]) * var1;
      float var10 = (this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var11 = (-this.aFloatArray4841[0] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[1] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var12 = (this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[12] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[13] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[12]) * var1;
      float var13 = (-this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[11] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[9] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[11] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[8] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[9] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[8]) * var1;
      float var14 = (-this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[13] + this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[12] - this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var15 = (this.aFloatArray4841[0] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[0] * this.aFloatArray4841[10] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[1] * this.aFloatArray4841[10] * this.aFloatArray4841[12] + this.aFloatArray4841[2] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[2] * this.aFloatArray4841[9] * this.aFloatArray4841[12]) * var1;
      float var16 = (-this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[14] + this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[13] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[14] - this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[12] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[13] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[12]) * var1;
      float var17 = (this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[10] - this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[9] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[10] + this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[8] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[9] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[8]) * var1;
      this.aFloatArray4841[0] = var2;
      this.aFloatArray4841[1] = var3;
      this.aFloatArray4841[2] = var4;
      this.aFloatArray4841[3] = var5;
      this.aFloatArray4841[4] = var6;
      this.aFloatArray4841[5] = var7;
      this.aFloatArray4841[6] = var8;
      this.aFloatArray4841[7] = var9;
      this.aFloatArray4841[8] = var10;
      this.aFloatArray4841[9] = var11;
      this.aFloatArray4841[10] = var12;
      this.aFloatArray4841[11] = var13;
      this.aFloatArray4841[12] = var14;
      this.aFloatArray4841[13] = var15;
      this.aFloatArray4841[14] = var16;
      this.aFloatArray4841[15] = var17;
   }

   public boolean method5126() {
      return this.aFloatArray4841[0] == 1.0F && this.aFloatArray4841[1] == 0.0F && this.aFloatArray4841[2] == 0.0F && this.aFloatArray4841[3] == 0.0F && this.aFloatArray4841[4] == 0.0F && this.aFloatArray4841[5] == 1.0F && this.aFloatArray4841[6] == 0.0F && this.aFloatArray4841[7] == 0.0F && this.aFloatArray4841[8] == 0.0F && this.aFloatArray4841[9] == 0.0F && this.aFloatArray4841[10] == 1.0F && this.aFloatArray4841[11] == 0.0F && this.aFloatArray4841[12] == 0.0F && this.aFloatArray4841[13] == 0.0F && this.aFloatArray4841[14] == 0.0F && this.aFloatArray4841[15] == 1.0F;
   }

   public void method5127(float var1, float var2, float var3, float var4) {
      this.aFloatArray4841[0] = var1;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = var2;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = var3;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = var4;
   }

   public void method5128(float var1, float var2, float var3, float var4) {
      this.aFloatArray4841[0] = var1;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = var2;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = var3;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = var4;
   }

   float method5129() {
      return this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[12] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[12];
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < 4; ++var2) {
         for(int var3 = 0; var3 < 4; ++var3) {
            if(var3 > 0) {
               var1.append("\t");
            }

            var1.append(this.aFloatArray4841[var2 * 4 + var3]);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   public void method5130(float var1, float var2, float var3) {
      this.method5092(-10000.0F / var3, 10000.0F / var3, -10000.0F / var3, 10000.0F / var3, var1, var2);
   }

   public float[] method5131(float[] var1) {
      float var2 = this.aFloatArray4841[3] - this.aFloatArray4841[2];
      float var3 = this.aFloatArray4841[7] - this.aFloatArray4841[6];
      float var4 = this.aFloatArray4841[11] - this.aFloatArray4841[10];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] - this.aFloatArray4841[14]) / var5);
      return var1;
   }

   public float[] method5132(float[] var1) {
      float var2 = this.aFloatArray4841[3] + this.aFloatArray4841[0];
      float var3 = this.aFloatArray4841[7] + this.aFloatArray4841[4];
      float var4 = this.aFloatArray4841[11] + this.aFloatArray4841[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] + this.aFloatArray4841[12]) / var5);
      return var1;
   }

   public float method5133() {
      return -(this.aFloatArray4841[15] + this.aFloatArray4841[14]) / (this.aFloatArray4841[11] + this.aFloatArray4841[10]);
   }

   public float method5134() {
      return (this.aFloatArray4841[14] - this.aFloatArray4841[15]) / (this.aFloatArray4841[11] - this.aFloatArray4841[10]);
   }

   public float method5135() {
      return (this.aFloatArray4841[14] - this.aFloatArray4841[15]) / (this.aFloatArray4841[11] - this.aFloatArray4841[10]);
   }

   public float[] method5136(float[] var1) {
      float var2 = this.aFloatArray4841[3] + this.aFloatArray4841[0];
      float var3 = this.aFloatArray4841[7] + this.aFloatArray4841[4];
      float var4 = this.aFloatArray4841[11] + this.aFloatArray4841[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] + this.aFloatArray4841[12]) / var5);
      return var1;
   }

   public float[] method5137(float[] var1) {
      float var2 = this.aFloatArray4841[3] - this.aFloatArray4841[0];
      float var3 = this.aFloatArray4841[7] - this.aFloatArray4841[4];
      float var4 = this.aFloatArray4841[11] - this.aFloatArray4841[8];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] - this.aFloatArray4841[12]) / var5);
      return var1;
   }

   public float[] method5138(float[] var1) {
      float var2 = this.aFloatArray4841[3] - this.aFloatArray4841[1];
      float var3 = this.aFloatArray4841[7] - this.aFloatArray4841[5];
      float var4 = this.aFloatArray4841[11] - this.aFloatArray4841[9];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] - this.aFloatArray4841[13]) / var5);
      return var1;
   }

   public float[] method5139(float[] var1) {
      float var2 = this.aFloatArray4841[3] + this.aFloatArray4841[2];
      float var3 = this.aFloatArray4841[7] + this.aFloatArray4841[6];
      float var4 = this.aFloatArray4841[11] + this.aFloatArray4841[10];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] + this.aFloatArray4841[14]) / var5);
      return var1;
   }

   float method5140() {
      return this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[15] - this.aFloatArray4841[0] * this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[14] - this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[15] + this.aFloatArray4841[0] * this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[13] + this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[14] - this.aFloatArray4841[0] * this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[13] - this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[15] + this.aFloatArray4841[1] * this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[14] + this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[15] - this.aFloatArray4841[1] * this.aFloatArray4841[6] * this.aFloatArray4841[11] * this.aFloatArray4841[12] - this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[14] + this.aFloatArray4841[1] * this.aFloatArray4841[7] * this.aFloatArray4841[10] * this.aFloatArray4841[12] + this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[15] - this.aFloatArray4841[2] * this.aFloatArray4841[4] * this.aFloatArray4841[11] * this.aFloatArray4841[13] - this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[15] + this.aFloatArray4841[2] * this.aFloatArray4841[5] * this.aFloatArray4841[11] * this.aFloatArray4841[12] + this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[8] * this.aFloatArray4841[13] - this.aFloatArray4841[2] * this.aFloatArray4841[7] * this.aFloatArray4841[9] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[9] * this.aFloatArray4841[14] + this.aFloatArray4841[3] * this.aFloatArray4841[4] * this.aFloatArray4841[10] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[8] * this.aFloatArray4841[14] - this.aFloatArray4841[3] * this.aFloatArray4841[5] * this.aFloatArray4841[10] * this.aFloatArray4841[12] - this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[8] * this.aFloatArray4841[13] + this.aFloatArray4841[3] * this.aFloatArray4841[6] * this.aFloatArray4841[9] * this.aFloatArray4841[12];
   }

   public void method5141(float var1, float var2, float var3, float var4) {
      this.aFloatArray4841[0] = var1;
      this.aFloatArray4841[1] = 0.0F;
      this.aFloatArray4841[2] = 0.0F;
      this.aFloatArray4841[3] = 0.0F;
      this.aFloatArray4841[4] = 0.0F;
      this.aFloatArray4841[5] = var2;
      this.aFloatArray4841[6] = 0.0F;
      this.aFloatArray4841[7] = 0.0F;
      this.aFloatArray4841[8] = 0.0F;
      this.aFloatArray4841[9] = 0.0F;
      this.aFloatArray4841[10] = var3;
      this.aFloatArray4841[11] = 0.0F;
      this.aFloatArray4841[12] = 0.0F;
      this.aFloatArray4841[13] = 0.0F;
      this.aFloatArray4841[14] = 0.0F;
      this.aFloatArray4841[15] = var4;
   }

   public float[] method5142(float[] var1) {
      float var2 = this.aFloatArray4841[3] + this.aFloatArray4841[2];
      float var3 = this.aFloatArray4841[7] + this.aFloatArray4841[6];
      float var4 = this.aFloatArray4841[11] + this.aFloatArray4841[10];
      double var5 = Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = (float)((double)var2 / var5);
      var1[1] = (float)((double)var3 / var5);
      var1[2] = (float)((double)var4 / var5);
      var1[3] = (float)((double)(this.aFloatArray4841[15] + this.aFloatArray4841[14]) / var5);
      return var1;
   }

   public boolean method5143(Object var1) {
      if(!(var1 instanceof Class433)) {
         return false;
      } else {
         Class433 var2 = (Class433)var1;

         for(int var3 = 0; var3 < 16; ++var3) {
            if(this.aFloatArray4841[var3] != var2.aFloatArray4841[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   public int hashCode() {
      byte var1 = 1;
      int var2 = 31 * var1 + Arrays.hashCode(this.aFloatArray4841);
      return var2;
   }
}
