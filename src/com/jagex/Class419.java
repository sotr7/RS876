package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Interface54;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class419 implements Interface54 {
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_4518;
   int anInt4520;
   int anInt4519;
   Class144 aClass144_4521;
   Class166 aClass166_4517;
   long aLong4522;

   Class419(Class174_Sub3_Sub1 var1, Class144 var2, Class166 var3, int var4, int var5, int var6) {
      this.aClass174_Sub3_Sub1_4518 = var1;
      this.anInt4520 = var4;
      this.anInt4519 = var5;
      this.aClass144_4521 = var2;
      this.aClass166_4517 = var3;
      this.aLong4522 = IDirect3DDevice.CreateRenderTarget(this.aClass174_Sub3_Sub1_4518.aLong11450, var4, var5, Class174_Sub3_Sub1.method10502(this.aClass144_4521, this.aClass166_4517), 0 + var6, 0, false);
      this.aClass174_Sub3_Sub1_4518.method8819(this);
   }

   public int method1() {
      return this.anInt4520;
   }

   public void method207() {
      if(this.aLong4522 != 0L) {
         this.aClass174_Sub3_Sub1_4518.method10508(this.aLong4522);
         this.aLong4522 = 0L;
      }

   }

   public long method11() {
      return this.aLong4522;
   }

   public void method140() {
      if(this.aLong4522 != 0L) {
         IUnknown.Release(this.aLong4522);
         this.aLong4522 = 0L;
      }

      this.aClass174_Sub3_Sub1_4518.method8716(this);
   }

   public void method356() {
      if(this.aLong4522 != 0L) {
         this.aClass174_Sub3_Sub1_4518.method10508(this.aLong4522);
         this.aLong4522 = 0L;
      }

   }

   public void finalize() {
      this.method356();
   }

   public int method21() {
      return this.anInt4520;
   }

   public int method90() {
      return this.anInt4520;
   }

   public int method95() {
      return this.anInt4519;
   }

   public int method92() {
      return this.anInt4519;
   }

   public int method8() {
      return this.anInt4519;
   }

   public long method357() {
      return this.aLong4522;
   }

   public void method141() {
      if(this.aLong4522 != 0L) {
         IUnknown.Release(this.aLong4522);
         this.aLong4522 = 0L;
      }

      this.aClass174_Sub3_Sub1_4518.method8716(this);
   }

   void method4978() {
      this.method356();
   }

   void method4979() {
      this.method356();
   }

   public int method94() {
      return this.anInt4519;
   }

   public long method358() {
      return this.aLong4522;
   }

   public long method355() {
      return this.aLong4522;
   }

   public void method359() {
      if(this.aLong4522 != 0L) {
         this.aClass174_Sub3_Sub1_4518.method10508(this.aLong4522);
         this.aLong4522 = 0L;
      }

   }

   public int method9() {
      return this.anInt4519;
   }
}
