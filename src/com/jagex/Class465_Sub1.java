package com.jagex;

import com.jagex.Class148;
import com.jagex.Class174;
import com.jagex.Class230;
import com.jagex.Class234;
import com.jagex.Class292;
import com.jagex.Class323;
import com.jagex.Class408;
import com.jagex.Class40_Sub1;
import com.jagex.Class40_Sub8;
import com.jagex.Class411;
import com.jagex.Class427;
import com.jagex.Class465;
import com.jagex.Class470;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.RSByteBuffer;
import com.jagex.Class549;
import com.jagex.Class556;
import com.jagex.Class575;
import com.jagex.Class588;
import com.jagex.Class59;
import com.jagex.Class594;
import com.jagex.Class602;
import com.jagex.Class610;
import com.jagex.Class623;
import com.jagex.Class634;
import com.jagex.Class639_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class639_Sub1_Sub2_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub3;
import com.jagex.Class639_Sub1_Sub3;
import com.jagex.Class639_Sub1_Sub3_Sub1;
import com.jagex.Class639_Sub1_Sub3_Sub2;
import com.jagex.Class639_Sub1_Sub5;
import com.jagex.Class639_Sub1_Sub5_Sub1;
import com.jagex.Class639_Sub1_Sub5_Sub2;
import com.jagex.Class709;
import com.jagex.Class84;
import com.jagex.Interface59;
import com.jagex.client;

public class Class465_Sub1 extends Class465 {
   static final int anInt10318 = 0;
   static final int anInt10320 = 2;
   static final int anInt10321 = 3;
   static final int anInt10327 = 1;
   int anInt10323 = 1493517619;
   static boolean aBool10325 = false;
   static boolean aBool10317 = false;
   static int[] anIntArray10322 = new int[]{1, 0, -1, 0};
   static int[] anIntArray10326 = new int[]{0, -1, 0, 1};
   static int[] anIntArray10319 = new int[]{1, -1, -1, 1};
   static int[] anIntArray10324 = new int[]{-1, -1, 1, 1};
   Class40_Sub8 aClass40_Sub8_10328;
   Class623 aClass623_10316;

   public final void method9269(Class174 var1, RSByteBuffer var2, int var3, int var4, int var5) {
      if(!this.aBool5246) {
         var2.pos += 2120844024;
         boolean var6 = false;
         Class634 var7 = null;
         boolean var8 = false;

         while(true) {
            int var9;
            int var10;
            int var12;
            int var13;
            int var18;
            while(301018015 * var2.pos < var2.buffer.length) {
               var9 = var2.readUnsignedByte(-948084577);
               if(var9 == 0) {
                  if(var7 == null) {
                     var7 = new Class634(var2, this.aClass623_10316);
                  } else {
                     var7.method7534(var2, this.aClass623_10316, -1856281386);
                  }
               } else {
                  int var14;
                  int var15;
                  int var16;
                  if(var9 == 1) {
                     var10 = var2.readUnsignedByte(-369030976);
                     if(var10 > 0) {
                        for(var18 = 0; var18 < var10; ++var18) {
                           Class556 var20 = new Class556(var1, this.aClass549_5252.anInt7316 * 1705818315, var2, 2);
                           if(31 == 447692401 * var20.anInt7497) {
                              Class84 var21 = (Class84)Class40_Sub1.aClass40_Sub21_10958.method89(var2.readUnsignedShort(2141876888), -703294758);
                              var20.method6700(316704871 * var21.anInt849, -568979193 * var21.anInt847, 468356897 * var21.anInt850, var21.anInt848 * 278225841, (byte)100);
                           }

                           if(var1.method2334() > 0) {
                              Class526_Sub16 var22 = var20.aClass526_Sub16_7504;
                              var14 = var22.method9390((byte)-36) + (var3 << 9);
                              var15 = var22.method9392((byte)-21) + (var4 << 9);
                              var16 = var14 >> 9;
                              int var17 = var15 >> 9;
                              if(var16 >= 0 && var17 >= 0 && var16 < this.anInt5244 * -1225795677 && var17 < this.anInt5245 * -1769380583) {
                                 var22.method9397(var14, this.anIntArrayArrayArray5312[var20.anInt7507 * 130215759][var16][var17] - var22.method9391(469914746), var15, -1926451634);
                                 this.aClass549_5252.method6602(var20, 513069995);
                              }
                           }
                        }
                     }
                  } else if(var9 == 2) {
                     if(null == var7) {
                        var7 = new Class634();
                     }

                     var7.method7535(var2, (short)4096);
                  } else if(var9 == 3) {
                     if(var7 == null) {
                        var7 = new Class634();
                     }

                     var7.method7533(var2, (short)16875);
                  } else if(128 == var9) {
                     if(null == var7) {
                        var7 = new Class634();
                     }

                     var7.method7544(var2, this.aClass623_10316, -2037209621);
                  } else if(129 != var9) {
                     if(var9 != 130) {
                        throw new IllegalStateException("");
                     }

                     var8 = true;
                  } else {
                     if(this.aByteArrayArrayArray5248 == null) {
                        this.aByteArrayArrayArray5248 = new byte[4][][];
                     }

                     for(var10 = 0; var10 < 4; ++var10) {
                        byte var11 = var2.readByte((byte)80);
                        if(var11 == 0 && this.aByteArrayArrayArray5248[var10] != null) {
                           var12 = var3;
                           var13 = var3 + 64;
                           var14 = var4;
                           var15 = 64 + var4;
                           if(var3 < 0) {
                              var12 = 0;
                           } else if(var3 >= this.anInt5244 * -1225795677) {
                              var12 = this.anInt5244 * -1225795677;
                           }

                           if(var13 < 0) {
                              var13 = 0;
                           } else if(var13 >= this.anInt5244 * -1225795677) {
                              var13 = this.anInt5244 * -1225795677;
                           }

                           if(var4 < 0) {
                              var14 = 0;
                           } else if(var4 >= -1769380583 * this.anInt5245) {
                              var14 = this.anInt5245 * -1769380583;
                           }

                           if(var15 < 0) {
                              var15 = 0;
                           } else if(var15 >= this.anInt5245 * -1769380583) {
                              var15 = -1769380583 * this.anInt5245;
                           }

                           while(var12 < var13) {
                              while(var14 < var15) {
                                 this.aByteArrayArrayArray5248[var10][var12][var14] = 0;
                                 ++var14;
                              }

                              ++var12;
                           }
                        } else if(var11 == 1) {
                           if(null == this.aByteArrayArrayArray5248[var10]) {
                              this.aByteArrayArrayArray5248[var10] = new byte[-1225795677 * this.anInt5244 + 1][1 + this.anInt5245 * -1769380583];
                           }

                           for(var12 = 0; var12 < 64; var12 += 4) {
                              for(var13 = 0; var13 < 64; var13 += 4) {
                                 byte var19 = var2.readByte((byte)51);

                                 for(var15 = var3 + var12; var15 < 4 + var3 + var12; ++var15) {
                                    for(var16 = var13 + var4; var16 < 4 + var4 + var13; ++var16) {
                                       if(var15 >= 0 && var15 < this.anInt5244 * -1225795677 && var16 >= 0 && var16 < -1769380583 * this.anInt5245) {
                                          this.aByteArrayArrayArray5248[var10][var15][var16] = var19;
                                       }
                                    }
                                 }
                              }
                           }
                        } else if(2 == var11) {
                           if(null == this.aByteArrayArrayArray5248[var10]) {
                              this.aByteArrayArrayArray5248[var10] = new byte[this.anInt5244 * -1225795677 + 1][this.anInt5245 * -1769380583 + 1];
                           }

                           if(var10 > 0) {
                              var12 = var3;
                              var13 = 64 + var3;
                              var14 = var4;
                              var15 = 64 + var4;
                              if(var3 < 0) {
                                 var12 = 0;
                              } else if(var3 >= -1225795677 * this.anInt5244) {
                                 var12 = -1225795677 * this.anInt5244;
                              }

                              if(var13 < 0) {
                                 var13 = 0;
                              } else if(var13 >= -1225795677 * this.anInt5244) {
                                 var13 = -1225795677 * this.anInt5244;
                              }

                              if(var4 < 0) {
                                 var14 = 0;
                              } else if(var4 >= -1769380583 * this.anInt5245) {
                                 var14 = -1769380583 * this.anInt5245;
                              }

                              if(var15 < 0) {
                                 var15 = 0;
                              } else if(var15 >= this.anInt5245 * -1769380583) {
                                 var15 = this.anInt5245 * -1769380583;
                              }

                              while(var12 < var13) {
                                 while(var14 < var15) {
                                    this.aByteArrayArrayArray5248[var10][var12][var14] = this.aByteArrayArrayArray5248[var10 - 1][var12][var14];
                                    ++var14;
                                 }

                                 ++var12;
                              }
                           }
                        }
                     }

                     var6 = true;
                  }
               }
            }

            for(var9 = 0; var9 < 8; ++var9) {
               for(var10 = 0; var10 < 8; ++var10) {
                  var18 = (var3 >> 3) + var9;
                  var12 = (var4 >> 3) + var10;
                  if(var18 >= 0 && var18 < -1225795677 * this.anInt5244 >> 3 && var12 >= 0 && var12 < this.anInt5245 * -1769380583 >> 3) {
                     if(var7 != null) {
                        this.aClass623_10316.method7372(var18, var12, var7, 700457684);
                     }

                     Class411.method4904(var18, var12, var8, (byte)-127);
                  }
               }
            }

            if(!var6 && this.aByteArrayArrayArray5248 != null) {
               for(var9 = 0; var9 < 4; ++var9) {
                  if(this.aByteArrayArrayArray5248[var9] != null) {
                     for(var10 = 0; var10 < 16; ++var10) {
                        for(var18 = 0; var18 < 16; ++var18) {
                           var12 = var10 + (var3 >> 2);
                           var13 = (var4 >> 2) + var18;
                           if(var12 >= 0 && var12 < 26 && var13 >= 0 && var13 < 26) {
                              this.aByteArrayArrayArray5248[var9][var12][var13] = 0;
                           }
                        }
                     }
                  }
               }
            }

            return;
         }
      }
   }

