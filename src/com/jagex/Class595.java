package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class348;
import com.jagex.Class616;
import com.jagex.Class681;
import com.jagex.client;

public class Class595 {
   public static String aString7849;
   public static Class595 aClass595_7848 = new Class595(0);
   public static Class595 aClass595_7846 = new Class595(1);
   public static Class595 aClass595_7847 = new Class595(4);

   Class595(int var1) {
   }

   static final void method7041(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)35);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class616.method7309(var3, var4, var0, (byte)-59);
   }

   static final void method7042(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3057(var3, 829437657)?1:0;
   }

   static final void method7043(int var0, int[] var1, int var2) {
      if(Class348.method4525(var0, var1, 1666474047)) {
         InterfaceDef[] var3 = Class315_Sub1.aClass243Array10033[var0].aClass245Array2459;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            InterfaceDef var5 = var3[var4];
            if(null != var5 && null != var5.aClass704_2661) {
               var5.aClass704_2661.method8236(-1730576285);
            }
         }

      }
   }
}
