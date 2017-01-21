package com.jagex;

import com.jagex.Class292;
import com.jagex.Class446;
import com.jagex.RSByteBuffer;
import com.jagex.Class689_Sub5;

public class Class689_Sub5_Sub2 extends Class689_Sub5 {
   int anInt11827 = 0;
   float[] aFloatArray11826;
   float[] aFloatArray11825;

   void method10281(byte var1) {
      this.anInt11827 += -1409397281;
   }

   public Class689_Sub5_Sub2(Class292 var1) {
      super(var1);
   }

   float method10280(float var1, float var2, float var3, int var4) {
      float var5 = this.aFloat10978 / (float)this.aClass432Array10976[this.anInt11827 * 1469689375].method5075();
      float var6 = (this.aFloatArray11825[1469689375 * this.anInt11827] - this.aFloatArray11826[1469689375 * this.anInt11827]) * var5 + this.aFloatArray11826[1469689375 * this.anInt11827];
      return var6;
   }

   void method10279(float var1, float var2, int var3) {
      this.aFloat10978 += var1;
      if(this.aFloat10978 > (float)this.aClass432Array10976[1469689375 * this.anInt11827].method5075()) {
         this.aFloat10978 = (float)this.aClass432Array10976[this.anInt11827 * 1469689375].method5075();
      }

   }

   public Class446 method8073(int var1) {
      Class446 var2 = Class446.method5312();
      double[] var3 = this.aClass432Array10976[this.anInt11827 * 1469689375].method5065(this.aFloat10978);
      var2.aFloat4917 = (float)var3[0];
      var2.aFloat4915 = (float)var3[1];
      var2.aFloat4919 = (float)var3[2];
      return var2;
   }

   double[] method10282(int var1) {
      return this.aClass432Array10976[this.anInt11827 * 1469689375].method5065(this.aFloat10978);
   }

   public Class446 method8087() {
      return this.method8073(1772387499);
   }

   void method10283(RSByteBuffer var1, int var2, byte var3) {
      this.aFloatArray11826 = new float[var2];
      this.aFloatArray11825 = new float[var2];
      this.anInt11827 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         this.aFloatArray11826[var4] = var1.method9634((byte)1);
         this.aFloatArray11825[var4] = var1.method9634((byte)1);
      }

   }

   float method10284(float var1, float var2, float var3) {
      float var4 = this.aFloat10978 / (float)this.aClass432Array10976[this.anInt11827 * 1469689375].method5075();
      float var5 = (this.aFloatArray11825[1469689375 * this.anInt11827] - this.aFloatArray11826[1469689375 * this.anInt11827]) * var4 + this.aFloatArray11826[1469689375 * this.anInt11827];
      return var5;
   }

   float method10285(float var1, float var2, float var3) {
      float var4 = this.aFloat10978 / (float)this.aClass432Array10976[this.anInt11827 * 1469689375].method5075();
      float var5 = (this.aFloatArray11825[1469689375 * this.anInt11827] - this.aFloatArray11826[1469689375 * this.anInt11827]) * var4 + this.aFloatArray11826[1469689375 * this.anInt11827];
      return var5;
   }

   void method10286() {
      this.anInt11827 += -1409397281;
   }

   double[] method10290() {
      return this.aClass432Array10976[this.anInt11827 * 1469689375].method5065(this.aFloat10978);
   }

   void method10291() {
      this.anInt11827 += -1409397281;
   }

   void method10293(float var1, float var2) {
      this.aFloat10978 += var1;
      if(this.aFloat10978 > (float)this.aClass432Array10976[1469689375 * this.anInt11827].method5075()) {
         this.aFloat10978 = (float)this.aClass432Array10976[this.anInt11827 * 1469689375].method5075();
      }

   }

   void method10289(RSByteBuffer var1, int var2) {
      this.aFloatArray11826 = new float[var2];
      this.aFloatArray11825 = new float[var2];
      this.anInt11827 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aFloatArray11826[var3] = var1.method9634((byte)1);
         this.aFloatArray11825[var3] = var1.method9634((byte)1);
      }

   }

   void method10294(float var1, float var2) {
      this.aFloat10978 += var1;
      if(this.aFloat10978 > (float)this.aClass432Array10976[1469689375 * this.anInt11827].method5075()) {
         this.aFloat10978 = (float)this.aClass432Array10976[this.anInt11827 * 1469689375].method5075();
      }

   }

   public Class446 method8084() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10976[this.anInt11827 * 1469689375].method5065(this.aFloat10978);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public Class446 method8082() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10976[this.anInt11827 * 1469689375].method5065(this.aFloat10978);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   void method10287() {
      this.anInt11827 += -1409397281;
   }

   public Class446 method8088() {
      return this.method8073(1349293253);
   }

   public Class446 method8077() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10976[this.anInt11827 * 1469689375].method5065(this.aFloat10978);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public Class446 method8075(int var1) {
      return this.method8073(765062840);
   }

   double[] method10288() {
      return this.aClass432Array10976[this.anInt11827 * 1469689375].method5065(this.aFloat10978);
   }
}
