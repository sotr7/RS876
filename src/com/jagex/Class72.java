package com.jagex;

import com.jagex.Class169;
import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class255;
import com.jagex.Class448_Sub1;
import com.jagex.Class466;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import com.jagex.Interface24;
import com.jagex.Interface46;
import com.jagex.Interface47;
import com.jagex.Interface49;
import com.jagex.client;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class72 {
   public static Class466 aClass466_801;

   public static int method1101() {
      Canvas var0 = new Canvas();
      var0.setSize(100, 100);
      Class174 var1 = method1104(0, var0, (Class169)null, (Interface24)null, (Interface47)null, (Interface49)null, (Interface46)null, (Class466)null, 0, (byte)-38);
      long var2 = Class255.time((byte)24);

      int var4;
      for(var4 = 0; var4 < 10000; ++var4) {
         var1.method2285(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
      }

      var4 = (int)(Class255.time((byte)24) - var2);
      var1.method2356(0, 0, 100, 100, -16777216, (byte)64);
      var1.method2232(1135751733);
      return var4;
   }

   Class72() throws Throwable {
      throw new Error();
   }

   static void method1102() {
   }

   public static int method1103() {
      Canvas var0 = new Canvas();
      var0.setSize(100, 100);
      Class174 var1 = method1104(0, var0, (Class169)null, (Interface24)null, (Interface47)null, (Interface49)null, (Interface46)null, (Class466)null, 0, (byte)-115);
      long var2 = Class255.time((byte)24);

      int var4;
      for(var4 = 0; var4 < 10000; ++var4) {
         var1.method2285(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
      }

      var4 = (int)(Class255.time((byte)24) - var2);
      var1.method2356(0, 0, 100, 100, -16777216, (byte)21);
      var1.method2232(1135751733);
      return var4;
   }

   public static Class174 method1104(int var0, Canvas var1, Class169 var2, Interface24 var3, Interface47 var4, Interface49 var5, Interface46 var6, Class466 var7, int var8, byte var9) {
      int var10 = 0;
      int var11 = 0;
      if(var1 != null) {
         Dimension var12 = var1.getSize();
         var10 = var12.width;
         var11 = var12.height;
      }

      return Class174.method2298(var0, var1, var2, var3, var4, var5, var6, var7, var8, var10, var11, 458329042);
   }

   static final void method1105(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      int var3 = Class448_Sub1.method9224(var2, -2039470746);
      if(var3 < 0) {
         throw new RuntimeException();
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3;
      }
   }

   static final void method1106(Class681 var0, int var1) throws Exception_Sub2 {
      Class195.aClass292_Sub1_2182.method3934((float)var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] / 1000.0F, 1389801428);
   }

   static final void method1107(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      Integer var5 = (Integer)client.aClass216_11301.method2969(var2, 1517212089).method3091(var3, var4, 1793345070);
      if(var5 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.intValue();
      }

   }

   public static int method1108(int var0, int var1) {
      return var0 >>> 8;
   }

   static final void method1109(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aShort11185;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aShort11277;
   }
}
