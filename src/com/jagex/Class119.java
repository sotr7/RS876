package com.jagex;

import com.jagex.Class129;
import com.jagex.Class174_Sub2;
import com.jagex.Class177;
import com.jagex.Class452;
import com.jagex.Class526_Sub36_Sub1;
import com.jagex.Class539_Sub1;
import com.jagex.Class539_Sub1_Sub1;
import com.jagex.Interface15;
import jaggl.OpenGL;

public class Class119 {
   Interface15 anInterface15_1459;
   Class129 aClass129_1462;
   Class129 aClass129_1460;
   Class129 aClass129_1470;
   int anInt1468 = 0;
   static float aFloat1474;
   float[] aFloatArray1466 = new float[16];
   Class526_Sub36_Sub1 aClass526_Sub36_Sub1_1458 = new Class526_Sub36_Sub1(786336);
   int anInt1473 = 64;
   int anInt1464 = 768;
   int anInt1465 = 1600;
   int anInt1463 = Class452.method5370(1600, (byte)-117);
   int anInt1471 = 64;
   int[] anIntArray1461 = new int[8191];
   int[] anIntArray1469 = new int[1600];
   int[] anIntArray1467 = new int[64];
   Class539_Sub1_Sub1[][] aClass539_Sub1_Sub1ArrayArray1457 = new Class539_Sub1_Sub1[1600][64];
   Class539_Sub1_Sub1[][] aClass539_Sub1_Sub1ArrayArray1472 = new Class539_Sub1_Sub1[64][768];

   void method1446(Class174_Sub2 var1) {
      this.anInterface15_1459 = var1.method8680(24, (byte[])null, 196584, true);
      this.aClass129_1462 = new Class129(this.anInterface15_1459, 5126, 2, 0);
      this.aClass129_1460 = new Class129(this.anInterface15_1459, 5126, 3, 8);
      this.aClass129_1470 = new Class129(this.anInterface15_1459, 5121, 4, 20);
   }

   void method1447(Class174_Sub2 var1, Class177 var2) {
      if(var1.aClass433_9496 != null) {
         this.method1450(var1);
         float var3 = var1.aClass433_9496.aFloatArray4841[2];
         float var4 = var1.aClass433_9496.aFloatArray4841[6];
         float var5 = var1.aClass433_9496.aFloatArray4841[10];
         float var6 = var1.aClass433_9496.aFloatArray4841[14];

         try {
            int var7 = 0;
            int var8 = Integer.MAX_VALUE;
            int var9 = 0;
            Class539_Sub1 var10 = var2.aClass687_2068.aClass539_Sub1_8676;

            Class539_Sub1 var11;
            int var13;
            for(var11 = var10.aClass539_Sub1_10296; var11 != var10; var11 = var11.aClass539_Sub1_10296) {
               Class539_Sub1_Sub1 var12 = (Class539_Sub1_Sub1)var11;
               var13 = (int)(var3 * (float)(var12.anInt11552 >> 12) + var4 * (float)(var12.anInt11545 >> 12) + var5 * (float)(var12.anInt11550 >> 12) + var6);
               if(var13 > var9) {
                  var9 = var13;
               }

               if(var13 < var8) {
                  var8 = var13;
               }

               this.anIntArray1461[var7++] = var13;
            }

            int var20 = var9 - var8;
            if(var20 + 2 > 1600) {
               var13 = 1 + Class452.method5370(var20, (byte)16) - this.anInt1463;
               var20 = (var20 >> var13) + 2;
            } else {
               var13 = 0;
               var20 += 2;
            }

            var11 = var10.aClass539_Sub1_10296;
            var7 = 0;
            int var14 = -2;
            boolean var15 = true;

            for(boolean var16 = true; var11 != var10; this.method1448(var1, var20)) {
               this.anInt1468 = 0;

               int var17;
               for(var17 = 0; var17 < var20; ++var17) {
                  this.anIntArray1469[var17] = 0;
               }

               for(var17 = 0; var17 < 64; ++var17) {
                  this.anIntArray1467[var17] = 0;
               }

               for(; var11 != var10; var11 = var11.aClass539_Sub1_10296) {
                  Class539_Sub1_Sub1 var21 = (Class539_Sub1_Sub1)var11;
                  if(var16) {
                     var14 = var21.anInt11548;
                     var15 = var21.aBool11554;
                     var16 = false;
                  }

                  if(var7 > 0 && (var14 != var21.anInt11548 || var15 != var21.aBool11554)) {
                     var16 = true;
                     break;
                  }

                  int var18 = this.anIntArray1461[var7++] - var8 >> var13;
                  if(var18 < 1600) {
                     if(this.anIntArray1469[var18] < 64) {
                        this.aClass539_Sub1_Sub1ArrayArray1457[var18][this.anIntArray1469[var18]++] = var21;
                     } else {
                        if(this.anIntArray1469[var18] == 64) {
                           if(this.anInt1468 == 64) {
                              continue;
                           }

                           this.anIntArray1469[var18] += 1 + this.anInt1468++;
                        }

                        Class539_Sub1_Sub1[] var10000 = this.aClass539_Sub1_Sub1ArrayArray1472[this.anIntArray1469[var18] - 64 - 1];
                        int var10002 = this.anIntArray1469[var18] - 64 - 1;
                        int var10004 = this.anIntArray1467[this.anIntArray1469[var18] - 64 - 1];
                        this.anIntArray1467[var10002] = this.anIntArray1467[this.anIntArray1469[var18] - 64 - 1] + 1;
                        var10000[var10004] = var21;
                     }
                  }
               }

               if(var14 >= 0) {
                  var1.method8639(var14);
               } else {
                  var1.method8639(-1);
               }

               if(var15 && var1.aFloat9585 != aFloat1474) {
                  var1.method2331(aFloat1474);
               } else if(var1.aFloat9585 != 1.0F) {
                  var1.method2331(1.0F);
               }
            }
         } catch (Exception var19) {
            ;
         }

         this.method1449(var1);
      }
   }

