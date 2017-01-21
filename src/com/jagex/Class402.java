package com.jagex;

import com.jagex.Class535;
import java.util.Random;

public abstract class Class402 {
   static final int anInt4137 = 4096;
   static final int anInt4138 = 4095;
   static final int anInt4145 = 12;
   public static int[] anIntArray4143 = new int[4096];
   short[] aShortArray4136 = new short[512];
   int anInt4141 = 0;
   int anInt4142 = 4;
   int anInt4140 = 4;
   int anInt4144 = 4;
   int anInt4146 = 4;
   short[] aShortArray4139;

   static final int method4842(int var0) {
      int var1 = var0 * (var0 * var0 >> 12) >> 12;
      int var2 = var0 * 6 - '\uf000';
      int var3 = '\ua000' + (var2 * var0 >> 12);
      return var3 * var1 >> 12;
   }

   void method4843(int var1, int var2, int var3) {
      int[] var4 = new int[var1];
      int[] var5 = new int[var2];
      int[] var6 = new int[var3];

      int var7;
      for(var7 = 0; var7 < var1; ++var7) {
         var4[var7] = (var7 << 12) / var1;
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var5[var7] = (var7 << 12) / var2;
      }

      for(var7 = 0; var7 < var3; ++var7) {
         var6[var7] = (var7 << 12) / var3;
      }

      this.method4847();

      for(int var8 = 0; var8 < var3; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            for(int var10 = 0; var10 < var1; ++var10) {
               for(int var11 = 0; var11 < this.anInt4146; ++var11) {
                  var7 = this.aShortArray4139[var11] << 12;
                  int var12 = this.anInt4142 * var7 >> 12;
                  int var13 = this.anInt4140 * var7 >> 12;
                  int var14 = this.anInt4144 * var7 >> 12;
                  int var15 = var4[var10] * var7 >> 12;
                  int var16 = var5[var9] * var7 >> 12;
                  int var17 = var6[var8] * var7 >> 12;
                  var15 *= this.anInt4142;
                  var16 *= this.anInt4140;
                  var17 *= this.anInt4144;
                  int var18 = var15 >> 12;
                  int var19 = var18 + 1;
                  var18 &= 255;
                  int var20 = var16 >> 12;
                  int var21 = var20 + 1;
                  var20 &= 255;
                  int var22 = var17 >> 12;
                  int var23 = var22 + 1;
                  var22 &= 255;
                  if(var19 >= var12) {
                     var19 = 0;
                  } else {
                     var19 &= 255;
                  }

                  if(var21 >= var13) {
                     var21 = 0;
                  } else {
                     var21 &= 255;
                  }

                  if(var23 >= var14) {
                     var23 = 0;
                  } else {
                     var23 &= 255;
                  }

                  var15 &= 4095;
                  var16 &= 4095;
                  var17 &= 4095;
                  int var24 = anIntArray4143[var15];
                  int var25 = anIntArray4143[var16];
                  int var26 = anIntArray4143[var17];
                  int var27 = var15 - 4096;
                  int var28 = var16 - 4096;
                  int var29 = var17 - 4096;
                  short var30 = this.aShortArray4136[var22];
                  short var31 = this.aShortArray4136[var23];
                  short var32 = this.aShortArray4136[var20 + var30];
                  short var33 = this.aShortArray4136[var21 + var30];
                  short var34 = this.aShortArray4136[var20 + var31];
                  short var35 = this.aShortArray4136[var21 + var31];
                  int var36 = method4848(this.aShortArray4136[var18 + var32], var15, var16, var17);
                  int var37 = method4848(this.aShortArray4136[var19 + var32], var27, var16, var17);
                  int var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var33], var15, var28, var17);
                  var37 = method4848(this.aShortArray4136[var19 + var33], var27, var28, var17);
                  int var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var40 = var38 + (var25 * (var39 - var38) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var34], var15, var16, var29);
                  var37 = method4848(this.aShortArray4136[var19 + var34], var27, var16, var29);
                  var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var35], var15, var28, var29);
                  var37 = method4848(this.aShortArray4136[var19 + var35], var27, var28, var29);
                  var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var41 = var38 + (var25 * (var39 - var38) >> 12);
                  this.method4846(var11, var40 + (var26 * (var41 - var40) >> 12));
               }

               this.method4845();
            }
         }
      }

   }

   void method4844(int var1, int var2, int var3) {
      int[] var4 = new int[var1];
      int[] var5 = new int[var2];
      int[] var6 = new int[var3];

      int var7;
      for(var7 = 0; var7 < var1; ++var7) {
         var4[var7] = (var7 << 12) / var1;
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var5[var7] = (var7 << 12) / var2;
      }

      for(var7 = 0; var7 < var3; ++var7) {
         var6[var7] = (var7 << 12) / var3;
      }

      this.method4847();

      for(int var8 = 0; var8 < var3; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            for(int var10 = 0; var10 < var1; ++var10) {
               for(int var11 = 0; var11 < this.anInt4146; ++var11) {
                  var7 = this.aShortArray4139[var11] << 12;
                  int var12 = this.anInt4142 * var7 >> 12;
                  int var13 = this.anInt4140 * var7 >> 12;
                  int var14 = this.anInt4144 * var7 >> 12;
                  int var15 = var4[var10] * var7 >> 12;
                  int var16 = var5[var9] * var7 >> 12;
                  int var17 = var6[var8] * var7 >> 12;
                  var15 *= this.anInt4142;
                  var16 *= this.anInt4140;
                  var17 *= this.anInt4144;
                  int var18 = var15 >> 12;
                  int var19 = var18 + 1;
                  var18 &= 255;
                  int var20 = var16 >> 12;
                  int var21 = var20 + 1;
                  var20 &= 255;
                  int var22 = var17 >> 12;
                  int var23 = var22 + 1;
                  var22 &= 255;
                  if(var19 >= var12) {
                     var19 = 0;
                  } else {
                     var19 &= 255;
                  }

                  if(var21 >= var13) {
                     var21 = 0;
                  } else {
                     var21 &= 255;
                  }

                  if(var23 >= var14) {
                     var23 = 0;
                  } else {
                     var23 &= 255;
                  }

                  var15 &= 4095;
                  var16 &= 4095;
                  var17 &= 4095;
                  int var24 = anIntArray4143[var15];
                  int var25 = anIntArray4143[var16];
                  int var26 = anIntArray4143[var17];
                  int var27 = var15 - 4096;
                  int var28 = var16 - 4096;
                  int var29 = var17 - 4096;
                  short var30 = this.aShortArray4136[var22];
                  short var31 = this.aShortArray4136[var23];
                  short var32 = this.aShortArray4136[var20 + var30];
                  short var33 = this.aShortArray4136[var21 + var30];
                  short var34 = this.aShortArray4136[var20 + var31];
                  short var35 = this.aShortArray4136[var21 + var31];
                  int var36 = method4848(this.aShortArray4136[var18 + var32], var15, var16, var17);
                  int var37 = method4848(this.aShortArray4136[var19 + var32], var27, var16, var17);
                  int var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var33], var15, var28, var17);
                  var37 = method4848(this.aShortArray4136[var19 + var33], var27, var28, var17);
                  int var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var40 = var38 + (var25 * (var39 - var38) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var34], var15, var16, var29);
                  var37 = method4848(this.aShortArray4136[var19 + var34], var27, var16, var29);
                  var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var35], var15, var28, var29);
                  var37 = method4848(this.aShortArray4136[var19 + var35], var27, var28, var29);
                  var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var41 = var38 + (var25 * (var39 - var38) >> 12);
                  this.method4846(var11, var40 + (var26 * (var41 - var40) >> 12));
               }

               this.method4845();
            }
         }
      }

   }

   abstract void method4845();

   abstract void method4846(int var1, int var2);

   abstract void method4847();

   static int method4848(int var0, int var1, int var2, int var3) {
      int var4 = var0 & 15;
      int var5 = var4 < 8?var1:var2;
      int var6 = var4 < 4?var2:(var4 != 12 && var4 != 14?var3:var1);
      return ((var4 & 1) == 0?var5:-var5) + ((var4 & 2) == 0?var6:-var6);
   }

   void method4849() {
      Random var1 = new Random((long)this.anInt4141);

      int var2;
      for(var2 = 0; var2 < 255; ++var2) {
         this.aShortArray4136[var2] = (short)var2;
      }

      for(var2 = 0; var2 < 255; ++var2) {
         int var3 = 255 - var2;
         int var4 = Class535.method6402(var1, var3, (short)18341);
         short var5 = this.aShortArray4136[var4];
         this.aShortArray4136[var4] = this.aShortArray4136[var3];
         this.aShortArray4136[var3] = this.aShortArray4136[var3 + 256] = var5;
      }

   }

   abstract void method4850(int var1, int var2);

   static {
      for(int var0 = 0; var0 < 4096; ++var0) {
         anIntArray4143[var0] = method4842(var0);
      }

   }

   abstract void method4851();

   static final int method4852(int var0) {
      int var1 = var0 * (var0 * var0 >> 12) >> 12;
      int var2 = var0 * 6 - '\uf000';
      int var3 = '\ua000' + (var2 * var0 >> 12);
      return var3 * var1 >> 12;
   }

   abstract void method4853();

   Class402(int var1, int var2, int var3, int var4, int var5) {
      this.anInt4141 = var1;
      this.anInt4142 = var3;
      this.anInt4140 = var4;
      this.anInt4144 = var5;
      this.anInt4146 = var2;
      this.method4857();
      this.method4849();
   }

   abstract void method4854();

   abstract void method4855();

   static final int method4856(int var0) {
      int var1 = var0 * (var0 * var0 >> 12) >> 12;
      int var2 = var0 * 6 - '\uf000';
      int var3 = '\ua000' + (var2 * var0 >> 12);
      return var3 * var1 >> 12;
   }

   void method4857() {
      this.aShortArray4139 = new short[this.anInt4146];

      for(int var1 = 0; var1 < this.anInt4146; ++var1) {
         this.aShortArray4139[var1] = (short)((int)Math.pow(2.0D, (double)var1));
      }

   }

   void method4858() {
      this.aShortArray4139 = new short[this.anInt4146];

      for(int var1 = 0; var1 < this.anInt4146; ++var1) {
         this.aShortArray4139[var1] = (short)((int)Math.pow(2.0D, (double)var1));
      }

   }

   void method4859() {
      Random var1 = new Random((long)this.anInt4141);

      int var2;
      for(var2 = 0; var2 < 255; ++var2) {
         this.aShortArray4136[var2] = (short)var2;
      }

      for(var2 = 0; var2 < 255; ++var2) {
         int var3 = 255 - var2;
         int var4 = Class535.method6402(var1, var3, (short)30138);
         short var5 = this.aShortArray4136[var4];
         this.aShortArray4136[var4] = this.aShortArray4136[var3];
         this.aShortArray4136[var3] = this.aShortArray4136[var3 + 256] = var5;
      }

   }

   void method4860(int var1, int var2, int var3) {
      int[] var4 = new int[var1];
      int[] var5 = new int[var2];
      int[] var6 = new int[var3];

      int var7;
      for(var7 = 0; var7 < var1; ++var7) {
         var4[var7] = (var7 << 12) / var1;
      }

      for(var7 = 0; var7 < var2; ++var7) {
         var5[var7] = (var7 << 12) / var2;
      }

      for(var7 = 0; var7 < var3; ++var7) {
         var6[var7] = (var7 << 12) / var3;
      }

      this.method4847();

      for(int var8 = 0; var8 < var3; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            for(int var10 = 0; var10 < var1; ++var10) {
               for(int var11 = 0; var11 < this.anInt4146; ++var11) {
                  var7 = this.aShortArray4139[var11] << 12;
                  int var12 = this.anInt4142 * var7 >> 12;
                  int var13 = this.anInt4140 * var7 >> 12;
                  int var14 = this.anInt4144 * var7 >> 12;
                  int var15 = var4[var10] * var7 >> 12;
                  int var16 = var5[var9] * var7 >> 12;
                  int var17 = var6[var8] * var7 >> 12;
                  var15 *= this.anInt4142;
                  var16 *= this.anInt4140;
                  var17 *= this.anInt4144;
                  int var18 = var15 >> 12;
                  int var19 = var18 + 1;
                  var18 &= 255;
                  int var20 = var16 >> 12;
                  int var21 = var20 + 1;
                  var20 &= 255;
                  int var22 = var17 >> 12;
                  int var23 = var22 + 1;
                  var22 &= 255;
                  if(var19 >= var12) {
                     var19 = 0;
                  } else {
                     var19 &= 255;
                  }

                  if(var21 >= var13) {
                     var21 = 0;
                  } else {
                     var21 &= 255;
                  }

                  if(var23 >= var14) {
                     var23 = 0;
                  } else {
                     var23 &= 255;
                  }

                  var15 &= 4095;
                  var16 &= 4095;
                  var17 &= 4095;
                  int var24 = anIntArray4143[var15];
                  int var25 = anIntArray4143[var16];
                  int var26 = anIntArray4143[var17];
                  int var27 = var15 - 4096;
                  int var28 = var16 - 4096;
                  int var29 = var17 - 4096;
                  short var30 = this.aShortArray4136[var22];
                  short var31 = this.aShortArray4136[var23];
                  short var32 = this.aShortArray4136[var20 + var30];
                  short var33 = this.aShortArray4136[var21 + var30];
                  short var34 = this.aShortArray4136[var20 + var31];
                  short var35 = this.aShortArray4136[var21 + var31];
                  int var36 = method4848(this.aShortArray4136[var18 + var32], var15, var16, var17);
                  int var37 = method4848(this.aShortArray4136[var19 + var32], var27, var16, var17);
                  int var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var33], var15, var28, var17);
                  var37 = method4848(this.aShortArray4136[var19 + var33], var27, var28, var17);
                  int var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var40 = var38 + (var25 * (var39 - var38) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var34], var15, var16, var29);
                  var37 = method4848(this.aShortArray4136[var19 + var34], var27, var16, var29);
                  var38 = var36 + (var24 * (var37 - var36) >> 12);
                  var36 = method4848(this.aShortArray4136[var18 + var35], var15, var28, var29);
                  var37 = method4848(this.aShortArray4136[var19 + var35], var27, var28, var29);
                  var39 = var36 + (var24 * (var37 - var36) >> 12);
                  int var41 = var38 + (var25 * (var39 - var38) >> 12);
                  this.method4846(var11, var40 + (var26 * (var41 - var40) >> 12));
               }

               this.method4845();
            }
         }
      }

   }

   void method4861() {
      Random var1 = new Random((long)this.anInt4141);

      int var2;
      for(var2 = 0; var2 < 255; ++var2) {
         this.aShortArray4136[var2] = (short)var2;
      }

      for(var2 = 0; var2 < 255; ++var2) {
         int var3 = 255 - var2;
         int var4 = Class535.method6402(var1, var3, (short)11729);
         short var5 = this.aShortArray4136[var4];
         this.aShortArray4136[var4] = this.aShortArray4136[var3];
         this.aShortArray4136[var3] = this.aShortArray4136[var3 + 256] = var5;
      }

   }

   static final int method4862(int var0) {
      int var1 = var0 * (var0 * var0 >> 12) >> 12;
      int var2 = var0 * 6 - '\uf000';
      int var3 = '\ua000' + (var2 * var0 >> 12);
      return var3 * var1 >> 12;
   }

   abstract void method4863(int var1, int var2);

   abstract void method4864();

   static final int method4865(int var0) {
      int var1 = var0 * (var0 * var0 >> 12) >> 12;
      int var2 = var0 * 6 - '\uf000';
      int var3 = '\ua000' + (var2 * var0 >> 12);
      return var3 * var1 >> 12;
   }

   static final int method4866(int var0) {
      int var1 = var0 * (var0 * var0 >> 12) >> 12;
      int var2 = var0 * 6 - '\uf000';
      int var3 = '\ua000' + (var2 * var0 >> 12);
      return var3 * var1 >> 12;
   }
}
