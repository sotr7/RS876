package com.jagex;

import com.jagex.Class144;
import com.jagex.Class148_Sub2;
import com.jagex.Class166;
import com.jagex.Class174_Sub3;
import com.jagex.Class318;
import com.jagex.Class349;
import com.jagex.Interface38;
import com.jagex.Interface42;
import java.nio.ByteBuffer;

public class Class347 {
   static final int anInt3605 = 128;
   static final int anInt3618 = 7;
   boolean aBool3610 = true;
   int anInt3611 = -1;
   int[] anIntArray3617;
   byte[] aByteArray3612;
   Interface38 anInterface38_3609;
   Class174_Sub3 aClass174_Sub3_3606;
   Class349 aClass349_3607;
   int anInt3604;
   int anInt3608;
   int anInt3614;
   int anInt3616;
   int anInt3615;
   Interface42 anInterface42_3613;

   void method4480(Class318 var1) {
      this.method4481(var1, this.anInterface42_3613, 0, this.anInt3614);
   }

   void method4481(Class318 var1, Interface42 var2, int var3, int var4) {
      if(var4 > 0) {
         this.method4482();
         this.aClass174_Sub3_3606.method8769(var2);
         var1.anInterface38_3415 = this.anInterface38_3609;
         var1.anInt3430 = this.anInt3615;
         var1.anInt3416 = this.anInt3616 - this.anInt3615 + 1;
         var1.anInt3424 = var3;
         var1.anInt3423 = var4;
         var1.method4120(false);
      }

   }

