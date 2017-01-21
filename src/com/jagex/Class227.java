package com.jagex;

import com.jagex.Class11;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class40_Sub16;
import com.jagex.Class448_Sub1;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;
import com.jagex.Interface26;

public class Class227 implements Interface26 {
   public static Class40_Sub16 aClass40_Sub16_2327;
   // $FF: synthetic field
   Class232 this$0;
   int anInt2326;

   Class227(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2326 = var2.readUnsignedShort(940310657) * -350679527;
   }

   public void method166(Class223 var1) {
      var1.method3106(505310761 * this.anInt2326, 50258774);
      var1.method3122(505310761 * this.anInt2326, (byte)104);
   }

   public void method168(Class223 var1, byte var2) {
      var1.method3106(505310761 * this.anInt2326, 1785828006);
      var1.method3122(505310761 * this.anInt2326, (byte)65);
   }

   public void method167(Class223 var1) {
      var1.method3106(505310761 * this.anInt2326, 489714390);
      var1.method3122(505310761 * this.anInt2326, (byte)5);
   }

   public void method165(Class223 var1) {
      var1.method3106(505310761 * this.anInt2326, -56566474);
      var1.method3122(505310761 * this.anInt2326, (byte)118);
   }

   public void method169(Class223 var1) {
      var1.method3106(505310761 * this.anInt2326, -2084075929);
      var1.method3122(505310761 * this.anInt2326, (byte)62);
   }

   static final void method3171(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var0.aBool2586 = false;
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method3172(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -1420975575)).anInt91 * -1594465065;
   }
}
