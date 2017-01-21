package com.jagex;

import com.jagex.Class124;
import com.jagex.Class131;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Interface21;
import jaggl.OpenGL;

public class Class124_Sub2 extends Class124 {
   static final int anInt8920 = 34069;
   static final int anInt8921 = 34071;
   static final int anInt8922 = 34070;
   static final int anInt8923 = 34072;
   static final int anInt8924 = 34073;
   static final int anInt8925 = 34074;
   int anInt8926;

   Class124_Sub2(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4) {
      super(var1, '\u8513', var2, var3, var4 * var4 * 6, false);
      this.anInt8926 = var4;
      this.aClass174_Sub2_1585.method8641(this);

      for(int var5 = 0; var5 < 6; ++var5) {
         OpenGL.glTexImage2Dub('\u8515' + var5, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), var4, var4, 0, Class174_Sub2.method8662(this.aClass144_1588), 5121, (byte[])null, 0);
      }

      this.method1475(true);
   }

   Class124_Sub2(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, boolean var5, byte[][] var6, Class144 var7) {
      super(var1, '\u8513', var2, var3, var4 * var4 * 6, var5);
      this.anInt8926 = var4;
      this.aClass174_Sub2_1585.method8641(this);

      for(int var8 = 0; var8 < 6; ++var8) {
         OpenGL.glTexImage2Dub('\u8515' + var8, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), var4, var4, 0, Class174_Sub2.method8662(var7), 5121, var6[var8], 0);
      }

      this.method1475(true);
   }

   Interface21 method8369(int var1, int var2) {
      return new Class131(this, var1, var2);
   }

   Class124_Sub2(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, boolean var5, int[][] var6) {
      super(var1, '\u8513', var2, var3, var4 * var4 * 6, var5);
      this.anInt8926 = var4;
      this.aClass174_Sub2_1585.method8641(this);
      int var7;
      if(var5) {
         for(var7 = 0; var7 < 6; ++var7) {
            method1483('\u8515' + var7, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), var4, var4, '\u80e1', this.aClass174_Sub2_1585.anInt9644, var6[var7]);
         }
      } else {
         for(var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Di('\u8515' + var7, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), var4, var4, 0, '\u80e1', this.aClass174_Sub2_1585.anInt9644, var6[var7], 0);
         }
      }

      this.method1475(true);
   }
}
