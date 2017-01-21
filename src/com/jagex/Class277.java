package com.jagex;

import com.jagex.Class113;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class189;
import com.jagex.Class190;
import com.jagex.Class195;
import com.jagex.Class196;
import com.jagex.Class199;
import com.jagex.Class200;
import com.jagex.Class201;
import com.jagex.Class207;
import com.jagex.Class230;
import com.jagex.Class27;
import com.jagex.Class279;
import com.jagex.Class298;
import com.jagex.Class307;
import com.jagex.Class310;
import com.jagex.Class329_Sub2;
import com.jagex.Class342;
import com.jagex.Class436;
import com.jagex.Class446;
import com.jagex.Class449;
import com.jagex.Class522;
import com.jagex.Class526;
import com.jagex.Class526_Sub10;
import com.jagex.RSByteBuffer;
import com.jagex.Class56;
import com.jagex.Class577;
import com.jagex.Class585;
import com.jagex.Class609;
import com.jagex.Class645;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class689_Sub3;
import com.jagex.Class70;
import com.jagex.Interface76;
import com.jagex.client;

public class Class277 implements Interface76 {
   public static Class56 aClass56_3028;
   public static int anInt3029;
   int anInt3027;
   static Class277 aClass277_3023 = new Class277(0);
   static Class277 aClass277_3024 = new Class277(1);
   static Class277 aClass277_3025 = new Class277(2);
   static Class277 aClass277_3026 = new Class277(3);

   public int method21() {
      return -433272131 * this.anInt3027;
   }

   public int getId() {
      return -433272131 * this.anInt3027;
   }

   Class277(int var1) {
      this.anInt3027 = var1 * -1652162411;
   }

   static final void method3672(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(Class526.aString7159 != null && Class526.aString7159.equalsIgnoreCase(var2)) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method3673(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class27.anInt251 * -597909137;
   }

   public static Class168 method3674(Class174 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = (long)var5;
      Class168 var9 = (Class168)Class113.aClass192_1369.method2765(var7);
      short var10 = 2055;
      if(var9 == null) {
         Class170 var11 = Class170.method2146(Class577.aClass466_7744, var5, 0);
         if(var11 == null) {
            return null;
         }

         if(var11.anInt1942 < 13) {
            var11.method2148(2);
         }

         var9 = var0.method2321(var11, var10, -2046694615 * Class609.anInt7931, 64, 768);
         Class113.aClass192_1369.method2768(var9, var7);
      }

      var9 = var9.method1947((byte)6, var10, true);
      if(0 != var1) {
         var9.method1951(var1);
      }

      if(0 != var2) {
         var9.method2076(var2);
      }

      if(var3 != 0) {
         var9.method1954(var3);
      }

      if(var4 != 0) {
         var9.method1955(0, var4, 0);
      }

      return var9;
   }

   public static boolean method3675(int var0, int var1) {
      if(Class189.anInt2156 * -1863091385 != var0 || Class189.aClass201_2159 == null) {
         Class449.method5339(-823029724);
         Class189.aClass201_2159 = Class201.aClass201_2209;
         Class189.anInt2156 = 261471863 * var0;
      }

      int var4;
      if(Class189.aClass201_2159 == Class201.aClass201_2209) {
         byte[] var2 = Class310.aClass466_3382.method5541(var0, 16777472);
         if(var2 == null) {
            return false;
         }

         RSByteBuffer var3 = new RSByteBuffer(var2);
         Class70.method1089(var3, 1612842937);
         var4 = var3.readUnsignedByte(-1581390157);

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            Class189.aClass702_2160.method8176(new Class526_Sub10(var3), -2118266055);
         }

         var5 = var3.readSmart(-552895204);
         Class279.aClass196Array3033 = new Class196[var5];

         int var6;
         for(var6 = 0; var6 < var5; ++var6) {
            Class279.aClass196Array3033[var6] = new Class196(var3);
         }

         var6 = var3.readSmart(-1395885172);
         Class645.aClass207Array8445 = new Class207[var6];

         int var7;
         for(var7 = 0; var7 < var6; ++var7) {
            Class645.aClass207Array8445[var7] = new Class207(var3, var7);
         }

         var7 = var3.readSmart(-187016431);
         Class189.aClass190Array2149 = new Class190[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            Class189.aClass190Array2149[var8] = new Class190(var3);
         }

         var8 = var3.readSmart(-161973459);
         Class189.aClass200Array2150 = new Class200[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            Class189.aClass200Array2150[var9] = new Class200(var3);
         }

         var9 = var3.readSmart(-2124760062);
         Class189.aClass199Array2148 = new Class199[var9];

         for(int var10 = 0; var10 < var9; ++var10) {
            Class189.aClass199Array2148[var10] = Class342.method4426(var3, -2050820476);
         }

         Class189.aClass201_2159 = Class201.aClass201_2208;
      }

      if(Class189.aClass201_2159 == Class201.aClass201_2208) {
         boolean var11 = true;
         Class207[] var12 = Class645.aClass207Array8445;

         for(var4 = 0; var4 < var12.length; ++var4) {
            Class207 var15 = var12[var4];
            if(!var15.method2914(-1316784193)) {
               var11 = false;
            }
         }

         Class199[] var13 = Class189.aClass199Array2148;

         for(var4 = 0; var4 < var13.length; ++var4) {
            Class199 var16 = var13[var4];
            if(!var16.method2853((byte)16)) {
               var11 = false;
            }
         }

         Class190[] var14 = Class189.aClass190Array2149;

         for(var4 = 0; var4 < var14.length; ++var4) {
            Class190 var17 = var14[var4];
            if(!var17.method2752((byte)0)) {
               var11 = false;
            }
         }

         if(!var11) {
            return false;
         }

         Class189.aClass201_2159 = Class201.aClass201_2207;
      }

      return true;
   }

   static final void method3676(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297 && Class195.aClass292_Sub1_2182.method3940(-513843061) == Class298.aClass298_3237) {
         Class329_Sub2 var3 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-1900688660);
         Class689_Sub3 var4 = (Class689_Sub3)Class195.aClass292_Sub1_2182.method3938((byte)-47);
         Class446 var5 = var3.method9112(855911122);
         Class446 var6 = Class446.method5305(var5);
         var6.aFloat4915 += (float)var2;
         Class446 var7 = Class446.method5275(var4.method8073(1160944090), var6);
         var7.method5311();
         float var8 = var3.method9108(-1732802804).method5276();
         Class436.method5149(var4.method8073(1990419071), var7, var5, var8, Class680.aClass446Array8609);
         Class446 var9 = null;
         if(Class680.aClass446Array8609[0] == null) {
            throw new RuntimeException("");
         } else {
            if(Class680.aClass446Array8609[1] == null) {
               var9 = Class680.aClass446Array8609[0];
            } else if(Class446.method5275(var4.method8073(697200049), Class680.aClass446Array8609[0]).method5276() < Class446.method5275(var4.method8073(1415854231), Class680.aClass446Array8609[1]).method5276()) {
               var9 = Class680.aClass446Array8609[1];
            } else {
               var9 = Class680.aClass446Array8609[0];
            }

            float var10 = Class585.method6990(var5.aFloat4917 - var9.aFloat4917, var5.aFloat4919 - var9.aFloat4919, -1653770443);
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)(2607.5945876176133D * (double)var10) & 16383;
         }
      } else {
         throw new RuntimeException();
      }
   }

   static final void method3677(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub31_10635, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] != 0?1:0, (short)-10632);
      Class522.method6257(-1042127423);
      client.aClass505_11204.method6078(-2074391417);
   }
}
