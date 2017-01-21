package com.jagex;

import com.jagex.Class218;
import com.jagex.Class271;
import com.jagex.Class417;
import com.jagex.Class424;
import com.jagex.Class480;
import com.jagex.RSByteBuffer;
import com.jagex.Class55;
import com.jagex.Class57;
import com.jagex.Class585;
import com.jagex.Class593;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.Class97_Sub1_Sub2;
import com.jagex.Interface11;
import com.jagex.twitchtv.TwitchEventResult;

final class Class476 implements Interface11 {
   public static Class97_Sub1_Sub2 aClass97_Sub1_Sub2_5386;
   static Class55 aClass55_5387;
   static int anInt5388;

   public Object method80(RSByteBuffer var1) {
      return Long.valueOf(var1.method9663(565007953));
   }

   public Object method75(RSByteBuffer var1, short var2) {
      return Long.valueOf(var1.method9663(1529208593));
   }

   public Object method76(RSByteBuffer var1) {
      return Long.valueOf(var1.method9663(34031787));
   }

   public Object method79(RSByteBuffer var1) {
      return Long.valueOf(var1.method9663(1187878705));
   }

   public Object method78(RSByteBuffer var1) {
      return Long.valueOf(var1.method9663(745227304));
   }

   public Object method77(RSByteBuffer var1) {
      return Long.valueOf(var1.method9663(806439598));
   }

   static final void method5655(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class424.method5002(var2, (byte)-71);
   }

   static final void method5656(Class681 var0, byte var1) {
      var0.anInt8623 -= -1957887669;
   }

   static boolean method5657(int var0) {
      return null != Class57.aClass44_687;
   }

   static void method5658(int var0, int var1, byte var2) {
      TwitchEventResult var3 = new TwitchEventResult(var0, var1);
      Class585 var4 = var3.method4883();
      if(null != var4) {
         Class480.method5754(var4.getId(), var3, 2115808877);
      }

   }

   static final void method5659(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class593.method7030((char)var2, -494719918)?1:0;
   }

   public static int method5660(CharSequence var0, CharSequence var1, Class673 var2, int var3) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;
      char var9 = 0;

      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if(var6 - var8 >= var4) {
            return -1;
         }

         if(var7 - var9 >= var5) {
            return 1;
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         char var11;
         if(var9 != 0) {
            var11 = var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         var8 = Class417.method4941(var10, -1293544973);
         var9 = Class417.method4941(var11, -1293544973);
         var10 = Class218.method3034(var10, var2, 1961409229);
         var11 = Class218.method3034(var11, var2, 1961409229);
         if(var10 != var11 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if(var10 != var11) {
               return Class271.method3601(var10, var2, 451331170) - Class271.method3601(var11, var2, 790250005);
            }
         }
      }

      int var17 = Math.min(var4, var5);

      char var13;
      int var18;
      for(var18 = 0; var18 < var17; ++var18) {
         if(Class673.aClass673_8570 == var2) {
            var6 = var4 - 1 - var18;
            var7 = var5 - 1 - var18;
         } else {
            var7 = var18;
            var6 = var18;
         }

         char var12 = var0.charAt(var6);
         var13 = var1.charAt(var7);
         if(var12 != var13 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
            var12 = Character.toLowerCase(var12);
            var13 = Character.toLowerCase(var13);
            if(var12 != var13) {
               return Class271.method3601(var12, var2, 1325656838) - Class271.method3601(var13, var2, -485157055);
            }
         }
      }

      var18 = var4 - var5;
      if(0 != var18) {
         return var18;
      } else {
         for(int var19 = 0; var19 < var17; ++var19) {
            var13 = var0.charAt(var19);
            char var14 = var1.charAt(var19);
            if(var13 != var14) {
               return Class271.method3601(var13, var2, 912724401) - Class271.method3601(var14, var2, -1179089977);
            }
         }

         return 0;
      }
   }
}
