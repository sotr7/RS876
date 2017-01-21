package com.jagex;

import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class139 {
   int anInt1659;

   void method1643(int var1) {
      OpenGL.glNewList(this.anInt1659 + var1, 4864);
   }

   void method1644(int var1) {
      OpenGL.glNewList(this.anInt1659 + var1, 4864);
   }

   void method1645(char var1) {
      OpenGL.glCallList(this.anInt1659 + var1);
   }

   void method1646(int var1) {
      OpenGL.glNewList(this.anInt1659 + var1, 4864);
   }

   void method1647() {
      OpenGL.glEndList();
   }

   void method1648() {
      OpenGL.glEndList();
   }

   Class139(Class174_Sub2 var1, int var2) {
      this.anInt1659 = OpenGL.glGenLists(var2);
   }
}
