package com.jagex;

import com.jagex.Class402_Sub1;

public class Class402_Sub1_Sub2 extends Class402_Sub1 {
   byte[] aByteArray11555;

   void method9157(int var1, byte var2) {
      int var3 = var1 * 2;
      var2 = (byte)(127 + ((var2 & 255) >> 1));
      this.aByteArray11555[var3++] = var2;
      this.aByteArray11555[var3] = var2;
   }

   byte[] method10542(int var1, int var2, int var3) {
      this.aByteArray11555 = new byte[var1 * var2 * var3 * 2];
      this.method4843(var1, var2, var3);
      return this.aByteArray11555;
   }

   Class402_Sub1_Sub2() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   byte[] method10543(int var1, int var2, int var3) {
      this.aByteArray11555 = new byte[var1 * var2 * var3 * 2];
      this.method4843(var1, var2, var3);
      return this.aByteArray11555;
   }

   void method9158(int var1, byte var2) {
      int var3 = var1 * 2;
      var2 = (byte)(127 + ((var2 & 255) >> 1));
      this.aByteArray11555[var3++] = var2;
      this.aByteArray11555[var3] = var2;
   }
}
