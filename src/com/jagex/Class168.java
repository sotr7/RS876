package com.jagex;

import com.jagex.Class141;
import com.jagex.Class148;
import com.jagex.Class164;
import com.jagex.Class170;
import com.jagex.Class180;
import com.jagex.Class182;
import com.jagex.Class183;
import com.jagex.Class445;
import com.jagex.Class526_Sub11;
import com.jagex.Class526_Sub21_Sub11;
import com.jagex.Class526_Sub21_Sub5;

public abstract class Class168 {
   static final float aFloat1911 = 3.1415927F;
   protected boolean aBool1910 = false;
   public boolean aBool1909 = true;

   public abstract void method1940(short var1, short var2);

   public abstract int method1941();

   public abstract void method1942(Class445 var1);

   static int method1943(float var0, float var1, float var2) {
      float var3 = var0 < 0.0F?-var0:var0;
      float var4 = var1 < 0.0F?-var1:var1;
      float var5 = var2 < 0.0F?-var2:var2;
      return var4 > var3 && var4 > var5?(var1 > 0.0F?0:1):(var5 > var3 && var5 > var4?(var2 > 0.0F?2:3):(var0 > 0.0F?4:5));
   }

   static void method1944(int var0, int var1, int var2, int var3, int var4, int var5, int var6, float[] var7, int var8, float var9, float var10, float var11, float[] var12) {
      var0 -= var3;
      var1 -= var4;
      var2 -= var5;
      float var13 = (float)var0 * var7[0] + (float)var1 * var7[1] + (float)var2 * var7[2];
      float var14 = (float)var0 * var7[3] + (float)var1 * var7[4] + (float)var2 * var7[5];
      float var15 = (float)var0 * var7[6] + (float)var1 * var7[7] + (float)var2 * var7[8];
      float var16;
      float var17;
      if(var6 == 0) {
         var16 = var13 + var9 + 0.5F;
         var17 = -var15 + var11 + 0.5F;
      } else if(var6 == 1) {
         var16 = var13 + var9 + 0.5F;
         var17 = var15 + var11 + 0.5F;
      } else if(var6 == 2) {
         var16 = -var13 + var9 + 0.5F;
         var17 = -var14 + var10 + 0.5F;
      } else if(var6 == 3) {
         var16 = var13 + var9 + 0.5F;
         var17 = -var14 + var10 + 0.5F;
      } else if(var6 == 4) {
         var16 = var15 + var11 + 0.5F;
         var17 = -var14 + var10 + 0.5F;
      } else {
         var16 = -var15 + var11 + 0.5F;
         var17 = -var14 + var10 + 0.5F;
      }

      float var18;
      if(var8 == 1) {
         var18 = var16;
         var16 = -var17;
         var17 = var18;
      } else if(var8 == 2) {
         var16 = -var16;
         var17 = -var17;
      } else if(var8 == 3) {
         var18 = var16;
         var16 = var17;
         var17 = -var18;
      }

      var12[0] = var16;
      var12[1] = var17;
   }

