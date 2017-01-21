package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class341;
import com.jagex.Class410;
import com.jagex.Class692;
import com.jagex.Interface38;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

public class Class410_Sub1 extends Class410 implements Interface38 {
   int anInt10156;
   int anInt10152;
   float aFloat10154;
   float aFloat10155;
   boolean aBool10153;
   boolean aBool10157;

   public void method279(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.aClass174_Sub3_Sub1_4377.method8722(var3 * var4 * 4);
         ByteBuffer var7 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var7.clear();
         IDirect3DTexture.Download(this.aLong4378, 0, var1, var2, var3, var4, var3 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   Class410_Sub1(Class174_Sub3_Sub1 var1, Class144 var2, Class166 var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0, 1);
   }

   public float method253(float var1) {
      return var1 / (float)this.anInt10152;
   }

   Class410_Sub1(Class174_Sub3_Sub1 var1, Class144 var2, int var3, int var4, boolean var5, byte[] var6, int var7, int var8) {
      super(var1, var2, Class166.aClass166_1884, var5 && var1.aBool11456, var3 * var4);
      if(!this.aClass174_Sub3_Sub1_4377.aBool11455) {
         this.anInt10156 = Class692.method8110(var3, 636040969);
         this.anInt10152 = Class692.method8110(var4, -347624349);
         this.aFloat10154 = (float)var3 / (float)this.anInt10156;
         this.aFloat10155 = (float)var4 / (float)this.anInt10152;
         if(var3 != this.anInt10156 || var4 != this.anInt10152) {
            var6 = this.aClass174_Sub3_Sub1_4377.method2358(var3, var4, this.anInt10156, this.anInt10152, var6, var7, var8, var2.anInt1679 * -1829390781, -1161343085);
            var7 = 0;
            var8 = this.anInt10156;
         }
      } else {
         this.anInt10156 = var3;
         this.anInt10152 = var4;
         this.aFloat10154 = 1.0F;
         this.aFloat10155 = 1.0F;
      }

      if(var5) {
         this.aLong4378 = IDirect3DDevice.CreateTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10156, this.anInt10152, 0, 1024, Class174_Sub3_Sub1.method10502(this.aClass144_4374, Class166.aClass166_1884), 1);
      } else {
         this.aLong4378 = IDirect3DDevice.CreateTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10156, this.anInt10152, 1, 0, Class174_Sub3_Sub1.method10502(this.aClass144_4374, Class166.aClass166_1884), 1);
      }

      if(var8 == 0) {
         var8 = this.anInt10156;
      }

