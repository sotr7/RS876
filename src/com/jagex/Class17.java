package com.jagex;

import com.jagex.Class205;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class29;
import com.jagex.Class315_Sub1;
import com.jagex.Class348;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.client;

public class Class17 {
   static Class17 aClass17_182 = new Class17();
   static Class17 aClass17_181 = new Class17();
   static Class17 aClass17_180 = new Class17();
   static Class17 aClass17_183 = new Class17();

   static final void method623(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)17);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class29.method733(var3, var4, var0, -2025531366);
   }

   static final void method624(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(Class348.method4525(var0, (int[])null, 1223746861)) {
         Class205.method2898(Class315_Sub1.aClass243Array10033[var0].method3330((byte)-75), -1, var1, var2, var3, var4, var5, var6, var7, var7 < 0, (byte)-18);
      } else {
         if(-1 != var7) {
            client.aBoolArray11236[var7] = true;
         } else {
            for(int var9 = 0; var9 < 111; ++var9) {
               client.aBoolArray11236[var9] = true;
            }
         }

      }
   }

   public static int method625(int var0, byte var1) {
      return var0 & 255;
   }

   public static int method626(int var0) {
      return Class570.aTwitchTV7639.GetChatState();
   }
}
