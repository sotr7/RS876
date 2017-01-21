package com.jagex;

import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class704;
import com.jagex.Class704_Sub2;

public class Class510 {
   public int anInt6981;
   public int anInt6982;
   public int anInt6983;
   public static short[][][] aShortArrayArrayArray6984;
   static int anInt6985;
   public int anInt6980 = -2069804113;
   public Class704 aClass704_6979;

   Class510(Class639_Sub1_Sub2_Sub1 var1) {
      this.aClass704_6979 = new Class704_Sub2(var1, false);
   }

   public static int method6167(Class440 var0, int var1) {
      Class446 var2 = Class446.method5309(0.0F, 0.0F, 1.0F);
      var2.method5286(var0);
      double var3 = Math.atan2((double)var2.aFloat4917, (double)var2.aFloat4919);
      var2.method5278();
      if(var3 < 0.0D) {
         var3 = 3.141592653589793D + var3 + 3.141592653589793D;
      }

      return (int)(16384.0D * (var3 / 6.283185307179586D)) & 16383;
   }
}
