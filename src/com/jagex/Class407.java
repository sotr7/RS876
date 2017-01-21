package com.jagex;

import com.jagex.Class174;
import com.jagex.InterfaceDef;
import com.jagex.Class318_Sub2;
import com.jagex.Class566;
import com.jagex.Class596;
import com.jagex.Class654;
import com.jagex.Class681;
import com.jagex.Class87;

public class Class407 {
   public static final int anInt4293 = 8192;
   public static final int anInt4294 = 8192;
   public static final int anInt4295 = 32;
   public static final int anInt4296 = 2;
   public static final int anInt4297 = 64;
   public static final int anInt4298 = 1048576;
   public static final int anInt4299 = 131072;
   public static final int anInt4300 = 128;
   public static final int anInt4301 = 268435456;
   public static final int anInt4302 = 16384;
   public static final int anInt4303 = 512;
   public static final int anInt4304 = 4096;
   public static final int anInt4305 = 32768;
   public static final int anInt4306 = 32768;
   public static final int anInt4307 = 4;
   public static final int anInt4308 = 2048;
   public static final int anInt4309 = 8;
   public static final int anInt4310 = 2097152;
   public static final int anInt4311 = 131072;
   public static final int anInt4312 = 262144;
   public static final int anInt4313 = 4194304;
   public static final int anInt4314 = 8;
   public static final int anInt4315 = 1048576;
   public static final int anInt4316 = 64;
   public static final int anInt4317 = 32;
   public static final int anInt4318 = 65536;
   public static final int anInt4319 = 4194304;
   public static final int anInt4320 = 128;
   public static final int anInt4321 = 8388608;
   public static final int anInt4322 = 4;
   public static final int anInt4323 = 2;
   public static final int anInt4324 = 4096;
   public static final int anInt4325 = 1024;
   public static final int anInt4326 = 2048;
   public static final int anInt4327 = 16;
   public static final int anInt4328 = 1024;
   public static final int anInt4329 = 16384;
   public static final int anInt4330 = 512;
   public static final int anInt4331 = 16777216;
   public static final int anInt4332 = 8388608;
   public static final int anInt4333 = 1;
   public static final int anInt4334 = 262144;
   public static final int anInt4335 = 524288;
   public static final int anInt4336 = 65536;
   public static final int anInt4337 = 2097152;
   public static final int anInt4338 = 524288;
   public static final int anInt4339 = 134217728;
   public static final int anInt4340 = 33554432;
   public static final int anInt4341 = 1;
   public static final int anInt4342 = 67108864;
   public static final int anInt4343 = 536870912;
   public static final int anInt4344 = 16;

   Class407() throws Throwable {
      throw new Error();
   }

   static final void method4878(InterfaceDef var0, int var1, byte[] var2, byte[] var3, Class681 var4, int var5) {
      if(var0.aByteArrayArray2584 == null) {
         if(null == var2) {
            return;
         }

         var0.aByteArrayArray2584 = new byte[11][];
         var0.aByteArrayArray2585 = new byte[11][];
         var0.anIntArray2609 = new int[11];
         var0.anIntArray2587 = new int[11];
         var0.anIntArray2588 = new int[11];
      }

      var0.aByteArrayArray2584[var1] = var2;
      if(var2 != null) {
         var0.aBool2583 = true;
      } else {
         var0.aBool2583 = false;

         for(int var6 = 0; var6 < var0.aByteArrayArray2584.length; ++var6) {
            if(var0.aByteArrayArray2584[var6] != null || var0.anIntArray2588[var6] > 0) {
               var0.aBool2583 = true;
               break;
            }
         }
      }

      var0.aByteArrayArray2585[var1] = var3;
   }

   static final void method4879(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class318_Sub2.method9085(var2, var3, true, (byte)125);
   }

   static void method4880(Class174 var0, int var1, int var2, InterfaceDef var3, int var4, short var5) {
      for(int var6 = 7; var6 >= 0; --var6) {
         for(int var7 = 127; var7 >= 0; --var7) {
            int var8 = (var4 & 63) << 10 | (var6 & 7) << 7 | var7 & 127;
            Class654.method7818(false, true, (byte)85);
            int var9 = Class87.anIntArray855[var8];
            Class596.method7055(false, true, 1135523663);
            var0.method2290((var7 * -99858407 * var3.anInt2510 >> 7) + var1, ((7 - var6) * var3.anInt2576 * -667181623 >> 3) + var2, (var3.anInt2510 * -99858407 >> 7) + 1, (var3.anInt2576 * -667181623 >> 3) + 1, -16777216 | var9, 0);
         }
      }

   }

   static final void method4881(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3114((byte)4).getId();
   }
}
