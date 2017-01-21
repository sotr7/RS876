package com.jagex;

import com.jagex.Class198;
import com.jagex.Class230;
import com.jagex.Class387;
import com.jagex.Class413;
import com.jagex.Class521;
import com.jagex.Class566;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class704;
import com.jagex.client;
import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class384 {
   static Class384 aClass384_3959 = new Class384();
   static Class384 aClass384_3958 = new Class384();
   static Class384 aClass384_3957 = new Class384();

   public int method4724(int var1, int var2) {
      int var3 = Class566.anInt7611 * 1895615023 > var2?Class566.anInt7611 * 1895615023:var2;
      return aClass384_3959 == this?0:(this == aClass384_3957?var3 - var1:(aClass384_3958 == this?(var3 - var1) / 2:0));
   }

   public int method4725(int var1, int var2, byte var3) {
      int var4 = Class566.anInt7611 * 1895615023 > var2?Class566.anInt7611 * 1895615023:var2;
      return aClass384_3959 == this?0:(this == aClass384_3957?var4 - var1:(aClass384_3958 == this?(var4 - var1) / 2:0));
   }

   static void method4726(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      TwitchWebcamDevice var3 = Class198.method2847(var2, -2021824337);
      if(var3 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.method1242();
      }

   }

   static final void method4727(Class639_Sub1_Sub2_Sub1 var0, byte var1) {
      Class704 var2 = var0.aClass704_11915;
      if(client.anInt11012 == 1228606331 * var0.anInt11924 || !var2.method8218((byte)-124) || var2.method8234(1, (byte)-57)) {
         int var3 = var0.anInt11924 * 1228606331 - -1021573293 * var0.anInt11923;
         int var4 = client.anInt11012 - -1021573293 * var0.anInt11923;
         int var5 = 195925504 * var0.anInt11912 + var0.method10781(-627148024) * 256;
         int var6 = var0.anInt11919 * 426277376 + var0.method10781(-627148024) * 256;
         int var7 = var0.anInt11920 * -1971714560 + var0.method10781(-627148024) * 256;
         int var8 = var0.anInt11954 * -1001752064 + var0.method10781(-627148024) * 256;
         int var9 = (var5 * (var3 - var4) + var4 * var7) / var3;
         int var10 = (var8 * var4 + (var3 - var4) * var6) / var3;
         int var11 = Class387.method4762(var9, var10, var0.anInt11921 * 1480241191, 1933496102);
         int var12 = Class387.method4762(var7, var8, var0.anInt11922 * -24421557, 1318468657);
         int var13 = (var12 * var4 + (var3 - var4) * var11) / var3;
         var0.method7618((float)var9, (float)var13, (float)var10);
      }

      var0.anInt11957 = 0;
      var0.turn(var0.anInt11925 * 660870405, false, -95090002);
   }

   static void method4728(int var0) {
      if(Class684.aClass684_8662 != Class521.aClass684_7051) {
         Class413.aClass413_4442.method4915((byte)1);
      }
   }

   static final void method4729(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3109(1969005290) == var2?1:0;
   }

   static final void method4730(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub29_10631.method10105((byte)7);
   }

   static final void method4731(Class681 var0, int var1) {
      var0.anInt8630 -= -2069360090;
      if(var0.aLongArray8626[var0.anInt8630 * -1032509157] <= var0.aLongArray8626[1 + var0.anInt8630 * -1032509157]) {
         var0.anInt8644 += var0.anIntArray8642[-244840757 * var0.anInt8644] * -873681181;
      }

   }
}
