package com.jagex;

import com.jagex.Class16;
import com.jagex.Class192;
import com.jagex.Class358;
import com.jagex.Class375;
import com.jagex.Class378;
import com.jagex.Class388;
import com.jagex.Class474;
import com.jagex.Class479;
import com.jagex.Class570;
import com.jagex.Class612_Sub1;

public abstract class Class361 {
   public abstract void method4592(Object var1);

   public abstract void method4593(int var1);

   public abstract Object method4594(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6, byte var7);

   public abstract void method4595(Object var1, byte var2);

   public abstract void method4596(Object var1, byte[] var2, int var3, int var4, byte var5);

   public abstract int method4597(Object var1, int var2);

   public abstract Object method4598(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6);

   abstract Object method4599(Class378 var1, int var2);

   public abstract Object method4600(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6);

   public abstract int method4601(Object var1);

   public abstract void method4602();

   public abstract Class358 method4603();

   public abstract void method4604(byte var1);

   public abstract Class479 method4605(Class474 var1);

   public abstract Object method4606(int var1, int var2, Class388 var3, Class375 var4, int var5, float var6);

   public abstract void method4607(Object var1, byte[] var2, int var3, int var4);

   public abstract void method4608(Object var1, byte[] var2, int var3, int var4);

   public abstract Class479 method4609(Class474 var1);

   abstract Object method4610(Class378 var1);

   abstract Object method4611(Class378 var1);

   public abstract Class479 method4612(Class474 var1, int var2);

   abstract Object method4613(Class378 var1);

   public abstract Class358 method4614();

   public abstract Class358 method4615();

   public abstract void method4616();

   public abstract Class358 method4617(byte var1);

   public abstract void method4618(Object var1);

   public abstract void method4619(Object var1);

   public static int method4620(int var0) {
      return Class570.aTwitchTV7639.GetStreamState();
   }

   public static Class612_Sub1 method4621(int var0) {
      Class16.anInt176 = 0;
      return Class192.method2789(-1087961160);
   }

   static void method4622(int var0, int var1, int[] var2, int[] var3, float[] var4, float[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int var13 = var6 + var7 * var0;
      int var14 = var8 + var9 * var1;
      int var15 = var0 - var10;
      int var16 = var1 - var10;
      int var17;
      int var18;
      if(null == var2) {
         for(var17 = 0; var17 < var11; ++var17) {
            for(var18 = var13 + var10; var13 < var18; var5[var14++] = var4[var13++]) {
               ;
            }

            var13 += var15;
            var14 += var16;
         }
      } else if(var4 == null) {
         for(var17 = 0; var17 < var11; ++var17) {
            for(var18 = var10 + var13; var13 < var18; var3[var14++] = var2[var13++]) {
               ;
            }

            var13 += var15;
            var14 += var16;
         }
      } else {
         for(var17 = 0; var17 < var11; ++var17) {
            for(var18 = var13 + var10; var13 < var18; var5[var14++] = var4[var13++]) {
               var3[var14] = var2[var13];
            }

            var13 += var15;
            var14 += var16;
         }
      }

   }
}
