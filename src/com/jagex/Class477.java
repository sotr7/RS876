package com.jagex;

import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class32;
import com.jagex.Class40_Sub17;
import com.jagex.Class493;
import com.jagex.RSByteBuffer;
import com.jagex.Class564;
import com.jagex.Class593;
import com.jagex.Class681;
import com.jagex.Interface11;
import com.jagex.client;

final class Class477 implements Interface11 {
   public Object method76(RSByteBuffer var1) {
      return Class564.method6791(var1, (byte)2);
   }

   public Object method79(RSByteBuffer var1) {
      return Class564.method6791(var1, (byte)2);
   }

   public Object method75(RSByteBuffer var1, short var2) {
      return Class564.method6791(var1, (byte)2);
   }

   public Object method78(RSByteBuffer var1) {
      return Class564.method6791(var1, (byte)2);
   }

   public Object method80(RSByteBuffer var1) {
      return Class564.method6791(var1, (byte)2);
   }

   public Object method77(RSByteBuffer var1) {
      return Class564.method6791(var1, (byte)2);
   }

   static final void method5661(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-90);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class40_Sub17.method10295(var3, var4, var0, 1454578479);
   }

   static final void method5662(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.aBoolArray3628[var2]?1:0;
   }

   public static void method5663(int var0, String var1, boolean var2, byte var3) {
      if(Class493.method5891((byte)73)) {
         if(var0 != Class32.anInt312 * -577726201) {
            Class32.aLong313 = 8857201640932667085L;
         }

         Class32.anInt312 = var0 * -206732105;
         Class32.aString334 = var1;
         Class32.aBool309 = var2;
         client.aClass111_11059.method1369(1790609442);
         Class593.method7031(1, (byte)112);
      }
   }

   static final void method5664(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub42_10607.method10194((byte)27)?1:0;
   }
}
