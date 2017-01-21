package com.jagex;

import com.jagex.Class174;
import com.jagex.Class545;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class552;
import com.jagex.Class558;
import com.jagex.Class639_Sub1_Sub1;

public class Class562 {
   static final float aFloat7561 = 3.0F;
   static final int anInt7562 = 102;
   static final int anInt7563 = 10;
   int[] anIntArray7571;
   int[] anIntArray7577;
   int[] anIntArray7578;
   int[] anIntArray7580;
   int[] anIntArray7581;
   int anInt7573;
   public boolean aBool7586 = true;
   boolean aBool7559 = true;
   boolean aBool7565 = false;
   int anInt7558 = 0;
   float[] aFloatArray7584 = new float[3];
   int[] anIntArray7585 = new int[2];
   int anInt7566 = -1;
   int anInt7587 = -1;
   boolean aBool7588 = true;
   int anInt7579;
   int anInt7567;
   Class549 aClass549_7560;
   Class545[] aClass545Array7570;
   int anInt7569;
   Class545[] aClass545Array7572;
   int anInt7582;
   Class545[] aClass545Array7574;
   Class545[] aClass545Array7576;
   int[][][] anIntArrayArrayArray7568;
   Class558 aClass558_7564;
   static Class174 aClass174_7583;
   int[] anIntArray7575;

