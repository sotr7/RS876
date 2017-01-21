package com.jagex;

import com.jagex.Class1;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public abstract class Class124 {
   static final int anInt1579 = 5121;
   static final int anInt1580 = 3552;
   static final int anInt1581 = 34037;
   static final int anInt1582 = 34067;
   static final int anInt1583 = 3553;
   static final int anInt1589 = 32879;
   boolean aBool1590;
   boolean aBool1591 = false;
   int anInt1586;
   Class174_Sub2 aClass174_Sub2_1585;
   int anInt1587;
   Class144 aClass144_1588;
   Class166 aClass166_1584;
   int anInt1592;
   static int[] anIntArray1593 = new int[1];

   boolean method1474() {
      if(this.aClass174_Sub2_1585.aBool9638) {
         int var1 = this.method1482();
         this.aClass174_Sub2_1585.method8641(this);
         OpenGL.glGenerateMipmapEXT(this.anInt1587);
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var1);
         return true;
      } else {
         return false;
      }
   }

   void method1475(boolean var1) {
      if(this.aBool1591 != var1) {
         this.aBool1591 = var1;
         this.method1476();
      }

   }

   void method1476() {
      this.aClass174_Sub2_1585.method8641(this);
      if(this.aBool1591) {
         OpenGL.glTexParameteri(this.anInt1587, 10241, this.aBool1590?9987:9729);
         OpenGL.glTexParameteri(this.anInt1587, 10240, 9729);
      } else {
         OpenGL.glTexParameteri(this.anInt1587, 10241, this.aBool1590?9984:9728);
         OpenGL.glTexParameteri(this.anInt1587, 10240, 9728);
      }

   }

   void method1477(int var1) {
      this.aClass174_Sub2_1585.anInt9518 -= var1;
      this.aClass174_Sub2_1585.anInt9518 += this.method1482();
   }

   boolean method1478() {
      if(this.aClass174_Sub2_1585.aBool9638) {
         int var1 = this.method1482();
         this.aClass174_Sub2_1585.method8641(this);
         OpenGL.glGenerateMipmapEXT(this.anInt1587);
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var1);
         return true;
      } else {
         return false;
      }
   }

   boolean method1479() {
      if(this.aClass174_Sub2_1585.aBool9638) {
         int var1 = this.method1482();
         this.aClass174_Sub2_1585.method8641(this);
         OpenGL.glGenerateMipmapEXT(this.anInt1587);
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var1);
         return true;
      } else {
         return false;
      }
   }

   void method1480() {
      this.aClass174_Sub2_1585.method8641(this);
      if(this.aBool1591) {
         OpenGL.glTexParameteri(this.anInt1587, 10241, this.aBool1590?9987:9729);
         OpenGL.glTexParameteri(this.anInt1587, 10240, 9729);
      } else {
         OpenGL.glTexParameteri(this.anInt1587, 10241, this.aBool1590?9984:9728);
         OpenGL.glTexParameteri(this.anInt1587, 10240, 9728);
      }

   }

   public void finalize() throws Throwable {
      this.method1490();
      super.finalize();
   }

   void method1481(int var1) {
      this.aClass174_Sub2_1585.anInt9518 -= var1;
      this.aClass174_Sub2_1585.anInt9518 += this.method1482();
   }

   int method1482() {
      int var1 = this.aClass144_1588.anInt1679 * -1829390781 * this.aClass166_1584.anInt1891 * 1990758583 * this.anInt1592;
      return this.aBool1590?var1 * 4 / 3:var1;
   }

   static void method1483(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6) {
      if(var2 > 0 && !Class1.method517(var2, 1287733952)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Class1.method517(var3, -956373354)) {
         throw new IllegalArgumentException("");
      } else if(var4 != '\u80e1') {
         throw new IllegalArgumentException("");
      } else {
         int var7 = 0;
         int var8 = var2 < var3?var2:var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         int[] var11 = var6;
         int[] var12 = new int[var9 * var10];

         while(true) {
            OpenGL.glTexImage2Di(var0, var7, var1, var2, var3, 0, var4, var5, var11, 0);
            if(var8 <= 1) {
               return;
            }

            int var13 = 0;
            int var14 = 0;
            int var15 = var14 + var2;

            for(int var16 = 0; var16 < var10; ++var16) {
               for(int var17 = 0; var17 < var9; ++var17) {
                  int var18 = var11[var14++];
                  int var19 = var11[var14++];
                  int var20 = var11[var15++];
                  int var21 = var11[var15++];
                  int var22 = var18 >> 24 & 255;
                  int var23 = var18 >> 16 & 255;
                  int var24 = var18 >> 8 & 255;
                  int var25 = var18 & 255;
                  var22 += var19 >> 24 & 255;
                  var23 += var19 >> 16 & 255;
                  var24 += var19 >> 8 & 255;
                  var25 += var19 & 255;
                  var22 += var20 >> 24 & 255;
                  var23 += var20 >> 16 & 255;
                  var24 += var20 >> 8 & 255;
                  var25 += var20 & 255;
                  var22 += var21 >> 24 & 255;
                  var23 += var21 >> 16 & 255;
                  var24 += var21 >> 8 & 255;
                  var25 += var21 & 255;
                  var12[var13++] = (var22 & 1020) << 22 | (var23 & 1020) << 14 | (var24 & 1020) << 6 | (var25 & 1020) >> 2;
               }

               var14 += var2;
               var15 += var2;
            }

            int[] var26 = var12;
            var12 = var11;
            var11 = var26;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   static void method1484(int var0, int var1, int var2, int var3, Class144 var4, byte[] var5) {
      if(var2 > 0 && !Class1.method517(var2, 1361034586)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Class1.method517(var3, -1264542847)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = var4.anInt1679 * -1829390781;
         int var7 = 0;
         int var8 = var2 < var3?var2:var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         byte[] var11 = var5;
         byte[] var12 = new byte[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Dub(var0, var7, var1, var2, var3, 0, Class174_Sub2.method8662(var4), 5121, var11, 0);
            if(var8 <= 1) {
               return;
            }

            int var13 = var2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var14 + var13;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     byte var20 = var11[var16];
                     var16 += var6;
                     int var22 = var20 + var11[var16];
                     var16 += var6;
                     var22 += var11[var17];
                     var17 += var6;
                     var22 += var11[var17];
                     var17 += var6;
                     var12[var15] = (byte)(var22 >> 2);
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            byte[] var21 = var12;
            var12 = var11;
            var11 = var21;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   static void method1485(int var0, int var1, int var2, int var3, Class144 var4, float[] var5) {
      if(var2 > 0 && !Class1.method517(var2, 253292113)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Class1.method517(var3, 640099612)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = var4.anInt1679 * -1829390781;
         int var7 = 0;
         int var8 = var2 < var3?var2:var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         float[] var11 = var5;
         float[] var12 = new float[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Df(var0, var7, var1, var2, var3, 0, Class174_Sub2.method8662(var4), 5126, var11, 0);
            if(var8 <= 1) {
               return;
            }

            int var13 = var2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var14 + var13;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     float var20 = var11[var16];
                     var16 += var6;
                     var20 += var11[var16];
                     var16 += var6;
                     var20 += var11[var17];
                     var17 += var6;
                     var20 += var11[var17];
                     var17 += var6;
                     var12[var15] = var20 * 0.25F;
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            float[] var21 = var12;
            var12 = var11;
            var11 = var21;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   void method1486(boolean var1) {
      if(this.aBool1591 != var1) {
         this.aBool1591 = var1;
         this.method1476();
      }

   }

   void method1487() throws Throwable {
      this.method1490();
      super.finalize();
   }

   void method1488() throws Throwable {
      this.method1490();
      super.finalize();
   }

   void method1489(boolean var1) {
      if(this.aBool1591 != var1) {
         this.aBool1591 = var1;
         this.method1476();
      }

   }

   void method1490() {
      if(this.anInt1586 != 0) {
         this.aClass174_Sub2_1585.method8657(this.anInt1586, this.method1482());
         this.anInt1586 = 0;
      }

   }

   Class124(Class174_Sub2 var1, int var2, Class144 var3, Class166 var4, int var5, boolean var6) {
      this.aClass174_Sub2_1585 = var1;
      this.anInt1587 = var2;
      this.aClass144_1588 = var3;
      this.aClass166_1584 = var4;
      this.aBool1590 = var6;
      this.anInt1592 = var5;
      OpenGL.glGenTextures(1, anIntArray1593, 0);
      this.anInt1586 = anIntArray1593[0];
      this.method1481(0);
   }

   boolean method1491() {
      if(this.aClass174_Sub2_1585.aBool9638) {
         int var1 = this.method1482();
         this.aClass174_Sub2_1585.method8641(this);
         OpenGL.glGenerateMipmapEXT(this.anInt1587);
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var1);
         return true;
      } else {
         return false;
      }
   }

   boolean method1492() {
      if(this.aClass174_Sub2_1585.aBool9638) {
         int var1 = this.method1482();
         this.aClass174_Sub2_1585.method8641(this);
         OpenGL.glGenerateMipmapEXT(this.anInt1587);
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var1);
         return true;
      } else {
         return false;
      }
   }

   void method1493() {
      if(this.anInt1586 != 0) {
         this.aClass174_Sub2_1585.anInt9518 -= this.method1482();
         int[] var1 = new int[]{this.anInt1586};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.anInt1586 = 0;
      }

   }

   void method1494(boolean var1) {
      if(this.aBool1590 != var1) {
         int var2 = this.method1482();
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var2);
      }

   }

   void method1495(boolean var1) {
      if(this.aBool1590 != var1) {
         int var2 = this.method1482();
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var2);
      }

   }

   void method1496() {
      if(this.anInt1586 != 0) {
         this.aClass174_Sub2_1585.method8657(this.anInt1586, this.method1482());
         this.anInt1586 = 0;
      }

   }

   void method1497(int var1) {
      this.aClass174_Sub2_1585.anInt9518 -= var1;
      this.aClass174_Sub2_1585.anInt9518 += this.method1482();
   }

   void method1498() {
      if(this.anInt1586 != 0) {
         this.aClass174_Sub2_1585.anInt9518 -= this.method1482();
         int[] var1 = new int[]{this.anInt1586};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.anInt1586 = 0;
      }

   }

   void method1499() {
      if(this.anInt1586 != 0) {
         this.aClass174_Sub2_1585.anInt9518 -= this.method1482();
         int[] var1 = new int[]{this.anInt1586};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.anInt1586 = 0;
      }

   }

   void method1500(boolean var1) {
      if(this.aBool1590 != var1) {
         int var2 = this.method1482();
         this.aBool1590 = true;
         this.method1476();
         this.method1481(var2);
      }

   }

   void method1501(int var1) {
      this.aClass174_Sub2_1585.anInt9518 -= var1;
      this.aClass174_Sub2_1585.anInt9518 += this.method1482();
   }

   int method1502() {
      int var1 = this.aClass144_1588.anInt1679 * -1829390781 * this.aClass166_1584.anInt1891 * 1990758583 * this.anInt1592;
      return this.aBool1590?var1 * 4 / 3:var1;
   }

   int method1503() {
      int var1 = this.aClass144_1588.anInt1679 * -1829390781 * this.aClass166_1584.anInt1891 * 1990758583 * this.anInt1592;
      return this.aBool1590?var1 * 4 / 3:var1;
   }
}
