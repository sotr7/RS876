package com.jagex;

import com.jagex.Class174_Sub2;
import com.jagex.Class184_Sub1;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class184_Sub1_Sub1 extends Class184_Sub1 {
   boolean aBool11346;
   boolean aBool11345;
   Class174_Sub2 aClass174_Sub2_11351;
   Canvas aCanvas11344;
   OpenGL anOpenGL11350;
   long aLong11347;
   int anInt11349;
   int anInt11348;

   public int method8458(int var1, int var2) {
      return 0;
   }

   Class184_Sub1_Sub1(Class174_Sub2 var1, Canvas var2, long var3) {
      this.aBool11346 = false;
      this.aBool11345 = false;
      this.aClass174_Sub2_11351 = var1;
      this.aCanvas11344 = var2;
      this.anOpenGL11350 = var1.anOpenGL9643;
      this.aLong11347 = var3;
      this.method10435();
   }

   boolean method2704() {
      return true;
   }

   boolean method2696() {
      return true;
   }

   void method8454(int var1, int var2) {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.surfaceResized(this.aLong11347);
         this.method10435();
         if(this == this.aClass174_Sub2_11351.method2247((byte)6)) {
            this.aClass174_Sub2_11351.method8602();
         }

      }
   }

   public int method2693() {
      return this.anInt11349;
   }

   public int method8451() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.swapBuffers(this.aLong11347);
         return 0;
      }
   }

   public int method8453(int var1, int var2) {
      return 0;
   }

   boolean method363() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         if(!this.aBool11345) {
            this.anOpenGL11350.setSurface(this.aLong11347);
            this.aBool11345 = true;
         }

         this.aClass174_Sub2_11351.method8635();
         return true;
      }
   }

   boolean method2694() {
      return true;
   }

   public void method140() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.releaseSurface(this.aCanvas11344, this.aLong11347);
         this.aBool11346 = true;
         this.aBool11345 = false;
      }
   }

   public int method2691() {
      return this.anInt11348;
   }

   boolean method2705() {
      return true;
   }

   public int method2697() {
      return this.anInt11348;
   }

   public int method2698() {
      return this.anInt11348;
   }

   public int method2699() {
      return this.anInt11348;
   }

   public int method2695() {
      return this.anInt11348;
   }

   void method10435() {
      Dimension var1 = this.aCanvas11344.getSize();
      this.anInt11349 = var1.height;
      this.anInt11348 = var1.width;
   }

   public int method2702() {
      return this.anInt11349;
   }

   boolean method364() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         if(!this.aBool11345) {
            this.anOpenGL11350.setSurface(this.aLong11347);
            this.aBool11345 = true;
         }

         this.aClass174_Sub2_11351.method8635();
         return true;
      }
   }

   boolean method2692() {
      return true;
   }

   void method8456(int var1, int var2) {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.surfaceResized(this.aLong11347);
         this.method10435();
         if(this == this.aClass174_Sub2_11351.method2247((byte)6)) {
            this.aClass174_Sub2_11351.method8602();
         }

      }
   }

   public int method2703() {
      return this.anInt11349;
   }

   public int method2700() {
      return this.anInt11348;
   }

   boolean method2706() {
      return true;
   }

   public void method208() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.releaseSurface(this.aCanvas11344, this.aLong11347);
         this.aBool11346 = true;
         this.aBool11345 = false;
      }
   }

   public int method2701() {
      return this.anInt11349;
   }

   void method8455(int var1, int var2) {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.surfaceResized(this.aLong11347);
         this.method10435();
         if(this == this.aClass174_Sub2_11351.method2247((byte)6)) {
            this.aClass174_Sub2_11351.method8602();
         }

      }
   }

   public int method8457(int var1, int var2) {
      return 0;
   }

   Class184_Sub1_Sub1(Class174_Sub2 var1, Canvas var2) {
      this(var1, var2, var1.anOpenGL9643.prepareSurface(var2));
   }

   void method10436() {
      Dimension var1 = this.aCanvas11344.getSize();
      this.anInt11349 = var1.height;
      this.anInt11348 = var1.width;
   }

   public int method8452() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.swapBuffers(this.aLong11347);
         return 0;
      }
   }

   public int method8460() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.swapBuffers(this.aLong11347);
         return 0;
      }
   }

   public int method8459() {
      if(this.aBool11346) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL11350.swapBuffers(this.aLong11347);
         return 0;
      }
   }
}
