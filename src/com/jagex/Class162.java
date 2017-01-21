package com.jagex;

import com.jagex.Class107;
import com.jagex.Class187;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class273;
import com.jagex.Class315_Sub1;
import com.jagex.Class358;
import com.jagex.Class451;
import com.jagex.Class452_Sub4;
import com.jagex.Class452_Sub5;
import com.jagex.Class507;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub9;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.Class94;
import com.jagex.client;

public abstract class Class162 {
   public static void method1885(byte var0) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10619, 2, (short)-881);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10627, 2, (short)-26908);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub11_10609, 1, (short)-27117);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub31_10635, 1, (short)-9503);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub39_10617, 1, (short)-3938);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub20_10616, 1, (short)-10267);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub3_10644, 1, (short)-17539);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub17_10601, 1, (short)-2945);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub1_10622, 1, (short)-7700);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub9_10618, 1, (short)-19087);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub16_10634, 0, (short)-5151);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub15_10610, 1, (short)-24490);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10608, 0, (short)-5943);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10645, 0, (short)-7665);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub8_10625, 1, (short)-24994);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub12_10613, Class273.aClass273_3000.anInt3006 * 676914057, (short)-31360);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub26_10611, 0, (short)-30414);
      if(Class554.aClass174_7475 != null && Class554.aClass174_7475.method2240() && Class554.aClass174_7475.method2548()) {
         Class554.aClass174_7475.method2604();
      }

      Class230.preferences.method9602(Class230.preferences.aClass711_Sub21_10629, 1, (short)-24112);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub42_10607, 1, (short)-112);
      Class358.method4586((byte)2);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub43_10628, 1, (short)-30337);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub27_10648, 3, (short)-4666);
      Class452_Sub5.method9307(1110224452);
      client.aClass505_11204.method6100((byte)59).method7377((byte)0);
      client.aBool11104 = true;
   }

   static final void method1886(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      if(null != Class451.localPlayer.aClass633_12181) {
         Class451.localPlayer.aClass633_12181.method7497(var2, var3, (byte)56);
      }
   }

   static final void method1887(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var2.anInt8623 -= 379191958;
      var0.anInt2512 = var2.anIntArray8622[var2.anInt8623 * -1730576285] * -743573325;
      var0.anInt2513 = var2.anIntArray8622[1 + var2.anInt8623 * -1730576285] * 570997175;
      Class526_Sub31.method9555(var0, (byte)10);
      Class187.method2730(var1, var0, (byte)98);
      if(-449120703 * var0.type == 0) {
         Class526_Sub9.method9361(var1, var0, false, (byte)86);
      }

   }

   static final void method1888(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)15);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >>> 16];
      InterfaceDef var5 = Class107.method1347(var4, var3, -1244032751);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = null == var5?-1:var5.uid * 919258769;
   }

   static final void method1889(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class451.localPlayer.method10796((byte)-65).method7047(118492360);
   }

   static final void method1890(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2968(var2, -1134529278);
   }

   static final void method1891(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub19_10632.method10021(1370824025)?1:0;
   }

   public static int method1892(String var0, String var1, short var2) {
      return !Class570.aBool7638?12:(Class452_Sub4.method9295((byte)127) != client.aClass111_11060?42:Class570.aTwitchTV7639.Login(var0, var1));
   }

   static final void method1893(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class94.anInt1156 * 1267003723;
   }

   static final void method1894(InterfaceDef var0, Class681 var1, int var2) {
      byte var3 = 10;
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      int var5 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      Class507.method6155(var0, var3, var4, var5, var1, -752831413);
   }
}
