package com.jagex;

import com.jagex.Class105;
import com.jagex.Class116;
import com.jagex.Class448_Sub1;
import com.jagex.Class526;
import com.jagex.Class580;
import com.jagex.Interface76;
import com.jagex.client;

public class Class300 implements Interface76 {
   public static Class448_Sub1[] aClass448_Sub1Array3253;
   static int anInt3254;
   int anInt3252;
   static Class300 aClass300_3249 = new Class300(0);
   static Class300 aClass300_3250 = new Class300(1);
   static Class300 aClass300_3251 = new Class300(2);

   public int method21() {
      return 1905783513 * this.anInt3252;
   }

   public int getId() {
      return 1905783513 * this.anInt3252;
   }

   Class300(int var1) {
      this.anInt3252 = -31494807 * var1;
   }

   public static int method3992(int var0, int var1, float var2, int var3) {
      return Class580.method6965(var0, var1, (int)var2, 1642180612);
   }

   static void method3993(int var0, int var1) {
      for(Class526 var2 = client.aClass20_11087.method638(1551009788); null != var2; var2 = client.aClass20_11087.method639(-1177890417)) {
         if((long)var0 == (var2.aLong7156 * -6805155999452426801L >> 48 & 65535L)) {
            var2.method6332(-1949449864);
         }
      }

   }

   static void method3994(byte var0) {
      Class105.anInt1304 = 0;
      Class105.anInt1290 = 1764531429;
      Class105.anInt1300 = 2110507933;
      Class105.anInt1301 = 1654212593;
   }

   static boolean method3995(int var0) {
      return Class116.aBool1433;
   }
}
