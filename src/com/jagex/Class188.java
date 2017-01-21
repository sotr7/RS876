package com.jagex;

import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class381;
import com.jagex.Class673;
import com.jagex.Class681;

public class Class188 {
   public static int anInt2147;
   static Class188 aClass188_2134 = new Class188();
   static Class188 aClass188_2146 = new Class188();
   static Class188 aClass188_2136 = new Class188();
   static Class188 aClass188_2137 = new Class188();
   static Class188 aClass188_2138 = new Class188();
   static Class188 aClass188_2139 = new Class188();
   static Class188 aClass188_2143 = new Class188();
   static Class188 aClass188_2141 = new Class188();
   public static Class188 aClass188_2135 = new Class188();
   public static Class188 aClass188_2142 = new Class188();
   static Class188 aClass188_2144 = new Class188();
   static Class188 aClass188_2145 = new Class188();
   static Class188 aClass188_2140 = new Class188();

   static final void method2735(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub30_10621.method10111(54645776) == 1?1:0;
   }

   static final void method2736(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method2737(Class681 var0, int var1) {
      if(Class673.aClass526_Sub9_8581 != null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
         var0.aClass526_Sub9_8646 = Class673.aClass526_Sub9_8581;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method2738(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)24);
      Class381.method4710(var3, var0, 126693539);
   }

   public static int method2739(CharSequence var0, CharSequence var1, int var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      if(0 == var3) {
         return var4;
      } else if(0 == var4) {
         return var3;
      } else {
         int[] var5 = new int[1 + var3];
         int[] var6 = new int[var3 + 1];

         int var7;
         for(var7 = 0; var7 <= var3; var5[var7] = var7++) {
            ;
         }

         for(var7 = 1; var7 <= var4; ++var7) {
            var6[0] = var7;
            char var8 = var1.charAt(var7 - 1);

            for(int var9 = 1; var9 <= var3; ++var9) {
               var6[var9] = Math.min(Math.min(1 + var6[var9 - 1], 1 + var5[var9]), var5[var9 - 1] + (var0.charAt(var9 - 1) == var8?0:1));
            }

            int[] var10 = var5;
            var5 = var6;
            var6 = var10;
         }

         return var5[var3];
      }
   }
}
