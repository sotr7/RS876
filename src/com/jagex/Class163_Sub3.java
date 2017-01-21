package com.jagex;

import com.jagex.Class1;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class163;
import com.jagex.Class173_Sub1;
import com.jagex.Class174_Sub1;
import com.jagex.Class57;
import com.jagex.Class688;

public class Class163_Sub3 extends Class163 {
   Class174_Sub1 aClass174_Sub1_9864;
   int[] anIntArray9863;
   int[] anIntArray9866;
   Class153[] aClass153Array9861;
   Class153[] aClass153Array9862;
   int[] anIntArray9865;
   int[] anIntArray9860;

   void method1913(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
   }

   void method1908(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9864.anIntArray9243 != null) {
         var2 += this.anIntArray9860[var1];
         var3 += this.anIntArray9865[var1];
         if(var5) {
            this.aClass153Array9862[var1].method1774(var2, var3, 1, var4, 1);
         } else {
            this.aClass153Array9861[var1].method1774(var2, var3, 1, var4, 1);
         }

      }
   }

   void method1922(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
   }

   void method1909(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9864.anIntArray9243 != null) {
         var2 += this.anIntArray9860[var1];
         var3 += this.anIntArray9865[var1];
         if(var5) {
            this.aClass153Array9862[var1].method1774(var2, var3, 1, var4, 1);
         } else {
            this.aClass153Array9861[var1].method1774(var2, var3, 1, var4, 1);
         }

      }
   }

   void method1910(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9864.anIntArray9243 != null) {
         var2 += this.anIntArray9860[var1];
         var3 += this.anIntArray9865[var1];
         if(var5) {
            this.aClass153Array9862[var1].method1774(var2, var3, 1, var4, 1);
         } else {
            this.aClass153Array9861[var1].method1774(var2, var3, 1, var4, 1);
         }

      }
   }

   void method1906(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9864.anIntArray9243 != null) {
         var2 += this.anIntArray9860[var1];
         var3 += this.anIntArray9865[var1];
         if(var5) {
            this.aClass153Array9862[var1].method1774(var2, var3, 1, var4, 1);
         } else {
            this.aClass153Array9861[var1].method1774(var2, var3, 1, var4, 1);
         }

      }
   }

   Class163_Sub3(Class174_Sub1 var1, Class1 var2, Class173_Sub1[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.aClass174_Sub1_9864 = var1;
      this.aClass174_Sub1_9864 = var1;
      this.anIntArray9863 = var4;
      this.anIntArray9866 = var5;
      this.aClass153Array9861 = new Class153[var3.length];
      this.aClass153Array9862 = new Class153[var3.length];
      this.anIntArray9865 = new int[var3.length];
      this.anIntArray9860 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         this.aClass153Array9861[var6] = this.aClass174_Sub1_9864.method2310(var3[var6], false);
         int[] var7 = (int[])((int[])var3[var6].method2204(false).clone());

         for(int var8 = 0; var8 < var7.length; ++var8) {
            int var9 = var7[var8];
            byte var10 = (byte)(3 * (var9 >> 16 & 255) + 4 * (var9 >> 8 & 255) + (var9 & 255) >> 3);
            var7[var8] = var7[var8] & -16777216 | var10 << 16 | var10 << 8 | var10;
         }

         this.aClass153Array9862[var6] = this.aClass174_Sub1_9864.method2613(var7, 0, this.anIntArray9863[var6], this.anIntArray9863[var6], this.anIntArray9866[var6], false);
         this.anIntArray9865[var6] = var3[var6].method2172();
         this.anIntArray9860[var6] = var3[var6].method2170();
      }

   }

   void method1907(char var1, int var2, int var3, int var4, boolean var5, Class162 var6, int var7, int var8) {
   }

   void method1912(char var1, int var2, int var3, int var4, boolean var5) {
      if(this.aClass174_Sub1_9864.anIntArray9243 != null) {
         var2 += this.anIntArray9860[var1];
         var3 += this.anIntArray9865[var1];
         if(var5) {
            this.aClass153Array9862[var1].method1774(var2, var3, 1, var4, 1);
         } else {
            this.aClass153Array9861[var1].method1774(var2, var3, 1, var4, 1);
         }

      }
   }

   public static Class688 method8992(byte var0) {
      return Class57.aClass688_690 == null?Class688.aClass688_8683:Class57.aClass688_690;
   }
}
