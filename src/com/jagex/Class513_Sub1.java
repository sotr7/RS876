package com.jagex;

import com.jagex.Class153;
import com.jagex.Class195;
import com.jagex.Class237;
import com.jagex.InterfaceDef;
import com.jagex.Class288;
import com.jagex.Class327;
import com.jagex.Class443;
import com.jagex.Class513;
import com.jagex.Class74;
import com.jagex.client;

public class Class513_Sub1 extends Class513 {
   long aLong10346 = 0L;
   long aLong10344 = 0L;
   long aLong10345 = 0L;
   long[] aLongArray10349 = new long[10];
   int anInt10347 = 0;
   int anInt10348 = -1808038551;

   void method6203() {
      this.aLong10346 = 0L;
      if(this.aLong10345 * 2571452751600814077L > -6524184326013405241L * this.aLong10344) {
         this.aLong10344 += this.aLong10345 * 6537163674696559131L - 1L * this.aLong10344;
      }

   }

   Class513_Sub1() {
      this.aLong10344 = System.nanoTime() * -6776914943498921481L;
      this.aLong10345 = System.nanoTime() * 8472592357168352597L;
   }

   long method6199(int var1) {
      this.aLong10344 += this.method9296((byte)-1) * -6776914943498921481L;
      return 2571452751600814077L * this.aLong10345 > -6524184326013405241L * this.aLong10344?(this.aLong10345 * 2571452751600814077L - this.aLong10344 * -6524184326013405241L) / 1000000L:0L;
   }

