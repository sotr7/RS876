package com.jagex;

import com.jagex.Class1;
import com.jagex.InterfaceDef;
import com.jagex.Class304_Sub1;
import com.jagex.Class442;
import com.jagex.Class627;
import com.jagex.Class681;
import com.jagex.client;

public class Class295 {
   public static Class295 aClass295_3190 = new Class295(0);
   public static Class295 aClass295_3191 = new Class295(1);
   int anInt3192;

   Class295(int var1) {
      this.anInt3192 = 95794751 * var1;
   }

   static final void method3962(InterfaceDef var0, Class681 var1, byte var2) {
      Class1 var3 = var0.method3347(Class627.aClass418_8195, client.anInterface51_11046, 951015941);
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      int var5 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      int var6 = var3.method508(var0.aString2575, -99858407 * var0.anInt2510, 1371005853 * var0.anInt2488, var5, var4, Class442.aClass153Array4878, -892389297);
      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var6;
   }

   static final void method3963(Class681 var0, int var1) {
      Class304_Sub1.method9087(var0.aClass639_Sub1_Sub4_Sub1_8637, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], true, (byte)6);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[0];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[2];
   }
}
