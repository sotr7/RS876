package com.jagex;

import com.jagex.Class526;

public class Class526_Sub22 extends Class526 {
   int anInt10535;
   boolean aBool10537;
   int anInt10533;
   int anInt10536;
   int[] anIntArray10534;
   static int[] anIntArray10538;

   int[] method9447() {
      return this.anIntArray10534;
   }

   Class526_Sub22(int var1, int var2, int[] var3, boolean var4) {
      this.anInt10533 = var1;
      this.anInt10536 = var2;
      this.anIntArray10534 = var3;
      if(var4) {
         int[] var5 = new int[this.anInt10536];
         int[] var6 = new int[this.anInt10536];
         int[] var7 = new int[this.anInt10536];
         int[] var8 = new int[this.anInt10536];
         if(anIntArray10538 == null || anIntArray10538.length != this.anIntArray10534.length) {
            anIntArray10538 = new int[this.anIntArray10534.length];
         }

         int var9 = this.anInt10536;
         int var10 = this.anInt10536;
         int var11 = var9 - 1;
         int var12 = var10 - 1;
         int var13 = var9 * var10;
         int var14;
         int var15 = var14 = 1 * var9;

         int var16;
         int var17;
         for(var16 = 2; var16 >= 0; --var16) {
            for(var17 = var11; var17 >= 0; --var17) {
               --var14;
               int var18 = this.anIntArray10534[var14];
               var5[var17] += var18 >> 24 & 255;
               var6[var17] += var18 >> 16 & 255;
               var7[var17] += var18 >> 8 & 255;
               var8[var17] += var18 & 255;
            }

            if(var14 == 0) {
               var14 = var13;
            }
         }

         int var19 = var13;

         for(int var20 = var12; var20 >= 0; --var20) {
            int var21 = 1;
            int var22 = 1;
            int var23 = 0;
            int var24 = 0;
            int var25 = 0;
            int var26 = 0;

            for(var17 = 2; var17 >= 0; --var17) {
               --var22;
               var26 += var5[var22];
               var25 += var6[var22];
               var23 += var7[var22];
               var24 += var8[var22];
               if(var22 == 0) {
                  var22 = var9;
               }
            }

            for(var17 = var11; var17 >= 0; --var17) {
               --var22;
               --var21;
               var16 = var26 / 9;
               int var27 = var25 / 9;
               int var28 = var23 / 9;
               int var29 = var24 / 9;
               --var19;
               anIntArray10538[var19] = var16 << 24 | var27 << 16 | var28 << 8 | var29;
               var26 += var5[var22] - var5[var21];
               var25 += var6[var22] - var6[var21];
               var24 += var8[var22] - var8[var21];
               var23 += var7[var22] - var7[var21];
               if(var22 == 0) {
                  var22 = var9;
               }

               if(var21 == 0) {
                  var21 = var9;
               }
            }

            for(var17 = var11; var17 >= 0; --var17) {
               --var14;
               int var30 = this.anIntArray10534[var14];
               --var15;
               int var31 = this.anIntArray10534[var15];
               var5[var17] += (var30 >> 24 & 255) - (var31 >> 24 & 255);
               var6[var17] += (var30 >> 16 & 255) - (var31 >> 16 & 255);
               var7[var17] += (var30 >> 8 & 255) - (var31 >> 8 & 255);
               var8[var17] += (var30 & 255) - (var31 & 255);
            }

            if(var14 == 0) {
               var14 = var13;
            }

            if(var15 == 0) {
               var15 = var13;
            }
         }

         int[] var32 = this.anIntArray10534;
         this.anIntArray10534 = anIntArray10538;
         anIntArray10538 = var32;
      }

   }

   void method9448(int var1, int var2) {
      if(var1 != 0 || var2 != 0) {
         if(anIntArray10538 == null || anIntArray10538.length != this.anIntArray10534.length) {
            anIntArray10538 = new int[this.anIntArray10534.length];
         }

         int var3 = this.anIntArray10534.length;
         int var4 = var1;
         int var5 = this.anInt10536 - 1;
         int var6 = this.anInt10536 * var2;
         int var7 = var3 - 1;

         for(int var8 = 0; var8 < var3; var8 += this.anInt10536) {
            int var9 = var8 + var6 & var7;

            for(int var10 = 0; var10 < this.anInt10536; ++var10) {
               int var11 = var8 + var10;
               int var12 = var9 + (var10 + var4 & var5);
               anIntArray10538[var11] = this.anIntArray10534[var12];
            }
         }

         int[] var13 = this.anIntArray10534;
         this.anIntArray10534 = anIntArray10538;
         anIntArray10538 = var13;
      }
   }

   void method9449(int var1, int var2) {
      if(var1 != 0 || var2 != 0) {
         if(anIntArray10538 == null || anIntArray10538.length != this.anIntArray10534.length) {
            anIntArray10538 = new int[this.anIntArray10534.length];
         }

         int var3 = this.anIntArray10534.length;
         int var4 = var1;
         int var5 = this.anInt10536 - 1;
         int var6 = this.anInt10536 * var2;
         int var7 = var3 - 1;

         for(int var8 = 0; var8 < var3; var8 += this.anInt10536) {
            int var9 = var8 + var6 & var7;

            for(int var10 = 0; var10 < this.anInt10536; ++var10) {
               int var11 = var8 + var10;
               int var12 = var9 + (var10 + var4 & var5);
               anIntArray10538[var11] = this.anIntArray10534[var12];
            }
         }

         int[] var13 = this.anIntArray10534;
         this.anIntArray10534 = anIntArray10538;
         anIntArray10538 = var13;
      }
   }
}
