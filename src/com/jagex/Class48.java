package com.jagex;

import com.jagex.Class195;
import com.jagex.Class298;
import com.jagex.Class446;
import com.jagex.Class466;
import com.jagex.Class525;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class681;
import com.jagex.Class689_Sub3;
import com.jagex.Exception_Sub3;
import com.jagex.client;

public class Class48 {
   public static Class466 aClass466_648;
   public static Class48 aClass48_647 = new Class48();
   public static Class48 aClass48_644 = new Class48();
   public static Class48 aClass48_646 = new Class48();
   public static Class48 aClass48_645 = new Class48();

   static final void method931(Class681 var0, Class639_Sub1_Sub2_Sub1 var1, short var2) {
      var0.anInt8623 -= 758383916;
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var5 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      boolean var6 = 1 == var0.anIntArray8622[3 + -1730576285 * var0.anInt8623];
      if(Class195.aClass292_Sub1_2182.method3940(2013606865) != Class298.aClass298_3237) {
         throw new RuntimeException();
      } else {
         Class689_Sub3 var7 = (Class689_Sub3)Class195.aClass292_Sub1_2182.method3938((byte)7);
         if(null != var1) {
            var7.method10220(var1, new Class446((float)var3, (float)var4, (float)var5), var6, -373626487);
         }

         client.aBool11070 = true;
      }
   }

   static final void method932(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class525.method6289(var2 >> 14 & 16383, var2 & 16383);
      if(var3 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt11846 * 929626277;
      }

   }

   static void method933(int var0, int var1) {
      Exception_Sub3.anInt11355 = var0 * 147457581;
      Class526_Sub2.aClass192_10330.method2770(531116474);
   }
}
