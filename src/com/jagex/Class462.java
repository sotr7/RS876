package com.jagex;

import com.jagex.Class174;
import com.jagex.Class200;
import com.jagex.Class279;
import com.jagex.Class285;
import com.jagex.Class298;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.Class705;
import com.jagex.Class76;

public class Class462 {
   static final int anInt5217 = 7;
   int anInt5210;
   int anInt5211;
   int[] anIntArray5221;
   int anInt5215;
   int[] anIntArray5224;
   int[] anIntArray5225;
   byte[][] aByteArrayArray5212;
   int[] anIntArray5219;
   int[] anIntArray5222;
   int[][] anIntArrayArray5223;
   int[] anIntArray5226;
   int[] anIntArray5213;
   Class279 aClass279_5214;
   int[] anIntArray5220;
   int[] anIntArray5207;
   int[][] anIntArrayArray5218;
   Class279[] aClass279Array5208;
   int anInt5216;
   byte[] aByteArray5209;

   void method5472(byte[] var1, int var2) {
      RSByteBuffer var3 = new RSByteBuffer(Class667.method7958(var1, -1783777742));
      int var4 = var3.readUnsignedByte(-1100088697);
      if(var4 >= 5 && var4 <= 7) {
         if(var4 >= 6) {
            this.anInt5210 = var3.readInt((byte)5) * -1162485961;
         } else {
            this.anInt5210 = 0;
         }

         int var5 = var3.readUnsignedByte(-608772141);
         boolean var6 = (var5 & 1) != 0;
         boolean var7 = (var5 & 2) != 0;
         boolean var8 = (var5 & 4) != 0;
         boolean var9 = 0 != (var5 & 8);
         if(var4 >= 7) {
            this.anInt5211 = var3.method9644(995419280) * 1513897037;
         } else {
            this.anInt5211 = var3.readUnsignedShort(1292059378) * 1513897037;
         }

         int var10 = 0;
         int var11 = -1;
         this.anIntArray5221 = new int[497900677 * this.anInt5211];
         int var12;
         if(var4 >= 7) {
            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               this.anIntArray5221[var12] = var10 += var3.method9644(428575563);
               if(this.anIntArray5221[var12] > var11) {
                  var11 = this.anIntArray5221[var12];
               }
            }
         } else {
            for(var12 = 0; var12 < 497900677 * this.anInt5211; ++var12) {
               this.anIntArray5221[var12] = var10 += var3.readUnsignedShort(90916455);
               if(this.anIntArray5221[var12] > var11) {
                  var11 = this.anIntArray5221[var12];
               }
            }
         }

         this.anInt5215 = (1 + var11) * 1542746683;
         this.anIntArray5224 = new int[42702579 * this.anInt5215];
         if(var9) {
            this.anIntArray5225 = new int[this.anInt5215 * 42702579];
         }

         if(var7) {
            this.aByteArrayArray5212 = new byte[42702579 * this.anInt5215][];
         }

         this.anIntArray5219 = new int[this.anInt5215 * 42702579];
         this.anIntArray5222 = new int[this.anInt5215 * 42702579];
         this.anIntArrayArray5223 = new int[this.anInt5215 * 42702579][];
         this.anIntArray5226 = new int[42702579 * this.anInt5215];
         if(var6) {
            this.anIntArray5213 = new int[42702579 * this.anInt5215];

            for(var12 = 0; var12 < 42702579 * this.anInt5215; ++var12) {
               this.anIntArray5213[var12] = -1;
            }

            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               this.anIntArray5213[this.anIntArray5221[var12]] = var3.readInt((byte)5);
            }

            this.aClass279_5214 = new Class279(this.anIntArray5213);
         }

         for(var12 = 0; var12 < 497900677 * this.anInt5211; ++var12) {
            this.anIntArray5224[this.anIntArray5221[var12]] = var3.readInt((byte)5);
         }

