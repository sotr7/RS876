package com.jagex;

import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Interface42;
import jagdx.Class367;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;

public class Class412 implements Interface42 {
   int anInt4437;
   long aLong4435 = 0L;
   int anInt4434;
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_4433;
   Class166 aClass166_4436;
   boolean aBool4432;

   public void finalize() {
      this.method4907();
   }

   public int method95() {
      return this.anInt4437;
   }

   public Class166 method339() {
      return this.aClass166_4436;
   }

   public void method340(int var1) {
      this.anInt4437 = this.aClass166_4436.anInt1891 * 1990758583 * var1;
      if(this.anInt4437 > this.anInt4434) {
         if(this.aLong4435 != 0L) {
            IUnknown.Release(this.aLong4435);
         }

         int var2 = 8;
         byte var3;
         if(this.aBool4432) {
            var3 = 0;
            var2 |= 512;
         } else {
            var3 = 1;
         }

         this.aLong4435 = IDirect3DDevice.CreateIndexBuffer(this.aClass174_Sub3_Sub1_4433.aLong11450, this.anInt4437, var2, this.aClass166_4436 == Class166.aClass166_1888?101:102, var3);
         this.anInt4434 = this.anInt4437;
      }

   }

   public long method236(int var1, int var2) {
      return IDirect3DIndexBuffer.Lock(this.aLong4435, var1, var2, this.aBool4432?8192:0);
   }

   public void method234() {
      IDirect3DIndexBuffer.Unlock(this.aLong4435);
   }

   public boolean method235(int var1, int var2, long var3) {
      return Class367.method4652(IDirect3DIndexBuffer.Upload(this.aLong4435, var1, var2, this.aBool4432?8192:0, var3));
   }

   void method4906() {
      if(this.aLong4435 != 0L) {
         this.aClass174_Sub3_Sub1_4433.method10508(this.aLong4435);
         this.aLong4435 = 0L;
      }

      this.anInt4434 = 0;
      this.anInt4437 = 0;
   }

   void method4907() {
      if(this.aLong4435 != 0L) {
         this.aClass174_Sub3_Sub1_4433.method10508(this.aLong4435);
         this.aLong4435 = 0L;
      }

      this.anInt4434 = 0;
      this.anInt4437 = 0;
   }

   public long method239(int var1, int var2) {
      return IDirect3DIndexBuffer.Lock(this.aLong4435, var1, var2, this.aBool4432?8192:0);
   }

   public void method141() {
      if(this.aLong4435 != 0L) {
         IUnknown.Release(this.aLong4435);
         this.aLong4435 = 0L;
      }

      this.anInt4434 = 0;
      this.anInt4437 = 0;
      this.aClass174_Sub3_Sub1_4433.method8716(this);
   }

   void method4908() {
      this.method4907();
   }

   public void method342(int var1) {
      this.anInt4437 = this.aClass166_4436.anInt1891 * 1990758583 * var1;
      if(this.anInt4437 > this.anInt4434) {
         if(this.aLong4435 != 0L) {
            IUnknown.Release(this.aLong4435);
         }

         int var2 = 8;
         byte var3;
         if(this.aBool4432) {
            var3 = 0;
            var2 |= 512;
         } else {
            var3 = 1;
         }

         this.aLong4435 = IDirect3DDevice.CreateIndexBuffer(this.aClass174_Sub3_Sub1_4433.aLong11450, this.anInt4437, var2, this.aClass166_4436 == Class166.aClass166_1888?101:102, var3);
         this.anInt4434 = this.anInt4437;
      }

   }

   public long method238(int var1, int var2) {
      return IDirect3DIndexBuffer.Lock(this.aLong4435, var1, var2, this.aBool4432?8192:0);
   }

   public void method140() {
      if(this.aLong4435 != 0L) {
         IUnknown.Release(this.aLong4435);
         this.aLong4435 = 0L;
      }

      this.anInt4434 = 0;
      this.anInt4437 = 0;
      this.aClass174_Sub3_Sub1_4433.method8716(this);
   }

   public void method240() {
      IDirect3DIndexBuffer.Unlock(this.aLong4435);
   }

   void method4909() {
      this.method4907();
   }

   public boolean method241(int var1, int var2, long var3) {
      return Class367.method4652(IDirect3DIndexBuffer.Upload(this.aLong4435, var1, var2, this.aBool4432?8192:0, var3));
   }

   public int method242() {
      return this.anInt4437;
   }

   public int method244() {
      return this.anInt4437;
   }

   public int method243() {
      return this.anInt4437;
   }

   public int method237() {
      return this.anInt4437;
   }

   public Class166 method341() {
      return this.aClass166_4436;
   }

   public boolean method245(int var1, int var2, long var3) {
      return Class367.method4652(IDirect3DIndexBuffer.Upload(this.aLong4435, var1, var2, this.aBool4432?8192:0, var3));
   }

   void method4910() {
      if(this.aLong4435 != 0L) {
         this.aClass174_Sub3_Sub1_4433.method10508(this.aLong4435);
         this.aLong4435 = 0L;
      }

      this.anInt4434 = 0;
      this.anInt4437 = 0;
   }

   Class412(Class174_Sub3_Sub1 var1, Class166 var2, boolean var3) {
      this.aClass174_Sub3_Sub1_4433 = var1;
      this.aClass166_4436 = var2;
      this.aBool4432 = var3;
      this.aClass174_Sub3_Sub1_4433.method8819(this);
   }
}
