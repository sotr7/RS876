package com.jagex;

import com.jagex.Class402_Sub2;

public class Class402_Sub2_Sub1 extends Class402_Sub2 {
   byte[] aByteArray11396;

   Class402_Sub2_Sub1() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   void method9230(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.aByteArray11396[var3++] = -1;
      this.aByteArray11396[var3] = (byte)(3 * var4 >> 5);
   }

   void method9231(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.aByteArray11396[var3++] = -1;
      this.aByteArray11396[var3] = (byte)(3 * var4 >> 5);
   }

   byte[] method10472(int var1, int var2, int var3) {
      this.aByteArray11396 = new byte[var1 * var2 * var3 * 2];
      this.method4843(var1, var2, var3);
      return this.aByteArray11396;
   }

   void method9232(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.aByteArray11396[var3++] = -1;
      this.aByteArray11396[var3] = (byte)(3 * var4 >> 5);
   }

   void method9233(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.aByteArray11396[var3++] = -1;
      this.aByteArray11396[var3] = (byte)(3 * var4 >> 5);
   }

   void method9234(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.aByteArray11396[var3++] = -1;
      this.aByteArray11396[var3] = (byte)(3 * var4 >> 5);
   }

   byte[] method10473(int var1, int var2, int var3) {
      this.aByteArray11396 = new byte[var1 * var2 * var3 * 2];
      this.method4843(var1, var2, var3);
      return this.aByteArray11396;
   }
}
