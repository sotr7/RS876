package com.jagex;

import com.jagex.Class446;

public class Class426 {
   float[] aFloatArray4799;
   float aFloat4800;
   Class446[] aClass446Array4801 = new Class446[4];

   void method5010() {
      byte var1 = 20;
      double[] var2 = this.method5013(0.0F);
      float var3 = 0.0F;
      Class446 var4 = Class446.method5312();

      int var5;
      double[] var6;
      for(var5 = 1; var5 <= var1; ++var5) {
         var6 = this.method5013((float)var5 / (float)var1);
         var4.aFloat4917 = (float)(var6[0] - var2[0]);
         var4.aFloat4915 = (float)(var6[1] - var2[1]);
         var4.aFloat4919 = (float)(var6[2] - var2[2]);
         var3 += var4.method5276();
         var2 = var6;
      }

      var5 = (int)(var3 / 20.0F);
      if(var5 < var1) {
         var5 = var1;
      }

      this.aFloatArray4799 = new float[var5];
      var2 = this.method5013(0.0F);
      float var7 = 0.0F;

      for(int var8 = 1; var8 <= var5; ++var8) {
         var6 = this.method5013((float)var8 / (float)var5);
         var4.aFloat4917 = (float)(var6[0] - var2[0]);
         var4.aFloat4915 = (float)(var6[1] - var2[1]);
         var4.aFloat4919 = (float)(var6[2] - var2[2]);
         float var9 = var4.method5276();
         var7 += var9;
         this.aFloatArray4799[var8 - 1] = var9;
         var2 = var6;
      }

      this.aFloat4800 = var7;
   }

   float method5011() {
      if(this.aFloat4800 == -1.0F) {
         this.method5010();
      }

      return this.aFloat4800;
   }

   void method5012(int var1, Class446 var2) {
      this.aClass446Array4801[var1].method5267(var2);
      this.method5024();
   }

   Class426() {
      for(int var1 = 0; var1 < 4; ++var1) {
         this.aClass446Array4801[var1] = new Class446();
      }

      this.method5024();
   }

