package com.jagex;

import com.jagex.Class230;
import com.jagex.Class285;
import com.jagex.Class357;
import com.jagex.Class361_Sub1;
import com.jagex.Class361_Sub2;
import com.jagex.Class522;
import com.jagex.Class526_Sub23_Sub9;
import com.jagex.Class641;
import com.jagex.Class648;
import com.jagex.Class681;
import com.jagex.Class708;
import com.jagex.Class710;
import com.jagex.Interface76;

public class Class65 implements Interface76 {
   public static Class65 aClass65_748 = new Class65(0);
   public static Class65 aClass65_747 = new Class65(1);
   int anInt746;

   public int getId() {
      return this.anInt746 * 1883672847;
   }

   Class65(int var1) {
      this.anInt746 = var1 * 764558831;
   }

   public int method21() {
      return this.anInt746 * 1883672847;
   }

   public static void method1074(Class648 var0, int var1) {
      if(var0.aClass357_8456 == Class357.aClass357_3818) {
         Class641.aClass361_8348 = new Class361_Sub1(var0);
      } else {
         if(Class357.aClass357_3817 != var0.aClass357_8456) {
            throw new RuntimeException();
         }

         Class641.aClass361_8348 = new Class361_Sub2(var0);
      }

   }

   static final void method1075(Class681 var0, int var1) {
      if(Class710.aBool8850) {
         Class708[] var2 = Class526_Sub23_Sub9.method10566((byte)7);
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.length;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method1076(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10645, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-8831);
      Class285.method3799(Class230.preferences.aClass711_Sub19_10633.method10022((byte)-62), false, (byte)32);
      Class522.method6257(-1042127423);
   }
}
