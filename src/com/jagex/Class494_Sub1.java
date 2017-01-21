package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class341;
import com.jagex.Class494;
import com.jagex.Interface44;
import jaggl.OpenGL;

public class Class494_Sub1 extends Class494 implements Interface44 {
   static final int anInt10201 = 34069;

   public void method334(Class341 var1) {
      super.method334(var1);
   }

   public void method336() {
      super.method336();
   }

   Class494_Sub1(Class174_Sub3_Sub2 var1, int var2, boolean var3, int[][] var4) {
      super(var1, '\u8513', Class144.aClass144_1680, Class166.aClass166_1884, var2 * var2 * 6, var3);

      int var5;
      for(var5 = 0; var5 < 6; ++var5) {
         for(int var6 = 0; var6 < var4[var5].length; ++var6) {
            int var7 = var4[var5][var6];
            var4[var5][var6] = -16711936 & var7 | (var7 & 255) << 16 | var7 >> 16 & 255;
         }
      }

      this.aClass174_Sub3_Sub2_5531.method8841(this);
      if(var3) {
         for(var5 = 0; var5 < 6; ++var5) {
            this.method5898('\u8515' + var5, var2, var2, var4[var5]);
         }
      } else {
         for(var5 = 0; var5 < 6; ++var5) {
            OpenGL.glTexImage2Di('\u8515' + var5, 0, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), var2, var2, 0, Class174_Sub3_Sub2.method10533(this.aClass144_5534), this.aClass174_Sub3_Sub2_5531.anInt11489, var4[var5], 0);
         }
      }

   }

   public void method140() {
      super.method140();
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
