package com.jagex;

import com.jagex.Class169;
import com.jagex.Class174;
import com.jagex.Class255;
import com.jagex.Class361;
import com.jagex.Class466;
import com.jagex.Class547;
import com.jagex.Class681;
import com.jagex.Class72;
import com.jagex.Interface24;
import com.jagex.Interface46;
import com.jagex.Interface47;
import com.jagex.Interface49;
import java.awt.Canvas;

public final class Class8 {
   public static Class547 aClass547_45;

   Class8() throws Throwable {
      throw new Error();
   }

   public static int method558(int var0) {
      Canvas var1 = new Canvas();
      var1.setSize(100, 100);
      Class174 var2 = Class72.method1104(0, var1, (Class169)null, (Interface24)null, (Interface47)null, (Interface49)null, (Interface46)null, (Class466)null, 0, (byte)-118);
      long var3 = Class255.time((byte)24);

      int var5;
      for(var5 = 0; var5 < 10000; ++var5) {
         var2.method2285(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
      }

      var5 = (int)(Class255.time((byte)24) - var3);
      var2.method2356(0, 0, 100, 100, -16777216, (byte)87);
      var2.method2232(1135751733);
      return var5;
   }

   static void method559(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class361.method4620(-551374148);
   }
}
