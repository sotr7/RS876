package com.jagex;

import com.jagex.Class152;
import com.jagex.Class153;
import com.jagex.Class16;
import com.jagex.Class190;
import com.jagex.Class226;
import com.jagex.Class242;
import com.jagex.Class255;
import com.jagex.Class289;
import com.jagex.Class332;
import com.jagex.Class526_Sub24;
import com.jagex.RSByteBuffer;
import com.jagex.Class566;
import com.jagex.Class57;
import com.jagex.Class577;
import com.jagex.Class586;
import com.jagex.Class608;
import com.jagex.Class612_Sub1;
import com.jagex.Class648;
import com.jagex.client;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class74 {
   static Class153[] aClass153Array806;
   public int anInt804;
   public int anInt803;
   public int anInt805;

   Class74(int var1, int var2, int var3) {
      this.anInt804 = var1 * -1318753013;
      this.anInt803 = -1922636141 * var2;
      this.anInt805 = var3 * 496226819;
   }

   public static void method1112(int var0) {
      if(null == client.aFrame5603) {
         int var1 = -1115728897 * client.anInt5594;
         int var2 = client.anInt5605 * 1208004069;
         int var3 = Class332.anInt3505 * 1405944805 - 1895615023 * Class566.anInt7611 - var1;
         int var4 = 542147681 * Class586.anInt7792 - 974996221 * Class526_Sub24.anInt10549 - var2;
         if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
            try {
               Container var5 = Class152.method1757((byte)-44);
               int var6 = 0;
               int var7 = 0;
               if(var5 == Class242.aFrame2454) {
                  Insets var8 = Class242.aFrame2454.getInsets();
                  var6 = var8.left;
                  var7 = var8.top;
               }

               Graphics var10 = var5.getGraphics();
               var10.setColor(Color.black);
               if(var1 > 0) {
                  var10.fillRect(var6, var7, var1, Class586.anInt7792 * 542147681);
               }

               if(var2 > 0) {
                  var10.fillRect(var6, var7, Class332.anInt3505 * 1405944805, var2);
               }

               if(var3 > 0) {
                  var10.fillRect(var6 + Class332.anInt3505 * 1405944805 - var3, var7, var3, Class586.anInt7792 * 542147681);
               }

               if(var4 > 0) {
                  var10.fillRect(var6, 542147681 * Class586.anInt7792 + var7 - var4, 1405944805 * Class332.anInt3505, var4);
               }
            } catch (Exception var9) {
               ;
            }
         }

      }
   }

   public static void method1113(boolean var0, byte[] var1, int var2) {
      if(null == Class648.aClass526_Sub36_8457) {
         Class648.aClass526_Sub36_8457 = new RSByteBuffer(20000);
      }

      Class648.aClass526_Sub36_8457.method9619(var1, 0, var1.length, 1951125289);
      if(var0) {
         Class226.method3167(Class648.aClass526_Sub36_8457.buffer, -963071760);
         Class16.aClass612_Sub1Array175 = new Class612_Sub1[841209115 * Class190.anInt2167];
         int var3 = 0;

         for(int var4 = 1255104167 * Class608.anInt7919; var4 <= -610389965 * Class57.anInt691; ++var4) {
            Class612_Sub1 var5 = Class577.method6943(var4, (byte)109);
            if(var5 != null) {
               Class16.aClass612_Sub1Array175[var3++] = var5;
            }
         }

         Class16.aBool174 = false;
         Class289.aLong3116 = Class255.time((byte)24) * -5717192277934954055L;
         Class648.aClass526_Sub36_8457 = null;
      }

   }
}
