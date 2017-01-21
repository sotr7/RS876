package com.jagex;

import com.jagex.Class108;
import com.jagex.Class153_Sub1;
import com.jagex.Class162;
import com.jagex.Class162_Sub2;
import com.jagex.Class174_Sub1;
import com.jagex.Interface21;

public class Class153_Sub1_Sub2 extends Class153_Sub1 {
   int[] anIntArray11364;

   public void method1800(int var1, int var2, int var3) {
      throw new IllegalStateException("");
   }

   Class153_Sub1_Sub2(Class174_Sub1 var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var5, var6);
      if(var7) {
         this.anIntArray11364 = new int[var5 * var6];
      } else {
         this.anIntArray11364 = var2;
      }

      var4 -= this.anInt8936;
      int var8 = 0;

      for(int var9 = 0; var9 < var6; ++var9) {
         for(int var10 = 0; var10 < var5; ++var10) {
            int var11 = var2[var3++];
            if(var11 >>> 24 == 255) {
               this.anIntArray11364[var8++] = (var11 & 16777215) == 0?-16777215:var11;
            } else {
               this.anIntArray11364[var8++] = 0;
            }
         }

         var3 += var4;
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
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
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
                           var19 = this.anIntArray11364[var9++];
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
                           var16 = this.anIntArray11364[var9++];
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
                           var20 = this.anIntArray11364[var9++];
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
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        if((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.anIntArray11364[var9++];
                                 if(var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
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
                                 var21 = this.anIntArray11364[var9++];
                                 if(var21 != 0) {
                                    if(var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
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
                              var18 = this.anIntArray11364[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if(var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
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
                              var19 = this.anIntArray11364[var9++];
                              if(var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
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
                              var16 = this.anIntArray11364[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
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

   public void method1782(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      var7 -= var3;

      for(int var8 = 0; var8 < var4; ++var8) {
         int var9 = (var2 + var8) * var3 + var1;

         for(int var10 = 0; var10 < var3; ++var10) {
            this.anIntArray11364[var9 + var10] = var5[var6++];
         }

         var6 += var7;
      }

   }

   void method10447(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      var7 -= var3;

      for(int var8 = 0; var8 < var4; ++var8) {
         int var9 = (var2 + var8) * var3 + var1;

         for(int var10 = 0; var10 < var3; ++var10) {
            var5[var6++] = this.anIntArray11364[var9 + var10];
         }

         var6 += var7;
      }

   }

   public void method1768(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.method10447(var1, var2, var3, var4, var5, var7, var8);
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
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
                        ++var8;
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
                     if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var9 = (anInt8947 - var9) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                        var9 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var9 = (anInt8933 - var9) / anInt8933;
                        var8 += var9;
                        var6 += anInt8933 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var9 = (anInt8947 - var9) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if(var7 < 0) {
                     var9 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     var9 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var9 = (anInt8947 - var9) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if(var7 < 0) {
                  var9 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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

   public void method1777(int var1, int var2, int var3) {
      throw new IllegalStateException("");
   }

   public Interface21 method1773() {
      return new Class108(this.anInt8936, this.anInt8944, this.anIntArray11364);
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
         int var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
                     int var25 = this.anIntArray11364[var7++];
                     if(var25 != 0) {
                        var6[var13++] = var25;
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
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11364[(var10 >> 16) + var21];
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
                        var26 = this.anIntArray11364[(var10 >> 16) + var24];
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
                        var23 = this.anIntArray11364[(var10 >> 16) + var21];
                        var24 = var23 + var6;
                        var25 = (var23 & 16711935) + (var6 & 16711935);
                        var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                        var27 = this.anIntArray11364[(var10 >> 16) + var25];
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
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var9[var17++] = var23;
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
                     if((var6 & 16777215) == 16777215) {
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.anIntArray11364[(var10 >> 16) + var23];
                              if(var25 != 0) {
                                 var26 = var9[var17];
                                 var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
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
                              var28 = this.anIntArray11364[(var10 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var23 != 255) {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var28 = (var29 | var30 | var31) >>> 8;
                                    var32 = var9[var17];
                                    var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                 } else {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var9[var17++] = (var29 | var30 | var31) >>> 8;
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
                           var25 = this.anIntArray11364[(var10 >> 16) + var23];
                           var26 = var25 + var6;
                           var27 = (var25 & 16711935) + (var6 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var28 = var26 - var28 | var28 - (var28 >>> 8);
                           if(var25 == 0 && var20 != 255) {
                              var25 = var28;
                              var28 = var9[var17];
                              var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                           }

                           var9[var17++] = var28;
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
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
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var24 = var9[var17];
                              var25 = var23 + var24;
                              var26 = (var23 & 16711935) + (var24 & 16711935);
                              var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                              var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
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
                           var26 = this.anIntArray11364[(var10 >> 16) + var24];
                           if(var26 != 0) {
                              var27 = (var26 & 16711680) * var20 & -16777216;
                              var28 = (var26 & '\uff00') * var21 & 16711680;
                              var29 = (var26 & 255) * var22 & '\uff00';
                              var26 = (var27 | var28 | var29) >>> 8;
                              var30 = var9[var17];
                              var31 = var26 + var30;
                              var32 = (var26 & 16711935) + (var30 & 16711935);
                              var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
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
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var23 = var24 - var26 | var26 - (var26 >>> 8);
                           var26 = var9[var17];
                           var24 = var23 + var26;
                           var25 = (var23 & 16711935) + (var26 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
                              var27 = ((var21 | var22) >>> 8) + var6;
                              var28 = var9[var17];
                              var29 = var27 + var28;
                              var30 = (var27 & 16711935) + (var28 & 16711935);
                              var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
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

            float[] var38 = this.aClass174_Sub1_8932.aFloatArray9246;
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
            if(var11 == 0) {
               if(var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.anInt8936;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var23[var20] = this.anIntArray11364[(var14 >> 16) + var26];
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var31 = this.anIntArray11364[(var14 >> 16) + var29];
                              var32 = (var31 & 16711680) * var24 & -16777216;
                              var33 = (var31 & '\uff00') * var25 & 16711680;
                              var34 = (var31 & 255) * var26 & '\uff00';
                              var23[var20] = (var32 | var33 | var34) >>> 8;
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var28 = this.anIntArray11364[(var14 >> 16) + var26];
                              var29 = var28 + var10;
                              var30 = (var28 & 16711935) + (var10 & 16711935);
                              var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var32 = this.anIntArray11364[(var14 >> 16) + var30];
                              var26 = (var32 & 16711935) * var24 & -16711936;
                              var27 = (var32 & '\uff00') * var24 & 16711680;
                              var23[var20] = ((var26 | var27) >>> 8) + var10;
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
               if(var11 == 1) {
                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var38[var20]) {
                              var28 = this.anIntArray11364[(var14 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var1) {
                                    var23[var20] = var28;
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
                     if((var10 & 16777215) == 16777215) {
                        var25 = var10 >>> 24;
                        var26 = 256 - var25;

                        for(var27 = -var8; var27 < 0; ++var27) {
                           var28 = (var15 >> 16) * this.anInt8936;

                           for(var29 = -var7; var29 < 0; ++var29) {
                              if(!var2 || var6 < var38[var20]) {
                                 var30 = this.anIntArray11364[(var14 >> 16) + var28];
                                 if(var30 != 0) {
                                    if(var1) {
                                       var31 = var23[var20];
                                       var23[var20] = ((var30 & 16711935) * var25 + (var31 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var31 & '\uff00') * var26 & 16711680) >> 8;
                                    }

                                    if(var2 && var13) {
                                       var38[var20] = var6;
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
                              if(!var2 || var6 < var38[var20]) {
                                 var33 = this.anIntArray11364[(var14 >> 16) + var31];
                                 if(var33 != 0) {
                                    if(var28 != 255) {
                                       if(var1) {
                                          var34 = (var33 & 16711680) * var25 & -16777216;
                                          var35 = (var33 & '\uff00') * var26 & 16711680;
                                          var36 = (var33 & 255) * var27 & '\uff00';
                                          var33 = (var34 | var35 | var36) >>> 8;
                                          var37 = var23[var20];
                                          var23[var20] = ((var33 & 16711935) * var28 + (var37 & 16711935) * var29 & -16711936) + ((var33 & '\uff00') * var28 + (var37 & '\uff00') * var29 & 16711680) >> 8;
                                       }

                                       if(var2 && var13) {
                                          var38[var20] = var6;
                                       }
                                    } else {
                                       if(var1) {
                                          var34 = (var33 & 16711680) * var25 & -16777216;
                                          var35 = (var33 & '\uff00') * var26 & 16711680;
                                          var36 = (var33 & 255) * var27 & '\uff00';
                                          var23[var20] = (var34 | var35 | var36) >>> 8;
                                       }

                                       if(var2 && var13) {
                                          var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              if(var1) {
                                 var30 = this.anIntArray11364[(var14 >> 16) + var28];
                                 var31 = var30 + var10;
                                 var32 = (var30 & 16711935) + (var10 & 16711935);
                                 var33 = (var32 & 16777472) + (var31 - var32 & 65536);
                                 var33 = var31 - var33 | var33 - (var33 >>> 8);
                                 if(var30 == 0 && var25 != 255) {
                                    var30 = var33;
                                    var33 = var23[var20];
                                    var33 = ((var30 & 16711935) * var25 + (var33 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var33 & '\uff00') * var26 & 16711680) >> 8;
                                 }

                                 var23[var20] = var33;
                              }

                              if(var2 && var13) {
                                 var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              var32 = this.anIntArray11364[(var14 >> 16) + var30];
                              if(var32 != 0) {
                                 if(var1) {
                                    var26 = (var32 & 16711935) * var24 & -16711936;
                                    var27 = (var32 & '\uff00') * var24 & 16711680;
                                    var23[var20] = ((var26 | var27) >>> 8) + var10;
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
               } else {
                  if(var11 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var38[var20]) {
                              var28 = this.anIntArray11364[(var14 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var1) {
                                    var29 = var23[var20];
                                    var30 = var28 + var29;
                                    var31 = (var28 & 16711935) + (var29 & 16711935);
                                    var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                                    var23[var20] = var30 - var29 | var29 - (var29 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              var31 = this.anIntArray11364[(var14 >> 16) + var29];
                              if(var31 != 0) {
                                 if(var1) {
                                    var32 = (var31 & 16711680) * var25 & -16777216;
                                    var33 = (var31 & '\uff00') * var26 & 16711680;
                                    var34 = (var31 & 255) * var27 & '\uff00';
                                    var31 = (var32 | var33 | var34) >>> 8;
                                    var35 = var23[var20];
                                    var36 = var31 + var35;
                                    var37 = (var31 & 16711935) + (var35 & 16711935);
                                    var35 = (var37 & 16777472) + (var36 - var37 & 65536);
                                    var23[var20] = var36 - var35 | var35 - (var35 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              if(var1) {
                                 var28 = this.anIntArray11364[(var14 >> 16) + var26];
                                 var29 = var28 + var10;
                                 var30 = (var28 & 16711935) + (var10 & 16711935);
                                 var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                                 var28 = var29 - var31 | var31 - (var31 >>> 8);
                                 var31 = var23[var20];
                                 var29 = var28 + var31;
                                 var30 = (var28 & 16711935) + (var31 & 16711935);
                                 var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                                 var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                              }

                              if(var2 && var13) {
                                 var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              var32 = this.anIntArray11364[(var14 >> 16) + var30];
                              if(var32 != 0) {
                                 if(var1) {
                                    var26 = (var32 & 16711935) * var24 & -16711936;
                                    var27 = (var32 & '\uff00') * var24 & 16711680;
                                    var32 = ((var26 | var27) >>> 8) + var10;
                                    var33 = var23[var20];
                                    var34 = var32 + var33;
                                    var35 = (var32 & 16711935) + (var33 & 16711935);
                                    var33 = (var35 & 16777472) + (var34 - var35 & 65536);
                                    var23[var20] = var34 - var33 | var33 - (var33 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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

   public void method1794(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      var7 -= var3;

      for(int var8 = 0; var8 < var4; ++var8) {
         int var9 = (var2 + var8) * var3 + var1;

         for(int var10 = 0; var10 < var3; ++var10) {
            this.anIntArray11364[var9 + var10] = var5[var6++];
         }

         var6 += var7;
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
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
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
                           var19 = this.anIntArray11364[var9++];
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
                           var16 = this.anIntArray11364[var9++];
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
                           var20 = this.anIntArray11364[var9++];
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
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        if((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.anIntArray11364[var9++];
                                 if(var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
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
                                 var21 = this.anIntArray11364[var9++];
                                 if(var21 != 0) {
                                    if(var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
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
                              var18 = this.anIntArray11364[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if(var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
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
                              var19 = this.anIntArray11364[var9++];
                              if(var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
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
                              var16 = this.anIntArray11364[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
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

   Class153_Sub1_Sub2(Class174_Sub1 var1, int var2, int var3) {
      super(var1, var2, var3);
      this.anIntArray11364 = new int[var2 * var3];
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
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
                        ++var8;
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
                     if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var9 = (anInt8947 - var9) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                        var9 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var9 = (anInt8933 - var9) / anInt8933;
                        var8 += var9;
                        var6 += anInt8933 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var9 = (anInt8947 - var9) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if(var7 < 0) {
                     var9 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     var9 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var9 = (anInt8947 - var9) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if(var7 < 0) {
                  var9 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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

   public void method1796(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      var7 -= var3;

      for(int var8 = 0; var8 < var4; ++var8) {
         int var9 = (var2 + var8) * var3 + var1;

         for(int var10 = 0; var10 < var3; ++var10) {
            this.anIntArray11364[var9 + var10] = var5[var6++];
         }

         var6 += var7;
      }

   }

   public void method1815(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2 + var8) * this.anInt8936 + var1;
            int var10 = (var6 + var8) * this.aClass174_Sub1_8932.anInt9277 * -2145294317 + var5;

            for(int var11 = 0; var11 < var3; ++var11) {
               this.anIntArray11364[var9 + var11] = var7[var10 + var11];
            }
         }

      }
   }

   public void method1795(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      var7 -= var3;

      for(int var8 = 0; var8 < var4; ++var8) {
         int var9 = (var2 + var8) * var3 + var1;

         for(int var10 = 0; var10 < var3; ++var10) {
            this.anIntArray11364[var9 + var10] = var5[var6++];
         }

         var6 += var7;
      }

   }

   public void method1797(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.method10447(var1, var2, var3, var4, var5, var7, var8);
   }

   public void method1798(int var1, int var2, int var3, int var4, int[] var5, int[] var6, int var7, int var8) {
      this.method10447(var1, var2, var3, var4, var5, var7, var8);
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
         int var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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

   public void method1799(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2 + var8) * this.anInt8936 + var1;
            int var10 = (var6 + var8) * this.aClass174_Sub1_8932.anInt9277 * -2145294317 + var5;

            for(int var11 = 0; var11 < var3; ++var11) {
               this.anIntArray11364[var9 + var11] = var7[var10 + var11];
            }
         }

      }
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
         int var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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

   public Interface21 method1830() {
      return new Class108(this.anInt8936, this.anInt8944, this.anIntArray11364);
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
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
                        ++var8;
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
                     if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var9 = (anInt8947 - var9) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                        var9 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var9 = (anInt8933 - var9) / anInt8933;
                        var8 += var9;
                        var6 += anInt8933 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var9 = (anInt8947 - var9) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if(var7 < 0) {
                     var9 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     var9 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var9 = (anInt8947 - var9) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if(var7 < 0) {
                  var9 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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

   Class153_Sub1_Sub2(Class174_Sub1 var1, int[] var2, int var3, int var4) {
      super(var1, var3, var4);
      this.anIntArray11364 = var2;
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
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
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
                           var19 = this.anIntArray11364[var9++];
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
                           var16 = this.anIntArray11364[var9++];
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
                           var20 = this.anIntArray11364[var9++];
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
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        if((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.anIntArray11364[var9++];
                                 if(var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
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
                                 var21 = this.anIntArray11364[var9++];
                                 if(var21 != 0) {
                                    if(var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
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
                              var18 = this.anIntArray11364[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if(var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
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
                              var19 = this.anIntArray11364[var9++];
                              if(var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
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
                              var16 = this.anIntArray11364[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
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
                     int var25 = this.anIntArray11364[var7++];
                     if(var25 != 0) {
                        var6[var13++] = var25;
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
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11364[(var10 >> 16) + var21];
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
                        var26 = this.anIntArray11364[(var10 >> 16) + var24];
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
                        var23 = this.anIntArray11364[(var10 >> 16) + var21];
                        var24 = var23 + var6;
                        var25 = (var23 & 16711935) + (var6 & 16711935);
                        var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                        var27 = this.anIntArray11364[(var10 >> 16) + var25];
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
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var9[var17++] = var23;
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
                     if((var6 & 16777215) == 16777215) {
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.anIntArray11364[(var10 >> 16) + var23];
                              if(var25 != 0) {
                                 var26 = var9[var17];
                                 var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
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
                              var28 = this.anIntArray11364[(var10 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var23 != 255) {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var28 = (var29 | var30 | var31) >>> 8;
                                    var32 = var9[var17];
                                    var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                 } else {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var9[var17++] = (var29 | var30 | var31) >>> 8;
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
                           var25 = this.anIntArray11364[(var10 >> 16) + var23];
                           var26 = var25 + var6;
                           var27 = (var25 & 16711935) + (var6 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var28 = var26 - var28 | var28 - (var28 >>> 8);
                           if(var25 == 0 && var20 != 255) {
                              var25 = var28;
                              var28 = var9[var17];
                              var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                           }

                           var9[var17++] = var28;
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
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
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var24 = var9[var17];
                              var25 = var23 + var24;
                              var26 = (var23 & 16711935) + (var24 & 16711935);
                              var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                              var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
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
                           var26 = this.anIntArray11364[(var10 >> 16) + var24];
                           if(var26 != 0) {
                              var27 = (var26 & 16711680) * var20 & -16777216;
                              var28 = (var26 & '\uff00') * var21 & 16711680;
                              var29 = (var26 & 255) * var22 & '\uff00';
                              var26 = (var27 | var28 | var29) >>> 8;
                              var30 = var9[var17];
                              var31 = var26 + var30;
                              var32 = (var26 & 16711935) + (var30 & 16711935);
                              var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
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
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var23 = var24 - var26 | var26 - (var26 >>> 8);
                           var26 = var9[var17];
                           var24 = var23 + var26;
                           var25 = (var23 & 16711935) + (var26 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
                              var27 = ((var21 | var22) >>> 8) + var6;
                              var28 = var9[var17];
                              var29 = var27 + var28;
                              var30 = (var27 & 16711935) + (var28 & 16711935);
                              var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
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
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11364[(var10 >> 16) + var21];
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
                        var26 = this.anIntArray11364[(var10 >> 16) + var24];
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
                        var23 = this.anIntArray11364[(var10 >> 16) + var21];
                        var24 = var23 + var6;
                        var25 = (var23 & 16711935) + (var6 & 16711935);
                        var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                        var27 = this.anIntArray11364[(var10 >> 16) + var25];
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
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var9[var17++] = var23;
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
                     if((var6 & 16777215) == 16777215) {
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.anIntArray11364[(var10 >> 16) + var23];
                              if(var25 != 0) {
                                 var26 = var9[var17];
                                 var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
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
                              var28 = this.anIntArray11364[(var10 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var23 != 255) {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var28 = (var29 | var30 | var31) >>> 8;
                                    var32 = var9[var17];
                                    var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                 } else {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var9[var17++] = (var29 | var30 | var31) >>> 8;
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
                           var25 = this.anIntArray11364[(var10 >> 16) + var23];
                           var26 = var25 + var6;
                           var27 = (var25 & 16711935) + (var6 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var28 = var26 - var28 | var28 - (var28 >>> 8);
                           if(var25 == 0 && var20 != 255) {
                              var25 = var28;
                              var28 = var9[var17];
                              var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                           }

                           var9[var17++] = var28;
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
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
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var24 = var9[var17];
                              var25 = var23 + var24;
                              var26 = (var23 & 16711935) + (var24 & 16711935);
                              var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                              var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
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
                           var26 = this.anIntArray11364[(var10 >> 16) + var24];
                           if(var26 != 0) {
                              var27 = (var26 & 16711680) * var20 & -16777216;
                              var28 = (var26 & '\uff00') * var21 & 16711680;
                              var29 = (var26 & 255) * var22 & '\uff00';
                              var26 = (var27 | var28 | var29) >>> 8;
                              var30 = var9[var17];
                              var31 = var26 + var30;
                              var32 = (var26 & 16711935) + (var30 & 16711935);
                              var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
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
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var23 = var24 - var26 | var26 - (var26 >>> 8);
                           var26 = var9[var17];
                           var24 = var23 + var26;
                           var25 = (var23 & 16711935) + (var26 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
                              var27 = ((var21 | var22) >>> 8) + var6;
                              var28 = var9[var17];
                              var29 = var27 + var28;
                              var30 = (var27 & 16711935) + (var28 & 16711935);
                              var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
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
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.anInt8936;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray11364[(var10 >> 16) + var21];
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
                        var26 = this.anIntArray11364[(var10 >> 16) + var24];
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
                        var23 = this.anIntArray11364[(var10 >> 16) + var21];
                        var24 = var23 + var6;
                        var25 = (var23 & 16711935) + (var6 & 16711935);
                        var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                        var27 = this.anIntArray11364[(var10 >> 16) + var25];
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
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var9[var17++] = var23;
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
                     if((var6 & 16777215) == 16777215) {
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.anInt8936;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.anIntArray11364[(var10 >> 16) + var23];
                              if(var25 != 0) {
                                 var26 = var9[var17];
                                 var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
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
                              var28 = this.anIntArray11364[(var10 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var23 != 255) {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var28 = (var29 | var30 | var31) >>> 8;
                                    var32 = var9[var17];
                                    var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                 } else {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var9[var17++] = (var29 | var30 | var31) >>> 8;
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
                           var25 = this.anIntArray11364[(var10 >> 16) + var23];
                           var26 = var25 + var6;
                           var27 = (var25 & 16711935) + (var6 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var28 = var26 - var28 | var28 - (var28 >>> 8);
                           if(var25 == 0 && var20 != 255) {
                              var25 = var28;
                              var28 = var9[var17];
                              var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                           }

                           var9[var17++] = var28;
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
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
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.anInt8936;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var24 = var9[var17];
                              var25 = var23 + var24;
                              var26 = (var23 & 16711935) + (var24 & 16711935);
                              var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                              var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
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
                           var26 = this.anIntArray11364[(var10 >> 16) + var24];
                           if(var26 != 0) {
                              var27 = (var26 & 16711680) * var20 & -16777216;
                              var28 = (var26 & '\uff00') * var21 & 16711680;
                              var29 = (var26 & 255) * var22 & '\uff00';
                              var26 = (var27 | var28 | var29) >>> 8;
                              var30 = var9[var17];
                              var31 = var26 + var30;
                              var32 = (var26 & 16711935) + (var30 & 16711935);
                              var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
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
                           var23 = this.anIntArray11364[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var23 = var24 - var26 | var26 - (var26 >>> 8);
                           var26 = var9[var17];
                           var24 = var23 + var26;
                           var25 = (var23 & 16711935) + (var26 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
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
                           var27 = this.anIntArray11364[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
                              var27 = ((var21 | var22) >>> 8) + var6;
                              var28 = var9[var17];
                              var29 = var27 + var28;
                              var30 = (var27 & 16711935) + (var28 & 16711935);
                              var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
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

            float[] var38 = this.aClass174_Sub1_8932.aFloatArray9246;
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
            if(var11 == 0) {
               if(var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.anInt8936;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var23[var20] = this.anIntArray11364[(var14 >> 16) + var26];
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var31 = this.anIntArray11364[(var14 >> 16) + var29];
                              var32 = (var31 & 16711680) * var24 & -16777216;
                              var33 = (var31 & '\uff00') * var25 & 16711680;
                              var34 = (var31 & 255) * var26 & '\uff00';
                              var23[var20] = (var32 | var33 | var34) >>> 8;
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var28 = this.anIntArray11364[(var14 >> 16) + var26];
                              var29 = var28 + var10;
                              var30 = (var28 & 16711935) + (var10 & 16711935);
                              var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
                        if(!var2 || var6 < var38[var20]) {
                           if(var1) {
                              var32 = this.anIntArray11364[(var14 >> 16) + var30];
                              var26 = (var32 & 16711935) * var24 & -16711936;
                              var27 = (var32 & '\uff00') * var24 & 16711680;
                              var23[var20] = ((var26 | var27) >>> 8) + var10;
                           }

                           if(var2 && var13) {
                              var38[var20] = var6;
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
               if(var11 == 1) {
                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var38[var20]) {
                              var28 = this.anIntArray11364[(var14 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var1) {
                                    var23[var20] = var28;
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
                     if((var10 & 16777215) == 16777215) {
                        var25 = var10 >>> 24;
                        var26 = 256 - var25;

                        for(var27 = -var8; var27 < 0; ++var27) {
                           var28 = (var15 >> 16) * this.anInt8936;

                           for(var29 = -var7; var29 < 0; ++var29) {
                              if(!var2 || var6 < var38[var20]) {
                                 var30 = this.anIntArray11364[(var14 >> 16) + var28];
                                 if(var30 != 0) {
                                    if(var1) {
                                       var31 = var23[var20];
                                       var23[var20] = ((var30 & 16711935) * var25 + (var31 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var31 & '\uff00') * var26 & 16711680) >> 8;
                                    }

                                    if(var2 && var13) {
                                       var38[var20] = var6;
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
                              if(!var2 || var6 < var38[var20]) {
                                 var33 = this.anIntArray11364[(var14 >> 16) + var31];
                                 if(var33 != 0) {
                                    if(var28 != 255) {
                                       if(var1) {
                                          var34 = (var33 & 16711680) * var25 & -16777216;
                                          var35 = (var33 & '\uff00') * var26 & 16711680;
                                          var36 = (var33 & 255) * var27 & '\uff00';
                                          var33 = (var34 | var35 | var36) >>> 8;
                                          var37 = var23[var20];
                                          var23[var20] = ((var33 & 16711935) * var28 + (var37 & 16711935) * var29 & -16711936) + ((var33 & '\uff00') * var28 + (var37 & '\uff00') * var29 & 16711680) >> 8;
                                       }

                                       if(var2 && var13) {
                                          var38[var20] = var6;
                                       }
                                    } else {
                                       if(var1) {
                                          var34 = (var33 & 16711680) * var25 & -16777216;
                                          var35 = (var33 & '\uff00') * var26 & 16711680;
                                          var36 = (var33 & 255) * var27 & '\uff00';
                                          var23[var20] = (var34 | var35 | var36) >>> 8;
                                       }

                                       if(var2 && var13) {
                                          var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              if(var1) {
                                 var30 = this.anIntArray11364[(var14 >> 16) + var28];
                                 var31 = var30 + var10;
                                 var32 = (var30 & 16711935) + (var10 & 16711935);
                                 var33 = (var32 & 16777472) + (var31 - var32 & 65536);
                                 var33 = var31 - var33 | var33 - (var33 >>> 8);
                                 if(var30 == 0 && var25 != 255) {
                                    var30 = var33;
                                    var33 = var23[var20];
                                    var33 = ((var30 & 16711935) * var25 + (var33 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var33 & '\uff00') * var26 & 16711680) >> 8;
                                 }

                                 var23[var20] = var33;
                              }

                              if(var2 && var13) {
                                 var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              var32 = this.anIntArray11364[(var14 >> 16) + var30];
                              if(var32 != 0) {
                                 if(var1) {
                                    var26 = (var32 & 16711935) * var24 & -16711936;
                                    var27 = (var32 & '\uff00') * var24 & 16711680;
                                    var23[var20] = ((var26 | var27) >>> 8) + var10;
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
               } else {
                  if(var11 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.anInt8936;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var38[var20]) {
                              var28 = this.anIntArray11364[(var14 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var1) {
                                    var29 = var23[var20];
                                    var30 = var28 + var29;
                                    var31 = (var28 & 16711935) + (var29 & 16711935);
                                    var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                                    var23[var20] = var30 - var29 | var29 - (var29 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              var31 = this.anIntArray11364[(var14 >> 16) + var29];
                              if(var31 != 0) {
                                 if(var1) {
                                    var32 = (var31 & 16711680) * var25 & -16777216;
                                    var33 = (var31 & '\uff00') * var26 & 16711680;
                                    var34 = (var31 & 255) * var27 & '\uff00';
                                    var31 = (var32 | var33 | var34) >>> 8;
                                    var35 = var23[var20];
                                    var36 = var31 + var35;
                                    var37 = (var31 & 16711935) + (var35 & 16711935);
                                    var35 = (var37 & 16777472) + (var36 - var37 & 65536);
                                    var23[var20] = var36 - var35 | var35 - (var35 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              if(var1) {
                                 var28 = this.anIntArray11364[(var14 >> 16) + var26];
                                 var29 = var28 + var10;
                                 var30 = (var28 & 16711935) + (var10 & 16711935);
                                 var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                                 var28 = var29 - var31 | var31 - (var31 >>> 8);
                                 var31 = var23[var20];
                                 var29 = var28 + var31;
                                 var30 = (var28 & 16711935) + (var31 & 16711935);
                                 var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                                 var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                              }

                              if(var2 && var13) {
                                 var38[var20] = var6;
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
                           if(!var2 || var6 < var38[var20]) {
                              var32 = this.anIntArray11364[(var14 >> 16) + var30];
                              if(var32 != 0) {
                                 if(var1) {
                                    var26 = (var32 & 16711935) * var24 & -16711936;
                                    var27 = (var32 & '\uff00') * var24 & 16711680;
                                    var32 = ((var26 | var27) >>> 8) + var10;
                                    var33 = var23[var20];
                                    var34 = var32 + var33;
                                    var35 = (var32 & 16711935) + (var33 & 16711935);
                                    var33 = (var35 & 16777472) + (var34 - var35 & 65536);
                                    var23[var20] = var34 - var33 | var33 - (var33 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var38[var20] = var6;
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
         if(anInt8933 == 0) {
            if(anInt8947 == 0) {
               for(var4 = anInt8943; var4 < 0; anInt8945 += anInt8929) {
                  var5 = anInt8945;
                  var6 = anInt8952;
                  var7 = anInt8953;
                  var8 = anInt8946;
                  if(var6 >= 0 && var7 >= 0 && var6 - (this.anInt8936 << 12) < 0 && var7 - (this.anInt8944 << 12) < 0) {
                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
                        ++var8;
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
                     if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                        var9 = (anInt8947 - var9) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                        var9 = (anInt8947 - 1 - var7) / anInt8947;
                        var8 += var9;
                        var7 += anInt8947 * var9;
                        var5 += var9;
                     }

                     if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                        var9 = (anInt8933 - var9) / anInt8933;
                        var8 += var9;
                        var6 += anInt8933 * var9;
                        var5 += var9;
                     }

                     if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                     var9 = (anInt8947 - var9) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  if((var9 = var6 - (this.anInt8936 << 12)) >= 0) {
                     var9 = (anInt8933 - var9) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (var6 - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  if(var7 < 0) {
                     var9 = (anInt8947 - 1 - var7) / anInt8947;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var7 += anInt8947 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                     var9 = (anInt8933 - 1 - var6) / anInt8933;
                     var8 += var9;
                     var6 += anInt8933 * var9;
                     var5 += var9;
                  }

                  if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if((var9 = var7 - (this.anInt8944 << 12)) >= 0) {
                  var9 = (anInt8947 - var9) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (var7 - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                  var9 = (anInt8933 - 1 - var6) / anInt8933;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var6 - (this.anInt8936 << 12) - anInt8933) / anInt8933) > var8) {
                  var8 = var9;
               }

               if(var7 < 0) {
                  var9 = (anInt8947 - 1 - var7) / anInt8947;
                  var8 += var9;
                  var6 += anInt8933 * var9;
                  var7 += anInt8947 * var9;
                  var5 += var9;
               }

               if((var9 = (1 + var7 - (this.anInt8944 << 12) - anInt8947) / anInt8947) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  this.method10448((var7 >> 12) * this.anInt8936 + (var6 >> 12), var5++, var3, var1, var2);
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
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                           var6[var8++] = this.anIntArray11364[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.anIntArray11364[var9++]) {
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
                           var19 = this.anIntArray11364[var9++];
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
                           var16 = this.anIntArray11364[var9++];
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
                           var20 = this.anIntArray11364[var9++];
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
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        if((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.anIntArray11364[var9++];
                                 if(var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
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
                                 var21 = this.anIntArray11364[var9++];
                                 if(var21 != 0) {
                                    if(var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
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
                              var18 = this.anIntArray11364[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if(var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.anIntArray11364[var9++];
                              if(var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
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
                              var19 = this.anIntArray11364[var9++];
                              if(var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
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
                              var16 = this.anIntArray11364[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
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
                              var20 = this.anIntArray11364[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
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

   void method10448(int var1, int var2, int[] var3, int var4, int var5) {
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      if(var5 == 0) {
         if(var4 == 1) {
            var3[var2] = this.anIntArray11364[var1];
         } else if(var4 == 0) {
            var6 = this.anIntArray11364[var1++];
            var7 = (var6 & 16711680) * anInt8959 & -16777216;
            var8 = (var6 & '\uff00') * anInt8960 & 16711680;
            var9 = (var6 & 255) * anInt8964 & '\uff00';
            var3[var2] = (var7 | var8 | var9) >>> 8;
         } else if(var4 == 3) {
            var6 = this.anIntArray11364[var1++];
            var7 = anInt8956;
            var8 = var6 + var7;
            var9 = (var6 & 16711935) + (var7 & 16711935);
            var10 = (var9 & 16777472) + (var8 - var9 & 65536);
            var3[var2] = var8 - var10 | var10 - (var10 >>> 8);
         } else {
            if(var4 != 2) {
               throw new IllegalArgumentException();
            }

            var6 = this.anIntArray11364[var1];
            var7 = (var6 & 16711935) * anInt8957 & -16711936;
            var8 = (var6 & '\uff00') * anInt8957 & 16711680;
            var3[var2] = ((var7 | var8) >>> 8) + anInt8931;
         }
      } else if(var5 == 1) {
         if(var4 == 1) {
            var6 = this.anIntArray11364[var1];
            if(var6 != 0) {
               var3[var2] = var6;
            }
         } else if(var4 == 0) {
            var6 = this.anIntArray11364[var1];
            if(var6 != 0) {
               if((anInt8956 & 16777215) == 16777215) {
                  var7 = anInt8956 >>> 24;
                  var8 = 256 - var7;
                  var9 = var3[var2];
                  var3[var2] = ((var6 & 16711935) * var7 + (var9 & 16711935) * var8 & -16711936) + ((var6 & '\uff00') * var7 + (var9 & '\uff00') * var8 & 16711680) >> 8;
               } else if(anInt8957 != 255) {
                  var7 = (var6 & 16711680) * anInt8959 & -16777216;
                  var8 = (var6 & '\uff00') * anInt8960 & 16711680;
                  var9 = (var6 & 255) * anInt8964 & '\uff00';
                  var6 = (var7 | var8 | var9) >>> 8;
                  var10 = var3[var2];
                  var3[var2] = ((var6 & 16711935) * anInt8957 + (var10 & 16711935) * anInt8930 & -16711936) + ((var6 & '\uff00') * anInt8957 + (var10 & '\uff00') * anInt8930 & 16711680) >> 8;
               } else {
                  var7 = (var6 & 16711680) * anInt8959 & -16777216;
                  var8 = (var6 & '\uff00') * anInt8960 & 16711680;
                  var9 = (var6 & 255) * anInt8964 & '\uff00';
                  var3[var2] = (var7 | var8 | var9) >>> 8;
               }
            }
         } else if(var4 == 3) {
            var6 = this.anIntArray11364[var1];
            var7 = anInt8956;
            var8 = var6 + var7;
            var9 = (var6 & 16711935) + (var7 & 16711935);
            var10 = (var9 & 16777472) + (var8 - var9 & 65536);
            var10 = var8 - var10 | var10 - (var10 >>> 8);
            if(var6 == 0 && anInt8957 != 255) {
               var6 = var10;
               var10 = var3[var2];
               var10 = ((var6 & 16711935) * anInt8957 + (var10 & 16711935) * anInt8930 & -16711936) + ((var6 & '\uff00') * anInt8957 + (var10 & '\uff00') * anInt8930 & 16711680) >> 8;
            }

            var3[var2] = var10;
         } else {
            if(var4 != 2) {
               throw new IllegalArgumentException();
            }

            var6 = this.anIntArray11364[var1];
            if(var6 != 0) {
               var7 = (var6 & 16711935) * anInt8957 & -16711936;
               var8 = (var6 & '\uff00') * anInt8957 & 16711680;
               var3[var2++] = ((var7 | var8) >>> 8) + anInt8931;
            }
         }
      } else {
         if(var5 != 2) {
            throw new IllegalArgumentException();
         }

         if(var4 == 1) {
            var6 = this.anIntArray11364[var1];
            if(var6 != 0) {
               var7 = var3[var2];
               var8 = var6 + var7;
               var9 = (var6 & 16711935) + (var7 & 16711935);
               var7 = (var9 & 16777472) + (var8 - var9 & 65536);
               var3[var2] = var8 - var7 | var7 - (var7 >>> 8);
            }
         } else {
            int var11;
            if(var4 == 0) {
               var6 = this.anIntArray11364[var1];
               if(var6 != 0) {
                  var7 = (var6 & 16711680) * anInt8959 & -16777216;
                  var8 = (var6 & '\uff00') * anInt8960 & 16711680;
                  var9 = (var6 & 255) * anInt8964 & '\uff00';
                  var6 = (var7 | var8 | var9) >>> 8;
                  var10 = var3[var2];
                  var11 = var6 + var10;
                  int var12 = (var6 & 16711935) + (var10 & 16711935);
                  var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                  var3[var2] = var11 - var10 | var10 - (var10 >>> 8);
               }
            } else if(var4 == 3) {
               var6 = this.anIntArray11364[var1];
               var7 = anInt8956;
               var8 = var6 + var7;
               var9 = (var6 & 16711935) + (var7 & 16711935);
               var10 = (var9 & 16777472) + (var8 - var9 & 65536);
               var6 = var8 - var10 | var10 - (var10 >>> 8);
               var10 = var3[var2];
               var8 = var6 + var10;
               var9 = (var6 & 16711935) + (var10 & 16711935);
               var10 = (var9 & 16777472) + (var8 - var9 & 65536);
               var3[var2] = var8 - var10 | var10 - (var10 >>> 8);
            } else if(var4 == 2) {
               var6 = this.anIntArray11364[var1];
               if(var6 != 0) {
                  var7 = (var6 & 16711935) * anInt8957 & -16711936;
                  var8 = (var6 & '\uff00') * anInt8957 & 16711680;
                  var6 = ((var7 | var8) >>> 8) + anInt8931;
                  var9 = var3[var2];
                  var10 = var6 + var9;
                  var11 = (var6 & 16711935) + (var9 & 16711935);
                  var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                  var3[var2] = var10 - var9 | var9 - (var9 >>> 8);
               }
            }
         }
      }

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
         int var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
         int var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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

   void method10449(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      var7 -= var3;

      for(int var8 = 0; var8 < var4; ++var8) {
         int var9 = (var2 + var8) * var3 + var1;

         for(int var10 = 0; var10 < var3; ++var10) {
            var5[var6++] = this.anIntArray11364[var9 + var10];
         }

         var6 += var7;
      }

   }

   public void method1776(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.aClass174_Sub1_8932.anIntArray9243;
      if(var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2 + var8) * this.anInt8936 + var1;
            int var10 = (var6 + var8) * this.aClass174_Sub1_8932.anInt9277 * -2145294317 + var5;

            for(int var11 = 0; var11 < var3; ++var11) {
               this.anIntArray11364[var9 + var11] = var7[var10 + var11];
            }
         }

      }
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
         int var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                           var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                        var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
                     var15 = this.anIntArray11364[(var10 >> 12) * this.anInt8936 + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = var15;
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
}
