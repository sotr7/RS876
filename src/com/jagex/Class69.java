package com.jagex;

import com.jagex.Class10;
import com.jagex.Class103;
import com.jagex.Class109;
import com.jagex.Class116;
import com.jagex.Class17;
import com.jagex.Class174;
import com.jagex.Class18;
import com.jagex.Class199_Sub19;
import com.jagex.Class199_Sub3;
import com.jagex.Class199_Sub9;
import com.jagex.Class212;
import com.jagex.Class219;
import com.jagex.Class304_Sub1;
import com.jagex.Class328;
import com.jagex.Class387;
import com.jagex.Class40_Sub2;
import com.jagex.Class422;
import com.jagex.Class443;
import com.jagex.Class454;
import com.jagex.Class47;
import com.jagex.Class5;
import com.jagex.Class506;
import com.jagex.Class566;
import com.jagex.Class569;
import com.jagex.Class607;
import com.jagex.Class609;
import com.jagex.Class613;
import com.jagex.Class639_Sub1_Sub5_Sub1;
import com.jagex.Class666;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class72;
import com.jagex.Class77;
import com.jagex.Class97_Sub1;
import com.jagex.Interface28;
import com.jagex.client;

final class Class69 implements Interface28 {
   public Class97_Sub1 method171(int var1) {
      return Class103.aClass97_Sub1_Sub2_1277;
   }

   public Class97_Sub1 method174() {
      return Class103.aClass97_Sub1_Sub2_1277;
   }

   public Class97_Sub1 method181() {
      return Class506.aClass97_Sub1_Sub1_5698;
   }

   public Class97_Sub1 method172(short var1) {
      return Class506.aClass97_Sub1_Sub1_5698;
   }

   public Class607 method173(int var1) {
      return Class109.aClass607_1322;
   }

   public Class607 method177() {
      return Class109.aClass607_1322;
   }

   public Class97_Sub1 method175() {
      return Class103.aClass97_Sub1_Sub2_1277;
   }

   public Class40_Sub2 method180(int var1) {
      return Class5.aClass40_Sub2_28;
   }

   public Class607 method170() {
      return Class109.aClass607_1322;
   }

   public Class607 method179() {
      return Class109.aClass607_1322;
   }

   public Class40_Sub2 method178() {
      return Class5.aClass40_Sub2_28;
   }

   public Class97_Sub1 method176() {
      return Class506.aClass97_Sub1_Sub1_5698;
   }

   public static String[] method1085(String var0, char var1, byte var2) {
      int var3 = Class613.method7238(var0, var1, (byte)43);
      String[] var4 = new String[1 + var3];
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < var3; ++var7) {
         int var8;
         for(var8 = var6; var0.charAt(var8) != var1; ++var8) {
            ;
         }

         var4[var5++] = var0.substring(var6, var8);
         var6 = 1 + var8;
      }

