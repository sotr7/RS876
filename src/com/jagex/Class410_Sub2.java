package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class341;
import com.jagex.Class410;
import com.jagex.Interface37;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;

public class Class410_Sub2 extends Class410 implements Interface37 {
   int anInt10160;
   int anInt10158;
   int anInt10159;

   public void method141() {
      super.method140();
   }

   public void method336() {
      this.aClass174_Sub3_Sub1_4377.method10511(this);
   }

   long method4901() {
      return this.aLong4378;
   }

   public void method334(Class341 var1) {
      super.method334(var1);
   }

   public void method140() {
      super.method140();
   }

   Class410_Sub2(Class174_Sub3_Sub1 var1, Class144 var2, int var3, int var4, int var5, boolean var6, byte[] var7) {
      super(var1, var2, Class166.aClass166_1884, false, var3 * var4 * var5);
      this.anInt10160 = var3;
      this.anInt10158 = var4;
      this.anInt10159 = var5;
      this.aLong4378 = IDirect3DDevice.CreateVolumeTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, var3, var4, var5, 1, 0, Class174_Sub3_Sub1.method10502(var2, this.aClass166_4376), 1);
      this.aClass174_Sub3_Sub1_4377.method8722(this.anInt10160 * this.anInt10158 * var2.anInt1679 * -1829390781);
      ByteBuffer var8 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
      var8.clear();
      var8.put(var7);
      IDirect3DVolumeTexture.Upload(this.aLong4378, 0, 0, 0, 0, this.anInt10160, this.anInt10158, this.anInt10159, this.anInt10160 * var2.anInt1679 * -1829390781, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
   }

   public void method337() {
      this.aClass174_Sub3_Sub1_4377.method10511(this);
   }

   public void method335() {
      this.aClass174_Sub3_Sub1_4377.method10511(this);
   }

   public void method338(Class341 var1) {
      super.method334(var1);
   }

   long method4899() {
      return this.aLong4378;
   }
}
