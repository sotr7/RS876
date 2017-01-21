package com.jagex;

import com.jagex.Class163;
import com.jagex.Class230;
import com.jagex.Class273;
import com.jagex.Class358;
import com.jagex.Class452_Sub5;
import com.jagex.Class497;
import com.jagex.Class554;
import com.jagex.Class681;
import com.jagex.client;

public class Class47 {
   public static Class163 aClass163_643;

   Class47() throws Throwable {
      throw new Error();
   }

   static final void method928(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class497.aString5565.startsWith("linux")?1:0;
   }

   public static void method929(boolean var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10619, 1, (short)-15722);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10627, 1, (short)-10390);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub11_10609, 0, (short)-26355);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub15_10610, 0, (short)-29081);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub31_10635, 0, (short)-20565);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub39_10617, 0, (short)-5205);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub20_10616, 0, (short)-3675);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub3_10644, 0, (short)-4727);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub1_10622, 0, (short)-17869);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub17_10601, 0, (short)-9424);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub9_10618, 0, (short)-3729);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub16_10634, 0, (short)-26407);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10608, 0, (short)-6028);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10645, 0, (short)-15135);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub8_10625, 0, (short)-264);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub12_10613, 676914057 * Class273.aClass273_3000.anInt3006, (short)-6684);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub26_10611, 0, (short)-1323);
      if(null != Class554.aClass174_7475 && Class554.aClass174_7475.method2240() && Class554.aClass174_7475.method2548()) {
         Class554.aClass174_7475.method2604();
      }

      Class230.preferences.method9602(Class230.preferences.aClass711_Sub21_10629, 0, (short)-30094);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub42_10607, 0, (short)-11461);
      Class358.method4586((byte)2);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub43_10628, 2, (short)-10635);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub27_10648, 1, (short)-55);
      Class452_Sub5.method9307(1748782178);
      client.aClass505_11204.method6100((byte)-5).method7377((byte)0);
      client.aBool11104 = true;
   }

   static final String method930(String var0, String var1, String var2, int var3) {
      for(int var4 = var0.indexOf(var1); -1 != var4; var4 = var0.indexOf(var1, var4 + var2.length())) {
         var0 = var0.substring(0, var4) + var2 + var0.substring(var4 + var1.length());
      }

      return var0;
   }
}