   double[] method5013(float var1) {
      double[] var2 = new double[3];
      float var3 = var1 * var1;
      float var4 = var3 * var1;
      double var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4917 - this.aClass446Array4801[0].aFloat4917));
      double var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4917 - this.aClass446Array4801[1].aFloat4917)) - var5;
      double var9 = (double)(this.aClass446Array4801[3].aFloat4917 - this.aClass446Array4801[0].aFloat4917) - var5 - var7;
      var2[0] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4917;
      var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4915 - this.aClass446Array4801[0].aFloat4915));
      var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4915 - this.aClass446Array4801[1].aFloat4915)) - var5;
      var9 = (double)(this.aClass446Array4801[3].aFloat4915 - this.aClass446Array4801[0].aFloat4915) - var5 - var7;
      var2[1] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4915;
      var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4919 - this.aClass446Array4801[0].aFloat4919));
      var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4919 - this.aClass446Array4801[1].aFloat4919)) - var5;
      var9 = (double)(this.aClass446Array4801[3].aFloat4919 - this.aClass446Array4801[0].aFloat4919) - var5 - var7;
      var2[2] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4919;
      return var2;
   }

   float method5014() {
      if(this.aFloat4800 == -1.0F) {
         this.method5010();
      }

      return this.aFloat4800;
   }

   double[] method5015(float var1) {
      double[] var2 = new double[3];
      float var3 = var1 * var1;
      float var4 = var3 * var1;
      double var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4917 - this.aClass446Array4801[0].aFloat4917));
      double var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4917 - this.aClass446Array4801[1].aFloat4917)) - var5;
      double var9 = (double)(this.aClass446Array4801[3].aFloat4917 - this.aClass446Array4801[0].aFloat4917) - var5 - var7;
      var2[0] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4917;
      var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4915 - this.aClass446Array4801[0].aFloat4915));
      var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4915 - this.aClass446Array4801[1].aFloat4915)) - var5;
      var9 = (double)(this.aClass446Array4801[3].aFloat4915 - this.aClass446Array4801[0].aFloat4915) - var5 - var7;
      var2[1] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4915;
      var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4919 - this.aClass446Array4801[0].aFloat4919));
      var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4919 - this.aClass446Array4801[1].aFloat4919)) - var5;
      var9 = (double)(this.aClass446Array4801[3].aFloat4919 - this.aClass446Array4801[0].aFloat4919) - var5 - var7;
      var2[2] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4919;
      return var2;
   }

   void method5016() {
      this.aFloat4800 = -1.0F;
      this.aFloatArray4799 = null;
   }

   Class446 method5017(int var1) {
      return this.aClass446Array4801[var1];
   }

   void method5018() {
      byte var1 = 20;
      double[] var2 = this.method5013(0.0F);
      float var3 = 0.0F;
      Class446 var4 = Class446.method5312();

      int var5;
      double[] var6;
      for(var5 = 1; var5 <= var1; ++var5) {
         var6 = this.method5013((float)var5 / (float)var1);
         var4.aFloat4917 = (float)(var6[0] - var2[0]);
         var4.aFloat4915 = (float)(var6[1] - var2[1]);
         var4.aFloat4919 = (float)(var6[2] - var2[2]);
         var3 += var4.method5276();
         var2 = var6;
      }

      var5 = (int)(var3 / 20.0F);
      if(var5 < var1) {
         var5 = var1;
      }

      this.aFloatArray4799 = new float[var5];
      var2 = this.method5013(0.0F);
      float var7 = 0.0F;

      for(int var8 = 1; var8 <= var5; ++var8) {
         var6 = this.method5013((float)var8 / (float)var5);
         var4.aFloat4917 = (float)(var6[0] - var2[0]);
         var4.aFloat4915 = (float)(var6[1] - var2[1]);
         var4.aFloat4919 = (float)(var6[2] - var2[2]);
         float var9 = var4.method5276();
         var7 += var9;
         this.aFloatArray4799[var8 - 1] = var9;
         var2 = var6;
      }

      this.aFloat4800 = var7;
   }

   double[] method5019(float var1) {
      double[] var2 = new double[3];
      float var3 = var1 * var1;
      float var4 = var3 * var1;
      double var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4917 - this.aClass446Array4801[0].aFloat4917));
      double var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4917 - this.aClass446Array4801[1].aFloat4917)) - var5;
      double var9 = (double)(this.aClass446Array4801[3].aFloat4917 - this.aClass446Array4801[0].aFloat4917) - var5 - var7;
      var2[0] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4917;
      var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4915 - this.aClass446Array4801[0].aFloat4915));
      var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4915 - this.aClass446Array4801[1].aFloat4915)) - var5;
      var9 = (double)(this.aClass446Array4801[3].aFloat4915 - this.aClass446Array4801[0].aFloat4915) - var5 - var7;
      var2[1] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4915;
      var5 = (double)(3.0F * (this.aClass446Array4801[1].aFloat4919 - this.aClass446Array4801[0].aFloat4919));
      var7 = (double)(3.0F * (this.aClass446Array4801[2].aFloat4919 - this.aClass446Array4801[1].aFloat4919)) - var5;
      var9 = (double)(this.aClass446Array4801[3].aFloat4919 - this.aClass446Array4801[0].aFloat4919) - var5 - var7;
      var2[2] = var9 * (double)var4 + var7 * (double)var3 + var5 * (double)var1 + (double)this.aClass446Array4801[0].aFloat4919;
      return var2;
   }

   float method5020(float var1) {
      if(this.aFloat4800 == -1.0F) {
         this.method5010();
      }

      if(var1 <= 0.0F) {
         return 0.0F;
      } else if(var1 >= this.aFloat4800) {
         return 1.0F;
      } else {
         float var2 = 0.0F;
         float var3 = this.aFloatArray4799[0];

         float var5;
         for(int var4 = 1; var4 < this.aFloatArray4799.length; ++var4) {
            if(var1 < var3) {
               var5 = (var1 - var2) / (var3 - var2);
               float var6 = (float)(var4 - 1) / (float)this.aFloatArray4799.length;
               float var7 = (float)var4 / (float)this.aFloatArray4799.length;
               return var6 + (var7 - var6) * var5;
            }

            var2 = var3;
            var3 += this.aFloatArray4799[var4];
         }

         float var8 = (var1 - var2) / (var3 - var2);
         var5 = (float)(this.aFloatArray4799.length - 1) / (float)this.aFloatArray4799.length;
         return var5 + (1.0F - var5) * var8;
      }
   }

   float method5021() {
      if(this.aFloat4800 == -1.0F) {
         this.method5010();
      }

      return this.aFloat4800;
   }

   float method5022(float var1) {
      if(this.aFloat4800 == -1.0F) {
         this.method5010();
      }

      if(var1 <= 0.0F) {
         return 0.0F;
      } else if(var1 >= this.aFloat4800) {
         return 1.0F;
      } else {
         float var2 = 0.0F;
         float var3 = this.aFloatArray4799[0];

         float var5;
         for(int var4 = 1; var4 < this.aFloatArray4799.length; ++var4) {
            if(var1 < var3) {
               var5 = (var1 - var2) / (var3 - var2);
               float var6 = (float)(var4 - 1) / (float)this.aFloatArray4799.length;
               float var7 = (float)var4 / (float)this.aFloatArray4799.length;
               return var6 + (var7 - var6) * var5;
            }

            var2 = var3;
            var3 += this.aFloatArray4799[var4];
         }

         float var8 = (var1 - var2) / (var3 - var2);
         var5 = (float)(this.aFloatArray4799.length - 1) / (float)this.aFloatArray4799.length;
         return var5 + (1.0F - var5) * var8;
      }
   }

   float method5023(float var1) {
      if(this.aFloat4800 == -1.0F) {
         this.method5010();
      }

      if(var1 <= 0.0F) {
         return 0.0F;
      } else if(var1 >= this.aFloat4800) {
         return 1.0F;
      } else {
         float var2 = 0.0F;
         float var3 = this.aFloatArray4799[0];

         float var5;
         for(int var4 = 1; var4 < this.aFloatArray4799.length; ++var4) {
            if(var1 < var3) {
               var5 = (var1 - var2) / (var3 - var2);
               float var6 = (float)(var4 - 1) / (float)this.aFloatArray4799.length;
               float var7 = (float)var4 / (float)this.aFloatArray4799.length;
               return var6 + (var7 - var6) * var5;
            }

            var2 = var3;
            var3 += this.aFloatArray4799[var4];
         }

         float var8 = (var1 - var2) / (var3 - var2);
         var5 = (float)(this.aFloatArray4799.length - 1) / (float)this.aFloatArray4799.length;
         return var5 + (1.0F - var5) * var8;
      }
   }

   void method5024() {
      this.aFloat4800 = -1.0F;
      this.aFloatArray4799 = null;
   }
}
