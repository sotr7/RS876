package com.jagex;

import com.jagex.Class100;
import com.jagex.Class112;
import com.jagex.Class115;
import com.jagex.Class121;
import com.jagex.Class141;
import com.jagex.Class148;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class169;
import com.jagex.Class170;
import com.jagex.Class171;
import com.jagex.Class174_Sub1;
import com.jagex.Class180;
import com.jagex.Class182;
import com.jagex.Class185;
import com.jagex.Class300;
import com.jagex.Class385;
import com.jagex.Class386;
import com.jagex.Class433;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class553;
import com.jagex.Class569;
import com.jagex.Class593;
import com.jagex.Class616;
import com.jagex.Class661;
import com.jagex.Class87;
import com.jagex.Class98;
import com.jagex.Class99;
import com.jagex.Interface47;

public class Class168_Sub3 extends Class168 {
   static final int anInt9367 = -1;
   static final int anInt9368 = -2;
   static final int anInt9371 = 618520;
   static final int anInt9374 = 4;
   static final int anInt9379 = 7;
   static final int anInt9394 = 0;
   static final int anInt9395 = 1;
   static final int anInt9396 = 2;
   static final int anInt9406 = 618648;
   boolean aBool9361 = false;
   int anInt9376 = 0;
   int anInt9370 = 0;
   int anInt9384 = 0;
   int anInt9385 = 0;
   int anInt9392 = 0;
   boolean aBool9430 = false;
   boolean aBool9440 = false;
   boolean aBool9363 = false;
   boolean aBool9429 = false;
   boolean aBool9431 = false;
   boolean aBool9401 = false;
   Class174_Sub1 aClass174_Sub1_9403;
   int anInt9373;
   int anInt9436;
   int anInt9375;
   int[] anIntArray9405;
   int[] anIntArray9360;
   int[] anIntArray9380;
   short[] aShortArray9386;
   short[] aShortArray9399;
   short[] aShortArray9388;
   byte[] aByteArray9400;
   short[] aShortArray9408;
   byte[] aByteArray9409;
   short[] aShortArray9404;
   byte[] aByteArray9433;
   Class182[] aClass182Array9414;
   Class141[] aClass141Array9415;
   short[] aShortArray9381;
   int anInt9382;
   Class100[] aClass100Array9417;
   Class99[] aClass99Array9418;
   float[][] aFloatArrayArray9389;
   float[][] aFloatArrayArray9390;
   int[][] anIntArrayArray9369;
   int[][] anIntArrayArray9407;
   int[][] anIntArrayArray9419;
   short[] aShortArray9402;
   short[] aShortArray9365;
   Class98[] aClass98Array9420;
   Class112[] aClass112Array9398;
   Class121 aClass121_9364;
   Class115 aClass115_9362;
   int[] anIntArray9434;
   float[] aFloatArray9444;
   float[] aFloatArray9397;
   float[] aFloatArray9441;
   float[] aFloatArray9438;
   int[] anIntArray9378;
   int[] anIntArray9432;
   int[] anIntArray9427;
   int[] anIntArray9442;
   int[] anIntArray9443;
   int[] anIntArray9377;
   static int anInt9439 = 0;
   Class98[] aClass98Array9383;
   int anInt9410;
   int anInt9411;
   int anInt9412;
   short aShort9435;
   boolean aBool9391;
   short aShort9425;
   short aShort9426;
   short aShort9423;
   short aShort9424;
   short aShort9387;
   short aShort9428;
   short aShort9421;
   short aShort9422;
   static int anInt9372 = 4096;
   static int anInt9366 = 4096;
   int[] anIntArray9393;
   int[] anIntArray9437;
   int[] anIntArray9445;
   Class115 aClass115_9413;
   Class168_Sub3[] aClass168_Sub3Array9416;
   Class168_Sub3[] aClass168_Sub3Array9446;

   public boolean method2104() {
      return this.aBool9401;
   }

   Class168_Sub3(Class174_Sub1 var1, Class170 var2, int var3, int var4, int var5, int var6) {
      this.aClass174_Sub1_9403 = var1;
      this.anInt9373 = var3;
      this.anInt9436 = var4;
      this.anInt9375 = var5;
      Class169 var7 = this.aClass174_Sub1_9403.aClass169_2035;
      Interface47 var8 = this.aClass174_Sub1_9403.anInterface47_2036;
      this.anInt9376 = var2.anInt1918;
      this.anInt9370 = var2.anInt1919;
      this.anIntArray9405 = var2.anIntArray1920;
      this.anIntArray9360 = var2.anIntArray1921;
      this.anIntArray9380 = var2.anIntArray1939;
      this.anInt9384 = var2.anInt1929;
      this.aShortArray9386 = var2.aShortArray1930;
      this.aShortArray9399 = var2.aShortArray1931;
      this.aShortArray9388 = var2.aShortArray1932;
      this.aByteArray9400 = var2.aByteArray1937;
      this.aShortArray9408 = var2.aShortArray1940;
      this.aByteArray9409 = var2.aByteArray1938;
      this.aShortArray9404 = var2.aShortArray1917;
      this.aByteArray9433 = var2.aByteArray1936;
      this.aClass182Array9414 = var2.aClass182Array1960;
      this.aClass141Array9415 = var2.aClass141Array1961;
      this.aShortArray9381 = var2.aShortArray1925;
      this.anInt9385 = this.anInt9384;
      int[] var9 = new int[this.anInt9384];

      for(int var10 = 0; var10 < this.anInt9384; var9[var10] = var10++) {
         ;
      }

      long[] var54 = new long[this.anInt9384];
      boolean var11 = (this.anInt9373 & 256) != 0;

      int var12;
      int var15;
      int var60;
      short var65;
      for(var12 = 0; var12 < this.anInt9384; ++var12) {
         int var13 = var9[var12];
         Class171 var14 = null;
         var15 = 0;
         byte var16 = 0;
         byte var17 = 0;
         byte var18 = 0;
         boolean var19;
         int var20;
         if(var2.aClass185Array1962 != null) {
            var19 = false;

            for(var20 = 0; var20 < var2.aClass185Array1962.length; ++var20) {
               Class185 var21 = var2.aClass185Array1962[var20];
               if(var13 == var21.anInt2119 * 900019051) {
                  Class386 var22 = var8.method352(var21.anInt2121 * 1134790901, 1848812828);
                  if(var22.aBool4046) {
                     var19 = true;
                  }

                  if(var22.anInt4040 * 781750353 != -1) {
                     Class171 var23 = var7.method2122(var22.anInt4040 * 781750353, (byte)38);
                     if(var23.aClass593_1982 == Class593.aClass593_7815) {
                        this.aBool9431 = true;
                     }
                  }
               }
            }

            if(var19) {
               var54[var12] = Long.MAX_VALUE;
               --this.anInt9385;
               continue;
            }
         }

         if(var2.aClass182Array1960 != null) {
            var19 = false;

            for(var20 = 0; var20 < var2.aClass182Array1960.length; ++var20) {
               Class182 var67 = var2.aClass182Array1960[var20];
               if(var13 == var67.anInt2081 * -664328139) {
                  Class385 var71 = this.aClass174_Sub1_9403.anInterface49_2040.method353(var67.anInt2082 * 274808845, (byte)1);
                  if(var71.aBool4012) {
                     var19 = true;
                  }
               }
            }

            if(var19) {
               var54[var12] = Long.MAX_VALUE;
               --this.anInt9385;
               continue;
            }
         }

         var65 = -1;
         if(var2.aShortArray1941 != null) {
            var65 = var2.aShortArray1941[var13];
            if(var65 != -1) {
               var14 = var7.method2122(var65 & '\uffff', (byte)66);
               if((var6 & 64) != 0 && var14.aBool1981) {
                  var65 = -1;
               } else {
                  var17 = var14.aByte1966;
                  var18 = var14.aByte1970;
               }
            }
         }

         boolean var66 = this.aByteArray9409 != null && this.aByteArray9409[var13] != 0 || var14 != null && var14.aClass593_1982 == Class593.aClass593_7815;
         if((var11 || var66) && this.aByteArray9400 != null) {
            var15 += this.aByteArray9400[var13] << 17;
         }

         if(var66) {
            var15 += 65536;
         }

         var15 += (var17 & 255) << 8;
         var15 += var18 & 255;
         var60 = var16 + ((var65 & '\uffff') << 16);
         var60 += var12 & '\uffff';
         var54[var12] = ((long)var15 << 32) + (long)var60;
         this.aBool9431 |= var66;
      }

      Class569.method6839(var54, var9, -2142456116);
      if(var2.aClass185Array1962 != null) {
         this.anInt9382 = var2.aClass185Array1962.length;
         this.aClass100Array9417 = new Class100[this.anInt9382];
         this.aClass99Array9418 = new Class99[this.anInt9382];

         for(var12 = 0; var12 < var2.aClass185Array1962.length; ++var12) {
            Class185 var56 = var2.aClass185Array1962[var12];
            Class386 var58 = var8.method352(var56.anInt2121 * 1134790901, 1925843086);
            var15 = Class87.anIntArray855[var2.aShortArray1940[var56.anInt2119 * 900019051] & '\uffff'] & 16777215;
            var15 |= 255 - (var2.aByteArray1938 != null?var2.aByteArray1938[var56.anInt2119 * 900019051] & 255:0) << 24;
            this.aClass100Array9417[var12] = new Class100(var56.anInt2119 * 900019051, var2.aShortArray1930[var56.anInt2119 * 900019051], var2.aShortArray1931[var56.anInt2119 * 900019051], var2.aShortArray1932[var56.anInt2119 * 900019051], var58.anInt4041 * 511067987, var58.anInt4039 * -1102518277, var58.anInt4040 * 781750353, var58.anInt4043 * 580363603, var58.anInt4042 * 992174873, var58.aBool4046, var56.anInt2118 * 641681561);
            this.aClass99Array9418[var12] = new Class99(var15);
         }
      }

      this.aFloatArrayArray9389 = new float[this.anInt9384][];
      this.aFloatArrayArray9390 = new float[this.anInt9384][];
      Class180 var55 = this.method1945(var2, var9, this.anInt9384);
      Class115 var57 = this.aClass174_Sub1_9403.method8502(Thread.currentThread());
      float[] var59 = var57.aFloatArray1400;
      boolean var62 = false;

      int var63;
      short var64;
      for(var60 = 0; var60 < this.anInt9384; ++var60) {
         var63 = var9[var60];
         var64 = var2.aShortArray1941 != null?var2.aShortArray1941[var63]:-1;
         if(var64 != -1 && (var6 & 64) != 0 && var7.method2122(var64 & '\uffff', (byte)-38).aBool1981) {
            var64 = -1;
         }

         if(var64 != -1) {
            var65 = var2.aShortArray1943 != null?var2.aShortArray1943[var63]:-1;
            var62 = true;
            float[] var68 = this.aFloatArrayArray9389[var63] = new float[3];
            float[] var69 = this.aFloatArrayArray9390[var63] = new float[3];
            if(var65 == 32766) {
               int var73 = var2.aByteArray1933[var63] & 255;
               int var74 = var2.aByteArray1934[var63] & 255;
               int var24 = var2.aByteArray1952[var63] & 255;
               var73 += var2.anIntArray1923[var2.aShortArray1930[var63]];
               var74 += var2.anIntArray1923[var2.aShortArray1931[var63]];
               var24 += var2.anIntArray1923[var2.aShortArray1932[var63]];
               var68[0] = var2.aFloatArray1914[var73];
               var69[0] = var2.aFloatArray1928[var73];
               var68[1] = var2.aFloatArray1914[var74];
               var69[1] = var2.aFloatArray1928[var74];
               var68[2] = var2.aFloatArray1914[var24];
               var69[2] = var2.aFloatArray1928[var24];
            } else if(var65 == -1) {
               var68[0] = 0.0F;
               var69[0] = 1.0F;
               var68[1] = 1.0F;
               var69[1] = 1.0F;
               var68[2] = 0.0F;
               var69[2] = 0.0F;
            } else {
               int var70 = var65 & '\uffff';
               byte var75 = var2.aByteArray1948[var70];
               short var25;
               float var31;
               float var32;
               float var33;
               float var43;
               float var44;
               float var45;
               float var46;
               float var47;
               float var48;
               short var76;
               short var77;
               if(var75 == 0) {
                  var76 = this.aShortArray9386[var63];
                  var77 = this.aShortArray9399[var63];
                  var25 = this.aShortArray9388[var63];
                  short var26 = var2.aShortArray1944[var70];
                  short var27 = var2.aShortArray1927[var70];
                  short var28 = var2.aShortArray1953[var70];
                  float var29 = (float)this.anIntArray9405[var26];
                  float var30 = (float)this.anIntArray9360[var26];
                  var31 = (float)this.anIntArray9380[var26];
                  var32 = (float)this.anIntArray9405[var27] - var29;
                  var33 = (float)this.anIntArray9360[var27] - var30;
                  float var34 = (float)this.anIntArray9380[var27] - var31;
                  float var35 = (float)this.anIntArray9405[var28] - var29;
                  float var36 = (float)this.anIntArray9360[var28] - var30;
                  float var37 = (float)this.anIntArray9380[var28] - var31;
                  float var38 = (float)this.anIntArray9405[var76] - var29;
                  float var39 = (float)this.anIntArray9360[var76] - var30;
                  float var40 = (float)this.anIntArray9380[var76] - var31;
                  float var41 = (float)this.anIntArray9405[var77] - var29;
                  float var42 = (float)this.anIntArray9360[var77] - var30;
                  var43 = (float)this.anIntArray9380[var77] - var31;
                  var44 = (float)this.anIntArray9405[var25] - var29;
                  var45 = (float)this.anIntArray9360[var25] - var30;
                  var46 = (float)this.anIntArray9380[var25] - var31;
                  var47 = var33 * var37 - var34 * var36;
                  var48 = var34 * var35 - var32 * var37;
                  float var49 = var32 * var36 - var33 * var35;
                  float var50 = var36 * var49 - var37 * var48;
                  float var51 = var37 * var47 - var35 * var49;
                  float var52 = var35 * var48 - var36 * var47;
                  float var53 = 1.0F / (var50 * var32 + var51 * var33 + var52 * var34);
                  var68[0] = (var50 * var38 + var51 * var39 + var52 * var40) * var53;
                  var68[1] = (var50 * var41 + var51 * var42 + var52 * var43) * var53;
                  var68[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                  var50 = var33 * var49 - var34 * var48;
                  var51 = var34 * var47 - var32 * var49;
                  var52 = var32 * var48 - var33 * var47;
                  var53 = 1.0F / (var50 * var35 + var51 * var36 + var52 * var37);
                  var69[0] = (var50 * var38 + var51 * var39 + var52 * var40) * var53;
                  var69[1] = (var50 * var41 + var51 * var42 + var52 * var43) * var53;
                  var69[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
               } else {
                  var76 = this.aShortArray9386[var63];
                  var77 = this.aShortArray9399[var63];
                  var25 = this.aShortArray9388[var63];
                  int var78 = var55.anIntArray2075[var70];
                  int var79 = var55.anIntArray2072[var70];
                  int var80 = var55.anIntArray2073[var70];
                  float[] var81 = var55.aFloatArrayArray2074[var70];
                  byte var82 = var2.aByteArray1959[var70];
                  var31 = (float)var2.anIntArray1955[var70] / 256.0F;
                  if(var75 == 1) {
                     var32 = (float)var2.anIntArray1954[var70] / 1024.0F;
                     method1961(this.anIntArray9405[var76], this.anIntArray9360[var76], this.anIntArray9380[var76], var78, var79, var80, var81, var32, var82, var31, var59);
                     var68[0] = var59[0];
                     var69[0] = var59[1];
                     method1961(this.anIntArray9405[var77], this.anIntArray9360[var77], this.anIntArray9380[var77], var78, var79, var80, var81, var32, var82, var31, var59);
                     var68[1] = var59[0];
                     var69[1] = var59[1];
                     method1961(this.anIntArray9405[var25], this.anIntArray9360[var25], this.anIntArray9380[var25], var78, var79, var80, var81, var32, var82, var31, var59);
                     var68[2] = var59[0];
                     var69[2] = var59[1];
                     var33 = var32 / 2.0F;
                     if((var82 & 1) == 0) {
                        if(var68[1] - var68[0] > var33) {
                           var68[1] -= var32;
                        } else if(var68[0] - var68[1] > var33) {
                           var68[1] += var32;
                        }

                        if(var68[2] - var68[0] > var33) {
                           var68[2] -= var32;
                        } else if(var68[0] - var68[2] > var33) {
                           var68[2] += var32;
                        }
                     } else {
                        if(var69[1] - var69[0] > var33) {
                           var69[1] -= var32;
                        } else if(var69[0] - var69[1] > var33) {
                           var69[1] += var32;
                        }

                        if(var69[2] - var69[0] > var33) {
                           var69[2] -= var32;
                        } else if(var69[0] - var69[2] > var33) {
                           var69[2] += var32;
                        }
                     }
                  } else if(var75 == 2) {
                     var32 = (float)var2.anIntArray1956[var70] / 256.0F;
                     var33 = (float)var2.anIntArray1957[var70] / 256.0F;
                     int var83 = this.anIntArray9405[var77] - this.anIntArray9405[var76];
                     int var84 = this.anIntArray9360[var77] - this.anIntArray9360[var76];
                     int var85 = this.anIntArray9380[var77] - this.anIntArray9380[var76];
                     int var86 = this.anIntArray9405[var25] - this.anIntArray9405[var76];
                     int var87 = this.anIntArray9360[var25] - this.anIntArray9360[var76];
                     int var88 = this.anIntArray9380[var25] - this.anIntArray9380[var76];
                     int var89 = var84 * var88 - var87 * var85;
                     int var90 = var85 * var86 - var88 * var83;
                     int var91 = var83 * var87 - var86 * var84;
                     var43 = 64.0F / (float)var2.anIntArray1945[var70];
                     var44 = 64.0F / (float)var2.anIntArray1935[var70];
                     var45 = 64.0F / (float)var2.anIntArray1954[var70];
                     var46 = ((float)var89 * var81[0] + (float)var90 * var81[1] + (float)var91 * var81[2]) / var43;
                     var47 = ((float)var89 * var81[3] + (float)var90 * var81[4] + (float)var91 * var81[5]) / var44;
                     var48 = ((float)var89 * var81[6] + (float)var90 * var81[7] + (float)var91 * var81[8]) / var45;
                     int var92 = method1943(var46, var47, var48);
                     method1944(this.anIntArray9405[var76], this.anIntArray9360[var76], this.anIntArray9380[var76], var78, var79, var80, var92, var81, var82, var31, var32, var33, var59);
                     var68[0] = var59[0];
                     var69[0] = var59[1];
                     method1944(this.anIntArray9405[var77], this.anIntArray9360[var77], this.anIntArray9380[var77], var78, var79, var80, var92, var81, var82, var31, var32, var33, var59);
                     var68[1] = var59[0];
                     var69[1] = var59[1];
                     method1944(this.anIntArray9405[var25], this.anIntArray9360[var25], this.anIntArray9380[var25], var78, var79, var80, var92, var81, var82, var31, var32, var33, var59);
                     var68[2] = var59[0];
                     var69[2] = var59[1];
                  } else if(var75 == 3) {
                     method2062(this.anIntArray9405[var76], this.anIntArray9360[var76], this.anIntArray9380[var76], var78, var79, var80, var81, var82, var31, var59);
                     var68[0] = var59[0];
                     var69[0] = var59[1];
                     method2062(this.anIntArray9405[var77], this.anIntArray9360[var77], this.anIntArray9380[var77], var78, var79, var80, var81, var82, var31, var59);
                     var68[1] = var59[0];
                     var69[1] = var59[1];
                     method2062(this.anIntArray9405[var25], this.anIntArray9360[var25], this.anIntArray9380[var25], var78, var79, var80, var81, var82, var31, var59);
                     var68[2] = var59[0];
                     var69[2] = var59[1];
                     if((var82 & 1) == 0) {
                        if(var68[1] - var68[0] > 0.5F) {
                           --var68[1];
                        } else if(var68[0] - var68[1] > 0.5F) {
                           ++var68[1];
                        }

                        if(var68[2] - var68[0] > 0.5F) {
                           --var68[2];
                        } else if(var68[0] - var68[2] > 0.5F) {
                           ++var68[2];
                        }
                     } else {
                        if(var69[1] - var69[0] > 0.5F) {
                           --var69[1];
                        } else if(var69[0] - var69[1] > 0.5F) {
                           ++var69[1];
                        }

                        if(var69[2] - var69[0] > 0.5F) {
                           --var69[2];
                        } else if(var69[0] - var69[2] > 0.5F) {
                           ++var69[2];
                        }
                     }
                  }
               }
            }
         }
      }

      if(!var62) {
         this.aFloatArrayArray9390 = (float[][])null;
         this.aFloatArrayArray9389 = (float[][])null;
      }

      if(var2.anIntArray1924 != null && (this.anInt9373 & 32) != 0) {
         this.anIntArrayArray9369 = var2.method2136(true);
      }

      if(var2.anIntArray1949 != null && (this.anInt9373 & 384) != 0) {
         this.anIntArrayArray9407 = var2.method2137();
      }

      if(var2.aClass185Array1962 != null && (this.anInt9373 & 1024) != 0) {
         this.anIntArrayArray9419 = var2.method2145();
      }

      if(var2.aShortArray1941 != null) {
         this.aShortArray9402 = new short[this.anInt9384];
         boolean var61 = false;

         for(var63 = 0; var63 < this.anInt9384; ++var63) {
            var64 = var2.aShortArray1941[var63];
            if(var64 != -1) {
               Class171 var72 = this.aClass174_Sub1_9403.aClass169_2035.method2122(var64 & '\uffff', (byte)33);
               if((var6 & 64) != 0 && var72.aBool1981) {
                  this.aShortArray9402[var63] = -1;
               } else {
                  this.aShortArray9402[var63] = var64;
                  var61 = true;
                  if(var72.aClass593_1982 == Class593.aClass593_7815) {
                     this.aBool9431 = true;
                  }

                  if(var72.aByte1986 != 0 || var72.aByte1963 != 0) {
                     this.aBool9401 = true;
                  }
               }
            } else {
               this.aShortArray9402[var63] = -1;
            }
         }

         if(!var61) {
            this.aShortArray9402 = null;
         }
      } else {
         this.aShortArray9402 = null;
      }

      if(this.aBool9431 || this.aClass100Array9417 != null) {
         this.aShortArray9365 = new short[this.anInt9384];

         for(var60 = 0; var60 < this.anInt9384; ++var60) {
            this.aShortArray9365[var60] = (short)var9[var60];
         }
      }

   }

   public int method2084() {
      return this.anInt9375;
   }

   void method2031() {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            while(this.aBool1910) {
               try {
                  this.wait();
               } catch (InterruptedException var4) {
                  ;
               }
            }

            this.aBool1910 = true;
         }
      }

   }

