package com.jagex;

import com.jagex.Class115;
import com.jagex.Class292;
import com.jagex.Class329_Sub3;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class57;
import com.jagex.Class688;
import com.jagex.client;

public class Class329_Sub3_Sub2 extends Class329_Sub3 {
   float[] aFloatArray11428;
   float[] aFloatArray11431;
   float[] aFloatArray11430;
   int anInt11429 = 0;

   void method9167(RSByteBuffer var1, int var2, byte var3) {
      this.aFloatArray11428 = new float[var2];
      this.aFloatArray11431 = new float[var2];
      this.aFloatArray11430 = new float[var2];
      this.anInt11429 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         this.aFloatArray11428[var4] = var1.method9634((byte)1);
         this.aFloatArray11431[var4] = var1.method9634((byte)1);
         this.aFloatArray11430[var4] = var1.method9634((byte)1);
      }

   }

   float method9163(float var1, float var2, float var3) {
      float var4 = this.aFloat10165 / var1;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      return (var4 * (this.aFloatArray11431[1185871105 * this.anInt11429] - this.aFloatArray11428[1185871105 * this.anInt11429]) + this.aFloatArray11428[this.anInt11429 * 1185871105]) * (var1 / this.aFloatArray11430[1185871105 * this.anInt11429]);
   }

   void method9165(RSByteBuffer var1, int var2) {
      this.aFloatArray11428 = new float[var2];
      this.aFloatArray11431 = new float[var2];
      this.aFloatArray11430 = new float[var2];
      this.anInt11429 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aFloatArray11428[var3] = var1.method9634((byte)1);
         this.aFloatArray11431[var3] = var1.method9634((byte)1);
         this.aFloatArray11430[var3] = var1.method9634((byte)1);
      }

   }

   float method9160(float var1, float var2, float var3, int var4) {
      float var5 = this.aFloat10165 / var1;
      if(var5 < 0.0F) {
         var5 = 0.0F;
      }

      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      return (var5 * (this.aFloatArray11431[1185871105 * this.anInt11429] - this.aFloatArray11428[1185871105 * this.anInt11429]) + this.aFloatArray11428[this.anInt11429 * 1185871105]) * (var1 / this.aFloatArray11430[1185871105 * this.anInt11429]);
   }

   public Class329_Sub3_Sub2(Class292 var1) {
      super(var1);
   }

   void method9164() {
      this.anInt11429 += -490075391;
   }

   void method9161(int var1) {
      this.anInt11429 += -490075391;
   }

   void method9166(RSByteBuffer var1, int var2) {
      this.aFloatArray11428 = new float[var2];
      this.aFloatArray11431 = new float[var2];
      this.aFloatArray11430 = new float[var2];
      this.anInt11429 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aFloatArray11428[var3] = var1.method9634((byte)1);
         this.aFloatArray11431[var3] = var1.method9634((byte)1);
         this.aFloatArray11430[var3] = var1.method9634((byte)1);
      }

   }

   public static void method10493(String var0, int var1) {
      if(11 == client.anInt11038 * -558705405) {
         OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4192, client.aClass111_11059.aClass14_1342, 935954674);
         var2.out.writeByte(0, 937650790);
         int var3 = var2.out.pos * 301018015;
         var2.out.method9616(var0, -402650327);
         var2.out.pos += 1318867609;
         var2.out.method9622(Class57.anIntArray685, var3, 301018015 * var2.out.pos, (short)768);
         var2.out.method9678(301018015 * var2.out.pos - var3, (byte)-87);
         client.aClass111_11059.write(var2, (byte)46);
         Class57.aClass688_690 = Class688.aClass688_8681;
      }
   }
}