   public final void method9270(Class174 var1, RSByteBuffer var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(!this.aBool5246) {
         var2.pos += 2120844024;
         boolean var11 = false;
         Class634 var12 = null;
         boolean var13 = false;
         int var14 = 8 * (var7 & 7);
         int var15 = (var8 & 7) * 8;

         while(true) {
            int var16;
            int var17;
            int var19;
            int var26;
            while(301018015 * var2.pos < var2.buffer.length) {
               var16 = var2.readUnsignedByte(-2086826252);
               if(var16 == 0) {
                  if(var12 == null) {
                     var12 = new Class634(var2, this.aClass623_10316);
                  } else {
                     var12.method7534(var2, this.aClass623_10316, -1110123280);
                  }
               } else {
                  int var22;
                  int var23;
                  int var24;
                  int var28;
                  if(var16 == 1) {
                     var17 = var2.readUnsignedByte(1288179443);
                     if(var17 > 0) {
                        for(var26 = 0; var26 < var17; ++var26) {
                           Class556 var27 = new Class556(var1, 1705818315 * this.aClass549_5252.anInt7316, var2, 2);
                           if(var27.anInt7497 * 447692401 == 31) {
                              Class84 var29 = (Class84)Class40_Sub1.aClass40_Sub21_10958.method89(var2.readUnsignedShort(2138677767), -2065826917);
                              var27.method6700(316704871 * var29.anInt849, -568979193 * var29.anInt847, var29.anInt850 * 468356897, var29.anInt848 * 278225841, (byte)65);
                           }

                           if(var1.method2334() > 0) {
                              Class526_Sub16 var30 = var27.aClass526_Sub16_7504;
                              var28 = var30.method9390((byte)-124) >> 9;
                              var22 = var30.method9392((byte)-38) >> 9;
                              if(var27.anInt7507 * 130215759 == var6 && var28 >= var14 && var28 < 8 + var14 && var22 >= var15 && var22 < var15 + 8) {
                                 var23 = (var4 << 9) + Class292.method3945(var30.method9390((byte)-67) & 4095, var30.method9392((byte)-27) & 4095, var9, 422403810);
                                 var24 = (var5 << 9) + Class549.method6637(var30.method9390((byte)-100) & 4095, var30.method9392((byte)-2) & 4095, var9, -2140565388);
                                 var28 = var23 >> 9;
                                 var22 = var24 >> 9;
                                 if(var28 >= 0 && var22 >= 0 && var28 < -1225795677 * this.anInt5244 && var22 < -1769380583 * this.anInt5245) {
                                    var27.anInt7507 = -1932998737 * var3;
                                    var30.method9397(var23, this.anIntArrayArrayArray5312[var27.anInt7507 * 130215759][var28][var22] - var30.method9391(-47222028), var24, -1764189131);
                                    this.aClass549_5252.method6602(var27, 513069995);
                                 }
                              }
                           }
                        }
                     }
                  } else if(2 == var16) {
                     if(null == var12) {
                        var12 = new Class634();
                     }

                     var12.method7535(var2, (short)4096);
                  } else if(3 == var16) {
                     if(var12 == null) {
                        var12 = new Class634();
                     }

                     var12.method7533(var2, (short)-3597);
                  } else if(var16 == 128) {
                     if(null == var12) {
                        var12 = new Class634();
                     }

                     var12.method7544(var2, this.aClass623_10316, -2055143414);
                  } else if(129 != var16) {
                     if(130 != var16) {
                        throw new IllegalStateException("");
                     }

                     var13 = true;
                  } else {
                     if(this.aByteArrayArrayArray5248 == null) {
                        this.aByteArrayArrayArray5248 = new byte[4][][];
                     }

                     for(var17 = 0; var17 < 4; ++var17) {
                        byte var18 = var2.readByte((byte)96);
                        int var20;
                        if(0 == var18 && this.aByteArrayArrayArray5248[var3] != null) {
                           if(var17 <= var6) {
                              var19 = var4;
                              var20 = var4 + 7;
                              var28 = var5;
                              var22 = 7 + var5;
                              if(var4 < 0) {
                                 var19 = 0;
                              } else if(var4 >= -1225795677 * this.anInt5244) {
                                 var19 = -1225795677 * this.anInt5244;
                              }

                              if(var20 < 0) {
                                 var20 = 0;
                              } else if(var20 >= this.anInt5244 * -1225795677) {
                                 var20 = -1225795677 * this.anInt5244;
                              }

                              if(var5 < 0) {
                                 var28 = 0;
                              } else if(var5 >= this.anInt5245 * -1769380583) {
                                 var28 = this.anInt5245 * -1769380583;
                              }

                              if(var22 < 0) {
                                 var22 = 0;
                              } else if(var22 >= -1769380583 * this.anInt5245) {
                                 var22 = this.anInt5245 * -1769380583;
                              }

                              while(var19 < var20) {
                                 while(var28 < var22) {
                                    this.aByteArrayArrayArray5248[var3][var19][var28] = 0;
                                    ++var28;
                                 }

                                 ++var19;
                              }
                           }
                        } else if(1 != var18) {
                           if(var18 == 2) {
                              ;
                           }
                        } else {
                           if(null == this.aByteArrayArrayArray5248[var3]) {
                              this.aByteArrayArrayArray5248[var3] = new byte[this.anInt5244 * -1225795677 + 1][-1769380583 * this.anInt5245 + 1];
                           }

                           for(var19 = 0; var19 < 64; var19 += 4) {
                              for(var20 = 0; var20 < 64; var20 += 4) {
                                 byte var21 = var2.readByte((byte)99);
                                 if(var17 <= var6) {
                                    for(var22 = var19; var22 < var19 + 4; ++var22) {
                                       for(var23 = var20; var23 < 4 + var20; ++var23) {
                                          if(var22 >= var14 && var22 < 8 + var14 && var23 >= var15 && var23 < var15 + 8) {
                                             var24 = var4 + Class59.method1035(var22 & 7, var23 & 7, var9, (byte)-1);
                                             int var25 = var5 + Class526_Sub21_Sub2.method10421(var22 & 7, var23 & 7, var9, (byte)16);
                                             if(var24 >= 0 && var24 < -1225795677 * this.anInt5244 && var25 >= 0 && var25 < this.anInt5245 * -1769380583) {
                                                this.aByteArrayArrayArray5248[var3][var24][var25] = var21;
                                                var11 = true;
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
               }
            }

            if(var12 != null) {
               this.aClass623_10316.method7372(var4 >> 3, var5 >> 3, var12, 271336083);
            }

            Class411.method4904(var4 >> 3, var5 >> 3, var13, (byte)-7);
            if(!var11 && this.aByteArrayArrayArray5248 != null && this.aByteArrayArrayArray5248[var3] != null) {
               var16 = 7 + var4;
               var17 = 7 + var5;

               for(var26 = var4; var26 < var16; ++var26) {
                  for(var19 = var5; var19 < var17; ++var19) {
                     this.aByteArrayArrayArray5248[var3][var26][var19] = 0;
                  }
               }
            }

            return;
         }
      }
   }

   public final void method9271(Class174 var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      RSByteBuffer var11 = new RSByteBuffer(var2);
      int var12 = -1;

      label91:
      while(true) {
         int var13 = var11.method9683((byte)3);
         if(var13 == 0) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while(true) {
            int var20;
            int var21;
            int var25;
            int var26;
            int var28;
            do {
               int var27;
               do {
                  do {
                     do {
                        do {
                           int var16;
                           int var17;
                           do {
                              do {
                                 do {
                                    int var18;
                                    do {
                                       do {
                                          int var15 = var11.readSmart(-1268169762);
                                          if(var15 == 0) {
                                             continue label91;
                                          }

                                          var14 += var15 - 1;
                                          var16 = var14 & 63;
                                          var17 = var14 >> 6 & 63;
                                          var18 = var14 >> 12;
                                          int var19 = var11.readUnsignedByte(-793205601);
                                          var20 = var19 >> 2;
                                          var21 = var19 & 3;
                                       } while(var6 != var18);
                                    } while(var17 < var7);
                                 } while(var17 >= var7 + 8);
                              } while(var16 < var8);
                           } while(var16 >= 8 + var8);

                           Class610 var22 = (Class610)this.aClass40_Sub8_10328.method89(var12, -808171832);
                           int var23;
                           int var24;
                           if((var21 & 1) == 0) {
                              var23 = var22.anInt7993 * -1450399027;
                              var24 = var22.anInt7971 * 182793117;
                           } else {
                              var23 = 182793117 * var22.anInt7971;
                              var24 = var22.anInt7993 * -1450399027;
                           }

                           var25 = var4 + Class234.method3271(var17 & 7, var16 & 7, var9, var22.anInt7993 * -1450399027, var22.anInt7971 * 182793117, var21, (byte)73);
                           var26 = var5 + Class427.method5030(var17 & 7, var16 & 7, var9, var22.anInt7993 * -1450399027, var22.anInt7971 * 182793117, var21, -369604773);
                           var27 = var23 + var25;
                           var28 = var26 + var24;
                        } while(var25 >= -1225795677 * this.anInt5244);
                     } while(var26 >= -1769380583 * this.anInt5245);
                  } while(var27 <= 0);
               } while(var28 <= 0);
            } while(var20 != Class594.aClass594_7841.anInt7833 * -1226971375 && -1226971375 * Class594.aClass594_7842.anInt7833 != var20 && (var25 <= 0 || var26 <= 0 || var25 >= -1225795677 * this.anInt5244 - 1 || var26 >= this.anInt5245 * -1769380583 - 1));

            this.method9272(var1, var3, var3, var25, var26, var12, var21 + var9 & 3, var20, -1, 0, -695656001);
         }
      }
   }

   final void method9272(Class174 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if(var3 < this.anInt10323 * 468711441) {
         this.anInt10323 = 492304625 * var3;
      }

      Class610 var12 = (Class610)this.aClass40_Sub8_10328.method89(var6, -378262918);
      if(Class230.preferences.aClass711_Sub17_10601.method10004(29768870) != 0 || !var12.aBool8000) {
         int var13;
         int var14;
         if(var7 != 1 && 3 != var7) {
            var13 = var12.anInt7993 * -1450399027;
            var14 = 182793117 * var12.anInt7971;
         } else {
            var13 = 182793117 * var12.anInt7971;
            var14 = -1450399027 * var12.anInt7993;
         }

         int var15;
         int var16;
         if(var13 + var4 <= -1225795677 * this.anInt5244) {
            var15 = (var13 >> 1) + var4;
            var16 = (1 + var13 >> 1) + var4;
         } else {
            var15 = var4;
            var16 = var4 + 1;
         }

         int var17;
         int var18;
         if(var5 + var14 <= this.anInt5245 * -1769380583) {
            var17 = var5 + (var14 >> 1);
            var18 = var5 + (var14 + 1 >> 1);
         } else {
            var17 = var5;
            var18 = 1 + var5;
         }

         Class148 var19 = this.aClass549_5252.aClass148Array7288[var2];
         int var20;
         if(var8 != Class594.aClass594_7841.anInt7833 * -1226971375 && Class594.aClass594_7842.anInt7833 * -1226971375 != var8) {
            var20 = var19.method1714(var15, var17, -623283849) + var19.method1714(var16, var17, 1275949227) + var19.method1714(var15, var18, 461880604) + var19.method1714(var16, var18, 33733005) >> 2;
         } else {
            var20 = var19.method1702(var15, var17, 1109297032) + var19.method1702(var16, var17, -1918020649) + var19.method1702(var15, var18, 283640192) + var19.method1702(var16, var18, 950324356) >> 2;
         }

         int var21 = (var4 << 9) + (var13 << 8);
         int var22 = (var14 << 8) + (var5 << 9);
         boolean var23 = this.aBool5280 && !this.aBool5246 && var12.aBool7957;
         if(var12.method7193(-321774385)) {
            Class408.method4893(var3, var4, var5, var7, var12, (NPC)null, (Class639_Sub1_Sub2_Sub1_Sub1)null, -1056598282);
         }

         boolean var24 = -1 == var9 && (!var12.method7183((byte)0) || var12.aBool7963 && Class230.preferences.aClass711_Sub42_10607.method10199((byte)-38) == 0) && var12.anIntArray7989 == null && !var12.aBool8004 && !var12.aBool8008;
         if(!aBool10325 || (!Class639_Sub1_Sub2_Sub3.method10841(var8, (byte)0) || var12.anInt7934 * 787732611 == 1) && (!Class588.method6997(var8, -15908342) || 0 != 787732611 * var12.anInt7934)) {
            Object var26;
            if(Class594.aClass594_7843.anInt7833 * -1226971375 == var8) {
               if(Class230.preferences.aClass711_Sub11_10609.method9948((byte)25) != 0 || 0 != 909601847 * var12.anInt7954 || 1 == -1196711325 * var12.anInt7953 || var12.aBool7985) {
                  if(var24) {
                     Class639_Sub1_Sub3_Sub1 var30 = new Class639_Sub1_Sub3_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var12, var3, var2, var21, var20, var22, this.aBool5246, var7, var23);
                     if(var30.method380((byte)18)) {
                        var30.method382(var1, 2002375768);
                     }

                     var26 = var30;
                  } else {
                     var26 = new Class639_Sub1_Sub3_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var12, var3, var2, var21, var20, var22, this.aBool5246, var7, var9, var10);
                  }

                  this.aClass549_5252.method6576(var3, var4, var5, (Class639_Sub1_Sub3)var26, (byte)60);
               }
            } else {
               Class639_Sub1_Sub2_Sub3 var25;
               if(Class594.aClass594_7841.anInt7833 * -1226971375 != var8 && -1226971375 * Class594.aClass594_7842.anInt7833 != var8) {
                  if(!Class588.method6997(var8, 1136156753) && !Class575.method6935(var8, -613942270)) {
                     if(!this.method9273(var1, var8, var7, var24, var12, var9, var10, var3, var2, var21, var20, var22, var4, var5, var23, var19, var13, var14, -175726352)) {
                        if(!this.method9274(var1, var8, var7, var24, var12, var9, var10, var3, var2, var21, var20, var22, var4, var5, 1957857387)) {
                           ;
                        }
                     }
                  } else {
                     if(var24) {
                        var25 = new Class639_Sub1_Sub2_Sub3(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var12, var3, var2, var21, var20, var22, this.aBool5246, var4, var13 + var4 - 1, var5, var5 + var14 - 1, var8, var7, var23, true);
                        if(var25.method380((byte)18)) {
                           var25.method382(var1, 1580457289);
                        }

                        var26 = var25;
                     } else {
                        var26 = new Class639_Sub1_Sub2_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var12, var3, var2, var21, var20, var22, this.aBool5246, var4, var13 + var4 - 1, var5, var5 + var14 - 1, var8, var7, var9, var10, true);
                     }

                     this.aClass549_5252.method6579((Class639_Sub1_Sub2)var26, false, 65536);
                     if(this.aBool5280 && !this.aBool5246 && Class588.method6997(var8, -526766405) && Class594.aClass594_7832.anInt7833 * -1226971375 != var8 && var3 > 0 && 787732611 * var12.anInt7934 != 0) {
                        this.aByteArrayArrayArray5243[var3][var4][var5] = (byte)(this.aByteArrayArrayArray5243[var3][var4][var5] | 4);
                     }

                  }
               } else {
                  var25 = null;
                  int var28;
                  if(var24) {
                     Class639_Sub1_Sub2_Sub3 var27 = new Class639_Sub1_Sub2_Sub3(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var12, var3, var2, var21, var20, var22, this.aBool5246, var4, var13 + var4 - 1, var5, var5 + var14 - 1, var8, var7, var23, var12.aClass602_7943 != Class602.aClass602_7885);
                     var28 = var27.method10836((byte)-72);
                     var26 = var27;
                     var25 = var27;
                  } else {
                     var26 = new Class639_Sub1_Sub2_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var12, var3, var2, var21, var20, var22, this.aBool5246, var4, var13 + var4 - 1, var5, var14 + var5 - 1, var8, var7, var9, var10, Class602.aClass602_7885 != var12.aClass602_7943);
                     var28 = 15;
                  }

                  if(this.aClass549_5252.method6579((Class639_Sub1_Sub2)var26, false, 65536)) {
                     if(var25 != null && var25.method380((byte)18)) {
                        var25.method382(var1, 1003827793);
                     }

                     if(var12.aBool8003 && this.aBool5280) {
                        if(var28 > 30) {
                           var28 = 30;
                        }

                        for(int var31 = 0; var31 <= var13; ++var31) {
                           for(int var29 = 0; var29 <= var14; ++var29) {
                              var19.method1713(var4 + var31, var29 + var5, var28);
                           }
                        }
                     }
                  }

               }
            }
         }
      }
   }

   boolean method9273(Class174 var1, int var2, int var3, boolean var4, Class610 var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, Class148 var16, int var17, int var18, int var19) {
      Object var28;
      if(var2 == Class594.aClass594_7822.anInt7833 * -1226971375) {
         int var29 = var5.anInt7934 * 787732611;
         if(aBool10317 && 787732611 * var5.anInt7934 == -1) {
            var29 = 1;
         }

         if(var4) {
            Class639_Sub1_Sub1_Sub1 var25 = new Class639_Sub1_Sub1_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var3, var15);
            if(var25.method380((byte)18)) {
               var25.method382(var1, 1484257954);
            }

            var28 = var25;
         } else {
            var28 = new Class639_Sub1_Sub1_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var3, var6, var7);
         }

         this.aClass549_5252.method6578(var8, var13, var14, (Class639_Sub1_Sub1)var28, (Class639_Sub1_Sub1)null, (byte)-2);
         if(var3 == 0) {
            if(this.aBool5280 && var5.aBool8003) {
               var16.method1713(var13, var14, 50);
               var16.method1713(var13, var14 + 1, 50);
            }

            if(var29 == 1 && !this.aBool5246) {
               this.aClass549_5252.aClass562_7300.method6756(1, var8, var13, var14, var5.anInt7951 * 911094063, 905935281 * var5.anInt7960);
            }
         } else if(1 == var3) {
            if(this.aBool5280 && var5.aBool8003) {
               var16.method1713(var13, 1 + var14, 50);
               var16.method1713(var13 + 1, var14 + 1, 50);
            }

            if(var29 == 1 && !this.aBool5246) {
               this.aClass549_5252.aClass562_7300.method6756(2, var8, var13, var14 + 1, 911094063 * var5.anInt7951, -(905935281 * var5.anInt7960));
            }
         } else if(2 == var3) {
            if(this.aBool5280 && var5.aBool8003) {
               var16.method1713(1 + var13, var14, 50);
               var16.method1713(1 + var13, var14 + 1, 50);
            }

            if(1 == var29 && !this.aBool5246) {
               this.aClass549_5252.aClass562_7300.method6756(1, var8, 1 + var13, var14, var5.anInt7951 * 911094063, -(var5.anInt7960 * 905935281));
            }
         } else if(var3 == 3) {
            if(this.aBool5280 && var5.aBool8003) {
               var16.method1713(var13, var14, 50);
               var16.method1713(1 + var13, var14, 50);
            }

            if(var29 == 1 && !this.aBool5246) {
               this.aClass549_5252.aClass562_7300.method6756(2, var8, var13, var14, var5.anInt7951 * 911094063, var5.anInt7960 * 905935281);
            }
         }

         if(1506893889 * var5.anInt7964 != 64) {
            this.aClass549_5252.method6611(var8, var13, var14, 1506893889 * var5.anInt7964, -1190085185);
         }

         return true;
      } else {
         Object var20;
         Class639_Sub1_Sub1_Sub1 var27;
         if(Class594.aClass594_7836.anInt7833 * -1226971375 == var2) {
            if(var4) {
               var27 = new Class639_Sub1_Sub1_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var3, var15);
               if(var27.method380((byte)18)) {
                  var27.method382(var1, 1397919292);
               }

               var20 = var27;
            } else {
               var20 = new Class639_Sub1_Sub1_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var3, var6, var7);
            }

            this.aClass549_5252.method6578(var8, var13, var14, (Class639_Sub1_Sub1)var20, (Class639_Sub1_Sub1)null, (byte)-40);
            if(var5.aBool8003 && this.aBool5280) {
               if(var3 == 0) {
                  var16.method1713(var13, var14 + 1, 50);
               } else if(var3 == 1) {
                  var16.method1713(var13 + 1, var14 + 1, 50);
               } else if(var3 == 2) {
                  var16.method1713(var13 + 1, var14, 50);
               } else if(3 == var3) {
                  var16.method1713(var13, var14, 50);
               }
            }

            return true;
         } else if(Class594.aClass594_7823.anInt7833 * -1226971375 == var2) {
            int var21 = 1 + var3 & 3;
            if(var4) {
               Class639_Sub1_Sub1_Sub1 var23 = new Class639_Sub1_Sub1_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var3 + 4, var15);
               Class639_Sub1_Sub1_Sub1 var24 = new Class639_Sub1_Sub1_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var21, var15);
               if(var23.method380((byte)18)) {
                  var23.method382(var1, 1668283002);
               }

               if(var24.method380((byte)18)) {
                  var24.method382(var1, 1916372189);
               }

               var20 = var23;
               var28 = var24;
            } else {
               var20 = new Class639_Sub1_Sub1_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, 4 + var3, var6, var7);
               var28 = new Class639_Sub1_Sub1_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var21, var6, var7);
            }

            this.aClass549_5252.method6578(var8, var13, var14, (Class639_Sub1_Sub1)var20, (Class639_Sub1_Sub1)var28, (byte)-23);
            if((1 == 787732611 * var5.anInt7934 || aBool10317 && 787732611 * var5.anInt7934 == -1) && !this.aBool5246) {
               if(0 == var3) {
                  this.aClass549_5252.aClass562_7300.method6756(1, var8, var13, var14, 911094063 * var5.anInt7951, 905935281 * var5.anInt7960);
                  this.aClass549_5252.aClass562_7300.method6756(2, var8, var13, var14 + 1, 911094063 * var5.anInt7951, 905935281 * var5.anInt7960);
               } else if(var3 == 1) {
                  this.aClass549_5252.aClass562_7300.method6756(1, var8, var13 + 1, var14, var5.anInt7951 * 911094063, var5.anInt7960 * 905935281);
                  this.aClass549_5252.aClass562_7300.method6756(2, var8, var13, 1 + var14, 911094063 * var5.anInt7951, 905935281 * var5.anInt7960);
               } else if(2 == var3) {
                  this.aClass549_5252.aClass562_7300.method6756(1, var8, var13 + 1, var14, 911094063 * var5.anInt7951, var5.anInt7960 * 905935281);
                  this.aClass549_5252.aClass562_7300.method6756(2, var8, var13, var14, 911094063 * var5.anInt7951, 905935281 * var5.anInt7960);
               } else if(3 == var3) {
                  this.aClass549_5252.aClass562_7300.method6756(1, var8, var13, var14, var5.anInt7951 * 911094063, 905935281 * var5.anInt7960);
                  this.aClass549_5252.aClass562_7300.method6756(2, var8, var13, var14, var5.anInt7951 * 911094063, var5.anInt7960 * 905935281);
               }
            }

            if(1506893889 * var5.anInt7964 != 64) {
               this.aClass549_5252.method6611(var8, var13, var14, 1506893889 * var5.anInt7964, -1560257584);
            }

            return true;
         } else if(-1226971375 * Class594.aClass594_7824.anInt7833 == var2) {
            if(var4) {
               var27 = new Class639_Sub1_Sub1_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var3, var15);
               if(var27.method380((byte)18)) {
                  var27.method382(var1, 1214760408);
               }

               var20 = var27;
            } else {
               var20 = new Class639_Sub1_Sub1_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var2, var3, var6, var7);
            }

            this.aClass549_5252.method6578(var8, var13, var14, (Class639_Sub1_Sub1)var20, (Class639_Sub1_Sub1)null, (byte)65);
            if(var5.aBool8003 && this.aBool5280) {
               if(0 == var3) {
                  var16.method1713(var13, 1 + var14, 50);
               } else if(1 == var3) {
                  var16.method1713(1 + var13, var14 + 1, 50);
               } else if(var3 == 2) {
                  var16.method1713(1 + var13, var14, 50);
               } else if(3 == var3) {
                  var16.method1713(var13, var14, 50);
               }
            }

            return true;
         } else if(-1226971375 * Class594.aClass594_7844.anInt7833 == var2) {
            if(var4) {
               Class639_Sub1_Sub2_Sub3 var22 = new Class639_Sub1_Sub2_Sub3(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var13, var13, var14, var14, var2, var3, var15, true);
               if(var22.method380((byte)18)) {
                  var22.method382(var1, 1915667194);
               }

               var20 = var22;
            } else {
               var20 = new Class639_Sub1_Sub2_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var13, var13 + var17 - 1, var14, var14 + var18 - 1, var2, var3, var6, var7, true);
            }

            this.aClass549_5252.method6579((Class639_Sub1_Sub2)var20, false, 65536);
            if(var5.anInt7934 * 787732611 == 1 && !this.aBool5246) {
               byte var26;
               if((var3 & 1) == 0) {
                  var26 = 8;
               } else {
                  var26 = 16;
               }

               this.aClass549_5252.aClass562_7300.method6756(var26, var8, var13, var14, var5.anInt7951 * 911094063, 0);
            }

            if(64 != var5.anInt7964 * 1506893889) {
               this.aClass549_5252.method6611(var8, var13, var14, var5.anInt7964 * 1506893889, -1318944833);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   boolean method9274(Class174 var1, int var2, int var3, boolean var4, Class610 var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      Object var17;
      if(Class594.aClass594_7826.anInt7833 * -1226971375 == var2) {
         if(var4) {
            Class639_Sub1_Sub5_Sub2 var26 = new Class639_Sub1_Sub5_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, 0, 0, var2, var3);
            if(var26.method380((byte)18)) {
               var26.method382(var1, 1056801582);
            }

            var17 = var26;
         } else {
            var17 = new Class639_Sub1_Sub5_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, 0, 0, var2, var3, var6, var7);
         }

         this.aClass549_5252.method6573(var8, var13, var14, (Class639_Sub1_Sub5)var17, (Class639_Sub1_Sub5)null, (byte)110);
         return true;
      } else {
         int var23;
         Interface59 var25;
         Class639_Sub1_Sub5_Sub2 var27;
         if(var2 == -1226971375 * Class594.aClass594_7827.anInt7833) {
            var23 = 65;
            var25 = (Interface59)this.aClass549_5252.method6589(var8, var13, var14, (byte)24);
            if(var25 != null) {
               var23 = ((Class610)this.aClass40_Sub8_10328.method89(var25.method56(848833116), -286168718)).anInt7964 * 1506893889 + 1;
            }

            if(var4) {
               var27 = new Class639_Sub1_Sub5_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var23 * anIntArray10322[var3], anIntArray10326[var3] * var23, var2, var3);
               if(var27.method380((byte)18)) {
                  var27.method382(var1, 1112216817);
               }

               var17 = var27;
            } else {
               var17 = new Class639_Sub1_Sub5_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var23 * anIntArray10322[var3], var23 * anIntArray10326[var3], var2, var3, var6, var7);
            }

            this.aClass549_5252.method6573(var8, var13, var14, (Class639_Sub1_Sub5)var17, (Class639_Sub1_Sub5)null, (byte)89);
            return true;
         } else if(var2 == Class594.aClass594_7835.anInt7833 * -1226971375) {
            var23 = 33;
            var25 = (Interface59)this.aClass549_5252.method6589(var8, var13, var14, (byte)24);
            if(var25 != null) {
               var23 = ((Class610)this.aClass40_Sub8_10328.method89(var25.method56(1235086835), -1919390780)).anInt7964 * 1506893889 / 2 + 1;
            }

            if(var4) {
               var27 = new Class639_Sub1_Sub5_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, anIntArray10322[var3] * var23, anIntArray10326[var3] * var23, var2, var3 + 4);
               if(var27.method380((byte)18)) {
                  var27.method382(var1, 1749028009);
               }

               var17 = var27;
            } else {
               var17 = new Class639_Sub1_Sub5_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, anIntArray10319[var3] * var23, var23 * anIntArray10324[var3], var2, 4 + var3, var6, var7);
            }

            this.aClass549_5252.method6573(var8, var13, var14, (Class639_Sub1_Sub5)var17, (Class639_Sub1_Sub5)null, (byte)8);
            return true;
         } else if(Class594.aClass594_7821.anInt7833 * -1226971375 == var2) {
            var23 = 2 + var3 & 3;
            if(var4) {
               Class639_Sub1_Sub5_Sub2 var24 = new Class639_Sub1_Sub5_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, 0, 0, var2, var23 + 4);
               if(var24.method380((byte)18)) {
                  var24.method382(var1, 2079170984);
               }

               var17 = var24;
            } else {
               var17 = new Class639_Sub1_Sub5_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, 0, 0, var2, 4 + var23, var6, var7);
            }

            this.aClass549_5252.method6573(var8, var13, var14, (Class639_Sub1_Sub5)var17, (Class639_Sub1_Sub5)null, (byte)43);
            return true;
         } else if(var2 == Class594.aClass594_7830.anInt7833 * -1226971375) {
            int var18 = var3 + 2 & 3;
            int var19 = 33;
            Interface59 var20 = (Interface59)this.aClass549_5252.method6589(var8, var13, var14, (byte)24);
            if(var20 != null) {
               var19 = ((Class610)this.aClass40_Sub8_10328.method89(var20.method56(1068306003), -2130291951)).anInt7964 * 1506893889 / 2 + 1;
            }

            Object var16;
            if(var4) {
               Class639_Sub1_Sub5_Sub2 var21 = new Class639_Sub1_Sub5_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, anIntArray10319[var3] * var19, var19 * anIntArray10324[var3], var2, 4 + var3);
               Class639_Sub1_Sub5_Sub2 var22 = new Class639_Sub1_Sub5_Sub2(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, 0, 0, var2, 4 + var18);
               if(var21.method380((byte)18)) {
                  var21.method382(var1, 1237665188);
               }

               if(var22.method380((byte)18)) {
                  var22.method382(var1, 2116351282);
               }

               var17 = var21;
               var16 = var22;
            } else {
               Class639_Sub1_Sub5_Sub1 var28 = new Class639_Sub1_Sub5_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, var19 * anIntArray10319[var3], var19 * anIntArray10324[var3], var2, var3 + 4, var6, var7);
               Class639_Sub1_Sub5_Sub1 var29 = new Class639_Sub1_Sub5_Sub1(this.aClass549_5252, var1, this.aClass40_Sub8_10328, var5, var8, var9, var10, var11, var12, this.aBool5246, 0, 0, var2, var18 + 4, var6, var7);
               var17 = var28;
               var16 = var29;
            }

            this.aClass549_5252.method6573(var8, var13, var14, (Class639_Sub1_Sub5)var17, (Class639_Sub1_Sub5)var16, (byte)1);
            return true;
         } else {
            return false;
         }
      }
   }

   void method9275(Class174 var1, int var2, int var3, int var4, int var5, int var6) {
      Interface59 var7 = this.method9277(var2, var3, var4, var5, (byte)31);
      if(null != var7) {
         Class610 var8 = (Class610)this.aClass40_Sub8_10328.method89(var7.method56(-56481463), -366084956);
         int var9 = var7.method87(832792055);
         int var10 = var7.method379((byte)-45);
         if(var8.method7193(-413176446)) {
            Class639_Sub1_Sub3_Sub1.method10851(var2, var4, var5, var8, -1995155596);
         }

         if(var7.method380((byte)18)) {
            var7.method381(var1, (byte)0);
         }

         if(var3 == 0) {
            this.aClass549_5252.method6582(var2, var4, var5, 1947690048);
            this.aClass549_5252.method6583(var2, var4, var5, 364399338);
            if(1 == 787732611 * var8.anInt7934) {
               if(var10 == 0) {
                  this.aClass549_5252.aClass562_7300.method6757(1, var2, var4, var5);
               } else if(1 == var10) {
                  this.aClass549_5252.aClass562_7300.method6757(2, var2, var4, var5 + 1);
               } else if(2 == var10) {
                  this.aClass549_5252.aClass562_7300.method6757(1, var2, 1 + var4, var5);
               } else if(var10 == 3) {
                  this.aClass549_5252.aClass562_7300.method6757(2, var2, var4, var5);
               }
            }
         } else if(var3 == 1) {
            this.aClass549_5252.method6626(var2, var4, var5, -796739085);
            this.aClass549_5252.method6585(var2, var4, var5, 1548376514);
         } else if(2 == var3) {
            this.aClass549_5252.method6628(var2, var4, var5, client.anInterface64_11296, -1668050336);
            if(var9 == Class594.aClass594_7844.anInt7833 * -1226971375) {
               if((var10 & 1) == 0) {
                  this.aClass549_5252.aClass562_7300.method6757(8, var2, var4, var5);
               } else {
                  this.aClass549_5252.aClass562_7300.method6757(16, var2, var4, var5);
               }
            }
         } else if(var3 == 3) {
            this.aClass549_5252.method6586(var2, var4, var5, (short)-18764);
         }
      }

   }

   public final void method9276(Class174 var1, boolean var2, int var3) {
      this.aClass549_5252.method6594();
      if(!var2) {
         int var4;
         int var5;
         if(-1917803745 * this.anInt5269 > 1) {
            for(var4 = 0; var4 < this.anInt5244 * -1225795677; ++var4) {
               for(var5 = 0; var5 < -1769380583 * this.anInt5245; ++var5) {
                  if(2 == (this.aClass470_5235.aByteArrayArrayArray5356[1][var4][var5] & 2)) {
                     this.aClass549_5252.method6630(var4, var5, 1815429587);
                  }
               }
            }
         }

         for(var4 = 0; var4 < this.anInt5269 * -1917803745; ++var4) {
            for(var5 = 0; var5 <= this.anInt5245 * -1769380583; ++var5) {
               for(int var6 = 0; var6 <= this.anInt5244 * -1225795677; ++var6) {
                  if(0 != (this.aByteArrayArrayArray5243[var4][var6][var5] & 4)) {
                     int var7 = var6;
                     int var8 = var6;
                     int var9 = var5;

                     int var10;
                     for(var10 = var5; var9 > 0 && (this.aByteArrayArrayArray5243[var4][var6][var9 - 1] & 4) != 0 && var10 - var9 < 10; --var9) {
                        ;
                     }

                     while(var10 < -1769380583 * this.anInt5245 && 0 != (this.aByteArrayArrayArray5243[var4][var6][var10 + 1] & 4) && var10 - var9 < 10) {
                        ++var10;
                     }

                     int var11;
                     label108:
                     while(var7 > 0 && var8 - var7 < 10) {
                        for(var11 = var9; var11 <= var10; ++var11) {
                           if((this.aByteArrayArrayArray5243[var4][var7 - 1][var11] & 4) == 0) {
                              break label108;
                           }
                        }

                        --var7;
                     }

                     label95:
                     while(var8 < this.anInt5244 * -1225795677 && var8 - var7 < 10) {
                        for(var11 = var9; var11 <= var10; ++var11) {
                           if((this.aByteArrayArrayArray5243[var4][var8 + 1][var11] & 4) == 0) {
                              break label95;
                           }
                        }

                        ++var8;
                     }

                     if((var8 - var7 + 1) * (var10 - var9 + 1) >= 4) {
                        var11 = this.anIntArrayArrayArray5312[var4][var7][var9];
                        this.aClass549_5252.aClass562_7300.method6760(4, var4, var7 << 9, (var8 << 9) + 512, var9 << 9, 512 + (var10 << 9), var11, var11);

                        for(int var12 = var7; var12 <= var8; ++var12) {
                           for(int var13 = var9; var13 <= var10; ++var13) {
                              this.aByteArrayArrayArray5243[var4][var12][var13] &= -5;
                           }
                        }
                     }
                  }
               }
            }
         }

         this.aClass549_5252.aClass562_7300.method6758();
      }

      this.aByteArrayArrayArray5243 = (byte[][][])null;
   }

   Interface59 method9277(int var1, int var2, int var3, int var4, byte var5) {
      Interface59 var6 = null;
      if(0 == var2) {
         var6 = (Interface59)this.aClass549_5252.method6589(var1, var3, var4, (byte)24);
      }

      if(1 == var2) {
         var6 = (Interface59)this.aClass549_5252.method6590(var1, var3, var4, -253368958);
      }

      if(var2 == 2) {
         var6 = (Interface59)this.aClass549_5252.method6591(var1, var3, var4, client.anInterface64_11296, 1739430101);
      }

      if(var2 == 3) {
         var6 = (Interface59)this.aClass549_5252.method6593(var1, var3, var4, -1323922702);
      }

      return var6;
   }

   public Class465_Sub1(Class549 var1, Class40_Sub8 var2, int var3, int var4, int var5, boolean var6, Class470 var7, Class623 var8) {
      super(var1, var3, var4, var5, var6, Class323.aClass40_Sub10_3461, Class709.aClass40_Sub18_8849, var7);
      this.aClass40_Sub8_10328 = var2;
      this.aClass623_10316 = var8;
   }

   public final void method9278(Class174 var1, byte[] var2, int var3, int var4, byte var5) {
      RSByteBuffer var6 = new RSByteBuffer(var2);
      int var7 = -1;

      label66:
      while(true) {
         int var8 = var6.method9683((byte)3);
         if(0 == var8) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var13;
            int var15;
            int var16;
            int var17;
            int var18;
            int var23;
            do {
               int var22;
               do {
                  do {
                     do {
                        do {
                           int var10 = var6.readSmart(-741477449);
                           if(0 == var10) {
                              continue label66;
                           }

                           var9 += var10 - 1;
                           int var11 = var9 & 63;
                           int var12 = var9 >> 6 & 63;
                           var13 = var9 >> 12;
                           int var14 = var6.readUnsignedByte(1448041509);
                           var15 = var14 >> 2;
                           var16 = var14 & 3;
                           var17 = var12 + var3;
                           var18 = var11 + var4;
                           Class610 var19 = (Class610)this.aClass40_Sub8_10328.method89(var7, -1721369340);
                           int var20;
                           int var21;
                           if((var16 & 1) == 0) {
                              var20 = -1450399027 * var19.anInt7993;
                              var21 = 182793117 * var19.anInt7971;
                           } else {
                              var20 = var19.anInt7971 * 182793117;
                              var21 = var19.anInt7993 * -1450399027;
                           }

                           var22 = var17 + var20;
                           var23 = var18 + var21;
                        } while(var17 >= -1225795677 * this.anInt5244);
                     } while(var18 >= this.anInt5245 * -1769380583);
                  } while(var22 <= 0);
               } while(var23 <= 0);
            } while(-1226971375 * Class594.aClass594_7841.anInt7833 != var15 && Class594.aClass594_7842.anInt7833 * -1226971375 != var15 && (var17 <= 0 || var18 <= 0 || var17 >= -1225795677 * this.anInt5244 - 1 || var18 >= this.anInt5245 * -1769380583 - 1));

            this.method9272(var1, var13, var13, var17, var18, var7, var16, var15, -1, 0, 290963405);
         }
      }
   }
}
