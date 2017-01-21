package com.jagex;

import com.jagex.Class440;
import com.jagex.Class445;
import com.jagex.RSByteBuffer;

public class Class446 {
   static int anInt4914;
   public float aFloat4917;
   public float aFloat4915;
   public float aFloat4919;
   static int anInt4918;
   static Class446[] aClass446Array4916;

   public static final float method5262(Class446 var0, Class446 var1) {
      return var0.method5265(var1);
   }

   public static Class446 method5263(RSByteBuffer var0) {
      Class446[] var1 = aClass446Array4916;
      synchronized(var1) {
         if(anInt4914 == 0) {
            return new Class446(var0);
         } else {
            aClass446Array4916[--anInt4914].method5306(var0);
            return aClass446Array4916[anInt4914];
         }
      }
   }

   public final void method5264(float var1) {
      this.aFloat4917 /= var1;
      this.aFloat4915 /= var1;
      this.aFloat4919 /= var1;
   }

   public Class446() {
   }

   public Class446(float var1, float var2, float var3) {
      this.aFloat4917 = var1;
      this.aFloat4915 = var2;
      this.aFloat4919 = var3;
   }

   public Class446(Class446 var1) {
      this.aFloat4917 = var1.aFloat4917;
      this.aFloat4915 = var1.aFloat4915;
      this.aFloat4919 = var1.aFloat4919;
   }

   Class446(RSByteBuffer var1) {
      this.aFloat4917 = var1.method9634((byte)1);
      this.aFloat4915 = var1.method9634((byte)1);
      this.aFloat4919 = var1.method9634((byte)1);
   }

   public final float method5265(Class446 var1) {
      return this.aFloat4917 * var1.aFloat4917 + this.aFloat4915 * var1.aFloat4915 + this.aFloat4919 * var1.aFloat4919;
   }

   public void method5266(float var1, float var2, float var3) {
      this.aFloat4917 = var1;
      this.aFloat4915 = var2;
      this.aFloat4919 = var3;
   }

   public void method5267(Class446 var1) {
      this.method5266(var1.aFloat4917, var1.aFloat4915, var1.aFloat4919);
   }

   public final void method5268() {
      this.aFloat4919 = 0.0F;
      this.aFloat4915 = 0.0F;
      this.aFloat4917 = 0.0F;
   }

   public boolean method5269(Class446 var1) {
      return this.aFloat4917 == var1.aFloat4917 && this.aFloat4915 == var1.aFloat4915 && this.aFloat4919 == var1.aFloat4919;
   }

   public final void method5270() {
      this.aFloat4917 = -this.aFloat4917;
      this.aFloat4915 = -this.aFloat4915;
      this.aFloat4919 = -this.aFloat4919;
   }

   public static void method5271(int var0) {
      anInt4918 = var0;
      aClass446Array4916 = new Class446[var0];
      anInt4914 = 0;
   }

   public final void method5272(Class446 var1) {
      this.aFloat4917 += var1.aFloat4917;
      this.aFloat4915 += var1.aFloat4915;
      this.aFloat4919 += var1.aFloat4919;
   }

   public static final Class446 method5273(Class446 var0, Class446 var1) {
      Class446 var2 = method5305(var0);
      var2.method5272(var1);
      return var2;
   }

   public static void method5274(int var0) {
      anInt4918 = var0;
      aClass446Array4916 = new Class446[var0];
      anInt4914 = 0;
   }

   public static final Class446 method5275(Class446 var0, Class446 var1) {
      Class446 var2 = method5305(var0);
      var2.method5299(var1);
      return var2;
   }

   public final float method5276() {
      return (float)Math.sqrt((double)(this.aFloat4917 * this.aFloat4917 + this.aFloat4915 * this.aFloat4915 + this.aFloat4919 * this.aFloat4919));
   }

   public final void method5277(Class445 var1) {
      float var2 = this.aFloat4917;
      float var3 = this.aFloat4915;
      this.aFloat4917 = var1.aFloat4902 * var2 + var1.aFloat4901 * var3 + var1.aFloat4908 * this.aFloat4919 + var1.aFloat4910;
      this.aFloat4915 = var1.aFloat4911 * var2 + var1.aFloat4906 * var3 + var1.aFloat4909 * this.aFloat4919 + var1.aFloat4912;
      this.aFloat4919 = var1.aFloat4904 * var2 + var1.aFloat4907 * var3 + var1.aFloat4905 * this.aFloat4919 + var1.aFloat4913;
   }

   public void method5278() {
      Class446[] var1 = aClass446Array4916;
      synchronized(var1) {
         if(anInt4914 < anInt4918 - 1) {
            aClass446Array4916[anInt4914++] = this;
         }

      }
   }

   final void method5279(Class446 var1) {
      this.aFloat4917 *= var1.aFloat4917;
      this.aFloat4915 *= var1.aFloat4915;
      this.aFloat4919 *= var1.aFloat4919;
   }

   public static final Class446 method5280(Class446 var0, Class446 var1) {
      Class446 var2 = method5305(var0);
      var2.method5279(var1);
      return var2;
   }

