package com.jagex;

import com.jagex.Class167;
import com.jagex.Class187;
import com.jagex.Class188;
import com.jagex.Class204;
import com.jagex.Class220;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class446;
import com.jagex.Class465;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class614;
import com.jagex.Class619;
import com.jagex.Class681;
import com.jagex.Class87;
import com.jagex.Interface27;

public class Class224 implements Interface27 {
   // $FF: synthetic field
   Class232 this$0;
   Class220 aClass220_2325;

   public void method167(Class223 var1) {
      var1.method3115(this.aClass220_2325, 1735512536);
   }

   public void method169(Class223 var1) {
      var1.method3115(this.aClass220_2325, 1762045678);
   }

   Class224(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      boolean var3 = var2.readUnsignedByte(1953414783) != 255;
      if(var3) {
         var2.pos -= 801976415;
      }

      this.aClass220_2325 = new Class220(var2, var3, true);
   }

   public void method168(Class223 var1, byte var2) {
      var1.method3115(this.aClass220_2325, 1866081314);
   }

   public void method165(Class223 var1) {
      var1.method3115(this.aClass220_2325, 1772413383);
   }

   public void method166(Class223 var1) {
      var1.method3115(this.aClass220_2325, 2023291728);
   }

   public static void method3151(int var0, int var1) {
      if(var0 < 0 || var0 > 2) {
         var0 = 0;
      }

      Class619.anInt8121 = 639269891 * var0;
      Class619.aClass614Array8117 = new Class614[Class167.anIntArray1896[1865223851 * Class619.anInt8121] + 1];
      Class619.anInt8109 = 0;
      Class619.anInt8107 = 0;
   }

   static final void method3152(Class681 var0, int var1) {
      Class465.method5524(var0, 509582134);
   }

   static final void method3153(Class681 var0, int var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      int var5 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 3];
      short var6 = 256;
      Class570.aClass231_7657.method3246(Class188.aClass188_2135, var2, var3, var5, Class187.aClass187_2124.method2723(-1861654158), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, var6, var4, -1561154795);
   }

   static final void method3154(Class681 var0, int var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      int var5 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 3];
      short var6 = 256;
      Class570.aClass231_7657.method3246(Class188.aClass188_2135, var2, var3, var5, Class187.aClass187_2124.method2723(-1807325964), Class204.aClass204_2219, 0.0F, 0.0F, (Class446)null, 0, var6, var4, -1058366408);
   }

   static final void method3155(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class87.anIntArray855[var2 & '\uffff'];
   }

   static final void method3156(Class681 var0, int var1) {
   }
}
