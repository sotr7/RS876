package com.jagex;

import com.jagex.Class153_Sub1;
import com.jagex.Class162;
import com.jagex.Class162_Sub2;
import com.jagex.Class174_Sub1;
import com.jagex.Interface21;

public class Class153_Sub1_Sub3 extends Class153_Sub1 {
   byte[] aByteArray11392;
   int[] anIntArray11393;

   public void method1805(int var1, int var2, Class162 var3, int var4, int var5) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var6 != null) {
            var1 += this.anInt8941;
            var2 += this.anInt8958;
            int var7 = 0;
            int var8 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var9 = this.anInt8936;
            int var10 = this.anInt8944;
            int var11 = var8 - var9;
            int var12 = 0;
            int var13 = var1 + var2 * var8;
            int var14;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var14 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var10 -= var14;
               var2 = this.aClass174_Sub1_8932.anInt9267 * 1511023883;
               var7 += var14 * var9;
               var13 += var14 * var8;
            }

            if(var2 + var10 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var10 -= var2 + var10 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var14 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var9 -= var14;
               var1 = this.aClass174_Sub1_8932.anInt9247 * -217416947;
               var7 += var14;
               var13 += var14;
               var12 += var14;
               var11 += var14;
            }

            if(var1 + var9 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var14 = var1 + var9 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var9 -= var14;
               var12 += var14;
               var11 += var14;
            }

            if(var9 > 0 && var10 > 0) {
               Class162_Sub2 var26 = (Class162_Sub2)var3;
               int[] var15 = var26.anIntArray9211;
               int[] var16 = var26.anIntArray9210;
               int var17 = var2;
               if(var5 > var2) {
                  var17 = var5;
                  var13 += (var5 - var2) * var8;
                  var7 += (var5 - var2) * this.anInt8936;
               }

               int var18 = var5 + var15.length < var2 + var10?var5 + var15.length:var2 + var10;

               for(int var19 = var17; var19 < var18; ++var19) {
                  int var20 = var15[var19 - var5] + var4;
                  int var21 = var16[var19 - var5];
                  int var22 = var9;
                  int var23;
                  if(var1 > var20) {
                     var23 = var1 - var20;
                     if(var23 >= var21) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var21 -= var23;
                  } else {
                     var23 = var20 - var1;
                     if(var23 >= var9) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var7 += var23;
                     var22 = var9 - var23;
                     var13 += var23;
                  }

                  var23 = 0;
                  if(var22 < var21) {
                     var21 = var22;
                  } else {
                     var23 = var22 - var21;
                  }

                  for(int var24 = -var21; var24 < 0; ++var24) {
                     byte var25 = this.aByteArray11392[var7++];
                     if(var25 != 0) {
                        var6[var13++] = this.anIntArray11393[var25 & 255];
                     } else {
                        ++var13;
                     }
                  }

                  var7 += var23 + var12;
                  var13 += var23 + var11;
               }

            }
         }
      }
   }

   public void method1782(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      throw new IllegalStateException();
   }

   public void method1768(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      throw new IllegalStateException();
   }

   public void method1776(int var1, int var2, int var3, int var4, int var5, int var6) {
      throw new IllegalStateException();
   }

   public void method1777(int var1, int var2, int var3) {
      throw new IllegalStateException();
   }

   public Interface21 method1773() {
      throw new IllegalStateException();
   }

   public void method1774(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var6 != null) {
            int var7 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            var1 += this.anInt8941;
            var2 += this.anInt8958;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.anInt8944;
            int var11 = this.anInt8936;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var14 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var10 -= var14;
               var2 = this.aClass174_Sub1_8932.anInt9267 * 1511023883;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if(var2 + var10 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var10 -= var2 + var10 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var14 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var11 -= var14;
               var1 = this.aClass174_Sub1_8932.anInt9247 * -217416947;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if(var1 + var11 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var14 = var1 + var11 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if(var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var5 == 0) {
                  if(var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if(var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  byte var27;
                  byte var32;
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255] | -16777216;
                                 short var28 = 255;
                                 byte var30 = 0;
                                 var20 = var6[var8];
                                 var6[var8++] = (((var17 & 16711935) * var28 + (var20 & 16711935) * var30 & -16711936) >> 8) + (((var17 & -16711936) >>> 8) * var28 + ((var20 & -16711936) >>> 8) * var30 & -16711936);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        byte var29;
                        if(var3 == 0) {
                           if((var4 & 16777215) == 16777215) {
                              var14 = var4 >>> 24;
                              var15 = 256 - var14;

                              for(var16 = -var10; var16 < 0; ++var16) {
                                 for(var17 = -var11; var17 < 0; ++var17) {
                                    var29 = this.aByteArray11392[var9++];
                                    if(var29 != 0) {
                                       var19 = this.anIntArray11393[var29 & 255];
                                       var20 = var6[var8];
                                       var6[var8++] = ((var19 & 16711935) * var14 + (var20 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var20 & '\uff00') * var15 & 16711680) >> 8;
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           } else {
                              var14 = (var4 & 16711680) >> 16;
                              var15 = (var4 & '\uff00') >> 8;
                              var16 = var4 & 255;
                              var17 = var4 >>> 24;
                              var18 = 256 - var17;

                              for(var19 = -var10; var19 < 0; ++var19) {
                                 for(var20 = -var11; var20 < 0; ++var20) {
                                    byte var31 = this.aByteArray11392[var9++];
                                    if(var31 != 0) {
                                       var22 = this.anIntArray11393[var31 & 255];
                                       if(var17 != 255) {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var22 = (var23 | var24 | var25) >>> 8;
                                          var26 = var6[var8];
                                          var6[var8++] = ((var22 & 16711935) * var17 + (var26 & 16711935) * var18 & -16711936) + ((var22 & '\uff00') * var17 + (var26 & '\uff00') * var18 & 16711680) >> 8;
                                       } else {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var6[var8++] = (var23 | var24 | var25) >>> 8;
                                       }
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           }
                        } else if(var3 == 3) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var29 = this.aByteArray11392[var9++];
                                 var19 = var29 > 0?this.anIntArray11393[var29]:0;
                                 var20 = var19 + var4;
                                 var21 = (var19 & 16711935) + (var4 & 16711935);
                                 var22 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var22 = var20 - var22 | var22 - (var22 >>> 8);
                                 if(var19 == 0 && var14 != 255) {
                                    var19 = var22;
                                    var22 = var6[var8];
                                    var22 = ((var19 & 16711935) * var14 + (var22 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var22 & '\uff00') * var15 & 16711680) >> 8;
                                 }

                                 var6[var8++] = var22;
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           if(var3 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var14 = var4 >>> 24;
                           var15 = 256 - var14;
                           var16 = (var4 & 16711935) * var15 & -16711936;
                           var17 = (var4 & '\uff00') * var15 & 16711680;
                           var4 = (var16 | var17) >>> 8;

                           for(var18 = -var10; var18 < 0; ++var18) {
                              for(var19 = -var11; var19 < 0; ++var19) {
                                 var32 = this.aByteArray11392[var9++];
                                 if(var32 != 0) {
                                    var21 = this.anIntArray11393[var32 & 255];
                                    var16 = (var21 & 16711935) * var14 & -16711936;
                                    var17 = (var21 & '\uff00') * var14 & 16711680;
                                    var6[var8++] = ((var16 | var17) >>> 8) + var4;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255];
                                 var18 = var6[var8];
                                 var19 = var17 + var18;
                                 var20 = (var17 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var6[var8++] = var19 - var18 | var18 - (var18 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              byte var33 = this.aByteArray11392[var9++];
                              if(var33 != 0) {
                                 var20 = this.anIntArray11393[var33 & 255];
                                 var21 = (var20 & 16711680) * var14 & -16777216;
                                 var22 = (var20 & '\uff00') * var15 & 16711680;
                                 var23 = (var20 & 255) * var16 & '\uff00';
                                 var20 = (var21 | var22 | var23) >>> 8;
                                 var24 = var6[var8];
                                 var25 = var20 + var24;
                                 var26 = (var20 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 var6[var8++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              var17 = var27 > 0?this.anIntArray11393[var27]:0;
                              var18 = var17 + var4;
                              var19 = (var17 & 16711935) + (var4 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var17 = var18 - var20 | var20 - (var20 >>> 8);
                              var20 = var6[var8];
                              var18 = var17 + var20;
                              var19 = (var17 & 16711935) + (var20 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var6[var8++] = var18 - var20 | var20 - (var20 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if(var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var32 = this.aByteArray11392[var9++];
                              if(var32 != 0) {
                                 var21 = this.anIntArray11393[var32 & 255];
                                 var16 = (var21 & 16711935) * var14 & -16711936;
                                 var17 = (var21 & '\uff00') * var14 & 16711680;
                                 var21 = ((var16 | var17) >>> 8) + var4;
                                 var22 = var6[var8];
                                 var23 = var21 + var22;
                                 var24 = (var21 & 16711935) + (var22 & 16711935);
                                 var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                                 var6[var8++] = var23 - var22 | var22 - (var22 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public void method1779(int var1, int var2, Class162 var3, int var4, int var5) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var6 != null) {
            var1 += this.anInt8941;
            var2 += this.anInt8958;
            int var7 = 0;
            int var8 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var9 = this.anInt8936;
            int var10 = this.anInt8944;
            int var11 = var8 - var9;
            int var12 = 0;
            int var13 = var1 + var2 * var8;
            int var14;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var14 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var10 -= var14;
               var2 = this.aClass174_Sub1_8932.anInt9267 * 1511023883;
               var7 += var14 * var9;
               var13 += var14 * var8;
            }

            if(var2 + var10 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var10 -= var2 + var10 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var14 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var9 -= var14;
               var1 = this.aClass174_Sub1_8932.anInt9247 * -217416947;
               var7 += var14;
               var13 += var14;
               var12 += var14;
               var11 += var14;
            }

            if(var1 + var9 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var14 = var1 + var9 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var9 -= var14;
               var12 += var14;
               var11 += var14;
            }

            if(var9 > 0 && var10 > 0) {
               Class162_Sub2 var26 = (Class162_Sub2)var3;
               int[] var15 = var26.anIntArray9211;
               int[] var16 = var26.anIntArray9210;
               int var17 = var2;
               if(var5 > var2) {
                  var17 = var5;
                  var13 += (var5 - var2) * var8;
                  var7 += (var5 - var2) * this.anInt8936;
               }

               int var18 = var5 + var15.length < var2 + var10?var5 + var15.length:var2 + var10;

               for(int var19 = var17; var19 < var18; ++var19) {
                  int var20 = var15[var19 - var5] + var4;
                  int var21 = var16[var19 - var5];
                  int var22 = var9;
                  int var23;
                  if(var1 > var20) {
                     var23 = var1 - var20;
                     if(var23 >= var21) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var21 -= var23;
                  } else {
                     var23 = var20 - var1;
                     if(var23 >= var9) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var7 += var23;
                     var22 = var9 - var23;
                     var13 += var23;
                  }

                  var23 = 0;
                  if(var22 < var21) {
                     var21 = var22;
                  } else {
                     var23 = var22 - var21;
                  }

                  for(int var24 = -var21; var24 < 0; ++var24) {
                     byte var25 = this.aByteArray11392[var7++];
                     if(var25 != 0) {
                        var6[var13++] = this.anIntArray11393[var25 & 255];
                     } else {
                        ++var13;
                     }
                  }

                  var7 += var23 + var12;
                  var13 += var23 + var11;
               }

            }
         }
      }
   }

   void method8377(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      if(var7 > 0 && var8 > 0) {
         if(var1 || var2) {
            int var14 = 0;
            int var15 = 0;
            int var16 = this.anInt8941 + this.anInt8936 + this.anInt8934;
            int var17 = this.anInt8958 + this.anInt8944 + this.anInt8935;
            int var18 = (var16 << 16) / var7;
            int var19 = (var17 << 16) / var8;
            int var20;
            if(this.anInt8941 > 0) {
               var20 = ((this.anInt8941 << 16) + var18 - 1) / var18;
               var4 += var20;
               var14 += var20 * var18 - (this.anInt8941 << 16);
            }

            if(this.anInt8958 > 0) {
               var20 = ((this.anInt8958 << 16) + var19 - 1) / var19;
               var5 += var20;
               var15 += var20 * var19 - (this.anInt8958 << 16);
            }

            if(this.anInt8936 < var16) {
               var7 = ((this.anInt8936 << 16) - var14 + var18 - 1) / var18;
            }

            if(this.anInt8944 < var17) {
               var8 = ((this.anInt8944 << 16) - var15 + var19 - 1) / var19;
            }

            var20 = var4 + var5 * this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var21 = this.aClass174_Sub1_8932.anInt9277 * -2145294317 - var7;
            if(var5 + var8 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var8 -= var5 + var8 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            int var22;
            if(var5 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var22 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var5;
               var8 -= var22;
               var20 += var22 * this.aClass174_Sub1_8932.anInt9277 * -2145294317;
               var15 += var19 * var22;
            }

            if(var4 + var7 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var22 = var4 + var7 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var7 -= var22;
               var21 += var22;
            }

            if(var4 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var22 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var4;
               var7 -= var22;
               var20 += var22;
               var14 += var18 * var22;
               var21 += var22;
            }

            float[] var39 = this.aClass174_Sub1_8932.aFloatArray9246;
            int[] var23 = this.aClass174_Sub1_8932.anIntArray9243;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            int var30;
            int var31;
            int var32;
            int var33;
            int var34;
            byte var40;
            if(var11 == 0) {
               if(var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.anInt8936;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var23[var20] = this.anIntArray11393[this.aByteArray11392[(var14 >> 16) + var26] & 255];
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if(var9 == 0) {
                  var24 = (var10 & 16711680) >> 16;
                  var25 = (var10 & '\uff00') >> 8;
                  var26 = var10 & 255;
                  var27 = var14;

                  for(var28 = -var8; var28 < 0; ++var28) {
                     var29 = (var15 >> 16) * this.anInt8936;

                     for(var30 = -var7; var30 < 0; ++var30) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var31 = this.anIntArray11393[this.aByteArray11392[(var14 >> 16) + var29] & 255];
                              var32 = (var31 & 16711680) * var24 & -16777216;
                              var33 = (var31 & '\uff00') * var25 & 16711680;
                              var34 = (var31 & 255) * var26 & '\uff00';
                              var23[var20] = (var32 | var33 | var34) >>> 8;
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var27;
                     var20 += var21;
                  }
               } else if(var9 == 3) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.anInt8936;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var40 = this.aByteArray11392[(var14 >> 16) + var26];
                              var29 = var40 > 0?this.anIntArray11393[var40]:0;
                              var30 = var29 + var10;
                              var31 = (var29 & 16711935) + (var10 & 16711935);
                              var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else {
                  if(var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var24 = var10 >>> 24;
                  var25 = 256 - var24;
                  var26 = (var10 & 16711935) * var25 & -16711936;
                  var27 = (var10 & '\uff00') * var25 & 16711680;
                  var10 = (var26 | var27) >>> 8;
                  var28 = var14;

                  for(var29 = -var8; var29 < 0; ++var29) {
                     var30 = (var15 >> 16) * this.anInt8936;

                     for(var31 = -var7; var31 < 0; ++var31) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var32 = this.anIntArray11393[this.aByteArray11392[(var14 >> 16) + var30] & 255];
                              var26 = (var32 & 16711935) * var24 & -16711936;
                              var27 = (var32 & '\uff00') * var24 & 16711680;
                              var23[var20] = ((var26 | var27) >>> 8) + var10;
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var28;
                     var20 += var21;
                  }
               }
            } else {
               int var35;
               int var36;
               int var37;
               int var38;
               byte var43;
               if(var11 == 1) {
                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              var40 = this.aByteArray11392[(var14 >> 16) + var26];
                              if(var40 != 0) {
                                 if(var1) {
                                    var23[var20] = this.anIntArray11393[var40 & 255];
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     byte var41;
                     if(var9 == 0) {
                        var24 = var14;
                        if((var10 & 16777215) == 16777215) {
                           var25 = var10 >>> 24;
                           var26 = 256 - var25;

                           for(var27 = -var8; var27 < 0; ++var27) {
                              var28 = (var15 >> 16) * this.anInt8936;

                              for(var29 = -var7; var29 < 0; ++var29) {
                                 if(!var2 || var6 < var39[var20]) {
                                    var41 = this.aByteArray11392[(var14 >> 16) + var28];
                                    if(var41 != 0) {
                                       if(var1) {
                                          var31 = this.anIntArray11393[var41 & 255];
                                          var32 = var23[var20];
                                          var23[var20] = ((var31 & 16711935) * var25 + (var32 & 16711935) * var26 & -16711936) + ((var31 & '\uff00') * var25 + (var32 & '\uff00') * var26 & 16711680) >> 8;
                                       }

                                       if(var2 && var13) {
                                          var39[var20] = var6;
                                       }
                                    }
                                 }

                                 var14 += var18;
                                 ++var20;
                              }

                              var15 += var19;
                              var14 = var24;
                              var20 += var21;
                           }
                        } else {
                           var25 = (var10 & 16711680) >> 16;
                           var26 = (var10 & '\uff00') >> 8;
                           var27 = var10 & 255;
                           var28 = var10 >>> 24;
                           var29 = 256 - var28;

                           for(var30 = -var8; var30 < 0; ++var30) {
                              var31 = (var15 >> 16) * this.anInt8936;

                              for(var32 = -var7; var32 < 0; ++var32) {
                                 if(!var2 || var6 < var39[var20]) {
                                    byte var42 = this.aByteArray11392[(var14 >> 16) + var31];
                                    if(var42 != 0) {
                                       var34 = this.anIntArray11393[var42 & 255];
                                       if(var28 != 255) {
                                          if(var1) {
                                             var35 = (var34 & 16711680) * var25 & -16777216;
                                             var36 = (var34 & '\uff00') * var26 & 16711680;
                                             var37 = (var34 & 255) * var27 & '\uff00';
                                             var34 = (var35 | var36 | var37) >>> 8;
                                             var38 = var23[var20];
                                             var23[var20] = ((var34 & 16711935) * var28 + (var38 & 16711935) * var29 & -16711936) + ((var34 & '\uff00') * var28 + (var38 & '\uff00') * var29 & 16711680) >> 8;
                                          }

                                          if(var2 && var13) {
                                             var39[var20] = var6;
                                          }
                                       } else {
                                          if(var1) {
                                             var35 = (var34 & 16711680) * var25 & -16777216;
                                             var36 = (var34 & '\uff00') * var26 & 16711680;
                                             var37 = (var34 & 255) * var27 & '\uff00';
                                             var23[var20] = (var35 | var36 | var37) >>> 8;
                                          }

                                          if(var2 && var13) {
                                             var39[var20] = var6;
                                          }
                                       }
                                    }
                                 }

                                 var14 += var18;
                                 ++var20;
                              }

                              var15 += var19;
                              var14 = var24;
                              var20 += var21;
                           }
                        }
                     } else if(var9 == 3) {
                        var24 = var14;
                        var25 = var10 >>> 24;
                        var26 = 256 - var25;

                        for(var27 = -var8; var27 < 0; ++var27) {
                           var28 = (var15 >> 16) * this.anInt8936;

                           for(var29 = -var7; var29 < 0; ++var29) {
                              if(!var2 || var6 < var39[var20]) {
                                 if(var1) {
                                    var41 = this.aByteArray11392[(var14 >> 16) + var28];
                                    var31 = var41 > 0?this.anIntArray11393[var41]:0;
                                    var32 = var31 + var10;
                                    var33 = (var31 & 16711935) + (var10 & 16711935);
                                    var34 = (var33 & 16777472) + (var32 - var33 & 65536);
                                    var34 = var32 - var34 | var34 - (var34 >>> 8);
                                    if(var31 == 0 && var25 != 255) {
                                       var31 = var34;
                                       var34 = var23[var20];
                                       var34 = ((var31 & 16711935) * var25 + (var34 & 16711935) * var26 & -16711936) + ((var31 & '\uff00') * var25 + (var34 & '\uff00') * var26 & 16711680) >> 8;
                                    }

                                    var23[var20] = var34;
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }

                              var14 += var18;
                              ++var20;
                           }

                           var15 += var19;
                           var14 = var24;
                           var20 += var21;
                        }
                     } else {
                        if(var9 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var24 = var10 >>> 24;
                        var25 = 256 - var24;
                        var26 = (var10 & 16711935) * var25 & -16711936;
                        var27 = (var10 & '\uff00') * var25 & 16711680;
                        var10 = (var26 | var27) >>> 8;
                        var28 = var14;

                        for(var29 = -var8; var29 < 0; ++var29) {
                           var30 = (var15 >> 16) * this.anInt8936;

                           for(var31 = -var7; var31 < 0; ++var31) {
                              if(!var2 || var6 < var39[var20]) {
                                 var43 = this.aByteArray11392[(var14 >> 16) + var30];
                                 if(var43 != 0) {
                                    if(var1) {
                                       var33 = this.anIntArray11393[var43 & 255];
                                       var26 = (var33 & 16711935) * var24 & -16711936;
                                       var27 = (var33 & '\uff00') * var24 & 16711680;
                                       var23[var20] = ((var26 | var27) >>> 8) + var10;
                                    }

                                    if(var2 && var13) {
                                       var39[var20] = var6;
                                    }
                                 }
                              }

                              var14 += var18;
                              ++var20;
                           }

                           var15 += var19;
                           var14 = var28;
                           var20 += var21;
                        }
                     }
                  }
               } else {
                  if(var11 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              var40 = this.aByteArray11392[(var14 >> 16) + var26];
                              if(var40 != 0) {
                                 if(var1) {
                                    var29 = this.anIntArray11393[var40 & 255];
                                    var30 = var23[var20];
                                    var31 = var29 + var30;
                                    var32 = (var29 & 16711935) + (var30 & 16711935);
                                    var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                    var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else if(var9 == 0) {
                     var24 = var14;
                     var25 = (var10 & 16711680) >> 16;
                     var26 = (var10 & '\uff00') >> 8;
                     var27 = var10 & 255;

                     for(var28 = -var8; var28 < 0; ++var28) {
                        var29 = (var15 >> 16) * this.anInt8936;

                        for(var30 = -var7; var30 < 0; ++var30) {
                           if(!var2 || var6 < var39[var20]) {
                              byte var44 = this.aByteArray11392[(var14 >> 16) + var29];
                              if(var44 != 0) {
                                 if(var1) {
                                    var32 = this.anIntArray11393[var44 & 255];
                                    var33 = (var32 & 16711680) * var25 & -16777216;
                                    var34 = (var32 & '\uff00') * var26 & 16711680;
                                    var35 = (var32 & 255) * var27 & '\uff00';
                                    var32 = (var33 | var34 | var35) >>> 8;
                                    var36 = var23[var20];
                                    var37 = var32 + var36;
                                    var38 = (var32 & 16711935) + (var36 & 16711935);
                                    var36 = (var38 & 16777472) + (var37 - var38 & 65536);
                                    var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else if(var9 == 3) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              if(var1) {
                                 var40 = this.aByteArray11392[(var14 >> 16) + var26];
                                 var29 = var40 > 0?this.anIntArray11393[var40]:0;
                                 var30 = var29 + var10;
                                 var31 = (var29 & 16711935) + (var10 & 16711935);
                                 var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var29 = var30 - var32 | var32 - (var32 >>> 8);
                                 var32 = var23[var20];
                                 var30 = var29 + var32;
                                 var31 = (var29 & 16711935) + (var32 & 16711935);
                                 var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
                              }

                              if(var2 && var13) {
                                 var39[var20] = var6;
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     if(var9 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var24 = var10 >>> 24;
                     var25 = 256 - var24;
                     var26 = (var10 & 16711935) * var25 & -16711936;
                     var27 = (var10 & '\uff00') * var25 & 16711680;
                     var10 = (var26 | var27) >>> 8;
                     var28 = var14;

                     for(var29 = -var8; var29 < 0; ++var29) {
                        var30 = (var15 >> 16) * this.anInt8936;

                        for(var31 = -var7; var31 < 0; ++var31) {
                           if(!var2 || var6 < var39[var20]) {
                              var43 = this.aByteArray11392[(var14 >> 16) + var30];
                              if(var43 != 0) {
                                 if(var1) {
                                    var33 = this.anIntArray11393[var43 & 255];
                                    var26 = (var33 & 16711935) * var24 & -16711936;
                                    var27 = (var33 & '\uff00') * var24 & 16711680;
                                    var33 = ((var26 | var27) >>> 8) + var10;
                                    var34 = var23[var20];
                                    var35 = var33 + var34;
                                    var36 = (var33 & 16711935) + (var34 & 16711935);
                                    var34 = (var36 & 16777472) + (var35 - var36 & 65536);
                                    var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var28;
                        var20 += var21;
                     }
                  }
               }
            }

         }
      }
   }

   void method1775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(var3 > 0 && var4 > 0) {
         int[] var9 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var9 != null) {
            int var10 = 0;
            int var11 = 0;
            int var12 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var13 = this.anInt8941 + this.anInt8936 + this.anInt8934;
            int var14 = this.anInt8958 + this.anInt8944 + this.anInt8935;
            int var15 = (var13 << 16) / var3;
            int var16 = (var14 << 16) / var4;
            int var17;
            if(this.anInt8941 > 0) {
               var17 = ((this.anInt8941 << 16) + var15 - 1) / var15;
               var1 += var17;
               var10 += var17 * var15 - (this.anInt8941 << 16);
            }

            if(this.anInt8958 > 0) {
               var17 = ((this.anInt8958 << 16) + var16 - 1) / var16;
               var2 += var17;
               var11 += var17 * var16 - (this.anInt8958 << 16);
            }

            if(this.anInt8936 < var13) {
               var3 = ((this.anInt8936 << 16) - var10 + var15 - 1) / var15;
            }

            if(this.anInt8944 < var14) {
               var4 = ((this.anInt8944 << 16) - var11 + var16 - 1) / var16;
            }

            var17 = var1 + var2 * var12;
            int var18 = var12 - var3;
            if(var2 + var4 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var4 -= var2 + var4 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            int var19;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var19 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var4 -= var19;
               var17 += var19 * var12;
               var11 += var16 * var19;
            }

            if(var1 + var3 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var19 = var1 + var3 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var3 -= var19;
               var18 += var19;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var19 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var3 -= var19;
               var17 += var19;
               var10 += var15 * var19;
               var18 += var19;
            }

            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            byte var34;
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var21] & 255];
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else if(var5 == 0) {
                  var19 = (var6 & 16711680) >> 16;
                  var20 = (var6 & '\uff00') >> 8;
                  var21 = var6 & 255;
                  var22 = var10;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = (var11 >> 16) * this.anInt8936;

                     for(var25 = -var3; var25 < 0; ++var25) {
                        var26 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var24] & 255];
                        var27 = (var26 & 16711680) * var19 & -16777216;
                        var28 = (var26 & '\uff00') * var20 & 16711680;
                        var29 = (var26 & 255) * var21 & '\uff00';
                        var9[var17++] = (var27 | var28 | var29) >>> 8;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var22;
                     var17 += var18;
                  }
               } else if(var5 == 3) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var34 = this.aByteArray11392[(var10 >> 16) + var21];
                        var24 = var34 > 0?this.anIntArray11393[var34]:0;
                        var25 = var24 + var6;
                        var26 = (var24 & 16711935) + (var6 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var19 = var6 >>> 24;
                  var20 = 256 - var19;
                  var21 = (var6 & 16711935) * var20 & -16711936;
                  var22 = (var6 & '\uff00') * var20 & 16711680;
                  var6 = (var21 | var22) >>> 8;
                  var23 = var10;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     var25 = (var11 >> 16) * this.anInt8936;

                     for(var26 = -var3; var26 < 0; ++var26) {
                        var27 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var25] & 255];
                        var21 = (var27 & 16711935) * var19 & -16711936;
                        var22 = (var27 & '\uff00') * var19 & 16711680;
                        var9[var17++] = ((var21 | var22) >>> 8) + var6;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var23;
                     var17 += var18;
                  }
               }
            } else {
               int var30;
               int var31;
               int var32;
               int var33;
               byte var37;
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var9[var17++] = this.anIntArray11393[var34 & 255];
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     byte var35;
                     if(var5 == 0) {
                        var19 = var10;
                        if((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.anInt8936;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var35 = this.aByteArray11392[(var10 >> 16) + var23];
                                 if(var35 != 0) {
                                    var26 = this.anIntArray11393[var35 & 255];
                                    var27 = var9[var17];
                                    var9[var17++] = ((var26 & 16711935) * var20 + (var27 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var27 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.anInt8936;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 byte var36 = this.aByteArray11392[(var10 >> 16) + var26];
                                 if(var36 != 0) {
                                    var29 = this.anIntArray11393[var36 & 255];
                                    if(var23 != 255) {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var29 = (var30 | var31 | var32) >>> 8;
                                       var33 = var9[var17];
                                       var9[var17++] = ((var29 & 16711935) * var23 + (var33 & 16711935) * var24 & -16711936) + ((var29 & '\uff00') * var23 + (var33 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var30 | var31 | var32) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if(var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var35 = this.aByteArray11392[(var10 >> 16) + var23];
                              var26 = var35 > 0?this.anIntArray11393[var35]:0;
                              var27 = var26 + var6;
                              var28 = (var26 & 16711935) + (var6 & 16711935);
                              var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                              var29 = var27 - var29 | var29 - (var29 >>> 8);
                              if(var26 == 0 && var20 != 255) {
                                 var26 = var29;
                                 var29 = var9[var17];
                                 var29 = ((var26 & 16711935) * var20 + (var29 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var29 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var29;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if(var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.anInt8936;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var37 = this.aByteArray11392[(var10 >> 16) + var25];
                              if(var37 != 0) {
                                 var28 = this.anIntArray11393[var37 & 255];
                                 var21 = (var28 & 16711935) * var19 & -16711936;
                                 var22 = (var28 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var24 = this.anIntArray11393[var34 & 255];
                              var25 = var9[var17];
                              var26 = var24 + var25;
                              var27 = (var24 & 16711935) + (var25 & 16711935);
                              var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 0) {
                     var19 = var10;
                     var20 = (var6 & 16711680) >> 16;
                     var21 = (var6 & '\uff00') >> 8;
                     var22 = var6 & 255;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.anInt8936;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           byte var38 = this.aByteArray11392[(var10 >> 16) + var24];
                           if(var38 != 0) {
                              var27 = this.anIntArray11393[var38 & 255];
                              var28 = (var27 & 16711680) * var20 & -16777216;
                              var29 = (var27 & '\uff00') * var21 & 16711680;
                              var30 = (var27 & 255) * var22 & '\uff00';
                              var27 = (var28 | var29 | var30) >>> 8;
                              var31 = var9[var17];
                              var32 = var27 + var31;
                              var33 = (var27 & 16711935) + (var31 & 16711935);
                              var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                              var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           var24 = var34 > 0?this.anIntArray11393[var34]:0;
                           var25 = var24 + var6;
                           var26 = (var24 & 16711935) + (var6 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var24 = var25 - var27 | var27 - (var27 >>> 8);
                           var27 = var9[var17];
                           var25 = var24 + var27;
                           var26 = (var24 & 16711935) + (var27 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.anInt8936;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var37 = this.aByteArray11392[(var10 >> 16) + var25];
                           if(var37 != 0) {
                              var28 = this.anIntArray11393[var37 & 255];
                              var21 = (var28 & 16711935) * var19 & -16711936;
                              var22 = (var28 & '\uff00') * var19 & 16711680;
                              var28 = ((var21 | var22) >>> 8) + var6;
                              var29 = var9[var17];
                              var30 = var28 + var29;
                              var31 = (var28 & 16711935) + (var29 & 16711935);
                              var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               }
            }

         }
      }
   }

   void method8379(int var1, int var2) {
      int[] var3 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         byte var20;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     for(; var8 < 0; ++var8) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var4;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var19 = (anInt8947 - var19) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if(var7 < 0) {
                        var19 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                     if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var19 = (anInt8933 - var19) / anInt8933;
                        var8 += var19;
                        var6 += anInt8933 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var6 += anInt8933;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var19 = (anInt8947 - var19) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if(var7 < 0) {
                     var19 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953;
               var8 = anInt8946;
               if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                  if(var6 < 0) {
                     var19 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     ++var8;
                  }
               }

               ++var4;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var19 = (anInt8947 - var19) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         } else {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if(var7 < 0) {
                  var19 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         }

      }
   }

   public void method1797(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      throw new IllegalStateException();
   }

   public void method1794(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      throw new IllegalStateException();
   }

   public void method1795(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      throw new IllegalStateException();
   }

   void method8385(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var15;
         int var16;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var9 >= 0 && var10 >= 0 && var9 - (this.anInt8936 << 12) < 0 && var10 - (this.anInt8944 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                           var16 = (anInt8947 - var16) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if(var10 < 0) {
                           var16 = (anInt8947 - 1 - var10) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                        if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                           var16 = (anInt8933 - var16) / anInt8933;
                           var11 += var16;
                           var9 += anInt8933 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var9 += anInt8933;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                        var16 = (anInt8947 - var16) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if(var10 < 0) {
                        var16 = (anInt8947 - 1 - var10) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953;
                  var11 = anInt8946;
                  if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                     if(var9 < 0) {
                        var16 = (anInt8933 - 1 - var9) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        ++var11;
                     }
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                     var16 = (anInt8947 - var16) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if(var10 < 0) {
                     var16 = (anInt8947 - 1 - var10) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         }

      }
   }

   void method1819(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(var3 > 0 && var4 > 0) {
         int[] var9 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var9 != null) {
            int var10 = 0;
            int var11 = 0;
            int var12 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var13 = this.anInt8941 + this.anInt8936 + this.anInt8934;
            int var14 = this.anInt8958 + this.anInt8944 + this.anInt8935;
            int var15 = (var13 << 16) / var3;
            int var16 = (var14 << 16) / var4;
            int var17;
            if(this.anInt8941 > 0) {
               var17 = ((this.anInt8941 << 16) + var15 - 1) / var15;
               var1 += var17;
               var10 += var17 * var15 - (this.anInt8941 << 16);
            }

            if(this.anInt8958 > 0) {
               var17 = ((this.anInt8958 << 16) + var16 - 1) / var16;
               var2 += var17;
               var11 += var17 * var16 - (this.anInt8958 << 16);
            }

            if(this.anInt8936 < var13) {
               var3 = ((this.anInt8936 << 16) - var10 + var15 - 1) / var15;
            }

            if(this.anInt8944 < var14) {
               var4 = ((this.anInt8944 << 16) - var11 + var16 - 1) / var16;
            }

            var17 = var1 + var2 * var12;
            int var18 = var12 - var3;
            if(var2 + var4 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var4 -= var2 + var4 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            int var19;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var19 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var4 -= var19;
               var17 += var19 * var12;
               var11 += var16 * var19;
            }

            if(var1 + var3 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var19 = var1 + var3 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var3 -= var19;
               var18 += var19;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var19 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var3 -= var19;
               var17 += var19;
               var10 += var15 * var19;
               var18 += var19;
            }

            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            byte var34;
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var21] & 255];
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else if(var5 == 0) {
                  var19 = (var6 & 16711680) >> 16;
                  var20 = (var6 & '\uff00') >> 8;
                  var21 = var6 & 255;
                  var22 = var10;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = (var11 >> 16) * this.anInt8936;

                     for(var25 = -var3; var25 < 0; ++var25) {
                        var26 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var24] & 255];
                        var27 = (var26 & 16711680) * var19 & -16777216;
                        var28 = (var26 & '\uff00') * var20 & 16711680;
                        var29 = (var26 & 255) * var21 & '\uff00';
                        var9[var17++] = (var27 | var28 | var29) >>> 8;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var22;
                     var17 += var18;
                  }
               } else if(var5 == 3) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var34 = this.aByteArray11392[(var10 >> 16) + var21];
                        var24 = var34 > 0?this.anIntArray11393[var34]:0;
                        var25 = var24 + var6;
                        var26 = (var24 & 16711935) + (var6 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var19 = var6 >>> 24;
                  var20 = 256 - var19;
                  var21 = (var6 & 16711935) * var20 & -16711936;
                  var22 = (var6 & '\uff00') * var20 & 16711680;
                  var6 = (var21 | var22) >>> 8;
                  var23 = var10;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     var25 = (var11 >> 16) * this.anInt8936;

                     for(var26 = -var3; var26 < 0; ++var26) {
                        var27 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var25] & 255];
                        var21 = (var27 & 16711935) * var19 & -16711936;
                        var22 = (var27 & '\uff00') * var19 & 16711680;
                        var9[var17++] = ((var21 | var22) >>> 8) + var6;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var23;
                     var17 += var18;
                  }
               }
            } else {
               int var30;
               int var31;
               int var32;
               int var33;
               byte var37;
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var9[var17++] = this.anIntArray11393[var34 & 255];
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     byte var35;
                     if(var5 == 0) {
                        var19 = var10;
                        if((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.anInt8936;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var35 = this.aByteArray11392[(var10 >> 16) + var23];
                                 if(var35 != 0) {
                                    var26 = this.anIntArray11393[var35 & 255];
                                    var27 = var9[var17];
                                    var9[var17++] = ((var26 & 16711935) * var20 + (var27 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var27 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.anInt8936;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 byte var36 = this.aByteArray11392[(var10 >> 16) + var26];
                                 if(var36 != 0) {
                                    var29 = this.anIntArray11393[var36 & 255];
                                    if(var23 != 255) {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var29 = (var30 | var31 | var32) >>> 8;
                                       var33 = var9[var17];
                                       var9[var17++] = ((var29 & 16711935) * var23 + (var33 & 16711935) * var24 & -16711936) + ((var29 & '\uff00') * var23 + (var33 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var30 | var31 | var32) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if(var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var35 = this.aByteArray11392[(var10 >> 16) + var23];
                              var26 = var35 > 0?this.anIntArray11393[var35]:0;
                              var27 = var26 + var6;
                              var28 = (var26 & 16711935) + (var6 & 16711935);
                              var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                              var29 = var27 - var29 | var29 - (var29 >>> 8);
                              if(var26 == 0 && var20 != 255) {
                                 var26 = var29;
                                 var29 = var9[var17];
                                 var29 = ((var26 & 16711935) * var20 + (var29 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var29 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var29;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if(var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.anInt8936;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var37 = this.aByteArray11392[(var10 >> 16) + var25];
                              if(var37 != 0) {
                                 var28 = this.anIntArray11393[var37 & 255];
                                 var21 = (var28 & 16711935) * var19 & -16711936;
                                 var22 = (var28 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var24 = this.anIntArray11393[var34 & 255];
                              var25 = var9[var17];
                              var26 = var24 + var25;
                              var27 = (var24 & 16711935) + (var25 & 16711935);
                              var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 0) {
                     var19 = var10;
                     var20 = (var6 & 16711680) >> 16;
                     var21 = (var6 & '\uff00') >> 8;
                     var22 = var6 & 255;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.anInt8936;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           byte var38 = this.aByteArray11392[(var10 >> 16) + var24];
                           if(var38 != 0) {
                              var27 = this.anIntArray11393[var38 & 255];
                              var28 = (var27 & 16711680) * var20 & -16777216;
                              var29 = (var27 & '\uff00') * var21 & 16711680;
                              var30 = (var27 & 255) * var22 & '\uff00';
                              var27 = (var28 | var29 | var30) >>> 8;
                              var31 = var9[var17];
                              var32 = var27 + var31;
                              var33 = (var27 & 16711935) + (var31 & 16711935);
                              var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                              var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           var24 = var34 > 0?this.anIntArray11393[var34]:0;
                           var25 = var24 + var6;
                           var26 = (var24 & 16711935) + (var6 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var24 = var25 - var27 | var27 - (var27 >>> 8);
                           var27 = var9[var17];
                           var25 = var24 + var27;
                           var26 = (var24 & 16711935) + (var27 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.anInt8936;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var37 = this.aByteArray11392[(var10 >> 16) + var25];
                           if(var37 != 0) {
                              var28 = this.anIntArray11393[var37 & 255];
                              var21 = (var28 & 16711935) * var19 & -16711936;
                              var22 = (var28 & '\uff00') * var19 & 16711680;
                              var28 = ((var21 | var22) >>> 8) + var6;
                              var29 = var9[var17];
                              var30 = var28 + var29;
                              var31 = (var28 & 16711935) + (var29 & 16711935);
                              var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               }
            }

         }
      }
   }

   public void method1798(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      throw new IllegalStateException();
   }

   public void method1799(int var1, int var2, int var3, int var4, int var5, int var6) {
      throw new IllegalStateException();
   }

   void method8376(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var15;
         int var16;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var9 >= 0 && var10 >= 0 && var9 - (this.anInt8936 << 12) < 0 && var10 - (this.anInt8944 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                           var16 = (anInt8947 - var16) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if(var10 < 0) {
                           var16 = (anInt8947 - 1 - var10) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                        if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                           var16 = (anInt8933 - var16) / anInt8933;
                           var11 += var16;
                           var9 += anInt8933 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var9 += anInt8933;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                        var16 = (anInt8947 - var16) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if(var10 < 0) {
                        var16 = (anInt8947 - 1 - var10) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953;
                  var11 = anInt8946;
                  if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                     if(var9 < 0) {
                        var16 = (anInt8933 - 1 - var9) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        ++var11;
                     }
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                     var16 = (anInt8947 - var16) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if(var10 < 0) {
                     var16 = (anInt8947 - 1 - var10) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         }

      }
   }

   public void method1800(int var1, int var2, int var3) {
      throw new IllegalStateException();
   }

   public Interface21 method1830() {
      throw new IllegalStateException();
   }

   void method8383(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var15;
         int var16;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var9 >= 0 && var10 >= 0 && var9 - (this.anInt8936 << 12) < 0 && var10 - (this.anInt8944 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                           var16 = (anInt8947 - var16) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if(var10 < 0) {
                           var16 = (anInt8947 - 1 - var10) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                        if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                           var16 = (anInt8933 - var16) / anInt8933;
                           var11 += var16;
                           var9 += anInt8933 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var9 += anInt8933;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                        var16 = (anInt8947 - var16) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if(var10 < 0) {
                        var16 = (anInt8947 - 1 - var10) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953;
                  var11 = anInt8946;
                  if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                     if(var9 < 0) {
                        var16 = (anInt8933 - 1 - var9) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        ++var11;
                     }
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                     var16 = (anInt8947 - var16) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if(var10 < 0) {
                     var16 = (anInt8947 - 1 - var10) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         }

      }
   }

   public void method1770(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var6 != null) {
            int var7 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            var1 += this.anInt8941;
            var2 += this.anInt8958;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.anInt8944;
            int var11 = this.anInt8936;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var14 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var10 -= var14;
               var2 = this.aClass174_Sub1_8932.anInt9267 * 1511023883;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if(var2 + var10 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var10 -= var2 + var10 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var14 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var11 -= var14;
               var1 = this.aClass174_Sub1_8932.anInt9247 * -217416947;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if(var1 + var11 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var14 = var1 + var11 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if(var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var5 == 0) {
                  if(var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if(var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  byte var27;
                  byte var32;
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255] | -16777216;
                                 short var28 = 255;
                                 byte var30 = 0;
                                 var20 = var6[var8];
                                 var6[var8++] = (((var17 & 16711935) * var28 + (var20 & 16711935) * var30 & -16711936) >> 8) + (((var17 & -16711936) >>> 8) * var28 + ((var20 & -16711936) >>> 8) * var30 & -16711936);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        byte var29;
                        if(var3 == 0) {
                           if((var4 & 16777215) == 16777215) {
                              var14 = var4 >>> 24;
                              var15 = 256 - var14;

                              for(var16 = -var10; var16 < 0; ++var16) {
                                 for(var17 = -var11; var17 < 0; ++var17) {
                                    var29 = this.aByteArray11392[var9++];
                                    if(var29 != 0) {
                                       var19 = this.anIntArray11393[var29 & 255];
                                       var20 = var6[var8];
                                       var6[var8++] = ((var19 & 16711935) * var14 + (var20 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var20 & '\uff00') * var15 & 16711680) >> 8;
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           } else {
                              var14 = (var4 & 16711680) >> 16;
                              var15 = (var4 & '\uff00') >> 8;
                              var16 = var4 & 255;
                              var17 = var4 >>> 24;
                              var18 = 256 - var17;

                              for(var19 = -var10; var19 < 0; ++var19) {
                                 for(var20 = -var11; var20 < 0; ++var20) {
                                    byte var31 = this.aByteArray11392[var9++];
                                    if(var31 != 0) {
                                       var22 = this.anIntArray11393[var31 & 255];
                                       if(var17 != 255) {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var22 = (var23 | var24 | var25) >>> 8;
                                          var26 = var6[var8];
                                          var6[var8++] = ((var22 & 16711935) * var17 + (var26 & 16711935) * var18 & -16711936) + ((var22 & '\uff00') * var17 + (var26 & '\uff00') * var18 & 16711680) >> 8;
                                       } else {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var6[var8++] = (var23 | var24 | var25) >>> 8;
                                       }
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           }
                        } else if(var3 == 3) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var29 = this.aByteArray11392[var9++];
                                 var19 = var29 > 0?this.anIntArray11393[var29]:0;
                                 var20 = var19 + var4;
                                 var21 = (var19 & 16711935) + (var4 & 16711935);
                                 var22 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var22 = var20 - var22 | var22 - (var22 >>> 8);
                                 if(var19 == 0 && var14 != 255) {
                                    var19 = var22;
                                    var22 = var6[var8];
                                    var22 = ((var19 & 16711935) * var14 + (var22 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var22 & '\uff00') * var15 & 16711680) >> 8;
                                 }

                                 var6[var8++] = var22;
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           if(var3 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var14 = var4 >>> 24;
                           var15 = 256 - var14;
                           var16 = (var4 & 16711935) * var15 & -16711936;
                           var17 = (var4 & '\uff00') * var15 & 16711680;
                           var4 = (var16 | var17) >>> 8;

                           for(var18 = -var10; var18 < 0; ++var18) {
                              for(var19 = -var11; var19 < 0; ++var19) {
                                 var32 = this.aByteArray11392[var9++];
                                 if(var32 != 0) {
                                    var21 = this.anIntArray11393[var32 & 255];
                                    var16 = (var21 & 16711935) * var14 & -16711936;
                                    var17 = (var21 & '\uff00') * var14 & 16711680;
                                    var6[var8++] = ((var16 | var17) >>> 8) + var4;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255];
                                 var18 = var6[var8];
                                 var19 = var17 + var18;
                                 var20 = (var17 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var6[var8++] = var19 - var18 | var18 - (var18 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              byte var33 = this.aByteArray11392[var9++];
                              if(var33 != 0) {
                                 var20 = this.anIntArray11393[var33 & 255];
                                 var21 = (var20 & 16711680) * var14 & -16777216;
                                 var22 = (var20 & '\uff00') * var15 & 16711680;
                                 var23 = (var20 & 255) * var16 & '\uff00';
                                 var20 = (var21 | var22 | var23) >>> 8;
                                 var24 = var6[var8];
                                 var25 = var20 + var24;
                                 var26 = (var20 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 var6[var8++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              var17 = var27 > 0?this.anIntArray11393[var27]:0;
                              var18 = var17 + var4;
                              var19 = (var17 & 16711935) + (var4 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var17 = var18 - var20 | var20 - (var20 >>> 8);
                              var20 = var6[var8];
                              var18 = var17 + var20;
                              var19 = (var17 & 16711935) + (var20 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var6[var8++] = var18 - var20 | var20 - (var20 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if(var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var32 = this.aByteArray11392[var9++];
                              if(var32 != 0) {
                                 var21 = this.anIntArray11393[var32 & 255];
                                 var16 = (var21 & 16711935) * var14 & -16711936;
                                 var17 = (var21 & '\uff00') * var14 & 16711680;
                                 var21 = ((var16 | var17) >>> 8) + var4;
                                 var22 = var6[var8];
                                 var23 = var21 + var22;
                                 var24 = (var21 & 16711935) + (var22 & 16711935);
                                 var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                                 var6[var8++] = var23 - var22 | var22 - (var22 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public void method1804(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var6 != null) {
            int var7 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            var1 += this.anInt8941;
            var2 += this.anInt8958;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.anInt8944;
            int var11 = this.anInt8936;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var14 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var10 -= var14;
               var2 = this.aClass174_Sub1_8932.anInt9267 * 1511023883;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if(var2 + var10 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var10 -= var2 + var10 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var14 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var11 -= var14;
               var1 = this.aClass174_Sub1_8932.anInt9247 * -217416947;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if(var1 + var11 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var14 = var1 + var11 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if(var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var5 == 0) {
                  if(var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if(var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  byte var27;
                  byte var32;
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255] | -16777216;
                                 short var28 = 255;
                                 byte var30 = 0;
                                 var20 = var6[var8];
                                 var6[var8++] = (((var17 & 16711935) * var28 + (var20 & 16711935) * var30 & -16711936) >> 8) + (((var17 & -16711936) >>> 8) * var28 + ((var20 & -16711936) >>> 8) * var30 & -16711936);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        byte var29;
                        if(var3 == 0) {
                           if((var4 & 16777215) == 16777215) {
                              var14 = var4 >>> 24;
                              var15 = 256 - var14;

                              for(var16 = -var10; var16 < 0; ++var16) {
                                 for(var17 = -var11; var17 < 0; ++var17) {
                                    var29 = this.aByteArray11392[var9++];
                                    if(var29 != 0) {
                                       var19 = this.anIntArray11393[var29 & 255];
                                       var20 = var6[var8];
                                       var6[var8++] = ((var19 & 16711935) * var14 + (var20 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var20 & '\uff00') * var15 & 16711680) >> 8;
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           } else {
                              var14 = (var4 & 16711680) >> 16;
                              var15 = (var4 & '\uff00') >> 8;
                              var16 = var4 & 255;
                              var17 = var4 >>> 24;
                              var18 = 256 - var17;

                              for(var19 = -var10; var19 < 0; ++var19) {
                                 for(var20 = -var11; var20 < 0; ++var20) {
                                    byte var31 = this.aByteArray11392[var9++];
                                    if(var31 != 0) {
                                       var22 = this.anIntArray11393[var31 & 255];
                                       if(var17 != 255) {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var22 = (var23 | var24 | var25) >>> 8;
                                          var26 = var6[var8];
                                          var6[var8++] = ((var22 & 16711935) * var17 + (var26 & 16711935) * var18 & -16711936) + ((var22 & '\uff00') * var17 + (var26 & '\uff00') * var18 & 16711680) >> 8;
                                       } else {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var6[var8++] = (var23 | var24 | var25) >>> 8;
                                       }
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           }
                        } else if(var3 == 3) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var29 = this.aByteArray11392[var9++];
                                 var19 = var29 > 0?this.anIntArray11393[var29]:0;
                                 var20 = var19 + var4;
                                 var21 = (var19 & 16711935) + (var4 & 16711935);
                                 var22 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var22 = var20 - var22 | var22 - (var22 >>> 8);
                                 if(var19 == 0 && var14 != 255) {
                                    var19 = var22;
                                    var22 = var6[var8];
                                    var22 = ((var19 & 16711935) * var14 + (var22 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var22 & '\uff00') * var15 & 16711680) >> 8;
                                 }

                                 var6[var8++] = var22;
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           if(var3 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var14 = var4 >>> 24;
                           var15 = 256 - var14;
                           var16 = (var4 & 16711935) * var15 & -16711936;
                           var17 = (var4 & '\uff00') * var15 & 16711680;
                           var4 = (var16 | var17) >>> 8;

                           for(var18 = -var10; var18 < 0; ++var18) {
                              for(var19 = -var11; var19 < 0; ++var19) {
                                 var32 = this.aByteArray11392[var9++];
                                 if(var32 != 0) {
                                    var21 = this.anIntArray11393[var32 & 255];
                                    var16 = (var21 & 16711935) * var14 & -16711936;
                                    var17 = (var21 & '\uff00') * var14 & 16711680;
                                    var6[var8++] = ((var16 | var17) >>> 8) + var4;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255];
                                 var18 = var6[var8];
                                 var19 = var17 + var18;
                                 var20 = (var17 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var6[var8++] = var19 - var18 | var18 - (var18 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              byte var33 = this.aByteArray11392[var9++];
                              if(var33 != 0) {
                                 var20 = this.anIntArray11393[var33 & 255];
                                 var21 = (var20 & 16711680) * var14 & -16777216;
                                 var22 = (var20 & '\uff00') * var15 & 16711680;
                                 var23 = (var20 & 255) * var16 & '\uff00';
                                 var20 = (var21 | var22 | var23) >>> 8;
                                 var24 = var6[var8];
                                 var25 = var20 + var24;
                                 var26 = (var20 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 var6[var8++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              var17 = var27 > 0?this.anIntArray11393[var27]:0;
                              var18 = var17 + var4;
                              var19 = (var17 & 16711935) + (var4 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var17 = var18 - var20 | var20 - (var20 >>> 8);
                              var20 = var6[var8];
                              var18 = var17 + var20;
                              var19 = (var17 & 16711935) + (var20 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var6[var8++] = var18 - var20 | var20 - (var20 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if(var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var32 = this.aByteArray11392[var9++];
                              if(var32 != 0) {
                                 var21 = this.anIntArray11393[var32 & 255];
                                 var16 = (var21 & 16711935) * var14 & -16711936;
                                 var17 = (var21 & '\uff00') * var14 & 16711680;
                                 var21 = ((var16 | var17) >>> 8) + var4;
                                 var22 = var6[var8];
                                 var23 = var21 + var22;
                                 var24 = (var21 & 16711935) + (var22 & 16711935);
                                 var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                                 var6[var8++] = var23 - var22 | var22 - (var22 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   public void method1815(int var1, int var2, int var3, int var4, int var5, int var6) {
      throw new IllegalStateException();
   }

   public void method1796(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      throw new IllegalStateException();
   }

   void method1808(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(var3 > 0 && var4 > 0) {
         int[] var9 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var9 != null) {
            int var10 = 0;
            int var11 = 0;
            int var12 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var13 = this.anInt8941 + this.anInt8936 + this.anInt8934;
            int var14 = this.anInt8958 + this.anInt8944 + this.anInt8935;
            int var15 = (var13 << 16) / var3;
            int var16 = (var14 << 16) / var4;
            int var17;
            if(this.anInt8941 > 0) {
               var17 = ((this.anInt8941 << 16) + var15 - 1) / var15;
               var1 += var17;
               var10 += var17 * var15 - (this.anInt8941 << 16);
            }

            if(this.anInt8958 > 0) {
               var17 = ((this.anInt8958 << 16) + var16 - 1) / var16;
               var2 += var17;
               var11 += var17 * var16 - (this.anInt8958 << 16);
            }

            if(this.anInt8936 < var13) {
               var3 = ((this.anInt8936 << 16) - var10 + var15 - 1) / var15;
            }

            if(this.anInt8944 < var14) {
               var4 = ((this.anInt8944 << 16) - var11 + var16 - 1) / var16;
            }

            var17 = var1 + var2 * var12;
            int var18 = var12 - var3;
            if(var2 + var4 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var4 -= var2 + var4 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            int var19;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var19 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var4 -= var19;
               var17 += var19 * var12;
               var11 += var16 * var19;
            }

            if(var1 + var3 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var19 = var1 + var3 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var3 -= var19;
               var18 += var19;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var19 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var3 -= var19;
               var17 += var19;
               var10 += var15 * var19;
               var18 += var19;
            }

            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            byte var34;
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var21] & 255];
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else if(var5 == 0) {
                  var19 = (var6 & 16711680) >> 16;
                  var20 = (var6 & '\uff00') >> 8;
                  var21 = var6 & 255;
                  var22 = var10;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = (var11 >> 16) * this.anInt8936;

                     for(var25 = -var3; var25 < 0; ++var25) {
                        var26 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var24] & 255];
                        var27 = (var26 & 16711680) * var19 & -16777216;
                        var28 = (var26 & '\uff00') * var20 & 16711680;
                        var29 = (var26 & 255) * var21 & '\uff00';
                        var9[var17++] = (var27 | var28 | var29) >>> 8;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var22;
                     var17 += var18;
                  }
               } else if(var5 == 3) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var34 = this.aByteArray11392[(var10 >> 16) + var21];
                        var24 = var34 > 0?this.anIntArray11393[var34]:0;
                        var25 = var24 + var6;
                        var26 = (var24 & 16711935) + (var6 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var19 = var6 >>> 24;
                  var20 = 256 - var19;
                  var21 = (var6 & 16711935) * var20 & -16711936;
                  var22 = (var6 & '\uff00') * var20 & 16711680;
                  var6 = (var21 | var22) >>> 8;
                  var23 = var10;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     var25 = (var11 >> 16) * this.anInt8936;

                     for(var26 = -var3; var26 < 0; ++var26) {
                        var27 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var25] & 255];
                        var21 = (var27 & 16711935) * var19 & -16711936;
                        var22 = (var27 & '\uff00') * var19 & 16711680;
                        var9[var17++] = ((var21 | var22) >>> 8) + var6;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var23;
                     var17 += var18;
                  }
               }
            } else {
               int var30;
               int var31;
               int var32;
               int var33;
               byte var37;
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var9[var17++] = this.anIntArray11393[var34 & 255];
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     byte var35;
                     if(var5 == 0) {
                        var19 = var10;
                        if((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.anInt8936;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var35 = this.aByteArray11392[(var10 >> 16) + var23];
                                 if(var35 != 0) {
                                    var26 = this.anIntArray11393[var35 & 255];
                                    var27 = var9[var17];
                                    var9[var17++] = ((var26 & 16711935) * var20 + (var27 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var27 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.anInt8936;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 byte var36 = this.aByteArray11392[(var10 >> 16) + var26];
                                 if(var36 != 0) {
                                    var29 = this.anIntArray11393[var36 & 255];
                                    if(var23 != 255) {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var29 = (var30 | var31 | var32) >>> 8;
                                       var33 = var9[var17];
                                       var9[var17++] = ((var29 & 16711935) * var23 + (var33 & 16711935) * var24 & -16711936) + ((var29 & '\uff00') * var23 + (var33 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var30 | var31 | var32) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if(var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var35 = this.aByteArray11392[(var10 >> 16) + var23];
                              var26 = var35 > 0?this.anIntArray11393[var35]:0;
                              var27 = var26 + var6;
                              var28 = (var26 & 16711935) + (var6 & 16711935);
                              var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                              var29 = var27 - var29 | var29 - (var29 >>> 8);
                              if(var26 == 0 && var20 != 255) {
                                 var26 = var29;
                                 var29 = var9[var17];
                                 var29 = ((var26 & 16711935) * var20 + (var29 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var29 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var29;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if(var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.anInt8936;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var37 = this.aByteArray11392[(var10 >> 16) + var25];
                              if(var37 != 0) {
                                 var28 = this.anIntArray11393[var37 & 255];
                                 var21 = (var28 & 16711935) * var19 & -16711936;
                                 var22 = (var28 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var24 = this.anIntArray11393[var34 & 255];
                              var25 = var9[var17];
                              var26 = var24 + var25;
                              var27 = (var24 & 16711935) + (var25 & 16711935);
                              var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 0) {
                     var19 = var10;
                     var20 = (var6 & 16711680) >> 16;
                     var21 = (var6 & '\uff00') >> 8;
                     var22 = var6 & 255;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.anInt8936;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           byte var38 = this.aByteArray11392[(var10 >> 16) + var24];
                           if(var38 != 0) {
                              var27 = this.anIntArray11393[var38 & 255];
                              var28 = (var27 & 16711680) * var20 & -16777216;
                              var29 = (var27 & '\uff00') * var21 & 16711680;
                              var30 = (var27 & 255) * var22 & '\uff00';
                              var27 = (var28 | var29 | var30) >>> 8;
                              var31 = var9[var17];
                              var32 = var27 + var31;
                              var33 = (var27 & 16711935) + (var31 & 16711935);
                              var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                              var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           var24 = var34 > 0?this.anIntArray11393[var34]:0;
                           var25 = var24 + var6;
                           var26 = (var24 & 16711935) + (var6 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var24 = var25 - var27 | var27 - (var27 >>> 8);
                           var27 = var9[var17];
                           var25 = var24 + var27;
                           var26 = (var24 & 16711935) + (var27 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.anInt8936;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var37 = this.aByteArray11392[(var10 >> 16) + var25];
                           if(var37 != 0) {
                              var28 = this.anIntArray11393[var37 & 255];
                              var21 = (var28 & 16711935) * var19 & -16711936;
                              var22 = (var28 & '\uff00') * var19 & 16711680;
                              var28 = ((var21 | var22) >>> 8) + var6;
                              var29 = var9[var17];
                              var30 = var28 + var29;
                              var31 = (var28 & 16711935) + (var29 & 16711935);
                              var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               }
            }

         }
      }
   }

   public void method1802(int var1, int var2, int var3, int var4, int var5) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var6 != null) {
            int var7 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            var1 += this.anInt8941;
            var2 += this.anInt8958;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.anInt8944;
            int var11 = this.anInt8936;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var14 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var10 -= var14;
               var2 = this.aClass174_Sub1_8932.anInt9267 * 1511023883;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if(var2 + var10 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var10 -= var2 + var10 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var14 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var11 -= var14;
               var1 = this.aClass174_Sub1_8932.anInt9247 * -217416947;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if(var1 + var11 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var14 = var1 + var11 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if(var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var5 == 0) {
                  if(var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11393[this.aByteArray11392[var9++] & 255]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if(var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.anIntArray11393[this.aByteArray11392[var9++] & 255];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  byte var27;
                  byte var32;
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255] | -16777216;
                                 short var28 = 255;
                                 byte var30 = 0;
                                 var20 = var6[var8];
                                 var6[var8++] = (((var17 & 16711935) * var28 + (var20 & 16711935) * var30 & -16711936) >> 8) + (((var17 & -16711936) >>> 8) * var28 + ((var20 & -16711936) >>> 8) * var30 & -16711936);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        byte var29;
                        if(var3 == 0) {
                           if((var4 & 16777215) == 16777215) {
                              var14 = var4 >>> 24;
                              var15 = 256 - var14;

                              for(var16 = -var10; var16 < 0; ++var16) {
                                 for(var17 = -var11; var17 < 0; ++var17) {
                                    var29 = this.aByteArray11392[var9++];
                                    if(var29 != 0) {
                                       var19 = this.anIntArray11393[var29 & 255];
                                       var20 = var6[var8];
                                       var6[var8++] = ((var19 & 16711935) * var14 + (var20 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var20 & '\uff00') * var15 & 16711680) >> 8;
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           } else {
                              var14 = (var4 & 16711680) >> 16;
                              var15 = (var4 & '\uff00') >> 8;
                              var16 = var4 & 255;
                              var17 = var4 >>> 24;
                              var18 = 256 - var17;

                              for(var19 = -var10; var19 < 0; ++var19) {
                                 for(var20 = -var11; var20 < 0; ++var20) {
                                    byte var31 = this.aByteArray11392[var9++];
                                    if(var31 != 0) {
                                       var22 = this.anIntArray11393[var31 & 255];
                                       if(var17 != 255) {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var22 = (var23 | var24 | var25) >>> 8;
                                          var26 = var6[var8];
                                          var6[var8++] = ((var22 & 16711935) * var17 + (var26 & 16711935) * var18 & -16711936) + ((var22 & '\uff00') * var17 + (var26 & '\uff00') * var18 & 16711680) >> 8;
                                       } else {
                                          var23 = (var22 & 16711680) * var14 & -16777216;
                                          var24 = (var22 & '\uff00') * var15 & 16711680;
                                          var25 = (var22 & 255) * var16 & '\uff00';
                                          var6[var8++] = (var23 | var24 | var25) >>> 8;
                                       }
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           }
                        } else if(var3 == 3) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var29 = this.aByteArray11392[var9++];
                                 var19 = var29 > 0?this.anIntArray11393[var29]:0;
                                 var20 = var19 + var4;
                                 var21 = (var19 & 16711935) + (var4 & 16711935);
                                 var22 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var22 = var20 - var22 | var22 - (var22 >>> 8);
                                 if(var19 == 0 && var14 != 255) {
                                    var19 = var22;
                                    var22 = var6[var8];
                                    var22 = ((var19 & 16711935) * var14 + (var22 & 16711935) * var15 & -16711936) + ((var19 & '\uff00') * var14 + (var22 & '\uff00') * var15 & 16711680) >> 8;
                                 }

                                 var6[var8++] = var22;
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           if(var3 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var14 = var4 >>> 24;
                           var15 = 256 - var14;
                           var16 = (var4 & 16711935) * var15 & -16711936;
                           var17 = (var4 & '\uff00') * var15 & 16711680;
                           var4 = (var16 | var17) >>> 8;

                           for(var18 = -var10; var18 < 0; ++var18) {
                              for(var19 = -var11; var19 < 0; ++var19) {
                                 var32 = this.aByteArray11392[var9++];
                                 if(var32 != 0) {
                                    var21 = this.anIntArray11393[var32 & 255];
                                    var16 = (var21 & 16711935) * var14 & -16711936;
                                    var17 = (var21 & '\uff00') * var14 & 16711680;
                                    var6[var8++] = ((var16 | var17) >>> 8) + var4;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray11393[var27 & 255];
                                 var18 = var6[var8];
                                 var19 = var17 + var18;
                                 var20 = (var17 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var6[var8++] = var19 - var18 | var18 - (var18 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              byte var33 = this.aByteArray11392[var9++];
                              if(var33 != 0) {
                                 var20 = this.anIntArray11393[var33 & 255];
                                 var21 = (var20 & 16711680) * var14 & -16777216;
                                 var22 = (var20 & '\uff00') * var15 & 16711680;
                                 var23 = (var20 & 255) * var16 & '\uff00';
                                 var20 = (var21 | var22 | var23) >>> 8;
                                 var24 = var6[var8];
                                 var25 = var20 + var24;
                                 var26 = (var20 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 var6[var8++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var27 = this.aByteArray11392[var9++];
                              var17 = var27 > 0?this.anIntArray11393[var27]:0;
                              var18 = var17 + var4;
                              var19 = (var17 & 16711935) + (var4 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var17 = var18 - var20 | var20 - (var20 >>> 8);
                              var20 = var6[var8];
                              var18 = var17 + var20;
                              var19 = (var17 & 16711935) + (var20 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var6[var8++] = var18 - var20 | var20 - (var20 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if(var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var32 = this.aByteArray11392[var9++];
                              if(var32 != 0) {
                                 var21 = this.anIntArray11393[var32 & 255];
                                 var16 = (var21 & 16711935) * var14 & -16711936;
                                 var17 = (var21 & '\uff00') * var14 & 16711680;
                                 var21 = ((var16 | var17) >>> 8) + var4;
                                 var22 = var6[var8];
                                 var23 = var21 + var22;
                                 var24 = (var21 & 16711935) + (var22 & 16711935);
                                 var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                                 var6[var8++] = var23 - var22 | var22 - (var22 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   void method8382(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      if(var7 > 0 && var8 > 0) {
         if(var1 || var2) {
            int var14 = 0;
            int var15 = 0;
            int var16 = this.anInt8941 + this.anInt8936 + this.anInt8934;
            int var17 = this.anInt8958 + this.anInt8944 + this.anInt8935;
            int var18 = (var16 << 16) / var7;
            int var19 = (var17 << 16) / var8;
            int var20;
            if(this.anInt8941 > 0) {
               var20 = ((this.anInt8941 << 16) + var18 - 1) / var18;
               var4 += var20;
               var14 += var20 * var18 - (this.anInt8941 << 16);
            }

            if(this.anInt8958 > 0) {
               var20 = ((this.anInt8958 << 16) + var19 - 1) / var19;
               var5 += var20;
               var15 += var20 * var19 - (this.anInt8958 << 16);
            }

            if(this.anInt8936 < var16) {
               var7 = ((this.anInt8936 << 16) - var14 + var18 - 1) / var18;
            }

            if(this.anInt8944 < var17) {
               var8 = ((this.anInt8944 << 16) - var15 + var19 - 1) / var19;
            }

            var20 = var4 + var5 * this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var21 = this.aClass174_Sub1_8932.anInt9277 * -2145294317 - var7;
            if(var5 + var8 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var8 -= var5 + var8 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            int var22;
            if(var5 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var22 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var5;
               var8 -= var22;
               var20 += var22 * this.aClass174_Sub1_8932.anInt9277 * -2145294317;
               var15 += var19 * var22;
            }

            if(var4 + var7 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var22 = var4 + var7 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var7 -= var22;
               var21 += var22;
            }

            if(var4 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var22 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var4;
               var7 -= var22;
               var20 += var22;
               var14 += var18 * var22;
               var21 += var22;
            }

            float[] var39 = this.aClass174_Sub1_8932.aFloatArray9246;
            int[] var23 = this.aClass174_Sub1_8932.anIntArray9243;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            int var30;
            int var31;
            int var32;
            int var33;
            int var34;
            byte var40;
            if(var11 == 0) {
               if(var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.anInt8936;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var23[var20] = this.anIntArray11393[this.aByteArray11392[(var14 >> 16) + var26] & 255];
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if(var9 == 0) {
                  var24 = (var10 & 16711680) >> 16;
                  var25 = (var10 & '\uff00') >> 8;
                  var26 = var10 & 255;
                  var27 = var14;

                  for(var28 = -var8; var28 < 0; ++var28) {
                     var29 = (var15 >> 16) * this.anInt8936;

                     for(var30 = -var7; var30 < 0; ++var30) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var31 = this.anIntArray11393[this.aByteArray11392[(var14 >> 16) + var29] & 255];
                              var32 = (var31 & 16711680) * var24 & -16777216;
                              var33 = (var31 & '\uff00') * var25 & 16711680;
                              var34 = (var31 & 255) * var26 & '\uff00';
                              var23[var20] = (var32 | var33 | var34) >>> 8;
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var27;
                     var20 += var21;
                  }
               } else if(var9 == 3) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.anInt8936;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var40 = this.aByteArray11392[(var14 >> 16) + var26];
                              var29 = var40 > 0?this.anIntArray11393[var40]:0;
                              var30 = var29 + var10;
                              var31 = (var29 & 16711935) + (var10 & 16711935);
                              var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else {
                  if(var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var24 = var10 >>> 24;
                  var25 = 256 - var24;
                  var26 = (var10 & 16711935) * var25 & -16711936;
                  var27 = (var10 & '\uff00') * var25 & 16711680;
                  var10 = (var26 | var27) >>> 8;
                  var28 = var14;

                  for(var29 = -var8; var29 < 0; ++var29) {
                     var30 = (var15 >> 16) * this.anInt8936;

                     for(var31 = -var7; var31 < 0; ++var31) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var32 = this.anIntArray11393[this.aByteArray11392[(var14 >> 16) + var30] & 255];
                              var26 = (var32 & 16711935) * var24 & -16711936;
                              var27 = (var32 & '\uff00') * var24 & 16711680;
                              var23[var20] = ((var26 | var27) >>> 8) + var10;
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var28;
                     var20 += var21;
                  }
               }
            } else {
               int var35;
               int var36;
               int var37;
               int var38;
               byte var43;
               if(var11 == 1) {
                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              var40 = this.aByteArray11392[(var14 >> 16) + var26];
                              if(var40 != 0) {
                                 if(var1) {
                                    var23[var20] = this.anIntArray11393[var40 & 255];
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     byte var41;
                     if(var9 == 0) {
                        var24 = var14;
                        if((var10 & 16777215) == 16777215) {
                           var25 = var10 >>> 24;
                           var26 = 256 - var25;

                           for(var27 = -var8; var27 < 0; ++var27) {
                              var28 = (var15 >> 16) * this.anInt8936;

                              for(var29 = -var7; var29 < 0; ++var29) {
                                 if(!var2 || var6 < var39[var20]) {
                                    var41 = this.aByteArray11392[(var14 >> 16) + var28];
                                    if(var41 != 0) {
                                       if(var1) {
                                          var31 = this.anIntArray11393[var41 & 255];
                                          var32 = var23[var20];
                                          var23[var20] = ((var31 & 16711935) * var25 + (var32 & 16711935) * var26 & -16711936) + ((var31 & '\uff00') * var25 + (var32 & '\uff00') * var26 & 16711680) >> 8;
                                       }

                                       if(var2 && var13) {
                                          var39[var20] = var6;
                                       }
                                    }
                                 }

                                 var14 += var18;
                                 ++var20;
                              }

                              var15 += var19;
                              var14 = var24;
                              var20 += var21;
                           }
                        } else {
                           var25 = (var10 & 16711680) >> 16;
                           var26 = (var10 & '\uff00') >> 8;
                           var27 = var10 & 255;
                           var28 = var10 >>> 24;
                           var29 = 256 - var28;

                           for(var30 = -var8; var30 < 0; ++var30) {
                              var31 = (var15 >> 16) * this.anInt8936;

                              for(var32 = -var7; var32 < 0; ++var32) {
                                 if(!var2 || var6 < var39[var20]) {
                                    byte var42 = this.aByteArray11392[(var14 >> 16) + var31];
                                    if(var42 != 0) {
                                       var34 = this.anIntArray11393[var42 & 255];
                                       if(var28 != 255) {
                                          if(var1) {
                                             var35 = (var34 & 16711680) * var25 & -16777216;
                                             var36 = (var34 & '\uff00') * var26 & 16711680;
                                             var37 = (var34 & 255) * var27 & '\uff00';
                                             var34 = (var35 | var36 | var37) >>> 8;
                                             var38 = var23[var20];
                                             var23[var20] = ((var34 & 16711935) * var28 + (var38 & 16711935) * var29 & -16711936) + ((var34 & '\uff00') * var28 + (var38 & '\uff00') * var29 & 16711680) >> 8;
                                          }

                                          if(var2 && var13) {
                                             var39[var20] = var6;
                                          }
                                       } else {
                                          if(var1) {
                                             var35 = (var34 & 16711680) * var25 & -16777216;
                                             var36 = (var34 & '\uff00') * var26 & 16711680;
                                             var37 = (var34 & 255) * var27 & '\uff00';
                                             var23[var20] = (var35 | var36 | var37) >>> 8;
                                          }

                                          if(var2 && var13) {
                                             var39[var20] = var6;
                                          }
                                       }
                                    }
                                 }

                                 var14 += var18;
                                 ++var20;
                              }

                              var15 += var19;
                              var14 = var24;
                              var20 += var21;
                           }
                        }
                     } else if(var9 == 3) {
                        var24 = var14;
                        var25 = var10 >>> 24;
                        var26 = 256 - var25;

                        for(var27 = -var8; var27 < 0; ++var27) {
                           var28 = (var15 >> 16) * this.anInt8936;

                           for(var29 = -var7; var29 < 0; ++var29) {
                              if(!var2 || var6 < var39[var20]) {
                                 if(var1) {
                                    var41 = this.aByteArray11392[(var14 >> 16) + var28];
                                    var31 = var41 > 0?this.anIntArray11393[var41]:0;
                                    var32 = var31 + var10;
                                    var33 = (var31 & 16711935) + (var10 & 16711935);
                                    var34 = (var33 & 16777472) + (var32 - var33 & 65536);
                                    var34 = var32 - var34 | var34 - (var34 >>> 8);
                                    if(var31 == 0 && var25 != 255) {
                                       var31 = var34;
                                       var34 = var23[var20];
                                       var34 = ((var31 & 16711935) * var25 + (var34 & 16711935) * var26 & -16711936) + ((var31 & '\uff00') * var25 + (var34 & '\uff00') * var26 & 16711680) >> 8;
                                    }

                                    var23[var20] = var34;
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }

                              var14 += var18;
                              ++var20;
                           }

                           var15 += var19;
                           var14 = var24;
                           var20 += var21;
                        }
                     } else {
                        if(var9 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var24 = var10 >>> 24;
                        var25 = 256 - var24;
                        var26 = (var10 & 16711935) * var25 & -16711936;
                        var27 = (var10 & '\uff00') * var25 & 16711680;
                        var10 = (var26 | var27) >>> 8;
                        var28 = var14;

                        for(var29 = -var8; var29 < 0; ++var29) {
                           var30 = (var15 >> 16) * this.anInt8936;

                           for(var31 = -var7; var31 < 0; ++var31) {
                              if(!var2 || var6 < var39[var20]) {
                                 var43 = this.aByteArray11392[(var14 >> 16) + var30];
                                 if(var43 != 0) {
                                    if(var1) {
                                       var33 = this.anIntArray11393[var43 & 255];
                                       var26 = (var33 & 16711935) * var24 & -16711936;
                                       var27 = (var33 & '\uff00') * var24 & 16711680;
                                       var23[var20] = ((var26 | var27) >>> 8) + var10;
                                    }

                                    if(var2 && var13) {
                                       var39[var20] = var6;
                                    }
                                 }
                              }

                              var14 += var18;
                              ++var20;
                           }

                           var15 += var19;
                           var14 = var28;
                           var20 += var21;
                        }
                     }
                  }
               } else {
                  if(var11 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              var40 = this.aByteArray11392[(var14 >> 16) + var26];
                              if(var40 != 0) {
                                 if(var1) {
                                    var29 = this.anIntArray11393[var40 & 255];
                                    var30 = var23[var20];
                                    var31 = var29 + var30;
                                    var32 = (var29 & 16711935) + (var30 & 16711935);
                                    var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                    var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else if(var9 == 0) {
                     var24 = var14;
                     var25 = (var10 & 16711680) >> 16;
                     var26 = (var10 & '\uff00') >> 8;
                     var27 = var10 & 255;

                     for(var28 = -var8; var28 < 0; ++var28) {
                        var29 = (var15 >> 16) * this.anInt8936;

                        for(var30 = -var7; var30 < 0; ++var30) {
                           if(!var2 || var6 < var39[var20]) {
                              byte var44 = this.aByteArray11392[(var14 >> 16) + var29];
                              if(var44 != 0) {
                                 if(var1) {
                                    var32 = this.anIntArray11393[var44 & 255];
                                    var33 = (var32 & 16711680) * var25 & -16777216;
                                    var34 = (var32 & '\uff00') * var26 & 16711680;
                                    var35 = (var32 & 255) * var27 & '\uff00';
                                    var32 = (var33 | var34 | var35) >>> 8;
                                    var36 = var23[var20];
                                    var37 = var32 + var36;
                                    var38 = (var32 & 16711935) + (var36 & 16711935);
                                    var36 = (var38 & 16777472) + (var37 - var38 & 65536);
                                    var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else if(var9 == 3) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              if(var1) {
                                 var40 = this.aByteArray11392[(var14 >> 16) + var26];
                                 var29 = var40 > 0?this.anIntArray11393[var40]:0;
                                 var30 = var29 + var10;
                                 var31 = (var29 & 16711935) + (var10 & 16711935);
                                 var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var29 = var30 - var32 | var32 - (var32 >>> 8);
                                 var32 = var23[var20];
                                 var30 = var29 + var32;
                                 var31 = (var29 & 16711935) + (var32 & 16711935);
                                 var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
                              }

                              if(var2 && var13) {
                                 var39[var20] = var6;
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     if(var9 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var24 = var10 >>> 24;
                     var25 = 256 - var24;
                     var26 = (var10 & 16711935) * var25 & -16711936;
                     var27 = (var10 & '\uff00') * var25 & 16711680;
                     var10 = (var26 | var27) >>> 8;
                     var28 = var14;

                     for(var29 = -var8; var29 < 0; ++var29) {
                        var30 = (var15 >> 16) * this.anInt8936;

                        for(var31 = -var7; var31 < 0; ++var31) {
                           if(!var2 || var6 < var39[var20]) {
                              var43 = this.aByteArray11392[(var14 >> 16) + var30];
                              if(var43 != 0) {
                                 if(var1) {
                                    var33 = this.anIntArray11393[var43 & 255];
                                    var26 = (var33 & 16711935) * var24 & -16711936;
                                    var27 = (var33 & '\uff00') * var24 & 16711680;
                                    var33 = ((var26 | var27) >>> 8) + var10;
                                    var34 = var23[var20];
                                    var35 = var33 + var34;
                                    var36 = (var33 & 16711935) + (var34 & 16711935);
                                    var34 = (var36 & 16777472) + (var35 - var36 & 65536);
                                    var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var28;
                        var20 += var21;
                     }
                  }
               }
            }

         }
      }
   }

   void method8387(int var1, int var2) {
      int[] var3 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         byte var20;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     for(; var8 < 0; ++var8) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var4;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var19 = (anInt8947 - var19) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if(var7 < 0) {
                        var19 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                     if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var19 = (anInt8933 - var19) / anInt8933;
                        var8 += var19;
                        var6 += anInt8933 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var6 += anInt8933;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var19 = (anInt8947 - var19) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if(var7 < 0) {
                     var19 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953;
               var8 = anInt8946;
               if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                  if(var6 < 0) {
                     var19 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     ++var8;
                  }
               }

               ++var4;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var19 = (anInt8947 - var19) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         } else {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if(var7 < 0) {
                  var19 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         }

      }
   }

   void method8375(int var1, int var2) {
      int[] var3 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         byte var20;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     for(; var8 < 0; ++var8) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var4;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var19 = (anInt8947 - var19) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if(var7 < 0) {
                        var19 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                     if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var19 = (anInt8933 - var19) / anInt8933;
                        var8 += var19;
                        var6 += anInt8933 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var6 += anInt8933;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var19 = (anInt8947 - var19) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if(var7 < 0) {
                     var19 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953;
               var8 = anInt8946;
               if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                  if(var6 < 0) {
                     var19 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     ++var8;
                  }
               }

               ++var4;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var19 = (anInt8947 - var19) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         } else {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if(var7 < 0) {
                  var19 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         }

      }
   }

   void method8381(int var1, int var2) {
      int[] var3 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         byte var20;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     for(; var8 < 0; ++var8) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var4;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var19 = (anInt8947 - var19) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if(var6 >= 0 && var6 - (this.anInt8936 << 12) < 0) {
                     if(var7 < 0) {
                        var19 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var19;
                        var7 += anInt8947 * var19;
                        var5 += var19;
                     }

                     if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += anInt8947;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                     if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var19 = (anInt8933 - var19) / anInt8933;
                        var8 += var19;
                        var6 += anInt8933 * var19;
                        var5 += var19;
                     }

                     if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var19;
                     }

                     while(var8 < 0) {
                        var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                        var10 = var5++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           } else if(var1 == 0) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711680) * anInt8959 & -16777216;
                              var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                              var14 = (var11 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if(var1 == 3) {
                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = anInt8956;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                              var12 = (var11 & 16711935) * anInt8957 & -16711936;
                              var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var3[var10] = this.anIntArray11393[var20 & 255];
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 if((anInt8956 & 16777215) == 16777215) {
                                    var13 = anInt8956 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if(anInt8957 != 255) {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var10];
                                    var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                    var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                    var15 = (var12 & 255) * anInt8964 & '\uff00';
                                    var3[var10] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = var3[var10];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var20 = this.aByteArray11392[var9];
                              var12 = var20 > 0?this.anIntArray11393[var20]:0;
                              var13 = anInt8956;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if(var12 == 0 && anInt8957 != 255) {
                                 var12 = var16;
                                 var16 = var3[var10];
                                 var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              }

                              var3[var10] = var16;
                           } else if(var1 == 2) {
                              var20 = this.aByteArray11392[var9];
                              if(var20 != 0) {
                                 var12 = this.anIntArray11393[var20 & 255];
                                 var13 = (var12 & 16711935) * anInt8957 & -16711936;
                                 var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + anInt8931;
                                 var15 = var3[var10];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var6 += anInt8933;
                        ++var8;
                     }
                  }

                  ++var4;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var19 = (anInt8947 - var19) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952 + anInt8954;
                  var7 = anInt8953 + anInt8955;
                  var8 = anInt8946;
                  if((var19 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var19 = (anInt8933 - var19) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  if(var7 < 0) {
                     var19 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var7 += anInt8947 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     var7 += anInt8947;
                     ++var8;
                  }

                  ++var4;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953;
               var8 = anInt8946;
               if(var7 >= 0 && var7 - (this.anInt8944 << 12) < 0) {
                  if(var6 < 0) {
                     var19 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var19;
                     var6 += anInt8933 * var19;
                     var5 += var19;
                  }

                  if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var19;
                  }

                  while(var8 < 0) {
                     var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                     var10 = var5++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        } else if(var1 == 0) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711680) * anInt8959 & -16777216;
                           var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                           var14 = (var11 & 255) * anInt8964 & '\uff00';
                           var3[var10] = (var12 | var13 | var14) >>> 8;
                        } else if(var1 == 3) {
                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = anInt8956;
                           var13 = var11 + var12;
                           var14 = (var11 & 16711935) + (var12 & 16711935);
                           var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                           var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                           var12 = (var11 & 16711935) * anInt8957 & -16711936;
                           var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                           var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var3[var10] = this.anIntArray11393[var20 & 255];
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              if((anInt8956 & 16777215) == 16777215) {
                                 var13 = anInt8956 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if(anInt8957 != 255) {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var10];
                                 var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * anInt8959 & -16777216;
                                 var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                                 var15 = (var12 & 255) * anInt8964 & '\uff00';
                                 var3[var10] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = var3[var10];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var20 = this.aByteArray11392[var9];
                           var12 = var20 > 0?this.anIntArray11393[var20]:0;
                           var13 = anInt8956;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if(var12 == 0 && anInt8957 != 255) {
                              var12 = var16;
                              var16 = var3[var10];
                              var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           }

                           var3[var10] = var16;
                        } else if(var1 == 2) {
                           var20 = this.aByteArray11392[var9];
                           if(var20 != 0) {
                              var12 = this.anIntArray11393[var20 & 255];
                              var13 = (var12 & 16711935) * anInt8957 & -16711936;
                              var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + anInt8931;
                              var15 = var3[var10];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += anInt8933;
                     ++var8;
                  }
               }

               ++var4;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if((var19 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var19 = (anInt8947 - var19) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         } else {
            for(var4 = anInt8943; var4 < 0; ++var4) {
               var5 = anInt8945;
               var6 = anInt8952 + anInt8954;
               var7 = anInt8953 + anInt8955;
               var8 = anInt8946;
               if(var6 < 0) {
                  var19 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var19;
               }

               if(var7 < 0) {
                  var19 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var19;
                  var6 += anInt8933 * var19;
                  var7 += anInt8947 * var19;
                  var5 += var19;
               }

               if((var19 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var19;
               }

               while(var8 < 0) {
                  var9 = (var7 >> 12) * this.anInt8936 + (var6 >> 12);
                  var10 = var5++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var10] = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                     } else if(var1 == 0) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711680) * anInt8959 & -16777216;
                        var13 = (var11 & '\uff00') * anInt8960 & 16711680;
                        var14 = (var11 & 255) * anInt8964 & '\uff00';
                        var3[var10] = (var12 | var13 | var14) >>> 8;
                     } else if(var1 == 3) {
                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = anInt8956;
                        var13 = var11 + var12;
                        var14 = (var11 & 16711935) + (var12 & 16711935);
                        var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                        var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var11 = this.anIntArray11393[this.aByteArray11392[var9] & 255];
                        var12 = (var11 & 16711935) * anInt8957 & -16711936;
                        var13 = (var11 & '\uff00') * anInt8957 & 16711680;
                        var3[var10] = ((var12 | var13) >>> 8) + anInt8931;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var3[var10] = this.anIntArray11393[var20 & 255];
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           if((anInt8956 & 16777215) == 16777215) {
                              var13 = anInt8956 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if(anInt8957 != 255) {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var10];
                              var3[var10] = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * anInt8959 & -16777216;
                              var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                              var15 = (var12 & 255) * anInt8964 & '\uff00';
                              var3[var10] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var3[var10++] = ((var13 | var14) >>> 8) + anInt8931;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = var3[var10];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var10] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711680) * anInt8959 & -16777216;
                           var14 = (var12 & '\uff00') * anInt8960 & 16711680;
                           var15 = (var12 & 255) * anInt8964 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var10];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var10] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var20 = this.aByteArray11392[var9];
                        var12 = var20 > 0?this.anIntArray11393[var20]:0;
                        var13 = anInt8956;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if(var12 == 0 && anInt8957 != 255) {
                           var12 = var16;
                           var16 = var3[var10];
                           var16 = ((var12 & 16711935) * anInt8957 + (var16 & 16711935) * anInt8930 & -16711936) + ((var12 & '\uff00') * anInt8957 + (var16 & '\uff00') * anInt8930 & 16711680) >> 8;
                        }

                        var3[var10] = var16;
                     } else if(var1 == 2) {
                        var20 = this.aByteArray11392[var9];
                        if(var20 != 0) {
                           var12 = this.anIntArray11393[var20 & 255];
                           var13 = (var12 & 16711935) * anInt8957 & -16711936;
                           var14 = (var12 & '\uff00') * anInt8957 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + anInt8931;
                           var15 = var3[var10];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += anInt8933;
                  var7 += anInt8947;
                  ++var8;
               }

               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
               anInt8945 += anInt8929;
            }
         }

      }
   }

   void method8386(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var15;
         int var16;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var9 >= 0 && var10 >= 0 && var9 - (this.anInt8936 << 12) < 0 && var10 - (this.anInt8944 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                           var16 = (anInt8947 - var16) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if(var10 < 0) {
                           var16 = (anInt8947 - 1 - var10) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                        if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                           var16 = (anInt8933 - var16) / anInt8933;
                           var11 += var16;
                           var9 += anInt8933 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var9 += anInt8933;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                        var16 = (anInt8947 - var16) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if(var10 < 0) {
                        var16 = (anInt8947 - 1 - var10) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953;
                  var11 = anInt8946;
                  if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                     if(var9 < 0) {
                        var16 = (anInt8933 - 1 - var9) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        ++var11;
                     }
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                     var16 = (anInt8947 - var16) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if(var10 < 0) {
                     var16 = (anInt8947 - 1 - var10) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         }

      }
   }

   void method8384(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var15;
         int var16;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var9 >= 0 && var10 >= 0 && var9 - (this.anInt8936 << 12) < 0 && var10 - (this.anInt8944 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                           var16 = (anInt8947 - var16) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if(var10 < 0) {
                           var16 = (anInt8947 - 1 - var10) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                        if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                           var16 = (anInt8933 - var16) / anInt8933;
                           var11 += var16;
                           var9 += anInt8933 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var9 += anInt8933;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                        var16 = (anInt8947 - var16) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if(var10 < 0) {
                        var16 = (anInt8947 - 1 - var10) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953;
                  var11 = anInt8946;
                  if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                     if(var9 < 0) {
                        var16 = (anInt8933 - 1 - var9) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        ++var11;
                     }
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                     var16 = (anInt8947 - var16) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if(var10 < 0) {
                     var16 = (anInt8947 - 1 - var10) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         }

      }
   }

   void method8380(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var15;
         int var16;
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var9 >= 0 && var10 >= 0 && var9 - (this.anInt8936 << 12) < 0 && var10 - (this.anInt8944 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                           var16 = (anInt8947 - var16) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if(var9 >= 0 && var9 - (this.anInt8936 << 12) < 0) {
                        if(var10 < 0) {
                           var16 = (anInt8947 - 1 - var10) / anInt8947;
                           var11 += var16;
                           var10 += anInt8947 * var16;
                           var8 += var16;
                        }

                        if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt8947;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
               }
            }
         } else if(anInt8933 < 0) {
            if(anInt8947 == 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953;
                     var11 = anInt8946;
                     if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                        if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                           var16 = (anInt8933 - var16) / anInt8933;
                           var11 += var16;
                           var9 += anInt8933 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt8945);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt8933 * var14;
                           var10 += anInt8947 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray11393[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var9 += anInt8933;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt8953 += anInt8949;
               }
            } else if(anInt8947 < 0) {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                        var16 = (anInt8947 - var16) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            } else {
               for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt8945;
                     var9 = anInt8952 + anInt8954;
                     var10 = anInt8953 + anInt8955;
                     var11 = anInt8946;
                     if((var16 = var9 - (this.anInt8936 << 12)) >= 0) {
                        var16 = (anInt8933 - var16) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     if(var10 < 0) {
                        var16 = (anInt8947 - 1 - var10) / anInt8947;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var10 += anInt8947 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        var10 += anInt8947;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt8952 += anInt8948;
                  anInt8953 += anInt8949;
               }
            }
         } else if(anInt8947 == 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953;
                  var11 = anInt8946;
                  if(var10 >= 0 && var10 - (this.anInt8944 << 12) < 0) {
                     if(var9 < 0) {
                        var16 = (anInt8933 - 1 - var9) / anInt8933;
                        var11 += var16;
                        var9 += anInt8933 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt8945);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt8933 * var14;
                        var10 += anInt8947 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray11393[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt8933;
                        ++var11;
                     }
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else if(anInt8947 < 0) {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if((var16 = var10 - (this.anInt8944 << 12)) >= 0) {
                     var16 = (anInt8947 - var16) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (var10 - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         } else {
            for(var6 = anInt8943; var6 < 0; anInt8945 += anInt8929) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt8945;
                  var9 = anInt8952 + anInt8954;
                  var10 = anInt8953 + anInt8955;
                  var11 = anInt8946;
                  if(var9 < 0) {
                     var16 = (anInt8933 - 1 - var9) / anInt8933;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var11) {
                     var11 = var16;
                  }

                  if(var10 < 0) {
                     var16 = (anInt8947 - 1 - var10) / anInt8947;
                     var11 += var16;
                     var9 += anInt8933 * var16;
                     var10 += anInt8947 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var10 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt8945);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt8933 * var14;
                     var10 += anInt8947 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.aByteArray11392[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray11393[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt8933;
                     var10 += anInt8947;
                     ++var11;
                  }
               }

               ++var6;
               anInt8952 += anInt8948;
               anInt8953 += anInt8949;
            }
         }

      }
   }

   void method1807(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(var3 > 0 && var4 > 0) {
         int[] var9 = this.aClass174_Sub1_8932.anIntArray9243;
         if(var9 != null) {
            int var10 = 0;
            int var11 = 0;
            int var12 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            int var13 = this.anInt8941 + this.anInt8936 + this.anInt8934;
            int var14 = this.anInt8958 + this.anInt8944 + this.anInt8935;
            int var15 = (var13 << 16) / var3;
            int var16 = (var14 << 16) / var4;
            int var17;
            if(this.anInt8941 > 0) {
               var17 = ((this.anInt8941 << 16) + var15 - 1) / var15;
               var1 += var17;
               var10 += var17 * var15 - (this.anInt8941 << 16);
            }

            if(this.anInt8958 > 0) {
               var17 = ((this.anInt8958 << 16) + var16 - 1) / var16;
               var2 += var17;
               var11 += var17 * var16 - (this.anInt8958 << 16);
            }

            if(this.anInt8936 < var13) {
               var3 = ((this.anInt8936 << 16) - var10 + var15 - 1) / var15;
            }

            if(this.anInt8944 < var14) {
               var4 = ((this.anInt8944 << 16) - var11 + var16 - 1) / var16;
            }

            var17 = var1 + var2 * var12;
            int var18 = var12 - var3;
            if(var2 + var4 > this.aClass174_Sub1_8932.anInt9250 * -288042733) {
               var4 -= var2 + var4 - this.aClass174_Sub1_8932.anInt9250 * -288042733;
            }

            int var19;
            if(var2 < this.aClass174_Sub1_8932.anInt9267 * 1511023883) {
               var19 = this.aClass174_Sub1_8932.anInt9267 * 1511023883 - var2;
               var4 -= var19;
               var17 += var19 * var12;
               var11 += var16 * var19;
            }

            if(var1 + var3 > this.aClass174_Sub1_8932.anInt9271 * 1270312011) {
               var19 = var1 + var3 - this.aClass174_Sub1_8932.anInt9271 * 1270312011;
               var3 -= var19;
               var18 += var19;
            }

            if(var1 < this.aClass174_Sub1_8932.anInt9247 * -217416947) {
               var19 = this.aClass174_Sub1_8932.anInt9247 * -217416947 - var1;
               var3 -= var19;
               var17 += var19;
               var10 += var15 * var19;
               var18 += var19;
            }

            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            int var25;
            int var26;
            int var27;
            int var28;
            int var29;
            byte var34;
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var21] & 255];
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else if(var5 == 0) {
                  var19 = (var6 & 16711680) >> 16;
                  var20 = (var6 & '\uff00') >> 8;
                  var21 = var6 & 255;
                  var22 = var10;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = (var11 >> 16) * this.anInt8936;

                     for(var25 = -var3; var25 < 0; ++var25) {
                        var26 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var24] & 255];
                        var27 = (var26 & 16711680) * var19 & -16777216;
                        var28 = (var26 & '\uff00') * var20 & 16711680;
                        var29 = (var26 & 255) * var21 & '\uff00';
                        var9[var17++] = (var27 | var28 | var29) >>> 8;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var22;
                     var17 += var18;
                  }
               } else if(var5 == 3) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var34 = this.aByteArray11392[(var10 >> 16) + var21];
                        var24 = var34 > 0?this.anIntArray11393[var34]:0;
                        var25 = var24 + var6;
                        var26 = (var24 & 16711935) + (var6 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var19 = var6 >>> 24;
                  var20 = 256 - var19;
                  var21 = (var6 & 16711935) * var20 & -16711936;
                  var22 = (var6 & '\uff00') * var20 & 16711680;
                  var6 = (var21 | var22) >>> 8;
                  var23 = var10;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     var25 = (var11 >> 16) * this.anInt8936;

                     for(var26 = -var3; var26 < 0; ++var26) {
                        var27 = this.anIntArray11393[this.aByteArray11392[(var10 >> 16) + var25] & 255];
                        var21 = (var27 & 16711935) * var19 & -16711936;
                        var22 = (var27 & '\uff00') * var19 & 16711680;
                        var9[var17++] = ((var21 | var22) >>> 8) + var6;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var23;
                     var17 += var18;
                  }
               }
            } else {
               int var30;
               int var31;
               int var32;
               int var33;
               byte var37;
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var9[var17++] = this.anIntArray11393[var34 & 255];
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     byte var35;
                     if(var5 == 0) {
                        var19 = var10;
                        if((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.anInt8936;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var35 = this.aByteArray11392[(var10 >> 16) + var23];
                                 if(var35 != 0) {
                                    var26 = this.anIntArray11393[var35 & 255];
                                    var27 = var9[var17];
                                    var9[var17++] = ((var26 & 16711935) * var20 + (var27 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var27 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.anInt8936;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 byte var36 = this.aByteArray11392[(var10 >> 16) + var26];
                                 if(var36 != 0) {
                                    var29 = this.anIntArray11393[var36 & 255];
                                    if(var23 != 255) {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var29 = (var30 | var31 | var32) >>> 8;
                                       var33 = var9[var17];
                                       var9[var17++] = ((var29 & 16711935) * var23 + (var33 & 16711935) * var24 & -16711936) + ((var29 & '\uff00') * var23 + (var33 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var30 | var31 | var32) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if(var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var35 = this.aByteArray11392[(var10 >> 16) + var23];
                              var26 = var35 > 0?this.anIntArray11393[var35]:0;
                              var27 = var26 + var6;
                              var28 = (var26 & 16711935) + (var6 & 16711935);
                              var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                              var29 = var27 - var29 | var29 - (var29 >>> 8);
                              if(var26 == 0 && var20 != 255) {
                                 var26 = var29;
                                 var29 = var9[var17];
                                 var29 = ((var26 & 16711935) * var20 + (var29 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var29 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var29;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if(var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.anInt8936;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var37 = this.aByteArray11392[(var10 >> 16) + var25];
                              if(var37 != 0) {
                                 var28 = this.anIntArray11393[var37 & 255];
                                 var21 = (var28 & 16711935) * var19 & -16711936;
                                 var22 = (var28 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var24 = this.anIntArray11393[var34 & 255];
                              var25 = var9[var17];
                              var26 = var24 + var25;
                              var27 = (var24 & 16711935) + (var25 & 16711935);
                              var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 0) {
                     var19 = var10;
                     var20 = (var6 & 16711680) >> 16;
                     var21 = (var6 & '\uff00') >> 8;
                     var22 = var6 & 255;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.anInt8936;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           byte var38 = this.aByteArray11392[(var10 >> 16) + var24];
                           if(var38 != 0) {
                              var27 = this.anIntArray11393[var38 & 255];
                              var28 = (var27 & 16711680) * var20 & -16777216;
                              var29 = (var27 & '\uff00') * var21 & 16711680;
                              var30 = (var27 & 255) * var22 & '\uff00';
                              var27 = (var28 | var29 | var30) >>> 8;
                              var31 = var9[var17];
                              var32 = var27 + var31;
                              var33 = (var27 & 16711935) + (var31 & 16711935);
                              var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                              var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.aByteArray11392[(var10 >> 16) + var21];
                           var24 = var34 > 0?this.anIntArray11393[var34]:0;
                           var25 = var24 + var6;
                           var26 = (var24 & 16711935) + (var6 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var24 = var25 - var27 | var27 - (var27 >>> 8);
                           var27 = var9[var17];
                           var25 = var24 + var27;
                           var26 = (var24 & 16711935) + (var27 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.anInt8936;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var37 = this.aByteArray11392[(var10 >> 16) + var25];
                           if(var37 != 0) {
                              var28 = this.anIntArray11393[var37 & 255];
                              var21 = (var28 & 16711935) * var19 & -16711936;
                              var22 = (var28 & '\uff00') * var19 & 16711680;
                              var28 = ((var21 | var22) >>> 8) + var6;
                              var29 = var9[var17];
                              var30 = var28 + var29;
                              var31 = (var28 & 16711935) + (var29 & 16711935);
                              var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               }
            }

         }
      }
   }

   Class153_Sub1_Sub3(Class174_Sub1 var1, byte[] var2, int[] var3, int var4, int var5) {
      super(var1, var4, var5);
      this.aByteArray11392 = var2;
      this.anIntArray11393 = var3;
   }
}
