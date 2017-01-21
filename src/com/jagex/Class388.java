package com.jagex;

import com.jagex.Class192;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class393;
import com.jagex.Class40_Sub15;
import com.jagex.Class456;
import com.jagex.Class54;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class388 {
   public static Class40_Sub15 aClass40_Sub15_4063;
   public int anInt4060;
   public static Class388 aClass388_4058 = new Class388(8);
   public static Class388 aClass388_4062 = new Class388(16);
   public static Class388 aClass388_4059 = new Class388(8);
   public static Class388 aClass388_4057 = new Class388(16);
   static Class388 aClass388_4061 = new Class388(32);

   Class388(int var1) {
      this.anInt4060 = var1 * 343314893;
   }

   static final void method4764(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class456.method5407(1507895013).getId();
   }

   static final void method4765(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub19_10632.method10022((byte)-56);
   }

   static final void method4766(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class393.method4806(var3, var4, var0, (byte)12);
   }

   public static int method4767(String var0, int var1) {
      return var0.length() + 2;
   }

   static final void method4768(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static void method4769(int var0, int var1) {
      Class54.anInt667 = 2049768145 * var0;
      Class192 var2 = Class54.aClass192_666;
      synchronized(var2) {
         Class54.aClass192_666.method2770(2132303921);
      }
   }
}
