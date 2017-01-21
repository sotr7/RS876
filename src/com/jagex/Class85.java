package com.jagex;

import com.jagex.Class171;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class592;
import com.jagex.Class681;

public class Class85 {
   public static final int anInt853 = 8;

   Class85() throws Throwable {
      throw new Error();
   }

   static String method1181(Class526_Sub21_Sub7 var0, int var1) {
      return var0.aString11663 + Class592.method7026(16777215, 885125710) + " >";
   }

   static final void method1182(Class681 var0, int var1) {
      if(Class171.aClass553_2016.method6666(81, 585747142)) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   public static int method1183(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var7 + var1);
         if((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if(var8 == 8364) {
               var3[var4 + var7] = -128;
            } else if(8218 == var8) {
               var3[var4 + var7] = -126;
            } else if(402 == var8) {
               var3[var4 + var7] = -125;
            } else if(8222 == var8) {
               var3[var7 + var4] = -124;
            } else if(var8 == 8230) {
               var3[var7 + var4] = -123;
            } else if(8224 == var8) {
               var3[var4 + var7] = -122;
            } else if(var8 == 8225) {
               var3[var7 + var4] = -121;
            } else if(710 == var8) {
               var3[var7 + var4] = -120;
            } else if(var8 == 8240) {
               var3[var7 + var4] = -119;
            } else if(var8 == 352) {
               var3[var4 + var7] = -118;
            } else if(8249 == var8) {
               var3[var7 + var4] = -117;
            } else if(var8 == 338) {
               var3[var7 + var4] = -116;
            } else if(381 == var8) {
               var3[var4 + var7] = -114;
            } else if(8216 == var8) {
               var3[var7 + var4] = -111;
            } else if(8217 == var8) {
               var3[var4 + var7] = -110;
            } else if(var8 == 8220) {
               var3[var7 + var4] = -109;
            } else if(8221 == var8) {
               var3[var7 + var4] = -108;
            } else if(8226 == var8) {
               var3[var7 + var4] = -107;
            } else if(8211 == var8) {
               var3[var4 + var7] = -106;
            } else if(8212 == var8) {
               var3[var4 + var7] = -105;
            } else if(732 == var8) {
               var3[var7 + var4] = -104;
            } else if(8482 == var8) {
               var3[var7 + var4] = -103;
            } else if(var8 == 353) {
               var3[var7 + var4] = -102;
            } else if(8250 == var8) {
               var3[var4 + var7] = -101;
            } else if(339 == var8) {
               var3[var4 + var7] = -100;
            } else if(var8 == 382) {
               var3[var4 + var7] = -98;
            } else if(376 == var8) {
               var3[var7 + var4] = -97;
            } else {
               var3[var7 + var4] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }

   static final void method1184(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      int var3 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(-1 == var3) {
         throw new RuntimeException("");
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2 + (char)var3;
      }
   }
}
