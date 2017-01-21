package com.jagex;

import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class238;
import com.jagex.Class24;
import com.jagex.Class289;
import com.jagex.Class298;
import com.jagex.Class361_Sub1;
import com.jagex.Class46;
import com.jagex.Class474;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub35;
import com.jagex.Class561;
import com.jagex.Class676;
import com.jagex.Class681;
import com.jagex.Class689_Sub2;
import com.jagex.Class79;
import com.jagex.client;

public class Class565 {
   static int anInt7609;
   int anInt7605;
   int anInt7606;
   // $FF: synthetic field
   Class361_Sub1 this$0;
   Class561 aClass561_7603;
   byte[] aByteArray7600;
   byte[] aByteArray7601;
   float aFloat7604;
   int anInt7607;
   int anInt7608;
   int anInt7602;
   int anInt7599;

   int method6795(int var1) {
      return 887823061 * this.anInt7606;
   }

   void method6796(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 < var3 + var2; this.anInt7606 -= 550935802) {
         this.aByteArray7600[-1781631047 * this.anInt7605] = var1[var5];
         this.aByteArray7600[this.anInt7605 * -1781631047 + 1] = var1[var5 + 1];
         var5 += 2;
         this.anInt7605 += -1378304750;
         this.anInt7605 = -689152375 * (this.anInt7605 * -1781631047 % this.aByteArray7600.length);
      }

   }

   int method6797() {
      return 887823061 * this.anInt7606;
   }

   Class565(Class361_Sub1 var1, Class561 var2, int var3, float var4, int var5, int var6, boolean var7, boolean var8) {
      this.this$0 = var1;
      this.aClass561_7603 = var2;
      this.aByteArray7600 = new byte[var3];
      this.aByteArray7601 = new byte[var5 / 8];
      this.anInt7606 = 275467901 * this.aByteArray7600.length;
      this.aFloat7604 = var4;
      this.anInt7607 = 1762253033 * var5;
      this.anInt7608 = var6 * -597910621;
      this.anInt7605 = 0;
      this.anInt7602 = 0;
      this.anInt7599 = 0;
   }

   int method6798() {
      return 887823061 * this.anInt7606;
   }

   int method6799() {
      return 887823061 * this.anInt7606;
   }

   static final void method6800(Class681 var0, int var1) {
      if(Class195.aClass292_Sub1_2182.method3940(-677543258) != Class298.aClass298_3241) {
         throw new RuntimeException();
      } else {
         ((Class689_Sub2)Class195.aClass292_Sub1_2182.method3938((byte)19)).method10206(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], 1074844712);
      }
   }

   static final void method6801(Class174 var0, int var1, int var2, int var3, int var4, int var5) {
      var0.method2538(var1, var2, var1 + var3, var4 + var2);
      var0.method2356(var1, var2, var3, var4, -16777216, (byte)90);
      if(Class525_Sub1.anInt10714 * -1166497171 >= 100) {
         float var6 = (float)Class525_Sub1.anInt7110 / (float)Class525_Sub1.anInt7102;
         int var7 = var3;
         int var8 = var4;
         if(var6 < 1.0F) {
            var8 = (int)((float)var3 * var6);
         } else {
            var7 = (int)((float)var4 / var6);
         }

         var1 += (var3 - var7) / 2;
         var2 += (var4 - var8) / 2;
         if(Class526_Sub35.aClass153_10669 == null || Class526_Sub35.aClass153_10669.method1825() != var7 || Class526_Sub35.aClass153_10669.method1771() != var8) {
            Class525_Sub1.aClass192_7133 = Class525_Sub1.aClass192_7132;
            Class525_Sub1.method6327(Class525_Sub1.anInt7107, Class525_Sub1.anInt7150 + Class525_Sub1.anInt7110, Class525_Sub1.anInt7107 + Class525_Sub1.anInt7102, Class525_Sub1.anInt7150, var1, var2, var1 + var7, var2 + var8);
            Class525_Sub1.method6290(var0, false, false, client.aBool11230, true);
            var0.method2312();
            Class526_Sub35.aClass153_10669 = var0.method2311(var1, var2, var7, var8, true);
         }

         Class526_Sub35.aClass153_10669.method1778(var1, var2);
         int var9 = Class195.anInt2183 * 313661623 * var7 / Class525_Sub1.anInt7102;
         int var10 = 1008504821 * Class79.anInt821 * var8 / Class525_Sub1.anInt7110;
         int var11 = var1 + var7 * -612063223 * Class474.anInt5375 / Class525_Sub1.anInt7102;
         int var12 = var2 + var8 - 817705885 * Class24.anInt241 * var8 / Class525_Sub1.anInt7110 - var10;
         int var13 = -1996554240;
         if(client.aClass676_11127 == Class676.aClass676_8592) {
            var13 = -1996488705;
         }

         var0.method2290(var11, var12, var9, var10, var13, 1);
         var0.method2261(var11, var12, var9, var10, var13, 0);

         for(Class526_Sub35 var14 = (Class526_Sub35)Class525_Sub1.aClass702_7106.method8206((byte)42); var14 != null; var14 = (Class526_Sub35)Class525_Sub1.aClass702_7106.method8181(-424712690)) {
            Class238 var15 = (Class238)Class525_Sub1.aClass40_Sub6_7088.method89(var14.anInt10664 * -1572922363, -1520602138);
            if(Class289.method3823(var15, (byte)-65)) {
               Class46 var16 = (Class46)Class525_Sub1.aHashMap10718.get(Integer.valueOf(-1572922363 * var14.anInt10664));
               if(null == var16) {
                  var16 = (Class46)Class525_Sub1.aHashMap10719.get(Integer.valueOf(var15.anInt2442 * 831231597));
               }

               if(null != var16) {
                  int var17;
                  if(-1446591407 * var16.anInt640 > 1058088167 * Class525_Sub1.anInt10721 / 2) {
                     var17 = (-770457063 * Class525_Sub1.anInt10721 - var16.anInt640 * 486378671) / (1058088167 * Class525_Sub1.anInt10721);
                  } else {
                     var17 = 486378671 * var16.anInt640 / (Class525_Sub1.anInt10721 * 1058088167);
                  }

                  int var18 = var1 + 1427294417 * var14.anInt10665 * var7 / Class525_Sub1.anInt7102;
                  int var19 = (Class525_Sub1.anInt7110 - -1722563897 * var14.anInt10662) * var8 / Class525_Sub1.anInt7110 + var2;
                  var0.method2356(var18 - 2, var19 - 2, 4, 4, var17 << 24 | 16776960, (byte)69);
               }
            }
         }

         Class525_Sub1.aClass192_7132.method2769(5, (byte)-29);
      }
   }

   static final void method6802(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1204447689 * client.localPlayerIndex;
   }
}
