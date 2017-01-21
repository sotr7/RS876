package com.jagex;

import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class140 {
   static final int anInt1661 = 35632;
   static final int anInt1664 = 35633;
   static int[] anIntArray1660 = new int[2];
   Class174_Sub2 aClass174_Sub2_1663;
   int anInt1662;

   void method1649() throws Throwable {
      this.aClass174_Sub2_1663.method8660((long)this.anInt1662);
      super.finalize();
   }

   Class140(Class174_Sub2 var1, int var2, int var3) {
      this.aClass174_Sub2_1663 = var1;
      this.anInt1662 = var2;
   }

   public void finalize() throws Throwable {
      this.aClass174_Sub2_1663.method8660((long)this.anInt1662);
      super.finalize();
   }

   void method1650() throws Throwable {
      this.aClass174_Sub2_1663.method8660((long)this.anInt1662);
      super.finalize();
   }

   static Class140 method1651(Class174_Sub2 var0, int var1, String var2) {
      int var3 = OpenGL.glCreateShader(var1);
      OpenGL.glShaderSource(var3, var2);
      OpenGL.glCompileShader(var3);
      OpenGL.glGetShaderiv(var3, '\u8b81', anIntArray1660, 0);
      if(anIntArray1660[0] == 0) {
         boolean var4 = false;
         if(anIntArray1660[0] == 0) {
            var4 = true;
            System.out.println("");
         }

         OpenGL.glGetShaderiv(var3, '\u8b84', anIntArray1660, 1);
         if(anIntArray1660[1] > 1) {
            byte[] var5 = new byte[anIntArray1660[1]];
            OpenGL.glGetShaderInfoLog(var3, anIntArray1660[1], anIntArray1660, 0, var5, 0);
            System.out.println(new String(var5));
         }

         if(var4) {
            OpenGL.glDeleteShader(var3);
            return null;
         }
      }

      return new Class140(var0, var3, var1);
   }
}
