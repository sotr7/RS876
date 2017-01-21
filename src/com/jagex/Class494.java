package com.jagex;

import com.jagex.Class1;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class341;
import com.jagex.Interface41;
import jaggl.OpenGL;

public abstract class Class494 implements Interface41 {
   static final int anInt5528 = 3553;
   static final int anInt5530 = 32879;
   static final int anInt5535 = 34067;
   static final int anInt5538 = 0;
   Class341 aClass341_5529;
   boolean aBool5536;
   int anInt5532;
   static int[] anIntArray5539 = new int[1];
   Class174_Sub3_Sub2 aClass174_Sub3_Sub2_5531;
   int anInt5533;
   Class144 aClass144_5534;
   Class166 aClass166_5537;
   int anInt5527;

   void method5896() throws Throwable {
      this.method5906();
      super.finalize();
   }

   public void method334(Class341 var1) {
      if(this.aClass341_5529 != var1) {
         this.aClass341_5529 = var1;
         this.method5897();
      }

   }

   void method5897() {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else {
         this.aClass174_Sub3_Sub2_5531.method8841(this);
         if(this.aClass341_5529 == Class341.aClass341_3541) {
            OpenGL.glTexParameteri(this.anInt5533, 10241, this.aBool5536?9987:9729);
            OpenGL.glTexParameteri(this.anInt5533, 10240, 9729);
         } else {
            OpenGL.glTexParameteri(this.anInt5533, 10241, this.aBool5536?9984:9728);
            OpenGL.glTexParameteri(this.anInt5533, 10240, 9728);
         }

      }
   }

   boolean method265() {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else {
         int var1 = this.method5901();
         this.aClass174_Sub3_Sub2_5531.method8841(this);
         if(this.aClass174_Sub3_Sub2_5531.aBool11486) {
            OpenGL.glEnable(this.anInt5533);
         }

         OpenGL.glGenerateMipmapEXT(this.anInt5533);
         if(this.aClass174_Sub3_Sub2_5531.aBool11486) {
            OpenGL.glDisable(this.anInt5533);
         }

         this.aBool5536 = true;
         this.method5897();
         this.method5903(var1);
         return true;
      }
   }

