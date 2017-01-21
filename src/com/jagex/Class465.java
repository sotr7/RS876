package com.jagex;

import com.jagex.Class148;
import com.jagex.Class172;
import com.jagex.Class174;
import com.jagex.Class182;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class386;
import com.jagex.Class40_Sub10;
import com.jagex.Class40_Sub17;
import com.jagex.Class40_Sub18;
import com.jagex.Class470;
import com.jagex.Class50;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub38;
import com.jagex.Class544;
import com.jagex.Class549;
import com.jagex.Class59;
import com.jagex.Class596;
import com.jagex.Class653;
import com.jagex.Class681;
import com.jagex.Class7;
import com.jagex.client;

public class Class465 {
   static final int anInt5236 = 64;
   static final int anInt5237 = 0;
   public byte[][][] aByteArrayArrayArray5248;
   static final int anInt5249 = 32;
   static final int anInt5262 = 2;
   static final int anInt5263 = 3;
   static final int anInt5264 = 1;
   static final int anInt5265 = 2;
   static final int anInt5267 = 8;
   static final int anInt5268 = 16;
   static final int anInt5271 = 128;
   static final int anInt5272 = 256;
   static final int anInt5277 = 512;
   static final int anInt5297 = 4;
   static final int anInt5301 = 0;
   static final int anInt5306 = 1;
   public static Class40_Sub17 aClass40_Sub17_5321;
   int anInt5319;
   int anInt5316;
   int anInt5261;
   int anInt5308;
   int[] anIntArray5317;
   int[] anIntArray5318;
   int[] anIntArray5289;
   int[] anIntArray5320 = null;
   public int anInt5238 = 0;
   public boolean aBool5239 = false;
   public boolean aBool5233 = false;
   public boolean aBool5274 = false;
   public boolean aBool5242 = false;
   int[] anIntArray5287 = new int[6];
   int[] anIntArray5298 = new int[13];
   int[] anIntArray5251 = new int[13];
   int[] anIntArray5300 = new int[13];
   int[] anIntArray5241 = new int[13];
   int[] anIntArray5302 = new int[13];
   int[] anIntArray5303 = new int[13];
   int anInt5255 = 0;
   int anInt5307 = 0;
   protected Class549 aClass549_5252;
   public int anInt5269;
   protected int anInt5244;
   protected int anInt5245;
   public boolean aBool5246;
   Class40_Sub10 aClass40_Sub10_5299;
   Class40_Sub18 aClass40_Sub18_5234;
   protected Class470 aClass470_5235;
   short[][][] aShortArrayArrayArray5275;
   short[][][] aShortArrayArrayArray5253;
   byte[][][] aByteArrayArrayArray5250;
   byte[][][] aByteArrayArrayArray5292;
   public int[][][] anIntArrayArrayArray5312;
   protected byte[][][] aByteArrayArrayArray5243;
   boolean aBool5311;
   protected boolean aBool5280;
   static int[] anIntArray5273 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   static int[] anIntArray5285 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
   static int[] anIntArray5276 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   static int[] anIntArray5305 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
   static int[] anIntArray5278 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   static int[] anIntArray5279 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   static int[] anIntArray5294 = new int[]{0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256};
   static int[] anIntArray5281 = new int[]{0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256};
   static boolean[][] aBoolArrayArray5282 = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, {false, false, false, false, false, false, false, false, false, false, false, false, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, {false, false, false, false, false, false, false, false, false, false, false, false, false}};
   static boolean[][] aBoolArrayArray5283 = new boolean[][]{{false, false, false, false, false, false, false, false, false, false, false, false, false}, {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, {false, false, false, false, false, false, false, false, false, false, false, false, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   static int[][] anIntArrayArray5284 = new int[][]{{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
   static int[][] anIntArrayArray5293 = new int[][]{{2, 4}, {2, 4}, {5, 2, 4}, {4, 5, 2}, {2, 4, 5}, {5, 2, 4}, {1, 6, 2, 5}, {1, 6, 7, 1}, {6, 7, 1, 1}, {0, 8, 9, 8, 9, 4}, {8, 9, 4, 0, 8, 9}, {2, 10, 0, 10, 11, 11}, {2, 4}, {1, 6, 7, 1}, {1, 6, 7, 1}};
   static int[][] anIntArrayArray5254 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
   static boolean[][] aBoolArrayArray5260 = new boolean[][]{{false, false, false, false}, {false, false, false, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}};
   static int[][] anIntArrayArray5288 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
   static int[][] anIntArrayArray5270 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   static int[][] anIntArrayArray5290 = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   static int[][] anIntArrayArray5291 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   static boolean[][] aBoolArrayArray5240 = new boolean[][]{{false, false, false, false}, {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, {false, false, false, false}, {false, true, false, true}, {false, false, false, false}};
   static int[][] anIntArrayArray5266 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   static int[][] anIntArrayArray5247 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 3, 5, 3}, {6, 0, 2, 4}, {2, 5, 6, 1}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 7, 1, 2, 4, 6}, {2, 4, 4, 7}, {6, 6, 4, 0, 1, 1, 3, 3}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 3, 7, 0, 4, 3}, {0, 2, 4, 6}};
   static int[][] anIntArrayArray5295 = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
   static int[][] anIntArrayArray5296 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   int[] anIntArray5286;
   int[] anIntArray5256;
   int[] anIntArray5257;
   int[] anIntArray5258;
   int[] anIntArray5259;
   boolean aBool5314;
   int anInt5304;
   int anInt5310;
   int anInt5309;
   boolean aBool5315;
   boolean aBool5313;

   public final void method5495(int var1, int var2, int var3, int var4, byte var5) {
      for(int var6 = 0; var6 < -1917803745 * this.anInt5269; ++var6) {
         this.method5496(var6, var1, var2, var3, var4, 1471957911);
      }

   }

   public final void method5496(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      for(var7 = var3; var7 < var3 + var5; ++var7) {
         for(int var8 = var2; var8 < var4 + var2; ++var8) {
            if(var8 >= 0 && var8 < this.anInt5244 * -1225795677 && var7 >= 0 && var7 < this.anInt5245 * -1769380583) {
               this.anIntArrayArrayArray5312[var1][var8][var7] = var1 > 0?this.anIntArrayArrayArray5312[var1 - 1][var8][var7] - 960:0;
            }
         }
      }

      if(var2 > 0 && var2 < -1225795677 * this.anInt5244) {
         for(var7 = var3 + 1; var7 < var5 + var3; ++var7) {
            if(var7 >= 0 && var7 < this.anInt5245 * -1769380583) {
               this.anIntArrayArrayArray5312[var1][var2][var7] = this.anIntArrayArrayArray5312[var1][var2 - 1][var7];
            }
         }
      }

      if(var3 > 0 && var3 < -1769380583 * this.anInt5245) {
         for(var7 = 1 + var2; var7 < var2 + var4; ++var7) {
            if(var7 >= 0 && var7 < -1225795677 * this.anInt5244) {
               this.anIntArrayArrayArray5312[var1][var7][var3] = this.anIntArrayArrayArray5312[var1][var7][var3 - 1];
            }
         }
      }

      if(var2 >= 0 && var3 >= 0 && var2 < this.anInt5244 * -1225795677 && var3 < this.anInt5245 * -1769380583) {
         if(var1 == 0) {
            if(var2 > 0 && 0 != this.anIntArrayArrayArray5312[var1][var2 - 1][var3]) {
               this.anIntArrayArrayArray5312[var1][var2][var3] = this.anIntArrayArrayArray5312[var1][var2 - 1][var3];
            } else if(var3 > 0 && this.anIntArrayArrayArray5312[var1][var2][var3 - 1] != 0) {
               this.anIntArrayArrayArray5312[var1][var2][var3] = this.anIntArrayArrayArray5312[var1][var2][var3 - 1];
            } else if(var2 > 0 && var3 > 0 && 0 != this.anIntArrayArrayArray5312[var1][var2 - 1][var3 - 1]) {
               this.anIntArrayArrayArray5312[var1][var2][var3] = this.anIntArrayArrayArray5312[var1][var2 - 1][var3 - 1];
            }
         } else if(var2 > 0 && this.anIntArrayArrayArray5312[var1 - 1][var2 - 1][var3] != this.anIntArrayArrayArray5312[var1][var2 - 1][var3]) {
            this.anIntArrayArrayArray5312[var1][var2][var3] = this.anIntArrayArrayArray5312[var1][var2 - 1][var3];
         } else if(var3 > 0 && this.anIntArrayArrayArray5312[var1][var2][var3 - 1] != this.anIntArrayArrayArray5312[var1 - 1][var2][var3 - 1]) {
            this.anIntArrayArrayArray5312[var1][var2][var3] = this.anIntArrayArrayArray5312[var1][var2][var3 - 1];
         } else if(var2 > 0 && var3 > 0 && this.anIntArrayArrayArray5312[var1 - 1][var2 - 1][var3 - 1] != this.anIntArrayArrayArray5312[var1][var2 - 1][var3 - 1]) {
            this.anIntArrayArrayArray5312[var1][var2][var3] = this.anIntArrayArrayArray5312[var1][var2 - 1][var3 - 1];
         }
      }

   }

   public final void method5497(RSByteBuffer var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var4;
      int var8 = var3 + var5;

      for(int var9 = 0; var9 < -1917803745 * this.anInt5269; ++var9) {
         for(int var10 = 0; var10 < 64; ++var10) {
            for(int var11 = 0; var11 < 64; ++var11) {
               this.method5499(var1, var9, var10 + var2, var3 + var11, 0, 0, var10 + var7, var11 + var8, 0, false, (byte)94);
            }
         }
      }

   }

   public final void method5498(RSByteBuffer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = (var6 & 7) * 8;
      int var11 = (var7 & 7) * 8;
      int var12 = (var6 & -8) << 3;
      int var13 = (var7 & -8) << 3;
      byte var14 = 0;
      byte var15 = 0;
      if(1 == var8) {
         var15 = 1;
      } else if(var8 == 2) {
         var14 = 1;
         var15 = 1;
      } else if(var8 == 3) {
         var14 = 1;
      }

      for(int var16 = 0; var16 < -1917803745 * this.anInt5269; ++var16) {
         for(int var17 = 0; var17 < 64; ++var17) {
            for(int var18 = 0; var18 < 64; ++var18) {
               if(var16 == var5 && var17 >= var10 && var17 <= 8 + var10 && var18 >= var11 && var18 <= var11 + 8) {
                  int var19;
                  int var20;
                  if(var17 != var10 + 8 && 8 + var11 != var18) {
                     var19 = var3 + Class59.method1035(var17 & 7, var18 & 7, var8, (byte)-1);
                     var20 = var4 + Class526_Sub21_Sub2.method10421(var17 & 7, var18 & 7, var8, (byte)16);
                     this.method5499(var1, var2, var19, var20, var14, var15, var17 + var12, var13 + var18, var8, false, (byte)1);
                  } else {
                     if(0 == var8) {
                        var19 = var17 - var10 + var3;
                        var20 = var4 + (var18 - var11);
                     } else if(1 == var8) {
                        var19 = var18 - var11 + var3;
                        var20 = var4 + 8 - (var17 - var10);
                     } else if(var8 == 2) {
                        var19 = var3 + 8 - (var17 - var10);
                        var20 = 8 + var4 - (var18 - var11);
                     } else {
                        var19 = var3 + 8 - (var18 - var11);
                        var20 = var4 + (var17 - var10);
                     }

                     this.method5499(var1, var2, var19, var20, 0, 0, var12 + var17, var13 + var18, 0, true, (byte)82);
                  }

                  if(63 == var17 || 63 == var18) {
                     byte var21 = 1;
                     if(63 == var17 && var18 == 63) {
                        var21 = 3;
                     }

                     for(int var22 = 0; var22 < var21; ++var22) {
                        int var23 = var17;
                        int var24 = var18;
                        if(0 == var22) {
                           var23 = var17 == 63?64:var17;
                           var24 = var18 == 63?64:var18;
                        } else if(1 == var22) {
                           var23 = 64;
                        } else if(var22 == 2) {
                           var24 = 64;
                        }

                        int var25;
                        int var26;
                        if(0 == var8) {
                           var25 = var3 + (var23 - var10);
                           var26 = var24 - var11 + var4;
                        } else if(1 == var8) {
                           var25 = var3 + (var24 - var11);
                           var26 = 8 + var4 - (var23 - var10);
                        } else if(var8 == 2) {
                           var25 = var3 + 8 - (var23 - var10);
                           var26 = var4 + 8 - (var24 - var11);
                        } else {
                           var25 = var3 + 8 - (var24 - var11);
                           var26 = var4 + (var23 - var10);
                        }

                        if(var25 >= 0 && var25 < -1225795677 * this.anInt5244 && var26 >= 0 && var26 < this.anInt5245 * -1769380583) {
                           this.anIntArrayArrayArray5312[var2][var25][var26] = this.anIntArrayArrayArray5312[var2][var19 + var14][var20 + var15];
                        }
                     }
                  }
               } else {
                  this.method5499(var1, 0, -1, -1, 0, 0, 0, 0, 0, false, (byte)119);
               }
            }
         }
      }

   }

   final void method5499(RSByteBuffer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, byte var11) {
      if(1 == var9) {
         var6 = 1;
      } else if(2 == var9) {
         var5 = 1;
         var6 = 1;
      } else if(3 == var9) {
         var5 = 1;
      }

      int var12;
      if(var3 >= 0 && var3 < -1225795677 * this.anInt5244 && var4 >= 0 && var4 < -1769380583 * this.anInt5245) {
         if(!this.aBool5246 && !var10) {
            this.aClass470_5235.aByteArrayArrayArray5356[var2][var3][var4] = 0;
         }

         var12 = var1.readUnsignedByte(-565211500);
         int var13;
         if(0 != (var12 & 1)) {
            if(var10) {
               var1.readUnsignedByte(-732169223);
               var1.readSmart(-1980466024);
            } else {
               var13 = var1.readUnsignedByte(385652687);
               this.aShortArrayArrayArray5253[var2][var3][var4] = (short)var1.readSmart(-1648572145);
               this.aByteArrayArrayArray5250[var2][var3][var4] = (byte)(var13 >> 2);
               this.aByteArrayArrayArray5292[var2][var3][var4] = (byte)(var13 + var9 & 3);
            }
         }

         if((var12 & 2) != 0) {
            if(!this.aBool5246 && !var10) {
               this.aClass470_5235.aByteArrayArrayArray5356[var2][var3][var4] = var1.readByte((byte)83);
            } else {
               var1.pos += 801976415;
            }
         }

         if(0 != (var12 & 4)) {
            if(var10) {
               var1.readSmart(-1085810403);
            } else {
               this.aShortArrayArrayArray5275[var2][var3][var4] = (short)var1.readSmart(-666722015);
            }
         }

         if(0 != (var12 & 8)) {
            var13 = var1.readUnsignedByte(-793544538);
            if(!this.aBool5246) {
               if(var13 == 1) {
                  var13 = 0;
               }

               if(0 == var2) {
                  this.anIntArrayArrayArray5312[0][var3 + var5][var6 + var4] = 8 * -var13 << 2;
               } else {
                  this.anIntArrayArrayArray5312[var2][var3 + var5][var4 + var6] = this.anIntArrayArrayArray5312[var2 - 1][var5 + var3][var4 + var6] - (var13 * 8 << 2);
               }
            } else {
               this.anIntArrayArrayArray5312[0][var5 + var3][var4 + var6] = var13 * 8 << 2;
            }
         } else if(this.aBool5246) {
            this.anIntArrayArrayArray5312[0][var3 + var5][var4 + var6] = 0;
         } else if(var2 == 0) {
            this.anIntArrayArrayArray5312[0][var3 + var5][var4 + var6] = -Class596.method7060(932731 + var7, 556238 + var8, (byte)-29) * 8 << 2;
         } else {
            this.anIntArrayArrayArray5312[var2][var5 + var3][var6 + var4] = this.anIntArrayArrayArray5312[var2 - 1][var5 + var3][var6 + var4] - 960;
         }
      } else {
         var12 = var1.readUnsignedByte(1303727020);
         if(0 != (var12 & 1)) {
            var1.readUnsignedByte(-1870747877);
            var1.readSmart(-1404585436);
         }

         if(0 != (var12 & 2)) {
            var1.pos += 801976415;
         }

         if((var12 & 4) != 0) {
            var1.readSmart(-1259605955);
         }

         if((var12 & 8) != 0) {
            var1.readUnsignedByte(-1279579507);
         }
      }

   }

   public final void method5500(int var1, int[][] var2, byte var3) {
      int[][] var4 = this.anIntArrayArrayArray5312[var1];

      for(int var5 = 0; var5 < 1 + -1225795677 * this.anInt5244; ++var5) {
         for(int var6 = 0; var6 < -1769380583 * this.anInt5245 + 1; ++var6) {
            var4[var5][var6] += var2[var5][var6];
         }
      }

   }

   public void method5501(Class174 var1, int[][][] var2, int var3) {
      for(int var4 = 0; var4 < this.anInt5269 * -1917803745; ++var4) {
         int var5 = 0;
         int var6 = 0;
         if(!this.aBool5246) {
            if(this.aBool5239) {
               var6 |= 8;
            }

            if(this.aBool5233) {
               var5 |= 2;
            }

            if(0 != this.anInt5238 * -1503116445) {
               var5 |= 1;
               var6 |= 16;
            }
         }

         if(this.aBool5233) {
            var6 |= 7;
         }

         if(!this.aBool5242) {
            var6 |= 32;
         }

         int[][] var7 = var2 != null && var4 < var2.length?var2[var4]:this.anIntArrayArrayArray5312[var4];
         this.aClass549_5252.method6568(var4, var1.method2323(this.anInt5244 * -1225795677, -1769380583 * this.anInt5245, this.anIntArrayArrayArray5312[var4], var7, 512, var5, var6), (byte)-65);
      }

   }

   void method5502(Class174 var1, Class148 var2, int var3, int[][] var4, Class148 var5, Class148 var6, byte var7) {
      for(int var8 = 0; var8 < -1225795677 * this.anInt5244; ++var8) {
         for(int var9 = 0; var9 < this.anInt5245 * -1769380583; ++var9) {
            byte var10 = this.aByteArrayArrayArray5250[var3][var8][var9];
            byte var11 = this.aByteArrayArrayArray5292[var3][var8][var9];
            int var12 = this.aShortArrayArrayArray5253[var3][var8][var9] & 32767;
            int var13 = this.aShortArrayArrayArray5275[var3][var8][var9] & 32767;
            Class653 var14 = (Class653)(0 != var12?this.aClass40_Sub10_5299.method89(var12 - 1, -497278472):null);
            Class7 var15 = (Class7)(0 != var13?this.aClass40_Sub18_5234.method89(var13 - 1, -331181702):null);
            if(0 == var10 && null == var14) {
               var10 = 12;
            }

            Class653 var16 = var14;
            if(null != var14 && -1 == var14.anInt8467 * -1097883379 && -1893458545 * var14.anInt8470 == -1) {
               var16 = var14;
               var14 = null;
            }

            if(null != var14 || null != var15) {
               this.anInt5319 = anIntArray5285[var10] * -1757245023;
               this.anInt5316 = -749901623 * anIntArray5273[var10];
               int var17 = (var14 != null?this.anInt5316 * -318557831:0) + (var15 != null?-2145807775 * this.anInt5319:0);
               int var18 = 0;
               this.anInt5261 = 0;
               this.anInt5308 = -1548187433 * (var14 != null?-1072075383 * var14.anInt8468:-1);
               int var19 = null != var15?-1086622535 * var15.anInt40:-1;
               int[] var20 = new int[var17];
               int[] var21 = new int[var17];
               int[] var22 = new int[var17];
               int[] var23 = new int[var17];
               int[] var24 = new int[var17];
               int[] var25 = new int[var17];
               int[] var26 = null != var14 && var14.anInt8470 * -1893458545 != -1?new int[var17]:null;
               int var27;
               if(null != var14) {
                  for(var27 = 0; var27 < this.anInt5316 * -318557831; ++var27) {
                     var20[var18] = anIntArrayArray5284[var10][this.anInt5261 * 1437362979];
                     var21[var18] = anIntArrayArray5293[var10][this.anInt5261 * 1437362979];
                     var22[var18] = anIntArrayArray5254[var10][1437362979 * this.anInt5261];
                     var24[var18] = this.anInt5308 * -1361515801;
                     var25[var18] = 1578550255 * var14.anInt8471;
                     var23[var18] = var14.anInt8467 * -1097883379;
                     if(null != var26) {
                        var26[var18] = var14.anInt8470 * -1893458545;
                     }

                     ++var18;
                     this.anInt5261 += 1229855883;
                  }

                  if(!this.aBool5246 && var3 == 0) {
                     this.aClass549_5252.method6575(var8, var9, -949782713 * var14.anInt8472, 339225960 * var14.anInt8475, 1902440907 * var14.anInt8477, var14.anInt8476 * -1519859357, var14.anInt8479 * -1212193059, 2058133549 * var14.anInt8480, 1616343143);
                  }
               } else {
                  this.anInt5261 += this.anInt5316 * -1643964237;
               }

               if(var15 != null) {
                  for(var27 = 0; var27 < -2145807775 * this.anInt5319; ++var27) {
                     var20[var18] = anIntArrayArray5284[var10][this.anInt5261 * 1437362979];
                     var21[var18] = anIntArrayArray5293[var10][1437362979 * this.anInt5261];
                     var22[var18] = anIntArrayArray5254[var10][1437362979 * this.anInt5261];
                     var24[var18] = var19;
                     var25[var18] = 1506663249 * var15.anInt38;
                     var23[var18] = var4[var8][var9];
                     if(null != var26) {
                        var26[var18] = var23[var18];
                     }

                     ++var18;
                     this.anInt5261 += 1229855883;
                  }
               }

               var27 = anIntArray5294.length;
               int[] var28 = new int[var27];
               int[] var29 = new int[var27];
               int[] var30 = null != var6?new int[var27]:null;
               int[] var31 = null == var6 && null == var5?null:new int[var27];

               int var32;
               int var33;
               int var34;
               int var35;
               for(var32 = 0; var32 < var27; ++var32) {
                  var33 = anIntArray5294[var32];
                  var34 = anIntArray5281[var32];
                  if(0 == var11) {
                     var28[var32] = var33;
                     var29[var32] = var34;
                  } else if(var11 == 1) {
                     var28[var32] = var34;
                     var29[var32] = 512 - var33;
                  } else if(2 == var11) {
                     var28[var32] = 512 - var33;
                     var29[var32] = 512 - var34;
                  } else if(3 == var11) {
                     var28[var32] = 512 - var34;
                     var29[var32] = var33;
                  }

                  int var36;
                  if(var30 != null && aBoolArrayArray5282[var10][var32]) {
                     var35 = var28[var32] + (var8 << 9);
                     var36 = var29[var32] + (var9 << 9);
                     var30[var32] = var6.method1707(var35, var36, -1833135380) - var2.method1707(var35, var36, -488327577);
                  }

                  if(null != var31) {
                     if(null != var6 && !aBoolArrayArray5282[var10][var32]) {
                        var35 = (var8 << 9) + var28[var32];
                        var36 = var29[var32] + (var9 << 9);
                        var31[var32] = var2.method1707(var35, var36, -1756648229) - var6.method1707(var35, var36, -1224288956);
                     } else if(var5 != null && !aBoolArrayArray5283[var10][var32]) {
                        var35 = (var8 << 9) + var28[var32];
                        var36 = (var9 << 9) + var29[var32];
                        var31[var32] = var5.method1707(var35, var36, 1011130529) - var2.method1707(var35, var36, 1774656125);
                     }
                  }
               }

               var32 = var2.method1714(var8, var9, -783963693);
               var33 = var2.method1714(1 + var8, var9, 1759120335);
               var34 = var2.method1714(1 + var8, var9 + 1, 1784392860);
               var35 = var2.method1714(var8, 1 + var9, -268512434);
               boolean var38 = this.aClass470_5235.method5614(var8, var9, 1740104551);
               if(var38 && var3 > 1 || !var38 && var3 > 0) {
                  boolean var37 = true;
                  if(null != var15 && !var15.aBool36) {
                     var37 = false;
                  } else if(0 == var13 && 0 != var10) {
                     var37 = false;
                  } else if(var12 > 0 && var16 != null && !var16.aBool8474) {
                     var37 = false;
                  }

                  if(var37 && var32 == var33 && var32 == var34 && var32 == var35) {
                     this.aByteArrayArrayArray5243[var3][var8][var9] = (byte)(this.aByteArrayArrayArray5243[var3][var8][var9] | 4);
                  }
               }

               Class172 var39 = new Class172();
               if(this.aBool5246) {
                  var39.anInt2019 = this.aClass549_5252.method6613(var8, var9, -1040105921) * -1687600729;
                  var39.anInt2020 = this.aClass549_5252.method6569(var8, var9, (byte)114) * 440036469;
                  var39.anInt2018 = this.aClass549_5252.method6571(var8, var9, -1601109139) * -1588695373;
                  var39.anInt2022 = this.aClass549_5252.method6572(var8, var9, 1602952147) * -1126721515;
                  var39.anInt2023 = this.aClass549_5252.method6614(var8, var9, (byte)1) * 137365799;
                  var39.anInt2024 = this.aClass549_5252.method6574(var8, var9, (short)15898) * 66315777;
               }

               var2.method1700(var8, var9, var28, var30, var29, var31, var20, var21, var22, var23, var26, var24, var25, var39, false);
               this.aClass549_5252.method6562(var3, var8, var9, -1631929077);
            }
         }
      }

   }

   int method5503(int var1, int var2, int var3, int var4, int var5, Class148 var6, short[][] var7, byte var8) {
      if((0 == 330606131 * this.anInt5304 || this.anInt5304 * 330606131 == 12) && var2 > 0 && var3 > 0 && var2 < this.anInt5244 * -1225795677 && var3 < this.anInt5245 * -1769380583) {
         byte var9 = 0;
         byte var10 = 0;
         byte var11 = 0;
         byte var12 = 0;
         int var15 = var9 + (var7[var2 - 1][var3 - 1] == var1?1:-1);
         int var16 = var10 + (var1 == var7[var4][var3 - 1]?1:-1);
         int var17 = var11 + (var1 == var7[var4][var5]?1:-1);
         int var18 = var12 + (var1 == var7[var2 - 1][var5]?1:-1);
         if(var1 == var7[var2][var3 - 1]) {
            ++var15;
            ++var16;
         } else {
            --var15;
            --var16;
         }

         if(var1 == var7[var4][var3]) {
            ++var16;
            ++var17;
         } else {
            --var16;
            --var17;
         }

         if(var7[var2][var5] == var1) {
            ++var17;
            ++var18;
         } else {
            --var17;
            --var18;
         }

         if(var7[var2 - 1][var3] == var1) {
            ++var18;
            ++var15;
         } else {
            --var18;
            --var15;
         }

         int var13 = var15 - var17;
         if(var13 < 0) {
            var13 = -var13;
         }

         int var14 = var16 - var18;
         if(var14 < 0) {
            var14 = -var14;
         }

         if(var14 == var13) {
            var13 = var6.method1714(var2, var3, -463916685) - var6.method1714(var4, var5, 1202977005);
            if(var13 < 0) {
               var13 = -var13;
            }

            var14 = var6.method1714(var4, var3, 75565117) - var6.method1714(var2, var5, 429226754);
            if(var14 < 0) {
               var14 = -var14;
            }
         }

         return var13 < var14?1:0;
      } else {
         return this.anInt5261 * 1437362979;
      }
   }

   void method5504(Class653 var1, Class7 var2, byte var3) {
      if(this.aBool5313) {
         this.anIntArray5317 = anIntArrayArray5284[330606131 * this.anInt5304];
         this.anIntArray5318 = anIntArrayArray5293[this.anInt5304 * 330606131];
         this.anIntArray5289 = anIntArrayArray5254[330606131 * this.anInt5304];
         this.anInt5316 = (var1 != null?anIntArray5273[330606131 * this.anInt5304]:0) * -749901623;
         this.anInt5319 = -1757245023 * (var2 != null?anIntArray5285[330606131 * this.anInt5304]:0);
      } else if(this.aBool5315) {
         this.anIntArray5317 = anIntArrayArray5247[this.anInt5304 * 330606131];
         this.anIntArray5318 = anIntArrayArray5295[330606131 * this.anInt5304];
         this.anIntArray5289 = anIntArrayArray5296[this.anInt5304 * 330606131];
         this.anInt5316 = -749901623 * (var1 != null?anIntArray5278[this.anInt5304 * 330606131]:0);
         this.anInt5319 = -1757245023 * (var2 != null?anIntArray5279[this.anInt5304 * 330606131]:0);
         this.anIntArray5320 = anIntArrayArray5266[this.anInt5304 * 330606131];
      } else {
         this.anIntArray5317 = anIntArrayArray5270[this.anInt5304 * 330606131];
         this.anIntArray5318 = anIntArrayArray5290[this.anInt5304 * 330606131];
         this.anIntArray5289 = anIntArrayArray5291[this.anInt5304 * 330606131];
         this.anInt5316 = -749901623 * (null != var1?anIntArray5276[this.anInt5304 * 330606131]:0);
         this.anInt5319 = (var2 != null?anIntArray5305[this.anInt5304 * 330606131]:0) * -1757245023;
         this.anIntArray5320 = anIntArrayArray5288[330606131 * this.anInt5304];
      }

   }

   Class465(Class549 var1, int var2, int var3, int var4, boolean var5, Class40_Sub10 var6, Class40_Sub18 var7, Class470 var8) {
      this.aClass549_5252 = var1;
      this.anInt5269 = -2142693153 * var2;
      this.anInt5244 = var3 * 1599280139;
      this.anInt5245 = var4 * 2102929193;
      this.aBool5246 = var5;
      this.aClass40_Sub10_5299 = var6;
      this.aClass40_Sub18_5234 = var7;
      this.aClass470_5235 = var8;
      this.aShortArrayArrayArray5275 = new short[-1917803745 * this.anInt5269][-1225795677 * this.anInt5244][this.anInt5245 * -1769380583];
      this.aShortArrayArrayArray5253 = new short[this.anInt5269 * -1917803745][-1225795677 * this.anInt5244][-1769380583 * this.anInt5245];
      this.aByteArrayArrayArray5250 = new byte[-1917803745 * this.anInt5269][this.anInt5244 * -1225795677][this.anInt5245 * -1769380583];
      this.aByteArrayArrayArray5292 = new byte[this.anInt5269 * -1917803745][this.anInt5244 * -1225795677][-1769380583 * this.anInt5245];
      this.anIntArrayArrayArray5312 = new int[this.anInt5269 * -1917803745][1 + -1225795677 * this.anInt5244][-1769380583 * this.anInt5245 + 1];
      this.aByteArrayArrayArray5243 = new byte[this.anInt5269 * -1917803745][1 + this.anInt5244 * -1225795677][-1769380583 * this.anInt5245 + 1];
   }

   void method5505(Class174 var1, int var2, int var3, int var4, int var5, int var6, Class7 var7, int var8, int var9, int var10, int var11, boolean[] var12, int[] var13, int[] var14, int[] var15, int[] var16, int[] var17, int[] var18, int[] var19, int[] var20, int[][] var21, Class148 var22, Class148 var23, Class148 var24, int var25) {
      if(null != var7) {
         if(var9 == 0) {
            var9 = var8;
         }

         if(var10 == 0) {
            var10 = var8;
         }

         if(0 == var11) {
            var11 = var8;
         }

         Class7 var26 = (Class7)this.aClass40_Sub18_5234.method89(var8 - 1, -1397792582);
         Class7 var27 = (Class7)this.aClass40_Sub18_5234.method89(var9 - 1, -177743517);
         Class7 var28 = (Class7)this.aClass40_Sub18_5234.method89(var10 - 1, 241055719);
         Class7 var29 = (Class7)this.aClass40_Sub18_5234.method89(var11 - 1, 89576863);

         for(int var30 = 0; var30 < -2145807775 * this.anInt5319; ++var30) {
            boolean var31 = false;
            byte var41;
            if(var12[0 - this.anInt5261 * 1437362979 & 3] && this.anIntArray5320[0] == -349026443 * this.anInt5255) {
               this.anIntArray5287[0] = this.anIntArray5317[-349026443 * this.anInt5255];
               this.anIntArray5287[1] = 1;
               this.anIntArray5287[2] = this.anIntArray5289[this.anInt5255 * -349026443];
               this.anIntArray5287[3] = 1;
               this.anIntArray5287[4] = this.anIntArray5318[-349026443 * this.anInt5255];
               this.anIntArray5287[5] = this.anIntArray5289[-349026443 * this.anInt5255];
               var41 = 6;
            } else if(var12[2 - 1437362979 * this.anInt5261 & 3] && this.anIntArray5320[2] == -349026443 * this.anInt5255) {
               this.anIntArray5287[0] = this.anIntArray5317[this.anInt5255 * -349026443];
               this.anIntArray5287[1] = 5;
               this.anIntArray5287[2] = this.anIntArray5289[this.anInt5255 * -349026443];
               this.anIntArray5287[3] = 5;
               this.anIntArray5287[4] = this.anIntArray5318[-349026443 * this.anInt5255];
               this.anIntArray5287[5] = this.anIntArray5289[-349026443 * this.anInt5255];
               var41 = 6;
            } else if(var12[1 - this.anInt5261 * 1437362979 & 3] && this.anIntArray5320[1] == this.anInt5255 * -349026443) {
               this.anIntArray5287[0] = this.anIntArray5317[-349026443 * this.anInt5255];
               this.anIntArray5287[1] = 3;
               this.anIntArray5287[2] = this.anIntArray5289[-349026443 * this.anInt5255];
               this.anIntArray5287[3] = 3;
               this.anIntArray5287[4] = this.anIntArray5318[this.anInt5255 * -349026443];
               this.anIntArray5287[5] = this.anIntArray5289[this.anInt5255 * -349026443];
               var41 = 6;
            } else if(var12[3 - 1437362979 * this.anInt5261 & 3] && this.anIntArray5320[3] == -349026443 * this.anInt5255) {
               this.anIntArray5287[0] = this.anIntArray5317[-349026443 * this.anInt5255];
               this.anIntArray5287[1] = 7;
               this.anIntArray5287[2] = this.anIntArray5289[-349026443 * this.anInt5255];
               this.anIntArray5287[3] = 7;
               this.anIntArray5287[4] = this.anIntArray5318[this.anInt5255 * -349026443];
               this.anIntArray5287[5] = this.anIntArray5289[-349026443 * this.anInt5255];
               var41 = 6;
            } else {
               this.anIntArray5287[0] = this.anIntArray5317[this.anInt5255 * -349026443];
               this.anIntArray5287[1] = this.anIntArray5318[-349026443 * this.anInt5255];
               this.anIntArray5287[2] = this.anIntArray5289[-349026443 * this.anInt5255];
               var41 = 3;
            }

            for(int var32 = 0; var32 < var41; ++var32) {
               int var33 = this.anIntArray5287[var32];
               int var34 = var33 - this.anInt5261 * -1420241338 & 7;
               int var35 = anIntArray5294[var33];
               int var36 = anIntArray5281[var33];
               int var37;
               int var38;
               if(1437362979 * this.anInt5261 == 1) {
                  var37 = var36;
                  var38 = 512 - var35;
               } else if(2 == 1437362979 * this.anInt5261) {
                  var37 = 512 - var35;
                  var38 = 512 - var36;
               } else if(1437362979 * this.anInt5261 == 3) {
                  var37 = 512 - var36;
                  var38 = var35;
               } else {
                  var37 = var35;
                  var38 = var36;
               }

               var14[this.anInt5307 * 1250810811] = var37;
               var15[1250810811 * this.anInt5307] = var38;
               int var39;
               int var40;
               if(var19 != null && aBoolArrayArray5282[330606131 * this.anInt5304][var33]) {
                  var39 = (var3 << 9) + var37;
                  var40 = var38 + (var4 << 9);
                  var19[this.anInt5307 * 1250810811] = var23.method1707(var39, var40, 666597449) - var22.method1707(var39, var40, 687222359);
               }

               if(var20 != null) {
                  if(var23 != null && !aBoolArrayArray5282[this.anInt5304 * 330606131][var33]) {
                     var39 = var37 + (var3 << 9);
                     var40 = (var4 << 9) + var38;
                     var20[1250810811 * this.anInt5307] = var22.method1707(var39, var40, -1798006936) - var23.method1707(var39, var40, -1259358098);
                  } else if(null != var24 && !aBoolArrayArray5283[330606131 * this.anInt5304][var33]) {
                     var39 = (var3 << 9) + var37;
                     var40 = (var4 << 9) + var38;
                     var20[this.anInt5307 * 1250810811] = var24.method1707(var39, var40, 1382666880) - var22.method1707(var39, var40, -1689469154);
                  }
               }

               if(var33 < 8 && this.anIntArray5302[var34] >= 0) {
                  if(null != var13) {
                     var13[this.anInt5307 * 1250810811] = this.anIntArray5251[var34];
                  }

                  var18[1250810811 * this.anInt5307] = this.anIntArray5241[var34];
                  var17[1250810811 * this.anInt5307] = this.anIntArray5300[var34];
                  var16[1250810811 * this.anInt5307] = this.anIntArray5298[var34];
               } else {
                  if(this.aBool5315 && aBoolArrayArray5282[this.anInt5304 * 330606131][var33]) {
                     var17[1250810811 * this.anInt5307] = this.anInt5308 * -1361515801;
                     var18[1250810811 * this.anInt5307] = this.anInt5309 * 1285200687;
                     var16[this.anInt5307 * 1250810811] = this.anInt5310 * -1718376943;
                  } else if(0 == var37 && var38 == 0) {
                     var16[1250810811 * this.anInt5307] = var21[var3][var4];
                     var17[this.anInt5307 * 1250810811] = -1086622535 * var26.anInt40;
                     var18[1250810811 * this.anInt5307] = 1506663249 * var26.anInt38;
                  } else if(0 == var37 && 512 == var38) {
                     var16[1250810811 * this.anInt5307] = var21[var3][var6];
                     var17[1250810811 * this.anInt5307] = var27.anInt40 * -1086622535;
                     var18[this.anInt5307 * 1250810811] = 1506663249 * var27.anInt38;
                  } else if(512 == var37 && var38 == 512) {
                     var16[1250810811 * this.anInt5307] = var21[var5][var6];
                     var17[1250810811 * this.anInt5307] = -1086622535 * var28.anInt40;
                     var18[this.anInt5307 * 1250810811] = 1506663249 * var28.anInt38;
                  } else if(512 == var37 && var38 == 0) {
                     var16[this.anInt5307 * 1250810811] = var21[var5][var4];
                     var17[1250810811 * this.anInt5307] = var29.anInt40 * -1086622535;
                     var18[this.anInt5307 * 1250810811] = 1506663249 * var29.anInt38;
                  } else {
                     if(var37 < 256) {
                        if(var38 < 256) {
                           var17[this.anInt5307 * 1250810811] = var26.anInt40 * -1086622535;
                           var18[1250810811 * this.anInt5307] = var26.anInt38 * 1506663249;
                        } else {
                           var17[1250810811 * this.anInt5307] = -1086622535 * var27.anInt40;
                           var18[1250810811 * this.anInt5307] = 1506663249 * var27.anInt38;
                        }
                     } else if(var38 < 256) {
                        var17[this.anInt5307 * 1250810811] = var29.anInt40 * -1086622535;
                        var18[1250810811 * this.anInt5307] = var29.anInt38 * 1506663249;
                     } else {
                        var17[this.anInt5307 * 1250810811] = -1086622535 * var28.anInt40;
                        var18[1250810811 * this.anInt5307] = var28.anInt38 * 1506663249;
                     }

                     var39 = Class386.method4759(var21[var3][var4], var21[var5][var4], var37 << 7 >> 9, -2054982832);
                     var40 = Class386.method4759(var21[var3][var6], var21[var5][var6], var37 << 7 >> 9, -1975422029);
                     var16[1250810811 * this.anInt5307] = Class386.method4759(var39, var40, var38 << 7 >> 9, -2023994109);
                  }

                  if(var13 != null) {
                     var13[this.anInt5307 * 1250810811] = var16[1250810811 * this.anInt5307];
                  }
               }

               this.anInt5307 += 1500426611;
            }

            this.anInt5255 += -1719856931;
         }

         if(0 != this.anInt5304 * 330606131 && var7.aBool43) {
            this.aBool5311 = true;
         }
      }

   }

   public void method5506(byte var1) {
      this.aBool5280 = true;
   }

   final void method5507(Class174 var1, Class653 var2, Class7 var3, int var4, int var5, int var6, int var7, short[][] var8, byte[][] var9, byte[][] var10, boolean[] var11, int var12) {
      boolean[] var13 = null != var2 && var2.aBool8465?aBoolArrayArray5240[this.anInt5304 * 330606131]:aBoolArrayArray5260[330606131 * this.anInt5304];
      int var14;
      Class653 var15;
      byte var16;
      int var17;
      int var18;
      if(var5 > 0) {
         if(var4 > 0) {
            var14 = var8[var4 - 1][var5 - 1] & 32767;
            if(var14 > 0) {
               var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, -2085681301);
               if(var15.anInt8467 * -1097883379 != -1 && var15.aBool8465) {
                  var16 = var9[var4 - 1][var5 - 1];
                  var17 = 4 + 2 * var10[var4 - 1][var5 - 1] & 7;
                  var18 = Class50.method942(var1, var15, (byte)7);
                  if(aBoolArrayArray5282[var16][var17]) {
                     this.anIntArray5298[0] = -1097883379 * var15.anInt8467;
                     this.anIntArray5251[0] = var18;
                     this.anIntArray5300[0] = -1072075383 * var15.anInt8468;
                     this.anIntArray5241[0] = 1578550255 * var15.anInt8471;
                     this.anIntArray5302[0] = var15.anInt8473 * 2088260579;
                     this.anIntArray5303[0] = 256;
                  }
               }
            }
         }

         if(var4 < var6 - 1) {
            var14 = var8[var4 + 1][var5 - 1] & 32767;
            if(var14 > 0) {
               var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, -85053184);
               if(-1097883379 * var15.anInt8467 != -1 && var15.aBool8465) {
                  var16 = var9[var4 + 1][var5 - 1];
                  var17 = var10[var4 + 1][var5 - 1] * 2 + 6 & 7;
                  var18 = Class50.method942(var1, var15, (byte)7);
                  if(aBoolArrayArray5282[var16][var17]) {
                     this.anIntArray5298[2] = var15.anInt8467 * -1097883379;
                     this.anIntArray5251[2] = var18;
                     this.anIntArray5300[2] = -1072075383 * var15.anInt8468;
                     this.anIntArray5241[2] = 1578550255 * var15.anInt8471;
                     this.anIntArray5302[2] = 2088260579 * var15.anInt8473;
                     this.anIntArray5303[2] = 512;
                  }
               }
            }
         }
      }

      if(var5 < var7 - 1) {
         if(var4 > 0) {
            var14 = var8[var4 - 1][1 + var5] & 32767;
            if(var14 > 0) {
               var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, -1302686321);
               if(-1097883379 * var15.anInt8467 != -1 && var15.aBool8465) {
                  var16 = var9[var4 - 1][1 + var5];
                  var17 = var10[var4 - 1][var5 + 1] * 2 + 2 & 7;
                  var18 = Class50.method942(var1, var15, (byte)7);
                  if(aBoolArrayArray5282[var16][var17]) {
                     this.anIntArray5298[6] = var15.anInt8467 * -1097883379;
                     this.anIntArray5251[6] = var18;
                     this.anIntArray5300[6] = var15.anInt8468 * -1072075383;
                     this.anIntArray5241[6] = var15.anInt8471 * 1578550255;
                     this.anIntArray5302[6] = 2088260579 * var15.anInt8473;
                     this.anIntArray5303[6] = 64;
                  }
               }
            }
         }

         if(var4 < var6 - 1) {
            var14 = var8[var4 + 1][1 + var5] & 32767;
            if(var14 > 0) {
               var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, 181486023);
               if(-1097883379 * var15.anInt8467 != -1 && var15.aBool8465) {
                  var16 = var9[1 + var4][1 + var5];
                  var17 = var10[1 + var4][1 + var5] * 2 + 0 & 7;
                  var18 = Class50.method942(var1, var15, (byte)7);
                  if(aBoolArrayArray5282[var16][var17]) {
                     this.anIntArray5298[4] = var15.anInt8467 * -1097883379;
                     this.anIntArray5251[4] = var18;
                     this.anIntArray5300[4] = -1072075383 * var15.anInt8468;
                     this.anIntArray5241[4] = 1578550255 * var15.anInt8471;
                     this.anIntArray5302[4] = 2088260579 * var15.anInt8473;
                     this.anIntArray5303[4] = 128;
                  }
               }
            }
         }
      }

      int var19;
      int var20;
      int var21;
      byte var23;
      if(var5 > 0) {
         var14 = var8[var4][var5 - 1] & 32767;
         if(var14 > 0) {
            var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, -1865209662);
            if(-1097883379 * var15.anInt8467 != -1) {
               var16 = var9[var4][var5 - 1];
               var23 = var10[var4][var5 - 1];
               if(var15.aBool8465) {
                  var18 = 2;
                  var19 = 4 + var23 * 2;
                  var20 = Class50.method942(var1, var15, (byte)7);

                  for(var21 = 0; var21 < 3; ++var21) {
                     var19 &= 7;
                     var18 &= 7;
                     if(aBoolArrayArray5282[var16][var19] && this.anIntArray5302[var18] <= 2088260579 * var15.anInt8473) {
                        this.anIntArray5298[var18] = var15.anInt8467 * -1097883379;
                        this.anIntArray5251[var18] = var20;
                        this.anIntArray5300[var18] = var15.anInt8468 * -1072075383;
                        this.anIntArray5241[var18] = 1578550255 * var15.anInt8471;
                        if(this.anIntArray5302[var18] == var15.anInt8473 * 2088260579) {
                           this.anIntArray5303[var18] |= 32;
                        } else {
                           this.anIntArray5303[var18] = 32;
                        }

                        this.anIntArray5302[var18] = 2088260579 * var15.anInt8473;
                     }

                     ++var19;
                     --var18;
                  }

                  if(!var13[0 + 1437362979 * this.anInt5261 & 3]) {
                     var11[0] = aBoolArrayArray5240[var16][2 + var23 & 3];
                  }
               } else if(!var13[0 + this.anInt5261 * 1437362979 & 3]) {
                  var11[0] = aBoolArrayArray5260[var16][var23 + 2 & 3];
               }
            }
         }
      }

      if(var5 < var7 - 1) {
         var14 = var8[var4][var5 + 1] & 32767;
         if(var14 > 0) {
            var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, -1327726640);
            if(-1097883379 * var15.anInt8467 != -1) {
               var16 = var9[var4][1 + var5];
               var23 = var10[var4][1 + var5];
               if(var15.aBool8465) {
                  var18 = 4;
                  var19 = 2 + 2 * var23;
                  var20 = Class50.method942(var1, var15, (byte)7);

                  for(var21 = 0; var21 < 3; ++var21) {
                     var19 &= 7;
                     var18 &= 7;
                     if(aBoolArrayArray5282[var16][var19] && this.anIntArray5302[var18] <= 2088260579 * var15.anInt8473) {
                        this.anIntArray5298[var18] = var15.anInt8467 * -1097883379;
                        this.anIntArray5251[var18] = var20;
                        this.anIntArray5300[var18] = var15.anInt8468 * -1072075383;
                        this.anIntArray5241[var18] = 1578550255 * var15.anInt8471;
                        if(2088260579 * var15.anInt8473 == this.anIntArray5302[var18]) {
                           this.anIntArray5303[var18] |= 16;
                        } else {
                           this.anIntArray5303[var18] = 16;
                        }

                        this.anIntArray5302[var18] = 2088260579 * var15.anInt8473;
                     }

                     --var19;
                     ++var18;
                  }

                  if(!var13[1437362979 * this.anInt5261 + 2 & 3]) {
                     var11[2] = aBoolArrayArray5240[var16][0 + var23 & 3];
                  }
               } else if(!var13[this.anInt5261 * 1437362979 + 2 & 3]) {
                  var11[2] = aBoolArrayArray5260[var16][var23 + 0 & 3];
               }
            }
         }
      }

      if(var4 > 0) {
         var14 = var8[var4 - 1][var5] & 32767;
         if(var14 > 0) {
            var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, -275584781);
            if(-1 != var15.anInt8467 * -1097883379) {
               var16 = var9[var4 - 1][var5];
               var23 = var10[var4 - 1][var5];
               if(var15.aBool8465) {
                  var18 = 6;
                  var19 = 4 + var23 * 2;
                  var20 = Class50.method942(var1, var15, (byte)7);

                  for(var21 = 0; var21 < 3; ++var21) {
                     var19 &= 7;
                     var18 &= 7;
                     if(aBoolArrayArray5282[var16][var19] && this.anIntArray5302[var18] <= var15.anInt8473 * 2088260579) {
                        this.anIntArray5298[var18] = var15.anInt8467 * -1097883379;
                        this.anIntArray5251[var18] = var20;
                        this.anIntArray5300[var18] = var15.anInt8468 * -1072075383;
                        this.anIntArray5241[var18] = 1578550255 * var15.anInt8471;
                        if(this.anIntArray5302[var18] == var15.anInt8473 * 2088260579) {
                           this.anIntArray5303[var18] |= 8;
                        } else {
                           this.anIntArray5303[var18] = 8;
                        }

                        this.anIntArray5302[var18] = var15.anInt8473 * 2088260579;
                     }

                     --var19;
                     ++var18;
                  }

                  if(!var13[3 + 1437362979 * this.anInt5261 & 3]) {
                     var11[3] = aBoolArrayArray5240[var16][var23 + 1 & 3];
                  }
               } else if(!var13[this.anInt5261 * 1437362979 + 3 & 3]) {
                  var11[3] = aBoolArrayArray5260[var16][var23 + 1 & 3];
               }
            }
         }
      }

      if(var4 < var6 - 1) {
         var14 = var8[1 + var4][var5] & 32767;
         if(var14 > 0) {
            var15 = (Class653)this.aClass40_Sub10_5299.method89(var14 - 1, -1074457752);
            if(var15.anInt8467 * -1097883379 != -1) {
               var16 = var9[var4 + 1][var5];
               var23 = var10[var4 + 1][var5];
               if(var15.aBool8465) {
                  var18 = 4;
                  var19 = 6 + var23 * 2;
                  var20 = Class50.method942(var1, var15, (byte)7);

                  for(var21 = 0; var21 < 3; ++var21) {
                     var19 &= 7;
                     var18 &= 7;
                     if(aBoolArrayArray5282[var16][var19] && this.anIntArray5302[var18] <= 2088260579 * var15.anInt8473) {
                        this.anIntArray5298[var18] = -1097883379 * var15.anInt8467;
                        this.anIntArray5251[var18] = var20;
                        this.anIntArray5300[var18] = var15.anInt8468 * -1072075383;
                        this.anIntArray5241[var18] = 1578550255 * var15.anInt8471;
                        if(this.anIntArray5302[var18] == 2088260579 * var15.anInt8473) {
                           this.anIntArray5303[var18] |= 4;
                        } else {
                           this.anIntArray5303[var18] = 4;
                        }

                        this.anIntArray5302[var18] = var15.anInt8473 * 2088260579;
                     }

                     ++var19;
                     --var18;
                  }

                  if(!var13[1437362979 * this.anInt5261 + 1 & 3]) {
                     var11[1] = aBoolArrayArray5240[var16][3 + var23 & 3];
                  }
               } else if(!var13[1 + this.anInt5261 * 1437362979 & 3]) {
                  var11[1] = aBoolArrayArray5260[var16][var23 + 3 & 3];
               }
            }
         }
      }

      if(null != var2 && var2.aBool8465) {
         var14 = Class50.method942(var1, var2, (byte)7);

         for(int var22 = 0; var22 < 8; ++var22) {
            int var24 = var22 - -1420241338 * this.anInt5261 & 7;
            if(aBoolArrayArray5282[this.anInt5304 * 330606131][var22] && this.anIntArray5302[var24] <= 2088260579 * var2.anInt8473) {
               this.anIntArray5298[var24] = -1097883379 * var2.anInt8467;
               this.anIntArray5251[var24] = var14;
               this.anIntArray5300[var24] = -1072075383 * var2.anInt8468;
               this.anIntArray5241[var24] = var2.anInt8471 * 1578550255;
               if(this.anIntArray5302[var24] == 2088260579 * var2.anInt8473) {
                  this.anIntArray5303[var24] |= 2;
               } else {
                  this.anIntArray5303[var24] = 2;
               }

               this.anIntArray5302[var24] = var2.anInt8473 * 2088260579;
            }
         }
      }

   }

   public void method5508() {
      this.aBool5280 = true;
   }

   public void method5509(byte var1) {
      this.anIntArray5286 = null;
      this.anIntArray5256 = null;
      this.anIntArray5257 = null;
      this.anIntArray5258 = null;
      this.anIntArray5259 = null;
      this.aBool5280 = false;
   }

   public void method5510() {
      this.aBool5280 = true;
   }

   public void method5511() {
      this.anIntArray5286 = null;
      this.anIntArray5256 = null;
      this.anIntArray5257 = null;
      this.anIntArray5258 = null;
      this.anIntArray5259 = null;
      this.aBool5280 = false;
   }

   public void method5512() {
      this.anIntArray5286 = null;
      this.anIntArray5256 = null;
      this.anIntArray5257 = null;
      this.anIntArray5258 = null;
      this.anIntArray5259 = null;
      this.aBool5280 = false;
   }

   static final int method5513(int var0, int var1) {
      int var2 = Class182.method2689(var0 - 1, var1 - 1, 677315506) + Class182.method2689(var0 + 1, var1 - 1, 677315506) + Class182.method2689(var0 - 1, 1 + var1, 677315506) + Class182.method2689(var0 + 1, 1 + var1, 677315506);
      int var3 = Class182.method2689(var0 - 1, var1, 677315506) + Class182.method2689(var0 + 1, var1, 677315506) + Class182.method2689(var0, var1 - 1, 677315506) + Class182.method2689(var0, var1 + 1, 677315506);
      int var4 = Class182.method2689(var0, var1, 677315506);
      return var3 / 8 + var2 / 16 + var4 / 4;
   }

   static final int method5514(int var0, int var1) {
      int var2 = InterfaceDef.method3380('\ub135' + var0, var1 + 91923, 4, -792953205) - 128 + (InterfaceDef.method3380(10294 + var0, '\u93bd' + var1, 2, -1107670889) - 128 >> 1) + (InterfaceDef.method3380(var0, var1, 1, -930012451) - 128 >> 2);
      var2 = 35 + (int)(0.3D * (double)var2);
      if(var2 < 10) {
         var2 = 10;
      } else if(var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   void method5515(Class148 var1, Class7 var2, Class653 var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var1.method1714(var5, var6, -2050771651);
      int var13 = var1.method1714(var7, var6, 401240302);
      int var14 = var1.method1714(var7, var8, -1164333383);
      int var15 = var1.method1714(var5, var8, 1016064821);
      boolean var16 = this.aClass470_5235.method5614(var5, var6, -1351943297);
      if(var16 && var4 > 1 || !var16 && var4 > 0) {
         boolean var17 = true;
         if(var2 != null && !var2.aBool36) {
            var17 = false;
         } else if(0 == var9 && 0 != 330606131 * this.anInt5304) {
            var17 = false;
         } else if(var10 > 0 && var3 != null && !var3.aBool8474) {
            var17 = false;
         }

         if(var17 && var13 == var12 && var14 == var12 && var12 == var15) {
            this.aByteArrayArrayArray5243[var4][var5][var6] = (byte)(this.aByteArrayArrayArray5243[var4][var5][var6] | 4);
         }
      }

   }

   public final void method5516(Class174 var1, Class148 var2, Class148 var3, int var4) {
      int[][] var5 = new int[-1225795677 * this.anInt5244][this.anInt5245 * -1769380583];
      if(null == this.anIntArray5286 || this.anIntArray5286.length != -1769380583 * this.anInt5245) {
         this.anIntArray5286 = new int[this.anInt5245 * -1769380583];
         this.anIntArray5256 = new int[this.anInt5245 * -1769380583];
         this.anIntArray5257 = new int[-1769380583 * this.anInt5245];
         this.anIntArray5258 = new int[this.anInt5245 * -1769380583];
         this.anIntArray5259 = new int[this.anInt5245 * -1769380583];
      }

      int var6;
      for(var6 = 0; var6 < -1917803745 * this.anInt5269; ++var6) {
         int var7;
         for(var7 = 0; var7 < -1769380583 * this.anInt5245; ++var7) {
            this.anIntArray5286[var7] = 0;
            this.anIntArray5256[var7] = 0;
            this.anIntArray5257[var7] = 0;
            this.anIntArray5258[var7] = 0;
            this.anIntArray5259[var7] = 0;
         }

         for(var7 = -5; var7 < -1225795677 * this.anInt5244; ++var7) {
            int var8;
            int var9;
            int var10;
            int var16;
            for(var8 = 0; var8 < -1769380583 * this.anInt5245; ++var8) {
               var9 = 5 + var7;
               if(var9 < this.anInt5244 * -1225795677) {
                  var10 = this.aShortArrayArrayArray5275[var6][var9][var8] & 32767;
                  if(var10 > 0) {
                     Class7 var11 = (Class7)this.aClass40_Sub18_5234.method89(var10 - 1, -970498499);
                     this.anIntArray5286[var8] += -1686124027 * var11.anInt41;
                     this.anIntArray5256[var8] += -657442929 * var11.anInt42;
                     this.anIntArray5257[var8] += 1582364597 * var11.anInt39;
                     this.anIntArray5258[var8] += 1113295925 * var11.anInt44;
                     ++this.anIntArray5259[var8];
                  }
               }

               var10 = var7 - 5;
               if(var10 >= 0) {
                  var16 = this.aShortArrayArrayArray5275[var6][var10][var8] & 32767;
                  if(var16 > 0) {
                     Class7 var12 = (Class7)this.aClass40_Sub18_5234.method89(var16 - 1, -417376278);
                     this.anIntArray5286[var8] -= var12.anInt41 * -1686124027;
                     this.anIntArray5256[var8] -= var12.anInt42 * -657442929;
                     this.anIntArray5257[var8] -= var12.anInt39 * 1582364597;
                     this.anIntArray5258[var8] -= 1113295925 * var12.anInt44;
                     --this.anIntArray5259[var8];
                  }
               }
            }

            if(var7 >= 0) {
               var8 = 0;
               var9 = 0;
               var10 = 0;
               var16 = 0;
               int var17 = 0;

               for(int var13 = -5; var13 < this.anInt5245 * -1769380583; ++var13) {
                  int var14 = var13 + 5;
                  if(var14 < this.anInt5245 * -1769380583) {
                     var8 += this.anIntArray5286[var14];
                     var9 += this.anIntArray5256[var14];
                     var10 += this.anIntArray5257[var14];
                     var16 += this.anIntArray5258[var14];
                     var17 += this.anIntArray5259[var14];
                  }

                  int var15 = var13 - 5;
                  if(var15 >= 0) {
                     var8 -= this.anIntArray5286[var15];
                     var9 -= this.anIntArray5256[var15];
                     var10 -= this.anIntArray5257[var15];
                     var16 -= this.anIntArray5258[var15];
                     var17 -= this.anIntArray5259[var15];
                  }

                  if(var13 >= 0 && var16 > 0 && var17 > 0) {
                     var5[var7][var13] = Class544.method6509(var8 * 256 / var16, var9 / var17, var10 / var17, 1382309848);
                  }
               }
            }
         }

         if(this.aBool5274) {
            this.method5520(var1, this.aClass549_5252.aClass148Array7288[var6], var6, var5, var6 == 0?var2:null, var6 == 0?var3:null, 1229636666);
         } else {
            this.method5502(var1, this.aClass549_5252.aClass148Array7288[var6], var6, var5, 0 == var6?var2:null, var6 == 0?var3:null, (byte)64);
         }

         this.aShortArrayArrayArray5275[var6] = (short[][])null;
         this.aShortArrayArrayArray5253[var6] = (short[][])null;
         this.aByteArrayArrayArray5250[var6] = (byte[][])null;
         this.aByteArrayArrayArray5292[var6] = (byte[][])null;
      }

      if(!this.aBool5246) {
         if(0 != this.anInt5238 * -1503116445) {
            this.aClass549_5252.method6584(-2048547817);
         }

         if(this.aBool5233) {
            this.aClass549_5252.method6603((byte)-116);
         }
      }

      for(var6 = 0; var6 < -1917803745 * this.anInt5269; ++var6) {
         this.aClass549_5252.aClass148Array7288[var6].method1737();
      }

   }

   public void method5517() {
      this.aBool5280 = true;
   }

   void method5518(Class174 var1, Class653 var2, Class7 var3, int var4, int var5, byte[][] var6, byte[][] var7, short[][] var8, boolean[] var9, byte var10) {
      boolean[] var11 = var2 != null && var2.aBool8465?aBoolArrayArray5240[this.anInt5304 * 330606131]:aBoolArrayArray5260[this.anInt5304 * 330606131];
      this.method5507(var1, var2, var3, var4, var5, -1225795677 * this.anInt5244, this.anInt5245 * -1769380583, var8, var6, var7, var9, -972254963);
      this.aBool5314 = var2 != null && var2.anInt8467 * -1097883379 != var2.anInt8470 * -1893458545;
      if(!this.aBool5314) {
         for(int var12 = 0; var12 < 8; ++var12) {
            if(this.anIntArray5302[var12] >= 0 && this.anIntArray5251[var12] != this.anIntArray5298[var12]) {
               this.aBool5314 = true;
               break;
            }
         }
      }

      if(!var11[1 + this.anInt5261 * 1437362979 & 3]) {
         var9[1] |= (this.anIntArray5303[2] & this.anIntArray5303[4]) == 0;
      }

      if(!var11[this.anInt5261 * 1437362979 + 3 & 3]) {
         var9[3] |= 0 == (this.anIntArray5303[6] & this.anIntArray5303[0]);
      }

      if(!var11[this.anInt5261 * 1437362979 + 0 & 3]) {
         var9[0] |= (this.anIntArray5303[0] & this.anIntArray5303[2]) == 0;
      }

      if(!var11[this.anInt5261 * 1437362979 + 2 & 3]) {
         var9[2] |= (this.anIntArray5303[4] & this.anIntArray5303[6]) == 0;
      }

      if(!this.aBool5315 && (0 == 330606131 * this.anInt5304 || 330606131 * this.anInt5304 == 12)) {
         if(var9[0] && !var9[1] && !var9[2] && var9[3]) {
            var9[3] = false;
            var9[0] = false;
            this.anInt5304 = (this.anInt5304 * 330606131 == 0?13:14) * -791231237;
            this.anInt5261 = 0;
         } else if(var9[0] && var9[1] && !var9[2] && !var9[3]) {
            var9[1] = false;
            var9[0] = false;
            this.anInt5304 = (330606131 * this.anInt5304 == 0?13:14) * -791231237;
            this.anInt5261 = -605399647;
         } else if(!var9[0] && var9[1] && var9[2] && !var9[3]) {
            var9[2] = false;
            var9[1] = false;
            this.anInt5304 = (0 == this.anInt5304 * 330606131?13:14) * -791231237;
            this.anInt5261 = -1835255530;
         } else if(!var9[0] && !var9[1] && var9[2] && var9[3]) {
            var9[3] = false;
            var9[2] = false;
            this.anInt5304 = (0 == this.anInt5304 * 330606131?13:14) * -791231237;
            this.anInt5261 = 1229855883;
         }
      }

   }

   void method5519(Class174 var1, int var2, int var3, int var4, Class653 var5, boolean[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, int[] var14, Class148 var15, Class148 var16, Class148 var17, byte var18) {
      this.anInt5310 = 616297743;
      this.anInt5308 = 1548187433;
      this.anInt5309 = 1720438528;
      if(var5 != null) {
         this.anInt5310 = -403366083 * var5.anInt8467;
         this.anInt5308 = var5.anInt8468 * -855390705;
         this.anInt5309 = var5.anInt8471 * -905628863;
         int var19 = Class50.method942(var1, var5, (byte)7);

         for(int var20 = 0; var20 < -318557831 * this.anInt5316; ++var20) {
            boolean var21 = false;
            byte var31;
            if(var6[0 - this.anInt5261 * 1437362979 & 3] && this.anInt5255 * -349026443 == this.anIntArray5320[0]) {
               this.anIntArray5287[0] = this.anIntArray5317[this.anInt5255 * -349026443];
               this.anIntArray5287[1] = 1;
               this.anIntArray5287[2] = this.anIntArray5289[this.anInt5255 * -349026443];
               this.anIntArray5287[3] = 1;
               this.anIntArray5287[4] = this.anIntArray5318[this.anInt5255 * -349026443];
               this.anIntArray5287[5] = this.anIntArray5289[-349026443 * this.anInt5255];
               var31 = 6;
            } else if(var6[2 - this.anInt5261 * 1437362979 & 3] && this.anIntArray5320[2] == this.anInt5255 * -349026443) {
               this.anIntArray5287[0] = this.anIntArray5317[this.anInt5255 * -349026443];
               this.anIntArray5287[1] = 5;
               this.anIntArray5287[2] = this.anIntArray5289[this.anInt5255 * -349026443];
               this.anIntArray5287[3] = 5;
               this.anIntArray5287[4] = this.anIntArray5318[-349026443 * this.anInt5255];
               this.anIntArray5287[5] = this.anIntArray5289[-349026443 * this.anInt5255];
               var31 = 6;
            } else if(var6[1 - 1437362979 * this.anInt5261 & 3] && this.anInt5255 * -349026443 == this.anIntArray5320[1]) {
               this.anIntArray5287[0] = this.anIntArray5317[-349026443 * this.anInt5255];
               this.anIntArray5287[1] = 3;
               this.anIntArray5287[2] = this.anIntArray5289[this.anInt5255 * -349026443];
               this.anIntArray5287[3] = 3;
               this.anIntArray5287[4] = this.anIntArray5318[this.anInt5255 * -349026443];
               this.anIntArray5287[5] = this.anIntArray5289[-349026443 * this.anInt5255];
               var31 = 6;
            } else if(var6[3 - this.anInt5261 * 1437362979 & 3] && this.anIntArray5320[3] == this.anInt5255 * -349026443) {
               this.anIntArray5287[0] = this.anIntArray5317[-349026443 * this.anInt5255];
               this.anIntArray5287[1] = 7;
               this.anIntArray5287[2] = this.anIntArray5289[this.anInt5255 * -349026443];
               this.anIntArray5287[3] = 7;
               this.anIntArray5287[4] = this.anIntArray5318[this.anInt5255 * -349026443];
               this.anIntArray5287[5] = this.anIntArray5289[-349026443 * this.anInt5255];
               var31 = 6;
            } else {
               this.anIntArray5287[0] = this.anIntArray5317[-349026443 * this.anInt5255];
               this.anIntArray5287[1] = this.anIntArray5318[this.anInt5255 * -349026443];
               this.anIntArray5287[2] = this.anIntArray5289[-349026443 * this.anInt5255];
               var31 = 3;
            }

            for(int var22 = 0; var22 < var31; ++var22) {
               int var23 = this.anIntArray5287[var22];
               int var24 = var23 - this.anInt5261 * -1420241338 & 7;
               int var25 = anIntArray5294[var23];
               int var26 = anIntArray5281[var23];
               int var27;
               int var28;
               if(1 == this.anInt5261 * 1437362979) {
                  var27 = var26;
                  var28 = 512 - var25;
               } else if(2 == 1437362979 * this.anInt5261) {
                  var27 = 512 - var25;
                  var28 = 512 - var26;
               } else if(1437362979 * this.anInt5261 == 3) {
                  var27 = 512 - var26;
                  var28 = var25;
               } else {
                  var27 = var25;
                  var28 = var26;
               }

               var8[this.anInt5307 * 1250810811] = var27;
               var9[this.anInt5307 * 1250810811] = var28;
               int var29;
               int var30;
               if(null != var13 && aBoolArrayArray5282[this.anInt5304 * 330606131][var23]) {
                  var29 = var27 + (var3 << 9);
                  var30 = var28 + (var4 << 9);
                  var13[this.anInt5307 * 1250810811] = var16.method1707(var29, var30, -1057510253) - var15.method1707(var29, var30, 1164460287);
               }

               if(var14 != null) {
                  if(var16 != null && !aBoolArrayArray5282[this.anInt5304 * 330606131][var23]) {
                     var29 = var27 + (var3 << 9);
                     var30 = (var4 << 9) + var28;
                     var14[this.anInt5307 * 1250810811] = var15.method1707(var29, var30, 732030112) - var16.method1707(var29, var30, 563094999);
                  } else if(var17 != null && !aBoolArrayArray5283[this.anInt5304 * 330606131][var23]) {
                     var29 = (var3 << 9) + var27;
                     var30 = (var4 << 9) + var28;
                     var14[this.anInt5307 * 1250810811] = var17.method1707(var29, var30, -92069822) - var15.method1707(var29, var30, -908196508);
                  }
               }

               if(var23 < 8 && this.anIntArray5302[var24] > 2088260579 * var5.anInt8473) {
                  if(var7 != null) {
                     var7[1250810811 * this.anInt5307] = this.anIntArray5251[var24];
                  }

                  var12[this.anInt5307 * 1250810811] = this.anIntArray5241[var24];
                  var11[this.anInt5307 * 1250810811] = this.anIntArray5300[var24];
                  var10[this.anInt5307 * 1250810811] = this.anIntArray5298[var24];
               } else {
                  if(var7 != null) {
                     var7[this.anInt5307 * 1250810811] = var19;
                  }

                  var11[this.anInt5307 * 1250810811] = -1072075383 * var5.anInt8468;
                  var12[this.anInt5307 * 1250810811] = var5.anInt8471 * 1578550255;
                  var10[1250810811 * this.anInt5307] = this.anInt5310 * -1718376943;
               }

               this.anInt5307 += 1500426611;
            }

            this.anInt5255 += -1719856931;
         }

         if(!this.aBool5246 && var2 == 0) {
            this.aClass549_5252.method6575(var3, var4, -949782713 * var5.anInt8472, var5.anInt8475 * 339225960, var5.anInt8477 * 1902440907, -1519859357 * var5.anInt8476, -1212193059 * var5.anInt8479, var5.anInt8480 * 2058133549, 1373275114);
         }

         if(12 != this.anInt5304 * 330606131 && -1 != var5.anInt8467 * -1097883379 && var5.aBool8469) {
            this.aBool5311 = true;
         }
      } else if(this.aBool5313) {
         this.anInt5255 += -1719856931 * anIntArray5273[330606131 * this.anInt5304];
      } else if(this.aBool5315) {
         this.anInt5255 += -1719856931 * anIntArray5278[330606131 * this.anInt5304];
      } else {
         this.anInt5255 += -1719856931 * anIntArray5276[this.anInt5304 * 330606131];
      }

   }

   void method5520(Class174 var1, Class148 var2, int var3, int[][] var4, Class148 var5, Class148 var6, int var7) {
      byte[][] var8 = this.aByteArrayArrayArray5250[var3];
      byte[][] var9 = this.aByteArrayArrayArray5292[var3];
      short[][] var10 = this.aShortArrayArrayArray5275[var3];
      short[][] var11 = this.aShortArrayArrayArray5253[var3];
      boolean[] var12 = new boolean[4];

      for(int var13 = 0; var13 < -1225795677 * this.anInt5244; ++var13) {
         int var14 = var13 < -1225795677 * this.anInt5244 - 1?1 + var13:var13;

         for(int var15 = 0; var15 < -1769380583 * this.anInt5245; ++var15) {
            int var16 = var15 < -1769380583 * this.anInt5245 - 1?var15 + 1:var15;
            this.anInt5304 = -791231237 * var8[var13][var15];
            this.anInt5261 = var9[var13][var15] * 1229855883;
            int var17 = var11[var13][var15] & 32767;
            int var18 = var10[var13][var15] & 32767;
            if(0 != var17 || var18 != 0) {
               Class653 var19 = (Class653)(0 != var17?this.aClass40_Sub10_5299.method89(var17 - 1, -1006673912):null);
               Class7 var20 = (Class7)(0 != var18?this.aClass40_Sub18_5234.method89(var18 - 1, 274205525):null);
               if(330606131 * this.anInt5304 == 0 && var19 == null) {
                  this.anInt5304 = -904840252;
               }

               this.aBool5311 = false;
               this.aBool5315 = false;
               var12[3] = false;
               var12[2] = false;
               var12[1] = false;
               var12[0] = false;
               Class653 var24 = var19;
               if(null != var19) {
                  if(-1097883379 * var19.anInt8467 == -1 && var19.anInt8470 * -1893458545 == -1) {
                     var24 = var19;
                     var19 = null;
                  } else if(null != var20 && 0 != this.anInt5304 * 330606131) {
                     this.aBool5315 = var19.aBool8465;
                  }
               }

               this.anInt5261 = this.method5503(var18, var13, var15, var14, var16, var2, var10, (byte)16) * 1229855883;

               int var25;
               for(var25 = 0; var25 < 13; ++var25) {
                  this.anIntArray5302[var25] = -1;
                  this.anIntArray5303[var25] = 1;
               }

               this.method5518(var1, var19, var20, var13, var15, var8, var9, var11, var12, (byte)1);
               this.aBool5313 = !this.aBool5315 && !var12[0] && !var12[2] && !var12[1] && !var12[3];
               this.method5504(var19, var20, (byte)16);
               var25 = -318557831 * this.anInt5316 + -2145807775 * this.anInt5319;
               if(var25 <= 0) {
                  this.aClass549_5252.method6562(var3, var13, var15, -1444896691);
               } else {
                  if(var12[0]) {
                     ++var25;
                  }

                  if(var12[2]) {
                     ++var25;
                  }

                  if(var12[1]) {
                     ++var25;
                  }

                  if(var12[3]) {
                     ++var25;
                  }

                  this.anInt5255 = 0;
                  this.anInt5307 = 0;
                  int var26 = var25 * 3;
                  int[] var27 = this.aBool5314?new int[var26]:null;
                  int[] var28 = new int[var26];
                  int[] var29 = new int[var26];
                  int[] var30 = new int[var26];
                  int[] var31 = new int[var26];
                  int[] var32 = new int[var26];
                  int[] var33 = var6 != null?new int[var26]:null;
                  int[] var34 = null == var6 && null == var5?null:new int[var26];

                  int var35;
                  for(var35 = 0; var35 < var26; ++var35) {
                     var31[var35] = -1;
                  }

                  this.method5519(var1, var3, var13, var15, var19, var12, var27, var28, var29, var30, var31, var32, var33, var34, var2, var6, var5, (byte)6);
                  var35 = var10[var13][var16] & 32767;
                  int var36 = var10[var14][var16] & 32767;
                  int var37 = var10[var14][var15] & 32767;
                  this.method5505(var1, var3, var13, var15, var14, var16, var20, var18, var35, var36, var37, var12, var27, var28, var29, var30, var31, var32, var33, var34, var4, var2, var6, var5, 1656883317);
                  this.method5515(var2, var20, var24, var3, var13, var15, var14, var16, var18, var17, -1942110206);
                  Class172 var38 = new Class172();
                  if(this.aBool5246) {
                     var38.anInt2019 = this.aClass549_5252.method6613(var13, var15, -1040105921) * -1687600729;
                     var38.anInt2020 = this.aClass549_5252.method6569(var13, var15, (byte)115) * 440036469;
                     var38.anInt2018 = this.aClass549_5252.method6571(var13, var15, -1557069518) * -1588695373;
                     var38.anInt2022 = this.aClass549_5252.method6572(var13, var15, -2124584180) * -1126721515;
                     var38.anInt2023 = this.aClass549_5252.method6614(var13, var15, (byte)1) * 137365799;
                     var38.anInt2024 = this.aClass549_5252.method6574(var13, var15, (short)-2416) * 66315777;
                  }

                  var2.method1699(var13, var15, var28, var33, var29, var34, var30, var27, var31, var32, var38, this.aBool5311);
                  this.aClass549_5252.method6562(var3, var13, var15, -1758409624);
               }
            }
         }
      }

   }

   static final int method5521(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = var2 * (789221 + var2 * var2 * 15731) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   static final int method5522(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = var2 * (789221 + var2 * var2 * 15731) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   public static void method5523(boolean var0, int var1) {
   }

   static final void method5524(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class526_Sub38 var4 = (Class526_Sub38)client.aClass20_11187.get((long)var2);
      if(var4 != null && var4.anInt10684 * -870147923 == var3) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method5525(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub23_10630.method10062(-1290835381);
   }

   static boolean method5526(int var0, byte var1) {
      return var0 == 44 || var0 == 45 || 46 == var0 || 47 == var0 || var0 == 48 || var0 == 49 || 50 == var0 || var0 == 51 || 52 == var0 || 53 == var0 || 15 == var0;
   }

   public static byte[] method5527(CharSequence var0, byte var1) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if((var5 <= 0 || var5 >= 128) && (var5 < 160 || var5 > 255)) {
            if(8364 == var5) {
               var3[var4] = -128;
            } else if(8218 == var5) {
               var3[var4] = -126;
            } else if(402 == var5) {
               var3[var4] = -125;
            } else if(8222 == var5) {
               var3[var4] = -124;
            } else if(var5 == 8230) {
               var3[var4] = -123;
            } else if(8224 == var5) {
               var3[var4] = -122;
            } else if(var5 == 8225) {
               var3[var4] = -121;
            } else if(710 == var5) {
               var3[var4] = -120;
            } else if(var5 == 8240) {
               var3[var4] = -119;
            } else if(var5 == 352) {
               var3[var4] = -118;
            } else if(8249 == var5) {
               var3[var4] = -117;
            } else if(338 == var5) {
               var3[var4] = -116;
            } else if(var5 == 381) {
               var3[var4] = -114;
            } else if(var5 == 8216) {
               var3[var4] = -111;
            } else if(var5 == 8217) {
               var3[var4] = -110;
            } else if(8220 == var5) {
               var3[var4] = -109;
            } else if(var5 == 8221) {
               var3[var4] = -108;
            } else if(var5 == 8226) {
               var3[var4] = -107;
            } else if(8211 == var5) {
               var3[var4] = -106;
            } else if(var5 == 8212) {
               var3[var4] = -105;
            } else if(732 == var5) {
               var3[var4] = -104;
            } else if(var5 == 8482) {
               var3[var4] = -103;
            } else if(353 == var5) {
               var3[var4] = -102;
            } else if(8250 == var5) {
               var3[var4] = -101;
            } else if(var5 == 339) {
               var3[var4] = -100;
            } else if(var5 == 382) {
               var3[var4] = -98;
            } else if(376 == var5) {
               var3[var4] = -97;
            } else {
               var3[var4] = 63;
            }
         } else {
            var3[var4] = (byte)var5;
         }
      }

      return var3;
   }

   public static void method5528(int var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(23, (long)var0);
      var2.method10583((byte)-117);
   }
}
