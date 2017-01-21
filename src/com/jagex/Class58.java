package com.jagex;

import com.jagex.Class108;
import com.jagex.Class149;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class309;
import com.jagex.Class315_Sub1;
import com.jagex.Class393;
import com.jagex.Class48;
import com.jagex.Class526_Sub29;
import com.jagex.Class615;
import com.jagex.Class646;
import com.jagex.Class681;
import com.jagex.Interface6;
import com.jagex.client;

public class Class58 {
   static int anInt721;
   Class48 aClass48_718;
   int anInt701;
   public static Class58 aClass58_706;
   public static Class58 aClass58_693;
   public static Class58 aClass58_694;
   public static Class58 aClass58_720;
   public static Class58 aClass58_696;
   public static Class58 aClass58_697;
   public static Class58 aClass58_698;
   public static Class58 aClass58_711;
   public static Class58 aClass58_700;
   public static Class58 aClass58_704;
   public static Class58 aClass58_699;
   public static Class58 aClass58_703;
   public static Class58 aClass58_719;
   public static Class58 aClass58_705;
   public static Class58 aClass58_712;
   public static Class58 aClass58_707;
   public static Class58 aClass58_708;
   public static Class58 aClass58_709;
   public static Class58 aClass58_710;
   public static Class58 aClass58_695;
   public static Class58 aClass58_692;
   public static Class58 aClass58_713;
   public static Class58 aClass58_714;
   public static Class58 aClass58_715;
   public static Class58 aClass58_716;
   public static Class58 aClass58_717;
   Interface6 anInterface6_702;

   public int method1018() {
      return 1192466495 * this.anInt701;
   }

   Class58(Class48 var1) {
      this.aClass48_718 = var1;
      this.anInt701 = 660363199;
   }

   public int method1019(int var1) {
      return 1192466495 * this.anInt701;
   }

   public void method1020(int var1, int var2) {
      this.anInt701 = var1 * 660363199;
   }

   public static Class58[] method1021(int var0) {
      return new Class58[]{aClass58_706, aClass58_693, aClass58_694, aClass58_720, aClass58_696, aClass58_697, aClass58_698, aClass58_711, aClass58_700, aClass58_704, aClass58_699, aClass58_703, aClass58_719, aClass58_705, aClass58_712, aClass58_707, aClass58_708, aClass58_709, aClass58_710, aClass58_695, aClass58_692, aClass58_713, aClass58_714, aClass58_715, aClass58_716, aClass58_717};
   }

   static final void method1022(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2581 = Class615.method7280(var4, var2, -1490741905);
      var0.aBool2560 = true;
   }

   static {
      aClass58_706 = new Class58(Class48.aClass48_647);
      aClass58_693 = new Class58(Class48.aClass48_645);
      aClass58_694 = new Class58(Class48.aClass48_645);
      aClass58_720 = new Class58(Class48.aClass48_645);
      aClass58_696 = new Class58(Class48.aClass48_645);
      aClass58_697 = new Class58(Class48.aClass48_645);
      aClass58_698 = new Class58(Class48.aClass48_647);
      aClass58_711 = new Class58(Class48.aClass48_647);
      aClass58_700 = new Class58(Class48.aClass48_647);
      aClass58_704 = new Class58(Class48.aClass48_647);
      aClass58_699 = new Class58(Class48.aClass48_647);
      aClass58_703 = new Class58(Class48.aClass48_647);
      aClass58_719 = new Class58(Class48.aClass48_647);
      aClass58_705 = new Class58(Class48.aClass48_647);
      aClass58_712 = new Class58(Class48.aClass48_647);
      aClass58_707 = new Class58(Class48.aClass48_647);
      aClass58_708 = new Class58(Class48.aClass48_647);
      aClass58_709 = new Class58(Class48.aClass48_647);
      aClass58_710 = new Class58(Class48.aClass48_647);
      aClass58_695 = new Class58(Class48.aClass48_647);
      aClass58_692 = new Class58(Class48.aClass48_647);
      aClass58_713 = new Class58(Class48.aClass48_644);
      aClass58_714 = new Class58(Class48.aClass48_647);
      aClass58_715 = new Class58(Class48.aClass48_647);
      aClass58_716 = new Class58(Class48.aClass48_647);
      aClass58_717 = new Class58(Class48.aClass48_646);
   }

   static final void method1023(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-40);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class393.method4806(var3, var4, var0, (byte)12);
   }

   public void method1024(Interface6 var1, byte var2) {
      if(var1.method52((byte)118) != this.aClass48_718) {
         throw new IllegalArgumentException();
      } else {
         this.anInterface6_702 = var1;
      }
   }

   public Interface6 method1025(int var1) {
      return this.anInterface6_702;
   }

   public static void method1026(Class526_Sub29 var0, int var1) {
      if(!Class108.method1349(-558705405 * client.anInt11038, -1728513157)) {
         var0.method9533((byte)-31);
      } else {
         Class646.aClass654_Sub2_8449.method7814(var0, 1492786744);
      }
   }

   public void method1027(int var1) {
      this.anInt701 = var1 * 660363199;
   }

   public static int method1028(int var0) {
      return Class309.aClass290_3377.method3825((byte)98);
   }
}
