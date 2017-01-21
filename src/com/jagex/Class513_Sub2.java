package com.jagex;

import com.jagex.Class513;
import jaclib.nanotime.QueryPerformanceCounter;

public class Class513_Sub2 extends Class513 {
   long aLong10364 = 0L;
   long aLong10368 = 0L;
   long aLong10366 = 0L;
   long[] aLongArray10367 = new long[10];
   int anInt10365 = 0;
   int anInt10369 = 196607173;

   long method6196() {
      this.aLong10364 += this.method9314((byte)-27) * 2983737166707682861L;
      return this.aLong10368 * 360657809990568255L > -4262682456615382619L * this.aLong10364?(this.aLong10368 * 360657809990568255L - -4262682456615382619L * this.aLong10364) / 1000000L:0L;
   }

   Class513_Sub2() {
      this.aLong10368 = (this.aLong10364 = QueryPerformanceCounter.nanoTime() * 2983737166707682861L) * 5915123287560169499L;
      if(0L == -4262682456615382619L * this.aLong10364) {
         throw new RuntimeException();
      }
   }

   void method6201() {
      this.aLong10366 = 0L;
      if(this.aLong10368 * 360657809990568255L > -4262682456615382619L * this.aLong10364) {
         this.aLong10364 += 5489665985507586579L * this.aLong10368 - this.aLong10364 * 1L;
      }

   }