   Class180 method1945(Class170 var1, int[] var2, int var3) {
      int[] var4 = null;
      int[] var5 = null;
      int[] var6 = null;
      float[][] var7 = (float[][])null;
      if(var1.aShortArray1943 != null) {
         int var8 = var1.anInt1947;
         int[] var9 = new int[var8];
         int[] var10 = new int[var8];
         int[] var11 = new int[var8];
         int[] var12 = new int[var8];
         int[] var13 = new int[var8];
         int[] var14 = new int[var8];

         int var15;
         for(var15 = 0; var15 < var8; ++var15) {
            var9[var15] = Integer.MAX_VALUE;
            var10[var15] = -2147483647;
            var11[var15] = Integer.MAX_VALUE;
            var12[var15] = -2147483647;
            var13[var15] = Integer.MAX_VALUE;
            var14[var15] = -2147483647;
         }

         int var20;
         for(var15 = 0; var15 < var3; ++var15) {
            int var16 = var2[var15];
            short var17 = var1.aShortArray1943[var16];
            if(var17 > -1 && var17 < 32766) {
               for(int var18 = 0; var18 < 3; ++var18) {
                  short var19;
                  if(var18 == 0) {
                     var19 = var1.aShortArray1930[var16];
                  } else if(var18 == 1) {
                     var19 = var1.aShortArray1931[var16];
                  } else {
                     var19 = var1.aShortArray1932[var16];
                  }

                  var20 = var1.anIntArray1920[var19];
                  int var21 = var1.anIntArray1921[var19];
                  int var22 = var1.anIntArray1939[var19];
                  if(var20 < var9[var17]) {
                     var9[var17] = var20;
                  }

                  if(var20 > var10[var17]) {
                     var10[var17] = var20;
                  }

                  if(var21 < var11[var17]) {
                     var11[var17] = var21;
                  }

                  if(var21 > var12[var17]) {
                     var12[var17] = var21;
                  }

                  if(var22 < var13[var17]) {
                     var13[var17] = var22;
                  }

                  if(var22 > var14[var17]) {
                     var14[var17] = var22;
                  }
               }
            }
         }

         var4 = new int[var8];
         var5 = new int[var8];
         var6 = new int[var8];
         var7 = new float[var8][];

         for(var15 = 0; var15 < var8; ++var15) {
            byte var23 = var1.aByteArray1948[var15];
            if(var23 > 0) {
               var4[var15] = (var9[var15] + var10[var15]) / 2;
               var5[var15] = (var11[var15] + var12[var15]) / 2;
               var6[var15] = (var13[var15] + var14[var15]) / 2;
               float var24;
               float var25;
               float var26;
               if(var23 == 1) {
                  var20 = var1.anIntArray1945[var15];
                  if(var20 == 0) {
                     var24 = 1.0F;
                     var26 = 1.0F;
                  } else if(var20 > 0) {
                     var24 = 1.0F;
                     var26 = (float)var20 / 1024.0F;
                  } else {
                     var26 = 1.0F;
                     var24 = (float)(-var20) / 1024.0F;
                  }

                  var25 = 64.0F / (float)var1.anIntArray1935[var15];
               } else if(var23 == 2) {
                  var24 = 64.0F / (float)var1.anIntArray1945[var15];
                  var25 = 64.0F / (float)var1.anIntArray1935[var15];
                  var26 = 64.0F / (float)var1.anIntArray1954[var15];
               } else {
                  var24 = (float)var1.anIntArray1945[var15] / 1024.0F;
                  var25 = (float)var1.anIntArray1935[var15] / 1024.0F;
                  var26 = (float)var1.anIntArray1954[var15] / 1024.0F;
               }

               var7[var15] = method1946(var1.aShortArray1944[var15], var1.aShortArray1927[var15], var1.aShortArray1953[var15], var1.aByteArray1958[var15] & 255, var24, var25, var26);
            }
         }
      }

      return new Class180(this, var4, var5, var6, var7);
   }

