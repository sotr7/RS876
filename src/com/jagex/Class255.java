package com.jagex;

import com.jagex.Class16;
import com.jagex.Class190;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class277;
import com.jagex.Class298;
import com.jagex.Class315_Sub1;
import com.jagex.Class348;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub38;
import com.jagex.Class540;
import com.jagex.Class605_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class707;
import com.jagex.Class710;
import com.jagex.Class711_Sub1;
import com.jagex.client;

public final class Class255 {
   static long aLong2809;
   static long aLong2810;

   public static final synchronized long method3491() {
      long var0 = System.currentTimeMillis();
      if(var0 < aLong2810 * -4941677083237658737L) {
         aLong2809 += (-4941677083237658737L * aLong2810 - var0) * 7093197192605850051L;
      }

      aLong2810 = var0 * -2620550993832841361L;
      return 659590140985007851L * aLong2809 + var0;
   }

   Class255() throws Throwable {
      throw new Error();
   }

   public static final synchronized long time(byte var0) {
      long var1 = System.currentTimeMillis();
      if(var1 < aLong2810 * -4941677083237658737L) {
         aLong2809 += (-4941677083237658737L * aLong2810 - var1) * 7093197192605850051L;
      }

      aLong2810 = var1 * -2620550993832841361L;
      return 659590140985007851L * aLong2809 + var1;
   }

   static void method3493(RSByteBuffer var0, byte var1) {
      for(int var2 = 0; var2 < Class190.anInt2167 * 841209115; ++var2) {
         int var3 = var0.readSmart(-333743478);
         int var4 = var0.readUnsignedShort(391962531);
         if(var4 == '\uffff') {
            var4 = -1;
         }

         if(null != Class707.aClass612_Sub1Array8837[var3]) {
            Class707.aClass612_Sub1Array8837[var3].anInt8027 = -2021253437 * var4;
         }
      }

   }

   static final void method3494(boolean var0, Class681 var1, byte var2) {
      int var3 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var4 = Class221.method3095(var3, (byte)10);
      Class243 var5 = Class315_Sub1.aClass243Array10033[var3 >> 16];
      if(var0) {
         Class711_Sub1.method9811(var5, var4, -1658566584);
      } else {
         Class298.method3980(var5, var4, -2140583011);
      }

   }

   static final void method3495(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class605_Sub1.method9744(var3, var4, var0, 2097960199);
   }

   static final void method3496(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = Class277.aClass56_3028.method994(var2, (byte)0).method10680(var3, (byte)8).anInt8211 * 2090725263;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
   }

   static final void method3497(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub16_10634.method9993(-586862990)?1:0;
   }

   public static void method3498(int var0, boolean var1, int var2, boolean var3, int var4) {
      Class540.method6457(0, Class16.aClass612_Sub1Array175.length - 1, var0, var1, var2, var3, 23301197);
      Class16.anInt173 = 0;
      Class16.aClass657_178 = null;
   }

   static final void method3499(Class526_Sub38 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(Class348.method4525(var1, (int[])null, -1145938164)) {
         if(null != var0 && !var0.method9728(1577302410)) {
            Class710.method8307(var0, true, false, (byte)-14);
         } else {
            Class243 var11 = Class315_Sub1.aClass243Array10033[var1];
            client.method10310(var11, var11.method3330((byte)-79), -1, var2, var3, var4, var5, var6, var7, var8, var9);
         }
      }
   }
}
