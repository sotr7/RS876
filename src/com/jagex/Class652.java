package com.jagex;

import com.jagex.Class195;
import com.jagex.Class291;
import com.jagex.Class307;
import com.jagex.Class329_Sub2;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class596;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class681;
import com.jagex.client;

public class Class652 {
   public int anInt8464;

   public Class652(int var1) {
      this.anInt8464 = var1 * -640524961;
   }

   static final void method7782(Class681 var0, Class639_Sub1_Sub2_Sub1 var1, byte var2) {
      var0.anInt8623 -= -820311795;
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var5 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
      int var6 = var0.anIntArray8622[3 + -1730576285 * var0.anInt8623];
      int var7 = var0.anIntArray8622[4 + var0.anInt8623 * -1730576285];
      boolean var8 = 1 == var0.anIntArray8622[5 + -1730576285 * var0.anInt8623];
      int var9 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 6];
      if(Class195.aClass292_Sub1_2182.method3914((byte)3) != Class307.aClass307_3297) {
         throw new RuntimeException();
      } else {
         Class329_Sub2 var10 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-63149010);
         Class440 var11 = new Class440();
         Class440 var12 = new Class440();
         var11.method5193(0.0F, 1.0F, 0.0F, (float)(3.141592653589793D * (double)var7 * 2.0D / 16384.0D));
         Class446 var13 = new Class446(1.0F, 0.0F, 0.0F);
         var13.method5286(var11);
         var13.method5270();
         var12.method5188(var13, (float)(2.0D * (double)var6 * 3.141592653589793D / 16384.0D));
         var11.method5194(var12);
         Class596 var14 = client.aClass505_11204.method6128(2050250921);
         int var15 = -814686591 * var14.localX << 9;
         int var16 = -845789331 * var14.localY << 9;
         if(var1 != null) {
            var10.method9105(var1, new Class446((float)var3, (float)var4, (float)var5), var11, var8, var9, client.aClass505_11204.method6125(-2090148030).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)-83), var15, var16, (byte)-44);
         }

         client.aBool11070 = true;
      }
   }

   public static boolean method7783(int var0) {
      return Class291.aBool3132;
   }
}
