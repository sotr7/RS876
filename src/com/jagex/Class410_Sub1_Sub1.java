package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class341;
import com.jagex.Class410_Sub1;
import com.jagex.Class416;
import com.jagex.Interface21;
import com.jagex.Interface43;
import jagdx.Class367;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class410_Sub1_Sub1 extends Class410_Sub1 implements Interface43 {
   public void method280(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4378, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass174_Sub3_Sub1_4377.aLong11450, var3, var4, 21, 0, 0, true);
      this.aClass174_Sub3_Sub1_4377.method8722(var4 * var3 * 4);
      if(Class367.method4652(IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_4377.aLong11450, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.aClass174_Sub3_Sub1_4377.aLong9685);
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method337() {
      super.method336();
   }

   public void method279(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4378, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass174_Sub3_Sub1_4377.aLong11450, var3, var4, 21, 0, 0, true);
      this.aClass174_Sub3_Sub1_4377.method8722(var4 * var3 * 4);
      if(Class367.method4652(IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_4377.aLong11450, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.aClass174_Sub3_Sub1_4377.aLong9685);
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method140() {
      super.method140();
   }

   public int method1() {
      return super.method1();
   }

   public void method273(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      super.method255(var1, var2, var3, var4, var5, var6, var7);
   }

   public float method251(float var1) {
      return super.method251(var1);
   }

   public float method252(float var1) {
      return super.method252(var1);
   }

   public boolean method286() {
      return super.method286();
   }

   public float method262() {
      return super.method260();
   }

   public void method255(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      super.method255(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method250(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      super.method250(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method258(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      super.method258(var1, var2, var3, var4, var5, var6, var7);
   }

   public float method253(float var1) {
      return super.method252(var1);
   }

   public void method254(boolean var1, boolean var2) {
      super.method254(var1, var2);
   }

   public float method260() {
      return super.method260();
   }

   public boolean method265() {
      return super.method265();
   }

   public int method94() {
      return super.method94();
   }

   public void method283(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.method272(var1, var2, var3, var4, var5, var6);
   }

   public void method141() {
      super.method140();
   }

   public int method237() {
      return super.method1();
   }

   public void method256(boolean var1, boolean var2) {
      super.method254(var1, var2);
   }

   public int method291() {
      return super.method1();
   }

   public int method264() {
      return super.method1();
   }

   public int method204() {
      return super.method94();
   }

   public void method278(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.method272(var1, var2, var3, var4, var5, var6);
   }

   public float method266(float var1) {
      return super.method251(var1);
   }

   public float method267(float var1) {
      return super.method251(var1);
   }

   public float method268(float var1) {
      return super.method252(var1);
   }

   public void method281(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      super.method258(var1, var2, var3, var4, var5, var6, var7);
   }

   public float method259() {
      return super.method259();
   }

   public boolean method271() {
      return super.method286();
   }

   public Interface21 method344(int var1) {
      return new Class416(this, var1);
   }

   public float method263(float var1) {
      return super.method251(var1);
   }

   public boolean method270() {
      return super.method286();
   }

   public void method275(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      super.method250(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method269(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4378, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass174_Sub3_Sub1_4377.aLong11450, var3, var4, 21, 0, 0, true);
      this.aClass174_Sub3_Sub1_4377.method8722(var4 * var3 * 4);
      if(Class367.method4652(IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_4377.aLong11450, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.aClass174_Sub3_Sub1_4377.aLong9685);
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method277(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4378, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass174_Sub3_Sub1_4377.aLong11450, var3, var4, 21, 0, 0, true);
      this.aClass174_Sub3_Sub1_4377.method8722(var4 * var3 * 4);
      if(Class367.method4652(IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_4377.aLong11450, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.aClass174_Sub3_Sub1_4377.aLong9685);
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method284(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.method272(var1, var2, var3, var4, var5, var6);
   }

   public void method261(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4378, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass174_Sub3_Sub1_4377.aLong11450, var3, var4, 21, 0, 0, true);
      this.aClass174_Sub3_Sub1_4377.method8722(var4 * var3 * 4);
      if(Class367.method4652(IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_4377.aLong11450, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.aClass174_Sub3_Sub1_4377.aLong9685);
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method274(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      super.method250(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void method257(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      long var7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4378, 0);
      long var9 = IDirect3DDevice.CreateRenderTarget(this.aClass174_Sub3_Sub1_4377.aLong11450, var3, var4, 21, 0, 0, true);
      this.aClass174_Sub3_Sub1_4377.method8722(var4 * var3 * 4);
      if(Class367.method4652(IDirect3DDevice.StretchRect(this.aClass174_Sub3_Sub1_4377.aLong11450, var7, var1, var2, var3, var4, var9, 0, 0, var3, var4, 1))) {
         IDirect3DSurface.Download(var9, 0, 0, var3, var4, var3 * 4, 16, this.aClass174_Sub3_Sub1_4377.aLong9685);
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.clear();
         this.aClass174_Sub3_Sub1_4377.aByteBuffer9684.asIntBuffer().get(var5);
      }

      IUnknown.Release(var7);
      IUnknown.Release(var9);
   }

   public void method282(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      super.method258(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method272(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.method272(var1, var2, var3, var4, var5, var6);
   }

   public int method285() {
      return super.method1();
   }

   public void method276(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.method272(var1, var2, var3, var4, var5, var6);
   }

   public void method334(Class341 var1) {
      super.method334(var1);
   }

   public void method287(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.method272(var1, var2, var3, var4, var5, var6);
   }

   public boolean method288() {
      return super.method265();
   }

   public float method290() {
      return super.method260();
   }

   public void method335() {
      super.method336();
   }

   public void method338(Class341 var1) {
      super.method334(var1);
   }

   public Interface21 method343(int var1) {
      return new Class416(this, var1);
   }

   public float method289() {
      return super.method259();
   }

   Class410_Sub1_Sub1(Class174_Sub3_Sub1 var1, Class144 var2, Class166 var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5, 1025, 0);
   }

   public void method336() {
      super.method336();
   }
}
