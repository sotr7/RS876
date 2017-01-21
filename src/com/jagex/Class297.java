package com.jagex;

import com.jagex.Class107;
import com.jagex.Class152;
import com.jagex.Class192;
import com.jagex.Class20;
import com.jagex.Class200;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class312;
import com.jagex.Class32;
import com.jagex.Class331;
import com.jagex.Class466;
import com.jagex.Class474;
import com.jagex.Class517;
import com.jagex.Class526_Sub38;
import com.jagex.Class54;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class710;
import com.jagex.Class9_Sub1;
import com.jagex.client;

public class Class297 {
   public static Class466 aClass466_3234;
   public static Class517 aClass517_3235;
   int anInt3233;
   static Class297 aClass297_3223 = new Class297(0);
   static Class297 aClass297_3219 = new Class297(1);
   static Class297 aClass297_3220 = new Class297(2);
   static Class297 aClass297_3221 = new Class297(3);
   static Class297 aClass297_3232 = new Class297(4);
   static Class297 aClass297_3226 = new Class297(5);
   static Class297 aClass297_3224 = new Class297(6);
   static Class297 aClass297_3225 = new Class297(7);
   static Class297 aClass297_3218 = new Class297(8);
   static Class297 aClass297_3227 = new Class297(9);
   static Class297 aClass297_3228 = new Class297(10);
   static Class297 aClass297_3229 = new Class297(11);
   static Class297 aClass297_3230 = new Class297(12);
   static Class297 aClass297_3231 = new Class297(13);
   static Class297 aClass297_3222 = new Class297(14);

   Class297(int var1) {
      this.anInt3233 = 930826287 * var1;
   }

   public static int method3968(byte[] var0, int var1, CharSequence var2, byte var3) {
      int var4 = var2.length();
      int var5 = var1;

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var2.charAt(var6);
         if(var7 <= 127) {
            var0[var5++] = (byte)var7;
         } else if(var7 <= 2047) {
            var0[var5++] = (byte)(192 | var7 >> 6);
            var0[var5++] = (byte)(128 | var7 & 63);
         } else {
            var0[var5++] = (byte)(224 | var7 >> 12);
            var0[var5++] = (byte)(128 | var7 >> 6 & 63);
            var0[var5++] = (byte)(128 | var7 & 63);
         }
      }

      return var5 - var1;
   }

   static final void method3969(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class152.method1762(var2, 308564071);
   }

   static final void method3970(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-33);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2520 * 480812513;
   }

   static void method3971(boolean var0, int var1) {
      if(var0) {
         if(-1 != -327748687 * client.anInt11186) {
            Class312.method4073(-327748687 * client.anInt11186, (byte)-82);
         }

         for(Class526_Sub38 var2 = (Class526_Sub38)client.aClass20_11187.method638(-1493428206); var2 != null; var2 = (Class526_Sub38)client.aClass20_11187.method639(-994383253)) {
            if(!var2.method6330((byte)93)) {
               var2 = (Class526_Sub38)client.aClass20_11187.method638(1568317674);
               if(var2 == null) {
                  break;
               }
            }

            Class710.method8307(var2, true, false, (byte)53);
         }

         client.anInt11186 = 1056082607;
         client.aClass20_11187 = new Class20(8);
         Class200.method2868((short)-29800);
         client.anInt11186 = -820996645 * Class331.aClass613_3498.anInt8040;
         if(-327748687 * client.anInt11186 != -1) {
            Class474.method5652(false, (short)28804);
            Class9_Sub1.method10244(-511831613);
            Class107.method1346(client.anInt11186 * -327748687, (int[])null, (byte)96);
         }
      }

      Class32.aBool358 = true;
   }

   public static void method3972(int var0) {
      Class192 var1 = Class54.aClass192_666;
      synchronized(var1) {
         Class54.aClass192_666.method2770(1165020951);
      }
   }

   static final void method3973(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class278.method3685(var3, var4, false, 1, var0, -953374863);
   }
}
