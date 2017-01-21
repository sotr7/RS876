package com.jagex;

import com.jagex.Class116;
import com.jagex.Class143;
import com.jagex.Class153;
import com.jagex.Class16;
import com.jagex.Class192;
import com.jagex.Class199_Sub9;
import com.jagex.Class206;
import com.jagex.Class212;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class277;
import com.jagex.Class317;
import com.jagex.Class327;
import com.jagex.Class394;
import com.jagex.Class452;
import com.jagex.Class5;
import com.jagex.Class526_Sub31;
import com.jagex.Class548;
import com.jagex.Class566;
import com.jagex.Class576;
import com.jagex.Class596;
import com.jagex.Class681;
import com.jagex.Class84;
import com.jagex.Interface14;
import com.jagex.Interface17;
import com.jagex.client;

final class Class288 implements Interface17 {
   static Class153[] aClass153Array3107;

   public Class143 method106(Class452 var1, int var2, int var3) {
      return (Class143)((Interface14)Class548.aMap7273.get(var1)).method89(var2, -1004647640);
   }

   public Class317 method109(int var1, int var2) {
      return (Class317)Class5.aClass40_Sub2_28.method89(var1, -820957065);
   }

   public Class143 method107(Class452 var1, int var2) {
      return (Class143)((Interface14)Class548.aMap7273.get(var1)).method89(var2, -598315974);
   }

   public Class143 method105(Class452 var1, int var2) {
      return (Class143)((Interface14)Class548.aMap7273.get(var1)).method89(var2, -1266230112);
   }

   public Class317 method108(int var1) {
      return (Class317)Class5.aClass40_Sub2_28.method89(var1, 306612722);
   }

   public Class317 method104(int var1) {
      return (Class317)Class5.aClass40_Sub2_28.method89(var1, 316493279);
   }

   static void method3809(int var0) {
      if(Class16.method622(-1295768202)) {
         if(null == Class116.aStringArray1427) {
            Class394.method4807(-1133118035);
         }

         Class116.aBool1433 = true;
         Class116.anInt1432 = 0;
         Class212.anIntArray2265 = new int[100];
         Class116.anIntArray1425 = new int[100];
         Class116.anIntArray1428 = new int[100];
         Class84.anIntArray851 = new int[100];

         for(int var1 = 0; var1 < 100; ++var1) {
            Class212.anIntArray2265[var1] = ((int)(Math.random() * (double)(1895615023 * Class566.anInt7611)) << 4) + (int)(Math.random() * 15.0D);
            Class116.anIntArray1425[var1] = (int)(Math.random() * 350.0D) << 4;
            Class116.anIntArray1428[var1] = (int)(Math.random() * 102.0D) + 51;
            Class84.anIntArray851[var1] = 8 + (int)(Math.random() * 48.0D);
         }

         Class199_Sub9.anIntArray9918 = new int[Class566.anInt7611 * 1895615023 >> 1];
      }

   }

   static void method3810(Class681 var0, int var1) {
      Class206.method2908((byte)89);
      Class192.method2786(var0, 1890774104);
   }

   static final void method3811(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3122(var2, (byte)10).method3023(2007988579);
   }

   static final void method3812(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      int var3 = var2 >> 14 & 16383;
      int var4 = var2 & 16383;
      Class596 var5 = client.aClass505_11204.method6128(1966311958);
      var3 -= -814686591 * var5.localX;
      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= client.aClass505_11204.method6056(-1746741811)) {
         var3 = client.aClass505_11204.method6056(-1746741811);
      }

      var4 -= -845789331 * var5.localY;
      if(var4 < 0) {
         var4 = 0;
      } else if(var4 >= client.aClass505_11204.method6057(126749238)) {
         var4 = client.aClass505_11204.method6057(126749238);
      }

      client.anInt11321 = -324587231 * (256 + (var3 << 9));
      client.anInt11043 = (256 + (var4 << 9)) * -1349776645;
      Class327.anInt3488 = 1107694142;
      Class576.anInt7740 = 1775818497;
      Class277.anInt3029 = -1852613725;
      client.aBool11070 = true;
   }

   static final void method3813(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2532 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * -633926309;
      Class526_Sub31.method9555(var0, (byte)10);
   }
}