   public void method6756(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != 8 && var1 != 16) {
         Class552 var13 = this.aClass549_7560.aClass552ArrayArrayArray7287[var2][var3][var4];
         if(var13 == null) {
            this.aClass549_7560.aClass552ArrayArrayArray7287[var2][var3][var4] = var13 = new Class552(var2);
         }

         if(var1 == 1) {
            var13.aShort7358 = (short)var5;
            var13.aShort7356 = (short)var6;
         } else if(var1 == 2) {
            var13.aShort7360 = (short)var5;
            var13.aShort7361 = (short)var6;
         }

         if(this.aBool7565) {
            this.method6759();
         }
      } else {
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if(var1 == 8) {
            var7 = var3 << this.aClass549_7560.anInt7316 * 1705818315;
            var8 = var7 + this.aClass549_7560.anInt7333 * 776633539;
            var9 = var4 << this.aClass549_7560.anInt7316 * 1705818315;
            var10 = var9 + this.aClass549_7560.anInt7333 * 776633539;
            var11 = this.aClass549_7560.aClass148Array7290[var2].method1714(var3, var4, -586447318);
            var12 = this.aClass549_7560.aClass148Array7290[var2].method1714(var3 + 1, var4 + 1, 1873792157);
            this.aClass545Array7574[this.anInt7573++] = new Class545(this.aClass549_7560, var1, var2, var7, var8, var8, var7, var11, var12, var12 - var5, var11 - var5, var9, var10, var10, var9);
         } else {
            var7 = (var3 << this.aClass549_7560.anInt7316 * 1705818315) + this.aClass549_7560.anInt7333 * 776633539;
            var8 = var7 - this.aClass549_7560.anInt7333 * 776633539;
            var9 = var4 << this.aClass549_7560.anInt7316 * 1705818315;
            var10 = var9 + this.aClass549_7560.anInt7333 * 776633539;
            var11 = this.aClass549_7560.aClass148Array7290[var2].method1714(var3 + 1, var4, -1889875246);
            var12 = this.aClass549_7560.aClass148Array7290[var2].method1714(var3, var4 + 1, 437476912);
            this.aClass545Array7574[this.anInt7573++] = new Class545(this.aClass549_7560, var1, var2, var7, var8, var8, var7, var11, var12, var12 - var5, var11 - var5, var9, var10, var10, var9);
         }
      }

   }

   Class562(Class549 var1) {
      this.anInt7579 = var1.anInt7333 * 776633539;
      this.anInt7567 = var1.anInt7333 * 776633539;
      this.aClass549_7560 = var1;
      this.aClass545Array7570 = new Class545[528];
      this.anInt7569 = 0;
      this.aClass545Array7572 = new Class545[2038];
      this.anInt7582 = 0;
      this.aClass545Array7574 = new Class545[1017];
      this.anInt7573 = 0;
      this.aClass545Array7576 = new Class545[1004];
      this.anInt7558 = 0;
      this.anIntArrayArrayArray7568 = new int[this.aClass549_7560.anInt7284 * 1756626709][this.aClass549_7560.anInt7285 * -447634797 + 1][this.aClass549_7560.anInt7286 * 1913648871 + 1];
      this.aBool7565 = false;
      this.aBool7586 = true;
      if(this.aBool7586) {
         this.aClass558_7564 = new Class558(this);
      }

   }

   public void method6757(int var1, int var2, int var3, int var4) {
      if(var1 != 8 && var1 != 16) {
         Class552 var7 = this.aClass549_7560.aClass552ArrayArrayArray7287[var2][var3][var4];
         if(var7 != null) {
            if(var1 == 1) {
               var7.aShort7358 = 0;
            } else if(var1 == 2) {
               var7.aShort7360 = 0;
            }
         }

         this.method6759();
      } else {
         for(int var5 = 0; var5 < this.anInt7573; ++var5) {
            Class545 var6 = this.aClass545Array7574[var5];
            if(var6.aByte7262 == var1 && var6.aByte7255 == var2 && (var6.aShort7249 == var3 && var6.aShort7256 == var4 || var6.aShort7257 == var3 && var6.aShort7259 == var4)) {
               if(var5 != this.anInt7573) {
                  System.arraycopy(this.aClass545Array7574, var5 + 1, this.aClass545Array7574, var5, this.aClass545Array7574.length - (var5 + 1));
               }

               --this.anInt7573;
               return;
            }
         }
      }

   }

   public void method6758() {
      this.method6759();
   }

   void method6759() {
      int var1;
      for(var1 = 0; var1 < this.anInt7582; ++var1) {
         this.aClass545Array7572[var1] = null;
      }

      this.anInt7582 = 0;

      int var2;
      int var3;
      Class552 var4;
      for(var1 = 0; var1 < this.aClass549_7560.anInt7284 * 1756626709; ++var1) {
         for(var2 = 0; var2 < this.aClass549_7560.anInt7285 * -447634797; ++var2) {
            for(var3 = 0; var3 < this.aClass549_7560.anInt7286 * 1913648871; ++var3) {
               var4 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2];
               if(var4 != null) {
                  if(var4.aShort7358 > 0) {
                     var4.aShort7358 = (short)(var4.aShort7358 * -1);
                  }

                  if(var4.aShort7360 > 0) {
                     var4.aShort7360 = (short)(var4.aShort7360 * -1);
                  }
               }
            }
         }
      }

      for(var1 = 0; var1 < this.aClass549_7560.anInt7284 * 1756626709; ++var1) {
         for(var2 = 0; var2 < this.aClass549_7560.anInt7285 * -447634797; ++var2) {
            for(var3 = 0; var3 < this.aClass549_7560.anInt7286 * 1913648871; ++var3) {
               var4 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2];
               if(var4 != null) {
                  boolean var5 = this.aClass549_7560.aClass552ArrayArrayArray7287[0][var3][var2] != null && this.aClass549_7560.aClass552ArrayArrayArray7287[0][var3][var2].aClass552_7359 != null;
                  int var6;
                  int var7;
                  int var9;
                  Class552 var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  int var20;
                  int var21;
                  if(var4.aShort7358 < 0) {
                     var6 = var2;
                     var7 = var2;
                     var9 = var1;
                     var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2 - 1];

                     for(var11 = this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var2, 598605588); var6 > 0 && var10 != null && var10.aShort7358 < 0 && var10.aShort7358 == var4.aShort7358 && var10.aShort7356 == var4.aShort7356 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var6 - 1, -654865748) && (var6 - 1 <= 0 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var6 - 2, 152322892)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var6 - 1]) {
                        --var6;
                     }

                     for(var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var7 + 1]; var7 < this.aClass549_7560.anInt7286 * 1913648871 && var10 != null && var10.aShort7358 < 0 && var10.aShort7358 == var4.aShort7358 && var10.aShort7356 == var4.aShort7356 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var7 + 1, 636114149) && (var7 + 1 >= this.aClass549_7560.anInt7286 * 1913648871 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var7 + 2, 1760490566)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var7 + 1]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var3, var6, -1745837891);
                     var14 = var13 + var4.aShort7358 * var12;
                     var15 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var3, var7 + 1, -2121504574);
                     var16 = var15 + var4.aShort7358 * var12;
                     var17 = var3 << this.aClass549_7560.anInt7316 * 1705818315;
                     var18 = var6 << this.aClass549_7560.anInt7316 * 1705818315;
                     var19 = (var7 << this.aClass549_7560.anInt7316 * 1705818315) + this.aClass549_7560.anInt7333 * 776633539;
                     this.aClass545Array7572[this.anInt7582++] = new Class545(this.aClass549_7560, 1, var1, var17 + var4.aShort7356, var17 + var4.aShort7356, var17 + var4.aShort7356, var17 + var4.aShort7356, var13, var15, var16, var14, var18, var19, var19, var18);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var3][var21].aShort7358 = (short)(this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var3][var21].aShort7358 * -1);
                        }
                     }
                  }

                  if(var4.aShort7360 < 0) {
                     var6 = var3;
                     var7 = var3;
                     var9 = var1;
                     var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3 - 1][var2];

                     for(var11 = this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var2, 1852150585); var6 > 0 && var10 != null && var10.aShort7360 < 0 && var10.aShort7360 == var4.aShort7360 && var10.aShort7361 == var4.aShort7361 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var6 - 1, var2, -1685653494) && (var6 - 1 <= 0 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var6 - 2, var2, -1590303859)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var6 - 1][var2]) {
                        --var6;
                     }

                     for(var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var7 + 1][var2]; var7 < this.aClass549_7560.anInt7285 * -447634797 && var10 != null && var10.aShort7360 < 0 && var10.aShort7360 == var4.aShort7360 && var10.aShort7361 == var4.aShort7361 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var7 + 1, var2, -1455171197) && (var7 + 1 >= this.aClass549_7560.anInt7285 * -447634797 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var7 + 2, var2, 1453665583)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var7 + 1][var2]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var6, var2, 1343647033);
                     var14 = var13 + var4.aShort7360 * var12;
                     var15 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var7 + 1, var2, 2040287976);
                     var16 = var15 + var4.aShort7360 * var12;
                     var17 = var6 << this.aClass549_7560.anInt7316 * 1705818315;
                     var18 = (var7 << this.aClass549_7560.anInt7316 * 1705818315) + this.aClass549_7560.anInt7333 * 776633539;
                     var19 = var2 << this.aClass549_7560.anInt7316 * 1705818315;
                     this.aClass545Array7572[this.anInt7582++] = new Class545(this.aClass549_7560, 2, var1, var17, var18, var18, var17, var13, var15, var16, var14, var19 + var4.aShort7361, var19 + var4.aShort7361, var19 + var4.aShort7361, var19 + var4.aShort7361);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var21][var2].aShort7360 = (short)(this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var21][var2].aShort7360 * -1);
                        }
                     }
                  }
               }
            }
         }
      }

      this.aBool7565 = true;
   }

   public void method6760(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass545Array7570[this.anInt7569++] = new Class545(this.aClass549_7560, var1, var2, var3, var4, var4, var3, var7, var8, var8, var7, var5, var5, var6, var6);
   }

   void method6761(Class174 var1, int var2) {
      aClass174_7583 = var1;
      if(this.aBool7586 && this.aBool7559) {
         if(this.aBool7588) {
            this.aClass549_7560.aClass30_7280.method737(108668866);
         }

         aClass174_7583.method2376(this.anIntArray7585);
         if(this.anInt7566 != (int)((float)this.anIntArray7585[0] / 3.0F) || this.anInt7587 != (int)((float)this.anIntArray7585[1] / 3.0F)) {
            this.anInt7566 = (int)((float)this.anIntArray7585[0] / 3.0F);
            this.anInt7587 = (int)((float)this.anIntArray7585[1] / 3.0F);
            this.anIntArray7575 = new int[this.anInt7566 * this.anInt7587];
         }

         this.anInt7558 = 0;

         int var3;
         for(var3 = 0; var3 < this.anInt7569; ++var3) {
            this.method6768(aClass174_7583, this.aClass545Array7570[var3], var2);
         }

         for(var3 = 0; var3 < this.anInt7582; ++var3) {
            this.method6768(aClass174_7583, this.aClass545Array7572[var3], var2);
         }

         for(var3 = 0; var3 < this.anInt7573; ++var3) {
            this.method6768(aClass174_7583, this.aClass545Array7574[var3], var2);
         }

         this.aClass558_7564.anInt7535 = 0;
         if(this.anInt7558 > 0) {
            var3 = this.anIntArray7575.length;
            int var4 = var3 - var3 & 7;

            int var5;
            for(var5 = 0; var5 < var4; this.anIntArray7575[var5++] = Integer.MAX_VALUE) {
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
            }

            while(var5 < var3) {
               this.anIntArray7575[var5++] = Integer.MAX_VALUE;
            }

            this.aClass558_7564.anInt7530 = 1;

            for(int var6 = 0; var6 < this.anInt7558; ++var6) {
               Class545 var7 = this.aClass545Array7576[var6];
               this.aClass558_7564.method6716(var7.aShortArray7264[0], var7.aShortArray7264[1], var7.aShortArray7264[3], var7.aShortArray7254[0], var7.aShortArray7254[1], var7.aShortArray7254[3], var7.aShortArray7265[0], var7.aShortArray7265[1], var7.aShortArray7265[3]);
               this.aClass558_7564.method6716(var7.aShortArray7264[1], var7.aShortArray7264[2], var7.aShortArray7264[3], var7.aShortArray7254[1], var7.aShortArray7254[2], var7.aShortArray7254[3], var7.aShortArray7265[1], var7.aShortArray7265[2], var7.aShortArray7265[3]);
            }

            this.aClass558_7564.anInt7530 = 2;
         }

         if(this.aBool7588) {
            this.aClass549_7560.aClass30_7280.method737(-1939523679);
         }

      } else {
         this.anInt7558 = 0;
      }
   }

   void method6762() {
      int var1;
      for(var1 = 0; var1 < this.anInt7582; ++var1) {
         this.aClass545Array7572[var1] = null;
      }

      this.anInt7582 = 0;

      int var2;
      int var3;
      Class552 var4;
      for(var1 = 0; var1 < this.aClass549_7560.anInt7284 * 1756626709; ++var1) {
         for(var2 = 0; var2 < this.aClass549_7560.anInt7285 * -447634797; ++var2) {
            for(var3 = 0; var3 < this.aClass549_7560.anInt7286 * 1913648871; ++var3) {
               var4 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2];
               if(var4 != null) {
                  if(var4.aShort7358 > 0) {
                     var4.aShort7358 = (short)(var4.aShort7358 * -1);
                  }

                  if(var4.aShort7360 > 0) {
                     var4.aShort7360 = (short)(var4.aShort7360 * -1);
                  }
               }
            }
         }
      }

      for(var1 = 0; var1 < this.aClass549_7560.anInt7284 * 1756626709; ++var1) {
         for(var2 = 0; var2 < this.aClass549_7560.anInt7285 * -447634797; ++var2) {
            for(var3 = 0; var3 < this.aClass549_7560.anInt7286 * 1913648871; ++var3) {
               var4 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2];
               if(var4 != null) {
                  boolean var5 = this.aClass549_7560.aClass552ArrayArrayArray7287[0][var3][var2] != null && this.aClass549_7560.aClass552ArrayArrayArray7287[0][var3][var2].aClass552_7359 != null;
                  int var6;
                  int var7;
                  int var9;
                  Class552 var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  int var20;
                  int var21;
                  if(var4.aShort7358 < 0) {
                     var6 = var2;
                     var7 = var2;
                     var9 = var1;
                     var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2 - 1];

                     for(var11 = this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var2, 1826686076); var6 > 0 && var10 != null && var10.aShort7358 < 0 && var10.aShort7358 == var4.aShort7358 && var10.aShort7356 == var4.aShort7356 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var6 - 1, -1533298192) && (var6 - 1 <= 0 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var6 - 2, 365649077)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var6 - 1]) {
                        --var6;
                     }

                     for(var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var7 + 1]; var7 < this.aClass549_7560.anInt7286 * 1913648871 && var10 != null && var10.aShort7358 < 0 && var10.aShort7358 == var4.aShort7358 && var10.aShort7356 == var4.aShort7356 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var7 + 1, -1108173589) && (var7 + 1 >= this.aClass549_7560.anInt7286 * 1913648871 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var7 + 2, -2108774110)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var7 + 1]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var3, var6, -1799289208);
                     var14 = var13 + var4.aShort7358 * var12;
                     var15 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var3, var7 + 1, -333782185);
                     var16 = var15 + var4.aShort7358 * var12;
                     var17 = var3 << this.aClass549_7560.anInt7316 * 1705818315;
                     var18 = var6 << this.aClass549_7560.anInt7316 * 1705818315;
                     var19 = (var7 << this.aClass549_7560.anInt7316 * 1705818315) + this.aClass549_7560.anInt7333 * 776633539;
                     this.aClass545Array7572[this.anInt7582++] = new Class545(this.aClass549_7560, 1, var1, var17 + var4.aShort7356, var17 + var4.aShort7356, var17 + var4.aShort7356, var17 + var4.aShort7356, var13, var15, var16, var14, var18, var19, var19, var18);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var3][var21].aShort7358 = (short)(this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var3][var21].aShort7358 * -1);
                        }
                     }
                  }

                  if(var4.aShort7360 < 0) {
                     var6 = var3;
                     var7 = var3;
                     var9 = var1;
                     var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3 - 1][var2];

                     for(var11 = this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var2, 665466665); var6 > 0 && var10 != null && var10.aShort7360 < 0 && var10.aShort7360 == var4.aShort7360 && var10.aShort7361 == var4.aShort7361 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var6 - 1, var2, -2008072762) && (var6 - 1 <= 0 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var6 - 2, var2, -746046930)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var6 - 1][var2]) {
                        --var6;
                     }

                     for(var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var7 + 1][var2]; var7 < this.aClass549_7560.anInt7285 * -447634797 && var10 != null && var10.aShort7360 < 0 && var10.aShort7360 == var4.aShort7360 && var10.aShort7361 == var4.aShort7361 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var7 + 1, var2, 684865607) && (var7 + 1 >= this.aClass549_7560.anInt7285 * -447634797 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var7 + 2, var2, -413534964)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var7 + 1][var2]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var6, var2, 462187947);
                     var14 = var13 + var4.aShort7360 * var12;
                     var15 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var7 + 1, var2, -714533034);
                     var16 = var15 + var4.aShort7360 * var12;
                     var17 = var6 << this.aClass549_7560.anInt7316 * 1705818315;
                     var18 = (var7 << this.aClass549_7560.anInt7316 * 1705818315) + this.aClass549_7560.anInt7333 * 776633539;
                     var19 = var2 << this.aClass549_7560.anInt7316 * 1705818315;
                     this.aClass545Array7572[this.anInt7582++] = new Class545(this.aClass549_7560, 2, var1, var17, var18, var18, var17, var13, var15, var16, var14, var19 + var4.aShort7361, var19 + var4.aShort7361, var19 + var4.aShort7361, var19 + var4.aShort7361);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var21][var2].aShort7360 = (short)(this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var21][var2].aShort7360 * -1);
                        }
                     }
                  }
               }
            }
         }
      }

      this.aBool7565 = true;
   }

   boolean method6763(int var1, int var2, int var3) {
      if(this.aBool7586 && this.aBool7559) {
         if(this.aClass558_7564.anInt7535 < 102) {
            return false;
         } else {
            int var4 = this.anIntArrayArrayArray7568[var1][var2][var3];
            if(var4 == -(this.aClass549_7560.anInt7274 * 1275269387)) {
               return false;
            } else if(var4 == this.aClass549_7560.anInt7274 * 1275269387) {
               return true;
            } else if(this.aClass549_7560.aClass148Array7288 == this.aClass549_7560.aClass148Array7292) {
               return false;
            } else {
               int var5 = var2 << this.aClass549_7560.anInt7316 * 1705818315;
               int var6 = var3 << this.aClass549_7560.anInt7316 * 1705818315;
               if(this.method6769(var5 + 1, this.aClass549_7560.aClass148Array7288[var1].method1714(var2, var3, 71662962), var6 + 1, var5 + this.aClass549_7560.anInt7333 * 776633539 - 1, this.aClass549_7560.aClass148Array7288[var1].method1714(var2 + 1, var3 + 1, 1113653982), var6 + this.aClass549_7560.anInt7333 * 776633539 - 1, var5 + 1, this.aClass549_7560.aClass148Array7288[var1].method1714(var2, var3 + 1, 226036026), var6 + this.aClass549_7560.anInt7333 * 776633539 - 1) && this.method6769(var5 + 1, this.aClass549_7560.aClass148Array7288[var1].method1714(var2, var3, -2021168214), var6 + 1, var5 + this.aClass549_7560.anInt7333 * 776633539 - 1, this.aClass549_7560.aClass148Array7288[var1].method1714(var2 + 1, var3, 1357916156), var6 + 1, var5 + this.aClass549_7560.anInt7333 * 776633539 - 1, this.aClass549_7560.aClass148Array7288[var1].method1714(var2 + 1, var3 + 1, 1592799847), var6 + this.aClass549_7560.anInt7333 * 776633539 - 1)) {
                  this.anIntArrayArrayArray7568[var1][var2][var3] = this.aClass549_7560.anInt7274 * 1275269387;
                  return true;
               } else {
                  this.anIntArrayArrayArray7568[var1][var2][var3] = -(this.aClass549_7560.anInt7274 * 1275269387);
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   boolean method6764(Class639_Sub1_Sub1 var1, int var2, int var3, int var4) {
      if(this.aBool7586 && this.aBool7559) {
         if(this.aClass558_7564.anInt7535 < 102) {
            return false;
         } else if(!this.method6763(var2, var3, var4)) {
            return false;
         } else {
            int var5 = var3 << this.aClass549_7560.anInt7316 * 1705818315;
            int var6 = var4 << this.aClass549_7560.anInt7316 * 1705818315;
            int var7 = this.aClass549_7560.aClass148Array7288[var2].method1714(var3, var4, -884500984) - 1;
            int var8 = var7 + var1.method9832((byte)112);
            return var1.aShort11794 == 1?(!this.method6769(var5, var7, var6, var5, var8, var6, var5, var8, var6 + this.aClass549_7560.anInt7333 * 776633539)?false:this.method6769(var5, var7, var6, var5, var8, var6 + this.aClass549_7560.anInt7333 * 776633539, var5, var7, var6 + this.aClass549_7560.anInt7333 * 776633539)):(var1.aShort11794 == 2?(!this.method6769(var5, var7, var6 + this.aClass549_7560.anInt7333 * 776633539, var5 + this.aClass549_7560.anInt7333 * 776633539, var8, var6 + this.aClass549_7560.anInt7333 * 776633539, var5, var8, var6 + this.aClass549_7560.anInt7333 * 776633539)?false:this.method6769(var5, var7, var6 + this.aClass549_7560.anInt7333 * 776633539, var5 + this.aClass549_7560.anInt7333 * 776633539, var7, var6 + this.aClass549_7560.anInt7333 * 776633539, var5 + this.aClass549_7560.anInt7333 * 776633539, var8, var6 + this.aClass549_7560.anInt7333 * 776633539)):(var1.aShort11794 == 4?(!this.method6769(var5 + this.aClass549_7560.anInt7333 * 776633539, var7, var6, var5 + this.aClass549_7560.anInt7333 * 776633539, var8, var6, var5 + this.aClass549_7560.anInt7333 * 776633539, var8, var6 + this.aClass549_7560.anInt7333 * 776633539)?false:this.method6769(var5 + this.aClass549_7560.anInt7333 * 776633539, var7, var6, var5 + this.aClass549_7560.anInt7333 * 776633539, var8, var6 + this.aClass549_7560.anInt7333 * 776633539, var5 + this.aClass549_7560.anInt7333 * 776633539, var7, var6 + this.aClass549_7560.anInt7333 * 776633539)):(var1.aShort11794 == 8?(!this.method6769(var5, var7, var6, var5 + this.aClass549_7560.anInt7333 * 776633539, var8, var6, var5, var8, var6)?false:this.method6769(var5, var7, var6, var5 + this.aClass549_7560.anInt7333 * 776633539, var7, var6, var5 + this.aClass549_7560.anInt7333 * 776633539, var8, var6)):(var1.aShort11794 == 16?this.method6772(var5, var7, var6 + this.aClass549_7560.anInt7320 * 374552189, this.aClass549_7560.anInt7320 * 374552189, var8, this.aClass549_7560.anInt7320 * 374552189):(var1.aShort11794 == 32?this.method6772(var5 + this.aClass549_7560.anInt7320 * 374552189, var7, var6 + this.aClass549_7560.anInt7320 * 374552189, this.aClass549_7560.anInt7320 * 374552189, var8, this.aClass549_7560.anInt7320 * 374552189):(var1.aShort11794 == 64?this.method6772(var5 + this.aClass549_7560.anInt7320 * 374552189, var7, var6, this.aClass549_7560.anInt7320 * 374552189, var8, this.aClass549_7560.anInt7320 * 374552189):(var1.aShort11794 == 128?this.method6772(var5, var7, var6, this.aClass549_7560.anInt7320 * 374552189, var8, this.aClass549_7560.anInt7320 * 374552189):true)))))));
         }
      } else {
         return false;
      }
   }

   boolean method6765(int var1, int var2, int var3, int var4, int var5, Class550 var6) {
      if(this.aBool7586 && this.aBool7559) {
         if(this.aClass558_7564.anInt7535 < 102) {
            return false;
         } else if(var2 >= 0 && var4 >= 0 && var3 < this.anIntArrayArrayArray7568[var1].length && var5 < this.anIntArrayArrayArray7568[var1][var2].length) {
            if(var2 == var3 && var4 == var5) {
               return !this.method6763(var1, var2, var4)?false:this.method6766(var6);
            } else {
               for(int var7 = var2; var7 <= var3; ++var7) {
                  for(int var8 = var4; var8 <= var5; ++var8) {
                     if(this.anIntArrayArrayArray7568[var1][var7][var8] == -(this.aClass549_7560.anInt7274 * 1275269387)) {
                        return false;
                     }
                  }
               }

               if(!this.method6766(var6)) {
                  return false;
               } else {
                  return true;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   final boolean method6766(Class550 var1) {
      return var1 == null?false:this.method6772(var1.anInt7343, var1.anInt7342, var1.anInt7339, var1.anInt7344 - var1.anInt7343, var1.anInt7346 - var1.anInt7342, var1.anInt7345 - var1.anInt7339);
   }

   void method6767() {
      int var1;
      for(var1 = 0; var1 < this.anInt7582; ++var1) {
         this.aClass545Array7572[var1] = null;
      }

      this.anInt7582 = 0;

      int var2;
      int var3;
      Class552 var4;
      for(var1 = 0; var1 < this.aClass549_7560.anInt7284 * 1756626709; ++var1) {
         for(var2 = 0; var2 < this.aClass549_7560.anInt7285 * -447634797; ++var2) {
            for(var3 = 0; var3 < this.aClass549_7560.anInt7286 * 1913648871; ++var3) {
               var4 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2];
               if(var4 != null) {
                  if(var4.aShort7358 > 0) {
                     var4.aShort7358 = (short)(var4.aShort7358 * -1);
                  }

                  if(var4.aShort7360 > 0) {
                     var4.aShort7360 = (short)(var4.aShort7360 * -1);
                  }
               }
            }
         }
      }

      for(var1 = 0; var1 < this.aClass549_7560.anInt7284 * 1756626709; ++var1) {
         for(var2 = 0; var2 < this.aClass549_7560.anInt7285 * -447634797; ++var2) {
            for(var3 = 0; var3 < this.aClass549_7560.anInt7286 * 1913648871; ++var3) {
               var4 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2];
               if(var4 != null) {
                  boolean var5 = this.aClass549_7560.aClass552ArrayArrayArray7287[0][var3][var2] != null && this.aClass549_7560.aClass552ArrayArrayArray7287[0][var3][var2].aClass552_7359 != null;
                  int var6;
                  int var7;
                  int var9;
                  Class552 var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  int var20;
                  int var21;
                  if(var4.aShort7358 < 0) {
                     var6 = var2;
                     var7 = var2;
                     var9 = var1;
                     var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var2 - 1];

                     for(var11 = this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var2, 341355085); var6 > 0 && var10 != null && var10.aShort7358 < 0 && var10.aShort7358 == var4.aShort7358 && var10.aShort7356 == var4.aShort7356 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var6 - 1, 1034222546) && (var6 - 1 <= 0 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var6 - 2, -1626023008)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var6 - 1]) {
                        --var6;
                     }

                     for(var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var7 + 1]; var7 < this.aClass549_7560.anInt7286 * 1913648871 && var10 != null && var10.aShort7358 < 0 && var10.aShort7358 == var4.aShort7358 && var10.aShort7356 == var4.aShort7356 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var7 + 1, 1978698373) && (var7 + 1 >= this.aClass549_7560.anInt7286 * 1913648871 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var7 + 2, 409495744)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3][var7 + 1]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var3, var6, -923653177);
                     var14 = var13 + var4.aShort7358 * var12;
                     var15 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var3, var7 + 1, -158497787);
                     var16 = var15 + var4.aShort7358 * var12;
                     var17 = var3 << this.aClass549_7560.anInt7316 * 1705818315;
                     var18 = var6 << this.aClass549_7560.anInt7316 * 1705818315;
                     var19 = (var7 << this.aClass549_7560.anInt7316 * 1705818315) + this.aClass549_7560.anInt7333 * 776633539;
                     this.aClass545Array7572[this.anInt7582++] = new Class545(this.aClass549_7560, 1, var1, var17 + var4.aShort7356, var17 + var4.aShort7356, var17 + var4.aShort7356, var17 + var4.aShort7356, var13, var15, var16, var14, var18, var19, var19, var18);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var3][var21].aShort7358 = (short)(this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var3][var21].aShort7358 * -1);
                        }
                     }
                  }

                  if(var4.aShort7360 < 0) {
                     var6 = var3;
                     var7 = var3;
                     var9 = var1;
                     var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var3 - 1][var2];

                     for(var11 = this.aClass549_7560.aClass148Array7290[var1].method1714(var3, var2, 64347215); var6 > 0 && var10 != null && var10.aShort7360 < 0 && var10.aShort7360 == var4.aShort7360 && var10.aShort7361 == var4.aShort7361 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var6 - 1, var2, 1219757452) && (var6 - 1 <= 0 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var6 - 2, var2, -933072313)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var6 - 1][var2]) {
                        --var6;
                     }

                     for(var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var7 + 1][var2]; var7 < this.aClass549_7560.anInt7285 * -447634797 && var10 != null && var10.aShort7360 < 0 && var10.aShort7360 == var4.aShort7360 && var10.aShort7361 == var4.aShort7361 && var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var7 + 1, var2, 1550671564) && (var7 + 1 >= this.aClass549_7560.anInt7285 * -447634797 || var11 == this.aClass549_7560.aClass148Array7290[var1].method1714(var7 + 2, var2, 868492120)) && var7 - var6 <= 10; var10 = this.aClass549_7560.aClass552ArrayArrayArray7287[var1][var7 + 1][var2]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var6, var2, -1778763994);
                     var14 = var13 + var4.aShort7360 * var12;
                     var15 = this.aClass549_7560.aClass148Array7290[var5?var1 + 1:var1].method1714(var7 + 1, var2, -1803592769);
                     var16 = var15 + var4.aShort7360 * var12;
                     var17 = var6 << this.aClass549_7560.anInt7316 * 1705818315;
                     var18 = (var7 << this.aClass549_7560.anInt7316 * 1705818315) + this.aClass549_7560.anInt7333 * 776633539;
                     var19 = var2 << this.aClass549_7560.anInt7316 * 1705818315;
                     this.aClass545Array7572[this.anInt7582++] = new Class545(this.aClass549_7560, 2, var1, var17, var18, var18, var17, var13, var15, var16, var14, var19 + var4.aShort7361, var19 + var4.aShort7361, var19 + var4.aShort7361, var19 + var4.aShort7361);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var21][var2].aShort7360 = (short)(this.aClass549_7560.aClass552ArrayArrayArray7287[var20][var21][var2].aShort7360 * -1);
                        }
                     }
                  }
               }
            }
         }
      }

      this.aBool7565 = true;
   }

   void method6768(Class174 var1, Class545 var2, int var3) {
      aClass174_7583 = var1;
      int var4;
      if(this.anIntArray7571 != null && var2.aByte7255 >= var3) {
         for(var4 = 0; var4 < this.anIntArray7571.length; ++var4) {
            if(this.anIntArray7571[var4] != -1000000 && (var2.anIntArray7261[0] <= this.anIntArray7571[var4] || var2.anIntArray7261[1] <= this.anIntArray7571[var4] || var2.anIntArray7261[2] <= this.anIntArray7571[var4] || var2.anIntArray7261[3] <= this.anIntArray7571[var4]) && (var2.anIntArray7260[0] <= this.anIntArray7577[var4] || var2.anIntArray7260[1] <= this.anIntArray7577[var4] || var2.anIntArray7260[2] <= this.anIntArray7577[var4] || var2.anIntArray7260[3] <= this.anIntArray7577[var4]) && (var2.anIntArray7260[0] >= this.anIntArray7578[var4] || var2.anIntArray7260[1] >= this.anIntArray7578[var4] || var2.anIntArray7260[2] >= this.anIntArray7578[var4] || var2.anIntArray7260[3] >= this.anIntArray7578[var4]) && (var2.anIntArray7253[0] <= this.anIntArray7580[var4] || var2.anIntArray7253[1] <= this.anIntArray7580[var4] || var2.anIntArray7253[2] <= this.anIntArray7580[var4] || var2.anIntArray7253[3] <= this.anIntArray7580[var4]) && (var2.anIntArray7253[0] >= this.anIntArray7581[var4] || var2.anIntArray7253[1] >= this.anIntArray7581[var4] || var2.anIntArray7253[2] >= this.anIntArray7581[var4] || var2.anIntArray7253[3] >= this.anIntArray7581[var4])) {
               return;
            }
         }
      }

      int var5;
      int var13;
      boolean var15;
      float var16;
      if(var2.aByte7262 == 1) {
         var4 = var2.aShort7249 - this.aClass549_7560.anInt7311 * -522241111 + this.aClass549_7560.anInt7304 * 1190212893;
         if(var4 >= 0 && var4 <= this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
            var5 = var2.aShort7256 - this.aClass549_7560.anInt7312 * 446938063 + this.aClass549_7560.anInt7304 * 1190212893;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
               return;
            }

            var13 = var2.aShort7259 - this.aClass549_7560.anInt7312 * 446938063 + this.aClass549_7560.anInt7304 * 1190212893;
            if(var13 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
               var13 = this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893;
            } else if(var13 < 0) {
               return;
            }

            var15 = false;

            while(var5 <= var13) {
               if(this.aClass549_7560.aBoolArrayArray7337[var4][var5++]) {
                  var15 = true;
                  break;
               }
            }

            if(var15) {
               var16 = (float)(this.aClass549_7560.anInt7313 * 422981645 - var2.anIntArray7260[0]);
               if(var16 < 0.0F) {
                  var16 *= -1.0F;
               }

               if(var16 >= (float)this.anInt7579) {
                  if(this.method6773(var2, 0)) {
                     if(this.method6773(var2, 1)) {
                        if(this.method6773(var2, 2)) {
                           if(this.method6773(var2, 3)) {
                              this.aClass545Array7576[this.anInt7558++] = var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if(var2.aByte7262 == 2) {
         var4 = var2.aShort7256 - this.aClass549_7560.anInt7312 * 446938063 + this.aClass549_7560.anInt7304 * 1190212893;
         if(var4 >= 0 && var4 <= this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
            var5 = var2.aShort7249 - this.aClass549_7560.anInt7311 * -522241111 + this.aClass549_7560.anInt7304 * 1190212893;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
               return;
            }

            var13 = var2.aShort7257 - this.aClass549_7560.anInt7311 * -522241111 + this.aClass549_7560.anInt7304 * 1190212893;
            if(var13 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
               var13 = this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893;
            } else if(var13 < 0) {
               return;
            }

            var15 = false;

            while(var5 <= var13) {
               if(this.aClass549_7560.aBoolArrayArray7337[var5++][var4]) {
                  var15 = true;
                  break;
               }
            }

            if(var15) {
               var16 = (float)(this.aClass549_7560.anInt7314 * 30907883 - var2.anIntArray7253[0]);
               if(var16 < 0.0F) {
                  var16 *= -1.0F;
               }

               if(var16 >= (float)this.anInt7579) {
                  if(this.method6773(var2, 0)) {
                     if(this.method6773(var2, 1)) {
                        if(this.method6773(var2, 2)) {
                           if(this.method6773(var2, 3)) {
                              this.aClass545Array7576[this.anInt7558++] = var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if(var2.aByte7262 != 16 && var2.aByte7262 != 8) {
         if(var2.aByte7262 == 4) {
            float var12 = (float)(var2.anIntArray7261[0] - this.aClass549_7560.anInt7315 * 194792535);
            if(var12 > (float)this.anInt7567) {
               var5 = var2.aShort7256 - this.aClass549_7560.anInt7312 * 446938063 + this.aClass549_7560.anInt7304 * 1190212893;
               if(var5 < 0) {
                  var5 = 0;
               } else if(var5 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
                  return;
               }

               var13 = var2.aShort7259 - this.aClass549_7560.anInt7312 * 446938063 + this.aClass549_7560.anInt7304 * 1190212893;
               if(var13 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
                  var13 = this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893;
               } else if(var13 < 0) {
                  return;
               }

               int var14 = var2.aShort7249 - this.aClass549_7560.anInt7311 * -522241111 + this.aClass549_7560.anInt7304 * 1190212893;
               if(var14 < 0) {
                  var14 = 0;
               } else if(var14 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
                  return;
               }

               int var8 = var2.aShort7257 - this.aClass549_7560.anInt7311 * -522241111 + this.aClass549_7560.anInt7304 * 1190212893;
               if(var8 > this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
                  var8 = this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893;
               } else if(var8 < 0) {
                  return;
               }

               boolean var9 = false;

               label286:
               for(int var10 = var14; var10 <= var8; ++var10) {
                  for(int var11 = var5; var11 <= var13; ++var11) {
                     if(this.aClass549_7560.aBoolArrayArray7337[var10][var11]) {
                        var9 = true;
                        break label286;
                     }
                  }
               }

               if(var9) {
                  if(this.method6773(var2, 0)) {
                     if(this.method6773(var2, 1)) {
                        if(this.method6773(var2, 2)) {
                           if(this.method6773(var2, 3)) {
                              this.aClass545Array7576[this.anInt7558++] = var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         var4 = var2.aShort7249 - this.aClass549_7560.anInt7311 * -522241111 + this.aClass549_7560.anInt7304 * 1190212893;
         if(var4 >= 0 && var4 <= this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
            var5 = var2.aShort7256 - this.aClass549_7560.anInt7312 * 446938063 + this.aClass549_7560.anInt7304 * 1190212893;
            if(var5 >= 0 && var5 <= this.aClass549_7560.anInt7304 * 1190212893 + this.aClass549_7560.anInt7304 * 1190212893) {
               if(this.aClass549_7560.aBoolArrayArray7337[var4][var5]) {
                  float var6 = (float)(this.aClass549_7560.anInt7313 * 422981645 - var2.anIntArray7260[0]);
                  if(var6 < 0.0F) {
                     var6 *= -1.0F;
                  }

                  float var7 = (float)(this.aClass549_7560.anInt7314 * 30907883 - var2.anIntArray7253[0]);
                  if(var7 < 0.0F) {
                     var7 *= -1.0F;
                  }

                  if(var6 >= (float)this.anInt7579 || var7 >= (float)this.anInt7579) {
                     if(this.method6773(var2, 0)) {
                        if(this.method6773(var2, 1)) {
                           if(this.method6773(var2, 2)) {
                              if(this.method6773(var2, 3)) {
                                 this.aClass545Array7576[this.anInt7558++] = var2;
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

   final boolean method6769(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(!this.method6774(var1, var2, var3)) {
         return false;
      } else {
         var1 = (int)this.aFloatArray7584[0];
         var2 = (int)this.aFloatArray7584[1];
         var3 = (int)this.aFloatArray7584[2];
         if(!this.method6774(var4, var5, var6)) {
            return false;
         } else {
            var4 = (int)this.aFloatArray7584[0];
            var5 = (int)this.aFloatArray7584[1];
            var6 = (int)this.aFloatArray7584[2];
            if(!this.method6774(var7, var8, var9)) {
               return false;
            } else {
               var7 = (int)this.aFloatArray7584[0];
               var8 = (int)this.aFloatArray7584[1];
               var9 = (int)this.aFloatArray7584[2];
               return this.aClass558_7564.method6716(var2, var5, var8, var1, var4, var7, var3, var6, var9);
            }
         }
      }
   }

   public void method6770() {
      this.method6759();
   }

   public void method6771() {
      this.method6759();
   }

   final boolean method6772(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var4;
      int var8 = var2 + var5;
      int var9 = var3 + var6;
      if(!this.method6769(var1, var8, var3, var7, var8, var9, var1, var8, var9)) {
         return false;
      } else if(!this.method6769(var1, var8, var3, var7, var8, var3, var7, var8, var9)) {
         return false;
      } else {
         if(var1 < this.aClass549_7560.anInt7313 * 422981645) {
            if(!this.method6769(var1, var2, var9, var1, var8, var3, var1, var8, var9)) {
               return false;
            }

            if(!this.method6769(var1, var2, var9, var1, var2, var3, var1, var8, var3)) {
               return false;
            }
         } else {
            if(!this.method6769(var7, var2, var9, var7, var8, var3, var7, var8, var9)) {
               return false;
            }

            if(!this.method6769(var7, var2, var9, var7, var2, var3, var7, var8, var3)) {
               return false;
            }
         }

         if(var3 < this.aClass549_7560.anInt7314 * 30907883) {
            if(!this.method6769(var1, var2, var3, var7, var8, var3, var1, var8, var3)) {
               return false;
            }

            if(!this.method6769(var1, var2, var3, var7, var2, var3, var7, var8, var3)) {
               return false;
            }
         } else {
            if(!this.method6769(var1, var2, var9, var7, var8, var9, var1, var8, var9)) {
               return false;
            }

            if(!this.method6769(var1, var2, var9, var7, var2, var9, var7, var8, var9)) {
               return false;
            }
         }

         return true;
      }
   }

   boolean method6773(Class545 var1, int var2) {
      if(!this.method6774(var1.anIntArray7260[var2], var1.anIntArray7261[var2], var1.anIntArray7253[var2])) {
         return false;
      } else {
         var1.aShortArray7254[var2] = (short)((int)this.aFloatArray7584[0]);
         var1.aShortArray7264[var2] = (short)((int)this.aFloatArray7584[1]);
         var1.aShortArray7265[var2] = (short)((int)this.aFloatArray7584[2]);
         return true;
      }
   }

   final boolean method6774(int var1, int var2, int var3) {
      aClass174_7583.method2513((float)var1, (float)var2, (float)var3, this.aFloatArray7584);
      if(this.aFloatArray7584[2] < 50.0F) {
         return false;
      } else {
         this.aFloatArray7584[0] /= 3.0F;
         this.aFloatArray7584[1] /= 3.0F;
         return true;
      }
   }

   boolean method6775(int var1, int var2, int var3, int var4) {
      if(this.aBool7586 && this.aBool7559) {
         if(this.aClass558_7564.anInt7535 < 102) {
            return false;
         } else if(!this.method6763(var1, var2, var3)) {
            return false;
         } else {
            int var5 = var2 << this.aClass549_7560.anInt7316 * 1705818315;
            int var6 = var3 << this.aClass549_7560.anInt7316 * 1705818315;
            return this.method6772(var5, this.aClass549_7560.aClass148Array7288[var1].method1714(var2, var3, -944391744), var6, this.aClass549_7560.anInt7333 * 776633539, var4, this.aClass549_7560.anInt7333 * 776633539);
         }
      } else {
         return false;
      }
   }
}
