package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class526_Sub21;
import com.jagex.Interface16;
import jaggl.OpenGL;

public class Class526_Sub21_Sub1 extends Class526_Sub21 implements Interface16 {
   int anInt11326;
   Class174_Sub2 aClass174_Sub2_11325;
   int anInt11327;
   int anInt11328;
   Class144 aClass144_11330;
   Class166 aClass166_11329;
   int anInt11331;
   static int[] anIntArray11332 = new int[1];

   public int method8() {
      return this.anInt11328;
   }

   public void method140() {
      if(this.anInt11326 != 0) {
         int[] var1 = new int[]{this.anInt11326};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.anInt11326 = 0;
      }

   }

   public void method102(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt11326);
   }

   public int method94() {
      return this.anInt11328;
   }

   public void method51(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt11326);
   }

   public void method141() {
      if(this.anInt11326 != 0) {
         int[] var1 = new int[]{this.anInt11326};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.anInt11326 = 0;
      }

   }

   public int method1() {
      return this.anInt11327;
   }

   public void finalize() throws Throwable {
      this.method10400();
      super.finalize();
   }

   void method10400() {
      if(this.anInt11326 != 0) {
         this.aClass174_Sub2_11325.method8659(this.anInt11326, this.anInt11331);
         this.anInt11326 = 0;
      }

   }

   public int method21() {
      return this.anInt11327;
   }

   Class526_Sub21_Sub1(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5, int var6) {
      this.aClass174_Sub2_11325 = var1;
      this.anInt11327 = var4;
      this.anInt11328 = var5;
      this.aClass144_11330 = var2;
      this.aClass166_11329 = var3;
      OpenGL.glGenRenderbuffersEXT(1, anIntArray11332, 0);
      this.anInt11326 = anIntArray11332[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt11326);
      OpenGL.glRenderbufferStorageMultisampleEXT('\u8d41', var6, Class174_Sub2.method8663(this.aClass144_11330, this.aClass166_11329), this.anInt11327, this.anInt11328);
      this.anInt11331 = this.anInt11327 * this.anInt11328 * this.aClass144_11330.anInt1679 * -1829390781 * this.aClass166_11329.anInt1891 * 1990758583;
   }

   public int method95() {
      return this.anInt11328;
   }

   public int method92() {
      return this.anInt11328;
   }

   public void method103(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt11326);
   }

   public int method9() {
      return this.anInt11328;
   }

   void method10401() throws Throwable {
      this.method10400();
      super.finalize();
   }

   void method10402() throws Throwable {
      this.method10400();
      super.finalize();
   }

   public void method101(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt11326);
   }

   Class526_Sub21_Sub1(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5) {
      this.aClass174_Sub2_11325 = var1;
      this.anInt11327 = var4;
      this.anInt11328 = var5;
      this.aClass144_11330 = var2;
      this.aClass166_11329 = var3;
      OpenGL.glGenRenderbuffersEXT(1, anIntArray11332, 0);
      this.anInt11326 = anIntArray11332[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt11326);
      OpenGL.glRenderbufferStorageEXT('\u8d41', Class174_Sub2.method8663(this.aClass144_11330, this.aClass166_11329), this.anInt11327, this.anInt11328);
      this.anInt11331 = this.anInt11327 * this.anInt11328 * this.aClass144_11330.anInt1679 * -1829390781 * this.aClass166_11329.anInt1891 * 1990758583;
   }

   public int method90() {
      return this.anInt11327;
   }

   void method10403() {
      if(this.anInt11326 != 0) {
         this.aClass174_Sub2_11325.method8659(this.anInt11326, this.anInt11331);
         this.anInt11326 = 0;
      }

   }
}
