package com.jagex;

import com.jagex.Class1;
import com.jagex.Class124;
import com.jagex.Class124_Sub1_Sub1;
import com.jagex.Class139;
import com.jagex.Class144;
import com.jagex.Class162;
import com.jagex.Class162_Sub1;
import com.jagex.Class163;
import com.jagex.Class166;
import com.jagex.Class173;
import com.jagex.Class173_Sub1;
import com.jagex.Class173_Sub2;
import com.jagex.Class174_Sub2;
import jaggl.OpenGL;

public class Class163_Sub5 extends Class163 {
   Class174_Sub2 aClass174_Sub2_9890;
   Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9892;
   boolean aBool9889;
   Class139 aClass139_9891;

   void method1908(char var1, int var2, int var3, int var4, boolean var5) {
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   void method1913(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      Class162_Sub1 var9 = (Class162_Sub1)var6;
      Class124_Sub1_Sub1 var10 = var9.aClass124_Sub1_Sub1_9118;
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      this.aClass174_Sub2_9890.method8677(1);
      this.aClass174_Sub2_9890.method8641(var10);
      this.aClass174_Sub2_9890.method8685(7681, 8448);
      this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.aFloat11361 / (float)var10.anInt11359;
      float var12 = var10.aFloat11357 / (float)var10.anInt11358;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-var7) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-var8) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      this.aClass174_Sub2_9890.method8685(8448, 8448);
      this.aClass174_Sub2_9890.method8641((Class124)null);
      this.aClass174_Sub2_9890.method8677(0);
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   void method1922(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      Class162_Sub1 var9 = (Class162_Sub1)var6;
      Class124_Sub1_Sub1 var10 = var9.aClass124_Sub1_Sub1_9118;
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      this.aClass174_Sub2_9890.method8677(1);
      this.aClass174_Sub2_9890.method8641(var10);
      this.aClass174_Sub2_9890.method8685(7681, 8448);
      this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.aFloat11361 / (float)var10.anInt11359;
      float var12 = var10.aFloat11357 / (float)var10.anInt11358;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-var7) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-var8) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      this.aClass174_Sub2_9890.method8685(8448, 8448);
      this.aClass174_Sub2_9890.method8641((Class124)null);
      this.aClass174_Sub2_9890.method8677(0);
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   void method1909(char var1, int var2, int var3, int var4, boolean var5) {
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   void method1910(char var1, int var2, int var3, int var4, boolean var5) {
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   void method1906(char var1, int var2, int var3, int var4, boolean var5) {
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   void method1912(char var1, int var2, int var3, int var4, boolean var5) {
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   void method1907(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
      Class162_Sub1 var9 = (Class162_Sub1)var6;
      Class124_Sub1_Sub1 var10 = var9.aClass124_Sub1_Sub1_9118;
      this.aClass174_Sub2_9890.method8637();
      this.aClass174_Sub2_9890.method8641(this.aClass124_Sub1_Sub1_9892);
      if(!this.aBool9889 && !var5) {
         this.aClass174_Sub2_9890.method8685(7681, 7681);
      } else {
         this.aClass174_Sub2_9890.method8685(7681, 8448);
         this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      }

      this.aClass174_Sub2_9890.method8677(1);
      this.aClass174_Sub2_9890.method8641(var10);
      this.aClass174_Sub2_9890.method8685(7681, 8448);
      this.aClass174_Sub2_9890.method8665(0, '\u8578', 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.aFloat11361 / (float)var10.anInt11359;
      float var12 = var10.aFloat11357 / (float)var10.anInt11358;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-var7) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-var8) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.aClass139_9891.method1645(var1);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      this.aClass174_Sub2_9890.method8685(8448, 8448);
      this.aClass174_Sub2_9890.method8641((Class124)null);
      this.aClass174_Sub2_9890.method8677(0);
      if(this.aBool9889 || var5) {
         this.aClass174_Sub2_9890.method8665(0, 5890, 768);
      }

   }

   Class163_Sub5(Class174_Sub2 var1, Class1 var2, Class173[] var3, boolean var4) {
      super(var1, var2);
      this.aClass174_Sub2_9890 = var1;
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < 256; ++var6) {
         Class173 var7 = var3[var6];
         if(var7.method2175() > var5) {
            var5 = var7.method2175();
         }

         if(var7.method2168() > var5) {
            var5 = var7.method2168();
         }
      }

      var6 = var5 * 16;
      int var8;
      Class173 var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      Class173_Sub1 var16;
      int[] var17;
      int var18;
      int var19;
      int var20;
      Class173_Sub2 var29;
      if(var4) {
         byte[] var23 = new byte[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            var10 = var9.method2175();
            var11 = var9.method2168();
            var12 = var8 % 16 * var5;
            var13 = var8 / 16 * var5;
            var14 = var13 * var6 + var12;
            var15 = 0;
            if(var9.method2166()) {
               var29 = (Class173_Sub2)var3[var8];
               byte[] var31;
               if(!var29.method2224()) {
                  var31 = var29.aByteArray9858;

                  for(var18 = 0; var18 < var10; ++var18) {
                     for(var19 = 0; var19 < var11; ++var19) {
                        var23[var14++] = (byte)(var31[var15++] == 0?0:-1);
                     }

                     var14 += var6 - var11;
                  }
               } else {
                  var31 = var29.aByteArray9859;

                  for(var18 = 0; var18 < var10; ++var18) {
                     for(var19 = 0; var19 < var11; ++var19) {
                        var23[var14++] = var31[var15++];
                     }

                     var14 += var6 - var11;
                  }
               }
            } else {
               var16 = (Class173_Sub1)var3[var8];
               var17 = var16.method2204(false);
               if(!var16.method2224()) {
                  for(var18 = 0; var18 < var10; ++var18) {
                     for(var19 = 0; var19 < var11; ++var19) {
                        var20 = var17[var15++];
                        byte var21 = (byte)((var20 >> 16 & 255) * 3 + (var20 >> 8 & 255) * 4 + (var20 & 255) >> 3);
                        var23[var14++] = var21;
                     }

                     var14 += var6 - var11;
                  }
               } else {
                  for(var18 = 0; var18 < var10; ++var18) {
                     for(var19 = 0; var19 < var11; ++var19) {
                        var23[var14++] = (byte)(var17[var15++] >> 24 & 255);
                     }

                     var14 += var6 - var11;
                  }
               }
            }
         }

         this.aClass124_Sub1_Sub1_9892 = Class124_Sub1_Sub1.method10443(var1, Class144.aClass144_1681, Class166.aClass166_1884, var6, var6, false, var23, Class144.aClass144_1681);
         this.aBool9889 = true;
      } else {
         int[] var24 = new int[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            var10 = var9.method2175();
            var11 = var9.method2168();
            var12 = var8 % 16 * var5;
            var13 = var8 / 16 * var5;
            var14 = var13 * var6 + var12;
            var15 = 0;
            if(var9.method2166()) {
               var29 = (Class173_Sub2)var3[var8];
               var17 = var29.anIntArray9857;
               byte[] var35 = var29.aByteArray9859;
               byte[] var38 = var29.aByteArray9858;
               int var34;
               if(var35 != null) {
                  for(var20 = 0; var20 < var10; ++var20) {
                     for(var34 = 0; var34 < var11; ++var34) {
                        var24[var14++] = var35[var15] << 24 | var17[var38[var15] & 255];
                        ++var15;
                     }

                     var14 += var6 - var11;
                  }
               } else {
                  for(var20 = 0; var20 < var10; ++var20) {
                     for(var34 = 0; var34 < var11; ++var34) {
                        byte var22;
                        if((var22 = var38[var15++]) != 0) {
                           var24[var14++] = -16777216 | var17[var22 & 255];
                        } else {
                           ++var14;
                        }
                     }

                     var14 += var6 - var11;
                  }
               }
            } else {
               var16 = (Class173_Sub1)var3[var8];
               var17 = var16.method2204(false);
               if(!var16.method2224()) {
                  for(var18 = 0; var18 < var10; ++var18) {
                     for(var19 = 0; var19 < var11; ++var19) {
                        var20 = var17[var15] & 16777215;
                        var24[var14++] = (var20 == 0?0:255) << 24 | var20;
                        ++var15;
                     }

                     var14 += var6 - var11;
                  }
               } else {
                  for(var18 = 0; var18 < var10; ++var18) {
                     for(var19 = 0; var19 < var11; ++var19) {
                        var24[var14++] = var17[var15++];
                     }

                     var14 += var6 - var11;
                  }
               }
            }
         }

         this.aClass124_Sub1_Sub1_9892 = Class124_Sub1_Sub1.method10442(var1, var6, var6, false, var24, 0, 0);
         this.aBool9889 = false;
      }

      this.aClass124_Sub1_Sub1_9892.method1475(false);
      this.aClass139_9891 = new Class139(var1, 256);
      float var25 = this.aClass124_Sub1_Sub1_9892.aFloat11361 / (float)this.aClass124_Sub1_Sub1_9892.anInt11359;
      float var26 = this.aClass124_Sub1_Sub1_9892.aFloat11357 / (float)this.aClass124_Sub1_Sub1_9892.anInt11358;

      for(int var27 = 0; var27 < 256; ++var27) {
         Class173 var28 = var3[var27];
         var11 = var28.method2175();
         var12 = var28.method2168();
         var13 = var28.method2172();
         var14 = var28.method2170();
         float var32 = (float)(var27 % 16 * var5);
         float var30 = (float)(var27 / 16 * var5);
         float var33 = var32 * var25;
         float var37 = var30 * var26;
         float var39 = (var32 + (float)var12) * var25;
         float var36 = (var30 + (float)var11) * var26;
         this.aClass139_9891.method1643(var27);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var33, this.aClass124_Sub1_Sub1_9892.aFloat11357 - var37);
         OpenGL.glVertex2i(var14, var13);
         OpenGL.glTexCoord2f(var33, this.aClass124_Sub1_Sub1_9892.aFloat11357 - var36);
         OpenGL.glVertex2i(var14, var13 + var11);
         OpenGL.glTexCoord2f(var39, this.aClass124_Sub1_Sub1_9892.aFloat11357 - var36);
         OpenGL.glVertex2i(var14 + var12, var13 + var11);
         OpenGL.glTexCoord2f(var39, this.aClass124_Sub1_Sub1_9892.aFloat11357 - var37);
         OpenGL.glVertex2i(var14 + var12, var13);
         OpenGL.glEnd();
         this.aClass139_9891.method1648();
      }

   }
}
