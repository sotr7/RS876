package com.jagex;

import com.jagex.Class140;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class133 {
   Class174_Sub2 aClass174_Sub2_1636;
   int anInt1635;
   static int[] anIntArray1637 = new int[2];

   static Class133 method1629(Class174_Sub2 var0, Class140[] var1) {
      int var2;
      for(var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2] == null || var1[var2].anInt1662 <= 0) {
            return null;
         }
      }

      var2 = OpenGL.glCreateProgram();

      int var3;
      for(var3 = 0; var3 < var1.length; ++var3) {
         OpenGL.glAttachShader(var2, var1[var3].anInt1662);
      }

      OpenGL.glLinkProgram(var2);
      OpenGL.glGetProgramiv(var2, '\u8b82', anIntArray1637, 0);
      if(anIntArray1637[0] == 0) {
         OpenGL.glGetProgramiv(var2, '\u8b84', anIntArray1637, 1);
         if(anIntArray1637[1] > 1) {
            byte[] var4 = new byte[anIntArray1637[1]];
            OpenGL.glGetProgramInfoLog(var2, anIntArray1637[1], anIntArray1637, 0, var4, 0);
         }

         if(anIntArray1637[0] == 0) {
            for(var3 = 0; var3 < var1.length; ++var3) {
               OpenGL.glDetachShader(var2, var1[var3].anInt1662);
            }

            OpenGL.glDeleteProgram(var2);
            return null;
         }
      }

      return new Class133(var0, var2, var1);
   }

   Class133(Class174_Sub2 var1, int var2, Class140[] var3) {
      this.aClass174_Sub2_1636 = var1;
      this.anInt1635 = var2;
   }

   public void finalize() throws Throwable {
      this.aClass174_Sub2_1636.method8660((long)this.anInt1635);
      super.finalize();
   }

   void method1630() throws Throwable {
      this.aClass174_Sub2_1636.method8660((long)this.anInt1635);
      super.finalize();
   }

   void method1631() throws Throwable {
      this.aClass174_Sub2_1636.method8660((long)this.anInt1635);
      super.finalize();
   }
}
