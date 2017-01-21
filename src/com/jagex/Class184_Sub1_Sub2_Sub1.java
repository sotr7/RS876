package com.jagex;

import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class184_Sub1_Sub2;
import com.jagex.Interface52;
import jagdx.Class367;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import java.awt.Canvas;

public class Class184_Sub1_Sub2_Sub1 extends Class184_Sub1_Sub2 implements Interface52 {
   boolean aBool11964 = false;
   boolean aBool11967 = false;
   Canvas aCanvas11960;
   Class174_Sub3_Sub1 aClass174_Sub3_Sub1_11965;
   int anInt11959;
   int anInt11966;
   long aLong11963;
   long aLong11962;
   long aLong11961;
   D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11968;

   public int method8457(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.aLong11961, 0);
   }

   public int method2702() {
      return this.anInt11966;
   }

   public int method2691() {
      return this.anInt11959;
   }

   public int method2693() {
      return this.anInt11966;
   }

   Class184_Sub1_Sub2_Sub1(Class174_Sub3_Sub1 var1, Canvas var2, int var3, int var4, boolean var5) {
      super(var1);
      this.aCanvas11960 = var2;
      this.aClass174_Sub3_Sub1_11965 = var1;
      this.anInt11959 = var3;
      this.anInt11966 = var4;
      this.aBool11967 = var5;
      this.method365();
   }

   boolean method2694() {
      this.aBool11964 = false;
      return Class367.method4652(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, 0L));
   }

   public void finalize() throws Throwable {
      this.method10823();
      super.finalize();
   }

   public int method8453(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.aLong11961, 0);
   }

   public int method8451() {
      return IDirect3DSwapChain.Present(this.aLong11961, 0);
   }

   public void method140() {
      if(this.aLong11963 != 0L) {
         IUnknown.Release(this.aLong11963);
         this.aLong11963 = 0L;
      }

      if(this.aLong11962 != 0L) {
         IUnknown.Release(this.aLong11962);
         this.aLong11962 = 0L;
      }

      if(this.aLong11961 != 0L) {
         IUnknown.Release(this.aLong11961);
         this.aLong11961 = 0L;
      }

      this.aClass174_Sub3_Sub1_11965.method10519(this);
   }

   public int method8459() {
      return IDirect3DSwapChain.Present(this.aLong11961, 0);
   }

   void method10823() {
      if(this.aLong11963 != 0L) {
         IUnknown.Release(this.aLong11963);
         this.aLong11963 = 0L;
      }

      if(this.aLong11962 != 0L) {
         IUnknown.Release(this.aLong11962);
         this.aLong11962 = 0L;
      }

      if(this.aLong11961 != 0L) {
         IUnknown.Release(this.aLong11961);
         this.aLong11961 = 0L;
      }

      this.aClass174_Sub3_Sub1_11965.method10519(this);
   }

   public int method2700() {
      return this.anInt11959;
   }

   public int method2695() {
      return this.anInt11959;
   }

   public int method2697() {
      return this.anInt11959;
   }

   public int method2698() {
      return this.anInt11959;
   }

   public int method2699() {
      return this.anInt11959;
   }

   public int method2703() {
      return this.anInt11966;
   }

   public int method2701() {
      return this.anInt11966;
   }

   void method10824() {
      if(this.aLong11963 != 0L) {
         IUnknown.Release(this.aLong11963);
         this.aLong11963 = 0L;
      }

      if(this.aLong11962 != 0L) {
         IUnknown.Release(this.aLong11962);
         this.aLong11962 = 0L;
      }

      if(this.aLong11961 != 0L) {
         IUnknown.Release(this.aLong11961);
         this.aLong11961 = 0L;
      }

      this.aClass174_Sub3_Sub1_11965.method10519(this);
   }

   public boolean method364() {
      this.aBool11964 = true;
      if(this.aLong11961 == 0L) {
         if(this.aClass174_Sub3_Sub1_11965.aBool11440) {
            return false;
         }

         this.method365();
      }

      return Class367.method4651(IDirect3DDevice.SetRenderTarget(this.aClass174_Sub3_Sub1_11965.aLong11450, 0, this.aLong11963))?false:(Class367.method4651(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, this.aLong11962))?false:super.method363());
   }

   boolean method2692() {
      this.aBool11964 = false;
      return Class367.method4652(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, 0L));
   }

   public boolean method363() {
      this.aBool11964 = true;
      if(this.aLong11961 == 0L) {
         if(this.aClass174_Sub3_Sub1_11965.aBool11440) {
            return false;
         }

         this.method365();
      }

      return Class367.method4651(IDirect3DDevice.SetRenderTarget(this.aClass174_Sub3_Sub1_11965.aLong11450, 0, this.aLong11963))?false:(Class367.method4651(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, this.aLong11962))?false:super.method363());
   }

   boolean method2704() {
      this.aBool11964 = false;
      return Class367.method4652(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, 0L));
   }

   boolean method2706() {
      this.aBool11964 = false;
      return Class367.method4652(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, 0L));
   }

   public void method365() {
      if(this.aLong11961 == 0L) {
         this.aD3DPRESENT_PARAMETERS11968 = new D3DPRESENT_PARAMETERS(this.aCanvas11960);
         this.aD3DPRESENT_PARAMETERS11968.Windowed = true;
         this.aD3DPRESENT_PARAMETERS11968.BackBufferCount = 1;
         this.aD3DPRESENT_PARAMETERS11968.PresentationInterval = Integer.MIN_VALUE;
         this.aD3DPRESENT_PARAMETERS11968.BackBufferWidth = this.anInt11959;
         this.aD3DPRESENT_PARAMETERS11968.BackBufferHeight = this.anInt11966;
         if(this.aBool11967) {
            this.aLong11961 = IDirect3DDevice.GetSwapChain(this.aClass174_Sub3_Sub1_11965.aLong11450, 0);
            this.aLong11963 = IDirect3DSwapChain.GetBackBuffer(this.aLong11961, 0, 0);
            this.aLong11962 = IDirect3DDevice.GetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450);
         } else {
            if(!Class174_Sub3_Sub1.method10516(this.aClass174_Sub3_Sub1_11965.anInt11436, this.aClass174_Sub3_Sub1_11965.anInt11447, this.aClass174_Sub3_Sub1_11965.aLong11461, this.aClass174_Sub3_Sub1_11965.anInt9819, this.aClass174_Sub3_Sub1_11965.aD3DDISPLAYMODE11438, this.aD3DPRESENT_PARAMETERS11968)) {
               throw new RuntimeException();
            }

            int var1 = this.aD3DPRESENT_PARAMETERS11968.AutoDepthStencilFormat;
            this.aLong11961 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass174_Sub3_Sub1_11965.aLong11450, this.aD3DPRESENT_PARAMETERS11968);
            this.aLong11963 = IDirect3DSwapChain.GetBackBuffer(this.aLong11961, 0, 0);
            this.aLong11962 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, this.anInt11959, this.anInt11966, var1, this.aD3DPRESENT_PARAMETERS11968.MultiSampleType, this.aD3DPRESENT_PARAMETERS11968.MultiSampleQuality, false);
         }

         this.aClass174_Sub3_Sub1_11965.method10504(this);
      }

      if(this.aBool11964) {
         this.method363();
      }

   }

   public void method366() {
      if(this.aLong11961 == 0L) {
         this.aD3DPRESENT_PARAMETERS11968 = new D3DPRESENT_PARAMETERS(this.aCanvas11960);
         this.aD3DPRESENT_PARAMETERS11968.Windowed = true;
         this.aD3DPRESENT_PARAMETERS11968.BackBufferCount = 1;
         this.aD3DPRESENT_PARAMETERS11968.PresentationInterval = Integer.MIN_VALUE;
         this.aD3DPRESENT_PARAMETERS11968.BackBufferWidth = this.anInt11959;
         this.aD3DPRESENT_PARAMETERS11968.BackBufferHeight = this.anInt11966;
         if(this.aBool11967) {
            this.aLong11961 = IDirect3DDevice.GetSwapChain(this.aClass174_Sub3_Sub1_11965.aLong11450, 0);
            this.aLong11963 = IDirect3DSwapChain.GetBackBuffer(this.aLong11961, 0, 0);
            this.aLong11962 = IDirect3DDevice.GetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450);
         } else {
            if(!Class174_Sub3_Sub1.method10516(this.aClass174_Sub3_Sub1_11965.anInt11436, this.aClass174_Sub3_Sub1_11965.anInt11447, this.aClass174_Sub3_Sub1_11965.aLong11461, this.aClass174_Sub3_Sub1_11965.anInt9819, this.aClass174_Sub3_Sub1_11965.aD3DDISPLAYMODE11438, this.aD3DPRESENT_PARAMETERS11968)) {
               throw new RuntimeException();
            }

            int var1 = this.aD3DPRESENT_PARAMETERS11968.AutoDepthStencilFormat;
            this.aLong11961 = IDirect3DDevice.CreateAdditionalSwapChain(this.aClass174_Sub3_Sub1_11965.aLong11450, this.aD3DPRESENT_PARAMETERS11968);
            this.aLong11963 = IDirect3DSwapChain.GetBackBuffer(this.aLong11961, 0, 0);
            this.aLong11962 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, this.anInt11959, this.anInt11966, var1, this.aD3DPRESENT_PARAMETERS11968.MultiSampleType, this.aD3DPRESENT_PARAMETERS11968.MultiSampleQuality, false);
         }

         this.aClass174_Sub3_Sub1_11965.method10504(this);
      }

      if(this.aBool11964) {
         this.method363();
      }

   }

   void method8455(int var1, int var2) {
      this.method140();
      this.anInt11959 = var1;
      this.anInt11966 = var2;
      if(this.aBool11967) {
         this.aClass174_Sub3_Sub1_11965.method10503(this.anInt11959, this.anInt11966);
      }

      this.method365();
      super.method8454(var1, var2);
   }

   void method8456(int var1, int var2) {
      this.method140();
      this.anInt11959 = var1;
      this.anInt11966 = var2;
      if(this.aBool11967) {
         this.aClass174_Sub3_Sub1_11965.method10503(this.anInt11959, this.anInt11966);
      }

      this.method365();
      super.method8454(var1, var2);
   }

   public int method8460() {
      return IDirect3DSwapChain.Present(this.aLong11961, 0);
   }

   public int method8458(int var1, int var2) {
      return IDirect3DSwapChain.Present(this.aLong11961, 0);
   }

   void method10825() throws Throwable {
      this.method10823();
      super.finalize();
   }

   void method10826() throws Throwable {
      this.method10823();
      super.finalize();
   }

   public int method8452() {
      return IDirect3DSwapChain.Present(this.aLong11961, 0);
   }

   boolean method2705() {
      this.aBool11964 = false;
      return Class367.method4652(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, 0L));
   }

   void method8454(int var1, int var2) {
      this.method140();
      this.anInt11959 = var1;
      this.anInt11966 = var2;
      if(this.aBool11967) {
         this.aClass174_Sub3_Sub1_11965.method10503(this.anInt11959, this.anInt11966);
      }

      this.method365();
      super.method8454(var1, var2);
   }

   boolean method2696() {
      this.aBool11964 = false;
      return Class367.method4652(IDirect3DDevice.SetDepthStencilSurface(this.aClass174_Sub3_Sub1_11965.aLong11450, 0L));
   }

   public void method208() {
      if(this.aLong11963 != 0L) {
         IUnknown.Release(this.aLong11963);
         this.aLong11963 = 0L;
      }

      if(this.aLong11962 != 0L) {
         IUnknown.Release(this.aLong11962);
         this.aLong11962 = 0L;
      }

      if(this.aLong11961 != 0L) {
         IUnknown.Release(this.aLong11961);
         this.aLong11961 = 0L;
      }

      this.aClass174_Sub3_Sub1_11965.method10519(this);
   }
}
