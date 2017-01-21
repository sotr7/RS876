package com.jagex;

import com.jagex.Class128;
import com.jagex.Class148_Sub3;
import com.jagex.Class174_Sub2;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub21_Sub5_Sub2;
import com.jagex.Class526_Sub36_Sub1;
import jaggl.OpenGL;

public class Class145 {
   Class128[][] aClass128ArrayArray1699;
   Class174_Sub2 aClass174_Sub2_1693;
   Class148_Sub3 aClass148_Sub3_1692;
   int anInt1691;
   int anInt1697;
   byte[] aByteArray1695;
   int anInt1698;
   int anInt1696;
   int anInt1694;

   void method1673() {
      this.aClass128ArrayArray1699 = new Class128[this.anInt1696][this.anInt1694];

      for(int var1 = 0; var1 < this.anInt1694; ++var1) {
         for(int var2 = 0; var2 < this.anInt1696; ++var2) {
            this.aClass128ArrayArray1699[var2][var1] = new Class128(this.aClass174_Sub2_1693, this, this.aClass148_Sub3_1692, var2, var1, this.anInt1698, var2 * 128 + 1, var1 * 128 + 1);
         }
      }

   }

   Class145(Class174_Sub2 var1, Class148_Sub3 var2) {
      this.aClass174_Sub2_1693 = var1;
      this.aClass148_Sub3_1692 = var2;
      this.anInt1691 = 2 + (this.aClass148_Sub3_1692.anInt1711 * 1966165105 * this.aClass148_Sub3_1692.anInt1712 * 1934131013 >> this.aClass174_Sub2_1693.anInt9662);
      this.anInt1697 = 2 + (this.aClass148_Sub3_1692.anInt1713 * -810756899 * this.aClass148_Sub3_1692.anInt1712 * 1934131013 >> this.aClass174_Sub2_1693.anInt9662);
      this.aByteArray1695 = new byte[this.anInt1691 * this.anInt1697];
      this.anInt1698 = 7 + this.aClass174_Sub2_1693.anInt9662 - this.aClass148_Sub3_1692.anInt1710 * -586661047;
      this.anInt1696 = this.aClass148_Sub3_1692.anInt1711 * 1966165105 >> this.anInt1698;
      this.anInt1694 = this.aClass148_Sub3_1692.anInt1713 * -810756899 >> this.anInt1698;
   }

   static final boolean method1674(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 % var5;
      int var7;
      if(var6 != 0) {
         var7 = var5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((var3 + var5 - 1) / var5);
      int var9 = -((var2 + var5 - 1) / var5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if(var0[var1] == 0) {
               return true;
            }

            var1 += var5;
         }

         var1 -= var7;
         if(var0[var1 - 1] == 0) {
            return true;
         }

         var1 += var4;
      }

      return false;
   }

   boolean method1675(Class526_Sub21_Sub5 var1, int var2, int var3) {
      Class526_Sub21_Sub5_Sub2 var4 = (Class526_Sub21_Sub5_Sub2)var1;
      var2 += var4.anInt12077 + 1;
      var3 += var4.anInt12078 + 1;
      int var5 = var2 + var3 * this.anInt1691;
      int var6 = var4.anInt12076;
      int var7 = var4.anInt12075;
      int var8 = this.anInt1691 - var7;
      int var9;
      if(var3 <= 0) {
         var9 = 1 - var3;
         var6 -= var9;
         var5 += var9 * this.anInt1691;
         var3 = 1;
      }

      if(var3 + var6 >= this.anInt1697) {
         var9 = var3 + var6 + 1 - this.anInt1697;
         var6 -= var9;
      }

      if(var2 <= 0) {
         var9 = 1 - var2;
         var7 -= var9;
         var5 += var9;
         var8 += var9;
         var2 = 1;
      }

      if(var2 + var7 >= this.anInt1691) {
         var9 = var2 + var7 + 1 - this.anInt1691;
         var7 -= var9;
         var8 += var9;
      }

      if(var7 > 0 && var6 > 0) {
         byte var10 = 8;
         var8 += (var10 - 1) * this.anInt1691;
         return method1674(this.aByteArray1695, var5, var7, var6, var8, var10);
      } else {
         return false;
      }
   }

