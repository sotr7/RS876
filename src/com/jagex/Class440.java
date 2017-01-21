package com.jagex;

import com.jagex.Class446;
import com.jagex.RSByteBuffer;

public final class Class440 {
   static int anInt4870;
   public float aFloat4871;
   public float aFloat4868;
   public float aFloat4873;
   public float aFloat4872;
   static Class440[] aClass440Array4874 = new Class440[0];
   static int anInt4869;

   public void method5160(float var1, float var2, float var3) {
      this.method5193(0.0F, 1.0F, 0.0F, var1);
      Class440 var4 = method5192();
      var4.method5193(1.0F, 0.0F, 0.0F, var2);
      this.method5194(var4);
      var4.method5193(0.0F, 0.0F, 1.0F, var3);
      this.method5194(var4);
      var4.method5163();
   }

   public static Class440 method5161(Class440 var0) {
      Class440[] var1 = aClass440Array4874;
      synchronized(var1) {
         if(anInt4870 == 0) {
            return new Class440(var0);
         } else {
            aClass440Array4874[--anInt4870].method5166(var0);
            return aClass440Array4874[anInt4870];
         }
      }
   }

   final void method5162(Class440 var1) {
      this.aFloat4871 += var1.aFloat4871;
      this.aFloat4868 += var1.aFloat4868;
      this.aFloat4873 += var1.aFloat4873;
      this.aFloat4872 += var1.aFloat4872;
   }

   public void method5163() {
      Class440[] var1 = aClass440Array4874;
      synchronized(var1) {
         if(anInt4870 < anInt4869 - 1) {
            aClass440Array4874[anInt4870++] = this;
         }

      }
   }

   public Class440() {
      this.method5168();
   }

   public Class440(float var1, float var2, float var3, float var4) {
      this.method5165(var1, var2, var3, var4);
   }

   static final float method5164(Class440 var0) {
      return (float)Math.sqrt((double)method5173(var0, var0));
   }

   public Class440(float var1, float var2, float var3) {
      this.method5160(var1, var2, var3);
   }

   void method5165(float var1, float var2, float var3, float var4) {
      this.aFloat4871 = var1;
      this.aFloat4868 = var2;
      this.aFloat4873 = var3;
      this.aFloat4872 = var4;
   }

   public void method5166(Class440 var1) {
      this.aFloat4871 = var1.aFloat4871;
      this.aFloat4868 = var1.aFloat4868;
      this.aFloat4873 = var1.aFloat4873;
      this.aFloat4872 = var1.aFloat4872;
   }

   public Class440(Class440 var1) {
      this.method5166(var1);
   }

   final void method5167() {
      this.aFloat4873 = 0.0F;
      this.aFloat4868 = 0.0F;
      this.aFloat4871 = 0.0F;
      this.aFloat4872 = 1.0F;
   }

   final void method5168() {
      this.aFloat4873 = 0.0F;
      this.aFloat4868 = 0.0F;
      this.aFloat4871 = 0.0F;
      this.aFloat4872 = 1.0F;
   }

   final void method5169() {
      this.aFloat4871 = -this.aFloat4871;
      this.aFloat4868 = -this.aFloat4868;
      this.aFloat4873 = -this.aFloat4873;
      this.aFloat4872 = -this.aFloat4872;
   }

   public static final Class440 method5170(Class440 var0) {
      Class440 var1 = method5161(var0);
      var1.method5187();
      return var1;
   }

   public final void method5171() {
      float var1 = 1.0F / method5164(this);
      this.aFloat4871 *= var1;
      this.aFloat4868 *= var1;
      this.aFloat4873 *= var1;
      this.aFloat4872 *= var1;
   }

   final float method5172(Class440 var1) {
      return this.aFloat4871 * var1.aFloat4871 + this.aFloat4868 * var1.aFloat4868 + this.aFloat4873 * var1.aFloat4873 + this.aFloat4872 * var1.aFloat4872;
   }

   static final float method5173(Class440 var0, Class440 var1) {
      return var0.method5172(var1);
   }

   public void method5174(float var1, float var2, float var3) {
      this.method5193(0.0F, 1.0F, 0.0F, var1);
      Class440 var4 = method5192();
      var4.method5193(1.0F, 0.0F, 0.0F, var2);
      this.method5194(var4);
      var4.method5193(0.0F, 0.0F, 1.0F, var3);
      this.method5194(var4);
      var4.method5163();
   }

   static final Class440 method5175(Class440 var0, Class440 var1) {
      Class440 var2 = method5161(var0);
      var2.method5194(var1);
      return var2;
   }

   final void method5176(float var1) {
      this.aFloat4871 *= var1;
      this.aFloat4868 *= var1;
      this.aFloat4873 *= var1;
      this.aFloat4872 *= var1;
   }

   static final Class440 method5177(Class440 var0, float var1) {
      Class440 var2 = method5161(var0);
      var2.method5176(var1);
      return var2;
   }

   public final void method5178(Class440 var1, float var2) {
      if(this.method5172(var1) < 0.0F) {
         this.method5169();
      }

      this.method5176(1.0F - var2);
      Class440 var3 = method5177(var1, var2);
      this.method5162(var3);
      var3.method5163();
      this.method5171();
   }

