package com.jagex;

import com.jagex.Class11;
import com.jagex.Class171;
import com.jagex.Class197;
import com.jagex.Class448_Sub1;
import com.jagex.Class497;
import com.jagex.Class526_Sub20;
import com.jagex.Class526_Sub3;
import com.jagex.Class592;
import com.jagex.Class594;
import com.jagex.Class681;
import com.jagex.client;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Class588 {
   int anInt7800;
   static Class588 aClass588_7799 = new Class588(0);
   static Class588 aClass588_7801 = new Class588(1);
   static Class588 aClass588_7798 = new Class588(2);

   Class588(int var1) {
      this.anInt7800 = var1 * 1662920707;
   }

   public static boolean method6997(int var0, int var1) {
      return var0 >= -1226971375 * Class594.aClass594_7831.anInt7833 && var0 <= Class594.aClass594_7829.anInt7833 * -1226971375;
   }

   static final void method6998(Class681 var0, int var1) {
      if(Class171.aClass553_2016.method6666(86, 987609326)) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method6999(Class681 var0, byte var1) {
      throw new RuntimeException("");
   }

   public static boolean method7000(byte var0) {
      String var4;
      if(Class497.aString5565.startsWith("win")) {
         String var9 = "msvcr110.dll";
         String var10 = "msvcp110.dll";
         String[] var12 = new String[]{var9, var10};
         var4 = System.getenv("WINDIR");
         if(var4 == "") {
            return false;
         } else {
            for(int var5 = 0; var5 < var12.length; ++var5) {
               File var6 = new File(var4 + "\\system32\\" + var12[var5]);
               if(!var6.exists() || var6.isDirectory()) {
                  return false;
               }
            }

            return true;
         }
      } else if(Class497.aString5565.startsWith("mac")) {
         try {
            Process var1 = Runtime.getRuntime().exec("ps -few");
            BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream()));

            try {
               int var3 = var1.waitFor();
               if(var3 != 0) {
                  return false;
               }
            } catch (InterruptedException var7) {
               return false;
            }

            boolean var11 = false;

            while((var4 = var2.readLine()) != null) {
               if(var4.toLowerCase().indexOf("soundflowerbed") != -1) {
                  var11 = true;
                  break;
               }
            }

            var2.close();
            return var11;
         } catch (Exception var8) {
            return false;
         }
      } else {
         return false;
      }
   }

   static void method7001(int var0, int var1, int var2, Class526_Sub3 var3, byte var4) {
      long var5 = (long)(var0 << 28 | var2 << 14 | var1);
      Class526_Sub20 var7 = (Class526_Sub20)client.aClass20_11259.get(var5);
      if(var7 == null) {
         var7 = new Class526_Sub20();
         client.aClass20_11259.put(var7, var5);
         var7.aClass702_10529.method8176(var3, -1000679988);
      } else {
         Class11 var8 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(-1804739063 * var3.anInt10370, -506784631);
         int var9 = 1340589957 * var8.anInt92;
         if(1 == 1095415197 * var8.anInt116) {
            var9 *= 1 + var3.anInt10371 * 2030746333;
         }

         for(Class526_Sub3 var10 = (Class526_Sub3)var7.aClass702_10529.method8206((byte)99); var10 != null; var10 = (Class526_Sub3)var7.aClass702_10529.method8181(755908278)) {
            var8 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var10.anInt10370 * -1804739063, -589968150);
            int var11 = 1340589957 * var8.anInt92;
            if(1 == var8.anInt116 * 1095415197) {
               var11 *= var10.anInt10371 * 2030746333 + 1;
            }

            if(var9 > var11) {
               Class197.method2840(var3, var10, (short)9744);
               return;
            }
         }

         var7.aClass702_10529.method8176(var3, -1692446922);
      }
   }

   static String method7002(int var0, int var1, int var2) {
      int var3 = var1 - var0;
      return var3 < -9?Class592.method7026(16711680, -402784006):(var3 < -6?Class592.method7026(16723968, -646268649):(var3 < -3?Class592.method7026(16740352, 757341875):(var3 < 0?Class592.method7026(16756736, -1406450929):(var3 > 9?Class592.method7026('\uff00', -977113406):(var3 > 6?Class592.method7026(4259584, -962912831):(var3 > 3?Class592.method7026(8453888, -900041374):(var3 > 0?Class592.method7026(12648192, 627699211):Class592.method7026(16776960, 1948095259))))))));
   }
}
