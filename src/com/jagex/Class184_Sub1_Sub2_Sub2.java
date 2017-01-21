package com.jagex;

import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class184_Sub1_Sub2;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class184_Sub1_Sub2_Sub2 extends Class184_Sub1_Sub2 {
   boolean aBool12048;
   Canvas aCanvas12044;
   OpenGL anOpenGL12045;
   long aLong12043;
   int anInt12047;
   int anInt12046;

   void method8455(int var1, int var2) {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         this.anOpenGL12045.surfaceResized(this.aLong12043);
         this.method10883();
         super.method8454(var1, var2);
      }
   }

   Class184_Sub1_Sub2_Sub2(Class174_Sub3_Sub2 var1, Canvas var2, long var3) {
      super(var1);
      this.aBool12048 = false;
      this.aCanvas12044 = var2;
      this.anOpenGL12045 = var1.anOpenGL11492;
      this.aLong12043 = var3;
      this.method10883();
   }

   public int method2691() {
      return this.anInt12046;
   }

   boolean method363() {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         boolean var1 = true;
         if(!this.aBool12048) {
            var1 = this.anOpenGL12045.setSurface(this.aLong12043);
            this.aBool12048 = true;
         }

         return var1 && super.method363();
      }
   }

   public int method2699() {
      return this.anInt12046;
   }

   void method10883() {
      Dimension var1 = this.aCanvas12044.getSize();
      this.anInt12047 = var1.height;
      this.anInt12046 = var1.width;
   }

   public int method8451() {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         this.anOpenGL12045.swapBuffers(this.aLong12043);
         return 0;
      }
   }

   public int method8458(int var1, int var2) {
      return 0;
   }

   void method8454(int var1, int var2) {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         this.anOpenGL12045.surfaceResized(this.aLong12043);
         this.method10883();
         super.method8454(var1, var2);
      }
   }

   boolean method2694() {
      return true;
   }

   public void method140() {
      if(this.aLong12043 != 0L) {
         this.anOpenGL12045.releaseSurface(this.aCanvas12044, this.aLong12043);
         this.aLong12043 = 0L;
      }

   }

   public int method2700() {
      return this.anInt12046;
   }

   public int method2695() {
      return this.anInt12046;
   }

   public int method8452() {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         this.anOpenGL12045.swapBuffers(this.aLong12043);
         return 0;
      }
   }

   public int method2698() {
      return this.anInt12046;
   }

   public int method8460() {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         this.anOpenGL12045.swapBuffers(this.aLong12043);
         return 0;
      }
   }

   public int method2703() {
      return this.anInt12047;
   }

   Class184_Sub1_Sub2_Sub2(Class174_Sub3_Sub2 var1, Canvas var2) {
      this(var1, var2, var1.anOpenGL11492.prepareSurface(var2));
   }

   public int method2693() {
      return this.anInt12047;
   }

   boolean method364() {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         boolean var1 = true;
         if(!this.aBool12048) {
            var1 = this.anOpenGL12045.setSurface(this.aLong12043);
            this.aBool12048 = true;
         }

         return var1 && super.method363();
      }
   }

   boolean method2692() {
      return true;
   }

   boolean method2696() {
      return true;
   }

   boolean method2704() {
      return true;
   }

   boolean method2706() {
      return true;
   }

   boolean method2705() {
      return true;
   }

   public void method208() {
      if(this.aLong12043 != 0L) {
         this.anOpenGL12045.releaseSurface(this.aCanvas12044, this.aLong12043);
         this.aLong12043 = 0L;
      }

   }

   public int method2702() {
      return this.anInt12047;
   }

   void method8456(int var1, int var2) {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         this.anOpenGL12045.surfaceResized(this.aLong12043);
         this.method10883();
         super.method8454(var1, var2);
      }
   }

   public int method8457(int var1, int var2) {
      return 0;
   }

   public int method2701() {
      return this.anInt12047;
   }

   public int method8453(int var1, int var2) {
      return 0;
   }

   public int method2697() {
      return this.anInt12046;
   }

   public int method8459() {
      if(this.aLong12043 == 0L) {
         throw new IllegalStateException("");
      } else {
         this.anOpenGL12045.swapBuffers(this.aLong12043);
         return 0;
      }
   }

   void method10884() {
      Dimension var1 = this.aCanvas12044.getSize();
      this.anInt12047 = var1.height;
      this.anInt12046 = var1.width;
   }

   void method10885() {
      Dimension var1 = this.aCanvas12044.getSize();
      this.anInt12047 = var1.height;
      this.anInt12046 = var1.width;
   }
}
