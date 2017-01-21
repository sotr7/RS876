package com.jagex;

import com.jagex.Class445;
import com.jagex.Class681;

public class Class469 {
   int anInt5348;
   int anInt5347;
   int anInt5346;
   byte[] aByteArray5349;

   Class469(int var1, int var2, int var3, int var4, byte[] var5) {
      this.anInt5348 = var1 * 696305413;
      this.anInt5347 = -143671431 * var2;
      this.anInt5346 = -346131161 * var3;
      this.aByteArray5349 = var5;
   }

   static final void method5610(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      long var2 = (long)var0.anIntArray8622[-1730576285 * var0.anInt8623];
      long var4 = (long)var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)(var4 * var2 / 100L + var2);
   }

   public static Class445 method5611(byte var0) {
      Class445 var1 = new Class445();
      var1.method5225(0.0F, 1.0F, 0.0F, (float)(Math.random() * 3.141592653589793D * 2.0D));
      float var2 = (float)(0.5D + 0.5D * Math.random()) * 256.0F;
      var1.method5251(var2 - 128.0F, 0.0F, 0.0F);
      var1.method5237(0.0F, 1.0F, 0.0F, (float)(Math.random() * 3.141592653589793D * 2.0D));
      return var1;
   }
}