   static float[] method1946(int var0, int var1, int var2, int var3, float var4, float var5, float var6) {
      float[] var7 = new float[9];
      float[] var8 = new float[9];
      float var9 = (float)Math.cos((double)((float)var3 * 0.024543693F));
      float var10 = (float)Math.sin((double)((float)var3 * 0.024543693F));
      float var11 = 1.0F - var9;
      var7[0] = var9;
      var7[1] = 0.0F;
      var7[2] = var10;
      var7[3] = 0.0F;
      var7[4] = 1.0F;
      var7[5] = 0.0F;
      var7[6] = -var10;
      var7[7] = 0.0F;
      var7[8] = var9;
      float[] var12 = new float[9];
      float var13 = 1.0F;
      float var14 = 0.0F;
      var9 = (float)var1 / 32767.0F;
      var10 = -((float)Math.sqrt((double)(1.0F - var9 * var9)));
      var11 = 1.0F - var9;
      float var15 = (float)Math.sqrt((double)(var0 * var0 + var2 * var2));
      if(var15 == 0.0F && var9 == 0.0F) {
         var8 = var7;
      } else {
         if(var15 != 0.0F) {
            var13 = (float)(-var2) / var15;
            var14 = (float)var0 / var15;
         }

         var12[0] = var9 + var13 * var13 * var11;
         var12[1] = var14 * var10;
         var12[2] = var14 * var13 * var11;
         var12[3] = -var14 * var10;
         var12[4] = var9;
         var12[5] = var13 * var10;
         var12[6] = var13 * var14 * var11;
         var12[7] = -var13 * var10;
         var12[8] = var9 + var14 * var14 * var11;
         var8[0] = var7[0] * var12[0] + var7[1] * var12[3] + var7[2] * var12[6];
         var8[1] = var7[0] * var12[1] + var7[1] * var12[4] + var7[2] * var12[7];
         var8[2] = var7[0] * var12[2] + var7[1] * var12[5] + var7[2] * var12[8];
         var8[3] = var7[3] * var12[0] + var7[4] * var12[3] + var7[5] * var12[6];
         var8[4] = var7[3] * var12[1] + var7[4] * var12[4] + var7[5] * var12[7];
         var8[5] = var7[3] * var12[2] + var7[4] * var12[5] + var7[5] * var12[8];
         var8[6] = var7[6] * var12[0] + var7[7] * var12[3] + var7[8] * var12[6];
         var8[7] = var7[6] * var12[1] + var7[7] * var12[4] + var7[8] * var12[7];
         var8[8] = var7[6] * var12[2] + var7[7] * var12[5] + var7[8] * var12[8];
      }

      var8[0] *= var4;
      var8[1] *= var4;
      var8[2] *= var4;
      var8[3] *= var5;
      var8[4] *= var5;
      var8[5] *= var5;
      var8[6] *= var6;
      var8[7] *= var6;
      var8[8] *= var6;
      return var8;
   }

   public abstract Class168 method1947(byte var1, int var2, boolean var3);

   public abstract void method1948(Class445 var1, int var2, boolean var3);

   public abstract int method1949();

   public abstract void method1950();

   public abstract void method1951(int var1);

   public abstract void method1952(int var1);

   public abstract boolean method1953();

   public abstract void method1954(int var1);

   public abstract void method1955(int var1, int var2, int var3);

   public abstract void method1956();

   public abstract void method1957(int var1, int var2, int var3);

   public abstract void method1958(int var1);

   public abstract void method1959(int var1);

   abstract void method1960();

   static void method1961(int var0, int var1, int var2, int var3, int var4, int var5, float[] var6, float var7, int var8, float var9, float[] var10) {
      var0 -= var3;
      var1 -= var4;
      var2 -= var5;
      float var11 = (float)var0 * var6[0] + (float)var1 * var6[1] + (float)var2 * var6[2];
      float var12 = (float)var0 * var6[3] + (float)var1 * var6[4] + (float)var2 * var6[5];
      float var13 = (float)var0 * var6[6] + (float)var1 * var6[7] + (float)var2 * var6[8];
      float var14 = (float)Math.atan2((double)var11, (double)var13) / 6.2831855F + 0.5F;
      if(var7 != 1.0F) {
         var14 *= var7;
      }

      float var15 = var12 + 0.5F + var9;
      float var16;
      if(var8 == 1) {
         var16 = var14;
         var14 = -var15;
         var15 = var16;
      } else if(var8 == 2) {
         var14 = -var14;
         var15 = -var15;
      } else if(var8 == 3) {
         var16 = var14;
         var14 = var15;
         var15 = -var16;
      }

      var10[0] = var14;
      var10[1] = var15;
   }

