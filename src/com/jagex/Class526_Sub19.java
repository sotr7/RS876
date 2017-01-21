package com.jagex;

import com.jagex.Class148_Sub2;
import com.jagex.Class174_Sub3;
import com.jagex.Class20;
import com.jagex.Class318;
import com.jagex.Class526;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub17;
import com.jagex.Class692;
import com.jagex.Interface35;
import com.jagex.Interface42;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class526_Sub19 extends Class526 {
   Interface42 anInterface42_10522;
   Interface35 anInterface35_10523;
   int anInt10516 = 0;
   int anInt10524 = 0;
   int anInt10520 = 0;
   Class174_Sub3 aClass174_Sub3_10525;
   Class526_Sub16 aClass526_Sub16_10514;
   Class148_Sub2 aClass148_Sub2_10513;
   int anInt10515;
   int anInt10519;
   int anInt10517;
   int anInt10518;
   float[][] aFloatArrayArray10521;
   float[][] aFloatArrayArray10528;
   float[][] aFloatArrayArray10526;
   Class20 aClass20_10527;
   ByteBuffer aByteBuffer10512;

   void method9434(Class318 var1, int var2, int var3, int var4, boolean[][] var5, boolean var6) {
      if(this.anInterface42_10522 != null) {
         if(this.anInt10515 <= var2 + var4) {
            if(this.anInt10519 >= var2 - var4) {
               if(this.anInt10517 <= var3 + var4) {
                  if(this.anInt10518 >= var3 - var4) {
                     int var7;
                     if(var6) {
                        for(var7 = this.anInt10515; var7 <= this.anInt10519; ++var7) {
                           if(var7 - var2 >= -var4 && var7 - var2 <= var4) {
                              for(int var14 = this.anInt10517; var14 <= this.anInt10518; ++var14) {
                                 if(var14 - var3 >= -var4 && var14 - var3 <= var4 && var5[var7 - var2 + var4][var14 - var3 + var4]) {
                                    this.method9437(var1, this.anInterface42_10522, this.anInt10516 / 3);
                                    return;
                                 }
                              }
                           }
                        }
                     } else {
                        var7 = 0;
                        ByteBuffer var8 = this.aClass174_Sub3_10525.aByteBuffer9684;
                        var8.clear();
                        int var9 = this.anInt10517;

                        while(true) {
                           if(var9 > this.anInt10518) {
                              if(var8.position() == 0 || var7 == 0) {
                                 return;
                              }

                              var9 = var8.position();
                              Interface42 var15 = this.aClass174_Sub3_10525.method8746(var9 / 2);
                              var15.method235(0, var9, this.aClass174_Sub3_10525.aLong9685);
                              this.method9437(var1, var15, var7 / 3);
                              break;
                           }

                           if(var9 - var3 >= -var4 && var9 - var3 <= var4) {
                              int var10 = var9 * this.aClass148_Sub2_10513.anInt1711 * 1966165105 + this.anInt10515;

                              for(int var11 = this.anInt10515; var11 <= this.anInt10519; ++var11) {
                                 if(var11 - var2 >= -var4 && var11 - var2 <= var4 && var5[var11 - var2 + var4][var9 - var3 + var4]) {
                                    short[] var12 = this.aClass148_Sub2_10513.aShortArrayArray9128[var10];
                                    if(var12 != null) {
                                       for(int var13 = 0; var13 < var12.length; ++var13) {
                                          var8.putShort(var12[var13]);
                                          ++var7;
                                       }
                                    }
                                 }

                                 ++var10;
                              }
                           }

                           ++var9;
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method9435() {
      this.anInterface42_10522 = this.aClass174_Sub3_10525.method8805(false);
      this.anInterface42_10522.method340(this.anInt10516);
      this.anInterface35_10523 = this.aClass174_Sub3_10525.method8818(false);
      this.anInterface35_10523.method249(this.anInt10524 * 16, 16);
      this.anInterface35_10523.method235(0, this.anInt10524 * 16, this.aClass174_Sub3_10525.aLong9685);
      this.anInterface42_10522.method235(0, this.anInt10516 * 2, this.aClass174_Sub3_10525.aLong9685 + (long)(this.aClass174_Sub3_10525.anInt9687 >> 1));
   }

   void method9436(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.aClass148_Sub2_10513.anInt1710 * -586661047);
      int var10 = var6 + (var4 << this.aClass148_Sub2_10513.anInt1710 * -586661047);
      int var11 = this.aClass148_Sub2_10513.method1707(var9, var10, 25460013);
      if((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         Class526 var12 = this.aClass20_10527.get(var7);
         if(var12 != null) {
            Unsafe var31 = this.aClass174_Sub3_10525.anUnsafe9670;
            var31.putShort(this.aClass174_Sub3_10525.aLong9685 + (long)(this.aClass174_Sub3_10525.anInt9687 >> 1) + (long)(this.anInt10516 * 2), ((Class526_Sub17)var12).aShort10479);
            ++this.anInt10516;
            return;
         }
      }

      short var30 = (short)this.anInt10524;
      if(var7 != -1L) {
         this.aClass20_10527.put(new Class526_Sub17(var30), var7);
      }

      float var13;
      float var14;
      float var15;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      if(var5 == 0 && var6 == 0) {
         var13 = this.aFloatArrayArray10521[var1][var2];
         var14 = this.aFloatArrayArray10528[var1][var2];
         var15 = this.aFloatArrayArray10526[var1][var2];
      } else if(var5 == this.aClass148_Sub2_10513.anInt1712 * 1934131013 && var6 == 0) {
         var13 = this.aFloatArrayArray10521[var1 + 1][var2];
         var14 = this.aFloatArrayArray10528[var1 + 1][var2];
         var15 = this.aFloatArrayArray10526[var1 + 1][var2];
      } else if(var5 == this.aClass148_Sub2_10513.anInt1712 * 1934131013 && var6 == this.aClass148_Sub2_10513.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10521[var1 + 1][var2 + 1];
         var14 = this.aFloatArrayArray10528[var1 + 1][var2 + 1];
         var15 = this.aFloatArrayArray10526[var1 + 1][var2 + 1];
      } else if(var5 == 0 && var6 == this.aClass148_Sub2_10513.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10521[var1][var2 + 1];
         var14 = this.aFloatArrayArray10528[var1][var2 + 1];
         var15 = this.aFloatArrayArray10526[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.aClass148_Sub2_10513.anInt1712 * 1934131013);
         var17 = (float)var6 / (float)(this.aClass148_Sub2_10513.anInt1712 * 1934131013);
         var18 = this.aFloatArrayArray10521[var1][var2];
         var19 = this.aFloatArrayArray10528[var1][var2];
         var20 = this.aFloatArrayArray10526[var1][var2];
         var21 = this.aFloatArrayArray10521[var1 + 1][var2];
         var22 = this.aFloatArrayArray10528[var1 + 1][var2];
         var23 = this.aFloatArrayArray10526[var1 + 1][var2];
         var18 += (this.aFloatArrayArray10521[var1][var2 + 1] - var18) * var16;
         var19 += (this.aFloatArrayArray10528[var1][var2 + 1] - var19) * var16;
         var20 += (this.aFloatArrayArray10526[var1][var2 + 1] - var20) * var16;
         var21 += (this.aFloatArrayArray10521[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.aFloatArrayArray10528[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.aFloatArrayArray10526[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.aClass526_Sub16_10514.method9390((byte)-13) - var9);
      var17 = (float)(this.aClass526_Sub16_10514.method9391(1279328690) - var11);
      var18 = (float)(this.aClass526_Sub16_10514.method9392((byte)-105) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.aClass526_Sub16_10514.method9422((short)8192);
      var22 = 1.0F - var21 * var21;
      if(var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if(var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if(var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.aClass526_Sub16_10514.method9394(1839197391);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if(var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if(var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if(var28 > 255) {
         var28 = 255;
      }

      Unsafe var29 = this.aClass174_Sub3_10525.anUnsafe9670;
      var29.putFloat(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16), (float)var9);
      var29.putFloat(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 4L, (float)var11);
      var29.putFloat(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 8L, (float)var10);
      if(this.aClass174_Sub3_10525.anInt9729 == 0) {
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 12L, (byte)var28);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 13L, (byte)var27);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 14L, (byte)var26);
      } else {
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 12L, (byte)var26);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 13L, (byte)var27);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 14L, (byte)var28);
      }

      var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 15L, (byte)-1);
      ++this.anInt10524;
      var29.putShort(this.aClass174_Sub3_10525.aLong9685 + (long)(this.aClass174_Sub3_10525.anInt9687 >> 1) + (long)(this.anInt10516 * 2), var30);
      ++this.anInt10516;
   }

   void method9437(Class318 var1, Interface42 var2, int var3) {
      var1.anInt3430 = 0;
      var1.anInt3416 = this.anInt10524;
      var1.anInt3424 = 0;
      var1.anInt3423 = this.anInt10516 / 3;
      var1.anInterface38_3415 = this.aClass174_Sub3_10525.anInterface38_9779;
      float var4 = this.aClass526_Sub16_10514.method9419(1613563498);
      var1.aClass446_3433.method5266(var4, var4, var4);
      this.aClass174_Sub3_10525.method8820(0, this.anInterface35_10523);
      this.aClass174_Sub3_10525.method8833(this.aClass174_Sub3_10525.aClass335_9843);
      this.aClass174_Sub3_10525.method8769(this.anInterface42_10522);
      var1.method4107(0);
   }

   void method9438(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.aClass148_Sub2_10513.anInt1710 * -586661047);
      int var10 = var6 + (var4 << this.aClass148_Sub2_10513.anInt1710 * -586661047);
      int var11 = this.aClass148_Sub2_10513.method1707(var9, var10, -757320042);
      if((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         Class526 var12 = this.aClass20_10527.get(var7);
         if(var12 != null) {
            Unsafe var31 = this.aClass174_Sub3_10525.anUnsafe9670;
            var31.putShort(this.aClass174_Sub3_10525.aLong9685 + (long)(this.aClass174_Sub3_10525.anInt9687 >> 1) + (long)(this.anInt10516 * 2), ((Class526_Sub17)var12).aShort10479);
            ++this.anInt10516;
            return;
         }
      }

      short var30 = (short)this.anInt10524;
      if(var7 != -1L) {
         this.aClass20_10527.put(new Class526_Sub17(var30), var7);
      }

      float var13;
      float var14;
      float var15;
      float var16;
      float var17;
      float var18;
      float var19;
      float var20;
      float var21;
      float var22;
      float var23;
      if(var5 == 0 && var6 == 0) {
         var13 = this.aFloatArrayArray10521[var1][var2];
         var14 = this.aFloatArrayArray10528[var1][var2];
         var15 = this.aFloatArrayArray10526[var1][var2];
      } else if(var5 == this.aClass148_Sub2_10513.anInt1712 * 1934131013 && var6 == 0) {
         var13 = this.aFloatArrayArray10521[var1 + 1][var2];
         var14 = this.aFloatArrayArray10528[var1 + 1][var2];
         var15 = this.aFloatArrayArray10526[var1 + 1][var2];
      } else if(var5 == this.aClass148_Sub2_10513.anInt1712 * 1934131013 && var6 == this.aClass148_Sub2_10513.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10521[var1 + 1][var2 + 1];
         var14 = this.aFloatArrayArray10528[var1 + 1][var2 + 1];
         var15 = this.aFloatArrayArray10526[var1 + 1][var2 + 1];
      } else if(var5 == 0 && var6 == this.aClass148_Sub2_10513.anInt1712 * 1934131013) {
         var13 = this.aFloatArrayArray10521[var1][var2 + 1];
         var14 = this.aFloatArrayArray10528[var1][var2 + 1];
         var15 = this.aFloatArrayArray10526[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.aClass148_Sub2_10513.anInt1712 * 1934131013);
         var17 = (float)var6 / (float)(this.aClass148_Sub2_10513.anInt1712 * 1934131013);
         var18 = this.aFloatArrayArray10521[var1][var2];
         var19 = this.aFloatArrayArray10528[var1][var2];
         var20 = this.aFloatArrayArray10526[var1][var2];
         var21 = this.aFloatArrayArray10521[var1 + 1][var2];
         var22 = this.aFloatArrayArray10528[var1 + 1][var2];
         var23 = this.aFloatArrayArray10526[var1 + 1][var2];
         var18 += (this.aFloatArrayArray10521[var1][var2 + 1] - var18) * var16;
         var19 += (this.aFloatArrayArray10528[var1][var2 + 1] - var19) * var16;
         var20 += (this.aFloatArrayArray10526[var1][var2 + 1] - var20) * var16;
         var21 += (this.aFloatArrayArray10521[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.aFloatArrayArray10528[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.aFloatArrayArray10526[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.aClass526_Sub16_10514.method9390((byte)-110) - var9);
      var17 = (float)(this.aClass526_Sub16_10514.method9391(-1045037113) - var11);
      var18 = (float)(this.aClass526_Sub16_10514.method9392((byte)-49) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.aClass526_Sub16_10514.method9422((short)8192);
      var22 = 1.0F - var21 * var21;
      if(var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if(var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if(var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.aClass526_Sub16_10514.method9394(-1751775559);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if(var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if(var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if(var28 > 255) {
         var28 = 255;
      }

      Unsafe var29 = this.aClass174_Sub3_10525.anUnsafe9670;
      var29.putFloat(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16), (float)var9);
      var29.putFloat(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 4L, (float)var11);
      var29.putFloat(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 8L, (float)var10);
      if(this.aClass174_Sub3_10525.anInt9729 == 0) {
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 12L, (byte)var28);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 13L, (byte)var27);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 14L, (byte)var26);
      } else {
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 12L, (byte)var26);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 13L, (byte)var27);
         var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 14L, (byte)var28);
      }

      var29.putByte(this.aClass174_Sub3_10525.aLong9685 + (long)(this.anInt10524 * 16) + 15L, (byte)-1);
      ++this.anInt10524;
      var29.putShort(this.aClass174_Sub3_10525.aLong9685 + (long)(this.aClass174_Sub3_10525.anInt9687 >> 1) + (long)(this.anInt10516 * 2), var30);
      ++this.anInt10516;
   }

   Class526_Sub19(Class174_Sub3 var1, Class148_Sub2 var2, Class526_Sub16 var3, int[] var4) {
      this.aClass174_Sub3_10525 = var1;
      this.aClass526_Sub16_10514 = var3;
      this.aClass148_Sub2_10513 = var2;
      int var5 = this.aClass526_Sub16_10514.method9422((short)8192) - (var2.anInt1712 * 1934131013 >> 1);
      this.anInt10515 = this.aClass526_Sub16_10514.method9390((byte)-14) - var5 >> var2.anInt1710 * -586661047;
      this.anInt10519 = this.aClass526_Sub16_10514.method9390((byte)-31) + var5 >> var2.anInt1710 * -586661047;
      this.anInt10517 = this.aClass526_Sub16_10514.method9392((byte)-38) - var5 >> var2.anInt1710 * -586661047;
      this.anInt10518 = this.aClass526_Sub16_10514.method9392((byte)-68) + var5 >> var2.anInt1710 * -586661047;
      int var6 = this.anInt10519 - this.anInt10515 + 1;
      int var7 = this.anInt10518 - this.anInt10517 + 1;
      this.aFloatArrayArray10521 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray10528 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray10526 = new float[var6 + 1][var7 + 1];

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var8 = 0; var8 <= var7; ++var8) {
         var9 = var8 + this.anInt10517;
         if(var9 > 0 && var9 < this.aClass148_Sub2_10513.anInt1713 * -810756899 - 1) {
            for(var10 = 0; var10 <= var6; ++var10) {
               var11 = var10 + this.anInt10515;
               if(var11 > 0 && var11 < this.aClass148_Sub2_10513.anInt1711 * 1966165105 - 1) {
                  var12 = var2.method1714(var11 + 1, var9, -424586877) - var2.method1714(var11 - 1, var9, -2090201691);
                  var13 = var2.method1714(var11, var9 + 1, 1996821615) - var2.method1714(var11, var9 - 1, -1260473524);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 65536 + var13 * var13)));
                  this.aFloatArrayArray10521[var10][var8] = (float)var12 * var14;
                  this.aFloatArrayArray10528[var10][var8] = -256.0F * var14;
                  this.aFloatArrayArray10526[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      var8 = 0;

      for(var9 = this.anInt10517; var9 <= this.anInt10518; ++var9) {
         if(var9 >= 0 && var9 < var2.anInt1713 * -810756899) {
            for(var10 = this.anInt10515; var10 <= this.anInt10519; ++var10) {
               if(var10 >= 0 && var10 < var2.anInt1711 * 1966165105) {
                  var11 = var4[var8];
                  int[] var18 = var2.anIntArrayArrayArray9132[var10][var9];
                  if(var18 != null && var11 != 0) {
                     if(var11 == 1) {
                        for(var13 = 0; var13 < var18.length; var13 += 3) {
                           if(var18[var13] != -1 && var18[var13 + 1] != -1 && var18[var13 + 2] != -1) {
                              this.anInt10520 += 3;
                           }
                        }
                     } else {
                        this.anInt10520 += 3;
                     }
                  }
               }

               ++var8;
            }
         } else {
            var8 += this.anInt10519 - this.anInt10515;
         }
      }

      if(this.anInt10520 > 0) {
         this.aClass20_10527 = new Class20(Class692.method8110(this.anInt10520, 326070269));
         this.aByteBuffer10512 = this.aClass174_Sub3_10525.aByteBuffer9684;
         this.aByteBuffer10512.clear();
         this.aByteBuffer10512.position(this.aClass174_Sub3_10525.anInt9687 >> 1);
         this.aByteBuffer10512.slice();
         this.aByteBuffer10512.position(0);
         this.aByteBuffer10512.limit(this.aClass174_Sub3_10525.anInt9687 >> 1);
         var9 = 0;
         var8 = 0;

         for(var10 = this.anInt10517; var10 <= this.anInt10518; ++var10) {
            if(var10 >= 0 && var10 < var2.anInt1713 * -810756899) {
               var11 = 0;

               for(var12 = this.anInt10515; var12 <= this.anInt10519; ++var12) {
                  if(var12 >= 0 && var12 < var2.anInt1711 * 1966165105) {
                     var13 = var4[var8];
                     int[] var19 = var2.anIntArrayArrayArray9132[var12][var10];
                     if(var19 != null && var13 != 0) {
                        if(var13 != 1) {
                           if(var13 == 3) {
                              this.method9436(var11, var9, var12, var10, 0, 0);
                              this.method9436(var11, var9, var12, var10, var2.anInt1712 * 1934131013, 0);
                              this.method9436(var11, var9, var12, var10, 0, var2.anInt1712 * 1934131013);
                           } else if(var13 == 2) {
                              this.method9436(var11, var9, var12, var10, var2.anInt1712 * 1934131013, 0);
                              this.method9436(var11, var9, var12, var10, var2.anInt1712 * 1934131013, var2.anInt1712 * 1934131013);
                              this.method9436(var11, var9, var12, var10, 0, 0);
                           } else if(var13 == 5) {
                              this.method9436(var11, var9, var12, var10, var2.anInt1712 * 1934131013, var2.anInt1712 * 1934131013);
                              this.method9436(var11, var9, var12, var10, 0, var2.anInt1712 * 1934131013);
                              this.method9436(var11, var9, var12, var10, var2.anInt1712 * 1934131013, 0);
                           } else if(var13 == 4) {
                              this.method9436(var11, var9, var12, var10, 0, var2.anInt1712 * 1934131013);
                              this.method9436(var11, var9, var12, var10, 0, 0);
                              this.method9436(var11, var9, var12, var10, var2.anInt1712 * 1934131013, var2.anInt1712 * 1934131013);
                           }
                        } else {
                           int[] var15 = var2.anIntArrayArrayArray9134[var12][var10];
                           int[] var16 = var2.anIntArrayArrayArray9142[var12][var10];
                           int var17 = 0;

                           label110:
                           while(true) {
                              while(true) {
                                 if(var17 >= var19.length) {
                                    break label110;
                                 }

                                 if(var19[var17] != -1 && var19[var17 + 1] != -1 && var19[var17 + 2] != -1) {
                                    this.method9436(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                    this.method9436(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                    this.method9436(var11, var9, var12, var10, var15[var17], var16[var17]);
                                    ++var17;
                                 } else {
                                    var17 += 3;
                                 }
                              }
                           }
                        }
                     }
                  }

                  ++var8;
                  ++var11;
               }
            } else {
               var8 += this.anInt10519 - this.anInt10515;
            }

            ++var9;
         }

         this.method9435();
      } else {
         this.anInterface35_10523 = null;
         this.anInterface42_10522 = null;
      }

      this.aClass20_10527 = null;
      this.aFloatArrayArray10526 = (float[][])null;
      this.aFloatArrayArray10528 = (float[][])null;
      this.aFloatArrayArray10521 = (float[][])null;
   }
}