   void method1448(Class174_Sub2 var1, int var2) {
      OpenGL.glGetFloatv(2982, this.aFloatArray1466, 0);
      float var3 = this.aFloatArray1466[0];
      float var4 = this.aFloatArray1466[4];
      float var5 = this.aFloatArray1466[8];
      float var6 = this.aFloatArray1466[1];
      float var7 = this.aFloatArray1466[5];
      float var8 = this.aFloatArray1466[9];
      float var9 = var3 + var6;
      float var10 = var4 + var7;
      float var11 = var5 + var8;
      float var12 = var3 - var6;
      float var13 = var4 - var7;
      float var14 = var5 - var8;
      float var15 = var6 - var3;
      float var16 = var7 - var4;
      float var17 = var8 - var5;
      float[] var18 = new float[3];
      float[] var19 = new float[3];
      var1.aClass433_9558.method5084(var1.aClass433_9543);
      this.aClass526_Sub36_Sub1_1458.pos = 0;
      int var20;
      int var21;
      int var22;
      Class539_Sub1_Sub1 var23;
      int var24;
      byte var25;
      byte var26;
      byte var27;
      byte var28;
      float var29;
      float var30;
      float var31;
      int var32;
      int var33;
      int var34;
      Class539_Sub1_Sub1 var35;
      int var36;
      byte var37;
      float var38;
      if(var1.aBool9508) {
         for(var20 = var2 - 1; var20 >= 0; --var20) {
            var21 = this.anIntArray1469[var20] > 64?64:this.anIntArray1469[var20];
            if(var21 > 0) {
               for(var22 = var21 - 1; var22 >= 0; --var22) {
                  var23 = this.aClass539_Sub1_Sub1ArrayArray1457[var20][var22];
                  var24 = var23.anInt11547;
                  var25 = (byte)(var24 >> 16);
                  var26 = (byte)(var24 >> 8);
                  var27 = (byte)var24;
                  var28 = (byte)(var24 >>> 24);
                  var29 = (float)(var23.anInt11552 >> 12);
                  var30 = (float)(var23.anInt11545 >> 12);
                  var31 = (float)(var23.anInt11550 >> 12);
                  var32 = var23.anInt11551 >> 12;
                  if(var23.aShort11553 != 0) {
                     var1.aClass433_9559.method5114(var23.aShort11553, var32, var32, 0.0F, 0.0F, 0.0F);
                     var1.aClass433_9559.method5085(var1.aClass433_9558);
                     var1.aClass433_9559.method5089(1.0F, 0.0F, 0.0F, var18);
                     var1.aClass433_9559.method5089(0.0F, 1.0F, 0.0F, var19);
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 - var18[0] - var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 - var18[1] - var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 - var18[2] - var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 1752895485);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 1666384122);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, -1881994995);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1138024104);
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 - var18[0] + var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 - var18[1] + var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 - var18[2] + var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 1054249330);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 291652849);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 994937011);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1823713032);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 + var18[0] + var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 + var18[1] + var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 + var18[2] + var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 498490988);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, -861981371);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, -1027416420);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -325220075);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 + var18[0] - var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 + var18[1] - var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 + var18[2] - var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 1915974393);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 93439208);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 979577150);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1350839991);
                  } else {
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 + var9 * (float)(-var32));
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 + var10 * (float)(-var32));
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 + var11 * (float)(-var32));
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 1085001337);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 1748066974);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 535719774);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, 207469053);
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 + var15 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 + var16 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 + var17 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 352423320);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, -1664441607);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 831216149);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1104576913);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 + var9 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 + var10 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 + var11 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, -303872936);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 1546660442);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1593519816);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1068853594);
                     this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10688(var29 + var12 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10688(var30 + var13 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10688(var31 + var14 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, -2096785404);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 1029625590);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1267927342);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, 439255422);
                  }
               }

               if(this.anIntArray1469[var20] > 64) {
                  var22 = this.anIntArray1469[var20] - 64 - 1;

                  for(var34 = this.anIntArray1467[var22] - 1; var34 >= 0; --var34) {
                     var35 = this.aClass539_Sub1_Sub1ArrayArray1472[var22][var34];
                     var36 = var35.anInt11547;
                     var26 = (byte)(var36 >> 16);
                     var27 = (byte)(var36 >> 8);
                     var28 = (byte)var36;
                     var37 = (byte)(var36 >>> 24);
                     var30 = (float)(var35.anInt11552 >> 12);
                     var31 = (float)(var35.anInt11545 >> 12);
                     var38 = (float)(var35.anInt11550 >> 12);
                     var33 = var35.anInt11551 >> 12;
                     if(var35.aShort11553 != 0) {
                        var1.aClass433_9559.method5114(var35.aShort11553, var33, var33, 0.0F, 0.0F, 0.0F);
                        var1.aClass433_9559.method5085(var1.aClass433_9558);
                        var1.aClass433_9559.method5089(1.0F, 0.0F, 0.0F, var18);
                        var1.aClass433_9559.method5089(0.0F, 1.0F, 0.0F, var19);
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 - var18[0] - var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 - var18[1] - var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 - var18[2] - var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, 1530272061);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1069361869);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 1013077325);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, -841953631);
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 - var18[0] + var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 - var18[1] + var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 - var18[2] + var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -600875535);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1377695155);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 1391364477);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 67004555);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 + var18[0] + var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 + var18[1] + var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 + var18[2] + var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -753509539);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -206684340);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1712578462);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 1039670917);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 + var18[0] - var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 + var18[1] - var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 + var18[2] - var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -376897519);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -1997115129);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1369648396);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, -1591972182);
                     } else {
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 + var9 * (float)(-var33));
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 + var10 * (float)(-var33));
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 + var11 * (float)(-var33));
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, 270929387);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, 471253033);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1267002758);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 1581289445);
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 + var15 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 + var16 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 + var17 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, 477508633);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -60368957);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, -858078583);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, -1017070609);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 + var9 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 + var10 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 + var11 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -1390515941);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, 245416631);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 1663513352);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, -1286620844);
                        this.aClass526_Sub36_Sub1_1458.method10688(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10688(var30 + var12 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10688(var31 + var13 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10688(var38 + var14 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -599554881);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -1681975877);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 1961253423);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 202220911);
                     }
                  }
               }
            }
         }
      } else {
         for(var20 = var2 - 1; var20 >= 0; --var20) {
            var21 = this.anIntArray1469[var20] > 64?64:this.anIntArray1469[var20];
            if(var21 > 0) {
               for(var22 = var21 - 1; var22 >= 0; --var22) {
                  var23 = this.aClass539_Sub1_Sub1ArrayArray1457[var20][var22];
                  var24 = var23.anInt11547;
                  var25 = (byte)(var24 >> 16);
                  var26 = (byte)(var24 >> 8);
                  var27 = (byte)var24;
                  var28 = (byte)(var24 >>> 24);
                  var29 = (float)(var23.anInt11552 >> 12);
                  var30 = (float)(var23.anInt11545 >> 12);
                  var31 = (float)(var23.anInt11550 >> 12);
                  var32 = var23.anInt11551 >> 12;
                  if(var23.aShort11553 != 0) {
                     var1.aClass433_9559.method5114(var23.aShort11553, var32, var32, 0.0F, 0.0F, 0.0F);
                     var1.aClass433_9559.method5085(var1.aClass433_9558);
                     var1.aClass433_9559.method5089(1.0F, 0.0F, 0.0F, var18);
                     var1.aClass433_9559.method5089(0.0F, 1.0F, 0.0F, var19);
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 - var18[0] - var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 - var18[1] - var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 - var18[2] - var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 1560746530);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 162945358);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1403604611);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -244449689);
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 - var18[0] + var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 - var18[1] + var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 - var18[2] + var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 1443205555);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 640791492);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1796341978);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -21697221);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 + var18[0] + var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 + var18[1] + var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 + var18[2] + var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, -1614970061);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, -2005216449);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 940979805);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, 248762291);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 + var18[0] - var19[0]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 + var18[1] - var19[1]);
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 + var18[2] - var19[2]);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 46682029);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 213194674);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, -471350656);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -1746075031);
                  } else {
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 + var9 * (float)(-var32));
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 + var10 * (float)(-var32));
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 + var11 * (float)(-var32));
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, -1496581246);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, -2020344609);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, -638975734);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -2084115767);
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 + var15 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 + var16 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 + var17 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 403589216);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, -1900755879);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 891064338);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -69844723);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 + var9 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 + var10 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 + var11 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 512823107);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, -1899798654);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 107170302);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -863528384);
                     this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                     this.aClass526_Sub36_Sub1_1458.method10689(var29 + var12 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10689(var30 + var13 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.method10689(var31 + var14 * (float)var32);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var25, 379574910);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var26, 1704106381);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var27, 974356357);
                     this.aClass526_Sub36_Sub1_1458.writeByte(var28, -797953476);
                  }
               }

               if(this.anIntArray1469[var20] > 64) {
                  var22 = this.anIntArray1469[var20] - 64 - 1;

                  for(var34 = this.anIntArray1467[var22] - 1; var34 >= 0; --var34) {
                     var35 = this.aClass539_Sub1_Sub1ArrayArray1472[var22][var34];
                     var36 = var35.anInt11547;
                     var26 = (byte)(var36 >> 16);
                     var27 = (byte)(var36 >> 8);
                     var28 = (byte)var36;
                     var37 = (byte)(var36 >>> 24);
                     var30 = (float)(var35.anInt11552 >> 12);
                     var31 = (float)(var35.anInt11545 >> 12);
                     var38 = (float)(var35.anInt11550 >> 12);
                     var33 = var35.anInt11551 >> 12;
                     if(var35.aShort11553 != 0) {
                        var1.aClass433_9559.method5114(var35.aShort11553, var33, var33, 0.0F, 0.0F, 0.0F);
                        var1.aClass433_9559.method5085(var1.aClass433_9558);
                        var1.aClass433_9559.method5089(1.0F, 0.0F, 0.0F, var18);
                        var1.aClass433_9559.method5089(0.0F, 1.0F, 0.0F, var19);
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 - var18[0] - var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 - var18[1] - var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 - var18[2] - var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -1883848788);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1397719420);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 1211003310);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 1091433898);
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 - var18[0] + var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 - var18[1] + var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 - var18[2] + var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -1414891075);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1391989793);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, -542045234);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, -675361785);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 + var18[0] + var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 + var18[1] + var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 + var18[2] + var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, 217694958);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -952293855);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 1650515340);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 1452745117);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 + var18[0] - var19[0]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 + var18[1] - var19[1]);
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 + var18[2] - var19[2]);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, 405794512);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -436761109);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 1266570464);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 1572843908);
                     } else {
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 + var9 * (float)(-var33));
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 + var10 * (float)(-var33));
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 + var11 * (float)(-var33));
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -515849153);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, 1767411140);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, -2134624241);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 1594003371);
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 + var15 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 + var16 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 + var17 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, 1388681066);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -889356868);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 303849391);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, 237990600);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 + var9 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 + var10 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 + var11 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, -234642479);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -1441876551);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, 292663465);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, -637583767);
                        this.aClass526_Sub36_Sub1_1458.method10689(1.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(0.0F);
                        this.aClass526_Sub36_Sub1_1458.method10689(var30 + var12 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10689(var31 + var13 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.method10689(var38 + var14 * (float)var33);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var26, 396600898);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var27, -91113620);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var28, -251177424);
                        this.aClass526_Sub36_Sub1_1458.writeByte(var37, -971059994);
                     }
                  }
               }
            }
         }
      }

      if(this.aClass526_Sub36_Sub1_1458.pos * 301018015 != 0) {
         this.anInterface15_1459.method91(24, this.aClass526_Sub36_Sub1_1458.buffer, this.aClass526_Sub36_Sub1_1458.pos * 301018015);
         var1.method8634(this.aClass129_1460, (Class129)null, this.aClass129_1470, this.aClass129_1462);
         var1.method8676(7, 0, this.aClass526_Sub36_Sub1_1458.pos * 301018015 / 24);
      }

   }

   void method1449(Class174_Sub2 var1) {
      var1.method8648(true);
      OpenGL.glEnable(16384);
      OpenGL.glEnable(16385);
      if(var1.aFloat9585 != aFloat1474) {
         var1.method2331(aFloat1474);
      }

   }

   void method1450(Class174_Sub2 var1) {
      aFloat1474 = var1.aFloat9585;
      var1.method8638();
      OpenGL.glDisable(16384);
      OpenGL.glDisable(16385);
      var1.method8648(false);
      OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
   }
}