   public final void method1962(Class526_Sub21_Sub11 var1, int var2, Class526_Sub21_Sub11 var3, int var4, int var5, int var6, int var7, boolean var8) {
      if(var2 != -1) {
         this.method1960();
         if(!this.method2072()) {
            this.method1978();
         } else {
            Class183 var9 = var1.aClass183Array11731[var2];
            Class526_Sub11 var10 = var9.aClass526_Sub11_2102;
            Class183 var11 = null;
            if(var3 != null) {
               var11 = var3.aClass183Array11731[var4];
               if(var11.aClass526_Sub11_2102 != var10) {
                  var11 = null;
               }
            }

            this.method2066(var10, var9, var11, var5, var6, var7, (boolean[])null, false, var8, '\uffff', (int[])null);
            this.method1972();
            this.method1978();
         }
      }
   }

   public final void method1963(Class526_Sub21_Sub11 var1, int var2, Class526_Sub21_Sub11 var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int[] var10) {
      if(var2 != -1) {
         this.method1960();
         if(!this.method2072()) {
            this.method1978();
         } else {
            Class183 var11 = var1.aClass183Array11731[var2];
            Class526_Sub11 var12 = var11.aClass526_Sub11_2102;
            Class183 var13 = null;
            if(var3 != null) {
               var13 = var3.aClass183Array11731[var4];
               if(var13.aClass526_Sub11_2102 != var12) {
                  var13 = null;
               }
            }

            this.method2066(var12, var11, var13, var5, var6, var7, (boolean[])null, false, var9, var8, var10);
            this.method1972();
            this.method1978();
         }
      }
   }

   public final void method1964(Class526_Sub21_Sub11 var1, int var2, Class526_Sub21_Sub11 var3, int var4, int var5, int var6, Class526_Sub21_Sub11 var7, int var8, Class526_Sub21_Sub11 var9, int var10, int var11, int var12, boolean[] var13, boolean var14) {
      if(var2 != -1) {
         if(var13 != null && var8 != -1) {
            this.method1960();
            if(!this.method2072()) {
               this.method1978();
            } else {
               Class183 var15 = var1.aClass183Array11731[var2];
               Class526_Sub11 var16 = var15.aClass526_Sub11_2102;
               Class183 var17 = null;
               if(var3 != null) {
                  var17 = var3.aClass183Array11731[var4];
                  if(var17.aClass526_Sub11_2102 != var16) {
                     var17 = null;
                  }
               }

               this.method2066(var16, var15, var17, var5, var6, 0, var13, false, var14, '\uffff', (int[])null);
               Class183 var18 = var7.aClass183Array11731[var8];
               Class183 var19 = null;
               if(var9 != null) {
                  var19 = var9.aClass183Array11731[var10];
                  if(var19.aClass526_Sub11_2102 != var16) {
                     var19 = null;
                  }
               }

               this.method2000(0, new int[0], 0, 0, 0, 0, var14);
               this.method2066(var18.aClass526_Sub11_2102, var18, var19, var11, var12, 0, var13, true, var14, '\uffff', (int[])null);
               this.method1972();
               this.method1978();
            }
         } else {
            this.method1962(var1, var2, var3, var4, var5, var6, 0, var14);
         }
      }
   }

   public abstract int method1965();

