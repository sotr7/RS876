package com.jagex;

import com.jagex.Class148;
import com.jagex.Class16;
import com.jagex.Class169;
import com.jagex.Class171;
import com.jagex.Class172;
import com.jagex.Class174_Sub3;
import com.jagex.Class20;
import com.jagex.Class318;
import com.jagex.Class335;
import com.jagex.Class34;
import com.jagex.Class349;
import com.jagex.Class351_Sub1_Sub2;
import com.jagex.Class353;
import com.jagex.Class359;
import com.jagex.Class361_Sub1;
import com.jagex.Class433;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class526;
import com.jagex.Class526_Sub15;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub17;
import com.jagex.Class526_Sub19;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub21_Sub5_Sub1;
import com.jagex.Class568;
import com.jagex.Class702;
import com.jagex.Interface35;
import com.jagex.Interface42;
import java.nio.ByteBuffer;
import java.util.Iterator;

public class Class148_Sub2 extends Class148 {
   static final int anInt9127 = 1;
   static final int anInt9130 = 74;
   int[][][] anIntArrayArrayArray9137;
   int[][][] anIntArrayArrayArray9136;
   int anInt9146;
   int anInt9119;
   Class349 aClass349_9139;
   Class526[] aClass526Array9152;
   int anInt9156;
   ByteBuffer aByteBuffer9158;
   ByteBuffer aByteBuffer9155;
   int anInt9153;
   Class526[] aClass526Array9141;
   int[][][] anIntArrayArrayArray9142;
   int[][][] anIntArrayArrayArray9134;
   int[][][] anIntArrayArrayArray9132;
   int[][][] anIntArrayArrayArray9133;
   Class526_Sub15[][][] aClass526_Sub15ArrayArrayArray9131;
   byte[][] aByteArrayArray9147;
   Class20 aClass20_9151;
   float[][] aFloatArrayArray9150;
   float[][] aFloatArrayArray9138;
   float[][] aFloatArrayArray9148;
   int[] anIntArray9160 = new int[1];
   int anInt9135;
   int[] anIntArray9157 = new int[1];
   int[] anIntArray9159 = new int[1];
   float aFloat9129 = Float.MAX_VALUE;
   float aFloat9145 = -3.4028235E38F;
   Class702 aClass702_9144 = new Class702();
   Class174_Sub3 aClass174_Sub3_9121;
   int anInt9122;
   int anInt9123;
   int anInt9124;
   int anInt9125;
   short[][] aShortArrayArray9128;
   byte[][] aByteArrayArray9140;
   Interface35 anInterface35_9143;
   Interface35 anInterface35_9120;
   Class335 aClass335_9149;
   int anInt9154;
   int anInt9126;

