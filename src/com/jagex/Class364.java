package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class313;
import com.jagex.Class335;
import com.jagex.Class350;
import com.jagex.Class353;
import com.jagex.Class359;
import com.jagex.Class363;
import com.jagex.Class374;
import com.jagex.Class433;
import com.jagex.Interface35;
import com.jagex.Interface38;
import com.jagex.Interface42;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class364 {
   Interface35 anInterface35_3854;
   Interface42 anInterface42_3856;
   Class335 aClass335_3851;
   int anInt3845;
   int anInt3852;
   float[] aFloatArray3850;
   Interface38[] anInterface38Array3848;
   int[] anIntArray3849;
   Class350 aClass350_3847;
   Class350 aClass350_3846;
   int[] anIntArray3857;
   Class174_Sub3 aClass174_Sub3_3855;
   int anInt3853;

   void method4623() {
      this.anInterface35_3854.method140();
      this.anInterface42_3856.method140();
      this.anInterface35_3854 = null;
      this.anInterface42_3856 = null;
      this.aClass335_3851 = null;
      this.anInt3845 = 0;
   }

   void method4624() {
      if(this.anInt3845 == this.anInt3852) {
         this.anInt3852 *= 2;
         float[] var1 = new float[this.anInt3852 * 16];

         for(int var2 = 0; var2 < this.anInt3845 * 16; ++var2) {
            var1[var2] = this.aFloatArray3850[var2];
         }

         this.aFloatArray3850 = var1;
         Interface38[] var5 = new Interface38[this.anInt3852];
         int[] var3 = new int[this.anInt3852];

         for(int var4 = 0; var4 < this.anInt3845; ++var4) {
            var5[var4] = this.anInterface38Array3848[var4];
            var3[var4] = this.anIntArray3849[var4];
         }

         this.anInterface38Array3848 = var5;
         this.anIntArray3849 = var3;
      }

   }

   void method4625() {
      if(this.anInt3845 != 0) {
         this.aClass174_Sub3_3855.method8848();
         this.aClass174_Sub3_3855.method8807(1);
         this.aClass174_Sub3_3855.method8769(this.anInterface42_3856);
         this.aClass174_Sub3_3855.method8820(0, this.anInterface35_3854);
         this.aClass174_Sub3_3855.method8833(this.aClass335_3851);
         Class313 var1 = this.aClass174_Sub3_3855.aClass313_9714;
         Unsafe var2 = this.aClass174_Sub3_3855.anUnsafe9670;
         ByteBuffer var3 = this.aClass174_Sub3_3855.aByteBuffer9684;
         var3.clear();
         this.aClass174_Sub3_3855.method8798().method5083(Class433.aClass433_4840);
         this.aClass174_Sub3_3855.method8836(Class363.aClass363_3840);
         int var4 = (this.anInt3845 + this.anInt3853 - 1) / this.anInt3853;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = Math.min(this.anInt3853, this.anInt3845 - var5);
            long var9 = this.anInterface35_3854.method236(0, var8 * 96);
            int var11 = var7 * this.anInt3853 + var8;

            int var13;
            for(int var12 = var5; var12 < var11; ++var12) {
               for(var13 = 0; var13 < 4; ++var13) {
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, 0.0F);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putInt(var9, this.anIntArray3849[var12]);
                  var9 += 4L;
               }
            }

            this.anInterface35_3854.method234();
            Interface38 var16 = this.anInterface38Array3848[var5];
            var13 = 1;
            int var14 = 0;

            for(int var15 = var5 + 1; var15 < var11; ++var15) {
               if(var16 == this.anInterface38Array3848[var15]) {
                  ++var13;
               } else {
                  var1.anInterface38_3390 = var16;
                  var1.method4079();
                  this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
                  var16 = this.anInterface38Array3848[var15];
                  var13 = 1;
                  var14 = var15 - var5;
               }
            }

            var1.anInterface38_3390 = var16;
            var1.method4079();
            this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
            var5 += this.anInt3853;
         }

         this.anInt3845 = 0;
      }
   }

   void method4626(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Interface38 var9, int var10) {
      if((var10 & -16777216) != 0) {
         this.aClass174_Sub3_3855.method2282(this.anIntArray3857);
         int var11 = this.anIntArray3857[0];
         int var12 = this.anIntArray3857[1];
         int var13 = this.anIntArray3857[2];
         int var14 = this.anIntArray3857[3];
         if(var1 <= (float)var13) {
            if(var2 <= (float)var14) {
               if(var3 >= (float)var11) {
                  if(var4 >= (float)var12) {
                     float var15 = var3 - var1;
                     float var16 = var4 - var2;
                     float var17 = var7 - var5;
                     float var18 = var8 - var6;
                     if(var1 < (float)var11) {
                        var5 += ((float)var11 - var1) / var15 * var17;
                        var1 = (float)var11;
                     }

                     if(var2 < (float)var12) {
                        var6 += ((float)var12 - var2) / var16 * var18;
                        var2 = (float)var12;
                     }

                     if(var3 > (float)var13) {
                        var7 -= (var3 - (float)var13) / var15 * var17;
                        var3 = (float)var13;
                     }

                     if(var4 > (float)var14) {
                        var8 -= (var4 - (float)var14) / var16 * var18;
                        var4 = (float)var14;
                     }

                     this.method4624();
                     var1 = this.method4629(var1);
                     var2 = this.method4630(var2);
                     var3 = this.method4629(var3);
                     var4 = this.method4630(var4);
                     this.aFloatArray3850[this.anInt3845 * 16 + 0] = var1;
                     this.aFloatArray3850[this.anInt3845 * 16 + 1] = var2;
                     this.aFloatArray3850[this.anInt3845 * 16 + 2] = var5;
                     this.aFloatArray3850[this.anInt3845 * 16 + 3] = var6;
                     this.aFloatArray3850[this.anInt3845 * 16 + 4] = var3;
                     this.aFloatArray3850[this.anInt3845 * 16 + 5] = var2;
                     this.aFloatArray3850[this.anInt3845 * 16 + 6] = var7;
                     this.aFloatArray3850[this.anInt3845 * 16 + 7] = var6;
                     this.aFloatArray3850[this.anInt3845 * 16 + 8] = var1;
                     this.aFloatArray3850[this.anInt3845 * 16 + 9] = var4;
                     this.aFloatArray3850[this.anInt3845 * 16 + 10] = var5;
                     this.aFloatArray3850[this.anInt3845 * 16 + 11] = var8;
                     this.aFloatArray3850[this.anInt3845 * 16 + 12] = var3;
                     this.aFloatArray3850[this.anInt3845 * 16 + 13] = var4;
                     this.aFloatArray3850[this.anInt3845 * 16 + 14] = var7;
                     this.aFloatArray3850[this.anInt3845 * 16 + 15] = var8;
                     this.anInterface38Array3848[this.anInt3845] = var9;
                     if(this.aClass174_Sub3_3855.anInt9729 == 1) {
                        this.anIntArray3849[this.anInt3845] = -16711936 & var10 | (var10 & 255) << 16 | var10 >> 16 & 255;
                     } else {
                        this.anIntArray3849[this.anInt3845] = var10;
                     }

                     ++this.anInt3845;
                     if(this.aClass350_3846 == Class350.aClass350_3659) {
                        this.method4625();
                     }

                  }
               }
            }
         }
      }
   }

   void method4627() {
      if(this.anInt3845 == this.anInt3852) {
         this.anInt3852 *= 2;
         float[] var1 = new float[this.anInt3852 * 16];

         for(int var2 = 0; var2 < this.anInt3845 * 16; ++var2) {
            var1[var2] = this.aFloatArray3850[var2];
         }

         this.aFloatArray3850 = var1;
         Interface38[] var5 = new Interface38[this.anInt3852];
         int[] var3 = new int[this.anInt3852];

         for(int var4 = 0; var4 < this.anInt3845; ++var4) {
            var5[var4] = this.anInterface38Array3848[var4];
            var3[var4] = this.anIntArray3849[var4];
         }

         this.anInterface38Array3848 = var5;
         this.anIntArray3849 = var3;
      }

   }

   void method4628() {
      if(this.anInt3845 != 0) {
         this.aClass174_Sub3_3855.method8848();
         this.aClass174_Sub3_3855.method8807(1);
         this.aClass174_Sub3_3855.method8769(this.anInterface42_3856);
         this.aClass174_Sub3_3855.method8820(0, this.anInterface35_3854);
         this.aClass174_Sub3_3855.method8833(this.aClass335_3851);
         Class313 var1 = this.aClass174_Sub3_3855.aClass313_9714;
         Unsafe var2 = this.aClass174_Sub3_3855.anUnsafe9670;
         ByteBuffer var3 = this.aClass174_Sub3_3855.aByteBuffer9684;
         var3.clear();
         this.aClass174_Sub3_3855.method8798().method5083(Class433.aClass433_4840);
         this.aClass174_Sub3_3855.method8836(Class363.aClass363_3840);
         int var4 = (this.anInt3845 + this.anInt3853 - 1) / this.anInt3853;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = Math.min(this.anInt3853, this.anInt3845 - var5);
            long var9 = this.anInterface35_3854.method236(0, var8 * 96);
            int var11 = var7 * this.anInt3853 + var8;

            int var13;
            for(int var12 = var5; var12 < var11; ++var12) {
               for(var13 = 0; var13 < 4; ++var13) {
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, 0.0F);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putInt(var9, this.anIntArray3849[var12]);
                  var9 += 4L;
               }
            }

            this.anInterface35_3854.method234();
            Interface38 var16 = this.anInterface38Array3848[var5];
            var13 = 1;
            int var14 = 0;

            for(int var15 = var5 + 1; var15 < var11; ++var15) {
               if(var16 == this.anInterface38Array3848[var15]) {
                  ++var13;
               } else {
                  var1.anInterface38_3390 = var16;
                  var1.method4079();
                  this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
                  var16 = this.anInterface38Array3848[var15];
                  var13 = 1;
                  var14 = var15 - var5;
               }
            }

            var1.anInterface38_3390 = var16;
            var1.method4079();
            this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
            var5 += this.anInt3853;
         }

         this.anInt3845 = 0;
      }
   }

   float method4629(float var1) {
      int var2 = this.aClass174_Sub3_3855.method2247((byte)6).method2691();
      float var3 = (var1 + this.aClass174_Sub3_3855.method8737()) / (float)var2 * 2.0F - 1.0F;
      return var3;
   }

   float method4630(float var1) {
      int var2 = this.aClass174_Sub3_3855.method2247((byte)6).method2693();
      float var3 = (1.0F - (var1 + this.aClass174_Sub3_3855.method8737()) / (float)var2) * 2.0F - 1.0F;
      return var3;
   }

   void method4631() {
      this.aClass350_3847 = this.aClass350_3846;
      this.aClass350_3846 = Class350.aClass350_3660;
   }

   void method4632() {
      if(this.aClass350_3847 != null) {
         this.aClass350_3846 = this.aClass350_3847;
         this.aClass350_3847 = null;
      }

   }

   void method4633() {
      this.anInterface35_3854.method140();
      this.anInterface42_3856.method140();
      this.anInterface35_3854 = null;
      this.anInterface42_3856 = null;
      this.aClass335_3851 = null;
      this.anInt3845 = 0;
   }

   void method4634() {
      this.anInterface35_3854.method140();
      this.anInterface42_3856.method140();
      this.anInterface35_3854 = null;
      this.anInterface42_3856 = null;
      this.aClass335_3851 = null;
      this.anInt3845 = 0;
   }

   void method4635() {
      this.anInterface35_3854.method140();
      this.anInterface42_3856.method140();
      this.anInterface35_3854 = null;
      this.anInterface42_3856 = null;
      this.aClass335_3851 = null;
      this.anInt3845 = 0;
   }

   void method4636(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, Interface38 var17, int var18) {
      if((var18 & -16777216) != 0) {
         this.aClass174_Sub3_3855.method2282(this.anIntArray3857);
         int var19 = this.anIntArray3857[0];
         int var20 = this.anIntArray3857[1];
         int var21 = this.anIntArray3857[2];
         int var22 = this.anIntArray3857[3];
         byte var23 = 0;
         int var24 = (var1 < (float)var19?1:0) + (var3 < (float)var19?1:0) + (var5 < (float)var19?1:0) + (var7 < (float)var19?1:0);
         if(var24 != 4) {
            int var25 = var23 | var24;
            var24 = (var1 > (float)var21?1:0) + (var3 > (float)var21?1:0) + (var5 > (float)var21?1:0) + (var7 > (float)var21?1:0);
            if(var24 != 4) {
               var25 |= var24;
               var24 = (var2 < (float)var20?1:0) + (var4 < (float)var20?1:0) + (var6 < (float)var20?1:0) + (var8 < (float)var20?1:0);
               if(var24 != 4) {
                  var25 |= var24;
                  var24 = (var2 > (float)var22?1:0) + (var4 > (float)var22?1:0) + (var6 > (float)var22?1:0) + (var8 > (float)var22?1:0);
                  if(var24 != 4) {
                     var25 |= var24;
                     if(var25 != 0) {
                        this.method4625();
                        this.aClass174_Sub3_3855.method2281(true);
                        this.aClass174_Sub3_3855.method2538(var19, var20, var21, var22);
                     }

                     this.method4624();
                     var1 = this.method4629(var1);
                     var2 = this.method4630(var2);
                     var3 = this.method4629(var3);
                     var4 = this.method4630(var4);
                     var5 = this.method4629(var5);
                     var6 = this.method4630(var6);
                     var7 = this.method4629(var7);
                     var8 = this.method4630(var8);
                     this.aFloatArray3850[this.anInt3845 * 16 + 0] = var1;
                     this.aFloatArray3850[this.anInt3845 * 16 + 1] = var2;
                     this.aFloatArray3850[this.anInt3845 * 16 + 2] = var9;
                     this.aFloatArray3850[this.anInt3845 * 16 + 3] = var10;
                     this.aFloatArray3850[this.anInt3845 * 16 + 4] = var3;
                     this.aFloatArray3850[this.anInt3845 * 16 + 5] = var4;
                     this.aFloatArray3850[this.anInt3845 * 16 + 6] = var11;
                     this.aFloatArray3850[this.anInt3845 * 16 + 7] = var12;
                     this.aFloatArray3850[this.anInt3845 * 16 + 8] = var5;
                     this.aFloatArray3850[this.anInt3845 * 16 + 9] = var6;
                     this.aFloatArray3850[this.anInt3845 * 16 + 10] = var13;
                     this.aFloatArray3850[this.anInt3845 * 16 + 11] = var14;
                     this.aFloatArray3850[this.anInt3845 * 16 + 12] = var7;
                     this.aFloatArray3850[this.anInt3845 * 16 + 13] = var8;
                     this.aFloatArray3850[this.anInt3845 * 16 + 14] = var15;
                     this.aFloatArray3850[this.anInt3845 * 16 + 15] = var16;
                     this.anInterface38Array3848[this.anInt3845] = var17;
                     if(this.aClass174_Sub3_3855.anInt9729 == 1) {
                        this.anIntArray3849[this.anInt3845] = -16711936 & var18 | (var18 & 255) << 16 | var18 >> 16 & 255;
                     } else {
                        this.anIntArray3849[this.anInt3845] = var18;
                     }

                     ++this.anInt3845;
                     if(this.aClass350_3846 == Class350.aClass350_3659 || var25 > 0) {
                        this.method4625();
                     }

                     if(var25 != 0) {
                        this.aClass174_Sub3_3855.method2281(false);
                        this.aClass174_Sub3_3855.method2278();
                        this.aClass174_Sub3_3855.method2538(var19, var20, var21, var22);
                     }

                  }
               }
            }
         }
      }
   }

   void method4637() {
      if(this.anInt3845 != 0) {
         this.aClass174_Sub3_3855.method8848();
         this.aClass174_Sub3_3855.method8807(1);
         this.aClass174_Sub3_3855.method8769(this.anInterface42_3856);
         this.aClass174_Sub3_3855.method8820(0, this.anInterface35_3854);
         this.aClass174_Sub3_3855.method8833(this.aClass335_3851);
         Class313 var1 = this.aClass174_Sub3_3855.aClass313_9714;
         Unsafe var2 = this.aClass174_Sub3_3855.anUnsafe9670;
         ByteBuffer var3 = this.aClass174_Sub3_3855.aByteBuffer9684;
         var3.clear();
         this.aClass174_Sub3_3855.method8798().method5083(Class433.aClass433_4840);
         this.aClass174_Sub3_3855.method8836(Class363.aClass363_3840);
         int var4 = (this.anInt3845 + this.anInt3853 - 1) / this.anInt3853;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = Math.min(this.anInt3853, this.anInt3845 - var5);
            long var9 = this.anInterface35_3854.method236(0, var8 * 96);
            int var11 = var7 * this.anInt3853 + var8;

            int var13;
            for(int var12 = var5; var12 < var11; ++var12) {
               for(var13 = 0; var13 < 4; ++var13) {
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, 0.0F);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putInt(var9, this.anIntArray3849[var12]);
                  var9 += 4L;
               }
            }

            this.anInterface35_3854.method234();
            Interface38 var16 = this.anInterface38Array3848[var5];
            var13 = 1;
            int var14 = 0;

            for(int var15 = var5 + 1; var15 < var11; ++var15) {
               if(var16 == this.anInterface38Array3848[var15]) {
                  ++var13;
               } else {
                  var1.anInterface38_3390 = var16;
                  var1.method4079();
                  this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
                  var16 = this.anInterface38Array3848[var15];
                  var13 = 1;
                  var14 = var15 - var5;
               }
            }

            var1.anInterface38_3390 = var16;
            var1.method4079();
            this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
            var5 += this.anInt3853;
         }

         this.anInt3845 = 0;
      }
   }

   void method4638() {
      if(this.anInt3845 != 0) {
         this.aClass174_Sub3_3855.method8848();
         this.aClass174_Sub3_3855.method8807(1);
         this.aClass174_Sub3_3855.method8769(this.anInterface42_3856);
         this.aClass174_Sub3_3855.method8820(0, this.anInterface35_3854);
         this.aClass174_Sub3_3855.method8833(this.aClass335_3851);
         Class313 var1 = this.aClass174_Sub3_3855.aClass313_9714;
         Unsafe var2 = this.aClass174_Sub3_3855.anUnsafe9670;
         ByteBuffer var3 = this.aClass174_Sub3_3855.aByteBuffer9684;
         var3.clear();
         this.aClass174_Sub3_3855.method8798().method5083(Class433.aClass433_4840);
         this.aClass174_Sub3_3855.method8836(Class363.aClass363_3840);
         int var4 = (this.anInt3845 + this.anInt3853 - 1) / this.anInt3853;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = Math.min(this.anInt3853, this.anInt3845 - var5);
            long var9 = this.anInterface35_3854.method236(0, var8 * 96);
            int var11 = var7 * this.anInt3853 + var8;

            int var13;
            for(int var12 = var5; var12 < var11; ++var12) {
               for(var13 = 0; var13 < 4; ++var13) {
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, 0.0F);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putInt(var9, this.anIntArray3849[var12]);
                  var9 += 4L;
               }
            }

            this.anInterface35_3854.method234();
            Interface38 var16 = this.anInterface38Array3848[var5];
            var13 = 1;
            int var14 = 0;

            for(int var15 = var5 + 1; var15 < var11; ++var15) {
               if(var16 == this.anInterface38Array3848[var15]) {
                  ++var13;
               } else {
                  var1.anInterface38_3390 = var16;
                  var1.method4079();
                  this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
                  var16 = this.anInterface38Array3848[var15];
                  var13 = 1;
                  var14 = var15 - var5;
               }
            }

            var1.anInterface38_3390 = var16;
            var1.method4079();
            this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
            var5 += this.anInt3853;
         }

         this.anInt3845 = 0;
      }
   }

   void method4639() {
      if(this.anInt3845 != 0) {
         this.aClass174_Sub3_3855.method8848();
         this.aClass174_Sub3_3855.method8807(1);
         this.aClass174_Sub3_3855.method8769(this.anInterface42_3856);
         this.aClass174_Sub3_3855.method8820(0, this.anInterface35_3854);
         this.aClass174_Sub3_3855.method8833(this.aClass335_3851);
         Class313 var1 = this.aClass174_Sub3_3855.aClass313_9714;
         Unsafe var2 = this.aClass174_Sub3_3855.anUnsafe9670;
         ByteBuffer var3 = this.aClass174_Sub3_3855.aByteBuffer9684;
         var3.clear();
         this.aClass174_Sub3_3855.method8798().method5083(Class433.aClass433_4840);
         this.aClass174_Sub3_3855.method8836(Class363.aClass363_3840);
         int var4 = (this.anInt3845 + this.anInt3853 - 1) / this.anInt3853;
         int var5 = 0;
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = Math.min(this.anInt3853, this.anInt3845 - var5);
            long var9 = this.anInterface35_3854.method236(0, var8 * 96);
            int var11 = var7 * this.anInt3853 + var8;

            int var13;
            for(int var12 = var5; var12 < var11; ++var12) {
               for(var13 = 0; var13 < 4; ++var13) {
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, 0.0F);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putFloat(var9, this.aFloatArray3850[var6++]);
                  var9 += 4L;
                  var2.putInt(var9, this.anIntArray3849[var12]);
                  var9 += 4L;
               }
            }

            this.anInterface35_3854.method234();
            Interface38 var16 = this.anInterface38Array3848[var5];
            var13 = 1;
            int var14 = 0;

            for(int var15 = var5 + 1; var15 < var11; ++var15) {
               if(var16 == this.anInterface38Array3848[var15]) {
                  ++var13;
               } else {
                  var1.anInterface38_3390 = var16;
                  var1.method4079();
                  this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
                  var16 = this.anInterface38Array3848[var15];
                  var13 = 1;
                  var14 = var15 - var5;
               }
            }

            var1.anInterface38_3390 = var16;
            var1.method4079();
            this.aClass174_Sub3_3855.method8826(this.anInterface42_3856, Class374.aClass374_3898, var14 * 4, var13 * 4, var14 * 6, var13 * 2);
            var5 += this.anInt3853;
         }

         this.anInt3845 = 0;
      }
   }

   Class364(Class174_Sub3 var1, int var2) {
      this.aClass350_3846 = Class350.aClass350_3661;
      this.anInt3852 = 128;
      this.anInt3845 = 0;
      this.aFloatArray3850 = new float[this.anInt3852 * 16];
      this.anInterface38Array3848 = new Interface38[this.anInt3852];
      this.anIntArray3849 = new int[this.anInt3852];
      this.anIntArray3857 = new int[4];
      this.aClass174_Sub3_3855 = var1;
      this.anInterface35_3854 = this.aClass174_Sub3_3855.method8818(true);
      this.anInterface35_3854.method249(var2 * 96, 24);
      this.aClass335_3851 = this.aClass174_Sub3_3855.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3679})});
      this.anInterface42_3856 = this.aClass174_Sub3_3855.method8805(false);
      int var3 = var2 * 6;
      this.anInterface42_3856.method340(var3);
      int var4 = var3 * this.anInterface42_3856.method341().anInt1891 * 1990758583;
      ByteBuffer var5 = this.aClass174_Sub3_3855.aByteBuffer9684;
      this.aClass174_Sub3_3855.method8722(var4);
      var5.clear();

      for(int var6 = 0; var6 < var2; ++var6) {
         var5.putShort((short)(var6 * 4));
         var5.putShort((short)(var6 * 4 + 2));
         var5.putShort((short)(var6 * 4 + 1));
         var5.putShort((short)(var6 * 4 + 2));
         var5.putShort((short)(var6 * 4 + 3));
         var5.putShort((short)(var6 * 4 + 1));
      }

      this.anInterface42_3856.method235(0, var3 * this.anInterface42_3856.method341().anInt1891 * 1990758583, this.aClass174_Sub3_3855.aLong9685);
      this.anInt3853 = var2;
      this.anInt3845 = 0;
   }

   float method4640(float var1) {
      int var2 = this.aClass174_Sub3_3855.method2247((byte)6).method2693();
      float var3 = (1.0F - (var1 + this.aClass174_Sub3_3855.method8737()) / (float)var2) * 2.0F - 1.0F;
      return var3;
   }

   void method4641() {
      if(this.anInt3845 == this.anInt3852) {
         this.anInt3852 *= 2;
         float[] var1 = new float[this.anInt3852 * 16];

         for(int var2 = 0; var2 < this.anInt3845 * 16; ++var2) {
            var1[var2] = this.aFloatArray3850[var2];
         }

         this.aFloatArray3850 = var1;
         Interface38[] var5 = new Interface38[this.anInt3852];
         int[] var3 = new int[this.anInt3852];

         for(int var4 = 0; var4 < this.anInt3845; ++var4) {
            var5[var4] = this.anInterface38Array3848[var4];
            var3[var4] = this.anIntArray3849[var4];
         }

         this.anInterface38Array3848 = var5;
         this.anIntArray3849 = var3;
      }

   }

   float method4642(float var1) {
      int var2 = this.aClass174_Sub3_3855.method2247((byte)6).method2691();
      float var3 = (var1 + this.aClass174_Sub3_3855.method8737()) / (float)var2 * 2.0F - 1.0F;
      return var3;
   }

   float method4643(float var1) {
      int var2 = this.aClass174_Sub3_3855.method2247((byte)6).method2691();
      float var3 = (var1 + this.aClass174_Sub3_3855.method8737()) / (float)var2 * 2.0F - 1.0F;
      return var3;
   }

   void method4644() {
      this.aClass350_3847 = this.aClass350_3846;
      this.aClass350_3846 = Class350.aClass350_3660;
   }

   void method4645() {
      this.aClass350_3847 = this.aClass350_3846;
      this.aClass350_3846 = Class350.aClass350_3660;
   }

   void method4646() {
      this.aClass350_3847 = this.aClass350_3846;
      this.aClass350_3846 = Class350.aClass350_3660;
   }

   void method4647() {
      this.aClass350_3847 = this.aClass350_3846;
      this.aClass350_3846 = Class350.aClass350_3660;
   }

   Class350 method4648() {
      return this.aClass350_3846;
   }

   void method4649() {
      if(this.aClass350_3847 != null) {
         this.aClass350_3846 = this.aClass350_3847;
         this.aClass350_3847 = null;
      }

   }

   void method4650() {
      if(this.aClass350_3847 != null) {
         this.aClass350_3846 = this.aClass350_3847;
         this.aClass350_3847 = null;
      }

   }
}
