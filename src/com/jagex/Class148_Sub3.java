package com.jagex;

import com.jagex.Class124;
import com.jagex.Class129;
import com.jagex.Class135_Sub1;
import com.jagex.Class138_Sub1;
import com.jagex.Class145;
import com.jagex.Class148;
import com.jagex.Class169;
import com.jagex.Class172;
import com.jagex.Class174_Sub2;
import com.jagex.Class184;
import com.jagex.Class20;
import com.jagex.Class361_Sub1;
import com.jagex.Class526;
import com.jagex.Class526_Sub12;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub17;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub21_Sub5_Sub2;
import com.jagex.Class526_Sub36_Sub1;
import com.jagex.Class526_Sub4;
import com.jagex.Class568;
import com.jagex.Class661;
import com.jagex.Class702;
import com.jagex.Interface15;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Class148_Sub3 extends Class148 {
   static final int anInt9162 = 74;
   static final int anInt9176 = 1;
   int[][][] anIntArrayArrayArray9177;
   int[][][] anIntArrayArrayArray9185;
   int anInt9174;
   int anInt9187;
   Class145 aClass145_9179;
   int[][][] anIntArrayArrayArray9175;
   int[][][] anIntArrayArrayArray9189;
   int[][][] anIntArrayArrayArray9172;
   int[][][] anIntArrayArrayArray9173;
   Class526_Sub4[][][] aClass526_Sub4ArrayArrayArray9161;
   byte[][] aByteArrayArray9192;
   Class20 aClass20_9193;
   float[][] aFloatArrayArray9171;
   float[][] aFloatArrayArray9191;
   float[][] aFloatArrayArray9190;
   Class526[] aClass526Array9181;
   Interface15 anInterface15_9182;
   Class129 aClass129_9180;
   Class129 aClass129_9184;
   Class129 aClass129_9186;
   Class129 aClass129_9183;
   int anInt9194;
   int anInt9163;
   static float[] aFloatArray9188 = new float[16];
   Class702 aClass702_9165 = new Class702();
   Class174_Sub2 aClass174_Sub2_9169;
   int anInt9164;
   int anInt9168;
   int anInt9166;
   int anInt9167;
   short[][] aShortArrayArray9170;
   byte[][] aByteArrayArray9178;

   public void method1698(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method8446(var1, var2, var3, var4, var5, var6);
   }

   public void method1715(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9192.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9192[var1].length - 1, Math.max(0, var2));
      if((this.aByteArrayArray9192[var1][var2] & 255) < var3) {
         this.aByteArrayArray9192[var1][var2] = (byte)var3;
      }

   }

   public void method1699(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub2_9169.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9177 == null) {
         this.anIntArrayArrayArray9177 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9185 == null) {
         this.anIntArrayArrayArray9185 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9189[var1][var2] = var3;
      this.anIntArrayArrayArray9175[var1][var2] = var5;
      this.anIntArrayArrayArray9172[var1][var2] = var7;
      this.anIntArrayArrayArray9173[var1][var2] = var8;
      if(this.anIntArrayArrayArray9177 != null) {
         this.anIntArrayArrayArray9177[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9185 != null) {
         this.anIntArrayArrayArray9185[var1][var2] = var4;
      }

      Class526_Sub4[] var14 = this.aClass526_Sub4ArrayArrayArray9161[var1][var2] = new Class526_Sub4[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9167 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)8).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9193.get(var18); var20 != null; var20 = this.aClass20_9193.method635(-1734407897)) {
            Class526_Sub4 var21 = (Class526_Sub4)var20;
            if(var21.anInt10380 == var16 && var21.aFloat10375 == (float)var17 && var21.aClass172_10373.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub4(this, var16, var17, var11);
            this.aClass20_9193.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub4)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9178[var1][var2] = (byte)(this.aByteArrayArray9178[var1][var2] | 1);
      }

      if(var7.length > this.anInt9174) {
         this.anInt9174 = var7.length;
      }

      this.anInt9187 += var7.length;
   }

   public void method1722(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method8446(var1, var2, var3, var4, var5, var6);
   }

   public void method1737() {
      if(this.anInt9187 > 0) {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(int var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9192[var2 - 1][var3] >> 2) + (this.aByteArrayArray9192[var2 + 1][var3] >> 3) + (this.aByteArrayArray9192[var2][var3 - 1] >> 2) + (this.aByteArrayArray9192[var2][var3 + 1] >> 3) + (this.aByteArrayArray9192[var2][var3] >> 1));
            }
         }

         this.aClass526Array9181 = new Class526[this.aClass20_9193.method636(-1607292195)];
         this.aClass20_9193.method641(this.aClass526Array9181, (byte)41);

         for(var2 = 0; var2 < this.aClass526Array9181.length; ++var2) {
            ((Class526_Sub4)this.aClass526Array9181[var2]).method9334(this.anInt9187);
         }

         var2 = 24;
         if(this.anIntArrayArrayArray9177 != null) {
            var2 += 4;
         }

         if((this.anInt9167 & 7) != 0) {
            var2 += 12;
         }

         NativeHeapBuffer var65 = this.aClass174_Sub2_9169.aNativeHeap9515.method1354(this.anInt9187 * var2, false);
         Stream var4 = new Stream(var65);
         Class526_Sub4[] var5 = new Class526_Sub4[this.anInt9187];
         int var6 = Class568.method6836(this.anInt9187 / 4, 1914534531);
         if(var6 < 1) {
            var6 = 1;
         }

         Class20 var7 = new Class20(var6);
         Class526_Sub4[] var8 = new Class526_Sub4[this.anInt9174];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               if(this.anIntArrayArrayArray9172[var9][var10] != null) {
                  Class526_Sub4[] var11 = this.aClass526_Sub4ArrayArrayArray9161[var9][var10];
                  int[] var12 = this.anIntArrayArrayArray9189[var9][var10];
                  int[] var13 = this.anIntArrayArrayArray9175[var9][var10];
                  int[] var14 = this.anIntArrayArrayArray9173[var9][var10];
                  int[] var15 = this.anIntArrayArrayArray9172[var9][var10];
                  int[] var16 = this.anIntArrayArrayArray9185 != null?this.anIntArrayArrayArray9185[var9][var10]:null;
                  int[] var17 = this.anIntArrayArrayArray9177 != null?this.anIntArrayArrayArray9177[var9][var10]:null;
                  if(var14 == null) {
                     var14 = var15;
                  }

                  float var18 = this.aFloatArrayArray9190[var9][var10];
                  float var19 = this.aFloatArrayArray9191[var9][var10];
                  float var20 = this.aFloatArrayArray9171[var9][var10];
                  float var21 = this.aFloatArrayArray9190[var9][var10 + 1];
                  float var22 = this.aFloatArrayArray9191[var9][var10 + 1];
                  float var23 = this.aFloatArrayArray9171[var9][var10 + 1];
                  float var24 = this.aFloatArrayArray9190[var9 + 1][var10 + 1];
                  float var25 = this.aFloatArrayArray9191[var9 + 1][var10 + 1];
                  float var26 = this.aFloatArrayArray9171[var9 + 1][var10 + 1];
                  float var27 = this.aFloatArrayArray9190[var9 + 1][var10];
                  float var28 = this.aFloatArrayArray9191[var9 + 1][var10];
                  float var29 = this.aFloatArrayArray9171[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;

                  int var37;
                  label346:
                  for(int var35 = 0; var35 < var15.length; ++var35) {
                     Class526_Sub4 var36 = var11[var35];

                     for(var37 = 0; var37 < var34; ++var37) {
                        if(var8[var37] == var36) {
                           continue label346;
                        }
                     }

                     var8[var34++] = var36;
                  }

                  short[] var81 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9] = new short[var15.length];

                  for(int var82 = 0; var82 < var15.length; ++var82) {
                     int var38 = (var9 << this.anInt1710 * -586661047) + var12[var82];
                     int var39 = (var10 << this.anInt1710 * -586661047) + var13[var82];
                     int var40 = var38 >> this.anInt9164;
                     int var41 = var39 >> this.anInt9164;
                     int var42 = var15[var82];
                     int var43 = var14[var82];
                     int var44 = var16 != null?var16[var82]:0;
                     long var45 = (long)var43 << 48 | (long)var42 << 32 | (long)(var40 << 16) | (long)var41;
                     int var47 = var12[var82];
                     int var48 = var13[var82];
                     byte var49 = 74;
                     int var50 = 0;
                     float var51 = 1.0F;
                     float var52;
                     float var53;
                     float var54;
                     float var58;
                     int var83;
                     if(var47 == 0 && var48 == 0) {
                        var52 = var18;
                        var53 = var19;
                        var54 = var20;
                        var83 = var49 - var30;
                     } else if(var47 == 0 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var21;
                        var53 = var22;
                        var54 = var23;
                        var83 = var49 - var31;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var24;
                        var53 = var25;
                        var54 = var26;
                        var83 = var49 - var32;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == 0) {
                        var52 = var27;
                        var53 = var28;
                        var54 = var29;
                        var83 = var49 - var33;
                     } else {
                        float var55 = (float)var47 / (float)(this.anInt1712 * 1934131013);
                        float var56 = (float)var48 / (float)(this.anInt1712 * 1934131013);
                        float var57 = var18 + (var27 - var18) * var55;
                        var58 = var19 + (var28 - var19) * var55;
                        float var59 = var20 + (var29 - var20) * var55;
                        float var60 = var21 + (var24 - var21) * var55;
                        float var61 = var22 + (var25 - var22) * var55;
                        float var62 = var23 + (var26 - var23) * var55;
                        var52 = var57 + (var60 - var57) * var56;
                        var53 = var58 + (var61 - var58) * var56;
                        var54 = var59 + (var62 - var59) * var56;
                        int var63 = var30 + ((var33 - var30) * var47 >> this.anInt1710 * -586661047);
                        int var64 = var31 + ((var32 - var31) * var47 >> this.anInt1710 * -586661047);
                        var83 = var49 - (var63 + ((var64 - var63) * var48 >> this.anInt1710 * -586661047));
                     }

                     if(var42 != -1) {
                        int var84 = (var42 & 127) * var83 >> 7;
                        if(var84 < 2) {
                           var84 = 2;
                        } else if(var84 > 126) {
                           var84 = 126;
                        }

                        var50 = Class661.anIntArray8516[var42 & '\uff80' | var84];
                        if((this.anInt9167 & 7) == 0) {
                           var51 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                           var51 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                        }
                     }

                     Class526 var86 = null;
                     if((var38 & this.anInt9168 - 1) == 0 && (var39 & this.anInt9168 - 1) == 0) {
                        var86 = var7.get(var45);
                     }

                     int var85;
                     if(var86 == null) {
                        if(var43 != var42) {
                           int var87 = (var43 & 127) * var83 >> 7;
                           if(var87 < 2) {
                              var87 = 2;
                           } else if(var87 > 126) {
                              var87 = 126;
                           }

                           var85 = Class661.anIntArray8516[var43 & '\uff80' | var87];
                           if((this.anInt9167 & 7) == 0) {
                              float var10000 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                              var58 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                              int var88 = var85 >> 16 & 255;
                              int var89 = var85 >> 8 & 255;
                              int var90 = var85 & 255;
                              var88 = (int)((float)var88 * var58);
                              if(var88 < 0) {
                                 var88 = 0;
                              } else if(var88 > 255) {
                                 var88 = 255;
                              }

                              var89 = (int)((float)var89 * var58);
                              if(var89 < 0) {
                                 var89 = 0;
                              } else if(var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if(var90 < 0) {
                                 var90 = 0;
                              } else if(var90 > 255) {
                                 var90 = 255;
                              }

                              var85 = var88 << 16 | var89 << 8 | var90;
                           }
                        } else {
                           var85 = var50;
                        }

                        if(this.aClass174_Sub2_9169.aBool9508) {
                           var4.method1250((float)var38);
                           var4.method1250((float)(this.method1707(var38, var39, -583552852) + var44));
                           var4.method1250((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1250((float)var38);
                           var4.method1250((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1250(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1250(var52);
                              var4.method1250(var53);
                              var4.method1250(var54);
                           }
                        } else {
                           var4.method1251((float)var38);
                           var4.method1251((float)(this.method1707(var38, var39, -606322149) + var44));
                           var4.method1251((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1251((float)var38);
                           var4.method1251((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1251(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1251(var52);
                              var4.method1251(var53);
                              var4.method1251(var54);
                           }
                        }

                        var37 = this.anInt9163++;
                        var81[var82] = (short)var37;
                        if(var42 != -1) {
                           var5[var37] = var11[var82];
                        }

                        var7.put(new Class526_Sub17(var81[var82]), var45);
                     } else {
                        var81[var82] = ((Class526_Sub17)var86).aShort10479;
                        var37 = var81[var82] & '\uffff';
                        if(var42 != -1 && var11[var82].aLong7156 * -6805155999452426801L < var5[var37].aLong7156 * -6805155999452426801L) {
                           var5[var37] = var11[var82];
                        }
                     }

                     for(var85 = 0; var85 < var34; ++var85) {
                        var8[var85].method9325(var37, var50, var83, var51);
                     }

                     ++this.anInt9194;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.anInt9163; ++var9) {
            Class526_Sub4 var66 = var5[var9];
            if(var66 != null) {
               var66.method9320(var9);
            }
         }

         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               short[] var68 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9];
               if(var68 != null) {
                  int var71 = 0;

                  for(int var73 = 0; var73 < var68.length; ++var71) {
                     int var74 = var68[var73++] & '\uffff';
                     int var75 = var68[var73++] & '\uffff';
                     int var76 = var68[var73++] & '\uffff';
                     Class526_Sub4 var77 = var5[var74];
                     Class526_Sub4 var78 = var5[var75];
                     Class526_Sub4 var79 = var5[var76];
                     Class526_Sub4 var80 = null;
                     if(var77 != null) {
                        var77.method9321(var9, var10, var71);
                        var80 = var77;
                     }

                     if(var78 != null) {
                        var78.method9321(var9, var10, var71);
                        if(var80 == null || var78.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var78;
                        }
                     }

                     if(var79 != null) {
                        var79.method9321(var9, var10, var71);
                        if(var80 == null || var79.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var79;
                        }
                     }

                     if(var80 != null) {
                        if(var77 != null) {
                           var80.method9320(var74);
                        }

                        if(var78 != null) {
                           var80.method9320(var75);
                        }

                        if(var79 != null) {
                           var80.method9320(var76);
                        }

                        var80.method9321(var9, var10, var71);
                     }
                  }
               }
            }
         }

         var4.method1252();
         this.anInterface15_9182 = this.aClass174_Sub2_9169.method8631(var2, var65, var4.method1247(), false);
         if(this.anInterface15_9182 instanceof Class135_Sub1) {
            var65.method1228();
         }

         this.aClass129_9180 = new Class129(this.anInterface15_9182, 5126, 3, 0);
         this.aClass129_9184 = new Class129(this.anInterface15_9182, 5121, 4, 12);
         byte var67;
         if(this.anIntArrayArrayArray9177 != null) {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 3, 16);
            var67 = 28;
         } else {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 2, 16);
            var67 = 24;
         }

         if((this.anInt9167 & 7) != 0) {
            this.aClass129_9183 = new Class129(this.anInterface15_9182, 5126, 3, var67);
         }

         long[] var69 = new long[this.aClass526Array9181.length];

         for(int var70 = 0; var70 < this.aClass526Array9181.length; ++var70) {
            Class526_Sub4 var72 = (Class526_Sub4)this.aClass526Array9181[var70];
            var69[var70] = var72.aLong7156 * -6805155999452426801L;
            var72.method9322(this.anInt9163);
         }

         Class361_Sub1.method9240(var69, this.aClass526Array9181, (byte)-70);
         if(this.aClass145_9179 != null) {
            this.aClass145_9179.method1673();
         }
      } else {
         this.aClass145_9179 = null;
      }

      if((this.anInt9166 & 2) == 0) {
         this.anIntArrayArrayArray9175 = (int[][][])null;
         this.anIntArrayArrayArray9189 = (int[][][])null;
         this.anIntArrayArrayArray9172 = (int[][][])null;
      }

      this.anIntArrayArrayArray9177 = (int[][][])null;
      this.anIntArrayArrayArray9173 = (int[][][])null;
      this.anIntArrayArrayArray9185 = (int[][][])null;
      this.aClass526_Sub4ArrayArrayArray9161 = (Class526_Sub4[][][])null;
      this.aByteArrayArray9192 = (byte[][])null;
      this.aClass20_9193 = null;
      this.aFloatArrayArray9171 = (float[][])null;
      this.aFloatArrayArray9191 = (float[][])null;
      this.aFloatArrayArray9190 = (float[][])null;
   }

   public void method1709(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method8446(var1, var2, var3, var4, var5, var6);
   }

   public Class526_Sub21_Sub5 method1728(int var1, int var2, Class526_Sub21_Sub5 var3) {
      if((this.aByteArrayArray9178[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt1712 * 1934131013 >> this.aClass174_Sub2_9169.anInt9662;
         Class526_Sub21_Sub5_Sub2 var5 = (Class526_Sub21_Sub5_Sub2)var3;
         Class526_Sub21_Sub5_Sub2 var6;
         if(var5 != null && var5.method10908(var4, var4)) {
            var6 = var5;
            var5.method10898();
         } else {
            var6 = new Class526_Sub21_Sub5_Sub2(this.aClass174_Sub2_9169, var4, var4);
         }

         var6.method10897(0, 0, var4, var4);
         this.method8445(var6, var1, var2);
         return var6;
      }
   }

   public void method1719(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      Class184 var9 = this.aClass174_Sub2_9169.method2247((byte)6);
      if(this.anInt9187 > 0 && var9 != null) {
         this.aClass174_Sub2_9169.method8613();
         this.aClass174_Sub2_9169.method8700(false);
         this.aClass174_Sub2_9169.method8646(false);
         this.aClass174_Sub2_9169.method8681(false);
         this.aClass174_Sub2_9169.method8648(false);
         this.aClass174_Sub2_9169.method8651(0);
         this.aClass174_Sub2_9169.method8639(-2);
         this.aClass174_Sub2_9169.method8641((Class124)null);
         aFloatArray9188[0] = (float)var3 / (128.0F * (float)(this.anInt1712 * 1934131013) * (float)var9.method2691());
         aFloatArray9188[1] = 0.0F;
         aFloatArray9188[2] = 0.0F;
         aFloatArray9188[3] = 0.0F;
         aFloatArray9188[4] = 0.0F;
         aFloatArray9188[5] = (float)var3 / (128.0F * (float)(this.anInt1712 * 1934131013) * (float)var9.method2693());
         aFloatArray9188[6] = 0.0F;
         aFloatArray9188[7] = 0.0F;
         aFloatArray9188[8] = 0.0F;
         aFloatArray9188[9] = 0.0F;
         aFloatArray9188[10] = 0.0F;
         aFloatArray9188[11] = 0.0F;
         aFloatArray9188[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2691();
         aFloatArray9188[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2693();
         aFloatArray9188[14] = 0.0F;
         aFloatArray9188[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(aFloatArray9188, 0);
         aFloatArray9188[0] = 1.0F;
         aFloatArray9188[1] = 0.0F;
         aFloatArray9188[2] = 0.0F;
         aFloatArray9188[3] = 0.0F;
         aFloatArray9188[4] = 0.0F;
         aFloatArray9188[5] = 0.0F;
         aFloatArray9188[6] = 1.0F;
         aFloatArray9188[7] = 0.0F;
         aFloatArray9188[8] = 0.0F;
         aFloatArray9188[9] = 1.0F;
         aFloatArray9188[10] = 0.0F;
         aFloatArray9188[11] = 0.0F;
         aFloatArray9188[12] = 0.0F;
         aFloatArray9188[13] = 0.0F;
         aFloatArray9188[14] = 0.0F;
         aFloatArray9188[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(aFloatArray9188, 0);
         if((this.anInt9167 & 7) != 0) {
            this.aClass174_Sub2_9169.method8646(true);
            this.aClass174_Sub2_9169.method8623();
         } else {
            this.aClass174_Sub2_9169.method8646(false);
         }

         this.aClass174_Sub2_9169.method8634(this.aClass129_9180, this.aClass129_9183, this.aClass129_9184, this.aClass129_9186);
         if(this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655.buffer.length < this.anInt9194 * 2) {
            this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655 = new Class526_Sub36_Sub1(this.anInt9194 * 2);
         } else {
            this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655.pos = 0;
         }

         int var10 = 0;
         Class526_Sub36_Sub1 var11 = this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if(this.aClass174_Sub2_9169.aBool9508) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.anInt1711 * 1966165105 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if(var8[var14 - var4][var12 - var5]) {
                     var15 = this.aShortArrayArray9170[var13];
                     if(var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.writeShort(var15[var16] & '\uffff', -805078716);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.anInt1711 * 1966165105 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if(var8[var14 - var4][var12 - var5]) {
                     var15 = this.aShortArrayArray9170[var13];
                     if(var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method9610(var15[var16] & '\uffff', (byte)0);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if(var10 > 0) {
            Class138_Sub1 var17 = new Class138_Sub1(this.aClass174_Sub2_9169, 5123, var11.buffer, var11.pos * 301018015);
            this.aClass174_Sub2_9169.method8664(var17, 4, 0, var10);
         }

      }
   }

   public Class526_Sub21_Sub5 method1708(int var1, int var2, Class526_Sub21_Sub5 var3) {
      if((this.aByteArrayArray9178[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt1712 * 1934131013 >> this.aClass174_Sub2_9169.anInt9662;
         Class526_Sub21_Sub5_Sub2 var5 = (Class526_Sub21_Sub5_Sub2)var3;
         Class526_Sub21_Sub5_Sub2 var6;
         if(var5 != null && var5.method10908(var4, var4)) {
            var6 = var5;
            var5.method10898();
         } else {
            var6 = new Class526_Sub21_Sub5_Sub2(this.aClass174_Sub2_9169, var4, var4);
         }

         var6.method10897(0, 0, var4, var4);
         this.method8445(var6, var1, var2);
         return var6;
      }
   }

   void method8445(Class526_Sub21_Sub5_Sub2 var1, int var2, int var3) {
      int[] var4 = this.anIntArrayArrayArray9189[var2][var3];
      int[] var5 = this.anIntArrayArrayArray9175[var2][var3];
      int var6 = var4.length;
      if(this.aClass174_Sub2_9169.anIntArray9656.length < var6) {
         this.aClass174_Sub2_9169.anIntArray9656 = new int[var6];
         this.aClass174_Sub2_9169.anIntArray9506 = new int[var6];
      }

      int[] var7 = this.aClass174_Sub2_9169.anIntArray9656;
      int[] var8 = this.aClass174_Sub2_9169.anIntArray9506;

      int var9;
      for(var9 = 0; var9 < var6; ++var9) {
         var7[var9] = var4[var9] >> this.aClass174_Sub2_9169.anInt9662;
         var8[var9] = var5[var9] >> this.aClass174_Sub2_9169.anInt9662;
      }

      var9 = 0;

      while(var9 < var6) {
         int var10 = var7[var9];
         int var11 = var8[var9++];
         int var12 = var7[var9];
         int var13 = var8[var9++];
         int var14 = var7[var9];
         int var15 = var8[var9++];
         if((var10 - var12) * (var13 - var15) - (var13 - var11) * (var14 - var12) > 0) {
            var1.method10907(var11, var13, var15, var10, var12, var14);
         }
      }

   }

   public boolean method1711(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         return this.aClass145_9179.method1675(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method1741(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1678(var1, var7, var8);
      }
   }

   public void method1710(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1680(var1, var7, var8);
      }
   }

   public void method1742(Class526_Sub16 var1, int[] var2) {
      this.aClass702_9165.method8176(new Class526_Sub12(this.aClass174_Sub2_9169, this, var1, var2), -1530291654);
   }

   public void method1713(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9192.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9192[var1].length - 1, Math.max(0, var2));
      if((this.aByteArrayArray9192[var1][var2] & 255) < var3) {
         this.aByteArrayArray9192[var1][var2] = (byte)var3;
      }

   }

   public void method1718() {
      if(this.anInt9187 > 0) {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(int var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9192[var2 - 1][var3] >> 2) + (this.aByteArrayArray9192[var2 + 1][var3] >> 3) + (this.aByteArrayArray9192[var2][var3 - 1] >> 2) + (this.aByteArrayArray9192[var2][var3 + 1] >> 3) + (this.aByteArrayArray9192[var2][var3] >> 1));
            }
         }

         this.aClass526Array9181 = new Class526[this.aClass20_9193.method636(32346041)];
         this.aClass20_9193.method641(this.aClass526Array9181, (byte)-28);

         for(var2 = 0; var2 < this.aClass526Array9181.length; ++var2) {
            ((Class526_Sub4)this.aClass526Array9181[var2]).method9334(this.anInt9187);
         }

         var2 = 24;
         if(this.anIntArrayArrayArray9177 != null) {
            var2 += 4;
         }

         if((this.anInt9167 & 7) != 0) {
            var2 += 12;
         }

         NativeHeapBuffer var65 = this.aClass174_Sub2_9169.aNativeHeap9515.method1354(this.anInt9187 * var2, false);
         Stream var4 = new Stream(var65);
         Class526_Sub4[] var5 = new Class526_Sub4[this.anInt9187];
         int var6 = Class568.method6836(this.anInt9187 / 4, 327278104);
         if(var6 < 1) {
            var6 = 1;
         }

         Class20 var7 = new Class20(var6);
         Class526_Sub4[] var8 = new Class526_Sub4[this.anInt9174];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               if(this.anIntArrayArrayArray9172[var9][var10] != null) {
                  Class526_Sub4[] var11 = this.aClass526_Sub4ArrayArrayArray9161[var9][var10];
                  int[] var12 = this.anIntArrayArrayArray9189[var9][var10];
                  int[] var13 = this.anIntArrayArrayArray9175[var9][var10];
                  int[] var14 = this.anIntArrayArrayArray9173[var9][var10];
                  int[] var15 = this.anIntArrayArrayArray9172[var9][var10];
                  int[] var16 = this.anIntArrayArrayArray9185 != null?this.anIntArrayArrayArray9185[var9][var10]:null;
                  int[] var17 = this.anIntArrayArrayArray9177 != null?this.anIntArrayArrayArray9177[var9][var10]:null;
                  if(var14 == null) {
                     var14 = var15;
                  }

                  float var18 = this.aFloatArrayArray9190[var9][var10];
                  float var19 = this.aFloatArrayArray9191[var9][var10];
                  float var20 = this.aFloatArrayArray9171[var9][var10];
                  float var21 = this.aFloatArrayArray9190[var9][var10 + 1];
                  float var22 = this.aFloatArrayArray9191[var9][var10 + 1];
                  float var23 = this.aFloatArrayArray9171[var9][var10 + 1];
                  float var24 = this.aFloatArrayArray9190[var9 + 1][var10 + 1];
                  float var25 = this.aFloatArrayArray9191[var9 + 1][var10 + 1];
                  float var26 = this.aFloatArrayArray9171[var9 + 1][var10 + 1];
                  float var27 = this.aFloatArrayArray9190[var9 + 1][var10];
                  float var28 = this.aFloatArrayArray9191[var9 + 1][var10];
                  float var29 = this.aFloatArrayArray9171[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;

                  int var37;
                  label346:
                  for(int var35 = 0; var35 < var15.length; ++var35) {
                     Class526_Sub4 var36 = var11[var35];

                     for(var37 = 0; var37 < var34; ++var37) {
                        if(var8[var37] == var36) {
                           continue label346;
                        }
                     }

                     var8[var34++] = var36;
                  }

                  short[] var81 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9] = new short[var15.length];

                  for(int var82 = 0; var82 < var15.length; ++var82) {
                     int var38 = (var9 << this.anInt1710 * -586661047) + var12[var82];
                     int var39 = (var10 << this.anInt1710 * -586661047) + var13[var82];
                     int var40 = var38 >> this.anInt9164;
                     int var41 = var39 >> this.anInt9164;
                     int var42 = var15[var82];
                     int var43 = var14[var82];
                     int var44 = var16 != null?var16[var82]:0;
                     long var45 = (long)var43 << 48 | (long)var42 << 32 | (long)(var40 << 16) | (long)var41;
                     int var47 = var12[var82];
                     int var48 = var13[var82];
                     byte var49 = 74;
                     int var50 = 0;
                     float var51 = 1.0F;
                     float var52;
                     float var53;
                     float var54;
                     float var58;
                     int var83;
                     if(var47 == 0 && var48 == 0) {
                        var52 = var18;
                        var53 = var19;
                        var54 = var20;
                        var83 = var49 - var30;
                     } else if(var47 == 0 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var21;
                        var53 = var22;
                        var54 = var23;
                        var83 = var49 - var31;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var24;
                        var53 = var25;
                        var54 = var26;
                        var83 = var49 - var32;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == 0) {
                        var52 = var27;
                        var53 = var28;
                        var54 = var29;
                        var83 = var49 - var33;
                     } else {
                        float var55 = (float)var47 / (float)(this.anInt1712 * 1934131013);
                        float var56 = (float)var48 / (float)(this.anInt1712 * 1934131013);
                        float var57 = var18 + (var27 - var18) * var55;
                        var58 = var19 + (var28 - var19) * var55;
                        float var59 = var20 + (var29 - var20) * var55;
                        float var60 = var21 + (var24 - var21) * var55;
                        float var61 = var22 + (var25 - var22) * var55;
                        float var62 = var23 + (var26 - var23) * var55;
                        var52 = var57 + (var60 - var57) * var56;
                        var53 = var58 + (var61 - var58) * var56;
                        var54 = var59 + (var62 - var59) * var56;
                        int var63 = var30 + ((var33 - var30) * var47 >> this.anInt1710 * -586661047);
                        int var64 = var31 + ((var32 - var31) * var47 >> this.anInt1710 * -586661047);
                        var83 = var49 - (var63 + ((var64 - var63) * var48 >> this.anInt1710 * -586661047));
                     }

                     if(var42 != -1) {
                        int var84 = (var42 & 127) * var83 >> 7;
                        if(var84 < 2) {
                           var84 = 2;
                        } else if(var84 > 126) {
                           var84 = 126;
                        }

                        var50 = Class661.anIntArray8516[var42 & '\uff80' | var84];
                        if((this.anInt9167 & 7) == 0) {
                           var51 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                           var51 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                        }
                     }

                     Class526 var86 = null;
                     if((var38 & this.anInt9168 - 1) == 0 && (var39 & this.anInt9168 - 1) == 0) {
                        var86 = var7.get(var45);
                     }

                     int var85;
                     if(var86 == null) {
                        if(var43 != var42) {
                           int var87 = (var43 & 127) * var83 >> 7;
                           if(var87 < 2) {
                              var87 = 2;
                           } else if(var87 > 126) {
                              var87 = 126;
                           }

                           var85 = Class661.anIntArray8516[var43 & '\uff80' | var87];
                           if((this.anInt9167 & 7) == 0) {
                              float var10000 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                              var58 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                              int var88 = var85 >> 16 & 255;
                              int var89 = var85 >> 8 & 255;
                              int var90 = var85 & 255;
                              var88 = (int)((float)var88 * var58);
                              if(var88 < 0) {
                                 var88 = 0;
                              } else if(var88 > 255) {
                                 var88 = 255;
                              }

                              var89 = (int)((float)var89 * var58);
                              if(var89 < 0) {
                                 var89 = 0;
                              } else if(var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if(var90 < 0) {
                                 var90 = 0;
                              } else if(var90 > 255) {
                                 var90 = 255;
                              }

                              var85 = var88 << 16 | var89 << 8 | var90;
                           }
                        } else {
                           var85 = var50;
                        }

                        if(this.aClass174_Sub2_9169.aBool9508) {
                           var4.method1250((float)var38);
                           var4.method1250((float)(this.method1707(var38, var39, 2142095170) + var44));
                           var4.method1250((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1250((float)var38);
                           var4.method1250((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1250(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1250(var52);
                              var4.method1250(var53);
                              var4.method1250(var54);
                           }
                        } else {
                           var4.method1251((float)var38);
                           var4.method1251((float)(this.method1707(var38, var39, -1597523995) + var44));
                           var4.method1251((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1251((float)var38);
                           var4.method1251((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1251(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1251(var52);
                              var4.method1251(var53);
                              var4.method1251(var54);
                           }
                        }

                        var37 = this.anInt9163++;
                        var81[var82] = (short)var37;
                        if(var42 != -1) {
                           var5[var37] = var11[var82];
                        }

                        var7.put(new Class526_Sub17(var81[var82]), var45);
                     } else {
                        var81[var82] = ((Class526_Sub17)var86).aShort10479;
                        var37 = var81[var82] & '\uffff';
                        if(var42 != -1 && var11[var82].aLong7156 * -6805155999452426801L < var5[var37].aLong7156 * -6805155999452426801L) {
                           var5[var37] = var11[var82];
                        }
                     }

                     for(var85 = 0; var85 < var34; ++var85) {
                        var8[var85].method9325(var37, var50, var83, var51);
                     }

                     ++this.anInt9194;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.anInt9163; ++var9) {
            Class526_Sub4 var66 = var5[var9];
            if(var66 != null) {
               var66.method9320(var9);
            }
         }

         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               short[] var68 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9];
               if(var68 != null) {
                  int var71 = 0;

                  for(int var73 = 0; var73 < var68.length; ++var71) {
                     int var74 = var68[var73++] & '\uffff';
                     int var75 = var68[var73++] & '\uffff';
                     int var76 = var68[var73++] & '\uffff';
                     Class526_Sub4 var77 = var5[var74];
                     Class526_Sub4 var78 = var5[var75];
                     Class526_Sub4 var79 = var5[var76];
                     Class526_Sub4 var80 = null;
                     if(var77 != null) {
                        var77.method9321(var9, var10, var71);
                        var80 = var77;
                     }

                     if(var78 != null) {
                        var78.method9321(var9, var10, var71);
                        if(var80 == null || var78.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var78;
                        }
                     }

                     if(var79 != null) {
                        var79.method9321(var9, var10, var71);
                        if(var80 == null || var79.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var79;
                        }
                     }

                     if(var80 != null) {
                        if(var77 != null) {
                           var80.method9320(var74);
                        }

                        if(var78 != null) {
                           var80.method9320(var75);
                        }

                        if(var79 != null) {
                           var80.method9320(var76);
                        }

                        var80.method9321(var9, var10, var71);
                     }
                  }
               }
            }
         }

         var4.method1252();
         this.anInterface15_9182 = this.aClass174_Sub2_9169.method8631(var2, var65, var4.method1247(), false);
         if(this.anInterface15_9182 instanceof Class135_Sub1) {
            var65.method1228();
         }

         this.aClass129_9180 = new Class129(this.anInterface15_9182, 5126, 3, 0);
         this.aClass129_9184 = new Class129(this.anInterface15_9182, 5121, 4, 12);
         byte var67;
         if(this.anIntArrayArrayArray9177 != null) {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 3, 16);
            var67 = 28;
         } else {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 2, 16);
            var67 = 24;
         }

         if((this.anInt9167 & 7) != 0) {
            this.aClass129_9183 = new Class129(this.anInterface15_9182, 5126, 3, var67);
         }

         long[] var69 = new long[this.aClass526Array9181.length];

         for(int var70 = 0; var70 < this.aClass526Array9181.length; ++var70) {
            Class526_Sub4 var72 = (Class526_Sub4)this.aClass526Array9181[var70];
            var69[var70] = var72.aLong7156 * -6805155999452426801L;
            var72.method9322(this.anInt9163);
         }

         Class361_Sub1.method9240(var69, this.aClass526Array9181, (byte)-75);
         if(this.aClass145_9179 != null) {
            this.aClass145_9179.method1673();
         }
      } else {
         this.aClass145_9179 = null;
      }

      if((this.anInt9166 & 2) == 0) {
         this.anIntArrayArrayArray9175 = (int[][][])null;
         this.anIntArrayArrayArray9189 = (int[][][])null;
         this.anIntArrayArrayArray9172 = (int[][][])null;
      }

      this.anIntArrayArrayArray9177 = (int[][][])null;
      this.anIntArrayArrayArray9173 = (int[][][])null;
      this.anIntArrayArrayArray9185 = (int[][][])null;
      this.aClass526_Sub4ArrayArrayArray9161 = (Class526_Sub4[][][])null;
      this.aByteArrayArray9192 = (byte[][])null;
      this.aClass20_9193 = null;
      this.aFloatArrayArray9171 = (float[][])null;
      this.aFloatArrayArray9191 = (float[][])null;
      this.aFloatArrayArray9190 = (float[][])null;
   }

   public void method1720() {
      if(this.anInt9187 > 0) {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(int var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9192[var2 - 1][var3] >> 2) + (this.aByteArrayArray9192[var2 + 1][var3] >> 3) + (this.aByteArrayArray9192[var2][var3 - 1] >> 2) + (this.aByteArrayArray9192[var2][var3 + 1] >> 3) + (this.aByteArrayArray9192[var2][var3] >> 1));
            }
         }

         this.aClass526Array9181 = new Class526[this.aClass20_9193.method636(-1686499115)];
         this.aClass20_9193.method641(this.aClass526Array9181, (byte)61);

         for(var2 = 0; var2 < this.aClass526Array9181.length; ++var2) {
            ((Class526_Sub4)this.aClass526Array9181[var2]).method9334(this.anInt9187);
         }

         var2 = 24;
         if(this.anIntArrayArrayArray9177 != null) {
            var2 += 4;
         }

         if((this.anInt9167 & 7) != 0) {
            var2 += 12;
         }

         NativeHeapBuffer var65 = this.aClass174_Sub2_9169.aNativeHeap9515.method1354(this.anInt9187 * var2, false);
         Stream var4 = new Stream(var65);
         Class526_Sub4[] var5 = new Class526_Sub4[this.anInt9187];
         int var6 = Class568.method6836(this.anInt9187 / 4, 56648372);
         if(var6 < 1) {
            var6 = 1;
         }

         Class20 var7 = new Class20(var6);
         Class526_Sub4[] var8 = new Class526_Sub4[this.anInt9174];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               if(this.anIntArrayArrayArray9172[var9][var10] != null) {
                  Class526_Sub4[] var11 = this.aClass526_Sub4ArrayArrayArray9161[var9][var10];
                  int[] var12 = this.anIntArrayArrayArray9189[var9][var10];
                  int[] var13 = this.anIntArrayArrayArray9175[var9][var10];
                  int[] var14 = this.anIntArrayArrayArray9173[var9][var10];
                  int[] var15 = this.anIntArrayArrayArray9172[var9][var10];
                  int[] var16 = this.anIntArrayArrayArray9185 != null?this.anIntArrayArrayArray9185[var9][var10]:null;
                  int[] var17 = this.anIntArrayArrayArray9177 != null?this.anIntArrayArrayArray9177[var9][var10]:null;
                  if(var14 == null) {
                     var14 = var15;
                  }

                  float var18 = this.aFloatArrayArray9190[var9][var10];
                  float var19 = this.aFloatArrayArray9191[var9][var10];
                  float var20 = this.aFloatArrayArray9171[var9][var10];
                  float var21 = this.aFloatArrayArray9190[var9][var10 + 1];
                  float var22 = this.aFloatArrayArray9191[var9][var10 + 1];
                  float var23 = this.aFloatArrayArray9171[var9][var10 + 1];
                  float var24 = this.aFloatArrayArray9190[var9 + 1][var10 + 1];
                  float var25 = this.aFloatArrayArray9191[var9 + 1][var10 + 1];
                  float var26 = this.aFloatArrayArray9171[var9 + 1][var10 + 1];
                  float var27 = this.aFloatArrayArray9190[var9 + 1][var10];
                  float var28 = this.aFloatArrayArray9191[var9 + 1][var10];
                  float var29 = this.aFloatArrayArray9171[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;

                  int var37;
                  label346:
                  for(int var35 = 0; var35 < var15.length; ++var35) {
                     Class526_Sub4 var36 = var11[var35];

                     for(var37 = 0; var37 < var34; ++var37) {
                        if(var8[var37] == var36) {
                           continue label346;
                        }
                     }

                     var8[var34++] = var36;
                  }

                  short[] var81 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9] = new short[var15.length];

                  for(int var82 = 0; var82 < var15.length; ++var82) {
                     int var38 = (var9 << this.anInt1710 * -586661047) + var12[var82];
                     int var39 = (var10 << this.anInt1710 * -586661047) + var13[var82];
                     int var40 = var38 >> this.anInt9164;
                     int var41 = var39 >> this.anInt9164;
                     int var42 = var15[var82];
                     int var43 = var14[var82];
                     int var44 = var16 != null?var16[var82]:0;
                     long var45 = (long)var43 << 48 | (long)var42 << 32 | (long)(var40 << 16) | (long)var41;
                     int var47 = var12[var82];
                     int var48 = var13[var82];
                     byte var49 = 74;
                     int var50 = 0;
                     float var51 = 1.0F;
                     float var52;
                     float var53;
                     float var54;
                     float var58;
                     int var83;
                     if(var47 == 0 && var48 == 0) {
                        var52 = var18;
                        var53 = var19;
                        var54 = var20;
                        var83 = var49 - var30;
                     } else if(var47 == 0 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var21;
                        var53 = var22;
                        var54 = var23;
                        var83 = var49 - var31;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var24;
                        var53 = var25;
                        var54 = var26;
                        var83 = var49 - var32;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == 0) {
                        var52 = var27;
                        var53 = var28;
                        var54 = var29;
                        var83 = var49 - var33;
                     } else {
                        float var55 = (float)var47 / (float)(this.anInt1712 * 1934131013);
                        float var56 = (float)var48 / (float)(this.anInt1712 * 1934131013);
                        float var57 = var18 + (var27 - var18) * var55;
                        var58 = var19 + (var28 - var19) * var55;
                        float var59 = var20 + (var29 - var20) * var55;
                        float var60 = var21 + (var24 - var21) * var55;
                        float var61 = var22 + (var25 - var22) * var55;
                        float var62 = var23 + (var26 - var23) * var55;
                        var52 = var57 + (var60 - var57) * var56;
                        var53 = var58 + (var61 - var58) * var56;
                        var54 = var59 + (var62 - var59) * var56;
                        int var63 = var30 + ((var33 - var30) * var47 >> this.anInt1710 * -586661047);
                        int var64 = var31 + ((var32 - var31) * var47 >> this.anInt1710 * -586661047);
                        var83 = var49 - (var63 + ((var64 - var63) * var48 >> this.anInt1710 * -586661047));
                     }

                     if(var42 != -1) {
                        int var84 = (var42 & 127) * var83 >> 7;
                        if(var84 < 2) {
                           var84 = 2;
                        } else if(var84 > 126) {
                           var84 = 126;
                        }

                        var50 = Class661.anIntArray8516[var42 & '\uff80' | var84];
                        if((this.anInt9167 & 7) == 0) {
                           var51 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                           var51 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                        }
                     }

                     Class526 var86 = null;
                     if((var38 & this.anInt9168 - 1) == 0 && (var39 & this.anInt9168 - 1) == 0) {
                        var86 = var7.get(var45);
                     }

                     int var85;
                     if(var86 == null) {
                        if(var43 != var42) {
                           int var87 = (var43 & 127) * var83 >> 7;
                           if(var87 < 2) {
                              var87 = 2;
                           } else if(var87 > 126) {
                              var87 = 126;
                           }

                           var85 = Class661.anIntArray8516[var43 & '\uff80' | var87];
                           if((this.anInt9167 & 7) == 0) {
                              float var10000 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                              var58 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                              int var88 = var85 >> 16 & 255;
                              int var89 = var85 >> 8 & 255;
                              int var90 = var85 & 255;
                              var88 = (int)((float)var88 * var58);
                              if(var88 < 0) {
                                 var88 = 0;
                              } else if(var88 > 255) {
                                 var88 = 255;
                              }

                              var89 = (int)((float)var89 * var58);
                              if(var89 < 0) {
                                 var89 = 0;
                              } else if(var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if(var90 < 0) {
                                 var90 = 0;
                              } else if(var90 > 255) {
                                 var90 = 255;
                              }

                              var85 = var88 << 16 | var89 << 8 | var90;
                           }
                        } else {
                           var85 = var50;
                        }

                        if(this.aClass174_Sub2_9169.aBool9508) {
                           var4.method1250((float)var38);
                           var4.method1250((float)(this.method1707(var38, var39, 1234607155) + var44));
                           var4.method1250((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1250((float)var38);
                           var4.method1250((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1250(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1250(var52);
                              var4.method1250(var53);
                              var4.method1250(var54);
                           }
                        } else {
                           var4.method1251((float)var38);
                           var4.method1251((float)(this.method1707(var38, var39, 1914673690) + var44));
                           var4.method1251((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1251((float)var38);
                           var4.method1251((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1251(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1251(var52);
                              var4.method1251(var53);
                              var4.method1251(var54);
                           }
                        }

                        var37 = this.anInt9163++;
                        var81[var82] = (short)var37;
                        if(var42 != -1) {
                           var5[var37] = var11[var82];
                        }

                        var7.put(new Class526_Sub17(var81[var82]), var45);
                     } else {
                        var81[var82] = ((Class526_Sub17)var86).aShort10479;
                        var37 = var81[var82] & '\uffff';
                        if(var42 != -1 && var11[var82].aLong7156 * -6805155999452426801L < var5[var37].aLong7156 * -6805155999452426801L) {
                           var5[var37] = var11[var82];
                        }
                     }

                     for(var85 = 0; var85 < var34; ++var85) {
                        var8[var85].method9325(var37, var50, var83, var51);
                     }

                     ++this.anInt9194;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.anInt9163; ++var9) {
            Class526_Sub4 var66 = var5[var9];
            if(var66 != null) {
               var66.method9320(var9);
            }
         }

         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               short[] var68 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9];
               if(var68 != null) {
                  int var71 = 0;

                  for(int var73 = 0; var73 < var68.length; ++var71) {
                     int var74 = var68[var73++] & '\uffff';
                     int var75 = var68[var73++] & '\uffff';
                     int var76 = var68[var73++] & '\uffff';
                     Class526_Sub4 var77 = var5[var74];
                     Class526_Sub4 var78 = var5[var75];
                     Class526_Sub4 var79 = var5[var76];
                     Class526_Sub4 var80 = null;
                     if(var77 != null) {
                        var77.method9321(var9, var10, var71);
                        var80 = var77;
                     }

                     if(var78 != null) {
                        var78.method9321(var9, var10, var71);
                        if(var80 == null || var78.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var78;
                        }
                     }

                     if(var79 != null) {
                        var79.method9321(var9, var10, var71);
                        if(var80 == null || var79.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var79;
                        }
                     }

                     if(var80 != null) {
                        if(var77 != null) {
                           var80.method9320(var74);
                        }

                        if(var78 != null) {
                           var80.method9320(var75);
                        }

                        if(var79 != null) {
                           var80.method9320(var76);
                        }

                        var80.method9321(var9, var10, var71);
                     }
                  }
               }
            }
         }

         var4.method1252();
         this.anInterface15_9182 = this.aClass174_Sub2_9169.method8631(var2, var65, var4.method1247(), false);
         if(this.anInterface15_9182 instanceof Class135_Sub1) {
            var65.method1228();
         }

         this.aClass129_9180 = new Class129(this.anInterface15_9182, 5126, 3, 0);
         this.aClass129_9184 = new Class129(this.anInterface15_9182, 5121, 4, 12);
         byte var67;
         if(this.anIntArrayArrayArray9177 != null) {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 3, 16);
            var67 = 28;
         } else {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 2, 16);
            var67 = 24;
         }

         if((this.anInt9167 & 7) != 0) {
            this.aClass129_9183 = new Class129(this.anInterface15_9182, 5126, 3, var67);
         }

         long[] var69 = new long[this.aClass526Array9181.length];

         for(int var70 = 0; var70 < this.aClass526Array9181.length; ++var70) {
            Class526_Sub4 var72 = (Class526_Sub4)this.aClass526Array9181[var70];
            var69[var70] = var72.aLong7156 * -6805155999452426801L;
            var72.method9322(this.anInt9163);
         }

         Class361_Sub1.method9240(var69, this.aClass526Array9181, (byte)-65);
         if(this.aClass145_9179 != null) {
            this.aClass145_9179.method1673();
         }
      } else {
         this.aClass145_9179 = null;
      }

      if((this.anInt9166 & 2) == 0) {
         this.anIntArrayArrayArray9175 = (int[][][])null;
         this.anIntArrayArrayArray9189 = (int[][][])null;
         this.anIntArrayArrayArray9172 = (int[][][])null;
      }

      this.anIntArrayArrayArray9177 = (int[][][])null;
      this.anIntArrayArrayArray9173 = (int[][][])null;
      this.anIntArrayArrayArray9185 = (int[][][])null;
      this.aClass526_Sub4ArrayArrayArray9161 = (Class526_Sub4[][][])null;
      this.aByteArrayArray9192 = (byte[][])null;
      this.aClass20_9193 = null;
      this.aFloatArrayArray9171 = (float[][])null;
      this.aFloatArrayArray9191 = (float[][])null;
      this.aFloatArrayArray9190 = (float[][])null;
   }

   public void method1739(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub2_9169.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9177 == null) {
         this.anIntArrayArrayArray9177 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9185 == null) {
         this.anIntArrayArrayArray9185 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9189[var1][var2] = var3;
      this.anIntArrayArrayArray9175[var1][var2] = var5;
      this.anIntArrayArrayArray9172[var1][var2] = var7;
      this.anIntArrayArrayArray9173[var1][var2] = var8;
      if(this.anIntArrayArrayArray9177 != null) {
         this.anIntArrayArrayArray9177[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9185 != null) {
         this.anIntArrayArrayArray9185[var1][var2] = var4;
      }

      Class526_Sub4[] var14 = this.aClass526_Sub4ArrayArrayArray9161[var1][var2] = new Class526_Sub4[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9167 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)-46).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9193.get(var18); var20 != null; var20 = this.aClass20_9193.method635(-1734407897)) {
            Class526_Sub4 var21 = (Class526_Sub4)var20;
            if(var21.anInt10380 == var16 && var21.aFloat10375 == (float)var17 && var21.aClass172_10373.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub4(this, var16, var17, var11);
            this.aClass20_9193.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub4)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9178[var1][var2] = (byte)(this.aByteArrayArray9178[var1][var2] | 1);
      }

      if(var7.length > this.anInt9174) {
         this.anInt9174 = var7.length;
      }

      this.anInt9187 += var7.length;
   }

   public void method1716(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub2_9169.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9177 == null) {
         this.anIntArrayArrayArray9177 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9185 == null) {
         this.anIntArrayArrayArray9185 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9189[var1][var2] = var3;
      this.anIntArrayArrayArray9175[var1][var2] = var5;
      this.anIntArrayArrayArray9172[var1][var2] = var7;
      this.anIntArrayArrayArray9173[var1][var2] = var8;
      if(this.anIntArrayArrayArray9177 != null) {
         this.anIntArrayArrayArray9177[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9185 != null) {
         this.anIntArrayArrayArray9185[var1][var2] = var4;
      }

      Class526_Sub4[] var14 = this.aClass526_Sub4ArrayArrayArray9161[var1][var2] = new Class526_Sub4[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9167 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)38).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9193.get(var18); var20 != null; var20 = this.aClass20_9193.method635(-1734407897)) {
            Class526_Sub4 var21 = (Class526_Sub4)var20;
            if(var21.anInt10380 == var16 && var21.aFloat10375 == (float)var17 && var21.aClass172_10373.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub4(this, var16, var17, var11);
            this.aClass20_9193.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub4)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9178[var1][var2] = (byte)(this.aByteArrayArray9178[var1][var2] | 1);
      }

      if(var7.length > this.anInt9174) {
         this.anInt9174 = var7.length;
      }

      this.anInt9187 += var7.length;
   }

   public void method1717(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub2_9169.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9177 == null) {
         this.anIntArrayArrayArray9177 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9185 == null) {
         this.anIntArrayArrayArray9185 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9189[var1][var2] = var3;
      this.anIntArrayArrayArray9175[var1][var2] = var5;
      this.anIntArrayArrayArray9172[var1][var2] = var7;
      this.anIntArrayArrayArray9173[var1][var2] = var8;
      if(this.anIntArrayArrayArray9177 != null) {
         this.anIntArrayArrayArray9177[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9185 != null) {
         this.anIntArrayArrayArray9185[var1][var2] = var4;
      }

      Class526_Sub4[] var14 = this.aClass526_Sub4ArrayArrayArray9161[var1][var2] = new Class526_Sub4[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9167 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)-23).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9193.get(var18); var20 != null; var20 = this.aClass20_9193.method635(-1734407897)) {
            Class526_Sub4 var21 = (Class526_Sub4)var20;
            if(var21.anInt10380 == var16 && var21.aFloat10375 == (float)var17 && var21.aClass172_10373.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub4(this, var16, var17, var11);
            this.aClass20_9193.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub4)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9178[var1][var2] = (byte)(this.aByteArrayArray9178[var1][var2] | 1);
      }

      if(var7.length > this.anInt9174) {
         this.anInt9174 = var7.length;
      }

      this.anInt9187 += var7.length;
   }

   public void method1723(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      Class169 var13 = this.aClass174_Sub2_9169.aClass169_2035;
      if(var6 != null && this.anIntArrayArrayArray9177 == null) {
         this.anIntArrayArrayArray9177 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      if(var4 != null && this.anIntArrayArrayArray9185 == null) {
         this.anIntArrayArrayArray9185 = new int[this.anInt1711 * 1966165105][this.anInt1713 * -810756899][];
      }

      this.anIntArrayArrayArray9189[var1][var2] = var3;
      this.anIntArrayArrayArray9175[var1][var2] = var5;
      this.anIntArrayArrayArray9172[var1][var2] = var7;
      this.anIntArrayArrayArray9173[var1][var2] = var8;
      if(this.anIntArrayArrayArray9177 != null) {
         this.anIntArrayArrayArray9177[var1][var2] = var6;
      }

      if(this.anIntArrayArrayArray9185 != null) {
         this.anIntArrayArrayArray9185[var1][var2] = var4;
      }

      Class526_Sub4[] var14 = this.aClass526_Sub4ArrayArrayArray9161[var1][var2] = new Class526_Sub4[var7.length];

      for(int var15 = 0; var15 < var7.length; ++var15) {
         int var16 = var9[var15];
         int var17 = var10[var15];
         if((this.anInt9167 & 32) != 0 && var16 != -1 && var13.method2122(var16, (byte)-29).aBool1981) {
            var17 = 128;
            var16 = -1;
         }

         long var18 = (long)(var11.anInt2018 * 1590947963) << 48 | (long)(var11.anInt2020 * -1648426019) << 42 | (long)(var11.anInt2019 * -1808050665) << 28 | (long)(var17 << 14) | (long)var16;

         Class526 var20;
         for(var20 = this.aClass20_9193.get(var18); var20 != null; var20 = this.aClass20_9193.method635(-1734407897)) {
            Class526_Sub4 var21 = (Class526_Sub4)var20;
            if(var21.anInt10380 == var16 && var21.aFloat10375 == (float)var17 && var21.aClass172_10373.method2158(var11, -781592329)) {
               break;
            }
         }

         if(var20 == null) {
            var14[var15] = new Class526_Sub4(this, var16, var17, var11);
            this.aClass20_9193.put(var14[var15], var18);
         } else {
            var14[var15] = (Class526_Sub4)var20;
         }
      }

      if(var12) {
         this.aByteArrayArray9178[var1][var2] = (byte)(this.aByteArrayArray9178[var1][var2] | 1);
      }

      if(var7.length > this.anInt9174) {
         this.anInt9174 = var7.length;
      }

      this.anInt9187 += var7.length;
   }

   public void method1727(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      Class184 var9 = this.aClass174_Sub2_9169.method2247((byte)6);
      if(this.anInt9187 > 0 && var9 != null) {
         this.aClass174_Sub2_9169.method8613();
         this.aClass174_Sub2_9169.method8700(false);
         this.aClass174_Sub2_9169.method8646(false);
         this.aClass174_Sub2_9169.method8681(false);
         this.aClass174_Sub2_9169.method8648(false);
         this.aClass174_Sub2_9169.method8651(0);
         this.aClass174_Sub2_9169.method8639(-2);
         this.aClass174_Sub2_9169.method8641((Class124)null);
         aFloatArray9188[0] = (float)var3 / (128.0F * (float)(this.anInt1712 * 1934131013) * (float)var9.method2691());
         aFloatArray9188[1] = 0.0F;
         aFloatArray9188[2] = 0.0F;
         aFloatArray9188[3] = 0.0F;
         aFloatArray9188[4] = 0.0F;
         aFloatArray9188[5] = (float)var3 / (128.0F * (float)(this.anInt1712 * 1934131013) * (float)var9.method2693());
         aFloatArray9188[6] = 0.0F;
         aFloatArray9188[7] = 0.0F;
         aFloatArray9188[8] = 0.0F;
         aFloatArray9188[9] = 0.0F;
         aFloatArray9188[10] = 0.0F;
         aFloatArray9188[11] = 0.0F;
         aFloatArray9188[12] = -1.0F - ((float)(var4 * var3) / 128.0F - (float)(var1 * 2)) / (float)var9.method2691();
         aFloatArray9188[13] = 1.0F - ((float)(2 * var2) + (float)(var7 * var3) / 128.0F) / (float)var9.method2693();
         aFloatArray9188[14] = 0.0F;
         aFloatArray9188[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(aFloatArray9188, 0);
         aFloatArray9188[0] = 1.0F;
         aFloatArray9188[1] = 0.0F;
         aFloatArray9188[2] = 0.0F;
         aFloatArray9188[3] = 0.0F;
         aFloatArray9188[4] = 0.0F;
         aFloatArray9188[5] = 0.0F;
         aFloatArray9188[6] = 1.0F;
         aFloatArray9188[7] = 0.0F;
         aFloatArray9188[8] = 0.0F;
         aFloatArray9188[9] = 1.0F;
         aFloatArray9188[10] = 0.0F;
         aFloatArray9188[11] = 0.0F;
         aFloatArray9188[12] = 0.0F;
         aFloatArray9188[13] = 0.0F;
         aFloatArray9188[14] = 0.0F;
         aFloatArray9188[15] = 1.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(aFloatArray9188, 0);
         if((this.anInt9167 & 7) != 0) {
            this.aClass174_Sub2_9169.method8646(true);
            this.aClass174_Sub2_9169.method8623();
         } else {
            this.aClass174_Sub2_9169.method8646(false);
         }

         this.aClass174_Sub2_9169.method8634(this.aClass129_9180, this.aClass129_9183, this.aClass129_9184, this.aClass129_9186);
         if(this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655.buffer.length < this.anInt9194 * 2) {
            this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655 = new Class526_Sub36_Sub1(this.anInt9194 * 2);
         } else {
            this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655.pos = 0;
         }

         int var10 = 0;
         Class526_Sub36_Sub1 var11 = this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655;
         int var12;
         int var13;
         int var14;
         short[] var15;
         int var16;
         if(this.aClass174_Sub2_9169.aBool9508) {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.anInt1711 * 1966165105 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if(var8[var14 - var4][var12 - var5]) {
                     var15 = this.aShortArrayArray9170[var13];
                     if(var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.writeShort(var15[var16] & '\uffff', -805078716);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         } else {
            for(var12 = var5; var12 < var7; ++var12) {
               var13 = var12 * this.anInt1711 * 1966165105 + var4;

               for(var14 = var4; var14 < var6; ++var14) {
                  if(var8[var14 - var4][var12 - var5]) {
                     var15 = this.aShortArrayArray9170[var13];
                     if(var15 != null) {
                        for(var16 = 0; var16 < var15.length; ++var16) {
                           var11.method9610(var15[var16] & '\uffff', (byte)0);
                           ++var10;
                        }
                     }
                  }

                  ++var13;
               }
            }
         }

         if(var10 > 0) {
            Class138_Sub1 var17 = new Class138_Sub1(this.aClass174_Sub2_9169, 5123, var11.buffer, var11.pos * 301018015);
            this.aClass174_Sub2_9169.method8664(var17, 4, 0, var10);
         }

      }
   }

   public void method1705() {
      if(this.anInt9187 > 0) {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(int var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9192[var2 - 1][var3] >> 2) + (this.aByteArrayArray9192[var2 + 1][var3] >> 3) + (this.aByteArrayArray9192[var2][var3 - 1] >> 2) + (this.aByteArrayArray9192[var2][var3 + 1] >> 3) + (this.aByteArrayArray9192[var2][var3] >> 1));
            }
         }

         this.aClass526Array9181 = new Class526[this.aClass20_9193.method636(-728466727)];
         this.aClass20_9193.method641(this.aClass526Array9181, (byte)13);

         for(var2 = 0; var2 < this.aClass526Array9181.length; ++var2) {
            ((Class526_Sub4)this.aClass526Array9181[var2]).method9334(this.anInt9187);
         }

         var2 = 24;
         if(this.anIntArrayArrayArray9177 != null) {
            var2 += 4;
         }

         if((this.anInt9167 & 7) != 0) {
            var2 += 12;
         }

         NativeHeapBuffer var65 = this.aClass174_Sub2_9169.aNativeHeap9515.method1354(this.anInt9187 * var2, false);
         Stream var4 = new Stream(var65);
         Class526_Sub4[] var5 = new Class526_Sub4[this.anInt9187];
         int var6 = Class568.method6836(this.anInt9187 / 4, 991443365);
         if(var6 < 1) {
            var6 = 1;
         }

         Class20 var7 = new Class20(var6);
         Class526_Sub4[] var8 = new Class526_Sub4[this.anInt9174];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               if(this.anIntArrayArrayArray9172[var9][var10] != null) {
                  Class526_Sub4[] var11 = this.aClass526_Sub4ArrayArrayArray9161[var9][var10];
                  int[] var12 = this.anIntArrayArrayArray9189[var9][var10];
                  int[] var13 = this.anIntArrayArrayArray9175[var9][var10];
                  int[] var14 = this.anIntArrayArrayArray9173[var9][var10];
                  int[] var15 = this.anIntArrayArrayArray9172[var9][var10];
                  int[] var16 = this.anIntArrayArrayArray9185 != null?this.anIntArrayArrayArray9185[var9][var10]:null;
                  int[] var17 = this.anIntArrayArrayArray9177 != null?this.anIntArrayArrayArray9177[var9][var10]:null;
                  if(var14 == null) {
                     var14 = var15;
                  }

                  float var18 = this.aFloatArrayArray9190[var9][var10];
                  float var19 = this.aFloatArrayArray9191[var9][var10];
                  float var20 = this.aFloatArrayArray9171[var9][var10];
                  float var21 = this.aFloatArrayArray9190[var9][var10 + 1];
                  float var22 = this.aFloatArrayArray9191[var9][var10 + 1];
                  float var23 = this.aFloatArrayArray9171[var9][var10 + 1];
                  float var24 = this.aFloatArrayArray9190[var9 + 1][var10 + 1];
                  float var25 = this.aFloatArrayArray9191[var9 + 1][var10 + 1];
                  float var26 = this.aFloatArrayArray9171[var9 + 1][var10 + 1];
                  float var27 = this.aFloatArrayArray9190[var9 + 1][var10];
                  float var28 = this.aFloatArrayArray9191[var9 + 1][var10];
                  float var29 = this.aFloatArrayArray9171[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;

                  int var37;
                  label346:
                  for(int var35 = 0; var35 < var15.length; ++var35) {
                     Class526_Sub4 var36 = var11[var35];

                     for(var37 = 0; var37 < var34; ++var37) {
                        if(var8[var37] == var36) {
                           continue label346;
                        }
                     }

                     var8[var34++] = var36;
                  }

                  short[] var81 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9] = new short[var15.length];

                  for(int var82 = 0; var82 < var15.length; ++var82) {
                     int var38 = (var9 << this.anInt1710 * -586661047) + var12[var82];
                     int var39 = (var10 << this.anInt1710 * -586661047) + var13[var82];
                     int var40 = var38 >> this.anInt9164;
                     int var41 = var39 >> this.anInt9164;
                     int var42 = var15[var82];
                     int var43 = var14[var82];
                     int var44 = var16 != null?var16[var82]:0;
                     long var45 = (long)var43 << 48 | (long)var42 << 32 | (long)(var40 << 16) | (long)var41;
                     int var47 = var12[var82];
                     int var48 = var13[var82];
                     byte var49 = 74;
                     int var50 = 0;
                     float var51 = 1.0F;
                     float var52;
                     float var53;
                     float var54;
                     float var58;
                     int var83;
                     if(var47 == 0 && var48 == 0) {
                        var52 = var18;
                        var53 = var19;
                        var54 = var20;
                        var83 = var49 - var30;
                     } else if(var47 == 0 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var21;
                        var53 = var22;
                        var54 = var23;
                        var83 = var49 - var31;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var24;
                        var53 = var25;
                        var54 = var26;
                        var83 = var49 - var32;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == 0) {
                        var52 = var27;
                        var53 = var28;
                        var54 = var29;
                        var83 = var49 - var33;
                     } else {
                        float var55 = (float)var47 / (float)(this.anInt1712 * 1934131013);
                        float var56 = (float)var48 / (float)(this.anInt1712 * 1934131013);
                        float var57 = var18 + (var27 - var18) * var55;
                        var58 = var19 + (var28 - var19) * var55;
                        float var59 = var20 + (var29 - var20) * var55;
                        float var60 = var21 + (var24 - var21) * var55;
                        float var61 = var22 + (var25 - var22) * var55;
                        float var62 = var23 + (var26 - var23) * var55;
                        var52 = var57 + (var60 - var57) * var56;
                        var53 = var58 + (var61 - var58) * var56;
                        var54 = var59 + (var62 - var59) * var56;
                        int var63 = var30 + ((var33 - var30) * var47 >> this.anInt1710 * -586661047);
                        int var64 = var31 + ((var32 - var31) * var47 >> this.anInt1710 * -586661047);
                        var83 = var49 - (var63 + ((var64 - var63) * var48 >> this.anInt1710 * -586661047));
                     }

                     if(var42 != -1) {
                        int var84 = (var42 & 127) * var83 >> 7;
                        if(var84 < 2) {
                           var84 = 2;
                        } else if(var84 > 126) {
                           var84 = 126;
                        }

                        var50 = Class661.anIntArray8516[var42 & '\uff80' | var84];
                        if((this.anInt9167 & 7) == 0) {
                           var51 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                           var51 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                        }
                     }

                     Class526 var86 = null;
                     if((var38 & this.anInt9168 - 1) == 0 && (var39 & this.anInt9168 - 1) == 0) {
                        var86 = var7.get(var45);
                     }

                     int var85;
                     if(var86 == null) {
                        if(var43 != var42) {
                           int var87 = (var43 & 127) * var83 >> 7;
                           if(var87 < 2) {
                              var87 = 2;
                           } else if(var87 > 126) {
                              var87 = 126;
                           }

                           var85 = Class661.anIntArray8516[var43 & '\uff80' | var87];
                           if((this.anInt9167 & 7) == 0) {
                              float var10000 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                              var58 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                              int var88 = var85 >> 16 & 255;
                              int var89 = var85 >> 8 & 255;
                              int var90 = var85 & 255;
                              var88 = (int)((float)var88 * var58);
                              if(var88 < 0) {
                                 var88 = 0;
                              } else if(var88 > 255) {
                                 var88 = 255;
                              }

                              var89 = (int)((float)var89 * var58);
                              if(var89 < 0) {
                                 var89 = 0;
                              } else if(var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if(var90 < 0) {
                                 var90 = 0;
                              } else if(var90 > 255) {
                                 var90 = 255;
                              }

                              var85 = var88 << 16 | var89 << 8 | var90;
                           }
                        } else {
                           var85 = var50;
                        }

                        if(this.aClass174_Sub2_9169.aBool9508) {
                           var4.method1250((float)var38);
                           var4.method1250((float)(this.method1707(var38, var39, 177616962) + var44));
                           var4.method1250((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1250((float)var38);
                           var4.method1250((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1250(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1250(var52);
                              var4.method1250(var53);
                              var4.method1250(var54);
                           }
                        } else {
                           var4.method1251((float)var38);
                           var4.method1251((float)(this.method1707(var38, var39, 1752414498) + var44));
                           var4.method1251((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1251((float)var38);
                           var4.method1251((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1251(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1251(var52);
                              var4.method1251(var53);
                              var4.method1251(var54);
                           }
                        }

                        var37 = this.anInt9163++;
                        var81[var82] = (short)var37;
                        if(var42 != -1) {
                           var5[var37] = var11[var82];
                        }

                        var7.put(new Class526_Sub17(var81[var82]), var45);
                     } else {
                        var81[var82] = ((Class526_Sub17)var86).aShort10479;
                        var37 = var81[var82] & '\uffff';
                        if(var42 != -1 && var11[var82].aLong7156 * -6805155999452426801L < var5[var37].aLong7156 * -6805155999452426801L) {
                           var5[var37] = var11[var82];
                        }
                     }

                     for(var85 = 0; var85 < var34; ++var85) {
                        var8[var85].method9325(var37, var50, var83, var51);
                     }

                     ++this.anInt9194;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.anInt9163; ++var9) {
            Class526_Sub4 var66 = var5[var9];
            if(var66 != null) {
               var66.method9320(var9);
            }
         }

         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               short[] var68 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9];
               if(var68 != null) {
                  int var71 = 0;

                  for(int var73 = 0; var73 < var68.length; ++var71) {
                     int var74 = var68[var73++] & '\uffff';
                     int var75 = var68[var73++] & '\uffff';
                     int var76 = var68[var73++] & '\uffff';
                     Class526_Sub4 var77 = var5[var74];
                     Class526_Sub4 var78 = var5[var75];
                     Class526_Sub4 var79 = var5[var76];
                     Class526_Sub4 var80 = null;
                     if(var77 != null) {
                        var77.method9321(var9, var10, var71);
                        var80 = var77;
                     }

                     if(var78 != null) {
                        var78.method9321(var9, var10, var71);
                        if(var80 == null || var78.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var78;
                        }
                     }

                     if(var79 != null) {
                        var79.method9321(var9, var10, var71);
                        if(var80 == null || var79.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var79;
                        }
                     }

                     if(var80 != null) {
                        if(var77 != null) {
                           var80.method9320(var74);
                        }

                        if(var78 != null) {
                           var80.method9320(var75);
                        }

                        if(var79 != null) {
                           var80.method9320(var76);
                        }

                        var80.method9321(var9, var10, var71);
                     }
                  }
               }
            }
         }

         var4.method1252();
         this.anInterface15_9182 = this.aClass174_Sub2_9169.method8631(var2, var65, var4.method1247(), false);
         if(this.anInterface15_9182 instanceof Class135_Sub1) {
            var65.method1228();
         }

         this.aClass129_9180 = new Class129(this.anInterface15_9182, 5126, 3, 0);
         this.aClass129_9184 = new Class129(this.anInterface15_9182, 5121, 4, 12);
         byte var67;
         if(this.anIntArrayArrayArray9177 != null) {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 3, 16);
            var67 = 28;
         } else {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 2, 16);
            var67 = 24;
         }

         if((this.anInt9167 & 7) != 0) {
            this.aClass129_9183 = new Class129(this.anInterface15_9182, 5126, 3, var67);
         }

         long[] var69 = new long[this.aClass526Array9181.length];

         for(int var70 = 0; var70 < this.aClass526Array9181.length; ++var70) {
            Class526_Sub4 var72 = (Class526_Sub4)this.aClass526Array9181[var70];
            var69[var70] = var72.aLong7156 * -6805155999452426801L;
            var72.method9322(this.anInt9163);
         }

         Class361_Sub1.method9240(var69, this.aClass526Array9181, (byte)-89);
         if(this.aClass145_9179 != null) {
            this.aClass145_9179.method1673();
         }
      } else {
         this.aClass145_9179 = null;
      }

      if((this.anInt9166 & 2) == 0) {
         this.anIntArrayArrayArray9175 = (int[][][])null;
         this.anIntArrayArrayArray9189 = (int[][][])null;
         this.anIntArrayArrayArray9172 = (int[][][])null;
      }

      this.anIntArrayArrayArray9177 = (int[][][])null;
      this.anIntArrayArrayArray9173 = (int[][][])null;
      this.anIntArrayArrayArray9185 = (int[][][])null;
      this.aClass526_Sub4ArrayArrayArray9161 = (Class526_Sub4[][][])null;
      this.aByteArrayArray9192 = (byte[][])null;
      this.aClass20_9193 = null;
      this.aFloatArrayArray9171 = (float[][])null;
      this.aFloatArrayArray9191 = (float[][])null;
      this.aFloatArrayArray9190 = (float[][])null;
   }

   public void method1721() {
      if(this.anInt9187 > 0) {
         byte[][] var1 = new byte[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

         int var2;
         for(var2 = 1; var2 < this.anInt1711 * 1966165105; ++var2) {
            for(int var3 = 1; var3 < this.anInt1713 * -810756899; ++var3) {
               var1[var2][var3] = (byte)((this.aByteArrayArray9192[var2 - 1][var3] >> 2) + (this.aByteArrayArray9192[var2 + 1][var3] >> 3) + (this.aByteArrayArray9192[var2][var3 - 1] >> 2) + (this.aByteArrayArray9192[var2][var3 + 1] >> 3) + (this.aByteArrayArray9192[var2][var3] >> 1));
            }
         }

         this.aClass526Array9181 = new Class526[this.aClass20_9193.method636(-1949632483)];
         this.aClass20_9193.method641(this.aClass526Array9181, (byte)-3);

         for(var2 = 0; var2 < this.aClass526Array9181.length; ++var2) {
            ((Class526_Sub4)this.aClass526Array9181[var2]).method9334(this.anInt9187);
         }

         var2 = 24;
         if(this.anIntArrayArrayArray9177 != null) {
            var2 += 4;
         }

         if((this.anInt9167 & 7) != 0) {
            var2 += 12;
         }

         NativeHeapBuffer var65 = this.aClass174_Sub2_9169.aNativeHeap9515.method1354(this.anInt9187 * var2, false);
         Stream var4 = new Stream(var65);
         Class526_Sub4[] var5 = new Class526_Sub4[this.anInt9187];
         int var6 = Class568.method6836(this.anInt9187 / 4, 746873474);
         if(var6 < 1) {
            var6 = 1;
         }

         Class20 var7 = new Class20(var6);
         Class526_Sub4[] var8 = new Class526_Sub4[this.anInt9174];

         int var9;
         int var10;
         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               if(this.anIntArrayArrayArray9172[var9][var10] != null) {
                  Class526_Sub4[] var11 = this.aClass526_Sub4ArrayArrayArray9161[var9][var10];
                  int[] var12 = this.anIntArrayArrayArray9189[var9][var10];
                  int[] var13 = this.anIntArrayArrayArray9175[var9][var10];
                  int[] var14 = this.anIntArrayArrayArray9173[var9][var10];
                  int[] var15 = this.anIntArrayArrayArray9172[var9][var10];
                  int[] var16 = this.anIntArrayArrayArray9185 != null?this.anIntArrayArrayArray9185[var9][var10]:null;
                  int[] var17 = this.anIntArrayArrayArray9177 != null?this.anIntArrayArrayArray9177[var9][var10]:null;
                  if(var14 == null) {
                     var14 = var15;
                  }

                  float var18 = this.aFloatArrayArray9190[var9][var10];
                  float var19 = this.aFloatArrayArray9191[var9][var10];
                  float var20 = this.aFloatArrayArray9171[var9][var10];
                  float var21 = this.aFloatArrayArray9190[var9][var10 + 1];
                  float var22 = this.aFloatArrayArray9191[var9][var10 + 1];
                  float var23 = this.aFloatArrayArray9171[var9][var10 + 1];
                  float var24 = this.aFloatArrayArray9190[var9 + 1][var10 + 1];
                  float var25 = this.aFloatArrayArray9191[var9 + 1][var10 + 1];
                  float var26 = this.aFloatArrayArray9171[var9 + 1][var10 + 1];
                  float var27 = this.aFloatArrayArray9190[var9 + 1][var10];
                  float var28 = this.aFloatArrayArray9191[var9 + 1][var10];
                  float var29 = this.aFloatArrayArray9171[var9 + 1][var10];
                  int var30 = var1[var9][var10] & 255;
                  int var31 = var1[var9][var10 + 1] & 255;
                  int var32 = var1[var9 + 1][var10 + 1] & 255;
                  int var33 = var1[var9 + 1][var10] & 255;
                  int var34 = 0;

                  int var37;
                  label346:
                  for(int var35 = 0; var35 < var15.length; ++var35) {
                     Class526_Sub4 var36 = var11[var35];

                     for(var37 = 0; var37 < var34; ++var37) {
                        if(var8[var37] == var36) {
                           continue label346;
                        }
                     }

                     var8[var34++] = var36;
                  }

                  short[] var81 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9] = new short[var15.length];

                  for(int var82 = 0; var82 < var15.length; ++var82) {
                     int var38 = (var9 << this.anInt1710 * -586661047) + var12[var82];
                     int var39 = (var10 << this.anInt1710 * -586661047) + var13[var82];
                     int var40 = var38 >> this.anInt9164;
                     int var41 = var39 >> this.anInt9164;
                     int var42 = var15[var82];
                     int var43 = var14[var82];
                     int var44 = var16 != null?var16[var82]:0;
                     long var45 = (long)var43 << 48 | (long)var42 << 32 | (long)(var40 << 16) | (long)var41;
                     int var47 = var12[var82];
                     int var48 = var13[var82];
                     byte var49 = 74;
                     int var50 = 0;
                     float var51 = 1.0F;
                     float var52;
                     float var53;
                     float var54;
                     float var58;
                     int var83;
                     if(var47 == 0 && var48 == 0) {
                        var52 = var18;
                        var53 = var19;
                        var54 = var20;
                        var83 = var49 - var30;
                     } else if(var47 == 0 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var21;
                        var53 = var22;
                        var54 = var23;
                        var83 = var49 - var31;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == this.anInt1712 * 1934131013) {
                        var52 = var24;
                        var53 = var25;
                        var54 = var26;
                        var83 = var49 - var32;
                     } else if(var47 == this.anInt1712 * 1934131013 && var48 == 0) {
                        var52 = var27;
                        var53 = var28;
                        var54 = var29;
                        var83 = var49 - var33;
                     } else {
                        float var55 = (float)var47 / (float)(this.anInt1712 * 1934131013);
                        float var56 = (float)var48 / (float)(this.anInt1712 * 1934131013);
                        float var57 = var18 + (var27 - var18) * var55;
                        var58 = var19 + (var28 - var19) * var55;
                        float var59 = var20 + (var29 - var20) * var55;
                        float var60 = var21 + (var24 - var21) * var55;
                        float var61 = var22 + (var25 - var22) * var55;
                        float var62 = var23 + (var26 - var23) * var55;
                        var52 = var57 + (var60 - var57) * var56;
                        var53 = var58 + (var61 - var58) * var56;
                        var54 = var59 + (var62 - var59) * var56;
                        int var63 = var30 + ((var33 - var30) * var47 >> this.anInt1710 * -586661047);
                        int var64 = var31 + ((var32 - var31) * var47 >> this.anInt1710 * -586661047);
                        var83 = var49 - (var63 + ((var64 - var63) * var48 >> this.anInt1710 * -586661047));
                     }

                     if(var42 != -1) {
                        int var84 = (var42 & 127) * var83 >> 7;
                        if(var84 < 2) {
                           var84 = 2;
                        } else if(var84 > 126) {
                           var84 = 126;
                        }

                        var50 = Class661.anIntArray8516[var42 & '\uff80' | var84];
                        if((this.anInt9167 & 7) == 0) {
                           var51 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                           var51 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                        }
                     }

                     Class526 var86 = null;
                     if((var38 & this.anInt9168 - 1) == 0 && (var39 & this.anInt9168 - 1) == 0) {
                        var86 = var7.get(var45);
                     }

                     int var85;
                     if(var86 == null) {
                        if(var43 != var42) {
                           int var87 = (var43 & 127) * var83 >> 7;
                           if(var87 < 2) {
                              var87 = 2;
                           } else if(var87 > 126) {
                              var87 = 126;
                           }

                           var85 = Class661.anIntArray8516[var43 & '\uff80' | var87];
                           if((this.anInt9167 & 7) == 0) {
                              float var10000 = this.aClass174_Sub2_9169.aFloatArray9657[0] * var52 + this.aClass174_Sub2_9169.aFloatArray9657[1] * var53 + this.aClass174_Sub2_9169.aFloatArray9657[2] * var54;
                              var58 = this.aClass174_Sub2_9169.aFloat9585 + var51 * (var51 > 0.0F?this.aClass174_Sub2_9169.aFloat9464:this.aClass174_Sub2_9169.aFloat9587);
                              int var88 = var85 >> 16 & 255;
                              int var89 = var85 >> 8 & 255;
                              int var90 = var85 & 255;
                              var88 = (int)((float)var88 * var58);
                              if(var88 < 0) {
                                 var88 = 0;
                              } else if(var88 > 255) {
                                 var88 = 255;
                              }

                              var89 = (int)((float)var89 * var58);
                              if(var89 < 0) {
                                 var89 = 0;
                              } else if(var89 > 255) {
                                 var89 = 255;
                              }

                              var90 = (int)((float)var90 * var58);
                              if(var90 < 0) {
                                 var90 = 0;
                              } else if(var90 > 255) {
                                 var90 = 255;
                              }

                              var85 = var88 << 16 | var89 << 8 | var90;
                           }
                        } else {
                           var85 = var50;
                        }

                        if(this.aClass174_Sub2_9169.aBool9508) {
                           var4.method1250((float)var38);
                           var4.method1250((float)(this.method1707(var38, var39, -688892414) + var44));
                           var4.method1250((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1250((float)var38);
                           var4.method1250((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1250(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1250(var52);
                              var4.method1250(var53);
                              var4.method1250(var54);
                           }
                        } else {
                           var4.method1251((float)var38);
                           var4.method1251((float)(this.method1707(var38, var39, 1642192501) + var44));
                           var4.method1251((float)var39);
                           var4.method1249((byte)(var85 >> 16));
                           var4.method1249((byte)(var85 >> 8));
                           var4.method1249((byte)var85);
                           var4.method1249(-1);
                           var4.method1251((float)var38);
                           var4.method1251((float)var39);
                           if(this.anIntArrayArrayArray9177 != null) {
                              var4.method1251(var17 != null?(float)(var17[var82] - 1):0.0F);
                           }

                           if((this.anInt9167 & 7) != 0) {
                              var4.method1251(var52);
                              var4.method1251(var53);
                              var4.method1251(var54);
                           }
                        }

                        var37 = this.anInt9163++;
                        var81[var82] = (short)var37;
                        if(var42 != -1) {
                           var5[var37] = var11[var82];
                        }

                        var7.put(new Class526_Sub17(var81[var82]), var45);
                     } else {
                        var81[var82] = ((Class526_Sub17)var86).aShort10479;
                        var37 = var81[var82] & '\uffff';
                        if(var42 != -1 && var11[var82].aLong7156 * -6805155999452426801L < var5[var37].aLong7156 * -6805155999452426801L) {
                           var5[var37] = var11[var82];
                        }
                     }

                     for(var85 = 0; var85 < var34; ++var85) {
                        var8[var85].method9325(var37, var50, var83, var51);
                     }

                     ++this.anInt9194;
                  }
               }
            }
         }

         for(var9 = 0; var9 < this.anInt9163; ++var9) {
            Class526_Sub4 var66 = var5[var9];
            if(var66 != null) {
               var66.method9320(var9);
            }
         }

         for(var9 = 0; var9 < this.anInt1711 * 1966165105; ++var9) {
            for(var10 = 0; var10 < this.anInt1713 * -810756899; ++var10) {
               short[] var68 = this.aShortArrayArray9170[var10 * this.anInt1711 * 1966165105 + var9];
               if(var68 != null) {
                  int var71 = 0;

                  for(int var73 = 0; var73 < var68.length; ++var71) {
                     int var74 = var68[var73++] & '\uffff';
                     int var75 = var68[var73++] & '\uffff';
                     int var76 = var68[var73++] & '\uffff';
                     Class526_Sub4 var77 = var5[var74];
                     Class526_Sub4 var78 = var5[var75];
                     Class526_Sub4 var79 = var5[var76];
                     Class526_Sub4 var80 = null;
                     if(var77 != null) {
                        var77.method9321(var9, var10, var71);
                        var80 = var77;
                     }

                     if(var78 != null) {
                        var78.method9321(var9, var10, var71);
                        if(var80 == null || var78.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var78;
                        }
                     }

                     if(var79 != null) {
                        var79.method9321(var9, var10, var71);
                        if(var80 == null || var79.aLong7156 * -6805155999452426801L < var80.aLong7156 * -6805155999452426801L) {
                           var80 = var79;
                        }
                     }

                     if(var80 != null) {
                        if(var77 != null) {
                           var80.method9320(var74);
                        }

                        if(var78 != null) {
                           var80.method9320(var75);
                        }

                        if(var79 != null) {
                           var80.method9320(var76);
                        }

                        var80.method9321(var9, var10, var71);
                     }
                  }
               }
            }
         }

         var4.method1252();
         this.anInterface15_9182 = this.aClass174_Sub2_9169.method8631(var2, var65, var4.method1247(), false);
         if(this.anInterface15_9182 instanceof Class135_Sub1) {
            var65.method1228();
         }

         this.aClass129_9180 = new Class129(this.anInterface15_9182, 5126, 3, 0);
         this.aClass129_9184 = new Class129(this.anInterface15_9182, 5121, 4, 12);
         byte var67;
         if(this.anIntArrayArrayArray9177 != null) {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 3, 16);
            var67 = 28;
         } else {
            this.aClass129_9186 = new Class129(this.anInterface15_9182, 5126, 2, 16);
            var67 = 24;
         }

         if((this.anInt9167 & 7) != 0) {
            this.aClass129_9183 = new Class129(this.anInterface15_9182, 5126, 3, var67);
         }

         long[] var69 = new long[this.aClass526Array9181.length];

         for(int var70 = 0; var70 < this.aClass526Array9181.length; ++var70) {
            Class526_Sub4 var72 = (Class526_Sub4)this.aClass526Array9181[var70];
            var69[var70] = var72.aLong7156 * -6805155999452426801L;
            var72.method9322(this.anInt9163);
         }

         Class361_Sub1.method9240(var69, this.aClass526Array9181, (byte)-3);
         if(this.aClass145_9179 != null) {
            this.aClass145_9179.method1673();
         }
      } else {
         this.aClass145_9179 = null;
      }

      if((this.anInt9166 & 2) == 0) {
         this.anIntArrayArrayArray9175 = (int[][][])null;
         this.anIntArrayArrayArray9189 = (int[][][])null;
         this.anIntArrayArrayArray9172 = (int[][][])null;
      }

      this.anIntArrayArrayArray9177 = (int[][][])null;
      this.anIntArrayArrayArray9173 = (int[][][])null;
      this.anIntArrayArrayArray9185 = (int[][][])null;
      this.aClass526_Sub4ArrayArrayArray9161 = (Class526_Sub4[][][])null;
      this.aByteArrayArray9192 = (byte[][])null;
      this.aClass20_9193 = null;
      this.aFloatArrayArray9171 = (float[][])null;
      this.aFloatArrayArray9191 = (float[][])null;
      this.aFloatArrayArray9190 = (float[][])null;
   }

   public void method1725(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method8446(var1, var2, var3, var4, var5, var6);
   }

   public void method1733(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null?new int[var16 * 3]:null;
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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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

   public void method1712(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method8446(var1, var2, var3, var4, var5, var6);
   }

   public void method1700(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null?new int[var16 * 3]:null;
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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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

   public void method1726(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      this.method8446(var1, var2, var3, var4, var5, var6);
   }

   public void method1731(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1678(var1, var7, var8);
      }
   }

   public Class526_Sub21_Sub5 method1729(int var1, int var2, Class526_Sub21_Sub5 var3) {
      if((this.aByteArrayArray9178[var1][var2] & 1) == 0) {
         return null;
      } else {
         int var4 = this.anInt1712 * 1934131013 >> this.aClass174_Sub2_9169.anInt9662;
         Class526_Sub21_Sub5_Sub2 var5 = (Class526_Sub21_Sub5_Sub2)var3;
         Class526_Sub21_Sub5_Sub2 var6;
         if(var5 != null && var5.method10908(var4, var4)) {
            var6 = var5;
            var5.method10898();
         } else {
            var6 = new Class526_Sub21_Sub5_Sub2(this.aClass174_Sub2_9169, var4, var4);
         }

         var6.method10897(0, 0, var4, var4);
         this.method8445(var6, var1, var2);
         return var6;
      }
   }

   public void method1730(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1678(var1, var7, var8);
      }
   }

   void method8446(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass526Array9181 != null) {
         int var7 = var3 + var3 + 1;
         var7 *= var7;
         if(this.aClass174_Sub2_9169.anIntArray9628.length < var7) {
            this.aClass174_Sub2_9169.anIntArray9628 = new int[var7];
         }

         if(this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655.buffer.length < this.anInt9194 * 2) {
            this.aClass174_Sub2_9169.aClass526_Sub36_Sub1_9655 = new Class526_Sub36_Sub1(this.anInt9194 * 2);
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

         int var14 = 0;
         int[] var15 = this.aClass174_Sub2_9169.anIntArray9628;

         int var16;
         for(var16 = var8; var16 <= var12; ++var16) {
            boolean[] var17 = var4[var16 - var9];

            for(int var18 = var10; var18 <= var13; ++var18) {
               if(var17[var18 - var11]) {
                  var15[var14++] = var18 * this.anInt1711 * 1966165105 + var16;
               }
            }
         }

         this.aClass174_Sub2_9169.method8638();
         this.aClass174_Sub2_9169.method8646((this.anInt9167 & 7) != 0);

         for(var16 = 0; var16 < this.aClass526Array9181.length - 0; ++var16) {
            ((Class526_Sub4)this.aClass526Array9181[var16]).method9323(var15, var14);
         }

         if(!this.aClass702_9165.method8209(-488909438)) {
            var16 = this.aClass174_Sub2_9169.anInt9463;
            int var20 = this.aClass174_Sub2_9169.anInt9595;
            this.aClass174_Sub2_9169.method2333(0, var20, this.aClass174_Sub2_9169.anInt9499);
            this.aClass174_Sub2_9169.method8646(false);
            this.aClass174_Sub2_9169.method8648(false);
            this.aClass174_Sub2_9169.method8651(128);
            this.aClass174_Sub2_9169.method8639(-2);
            this.aClass174_Sub2_9169.method8641(this.aClass174_Sub2_9169.aClass124_Sub1_9613);
            this.aClass174_Sub2_9169.method8685(8448, 7681);
            this.aClass174_Sub2_9169.method8665(0, '\u8576', 770);
            this.aClass174_Sub2_9169.method8674(0, '\u8577', 770);

            for(Class526 var21 = this.aClass702_9165.method8206((byte)31); var21 != null; var21 = this.aClass702_9165.method8181(221024910)) {
               Class526_Sub12 var19 = (Class526_Sub12)var21;
               var19.method9368(var1, var2, var3, var4);
            }

            this.aClass174_Sub2_9169.method8665(0, 5890, 768);
            this.aClass174_Sub2_9169.method8674(0, 5890, 770);
            this.aClass174_Sub2_9169.method8641((Class124)null);
            this.aClass174_Sub2_9169.method2333(var16, var20, this.aClass174_Sub2_9169.anInt9499);
         }

         if(this.aClass145_9179 != null) {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
            this.aClass174_Sub2_9169.method8634(this.aClass129_9180, (Class129)null, (Class129)null, this.aClass129_9186);
            this.aClass145_9179.method1686(var1, var2, var3, var4, var5);
            OpenGL.glPopMatrix();
         }
      }

   }

   public boolean method1732(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         return this.aClass145_9179.method1675(var1, var7, var8);
      } else {
         return false;
      }
   }

   public void method1703(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1680(var1, var7, var8);
      }
   }

   public void method1704(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1680(var1, var7, var8);
      }
   }

   public void method1735(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1680(var1, var7, var8);
      }
   }

   public void method1736(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.aClass145_9179 != null && var1 != null) {
         int var7 = var2 - (var3 * this.aClass174_Sub2_9169.anInt9591 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         int var8 = var4 - (var3 * this.aClass174_Sub2_9169.anInt9566 >> 8) >> this.aClass174_Sub2_9169.anInt9662;
         this.aClass145_9179.method1680(var1, var7, var8);
      }
   }

   public void method1706(Class526_Sub16 var1, int[] var2) {
      this.aClass702_9165.method8176(new Class526_Sub12(this.aClass174_Sub2_9169, this, var1, var2), -301252959);
   }

   public void method1738(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null?new int[var16 * 3]:null;
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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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

   public void method1734(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9192.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9192[var1].length - 1, Math.max(0, var2));
      if((this.aByteArrayArray9192[var1][var2] & 255) < var3) {
         this.aByteArrayArray9192[var1][var2] = (byte)var3;
      }

   }

   public void method1740(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      int var16 = var10.length;
      int[] var17 = new int[var16 * 3];
      int[] var18 = new int[var16 * 3];
      int[] var19 = new int[var16 * 3];
      int[] var20 = var11 != null?new int[var16 * 3]:null;
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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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
         if(var11 != null) {
            var20[var25] = var11[var26];
         }

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

   Class148_Sub3(Class174_Sub2 var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.aClass174_Sub2_9169 = var1;
      this.anInt9164 = this.anInt1710 * -586661047 - 2;
      this.anInt9168 = 1 << this.anInt9164;
      this.anInt9166 = var2;
      this.anInt9167 = var3;
      this.anIntArrayArrayArray9185 = new int[var4][var5][];
      this.aClass526_Sub4ArrayArrayArray9161 = new Class526_Sub4[var4][var5][];
      this.anIntArrayArrayArray9189 = new int[var4][var5][];
      this.anIntArrayArrayArray9175 = new int[var4][var5][];
      this.anIntArrayArrayArray9172 = new int[var4][var5][];
      this.anIntArrayArrayArray9173 = new int[var4][var5][];
      this.aShortArrayArray9170 = new short[var4 * var5][];
      this.aByteArrayArray9178 = new byte[var4][var5];
      this.aByteArrayArray9192 = new byte[var4 + 1][var5 + 1];
      this.aFloatArrayArray9190 = new float[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];
      this.aFloatArrayArray9191 = new float[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];
      this.aFloatArrayArray9171 = new float[this.anInt1711 * 1966165105 + 1][this.anInt1713 * -810756899 + 1];

      for(int var9 = 1; var9 < this.anInt1713 * -810756899; ++var9) {
         for(int var10 = 1; var10 < this.anInt1711 * 1966165105; ++var10) {
            int var11 = var7[var10 + 1][var9] - var7[var10 - 1][var9];
            int var12 = var7[var10][var9 + 1] - var7[var10][var9 - 1];
            float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + 4 * var8 * var8 + var12 * var12)));
            this.aFloatArrayArray9190[var10][var9] = (float)var11 * var13;
            this.aFloatArrayArray9191[var10][var9] = (float)(-var8 * 2) * var13;
            this.aFloatArrayArray9171[var10][var9] = (float)var12 * var13;
         }
      }

      this.aClass20_9193 = new Class20(128);
      if((this.anInt9167 & 16) != 0) {
         this.aClass145_9179 = new Class145(this.aClass174_Sub2_9169, this);
      }

   }
}
