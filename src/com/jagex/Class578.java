package com.jagex;

import com.jagex.Class11;
import com.jagex.Class149;
import com.jagex.Class199_Sub22;
import com.jagex.Class219;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class259;
import com.jagex.NPCDef;
import com.jagex.Class448_Sub1;
import com.jagex.Class509;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub38;
import com.jagex.LinkableObject;
import com.jagex.Class569;
import com.jagex.Class610;
import com.jagex.Class615;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class710;
import com.jagex.client;

public class Class578 {
   Class578() throws Throwable {
      throw new Error();
   }

   static final void method6944(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2612 = Class615.method7280(var4, var2, -654940454);
      var0.aBool2560 = true;
   }

   static final void method6945(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      Class526_Sub38 var3 = (Class526_Sub38)client.aClass20_11187.get((long)var2);
      if(var3 != null && 3 == var3.anInt10685 * -1233131191) {
         Class710.method8307(var3, true, true, (byte)-41);
      }

   }

   static final void method6946(Class681 var0, int var1) {
      if(!Class509.method6166(-577610766)) {
         Class219.method3036(-2042697080);
      }

   }

   static int[] method6947(Class526_Sub21_Sub6 var0, int var1) {
      int[] var2 = null;
      if(Class199_Sub22.method9036(var0.anInt11659 * 976428997, 1637659202)) {
         var2 = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89((int)(7424828564598113295L * var0.aLong11653), -174512693)).anIntArray136;
      } else if(-1 != -1282035015 * var0.anInt11657) {
         var2 = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(-1282035015 * var0.anInt11657, -1680757577)).anIntArray136;
      } else if(Class569.method6840(var0.anInt11659 * 976428997, 1048820264)) {
         LinkableObject var3 = (LinkableObject)client.npcs.get((long)((int)(var0.aLong11653 * 7424828564598113295L)));
         if(var3 != null) {
            NPC var4 = (NPC)var3.anObject10399;
            NPCDef var5 = var4.def;
            if(null != var5.morphisms) {
               var5 = var5.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
            }

            if(null != var5) {
               var2 = var5.anIntArray3321;
            }
         }
      } else if(Class259.method3519(var0.anInt11659 * 976428997, 2116148302)) {
         Class610 var6 = (Class610)client.aClass505_11204.method6066(-631188979).method89((int)(var0.aLong11653 * 7424828564598113295L >>> 32 & 2147483647L), -220901110);
         if(var6.anIntArray7989 != null) {
            var6 = var6.method7179(Class242.aClass94_2456, Class242.aClass94_2456, (byte)-51);
         }

         if(var6 != null) {
            var2 = var6.anIntArray7974;
         }
      }

      return var2;
   }

   static final void method6948(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class242.aClass94_2456.method493(var2, (byte)-36);
   }
}
