package com.jagex;

import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Interface50;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class406 implements Interface50 {
   long aLong4291;
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_4288;
   int anInt4290;
   int anInt4292;
   Class166 aClass166_4289;

   public int method92() {
      return this.anInt4292;
   }

   public int method1() {
      return this.anInt4290;
   }

   public long method357() {
      return this.aLong4291;
   }

   public int method95() {
      return this.anInt4292;
   }

   public void method140() {
      if(this.aLong4291 != 0L) {
         IUnknown.Release(this.aLong4291);
         this.aLong4291 = 0L;
      }

      this.aClass174_Sub3_Sub1_4288.method8716(this);
   }

   public int method9() {
      return this.anInt4292;
   }

   Class406(Class174_Sub3_Sub1 var1, Class166 var2, int var3, int var4, int var5) {
      this.aClass174_Sub3_Sub1_4288 = var1;
      this.anInt4290 = var3;
      this.anInt4292 = var4;
      this.aClass166_4289 = var2;
      this.aLong4291 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass174_Sub3_Sub1_4288.aLong11450, var3, var4, Class174_Sub3_Sub1.method10517(this.aClass166_4289), 0 + var5, 0, false);
      this.aClass174_Sub3_Sub1_4288.method8819(this);
   }

   public long method355() {
      return this.aLong4291;
   }

   public int method90() {
      return this.anInt4290;
   }

   public int method94() {
      return this.anInt4292;
   }

   public long method11() {
      return this.aLong4291;
   }

   public void finalize() {
      this.method356();
   }

   public int method21() {
      return this.anInt4290;
   }

   public void method141() {
      if(this.aLong4291 != 0L) {
         IUnknown.Release(this.aLong4291);
         this.aLong4291 = 0L;
      }

      this.aClass174_Sub3_Sub1_4288.method8716(this);
   }

   void method4876() {
      this.method356();
   }

   void method4877() {
      this.method356();
   }

   public void method356() {
      if(this.aLong4291 != 0L) {
         this.aClass174_Sub3_Sub1_4288.method10508(this.aLong4291);
         this.aLong4291 = 0L;
      }

   }

   public long method358() {
      return this.aLong4291;
   }

   public int method8() {
      return this.anInt4292;
   }

   public void method359() {
      if(this.aLong4291 != 0L) {
         this.aClass174_Sub3_Sub1_4288.method10508(this.aLong4291);
         this.aLong4291 = 0L;
      }

   }

   public void method207() {
      if(this.aLong4291 != 0L) {
         this.aClass174_Sub3_Sub1_4288.method10508(this.aLong4291);
         this.aLong4291 = 0L;
      }

   }
}