   void method4482() {
      if(this.aBool3610) {
         this.aBool3610 = false;
         byte[] var1 = this.aClass349_3607.aByteArray3654;
         int var2 = 0;
         int var3 = this.aClass349_3607.anInt3652;
         int var4 = this.anInt3604 + this.anInt3608 * this.aClass349_3607.anInt3652;

         int var5;
         for(var5 = -128; var5 < 0; ++var5) {
            var2 = (var2 << 8) - var2;

            for(int var6 = -128; var6 < 0; ++var6) {
               if(var1[var4++] != 0) {
                  ++var2;
               }
            }

            var4 += var3 - 128;
         }

         if(this.anInterface38_3609 != null && this.anInt3611 == var2) {
            this.aBool3610 = false;
         } else {
            this.anInt3611 = var2;
            var5 = 0;
            var4 = this.anInt3604 + this.anInt3608 * var3;
            int var7;
            int var8;
            int var9;
            if(this.aClass174_Sub3_3606.method8744(Class144.aClass144_1681, Class166.aClass166_1884)) {
               if(this.aByteArray3612 == null) {
                  this.aByteArray3612 = new byte[16384];
               }

               byte[] var10 = this.aByteArray3612;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if(var1[var4] != 0) {
                        var10[var5++] = 68;
                     } else {
                        var9 = 0;
                        if(var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var10[var5++] = (byte)(17 * var9);
                     }

                     ++var4;
                  }

                  var4 += this.aClass349_3607.anInt3652 - 128;
               }

               if(this.anInterface38_3609 == null) {
                  this.anInterface38_3609 = this.aClass174_Sub3_3606.method8740(Class144.aClass144_1681, 128, 128, false, this.aByteArray3612);
                  this.anInterface38_3609.method254(false, false);
               } else {
                  this.anInterface38_3609.method250(0, 0, 128, 128, this.aByteArray3612, Class144.aClass144_1681, 0, 128);
               }
            } else {
               if(this.anIntArray3617 == null) {
                  this.anIntArray3617 = new int[16384];
               }

               int[] var11 = this.anIntArray3617;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if(var1[var4] != 0) {
                        var11[var5++] = 1140850688;
                     } else {
                        var9 = 0;
                        if(var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var11[var5++] = 17 * var9 << 24;
                     }

                     ++var4;
                  }

                  var4 += this.aClass349_3607.anInt3652 - 128;
               }

               if(this.anInterface38_3609 == null) {
                  this.anInterface38_3609 = this.aClass174_Sub3_3606.method8906(128, 128, false, this.anIntArray3617);
                  this.anInterface38_3609.method254(false, false);
               } else {
                  this.anInterface38_3609.method255(0, 0, 128, 128, this.anIntArray3617, 0, 128);
               }
            }

         }
      }
   }

   Class347(Class174_Sub3 var1, Class349 var2, Class148_Sub2 var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass174_Sub3_3606 = var1;
      this.aClass349_3607 = var2;
      this.anInt3604 = var7;
      this.anInt3608 = var8;
      int var9 = 1 << var6;
      int var10 = 0;
      int var11 = var4 << var6;
      int var12 = var5 << var6;

      int var14;
      int var15;
      for(int var13 = 0; var13 < var9; ++var13) {
         var14 = (var12 + var13) * var3.anInt1711 * 1966165105 + var11;

         for(var15 = 0; var15 < var9; ++var15) {
            short[] var16 = var3.aShortArrayArray9128[var14++];
            if(var16 != null) {
               var10 += var16.length;
            }
         }
      }

      if(var10 > 0) {
         this.anInt3616 = Integer.MIN_VALUE;
         this.anInt3615 = Integer.MAX_VALUE;
         this.anInterface42_3613 = this.aClass174_Sub3_3606.method8805(false);
         this.anInterface42_3613.method340(var10);
         ByteBuffer var20 = this.aClass174_Sub3_3606.aByteBuffer9684;
         var20.clear();

         for(var14 = 0; var14 < var9; ++var14) {
            var15 = (var12 + var14) * var3.anInt1711 * 1966165105 + var11;

            for(int var21 = 0; var21 < var9; ++var21) {
               short[] var17 = var3.aShortArrayArray9128[var15++];
               if(var17 != null) {
                  for(int var18 = 0; var18 < var17.length; ++var18) {
                     int var19 = var17[var18] & '\uffff';
                     if(var19 < this.anInt3615) {
                        this.anInt3615 = var19;
                     }

                     if(var19 > this.anInt3616) {
                        this.anInt3616 = var19;
                     }

                     var20.putShort((short)var19);
                  }
               }
            }
         }

         this.anInterface42_3613.method235(0, var20.position(), this.aClass174_Sub3_3606.aLong9685);
         this.anInt3614 = var10 / 3;
      } else {
         this.anInt3614 = 0;
         this.anInterface38_3609 = null;
      }

   }

   void method4483() {
      if(this.aBool3610) {
         this.aBool3610 = false;
         byte[] var1 = this.aClass349_3607.aByteArray3654;
         int var2 = 0;
         int var3 = this.aClass349_3607.anInt3652;
         int var4 = this.anInt3604 + this.anInt3608 * this.aClass349_3607.anInt3652;

         int var5;
         for(var5 = -128; var5 < 0; ++var5) {
            var2 = (var2 << 8) - var2;

            for(int var6 = -128; var6 < 0; ++var6) {
               if(var1[var4++] != 0) {
                  ++var2;
               }
            }

            var4 += var3 - 128;
         }

         if(this.anInterface38_3609 != null && this.anInt3611 == var2) {
            this.aBool3610 = false;
         } else {
            this.anInt3611 = var2;
            var5 = 0;
            var4 = this.anInt3604 + this.anInt3608 * var3;
            int var7;
            int var8;
            int var9;
            if(this.aClass174_Sub3_3606.method8744(Class144.aClass144_1681, Class166.aClass166_1884)) {
               if(this.aByteArray3612 == null) {
                  this.aByteArray3612 = new byte[16384];
               }

               byte[] var10 = this.aByteArray3612;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if(var1[var4] != 0) {
                        var10[var5++] = 68;
                     } else {
                        var9 = 0;
                        if(var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var10[var5++] = (byte)(17 * var9);
                     }

                     ++var4;
                  }

                  var4 += this.aClass349_3607.anInt3652 - 128;
               }

               if(this.anInterface38_3609 == null) {
                  this.anInterface38_3609 = this.aClass174_Sub3_3606.method8740(Class144.aClass144_1681, 128, 128, false, this.aByteArray3612);
                  this.anInterface38_3609.method254(false, false);
               } else {
                  this.anInterface38_3609.method250(0, 0, 128, 128, this.aByteArray3612, Class144.aClass144_1681, 0, 128);
               }
            } else {
               if(this.anIntArray3617 == null) {
                  this.anIntArray3617 = new int[16384];
               }

               int[] var11 = this.anIntArray3617;

               for(var7 = -128; var7 < 0; ++var7) {
                  for(var8 = -128; var8 < 0; ++var8) {
                     if(var1[var4] != 0) {
                        var11[var5++] = 1140850688;
                     } else {
                        var9 = 0;
                        if(var1[var4 - 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + 1] != 0) {
                           ++var9;
                        }

                        if(var1[var4 - var3] != 0) {
                           ++var9;
                        }

                        if(var1[var4 + var3] != 0) {
                           ++var9;
                        }

                        var11[var5++] = 17 * var9 << 24;
                     }

                     ++var4;
                  }

                  var4 += this.aClass349_3607.anInt3652 - 128;
               }

               if(this.anInterface38_3609 == null) {
                  this.anInterface38_3609 = this.aClass174_Sub3_3606.method8906(128, 128, false, this.anIntArray3617);
                  this.anInterface38_3609.method254(false, false);
               } else {
                  this.anInterface38_3609.method255(0, 0, 128, 128, this.anIntArray3617, 0, 128);
               }
            }

         }
      }
   }
}