   void method5898(int var1, int var2, int var3, int[] var4) {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else if(var2 > 0 && !Class1.method517(var2, -1153157498)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Class1.method517(var3, -1421327272)) {
         throw new IllegalArgumentException("");
      } else if(this.aClass144_5534 != Class144.aClass144_1680) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = 0;
         int var6 = var2 < var3?var2:var3;
         int var7 = var2 >> 1;
         int var8 = var3 >> 1;
         int[] var9 = var4;
         int[] var10 = new int[var7 * var8];

         while(true) {
            OpenGL.glTexImage2Di(var1, var5, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), var2, var3, 0, '\u80e1', this.aClass174_Sub3_Sub2_5531.anInt11489, var9, 0);
            if(var6 <= 1) {
               return;
            }

            int var11 = 0;
            int var12 = 0;
            int var13 = var12 + var2;

            for(int var14 = 0; var14 < var8; ++var14) {
               for(int var15 = 0; var15 < var7; ++var15) {
                  int var16 = var9[var12++];
                  int var17 = var9[var12++];
                  int var18 = var9[var13++];
                  int var19 = var9[var13++];
                  int var20 = var16 >> 24 & 255;
                  int var21 = var16 >> 16 & 255;
                  int var22 = var16 >> 8 & 255;
                  int var23 = var16 & 255;
                  var20 += var17 >> 24 & 255;
                  var21 += var17 >> 16 & 255;
                  var22 += var17 >> 8 & 255;
                  var23 += var17 & 255;
                  var20 += var18 >> 24 & 255;
                  var21 += var18 >> 16 & 255;
                  var22 += var18 >> 8 & 255;
                  var23 += var18 & 255;
                  var20 += var19 >> 24 & 255;
                  var21 += var19 >> 16 & 255;
                  var22 += var19 >> 8 & 255;
                  var23 += var19 & 255;
                  var10[var11++] = (var20 & 1020) << 22 | (var21 & 1020) << 14 | (var22 & 1020) << 6 | (var23 & 1020) >> 2;
               }

               var12 += var2;
               var13 += var2;
            }

            int[] var24 = var10;
            var10 = var9;
            var9 = var24;
            var2 = var7;
            var3 = var8;
            var7 >>= 1;
            var8 >>= 1;
            var6 >>= 1;
            ++var5;
         }
      }
   }

   void method5899(int var1, int var2, int var3, byte[] var4) {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else if(var2 > 0 && !Class1.method517(var2, 1243576849)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Class1.method517(var3, -1058903261)) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = this.aClass144_5534.anInt1679 * -1829390781;
         int var6 = 0;
         int var7 = var2 < var3?var2:var3;
         int var8 = var2 >> 1;
         int var9 = var3 >> 1;
         byte[] var10 = var4;
         byte[] var11 = new byte[var8 * var9 * var5];

         while(true) {
            OpenGL.glTexImage2Dub(var1, var6, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), var2, var3, 0, Class174_Sub3_Sub2.method10533(this.aClass144_5534), 5121, var10, 0);
            if(var7 <= 1) {
               return;
            }

            int var12 = var2 * var5;

            for(int var13 = 0; var13 < var5; ++var13) {
               int var14 = var13;
               int var15 = var13;
               int var16 = var13 + var12;

               for(int var17 = 0; var17 < var9; ++var17) {
                  for(int var18 = 0; var18 < var8; ++var18) {
                     byte var19 = var10[var15];
                     var15 += var5;
                     int var21 = var19 + var10[var15];
                     var15 += var5;
                     var21 += var10[var16];
                     var16 += var5;
                     var21 += var10[var16];
                     var16 += var5;
                     var11[var14] = (byte)(var21 >> 2);
                     var14 += var5;
                  }

                  var15 += var12;
                  var16 += var12;
               }
            }

            byte[] var20 = var11;
            var11 = var10;
            var10 = var20;
            var2 = var8;
            var3 = var9;
            var8 >>= 1;
            var9 >>= 1;
            var7 >>= 1;
            ++var6;
         }
      }
   }

   void method5900(int var1, int var2, int var3, float[] var4) {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else if(var2 > 0 && !Class1.method517(var2, -194786578)) {
         throw new IllegalArgumentException("");
      } else if(var3 > 0 && !Class1.method517(var3, 30580033)) {
         throw new IllegalArgumentException("");
      } else {
         int var5 = this.aClass144_5534.anInt1679 * -1829390781;
         int var6 = 0;
         int var7 = var2 < var3?var2:var3;
         int var8 = var2 >> 1;
         int var9 = var3 >> 1;
         float[] var10 = var4;
         float[] var11 = new float[var8 * var9 * var5];

         while(true) {
            OpenGL.glTexImage2Df(var1, var6, Class174_Sub3_Sub2.method10534(this.aClass144_5534, this.aClass166_5537), var2, var3, 0, Class174_Sub3_Sub2.method10533(this.aClass144_5534), 5126, var10, 0);
            if(var7 <= 1) {
               return;
            }

            int var12 = var2 * var5;

            for(int var13 = 0; var13 < var5; ++var13) {
               int var14 = var13;
               int var15 = var13;
               int var16 = var13 + var12;

               for(int var17 = 0; var17 < var9; ++var17) {
                  for(int var18 = 0; var18 < var8; ++var18) {
                     float var19 = var10[var15];
                     var15 += var5;
                     var19 += var10[var15];
                     var15 += var5;
                     var19 += var10[var16];
                     var16 += var5;
                     var19 += var10[var16];
                     var16 += var5;
                     var11[var14] = var19 * 0.25F;
                     var14 += var5;
                  }

                  var15 += var12;
                  var16 += var12;
               }
            }

            float[] var20 = var11;
            var11 = var10;
            var10 = var20;
            var2 = var8;
            var3 = var9;
            var8 >>= 1;
            var9 >>= 1;
            var7 >>= 1;
            ++var6;
         }
      }
   }

   int method5901() {
      int var1 = this.aClass144_5534.anInt1679 * -1829390781 * this.aClass166_5537.anInt1891 * 1990758583 * this.anInt5527;
      return this.aBool5536?var1 * 4 / 3:var1;
   }

   public void method336() {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else {
         int var1 = this.aClass174_Sub3_Sub2_5531.method8935();
         int var2 = this.aClass174_Sub3_Sub2_5531.anIntArray11494[var1];
         if(var2 != this.anInt5533) {
            if(var2 != 0) {
               OpenGL.glBindTexture(var2, 0);
               OpenGL.glDisable(var2);
            }

            OpenGL.glEnable(this.anInt5533);
            this.aClass174_Sub3_Sub2_5531.anIntArray11494[var1] = this.anInt5533;
         }

         OpenGL.glBindTexture(this.anInt5533, this.anInt5532);
      }
   }

   public void method140() {
      if(this.anInt5532 != 0) {
         this.aClass174_Sub3_Sub2_5531.anInt9691 -= this.method5901();
         int[] var1 = new int[]{this.anInt5532};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.anInt5532 = 0;
      }

   }

   public void finalize() throws Throwable {
      this.method5906();
      super.finalize();
   }

   public void method141() {
      if(this.anInt5532 != 0) {
         this.aClass174_Sub3_Sub2_5531.anInt9691 -= this.method5901();
         int[] var1 = new int[]{this.anInt5532};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.anInt5532 = 0;
      }

   }

   void method5902() throws Throwable {
      this.method5906();
      super.finalize();
   }

   void method5903(int var1) {
      this.aClass174_Sub3_Sub2_5531.anInt9691 -= var1;
      this.aClass174_Sub3_Sub2_5531.anInt9691 += this.method5901();
   }

   boolean method288() {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else {
         int var1 = this.method5901();
         this.aClass174_Sub3_Sub2_5531.method8841(this);
         if(this.aClass174_Sub3_Sub2_5531.aBool11486) {
            OpenGL.glEnable(this.anInt5533);
         }

         OpenGL.glGenerateMipmapEXT(this.anInt5533);
         if(this.aClass174_Sub3_Sub2_5531.aBool11486) {
            OpenGL.glDisable(this.anInt5533);
         }

         this.aBool5536 = true;
         this.method5897();
         this.method5903(var1);
         return true;
      }
   }

   public void method337() {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else {
         int var1 = this.aClass174_Sub3_Sub2_5531.method8935();
         int var2 = this.aClass174_Sub3_Sub2_5531.anIntArray11494[var1];
         if(var2 != this.anInt5533) {
            if(var2 != 0) {
               OpenGL.glBindTexture(var2, 0);
               OpenGL.glDisable(var2);
            }

            OpenGL.glEnable(this.anInt5533);
            this.aClass174_Sub3_Sub2_5531.anIntArray11494[var1] = this.anInt5533;
         }

         OpenGL.glBindTexture(this.anInt5533, this.anInt5532);
      }
   }

   public void method335() {
      if(this.anInt5532 == 0) {
         throw new IllegalStateException("");
      } else {
         int var1 = this.aClass174_Sub3_Sub2_5531.method8935();
         int var2 = this.aClass174_Sub3_Sub2_5531.anIntArray11494[var1];
         if(var2 != this.anInt5533) {
            if(var2 != 0) {
               OpenGL.glBindTexture(var2, 0);
               OpenGL.glDisable(var2);
            }

            OpenGL.glEnable(this.anInt5533);
            this.aClass174_Sub3_Sub2_5531.anIntArray11494[var1] = this.anInt5533;
         }

         OpenGL.glBindTexture(this.anInt5533, this.anInt5532);
      }
   }

   public void method338(Class341 var1) {
      if(this.aClass341_5529 != var1) {
         this.aClass341_5529 = var1;
         this.method5897();
      }

   }

   Class494(Class174_Sub3_Sub2 var1, int var2, Class144 var3, Class166 var4, int var5, boolean var6) {
      this.aClass341_5529 = Class341.aClass341_3541;
      this.aClass174_Sub3_Sub2_5531 = var1;
      this.anInt5533 = var2;
      this.aClass144_5534 = var3;
      this.aClass166_5537 = var4;
      this.aBool5536 = var6;
      this.anInt5527 = var5;
      OpenGL.glGenTextures(1, anIntArray5539, 0);
      this.anInt5532 = anIntArray5539[0];
      this.method5897();
      this.method5903(0);
   }

   void method5904(int var1) {
      this.aClass174_Sub3_Sub2_5531.anInt9691 -= var1;
      this.aClass174_Sub3_Sub2_5531.anInt9691 += this.method5901();
   }

   void method5905(int var1) {
      this.aClass174_Sub3_Sub2_5531.anInt9691 -= var1;
      this.aClass174_Sub3_Sub2_5531.anInt9691 += this.method5901();
   }

   void method5906() {
      if(this.anInt5532 != 0) {
         this.aClass174_Sub3_Sub2_5531.method10537(this.anInt5532, this.method5901());
         this.anInt5532 = 0;
      }

   }

   void method5907() {
      if(this.anInt5532 != 0) {
         this.aClass174_Sub3_Sub2_5531.method10537(this.anInt5532, this.method5901());
         this.anInt5532 = 0;
      }

   }

   void method5908(int var1) {
      this.aClass174_Sub3_Sub2_5531.anInt9691 -= var1;
      this.aClass174_Sub3_Sub2_5531.anInt9691 += this.method5901();
   }

   void method5909() {
      if(this.anInt5532 != 0) {
         this.aClass174_Sub3_Sub2_5531.method10537(this.anInt5532, this.method5901());
         this.anInt5532 = 0;
      }

   }
}
