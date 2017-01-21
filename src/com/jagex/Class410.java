package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class341;
import com.jagex.Interface36;
import jagdx.IUnknown;

public abstract class Class410 implements Interface36 {
   long aLong4378 = 0L;
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_4377;
   Class144 aClass144_4374;
   Class166 aClass166_4376;
   boolean aBool4375;

   public void method338(Class341 var1) {
   }

   void method4897() {
      if(this.aLong4378 != 0L) {
         this.aClass174_Sub3_Sub1_4377.method10508(this.aLong4378);
         this.aLong4378 = 0L;
      }

   }

   public void method334(Class341 var1) {
   }

   public void method140() {
      if(this.aLong4378 != 0L) {
         IUnknown.Release(this.aLong4378);
         this.aLong4378 = 0L;
      }

      this.aClass174_Sub3_Sub1_4377.method8716(this);
   }

   void method4898() {
      this.method4897();
   }

   public void finalize() {
      this.method4897();
   }

   long method4899() {
      return this.aLong4378;
   }

   public void method141() {
      if(this.aLong4378 != 0L) {
         IUnknown.Release(this.aLong4378);
         this.aLong4378 = 0L;
      }

      this.aClass174_Sub3_Sub1_4377.method8716(this);
   }

   Class410(Class174_Sub3_Sub1 var1, Class144 var2, Class166 var3, boolean var4, int var5) {
      this.aClass174_Sub3_Sub1_4377 = var1;
      this.aClass144_4374 = var2;
      this.aClass166_4376 = var3;
      this.aBool4375 = var4;
      this.aClass174_Sub3_Sub1_4377.method8819(this);
   }

   void method4900() {
      this.method4897();
   }

   long method4901() {
      return this.aLong4378;
   }
}
