package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub2;
import com.jagex.Class126;
import com.jagex.Class139;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class126_Sub4 extends Class126 {
   static final char aChar8916 = '\u0001';
   static final char aChar8918 = '\u0000';
   boolean aBool8919 = false;
   Class139 aClass139_8917;

   void method1512() {
      if(this.aBool8919) {
         this.aClass139_8917.method1645('\u0001');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
      } else {
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
      this.aBool8919 = false;
   }

   boolean method1505() {
      return true;
   }

   void method1506(boolean var1) {
      Class124_Sub2 var2 = this.aClass174_Sub2_1598.method8626();
      if(this.aClass139_8917 != null && var2 != null && var1) {
         this.aClass139_8917.method1645('\u0000');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(var2);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.aClass174_Sub2_1598.aClass433_9543.method5108(this.aClass174_Sub2_1598.aFloatArray9560), 0);
         OpenGL.glScalef(1.0F, -1.0F, -1.0F);
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_1598.method8677(0);
         this.aBool8919 = true;
      } else {
         this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
      }

   }

   void method1510(boolean var1) {
      Class124_Sub2 var2 = this.aClass174_Sub2_1598.method8626();
      if(this.aClass139_8917 != null && var2 != null && var1) {
         this.aClass139_8917.method1645('\u0000');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(var2);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.aClass174_Sub2_1598.aClass433_9543.method5108(this.aClass174_Sub2_1598.aFloatArray9560), 0);
         OpenGL.glScalef(1.0F, -1.0F, -1.0F);
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_1598.method8677(0);
         this.aBool8919 = true;
      } else {
         this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
      }

   }

   void method1508() {
      if(this.aBool8919) {
         this.aClass139_8917.method1645('\u0001');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
      } else {
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
      this.aBool8919 = false;
   }

   void method1509(int var1, int var2) {
   }

   void method1518(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   boolean method1511() {
      return true;
   }

   void method1520(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1504(boolean var1) {
      this.aClass174_Sub2_1598.method8685(8448, 7681);
   }

   void method1516(int var1, int var2) {
   }

   void method1514() {
      if(this.aBool8919) {
         this.aClass139_8917.method1645('\u0001');
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
      } else {
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
      this.aBool8919 = false;
   }

   void method1507(boolean var1) {
      this.aClass174_Sub2_1598.method8685(8448, 7681);
   }

   void method1515(int var1, int var2) {
   }

   void method1517(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1519(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   Class126_Sub4(Class174_Sub2 var1) {
      super(var1);
      if(var1.aBool9633) {
         this.aClass139_8917 = new Class139(var1, 2);
         this.aClass139_8917.method1643(0);
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8685('\u8575', 7681);
         this.aClass174_Sub2_1598.method8665(2, '\u8578', 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
         OpenGL.glTexGeni(8192, 9472, '\u8512');
         OpenGL.glTexGeni(8193, 9472, '\u8512');
         OpenGL.glTexGeni(8194, 9472, '\u8512');
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         OpenGL.glEnable(3170);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass139_8917.method1648();
         this.aClass139_8917.method1643(1);
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(2, '\u8576', 770);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         OpenGL.glDisable(3170);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass139_8917.method1648();
      }

   }

   void method1513(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }
}
