package com.jagex;

import com.jagex.Class206;
import com.jagex.Class47;
import com.jagex.Class570;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class704;

public class Class704_Sub3 extends Class704 {
   public boolean aBool10969 = false;
   Class639_Sub1_Sub2_Sub1 aClass639_Sub1_Sub2_Sub1_10968;

   Class704_Sub3(Class639_Sub1_Sub2_Sub1 var1, boolean var2) {
      super(var2);
      this.aClass639_Sub1_Sub2_Sub1_10968 = var1;
   }

   void method8240(Class206 var1, int var2, int var3) {
      if(!this.aBool10969 || !this.aClass639_Sub1_Sub2_Sub1_10968.aClass704_11915.method8218((byte)-40) || this.aClass639_Sub1_Sub2_Sub1_10968.aClass704_11915.method8227((byte)14)) {
         Class570.aClass231_7657.method3215(var1, var2, this.aClass639_Sub1_Sub2_Sub1_10968, -1436282933);
      }

   }

   void method8242(Class206 var1, int var2) {
      if(!this.aBool10969 || !this.aClass639_Sub1_Sub2_Sub1_10968.aClass704_11915.method8218((byte)-108) || this.aClass639_Sub1_Sub2_Sub1_10968.aClass704_11915.method8227((byte)16)) {
         Class570.aClass231_7657.method3215(var1, var2, this.aClass639_Sub1_Sub2_Sub1_10968, 363781915);
      }

   }

   public static void method10273(float[] var0, int[] var1, int var2, int var3, byte var4) {
      if(var2 < var3) {
         int var5 = (var3 + var2) / 2;
         int var6 = var2;
         float var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if(var0[var9] > var7) {
               float var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method10273(var0, var1, var2, var6 - 1, (byte)-13);
         method10273(var0, var1, var6 + 1, var3, (byte)85);
      }

   }

   static final void method10274(String var0, int var1) {
      System.out.println("Error: " + Class47.method930(var0, "%0a", "\n", -1356949092));
   }
}
