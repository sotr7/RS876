package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface58;
import jaggl.OpenGL;

public class Class485 implements Interface21, Interface23, Interface58 {
   Class144 aClass144_5487;
   Class166 aClass166_5488;
   int anInt5491;
   int anInt5486;
   Class174_Sub3_Sub2 aClass174_Sub3_Sub2_5490;
   int anInt5489;

   public int method21() {
      return this.anInt5491;
   }

   Class485(Class174_Sub3_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5, int var6) {
      this.aClass144_5487 = var2;
      this.aClass166_5488 = var3;
      this.anInt5491 = var4;
      this.anInt5486 = var5;
      this.aClass174_Sub3_Sub2_5490 = var1;
      int[] var7 = new int[1];
      OpenGL.glGenRenderbuffersEXT(1, var7, 0);
      this.anInt5489 = var7[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt5489);
      OpenGL.glRenderbufferStorageMultisampleEXT('\u8d41', var6, Class174_Sub3_Sub2.method10534(this.aClass144_5487, this.aClass166_5488), var4, var5);
   }

   public int method1() {
      return this.anInt5491;
   }

   public int method94() {
      return this.anInt5486;
   }

   public void method51(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt5489);
   }

   public void method140() {
      if(this.anInt5489 != 0) {
         int[] var1 = new int[]{this.anInt5489};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.anInt5489 = 0;
      }

   }

   void method5840() {
      if(this.anInt5489 != 0) {
         this.aClass174_Sub3_Sub2_5490.method10526(this.anInt5489, this.anInt5491 * this.anInt5486 * this.aClass166_5488.anInt1891 * 1990758583 * this.aClass144_5487.anInt1679 * -1829390781);
         this.anInt5489 = 0;
      }

   }

   void method5841() throws Throwable {
      this.method5840();
      super.finalize();
   }

   void method5842() throws Throwable {
      this.method5840();
      super.finalize();
   }

   public int method9() {
      return this.anInt5486;
   }

   public void method101(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt5489);
   }

   public int method92() {
      return this.anInt5486;
   }

   public int method8() {
      return this.anInt5486;
   }

   Class485(Class174_Sub3_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5) {
      this.aClass144_5487 = var2;
      this.aClass166_5488 = var3;
      this.anInt5491 = var4;
      this.anInt5486 = var5;
      this.aClass174_Sub3_Sub2_5490 = var1;
      int[] var6 = new int[1];
      OpenGL.glGenRenderbuffersEXT(1, var6, 0);
      this.anInt5489 = var6[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt5489);
      OpenGL.glRenderbufferStorageEXT('\u8d41', Class174_Sub3_Sub2.method10534(this.aClass144_5487, this.aClass166_5488), var4, var5);
   }

   public void method141() {
      if(this.anInt5489 != 0) {
         int[] var1 = new int[]{this.anInt5489};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.anInt5489 = 0;
      }

   }

   public void finalize() throws Throwable {
      this.method5840();
      super.finalize();
   }

   public int method95() {
      return this.anInt5486;
   }

   public int method90() {
      return this.anInt5491;
   }
}