         if(var9) {
            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               this.anIntArray5225[var12] = var3.readInt((byte)5);
            }
         }

         if(var7) {
            for(var12 = 0; var12 < 497900677 * this.anInt5211; ++var12) {
               byte[] var13 = new byte[64];
               var3.writeBytes(var13, 0, 64, -2046173435);
               this.aByteArrayArray5212[this.anIntArray5221[var12]] = var13;
            }
         }

         if(var8) {
            this.anIntArray5220 = new int[this.anInt5215 * 42702579];
            this.anIntArray5207 = new int[this.anInt5215 * 42702579];

            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               this.anIntArray5220[this.anIntArray5221[var12]] = var3.readInt((byte)5);
               this.anIntArray5207[this.anIntArray5221[var12]] = var3.readInt((byte)5);
            }
         }

         for(var12 = 0; var12 < 497900677 * this.anInt5211; ++var12) {
            this.anIntArray5219[this.anIntArray5221[var12]] = var3.readInt((byte)5);
         }

         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         if(var4 >= 7) {
            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               this.anIntArray5222[this.anIntArray5221[var12]] = var3.method9644(1162980246);
            }

            for(var12 = 0; var12 < 497900677 * this.anInt5211; ++var12) {
               var18 = this.anIntArray5221[var12];
               var14 = this.anIntArray5222[var18];
               var10 = 0;
               var15 = -1;
               this.anIntArrayArray5223[var18] = new int[var14];

               for(var16 = 0; var16 < var14; ++var16) {
                  var17 = this.anIntArrayArray5223[var18][var16] = var10 += var3.method9644(541616584);
                  if(var17 > var15) {
                     var15 = var17;
                  }
               }

               this.anIntArray5226[var18] = 1 + var15;
               if(1 + var15 == var14) {
                  this.anIntArrayArray5223[var18] = null;
               }
            }
         } else {
            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               this.anIntArray5222[this.anIntArray5221[var12]] = var3.readUnsignedShort(1983376363);
            }

            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               var18 = this.anIntArray5221[var12];
               var14 = this.anIntArray5222[var18];
               var10 = 0;
               var15 = -1;
               this.anIntArrayArray5223[var18] = new int[var14];

               for(var16 = 0; var16 < var14; ++var16) {
                  var17 = this.anIntArrayArray5223[var18][var16] = var10 += var3.readUnsignedShort(1502937488);
                  if(var17 > var15) {
                     var15 = var17;
                  }
               }

               this.anIntArray5226[var18] = var15 + 1;
               if(var14 == var15 + 1) {
                  this.anIntArrayArray5223[var18] = null;
               }
            }
         }

         if(var6) {
            this.anIntArrayArray5218 = new int[var11 + 1][];
            this.aClass279Array5208 = new Class279[var11 + 1];

            for(var12 = 0; var12 < this.anInt5211 * 497900677; ++var12) {
               var18 = this.anIntArray5221[var12];
               var14 = this.anIntArray5222[var18];
               this.anIntArrayArray5218[var18] = new int[this.anIntArray5226[var18]];

               for(var15 = 0; var15 < this.anIntArray5226[var18]; ++var15) {
                  this.anIntArrayArray5218[var18][var15] = -1;
               }

               for(var15 = 0; var15 < var14; ++var15) {
                  if(this.anIntArrayArray5223[var18] != null) {
                     var16 = this.anIntArrayArray5223[var18][var15];
                  } else {
                     var16 = var15;
                  }

                  this.anIntArrayArray5218[var18][var16] = var3.readInt((byte)5);
               }

               this.aClass279Array5208[var18] = new Class279(this.anIntArrayArray5218[var18]);
            }
         }

      } else {
         throw new RuntimeException();
      }
   }

   Class462(byte[] var1, int var2, byte[] var3) {
      this.anInt5216 = Class705.method8290(var1, var1.length, (short)682) * -651056879;
      if(this.anInt5216 * 1234855921 != var2) {
         throw new RuntimeException();
      } else {
         if(var3 != null) {
            if(64 != var3.length) {
               throw new RuntimeException();
            }

            this.aByteArray5209 = Class200.method2872(var1, 0, var1.length, 1836019818);

            for(int var4 = 0; var4 < 64; ++var4) {
               if(var3[var4] != this.aByteArray5209[var4]) {
                  throw new RuntimeException();
               }
            }
         }

         this.method5472(var1, 166845782);
      }
   }

   static void method5473(Class681 var0, int var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1], -1706359394)).anInt3079 * 1349021013;
   }

   public static int method5474(Class174 var0, int var1) {
      Class298.method3983(-2118739212);
      return Class570.aTwitchTV7639.StopStreaming();
   }
}
