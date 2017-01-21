package com.jagex;

import com.jagex.Class144;
import com.jagex.Class174_Sub3;
import com.jagex.Class176;
import com.jagex.Interface41;

public class Class176_Sub1 extends Class176 {
   Class174_Sub3 aClass174_Sub3_9040;
   Interface41 anInterface41_9039;

   public Interface41 method8408() {
      return this.anInterface41_9039;
   }

   byte[] method8409(int[] var1) {
      byte[] var2 = new byte[16384];

      for(int var3 = 0; var3 < 16; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = var1[256 * var4 + 16 * var5 + var3];
               int var7 = (var5 * 256 + var4 * 16 + var3) * 4;
               if(this.aClass174_Sub3_9040.anInt9729 == 0) {
                  var2[var7 + 0] = (byte)(var6 & 255);
                  var2[var7 + 1] = (byte)(var6 >> 8 & 255);
                  var2[var7 + 2] = (byte)(var6 >> 16 & 255);
                  var2[var7 + 3] = -1;
               } else {
                  var2[var7 + 0] = (byte)(var6 >> 16 & 255);
                  var2[var7 + 1] = (byte)(var6 >> 8 & 255);
                  var2[var7 + 2] = (byte)(var6 & 255);
                  var2[var7 + 3] = -1;
               }
            }
         }
      }

      return var2;
   }

   byte[] method8410(int[] var1) {
      byte[] var2 = new byte[16384];

      for(int var3 = 0; var3 < 16; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = var1[256 * var4 + 16 * var5 + var3];
               int var7 = (var5 * 256 + var4 * 16 + var3) * 4;
               if(this.aClass174_Sub3_9040.anInt9729 == 0) {
                  var2[var7 + 0] = (byte)(var6 & 255);
                  var2[var7 + 1] = (byte)(var6 >> 8 & 255);
                  var2[var7 + 2] = (byte)(var6 >> 16 & 255);
                  var2[var7 + 3] = -1;
               } else {
                  var2[var7 + 0] = (byte)(var6 >> 16 & 255);
                  var2[var7 + 1] = (byte)(var6 >> 8 & 255);
                  var2[var7 + 2] = (byte)(var6 & 255);
                  var2[var7 + 3] = -1;
               }
            }
         }
      }

      return var2;
   }

   byte[] method8411(int[] var1) {
      byte[] var2 = new byte[16384];

      for(int var3 = 0; var3 < 16; ++var3) {
         for(int var4 = 0; var4 < 16; ++var4) {
            for(int var5 = 0; var5 < 16; ++var5) {
               int var6 = var1[256 * var4 + 16 * var5 + var3];
               int var7 = (var5 * 256 + var4 * 16 + var3) * 4;
               if(this.aClass174_Sub3_9040.anInt9729 == 0) {
                  var2[var7 + 0] = (byte)(var6 & 255);
                  var2[var7 + 1] = (byte)(var6 >> 8 & 255);
                  var2[var7 + 2] = (byte)(var6 >> 16 & 255);
                  var2[var7 + 3] = -1;
               } else {
                  var2[var7 + 0] = (byte)(var6 >> 16 & 255);
                  var2[var7 + 1] = (byte)(var6 >> 8 & 255);
                  var2[var7 + 2] = (byte)(var6 & 255);
                  var2[var7 + 3] = -1;
               }
            }
         }
      }

      return var2;
   }

   Class176_Sub1(Class174_Sub3 var1, int[] var2) {
      this.aClass174_Sub3_9040 = var1;
      if(this.aClass174_Sub3_9040.aBool9832) {
         byte[] var3 = this.method8409(var2);
         this.anInterface41_9039 = this.aClass174_Sub3_9040.method8953(Class144.aClass144_1680, 16, 16, 16, false, var3);
      } else {
         this.anInterface41_9039 = this.aClass174_Sub3_9040.method8906(256, 16, false, var2);
      }

   }
}
