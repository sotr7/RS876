package com.jagex;

import com.jagex.Class402;

public class Class402_Sub1 extends Class402 {
   byte[] aByteArray10162;
   int[] anIntArray10164;
   int anInt10163;
   int anInt10161;

   Class402_Sub1(int var1, int var2, int var3, int var4, int var5, float var6) {
      super(var1, var2, var3, var4, var5);
      this.anIntArray10164 = new int[this.anInt4146];

      for(int var7 = 0; var7 < this.anInt4146; ++var7) {
         this.anIntArray10164[var7] = (short)((int)(Math.pow((double)var6, (double)var7) * 4096.0D));
      }

   }

   void method4854() {
      this.anInt10163 = Math.abs(this.anInt10163);
      if(this.anInt10163 >= 4096) {
         this.anInt10163 = 4095;
      }

      this.method9157(this.anInt10161++, (byte)(this.anInt10163 >> 4));
      this.anInt10163 = 0;
   }

   void method4846(int var1, int var2) {
      this.anInt10163 += var2 * this.anIntArray10164[var1] >> 12;
   }

   void method4845() {
      this.anInt10163 = Math.abs(this.anInt10163);
      if(this.anInt10163 >= 4096) {
         this.anInt10163 = 4095;
      }

      this.method9157(this.anInt10161++, (byte)(this.anInt10163 >> 4));
      this.anInt10163 = 0;
   }

   void method9157(int var1, byte var2) {
      this.aByteArray10162[this.anInt10161++] = (byte)(127 + ((var2 & 255) >> 1));
   }

   void method4847() {
      this.anInt10161 = 0;
      this.anInt10163 = 0;
   }

   void method4853() {
      this.anInt10161 = 0;
      this.anInt10163 = 0;
   }

   void method9158(int var1, byte var2) {
      this.aByteArray10162[this.anInt10161++] = (byte)(127 + ((var2 & 255) >> 1));
   }

   void method4851() {
      this.anInt10163 = Math.abs(this.anInt10163);
      if(this.anInt10163 >= 4096) {
         this.anInt10163 = 4095;
      }

      this.method9157(this.anInt10161++, (byte)(this.anInt10163 >> 4));
      this.anInt10163 = 0;
   }

   void method4855() {
      this.anInt10163 = Math.abs(this.anInt10163);
      if(this.anInt10163 >= 4096) {
         this.anInt10163 = 4095;
      }

      this.method9157(this.anInt10161++, (byte)(this.anInt10163 >> 4));
      this.anInt10163 = 0;
   }

   void method4864() {
      this.anInt10163 = Math.abs(this.anInt10163);
      if(this.anInt10163 >= 4096) {
         this.anInt10163 = 4095;
      }

      this.method9157(this.anInt10161++, (byte)(this.anInt10163 >> 4));
      this.anInt10163 = 0;
   }

   void method4863(int var1, int var2) {
      this.anInt10163 += var2 * this.anIntArray10164[var1] >> 12;
   }

   void method4850(int var1, int var2) {
      this.anInt10163 += var2 * this.anIntArray10164[var1] >> 12;
   }
}
