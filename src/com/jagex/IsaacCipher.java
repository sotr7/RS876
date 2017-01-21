package com.jagex;

import com.RS3Applet;
import com.jagex.Class179;

public final class IsaacCipher {
   static final int anInt159 = 256;
   static final int anInt160 = 8;
   static final int anInt165 = 1020;
   int anInt166;
   int anInt163;
   int anInt164;
   int anInt161;
   int[] anIntArray158 = new int[256];
   int[] anIntArray162 = new int[256];

   final void method605() {
      this.anInt163 += (this.anInt166 += -572508057) * -1685222515;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.anIntArray158[var1];
         if(0 == (var1 & 2)) {
            if(0 == (var1 & 1)) {
               this.anInt164 = 901307701 * (this.anInt164 * 1345211677 ^ 1345211677 * this.anInt164 << 13);
            } else {
               this.anInt164 = 901307701 * (1345211677 * this.anInt164 ^ 1345211677 * this.anInt164 >>> 6);
            }
         } else if(0 == (var1 & 1)) {
            this.anInt164 = 901307701 * (1345211677 * this.anInt164 ^ 1345211677 * this.anInt164 << 2);
         } else {
            this.anInt164 = 901307701 * (this.anInt164 * 1345211677 ^ this.anInt164 * 1345211677 >>> 16);
         }

         this.anInt164 += this.anIntArray158[128 + var1 & 255] * 901307701;
         int var3;
         this.anIntArray158[var1] = var3 = 1345211677 * this.anInt164 + this.anIntArray158[(var2 & 1020) >> 2] + 784744307 * this.anInt163;
         this.anIntArray162[var1] = (this.anInt163 = (this.anIntArray158[(var3 >> 8 & 1020) >> 2] + var2) * 1624899003) * 784744307;
      }

   }

   public final int peek(int var1) {
	   if (RS3Applet.RSPS)
		   return 0;
      if(this.anInt161 * 1992481409 == 0) {
         this.method608(-2036932014);
         this.anInt161 = 459636992;
      }

      return this.anIntArray162[(this.anInt161 -= 1008428417) * 1992481409];
   }

   public final int nextInt(byte var1) {
	   if (RS3Applet.RSPS)
		   return 0;
      if(this.anInt161 * 1992481409 == 0) {
         this.method608(-2076206352);
         this.anInt161 = 459636992;
      }

      return this.anIntArray162[1992481409 * this.anInt161 - 1];
   }

   final void method608(int var1) {
      this.anInt163 += (this.anInt166 += -572508057) * -1685222515;

      for(int var2 = 0; var2 < 256; ++var2) {
         int var3 = this.anIntArray158[var2];
         if(0 == (var2 & 2)) {
            if(0 == (var2 & 1)) {
               this.anInt164 = 901307701 * (this.anInt164 * 1345211677 ^ 1345211677 * this.anInt164 << 13);
            } else {
               this.anInt164 = 901307701 * (1345211677 * this.anInt164 ^ 1345211677 * this.anInt164 >>> 6);
            }
         } else if(0 == (var2 & 1)) {
            this.anInt164 = 901307701 * (1345211677 * this.anInt164 ^ 1345211677 * this.anInt164 << 2);
         } else {
            this.anInt164 = 901307701 * (this.anInt164 * 1345211677 ^ this.anInt164 * 1345211677 >>> 16);
         }

         this.anInt164 += this.anIntArray158[128 + var2 & 255] * 901307701;
         int var4;
         this.anIntArray158[var2] = var4 = 1345211677 * this.anInt164 + this.anIntArray158[(var3 & 1020) >> 2] + 784744307 * this.anInt163;
         this.anIntArray162[var2] = (this.anInt163 = (this.anIntArray158[(var4 >> 8 & 1020) >> 2] + var3) * 1624899003) * 784744307;
      }

   }

   final void method609(int var1) {
      int var2 = -1640531527;
      int var3 = -1640531527;
      int var4 = -1640531527;
      int var5 = -1640531527;
      int var6 = -1640531527;
      int var7 = -1640531527;
      int var8 = -1640531527;
      int var9 = -1640531527;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
      }

      for(var10 = 0; var10 < 256; var10 += 8) {
         var9 += this.anIntArray162[var10];
         var8 += this.anIntArray162[var10 + 1];
         var7 += this.anIntArray162[var10 + 2];
         var6 += this.anIntArray162[3 + var10];
         var5 += this.anIntArray162[4 + var10];
         var4 += this.anIntArray162[5 + var10];
         var3 += this.anIntArray162[var10 + 6];
         var2 += this.anIntArray162[7 + var10];
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
         this.anIntArray158[var10] = var9;
         this.anIntArray158[1 + var10] = var8;
         this.anIntArray158[2 + var10] = var7;
         this.anIntArray158[3 + var10] = var6;
         this.anIntArray158[var10 + 4] = var5;
         this.anIntArray158[var10 + 5] = var4;
         this.anIntArray158[6 + var10] = var3;
         this.anIntArray158[7 + var10] = var2;
      }

      for(var10 = 0; var10 < 256; var10 += 8) {
         var9 += this.anIntArray158[var10];
         var8 += this.anIntArray158[var10 + 1];
         var7 += this.anIntArray158[2 + var10];
         var6 += this.anIntArray158[var10 + 3];
         var5 += this.anIntArray158[var10 + 4];
         var4 += this.anIntArray158[var10 + 5];
         var3 += this.anIntArray158[var10 + 6];
         var2 += this.anIntArray158[7 + var10];
         var9 ^= var8 << 11;
         var6 += var9;
         var8 += var7;
         var8 ^= var7 >>> 2;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 << 8;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 >>> 16;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 << 10;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 >>> 4;
         var9 += var4;
         var3 += var2;
         var3 ^= var2 << 8;
         var8 += var3;
         var2 += var9;
         var2 ^= var9 >>> 9;
         var7 += var2;
         var9 += var8;
         this.anIntArray158[var10] = var9;
         this.anIntArray158[var10 + 1] = var8;
         this.anIntArray158[2 + var10] = var7;
         this.anIntArray158[3 + var10] = var6;
         this.anIntArray158[4 + var10] = var5;
         this.anIntArray158[5 + var10] = var4;
         this.anIntArray158[6 + var10] = var3;
         this.anIntArray158[7 + var10] = var2;
      }

      this.method608(-2020944564);
      this.anInt161 = 459636992;
   }

   public final int method610() {
      if(this.anInt161 * 1992481409 == 0) {
         this.method608(-2129270216);
         this.anInt161 = 459636992;
      }

      return this.anIntArray162[1992481409 * this.anInt161 - 1];
   }

   public final int method611() {
      if(this.anInt161 * 1992481409 == 0) {
         this.method608(-1969254840);
         this.anInt161 = 459636992;
      }

      return this.anIntArray162[1992481409 * this.anInt161 - 1];
   }

   public IsaacCipher(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.anIntArray162[var2] = var1[var2];
      }

      this.method609(424185536);
   }

   static void method612(int[] var0, double var1) {
      int var3;
      int var4;
      if(Class179.aDouble2071 != var1) {
         for(var3 = 0; var3 < 256; ++var3) {
            var4 = (int)(Math.pow((double)var3 / 255.0D, var1) * 255.0D);
            Class179.anIntArray2070[var3] = var4 > 255?255:var4;
         }

         Class179.aDouble2071 = var1;
      }

      for(var3 = 0; var3 < var0.length; ++var3) {
         var4 = Class179.anIntArray2070[var0[var3] >> 16 & 255];
         int var5 = Class179.anIntArray2070[var0[var3] >> 8 & 255];
         int var6 = Class179.anIntArray2070[var0[var3] >> 0 & 255];
         var0[var3] = var0[var3] & -16777216 | var4 << 16 | var5 << 8 | var6;
      }

   }
}
