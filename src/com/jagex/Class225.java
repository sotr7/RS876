package com.jagex;

import com.jagex.Class1;
import com.jagex.Class11;
import com.jagex.Class113;
import com.jagex.Class16;
import com.jagex.Class163;
import com.jagex.Class173;
import com.jagex.Class174;
import com.jagex.Class181;
import com.jagex.Class199;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class31;
import com.jagex.Class331;
import com.jagex.Class375;
import com.jagex.Class380;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class409;
import com.jagex.Class526_Sub27_Sub1;
import com.jagex.RSByteBuffer;
import com.jagex.Class545;
import com.jagex.Class559;
import com.jagex.Class596;
import com.jagex.Class619;
import com.jagex.Class655;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711_Sub33;
import com.jagex.Interface26;
import com.jagex.client;

public class Class225 implements Interface26 {
   // $FF: synthetic field
   Class232 this$0;

   public void method165(Class223 var1) {
      var1.method3121(-741115886);
   }

   public void method169(Class223 var1) {
      var1.method3121(981529715);
   }

   public void method168(Class223 var1, byte var2) {
      var1.method3121(1086065955);
   }

   public void method167(Class223 var1) {
      var1.method3121(154331935);
   }

   public void method166(Class223 var1) {
      var1.method3121(-517556207);
   }

   Class225(Class232 var1) {
      this.this$0 = var1;
   }

   static Class380 method3157(RSByteBuffer var0, int var1) {
      Class384 var2 = Class711_Sub33.method10141((byte)-14)[var0.readUnsignedByte(-59830408)];
      Class389 var3 = Class331.method4251((byte)15)[var0.readUnsignedByte(-1608390934)];
      int var4 = var0.readShort((byte)1);
      int var5 = var0.readShort((byte)1);
      int var6 = var0.readUnsignedShort(102855090);
      int var7 = var0.readUnsignedShort(625531500);
      int var8 = var0.readShort((byte)1);
      int var9 = var0.readBigSmart((byte)33);
      int var10 = var0.readInt((byte)5);
      return new Class380(var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   static final void method3158(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class655.method7833(var3, var4, var0, 1934131013);
   }

   static final void method3159(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(null != client.aString11017 && var2 < -190820129 * Class11.anInt145) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class655.aClass107Array8488[var2].aString1310;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static final void method3160(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass639_Sub1_Sub4_Sub1_8637.method9859((byte)-51);
   }

   static final void method3161(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      String var3 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class596.method7059(var2, var3, 282107187);
   }

   static final void method3162(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 100;
   }

   static final void method3163(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method3164(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).anInt2302 * 1756072569;
   }

   static final void method3165(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class16.aClass6_171.id * -2107114137;
   }

   static void method3166(Class174 var0, int var1, int var2, int var3, int var4, int var5, Class163 var6, Class1 var7, String var8, int var9) {
      int var10 = 255 - -1548715147 * Class559.anInt7544 - -49472947 * Class31.anInt303;
      if(var10 < 0) {
         var10 = 0;
      }

      if(null == Class526_Sub27_Sub1.aClass153_11625 || Class31.aClass153_268 == null) {
         if(Class113.aClass466_1370.method5537(-2015190759 * Class375.anInt3904, (byte)123) && Class113.aClass466_1370.method5537(-1483288781 * Class199.anInt2201, (byte)90)) {
            Class526_Sub27_Sub1.aClass153_11625 = var0.method2310(Class181.method2679(Class113.aClass466_1370, Class375.anInt3904 * -2015190759, 0), true);
            Class173 var11 = Class181.method2679(Class113.aClass466_1370, Class199.anInt2201 * -1483288781, 0);
            Class31.aClass153_268 = var0.method2310(var11, true);
            var11.method2183();
            Class619.aClass153_8122 = var0.method2310(var11, true);
         } else {
            var0.method2290(var1, var2, var3, var5, var10 << 24 | 1874899061 * Class409.anInt4373, 1);
         }
      }

      if(Class526_Sub27_Sub1.aClass153_11625 != null && null != Class31.aClass153_268) {
         int var13 = (var3 - Class31.aClass153_268.method1825() * 2) / Class526_Sub27_Sub1.aClass153_11625.method1825();

         for(int var12 = 0; var12 < var13; ++var12) {
            Class526_Sub27_Sub1.aClass153_11625.method1778(var1 + Class31.aClass153_268.method1825() + var12 * Class526_Sub27_Sub1.aClass153_11625.method1825(), var2);
         }

         Class31.aClass153_268.method1778(var1, var2);
         Class619.aClass153_8122.method1778(var3 + var1 - Class619.aClass153_8122.method1825(), var2);
      }

      var6.method1895(var8, 3 + var1, (20 - 96898447 * var7.anInt12) / 2 + var2 + var7.anInt12 * 96898447, Class545.anInt7266 * -940975331 | -16777216, -1, -1199460655);
      var0.method2290(var1, var2 + var5, var3, var4 - var5, var10 << 24 | Class409.anInt4373 * 1874899061, 1);
   }
}
