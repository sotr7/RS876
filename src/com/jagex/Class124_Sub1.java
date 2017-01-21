package com.jagex;

import com.jagex.Class124;
import com.jagex.Class142;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class184;
import com.jagex.Interface21;
import com.jagex.Interface23;
import jaggl.OpenGL;

public class Class124_Sub1 extends Class124 {
   int anInt8876;
   int anInt8877;

   Class124_Sub1(Class174_Sub2 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, Class144.aClass144_1689, Class166.aClass166_1884, var5 * var6, false);
      this.anInt8876 = var5;
      this.anInt8877 = var6;
      this.aClass174_Sub2_1585.method8641(this);
      Class184 var7 = this.aClass174_Sub2_1585.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var4 + var6);
         int var9 = Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584);
         OpenGL.glCopyTexImage2D(this.anInt1587, 0, var9, var3, var8, var5, var6, 0);
      }

      this.method1475(true);
   }

   Class124_Sub1(Class174_Sub2 var1, int var2, int var3, int var4, boolean var5, int[] var6, int var7, int var8, boolean var9) {
      super(var1, var2, Class144.aClass144_1680, Class166.aClass166_1884, var3 * var4, var5);
      this.anInt8876 = var3;
      this.anInt8877 = var4;
      if(var9) {
         int[] var10 = new int[var6.length];

         for(int var11 = 0; var11 < var4; ++var11) {
            int var12 = var11 * var3;
            int var13 = (var4 - var11 - 1) * var3;

            for(int var14 = 0; var14 < var3; ++var14) {
               var10[var12++] = var6[var13++];
            }
         }

         var6 = var10;
      }

      this.aClass174_Sub2_1585.method8641(this);
      if(this.anInt1587 != '\u84f5' && var5 && var7 == 0 && var8 == 0) {
         method1483(this.anInt1587, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), this.anInt8876, this.anInt8877, '\u80e1', this.aClass174_Sub2_1585.anInt9644, var6);
         this.method1500(true);
      } else {
         OpenGL.glPixelStorei(3314, var7);
         OpenGL.glTexImage2Di(this.anInt1587, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), this.anInt8876, this.anInt8877, 0, '\u80e1', this.aClass174_Sub2_1585.anInt9644, var6, var8 * 4);
         OpenGL.glPixelStorei(3314, 0);
         this.method1500(false);
      }

      this.method1475(true);
   }

   Class124_Sub1(Class174_Sub2 var1, int var2, Class144 var3, Class166 var4, int var5, int var6, boolean var7, byte[] var8, Class144 var9, boolean var10) {
      super(var1, var2, var3, var4, var5 * var6, var7);
      this.anInt8876 = var5;
      this.anInt8877 = var6;
      if(var10) {
         byte[] var11 = new byte[var8.length];

         for(int var12 = 0; var12 < var6; ++var12) {
            int var13 = var12 * var5;
            int var14 = (var6 - var12 - 1) * var5;

            for(int var15 = 0; var15 < var5; ++var15) {
               var11[var13++] = var8[var14++];
            }
         }

         var8 = var11;
      }

      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glPixelStorei(3317, 1);
      if(var7 && this.anInt1587 != '\u84f5') {
         method1484(var2, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), var5, var6, var9, var8);
         this.method1500(true);
      } else {
         OpenGL.glTexImage2Dub(this.anInt1587, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), this.anInt8876, this.anInt8877, 0, Class174_Sub2.method8662(var9), 5121, var8, 0);
         this.method1500(false);
      }

      OpenGL.glPixelStorei(3317, 4);
      this.method1475(true);
   }

   void method8331(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7) {
      int[] var8 = var6 == null?new int[this.anInt8876 * this.anInt8877]:var6;
      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glGetTexImagei(this.anInt1587, 0, '\u80e1', 5121, var8, 0);

      for(int var9 = 0; var9 < var4; ++var9) {
         System.arraycopy(var8, (var2 + (var4 - 1) - var9) * this.anInt8876, var5, var7 + var9 * var3, var3);
      }

   }

   void method8332(int var1, int var2, int var3, int var4, int var5, int var6) {
      Class184 var7 = this.aClass174_Sub2_1585.method2247((byte)6);
      if(var7 != null) {
         int var8 = var7.method2693() - (var6 + var4);
         this.aClass174_Sub2_1585.method8641(this);
         OpenGL.glCopyTexSubImage2D(this.anInt1587, 0, var1, this.anInt8877 - (var2 + var4), var5, var8, var3, var4);
         OpenGL.glFlush();
      }

   }

   Interface23 method8333(int var1) {
      return new Class142(this, var1);
   }

   Interface21 method8334(int var1) {
      return new Class142(this, var1);
   }

   void method8335(boolean var1, boolean var2) {
      if(this.anInt1587 == 3553) {
         this.aClass174_Sub2_1585.method8641(this);
         OpenGL.glTexParameteri(this.anInt1587, 10242, var1?10497:'\u812f');
         OpenGL.glTexParameteri(this.anInt1587, 10243, var2?10497:'\u812f');
      }

   }

   Class124_Sub1(Class174_Sub2 var1, int var2, Class144 var3, Class166 var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5 * var6, false);
      this.anInt8876 = var5;
      this.anInt8877 = var6;
      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glTexImage2Dub(this.anInt1587, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), var5, var6, 0, Class174_Sub2.method8662(this.aClass144_1588), 5121, (byte[])null, 0);
      this.method1475(true);
   }

   Class124_Sub1(Class174_Sub2 var1, int var2, Class144 var3, Class166 var4, int var5, int var6, boolean var7, float[] var8, Class144 var9) {
      super(var1, var2, var3, var4, var5 * var6, var7);
      this.anInt8876 = var5;
      this.anInt8877 = var6;
      this.aClass174_Sub2_1585.method8641(this);
      if(var7 && this.anInt1587 != '\u84f5') {
         method1485(var2, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), var5, var6, var9, var8);
         this.method1500(true);
      } else {
         OpenGL.glTexImage2Df(this.anInt1587, 0, Class174_Sub2.method8663(this.aClass144_1588, this.aClass166_1584), this.anInt8876, this.anInt8877, 0, Class174_Sub2.method8662(var9), 5126, var8, 0);
         this.method1500(false);
      }

      this.method1475(true);
   }

   void method8336(int var1, int var2, int var3, int var4, byte[] var5, Class144 var6, int var7, int var8, boolean var9) {
      if(var8 == 0) {
         var8 = var3;
      }

      if(var9) {
         int var10 = var6.anInt1679 * -1829390781;
         int var11 = var10 * var3;
         int var12 = var10 * var8;
         byte[] var13 = new byte[var11 * var4];

         for(int var14 = 0; var14 < var4; ++var14) {
            int var15 = var14 * var11;
            int var16 = (var4 - var14 - 1) * var12 + var7;

            for(int var17 = 0; var17 < var11; ++var17) {
               var13[var15++] = var5[var16++];
            }
         }

         var5 = var13;
      }

      this.aClass174_Sub2_1585.method8641(this);
      OpenGL.glPixelStorei(3317, 1);
      if(var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.anInt1587, 0, var1, this.anInt8877 - var2 - var4, var3, var4, Class174_Sub2.method8662(var6), 5121, var5, var7);
      if(var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   void method8337(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7, boolean var8) {
      if(var7 == 0) {
         var7 = var3;
      }

      if(var8) {
         int[] var9 = new int[var3 * var4];

         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var10 * var3;
            int var12 = (var4 - var10 - 1) * var7 + var6;

            for(int var13 = 0; var13 < var3; ++var13) {
               var9[var11++] = var5[var12++];
            }
         }

         var5 = var9;
      }

      this.aClass174_Sub2_1585.method8641(this);
      if(var3 != var7) {
         OpenGL.glPixelStorei(3314, var7);
      }

      OpenGL.glTexSubImage2Di(this.anInt1587, 0, var1, this.anInt8877 - var2 - var4, var3, var4, '\u80e1', this.aClass174_Sub2_1585.anInt9644, var5, var6);
      if(var3 != var7) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }
}
