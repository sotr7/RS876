package com.jagex;

import com.jagex.Class446;

public class Class436 {
   public static void method5149(Class446 var0, Class446 var1, Class446 var2, float var3, Class446[] var4) {
      Class446 var5 = Class446.method5275(var0, var2);
      float var6 = Class446.method5262(var5, var5) - var3 * var3;
      float var7 = Class446.method5262(var1, var5);
      float var8 = var7 * var7 - var6;
      if(var8 < 0.0F) {
         var4[1] = null;
         var4[0] = null;
      } else if(var8 >= 9.765625E-4F) {
         float var9 = (float)Math.sqrt((double)var8);
         var4[0] = Class446.method5312();
         var4[0].method5267(var0);
         var4[0].method5272(Class446.method5285(Class446.method5305(var1), -var7 - var9));
         var4[1] = Class446.method5312();
         var4[1].method5267(var0);
         var4[1].method5272(Class446.method5285(Class446.method5305(var1), -var7 + var9));
      } else {
         var4[0] = Class446.method5312();
         var4[0].method5267(var0);
         var4[0].method5272(Class446.method5285(Class446.method5305(var1), -var7));
         var4[1] = null;
      }

   }

   Class436() throws Throwable {
      throw new Error();
   }
}
