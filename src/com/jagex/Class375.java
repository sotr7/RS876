package com.jagex;

import com.jagex.Class203;
import com.jagex.Class216;
import com.jagex.Class265;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class704_Sub3;
import com.jagex.RuntimeException_Sub3;
import java.io.DataInputStream;
import java.net.URL;

public class Class375 {
   public static int anInt3904;
   public static Class375 aClass375_3902 = new Class375();
   public static Class375 aClass375_3903 = new Class375();

   public static void method4670(int var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(12, (long)var0);
      var2.method10583((byte)-31);
   }

   public static void method4671(String var0, Throwable var1, byte var2) {
      try {
         String var3 = "";
         if(null != var1) {
            var3 = Class203.method2889(var1, -914575540);
         }

         if(var0 != null) {
            if(var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         Class704_Sub3.method10274(var3, -1152047033);
         var3 = Class216.method2985(var3, 561414905);
         URL var4 = null;
         if(RuntimeException_Sub3.anApplet12070 != null) {
            var4 = RuntimeException_Sub3.anApplet12070.getCodeBase();
         } else if(null != RuntimeException_Sub3.anInterface60_12071) {
            var4 = RuntimeException_Sub3.anInterface60_12071.method395(2066931318);
         }

         if(null == var4) {
            return;
         }

         String var5 = "Unknown";
         String var6 = "1.1";

         try {
            var5 = System.getProperty("java.vendor");
            var6 = System.getProperty("java.version");
         } catch (Exception var9) {
            ;
         }

         URL var7 = new URL(var4, "clienterror.ws?c=" + -758376409 * RuntimeException_Sub3.anInt12068 + "&cs=" + 606828171 * RuntimeException_Sub3.anInt12066 + "&u=" + (RuntimeException_Sub3.aString12069 != null?Class216.method2985(RuntimeException_Sub3.aString12069, 834519027):"" + RuntimeException_Sub3.aLong12067 * -235685049650010371L) + "&v1=" + Class216.method2985(var5, 1065733127) + "&v2=" + Class216.method2985(var6, 284578602) + "&e=" + var3);
         DataInputStream var8 = new DataInputStream(var7.openStream());
         var8.read();
         var8.close();
      } catch (Exception var10) {
       //  var10.printStackTrace();
      }

   }
}
