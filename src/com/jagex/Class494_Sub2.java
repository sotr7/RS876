package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class184;
import com.jagex.Class341;
import com.jagex.Class489;
import com.jagex.Class494;
import com.jagex.Class692;
import com.jagex.Interface21;
import com.jagex.Interface43;
import jaggl.OpenGL;

public class Class494_Sub2 extends Class494 implements Interface43 {
   int anInt10289;
   int anInt10288;
   float aFloat10290;
   float aFloat10291;

   public boolean method288() {
      return super.method265();
   }

   Class494_Sub2(Class174_Sub3_Sub2 var1, int var2, int var3, boolean var4, int[] var5, int var6, int var7) {
      super(var1, 3553, Class144.aClass144_1680, Class166.aClass166_1884, var2 * var3, var4);
      if(!this.aClass174_Sub3_Sub2_5531.aBool11481) {
         this.anInt10289 = Class692.method8110(var2, -257069511);
         this.anInt10288 = Class692.method8110(var3, 469458493);
         this.aFloat10290 = (float)var2 / (float)this.anInt10289;
         this.aFloat10291 = (float)var3 / (float)this.anInt10288;
         if(var2 != this.anInt10289 || var3 != this.anInt10288) {
            var5 = this.aClass174_Sub3_Sub2_5531.method2593(var2, var3, this.anInt10289, this.anInt10288, var5, var6, var7, -524853668);
            var6 = 0;
            var7 = this.anInt10289;
         }
      } else {
         this.anInt10289 = var2;
         this.anInt10288 = var3;
         this.aFloat10290 = 1.0F;
         this.aFloat10291 = 1.0F;
      }

      this.aClass174_Sub3_Sub2_5531.method8841(this);
      if(var4 && var7 == 0 && var6 == 0) {
         this.method5898(this.anInt5533, var2, var3, var5);
      } else {
         OpenGL.glPixelStorei(3314, var7);
         OpenGL.glTexImage2Di(this.anInt5533, 0, 6408, this.anInt10289, this.anInt10288, 0, '\u80e1', this.aClass174_Sub3_Sub2_5531.anInt11489, var5, var6 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   Class494_Sub2(Class174_Sub3_Sub2 var1, Class144 var2, int var3, int var4, boolean var5, byte[] var6, int var7, int var8) {
      super(var1, 3553, var2, Class166.aClass166_1884, var3 * var4, var5);
      if(!this.aClass174_Sub3_Sub2_5531.aBool11481) {
         this.anInt10289 = Class692.method8110(var3, 1130537931);
         this.anInt10288 = Class692.method8110(var4, 968524485);
         this.aFloat10290 = (float)var3 / (float)this.anInt10289;
         this.aFloat10291 = (float)var4 / (float)this.anInt10288;
         if(var3 != this.anInt10289 || var4 != this.anInt10288) {
            var6 = this.aClass174_Sub3_Sub2_5531.method2358(var3, var4, this.anInt10289, this.anInt10288, var6, var7, var8, var2.anInt1679 * -1829390781, -1791499707);
            var7 = 0;
            var8 = this.anInt10289;
         }
      } else {
         this.anInt10289 = var3;
         this.anInt10288 = var4;
         this.aFloat10290 = 1.0F;
         this.aFloat10291 = 1.0F;
      }

      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glPixelStorei(3317, 1);
      if(var5 && var8 == 0 && var7 == 0) {
         this.method5899(this.anInt5533, var3, var4, var6);
      } else {
         OpenGL.glPixelStorei(3314, var8);
         if(this.aClass144_5534 == Class144.aClass144_1687) {
            OpenGL.glCompressedTexImage2Dub(this.anInt5533, 0, '\u83f1', var3, var4, 0, var3 * var4 / 2, var6, var7);
         } else if(this.aClass144_5534 == Class144.aClass144_1690) {
            OpenGL.glCompressedTexImage2Dub(this.anInt5533, 0, '\u83f3', var3, var4, 0, var3 * var4, var6, var7);
         } else {
            OpenGL.glTexImage2Dub(this.anInt5533, 0, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), var3, var4, 0, Class174_Sub3_Sub2.method10533(this.aClass144_5534), 5121, var6, var7);
         }

         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   public float method268(float var1) {
      return var1 / (float)this.anInt10288;
   }

   public int method1() {
      return this.anInt10289;
   }

   public int method264() {
      return this.anInt10289;
   }

   public float method251(float var1) {
      return var1 / (float)this.anInt10289;
   }

   public float method252(float var1) {
      return var1 / (float)this.anInt10288;
   }

   public float method259() {
      return this.aFloat10290;
   }

   public float method260() {
      return this.aFloat10291;
   }

   public boolean method286() {
      return true;
   }

   public void method140() {
      super.method140();
   }

   public void method255(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexSubImage2Di(this.anInt5533, 0, var1, var2, var3, var4, '\u80e1', this.aClass174_Sub3_Sub2_5531.anInt11489, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
   }

   public Interface21 method343(int var1) {
      return new Class489(this, var1);
   }

   public void method279(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.method258(var1, var2, var3, var4, var5, (int[])null, var6);
   }

   public void method258(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      int[] var8 = var6 == null?new int[this.anInt10289 * this.anInt10288]:var6;
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glGetTexImagei(this.anInt5533, 0, '\u80e1', 5121, var8, 0);

      for(int var9 = 0; var9 < var4; ++var9) {
         System.arraycopy(var8, var9 * this.anInt10289, var5, var7 + var9 * var3, var3);
      }

   }

   public void method272(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      Class184 var7 = this.aClass174_Sub3_Sub2_5531.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var6 + var4);
         int var9 = Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537);
         OpenGL.glCopyTexImage2D(this.anInt5533, 0, var9, var5, var8, var3, var4, 0);
      }

   }

   public Interface21 method344(int var1) {
      return new Class489(this, var1);
   }

   public boolean method265() {
      return super.method265();
   }

   public void method334(Class341 var1) {
      super.method334(var1);
   }

   public float method267(float var1) {
      return var1 / (float)this.anInt10289;
   }

   public int method285() {
      return this.anInt10289;
   }

   public void method254(boolean var1, boolean var2) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glTexParameteri(this.anInt5533, 10242, var1?10497:'\u812f');
      OpenGL.glTexParameteri(this.anInt5533, 10243, var2?10497:'\u812f');
   }

   public int method237() {
      return this.anInt10289;
   }

   Class494_Sub2(Class174_Sub3_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5) {
      super(var1, 3553, var2, var3, var4 * var5, false);
      if(!this.aClass174_Sub3_Sub2_5531.aBool11481) {
         this.anInt10289 = Class692.method8110(var4, 1949993338);
         this.anInt10288 = Class692.method8110(var5, -682428388);
         this.aFloat10290 = (float)var4 / (float)this.anInt10289;
         this.aFloat10291 = (float)var5 / (float)this.anInt10288;
      } else {
         this.anInt10289 = var4;
         this.anInt10288 = var5;
         this.aFloat10290 = 1.0F;
         this.aFloat10291 = 1.0F;
      }

      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glTexImage2Dub(this.anInt5533, 0, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), var4, var5, 0, Class174_Sub3_Sub2.method10533(this.aClass144_5534), Class174_Sub3_Sub2.method10532(this.aClass166_5537), (byte[])null, 0);
   }