   public final void method5281(float var1) {
      this.aFloat4917 *= var1;
      this.aFloat4915 *= var1;
      this.aFloat4919 *= var1;
   }

   final void method5282(Class446 var1) {
      this.aFloat4917 /= var1.aFloat4917;
      this.aFloat4915 /= var1.aFloat4915;
      this.aFloat4919 /= var1.aFloat4919;
   }

   public static final Class446 method5283(Class446 var0, Class446 var1) {
      Class446 var2 = method5305(var0);
      var2.method5282(var1);
      return var2;
   }

   final void method5284(Class446 var1) {
      this.method5266(this.aFloat4915 * var1.aFloat4919 - this.aFloat4919 * var1.aFloat4915, this.aFloat4919 * var1.aFloat4917 - this.aFloat4917 * var1.aFloat4919, this.aFloat4917 * var1.aFloat4915 - this.aFloat4915 * var1.aFloat4917);
   }

   public static final Class446 method5285(Class446 var0, float var1) {
      Class446 var2 = method5305(var0);
      var2.method5281(var1);
      return var2;
   }

   public final void method5286(Class440 var1) {
      Class440 var2 = Class440.method5196(this.aFloat4917, this.aFloat4915, this.aFloat4919, 0.0F);
      Class440 var3 = Class440.method5170(var1);
      Class440 var4 = Class440.method5175(var3, var2);
      var4.method5194(var1);
      this.method5266(var4.aFloat4871, var4.aFloat4868, var4.aFloat4873);
      var2.method5163();
      var3.method5163();
      var4.method5163();
   }

   public final void method5287(Class445 var1) {
      float var2 = this.aFloat4917;
      float var3 = this.aFloat4915;
      this.aFloat4917 = var1.aFloat4902 * var2 + var1.aFloat4901 * var3 + var1.aFloat4908 * this.aFloat4919;
      this.aFloat4915 = var1.aFloat4911 * var2 + var1.aFloat4906 * var3 + var1.aFloat4909 * this.aFloat4919;
      this.aFloat4919 = var1.aFloat4904 * var2 + var1.aFloat4907 * var3 + var1.aFloat4905 * this.aFloat4919;
   }

   public final void method5288(Class446 var1, float var2) {
      this.method5281(1.0F - var2);
      this.method5272(method5285(var1, var2));
   }

   public String toString() {
      return this.aFloat4917 + ", " + this.aFloat4915 + ", " + this.aFloat4919;
   }

   static {
      new Class446(0.0F, 0.0F, 0.0F);
      aClass446Array4916 = new Class446[0];
   }

   public String method5289() {
      return this.aFloat4917 + ", " + this.aFloat4915 + ", " + this.aFloat4919;
   }

   public static void method5290(int var0) {
      anInt4918 = var0;
      aClass446Array4916 = new Class446[var0];
      anInt4914 = 0;
   }

   public static void method5291(int var0) {
      anInt4918 = var0;
      aClass446Array4916 = new Class446[var0];
      anInt4914 = 0;
   }

   public static void method5292(int var0) {
      anInt4918 = var0;
      aClass446Array4916 = new Class446[var0];
      anInt4914 = 0;
   }

   public static void method5293(int var0) {
      anInt4918 = var0;
      aClass446Array4916 = new Class446[var0];
      anInt4914 = 0;
   }

   final void method5294(Class446 var1) {
      this.method5266(this.aFloat4915 * var1.aFloat4919 - this.aFloat4919 * var1.aFloat4915, this.aFloat4919 * var1.aFloat4917 - this.aFloat4917 * var1.aFloat4919, this.aFloat4917 * var1.aFloat4915 - this.aFloat4915 * var1.aFloat4917);
   }

   public final void method5295() {
      if(this.aFloat4917 < 0.0F) {
         this.aFloat4917 *= -1.0F;
      }

      if(this.aFloat4915 < 0.0F) {
         this.aFloat4915 *= -1.0F;
      }

      if(this.aFloat4919 < 0.0F) {
         this.aFloat4919 *= -1.0F;
      }

   }

   public void method5296() {
      Class446[] var1 = aClass446Array4916;
      synchronized(var1) {
         if(anInt4914 < anInt4918 - 1) {
            aClass446Array4916[anInt4914++] = this;
         }

      }
   }

   public void method5297() {
      Class446[] var1 = aClass446Array4916;
      synchronized(var1) {
         if(anInt4914 < anInt4918 - 1) {
            aClass446Array4916[anInt4914++] = this;
         }

      }
   }

   public void method5298() {
      Class446[] var1 = aClass446Array4916;
      synchronized(var1) {
         if(anInt4914 < anInt4918 - 1) {
            aClass446Array4916[anInt4914++] = this;
         }

      }
   }

   public final void method5299(Class446 var1) {
      this.aFloat4917 -= var1.aFloat4917;
      this.aFloat4915 -= var1.aFloat4915;
      this.aFloat4919 -= var1.aFloat4919;
   }

