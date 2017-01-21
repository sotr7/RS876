package com.jagex;

import com.jagex.Class195;
import com.jagex.Class230;
import com.jagex.Class329_Sub3;
import com.jagex.Class531;
import com.jagex.Class681;
import com.jagex.Class74;
import com.jagex.client;

public class Class87 {
   public static int[] anIntArray855;
   boolean aBool856;
   Class74[] aClass74Array857;

   Class87(boolean var1, Class74[] var2) {
      this.aBool856 = var1;
      this.aClass74Array857 = var2;
   }

   static final void method1185(Class681 var0, byte var1) {
      if(!Class195.aClass292_Sub1_2182.method3914((byte)3).method4040((short)-19131)) {
         throw new RuntimeException();
      } else {
         Class329_Sub3 var2 = (Class329_Sub3)Class195.aClass292_Sub1_2182.method3941(-1138295927);
         var2.method9159(Class531.aClass432_7184, -1, 0.0F, 1420383699);
         client.aBool11070 = true;
      }
   }

   static final void method1186(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub3_10644.method9873(2001675419) == 1?1:0;
   }
}
