package com.jagex;

import com.jagex.Class149;
import com.jagex.Class221;
import com.jagex.Class228;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class261;
import com.jagex.Class273;
import com.jagex.Class28;
import com.jagex.Class315_Sub1;
import com.jagex.Class395;
import com.jagex.Class466;
import com.jagex.Class471;
import com.jagex.RSByteBuffer;
import com.jagex.Class589;
import com.jagex.Class615;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class70;
import com.jagex.Class90;
import com.jagex.Exception_Sub1;
import com.jagex.Interface11;

final class Class484 implements Interface11 {
   public static String aString5485;

   public Object method80(RSByteBuffer var1) {
      return Integer.valueOf(var1.readInt((byte)5));
   }

   public Object method75(RSByteBuffer var1, short var2) {
      return Integer.valueOf(var1.readInt((byte)5));
   }

   public Object method76(RSByteBuffer var1) {
      return Integer.valueOf(var1.readInt((byte)5));
   }

   public Object method79(RSByteBuffer var1) {
      return Integer.valueOf(var1.readInt((byte)5));
   }

   public Object method78(RSByteBuffer var1) {
      return Integer.valueOf(var1.readInt((byte)5));
   }

   public Object method77(RSByteBuffer var1) {
      return Integer.valueOf(var1.readInt((byte)5));
   }

   public static int method5832(Class466 var0, byte var1) {
      int var2 = 0;
      if(var0.method5537(Class471.anInt5359 * 832994071, (byte)39)) {
         ++var2;
      }

      if(var0.method5537(Class28.anInt252 * 1770162689, (byte)124)) {
         ++var2;
      }

      if(var0.method5537(Class395.anInt4111 * -1395486763, (byte)87)) {
         ++var2;
      }

      if(var0.method5537(-1857060869 * Class28.anInt256, (byte)91)) {
         ++var2;
      }

      if(var0.method5537(Class70.anInt789 * -778661863, (byte)113)) {
         ++var2;
      }

      if(var0.method5537(1281428195 * Class589.anInt7802, (byte)98)) {
         ++var2;
      }

      if(var0.method5537(Exception_Sub1.anInt11343 * -1085295857, (byte)47)) {
         ++var2;
      }

      if(var0.method5537(Class273.anInt3008 * 369672787, (byte)82)) {
         ++var2;
      }

      if(var0.method5537(159673839 * Class28.anInt257, (byte)53)) {
         ++var2;
      }

      if(var0.method5537(943002075 * Class90.anInt860, (byte)41)) {
         ++var2;
      }

      return var2;
   }

   static final void method5833(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)67);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class261.method3536(var3, var4, var0, (byte)72);
   }

   static final void method5834(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class228.method3174(var3, var4, var0, 1275786928);
   }

   static final void method5835(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2491 = Class615.method7280(var4, var2, -2119892712);
      var0.aBool2560 = true;
   }

   static final void method5836(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2520 * 480812513;
   }

   static final void method5837(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 / var3;
   }

   static final void method5838(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 420170157 * var0.aClass348_8633.anInt3637;
   }

   static final void method5839(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class690.method8098(7, var2, var3, "", -1817535866);
   }
}
