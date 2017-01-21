package com.jagex;

import com.jagex.Class124;
import com.jagex.Class126;
import com.jagex.Class132;
import com.jagex.Class139;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class126_Sub1 extends Class126 {
   static final char aChar8879 = '\u0000';
   static final char aChar8882 = '\u0001';
   Class132 aClass132_8881;
   Class139 aClass139_8880;
   static float[] aFloatArray8878 = new float[4];

   void method1512() {
      this.aClass139_8880.method1645('\u0001');
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641((Class124)null);
      this.aClass174_Sub2_1598.method8677(0);
   }

   boolean method1505() {
      return true;
   }

   void method1507(boolean var1) {
   }

   void method1506(boolean var1) {
      this.aClass139_8880.method1645('\u0000');
      if(this.aClass132_8881.aBool1624) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(this.aClass132_8881.aClass124_Sub4_1628);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method1508() {
      this.aClass139_8880.method1645('\u0001');
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641((Class124)null);
      this.aClass174_Sub2_1598.method8677(0);
   }

   void method1509(int var1, int var2) {
      float var3 = -5.0E-4F * (float)((var1 & 3) + 1);
      float var4 = 5.0E-4F * (float)((var1 >> 3 & 3) + 1);
      float var5 = (var1 & 64) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var6 = (var1 & 128) != 0;
      this.aClass174_Sub2_1598.method8677(1);
      if(var6) {
         aFloatArray8878[0] = var5;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = 0.0F;
         aFloatArray8878[3] = 0.0F;
      } else {
         aFloatArray8878[0] = 0.0F;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = var5;
         aFloatArray8878[3] = 0.0F;
      }

      OpenGL.glTexGenfv(8192, 9474, aFloatArray8878, 0);
      aFloatArray8878[0] = 0.0F;
      aFloatArray8878[1] = var5;
      aFloatArray8878[2] = 0.0F;
      aFloatArray8878[3] = (float)this.aClass174_Sub2_1598.anInt9473 * var3 % 1.0F;
      OpenGL.glTexGenfv(8193, 9474, aFloatArray8878, 0);
      if(!this.aClass132_8881.aBool1624) {
         int var7 = (int)(var4 * (float)this.aClass174_Sub2_1598.anInt9473 * 16.0F);
         this.aClass174_Sub2_1598.method8641(this.aClass132_8881.aClass124_Sub1Array1629[var7 % 16]);
      } else {
         aFloatArray8878[0] = 0.0F;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = 0.0F;
         aFloatArray8878[3] = (float)this.aClass174_Sub2_1598.anInt9473 * var4 % 1.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray8878, 0);
      }

      this.aClass174_Sub2_1598.method8677(0);
   }

   Class126_Sub1(Class174_Sub2 var1, Class132 var2) {
      super(var1);
      this.aClass132_8881 = var2;
      this.aClass139_8880 = new Class139(var1, 2);
      this.aClass139_8880.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      if(this.aClass132_8881.aBool1624) {
         OpenGL.glTexGeni(8194, 9472, 9217);
         OpenGL.glEnable(3170);
      }

      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8880.method1648();
      this.aClass139_8880.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      if(this.aClass132_8881.aBool1624) {
         OpenGL.glDisable(3170);
      }

      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8880.method1648();
   }

   boolean method1511() {
      return true;
   }

   void method1510(boolean var1) {
      this.aClass139_8880.method1645('\u0000');
      if(this.aClass132_8881.aBool1624) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(this.aClass132_8881.aClass124_Sub4_1628);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method1504(boolean var1) {
   }

   void method1518(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1514() {
      this.aClass139_8880.method1645('\u0001');
      this.aClass174_Sub2_1598.method8677(1);
      this.aClass174_Sub2_1598.method8641((Class124)null);
      this.aClass174_Sub2_1598.method8677(0);
   }

   void method1515(int var1, int var2) {
      float var3 = -5.0E-4F * (float)((var1 & 3) + 1);
      float var4 = 5.0E-4F * (float)((var1 >> 3 & 3) + 1);
      float var5 = (var1 & 64) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var6 = (var1 & 128) != 0;
      this.aClass174_Sub2_1598.method8677(1);
      if(var6) {
         aFloatArray8878[0] = var5;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = 0.0F;
         aFloatArray8878[3] = 0.0F;
      } else {
         aFloatArray8878[0] = 0.0F;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = var5;
         aFloatArray8878[3] = 0.0F;
      }

      OpenGL.glTexGenfv(8192, 9474, aFloatArray8878, 0);
      aFloatArray8878[0] = 0.0F;
      aFloatArray8878[1] = var5;
      aFloatArray8878[2] = 0.0F;
      aFloatArray8878[3] = (float)this.aClass174_Sub2_1598.anInt9473 * var3 % 1.0F;
      OpenGL.glTexGenfv(8193, 9474, aFloatArray8878, 0);
      if(!this.aClass132_8881.aBool1624) {
         int var7 = (int)(var4 * (float)this.aClass174_Sub2_1598.anInt9473 * 16.0F);
         this.aClass174_Sub2_1598.method8641(this.aClass132_8881.aClass124_Sub1Array1629[var7 % 16]);
      } else {
         aFloatArray8878[0] = 0.0F;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = 0.0F;
         aFloatArray8878[3] = (float)this.aClass174_Sub2_1598.anInt9473 * var4 % 1.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray8878, 0);
      }

      this.aClass174_Sub2_1598.method8677(0);
   }

   void method1516(int var1, int var2) {
      float var3 = -5.0E-4F * (float)((var1 & 3) + 1);
      float var4 = 5.0E-4F * (float)((var1 >> 3 & 3) + 1);
      float var5 = (var1 & 64) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var6 = (var1 & 128) != 0;
      this.aClass174_Sub2_1598.method8677(1);
      if(var6) {
         aFloatArray8878[0] = var5;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = 0.0F;
         aFloatArray8878[3] = 0.0F;
      } else {
         aFloatArray8878[0] = 0.0F;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = var5;
         aFloatArray8878[3] = 0.0F;
      }

      OpenGL.glTexGenfv(8192, 9474, aFloatArray8878, 0);
      aFloatArray8878[0] = 0.0F;
      aFloatArray8878[1] = var5;
      aFloatArray8878[2] = 0.0F;
      aFloatArray8878[3] = (float)this.aClass174_Sub2_1598.anInt9473 * var3 % 1.0F;
      OpenGL.glTexGenfv(8193, 9474, aFloatArray8878, 0);
      if(!this.aClass132_8881.aBool1624) {
         int var7 = (int)(var4 * (float)this.aClass174_Sub2_1598.anInt9473 * 16.0F);
         this.aClass174_Sub2_1598.method8641(this.aClass132_8881.aClass124_Sub1Array1629[var7 % 16]);
      } else {
         aFloatArray8878[0] = 0.0F;
         aFloatArray8878[1] = 0.0F;
         aFloatArray8878[2] = 0.0F;
         aFloatArray8878[3] = (float)this.aClass174_Sub2_1598.anInt9473 * var4 % 1.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray8878, 0);
      }

      this.aClass174_Sub2_1598.method8677(0);
   }

   void method1517(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1520(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1519(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method1513(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }
}
