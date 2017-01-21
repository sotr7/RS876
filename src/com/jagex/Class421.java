package com.jagex;

import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Interface35;
import jagdx.Class367;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class Class421 implements Interface35 {
   long aLong4723 = 0L;
   int anInt4718;
   int anInt4720;
   byte aByte4721;
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_4719;
   boolean aBool4722;

   public long method239(int var1, int var2) {
      return IDirect3DVertexBuffer.Lock(this.aLong4723, var1, var2, this.aBool4722?8192:0);
   }

   public int method95() {
      return this.anInt4720;
   }

   void method4986() {
      if(this.aLong4723 != 0L) {
         this.aClass174_Sub3_Sub1_4719.method10508(this.aLong4723);
         this.aLong4723 = 0L;
         this.anInt4718 = 0;
         this.anInt4720 = 0;
      }

   }

   public boolean method249(int var1, int var2) {
      this.anInt4720 = var1;
      this.aByte4721 = (byte)var2;
      if(this.anInt4720 > this.anInt4718) {
         int var3 = 8;
         byte var4;
         if(this.aBool4722) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if(this.aLong4723 != 0L) {
            IUnknown.Release(this.aLong4723);
         }

         this.aLong4723 = IDirect3DDevice.CreateVertexBuffer(this.aClass174_Sub3_Sub1_4719.aLong11450, this.anInt4720, var3, 0, var4);
         this.anInt4718 = this.anInt4720;
      }

      return this.aLong4723 != 0L;
   }

   public long method236(int var1, int var2) {
      return IDirect3DVertexBuffer.Lock(this.aLong4723, var1, var2, this.aBool4722?8192:0);
   }

   public void method234() {
      IDirect3DVertexBuffer.Unlock(this.aLong4723);
   }

   public boolean method235(int var1, int var2, long var3) {
      return Class367.method4652(IDirect3DVertexBuffer.Upload(this.aLong4723, var1, var2, this.aBool4722?8192:0, var3));
   }

   public void method140() {
      if(this.aLong4723 != 0L) {
         IUnknown.Release(this.aLong4723);
         this.aLong4723 = 0L;
      }

      this.anInt4718 = 0;
      this.anInt4720 = 0;
      this.aClass174_Sub3_Sub1_4719.method8716(this);
   }

   void method4987() {
      if(this.aLong4723 != 0L) {
         this.aClass174_Sub3_Sub1_4719.method10508(this.aLong4723);
         this.aLong4723 = 0L;
         this.anInt4718 = 0;
         this.anInt4720 = 0;
      }

   }

   public void finalize() {
      this.method4987();
   }

   void method4988() {
      if(this.aLong4723 != 0L) {
         this.aClass174_Sub3_Sub1_4719.method10508(this.aLong4723);
         this.aLong4723 = 0L;
         this.anInt4718 = 0;
         this.anInt4720 = 0;
      }

   }

   void method4989() {
      this.method4987();
   }

   void method4990() {
      this.method4987();
   }

   public boolean method247(int var1, int var2) {
      this.anInt4720 = var1;
      this.aByte4721 = (byte)var2;
      if(this.anInt4720 > this.anInt4718) {
         int var3 = 8;
         byte var4;
         if(this.aBool4722) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if(this.aLong4723 != 0L) {
            IUnknown.Release(this.aLong4723);
         }

         this.aLong4723 = IDirect3DDevice.CreateVertexBuffer(this.aClass174_Sub3_Sub1_4719.aLong11450, this.anInt4720, var3, 0, var4);
         this.anInt4718 = this.anInt4720;
      }

      return this.aLong4723 != 0L;
   }

   public boolean method246(int var1, int var2) {
      this.anInt4720 = var1;
      this.aByte4721 = (byte)var2;
      if(this.anInt4720 > this.anInt4718) {
         int var3 = 8;
         byte var4;
         if(this.aBool4722) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if(this.aLong4723 != 0L) {
            IUnknown.Release(this.aLong4723);
         }

         this.aLong4723 = IDirect3DDevice.CreateVertexBuffer(this.aClass174_Sub3_Sub1_4719.aLong11450, this.anInt4720, var3, 0, var4);
         this.anInt4718 = this.anInt4720;
      }

      return this.aLong4723 != 0L;
   }

   int method4991() {
      return this.aByte4721;
   }

   public long method238(int var1, int var2) {
      return IDirect3DVertexBuffer.Lock(this.aLong4723, var1, var2, this.aBool4722?8192:0);
   }

   Class421(Class174_Sub3_Sub1 var1, boolean var2) {
      this.aClass174_Sub3_Sub1_4719 = var1;
      this.aBool4722 = var2;
      this.aClass174_Sub3_Sub1_4719.method8819(this);
   }

   public void method240() {
      IDirect3DVertexBuffer.Unlock(this.aLong4723);
   }

   public int method242() {
      return this.anInt4720;
   }

   public int method244() {
      return this.anInt4720;
   }

   public boolean method241(int var1, int var2, long var3) {
      return Class367.method4652(IDirect3DVertexBuffer.Upload(this.aLong4723, var1, var2, this.aBool4722?8192:0, var3));
   }

   public boolean method248(int var1, int var2) {
      this.anInt4720 = var1;
      this.aByte4721 = (byte)var2;
      if(this.anInt4720 > this.anInt4718) {
         int var3 = 8;
         byte var4;
         if(this.aBool4722) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if(this.aLong4723 != 0L) {
            IUnknown.Release(this.aLong4723);
         }

         this.aLong4723 = IDirect3DDevice.CreateVertexBuffer(this.aClass174_Sub3_Sub1_4719.aLong11450, this.anInt4720, var3, 0, var4);
         this.anInt4718 = this.anInt4720;
      }

      return this.aLong4723 != 0L;
   }

   public int method237() {
      return this.anInt4720;
   }

   public boolean method245(int var1, int var2, long var3) {
      return Class367.method4652(IDirect3DVertexBuffer.Upload(this.aLong4723, var1, var2, this.aBool4722?8192:0, var3));
   }

   public void method141() {
      if(this.aLong4723 != 0L) {
         IUnknown.Release(this.aLong4723);
         this.aLong4723 = 0L;
      }

      this.anInt4718 = 0;
      this.anInt4720 = 0;
      this.aClass174_Sub3_Sub1_4719.method8716(this);
   }

   public int method243() {
      return this.anInt4720;
   }
}
