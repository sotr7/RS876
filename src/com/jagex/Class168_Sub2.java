package com.jagex;

import com.jagex.Class141;
import com.jagex.Class148;
import com.jagex.Class16;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class169;
import com.jagex.Class170;
import com.jagex.Class171;
import com.jagex.Class172;
import com.jagex.Class174_Sub3;
import com.jagex.Class180;
import com.jagex.Class182;
import com.jagex.Class185;
import com.jagex.Class189;
import com.jagex.Class318;
import com.jagex.Class320;
import com.jagex.Class336;
import com.jagex.Class338;
import com.jagex.Class343;
import com.jagex.Class351_Sub1_Sub1;
import com.jagex.Class352;
import com.jagex.Class360;
import com.jagex.Class365;
import com.jagex.Class368;
import com.jagex.Class371;
import com.jagex.Class377;
import com.jagex.Class385;
import com.jagex.Class386;
import com.jagex.Class433;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub21_Sub5_Sub1;
import com.jagex.Class569;
import com.jagex.Class593;
import com.jagex.Class639_Sub1;
import com.jagex.Class661;
import com.jagex.Interface35;
import com.jagex.Interface42;
import com.jagex.Interface47;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class168_Sub2 extends Class168 {
   static final int anInt9283 = 7;
   static final int anInt9306 = 4;
   static Class338 aClass338_9349;
   boolean aBool9327;
   int[] anIntArray9339;
   int anInt9312;
   int anInt9300;
   int anInt9357;
   int anInt9287;
   int[] anIntArray9291;
   int[] anIntArray9286;
   int[] anIntArray9307;
   short[] aShortArray9295;
   Class182[] aClass182Array9341;
   Class141[] aClass141Array9314;
   int anInt9313;
   Class360[] aClass360Array9344;
   Class352[] aClass352Array9326;
   short[] aShortArray9297;
   short[] aShortArray9282;
   short[] aShortArray9358;
   short[] aShortArray9292;
   short[] aShortArray9301;
   byte[] aByteArray9302;
   float[] aFloatArray9303;
   float[] aFloatArray9304;
   short[] aShortArray9308;
   byte[] aByteArray9309;
   short[] aShortArray9310;
   short[] aShortArray9311;
   short[] aShortArray9345;
   short[] aShortArray9342;
   short[] aShortArray9315;
   short aShort9343;
   short aShort9288;
   short[] aShortArray9299;
   long[] aLongArray9347;
   boolean aBool9331;
   int[] anIntArray9337;
   int[] anIntArray9338;
   int[] anIntArray9336;
   int[][] anIntArrayArray9294;
   boolean aBool9324;
   int[][] anIntArrayArray9346;
   int[][] anIntArrayArray9350;
   int anInt9296;
   int anInt9353;
   boolean aBool9322;
   Class368 aClass368_9305;
   int anInt9285;
   Class371 aClass371_9298;
   Class371 aClass371_9318;
   Class371 aClass371_9319;
   Class371 aClass371_9323;
   Class343 aClass343_9316;
   int anInt9325;
   int anInt9320;
   int anInt9330;
   int anInt9293;
   int anInt9328;
   int anInt9329;
   int anInt9332;
   int anInt9333;
   boolean aBool9289;
   int anInt9335;
   int anInt9354;
   int anInt9355;
   int anInt9356;
   boolean aBool9317;
   int[] anIntArray9290;
   int[] anIntArray9334;
   boolean aBool9321;
   float[] aFloatArray9348;
   int[] anIntArray9351;
   int[] anIntArray9352;
   int[] anIntArray9340;
   Class174_Sub3 aClass174_Sub3_9284;

   void method2074() {
      for(int var1 = 0; var1 < this.anInt9357; ++var1) {
         this.anIntArray9291[var1] = this.anIntArray9291[var1] + 7 >> 4;
         this.anIntArray9286[var1] = this.anIntArray9286[var1] + 7 >> 4;
         this.anIntArray9307[var1] = this.anIntArray9307[var1] + 7 >> 4;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   Class168_Sub2(Class174_Sub3 var1, Class170 var2, int var3, int var4, int var5, int var6) {
      this(var1, var3, var6, true, false);
      Class169 var7 = var1.aClass169_2035;
      Interface47 var8 = var1.anInterface47_2036;
      int[] var9 = new int[var2.anInt1929];
      this.anIntArray9339 = new int[var2.anInt1919 + 1];

      for(int var10 = 0; var10 < var2.anInt1929; ++var10) {
         if(var2.aByteArray1936 == null || var2.aByteArray1936[var10] != 2) {
            if(var2.aShortArray1941 != null && var2.aShortArray1941[var10] != -1) {
               Class171 var11 = var7.method2122(var2.aShortArray1941[var10] & '\uffff', (byte)32);
               if(((this.anInt9285 & 64) == 0 || !var11.aBool1981) && var11.aBool2010) {
                  continue;
               }
            }

            var9[this.anInt9300++] = var10;
            ++this.anIntArray9339[var2.aShortArray1930[var10]];
            ++this.anIntArray9339[var2.aShortArray1931[var10]];
            ++this.anIntArray9339[var2.aShortArray1932[var10]];
         }
      }

      this.anInt9312 = this.anInt9300;
      long[] var80 = new long[this.anInt9300];
      boolean var81 = (this.anInt9353 & 256) != 0;

      int var13;
      int var15;
      int var20;
      int var85;
      short var92;
      for(int var12 = 0; var12 < this.anInt9300; ++var12) {
         var13 = var9[var12];
         Class171 var14 = null;
         var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         byte var18 = 0;
         boolean var19;
         if(var2.aClass185Array1962 != null) {
            var19 = false;

            for(var20 = 0; var20 < var2.aClass185Array1962.length; ++var20) {
               Class185 var21 = var2.aClass185Array1962[var20];
               if(var13 == var21.anInt2119 * 900019051) {
                  Class386 var22 = var8.method352(var21.anInt2121 * 1134790901, 2096836700);
                  if(var22.aBool4046) {
                     var19 = true;
                  }

                  if(var22.anInt4040 * 781750353 != -1) {
                     Class171 var23 = var7.method2122(var22.anInt4040 * 781750353, (byte)18);
                     if(var23.aClass593_1982 == Class593.aClass593_7815) {
                        this.aBool9331 = true;
                     }
                  }
               }
            }

            if(var19) {
               var80[var12] = Long.MAX_VALUE;
               --this.anInt9312;
               continue;
            }
         }

         if(var2.aClass182Array1960 != null) {
            var19 = false;

            for(var20 = 0; var20 < var2.aClass182Array1960.length; ++var20) {
               Class182 var95 = var2.aClass182Array1960[var20];
               if(var13 == var95.anInt2081 * -664328139) {
                  Class385 var100 = this.aClass174_Sub3_9284.anInterface49_2040.method353(var95.anInt2082 * 274808845, (byte)1);
                  if(var100.aBool4012) {
                     var19 = true;
                  }
               }
            }

            if(var19) {
               var80[var12] = Long.MAX_VALUE;
               --this.anInt9312;
               continue;
            }
         }

         var92 = -1;
         if(var2.aShortArray1941 != null) {
            var92 = var2.aShortArray1941[var13];
            if(var92 != -1) {
               var14 = var7.method2122(var92 & '\uffff', (byte)-7);
               if((this.anInt9285 & 64) != 0 && var14.aBool1981) {
                  var92 = -1;
                  var14 = null;
               } else {
                  var17 = var14.aByte1966;
                  var18 = var14.aByte1970;
               }
            }
         }

         boolean var94 = var2.aByteArray1938 != null && var2.aByteArray1938[var13] != 0 || var14 != null && var14.aClass593_1982 != Class593.aClass593_7817;
         if((var81 || var94) && var2.aByteArray1937 != null) {
            var15 += var2.aByteArray1937[var13] << 17;
         }

         if(var94) {
            var15 += 65536;
         }

         var15 += (var17 & 255) << 8;
         var15 += var18 & 255;
         var85 = var16 + ((var92 & '\uffff') << 16);
         var85 += var12 & '\uffff';
         var80[var12] = ((long)var15 << 32) + (long)var85;
         this.aBool9331 |= var94;
         this.aBool9324 |= var14 != null && (var14.aByte1986 != 0 || var14.aByte1963 != 0);
      }

      Class569.method6839(var80, var9, -124676229);
      this.anInt9357 = var2.anInt1918;
      this.anInt9287 = var2.anInt1919;
      this.anIntArray9291 = var2.anIntArray1920;
      this.anIntArray9286 = var2.anIntArray1921;
      this.anIntArray9307 = var2.anIntArray1939;
      this.aShortArray9295 = var2.aShortArray1925;
      Class377[] var82 = new Class377[this.anInt9287];
      this.aClass182Array9341 = var2.aClass182Array1960;
      this.aClass141Array9314 = var2.aClass141Array1961;
      int var87;
      if(var2.aClass185Array1962 != null) {
         this.anInt9313 = var2.aClass185Array1962.length;
         this.aClass360Array9344 = new Class360[this.anInt9313];
         this.aClass352Array9326 = new Class352[this.anInt9313];

         for(var13 = 0; var13 < this.anInt9313; ++var13) {
            Class185 var83 = var2.aClass185Array1962[var13];
            Class386 var86 = var8.method352(var83.anInt2121 * 1134790901, 1800296552);
            var85 = -1;

            for(var87 = 0; var87 < this.anInt9300; ++var87) {
               if(var9[var87] == var83.anInt2119 * 900019051) {
                  var85 = var87;
                  break;
               }
            }

            if(var85 == -1) {
               throw new RuntimeException();
            }

            var87 = Class661.anIntArray8516[var2.aShortArray1940[var83.anInt2119 * 900019051] & '\uffff'] & 16777215;
            var87 |= 255 - (var2.aByteArray1938 != null?var2.aByteArray1938[var83.anInt2119 * 900019051]:0) << 24;
            this.aClass360Array9344[var13] = new Class360(var85, var2.aShortArray1930[var83.anInt2119 * 900019051], var2.aShortArray1931[var83.anInt2119 * 900019051], var2.aShortArray1932[var83.anInt2119 * 900019051], var86.anInt4041 * 511067987, var86.anInt4039 * -1102518277, var86.anInt4040 * 781750353, var86.anInt4043 * 580363603, var86.anInt4042 * 992174873, var86.aBool4046, var86.aBool4045, var83.anInt2118 * 641681561);
            this.aClass352Array9326[var13] = new Class352(var87);
         }
      }

      var13 = this.anInt9300 * 3;
      this.aShortArray9297 = new short[var13];
      this.aShortArray9282 = new short[var13];
      this.aShortArray9358 = new short[var13];
      this.aShortArray9292 = new short[var13];
      this.aShortArray9301 = new short[var13];
      this.aByteArray9302 = new byte[var13];
      this.aFloatArray9303 = new float[var13];
      this.aFloatArray9304 = new float[var13];
      this.aShortArray9308 = new short[this.anInt9300];
      this.aByteArray9309 = new byte[this.anInt9300];
      this.aShortArray9310 = new short[this.anInt9300];
      this.aShortArray9311 = new short[this.anInt9300];
      this.aShortArray9345 = new short[this.anInt9300];
      this.aShortArray9342 = new short[this.anInt9300];
      if(var2.aShortArray1917 != null) {
         this.aShortArray9315 = new short[this.anInt9300];
      }

      this.aShort9343 = (short)var4;
      this.aShort9288 = (short)var5;
      this.aShortArray9299 = new short[var13];
      this.aLongArray9347 = new long[var13];
      int var84 = 0;

      for(var15 = 0; var15 < var2.anInt1919; ++var15) {
         var85 = this.anIntArray9339[var15];
         this.anIntArray9339[var15] = var84;
         var84 += var85;
         var82[var15] = new Class377();
      }

      this.anIntArray9339[var2.anInt1919] = var84;
      Class180 var88 = this.method1945(var2, var9, this.anInt9300);
      Class365[] var89 = new Class365[var2.anInt1929];

      short var90;
      short var96;
      int var97;
      int var103;
      for(var87 = 0; var87 < var2.anInt1929; ++var87) {
         var90 = var2.aShortArray1930[var87];
         var92 = var2.aShortArray1931[var87];
         var96 = var2.aShortArray1932[var87];
         var97 = this.anIntArray9291[var92] - this.anIntArray9291[var90];
         int var101 = this.anIntArray9286[var92] - this.anIntArray9286[var90];
         var103 = this.anIntArray9307[var92] - this.anIntArray9307[var90];
         int var24 = this.anIntArray9291[var96] - this.anIntArray9291[var90];
         int var25 = this.anIntArray9286[var96] - this.anIntArray9286[var90];
         int var26 = this.anIntArray9307[var96] - this.anIntArray9307[var90];
         int var27 = var101 * var26 - var25 * var103;
         int var28 = var103 * var24 - var26 * var97;

         int var29;
         for(var29 = var97 * var25 - var24 * var101; var27 > 8192 || var28 > 8192 || var29 > 8192 || var27 < -8192 || var28 < -8192 || var29 < -8192; var29 >>= 1) {
            var27 >>= 1;
            var28 >>= 1;
         }

         int var30 = (int)Math.sqrt((double)(var27 * var27 + var28 * var28 + var29 * var29));
         if(var30 <= 0) {
            var30 = 1;
         }

         var27 = var27 * 256 / var30;
         var28 = var28 * 256 / var30;
         var29 = var29 * 256 / var30;
         byte var31 = var2.aByteArray1936 == null?0:var2.aByteArray1936[var87];
         if(var31 == 0) {
            Class377 var32 = var82[var90];
            var32.anInt3915 += var27;
            var32.anInt3914 += var28;
            var32.anInt3916 += var29;
            ++var32.anInt3917;
            var32 = var82[var92];
            var32.anInt3915 += var27;
            var32.anInt3914 += var28;
            var32.anInt3916 += var29;
            ++var32.anInt3917;
            var32 = var82[var96];
            var32.anInt3915 += var27;
            var32.anInt3914 += var28;
            var32.anInt3916 += var29;
            ++var32.anInt3917;
         } else if(var31 == 1) {
            Class365 var108 = var89[var87] = new Class365();
            var108.anInt3859 = var27;
            var108.anInt3860 = var28;
            var108.anInt3858 = var29;
         }
      }

      int var98;
      for(var87 = 0; var87 < this.anInt9300; ++var87) {
         int var91 = var9[var87];
         var98 = var2.aShortArray1940[var91] & '\uffff';
         var20 = var2.aByteArray1938 != null?var2.aByteArray1938[var91] & 255:0;
         short var99 = var2.aShortArray1941 == null?-1:var2.aShortArray1941[var91];
         if(var99 != -1 && (this.anInt9285 & 64) != 0 && var7.method2122(var99, (byte)-32).aBool1981) {
            var99 = -1;
         }

         float var104 = 0.0F;
         float var105 = 0.0F;
         float var106 = 0.0F;
         float var107 = 0.0F;
         float var109 = 0.0F;
         float var33 = 0.0F;
         long var38;
         long var40;
         long var42;
         short var45;
         if(var99 != -1) {
            short var34 = var2.aShortArray1943 != null?var2.aShortArray1943[var91]:-1;
            int var35;
            if(var34 == 32766) {
               var35 = var2.aByteArray1933[var91] & 255;
               int var36 = var2.aByteArray1934[var91] & 255;
               int var37 = var2.aByteArray1952[var91] & 255;
               var35 += var2.anIntArray1923[var2.aShortArray1930[var91]];
               var38 = (long)var35;
               var36 += var2.anIntArray1923[var2.aShortArray1931[var91]];
               var40 = (long)var35;
               var37 += var2.anIntArray1923[var2.aShortArray1932[var91]];
               var42 = (long)var35;
               var104 = var2.aFloatArray1914[var35];
               var105 = var2.aFloatArray1928[var35];
               var106 = var2.aFloatArray1914[var36];
               var107 = var2.aFloatArray1928[var36];
               var109 = var2.aFloatArray1914[var37];
               var33 = var2.aFloatArray1928[var37];
            } else if(var34 == -1) {
               var104 = 0.0F;
               var105 = 1.0F;
               var38 = 65535L;
               var106 = 1.0F;
               var107 = 1.0F;
               var40 = 131071L;
               var109 = 0.0F;
               var33 = 0.0F;
               var42 = 196607L;
            } else {
               int var110 = var34 & '\uffff';
               var35 = 0;
               byte var112 = 0;
               byte var114 = 0;
               byte var44 = var2.aByteArray1948[var110];
               short var46;
               short var47;
               float var53;
               float var54;
               float var55;
               float var65;
               float var66;
               float var67;
               float var68;
               float var69;
               float var70;
               if(var44 == 0) {
                  var45 = var2.aShortArray1930[var91];
                  var46 = var2.aShortArray1931[var91];
                  var47 = var2.aShortArray1932[var91];
                  short var48 = var2.aShortArray1944[var110];
                  short var49 = var2.aShortArray1927[var110];
                  short var50 = var2.aShortArray1953[var110];
                  float var51 = (float)var2.anIntArray1920[var48];
                  float var52 = (float)var2.anIntArray1921[var48];
                  var53 = (float)var2.anIntArray1939[var48];
                  var54 = (float)var2.anIntArray1920[var49] - var51;
                  var55 = (float)var2.anIntArray1921[var49] - var52;
                  float var56 = (float)var2.anIntArray1939[var49] - var53;
                  float var57 = (float)var2.anIntArray1920[var50] - var51;
                  float var58 = (float)var2.anIntArray1921[var50] - var52;
                  float var59 = (float)var2.anIntArray1939[var50] - var53;
                  float var60 = (float)var2.anIntArray1920[var45] - var51;
                  float var61 = (float)var2.anIntArray1921[var45] - var52;
                  float var62 = (float)var2.anIntArray1939[var45] - var53;
                  float var63 = (float)var2.anIntArray1920[var46] - var51;
                  float var64 = (float)var2.anIntArray1921[var46] - var52;
                  var65 = (float)var2.anIntArray1939[var46] - var53;
                  var66 = (float)var2.anIntArray1920[var47] - var51;
                  var67 = (float)var2.anIntArray1921[var47] - var52;
                  var68 = (float)var2.anIntArray1939[var47] - var53;
                  var69 = var55 * var59 - var56 * var58;
                  var70 = var56 * var57 - var54 * var59;
                  float var71 = var54 * var58 - var55 * var57;
                  float var72 = var58 * var71 - var59 * var70;
                  float var73 = var59 * var69 - var57 * var71;
                  float var74 = var57 * var70 - var58 * var69;
                  float var75 = 1.0F / (var72 * var54 + var73 * var55 + var74 * var56);
                  var104 = (var72 * var60 + var73 * var61 + var74 * var62) * var75;
                  var106 = (var72 * var63 + var73 * var64 + var74 * var65) * var75;
                  var109 = (var72 * var66 + var73 * var67 + var74 * var68) * var75;
                  var72 = var55 * var71 - var56 * var70;
                  var73 = var56 * var69 - var54 * var71;
                  var74 = var54 * var70 - var55 * var69;
                  var75 = 1.0F / (var72 * var57 + var73 * var58 + var74 * var59);
                  var105 = (var72 * var60 + var73 * var61 + var74 * var62) * var75;
                  var107 = (var72 * var63 + var73 * var64 + var74 * var65) * var75;
                  var33 = (var72 * var66 + var73 * var67 + var74 * var68) * var75;
               } else {
                  var45 = var2.aShortArray1930[var91];
                  var46 = var2.aShortArray1931[var91];
                  var47 = var2.aShortArray1932[var91];
                  int var118 = var88.anIntArray2075[var110];
                  int var119 = var88.anIntArray2072[var110];
                  int var120 = var88.anIntArray2073[var110];
                  float[] var121 = var88.aFloatArrayArray2074[var110];
                  byte var122 = var2.aByteArray1959[var110];
                  var53 = (float)var2.anIntArray1955[var110] / 256.0F;
                  if(var44 == 1) {
                     var54 = (float)var2.anIntArray1954[var110] / 1024.0F;
                     method1961(var2.anIntArray1920[var45], var2.anIntArray1921[var45], var2.anIntArray1939[var45], var118, var119, var120, var121, var54, var122, var53, this.aFloatArray9348);
                     var104 = this.aFloatArray9348[0];
                     var105 = this.aFloatArray9348[1];
                     method1961(var2.anIntArray1920[var46], var2.anIntArray1921[var46], var2.anIntArray1939[var46], var118, var119, var120, var121, var54, var122, var53, this.aFloatArray9348);
                     var106 = this.aFloatArray9348[0];
                     var107 = this.aFloatArray9348[1];
                     method1961(var2.anIntArray1920[var47], var2.anIntArray1921[var47], var2.anIntArray1939[var47], var118, var119, var120, var121, var54, var122, var53, this.aFloatArray9348);
                     var109 = this.aFloatArray9348[0];
                     var33 = this.aFloatArray9348[1];
                     var55 = var54 / 2.0F;
                     if((var122 & 1) == 0) {
                        if(var106 - var104 > var55) {
                           var106 -= var54;
                           var112 = 1;
                        } else if(var104 - var106 > var55) {
                           var106 += var54;
                           var112 = 2;
                        }

                        if(var109 - var104 > var55) {
                           var109 -= var54;
                           var114 = 1;
                        } else if(var104 - var109 > var55) {
                           var109 += var54;
                           var114 = 2;
                        }
                     } else {
                        if(var107 - var105 > var55) {
                           var107 -= var54;
                           var112 = 1;
                        } else if(var105 - var107 > var55) {
                           var107 += var54;
                           var112 = 2;
                        }

                        if(var33 - var105 > var55) {
                           var33 -= var54;
                           var114 = 1;
                        } else if(var105 - var33 > var55) {
                           var33 += var54;
                           var114 = 2;
                        }
                     }
                  } else if(var44 == 2) {
                     var54 = (float)var2.anIntArray1956[var110] / 256.0F;
                     var55 = (float)var2.anIntArray1957[var110] / 256.0F;
                     int var123 = var2.anIntArray1920[var46] - var2.anIntArray1920[var45];
                     int var124 = var2.anIntArray1921[var46] - var2.anIntArray1921[var45];
                     int var125 = var2.anIntArray1939[var46] - var2.anIntArray1939[var45];
                     int var126 = var2.anIntArray1920[var47] - var2.anIntArray1920[var45];
                     int var127 = var2.anIntArray1921[var47] - var2.anIntArray1921[var45];
                     int var128 = var2.anIntArray1939[var47] - var2.anIntArray1939[var45];
                     int var129 = var124 * var128 - var127 * var125;
                     int var130 = var125 * var126 - var128 * var123;
                     int var131 = var123 * var127 - var126 * var124;
                     var65 = 64.0F / (float)var2.anIntArray1945[var110];
                     var66 = 64.0F / (float)var2.anIntArray1935[var110];
                     var67 = 64.0F / (float)var2.anIntArray1954[var110];
                     var68 = ((float)var129 * var121[0] + (float)var130 * var121[1] + (float)var131 * var121[2]) / var65;
                     var69 = ((float)var129 * var121[3] + (float)var130 * var121[4] + (float)var131 * var121[5]) / var66;
                     var70 = ((float)var129 * var121[6] + (float)var130 * var121[7] + (float)var131 * var121[8]) / var67;
                     var35 = method1943(var68, var69, var70);
                     method1944(var2.anIntArray1920[var45], var2.anIntArray1921[var45], var2.anIntArray1939[var45], var118, var119, var120, var35, var121, var122, var53, var54, var55, this.aFloatArray9348);
                     var104 = this.aFloatArray9348[0];
                     var105 = this.aFloatArray9348[1];
                     method1944(var2.anIntArray1920[var46], var2.anIntArray1921[var46], var2.anIntArray1939[var46], var118, var119, var120, var35, var121, var122, var53, var54, var55, this.aFloatArray9348);
                     var106 = this.aFloatArray9348[0];
                     var107 = this.aFloatArray9348[1];
                     method1944(var2.anIntArray1920[var47], var2.anIntArray1921[var47], var2.anIntArray1939[var47], var118, var119, var120, var35, var121, var122, var53, var54, var55, this.aFloatArray9348);
                     var109 = this.aFloatArray9348[0];
                     var33 = this.aFloatArray9348[1];
                  } else if(var44 == 3) {
                     method2062(var2.anIntArray1920[var45], var2.anIntArray1921[var45], var2.anIntArray1939[var45], var118, var119, var120, var121, var122, var53, this.aFloatArray9348);
                     var104 = this.aFloatArray9348[0];
                     var105 = this.aFloatArray9348[1];
                     method2062(var2.anIntArray1920[var46], var2.anIntArray1921[var46], var2.anIntArray1939[var46], var118, var119, var120, var121, var122, var53, this.aFloatArray9348);
                     var106 = this.aFloatArray9348[0];
                     var107 = this.aFloatArray9348[1];
                     method2062(var2.anIntArray1920[var47], var2.anIntArray1921[var47], var2.anIntArray1939[var47], var118, var119, var120, var121, var122, var53, this.aFloatArray9348);
                     var109 = this.aFloatArray9348[0];
                     var33 = this.aFloatArray9348[1];
                     if((var122 & 1) == 0) {
                        if(var106 - var104 > 0.5F) {
                           --var106;
                           var112 = 1;
                        } else if(var104 - var106 > 0.5F) {
                           ++var106;
                           var112 = 2;
                        }

                        if(var109 - var104 > 0.5F) {
                           --var109;
                           var114 = 1;
                        } else if(var104 - var109 > 0.5F) {
                           ++var109;
                           var114 = 2;
                        }
                     } else {
                        if(var107 - var105 > 0.5F) {
                           --var107;
                           var112 = 1;
                        } else if(var105 - var107 > 0.5F) {
                           ++var107;
                           var112 = 2;
                        }

                        if(var33 - var105 > 0.5F) {
                           --var33;
                           var114 = 1;
                        } else if(var105 - var33 > 0.5F) {
                           ++var33;
                           var114 = 2;
                        }
                     }
                  }
               }

               var38 = (long)(var35 << 16 | var110);
               var40 = (long)(var112 << 19) | var38;
               var42 = (long)(var114 << 19) | var38;
            }
         } else {
            var42 = 0L;
            var40 = 0L;
            var38 = 0L;
         }

         byte var111 = var2.aByteArray1936 != null?var2.aByteArray1936[var91]:0;
         if(var111 == 0) {
            long var76 = (long)((var98 << 8) + var20);
            short var115 = var2.aShortArray1930[var91];
            short var116 = var2.aShortArray1931[var91];
            var45 = var2.aShortArray1932[var91];
            Class377 var117 = var82[var115];
            this.aShortArray9310[var87] = this.method8521(var2, var115, var87, var76 | var38 << 24, var117.anInt3915, var117.anInt3914, var117.anInt3916, var117.anInt3917, var104, var105);
            var117 = var82[var116];
            this.aShortArray9311[var87] = this.method8521(var2, var116, var87, var76 | var40 << 24, var117.anInt3915, var117.anInt3914, var117.anInt3916, var117.anInt3917, var106, var107);
            var117 = var82[var45];
            this.aShortArray9345[var87] = this.method8521(var2, var45, var87, var76 | var42 << 24, var117.anInt3915, var117.anInt3914, var117.anInt3916, var117.anInt3917, var109, var33);
         } else if(var111 == 1) {
            Class365 var113 = var89[var91];
            long var78 = ((long)(var113.anInt3859 & Integer.MIN_VALUE) << 9) + ((long)(var113.anInt3860 + 256) << 32) + ((long)(var113.anInt3858 + 256) << 24) + (long)(var98 << 8) + (long)var20;
            this.aShortArray9310[var87] = this.method8521(var2, var2.aShortArray1930[var91], var87, var78 | var38 << 41, var113.anInt3859, var113.anInt3860, var113.anInt3858, 0, var104, var105);
            this.aShortArray9311[var87] = this.method8521(var2, var2.aShortArray1931[var91], var87, var78 | var38 << 41, var113.anInt3859, var113.anInt3860, var113.anInt3858, 0, var106, var107);
            this.aShortArray9345[var87] = this.method8521(var2, var2.aShortArray1932[var91], var87, var78 | var38 << 41, var113.anInt3859, var113.anInt3860, var113.anInt3858, 0, var109, var33);
         }

         if(var2.aByteArray1938 != null) {
            this.aByteArray9309[var87] = var2.aByteArray1938[var91];
         }

         if(var2.aShortArray1917 != null) {
            this.aShortArray9315[var87] = var2.aShortArray1917[var91];
         }

         this.aShortArray9308[var87] = var2.aShortArray1940[var91];
         this.aShortArray9342[var87] = var99;
      }

      if(this.anInt9312 > 0) {
         var87 = 1;
         var90 = this.aShortArray9342[0];

         for(var98 = 0; var98 < this.anInt9312; ++var98) {
            var96 = this.aShortArray9342[var98];
            if(var96 != var90) {
               ++var87;
               var90 = var96;
            }
         }

         this.anIntArray9337 = new int[var87];
         this.anIntArray9338 = new int[var87];
         this.anIntArray9336 = new int[var87 + 1];
         this.anIntArray9336[0] = 0;
         var98 = this.anInt9296;
         var20 = 0;
         var87 = 0;
         var90 = this.aShortArray9342[0];

         for(var97 = 0; var97 < this.anInt9312; ++var97) {
            short var102 = this.aShortArray9342[var97];
            if(var102 != var90) {
               this.anIntArray9337[var87] = var98;
               this.anIntArray9338[var87] = var20 - var98 + 1;
               ++var87;
               this.anIntArray9336[var87] = var97;
               var98 = this.anInt9296;
               var20 = 0;
               var90 = var102;
            }

            var103 = this.aShortArray9310[var97] & '\uffff';
            if(var103 < var98) {
               var98 = var103;
            }

            if(var103 > var20) {
               var20 = var103;
            }

            var103 = this.aShortArray9311[var97] & '\uffff';
            if(var103 < var98) {
               var98 = var103;
            }

            if(var103 > var20) {
               var20 = var103;
            }

            var103 = this.aShortArray9345[var97] & '\uffff';
            if(var103 < var98) {
               var98 = var103;
            }

            if(var103 > var20) {
               var20 = var103;
            }
         }

         this.anIntArray9337[var87] = var98;
         this.anIntArray9338[var87] = var20 - var98 + 1;
         ++var87;
         this.anIntArray9336[var87] = this.anInt9312;
      }

      this.aLongArray9347 = null;
      this.aShortArray9297 = method8541(this.aShortArray9297, this.anInt9296);
      this.aShortArray9282 = method8541(this.aShortArray9282, this.anInt9296);
      this.aShortArray9358 = method8541(this.aShortArray9358, this.anInt9296);
      this.aShortArray9292 = method8541(this.aShortArray9292, this.anInt9296);
      this.aShortArray9301 = method8541(this.aShortArray9301, this.anInt9296);
      this.aByteArray9302 = method8522(this.aByteArray9302, this.anInt9296);
      this.aFloatArray9303 = method8538(this.aFloatArray9303, this.anInt9296);
      this.aFloatArray9304 = method8538(this.aFloatArray9304, this.anInt9296);
      if(var2.anIntArray1924 != null && Class336.method4298(var3, this.anInt9285)) {
         this.anIntArrayArray9294 = var2.method2136(false);
      }

      if(var2.aClass185Array1962 != null && Class336.method4341(var3, this.anInt9285)) {
         this.anIntArrayArray9346 = var2.method2145();
      }

      if(var2.anIntArray1949 != null && Class336.method4297(var3, this.anInt9285)) {
         var87 = 0;
         int[] var93 = new int[256];

         for(var98 = 0; var98 < this.anInt9300; ++var98) {
            var20 = var2.anIntArray1949[var9[var98]];
            if(var20 >= 0) {
               ++var93[var20];
               if(var20 > var87) {
                  var87 = var20;
               }
            }
         }

         this.anIntArrayArray9350 = new int[var87 + 1][];

         for(var98 = 0; var98 <= var87; ++var98) {
            this.anIntArrayArray9350[var98] = new int[var93[var98]];
            var93[var98] = 0;
         }

         for(var98 = 0; var98 < this.anInt9300; ++var98) {
            var20 = var2.anIntArray1949[var9[var98]];
            if(var20 >= 0) {
               this.anIntArrayArray9350[var20][var93[var20]++] = var98;
            }
         }
      }

   }

   short method8521(Class170 var1, int var2, int var3, long var4, int var6, int var7, int var8, int var9, float var10, float var11) {
      int var12 = this.anIntArray9339[var2];
      int var13 = this.anIntArray9339[var2 + 1];
      int var14 = 0;

      for(int var15 = var12; var15 < var13; ++var15) {
         if(this.aShortArray9299[var15] == 0) {
            var14 = var15;
            break;
         }

         int var16 = (this.aShortArray9299[var15] & '\uffff') - 1;
         if(this.aLongArray9347[var15] == var4) {
            return (short)var16;
         }
      }

      this.aShortArray9299[var14] = (short)(this.anInt9296 + 1);
      this.aLongArray9347[var14] = var4;
      this.aShortArray9282[this.anInt9296] = (short)var3;
      this.aShortArray9297[this.anInt9296] = (short)var2;
      this.aShortArray9358[this.anInt9296] = (short)var6;
      this.aShortArray9292[this.anInt9296] = (short)var7;
      this.aShortArray9301[this.anInt9296] = (short)var8;
      this.aByteArray9302[this.anInt9296] = (byte)var9;
      this.aFloatArray9303[this.anInt9296] = var10;
      this.aFloatArray9304[this.anInt9296] = var11;
      return (short)(this.anInt9296++);
   }

   static byte[] method8522(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public Class141[] method2094() {
      return this.aClass141Array9314;
   }

   public void method2015(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9286[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9286[var4] = this.anIntArray9286[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public int method2101() {
      return this.anInt9353;
   }

   public void method2110(int var1) {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3883 = Class336.method4285(var1, this.anInt9285);
      }

      if(this.aClass371_9323 != null) {
         this.aClass371_9323.aBool3883 = Class336.method4288(var1, this.anInt9285);
      }

      if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3883 = Class336.method4287(var1, this.anInt9285);
      }

      if(this.aClass371_9319 != null) {
         this.aClass371_9319.aBool3883 = Class336.method4286(var1, this.anInt9285);
      }

      this.anInt9353 = var1;
      if(this.aClass368_9305 != null && (this.anInt9353 & 65536) == 0) {
         this.aShortArray9358 = this.aClass368_9305.aShortArray3871;
         this.aShortArray9292 = this.aClass368_9305.aShortArray3870;
         this.aShortArray9301 = this.aClass368_9305.aShortArray3872;
         this.aByteArray9302 = this.aClass368_9305.aByteArray3869;
         this.aClass368_9305 = null;
      }

      this.aBool9322 = true;
      this.method8525();
   }

   public void method1950() {
      if(this.anInt9296 > 0 && this.anInt9312 > 0) {
         this.method8532();
         this.method8539();
         this.method8525();
      }
   }

   boolean method8523(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return var4 < var5 && var4 < var6 && var4 < var7?false:(var2 > var5 && var2 > var6 && var2 > var7?false:(var3 < var8 && var3 < var9 && var3 < var10?false:var1 <= var8 || var1 <= var9 || var1 <= var10));
   }

   Class168 method8524(Class168_Sub2 var1, Class168_Sub2 var2, int var3, boolean var4, boolean var5) {
      var1.anInt9353 = var3;
      var1.anInt9285 = this.anInt9285;
      var1.aShort9343 = this.aShort9343;
      var1.aShort9288 = this.aShort9288;
      var1.anInt9357 = this.anInt9357;
      var1.anInt9287 = this.anInt9287;
      var1.anInt9296 = this.anInt9296;
      var1.anInt9300 = this.anInt9300;
      var1.anInt9312 = this.anInt9312;
      var1.anInt9313 = this.anInt9313;
      if((var3 & 256) != 0) {
         var1.aBool9331 = true;
      } else {
         var1.aBool9331 = this.aBool9331;
      }

      var1.aBool9324 = this.aBool9324;
      boolean var6 = Class336.method4268(var3, this.anInt9285);
      boolean var7 = Class336.method4269(var3, this.anInt9285);
      boolean var8 = Class336.method4353(var3, this.anInt9285);
      boolean var9 = var6 | var7 | var8;
      int var10;
      if(var9) {
         if(var6) {
            if(var2.anIntArray9291 != null && var2.anIntArray9291.length >= this.anInt9357) {
               var1.anIntArray9291 = var2.anIntArray9291;
            } else {
               var1.anIntArray9291 = var2.anIntArray9291 = new int[this.anInt9357];
            }
         } else {
            var1.anIntArray9291 = this.anIntArray9291;
         }

         if(var7) {
            if(var2.anIntArray9286 != null && var2.anIntArray9286.length >= this.anInt9357) {
               var1.anIntArray9286 = var2.anIntArray9286;
            } else {
               var1.anIntArray9286 = var2.anIntArray9286 = new int[this.anInt9357];
            }
         } else {
            var1.anIntArray9286 = this.anIntArray9286;
         }

         if(var8) {
            if(var2.anIntArray9307 != null && var2.anIntArray9307.length >= this.anInt9357) {
               var1.anIntArray9307 = var2.anIntArray9307;
            } else {
               var1.anIntArray9307 = var2.anIntArray9307 = new int[this.anInt9357];
            }
         } else {
            var1.anIntArray9307 = this.anIntArray9307;
         }

         for(var10 = 0; var10 < this.anInt9357; ++var10) {
            if(var6) {
               var1.anIntArray9291[var10] = this.anIntArray9291[var10];
            }

            if(var7) {
               var1.anIntArray9286[var10] = this.anIntArray9286[var10];
            }

            if(var8) {
               var1.anIntArray9307[var10] = this.anIntArray9307[var10];
            }
         }
      } else {
         var1.anIntArray9291 = this.anIntArray9291;
         var1.anIntArray9286 = this.anIntArray9286;
         var1.anIntArray9307 = this.anIntArray9307;
      }

      if(Class336.method4285(var3, this.anInt9285)) {
         var1.aClass371_9298 = var2.aClass371_9298;
         var1.aClass371_9298.anInterface35_3885 = this.aClass371_9298.anInterface35_3885;
         var1.aClass371_9298.aBool3884 = this.aClass371_9298.aBool3884;
         var1.aClass371_9298.aBool3883 = true;
      } else if(Class336.method4280(var3, this.anInt9285)) {
         var1.aClass371_9298 = this.aClass371_9298;
      } else {
         var1.aClass371_9298 = null;
      }

      if(Class336.method4273(var3, this.anInt9285)) {
         if(var2.aShortArray9308 != null && var2.aShortArray9308.length >= this.anInt9300) {
            var1.aShortArray9308 = var2.aShortArray9308;
         } else {
            var1.aShortArray9308 = var2.aShortArray9308 = new short[this.anInt9300];
         }

         for(var10 = 0; var10 < this.anInt9300; ++var10) {
            var1.aShortArray9308[var10] = this.aShortArray9308[var10];
         }
      } else {
         var1.aShortArray9308 = this.aShortArray9308;
      }

      if(Class336.method4274(var3, this.anInt9285)) {
         if(var2.aByteArray9309 != null && var2.aByteArray9309.length >= this.anInt9300) {
            var1.aByteArray9309 = var2.aByteArray9309;
         } else {
            var1.aByteArray9309 = var2.aByteArray9309 = new byte[this.anInt9300];
         }

         for(var10 = 0; var10 < this.anInt9300; ++var10) {
            var1.aByteArray9309[var10] = this.aByteArray9309[var10];
         }
      } else {
         var1.aByteArray9309 = this.aByteArray9309;
      }

      if(Class336.method4287(var3, this.anInt9285)) {
         var1.aClass371_9318 = var2.aClass371_9318;
         var1.aClass371_9318.anInterface35_3885 = this.aClass371_9318.anInterface35_3885;
         var1.aClass371_9318.aBool3884 = this.aClass371_9318.aBool3884;
         var1.aClass371_9318.aBool3883 = true;
      } else if(Class336.method4282(var3, this.anInt9285)) {
         var1.aClass371_9318 = this.aClass371_9318;
      } else {
         var1.aClass371_9318 = null;
      }

      int var11;
      if(Class336.method4272(var3, this.anInt9285)) {
         if(var2.aShortArray9358 != null && var2.aShortArray9358.length >= this.anInt9296) {
            var1.aShortArray9358 = var2.aShortArray9358;
            var1.aShortArray9292 = var2.aShortArray9292;
            var1.aShortArray9301 = var2.aShortArray9301;
         } else {
            var10 = this.anInt9296;
            var1.aShortArray9358 = var2.aShortArray9358 = new short[var10];
            var1.aShortArray9292 = var2.aShortArray9292 = new short[var10];
            var1.aShortArray9301 = var2.aShortArray9301 = new short[var10];
         }

         if(this.aClass368_9305 != null) {
            if(var2.aClass368_9305 == null) {
               var2.aClass368_9305 = new Class368();
            }

            Class368 var12 = var1.aClass368_9305 = var2.aClass368_9305;
            if(var12.aShortArray3871 == null || var12.aShortArray3871.length < this.anInt9296) {
               var11 = this.anInt9296;
               var12.aShortArray3871 = new short[var11];
               var12.aShortArray3870 = new short[var11];
               var12.aShortArray3872 = new short[var11];
               var12.aByteArray3869 = new byte[var11];
            }

            for(var11 = 0; var11 < this.anInt9296; ++var11) {
               var1.aShortArray9358[var11] = this.aShortArray9358[var11];
               var1.aShortArray9292[var11] = this.aShortArray9292[var11];
               var1.aShortArray9301[var11] = this.aShortArray9301[var11];
               var12.aShortArray3871[var11] = this.aClass368_9305.aShortArray3871[var11];
               var12.aShortArray3870[var11] = this.aClass368_9305.aShortArray3870[var11];
               var12.aShortArray3872[var11] = this.aClass368_9305.aShortArray3872[var11];
               var12.aByteArray3869[var11] = this.aClass368_9305.aByteArray3869[var11];
            }
         } else {
            var1.aClass368_9305 = null;

            for(var10 = 0; var10 < this.anInt9296; ++var10) {
               var1.aShortArray9358[var10] = this.aShortArray9358[var10];
               var1.aShortArray9292[var10] = this.aShortArray9292[var10];
               var1.aShortArray9301[var10] = this.aShortArray9301[var10];
            }
         }

         var1.aByteArray9302 = this.aByteArray9302;
      } else {
         var1.aClass368_9305 = this.aClass368_9305;
         var1.aShortArray9358 = this.aShortArray9358;
         var1.aShortArray9292 = this.aShortArray9292;
         var1.aShortArray9301 = this.aShortArray9301;
         var1.aByteArray9302 = this.aByteArray9302;
      }

      if(Class336.method4286(var3, this.anInt9285)) {
         var1.aClass371_9319 = var2.aClass371_9319;
         var1.aClass371_9319.anInterface35_3885 = this.aClass371_9319.anInterface35_3885;
         var1.aClass371_9319.aBool3884 = this.aClass371_9319.aBool3884;
         var1.aClass371_9319.aBool3883 = true;
      } else if(Class336.method4281(var3, this.anInt9285)) {
         var1.aClass371_9319 = this.aClass371_9319;
      } else {
         var1.aClass371_9319 = null;
      }

      if(Class336.method4275(var3, this.anInt9285)) {
         if(var2.aFloatArray9303 != null && var2.aFloatArray9303.length >= this.anInt9300) {
            var1.aFloatArray9303 = var2.aFloatArray9303;
            var1.aFloatArray9304 = var2.aFloatArray9304;
         } else {
            var10 = this.anInt9296;
            var1.aFloatArray9303 = var2.aFloatArray9303 = new float[var10];
            var1.aFloatArray9304 = var2.aFloatArray9304 = new float[var10];
         }

         for(var10 = 0; var10 < this.anInt9296; ++var10) {
            var1.aFloatArray9303[var10] = this.aFloatArray9303[var10];
            var1.aFloatArray9304[var10] = this.aFloatArray9304[var10];
         }
      } else {
         var1.aFloatArray9303 = this.aFloatArray9303;
         var1.aFloatArray9304 = this.aFloatArray9304;
      }

      if(Class336.method4288(var3, this.anInt9285)) {
         var1.aClass371_9323 = var2.aClass371_9323;
         var1.aClass371_9323.anInterface35_3885 = this.aClass371_9323.anInterface35_3885;
         var1.aClass371_9323.aBool3884 = this.aClass371_9323.aBool3884;
         var1.aClass371_9323.aBool3883 = true;
      } else if(Class336.method4283(var3, this.anInt9285)) {
         var1.aClass371_9323 = this.aClass371_9323;
      } else {
         var1.aClass371_9323 = null;
      }

      if(Class336.method4319(var3, this.anInt9285)) {
         if(var2.aShortArray9310 != null && var2.aShortArray9310.length >= this.anInt9300) {
            var1.aShortArray9310 = var2.aShortArray9310;
            var1.aShortArray9311 = var2.aShortArray9311;
            var1.aShortArray9345 = var2.aShortArray9345;
         } else {
            var10 = this.anInt9300;
            var1.aShortArray9310 = var2.aShortArray9310 = new short[var10];
            var1.aShortArray9311 = var2.aShortArray9311 = new short[var10];
            var1.aShortArray9345 = var2.aShortArray9345 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt9300; ++var10) {
            var1.aShortArray9310[var10] = this.aShortArray9310[var10];
            var1.aShortArray9311[var10] = this.aShortArray9311[var10];
            var1.aShortArray9345[var10] = this.aShortArray9345[var10];
         }
      } else {
         var1.aShortArray9310 = this.aShortArray9310;
         var1.aShortArray9311 = this.aShortArray9311;
         var1.aShortArray9345 = this.aShortArray9345;
      }

      if(Class336.method4290(var3, this.anInt9285)) {
         var1.aClass343_9316 = var2.aClass343_9316;
         var1.aClass343_9316.anInterface42_3563 = this.aClass343_9316.anInterface42_3563;
         var1.aClass343_9316.aBool3561 = this.aClass343_9316.aBool3561;
         var1.aClass343_9316.aBool3562 = true;
      } else if(Class336.method4284(var3, this.anInt9285)) {
         var1.aClass343_9316 = this.aClass343_9316;
      } else {
         var1.aClass343_9316 = null;
      }

      if(Class336.method4277(var3, this.anInt9285)) {
         if(var2.aShortArray9342 != null && var2.aShortArray9342.length >= this.anInt9300) {
            var1.aShortArray9342 = var2.aShortArray9342;
         } else {
            var10 = this.anInt9300;
            var1.aShortArray9342 = var2.aShortArray9342 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt9300; ++var10) {
            var1.aShortArray9342[var10] = this.aShortArray9342[var10];
         }
      } else {
         var1.aShortArray9342 = this.aShortArray9342;
      }

      if(Class336.method4278(var3, this.anInt9285)) {
         if(var2.aClass352Array9326 != null && var2.aClass352Array9326.length >= this.anInt9313) {
            var1.aClass352Array9326 = var2.aClass352Array9326;

            for(var10 = 0; var10 < this.anInt9313; ++var10) {
               var1.aClass352Array9326[var10].method4564(this.aClass352Array9326[var10]);
            }
         } else {
            var10 = this.anInt9313;
            var1.aClass352Array9326 = var2.aClass352Array9326 = new Class352[var10];

            for(var11 = 0; var11 < this.anInt9313; ++var11) {
               var1.aClass352Array9326[var11] = this.aClass352Array9326[var11].method4563();
            }
         }
      } else {
         var1.aClass352Array9326 = this.aClass352Array9326;
      }

      var1.aClass360Array9344 = this.aClass360Array9344;
      if(this.aBool9327) {
         var1.anInt9325 = this.anInt9325;
         var1.anInt9320 = this.anInt9320;
         var1.anInt9330 = this.anInt9330;
         var1.anInt9293 = this.anInt9293;
         var1.anInt9328 = this.anInt9328;
         var1.anInt9329 = this.anInt9329;
         var1.anInt9332 = this.anInt9332;
         var1.anInt9333 = this.anInt9333;
         var1.aBool9327 = true;
      } else {
         var1.aBool9327 = false;
      }

      if(this.aBool9289) {
         var1.anInt9335 = this.anInt9335;
         var1.aBool9289 = true;
      } else {
         var1.aBool9289 = false;
      }

      var1.anIntArrayArray9294 = this.anIntArrayArray9294;
      var1.anIntArrayArray9350 = this.anIntArrayArray9350;
      var1.anIntArrayArray9346 = this.anIntArrayArray9346;
      var1.aShortArray9299 = this.aShortArray9299;
      var1.anIntArray9339 = this.anIntArray9339;
      var1.aShortArray9297 = this.aShortArray9297;
      var1.aShortArray9282 = this.aShortArray9282;
      var1.aShortArray9295 = this.aShortArray9295;
      var1.aShortArray9315 = this.aShortArray9315;
      var1.anIntArray9336 = this.anIntArray9336;
      var1.anIntArray9338 = this.anIntArray9338;
      var1.anIntArray9337 = this.anIntArray9337;
      var1.aClass182Array9341 = this.aClass182Array9341;
      var1.aClass141Array9314 = this.aClass141Array9314;
      return var1;
   }

   void method8525() {
      if(this.aBool9322) {
         this.aBool9322 = false;
         if(this.aClass182Array9341 == null && this.aClass141Array9314 == null && this.aClass360Array9344 == null && !Class336.method4327(this.anInt9353, this.anInt9285)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if(this.anIntArray9291 != null && !Class336.method4292(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var1 = true;
               }
            }

            if(this.anIntArray9286 != null && !Class336.method4311(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var2 = true;
               }
            }

            if(this.anIntArray9307 != null && !Class336.method4340(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var3 = true;
               }
            }

            if(var1) {
               this.anIntArray9291 = null;
            }

            if(var2) {
               this.anIntArray9286 = null;
            }

            if(var3) {
               this.anIntArray9307 = null;
            }
         }

         if(this.aShortArray9299 != null && this.anIntArray9291 == null && this.anIntArray9286 == null && this.anIntArray9307 == null) {
            this.aShortArray9299 = null;
            this.anIntArray9339 = null;
         }

         if(this.aByteArray9302 != null && !Class336.method4293(this.anInt9353, this.anInt9285)) {
            label204: {
               label203: {
                  if((this.anInt9285 & 55) != 0) {
                     if(this.aClass371_9319 == null || this.aClass371_9319.method4658()) {
                        break label203;
                     }
                  } else if(this.aClass371_9318 == null || this.aClass371_9318.method4658()) {
                     break label203;
                  }

                  this.aBool9322 = true;
                  break label204;
               }

               this.aShortArray9301 = null;
               this.aShortArray9292 = null;
               this.aShortArray9358 = null;
               this.aByteArray9302 = null;
            }
         }

         if(this.aShortArray9308 != null && !Class336.method4336(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9308 = null;
            }
         }

         if(this.aByteArray9309 != null && !Class336.method4295(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aByteArray9309 = null;
            }
         }

         if(this.aFloatArray9303 != null && !Class336.method4296(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9323 != null && !this.aClass371_9323.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aFloatArray9304 = null;
               this.aFloatArray9303 = null;
            }
         }

         if(this.aShortArray9342 != null && !Class336.method4301(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9342 = null;
            }
         }

         if(this.aShortArray9310 != null && !Class336.method4313(this.anInt9353, this.anInt9285)) {
            if(this.aClass343_9316 != null && !this.aClass343_9316.method4430() || this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9345 = null;
               this.aShortArray9311 = null;
               this.aShortArray9310 = null;
            }
         }

         if(this.aShortArray9297 != null) {
            if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9297 = null;
            }
         }

         if(this.aShortArray9282 != null) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9282 = null;
            }
         }

         if(this.anIntArrayArray9350 != null && !Class336.method4297(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9350 = (int[][])null;
            this.aShortArray9315 = null;
         }

         if(this.anIntArrayArray9294 != null && !Class336.method4298(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9294 = (int[][])null;
            this.aShortArray9295 = null;
         }

         if(this.anIntArrayArray9346 != null && !Class336.method4341(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9346 = (int[][])null;
         }

         if(this.anIntArray9336 != null && (this.anInt9353 & 2048) == 0 && (this.anInt9353 & 262144) == 0) {
            this.anIntArray9336 = null;
            this.anIntArray9338 = null;
            this.anIntArray9337 = null;
         }

      }
   }

   public int method1949() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9328;
   }

   void method8526() {
      if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3884 = false;
      }

   }

   public int method2003() {
      return this.anInt9353;
   }

   void method8527() {
      if(this.aClass343_9316 != null) {
         this.aClass343_9316.aBool3561 = false;
      }

   }

   public void method2054() {
      if(!this.aBool9289) {
         if(!this.aBool9327) {
            this.method8528();
         }

         this.anInt9335 = this.anInt9328;
         this.aBool9289 = true;
      }

   }

   public int method2084() {
      return this.aShort9288;
   }

   public void method2076(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9286[var4] * var3 - this.anIntArray9307[var4] * var2 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9286[var4] * var2 + this.anIntArray9307[var4] * var3 >> 14;
         this.anIntArray9286[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method1954(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9286[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9286[var4] = this.anIntArray9286[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method1955(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 0) {
            this.anIntArray9291[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9286[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9307[var4] += var3;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method1956() {
      int var1;
      for(var1 = 0; var1 < this.anInt9287; ++var1) {
         this.anIntArray9307[var1] = -this.anIntArray9307[var1];
      }

      for(var1 = 0; var1 < this.anInt9296; ++var1) {
         this.aShortArray9301[var1] = (short)(-this.aShortArray9301[var1]);
      }

      for(var1 = 0; var1 < this.anInt9300; ++var1) {
         short var2 = this.aShortArray9310[var1];
         this.aShortArray9310[var1] = this.aShortArray9345[var1];
         this.aShortArray9345[var1] = var2;
      }

      this.method8548();
      this.method8537();
      this.method8527();
      this.aBool9327 = false;
   }

   public void method1957(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 128) {
            this.anIntArray9291[var4] = this.anIntArray9291[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9286[var4] = this.anIntArray9286[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 >> 7;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public int method2082() {
      return this.aShort9288;
   }

   void method8528() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.anInt9287; ++var9) {
         int var10 = this.anIntArray9291[var9];
         int var11 = this.anIntArray9286[var9];
         int var12 = this.anIntArray9307[var9];
         if(var10 < var1) {
            var1 = var10;
         }

         if(var10 > var4) {
            var4 = var10;
         }

         if(var11 < var2) {
            var2 = var11;
         }

         if(var11 > var5) {
            var5 = var11;
         }

         if(var12 < var3) {
            var3 = var12;
         }

         if(var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if(var13 > var7) {
            var7 = var13;
         }

         var13 = var10 * var10 + var12 * var12 + var11 * var11;
         if(var13 > var8) {
            var8 = var13;
         }
      }

      this.anInt9330 = var1;
      this.anInt9293 = var4;
      this.anInt9328 = var2;
      this.anInt9329 = var5;
      this.anInt9332 = var3;
      this.anInt9333 = var6;
      this.anInt9320 = (int)(Math.sqrt((double)var7) + 0.99D);
      this.anInt9325 = (int)(Math.sqrt((double)var8) + 0.99D);
      this.aBool9327 = true;
   }

   public int method2070() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9333;
   }

   public int method2088() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9320;
   }

   public int method2077() {
      return this.aShort9343;
   }

   public int method1979() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9330;
   }

   public int method1980() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9293;
   }

   public int method2038() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9328;
   }

   public int method1988() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9329;
   }

   public int method1983() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9332;
   }

   public int method1984() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9333;
   }

   public int method1985() {
      if(!this.aBool9289) {
         this.method1986();
      }

      return this.anInt9335;
   }

   public void method1999(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub2 var6 = (Class168_Sub2)var1;
      if(this.anInt9300 != 0 && var6.anInt9300 != 0) {
         int var7 = var6.anInt9287;
         int[] var8 = var6.anIntArray9291;
         int[] var9 = var6.anIntArray9286;
         int[] var10 = var6.anIntArray9307;
         short[] var11 = var6.aShortArray9358;
         short[] var12 = var6.aShortArray9292;
         short[] var13 = var6.aShortArray9301;
         byte[] var14 = var6.aByteArray9302;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if(this.aClass368_9305 != null) {
            var15 = this.aClass368_9305.aShortArray3871;
            var16 = this.aClass368_9305.aShortArray3870;
            var17 = this.aClass368_9305.aShortArray3872;
            var18 = this.aClass368_9305.aByteArray3869;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if(var6.aClass368_9305 != null) {
            var19 = var6.aClass368_9305.aShortArray3871;
            var20 = var6.aClass368_9305.aShortArray3870;
            var21 = var6.aClass368_9305.aShortArray3872;
            var22 = var6.aClass368_9305.aByteArray3869;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray9339;
         short[] var24 = var6.aShortArray9299;
         if(!var6.aBool9327) {
            var6.method8528();
         }

         int var25 = var6.anInt9328;
         int var26 = var6.anInt9329;
         int var27 = var6.anInt9330;
         int var28 = var6.anInt9293;
         int var29 = var6.anInt9332;
         int var30 = var6.anInt9333;

         for(int var31 = 0; var31 < this.anInt9287; ++var31) {
            int var32 = this.anIntArray9286[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray9291[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray9307[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray9339[var31];
                     int var37 = this.anIntArray9339[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37 && this.aShortArray9299[var38] != 0; ++var38) {
                        var35 = (this.aShortArray9299[var38] & '\uffff') - 1;
                        if(this.aByteArray9302[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37 && var24[var40] != 0; ++var40) {
                                 var39 = var24[var40] - 1 & '\uffff';
                                 if(var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass368_9305 = new Class368();
                                    var15 = this.aClass368_9305.aShortArray3871 = Class189.method2746(this.aShortArray9358, -1826354755);
                                    var16 = this.aClass368_9305.aShortArray3870 = Class189.method2746(this.aShortArray9292, -794719996);
                                    var17 = this.aClass368_9305.aShortArray3872 = Class189.method2746(this.aShortArray9301, -736075235);
                                    var18 = this.aClass368_9305.aByteArray3869 = Class639_Sub1.method9870(this.aByteArray9302, (byte)-32);
                                 }

                                 if(var19 == null) {
                                    Class368 var46 = var6.aClass368_9305 = new Class368();
                                    var19 = var46.aShortArray3871 = Class189.method2746(var11, -1005316216);
                                    var20 = var46.aShortArray3870 = Class189.method2746(var12, -1762935007);
                                    var21 = var46.aShortArray3872 = Class189.method2746(var13, -1516161914);
                                    var22 = var46.aByteArray3869 = Class639_Sub1.method9870(var14, (byte)-37);
                                 }

                                 short var47 = this.aShortArray9358[var35];
                                 short var41 = this.aShortArray9292[var35];
                                 short var42 = this.aShortArray9301[var35];
                                 byte var43 = this.aByteArray9302[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var47;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var47 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray9339[var31];
                                 var37 = this.anIntArray9339[var31 + 1];

                                 for(var44 = var36; var44 < var37 && this.aShortArray9299[var44] != 0; ++var44) {
                                    var45 = (this.aShortArray9299[var44] & '\uffff') - 1;
                                    if(var18[var45] != 0) {
                                       var15[var45] += var47;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 var6.method8537();
                                 this.method8537();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method1987(int var1) {
      this.aShort9343 = (short)var1;
      this.method8526();
   }

   void method2113() {
      for(int var1 = 0; var1 < this.anInt9357; ++var1) {
         this.anIntArray9291[var1] = this.anIntArray9291[var1] + 7 >> 4;
         this.anIntArray9286[var1] = this.anIntArray9286[var1] + 7 >> 4;
         this.anIntArray9307[var1] = this.anIntArray9307[var1] + 7 >> 4;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public int method2061() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9330;
   }

   public void method1996(Class445 var1) {
      Class433 var2 = this.aClass174_Sub3_9284.aClass433_9705;
      var2.method5110(var1);
      int var3;
      if(this.aClass182Array9341 != null) {
         for(var3 = 0; var3 < this.aClass182Array9341.length; ++var3) {
            Class182 var4 = this.aClass182Array9341[var3];
            Class182 var5 = var4;
            if(var4.aClass182_2080 != null) {
               var5 = var4.aClass182_2080;
            }

            var5.anInt2093 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var4.anInt2086 * -1235344453]) * -1678451107;
            var5.anInt2083 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var4.anInt2086 * -1235344453]) * -670678921;
            var5.anInt2085 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var4.anInt2086 * -1235344453]) * 438141997;
            var5.anInt2087 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var4.anInt2088 * -1119018737]) * 380933187;
            var5.anInt2090 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var4.anInt2088 * -1119018737]) * -1991830625;
            var5.anInt2091 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var4.anInt2088 * -1119018737]) * -1592918039;
            var5.anInt2092 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var4.anInt2084 * 724817697] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var4.anInt2084 * 724817697] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var4.anInt2084 * 724817697]) * -2133088645;
            var5.anInt2079 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var4.anInt2084 * 724817697] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var4.anInt2084 * 724817697] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var4.anInt2084 * 724817697]) * -615490343;
            var5.anInt2094 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var4.anInt2084 * 724817697] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var4.anInt2084 * 724817697] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var4.anInt2084 * 724817697]) * -1023720607;
         }
      }

      if(this.aClass141Array9314 != null) {
         for(var3 = 0; var3 < this.aClass141Array9314.length; ++var3) {
            Class141 var6 = this.aClass141Array9314[var3];
            Class141 var7 = var6;
            if(var6.aClass141_1666 != null) {
               var7 = var6.aClass141_1666;
            }

            if(var6.aClass433_1665 != null) {
               var6.aClass433_1665.method5083(var2);
            } else {
               var6.aClass433_1665 = new Class433(var2);
            }

            var7.anInt1668 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var6.anInt1667 * -1043750635]) * -1843315017;
            var7.anInt1670 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var6.anInt1667 * -1043750635]) * -1977850275;
            var7.anInt1669 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var6.anInt1667 * -1043750635]) * 874542269;
         }
      }

   }

   public void method1973(int var1) {
      this.aShort9288 = (short)var1;
      this.method8548();
      this.method8537();
   }

   public void method1940(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9300; ++var3) {
         if(this.aShortArray9308[var3] == var1) {
            this.aShortArray9308[var3] = var2;
         }
      }

      if(this.aClass360Array9344 != null) {
         for(var3 = 0; var3 < this.anInt9313; ++var3) {
            Class360 var4 = this.aClass360Array9344[var3];
            Class352 var5 = this.aClass352Array9326[var3];
            var5.anInt3664 = var5.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var4.anInt3826] & '\uffff'] & 16777215;
         }
      }

      this.method8526();
   }

   public void method2004(int var1) {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3883 = Class336.method4285(var1, this.anInt9285);
      }

      if(this.aClass371_9323 != null) {
         this.aClass371_9323.aBool3883 = Class336.method4288(var1, this.anInt9285);
      }

      if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3883 = Class336.method4287(var1, this.anInt9285);
      }

      if(this.aClass371_9319 != null) {
         this.aClass371_9319.aBool3883 = Class336.method4286(var1, this.anInt9285);
      }

      this.anInt9353 = var1;
      if(this.aClass368_9305 != null && (this.anInt9353 & 65536) == 0) {
         this.aShortArray9358 = this.aClass368_9305.aShortArray3871;
         this.aShortArray9292 = this.aClass368_9305.aShortArray3870;
         this.aShortArray9301 = this.aClass368_9305.aShortArray3872;
         this.aByteArray9302 = this.aClass368_9305.aByteArray3869;
         this.aClass368_9305 = null;
      }

      this.aBool9322 = true;
      this.method8525();
   }

   public void method1992(short var1, short var2) {
      Class169 var3 = this.aClass174_Sub3_9284.aClass169_2035;

      for(int var4 = 0; var4 < this.anInt9300; ++var4) {
         if(this.aShortArray9342[var4] == var1) {
            this.aShortArray9342[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class171 var6 = var3.method2122(var1 & '\uffff', (byte)5);
         var11 = var6.aByte1969;
         var5 = var6.aByte2012;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class171 var8 = var3.method2122(var2 & '\uffff', (byte)-22);
         var12 = var8.aByte1969;
         var7 = var8.aByte2012;
         if(var8.aByte1986 != 0 || var8.aByte1963 != 0) {
            this.aBool9324 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass360Array9344 != null) {
            for(int var13 = 0; var13 < this.anInt9313; ++var13) {
               Class360 var9 = this.aClass360Array9344[var13];
               Class352 var10 = this.aClass352Array9326[var13];
               var10.anInt3664 = var10.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var9.anInt3826] & '\uffff'] & 16777215;
            }
         }

         this.method8526();
      }

   }

   public void method2020(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.anInt9300; ++var5) {
         int var6 = this.aShortArray9308[var5] & '\uffff';
         int var7 = var6 >> 10 & 63;
         int var8 = var6 >> 7 & 7;
         int var9 = var6 & 127;
         if(var1 != -1) {
            var7 += (var1 - var7) * var4 >> 7;
         }

         if(var2 != -1) {
            var8 += (var2 - var8) * var4 >> 7;
         }

         if(var3 != -1) {
            var9 += (var3 - var9) * var4 >> 7;
         }

         this.aShortArray9308[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.aClass360Array9344 != null) {
         for(var5 = 0; var5 < this.anInt9313; ++var5) {
            Class360 var10 = this.aClass360Array9344[var5];
            Class352 var11 = this.aClass352Array9326[var5];
            var11.anInt3664 = var11.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var10.anInt3826] & '\uffff'] & 16777215;
         }
      }

      this.method8526();
   }

   public boolean method1994() {
      if(this.aShortArray9342 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9342.length; ++var1) {
            if(this.aShortArray9342[var1] != -1 && !this.aClass174_Sub3_9284.aClass346_9775.method4469(this.aClass174_Sub3_9284.aClass169_2035.method2122(this.aShortArray9342[var1], (byte)-63), -1)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method1953() {
      return this.aBool9324;
   }

   void method1960() {
   }

   boolean method2072() {
      if(this.anIntArrayArray9294 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9357; ++var1) {
            this.anIntArray9291[var1] <<= 4;
            this.anIntArray9286[var1] <<= 4;
            this.anIntArray9307[var1] <<= 4;
         }

         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;
         return true;
      }
   }

   void method1970(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var48;
      int[] var50;
      int var51;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var48 = var2[var11];
            if(var48 < this.anIntArrayArray9294.length) {
               var50 = this.anIntArrayArray9294[var48];

               for(var51 = 0; var51 < var50.length; ++var51) {
                  var15 = var50[var51];
                  if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var15]) != 0) {
                     this.anInt9354 += this.anIntArray9291[var15];
                     this.anInt9355 += this.anIntArray9286[var15];
                     this.anInt9356 += this.anIntArray9307[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt9354 = this.anInt9354 / var10 + var3;
            this.anInt9355 = this.anInt9355 / var10 + var4;
            this.anInt9356 = this.anInt9356 / var10 + var5;
            this.aBool9317 = true;
         } else {
            this.anInt9354 = var3;
            this.anInt9355 = var4;
            this.anInt9356 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var48 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var48;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9294.length) {
                  var12 = this.anIntArrayArray9294[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var51 = var12[var13];
                     if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                        this.anIntArray9291[var51] += var3;
                        this.anIntArray9286[var51] += var4;
                        this.anIntArray9307[var51] += var5;
                     }
                  }
               }
            }

         } else {
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var26;
            int var27;
            int var28;
            int var30;
            int var32;
            int var33;
            int var34;
            int[] var35;
            int var36;
            int var37;
            int var38;
            int var39;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9317) {
                     var16 = var8[0] * this.anInt9354 + var8[3] * this.anInt9355 + var8[6] * this.anInt9356 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9354 + var8[4] * this.anInt9355 + var8[7] * this.anInt9356 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9354 + var8[5] * this.anInt9355 + var8[8] * this.anInt9356 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt9354 = var16;
                     this.anInt9355 = var17;
                     this.anInt9356 = var18;
                     this.aBool9317 = false;
                  }

                  int[] var53 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var53[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var53[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var53[2] = var20 * var17 + 8192 >> 14;
                  var53[3] = var17 * var22 + 8192 >> 14;
                  var53[4] = var17 * var21 + 8192 >> 14;
                  var53[5] = -var18;
                  var53[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var53[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var53[8] = var19 * var17 + 8192 >> 14;
                  int var54 = var53[0] * -this.anInt9354 + var53[1] * -this.anInt9355 + var53[2] * -this.anInt9356 + 8192 >> 14;
                  var26 = var53[3] * -this.anInt9354 + var53[4] * -this.anInt9355 + var53[5] * -this.anInt9356 + 8192 >> 14;
                  var27 = var53[6] * -this.anInt9354 + var53[7] * -this.anInt9355 + var53[8] * -this.anInt9356 + 8192 >> 14;
                  var28 = var54 + this.anInt9354;
                  int var55 = var26 + this.anInt9355;
                  var30 = var27 + this.anInt9356;
                  int[] var56 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var57 = 0; var57 < 3; ++var57) {
                           var34 += var53[var32 * 3 + var57] * var8[var33 * 3 + var57];
                        }

                        var56[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var53[0] * var13 + var53[1] * var51 + var53[2] * var15 + 8192 >> 14;
                  var33 = var53[3] * var13 + var53[4] * var51 + var53[5] * var15 + 8192 >> 14;
                  var34 = var53[6] * var13 + var53[7] * var51 + var53[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var55;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var56[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var48;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9294.length) {
                        int[] var41 = this.anIntArrayArray9294[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9291[var43] + var35[1] * this.anIntArray9286[var43] + var35[2] * this.anIntArray9307[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9291[var43] + var35[4] * this.anIntArray9286[var43] + var35[5] * this.anIntArray9307[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9291[var43] + var35[7] * this.anIntArray9286[var43] + var35[8] * this.anIntArray9307[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9291[var43] = var44;
                              this.anIntArray9286[var43] = var45;
                              this.anIntArray9307[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9294.length) {
                        var12 = this.anIntArrayArray9294[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                              this.anIntArray9291[var51] -= this.anInt9354;
                              this.anIntArray9286[var51] -= this.anInt9355;
                              this.anIntArray9307[var51] -= this.anInt9356;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9286[var51] * var15 + this.anIntArray9291[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9286[var51] = this.anIntArray9286[var51] * var16 - this.anIntArray9291[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9291[var51] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9286[var51] * var16 - this.anIntArray9307[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9307[var51] = this.anIntArray9286[var51] * var15 + this.anIntArray9307[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9286[var51] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9307[var51] * var15 + this.anIntArray9291[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9307[var51] = this.anIntArray9307[var51] * var16 - this.anIntArray9291[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9291[var51] = var17;
                              }

                              this.anIntArray9291[var51] += this.anInt9354;
                              this.anIntArray9286[var51] += this.anInt9355;
                              this.anIntArray9307[var51] += this.anInt9356;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9294.length) {
                           var12 = this.anIntArrayArray9294[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var51 = var12[var13];
                              if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                                 var15 = this.anIntArray9339[var51];
                                 var16 = this.anIntArray9339[var51 + 1];

                                 for(var17 = var15; var17 < var16 && this.aShortArray9299[var17] != 0; ++var17) {
                                    var18 = (this.aShortArray9299[var17] & '\uffff') - 1;
                                    if(var5 != 0) {
                                       var19 = Class443.anIntArray4895[var5];
                                       var20 = Class443.anIntArray4896[var5];
                                       var21 = this.aShortArray9292[var18] * var19 + this.aShortArray9358[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9292[var18] = (short)(this.aShortArray9292[var18] * var20 - this.aShortArray9358[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9358[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class443.anIntArray4895[var3];
                                       var20 = Class443.anIntArray4896[var3];
                                       var21 = this.aShortArray9292[var18] * var20 - this.aShortArray9301[var18] * var19 + 16383 >> 14;
                                       this.aShortArray9301[var18] = (short)(this.aShortArray9292[var18] * var19 + this.aShortArray9301[var18] * var20 + 16383 >> 14);
                                       this.aShortArray9292[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class443.anIntArray4895[var4];
                                       var20 = Class443.anIntArray4896[var4];
                                       var21 = this.aShortArray9301[var18] * var19 + this.aShortArray9358[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9301[var18] = (short)(this.aShortArray9301[var18] * var20 - this.aShortArray9358[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9358[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     this.method8537();
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9317) {
                     var16 = var8[0] * this.anInt9354 + var8[3] * this.anInt9355 + var8[6] * this.anInt9356 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9354 + var8[4] * this.anInt9355 + var8[7] * this.anInt9356 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9354 + var8[5] * this.anInt9355 + var8[8] * this.anInt9356 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt9354 = var16;
                     this.anInt9355 = var17;
                     this.anInt9356 = var18;
                     this.aBool9317 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt9354 + 8192 >> 14;
                  var20 = var17 * -this.anInt9355 + 8192 >> 14;
                  var21 = var18 * -this.anInt9356 + 8192 >> 14;
                  var22 = var19 + this.anInt9354;
                  var23 = var20 + this.anInt9355;
                  var24 = var21 + this.anInt9356;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var51 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var48;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9294.length) {
                        var35 = this.anIntArrayArray9294[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9291[var37] + var29[1] * this.anIntArray9286[var37] + var29[2] * this.anIntArray9307[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9291[var37] + var29[4] * this.anIntArray9286[var37] + var29[5] * this.anIntArray9307[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9291[var37] + var29[7] * this.anIntArray9286[var37] + var29[8] * this.anIntArray9307[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9291[var37] = var38;
                              this.anIntArray9286[var37] = var39;
                              this.anIntArray9307[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9294.length) {
                        var12 = this.anIntArrayArray9294[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                              this.anIntArray9291[var51] -= this.anInt9354;
                              this.anIntArray9286[var51] -= this.anInt9355;
                              this.anIntArray9307[var51] -= this.anInt9356;
                              this.anIntArray9291[var51] = this.anIntArray9291[var51] * var3 >> 7;
                              this.anIntArray9286[var51] = this.anIntArray9286[var51] * var4 >> 7;
                              this.anIntArray9307[var51] = this.anIntArray9307[var51] * var5 >> 7;
                              this.anIntArray9291[var51] += this.anInt9354;
                              this.anIntArray9286[var51] += this.anInt9355;
                              this.anIntArray9307[var51] += this.anInt9356;
                           }
                        }
                     }
                  }
               }

            } else {
               boolean var47;
               Class360 var49;
               Class352 var52;
               if(var1 == 5) {
                  if(this.anIntArrayArray9350 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray9350.length) {
                           var50 = this.anIntArrayArray9350[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray9315 == null || (var7 & this.aShortArray9315[var15]) != 0) {
                                 var16 = (this.aByteArray9309[var15] & 255) + var3 * 8;
                                 if(var16 < 0) {
                                    var16 = 0;
                                 } else if(var16 > 255) {
                                    var16 = 255;
                                 }

                                 this.aByteArray9309[var15] = (byte)var16;
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass360Array9344 != null) {
                           for(var11 = 0; var11 < this.anInt9313; ++var11) {
                              var49 = this.aClass360Array9344[var11];
                              var52 = this.aClass352Array9326[var11];
                              var52.anInt3664 = var52.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var49.anInt3826] & 255) << 24;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9350 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray9350.length) {
                           var50 = this.anIntArrayArray9350[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray9315 == null || (var7 & this.aShortArray9315[var15]) != 0) {
                                 var16 = this.aShortArray9308[var15] & '\uffff';
                                 var17 = var16 >> 10 & 63;
                                 var18 = var16 >> 7 & 7;
                                 var19 = var16 & 127;
                                 var17 = var17 + var3 & 63;
                                 var18 += var4 / 4;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 7) {
                                    var18 = 7;
                                 }

                                 var19 += var5;
                                 if(var19 < 0) {
                                    var19 = 0;
                                 } else if(var19 > 127) {
                                    var19 = 127;
                                 }

                                 this.aShortArray9308[var15] = (short)(var17 << 10 | var18 << 7 | var19);
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass360Array9344 != null) {
                           for(var11 = 0; var11 < this.anInt9313; ++var11) {
                              var49 = this.aClass360Array9344[var11];
                              var52 = this.aClass352Array9326[var11];
                              var52.anInt3664 = var52.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var49.anInt3826] & '\uffff'] & 16777215;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else {
                  Class352 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3663 += var3;
                                 var14.anInt3666 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3667 = var14.anInt3667 * var3 >> 7;
                                 var14.anInt3665 = var14.anInt3665 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3668 = var14.anInt3668 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method1971(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var10 = 0; var10 < this.anInt9287; ++var10) {
            this.anInt9354 += this.anIntArray9291[var10];
            this.anInt9355 += this.anIntArray9286[var10];
            this.anInt9356 += this.anIntArray9307[var10];
            ++var5;
         }

         if(var5 > 0) {
            this.anInt9354 = this.anInt9354 / var5 + var2;
            this.anInt9355 = this.anInt9355 / var5 + var3;
            this.anInt9356 = this.anInt9356 / var5 + var4;
         } else {
            this.anInt9354 = var2;
            this.anInt9355 = var3;
            this.anInt9356 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.anInt9287; ++var5) {
            this.anIntArray9291[var5] += var2;
            this.anIntArray9286[var5] += var3;
            this.anIntArray9307[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.anInt9287; ++var5) {
               this.anIntArray9291[var5] -= this.anInt9354;
               this.anIntArray9286[var5] -= this.anInt9355;
               this.anIntArray9307[var5] -= this.anInt9356;
               if(var4 != 0) {
                  var10 = Class443.anIntArray4895[var4];
                  var7 = Class443.anIntArray4896[var4];
                  var8 = this.anIntArray9286[var5] * var10 + this.anIntArray9291[var5] * var7 + 16383 >> 14;
                  this.anIntArray9286[var5] = this.anIntArray9286[var5] * var7 - this.anIntArray9291[var5] * var10 + 16383 >> 14;
                  this.anIntArray9291[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = Class443.anIntArray4895[var2];
                  var7 = Class443.anIntArray4896[var2];
                  var8 = this.anIntArray9286[var5] * var7 - this.anIntArray9307[var5] * var10 + 16383 >> 14;
                  this.anIntArray9307[var5] = this.anIntArray9286[var5] * var10 + this.anIntArray9307[var5] * var7 + 16383 >> 14;
                  this.anIntArray9286[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = Class443.anIntArray4895[var3];
                  var7 = Class443.anIntArray4896[var3];
                  var8 = this.anIntArray9307[var5] * var10 + this.anIntArray9291[var5] * var7 + 16383 >> 14;
                  this.anIntArray9307[var5] = this.anIntArray9307[var5] * var7 - this.anIntArray9291[var5] * var10 + 16383 >> 14;
                  this.anIntArray9291[var5] = var8;
               }

               this.anIntArray9291[var5] += this.anInt9354;
               this.anIntArray9286[var5] += this.anInt9355;
               this.anIntArray9307[var5] += this.anInt9356;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.anInt9287; ++var5) {
               this.anIntArray9291[var5] -= this.anInt9354;
               this.anIntArray9286[var5] -= this.anInt9355;
               this.anIntArray9307[var5] -= this.anInt9356;
               this.anIntArray9291[var5] = this.anIntArray9291[var5] * var2 / 128;
               this.anIntArray9286[var5] = this.anIntArray9286[var5] * var3 / 128;
               this.anIntArray9307[var5] = this.anIntArray9307[var5] * var4 / 128;
               this.anIntArray9291[var5] += this.anInt9354;
               this.anIntArray9286[var5] += this.anInt9355;
               this.anIntArray9307[var5] += this.anInt9356;
            }

         } else {
            Class360 var11;
            Class352 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt9300; ++var5) {
                  var10 = (this.aByteArray9309[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.aByteArray9309[var5] = (byte)var10;
               }

               if(this.aClass360Array9344 != null) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var11 = this.aClass360Array9344[var5];
                     var12 = this.aClass352Array9326[var5];
                     var12.anInt3664 = var12.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var11.anInt3826] & 255) << 24;
                  }
               }

               this.method8526();
            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt9300; ++var5) {
                  var10 = this.aShortArray9308[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.aShortArray9308[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.aClass360Array9344 != null) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var11 = this.aClass360Array9344[var5];
                     var12 = this.aClass352Array9326[var5];
                     var12.anInt3664 = var12.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var11.anInt3826] & '\uffff'] & 16777215;
                  }
               }

               this.method8526();
            } else {
               Class352 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var6 = this.aClass352Array9326[var5];
                     var6.anInt3663 += var2;
                     var6.anInt3666 += var3;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var6 = this.aClass352Array9326[var5];
                     var6.anInt3667 = var6.anInt3667 * var2 >> 7;
                     var6.anInt3665 = var6.anInt3665 * var3 >> 7;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var6 = this.aClass352Array9326[var5];
                     var6.anInt3668 = var6.anInt3668 + var2 & 16383;
                  }

               }
            }
         }
      }
   }

   void method2000(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var22;
      int[] var24;
      int var25;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            var22 = var2[var10];
            if(var22 < this.anIntArrayArray9294.length) {
               var24 = this.anIntArrayArray9294[var22];

               for(var25 = 0; var25 < var24.length; ++var25) {
                  var14 = var24[var25];
                  this.anInt9354 += this.anIntArray9291[var14];
                  this.anInt9355 += this.anIntArray9286[var14];
                  this.anInt9356 += this.anIntArray9307[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9354 = this.anInt9354 / var9 + var3;
            this.anInt9355 = this.anInt9355 / var9 + var4;
            this.anInt9356 = this.anInt9356 / var9 + var5;
         } else {
            this.anInt9354 = var3;
            this.anInt9355 = var4;
            this.anInt9356 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9294.length) {
                  var11 = this.anIntArrayArray9294[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var25 = var11[var12];
                     this.anIntArray9291[var25] += var3;
                     this.anIntArray9286[var25] += var4;
                     this.anIntArray9307[var25] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            int var18;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9294.length) {
                        var11 = this.anIntArrayArray9294[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           var14 = this.anIntArray9339[var25];
                           var15 = this.anIntArray9339[var25 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9299[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9299[var16] & '\uffff') - 1;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9292[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9292[var17] = (short)(this.aShortArray9292[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9292[var17] * var19 - this.aShortArray9301[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9292[var17] * var18 + this.aShortArray9301[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9292[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9301[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9301[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  this.method8537();
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var25 = var11[var12];
                        this.anIntArray9291[var25] -= this.anInt9354;
                        this.anIntArray9286[var25] -= this.anInt9355;
                        this.anIntArray9307[var25] -= this.anInt9356;
                        this.anIntArray9291[var25] = this.anIntArray9291[var25] * var3 >> 7;
                        this.anIntArray9286[var25] = this.anIntArray9286[var25] * var4 >> 7;
                        this.anIntArray9307[var25] = this.anIntArray9307[var25] * var5 >> 7;
                        this.anIntArray9291[var25] += this.anInt9354;
                        this.anIntArray9286[var25] += this.anInt9355;
                        this.anIntArray9307[var25] += this.anInt9356;
                     }
                  }
               }

            } else {
               boolean var21;
               Class360 var23;
               Class352 var26;
               if(var1 == 5) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = (this.aByteArray9309[var14] & 255) + var3 * 8;
                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 > 255) {
                                 var15 = 255;
                              }

                              this.aByteArray9309[var14] = (byte)var15;
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var23.anInt3826] & 255) << 24;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = this.aShortArray9308[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 7) {
                                 var17 = 7;
                              }

                              var18 += var5;
                              if(var18 < 0) {
                                 var18 = 0;
                              } else if(var18 > 127) {
                                 var18 = 127;
                              }

                              this.aShortArray9308[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var23.anInt3826] & '\uffff'] & 16777215;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else {
                  Class352 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3663 += var3;
                                 var13.anInt3666 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3667 = var13.anInt3667 * var3 >> 7;
                                 var13.anInt3665 = var13.anInt3665 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3668 = var13.anInt3668 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method1972() {
      for(int var1 = 0; var1 < this.anInt9357; ++var1) {
         this.anIntArray9291[var1] = this.anIntArray9291[var1] + 7 >> 4;
         this.anIntArray9286[var1] = this.anIntArray9286[var1] + 7 >> 4;
         this.anIntArray9307[var1] = this.anIntArray9307[var1] + 7 >> 4;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method1948(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9295 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub3_9284.aClass445_9704;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9287; ++var6) {
            if((var2 & this.aShortArray9295[var6]) != 0) {
               var4.method5233((float)this.anIntArray9291[var6], (float)this.anIntArray9286[var6], (float)this.anIntArray9307[var6], var5);
               this.anIntArray9291[var6] = (int)var5[0];
               this.anIntArray9286[var6] = (int)var5[1];
               this.anIntArray9307[var6] = (int)var5[2];
            }
         }

      }
   }

   public Class141[] method2064() {
      return this.aClass141Array9314;
   }

   public void method2008() {
      if(this.anInt9296 > 0 && this.anInt9312 > 0) {
         this.method8532();
         this.method8539();
         this.method8525();
      }
   }

   public void method2029(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 128) {
            this.anIntArray9291[var4] = this.anIntArray9291[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9286[var4] = this.anIntArray9286[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 >> 7;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public Class168 method2002(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      Class168_Sub2 var5;
      Class168_Sub2 var6;
      if(var1 > 0 && var1 <= 8) {
         var5 = this.aClass174_Sub3_9284.aClass168_Sub2Array9846[var1 - 1];
         var6 = this.aClass174_Sub3_9284.aClass168_Sub2Array9833[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class168_Sub2(this.aClass174_Sub3_9284, 0, 0, true, false);
      }

      return this.method8524(var6, var5, var2, var4, var3);
   }

   public void method2120(short var1, short var2) {
      Class169 var3 = this.aClass174_Sub3_9284.aClass169_2035;

      for(int var4 = 0; var4 < this.anInt9300; ++var4) {
         if(this.aShortArray9342[var4] == var1) {
            this.aShortArray9342[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class171 var6 = var3.method2122(var1 & '\uffff', (byte)102);
         var11 = var6.aByte1969;
         var5 = var6.aByte2012;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class171 var8 = var3.method2122(var2 & '\uffff', (byte)10);
         var12 = var8.aByte1969;
         var7 = var8.aByte2012;
         if(var8.aByte1986 != 0 || var8.aByte1963 != 0) {
            this.aBool9324 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass360Array9344 != null) {
            for(int var13 = 0; var13 < this.anInt9313; ++var13) {
               Class360 var9 = this.aClass360Array9344[var13];
               Class352 var10 = this.aClass352Array9326[var13];
               var10.anInt3664 = var10.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var9.anInt3826] & '\uffff'] & 16777215;
            }
         }

         this.method8526();
      }

   }

   public void method2056() {
      if(!this.aBool9289) {
         if(!this.aBool9327) {
            this.method8528();
         }

         this.anInt9335 = this.anInt9328;
         this.aBool9289 = true;
      }

   }

   public Class526_Sub21_Sub5 method1976(Class526_Sub21_Sub5 var1) {
      if(this.anInt9296 == 0) {
         return null;
      } else {
         if(!this.aBool9327) {
            this.method8528();
         }

         int var2;
         int var3;
         if(this.aClass174_Sub3_9284.anInt9750 > 0) {
            var2 = this.anInt9330 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var3 = this.anInt9293 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         } else {
            var2 = this.anInt9330 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var3 = this.anInt9293 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         }

         int var4;
         int var5;
         if(this.aClass174_Sub3_9284.anInt9770 > 0) {
            var4 = this.anInt9332 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var5 = this.anInt9333 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         } else {
            var4 = this.anInt9332 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var5 = this.anInt9333 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class526_Sub21_Sub5_Sub1 var8 = (Class526_Sub21_Sub5_Sub1)var1;
         Class526_Sub21_Sub5_Sub1 var9;
         if(var8 != null && var8.method10872(var6, var7)) {
            var9 = var8;
            var8.method10873();
         } else {
            var9 = new Class526_Sub21_Sub5_Sub1(this.aClass174_Sub3_9284, var6, var7);
         }

         var9.method10871(var2, var4, var3, var5);
         this.method8529(var9);
         return var9;
      }
   }

   void method8529(Class526_Sub21_Sub5_Sub1 var1) {
      if(this.anIntArray9290.length < this.anInt9296) {
         this.anIntArray9290 = new int[this.anInt9296];
         this.anIntArray9334 = new int[this.anInt9296];
      }

      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      for(var2 = 0; var2 < this.anInt9287; ++var2) {
         var3 = (this.anIntArray9291[var2] - (this.anIntArray9286[var2] * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710) - var1.anInt12040;
         var4 = (this.anIntArray9307[var2] - (this.anIntArray9286[var2] * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710) - var1.anInt12041;
         var5 = this.anIntArray9339[var2];
         var6 = this.anIntArray9339[var2 + 1];

         for(var7 = var5; var7 < var6 && this.aShortArray9299[var7] != 0; ++var7) {
            var8 = (this.aShortArray9299[var7] & '\uffff') - 1;
            this.anIntArray9290[var8] = var3;
            this.anIntArray9334[var8] = var4;
         }
      }

      for(var2 = 0; var2 < this.anInt9312; ++var2) {
         if(this.aByteArray9309 == null || this.aByteArray9309[var2] <= 128) {
            var3 = this.aShortArray9310[var2] & '\uffff';
            var4 = this.aShortArray9311[var2] & '\uffff';
            var5 = this.aShortArray9345[var2] & '\uffff';
            var6 = this.anIntArray9290[var3];
            var7 = this.anIntArray9290[var4];
            var8 = this.anIntArray9290[var5];
            int var9 = this.anIntArray9334[var3];
            int var10 = this.anIntArray9334[var4];
            int var11 = this.anIntArray9334[var5];
            if((var6 - var7) * (var10 - var11) - (var10 - var9) * (var8 - var7) > 0) {
               var1.method10878(var9, var10, var11, var6, var7, var8);
            }
         }
      }

   }

   public void method1974(Class445 var1, Class164 var2, int var3) {
      if(aClass338_9349 != null) {
         aClass338_9349.method4408();
      }

      if(var2 != null) {
         var2.aBool1784 = false;
      }

      if(this.anInt9296 != 0) {
         Class433 var4 = this.aClass174_Sub3_9284.aClass433_9715;
         Class433 var5 = this.aClass174_Sub3_9284.aClass433_9705;
         Class433 var6 = this.aClass174_Sub3_9284.aClass433_9746;
         var5.method5110(var1);
         var6.method5083(var5);
         var6.method5085(this.aClass174_Sub3_9284.aClass433_9747);
         if(!this.aBool9327) {
            this.method8528();
         }

         float[] var7 = this.aClass174_Sub3_9284.aFloatArray9703;
         var5.method5089(0.0F, (float)this.anInt9328, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method5089(0.0F, (float)this.anInt9329, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var16;
         float var17;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aClass174_Sub3_9284.aFloatArrayArray9721[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt9320;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt9320;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.anInt9330 + this.anInt9293 >> 1;
            int var21 = this.anInt9332 + this.anInt9333 >> 1;
            int var23 = this.anInt9328;
            float var33 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var34 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            var16 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            var17 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var16 >= -var17) {
               var2.anInt1789 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var33 / var17);
               var2.anInt1786 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var34 / var17);
            } else {
               var18 = true;
            }

            var23 = this.anInt9329;
            float var25 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var26 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            float var27 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            float var28 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var27 >= -var28) {
               var2.anInt1785 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var25 / var28);
               var2.anInt1788 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var33 + var29 * (var25 - var33);
                     var31 = var34 + var29 * (var26 - var34);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt1789 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var30 / var32);
                     var2.anInt1786 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var33 - var25);
                     var31 = var26 + var29 * (var34 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt1785 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var30 / var32);
                     var2.anInt1788 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var33 + var4.aFloatArray4841[0] * (float)this.anInt9320 + var4.aFloatArray4841[12];
                  var30 = var17 + var4.aFloatArray4841[3] * (float)this.anInt9320 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub3_9284.aFloat9678 - (float)var2.anInt1789 + this.aClass174_Sub3_9284.aFloat9723 * var29 / var30);
               } else {
                  var29 = var25 + var4.aFloatArray4841[0] * (float)this.anInt9320 + var4.aFloatArray4841[12];
                  var30 = var28 + var4.aFloatArray4841[3] * (float)this.anInt9320 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub3_9284.aFloat9678 - (float)var2.anInt1785 + this.aClass174_Sub3_9284.aFloat9723 * var29 / var30);
               }

               var2.aBool1784 = true;
            }
         }

         this.aClass174_Sub3_9284.method8830(var3);
         this.method8530(var1);
         this.aClass174_Sub3_9284.method8830(0);
         var5.method5110(var1);
         var5.method5085(this.aClass174_Sub3_9284.aClass433_9753);
         this.method8531(var5);
      }
   }

   void method8530(Class445 var1) {
      if(this.anInt9312 != 0) {
         if(this.method8532() && this.method8539()) {
            if(aClass338_9349 != null) {
               ;
            }

            this.aClass174_Sub3_9284.method8829();
            this.aClass174_Sub3_9284.method8780();
            Class318 var2 = this.aClass174_Sub3_9284.aClass318_9762;
            this.aClass174_Sub3_9284.method8820(0, this.aClass371_9298.anInterface35_3885);
            this.aClass174_Sub3_9284.method8820(1, this.aClass371_9318.anInterface35_3885);
            this.aClass174_Sub3_9284.method8820(2, this.aClass371_9323.anInterface35_3885);
            this.aClass174_Sub3_9284.method8769(this.aClass343_9316.anInterface42_3563);
            this.aClass174_Sub3_9284.aClass433_9705.method5110(var1);
            var2.method4105(this.aClass174_Sub3_9284.aClass433_9705);
            var2.aClass433_3420.method5104();
            if(this.aClass174_Sub3_9284.aBool9811) {
               Class172 var3 = this.aClass174_Sub3_9284.method8890();
               var2.aClass444_3421.method5202(0.0F, 1.0F, 0.0F, (float)(-this.aClass174_Sub3_9284.anInt9803));
               var2.aClass444_3421.method5206(3.0F / (float)(var3.anInt2020 * -1648426019));
               var2.aClass446_3422.method5266((float)(var3.anInt2019 * -1808050665 >> 16 & 255) / 255.0F, (float)(var3.anInt2019 * -1808050665 >> 8 & 255) / 255.0F, (float)(var3.anInt2019 * -1808050665 >> 0 & 255) / 255.0F);
            } else {
               var2.aClass444_3421.method5202(0.0F, 0.0F, 0.0F, 0.0F);
               var2.aClass446_3422.method5266(0.0F, 0.0F, 0.0F);
            }

            if(this.aClass174_Sub3_9284.anInt9675 > 0) {
               var2.aClass444_3411.method5202(0.0F, 0.0F, 1.0F, -this.aClass174_Sub3_9284.aFloat9810);
               var2.aClass446_3432.method5266((float)(this.aClass174_Sub3_9284.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9284.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9284.anInt9722 >> 0 & 255) / 255.0F);
               this.aClass174_Sub3_9284.aClass433_9705.method5110(var1);
               this.aClass174_Sub3_9284.aClass433_9705.method5106();
               var2.aClass444_3421.method5207(this.aClass174_Sub3_9284.aClass433_9705);
               this.aClass174_Sub3_9284.aClass433_9705.method5110(var1);
               this.aClass174_Sub3_9284.aClass433_9705.method5085(this.aClass174_Sub3_9284.aClass433_9753);
               this.aClass174_Sub3_9284.aClass433_9705.method5106();
               var2.aClass444_3411.method5207(this.aClass174_Sub3_9284.aClass433_9705);
               var2.aClass444_3411.method5206(1.0F / (this.aClass174_Sub3_9284.aFloat9677 - this.aClass174_Sub3_9284.aFloat9810));
            } else {
               var2.aClass444_3411.method5202(0.0F, 0.0F, 0.0F, 0.0F);
               var2.aClass446_3432.method5266(0.0F, 0.0F, 0.0F);
            }

            int var4;
            int var5;
            if((this.anInt9285 & 55) == 0) {
               this.aClass174_Sub3_9284.method8833(this.aClass174_Sub3_9284.aClass335_9801);
               if(this.aClass174_Sub3_9284.aBool9761) {
                  this.aClass174_Sub3_9284.method8871(false);
               }

               for(int var13 = 0; var13 < this.anIntArray9337.length; ++var13) {
                  var4 = this.anIntArray9336[var13];
                  var5 = this.anIntArray9336[var13 + 1];
                  short var6 = this.aShortArray9342[var4];
                  boolean var7 = false;
                  byte var8 = 0;
                  if(var6 != -1) {
                     Class171 var9 = this.aClass174_Sub3_9284.aClass169_2035.method2122(var6 & '\uffff', (byte)6);
                     var2.anInterface38_3415 = this.aClass174_Sub3_9284.aClass346_9775.method4474(var9);
                     var7 = !Class16.method621(var9.aByte1966, 2134295756);
                     var2.aClass433_3420.aFloatArray4841[12] = (float)(this.aClass174_Sub3_9284.anInt9820 % 128000) / 1000.0F * (float)var9.aByte1986 / 64.0F % 1.0F;
                     var2.aClass433_3420.aFloatArray4841[13] = (float)(this.aClass174_Sub3_9284.anInt9820 % 128000) / 1000.0F * (float)var9.aByte1963 / 64.0F % 1.0F;
                     if(var9.aClass593_1982 == Class593.aClass593_7816) {
                        var8 = var9.aByte1990;
                     }
                  } else {
                     var2.anInterface38_3415 = this.aClass174_Sub3_9284.anInterface38_9779;
                     float[] var21 = var2.aClass433_3420.aFloatArray4841;
                     var2.aClass433_3420.aFloatArray4841[13] = 0.0F;
                     var21[12] = 0.0F;
                  }

                  this.aClass174_Sub3_9284.method8809(var8);
                  var2.anInt3430 = this.anIntArray9337[var13];
                  var2.anInt3416 = this.anIntArray9338[var13];
                  var2.anInt3424 = var4 * 3;
                  var2.anInt3423 = var5 - var4;
                  var2.method4120(var7);
               }
            } else {
               this.aClass174_Sub3_9284.method8820(3, this.aClass371_9319.anInterface35_3885);
               this.aClass174_Sub3_9284.method8833(this.aClass174_Sub3_9284.aClass335_9841);
               Class445 var14 = this.aClass174_Sub3_9284.aClass445_9704;
               var14.method5242(var1);
               var14.method5224();
               var4 = 0;
               int var16;
               if(this.aClass174_Sub3_9284.aBool9761) {
                  this.aClass174_Sub3_9284.method8871(true);
               } else {
                  var2.aClass446_3425.method5266(this.aClass174_Sub3_9284.aFloatArray9777[0], this.aClass174_Sub3_9284.aFloatArray9777[1], this.aClass174_Sub3_9284.aFloatArray9777[2]);
                  var2.aClass446_3425.method5287(var14);
                  var2.aClass446_3426.method5266(this.aClass174_Sub3_9284.aFloat9823 * this.aClass174_Sub3_9284.aFloat9708, this.aClass174_Sub3_9284.aFloat9823 * this.aClass174_Sub3_9284.aFloat9771, this.aClass174_Sub3_9284.aFloat9823 * this.aClass174_Sub3_9284.aFloat9760);
                  var2.aClass446_3428.method5266(-this.aClass174_Sub3_9284.aFloat9763 * this.aClass174_Sub3_9284.aFloat9708, -this.aClass174_Sub3_9284.aFloat9763 * this.aClass174_Sub3_9284.aFloat9771, -this.aClass174_Sub3_9284.aFloat9763 * this.aClass174_Sub3_9284.aFloat9760);
                  var2.aClass446_3433.method5266(this.aClass174_Sub3_9284.aFloat9669 * this.aClass174_Sub3_9284.aFloat9708, this.aClass174_Sub3_9284.aFloat9669 * this.aClass174_Sub3_9284.aFloat9771, this.aClass174_Sub3_9284.aFloat9669 * this.aClass174_Sub3_9284.aFloat9760);
                  if(this.aClass174_Sub3_9284.anInt9765 > 0) {
                     var4 = this.aClass174_Sub3_9284.anInt9765;
                     Class446 var15 = this.aClass174_Sub3_9284.aClass446_9707;

                     for(var16 = 0; var16 < var4; ++var16) {
                        Class526_Sub16 var17 = this.aClass174_Sub3_9284.aClass526_Sub16Array9764[var16];
                        int var19 = var17.method9394(1693605487);
                        var15.method5267(var17.aClass446_10477);
                        var15.method5277(var14);
                        var2.aFloatArray3414[var16 * 4 + 0] = var15.aFloat4917;
                        var2.aFloatArray3414[var16 * 4 + 1] = var15.aFloat4915;
                        var2.aFloatArray3414[var16 * 4 + 2] = var15.aFloat4919;
                        var2.aFloatArray3414[var16 * 4 + 3] = 1.0F / (float)(var17.method9422((short)8192) * var17.method9422((short)8192));
                        float var22 = var17.method9419(1613563498) / 255.0F;
                        var2.aFloatArray3413[var16 * 4 + 0] = (float)(var19 >> 16 & 255) * var22;
                        var2.aFloatArray3413[var16 * 4 + 1] = (float)(var19 >> 8 & 255) * var22;
                        var2.aFloatArray3413[var16 * 4 + 2] = (float)(var19 & 255) * var22;
                        var2.aFloatArray3413[var16 * 4 + 3] = 1.0F;
                     }
                  }
               }

               for(var5 = 0; var5 < this.anIntArray9337.length; ++var5) {
                  var16 = this.anIntArray9336[var5];
                  int var18 = this.anIntArray9336[var5 + 1];
                  short var20 = this.aShortArray9342[var16];
                  byte var23 = 11;
                  Class171 var10 = null;
                  byte var11 = 0;
                  if(var20 != -1) {
                     var10 = this.aClass174_Sub3_9284.aClass169_2035.method2122(var20 & '\uffff', (byte)15);
                     var2.anInterface38_3415 = this.aClass174_Sub3_9284.aClass346_9775.method4474(var10);
                     var23 = var10.aByte1966;
                     var2.method4117(var10.aByte1970);
                     var2.aClass433_3420.aFloatArray4841[12] = (float)(this.aClass174_Sub3_9284.anInt9820 % 128000) / 1000.0F * (float)var10.aByte1986 / 64.0F % 1.0F;
                     var2.aClass433_3420.aFloatArray4841[13] = (float)(this.aClass174_Sub3_9284.anInt9820 % 128000) / 1000.0F * (float)var10.aByte1963 / 64.0F % 1.0F;
                     if(var10.aClass593_1982 == Class593.aClass593_7816) {
                        var11 = var10.aByte1990;
                     }
                  } else {
                     var2.anInterface38_3415 = this.aClass174_Sub3_9284.anInterface38_9779;
                     float[] var12 = var2.aClass433_3420.aFloatArray4841;
                     var2.aClass433_3420.aFloatArray4841[13] = 0.0F;
                     var12[12] = 0.0F;
                  }

                  this.aClass174_Sub3_9284.method8809(var11);
                  var2.anInt3430 = this.anIntArray9337[var5];
                  var2.anInt3416 = this.anIntArray9338[var5];
                  var2.anInt3424 = var16 * 3;
                  var2.anInt3423 = var18 - var16;
                  switch(var23) {
                  case 1:
                     var2.aClass446_3418.method5266(this.aClass174_Sub3_9284.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9284.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9284.aClass433_9804.aFloatArray4841[14]);
                     var2.aClass446_3418.method5277(var14);
                     var2.method4116(var4);
                     break;
                  case 2:
                  case 3:
                  case 4:
                  default:
                     var2.method4107(var4);
                     break;
                  case 5:
                     if(!this.aClass174_Sub3_9284.aBool9761) {
                        Class351_Sub1_Sub1 var24 = this.aClass174_Sub3_9284.aClass351_Sub1_Sub1_9739;
                        var24.method10484(var10.aByte1970, var10.anInt1988 * 1864020927, 1976054487);
                        var24.aClass433_11415.method5110(var1);
                        var24.aClass433_11414.method5110(var1);
                        var24.aClass433_11414.method5085(this.aClass174_Sub3_9284.aClass433_9720);
                        var24.anInt11413 = this.anIntArray9337[var5] * 1377494281;
                        var24.anInt11422 = this.anIntArray9338[var5] * 1355746559;
                        var24.anInt11423 = var16 * -1280840243;
                        var24.anInt11409 = (var18 - var16) * -2125724469;
                        var24.method10486((byte)23);
                     } else {
                        var2.method4107(var4);
                     }
                     break;
                  case 6:
                     var2.method4120(!Class16.method621(var23, 1224029928));
                     break;
                  case 7:
                     var2.aClass446_3418.method5266(this.aClass174_Sub3_9284.aClass433_9804.aFloatArray4841[12], this.aClass174_Sub3_9284.aClass433_9804.aFloatArray4841[13], this.aClass174_Sub3_9284.aClass433_9804.aFloatArray4841[14]);
                     var2.aClass446_3418.method5277(var14);
                     var2.aClass433_3429.method5110(var1);
                     var2.anInterface44_3431 = this.aClass174_Sub3_9284.method8751();
                     var2.method4109(var4);
                  }
               }
            }

            this.method8525();
         }
      }
   }

   void method8531(Class433 var1) {
      if(this.aClass360Array9344 != null) {
         this.aClass174_Sub3_9284.method2328(!this.aBool9331);
         Class445 var2 = this.aClass174_Sub3_9284.aClass445_9704;
         Class320 var3 = this.aClass174_Sub3_9284.aClass320_9790;
         boolean var4 = this.aClass174_Sub3_9284.anInt9675 > 0;
         if(var4) {
            var3.aClass446_3441.method5266((float)(this.aClass174_Sub3_9284.anInt9722 >> 16 & 255) / 255.0F, (float)(this.aClass174_Sub3_9284.anInt9722 >> 8 & 255) / 255.0F, (float)(this.aClass174_Sub3_9284.anInt9722 >> 0 & 255) / 255.0F);
         } else {
            var3.aClass446_3441.method5266(0.0F, 0.0F, 0.0F);
         }

         for(int var5 = 0; var5 < this.anInt9313; ++var5) {
            Class360 var6 = this.aClass360Array9344[var5];
            Class352 var7 = this.aClass352Array9326[var5];
            if(!var6.aBool3830 || !this.aClass174_Sub3_9284.method2548()) {
               float var8 = (float)(this.anIntArray9291[var6.anInt3827] + this.anIntArray9291[var6.anInt3824] + this.anIntArray9291[var6.anInt3829]) * 0.3333333F;
               float var9 = (float)(this.anIntArray9286[var6.anInt3827] + this.anIntArray9286[var6.anInt3824] + this.anIntArray9286[var6.anInt3829]) * 0.3333333F;
               float var10 = (float)(this.anIntArray9307[var6.anInt3827] + this.anIntArray9307[var6.anInt3824] + this.anIntArray9307[var6.anInt3829]) * 0.3333333F;
               float var11 = var1.aFloatArray4841[0] * var8 + var1.aFloatArray4841[4] * var9 + var1.aFloatArray4841[8] * var10 + var1.aFloatArray4841[12];
               float var12 = var1.aFloatArray4841[1] * var8 + var1.aFloatArray4841[5] * var9 + var1.aFloatArray4841[9] * var10 + var1.aFloatArray4841[13];
               float var13 = var1.aFloatArray4841[2] * var8 + var1.aFloatArray4841[6] * var9 + var1.aFloatArray4841[10] * var10 + var1.aFloatArray4841[14];
               float var14 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13))) * (float)var6.anInt3831;
               var2.method5221(var7.anInt3668, var7.anInt3667 * var6.aShort3823 >> 7, var7.anInt3665 * var6.aShort3828 >> 7, var11 + (float)var7.anInt3663 - var11 * var14, var12 + (float)var7.anInt3666 - var12 * var14, var13 - var13 * var14);
               var2.method5231(this.aClass174_Sub3_9284.aClass445_9697);
               this.aClass174_Sub3_9284.aClass433_9746.method5110(var2);
               var3.method4137(this.aClass174_Sub3_9284.aClass433_9746);
               var3.aClass433_3437.method5104();
               var3.anInt3436 = var7.anInt3664;
               if(var4) {
                  var3.aFloat3442 = 1.0F - (this.aClass174_Sub3_9284.aFloat9677 - var13) / (this.aClass174_Sub3_9284.aFloat9677 - this.aClass174_Sub3_9284.aFloat9810);
               }

               var3.anInterface38_3439 = null;
               if(var6.aShort3825 != -1) {
                  var3.anInterface38_3439 = this.aClass174_Sub3_9284.aClass346_9775.method4474(this.aClass174_Sub3_9284.aClass169_2035.method2122(var6.aShort3825 & '\uffff', (byte)2));
               }

               var3.method4135(var4);
            }
         }

         this.aClass174_Sub3_9284.method2328(true);
      }
   }

   public void method2009() {
      if(this.anInt9296 > 0 && this.anInt9312 > 0) {
         this.method8532();
         this.method8539();
         this.method8525();
      }
   }

   boolean method8532() {
      boolean var1 = !this.aClass371_9318.aBool3884;
      boolean var2 = (this.anInt9285 & 55) != 0 && !this.aClass371_9319.aBool3884;
      boolean var3 = !this.aClass371_9298.aBool3884;
      boolean var4 = !this.aClass371_9323.aBool3884;
      if(!var3 && !var1 && !var2 && !var4) {
         return true;
      } else {
         boolean var5 = true;
         Interface35 var6;
         Unsafe var7;
         ByteBuffer var8;
         long var9;
         int var11;
         short var12;
         int var13;
         int var34;
         if(var3 && this.aShortArray9297 != null) {
            if(this.aClass371_9298.anInterface35_3886 == null) {
               this.aClass371_9298.anInterface35_3886 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
            }

            var6 = this.aClass371_9298.anInterface35_3886;
            var6.method249(this.anInt9296 * 12, 12);
            var7 = this.aClass174_Sub3_9284.anUnsafe9670;
            if(var7 != null) {
               var34 = this.anInt9296 * 12;
               var9 = var6.method236(0, var34);

               for(var11 = 0; var11 < this.anInt9296; ++var11) {
                  var12 = this.aShortArray9297[var11];
                  var7.putFloat(var9, (float)this.anIntArray9291[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.anIntArray9286[var12]);
                  var9 += 4L;
                  var7.putFloat(var9, (float)this.anIntArray9307[var12]);
                  var9 += 4L;
               }

               var6.method234();
            } else {
               var8 = this.aClass174_Sub3_9284.aByteBuffer9684;
               var8.clear();

               for(var13 = 0; var13 < this.anInt9296; ++var13) {
                  var8.putFloat((float)this.anIntArray9291[this.aShortArray9297[var13]]);
                  var8.putFloat((float)this.anIntArray9286[this.aShortArray9297[var13]]);
                  var8.putFloat((float)this.anIntArray9307[this.aShortArray9297[var13]]);
               }

               var6.method235(0, var8.position(), this.aClass174_Sub3_9284.aLong9685);
            }

            this.aClass371_9298.anInterface35_3885 = var6;
            this.aClass371_9298.aBool3884 = true;
         }

         int var16;
         short[] var39;
         int var45;
         if(var1) {
            if(this.aClass371_9318.anInterface35_3886 == null) {
               this.aClass371_9318.anInterface35_3886 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
            }

            var6 = this.aClass371_9318.anInterface35_3886;
            var6.method249(this.anInt9296 * 4, 4);
            var7 = this.aClass174_Sub3_9284.anUnsafe9670;
            int var18;
            float var21;
            float var23;
            int var27;
            short[] var36;
            if(var7 != null) {
               var34 = this.anInt9296 * 4;
               var9 = var6.method236(0, var34);
               if((this.anInt9285 & 55) == 0) {
                  short[] var38;
                  short[] var40;
                  byte[] var43;
                  if(this.aClass368_9305 != null) {
                     var36 = this.aClass368_9305.aShortArray3871;
                     var38 = this.aClass368_9305.aShortArray3870;
                     var40 = this.aClass368_9305.aShortArray3872;
                     var43 = this.aClass368_9305.aByteArray3869;
                  } else {
                     var36 = this.aShortArray9358;
                     var38 = this.aShortArray9292;
                     var40 = this.aShortArray9301;
                     var43 = this.aByteArray9302;
                  }

                  float var47 = this.aClass174_Sub3_9284.aFloat9823 * 768.0F / (float)this.aShort9288;
                  float var48 = this.aClass174_Sub3_9284.aFloat9763 * 768.0F / (float)this.aShort9288;

                  for(var18 = 0; var18 < this.anInt9296; ++var18) {
                     short var50 = this.aShortArray9282[var18];
                     int var51 = this.method8535(this.aShortArray9308[var50] & '\uffff', this.aShortArray9342[var50], this.aShort9343);
                     var21 = (float)(var51 >> 16 & 255) * this.aClass174_Sub3_9284.aFloat9708;
                     float var52 = (float)(var51 >> 8 & 255) * this.aClass174_Sub3_9284.aFloat9771;
                     var23 = (float)(var51 & 255) * this.aClass174_Sub3_9284.aFloat9760;
                     byte var53 = var43[var18];
                     float var54;
                     if(var53 == 0) {
                        var54 = (this.aClass174_Sub3_9284.aFloatArray9777[0] * (float)var36[var18] + this.aClass174_Sub3_9284.aFloatArray9777[1] * (float)var38[var18] + this.aClass174_Sub3_9284.aFloatArray9777[2] * (float)var40[var18]) * 0.0026041667F;
                     } else {
                        var54 = (this.aClass174_Sub3_9284.aFloatArray9777[0] * (float)var36[var18] + this.aClass174_Sub3_9284.aFloatArray9777[1] * (float)var38[var18] + this.aClass174_Sub3_9284.aFloatArray9777[2] * (float)var40[var18]) / ((float)var53 * 256.0F);
                     }

                     float var55 = this.aClass174_Sub3_9284.aFloat9669 + var54 * (var54 < 0.0F?var48:var47);
                     var27 = (int)(var21 * var55);
                     if(var27 < 0) {
                        var27 = 0;
                     } else if(var27 > 255) {
                        var27 = 255;
                     }

                     int var28 = (int)(var52 * var55);
                     if(var28 < 0) {
                        var28 = 0;
                     } else if(var28 > 255) {
                        var28 = 255;
                     }

                     int var29 = (int)(var23 * var55);
                     if(var29 < 0) {
                        var29 = 0;
                     } else if(var29 > 255) {
                        var29 = 255;
                     }

                     var7.putInt(var9, 255 - this.aByteArray9309[var50] << 24 | var27 << 16 | var28 << 8 | var29);
                     var9 += 4L;
                  }
               } else {
                  for(var11 = 0; var11 < this.anInt9296; ++var11) {
                     var12 = this.aShortArray9282[var11];
                     var45 = 255 - this.aByteArray9309[var12] << 24 | this.method8535(this.aShortArray9308[var12] & '\uffff', this.aShortArray9342[var12], this.aShort9343);
                     var7.putInt(var9, var45);
                     var9 += 4L;
                  }
               }

               var6.method234();
            } else {
               var8 = this.aClass174_Sub3_9284.aByteBuffer9684;
               var8.clear();
               if((this.anInt9285 & 55) == 0) {
                  short[] var30;
                  byte[] var37;
                  if(this.aClass368_9305 != null) {
                     var39 = this.aClass368_9305.aShortArray3871;
                     var30 = this.aClass368_9305.aShortArray3870;
                     var36 = this.aClass368_9305.aShortArray3872;
                     var37 = this.aClass368_9305.aByteArray3869;
                  } else {
                     var39 = this.aShortArray9358;
                     var30 = this.aShortArray9292;
                     var36 = this.aShortArray9301;
                     var37 = this.aByteArray9302;
                  }

                  float var14 = this.aClass174_Sub3_9284.aFloat9823 * 768.0F / (float)this.aShort9288;
                  float var15 = this.aClass174_Sub3_9284.aFloat9763 * 768.0F / (float)this.aShort9288;

                  for(var16 = 0; var16 < this.anInt9296; ++var16) {
                     short var17 = this.aShortArray9282[var16];
                     var18 = this.method8535(this.aShortArray9308[var17] & '\uffff', this.aShortArray9342[var17], this.aShort9343);
                     float var19 = (float)(var18 >> 16 & 255) * this.aClass174_Sub3_9284.aFloat9708;
                     float var20 = (float)(var18 >> 8 & 255) * this.aClass174_Sub3_9284.aFloat9771;
                     var21 = (float)(var18 & 255) * this.aClass174_Sub3_9284.aFloat9760;
                     byte var22 = var37[var16];
                     if(var22 == 0) {
                        var23 = (this.aClass174_Sub3_9284.aFloatArray9777[0] * (float)var39[var16] + this.aClass174_Sub3_9284.aFloatArray9777[1] * (float)var30[var16] + this.aClass174_Sub3_9284.aFloatArray9777[2] * (float)var36[var16]) * 0.0026041667F;
                     } else {
                        var23 = (this.aClass174_Sub3_9284.aFloatArray9777[0] * (float)var39[var16] + this.aClass174_Sub3_9284.aFloatArray9777[1] * (float)var30[var16] + this.aClass174_Sub3_9284.aFloatArray9777[2] * (float)var36[var16]) / ((float)var22 * 256.0F);
                     }

                     float var24 = this.aClass174_Sub3_9284.aFloat9669 + var23 * (var23 < 0.0F?var15:var14);
                     int var25 = (int)(var19 * var24);
                     if(var25 < 0) {
                        var25 = 0;
                     } else if(var25 > 255) {
                        var25 = 255;
                     }

                     int var26 = (int)(var20 * var24);
                     if(var26 < 0) {
                        var26 = 0;
                     } else if(var26 > 255) {
                        var26 = 255;
                     }

                     var27 = (int)(var21 * var24);
                     if(var27 < 0) {
                        var27 = 0;
                     } else if(var27 > 255) {
                        var27 = 255;
                     }

                     var8.putInt(255 - this.aByteArray9309[var17] << 24 | var25 << 16 | var26 << 8 | var27);
                  }
               } else {
                  for(var13 = 0; var13 < this.anInt9296; ++var13) {
                     short var56 = this.aShortArray9282[var13];
                     var11 = 255 - this.aByteArray9309[var56] << 24 | this.method8535(this.aShortArray9308[var56] & '\uffff', this.aShortArray9342[var56], this.aShort9343);
                     var8.putInt(var11);
                  }
               }

               var6.method235(0, var8.position(), this.aClass174_Sub3_9284.aLong9685);
            }

            this.aClass371_9318.anInterface35_3885 = var6;
            this.aClass371_9318.aBool3884 = true;
         }

         if(var2) {
            if(this.aClass371_9319.anInterface35_3886 == null) {
               this.aClass371_9319.anInterface35_3886 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
            }

            var6 = this.aClass371_9319.anInterface35_3886;
            var6.method249(this.anInt9296 * 12, 12);
            short[] var33;
            short[] var35;
            byte[] var57;
            if(this.aClass368_9305 != null) {
               var33 = this.aClass368_9305.aShortArray3871;
               var35 = this.aClass368_9305.aShortArray3870;
               var39 = this.aClass368_9305.aShortArray3872;
               var57 = this.aClass368_9305.aByteArray3869;
            } else {
               var33 = this.aShortArray9358;
               var35 = this.aShortArray9292;
               var39 = this.aShortArray9301;
               var57 = this.aByteArray9302;
            }

            Unsafe var42 = this.aClass174_Sub3_9284.anUnsafe9670;
            if(var42 != null) {
               int var44 = this.anInt9296 * 12;
               long var31 = var6.method236(0, var44);

               for(var16 = 0; var16 < this.anInt9296; ++var16) {
                  Class446 var49 = new Class446((float)var33[var16], (float)var35[var16], (float)var39[var16]);
                  if(var49.method5276() != 0.0F) {
                     if(var57[var16] > 1) {
                        var49.method5264((float)var57[var16]);
                     }

                     var49.method5311();
                  }

                  var42.putFloat(var31, var49.aFloat4917);
                  var31 += 4L;
                  var42.putFloat(var31, var49.aFloat4915);
                  var31 += 4L;
                  var42.putFloat(var31, var49.aFloat4919);
                  var31 += 4L;
               }

               var6.method234();
            } else {
               ByteBuffer var41 = this.aClass174_Sub3_9284.aByteBuffer9684;
               var41.clear();

               for(var45 = 0; var45 < this.anInt9296; ++var45) {
                  Class446 var46 = new Class446((float)var33[var45], (float)var35[var45], (float)var39[var45]);
                  if(var46.method5276() != 0.0F) {
                     if(var57[var45] > 1) {
                        var46.method5264((float)var57[var45]);
                     }

                     var46.method5311();
                  }

                  var41.putFloat(var46.aFloat4917);
                  var41.putFloat(var46.aFloat4915);
                  var41.putFloat(var46.aFloat4919);
               }

               var6.method235(0, var41.position(), this.aClass174_Sub3_9284.aLong9685);
            }

            this.aClass371_9319.anInterface35_3885 = var6;
            this.aClass371_9319.aBool3884 = true;
         }

         if(var4) {
            if(this.aClass371_9323.anInterface35_3886 == null) {
               this.aClass371_9323.anInterface35_3886 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
            }

            var6 = this.aClass371_9323.anInterface35_3886;
            var6.method249(this.anInt9296 * 8, 8);
            var7 = this.aClass174_Sub3_9284.anUnsafe9670;
            if(var7 != null) {
               var34 = this.anInt9296 * 8;
               var9 = var6.method236(0, var34);

               for(var11 = 0; var11 < this.anInt9296; ++var11) {
                  var7.putFloat(var9, this.aFloatArray9303[var11]);
                  var9 += 4L;
                  var7.putFloat(var9, this.aFloatArray9304[var11]);
                  var9 += 4L;
               }

               var6.method234();
            } else {
               var8 = this.aClass174_Sub3_9284.aByteBuffer9684;
               var8.clear();

               for(var13 = 0; var13 < this.anInt9296; ++var13) {
                  var8.putFloat(this.aFloatArray9303[var13]);
                  var8.putFloat(this.aFloatArray9304[var13]);
               }

               var6.method235(0, var8.position(), this.aClass174_Sub3_9284.aLong9685);
            }

            this.aClass371_9323.anInterface35_3885 = var6;
            this.aClass371_9323.aBool3884 = true;
         }

         return var5;
      }
   }

   void method8533() {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.method4655();
      }

      if(this.aClass371_9323 != null) {
         this.aClass371_9323.method4655();
      }

      if(this.aClass371_9318 != null) {
         this.aClass371_9318.method4655();
      }

      if(this.aClass371_9319 != null) {
         this.aClass371_9319.method4655();
      }

      if(this.aClass343_9316 != null) {
         this.aClass343_9316.method4431();
      }

   }

   int method8534(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 126) {
         var2 = 126;
      }

      return (var1 & '\uff80') + var2;
   }

   int method8535(int var1, short var2, int var3) {
      int var4 = this.aClass174_Sub3_9284.anIntArray9718[this.method8534(var1, var3)];
      if(var2 != -1) {
         Class171 var5 = this.aClass174_Sub3_9284.aClass169_2035.method2122(var2 & '\uffff', (byte)54);
         int var6 = var5.aByte1969 & 255;
         int var7;
         int var9;
         if(var6 != 0) {
            var7 = 131586 * var3;
            if(var3 < 0) {
               var7 = 0;
            } else if(var3 > 127) {
               var7 = 16777215;
            } else {
               var7 = 131586 * var3;
            }

            if(var6 == 256) {
               var4 = var7;
            } else {
               var9 = 256 - var6;
               var4 = ((var7 & 16711935) * var6 + (var4 & 16711935) * var9 & -16711936) + ((var7 & '\uff00') * var6 + (var4 & '\uff00') * var9 & 16711680) >> 8;
            }
         }

         var7 = var5.aByte2012 & 255;
         if(var7 != 0) {
            var7 += 256;
            int var8 = ((var4 & 16711680) >> 16) * var7;
            if(var8 > '\uffff') {
               var8 = '\uffff';
            }

            var9 = ((var4 & '\uff00') >> 8) * var7;
            if(var9 > '\uffff') {
               var9 = '\uffff';
            }

            int var10 = (var4 & 255) * var7;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var4 = (var8 << 8 & 16711680) + (var9 & '\uff00') + (var10 >> 8);
         }
      }

      return var4 & 16777215;
   }

   public void method1968(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub2 var6 = (Class168_Sub2)var1;
      if(this.anInt9300 != 0 && var6.anInt9300 != 0) {
         int var7 = var6.anInt9287;
         int[] var8 = var6.anIntArray9291;
         int[] var9 = var6.anIntArray9286;
         int[] var10 = var6.anIntArray9307;
         short[] var11 = var6.aShortArray9358;
         short[] var12 = var6.aShortArray9292;
         short[] var13 = var6.aShortArray9301;
         byte[] var14 = var6.aByteArray9302;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if(this.aClass368_9305 != null) {
            var15 = this.aClass368_9305.aShortArray3871;
            var16 = this.aClass368_9305.aShortArray3870;
            var17 = this.aClass368_9305.aShortArray3872;
            var18 = this.aClass368_9305.aByteArray3869;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if(var6.aClass368_9305 != null) {
            var19 = var6.aClass368_9305.aShortArray3871;
            var20 = var6.aClass368_9305.aShortArray3870;
            var21 = var6.aClass368_9305.aShortArray3872;
            var22 = var6.aClass368_9305.aByteArray3869;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray9339;
         short[] var24 = var6.aShortArray9299;
         if(!var6.aBool9327) {
            var6.method8528();
         }

         int var25 = var6.anInt9328;
         int var26 = var6.anInt9329;
         int var27 = var6.anInt9330;
         int var28 = var6.anInt9293;
         int var29 = var6.anInt9332;
         int var30 = var6.anInt9333;

         for(int var31 = 0; var31 < this.anInt9287; ++var31) {
            int var32 = this.anIntArray9286[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray9291[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray9307[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray9339[var31];
                     int var37 = this.anIntArray9339[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37 && this.aShortArray9299[var38] != 0; ++var38) {
                        var35 = (this.aShortArray9299[var38] & '\uffff') - 1;
                        if(this.aByteArray9302[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37 && var24[var40] != 0; ++var40) {
                                 var39 = var24[var40] - 1 & '\uffff';
                                 if(var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass368_9305 = new Class368();
                                    var15 = this.aClass368_9305.aShortArray3871 = Class189.method2746(this.aShortArray9358, -1995924092);
                                    var16 = this.aClass368_9305.aShortArray3870 = Class189.method2746(this.aShortArray9292, -1372507797);
                                    var17 = this.aClass368_9305.aShortArray3872 = Class189.method2746(this.aShortArray9301, -2117597673);
                                    var18 = this.aClass368_9305.aByteArray3869 = Class639_Sub1.method9870(this.aByteArray9302, (byte)-45);
                                 }

                                 if(var19 == null) {
                                    Class368 var46 = var6.aClass368_9305 = new Class368();
                                    var19 = var46.aShortArray3871 = Class189.method2746(var11, -968603373);
                                    var20 = var46.aShortArray3870 = Class189.method2746(var12, -1679227910);
                                    var21 = var46.aShortArray3872 = Class189.method2746(var13, -1284911830);
                                    var22 = var46.aByteArray3869 = Class639_Sub1.method9870(var14, (byte)-9);
                                 }

                                 short var47 = this.aShortArray9358[var35];
                                 short var41 = this.aShortArray9292[var35];
                                 short var42 = this.aShortArray9301[var35];
                                 byte var43 = this.aByteArray9302[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var47;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var47 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray9339[var31];
                                 var37 = this.anIntArray9339[var31 + 1];

                                 for(var44 = var36; var44 < var37 && this.aShortArray9299[var44] != 0; ++var44) {
                                    var45 = (this.aShortArray9299[var44] & '\uffff') - 1;
                                    if(var18[var45] != 0) {
                                       var15[var45] += var47;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 var6.method8537();
                                 this.method8537();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method2001(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub2 var6 = (Class168_Sub2)var1;
      if(this.anInt9300 != 0 && var6.anInt9300 != 0) {
         int var7 = var6.anInt9287;
         int[] var8 = var6.anIntArray9291;
         int[] var9 = var6.anIntArray9286;
         int[] var10 = var6.anIntArray9307;
         short[] var11 = var6.aShortArray9358;
         short[] var12 = var6.aShortArray9292;
         short[] var13 = var6.aShortArray9301;
         byte[] var14 = var6.aByteArray9302;
         short[] var15;
         short[] var16;
         short[] var17;
         byte[] var18;
         if(this.aClass368_9305 != null) {
            var15 = this.aClass368_9305.aShortArray3871;
            var16 = this.aClass368_9305.aShortArray3870;
            var17 = this.aClass368_9305.aShortArray3872;
            var18 = this.aClass368_9305.aByteArray3869;
         } else {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
         }

         short[] var19;
         short[] var20;
         short[] var21;
         byte[] var22;
         if(var6.aClass368_9305 != null) {
            var19 = var6.aClass368_9305.aShortArray3871;
            var20 = var6.aClass368_9305.aShortArray3870;
            var21 = var6.aClass368_9305.aShortArray3872;
            var22 = var6.aClass368_9305.aByteArray3869;
         } else {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
         }

         int[] var23 = var6.anIntArray9339;
         short[] var24 = var6.aShortArray9299;
         if(!var6.aBool9327) {
            var6.method8528();
         }

         int var25 = var6.anInt9328;
         int var26 = var6.anInt9329;
         int var27 = var6.anInt9330;
         int var28 = var6.anInt9293;
         int var29 = var6.anInt9332;
         int var30 = var6.anInt9333;

         for(int var31 = 0; var31 < this.anInt9287; ++var31) {
            int var32 = this.anIntArray9286[var31] - var3;
            if(var32 >= var25 && var32 <= var26) {
               int var33 = this.anIntArray9291[var31] - var2;
               if(var33 >= var27 && var33 <= var28) {
                  int var34 = this.anIntArray9307[var31] - var4;
                  if(var34 >= var29 && var34 <= var30) {
                     int var35 = -1;
                     int var36 = this.anIntArray9339[var31];
                     int var37 = this.anIntArray9339[var31 + 1];

                     int var38;
                     for(var38 = var36; var38 < var37 && this.aShortArray9299[var38] != 0; ++var38) {
                        var35 = (this.aShortArray9299[var38] & '\uffff') - 1;
                        if(this.aByteArray9302[var35] != 0) {
                           break;
                        }
                     }

                     if(var35 != -1) {
                        for(var38 = 0; var38 < var7; ++var38) {
                           if(var33 == var8[var38] && var34 == var10[var38] && var32 == var9[var38]) {
                              int var39 = -1;
                              var36 = var23[var38];
                              var37 = var23[var38 + 1];

                              for(int var40 = var36; var40 < var37 && var24[var40] != 0; ++var40) {
                                 var39 = var24[var40] - 1 & '\uffff';
                                 if(var14[var39] != 0) {
                                    break;
                                 }
                              }

                              if(var39 != -1) {
                                 if(var15 == null) {
                                    this.aClass368_9305 = new Class368();
                                    var15 = this.aClass368_9305.aShortArray3871 = Class189.method2746(this.aShortArray9358, -1878947511);
                                    var16 = this.aClass368_9305.aShortArray3870 = Class189.method2746(this.aShortArray9292, -1697788154);
                                    var17 = this.aClass368_9305.aShortArray3872 = Class189.method2746(this.aShortArray9301, -1572710292);
                                    var18 = this.aClass368_9305.aByteArray3869 = Class639_Sub1.method9870(this.aByteArray9302, (byte)13);
                                 }

                                 if(var19 == null) {
                                    Class368 var46 = var6.aClass368_9305 = new Class368();
                                    var19 = var46.aShortArray3871 = Class189.method2746(var11, -838843171);
                                    var20 = var46.aShortArray3870 = Class189.method2746(var12, -2036018801);
                                    var21 = var46.aShortArray3872 = Class189.method2746(var13, -1237230719);
                                    var22 = var46.aByteArray3869 = Class639_Sub1.method9870(var14, (byte)-62);
                                 }

                                 short var47 = this.aShortArray9358[var35];
                                 short var41 = this.aShortArray9292[var35];
                                 short var42 = this.aShortArray9301[var35];
                                 byte var43 = this.aByteArray9302[var35];
                                 var36 = var23[var38];
                                 var37 = var23[var38 + 1];

                                 int var44;
                                 int var45;
                                 for(var44 = var36; var44 < var37; ++var44) {
                                    var45 = var24[var44] - 1;
                                    if(var45 == -1) {
                                       break;
                                    }

                                    if(var22[var45] != 0) {
                                       var19[var45] += var47;
                                       var20[var45] += var41;
                                       var21[var45] += var42;
                                       var22[var45] += var43;
                                    }
                                 }

                                 var47 = var11[var39];
                                 var41 = var12[var39];
                                 var42 = var13[var39];
                                 var43 = var14[var39];
                                 var36 = this.anIntArray9339[var31];
                                 var37 = this.anIntArray9339[var31 + 1];

                                 for(var44 = var36; var44 < var37 && this.aShortArray9299[var44] != 0; ++var44) {
                                    var45 = (this.aShortArray9299[var44] & '\uffff') - 1;
                                    if(var18[var45] != 0) {
                                       var15[var45] += var47;
                                       var16[var45] += var41;
                                       var17[var45] += var42;
                                       var18[var45] += var43;
                                    }
                                 }

                                 var6.method8537();
                                 this.method8537();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method1969(int var1) {
      this.aShort9343 = (short)var1;
      this.method8526();
   }

   public void method1967(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.anInt9287; ++var4) {
         var5 = this.anIntArray9307[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt9296; ++var4) {
         var5 = this.aShortArray9301[var4] * var2 + this.aShortArray9358[var4] * var3 >> 14;
         this.aShortArray9301[var4] = (short)(this.aShortArray9301[var4] * var3 - this.aShortArray9358[var4] * var2 >> 14);
         this.aShortArray9358[var4] = (short)var5;
      }

      this.method8548();
      this.method8537();
      this.aBool9327 = false;
   }

   public int method1977() {
      return this.anInt9353;
   }

   boolean method8536(int var1, int var2, int var3, int var4, Class445 var5, boolean var6, int var7) {
      Class433 var8 = this.aClass174_Sub3_9284.aClass433_9705;
      var8.method5110(var5);
      var8.method5085(this.aClass174_Sub3_9284.aClass433_9747);
      boolean var9 = false;
      float var10 = Float.MAX_VALUE;
      float var11 = -3.4028235E38F;
      float var12 = Float.MAX_VALUE;
      float var13 = -3.4028235E38F;
      if(!this.aBool9327) {
         this.method8528();
      }

      int var14 = this.anInt9293 - this.anInt9330 >> 1;
      int var15 = this.anInt9329 - this.anInt9328 >> 1;
      int var16 = this.anInt9333 - this.anInt9332 >> 1;
      int var17 = this.anInt9330 + var14;
      int var18 = this.anInt9328 + var15;
      int var19 = this.anInt9332 + var16;
      int var20 = var17 - (var14 << var7);
      int var21 = var18 - (var15 << var7);
      int var22 = var19 - (var16 << var7);
      int var23 = var17 + (var14 << var7);
      int var24 = var18 + (var15 << var7);
      int var25 = var19 + (var16 << var7);
      this.anIntArray9351[0] = var20;
      this.anIntArray9352[0] = var21;
      this.anIntArray9340[0] = var22;
      this.anIntArray9351[1] = var23;
      this.anIntArray9352[1] = var21;
      this.anIntArray9340[1] = var22;
      this.anIntArray9351[2] = var20;
      this.anIntArray9352[2] = var24;
      this.anIntArray9340[2] = var22;
      this.anIntArray9351[3] = var23;
      this.anIntArray9352[3] = var24;
      this.anIntArray9340[3] = var22;
      this.anIntArray9351[4] = var20;
      this.anIntArray9352[4] = var21;
      this.anIntArray9340[4] = var25;
      this.anIntArray9351[5] = var23;
      this.anIntArray9352[5] = var21;
      this.anIntArray9340[5] = var25;
      this.anIntArray9351[6] = var20;
      this.anIntArray9352[6] = var24;
      this.anIntArray9340[6] = var25;
      this.anIntArray9351[7] = var23;
      this.anIntArray9352[7] = var24;
      this.anIntArray9340[7] = var25;

      int var26;
      float var27;
      float var28;
      float var29;
      float var30;
      float var31;
      float var32;
      float var33;
      for(var26 = 0; var26 < 8; ++var26) {
         var27 = (float)this.anIntArray9351[var26];
         var28 = (float)this.anIntArray9352[var26];
         var29 = (float)this.anIntArray9340[var26];
         var30 = var8.aFloatArray4841[2] * var27 + var8.aFloatArray4841[6] * var28 + var8.aFloatArray4841[10] * var29 + var8.aFloatArray4841[14];
         var31 = var8.aFloatArray4841[3] * var27 + var8.aFloatArray4841[7] * var28 + var8.aFloatArray4841[11] * var29 + var8.aFloatArray4841[15];
         if(var30 >= -var31) {
            var32 = var8.aFloatArray4841[0] * var27 + var8.aFloatArray4841[4] * var28 + var8.aFloatArray4841[8] * var29 + var8.aFloatArray4841[12];
            var33 = var8.aFloatArray4841[1] * var27 + var8.aFloatArray4841[5] * var28 + var8.aFloatArray4841[9] * var29 + var8.aFloatArray4841[13];
            float var34 = this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var32 / var31;
            float var35 = this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var33 / var31;
            if(var34 < var10) {
               var10 = var34;
            }

            if(var34 > var11) {
               var11 = var34;
            }

            if(var35 < var12) {
               var12 = var35;
            }

            if(var35 > var13) {
               var13 = var35;
            }

            var9 = true;
         }
      }

      var26 = var1 + var3;
      int var40 = var2 + var4;
      if(var9 && (float)var26 > var10 && (float)var1 < var11 && (float)var40 > var12 && (float)var2 < var13) {
         if(var6) {
            return true;
         }

         if(this.anIntArray9290.length < this.anInt9296) {
            this.anIntArray9290 = new int[this.anInt9296];
            this.anIntArray9334 = new int[this.anInt9296];
         }

         int var41;
         for(var41 = 0; var41 < this.anInt9287; ++var41) {
            var27 = (float)this.anIntArray9291[var41];
            var28 = (float)this.anIntArray9286[var41];
            var29 = (float)this.anIntArray9307[var41];
            var30 = var8.aFloatArray4841[2] * var27 + var8.aFloatArray4841[6] * var28 + var8.aFloatArray4841[10] * var29 + var8.aFloatArray4841[14];
            var31 = var8.aFloatArray4841[3] * var27 + var8.aFloatArray4841[7] * var28 + var8.aFloatArray4841[11] * var29 + var8.aFloatArray4841[15];
            int var36;
            int var37;
            int var38;
            int var39;
            if(var30 >= -var31) {
               var32 = var8.aFloatArray4841[0] * var27 + var8.aFloatArray4841[4] * var28 + var8.aFloatArray4841[8] * var29 + var8.aFloatArray4841[12];
               var33 = var8.aFloatArray4841[1] * var27 + var8.aFloatArray4841[5] * var28 + var8.aFloatArray4841[9] * var29 + var8.aFloatArray4841[13];
               var36 = this.anIntArray9339[var41];
               var37 = this.anIntArray9339[var41 + 1];

               for(var38 = var36; var38 < var37 && this.aShortArray9299[var38] != 0; ++var38) {
                  var39 = (this.aShortArray9299[var38] & '\uffff') - 1;
                  this.anIntArray9290[var39] = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var32 / var31);
                  this.anIntArray9334[var39] = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var33 / var31);
               }
            } else {
               var36 = this.anIntArray9339[var41];
               var37 = this.anIntArray9339[var41 + 1];

               for(var38 = var36; var38 < var37 && this.aShortArray9299[var38] != 0; ++var38) {
                  var39 = (this.aShortArray9299[var38] & '\uffff') - 1;
                  this.anIntArray9290[var39] = -999999;
               }
            }
         }

         for(var41 = 0; var41 < this.anInt9300; ++var41) {
            if(this.anIntArray9290[this.aShortArray9310[var41] & '\uffff'] != -999999 && this.anIntArray9290[this.aShortArray9311[var41] & '\uffff'] != -999999 && this.anIntArray9290[this.aShortArray9345[var41] & '\uffff'] != -999999 && this.method8523(var1, var2, var26, var40, this.anIntArray9334[this.aShortArray9310[var41] & '\uffff'], this.anIntArray9334[this.aShortArray9311[var41] & '\uffff'], this.anIntArray9334[this.aShortArray9345[var41] & '\uffff'], this.anIntArray9290[this.aShortArray9310[var41] & '\uffff'], this.anIntArray9290[this.aShortArray9311[var41] & '\uffff'], this.anIntArray9290[this.aShortArray9345[var41] & '\uffff'])) {
               return true;
            }
         }
      }

      return false;
   }

   public void method2005(int var1) {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3883 = Class336.method4285(var1, this.anInt9285);
      }

      if(this.aClass371_9323 != null) {
         this.aClass371_9323.aBool3883 = Class336.method4288(var1, this.anInt9285);
      }

      if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3883 = Class336.method4287(var1, this.anInt9285);
      }

      if(this.aClass371_9319 != null) {
         this.aClass371_9319.aBool3883 = Class336.method4286(var1, this.anInt9285);
      }

      this.anInt9353 = var1;
      if(this.aClass368_9305 != null && (this.anInt9353 & 65536) == 0) {
         this.aShortArray9358 = this.aClass368_9305.aShortArray3871;
         this.aShortArray9292 = this.aClass368_9305.aShortArray3870;
         this.aShortArray9301 = this.aClass368_9305.aShortArray3872;
         this.aByteArray9302 = this.aClass368_9305.aByteArray3869;
         this.aClass368_9305 = null;
      }

      this.aBool9322 = true;
      this.method8525();
   }

   public void method2006(int var1) {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3883 = Class336.method4285(var1, this.anInt9285);
      }

      if(this.aClass371_9323 != null) {
         this.aClass371_9323.aBool3883 = Class336.method4288(var1, this.anInt9285);
      }

      if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3883 = Class336.method4287(var1, this.anInt9285);
      }

      if(this.aClass371_9319 != null) {
         this.aClass371_9319.aBool3883 = Class336.method4286(var1, this.anInt9285);
      }

      this.anInt9353 = var1;
      if(this.aClass368_9305 != null && (this.anInt9353 & 65536) == 0) {
         this.aShortArray9358 = this.aClass368_9305.aShortArray3871;
         this.aShortArray9292 = this.aClass368_9305.aShortArray3870;
         this.aShortArray9301 = this.aClass368_9305.aShortArray3872;
         this.aByteArray9302 = this.aClass368_9305.aByteArray3869;
         this.aClass368_9305 = null;
      }

      this.aBool9322 = true;
      this.method8525();
   }

   public void method2007(int var1) {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3883 = Class336.method4285(var1, this.anInt9285);
      }

      if(this.aClass371_9323 != null) {
         this.aClass371_9323.aBool3883 = Class336.method4288(var1, this.anInt9285);
      }

      if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3883 = Class336.method4287(var1, this.anInt9285);
      }

      if(this.aClass371_9319 != null) {
         this.aClass371_9319.aBool3883 = Class336.method4286(var1, this.anInt9285);
      }

      this.anInt9353 = var1;
      if(this.aClass368_9305 != null && (this.anInt9353 & 65536) == 0) {
         this.aShortArray9358 = this.aClass368_9305.aShortArray3871;
         this.aShortArray9292 = this.aClass368_9305.aShortArray3870;
         this.aShortArray9301 = this.aClass368_9305.aShortArray3872;
         this.aByteArray9302 = this.aClass368_9305.aByteArray3869;
         this.aClass368_9305 = null;
      }

      this.aBool9322 = true;
      this.method8525();
   }

   public int method2065() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9328;
   }

   public void method2010(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9307[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method2011(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9307[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public boolean method2097() {
      if(this.aShortArray9342 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9342.length; ++var1) {
            if(this.aShortArray9342[var1] != -1 && !this.aClass174_Sub3_9284.aClass346_9775.method4469(this.aClass174_Sub3_9284.aClass169_2035.method2122(this.aShortArray9342[var1], (byte)113), -1)) {
               return false;
            }
         }

         return true;
      }
   }

   public void method2013(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.anInt9287; ++var4) {
         var5 = this.anIntArray9307[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt9296; ++var4) {
         var5 = this.aShortArray9301[var4] * var2 + this.aShortArray9358[var4] * var3 >> 14;
         this.aShortArray9301[var4] = (short)(this.aShortArray9301[var4] * var3 - this.aShortArray9358[var4] * var2 >> 14);
         this.aShortArray9358[var4] = (short)var5;
      }

      this.method8548();
      this.method8537();
      this.aBool9327 = false;
   }

   public void method1959(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9286[var4] * var3 - this.anIntArray9307[var4] * var2 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9286[var4] * var2 + this.anIntArray9307[var4] * var3 >> 14;
         this.anIntArray9286[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method1998(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9286[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9286[var4] = this.anIntArray9286[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method2051(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 0) {
            this.anIntArray9291[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9286[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9307[var4] += var3;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   void method8537() {
      if((this.anInt9285 & 55) != 0) {
         if(this.aClass371_9319 != null) {
            this.aClass371_9319.aBool3884 = false;
         }
      } else if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3884 = false;
      }

   }

   public void method1952(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      int var4;
      int var5;
      for(var4 = 0; var4 < this.anInt9287; ++var4) {
         var5 = this.anIntArray9307[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      for(var4 = 0; var4 < this.anInt9296; ++var4) {
         var5 = this.aShortArray9301[var4] * var2 + this.aShortArray9358[var4] * var3 >> 14;
         this.aShortArray9301[var4] = (short)(this.aShortArray9301[var4] * var3 - this.aShortArray9358[var4] * var2 >> 14);
         this.aShortArray9358[var4] = (short)var5;
      }

      this.method8548();
      this.method8537();
      this.aBool9327 = false;
   }

   public void method2080(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 0) {
            this.anIntArray9291[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9286[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9307[var4] += var3;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method2022() {
      int var1;
      for(var1 = 0; var1 < this.anInt9287; ++var1) {
         this.anIntArray9307[var1] = -this.anIntArray9307[var1];
      }

      for(var1 = 0; var1 < this.anInt9296; ++var1) {
         this.aShortArray9301[var1] = (short)(-this.aShortArray9301[var1]);
      }

      for(var1 = 0; var1 < this.anInt9300; ++var1) {
         short var2 = this.aShortArray9310[var1];
         this.aShortArray9310[var1] = this.aShortArray9345[var1];
         this.aShortArray9345[var1] = var2;
      }

      this.method8548();
      this.method8537();
      this.method8527();
      this.aBool9327 = false;
   }

   public void method2050() {
      int var1;
      for(var1 = 0; var1 < this.anInt9287; ++var1) {
         this.anIntArray9307[var1] = -this.anIntArray9307[var1];
      }

      for(var1 = 0; var1 < this.anInt9296; ++var1) {
         this.aShortArray9301[var1] = (short)(-this.aShortArray9301[var1]);
      }

      for(var1 = 0; var1 < this.anInt9300; ++var1) {
         short var2 = this.aShortArray9310[var1];
         this.aShortArray9310[var1] = this.aShortArray9345[var1];
         this.aShortArray9345[var1] = var2;
      }

      this.method8548();
      this.method8537();
      this.method8527();
      this.aBool9327 = false;
   }

   public void method2024() {
      int var1;
      for(var1 = 0; var1 < this.anInt9287; ++var1) {
         this.anIntArray9307[var1] = -this.anIntArray9307[var1];
      }

      for(var1 = 0; var1 < this.anInt9296; ++var1) {
         this.aShortArray9301[var1] = (short)(-this.aShortArray9301[var1]);
      }

      for(var1 = 0; var1 < this.anInt9300; ++var1) {
         short var2 = this.aShortArray9310[var1];
         this.aShortArray9310[var1] = this.aShortArray9345[var1];
         this.aShortArray9345[var1] = var2;
      }

      this.method8548();
      this.method8537();
      this.method8527();
      this.aBool9327 = false;
   }

   public void method2025() {
      int var1;
      for(var1 = 0; var1 < this.anInt9287; ++var1) {
         this.anIntArray9307[var1] = -this.anIntArray9307[var1];
      }

      for(var1 = 0; var1 < this.anInt9296; ++var1) {
         this.aShortArray9301[var1] = (short)(-this.aShortArray9301[var1]);
      }

      for(var1 = 0; var1 < this.anInt9300; ++var1) {
         short var2 = this.aShortArray9310[var1];
         this.aShortArray9310[var1] = this.aShortArray9345[var1];
         this.aShortArray9345[var1] = var2;
      }

      this.method8548();
      this.method8537();
      this.method8527();
      this.aBool9327 = false;
   }

   public void method2026() {
      int var1;
      for(var1 = 0; var1 < this.anInt9287; ++var1) {
         this.anIntArray9307[var1] = -this.anIntArray9307[var1];
      }

      for(var1 = 0; var1 < this.anInt9296; ++var1) {
         this.aShortArray9301[var1] = (short)(-this.aShortArray9301[var1]);
      }

      for(var1 = 0; var1 < this.anInt9300; ++var1) {
         short var2 = this.aShortArray9310[var1];
         this.aShortArray9310[var1] = this.aShortArray9345[var1];
         this.aShortArray9345[var1] = var2;
      }

      this.method8548();
      this.method8537();
      this.method8527();
      this.aBool9327 = false;
   }

   public void method2027(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 128) {
            this.anIntArray9291[var4] = this.anIntArray9291[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9286[var4] = this.anIntArray9286[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 >> 7;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method2069(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 128) {
            this.anIntArray9291[var4] = this.anIntArray9291[var4] * var1 >> 7;
         }

         if(var2 != 128) {
            this.anIntArray9286[var4] = this.anIntArray9286[var4] * var2 >> 7;
         }

         if(var3 != 128) {
            this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 >> 7;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public int method2107() {
      if(!this.aBool9289) {
         this.method1986();
      }

      return this.anInt9335;
   }

   public void method2030(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7) {
      if(!this.aBool9327) {
         this.method8528();
      }

      int var8 = var5 + this.anInt9330;
      int var9 = var5 + this.anInt9293;
      int var10 = var7 + this.anInt9332;
      int var11 = var7 + this.anInt9333;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1711 * 1966165105 && var10 >= 0 && var11 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1713 * -810756899) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.anInt1710 * -586661047;
            var9 = var9 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            var10 >>= var3.anInt1710 * -586661047;
            var11 = var11 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            if(var3.method1714(var8, var10, 1226406431) == var6 && var3.method1714(var9, var10, 1411253874) == var6 && var3.method1714(var8, var11, -934506680) == var6 && var3.method1714(var9, var11, -1159964036) == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1711 * 1966165105 || var10 < 0 || var11 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1713 * -810756899) {
               return;
            }
         }

         int var12;
         if(var1 == 1) {
            for(var12 = 0; var12 < this.anInt9287; ++var12) {
               this.anIntArray9286[var12] = this.anIntArray9286[var12] + var3.method1724(this.anIntArray9291[var12] + var5, this.anIntArray9307[var12] + var7, (byte)18) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               var12 = this.anInt9328;
               if(var12 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.anInt9287; ++var13) {
                  var14 = (this.anIntArray9286[var13] << 16) / var12;
                  if(var14 < var2) {
                     this.anIntArray9286[var13] += (var3.method1724(this.anIntArray9291[var13] + var5, this.anIntArray9307[var13] + var7, (byte)-87) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if(var1 == 3) {
                  var12 = (var2 & 255) * 16;
                  var13 = (var2 >> 8 & 255) * 16;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1711 * 1966165105 << var3.anInt1710 * -586661047 || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1713 * -810756899 << var3.anInt1710 * -586661047) {
                     return;
                  }

                  this.method1966(var3, var5, var6, var7, var12, var13, var14, var15);
               } else if(var1 == 4) {
                  var12 = this.anInt9329 - this.anInt9328;

                  for(var13 = 0; var13 < this.anInt9287; ++var13) {
                     this.anIntArray9286[var13] = this.anIntArray9286[var13] + (var4.method1724(this.anIntArray9291[var13] + var5, this.anIntArray9307[var13] + var7, (byte)12) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.anInt9329 - this.anInt9328;

                  for(var13 = 0; var13 < this.anInt9287; ++var13) {
                     var14 = this.anIntArray9291[var13] + var5;
                     var15 = this.anIntArray9307[var13] + var7;
                     int var16 = var3.method1724(var14, var15, (byte)-49);
                     int var17 = var4.method1724(var14, var15, (byte)-15);
                     int var18 = var16 - var17 - var2;
                     this.anIntArray9286[var13] = ((this.anIntArray9286[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         this.method8548();
         this.aBool9327 = false;
      }
   }

   public Class182[] method1997() {
      return this.aClass182Array9341;
   }

   void method2032() {
   }

   void method2033() {
   }

   boolean method2034() {
      if(this.anIntArrayArray9294 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9357; ++var1) {
            this.anIntArray9291[var1] <<= 4;
            this.anIntArray9286[var1] <<= 4;
            this.anIntArray9307[var1] <<= 4;
         }

         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;
         return true;
      }
   }

   boolean method2035() {
      if(this.anIntArrayArray9294 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9357; ++var1) {
            this.anIntArray9291[var1] <<= 4;
            this.anIntArray9286[var1] <<= 4;
            this.anIntArray9307[var1] <<= 4;
         }

         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;
         return true;
      }
   }

   boolean method2103() {
      if(this.anIntArrayArray9294 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9357; ++var1) {
            this.anIntArray9291[var1] <<= 4;
            this.anIntArray9286[var1] <<= 4;
            this.anIntArray9307[var1] <<= 4;
         }

         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;
         return true;
      }
   }

   void method1978() {
   }

   boolean method2068() {
      if(this.anIntArrayArray9294 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9357; ++var1) {
            this.anIntArray9291[var1] <<= 4;
            this.anIntArray9286[var1] <<= 4;
            this.anIntArray9307[var1] <<= 4;
         }

         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;
         return true;
      }
   }

   void method2039(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var22;
      int[] var24;
      int var25;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            var22 = var2[var10];
            if(var22 < this.anIntArrayArray9294.length) {
               var24 = this.anIntArrayArray9294[var22];

               for(var25 = 0; var25 < var24.length; ++var25) {
                  var14 = var24[var25];
                  this.anInt9354 += this.anIntArray9291[var14];
                  this.anInt9355 += this.anIntArray9286[var14];
                  this.anInt9356 += this.anIntArray9307[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9354 = this.anInt9354 / var9 + var3;
            this.anInt9355 = this.anInt9355 / var9 + var4;
            this.anInt9356 = this.anInt9356 / var9 + var5;
         } else {
            this.anInt9354 = var3;
            this.anInt9355 = var4;
            this.anInt9356 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9294.length) {
                  var11 = this.anIntArrayArray9294[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var25 = var11[var12];
                     this.anIntArray9291[var25] += var3;
                     this.anIntArray9286[var25] += var4;
                     this.anIntArray9307[var25] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            int var18;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9294.length) {
                        var11 = this.anIntArrayArray9294[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           var14 = this.anIntArray9339[var25];
                           var15 = this.anIntArray9339[var25 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9299[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9299[var16] & '\uffff') - 1;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9292[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9292[var17] = (short)(this.aShortArray9292[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9292[var17] * var19 - this.aShortArray9301[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9292[var17] * var18 + this.aShortArray9301[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9292[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9301[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9301[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  this.method8537();
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var25 = var11[var12];
                        this.anIntArray9291[var25] -= this.anInt9354;
                        this.anIntArray9286[var25] -= this.anInt9355;
                        this.anIntArray9307[var25] -= this.anInt9356;
                        this.anIntArray9291[var25] = this.anIntArray9291[var25] * var3 >> 7;
                        this.anIntArray9286[var25] = this.anIntArray9286[var25] * var4 >> 7;
                        this.anIntArray9307[var25] = this.anIntArray9307[var25] * var5 >> 7;
                        this.anIntArray9291[var25] += this.anInt9354;
                        this.anIntArray9286[var25] += this.anInt9355;
                        this.anIntArray9307[var25] += this.anInt9356;
                     }
                  }
               }

            } else {
               boolean var21;
               Class360 var23;
               Class352 var26;
               if(var1 == 5) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = (this.aByteArray9309[var14] & 255) + var3 * 8;
                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 > 255) {
                                 var15 = 255;
                              }

                              this.aByteArray9309[var14] = (byte)var15;
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var23.anInt3826] & 255) << 24;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = this.aShortArray9308[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 7) {
                                 var17 = 7;
                              }

                              var18 += var5;
                              if(var18 < 0) {
                                 var18 = 0;
                              } else if(var18 > 127) {
                                 var18 = 127;
                              }

                              this.aShortArray9308[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var23.anInt3826] & '\uffff'] & 16777215;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else {
                  Class352 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3663 += var3;
                                 var13.anInt3666 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3667 = var13.anInt3667 * var3 >> 7;
                                 var13.anInt3665 = var13.anInt3665 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3668 = var13.anInt3668 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2067(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var22;
      int[] var24;
      int var25;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            var22 = var2[var10];
            if(var22 < this.anIntArrayArray9294.length) {
               var24 = this.anIntArrayArray9294[var22];

               for(var25 = 0; var25 < var24.length; ++var25) {
                  var14 = var24[var25];
                  this.anInt9354 += this.anIntArray9291[var14];
                  this.anInt9355 += this.anIntArray9286[var14];
                  this.anInt9356 += this.anIntArray9307[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9354 = this.anInt9354 / var9 + var3;
            this.anInt9355 = this.anInt9355 / var9 + var4;
            this.anInt9356 = this.anInt9356 / var9 + var5;
         } else {
            this.anInt9354 = var3;
            this.anInt9355 = var4;
            this.anInt9356 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9294.length) {
                  var11 = this.anIntArrayArray9294[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var25 = var11[var12];
                     this.anIntArray9291[var25] += var3;
                     this.anIntArray9286[var25] += var4;
                     this.anIntArray9307[var25] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            int var18;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9294.length) {
                        var11 = this.anIntArrayArray9294[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           var14 = this.anIntArray9339[var25];
                           var15 = this.anIntArray9339[var25 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9299[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9299[var16] & '\uffff') - 1;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9292[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9292[var17] = (short)(this.aShortArray9292[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9292[var17] * var19 - this.aShortArray9301[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9292[var17] * var18 + this.aShortArray9301[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9292[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9301[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9301[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  this.method8537();
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var25 = var11[var12];
                        this.anIntArray9291[var25] -= this.anInt9354;
                        this.anIntArray9286[var25] -= this.anInt9355;
                        this.anIntArray9307[var25] -= this.anInt9356;
                        this.anIntArray9291[var25] = this.anIntArray9291[var25] * var3 >> 7;
                        this.anIntArray9286[var25] = this.anIntArray9286[var25] * var4 >> 7;
                        this.anIntArray9307[var25] = this.anIntArray9307[var25] * var5 >> 7;
                        this.anIntArray9291[var25] += this.anInt9354;
                        this.anIntArray9286[var25] += this.anInt9355;
                        this.anIntArray9307[var25] += this.anInt9356;
                     }
                  }
               }

            } else {
               boolean var21;
               Class360 var23;
               Class352 var26;
               if(var1 == 5) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = (this.aByteArray9309[var14] & 255) + var3 * 8;
                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 > 255) {
                                 var15 = 255;
                              }

                              this.aByteArray9309[var14] = (byte)var15;
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var23.anInt3826] & 255) << 24;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = this.aShortArray9308[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 7) {
                                 var17 = 7;
                              }

                              var18 += var5;
                              if(var18 < 0) {
                                 var18 = 0;
                              } else if(var18 > 127) {
                                 var18 = 127;
                              }

                              this.aShortArray9308[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var23.anInt3826] & '\uffff'] & 16777215;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else {
                  Class352 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3663 += var3;
                                 var13.anInt3666 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3667 = var13.anInt3667 * var3 >> 7;
                                 var13.anInt3665 = var13.anInt3665 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3668 = var13.anInt3668 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2012(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var22;
      int[] var24;
      int var25;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var9 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            var22 = var2[var10];
            if(var22 < this.anIntArrayArray9294.length) {
               var24 = this.anIntArrayArray9294[var22];

               for(var25 = 0; var25 < var24.length; ++var25) {
                  var14 = var24[var25];
                  this.anInt9354 += this.anIntArray9291[var14];
                  this.anInt9355 += this.anIntArray9286[var14];
                  this.anInt9356 += this.anIntArray9307[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9354 = this.anInt9354 / var9 + var3;
            this.anInt9355 = this.anInt9355 / var9 + var4;
            this.anInt9356 = this.anInt9356 / var9 + var5;
         } else {
            this.anInt9354 = var3;
            this.anInt9355 = var4;
            this.anInt9356 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9294.length) {
                  var11 = this.anIntArrayArray9294[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var25 = var11[var12];
                     this.anIntArray9291[var25] += var3;
                     this.anIntArray9286[var25] += var4;
                     this.anIntArray9307[var25] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            int var17;
            int var18;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           this.anIntArray9291[var25] -= this.anInt9354;
                           this.anIntArray9286[var25] -= this.anInt9355;
                           this.anIntArray9307[var25] -= this.anInt9356;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9286[var25] * var15 - this.anIntArray9307[var25] * var14 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9286[var25] * var14 + this.anIntArray9307[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9286[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9286[var25] = this.anIntArray9286[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9307[var25] * var14 + this.anIntArray9291[var25] * var15 + 16383 >> 14;
                              this.anIntArray9307[var25] = this.anIntArray9307[var25] * var15 - this.anIntArray9291[var25] * var14 + 16383 >> 14;
                              this.anIntArray9291[var25] = var16;
                           }

                           this.anIntArray9291[var25] += this.anInt9354;
                           this.anIntArray9286[var25] += this.anInt9355;
                           this.anIntArray9307[var25] += this.anInt9356;
                        }
                     }
                  }
               }

               if(var7) {
                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var2[var9];
                     if(var10 < this.anIntArrayArray9294.length) {
                        var11 = this.anIntArrayArray9294[var10];

                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var25 = var11[var12];
                           var14 = this.anIntArray9339[var25];
                           var15 = this.anIntArray9339[var25 + 1];

                           for(var16 = var14; var16 < var15 && this.aShortArray9299[var16] != 0; ++var16) {
                              var17 = (this.aShortArray9299[var16] & '\uffff') - 1;
                              int var19;
                              int var20;
                              if(var5 != 0) {
                                 var18 = Class443.anIntArray4895[var5];
                                 var19 = Class443.anIntArray4896[var5];
                                 var20 = this.aShortArray9292[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9292[var17] = (short)(this.aShortArray9292[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }

                              if(var3 != 0) {
                                 var18 = Class443.anIntArray4895[var3];
                                 var19 = Class443.anIntArray4896[var3];
                                 var20 = this.aShortArray9292[var17] * var19 - this.aShortArray9301[var17] * var18 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9292[var17] * var18 + this.aShortArray9301[var17] * var19 + 16383 >> 14);
                                 this.aShortArray9292[var17] = (short)var20;
                              }

                              if(var4 != 0) {
                                 var18 = Class443.anIntArray4895[var4];
                                 var19 = Class443.anIntArray4896[var4];
                                 var20 = this.aShortArray9301[var17] * var18 + this.aShortArray9358[var17] * var19 + 16383 >> 14;
                                 this.aShortArray9301[var17] = (short)(this.aShortArray9301[var17] * var19 - this.aShortArray9358[var17] * var18 + 16383 >> 14);
                                 this.aShortArray9358[var17] = (short)var20;
                              }
                           }
                        }
                     }
                  }

                  this.method8537();
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9294.length) {
                     var11 = this.anIntArrayArray9294[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var25 = var11[var12];
                        this.anIntArray9291[var25] -= this.anInt9354;
                        this.anIntArray9286[var25] -= this.anInt9355;
                        this.anIntArray9307[var25] -= this.anInt9356;
                        this.anIntArray9291[var25] = this.anIntArray9291[var25] * var3 >> 7;
                        this.anIntArray9286[var25] = this.anIntArray9286[var25] * var4 >> 7;
                        this.anIntArray9307[var25] = this.anIntArray9307[var25] * var5 >> 7;
                        this.anIntArray9291[var25] += this.anInt9354;
                        this.anIntArray9286[var25] += this.anInt9355;
                        this.anIntArray9307[var25] += this.anInt9356;
                     }
                  }
               }

            } else {
               boolean var21;
               Class360 var23;
               Class352 var26;
               if(var1 == 5) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = (this.aByteArray9309[var14] & 255) + var3 * 8;
                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 > 255) {
                                 var15 = 255;
                              }

                              this.aByteArray9309[var14] = (byte)var15;
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var23.anInt3826] & 255) << 24;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9350 != null) {
                     var21 = false;

                     for(var10 = 0; var10 < var8; ++var10) {
                        var22 = var2[var10];
                        if(var22 < this.anIntArrayArray9350.length) {
                           var24 = this.anIntArrayArray9350[var22];

                           for(var25 = 0; var25 < var24.length; ++var25) {
                              var14 = var24[var25];
                              var15 = this.aShortArray9308[var14] & '\uffff';
                              var16 = var15 >> 10 & 63;
                              var17 = var15 >> 7 & 7;
                              var18 = var15 & 127;
                              var16 = var16 + var3 & 63;
                              var17 += var4 / 4;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 7) {
                                 var17 = 7;
                              }

                              var18 += var5;
                              if(var18 < 0) {
                                 var18 = 0;
                              } else if(var18 > 127) {
                                 var18 = 127;
                              }

                              this.aShortArray9308[var14] = (short)(var16 << 10 | var17 << 7 | var18);
                           }

                           var21 |= var24.length > 0;
                        }
                     }

                     if(var21) {
                        if(this.aClass360Array9344 != null) {
                           for(var10 = 0; var10 < this.anInt9313; ++var10) {
                              var23 = this.aClass360Array9344[var10];
                              var26 = this.aClass352Array9326[var10];
                              var26.anInt3664 = var26.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var23.anInt3826] & '\uffff'] & 16777215;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else {
                  Class352 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3663 += var3;
                                 var13.anInt3666 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3667 = var13.anInt3667 * var3 >> 7;
                                 var13.anInt3665 = var13.anInt3665 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9346.length) {
                              var11 = this.anIntArrayArray9346[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass352Array9326[var11[var12]];
                                 var13.anInt3668 = var13.anInt3668 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2119(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var48;
      int[] var50;
      int var51;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var48 = var2[var11];
            if(var48 < this.anIntArrayArray9294.length) {
               var50 = this.anIntArrayArray9294[var48];

               for(var51 = 0; var51 < var50.length; ++var51) {
                  var15 = var50[var51];
                  if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var15]) != 0) {
                     this.anInt9354 += this.anIntArray9291[var15];
                     this.anInt9355 += this.anIntArray9286[var15];
                     this.anInt9356 += this.anIntArray9307[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt9354 = this.anInt9354 / var10 + var3;
            this.anInt9355 = this.anInt9355 / var10 + var4;
            this.anInt9356 = this.anInt9356 / var10 + var5;
            this.aBool9317 = true;
         } else {
            this.anInt9354 = var3;
            this.anInt9355 = var4;
            this.anInt9356 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var48 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var48;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9294.length) {
                  var12 = this.anIntArrayArray9294[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var51 = var12[var13];
                     if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                        this.anIntArray9291[var51] += var3;
                        this.anIntArray9286[var51] += var4;
                        this.anIntArray9307[var51] += var5;
                     }
                  }
               }
            }

         } else {
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var26;
            int var27;
            int var28;
            int var30;
            int var32;
            int var33;
            int var34;
            int[] var35;
            int var36;
            int var37;
            int var38;
            int var39;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9317) {
                     var16 = var8[0] * this.anInt9354 + var8[3] * this.anInt9355 + var8[6] * this.anInt9356 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9354 + var8[4] * this.anInt9355 + var8[7] * this.anInt9356 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9354 + var8[5] * this.anInt9355 + var8[8] * this.anInt9356 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt9354 = var16;
                     this.anInt9355 = var17;
                     this.anInt9356 = var18;
                     this.aBool9317 = false;
                  }

                  int[] var53 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var53[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var53[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var53[2] = var20 * var17 + 8192 >> 14;
                  var53[3] = var17 * var22 + 8192 >> 14;
                  var53[4] = var17 * var21 + 8192 >> 14;
                  var53[5] = -var18;
                  var53[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var53[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var53[8] = var19 * var17 + 8192 >> 14;
                  int var54 = var53[0] * -this.anInt9354 + var53[1] * -this.anInt9355 + var53[2] * -this.anInt9356 + 8192 >> 14;
                  var26 = var53[3] * -this.anInt9354 + var53[4] * -this.anInt9355 + var53[5] * -this.anInt9356 + 8192 >> 14;
                  var27 = var53[6] * -this.anInt9354 + var53[7] * -this.anInt9355 + var53[8] * -this.anInt9356 + 8192 >> 14;
                  var28 = var54 + this.anInt9354;
                  int var55 = var26 + this.anInt9355;
                  var30 = var27 + this.anInt9356;
                  int[] var56 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var57 = 0; var57 < 3; ++var57) {
                           var34 += var53[var32 * 3 + var57] * var8[var33 * 3 + var57];
                        }

                        var56[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var53[0] * var13 + var53[1] * var51 + var53[2] * var15 + 8192 >> 14;
                  var33 = var53[3] * var13 + var53[4] * var51 + var53[5] * var15 + 8192 >> 14;
                  var34 = var53[6] * var13 + var53[7] * var51 + var53[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var55;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var56[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var48;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9294.length) {
                        int[] var41 = this.anIntArrayArray9294[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9291[var43] + var35[1] * this.anIntArray9286[var43] + var35[2] * this.anIntArray9307[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9291[var43] + var35[4] * this.anIntArray9286[var43] + var35[5] * this.anIntArray9307[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9291[var43] + var35[7] * this.anIntArray9286[var43] + var35[8] * this.anIntArray9307[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9291[var43] = var44;
                              this.anIntArray9286[var43] = var45;
                              this.anIntArray9307[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9294.length) {
                        var12 = this.anIntArrayArray9294[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                              this.anIntArray9291[var51] -= this.anInt9354;
                              this.anIntArray9286[var51] -= this.anInt9355;
                              this.anIntArray9307[var51] -= this.anInt9356;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9286[var51] * var15 + this.anIntArray9291[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9286[var51] = this.anIntArray9286[var51] * var16 - this.anIntArray9291[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9291[var51] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9286[var51] * var16 - this.anIntArray9307[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9307[var51] = this.anIntArray9286[var51] * var15 + this.anIntArray9307[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9286[var51] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9307[var51] * var15 + this.anIntArray9291[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9307[var51] = this.anIntArray9307[var51] * var16 - this.anIntArray9291[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9291[var51] = var17;
                              }

                              this.anIntArray9291[var51] += this.anInt9354;
                              this.anIntArray9286[var51] += this.anInt9355;
                              this.anIntArray9307[var51] += this.anInt9356;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9294.length) {
                           var12 = this.anIntArrayArray9294[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var51 = var12[var13];
                              if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                                 var15 = this.anIntArray9339[var51];
                                 var16 = this.anIntArray9339[var51 + 1];

                                 for(var17 = var15; var17 < var16 && this.aShortArray9299[var17] != 0; ++var17) {
                                    var18 = (this.aShortArray9299[var17] & '\uffff') - 1;
                                    if(var5 != 0) {
                                       var19 = Class443.anIntArray4895[var5];
                                       var20 = Class443.anIntArray4896[var5];
                                       var21 = this.aShortArray9292[var18] * var19 + this.aShortArray9358[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9292[var18] = (short)(this.aShortArray9292[var18] * var20 - this.aShortArray9358[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9358[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class443.anIntArray4895[var3];
                                       var20 = Class443.anIntArray4896[var3];
                                       var21 = this.aShortArray9292[var18] * var20 - this.aShortArray9301[var18] * var19 + 16383 >> 14;
                                       this.aShortArray9301[var18] = (short)(this.aShortArray9292[var18] * var19 + this.aShortArray9301[var18] * var20 + 16383 >> 14);
                                       this.aShortArray9292[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class443.anIntArray4895[var4];
                                       var20 = Class443.anIntArray4896[var4];
                                       var21 = this.aShortArray9301[var18] * var19 + this.aShortArray9358[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9301[var18] = (short)(this.aShortArray9301[var18] * var20 - this.aShortArray9358[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9358[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     this.method8537();
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9317) {
                     var16 = var8[0] * this.anInt9354 + var8[3] * this.anInt9355 + var8[6] * this.anInt9356 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9354 + var8[4] * this.anInt9355 + var8[7] * this.anInt9356 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9354 + var8[5] * this.anInt9355 + var8[8] * this.anInt9356 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt9354 = var16;
                     this.anInt9355 = var17;
                     this.anInt9356 = var18;
                     this.aBool9317 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt9354 + 8192 >> 14;
                  var20 = var17 * -this.anInt9355 + 8192 >> 14;
                  var21 = var18 * -this.anInt9356 + 8192 >> 14;
                  var22 = var19 + this.anInt9354;
                  var23 = var20 + this.anInt9355;
                  var24 = var21 + this.anInt9356;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var51 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var48;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9294.length) {
                        var35 = this.anIntArrayArray9294[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9291[var37] + var29[1] * this.anIntArray9286[var37] + var29[2] * this.anIntArray9307[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9291[var37] + var29[4] * this.anIntArray9286[var37] + var29[5] * this.anIntArray9307[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9291[var37] + var29[7] * this.anIntArray9286[var37] + var29[8] * this.anIntArray9307[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9291[var37] = var38;
                              this.anIntArray9286[var37] = var39;
                              this.anIntArray9307[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9294.length) {
                        var12 = this.anIntArrayArray9294[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                              this.anIntArray9291[var51] -= this.anInt9354;
                              this.anIntArray9286[var51] -= this.anInt9355;
                              this.anIntArray9307[var51] -= this.anInt9356;
                              this.anIntArray9291[var51] = this.anIntArray9291[var51] * var3 >> 7;
                              this.anIntArray9286[var51] = this.anIntArray9286[var51] * var4 >> 7;
                              this.anIntArray9307[var51] = this.anIntArray9307[var51] * var5 >> 7;
                              this.anIntArray9291[var51] += this.anInt9354;
                              this.anIntArray9286[var51] += this.anInt9355;
                              this.anIntArray9307[var51] += this.anInt9356;
                           }
                        }
                     }
                  }
               }

            } else {
               boolean var47;
               Class360 var49;
               Class352 var52;
               if(var1 == 5) {
                  if(this.anIntArrayArray9350 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray9350.length) {
                           var50 = this.anIntArrayArray9350[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray9315 == null || (var7 & this.aShortArray9315[var15]) != 0) {
                                 var16 = (this.aByteArray9309[var15] & 255) + var3 * 8;
                                 if(var16 < 0) {
                                    var16 = 0;
                                 } else if(var16 > 255) {
                                    var16 = 255;
                                 }

                                 this.aByteArray9309[var15] = (byte)var16;
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass360Array9344 != null) {
                           for(var11 = 0; var11 < this.anInt9313; ++var11) {
                              var49 = this.aClass360Array9344[var11];
                              var52 = this.aClass352Array9326[var11];
                              var52.anInt3664 = var52.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var49.anInt3826] & 255) << 24;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9350 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray9350.length) {
                           var50 = this.anIntArrayArray9350[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray9315 == null || (var7 & this.aShortArray9315[var15]) != 0) {
                                 var16 = this.aShortArray9308[var15] & '\uffff';
                                 var17 = var16 >> 10 & 63;
                                 var18 = var16 >> 7 & 7;
                                 var19 = var16 & 127;
                                 var17 = var17 + var3 & 63;
                                 var18 += var4 / 4;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 7) {
                                    var18 = 7;
                                 }

                                 var19 += var5;
                                 if(var19 < 0) {
                                    var19 = 0;
                                 } else if(var19 > 127) {
                                    var19 = 127;
                                 }

                                 this.aShortArray9308[var15] = (short)(var17 << 10 | var18 << 7 | var19);
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass360Array9344 != null) {
                           for(var11 = 0; var11 < this.anInt9313; ++var11) {
                              var49 = this.aClass360Array9344[var11];
                              var52 = this.aClass352Array9326[var11];
                              var52.anInt3664 = var52.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var49.anInt3826] & '\uffff'] & 16777215;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else {
                  Class352 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3663 += var3;
                                 var14.anInt3666 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3667 = var14.anInt3667 * var3 >> 7;
                                 var14.anInt3665 = var14.anInt3665 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3668 = var14.anInt3668 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   void method2043(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var48;
      int[] var50;
      int var51;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         var10 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var48 = var2[var11];
            if(var48 < this.anIntArrayArray9294.length) {
               var50 = this.anIntArrayArray9294[var48];

               for(var51 = 0; var51 < var50.length; ++var51) {
                  var15 = var50[var51];
                  if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var15]) != 0) {
                     this.anInt9354 += this.anIntArray9291[var15];
                     this.anInt9355 += this.anIntArray9286[var15];
                     this.anInt9356 += this.anIntArray9307[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt9354 = this.anInt9354 / var10 + var3;
            this.anInt9355 = this.anInt9355 / var10 + var4;
            this.anInt9356 = this.anInt9356 / var10 + var5;
            this.aBool9317 = true;
         } else {
            this.anInt9354 = var3;
            this.anInt9355 = var4;
            this.anInt9356 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var48 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var48;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9294.length) {
                  var12 = this.anIntArrayArray9294[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var51 = var12[var13];
                     if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                        this.anIntArray9291[var51] += var3;
                        this.anIntArray9286[var51] += var4;
                        this.anIntArray9307[var51] += var5;
                     }
                  }
               }
            }

         } else {
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var26;
            int var27;
            int var28;
            int var30;
            int var32;
            int var33;
            int var34;
            int[] var35;
            int var36;
            int var37;
            int var38;
            int var39;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9317) {
                     var16 = var8[0] * this.anInt9354 + var8[3] * this.anInt9355 + var8[6] * this.anInt9356 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9354 + var8[4] * this.anInt9355 + var8[7] * this.anInt9356 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9354 + var8[5] * this.anInt9355 + var8[8] * this.anInt9356 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt9354 = var16;
                     this.anInt9355 = var17;
                     this.anInt9356 = var18;
                     this.aBool9317 = false;
                  }

                  int[] var53 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var53[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var53[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var53[2] = var20 * var17 + 8192 >> 14;
                  var53[3] = var17 * var22 + 8192 >> 14;
                  var53[4] = var17 * var21 + 8192 >> 14;
                  var53[5] = -var18;
                  var53[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var53[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var53[8] = var19 * var17 + 8192 >> 14;
                  int var54 = var53[0] * -this.anInt9354 + var53[1] * -this.anInt9355 + var53[2] * -this.anInt9356 + 8192 >> 14;
                  var26 = var53[3] * -this.anInt9354 + var53[4] * -this.anInt9355 + var53[5] * -this.anInt9356 + 8192 >> 14;
                  var27 = var53[6] * -this.anInt9354 + var53[7] * -this.anInt9355 + var53[8] * -this.anInt9356 + 8192 >> 14;
                  var28 = var54 + this.anInt9354;
                  int var55 = var26 + this.anInt9355;
                  var30 = var27 + this.anInt9356;
                  int[] var56 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var57 = 0; var57 < 3; ++var57) {
                           var34 += var53[var32 * 3 + var57] * var8[var33 * 3 + var57];
                        }

                        var56[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var53[0] * var13 + var53[1] * var51 + var53[2] * var15 + 8192 >> 14;
                  var33 = var53[3] * var13 + var53[4] * var51 + var53[5] * var15 + 8192 >> 14;
                  var34 = var53[6] * var13 + var53[7] * var51 + var53[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var55;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var56[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var48;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9294.length) {
                        int[] var41 = this.anIntArrayArray9294[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9291[var43] + var35[1] * this.anIntArray9286[var43] + var35[2] * this.anIntArray9307[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9291[var43] + var35[4] * this.anIntArray9286[var43] + var35[5] * this.anIntArray9307[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9291[var43] + var35[7] * this.anIntArray9286[var43] + var35[8] * this.anIntArray9307[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9291[var43] = var44;
                              this.anIntArray9286[var43] = var45;
                              this.anIntArray9307[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9294.length) {
                        var12 = this.anIntArrayArray9294[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                              this.anIntArray9291[var51] -= this.anInt9354;
                              this.anIntArray9286[var51] -= this.anInt9355;
                              this.anIntArray9307[var51] -= this.anInt9356;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9286[var51] * var15 + this.anIntArray9291[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9286[var51] = this.anIntArray9286[var51] * var16 - this.anIntArray9291[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9291[var51] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9286[var51] * var16 - this.anIntArray9307[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9307[var51] = this.anIntArray9286[var51] * var15 + this.anIntArray9307[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9286[var51] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9307[var51] * var15 + this.anIntArray9291[var51] * var16 + 16383 >> 14;
                                 this.anIntArray9307[var51] = this.anIntArray9307[var51] * var16 - this.anIntArray9291[var51] * var15 + 16383 >> 14;
                                 this.anIntArray9291[var51] = var17;
                              }

                              this.anIntArray9291[var51] += this.anInt9354;
                              this.anIntArray9286[var51] += this.anInt9355;
                              this.anIntArray9307[var51] += this.anInt9356;
                           }
                        }
                     }
                  }

                  if(var6) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9294.length) {
                           var12 = this.anIntArrayArray9294[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var51 = var12[var13];
                              if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                                 var15 = this.anIntArray9339[var51];
                                 var16 = this.anIntArray9339[var51 + 1];

                                 for(var17 = var15; var17 < var16 && this.aShortArray9299[var17] != 0; ++var17) {
                                    var18 = (this.aShortArray9299[var17] & '\uffff') - 1;
                                    if(var5 != 0) {
                                       var19 = Class443.anIntArray4895[var5];
                                       var20 = Class443.anIntArray4896[var5];
                                       var21 = this.aShortArray9292[var18] * var19 + this.aShortArray9358[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9292[var18] = (short)(this.aShortArray9292[var18] * var20 - this.aShortArray9358[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9358[var18] = (short)var21;
                                    }

                                    if(var3 != 0) {
                                       var19 = Class443.anIntArray4895[var3];
                                       var20 = Class443.anIntArray4896[var3];
                                       var21 = this.aShortArray9292[var18] * var20 - this.aShortArray9301[var18] * var19 + 16383 >> 14;
                                       this.aShortArray9301[var18] = (short)(this.aShortArray9292[var18] * var19 + this.aShortArray9301[var18] * var20 + 16383 >> 14);
                                       this.aShortArray9292[var18] = (short)var21;
                                    }

                                    if(var4 != 0) {
                                       var19 = Class443.anIntArray4895[var4];
                                       var20 = Class443.anIntArray4896[var4];
                                       var21 = this.aShortArray9301[var18] * var19 + this.aShortArray9358[var18] * var20 + 16383 >> 14;
                                       this.aShortArray9301[var18] = (short)(this.aShortArray9301[var18] * var20 - this.aShortArray9358[var18] * var19 + 16383 >> 14);
                                       this.aShortArray9358[var18] = (short)var21;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     this.method8537();
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var48 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var51 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9317) {
                     var16 = var8[0] * this.anInt9354 + var8[3] * this.anInt9355 + var8[6] * this.anInt9356 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9354 + var8[4] * this.anInt9355 + var8[7] * this.anInt9356 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9354 + var8[5] * this.anInt9355 + var8[8] * this.anInt9356 + 8192 >> 14;
                     var16 += var13;
                     var17 += var51;
                     var18 += var15;
                     this.anInt9354 = var16;
                     this.anInt9355 = var17;
                     this.anInt9356 = var18;
                     this.aBool9317 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt9354 + 8192 >> 14;
                  var20 = var17 * -this.anInt9355 + 8192 >> 14;
                  var21 = var18 * -this.anInt9356 + 8192 >> 14;
                  var22 = var19 + this.anInt9354;
                  var23 = var20 + this.anInt9355;
                  var24 = var21 + this.anInt9356;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var51 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var48;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9294.length) {
                        var35 = this.anIntArrayArray9294[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9291[var37] + var29[1] * this.anIntArray9286[var37] + var29[2] * this.anIntArray9307[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9291[var37] + var29[4] * this.anIntArray9286[var37] + var29[5] * this.anIntArray9307[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9291[var37] + var29[7] * this.anIntArray9286[var37] + var29[8] * this.anIntArray9307[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9291[var37] = var38;
                              this.anIntArray9286[var37] = var39;
                              this.anIntArray9307[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9294.length) {
                        var12 = this.anIntArrayArray9294[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var51 = var12[var13];
                           if(this.aShortArray9295 == null || (var7 & this.aShortArray9295[var51]) != 0) {
                              this.anIntArray9291[var51] -= this.anInt9354;
                              this.anIntArray9286[var51] -= this.anInt9355;
                              this.anIntArray9307[var51] -= this.anInt9356;
                              this.anIntArray9291[var51] = this.anIntArray9291[var51] * var3 >> 7;
                              this.anIntArray9286[var51] = this.anIntArray9286[var51] * var4 >> 7;
                              this.anIntArray9307[var51] = this.anIntArray9307[var51] * var5 >> 7;
                              this.anIntArray9291[var51] += this.anInt9354;
                              this.anIntArray9286[var51] += this.anInt9355;
                              this.anIntArray9307[var51] += this.anInt9356;
                           }
                        }
                     }
                  }
               }

            } else {
               boolean var47;
               Class360 var49;
               Class352 var52;
               if(var1 == 5) {
                  if(this.anIntArrayArray9350 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray9350.length) {
                           var50 = this.anIntArrayArray9350[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray9315 == null || (var7 & this.aShortArray9315[var15]) != 0) {
                                 var16 = (this.aByteArray9309[var15] & 255) + var3 * 8;
                                 if(var16 < 0) {
                                    var16 = 0;
                                 } else if(var16 > 255) {
                                    var16 = 255;
                                 }

                                 this.aByteArray9309[var15] = (byte)var16;
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass360Array9344 != null) {
                           for(var11 = 0; var11 < this.anInt9313; ++var11) {
                              var49 = this.aClass360Array9344[var11];
                              var52 = this.aClass352Array9326[var11];
                              var52.anInt3664 = var52.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var49.anInt3826] & 255) << 24;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9350 != null) {
                     var47 = false;

                     for(var11 = 0; var11 < var9; ++var11) {
                        var48 = var2[var11];
                        if(var48 < this.anIntArrayArray9350.length) {
                           var50 = this.anIntArrayArray9350[var48];

                           for(var51 = 0; var51 < var50.length; ++var51) {
                              var15 = var50[var51];
                              if(this.aShortArray9315 == null || (var7 & this.aShortArray9315[var15]) != 0) {
                                 var16 = this.aShortArray9308[var15] & '\uffff';
                                 var17 = var16 >> 10 & 63;
                                 var18 = var16 >> 7 & 7;
                                 var19 = var16 & 127;
                                 var17 = var17 + var3 & 63;
                                 var18 += var4 / 4;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 7) {
                                    var18 = 7;
                                 }

                                 var19 += var5;
                                 if(var19 < 0) {
                                    var19 = 0;
                                 } else if(var19 > 127) {
                                    var19 = 127;
                                 }

                                 this.aShortArray9308[var15] = (short)(var17 << 10 | var18 << 7 | var19);
                              }
                           }

                           var47 |= var50.length > 0;
                        }
                     }

                     if(var47) {
                        if(this.aClass360Array9344 != null) {
                           for(var11 = 0; var11 < this.anInt9313; ++var11) {
                              var49 = this.aClass360Array9344[var11];
                              var52 = this.aClass352Array9326[var11];
                              var52.anInt3664 = var52.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var49.anInt3826] & '\uffff'] & 16777215;
                           }
                        }

                        this.method8526();
                     }
                  }

               } else {
                  Class352 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3663 += var3;
                                 var14.anInt3666 += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3667 = var14.anInt3667 * var3 >> 7;
                                 var14.anInt3665 = var14.anInt3665 * var4 >> 7;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9346 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9346.length) {
                              var12 = this.anIntArrayArray9346[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass352Array9326[var12[var13]];
                                 var14.anInt3668 = var14.anInt3668 + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   public boolean method2100() {
      return this.aBool9331;
   }

   public void method1986() {
      if(!this.aBool9289) {
         if(!this.aBool9327) {
            this.method8528();
         }

         this.anInt9335 = this.anInt9328;
         this.aBool9289 = true;
      }

   }

   public void method2046(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9295 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub3_9284.aClass445_9704;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9287; ++var6) {
            if((var2 & this.aShortArray9295[var6]) != 0) {
               var4.method5233((float)this.anIntArray9291[var6], (float)this.anIntArray9286[var6], (float)this.anIntArray9307[var6], var5);
               this.anIntArray9291[var6] = (int)var5[0];
               this.anIntArray9286[var6] = (int)var5[1];
               this.anIntArray9307[var6] = (int)var5[2];
            }
         }

      }
   }

   public void method1995(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9295 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub3_9284.aClass445_9704;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9287; ++var6) {
            if((var2 & this.aShortArray9295[var6]) != 0) {
               var4.method5233((float)this.anIntArray9291[var6], (float)this.anIntArray9286[var6], (float)this.anIntArray9307[var6], var5);
               this.anIntArray9291[var6] = (int)var5[0];
               this.anIntArray9286[var6] = (int)var5[1];
               this.anIntArray9307[var6] = (int)var5[2];
            }
         }

      }
   }

   public void method2048(Class445 var1, Class164 var2, int var3) {
      if(aClass338_9349 != null) {
         aClass338_9349.method4408();
      }

      if(var2 != null) {
         var2.aBool1784 = false;
      }

      if(this.anInt9296 != 0) {
         Class433 var4 = this.aClass174_Sub3_9284.aClass433_9715;
         Class433 var5 = this.aClass174_Sub3_9284.aClass433_9705;
         Class433 var6 = this.aClass174_Sub3_9284.aClass433_9746;
         var5.method5110(var1);
         var6.method5083(var5);
         var6.method5085(this.aClass174_Sub3_9284.aClass433_9747);
         if(!this.aBool9327) {
            this.method8528();
         }

         float[] var7 = this.aClass174_Sub3_9284.aFloatArray9703;
         var5.method5089(0.0F, (float)this.anInt9328, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method5089(0.0F, (float)this.anInt9329, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var16;
         float var17;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aClass174_Sub3_9284.aFloatArrayArray9721[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt9320;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt9320;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.anInt9330 + this.anInt9293 >> 1;
            int var21 = this.anInt9332 + this.anInt9333 >> 1;
            int var23 = this.anInt9328;
            float var33 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var34 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            var16 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            var17 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var16 >= -var17) {
               var2.anInt1789 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var33 / var17);
               var2.anInt1786 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var34 / var17);
            } else {
               var18 = true;
            }

            var23 = this.anInt9329;
            float var25 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var26 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            float var27 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            float var28 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var27 >= -var28) {
               var2.anInt1785 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var25 / var28);
               var2.anInt1788 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var33 + var29 * (var25 - var33);
                     var31 = var34 + var29 * (var26 - var34);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt1789 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var30 / var32);
                     var2.anInt1786 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var33 - var25);
                     var31 = var26 + var29 * (var34 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt1785 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var30 / var32);
                     var2.anInt1788 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var33 + var4.aFloatArray4841[0] * (float)this.anInt9320 + var4.aFloatArray4841[12];
                  var30 = var17 + var4.aFloatArray4841[3] * (float)this.anInt9320 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub3_9284.aFloat9678 - (float)var2.anInt1789 + this.aClass174_Sub3_9284.aFloat9723 * var29 / var30);
               } else {
                  var29 = var25 + var4.aFloatArray4841[0] * (float)this.anInt9320 + var4.aFloatArray4841[12];
                  var30 = var28 + var4.aFloatArray4841[3] * (float)this.anInt9320 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub3_9284.aFloat9678 - (float)var2.anInt1785 + this.aClass174_Sub3_9284.aFloat9723 * var29 / var30);
               }

               var2.aBool1784 = true;
            }
         }

         this.aClass174_Sub3_9284.method8830(var3);
         this.method8530(var1);
         this.aClass174_Sub3_9284.method8830(0);
         var5.method5110(var1);
         var5.method5085(this.aClass174_Sub3_9284.aClass433_9753);
         this.method8531(var5);
      }
   }

   public void method2092(Class445 var1, Class164 var2, int var3) {
      if(aClass338_9349 != null) {
         aClass338_9349.method4408();
      }

      if(var2 != null) {
         var2.aBool1784 = false;
      }

      if(this.anInt9296 != 0) {
         Class433 var4 = this.aClass174_Sub3_9284.aClass433_9715;
         Class433 var5 = this.aClass174_Sub3_9284.aClass433_9705;
         Class433 var6 = this.aClass174_Sub3_9284.aClass433_9746;
         var5.method5110(var1);
         var6.method5083(var5);
         var6.method5085(this.aClass174_Sub3_9284.aClass433_9747);
         if(!this.aBool9327) {
            this.method8528();
         }

         float[] var7 = this.aClass174_Sub3_9284.aFloatArray9703;
         var5.method5089(0.0F, (float)this.anInt9328, 0.0F, var7);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = var7[2];
         var5.method5089(0.0F, (float)this.anInt9329, 0.0F, var7);
         float var11 = var7[0];
         float var12 = var7[1];
         float var13 = var7[2];

         float var16;
         float var17;
         for(int var14 = 0; var14 < 6; ++var14) {
            float[] var15 = this.aClass174_Sub3_9284.aFloatArrayArray9721[var14];
            var16 = var15[0] * var8 + var15[1] * var9 + var15[2] * var10 + var15[3] + (float)this.anInt9320;
            var17 = var15[0] * var11 + var15[1] * var12 + var15[2] * var13 + var15[3] + (float)this.anInt9320;
            if(var16 < 0.0F && var17 < 0.0F) {
               return;
            }
         }

         if(var2 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.anInt9330 + this.anInt9293 >> 1;
            int var21 = this.anInt9332 + this.anInt9333 >> 1;
            int var23 = this.anInt9328;
            float var33 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var34 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            var16 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            var17 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var16 >= -var17) {
               var2.anInt1789 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var33 / var17);
               var2.anInt1786 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var34 / var17);
            } else {
               var18 = true;
            }

            var23 = this.anInt9329;
            float var25 = var6.aFloatArray4841[0] * (float)var20 + var6.aFloatArray4841[4] * (float)var23 + var6.aFloatArray4841[8] * (float)var21 + var6.aFloatArray4841[12];
            float var26 = var6.aFloatArray4841[1] * (float)var20 + var6.aFloatArray4841[5] * (float)var23 + var6.aFloatArray4841[9] * (float)var21 + var6.aFloatArray4841[13];
            float var27 = var6.aFloatArray4841[2] * (float)var20 + var6.aFloatArray4841[6] * (float)var23 + var6.aFloatArray4841[10] * (float)var21 + var6.aFloatArray4841[14];
            float var28 = var6.aFloatArray4841[3] * (float)var20 + var6.aFloatArray4841[7] * (float)var23 + var6.aFloatArray4841[11] * (float)var21 + var6.aFloatArray4841[15];
            if(var27 >= -var28) {
               var2.anInt1785 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var25 / var28);
               var2.anInt1788 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var26 / var28);
            } else {
               var18 = true;
            }

            float var29;
            float var30;
            if(var18) {
               if(var16 < -var17 && var27 < -var28) {
                  var19 = false;
               } else {
                  float var31;
                  float var32;
                  if(var16 < -var17) {
                     var29 = (var16 + var17) / (var27 + var28) - 1.0F;
                     var30 = var33 + var29 * (var25 - var33);
                     var31 = var34 + var29 * (var26 - var34);
                     var32 = var17 + var29 * (var28 - var17);
                     var2.anInt1789 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var30 / var32);
                     var2.anInt1786 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var31 / var32);
                  } else if(var27 < -var28) {
                     var29 = (var27 + var28) / (var16 + var17) - 1.0F;
                     var30 = var25 + var29 * (var33 - var25);
                     var31 = var26 + var29 * (var34 - var26);
                     var32 = var28 + var29 * (var17 - var28);
                     var2.anInt1785 = (int)(this.aClass174_Sub3_9284.aFloat9678 + this.aClass174_Sub3_9284.aFloat9723 * var30 / var32);
                     var2.anInt1788 = (int)(this.aClass174_Sub3_9284.aFloat9689 + this.aClass174_Sub3_9284.aFloat9725 * var31 / var32);
                  }
               }
            }

            if(var19) {
               if(var16 / var17 > var27 / var28) {
                  var29 = var33 + var4.aFloatArray4841[0] * (float)this.anInt9320 + var4.aFloatArray4841[12];
                  var30 = var17 + var4.aFloatArray4841[3] * (float)this.anInt9320 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub3_9284.aFloat9678 - (float)var2.anInt1789 + this.aClass174_Sub3_9284.aFloat9723 * var29 / var30);
               } else {
                  var29 = var25 + var4.aFloatArray4841[0] * (float)this.anInt9320 + var4.aFloatArray4841[12];
                  var30 = var28 + var4.aFloatArray4841[3] * (float)this.anInt9320 + var4.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub3_9284.aFloat9678 - (float)var2.anInt1785 + this.aClass174_Sub3_9284.aFloat9723 * var29 / var30);
               }

               var2.aBool1784 = true;
            }
         }

         this.aClass174_Sub3_9284.method8830(var3);
         this.method8530(var1);
         this.aClass174_Sub3_9284.method8830(0);
         var5.method5110(var1);
         var5.method5085(this.aClass174_Sub3_9284.aClass433_9753);
         this.method8531(var5);
      }
   }

   public boolean method2102() {
      return this.aBool9324;
   }

   public Class526_Sub21_Sub5 method2052(Class526_Sub21_Sub5 var1) {
      if(this.anInt9296 == 0) {
         return null;
      } else {
         if(!this.aBool9327) {
            this.method8528();
         }

         int var2;
         int var3;
         if(this.aClass174_Sub3_9284.anInt9750 > 0) {
            var2 = this.anInt9330 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var3 = this.anInt9293 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         } else {
            var2 = this.anInt9330 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var3 = this.anInt9293 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         }

         int var4;
         int var5;
         if(this.aClass174_Sub3_9284.anInt9770 > 0) {
            var4 = this.anInt9332 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var5 = this.anInt9333 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         } else {
            var4 = this.anInt9332 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var5 = this.anInt9333 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class526_Sub21_Sub5_Sub1 var8 = (Class526_Sub21_Sub5_Sub1)var1;
         Class526_Sub21_Sub5_Sub1 var9;
         if(var8 != null && var8.method10872(var6, var7)) {
            var9 = var8;
            var8.method10873();
         } else {
            var9 = new Class526_Sub21_Sub5_Sub1(this.aClass174_Sub3_9284, var6, var7);
         }

         var9.method10871(var2, var4, var3, var5);
         this.method8529(var9);
         return var9;
      }
   }

   public Class526_Sub21_Sub5 method2060(Class526_Sub21_Sub5 var1) {
      if(this.anInt9296 == 0) {
         return null;
      } else {
         if(!this.aBool9327) {
            this.method8528();
         }

         int var2;
         int var3;
         if(this.aClass174_Sub3_9284.anInt9750 > 0) {
            var2 = this.anInt9330 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var3 = this.anInt9293 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         } else {
            var2 = this.anInt9330 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var3 = this.anInt9293 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9750 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         }

         int var4;
         int var5;
         if(this.aClass174_Sub3_9284.anInt9770 > 0) {
            var4 = this.anInt9332 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var5 = this.anInt9333 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         } else {
            var4 = this.anInt9332 - (this.anInt9328 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
            var5 = this.anInt9333 - (this.anInt9329 * this.aClass174_Sub3_9284.anInt9770 >> 8) >> this.aClass174_Sub3_9284.anInt9710;
         }

         int var6 = var3 - var2 + 1;
         int var7 = var5 - var4 + 1;
         Class526_Sub21_Sub5_Sub1 var8 = (Class526_Sub21_Sub5_Sub1)var1;
         Class526_Sub21_Sub5_Sub1 var9;
         if(var8 != null && var8.method10872(var6, var7)) {
            var9 = var8;
            var8.method10873();
         } else {
            var9 = new Class526_Sub21_Sub5_Sub1(this.aClass174_Sub3_9284, var6, var7);
         }

         var9.method10871(var2, var4, var3, var5);
         this.method8529(var9);
         return var9;
      }
   }

   public void method2036(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7) {
      if(!this.aBool9327) {
         this.method8528();
      }

      int var8 = var5 + this.anInt9330;
      int var9 = var5 + this.anInt9293;
      int var10 = var7 + this.anInt9332;
      int var11 = var7 + this.anInt9333;
      if(var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var8 >= 0 && var9 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1711 * 1966165105 && var10 >= 0 && var11 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1713 * -810756899) {
         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.anInt1710 * -586661047;
            var9 = var9 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            var10 >>= var3.anInt1710 * -586661047;
            var11 = var11 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            if(var3.method1714(var8, var10, 953846589) == var6 && var3.method1714(var9, var10, 107290591) == var6 && var3.method1714(var8, var11, 1262703178) == var6 && var3.method1714(var9, var11, -43538979) == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1711 * 1966165105 || var10 < 0 || var11 + var4.anInt1712 * 1934131013 >> var4.anInt1710 * -586661047 >= var4.anInt1713 * -810756899) {
               return;
            }
         }

         int var12;
         if(var1 == 1) {
            for(var12 = 0; var12 < this.anInt9287; ++var12) {
               this.anIntArray9286[var12] = this.anIntArray9286[var12] + var3.method1724(this.anIntArray9291[var12] + var5, this.anIntArray9307[var12] + var7, (byte)-53) - var6;
            }
         } else {
            int var13;
            int var14;
            if(var1 == 2) {
               var12 = this.anInt9328;
               if(var12 == 0) {
                  return;
               }

               for(var13 = 0; var13 < this.anInt9287; ++var13) {
                  var14 = (this.anIntArray9286[var13] << 16) / var12;
                  if(var14 < var2) {
                     this.anIntArray9286[var13] += (var3.method1724(this.anIntArray9291[var13] + var5, this.anIntArray9307[var13] + var7, (byte)-23) - var6) * (var2 - var14) / var2;
                  }
               }
            } else {
               int var15;
               if(var1 == 3) {
                  var12 = (var2 & 255) * 16;
                  var13 = (var2 >> 8 & 255) * 16;
                  var14 = (var2 >> 16 & 255) << 6;
                  var15 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var12 >> 1) < 0 || var5 + (var12 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1711 * 1966165105 << var3.anInt1710 * -586661047 || var7 - (var13 >> 1) < 0 || var7 + (var13 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1713 * -810756899 << var3.anInt1710 * -586661047) {
                     return;
                  }

                  this.method1966(var3, var5, var6, var7, var12, var13, var14, var15);
               } else if(var1 == 4) {
                  var12 = this.anInt9329 - this.anInt9328;

                  for(var13 = 0; var13 < this.anInt9287; ++var13) {
                     this.anIntArray9286[var13] = this.anIntArray9286[var13] + (var4.method1724(this.anIntArray9291[var13] + var5, this.anIntArray9307[var13] + var7, (byte)35) - var6) + var12;
                  }
               } else if(var1 == 5) {
                  var12 = this.anInt9329 - this.anInt9328;

                  for(var13 = 0; var13 < this.anInt9287; ++var13) {
                     var14 = this.anIntArray9291[var13] + var5;
                     var15 = this.anIntArray9307[var13] + var7;
                     int var16 = var3.method1724(var14, var15, (byte)5);
                     int var17 = var4.method1724(var14, var15, (byte)-56);
                     int var18 = var16 - var17 - var2;
                     this.anIntArray9286[var13] = ((this.anIntArray9286[var13] << 8) / var12 * var18 >> 8) - (var6 - var16);
                  }
               }
            }
         }

         this.method8548();
         this.aBool9327 = false;
      }
   }

   public void method2055() {
      if(!this.aBool9289) {
         if(!this.aBool9327) {
            this.method8528();
         }

         this.anInt9335 = this.anInt9328;
         this.aBool9289 = true;
      }

   }

   public Class182[] method2040() {
      return this.aClass182Array9341;
   }

   public int method2057() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9320;
   }

   public int method2017() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9320;
   }

   public int method2058() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9325;
   }

   public int method2059() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9325;
   }

   public int method2042() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9325;
   }

   public void method2018(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 0) {
            this.anIntArray9291[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9286[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9307[var4] += var3;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public int method2081() {
      return this.aShort9288;
   }

   public int method2118() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9330;
   }

   public int method1991() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9293;
   }

   public boolean method2014() {
      return this.aBool9331;
   }

   public int method2093() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9328;
   }

   public int method1941() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9329;
   }

   boolean method2037() {
      if(this.anIntArrayArray9294 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < this.anInt9357; ++var1) {
            this.anIntArray9291[var1] <<= 4;
            this.anIntArray9286[var1] <<= 4;
            this.anIntArray9307[var1] <<= 4;
         }

         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;
         return true;
      }
   }

   public int method2071() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9333;
   }

   public int method2075() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9333;
   }

   public void method2073(int var1) {
      this.aShort9343 = (short)var1;
      this.method8526();
   }

   public boolean method1975(int var1, int var2, Class445 var3, boolean var4, int var5) {
      return this.method8536(var1, var2, 0, 0, var3, var4, var5);
   }

   public void method2021(int var1) {
      this.aShort9288 = (short)var1;
      this.method8548();
      this.method8537();
   }

   public void method1958(int var1) {
      this.aShort9288 = (short)var1;
      this.method8548();
      this.method8537();
   }

   public int method1965() {
      return this.aShort9343;
   }

   public int method2117() {
      return this.aShort9343;
   }

   public int method1993() {
      return this.aShort9343;
   }

   public int method2047() {
      return this.aShort9343;
   }

   public boolean method2116(int var1, int var2, Class445 var3, boolean var4, int var5) {
      return this.method8536(var1, var2, 0, 0, var3, var4, var5);
   }

   static float[] method8538(float[] var0, int var1) {
      float[] var2 = new float[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public int method2114() {
      return this.aShort9288;
   }

   public int method1981() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9328;
   }

   public byte[] method2085() {
      return this.aByteArray9309;
   }

   public void method2086(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9300; ++var3) {
         if(this.aShortArray9308[var3] == var1) {
            this.aShortArray9308[var3] = var2;
         }
      }

      if(this.aClass360Array9344 != null) {
         for(var3 = 0; var3 < this.anInt9313; ++var3) {
            Class360 var4 = this.aClass360Array9344[var3];
            Class352 var5 = this.aClass352Array9326[var3];
            var5.anInt3664 = var5.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var4.anInt3826] & '\uffff'] & 16777215;
         }
      }

      this.method8526();
   }

   public void method2087(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9300; ++var3) {
         if(this.aShortArray9308[var3] == var1) {
            this.aShortArray9308[var3] = var2;
         }
      }

      if(this.aClass360Array9344 != null) {
         for(var3 = 0; var3 < this.anInt9313; ++var3) {
            Class360 var4 = this.aClass360Array9344[var3];
            Class352 var5 = this.aClass352Array9326[var3];
            var5.anInt3664 = var5.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var4.anInt3826] & '\uffff'] & 16777215;
         }
      }

      this.method8526();
   }

   public void method2089(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.anInt9300; ++var3) {
            this.aByteArray9309[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.anInt9300; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.aByteArray9309[var3] = (byte)var4;
         }
      }

      this.method8526();
   }

   public void method2053(short var1, short var2) {
      Class169 var3 = this.aClass174_Sub3_9284.aClass169_2035;

      for(int var4 = 0; var4 < this.anInt9300; ++var4) {
         if(this.aShortArray9342[var4] == var1) {
            this.aShortArray9342[var4] = var2;
         }
      }

      byte var11 = 0;
      byte var5 = 0;
      if(var1 != -1) {
         Class171 var6 = var3.method2122(var1 & '\uffff', (byte)-36);
         var11 = var6.aByte1969;
         var5 = var6.aByte2012;
      }

      byte var12 = 0;
      byte var7 = 0;
      if(var2 != -1) {
         Class171 var8 = var3.method2122(var2 & '\uffff', (byte)67);
         var12 = var8.aByte1969;
         var7 = var8.aByte2012;
         if(var8.aByte1986 != 0 || var8.aByte1963 != 0) {
            this.aBool9324 = true;
         }
      }

      if(var11 != var12 | var5 != var7) {
         if(this.aClass360Array9344 != null) {
            for(int var13 = 0; var13 < this.anInt9313; ++var13) {
               Class360 var9 = this.aClass360Array9344[var13];
               Class352 var10 = this.aClass352Array9326[var13];
               var10.anInt3664 = var10.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var9.anInt3826] & '\uffff'] & 16777215;
            }
         }

         this.method8526();
      }

   }

   public Class168 method1947(byte var1, int var2, boolean var3) {
      boolean var4 = false;
      Class168_Sub2 var5;
      Class168_Sub2 var6;
      if(var1 > 0 && var1 <= 8) {
         var5 = this.aClass174_Sub3_9284.aClass168_Sub2Array9846[var1 - 1];
         var6 = this.aClass174_Sub3_9284.aClass168_Sub2Array9833[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class168_Sub2(this.aClass174_Sub3_9284, 0, 0, true, false);
      }

      return this.method8524(var6, var5, var2, var4, var3);
   }

   public void method2091(int var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = 0; var5 < this.anInt9300; ++var5) {
         int var6 = this.aShortArray9308[var5] & '\uffff';
         int var7 = var6 >> 10 & 63;
         int var8 = var6 >> 7 & 7;
         int var9 = var6 & 127;
         if(var1 != -1) {
            var7 += (var1 - var7) * var4 >> 7;
         }

         if(var2 != -1) {
            var8 += (var2 - var8) * var4 >> 7;
         }

         if(var3 != -1) {
            var9 += (var3 - var9) * var4 >> 7;
         }

         this.aShortArray9308[var5] = (short)(var7 << 10 | var8 << 7 | var9);
      }

      if(this.aClass360Array9344 != null) {
         for(var5 = 0; var5 < this.anInt9313; ++var5) {
            Class360 var10 = this.aClass360Array9344[var5];
            Class352 var11 = this.aClass352Array9326[var5];
            var11.anInt3664 = var11.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var10.anInt3826] & '\uffff'] & 16777215;
         }
      }

      this.method8526();
   }

   public Class182[] method2090() {
      return this.aClass182Array9341;
   }

   public void method2041() {
      int var1;
      for(var1 = 0; var1 < this.anInt9287; ++var1) {
         this.anIntArray9307[var1] = -this.anIntArray9307[var1];
      }

      for(var1 = 0; var1 < this.anInt9296; ++var1) {
         this.aShortArray9301[var1] = (short)(-this.aShortArray9301[var1]);
      }

      for(var1 = 0; var1 < this.anInt9300; ++var1) {
         short var2 = this.aShortArray9310[var1];
         this.aShortArray9310[var1] = this.aShortArray9345[var1];
         this.aShortArray9345[var1] = var2;
      }

      this.method8548();
      this.method8537();
      this.method8527();
      this.aBool9327 = false;
   }

   public boolean method2095() {
      if(this.aShortArray9342 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9342.length; ++var1) {
            if(this.aShortArray9342[var1] != -1 && !this.aClass174_Sub3_9284.aClass346_9775.method4469(this.aClass174_Sub3_9284.aClass169_2035.method2122(this.aShortArray9342[var1], (byte)53), -1)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method2096() {
      if(this.aShortArray9342 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9342.length; ++var1) {
            if(this.aShortArray9342[var1] != -1 && !this.aClass174_Sub3_9284.aClass346_9775.method4469(this.aClass174_Sub3_9284.aClass169_2035.method2122(this.aShortArray9342[var1], (byte)-33), -1)) {
               return false;
            }
         }

         return true;
      }
   }

   Class168_Sub2(Class174_Sub3 var1, int var2, int var3, boolean var4, boolean var5) {
      this.anInt9357 = 0;
      this.anInt9287 = 0;
      this.anInt9296 = 0;
      this.anInt9300 = 0;
      this.anInt9312 = 0;
      this.aBool9321 = false;
      this.aBool9322 = true;
      this.aBool9331 = false;
      this.aBool9324 = false;
      this.aBool9327 = false;
      this.aBool9289 = false;
      this.aFloatArray9348 = new float[2];
      this.anIntArray9290 = new int[1];
      this.anIntArray9334 = new int[1];
      this.anIntArray9351 = new int[8];
      this.anIntArray9352 = new int[8];
      this.anIntArray9340 = new int[8];
      this.aClass174_Sub3_9284 = var1;
      this.anInt9353 = var2;
      this.anInt9285 = var3;
      this.aBool9321 = var5;
      if(var4 || Class336.method4280(this.anInt9353, this.anInt9285)) {
         this.aClass371_9298 = new Class371(Class336.method4285(this.anInt9353, this.anInt9285));
      }

      if(var4 || Class336.method4283(this.anInt9353, this.anInt9285)) {
         this.aClass371_9323 = new Class371(Class336.method4288(this.anInt9353, this.anInt9285));
      }

      if(var4 || Class336.method4282(this.anInt9353, this.anInt9285)) {
         this.aClass371_9318 = new Class371(Class336.method4287(this.anInt9353, this.anInt9285));
      }

      if(var4 || Class336.method4281(this.anInt9353, this.anInt9285)) {
         this.aClass371_9319 = new Class371(Class336.method4286(this.anInt9353, this.anInt9285));
      }

      if(var4 || Class336.method4284(this.anInt9353, this.anInt9285)) {
         this.aClass343_9316 = new Class343(Class336.method4290(this.anInt9353, this.anInt9285));
      }

      if(var4 && var5) {
         this.aClass371_9298.anInterface35_3886 = this.aClass371_9298.anInterface35_3885 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
         this.aClass371_9323.anInterface35_3886 = this.aClass371_9323.anInterface35_3885 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
         this.aClass371_9318.anInterface35_3886 = this.aClass371_9318.anInterface35_3885 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
         this.aClass371_9319.anInterface35_3886 = this.aClass371_9319.anInterface35_3885 = this.aClass174_Sub3_9284.method8818(this.aBool9321);
      }

   }

   public boolean method2098() {
      return this.aBool9331;
   }

   public boolean method2099() {
      return this.aBool9331;
   }

   public int method2016() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9330;
   }

   public boolean method1982() {
      return this.aBool9331;
   }

   public int method2063() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9325;
   }

   public boolean method2049() {
      return this.aBool9324;
   }

   public boolean method2104() {
      return this.aBool9324;
   }

   public int method2105() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9332;
   }

   public int method2106() {
      if(!this.aBool9327) {
         this.method8528();
      }

      return this.anInt9332;
   }

   boolean method8539() {
      if(this.aClass343_9316.aBool3561) {
         return true;
      } else {
         if(this.aClass343_9316.anInterface42_3564 == null) {
            this.aClass343_9316.anInterface42_3564 = this.aClass174_Sub3_9284.method8805(false);
         }

         Interface42 var1 = this.aClass343_9316.anInterface42_3564;
         var1.method340(this.anInt9312 * 6);
         Unsafe var2 = this.aClass174_Sub3_9284.anUnsafe9670;
         if(var2 != null) {
            int var8 = this.anInt9312 * 6;
            long var4 = var1.method236(0, var8);
            if(var4 == 0L) {
               return false;
            } else {
               for(int var6 = 0; var6 < this.anInt9312; ++var6) {
                  var2.putShort(var4, this.aShortArray9310[var6]);
                  var4 += 2L;
                  var2.putShort(var4, this.aShortArray9311[var6]);
                  var4 += 2L;
                  var2.putShort(var4, this.aShortArray9345[var6]);
                  var4 += 2L;
               }

               var1.method234();
               this.aClass343_9316.anInterface42_3563 = var1;
               this.aClass343_9316.aBool3561 = true;
               this.aBool9322 = true;
               return true;
            }
         } else {
            ByteBuffer var3 = this.aClass174_Sub3_9284.aByteBuffer9684;
            var3.clear();

            for(int var7 = 0; var7 < this.anInt9312; ++var7) {
               var3.putShort(this.aShortArray9310[var7]);
               var3.putShort(this.aShortArray9311[var7]);
               var3.putShort(this.aShortArray9345[var7]);
            }

            if(var1.method235(0, var3.position(), this.aClass174_Sub3_9284.aLong9685)) {
               this.aClass343_9316.anInterface42_3563 = var1;
               this.aClass343_9316.aBool3561 = true;
               this.aBool9322 = true;
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public byte[] method2078() {
      return this.aByteArray9309;
   }

   void method8540() {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3884 = false;
      }

   }

   public int method2112() {
      if(!this.aBool9289) {
         this.method1986();
      }

      return this.anInt9335;
   }

   public void method1951(int var1) {
      int var2 = Class443.anIntArray4895[var1];
      int var3 = Class443.anIntArray4896[var1];

      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         int var5 = this.anIntArray9307[var4] * var2 + this.anIntArray9291[var4] * var3 >> 14;
         this.anIntArray9307[var4] = this.anIntArray9307[var4] * var3 - this.anIntArray9291[var4] * var2 >> 14;
         this.anIntArray9291[var4] = var5;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method2019(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.anInt9287; ++var4) {
         if(var1 != 0) {
            this.anIntArray9291[var4] += var1;
         }

         if(var2 != 0) {
            this.anIntArray9286[var4] += var2;
         }

         if(var3 != 0) {
            this.anIntArray9307[var4] += var3;
         }
      }

      this.method8548();
      this.aBool9327 = false;
   }

   void method2023() {
      for(int var1 = 0; var1 < this.anInt9357; ++var1) {
         this.anIntArray9291[var1] = this.anIntArray9291[var1] + 7 >> 4;
         this.anIntArray9286[var1] = this.anIntArray9286[var1] + 7 >> 4;
         this.anIntArray9307[var1] = this.anIntArray9307[var1] + 7 >> 4;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   void method2115() {
      for(int var1 = 0; var1 < this.anInt9357; ++var1) {
         this.anIntArray9291[var1] = this.anIntArray9291[var1] + 7 >> 4;
         this.anIntArray9286[var1] = this.anIntArray9286[var1] + 7 >> 4;
         this.anIntArray9307[var1] = this.anIntArray9307[var1] + 7 >> 4;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   public void method2028(byte var1, byte[] var2) {
      int var3;
      if(var2 == null) {
         for(var3 = 0; var3 < this.anInt9300; ++var3) {
            this.aByteArray9309[var3] = var1;
         }
      } else {
         for(var3 = 0; var3 < this.anInt9300; ++var3) {
            int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
            this.aByteArray9309[var3] = (byte)var4;
         }
      }

      this.method8526();
   }

   void method2044(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         this.anInt9354 = 0;
         this.anInt9355 = 0;
         this.anInt9356 = 0;

         for(var10 = 0; var10 < this.anInt9287; ++var10) {
            this.anInt9354 += this.anIntArray9291[var10];
            this.anInt9355 += this.anIntArray9286[var10];
            this.anInt9356 += this.anIntArray9307[var10];
            ++var5;
         }

         if(var5 > 0) {
            this.anInt9354 = this.anInt9354 / var5 + var2;
            this.anInt9355 = this.anInt9355 / var5 + var3;
            this.anInt9356 = this.anInt9356 / var5 + var4;
         } else {
            this.anInt9354 = var2;
            this.anInt9355 = var3;
            this.anInt9356 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.anInt9287; ++var5) {
            this.anIntArray9291[var5] += var2;
            this.anIntArray9286[var5] += var3;
            this.anIntArray9307[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.anInt9287; ++var5) {
               this.anIntArray9291[var5] -= this.anInt9354;
               this.anIntArray9286[var5] -= this.anInt9355;
               this.anIntArray9307[var5] -= this.anInt9356;
               if(var4 != 0) {
                  var10 = Class443.anIntArray4895[var4];
                  var7 = Class443.anIntArray4896[var4];
                  var8 = this.anIntArray9286[var5] * var10 + this.anIntArray9291[var5] * var7 + 16383 >> 14;
                  this.anIntArray9286[var5] = this.anIntArray9286[var5] * var7 - this.anIntArray9291[var5] * var10 + 16383 >> 14;
                  this.anIntArray9291[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = Class443.anIntArray4895[var2];
                  var7 = Class443.anIntArray4896[var2];
                  var8 = this.anIntArray9286[var5] * var7 - this.anIntArray9307[var5] * var10 + 16383 >> 14;
                  this.anIntArray9307[var5] = this.anIntArray9286[var5] * var10 + this.anIntArray9307[var5] * var7 + 16383 >> 14;
                  this.anIntArray9286[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = Class443.anIntArray4895[var3];
                  var7 = Class443.anIntArray4896[var3];
                  var8 = this.anIntArray9307[var5] * var10 + this.anIntArray9291[var5] * var7 + 16383 >> 14;
                  this.anIntArray9307[var5] = this.anIntArray9307[var5] * var7 - this.anIntArray9291[var5] * var10 + 16383 >> 14;
                  this.anIntArray9291[var5] = var8;
               }

               this.anIntArray9291[var5] += this.anInt9354;
               this.anIntArray9286[var5] += this.anInt9355;
               this.anIntArray9307[var5] += this.anInt9356;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.anInt9287; ++var5) {
               this.anIntArray9291[var5] -= this.anInt9354;
               this.anIntArray9286[var5] -= this.anInt9355;
               this.anIntArray9307[var5] -= this.anInt9356;
               this.anIntArray9291[var5] = this.anIntArray9291[var5] * var2 / 128;
               this.anIntArray9286[var5] = this.anIntArray9286[var5] * var3 / 128;
               this.anIntArray9307[var5] = this.anIntArray9307[var5] * var4 / 128;
               this.anIntArray9291[var5] += this.anInt9354;
               this.anIntArray9286[var5] += this.anInt9355;
               this.anIntArray9307[var5] += this.anInt9356;
            }

         } else {
            Class360 var11;
            Class352 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt9300; ++var5) {
                  var10 = (this.aByteArray9309[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.aByteArray9309[var5] = (byte)var10;
               }

               if(this.aClass360Array9344 != null) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var11 = this.aClass360Array9344[var5];
                     var12 = this.aClass352Array9326[var5];
                     var12.anInt3664 = var12.anInt3664 & 16777215 | 255 - (this.aByteArray9309[var11.anInt3826] & 255) << 24;
                  }
               }

               this.method8526();
            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt9300; ++var5) {
                  var10 = this.aShortArray9308[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3 / 4;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.aShortArray9308[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               if(this.aClass360Array9344 != null) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var11 = this.aClass360Array9344[var5];
                     var12 = this.aClass352Array9326[var5];
                     var12.anInt3664 = var12.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var11.anInt3826] & '\uffff'] & 16777215;
                  }
               }

               this.method8526();
            } else {
               Class352 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var6 = this.aClass352Array9326[var5];
                     var6.anInt3663 += var2;
                     var6.anInt3666 += var3;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var6 = this.aClass352Array9326[var5];
                     var6.anInt3667 = var6.anInt3667 * var2 >> 7;
                     var6.anInt3665 = var6.anInt3665 * var3 >> 7;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt9313; ++var5) {
                     var6 = this.aClass352Array9326[var5];
                     var6.anInt3668 = var6.anInt3668 + var2 & 16383;
                  }

               }
            }
         }
      }
   }

   static short[] method8541(short[] var0, int var1) {
      short[] var2 = new short[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   void method2111() {
      for(int var1 = 0; var1 < this.anInt9357; ++var1) {
         this.anIntArray9291[var1] = this.anIntArray9291[var1] + 7 >> 4;
         this.anIntArray9286[var1] = this.anIntArray9286[var1] + 7 >> 4;
         this.anIntArray9307[var1] = this.anIntArray9307[var1] + 7 >> 4;
      }

      this.method8548();
      this.aBool9327 = false;
   }

   void method8542() {
      if(this.aBool9322) {
         this.aBool9322 = false;
         if(this.aClass182Array9341 == null && this.aClass141Array9314 == null && this.aClass360Array9344 == null && !Class336.method4327(this.anInt9353, this.anInt9285)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if(this.anIntArray9291 != null && !Class336.method4292(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var1 = true;
               }
            }

            if(this.anIntArray9286 != null && !Class336.method4311(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var2 = true;
               }
            }

            if(this.anIntArray9307 != null && !Class336.method4340(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var3 = true;
               }
            }

            if(var1) {
               this.anIntArray9291 = null;
            }

            if(var2) {
               this.anIntArray9286 = null;
            }

            if(var3) {
               this.anIntArray9307 = null;
            }
         }

         if(this.aShortArray9299 != null && this.anIntArray9291 == null && this.anIntArray9286 == null && this.anIntArray9307 == null) {
            this.aShortArray9299 = null;
            this.anIntArray9339 = null;
         }

         if(this.aByteArray9302 != null && !Class336.method4293(this.anInt9353, this.anInt9285)) {
            label204: {
               label203: {
                  if((this.anInt9285 & 55) != 0) {
                     if(this.aClass371_9319 == null || this.aClass371_9319.method4658()) {
                        break label203;
                     }
                  } else if(this.aClass371_9318 == null || this.aClass371_9318.method4658()) {
                     break label203;
                  }

                  this.aBool9322 = true;
                  break label204;
               }

               this.aShortArray9301 = null;
               this.aShortArray9292 = null;
               this.aShortArray9358 = null;
               this.aByteArray9302 = null;
            }
         }

         if(this.aShortArray9308 != null && !Class336.method4336(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9308 = null;
            }
         }

         if(this.aByteArray9309 != null && !Class336.method4295(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aByteArray9309 = null;
            }
         }

         if(this.aFloatArray9303 != null && !Class336.method4296(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9323 != null && !this.aClass371_9323.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aFloatArray9304 = null;
               this.aFloatArray9303 = null;
            }
         }

         if(this.aShortArray9342 != null && !Class336.method4301(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9342 = null;
            }
         }

         if(this.aShortArray9310 != null && !Class336.method4313(this.anInt9353, this.anInt9285)) {
            if(this.aClass343_9316 != null && !this.aClass343_9316.method4430() || this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9345 = null;
               this.aShortArray9311 = null;
               this.aShortArray9310 = null;
            }
         }

         if(this.aShortArray9297 != null) {
            if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9297 = null;
            }
         }

         if(this.aShortArray9282 != null) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9282 = null;
            }
         }

         if(this.anIntArrayArray9350 != null && !Class336.method4297(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9350 = (int[][])null;
            this.aShortArray9315 = null;
         }

         if(this.anIntArrayArray9294 != null && !Class336.method4298(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9294 = (int[][])null;
            this.aShortArray9295 = null;
         }

         if(this.anIntArrayArray9346 != null && !Class336.method4341(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9346 = (int[][])null;
         }

         if(this.anIntArray9336 != null && (this.anInt9353 & 2048) == 0 && (this.anInt9353 & 262144) == 0) {
            this.anIntArray9336 = null;
            this.anIntArray9338 = null;
            this.anIntArray9337 = null;
         }

      }
   }

   void method8543() {
      if(this.aBool9322) {
         this.aBool9322 = false;
         if(this.aClass182Array9341 == null && this.aClass141Array9314 == null && this.aClass360Array9344 == null && !Class336.method4327(this.anInt9353, this.anInt9285)) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if(this.anIntArray9291 != null && !Class336.method4292(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var1 = true;
               }
            }

            if(this.anIntArray9286 != null && !Class336.method4311(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var2 = true;
               }
            }

            if(this.anIntArray9307 != null && !Class336.method4340(this.anInt9353, this.anInt9285)) {
               if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
                  this.aBool9322 = true;
               } else {
                  if(!this.aBool9327) {
                     this.method8528();
                  }

                  var3 = true;
               }
            }

            if(var1) {
               this.anIntArray9291 = null;
            }

            if(var2) {
               this.anIntArray9286 = null;
            }

            if(var3) {
               this.anIntArray9307 = null;
            }
         }

         if(this.aShortArray9299 != null && this.anIntArray9291 == null && this.anIntArray9286 == null && this.anIntArray9307 == null) {
            this.aShortArray9299 = null;
            this.anIntArray9339 = null;
         }

         if(this.aByteArray9302 != null && !Class336.method4293(this.anInt9353, this.anInt9285)) {
            label204: {
               label203: {
                  if((this.anInt9285 & 55) != 0) {
                     if(this.aClass371_9319 == null || this.aClass371_9319.method4658()) {
                        break label203;
                     }
                  } else if(this.aClass371_9318 == null || this.aClass371_9318.method4658()) {
                     break label203;
                  }

                  this.aBool9322 = true;
                  break label204;
               }

               this.aShortArray9301 = null;
               this.aShortArray9292 = null;
               this.aShortArray9358 = null;
               this.aByteArray9302 = null;
            }
         }

         if(this.aShortArray9308 != null && !Class336.method4336(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9308 = null;
            }
         }

         if(this.aByteArray9309 != null && !Class336.method4295(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aByteArray9309 = null;
            }
         }

         if(this.aFloatArray9303 != null && !Class336.method4296(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9323 != null && !this.aClass371_9323.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aFloatArray9304 = null;
               this.aFloatArray9303 = null;
            }
         }

         if(this.aShortArray9342 != null && !Class336.method4301(this.anInt9353, this.anInt9285)) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9342 = null;
            }
         }

         if(this.aShortArray9310 != null && !Class336.method4313(this.anInt9353, this.anInt9285)) {
            if(this.aClass343_9316 != null && !this.aClass343_9316.method4430() || this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9345 = null;
               this.aShortArray9311 = null;
               this.aShortArray9310 = null;
            }
         }

         if(this.aShortArray9297 != null) {
            if(this.aClass371_9298 != null && !this.aClass371_9298.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9297 = null;
            }
         }

         if(this.aShortArray9282 != null) {
            if(this.aClass371_9318 != null && !this.aClass371_9318.method4658()) {
               this.aBool9322 = true;
            } else {
               this.aShortArray9282 = null;
            }
         }

         if(this.anIntArrayArray9350 != null && !Class336.method4297(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9350 = (int[][])null;
            this.aShortArray9315 = null;
         }

         if(this.anIntArrayArray9294 != null && !Class336.method4298(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9294 = (int[][])null;
            this.aShortArray9295 = null;
         }

         if(this.anIntArrayArray9346 != null && !Class336.method4341(this.anInt9353, this.anInt9285)) {
            this.anIntArrayArray9346 = (int[][])null;
         }

         if(this.anIntArray9336 != null && (this.anInt9353 & 2048) == 0 && (this.anInt9353 & 262144) == 0) {
            this.anIntArray9336 = null;
            this.anIntArray9338 = null;
            this.anIntArray9337 = null;
         }

      }
   }

   void method8544() {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3884 = false;
      }

   }

   public void method2045(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9295 != null) {
         Class445 var4 = var1;
         if(var3) {
            var4 = this.aClass174_Sub3_9284.aClass445_9704;
            var4.method5223(var1);
         }

         float[] var5 = new float[3];

         for(int var6 = 0; var6 < this.anInt9287; ++var6) {
            if((var2 & this.aShortArray9295[var6]) != 0) {
               var4.method5233((float)this.anIntArray9291[var6], (float)this.anIntArray9286[var6], (float)this.anIntArray9307[var6], var5);
               this.anIntArray9291[var6] = (int)var5[0];
               this.anIntArray9286[var6] = (int)var5[1];
               this.anIntArray9307[var6] = (int)var5[2];
            }
         }

      }
   }

   void method8545() {
      if((this.anInt9285 & 55) != 0) {
         if(this.aClass371_9319 != null) {
            this.aClass371_9319.aBool3884 = false;
         }
      } else if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3884 = false;
      }

   }

   void method8546() {
      if((this.anInt9285 & 55) != 0) {
         if(this.aClass371_9319 != null) {
            this.aClass371_9319.aBool3884 = false;
         }
      } else if(this.aClass371_9318 != null) {
         this.aClass371_9318.aBool3884 = false;
      }

   }

   void method8547() {
      if(this.aClass343_9316 != null) {
         this.aClass343_9316.aBool3561 = false;
      }

   }

   public int method2079() {
      return this.aShort9343;
   }

   public int method2109() {
      if(!this.aBool9289) {
         this.method1986();
      }

      return this.anInt9335;
   }

   public int method2083() {
      return this.aShort9288;
   }

   void method2031() {
   }

   void method8548() {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.aBool3884 = false;
      }

   }

   public int method2108() {
      if(!this.aBool9289) {
         this.method1986();
      }

      return this.anInt9335;
   }

   public void method2121(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9300; ++var3) {
         if(this.aShortArray9308[var3] == var1) {
            this.aShortArray9308[var3] = var2;
         }
      }

      if(this.aClass360Array9344 != null) {
         for(var3 = 0; var3 < this.anInt9313; ++var3) {
            Class360 var4 = this.aClass360Array9344[var3];
            Class352 var5 = this.aClass352Array9326[var3];
            var5.anInt3664 = var5.anInt3664 & -16777216 | Class661.anIntArray8516[this.aShortArray9308[var4.anInt3826] & '\uffff'] & 16777215;
         }
      }

      this.method8526();
   }

   void method8549() {
      if(this.aClass371_9298 != null) {
         this.aClass371_9298.method4655();
      }

      if(this.aClass371_9323 != null) {
         this.aClass371_9323.method4655();
      }

      if(this.aClass371_9318 != null) {
         this.aClass371_9318.method4655();
      }

      if(this.aClass371_9319 != null) {
         this.aClass371_9319.method4655();
      }

      if(this.aClass343_9316 != null) {
         this.aClass343_9316.method4431();
      }

   }

   public void method1942(Class445 var1) {
      Class433 var2 = this.aClass174_Sub3_9284.aClass433_9705;
      var2.method5110(var1);
      int var3;
      if(this.aClass182Array9341 != null) {
         for(var3 = 0; var3 < this.aClass182Array9341.length; ++var3) {
            Class182 var4 = this.aClass182Array9341[var3];
            Class182 var5 = var4;
            if(var4.aClass182_2080 != null) {
               var5 = var4.aClass182_2080;
            }

            var5.anInt2093 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var4.anInt2086 * -1235344453]) * -1678451107;
            var5.anInt2083 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var4.anInt2086 * -1235344453]) * -670678921;
            var5.anInt2085 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var4.anInt2086 * -1235344453]) * 438141997;
            var5.anInt2087 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var4.anInt2088 * -1119018737]) * 380933187;
            var5.anInt2090 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var4.anInt2088 * -1119018737]) * -1991830625;
            var5.anInt2091 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var4.anInt2088 * -1119018737]) * -1592918039;
            var5.anInt2092 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var4.anInt2084 * 724817697] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var4.anInt2084 * 724817697] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var4.anInt2084 * 724817697]) * -2133088645;
            var5.anInt2079 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var4.anInt2084 * 724817697] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var4.anInt2084 * 724817697] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var4.anInt2084 * 724817697]) * -615490343;
            var5.anInt2094 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var4.anInt2084 * 724817697] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var4.anInt2084 * 724817697] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var4.anInt2084 * 724817697]) * -1023720607;
         }
      }

      if(this.aClass141Array9314 != null) {
         for(var3 = 0; var3 < this.aClass141Array9314.length; ++var3) {
            Class141 var6 = this.aClass141Array9314[var3];
            Class141 var7 = var6;
            if(var6.aClass141_1666 != null) {
               var7 = var6.aClass141_1666;
            }

            if(var6.aClass433_1665 != null) {
               var6.aClass433_1665.method5083(var2);
            } else {
               var6.aClass433_1665 = new Class433(var2);
            }

            var7.anInt1668 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9291[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[4] * (float)this.anIntArray9286[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[8] * (float)this.anIntArray9307[var6.anInt1667 * -1043750635]) * -1843315017;
            var7.anInt1670 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9291[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[5] * (float)this.anIntArray9286[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[9] * (float)this.anIntArray9307[var6.anInt1667 * -1043750635]) * -1977850275;
            var7.anInt1669 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9291[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[6] * (float)this.anIntArray9286[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[10] * (float)this.anIntArray9307[var6.anInt1667 * -1043750635]) * 874542269;
         }
      }

   }
}
