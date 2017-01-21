package com.jagex;

import com.jagex.Class1;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class163;
import com.jagex.Class195;
import com.jagex.InterfaceDef;
import com.jagex.Class295;
import com.jagex.Class327;
import com.jagex.Class443;
import com.jagex.LinkableObject;
import com.jagex.Class681;
import com.jagex.Interface3;
import com.jagex.Interface30;
import com.jagex.Interface32;
import com.jagex.client;

public class Class61 implements Interface32 {
   public Interface30 method225(Class295 var1, int var2, byte var3) {
      if(var1 == Class295.aClass295_3190) {
         return client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
      } else {
         if(var1 == Class295.aClass295_3191) {
            LinkableObject var4 = (LinkableObject)client.npcs.get((long)var2);
            if(var4 != null) {
               return (Interface30)var4.anObject10399;
            }
         }

         return null;
      }
   }

   public Interface30 method223(Class295 var1, int var2) {
      if(var1 == Class295.aClass295_3190) {
         return client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
      } else {
         if(var1 == Class295.aClass295_3191) {
            LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
            if(var3 != null) {
               return (Interface30)var3.anObject10399;
            }
         }

         return null;
      }
   }

   public Interface30 method222(Class295 var1, int var2) {
      if(var1 == Class295.aClass295_3190) {
         return client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
      } else {
         if(var1 == Class295.aClass295_3191) {
            LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
            if(var3 != null) {
               return (Interface30)var3.anObject10399;
            }
         }

         return null;
      }
   }

   public Interface30 method224(Class295 var1, int var2) {
      if(var1 == Class295.aClass295_3190) {
         return client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2];
      } else {
         if(var1 == Class295.aClass295_3191) {
            LinkableObject var3 = (LinkableObject)client.npcs.get((long)var2);
            if(var3 != null) {
               return (Interface30)var3.anObject10399;
            }
         }

         return null;
      }
   }

   static final void method1041(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static void method1042(InterfaceDef var0, Class162 var1, int var2, int var3, int var4, int var5, int var6, String var7, Class163 var8, Class1 var9, int var10, int var11) {
      int var12;
      if(2 == -265840483 * Class327.anInt3488) {
         var12 = (int)((double)Class195.aClass292_Sub1_2182.method3919(1961413667) * 2607.5945876176133D) + -502966983 * client.anInt11076 & 16383;
      } else if(-265840483 * Class327.anInt3488 == 6) {
         var12 = (int)client.aFloat11105 & 16383;
      } else {
         var12 = client.anInt11076 * -502966983 + (int)client.aFloat11105 & 16383;
      }

      int var13 = Math.max(-99858407 * var0.anInt2510 / 2, -667181623 * var0.anInt2576 / 2) + 10;
      int var14 = var5 * var5 + var4 * var4;
      if(var14 <= var13 * var13) {
         int var15 = Class443.anIntArray4895[var12];
         int var16 = Class443.anIntArray4896[var12];
         if(6 != Class327.anInt3488 * -265840483) {
            var15 = var15 * 256 / (client.anInt11097 * 1163477879 + 256);
            var16 = 256 * var16 / (1163477879 * client.anInt11097 + 256);
         }

         int var17 = var5 * var15 + var4 * var16 >> 14;
         int var18 = var5 * var16 - var4 * var15 >> 14;
         int var19 = var9.method515(var7, 100, (Interface3[])null, (byte)46);
         int var20 = var9.method513(var7, 100, 0, (Interface3[])null, (byte)-22);
         var17 -= var19 / 2;
         if(var17 >= -(-99858407 * var0.anInt2510) && var17 <= var0.anInt2510 * -99858407 && var18 >= -(-667181623 * var0.anInt2576) && var18 <= var0.anInt2576 * -667181623) {
            var8.method1915(var7, var2 + var17 + -99858407 * var0.anInt2510 / 2, var3 + var0.anInt2576 * -667181623 / 2 - var18 - var6 - var20, var19, 50, var10, 0, 1, 0, 0, (Class153[])null, (int[])null, var1, var2, var3, (byte)43);
         }
      }
   }
}
