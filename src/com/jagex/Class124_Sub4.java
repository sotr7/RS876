package com.jagex;

import com.jagex.Class124;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class124_Sub4 extends Class124 {
   int anInt8994;
   int anInt8993;
   int anInt8995;

   void method8393(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glCopyTexSubImage3D(this.anInt1587, 0, var1, var2, var3, var6, var7, var4, var5);
      OpenGL.glFlush();
   }

   Class124_Sub4(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5, int var6, byte[] var7, Class144 var8) {
      super(var1, '\u806f', var2, var3, var4 * var5 * var6, false);
      this.anInt8994 = var4;
      this.anInt8993 = var5;
      this.anInt8995 = var6;
      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(this.anInt1587, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), this.anInt8994, this.anInt8993, this.anInt8995, 0, Class174_Sub2.method8662(var8), 5121, var7, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method1475(true);
   }

   Class124_Sub4(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5, int var6) {
      super(var1, '\u806f', var2, var3, var4 * var5 * var6, false);
      this.anInt8994 = var4;
      this.anInt8993 = var5;
      this.anInt8995 = var6;
      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glTexImage3Dub(this.anInt1587, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), this.anInt8994, this.anInt8993, this.anInt8995, 0, Class174_Sub2.method8662(this.aClass144_1588), 5121, (byte[])null, 0);
      this.method1475(true);
   }
}
