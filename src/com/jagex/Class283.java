package com.jagex;

import com.jagex.Class177;
import com.jagex.Class230;
import com.jagex.Class415;
import com.jagex.Class446;
import com.jagex.Class522;
import com.jagex.Class546;
import com.jagex.Class552;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class681;
import com.jagex.RuntimeException_Sub2;
import com.jagex.client;

public class Class283 {
   int anInt3064;
   byte[] aByteArray3063;

   int method3714(byte var1) {
      short var2 = 0;

      for(int var3 = 0; var3 < 2; ++var3) {
         var2 = (short)(var2 | (this.aByteArray3063[(this.anInt3064 += -415136371) * 1505248581 - 1] & 255) << 8 * var3);
      }

      return var2;
   }

   Class283(byte[] var1) {
      this.aByteArray3063 = var1;
      this.anInt3064 = 0;
   }

   String method3715(int var1) {
      int var2 = this.method3714((byte)121);
      if(var2 == -1) {
         return null;
      } else if(var2 > 256) {
         throw new RuntimeException_Sub2();
      } else {
         String var3 = new String(this.aByteArray3063, this.anInt3064 * 1505248581, var2);
         this.anInt3064 += -415136371 * var2;
         return var3;
      }
   }

   int method3716() {
      short var1 = 0;

      for(int var2 = 0; var2 < 2; ++var2) {
         var1 = (short)(var1 | (this.aByteArray3063[(this.anInt3064 += -415136371) * 1505248581 - 1] & 255) << 8 * var2);
      }

      return var1;
   }

   String method3717() {
      int var1 = this.method3714((byte)59);
      if(var1 == -1) {
         return null;
      } else if(var1 > 256) {
         throw new RuntimeException_Sub2();
      } else {
         String var2 = new String(this.aByteArray3063, this.anInt3064 * 1505248581, var1);
         this.anInt3064 += -415136371 * var1;
         return var2;
      }
   }

   public static void method3718(int var0, String var1, int var2) {
      Class177.method2659(var0, 0, "", "", "", var1, (Class415)null, -986924045);
   }

   static final void method3719(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 >> 28;
   }

   static final void method3720(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub11_10609, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1?1:0, (short)212);
      client.aClass505_11204.method6078(-2061824859);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static Class639_Sub1_Sub2_Sub1 method3721(int var0, int var1, int var2, byte var3) {
      Class552 var4 = client.aClass505_11204.method6072(768547898).aClass552ArrayArrayArray7287[var0][var1][var2];
      if(null == var4) {
         return null;
      } else {
         Class639_Sub1_Sub2_Sub1 var5 = null;
         int var6 = -1;

         for(Class546 var7 = var4.aClass546_7357; var7 != null; var7 = var7.aClass546_7268) {
            Class639_Sub1_Sub2 var8 = var7.aClass639_Sub1_Sub2_7267;
            if(var8 instanceof Class639_Sub1_Sub2_Sub1) {
               Class639_Sub1_Sub2_Sub1 var9 = (Class639_Sub1_Sub2_Sub1)var8;
               int var10 = (var9.method10781(-627148024) - 1) * 256 + 252;
               Class446 var11 = var9.method7635().aClass446_4816;
               int var12 = (int)var11.aFloat4917 - var10 >> 9;
               int var13 = (int)var11.aFloat4919 - var10 >> 9;
               int var14 = var10 + (int)var11.aFloat4917 >> 9;
               int var15 = var10 + (int)var11.aFloat4919 >> 9;
               if(var12 <= var1 && var13 <= var2 && var14 >= var1 && var15 >= var2) {
                  int var16 = (var15 + 1 - var2) * (var14 + 1 - var1);
                  if(var16 > var6) {
                     var5 = var9;
                     var6 = var16;
                  }
               }
            }
         }

         return var5;
      }
   }
}
