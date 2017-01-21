package com.jagex;

import com.jagex.Class190;
import com.jagex.Class218;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.InterfaceDef;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface26;

public class Class212 implements Interface26 {
   static int[] anIntArray2265;
   // $FF: synthetic field
   Class232 this$0;
   int anInt2264;

   public void method168(Class223 var1, byte var2) {
      Class218 var3 = var1.method3122(1511325125 * this.anInt2264, (byte)76);
      var3.method3002((byte)41);
      var3.method2993((byte)0);
      var1.method3139(1511325125 * this.anInt2264, 438482393);
   }

   public void method166(Class223 var1) {
      Class218 var2 = var1.method3122(1511325125 * this.anInt2264, (byte)36);
      var2.method3002((byte)125);
      var2.method2993((byte)0);
      var1.method3139(1511325125 * this.anInt2264, -1394008977);
   }

   Class212(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2264 = var2.readUnsignedShort(911297522) * 567900429;
   }

   public void method167(Class223 var1) {
      Class218 var2 = var1.method3122(1511325125 * this.anInt2264, (byte)62);
      var2.method3002((byte)6);
      var2.method2993((byte)0);
      var1.method3139(1511325125 * this.anInt2264, 1270411304);
   }

   public void method165(Class223 var1) {
      Class218 var2 = var1.method3122(1511325125 * this.anInt2264, (byte)5);
      var2.method3002((byte)119);
      var2.method2993((byte)0);
      var1.method3139(1511325125 * this.anInt2264, 1216308836);
   }

   public void method169(Class223 var1) {
      Class218 var2 = var1.method3122(1511325125 * this.anInt2264, (byte)90);
      var2.method3002((byte)49);
      var2.method2993((byte)0);
      var1.method3139(1511325125 * this.anInt2264, 1191568283);
   }

   static final void method2945(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class190.method2759(var3, var0, -7665853);
   }
}