   public final void method5300() {
      this.aFloat4919 = 0.0F;
      this.aFloat4915 = 0.0F;
      this.aFloat4917 = 0.0F;
   }

   public final void method5301() {
      this.aFloat4917 = -this.aFloat4917;
      this.aFloat4915 = -this.aFloat4915;
      this.aFloat4919 = -this.aFloat4919;
   }

   public final void method5302() {
      float var1 = 1.0F / this.method5276();
      this.aFloat4917 *= var1;
      this.aFloat4915 *= var1;
      this.aFloat4919 *= var1;
   }

   public final void method5303(float var1) {
      this.aFloat4917 *= var1;
      this.aFloat4915 *= var1;
      this.aFloat4919 *= var1;
   }

   public final void method5304(Class446 var1) {
      this.aFloat4917 += var1.aFloat4917;
      this.aFloat4915 += var1.aFloat4915;
      this.aFloat4919 += var1.aFloat4919;
   }

   public static Class446 method5305(Class446 var0) {
      Class446[] var1 = aClass446Array4916;
      synchronized(var1) {
         if(anInt4914 == 0) {
            return new Class446(var0);
         } else {
            aClass446Array4916[--anInt4914].method5267(var0);
            return aClass446Array4916[anInt4914];
         }
      }
   }

   public void method5306(RSByteBuffer var1) {
      this.aFloat4917 = var1.method9634((byte)1);
      this.aFloat4915 = var1.method9634((byte)1);
      this.aFloat4919 = var1.method9634((byte)1);
   }

   public final void method5307(Class446 var1, float var2) {
      this.aFloat4917 += var1.aFloat4917 * var2;
      this.aFloat4915 += var1.aFloat4915 * var2;
      this.aFloat4919 += var1.aFloat4919 * var2;
   }

   public static final Class446 method5308(Class446 var0, Class446 var1) {
      Class446 var2 = method5305(var0);
      var2.method5294(var1);
      return var2;
   }

   public static Class446 method5309(float var0, float var1, float var2) {
      Class446[] var3 = aClass446Array4916;
      synchronized(var3) {
         if(anInt4914 == 0) {
            return new Class446(var0, var1, var2);
         } else {
            aClass446Array4916[--anInt4914].method5266(var0, var1, var2);
            return aClass446Array4916[anInt4914];
         }
      }
   }

   public final void method5310() {
      float var1 = 1.0F / this.method5276();
      this.aFloat4917 *= var1;
      this.aFloat4915 *= var1;
      this.aFloat4919 *= var1;
   }

   public final void method5311() {
      float var1 = 1.0F / this.method5276();
      this.aFloat4917 *= var1;
      this.aFloat4915 *= var1;
      this.aFloat4919 *= var1;
   }

   public static Class446 method5312() {
      Class446[] var0 = aClass446Array4916;
      synchronized(var0) {
         if(anInt4914 == 0) {
            return new Class446();
         } else {
            aClass446Array4916[--anInt4914].method5268();
            return aClass446Array4916[anInt4914];
         }
      }
   }

   public final void method5313() {
      if(this.aFloat4917 < 0.0F) {
         this.aFloat4917 *= -1.0F;
      }

      if(this.aFloat4915 < 0.0F) {
         this.aFloat4915 *= -1.0F;
      }

      if(this.aFloat4919 < 0.0F) {
         this.aFloat4919 *= -1.0F;
      }

   }

   public final void method5314() {
      if(this.aFloat4917 < 0.0F) {
         this.aFloat4917 *= -1.0F;
      }

      if(this.aFloat4915 < 0.0F) {
         this.aFloat4915 *= -1.0F;
      }

      if(this.aFloat4919 < 0.0F) {
         this.aFloat4919 *= -1.0F;
      }

   }

   public final void method5315() {
      if(this.aFloat4917 < 0.0F) {
         this.aFloat4917 *= -1.0F;
      }

      if(this.aFloat4915 < 0.0F) {
         this.aFloat4915 *= -1.0F;
      }

      if(this.aFloat4919 < 0.0F) {
         this.aFloat4919 *= -1.0F;
      }

   }

   public final void method5316(float var1) {
      this.aFloat4917 *= var1;
      this.aFloat4915 *= var1;
      this.aFloat4919 *= var1;
   }

   public final void method5317(float var1) {
      this.aFloat4917 *= var1;
      this.aFloat4915 *= var1;
      this.aFloat4919 *= var1;
   }

   public final void method5318(Class446 var1) {
      this.aFloat4917 += var1.aFloat4917;
      this.aFloat4915 += var1.aFloat4915;
      this.aFloat4919 += var1.aFloat4919;
   }

   public final void method5319() {
      if(this.aFloat4917 < 0.0F) {
         this.aFloat4917 *= -1.0F;
      }

      if(this.aFloat4915 < 0.0F) {
         this.aFloat4915 *= -1.0F;
      }

      if(this.aFloat4919 < 0.0F) {
         this.aFloat4919 *= -1.0F;
      }

   }
}
