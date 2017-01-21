package com.jagex;

import com.jagex.Class195;
import com.jagex.Class221;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class298;
import com.jagex.Class315_Sub1;
import com.jagex.Class681;
import com.jagex.Class689_Sub2;
import com.jagex.Class73;
import com.jagex.Class93;
import java.util.HashMap;
import java.util.Map;

public class Class674 {
   static Map aMap8582 = new HashMap();

   Class674() throws Throwable {
      throw new Error();
   }

   static final void method8006(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)42);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class242.method3323(var3, var4, var0, (byte)-6);
   }

   static final void method8007(Class681 var0, byte var1) {
      if(Class195.aClass292_Sub1_2182.method3940(1496556403) != Class298.aClass298_3241) {
         throw new RuntimeException();
      } else {
         ((Class689_Sub2)Class195.aClass292_Sub1_2182.method3938((byte)-112)).method10213(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], -1432315596);
      }
   }

   public static String method8008(long var0, int var2, int var3) {
      Class258.method3514(var0);
      int var4 = Class93.aCalendar899.get(5);
      int var5 = Class93.aCalendar899.get(2);
      int var6 = Class93.aCalendar899.get(1);
      return var2 == 3?Class73.method1111(var0, var2, 1978007951):Integer.toString(var4 / 10) + var4 % 10 + "-" + Class93.aStringArrayArray900[var2][var5] + "-" + var6;
   }
}
