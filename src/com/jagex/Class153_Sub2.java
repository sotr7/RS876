package com.jagex;

import com.jagex.Class144;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class162_Sub3;
import com.jagex.Class166;
import com.jagex.Class174_Sub3;
import com.jagex.Class321;
import com.jagex.Class350;
import com.jagex.Class433;
import com.jagex.Interface21;
import com.jagex.Interface38;
import com.jagex.Interface43;

public class Class153_Sub2 extends Class153 {
   boolean aBool9217;
   int anInt9223;
   int anInt9229;
   int anInt9225;
   int anInt9226;
   Class174_Sub3 aClass174_Sub3_9222;
   int anInt9220;
   int anInt9224;
   Interface38 anInterface38_9218;
   Interface21 anInterface21_9219;
   boolean aBool9227;
   boolean aBool9228;
   boolean aBool9221;
   boolean aBool9230;

   Class153_Sub2(Class174_Sub3 var1, Interface38 var2, int var3, int var4) {
      this.aBool9217 = false;
      this.anInt9223 = 0;
      this.anInt9229 = 0;
      this.anInt9225 = 0;
      this.anInt9226 = 0;
      this.aClass174_Sub3_9222 = var1;
      this.anInt9220 = var3;
      this.anInt9224 = var4;
      this.anInterface38_9218 = var2;
      this.anInterface21_9219 = null;
      this.aBool9227 = this.anInterface38_9218.method1() != var3;
      this.aBool9228 = this.anInterface38_9218.method94() != var4;
      this.aBool9221 = !this.aBool9227 && this.anInterface38_9218.method286();
      this.aBool9230 = !this.aBool9228 && this.anInterface38_9218.method286();
   }

   Class153_Sub2(Class174_Sub3 var1, int var2, int var3, int[] var4, int var5, int var6) {
      this.aBool9217 = false;
      this.anInt9223 = 0;
      this.anInt9229 = 0;
      this.anInt9225 = 0;
      this.anInt9226 = 0;
      this.aClass174_Sub3_9222 = var1;
      this.anInt9220 = var2;
      this.anInt9224 = var3;
      this.anInterface21_9219 = null;
      this.anInterface38_9218 = var1.method8883(var2, var3, false, var4, var5, var6);
      this.anInterface38_9218.method254(true, true);
      this.aBool9227 = this.anInterface38_9218.method1() != var2;
      this.aBool9228 = this.anInterface38_9218.method94() != var3;
      this.aBool9221 = !this.aBool9227 && this.anInterface38_9218.method286();
      this.aBool9230 = !this.aBool9228 && this.anInterface38_9218.method286();
   }

