package com.jagex;

import com.jagex.Class199_Sub13;
import com.jagex.Class22;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class246;
import com.jagex.Class258;
import com.jagex.Class315_Sub1;
import com.jagex.Class545;
import com.jagex.Class592;
import com.jagex.Class681;
import com.jagex.Class93;
import java.util.Calendar;

public class Class617 {
   int[] anIntArray8101;
   static Class617 aClass617_8100 = new Class617();

   int method7310(int var1, byte var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.anIntArray8101.length && var1 >= this.anIntArray8101[var4]; ++var4) {
         var3 = 1 + var4;
      }

      return var3;
   }

   Class617(int[] var1) {
      if(null == var1) {
         throw new NullPointerException();
      } else {
         this.anIntArray8101 = var1;
         this.method7311('\uff00');
      }
   }

   final void method7311(int var1) {
      for(int var2 = 1; var2 < this.anIntArray8101.length; ++var2) {
         if(this.anIntArray8101[var2 - 1] < 0) {
            throw new IllegalArgumentException("Negative XP at pos:" + (var2 - 1));
         }

         if(this.anIntArray8101[var2] < this.anIntArray8101[var2 - 1]) {
            throw new IllegalArgumentException("XP goes backwards at pos:" + var2);
         }
      }

   }

   int method7312(int var1) {
      if(var1 < 1) {
         return 0;
      } else {
         if(var1 > this.anIntArray8101.length) {
            var1 = this.anIntArray8101.length;
         }

         return this.anIntArray8101[var1 - 1];
      }
   }

   int method7313(int var1, int var2) {
      if(var1 < 1) {
         return 0;
      } else {
         if(var1 > this.anIntArray8101.length) {
            var1 = this.anIntArray8101.length;
         }

         return this.anIntArray8101[var1 - 1];
      }
   }

   Class617() {
      this.anIntArray8101 = new int[120];
      int var1 = 0;

      for(int var2 = 0; var2 < 120; ++var2) {
         int var3 = 1 + var2;
         int var4 = (int)((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D));
         var1 += var4;
         this.anIntArray8101[var2] = var1 / 4;
      }

      this.method7311('\uff00');
   }

   final void method7314() {
      for(int var1 = 1; var1 < this.anIntArray8101.length; ++var1) {
         if(this.anIntArray8101[var1 - 1] < 0) {
            throw new IllegalArgumentException("Negative XP at pos:" + (var1 - 1));
         }

         if(this.anIntArray8101[var1] < this.anIntArray8101[var1 - 1]) {
            throw new IllegalArgumentException("XP goes backwards at pos:" + var1);
         }
      }

   }

   int method7315(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.anIntArray8101.length && var1 >= this.anIntArray8101[var3]; ++var3) {
         var2 = 1 + var3;
      }

      return var2;
   }

   int method7316(int var1) {
      if(var1 < 1) {
         return 0;
      } else {
         if(var1 > this.anIntArray8101.length) {
            var1 = this.anIntArray8101.length;
         }

         return this.anIntArray8101[var1 - 1];
      }
   }

   int method7317(int var1) {
      if(var1 < 1) {
         return 0;
      } else {
         if(var1 > this.anIntArray8101.length) {
            var1 = this.anIntArray8101.length;
         }

         return this.anIntArray8101[var1 - 1];
      }
   }

   int method7318(int var1) {
      if(var1 < 1) {
         return 0;
      } else {
         if(var1 > this.anIntArray8101.length) {
            var1 = this.anIntArray8101.length;
         }

         return this.anIntArray8101[var1 - 1];
      }
   }

   static final void method7319(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)42);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class246.method3390(var3, var4, var0, 1987207124);
   }

   static final void method7320(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(var2.startsWith(Class199_Sub13.method9016(0, 16711935)) || var2.startsWith(Class199_Sub13.method9016(1, 16711935))) {
         var2 = var2.substring(7);
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class592.method7023(var2, 2111791775);
   }

   public static String method7321(long var0, int var2, boolean var3, int var4) {
      Calendar var5;
      if(var3) {
         Class545.method6512(var0);
         var5 = Class93.aCalendar898;
      } else {
         Class258.method3514(var0);
         var5 = Class93.aCalendar899;
      }

      int var6 = var5.get(5);
      int var7 = var5.get(2);
      int var8 = var5.get(1);
      int var9 = var5.get(11);
      int var10 = var5.get(12);
      return var2 == 3?Class22.method675(var0, var2, var3, 2122982972):Integer.toString(var6 / 10) + var6 % 10 + "-" + Class93.aStringArrayArray900[var2][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
   }
}