   void method1966(Class148 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      int var12 = -var5 / 2;
      int var13 = -var6 / 2;
      int var14 = var1.method1724(var2 + var12, var4 + var13, (byte)12);
      int var15 = var5 / 2;
      int var16 = -var6 / 2;
      int var17 = var1.method1724(var2 + var15, var4 + var16, (byte)40);
      int var18 = -var5 / 2;
      int var19 = var6 / 2;
      int var20 = var1.method1724(var2 + var18, var4 + var19, (byte)-10);
      int var21 = var5 / 2;
      int var22 = var6 / 2;
      int var23 = var1.method1724(var2 + var21, var4 + var22, (byte)-27);
      int var24 = var14 < var17?var14:var17;
      int var25 = var20 < var23?var20:var23;
      int var26 = var17 < var23?var17:var23;
      int var27 = var14 < var20?var14:var20;
      int var28;
      if(var6 != 0) {
         int var29 = (int)(Math.atan2((double)(var24 - var25), (double)var6) * 2607.5945876176133D) & 16383;
         if(var29 != 0) {
            if(var7 != 0) {
               if(var29 > 8192) {
                  var28 = 16384 - var7;
                  if(var29 < var28) {
                     var29 = var28;
                  }
               } else if(var29 > var7) {
                  var29 = var7;
               }
            }

            this.method2076(var29);
         }
      }

      if(var5 != 0) {
         int var30 = (int)(Math.atan2((double)(var27 - var26), (double)var5) * 2607.5945876176133D) & 16383;
         if(var30 != 0) {
            if(var8 != 0) {
               if(var30 > 8192) {
                  var28 = 16384 - var8;
                  if(var30 < var28) {
                     var30 = var28;
                  }
               } else if(var30 > var8) {
                  var30 = var8;
               }
            }

            this.method1954(var30);
         }
      }

      int var31 = var14 + var23;
      if(var17 + var20 < var31) {
         var31 = var17 + var20;
      }

      var31 = (var31 >> 1) - var3;
      if(var31 != 0) {
         this.method1955(0, var31, 0);
      }

   }

   public abstract void method1967(int var1);

   public abstract void method1968(Class168 var1, int var2, int var3, int var4, boolean var5);

   public abstract void method1969(int var1);