   void method1676(int var1, int var2, int var3, int var4) {
      if(this.aClass128ArrayArray1699 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class128[] var10 = this.aClass128ArrayArray1699[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               var10[var11].aBool1599 = true;
            }
         }

      }
   }

   static final void method1677(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   void method1678(Class526_Sub21_Sub5 var1, int var2, int var3) {
      Class526_Sub21_Sub5_Sub2 var4 = (Class526_Sub21_Sub5_Sub2)var1;
      var2 += var4.anInt12077 + 1;
      var3 += var4.anInt12078 + 1;
      int var5 = var2 + var3 * this.anInt1691;
      int var6 = 0;
      int var7 = var4.anInt12076;
      int var8 = var4.anInt12075;
      int var9 = this.anInt1691 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt1691;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt1697) {
         var11 = var3 + var7 + 1 - this.anInt1697;
         var7 -= var11;
      }

      if(var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if(var2 + var8 >= this.anInt1691) {
         var11 = var2 + var8 + 1 - this.anInt1691;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method1677(this.aByteArray1695, var4.aByteArray12079, var6, var5, var8, var7, var9, var10);
         this.method1676(var2, var3, var8, var7);
      }
   }

   void method1679() {
      this.aClass128ArrayArray1699 = new Class128[this.anInt1696][this.anInt1694];

      for(int var1 = 0; var1 < this.anInt1694; ++var1) {
         for(int var2 = 0; var2 < this.anInt1696; ++var2) {
            this.aClass128ArrayArray1699[var2][var1] = new Class128(this.aClass174_Sub2_1693, this, this.aClass148_Sub3_1692, var2, var1, this.anInt1698, var2 * 128 + 1, var1 * 128 + 1);
         }
      }

   }

   void method1680(Class526_Sub21_Sub5 var1, int var2, int var3) {
      Class526_Sub21_Sub5_Sub2 var4 = (Class526_Sub21_Sub5_Sub2)var1;
      var2 += var4.anInt12077 + 1;
      var3 += var4.anInt12078 + 1;
      int var5 = var2 + var3 * this.anInt1691;
      int var6 = 0;
      int var7 = var4.anInt12076;
      int var8 = var4.anInt12075;
      int var9 = this.anInt1691 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt1691;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt1697) {
         var11 = var3 + var7 + 1 - this.anInt1697;
         var7 -= var11;
      }

      if(var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if(var2 + var8 >= this.anInt1691) {
         var11 = var2 + var8 + 1 - this.anInt1691;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method1687(this.aByteArray1695, var4.aByteArray12079, var6, var5, var8, var7, var9, var10);
         this.method1676(var2, var3, var8, var7);
      }
   }

   void method1681(int var1, int var2, int var3, int var4) {
      if(this.aClass128ArrayArray1699 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class128[] var10 = this.aClass128ArrayArray1699[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               var10[var11].aBool1599 = true;
            }
         }

      }
   }

   void method1682(int var1, int var2, int var3, int var4) {
      if(this.aClass128ArrayArray1699 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class128[] var10 = this.aClass128ArrayArray1699[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               var10[var11].aBool1599 = true;
            }
         }

      }
   }

   void method1683(int var1, int var2, int var3, int var4) {
      if(this.aClass128ArrayArray1699 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class128[] var10 = this.aClass128ArrayArray1699[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               var10[var11].aBool1599 = true;
            }
         }

      }
   }

   static final boolean method1684(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 % var5;
      int var7;
      if(var6 != 0) {
         var7 = var5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((var3 + var5 - 1) / var5);
      int var9 = -((var2 + var5 - 1) / var5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if(var0[var1] == 0) {
               return true;
            }

            var1 += var5;
         }

         var1 -= var7;
         if(var0[var1 - 1] == 0) {
            return true;
         }

         var1 += var4;
      }

      return false;
   }

   static final void method1685(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   void method1686(int var1, int var2, int var3, boolean[][] var4, boolean var5) {
      this.aClass174_Sub2_1693.method8646(false);
      this.aClass174_Sub2_1693.method8648(false);
      this.aClass174_Sub2_1693.method8639(-2);
      this.aClass174_Sub2_1693.method8672(1);
      this.aClass174_Sub2_1693.method8651(1);
      float var6 = 1.0F / (float)(this.aClass174_Sub2_1693.anInt9512 * 128);
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      if(var5) {
         for(var7 = 0; var7 < this.anInt1694; ++var7) {
            var8 = var7 << this.anInt1698;
            var9 = var7 + 1 << this.anInt1698;

            label128:
            for(var10 = 0; var10 < this.anInt1696; ++var10) {
               var11 = var10 << this.anInt1698;
               var12 = var10 + 1 << this.anInt1698;

               for(var13 = var11; var13 < var12; ++var13) {
                  if(var13 - var1 >= -var3 && var13 - var1 <= var3) {
                     for(int var14 = var8; var14 < var9; ++var14) {
                        if(var14 - var2 >= -var3 && var14 - var2 <= var3 && var4[var13 - var1 + var3][var14 - var2 + var3]) {
                           OpenGL.glMatrixMode(5890);
                           OpenGL.glLoadIdentity();
                           OpenGL.glScalef(var6, var6, 1.0F);
                           OpenGL.glTranslatef((float)(-var10) / var6, (float)(-var7) / var6, 1.0F);
                           OpenGL.glMatrixMode(5888);
                           this.aClass128ArrayArray1699[var10][var7].method1618();
                           continue label128;
                        }
                     }
                  }
               }
            }
         }
      } else {
         for(var7 = 0; var7 < this.anInt1694; ++var7) {
            var8 = var7 << this.anInt1698;
            var9 = var7 + 1 << this.anInt1698;

            for(var10 = 0; var10 < this.anInt1696; ++var10) {
               var11 = 0;
               var12 = var10 << this.anInt1698;
               var13 = var10 + 1 << this.anInt1698;
               Class526_Sub36_Sub1 var20 = this.aClass174_Sub2_1693.aClass526_Sub36_Sub1_9655;
               var20.pos = 0;

               for(int var15 = var8; var15 < var9; ++var15) {
                  if(var15 - var2 >= -var3 && var15 - var2 <= var3) {
                     int var16 = var15 * this.aClass148_Sub3_1692.anInt1711 * 1966165105 + var12;

                     for(int var17 = var12; var17 < var13; ++var17) {
                        if(var17 - var1 >= -var3 && var17 - var1 <= var3 && var4[var17 - var1 + var3][var15 - var2 + var3]) {
                           short[] var18 = this.aClass148_Sub3_1692.aShortArrayArray9170[var16];
                           if(var18 != null) {
                              int var19;
                              if(this.aClass174_Sub2_1693.aBool9508) {
                                 for(var19 = 0; var19 < var18.length; ++var19) {
                                    var20.writeShort(var18[var19] & '\uffff', -805078716);
                                    ++var11;
                                 }
                              } else {
                                 for(var19 = 0; var19 < var18.length; ++var19) {
                                    var20.method9610(var18[var19] & '\uffff', (byte)0);
                                    ++var11;
                                 }
                              }
                           }
                        }

                        ++var16;
                     }
                  }
               }

               if(var11 > 0) {
                  OpenGL.glMatrixMode(5890);
                  OpenGL.glLoadIdentity();
                  OpenGL.glScalef(var6, var6, 1.0F);
                  OpenGL.glTranslatef((float)(-var10) / var6, (float)(-var7) / var6, 1.0F);
                  OpenGL.glMatrixMode(5888);
                  this.aClass128ArrayArray1699[var10][var7].method1619(var20.buffer, var11);
               }
            }
         }
      }

      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
   }

   static final void method1687(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }
}
