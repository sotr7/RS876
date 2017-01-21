package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub2;
import com.jagex.Class126;
import com.jagex.Class139;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class446;
import jaggl.OpenGL;

public class Class126_Sub7 extends Class126 {
   static final int anInt8972 = 128;
   static final int anInt8973 = 128;
   static final int anInt8974 = 24;
   static final float aFloat8976 = 26.0F;
   static final float aFloat8977 = -12.0F;
   static final float aFloat8978 = 0.0F;
   static final char aChar8979 = '\u0000';
   static final char aChar8980 = '\u0001';
   boolean aBool8982;
   static final int anInt8983 = 5;
   boolean aBool8975 = false;
   Class124_Sub2[] aClass124_Sub2Array8984;
   Class139 aClass139_8981;

   void method1504(boolean var1) {
      this.aClass174_Sub2_1598.method8685(8448, 7681);
   }

   boolean method1505() {
      return true;
   }

   Class126_Sub7(Class174_Sub2 var1) {
      super(var1);
      if(var1.aBool9633) {
         byte[][] var2 = new byte[6][16384];
         byte[][] var3 = new byte[6][16384];
         byte[][] var4 = new byte[6][16384];
         int var5 = 0;
         Class446 var6 = new Class446(0.0F, -1.0F, 0.0F);

         for(int var7 = 0; var7 < 128; ++var7) {
            for(int var8 = 0; var8 < 128; ++var8) {
               float var9 = 2.0F * (float)var8 / 128.0F - 1.0F;
               float var10 = 2.0F * (float)var7 / 128.0F - 1.0F;
               float var11 = (float)(1.0D / Math.sqrt((double)(var9 * var9 + 1.0F + var10 * var10)));
               var9 *= var11;
               var10 *= var11;

               for(int var12 = 0; var12 < 6; ++var12) {
                  Class446 var13;
                  if(var12 == 0) {
                     var13 = new Class446(-var11, -var9, var10);
                  } else if(var12 == 1) {
                     var13 = new Class446(var11, var9, var10);
                  } else if(var12 == 2) {
                     var13 = new Class446(-var9, var10, -var11);
                  } else if(var12 == 3) {
                     var13 = new Class446(-var9, -var10, var11);
                  } else if(var12 == 4) {
                     var13 = new Class446(var9, var11, -var10);
                  } else {
                     var13 = new Class446(var9, -var11, var10);
                  }

                  float var14 = var13.method5265(var6);
                  var14 = Math.max(0.0F, Math.min(1.0F, var14));
                  int var15;
                  int var16;
                  int var17;
                  if(var14 > 0.0F) {
                     var15 = Math.min(255, (int)(Math.pow((double)var14, 128.0D) * 400.0D));
                     var16 = Math.min(255, (int)(Math.pow((double)var14, 24.0D) * 400.0D));
                     var17 = Math.min(255, (int)(Math.pow((double)var14, 5.0D) * 400.0D));
                  } else {
                     var17 = 0;
                     var16 = 0;
                     var15 = 0;
                  }

                  var3[var12][var5] = (byte)var15;
                  var4[var12][var5] = (byte)var16;
                  var2[var12][var5] = (byte)var17;
               }

               ++var5;
            }
         }

         this.aClass124_Sub2Array8984 = new Class124_Sub2[3];
         this.aClass124_Sub2Array8984[0] = new Class124_Sub2(this.aClass174_Sub2_1598, Class144.aClass144_1681, Class166.aClass166_1884, 128, false, var3, Class144.aClass144_1681);
         this.aClass124_Sub2Array8984[1] = new Class124_Sub2(this.aClass174_Sub2_1598, Class144.aClass144_1681, Class166.aClass166_1884, 128, false, var4, Class144.aClass144_1681);
         this.aClass124_Sub2Array8984[2] = new Class124_Sub2(this.aClass174_Sub2_1598, Class144.aClass144_1681, Class166.aClass166_1884, 128, false, var2, Class144.aClass144_1681);
         this.method8389();
      }

   }

