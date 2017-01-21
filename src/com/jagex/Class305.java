package com.jagex;

import com.jagex.Class113;
import com.jagex.Class166;
import com.jagex.Class217;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class274;
import com.jagex.NPCDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class327;
import com.jagex.Class391;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class458;
import com.jagex.Class499;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class533;
import com.jagex.Class539_Sub1;
import com.jagex.Class54;
import com.jagex.Class554;
import com.jagex.Class609;
import com.jagex.Class681;
import com.jagex.Class88;
import com.jagex.client;

public class Class305 {
   static int anInt3283;
   public int[] anIntArray3281;
   public short[] aShortArray3282;

   public Class305(int[] var1, short[] var2) {
      this.anIntArray3281 = var1;
      this.aShortArray3282 = var2;
   }

   public Class305(NPCDef var1) {
      this.anIntArray3281 = new int[8];
      this.aShortArray3282 = new short[8];
      int var2 = 0;
      if(null != var1.headIconSprites && var1.headIconSubSprites != null) {
         var2 = var1.headIconSprites.length;
         System.arraycopy(var1.headIconSprites, 0, this.anIntArray3281, 0, var2);
         System.arraycopy(var1.headIconSubSprites, 0, this.aShortArray3282, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.anIntArray3281[var3] = -1;
         this.aShortArray3282[var3] = -1;
      }

   }

   static final void method4023(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-16);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class526_Sub21_Sub2.method10419(var3, var4, var0, 249301958);
   }

   static final void method4024(long var0) {
      if(client.aClass505_11204.method6072(1018195968) != null) {
         if(Class327.anInt3488 * -265840483 != 1 && 5 != Class327.anInt3488 * -265840483) {
            if(6 == -265840483 * Class327.anInt3488) {
               Class274.method3618(var0);
            }
         } else {
            Class391.method4790(var0);
         }
      }

      Class217.method2991(Class554.aClass174_7475, (long)client.anInt11012);
      if(client.anInt11186 * -327748687 != -1) {
         Class88.method1189(client.anInt11186 * -327748687, (byte)-1);
      }

      int var2;
      for(var2 = 0; var2 < client.anInt11244 * -178271659; ++var2) {
         client.aBoolArray11195[var2] = client.aBoolArray11236[var2];
         client.aBoolArray11236[var2] = false;
      }

      client.anInt11245 = client.anInt11012 * 680446439;
      Class539_Sub1.method9250(-1, -1, (byte)117);
      if(-327748687 * client.anInt11186 != -1) {
         client.anInt11244 = 0;
         Class54.method982(-434163642);
      }

      Class554.aClass174_7475.method2278();
      Class533.method6395(Class554.aClass174_7475, 2008926888);
      var2 = Class166.method1932(1923166446);
      if(var2 == -1) {
         var2 = client.anInt11178 * -877016159;
      }

      if(var2 == -1) {
         var2 = -385022107 * client.anInt11177;
      }

      Class458.method5417(var2, -1197669556);
      int var3 = Class451.localPlayer.method10781(-627148024) << 8;
      Class446 var4 = Class451.localPlayer.method7635().aClass446_4816;
      Class499.method6007(Class451.localPlayer.aByte10827, (int)var4.aFloat4917 + var3, (int)var4.aFloat4919 + var3, 101025109 * client.anInt11225, -439356168);
      client.anInt11225 = 0;
   }

   static InterfaceDef method4025(InterfaceDef var0, byte var1) {
      InterfaceDef var2 = client.method10354(var0);
      if(var2 == null) {
         var2 = var0.aClass245_2598;
      }

      return var2;
   }

   static void method4026(int var0, int var1) {
      Class609.anInt7931 = var0 * -1371938535;
      Class113.aClass192_1369.method2770(1806707814);
   }
}
