package com.jagex;

import com.jagex.Class124;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class124_Sub3 extends Class124 {
   int anInt8986;

   void method8392(boolean var1) {
      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glTexParameteri(this.anInt1587, 10242, var1?10497:'\u812f');
   }

   Class124_Sub3(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, byte[] var5, Class144 var6) {
      super(var1, 3552, var2, var3, var4, false);
      this.anInt8986 = var4;
      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage1Dub(this.anInt1587, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), this.anInt8986, 0, Class174_Sub2.method8662(var6), 5121, var5, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method1475(true);
   }
}
