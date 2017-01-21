package com.jagex;

import com.jagex.OutFrame;
import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;

public class Class591 implements Interface76 {
   static Class591 aClass591_7806 = new Class591(0);
   static Class591 aClass591_7807 = new Class591(1);
   static Class591 aClass591_7808 = new Class591(2);
   int anInt7809;

   public int getId() {
      return -2109529405 * this.anInt7809;
   }

   Class591(int var1) {
      this.anInt7809 = var1 * -739959317;
   }

   public int method21() {
      return -2109529405 * this.anInt7809;
   }

   static final void method7013(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3049(837872681);
   }

   static void method7014(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = OutFrame.method4873((byte)-91);
   }
}
