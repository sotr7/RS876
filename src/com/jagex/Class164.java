package com.jagex;

import com.jagex.Class433;
import com.jagex.Class437;

public class Class164 {
   public boolean aBool1784 = false;
   public int anInt1789;
   public int anInt1786;
   public int anInt1785;
   public int anInt1788;
   public int anInt1787;

   public boolean method1927(int var1, int var2) {
      if(!this.aBool1784) {
         return false;
      } else {
         int var3 = this.anInt1785 - this.anInt1789;
         int var4 = this.anInt1788 - this.anInt1786;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = var1 * var3 + var2 * var4 - (this.anInt1789 * var3 + this.anInt1786 * var4);
         int var8;
         int var10;
         if(var6 <= 0) {
            var10 = this.anInt1789 - var1;
            var8 = this.anInt1786 - var2;
            return var10 * var10 + var8 * var8 < this.anInt1787 * this.anInt1787;
         } else if(var6 > var5) {
            var10 = this.anInt1785 - var1;
            var8 = this.anInt1788 - var2;
            return var10 * var10 + var8 * var8 < this.anInt1787 * this.anInt1787;
         } else {
            byte var7 = 10;
            if(var6 != (var6 & 2097151)) {
               var7 = 5;
            }

            var6 = (var6 << var7) / var5;
            var8 = this.anInt1789 + (var3 * var6 >> var7) - var1;
            int var9 = this.anInt1786 + (var4 * var6 >> var7) - var2;
            return var8 * var8 + var9 * var9 < this.anInt1787 * this.anInt1787;
         }
      }
   }

   public void method1928(Class437 var1, Class433 var2, Class433 var3, float var4, float var5, float var6, float var7) {
      boolean var8 = false;
      this.aBool1784 = true;
      int var9 = (int)(var1.aFloat4856 + var1.aFloat4853) >> 1;
      int var10 = (int)(var1.aFloat4852 + var1.aFloat4855) >> 1;
      int var12 = (int)var1.aFloat4858;
      float var14 = var3.aFloatArray4841[0] * (float)var9 + var3.aFloatArray4841[4] * (float)var12 + var3.aFloatArray4841[8] * (float)var10 + var3.aFloatArray4841[12];
      float var15 = var3.aFloatArray4841[1] * (float)var9 + var3.aFloatArray4841[5] * (float)var12 + var3.aFloatArray4841[9] * (float)var10 + var3.aFloatArray4841[13];
      float var16 = var3.aFloatArray4841[2] * (float)var9 + var3.aFloatArray4841[6] * (float)var12 + var3.aFloatArray4841[10] * (float)var10 + var3.aFloatArray4841[14];
      float var17 = var3.aFloatArray4841[3] * (float)var9 + var3.aFloatArray4841[7] * (float)var12 + var3.aFloatArray4841[11] * (float)var10 + var3.aFloatArray4841[15];
      if(var16 >= -var17) {
         this.anInt1789 = (int)(var4 + var6 * var14 / var17);
         this.anInt1786 = (int)(var5 + var7 * var15 / var17);
      } else {
         var8 = true;
      }

      var12 = (int)var1.aFloat4854;
      float var18 = var3.aFloatArray4841[0] * (float)var9 + var3.aFloatArray4841[4] * (float)var12 + var3.aFloatArray4841[8] * (float)var10 + var3.aFloatArray4841[12];
      float var19 = var3.aFloatArray4841[1] * (float)var9 + var3.aFloatArray4841[5] * (float)var12 + var3.aFloatArray4841[9] * (float)var10 + var3.aFloatArray4841[13];
      float var20 = var3.aFloatArray4841[2] * (float)var9 + var3.aFloatArray4841[6] * (float)var12 + var3.aFloatArray4841[10] * (float)var10 + var3.aFloatArray4841[14];
      float var21 = var3.aFloatArray4841[3] * (float)var9 + var3.aFloatArray4841[7] * (float)var12 + var3.aFloatArray4841[11] * (float)var10 + var3.aFloatArray4841[15];
      if(var20 >= -var21) {
         this.anInt1785 = (int)(var4 + var6 * var18 / var21);
         this.anInt1788 = (int)(var5 + var7 * var19 / var21);
      } else {
         var8 = true;
      }

      float var22;
      float var23;
      float var24;
      if(var8) {
         if(var16 < -var17 && var20 < -var21) {
            this.aBool1784 = false;
         } else {
            float var25;
            if(var16 < -var17) {
               var22 = (var16 + var17) / (var20 + var21) - 1.0F;
               var23 = var14 + var22 * (var18 - var14);
               var24 = var15 + var22 * (var19 - var15);
               var25 = var17 + var22 * (var21 - var17);
               this.anInt1789 = (int)(var4 + var6 * var23 / var25);
               this.anInt1786 = (int)(var5 + var7 * var24 / var25);
            } else if(var20 < -var21) {
               var22 = (var20 + var21) / (var16 + var17) - 1.0F;
               var23 = var18 + var22 * (var14 - var18);
               var24 = var19 + var22 * (var15 - var19);
               var25 = var21 + var22 * (var17 - var21);
               this.anInt1785 = (int)(var4 + var6 * var23 / var25);
               this.anInt1788 = (int)(var5 + var7 * var24 / var25);
            }
         }
      }

      if(this.aBool1784) {
         var22 = (float)Math.sqrt(Math.pow((double)(var1.aFloat4853 - var1.aFloat4856), 2.0D) + Math.pow((double)(var1.aFloat4855 - var1.aFloat4852), 2.0D)) / 2.0F;
         if(var16 / var17 > var20 / var21) {
            var23 = var14 + var2.aFloatArray4841[0] * var22 + var2.aFloatArray4841[12];
            var24 = var17 + var2.aFloatArray4841[3] * var22 + var2.aFloatArray4841[15];
            this.anInt1787 = (int)(var4 - (float)this.anInt1789 + var6 * var23 / var24);
         } else {
            var23 = var18 + var2.aFloatArray4841[0] * var22 + var2.aFloatArray4841[12];
            var24 = var21 + var2.aFloatArray4841[3] * var22 + var2.aFloatArray4841[15];
            this.anInt1787 = (int)(var4 - (float)this.anInt1785 + var6 * var23 / var24);
         }

         this.aBool1784 = true;
      }

   }
}
