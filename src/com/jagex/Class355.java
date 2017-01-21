package com.jagex;

import com.jagex.Class171;
import com.jagex.Class174_Sub3;
import com.jagex.Class177;
import com.jagex.Class320;
import com.jagex.Class335;
import com.jagex.Class353;
import com.jagex.Class359;
import com.jagex.Class433;
import com.jagex.Class452;
import com.jagex.Class539_Sub1;
import com.jagex.Class539_Sub1_Sub1;
import com.jagex.Class593;
import com.jagex.Interface35;
import com.jagex.Interface42;
import java.nio.ByteBuffer;

public class Class355 {
   int anInt3695 = 64;
   int anInt3696 = 768;
   int anInt3706 = 1600;
   int anInt3698 = Class452.method5370(1600, (byte)22);
   int anInt3699 = 64;
   int[] anIntArray3700 = new int[8191];
   int[] anIntArray3693 = new int[1600];
   int[] anIntArray3702 = new int[64];
   Class539_Sub1_Sub1[][] aClass539_Sub1_Sub1ArrayArray3703 = new Class539_Sub1_Sub1[1600][64];
   Class539_Sub1_Sub1[][] aClass539_Sub1_Sub1ArrayArray3704 = new Class539_Sub1_Sub1[64][768];
   int anInt3705 = 0;
   Class335 aClass335_3691;
   Interface35 anInterface35_3701;
   Interface35 anInterface35_3692;
   Interface42 anInterface42_3694;
   static float aFloat3697;

   void method4566() {
      this.anInterface35_3701.method140();
   }

   void method4567(Class174_Sub3 var1) {
      this.anInterface35_3701.method249(786336, 24);
   }

   void method4568() {
      this.anInterface35_3701.method140();
   }

