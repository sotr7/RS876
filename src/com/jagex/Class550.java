package com.jagex;

public class Class550 {
   int anInt7348;
   int anInt7340;
   int anInt7341;
   int anInt7347;
   int anInt7343;
   int anInt7344;
   int anInt7342;
   int anInt7346;
   int anInt7339;
   int anInt7345;

   void method6639(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.anInt7348 = var1;
      this.anInt7340 = var2;
      this.anInt7341 = var3;
      this.anInt7347 = var4 * var4;
      this.anInt7343 = this.anInt7348 + var5;
      this.anInt7344 = this.anInt7348 + var6;
      this.anInt7342 = this.anInt7340 + var7;
      this.anInt7346 = this.anInt7340 + var8;
      this.anInt7339 = this.anInt7341 + var9;
      this.anInt7345 = this.anInt7341 + var10;
   }

   Class550(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.anInt7348 = var1;
      this.anInt7340 = var2;
      this.anInt7341 = var3;
      this.anInt7347 = var4 * var4;
      this.anInt7343 = this.anInt7348 + var5;
      this.anInt7344 = this.anInt7348 + var6;
      this.anInt7342 = this.anInt7340 + var7;
      this.anInt7346 = this.anInt7340 + var8;
      this.anInt7339 = this.anInt7341 + var9;
      this.anInt7345 = this.anInt7341 + var10;
   }

   public boolean method6640(int var1, int var2, int var3) {
      if(var1 >= this.anInt7343 && var1 <= this.anInt7344) {
         if(var2 >= this.anInt7342 && var2 <= this.anInt7346) {
            if(var3 >= this.anInt7339 && var3 <= this.anInt7345) {
               int var4 = var1 - this.anInt7348;
               int var5 = var3 - this.anInt7341;
               return var4 * var4 + var5 * var5 < this.anInt7347;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
