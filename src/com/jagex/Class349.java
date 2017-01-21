package com.jagex;

import com.jagex.Class148_Sub2;
import com.jagex.Class174_Sub3;
import com.jagex.Class318;
import com.jagex.Class347;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub21_Sub5_Sub1;
import com.jagex.Interface42;
import java.nio.ByteBuffer;

public class Class349 {
   Class347[][] aClass347ArrayArray3655;
   Class174_Sub3 aClass174_Sub3_3658;
   Class148_Sub2 aClass148_Sub2_3650;
   int anInt3652;
   int anInt3653;
   byte[] aByteArray3654;
   int anInt3651;
   int anInt3657;
   int anInt3656;

   void method4527(int var1, int var2, int var3, int var4) {
      if(this.aClass347ArrayArray3655 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class347[] var10 = this.aClass347ArrayArray3655[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               if(var10[var11] != null) {
                  var10[var11].aBool3610 = true;
               }
            }
         }

      }
   }

   void method4528() {
      this.aClass347ArrayArray3655 = new Class347[this.anInt3657][this.anInt3656];

      for(int var1 = 0; var1 < this.anInt3656; ++var1) {
         for(int var2 = 0; var2 < this.anInt3657; ++var2) {
            this.aClass347ArrayArray3655[var2][var1] = new Class347(this.aClass174_Sub3_3658, this, this.aClass148_Sub2_3650, var2, var1, this.anInt3651, var2 * 128 + 1, var1 * 128 + 1);
            if(this.aClass347ArrayArray3655[var2][var1].anInt3614 == 0) {
               this.aClass347ArrayArray3655[var2][var1] = null;
            }
         }
      }

   }

   void method4529(Class526_Sub21_Sub5 var1, int var2, int var3) {
      Class526_Sub21_Sub5_Sub1 var4 = (Class526_Sub21_Sub5_Sub1)var1;
      var2 += var4.anInt12040 + 1;
      var3 += var4.anInt12041 + 1;
      int var5 = var2 + var3 * this.anInt3652;
      int var6 = 0;
      int var7 = var4.anInt12042;
      int var8 = var4.anInt12037;
      int var9 = this.anInt3652 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt3652;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt3653) {
         var11 = var3 + var7 + 1 - this.anInt3653;
         var7 -= var11;
      }

      if(var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if(var2 + var8 >= this.anInt3652) {
         var11 = var2 + var8 + 1 - this.anInt3652;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method4533(this.aByteArray3654, var4.aByteArray12039, var6, var5, var8, var7, var9, var10);
         this.method4532(var2, var3, var8, var7);
      }
   }

   void method4530() {
      this.aClass347ArrayArray3655 = new Class347[this.anInt3657][this.anInt3656];

      for(int var1 = 0; var1 < this.anInt3656; ++var1) {
         for(int var2 = 0; var2 < this.anInt3657; ++var2) {
            this.aClass347ArrayArray3655[var2][var1] = new Class347(this.aClass174_Sub3_3658, this, this.aClass148_Sub2_3650, var2, var1, this.anInt3651, var2 * 128 + 1, var1 * 128 + 1);
            if(this.aClass347ArrayArray3655[var2][var1].anInt3614 == 0) {
               this.aClass347ArrayArray3655[var2][var1] = null;
            }
         }
      }

   }

   boolean method4531(Class526_Sub21_Sub5 var1, int var2, int var3) {
      Class526_Sub21_Sub5_Sub1 var4 = (Class526_Sub21_Sub5_Sub1)var1;
      var2 += var4.anInt12040 + 1;
      var3 += var4.anInt12041 + 1;
      int var5 = var2 + var3 * this.anInt3652;
      int var6 = var4.anInt12042;
      int var7 = var4.anInt12037;
      int var8 = this.anInt3652 - var7;
      int var9;
      if(var3 <= 0) {
         var9 = 1 - var3;
         var6 -= var9;
         var5 += var9 * this.anInt3652;
         var3 = 1;
      }

      if(var3 + var6 >= this.anInt3653) {
         var9 = var3 + var6 + 1 - this.anInt3653;
         var6 -= var9;
      }

      if(var2 <= 0) {
         var9 = 1 - var2;
         var7 -= var9;
         var5 += var9;
         var8 += var9;
         var2 = 1;
      }

      if(var2 + var7 >= this.anInt3652) {
         var9 = var2 + var7 + 1 - this.anInt3652;
         var7 -= var9;
         var8 += var9;
      }

      if(var7 > 0 && var6 > 0) {
         byte var10 = 8;
         var8 += (var10 - 1) * this.anInt3652;
         return method4535(this.aByteArray3654, var5, var7, var6, var8, var10);
      } else {
         return false;
      }
   }

   void method4532(int var1, int var2, int var3, int var4) {
      if(this.aClass347ArrayArray3655 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class347[] var10 = this.aClass347ArrayArray3655[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               if(var10[var11] != null) {
                  var10[var11].aBool3610 = true;
               }
            }
         }

      }
   }

   static final void method4533(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static final void method4534(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static final boolean method4535(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 % var5;
      int var7;
      if(var6 != 0) {
         var7 = var5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((var3 + var5 - 1) / var5);
      int var9 = -((var2 + var5 - 1) / var5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if(var0[var1] == 0) {
               return true;
            }

            var1 += var5;
         }

         var1 -= var7;
         if(var0[var1 - 1] == 0) {
            return true;
         }

         var1 += var4;
      }

      return false;
   }

   void method4536(int var1, int var2, int var3, int var4) {
      if(this.aClass347ArrayArray3655 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class347[] var10 = this.aClass347ArrayArray3655[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               if(var10[var11] != null) {
                  var10[var11].aBool3610 = true;
               }
            }
         }

      }
   }

   Class349(Class174_Sub3 var1, Class148_Sub2 var2) {
      this.aClass174_Sub3_3658 = var1;
      this.aClass148_Sub2_3650 = var2;
      this.anInt3652 = 2 + (this.aClass148_Sub2_3650.anInt1711 * 1966165105 * this.aClass148_Sub2_3650.anInt1712 * 1934131013 >> this.aClass174_Sub3_3658.anInt9710);
      this.anInt3653 = 2 + (this.aClass148_Sub2_3650.anInt1713 * -810756899 * this.aClass148_Sub2_3650.anInt1712 * 1934131013 >> this.aClass174_Sub3_3658.anInt9710);
      this.aByteArray3654 = new byte[this.anInt3652 * this.anInt3653];
      this.anInt3651 = 7 + this.aClass174_Sub3_3658.anInt9710 - this.aClass148_Sub2_3650.anInt1710 * -586661047;
      this.anInt3657 = this.aClass148_Sub2_3650.anInt1711 * 1966165105 >> this.anInt3651;
      this.anInt3656 = this.aClass148_Sub2_3650.anInt1713 * -810756899 >> this.anInt3651;
   }

   void method4537(Class526_Sub21_Sub5 var1, int var2, int var3) {
      Class526_Sub21_Sub5_Sub1 var4 = (Class526_Sub21_Sub5_Sub1)var1;
      var2 += var4.anInt12040 + 1;
      var3 += var4.anInt12041 + 1;
      int var5 = var2 + var3 * this.anInt3652;
      int var6 = 0;
      int var7 = var4.anInt12042;
      int var8 = var4.anInt12037;
      int var9 = this.anInt3652 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt3652;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt3653) {
         var11 = var3 + var7 + 1 - this.anInt3653;
         var7 -= var11;
      }

      if(var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if(var2 + var8 >= this.anInt3652) {
         var11 = var2 + var8 + 1 - this.anInt3652;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method4534(this.aByteArray3654, var4.aByteArray12039, var6, var5, var8, var7, var9, var10);
         this.method4532(var2, var3, var8, var7);
      }
   }

   void method4538(Class318 var1, int var2, int var3, int var4, boolean[][] var5, boolean var6) {
      this.aClass174_Sub3_3658.method2328(false);
      float var7 = 1.0F / (float)(this.aClass174_Sub3_3658.anInt9826 * 128);
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      if(var6) {
         for(int var8 = 0; var8 < this.anInt3656; ++var8) {
            int var9 = var8 << this.anInt3651;
            var10 = var8 + 1 << this.anInt3651;

            label144:
            for(var11 = 0; var11 < this.anInt3657; ++var11) {
               if(this.aClass347ArrayArray3655[var11][var8] != null) {
                  var12 = var11 << this.anInt3651;
                  var13 = var11 + 1 << this.anInt3651;

                  for(var14 = var12; var14 < var13; ++var14) {
                     if(var14 - var2 >= -var4 && var14 - var2 <= var4) {
                        for(var15 = var9; var15 < var10; ++var15) {
                           if(var15 - var3 >= -var4 && var15 - var3 <= var4 && var5[var14 - var2 + var4][var15 - var3 + var4]) {
                              var1.aClass433_3420.method5141(var7, var7, 1.0F, 1.0F);
                              var1.aClass433_3420.aFloatArray4841[12] = (float)(-var11);
                              var1.aClass433_3420.aFloatArray4841[13] = (float)(-var8);
                              this.aClass347ArrayArray3655[var11][var8].method4480(var1);
                              continue label144;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         int[] var24 = new int[this.anInt3656 * this.anInt3657];
         ByteBuffer var25 = this.aClass174_Sub3_3658.aByteBuffer9684;
         var25.clear();
         var10 = 0;

         for(var11 = 0; var11 < this.anInt3656; ++var11) {
            var12 = var11 << this.anInt3651;
            var13 = var11 + 1 << this.anInt3651;

            for(var14 = 0; var14 < this.anInt3657; ++var14) {
               Class347 var27 = this.aClass347ArrayArray3655[var14][var11];
               int var16 = 0;
               if(var27 != null) {
                  int var17 = var14 << this.anInt3651;
                  int var18 = var14 + 1 << this.anInt3651;

                  for(int var19 = var12; var19 < var13; ++var19) {
                     if(var19 - var3 >= -var4 && var19 - var3 <= var4) {
                        int var20 = var19 * this.aClass148_Sub2_3650.anInt1711 * 1966165105 + var17;

                        for(int var21 = var17; var21 < var18; ++var21) {
                           if(var21 - var2 >= -var4 && var21 - var2 <= var4 && var5[var21 - var2 + var4][var19 - var3 + var4]) {
                              short[] var22 = this.aClass148_Sub2_3650.aShortArrayArray9128[var20];
                              if(var22 != null) {
                                 for(int var23 = 0; var23 < var22.length; ++var23) {
                                    var25.putShort(var22[var23]);
                                    ++var16;
                                 }
                              }
                           }

                           ++var20;
                        }
                     }
                  }
               }

               var24[var10] = var16;
               ++var10;
            }
         }

         if(var25.position() != 0) {
            var11 = var25.position();
            Interface42 var26 = this.aClass174_Sub3_3658.method8746(var11 / 2);
            var26.method235(0, var11, this.aClass174_Sub3_3658.aLong9685);
            var13 = 0;
            var10 = 0;

            for(var14 = 0; var14 < this.anInt3656; ++var14) {
               for(var15 = 0; var15 < this.anInt3657; ++var15) {
                  if(var24[var10] != 0) {
                     var1.aClass433_3420.method5141(var7, var7, 1.0F, 1.0F);
                     var1.aClass433_3420.aFloatArray4841[12] = (float)(-var15);
                     var1.aClass433_3420.aFloatArray4841[13] = (float)(-var14);
                     this.aClass347ArrayArray3655[var15][var14].method4481(var1, var26, var13, var24[var10] / 3);
                     var13 += var24[var10];
                  }

                  ++var10;
               }
            }
         }
      }

      this.aClass174_Sub3_3658.method2328(true);
   }

   static final void method4539(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10001;
         int var10;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static final boolean method4540(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 % var5;
      int var7;
      if(var6 != 0) {
         var7 = var5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((var3 + var5 - 1) / var5);
      int var9 = -((var2 + var5 - 1) / var5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if(var0[var1] == 0) {
               return true;
            }

            var1 += var5;
         }

         var1 -= var7;
         if(var0[var1 - 1] == 0) {
            return true;
         }

         var1 += var4;
      }

      return false;
   }
}
