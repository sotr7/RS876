package com.jagex;

import com.jagex.Class199_Sub13;
import com.jagex.Class199_Sub17;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class251;
import com.jagex.Class315_Sub1;
import com.jagex.Class439;
import com.jagex.Class487;
import com.jagex.Class607;
import com.jagex.Class646;
import com.jagex.Class681;
import com.jagex.Class90;
import com.jagex.client;

public class Class450 {
   static final int anInt4924 = 6;
   static final int anInt4925 = 1;
   static final int anInt4926 = 2;
   static final int anInt4927 = 0;
   static final int anInt4928 = 4;
   static final int anInt4929 = 3;
   static final int anInt4930 = 7;

   Class450() throws Throwable {
      throw new Error();
   }

   static final void method5340(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class251.method3467((char)var2, -689559532)?1:0;
   }

   static final void method5341(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-74);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class646.method7692(var3, var4, var0, (byte)1);
   }

   static final void method5342(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(var2.startsWith(Class199_Sub13.method9016(0, 16711935)) || var2.startsWith(Class199_Sub13.method9016(1, 16711935))) {
         var2 = var2.substring(7);
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class607.method7147(var2, -1326155492)?1:0;
   }

   public static final void method5343(int var0) {
      if(!client.aBool11278) {
         client.aFloat11106 += (24.0F - client.aFloat11106) / 2.0F;
         client.aBool11070 = true;
         client.aBool11278 = true;
      }
   }

   static final void method5344(Class681 var0, boolean var1, int var2) {
      var0.anInt8623 -= 379191958;
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class90 var5 = Class487.method5858(var3, (short)12847);
      if(var5 == null) {
         throw new RuntimeException();
      } else {
         Class439.aList4867 = var5.method1209(Integer.valueOf(var4), (byte)-75);
         if(Class439.aList4867 != null) {
            Class199_Sub17.anIterator9948 = Class439.aList4867.iterator();
            if(var1) {
               var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class439.aList4867.size();
            }
         } else if(var1) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         }

      }
   }
}