   int method6192(long var1) {
      if(2571452751600814077L * this.aLong10345 > this.aLong10344 * -6524184326013405241L) {
         this.aLong10346 += 8920826611030260045L * this.aLong10345 - 5560738882167382199L * this.aLong10344;
         this.aLong10344 += this.aLong10345 * 6537163674696559131L - this.aLong10344 * 1L;
         this.aLong10345 += 8472592357168352597L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.aLong10345 += 8472592357168352597L * var1;
         } while(var3 < 10 && 2571452751600814077L * this.aLong10345 < -6524184326013405241L * this.aLong10344);

         if(2571452751600814077L * this.aLong10345 < -6524184326013405241L * this.aLong10344) {
            this.aLong10345 = this.aLong10344 * 4478239483546083347L;
         }

         return var3;
      }
   }

   long method9296(byte var1) {
      long var2 = System.nanoTime();
      long var4 = var2 - this.aLong10346 * 72804107889996145L;
      this.aLong10346 = var2 * -7189512221391343727L;
      if(var4 > -5000000000L && var4 < 5000000000L) {
         this.aLongArray10349[-1328965427 * this.anInt10347] = var4;
         this.anInt10347 = (1 + this.anInt10347 * -1328965427) % 10 * 2090865669;
         if(this.anInt10348 * 433937113 < 1) {
            this.anInt10348 += -1808038551;
         }
      }

      long var6 = 0L;

      for(int var8 = 1; var8 <= this.anInt10348 * 433937113; ++var8) {
         var6 += this.aLongArray10349[(this.anInt10347 * -1328965427 - var8 + 10) % 10];
      }

      return var6 / (long)(433937113 * this.anInt10348);
   }

   long method9297() {
      long var1 = System.nanoTime();
      long var3 = var1 - this.aLong10346 * 72804107889996145L;
      this.aLong10346 = var1 * -7189512221391343727L;
      if(var3 > -5000000000L && var3 < 5000000000L) {
         this.aLongArray10349[-1328965427 * this.anInt10347] = var3;
         this.anInt10347 = (1 + this.anInt10347 * -1328965427) % 10 * 2090865669;
         if(this.anInt10348 * 433937113 < 1) {
            this.anInt10348 += -1808038551;
         }
      }

      long var5 = 0L;

      for(int var7 = 1; var7 <= this.anInt10348 * 433937113; ++var7) {
         var5 += this.aLongArray10349[(this.anInt10347 * -1328965427 - var7 + 10) % 10];
      }

      return var5 / (long)(433937113 * this.anInt10348);
   }

   void method6201() {
      this.aLong10346 = 0L;
      if(this.aLong10345 * 2571452751600814077L > -6524184326013405241L * this.aLong10344) {
         this.aLong10344 += this.aLong10345 * 6537163674696559131L - 1L * this.aLong10344;
      }

   }

   long method6193(int var1) {
      return -6524184326013405241L * this.aLong10344;
   }

   void method6195() {
      this.aLong10346 = 0L;
      if(this.aLong10345 * 2571452751600814077L > -6524184326013405241L * this.aLong10344) {
         this.aLong10344 += this.aLong10345 * 6537163674696559131L - 1L * this.aLong10344;
      }

   }

   long method6196() {
      this.aLong10344 += this.method9296((byte)-1) * -6776914943498921481L;
      return 2571452751600814077L * this.aLong10345 > -6524184326013405241L * this.aLong10344?(this.aLong10345 * 2571452751600814077L - this.aLong10344 * -6524184326013405241L) / 1000000L:0L;
   }

   long method6191() {
      this.aLong10344 += this.method9296((byte)-1) * -6776914943498921481L;
      return 2571452751600814077L * this.aLong10345 > -6524184326013405241L * this.aLong10344?(this.aLong10345 * 2571452751600814077L - this.aLong10344 * -6524184326013405241L) / 1000000L:0L;
   }

   int method6197(long var1) {
      if(2571452751600814077L * this.aLong10345 > this.aLong10344 * -6524184326013405241L) {
         this.aLong10346 += 8920826611030260045L * this.aLong10345 - 5560738882167382199L * this.aLong10344;
         this.aLong10344 += this.aLong10345 * 6537163674696559131L - this.aLong10344 * 1L;
         this.aLong10345 += 8472592357168352597L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.aLong10345 += 8472592357168352597L * var1;
         } while(var3 < 10 && 2571452751600814077L * this.aLong10345 < -6524184326013405241L * this.aLong10344);

         if(2571452751600814077L * this.aLong10345 < -6524184326013405241L * this.aLong10344) {
            this.aLong10345 = this.aLong10344 * 4478239483546083347L;
         }

         return var3;
      }
   }

   int method6198(long var1) {
      if(2571452751600814077L * this.aLong10345 > this.aLong10344 * -6524184326013405241L) {
         this.aLong10346 += 8920826611030260045L * this.aLong10345 - 5560738882167382199L * this.aLong10344;
         this.aLong10344 += this.aLong10345 * 6537163674696559131L - this.aLong10344 * 1L;
         this.aLong10345 += 8472592357168352597L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.aLong10345 += 8472592357168352597L * var1;
         } while(var3 < 10 && 2571452751600814077L * this.aLong10345 < -6524184326013405241L * this.aLong10344);

         if(2571452751600814077L * this.aLong10345 < -6524184326013405241L * this.aLong10344) {
            this.aLong10345 = this.aLong10344 * 4478239483546083347L;
         }

         return var3;
      }
   }

   long method6194() {
      return -6524184326013405241L * this.aLong10344;
   }

   long method6200() {
      return -6524184326013405241L * this.aLong10344;
   }

   long method6188() {
      return -6524184326013405241L * this.aLong10344;
   }

   long method6202() {
      return -6524184326013405241L * this.aLong10344;
   }

   void method6190(byte var1) {
      this.aLong10346 = 0L;
      if(this.aLong10345 * 2571452751600814077L > -6524184326013405241L * this.aLong10344) {
         this.aLong10344 += this.aLong10345 * 6537163674696559131L - 1L * this.aLong10344;
      }

   }

   long method9298() {
      long var1 = System.nanoTime();
      long var3 = var1 - this.aLong10346 * 72804107889996145L;
      this.aLong10346 = var1 * -7189512221391343727L;
      if(var3 > -5000000000L && var3 < 5000000000L) {
         this.aLongArray10349[-1328965427 * this.anInt10347] = var3;
         this.anInt10347 = (1 + this.anInt10347 * -1328965427) % 10 * 2090865669;
         if(this.anInt10348 * 433937113 < 1) {
            this.anInt10348 += -1808038551;
         }
      }

      long var5 = 0L;

      for(int var7 = 1; var7 <= this.anInt10348 * 433937113; ++var7) {
         var5 += this.aLongArray10349[(this.anInt10347 * -1328965427 - var7 + 10) % 10];
      }

      return var5 / (long)(433937113 * this.anInt10348);
   }

   static void method9299(InterfaceDef var0, Class237 var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      int var9 = var5 * var5 + var4 * var4;
      if((long)var9 <= var7) {
         int var10;
         if(Class327.anInt3488 * -265840483 == 2) {
            var10 = (int)((double)Class195.aClass292_Sub1_2182.method3919(1558271426) * 2607.5945876176133D) + -502966983 * client.anInt11076 & 16383;
         } else if(6 == -265840483 * Class327.anInt3488) {
            var10 = (int)client.aFloat11105 & 16383;
         } else {
            var10 = -502966983 * client.anInt11076 + (int)client.aFloat11105 & 16383;
         }

         int var11 = Class443.anIntArray4895[var10];
         int var12 = Class443.anIntArray4896[var10];
         if(6 != Class327.anInt3488 * -265840483) {
            var11 = var11 * 256 / (1163477879 * client.anInt11097 + 256);
            var12 = 256 * var12 / (256 + 1163477879 * client.anInt11097);
         }

         int var13 = var4 * var12 + var5 * var11 >> 14;
         int var14 = var5 * var12 - var4 * var11 >> 14;
         Class153 var15 = Class288.aClass153Array3107[var6];
         int var16 = var15.method1825();
         int var17 = var15.method1771();
         int var18 = var13 + var0.anInt2510 * -99858407 / 2 - var16 / 2;
         int var19 = var16 + var18;
         int var20 = -var14 + -667181623 * var0.anInt2576 / 2 - var17;
         int var21 = var17 + var20;
         boolean var22;
         if(var1 != null) {
            var22 = !var1.method3284(var18, var20, (byte)64) || !var1.method3284(var19, var20, (byte)74) || !var1.method3284(var18, var21, (byte)30) || !var1.method3284(var19, var21, (byte)126);
         } else {
            int var24 = var16 / 2;
            var22 = var20 <= -var17 || var21 >= var0.anInt2576 * -667181623 || var18 <= -var24 || var19 >= var0.anInt2510 * -99858407 + var24;
         }

         if(var22) {
            double var25 = Math.atan2((double)var13, (double)var14);
            double var27 = Math.atan2((double)Math.abs(var13), (double)Math.abs(var14));
            double var29 = Math.atan2((double)(-99858407 * var0.anInt2510 / 2), (double)(-667181623 * var0.anInt2576 / 2));
            boolean var31 = false;
            double var32 = 0.0D;
            int var35;
            if(var27 < var29) {
               var32 = 1.5707963267948966D - var25;
               var35 = var0.anInt2576 * -667181623 / 2;
            } else {
               var32 = var25;
               var35 = var0.anInt2510 * -99858407 / 2;
            }

            int var34 = Math.abs((int)(-((double)var35 * Math.sin(1.5707963267948966D) / Math.sin(var32))));
            Class74.aClass153Array806[var6].method1785((float)var2 + (float)(var0.anInt2510 * -99858407) / 2.0F + 0.0F, (float)(var0.anInt2576 * -667181623) / 2.0F + (float)var3 - 0.0F, (float)Class74.aClass153Array806[var6].method21() / 2.0F, (float)var34, 4096, (int)(-var25 / 6.283185307179586D * 65535.0D));
         } else if(var1 != null) {
            var15.method1779(var18 + var2, var20 + var3, var1.aClass162_2395, var2, var3);
         } else {
            var15.method1778(var2 + var18, var3 + var20);
         }

      }
   }
}
