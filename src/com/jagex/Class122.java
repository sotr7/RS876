package com.jagex;

import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class122 {
   static final int anInt1570 = 34336;
   Class174_Sub2 aClass174_Sub2_1569;
   int anInt1568;
   static int[] anIntArray1571 = new int[1];

   Class122(Class174_Sub2 var1, int var2, int var3) {
      this.aClass174_Sub2_1569 = var1;
      this.anInt1568 = var3;
   }

   public void finalize() throws Throwable {
      this.aClass174_Sub2_1569.method8625(this.anInt1568);
      super.finalize();
   }

   void method1471() throws Throwable {
      this.aClass174_Sub2_1569.method8625(this.anInt1568);
      super.finalize();
   }

   void method1472() throws Throwable {
      this.aClass174_Sub2_1569.method8625(this.anInt1568);
      super.finalize();
   }

   static Class122 method1473(Class174_Sub2 var0, int var1, String var2) {
      int var3 = OpenGL.glGenProgramARB();
      OpenGL.glBindProgramARB(var1, var3);
      OpenGL.glProgramStringARB(var1, '\u8875', var2);
      OpenGL.glGetIntegerv('\u864b', anIntArray1571, 0);
      if(anIntArray1571[0] != -1) {
         OpenGL.glBindProgramARB(var1, 0);
         return null;
      } else {
         OpenGL.glBindProgramARB(var1, 0);
         return new Class122(var0, var1, var3);
      }
   }
}