   public void method1741(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4529(var1, var7, var8);
      }
   }

   public void method1706(Class526_Sub16 var1, int[] var2) {
      this.aClass702_9144.method8176(new Class526_Sub19(this.aClass174_Sub3_9121, this, var1, var2), -1096358989);
   }

   public void method1699(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub3_9121.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9137 == null) {
         this.anIntArrayArrayArray9137 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9136 == null) {
         this.anIntArrayArrayArray9136 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9134[var1][var2] = var3;
      this.anIntArrayArrayArray9142[var1][var2] = var5;
      this.anIntArrayArrayArray9132[var1][var2] = var7;
      this.anIntArrayArrayArray9133[var1][var2] = var8;
      if(this.anIntArrayArrayArray9137 != null) {
         this.anIntArrayArrayArray9137[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9136 != null) {
         this.anIntArrayArrayArray9136[var1][var2] = var4;
      }

      Class526_Sub15[] var14 = this.aClass526_Sub15ArrayArrayArray9131[var1][var2] = new Class526_Sub15[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9125 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)23).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9151.get(var18); var20 != null; var20 = this.aClass20_9151.method635(-1734407897)) {
            Class526_Sub15 var21 = (Class526_Sub15)var20;
            if(var21.anInt10456 == var16 && var21.aFloat10459 == (float)var17 && var21.aClass172_10460.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub15(this, var16, var17, var11);
            this.aClass20_9151.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub15)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9140[var1][var2] = (byte)(this.aByteArrayArray9140[var1][var2] | 1);
      }

      if(var7.length > this.anInt9146) {
         this.anInt9146 = var7.length;
      }

      this.anInt9119 += var7.length;
   }

   public void method1700(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = new int[var16 * 3];
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = var4 != null?new int[var16 * 3]:null;
      int[] var24 = var6 != null?new int[var16 * 3]:null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = var7[var26];
         int var28 = var8[var26];
         int var29 = var9[var26];
         var17[var25] = var3[var27];
         var18[var25] = var5[var27];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var27];
         }

         if(var6 != null) {
            var24[var25] = var6[var27];
         }

         ++var25;
         var17[var25] = var3[var28];
         var18[var25] = var5[var28];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var28];
         }

         if(var6 != null) {
            var24[var25] = var6[var28];
         }

         ++var25;
         var17[var25] = var3[var29];
         var18[var25] = var5[var29];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var29];
         }

         if(var6 != null) {
            var24[var25] = var6[var29];
         }

         ++var25;
      }

      this.method1699(var1, var2, var17, var23, var18, var24, var19, var20, var21, var22, var14, var15);
   }

   public void method1737() {
      if(this.anInt9119 <= 0) {
         this.aClass349_9139 = null;
         this.method8434();
      } else {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         int var3;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9147[var2 - 1][var3] >> 2) + (this.aByteArrayArray9147[var2 + 1][var3] >> 3) + (this.aByteArrayArray9147[var2][var3 - 1] >> 2) + (this.aByteArrayArray9147[var2][var3 + 1] >> 3) + (this.aByteArrayArray9147[var2][var3] >> 1));
            }
         }

         this.aClass526Array9152 = new Class526[this.aClass20_9151.method636(-633885248)];
         this.aClass20_9151.method641(this.aClass526Array9152, (byte)42);

         for(var2 = 0; var2 < this.aClass526Array9152.length; ++var2) {
            ((Class526_Sub15)this.aClass526Array9152[var2]).method9381(this.anInt9119);
         }

         this.anInt9156 = 20;
         if(this.anIntArrayArrayArray9137 != null) {
            this.anInt9156 += 4;
         }

         if((this.anInt9125 & 7) != 0) {
            this.anInt9156 += 12;
         }

         this.aByteBuffer9158 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * 4);
         this.aByteBuffer9155 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * this.anInt9156);
         Class526_Sub15[] var18 = new Class526_Sub15[this.anInt9119];
         var3 = Class568.method6836(this.anInt9119 / 4, 549429099);
         if(var3 < 1) {
            var3 = 1;
         }

         Class20 var4 = new Class20(var3);
         Class526_Sub15[] var5 = new Class526_Sub15[this.anInt9146];

         int var6;
         int var7;
         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               this.method8443(var6, var7, var1, var5, var4, var18);
            }
         }

         Class526_Sub15 var19;
         for(var6 = 0; var6 < this.anInt9126; ++var6) {
            var19 = var18[var6];
            if(var19 != null) {
               var19.method9374(var6);
            }
         }

         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               short[] var8 = this.aShortArrayArray9128[var7 * this.anInt1711 * 1966165105 + var6];
               if(var8 != null) {
                  int var9 = 0;

                  for(int var10 = 0; var10 < var8.length; ++var9) {
                     int var11 = var8[var10++] & '\uffff';
                     int var12 = var8[var10++] & '\uffff';
                     int var13 = var8[var10++] & '\uffff';
                     Class526_Sub15 var14 = var18[var11];
                     Class526_Sub15 var15 = var18[var12];
                     Class526_Sub15 var16 = var18[var13];
                     Class526_Sub15 var17 = null;
                     if(var14 != null) {
                        var14.method9375(var6, var7, var9);
                        var17 = var14;
                     }

                     if(var15 != null) {
                        var15.method9375(var6, var7, var9);
                        if(var17 == null || var15.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var15;
                        }
                     }

                     if(var16 != null) {
                        var16.method9375(var6, var7, var9);
                        if(var17 == null || var16.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var16;
                        }
                     }

                     if(var17 != null) {
                        if(var14 != null) {
                           var17.method9374(var11);
                        }

                        if(var15 != null) {
                           var17.method9374(var12);
                        }

                        if(var16 != null) {
                           var17.method9374(var13);
                        }

                        var17.method9375(var6, var7, var9);
                     }
                  }
               }
            }
         }

         this.anInt9153 = 0;

         for(var6 = 0; var6 < this.aClass526Array9152.length; ++var6) {
            var19 = (Class526_Sub15)this.aClass526Array9152[var6];
            if(var19.anInt10462 > 0) {
               this.aClass526Array9152[this.anInt9153++] = var19;
            }
         }

         this.aClass526Array9141 = new Class526[this.anInt9153];
         long[] var21 = new long[this.anInt9153];

         for(var7 = 0; var7 < this.anInt9153; ++var7) {
            Class526_Sub15 var20 = (Class526_Sub15)this.aClass526Array9152[var7];
            var21[var7] = var20.aLong7156 * -6805155999452426801L;
            this.aClass526Array9141[var7] = var20;
         }

         Class361_Sub1.method9240(var21, this.aClass526Array9141, (byte)-24);
         this.method8439();
      }
   }

   void method8434() {
      if((this.anInt9124 & 2) == 0) {
         this.anIntArrayArrayArray9142 = (int[][][])null;
         this.anIntArrayArrayArray9134 = (int[][][])null;
         this.anIntArrayArrayArray9132 = (int[][][])null;
      }

      this.anIntArrayArrayArray9137 = (int[][][])null;
      this.anIntArrayArrayArray9133 = (int[][][])null;
      this.anIntArrayArrayArray9136 = (int[][][])null;
      this.aClass526_Sub15ArrayArrayArray9131 = (Class526_Sub15[][][])null;
      this.aByteArrayArray9147 = (byte[][])null;
      this.aClass20_9151 = null;
      this.aClass526Array9152 = null;
      this.aFloatArrayArray9150 = (float[][])null;
      this.aFloatArrayArray9138 = (float[][])null;
      this.aFloatArrayArray9148 = (float[][])null;
   }

   public void method1716(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub3_9121.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9137 == null) {
         this.anIntArrayArrayArray9137 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9136 == null) {
         this.anIntArrayArrayArray9136 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9134[var1][var2] = var3;
      this.anIntArrayArrayArray9142[var1][var2] = var5;
      this.anIntArrayArrayArray9132[var1][var2] = var7;
      this.anIntArrayArrayArray9133[var1][var2] = var8;
      if(this.anIntArrayArrayArray9137 != null) {
         this.anIntArrayArrayArray9137[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9136 != null) {
         this.anIntArrayArrayArray9136[var1][var2] = var4;
      }

      Class526_Sub15[] var14 = this.aClass526_Sub15ArrayArrayArray9131[var1][var2] = new Class526_Sub15[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9125 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)96).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9151.get(var18); var20 != null; var20 = this.aClass20_9151.method635(-1734407897)) {
            Class526_Sub15 var21 = (Class526_Sub15)var20;
            if(var21.anInt10456 == var16 && var21.aFloat10459 == (float)var17 && var21.aClass172_10460.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub15(this, var16, var17, var11);
            this.aClass20_9151.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub15)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9140[var1][var2] = (byte)(this.aByteArrayArray9140[var1][var2] | 1);
      }

      if(var7.length > this.anInt9146) {
         this.anInt9146 = var7.length;
      }

      this.anInt9119 += var7.length;
   }

   public void method1739(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub3_9121.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9137 == null) {
         this.anIntArrayArrayArray9137 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9136 == null) {
         this.anIntArrayArrayArray9136 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9134[var1][var2] = var3;
      this.anIntArrayArrayArray9142[var1][var2] = var5;
      this.anIntArrayArrayArray9132[var1][var2] = var7;
      this.anIntArrayArrayArray9133[var1][var2] = var8;
      if(this.anIntArrayArrayArray9137 != null) {
         this.anIntArrayArrayArray9137[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9136 != null) {
         this.anIntArrayArrayArray9136[var1][var2] = var4;
      }

      Class526_Sub15[] var14 = this.aClass526_Sub15ArrayArrayArray9131[var1][var2] = new Class526_Sub15[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9125 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)40).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9151.get(var18); var20 != null; var20 = this.aClass20_9151.method635(-1734407897)) {
            Class526_Sub15 var21 = (Class526_Sub15)var20;
            if(var21.anInt10456 == var16 && var21.aFloat10459 == (float)var17 && var21.aClass172_10460.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub15(this, var16, var17, var11);
            this.aClass20_9151.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub15)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9140[var1][var2] = (byte)(this.aByteArrayArray9140[var1][var2] | 1);
      }

      if(var7.length > this.anInt9146) {
         this.anInt9146 = var7.length;
      }

      this.anInt9119 += var7.length;
   }

   public void method1709(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass526Array9141 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.anIntArray9160.length < var7) {
            this.anIntArray9160 = new int[var7];
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if(var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if(var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if(var12 > this.anInt1711 * 1966165105 - 1) {
            var12 = this.anInt1711 * 1966165105 - 1;
         }

         int var13 = var2 + var3;
         if(var13 > this.anInt1713 * -810756899 - 1) {
            var13 = this.anInt1713 * -810756899 - 1;
         }

         this.anInt9135 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if(var15[var16 - var11]) {
                  this.anIntArray9160[this.anInt9135++] = var16 * this.anInt1711 * 1966165105 + var14;
               }
            }
         }

         ByteBuffer var24 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var24.clear();

         int var25;
         for(var25 = 0; var25 < this.aClass526Array9141.length; ++var25) {
            Class526_Sub15 var26 = (Class526_Sub15)this.aClass526Array9141[var25];
            var26.method9378(this.anIntArray9160, this.anInt9135);
         }

         var25 = var24.position();
         Class318 var27 = this.aClass174_Sub3_9121.aClass318_9762;
         this.aClass174_Sub3_9121.method8829();
         if(this.aClass174_Sub3_9121.anInt9675 > 0) {
            var27.aClass446_3432.method5266((float)(this.aClass174_Sub3_9121.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 0 & 255) / 255.0F);
            var27.aClass444_3411.method5202(0.0F, 0.0F, 1.0F, -this.aClass174_Sub3_9121.aFloat9810);
            var27.aClass444_3411.method5207(this.aClass174_Sub3_9121.aClass433_9700);
            var27.aClass444_3411.method5206(1.0F / (this.aClass174_Sub3_9121.aFloat9677 - this.aClass174_Sub3_9121.aFloat9810));
         } else {
            var27.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
         }

         if(var25 != 0) {
            Interface42 var17 = this.aClass174_Sub3_9121.method8746(var25 / 2);
            var17.method235(0, var25, this.aClass174_Sub3_9121.aLong9685);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8769(var17);
            var27.method4105(Class433.aClass433_4840);
            int var18;
            int var19;
            Class526_Sub15 var20;
            Class171 var22;
            if((this.anInt9125 & 7) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 != 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        var27.aClass444_3421.method5202(0.0F, 1.0F, 0.0F, (float)this.aClass174_Sub3_9121.anInt9803 + (float)(var20.aClass172_10460.anInt2018 * 1590947963) / 255.0F * (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass444_3421.method5206(1.0F / (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     boolean var33 = false;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-4);
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var33 = !Class16.method621(var22.aByte1966, 1963596274);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     var27.method4120(var33);
                     var18 += var20.anInt10458;
                  }
               }
            } else {
               var27.aClass446_3425.method5266(this.aClass174_Sub3_9121.aFloatArray9777[0], this.aClass174_Sub3_9121.aFloatArray9777[1], this.aClass174_Sub3_9121.aFloatArray9777[2]);
               var27.aClass446_3426.method5266(this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3428.method5266(-this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9708, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9771, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3433.method5266(this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9760);
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 > 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        float var21 = 0.15F;
                        var27.aClass444_3421.method5202(0.0F, 1.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21), 0.0F, 256.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     byte var32 = 11;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-84);
                        var32 = var22.aByte1966;
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var27.method4117(var22.aByte1970);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     switch(var32) {
                     case 1:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4111();
                        } else {
                           var27.method4116(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if(!this.aClass174_Sub3_9121.aBool9761 && (this.anInt9125 & 8) != 0 && this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792.method10545(-1576488102)) {
                           Class351_Sub1_Sub2 var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792;
                           if(var32 == 2) {
                              var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9791;
                           }

                           var34.aClass433_11565.method5083(this.aClass174_Sub3_9121.aClass433_9720);
                           var34.aClass433_11567.method5141(1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F, 1.0F);
                           var34.aClass446_11569.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                           Class171 var23 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-50);
                           var34.anInt11570 = var23.aByte1970 * 961023603;
                           var34.anInt11590 = var20.anInt10461 * -1556650397;
                           var34.anInt11586 = (var20.anInt10466 - var20.anInt10461 + 1) * -737570061;
                           var34.anInt11582 = var18 * -1598793771;
                           var34.anInt11584 = var20.anInt10458 / 3 * 1520663561;
                           var34.aClass444_11578.method5203(var27.aClass444_3421);
                           var34.aClass446_11562.method5267(var27.aClass446_3422);
                           var34.aClass444_11580.method5203(var27.aClass444_3411);
                           var34.aClass446_11574.method5267(var27.aClass446_3432);
                           var34.method10547(-1450399027);
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4110();
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 6:
                        var27.method4120(!Class16.method621(var32, 1865810021));
                        break;
                     case 7:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        var27.aClass433_3429.method5104();
                        var27.anInterface44_3431 = this.aClass174_Sub3_9121.method8751();
                        var27.method4109(0);
                     }

                     var18 += var20.anInt10458;
                  }
               }
            }
         }

         if(!this.aClass702_9144.method8209(-918883910)) {
            this.aClass174_Sub3_9121.method8807(128);
            this.aClass174_Sub3_9121.method8782(false);
            Class446 var28 = new Class446(var27.aClass446_3432);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            Iterator var30 = this.aClass702_9144.iterator();

            while(var30.hasNext()) {
               Class526_Sub19 var31 = (Class526_Sub19)var30.next();
               var31.method9434(var27, var1, var2, var3, var4, var5);
            }

            var27.aClass446_3432.method5267(var28);
         }

         if(this.aClass349_9139 != null) {
            this.aClass174_Sub3_9121.method8807(1);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            Class433 var29 = this.aClass174_Sub3_9121.aClass433_9705;
            var29.method5104();
            var29.aFloatArray4841[13] = -1.0F;
            var27.method4105(var29);
            this.aClass349_9139.method4538(var27, var1, var2, var3, var4, var5);
         }
      }

   }

   public void method1719(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      if(this.anInt9119 > 0) {
         Interface42 var9 = this.aClass174_Sub3_9121.method8746(this.anInt9154);
         int var10 = 0;
         int var11 = 32767;
         int var12 = -32768;
         ByteBuffer var13 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var13.clear();

         for(int var14 = var5; var14 < var7; ++var14) {
            int var15 = var14 * this.anInt1711 * 1966165105 + var4;

            for(int var16 = var4; var16 < var6; ++var16) {
               if(var8[var16 - var4][var14 - var5]) {
                  short[] var17 = this.aShortArrayArray9128[var15];
                  if(var17 != null) {
                     for(int var18 = 0; var18 < var17.length; ++var18) {
                        int var19 = var17[var18] & '\uffff';
                        if(var19 > var12) {
                           var12 = var19;
                        }

                        if(var19 < var11) {
                           var11 = var19;
                        }

                        var13.putShort((short)var19);
                        ++var10;
                     }
                  }
               }

               ++var15;
            }
         }

         var9.method235(0, var13.position(), this.aClass174_Sub3_9121.aLong9685);
         if(var10 > 0) {
            this.aClass174_Sub3_9121.method8829();
            Class318 var20 = this.aClass174_Sub3_9121.aClass318_9762;
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            this.aClass174_Sub3_9121.method8769(var9);
            this.aClass174_Sub3_9121.method2326(Class445.aClass445_4903);
            float var21 = (float)this.aClass174_Sub3_9121.method2247((byte)6).method2691();
            float var22 = (float)this.aClass174_Sub3_9121.method2247((byte)6).method2693();
            Class445 var23 = new Class445();
            Class445 var24 = new Class445();
            var23.method5250(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
            var24.method5256((float)var3 / (256.0F * (float)(this.anInt1712 * 1934131013)), (float)(-var3) / (256.0F * (float)(this.anInt1712 * 1934131013)), 1.0F / (this.aFloat9145 - this.aFloat9129));
            var24.method5251((float)var1 - (float)(var4 * var3) / 256.0F, (float)var2 + (float)(var7 * var3) / 256.0F, -this.aFloat9129 / (this.aFloat9145 - this.aFloat9129));
            var24.method5228(2.0F / var21, 2.0F / var22, 1.0F);
            var24.method5251(-1.0F, -1.0F, 0.0F);
            this.aClass174_Sub3_9121.aClass445_9704.method5232(var23, var24);
            this.aClass174_Sub3_9121.aClass433_9705.method5110(this.aClass174_Sub3_9121.aClass445_9704);
            this.aClass174_Sub3_9121.method2231(this.aClass174_Sub3_9121.aClass433_9705);
            var20.method4105(Class433.aClass433_4840);
            var20.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var20.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            var20.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var20.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
            var20.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
            var20.aClass433_3420.method5104();
            var20.anInt3430 = var11;
            var20.anInt3416 = var12 - var11 + 1;
            var20.anInt3424 = 0;
            var20.anInt3423 = var10 / 3;
            if(this.aClass174_Sub3_9121.aBool9808) {
               this.aClass174_Sub3_9121.method2328(false);
               var20.method4120(false);
               this.aClass174_Sub3_9121.method2328(true);
            } else {
               var20.method4120(false);
            }
         }

      }
   }

   public Class526_Sub21_Sub5 method1708(int var1, int var2, Class526_Sub21_Sub5 var3) {
      if((this.aByteArrayArray9140[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt1712 * 1934131013 >> this.aClass174_Sub3_9121.anInt9710;
         Class526_Sub21_Sub5_Sub1 var5 = (Class526_Sub21_Sub5_Sub1)var3;
         Class526_Sub21_Sub5_Sub1 var6;
         if(var5 != null && var5.method10872(var4, var4)) {
            var6 = var5;
            var5.method10873();
         } else {
            var6 = new Class526_Sub21_Sub5_Sub1(this.aClass174_Sub3_9121, var4, var4);
         }

         var6.method10871(0, 0, var4, var4);
         this.method8435(var6, var1, var2);
         return var6;
      }
   }

   public void method1721() {
      if(this.anInt9119 <= 0) {
         this.aClass349_9139 = null;
         this.method8434();
      } else {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         int var3;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9147[var2 - 1][var3] >> 2) + (this.aByteArrayArray9147[var2 + 1][var3] >> 3) + (this.aByteArrayArray9147[var2][var3 - 1] >> 2) + (this.aByteArrayArray9147[var2][var3 + 1] >> 3) + (this.aByteArrayArray9147[var2][var3] >> 1));
            }
         }

         this.aClass526Array9152 = new Class526[this.aClass20_9151.method636(-1016348212)];
         this.aClass20_9151.method641(this.aClass526Array9152, (byte)2);

         for(var2 = 0; var2 < this.aClass526Array9152.length; ++var2) {
            ((Class526_Sub15)this.aClass526Array9152[var2]).method9381(this.anInt9119);
         }

         this.anInt9156 = 20;
         if(this.anIntArrayArrayArray9137 != null) {
            this.anInt9156 += 4;
         }

         if((this.anInt9125 & 7) != 0) {
            this.anInt9156 += 12;
         }

         this.aByteBuffer9158 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * 4);
         this.aByteBuffer9155 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * this.anInt9156);
         Class526_Sub15[] var18 = new Class526_Sub15[this.anInt9119];
         var3 = Class568.method6836(this.anInt9119 / 4, 807881352);
         if(var3 < 1) {
            var3 = 1;
         }

         Class20 var4 = new Class20(var3);
         Class526_Sub15[] var5 = new Class526_Sub15[this.anInt9146];

         int var6;
         int var7;
         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               this.method8443(var6, var7, var1, var5, var4, var18);
            }
         }

         Class526_Sub15 var19;
         for(var6 = 0; var6 < this.anInt9126; ++var6) {
            var19 = var18[var6];
            if(var19 != null) {
               var19.method9374(var6);
            }
         }

         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               short[] var8 = this.aShortArrayArray9128[var7 * this.anInt1711 * 1966165105 + var6];
               if(var8 != null) {
                  int var9 = 0;

                  for(int var10 = 0; var10 < var8.length; ++var9) {
                     int var11 = var8[var10++] & '\uffff';
                     int var12 = var8[var10++] & '\uffff';
                     int var13 = var8[var10++] & '\uffff';
                     Class526_Sub15 var14 = var18[var11];
                     Class526_Sub15 var15 = var18[var12];
                     Class526_Sub15 var16 = var18[var13];
                     Class526_Sub15 var17 = null;
                     if(var14 != null) {
                        var14.method9375(var6, var7, var9);
                        var17 = var14;
                     }

                     if(var15 != null) {
                        var15.method9375(var6, var7, var9);
                        if(var17 == null || var15.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var15;
                        }
                     }

                     if(var16 != null) {
                        var16.method9375(var6, var7, var9);
                        if(var17 == null || var16.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var16;
                        }
                     }

                     if(var17 != null) {
                        if(var14 != null) {
                           var17.method9374(var11);
                        }

                        if(var15 != null) {
                           var17.method9374(var12);
                        }

                        if(var16 != null) {
                           var17.method9374(var13);
                        }

                        var17.method9375(var6, var7, var9);
                     }
                  }
               }
            }
         }

         this.anInt9153 = 0;

         for(var6 = 0; var6 < this.aClass526Array9152.length; ++var6) {
            var19 = (Class526_Sub15)this.aClass526Array9152[var6];
            if(var19.anInt10462 > 0) {
               this.aClass526Array9152[this.anInt9153++] = var19;
            }
         }

         this.aClass526Array9141 = new Class526[this.anInt9153];
         long[] var21 = new long[this.anInt9153];

         for(var7 = 0; var7 < this.anInt9153; ++var7) {
            Class526_Sub15 var20 = (Class526_Sub15)this.aClass526Array9152[var7];
            var21[var7] = var20.aLong7156 * -6805155999452426801L;
            this.aClass526Array9141[var7] = var20;
         }

         Class361_Sub1.method9240(var21, this.aClass526Array9141, (byte)-36);
         this.method8439();
      }
   }

   public boolean method1711(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         return this.aClass349_9139.method4531(var1, var7, var8);
      } else {
         return false;
      }
   }

   void method8435(Class526_Sub21_Sub5_Sub1 var1, int var2, int var3) {
      int[] var4 = this.anIntArrayArrayArray9134[var2][var3];
      int[] var5 = this.anIntArrayArrayArray9142[var2][var3];
      int var6 = var4.length;
      if(this.anIntArray9157.length < var6) {
         this.anIntArray9157 = new int[var6];
         this.anIntArray9159 = new int[var6];
      }

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         this.anIntArray9157[var7] = var4[var7] >> this.aClass174_Sub3_9121.anInt9710;
         this.anIntArray9159[var7] = var5[var7] >> this.aClass174_Sub3_9121.anInt9710;
      }

      var7 = 0;

      while(var7 < var6) {
         int var8 = this.anIntArray9157[var7];
         int var9 = this.anIntArray9159[var7++];
         int var10 = this.anIntArray9157[var7];
         int var11 = this.anIntArray9159[var7++];
         int var12 = this.anIntArray9157[var7];
         int var13 = this.anIntArray9159[var7++];
         if((var8 - var10) * (var11 - var13) - (var11 - var9) * (var12 - var10) > 0) {
            var1.method10878(var9, var11, var13, var8, var10, var12);
         }
      }

   }

   public void method1738(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = new int[var16 * 3];
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = var4 != null?new int[var16 * 3]:null;
      int[] var24 = var6 != null?new int[var16 * 3]:null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = var7[var26];
         int var28 = var8[var26];
         int var29 = var9[var26];
         var17[var25] = var3[var27];
         var18[var25] = var5[var27];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var27];
         }

         if(var6 != null) {
            var24[var25] = var6[var27];
         }

         ++var25;
         var17[var25] = var3[var28];
         var18[var25] = var5[var28];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var28];
         }

         if(var6 != null) {
            var24[var25] = var6[var28];
         }

         ++var25;
         var17[var25] = var3[var29];
         var18[var25] = var5[var29];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var29];
         }

         if(var6 != null) {
            var24[var25] = var6[var29];
         }

         ++var25;
      }

      this.method1699(var1, var2, var17, var23, var18, var24, var19, var20, var21, var22, var14, var15);
   }

   public void method1742(Class526_Sub16 var1, int[] var2) {
      this.aClass702_9144.method8176(new Class526_Sub19(this.aClass174_Sub3_9121, this, var1, var2), -1962151419);
   }

   public void method1698(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass526Array9141 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.anIntArray9160.length < var7) {
            this.anIntArray9160 = new int[var7];
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if(var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if(var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if(var12 > this.anInt1711 * 1966165105 - 1) {
            var12 = this.anInt1711 * 1966165105 - 1;
         }

         int var13 = var2 + var3;
         if(var13 > this.anInt1713 * -810756899 - 1) {
            var13 = this.anInt1713 * -810756899 - 1;
         }

         this.anInt9135 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if(var15[var16 - var11]) {
                  this.anIntArray9160[this.anInt9135++] = var16 * this.anInt1711 * 1966165105 + var14;
               }
            }
         }

         ByteBuffer var24 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var24.clear();

         int var25;
         for(var25 = 0; var25 < this.aClass526Array9141.length; ++var25) {
            Class526_Sub15 var26 = (Class526_Sub15)this.aClass526Array9141[var25];
            var26.method9378(this.anIntArray9160, this.anInt9135);
         }

         var25 = var24.position();
         Class318 var27 = this.aClass174_Sub3_9121.aClass318_9762;
         this.aClass174_Sub3_9121.method8829();
         if(this.aClass174_Sub3_9121.anInt9675 > 0) {
            var27.aClass446_3432.method5266((float)(this.aClass174_Sub3_9121.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 0 & 255) / 255.0F);
            var27.aClass444_3411.method5202(0.0F, 0.0F, 1.0F, -this.aClass174_Sub3_9121.aFloat9810);
            var27.aClass444_3411.method5207(this.aClass174_Sub3_9121.aClass433_9700);
            var27.aClass444_3411.method5206(1.0F / (this.aClass174_Sub3_9121.aFloat9677 - this.aClass174_Sub3_9121.aFloat9810));
         } else {
            var27.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
         }

         if(var25 != 0) {
            Interface42 var17 = this.aClass174_Sub3_9121.method8746(var25 / 2);
            var17.method235(0, var25, this.aClass174_Sub3_9121.aLong9685);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8769(var17);
            var27.method4105(Class433.aClass433_4840);
            int var18;
            int var19;
            Class526_Sub15 var20;
            Class171 var22;
            if((this.anInt9125 & 7) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 != 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        var27.aClass444_3421.method5202(0.0F, 1.0F, 0.0F, (float)this.aClass174_Sub3_9121.anInt9803 + (float)(var20.aClass172_10460.anInt2018 * 1590947963) / 255.0F * (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass444_3421.method5206(1.0F / (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     boolean var33 = false;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)31);
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var33 = !Class16.method621(var22.aByte1966, 1888315090);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     var27.method4120(var33);
                     var18 += var20.anInt10458;
                  }
               }
            } else {
               var27.aClass446_3425.method5266(this.aClass174_Sub3_9121.aFloatArray9777[0], this.aClass174_Sub3_9121.aFloatArray9777[1], this.aClass174_Sub3_9121.aFloatArray9777[2]);
               var27.aClass446_3426.method5266(this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3428.method5266(-this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9708, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9771, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3433.method5266(this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9760);
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 > 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        float var21 = 0.15F;
                        var27.aClass444_3421.method5202(0.0F, 1.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21), 0.0F, 256.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     byte var32 = 11;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-18);
                        var32 = var22.aByte1966;
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var27.method4117(var22.aByte1970);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     switch(var32) {
                     case 1:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4111();
                        } else {
                           var27.method4116(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if(!this.aClass174_Sub3_9121.aBool9761 && (this.anInt9125 & 8) != 0 && this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792.method10545(-993726691)) {
                           Class351_Sub1_Sub2 var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792;
                           if(var32 == 2) {
                              var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9791;
                           }

                           var34.aClass433_11565.method5083(this.aClass174_Sub3_9121.aClass433_9720);
                           var34.aClass433_11567.method5141(1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F, 1.0F);
                           var34.aClass446_11569.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                           Class171 var23 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)14);
                           var34.anInt11570 = var23.aByte1970 * 961023603;
                           var34.anInt11590 = var20.anInt10461 * -1556650397;
                           var34.anInt11586 = (var20.anInt10466 - var20.anInt10461 + 1) * -737570061;
                           var34.anInt11582 = var18 * -1598793771;
                           var34.anInt11584 = var20.anInt10458 / 3 * 1520663561;
                           var34.aClass444_11578.method5203(var27.aClass444_3421);
                           var34.aClass446_11562.method5267(var27.aClass446_3422);
                           var34.aClass444_11580.method5203(var27.aClass444_3411);
                           var34.aClass446_11574.method5267(var27.aClass446_3432);
                           var34.method10547(-1450399027);
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4110();
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 6:
                        var27.method4120(!Class16.method621(var32, 1857198059));
                        break;
                     case 7:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        var27.aClass433_3429.method5104();
                        var27.anInterface44_3431 = this.aClass174_Sub3_9121.method8751();
                        var27.method4109(0);
                     }

                     var18 += var20.anInt10458;
                  }
               }
            }
         }

         if(!this.aClass702_9144.method8209(1963092618)) {
            this.aClass174_Sub3_9121.method8807(128);
            this.aClass174_Sub3_9121.method8782(false);
            Class446 var28 = new Class446(var27.aClass446_3432);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            Iterator var30 = this.aClass702_9144.iterator();

            while(var30.hasNext()) {
               Class526_Sub19 var31 = (Class526_Sub19)var30.next();
               var31.method9434(var27, var1, var2, var3, var4, var5);
            }

            var27.aClass446_3432.method5267(var28);
         }

         if(this.aClass349_9139 != null) {
            this.aClass174_Sub3_9121.method8807(1);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            Class433 var29 = this.aClass174_Sub3_9121.aClass433_9705;
            var29.method5104();
            var29.aFloatArray4841[13] = -1.0F;
            var27.method4105(var29);
            this.aClass349_9139.method4538(var27, var1, var2, var3, var4, var5);
         }
      }

   }

   public void method1715(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9147.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9147[var1].length - 1, Math.max(0, var2));
      if((this.aByteArrayArray9147[var1][var2] & 255) < var3) {
         this.aByteArrayArray9147[var1][var2] = (byte)var3;
      }

   }

   public void method1705() {
      if(this.anInt9119 <= 0) {
         this.aClass349_9139 = null;
         this.method8434();
      } else {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         int var3;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9147[var2 - 1][var3] >> 2) + (this.aByteArrayArray9147[var2 + 1][var3] >> 3) + (this.aByteArrayArray9147[var2][var3 - 1] >> 2) + (this.aByteArrayArray9147[var2][var3 + 1] >> 3) + (this.aByteArrayArray9147[var2][var3] >> 1));
            }
         }

         this.aClass526Array9152 = new Class526[this.aClass20_9151.method636(539440085)];
         this.aClass20_9151.method641(this.aClass526Array9152, (byte)33);

         for(var2 = 0; var2 < this.aClass526Array9152.length; ++var2) {
            ((Class526_Sub15)this.aClass526Array9152[var2]).method9381(this.anInt9119);
         }

         this.anInt9156 = 20;
         if(this.anIntArrayArrayArray9137 != null) {
            this.anInt9156 += 4;
         }

         if((this.anInt9125 & 7) != 0) {
            this.anInt9156 += 12;
         }

         this.aByteBuffer9158 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * 4);
         this.aByteBuffer9155 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * this.anInt9156);
         Class526_Sub15[] var18 = new Class526_Sub15[this.anInt9119];
         var3 = Class568.method6836(this.anInt9119 / 4, 1843829782);
         if(var3 < 1) {
            var3 = 1;
         }

         Class20 var4 = new Class20(var3);
         Class526_Sub15[] var5 = new Class526_Sub15[this.anInt9146];

         int var6;
         int var7;
         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               this.method8443(var6, var7, var1, var5, var4, var18);
            }
         }

         Class526_Sub15 var19;
         for(var6 = 0; var6 < this.anInt9126; ++var6) {
            var19 = var18[var6];
            if(var19 != null) {
               var19.method9374(var6);
            }
         }

         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               short[] var8 = this.aShortArrayArray9128[var7 * this.anInt1711 * 1966165105 + var6];
               if(var8 != null) {
                  int var9 = 0;

                  for(int var10 = 0; var10 < var8.length; ++var9) {
                     int var11 = var8[var10++] & '\uffff';
                     int var12 = var8[var10++] & '\uffff';
                     int var13 = var8[var10++] & '\uffff';
                     Class526_Sub15 var14 = var18[var11];
                     Class526_Sub15 var15 = var18[var12];
                     Class526_Sub15 var16 = var18[var13];
                     Class526_Sub15 var17 = null;
                     if(var14 != null) {
                        var14.method9375(var6, var7, var9);
                        var17 = var14;
                     }

                     if(var15 != null) {
                        var15.method9375(var6, var7, var9);
                        if(var17 == null || var15.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var15;
                        }
                     }

                     if(var16 != null) {
                        var16.method9375(var6, var7, var9);
                        if(var17 == null || var16.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var16;
                        }
                     }

                     if(var17 != null) {
                        if(var14 != null) {
                           var17.method9374(var11);
                        }

                        if(var15 != null) {
                           var17.method9374(var12);
                        }

                        if(var16 != null) {
                           var17.method9374(var13);
                        }

                        var17.method9375(var6, var7, var9);
                     }
                  }
               }
            }
         }

         this.anInt9153 = 0;

         for(var6 = 0; var6 < this.aClass526Array9152.length; ++var6) {
            var19 = (Class526_Sub15)this.aClass526Array9152[var6];
            if(var19.anInt10462 > 0) {
               this.aClass526Array9152[this.anInt9153++] = var19;
            }
         }

         this.aClass526Array9141 = new Class526[this.anInt9153];
         long[] var21 = new long[this.anInt9153];

         for(var7 = 0; var7 < this.anInt9153; ++var7) {
            Class526_Sub15 var20 = (Class526_Sub15)this.aClass526Array9152[var7];
            var21[var7] = var20.aLong7156 * -6805155999452426801L;
            this.aClass526Array9141[var7] = var20;
         }

         Class361_Sub1.method9240(var21, this.aClass526Array9141, (byte)-12);
         this.method8439();
      }
   }

   Class148_Sub2(Class174_Sub3 var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.aClass174_Sub3_9121 = var1;
      this.anInt9122 = this.anInt1710 * -586661047 - 2;
      this.anInt9123 = 1 << this.anInt9122;
      this.anInt9124 = var2;
      this.anInt9125 = var3;
      this.anIntArrayArrayArray9136 = new int[var4][var5][];
      this.aClass526_Sub15ArrayArrayArray9131 = new Class526_Sub15[var4][var5][];
      this.anIntArrayArrayArray9134 = new int[var4][var5][];
      this.anIntArrayArrayArray9142 = new int[var4][var5][];
      this.anIntArrayArrayArray9132 = new int[var4][var5][];
      this.anIntArrayArrayArray9133 = new int[var4][var5][];
      this.aShortArrayArray9128 = new short[var4 * var5][];
      this.aByteArrayArray9140 = new byte[var4][var5];
      this.aByteArrayArray9147 = new byte[var4 + 1][var5 + 1];
      this.aFloatArrayArray9148 = new float[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];
      this.aFloatArrayArray9138 = new float[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];
      this.aFloatArrayArray9150 = new float[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

      for(int var9 = 0; var9 <= this.anInt1713 * -810756899; ++var9) {
         for(int var10 = 0; var10 <= this.anInt1711 * 1966165105; ++var10) {
            int var11 = this.anIntArrayArray1714[var10][var9];
            if((float)var11 < this.aFloat9129) {
               this.aFloat9129 = (float)var11;
            }

            if((float)var11 > this.aFloat9145) {
               this.aFloat9145 = (float)var11;
            }

            if(var10 > 0 && var9 > 0 && var10 < this.anInt1711 * 1966165105 && var9 < this.anInt1713 * -810756899) {
               int var12 = var7[var10 + 1][var9] - var7[var10 - 1][var9];
               int var13 = var7[var10][var9 + 1] - var7[var10][var9 - 1];
               float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 4 * var8 * var8 + var13 * var13)));
               this.aFloatArrayArray9148[var10][var9] = (float)var12 * var14;
               this.aFloatArrayArray9138[var10][var9] = (float)(-var8 * 2) * var14;
               this.aFloatArrayArray9150[var10][var9] = (float)var13 * var14;
            }
         }
      }

      --this.aFloat9129;
      ++this.aFloat9145;
      this.aClass20_9151 = new Class20(128);
      if((this.anInt9125 & 16) != 0) {
         this.aClass349_9139 = new Class349(this.aClass174_Sub3_9121, this);
      }

   }

   public void method1717(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub3_9121.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9137 == null) {
         this.anIntArrayArrayArray9137 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9136 == null) {
         this.anIntArrayArrayArray9136 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9134[var1][var2] = var3;
      this.anIntArrayArrayArray9142[var1][var2] = var5;
      this.anIntArrayArrayArray9132[var1][var2] = var7;
      this.anIntArrayArrayArray9133[var1][var2] = var8;
      if(this.anIntArrayArrayArray9137 != null) {
         this.anIntArrayArrayArray9137[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9136 != null) {
         this.anIntArrayArrayArray9136[var1][var2] = var4;
      }

      Class526_Sub15[] var14 = this.aClass526_Sub15ArrayArrayArray9131[var1][var2] = new Class526_Sub15[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9125 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)-13).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9151.get(var18); var20 != null; var20 = this.aClass20_9151.method635(-1734407897)) {
            Class526_Sub15 var21 = (Class526_Sub15)var20;
            if(var21.anInt10456 == var16 && var21.aFloat10459 == (float)var17 && var21.aClass172_10460.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub15(this, var16, var17, var11);
            this.aClass20_9151.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub15)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9140[var1][var2] = (byte)(this.aByteArrayArray9140[var1][var2] | 1);
      }

      if(var7.length > this.anInt9146) {
         this.anInt9146 = var7.length;
      }

      this.anInt9119 += var7.length;
   }

   public void method1723(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub3_9121.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9137 == null) {
         this.anIntArrayArrayArray9137 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9136 == null) {
         this.anIntArrayArrayArray9136 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9134[var1][var2] = var3;
      this.anIntArrayArrayArray9142[var1][var2] = var5;
      this.anIntArrayArrayArray9132[var1][var2] = var7;
      this.anIntArrayArrayArray9133[var1][var2] = var8;
      if(this.anIntArrayArrayArray9137 != null) {
         this.anIntArrayArrayArray9137[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9136 != null) {
         this.anIntArrayArrayArray9136[var1][var2] = var4;
      }

      Class526_Sub15[] var14 = this.aClass526_Sub15ArrayArrayArray9131[var1][var2] = new Class526_Sub15[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9125 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)25).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9151.get(var18); var20 != null; var20 = this.aClass20_9151.method635(-1734407897)) {
            Class526_Sub15 var21 = (Class526_Sub15)var20;
            if(var21.anInt10456 == var16 && var21.aFloat10459 == (float)var17 && var21.aClass172_10460.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub15(this, var16, var17, var11);
            this.aClass20_9151.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub15)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9140[var1][var2] = (byte)(this.aByteArrayArray9140[var1][var2] | 1);
      }

      if(var7.length > this.anInt9146) {
         this.anInt9146 = var7.length;
      }

      this.anInt9119 += var7.length;
   }

   public void method1720() {
      if(this.anInt9119 <= 0) {
         this.aClass349_9139 = null;
         this.method8434();
      } else {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         int var3;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9147[var2 - 1][var3] >> 2) + (this.aByteArrayArray9147[var2 + 1][var3] >> 3) + (this.aByteArrayArray9147[var2][var3 - 1] >> 2) + (this.aByteArrayArray9147[var2][var3 + 1] >> 3) + (this.aByteArrayArray9147[var2][var3] >> 1));
            }
         }

         this.aClass526Array9152 = new Class526[this.aClass20_9151.method636(-2099865929)];
         this.aClass20_9151.method641(this.aClass526Array9152, (byte)-38);

         for(var2 = 0; var2 < this.aClass526Array9152.length; ++var2) {
            ((Class526_Sub15)this.aClass526Array9152[var2]).method9381(this.anInt9119);
         }

         this.anInt9156 = 20;
         if(this.anIntArrayArrayArray9137 != null) {
            this.anInt9156 += 4;
         }

         if((this.anInt9125 & 7) != 0) {
            this.anInt9156 += 12;
         }

         this.aByteBuffer9158 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * 4);
         this.aByteBuffer9155 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * this.anInt9156);
         Class526_Sub15[] var18 = new Class526_Sub15[this.anInt9119];
         var3 = Class568.method6836(this.anInt9119 / 4, 1967483300);
         if(var3 < 1) {
            var3 = 1;
         }

         Class20 var4 = new Class20(var3);
         Class526_Sub15[] var5 = new Class526_Sub15[this.anInt9146];

         int var6;
         int var7;
         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               this.method8443(var6, var7, var1, var5, var4, var18);
            }
         }

         Class526_Sub15 var19;
         for(var6 = 0; var6 < this.anInt9126; ++var6) {
            var19 = var18[var6];
            if(var19 != null) {
               var19.method9374(var6);
            }
         }

         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               short[] var8 = this.aShortArrayArray9128[var7 * this.anInt1711 * 1966165105 + var6];
               if(var8 != null) {
                  int var9 = 0;

                  for(int var10 = 0; var10 < var8.length; ++var9) {
                     int var11 = var8[var10++] & '\uffff';
                     int var12 = var8[var10++] & '\uffff';
                     int var13 = var8[var10++] & '\uffff';
                     Class526_Sub15 var14 = var18[var11];
                     Class526_Sub15 var15 = var18[var12];
                     Class526_Sub15 var16 = var18[var13];
                     Class526_Sub15 var17 = null;
                     if(var14 != null) {
                        var14.method9375(var6, var7, var9);
                        var17 = var14;
                     }

                     if(var15 != null) {
                        var15.method9375(var6, var7, var9);
                        if(var17 == null || var15.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var15;
                        }
                     }

                     if(var16 != null) {
                        var16.method9375(var6, var7, var9);
                        if(var17 == null || var16.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var16;
                        }
                     }

                     if(var17 != null) {
                        if(var14 != null) {
                           var17.method9374(var11);
                        }

                        if(var15 != null) {
                           var17.method9374(var12);
                        }

                        if(var16 != null) {
                           var17.method9374(var13);
                        }

                        var17.method9375(var6, var7, var9);
                     }
                  }
               }
            }
         }

         this.anInt9153 = 0;

         for(var6 = 0; var6 < this.aClass526Array9152.length; ++var6) {
            var19 = (Class526_Sub15)this.aClass526Array9152[var6];
            if(var19.anInt10462 > 0) {
               this.aClass526Array9152[this.anInt9153++] = var19;
            }
         }

         this.aClass526Array9141 = new Class526[this.anInt9153];
         long[] var21 = new long[this.anInt9153];

         for(var7 = 0; var7 < this.anInt9153; ++var7) {
            Class526_Sub15 var20 = (Class526_Sub15)this.aClass526Array9152[var7];
            var21[var7] = var20.aLong7156 * -6805155999452426801L;
            this.aClass526Array9141[var7] = var20;
         }

         Class361_Sub1.method9240(var21, this.aClass526Array9141, (byte)-6);
         this.method8439();
      }
   }

   public void method1718() {
      if(this.anInt9119 <= 0) {
         this.aClass349_9139 = null;
         this.method8434();
      } else {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         int var3;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9147[var2 - 1][var3] >> 2) + (this.aByteArrayArray9147[var2 + 1][var3] >> 3) + (this.aByteArrayArray9147[var2][var3 - 1] >> 2) + (this.aByteArrayArray9147[var2][var3 + 1] >> 3) + (this.aByteArrayArray9147[var2][var3] >> 1));
            }
         }

         this.aClass526Array9152 = new Class526[this.aClass20_9151.method636(-1171017186)];
         this.aClass20_9151.method641(this.aClass526Array9152, (byte)13);

         for(var2 = 0; var2 < this.aClass526Array9152.length; ++var2) {
            ((Class526_Sub15)this.aClass526Array9152[var2]).method9381(this.anInt9119);
         }

         this.anInt9156 = 20;
         if(this.anIntArrayArrayArray9137 != null) {
            this.anInt9156 += 4;
         }

         if((this.anInt9125 & 7) != 0) {
            this.anInt9156 += 12;
         }

         this.aByteBuffer9158 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * 4);
         this.aByteBuffer9155 = this.aClass174_Sub3_9121.method8723(this.anInt9119 * this.anInt9156);
         Class526_Sub15[] var18 = new Class526_Sub15[this.anInt9119];
         var3 = Class568.method6836(this.anInt9119 / 4, 1584098327);
         if(var3 < 1) {
            var3 = 1;
         }

         Class20 var4 = new Class20(var3);
         Class526_Sub15[] var5 = new Class526_Sub15[this.anInt9146];

         int var6;
         int var7;
         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               this.method8443(var6, var7, var1, var5, var4, var18);
            }
         }

         Class526_Sub15 var19;
         for(var6 = 0; var6 < this.anInt9126; ++var6) {
            var19 = var18[var6];
            if(var19 != null) {
               var19.method9374(var6);
            }
         }

         for(var6 = 0; var6 < this.anInt1711 * 1966165105; ++var6) {
            for(var7 = 0; var7 < this.anInt1713 * -810756899; ++var7) {
               short[] var8 = this.aShortArrayArray9128[var7 * this.anInt1711 * 1966165105 + var6];
               if(var8 != null) {
                  int var9 = 0;

                  for(int var10 = 0; var10 < var8.length; ++var9) {
                     int var11 = var8[var10++] & '\uffff';
                     int var12 = var8[var10++] & '\uffff';
                     int var13 = var8[var10++] & '\uffff';
                     Class526_Sub15 var14 = var18[var11];
                     Class526_Sub15 var15 = var18[var12];
                     Class526_Sub15 var16 = var18[var13];
                     Class526_Sub15 var17 = null;
                     if(var14 != null) {
                        var14.method9375(var6, var7, var9);
                        var17 = var14;
                     }

                     if(var15 != null) {
                        var15.method9375(var6, var7, var9);
                        if(var17 == null || var15.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var15;
                        }
                     }

                     if(var16 != null) {
                        var16.method9375(var6, var7, var9);
                        if(var17 == null || var16.aLong7156 * -6805155999452426801L < var17.aLong7156 * -6805155999452426801L) {
                           var17 = var16;
                        }
                     }

                     if(var17 != null) {
                        if(var14 != null) {
                           var17.method9374(var11);
                        }

                        if(var15 != null) {
                           var17.method9374(var12);
                        }

                        if(var16 != null) {
                           var17.method9374(var13);
                        }

                        var17.method9375(var6, var7, var9);
                     }
                  }
               }
            }
         }

         this.anInt9153 = 0;

         for(var6 = 0; var6 < this.aClass526Array9152.length; ++var6) {
            var19 = (Class526_Sub15)this.aClass526Array9152[var6];
            if(var19.anInt10462 > 0) {
               this.aClass526Array9152[this.anInt9153++] = var19;
            }
         }

         this.aClass526Array9141 = new Class526[this.anInt9153];
         long[] var21 = new long[this.anInt9153];

         for(var7 = 0; var7 < this.anInt9153; ++var7) {
            Class526_Sub15 var20 = (Class526_Sub15)this.aClass526Array9152[var7];
            var21[var7] = var20.aLong7156 * -6805155999452426801L;
            this.aClass526Array9141[var7] = var20;
         }

         Class361_Sub1.method9240(var21, this.aClass526Array9141, (byte)-33);
         this.method8439();
      }
   }

   public void method1725(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass526Array9141 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.anIntArray9160.length < var7) {
            this.anIntArray9160 = new int[var7];
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if(var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if(var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if(var12 > this.anInt1711 * 1966165105 - 1) {
            var12 = this.anInt1711 * 1966165105 - 1;
         }

         int var13 = var2 + var3;
         if(var13 > this.anInt1713 * -810756899 - 1) {
            var13 = this.anInt1713 * -810756899 - 1;
         }

         this.anInt9135 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if(var15[var16 - var11]) {
                  this.anIntArray9160[this.anInt9135++] = var16 * this.anInt1711 * 1966165105 + var14;
               }
            }
         }

         ByteBuffer var24 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var24.clear();

         int var25;
         for(var25 = 0; var25 < this.aClass526Array9141.length; ++var25) {
            Class526_Sub15 var26 = (Class526_Sub15)this.aClass526Array9141[var25];
            var26.method9378(this.anIntArray9160, this.anInt9135);
         }

         var25 = var24.position();
         Class318 var27 = this.aClass174_Sub3_9121.aClass318_9762;
         this.aClass174_Sub3_9121.method8829();
         if(this.aClass174_Sub3_9121.anInt9675 > 0) {
            var27.aClass446_3432.method5266((float)(this.aClass174_Sub3_9121.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 0 & 255) / 255.0F);
            var27.aClass444_3411.method5202(0.0F, 0.0F, 1.0F, -this.aClass174_Sub3_9121.aFloat9810);
            var27.aClass444_3411.method5207(this.aClass174_Sub3_9121.aClass433_9700);
            var27.aClass444_3411.method5206(1.0F / (this.aClass174_Sub3_9121.aFloat9677 - this.aClass174_Sub3_9121.aFloat9810));
         } else {
            var27.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
         }

         if(var25 != 0) {
            Interface42 var17 = this.aClass174_Sub3_9121.method8746(var25 / 2);
            var17.method235(0, var25, this.aClass174_Sub3_9121.aLong9685);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8769(var17);
            var27.method4105(Class433.aClass433_4840);
            int var18;
            int var19;
            Class526_Sub15 var20;
            Class171 var22;
            if((this.anInt9125 & 7) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 != 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        var27.aClass444_3421.method5202(0.0F, 1.0F, 0.0F, (float)this.aClass174_Sub3_9121.anInt9803 + (float)(var20.aClass172_10460.anInt2018 * 1590947963) / 255.0F * (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass444_3421.method5206(1.0F / (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     boolean var33 = false;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)2);
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var33 = !Class16.method621(var22.aByte1966, 1917244629);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     var27.method4120(var33);
                     var18 += var20.anInt10458;
                  }
               }
            } else {
               var27.aClass446_3425.method5266(this.aClass174_Sub3_9121.aFloatArray9777[0], this.aClass174_Sub3_9121.aFloatArray9777[1], this.aClass174_Sub3_9121.aFloatArray9777[2]);
               var27.aClass446_3426.method5266(this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3428.method5266(-this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9708, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9771, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3433.method5266(this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9760);
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 > 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        float var21 = 0.15F;
                        var27.aClass444_3421.method5202(0.0F, 1.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21), 0.0F, 256.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     byte var32 = 11;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-13);
                        var32 = var22.aByte1966;
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var27.method4117(var22.aByte1970);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     switch(var32) {
                     case 1:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4111();
                        } else {
                           var27.method4116(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if(!this.aClass174_Sub3_9121.aBool9761 && (this.anInt9125 & 8) != 0 && this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792.method10545(-1806127893)) {
                           Class351_Sub1_Sub2 var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792;
                           if(var32 == 2) {
                              var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9791;
                           }

                           var34.aClass433_11565.method5083(this.aClass174_Sub3_9121.aClass433_9720);
                           var34.aClass433_11567.method5141(1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F, 1.0F);
                           var34.aClass446_11569.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                           Class171 var23 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)3);
                           var34.anInt11570 = var23.aByte1970 * 961023603;
                           var34.anInt11590 = var20.anInt10461 * -1556650397;
                           var34.anInt11586 = (var20.anInt10466 - var20.anInt10461 + 1) * -737570061;
                           var34.anInt11582 = var18 * -1598793771;
                           var34.anInt11584 = var20.anInt10458 / 3 * 1520663561;
                           var34.aClass444_11578.method5203(var27.aClass444_3421);
                           var34.aClass446_11562.method5267(var27.aClass446_3422);
                           var34.aClass444_11580.method5203(var27.aClass444_3411);
                           var34.aClass446_11574.method5267(var27.aClass446_3432);
                           var34.method10547(-1450399027);
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4110();
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 6:
                        var27.method4120(!Class16.method621(var32, 1933884750));
                        break;
                     case 7:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        var27.aClass433_3429.method5104();
                        var27.anInterface44_3431 = this.aClass174_Sub3_9121.method8751();
                        var27.method4109(0);
                     }

                     var18 += var20.anInt10458;
                  }
               }
            }
         }

         if(!this.aClass702_9144.method8209(332990019)) {
            this.aClass174_Sub3_9121.method8807(128);
            this.aClass174_Sub3_9121.method8782(false);
            Class446 var28 = new Class446(var27.aClass446_3432);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            Iterator var30 = this.aClass702_9144.iterator();

            while(var30.hasNext()) {
               Class526_Sub19 var31 = (Class526_Sub19)var30.next();
               var31.method9434(var27, var1, var2, var3, var4, var5);
            }

            var27.aClass446_3432.method5267(var28);
         }

         if(this.aClass349_9139 != null) {
            this.aClass174_Sub3_9121.method8807(1);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            Class433 var29 = this.aClass174_Sub3_9121.aClass433_9705;
            var29.method5104();
            var29.aFloatArray4841[13] = -1.0F;
            var27.method4105(var29);
            this.aClass349_9139.method4538(var27, var1, var2, var3, var4, var5);
         }
      }

   }

   void method8436() {
      this.anInterface35_9143 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9143.method249(this.anInt9126 * 4, 4);
      this.anInterface35_9143.method235(0, this.anInt9126 * 4, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9158));
      this.anInterface35_9120 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9120.method249(this.anInt9126 * this.anInt9156, this.anInt9156);
      this.anInterface35_9120.method235(0, this.anInt9126 * this.anInt9156, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9155));
      this.aByteBuffer9158.clear();
      this.aByteBuffer9158 = null;
      this.aByteBuffer9155.clear();
      this.aByteBuffer9155 = null;
      if((this.anInt9125 & 7) != 0) {
         if(this.anIntArrayArrayArray9137 != null) {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         } else {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         }
      } else if(this.anIntArrayArrayArray9137 != null) {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672}), new Class359(Class353.aClass353_3679)});
      } else {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683}), new Class359(Class353.aClass353_3679)});
      }

      for(int var1 = 0; var1 < this.anInt9153; ++var1) {
         Class526_Sub15 var2 = (Class526_Sub15)this.aClass526Array9152[var1];
         var2.method9377(this.anInt9126);
      }

      if(this.aClass349_9139 != null) {
         this.aClass349_9139.method4528();
      }

      this.method8434();
   }

   public void method1722(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass526Array9141 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.anIntArray9160.length < var7) {
            this.anIntArray9160 = new int[var7];
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if(var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if(var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if(var12 > this.anInt1711 * 1966165105 - 1) {
            var12 = this.anInt1711 * 1966165105 - 1;
         }

         int var13 = var2 + var3;
         if(var13 > this.anInt1713 * -810756899 - 1) {
            var13 = this.anInt1713 * -810756899 - 1;
         }

         this.anInt9135 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if(var15[var16 - var11]) {
                  this.anIntArray9160[this.anInt9135++] = var16 * this.anInt1711 * 1966165105 + var14;
               }
            }
         }

         ByteBuffer var24 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var24.clear();

         int var25;
         for(var25 = 0; var25 < this.aClass526Array9141.length; ++var25) {
            Class526_Sub15 var26 = (Class526_Sub15)this.aClass526Array9141[var25];
            var26.method9378(this.anIntArray9160, this.anInt9135);
         }

         var25 = var24.position();
         Class318 var27 = this.aClass174_Sub3_9121.aClass318_9762;
         this.aClass174_Sub3_9121.method8829();
         if(this.aClass174_Sub3_9121.anInt9675 > 0) {
            var27.aClass446_3432.method5266((float)(this.aClass174_Sub3_9121.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 0 & 255) / 255.0F);
            var27.aClass444_3411.method5202(0.0F, 0.0F, 1.0F, -this.aClass174_Sub3_9121.aFloat9810);
            var27.aClass444_3411.method5207(this.aClass174_Sub3_9121.aClass433_9700);
            var27.aClass444_3411.method5206(1.0F / (this.aClass174_Sub3_9121.aFloat9677 - this.aClass174_Sub3_9121.aFloat9810));
         } else {
            var27.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
         }

         if(var25 != 0) {
            Interface42 var17 = this.aClass174_Sub3_9121.method8746(var25 / 2);
            var17.method235(0, var25, this.aClass174_Sub3_9121.aLong9685);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8769(var17);
            var27.method4105(Class433.aClass433_4840);
            int var18;
            int var19;
            Class526_Sub15 var20;
            Class171 var22;
            if((this.anInt9125 & 7) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 != 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        var27.aClass444_3421.method5202(0.0F, 1.0F, 0.0F, (float)this.aClass174_Sub3_9121.anInt9803 + (float)(var20.aClass172_10460.anInt2018 * 1590947963) / 255.0F * (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass444_3421.method5206(1.0F / (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     boolean var33 = false;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-91);
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var33 = !Class16.method621(var22.aByte1966, 1936275631);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     var27.method4120(var33);
                     var18 += var20.anInt10458;
                  }
               }
            } else {
               var27.aClass446_3425.method5266(this.aClass174_Sub3_9121.aFloatArray9777[0], this.aClass174_Sub3_9121.aFloatArray9777[1], this.aClass174_Sub3_9121.aFloatArray9777[2]);
               var27.aClass446_3426.method5266(this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3428.method5266(-this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9708, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9771, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3433.method5266(this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9760);
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 > 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        float var21 = 0.15F;
                        var27.aClass444_3421.method5202(0.0F, 1.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21), 0.0F, 256.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     byte var32 = 11;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)0);
                        var32 = var22.aByte1966;
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var27.method4117(var22.aByte1970);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     switch(var32) {
                     case 1:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4111();
                        } else {
                           var27.method4116(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if(!this.aClass174_Sub3_9121.aBool9761 && (this.anInt9125 & 8) != 0 && this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792.method10545(-889336587)) {
                           Class351_Sub1_Sub2 var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792;
                           if(var32 == 2) {
                              var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9791;
                           }

                           var34.aClass433_11565.method5083(this.aClass174_Sub3_9121.aClass433_9720);
                           var34.aClass433_11567.method5141(1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F, 1.0F);
                           var34.aClass446_11569.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                           Class171 var23 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-86);
                           var34.anInt11570 = var23.aByte1970 * 961023603;
                           var34.anInt11590 = var20.anInt10461 * -1556650397;
                           var34.anInt11586 = (var20.anInt10466 - var20.anInt10461 + 1) * -737570061;
                           var34.anInt11582 = var18 * -1598793771;
                           var34.anInt11584 = var20.anInt10458 / 3 * 1520663561;
                           var34.aClass444_11578.method5203(var27.aClass444_3421);
                           var34.aClass446_11562.method5267(var27.aClass446_3422);
                           var34.aClass444_11580.method5203(var27.aClass444_3411);
                           var34.aClass446_11574.method5267(var27.aClass446_3432);
                           var34.method10547(-1450399027);
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4110();
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 6:
                        var27.method4120(!Class16.method621(var32, 1956743655));
                        break;
                     case 7:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        var27.aClass433_3429.method5104();
                        var27.anInterface44_3431 = this.aClass174_Sub3_9121.method8751();
                        var27.method4109(0);
                     }

                     var18 += var20.anInt10458;
                  }
               }
            }
         }

         if(!this.aClass702_9144.method8209(-218300940)) {
            this.aClass174_Sub3_9121.method8807(128);
            this.aClass174_Sub3_9121.method8782(false);
            Class446 var28 = new Class446(var27.aClass446_3432);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            Iterator var30 = this.aClass702_9144.iterator();

            while(var30.hasNext()) {
               Class526_Sub19 var31 = (Class526_Sub19)var30.next();
               var31.method9434(var27, var1, var2, var3, var4, var5);
            }

            var27.aClass446_3432.method5267(var28);
         }

         if(this.aClass349_9139 != null) {
            this.aClass174_Sub3_9121.method8807(1);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            Class433 var29 = this.aClass174_Sub3_9121.aClass433_9705;
            var29.method5104();
            var29.aFloatArray4841[13] = -1.0F;
            var27.method4105(var29);
            this.aClass349_9139.method4538(var27, var1, var2, var3, var4, var5);
         }
      }

   }

   public void method1734(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9147.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9147[var1].length - 1, Math.max(0, var2));
      if((this.aByteArrayArray9147[var1][var2] & 255) < var3) {
         this.aByteArrayArray9147[var1][var2] = (byte)var3;
      }

   }

   public void method1713(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9147.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9147[var1].length - 1, Math.max(0, var2));
      if((this.aByteArrayArray9147[var1][var2] & 255) < var3) {
         this.aByteArrayArray9147[var1][var2] = (byte)var3;
      }

   }

   void method8437() {
      this.anInterface35_9143 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9143.method249(this.anInt9126 * 4, 4);
      this.anInterface35_9143.method235(0, this.anInt9126 * 4, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9158));
      this.anInterface35_9120 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9120.method249(this.anInt9126 * this.anInt9156, this.anInt9156);
      this.anInterface35_9120.method235(0, this.anInt9126 * this.anInt9156, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9155));
      this.aByteBuffer9158.clear();
      this.aByteBuffer9158 = null;
      this.aByteBuffer9155.clear();
      this.aByteBuffer9155 = null;
      if((this.anInt9125 & 7) != 0) {
         if(this.anIntArrayArrayArray9137 != null) {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         } else {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         }
      } else if(this.anIntArrayArrayArray9137 != null) {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672}), new Class359(Class353.aClass353_3679)});
      } else {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683}), new Class359(Class353.aClass353_3679)});
      }

      for(int var1 = 0; var1 < this.anInt9153; ++var1) {
         Class526_Sub15 var2 = (Class526_Sub15)this.aClass526Array9152[var1];
         var2.method9377(this.anInt9126);
      }

      if(this.aClass349_9139 != null) {
         this.aClass349_9139.method4528();
      }

      this.method8434();
   }

   void method8438() {
      if((this.anInt9124 & 2) == 0) {
         this.anIntArrayArrayArray9142 = (int[][][])null;
         this.anIntArrayArrayArray9134 = (int[][][])null;
         this.anIntArrayArrayArray9132 = (int[][][])null;
      }

      this.anIntArrayArrayArray9137 = (int[][][])null;
      this.anIntArrayArrayArray9133 = (int[][][])null;
      this.anIntArrayArrayArray9136 = (int[][][])null;
      this.aClass526_Sub15ArrayArrayArray9131 = (Class526_Sub15[][][])null;
      this.aByteArrayArray9147 = (byte[][])null;
      this.aClass20_9151 = null;
      this.aClass526Array9152 = null;
      this.aFloatArrayArray9150 = (float[][])null;
      this.aFloatArrayArray9138 = (float[][])null;
      this.aFloatArrayArray9148 = (float[][])null;
   }

   public void method1727(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      if(this.anInt9119 > 0) {
         Interface42 var9 = this.aClass174_Sub3_9121.method8746(this.anInt9154);
         int var10 = 0;
         int var11 = 32767;
         int var12 = -32768;
         ByteBuffer var13 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var13.clear();

         for(int var14 = var5; var14 < var7; ++var14) {
            int var15 = var14 * this.anInt1711 * 1966165105 + var4;

            for(int var16 = var4; var16 < var6; ++var16) {
               if(var8[var16 - var4][var14 - var5]) {
                  short[] var17 = this.aShortArrayArray9128[var15];
                  if(var17 != null) {
                     for(int var18 = 0; var18 < var17.length; ++var18) {
                        int var19 = var17[var18] & '\uffff';
                        if(var19 > var12) {
                           var12 = var19;
                        }

                        if(var19 < var11) {
                           var11 = var19;
                        }

                        var13.putShort((short)var19);
                        ++var10;
                     }
                  }
               }

               ++var15;
            }
         }

         var9.method235(0, var13.position(), this.aClass174_Sub3_9121.aLong9685);
         if(var10 > 0) {
            this.aClass174_Sub3_9121.method8829();
            Class318 var20 = this.aClass174_Sub3_9121.aClass318_9762;
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            this.aClass174_Sub3_9121.method8769(var9);
            this.aClass174_Sub3_9121.method2326(Class445.aClass445_4903);
            float var21 = (float)this.aClass174_Sub3_9121.method2247((byte)6).method2691();
            float var22 = (float)this.aClass174_Sub3_9121.method2247((byte)6).method2693();
            Class445 var23 = new Class445();
            Class445 var24 = new Class445();
            var23.method5250(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
            var24.method5256((float)var3 / (256.0F * (float)(this.anInt1712 * 1934131013)), (float)(-var3) / (256.0F * (float)(this.anInt1712 * 1934131013)), 1.0F / (this.aFloat9145 - this.aFloat9129));
            var24.method5251((float)var1 - (float)(var4 * var3) / 256.0F, (float)var2 + (float)(var7 * var3) / 256.0F, -this.aFloat9129 / (this.aFloat9145 - this.aFloat9129));
            var24.method5228(2.0F / var21, 2.0F / var22, 1.0F);
            var24.method5251(-1.0F, -1.0F, 0.0F);
            this.aClass174_Sub3_9121.aClass445_9704.method5232(var23, var24);
            this.aClass174_Sub3_9121.aClass433_9705.method5110(this.aClass174_Sub3_9121.aClass445_9704);
            this.aClass174_Sub3_9121.method2231(this.aClass174_Sub3_9121.aClass433_9705);
            var20.method4105(Class433.aClass433_4840);
            var20.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var20.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            var20.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var20.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
            var20.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
            var20.aClass433_3420.method5104();
            var20.anInt3430 = var11;
            var20.anInt3416 = var12 - var11 + 1;
            var20.anInt3424 = 0;
            var20.anInt3423 = var10 / 3;
            if(this.aClass174_Sub3_9121.aBool9808) {
               this.aClass174_Sub3_9121.method2328(false);
               var20.method4120(false);
               this.aClass174_Sub3_9121.method2328(true);
            } else {
               var20.method4120(false);
            }
         }

      }
   }

   public Class526_Sub21_Sub5 method1728(int var1, int var2, Class526_Sub21_Sub5 var3) {
      if((this.aByteArrayArray9140[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt1712 * 1934131013 >> this.aClass174_Sub3_9121.anInt9710;
         Class526_Sub21_Sub5_Sub1 var5 = (Class526_Sub21_Sub5_Sub1)var3;
         Class526_Sub21_Sub5_Sub1 var6;
         if(var5 != null && var5.method10872(var4, var4)) {
            var6 = var5;
            var5.method10873();
         } else {
            var6 = new Class526_Sub21_Sub5_Sub1(this.aClass174_Sub3_9121, var4, var4);
         }

         var6.method10871(0, 0, var4, var4);
         this.method8435(var6, var1, var2);
         return var6;
      }
   }

   public Class526_Sub21_Sub5 method1729(int var1, int var2, Class526_Sub21_Sub5 var3) {
      if((this.aByteArrayArray9140[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt1712 * 1934131013 >> this.aClass174_Sub3_9121.anInt9710;
         Class526_Sub21_Sub5_Sub1 var5 = (Class526_Sub21_Sub5_Sub1)var3;
         Class526_Sub21_Sub5_Sub1 var6;
         if(var5 != null && var5.method10872(var4, var4)) {
            var6 = var5;
            var5.method10873();
         } else {
            var6 = new Class526_Sub21_Sub5_Sub1(this.aClass174_Sub3_9121, var4, var4);
         }

         var6.method10871(0, 0, var4, var4);
         this.method8435(var6, var1, var2);
         return var6;
      }
   }

   public void method1730(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4529(var1, var7, var8);
      }
   }

   public void method1731(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4529(var1, var7, var8);
      }
   }

   public boolean method1732(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         return this.aClass349_9139.method4531(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method1703(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4537(var1, var7, var8);
      }
   }

   public void method1733(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = new int[var16 * 3];
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = var4 != null?new int[var16 * 3]:null;
      int[] var24 = var6 != null?new int[var16 * 3]:null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = var7[var26];
         int var28 = var8[var26];
         int var29 = var9[var26];
         var17[var25] = var3[var27];
         var18[var25] = var5[var27];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var27];
         }

         if(var6 != null) {
            var24[var25] = var6[var27];
         }

         ++var25;
         var17[var25] = var3[var28];
         var18[var25] = var5[var28];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var28];
         }

         if(var6 != null) {
            var24[var25] = var6[var28];
         }

         ++var25;
         var17[var25] = var3[var29];
         var18[var25] = var5[var29];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var29];
         }

         if(var6 != null) {
            var24[var25] = var6[var29];
         }

         ++var25;
      }

      this.method1699(var1, var2, var17, var23, var18, var24, var19, var20, var21, var22, var14, var15);
   }

   public void method1735(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4537(var1, var7, var8);
      }
   }

   public void method1712(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass526Array9141 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.anIntArray9160.length < var7) {
            this.anIntArray9160 = new int[var7];
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if(var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if(var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if(var12 > this.anInt1711 * 1966165105 - 1) {
            var12 = this.anInt1711 * 1966165105 - 1;
         }

         int var13 = var2 + var3;
         if(var13 > this.anInt1713 * -810756899 - 1) {
            var13 = this.anInt1713 * -810756899 - 1;
         }

         this.anInt9135 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if(var15[var16 - var11]) {
                  this.anIntArray9160[this.anInt9135++] = var16 * this.anInt1711 * 1966165105 + var14;
               }
            }
         }

         ByteBuffer var24 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var24.clear();

         int var25;
         for(var25 = 0; var25 < this.aClass526Array9141.length; ++var25) {
            Class526_Sub15 var26 = (Class526_Sub15)this.aClass526Array9141[var25];
            var26.method9378(this.anIntArray9160, this.anInt9135);
         }

         var25 = var24.position();
         Class318 var27 = this.aClass174_Sub3_9121.aClass318_9762;
         this.aClass174_Sub3_9121.method8829();
         if(this.aClass174_Sub3_9121.anInt9675 > 0) {
            var27.aClass446_3432.method5266((float)(this.aClass174_Sub3_9121.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 0 & 255) / 255.0F);
            var27.aClass444_3411.method5202(0.0F, 0.0F, 1.0F, -this.aClass174_Sub3_9121.aFloat9810);
            var27.aClass444_3411.method5207(this.aClass174_Sub3_9121.aClass433_9700);
            var27.aClass444_3411.method5206(1.0F / (this.aClass174_Sub3_9121.aFloat9677 - this.aClass174_Sub3_9121.aFloat9810));
         } else {
            var27.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
         }

         if(var25 != 0) {
            Interface42 var17 = this.aClass174_Sub3_9121.method8746(var25 / 2);
            var17.method235(0, var25, this.aClass174_Sub3_9121.aLong9685);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8769(var17);
            var27.method4105(Class433.aClass433_4840);
            int var18;
            int var19;
            Class526_Sub15 var20;
            Class171 var22;
            if((this.anInt9125 & 7) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 != 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        var27.aClass444_3421.method5202(0.0F, 1.0F, 0.0F, (float)this.aClass174_Sub3_9121.anInt9803 + (float)(var20.aClass172_10460.anInt2018 * 1590947963) / 255.0F * (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass444_3421.method5206(1.0F / (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     boolean var33 = false;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-8);
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var33 = !Class16.method621(var22.aByte1966, 1175343261);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     var27.method4120(var33);
                     var18 += var20.anInt10458;
                  }
               }
            } else {
               var27.aClass446_3425.method5266(this.aClass174_Sub3_9121.aFloatArray9777[0], this.aClass174_Sub3_9121.aFloatArray9777[1], this.aClass174_Sub3_9121.aFloatArray9777[2]);
               var27.aClass446_3426.method5266(this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3428.method5266(-this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9708, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9771, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3433.method5266(this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9760);
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 > 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        float var21 = 0.15F;
                        var27.aClass444_3421.method5202(0.0F, 1.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21), 0.0F, 256.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     byte var32 = 11;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)8);
                        var32 = var22.aByte1966;
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var27.method4117(var22.aByte1970);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     switch(var32) {
                     case 1:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4111();
                        } else {
                           var27.method4116(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if(!this.aClass174_Sub3_9121.aBool9761 && (this.anInt9125 & 8) != 0 && this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792.method10545(7523790)) {
                           Class351_Sub1_Sub2 var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792;
                           if(var32 == 2) {
                              var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9791;
                           }

                           var34.aClass433_11565.method5083(this.aClass174_Sub3_9121.aClass433_9720);
                           var34.aClass433_11567.method5141(1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F, 1.0F);
                           var34.aClass446_11569.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                           Class171 var23 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-100);
                           var34.anInt11570 = var23.aByte1970 * 961023603;
                           var34.anInt11590 = var20.anInt10461 * -1556650397;
                           var34.anInt11586 = (var20.anInt10466 - var20.anInt10461 + 1) * -737570061;
                           var34.anInt11582 = var18 * -1598793771;
                           var34.anInt11584 = var20.anInt10458 / 3 * 1520663561;
                           var34.aClass444_11578.method5203(var27.aClass444_3421);
                           var34.aClass446_11562.method5267(var27.aClass446_3422);
                           var34.aClass444_11580.method5203(var27.aClass444_3411);
                           var34.aClass446_11574.method5267(var27.aClass446_3432);
                           var34.method10547(-1450399027);
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4110();
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 6:
                        var27.method4120(!Class16.method621(var32, 1336578232));
                        break;
                     case 7:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        var27.aClass433_3429.method5104();
                        var27.anInterface44_3431 = this.aClass174_Sub3_9121.method8751();
                        var27.method4109(0);
                     }

                     var18 += var20.anInt10458;
                  }
               }
            }
         }

         if(!this.aClass702_9144.method8209(1748206297)) {
            this.aClass174_Sub3_9121.method8807(128);
            this.aClass174_Sub3_9121.method8782(false);
            Class446 var28 = new Class446(var27.aClass446_3432);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            Iterator var30 = this.aClass702_9144.iterator();

            while(var30.hasNext()) {
               Class526_Sub19 var31 = (Class526_Sub19)var30.next();
               var31.method9434(var27, var1, var2, var3, var4, var5);
            }

            var27.aClass446_3432.method5267(var28);
         }

         if(this.aClass349_9139 != null) {
            this.aClass174_Sub3_9121.method8807(1);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            Class433 var29 = this.aClass174_Sub3_9121.aClass433_9705;
            var29.method5104();
            var29.aFloatArray4841[13] = -1.0F;
            var27.method4105(var29);
            this.aClass349_9139.method4538(var27, var1, var2, var3, var4, var5);
         }
      }

   }

   public void method1726(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass526Array9141 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.anIntArray9160.length < var7) {
            this.anIntArray9160 = new int[var7];
         }

         int var8 = var1 - var3;
         int var9 = var8;
         if(var8 < 0) {
            var8 = 0;
         }

         int var10 = var2 - var3;
         int var11 = var10;
         if(var10 < 0) {
            var10 = 0;
         }

         int var12 = var1 + var3;
         if(var12 > this.anInt1711 * 1966165105 - 1) {
            var12 = this.anInt1711 * 1966165105 - 1;
         }

         int var13 = var2 + var3;
         if(var13 > this.anInt1713 * -810756899 - 1) {
            var13 = this.anInt1713 * -810756899 - 1;
         }

         this.anInt9135 = 0;

         for(int var14 = var8; var14 <= var12; ++var14) {
            boolean[] var15 = var4[var14 - var9];

            for(int var16 = var10; var16 <= var13; ++var16) {
               if(var15[var16 - var11]) {
                  this.anIntArray9160[this.anInt9135++] = var16 * this.anInt1711 * 1966165105 + var14;
               }
            }
         }

         ByteBuffer var24 = this.aClass174_Sub3_9121.aByteBuffer9684;
         var24.clear();

         int var25;
         for(var25 = 0; var25 < this.aClass526Array9141.length; ++var25) {
            Class526_Sub15 var26 = (Class526_Sub15)this.aClass526Array9141[var25];
            var26.method9378(this.anIntArray9160, this.anInt9135);
         }

         var25 = var24.position();
         Class318 var27 = this.aClass174_Sub3_9121.aClass318_9762;
         this.aClass174_Sub3_9121.method8829();
         if(this.aClass174_Sub3_9121.anInt9675 > 0) {
            var27.aClass446_3432.method5266((float)(this.aClass174_Sub3_9121.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9121.anInt9722 >> 0 & 255) / 255.0F);
            var27.aClass444_3411.method5202(0.0F, 0.0F, 1.0F, -this.aClass174_Sub3_9121.aFloat9810);
            var27.aClass444_3411.method5207(this.aClass174_Sub3_9121.aClass433_9700);
            var27.aClass444_3411.method5206(1.0F / (this.aClass174_Sub3_9121.aFloat9677 - this.aClass174_Sub3_9121.aFloat9810));
         } else {
            var27.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
         }

         if(var25 != 0) {
            Interface42 var17 = this.aClass174_Sub3_9121.method8746(var25 / 2);
            var17.method235(0, var25, this.aClass174_Sub3_9121.aLong9685);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8769(var17);
            var27.method4105(Class433.aClass433_4840);
            int var18;
            int var19;
            Class526_Sub15 var20;
            Class171 var22;
            if((this.anInt9125 & 7) == 0) {
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 != 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        var27.aClass444_3421.method5202(0.0F, 1.0F, 0.0F, (float)this.aClass174_Sub3_9121.anInt9803 + (float)(var20.aClass172_10460.anInt2018 * 1590947963) / 255.0F * (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass444_3421.method5206(1.0F / (float)(var20.aClass172_10460.anInt2020 * -1648426019));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     boolean var33 = false;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)15);
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var33 = !Class16.method621(var22.aByte1966, 1268646662);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     var27.method4120(var33);
                     var18 += var20.anInt10458;
                  }
               }
            } else {
               var27.aClass446_3425.method5266(this.aClass174_Sub3_9121.aFloatArray9777[0], this.aClass174_Sub3_9121.aFloatArray9777[1], this.aClass174_Sub3_9121.aFloatArray9777[2]);
               var27.aClass446_3426.method5266(this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9823 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3428.method5266(-this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9708, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9771, -this.aClass174_Sub3_9121.aFloat9763 * this.aClass174_Sub3_9121.aFloat9760);
               var27.aClass446_3433.method5266(this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9708, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9771, this.aClass174_Sub3_9121.aFloat9669 * this.aClass174_Sub3_9121.aFloat9760);
               var18 = 0;

               for(var19 = 0; var19 < this.aClass526Array9141.length; ++var19) {
                  var20 = (Class526_Sub15)this.aClass526Array9141[var19];
                  if(var20.anInt10458 > 0) {
                     if(this.aClass174_Sub3_9121.aBool9811) {
                        this.aClass174_Sub3_9121.method2353(0, var20.aClass172_10460);
                        float var21 = 0.15F;
                        var27.aClass444_3421.method5202(0.0F, 1.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21), 0.0F, 256.0F / ((float)(var20.aClass172_10460.anInt2020 * -1648426019) * var21));
                        var27.aClass446_3422.method5266((float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var20.aClass172_10460.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
                     } else {
                        var27.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
                        var27.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
                     }

                     byte var32 = 11;
                     if(var20.anInt10456 != -1) {
                        var22 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)45);
                        var32 = var22.aByte1966;
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.aClass346_9775.method4474(var22);
                        var27.method4117(var22.aByte1970);
                     } else {
                        var27.anInterface38_3415 = this.aClass174_Sub3_9121.anInterface38_9779;
                     }

                     this.aClass174_Sub3_9121.method8820(1, var20.anInterface35_10464);
                     this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
                     var27.aClass433_3420.method5141(1.0F / var20.aFloat10459, 1.0F / var20.aFloat10459, 1.0F, 1.0F);
                     var27.anInt3430 = var20.anInt10461;
                     var27.anInt3416 = var20.anInt10466 - var20.anInt10461 + 1;
                     var27.anInt3424 = var18;
                     var27.anInt3423 = var20.anInt10458 / 3;
                     switch(var32) {
                     case 1:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4111();
                        } else {
                           var27.method4116(0);
                        }
                        break;
                     case 2:
                     case 4:
                     case 8:
                     case 9:
                        if(!this.aClass174_Sub3_9121.aBool9761 && (this.anInt9125 & 8) != 0 && this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792.method10545(454184393)) {
                           Class351_Sub1_Sub2 var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9792;
                           if(var32 == 2) {
                              var34 = this.aClass174_Sub3_9121.aClass351_Sub1_Sub2_9791;
                           }

                           var34.aClass433_11565.method5083(this.aClass174_Sub3_9121.aClass433_9720);
                           var34.aClass433_11567.method5141(1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F / (var20.aFloat10459 * (float)(var20.aClass172_10460.anInt2022 * -101484739)), 1.0F, 1.0F);
                           var34.aClass446_11569.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                           Class171 var23 = this.aClass174_Sub3_9121.aClass169_2035.method2122(var20.anInt10456, (byte)-49);
                           var34.anInt11570 = var23.aByte1970 * 961023603;
                           var34.anInt11590 = var20.anInt10461 * -1556650397;
                           var34.anInt11586 = (var20.anInt10466 - var20.anInt10461 + 1) * -737570061;
                           var34.anInt11582 = var18 * -1598793771;
                           var34.anInt11584 = var20.anInt10458 / 3 * 1520663561;
                           var34.aClass444_11578.method5203(var27.aClass444_3421);
                           var34.aClass446_11562.method5267(var27.aClass446_3422);
                           var34.aClass444_11580.method5203(var27.aClass444_3411);
                           var34.aClass446_11574.method5267(var27.aClass446_3432);
                           var34.method10547(-1450399027);
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 3:
                     case 5:
                     default:
                        if(this.aClass174_Sub3_9121.aBool9811) {
                           var27.method4110();
                        } else {
                           var27.method4107(0);
                        }
                        break;
                     case 6:
                        var27.method4120(!Class16.method621(var32, 976305501));
                        break;
                     case 7:
                        var27.aClass446_3418.method5266(this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9121.aClass433_9804.aFloatArray4841[14]);
                        var27.aClass433_3429.method5104();
                        var27.anInterface44_3431 = this.aClass174_Sub3_9121.method8751();
                        var27.method4109(0);
                     }

                     var18 += var20.anInt10458;
                  }
               }
            }
         }

         if(!this.aClass702_9144.method8209(-2091317690)) {
            this.aClass174_Sub3_9121.method8807(128);
            this.aClass174_Sub3_9121.method8782(false);
            Class446 var28 = new Class446(var27.aClass446_3432);
            var27.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            Iterator var30 = this.aClass702_9144.iterator();

            while(var30.hasNext()) {
               Class526_Sub19 var31 = (Class526_Sub19)var30.next();
               var31.method9434(var27, var1, var2, var3, var4, var5);
            }

            var27.aClass446_3432.method5267(var28);
         }

         if(this.aClass349_9139 != null) {
            this.aClass174_Sub3_9121.method8807(1);
            this.aClass174_Sub3_9121.method8820(0, this.anInterface35_9120);
            this.aClass174_Sub3_9121.method8820(1, this.anInterface35_9143);
            this.aClass174_Sub3_9121.method8833(this.aClass335_9149);
            Class433 var29 = this.aClass174_Sub3_9121.aClass433_9705;
            var29.method5104();
            var29.aFloatArray4841[13] = -1.0F;
            var27.method4105(var29);
            this.aClass349_9139.method4538(var27, var1, var2, var3, var4, var5);
         }
      }

   }

   public void method1704(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4537(var1, var7, var8);
      }
   }

   void method8439() {
      this.anInterface35_9143 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9143.method249(this.anInt9126 * 4, 4);
      this.anInterface35_9143.method235(0, this.anInt9126 * 4, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9158));
      this.anInterface35_9120 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9120.method249(this.anInt9126 * this.anInt9156, this.anInt9156);
      this.anInterface35_9120.method235(0, this.anInt9126 * this.anInt9156, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9155));
      this.aByteBuffer9158.clear();
      this.aByteBuffer9158 = null;
      this.aByteBuffer9155.clear();
      this.aByteBuffer9155 = null;
      if((this.anInt9125 & 7) != 0) {
         if(this.anIntArrayArrayArray9137 != null) {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         } else {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         }
      } else if(this.anIntArrayArrayArray9137 != null) {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672}), new Class359(Class353.aClass353_3679)});
      } else {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683}), new Class359(Class353.aClass353_3679)});
      }

      for(int var1 = 0; var1 < this.anInt9153; ++var1) {
         Class526_Sub15 var2 = (Class526_Sub15)this.aClass526Array9152[var1];
         var2.method9377(this.anInt9126);
      }

      if(this.aClass349_9139 != null) {
         this.aClass349_9139.method4528();
      }

      this.method8434();
   }

   public void method1740(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = new int[var16 * 3];
      int[] var21 = new int[var16 * 3];
      int[] var22 = new int[var16 * 3];
      int[] var23 = var4 != null?new int[var16 * 3]:null;
      int[] var24 = var6 != null?new int[var16 * 3]:null;
      int var25 = 0;

      for(int var26 = 0; var26 < var16; ++var26) {
         int var27 = var7[var26];
         int var28 = var8[var26];
         int var29 = var9[var26];
         var17[var25] = var3[var27];
         var18[var25] = var5[var27];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var27];
         }

         if(var6 != null) {
            var24[var25] = var6[var27];
         }

         ++var25;
         var17[var25] = var3[var28];
         var18[var25] = var5[var28];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var28];
         }

         if(var6 != null) {
            var24[var25] = var6[var28];
         }

         ++var25;
         var17[var25] = var3[var29];
         var18[var25] = var5[var29];
         var19[var25] = var10[var26];
         var21[var25] = var12[var26];
         var22[var25] = var13[var26];
         var20[var25] = var11 != null?var11[var26]:var10[var26];
         if(var4 != null) {
            var23[var25] = var4[var29];
         }

         if(var6 != null) {
            var24[var25] = var6[var29];
         }

         ++var25;
      }

      this.method1699(var1, var2, var17, var23, var18, var24, var19, var20, var21, var22, var14, var15);
   }

   void method8440() {
      this.anInterface35_9143 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9143.method249(this.anInt9126 * 4, 4);
      this.anInterface35_9143.method235(0, this.anInt9126 * 4, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9158));
      this.anInterface35_9120 = this.aClass174_Sub3_9121.method8818(false);
      this.anInterface35_9120.method249(this.anInt9126 * this.anInt9156, this.anInt9156);
      this.anInterface35_9120.method235(0, this.anInt9126 * this.anInt9156, this.aClass174_Sub3_9121.method8724(this.aByteBuffer9155));
      this.aByteBuffer9158.clear();
      this.aByteBuffer9158 = null;
      this.aByteBuffer9155.clear();
      this.aByteBuffer9155 = null;
      if((this.anInt9125 & 7) != 0) {
         if(this.anIntArrayArrayArray9137 != null) {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         } else {
            this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3673}), new Class359(Class353.aClass353_3679)});
         }
      } else if(this.anIntArrayArrayArray9137 != null) {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683, Class353.aClass353_3672}), new Class359(Class353.aClass353_3679)});
      } else {
         this.aClass335_9149 = this.aClass174_Sub3_9121.method8748(new Class359[]{new Class359(new Class353[]{Class353.aClass353_3685, Class353.aClass353_3683}), new Class359(Class353.aClass353_3679)});
      }

      for(int var1 = 0; var1 < this.anInt9153; ++var1) {
         Class526_Sub15 var2 = (Class526_Sub15)this.aClass526Array9152[var1];
         var2.method9377(this.anInt9126);
      }

      if(this.aClass349_9139 != null) {
         this.aClass349_9139.method4528();
      }

      this.method8434();
   }

   public void method1710(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4537(var1, var7, var8);
      }
   }

   public void method1736(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass349_9139 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub3_9121.anInt9750 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         int var8 = var4 - (var3 * this.aClass174_Sub3_9121.anInt9770 >> 8) >> this.aClass174_Sub3_9121.anInt9710;
         this.aClass349_9139.method4537(var1, var7, var8);
      }
   }

   void method8441() {
      if((this.anInt9124 & 2) == 0) {
         this.anIntArrayArrayArray9142 = (int[][][])null;
         this.anIntArrayArrayArray9134 = (int[][][])null;
         this.anIntArrayArrayArray9132 = (int[][][])null;
      }

      this.anIntArrayArrayArray9137 = (int[][][])null;
      this.anIntArrayArrayArray9133 = (int[][][])null;
      this.anIntArrayArrayArray9136 = (int[][][])null;
      this.aClass526_Sub15ArrayArrayArray9131 = (Class526_Sub15[][][])null;
      this.aByteArrayArray9147 = (byte[][])null;
      this.aClass20_9151 = null;
      this.aClass526Array9152 = null;
      this.aFloatArrayArray9150 = (float[][])null;
      this.aFloatArrayArray9138 = (float[][])null;
      this.aFloatArrayArray9148 = (float[][])null;
   }

   void method8442() {
      if((this.anInt9124 & 2) == 0) {
         this.anIntArrayArrayArray9142 = (int[][][])null;
         this.anIntArrayArrayArray9134 = (int[][][])null;
         this.anIntArrayArrayArray9132 = (int[][][])null;
      }

      this.anIntArrayArrayArray9137 = (int[][][])null;
      this.anIntArrayArrayArray9133 = (int[][][])null;
      this.anIntArrayArrayArray9136 = (int[][][])null;
      this.aClass526_Sub15ArrayArrayArray9131 = (Class526_Sub15[][][])null;
      this.aByteArrayArray9147 = (byte[][])null;
      this.aClass20_9151 = null;
      this.aClass526Array9152 = null;
      this.aFloatArrayArray9150 = (float[][])null;
      this.aFloatArrayArray9138 = (float[][])null;
      this.aFloatArrayArray9148 = (float[][])null;
   }

   void method8443(int var1, int var2, byte[][] var3, Class526_Sub15[] var4, Class20 var5, Class526_Sub15[] var6) {
      if(this.anIntArrayArrayArray9132[var1][var2] != null) {
         Class526_Sub15[] var7 = this.aClass526_Sub15ArrayArrayArray9131[var1][var2];
         int[] var8 = this.anIntArrayArrayArray9134[var1][var2];
         int[] var9 = this.anIntArrayArrayArray9142[var1][var2];
         int[] var10 = this.anIntArrayArrayArray9133[var1][var2];
         int[] var11 = this.anIntArrayArrayArray9132[var1][var2];
         int[] var12 = this.anIntArrayArrayArray9136 != null?this.anIntArrayArrayArray9136[var1][var2]:null;
         int[] var13 = this.anIntArrayArrayArray9137 != null?this.anIntArrayArrayArray9137[var1][var2]:null;
         if(var10 == null) {
            var10 = var11;
         }

         float var14 = this.aFloatArrayArray9148[var1][var2];
         float var15 = this.aFloatArrayArray9138[var1][var2];
         float var16 = this.aFloatArrayArray9150[var1][var2];
         float var17 = this.aFloatArrayArray9148[var1][var2 + 1];
         float var18 = this.aFloatArrayArray9138[var1][var2 + 1];
         float var19 = this.aFloatArrayArray9150[var1][var2 + 1];
         float var20 = this.aFloatArrayArray9148[var1 + 1][var2 + 1];
         float var21 = this.aFloatArrayArray9138[var1 + 1][var2 + 1];
         float var22 = this.aFloatArrayArray9150[var1 + 1][var2 + 1];
         float var23 = this.aFloatArrayArray9148[var1 + 1][var2];
         float var24 = this.aFloatArrayArray9138[var1 + 1][var2];
         float var25 = this.aFloatArrayArray9150[var1 + 1][var2];
         int var26 = var3[var1][var2] & 255;
         int var27 = var3[var1][var2 + 1] & 255;
         int var28 = var3[var1 + 1][var2 + 1] & 255;
         int var29 = var3[var1 + 1][var2] & 255;
         int var30 = 0;

         int var33;
         label185:
         for(int var31 = 0; var31 < var11.length; ++var31) {
            Class526_Sub15 var32 = var7[var31];

            for(var33 = 0; var33 < var30; ++var33) {
               if(var4[var33] == var32) {
                  continue label185;
               }
            }

            var4[var30++] = var32;
         }

         short[] var61 = this.aShortArrayArray9128[var2 * this.anInt1711 * 1966165105 + var1] = new short[var11.length];

         for(int var62 = 0; var62 < var11.length; ++var62) {
            int var34 = (var1 << this.anInt1710 * -586661047) + var8[var62];
            int var35 = (var2 << this.anInt1710 * -586661047) + var9[var62];
            int var36 = var34 >> this.anInt9122;
            int var37 = var35 >> this.anInt9122;
            int var38 = var11[var62];
            int var39 = var10[var62];
            int var40 = var12 != null?var12[var62]:0;
            long var41 = (long)var39 << 48 | (long)var38 << 32 | (long)(var36 << 16) | (long)var37;
            int var43 = var8[var62];
            int var44 = var9[var62];
            byte var45 = 74;
            int var46 = 0;
            float var47 = 1.0F;
            float var48;
            float var49;
            float var50;
            float var54;
            int var63;
            if(var43 == 0 && var44 == 0) {
               var48 = var14;
               var49 = var15;
               var50 = var16;
               var63 = var45 - var26;
            } else if(var43 == 0 && var44 == this.anInt1712 * 1934131013) {
               var48 = var17;
               var49 = var18;
               var50 = var19;
               var63 = var45 - var27;
            } else if(var43 == this.anInt1712 * 1934131013 && var44 == this.anInt1712 * 1934131013) {
               var48 = var20;
               var49 = var21;
               var50 = var22;
               var63 = var45 - var28;
            } else if(var43 == this.anInt1712 * 1934131013 && var44 == 0) {
               var48 = var23;
               var49 = var24;
               var50 = var25;
               var63 = var45 - var29;
            } else {
               float var51 = (float)var43 / (float)(this.anInt1712 * 1934131013);
               float var52 = (float)var44 / (float)(this.anInt1712 * 1934131013);
               float var53 = var14 + (var23 - var14) * var51;
               var54 = var15 + (var24 - var15) * var51;
               float var55 = var16 + (var25 - var16) * var51;
               float var56 = var17 + (var20 - var17) * var51;
               float var57 = var18 + (var21 - var18) * var51;
               float var58 = var19 + (var22 - var19) * var51;
               var48 = var53 + (var56 - var53) * var52;
               var49 = var54 + (var57 - var54) * var52;
               var50 = var55 + (var58 - var55) * var52;
               int var59 = var26 + ((var29 - var26) * var43 >> this.anInt1710 * -586661047);
               int var60 = var27 + ((var28 - var27) * var43 >> this.anInt1710 * -586661047);
               var63 = var45 - (var59 + ((var60 - var59) * var44 >> this.anInt1710 * -586661047));
            }

            if(var38 != -1) {
               int var64 = (var38 & 127) * var63 >> 7;
               if(var64 < 2) {
                  var64 = 2;
               } else if(var64 > 126) {
                  var64 = 126;
               }

               var46 = Class34.anIntArray371[var38 & '\uff80' | var64];
               if((this.anInt9125 & 7) == 0) {
                  var47 = this.aClass174_Sub3_9121.aFloatArray9777[0] * var48 + this.aClass174_Sub3_9121.aFloatArray9777[1] * var49 + this.aClass174_Sub3_9121.aFloatArray9777[2] * var50;
                  var47 = this.aClass174_Sub3_9121.aFloat9669 + var47 * (var47 > 0.0F?this.aClass174_Sub3_9121.aFloat9823:this.aClass174_Sub3_9121.aFloat9763);
               }
            }

            Class526 var66 = null;
            if((var34 & this.anInt9123 - 1) == 0 && (var35 & this.anInt9123 - 1) == 0) {
               var66 = var5.get(var41);
            }

            int var65;
            if(var66 == null) {
               int var67;
               if(var39 != var38) {
                  var67 = (var39 & 127) * var63 >> 7;
                  if(var67 < 2) {
                     var67 = 2;
                  } else if(var67 > 126) {
                     var67 = 126;
                  }

                  var65 = Class34.anIntArray371[var39 & '\uff80' | var67];
                  if((this.anInt9125 & 7) == 0) {
                     float var10000 = this.aClass174_Sub3_9121.aFloatArray9777[0] * var48 + this.aClass174_Sub3_9121.aFloatArray9777[1] * var49 + this.aClass174_Sub3_9121.aFloatArray9777[2] * var50;
                     var54 = this.aClass174_Sub3_9121.aFloat9669 + var47 * (var47 > 0.0F?this.aClass174_Sub3_9121.aFloat9823:this.aClass174_Sub3_9121.aFloat9763);
                     int var68 = var65 >> 16 & 255;
                     int var69 = var65 >> 8 & 255;
                     int var70 = var65 & 255;
                     var68 = (int)((float)var68 * var54);
                     if(var68 < 0) {
                        var68 = 0;
                     } else if(var68 > 255) {
                        var68 = 255;
                     }

                     var69 = (int)((float)var69 * var54);
                     if(var69 < 0) {
                        var69 = 0;
                     } else if(var69 > 255) {
                        var69 = 255;
                     }

                     var70 = (int)((float)var70 * var54);
                     if(var70 < 0) {
                        var70 = 0;
                     } else if(var70 > 255) {
                        var70 = 255;
                     }

                     var65 = var68 << 16 | var69 << 8 | var70;
                  }
               } else {
                  var65 = var46;
               }

               this.aByteBuffer9155.putFloat((float)var34);
               this.aByteBuffer9155.putFloat((float)(this.method1707(var34, var35, -1504846441) + var40));
               this.aByteBuffer9155.putFloat((float)var35);
               this.aByteBuffer9155.putFloat((float)var34);
               this.aByteBuffer9155.putFloat((float)var35);
               if(this.anIntArrayArrayArray9137 != null) {
                  this.aByteBuffer9155.putFloat(var13 != null?(float)(var13[var62] - 1):0.0F);
               }

               if((this.anInt9125 & 7) != 0) {
                  this.aByteBuffer9155.putFloat(var48);
                  this.aByteBuffer9155.putFloat(var49);
                  this.aByteBuffer9155.putFloat(var50);
               }

               if(this.aClass174_Sub3_9121.anInt9729 == 0) {
                  var67 = var65 & -16711936;
                  var67 |= (var65 & 16711680) >> 16;
                  var67 |= (var65 & 255) << 16;
                  var65 = var67;
               }

               this.aByteBuffer9158.putInt(-16777216 | var65);
               var33 = this.anInt9126++;
               var61[var62] = (short)var33;
               if(var38 != -1) {
                  var6[var33] = var7[var62];
               }

               var5.put(new Class526_Sub17(var61[var62]), var41);
            } else {
               var61[var62] = ((Class526_Sub17)var66).aShort10479;
               var33 = var61[var62] & '\uffff';
               if(var38 != -1 && var7[var62].aLong7156 * -6805155999452426801L < var6[var33].aLong7156 * -6805155999452426801L) {
                  var6[var33] = var7[var62];
               }
            }

            for(var65 = 0; var65 < var30; ++var65) {
               var4[var65].method9376(var33, var46, var63, var47);
            }

            ++this.anInt9154;
         }

      }
   }

   void method8444() {
      if((this.anInt9124 & 2) == 0) {
         this.anIntArrayArrayArray9142 = (int[][][])null;
         this.anIntArrayArrayArray9134 = (int[][][])null;
         this.anIntArrayArrayArray9132 = (int[][][])null;
      }

      this.anIntArrayArrayArray9137 = (int[][][])null;
      this.anIntArrayArrayArray9133 = (int[][][])null;
      this.anIntArrayArrayArray9136 = (int[][][])null;
      this.aClass526_Sub15ArrayArrayArray9131 = (Class526_Sub15[][][])null;
      this.aByteArrayArray9147 = (byte[][])null;
      this.aClass20_9151 = null;
      this.aClass526Array9152 = null;
      this.aFloatArrayArray9150 = (float[][])null;
      this.aFloatArrayArray9138 = (float[][])null;
      this.aFloatArrayArray9148 = (float[][])null;
   }
}
