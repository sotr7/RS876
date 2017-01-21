package com.jagex;

import com.jagex.Class402;

public class Class402_Sub2 extends Class402 {
   byte[] aByteArray10261;
   int anInt10263;
   int anInt10264;
   int anInt10262;
   int anInt10265;
   int anInt10260;
   int anInt10266;
   int anInt10259;
   int anInt10267;

   void method9230(int var1, byte var2) {
      this.aByteArray10261[var1] = var2;
   }

   void method4847() {
      this.anInt10263 = 0;
      this.anInt10264 = 0;
   }

   void method4846(int var1, int var2) {
      if(var1 != 0) {
         this.anInt10262 = this.anInt10265 * this.anInt10266 >> 12;
         if(this.anInt10262 < 0) {
            this.anInt10262 = 0;
         } else if(this.anInt10262 > 4096) {
            this.anInt10262 = 4096;
         }

         this.anInt10265 = this.anInt10259 - (var2 < 0?-var2:var2);
         this.anInt10265 = this.anInt10265 * this.anInt10265 >> 12;
         this.anInt10265 = this.anInt10265 * this.anInt10262 >> 12;
         this.anInt10264 += this.anInt10265 * this.anInt10260 >> 12;
         this.anInt10260 = this.anInt10260 * this.anInt10267 >> 12;
      } else {
         this.anInt10265 = this.anInt10259 - (var2 < 0?-var2:var2);
         this.anInt10265 = this.anInt10265 * this.anInt10265 >> 12;
         this.anInt10262 = 4096;
         this.anInt10264 = this.anInt10265;
      }

   }

   void method4845() {
      this.anInt10260 = this.anInt10267;
      this.anInt10264 >>= 4;
      if(this.anInt10264 < 0) {
         this.anInt10264 = 0;
      } else if(this.anInt10264 > 255) {
         this.anInt10264 = 255;
      }

      this.method9231(this.anInt10263++, (byte)this.anInt10264);
      this.anInt10264 = 0;
   }

   void method9231(int var1, byte var2) {
      this.aByteArray10261[var1] = var2;
   }

   void method9232(int var1, byte var2) {
      this.aByteArray10261[var1] = var2;
   }

   void method4863(int var1, int var2) {
      if(var1 != 0) {
         this.anInt10262 = this.anInt10265 * this.anInt10266 >> 12;
         if(this.anInt10262 < 0) {
            this.anInt10262 = 0;
         } else if(this.anInt10262 > 4096) {
            this.anInt10262 = 4096;
         }

         this.anInt10265 = this.anInt10259 - (var2 < 0?-var2:var2);
         this.anInt10265 = this.anInt10265 * this.anInt10265 >> 12;
         this.anInt10265 = this.anInt10265 * this.anInt10262 >> 12;
         this.anInt10264 += this.anInt10265 * this.anInt10260 >> 12;
         this.anInt10260 = this.anInt10260 * this.anInt10267 >> 12;
      } else {
         this.anInt10265 = this.anInt10259 - (var2 < 0?-var2:var2);
         this.anInt10265 = this.anInt10265 * this.anInt10265 >> 12;
         this.anInt10262 = 4096;
         this.anInt10264 = this.anInt10265;
      }

   }

   void method9233(int var1, byte var2) {
      this.aByteArray10261[var1] = var2;
   }

   void method9234(int var1, byte var2) {
      this.aByteArray10261[var1] = var2;
   }

   void method4853() {
      this.anInt10263 = 0;
      this.anInt10264 = 0;
   }

   void method4851() {
      this.anInt10260 = this.anInt10267;
      this.anInt10264 >>= 4;
      if(this.anInt10264 < 0) {
         this.anInt10264 = 0;
      } else if(this.anInt10264 > 255) {
         this.anInt10264 = 255;
      }

      this.method9231(this.anInt10263++, (byte)this.anInt10264);
      this.anInt10264 = 0;
   }

   void method4854() {
      this.anInt10260 = this.anInt10267;
      this.anInt10264 >>= 4;
      if(this.anInt10264 < 0) {
         this.anInt10264 = 0;
      } else if(this.anInt10264 > 255) {
         this.anInt10264 = 255;
      }

      this.method9231(this.anInt10263++, (byte)this.anInt10264);
      this.anInt10264 = 0;
   }

   void method4855() {
      this.anInt10260 = this.anInt10267;
      this.anInt10264 >>= 4;
      if(this.anInt10264 < 0) {
         this.anInt10264 = 0;
      } else if(this.anInt10264 > 255) {
         this.anInt10264 = 255;
      }

      this.method9231(this.anInt10263++, (byte)this.anInt10264);
      this.anInt10264 = 0;
   }

   void method4850(int var1, int var2) {
      if(var1 != 0) {
         this.anInt10262 = this.anInt10265 * this.anInt10266 >> 12;
         if(this.anInt10262 < 0) {
            this.anInt10262 = 0;
         } else if(this.anInt10262 > 4096) {
            this.anInt10262 = 4096;
         }

         this.anInt10265 = this.anInt10259 - (var2 < 0?-var2:var2);
         this.anInt10265 = this.anInt10265 * this.anInt10265 >> 12;
         this.anInt10265 = this.anInt10265 * this.anInt10262 >> 12;
         this.anInt10264 += this.anInt10265 * this.anInt10260 >> 12;
         this.anInt10260 = this.anInt10260 * this.anInt10267 >> 12;
      } else {
         this.anInt10265 = this.anInt10259 - (var2 < 0?-var2:var2);
         this.anInt10265 = this.anInt10265 * this.anInt10265 >> 12;
         this.anInt10262 = 4096;
         this.anInt10264 = this.anInt10265;
      }

   }

   void method4864() {
      this.anInt10260 = this.anInt10267;
      this.anInt10264 >>= 4;
      if(this.anInt10264 < 0) {
         this.anInt10264 = 0;
      } else if(this.anInt10264 > 255) {
         this.anInt10264 = 255;
      }

      this.method9231(this.anInt10263++, (byte)this.anInt10264);
      this.anInt10264 = 0;
   }

   Class402_Sub2(int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      super(var1, var2, var3, var4, var5);
      this.anInt10266 = (int)(var8 * 4096.0F);
      this.anInt10259 = (int)(var7 * 4096.0F);
      this.anInt10260 = this.anInt10267 = (int)(Math.pow(0.5D, (double)(-var6)) * 4096.0D);
   }
}
