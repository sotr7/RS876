package com.jagex;

import com.jagex.Class115;
import com.jagex.Class149;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class174;
import com.jagex.Class174_Sub1;
import com.jagex.Class199_Sub11;
import com.jagex.Class199_Sub3;
import com.jagex.Class221;
import com.jagex.Class238;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class315_Sub1;
import com.jagex.Class380;
import com.jagex.Class521;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub35;
import com.jagex.Class526_Sub6;
import com.jagex.Class566;
import com.jagex.Class615;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Interface3;
import com.jagex.client;

public class Class299 {
   static Class299 aClass299_3246 = new Class299(0);
   static Class299 aClass299_3248 = new Class299(1);
   static Class299 aClass299_3247 = new Class299(2);
   int anInt3245;

   Class299(int var1) {
      this.anInt3245 = var1 * -779018563;
   }

   static final void method3987(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-5);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class115.method1407(var3, var4, var0, (short)256);
   }

   static final void method3988(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class199_Sub3.method8995(var3, var4, var0, -256083580);
   }

   static final void method3989(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2646 = Class615.method7280(var4, var2, -1184312114);
      var0.aBool2560 = true;
   }

   static String method3990(String var0, boolean var1, byte var2) {
      String var3 = var1?"https://":"http://";
      if(Class684.aClass684_8659 == Class521.aClass684_7051) {
         var0 = var0 + "-wtrc";
      } else if(Class521.aClass684_7051 == Class684.aClass684_8668) {
         var0 = var0 + "-wtqa";
      } else if(Class521.aClass684_7051 == Class684.aClass684_8661) {
         var0 = var0 + "-wtwip";
      } else if(Class684.aClass684_8663 == Class521.aClass684_7051) {
         var0 = var0 + "-wti";
      } else if(Class684.aClass684_8667 == Class521.aClass684_7051) {
         var0 = var0 + "-demo";
      } else if(Class684.aClass684_8662 == Class521.aClass684_7051) {
         var0 = "local";
      }

      String var4 = "";
      if(client.aString10983 != null) {
         var4 = "/p=" + client.aString10983;
      }

      String var5 = client.aClass676_11127.aString8591 + ".com";
      return var3 + var0 + "." + var5 + "/l=" + Class26.aClass673_247.anInt8576 * -398271091 + "/a=" + client.anInt10985 * -264476799 + var4 + "/";
   }

   static void method3991(Class174 var0, Class526_Sub35 var1, Class238 var2, byte var3) {
      Class153 var4 = var2.method3292(var0, -933545838);
      if(var4 != null) {
         int var5 = var4.method1825();
         if(var4.method1771() > var5) {
            var5 = var4.method1771();
         }

         byte var6 = 10;
         int var7 = 2107732935 * var1.anInt10666;
         int var8 = var1.anInt10667 * 440262535;
         int var9 = 0;
         int var10 = 0;
         if(null != var2.aString2398) {
            var10 = Class199_Sub11.aClass1_9926.method513(var2.aString2398, 1895615023 * Class566.anInt7611, 0, (Interface3[])null, (byte)-37);
            var9 = Class199_Sub11.aClass1_9926.method515(var2.aString2398, Class566.anInt7611 * 1895615023, (Interface3[])null, (byte)97);
         }

         int var11 = var5 / 2 + 2107732935 * var1.anInt10666;
         int var12 = 440262535 * var1.anInt10667;
         if(var7 < Class525_Sub1.anInt7149 + var5) {
            var7 = Class525_Sub1.anInt7149;
            var11 = var9 / 2 + var6 + var5 / 2 + Class525_Sub1.anInt7149 + 5;
         } else if(var7 > Class525_Sub1.anInt7109 - var5) {
            var7 = Class525_Sub1.anInt7109 - var5;
            var11 = Class525_Sub1.anInt7109 - var5 / 2 - var6 - var9 / 2 - 5;
         }

         if(var8 < var5 + Class525_Sub1.anInt7143) {
            var8 = Class525_Sub1.anInt7143;
            var12 = Class525_Sub1.anInt7143 + var6 + var5 / 2;
         } else if(var8 > Class525_Sub1.anInt7152 - var5) {
            var8 = Class525_Sub1.anInt7152 - var5;
            var12 = Class525_Sub1.anInt7152 - var5 / 2 - var6 - var10;
         }

         int var13 = (int)(Math.atan2((double)(var7 - 2107732935 * var1.anInt10666), (double)(var8 - var1.anInt10667 * 440262535)) / 3.141592653589793D * 32767.0D) & '\uffff';
         var4.method1786((float)var5 / 2.0F + (float)var7, (float)var5 / 2.0F + (float)var8, 4096, var13);
         int var14 = -2;
         int var15 = -2;
         int var16 = -2;
         int var17 = -2;
         if(null != var2.aString2398) {
            var14 = var11 - var9 / 2 - 5;
            var15 = var12;
            var16 = var9 + var14 + 10;
            var17 = var12 + var10 + 3;
            if(0 != 1624164855 * var2.anInt2397) {
               var0.method2356(var14, var12, var16 - var14, var17 - var12, 1624164855 * var2.anInt2397, (byte)77);
            }

            if(0 != var2.anInt2428 * -1821504519) {
               var0.method2284(var14, var12, var16 - var14, var17 - var12, -1821504519 * var2.anInt2428, -1629740172);
            }

            Class174_Sub1.aClass163_9281.method1915(var2.aString2398, var11, var12, var9, var10, -16777216 | var2.anInt2403 * 830418303, Class525_Sub1.aClass635_7092.anInt8295 * -1409553787, 1, 0, 0, (Class153[])null, (int[])null, (Class162)null, 0, 0, (byte)-75);
         }

         if(-1 != var2.anInt2400 * -1056556293 || var2.aString2398 != null) {
            Class526_Sub6 var18 = new Class526_Sub6(var1);
            var18.anInt10393 = (var7 - var5 / 2) * -1366428311;
            var18.anInt10390 = 2015688915 * (var5 / 2 + var7);
            var18.anInt10395 = (var8 - var5) * 1681889935;
            var18.anInt10392 = var8 * -1855090363;
            var18.anInt10394 = -191578163 * var14;
            var18.anInt10389 = var16 * -4385927;
            var18.anInt10391 = -1817666603 * var15;
            var18.anInt10396 = -1739627043 * var17;
            Class380.aClass702_3937.method8176(var18, -1333385546);
         }

      }
   }
}