   public String toString() {
      return this.aFloat4871 + "," + this.aFloat4868 + "," + this.aFloat4873 + "," + this.aFloat4872;
   }

   static {
      new Class440();
   }

   public String method5179() {
      return this.aFloat4871 + "," + this.aFloat4868 + "," + this.aFloat4873 + "," + this.aFloat4872;
   }

   public static void method5180(int var0) {
      anInt4869 = var0;
      aClass440Array4874 = new Class440[var0];
      anInt4870 = 0;
   }

   public void method5181(float var1, float var2, float var3) {
      this.method5193(0.0F, 1.0F, 0.0F, var1);
      Class440 var4 = method5192();
      var4.method5193(1.0F, 0.0F, 0.0F, var2);
      this.method5194(var4);
      var4.method5193(0.0F, 0.0F, 1.0F, var3);
      this.method5194(var4);
      var4.method5163();
   }

   void method5182(float var1, float var2, float var3, float var4) {
      this.aFloat4871 = var1;
      this.aFloat4868 = var2;
      this.aFloat4873 = var3;
      this.aFloat4872 = var4;
   }

   public void method5183() {
      Class440[] var1 = aClass440Array4874;
      synchronized(var1) {
         if(anInt4870 < anInt4869 - 1) {
            aClass440Array4874[anInt4870++] = this;
         }

      }
   }

   public void method5184(RSByteBuffer var1) {
      this.aFloat4871 = var1.method9634((byte)1);
      this.aFloat4868 = var1.method9634((byte)1);
      this.aFloat4873 = var1.method9634((byte)1);
      this.aFloat4872 = var1.method9634((byte)1);
   }

   public final void method5185() {
      float var1 = 1.0F / method5164(this);
      this.aFloat4871 *= var1;
      this.aFloat4868 *= var1;
      this.aFloat4873 *= var1;
      this.aFloat4872 *= var1;
   }

   public static void method5186(int var0) {
      anInt4869 = var0;
      aClass440Array4874 = new Class440[var0];
      anInt4870 = 0;
   }

   public final void method5187() {
      this.aFloat4871 = -this.aFloat4871;
      this.aFloat4868 = -this.aFloat4868;
      this.aFloat4873 = -this.aFloat4873;
   }

   public void method5188(Class446 var1, float var2) {
      this.method5193(var1.aFloat4917, var1.aFloat4915, var1.aFloat4919, var2);
   }

   public void method5189(RSByteBuffer var1) {
      this.aFloat4871 = var1.method9634((byte)1);
      this.aFloat4868 = var1.method9634((byte)1);
      this.aFloat4873 = var1.method9634((byte)1);
      this.aFloat4872 = var1.method9634((byte)1);
   }

   final void method5190() {
      this.aFloat4871 = -this.aFloat4871;
      this.aFloat4868 = -this.aFloat4868;
      this.aFloat4873 = -this.aFloat4873;
      this.aFloat4872 = -this.aFloat4872;
   }

   public final void method5191() {
      this.aFloat4871 = -this.aFloat4871;
      this.aFloat4868 = -this.aFloat4868;
      this.aFloat4873 = -this.aFloat4873;
   }

   public static Class440 method5192() {
      Class440[] var0 = aClass440Array4874;
      synchronized(var0) {
         if(anInt4870 == 0) {
            return new Class440();
         } else {
            aClass440Array4874[--anInt4870].method5168();
            return aClass440Array4874[anInt4870];
         }
      }
   }

   public void method5193(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(var4 * 0.5F));
      float var6 = (float)Math.cos((double)(var4 * 0.5F));
      this.aFloat4871 = var1 * var5;
      this.aFloat4868 = var2 * var5;
      this.aFloat4873 = var3 * var5;
      this.aFloat4872 = var6;
   }

   public final void method5194(Class440 var1) {
      this.method5165(var1.aFloat4872 * this.aFloat4871 + var1.aFloat4871 * this.aFloat4872 + var1.aFloat4868 * this.aFloat4873 - var1.aFloat4873 * this.aFloat4868, var1.aFloat4872 * this.aFloat4868 - var1.aFloat4871 * this.aFloat4873 + var1.aFloat4868 * this.aFloat4872 + var1.aFloat4873 * this.aFloat4871, var1.aFloat4872 * this.aFloat4873 + var1.aFloat4871 * this.aFloat4868 - var1.aFloat4868 * this.aFloat4871 + var1.aFloat4873 * this.aFloat4872, var1.aFloat4872 * this.aFloat4872 - var1.aFloat4871 * this.aFloat4871 - var1.aFloat4868 * this.aFloat4868 - var1.aFloat4873 * this.aFloat4873);
   }

   public static void method5195(int var0) {
      anInt4869 = var0;
      aClass440Array4874 = new Class440[var0];
      anInt4870 = 0;
   }

   static Class440 method5196(float var0, float var1, float var2, float var3) {
      Class440[] var4 = aClass440Array4874;
      synchronized(var4) {
         if(anInt4870 == 0) {
            return new Class440(var0, var1, var2, var3);
         } else {
            aClass440Array4874[--anInt4870].method5165(var0, var1, var2, var3);
            return aClass440Array4874[anInt4870];
         }
      }
   }
}
