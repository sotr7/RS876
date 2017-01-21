package com.jagex;

import com.jagex.Class292;
import com.jagex.RSByteBuffer;
import com.jagex.Class689_Sub5;

public class Class689_Sub5_Sub3 extends Class689_Sub5 {
   int anInt11876 = 0;
   float[] aFloatArray11877;
   float[] aFloatArray11875;
   float[] aFloatArray11874;

   float method10280(float var1, float var2, float var3, int var4) {
      float var5 = this.aFloat10978 / var1;
      if(var5 < 0.0F) {
         var5 = 0.0F;
      }

      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      return var1 / this.aFloatArray11874[this.anInt11876 * -106297885] * ((this.aFloatArray11875[this.anInt11876 * -106297885] - this.aFloatArray11877[this.anInt11876 * -106297885]) * var5 + this.aFloatArray11877[this.anInt11876 * -106297885]);
   }

   void method10281(byte var1) {
      this.anInt11876 += 1814390731;
   }

   void method10291() {
      this.anInt11876 += 1814390731;
   }

   void method10283(RSByteBuffer var1, int var2, byte var3) {
      this.aFloatArray11877 = new float[var2];
      this.aFloatArray11875 = new float[var2];
      this.aFloatArray11874 = new float[var2];
      this.anInt11876 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         this.aFloatArray11877[var4] = var1.method9634((byte)1);
         this.aFloatArray11875[var4] = var1.method9634((byte)1);
         this.aFloatArray11874[var4] = var1.method9634((byte)1);
      }

   }

   float method10284(float var1, float var2, float var3) {
      float var4 = this.aFloat10978 / var1;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      return var1 / this.aFloatArray11874[this.anInt11876 * -106297885] * ((this.aFloatArray11875[this.anInt11876 * -106297885] - this.aFloatArray11877[this.anInt11876 * -106297885]) * var4 + this.aFloatArray11877[this.anInt11876 * -106297885]);
   }

   public Class689_Sub5_Sub3(Class292 var1) {
      super(var1);
   }

   void method10286() {
      this.anInt11876 += 1814390731;
   }

   void method10287() {
      this.anInt11876 += 1814390731;
   }

   void method10289(RSByteBuffer var1, int var2) {
      this.aFloatArray11877 = new float[var2];
      this.aFloatArray11875 = new float[var2];
      this.aFloatArray11874 = new float[var2];
      this.anInt11876 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aFloatArray11877[var3] = var1.method9634((byte)1);
         this.aFloatArray11875[var3] = var1.method9634((byte)1);
         this.aFloatArray11874[var3] = var1.method9634((byte)1);
      }

   }

   float method10285(float var1, float var2, float var3) {
      float var4 = this.aFloat10978 / var1;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      return var1 / this.aFloatArray11874[this.anInt11876 * -106297885] * ((this.aFloatArray11875[this.anInt11876 * -106297885] - this.aFloatArray11877[this.anInt11876 * -106297885]) * var4 + this.aFloatArray11877[this.anInt11876 * -106297885]);
   }
}
