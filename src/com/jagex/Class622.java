package com.jagex;

import com.jagex.Class116;
import com.jagex.Class162;
import com.jagex.Class171;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class455;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class526_Sub29;
import com.jagex.Class541;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class71;
import com.jagex.Interface67;
import com.jagex.client;

public class Class622 {
   public static Class455 aClass455_8143;
   public int anInt8139;
   public static Class622 aClass622_8132 = new Class622(1);
   static Class622 aClass622_8140 = new Class622(2);
   static Class622 aClass622_8134 = new Class622(3);
   public static Class622 aClass622_8135 = new Class622(4);
   static Class622 aClass622_8136 = new Class622(5);
   static Class622 aClass622_8137 = new Class622(6);
   static Class622 aClass622_8138 = new Class622(7);
   static Class622 aClass622_8133 = new Class622(8);
   static Class622 aClass622_8141 = new Class622(9);
   static Class622 aClass622_8142 = new Class622(10);

   Class622(int var1) {
      this.anInt8139 = var1 * -1368021249;
   }

   static void method7354(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[540934629 * var0.anInt8625];
      String var3 = (String)var0.anObjectArray8624[1 + var0.anInt8625 * 540934629];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class162.method1892(var2, var3, (short)255);
   }

   static final void method7355(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)11);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class541.method6475(var3, var4, var0, (byte)-10);
   }

   static final void method7356(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2522 * -1379784909;
   }

   static final void method7357(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      method7359(var2 >> 14 & 16383, var2 & 16383, (byte)-18);
   }

   static boolean method7358(Interface67 var0, Class526_Sub29 var1, int var2) {
      return null != var0 && var0.method434(var1, client.anInterface63Array11010, 1880027675 * client.anInt11034, Class171.aClass553_2016, -852904561);
   }

   public static void method7359(int var0, int var1, byte var2) {
      Class71.anInt800 = (var0 - Class525_Sub1.anInt7107) * -521323797;
      Class116.anInt1438 = -168152273 * (var1 - Class525_Sub1.anInt7150);
      Class525_Sub1.anInt10710 = 608366201;
      Class525_Sub1.anInt10711 = -805427121;
      Class526_Sub21_Sub2.method10420(91699771);
   }

   static final void method7360(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub1_10622.method9805(-751289147);
   }
}
