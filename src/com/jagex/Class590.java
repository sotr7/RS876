package com.jagex;

import com.jagex.Class199_Sub13;
import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class25;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class596;
import com.jagex.Class645;
import com.jagex.Class681;
import com.jagex.client;

public class Class590 {
   static Class590 aClass590_7804 = new Class590(0);
   static Class590 aClass590_7803 = new Class590(1);
   public static Class590 aClass590_7805 = new Class590(2);

   Class590(int var1) {
   }

   static final void method7008(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-9);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 656480735 * var3.anInt2544;
   }

   static final void method7009(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(var2.startsWith(Class199_Sub13.method9016(0, 16711935)) || var2.startsWith(Class199_Sub13.method9016(1, 16711935))) {
         var2 = var2.substring(7);
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = method7011(var2, -1552256040)?1:0;
   }

   static final void method7010(Class681 var0, byte var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      int var5 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 3];
      Class596 var6 = client.aClass505_11204.method6128(2084524681);
      Class645.method7671((var2 >> 14 & 16383) - -814686591 * var6.localX, (var2 & 16383) - var6.localY * -845789331, var3 << 2, var4, var5, false, -1783198661);
      client.aBool11070 = true;
   }

   public static boolean method7011(String var0, int var1) {
      if(var0 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < client.anInt11218 * -87727903; ++var2) {
            Class25 var3 = client.aClass25Array11169[var2];
            if(var0.equalsIgnoreCase(var3.aString243)) {
               return true;
            }

            if(var0.equalsIgnoreCase(var3.aString245)) {
               return true;
            }
         }

         return false;
      }
   }

   static void method7012(int var0) {
      Class526_Sub21_Sub9.aClass20_11696.method647(929030154);
      Class526_Sub21_Sub9.aClass696_11700.method8135((byte)-68);
      Class526_Sub21_Sub9.aClass696_11676.method8135((byte)-38);
   }
}
