package com.jagex;

import com.jagex.Class189;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class681;
import com.jagex.Class82;

public class Class676 {
   public static int anInt8594;
   public static Class676 aClass676_8589;
   public static Class676 aClass676_8592;
   static Class676 aClass676_8587;
   static Class676 aClass676_8588;
   static Class676 aClass676_8585;
   static Class676 aClass676_8590;
   public String aString8591;
   public String aString8586;
   public int anInt8593;

   static {
      aClass676_8589 = new Class676("nocturne", "Nocturne", 0, Class82.aClass82_832);
      aClass676_8592 = new Class676("stellardawn", "Stellar Dawn", 1, Class82.aClass82_833);
      aClass676_8587 = new Class676("game3", "Game 3", 2, Class82.aClass82_832);
      aClass676_8588 = new Class676("game4", "Game 4", 3, Class82.aClass82_840);
      aClass676_8585 = new Class676("game5", "Game 5", 4, Class82.aClass82_837);
      aClass676_8590 = new Class676("oldscape", "RuneScape 2007", 5, Class82.aClass82_832);
   }

   Class676(String var1, String var2, int var3, Class82 var4) {
      this.aString8591 = var1;
      this.aString8586 = var2;
      this.anInt8593 = 1001871155 * var3;
   }

   static final void method8014(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-24);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class189.method2743(var3, var4, var0, -1027152869);
   }
}
