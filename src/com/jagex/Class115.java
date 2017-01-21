package com.jagex;

import com.jagex.Class121;
import com.jagex.IsaacCipher;
import com.jagex.Class149;
import com.jagex.Class168_Sub3;
import com.jagex.Class174_Sub1;
import com.jagex.Class184_Sub2;
import com.jagex.Class199_Sub22;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class327;
import com.jagex.OutFrame;
import com.jagex.Class433;
import com.jagex.Class445;
import com.jagex.Class48;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub31;
import com.jagex.Buffer;
import com.jagex.Class545;
import com.jagex.Class554;
import com.jagex.Class564;
import com.jagex.Class570;
import com.jagex.Class615;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class115 {
   static final float aFloat1375 = 255.0F;
   boolean aBool1376;
   int anInt1398;
   float aFloat1402;
   float aFloat1403;
   float aFloat1404;
   float aFloat1405;
   Runnable aRunnable1382;
   Class121 aClass121_1387;
   float aFloat1377 = 0.85F;
   float aFloat1378;
   int anInt1379;
   int anInt1380;
   boolean aBool1381;
   int anInt1412;
   int anInt1416;
   boolean aBool1384;
   Class433 aClass433_1385;
   Class445 aClass445_1386;
   Class445 aClass445_1388;
   Class433 aClass433_1389;
   Class433 aClass433_1390;
   int[] anIntArray1391;
   float[] aFloatArray1392;
   float[] aFloatArray1393;
   float[] aFloatArray1394;
   float[] aFloatArray1401;
   int[] anIntArray1396;
   int[] anIntArray1397;
   int[] anIntArray1374;
   int[] anIntArray1411;
   int[] anIntArray1418;
   float aFloat1406;
   float aFloat1407;
   float aFloat1408;
   float[] aFloatArray1400;
   Class168_Sub3[] aClass168_Sub3Array1417;
   Class168_Sub3[] aClass168_Sub3Array1399;
   float[] aFloatArray1395;
   float[] aFloatArray1373;
   float[] aFloatArray1415;
   float[] aFloatArray1409;
   float[] aFloatArray1383;
   float[] aFloatArray1413;
   Class174_Sub1 aClass174_Sub1_1414;
   int[] anIntArray1410;

   void method1403(Runnable var1, int var2) {
      this.aRunnable1382 = var1;
   }

   void method1404(byte var1) {
      this.aClass121_1387 = new Class121(this.aClass174_Sub1_1414, this);
   }

   Class115(Class174_Sub1 var1) {
      this.aFloat1378 = 1.0F - this.aFloat1377;
      this.anInt1379 = 0;
      this.anInt1380 = 0;
      this.aBool1381 = false;
      this.anInt1412 = 0;
      this.anInt1416 = 0;
      this.aBool1384 = true;
      this.aClass433_1385 = new Class433();
      this.aClass445_1386 = new Class445();
      this.aClass445_1388 = new Class445();
      this.aClass433_1389 = new Class433();
      this.aClass433_1390 = new Class433();
      this.anIntArray1391 = new int[Class168_Sub3.anInt9372];
      this.aFloatArray1392 = new float[Class168_Sub3.anInt9372];
      this.aFloatArray1393 = new float[Class168_Sub3.anInt9372];
      this.aFloatArray1394 = new float[Class168_Sub3.anInt9372];
      this.aFloatArray1401 = new float[Class168_Sub3.anInt9372];
      this.anIntArray1396 = new int[8];
      this.anIntArray1397 = new int[8];
      this.anIntArray1374 = new int[8];
      this.anIntArray1411 = new int[10000];
      this.anIntArray1418 = new int[10000];
      this.aFloat1406 = 1.0F;
      this.aFloat1407 = 0.0F;
      this.aFloat1408 = 1.0F;
      this.aFloatArray1400 = new float[2];
      this.aClass168_Sub3Array1417 = new Class168_Sub3[8];
      this.aClass168_Sub3Array1399 = new Class168_Sub3[8];
      this.aFloatArray1395 = new float[64];
      this.aFloatArray1373 = new float[64];
      this.aFloatArray1415 = new float[64];
      this.aFloatArray1409 = new float[64];
      this.aFloatArray1383 = new float[64];
      this.aFloatArray1413 = new float[3];
      this.aClass174_Sub1_1414 = var1;
      this.aClass121_1387 = new Class121(var1, this);

      int var2;
      for(var2 = 0; var2 < 8; ++var2) {
         this.aClass168_Sub3Array1417[var2] = new Class168_Sub3(this.aClass174_Sub1_1414);
         this.aClass168_Sub3Array1399[var2] = new Class168_Sub3(this.aClass174_Sub1_1414);
      }

      this.anIntArray1410 = new int[Class168_Sub3.anInt9366];

      for(var2 = 0; var2 < Class168_Sub3.anInt9366; ++var2) {
         this.anIntArray1410[var2] = -1;
      }

   }

   void method1405() {
      this.aClass121_1387 = new Class121(this.aClass174_Sub1_1414, this);
   }

   void method1406() {
      this.aClass121_1387 = new Class121(this.aClass174_Sub1_1414, this);
   }

   static final void method1407(InterfaceDef var0, Class243 var1, Class681 var2, short var3) {
      var0.modelType = -1940911479;
      var0.anInt2539 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 1664688705;
      Class526_Sub31.method9555(var0, (byte)10);
      if(-1 == 1300712985 * var0.componentSlot && !var1.aBool2458) {
         Class545.method6515(var0.uid * 919258769, (byte)11);
      }

   }

   static final void method1408(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2644 = Class615.method7280(var4, var2, -506295635);
      var0.aBool2560 = true;
   }

   static final void method1409(Class681 var0, byte var1) {
      Class48.method931(var0, var0.aClass639_Sub1_Sub2_Sub1_8635, (short)-6707);
   }

   static final void method1410(Class681 var0, short var1) {
      Class184_Sub2.method8480((String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629], var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1, (short)1341);
   }

   static int method1411(int var0, int var1, int var2) {
      int var3 = var0 >> 31 & var1 - 1;
      return ((var0 >>> 31) + var0) % var1 + var3;
   }

   static void method1412(byte var0) {
      if(Class570.aClass153_7642 != null && Class570.aClass153_7642.method1825() == Class570.aTwitchWebcamFrameData7647.width && Class570.aClass153_7642.method1771() == Class570.aTwitchWebcamFrameData7647.height) {
         Class570.aClass153_7642.method1782(0, 0, Class570.aTwitchWebcamFrameData7647.width, Class570.aTwitchWebcamFrameData7647.height, Class570.aTwitchWebcamFrameData7647.buffer, 0, Class570.aTwitchWebcamFrameData7647.width);
      } else {
         Class570.aClass153_7642 = Class554.aClass174_7475.method2613(Class570.aTwitchWebcamFrameData7647.buffer, 0, Class570.aTwitchWebcamFrameData7647.width, Class570.aTwitchWebcamFrameData7647.width, Class570.aTwitchWebcamFrameData7647.height, false);
      }

   }

   static final void method1413(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class564.method6794(var3, var4, var0, -2081129444);
   }

   public static OutFrameBuffer method1414(OutFrame var0, IsaacCipher var1, int var2) {
      OutFrameBuffer var3 = Class199_Sub22.method9037(2023860051);
      var3.aClass405_10554 = var0;
      var3.anInt10559 = -1030937419 * var0.anInt4251;
      if(517410519 * var3.anInt10559 == -1) {
         var3.out = new Buffer(260);
      } else if(517410519 * var3.anInt10559 == -2) {
         var3.out = new Buffer(10000);
      } else if(var3.anInt10559 * 517410519 <= 18) {
         var3.out = new Buffer(20);
      } else if(517410519 * var3.anInt10559 <= 98) {
         var3.out = new Buffer(100);
      } else {
         var3.out = new Buffer(260);
      }

      var3.out.setCipher(var1, 1905536790);
      var3.out.writeOpcode(var3.aClass405_10554.anInt4204 * -23713745, (byte)-123);
      var3.anInt10557 = 0;
      return var3;
   }

   static final void method1415(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1 == Class327.anInt3488 * -265840483?1:0;
   }
}
