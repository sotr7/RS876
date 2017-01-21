package com.jagex;

import com.jagex.Class426;
import com.jagex.Class446;
import com.jagex.RSByteBuffer;

public class Class432 {
   Class426[] aClass426Array4838 = new Class426[1];
   float[] aFloatArray4839 = new float[2];

   public double[] method5065(float var1) {
      int var2 = (int)var1;
      return var2 < this.aClass426Array4838.length?this.aClass426Array4838[var2].method5013(var1 - (float)var2):this.aClass426Array4838[this.aClass426Array4838.length - 1].method5013(1.0F);
   }

   public Class432(RSByteBuffer var1) {
      int var2 = var1.readSmart(-1841773043);
      this.aClass426Array4838[0] = new Class426();
      this.aClass426Array4838[0].method5012(0, Class446.method5263(var1));
      this.aClass426Array4838[0].method5012(1, Class446.method5263(var1));
      this.aFloatArray4839[0] = var1.method9634((byte)1);
      Class446 var3 = Class446.method5263(var1);
      Class446 var4 = Class446.method5263(var1);
      Class446 var5 = Class446.method5275(var3, var4);
      var4.method5278();
      var5.method5272(var3);
      this.aClass426Array4838[0].method5012(3, var3);
      this.aClass426Array4838[0].method5012(2, var5);
      this.aFloatArray4839[1] = var1.method9634((byte)1);

      for(int var6 = 2; var6 < var2; ++var6) {
         Class446 var7 = Class446.method5263(var1);
         Class446 var8 = Class446.method5263(var1);
         Class446 var9 = Class446.method5275(var7, var8);
         var8.method5278();
         var9.method5272(var7);
         this.method5078(var7, var9, var1.method9634((byte)1));
      }

   }

   public float method5066() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 < this.aClass426Array4838.length; ++var2) {
         var1 += this.aClass426Array4838[var2].method5014();
      }

      return var1;
   }

   public double[] method5067(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass426Array4838.length; ++var4) {
         var3 += this.aClass426Array4838[var4].method5014();
         if(var1 < var3) {
            float var5 = this.aClass426Array4838[var4].method5020(var1 - var2);
            return this.aClass426Array4838[var4].method5013(var5);
         }

         var2 = var3;
      }

      return this.aClass426Array4838[this.aClass426Array4838.length - 1].method5013(1.0F);
   }

   public float method5068(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass426Array4838.length; ++var4) {
         var3 += this.aClass426Array4838[var4].method5014();
         if(var1 < var3) {
            return this.aClass426Array4838[var4].method5020(var1 - var2) + (float)var4;
         }

         var2 = var3;
      }

      return (float)this.aClass426Array4838.length;
   }

   public float method5069() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 < this.aClass426Array4838.length; ++var2) {
         var1 += this.aClass426Array4838[var2].method5014();
      }

      return var1;
   }

   public float method5070(float var1) {
      return this.method5071(this.method5068(var1));
   }

   public float method5071(float var1) {
      int var2 = (int)var1;
      if(var2 + 1 < this.aFloatArray4839.length) {
         float var3 = this.aFloatArray4839[var2];
         float var4 = this.aFloatArray4839[var2 + 1];
         float var5 = var1 - (float)var2;
         return (1.0F - var5) * var3 + var5 * var4;
      } else {
         return this.aFloatArray4839[this.aFloatArray4839.length - 1];
      }
   }

   public float method5072(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass426Array4838.length; ++var4) {
         var3 += this.aClass426Array4838[var4].method5014();
         if(var1 < var3) {
            return this.aClass426Array4838[var4].method5020(var1 - var2) + (float)var4;
         }

         var2 = var3;
      }

      return (float)this.aClass426Array4838.length;
   }

   public float method5073() {
      float var1 = 0.0F;

      for(int var2 = 0; var2 < this.aClass426Array4838.length; ++var2) {
         var1 += this.aClass426Array4838[var2].method5014();
      }

      return var1;
   }

   public double[] method5074(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass426Array4838.length; ++var4) {
         var3 += this.aClass426Array4838[var4].method5014();
         if(var1 < var3) {
            float var5 = this.aClass426Array4838[var4].method5020(var1 - var2);
            return this.aClass426Array4838[var4].method5013(var5);
         }

         var2 = var3;
      }

      return this.aClass426Array4838[this.aClass426Array4838.length - 1].method5013(1.0F);
   }

   public int method5075() {
      return this.aClass426Array4838.length;
   }

   public float method5076(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass426Array4838.length; ++var4) {
         var3 += this.aClass426Array4838[var4].method5014();
         if(var1 < var3) {
            return this.aClass426Array4838[var4].method5020(var1 - var2) + (float)var4;
         }

         var2 = var3;
      }

      return (float)this.aClass426Array4838.length;
   }

   public int method5077() {
      return this.aClass426Array4838.length;
   }

   void method5078(Class446 var1, Class446 var2, float var3) {
      Class426[] var4 = new Class426[this.aClass426Array4838.length + 1];
      System.arraycopy(this.aClass426Array4838, 0, var4, 0, this.aClass426Array4838.length);
      Class426 var5 = new Class426();
      Class426 var6 = this.aClass426Array4838[this.aClass426Array4838.length - 1];
      var5.method5012(0, var6.method5017(3));
      Class446 var7 = Class446.method5275(var6.method5017(3), var6.method5017(2));
      var5.method5012(1, Class446.method5273(var6.method5017(3), var7));
      var5.method5012(3, var1);
      var5.method5012(2, var2);
      var4[var4.length - 1] = var5;
      this.aClass426Array4838 = var4;
      float[] var8 = new float[this.aFloatArray4839.length + 1];
      System.arraycopy(this.aFloatArray4839, 0, var8, 0, this.aFloatArray4839.length);
      var8[var8.length - 1] = var3;
      this.aFloatArray4839 = var8;
   }

   public double[] method5079(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;

      for(int var4 = 0; var4 < this.aClass426Array4838.length; ++var4) {
         var3 += this.aClass426Array4838[var4].method5014();
         if(var1 < var3) {
            float var5 = this.aClass426Array4838[var4].method5020(var1 - var2);
            return this.aClass426Array4838[var4].method5013(var5);
         }

         var2 = var3;
      }

      return this.aClass426Array4838[this.aClass426Array4838.length - 1].method5013(1.0F);
   }

   public float method5080(float var1) {
      int var2 = (int)var1;
      if(var2 + 1 < this.aFloatArray4839.length) {
         float var3 = this.aFloatArray4839[var2];
         float var4 = this.aFloatArray4839[var2 + 1];
         float var5 = var1 - (float)var2;
         return (1.0F - var5) * var3 + var5 * var4;
      } else {
         return this.aFloatArray4839[this.aFloatArray4839.length - 1];
      }
   }
}