      var4[var3] = var0.substring(var6);
      return var4;
   }

   static final void method1086(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      int var5 = Class72.method1108(var3, -1550883225);
      int var6 = Class17.method625(var3, (byte)-68);
      Class18 var7 = (Class18)Class219.aClass40_2294.method89(var2, 73931736);
      Class77 var8 = (Class77)Class304_Sub1.aClass40_10066.method89(var5, -2059663584);
      Class454[] var9 = var8.aClass454ArrayArray815[var6];
      Object[] var10 = var7.method629(var6, -1741882824);
      if(var10 == null && var8.anObjectArrayArray814 != null) {
         var10 = var8.anObjectArrayArray814[var6];
      }

      int var11;
      if(var10 != null) {
         var11 = var10.length / var9.length;
         if(var4 >= 0 && var4 < var11) {
            for(int var14 = 0; var14 < var9.length; ++var14) {
               int var13 = var14 + var9.length * var4;
               if(Class454.aClass454_4997 == var9[var14]) {
                  var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var10[var13];
               } else {
                  var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Integer)var10[var13]).intValue();
               }
            }

         } else {
            throw new RuntimeException();
         }
      } else {
         for(var11 = 0; var11 < var9.length; ++var11) {
            Class454 var12 = var9[var11];
            if(Class454.aClass454_4997 == var12) {
               var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
            } else if(Class454.aClass454_5019 != var12 && var12 != Class454.aClass454_4962) {
               var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
            } else {
               var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
            }
         }

      }
   }

   public static char method1087(byte var0, short var1) {
      int var2 = var0 & 255;
      if(var2 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var2, 16));
      } else {
         if(var2 >= 128 && var2 < 160) {
            char var3 = Class666.aCharArray8526[var2 - 128];
            if(0 == var3) {
               var3 = 63;
            }

            var2 = var3;
         }

         return (char)var2;
      }
   }

   static void method1088(Class174 var0, byte var1) {
      if(Class328.method4200(938794190) && Class569.method6838(1184365425)) {
         Class387.method4763(0, 0, 1895615023 * Class566.anInt7611, 350, 22119035);
      }

      var0.method2538(0, 0, Class566.anInt7611 * 1895615023, 350);
      var0.method2290(0, 0, Class566.anInt7611 * 1895615023, 350, Class116.anInt1432 * -1447723823 << 24 | 3351159, 1);
      int var2;
      int var3;
      int var4;
      if(Class116.aBool1426) {
         for(var2 = 0; var2 < 100; ++var2) {
            var3 = Class212.anIntArray2265[var2] >> 4;
            var4 = Class116.anIntArray1425[var2] >> 4;
            var3 += Class443.anIntArray4895[((var3 & 64) + var4) * 64 & 16383] >> 10;
            if(var3 >= 0 && var3 >> 1 < Class199_Sub9.anIntArray9918.length && Class199_Sub9.anIntArray9918[var3 >> 1] >> 2 < 350 - var4) {
               var0.method2290(var3, var4, 2, 2, Class116.anIntArray1428[var2] << 24 | 16777215, 1);
            }
         }

         for(var2 = 0; var2 < Class199_Sub9.anIntArray9918.length; ++var2) {
            var3 = Class199_Sub9.anIntArray9918[var2] >> 2;
            var0.method2290(var2 << 1, 350 - var3, 2, var3, -2130706433, 1);
         }
      }

      var2 = 350 / (-1727542637 * Class116.anInt1421);
      if(-1674710087 * Class116.anInt1423 > 0) {
         var3 = 346 - -1727542637 * Class116.anInt1421 - 4;
         var4 = var2 * var3 / (-1674710087 * Class116.anInt1423 + var2 - 1);
         int var5 = 4;
         if(-1674710087 * Class116.anInt1423 > 1) {
            var5 += (var3 - var4) * (Class116.anInt1423 * -1674710087 - 1 - -56413471 * Class116.anInt1424) / (Class116.anInt1423 * -1674710087 - 1);
         }

         var0.method2290(1895615023 * Class566.anInt7611 - 16, var5, 12, var4, Class116.anInt1432 * -1447723823 << 24 | 3351159, 2);

         for(int var6 = -56413471 * Class116.anInt1424; var6 < Class116.anInt1424 * -56413471 + var2 && var6 < Class116.anInt1423 * -1674710087; ++var6) {
            String[] var7 = method1085(Class116.aStringArray1427[var6], '\b', (byte)7);
            int var8 = (Class566.anInt7611 * 1895615023 - 8 - 16) / var7.length;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               int var10 = var9 * var8 + 8;
               var0.method2538(var10, 0, var8 + var10 - 8, 350);
               Class422.aClass163_4740.method1895(Class639_Sub1_Sub5_Sub1.method10830(var7[var9], 1627350255), var10, 350 - -422968681 * Class116.anInt1434 - 2 - Class199_Sub3.aClass1_9887.anInt14 * -1329402501 - (var6 - -56413471 * Class116.anInt1424) * -1727542637 * Class116.anInt1421, -1, -16777216, 243641810);
            }
         }
      }

      Class47.aClass163_643.method1896("876 1", Class566.anInt7611 * 1895615023 - 25, 330, -1, -16777216, (byte)-89);
      var0.method2538(0, 0, Class566.anInt7611 * 1895615023, 350);
      var0.method2344(0, 350 - -422968681 * Class116.anInt1434, 1895615023 * Class566.anInt7611, -1, 1847381449);
      Class609.aClass163_7930.method1895("--> " + Class639_Sub1_Sub5_Sub1.method10830(Class116.aString1429, 1627350255), 10, 350 - -1329402501 * Class680.aClass1_8616.anInt14 - 1, -1, -16777216, -953252730);
      if(Class10.aBool64) {
         var3 = -1;
         if(client.anInt11012 % 30 > 15) {
            var3 = 16777215;
         }

         var0.method2288(10 + Class680.aClass1_8616.method509("--> " + Class639_Sub1_Sub5_Sub1.method10830(Class116.aString1429, 1627350255).substring(0, -2112692681 * Class116.anInt1431), 294581563), 350 - Class680.aClass1_8616.anInt14 * -1329402501 - 11, 12, var3, -720938557);
      }

      var0.method2278();
      Class199_Sub19.method9032(-263150978);
   }
}