      this.aClass174_Sub3_Sub1_4377.method8722(var8 * this.anInt10152 * this.aClass144_4374.anInt1679 * -1829390781);
      ByteBuffer var9 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
      var9.clear();
      if(this.aClass144_4374 == Class144.aClass144_1687) {
         var9.put(var6, var7, this.anInt10152 * this.anInt10156 / 2);
         IDirect3DTexture.Upload(this.aLong4378, 0, 0, 0, this.anInt10156, this.anInt10152 / 4, this.anInt10156 / 4 * 8, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      } else if(this.aClass144_4374 == Class144.aClass144_1690) {
         var9.put(var6, var7, this.anInt10152 * this.anInt10156);
         IDirect3DTexture.Upload(this.aLong4378, 0, 0, 0, this.anInt10156, this.anInt10152 / 4, this.anInt10156 / 4 * 16, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      } else {
         var9.put(var6, var7, var8 * this.anInt10152);
         IDirect3DTexture.Upload(this.aLong4378, 0, 0, 0, this.anInt10156, this.anInt10152, var8 * this.aClass144_4374.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      }

   }

   Class410_Sub1(Class174_Sub3_Sub1 var1, Class144 var2, int var3, int var4, boolean var5, float[] var6, int var7, int var8) {
      super(var1, var2, Class166.aClass166_1884, var5 && var1.aBool11456, var3 * var4);
      if(!this.aClass174_Sub3_Sub1_4377.aBool11455) {
         this.anInt10156 = Class692.method8110(var3, 375471912);
         this.anInt10152 = Class692.method8110(var4, 1702400899);
         this.aFloat10154 = (float)var3 / (float)this.anInt10156;
         this.aFloat10155 = (float)var4 / (float)this.anInt10152;
         if(var3 != this.anInt10156 || var4 != this.anInt10152) {
            var6 = this.aClass174_Sub3_Sub1_4377.method2357(var3, var4, this.anInt10156, this.anInt10152, var6, var7, var8, var2.anInt1679 * -1829390781, (short)255);
            var7 = 0;
            var8 = this.anInt10156;
         }
      } else {
         this.anInt10156 = var3;
         this.anInt10152 = var4;
         this.aFloat10154 = 1.0F;
         this.aFloat10155 = 1.0F;
      }

      if(var5) {
         this.aLong4378 = IDirect3DDevice.CreateTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10156, this.anInt10152, 0, 1024, Class174_Sub3_Sub1.method10502(this.aClass144_4374, Class166.aClass166_1892), 1);
      } else {
         this.aLong4378 = IDirect3DDevice.CreateTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10156, this.anInt10152, 1, 0, Class174_Sub3_Sub1.method10502(this.aClass144_4374, Class166.aClass166_1892), 1);
      }

      if(var8 == 0) {
         var8 = this.anInt10156;
      }

      this.aClass174_Sub3_Sub1_4377.method8722(var8 * this.anInt10152 * this.aClass144_4374.anInt1679 * -1829390781 * 4);
      ByteBuffer var9 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
      var9.clear();
      var9.asFloatBuffer().put(var6, var7, var8 * this.anInt10152 * this.aClass144_4374.anInt1679 * -1829390781);
      IDirect3DTexture.Upload(this.aLong4378, 0, 0, 0, this.anInt10156, this.anInt10152, var8 * this.aClass144_4374.anInt1679 * -1829390781 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
   }

   public int method1() {
      return this.anInt10156;
   }

   public int method94() {
      return this.anInt10152;
   }

   public float method251(float var1) {
      return var1 / (float)this.anInt10156;
   }

   public float method252(float var1) {
      return var1 / (float)this.anInt10152;
   }

   public float method259() {
      return this.aFloat10154;
   }

   public float method260() {
      return this.aFloat10155;
   }

   public boolean method286() {
      return true;
   }

   long method4899() {
      return this.aLong4378;
   }

   public void method334(Class341 var1) {
      super.method334(var1);
   }

   public void method254(boolean var1, boolean var2) {
      this.aBool10153 = var1;
      this.aBool10157 = var2;
   }

   public float method267(float var1) {
      return var1 / (float)this.anInt10156;
   }

   public void method275(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      if(this.aClass144_4374 == var6 && this.aClass166_4376 == Class166.aClass166_1884) {
         if(var8 == 0) {
            var8 = var3;
         }

         this.aClass174_Sub3_Sub1_4377.method8722(var8 * var4 * this.aClass144_4374.anInt1679 * -1829390781);
         ByteBuffer var9 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.aLong4378, 0, var1, var2, var3, var4, var8 * this.aClass144_4374.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      } else {
         throw new RuntimeException();
      }
   }

   public void method272(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub3_Sub1_4377.method2479(var5, var6, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method255(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   public void method258(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.method258(var1, var2, var3, var4, var5, (int[])null, var7);
      } else {
         throw new RuntimeException();
      }
   }

   public void method255(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         if(var7 == 0) {
            var7 = var3;
         }

         this.aClass174_Sub3_Sub1_4377.method8722(var7 * var4 * this.aClass144_4374.anInt1679 * -1829390781);
         ByteBuffer var8 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var8.clear();
         var8.asIntBuffer().put(var5, var6, var7 * var4);
         IDirect3DTexture.Upload(this.aLong4378, 0, var1, var2, var3, var4, var7 * this.aClass144_4374.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      } else {
         throw new RuntimeException();
      }
   }

   public void method336() {
      this.aClass174_Sub3_Sub1_4377.method10510(this);
   }

   public boolean method265() {
      return false;
   }

   public void method250(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      if(this.aClass144_4374 == var6 && this.aClass166_4376 == Class166.aClass166_1884) {
         if(var8 == 0) {
            var8 = var3;
         }

         this.aClass174_Sub3_Sub1_4377.method8722(var8 * var4 * this.aClass144_4374.anInt1679 * -1829390781);
         ByteBuffer var9 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.aLong4378, 0, var1, var2, var3, var4, var8 * this.aClass144_4374.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      } else {
         throw new RuntimeException();
      }
   }

   public float method289() {
      return this.aFloat10154;
   }

   public void method269(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.aClass174_Sub3_Sub1_4377.method8722(var3 * var4 * 4);
         ByteBuffer var7 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var7.clear();
         IDirect3DTexture.Download(this.aLong4378, 0, var1, var2, var3, var4, var3 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public int method285() {
      return this.anInt10156;
   }

   public int method291() {
      return this.anInt10156;
   }

   public int method264() {
      return this.anInt10156;
   }

   public int method204() {
      return this.anInt10152;
   }

   public void method140() {
      super.method140();
   }

   public float method266(float var1) {
      return var1 / (float)this.anInt10156;
   }

   public void method277(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.aClass174_Sub3_Sub1_4377.method8722(var3 * var4 * 4);
         ByteBuffer var7 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var7.clear();
         IDirect3DTexture.Download(this.aLong4378, 0, var1, var2, var3, var4, var3 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public float method268(float var1) {
      return var1 / (float)this.anInt10152;
   }

   public void method282(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.method258(var1, var2, var3, var4, var5, (int[])null, var7);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method270() {
      return true;
   }

   public boolean method271() {
      return true;
   }

   public void method256(boolean var1, boolean var2) {
      this.aBool10153 = var1;
      this.aBool10157 = var2;
   }

   public void method257(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.aClass174_Sub3_Sub1_4377.method8722(var3 * var4 * 4);
         ByteBuffer var7 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var7.clear();
         IDirect3DTexture.Download(this.aLong4378, 0, var1, var2, var3, var4, var3 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public void method274(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      if(this.aClass144_4374 == var6 && this.aClass166_4376 == Class166.aClass166_1884) {
         if(var8 == 0) {
            var8 = var3;
         }

         this.aClass174_Sub3_Sub1_4377.method8722(var8 * var4 * this.aClass144_4374.anInt1679 * -1829390781);
         ByteBuffer var9 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.aLong4378, 0, var1, var2, var3, var4, var8 * this.aClass144_4374.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      } else {
         throw new RuntimeException();
      }
   }

   public int method237() {
      return this.anInt10156;
   }

   Class410_Sub1(Class174_Sub3_Sub1 var1, Class144 var2, Class166 var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, false, var4 * var5);
      if(!this.aClass174_Sub3_Sub1_4377.aBool11455) {
         this.anInt10156 = Class692.method8110(var4, -214857506);
         this.anInt10152 = Class692.method8110(var5, -118419184);
         this.aFloat10154 = (float)var4 / (float)this.anInt10156;
         this.aFloat10155 = (float)var5 / (float)this.anInt10152;
      } else {
         this.anInt10156 = var4;
         this.anInt10152 = var5;
         this.aFloat10154 = 1.0F;
         this.aFloat10155 = 1.0F;
      }

      this.aLong4378 = IDirect3DDevice.CreateTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10156, this.anInt10152, 0, var6, Class174_Sub3_Sub1.method10502(this.aClass144_4374, this.aClass166_4376), var7);
   }

   public float method262() {
      return this.aFloat10155;
   }

   public void method287(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub3_Sub1_4377.method2479(var5, var6, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method255(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   public void method273(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         if(var7 == 0) {
            var7 = var3;
         }

         this.aClass174_Sub3_Sub1_4377.method8722(var7 * var4 * this.aClass144_4374.anInt1679 * -1829390781);
         ByteBuffer var8 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var8.clear();
         var8.asIntBuffer().put(var5, var6, var7 * var4);
         IDirect3DTexture.Upload(this.aLong4378, 0, var1, var2, var3, var4, var7 * this.aClass144_4374.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      } else {
         throw new RuntimeException();
      }
   }

   public void method280(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.aClass174_Sub3_Sub1_4377.method8722(var3 * var4 * 4);
         ByteBuffer var7 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var7.clear();
         IDirect3DTexture.Download(this.aLong4378, 0, var1, var2, var3, var4, var3 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public void method281(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.method258(var1, var2, var3, var4, var5, (int[])null, var7);
      } else {
         throw new RuntimeException();
      }
   }

   public void method276(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub3_Sub1_4377.method2479(var5, var6, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method255(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   public void method283(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub3_Sub1_4377.method2479(var5, var6, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method255(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   public void method284(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub3_Sub1_4377.method2479(var5, var6, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method255(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   public void method261(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if(this.aClass144_4374 == Class144.aClass144_1680 && this.aClass166_4376 == Class166.aClass166_1884) {
         this.aClass174_Sub3_Sub1_4377.method8722(var3 * var4 * 4);
         ByteBuffer var7 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
         var7.clear();
         IDirect3DTexture.Download(this.aLong4378, 0, var1, var2, var3, var4, var3 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public void method278(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub3_Sub1_4377.method2479(var5, var6, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method255(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   public boolean method288() {
      return false;
   }

   Class410_Sub1(Class174_Sub3_Sub1 var1, int var2, int var3, boolean var4, int[] var5, int var6, int var7) {
      super(var1, Class144.aClass144_1680, Class166.aClass166_1884, var4 && var1.aBool11456, var2 * var3);
      if(!this.aClass174_Sub3_Sub1_4377.aBool11455) {
         this.anInt10156 = Class692.method8110(var2, 144103032);
         this.anInt10152 = Class692.method8110(var3, -2012382094);
         this.aFloat10154 = (float)var2 / (float)this.anInt10156;
         this.aFloat10155 = (float)var3 / (float)this.anInt10152;
         if(var2 != this.anInt10156 || var3 != this.anInt10152) {
            var5 = this.aClass174_Sub3_Sub1_4377.method2593(var2, var3, this.anInt10156, this.anInt10152, var5, var6, var7, -228814296);
            var6 = 0;
            var7 = this.anInt10156;
         }
      } else {
         this.anInt10156 = var2;
         this.anInt10152 = var3;
         this.aFloat10154 = 1.0F;
         this.aFloat10155 = 1.0F;
      }

      if(var4) {
         this.aLong4378 = IDirect3DDevice.CreateTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10156, this.anInt10152, 0, 1024, 21, 1);
      } else {
         this.aLong4378 = IDirect3DDevice.CreateTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10156, this.anInt10152, 1, 0, 21, 1);
      }

      if(var7 == 0) {
         var7 = this.anInt10156;
      }

      this.aClass174_Sub3_Sub1_4377.method8722(var7 * this.anInt10152 * this.aClass144_4374.anInt1679 * -1829390781);
      ByteBuffer var8 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
      var8.clear();
      var8.asIntBuffer().put(var5, var6, var7 * this.anInt10152);
      IDirect3DTexture.Upload(this.aLong4378, 0, 0, 0, this.anInt10156, this.anInt10152, var7 * this.aClass144_4374.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
   }

   public void method337() {
      this.aClass174_Sub3_Sub1_4377.method10510(this);
   }

   public float method263(float var1) {
      return var1 / (float)this.anInt10156;
   }

   public void method338(Class341 var1) {
      super.method334(var1);
   }

   long method4901() {
      return this.aLong4378;
   }

   public void method141() {
      super.method140();
   }

   public float method290() {
      return this.aFloat10155;
   }

   public void method335() {
      this.aClass174_Sub3_Sub1_4377.method10510(this);
   }
}