   void method8556() {
      if(this.anInt9392 == 0 && this.aClass98Array9420 == null) {
         if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
            synchronized(this) {
               this.method8557();
            }
         } else {
            this.method8557();
         }

      }
   }

   void method8557() {
      this.aClass98Array9420 = new Class98[this.anInt9370];

      int var1;
      for(var1 = 0; var1 < this.anInt9370; ++var1) {
         this.aClass98Array9420[var1] = new Class98();
      }

      for(var1 = 0; var1 < this.anInt9384; ++var1) {
         short var2 = this.aShortArray9386[var1];
         short var3 = this.aShortArray9399[var1];
         short var4 = this.aShortArray9388[var1];
         int var5 = this.anIntArray9405[var3] - this.anIntArray9405[var2];
         int var6 = this.anIntArray9360[var3] - this.anIntArray9360[var2];
         int var7 = this.anIntArray9380[var3] - this.anIntArray9380[var2];
         int var8 = this.anIntArray9405[var4] - this.anIntArray9405[var2];
         int var9 = this.anIntArray9360[var4] - this.anIntArray9360[var2];
         int var10 = this.anIntArray9380[var4] - this.anIntArray9380[var2];
         int var11 = var6 * var10 - var9 * var7;
         int var12 = var7 * var8 - var10 * var5;

         int var13;
         for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
            var11 >>= 1;
            var12 >>= 1;
         }

         int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         if(var14 <= 0) {
            var14 = 1;
         }

         var11 = var11 * 256 / var14;
         var12 = var12 * 256 / var14;
         var13 = var13 * 256 / var14;
         byte var15;
         if(this.aByteArray9433 == null) {
            var15 = 0;
         } else {
            var15 = this.aByteArray9433[var1];
         }

         if(var15 == 0) {
            Class98 var16 = this.aClass98Array9420[var2];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
            var16 = this.aClass98Array9420[var3];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
            var16 = this.aClass98Array9420[var4];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
         } else if(var15 == 1) {
            if(this.aClass112Array9398 == null) {
               this.aClass112Array9398 = new Class112[this.anInt9384];
            }

            Class112 var17 = this.aClass112Array9398[var1] = new Class112();
            var17.anInt1357 = var11;
            var17.anInt1356 = var12;
            var17.anInt1358 = var13;
         }
      }

   }

   void method8558(boolean var1) {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            this.method8583(var1);
         }
      } else {
         this.method8583(var1);
      }

   }

   void method8559(Class115 var1) {
      this.aClass121_9364 = var1.aClass121_1387;
      if(var1 != this.aClass115_9362) {
         this.aClass115_9362 = var1;
         this.anIntArray9434 = this.aClass115_9362.anIntArray1391;
         this.aFloatArray9444 = this.aClass115_9362.aFloatArray1392;
         this.aFloatArray9397 = this.aClass115_9362.aFloatArray1393;
         this.aFloatArray9441 = this.aClass115_9362.aFloatArray1394;
         this.aFloatArray9438 = this.aClass115_9362.aFloatArray1401;
         this.anIntArray9378 = this.aClass115_9362.anIntArray1396;
         this.anIntArray9432 = this.aClass115_9362.anIntArray1397;
         this.anIntArray9427 = this.aClass115_9362.anIntArray1374;
         this.anIntArray9442 = this.aClass115_9362.anIntArray1411;
         this.anIntArray9443 = this.aClass115_9362.anIntArray1418;
         this.anIntArray9377 = this.aClass115_9362.anIntArray1410;
      }
   }

   int method8560(int var1, short var2, int var3) {
      int var4 = Class661.anIntArray8516[this.method8581(var1, var3)];
      Class171 var5 = this.aClass174_Sub1_9403.aClass169_2035.method2122(var2 & '\uffff', (byte)-107);
      int var6 = var5.aByte1969 & 255;
      int var7;
      int var9;
      if(var6 != 0) {
         var7 = 131586 * var3;
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

      return var4;
   }

   public Class141[] method2094() {
      return this.aClass141Array9415;
   }

   int method8561(int var1) {
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return var1;
   }

   void method8562() {
      if(this.anInt9392 == 0) {
         this.method8558(false);
      } else {
         if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
            synchronized(this) {
               this.method8585();
            }
         } else {
            this.method8585();
         }

      }
   }

   public void method2007(int var1) {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
               this.method8558(true);
            }

            this.anInt9373 = var1;
         }
      } else {
         if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
            this.method8558(true);
         }

         this.anInt9373 = var1;
      }

   }

   public void method1999(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub3 var6 = (Class168_Sub3)var1;
      if((this.anInt9373 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else if((var6.anInt9373 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else {
         this.method8559(this.aClass174_Sub1_9403.method8502(Thread.currentThread()));
         this.method8575();
         this.method8556();
         var6.method8575();
         var6.method8556();
         ++anInt9439;
         int var7 = 0;
         int[] var8 = var6.anIntArray9405;
         int var9 = var6.anInt9370;

         int var10;
         for(var10 = 0; var10 < this.anInt9370; ++var10) {
            Class98 var11 = this.aClass98Array9420[var10];
            if(var11.anInt1186 != 0) {
               int var12 = this.anIntArray9360[var10] - var3;
               if(var12 >= var6.aShort9423 && var12 <= var6.aShort9424) {
                  int var13 = this.anIntArray9405[var10] - var2;
                  if(var13 >= var6.aShort9425 && var13 <= var6.aShort9426) {
                     int var14 = this.anIntArray9380[var10] - var4;
                     if(var14 >= var6.aShort9387 && var14 <= var6.aShort9428) {
                        for(int var15 = 0; var15 < var9; ++var15) {
                           Class98 var16 = var6.aClass98Array9420[var15];
                           if(var13 == var8[var15] && var14 == var6.anIntArray9380[var15] && var12 == var6.anIntArray9360[var15] && var16.anInt1186 != 0) {
                              if(this.aClass98Array9383 == null) {
                                 this.aClass98Array9383 = new Class98[this.anInt9370];
                              }

                              if(var6.aClass98Array9383 == null) {
                                 var6.aClass98Array9383 = new Class98[var9];
                              }

                              Class98 var17 = this.aClass98Array9383[var10];
                              if(var17 == null) {
                                 var17 = this.aClass98Array9383[var10] = new Class98(var11);
                              }

                              Class98 var18 = var6.aClass98Array9383[var15];
                              if(var18 == null) {
                                 var18 = var6.aClass98Array9383[var15] = new Class98(var16);
                              }

                              var17.anInt1184 += var16.anInt1184;
                              var17.anInt1185 += var16.anInt1185;
                              var17.anInt1183 += var16.anInt1183;
                              var17.anInt1186 += var16.anInt1186;
                              var18.anInt1184 += var11.anInt1184;
                              var18.anInt1185 += var11.anInt1185;
                              var18.anInt1183 += var11.anInt1183;
                              var18.anInt1186 += var11.anInt1186;
                              ++var7;
                              this.anIntArray9442[var10] = anInt9439;
                              this.anIntArray9443[var15] = anInt9439;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var7 >= 3 && var5) {
            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               if(this.anIntArray9442[this.aShortArray9386[var10]] == anInt9439 && this.anIntArray9442[this.aShortArray9399[var10]] == anInt9439 && this.anIntArray9442[this.aShortArray9388[var10]] == anInt9439) {
                  if(this.aByteArray9433 == null) {
                     this.aByteArray9433 = new byte[this.anInt9384];
                  }

                  this.aByteArray9433[var10] = 2;
               }
            }

            for(var10 = 0; var10 < var6.anInt9384; ++var10) {
               if(this.anIntArray9443[var6.aShortArray9386[var10]] == anInt9439 && this.anIntArray9443[var6.aShortArray9399[var10]] == anInt9439 && this.anIntArray9443[var6.aShortArray9388[var10]] == anInt9439) {
                  if(var6.aByteArray9433 == null) {
                     var6.aByteArray9433 = new byte[var6.anInt9384];
                  }

                  var6.aByteArray9433[var10] = 2;
               }
            }

         }
      }
   }

   public Class168 method1947(byte var1, int var2, boolean var3) {
      this.method8587(Thread.currentThread());
      boolean var4 = false;
      Class168_Sub3 var5;
      Class168_Sub3 var6;
      if(var1 > 0 && var1 <= 8) {
         var5 = this.aClass168_Sub3Array9446[var1 - 1];
         var6 = this.aClass168_Sub3Array9416[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class168_Sub3(this.aClass174_Sub1_9403);
      }

      return this.method8582(var6, var5, var2, var4, var3);
   }

   boolean method2035() {
      if(this.anIntArrayArray9369 == null) {
         return false;
      } else {
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;
         return true;
      }
   }

   public int method2101() {
      return this.anInt9373;
   }

   public void method2110(int var1) {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
               this.method8558(true);
            }

            this.anInt9373 = var1;
         }
      } else {
         if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
            this.method8558(true);
         }

         this.anInt9373 = var1;
      }

   }

   public void method1950() {
   }

   void method8563() {
      this.aClass98Array9420 = null;
      this.aClass98Array9383 = null;
      this.aClass112Array9398 = null;
      this.aBool9363 = false;
   }

   public void method1952(int var1) {
      if((this.anInt9373 & 13) != 13) {
         throw new IllegalStateException();
      } else {
         if(this.aClass98Array9420 != null) {
            if(var1 == 4096) {
               this.method8566();
               return;
            }

            if(var1 == 8192) {
               this.method8567();
               return;
            }

            if(var1 == 12288) {
               this.method8568();
               return;
            }

            int var2 = Class443.anIntArray4895[var1];
            int var3 = Class443.anIntArray4896[var1];
            synchronized(this) {
               int var5;
               int var6;
               for(var5 = 0; var5 < this.anInt9370; ++var5) {
                  var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
                  this.anIntArray9405[var5] = var6;
                  if(this.aClass98Array9420[var5] != null) {
                     var6 = this.aClass98Array9420[var5].anInt1183 * var2 + this.aClass98Array9420[var5].anInt1184 * var3 >> 14;
                     this.aClass98Array9420[var5].anInt1183 = this.aClass98Array9420[var5].anInt1183 * var3 - this.aClass98Array9420[var5].anInt1184 * var2 >> 14;
                     this.aClass98Array9420[var5].anInt1184 = var6;
                  }
               }

               if(this.aClass112Array9398 != null) {
                  for(var5 = 0; var5 < this.anInt9384; ++var5) {
                     if(this.aClass112Array9398[var5] != null) {
                        var6 = this.aClass112Array9398[var5].anInt1358 * var2 + this.aClass112Array9398[var5].anInt1357 * var3 >> 14;
                        this.aClass112Array9398[var5].anInt1358 = this.aClass112Array9398[var5].anInt1358 * var3 - this.aClass112Array9398[var5].anInt1357 * var2 >> 14;
                        this.aClass112Array9398[var5].anInt1357 = var6;
                     }
                  }
               }

               for(var5 = this.anInt9370; var5 < this.anInt9376; ++var5) {
                  var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
                  this.anIntArray9405[var5] = var6;
               }

               this.anInt9392 = 0;
               this.aBool9363 = false;
            }
         } else {
            this.method1951(var1);
         }

      }
   }

   public void method1996(Class445 var1) {
      this.method8559(this.aClass174_Sub1_9403.method8502(Thread.currentThread()));
      Class433 var2 = this.aClass115_9362.aClass433_1389;
      var2.method5110(var1);
      int var3;
      if(this.aClass182Array9414 != null) {
         for(var3 = 0; var3 < this.aClass182Array9414.length; ++var3) {
            Class182 var4 = this.aClass182Array9414[var3];
            Class182 var5 = var4;
            if(var4.aClass182_2080 != null) {
               var5 = var4.aClass182_2080;
            }

            var5.anInt2093 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var4.anInt2086 * -1235344453]) * -1678451107;
            var5.anInt2083 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var4.anInt2086 * -1235344453]) * -670678921;
            var5.anInt2085 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var4.anInt2086 * -1235344453]) * 438141997;
            var5.anInt2087 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var4.anInt2088 * -1119018737]) * 380933187;
            var5.anInt2090 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var4.anInt2088 * -1119018737]) * -1991830625;
            var5.anInt2091 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var4.anInt2088 * -1119018737]) * -1592918039;
            var5.anInt2092 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var4.anInt2084 * 724817697] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var4.anInt2084 * 724817697] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var4.anInt2084 * 724817697]) * -2133088645;
            var5.anInt2079 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var4.anInt2084 * 724817697] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var4.anInt2084 * 724817697] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var4.anInt2084 * 724817697]) * -615490343;
            var5.anInt2094 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var4.anInt2084 * 724817697] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var4.anInt2084 * 724817697] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var4.anInt2084 * 724817697]) * -1023720607;
         }
      }

      if(this.aClass141Array9415 != null) {
         for(var3 = 0; var3 < this.aClass141Array9415.length; ++var3) {
            Class141 var6 = this.aClass141Array9415[var3];
            Class141 var7 = var6;
            if(var6.aClass141_1666 != null) {
               var7 = var6.aClass141_1666;
            }

            if(var6.aClass433_1665 != null) {
               var6.aClass433_1665.method5083(var2);
            } else {
               var6.aClass433_1665 = new Class433(var2);
            }

            var7.anInt1668 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var6.anInt1667 * -1043750635]) * -1843315017;
            var7.anInt1670 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var6.anInt1667 * -1043750635]) * -1977850275;
            var7.anInt1669 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var6.anInt1667 * -1043750635]) * 874542269;
         }
      }

   }

   void method8564() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.anInt9376; ++var2) {
            this.anIntArray9405[var2] = -this.anIntArray9405[var2];
            this.anIntArray9380[var2] = -this.anIntArray9380[var2];
         }

         this.method8563();
      }
   }

   void method8565() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.anInt9376; ++var2) {
            int var3 = this.anIntArray9380[var2];
            this.anIntArray9380[var2] = this.anIntArray9405[var2];
            this.anIntArray9405[var2] = -var3;
         }

         this.method8563();
      }
   }

   void method8566() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.anInt9370; ++var2) {
            var3 = this.anIntArray9405[var2];
            this.anIntArray9405[var2] = this.anIntArray9380[var2];
            this.anIntArray9380[var2] = -var3;
            if(this.aClass98Array9420[var2] != null) {
               var3 = this.aClass98Array9420[var2].anInt1184;
               this.aClass98Array9420[var2].anInt1184 = this.aClass98Array9420[var2].anInt1183;
               this.aClass98Array9420[var2].anInt1183 = -var3;
            }
         }

         if(this.aClass112Array9398 != null) {
            for(var2 = 0; var2 < this.anInt9384; ++var2) {
               if(this.aClass112Array9398[var2] != null) {
                  var3 = this.aClass112Array9398[var2].anInt1357;
                  this.aClass112Array9398[var2].anInt1357 = this.aClass112Array9398[var2].anInt1358;
                  this.aClass112Array9398[var2].anInt1358 = -var3;
               }
            }
         }

         for(var2 = this.anInt9370; var2 < this.anInt9376; ++var2) {
            var3 = this.anIntArray9405[var2];
            this.anIntArray9405[var2] = this.anIntArray9380[var2];
            this.anIntArray9380[var2] = -var3;
         }

         this.anInt9392 = 0;
         this.aBool9363 = false;
      }
   }

   void method8567() {
      synchronized(this) {
         int var2;
         for(var2 = 0; var2 < this.anInt9370; ++var2) {
            this.anIntArray9405[var2] = -this.anIntArray9405[var2];
            this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            if(this.aClass98Array9420[var2] != null) {
               this.aClass98Array9420[var2].anInt1184 = -this.aClass98Array9420[var2].anInt1184;
               this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
            }
         }

         if(this.aClass112Array9398 != null) {
            for(var2 = 0; var2 < this.anInt9384; ++var2) {
               if(this.aClass112Array9398[var2] != null) {
                  this.aClass112Array9398[var2].anInt1357 = -this.aClass112Array9398[var2].anInt1357;
                  this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
               }
            }
         }

         for(var2 = this.anInt9370; var2 < this.anInt9376; ++var2) {
            this.anIntArray9405[var2] = -this.anIntArray9405[var2];
            this.anIntArray9380[var2] = -this.anIntArray9380[var2];
         }

         this.anInt9392 = 0;
         this.aBool9363 = false;
      }
   }

   void method8568() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.anInt9370; ++var2) {
            var3 = this.anIntArray9380[var2];
            this.anIntArray9380[var2] = this.anIntArray9405[var2];
            this.anIntArray9405[var2] = -var3;
            if(this.aClass98Array9420[var2] != null) {
               var3 = this.aClass98Array9420[var2].anInt1183;
               this.aClass98Array9420[var2].anInt1183 = this.aClass98Array9420[var2].anInt1184;
               this.aClass98Array9420[var2].anInt1184 = -var3;
            }
         }

         if(this.aClass112Array9398 != null) {
            for(var2 = 0; var2 < this.anInt9384; ++var2) {
               if(this.aClass112Array9398[var2] != null) {
                  var3 = this.aClass112Array9398[var2].anInt1358;
                  this.aClass112Array9398[var2].anInt1358 = this.aClass112Array9398[var2].anInt1357;
                  this.aClass112Array9398[var2].anInt1357 = -var3;
               }
            }
         }

         for(var2 = this.anInt9370; var2 < this.anInt9376; ++var2) {
            var3 = this.anIntArray9380[var2];
            this.anIntArray9380[var2] = this.anIntArray9405[var2];
            this.anIntArray9405[var2] = -var3;
         }

         this.anInt9392 = 0;
         this.aBool9363 = false;
      }
   }

   public int method2082() {
      return this.anInt9375;
   }

   public void method1954(int var1) {
      if((this.anInt9373 & 3) != 3) {
         throw new IllegalStateException();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9360[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
               this.anIntArray9405[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   public int method2112() {
      if(!this.aBool9429) {
         this.method1986();
      }

      return this.aShort9435;
   }

   public void method1986() {
      if(!this.aBool9429) {
         if(!this.aBool9363) {
            this.method8575();
         }

         this.aShort9435 = this.aShort9423;
         this.aBool9429 = true;
      }

   }

   public void method1957(int var1, int var2, int var3) {
      if(var1 != 128 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 128 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 128 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] = this.anIntArray9405[var5] * var1 >> 7;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var2 >> 7;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 >> 7;
            }

            this.aBool9363 = false;
         }
      }
   }

   public void method2036(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7) {
      if(var1 == 3) {
         if((this.anInt9373 & 7) != 7) {
            throw new IllegalStateException();
         }
      } else if((this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      }

      if(!this.aBool9363) {
         this.method8575();
      }

      int var8 = var5 + this.aShort9425;
      int var9 = var5 + this.aShort9426;
      int var10 = var7 + this.aShort9387;
      int var11 = var7 + this.aShort9428;
      if(var1 == 4 || var8 >= 0 && var9 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1711 * 1966165105 && var10 >= 0 && var11 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1713 * -810756899) {
         int[][] var12 = var3.anIntArrayArray1714;
         int[][] var13 = (int[][])null;
         if(var4 != null) {
            var13 = var4.anIntArrayArray1714;
         }

         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.anInt1710 * -586661047;
            var9 = var9 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            var10 >>= var3.anInt1710 * -586661047;
            var11 = var11 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            if(var12[var8][var10] == var6 && var12[var9][var10] == var6 && var12[var8][var11] == var6 && var12[var9][var11] == var6) {
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

         synchronized(this) {
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            if(var1 == 1) {
               var15 = var3.anInt1712 * 1934131013 - 1;

               for(var16 = 0; var16 < this.anInt9370; ++var16) {
                  var17 = this.anIntArray9405[var16] + var5;
                  var18 = this.anIntArray9380[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.anInt1710 * -586661047;
                  var22 = var18 >> var3.anInt1710 * -586661047;
                  var23 = var12[var21][var22] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22] * var19 >> var3.anInt1710 * -586661047;
                  var24 = var12[var21][var22 + 1] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.anInt1710 * -586661047;
                  var25 = var23 * (var3.anInt1712 * 1934131013 - var20) + var24 * var20 >> var3.anInt1710 * -586661047;
                  this.anIntArray9360[var16] = this.anIntArray9360[var16] + var25 - var6;
               }

               for(var16 = this.anInt9370; var16 < this.anInt9376; ++var16) {
                  var17 = this.anIntArray9405[var16] + var5;
                  var18 = this.anIntArray9380[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.anInt1710 * -586661047;
                  var22 = var18 >> var3.anInt1710 * -586661047;
                  if(var21 >= 0 && var21 < var12.length - 1 && var22 >= 0 && var22 < var12[0].length - 1) {
                     var23 = var12[var21][var22] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22] * var19 >> var3.anInt1710 * -586661047;
                     var24 = var12[var21][var22 + 1] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.anInt1710 * -586661047;
                     var25 = var23 * (var3.anInt1712 * 1934131013 - var20) + var24 * var20 >> var3.anInt1710 * -586661047;
                     this.anIntArray9360[var16] = this.anIntArray9360[var16] + var25 - var6;
                  }
               }
            } else {
               int var26;
               if(var1 == 2) {
                  if(this.aShort9423 == 0) {
                     return;
                  }

                  var15 = var3.anInt1712 * 1934131013 - 1;

                  for(var16 = 0; var16 < this.anInt9370; ++var16) {
                     var17 = (this.anIntArray9360[var16] << 16) / this.aShort9423;
                     if(var17 < var2) {
                        var18 = this.anIntArray9405[var16] + var5;
                        var19 = this.anIntArray9380[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.anInt1710 * -586661047;
                        var23 = var19 >> var3.anInt1710 * -586661047;
                        var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                        var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                        var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                        this.anIntArray9360[var16] += (var26 - var6) * (var2 - var17) / var2;
                     } else {
                        this.anIntArray9360[var16] = this.anIntArray9360[var16];
                     }
                  }

                  for(var16 = this.anInt9370; var16 < this.anInt9376; ++var16) {
                     var17 = (this.anIntArray9360[var16] << 16) / this.aShort9423;
                     if(var17 < var2) {
                        var18 = this.anIntArray9405[var16] + var5;
                        var19 = this.anIntArray9380[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.anInt1710 * -586661047;
                        var23 = var19 >> var3.anInt1710 * -586661047;
                        if(var22 >= 0 && var22 < var3.anInt1711 * 1966165105 - 1 && var23 >= 0 && var23 < var3.anInt1713 * -810756899 - 1) {
                           var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                           var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                           var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                           this.anIntArray9360[var16] += (var26 - var6) * (var2 - var17) / var2;
                        }
                     } else {
                        this.anIntArray9360[var16] = this.anIntArray9360[var16];
                     }
                  }
               } else if(var1 == 3) {
                  var15 = (var2 & 255) * 16;
                  var16 = (var2 >> 8 & 255) * 16;
                  var17 = (var2 >> 16 & 255) << 6;
                  var18 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var15 >> 1) < 0 || var5 + (var15 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1711 * 1966165105 << var3.anInt1710 * -586661047 || var7 - (var16 >> 1) < 0 || var7 + (var16 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1713 * -810756899 << var3.anInt1710 * -586661047) {
                     return;
                  }

                  this.method1966(var3, var5, var6, var7, var15, var16, var17, var18);
               } else if(var1 == 4) {
                  var15 = var4.anInt1712 * 1934131013 - 1;
                  var16 = this.aShort9424 - this.aShort9423;

                  for(var17 = 0; var17 < this.anInt9370; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.anInt1710 * -586661047;
                     var23 = var19 >> var4.anInt1710 * -586661047;
                     var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                     var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                     var26 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                     this.anIntArray9360[var17] = this.anIntArray9360[var17] + (var26 - var6) + var16;
                  }

                  for(var17 = this.anInt9370; var17 < this.anInt9376; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.anInt1710 * -586661047;
                     var23 = var19 >> var4.anInt1710 * -586661047;
                     if(var22 >= 0 && var22 < var4.anInt1711 * 1966165105 - 1 && var23 >= 0 && var23 < var4.anInt1713 * -810756899 - 1) {
                        var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                        var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                        var26 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                        this.anIntArray9360[var17] = this.anIntArray9360[var17] + (var26 - var6) + var16;
                     }
                  }
               } else if(var1 == 5) {
                  var15 = var4.anInt1712 * 1934131013 - 1;
                  var16 = this.aShort9424 - this.aShort9423;

                  int var27;
                  int var28;
                  for(var17 = 0; var17 < this.anInt9370; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.anInt1710 * -586661047;
                     var23 = var19 >> var3.anInt1710 * -586661047;
                     var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                     var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                     var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                     var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                     var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                     var27 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                     var28 = var26 - var27 - var2;
                     this.anIntArray9360[var17] = ((this.anIntArray9360[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                  }

                  for(var17 = this.anInt9370; var17 < this.anInt9376; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.anInt1710 * -586661047;
                     var23 = var19 >> var3.anInt1710 * -586661047;
                     if(var22 >= 0 && var22 < var3.anInt1711 * 1966165105 - 1 && var22 < var4.anInt1711 * 1966165105 - 1 && var23 >= 0 && var23 < var3.anInt1713 * -810756899 - 1 && var23 < var4.anInt1713 * -810756899 - 1) {
                        var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                        var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                        var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                        var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                        var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                        var27 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                        var28 = var26 - var27 - var2;
                        this.anIntArray9360[var17] = ((this.anIntArray9360[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                     }
                  }
               }
            }

            this.aBool9363 = false;
         }
      }
   }

   void method1960() {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            while(this.aBool1910) {
               try {
                  this.wait();
               } catch (InterruptedException var4) {
                  ;
               }
            }

            this.aBool1910 = true;
         }
      }

   }

   void method1978() {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            this.aBool1910 = false;
            this.notifyAll();
         }
      }

   }

   boolean method2072() {
      if(this.anIntArrayArray9369 == null) {
         return false;
      } else {
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;
         return true;
      }
   }

   void method1972() {
      if(this.aBool9430) {
         for(int var1 = 0; var1 < this.anInt9376; ++var1) {
            this.anIntArray9405[var1] = this.anIntArray9405[var1] + 7 >> 4;
            this.anIntArray9360[var1] = this.anIntArray9360[var1] + 7 >> 4;
            this.anIntArray9380[var1] = this.anIntArray9380[var1] + 7 >> 4;
         }

         this.aBool9430 = false;
      }

      if(this.aBool9391) {
         this.method8562();
         this.aBool9391 = false;
      }

      this.aBool9363 = false;
   }

   void method2000(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var20;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBool9430) {
            for(var9 = 0; var9 < this.anInt9376; ++var9) {
               this.anIntArray9405[var9] <<= 4;
               this.anIntArray9360[var9] <<= 4;
               this.anIntArray9380[var9] <<= 4;
            }

            this.aBool9430 = true;
         }

         var9 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var21 = var2[var10];
            if(var21 < this.anIntArrayArray9369.length) {
               int[] var22 = this.anIntArrayArray9369[var21];

               for(var20 = 0; var20 < var22.length; ++var20) {
                  var14 = var22[var20];
                  this.anInt9410 += this.anIntArray9405[var14];
                  this.anInt9411 += this.anIntArray9360[var14];
                  this.anInt9412 += this.anIntArray9380[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9410 = this.anInt9410 / var9 + var3;
            this.anInt9411 = this.anInt9411 / var9 + var4;
            this.anInt9412 = this.anInt9412 / var9 + var5;
         } else {
            this.anInt9410 = var3;
            this.anInt9411 = var4;
            this.anInt9412 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBool9430) {
               for(var9 = 0; var9 < this.anInt9376; ++var9) {
                  this.anIntArray9405[var9] <<= 4;
                  this.anIntArray9360[var9] <<= 4;
                  this.anIntArray9380[var9] <<= 4;
               }

               this.aBool9430 = true;
            }

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9369.length) {
                  var11 = this.anIntArrayArray9369[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var20 = var11[var12];
                     this.anIntArray9405[var20] += var3;
                     this.anIntArray9360[var20] += var4;
                     this.anIntArray9380[var20] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var20 = var11[var12];
                        this.anIntArray9405[var20] -= this.anInt9410;
                        this.anIntArray9360[var20] -= this.anInt9411;
                        this.anIntArray9380[var20] -= this.anInt9412;
                        this.anIntArray9405[var20] = this.anIntArray9405[var20] * var3 / 128;
                        this.anIntArray9360[var20] = this.anIntArray9360[var20] * var4 / 128;
                        this.anIntArray9380[var20] = this.anIntArray9380[var20] * var5 / 128;
                        this.anIntArray9405[var20] += this.anInt9410;
                        this.anIntArray9360[var20] += this.anInt9411;
                        this.anIntArray9380[var20] += this.anInt9412;
                     }
                  }
               }

            } else {
               Class100 var18;
               Class99 var19;
               if(var1 == 5) {
                  if(this.anIntArrayArray9407 != null && this.aByteArray9409 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = (this.aByteArray9409[var20] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9409[var20] = (byte)var14;
                           }
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var18.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9407 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = this.aShortArray9408[var20] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              int var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9408[var20] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           this.aBool9391 = true;
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var18.anInt1201 * -1840934035] & '\uffff', 195671621) & '\uffff'] & 16777215) * -1888472453;
                        }
                     }
                  }

               } else {
                  Class99 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1190 += var3 * -397766141;
                                 var13.anInt1196 += var4 * 475388931;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.aFloat1193 = var13.aFloat1193 * (float)var3 / 128.0F;
                                 var13.aFloat1189 = var13.aFloat1189 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1188 = (var13.anInt1188 * -236039229 + var3 & 16383) * 974959851;
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

   void method1970(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var49;
      int var50;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBool9430) {
            for(var10 = 0; var10 < this.anInt9376; ++var10) {
               this.anIntArray9405[var10] <<= 4;
               this.anIntArray9360[var10] <<= 4;
               this.anIntArray9380[var10] <<= 4;
            }

            this.aBool9430 = true;
         }

         var10 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var49 = var2[var11];
            if(var49 < this.anIntArrayArray9369.length) {
               int[] var52 = this.anIntArrayArray9369[var49];

               for(var50 = 0; var50 < var52.length; ++var50) {
                  var15 = var52[var50];
                  if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var15]) != 0) {
                     this.anInt9410 += this.anIntArray9405[var15];
                     this.anInt9411 += this.anIntArray9360[var15];
                     this.anInt9412 += this.anIntArray9380[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt9410 = this.anInt9410 / var10 + var3;
            this.anInt9411 = this.anInt9411 / var10 + var4;
            this.anInt9412 = this.anInt9412 / var10 + var5;
            this.aBool9440 = true;
         } else {
            this.anInt9410 = var3;
            this.anInt9411 = var4;
            this.anInt9412 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var49 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var49;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBool9430) {
               for(var10 = 0; var10 < this.anInt9376; ++var10) {
                  this.anIntArray9405[var10] <<= 4;
                  this.anIntArray9360[var10] <<= 4;
                  this.anIntArray9380[var10] <<= 4;
               }

               this.aBool9430 = true;
            }

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9369.length) {
                  var12 = this.anIntArrayArray9369[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var50 = var12[var13];
                     if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                        this.anIntArray9405[var50] += var3;
                        this.anIntArray9360[var50] += var4;
                        this.anIntArray9380[var50] += var5;
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
                  if(!this.aBool9430) {
                     for(var10 = 0; var10 < this.anInt9376; ++var10) {
                        this.anIntArray9405[var10] <<= 4;
                        this.anIntArray9360[var10] <<= 4;
                        this.anIntArray9380[var10] <<= 4;
                     }

                     this.aBool9430 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9440) {
                     var16 = var8[0] * this.anInt9410 + var8[3] * this.anInt9411 + var8[6] * this.anInt9412 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9410 + var8[4] * this.anInt9411 + var8[7] * this.anInt9412 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9410 + var8[5] * this.anInt9411 + var8[8] * this.anInt9412 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     this.anInt9410 = var16;
                     this.anInt9411 = var17;
                     this.anInt9412 = var18;
                     this.aBool9440 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -this.anInt9410 + var51[1] * -this.anInt9411 + var51[2] * -this.anInt9412 + 8192 >> 14;
                  var26 = var51[3] * -this.anInt9410 + var51[4] * -this.anInt9411 + var51[5] * -this.anInt9412 + 8192 >> 14;
                  var27 = var51[6] * -this.anInt9410 + var51[7] * -this.anInt9411 + var51[8] * -this.anInt9412 + 8192 >> 14;
                  var28 = var53 + this.anInt9410;
                  int var54 = var26 + this.anInt9411;
                  var30 = var27 + this.anInt9412;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var50 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var50 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var50 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var49;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9369.length) {
                        int[] var41 = this.anIntArrayArray9369[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9405[var43] + var35[1] * this.anIntArray9360[var43] + var35[2] * this.anIntArray9380[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9405[var43] + var35[4] * this.anIntArray9360[var43] + var35[5] * this.anIntArray9380[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9405[var43] + var35[7] * this.anIntArray9360[var43] + var35[8] * this.anIntArray9380[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9405[var43] = var44;
                              this.anIntArray9360[var43] = var45;
                              this.anIntArray9380[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9369.length) {
                        var12 = this.anIntArrayArray9369[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                              this.anIntArray9405[var50] -= this.anInt9410;
                              this.anIntArray9360[var50] -= this.anInt9411;
                              this.anIntArray9380[var50] -= this.anInt9412;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9360[var50] * var15 + this.anIntArray9405[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9360[var50] = this.anIntArray9360[var50] * var16 - this.anIntArray9405[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9405[var50] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9360[var50] * var16 - this.anIntArray9380[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9380[var50] = this.anIntArray9360[var50] * var15 + this.anIntArray9380[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9360[var50] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9380[var50] * var15 + this.anIntArray9405[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9380[var50] = this.anIntArray9380[var50] * var16 - this.anIntArray9405[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9405[var50] = var17;
                              }

                              this.anIntArray9405[var50] += this.anInt9410;
                              this.anIntArray9360[var50] += this.anInt9411;
                              this.anIntArray9380[var50] += this.anInt9412;
                           }
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  if(!this.aBool9430) {
                     for(var10 = 0; var10 < this.anInt9376; ++var10) {
                        this.anIntArray9405[var10] <<= 4;
                        this.anIntArray9360[var10] <<= 4;
                        this.anIntArray9380[var10] <<= 4;
                     }

                     this.aBool9430 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9440) {
                     var16 = var8[0] * this.anInt9410 + var8[3] * this.anInt9411 + var8[6] * this.anInt9412 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9410 + var8[4] * this.anInt9411 + var8[7] * this.anInt9412 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9410 + var8[5] * this.anInt9411 + var8[8] * this.anInt9412 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     this.anInt9410 = var16;
                     this.anInt9411 = var17;
                     this.anInt9412 = var18;
                     this.aBool9440 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt9410 + 8192 >> 14;
                  var20 = var17 * -this.anInt9411 + 8192 >> 14;
                  var21 = var18 * -this.anInt9412 + 8192 >> 14;
                  var22 = var19 + this.anInt9410;
                  var23 = var20 + this.anInt9411;
                  var24 = var21 + this.anInt9412;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var50 + 8192 >> 14;
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
                  var32 += var49;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9369.length) {
                        var35 = this.anIntArrayArray9369[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9405[var37] + var29[1] * this.anIntArray9360[var37] + var29[2] * this.anIntArray9380[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9405[var37] + var29[4] * this.anIntArray9360[var37] + var29[5] * this.anIntArray9380[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9405[var37] + var29[7] * this.anIntArray9360[var37] + var29[8] * this.anIntArray9380[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9405[var37] = var38;
                              this.anIntArray9360[var37] = var39;
                              this.anIntArray9380[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9369.length) {
                        var12 = this.anIntArrayArray9369[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                              this.anIntArray9405[var50] -= this.anInt9410;
                              this.anIntArray9360[var50] -= this.anInt9411;
                              this.anIntArray9380[var50] -= this.anInt9412;
                              this.anIntArray9405[var50] = this.anIntArray9405[var50] * var3 / 128;
                              this.anIntArray9360[var50] = this.anIntArray9360[var50] * var4 / 128;
                              this.anIntArray9380[var50] = this.anIntArray9380[var50] * var5 / 128;
                              this.anIntArray9405[var50] += this.anInt9410;
                              this.anIntArray9360[var50] += this.anInt9411;
                              this.anIntArray9380[var50] += this.anInt9412;
                           }
                        }
                     }
                  }
               }

            } else {
               Class100 var47;
               Class99 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray9407 != null && this.aByteArray9409 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9407.length) {
                           var12 = this.anIntArrayArray9407[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9404 == null || (var7 & this.aShortArray9404[var50]) != 0) {
                                 var15 = (this.aByteArray9409[var50] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray9409[var50] = (byte)var15;
                              }
                           }
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var10 = 0; var10 < this.anInt9382; ++var10) {
                           var47 = this.aClass100Array9417[var10];
                           var48 = this.aClass99Array9418[var10];
                           var48.anInt1191 = (var48.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var47.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9407 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9407.length) {
                           var12 = this.anIntArrayArray9407[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9404 == null || (var7 & this.aShortArray9404[var50]) != 0) {
                                 var15 = this.aShortArray9408[var50] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4;
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

                                 this.aShortArray9408[var50] = (short)(var16 << 10 | var17 << 7 | var18);
                              }
                           }

                           this.aBool9391 = true;
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var10 = 0; var10 < this.anInt9382; ++var10) {
                           var47 = this.aClass100Array9417[var10];
                           var48 = this.aClass99Array9418[var10];
                           var48.anInt1191 = (var48.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var47.anInt1201 * -1840934035] & '\uffff', -1990995957) & '\uffff'] & 16777215) * -1888472453;
                        }
                     }
                  }

               } else {
                  Class99 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.anInt1190 += var3 * -397766141;
                                 var14.anInt1196 += var4 * 475388931;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.aFloat1193 = var14.aFloat1193 * (float)var3 / 128.0F;
                                 var14.aFloat1189 = var14.aFloat1189 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.anInt1188 = (var14.anInt1188 * -236039229 + var3 & 16383) * 974959851;
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

   public Class526_Sub21_Sub5 method2052(Class526_Sub21_Sub5 var1) {
      return null;
   }

   public void method1974(Class445 var1, Class164 var2, int var3) {
      this.method8576(var1, var2, var3);
   }

   public int method2109() {
      if(!this.aBool9429) {
         this.method1986();
      }

      return this.aShort9435;
   }

   final void method8569(boolean var1, boolean var2, boolean var3) {
      for(int var4 = 0; var4 < this.anInt9382; ++var4) {
         Class100 var5 = this.aClass100Array9417[var4];
         if(var5.aBool1204) {
            Class99 var6 = this.aClass99Array9418[var4];
            this.aClass174_Sub1_9403.method8504(var1, var2, var3, var6.anInt1187 * -1463208377, var6.anInt1194 * 831680247, var6.aFloat1197, var6.anInt1195 * -822000073, var6.anInt1192 * -1530430377, var5.aShort1205, var6.anInt1191 * 487709875, var5.aByte1203, var5.aByte1202);
         }
      }

   }

   final boolean method8570(int var1) {
      return this.aByteArray9409 == null?false:this.aByteArray9409[var1] != 0;
   }

   final boolean method8571(int var1) {
      return this.anIntArray9377 == null?false:this.anIntArray9377[var1] != -1;
   }

   final void method8572(boolean var1, boolean var2, boolean var3, int var4, boolean var5, boolean var6) {
      if(this.anIntArray9393[var4] != -2) {
         short var7 = this.aShortArray9386[var4];
         short var8 = this.aShortArray9399[var4];
         short var9 = this.aShortArray9388[var4];
         float var10 = this.aFloatArray9444[var7];
         float var11 = this.aFloatArray9444[var8];
         float var12 = this.aFloatArray9444[var9];
         if(!var5 || var10 != -5000.0F && var11 != -5000.0F && var12 != -5000.0F) {
            float var13 = this.aFloatArray9397[var7];
            float var14 = this.aFloatArray9397[var8];
            float var15 = this.aFloatArray9397[var9];
            if(this.anIntArray9377[var4] != -1 || (var10 - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) > 0.0F) {
               if(var10 >= 0.0F && var11 >= 0.0F && var12 >= 0.0F && var10 <= (float)(this.aClass115_9362.anInt1398 * 1610640813) && var11 <= (float)(this.aClass115_9362.anInt1398 * 1610640813) && var12 <= (float)(this.aClass115_9362.anInt1398 * 1610640813)) {
                  this.aClass121_9364.aBool1556 = false;
               } else {
                  this.aClass121_9364.aBool1556 = true;
               }

               int var16;
               if(var6) {
                  var16 = this.anIntArray9377[var4];
                  if(var16 == -1 || !this.aClass100Array9417[var16].aBool1204) {
                     this.method8586(var1, var2, var3, var4);
                  }
               } else {
                  var16 = this.anIntArray9377[var4];
                  if(var16 != -1) {
                     Class100 var17 = this.aClass100Array9417[var16];
                     Class99 var18 = this.aClass99Array9418[var16];
                     if(!var17.aBool1204) {
                        this.method8573(var1, var2, var3, var4);
                     }

                     this.aClass174_Sub1_9403.method8504(var1, var2, var3, var18.anInt1187 * -1463208377, var18.anInt1194 * 831680247, var18.aFloat1197, var18.anInt1195 * -822000073, var18.anInt1192 * -1530430377, var17.aShort1205, var18.anInt1191 * 487709875, var17.aByte1203, var17.aByte1202);
                  } else {
                     this.method8573(var1, var2, var3, var4);
                  }
               }
            }

         }
      }
   }

   final void method8573(boolean var1, boolean var2, boolean var3, int var4) {
      short var5 = this.aShortArray9386[var4];
      short var6 = this.aShortArray9399[var4];
      short var7 = this.aShortArray9388[var4];
      boolean var8 = false;
      if(this.aShortArray9402 != null && this.aShortArray9402[var4] != -1) {
         var8 = this.aClass174_Sub1_9403.aClass169_2035.method2122(this.aShortArray9402[var4] & '\uffff', (byte)12).aBool1987;
      }

      if(!var8) {
         if(this.aByteArray9409 == null) {
            this.aClass121_9364.anInt1543 = 0;
         } else {
            this.aClass121_9364.anInt1543 = this.aByteArray9409[var4] & 255;
         }

         if(this.anIntArray9393[var4] == -1) {
            this.aClass121_9364.method1459(var1, var2, var3, this.aFloatArray9397[var5], this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9444[var5], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9441[var5], this.aFloatArray9441[var6], this.aFloatArray9441[var7], Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff']);
         } else {
            this.aClass121_9364.method1456(var1, var2, var3, this.aFloatArray9397[var5], this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9444[var5], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9441[var5], this.aFloatArray9441[var6], this.aFloatArray9441[var7], (float)(this.anIntArray9445[var4] & '\uffff'), (float)(this.anIntArray9437[var4] & '\uffff'), (float)(this.anIntArray9393[var4] & '\uffff'));
         }
      } else {
         int var9 = -16777216;
         if(this.aByteArray9409 != null) {
            var9 = 255 - (this.aByteArray9409[var4] & 255) << 24;
         }

         if(this.anIntArray9393[var4] == -1) {
            int var10 = var9 | this.anIntArray9445[var4] & 16777215;
            this.aClass121_9364.method1461(var1, var2, var3, this.aFloatArray9397[var5], this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9444[var5], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9441[var5], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9438[var5], this.aFloatArray9438[var6], this.aFloatArray9438[var7], this.aFloatArrayArray9389[var4][0], this.aFloatArrayArray9389[var4][1], this.aFloatArrayArray9389[var4][2], this.aFloatArrayArray9390[var4][0], this.aFloatArrayArray9390[var4][1], this.aFloatArrayArray9390[var4][2], var10, var10, var10, this.aClass115_9362.anInt1379 * 1196864617, 0.0F, 0.0F, 0.0F, this.aShortArray9402[var4] & '\uffff');
         } else {
            this.aClass121_9364.method1461(var1, var2, var3, this.aFloatArray9397[var5], this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9444[var5], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9441[var5], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9438[var5], this.aFloatArray9438[var6], this.aFloatArray9438[var7], this.aFloatArrayArray9389[var4][0], this.aFloatArrayArray9389[var4][1], this.aFloatArrayArray9389[var4][2], this.aFloatArrayArray9390[var4][0], this.aFloatArrayArray9390[var4][1], this.aFloatArrayArray9390[var4][2], var9 | this.anIntArray9445[var4] & 16777215, var9 | this.anIntArray9437[var4] & 16777215, var9 | this.anIntArray9393[var4] & 16777215, this.aClass115_9362.anInt1379 * 1196864617, 0.0F, 0.0F, 0.0F, this.aShortArray9402[var4] & '\uffff');
         }
      }

   }

   void method2043(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var49;
      int var50;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBool9430) {
            for(var10 = 0; var10 < this.anInt9376; ++var10) {
               this.anIntArray9405[var10] <<= 4;
               this.anIntArray9360[var10] <<= 4;
               this.anIntArray9380[var10] <<= 4;
            }

            this.aBool9430 = true;
         }

         var10 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var49 = var2[var11];
            if(var49 < this.anIntArrayArray9369.length) {
               int[] var52 = this.anIntArrayArray9369[var49];

               for(var50 = 0; var50 < var52.length; ++var50) {
                  var15 = var52[var50];
                  if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var15]) != 0) {
                     this.anInt9410 += this.anIntArray9405[var15];
                     this.anInt9411 += this.anIntArray9360[var15];
                     this.anInt9412 += this.anIntArray9380[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt9410 = this.anInt9410 / var10 + var3;
            this.anInt9411 = this.anInt9411 / var10 + var4;
            this.anInt9412 = this.anInt9412 / var10 + var5;
            this.aBool9440 = true;
         } else {
            this.anInt9410 = var3;
            this.anInt9411 = var4;
            this.anInt9412 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var49 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var49;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBool9430) {
               for(var10 = 0; var10 < this.anInt9376; ++var10) {
                  this.anIntArray9405[var10] <<= 4;
                  this.anIntArray9360[var10] <<= 4;
                  this.anIntArray9380[var10] <<= 4;
               }

               this.aBool9430 = true;
            }

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9369.length) {
                  var12 = this.anIntArrayArray9369[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var50 = var12[var13];
                     if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                        this.anIntArray9405[var50] += var3;
                        this.anIntArray9360[var50] += var4;
                        this.anIntArray9380[var50] += var5;
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
                  if(!this.aBool9430) {
                     for(var10 = 0; var10 < this.anInt9376; ++var10) {
                        this.anIntArray9405[var10] <<= 4;
                        this.anIntArray9360[var10] <<= 4;
                        this.anIntArray9380[var10] <<= 4;
                     }

                     this.aBool9430 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9440) {
                     var16 = var8[0] * this.anInt9410 + var8[3] * this.anInt9411 + var8[6] * this.anInt9412 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9410 + var8[4] * this.anInt9411 + var8[7] * this.anInt9412 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9410 + var8[5] * this.anInt9411 + var8[8] * this.anInt9412 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     this.anInt9410 = var16;
                     this.anInt9411 = var17;
                     this.anInt9412 = var18;
                     this.aBool9440 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -this.anInt9410 + var51[1] * -this.anInt9411 + var51[2] * -this.anInt9412 + 8192 >> 14;
                  var26 = var51[3] * -this.anInt9410 + var51[4] * -this.anInt9411 + var51[5] * -this.anInt9412 + 8192 >> 14;
                  var27 = var51[6] * -this.anInt9410 + var51[7] * -this.anInt9411 + var51[8] * -this.anInt9412 + 8192 >> 14;
                  var28 = var53 + this.anInt9410;
                  int var54 = var26 + this.anInt9411;
                  var30 = var27 + this.anInt9412;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var50 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var50 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var50 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var49;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9369.length) {
                        int[] var41 = this.anIntArrayArray9369[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9405[var43] + var35[1] * this.anIntArray9360[var43] + var35[2] * this.anIntArray9380[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9405[var43] + var35[4] * this.anIntArray9360[var43] + var35[5] * this.anIntArray9380[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9405[var43] + var35[7] * this.anIntArray9360[var43] + var35[8] * this.anIntArray9380[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9405[var43] = var44;
                              this.anIntArray9360[var43] = var45;
                              this.anIntArray9380[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9369.length) {
                        var12 = this.anIntArrayArray9369[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                              this.anIntArray9405[var50] -= this.anInt9410;
                              this.anIntArray9360[var50] -= this.anInt9411;
                              this.anIntArray9380[var50] -= this.anInt9412;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9360[var50] * var15 + this.anIntArray9405[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9360[var50] = this.anIntArray9360[var50] * var16 - this.anIntArray9405[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9405[var50] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9360[var50] * var16 - this.anIntArray9380[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9380[var50] = this.anIntArray9360[var50] * var15 + this.anIntArray9380[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9360[var50] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9380[var50] * var15 + this.anIntArray9405[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9380[var50] = this.anIntArray9380[var50] * var16 - this.anIntArray9405[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9405[var50] = var17;
                              }

                              this.anIntArray9405[var50] += this.anInt9410;
                              this.anIntArray9360[var50] += this.anInt9411;
                              this.anIntArray9380[var50] += this.anInt9412;
                           }
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  if(!this.aBool9430) {
                     for(var10 = 0; var10 < this.anInt9376; ++var10) {
                        this.anIntArray9405[var10] <<= 4;
                        this.anIntArray9360[var10] <<= 4;
                        this.anIntArray9380[var10] <<= 4;
                     }

                     this.aBool9430 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9440) {
                     var16 = var8[0] * this.anInt9410 + var8[3] * this.anInt9411 + var8[6] * this.anInt9412 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9410 + var8[4] * this.anInt9411 + var8[7] * this.anInt9412 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9410 + var8[5] * this.anInt9411 + var8[8] * this.anInt9412 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     this.anInt9410 = var16;
                     this.anInt9411 = var17;
                     this.anInt9412 = var18;
                     this.aBool9440 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt9410 + 8192 >> 14;
                  var20 = var17 * -this.anInt9411 + 8192 >> 14;
                  var21 = var18 * -this.anInt9412 + 8192 >> 14;
                  var22 = var19 + this.anInt9410;
                  var23 = var20 + this.anInt9411;
                  var24 = var21 + this.anInt9412;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var50 + 8192 >> 14;
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
                  var32 += var49;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9369.length) {
                        var35 = this.anIntArrayArray9369[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9405[var37] + var29[1] * this.anIntArray9360[var37] + var29[2] * this.anIntArray9380[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9405[var37] + var29[4] * this.anIntArray9360[var37] + var29[5] * this.anIntArray9380[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9405[var37] + var29[7] * this.anIntArray9360[var37] + var29[8] * this.anIntArray9380[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9405[var37] = var38;
                              this.anIntArray9360[var37] = var39;
                              this.anIntArray9380[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9369.length) {
                        var12 = this.anIntArrayArray9369[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                              this.anIntArray9405[var50] -= this.anInt9410;
                              this.anIntArray9360[var50] -= this.anInt9411;
                              this.anIntArray9380[var50] -= this.anInt9412;
                              this.anIntArray9405[var50] = this.anIntArray9405[var50] * var3 / 128;
                              this.anIntArray9360[var50] = this.anIntArray9360[var50] * var4 / 128;
                              this.anIntArray9380[var50] = this.anIntArray9380[var50] * var5 / 128;
                              this.anIntArray9405[var50] += this.anInt9410;
                              this.anIntArray9360[var50] += this.anInt9411;
                              this.anIntArray9380[var50] += this.anInt9412;
                           }
                        }
                     }
                  }
               }

            } else {
               Class100 var47;
               Class99 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray9407 != null && this.aByteArray9409 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9407.length) {
                           var12 = this.anIntArrayArray9407[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9404 == null || (var7 & this.aShortArray9404[var50]) != 0) {
                                 var15 = (this.aByteArray9409[var50] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray9409[var50] = (byte)var15;
                              }
                           }
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var10 = 0; var10 < this.anInt9382; ++var10) {
                           var47 = this.aClass100Array9417[var10];
                           var48 = this.aClass99Array9418[var10];
                           var48.anInt1191 = (var48.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var47.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9407 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9407.length) {
                           var12 = this.anIntArrayArray9407[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9404 == null || (var7 & this.aShortArray9404[var50]) != 0) {
                                 var15 = this.aShortArray9408[var50] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4;
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

                                 this.aShortArray9408[var50] = (short)(var16 << 10 | var17 << 7 | var18);
                              }
                           }

                           this.aBool9391 = true;
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var10 = 0; var10 < this.anInt9382; ++var10) {
                           var47 = this.aClass100Array9417[var10];
                           var48 = this.aClass99Array9418[var10];
                           var48.anInt1191 = (var48.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var47.anInt1201 * -1840934035] & '\uffff', -73963364) & '\uffff'] & 16777215) * -1888472453;
                        }
                     }
                  }

               } else {
                  Class99 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.anInt1190 += var3 * -397766141;
                                 var14.anInt1196 += var4 * 475388931;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.aFloat1193 = var14.aFloat1193 * (float)var3 / 128.0F;
                                 var14.aFloat1189 = var14.aFloat1189 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.anInt1188 = (var14.anInt1188 * -236039229 + var3 & 16383) * 974959851;
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

   boolean method8574(int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return (float)var2 < var3 && (float)var2 < var4 && (float)var2 < var5?false:((float)var2 > var3 && (float)var2 > var4 && (float)var2 > var5?false:((float)var1 < var6 && (float)var1 < var7 && (float)var1 < var8?false:(float)var1 <= var6 || (float)var1 <= var7 || (float)var1 <= var8));
   }

   public void method1948(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9381 != null) {
         Class115 var4 = this.aClass174_Sub1_9403.method8502(Thread.currentThread());
         Class445 var5 = var4.aClass445_1388;
         var5.method5242(var1);
         if(var3) {
            var5.method5224();
         }

         Class433 var6 = var4.aClass433_1389;
         var6.method5110(var5);
         float[] var7 = new float[3];

         for(int var8 = 0; var8 < this.anInt9370; ++var8) {
            if((var2 & this.aShortArray9381[var8]) != 0) {
               var6.method5089((float)this.anIntArray9405[var8], (float)this.anIntArray9360[var8], (float)this.anIntArray9380[var8], var7);
               this.anIntArray9405[var8] = (int)var7[0];
               this.anIntArray9360[var8] = (int)var7[1];
               this.anIntArray9380[var8] = (int)var7[2];
            }
         }

      }
   }

   public Class526_Sub21_Sub5 method1976(Class526_Sub21_Sub5 var1) {
      return null;
   }

   void method8575() {
      if(!this.aBool9363) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;

         for(int var9 = 0; var9 < this.anInt9370; ++var9) {
            int var10 = this.anIntArray9405[var9];
            int var11 = this.anIntArray9360[var9];
            int var12 = this.anIntArray9380[var9];
            if(var10 < var3) {
               var3 = var10;
            }

            if(var10 > var6) {
               var6 = var10;
            }

            if(var11 < var4) {
               var4 = var11;
            }

            if(var11 > var7) {
               var7 = var11;
            }

            if(var12 < var5) {
               var5 = var12;
            }

            if(var12 > var8) {
               var8 = var12;
            }

            int var13 = var10 * var10 + var12 * var12;
            if(var13 > var1) {
               var1 = var13;
            }

            var13 += var11 * var11;
            if(var13 > var2) {
               var2 = var13;
            }
         }

         this.aShort9425 = (short)var3;
         this.aShort9426 = (short)var6;
         this.aShort9423 = (short)var4;
         this.aShort9424 = (short)var7;
         this.aShort9387 = (short)var5;
         this.aShort9428 = (short)var8;
         this.aShort9421 = (short)((int)(Math.sqrt((double)var1) + 0.99D));
         this.aShort9422 = (short)((int)(Math.sqrt((double)var2) + 0.99D));
         this.aBool9363 = true;
      }
   }

   public int method2079() {
      return this.anInt9436;
   }

   public int method2088() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9421;
   }

   public int method2061() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9425;
   }

   public int method1979() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9425;
   }

   public int method1980() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9426;
   }

   void method8576(Class445 var1, Class164 var2, int var3) {
      if(this.anInt9370 >= 1) {
         Class115 var4 = this.aClass174_Sub1_9403.method8502(Thread.currentThread());
         Class433 var5 = var4.aClass433_1389;
         var5.method5110(var1);
         Class433 var6 = this.aClass174_Sub1_9403.aClass433_9258;
         Class433 var7 = this.aClass174_Sub1_9403.aClass433_9260;
         if(!this.aBool9363) {
            this.method8575();
         }

         boolean var8 = var5.method5116();
         float[] var9 = var4.aFloatArray1413;
         var5.method5089(0.0F, (float)this.aShort9423, 0.0F, var9);
         float var10 = var9[0];
         float var11 = var9[1];
         float var12 = var9[2];
         var5.method5089(0.0F, (float)this.aShort9424, 0.0F, var9);
         float var13 = var9[0];
         float var14 = var9[1];
         float var15 = var9[2];

         float var18;
         float var19;
         for(int var16 = 0; var16 < 6; ++var16) {
            float[] var17 = this.aClass174_Sub1_9403.aFloatArrayArray9261[var16];
            var18 = var17[0] * var10 + var17[1] * var11 + var17[2] * var12 + var17[3] + (float)this.aShort9421;
            var19 = var17[0] * var13 + var17[1] * var14 + var17[2] * var15 + var17[3] + (float)this.aShort9421;
            if(var18 < 0.0F && var19 < 0.0F) {
               return;
            }
         }

         float var51;
         float var52;
         if(var8) {
            var51 = var6.aFloatArray4841[14];
            var52 = var6.aFloatArray4841[6];
         } else {
            var51 = var5.aFloatArray4841[12] * var6.aFloatArray4841[2] + var5.aFloatArray4841[13] * var6.aFloatArray4841[6] + var5.aFloatArray4841[14] * var6.aFloatArray4841[10] + var6.aFloatArray4841[14];
            var52 = var5.aFloatArray4841[4] * var6.aFloatArray4841[2] + var5.aFloatArray4841[5] * var6.aFloatArray4841[6] + var5.aFloatArray4841[6] * var6.aFloatArray4841[10];
         }

         var18 = var51 + (float)this.aShort9423 * var52;
         var19 = var51 + (float)this.aShort9424 * var52;
         float var20 = var18 > var19?var18 + (float)this.aShort9421:var19 + (float)this.aShort9421;
         float var21 = var7.aFloatArray4841[10] * var20 + var7.aFloatArray4841[14];
         if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
            synchronized(this) {
               while(this.aBool9361) {
                  try {
                     this.wait();
                  } catch (InterruptedException var48) {
                     ;
                  }
               }

               this.aBool9361 = true;
            }
         }

         this.method8559(var4);
         Class433 var22 = this.aClass115_9362.aClass433_1390;
         var22.method5083(var5);
         var22.method5085(this.aClass174_Sub1_9403.aClass433_9240);
         if((var3 & 2) != 0) {
            this.aClass121_9364.method1455(true);
         } else {
            this.aClass121_9364.method1455(false);
         }

         boolean var23 = false;
         this.aClass115_9362.aFloat1402 = this.aClass121_9364.aFloat1537;
         this.aClass115_9362.aFloat1404 = this.aClass121_9364.aFloat1539;
         this.aClass115_9362.aFloat1406 = this.aClass121_9364.aFloat1541;
         this.aClass115_9362.aFloat1408 = 1.0F / this.aClass121_9364.aFloat1541;
         this.aClass115_9362.aFloat1403 = this.aClass121_9364.aFloat1534;
         this.aClass115_9362.aFloat1405 = this.aClass121_9364.aFloat1553;
         this.aClass115_9362.aFloat1407 = this.aClass121_9364.aFloat1547;
         this.aClass115_9362.anInt1398 = this.aClass121_9364.anInt1542 * 1718189605;

         float var24;
         int var25;
         int var26;
         int var27;
         int var28;
         float var29;
         float var30;
         float var31;
         for(var25 = 0; var25 < this.anInt9376; ++var25) {
            var26 = this.anIntArray9405[var25];
            var27 = this.anIntArray9360[var25];
            var28 = this.anIntArray9380[var25];
            var24 = var22.aFloatArray4841[0] * (float)var26 + var22.aFloatArray4841[4] * (float)var27 + var22.aFloatArray4841[8] * (float)var28 + var22.aFloatArray4841[12];
            var29 = var22.aFloatArray4841[1] * (float)var26 + var22.aFloatArray4841[5] * (float)var27 + var22.aFloatArray4841[9] * (float)var28 + var22.aFloatArray4841[13];
            var30 = var22.aFloatArray4841[2] * (float)var26 + var22.aFloatArray4841[6] * (float)var27 + var22.aFloatArray4841[10] * (float)var28 + var22.aFloatArray4841[14];
            var31 = var22.aFloatArray4841[3] * (float)var26 + var22.aFloatArray4841[7] * (float)var27 + var22.aFloatArray4841[11] * (float)var28 + var22.aFloatArray4841[15];
            this.aFloatArray9441[var25] = this.aClass115_9362.aFloat1407 + this.aClass115_9362.aFloat1406 * var30 / var31;
            this.aFloatArray9438[var25] = var31;
            if(var30 >= -var31) {
               this.aFloatArray9444[var25] = (float)((int)(this.aClass115_9362.aFloat1403 + this.aClass115_9362.aFloat1402 * var24 / var31));
               this.aFloatArray9397[var25] = (float)((int)(this.aClass115_9362.aFloat1405 + this.aClass115_9362.aFloat1404 * var29 / var31));
            } else {
               this.aFloatArray9444[var25] = -5000.0F;
               var23 = true;
            }

            if(this.aClass115_9362.aBool1381) {
               this.anIntArray9434[var25] = (int)(var5.aFloatArray4841[13] + var5.aFloatArray4841[1] * (float)var26 + var5.aFloatArray4841[5] * (float)var27 + var5.aFloatArray4841[9] * (float)var28);
            }
         }

         float var37;
         float var38;
         float var39;
         float var40;
         float var41;
         float var42;
         if(this.aClass100Array9417 != null) {
            for(var25 = 0; var25 < this.anInt9382; ++var25) {
               Class100 var32 = this.aClass100Array9417[var25];
               Class99 var33 = this.aClass99Array9418[var25];
               short var34 = this.aShortArray9386[var32.anInt1201 * -1840934035];
               short var35 = this.aShortArray9399[var32.anInt1201 * -1840934035];
               short var36 = this.aShortArray9388[var32.anInt1201 * -1840934035];
               var26 = (this.anIntArray9405[var34] + this.anIntArray9405[var35] + this.anIntArray9405[var36]) / 3;
               var27 = (this.anIntArray9360[var34] + this.anIntArray9360[var35] + this.anIntArray9360[var36]) / 3;
               var28 = (this.anIntArray9380[var34] + this.anIntArray9380[var35] + this.anIntArray9380[var36]) / 3;
               var24 = var22.aFloatArray4841[0] * (float)var26 + var22.aFloatArray4841[4] * (float)var27 + var22.aFloatArray4841[8] * (float)var28 + var22.aFloatArray4841[12];
               var29 = var22.aFloatArray4841[1] * (float)var26 + var22.aFloatArray4841[5] * (float)var27 + var22.aFloatArray4841[9] * (float)var28 + var22.aFloatArray4841[13];
               var30 = var22.aFloatArray4841[2] * (float)var26 + var22.aFloatArray4841[6] * (float)var27 + var22.aFloatArray4841[10] * (float)var28 + var22.aFloatArray4841[14];
               var31 = var22.aFloatArray4841[3] * (float)var26 + var22.aFloatArray4841[7] * (float)var27 + var22.aFloatArray4841[11] * (float)var28 + var22.aFloatArray4841[15];
               var30 += var7.aFloatArray4841[2] * (float)(var33.anInt1190 * -1524619093) + var7.aFloatArray4841[6] * (float)(var33.anInt1196 * 1471458987);
               var31 += var7.aFloatArray4841[3] * (float)(var33.anInt1190 * -1524619093) + var7.aFloatArray4841[7] * (float)(var33.anInt1196 * 1471458987);
               if(var30 > -var31) {
                  var24 += var7.aFloatArray4841[0] * (float)(var33.anInt1190 * -1524619093) + var7.aFloatArray4841[4] * (float)(var33.anInt1196 * 1471458987);
                  var29 += var7.aFloatArray4841[1] * (float)(var33.anInt1190 * -1524619093) + var7.aFloatArray4841[5] * (float)(var33.anInt1196 * 1471458987);
                  var37 = this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var24 / var31;
                  var38 = this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var29 / var31;
                  var39 = var33.aFloat1193 * (float)var32.aShort1200;
                  var40 = var33.aFloat1189 * (float)var32.aShort1198;
                  var41 = var24 + var7.aFloatArray4841[0] * var39 + var7.aFloatArray4841[4] * var40;
                  var42 = var29 + var7.aFloatArray4841[1] * var39 + var7.aFloatArray4841[5] * var40;
                  float var43 = var31 + var7.aFloatArray4841[3] * var39 + var7.aFloatArray4841[7] * var40;
                  float var44 = this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var41 / var43;
                  float var45 = this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var42 / var43;
                  var33.anInt1187 = (int)var37 * 1523290999;
                  var33.anInt1194 = (int)var38 * -719539513;
                  var33.aFloat1197 = this.aClass174_Sub1_9403.aFloat9241 + this.aClass174_Sub1_9403.aFloat9270 * (var30 - var7.aFloatArray4841[10] * (float)(var32.anInt1199 * -1193951865)) / var31;
                  var33.anInt1195 = (int)(var44 < var37?var37 - var44:var44 - var37) * 387927943;
                  var33.anInt1192 = (int)(var45 < var38?var38 - var45:var45 - var38) * -910217369;
               } else {
                  var33.anInt1192 = 0;
                  var33.anInt1195 = 0;
               }
            }
         }

         if(var2 != null) {
            boolean var53 = false;
            boolean var55 = true;
            int var56 = this.aShort9425 + this.aShort9426 >> 1;
            int var57 = this.aShort9387 + this.aShort9428 >> 1;
            short var54 = this.aShort9423;
            var24 = var22.aFloatArray4841[0] * (float)var56 + var22.aFloatArray4841[4] * (float)var54 + var22.aFloatArray4841[8] * (float)var57 + var22.aFloatArray4841[12];
            var29 = var22.aFloatArray4841[1] * (float)var56 + var22.aFloatArray4841[5] * (float)var54 + var22.aFloatArray4841[9] * (float)var57 + var22.aFloatArray4841[13];
            var30 = var22.aFloatArray4841[2] * (float)var56 + var22.aFloatArray4841[6] * (float)var54 + var22.aFloatArray4841[10] * (float)var57 + var22.aFloatArray4841[14];
            var31 = var22.aFloatArray4841[3] * (float)var56 + var22.aFloatArray4841[7] * (float)var54 + var22.aFloatArray4841[11] * (float)var57 + var22.aFloatArray4841[15];
            if(var30 >= -var31) {
               var2.anInt1789 = (int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var24 / var31);
               var2.anInt1786 = (int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var29 / var31);
            } else {
               var53 = true;
            }

            var54 = this.aShort9424;
            float var58 = var22.aFloatArray4841[0] * (float)var56 + var22.aFloatArray4841[4] * (float)var54 + var22.aFloatArray4841[8] * (float)var57 + var22.aFloatArray4841[12];
            float var59 = var22.aFloatArray4841[1] * (float)var56 + var22.aFloatArray4841[5] * (float)var54 + var22.aFloatArray4841[9] * (float)var57 + var22.aFloatArray4841[13];
            var37 = var22.aFloatArray4841[2] * (float)var56 + var22.aFloatArray4841[6] * (float)var54 + var22.aFloatArray4841[10] * (float)var57 + var22.aFloatArray4841[14];
            var38 = var22.aFloatArray4841[3] * (float)var56 + var22.aFloatArray4841[7] * (float)var54 + var22.aFloatArray4841[11] * (float)var57 + var22.aFloatArray4841[15];
            if(var37 >= -var38) {
               var2.anInt1785 = (int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var58 / var38);
               var2.anInt1788 = (int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var59 / var38);
            } else {
               var53 = true;
            }

            if(var53) {
               if(var30 < -var31 && var37 < -var38) {
                  var55 = false;
               } else if(var30 < -var31) {
                  var39 = (var30 + var31) / (var37 + var38) - 1.0F;
                  var40 = var24 + var39 * (var58 - var24);
                  var41 = var29 + var39 * (var59 - var29);
                  var42 = var31 + var39 * (var38 - var31);
                  var2.anInt1789 = (int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var40 / var42);
                  var2.anInt1786 = (int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var41 / var42);
               } else if(var37 < -var38) {
                  var39 = (var37 + var38) / (var30 + var31) - 1.0F;
                  var40 = var58 + var39 * (var24 - var58);
                  var41 = var59 + var39 * (var29 - var59);
                  var42 = var38 + var39 * (var31 - var38);
                  var2.anInt1785 = (int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var40 / var42);
                  var2.anInt1788 = (int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var41 / var42);
               }
            }

            if(var55) {
               if(var30 / var31 > var37 / var38) {
                  var39 = var24 + var7.aFloatArray4841[0] * (float)this.aShort9421 + var7.aFloatArray4841[12];
                  var40 = var31 + var7.aFloatArray4841[3] * (float)this.aShort9421 + var7.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub1_9403.aFloat9278 - (float)var2.anInt1789 + this.aClass174_Sub1_9403.aFloat9266 * var39 / var40);
               } else {
                  var39 = var58 + var7.aFloatArray4841[0] * (float)this.aShort9421 + var7.aFloatArray4841[12];
                  var40 = var38 + var7.aFloatArray4841[3] * (float)this.aShort9421 + var7.aFloatArray4841[15];
                  var2.anInt1787 = (int)(this.aClass174_Sub1_9403.aFloat9278 - (float)var2.anInt1785 + this.aClass174_Sub1_9403.aFloat9266 * var39 / var40);
               }

               var2.aBool1784 = true;
            }
         }

         this.method8558(true);
         this.aClass121_9364.aBool1530 = (var3 & 1) == 0;
         this.aClass121_9364.aBool1531 = false;

         try {
            this.method8580(this.aClass174_Sub1_9403.anIntArray9243 != null, this.aClass174_Sub1_9403.aFloatArray9246 != null, (var3 & 4) != 0, var23, this.aClass115_9362.aBool1376 && var21 > this.aClass115_9362.aFloat1377 || this.aClass115_9362.aBool1381);
         } catch (Exception var49) {
            ;
         }

         if(this.aClass100Array9417 != null) {
            for(var25 = 0; var25 < this.anInt9384; ++var25) {
               this.anIntArray9377[var25] = -1;
            }
         }

         this.aClass121_9364 = null;
         if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
            synchronized(this) {
               this.aBool9361 = false;
               this.notifyAll();
            }
         }

      }
   }

   public int method1988() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9424;
   }

   public void method2076(int var1) {
      if((this.anInt9373 & 6) != 6) {
         throw new IllegalStateException();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9360[var5] * var3 - this.anIntArray9380[var5] * var2 >> 14;
               this.anIntArray9380[var5] = this.anIntArray9360[var5] * var2 + this.anIntArray9380[var5] * var3 >> 14;
               this.anIntArray9360[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   public int method1984() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9428;
   }

   public int method1985() {
      if(!this.aBool9429) {
         this.method1986();
      }

      return this.aShort9435;
   }

   public void method1987(int var1) {
      if((this.anInt9373 & 4096) != 4096) {
         throw new IllegalStateException();
      } else {
         this.anInt9436 = var1;
         this.anInt9392 = 0;
      }
   }

   public void method1973(int var1) {
      if((this.anInt9373 & 8192) != 8192) {
         throw new IllegalStateException();
      } else {
         this.anInt9375 = var1;
         this.anInt9392 = 0;
      }
   }

   public int method1965() {
      return this.anInt9436;
   }

   public boolean method2102() {
      return this.aBool9401;
   }

   public void method1955(int var1, int var2, int var3) {
      if(var1 != 0 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 0 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 0 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] += var1;
               this.anIntArray9360[var5] += var2;
               this.anIntArray9380[var5] += var3;
            }

         }
      }
   }

   public void method2028(byte var1, byte[] var2) {
      if((this.anInt9373 & 1048576) == 0) {
         throw new RuntimeException();
      } else {
         if(this.aByteArray9409 == null) {
            this.aByteArray9409 = new byte[this.anInt9384];
         }

         int var3;
         if(var2 == null) {
            for(var3 = 0; var3 < this.anInt9384; ++var3) {
               this.aByteArray9409[var3] = var1;
            }
         } else {
            for(var3 = 0; var3 < this.anInt9384; ++var3) {
               int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
               this.aByteArray9409[var3] = (byte)var4;
            }
         }

         if(this.anInt9392 == 2) {
            this.anInt9392 = 1;
         }

      }
   }

   public void method1992(short var1, short var2) {
      if(this.aShortArray9402 != null) {
         if(!this.aBool9401 && var2 >= 0) {
            Class171 var3 = this.aClass174_Sub1_9403.aClass169_2035.method2122(var2 & '\uffff', (byte)-88);
            if(var3.aByte1986 != 0 || var3.aByte1963 != 0) {
               this.aBool9401 = true;
            }
         }

         for(int var4 = 0; var4 < this.anInt9384; ++var4) {
            if(this.aShortArray9402[var4] == var1) {
               this.aShortArray9402[var4] = var2;
            }
         }

      }
   }

   public void method2020(int var1, int var2, int var3, int var4) {
      if((this.anInt9373 & 524288) != 524288) {
         throw new IllegalStateException();
      } else {
         int var5;
         for(var5 = 0; var5 < this.anInt9384; ++var5) {
            int var6 = this.aShortArray9408[var5] & '\uffff';
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

            this.aShortArray9408[var5] = (short)(var7 << 10 | var8 << 7 | var9);
         }

         if(this.aClass100Array9417 != null) {
            for(var5 = 0; var5 < this.anInt9382; ++var5) {
               Class100 var10 = this.aClass100Array9417[var5];
               Class99 var11 = this.aClass99Array9418[var5];
               var11.anInt1191 = (var11.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var10.anInt1201 * -1840934035] & '\uffff', 22492276) & '\uffff'] & 16777215) * -1888472453;
            }
         }

         if(this.anInt9392 == 2) {
            this.anInt9392 = 1;
         }

      }
   }

   public Class182[] method1997() {
      return this.aClass182Array9414;
   }

   public Class141[] method2064() {
      return this.aClass141Array9415;
   }

   void method2113() {
      if(this.aBool9430) {
         for(int var1 = 0; var1 < this.anInt9376; ++var1) {
            this.anIntArray9405[var1] = this.anIntArray9405[var1] + 7 >> 4;
            this.anIntArray9360[var1] = this.anIntArray9360[var1] + 7 >> 4;
            this.anIntArray9380[var1] = this.anIntArray9380[var1] + 7 >> 4;
         }

         this.aBool9430 = false;
      }

      if(this.aBool9391) {
         this.method8562();
         this.aBool9391 = false;
      }

      this.aBool9363 = false;
   }

   public boolean method2014() {
      return this.aBool9431;
   }

   public void method2009() {
   }

   void method2119(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var49;
      int var50;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBool9430) {
            for(var10 = 0; var10 < this.anInt9376; ++var10) {
               this.anIntArray9405[var10] <<= 4;
               this.anIntArray9360[var10] <<= 4;
               this.anIntArray9380[var10] <<= 4;
            }

            this.aBool9430 = true;
         }

         var10 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var49 = var2[var11];
            if(var49 < this.anIntArrayArray9369.length) {
               int[] var52 = this.anIntArrayArray9369[var49];

               for(var50 = 0; var50 < var52.length; ++var50) {
                  var15 = var52[var50];
                  if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var15]) != 0) {
                     this.anInt9410 += this.anIntArray9405[var15];
                     this.anInt9411 += this.anIntArray9360[var15];
                     this.anInt9412 += this.anIntArray9380[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.anInt9410 = this.anInt9410 / var10 + var3;
            this.anInt9411 = this.anInt9411 / var10 + var4;
            this.anInt9412 = this.anInt9412 / var10 + var5;
            this.aBool9440 = true;
         } else {
            this.anInt9410 = var3;
            this.anInt9411 = var4;
            this.anInt9412 = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var49 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var49;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBool9430) {
               for(var10 = 0; var10 < this.anInt9376; ++var10) {
                  this.anIntArray9405[var10] <<= 4;
                  this.anIntArray9360[var10] <<= 4;
                  this.anIntArray9380[var10] <<= 4;
               }

               this.aBool9430 = true;
            }

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.anIntArrayArray9369.length) {
                  var12 = this.anIntArrayArray9369[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var50 = var12[var13];
                     if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                        this.anIntArray9405[var50] += var3;
                        this.anIntArray9360[var50] += var4;
                        this.anIntArray9380[var50] += var5;
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
                  if(!this.aBool9430) {
                     for(var10 = 0; var10 < this.anInt9376; ++var10) {
                        this.anIntArray9405[var10] <<= 4;
                        this.anIntArray9360[var10] <<= 4;
                        this.anIntArray9380[var10] <<= 4;
                     }

                     this.aBool9430 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9440) {
                     var16 = var8[0] * this.anInt9410 + var8[3] * this.anInt9411 + var8[6] * this.anInt9412 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9410 + var8[4] * this.anInt9411 + var8[7] * this.anInt9412 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9410 + var8[5] * this.anInt9411 + var8[8] * this.anInt9412 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     this.anInt9410 = var16;
                     this.anInt9411 = var17;
                     this.anInt9412 = var18;
                     this.aBool9440 = false;
                  }

                  int[] var51 = new int[9];
                  var17 = Class443.anIntArray4896[var3];
                  var18 = Class443.anIntArray4895[var3];
                  var19 = Class443.anIntArray4896[var4];
                  var20 = Class443.anIntArray4895[var4];
                  var21 = Class443.anIntArray4896[var5];
                  var22 = Class443.anIntArray4895[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var51[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var51[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var51[2] = var20 * var17 + 8192 >> 14;
                  var51[3] = var17 * var22 + 8192 >> 14;
                  var51[4] = var17 * var21 + 8192 >> 14;
                  var51[5] = -var18;
                  var51[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var51[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var51[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var51[0] * -this.anInt9410 + var51[1] * -this.anInt9411 + var51[2] * -this.anInt9412 + 8192 >> 14;
                  var26 = var51[3] * -this.anInt9410 + var51[4] * -this.anInt9411 + var51[5] * -this.anInt9412 + 8192 >> 14;
                  var27 = var51[6] * -this.anInt9410 + var51[7] * -this.anInt9411 + var51[8] * -this.anInt9412 + 8192 >> 14;
                  var28 = var53 + this.anInt9410;
                  int var54 = var26 + this.anInt9411;
                  var30 = var27 + this.anInt9412;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var51[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var51[0] * var13 + var51[1] * var50 + var51[2] * var15 + 8192 >> 14;
                  var33 = var51[3] * var13 + var51[4] * var50 + var51[5] * var15 + 8192 >> 14;
                  var34 = var51[6] * var13 + var51[7] * var50 + var51[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var49;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.anIntArrayArray9369.length) {
                        int[] var41 = this.anIntArrayArray9369[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var43]) != 0) {
                              int var44 = var35[0] * this.anIntArray9405[var43] + var35[1] * this.anIntArray9360[var43] + var35[2] * this.anIntArray9380[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.anIntArray9405[var43] + var35[4] * this.anIntArray9360[var43] + var35[5] * this.anIntArray9380[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.anIntArray9405[var43] + var35[7] * this.anIntArray9360[var43] + var35[8] * this.anIntArray9380[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.anIntArray9405[var43] = var44;
                              this.anIntArray9360[var43] = var45;
                              this.anIntArray9380[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9369.length) {
                        var12 = this.anIntArrayArray9369[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                              this.anIntArray9405[var50] -= this.anInt9410;
                              this.anIntArray9360[var50] -= this.anInt9411;
                              this.anIntArray9380[var50] -= this.anInt9412;
                              if(var5 != 0) {
                                 var15 = Class443.anIntArray4895[var5];
                                 var16 = Class443.anIntArray4896[var5];
                                 var17 = this.anIntArray9360[var50] * var15 + this.anIntArray9405[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9360[var50] = this.anIntArray9360[var50] * var16 - this.anIntArray9405[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9405[var50] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = Class443.anIntArray4895[var3];
                                 var16 = Class443.anIntArray4896[var3];
                                 var17 = this.anIntArray9360[var50] * var16 - this.anIntArray9380[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9380[var50] = this.anIntArray9360[var50] * var15 + this.anIntArray9380[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9360[var50] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = Class443.anIntArray4895[var4];
                                 var16 = Class443.anIntArray4896[var4];
                                 var17 = this.anIntArray9380[var50] * var15 + this.anIntArray9405[var50] * var16 + 16383 >> 14;
                                 this.anIntArray9380[var50] = this.anIntArray9380[var50] * var16 - this.anIntArray9405[var50] * var15 + 16383 >> 14;
                                 this.anIntArray9405[var50] = var17;
                              }

                              this.anIntArray9405[var50] += this.anInt9410;
                              this.anIntArray9360[var50] += this.anInt9411;
                              this.anIntArray9380[var50] += this.anInt9412;
                           }
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  if(!this.aBool9430) {
                     for(var10 = 0; var10 < this.anInt9376; ++var10) {
                        this.anIntArray9405[var10] <<= 4;
                        this.anIntArray9360[var10] <<= 4;
                        this.anIntArray9380[var10] <<= 4;
                     }

                     this.aBool9430 = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var49 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var50 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.aBool9440) {
                     var16 = var8[0] * this.anInt9410 + var8[3] * this.anInt9411 + var8[6] * this.anInt9412 + 8192 >> 14;
                     var17 = var8[1] * this.anInt9410 + var8[4] * this.anInt9411 + var8[7] * this.anInt9412 + 8192 >> 14;
                     var18 = var8[2] * this.anInt9410 + var8[5] * this.anInt9411 + var8[8] * this.anInt9412 + 8192 >> 14;
                     var16 += var13;
                     var17 += var50;
                     var18 += var15;
                     this.anInt9410 = var16;
                     this.anInt9411 = var17;
                     this.anInt9412 = var18;
                     this.aBool9440 = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.anInt9410 + 8192 >> 14;
                  var20 = var17 * -this.anInt9411 + 8192 >> 14;
                  var21 = var18 * -this.anInt9412 + 8192 >> 14;
                  var22 = var19 + this.anInt9410;
                  var23 = var20 + this.anInt9411;
                  var24 = var21 + this.anInt9412;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var50 + 8192 >> 14;
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
                  var32 += var49;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.anIntArrayArray9369.length) {
                        var35 = this.anIntArrayArray9369[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var37]) != 0) {
                              var38 = var29[0] * this.anIntArray9405[var37] + var29[1] * this.anIntArray9360[var37] + var29[2] * this.anIntArray9380[var37] + 8192 >> 14;
                              var39 = var29[3] * this.anIntArray9405[var37] + var29[4] * this.anIntArray9360[var37] + var29[5] * this.anIntArray9380[var37] + 8192 >> 14;
                              var40 = var29[6] * this.anIntArray9405[var37] + var29[7] * this.anIntArray9360[var37] + var29[8] * this.anIntArray9380[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.anIntArray9405[var37] = var38;
                              this.anIntArray9360[var37] = var39;
                              this.anIntArray9380[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.anIntArrayArray9369.length) {
                        var12 = this.anIntArrayArray9369[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var50 = var12[var13];
                           if(this.aShortArray9381 == null || (var7 & this.aShortArray9381[var50]) != 0) {
                              this.anIntArray9405[var50] -= this.anInt9410;
                              this.anIntArray9360[var50] -= this.anInt9411;
                              this.anIntArray9380[var50] -= this.anInt9412;
                              this.anIntArray9405[var50] = this.anIntArray9405[var50] * var3 / 128;
                              this.anIntArray9360[var50] = this.anIntArray9360[var50] * var4 / 128;
                              this.anIntArray9380[var50] = this.anIntArray9380[var50] * var5 / 128;
                              this.anIntArray9405[var50] += this.anInt9410;
                              this.anIntArray9360[var50] += this.anInt9411;
                              this.anIntArray9380[var50] += this.anInt9412;
                           }
                        }
                     }
                  }
               }

            } else {
               Class100 var47;
               Class99 var48;
               if(var1 == 5) {
                  if(this.anIntArrayArray9407 != null && this.aByteArray9409 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9407.length) {
                           var12 = this.anIntArrayArray9407[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9404 == null || (var7 & this.aShortArray9404[var50]) != 0) {
                                 var15 = (this.aByteArray9409[var50] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.aByteArray9409[var50] = (byte)var15;
                              }
                           }
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var10 = 0; var10 < this.anInt9382; ++var10) {
                           var47 = this.aClass100Array9417[var10];
                           var48 = this.aClass99Array9418[var10];
                           var48.anInt1191 = (var48.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var47.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9407 != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.anIntArrayArray9407.length) {
                           var12 = this.anIntArrayArray9407[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var50 = var12[var13];
                              if(this.aShortArray9404 == null || (var7 & this.aShortArray9404[var50]) != 0) {
                                 var15 = this.aShortArray9408[var50] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4;
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

                                 this.aShortArray9408[var50] = (short)(var16 << 10 | var17 << 7 | var18);
                              }
                           }

                           this.aBool9391 = true;
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var10 = 0; var10 < this.anInt9382; ++var10) {
                           var47 = this.aClass100Array9417[var10];
                           var48 = this.aClass99Array9418[var10];
                           var48.anInt1191 = (var48.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var47.anInt1201 * -1840934035] & '\uffff', 1041319545) & '\uffff'] & 16777215) * -1888472453;
                        }
                     }
                  }

               } else {
                  Class99 var14;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.anInt1190 += var3 * -397766141;
                                 var14.anInt1196 += var4 * 475388931;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.aFloat1193 = var14.aFloat1193 * (float)var3 / 128.0F;
                                 var14.aFloat1189 = var14.aFloat1189 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.anIntArrayArray9419.length) {
                              var12 = this.anIntArrayArray9419[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.aClass99Array9418[var12[var13]];
                                 var14.anInt1188 = (var14.anInt1188 * -236039229 + var3 & 16383) * 974959851;
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

   void method8577() {
      if(this.anInt9392 == 0 && this.aClass98Array9420 == null) {
         if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
            synchronized(this) {
               this.method8557();
            }
         } else {
            this.method8557();
         }

      }
   }

   void method8578() {
      this.aClass98Array9420 = new Class98[this.anInt9370];

      int var1;
      for(var1 = 0; var1 < this.anInt9370; ++var1) {
         this.aClass98Array9420[var1] = new Class98();
      }

      for(var1 = 0; var1 < this.anInt9384; ++var1) {
         short var2 = this.aShortArray9386[var1];
         short var3 = this.aShortArray9399[var1];
         short var4 = this.aShortArray9388[var1];
         int var5 = this.anIntArray9405[var3] - this.anIntArray9405[var2];
         int var6 = this.anIntArray9360[var3] - this.anIntArray9360[var2];
         int var7 = this.anIntArray9380[var3] - this.anIntArray9380[var2];
         int var8 = this.anIntArray9405[var4] - this.anIntArray9405[var2];
         int var9 = this.anIntArray9360[var4] - this.anIntArray9360[var2];
         int var10 = this.anIntArray9380[var4] - this.anIntArray9380[var2];
         int var11 = var6 * var10 - var9 * var7;
         int var12 = var7 * var8 - var10 * var5;

         int var13;
         for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
            var11 >>= 1;
            var12 >>= 1;
         }

         int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         if(var14 <= 0) {
            var14 = 1;
         }

         var11 = var11 * 256 / var14;
         var12 = var12 * 256 / var14;
         var13 = var13 * 256 / var14;
         byte var15;
         if(this.aByteArray9433 == null) {
            var15 = 0;
         } else {
            var15 = this.aByteArray9433[var1];
         }

         if(var15 == 0) {
            Class98 var16 = this.aClass98Array9420[var2];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
            var16 = this.aClass98Array9420[var3];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
            var16 = this.aClass98Array9420[var4];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
         } else if(var15 == 1) {
            if(this.aClass112Array9398 == null) {
               this.aClass112Array9398 = new Class112[this.anInt9384];
            }

            Class112 var17 = this.aClass112Array9398[var1] = new Class112();
            var17.anInt1357 = var11;
            var17.anInt1356 = var12;
            var17.anInt1358 = var13;
         }
      }

   }

   void method8579() {
      this.aClass98Array9420 = new Class98[this.anInt9370];

      int var1;
      for(var1 = 0; var1 < this.anInt9370; ++var1) {
         this.aClass98Array9420[var1] = new Class98();
      }

      for(var1 = 0; var1 < this.anInt9384; ++var1) {
         short var2 = this.aShortArray9386[var1];
         short var3 = this.aShortArray9399[var1];
         short var4 = this.aShortArray9388[var1];
         int var5 = this.anIntArray9405[var3] - this.anIntArray9405[var2];
         int var6 = this.anIntArray9360[var3] - this.anIntArray9360[var2];
         int var7 = this.anIntArray9380[var3] - this.anIntArray9380[var2];
         int var8 = this.anIntArray9405[var4] - this.anIntArray9405[var2];
         int var9 = this.anIntArray9360[var4] - this.anIntArray9360[var2];
         int var10 = this.anIntArray9380[var4] - this.anIntArray9380[var2];
         int var11 = var6 * var10 - var9 * var7;
         int var12 = var7 * var8 - var10 * var5;

         int var13;
         for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
            var11 >>= 1;
            var12 >>= 1;
         }

         int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         if(var14 <= 0) {
            var14 = 1;
         }

         var11 = var11 * 256 / var14;
         var12 = var12 * 256 / var14;
         var13 = var13 * 256 / var14;
         byte var15;
         if(this.aByteArray9433 == null) {
            var15 = 0;
         } else {
            var15 = this.aByteArray9433[var1];
         }

         if(var15 == 0) {
            Class98 var16 = this.aClass98Array9420[var2];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
            var16 = this.aClass98Array9420[var3];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
            var16 = this.aClass98Array9420[var4];
            var16.anInt1184 += var11;
            var16.anInt1185 += var12;
            var16.anInt1183 += var13;
            ++var16.anInt1186;
         } else if(var15 == 1) {
            if(this.aClass112Array9398 == null) {
               this.aClass112Array9398 = new Class112[this.anInt9384];
            }

            Class112 var17 = this.aClass112Array9398[var1] = new Class112();
            var17.anInt1357 = var11;
            var17.anInt1356 = var12;
            var17.anInt1358 = var13;
         }
      }

   }

   public void method2069(int var1, int var2, int var3) {
      if(var1 != 128 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 128 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 128 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] = this.anIntArray9405[var5] * var1 >> 7;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var2 >> 7;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 >> 7;
            }

            this.aBool9363 = false;
         }
      }
   }

   final void method8580(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      int var6;
      Class100 var7;
      if(this.aClass100Array9417 != null) {
         for(var6 = 0; var6 < this.anInt9382; this.anIntArray9377[var7.anInt1201 * -1840934035] = var6++) {
            var7 = this.aClass100Array9417[var6];
         }
      }

      if(!this.aBool9431 && this.aClass100Array9417 == null) {
         for(var6 = 0; var6 < this.anInt9385; ++var6) {
            this.method8572(var1, var2, var3, var6, var4, var5);
         }
      } else {
         if((this.anInt9373 & 256) == 0 && this.aShortArray9365 != null) {
            for(var6 = 0; var6 < this.anInt9385; ++var6) {
               short var9 = this.aShortArray9365[var6];
               this.method8572(var1, var2, var3, var9, var4, var5);
            }
         } else {
            for(var6 = 0; var6 < this.anInt9385; ++var6) {
               if(!this.method8570(var6) && !this.method8571(var6)) {
                  this.method8572(var1, var2, var3, var6, var4, var5);
               }
            }

            if(this.aByteArray9400 == null) {
               for(var6 = 0; var6 < this.anInt9385; ++var6) {
                  if(this.method8570(var6) || this.method8571(var6)) {
                     this.method8572(var1, var2, var3, var6, var4, var5);
                  }
               }
            } else {
               for(var6 = 0; var6 < 12; ++var6) {
                  for(int var8 = 0; var8 < this.anInt9385; ++var8) {
                     if(this.aByteArray9400[var8] == var6 && (this.method8570(var8) || this.method8571(var8))) {
                        this.method8572(var1, var2, var3, var8, var4, var5);
                     }
                  }
               }
            }
         }

         if(this.aClass100Array9417 != null) {
            this.method8569(var1, var2, var3);
         }
      }

   }

   public byte[] method2078() {
      return this.aByteArray9409;
   }

   public void method2001(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub3 var6 = (Class168_Sub3)var1;
      if((this.anInt9373 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else if((var6.anInt9373 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else {
         this.method8559(this.aClass174_Sub1_9403.method8502(Thread.currentThread()));
         this.method8575();
         this.method8556();
         var6.method8575();
         var6.method8556();
         ++anInt9439;
         int var7 = 0;
         int[] var8 = var6.anIntArray9405;
         int var9 = var6.anInt9370;

         int var10;
         for(var10 = 0; var10 < this.anInt9370; ++var10) {
            Class98 var11 = this.aClass98Array9420[var10];
            if(var11.anInt1186 != 0) {
               int var12 = this.anIntArray9360[var10] - var3;
               if(var12 >= var6.aShort9423 && var12 <= var6.aShort9424) {
                  int var13 = this.anIntArray9405[var10] - var2;
                  if(var13 >= var6.aShort9425 && var13 <= var6.aShort9426) {
                     int var14 = this.anIntArray9380[var10] - var4;
                     if(var14 >= var6.aShort9387 && var14 <= var6.aShort9428) {
                        for(int var15 = 0; var15 < var9; ++var15) {
                           Class98 var16 = var6.aClass98Array9420[var15];
                           if(var13 == var8[var15] && var14 == var6.anIntArray9380[var15] && var12 == var6.anIntArray9360[var15] && var16.anInt1186 != 0) {
                              if(this.aClass98Array9383 == null) {
                                 this.aClass98Array9383 = new Class98[this.anInt9370];
                              }

                              if(var6.aClass98Array9383 == null) {
                                 var6.aClass98Array9383 = new Class98[var9];
                              }

                              Class98 var17 = this.aClass98Array9383[var10];
                              if(var17 == null) {
                                 var17 = this.aClass98Array9383[var10] = new Class98(var11);
                              }

                              Class98 var18 = var6.aClass98Array9383[var15];
                              if(var18 == null) {
                                 var18 = var6.aClass98Array9383[var15] = new Class98(var16);
                              }

                              var17.anInt1184 += var16.anInt1184;
                              var17.anInt1185 += var16.anInt1185;
                              var17.anInt1183 += var16.anInt1183;
                              var17.anInt1186 += var16.anInt1186;
                              var18.anInt1184 += var11.anInt1184;
                              var18.anInt1185 += var11.anInt1185;
                              var18.anInt1183 += var11.anInt1183;
                              var18.anInt1186 += var11.anInt1186;
                              ++var7;
                              this.anIntArray9442[var10] = anInt9439;
                              this.anIntArray9443[var15] = anInt9439;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var7 >= 3 && var5) {
            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               if(this.anIntArray9442[this.aShortArray9386[var10]] == anInt9439 && this.anIntArray9442[this.aShortArray9399[var10]] == anInt9439 && this.anIntArray9442[this.aShortArray9388[var10]] == anInt9439) {
                  if(this.aByteArray9433 == null) {
                     this.aByteArray9433 = new byte[this.anInt9384];
                  }

                  this.aByteArray9433[var10] = 2;
               }
            }

            for(var10 = 0; var10 < var6.anInt9384; ++var10) {
               if(this.anIntArray9443[var6.aShortArray9386[var10]] == anInt9439 && this.anIntArray9443[var6.aShortArray9399[var10]] == anInt9439 && this.anIntArray9443[var6.aShortArray9388[var10]] == anInt9439) {
                  if(var6.aByteArray9433 == null) {
                     var6.aByteArray9433 = new byte[var6.anInt9384];
                  }

                  var6.aByteArray9433[var10] = 2;
               }
            }

         }
      }
   }

   public Class168 method2002(byte var1, int var2, boolean var3) {
      this.method8587(Thread.currentThread());
      boolean var4 = false;
      Class168_Sub3 var5;
      Class168_Sub3 var6;
      if(var1 > 0 && var1 <= 8) {
         var5 = this.aClass168_Sub3Array9446[var1 - 1];
         var6 = this.aClass168_Sub3Array9416[var1 - 1];
         var4 = true;
      } else {
         var6 = var5 = new Class168_Sub3(this.aClass174_Sub1_9403);
      }

      return this.method8582(var6, var5, var2, var4, var3);
   }

   public void method2086(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9384; ++var3) {
         if(this.aShortArray9408[var3] == var1) {
            this.aShortArray9408[var3] = var2;
         }
      }

      if(this.aClass100Array9417 != null) {
         for(var3 = 0; var3 < this.anInt9382; ++var3) {
            Class100 var4 = this.aClass100Array9417[var3];
            Class99 var5 = this.aClass99Array9418[var3];
            var5.anInt1191 = (var5.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var4.anInt1201 * -1840934035], 1525357668) & '\uffff'] & 16777215) * -1888472453;
         }
      }

      if(this.anInt9392 == 2) {
         this.anInt9392 = 1;
      }

   }

   public int method2003() {
      return this.anInt9373;
   }

   public int method1977() {
      return this.anInt9373;
   }

   public void method2004(int var1) {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
               this.method8558(true);
            }

            this.anInt9373 = var1;
         }
      } else {
         if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
            this.method8558(true);
         }

         this.anInt9373 = var1;
      }

   }

   public void method2006(int var1) {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
               this.method8558(true);
            }

            this.anInt9373 = var1;
         }
      } else {
         if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
            this.method8558(true);
         }

         this.anInt9373 = var1;
      }

   }

   public void method2008() {
   }

   public void method2029(int var1, int var2, int var3) {
      if(var1 != 128 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 128 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 128 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] = this.anIntArray9405[var5] * var1 >> 7;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var2 >> 7;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 >> 7;
            }

            this.aBool9363 = false;
         }
      }
   }

   public void method2010(int var1) {
      if((this.anInt9373 & 5) != 5) {
         throw new IllegalStateException();
      } else if(var1 == 4096) {
         this.method8584();
      } else if(var1 == 8192) {
         this.method8564();
      } else if(var1 == 12288) {
         this.method8565();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
               this.anIntArray9405[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   public void method2087(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9384; ++var3) {
         if(this.aShortArray9408[var3] == var1) {
            this.aShortArray9408[var3] = var2;
         }
      }

      if(this.aClass100Array9417 != null) {
         for(var3 = 0; var3 < this.anInt9382; ++var3) {
            Class100 var4 = this.aClass100Array9417[var3];
            Class99 var5 = this.aClass99Array9418[var3];
            var5.anInt1191 = (var5.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var4.anInt1201 * -1840934035], -1422756986) & '\uffff'] & 16777215) * -1888472453;
         }
      }

      if(this.anInt9392 == 2) {
         this.anInt9392 = 1;
      }

   }

   public void method1967(int var1) {
      if((this.anInt9373 & 13) != 13) {
         throw new IllegalStateException();
      } else {
         if(this.aClass98Array9420 != null) {
            if(var1 == 4096) {
               this.method8566();
               return;
            }

            if(var1 == 8192) {
               this.method8567();
               return;
            }

            if(var1 == 12288) {
               this.method8568();
               return;
            }

            int var2 = Class443.anIntArray4895[var1];
            int var3 = Class443.anIntArray4896[var1];
            synchronized(this) {
               int var5;
               int var6;
               for(var5 = 0; var5 < this.anInt9370; ++var5) {
                  var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
                  this.anIntArray9405[var5] = var6;
                  if(this.aClass98Array9420[var5] != null) {
                     var6 = this.aClass98Array9420[var5].anInt1183 * var2 + this.aClass98Array9420[var5].anInt1184 * var3 >> 14;
                     this.aClass98Array9420[var5].anInt1183 = this.aClass98Array9420[var5].anInt1183 * var3 - this.aClass98Array9420[var5].anInt1184 * var2 >> 14;
                     this.aClass98Array9420[var5].anInt1184 = var6;
                  }
               }

               if(this.aClass112Array9398 != null) {
                  for(var5 = 0; var5 < this.anInt9384; ++var5) {
                     if(this.aClass112Array9398[var5] != null) {
                        var6 = this.aClass112Array9398[var5].anInt1358 * var2 + this.aClass112Array9398[var5].anInt1357 * var3 >> 14;
                        this.aClass112Array9398[var5].anInt1358 = this.aClass112Array9398[var5].anInt1358 * var3 - this.aClass112Array9398[var5].anInt1357 * var2 >> 14;
                        this.aClass112Array9398[var5].anInt1357 = var6;
                     }
                  }
               }

               for(var5 = this.anInt9370; var5 < this.anInt9376; ++var5) {
                  var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
                  this.anIntArray9405[var5] = var6;
               }

               this.anInt9392 = 0;
               this.aBool9363 = false;
            }
         } else {
            this.method1951(var1);
         }

      }
   }

   public void method2013(int var1) {
      if((this.anInt9373 & 13) != 13) {
         throw new IllegalStateException();
      } else {
         if(this.aClass98Array9420 != null) {
            if(var1 == 4096) {
               this.method8566();
               return;
            }

            if(var1 == 8192) {
               this.method8567();
               return;
            }

            if(var1 == 12288) {
               this.method8568();
               return;
            }

            int var2 = Class443.anIntArray4895[var1];
            int var3 = Class443.anIntArray4896[var1];
            synchronized(this) {
               int var5;
               int var6;
               for(var5 = 0; var5 < this.anInt9370; ++var5) {
                  var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
                  this.anIntArray9405[var5] = var6;
                  if(this.aClass98Array9420[var5] != null) {
                     var6 = this.aClass98Array9420[var5].anInt1183 * var2 + this.aClass98Array9420[var5].anInt1184 * var3 >> 14;
                     this.aClass98Array9420[var5].anInt1183 = this.aClass98Array9420[var5].anInt1183 * var3 - this.aClass98Array9420[var5].anInt1184 * var2 >> 14;
                     this.aClass98Array9420[var5].anInt1184 = var6;
                  }
               }

               if(this.aClass112Array9398 != null) {
                  for(var5 = 0; var5 < this.anInt9384; ++var5) {
                     if(this.aClass112Array9398[var5] != null) {
                        var6 = this.aClass112Array9398[var5].anInt1358 * var2 + this.aClass112Array9398[var5].anInt1357 * var3 >> 14;
                        this.aClass112Array9398[var5].anInt1358 = this.aClass112Array9398[var5].anInt1358 * var3 - this.aClass112Array9398[var5].anInt1357 * var2 >> 14;
                        this.aClass112Array9398[var5].anInt1357 = var6;
                     }
                  }
               }

               for(var5 = this.anInt9370; var5 < this.anInt9376; ++var5) {
                  var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
                  this.anIntArray9405[var5] = var6;
               }

               this.anInt9392 = 0;
               this.aBool9363 = false;
            }
         } else {
            this.method1951(var1);
         }

      }
   }

   int method8581(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 126) {
         var2 = 126;
      }

      return (var1 & '\uff80') + var2;
   }

   public boolean method2098() {
      return this.aBool9431;
   }

   boolean method2103() {
      if(this.anIntArrayArray9369 == null) {
         return false;
      } else {
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;
         return true;
      }
   }

   public Class182[] method2090() {
      return this.aClass182Array9414;
   }

   public void method1959(int var1) {
      if((this.anInt9373 & 6) != 6) {
         throw new IllegalStateException();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9360[var5] * var3 - this.anIntArray9380[var5] * var2 >> 14;
               this.anIntArray9380[var5] = this.anIntArray9360[var5] * var2 + this.anIntArray9380[var5] * var3 >> 14;
               this.anIntArray9360[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   public boolean method1994() {
      if(this.aShortArray9402 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9402.length; ++var1) {
            if(this.aShortArray9402[var1] != -1 && !this.aClass174_Sub1_9403.method8495(this.aShortArray9402[var1])) {
               return false;
            }
         }

         return true;
      }
   }

   public void method1998(int var1) {
      if((this.anInt9373 & 3) != 3) {
         throw new IllegalStateException();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9360[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
               this.anIntArray9405[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   public void method2051(int var1, int var2, int var3) {
      if(var1 != 0 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 0 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 0 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] += var1;
               this.anIntArray9360[var5] += var2;
               this.anIntArray9380[var5] += var3;
            }

         }
      }
   }

   public void method2018(int var1, int var2, int var3) {
      if(var1 != 0 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 0 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 0 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] += var1;
               this.anIntArray9360[var5] += var2;
               this.anIntArray9380[var5] += var3;
            }

         }
      }
   }

   public void method2019(int var1, int var2, int var3) {
      if(var1 != 0 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 0 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 0 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] += var1;
               this.anIntArray9360[var5] += var2;
               this.anIntArray9380[var5] += var3;
            }

         }
      }
   }

   public boolean method1953() {
      return this.aBool9401;
   }

   public void method2022() {
      if((this.anInt9373 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.anInt9376; ++var2) {
               this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            }

            if(this.aClass98Array9420 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9420[var2] != null) {
                     this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
                  }
               }
            }

            if(this.aClass98Array9383 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9383[var2] != null) {
                     this.aClass98Array9383[var2].anInt1183 = -this.aClass98Array9383[var2].anInt1183;
                  }
               }
            }

            if(this.aClass112Array9398 != null) {
               for(var2 = 0; var2 < this.anInt9384; ++var2) {
                  if(this.aClass112Array9398[var2] != null) {
                     this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
                  }
               }
            }

            short[] var7 = this.aShortArray9386;
            this.aShortArray9386 = this.aShortArray9388;
            this.aShortArray9388 = var7;
            if(this.aFloatArrayArray9389 != null) {
               for(int var3 = 0; var3 < this.anInt9384; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray9389[var3] != null) {
                     var4 = this.aFloatArrayArray9389[var3][0];
                     this.aFloatArrayArray9389[var3][0] = this.aFloatArrayArray9389[var3][2];
                     this.aFloatArrayArray9389[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray9390[var3] != null) {
                     var4 = this.aFloatArrayArray9390[var3][0];
                     this.aFloatArrayArray9390[var3][0] = this.aFloatArrayArray9390[var3][2];
                     this.aFloatArrayArray9390[var3][2] = var4;
                  }
               }
            }

            this.aBool9363 = false;
            this.anInt9392 = 0;
         }
      }
   }

   public void method2050() {
      if((this.anInt9373 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.anInt9376; ++var2) {
               this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            }

            if(this.aClass98Array9420 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9420[var2] != null) {
                     this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
                  }
               }
            }

            if(this.aClass98Array9383 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9383[var2] != null) {
                     this.aClass98Array9383[var2].anInt1183 = -this.aClass98Array9383[var2].anInt1183;
                  }
               }
            }

            if(this.aClass112Array9398 != null) {
               for(var2 = 0; var2 < this.anInt9384; ++var2) {
                  if(this.aClass112Array9398[var2] != null) {
                     this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
                  }
               }
            }

            short[] var7 = this.aShortArray9386;
            this.aShortArray9386 = this.aShortArray9388;
            this.aShortArray9388 = var7;
            if(this.aFloatArrayArray9389 != null) {
               for(int var3 = 0; var3 < this.anInt9384; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray9389[var3] != null) {
                     var4 = this.aFloatArrayArray9389[var3][0];
                     this.aFloatArrayArray9389[var3][0] = this.aFloatArrayArray9389[var3][2];
                     this.aFloatArrayArray9389[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray9390[var3] != null) {
                     var4 = this.aFloatArrayArray9390[var3][0];
                     this.aFloatArrayArray9390[var3][0] = this.aFloatArrayArray9390[var3][2];
                     this.aFloatArrayArray9390[var3][2] = var4;
                  }
               }
            }

            this.aBool9363 = false;
            this.anInt9392 = 0;
         }
      }
   }

   public void method2091(int var1, int var2, int var3, int var4) {
      if((this.anInt9373 & 524288) != 524288) {
         throw new IllegalStateException();
      } else {
         int var5;
         for(var5 = 0; var5 < this.anInt9384; ++var5) {
            int var6 = this.aShortArray9408[var5] & '\uffff';
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

            this.aShortArray9408[var5] = (short)(var7 << 10 | var8 << 7 | var9);
         }

         if(this.aClass100Array9417 != null) {
            for(var5 = 0; var5 < this.anInt9382; ++var5) {
               Class100 var10 = this.aClass100Array9417[var5];
               Class99 var11 = this.aClass99Array9418[var5];
               var11.anInt1191 = (var11.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var10.anInt1201 * -1840934035] & '\uffff', -1263591799) & '\uffff'] & 16777215) * -1888472453;
            }
         }

         if(this.anInt9392 == 2) {
            this.anInt9392 = 1;
         }

      }
   }

   public void method2025() {
      if((this.anInt9373 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.anInt9376; ++var2) {
               this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            }

            if(this.aClass98Array9420 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9420[var2] != null) {
                     this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
                  }
               }
            }

            if(this.aClass98Array9383 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9383[var2] != null) {
                     this.aClass98Array9383[var2].anInt1183 = -this.aClass98Array9383[var2].anInt1183;
                  }
               }
            }

            if(this.aClass112Array9398 != null) {
               for(var2 = 0; var2 < this.anInt9384; ++var2) {
                  if(this.aClass112Array9398[var2] != null) {
                     this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
                  }
               }
            }

            short[] var7 = this.aShortArray9386;
            this.aShortArray9386 = this.aShortArray9388;
            this.aShortArray9388 = var7;
            if(this.aFloatArrayArray9389 != null) {
               for(int var3 = 0; var3 < this.anInt9384; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray9389[var3] != null) {
                     var4 = this.aFloatArrayArray9389[var3][0];
                     this.aFloatArrayArray9389[var3][0] = this.aFloatArrayArray9389[var3][2];
                     this.aFloatArrayArray9389[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray9390[var3] != null) {
                     var4 = this.aFloatArrayArray9390[var3][0];
                     this.aFloatArrayArray9390[var3][0] = this.aFloatArrayArray9390[var3][2];
                     this.aFloatArrayArray9390[var3][2] = var4;
                  }
               }
            }

            this.aBool9363 = false;
            this.anInt9392 = 0;
         }
      }
   }

   public void method2026() {
      if((this.anInt9373 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.anInt9376; ++var2) {
               this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            }

            if(this.aClass98Array9420 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9420[var2] != null) {
                     this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
                  }
               }
            }

            if(this.aClass98Array9383 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9383[var2] != null) {
                     this.aClass98Array9383[var2].anInt1183 = -this.aClass98Array9383[var2].anInt1183;
                  }
               }
            }

            if(this.aClass112Array9398 != null) {
               for(var2 = 0; var2 < this.anInt9384; ++var2) {
                  if(this.aClass112Array9398[var2] != null) {
                     this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
                  }
               }
            }

            short[] var7 = this.aShortArray9386;
            this.aShortArray9386 = this.aShortArray9388;
            this.aShortArray9388 = var7;
            if(this.aFloatArrayArray9389 != null) {
               for(int var3 = 0; var3 < this.anInt9384; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray9389[var3] != null) {
                     var4 = this.aFloatArrayArray9389[var3][0];
                     this.aFloatArrayArray9389[var3][0] = this.aFloatArrayArray9389[var3][2];
                     this.aFloatArrayArray9389[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray9390[var3] != null) {
                     var4 = this.aFloatArrayArray9390[var3][0];
                     this.aFloatArrayArray9390[var3][0] = this.aFloatArrayArray9390[var3][2];
                     this.aFloatArrayArray9390[var3][2] = var4;
                  }
               }
            }

            this.aBool9363 = false;
            this.anInt9392 = 0;
         }
      }
   }

   public void method2027(int var1, int var2, int var3) {
      if(var1 != 128 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 128 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 128 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] = this.anIntArray9405[var5] * var1 >> 7;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var2 >> 7;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 >> 7;
            }

            this.aBool9363 = false;
         }
      }
   }

   public void method2041() {
      if((this.anInt9373 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.anInt9376; ++var2) {
               this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            }

            if(this.aClass98Array9420 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9420[var2] != null) {
                     this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
                  }
               }
            }

            if(this.aClass98Array9383 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9383[var2] != null) {
                     this.aClass98Array9383[var2].anInt1183 = -this.aClass98Array9383[var2].anInt1183;
                  }
               }
            }

            if(this.aClass112Array9398 != null) {
               for(var2 = 0; var2 < this.anInt9384; ++var2) {
                  if(this.aClass112Array9398[var2] != null) {
                     this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
                  }
               }
            }

            short[] var7 = this.aShortArray9386;
            this.aShortArray9386 = this.aShortArray9388;
            this.aShortArray9388 = var7;
            if(this.aFloatArrayArray9389 != null) {
               for(int var3 = 0; var3 < this.anInt9384; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray9389[var3] != null) {
                     var4 = this.aFloatArrayArray9389[var3][0];
                     this.aFloatArrayArray9389[var3][0] = this.aFloatArrayArray9389[var3][2];
                     this.aFloatArrayArray9389[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray9390[var3] != null) {
                     var4 = this.aFloatArrayArray9390[var3][0];
                     this.aFloatArrayArray9390[var3][0] = this.aFloatArrayArray9390[var3][2];
                     this.aFloatArrayArray9390[var3][2] = var4;
                  }
               }
            }

            this.aBool9363 = false;
            this.anInt9392 = 0;
         }
      }
   }

   public int method2063() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9422;
   }

   public void method2030(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7) {
      if(var1 == 3) {
         if((this.anInt9373 & 7) != 7) {
            throw new IllegalStateException();
         }
      } else if((this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      }

      if(!this.aBool9363) {
         this.method8575();
      }

      int var8 = var5 + this.aShort9425;
      int var9 = var5 + this.aShort9426;
      int var10 = var7 + this.aShort9387;
      int var11 = var7 + this.aShort9428;
      if(var1 == 4 || var8 >= 0 && var9 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1711 * 1966165105 && var10 >= 0 && var11 + var3.anInt1712 * 1934131013 >> var3.anInt1710 * -586661047 < var3.anInt1713 * -810756899) {
         int[][] var12 = var3.anIntArrayArray1714;
         int[][] var13 = (int[][])null;
         if(var4 != null) {
            var13 = var4.anIntArrayArray1714;
         }

         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.anInt1710 * -586661047;
            var9 = var9 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            var10 >>= var3.anInt1710 * -586661047;
            var11 = var11 + (var3.anInt1712 * 1934131013 - 1) >> var3.anInt1710 * -586661047;
            if(var12[var8][var10] == var6 && var12[var9][var10] == var6 && var12[var8][var11] == var6 && var12[var9][var11] == var6) {
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

         synchronized(this) {
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            if(var1 == 1) {
               var15 = var3.anInt1712 * 1934131013 - 1;

               for(var16 = 0; var16 < this.anInt9370; ++var16) {
                  var17 = this.anIntArray9405[var16] + var5;
                  var18 = this.anIntArray9380[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.anInt1710 * -586661047;
                  var22 = var18 >> var3.anInt1710 * -586661047;
                  var23 = var12[var21][var22] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22] * var19 >> var3.anInt1710 * -586661047;
                  var24 = var12[var21][var22 + 1] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.anInt1710 * -586661047;
                  var25 = var23 * (var3.anInt1712 * 1934131013 - var20) + var24 * var20 >> var3.anInt1710 * -586661047;
                  this.anIntArray9360[var16] = this.anIntArray9360[var16] + var25 - var6;
               }

               for(var16 = this.anInt9370; var16 < this.anInt9376; ++var16) {
                  var17 = this.anIntArray9405[var16] + var5;
                  var18 = this.anIntArray9380[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.anInt1710 * -586661047;
                  var22 = var18 >> var3.anInt1710 * -586661047;
                  if(var21 >= 0 && var21 < var12.length - 1 && var22 >= 0 && var22 < var12[0].length - 1) {
                     var23 = var12[var21][var22] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22] * var19 >> var3.anInt1710 * -586661047;
                     var24 = var12[var21][var22 + 1] * (var3.anInt1712 * 1934131013 - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.anInt1710 * -586661047;
                     var25 = var23 * (var3.anInt1712 * 1934131013 - var20) + var24 * var20 >> var3.anInt1710 * -586661047;
                     this.anIntArray9360[var16] = this.anIntArray9360[var16] + var25 - var6;
                  }
               }
            } else {
               int var26;
               if(var1 == 2) {
                  if(this.aShort9423 == 0) {
                     return;
                  }

                  var15 = var3.anInt1712 * 1934131013 - 1;

                  for(var16 = 0; var16 < this.anInt9370; ++var16) {
                     var17 = (this.anIntArray9360[var16] << 16) / this.aShort9423;
                     if(var17 < var2) {
                        var18 = this.anIntArray9405[var16] + var5;
                        var19 = this.anIntArray9380[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.anInt1710 * -586661047;
                        var23 = var19 >> var3.anInt1710 * -586661047;
                        var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                        var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                        var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                        this.anIntArray9360[var16] += (var26 - var6) * (var2 - var17) / var2;
                     } else {
                        this.anIntArray9360[var16] = this.anIntArray9360[var16];
                     }
                  }

                  for(var16 = this.anInt9370; var16 < this.anInt9376; ++var16) {
                     var17 = (this.anIntArray9360[var16] << 16) / this.aShort9423;
                     if(var17 < var2) {
                        var18 = this.anIntArray9405[var16] + var5;
                        var19 = this.anIntArray9380[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.anInt1710 * -586661047;
                        var23 = var19 >> var3.anInt1710 * -586661047;
                        if(var22 >= 0 && var22 < var3.anInt1711 * 1966165105 - 1 && var23 >= 0 && var23 < var3.anInt1713 * -810756899 - 1) {
                           var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                           var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                           var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                           this.anIntArray9360[var16] += (var26 - var6) * (var2 - var17) / var2;
                        }
                     } else {
                        this.anIntArray9360[var16] = this.anIntArray9360[var16];
                     }
                  }
               } else if(var1 == 3) {
                  var15 = (var2 & 255) * 16;
                  var16 = (var2 >> 8 & 255) * 16;
                  var17 = (var2 >> 16 & 255) << 6;
                  var18 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var15 >> 1) < 0 || var5 + (var15 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1711 * 1966165105 << var3.anInt1710 * -586661047 || var7 - (var16 >> 1) < 0 || var7 + (var16 >> 1) + var3.anInt1712 * 1934131013 >= var3.anInt1713 * -810756899 << var3.anInt1710 * -586661047) {
                     return;
                  }

                  this.method1966(var3, var5, var6, var7, var15, var16, var17, var18);
               } else if(var1 == 4) {
                  var15 = var4.anInt1712 * 1934131013 - 1;
                  var16 = this.aShort9424 - this.aShort9423;

                  for(var17 = 0; var17 < this.anInt9370; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.anInt1710 * -586661047;
                     var23 = var19 >> var4.anInt1710 * -586661047;
                     var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                     var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                     var26 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                     this.anIntArray9360[var17] = this.anIntArray9360[var17] + (var26 - var6) + var16;
                  }

                  for(var17 = this.anInt9370; var17 < this.anInt9376; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.anInt1710 * -586661047;
                     var23 = var19 >> var4.anInt1710 * -586661047;
                     if(var22 >= 0 && var22 < var4.anInt1711 * 1966165105 - 1 && var23 >= 0 && var23 < var4.anInt1713 * -810756899 - 1) {
                        var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                        var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                        var26 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                        this.anIntArray9360[var17] = this.anIntArray9360[var17] + (var26 - var6) + var16;
                     }
                  }
               } else if(var1 == 5) {
                  var15 = var4.anInt1712 * 1934131013 - 1;
                  var16 = this.aShort9424 - this.aShort9423;

                  int var27;
                  int var28;
                  for(var17 = 0; var17 < this.anInt9370; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.anInt1710 * -586661047;
                     var23 = var19 >> var3.anInt1710 * -586661047;
                     var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                     var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                     var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                     var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                     var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                     var27 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                     var28 = var26 - var27 - var2;
                     this.anIntArray9360[var17] = ((this.anIntArray9360[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                  }

                  for(var17 = this.anInt9370; var17 < this.anInt9376; ++var17) {
                     var18 = this.anIntArray9405[var17] + var5;
                     var19 = this.anIntArray9380[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.anInt1710 * -586661047;
                     var23 = var19 >> var3.anInt1710 * -586661047;
                     if(var22 >= 0 && var22 < var3.anInt1711 * 1966165105 - 1 && var22 < var4.anInt1711 * 1966165105 - 1 && var23 >= 0 && var23 < var3.anInt1713 * -810756899 - 1 && var23 < var4.anInt1713 * -810756899 - 1) {
                        var24 = var12[var22][var23] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23] * var20 >> var3.anInt1710 * -586661047;
                        var25 = var12[var22][var23 + 1] * (var3.anInt1712 * 1934131013 - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.anInt1710 * -586661047;
                        var26 = var24 * (var3.anInt1712 * 1934131013 - var21) + var25 * var21 >> var3.anInt1710 * -586661047;
                        var24 = var13[var22][var23] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23] * var20 >> var4.anInt1710 * -586661047;
                        var25 = var13[var22][var23 + 1] * (var4.anInt1712 * 1934131013 - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.anInt1710 * -586661047;
                        var27 = var24 * (var4.anInt1712 * 1934131013 - var21) + var25 * var21 >> var4.anInt1710 * -586661047;
                        var28 = var26 - var27 - var2;
                        this.anIntArray9360[var17] = ((this.anIntArray9360[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                     }
                  }
               }
            }

            this.aBool9363 = false;
         }
      }
   }

   void method2032() {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            while(this.aBool1910) {
               try {
                  this.wait();
               } catch (InterruptedException var4) {
                  ;
               }
            }

            this.aBool1910 = true;
         }
      }

   }

   public int method2118() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9425;
   }

   boolean method2034() {
      if(this.anIntArrayArray9369 == null) {
         return false;
      } else {
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;
         return true;
      }
   }

   public void method1995(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9381 != null) {
         Class115 var4 = this.aClass174_Sub1_9403.method8502(Thread.currentThread());
         Class445 var5 = var4.aClass445_1388;
         var5.method5242(var1);
         if(var3) {
            var5.method5224();
         }

         Class433 var6 = var4.aClass433_1389;
         var6.method5110(var5);
         float[] var7 = new float[3];

         for(int var8 = 0; var8 < this.anInt9370; ++var8) {
            if((var2 & this.aShortArray9381[var8]) != 0) {
               var6.method5089((float)this.anIntArray9405[var8], (float)this.anIntArray9360[var8], (float)this.anIntArray9380[var8], var7);
               this.anIntArray9405[var8] = (int)var7[0];
               this.anIntArray9360[var8] = (int)var7[1];
               this.anIntArray9380[var8] = (int)var7[2];
            }
         }

      }
   }

   public void method2092(Class445 var1, Class164 var2, int var3) {
      this.method8576(var1, var2, var3);
   }

   boolean method2037() {
      if(this.anIntArrayArray9369 == null) {
         return false;
      } else {
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;
         return true;
      }
   }

   boolean method2068() {
      if(this.anIntArrayArray9369 == null) {
         return false;
      } else {
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;
         return true;
      }
   }

   void method2039(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var20;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBool9430) {
            for(var9 = 0; var9 < this.anInt9376; ++var9) {
               this.anIntArray9405[var9] <<= 4;
               this.anIntArray9360[var9] <<= 4;
               this.anIntArray9380[var9] <<= 4;
            }

            this.aBool9430 = true;
         }

         var9 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var21 = var2[var10];
            if(var21 < this.anIntArrayArray9369.length) {
               int[] var22 = this.anIntArrayArray9369[var21];

               for(var20 = 0; var20 < var22.length; ++var20) {
                  var14 = var22[var20];
                  this.anInt9410 += this.anIntArray9405[var14];
                  this.anInt9411 += this.anIntArray9360[var14];
                  this.anInt9412 += this.anIntArray9380[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9410 = this.anInt9410 / var9 + var3;
            this.anInt9411 = this.anInt9411 / var9 + var4;
            this.anInt9412 = this.anInt9412 / var9 + var5;
         } else {
            this.anInt9410 = var3;
            this.anInt9411 = var4;
            this.anInt9412 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBool9430) {
               for(var9 = 0; var9 < this.anInt9376; ++var9) {
                  this.anIntArray9405[var9] <<= 4;
                  this.anIntArray9360[var9] <<= 4;
                  this.anIntArray9380[var9] <<= 4;
               }

               this.aBool9430 = true;
            }

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9369.length) {
                  var11 = this.anIntArrayArray9369[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var20 = var11[var12];
                     this.anIntArray9405[var20] += var3;
                     this.anIntArray9360[var20] += var4;
                     this.anIntArray9380[var20] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var20 = var11[var12];
                        this.anIntArray9405[var20] -= this.anInt9410;
                        this.anIntArray9360[var20] -= this.anInt9411;
                        this.anIntArray9380[var20] -= this.anInt9412;
                        this.anIntArray9405[var20] = this.anIntArray9405[var20] * var3 / 128;
                        this.anIntArray9360[var20] = this.anIntArray9360[var20] * var4 / 128;
                        this.anIntArray9380[var20] = this.anIntArray9380[var20] * var5 / 128;
                        this.anIntArray9405[var20] += this.anInt9410;
                        this.anIntArray9360[var20] += this.anInt9411;
                        this.anIntArray9380[var20] += this.anInt9412;
                     }
                  }
               }

            } else {
               Class100 var18;
               Class99 var19;
               if(var1 == 5) {
                  if(this.anIntArrayArray9407 != null && this.aByteArray9409 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = (this.aByteArray9409[var20] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9409[var20] = (byte)var14;
                           }
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var18.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9407 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = this.aShortArray9408[var20] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              int var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9408[var20] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           this.aBool9391 = true;
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var18.anInt1201 * -1840934035] & '\uffff', -1003817987) & '\uffff'] & 16777215) * -1888472453;
                        }
                     }
                  }

               } else {
                  Class99 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1190 += var3 * -397766141;
                                 var13.anInt1196 += var4 * 475388931;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.aFloat1193 = var13.aFloat1193 * (float)var3 / 128.0F;
                                 var13.aFloat1189 = var13.aFloat1189 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1188 = (var13.anInt1188 * -236039229 + var3 & 16383) * 974959851;
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
      int var20;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBool9430) {
            for(var9 = 0; var9 < this.anInt9376; ++var9) {
               this.anIntArray9405[var9] <<= 4;
               this.anIntArray9360[var9] <<= 4;
               this.anIntArray9380[var9] <<= 4;
            }

            this.aBool9430 = true;
         }

         var9 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var21 = var2[var10];
            if(var21 < this.anIntArrayArray9369.length) {
               int[] var22 = this.anIntArrayArray9369[var21];

               for(var20 = 0; var20 < var22.length; ++var20) {
                  var14 = var22[var20];
                  this.anInt9410 += this.anIntArray9405[var14];
                  this.anInt9411 += this.anIntArray9360[var14];
                  this.anInt9412 += this.anIntArray9380[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9410 = this.anInt9410 / var9 + var3;
            this.anInt9411 = this.anInt9411 / var9 + var4;
            this.anInt9412 = this.anInt9412 / var9 + var5;
         } else {
            this.anInt9410 = var3;
            this.anInt9411 = var4;
            this.anInt9412 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBool9430) {
               for(var9 = 0; var9 < this.anInt9376; ++var9) {
                  this.anIntArray9405[var9] <<= 4;
                  this.anIntArray9360[var9] <<= 4;
                  this.anIntArray9380[var9] <<= 4;
               }

               this.aBool9430 = true;
            }

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9369.length) {
                  var11 = this.anIntArrayArray9369[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var20 = var11[var12];
                     this.anIntArray9405[var20] += var3;
                     this.anIntArray9360[var20] += var4;
                     this.anIntArray9380[var20] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var20 = var11[var12];
                        this.anIntArray9405[var20] -= this.anInt9410;
                        this.anIntArray9360[var20] -= this.anInt9411;
                        this.anIntArray9380[var20] -= this.anInt9412;
                        this.anIntArray9405[var20] = this.anIntArray9405[var20] * var3 / 128;
                        this.anIntArray9360[var20] = this.anIntArray9360[var20] * var4 / 128;
                        this.anIntArray9380[var20] = this.anIntArray9380[var20] * var5 / 128;
                        this.anIntArray9405[var20] += this.anInt9410;
                        this.anIntArray9360[var20] += this.anInt9411;
                        this.anIntArray9380[var20] += this.anInt9412;
                     }
                  }
               }

            } else {
               Class100 var18;
               Class99 var19;
               if(var1 == 5) {
                  if(this.anIntArrayArray9407 != null && this.aByteArray9409 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = (this.aByteArray9409[var20] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9409[var20] = (byte)var14;
                           }
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var18.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9407 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = this.aShortArray9408[var20] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              int var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9408[var20] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           this.aBool9391 = true;
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var18.anInt1201 * -1840934035] & '\uffff', 955549378) & '\uffff'] & 16777215) * -1888472453;
                        }
                     }
                  }

               } else {
                  Class99 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1190 += var3 * -397766141;
                                 var13.anInt1196 += var4 * 475388931;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.aFloat1193 = var13.aFloat1193 * (float)var3 / 128.0F;
                                 var13.aFloat1189 = var13.aFloat1189 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1188 = (var13.anInt1188 * -236039229 + var3 & 16383) * 974959851;
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
      int var20;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.aBool9430) {
            for(var9 = 0; var9 < this.anInt9376; ++var9) {
               this.anIntArray9405[var9] <<= 4;
               this.anIntArray9360[var9] <<= 4;
               this.anIntArray9380[var9] <<= 4;
            }

            this.aBool9430 = true;
         }

         var9 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var21 = var2[var10];
            if(var21 < this.anIntArrayArray9369.length) {
               int[] var22 = this.anIntArrayArray9369[var21];

               for(var20 = 0; var20 < var22.length; ++var20) {
                  var14 = var22[var20];
                  this.anInt9410 += this.anIntArray9405[var14];
                  this.anInt9411 += this.anIntArray9360[var14];
                  this.anInt9412 += this.anIntArray9380[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.anInt9410 = this.anInt9410 / var9 + var3;
            this.anInt9411 = this.anInt9411 / var9 + var4;
            this.anInt9412 = this.anInt9412 / var9 + var5;
         } else {
            this.anInt9410 = var3;
            this.anInt9411 = var4;
            this.anInt9412 = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.aBool9430) {
               for(var9 = 0; var9 < this.anInt9376; ++var9) {
                  this.anIntArray9405[var9] <<= 4;
                  this.anIntArray9360[var9] <<= 4;
                  this.anIntArray9380[var9] <<= 4;
               }

               this.aBool9430 = true;
            }

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.anIntArrayArray9369.length) {
                  var11 = this.anIntArrayArray9369[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var20 = var11[var12];
                     this.anIntArray9405[var20] += var3;
                     this.anIntArray9360[var20] += var4;
                     this.anIntArray9380[var20] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.anIntArray9405[var20] -= this.anInt9410;
                           this.anIntArray9360[var20] -= this.anInt9411;
                           this.anIntArray9380[var20] -= this.anInt9412;
                           if(var3 != 0) {
                              var14 = Class443.anIntArray4895[var3];
                              var15 = Class443.anIntArray4896[var3];
                              var16 = this.anIntArray9360[var20] * var15 - this.anIntArray9380[var20] * var14 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9360[var20] * var14 + this.anIntArray9380[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = var16;
                           }

                           if(var5 != 0) {
                              var14 = Class443.anIntArray4895[var5];
                              var15 = Class443.anIntArray4896[var5];
                              var16 = this.anIntArray9360[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9360[var20] = this.anIntArray9360[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = Class443.anIntArray4895[var4];
                              var15 = Class443.anIntArray4896[var4];
                              var16 = this.anIntArray9380[var20] * var14 + this.anIntArray9405[var20] * var15 + 16383 >> 14;
                              this.anIntArray9380[var20] = this.anIntArray9380[var20] * var15 - this.anIntArray9405[var20] * var14 + 16383 >> 14;
                              this.anIntArray9405[var20] = var16;
                           }

                           this.anIntArray9405[var20] += this.anInt9410;
                           this.anIntArray9360[var20] += this.anInt9411;
                           this.anIntArray9380[var20] += this.anInt9412;
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.anIntArrayArray9369.length) {
                     var11 = this.anIntArrayArray9369[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var20 = var11[var12];
                        this.anIntArray9405[var20] -= this.anInt9410;
                        this.anIntArray9360[var20] -= this.anInt9411;
                        this.anIntArray9380[var20] -= this.anInt9412;
                        this.anIntArray9405[var20] = this.anIntArray9405[var20] * var3 / 128;
                        this.anIntArray9360[var20] = this.anIntArray9360[var20] * var4 / 128;
                        this.anIntArray9380[var20] = this.anIntArray9380[var20] * var5 / 128;
                        this.anIntArray9405[var20] += this.anInt9410;
                        this.anIntArray9360[var20] += this.anInt9411;
                        this.anIntArray9380[var20] += this.anInt9412;
                     }
                  }
               }

            } else {
               Class100 var18;
               Class99 var19;
               if(var1 == 5) {
                  if(this.anIntArrayArray9407 != null && this.aByteArray9409 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = (this.aByteArray9409[var20] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.aByteArray9409[var20] = (byte)var14;
                           }
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var18.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.anIntArrayArray9407 != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.anIntArrayArray9407.length) {
                           var11 = this.anIntArrayArray9407[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = this.aShortArray9408[var20] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              int var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.aShortArray9408[var20] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           this.aBool9391 = true;
                        }
                     }

                     if(this.aClass100Array9417 != null) {
                        for(var9 = 0; var9 < this.anInt9382; ++var9) {
                           var18 = this.aClass100Array9417[var9];
                           var19 = this.aClass99Array9418[var9];
                           var19.anInt1191 = (var19.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var18.anInt1201 * -1840934035] & '\uffff', -1945379008) & '\uffff'] & 16777215) * -1888472453;
                        }
                     }
                  }

               } else {
                  Class99 var13;
                  if(var1 == 8) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1190 += var3 * -397766141;
                                 var13.anInt1196 += var4 * 475388931;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.aFloat1193 = var13.aFloat1193 * (float)var3 / 128.0F;
                                 var13.aFloat1189 = var13.aFloat1189 * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.anIntArrayArray9419 != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.anIntArrayArray9419.length) {
                              var11 = this.anIntArrayArray9419[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.aClass99Array9418[var11[var12]];
                                 var13.anInt1188 = (var13.anInt1188 * -236039229 + var3 & 16383) * 974959851;
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

   public int method2059() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9422;
   }

   public void method1968(Class168 var1, int var2, int var3, int var4, boolean var5) {
      Class168_Sub3 var6 = (Class168_Sub3)var1;
      if((this.anInt9373 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else if((var6.anInt9373 & 65536) != 65536) {
         throw new IllegalStateException("");
      } else {
         this.method8559(this.aClass174_Sub1_9403.method8502(Thread.currentThread()));
         this.method8575();
         this.method8556();
         var6.method8575();
         var6.method8556();
         ++anInt9439;
         int var7 = 0;
         int[] var8 = var6.anIntArray9405;
         int var9 = var6.anInt9370;

         int var10;
         for(var10 = 0; var10 < this.anInt9370; ++var10) {
            Class98 var11 = this.aClass98Array9420[var10];
            if(var11.anInt1186 != 0) {
               int var12 = this.anIntArray9360[var10] - var3;
               if(var12 >= var6.aShort9423 && var12 <= var6.aShort9424) {
                  int var13 = this.anIntArray9405[var10] - var2;
                  if(var13 >= var6.aShort9425 && var13 <= var6.aShort9426) {
                     int var14 = this.anIntArray9380[var10] - var4;
                     if(var14 >= var6.aShort9387 && var14 <= var6.aShort9428) {
                        for(int var15 = 0; var15 < var9; ++var15) {
                           Class98 var16 = var6.aClass98Array9420[var15];
                           if(var13 == var8[var15] && var14 == var6.anIntArray9380[var15] && var12 == var6.anIntArray9360[var15] && var16.anInt1186 != 0) {
                              if(this.aClass98Array9383 == null) {
                                 this.aClass98Array9383 = new Class98[this.anInt9370];
                              }

                              if(var6.aClass98Array9383 == null) {
                                 var6.aClass98Array9383 = new Class98[var9];
                              }

                              Class98 var17 = this.aClass98Array9383[var10];
                              if(var17 == null) {
                                 var17 = this.aClass98Array9383[var10] = new Class98(var11);
                              }

                              Class98 var18 = var6.aClass98Array9383[var15];
                              if(var18 == null) {
                                 var18 = var6.aClass98Array9383[var15] = new Class98(var16);
                              }

                              var17.anInt1184 += var16.anInt1184;
                              var17.anInt1185 += var16.anInt1185;
                              var17.anInt1183 += var16.anInt1183;
                              var17.anInt1186 += var16.anInt1186;
                              var18.anInt1184 += var11.anInt1184;
                              var18.anInt1185 += var11.anInt1185;
                              var18.anInt1183 += var11.anInt1183;
                              var18.anInt1186 += var11.anInt1186;
                              ++var7;
                              this.anIntArray9442[var10] = anInt9439;
                              this.anIntArray9443[var15] = anInt9439;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var7 >= 3 && var5) {
            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               if(this.anIntArray9442[this.aShortArray9386[var10]] == anInt9439 && this.anIntArray9442[this.aShortArray9399[var10]] == anInt9439 && this.anIntArray9442[this.aShortArray9388[var10]] == anInt9439) {
                  if(this.aByteArray9433 == null) {
                     this.aByteArray9433 = new byte[this.anInt9384];
                  }

                  this.aByteArray9433[var10] = 2;
               }
            }

            for(var10 = 0; var10 < var6.anInt9384; ++var10) {
               if(this.anIntArray9443[var6.aShortArray9386[var10]] == anInt9439 && this.anIntArray9443[var6.aShortArray9399[var10]] == anInt9439 && this.anIntArray9443[var6.aShortArray9388[var10]] == anInt9439) {
                  if(var6.aByteArray9433 == null) {
                     var6.aByteArray9433 = new byte[var6.anInt9384];
                  }

                  var6.aByteArray9433[var10] = 2;
               }
            }

         }
      }
   }

   void method2044(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var10 = 0; var10 < this.anInt9376; ++var10) {
            this.anInt9410 += this.anIntArray9405[var10];
            this.anInt9411 += this.anIntArray9360[var10];
            this.anInt9412 += this.anIntArray9380[var10];
            ++var5;
         }

         if(var5 > 0) {
            this.anInt9410 = this.anInt9410 / var5 + var2;
            this.anInt9411 = this.anInt9411 / var5 + var3;
            this.anInt9412 = this.anInt9412 / var5 + var4;
         } else {
            this.anInt9410 = var2;
            this.anInt9411 = var3;
            this.anInt9412 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.anInt9376; ++var5) {
            this.anIntArray9405[var5] += var2;
            this.anIntArray9360[var5] += var3;
            this.anIntArray9380[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] -= this.anInt9410;
               this.anIntArray9360[var5] -= this.anInt9411;
               this.anIntArray9380[var5] -= this.anInt9412;
               if(var4 != 0) {
                  var10 = Class443.anIntArray4895[var4];
                  var7 = Class443.anIntArray4896[var4];
                  var8 = this.anIntArray9360[var5] * var10 + this.anIntArray9405[var5] * var7 + 16383 >> 14;
                  this.anIntArray9360[var5] = this.anIntArray9360[var5] * var7 - this.anIntArray9405[var5] * var10 + 16383 >> 14;
                  this.anIntArray9405[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = Class443.anIntArray4895[var2];
                  var7 = Class443.anIntArray4896[var2];
                  var8 = this.anIntArray9360[var5] * var7 - this.anIntArray9380[var5] * var10 + 16383 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9360[var5] * var10 + this.anIntArray9380[var5] * var7 + 16383 >> 14;
                  this.anIntArray9360[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = Class443.anIntArray4895[var3];
                  var7 = Class443.anIntArray4896[var3];
                  var8 = this.anIntArray9380[var5] * var10 + this.anIntArray9405[var5] * var7 + 16383 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var7 - this.anIntArray9405[var5] * var10 + 16383 >> 14;
                  this.anIntArray9405[var5] = var8;
               }

               this.anIntArray9405[var5] += this.anInt9410;
               this.anIntArray9360[var5] += this.anInt9411;
               this.anIntArray9380[var5] += this.anInt9412;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] -= this.anInt9410;
               this.anIntArray9360[var5] -= this.anInt9411;
               this.anIntArray9380[var5] -= this.anInt9412;
               this.anIntArray9405[var5] = this.anIntArray9405[var5] * var2 / 128;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var3 / 128;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var4 / 128;
               this.anIntArray9405[var5] += this.anInt9410;
               this.anIntArray9360[var5] += this.anInt9411;
               this.anIntArray9380[var5] += this.anInt9412;
            }

         } else {
            Class100 var11;
            Class99 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt9384; ++var5) {
                  var10 = (this.aByteArray9409[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.aByteArray9409[var5] = (byte)var10;
               }

               if(this.aClass100Array9417 != null) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var11 = this.aClass100Array9417[var5];
                     var12 = this.aClass99Array9418[var5];
                     var12.anInt1191 = (var12.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var11.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt9384; ++var5) {
                  var10 = this.aShortArray9408[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3;
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

                  this.aShortArray9408[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               this.aBool9391 = true;
               if(this.aClass100Array9417 != null) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var11 = this.aClass100Array9417[var5];
                     var12 = this.aClass99Array9418[var5];
                     var12.anInt1191 = (var12.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var11.anInt1201 * -1840934035] & '\uffff', 610287751) & '\uffff'] & 16777215) * -1888472453;
                  }
               }

            } else {
               Class99 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var6 = this.aClass99Array9418[var5];
                     var6.anInt1190 += var2 * -397766141;
                     var6.anInt1196 += var3 * 475388931;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var6 = this.aClass99Array9418[var5];
                     var6.aFloat1193 = var6.aFloat1193 * (float)var2 / 128.0F;
                     var6.aFloat1189 = var6.aFloat1189 * (float)var3 / 128.0F;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var6 = this.aClass99Array9418[var5];
                     var6.anInt1188 = (var6.anInt1188 * -236039229 + var2 & 16383) * 974959851;
                  }

               }
            }
         }
      }
   }

   Class168 method8582(Class168_Sub3 var1, Class168_Sub3 var2, int var3, boolean var4, boolean var5) {
      var1.aBool9363 = this.aBool9363;
      if(this.aBool9363) {
         var1.aShort9426 = this.aShort9426;
         var1.aShort9424 = this.aShort9424;
         var1.aShort9428 = this.aShort9428;
         var1.aShort9425 = this.aShort9425;
         var1.aShort9423 = this.aShort9423;
         var1.aShort9387 = this.aShort9387;
         var1.aShort9421 = this.aShort9421;
         var1.aShort9422 = this.aShort9422;
      }

      if(this.aBool9429) {
         var1.aShort9435 = this.aShort9435;
         var1.aBool9429 = true;
      } else {
         var1.aBool9429 = false;
      }

      var1.anInt9436 = this.anInt9436;
      var1.anInt9375 = this.anInt9375;
      var1.anInt9376 = this.anInt9376;
      var1.anInt9370 = this.anInt9370;
      var1.anInt9384 = this.anInt9384;
      var1.anInt9382 = this.anInt9382;
      var1.anInt9385 = this.anInt9385;
      if((var3 & 256) != 0) {
         var1.aBool9431 = true;
      } else {
         var1.aBool9431 = this.aBool9431;
      }

      var1.aBool9401 = this.aBool9401;
      boolean var6 = (var3 & 7) == 7 | (var3 & 32) != 0;
      boolean var7 = var6 || (var3 & 1) != 0;
      boolean var8 = var6 || (var3 & 2) != 0;
      boolean var9 = var6 || (var3 & 4) != 0 || (var3 & 16) != 0;
      int var10;
      if(!var7 && !var8 && !var9) {
         var1.anIntArray9405 = this.anIntArray9405;
         var1.anIntArray9360 = this.anIntArray9360;
         var1.anIntArray9380 = this.anIntArray9380;
      } else {
         if(!var7) {
            var1.anIntArray9405 = this.anIntArray9405;
         } else {
            if(var2.anIntArray9405 != null && var2.anIntArray9405.length >= this.anInt9376) {
               var1.anIntArray9405 = var2.anIntArray9405;
            } else {
               var1.anIntArray9405 = var2.anIntArray9405 = new int[this.anInt9376];
            }

            for(var10 = 0; var10 < this.anInt9376; ++var10) {
               var1.anIntArray9405[var10] = this.anIntArray9405[var10];
            }
         }

         if(!var8) {
            var1.anIntArray9360 = this.anIntArray9360;
         } else {
            if(var2.anIntArray9360 != null && var2.anIntArray9360.length >= this.anInt9376) {
               var1.anIntArray9360 = var2.anIntArray9360;
            } else {
               var1.anIntArray9360 = var2.anIntArray9360 = new int[this.anInt9376];
            }

            for(var10 = 0; var10 < this.anInt9376; ++var10) {
               var1.anIntArray9360[var10] = this.anIntArray9360[var10];
            }
         }

         if(var9) {
            if(var2.anIntArray9380 != null && var2.anIntArray9380.length >= this.anInt9376) {
               var1.anIntArray9380 = var2.anIntArray9380;
            } else {
               var1.anIntArray9380 = var2.anIntArray9380 = new int[this.anInt9376];
            }

            for(var10 = 0; var10 < this.anInt9376; ++var10) {
               var1.anIntArray9380[var10] = this.anIntArray9380[var10];
            }
         } else {
            var1.anIntArray9380 = this.anIntArray9380;
         }
      }

      if((var3 & 540800) != 0) {
         if(var2.aShortArray9408 != null && var2.aShortArray9408.length >= this.anInt9384) {
            var1.aShortArray9408 = var2.aShortArray9408;
         } else {
            var10 = this.anInt9384;
            var1.aShortArray9408 = var2.aShortArray9408 = new short[var10];
         }

         for(var10 = 0; var10 < this.anInt9384; ++var10) {
            var1.aShortArray9408[var10] = this.aShortArray9408[var10];
         }
      } else {
         var1.aShortArray9408 = this.aShortArray9408;
      }

      if((var3 & 618520) != 0) {
         var1.anInt9392 = 0;
         var1.anIntArray9393 = null;
         var1.anIntArray9437 = null;
         var1.anIntArray9445 = null;
      } else if((var3 & 128) != 0) {
         if(var5) {
            this.method8558(false);
         }

         if(this.anIntArray9445 != null) {
            if(var2.anIntArray9445 != null && var2.anIntArray9445.length >= this.anInt9384) {
               var1.anIntArray9445 = var2.anIntArray9445;
               var1.anIntArray9437 = var2.anIntArray9437;
               var1.anIntArray9393 = var2.anIntArray9393;
            } else {
               var10 = this.anInt9384;
               var1.anIntArray9445 = var2.anIntArray9445 = new int[var10];
               var1.anIntArray9437 = var2.anIntArray9437 = new int[var10];
               var1.anIntArray9393 = var2.anIntArray9393 = new int[var10];
            }

            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               var1.anIntArray9445[var10] = this.anIntArray9445[var10];
               var1.anIntArray9437[var10] = this.anIntArray9437[var10];
               var1.anIntArray9393[var10] = this.anIntArray9393[var10];
            }
         }

         var1.anInt9392 = this.anInt9392;
      } else {
         if(var5) {
            this.method8558(false);
         }

         var1.anIntArray9445 = this.anIntArray9445;
         var1.anIntArray9437 = this.anIntArray9437;
         var1.anIntArray9393 = this.anIntArray9393;
         var1.anInt9392 = this.anInt9392;
      }

      if((var3 & 256) != 0) {
         if(var2.aByteArray9409 != null && var2.aByteArray9409.length >= this.anInt9384) {
            var1.aByteArray9409 = var2.aByteArray9409;
         } else {
            var10 = this.anInt9384;
            var1.aByteArray9409 = var2.aByteArray9409 = new byte[var10];
         }

         if(this.aByteArray9409 != null) {
            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               var1.aByteArray9409[var10] = this.aByteArray9409[var10];
            }
         } else {
            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               var1.aByteArray9409[var10] = 0;
            }
         }
      } else {
         var1.aByteArray9409 = this.aByteArray9409;
      }

      if((var3 & 8) == 0 && (var3 & 16) == 0) {
         if(var5) {
            this.method8556();
         }

         var1.aClass98Array9420 = this.aClass98Array9420;
         var1.aClass112Array9398 = this.aClass112Array9398;
      } else {
         if(var2.aClass98Array9420 != null && var2.aClass98Array9420.length >= this.anInt9370) {
            var1.aClass98Array9420 = var2.aClass98Array9420;
         } else {
            var10 = this.anInt9370;
            var1.aClass98Array9420 = var2.aClass98Array9420 = new Class98[var10];
         }

         if(this.aClass98Array9420 != null) {
            for(var10 = 0; var10 < this.anInt9370; ++var10) {
               var1.aClass98Array9420[var10] = new Class98(this.aClass98Array9420[var10]);
            }
         } else {
            var1.aClass98Array9420 = null;
         }

         if(this.aClass112Array9398 != null) {
            if(var2.aClass112Array9398 != null && var2.aClass112Array9398.length >= this.anInt9384) {
               var1.aClass112Array9398 = var2.aClass112Array9398;
            } else {
               var10 = this.anInt9384;
               var1.aClass112Array9398 = var2.aClass112Array9398 = new Class112[var10];
            }

            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               var1.aClass112Array9398[var10] = this.aClass112Array9398[var10] != null?new Class112(this.aClass112Array9398[var10]):null;
            }
         } else {
            var1.aClass112Array9398 = null;
         }
      }

      if((var3 & '\u8000') != 0) {
         if(this.aShortArray9402 == null) {
            var1.aShortArray9402 = null;
         } else {
            if(var2.aShortArray9402 != null && var2.aShortArray9402.length >= this.anInt9384) {
               var1.aShortArray9402 = var2.aShortArray9402;
            } else {
               var10 = this.anInt9384;
               var1.aShortArray9402 = var2.aShortArray9402 = new short[var10];
            }

            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               var1.aShortArray9402[var10] = this.aShortArray9402[var10];
            }
         }
      } else {
         var1.aShortArray9402 = this.aShortArray9402;
      }

      if((var3 & 65536) != 0) {
         if(this.aByteArray9433 == null) {
            var1.aByteArray9433 = null;
         } else {
            if(var2.aByteArray9433 != null && var2.aByteArray9433.length >= this.anInt9384) {
               var1.aByteArray9433 = var2.aByteArray9433;
            } else {
               var10 = var4?this.anInt9384 + 100:this.anInt9384;
               var1.aByteArray9433 = var2.aByteArray9433 = new byte[var10];
            }

            for(var10 = 0; var10 < this.anInt9384; ++var10) {
               var1.aByteArray9433[var10] = this.aByteArray9433[var10];
            }
         }
      } else {
         var1.aByteArray9433 = this.aByteArray9433;
      }

      if((var3 & '\uc580') != 0) {
         if(var2.aClass99Array9418 != null && var2.aClass99Array9418.length >= this.anInt9382) {
            var1.aClass99Array9418 = var2.aClass99Array9418;

            for(var10 = 0; var10 < this.anInt9382; ++var10) {
               var1.aClass99Array9418[var10].method1280(this.aClass99Array9418[var10], -1957887669);
            }
         } else {
            var10 = this.anInt9382;
            var1.aClass99Array9418 = var2.aClass99Array9418 = new Class99[var10];

            for(int var11 = 0; var11 < this.anInt9382; ++var11) {
               var1.aClass99Array9418[var11] = this.aClass99Array9418[var11].method1279(1867839027);
            }
         }
      } else {
         var1.aClass99Array9418 = this.aClass99Array9418;
      }

      if(this.aFloatArrayArray9389 != null && (var3 & 16) != 0) {
         if(var2.aFloatArrayArray9389 != null && var2.aFloatArrayArray9389.length >= this.anInt9384) {
            var1.aFloatArrayArray9389 = var2.aFloatArrayArray9389;
         } else {
            var10 = var4?this.anInt9384 + 100:this.anInt9384;
            var1.aFloatArrayArray9389 = var2.aFloatArrayArray9389 = new float[var10][3];
         }

         for(var10 = 0; var10 < this.anInt9384; ++var10) {
            if(this.aFloatArrayArray9389[var10] != null) {
               var1.aFloatArrayArray9389[var10][0] = this.aFloatArrayArray9389[var10][0];
               var1.aFloatArrayArray9389[var10][1] = this.aFloatArrayArray9389[var10][1];
               var1.aFloatArrayArray9389[var10][2] = this.aFloatArrayArray9389[var10][2];
            }
         }

         if(var2.aFloatArrayArray9390 != null && var2.aFloatArrayArray9390.length >= this.anInt9384) {
            var1.aFloatArrayArray9390 = var2.aFloatArrayArray9390;
         } else {
            var10 = var4?this.anInt9384 + 100:this.anInt9384;
            var1.aFloatArrayArray9390 = var2.aFloatArrayArray9390 = new float[var10][3];
         }

         for(var10 = 0; var10 < this.anInt9384; ++var10) {
            if(this.aFloatArrayArray9390[var10] != null) {
               var1.aFloatArrayArray9390[var10][0] = this.aFloatArrayArray9390[var10][0];
               var1.aFloatArrayArray9390[var10][1] = this.aFloatArrayArray9390[var10][1];
               var1.aFloatArrayArray9390[var10][2] = this.aFloatArrayArray9390[var10][2];
            }
         }
      } else {
         var1.aFloatArrayArray9389 = this.aFloatArrayArray9389;
         var1.aFloatArrayArray9390 = this.aFloatArrayArray9390;
      }

      var1.anIntArrayArray9369 = this.anIntArrayArray9369;
      var1.anIntArrayArray9407 = this.anIntArrayArray9407;
      var1.anIntArrayArray9419 = this.anIntArrayArray9419;
      var1.aShortArray9381 = this.aShortArray9381;
      var1.aShortArray9404 = this.aShortArray9404;
      var1.aByteArray9400 = this.aByteArray9400;
      var1.aShortArray9386 = this.aShortArray9386;
      var1.aShortArray9399 = this.aShortArray9399;
      var1.aShortArray9388 = this.aShortArray9388;
      var1.aClass182Array9414 = this.aClass182Array9414;
      var1.aClass141Array9415 = this.aClass141Array9415;
      var1.aClass100Array9417 = this.aClass100Array9417;
      var1.aShortArray9365 = this.aShortArray9365;
      var1.anInt9373 = var3;
      return var1;
   }

   public void method2046(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9381 != null) {
         Class115 var4 = this.aClass174_Sub1_9403.method8502(Thread.currentThread());
         Class445 var5 = var4.aClass445_1388;
         var5.method5242(var1);
         if(var3) {
            var5.method5224();
         }

         Class433 var6 = var4.aClass433_1389;
         var6.method5110(var5);
         float[] var7 = new float[3];

         for(int var8 = 0; var8 < this.anInt9370; ++var8) {
            if((var2 & this.aShortArray9381[var8]) != 0) {
               var6.method5089((float)this.anIntArray9405[var8], (float)this.anIntArray9360[var8], (float)this.anIntArray9380[var8], var7);
               this.anIntArray9405[var8] = (int)var7[0];
               this.anIntArray9360[var8] = (int)var7[1];
               this.anIntArray9380[var8] = (int)var7[2];
            }
         }

      }
   }

   void method8583(boolean var1) {
      if(this.anInt9392 == 1) {
         this.method8562();
      } else if(this.anInt9392 == 2) {
         if((this.anInt9373 & 618648) == 0 && this.aFloatArrayArray9389 == null) {
            this.aShortArray9408 = null;
         }

         if(var1) {
            this.aByteArray9433 = null;
         }

      } else {
         this.method8556();
         int var2 = this.aClass174_Sub1_9403.anInt9251 * 1023596879;
         int var3 = this.aClass174_Sub1_9403.anInt9252 * 904756235;
         int var4 = this.aClass174_Sub1_9403.anInt9253 * -2070967197;
         int var5 = this.aClass174_Sub1_9403.anInt9256 * 1324304329 >> 8;
         int var6 = 0;
         int var7 = 0;
         if(this.anInt9375 != 0) {
            var6 = this.aClass174_Sub1_9403.anInt9254 * -1362935552 / this.anInt9375;
            var7 = this.aClass174_Sub1_9403.anInt9255 * 1893216512 / this.anInt9375;
         }

         if(this.anIntArray9445 == null) {
            this.anIntArray9445 = new int[this.anInt9384];
            this.anIntArray9437 = new int[this.anInt9384];
            this.anIntArray9393 = new int[this.anInt9384];
         }

         for(int var8 = 0; var8 < this.anInt9384; ++var8) {
            byte var9;
            if(this.aByteArray9433 == null) {
               var9 = 0;
            } else {
               var9 = this.aByteArray9433[var8];
            }

            byte var10;
            if(this.aByteArray9409 == null) {
               var10 = 0;
            } else {
               var10 = this.aByteArray9409[var8];
            }

            short var11;
            if(this.aShortArray9402 == null) {
               var11 = -1;
            } else {
               var11 = this.aShortArray9402[var8];
            }

            if(var10 == -2) {
               var9 = 3;
            }

            if(var10 == -1) {
               var9 = 2;
            }

            int var12;
            int var18;
            if(var11 == -1) {
               int var16;
               int var17;
               short var19;
               int var21;
               if(var9 != 0) {
                  if(var9 == 1) {
                     var12 = this.aShortArray9408[var8] & '\uffff';
                     var21 = (var12 & 127) * this.anInt9436 >> 7;
                     var19 = Class616.method7307(var12 & -128 | var21, -761579367);
                     Class112 var23 = this.aClass112Array9398[var8];
                     var18 = var2 * var23.anInt1357 + var3 * var23.anInt1356 + var4 * var23.anInt1358 >> 16;
                     var16 = var18 > 256?var6:var7;
                     var17 = (var5 >> 1) + (var16 * var18 >> 17);
                     this.anIntArray9445[var8] = var17 << 17 | Class553.method6670(var19, var17, (byte)-17);
                     this.anIntArray9393[var8] = -1;
                  } else if(var9 == 3) {
                     this.anIntArray9445[var8] = 128;
                     this.anIntArray9393[var8] = -1;
                  } else {
                     this.anIntArray9393[var8] = -2;
                  }
               } else {
                  var12 = this.aShortArray9408[var8] & '\uffff';
                  var21 = (var12 & 127) * this.anInt9436 >> 7;
                  var19 = Class616.method7307(var12 & -128 | var21, -1471170298);
                  Class98 var22;
                  if(this.aClass98Array9383 != null && this.aClass98Array9383[this.aShortArray9386[var8]] != null) {
                     var22 = this.aClass98Array9383[this.aShortArray9386[var8]];
                  } else {
                     var22 = this.aClass98Array9420[this.aShortArray9386[var8]];
                  }

                  var16 = (var2 * var22.anInt1184 + var3 * var22.anInt1185 + var4 * var22.anInt1183) / var22.anInt1186 >> 16;
                  var17 = var16 > 256?var6:var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.anIntArray9445[var8] = var18 << 17 | Class553.method6670(var19, var18, (byte)-12);
                  if(this.aClass98Array9383 != null && this.aClass98Array9383[this.aShortArray9399[var8]] != null) {
                     var22 = this.aClass98Array9383[this.aShortArray9399[var8]];
                  } else {
                     var22 = this.aClass98Array9420[this.aShortArray9399[var8]];
                  }

                  var16 = (var2 * var22.anInt1184 + var3 * var22.anInt1185 + var4 * var22.anInt1183) / var22.anInt1186 >> 16;
                  var17 = var16 > 256?var6:var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.anIntArray9437[var8] = var18 << 17 | Class553.method6670(var19, var18, (byte)-120);
                  if(this.aClass98Array9383 != null && this.aClass98Array9383[this.aShortArray9388[var8]] != null) {
                     var22 = this.aClass98Array9383[this.aShortArray9388[var8]];
                  } else {
                     var22 = this.aClass98Array9420[this.aShortArray9388[var8]];
                  }

                  var16 = (var2 * var22.anInt1184 + var3 * var22.anInt1185 + var4 * var22.anInt1183) / var22.anInt1186 >> 16;
                  var17 = var16 > 256?var6:var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.anIntArray9393[var8] = var18 << 17 | Class553.method6670(var19, var18, (byte)-13);
               }
            } else {
               var12 = this.aShortArray9408[var8] & '\uffff';
               int var14;
               int var15;
               if(var9 != 0) {
                  if(var9 == 1) {
                     Class112 var20 = this.aClass112Array9398[var8];
                     var14 = var2 * var20.anInt1357 + var3 * var20.anInt1356 + var4 * var20.anInt1358 >> 16;
                     var15 = var14 > 256?var6:var7;
                     var18 = this.method8561((var5 >> 2) + (var15 * var14 >> 18));
                     this.anIntArray9445[var8] = var18 << 24 | this.method8560(var12, var11, var18);
                     this.anIntArray9393[var8] = -1;
                  } else {
                     this.anIntArray9393[var8] = -2;
                  }
               } else {
                  Class98 var13;
                  if(this.aClass98Array9383 != null && this.aClass98Array9383[this.aShortArray9386[var8]] != null) {
                     var13 = this.aClass98Array9383[this.aShortArray9386[var8]];
                  } else {
                     var13 = this.aClass98Array9420[this.aShortArray9386[var8]];
                  }

                  var15 = (var2 * var13.anInt1184 + var3 * var13.anInt1185 + var4 * var13.anInt1183) / var13.anInt1186 >> 16;
                  var18 = var15 > 256?var6:var7;
                  var14 = this.method8561((var5 >> 2) + (var18 * var15 >> 18));
                  this.anIntArray9445[var8] = var14 << 24 | this.method8560(var12, var11, var14);
                  if(this.aClass98Array9383 != null && this.aClass98Array9383[this.aShortArray9399[var8]] != null) {
                     var13 = this.aClass98Array9383[this.aShortArray9399[var8]];
                  } else {
                     var13 = this.aClass98Array9420[this.aShortArray9399[var8]];
                  }

                  var15 = (var2 * var13.anInt1184 + var3 * var13.anInt1185 + var4 * var13.anInt1183) / var13.anInt1186 >> 16;
                  var18 = var15 > 256?var6:var7;
                  var14 = this.method8561((var5 >> 2) + (var18 * var15 >> 18));
                  this.anIntArray9437[var8] = var14 << 24 | this.method8560(var12, var11, var14);
                  if(this.aClass98Array9383 != null && this.aClass98Array9383[this.aShortArray9388[var8]] != null) {
                     var13 = this.aClass98Array9383[this.aShortArray9388[var8]];
                  } else {
                     var13 = this.aClass98Array9420[this.aShortArray9388[var8]];
                  }

                  var15 = (var2 * var13.anInt1184 + var3 * var13.anInt1185 + var4 * var13.anInt1183) / var13.anInt1186 >> 16;
                  var18 = var15 > 256?var6:var7;
                  var14 = this.method8561((var5 >> 2) + (var18 * var15 >> 18));
                  this.anIntArray9393[var8] = var14 << 24 | this.method8560(var12, var11, var14);
               }
            }
         }

         this.aClass98Array9420 = null;
         this.aClass98Array9383 = null;
         this.aClass112Array9398 = null;
         if((this.anInt9373 & 618648) == 0 && this.aFloatArrayArray9389 == null) {
            this.aShortArray9408 = null;
         }

         if(var1) {
            this.aByteArray9433 = null;
         }

         this.anInt9392 = 2;
      }
   }

   public void method2048(Class445 var1, Class164 var2, int var3) {
      this.method8576(var1, var2, var3);
   }

   public int method2117() {
      return this.anInt9436;
   }

   public boolean method1982() {
      return this.aBool9431;
   }

   void method8584() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.anInt9376; ++var2) {
            int var3 = this.anIntArray9405[var2];
            this.anIntArray9405[var2] = this.anIntArray9380[var2];
            this.anIntArray9380[var2] = -var3;
         }

         this.method8563();
      }
   }

   public int method1983() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9387;
   }

   void method8585() {
      for(int var1 = 0; var1 < this.anInt9384; ++var1) {
         short var2 = this.aShortArray9402 != null?this.aShortArray9402[var1]:-1;
         if(var2 == -1) {
            int var3 = this.aShortArray9408[var1] & '\uffff';
            int var4 = (var3 & 127) * this.anInt9436 >> 7;
            short var6 = Class616.method7307(var3 & -128 | var4, 372229279);
            int var5;
            if(this.anIntArray9393[var1] == -1) {
               var5 = this.anIntArray9445[var1] & -131072;
               this.anIntArray9445[var1] = var5 | Class553.method6670(var6, var5 >> 17, (byte)-82);
            } else if(this.anIntArray9393[var1] != -2) {
               var5 = this.anIntArray9445[var1] & -131072;
               this.anIntArray9445[var1] = var5 | Class553.method6670(var6, var5 >> 17, (byte)-113);
               var5 = this.anIntArray9437[var1] & -131072;
               this.anIntArray9437[var1] = var5 | Class553.method6670(var6, var5 >> 17, (byte)-63);
               var5 = this.anIntArray9393[var1] & -131072;
               this.anIntArray9393[var1] = var5 | Class553.method6670(var6, var5 >> 17, (byte)-79);
            }
         }
      }

      this.anInt9392 = 2;
   }

   public int method2083() {
      return this.anInt9375;
   }

   public boolean method2116(int var1, int var2, Class445 var3, boolean var4, int var5) {
      this.method8559(this.aClass174_Sub1_9403.method8502(Thread.currentThread()));
      Class433 var6 = this.aClass115_9362.aClass433_1389;
      var6.method5110(var3);
      Class433 var7 = this.aClass115_9362.aClass433_1390;
      var7.method5083(var6);
      var7.method5085(this.aClass174_Sub1_9403.aClass433_9240);
      boolean var8 = false;
      int var9 = Integer.MAX_VALUE;
      int var10 = Integer.MIN_VALUE;
      int var11 = Integer.MAX_VALUE;
      int var12 = Integer.MIN_VALUE;
      if(!this.aBool9363) {
         this.method8575();
      }

      int var13 = this.aShort9426 - this.aShort9425 >> 1;
      int var14 = this.aShort9424 - this.aShort9423 >> 1;
      int var15 = this.aShort9428 - this.aShort9387 >> 1;
      int var16 = this.aShort9425 + var13;
      int var17 = this.aShort9423 + var14;
      int var18 = this.aShort9387 + var15;
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var18 - (var15 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      int var24 = var18 + (var15 << var5);
      this.anIntArray9378[0] = var19;
      this.anIntArray9432[0] = var20;
      this.anIntArray9427[0] = var21;
      this.anIntArray9378[1] = var22;
      this.anIntArray9432[1] = var20;
      this.anIntArray9427[1] = var21;
      this.anIntArray9378[2] = var19;
      this.anIntArray9432[2] = var23;
      this.anIntArray9427[2] = var21;
      this.anIntArray9378[3] = var22;
      this.anIntArray9432[3] = var23;
      this.anIntArray9427[3] = var21;
      this.anIntArray9378[4] = var19;
      this.anIntArray9432[4] = var20;
      this.anIntArray9427[4] = var24;
      this.anIntArray9378[5] = var22;
      this.anIntArray9432[5] = var20;
      this.anIntArray9427[5] = var24;
      this.anIntArray9378[6] = var19;
      this.anIntArray9432[6] = var23;
      this.anIntArray9427[6] = var24;
      this.anIntArray9378[7] = var22;
      this.anIntArray9432[7] = var23;
      this.anIntArray9427[7] = var24;

      int var25;
      int var26;
      int var27;
      int var28;
      float var29;
      float var30;
      float var31;
      float var32;
      for(var25 = 0; var25 < 8; ++var25) {
         var26 = this.anIntArray9378[var25];
         var27 = this.anIntArray9432[var25];
         var28 = this.anIntArray9427[var25];
         var29 = var7.aFloatArray4841[2] * (float)var26 + var7.aFloatArray4841[6] * (float)var27 + var7.aFloatArray4841[10] * (float)var28 + var7.aFloatArray4841[14];
         var30 = var7.aFloatArray4841[3] * (float)var26 + var7.aFloatArray4841[7] * (float)var27 + var7.aFloatArray4841[11] * (float)var28 + var7.aFloatArray4841[15];
         if(var29 >= -var30) {
            var31 = var7.aFloatArray4841[0] * (float)var26 + var7.aFloatArray4841[4] * (float)var27 + var7.aFloatArray4841[8] * (float)var28 + var7.aFloatArray4841[12];
            var32 = var7.aFloatArray4841[1] * (float)var26 + var7.aFloatArray4841[5] * (float)var27 + var7.aFloatArray4841[9] * (float)var28 + var7.aFloatArray4841[13];
            int var33 = (int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var31 / var30);
            int var34 = (int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var32 / var30);
            if(var33 < var9) {
               var9 = var33;
            }

            if(var33 > var10) {
               var10 = var33;
            }

            if(var34 < var11) {
               var11 = var34;
            }

            if(var34 > var12) {
               var12 = var34;
            }

            var8 = true;
         }
      }

      if(var8 && var1 > var9 && var1 < var10 && var2 > var11 && var2 < var12) {
         if(var4) {
            return true;
         }

         for(var25 = 0; var25 < this.anInt9376; ++var25) {
            var26 = this.anIntArray9405[var25];
            var27 = this.anIntArray9360[var25];
            var28 = this.anIntArray9380[var25];
            var29 = var7.aFloatArray4841[2] * (float)var26 + var7.aFloatArray4841[6] * (float)var27 + var7.aFloatArray4841[10] * (float)var28 + var7.aFloatArray4841[14];
            var30 = var7.aFloatArray4841[3] * (float)var26 + var7.aFloatArray4841[7] * (float)var27 + var7.aFloatArray4841[11] * (float)var28 + var7.aFloatArray4841[15];
            if(var29 >= -var30) {
               var31 = var7.aFloatArray4841[0] * (float)var26 + var7.aFloatArray4841[4] * (float)var27 + var7.aFloatArray4841[8] * (float)var28 + var7.aFloatArray4841[12];
               var32 = var7.aFloatArray4841[1] * (float)var26 + var7.aFloatArray4841[5] * (float)var27 + var7.aFloatArray4841[9] * (float)var28 + var7.aFloatArray4841[13];
               this.aFloatArray9444[var25] = (float)((int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var31 / var30));
               this.aFloatArray9397[var25] = (float)((int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var32 / var30));
            } else {
               this.aFloatArray9444[var25] = -999999.0F;
            }
         }

         for(var25 = 0; var25 < this.anInt9385; ++var25) {
            if(this.aFloatArray9444[this.aShortArray9386[var25]] != -999999.0F && this.aFloatArray9444[this.aShortArray9399[var25]] != -999999.0F && this.aFloatArray9444[this.aShortArray9388[var25]] != -999999.0F && this.method8574(var1, var2, this.aFloatArray9397[this.aShortArray9386[var25]], this.aFloatArray9397[this.aShortArray9399[var25]], this.aFloatArray9397[this.aShortArray9388[var25]], this.aFloatArray9444[this.aShortArray9386[var25]], this.aFloatArray9444[this.aShortArray9399[var25]], this.aFloatArray9444[this.aShortArray9388[var25]])) {
               return true;
            }
         }
      }

      return false;
   }

   public void method2015(int var1) {
      if((this.anInt9373 & 3) != 3) {
         throw new IllegalStateException();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9360[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
               this.anIntArray9405[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   Class168_Sub3(Class174_Sub1 var1) {
      this.aClass174_Sub1_9403 = var1;
   }

   public void method1942(Class445 var1) {
      this.method8559(this.aClass174_Sub1_9403.method8502(Thread.currentThread()));
      Class433 var2 = this.aClass115_9362.aClass433_1389;
      var2.method5110(var1);
      int var3;
      if(this.aClass182Array9414 != null) {
         for(var3 = 0; var3 < this.aClass182Array9414.length; ++var3) {
            Class182 var4 = this.aClass182Array9414[var3];
            Class182 var5 = var4;
            if(var4.aClass182_2080 != null) {
               var5 = var4.aClass182_2080;
            }

            var5.anInt2093 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var4.anInt2086 * -1235344453]) * -1678451107;
            var5.anInt2083 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var4.anInt2086 * -1235344453]) * -670678921;
            var5.anInt2085 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var4.anInt2086 * -1235344453] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var4.anInt2086 * -1235344453]) * 438141997;
            var5.anInt2087 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var4.anInt2088 * -1119018737]) * 380933187;
            var5.anInt2090 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var4.anInt2088 * -1119018737]) * -1991830625;
            var5.anInt2091 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var4.anInt2088 * -1119018737] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var4.anInt2088 * -1119018737]) * -1592918039;
            var5.anInt2092 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var4.anInt2084 * 724817697] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var4.anInt2084 * 724817697] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var4.anInt2084 * 724817697]) * -2133088645;
            var5.anInt2079 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var4.anInt2084 * 724817697] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var4.anInt2084 * 724817697] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var4.anInt2084 * 724817697]) * -615490343;
            var5.anInt2094 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var4.anInt2084 * 724817697] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var4.anInt2084 * 724817697] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var4.anInt2084 * 724817697]) * -1023720607;
         }
      }

      if(this.aClass141Array9415 != null) {
         for(var3 = 0; var3 < this.aClass141Array9415.length; ++var3) {
            Class141 var6 = this.aClass141Array9415[var3];
            Class141 var7 = var6;
            if(var6.aClass141_1666 != null) {
               var7 = var6.aClass141_1666;
            }

            if(var6.aClass433_1665 != null) {
               var6.aClass433_1665.method5083(var2);
            } else {
               var6.aClass433_1665 = new Class433(var2);
            }

            var7.anInt1668 = (int)(var2.aFloatArray4841[12] + var2.aFloatArray4841[0] * (float)this.anIntArray9405[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[4] * (float)this.anIntArray9360[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[8] * (float)this.anIntArray9380[var6.anInt1667 * -1043750635]) * -1843315017;
            var7.anInt1670 = (int)(var2.aFloatArray4841[13] + var2.aFloatArray4841[1] * (float)this.anIntArray9405[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[5] * (float)this.anIntArray9360[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[9] * (float)this.anIntArray9380[var6.anInt1667 * -1043750635]) * -1977850275;
            var7.anInt1669 = (int)(var2.aFloatArray4841[14] + var2.aFloatArray4841[2] * (float)this.anIntArray9405[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[6] * (float)this.anIntArray9360[var6.anInt1667 * -1043750635] + var2.aFloatArray4841[10] * (float)this.anIntArray9380[var6.anInt1667 * -1043750635]) * 874542269;
         }
      }

   }

   final void method8586(boolean var1, boolean var2, boolean var3, int var4) {
      boolean var5 = false;
      if(this.aShortArray9402 != null && this.aShortArray9402[var4] != -1) {
         var5 = this.aClass174_Sub1_9403.aClass169_2035.method2122(this.aShortArray9402[var4] & '\uffff', (byte)-53).aBool1987;
      }

      short var6;
      short var7;
      short var8;
      float var10;
      float var11;
      if(!this.aClass115_9362.aBool1381) {
         var6 = this.aShortArray9386[var4];
         var7 = this.aShortArray9399[var4];
         var8 = this.aShortArray9388[var4];
         Class433 var9 = this.aClass174_Sub1_9403.aClass433_9260;
         var10 = var9.aFloatArray4841[10];
         var11 = var9.aFloatArray4841[14];
         float var12 = var9.aFloatArray4841[11];
         float var13 = var9.aFloatArray4841[15];
         float var14 = var11 * var12 - var10 * var13;
         float var15 = (this.aFloatArray9441[var6] - this.aClass115_9362.aFloat1407) * this.aClass115_9362.aFloat1408;
         float var16 = (this.aFloatArray9441[var7] - this.aClass115_9362.aFloat1407) * this.aClass115_9362.aFloat1408;
         float var17 = (this.aFloatArray9441[var8] - this.aClass115_9362.aFloat1407) * this.aClass115_9362.aFloat1408;
         float var18 = var15 * var14 / (var15 * var12 - var10);
         float var19 = var16 * var14 / (var16 * var12 - var10);
         float var20 = var17 * var14 / (var17 * var12 - var10);
         float var21 = (var18 - this.aClass115_9362.aFloat1377) / this.aClass115_9362.aFloat1378;
         if(var21 > 1.0F) {
            var21 = 1.0F;
         } else if(var21 < 0.0F) {
            var21 = 0.0F;
         }

         float var22 = (var19 - this.aClass115_9362.aFloat1377) / this.aClass115_9362.aFloat1378;
         if(var22 > 1.0F) {
            var22 = 1.0F;
         } else if(var22 < 0.0F) {
            var22 = 0.0F;
         }

         float var23 = (var20 - this.aClass115_9362.aFloat1377) / this.aClass115_9362.aFloat1378;
         if(var23 > 1.0F) {
            var23 = 1.0F;
         } else if(var23 < 0.0F) {
            var23 = 0.0F;
         }

         float var24 = var21 + var22 + var23;
         if(var24 >= 3.0F) {
            return;
         }

         if(var24 <= 0.0F) {
            this.method8573(var1, var2, var3, var4);
            return;
         }

         if(this.aByteArray9409 == null) {
            this.aClass121_9364.anInt1543 = 0;
         } else {
            this.aClass121_9364.anInt1543 = this.aByteArray9409[var4] & 255;
         }

         if(!var5) {
            if(this.anIntArray9393[var4] == -1) {
               this.aClass121_9364.method1469(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var21 * 255.0F, -67884257), Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var22 * 255.0F, -1219719595), Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var23 * 255.0F, -1783276340));
            } else {
               this.aClass121_9364.method1469(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var21 * 255.0F, -71032435), Class300.method3992(Class87.anIntArray855[this.anIntArray9437[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var22 * 255.0F, -1016632273), Class300.method3992(Class87.anIntArray855[this.anIntArray9393[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var23 * 255.0F, -1539826961));
            }
         } else {
            int var25 = -16777216;
            if(this.aByteArray9409 != null) {
               var25 = 255 - (this.aByteArray9409[var4] & 255) << 24;
            }

            if(this.anIntArray9393[var4] == -1) {
               int var26 = var25 | this.anIntArray9445[var4] & 16777215;
               this.aClass121_9364.method1461(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], this.aFloatArray9438[var6], this.aFloatArray9438[var7], this.aFloatArray9438[var8], this.aFloatArrayArray9389[var4][0], this.aFloatArrayArray9389[var4][1], this.aFloatArrayArray9389[var4][2], this.aFloatArrayArray9390[var4][0], this.aFloatArrayArray9390[var4][1], this.aFloatArrayArray9390[var4][2], var26, var26, var26, this.aClass115_9362.anInt1379 * 1196864617, var21 * 255.0F, var22 * 255.0F, var23 * 255.0F, this.aShortArray9402[var4] & '\uffff');
            } else {
               this.aClass121_9364.method1461(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], this.aFloatArray9438[var6], this.aFloatArray9438[var7], this.aFloatArray9438[var8], this.aFloatArrayArray9389[var4][0], this.aFloatArrayArray9389[var4][1], this.aFloatArrayArray9389[var4][2], this.aFloatArrayArray9390[var4][0], this.aFloatArrayArray9390[var4][1], this.aFloatArrayArray9390[var4][2], var25 | this.anIntArray9445[var4] & 16777215, var25 | this.anIntArray9437[var4] & 16777215, var25 | this.anIntArray9393[var4] & 16777215, this.aClass115_9362.anInt1379 * 1196864617, var21 * 255.0F, var22 * 255.0F, var23 * 255.0F, this.aShortArray9402[var4] & '\uffff');
            }
         }
      } else {
         var6 = this.aShortArray9386[var4];
         var7 = this.aShortArray9399[var4];
         var8 = this.aShortArray9388[var4];
         float var27 = 0.0F;
         var10 = 0.0F;
         var11 = 0.0F;
         if(this.anIntArray9434[var6] > this.aClass115_9362.anInt1416 * -89448875) {
            var27 = 1.0F;
         } else if(this.anIntArray9434[var6] > this.aClass115_9362.anInt1412 * -707337401) {
            var27 = (float)(this.aClass115_9362.anInt1412 * -707337401 - this.anIntArray9434[var6]) * 1.0F / (float)(this.aClass115_9362.anInt1412 * -707337401 - this.aClass115_9362.anInt1416 * -89448875);
         }

         if(this.anIntArray9434[var7] > this.aClass115_9362.anInt1416 * -89448875) {
            var10 = 1.0F;
         } else if(this.anIntArray9434[var7] > this.aClass115_9362.anInt1412 * -707337401) {
            var10 = (float)(this.aClass115_9362.anInt1412 * -707337401 - this.anIntArray9434[var7]) * 1.0F / (float)(this.aClass115_9362.anInt1412 * -707337401 - this.aClass115_9362.anInt1416 * -89448875);
         }

         if(this.anIntArray9434[var8] > this.aClass115_9362.anInt1416 * -89448875) {
            var11 = 1.0F;
         } else if(this.anIntArray9434[var8] > this.aClass115_9362.anInt1412 * -707337401) {
            var11 = (float)(this.aClass115_9362.anInt1412 * -707337401 - this.anIntArray9434[var8]) * 1.0F / (float)(this.aClass115_9362.anInt1412 * -707337401 - this.aClass115_9362.anInt1416 * -89448875);
         }

         if(this.aByteArray9409 == null) {
            this.aClass121_9364.anInt1543 = 0;
         } else {
            this.aClass121_9364.anInt1543 = this.aByteArray9409[var4] & 255;
         }

         if(!var5) {
            if(this.anIntArray9393[var4] == -1) {
               this.aClass121_9364.method1469(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var27 * 255.0F, -328548427), Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var10 * 255.0F, 145007417), Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var11 * 255.0F, 230605873));
            } else {
               this.aClass121_9364.method1469(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], Class300.method3992(Class87.anIntArray855[this.anIntArray9445[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var27 * 255.0F, 1108077819), Class300.method3992(Class87.anIntArray855[this.anIntArray9437[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var10 * 255.0F, 66319279), Class300.method3992(Class87.anIntArray855[this.anIntArray9393[var4] & '\uffff'], this.aClass115_9362.anInt1379 * 1196864617, var11 * 255.0F, 1016239925));
            }
         } else {
            int var28 = -16777216;
            if(this.aByteArray9409 != null) {
               var28 = 255 - (this.aByteArray9409[var4] & 255) << 24;
            }

            if(this.anIntArray9393[var4] == -1) {
               int var29 = var28 | this.anIntArray9445[var4] & 16777215;
               this.aClass121_9364.method1461(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], this.aFloatArray9438[var6], this.aFloatArray9438[var7], this.aFloatArray9438[var8], this.aFloatArrayArray9389[var4][0], this.aFloatArrayArray9389[var4][1], this.aFloatArrayArray9389[var4][2], this.aFloatArrayArray9390[var4][0], this.aFloatArrayArray9390[var4][1], this.aFloatArrayArray9390[var4][2], var29, var29, var29, this.aClass115_9362.anInt1379 * 1196864617, var27 * 255.0F, var10 * 255.0F, var11 * 255.0F, this.aShortArray9402[var4] & '\uffff');
            } else {
               this.aClass121_9364.method1461(var1, var2, var3, this.aFloatArray9397[var6], this.aFloatArray9397[var7], this.aFloatArray9397[var8], this.aFloatArray9444[var6], this.aFloatArray9444[var7], this.aFloatArray9444[var8], this.aFloatArray9441[var6], this.aFloatArray9441[var7], this.aFloatArray9441[var8], this.aFloatArray9438[var6], this.aFloatArray9438[var7], this.aFloatArray9438[var8], this.aFloatArrayArray9389[var4][0], this.aFloatArrayArray9389[var4][1], this.aFloatArrayArray9389[var4][2], this.aFloatArrayArray9390[var4][0], this.aFloatArrayArray9390[var4][1], this.aFloatArrayArray9390[var4][2], var28 | this.anIntArray9445[var4] & 16777215, var28 | this.anIntArray9437[var4] & 16777215, var28 | this.anIntArray9393[var4] & 16777215, this.aClass115_9362.anInt1379 * 1196864617, var27 * 255.0F, var10 * 255.0F, var11 * 255.0F, this.aShortArray9402[var4] & '\uffff');
            }
         }
      }

   }

   public Class526_Sub21_Sub5 method2060(Class526_Sub21_Sub5 var1) {
      return null;
   }

   public void method2054() {
      if(!this.aBool9429) {
         if(!this.aBool9363) {
            this.method8575();
         }

         this.aShort9435 = this.aShort9423;
         this.aBool9429 = true;
      }

   }

   public void method2055() {
      if(!this.aBool9429) {
         if(!this.aBool9363) {
            this.method8575();
         }

         this.aShort9435 = this.aShort9423;
         this.aBool9429 = true;
      }

   }

   public void method2056() {
      if(!this.aBool9429) {
         if(!this.aBool9363) {
            this.method8575();
         }

         this.aShort9435 = this.aShort9423;
         this.aBool9429 = true;
      }

   }

   public int method2057() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9421;
   }

   public int method2017() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9421;
   }

   public void method2011(int var1) {
      if((this.anInt9373 & 5) != 5) {
         throw new IllegalStateException();
      } else if(var1 == 4096) {
         this.method8584();
      } else if(var1 == 8192) {
         this.method8564();
      } else if(var1 == 12288) {
         this.method8565();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
               this.anIntArray9405[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   public int method1981() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9423;
   }

   public boolean method1975(int var1, int var2, Class445 var3, boolean var4, int var5) {
      this.method8559(this.aClass174_Sub1_9403.method8502(Thread.currentThread()));
      Class433 var6 = this.aClass115_9362.aClass433_1389;
      var6.method5110(var3);
      Class433 var7 = this.aClass115_9362.aClass433_1390;
      var7.method5083(var6);
      var7.method5085(this.aClass174_Sub1_9403.aClass433_9240);
      boolean var8 = false;
      int var9 = Integer.MAX_VALUE;
      int var10 = Integer.MIN_VALUE;
      int var11 = Integer.MAX_VALUE;
      int var12 = Integer.MIN_VALUE;
      if(!this.aBool9363) {
         this.method8575();
      }

      int var13 = this.aShort9426 - this.aShort9425 >> 1;
      int var14 = this.aShort9424 - this.aShort9423 >> 1;
      int var15 = this.aShort9428 - this.aShort9387 >> 1;
      int var16 = this.aShort9425 + var13;
      int var17 = this.aShort9423 + var14;
      int var18 = this.aShort9387 + var15;
      int var19 = var16 - (var13 << var5);
      int var20 = var17 - (var14 << var5);
      int var21 = var18 - (var15 << var5);
      int var22 = var16 + (var13 << var5);
      int var23 = var17 + (var14 << var5);
      int var24 = var18 + (var15 << var5);
      this.anIntArray9378[0] = var19;
      this.anIntArray9432[0] = var20;
      this.anIntArray9427[0] = var21;
      this.anIntArray9378[1] = var22;
      this.anIntArray9432[1] = var20;
      this.anIntArray9427[1] = var21;
      this.anIntArray9378[2] = var19;
      this.anIntArray9432[2] = var23;
      this.anIntArray9427[2] = var21;
      this.anIntArray9378[3] = var22;
      this.anIntArray9432[3] = var23;
      this.anIntArray9427[3] = var21;
      this.anIntArray9378[4] = var19;
      this.anIntArray9432[4] = var20;
      this.anIntArray9427[4] = var24;
      this.anIntArray9378[5] = var22;
      this.anIntArray9432[5] = var20;
      this.anIntArray9427[5] = var24;
      this.anIntArray9378[6] = var19;
      this.anIntArray9432[6] = var23;
      this.anIntArray9427[6] = var24;
      this.anIntArray9378[7] = var22;
      this.anIntArray9432[7] = var23;
      this.anIntArray9427[7] = var24;

      int var25;
      int var26;
      int var27;
      int var28;
      float var29;
      float var30;
      float var31;
      float var32;
      for(var25 = 0; var25 < 8; ++var25) {
         var26 = this.anIntArray9378[var25];
         var27 = this.anIntArray9432[var25];
         var28 = this.anIntArray9427[var25];
         var29 = var7.aFloatArray4841[2] * (float)var26 + var7.aFloatArray4841[6] * (float)var27 + var7.aFloatArray4841[10] * (float)var28 + var7.aFloatArray4841[14];
         var30 = var7.aFloatArray4841[3] * (float)var26 + var7.aFloatArray4841[7] * (float)var27 + var7.aFloatArray4841[11] * (float)var28 + var7.aFloatArray4841[15];
         if(var29 >= -var30) {
            var31 = var7.aFloatArray4841[0] * (float)var26 + var7.aFloatArray4841[4] * (float)var27 + var7.aFloatArray4841[8] * (float)var28 + var7.aFloatArray4841[12];
            var32 = var7.aFloatArray4841[1] * (float)var26 + var7.aFloatArray4841[5] * (float)var27 + var7.aFloatArray4841[9] * (float)var28 + var7.aFloatArray4841[13];
            int var33 = (int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var31 / var30);
            int var34 = (int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var32 / var30);
            if(var33 < var9) {
               var9 = var33;
            }

            if(var33 > var10) {
               var10 = var33;
            }

            if(var34 < var11) {
               var11 = var34;
            }

            if(var34 > var12) {
               var12 = var34;
            }

            var8 = true;
         }
      }

      if(var8 && var1 > var9 && var1 < var10 && var2 > var11 && var2 < var12) {
         if(var4) {
            return true;
         }

         for(var25 = 0; var25 < this.anInt9376; ++var25) {
            var26 = this.anIntArray9405[var25];
            var27 = this.anIntArray9360[var25];
            var28 = this.anIntArray9380[var25];
            var29 = var7.aFloatArray4841[2] * (float)var26 + var7.aFloatArray4841[6] * (float)var27 + var7.aFloatArray4841[10] * (float)var28 + var7.aFloatArray4841[14];
            var30 = var7.aFloatArray4841[3] * (float)var26 + var7.aFloatArray4841[7] * (float)var27 + var7.aFloatArray4841[11] * (float)var28 + var7.aFloatArray4841[15];
            if(var29 >= -var30) {
               var31 = var7.aFloatArray4841[0] * (float)var26 + var7.aFloatArray4841[4] * (float)var27 + var7.aFloatArray4841[8] * (float)var28 + var7.aFloatArray4841[12];
               var32 = var7.aFloatArray4841[1] * (float)var26 + var7.aFloatArray4841[5] * (float)var27 + var7.aFloatArray4841[9] * (float)var28 + var7.aFloatArray4841[13];
               this.aFloatArray9444[var25] = (float)((int)(this.aClass174_Sub1_9403.aFloat9278 + this.aClass174_Sub1_9403.aFloat9266 * var31 / var30));
               this.aFloatArray9397[var25] = (float)((int)(this.aClass174_Sub1_9403.aFloat9269 + this.aClass174_Sub1_9403.aFloat9268 * var32 / var30));
            } else {
               this.aFloatArray9444[var25] = -999999.0F;
            }
         }

         for(var25 = 0; var25 < this.anInt9385; ++var25) {
            if(this.aFloatArray9444[this.aShortArray9386[var25]] != -999999.0F && this.aFloatArray9444[this.aShortArray9399[var25]] != -999999.0F && this.aFloatArray9444[this.aShortArray9388[var25]] != -999999.0F && this.method8574(var1, var2, this.aFloatArray9397[this.aShortArray9386[var25]], this.aFloatArray9397[this.aShortArray9399[var25]], this.aFloatArray9397[this.aShortArray9388[var25]], this.aFloatArray9444[this.aShortArray9386[var25]], this.aFloatArray9444[this.aShortArray9399[var25]], this.aFloatArray9444[this.aShortArray9388[var25]])) {
               return true;
            }
         }
      }

      return false;
   }

   public int method2016() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9425;
   }

   public int method1991() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9426;
   }

   public int method2065() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9423;
   }

   public int method1949() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9423;
   }

   public int method2038() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9423;
   }

   public int method2093() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9423;
   }

   public int method1941() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9424;
   }

   public int method2070() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9428;
   }

   public int method2071() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9428;
   }

   public int method2075() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9428;
   }

   public void method2073(int var1) {
      if((this.anInt9373 & 4096) != 4096) {
         throw new IllegalStateException();
      } else {
         this.anInt9436 = var1;
         this.anInt9392 = 0;
      }
   }

   public void method1969(int var1) {
      if((this.anInt9373 & 4096) != 4096) {
         throw new IllegalStateException();
      } else {
         this.anInt9436 = var1;
         this.anInt9392 = 0;
      }
   }

   public void method2021(int var1) {
      if((this.anInt9373 & 8192) != 8192) {
         throw new IllegalStateException();
      } else {
         this.anInt9375 = var1;
         this.anInt9392 = 0;
      }
   }

   public boolean method2097() {
      if(this.aShortArray9402 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9402.length; ++var1) {
            if(this.aShortArray9402[var1] != -1 && !this.aClass174_Sub1_9403.method8495(this.aShortArray9402[var1])) {
               return false;
            }
         }

         return true;
      }
   }

   public int method2077() {
      return this.anInt9436;
   }

   void method8587(Thread var1) {
      Class115 var2 = this.aClass174_Sub1_9403.method8502(var1);
      if(var2 != this.aClass115_9413) {
         this.aClass115_9413 = var2;
         this.aClass168_Sub3Array9416 = this.aClass115_9413.aClass168_Sub3Array1417;
         this.aClass168_Sub3Array9446 = this.aClass115_9413.aClass168_Sub3Array1399;
      }
   }

   public int method1993() {
      return this.anInt9436;
   }

   public int method2047() {
      return this.anInt9436;
   }

   public int method2081() {
      return this.anInt9375;
   }

   public void method2120(short var1, short var2) {
      if(this.aShortArray9402 != null) {
         if(!this.aBool9401 && var2 >= 0) {
            Class171 var3 = this.aClass174_Sub1_9403.aClass169_2035.method2122(var2 & '\uffff', (byte)51);
            if(var3.aByte1986 != 0 || var3.aByte1963 != 0) {
               this.aBool9401 = true;
            }
         }

         for(int var4 = 0; var4 < this.anInt9384; ++var4) {
            if(this.aShortArray9402[var4] == var1) {
               this.aShortArray9402[var4] = var2;
            }
         }

      }
   }

   public int method2114() {
      return this.anInt9375;
   }

   public void method2045(Class445 var1, int var2, boolean var3) {
      if(this.aShortArray9381 != null) {
         Class115 var4 = this.aClass174_Sub1_9403.method8502(Thread.currentThread());
         Class445 var5 = var4.aClass445_1388;
         var5.method5242(var1);
         if(var3) {
            var5.method5224();
         }

         Class433 var6 = var4.aClass433_1389;
         var6.method5110(var5);
         float[] var7 = new float[3];

         for(int var8 = 0; var8 < this.anInt9370; ++var8) {
            if((var2 & this.aShortArray9381[var8]) != 0) {
               var6.method5089((float)this.anIntArray9405[var8], (float)this.anIntArray9360[var8], (float)this.anIntArray9380[var8], var7);
               this.anIntArray9405[var8] = (int)var7[0];
               this.anIntArray9360[var8] = (int)var7[1];
               this.anIntArray9380[var8] = (int)var7[2];
            }
         }

      }
   }

   public byte[] method2085() {
      return this.aByteArray9409;
   }

   void method1971(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         this.anInt9410 = 0;
         this.anInt9411 = 0;
         this.anInt9412 = 0;

         for(var10 = 0; var10 < this.anInt9376; ++var10) {
            this.anInt9410 += this.anIntArray9405[var10];
            this.anInt9411 += this.anIntArray9360[var10];
            this.anInt9412 += this.anIntArray9380[var10];
            ++var5;
         }

         if(var5 > 0) {
            this.anInt9410 = this.anInt9410 / var5 + var2;
            this.anInt9411 = this.anInt9411 / var5 + var3;
            this.anInt9412 = this.anInt9412 / var5 + var4;
         } else {
            this.anInt9410 = var2;
            this.anInt9411 = var3;
            this.anInt9412 = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.anInt9376; ++var5) {
            this.anIntArray9405[var5] += var2;
            this.anIntArray9360[var5] += var3;
            this.anIntArray9380[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] -= this.anInt9410;
               this.anIntArray9360[var5] -= this.anInt9411;
               this.anIntArray9380[var5] -= this.anInt9412;
               if(var4 != 0) {
                  var10 = Class443.anIntArray4895[var4];
                  var7 = Class443.anIntArray4896[var4];
                  var8 = this.anIntArray9360[var5] * var10 + this.anIntArray9405[var5] * var7 + 16383 >> 14;
                  this.anIntArray9360[var5] = this.anIntArray9360[var5] * var7 - this.anIntArray9405[var5] * var10 + 16383 >> 14;
                  this.anIntArray9405[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = Class443.anIntArray4895[var2];
                  var7 = Class443.anIntArray4896[var2];
                  var8 = this.anIntArray9360[var5] * var7 - this.anIntArray9380[var5] * var10 + 16383 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9360[var5] * var10 + this.anIntArray9380[var5] * var7 + 16383 >> 14;
                  this.anIntArray9360[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = Class443.anIntArray4895[var3];
                  var7 = Class443.anIntArray4896[var3];
                  var8 = this.anIntArray9380[var5] * var10 + this.anIntArray9405[var5] * var7 + 16383 >> 14;
                  this.anIntArray9380[var5] = this.anIntArray9380[var5] * var7 - this.anIntArray9405[var5] * var10 + 16383 >> 14;
                  this.anIntArray9405[var5] = var8;
               }

               this.anIntArray9405[var5] += this.anInt9410;
               this.anIntArray9360[var5] += this.anInt9411;
               this.anIntArray9380[var5] += this.anInt9412;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] -= this.anInt9410;
               this.anIntArray9360[var5] -= this.anInt9411;
               this.anIntArray9380[var5] -= this.anInt9412;
               this.anIntArray9405[var5] = this.anIntArray9405[var5] * var2 / 128;
               this.anIntArray9360[var5] = this.anIntArray9360[var5] * var3 / 128;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var4 / 128;
               this.anIntArray9405[var5] += this.anInt9410;
               this.anIntArray9360[var5] += this.anInt9411;
               this.anIntArray9380[var5] += this.anInt9412;
            }

         } else {
            Class100 var11;
            Class99 var12;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.anInt9384; ++var5) {
                  var10 = (this.aByteArray9409[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.aByteArray9409[var5] = (byte)var10;
               }

               if(this.aClass100Array9417 != null) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var11 = this.aClass100Array9417[var5];
                     var12 = this.aClass99Array9418[var5];
                     var12.anInt1191 = (var12.anInt1191 * 487709875 & 16777215 | 255 - (this.aByteArray9409[var11.anInt1201 * -1840934035] & 255) << 24) * -1888472453;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.anInt9384; ++var5) {
                  var10 = this.aShortArray9408[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3;
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

                  this.aShortArray9408[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               this.aBool9391 = true;
               if(this.aClass100Array9417 != null) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var11 = this.aClass100Array9417[var5];
                     var12 = this.aClass99Array9418[var5];
                     var12.anInt1191 = (var12.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var11.anInt1201 * -1840934035] & '\uffff', -601800949) & '\uffff'] & 16777215) * -1888472453;
                  }
               }

            } else {
               Class99 var6;
               if(var1 == 8) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var6 = this.aClass99Array9418[var5];
                     var6.anInt1190 += var2 * -397766141;
                     var6.anInt1196 += var3 * 475388931;
                  }

               } else if(var1 == 10) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var6 = this.aClass99Array9418[var5];
                     var6.aFloat1193 = var6.aFloat1193 * (float)var2 / 128.0F;
                     var6.aFloat1189 = var6.aFloat1189 * (float)var3 / 128.0F;
                  }

               } else if(var1 == 9) {
                  for(var5 = 0; var5 < this.anInt9382; ++var5) {
                     var6 = this.aClass99Array9418[var5];
                     var6.anInt1188 = (var6.anInt1188 * -236039229 + var2 & 16383) * 974959851;
                  }

               }
            }
         }
      }
   }

   public void method2005(int var1) {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
               this.method8558(true);
            }

            this.anInt9373 = var1;
         }
      } else {
         if((this.anInt9373 & 65536) == 65536 && (var1 & 65536) == 0) {
            this.method8558(true);
         }

         this.anInt9373 = var1;
      }

   }

   public void method2121(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9384; ++var3) {
         if(this.aShortArray9408[var3] == var1) {
            this.aShortArray9408[var3] = var2;
         }
      }

      if(this.aClass100Array9417 != null) {
         for(var3 = 0; var3 < this.anInt9382; ++var3) {
            Class100 var4 = this.aClass100Array9417[var3];
            Class99 var5 = this.aClass99Array9418[var3];
            var5.anInt1191 = (var5.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var4.anInt1201 * -1840934035], -221613108) & '\uffff'] & 16777215) * -1888472453;
         }
      }

      if(this.anInt9392 == 2) {
         this.anInt9392 = 1;
      }

   }

   public void method2089(byte var1, byte[] var2) {
      if((this.anInt9373 & 1048576) == 0) {
         throw new RuntimeException();
      } else {
         if(this.aByteArray9409 == null) {
            this.aByteArray9409 = new byte[this.anInt9384];
         }

         int var3;
         if(var2 == null) {
            for(var3 = 0; var3 < this.anInt9384; ++var3) {
               this.aByteArray9409[var3] = var1;
            }
         } else {
            for(var3 = 0; var3 < this.anInt9384; ++var3) {
               int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
               this.aByteArray9409[var3] = (byte)var4;
            }
         }

         if(this.anInt9392 == 2) {
            this.anInt9392 = 1;
         }

      }
   }

   public void method2053(short var1, short var2) {
      if(this.aShortArray9402 != null) {
         if(!this.aBool9401 && var2 >= 0) {
            Class171 var3 = this.aClass174_Sub1_9403.aClass169_2035.method2122(var2 & '\uffff', (byte)-37);
            if(var3.aByte1986 != 0 || var3.aByte1963 != 0) {
               this.aBool9401 = true;
            }
         }

         for(int var4 = 0; var4 < this.anInt9384; ++var4) {
            if(this.aShortArray9402[var4] == var1) {
               this.aShortArray9402[var4] = var2;
            }
         }

      }
   }

   public void method1956() {
      if((this.anInt9373 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.anInt9376; ++var2) {
               this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            }

            if(this.aClass98Array9420 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9420[var2] != null) {
                     this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
                  }
               }
            }

            if(this.aClass98Array9383 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9383[var2] != null) {
                     this.aClass98Array9383[var2].anInt1183 = -this.aClass98Array9383[var2].anInt1183;
                  }
               }
            }

            if(this.aClass112Array9398 != null) {
               for(var2 = 0; var2 < this.anInt9384; ++var2) {
                  if(this.aClass112Array9398[var2] != null) {
                     this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
                  }
               }
            }

            short[] var7 = this.aShortArray9386;
            this.aShortArray9386 = this.aShortArray9388;
            this.aShortArray9388 = var7;
            if(this.aFloatArrayArray9389 != null) {
               for(int var3 = 0; var3 < this.anInt9384; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray9389[var3] != null) {
                     var4 = this.aFloatArrayArray9389[var3][0];
                     this.aFloatArrayArray9389[var3][0] = this.aFloatArrayArray9389[var3][2];
                     this.aFloatArrayArray9389[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray9390[var3] != null) {
                     var4 = this.aFloatArrayArray9390[var3][0];
                     this.aFloatArrayArray9390[var3][0] = this.aFloatArrayArray9390[var3][2];
                     this.aFloatArrayArray9390[var3][2] = var4;
                  }
               }
            }

            this.aBool9363 = false;
            this.anInt9392 = 0;
         }
      }
   }

   void method2111() {
      if(this.aBool9430) {
         for(int var1 = 0; var1 < this.anInt9376; ++var1) {
            this.anIntArray9405[var1] = this.anIntArray9405[var1] + 7 >> 4;
            this.anIntArray9360[var1] = this.anIntArray9360[var1] + 7 >> 4;
            this.anIntArray9380[var1] = this.anIntArray9380[var1] + 7 >> 4;
         }

         this.aBool9430 = false;
      }

      if(this.aBool9391) {
         this.method8562();
         this.aBool9391 = false;
      }

      this.aBool9363 = false;
   }

   public int method2058() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9422;
   }

   public int method2042() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9422;
   }

   public boolean method2095() {
      if(this.aShortArray9402 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9402.length; ++var1) {
            if(this.aShortArray9402[var1] != -1 && !this.aClass174_Sub1_9403.method8495(this.aShortArray9402[var1])) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method2096() {
      if(this.aShortArray9402 == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.aShortArray9402.length; ++var1) {
            if(this.aShortArray9402[var1] != -1 && !this.aClass174_Sub1_9403.method8495(this.aShortArray9402[var1])) {
               return false;
            }
         }

         return true;
      }
   }

   void method2033() {
      if(this.aClass174_Sub1_9403.anInt9249 * 768566339 > 1) {
         synchronized(this) {
            this.aBool1910 = false;
            this.notifyAll();
         }
      }

   }

   public void method2080(int var1, int var2, int var3) {
      if(var1 != 0 && (this.anInt9373 & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 0 && (this.anInt9373 & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 0 && (this.anInt9373 & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               this.anIntArray9405[var5] += var1;
               this.anIntArray9360[var5] += var2;
               this.anIntArray9380[var5] += var3;
            }

         }
      }
   }

   public boolean method2099() {
      return this.aBool9431;
   }

   public boolean method2100() {
      return this.aBool9431;
   }

   public Class182[] method2040() {
      return this.aClass182Array9414;
   }

   public void method1940(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.anInt9384; ++var3) {
         if(this.aShortArray9408[var3] == var1) {
            this.aShortArray9408[var3] = var2;
         }
      }

      if(this.aClass100Array9417 != null) {
         for(var3 = 0; var3 < this.anInt9382; ++var3) {
            Class100 var4 = this.aClass100Array9417[var3];
            Class99 var5 = this.aClass99Array9418[var3];
            var5.anInt1191 = (var5.anInt1191 * 487709875 & -16777216 | Class87.anIntArray855[Class616.method7307(this.aShortArray9408[var4.anInt1201 * -1840934035], -266806620) & '\uffff'] & 16777215) * -1888472453;
         }
      }

      if(this.anInt9392 == 2) {
         this.anInt9392 = 1;
      }

   }

   public boolean method2049() {
      return this.aBool9401;
   }

   public int method2106() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9387;
   }

   public int method2105() {
      if(!this.aBool9363) {
         this.method8575();
      }

      return this.aShort9387;
   }

   public void method1958(int var1) {
      if((this.anInt9373 & 8192) != 8192) {
         throw new IllegalStateException();
      } else {
         this.anInt9375 = var1;
         this.anInt9392 = 0;
      }
   }

   public int method2107() {
      if(!this.aBool9429) {
         this.method1986();
      }

      return this.aShort9435;
   }

   public int method2108() {
      if(!this.aBool9429) {
         this.method1986();
      }

      return this.aShort9435;
   }

   public void method2024() {
      if((this.anInt9373 & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.anInt9376; ++var2) {
               this.anIntArray9380[var2] = -this.anIntArray9380[var2];
            }

            if(this.aClass98Array9420 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9420[var2] != null) {
                     this.aClass98Array9420[var2].anInt1183 = -this.aClass98Array9420[var2].anInt1183;
                  }
               }
            }

            if(this.aClass98Array9383 != null) {
               for(var2 = 0; var2 < this.anInt9370; ++var2) {
                  if(this.aClass98Array9383[var2] != null) {
                     this.aClass98Array9383[var2].anInt1183 = -this.aClass98Array9383[var2].anInt1183;
                  }
               }
            }

            if(this.aClass112Array9398 != null) {
               for(var2 = 0; var2 < this.anInt9384; ++var2) {
                  if(this.aClass112Array9398[var2] != null) {
                     this.aClass112Array9398[var2].anInt1358 = -this.aClass112Array9398[var2].anInt1358;
                  }
               }
            }

            short[] var7 = this.aShortArray9386;
            this.aShortArray9386 = this.aShortArray9388;
            this.aShortArray9388 = var7;
            if(this.aFloatArrayArray9389 != null) {
               for(int var3 = 0; var3 < this.anInt9384; ++var3) {
                  float var4;
                  if(this.aFloatArrayArray9389[var3] != null) {
                     var4 = this.aFloatArrayArray9389[var3][0];
                     this.aFloatArrayArray9389[var3][0] = this.aFloatArrayArray9389[var3][2];
                     this.aFloatArrayArray9389[var3][2] = var4;
                  }

                  if(this.aFloatArrayArray9390[var3] != null) {
                     var4 = this.aFloatArrayArray9390[var3][0];
                     this.aFloatArrayArray9390[var3][0] = this.aFloatArrayArray9390[var3][2];
                     this.aFloatArrayArray9390[var3][2] = var4;
                  }
               }
            }

            this.aBool9363 = false;
            this.anInt9392 = 0;
         }
      }
   }

   void method8588() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.anInt9376; ++var2) {
            int var3 = this.anIntArray9405[var2];
            this.anIntArray9405[var2] = this.anIntArray9380[var2];
            this.anIntArray9380[var2] = -var3;
         }

         this.method8563();
      }
   }

   public void method1951(int var1) {
      if((this.anInt9373 & 5) != 5) {
         throw new IllegalStateException();
      } else if(var1 == 4096) {
         this.method8584();
      } else if(var1 == 8192) {
         this.method8564();
      } else if(var1 == 12288) {
         this.method8565();
      } else {
         int var2 = Class443.anIntArray4895[var1];
         int var3 = Class443.anIntArray4896[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.anInt9376; ++var5) {
               int var6 = this.anIntArray9380[var5] * var2 + this.anIntArray9405[var5] * var3 >> 14;
               this.anIntArray9380[var5] = this.anIntArray9380[var5] * var3 - this.anIntArray9405[var5] * var2 >> 14;
               this.anIntArray9405[var5] = var6;
            }

            this.method8563();
         }
      }
   }

   void method2074() {
      if(this.aBool9430) {
         for(int var1 = 0; var1 < this.anInt9376; ++var1) {
            this.anIntArray9405[var1] = this.anIntArray9405[var1] + 7 >> 4;
            this.anIntArray9360[var1] = this.anIntArray9360[var1] + 7 >> 4;
            this.anIntArray9380[var1] = this.anIntArray9380[var1] + 7 >> 4;
         }

         this.aBool9430 = false;
      }

      if(this.aBool9391) {
         this.method8562();
         this.aBool9391 = false;
      }

      this.aBool9363 = false;
   }

   void method2023() {
      if(this.aBool9430) {
         for(int var1 = 0; var1 < this.anInt9376; ++var1) {
            this.anIntArray9405[var1] = this.anIntArray9405[var1] + 7 >> 4;
            this.anIntArray9360[var1] = this.anIntArray9360[var1] + 7 >> 4;
            this.anIntArray9380[var1] = this.anIntArray9380[var1] + 7 >> 4;
         }

         this.aBool9430 = false;
      }

      if(this.aBool9391) {
         this.method8562();
         this.aBool9391 = false;
      }

      this.aBool9363 = false;
   }

   void method2115() {
      if(this.aBool9430) {
         for(int var1 = 0; var1 < this.anInt9376; ++var1) {
            this.anIntArray9405[var1] = this.anIntArray9405[var1] + 7 >> 4;
            this.anIntArray9360[var1] = this.anIntArray9360[var1] + 7 >> 4;
            this.anIntArray9380[var1] = this.anIntArray9380[var1] + 7 >> 4;
         }

         this.aBool9430 = false;
      }

      if(this.aBool9391) {
         this.method8562();
         this.aBool9391 = false;
      }

      this.aBool9363 = false;
   }
}