   int method6192(long var1) {
      if(360657809990568255L * this.aLong10368 > this.aLong10364 * -4262682456615382619L) {
         this.aLong10366 += -1621874044082887859L * this.aLong10368 - this.aLong10364 * 8555327633536155935L;
         this.aLong10364 += this.aLong10368 * 5489665985507586579L - this.aLong10364 * 1L;
         this.aLong10368 += 5427932511154022079L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.aLong10368 += 5427932511154022079L * var1;
         } while(var3 < 10 && this.aLong10368 * 360657809990568255L < this.aLong10364 * -4262682456615382619L);

         if(360657809990568255L * this.aLong10368 < -4262682456615382619L * this.aLong10364) {
            this.aLong10368 = 5915123287560169499L * this.aLong10364;
         }

         return var3;
      }
   }

   long method6193(int var1) {
      return -4262682456615382619L * this.aLong10364;
   }

   long method9314(byte var1) {
      long var2 = QueryPerformanceCounter.nanoTime();
      long var4 = var2 - -4746894609072078661L * this.aLong10366;
      this.aLong10366 = var2 * -6995547045957106573L;
      if(var4 > -5000000000L && var4 < 5000000000L) {
         this.aLongArray10367[this.anInt10365 * 1939966529] = var4;
         this.anInt10365 = 530810305 * ((1 + this.anInt10365 * 1939966529) % 10);
         if(this.anInt10369 * -2061622771 < 1) {
            this.anInt10369 += 196607173;
         }
      }

      long var6 = 0L;

      for(int var8 = 1; var8 <= -2061622771 * this.anInt10369; ++var8) {
         var6 += this.aLongArray10367[(10 + (this.anInt10365 * 1939966529 - var8)) % 10];
      }

      return var6 / (long)(this.anInt10369 * -2061622771);
   }

   long method6191() {
      this.aLong10364 += this.method9314((byte)-5) * 2983737166707682861L;
      return this.aLong10368 * 360657809990568255L > -4262682456615382619L * this.aLong10364?(this.aLong10368 * 360657809990568255L - -4262682456615382619L * this.aLong10364) / 1000000L:0L;
   }

   void method6203() {
      this.aLong10366 = 0L;
      if(this.aLong10368 * 360657809990568255L > -4262682456615382619L * this.aLong10364) {
         this.aLong10364 += 5489665985507586579L * this.aLong10368 - this.aLong10364 * 1L;
      }

   }

   void method6195() {
      this.aLong10366 = 0L;
      if(this.aLong10368 * 360657809990568255L > -4262682456615382619L * this.aLong10364) {
         this.aLong10364 += 5489665985507586579L * this.aLong10368 - this.aLong10364 * 1L;
      }

   }

   int method6198(long var1) {
      if(360657809990568255L * this.aLong10368 > this.aLong10364 * -4262682456615382619L) {
         this.aLong10366 += -1621874044082887859L * this.aLong10368 - this.aLong10364 * 8555327633536155935L;
         this.aLong10364 += this.aLong10368 * 5489665985507586579L - this.aLong10364 * 1L;
         this.aLong10368 += 5427932511154022079L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.aLong10368 += 5427932511154022079L * var1;
         } while(var3 < 10 && this.aLong10368 * 360657809990568255L < this.aLong10364 * -4262682456615382619L);

         if(360657809990568255L * this.aLong10368 < -4262682456615382619L * this.aLong10364) {
            this.aLong10368 = 5915123287560169499L * this.aLong10364;
         }

         return var3;
      }
   }

   void method6190(byte var1) {
      this.aLong10366 = 0L;
      if(this.aLong10368 * 360657809990568255L > -4262682456615382619L * this.aLong10364) {
         this.aLong10364 += 5489665985507586579L * this.aLong10368 - this.aLong10364 * 1L;
      }

   }

   int method6197(long var1) {
      if(360657809990568255L * this.aLong10368 > this.aLong10364 * -4262682456615382619L) {
         this.aLong10366 += -1621874044082887859L * this.aLong10368 - this.aLong10364 * 8555327633536155935L;
         this.aLong10364 += this.aLong10368 * 5489665985507586579L - this.aLong10364 * 1L;
         this.aLong10368 += 5427932511154022079L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.aLong10368 += 5427932511154022079L * var1;
         } while(var3 < 10 && this.aLong10368 * 360657809990568255L < this.aLong10364 * -4262682456615382619L);

         if(360657809990568255L * this.aLong10368 < -4262682456615382619L * this.aLong10364) {
            this.aLong10368 = 5915123287560169499L * this.aLong10364;
         }

         return var3;
      }
   }

   long method9315() {
      long var1 = QueryPerformanceCounter.nanoTime();
      long var3 = var1 - -4746894609072078661L * this.aLong10366;
      this.aLong10366 = var1 * -6995547045957106573L;
      if(var3 > -5000000000L && var3 < 5000000000L) {
         this.aLongArray10367[this.anInt10365 * 1939966529] = var3;
         this.anInt10365 = 530810305 * ((1 + this.anInt10365 * 1939966529) % 10);
         if(this.anInt10369 * -2061622771 < 1) {
            this.anInt10369 += 196607173;
         }
      }

      long var5 = 0L;

      for(int var7 = 1; var7 <= -2061622771 * this.anInt10369; ++var7) {
         var5 += this.aLongArray10367[(10 + (this.anInt10365 * 1939966529 - var7)) % 10];
      }

      return var5 / (long)(this.anInt10369 * -2061622771);
   }

   long method6194() {
      return -4262682456615382619L * this.aLong10364;
   }

   long method6200() {
      return -4262682456615382619L * this.aLong10364;
   }

   long method6188() {
      return -4262682456615382619L * this.aLong10364;
   }

   long method6202() {
      return -4262682456615382619L * this.aLong10364;
   }

   long method6199(int var1) {
      this.aLong10364 += this.method9314((byte)-114) * 2983737166707682861L;
      return this.aLong10368 * 360657809990568255L > -4262682456615382619L * this.aLong10364?(this.aLong10368 * 360657809990568255L - -4262682456615382619L * this.aLong10364) / 1000000L:0L;
   }

   long method9316() {
      long var1 = QueryPerformanceCounter.nanoTime();
      long var3 = var1 - -4746894609072078661L * this.aLong10366;
      this.aLong10366 = var1 * -6995547045957106573L;
      if(var3 > -5000000000L && var3 < 5000000000L) {
         this.aLongArray10367[this.anInt10365 * 1939966529] = var3;
         this.anInt10365 = 530810305 * ((1 + this.anInt10365 * 1939966529) % 10);
         if(this.anInt10369 * -2061622771 < 1) {
            this.anInt10369 += 196607173;
         }
      }

      long var5 = 0L;

      for(int var7 = 1; var7 <= -2061622771 * this.anInt10369; ++var7) {
         var5 += this.aLongArray10367[(10 + (this.anInt10365 * 1939966529 - var7)) % 10];
      }

      return var5 / (long)(this.anInt10369 * -2061622771);
   }
}
