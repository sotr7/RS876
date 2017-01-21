package com.jagex;

import com.jagex.Class576;
import com.jagex.Class681;
import java.io.IOException;
import java.io.InputStream;

public class Class324 {
   static final int anInt3462 = -16777216;
   static final int anInt3463 = 11;
   static final int anInt3464 = 2048;
   static final int anInt3465 = 5;
   InputStream anInputStream3468;
   int anInt3467;
   int anInt3466;

   public final void method4158(InputStream var1, int var2) {
      this.anInputStream3468 = var1;
   }

   public final void method4159(int var1) {
      this.anInputStream3468 = null;
   }

   public final void method4160(int var1) throws IOException {
      this.anInt3467 = 0;
      this.anInt3466 = -331065521;

      for(int var2 = 0; var2 < 5; ++var2) {
         this.anInt3467 = (729744565 * this.anInt3467 << 8 | this.anInputStream3468.read()) * 533252509;
      }

   }

   public final int method4161(int var1, int var2) throws IOException {
      int var3 = 0;

      for(int var4 = var1; var4 != 0; --var4) {
         this.anInt3466 = 331065521 * (-1484677039 * this.anInt3466 >>> 1);
         int var5 = 729744565 * this.anInt3467 - -1484677039 * this.anInt3466 >>> 31;
         this.anInt3467 -= (this.anInt3466 * -1484677039 & var5 - 1) * 533252509;
         var3 = var3 << 1 | 1 - var5;
         if((-1484677039 * this.anInt3466 & -16777216) == 0) {
            this.anInt3467 = (this.anInt3467 * 729744565 << 8 | this.anInputStream3468.read()) * 533252509;
            this.anInt3466 = (this.anInt3466 * -1484677039 << 8) * 331065521;
         }
      }

      return var3;
   }

   public int method4162(short[] var1, int var2, int var3) throws IOException {
      short var4 = var1[var2];
      int var5 = var4 * (this.anInt3466 * -1484677039 >>> 11);
      if((729744565 * this.anInt3467 ^ Integer.MIN_VALUE) < (var5 ^ Integer.MIN_VALUE)) {
         this.anInt3466 = 331065521 * var5;
         var1[var2] = (short)((2048 - var4 >>> 5) + var4);
         if((this.anInt3466 * -1484677039 & -16777216) == 0) {
            this.anInt3467 = (this.anInt3467 * 729744565 << 8 | this.anInputStream3468.read()) * 533252509;
            this.anInt3466 = 331065521 * (this.anInt3466 * -1484677039 << 8);
         }

         return 0;
      } else {
         this.anInt3466 -= var5 * 331065521;
         this.anInt3467 -= var5 * 533252509;
         var1[var2] = (short)(var4 - (var4 >>> 5));
         if(0 == (-1484677039 * this.anInt3466 & -16777216)) {
            this.anInt3467 = (this.anInt3467 * 729744565 << 8 | this.anInputStream3468.read()) * 533252509;
            this.anInt3466 = (-1484677039 * this.anInt3466 << 8) * 331065521;
         }

         return 1;
      }
   }

   public final void method4163() {
      this.anInputStream3468 = null;
   }

   public final int method4164(int var1) throws IOException {
      int var2 = 0;

      for(int var3 = var1; var3 != 0; --var3) {
         this.anInt3466 = 331065521 * (-1484677039 * this.anInt3466 >>> 1);
         int var4 = 729744565 * this.anInt3467 - -1484677039 * this.anInt3466 >>> 31;
         this.anInt3467 -= (this.anInt3466 * -1484677039 & var4 - 1) * 533252509;
         var2 = var2 << 1 | 1 - var4;
         if((-1484677039 * this.anInt3466 & -16777216) == 0) {
            this.anInt3467 = (this.anInt3467 * 729744565 << 8 | this.anInputStream3468.read()) * 533252509;
            this.anInt3466 = (this.anInt3466 * -1484677039 << 8) * 331065521;
         }
      }

      return var2;
   }

   public final void method4165() throws IOException {
      this.anInt3467 = 0;
      this.anInt3466 = -331065521;

      for(int var1 = 0; var1 < 5; ++var1) {
         this.anInt3467 = (729744565 * this.anInt3467 << 8 | this.anInputStream3468.read()) * 533252509;
      }

   }

   public final int method4166(int var1) throws IOException {
      int var2 = 0;

      for(int var3 = var1; var3 != 0; --var3) {
         this.anInt3466 = 331065521 * (-1484677039 * this.anInt3466 >>> 1);
         int var4 = 729744565 * this.anInt3467 - -1484677039 * this.anInt3466 >>> 31;
         this.anInt3467 -= (this.anInt3466 * -1484677039 & var4 - 1) * 533252509;
         var2 = var2 << 1 | 1 - var4;
         if((-1484677039 * this.anInt3466 & -16777216) == 0) {
            this.anInt3467 = (this.anInt3467 * 729744565 << 8 | this.anInputStream3468.read()) * 533252509;
            this.anInt3466 = (this.anInt3466 * -1484677039 << 8) * 331065521;
         }
      }

      return var2;
   }

   static final void method4167(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class576.method6939(var2, -1835096590);
   }
}
