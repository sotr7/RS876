package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub1_Sub1;
import com.jagex.Class144;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class162_Sub1;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Interface21;
import jaggl.OpenGL;

public class Class153_Sub3 extends Class153 {
   int anInt9239 = 0;
   boolean aBool9235 = false;
   int anInt9236 = 0;
   int anInt9237 = 0;
   int anInt9231 = 0;
   int anInt9238 = 0;
   Class174_Sub2 aClass174_Sub2_9232;
   Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9234;
   Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9233;

   Class153_Sub3(Class174_Sub2 var1, int var2, int var3, int[] var4, int var5, int var6) {
      this.aClass174_Sub2_9232 = var1;
      this.aClass124_Sub1_Sub1_9234 = Class124_Sub1_Sub1.method10442(var1, var2, var3, false, var4, var6, var5);
   }

   Class153_Sub3(Class174_Sub2 var1, int var2, int var3, int var4, int var5) {
      this.aClass174_Sub2_9232 = var1;
      this.aClass124_Sub1_Sub1_9234 = Class124_Sub1_Sub1.method10441(var1, var2, var3, var4, var5);
   }

   public void method1798(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.aClass124_Sub1_Sub1_9234.method8331(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1828(int var1, int var2, int var3, int var4) {
      this.anInt9237 = var1;
      this.anInt9236 = var2;
      this.anInt9238 = var3;
      this.anInt9231 = var4;
      this.aBool9235 = this.anInt9237 != 0 || this.anInt9236 != 0 || this.anInt9238 != 0 || this.anInt9231 != 0;
   }

   public void method1769(int[] var1) {
      var1[0] = this.anInt9237;
      var1[1] = this.anInt9236;
      var1[2] = this.anInt9238;
      var1[3] = this.anInt9231;
   }

   public int method1825() {
      return this.aClass124_Sub1_Sub1_9234.anInt11359;
   }

   public int method21() {
      return this.aClass124_Sub1_Sub1_9234.anInt11359 + this.anInt9237 + this.anInt9238;
   }

   void method8486() {
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8685(8448, 8448);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
      this.aClass174_Sub2_9232.method8674(0, 5890, 770);
      this.aClass174_Sub2_9232.method8677(0);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
   }

   public int method1788() {
      return this.aClass124_Sub1_Sub1_9234.anInt11358 + this.anInt9236 + this.anInt9231;
   }

   public Interface21 method1773() {
      return this.aClass124_Sub1_Sub1_9234.method8334(0);
   }

   public void method1776(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method8488(var1, var2, var3, var4, var5, var6, false);
   }

   public void method1777(int var1, int var2, int var3) {
      OpenGL.glPixelTransferf(3348, 0.5F);
      OpenGL.glPixelTransferf(3349, 0.499F);
      OpenGL.glPixelTransferf(3352, 0.5F);
      OpenGL.glPixelTransferf(3353, 0.499F);
      OpenGL.glPixelTransferf(3354, 0.5F);
      OpenGL.glPixelTransferf(3355, 0.499F);
      this.aClass124_Sub1_Sub1_9233 = Class124_Sub1_Sub1.method10441(this.aClass174_Sub2_9232, var1, var2, this.aClass124_Sub1_Sub1_9234.anInt11359, this.aClass124_Sub1_Sub1_9234.anInt11358);
      this.anInt9239 = var3;
      OpenGL.glPixelTransferf(3348, 1.0F);
      OpenGL.glPixelTransferf(3349, 0.0F);
      OpenGL.glPixelTransferf(3352, 1.0F);
      OpenGL.glPixelTransferf(3353, 0.0F);
      OpenGL.glPixelTransferf(3354, 1.0F);
      OpenGL.glPixelTransferf(3355, 0.0F);
   }

   public void method1815(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method8488(var1, var2, var3, var4, var5, var6, false);
   }

   public void method1782(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aClass124_Sub1_Sub1_9234.method8337(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void method1768(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.aClass124_Sub1_Sub1_9234.method8331(var1, var2, var3, var4, var5, var6, var7);
   }

   public int method1823() {
      return this.aClass124_Sub1_Sub1_9234.anInt11358;
   }

   void method1775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass124_Sub1_Sub1_9234.method1475((var8 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var7);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aBool9235) {
         float var9 = (float)var3 / (float)this.method21();
         float var10 = (float)var4 / (float)this.method1788();
         float var11 = (float)var1 + (float)this.anInt9237 * var9;
         float var12 = (float)var2 + (float)this.anInt9236 * var10;
         float var13 = var11 + (float)this.aClass124_Sub1_Sub1_9234.anInt11359 * var9;
         float var14 = var12 + (float)this.aClass124_Sub1_Sub1_9234.anInt11358 * var10;
         if(this.aClass124_Sub1_Sub1_9233 == null) {
            this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
            this.aClass174_Sub2_9232.method8672(var5);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
         } else {
            this.method8490(var5);
            this.aClass124_Sub1_Sub1_9233.method1475(true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
            this.method8491();
         }
      } else if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var5);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var5);
         this.aClass124_Sub1_Sub1_9233.method1475(true);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   public void method1774(int var1, int var2, int var3, int var4, int var5) {
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var5);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      var1 += this.anInt9237;
      var2 += this.anInt9236;
      if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var3);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var3);
         this.aClass124_Sub1_Sub1_9233.method1475(false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   public void method1797(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.aClass124_Sub1_Sub1_9234.method8331(var1, var2, var3, var4, var5, var6, var7);
   }

   void method1808(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass124_Sub1_Sub1_9234.method1475((var8 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var7);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aBool9235) {
         float var9 = (float)var3 / (float)this.method21();
         float var10 = (float)var4 / (float)this.method1788();
         float var11 = (float)var1 + (float)this.anInt9237 * var9;
         float var12 = (float)var2 + (float)this.anInt9236 * var10;
         float var13 = var11 + (float)this.aClass124_Sub1_Sub1_9234.anInt11359 * var9;
         float var14 = var12 + (float)this.aClass124_Sub1_Sub1_9234.anInt11358 * var10;
         if(this.aClass124_Sub1_Sub1_9233 == null) {
            this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
            this.aClass174_Sub2_9232.method8672(var5);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
         } else {
            this.method8490(var5);
            this.aClass124_Sub1_Sub1_9233.method1475(true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
            this.method8491();
         }
      } else if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var5);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var5);
         this.aClass124_Sub1_Sub1_9233.method1475(true);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   public void method1784(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 + var3;
      int var9 = var2 + var4;
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8651(var7);
      this.aClass174_Sub2_9232.method8672(var5);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aClass124_Sub1_Sub1_9234.aBool11360 && !this.aBool9235 && var4 >= this.aClass124_Sub1_Sub1_9234.anInt11358 && var3 >= this.aClass124_Sub1_Sub1_9234.anInt11359) {
         float var18 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)var4 / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
         float var19 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)var3 / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var18);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var9);
         OpenGL.glTexCoord2f(var19, 0.0F);
         OpenGL.glVertex2i(var8, var9);
         OpenGL.glTexCoord2f(var19, var18);
         OpenGL.glVertex2i(var8, var2);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)this.anInt9237, (float)this.anInt9236, 0.0F);
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.aClass124_Sub1_Sub1_9234.anInt11358;
         OpenGL.glBegin(7);

         int var13;
         int var14;
         for(var13 = var2; var12 <= var9; var12 += var11) {
            var14 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            int var15;
            for(var15 = var1; var14 <= var8; var15 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
               OpenGL.glVertex2i(var14, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               var14 += var10;
            }

            if(var15 < var8) {
               float var16 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var15) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(var16, 0.0F);
               OpenGL.glVertex2i(var8, var12);
               OpenGL.glTexCoord2f(var16, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }

            var13 += var11;
         }

         if(var13 < var9) {
            float var20 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)(this.aClass124_Sub1_Sub1_9234.anInt11358 - (var9 - var13)) / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
            int var21 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            for(var14 = var1; var21 <= var8; var14 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, var20);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var21, var13);
               var21 += var10;
            }

            if(var14 < var8) {
               float var17 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var14) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(var17, var20);
               OpenGL.glVertex2i(var8, var9);
               OpenGL.glTexCoord2f(var17, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }
         }

         OpenGL.glEnd();
         OpenGL.glPopMatrix();
      }

   }

   void method1791(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      float var11;
      float var12;
      if(this.aBool9235) {
         var11 = (float)this.method21();
         var12 = (float)this.method1788();
         float var13 = (var3 - var1) / var11;
         float var14 = (var4 - var2) / var11;
         float var15 = (var5 - var1) / var12;
         float var16 = (var6 - var2) / var12;
         float var17 = var15 * (float)this.anInt9236;
         float var18 = var16 * (float)this.anInt9236;
         float var19 = var13 * (float)this.anInt9237;
         float var20 = var14 * (float)this.anInt9237;
         float var21 = -var13 * (float)this.anInt9238;
         float var22 = -var14 * (float)this.anInt9238;
         float var23 = -var15 * (float)this.anInt9231;
         float var24 = -var16 * (float)this.anInt9231;
         var1 = var1 + var19 + var17;
         var2 = var2 + var20 + var18;
         var3 = var3 + var21 + var17;
         var4 = var4 + var22 + var18;
         var5 = var5 + var19 + var23;
         var6 = var6 + var20 + var24;
      }

      var11 = var5 + (var3 - var1);
      var12 = var4 + (var6 - var2);
      this.aClass124_Sub1_Sub1_9234.method1475((var10 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8651(var9);
      this.aClass174_Sub2_9232.method8672(var7);
      OpenGL.glColor4ub((byte)(var8 >> 16), (byte)(var8 >> 8), (byte)var8, (byte)(var8 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
      OpenGL.glVertex2f(var11, var12);
      OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
   }

   void method1793(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10) {
      Class124_Sub1_Sub1 var11 = ((Class162_Sub1)var8).aClass124_Sub1_Sub1_9118;
      float var12;
      float var13;
      float var14;
      float var15;
      if(this.aBool9235) {
         var12 = (float)this.method21();
         var13 = (float)this.method1788();
         var14 = (var3 - var1) / var12;
         var15 = (var4 - var2) / var12;
         float var16 = (var5 - var1) / var13;
         float var17 = (var6 - var2) / var13;
         float var18 = var16 * (float)this.anInt9236;
         float var19 = var17 * (float)this.anInt9236;
         float var20 = var14 * (float)this.anInt9237;
         float var21 = var15 * (float)this.anInt9237;
         float var22 = -var14 * (float)this.anInt9238;
         float var23 = -var15 * (float)this.anInt9238;
         float var24 = -var16 * (float)this.anInt9231;
         float var25 = -var17 * (float)this.anInt9231;
         var1 = var1 + var20 + var18;
         var2 = var2 + var21 + var19;
         var3 = var3 + var22 + var18;
         var4 = var4 + var23 + var19;
         var5 = var5 + var20 + var24;
         var6 = var6 + var21 + var25;
      }

      var12 = var5 + (var3 - var1);
      var13 = var4 + (var6 - var2);
      this.aClass124_Sub1_Sub1_9234.method1475((var7 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8672(1);
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641(var11);
      this.aClass174_Sub2_9232.method8685(7681, 8448);
      this.aClass174_Sub2_9232.method8665(0, '\u8578', 768);
      this.aClass174_Sub2_9232.method8651(1);
      var14 = var11.aFloat11361 / (float)var11.anInt11359;
      var15 = var11.aFloat11357 / (float)var11.anInt11358;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var1 - (float)var9), var11.aFloat11357 - var15 * (var2 - (float)var10));
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var5 - (float)var9), var11.aFloat11357 - var15 * (var6 - (float)var10));
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var12 - (float)var9), var11.aFloat11357 - var15 * (var13 - (float)var10));
      OpenGL.glVertex2f(var12, var13);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var3 - (float)var9), var11.aFloat11357 - var15 * (var4 - (float)var10));
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
      this.aClass174_Sub2_9232.method8665(0, 5890, 768);
      this.aClass174_Sub2_9232.method8672(0);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8677(0);
   }

   public void method1811(int[] var1) {
      var1[0] = this.anInt9237;
      var1[1] = this.anInt9236;
      var1[2] = this.anInt9238;
      var1[3] = this.anInt9231;
   }

   public void method1809(int var1, int var2, int var3, int var4) {
      this.anInt9237 = var1;
      this.anInt9236 = var2;
      this.anInt9238 = var3;
      this.anInt9231 = var4;
      this.aBool9235 = this.anInt9237 != 0 || this.anInt9236 != 0 || this.anInt9238 != 0 || this.anInt9231 != 0;
   }

   void method1821(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10) {
      Class124_Sub1_Sub1 var11 = ((Class162_Sub1)var8).aClass124_Sub1_Sub1_9118;
      float var12;
      float var13;
      float var14;
      float var15;
      if(this.aBool9235) {
         var12 = (float)this.method21();
         var13 = (float)this.method1788();
         var14 = (var3 - var1) / var12;
         var15 = (var4 - var2) / var12;
         float var16 = (var5 - var1) / var13;
         float var17 = (var6 - var2) / var13;
         float var18 = var16 * (float)this.anInt9236;
         float var19 = var17 * (float)this.anInt9236;
         float var20 = var14 * (float)this.anInt9237;
         float var21 = var15 * (float)this.anInt9237;
         float var22 = -var14 * (float)this.anInt9238;
         float var23 = -var15 * (float)this.anInt9238;
         float var24 = -var16 * (float)this.anInt9231;
         float var25 = -var17 * (float)this.anInt9231;
         var1 = var1 + var20 + var18;
         var2 = var2 + var21 + var19;
         var3 = var3 + var22 + var18;
         var4 = var4 + var23 + var19;
         var5 = var5 + var20 + var24;
         var6 = var6 + var21 + var25;
      }

      var12 = var5 + (var3 - var1);
      var13 = var4 + (var6 - var2);
      this.aClass124_Sub1_Sub1_9234.method1475((var7 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8672(1);
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641(var11);
      this.aClass174_Sub2_9232.method8685(7681, 8448);
      this.aClass174_Sub2_9232.method8665(0, '\u8578', 768);
      this.aClass174_Sub2_9232.method8651(1);
      var14 = var11.aFloat11361 / (float)var11.anInt11359;
      var15 = var11.aFloat11357 / (float)var11.anInt11358;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var1 - (float)var9), var11.aFloat11357 - var15 * (var2 - (float)var10));
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var5 - (float)var9), var11.aFloat11357 - var15 * (var6 - (float)var10));
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var12 - (float)var9), var11.aFloat11357 - var15 * (var13 - (float)var10));
      OpenGL.glVertex2f(var12, var13);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var14 * (var3 - (float)var9), var11.aFloat11357 - var15 * (var4 - (float)var10));
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
      this.aClass174_Sub2_9232.method8665(0, 5890, 768);
      this.aClass174_Sub2_9232.method8672(0);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8677(0);
   }

   public void method1795(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aClass124_Sub1_Sub1_9234.method8337(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void method1780(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 + var3;
      int var9 = var2 + var4;
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8651(var7);
      this.aClass174_Sub2_9232.method8672(var5);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aClass124_Sub1_Sub1_9234.aBool11360 && !this.aBool9235 && var4 >= this.aClass124_Sub1_Sub1_9234.anInt11358 && var3 >= this.aClass124_Sub1_Sub1_9234.anInt11359) {
         float var18 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)var4 / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
         float var19 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)var3 / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var18);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var9);
         OpenGL.glTexCoord2f(var19, 0.0F);
         OpenGL.glVertex2i(var8, var9);
         OpenGL.glTexCoord2f(var19, var18);
         OpenGL.glVertex2i(var8, var2);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)this.anInt9237, (float)this.anInt9236, 0.0F);
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.aClass124_Sub1_Sub1_9234.anInt11358;
         OpenGL.glBegin(7);

         int var13;
         int var14;
         for(var13 = var2; var12 <= var9; var12 += var11) {
            var14 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            int var15;
            for(var15 = var1; var14 <= var8; var15 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
               OpenGL.glVertex2i(var14, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               var14 += var10;
            }

            if(var15 < var8) {
               float var16 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var15) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(var16, 0.0F);
               OpenGL.glVertex2i(var8, var12);
               OpenGL.glTexCoord2f(var16, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }

            var13 += var11;
         }

         if(var13 < var9) {
            float var20 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)(this.aClass124_Sub1_Sub1_9234.anInt11358 - (var9 - var13)) / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
            int var21 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            for(var14 = var1; var21 <= var8; var14 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, var20);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var21, var13);
               var21 += var10;
            }

            if(var14 < var8) {
               float var17 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var14) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(var17, var20);
               OpenGL.glVertex2i(var8, var9);
               OpenGL.glTexCoord2f(var17, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }
         }

         OpenGL.glEnd();
         OpenGL.glPopMatrix();
      }

   }

   public int method1817() {
      return this.aClass124_Sub1_Sub1_9234.anInt11358 + this.anInt9236 + this.anInt9231;
   }

   public int method1771() {
      return this.aClass124_Sub1_Sub1_9234.anInt11358;
   }

   public void method1800(int var1, int var2, int var3) {
      OpenGL.glPixelTransferf(3348, 0.5F);
      OpenGL.glPixelTransferf(3349, 0.499F);
      OpenGL.glPixelTransferf(3352, 0.5F);
      OpenGL.glPixelTransferf(3353, 0.499F);
      OpenGL.glPixelTransferf(3354, 0.5F);
      OpenGL.glPixelTransferf(3355, 0.499F);
      this.aClass124_Sub1_Sub1_9233 = Class124_Sub1_Sub1.method10441(this.aClass174_Sub2_9232, var1, var2, this.aClass124_Sub1_Sub1_9234.anInt11359, this.aClass124_Sub1_Sub1_9234.anInt11358);
      this.anInt9239 = var3;
      OpenGL.glPixelTransferf(3348, 1.0F);
      OpenGL.glPixelTransferf(3349, 0.0F);
      OpenGL.glPixelTransferf(3352, 1.0F);
      OpenGL.glPixelTransferf(3353, 0.0F);
      OpenGL.glPixelTransferf(3354, 1.0F);
      OpenGL.glPixelTransferf(3355, 0.0F);
   }

   public Interface21 method1830() {
      return this.aClass124_Sub1_Sub1_9234.method8334(0);
   }

   public void method1802(int var1, int var2, int var3, int var4, int var5) {
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var5);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      var1 += this.anInt9237;
      var2 += this.anInt9236;
      if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var3);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var3);
         this.aClass124_Sub1_Sub1_9233.method1475(false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   Class153_Sub3(Class174_Sub2 var1, int var2, int var3, boolean var4) {
      this.aClass174_Sub2_9232 = var1;
      this.aClass124_Sub1_Sub1_9234 = Class124_Sub1_Sub1.method10444(var1, var4?Class144.aClass144_1680:Class144.aClass144_1689, Class166.aClass166_1884, var2, var3);
   }

   public void method1804(int var1, int var2, int var3, int var4, int var5) {
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var5);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      var1 += this.anInt9237;
      var2 += this.anInt9236;
      if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var3);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var3);
         this.aClass124_Sub1_Sub1_9233.method1475(false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   public void method1805(int var1, int var2, Class162 var3, int var4, int var5) {
      Class162_Sub1 var6 = (Class162_Sub1)var3;
      Class124_Sub1_Sub1 var7 = var6.aClass124_Sub1_Sub1_9118;
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8672(1);
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641(var7);
      this.aClass174_Sub2_9232.method8685(7681, 8448);
      this.aClass174_Sub2_9232.method8665(0, '\u8578', 768);
      this.aClass174_Sub2_9232.method8651(1);
      var1 += this.anInt9237;
      var2 += this.anInt9236;
      int var8 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;
      int var9 = var2 + this.aClass124_Sub1_Sub1_9234.anInt11358;
      float var10 = var7.aFloat11361 / (float)var7.anInt11359;
      float var11 = var7.aFloat11357 / (float)var7.anInt11358;
      float var12 = (float)(var1 - var4) * var10;
      float var13 = (float)(var8 - var4) * var10;
      float var14 = var7.aFloat11357 - (float)(var2 - var5) * var11;
      float var15 = var7.aFloat11357 - (float)(var9 - var5) * var11;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var12, var14);
      OpenGL.glVertex2i(var1, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var12, var15);
      OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var13, var15);
      OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var13, var14);
      OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
      OpenGL.glEnd();
      this.aClass174_Sub2_9232.method8665(0, 5890, 768);
      this.aClass174_Sub2_9232.method8672(0);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8677(0);
   }

   void method1819(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass124_Sub1_Sub1_9234.method1475((var8 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var7);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aBool9235) {
         float var9 = (float)var3 / (float)this.method21();
         float var10 = (float)var4 / (float)this.method1788();
         float var11 = (float)var1 + (float)this.anInt9237 * var9;
         float var12 = (float)var2 + (float)this.anInt9236 * var10;
         float var13 = var11 + (float)this.aClass124_Sub1_Sub1_9234.anInt11359 * var9;
         float var14 = var12 + (float)this.aClass124_Sub1_Sub1_9234.anInt11358 * var10;
         if(this.aClass124_Sub1_Sub1_9233 == null) {
            this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
            this.aClass174_Sub2_9232.method8672(var5);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
         } else {
            this.method8490(var5);
            this.aClass124_Sub1_Sub1_9233.method1475(true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
            this.method8491();
         }
      } else if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var5);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var5);
         this.aClass124_Sub1_Sub1_9233.method1475(true);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   void method1807(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass124_Sub1_Sub1_9234.method1475((var8 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var7);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aBool9235) {
         float var9 = (float)var3 / (float)this.method21();
         float var10 = (float)var4 / (float)this.method1788();
         float var11 = (float)var1 + (float)this.anInt9237 * var9;
         float var12 = (float)var2 + (float)this.anInt9236 * var10;
         float var13 = var11 + (float)this.aClass124_Sub1_Sub1_9234.anInt11359 * var9;
         float var14 = var12 + (float)this.aClass124_Sub1_Sub1_9234.anInt11358 * var10;
         if(this.aClass124_Sub1_Sub1_9233 == null) {
            this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
            this.aClass174_Sub2_9232.method8672(var5);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
         } else {
            this.method8490(var5);
            this.aClass124_Sub1_Sub1_9233.method1475(true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
            this.method8491();
         }
      } else if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var5);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var5);
         this.aClass124_Sub1_Sub1_9233.method1475(true);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   void method8487() {
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8685(8448, 8448);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
      this.aClass174_Sub2_9232.method8674(0, 5890, 770);
      this.aClass174_Sub2_9232.method8677(0);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
   }

   public void method1799(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method8488(var1, var2, var3, var4, var5, var6, false);
   }

   public void method1810(int[] var1) {
      var1[0] = this.anInt9237;
      var1[1] = this.anInt9236;
      var1[2] = this.anInt9238;
      var1[3] = this.anInt9231;
   }

   public int method18() {
      return this.aClass124_Sub1_Sub1_9234.anInt11359 + this.anInt9237 + this.anInt9238;
   }

   public int method1812() {
      return this.aClass124_Sub1_Sub1_9234.anInt11359;
   }

   public int method1813() {
      return this.aClass124_Sub1_Sub1_9234.anInt11359;
   }

   public void method1796(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aClass124_Sub1_Sub1_9234.method8337(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public int method1787() {
      return this.aClass124_Sub1_Sub1_9234.anInt11358;
   }

   public int method1827() {
      return this.aClass124_Sub1_Sub1_9234.anInt11358;
   }

   void method8488(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if(this.aClass174_Sub2_9232.aBool9620 && !var7) {
         int[] var8 = this.aClass174_Sub2_9232.method2479(var5, var6, var3, var4);
         if(var8 != null) {
            for(int var9 = 0; var9 < var8.length; ++var9) {
               var8[var9] |= -16777216;
            }

            this.method1782(var1, var2, var3, var4, var8, 0, var3);
         }
      } else {
         this.aClass124_Sub1_Sub1_9234.method8332(var1, var2, var3, var4, var5, var6);
      }

   }

   public int method20() {
      return this.aClass124_Sub1_Sub1_9234.anInt11359 + this.anInt9237 + this.anInt9238;
   }

   public int method19() {
      return this.aClass124_Sub1_Sub1_9234.anInt11359 + this.anInt9237 + this.anInt9238;
   }

   public int method1818() {
      return this.aClass124_Sub1_Sub1_9234.anInt11358 + this.anInt9236 + this.anInt9231;
   }

   public void method1779(int var1, int var2, Class162 var3, int var4, int var5) {
      Class162_Sub1 var6 = (Class162_Sub1)var3;
      Class124_Sub1_Sub1 var7 = var6.aClass124_Sub1_Sub1_9118;
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8672(1);
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641(var7);
      this.aClass174_Sub2_9232.method8685(7681, 8448);
      this.aClass174_Sub2_9232.method8665(0, '\u8578', 768);
      this.aClass174_Sub2_9232.method8651(1);
      var1 += this.anInt9237;
      var2 += this.anInt9236;
      int var8 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;
      int var9 = var2 + this.aClass124_Sub1_Sub1_9234.anInt11358;
      float var10 = var7.aFloat11361 / (float)var7.anInt11359;
      float var11 = var7.aFloat11357 / (float)var7.anInt11358;
      float var12 = (float)(var1 - var4) * var10;
      float var13 = (float)(var8 - var4) * var10;
      float var14 = var7.aFloat11357 - (float)(var2 - var5) * var11;
      float var15 = var7.aFloat11357 - (float)(var9 - var5) * var11;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var12, var14);
      OpenGL.glVertex2i(var1, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var12, var15);
      OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var13, var15);
      OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
      OpenGL.glMultiTexCoord2f('\u84c0', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glMultiTexCoord2f('\u84c1', var13, var14);
      OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
      OpenGL.glEnd();
      this.aClass174_Sub2_9232.method8665(0, 5890, 768);
      this.aClass174_Sub2_9232.method8672(0);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8677(0);
   }

   public void method1803(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 + var3;
      int var9 = var2 + var4;
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8651(var7);
      this.aClass174_Sub2_9232.method8672(var5);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aClass124_Sub1_Sub1_9234.aBool11360 && !this.aBool9235 && var4 >= this.aClass124_Sub1_Sub1_9234.anInt11358 && var3 >= this.aClass124_Sub1_Sub1_9234.anInt11359) {
         float var18 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)var4 / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
         float var19 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)var3 / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var18);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var9);
         OpenGL.glTexCoord2f(var19, 0.0F);
         OpenGL.glVertex2i(var8, var9);
         OpenGL.glTexCoord2f(var19, var18);
         OpenGL.glVertex2i(var8, var2);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)this.anInt9237, (float)this.anInt9236, 0.0F);
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.aClass124_Sub1_Sub1_9234.anInt11358;
         OpenGL.glBegin(7);

         int var13;
         int var14;
         for(var13 = var2; var12 <= var9; var12 += var11) {
            var14 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            int var15;
            for(var15 = var1; var14 <= var8; var15 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
               OpenGL.glVertex2i(var14, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               var14 += var10;
            }

            if(var15 < var8) {
               float var16 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var15) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(var16, 0.0F);
               OpenGL.glVertex2i(var8, var12);
               OpenGL.glTexCoord2f(var16, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }

            var13 += var11;
         }

         if(var13 < var9) {
            float var20 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)(this.aClass124_Sub1_Sub1_9234.anInt11358 - (var9 - var13)) / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
            int var21 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            for(var14 = var1; var21 <= var8; var14 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, var20);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var21, var13);
               var21 += var10;
            }

            if(var14 < var8) {
               float var17 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var14) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(var17, var20);
               OpenGL.glVertex2i(var8, var9);
               OpenGL.glTexCoord2f(var17, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }
         }

         OpenGL.glEnd();
         OpenGL.glPopMatrix();
      }

   }

   public void method1806(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 + var3;
      int var9 = var2 + var4;
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8651(var7);
      this.aClass174_Sub2_9232.method8672(var5);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if(this.aClass124_Sub1_Sub1_9234.aBool11360 && !this.aBool9235 && var4 >= this.aClass124_Sub1_Sub1_9234.anInt11358 && var3 >= this.aClass124_Sub1_Sub1_9234.anInt11359) {
         float var18 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)var4 / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
         float var19 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)var3 / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var18);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var9);
         OpenGL.glTexCoord2f(var19, 0.0F);
         OpenGL.glVertex2i(var8, var9);
         OpenGL.glTexCoord2f(var19, var18);
         OpenGL.glVertex2i(var8, var2);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)this.anInt9237, (float)this.anInt9236, 0.0F);
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.aClass124_Sub1_Sub1_9234.anInt11358;
         OpenGL.glBegin(7);

         int var13;
         int var14;
         for(var13 = var2; var12 <= var9; var12 += var11) {
            var14 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            int var15;
            for(var15 = var1; var14 <= var8; var15 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
               OpenGL.glVertex2i(var14, var12);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               var14 += var10;
            }

            if(var15 < var8) {
               float var16 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var15) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(var16, 0.0F);
               OpenGL.glVertex2i(var8, var12);
               OpenGL.glTexCoord2f(var16, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }

            var13 += var11;
         }

         if(var13 < var9) {
            float var20 = this.aClass124_Sub1_Sub1_9234.aFloat11357 * (float)(this.aClass124_Sub1_Sub1_9234.anInt11358 - (var9 - var13)) / (float)this.aClass124_Sub1_Sub1_9234.anInt11358;
            int var21 = var1 + this.aClass124_Sub1_Sub1_9234.anInt11359;

            for(var14 = var1; var21 <= var8; var14 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, var20);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var21, var13);
               var21 += var10;
            }

            if(var14 < var8) {
               float var17 = this.aClass124_Sub1_Sub1_9234.aFloat11361 * (float)(var8 - var14) / (float)this.aClass124_Sub1_Sub1_9234.anInt11359;
               OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var14, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var14, var9);
               OpenGL.glTexCoord2f(var17, var20);
               OpenGL.glVertex2i(var8, var9);
               OpenGL.glTexCoord2f(var17, this.aClass124_Sub1_Sub1_9234.aFloat11357);
               OpenGL.glVertex2i(var8, var13);
            }
         }

         OpenGL.glEnd();
         OpenGL.glPopMatrix();
      }

   }

   void method8489() {
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8685(8448, 8448);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
      this.aClass174_Sub2_9232.method8674(0, 5890, 770);
      this.aClass174_Sub2_9232.method8677(0);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
   }

   public void method1770(int var1, int var2, int var3, int var4, int var5) {
      this.aClass124_Sub1_Sub1_9234.method1475(false);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8651(var5);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      var1 += this.anInt9237;
      var2 += this.anInt9236;
      if(this.aClass124_Sub1_Sub1_9233 == null) {
         this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
         this.aClass174_Sub2_9232.method8672(var3);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
      } else {
         this.method8490(var3);
         this.aClass124_Sub1_Sub1_9233.method1475(false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2 + this.aClass124_Sub1_Sub1_9234.anInt11358);
         OpenGL.glMultiTexCoord2f('\u84c1', this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
         OpenGL.glVertex2i(var1 + this.aClass124_Sub1_Sub1_9234.anInt11359, var2);
         OpenGL.glEnd();
         this.method8491();
      }

   }

   void method1820(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      float var11;
      float var12;
      if(this.aBool9235) {
         var11 = (float)this.method21();
         var12 = (float)this.method1788();
         float var13 = (var3 - var1) / var11;
         float var14 = (var4 - var2) / var11;
         float var15 = (var5 - var1) / var12;
         float var16 = (var6 - var2) / var12;
         float var17 = var15 * (float)this.anInt9236;
         float var18 = var16 * (float)this.anInt9236;
         float var19 = var13 * (float)this.anInt9237;
         float var20 = var14 * (float)this.anInt9237;
         float var21 = -var13 * (float)this.anInt9238;
         float var22 = -var14 * (float)this.anInt9238;
         float var23 = -var15 * (float)this.anInt9231;
         float var24 = -var16 * (float)this.anInt9231;
         var1 = var1 + var19 + var17;
         var2 = var2 + var20 + var18;
         var3 = var3 + var21 + var17;
         var4 = var4 + var22 + var18;
         var5 = var5 + var19 + var23;
         var6 = var6 + var20 + var24;
      }

      var11 = var5 + (var3 - var1);
      var12 = var4 + (var6 - var2);
      this.aClass124_Sub1_Sub1_9234.method1475((var10 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8651(var9);
      this.aClass174_Sub2_9232.method8672(var7);
      OpenGL.glColor4ub((byte)(var8 >> 16), (byte)(var8 >> 8), (byte)var8, (byte)(var8 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
      OpenGL.glVertex2f(var11, var12);
      OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
   }

   void method8490(int var1) {
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8685(this.aClass174_Sub2_9232.method8642(var1), 7681);
      this.aClass174_Sub2_9232.method8665(1, '\u8577', 768);
      this.aClass174_Sub2_9232.method8674(0, '\u8578', 770);
      this.aClass174_Sub2_9232.method8677(0);
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9233);
      this.aClass174_Sub2_9232.method8685('\u86af', 7681);
      this.aClass174_Sub2_9232.method8665(1, '\u8576', 768);
      if(this.anInt9239 == 0) {
         this.aClass174_Sub2_9232.method8640(1.0F, 0.5F, 0.5F, 0.0F);
      } else if(this.anInt9239 == 1) {
         this.aClass174_Sub2_9232.method8640(0.5F, 1.0F, 0.5F, 0.0F);
      } else if(this.anInt9239 == 2) {
         this.aClass174_Sub2_9232.method8640(0.5F, 0.5F, 1.0F, 0.0F);
      } else if(this.anInt9239 == 3) {
         this.aClass174_Sub2_9232.method8640(128.5F, 128.5F, 128.5F, 0.0F);
      }

   }

   void method8491() {
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8685(8448, 8448);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
      this.aClass174_Sub2_9232.method8674(0, 5890, 770);
      this.aClass174_Sub2_9232.method8677(0);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
   }

   void method8492(int var1) {
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8685(this.aClass174_Sub2_9232.method8642(var1), 7681);
      this.aClass174_Sub2_9232.method8665(1, '\u8577', 768);
      this.aClass174_Sub2_9232.method8674(0, '\u8578', 770);
      this.aClass174_Sub2_9232.method8677(0);
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9233);
      this.aClass174_Sub2_9232.method8685('\u86af', 7681);
      this.aClass174_Sub2_9232.method8665(1, '\u8576', 768);
      if(this.anInt9239 == 0) {
         this.aClass174_Sub2_9232.method8640(1.0F, 0.5F, 0.5F, 0.0F);
      } else if(this.anInt9239 == 1) {
         this.aClass174_Sub2_9232.method8640(0.5F, 1.0F, 0.5F, 0.0F);
      } else if(this.anInt9239 == 2) {
         this.aClass174_Sub2_9232.method8640(0.5F, 0.5F, 1.0F, 0.0F);
      } else if(this.anInt9239 == 3) {
         this.aClass174_Sub2_9232.method8640(128.5F, 128.5F, 128.5F, 0.0F);
      }

   }

   public void method1794(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aClass124_Sub1_Sub1_9234.method8337(var1, var2, var3, var4, var5, var6, var7, true);
   }

   void method8493() {
      this.aClass174_Sub2_9232.method8677(1);
      this.aClass174_Sub2_9232.method8641((Class124)null);
      this.aClass174_Sub2_9232.method8685(8448, 8448);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
      this.aClass174_Sub2_9232.method8674(0, 5890, 770);
      this.aClass174_Sub2_9232.method8677(0);
      this.aClass174_Sub2_9232.method8665(1, '\u8578', 768);
   }

   void method1814(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      float var11;
      float var12;
      if(this.aBool9235) {
         var11 = (float)this.method21();
         var12 = (float)this.method1788();
         float var13 = (var3 - var1) / var11;
         float var14 = (var4 - var2) / var11;
         float var15 = (var5 - var1) / var12;
         float var16 = (var6 - var2) / var12;
         float var17 = var15 * (float)this.anInt9236;
         float var18 = var16 * (float)this.anInt9236;
         float var19 = var13 * (float)this.anInt9237;
         float var20 = var14 * (float)this.anInt9237;
         float var21 = -var13 * (float)this.anInt9238;
         float var22 = -var14 * (float)this.anInt9238;
         float var23 = -var15 * (float)this.anInt9231;
         float var24 = -var16 * (float)this.anInt9231;
         var1 = var1 + var19 + var17;
         var2 = var2 + var20 + var18;
         var3 = var3 + var21 + var17;
         var4 = var4 + var22 + var18;
         var5 = var5 + var19 + var23;
         var6 = var6 + var20 + var24;
      }

      var11 = var5 + (var3 - var1);
      var12 = var4 + (var6 - var2);
      this.aClass124_Sub1_Sub1_9234.method1475((var10 & 1) != 0);
      this.aClass174_Sub2_9232.method8668();
      this.aClass174_Sub2_9232.method8641(this.aClass124_Sub1_Sub1_9234);
      this.aClass174_Sub2_9232.method8651(var9);
      this.aClass174_Sub2_9232.method8672(var7);
      OpenGL.glColor4ub((byte)(var8 >> 16), (byte)(var8 >> 8), (byte)var8, (byte)(var8 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, 0.0F);
      OpenGL.glVertex2f(var11, var12);
      OpenGL.glTexCoord2f(this.aClass124_Sub1_Sub1_9234.aFloat11361, this.aClass124_Sub1_Sub1_9234.aFloat11357);
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
   }
}
