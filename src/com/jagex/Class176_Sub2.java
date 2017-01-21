package com.jagex;

import com.jagex.Class124;
import com.jagex.Class124_Sub1;
import com.jagex.Class124_Sub4;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class176;

public class Class176_Sub2 extends Class176 {
   Class174_Sub2 aClass174_Sub2_9216;
   Class124 aClass124_9215;

   Class176_Sub2(Class174_Sub2 var1, int[] var2) {
      this.aClass174_Sub2_9216 = var1;
      if(this.aClass174_Sub2_9216.aBool9632) {
         byte[] var3 = this.method8483(var2);
         this.aClass124_9215 = new Class124_Sub4(this.aClass174_Sub2_9216, Class144.aClass144_1680, Class166.aClass166_1884, 16, 16, 16, var3, Class144.aClass144_1680);
      } else {
         this.aClass124_9215 = new Class124_Sub1(this.aClass174_Sub2_9216, 3553, 256, 16, false, var2, 256, 0, false);
      }

   }

   Class124 method8482() {
      return this.aClass124_9215;
   }

   byte[] method8483(int[] var1) {
      byte[] var2 = new byte[16384];

      for(int var3 = 0; var3 < 16; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = var1[256 * var4 + 16 * var5 + var3];
               int var7 = (var5 * 256 + var4 * 16 + var3) * 4;
               var2[var7 + 0] = (byte)(var6 >> 16 & 255);
               var2[var7 + 1] = (byte)(var6 >> 8 & 255);
               var2[var7 + 2] = (byte)(var6 & 255);
               var2[var7 + 3] = -1;
            }
         }
      }

      return var2;
   }

   byte[] method8484(int[] var1) {
      byte[] var2 = new byte[16384];

      for(int var3 = 0; var3 < 16; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = var1[256 * var4 + 16 * var5 + var3];
               int var7 = (var5 * 256 + var4 * 16 + var3) * 4;
               var2[var7 + 0] = (byte)(var6 >> 16 & 255);
               var2[var7 + 1] = (byte)(var6 >> 8 & 255);
               var2[var7 + 2] = (byte)(var6 & 255);
               var2[var7 + 3] = -1;
            }
         }
      }

      return var2;
   }

   byte[] method8485(int[] var1) {
      byte[] var2 = new byte[16384];

      for(int var3 = 0; var3 < 16; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = var1[256 * var4 + 16 * var5 + var3];
               int var7 = (var5 * 256 + var4 * 16 + var3) * 4;
               var2[var7 + 0] = (byte)(var6 >> 16 & 255);
               var2[var7 + 1] = (byte)(var6 >> 8 & 255);
               var2[var7 + 2] = (byte)(var6 & 255);
               var2[var7 + 3] = -1;
            }
         }
      }

      return var2;
   }
}
