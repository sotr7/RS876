package com.jagex;

import com.jagex.Class210;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class322;
import com.jagex.Class439;
import com.jagex.Class443;
import com.jagex.Class487;
import com.jagex.Class547;
import com.jagex.Class605_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class695;
import com.jagex.Class76;
import com.jagex.client;

public final class Class675 {
   static char[] aCharArray8583 = new char[]{'\u005f', '\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066', '\u0067', '\u0068', '\u0069', '\u006a', '\u006b', '\u006c', '\u006d', '\u006e', '\u006f', '\u0070', '\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', '\u0078', '\u0079', '\u007a', '\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039'};
   static long[] aLongArray8584 = new long[12];

   static {
      for(int var0 = 0; var0 < aLongArray8584.length; ++var0) {
         aLongArray8584[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }

   Class675() throws Throwable {
      throw new Error();
   }

   static void method8009(InterfaceDef var0, int var1, int var2, int var3) {
      if(var0.aByte2500 == 0) {
         var0.anInt2569 = var0.anInt2478 * 1680119437;
      } else if(1 == var0.aByte2500) {
         var0.anInt2569 = (629742033 * var0.anInt2478 + (var1 - -99858407 * var0.anInt2510) / 2) * 341222397;
      } else if(2 == var0.aByte2500) {
         var0.anInt2569 = 341222397 * (var1 - -99858407 * var0.anInt2510 - var0.anInt2478 * 629742033);
      } else if(var0.aByte2500 == 3) {
         var0.anInt2569 = 341222397 * (629742033 * var0.anInt2478 * var1 >> 14);
      } else if(var0.aByte2500 == 4) {
         var0.anInt2569 = ((var1 - -99858407 * var0.anInt2510) / 2 + (var1 * var0.anInt2478 * 629742033 >> 14)) * 341222397;
      } else {
         var0.anInt2569 = (var1 - -99858407 * var0.anInt2510 - (var1 * 629742033 * var0.anInt2478 >> 14)) * 341222397;
      }

      if(var0.aByte2501 == 0) {
         var0.anInt2572 = 912607773 * var0.anInt2505;
      } else if(var0.aByte2501 == 1) {
         var0.anInt2572 = ((var2 - -667181623 * var0.anInt2576) / 2 + 1232344985 * var0.anInt2505) * 1376094501;
      } else if(2 == var0.aByte2501) {
         var0.anInt2572 = (var2 - -667181623 * var0.anInt2576 - 1232344985 * var0.anInt2505) * 1376094501;
      } else if(3 == var0.aByte2501) {
         var0.anInt2572 = (1232344985 * var0.anInt2505 * var2 >> 14) * 1376094501;
      } else if(var0.aByte2501 == 4) {
         var0.anInt2572 = 1376094501 * ((var2 - -667181623 * var0.anInt2576) / 2 + (var2 * var0.anInt2505 * 1232344985 >> 14));
      } else {
         var0.anInt2572 = (var2 - var0.anInt2576 * -667181623 - (1232344985 * var0.anInt2505 * var2 >> 14)) * 1376094501;
      }

      if(client.aBool11192 && (client.method10311(var0).anInt10547 * -798296491 != 0 || 0 == -449120703 * var0.type)) {
         if(383963477 * var0.anInt2569 < 0) {
            var0.anInt2569 = 0;
         } else if(var0.anInt2569 * 383963477 + -99858407 * var0.anInt2510 > var1) {
            var0.anInt2569 = (var1 - var0.anInt2510 * -99858407) * 341222397;
         }

         if(var0.anInt2572 * 1724213933 < 0) {
            var0.anInt2572 = 0;
         } else if(var0.anInt2576 * -667181623 + 1724213933 * var0.anInt2572 > var2) {
            var0.anInt2572 = (var2 - var0.anInt2576 * -667181623) * 1376094501;
         }
      }

   }

   static final void method8010(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var6 - 334;
      if(var8 < 0) {
         var8 = 0;
      } else if(var8 > 100) {
         var8 = 100;
      }

      int var9 = var8 * (client.aShort11277 - client.aShort11185) / 100 + client.aShort11185;
      var5 = var9 * var5 >> 8;
      int var10 = 16384 - var3 & 16383;
      int var11 = 16384 - var4 & 16383;
      int var12 = 0;
      int var13 = 0;
      int var14 = var5;
      if(0 != var10) {
         var13 = Class443.anIntArray4895[var10] * -var5 >> 14;
         var14 = var5 * Class443.anIntArray4896[var10] >> 14;
      }

      if(var11 != 0) {
         var12 = Class443.anIntArray4895[var11] * var14 >> 14;
         var14 = Class443.anIntArray4896[var11] * var14 >> 14;
      }

      Class439.anInt4866 = (var0 - var12) * 1307632361;
      Class322.anInt3458 = 1608934313 * (var1 - var13);
      Class210.anInt2259 = -2013648709 * (var2 - var14);
      Class487.anInt5511 = var3 * -567045205;
      Class317.anInt3410 = -1157073499 * var4;
      Class547.anInt7272 = 0;
   }

   static final void method8011(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-87);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class605_Sub1.method9744(var3, var4, var0, 1279984097);
   }

   static final void method8012(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class695.method8131(var3, var4, var0, 1768250823);
   }

   static void method8013(Class681 var0, int var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1], -1882622890)).anInt3083 * -250286175;
   }
}
