package com.jagex;

import com.jagex.Class1;
import com.jagex.Class114;
import com.jagex.Class163;
import com.jagex.Class174;
import com.jagex.Class199_Sub22;
import com.jagex.Class199_Sub4;
import com.jagex.Class219;
import com.jagex.Class225;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class26;
import com.jagex.Class264;
import com.jagex.Class283;
import com.jagex.Class292;
import com.jagex.Class304_Sub1;
import com.jagex.Class307;
import com.jagex.Class31;
import com.jagex.Class311;
import com.jagex.Class375;
import com.jagex.Class403;
import com.jagex.Class41;
import com.jagex.Class45;
import com.jagex.Class523;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class526_Sub25;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub35;
import com.jagex.Class526_Sub6;
import com.jagex.Class545;
import com.jagex.Class566;
import com.jagex.Class573;
import com.jagex.Class581;
import com.jagex.Class609;
import com.jagex.Class615;
import com.jagex.Class627;
import com.jagex.Class639_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class708;
import com.jagex.Class711_Sub36;
import com.jagex.Class8;
import com.jagex.Class80;
import com.jagex.client;

public class Class261 {
   public String aString2963;
   public String aString2964;

   void method3532(Class283 var1) {
      this.aString2963 = var1.method3715(-1770349274);
      this.aString2964 = var1.method3715(-1531777775);
   }

   void method3533(Class283 var1) {
      this.aString2963 = var1.method3715(-1734741856);
      this.aString2964 = var1.method3715(-1918057379);
   }

   void method3534(Class283 var1, byte var2) {
      this.aString2963 = var1.method3715(-2034968940);
      this.aString2964 = var1.method3715(-1094740453);
   }

