package com.jagex;

import com.jagex.Class187;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class32;
import com.jagex.Class348;
import com.jagex.Class40;
import com.jagex.Class433;
import com.jagex.RSByteBuffer;
import com.jagex.Class656;
import com.jagex.Class681;
import com.jagex.Class711_Sub39;
import com.jagex.Interface18;
import com.jagex.Interface26;
import com.jagex.client;

public class Class219 implements Interface26 {
   static String aString2293;
   public static Class40 aClass40_2294;
   static int anInt2295;
   // $FF: synthetic field
   Class232 this$0;
   int anInt2291;
   int anInt2292;

   Class219(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2291 = var2.readUnsignedShort(1502576710) * 931187863;
      this.anInt2292 = var2.readUnsignedByte(-679252611) * -769439463;
   }

   public void method168(Class223 var1, byte var2) {
      var1.method3117(376402727 * this.anInt2291, -1406270679 * this.anInt2292, -2107515193);
      var1.method3122(376402727 * this.anInt2291, (byte)96).method3002((byte)77);
   }

   public void method166(Class223 var1) {
      var1.method3117(376402727 * this.anInt2291, -1406270679 * this.anInt2292, -805707790);
      var1.method3122(376402727 * this.anInt2291, (byte)34).method3002((byte)40);
   }

   public void method169(Class223 var1) {
      var1.method3117(376402727 * this.anInt2291, -1406270679 * this.anInt2292, -1399477106);
      var1.method3122(376402727 * this.anInt2291, (byte)22).method3002((byte)92);
   }

   public void method165(Class223 var1) {
      var1.method3117(376402727 * this.anInt2291, -1406270679 * this.anInt2292, -1615249095);
      var1.method3122(376402727 * this.anInt2291, (byte)6).method3002((byte)96);
   }

   public void method167(Class223 var1) {
      var1.method3117(376402727 * this.anInt2291, -1406270679 * this.anInt2292, -1019963241);
      var1.method3122(376402727 * this.anInt2291, (byte)15).method3002((byte)89);
   }

   public static final void method3036(int var0) {
      Class32.anInt341 = 896372419;
      Class32.anInt345 = -1922298214;
      Class32.anInt349 = 2133129458;
   }

   static final void method3037(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[540934629 * var0.anInt8625];
      String var3 = (String)var0.anObjectArray8624[1 + 540934629 * var0.anInt8625];
      Class711_Sub39.method10177(var2, var3, 1895965583);
   }

   static final void method3038(Class681 var0, int var1) {
      Class187.method2732(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], -1506637483);
   }

   static Interface18 method3039(Class348 var0, int var1) {
      return new Class656(var0);
   }

   static void method3040(Class433 var0, boolean var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8) {
      int var9 = client.aClass505_11204.method6061((byte)-27);
      int var10 = client.aClass505_11204.method6107(120877868);
      var0.method5096(var2, var3, var4, var5, (float)var10, (float)var9, (float)var6, (float)var7);
   }
}