   public int method291() {
      return this.anInt10289;
   }

   public int method204() {
      return this.anInt10288;
   }

   public void method337() {
      super.method336();
   }

   public float method263(float var1) {
      return var1 / (float)this.anInt10289;
   }

   public float method266(float var1) {
      return var1 / (float)this.anInt10289;
   }

   public float method289() {
      return this.aFloat10290;
   }

   public void method280(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.method258(var1, var2, var3, var4, var5, (int[])null, var6);
   }

   public float method253(float var1) {
      return var1 / (float)this.anInt10288;
   }

   public boolean method270() {
      return true;
   }

   public int method94() {
      return this.anInt10288;
   }

   public void method256(boolean var1, boolean var2) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glTexParameteri(this.anInt5533, 10242, var1?10497:'\u812f');
      OpenGL.glTexParameteri(this.anInt5533, 10243, var2?10497:'\u812f');
   }

   public void method269(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.method258(var1, var2, var3, var4, var5, (int[])null, var6);
   }

   public void method250(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.anInt5533, 0, var1, var2, var3, var4, Class174_Sub3_Sub2.method10533(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public void method275(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.anInt5533, 0, var1, var2, var3, var4, Class174_Sub3_Sub2.method10533(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public boolean method271() {
      return true;
   }

   public void method277(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.method258(var1, var2, var3, var4, var5, (int[])null, var6);
   }

   public void method274(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.anInt5533, 0, var1, var2, var3, var4, Class174_Sub3_Sub2.method10533(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public void method261(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.method258(var1, var2, var3, var4, var5, (int[])null, var6);
   }

   public void method284(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      Class184 var7 = this.aClass174_Sub3_Sub2_5531.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var6 + var4);
         int var9 = Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537);
         OpenGL.glCopyTexImage2D(this.anInt5533, 0, var9, var5, var8, var3, var4, 0);
      }

   }

   public void method281(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      int[] var8 = var6 == null?new int[this.anInt10289 * this.anInt10288]:var6;
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glGetTexImagei(this.anInt5533, 0, '\u80e1', 5121, var8, 0);

      for(int var9 = 0; var9 < var4; ++var9) {
         System.arraycopy(var8, var9 * this.anInt10289, var5, var7 + var9 * var3, var3);
      }

   }

   public void method282(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      int[] var8 = var6 == null?new int[this.anInt10289 * this.anInt10288]:var6;
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glGetTexImagei(this.anInt5533, 0, '\u80e1', 5121, var8, 0);

      for(int var9 = 0; var9 < var4; ++var9) {
         System.arraycopy(var8, var9 * this.anInt10289, var5, var7 + var9 * var3, var3);
      }

   }

   public void method283(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      Class184 var7 = this.aClass174_Sub3_Sub2_5531.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var6 + var4);
         int var9 = Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537);
         OpenGL.glCopyTexImage2D(this.anInt5533, 0, var9, var5, var8, var3, var4, 0);
      }

   }

   Class494_Sub2(Class174_Sub3_Sub2 var1, Class144 var2, int var3, int var4, boolean var5, float[] var6, int var7, int var8) {
      super(var1, 3553, var2, Class166.aClass166_1892, var3 * var4, var5);
      if(!this.aClass174_Sub3_Sub2_5531.aBool11481) {
         this.anInt10289 = Class692.method8110(var3, -2106173362);
         this.anInt10288 = Class692.method8110(var4, 1883404149);
         this.aFloat10290 = (float)var3 / (float)this.anInt10289;
         this.aFloat10291 = (float)var4 / (float)this.anInt10288;
         if(var3 != this.anInt10289 || var4 != this.anInt10288) {
            var6 = this.aClass174_Sub3_Sub2_5531.method2357(var3, var4, this.anInt10289, this.anInt10288, var6, var7, var8, var2.anInt1679 * -1829390781, (short)255);
            var7 = 0;
            var8 = this.anInt10289;
         }
      } else {
         this.anInt10289 = var3;
         this.anInt10288 = var4;
         this.aFloat10290 = 1.0F;
         this.aFloat10291 = 1.0F;
      }

      this.aClass174_Sub3_Sub2_5531.method8841(this);
      if(var5 && var8 == 0 && var7 == 0) {
         this.method5900(this.anInt5533, var3, var4, var6);
      } else {
         OpenGL.glPixelStorei(3314, var8);
         OpenGL.glTexImage2Df(this.anInt5533, 0, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), var3, var4, 0, Class174_Sub3_Sub2.method10533(this.aClass144_5534), 5126, var6, var7 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public void method276(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      Class184 var7 = this.aClass174_Sub3_Sub2_5531.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var6 + var4);
         int var9 = Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537);
         OpenGL.glCopyTexImage2D(this.anInt5533, 0, var9, var5, var8, var3, var4, 0);
      }

   }

   public void method278(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      Class184 var7 = this.aClass174_Sub3_Sub2_5531.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var6 + var4);
         int var9 = Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537);
         OpenGL.glCopyTexImage2D(this.anInt5533, 0, var9, var5, var8, var3, var4, 0);
      }

   }

   public void method287(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      Class184 var7 = this.aClass174_Sub3_Sub2_5531.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var6 + var4);
         int var9 = Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537);
         OpenGL.glCopyTexImage2D(this.anInt5533, 0, var9, var5, var8, var3, var4, 0);
      }

   }

   public void method141() {
      super.method140();
   }

   public void method257(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      this.method258(var1, var2, var3, var4, var5, (int[])null, var6);
   }

   public void method335() {
      super.method336();
   }

   public void method338(Class341 var1) {
      super.method334(var1);
   }

   public void method273(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexSubImage2Di(this.anInt5533, 0, var1, var2, var3, var4, '\u80e1', this.aClass174_Sub3_Sub2_5531.anInt11489, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
   }

   public void method336() {
      super.method336();
   }

   public float method290() {
      return this.aFloat10291;
   }

   public float method262() {
      return this.aFloat10291;
   }
}
