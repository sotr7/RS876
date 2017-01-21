package com.jagex;

import com.jagex.Class163;
import com.jagex.Class174;
import com.jagex.Class178;
import com.jagex.Class205;
import com.jagex.Class253;
import com.jagex.Class26;
import com.jagex.Class309;
import com.jagex.Class31;
import com.jagex.Class442;
import com.jagex.Class45;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub23_Sub4;
import com.jagex.Class526_Sub33;
import com.jagex.Class526_Sub8;
import com.jagex.Class578;
import com.jagex.Class592;
import com.jagex.Class609;
import com.jagex.Class627;
import com.jagex.Class64;
import com.jagex.Class711;
import com.jagex.client;

public class Class711_Sub41 extends Class711 {
   public static final int anInt10933 = 0;
   static final int anInt10934 = 1;

   int method8311() {
      return 1;
   }

   public Class711_Sub41(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   public void method10185(int var1) {
      if(0 != this.anInt8853 * 1174126091 && 1 != 1174126091 * this.anInt8853) {
         this.anInt8853 = this.method8320((byte)42) * 1568955811;
      }

   }

   int method8320(byte var1) {
      return 1;
   }

   int method8313(int var1, int var2) {
      return 1;
   }

   void method8315(int var1, int var2) {
      this.anInt8853 = var1 * 1568955811;
   }

   public int method10186(int var1) {
      return this.anInt8853 * 1174126091;
   }

   int method8316(int var1) {
      return 1;
   }

   void method8319(int var1) {
      this.anInt8853 = var1 * 1568955811;
   }

   int method8317(int var1) {
      return 1;
   }

   public Class711_Sub41(Class526_Sub33 var1) {
      super(var1);
   }

   public void method10187() {
      if(0 != this.anInt8853 * 1174126091 && 1 != 1174126091 * this.anInt8853) {
         this.anInt8853 = this.method8320((byte)58) * 1568955811;
      }

   }

   public int method10188() {
      return this.anInt8853 * 1174126091;
   }

   public int method10189() {
      return this.anInt8853 * 1174126091;
   }

   public int method10190() {
      return this.anInt8853 * 1174126091;
   }

   public int method10191() {
      return this.anInt8853 * 1174126091;
   }

   static void method10192(Class174 var0, int var1) {
      if((1600532433 * Class31.anInt273 >= 2 || client.aBool11276) && null == client.aClass245_11003) {
         String var2;
         if(client.aBool11276 && Class31.anInt273 * 1600532433 < 2) {
            var2 = client.aString11184 + Class45.aClass45_602.method920(Class26.aClass673_247, -827840379) + client.aString11271 + " " + Class64.aString741;
         } else if(Class178.method2667(-2145354825) && 1600532433 * Class31.anInt273 > 2) {
            var2 = Class253.method3471(Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631, (byte)39);
         } else {
            Class526_Sub21_Sub6 var3 = Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631;
            if(null == var3) {
               return;
            }

            var2 = Class253.method3471(var3, (byte)-56);
            int[] var4 = Class578.method6947(var3, -1406046645);
            if(var4 != null) {
               var2 = var2 + Class526_Sub8.method9341(var4, -1527287764);
            }
         }

         if(Class31.anInt273 * 1600532433 > 2) {
            var2 = var2 + Class592.method7026(16777215, -1950725566) + " / " + (Class31.anInt273 * 1600532433 - 2) + Class45.aClass45_518.method920(Class26.aClass673_247, -827840379);
         }

         if(null != Class31.aClass245_281) {
            Class163 var5 = Class31.aClass245_281.method3346(Class627.aClass418_8195, client.anInterface51_11046, -306309892);
            if(var5 == null) {
               var5 = Class609.aClass163_7930;
            }

            var5.method1902(var2, Class31.anInt282 * -660660543, Class31.anInt283 * 362738167, Class31.aClass245_281.anInt2510 * -99858407, Class31.aClass245_281.anInt2576 * -667181623, Class31.aClass245_281.anInt2611 * -1115067825, Class31.aClass245_281.anInt2533 * -1233094027, 2121807403 * Class31.aClass245_281.anInt2577, Class31.aClass245_281.anInt2578 * 1314786171, client.aRandom11163, Class309.anInt3378, client.anIntArray11250, Class442.aClass153Array4878, (int[])null, (byte)-92);
            Class205.method2895(client.anIntArray11250[0], client.anIntArray11250[1], client.anIntArray11250[2], client.anIntArray11250[3], -699647576);
         }

      }
   }
}
