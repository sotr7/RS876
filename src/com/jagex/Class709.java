package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class40_Sub18;
import com.jagex.Class579;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.Interface65;
import com.jagex.Interface76;

public class Class709 implements Interface76 {
   public static Class40_Sub18 aClass40_Sub18_8849;
   public static Class709 aClass709_8847 = new Class709(-2);
   public static Class709 aClass709_8844 = new Class709(-3);
   static Class709 aClass709_8842 = new Class709(2);
   public static Class709 aClass709_8845 = new Class709(3);
   static Class709 aClass709_8846 = new Class709(21);
   static Class709 aClass709_8843 = new Class709(20);
   int anInt8848;

   public int getId() {
      return -416326215 * this.anInt8848;
   }

   Class709(int var1) {
      this.anInt8848 = var1 * 9017481;
   }

   public int method21() {
      return -416326215 * this.anInt8848;
   }

   static final void method8304(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)58);
      Class610.method7206(var3, var0, -311680794);
   }

   static void method8305(Interface65 var0, int var1) {
      while(Class579.aLinkedList7745.size() > 10) {
         Class579.aLinkedList7745.remove();
      }

      Class579.aLinkedList7745.add(var0);
   }

   static final void method8306(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-74);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class681.method8027(var3, var4, var0, 1683589071);
   }
}
