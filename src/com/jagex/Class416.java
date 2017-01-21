package com.jagex;

import com.jagex.Class410_Sub1_Sub1;
import com.jagex.Interface50;
import com.jagex.Interface54;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class416 implements Interface54, Interface50 {
   long aLong4479;
   int anInt4481;
   Class410_Sub1_Sub1 aClass410_Sub1_Sub1_4480;

   public int method21() {
      return this.aClass410_Sub1_Sub1_4480.method1();
   }

   public int method1() {
      return this.aClass410_Sub1_Sub1_4480.method1();
   }

   public int method94() {
      return this.aClass410_Sub1_Sub1_4480.method94();
   }

   public void method141() {
      if(this.aLong4479 != 0L) {
         IUnknown.Release(this.aLong4479);
         this.aLong4479 = 0L;
      }

      this.aClass410_Sub1_Sub1_4480.aClass174_Sub3_Sub1_4377.method8716(this);
   }

   public void method140() {
      if(this.aLong4479 != 0L) {
         IUnknown.Release(this.aLong4479);
         this.aLong4479 = 0L;
      }

      this.aClass410_Sub1_Sub1_4480.aClass174_Sub3_Sub1_4377.method8716(this);
   }

   public void method356() {
      if(this.aLong4479 != 0L) {
         this.aClass410_Sub1_Sub1_4480.aClass174_Sub3_Sub1_4377.method10508(this.aLong4479);
         this.aLong4479 = 0L;
      }

   }

   public long method11() {
      if(this.aLong4479 == 0L) {
         this.aLong4479 = IDirect3DTexture.GetSurfaceLevel(this.aClass410_Sub1_Sub1_4480.aLong4378, this.anInt4481);
      }

      return this.aLong4479;
   }

   public int method8() {
      return this.aClass410_Sub1_Sub1_4480.method94();
   }

   public int method92() {
      return this.aClass410_Sub1_Sub1_4480.method94();
   }

   public int method95() {
      return this.aClass410_Sub1_Sub1_4480.method94();
   }

   Class416(Class410_Sub1_Sub1 var1, int var2) {
      this.anInt4481 = var2;
      this.aClass410_Sub1_Sub1_4480 = var1;
      this.aClass410_Sub1_Sub1_4480.aClass174_Sub3_Sub1_4377.method8819(this);
   }

   public long method358() {
      if(this.aLong4479 == 0L) {
         this.aLong4479 = IDirect3DTexture.GetSurfaceLevel(this.aClass410_Sub1_Sub1_4480.aLong4378, this.anInt4481);
      }

      return this.aLong4479;
   }

   public int method9() {
      return this.aClass410_Sub1_Sub1_4480.method94();
   }

   public void finalize() {
      this.method356();
   }

   void method4938() {
      this.method356();
   }

   void method4939() {
      this.method356();
   }

   public long method357() {
      if(this.aLong4479 == 0L) {
         this.aLong4479 = IDirect3DTexture.GetSurfaceLevel(this.aClass410_Sub1_Sub1_4480.aLong4378, this.anInt4481);
      }

      return this.aLong4479;
   }

   public int method90() {
      return this.aClass410_Sub1_Sub1_4480.method1();
   }

   public long method355() {
      if(this.aLong4479 == 0L) {
         this.aLong4479 = IDirect3DTexture.GetSurfaceLevel(this.aClass410_Sub1_Sub1_4480.aLong4378, this.anInt4481);
      }

      return this.aLong4479;
   }

   public void method359() {
      if(this.aLong4479 != 0L) {
         this.aClass410_Sub1_Sub1_4480.aClass174_Sub3_Sub1_4377.method10508(this.aLong4479);
         this.aLong4479 = 0L;
      }

   }

   public void method207() {
      if(this.aLong4479 != 0L) {
         this.aClass410_Sub1_Sub1_4480.aClass174_Sub3_Sub1_4377.method10508(this.aLong4479);
         this.aLong4479 = 0L;
      }

   }
}
