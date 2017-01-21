package com.jagex;

import com.jagex.Class144;
import com.jagex.Class162;
import com.jagex.Class166;
import com.jagex.Class174_Sub3;
import com.jagex.Interface38;

public class Class162_Sub3 extends Class162 {
   Interface38 anInterface38_9359;

   static Class162_Sub3 method8550(Class174_Sub3 var0, int var1, int var2, int[] var3, int[] var4) {
      int var6;
      int var7;
      int var8;
      if(var0.method8744(Class144.aClass144_1681, Class166.aClass166_1884)) {
         byte[] var9 = new byte[var1 * var2];

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = var6 * var1 + var3[var6];

            for(var8 = 0; var8 < var4[var6]; ++var8) {
               var9[var7++] = -1;
            }
         }

         return new Class162_Sub3(var0, var1, var2, var9);
      } else {
         int[] var5 = new int[var1 * var2];

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = var6 * var1 + var3[var6];

            for(var8 = 0; var8 < var4[var6]; ++var8) {
               var5[var7++] = -16777216;
            }
         }

         return new Class162_Sub3(var0, var1, var2, var5);
      }
   }

   Class162_Sub3(Class174_Sub3 var1, int var2, int var3, int[] var4) {
      this.anInterface38_9359 = var1.method8906(var2, var3, false, var4);
      this.anInterface38_9359.method254(false, false);
   }

   Class162_Sub3(Class174_Sub3 var1, int var2, int var3, byte[] var4) {
      this.anInterface38_9359 = var1.method8740(Class144.aClass144_1681, var2, var3, false, var4);
      this.anInterface38_9359.method254(false, false);
   }
}
