package com.jagex;

import com.jagex.Class109;
import com.jagex.Class11;
import com.jagex.Class241;
import com.jagex.Class242;
import com.jagex.Class325_Sub2;
import com.jagex.Class33;
import com.jagex.Class526_Sub31_Sub1;
import com.jagex.Buffer;
import com.jagex.Class529;
import com.jagex.Class579;
import com.jagex.Class590;
import com.jagex.Class603;
import com.jagex.Class625;
import com.jagex.Class655;
import com.jagex.Class695;
import com.jagex.RuntimeException_Sub4;
import com.jagex.client;

public class Class357 {
   public static Class357 aClass357_3817 = new Class357();
   public static Class357 aClass357_3818 = new Class357();

   static void method4574(Buffer var0, byte var1) {
      boolean var2 = var0.readUnsignedByte(486192397) == 1;
      if(var2) {
         boolean var3 = false;
         int var4 = var0.readOpcode((byte)92) << 24;
         var4 |= var0.readOpcode((byte)26) << 16;
         var4 |= var0.readOpcode((byte)102) << 8;
         var4 |= var0.readOpcode((byte)53);
         Class695.aClass51_8757.method948(Class241.aLong2452 * -5418364555128068011L, var4, (byte)-2);
      }

   }

   static void method4575(byte var0) {
      RuntimeException_Sub4.aClass111_12105.method1380((byte)-121);
      RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
      RuntimeException_Sub4.aClass111_12105.aClass420_1348 = null;
      RuntimeException_Sub4.aClass111_12105.aClass420_1351 = null;
      RuntimeException_Sub4.aClass111_12105.aClass420_1352 = null;
      RuntimeException_Sub4.aClass111_12105.anInt1349 = 0;
      client.anInt11159 = 0;
      client.anInt11288 = 0;
      client.anInt11130 = 0;
      client.anInt11218 = 0;
      client.aString11017 = null;
      Class11.anInt145 = 0;
      Class655.aClass107Array8488 = null;
      Class325_Sub2.aClass348_10028 = null;
      Class603.aClass348_7890 = null;
      client.aBool11302 = true;
      Class579.method6958(-1246764077);

      for(int var1 = 0; var1 < Class242.aClass94_2456.aClass625Array1152.length; ++var1) {
         Class625 var2 = new Class625(Class109.aClass607_1322.method7133(var1, -1904769172), false);
         var2.method7429(0, 69615457);
         var2.method7432(0, -2041730985);
         Class242.aClass94_2456.aClass625Array1152[var1] = var2;
      }

      Class242.aClass94_2456.aClass600_1154.method7081((byte)-66);
      Class590.method7012(-1009802275);
      Class529.method6373(RuntimeException_Sub4.aClass111_12105, -1430883412);
   }

   public static int[][] method4576(int var0, int var1, int var2, int var3, int var4, int var5, float var6, boolean var7, int var8) {
      int[][] var9 = new int[var1][var0];
      Class526_Sub31_Sub1 var10 = new Class526_Sub31_Sub1();
      var10.aBool11770 = var7;
      var10.anInt11778 = var3 * -1411939057;
      var10.anInt11780 = -927165155 * var4;
      var10.anInt11783 = -1598581745 * var5;
      var10.anInt11782 = -18052129 * (int)(var6 * 4096.0F);
      var10.method10664((short)16146);
      Class33.method809(var0, var1, 1950053133);

      for(int var11 = 0; var11 < var1; ++var11) {
         var10.method10663(var11, var9[var11], -2025034999);
      }

      return var9;
   }
}
