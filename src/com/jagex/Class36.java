package com.jagex;

import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class508;
import com.jagex.Class539_Sub3;
import com.jagex.Class681;
import com.jagex.Class87;

public class Class36 {
   static final int anInt377 = 7;
   static final int anInt378 = 127;

   Class36() throws Throwable {
      throw new Error();
   }

   static final void method838(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)16);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class508.method6159(var3, var4, var0, -662472960);
   }

   static void method839(int var0) {
      if(null == Class87.anIntArray855) {
         Class87.anIntArray855 = new int[65536];
         double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
         int var3 = 0;

         for(int var4 = 0; var4 < 512; ++var4) {
            float var5 = (0.0078125F + (float)(var4 >> 3) / 64.0F) * 360.0F;
            float var6 = 0.0625F + (float)(var4 & 7) / 8.0F;

            for(int var7 = 0; var7 < 128; ++var7) {
               float var8 = (float)var7 / 128.0F;
               float var9 = 0.0F;
               float var10 = 0.0F;
               float var11 = 0.0F;
               float var12 = var5 / 60.0F;
               int var13 = (int)var12;
               int var14 = var13 % 6;
               float var15 = var12 - (float)var13;
               float var16 = (1.0F - var6) * var8;
               float var17 = var8 * (1.0F - var6 * var15);
               float var18 = var8 * (1.0F - var6 * (1.0F - var15));
               if(var14 == 0) {
                  var9 = var8;
                  var10 = var18;
                  var11 = var16;
               } else if(var14 == 1) {
                  var9 = var17;
                  var10 = var8;
                  var11 = var16;
               } else if(2 == var14) {
                  var9 = var16;
                  var10 = var8;
                  var11 = var18;
               } else if(var14 == 3) {
                  var9 = var16;
                  var10 = var17;
                  var11 = var8;
               } else if(4 == var14) {
                  var9 = var18;
                  var10 = var16;
                  var11 = var8;
               } else if(5 == var14) {
                  var9 = var8;
                  var10 = var16;
                  var11 = var17;
               }

               var9 = (float)Math.pow((double)var9, var1);
               var10 = (float)Math.pow((double)var10, var1);
               var11 = (float)Math.pow((double)var11, var1);
               int var19 = (int)(var9 * 256.0F);
               int var20 = (int)(256.0F * var10);
               int var21 = (int)(256.0F * var11);
               int var22 = (var19 << 16) + -16777216 + (var20 << 8) + var21;
               Class87.anIntArray855[var3++] = var22;
            }
         }

      }
   }

   static final void method840(Class681 var0, short var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub27_10648.method10090(1033102924);
   }

   static Class539_Sub3 method841(int var0) {
      Class539_Sub3 var1 = (Class539_Sub3)Class539_Sub3.aClass686_10338.method8052(1115407576);
      if(null != var1) {
         Class539_Sub3.anInt10335 -= 739327935;
         return var1;
      } else {
         return new Class539_Sub3();
      }
   }
}
