package com.jagex;

import com.jagex.Class105;
import com.jagex.Class111;
import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class199_Sub12;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class261;
import com.jagex.Class283;
import com.jagex.Class375;
import com.jagex.PacketFrameDecoder;
import com.jagex.Class451;
import com.jagex.Class460_Sub1;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.Class536;
import com.jagex.Class542;
import com.jagex.Class596;
import com.jagex.Class605_Sub1;
import com.jagex.Class64;
import com.jagex.Class659;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711_Sub9;
import com.jagex.Exception_Sub2;
import com.jagex.client;
import java.io.IOException;

public class Class266 {
   static boolean aBool2981;
   public static long aLong2982;
   public String aString2977;
   public String aString2976;
   public String aString2978;
   public Class261[] aClass261Array2979;
   public Class261[] aClass261Array2980;

   void method3561(Class283 var1, byte var2) {
      this.aString2977 = var1.method3715(-1261077762);
      this.aString2976 = var1.method3715(-1700717448);
      this.aString2978 = var1.method3715(-2046319360);
      int var3 = var1.method3714((byte)79);
      int var4 = var1.method3714((byte)92);
      this.aClass261Array2979 = 0 == var3?null:new Class261[var3];
      this.aClass261Array2980 = 0 == var4?null:new Class261[var4];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         this.aClass261Array2979[var5] = new Class261();
         this.aClass261Array2979[var5].method3534(var1, (byte)0);
      }

