package com.jagex;

import com.jagex.Class143;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class312;
import com.jagex.Class315_Sub1;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.client;

public class Class273 {
   static int anInt3008;
   public int anInt3006;
   public int anInt3002;
   public static Class273 aClass273_3000 = new Class273(0, 104);
   static Class273 aClass273_3001 = new Class273(1, 120);
   static Class273 aClass273_3003 = new Class273(2, 136);
   static Class273 aClass273_3005 = new Class273(3, 168);
   static Class273 aClass273_3004 = new Class273(4, 72);
   static Class273 aClass273_3007 = new Class273(5, 256);

   Class273(int var1, int var2) {
      this.anInt3006 = var1 * -1401388359;
      this.anInt3002 = 1800730467 * var2;
   }

   public static int method3610(byte var0) {
      return Class570.aTwitchTV7639.GetLoginState();
   }

   static Class526_Sub21_Sub19 method3611(byte[] var0, byte var1) {
      return new Class526_Sub21_Sub19(new RSByteBuffer(var0), Class312.anInterface17_3388);
   }

   public static final void method3612(int var0, int var1, int var2, int var3, boolean var4, byte var5) {
      if(var2 < 1) {
         var2 = 1;
      }

      if(var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      if(var6 < 0) {
         var6 = 0;
      } else if(var6 > 100) {
         var6 = 100;
      }

      int var7 = var6 * (client.aShort11275 - client.aShort11274) / 100 + client.aShort11274;
      int var8 = 512 * var3 * var7 / (334 * var2);
      int var9;
      int var10;
      short var11;
      if(var8 < client.aShort11280) {
         var11 = client.aShort11280;
         var7 = 334 * var11 * var2 / (var3 * 512);
         if(var7 > client.aShort11189) {
            var7 = client.aShort11189;
            var9 = 512 * var7 * var3 / (334 * var11);
            var10 = (var2 - var9) / 2;
            if(var4) {
               Class554.aClass174_7475.method2278();
               Class554.aClass174_7475.method2356(var0, var1, var10, var3, -16777216, (byte)41);
               Class554.aClass174_7475.method2356(var0 + var2 - var10, var1, var10, var3, -16777216, (byte)24);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if(var8 > client.aShort11144) {
         var11 = client.aShort11144;
         var7 = var2 * var11 * 334 / (512 * var3);
         if(var7 < client.aShort11211) {
            var7 = client.aShort11211;
            var9 = 334 * var2 * var11 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if(var4) {
               Class554.aClass174_7475.method2278();
               Class554.aClass174_7475.method2356(var0, var1, var2, var10, -16777216, (byte)15);
               Class554.aClass174_7475.method2356(var0, var1 + var3 - var10, var2, var10, -16777216, (byte)113);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      client.anInt11292 = -1144828317 * (var3 * var7 / 334);
      client.anInt11282 = -1541532859 * var0;
      client.anInt11283 = -89939117 * var1;
      client.anInt11284 = (short)var2 * -1281606175;
      client.anInt11285 = 241283509 * (short)var3;
   }

   static final void method3613(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-17);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class143.method1666(var3, var4, var0, 1839543713);
   }
}