   static void method3535(Class174 var0, int var1) {
      int var2 = Class41.anInt450 * 1183999269;
      int var3 = Class679.anInt8602 * 1581495531;
      int var4 = 2110689557 * Class219.anInt2295;
      int var5 = Class573.anInt7689 * 1622612179 - 3;
      byte var6 = 20;
      if(Class80.aClass163_824 == null || null == Class403.aClass1_4162) {
         Class80.aClass163_824 = (Class163)Class627.aClass418_8195.method4951(client.anInterface51_11046, 1534482055 * Class615.anInt8092, true, true, -1730576285);
         Class403.aClass1_4162 = Class627.aClass418_8195.method4964(client.anInterface51_11046, Class615.anInt8092 * 1534482055, (byte)2);
         if(null != Class80.aClass163_824 && Class403.aClass1_4162 != null) {
            Class114.method1400(-1632252349);
            int var15 = var2 + var4 / 2;
            if(var15 + var4 > Class566.anInt7611 * 1895615023) {
               var15 = 1895615023 * Class566.anInt7611 - var4;
            }

            if(var15 < 0) {
               var15 = 0;
            }

            Class264.method3548(var15, Class679.anInt8602 * 1581495531, (byte)-44);
            return;
         }
      }

      Class163 var7;
      if(Class80.aClass163_824 != null && null != Class403.aClass1_4162) {
         var7 = Class80.aClass163_824;
      } else {
         var7 = Class609.aClass163_7930;
      }

      Class1 var8 = Class526_Sub6.method9340(-1992508169);
      Class225.method3166(var0, Class41.anInt450 * 1183999269, Class679.anInt8602 * 1581495531, Class219.anInt2295 * 2110689557, 1622612179 * Class573.anInt7689, var6, var7, var8, Class45.aClass45_545.method920(Class26.aClass673_247, -827840379), 1222738811);
      int var9 = 255 - Class258.anInt2829 * 245769741 - -49472947 * Class31.anInt303;
      if(var9 < 0) {
         var9 = 0;
      }

      int var10 = Class8.aClass547_45.method6534(913428389);
      int var11 = Class8.aClass547_45.method6531(1292770152);
      int var12;
      Class526_Sub21_Sub6 var13;
      int var14;
      Class526_Sub21_Sub7 var16;
      if(!Class31.aBool266) {
         var12 = 0;

         for(var13 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)43); var13 != null; var13 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(2118418059)) {
            var14 = Class31.anInt262 * 414128345 * (Class31.anInt273 * 1600532433 - 1 - var12) + var3 + var6 + var8.anInt12 * 96898447 + 1;
            if(var10 > Class41.anInt450 * 1183999269 && var10 < Class219.anInt2295 * 2110689557 + 1183999269 * Class41.anInt450 && var11 > var14 - var8.anInt12 * 96898447 - 1 && var11 < var14 + -1329402501 * var8.anInt14 && var13.aBool11661) {
               var0.method2290(1183999269 * Class41.anInt450, var14 - var8.anInt12 * 96898447, Class219.anInt2295 * 2110689557, 414128345 * Class31.anInt262, var9 << 24 | Class199_Sub22.anInt9979 * -569172477, 1);
            }

            ++var12;
         }
      } else {
         var12 = 0;

         for(var16 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8143((byte)-1); null != var16; var16 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8139(68831625)) {
            var14 = 1 + var3 + var6 + 96898447 * var8.anInt12 + 414128345 * Class31.anInt262 * var12;
            if(var10 > Class41.anInt450 * 1183999269 && var10 < 1183999269 * Class41.anInt450 + 2110689557 * Class219.anInt2295 && var11 > var14 - var8.anInt12 * 96898447 - 1 && var11 < -1329402501 * var8.anInt14 + var14 && (-1095890769 * var16.anInt11664 > 1 || ((Class526_Sub21_Sub6)var16.aClass696_11662.aClass526_Sub21_8758.aClass526_Sub21_10531).aBool11661)) {
               var0.method2290(1183999269 * Class41.anInt450, var14 - 96898447 * var8.anInt12, Class219.anInt2295 * 2110689557, Class31.anInt262 * 414128345, var9 << 24 | Class199_Sub22.anInt9979 * -569172477, 1);
            }

            ++var12;
         }

         if(Class31.aClass526_Sub21_Sub7_267 != null) {
            Class225.method3166(var0, -679993307 * Class711_Sub36.anInt10917, Class311.anInt3384 * 660573447, -1423746299 * Class526_Sub25.anInt10551, 568451999 * Class523.anInt7075, var6, var7, var8, Class31.aClass526_Sub21_Sub7_267.aString11663, 1742576679);
            var12 = 0;

            for(var13 = (Class526_Sub21_Sub6)Class31.aClass526_Sub21_Sub7_267.aClass696_11662.method8143((byte)-1); var13 != null; var13 = (Class526_Sub21_Sub6)Class31.aClass526_Sub21_Sub7_267.aClass696_11662.method8139(68831625)) {
               var14 = var12 * 414128345 * Class31.anInt262 + 1 + var8.anInt12 * 96898447 + var6 + Class311.anInt3384 * 660573447;
               if(var10 > Class711_Sub36.anInt10917 * -679993307 && var10 < -1423746299 * Class526_Sub25.anInt10551 + -679993307 * Class711_Sub36.anInt10917 && var11 > var14 - 96898447 * var8.anInt12 - 1 && var11 < var14 + var8.anInt14 * -1329402501 && var13.aBool11661) {
                  var0.method2290(Class711_Sub36.anInt10917 * -679993307, var14 - var8.anInt12 * 96898447, Class526_Sub25.anInt10551 * -1423746299, Class31.anInt262 * 414128345, var9 << 24 | Class199_Sub22.anInt9979 * -569172477, 1);
               }

               ++var12;
            }

            Class581.method6968(var0, -679993307 * Class711_Sub36.anInt10917, 660573447 * Class311.anInt3384, Class526_Sub25.anInt10551 * -1423746299, 568451999 * Class523.anInt7075, var6, -1979884228);
         }
      }

      Class581.method6968(var0, 1183999269 * Class41.anInt450, Class679.anInt8602 * 1581495531, 2110689557 * Class219.anInt2295, 1622612179 * Class573.anInt7689, var6, -1972934140);
      if(!Class31.aBool266) {
         var12 = 0;

         for(var13 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)114); null != var13; var13 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(1578316850)) {
            var14 = (Class31.anInt273 * 1600532433 - 1 - var12) * 414128345 * Class31.anInt262 + 1 + 96898447 * var8.anInt12 + var6 + var3;
            Class199_Sub4.method8996(var10, var11, var2, var3, var4, var5, var14, var13, var7, var8, Class545.anInt7266 * -940975331 | -16777216, 2123946159 * Class292.anInt3177 | -16777216, (byte)0);
            ++var12;
         }
      } else {
         var12 = 0;

         for(var16 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8143((byte)-1); var16 != null; var16 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8139(68831625)) {
            var14 = var12 * 414128345 * Class31.anInt262 + 1 + var8.anInt12 * 96898447 + var6 + 1581495531 * Class679.anInt8602;
            if(1 == -1095890769 * var16.anInt11664) {
               Class199_Sub4.method8996(var10, var11, 1183999269 * Class41.anInt450, Class679.anInt8602 * 1581495531, Class219.anInt2295 * 2110689557, 1622612179 * Class573.anInt7689, var14, (Class526_Sub21_Sub6)var16.aClass696_11662.aClass526_Sub21_8758.aClass526_Sub21_10531, var7, var8, Class545.anInt7266 * -940975331 | -16777216, Class292.anInt3177 * 2123946159 | -16777216, (byte)0);
            } else {
               Class307.method4045(var10, var11, 1183999269 * Class41.anInt450, Class679.anInt8602 * 1581495531, 2110689557 * Class219.anInt2295, Class573.anInt7689 * 1622612179, var14, var16, var7, var8, Class545.anInt7266 * -940975331 | -16777216, 2123946159 * Class292.anInt3177 | -16777216, 2123315643);
            }

            ++var12;
         }

         if(null != Class31.aClass526_Sub21_Sub7_267) {
            var12 = 0;

            for(var13 = (Class526_Sub21_Sub6)Class31.aClass526_Sub21_Sub7_267.aClass696_11662.method8143((byte)-1); null != var13; var13 = (Class526_Sub21_Sub6)Class31.aClass526_Sub21_Sub7_267.aClass696_11662.method8139(68831625)) {
               var14 = 414128345 * Class31.anInt262 * var12 + var8.anInt12 * 96898447 + var6 + Class311.anInt3384 * 660573447 + 1;
               Class199_Sub4.method8996(var10, var11, -679993307 * Class711_Sub36.anInt10917, Class311.anInt3384 * 660573447, -1423746299 * Class526_Sub25.anInt10551, 568451999 * Class523.anInt7075, var14, var13, var7, var8, Class545.anInt7266 * -940975331 | -16777216, 2123946159 * Class292.anInt3177 | -16777216, (byte)0);
               ++var12;
            }
         }
      }

   }

   static final void method3536(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var2.anInt8623 -= 379191958;
      var0.anInt2520 = -1294178783 * var2.anIntArray8622[var2.anInt8623 * -1730576285];
      if(480812513 * var0.anInt2520 > var0.anInt2522 * -1379784909 - var0.anInt2510 * -99858407) {
         var0.anInt2520 = var0.anInt2522 * -411476077 - 2009809209 * var0.anInt2510;
      }

      if(var0.anInt2520 * 480812513 < 0) {
         var0.anInt2520 = 0;
      }

      var0.anInt2626 = var2.anIntArray8622[var2.anInt8623 * -1730576285 + 1] * -852138409;
      if(-1580669593 * var0.anInt2626 > 1525210059 * var0.anInt2523 - var0.anInt2576 * -667181623) {
         var0.anInt2626 = var0.anInt2523 * -1128492035 - var0.anInt2576 * -591547057;
      }

      if(var0.anInt2626 * -1580669593 < 0) {
         var0.anInt2626 = 0;
      }

      Class526_Sub31.method9555(var0, (byte)10);
      if(1300712985 * var0.componentSlot == -1 && !var1.aBool2458) {
         Class375.method4670(919258769 * var0.uid, -1874739564);
      }

   }

   static final void method3537(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 1?1:0;
   }

   public static Class708[] method3538(Class690 var0, int var1) {
      int[] var2 = var0.method8093((byte)51);
      Class708[] var3 = new Class708[var2.length >> 2];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class708 var5 = new Class708();
         var3[var4] = var5;
         var5.anInt8840 = 2006291113 * var2[var4 << 2];
         var5.anInt8839 = -236861867 * var2[(var4 << 2) + 1];
         var5.anInt8838 = 1700903537 * var2[(var4 << 2) + 2];
         var5.anInt8841 = 2026472381 * var2[(var4 << 2) + 3];
      }

      return var3;
   }

   static final void method3539(Class681 var0, byte var1) {
      Class304_Sub1.method9087((Class639_Sub1)var0.anInterface59_8636, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], true, (byte)6);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[0];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)client.aFloatArray11132[2];
   }

   public static int method3540(int var0, int var1, int var2, byte var3) {
      if(Class525_Sub1.anInt10714 * -1166497171 < 100) {
         return -2;
      } else {
         int var4 = -2;
         int var5 = Integer.MAX_VALUE;
         int var6 = var1 - Class525_Sub1.anInt7107;
         int var7 = var2 - Class525_Sub1.anInt7150;

         for(Class526_Sub35 var8 = (Class526_Sub35)Class525_Sub1.aClass702_7106.method8206((byte)102); null != var8; var8 = (Class526_Sub35)Class525_Sub1.aClass702_7106.method8181(409297223)) {
            if(var0 == -1572922363 * var8.anInt10664) {
               int var9 = var8.anInt10665 * 1427294417;
               int var10 = -1722563897 * var8.anInt10662;
               int var11 = var9 + Class525_Sub1.anInt7107 << 14 | Class525_Sub1.anInt7150 + var10;
               int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
               if(var4 < 0 || var12 < var5) {
                  var4 = var11;
                  var5 = var12;
               }
            }
         }

         return var4;
      }
   }
}
