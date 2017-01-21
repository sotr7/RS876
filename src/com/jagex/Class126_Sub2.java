package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub3;
import com.jagex.Class126;
import com.jagex.Class132;
import com.jagex.Class139;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class126_Sub2 extends Class126 {
   static final char aChar8884 = '\u0001';
   static final char aChar8886 = '\u0000';
   Class139 aClass139_8888;
   static float[] aFloatArray8887 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   Class132 aClass132_8885;
   Class124_Sub3 aClass124_Sub3_8883;

   void method1518(Class124 var1, int var2) {
   }

   boolean method1505() {
      return true;
   }

   void method1506(boolean var1) {
      if(this.aClass174_Sub2_1598.anInt9595 > 0) {
         float var2 = -0.5F / (float)this.aClass174_Sub2_1598.anInt9595;
         this.aClass174_Sub2_1598.method8677(1);
         aFloatArray8887[0] = 0.0F;
         aFloatArray8887[1] = 0.0F;
         aFloatArray8887[2] = var2;
         aFloatArray8887[3] = this.aClass174_Sub2_1598.aFloat9597 * var2 + 0.25F;
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glTexGenfv(8192, 9474, aFloatArray8887, 0);
         OpenGL.glPopMatrix();
         this.aClass174_Sub2_1598.method8620(0.5F, (float)this.aClass174_Sub2_1598.anInt9595);
         this.aClass174_Sub2_1598.method8641(this.aClass124_Sub3_8883);
         this.aClass174_Sub2_1598.method8677(0);
      }

      this.aClass139_8888.method1645('\u0000');
      OpenGL.glMatrixMode(5890);
      OpenGL.glPushMatrix();
      OpenGL.glScalef(0.25F, 0.25F, 1.0F);
      OpenGL.glMatrixMode(5888);
   }

   boolean method1511() {
      return true;
   }

   void method1519(Class124 var1, int var2) {
   }

   void method1509(int var1, int var2) {
      if((var1 & 1) == 1) {
         if(this.aClass132_8885.aBool1624) {
            this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub4_1634);
            aFloatArray8887[0] = 0.0F;
            aFloatArray8887[1] = 0.0F;
            aFloatArray8887[2] = 0.0F;
            aFloatArray8887[3] = (float)(this.aClass174_Sub2_1598.anInt9473 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray8887, 0);
         } else {
            int var3 = this.aClass174_Sub2_1598.anInt9473 % 4000 * 16 / 4000;
            this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub1Array1627[var3]);
         }
      } else if(this.aClass132_8885.aBool1624) {
         this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub4_1634);
         aFloatArray8887[0] = 0.0F;
         aFloatArray8887[1] = 0.0F;
         aFloatArray8887[2] = 0.0F;
         aFloatArray8887[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray8887, 0);
      } else {
         this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub1Array1627[0]);
      }

   }

   void method1504(boolean var1) {
      this.aClass174_Sub2_1598.method8685(260, 8448);
   }

   void method8338() {
      this.aClass139_8888 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8888.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8685(7681, 260);
      this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glEnable(3168);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glTexEnvf(8960, '\u8573', 2.0F);
      if(this.aClass132_8885.aBool1624) {
         OpenGL.glTexGeni(8194, 9472, 9217);
         OpenGL.glTexGeni(8195, 9472, 9217);
         OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
         OpenGL.glEnable(3170);
         OpenGL.glEnable(3171);
      }

      this.aClass139_8888.method1648();
      this.aClass139_8888.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8685(8448, 8448);
      this.aClass174_Sub2_1598.method8665(0, 5890, 768);
      OpenGL.glDisable(3168);
      this.aClass174_Sub2_1598.method8677(0);
      OpenGL.glTexEnvf(8960, '\u8573', 1.0F);
      if(this.aClass132_8885.aBool1624) {
         OpenGL.glDisable(3170);
         OpenGL.glDisable(3171);
      }

      this.aClass139_8888.method1648();
   }

   void method1513(Class124 var1, int var2) {
   }

   void method1510(boolean var1) {
      if(this.aClass174_Sub2_1598.anInt9595 > 0) {
         float var2 = -0.5F / (float)this.aClass174_Sub2_1598.anInt9595;
         this.aClass174_Sub2_1598.method8677(1);
         aFloatArray8887[0] = 0.0F;
         aFloatArray8887[1] = 0.0F;
         aFloatArray8887[2] = var2;
         aFloatArray8887[3] = this.aClass174_Sub2_1598.aFloat9597 * var2 + 0.25F;
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glTexGenfv(8192, 9474, aFloatArray8887, 0);
         OpenGL.glPopMatrix();
         this.aClass174_Sub2_1598.method8620(0.5F, (float)this.aClass174_Sub2_1598.anInt9595);
         this.aClass174_Sub2_1598.method8641(this.aClass124_Sub3_8883);
         this.aClass174_Sub2_1598.method8677(0);
      }

      this.aClass139_8888.method1645('\u0000');
      OpenGL.glMatrixMode(5890);
      OpenGL.glPushMatrix();
      OpenGL.glScalef(0.25F, 0.25F, 1.0F);
      OpenGL.glMatrixMode(5888);
   }

   void method1508() {
      this.aClass139_8888.method1645('\u0001');
      if(this.aClass174_Sub2_1598.anInt9595 > 0) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8620(1.0F, 0.0F);
         this.aClass174_Sub2_1598.method8677(0);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }

   void method1512() {
      this.aClass139_8888.method1645('\u0001');
      if(this.aClass174_Sub2_1598.anInt9595 > 0) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8620(1.0F, 0.0F);
         this.aClass174_Sub2_1598.method8677(0);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }

   void method1507(boolean var1) {
      this.aClass174_Sub2_1598.method8685(260, 8448);
   }

   void method1515(int var1, int var2) {
      if((var1 & 1) == 1) {
         if(this.aClass132_8885.aBool1624) {
            this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub4_1634);
            aFloatArray8887[0] = 0.0F;
            aFloatArray8887[1] = 0.0F;
            aFloatArray8887[2] = 0.0F;
            aFloatArray8887[3] = (float)(this.aClass174_Sub2_1598.anInt9473 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray8887, 0);
         } else {
            int var3 = this.aClass174_Sub2_1598.anInt9473 % 4000 * 16 / 4000;
            this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub1Array1627[var3]);
         }
      } else if(this.aClass132_8885.aBool1624) {
         this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub4_1634);
         aFloatArray8887[0] = 0.0F;
         aFloatArray8887[1] = 0.0F;
         aFloatArray8887[2] = 0.0F;
         aFloatArray8887[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray8887, 0);
      } else {
         this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub1Array1627[0]);
      }

   }

   void method1516(int var1, int var2) {
      if((var1 & 1) == 1) {
         if(this.aClass132_8885.aBool1624) {
            this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub4_1634);
            aFloatArray8887[0] = 0.0F;
            aFloatArray8887[1] = 0.0F;
            aFloatArray8887[2] = 0.0F;
            aFloatArray8887[3] = (float)(this.aClass174_Sub2_1598.anInt9473 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray8887, 0);
         } else {
            int var3 = this.aClass174_Sub2_1598.anInt9473 % 4000 * 16 / 4000;
            this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub1Array1627[var3]);
         }
      } else if(this.aClass132_8885.aBool1624) {
         this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub4_1634);
         aFloatArray8887[0] = 0.0F;
         aFloatArray8887[1] = 0.0F;
         aFloatArray8887[2] = 0.0F;
         aFloatArray8887[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray8887, 0);
      } else {
         this.aClass174_Sub2_1598.method8641(this.aClass132_8885.aClass124_Sub1Array1627[0]);
      }

   }

   void method1517(Class124 var1, int var2) {
   }

   void method1520(Class124 var1, int var2) {
   }

   Class126_Sub2(Class174_Sub2 var1, Class132 var2) {
      super(var1);
      this.aClass132_8885 = var2;
      this.method8338();
      this.aClass124_Sub3_8883 = new Class124_Sub3(this.aClass174_Sub2_1598, Class144.aClass144_1681, Class166.aClass166_1884, 2, new byte[]{(byte)0, (byte)-1}, Class144.aClass144_1681);
      this.aClass124_Sub3_8883.method8392(false);
   }

   void method1514() {
      this.aClass139_8888.method1645('\u0001');
      if(this.aClass174_Sub2_1598.anInt9595 > 0) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8620(1.0F, 0.0F);
         this.aClass174_Sub2_1598.method8677(0);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }
}
