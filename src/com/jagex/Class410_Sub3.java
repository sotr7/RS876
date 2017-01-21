package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub1;
import com.jagex.Class341;
import com.jagex.Class410;
import com.jagex.Interface44;
import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;

public class Class410_Sub3 extends Class410 implements Interface44 {
   int anInt10278;

   public void method335() {
      this.aClass174_Sub3_Sub1_4377.method10509(this);
   }

   public void method336() {
      this.aClass174_Sub3_Sub1_4377.method10509(this);
   }

   public void method337() {
      this.aClass174_Sub3_Sub1_4377.method10509(this);
   }

   public void method140() {
      super.method140();
   }

   public void method141() {
      super.method140();
   }

   Class410_Sub3(Class174_Sub3_Sub1 var1, int var2, boolean var3, int[][] var4) {
      super(var1, Class144.aClass144_1680, Class166.aClass166_1884, var3 && var1.aBool11457, var2 * var2 * 6);
      this.anInt10278 = var2;
      if(this.aBool4375) {
         this.aLong4378 = IDirect3DDevice.CreateCubeTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10278, 0, 1024, 21, 1);
      } else {
         this.aLong4378 = IDirect3DDevice.CreateCubeTexture(this.aClass174_Sub3_Sub1_4377.aLong11450, this.anInt10278, 1, 0, 21, 1);
      }

      ByteBuffer var5 = this.aClass174_Sub3_Sub1_4377.aByteBuffer9684;
      this.aClass174_Sub3_Sub1_4377.method8722(this.anInt10278 * this.anInt10278 * 4);

      for(int var6 = 0; var6 < 6; ++var6) {
         var5.clear();
         var5.asIntBuffer().put(var4[var6]);
         IDirect3DCubeTexture.Upload(this.aLong4378, var6, 0, 0, 0, this.anInt10278, this.anInt10278, this.anInt10278 * 4, 0, this.aClass174_Sub3_Sub1_4377.aLong9685);
      }

   }

   public void method334(Class341 var1) {
      super.method334(var1);
   }

   public void method338(Class341 var1) {
      super.method334(var1);
   }
}
