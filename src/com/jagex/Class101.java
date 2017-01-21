package com.jagex;

import com.jagex.Class1;
import com.jagex.Class113;
import com.jagex.Class173;
import com.jagex.Class173_Sub2;
import com.jagex.Class181;
import com.jagex.Class221;
import com.jagex.Class234;
import com.jagex.Class235;
import com.jagex.Class238;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class256;
import com.jagex.Class301;
import com.jagex.Class315_Sub1;
import com.jagex.Class376;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class526_Sub21_Sub14;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.RSSocket;
import com.jagex.Class627;
import com.jagex.Class642;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class687;
import com.jagex.Class695;
import com.jagex.client;

public class Class101 {
   static int anInt1207;
   static Class389 aClass389_1208;
   static int anInt1210;
   static int anInt1211;
   static int anInt1212;
   static int anInt1214;
   static Class384 aClass384_1215;
   static Class526_Sub21_Sub17 aClass526_Sub21_Sub17_1216;
   static Class173 aClass173_1213;
   static Class1 aClass1_1209;

   Class101() throws Throwable {
      throw new Error();
   }

   static boolean method1285() {
      boolean var0 = true;
      if(null == aClass173_1213) {
         if(Class113.aClass466_1370.method5537(Class234.anInt2389 * 1100539537, (byte)119)) {
            aClass173_1213 = Class181.method2680(Class113.aClass466_1370, 1100539537 * Class234.anInt2389);
         } else {
            var0 = false;
         }
      }

      if(null == Class526_Sub21_Sub14.aClass173_11824) {
         if(Class113.aClass466_1370.method5537(-725313465 * Class695.anInt8753, (byte)38)) {
            Class526_Sub21_Sub14.aClass173_11824 = Class181.method2680(Class113.aClass466_1370, Class695.anInt8753 * -725313465);
         } else {
            var0 = false;
         }
      }

      if(null == Class687.aClass173_8678) {
         if(Class113.aClass466_1370.method5537(Class235.anInt2390 * 1826443167, (byte)76)) {
            Class687.aClass173_8678 = Class181.method2680(Class113.aClass466_1370, 1826443167 * Class235.anInt2390);
         } else {
            var0 = false;
         }
      }

      if(null == aClass1_1209) {
         if(Class642.aClass466_8429.method5537(anInt1212 * 1794949691, (byte)83)) {
            aClass1_1209 = Class627.aClass418_8195.method4964(client.anInterface51_11046, 1794949691 * anInt1212, (byte)2);
         } else {
            var0 = false;
         }
      }

      if(Class376.aClass173_Sub2Array3912 == null) {
         if(Class113.aClass466_1370.method5537(anInt1212 * 1794949691, (byte)60)) {
            Class376.aClass173_Sub2Array3912 = (Class173_Sub2[])((Class173_Sub2[])Class181.method2682(Class113.aClass466_1370, 1794949691 * anInt1212));
         } else {
            var0 = false;
         }
      }

      return var0;
   }

   public static Class301 method1286(int var0, int var1) {
      Class301[] var2 = Class238.method3303(-930904095);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class301 var4 = var2[var3];
         if(var0 == var4.anInt3258 * -1289875181) {
            return var4;
         }
      }

      return null;
   }

   static final void method1287(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)84);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      RSSocket.method550(var3, var4, var0, (byte)-108);
   }

   static final void method1288(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class256.method3505(var3, var4, var0, -500201829);
   }

   static final void method1289(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -667181623 * var3.anInt2576;
   }
}
