package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class341;
import com.jagex.Class494;
import com.jagex.Interface37;
import jaggl.OpenGL;

public class Class494_Sub3 extends Class494 implements Interface37 {
   int anInt10292;
   int anInt10293;
   int anInt10294;

   public void method336() {
      super.method336();
   }

   public void method140() {
      super.method140();
   }

   public void method334(Class341 var1) {
      super.method334(var1);
   }

   Class494_Sub3(Class174_Sub3_Sub2 var1, Class144 var2, int var3, int var4, int var5, boolean var6, byte[] var7) {
      super(var1, '\u806f', var2, Class166.aClass166_1884, var3 * var4 * var5, var6);
      this.anInt10292 = var3;
      this.anInt10293 = var4;
      this.anInt10294 = var5;
      this.aClass174_Sub3_Sub2_5531.method8841(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(this.anInt5533, 0, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), this.anInt10292, this.anInt10293, this.anInt10294, 0, Class174_Sub3_Sub2.method10533(this.aClass144_5534), 5121, var7, 0);
      OpenGL.glPixelStorei(3317, 4);
      if(var6) {
         this.method265();
      }

   }

   public void method141() {
      super.method140();
   }

   public void method337() {
      super.method336();
   }

   public void method335() {
      super.method336();
   }

   public void method338(Class341 var1) {
      super.method334(var1);
   }
}
