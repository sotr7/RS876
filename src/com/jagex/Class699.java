package com.jagex;

import com.jagex.Class206;
import com.jagex.Class230;
import com.jagex.Class273;
import com.jagex.Class358;
import com.jagex.Class40_Sub15;
import com.jagex.Class452_Sub5;
import com.jagex.Class526_Sub21_Sub11;
import com.jagex.Class554;
import com.jagex.client;

public class Class699 {
   boolean aBool8767 = false;
   int anInt8769;
   Class526_Sub21_Sub11 aClass526_Sub21_Sub11_8771;
   Class526_Sub21_Sub11 aClass526_Sub21_Sub11_8770;
   int anInt8768;
   int anInt8772;

   final void method8165() {
      this.aBool8767 = false;
      this.anInt8769 = 0;
      this.aClass526_Sub21_Sub11_8771 = null;
      this.aClass526_Sub21_Sub11_8770 = null;
   }

   final boolean method8166(Class40_Sub15 var1, Class206 var2, int var3, int var4, int[] var5, int var6) {
      if(!this.aBool8767) {
         if(var3 >= var5.length) {
            return false;
         } else {
            this.anInt8768 = var5[var3] * -1473648381;
            this.aClass526_Sub21_Sub11_8770 = var1.method10278(this.anInt8768 * -212153941 >> 16, -1724270844);
            this.anInt8768 = -1473648381 * (this.anInt8768 * -212153941 & '\uffff');
            if(null != this.aClass526_Sub21_Sub11_8770) {
               if(var2.aBool2223 && var4 != -1 && var4 < var5.length) {
                  this.anInt8772 = var5[var4] * 2112336183;
                  this.aClass526_Sub21_Sub11_8771 = var1.method10278(this.anInt8772 * 1819333767 >> 16, -1724270844);
                  this.anInt8772 = (this.anInt8772 * 1819333767 & '\uffff') * 2112336183;
               }

               if(var2.aBool2239) {
                  this.anInt8769 = (this.anInt8769 * -329479277 | 512) * -2025502053;
               }

               if(this.aClass526_Sub21_Sub11_8770.method10644(this.anInt8768 * -212153941, -1651881368)) {
                  this.anInt8769 = (-329479277 * this.anInt8769 | 128) * -2025502053;
               }

               if(this.aClass526_Sub21_Sub11_8770.method10641(-212153941 * this.anInt8768, 1566060198)) {
                  this.anInt8769 = (-329479277 * this.anInt8769 | 256) * -2025502053;
               }

               if(this.aClass526_Sub21_Sub11_8770.method10645(-212153941 * this.anInt8768, -185983545)) {
                  this.anInt8769 = (this.anInt8769 * -329479277 | 1024) * -2025502053;
               }

               if(this.aClass526_Sub21_Sub11_8771 != null) {
                  if(this.aClass526_Sub21_Sub11_8771.method10644(this.anInt8772 * 1819333767, -2139009406)) {
                     this.anInt8769 = -2025502053 * (-329479277 * this.anInt8769 | 128);
                  }

                  if(this.aClass526_Sub21_Sub11_8771.method10641(1819333767 * this.anInt8772, -269847299)) {
                     this.anInt8769 = (-329479277 * this.anInt8769 | 256) * -2025502053;
                  }

                  if(this.aClass526_Sub21_Sub11_8771.method10645(1819333767 * this.anInt8772, 1338552431)) {
                     this.anInt8769 = -2025502053 * (this.anInt8769 * -329479277 | 1024);
                  }
               }

               this.anInt8769 = -2025502053 * (this.anInt8769 * -329479277 | 32);
               this.aBool8767 = true;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return true;
      }
   }

   final void method8167(int var1) {
      this.aBool8767 = false;
      this.anInt8769 = 0;
      this.aClass526_Sub21_Sub11_8771 = null;
      this.aClass526_Sub21_Sub11_8770 = null;
   }

   final void method8168() {
      this.aBool8767 = false;
      this.anInt8769 = 0;
      this.aClass526_Sub21_Sub11_8771 = null;
      this.aClass526_Sub21_Sub11_8770 = null;
   }

   public static void method8169(int var0) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10619, 2, (short)-27604);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10627, 2, (short)-17752);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub11_10609, 1, (short)-13732);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub31_10635, 1, (short)-3068);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub39_10617, 1, (short)-4533);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub20_10616, 1, (short)-2369);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub3_10644, 1, (short)-31045);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub17_10601, 1, (short)-1674);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub1_10622, 2, (short)-19090);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub9_10618, 1, (short)-644);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub16_10634, 2, (short)-9038);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub15_10610, 1, (short)-21178);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10608, 0, (short)-5011);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10645, 0, (short)-9723);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub8_10625, 2, (short)-18785);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub12_10613, 676914057 * Class273.aClass273_3000.anInt3006, (short)-27873);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub26_10611, 0, (short)-6409);
      if(Class554.aClass174_7475 != null && Class554.aClass174_7475.method2240() && Class554.aClass174_7475.method2548()) {
         Class554.aClass174_7475.method2604();
      }

      Class230.preferences.method9602(Class230.preferences.aClass711_Sub21_10629, 1, (short)-20171);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub42_10607, 1, (short)-20970);
      Class358.method4586((byte)2);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub43_10628, 0, (short)-32267);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub27_10648, 4, (short)-11866);
      Class452_Sub5.method9307(1067158500);
      client.aClass505_11204.method6100((byte)-111).method7377((byte)0);
      client.aBool11104 = true;
   }

   static void method8170(int[] var0, float[] var1, float[] var2, int var3, int var4, int var5) {
      if(var3 < var4) {
         int var6 = (var4 + var3) / 2;
         int var7 = var3;
         int var8 = var0[var6];
         var0[var6] = var0[var4];
         var0[var4] = var8;
         float var9 = var1[var6];
         var1[var6] = var1[var4];
         var1[var4] = var9;
         float var10 = var2[var6];
         var2[var6] = var2[var4];
         var2[var4] = var10;
         int var11 = Long.MAX_VALUE == (long)var8?0:1;

         for(int var12 = var3; var12 < var4; ++var12) {
            if(var0[var12] < (var12 & var11) + var8) {
               int var13 = var0[var12];
               var0[var12] = var0[var7];
               var0[var7] = var13;
               float var14 = var1[var12];
               var1[var12] = var1[var7];
               var1[var7] = var14;
               float var15 = var2[var12];
               var2[var12] = var2[var7];
               var2[var7] = var15;
               ++var7;
            }
         }

         var0[var4] = var0[var7];
         var0[var7] = var8;
         var1[var4] = var1[var7];
         var1[var7] = var9;
         var2[var4] = var2[var7];
         var2[var7] = var10;
         method8170(var0, var1, var2, var3, var7 - 1, -88978725);
         method8170(var0, var1, var2, var7 + 1, var4, -88978725);
      }

   }
}