   Class355(Class174_Sub3 var1) {
      this.aClass335_3691 = var1.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3679, Class353.aClass353_3683}), new Class359(Class353.aClass353_3673)});
      this.anInterface35_3701 = var1.method8818(true);
      this.anInterface35_3692 = var1.method8818(false);
      this.anInterface35_3692.method249(393168, 12);
      this.anInterface42_3694 = var1.method8805(false);
      this.anInterface42_3694.method340('\ubffa');
      ByteBuffer var2 = var1.aByteBuffer9684;
      var2.clear();

      int var3;
      for(var3 = 0; var3 < 8191; ++var3) {
         int var4 = var3 * 4;
         var2.putShort((short)var4);
         var2.putShort((short)(var4 + 1));
         var2.putShort((short)(var4 + 2));
         var2.putShort((short)(var4 + 2));
         var2.putShort((short)(var4 + 3));
         var2.putShort((short)var4);
      }

      this.anInterface42_3694.method235(0, var2.position(), var1.aLong9685);
      var2.clear();

      for(var3 = 0; var3 < 8191; ++var3) {
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
         var2.putFloat(0.0F);
         var2.putFloat(-1.0F);
         var2.putFloat(0.0F);
      }

      this.anInterface35_3692.method235(0, var2.position(), var1.aLong9685);
   }

   void method4569(int var1, Class539_Sub1_Sub1 var2) {
      if(var1 < 1600) {
         if(this.anIntArray3693[var1] < 64) {
            this.aClass539_Sub1_Sub1ArrayArray3703[var1][this.anIntArray3693[var1]++] = var2;
         } else {
            if(this.anIntArray3693[var1] == 64) {
               if(this.anInt3705 == 64) {
                  return;
               }

               this.anIntArray3693[var1] += 1 + this.anInt3705++;
            }

            Class539_Sub1_Sub1[] var10000 = this.aClass539_Sub1_Sub1ArrayArray3704[this.anIntArray3693[var1] - 64 - 1];
            int var10002 = this.anIntArray3693[var1] - 64 - 1;
            int var10004 = this.anIntArray3702[this.anIntArray3693[var1] - 64 - 1];
            this.anIntArray3702[var10002] = this.anIntArray3702[this.anIntArray3693[var1] - 64 - 1] + 1;
            var10000[var10004] = var2;
         }
      }

   }

   void method4570(Class174_Sub3 var1, int var2, boolean var3) {
      int var4 = 0;
      Class433 var5 = var1.aClass433_9753;
      float var6 = var5.aFloatArray4841[0];
      float var7 = var5.aFloatArray4841[4];
      float var8 = var5.aFloatArray4841[8];
      float var9 = var5.aFloatArray4841[1];
      float var10 = var5.aFloatArray4841[5];
      float var11 = var5.aFloatArray4841[9];
      float var12 = var6 + var9;
      float var13 = var7 + var10;
      float var14 = var8 + var11;
      float var15 = var6 - var9;
      float var16 = var7 - var10;
      float var17 = var8 - var11;
      float var18 = var9 - var6;
      float var19 = var10 - var7;
      float var20 = var11 - var8;
      float[] var21 = new float[3];
      float[] var22 = new float[3];
      var1.aClass433_9705.method5084(var1.aClass433_9804);
      ByteBuffer var23 = var1.aByteBuffer9684;
      var23.clear();

      for(int var24 = var2 - 1; var24 >= 0; --var24) {
         int var25 = this.anIntArray3693[var24] > 64?64:this.anIntArray3693[var24];
         if(var25 > 0) {
            int var26;
            byte var30;
            byte var31;
            byte var32;
            byte var33;
            float var34;
            float var35;
            for(var26 = var25 - 1; var26 >= 0; --var26) {
               Class539_Sub1_Sub1 var27 = this.aClass539_Sub1_Sub1ArrayArray3703[var24][var26];
               int var28 = var27.anInt11547;
               byte var29 = (byte)(var28 >> 16);
               var30 = (byte)(var28 >> 8);
               var31 = (byte)var28;
               var32 = (byte)(var28 >>> 24);
               if(var1.anInt9729 == 0) {
                  var33 = var29;
                  var29 = var31;
                  var31 = var33;
               }

               float var43 = (float)(var27.anInt11552 >> 12);
               var34 = (float)(var27.anInt11545 >> 12);
               var35 = (float)(var27.anInt11550 >> 12);
               int var36 = var27.anInt11551 >> 12;
               if(var27.aShort11553 != 0) {
                  var1.aClass433_9746.method5114(var27.aShort11553, var36, var36, 0.0F, 0.0F, 0.0F);
                  var1.aClass433_9746.method5085(var1.aClass433_9705);
                  var1.aClass433_9746.method5089(1.0F, 0.0F, 0.0F, var21);
                  var1.aClass433_9746.method5089(0.0F, 1.0F, 0.0F, var22);
                  var23.putFloat(var43 - var21[0] - var22[0]);
                  var23.putFloat(var34 - var21[1] - var22[1]);
                  var23.putFloat(var35 - var21[2] - var22[2]);
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(0.0F);
                  var23.putFloat(0.0F);
                  var23.putFloat(var43 - var21[0] + var22[0]);
                  var23.putFloat(var34 - var21[1] + var22[1]);
                  var23.putFloat(var35 - var21[2] + var22[2]);
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(0.0F);
                  var23.putFloat(1.0F);
                  var23.putFloat(var43 + var21[0] + var22[0]);
                  var23.putFloat(var34 + var21[1] + var22[1]);
                  var23.putFloat(var35 + var21[2] + var22[2]);
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(1.0F);
                  var23.putFloat(1.0F);
                  var23.putFloat(var43 + var21[0] - var22[0]);
                  var23.putFloat(var34 + var21[1] - var22[1]);
                  var23.putFloat(var35 + var21[2] - var22[2]);
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(1.0F);
                  var23.putFloat(0.0F);
               } else {
                  var23.putFloat(var43 + var12 * (float)(-var36));
                  var23.putFloat(var34 + var13 * (float)(-var36));
                  var23.putFloat(var35 + var14 * (float)(-var36));
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(0.0F);
                  var23.putFloat(0.0F);
                  var23.putFloat(var43 + var18 * (float)var36);
                  var23.putFloat(var34 + var19 * (float)var36);
                  var23.putFloat(var35 + var20 * (float)var36);
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(0.0F);
                  var23.putFloat(1.0F);
                  var23.putFloat(var43 + var12 * (float)var36);
                  var23.putFloat(var34 + var13 * (float)var36);
                  var23.putFloat(var35 + var14 * (float)var36);
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(1.0F);
                  var23.putFloat(1.0F);
                  var23.putFloat(var43 + var15 * (float)var36);
                  var23.putFloat(var34 + var16 * (float)var36);
                  var23.putFloat(var35 + var17 * (float)var36);
                  var23.put(var29);
                  var23.put(var30);
                  var23.put(var31);
                  var23.put(var32);
                  var23.putFloat(1.0F);
                  var23.putFloat(0.0F);
               }

               ++var4;
            }

            if(this.anIntArray3693[var24] > 64) {
               var26 = this.anIntArray3693[var24] - 64 - 1;

               for(int var40 = this.anIntArray3702[var26] - 1; var40 >= 0; --var40) {
                  Class539_Sub1_Sub1 var41 = this.aClass539_Sub1_Sub1ArrayArray3704[var26][var40];
                  int var42 = var41.anInt11547;
                  var30 = (byte)(var42 >> 16);
                  var31 = (byte)(var42 >> 8);
                  var32 = (byte)var42;
                  var33 = (byte)(var42 >>> 24);
                  var34 = (float)(var41.anInt11552 >> 12);
                  var35 = (float)(var41.anInt11545 >> 12);
                  float var44 = (float)(var41.anInt11550 >> 12);
                  int var37 = var41.anInt11551 >> 12;
                  if(var1.anInt9729 == 0) {
                     byte var38 = var30;
                     var30 = var32;
                     var32 = var38;
                  }

                  if(var41.aShort11553 != 0) {
                     var1.aClass433_9746.method5114(var41.aShort11553, var37, var37, 0.0F, 0.0F, 0.0F);
                     var1.aClass433_9746.method5085(var1.aClass433_9705);
                     var1.aClass433_9746.method5089(1.0F, 0.0F, 0.0F, var21);
                     var1.aClass433_9746.method5089(0.0F, 1.0F, 0.0F, var22);
                     var23.putFloat(var34 - var21[0] - var22[0]);
                     var23.putFloat(var35 - var21[1] - var22[1]);
                     var23.putFloat(var44 - var21[2] - var22[2]);
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(0.0F);
                     var23.putFloat(0.0F);
                     var23.putFloat(var34 - var21[0] + var22[0]);
                     var23.putFloat(var35 - var21[1] + var22[1]);
                     var23.putFloat(var44 - var21[2] + var22[2]);
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(0.0F);
                     var23.putFloat(1.0F);
                     var23.putFloat(var34 + var21[0] + var22[0]);
                     var23.putFloat(var35 + var21[1] + var22[1]);
                     var23.putFloat(var44 + var21[2] + var22[2]);
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(1.0F);
                     var23.putFloat(1.0F);
                     var23.putFloat(var34 + var21[0] - var22[0]);
                     var23.putFloat(var35 + var21[1] - var22[1]);
                     var23.putFloat(var44 + var21[2] - var22[2]);
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(1.0F);
                     var23.putFloat(0.0F);
                  } else {
                     var23.putFloat(var34 + var12 * (float)(-var37));
                     var23.putFloat(var35 + var13 * (float)(-var37));
                     var23.putFloat(var44 + var14 * (float)(-var37));
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(0.0F);
                     var23.putFloat(0.0F);
                     var23.putFloat(var34 + var18 * (float)var37);
                     var23.putFloat(var35 + var19 * (float)var37);
                     var23.putFloat(var44 + var20 * (float)var37);
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(0.0F);
                     var23.putFloat(1.0F);
                     var23.putFloat(var34 + var12 * (float)var37);
                     var23.putFloat(var35 + var13 * (float)var37);
                     var23.putFloat(var44 + var14 * (float)var37);
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(1.0F);
                     var23.putFloat(1.0F);
                     var23.putFloat(var34 + var15 * (float)var37);
                     var23.putFloat(var35 + var16 * (float)var37);
                     var23.putFloat(var44 + var17 * (float)var37);
                     var23.put(var30);
                     var23.put(var31);
                     var23.put(var32);
                     var23.put(var33);
                     var23.putFloat(1.0F);
                     var23.putFloat(0.0F);
                  }

                  ++var4;
               }
            }
         }
      }

      this.anInterface35_3701.method235(0, var23.position(), var1.aLong9685);
      var1.method8820(0, this.anInterface35_3701);
      var1.method8820(1, this.anInterface35_3692);
      var1.method8833(this.aClass335_3691);
      Class320 var39 = var1.aClass320_9790;
      var39.method4134(var4, var3);
   }

   void method4571(Class174_Sub3 var1, Class539_Sub1 var2, int var3, int var4, int var5, Class320 var6, boolean var7) {
      Class539_Sub1 var8 = var2.aClass539_Sub1_10296;
      int var9 = 0;
      int var10 = -2;
      boolean var11 = true;

      for(boolean var12 = true; var8 != var2; this.method4570(var1, var3, var7)) {
         this.anInt3705 = 0;

         int var13;
         for(var13 = 0; var13 < var3; ++var13) {
            this.anIntArray3693[var13] = 0;
         }

         for(var13 = 0; var13 < 64; ++var13) {
            this.anIntArray3702[var13] = 0;
         }

         while(var8 != var2) {
            Class539_Sub1_Sub1 var15 = (Class539_Sub1_Sub1)var8;
            if(var12) {
               var10 = var15.anInt11548;
               var11 = var15.aBool11554;
               var12 = false;
            }

            if(var9 > 0 && (var10 != var15.anInt11548 || var11 != var15.aBool11554)) {
               var12 = true;
               break;
            }

            this.method4569(this.anIntArray3700[var9++] - var4 >> var5, var15);
            var8 = var8.aClass539_Sub1_10296;
         }

         var6.anInterface38_3439 = null;
         if(var10 >= 0) {
            Class171 var16 = var1.aClass169_2035.method2122(var10, (byte)-13);
            if(var16.aBool1987) {
               var6.anInterface38_3439 = var1.aClass346_9775.method4474(var16);
            }

            byte var14 = 0;
            if(var16.aClass593_1982 == Class593.aClass593_7816) {
               var14 = var16.aByte1990;
            }

            var1.method8809(var14);
         }

         if(var11 && var1.aFloat9669 != aFloat3697) {
            var1.method2331(aFloat3697);
         } else if(var1.aFloat9669 != 1.0F) {
            var1.method2331(1.0F);
         }
      }

   }

   void method4572() {
      this.anInterface35_3701.method140();
   }

   void method4573(Class174_Sub3 var1, Class177 var2) {
      var1.method2328(false);
      aFloat3697 = var1.aFloat9669;
      float var3 = var1.aClass433_9753.aFloatArray4841[2];
      float var4 = var1.aClass433_9753.aFloatArray4841[6];
      float var5 = var1.aClass433_9753.aFloatArray4841[10];
      float var6 = var1.aClass433_9753.aFloatArray4841[14];
      int var7 = 0;
      int var8 = Integer.MAX_VALUE;
      int var9 = 0;
      Class539_Sub1 var10 = var2.aClass687_2068.aClass539_Sub1_8676;

      int var13;
      for(Class539_Sub1 var11 = var10.aClass539_Sub1_10296; var11 != var10; var11 = var11.aClass539_Sub1_10296) {
         Class539_Sub1_Sub1 var12 = (Class539_Sub1_Sub1)var11;
         var13 = (int)(var3 * (float)(var12.anInt11552 >> 12) + var4 * (float)(var12.anInt11545 >> 12) + var5 * (float)(var12.anInt11550 >> 12) + var6);
         if(var13 > var9) {
            var9 = var13;
         }

         if(var13 < var8) {
            var8 = var13;
         }

         this.anIntArray3700[var7++] = var13;
      }

      int var16 = var9 - var8;
      if(var16 + 2 > 1600) {
         var13 = 1 + Class452.method5370(var16, (byte)54) - this.anInt3698;
         var16 = (var16 >> var13) + 2;
      } else {
         var13 = 0;
         var16 += 2;
      }

      var1.method8769(this.anInterface42_3694);
      Class320 var14 = var1.aClass320_9790;
      var14.method4137(Class433.aClass433_4840);
      var14.aClass433_3437.method5104();
      var14.anInt3436 = -1;
      boolean var15 = var1.anInt9675 > 0;
      if(var15) {
         var14.aClass444_3440.method5202(0.0F, 0.0F, 1.0F, -var1.aFloat9810);
         var14.aClass446_3441.method5266((float)(var1.anInt9722 >> 16 & 255) / 255.0F, (float)(var1.anInt9722 >> 8 & 255) / 255.0F, (float)(var1.anInt9722 >> 0 & 255) / 255.0F);
         var14.aClass444_3440.method5207(var1.aClass433_9700);
         var14.aClass444_3440.method5206(1.0F / (var1.aFloat9677 - var1.aFloat9810));
      } else {
         var14.aClass444_3440.method5202(0.0F, 0.0F, 0.0F, 0.0F);
         var14.aClass446_3441.method5266(0.0F, 0.0F, 0.0F);
      }

      this.method4571(var1, var10, var16, var8, var13, var14, var15);
      if(var1.aFloat9669 != aFloat3697) {
         var1.method2331(aFloat3697);
      }

      var1.method2328(true);
   }
}
