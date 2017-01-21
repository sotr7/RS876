package com.jagex;

import com.jagex.Class248;

public class Class244 {
   int[] anIntArray2462 = null;
   Class248 aClass248_2465;
   int anInt2466;
   int anInt2461;
   int[] anIntArray2460;
   int[] anIntArray2463;
   int[] anIntArray2467;
   int[] anIntArray2464;

   void method3336(int[] var1) {
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = 0;
         }

      }
   }

   void method3337(Class248 var1) {
      this.aClass248_2465 = var1;
      int var2 = this.aClass248_2465.method3455();
      this.aClass248_2465.method3418(16);
      this.anInt2466 = this.aClass248_2465.method3454() != 0?this.aClass248_2465.method3418(4) + 1:1;
      int var3;
      if(this.aClass248_2465.method3454() != 0) {
         this.anInt2461 = this.aClass248_2465.method3418(8) + 1;
         if(this.anIntArray2460 != null && this.anIntArray2460.length == this.anInt2461) {
            this.method3336(this.anIntArray2460);
         } else {
            this.anIntArray2460 = new int[this.anInt2461];
         }

         if(this.anIntArray2467 != null && this.anIntArray2467.length == this.anInt2461) {
            this.method3336(this.anIntArray2467);
         } else {
            this.anIntArray2467 = new int[this.anInt2461];
         }

         for(var3 = 0; var3 < this.anInt2461; ++var3) {
            this.anIntArray2460[var3] = this.aClass248_2465.method3418(this.method3338(var2 - 1));
            this.anIntArray2467[var3] = this.aClass248_2465.method3418(this.method3338(var2 - 1));
         }
      } else {
         this.anInt2461 = 0;
      }

      this.aClass248_2465.method3418(2);
      if(this.anInt2466 > 1) {
         this.anIntArray2462 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.anIntArray2462[var3] = this.aClass248_2465.method3418(4);
         }
      }

      if(this.anIntArray2463 != null && this.anIntArray2463.length == this.anInt2466) {
         this.method3336(this.anIntArray2463);
      } else {
         this.anIntArray2463 = new int[this.anInt2466];
      }

      if(this.anIntArray2464 != null && this.anIntArray2464.length == this.anInt2466) {
         this.method3336(this.anIntArray2464);
      } else {
         this.anIntArray2464 = new int[this.anInt2466];
      }

      for(var3 = 0; var3 < this.anInt2466; ++var3) {
         this.aClass248_2465.method3418(8);
         this.anIntArray2463[var3] = this.aClass248_2465.method3418(8);
         this.anIntArray2464[var3] = this.aClass248_2465.method3418(8);
      }

   }

   int method3338(int var1) {
      int var2;
      for(var2 = 0; var1 > 0; var1 >>= 1) {
         ++var2;
      }

      return var2;
   }

   int method3339(int var1) {
      int var2;
      for(var2 = 0; var1 > 0; var1 >>= 1) {
         ++var2;
      }

      return var2;
   }

   void method3340(int[] var1) {
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = 0;
         }

      }
   }

   int method3341(int var1) {
      int var2;
      for(var2 = 0; var1 > 0; var1 >>= 1) {
         ++var2;
      }

      return var2;
   }
}
