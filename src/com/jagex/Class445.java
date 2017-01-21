package com.jagex;

import com.jagex.Class430;
import com.jagex.Class435;
import com.jagex.Class440;
import com.jagex.Class446;

public class Class445 {
   float aFloat4902;
   float aFloat4901;
   float aFloat4908;
   float aFloat4904;
   float aFloat4907;
   float aFloat4905;
   float aFloat4911;
   float aFloat4906;
   float aFloat4909;
   float aFloat4910;
   float aFloat4912;
   float aFloat4913;
   public static Class445 aClass445_4903 = new Class445();

   public Class445(Class445 var1) {
      this.method5242(var1);
   }

   public void method5217(double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15) {
      float var16 = (float)(var7 - var1);
      float var17 = (float)(var9 - var3);
      float var18 = (float)(var11 - var5);
      float var19 = var14 * var18 - var15 * var17;
      float var20 = var15 * var16 - var13 * var18;
      float var21 = var13 * var17 - var14 * var16;
      float var22 = (float)(1.0D / Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21)));
      float var23 = (float)(1.0D / Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18)));
      this.aFloat4902 = var19 * var22;
      this.aFloat4901 = var20 * var22;
      this.aFloat4908 = var21 * var22;
      this.aFloat4904 = var16 * var23;
      this.aFloat4907 = var17 * var23;
      this.aFloat4905 = var18 * var23;
      this.aFloat4911 = this.aFloat4907 * this.aFloat4908 - this.aFloat4905 * this.aFloat4901;
      this.aFloat4906 = this.aFloat4905 * this.aFloat4902 - this.aFloat4904 * this.aFloat4908;
      this.aFloat4909 = this.aFloat4904 * this.aFloat4901 - this.aFloat4907 * this.aFloat4902;
      this.aFloat4910 = -((float)(var1 * (double)this.aFloat4902 + var3 * (double)this.aFloat4901 + var5 * (double)this.aFloat4908));
      this.aFloat4912 = -((float)(var1 * (double)this.aFloat4911 + var3 * (double)this.aFloat4906 + var5 * (double)this.aFloat4909));
      this.aFloat4913 = -((float)(var1 * (double)this.aFloat4904 + var3 * (double)this.aFloat4907 + var5 * (double)this.aFloat4905));
   }

   public void method5218(Class430 var1) {
      float var2 = var1.aClass440_4817.aFloat4872 * var1.aClass440_4817.aFloat4872;
      float var3 = var1.aClass440_4817.aFloat4872 * var1.aClass440_4817.aFloat4871;
      float var4 = var1.aClass440_4817.aFloat4872 * var1.aClass440_4817.aFloat4868;
      float var5 = var1.aClass440_4817.aFloat4872 * var1.aClass440_4817.aFloat4873;
      float var6 = var1.aClass440_4817.aFloat4871 * var1.aClass440_4817.aFloat4871;
      float var7 = var1.aClass440_4817.aFloat4871 * var1.aClass440_4817.aFloat4868;
      float var8 = var1.aClass440_4817.aFloat4871 * var1.aClass440_4817.aFloat4873;
      float var9 = var1.aClass440_4817.aFloat4868 * var1.aClass440_4817.aFloat4868;
      float var10 = var1.aClass440_4817.aFloat4868 * var1.aClass440_4817.aFloat4873;
      float var11 = var1.aClass440_4817.aFloat4873 * var1.aClass440_4817.aFloat4873;
      this.aFloat4902 = var6 + var2 - var11 - var9;
      this.aFloat4911 = var7 + var5 + var7 + var5;
      this.aFloat4904 = var8 - var4 - var4 + var8;
      this.aFloat4901 = var7 - var5 - var5 + var7;
      this.aFloat4906 = var9 + var2 - var6 - var11;
      this.aFloat4907 = var10 + var3 + var10 + var3;
      this.aFloat4908 = var8 + var4 + var8 + var4;
      this.aFloat4909 = var10 - var3 - var3 + var10;
      this.aFloat4905 = var11 + var2 - var9 - var6;
      this.aFloat4910 = var1.aClass446_4816.aFloat4917;
      this.aFloat4912 = var1.aClass446_4816.aFloat4915;
      this.aFloat4913 = var1.aClass446_4816.aFloat4919;
   }

   public void method5219() {
      this.aFloat4913 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4910 = 0.0F;
      this.aFloat4909 = 0.0F;
      this.aFloat4908 = 0.0F;
      this.aFloat4907 = 0.0F;
      this.aFloat4901 = 0.0F;
      this.aFloat4904 = 0.0F;
      this.aFloat4911 = 0.0F;
      this.aFloat4905 = 1.0F;
      this.aFloat4906 = 1.0F;
      this.aFloat4902 = 1.0F;
   }

   public float[] method5220(float[] var1) {
      var1[0] = this.aFloat4910;
      var1[1] = this.aFloat4912;
      var1[2] = this.aFloat4913;
      return var1;
   }

   public void method5221(int var1, int var2, int var3, float var4, float var5, float var6) {
      if(var1 != 0) {
         float var7 = Class435.aFloatArray4848[var1 & 16383];
         float var8 = Class435.aFloatArray4849[var1 & 16383];
         this.aFloat4905 = 1.0F;
         this.aFloat4909 = 0.0F;
         this.aFloat4908 = 0.0F;
         this.aFloat4907 = 0.0F;
         this.aFloat4904 = 0.0F;
         this.aFloat4902 = 2.0F * var7 * (float)var2;
         this.aFloat4906 = 2.0F * var7 * (float)var3;
         this.aFloat4911 = 2.0F * var8 * (float)var2;
         this.aFloat4901 = -2.0F * var8 * (float)var3;
         this.aFloat4910 = (float)(2 * var2) * (0.5F * var8 - 0.5F * var7) + var4;
         this.aFloat4912 = (float)(2 * var3) * (-0.5F * var8 - 0.5F * var7) + var5;
         this.aFloat4913 = var6;
      } else {
         this.aFloat4909 = 0.0F;
         this.aFloat4908 = 0.0F;
         this.aFloat4907 = 0.0F;
         this.aFloat4901 = 0.0F;
         this.aFloat4904 = 0.0F;
         this.aFloat4911 = 0.0F;
         this.aFloat4902 = (float)(2 * var2);
         this.aFloat4906 = (float)(2 * var3);
         this.aFloat4905 = 1.0F;
         this.aFloat4910 = var4 - (float)var2;
         this.aFloat4912 = var5 - (float)var3;
         this.aFloat4913 = var6;
      }

   }

   public float[] method5222(float[] var1) {
      var1[0] = this.aFloat4902;
      var1[1] = this.aFloat4911;
      var1[2] = this.aFloat4904;
      var1[3] = this.aFloat4901;
      var1[4] = this.aFloat4906;
      var1[5] = this.aFloat4907;
      var1[6] = this.aFloat4908;
      var1[7] = this.aFloat4909;
      var1[8] = this.aFloat4905;
      return var1;
   }

   public void method5223(Class445 var1) {
      if(var1 == this) {
         this.method5224();
      } else {
         this.aFloat4902 = var1.aFloat4902;
         this.aFloat4901 = var1.aFloat4911;
         this.aFloat4908 = var1.aFloat4904;
         this.aFloat4911 = var1.aFloat4901;
         this.aFloat4906 = var1.aFloat4906;
         this.aFloat4909 = var1.aFloat4907;
         this.aFloat4904 = var1.aFloat4908;
         this.aFloat4907 = var1.aFloat4909;
         this.aFloat4905 = var1.aFloat4905;
         this.aFloat4910 = -(var1.aFloat4910 * this.aFloat4902 + var1.aFloat4912 * this.aFloat4901 + var1.aFloat4913 * this.aFloat4908);
         this.aFloat4912 = -(var1.aFloat4910 * this.aFloat4911 + var1.aFloat4912 * this.aFloat4906 + var1.aFloat4913 * this.aFloat4909);
         this.aFloat4913 = -(var1.aFloat4910 * this.aFloat4904 + var1.aFloat4912 * this.aFloat4907 + var1.aFloat4913 * this.aFloat4905);
      }

   }

   public void method5224() {
      float var1 = this.aFloat4910;
      float var2 = this.aFloat4912;
      float var3 = this.aFloat4901;
      this.aFloat4901 = this.aFloat4911;
      this.aFloat4911 = var3;
      float var4 = this.aFloat4908;
      this.aFloat4908 = this.aFloat4904;
      this.aFloat4904 = var4;
      float var5 = this.aFloat4909;
      this.aFloat4909 = this.aFloat4907;
      this.aFloat4907 = var5;
      this.aFloat4910 = -(var1 * this.aFloat4902 + var2 * this.aFloat4901 + this.aFloat4913 * this.aFloat4908);
      this.aFloat4912 = -(var1 * this.aFloat4911 + var2 * this.aFloat4906 + this.aFloat4913 * this.aFloat4909);
      this.aFloat4913 = -(var1 * this.aFloat4904 + var2 * this.aFloat4907 + this.aFloat4913 * this.aFloat4905);
   }

   public void method5225(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      this.aFloat4902 = var5 + var1 * var1 * (1.0F - var5);
      this.aFloat4911 = var3 * var6 + var2 * var1 * (1.0F - var5);
      this.aFloat4904 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      this.aFloat4901 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      this.aFloat4906 = var5 + var2 * var2 * (1.0F - var5);
      this.aFloat4907 = var1 * var6 + var3 * var2 * (1.0F - var5);
      this.aFloat4908 = var2 * var6 + var1 * var3 * (1.0F - var5);
      this.aFloat4909 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      this.aFloat4905 = var5 + var3 * var3 * (1.0F - var5);
      this.aFloat4913 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4910 = 0.0F;
   }

   void method5226(float var1, float var2, float var3, float var4) {
      float var5 = var1 * var1;
      float var6 = var1 * var2;
      float var7 = var1 * var3;
      float var8 = var1 * var4;
      float var9 = var2 * var2;
      float var10 = var2 * var3;
      float var11 = var2 * var4;
      float var12 = var3 * var3;
      float var13 = var3 * var4;
      this.aFloat4902 = 1.0F - 2.0F * (var9 + var12);
      this.aFloat4901 = 2.0F * (var6 - var13);
      this.aFloat4908 = 2.0F * (var7 + var11);
      this.aFloat4911 = 2.0F * (var6 + var13);
      this.aFloat4906 = 1.0F - 2.0F * (var5 + var12);
      this.aFloat4909 = 2.0F * (var10 - var8);
      this.aFloat4904 = 2.0F * (var7 - var11);
      this.aFloat4907 = 2.0F * (var10 + var8);
      this.aFloat4905 = 1.0F - 2.0F * (var5 + var9);
      this.aFloat4913 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4910 = 0.0F;
   }

   public void method5227(float[] var1) {
      float var2 = var1[0];
      float var3 = var1[1];
      float var4 = var1[2];
      var1[0] = this.aFloat4902 * var2 + this.aFloat4911 * var3 + this.aFloat4904 * var4;
      var1[1] = this.aFloat4901 * var2 + this.aFloat4906 * var3 + this.aFloat4907 * var4;
      var1[2] = this.aFloat4908 * var2 + this.aFloat4909 * var3 + this.aFloat4905 * var4;
   }

   public void method5228(float var1, float var2, float var3) {
      this.aFloat4902 *= var1;
      this.aFloat4901 *= var1;
      this.aFloat4908 *= var1;
      this.aFloat4910 *= var1;
      this.aFloat4911 *= var2;
      this.aFloat4906 *= var2;
      this.aFloat4909 *= var2;
      this.aFloat4912 *= var2;
      this.aFloat4904 *= var3;
      this.aFloat4907 *= var3;
      this.aFloat4905 *= var3;
      this.aFloat4913 *= var3;
   }

   public void method5229(float var1, float var2, float var3) {
      this.aFloat4909 = 0.0F;
      this.aFloat4908 = 0.0F;
      this.aFloat4907 = 0.0F;
      this.aFloat4901 = 0.0F;
      this.aFloat4904 = 0.0F;
      this.aFloat4911 = 0.0F;
      this.aFloat4905 = 1.0F;
      this.aFloat4906 = 1.0F;
      this.aFloat4902 = 1.0F;
      this.aFloat4910 = var1;
      this.aFloat4912 = var2;
      this.aFloat4913 = var3;
   }

   public void method5230(Class446 var1) {
      this.method5251(var1.aFloat4917, var1.aFloat4915, var1.aFloat4919);
   }

   public void method5231(Class445 var1) {
      float var2 = this.aFloat4902;
      float var3 = this.aFloat4911;
      float var4 = this.aFloat4901;
      float var5 = this.aFloat4906;
      float var6 = this.aFloat4908;
      float var7 = this.aFloat4909;
      float var8 = this.aFloat4910;
      float var9 = this.aFloat4912;
      float var10 = this.aFloat4904;
      float var11 = this.aFloat4907;
      float var12 = this.aFloat4905;
      float var13 = this.aFloat4913;
      this.aFloat4902 = var2 * var1.aFloat4902 + var3 * var1.aFloat4901 + var10 * var1.aFloat4908;
      this.aFloat4911 = var2 * var1.aFloat4911 + var3 * var1.aFloat4906 + var10 * var1.aFloat4909;
      this.aFloat4904 = var2 * var1.aFloat4904 + var3 * var1.aFloat4907 + var10 * var1.aFloat4905;
      this.aFloat4901 = var4 * var1.aFloat4902 + var5 * var1.aFloat4901 + var11 * var1.aFloat4908;
      this.aFloat4906 = var4 * var1.aFloat4911 + var5 * var1.aFloat4906 + var11 * var1.aFloat4909;
      this.aFloat4907 = var4 * var1.aFloat4904 + var5 * var1.aFloat4907 + var11 * var1.aFloat4905;
      this.aFloat4908 = var6 * var1.aFloat4902 + var7 * var1.aFloat4901 + var12 * var1.aFloat4908;
      this.aFloat4909 = var6 * var1.aFloat4911 + var7 * var1.aFloat4906 + var12 * var1.aFloat4909;
      this.aFloat4905 = var6 * var1.aFloat4904 + var7 * var1.aFloat4907 + var12 * var1.aFloat4905;
      this.aFloat4910 = var8 * var1.aFloat4902 + var9 * var1.aFloat4901 + var13 * var1.aFloat4908 + var1.aFloat4910;
      this.aFloat4912 = var8 * var1.aFloat4911 + var9 * var1.aFloat4906 + var13 * var1.aFloat4909 + var1.aFloat4912;
      this.aFloat4913 = var8 * var1.aFloat4904 + var9 * var1.aFloat4907 + var13 * var1.aFloat4905 + var1.aFloat4913;
   }

   public void method5232(Class445 var1, Class445 var2) {
      this.aFloat4902 = var1.aFloat4902 * var2.aFloat4902 + var1.aFloat4911 * var2.aFloat4901 + var1.aFloat4904 * var2.aFloat4908;
      this.aFloat4911 = var1.aFloat4902 * var2.aFloat4911 + var1.aFloat4911 * var2.aFloat4906 + var1.aFloat4904 * var2.aFloat4909;
      this.aFloat4904 = var1.aFloat4902 * var2.aFloat4904 + var1.aFloat4911 * var2.aFloat4907 + var1.aFloat4904 * var2.aFloat4905;
      this.aFloat4901 = var1.aFloat4901 * var2.aFloat4902 + var1.aFloat4906 * var2.aFloat4901 + var1.aFloat4907 * var2.aFloat4908;
      this.aFloat4906 = var1.aFloat4901 * var2.aFloat4911 + var1.aFloat4906 * var2.aFloat4906 + var1.aFloat4907 * var2.aFloat4909;
      this.aFloat4907 = var1.aFloat4901 * var2.aFloat4904 + var1.aFloat4906 * var2.aFloat4907 + var1.aFloat4907 * var2.aFloat4905;
      this.aFloat4908 = var1.aFloat4908 * var2.aFloat4902 + var1.aFloat4909 * var2.aFloat4901 + var1.aFloat4905 * var2.aFloat4908;
      this.aFloat4909 = var1.aFloat4908 * var2.aFloat4911 + var1.aFloat4909 * var2.aFloat4906 + var1.aFloat4905 * var2.aFloat4909;
      this.aFloat4905 = var1.aFloat4908 * var2.aFloat4904 + var1.aFloat4909 * var2.aFloat4907 + var1.aFloat4905 * var2.aFloat4905;
      this.aFloat4910 = var1.aFloat4910 * var2.aFloat4902 + var1.aFloat4912 * var2.aFloat4901 + var1.aFloat4913 * var2.aFloat4908 + var2.aFloat4910;
      this.aFloat4912 = var1.aFloat4910 * var2.aFloat4911 + var1.aFloat4912 * var2.aFloat4906 + var1.aFloat4913 * var2.aFloat4909 + var2.aFloat4912;
      this.aFloat4913 = var1.aFloat4910 * var2.aFloat4904 + var1.aFloat4912 * var2.aFloat4907 + var1.aFloat4913 * var2.aFloat4905 + var2.aFloat4913;
   }

   public void method5233(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.aFloat4902 * var1 + this.aFloat4901 * var2 + this.aFloat4908 * var3 + this.aFloat4910;
      var4[1] = this.aFloat4911 * var1 + this.aFloat4906 * var2 + this.aFloat4909 * var3 + this.aFloat4912;
      var4[2] = this.aFloat4904 * var1 + this.aFloat4907 * var2 + this.aFloat4905 * var3 + this.aFloat4913;
   }

   public void method5234(float[] var1) {
      float var2 = var1[0] - this.aFloat4910;
      float var3 = var1[1] - this.aFloat4912;
      float var4 = var1[2] - this.aFloat4913;
      var1[0] = (float)((int)(this.aFloat4902 * var2 + this.aFloat4911 * var3 + this.aFloat4904 * var4));
      var1[1] = (float)((int)(this.aFloat4901 * var2 + this.aFloat4906 * var3 + this.aFloat4907 * var4));
      var1[2] = (float)((int)(this.aFloat4908 * var2 + this.aFloat4909 * var3 + this.aFloat4905 * var4));
   }

   public float[] method5235(float[] var1) {
      var1[0] = this.aFloat4902;
      var1[1] = this.aFloat4911;
      var1[2] = this.aFloat4904;
      var1[3] = this.aFloat4901;
      var1[4] = this.aFloat4906;
      var1[5] = this.aFloat4907;
      var1[6] = this.aFloat4908;
      var1[7] = this.aFloat4909;
      var1[8] = this.aFloat4905;
      return var1;
   }

   public void method5236() {
      this.aFloat4913 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4910 = 0.0F;
      this.aFloat4909 = 0.0F;
      this.aFloat4908 = 0.0F;
      this.aFloat4907 = 0.0F;
      this.aFloat4901 = 0.0F;
      this.aFloat4904 = 0.0F;
      this.aFloat4911 = 0.0F;
      this.aFloat4905 = 1.0F;
      this.aFloat4906 = 1.0F;
      this.aFloat4902 = 1.0F;
   }

   public String toString() {
      return this.aFloat4902 + "," + this.aFloat4901 + "," + this.aFloat4908 + "," + this.aFloat4910 + " - " + this.aFloat4911 + "," + this.aFloat4906 + "," + this.aFloat4909 + "," + this.aFloat4912 + " - " + this.aFloat4904 + "," + this.aFloat4907 + "," + this.aFloat4905 + "," + this.aFloat4913;
   }

   public void method5237(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      float var7 = var5 + var1 * var1 * (1.0F - var5);
      float var8 = var3 * var6 + var2 * var1 * (1.0F - var5);
      float var9 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      float var10 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      float var11 = var5 + var2 * var2 * (1.0F - var5);
      float var12 = var1 * var6 + var3 * var2 * (1.0F - var5);
      float var13 = var2 * var6 + var1 * var3 * (1.0F - var5);
      float var14 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      float var15 = var5 + var3 * var3 * (1.0F - var5);
      float var16 = this.aFloat4902;
      float var17 = this.aFloat4911;
      float var18 = this.aFloat4901;
      float var19 = this.aFloat4906;
      float var20 = this.aFloat4908;
      float var21 = this.aFloat4909;
      float var22 = this.aFloat4910;
      float var23 = this.aFloat4912;
      this.aFloat4902 = var16 * var7 + var17 * var10 + this.aFloat4904 * var13;
      this.aFloat4911 = var16 * var8 + var17 * var11 + this.aFloat4904 * var14;
      this.aFloat4904 = var16 * var9 + var17 * var12 + this.aFloat4904 * var15;
      this.aFloat4901 = var18 * var7 + var19 * var10 + this.aFloat4907 * var13;
      this.aFloat4906 = var18 * var8 + var19 * var11 + this.aFloat4907 * var14;
      this.aFloat4907 = var18 * var9 + var19 * var12 + this.aFloat4907 * var15;
      this.aFloat4908 = var20 * var7 + var21 * var10 + this.aFloat4905 * var13;
      this.aFloat4909 = var20 * var8 + var21 * var11 + this.aFloat4905 * var14;
      this.aFloat4905 = var20 * var9 + var21 * var12 + this.aFloat4905 * var15;
      this.aFloat4910 = var22 * var7 + var23 * var10 + this.aFloat4913 * var13;
      this.aFloat4912 = var22 * var8 + var23 * var11 + this.aFloat4913 * var14;
      this.aFloat4913 = var22 * var9 + var23 * var12 + this.aFloat4913 * var15;
   }

   public String method5238() {
      return this.aFloat4902 + "," + this.aFloat4901 + "," + this.aFloat4908 + "," + this.aFloat4910 + " - " + this.aFloat4911 + "," + this.aFloat4906 + "," + this.aFloat4909 + "," + this.aFloat4912 + " - " + this.aFloat4904 + "," + this.aFloat4907 + "," + this.aFloat4905 + "," + this.aFloat4913;
   }

   public void method5239() {
      float var1 = this.aFloat4910;
      float var2 = this.aFloat4912;
      float var3 = this.aFloat4901;
      this.aFloat4901 = this.aFloat4911;
      this.aFloat4911 = var3;
      float var4 = this.aFloat4908;
      this.aFloat4908 = this.aFloat4904;
      this.aFloat4904 = var4;
      float var5 = this.aFloat4909;
      this.aFloat4909 = this.aFloat4907;
      this.aFloat4907 = var5;
      this.aFloat4910 = -(var1 * this.aFloat4902 + var2 * this.aFloat4901 + this.aFloat4913 * this.aFloat4908);
      this.aFloat4912 = -(var1 * this.aFloat4911 + var2 * this.aFloat4906 + this.aFloat4913 * this.aFloat4909);
      this.aFloat4913 = -(var1 * this.aFloat4904 + var2 * this.aFloat4907 + this.aFloat4913 * this.aFloat4905);
   }

   public void method5240() {
      this.aFloat4913 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4910 = 0.0F;
      this.aFloat4909 = 0.0F;
      this.aFloat4908 = 0.0F;
      this.aFloat4907 = 0.0F;
      this.aFloat4901 = 0.0F;
      this.aFloat4904 = 0.0F;
      this.aFloat4911 = 0.0F;
      this.aFloat4905 = 1.0F;
      this.aFloat4906 = 1.0F;
      this.aFloat4902 = 1.0F;
   }

   public float[] method5241(float[] var1) {
      var1[0] = this.aFloat4902;
      var1[1] = this.aFloat4911;
      var1[2] = this.aFloat4904;
      var1[3] = this.aFloat4901;
      var1[4] = this.aFloat4906;
      var1[5] = this.aFloat4907;
      var1[6] = this.aFloat4908;
      var1[7] = this.aFloat4909;
      var1[8] = this.aFloat4905;
      return var1;
   }

   public void method5242(Class445 var1) {
      this.aFloat4902 = var1.aFloat4902;
      this.aFloat4901 = var1.aFloat4901;
      this.aFloat4908 = var1.aFloat4908;
      this.aFloat4910 = var1.aFloat4910;
      this.aFloat4911 = var1.aFloat4911;
      this.aFloat4906 = var1.aFloat4906;
      this.aFloat4909 = var1.aFloat4909;
      this.aFloat4912 = var1.aFloat4912;
      this.aFloat4904 = var1.aFloat4904;
      this.aFloat4907 = var1.aFloat4907;
      this.aFloat4905 = var1.aFloat4905;
      this.aFloat4913 = var1.aFloat4913;
   }

   public void method5243(Class446 var1) {
      this.method5251(var1.aFloat4917, var1.aFloat4915, var1.aFloat4919);
   }

   public void method5244(Class430 var1) {
      this.method5245(var1.aClass440_4817);
      this.method5230(var1.aClass446_4816);
   }

   public void method5245(Class440 var1) {
      this.method5226(var1.aFloat4871, var1.aFloat4868, var1.aFloat4873, var1.aFloat4872);
   }

   public void method5246() {
      float var1 = this.aFloat4910;
      float var2 = this.aFloat4912;
      float var3 = this.aFloat4901;
      this.aFloat4901 = this.aFloat4911;
      this.aFloat4911 = var3;
      float var4 = this.aFloat4908;
      this.aFloat4908 = this.aFloat4904;
      this.aFloat4904 = var4;
      float var5 = this.aFloat4909;
      this.aFloat4909 = this.aFloat4907;
      this.aFloat4907 = var5;
      this.aFloat4910 = -(var1 * this.aFloat4902 + var2 * this.aFloat4901 + this.aFloat4913 * this.aFloat4908);
      this.aFloat4912 = -(var1 * this.aFloat4911 + var2 * this.aFloat4906 + this.aFloat4913 * this.aFloat4909);
      this.aFloat4913 = -(var1 * this.aFloat4904 + var2 * this.aFloat4907 + this.aFloat4913 * this.aFloat4905);
   }

   void method5247(float var1, float var2, float var3, float var4) {
      float var5 = var1 * var1;
      float var6 = var1 * var2;
      float var7 = var1 * var3;
      float var8 = var1 * var4;
      float var9 = var2 * var2;
      float var10 = var2 * var3;
      float var11 = var2 * var4;
      float var12 = var3 * var3;
      float var13 = var3 * var4;
      this.aFloat4902 = 1.0F - 2.0F * (var9 + var12);
      this.aFloat4901 = 2.0F * (var6 - var13);
      this.aFloat4908 = 2.0F * (var7 + var11);
      this.aFloat4911 = 2.0F * (var6 + var13);
      this.aFloat4906 = 1.0F - 2.0F * (var5 + var12);
      this.aFloat4909 = 2.0F * (var10 - var8);
      this.aFloat4904 = 2.0F * (var7 - var11);
      this.aFloat4907 = 2.0F * (var10 + var8);
      this.aFloat4905 = 1.0F - 2.0F * (var5 + var9);
      this.aFloat4913 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4910 = 0.0F;
   }

   public void method5248(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      float var7 = var5 + var1 * var1 * (1.0F - var5);
      float var8 = var3 * var6 + var2 * var1 * (1.0F - var5);
      float var9 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      float var10 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      float var11 = var5 + var2 * var2 * (1.0F - var5);
      float var12 = var1 * var6 + var3 * var2 * (1.0F - var5);
      float var13 = var2 * var6 + var1 * var3 * (1.0F - var5);
      float var14 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      float var15 = var5 + var3 * var3 * (1.0F - var5);
      float var16 = this.aFloat4902;
      float var17 = this.aFloat4911;
      float var18 = this.aFloat4901;
      float var19 = this.aFloat4906;
      float var20 = this.aFloat4908;
      float var21 = this.aFloat4909;
      float var22 = this.aFloat4910;
      float var23 = this.aFloat4912;
      this.aFloat4902 = var16 * var7 + var17 * var10 + this.aFloat4904 * var13;
      this.aFloat4911 = var16 * var8 + var17 * var11 + this.aFloat4904 * var14;
      this.aFloat4904 = var16 * var9 + var17 * var12 + this.aFloat4904 * var15;
      this.aFloat4901 = var18 * var7 + var19 * var10 + this.aFloat4907 * var13;
      this.aFloat4906 = var18 * var8 + var19 * var11 + this.aFloat4907 * var14;
      this.aFloat4907 = var18 * var9 + var19 * var12 + this.aFloat4907 * var15;
      this.aFloat4908 = var20 * var7 + var21 * var10 + this.aFloat4905 * var13;
      this.aFloat4909 = var20 * var8 + var21 * var11 + this.aFloat4905 * var14;
      this.aFloat4905 = var20 * var9 + var21 * var12 + this.aFloat4905 * var15;
      this.aFloat4910 = var22 * var7 + var23 * var10 + this.aFloat4913 * var13;
      this.aFloat4912 = var22 * var8 + var23 * var11 + this.aFloat4913 * var14;
      this.aFloat4913 = var22 * var9 + var23 * var12 + this.aFloat4913 * var15;
   }

   public void method5249(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      float var7 = var5 + var1 * var1 * (1.0F - var5);
      float var8 = var3 * var6 + var2 * var1 * (1.0F - var5);
      float var9 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      float var10 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      float var11 = var5 + var2 * var2 * (1.0F - var5);
      float var12 = var1 * var6 + var3 * var2 * (1.0F - var5);
      float var13 = var2 * var6 + var1 * var3 * (1.0F - var5);
      float var14 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      float var15 = var5 + var3 * var3 * (1.0F - var5);
      float var16 = this.aFloat4902;
      float var17 = this.aFloat4911;
      float var18 = this.aFloat4901;
      float var19 = this.aFloat4906;
      float var20 = this.aFloat4908;
      float var21 = this.aFloat4909;
      float var22 = this.aFloat4910;
      float var23 = this.aFloat4912;
      this.aFloat4902 = var16 * var7 + var17 * var10 + this.aFloat4904 * var13;
      this.aFloat4911 = var16 * var8 + var17 * var11 + this.aFloat4904 * var14;
      this.aFloat4904 = var16 * var9 + var17 * var12 + this.aFloat4904 * var15;
      this.aFloat4901 = var18 * var7 + var19 * var10 + this.aFloat4907 * var13;
      this.aFloat4906 = var18 * var8 + var19 * var11 + this.aFloat4907 * var14;
      this.aFloat4907 = var18 * var9 + var19 * var12 + this.aFloat4907 * var15;
      this.aFloat4908 = var20 * var7 + var21 * var10 + this.aFloat4905 * var13;
      this.aFloat4909 = var20 * var8 + var21 * var11 + this.aFloat4905 * var14;
      this.aFloat4905 = var20 * var9 + var21 * var12 + this.aFloat4905 * var15;
      this.aFloat4910 = var22 * var7 + var23 * var10 + this.aFloat4913 * var13;
      this.aFloat4912 = var22 * var8 + var23 * var11 + this.aFloat4913 * var14;
      this.aFloat4913 = var22 * var9 + var23 * var12 + this.aFloat4913 * var15;
   }

   public void method5250(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.aFloat4902 = var1;
      this.aFloat4901 = var4;
      this.aFloat4908 = var7;
      this.aFloat4910 = 0.0F;
      this.aFloat4911 = var2;
      this.aFloat4906 = var5;
      this.aFloat4909 = var8;
      this.aFloat4912 = 0.0F;
      this.aFloat4904 = var3;
      this.aFloat4907 = var6;
      this.aFloat4905 = var9;
      this.aFloat4913 = 0.0F;
   }

   public void method5251(float var1, float var2, float var3) {
      this.aFloat4910 += var1;
      this.aFloat4912 += var2;
      this.aFloat4913 += var3;
   }

   public void method5252(Class446 var1) {
      this.method5251(var1.aFloat4917, var1.aFloat4915, var1.aFloat4919);
   }

   public float[] method5253(float[] var1) {
      var1[0] = this.aFloat4910;
      var1[1] = this.aFloat4912;
      var1[2] = this.aFloat4913;
      return var1;
   }

   public void method5254(float var1, float var2, float var3) {
      this.aFloat4910 += var1;
      this.aFloat4912 += var2;
      this.aFloat4913 += var3;
   }

   public Class445() {
      this.method5219();
   }

   public float[] method5255(float[] var1) {
      var1[0] = this.aFloat4910;
      var1[1] = this.aFloat4912;
      var1[2] = this.aFloat4913;
      return var1;
   }

   public void method5256(float var1, float var2, float var3) {
      this.aFloat4902 = var1;
      this.aFloat4901 = 0.0F;
      this.aFloat4908 = 0.0F;
      this.aFloat4910 = 0.0F;
      this.aFloat4911 = 0.0F;
      this.aFloat4906 = var2;
      this.aFloat4909 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4904 = 0.0F;
      this.aFloat4907 = 0.0F;
      this.aFloat4905 = var3;
      this.aFloat4913 = 0.0F;
   }

   public float[] method5257(float[] var1) {
      var1[0] = this.aFloat4910;
      var1[1] = this.aFloat4912;
      var1[2] = this.aFloat4913;
      return var1;
   }

   public void method5258(float var1, float var2, float var3, float[] var4) {
      var1 -= this.aFloat4910;
      var2 -= this.aFloat4912;
      var3 -= this.aFloat4913;
      var4[0] = (float)((int)(this.aFloat4902 * var1 + this.aFloat4911 * var2 + this.aFloat4904 * var3));
      var4[1] = (float)((int)(this.aFloat4901 * var1 + this.aFloat4906 * var2 + this.aFloat4907 * var3));
      var4[2] = (float)((int)(this.aFloat4908 * var1 + this.aFloat4909 * var2 + this.aFloat4905 * var3));
   }

   public void method5259() {
      float var1 = this.aFloat4910;
      float var2 = this.aFloat4912;
      float var3 = this.aFloat4901;
      this.aFloat4901 = this.aFloat4911;
      this.aFloat4911 = var3;
      float var4 = this.aFloat4908;
      this.aFloat4908 = this.aFloat4904;
      this.aFloat4904 = var4;
      float var5 = this.aFloat4909;
      this.aFloat4909 = this.aFloat4907;
      this.aFloat4907 = var5;
      this.aFloat4910 = -(var1 * this.aFloat4902 + var2 * this.aFloat4901 + this.aFloat4913 * this.aFloat4908);
      this.aFloat4912 = -(var1 * this.aFloat4911 + var2 * this.aFloat4906 + this.aFloat4913 * this.aFloat4909);
      this.aFloat4913 = -(var1 * this.aFloat4904 + var2 * this.aFloat4907 + this.aFloat4913 * this.aFloat4905);
   }

   public float[] method5260(float[] var1) {
      var1[0] = this.aFloat4902;
      var1[1] = this.aFloat4911;
      var1[2] = this.aFloat4904;
      var1[3] = this.aFloat4901;
      var1[4] = this.aFloat4906;
      var1[5] = this.aFloat4907;
      var1[6] = this.aFloat4908;
      var1[7] = this.aFloat4909;
      var1[8] = this.aFloat4905;
      return var1;
   }

   public void method5261(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.cos((double)var4);
      float var6 = (float)Math.sin((double)var4);
      this.aFloat4902 = var5 + var1 * var1 * (1.0F - var5);
      this.aFloat4911 = var3 * var6 + var2 * var1 * (1.0F - var5);
      this.aFloat4904 = -var2 * var6 + var3 * var1 * (1.0F - var5);
      this.aFloat4901 = -var3 * var6 + var1 * var2 * (1.0F - var5);
      this.aFloat4906 = var5 + var2 * var2 * (1.0F - var5);
      this.aFloat4907 = var1 * var6 + var3 * var2 * (1.0F - var5);
      this.aFloat4908 = var2 * var6 + var1 * var3 * (1.0F - var5);
      this.aFloat4909 = -var1 * var6 + var2 * var3 * (1.0F - var5);
      this.aFloat4905 = var5 + var3 * var3 * (1.0F - var5);
      this.aFloat4913 = 0.0F;
      this.aFloat4912 = 0.0F;
      this.aFloat4910 = 0.0F;
   }
}
