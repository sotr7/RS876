package com.jagex;

import com.jagex.Class203;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class315_Sub1;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class651;
import com.jagex.Class681;
import com.jagex.Class700;
import java.util.Calendar;
import java.util.TimeZone;

public class Class93 {
   static String[][] aStringArrayArray900 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
   static Calendar aCalendar899 = Calendar.getInstance();
   static Calendar aCalendar898 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

   Class93() throws Throwable {
      throw new Error();
   }

   static final void method1215(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(null == Class315_Sub1.aClass243Array10033[var2]) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         String var3 = Class315_Sub1.aClass243Array10033[var2].aClass245Array2459[0].aString2494;
         if(var3 == null) {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         } else {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.substring(0, var3.indexOf(58));
         }
      }

   }

   static final void method1216(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)78);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class651.method7780(var3, var4, var0, 1035177611);
   }

   public static Class700 method1217(int var0) {
      return Class203.aClass700_2214 == null?Class700.aClass700_8777:Class203.aClass700_2214;
   }

   public static void method1218(int var0, byte var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(10, (long)var0);
      var2.method10583((byte)-27);
   }
}