   void method1819(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + var3), (float)(var2 + var4), this.anInterface38_9218.method251(0.0F), this.anInterface38_9218.method252(0.0F), this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), this.anInterface38_9218, var6);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var9 = this.aClass174_Sub3_9222.aClass321_9741;
         var9.anInterface38_3444 = this.anInterface38_9218;
         var9.method4141(var5, var6);
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         float var10 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var11 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var9.aClass433_3449.method5141((float)var3 * 2.0F / var10, (float)var4 * 2.0F / var11, 1.0F, 1.0F);
         var9.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var10 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var11 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var9.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var9.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var9.anInt3450 = 0;
         var9.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var9.method4142();
      }

   }

   public int method1813() {
      return this.anInt9220;
   }

   Class153_Sub2(Class174_Sub3 var1, int var2, int var3, boolean var4, boolean var5) {
      this.aBool9217 = false;
      this.anInt9223 = 0;
      this.anInt9229 = 0;
      this.anInt9225 = 0;
      this.anInt9226 = 0;
      this.aClass174_Sub3_9222 = var1;
      this.anInt9220 = var2;
      this.anInt9224 = var3;
      if(var5) {
         Interface43 var6 = var1.method8789(var4?Class144.aClass144_1680:Class144.aClass144_1689, Class166.aClass166_1884, var2, var3);
         this.anInterface21_9219 = var6.method344(0);
         this.anInterface38_9218 = var6;
      } else {
         this.anInterface38_9218 = var1.method8955(var4?Class144.aClass144_1680:Class144.aClass144_1689, Class166.aClass166_1884, var2, var3);
         this.anInterface21_9219 = null;
      }

      this.anInterface38_9218.method254(true, true);
      this.aBool9227 = this.anInterface38_9218.method1() != var2;
      this.aBool9228 = this.anInterface38_9218.method94() != var3;
      this.aBool9221 = !this.aBool9227 && this.anInterface38_9218.method286();
      this.aBool9230 = !this.aBool9228 && this.anInterface38_9218.method286();
   }

   public void method1777(int var1, int var2, int var3) {
      int[] var4 = this.aClass174_Sub3_9222.method2479(var1, var2, this.anInt9220, this.anInt9224);
      int[] var5 = new int[this.anInt9220 * this.anInt9224];
      this.anInterface38_9218.method279(0, 0, this.anInt9220, this.anInt9224, var5, 0);
      int var6;
      int var7;
      int var8;
      if(var3 == 0) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
            }
         }
      } else if(var3 == 1) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 16 & -16777216;
            }
         }
      } else if(var3 == 2) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 24 & -16777216;
            }
         }
      } else if(var3 == 3) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | (var4[var7 + var8] != 0?-16777216:0);
            }
         }
      }

      this.method1782(0, 0, this.anInt9220, this.anInt9224, var5, 0, this.anInt9220);
   }

   public void method1828(int var1, int var2, int var3, int var4) {
      this.anInt9229 = var1;
      this.anInt9223 = var2;
      this.anInt9226 = var3;
      this.anInt9225 = var4;
      this.aBool9217 = this.anInt9229 != 0 || this.anInt9223 != 0 || this.anInt9226 != 0 || this.anInt9225 != 0;
   }

   public void method1782(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.anInterface38_9218.method255(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1779(int var1, int var2, Class162 var3, int var4, int var5) {
      this.aClass174_Sub3_9222.method8763();
      Class321 var6 = this.aClass174_Sub3_9222.aClass321_9741;
      var6.anInterface38_3444 = this.anInterface38_9218;
      var6.method4141(1, -1);
      var1 += this.anInt9229;
      var2 += this.anInt9223;
      float var7 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
      float var8 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
      var6.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var7, (float)this.anInt9224 * 2.0F / var8, 1.0F, 1.0F);
      var6.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var7 - 1.0F;
      var6.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var8 - 1.0F;
      var6.aClass433_3449.aFloatArray4841[14] = -1.0F;
      var6.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
      var6.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
      var6.anInt3450 = 0;
      var6.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
      Interface38 var9 = ((Class162_Sub3)var3).anInterface38_9359;
      var6.anInterface38_3445 = var9;
      var6.aClass433_3448.method5141(var9.method251((float)this.anInt9220), var9.method252((float)this.anInt9224), 1.0F, 1.0F);
      var6.aClass433_3448.aFloatArray4841[12] = var9.method251((float)(var1 - var4));
      var6.aClass433_3448.aFloatArray4841[13] = var9.method252((float)(var2 - var5));
      var6.method4143();
   }

   void method1793(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10) {
      this.aClass174_Sub3_9222.method8763();
      Class321 var11 = this.aClass174_Sub3_9222.aClass321_9741;
      var11.anInterface38_3444 = this.anInterface38_9218;
      var11.method4141(1, -1);
      float var12 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
      float var13 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
      var11.aClass433_3449.method5104();
      if(this.aBool9217) {
         float var14 = (float)this.anInt9220 / (float)this.method21();
         float var15 = (float)this.anInt9224 / (float)this.method1788();
         var11.aClass433_3449.aFloatArray4841[0] = (var3 - var1) * var14;
         var11.aClass433_3449.aFloatArray4841[1] = (var4 - var2) * var14;
         var11.aClass433_3449.aFloatArray4841[4] = (var5 - var1) * var15;
         var11.aClass433_3449.aFloatArray4841[5] = (var6 - var2) * var15;
         var11.aClass433_3449.aFloatArray4841[12] = (var1 + (float)this.anInt9229) * var14 + this.aClass174_Sub3_9222.method8737();
         var11.aClass433_3449.aFloatArray4841[13] = (var2 + (float)this.anInt9223) * var15 + this.aClass174_Sub3_9222.method8737();
      } else {
         var11.aClass433_3449.aFloatArray4841[0] = var3 - var1;
         var11.aClass433_3449.aFloatArray4841[1] = var4 - var2;
         var11.aClass433_3449.aFloatArray4841[4] = var5 - var1;
         var11.aClass433_3449.aFloatArray4841[5] = var6 - var2;
         var11.aClass433_3449.aFloatArray4841[12] = var1 + this.aClass174_Sub3_9222.method8737();
         var11.aClass433_3449.aFloatArray4841[13] = var2 + this.aClass174_Sub3_9222.method8737();
      }

      Class433 var16 = this.aClass174_Sub3_9222.aClass433_9705;
      var16.method5104();
      var16.aFloatArray4841[0] = 2.0F / var12;
      var16.aFloatArray4841[5] = 2.0F / var13;
      var16.aFloatArray4841[12] = -1.0F;
      var16.aFloatArray4841[13] = -1.0F;
      var16.aFloatArray4841[14] = -1.0F;
      var11.aClass433_3449.method5085(var16);
      var11.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
      var11.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
      var11.anInt3450 = 0;
      var11.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
      Interface38 var17 = ((Class162_Sub3)var8).anInterface38_9359;
      var11.anInterface38_3445 = var17;
      var11.aClass433_3448.method5104();
      var11.aClass433_3448.aFloatArray4841[0] = (var3 - var1) * var17.method251(1.0F);
      var11.aClass433_3448.aFloatArray4841[1] = (var4 - var2) * var17.method251(1.0F);
      var11.aClass433_3448.aFloatArray4841[4] = (var5 - var1) * var17.method252(1.0F);
      var11.aClass433_3448.aFloatArray4841[5] = (var6 - var2) * var17.method252(1.0F);
      var11.aClass433_3448.aFloatArray4841[12] = (var1 - (float)var9) * var17.method251(1.0F);
      var11.aClass433_3448.aFloatArray4841[13] = (var2 - (float)var10) * var17.method252(1.0F);
      var11.method4143();
   }

   public void method1803(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         int var8 = var2 + var4;
         int var9 = var1 + var3;
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.anInt9223;

         for(var13 = var12 + this.anInt9224; var13 <= var8; var13 += var11) {
            var14 = var1 + this.anInt9229;

            for(var15 = var14 + this.anInt9220; var15 <= var9; var15 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + this.anInt9220), (float)(var12 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
               var14 += var10;
            }

            if(var14 < var9) {
               var16 = var9 - var14;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + var16), (float)(var12 + this.anInt9224), 0.0F, 0.0F, (float)var16 / (float)this.anInt9220 * this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
            }

            var12 += var11;
         }

         if(var12 < var8) {
            var14 = var8 - var12;
            float var28 = (float)var14 / (float)this.anInt9224 * this.anInterface38_9218.method260();
            var16 = var1 + this.anInt9229;

            for(var17 = var16 + this.anInt9220; var17 <= var9; var17 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + this.anInt9220), (float)(var12 + var14), 0.0F, 0.0F, this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
               var16 += var10;
            }

            if(var16 < var9) {
               var18 = var9 - var16;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + var18), (float)(var12 + var14), 0.0F, 0.0F, (float)var18 / (float)this.anInt9220 * this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
            }
         }
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var23 = this.aClass174_Sub3_9222.aClass321_9741;
         var23.anInterface38_3444 = this.anInterface38_9218;
         var23.method4141(var5, var6);
         float var24 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var25 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var23.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var23.anInt3450 = 0;
         var23.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         boolean var26 = this.aBool9230 && this.anInt9223 == 0 && this.anInt9225 == 0;
         boolean var27 = this.aBool9221 && this.anInt9229 == 0 && this.anInt9226 == 0;
         if(var27 & var26) {
            var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
            var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var23.method4142();
         } else if(var27) {
            var13 = var2 + var4;
            var14 = this.method1788();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
            var15 = var2 + this.anInt9223;

            for(var16 = var15 + this.anInt9224; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var17), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var17 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else if(var26) {
            var13 = var1 + var3;
            var14 = this.method21();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var15 = var1 + this.anInt9229;

            for(var16 = var15 + this.anInt9220; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var17), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var17 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else {
            var13 = var2 + var4;
            var14 = var1 + var3;
            var15 = this.method21();
            var16 = this.method1788();
            var17 = var2 + this.anInt9223;

            int var19;
            int var20;
            int var21;
            for(var18 = var17 + this.anInt9224; var18 <= var13; var18 += var16) {
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
               var19 = var1 + this.anInt9229;

               for(var20 = var19 + this.anInt9220; var20 <= var14; var20 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var19 += var15;
               }

               if(var19 < var14) {
                  var21 = var14 - var19;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var21), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var21 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }

               var17 += var16;
            }

            if(var17 < var13) {
               var19 = var13 - var17;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
               var20 = var1 + this.anInt9229;

               for(var21 = var20 + this.anInt9220; var21 <= var14; var21 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var20 += var15;
               }

               if(var20 < var14) {
                  int var22 = var14 - var20;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var22), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var22 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }
            }
         }
      }

   }

   public int method1788() {
      return this.anInt9224 + this.anInt9223 + this.anInt9225;
   }

   public Interface21 method1773() {
      return this.anInterface21_9219;
   }

   public int method21() {
      return this.anInt9220 + this.anInt9229 + this.anInt9226;
   }

   public void method1768(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.anInterface38_9218.method258(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1774(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + this.anInt9220), (float)(var2 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var4);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var5);
         Class321 var6 = this.aClass174_Sub3_9222.aClass321_9741;
         var6.anInterface38_3444 = this.anInterface38_9218;
         var6.method4141(var3, var4);
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         float var7 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var8 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var6.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var7, (float)this.anInt9224 * 2.0F / var8, 1.0F, 1.0F);
         var6.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var7 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var8 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var6.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var6.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var6.anInt3450 = 0;
         var6.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var6.method4142();
      }

   }

   public int method1771() {
      return this.anInt9224;
   }

   void method1775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + var3), (float)(var2 + var4), this.anInterface38_9218.method251(0.0F), this.anInterface38_9218.method252(0.0F), this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), this.anInterface38_9218, var6);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var9 = this.aClass174_Sub3_9222.aClass321_9741;
         var9.anInterface38_3444 = this.anInterface38_9218;
         var9.method4141(var5, var6);
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         float var10 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var11 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var9.aClass433_3449.method5141((float)var3 * 2.0F / var10, (float)var4 * 2.0F / var11, 1.0F, 1.0F);
         var9.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var10 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var11 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var9.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var9.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var9.anInt3450 = 0;
         var9.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var9.method4142();
      }

   }

   public void method1784(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         int var8 = var2 + var4;
         int var9 = var1 + var3;
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.anInt9223;

         for(var13 = var12 + this.anInt9224; var13 <= var8; var13 += var11) {
            var14 = var1 + this.anInt9229;

            for(var15 = var14 + this.anInt9220; var15 <= var9; var15 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + this.anInt9220), (float)(var12 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
               var14 += var10;
            }

            if(var14 < var9) {
               var16 = var9 - var14;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + var16), (float)(var12 + this.anInt9224), 0.0F, 0.0F, (float)var16 / (float)this.anInt9220 * this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
            }

            var12 += var11;
         }

         if(var12 < var8) {
            var14 = var8 - var12;
            float var28 = (float)var14 / (float)this.anInt9224 * this.anInterface38_9218.method260();
            var16 = var1 + this.anInt9229;

            for(var17 = var16 + this.anInt9220; var17 <= var9; var17 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + this.anInt9220), (float)(var12 + var14), 0.0F, 0.0F, this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
               var16 += var10;
            }

            if(var16 < var9) {
               var18 = var9 - var16;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + var18), (float)(var12 + var14), 0.0F, 0.0F, (float)var18 / (float)this.anInt9220 * this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
            }
         }
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var23 = this.aClass174_Sub3_9222.aClass321_9741;
         var23.anInterface38_3444 = this.anInterface38_9218;
         var23.method4141(var5, var6);
         float var24 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var25 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var23.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var23.anInt3450 = 0;
         var23.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         boolean var26 = this.aBool9230 && this.anInt9223 == 0 && this.anInt9225 == 0;
         boolean var27 = this.aBool9221 && this.anInt9229 == 0 && this.anInt9226 == 0;
         if(var27 & var26) {
            var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
            var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var23.method4142();
         } else if(var27) {
            var13 = var2 + var4;
            var14 = this.method1788();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
            var15 = var2 + this.anInt9223;

            for(var16 = var15 + this.anInt9224; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var17), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var17 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else if(var26) {
            var13 = var1 + var3;
            var14 = this.method21();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var15 = var1 + this.anInt9229;

            for(var16 = var15 + this.anInt9220; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var17), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var17 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else {
            var13 = var2 + var4;
            var14 = var1 + var3;
            var15 = this.method21();
            var16 = this.method1788();
            var17 = var2 + this.anInt9223;

            int var19;
            int var20;
            int var21;
            for(var18 = var17 + this.anInt9224; var18 <= var13; var18 += var16) {
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
               var19 = var1 + this.anInt9229;

               for(var20 = var19 + this.anInt9220; var20 <= var14; var20 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var19 += var15;
               }

               if(var19 < var14) {
                  var21 = var14 - var19;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var21), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var21 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }

               var17 += var16;
            }

            if(var17 < var13) {
               var19 = var13 - var17;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
               var20 = var1 + this.anInt9229;

               for(var21 = var20 + this.anInt9220; var21 <= var14; var21 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var20 += var15;
               }

               if(var20 < var14) {
                  int var22 = var14 - var20;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var22), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var22 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }
            }
         }
      }

   }

   public void method1769(int[] var1) {
      var1[0] = this.anInt9229;
      var1[1] = this.anInt9223;
      var1[2] = this.anInt9226;
      var1[3] = this.anInt9225;
   }

   public void method1802(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + this.anInt9220), (float)(var2 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var4);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var5);
         Class321 var6 = this.aClass174_Sub3_9222.aClass321_9741;
         var6.anInterface38_3444 = this.anInterface38_9218;
         var6.method4141(var3, var4);
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         float var7 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var8 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var6.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var7, (float)this.anInt9224 * 2.0F / var8, 1.0F, 1.0F);
         var6.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var7 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var8 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var6.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var6.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var6.anInt3450 = 0;
         var6.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var6.method4142();
      }

   }

   public void method1794(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.anInterface38_9218.method255(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1795(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.anInterface38_9218.method255(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1796(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.anInterface38_9218.method255(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1809(int var1, int var2, int var3, int var4) {
      this.anInt9229 = var1;
      this.anInt9223 = var2;
      this.anInt9226 = var3;
      this.anInt9225 = var4;
      this.aBool9217 = this.anInt9229 != 0 || this.anInt9223 != 0 || this.anInt9226 != 0 || this.anInt9225 != 0;
   }

   public void method1798(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.anInterface38_9218.method258(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1799(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.anInterface38_9218.method272(var1, var2, var3, var4, var5, var6);
   }

   public void method1815(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.anInterface38_9218.method272(var1, var2, var3, var4, var5, var6);
   }

   public void method1800(int var1, int var2, int var3) {
      int[] var4 = this.aClass174_Sub3_9222.method2479(var1, var2, this.anInt9220, this.anInt9224);
      int[] var5 = new int[this.anInt9220 * this.anInt9224];
      this.anInterface38_9218.method279(0, 0, this.anInt9220, this.anInt9224, var5, 0);
      int var6;
      int var7;
      int var8;
      if(var3 == 0) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
            }
         }
      } else if(var3 == 1) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 16 & -16777216;
            }
         }
      } else if(var3 == 2) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 24 & -16777216;
            }
         }
      } else if(var3 == 3) {
         for(var6 = 0; var6 < this.anInt9224; ++var6) {
            var7 = var6 * this.anInt9220;

            for(var8 = 0; var8 < this.anInt9220; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | (var4[var7 + var8] != 0?-16777216:0);
            }
         }
      }

      this.method1782(0, 0, this.anInt9220, this.anInt9224, var5, 0, this.anInt9220);
   }

   public Interface21 method1830() {
      return this.anInterface21_9219;
   }

   public void method1797(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.anInterface38_9218.method258(var1, var2, var3, var4, var5, var6, var7);
   }

   public void method1770(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + this.anInt9220), (float)(var2 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var4);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var5);
         Class321 var6 = this.aClass174_Sub3_9222.aClass321_9741;
         var6.anInterface38_3444 = this.anInterface38_9218;
         var6.method4141(var3, var4);
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         float var7 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var8 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var6.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var7, (float)this.anInt9224 * 2.0F / var8, 1.0F, 1.0F);
         var6.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var7 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var8 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var6.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var6.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var6.anInt3450 = 0;
         var6.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var6.method4142();
      }

   }

   public void method1804(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + this.anInt9220), (float)(var2 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var4);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var5);
         Class321 var6 = this.aClass174_Sub3_9222.aClass321_9741;
         var6.anInterface38_3444 = this.anInterface38_9218;
         var6.method4141(var3, var4);
         var1 += this.anInt9229;
         var2 += this.anInt9223;
         float var7 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var8 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var6.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var7, (float)this.anInt9224 * 2.0F / var8, 1.0F, 1.0F);
         var6.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var7 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var8 - 1.0F;
         var6.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var6.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var6.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var6.anInt3450 = 0;
         var6.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var6.method4142();
      }

   }

   public void method1805(int var1, int var2, Class162 var3, int var4, int var5) {
      this.aClass174_Sub3_9222.method8763();
      Class321 var6 = this.aClass174_Sub3_9222.aClass321_9741;
      var6.anInterface38_3444 = this.anInterface38_9218;
      var6.method4141(1, -1);
      var1 += this.anInt9229;
      var2 += this.anInt9223;
      float var7 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
      float var8 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
      var6.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var7, (float)this.anInt9224 * 2.0F / var8, 1.0F, 1.0F);
      var6.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var7 - 1.0F;
      var6.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var8 - 1.0F;
      var6.aClass433_3449.aFloatArray4841[14] = -1.0F;
      var6.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
      var6.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
      var6.anInt3450 = 0;
      var6.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
      Interface38 var9 = ((Class162_Sub3)var3).anInterface38_9359;
      var6.anInterface38_3445 = var9;
      var6.aClass433_3448.method5141(var9.method251((float)this.anInt9220), var9.method252((float)this.anInt9224), 1.0F, 1.0F);
      var6.aClass433_3448.aFloatArray4841[12] = var9.method251((float)(var1 - var4));
      var6.aClass433_3448.aFloatArray4841[13] = var9.method252((float)(var2 - var5));
      var6.method4143();
   }

   void method1791(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         this.aClass174_Sub3_9222.aClass364_9734.method4636(var1, var2, var3, var4, var5, var6, var3 + var5 - var1, var4 + var6 - var2, 0.0F, 0.0F, this.anInterface38_9218.method259(), 0.0F, 0.0F, this.anInterface38_9218.method260(), this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var8);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var9);
         float var12;
         float var13;
         if(this.aBool9217) {
            float var11 = (float)this.method21();
            var12 = (float)this.method1788();
            var13 = (var3 - var1) / var11;
            float var14 = (var4 - var2) / var11;
            float var15 = (var5 - var1) / var12;
            float var16 = (var6 - var2) / var12;
            float var17 = var15 * (float)this.anInt9223;
            float var18 = var16 * (float)this.anInt9223;
            float var19 = var13 * (float)this.anInt9229;
            float var20 = var14 * (float)this.anInt9229;
            float var21 = -var13 * (float)this.anInt9226;
            float var22 = -var14 * (float)this.anInt9226;
            float var23 = -var15 * (float)this.anInt9225;
            float var24 = -var16 * (float)this.anInt9225;
            var1 = var1 + var19 + var17;
            var2 = var2 + var20 + var18;
            var3 = var3 + var21 + var17;
            var4 = var4 + var22 + var18;
            var5 = var5 + var19 + var23;
            var6 = var6 + var20 + var24;
         }

         Class321 var25 = this.aClass174_Sub3_9222.aClass321_9741;
         var25.anInterface38_3444 = this.anInterface38_9218;
         var25.method4141(var7, var8);
         var12 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         var13 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var25.aClass433_3449.method5104();
         var25.aClass433_3449.aFloatArray4841[0] = (var3 - var1) * 2.0F / var12;
         var25.aClass433_3449.aFloatArray4841[1] = (var4 - var2) * 2.0F / var13;
         var25.aClass433_3449.aFloatArray4841[4] = (var5 - var1) * 2.0F / var12;
         var25.aClass433_3449.aFloatArray4841[5] = (var6 - var2) * 2.0F / var13;
         var25.aClass433_3449.aFloatArray4841[12] = (var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var12 - 1.0F;
         var25.aClass433_3449.aFloatArray4841[13] = (var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var13 - 1.0F;
         var25.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var25.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var25.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var25.anInt3450 = 0;
         var25.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var25.method4142();
      }

   }

   void method1807(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + var3), (float)(var2 + var4), this.anInterface38_9218.method251(0.0F), this.anInterface38_9218.method252(0.0F), this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), this.anInterface38_9218, var6);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var9 = this.aClass174_Sub3_9222.aClass321_9741;
         var9.anInterface38_3444 = this.anInterface38_9218;
         var9.method4141(var5, var6);
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         float var10 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var11 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var9.aClass433_3449.method5141((float)var3 * 2.0F / var10, (float)var4 * 2.0F / var11, 1.0F, 1.0F);
         var9.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var10 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var11 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var9.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var9.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var9.anInt3450 = 0;
         var9.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var9.method4142();
      }

   }

   void method1808(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var1, (float)var2, (float)(var1 + var3), (float)(var2 + var4), this.anInterface38_9218.method251(0.0F), this.anInterface38_9218.method252(0.0F), this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), this.anInterface38_9218, var6);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var9 = this.aClass174_Sub3_9222.aClass321_9741;
         var9.anInterface38_3444 = this.anInterface38_9218;
         var9.method4141(var5, var6);
         if(this.aBool9217) {
            var3 = var3 * this.anInt9220 / this.method21();
            var4 = var4 * this.anInt9224 / this.method1788();
            var1 += this.anInt9229 * var3 / this.anInt9220;
            var2 += this.anInt9223 * var4 / this.anInt9224;
         }

         float var10 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var11 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var9.aClass433_3449.method5141((float)var3 * 2.0F / var10, (float)var4 * 2.0F / var11, 1.0F, 1.0F);
         var9.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var10 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var11 - 1.0F;
         var9.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var9.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var9.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var9.anInt3450 = 0;
         var9.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var9.method4142();
      }

   }

   void method1820(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         this.aClass174_Sub3_9222.aClass364_9734.method4636(var1, var2, var3, var4, var5, var6, var3 + var5 - var1, var4 + var6 - var2, 0.0F, 0.0F, this.anInterface38_9218.method259(), 0.0F, 0.0F, this.anInterface38_9218.method260(), this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var8);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var9);
         float var12;
         float var13;
         if(this.aBool9217) {
            float var11 = (float)this.method21();
            var12 = (float)this.method1788();
            var13 = (var3 - var1) / var11;
            float var14 = (var4 - var2) / var11;
            float var15 = (var5 - var1) / var12;
            float var16 = (var6 - var2) / var12;
            float var17 = var15 * (float)this.anInt9223;
            float var18 = var16 * (float)this.anInt9223;
            float var19 = var13 * (float)this.anInt9229;
            float var20 = var14 * (float)this.anInt9229;
            float var21 = -var13 * (float)this.anInt9226;
            float var22 = -var14 * (float)this.anInt9226;
            float var23 = -var15 * (float)this.anInt9225;
            float var24 = -var16 * (float)this.anInt9225;
            var1 = var1 + var19 + var17;
            var2 = var2 + var20 + var18;
            var3 = var3 + var21 + var17;
            var4 = var4 + var22 + var18;
            var5 = var5 + var19 + var23;
            var6 = var6 + var20 + var24;
         }

         Class321 var25 = this.aClass174_Sub3_9222.aClass321_9741;
         var25.anInterface38_3444 = this.anInterface38_9218;
         var25.method4141(var7, var8);
         var12 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         var13 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var25.aClass433_3449.method5104();
         var25.aClass433_3449.aFloatArray4841[0] = (var3 - var1) * 2.0F / var12;
         var25.aClass433_3449.aFloatArray4841[1] = (var4 - var2) * 2.0F / var13;
         var25.aClass433_3449.aFloatArray4841[4] = (var5 - var1) * 2.0F / var12;
         var25.aClass433_3449.aFloatArray4841[5] = (var6 - var2) * 2.0F / var13;
         var25.aClass433_3449.aFloatArray4841[12] = (var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var12 - 1.0F;
         var25.aClass433_3449.aFloatArray4841[13] = (var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var13 - 1.0F;
         var25.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var25.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var25.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var25.anInt3450 = 0;
         var25.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var25.method4142();
      }

   }

   public void method1810(int[] var1) {
      var1[0] = this.anInt9229;
      var1[1] = this.anInt9223;
      var1[2] = this.anInt9226;
      var1[3] = this.anInt9225;
   }

   public void method1811(int[] var1) {
      var1[0] = this.anInt9229;
      var1[1] = this.anInt9223;
      var1[2] = this.anInt9226;
      var1[3] = this.anInt9225;
   }

   public int method1812() {
      return this.anInt9220;
   }

   public int method1817() {
      return this.anInt9224 + this.anInt9223 + this.anInt9225;
   }

   public int method1823() {
      return this.anInt9224;
   }

   public int method1825() {
      return this.anInt9220;
   }

   public int method1827() {
      return this.anInt9224;
   }

   public int method18() {
      return this.anInt9220 + this.anInt9229 + this.anInt9226;
   }

   public int method20() {
      return this.anInt9220 + this.anInt9229 + this.anInt9226;
   }

   public int method19() {
      return this.anInt9220 + this.anInt9229 + this.anInt9226;
   }

   public int method1818() {
      return this.anInt9224 + this.anInt9223 + this.anInt9225;
   }

   public int method1787() {
      return this.anInt9224;
   }

   void method1814(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         this.aClass174_Sub3_9222.aClass364_9734.method4636(var1, var2, var3, var4, var5, var6, var3 + var5 - var1, var4 + var6 - var2, 0.0F, 0.0F, this.anInterface38_9218.method259(), 0.0F, 0.0F, this.anInterface38_9218.method260(), this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var8);
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var9);
         float var12;
         float var13;
         if(this.aBool9217) {
            float var11 = (float)this.method21();
            var12 = (float)this.method1788();
            var13 = (var3 - var1) / var11;
            float var14 = (var4 - var2) / var11;
            float var15 = (var5 - var1) / var12;
            float var16 = (var6 - var2) / var12;
            float var17 = var15 * (float)this.anInt9223;
            float var18 = var16 * (float)this.anInt9223;
            float var19 = var13 * (float)this.anInt9229;
            float var20 = var14 * (float)this.anInt9229;
            float var21 = -var13 * (float)this.anInt9226;
            float var22 = -var14 * (float)this.anInt9226;
            float var23 = -var15 * (float)this.anInt9225;
            float var24 = -var16 * (float)this.anInt9225;
            var1 = var1 + var19 + var17;
            var2 = var2 + var20 + var18;
            var3 = var3 + var21 + var17;
            var4 = var4 + var22 + var18;
            var5 = var5 + var19 + var23;
            var6 = var6 + var20 + var24;
         }

         Class321 var25 = this.aClass174_Sub3_9222.aClass321_9741;
         var25.anInterface38_3444 = this.anInterface38_9218;
         var25.method4141(var7, var8);
         var12 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         var13 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var25.aClass433_3449.method5104();
         var25.aClass433_3449.aFloatArray4841[0] = (var3 - var1) * 2.0F / var12;
         var25.aClass433_3449.aFloatArray4841[1] = (var4 - var2) * 2.0F / var13;
         var25.aClass433_3449.aFloatArray4841[4] = (var5 - var1) * 2.0F / var12;
         var25.aClass433_3449.aFloatArray4841[5] = (var6 - var2) * 2.0F / var13;
         var25.aClass433_3449.aFloatArray4841[12] = (var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var12 - 1.0F;
         var25.aClass433_3449.aFloatArray4841[13] = (var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var13 - 1.0F;
         var25.aClass433_3449.aFloatArray4841[14] = -1.0F;
         var25.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
         var25.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var25.anInt3450 = 0;
         var25.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         var25.method4142();
      }

   }

   public void method1806(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         int var8 = var2 + var4;
         int var9 = var1 + var3;
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.anInt9223;

         for(var13 = var12 + this.anInt9224; var13 <= var8; var13 += var11) {
            var14 = var1 + this.anInt9229;

            for(var15 = var14 + this.anInt9220; var15 <= var9; var15 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + this.anInt9220), (float)(var12 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
               var14 += var10;
            }

            if(var14 < var9) {
               var16 = var9 - var14;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + var16), (float)(var12 + this.anInt9224), 0.0F, 0.0F, (float)var16 / (float)this.anInt9220 * this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
            }

            var12 += var11;
         }

         if(var12 < var8) {
            var14 = var8 - var12;
            float var28 = (float)var14 / (float)this.anInt9224 * this.anInterface38_9218.method260();
            var16 = var1 + this.anInt9229;

            for(var17 = var16 + this.anInt9220; var17 <= var9; var17 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + this.anInt9220), (float)(var12 + var14), 0.0F, 0.0F, this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
               var16 += var10;
            }

            if(var16 < var9) {
               var18 = var9 - var16;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + var18), (float)(var12 + var14), 0.0F, 0.0F, (float)var18 / (float)this.anInt9220 * this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
            }
         }
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var23 = this.aClass174_Sub3_9222.aClass321_9741;
         var23.anInterface38_3444 = this.anInterface38_9218;
         var23.method4141(var5, var6);
         float var24 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var25 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var23.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var23.anInt3450 = 0;
         var23.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         boolean var26 = this.aBool9230 && this.anInt9223 == 0 && this.anInt9225 == 0;
         boolean var27 = this.aBool9221 && this.anInt9229 == 0 && this.anInt9226 == 0;
         if(var27 & var26) {
            var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
            var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var23.method4142();
         } else if(var27) {
            var13 = var2 + var4;
            var14 = this.method1788();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
            var15 = var2 + this.anInt9223;

            for(var16 = var15 + this.anInt9224; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var17), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var17 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else if(var26) {
            var13 = var1 + var3;
            var14 = this.method21();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var15 = var1 + this.anInt9229;

            for(var16 = var15 + this.anInt9220; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var17), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var17 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else {
            var13 = var2 + var4;
            var14 = var1 + var3;
            var15 = this.method21();
            var16 = this.method1788();
            var17 = var2 + this.anInt9223;

            int var19;
            int var20;
            int var21;
            for(var18 = var17 + this.anInt9224; var18 <= var13; var18 += var16) {
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
               var19 = var1 + this.anInt9229;

               for(var20 = var19 + this.anInt9220; var20 <= var14; var20 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var19 += var15;
               }

               if(var19 < var14) {
                  var21 = var14 - var19;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var21), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var21 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }

               var17 += var16;
            }

            if(var17 < var13) {
               var19 = var13 - var17;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
               var20 = var1 + this.anInt9229;

               for(var21 = var20 + this.anInt9220; var21 <= var14; var21 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var20 += var15;
               }

               if(var20 < var14) {
                  int var22 = var14 - var20;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var22), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var22 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }
            }
         }
      }

   }

   public void method1780(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      if(this.aClass174_Sub3_9222.method8739() != Class350.aClass350_3660) {
         int var8 = var2 + var4;
         int var9 = var1 + var3;
         int var10 = this.method21();
         int var11 = this.method1788();
         int var12 = var2 + this.anInt9223;

         for(var13 = var12 + this.anInt9224; var13 <= var8; var13 += var11) {
            var14 = var1 + this.anInt9229;

            for(var15 = var14 + this.anInt9220; var15 <= var9; var15 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + this.anInt9220), (float)(var12 + this.anInt9224), 0.0F, 0.0F, this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
               var14 += var10;
            }

            if(var14 < var9) {
               var16 = var9 - var14;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var14, (float)var12, (float)(var14 + var16), (float)(var12 + this.anInt9224), 0.0F, 0.0F, (float)var16 / (float)this.anInt9220 * this.anInterface38_9218.method259(), this.anInterface38_9218.method260(), this.anInterface38_9218, var6);
            }

            var12 += var11;
         }

         if(var12 < var8) {
            var14 = var8 - var12;
            float var28 = (float)var14 / (float)this.anInt9224 * this.anInterface38_9218.method260();
            var16 = var1 + this.anInt9229;

            for(var17 = var16 + this.anInt9220; var17 <= var9; var17 += var10) {
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + this.anInt9220), (float)(var12 + var14), 0.0F, 0.0F, this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
               var16 += var10;
            }

            if(var16 < var9) {
               var18 = var9 - var16;
               this.aClass174_Sub3_9222.aClass364_9734.method4626((float)var16, (float)var12, (float)(var16 + var18), (float)(var12 + var14), 0.0F, 0.0F, (float)var18 / (float)this.anInt9220 * this.anInterface38_9218.method259(), var28, this.anInterface38_9218, var6);
            }
         }
      } else {
         this.aClass174_Sub3_9222.method8763();
         this.aClass174_Sub3_9222.method8807(var7);
         Class321 var23 = this.aClass174_Sub3_9222.aClass321_9741;
         var23.anInterface38_3444 = this.anInterface38_9218;
         var23.method4141(var5, var6);
         float var24 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
         float var25 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
         var23.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
         var23.anInt3450 = 0;
         var23.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
         boolean var26 = this.aBool9230 && this.anInt9223 == 0 && this.anInt9225 == 0;
         boolean var27 = this.aBool9221 && this.anInt9229 == 0 && this.anInt9226 == 0;
         if(var27 & var26) {
            var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
            var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
            var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var23.method4142();
         } else if(var27) {
            var13 = var2 + var4;
            var14 = this.method1788();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
            var15 = var2 + this.anInt9223;

            for(var16 = var15 + this.anInt9224; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var3), this.anInterface38_9218.method252((float)var17), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var3 * 2.0F / var24, (float)var17 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var1 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else if(var26) {
            var13 = var1 + var3;
            var14 = this.method21();
            var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
            var15 = var1 + this.anInt9229;

            for(var16 = var15 + this.anInt9220; var16 <= var13; var16 += var14) {
               var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var17), this.anInterface38_9218.method252((float)var4), 1.0F, 1.0F);
               var23.aClass433_3449.method5141((float)var17 * 2.0F / var24, (float)var4 * 2.0F / var25, 1.0F, 1.0F);
               var23.aClass433_3449.aFloatArray4841[12] = ((float)var15 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[13] = ((float)var2 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
               var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
               var23.method4142();
            }
         } else {
            var13 = var2 + var4;
            var14 = var1 + var3;
            var15 = this.method21();
            var16 = this.method1788();
            var17 = var2 + this.anInt9223;

            int var19;
            int var20;
            int var21;
            for(var18 = var17 + this.anInt9224; var18 <= var13; var18 += var16) {
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
               var19 = var1 + this.anInt9229;

               for(var20 = var19 + this.anInt9220; var20 <= var14; var20 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var19 += var15;
               }

               if(var19 < var14) {
                  var21 = var14 - var19;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var21), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var21 * 2.0F / var24, (float)this.anInt9224 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var19 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }

               var17 += var16;
            }

            if(var17 < var13) {
               var19 = var13 - var17;
               var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
               var20 = var1 + this.anInt9229;

               for(var21 = var20 + this.anInt9220; var21 <= var14; var21 += var15) {
                  var23.aClass433_3449.method5141((float)this.anInt9220 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
                  var20 += var15;
               }

               if(var20 < var14) {
                  int var22 = var14 - var20;
                  var23.aClass433_3446.method5141(this.anInterface38_9218.method251((float)var22), this.anInterface38_9218.method252((float)var19), 1.0F, 1.0F);
                  var23.aClass433_3449.method5141((float)var22 * 2.0F / var24, (float)var19 * 2.0F / var25, 1.0F, 1.0F);
                  var23.aClass433_3449.aFloatArray4841[12] = ((float)var20 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var24 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[13] = ((float)var17 + this.aClass174_Sub3_9222.method8737()) * 2.0F / var25 - 1.0F;
                  var23.aClass433_3449.aFloatArray4841[14] = -1.0F;
                  var23.method4142();
               }
            }
         }
      }

   }

   void method1821(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10) {
      this.aClass174_Sub3_9222.method8763();
      Class321 var11 = this.aClass174_Sub3_9222.aClass321_9741;
      var11.anInterface38_3444 = this.anInterface38_9218;
      var11.method4141(1, -1);
      float var12 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2691();
      float var13 = (float)this.aClass174_Sub3_9222.method2247((byte)6).method2693();
      var11.aClass433_3449.method5104();
      if(this.aBool9217) {
         float var14 = (float)this.anInt9220 / (float)this.method21();
         float var15 = (float)this.anInt9224 / (float)this.method1788();
         var11.aClass433_3449.aFloatArray4841[0] = (var3 - var1) * var14;
         var11.aClass433_3449.aFloatArray4841[1] = (var4 - var2) * var14;
         var11.aClass433_3449.aFloatArray4841[4] = (var5 - var1) * var15;
         var11.aClass433_3449.aFloatArray4841[5] = (var6 - var2) * var15;
         var11.aClass433_3449.aFloatArray4841[12] = (var1 + (float)this.anInt9229) * var14 + this.aClass174_Sub3_9222.method8737();
         var11.aClass433_3449.aFloatArray4841[13] = (var2 + (float)this.anInt9223) * var15 + this.aClass174_Sub3_9222.method8737();
      } else {
         var11.aClass433_3449.aFloatArray4841[0] = var3 - var1;
         var11.aClass433_3449.aFloatArray4841[1] = var4 - var2;
         var11.aClass433_3449.aFloatArray4841[4] = var5 - var1;
         var11.aClass433_3449.aFloatArray4841[5] = var6 - var2;
         var11.aClass433_3449.aFloatArray4841[12] = var1 + this.aClass174_Sub3_9222.method8737();
         var11.aClass433_3449.aFloatArray4841[13] = var2 + this.aClass174_Sub3_9222.method8737();
      }

      Class433 var16 = this.aClass174_Sub3_9222.aClass433_9705;
      var16.method5104();
      var16.aFloatArray4841[0] = 2.0F / var12;
      var16.aFloatArray4841[5] = 2.0F / var13;
      var16.aFloatArray4841[12] = -1.0F;
      var16.aFloatArray4841[13] = -1.0F;
      var16.aFloatArray4841[14] = -1.0F;
      var11.aClass433_3449.method5085(var16);
      var11.aClass433_3446.method5141(this.anInterface38_9218.method251((float)this.anInt9220), this.anInterface38_9218.method252((float)this.anInt9224), 1.0F, 1.0F);
      var11.anInterface35_3443 = this.aClass174_Sub3_9222.anInterface35_9702;
      var11.anInt3450 = 0;
      var11.aClass335_3451 = this.aClass174_Sub3_9222.aClass335_9839;
      Interface38 var17 = ((Class162_Sub3)var8).anInterface38_9359;
      var11.anInterface38_3445 = var17;
      var11.aClass433_3448.method5104();
      var11.aClass433_3448.aFloatArray4841[0] = (var3 - var1) * var17.method251(1.0F);
      var11.aClass433_3448.aFloatArray4841[1] = (var4 - var2) * var17.method251(1.0F);
      var11.aClass433_3448.aFloatArray4841[4] = (var5 - var1) * var17.method252(1.0F);
      var11.aClass433_3448.aFloatArray4841[5] = (var6 - var2) * var17.method252(1.0F);
      var11.aClass433_3448.aFloatArray4841[12] = (var1 - (float)var9) * var17.method251(1.0F);
      var11.aClass433_3448.aFloatArray4841[13] = (var2 - (float)var10) * var17.method252(1.0F);
      var11.method4143();
   }

   public void method1776(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.anInterface38_9218.method272(var1, var2, var3, var4, var5, var6);
   }

   Class153_Sub2(Class174_Sub3 var1, Interface38 var2) {
      this(var1, var2, var2.method1(), var2.method94());
   }
}
