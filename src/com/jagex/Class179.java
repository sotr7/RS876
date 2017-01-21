package com.jagex;

import com.jagex.Class115;
import com.jagex.IsaacCipher;
import com.jagex.Class195;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class446;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub32;
import com.jagex.Class566;
import com.jagex.Class595;
import com.jagex.Class603;
import com.jagex.Class653;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import com.jagex.Interface24;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class Class179 implements Interface24 {
   static double aDouble2071 = -1.0D;
   static int[] anIntArray2070 = new int[256];

   public float[] method146(Class595 var1, int var2, float var3, int var4, int var5, boolean var6, byte var7) {
      return this.method2670(var1, var2, (double)var3);
   }

   public float[] method147(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2670(var1, var2, (double)var3);
   }

   public abstract boolean method162(Class595 var1, int var2, Class603 var3, float var4, int var5, int var6, boolean var7, int var8);

   int[] method2668(Class595 var1, int var2, double var3) {
      int[] var5 = this.method2669(var1, var2, var3);
      if(var5 == null) {
         return null;
      } else {
         for(int var6 = 0; var6 < var5.length; ++var6) {
            if((var5[var6] & 16777215) != 0) {
               var5[var6] |= -16777216;
            } else {
               var5[var6] &= 16777215;
            }
         }

         return var5;
      }
   }

   int[] method2669(Class595 var1, int var2, double var3) {
      byte[] var5 = this.method2672(var1, var2, -1188891687);
      if(null == var5) {
         return null;
      } else {
         try {
            byte var6 = (byte)(var5[0] & 255);
            if(Class595.aClass595_7848 == var1) {
               if(6 != var6) {
                  return null;
               } else {
                  int[] var14 = null;
                  int var15 = 1;

                  for(int var9 = 0; var9 < 6; ++var9) {
                     int var10 = (var5[var15] & 255) << 24 | (var5[1 + var15] & 255) << 16 | (var5[var15 + 2] & 255) << 8 | var5[3 + var15] & 255;
                     byte[] var11 = new byte[var10];
                     System.arraycopy(var5, var15 + 4, var11, 0, var10);
                     int[] var12 = this.method2671(var11, false, (byte)15);
                     if(0 == var9) {
                        var14 = new int[var12.length * 6];
                     }

                     System.arraycopy(var12, 0, var14, var12.length * var9, var12.length);
                     var15 += 4 + var10;
                  }

                  if(1.0D != var3) {
                     IsaacCipher.method612(var14, var3);
                  }

                  return var14;
               }
            } else if(var6 != 1) {
               return null;
            } else {
               byte[] var7 = new byte[var5.length - 5];
               System.arraycopy(var5, 5, var7, 0, var5.length - 5);
               int[] var8 = this.method2671(var7, false, (byte)-14);
               if(null == var8) {
                  return null;
               } else {
                  if(var3 != 1.0D) {
                     IsaacCipher.method612(var8, var3);
                  }

                  return var8;
               }
            }
         } catch (IOException var13) {
            return null;
         }
      }
   }

   float[] method2670(Class595 var1, int var2, double var3) {
      if(Class595.aClass595_7846 != var1) {
         return null;
      } else {
         int[] var5 = this.method2669(var1, var2, var3);
         if(null == var5) {
            return null;
         } else {
            int[] var6 = null;
            byte[] var7 = this.method2672(Class595.aClass595_7847, var2, -1188891687);
            int var10;
            if(var7 != null) {
               try {
                  byte var8 = (byte)(var7[0] & 255);
                  if(1 != var8) {
                     return null;
                  }

                  byte[] var9 = new byte[var7.length - 5];
                  System.arraycopy(var7, 5, var9, 0, var7.length - 5);
                  var6 = this.method2671(var9, false, (byte)-69);

                  for(var10 = 0; var10 < var6.length; ++var10) {
                     var6[var10] &= 255;
                  }
               } catch (IOException var17) {
                  ;
               }
            }

            if(var6 == null) {
               var6 = new int[var5.length];
            }

            float[] var18 = new float[var5.length * 4];
            int var19 = 0;

            for(int var11 = 0; var11 < var5.length; ++var11) {
               var10 = var5[var11];
               int var12 = var10 >>> 24;
               int var13 = (var10 & 16711680) >> 16;
               int var14 = (var10 & '\uff00') >> 8;
               int var15 = var10 & 255;
               float var16 = (float)var6[var11] * 31.0F / 255.0F + 1.0F;
               var18[var19++] = var16 * (float)var13 / 255.0F;
               var18[var19++] = (float)var14 * var16 / 255.0F;
               var18[var19++] = var16 * (float)var15 / 255.0F;
               var18[var19++] = (float)var12 / 255.0F;
            }

            return var18;
         }
      }
   }

   public void method150(byte var1) {
   }

   public int[] method144(Class595 var1, int var2, float var3, int var4, int var5, boolean var6, int var7) {
      return this.method2669(var1, var2, (double)var3);
   }

   int[] method2671(byte[] var1, boolean var2, byte var3) throws IOException {
      BufferedImage var4 = ImageIO.read(new ByteArrayInputStream(var1));
      if(var4 == null) {
         return null;
      } else {
         int[] var5 = Class653.method7796(var4, -125003573);
         if(var2) {
            for(int var6 = var4.getHeight() - 1; var6 >= 0; --var6) {
               int var7 = var6 * var4.getWidth();

               for(int var8 = (var6 + 1) * var4.getWidth(); var7 < var8; ++var7) {
                  --var8;
                  int var9 = var5[var7];
                  var5[var7] = var5[var8];
                  var5[var8] = var9;
               }
            }
         }

         return var5;
      }
   }

   public abstract boolean method145(Class595 var1, int var2, Class603 var3, float var4, int var5, int var6, boolean var7);

   public abstract boolean method151(Class595 var1, int var2, Class603 var3, float var4, int var5, int var6, boolean var7);

   public abstract boolean method149(Class595 var1, int var2, Class603 var3, float var4, int var5, int var6, boolean var7);

   public int[] method156(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2669(var1, var2, (double)var3);
   }

   public int[] method155(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2669(var1, var2, (double)var3);
   }

   public void method159() {
   }

   public void method44() {
   }

   public int[] method161(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2668(var1, var2, (double)var3);
   }

   public int[] method152(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2668(var1, var2, (double)var3);
   }

   public int[] method157(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2668(var1, var2, (double)var3);
   }

   public int[] method154(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2668(var1, var2, (double)var3);
   }

   public int[] method143(Class595 var1, int var2, float var3, int var4, int var5, boolean var6, int var7) {
      return this.method2668(var1, var2, (double)var3);
   }

   public int[] method142(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2669(var1, var2, (double)var3);
   }

   public int[] method158(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2669(var1, var2, (double)var3);
   }

   public float[] method148(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2670(var1, var2, (double)var3);
   }

   public float[] method160(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2670(var1, var2, (double)var3);
   }

   abstract byte[] method2672(Class595 var1, int var2, int var3);

   public float[] method153(Class595 var1, int var2, float var3, int var4, int var5, boolean var6) {
      return this.method2670(var1, var2, (double)var3);
   }

   abstract byte[] method2673(Class595 var1, int var2);

   static final void method2674(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2524 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * -1774769869;
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method2675(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class115.method1407(var3, var4, var0, (short)256);
   }

   static final void method2676(Class681 var0, int var1) {
      Class526_Sub32 var2 = (Class526_Sub32)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anInt10597 * -1299508185;
   }

   static final void method2677(Class681 var0, int var1) throws Exception_Sub2 {
      var0.anInt8623 -= 758383916;
      float var2 = (float)var0.anIntArray8622[var0.anInt8623 * -1730576285];
      float var3 = (float)var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      float var4 = (float)var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      float var5 = (float)var0.anIntArray8622[var0.anInt8623 * -1730576285 + 3] / 1000.0F;
      Class195.aClass292_Sub1_2182.method3903(Class446.method5309(var2, var3, var4), var5, -445135454);
   }

   static final void method2678(Class681 var0, byte var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class566.aClass223_7610.method3111(1147062558);
   }
}
