package com.jagex;

import com.jagex.Class116;
import com.jagex.Class195;
import com.jagex.Class221;
import com.jagex.Class231;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class327;
import com.jagex.Class446;
import com.jagex.Class482;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class68;
import com.jagex.Class681;
import com.jagex.Class700;
import com.jagex.Interface56;
import com.jagex.RuntimeException_Sub3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

class Class203 implements Interface56 {
   static Class700 aClass700_2214;
   // $FF: synthetic field
   Class231 this$0;

   public void method371(Object var1, float[] var2, Object[] var3) {
      Class482 var4 = (Class482)var1;
      Class446 var5 = var4.method5784(-1161088228);
      float var6 = var4.method5785((short)25541);
      float var7 = var4.method5791(1244881981);
      Class446 var8 = Class446.method5275(var5, this.this$0.method3188(1714073037));
      float var9 = 0.0F;
      float var10 = var8.method5276();
      if(var10 >= var7) {
         var9 = 0.0F;
      }

      if(var10 <= var6) {
         var9 = 1.0F;
      } else {
         float var11 = 1.0F - 1.0F / (var7 - var6) * (var10 - var6);
         if((double)var11 < 0.0D || (double)var11 > 1.0D) {
            var11 = Math.min(Math.max(var11, 0.0F), 1.0F);
         }

         var9 = var11;
      }

      int var16 = 8192;
      float var12 = 0.0F;
      int var14;
      if(2 == -265840483 * Class327.anInt3488) {
         float var13 = Class195.aClass292_Sub1_2182.method3919(1693310907);
         if(0.0F != var8.aFloat4917 || 0.0F != var8.aFloat4919) {
            var14 = (int)((double)(var13 * -1.0F) * 2607.5945876176133D) - (int)(Math.atan2((double)var8.aFloat4917, (double)var8.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
            if(var14 > 8192) {
               var14 = 16384 - var14;
            }

            int var15;
            if(var10 <= 0.0F) {
               var15 = 8192;
            } else if(var10 >= 4096.0F) {
               var15 = 16384;
            } else {
               var15 = (int)(var10 * 8192.0F / 4096.0F + 8192.0F);
            }

            var16 = (16384 - var15 >> 1) + var15 * var14 / 8192;
         }

         var12 = 6.1035156E-5F * (float)var16;
      } else {
         if(var8.aFloat4917 != 0.0F || 0.0F != var8.aFloat4919) {
            int var17 = -(-871798227 * Class317.anInt3410) - (int)(Math.atan2((double)var8.aFloat4917, (double)var8.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
            if(var17 > 8192) {
               var17 = 16384 - var17;
            }

            if(var10 <= 0.0F) {
               var14 = 8192;
            } else if(var10 >= 4096.0F) {
               var14 = 16384;
            } else {
               var14 = (int)(8192.0F + 8192.0F * var10 / 4096.0F);
            }

            var16 = var17 * var14 / 8192 + (16384 - var14 >> 1);
         }

         var12 = 6.1035156E-5F * (float)var16;
      }

      var2[0] = (float)(var16 < 0?(double)var9:(double)var9 * Math.sqrt((double)(2.0F * (1.0F - var12))));
      var2[1] = (float)(var16 < 0?(double)(-var9):(double)var9 * Math.sqrt((double)(var12 * 2.0F)));
   }

   Class203(Class231 var1) {
      this.this$0 = var1;
   }

   public void method370(Object var1, float[] var2, Object[] var3, int var4) {
      Class482 var5 = (Class482)var1;
      Class446 var6 = var5.method5784(-124279519);
      float var7 = var5.method5785((short)1938);
      float var8 = var5.method5791(1244881981);
      Class446 var9 = Class446.method5275(var6, this.this$0.method3188(157397550));
      float var10 = 0.0F;
      float var11 = var9.method5276();
      if(var11 >= var8) {
         var10 = 0.0F;
      }

      if(var11 <= var7) {
         var10 = 1.0F;
      } else {
         float var12 = 1.0F - 1.0F / (var8 - var7) * (var11 - var7);
         if((double)var12 < 0.0D || (double)var12 > 1.0D) {
            var12 = Math.min(Math.max(var12, 0.0F), 1.0F);
         }

         var10 = var12;
      }

      int var17 = 8192;
      float var13 = 0.0F;
      int var15;
      if(2 == -265840483 * Class327.anInt3488) {
         float var14 = Class195.aClass292_Sub1_2182.method3919(1449422398);
         if(0.0F != var9.aFloat4917 || 0.0F != var9.aFloat4919) {
            var15 = (int)((double)(var14 * -1.0F) * 2607.5945876176133D) - (int)(Math.atan2((double)var9.aFloat4917, (double)var9.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
            if(var15 > 8192) {
               var15 = 16384 - var15;
            }

            int var16;
            if(var11 <= 0.0F) {
               var16 = 8192;
            } else if(var11 >= 4096.0F) {
               var16 = 16384;
            } else {
               var16 = (int)(var11 * 8192.0F / 4096.0F + 8192.0F);
            }

            var17 = (16384 - var16 >> 1) + var16 * var15 / 8192;
         }

         var13 = 6.1035156E-5F * (float)var17;
      } else {
         if(var9.aFloat4917 != 0.0F || 0.0F != var9.aFloat4919) {
            int var18 = -(-871798227 * Class317.anInt3410) - (int)(Math.atan2((double)var9.aFloat4917, (double)var9.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
            if(var18 > 8192) {
               var18 = 16384 - var18;
            }

            if(var11 <= 0.0F) {
               var15 = 8192;
            } else if(var11 >= 4096.0F) {
               var15 = 16384;
            } else {
               var15 = (int)(8192.0F + 8192.0F * var11 / 4096.0F);
            }

            var17 = var18 * var15 / 8192 + (16384 - var15 >> 1);
         }

         var13 = 6.1035156E-5F * (float)var17;
      }

      var2[0] = (float)(var17 < 0?(double)var10:(double)var10 * Math.sqrt((double)(2.0F * (1.0F - var13))));
      var2[1] = (float)(var17 < 0?(double)(-var10):(double)var10 * Math.sqrt((double)(var13 * 2.0F)));
   }

   static void method2885(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class68.method1084((byte)6)?1:0;
   }

   static final void method2886(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)39);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class278.method3685(var3, var4, true, 2, var0, -924511321);
   }

   static final void method2887(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2597 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * -1742190333;
   }

   static void method2888(int var0, byte var1) {
      Class116.anInt1438 = var0 * -168152273;
      Class525_Sub1.anInt10711 = -805427121;
      Class525_Sub1.anInt10711 = -805427121;
      Class526_Sub21_Sub2.method10420(790838094);
   }

   static String method2889(Throwable var0, int var1) throws IOException {
      String var3;
      if(var0 instanceof RuntimeException_Sub3) {
         RuntimeException_Sub3 var2 = (RuntimeException_Sub3)var0;
         var3 = var2.aString12072 + " | ";
         var0 = var2.aThrowable12073;
      } else {
         var3 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var13);
      var0.printStackTrace(var4);
      var4.close();
      String var5 = var13.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         String var8 = var6.readLine();
         if(null == var8) {
            var3 = var3 + "| " + var7;
            return var3;
         }

         int var9 = var8.indexOf(40);
         int var10 = var8.indexOf(41, var9 + 1);
         String var11;
         if(-1 != var9) {
            var11 = var8.substring(0, var9);
         } else {
            var11 = var8;
         }

         var11 = var11.trim();
         var11 = var11.substring(var11.lastIndexOf(32) + 1);
         var11 = var11.substring(var11.lastIndexOf(9) + 1);
         var3 = var3 + var11;
         if(var9 != -1 && -1 != var10) {
            int var12 = var8.indexOf(".java:", var9);
            if(var12 >= 0) {
               var3 = var3 + var8.substring(5 + var12, var10);
            }
         }

         var3 = var3 + '\u0020';
      }
   }
}
