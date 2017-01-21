package com.jagex;

import com.jagex.Class103;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class281;
import com.jagex.Class460_Sub1;
import com.jagex.Class526_Sub38;
import com.jagex.LinkableObject;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class93;
import com.jagex.client;

public class Class73 {
   static InterfaceDef aClass245_802;

   Class73() throws Throwable {
      throw new Error();
   }

   static void method1110(InterfaceDef[] var0, InterfaceDef var1, boolean var2, int var3) {
      int var4 = 0 != var1.anInt2522 * -1379784909?-1379784909 * var1.anInt2522:-99858407 * var1.anInt2510;
      int var5 = 0 != 1525210059 * var1.anInt2523?1525210059 * var1.anInt2523:var1.anInt2576 * -667181623;
      Class281.method3712(var0, 919258769 * var1.uid, var4, var5, var2, -728035589);
      if(null != var1.aClass245Array2530) {
         Class281.method3712(var1.aClass245Array2530, var1.uid * 919258769, var4, var5, var2, -1009163643);
      }

      Class526_Sub38 var6 = (Class526_Sub38)client.aClass20_11187.get((long)(919258769 * var1.uid));
      if(null != var6) {
         Class460_Sub1.method9304(var6.anInt10684 * -870147923, var4, var5, var2, -775711068);
      }

      if(var1 == client.aClass245_11194) {
         int var7 = Class103.anInt1270 * 1609310241;
         int[] var8 = Class103.anIntArray1276;

         int var9;
         for(var9 = 0; var9 < var7; ++var9) {
            Class639_Sub1_Sub2_Sub1_Sub1 var10 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var8[var9]];
            if(var10 != null) {
               var10.method10794(var4, var5, var2, 1307993642);
            }
         }

         for(var9 = 0; var9 < client.npcCount * 1139938345; ++var9) {
            int var12 = client.npcsIndicies[var9];
            LinkableObject var11 = (LinkableObject)client.npcs.get((long)var12);
            if(var11 != null) {
               ((Class639_Sub1_Sub2_Sub1)var11.anObject10399).method10794(var4, var5, var2, 4920859);
            }
         }
      }

   }

   static String method1111(long var0, int var2, int var3) {
      Class258.method3514(var0);
      int var4 = Class93.aCalendar899.get(5);
      int var5 = Class93.aCalendar899.get(2) + 1;
      int var6 = Class93.aCalendar899.get(1);
      return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
   }
}