   void method1517(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   void method8388() {
      this.aClass139_8981 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8981.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glTexGeni(8192, 9472, '\u8511');
      OpenGL.glTexGeni(8193, 9472, '\u8511');
      OpenGL.glTexGeni(8194, 9472, '\u8511');
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glEnable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
      OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
      OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(7681, 8448);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      } else {
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, 5890, 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
      this.aClass139_8981.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      OpenGL.glDisable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      } else {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
   }

   void method1508() {
      if(this.aBool8975) {
         if(!this.aBool8982) {
            this.aClass174_Sub2_1598.method8677(2);
            this.aClass174_Sub2_1598.method8641((Class124)null);
         }

         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass139_8981.method1645('\u0001');
         this.aBool8975 = false;
      } else {
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
   }

   void method1509(int var1, int var2) {
      if(this.aBool8975) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(this.aClass124_Sub2Array8984[var1 - 1]);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method1518(Class124 var1, int var2) {
      this.aClass174_Sub2_1598.method8641(var1);
      this.aClass174_Sub2_1598.method8672(var2);
   }

   boolean method1511() {
      return true;
   }

   void method1510(boolean var1) {
      if(this.aClass139_8981 != null && var1) {
         if(!this.aBool8982) {
            this.aClass174_Sub2_1598.method8677(2);
            this.aClass174_Sub2_1598.method8641(this.aClass174_Sub2_1598.aClass124_Sub1_9613);
            this.aClass174_Sub2_1598.method8677(0);
         }

         this.aClass139_8981.method1645('\u0000');
         this.aBool8975 = true;
      } else {
         this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
      }

   }

   void method8389() {
      this.aClass139_8981 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8981.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glTexGeni(8192, 9472, '\u8511');
      OpenGL.glTexGeni(8193, 9472, '\u8511');
      OpenGL.glTexGeni(8194, 9472, '\u8511');
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glEnable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
      OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
      OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(7681, 8448);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      } else {
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, 5890, 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
      this.aClass139_8981.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      OpenGL.glDisable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      } else {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
   }

   void method1512() {
      if(this.aBool8975) {
         if(!this.aBool8982) {
            this.aClass174_Sub2_1598.method8677(2);
            this.aClass174_Sub2_1598.method8641((Class124)null);
         }

         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass139_8981.method1645('\u0001');
         this.aBool8975 = false;
      } else {
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
   }

   void method1514() {
      if(this.aBool8975) {
         if(!this.aBool8982) {
            this.aClass174_Sub2_1598.method8677(2);
            this.aClass174_Sub2_1598.method8641((Class124)null);
         }

         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641((Class124)null);
         this.aClass174_Sub2_1598.method8677(0);
         this.aClass139_8981.method1645('\u0001');
         this.aBool8975 = false;
      } else {
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8685(8448, 8448);
   }

   void method1515(int var1, int var2) {
      if(this.aBool8975) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(this.aClass124_Sub2Array8984[var1 - 1]);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method1516(int var1, int var2) {
      if(this.aBool8975) {
         this.aClass174_Sub2_1598.method8677(1);
         this.aClass174_Sub2_1598.method8641(this.aClass124_Sub2Array8984[var1 - 1]);
         this.aClass174_Sub2_1598.method8677(0);
      }

   }

   void method1506(boolean var1) {
      if(this.aClass139_8981 != null && var1) {
         if(!this.aBool8982) {
            this.aClass174_Sub2_1598.method8677(2);
            this.aClass174_Sub2_1598.method8641(this.aClass174_Sub2_1598.aClass124_Sub1_9613);
            this.aClass174_Sub2_1598.method8677(0);
         }

         this.aClass139_8981.method1645('\u0000');
         this.aBool8975 = true;
      } else {
         this.aClass174_Sub2_1598.method8674(0, '\u8578', 770);
      }

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

   void method8390() {
      this.aClass139_8981 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8981.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glTexGeni(8192, 9472, '\u8511');
      OpenGL.glTexGeni(8193, 9472, '\u8511');
      OpenGL.glTexGeni(8194, 9472, '\u8511');
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glEnable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
      OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
      OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(7681, 8448);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      } else {
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, 5890, 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
      this.aClass139_8981.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      OpenGL.glDisable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      } else {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
   }

   void method1507(boolean var1) {
      this.aClass174_Sub2_1598.method8685(8448, 7681);
   }

   void method8391() {
      this.aClass139_8981 = new Class139(this.aClass174_Sub2_1598, 2);
      this.aClass139_8981.method1643(0);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glTexGeni(8192, 9472, '\u8511');
      OpenGL.glTexGeni(8193, 9472, '\u8511');
      OpenGL.glTexGeni(8194, 9472, '\u8511');
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glEnable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
      OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
      OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(7681, 8448);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, '\u8578', 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      } else {
         this.aClass174_Sub2_1598.method8685(260, 7681);
         this.aClass174_Sub2_1598.method8665(0, 5890, 770);
         this.aClass174_Sub2_1598.method8674(0, '\u8577', 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
      this.aClass139_8981.method1643(1);
      this.aClass174_Sub2_1598.method8677(1);
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      OpenGL.glDisable(3170);
      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
      if(!this.aBool8982) {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8677(2);
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8665(1, '\u8578', 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      } else {
         this.aClass174_Sub2_1598.method8685(8448, 8448);
         this.aClass174_Sub2_1598.method8665(0, 5890, 768);
         this.aClass174_Sub2_1598.method8674(0, 5890, 770);
      }

      this.aClass174_Sub2_1598.method8677(0);
      this.aClass139_8981.method1648();
   }
}
