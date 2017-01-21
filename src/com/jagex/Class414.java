package com.jagex;

import com.jagex.Class149;
import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class497;
import com.jagex.Class681;

public class Class414 {
   static final int anInt4452 = 8;
   static final int anInt4453 = 7;
   static final int anInt4454 = 4;
   static final int anInt4455 = 6;
   static final int anInt4456 = 10;
   static final int anInt4457 = 1;
   static final int anInt4458 = 11;
   static final int anInt4459 = 13;
   static final int anInt4460 = 12;
   static final int anInt4461 = 2;
   static final int anInt4462 = 5;
   static final int anInt4463 = 9;
   static final int anInt4464 = 3;
   public static Class149 aClass149_4465;

   Class414() throws Throwable {
      throw new Error();
   }

   static final void method4928(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-1);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1115067825 * var3.anInt2611;
   }

   static String method4929(String var0, int var1) {
      return Class497.aString5565.startsWith("win")?var0 + ".dll":(Class497.aString5565.startsWith("linux")?"lib" + var0 + ".so":(Class497.aString5565.startsWith("mac")?"lib" + var0 + ".dylib":null));
   }
}