   abstract void method1970(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   abstract void method1971(int var1, int var2, int var3, int var4);

   abstract void method1972();

   public abstract void method1973(int var1);

   public abstract void method1974(Class445 var1, Class164 var2, int var3);

   public abstract boolean method1975(int var1, int var2, Class445 var3, boolean var4, int var5);

   public abstract Class526_Sub21_Sub5 method1976(Class526_Sub21_Sub5 var1);

   public abstract int method1977();

   abstract void method1978();

   public abstract int method1979();

   public abstract int method1980();

   public abstract int method1981();

   public abstract boolean method1982();

   public abstract int method1983();

   public abstract int method1984();

   public abstract int method1985();

   public abstract void method1986();

   public abstract void method1987(int var1);

   public abstract int method1988();

   void method1989(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int[] var9) {
      int var10;
      if(var6 == 1) {
         if(var1 != 0 && var1 != 1) {
            if(var1 == 3) {
               var10 = var3;
               var3 = var5;
               var5 = var10;
            } else if(var1 == 2) {
               var10 = var3;
               var3 = -var5 & 16383;
               var5 = var10 & 16383;
            }
         } else {
            var10 = -var3;
            var3 = var5;
            var5 = var10;
         }
      } else if(var6 == 2) {
         if(var1 != 0 && var1 != 1) {
            if(var1 == 2) {
               var3 = -var3 & 16383;
               var5 = -var5 & 16383;
            }
         } else {
            var3 = -var3;
            var5 = -var5;
         }
      } else if(var6 == 3) {
         if(var1 != 0 && var1 != 1) {
            if(var1 == 3) {
               var10 = var3;
               var3 = var5;
               var5 = var10;
            } else if(var1 == 2) {
               var10 = var3;
               var3 = var5 & 16383;
               var5 = -var10 & 16383;
            }
         } else {
            var10 = var3;
            var3 = -var5;
            var5 = var10;
         }
      }

      if(var8 != '\uffff') {
         this.method1970(var1, var2, var3, var4, var5, var7, var8, var9);
      } else {
         this.method2000(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public final void method1990(Class526_Sub21_Sub11 var1, int var2) {
      if(var2 != -1) {
         this.method1960();
         if(!this.method2072()) {
            this.method1978();
         } else {
            Class183 var3 = var1.aClass183Array11731[var2];
            Class526_Sub11 var4 = var3.aClass526_Sub11_2102;

            for(int var5 = 0; var5 < var3.anInt2103; ++var5) {
               short var6 = var3.aShortArray2104[var5];
               if(var4.aBoolArray10423[var6]) {
                  if(var3.aShortArray2098[var5] != -1) {
                     this.method1971(0, 0, 0, 0);
                  }

                  this.method1971(var4.anIntArray10426[var6], var3.aShortArray2100[var5], var3.aShortArray2106[var5], var3.aShortArray2107[var5]);
               }
            }

            this.method1972();
            this.method1978();
         }
      }
   }

   public abstract int method1991();

   public abstract void method1992(short var1, short var2);

   public abstract int method1993();

   public abstract boolean method1994();

   public abstract void method1995(Class445 var1, int var2, boolean var3);

   public abstract void method1996(Class445 var1);

   public abstract Class182[] method1997();

   public abstract void method1998(int var1);

   public abstract void method1999(Class168 var1, int var2, int var3, int var4, boolean var5);

   abstract void method2000(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

   public abstract void method2001(Class168 var1, int var2, int var3, int var4, boolean var5);

   public abstract Class168 method2002(byte var1, int var2, boolean var3);

   public abstract int method2003();

   public abstract void method2004(int var1);

   public abstract void method2005(int var1);

   public abstract void method2006(int var1);

   public abstract void method2007(int var1);

   public abstract void method2008();

   public abstract void method2009();

   public abstract void method2010(int var1);

   public abstract void method2011(int var1);

   abstract void method2012(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

   public abstract void method2013(int var1);

   public abstract boolean method2014();

   public abstract void method2015(int var1);

   public abstract int method2016();

   public abstract int method2017();

   public abstract void method2018(int var1, int var2, int var3);

   public abstract void method2019(int var1, int var2, int var3);

   public abstract void method2020(int var1, int var2, int var3, int var4);

   public abstract void method2021(int var1);

   public abstract void method2022();

   abstract void method2023();

   public abstract void method2024();

   public abstract void method2025();

   public abstract void method2026();

   public abstract void method2027(int var1, int var2, int var3);

   public abstract void method2028(byte var1, byte[] var2);

   public abstract void method2029(int var1, int var2, int var3);

   public abstract void method2030(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7);

   abstract void method2031();

   abstract void method2032();

   abstract void method2033();

   abstract boolean method2034();

   abstract boolean method2035();

   public abstract void method2036(int var1, int var2, Class148 var3, Class148 var4, int var5, int var6, int var7);

   abstract boolean method2037();

   public abstract int method2038();

   abstract void method2039(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

   public abstract Class182[] method2040();

   public abstract void method2041();

   public abstract int method2042();

   abstract void method2043(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   abstract void method2044(int var1, int var2, int var3, int var4);

   public abstract void method2045(Class445 var1, int var2, boolean var3);

   public abstract void method2046(Class445 var1, int var2, boolean var3);

   public abstract int method2047();

   public abstract void method2048(Class445 var1, Class164 var2, int var3);

   public abstract boolean method2049();

   public abstract void method2050();

   public abstract void method2051(int var1, int var2, int var3);

   public abstract Class526_Sub21_Sub5 method2052(Class526_Sub21_Sub5 var1);

   public abstract void method2053(short var1, short var2);

   public abstract void method2054();

   public abstract void method2055();

   public abstract void method2056();

   public abstract int method2057();

   public abstract int method2058();

   public abstract int method2059();

   public abstract Class526_Sub21_Sub5 method2060(Class526_Sub21_Sub5 var1);

   public abstract int method2061();

   static void method2062(int var0, int var1, int var2, int var3, int var4, int var5, float[] var6, int var7, float var8, float[] var9) {
      var0 -= var3;
      var1 -= var4;
      var2 -= var5;
      float var10 = (float)var0 * var6[0] + (float)var1 * var6[1] + (float)var2 * var6[2];
      float var11 = (float)var0 * var6[3] + (float)var1 * var6[4] + (float)var2 * var6[5];
      float var12 = (float)var0 * var6[6] + (float)var1 * var6[7] + (float)var2 * var6[8];
      float var13 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11 + var12 * var12));
      float var14 = (float)Math.atan2((double)var10, (double)var12) / 6.2831855F + 0.5F;
      float var15 = (float)Math.asin((double)(var11 / var13)) / 3.1415927F + 0.5F + var8;
      float var16;
      if(var7 == 1) {
         var16 = var14;
         var14 = -var15;
         var15 = var16;
      } else if(var7 == 2) {
         var14 = -var14;
         var15 = -var15;
      } else if(var7 == 3) {
         var16 = var14;
         var14 = var15;
         var15 = -var16;
      }

      var9[0] = var14;
      var9[1] = var15;
   }

   public abstract int method2063();

   public abstract Class141[] method2064();

   public abstract int method2065();

   void method2066(Class526_Sub11 var1, Class183 var2, Class183 var3, int var4, int var5, int var6, boolean[] var7, boolean var8, boolean var9, int var10, int[] var11) {
      int var12;
      if(var3 != null && var4 != 0) {
         var12 = 0;
         int var35 = 0;

         for(int var36 = 0; var36 < var1.anInt10429 * 1657806895; ++var36) {
            boolean var15 = false;
            if(var12 < var2.anInt2103 && var2.aShortArray2104[var12] == var36) {
               var15 = true;
            }

            boolean var16 = false;
            if(var35 < var3.anInt2103 && var3.aShortArray2104[var35] == var36) {
               var16 = true;
            }

            if(var15 || var16) {
               if(var7 != null && var7[var36] != var8 && var1.anIntArray10426[var36] != 0) {
                  if(var15) {
                     ++var12;
                  }

                  if(var16) {
                     ++var35;
                  }
               } else {
                  short var17 = 0;
                  int var18 = var1.anIntArray10426[var36];
                  if(var18 == 3 || var18 == 10) {
                     var17 = 128;
                  }

                  short var19;
                  short var20;
                  short var21;
                  short var22;
                  byte var23;
                  if(var15) {
                     var19 = var2.aShortArray2100[var12];
                     var20 = var2.aShortArray2106[var12];
                     var21 = var2.aShortArray2107[var12];
                     var22 = var2.aShortArray2098[var12];
                     var23 = var2.aByteArray2109[var12];
                     ++var12;
                  } else {
                     var19 = var17;
                     var20 = var17;
                     var21 = var17;
                     var22 = -1;
                     var23 = 0;
                  }

                  short var24;
                  short var25;
                  short var26;
                  short var27;
                  byte var28;
                  if(var16) {
                     var24 = var3.aShortArray2100[var35];
                     var25 = var3.aShortArray2106[var35];
                     var26 = var3.aShortArray2107[var35];
                     var27 = var3.aShortArray2098[var35];
                     var28 = var3.aByteArray2109[var35];
                     ++var35;
                  } else {
                     var24 = var17;
                     var25 = var17;
                     var26 = var17;
                     var27 = -1;
                     var28 = 0;
                  }

                  int var29;
                  int var30;
                  int var31;
                  if((var23 & 2) == 0 && (var28 & 1) == 0) {
                     int var32;
                     if(var18 == 2) {
                        var32 = var24 - var19 & 16383;
                        int var33 = var25 - var20 & 16383;
                        int var34 = var26 - var21 & 16383;
                        if(var32 >= 8192) {
                           var32 -= 16384;
                        }

                        if(var33 >= 8192) {
                           var33 -= 16384;
                        }

                        if(var34 >= 8192) {
                           var34 -= 16384;
                        }

                        var29 = var19 + var32 * var4 / var5 & 16383;
                        var30 = var20 + var33 * var4 / var5 & 16383;
                        var31 = var21 + var34 * var4 / var5 & 16383;
                     } else if(var18 == 9) {
                        var32 = var24 - var19 & 16383;
                        if(var32 >= 8192) {
                           var32 -= 16384;
                        }

                        var29 = var19 + var32 * var4 / var5 & 16383;
                        var31 = 0;
                        var30 = 0;
                     } else if(var18 == 7) {
                        var32 = var24 - var19 & 63;
                        if(var32 >= 32) {
                           var32 -= 64;
                        }

                        var29 = var19 + var32 * var4 / var5 & 63;
                        var30 = var20 + (var25 - var20) * var4 / var5;
                        var31 = var21 + (var26 - var21) * var4 / var5;
                     } else {
                        var29 = var19 + (var24 - var19) * var4 / var5;
                        var30 = var20 + (var25 - var20) * var4 / var5;
                        var31 = var21 + (var26 - var21) * var4 / var5;
                     }
                  } else {
                     var29 = var19;
                     var30 = var20;
                     var31 = var21;
                  }

                  if(var22 != -1) {
                     this.method1989(0, var1.anIntArrayArray10431[var22], 0, 0, 0, var6, var9, var10 & var1.anIntArray10422[var22], var11);
                  } else if(var27 != -1) {
                     this.method1989(0, var1.anIntArrayArray10431[var27], 0, 0, 0, var6, var9, var10 & var1.anIntArray10422[var27], var11);
                  }

                  this.method1989(var18, var1.anIntArrayArray10431[var36], var29, var30, var31, var6, var9, var10 & var1.anIntArray10422[var36], var11);
               }
            }
         }

      } else {
         for(var12 = 0; var12 < var2.anInt2103; ++var12) {
            short var13 = var2.aShortArray2104[var12];
            if(var7 == null || var7[var13] == var8 || var1.anIntArray10426[var13] == 0) {
               short var14 = var2.aShortArray2098[var12];
               if(var14 != -1) {
                  this.method1989(0, var1.anIntArrayArray10431[var14], 0, 0, 0, var6, var9, var10 & var1.anIntArray10422[var14], var11);
               }

               this.method1989(var1.anIntArray10426[var13], var1.anIntArrayArray10431[var13], var2.aShortArray2100[var12], var2.aShortArray2106[var12], var2.aShortArray2107[var12], var6, var9, var10 & var1.anIntArray10422[var13], var11);
            }
         }

      }
   }

   abstract void method2067(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

   abstract boolean method2068();

   public abstract void method2069(int var1, int var2, int var3);

   public abstract int method2070();

   public abstract int method2071();

   abstract boolean method2072();

   public abstract void method2073(int var1);

   abstract void method2074();

   public abstract int method2075();

   public abstract void method2076(int var1);

   public abstract int method2077();

   public abstract byte[] method2078();

   public abstract int method2079();

   public abstract void method2080(int var1, int var2, int var3);

   public abstract int method2081();

   public abstract int method2082();

   public abstract int method2083();

   public abstract int method2084();

   public abstract byte[] method2085();

   public abstract void method2086(short var1, short var2);

   public abstract void method2087(short var1, short var2);

   public abstract int method2088();

   public abstract void method2089(byte var1, byte[] var2);

   public abstract Class182[] method2090();

   public abstract void method2091(int var1, int var2, int var3, int var4);

   public abstract void method2092(Class445 var1, Class164 var2, int var3);

   public abstract int method2093();

   public abstract Class141[] method2094();

   public abstract boolean method2095();

   public abstract boolean method2096();

   public abstract boolean method2097();

   public abstract boolean method2098();

   public abstract boolean method2099();

   public abstract boolean method2100();

   public abstract int method2101();

   public abstract boolean method2102();

   abstract boolean method2103();

   public abstract boolean method2104();

   public abstract int method2105();

   public abstract int method2106();

   public abstract int method2107();

   public abstract int method2108();

   public abstract int method2109();

   public abstract void method2110(int var1);

   abstract void method2111();

   public abstract int method2112();

   abstract void method2113();

   public abstract int method2114();

   abstract void method2115();

   public abstract boolean method2116(int var1, int var2, Class445 var3, boolean var4, int var5);

   public abstract int method2117();

   public abstract int method2118();

   abstract void method2119(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   public abstract void method2120(short var1, short var2);

   public abstract void method2121(short var1, short var2);
}