      for(var5 = 0; var5 < var4; ++var5) {
         this.aClass261Array2980[var5] = new Class261();
         this.aClass261Array2980[var5].method3534(var1, (byte)0);
      }

   }

   void method3562(Class283 var1) {
      this.aString2977 = var1.method3715(-1521095755);
      this.aString2976 = var1.method3715(-1372191154);
      this.aString2978 = var1.method3715(-2125621734);
      int var2 = var1.method3714((byte)21);
      int var3 = var1.method3714((byte)52);
      this.aClass261Array2979 = 0 == var2?null:new Class261[var2];
      this.aClass261Array2980 = 0 == var3?null:new Class261[var3];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         this.aClass261Array2979[var4] = new Class261();
         this.aClass261Array2979[var4].method3534(var1, (byte)0);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         this.aClass261Array2980[var4] = new Class261();
         this.aClass261Array2980[var4].method3534(var1, (byte)0);
      }

   }

   void method3563(Class283 var1) {
      this.aString2977 = var1.method3715(-1761596227);
      this.aString2976 = var1.method3715(-2032919530);
      this.aString2978 = var1.method3715(-1602662602);
      int var2 = var1.method3714((byte)106);
      int var3 = var1.method3714((byte)100);
      this.aClass261Array2979 = 0 == var2?null:new Class261[var2];
      this.aClass261Array2980 = 0 == var3?null:new Class261[var3];

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         this.aClass261Array2979[var4] = new Class261();
         this.aClass261Array2979[var4].method3534(var1, (byte)0);
      }

      for(var4 = 0; var4 < var3; ++var4) {
         this.aClass261Array2980[var4] = new Class261();
         this.aClass261Array2980[var4].method3534(var1, (byte)0);
      }

   }

   public static void method3564(int var0, short var1) {
      Class536.anInt7200 = var0 * 285260601;
   }

   static final void method3565(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub9_10618.method9924(1504104882) == 1?1:0;
   }

   static final void method3566(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -44227417 * Class199_Sub12.anInt9933;
   }

   static void method3567(Class174 var0, byte var1) {
      if(Class451.localPlayer.aByte10827 != -41664749 * Class105.anInt1290) {
         if(client.aClass505_11204.method6072(-714831386) != null) {
            Class255.time((byte)24);
            if(Class605_Sub1.method9743(var0, Class451.localPlayer.aByte10827, (byte)-14)) {
               Class105.anInt1290 = Class451.localPlayer.aByte10827 * -1764531429;
            }

         }
      }
   }

   static final void method3568(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class711_Sub9.method9929(var3, var4, var0, -531832779);
   }

   static final boolean method3569(Class111 var0, int var1) {
      try {
         return PacketFrameDecoder.method4793(var0, (byte)87);
      } catch (IOException var6) {
         if(-558705405 * client.anInt11038 == 8) {
            var0.method1370((byte)119);
            return false;
         } else {
            Class199_Sub12.method9012(-1502591779);
            return true;
         }
      } catch (Exception var7) {
         Class596 var3 = client.aClass505_11204.method6128(2066676401);
         String var4 = (var0.CURRENT_FRAME != null?1119796895 * var0.CURRENT_FRAME.id:-1) + Class64.aString738 + (var0.aClass420_1351 != null?1119796895 * var0.aClass420_1351.id:-1) + Class64.aString738 + (null != var0.aClass420_1352?var0.aClass420_1352.id * 1119796895:-1) + " " + var0.currentFrame * -1225783061 + Class64.aString738 + (Class451.localPlayer.screenX[0] + var3.localX * -814686591) + Class64.aString738 + (var3.localY * -845789331 + Class451.localPlayer.screenY[0]) + " ";

         for(int var5 = 0; var5 < var0.currentFrame * -1225783061 && var5 < 50; ++var5) {
            var4 = var4 + var0.buffer.buffer[var5] + Class64.aString738;
         }

         Class375.method4671(var4, var7, (byte)126);
         Class460_Sub1.logout(false, -1730576285);
         return true;
      }
   }

   static final void method3570(Class681 var0, byte var1) throws Exception_Sub2 {
      Class195.aClass292_Sub1_2182.method3898(-1041833782);
   }

   static final void method3571(Class681 var0, int var1) {
      int var2 = var0.anIntArray8642[-244840757 * var0.anInt8644];
      Class526_Sub21_Sub19 var3 = Class542.method6485(var2, -1398482913);
      if(var3 == null) {
         throw new RuntimeException();
      } else {
         int[] var4 = new int[var3.anInt11865 * -2142922607];
         Object[] var5 = new Object[var3.anInt11869 * -790376653];
         long[] var6 = new long[-1134111333 * var3.anInt11864];

         int var7;
         for(var7 = 0; var7 < var3.anInt11862 * 1493278357; ++var7) {
            var4[var7] = var0.anIntArray8622[var0.anInt8623 * -1730576285 - var3.anInt11862 * 1493278357 + var7];
         }

         for(var7 = 0; var7 < var3.anInt11857 * 1707024213; ++var7) {
            var5[var7] = var0.anObjectArray8624[var7 + (540934629 * var0.anInt8625 - 1707024213 * var3.anInt11857)];
         }

         for(var7 = 0; var7 < var3.anInt11867 * 1145942615; ++var7) {
            var6[var7] = var0.aLongArray8626[var0.anInt8630 * -1032509157 - 1145942615 * var3.anInt11867 + var7];
         }

         var0.anInt8623 -= -1360459097 * var3.anInt11862;
         var0.anInt8625 -= -1583116111 * var3.anInt11857;
         var0.anInt8630 -= var3.anInt11867 * -1080734859;
         Class659 var8 = new Class659();
         var8.aClass526_Sub21_Sub19_8509 = var0.aClass526_Sub21_Sub19_8629;
         var8.anInt8510 = -1104984359 * var0.anInt8644;
         var8.anIntArray8513 = var0.anIntArray8643;
         var8.anObjectArray8512 = var0.anObjectArray8618;
         var8.aLongArray8511 = var0.aLongArray8619;
         if(1253690475 * var0.anInt8617 >= var0.aClass659Array8639.length) {
            throw new RuntimeException();
         } else {
            var0.aClass659Array8639[(var0.anInt8617 += 1811841091) * 1253690475 - 1] = var8;
            var0.aClass526_Sub21_Sub19_8629 = var3;
            var0.aClass508Array8634 = var0.aClass526_Sub21_Sub19_8629.aClass508Array11859;
            var0.anIntArray8642 = var0.aClass526_Sub21_Sub19_8629.anIntArray11860;
            var0.anInt8644 = 873681181;
            var0.anIntArray8643 = var4;
            var0.anObjectArray8618 = var5;
            var0.aLongArray8619 = var6;
         }
      }
   }
}
