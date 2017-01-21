package com.jagex;

import com.jagex.Class124_Sub1_Sub1;
import com.jagex.Class144;
import com.jagex.Class162;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;

public class Class162_Sub1 extends Class162 {
   Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9118;

   static Class162_Sub1 method8433(Class174_Sub2 var0, int var1, int var2, int[] var3, int[] var4) {
      byte[] var5 = new byte[var1 * var2];

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var6 * var1 + var3[var6];

         for(int var8 = 0; var8 < var4[var6]; ++var8) {
            var5[var7++] = -1;
         }
      }

      return new Class162_Sub1(var0, var1, var2, var5);
   }

   Class162_Sub1(Class174_Sub2 var1, int var2, int var3, byte[] var4) {
      this.aClass124_Sub1_Sub1_9118 = Class124_Sub1_Sub1.method10443(var1, Class144.aClass144_1681, Class166.aClass166_1884, var2, var3, false, var4, Class144.aClass144_1681);
      this.aClass124_Sub1_Sub1_9118.method8335(false, false);
   }
}
