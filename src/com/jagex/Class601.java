package com.jagex;

import com.jagex.Class24;
import com.jagex.Class255;
import com.jagex.Class285;
import com.jagex.Class304_Sub1;
import com.jagex.Class411;
import com.jagex.Class454;
import com.jagex.Class465;
import com.jagex.Class492;
import com.jagex.Class504;
import com.jagex.Class526_Sub20;
import com.jagex.Class53;
import com.jagex.Class585;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.client;

public class Class601 {
   public static final int anInt7874 = 128;
   public static final int anInt7875 = 9;
   public static final int anInt7876 = 512;
   public static final int anInt7877 = 511;
   public static final int anInt7878 = 1024;
   public static final int anInt7879 = 8;
   public static final int anInt7880 = 256;
   public static final int anInt7881 = 2;
   public static final int anInt7882 = 7;

   static {
      Math.sqrt(131072.0D);
   }

   Class601() throws Throwable {
      throw new Error();
   }

   static final void method7092(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      String var3 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(-1 == var2) {
         throw new RuntimeException();
      } else {
         Class24 var4 = (Class24)Class465.aClass40_Sub17_5321.method89(var2, -849193664);
         if(Class454.aClass454_4997 != var4.aClass454_234) {
            throw new RuntimeException();
         } else {
            int[] var5 = var4.method702(var3, -2076235212);
            int var6 = 0;
            if(var5 != null) {
               var6 = var5.length;
            }

            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var6;
         }
      }
   }

   static void method7093(String var0, int var1) {
      client.aString10983 = var0;
      if(Class585.method6988((byte)-25) != Class504.aClass504_5648) {
         try {
            String var2 = Class492.anApplet5526.getParameter(Class411.aClass411_4403.aString4408);
            String var3 = Class492.anApplet5526.getParameter(Class411.aClass411_4427.aString4408);
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            if(var0.length() == 0) {
               var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               var4 = var4 + "; Expires=" + Class526_Sub20.method9439(Class255.time((byte)24) + 94608000000L) + "; Max-Age=" + 94608000L;
            }

            Class53.method967(Class492.anApplet5526, "document.cookie=\"" + var4 + "\"", 948207089);
         } catch (Throwable var5) {
            ;
         }

      }
   }

   static void method7094(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], -1715673920)).aString3081;
   }

   static final void method7095(Class681 var0, int var1) {
      Class304_Sub1.method9087(var0.aClass639_Sub1_Sub2_Sub1_8635, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], true, (byte)6);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[0];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[2];
   }
}
