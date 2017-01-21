package com.jagex;

import com.jagex.Class196;
import com.jagex.Class235;
import com.jagex.Class253;

public class Class279 {
   static Class196[] aClass196Array3033;
   int[] anIntArray3034;

   public int method3687(int var1, byte var2) {
      int var3 = (this.anIntArray3034.length >> 1) - 1;
      int var4 = var1 & var3;

      while(true) {
         int var5 = this.anIntArray3034[var4 + var4 + 1];
         if(var5 == -1) {
            return -1;
         }

         if(var1 == this.anIntArray3034[var4 + var4]) {
            return var5;
         }

         var4 = var4 + 1 & var3;
      }
   }

   public Class279(int[] var1) {
      int var2;
      for(var2 = 1; var2 <= var1.length + (var1.length >> 1); var2 <<= 1) {
         ;
      }

      this.anIntArray3034 = new int[var2 + var2];

      int var3;
      for(var3 = 0; var3 < var2 + var2; ++var3) {
         this.anIntArray3034[var3] = -1;
      }

      int var4;
      for(var3 = 0; var3 < var1.length; this.anIntArray3034[var4 + var4 + 1] = var3++) {
         for(var4 = var1[var3] & var2 - 1; -1 != this.anIntArray3034[var4 + var4 + 1]; var4 = 1 + var4 & var2 - 1) {
            ;
         }

         this.anIntArray3034[var4 + var4] = var1[var3];
      }

   }

   static boolean crtlClick(byte var0) {
      return Class235.method3280(Class253.aClass627_2794.aClass582_8185, -955992854);
   }
}
