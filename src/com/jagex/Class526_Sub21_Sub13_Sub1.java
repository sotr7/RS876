package com.jagex;

import com.jagex.Class259;
import com.jagex.Class309;
import com.jagex.Class433;
import com.jagex.Class445;
import com.jagex.Class526_Sub21_Sub13;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;

public class Class526_Sub21_Sub13_Sub1 extends Class526_Sub21_Sub13 {
   Class259 aClass259_12054;
   float aFloat12052;
   float aFloat12053;
   float aFloat12051;

   public Class526_Sub21_Sub13_Sub1(int var1, Class259 var2, float var3, float var4) {
      super(var1);
      this.aClass259_12054 = var2;
      this.aFloat12052 = var3;
      this.aFloat12053 = var4;
   }

   Class526_Sub21_Sub13_Sub1(int var1, RSByteBuffer var2) {
      super(var1);
      this.aClass259_12054 = Class679.method8024(var2.readUnsignedByte(483192817), (short)-14324);
      this.aFloat12052 = var2.method9634((byte)1);
      this.aFloat12053 = var2.method9634((byte)1);
   }

   public void method10696(float var1, int var2) {
      this.aFloat12051 += this.aFloat12053 * var1;
   }

   public void method10692(Class309 var1, Class445 var2, Class433 var3, byte var4) {
      float var5 = (float)Math.sin((double)this.aFloat12051);
      float var6 = this.aFloat12052 * var5;
      if(this.aClass259_12054 == Class259.aClass259_2832) {
         var1.anInt3375 = (int)((float)(var1.anInt3375 * 1939759647) + var6) * 2065471967;
         var2.method5251(var6, 0.0F, 0.0F);
      } else if(this.aClass259_12054 == Class259.aClass259_2831) {
         var1.anInt3374 = 1296896295 * (int)(var6 + (float)(var1.anInt3374 * 298274455));
         var2.method5251(0.0F, var6, 0.0F);
      } else if(Class259.aClass259_2833 == this.aClass259_12054) {
         var1.anInt3376 = 1395449909 * (int)(var6 + (float)(var1.anInt3376 * -1339592163));
         var2.method5251(0.0F, 0.0F, var6);
      } else if(Class259.aClass259_2830 == this.aClass259_12054) {
         var2.method5237(1.0F, 0.0F, 0.0F, var6);
      } else if(Class259.aClass259_2834 == this.aClass259_12054) {
         var2.method5237(0.0F, 1.0F, 0.0F, var6);
      } else if(Class259.aClass259_2835 == this.aClass259_12054) {
         var2.method5237(0.0F, 0.0F, 1.0F, var6);
      }

   }

   public void method10694(Class309 var1, Class445 var2, Class433 var3) {
      float var4 = (float)Math.sin((double)this.aFloat12051);
      float var5 = this.aFloat12052 * var4;
      if(this.aClass259_12054 == Class259.aClass259_2832) {
         var1.anInt3375 = (int)((float)(var1.anInt3375 * 1939759647) + var5) * 2065471967;
         var2.method5251(var5, 0.0F, 0.0F);
      } else if(this.aClass259_12054 == Class259.aClass259_2831) {
         var1.anInt3374 = 1296896295 * (int)(var5 + (float)(var1.anInt3374 * 298274455));
         var2.method5251(0.0F, var5, 0.0F);
      } else if(Class259.aClass259_2833 == this.aClass259_12054) {
         var1.anInt3376 = 1395449909 * (int)(var5 + (float)(var1.anInt3376 * -1339592163));
         var2.method5251(0.0F, 0.0F, var5);
      } else if(Class259.aClass259_2830 == this.aClass259_12054) {
         var2.method5237(1.0F, 0.0F, 0.0F, var5);
      } else if(Class259.aClass259_2834 == this.aClass259_12054) {
         var2.method5237(0.0F, 1.0F, 0.0F, var5);
      } else if(Class259.aClass259_2835 == this.aClass259_12054) {
         var2.method5237(0.0F, 0.0F, 1.0F, var5);
      }

   }

   public void method10695(RSByteBuffer var1) {
      this.aClass259_12054 = Class679.method8024(var1.readUnsignedByte(-1559581854), (short)-20574);
      this.aFloat12052 = var1.method9634((byte)1);
      this.aFloat12053 = var1.method9634((byte)1);
   }

   public void method10690(Class309 var1, Class445 var2, Class433 var3) {
      float var4 = (float)Math.sin((double)this.aFloat12051);
      float var5 = this.aFloat12052 * var4;
      if(this.aClass259_12054 == Class259.aClass259_2832) {
         var1.anInt3375 = (int)((float)(var1.anInt3375 * 1939759647) + var5) * 2065471967;
         var2.method5251(var5, 0.0F, 0.0F);
      } else if(this.aClass259_12054 == Class259.aClass259_2831) {
         var1.anInt3374 = 1296896295 * (int)(var5 + (float)(var1.anInt3374 * 298274455));
         var2.method5251(0.0F, var5, 0.0F);
      } else if(Class259.aClass259_2833 == this.aClass259_12054) {
         var1.anInt3376 = 1395449909 * (int)(var5 + (float)(var1.anInt3376 * -1339592163));
         var2.method5251(0.0F, 0.0F, var5);
      } else if(Class259.aClass259_2830 == this.aClass259_12054) {
         var2.method5237(1.0F, 0.0F, 0.0F, var5);
      } else if(Class259.aClass259_2834 == this.aClass259_12054) {
         var2.method5237(0.0F, 1.0F, 0.0F, var5);
      } else if(Class259.aClass259_2835 == this.aClass259_12054) {
         var2.method5237(0.0F, 0.0F, 1.0F, var5);
      }

   }

   public void method10693(RSByteBuffer var1, byte var2) {
      this.aClass259_12054 = Class679.method8024(var1.readUnsignedByte(-231821842), (short)-6863);
      this.aFloat12052 = var1.method9634((byte)1);
      this.aFloat12053 = var1.method9634((byte)1);
   }

   public void method10691(float var1) {
      this.aFloat12051 += this.aFloat12053 * var1;
   }
}
