package com.jagex;

import com.jagex.Class680;
import com.jagex.Class694;

public final class Class706 {
   static final int anInt8830 = 16;
   static final int anInt8831 = 23;
   static final int anInt8832 = 0;
   static final int anInt8833 = 1;
   static final int anInt8834 = 6;
   static final int anInt8835 = 50;
   static final int anInt8836 = 4096;
   static Class694 aClass694_8829 = new Class694();

   public static int method8293(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class694 var5 = aClass694_8829;
      synchronized(var5) {
         aClass694_8829.aByteArray8721 = var2;
         aClass694_8829.anInt8722 = var4 * 869063109;
         aClass694_8829.aByteArray8724 = var0;
         aClass694_8829.anInt8725 = 0;
         aClass694_8829.anInt8726 = var1 * 1140952845;
         aClass694_8829.anInt8731 = 0;
         aClass694_8829.anInt8717 = 0;
         aClass694_8829.anInt8723 = 0;
         aClass694_8829.anInt8716 = 0;
         method8294(aClass694_8829);
         var1 -= aClass694_8829.anInt8726 * 2014173125;
         aClass694_8829.aByteArray8721 = null;
         aClass694_8829.aByteArray8724 = null;
         return var1;
      }
   }

   Class706() throws Throwable {
      throw new Error();
   }

   static void method8294(Class694 var0) {
      boolean var1 = false;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      int var19 = 0;
      int[] var20 = null;
      int[] var21 = null;
      int[] var22 = null;
      var0.anInt8732 = -1475547533;
      if(Class680.anIntArray8615 == null) {
         Class680.anIntArray8615 = new int[var0.anInt8732 * 1061230304];
      }

      boolean var23 = true;

      while(true) {
         while(var23) {
            byte var24 = method8295(var0);
            if(var24 == 23) {
               return;
            }

            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8295(var0);
            var24 = method8296(var0);
            if(var24 != 0) {
               ;
            }

            var0.anInt8734 = 0;
            var24 = method8295(var0);
            var0.anInt8734 = (var0.anInt8734 * 1605836369 << 8 | var24 & 255) * -196154703;
            var24 = method8295(var0);
            var0.anInt8734 = (var0.anInt8734 * 1605836369 << 8 | var24 & 255) * -196154703;
            var24 = method8295(var0);
            var0.anInt8734 = (var0.anInt8734 * 1605836369 << 8 | var24 & 255) * -196154703;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var24 = method8296(var0);
               if(var24 == 1) {
                  var0.aBoolArray8733[var35] = true;
               } else {
                  var0.aBoolArray8733[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.aBoolArray8740[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if(var0.aBoolArray8733[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var24 = method8296(var0);
                     if(var24 == 1) {
                        var0.aBoolArray8740[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            method8302(var0);
            int var38 = var0.anInt8739 * 2000726887 + 2;
            int var39 = method8297(3, var0);
            int var40 = method8297(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var24 = method8296(var0);
                  if(var24 == 0) {
                     var0.aByteArray8746[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var25 = new byte[6];

            byte var26;
            for(var26 = 0; var26 < var39; var25[var26] = var26++) {
               ;
            }

            for(var35 = 0; var35 < var40; ++var35) {
               var26 = var0.aByteArray8746[var35];

               byte var27;
               for(var27 = var25[var26]; var26 > 0; --var26) {
                  var25[var26] = var25[var26 - 1];
               }

               var25[0] = var27;
               var0.aByteArray8745[var35] = var27;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = method8297(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var24 = method8296(var0);
                     if(var24 == 0) {
                        var0.aByteArrayArray8741[var37][var35] = (byte)var49;
                        break;
                     }

                     var24 = method8296(var0);
                     if(var24 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var28 = 32;
               byte var29 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if(var0.aByteArrayArray8741[var37][var35] > var29) {
                     var29 = var0.aByteArrayArray8741[var37][var35];
                  }

                  if(var0.aByteArrayArray8741[var37][var35] < var28) {
                     var28 = var0.aByteArrayArray8741[var37][var35];
                  }
               }

               method8299(var0.anIntArrayArray8750[var37], var0.anIntArrayArray8738[var37], var0.anIntArrayArray8727[var37], var0.aByteArrayArray8741[var37], var28, var29, var38);
               var0.anIntArray8751[var37] = var28;
            }

            int var41 = var0.anInt8739 * 2000726887 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.anIntArray8736[var35] = 0;
            }

            int var55 = 4095;

            int var54;
            int var56;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var56 = 15; var56 >= 0; --var56) {
                  var0.aByteArray8743[var55] = (byte)(var54 * 16 + var56);
                  --var55;
               }

               var0.anIntArray8744[var54] = var55 + 1;
            }

            int var46 = 0;
            byte var53;
            if(var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.aByteArray8745[var42];
               var19 = var0.anIntArray8751[var53];
               var20 = var0.anIntArrayArray8750[var53];
               var22 = var0.anIntArrayArray8727[var53];
               var21 = var0.anIntArrayArray8738[var53];
            }

            int var44 = var43 - 1;
            int var50 = var19;

            int var51;
            byte var52;
            for(var51 = method8297(var19, var0); var51 > var20[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = method8296(var0);
            }

            int var45 = var22[var51 - var21[var50]];

            while(true) {
               while(var45 != var41) {
                  if(var45 != 0 && var45 != 1) {
                     int var30 = var45 - 1;
                     int var31;
                     if(var30 < 16) {
                        var31 = var0.anIntArray8744[0];

                        for(var24 = var0.aByteArray8743[var31 + var30]; var30 > 3; var30 -= 4) {
                           int var32 = var31 + var30;
                           var0.aByteArray8743[var32] = var0.aByteArray8743[var32 - 1];
                           var0.aByteArray8743[var32 - 1] = var0.aByteArray8743[var32 - 2];
                           var0.aByteArray8743[var32 - 2] = var0.aByteArray8743[var32 - 3];
                           var0.aByteArray8743[var32 - 3] = var0.aByteArray8743[var32 - 4];
                        }

                        while(var30 > 0) {
                           var0.aByteArray8743[var31 + var30] = var0.aByteArray8743[var31 + var30 - 1];
                           --var30;
                        }

                        var0.aByteArray8743[var31] = var24;
                     } else {
                        int var33 = var30 / 16;
                        int var34 = var30 % 16;
                        var31 = var0.anIntArray8744[var33] + var34;

                        for(var24 = var0.aByteArray8743[var31]; var31 > var0.anIntArray8744[var33]; --var31) {
                           var0.aByteArray8743[var31] = var0.aByteArray8743[var31 - 1];
                        }

                        ++var0.anIntArray8744[var33];

                        while(var33 > 0) {
                           --var0.anIntArray8744[var33];
                           var0.aByteArray8743[var0.anIntArray8744[var33]] = var0.aByteArray8743[var0.anIntArray8744[var33 - 1] + 16 - 1];
                           --var33;
                        }

                        --var0.anIntArray8744[0];
                        var0.aByteArray8743[var0.anIntArray8744[0]] = var24;
                        if(var0.anIntArray8744[0] == 0) {
                           var55 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var56 = 15; var56 >= 0; --var56) {
                                 var0.aByteArray8743[var55] = var0.aByteArray8743[var0.anIntArray8744[var54] + var56];
                                 --var55;
                              }

                              var0.anIntArray8744[var54] = var55 + 1;
                           }
                        }
                     }

                     ++var0.anIntArray8736[var0.aByteArray8749[var24 & 255] & 255];
                     Class680.anIntArray8615[var46] = var0.aByteArray8749[var24 & 255] & 255;
                     ++var46;
                     if(var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.aByteArray8745[var42];
                        var19 = var0.anIntArray8751[var53];
                        var20 = var0.anIntArrayArray8750[var53];
                        var22 = var0.anIntArrayArray8727[var53];
                        var21 = var0.anIntArrayArray8738[var53];
                     }

                     --var44;
                     var50 = var19;

                     for(var51 = method8297(var19, var0); var51 > var20[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = method8296(var0);
                     }

                     var45 = var22[var51 - var21[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if(var45 == 0) {
                           var47 += 1 * var48;
                        } else if(var45 == 1) {
                           var47 += 2 * var48;
                        }

                        var48 *= 2;
                        if(var44 == 0) {
                           ++var42;
                           var44 = 50;
                           var53 = var0.aByteArray8745[var42];
                           var19 = var0.anIntArray8751[var53];
                           var20 = var0.anIntArrayArray8750[var53];
                           var22 = var0.anIntArrayArray8727[var53];
                           var21 = var0.anIntArrayArray8738[var53];
                        }

                        --var44;
                        var50 = var19;

                        for(var51 = method8297(var19, var0); var51 > var20[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = method8296(var0);
                        }

                        var45 = var22[var51 - var21[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var24 = var0.aByteArray8749[var0.aByteArray8743[var0.anIntArray8744[0]] & 255];

                     for(var0.anIntArray8736[var24 & 255] += var47; var47 > 0; --var47) {
                        Class680.anIntArray8615[var46] = var24 & 255;
                        ++var46;
                     }
                  }
               }

               var0.anInt8729 = 0;
               var0.aByte8728 = 0;
               var0.anIntArray8720[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.anIntArray8720[var35] = var0.anIntArray8736[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.anIntArray8720[var35] += var0.anIntArray8720[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var24 = (byte)(Class680.anIntArray8615[var35] & 255);
                  Class680.anIntArray8615[var0.anIntArray8720[var24 & 255]] |= var35 << 8;
                  ++var0.anIntArray8720[var24 & 255];
               }

               var0.anInt8715 = (Class680.anIntArray8615[var0.anInt8734 * 1605836369] >> 8) * 1842980521;
               var0.anInt8737 = 0;
               var0.anInt8715 = Class680.anIntArray8615[var0.anInt8715 * -2006950503] * 1842980521;
               var0.anInt8730 = (byte)(var0.anInt8715 * -2006950503 & 255) * -1990305417;
               var0.anInt8715 = (var0.anInt8715 * -2006950503 >> 8) * 1842980521;
               var0.anInt8737 += 1729019785;
               var0.anInt8752 = var46 * -422375223;
               method8298(var0);
               if(var0.anInt8737 * -988846407 == var0.anInt8752 * -831125127 + 1 && var0.anInt8729 * 206305741 == 0) {
                  var23 = true;
                  break;
               }

               var23 = false;
               break;
            }
         }

         return;
      }
   }

   static byte method8295(Class694 var0) {
      return (byte)method8297(8, var0);
   }

   static byte method8296(Class694 var0) {
      return (byte)method8297(1, var0);
   }

   static int method8297(int var0, Class694 var1) {
      while(var1.anInt8731 * 1562241067 < var0) {
         var1.anInt8717 = (var1.anInt8717 * 34340823 << 8 | var1.aByteArray8721[var1.anInt8722 * 1613839629] & 255) * -1625005081;
         var1.anInt8731 += -1411599336;
         var1.anInt8722 += 869063109;
         var1.anInt8723 += 96789663;
         if(var1.anInt8723 * -426821793 == 0) {
            ;
         }
      }

      int var2 = var1.anInt8717 * 34340823 >> var1.anInt8731 * 1562241067 - var0 & (1 << var0) - 1;
      var1.anInt8731 -= var0 * 1434162819;
      return var2;
   }

   static void method8298(Class694 var0) {
      byte var1 = var0.aByte8728;
      int var2 = var0.anInt8729 * 206305741;
      int var3 = var0.anInt8737 * -988846407;
      int var4 = var0.anInt8730 * -1541386169;
      int[] var5 = Class680.anIntArray8615;
      int var6 = var0.anInt8715 * -2006950503;
      byte[] var7 = var0.aByteArray8724;
      int var8 = var0.anInt8725 * 2103650831;
      int var9 = var0.anInt8726 * 2014173125;
      int var11 = var0.anInt8752 * -831125127 + 1;

      label63:
      while(true) {
         if(var2 > 0) {
            while(true) {
               if(var9 == 0) {
                  break label63;
               }

               if(var2 == 1) {
                  if(var9 == 0) {
                     var2 = 1;
                     break label63;
                  }

                  var7[var8] = var1;
                  ++var8;
                  --var9;
                  break;
               }

               var7[var8] = var1;
               --var2;
               ++var8;
               --var9;
            }
         }

         while(var3 != var11) {
            var1 = (byte)var4;
            var6 = var5[var6];
            byte var12 = (byte)var6;
            var6 >>= 8;
            ++var3;
            if(var12 != var4) {
               var4 = var12;
               if(var9 == 0) {
                  var2 = 1;
                  break label63;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            } else {
               if(var3 != var11) {
                  var2 = 2;
                  var6 = var5[var6];
                  var12 = (byte)var6;
                  var6 >>= 8;
                  ++var3;
                  if(var3 != var11) {
                     if(var12 != var4) {
                        var4 = var12;
                     } else {
                        var2 = 3;
                        var6 = var5[var6];
                        var12 = (byte)var6;
                        var6 >>= 8;
                        ++var3;
                        if(var3 != var11) {
                           if(var12 != var4) {
                              var4 = var12;
                           } else {
                              var6 = var5[var6];
                              var12 = (byte)var6;
                              var6 >>= 8;
                              ++var3;
                              var2 = (var12 & 255) + 4;
                              var6 = var5[var6];
                              var4 = (byte)var6;
                              var6 >>= 8;
                              ++var3;
                           }
                        }
                     }
                  }
                  continue label63;
               }

               if(var9 == 0) {
                  var2 = 1;
                  break label63;
               }

               var7[var8] = var1;
               ++var8;
               --var9;
            }
         }

         var2 = 0;
         break;
      }

      int var13 = var0.anInt8716 * 2031616633;
      var0.anInt8716 += (var9 - var9) * 361416649;
      if(var0.anInt8716 * 2031616633 < var13) {
         ;
      }

      var0.aByte8728 = var1;
      var0.anInt8729 = var2 * -1839621371;
      var0.anInt8737 = var3 * 1729019785;
      var0.anInt8730 = var4 * -1990305417;
      Class680.anIntArray8615 = var5;
      var0.anInt8715 = var6 * 1842980521;
      var0.aByteArray8724 = var7;
      var0.anInt8725 = var8 * -242973457;
      var0.anInt8726 = var9 * 1140952845;
   }

   static void method8299(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   public static int method8300(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class694 var5 = aClass694_8829;
      synchronized(var5) {
         aClass694_8829.aByteArray8721 = var2;
         aClass694_8829.anInt8722 = var4 * 869063109;
         aClass694_8829.aByteArray8724 = var0;
         aClass694_8829.anInt8725 = 0;
         aClass694_8829.anInt8726 = var1 * 1140952845;
         aClass694_8829.anInt8731 = 0;
         aClass694_8829.anInt8717 = 0;
         aClass694_8829.anInt8723 = 0;
         aClass694_8829.anInt8716 = 0;
         method8294(aClass694_8829);
         var1 -= aClass694_8829.anInt8726 * 2014173125;
         aClass694_8829.aByteArray8721 = null;
         aClass694_8829.aByteArray8724 = null;
         return var1;
      }
   }

   public static int method8301(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class694 var5 = aClass694_8829;
      synchronized(var5) {
         aClass694_8829.aByteArray8721 = var2;
         aClass694_8829.anInt8722 = var4 * 869063109;
         aClass694_8829.aByteArray8724 = var0;
         aClass694_8829.anInt8725 = 0;
         aClass694_8829.anInt8726 = var1 * 1140952845;
         aClass694_8829.anInt8731 = 0;
         aClass694_8829.anInt8717 = 0;
         aClass694_8829.anInt8723 = 0;
         aClass694_8829.anInt8716 = 0;
         method8294(aClass694_8829);
         var1 -= aClass694_8829.anInt8726 * 2014173125;
         aClass694_8829.aByteArray8721 = null;
         aClass694_8829.aByteArray8724 = null;
         return var1;
      }
   }

   static void method8302(Class694 var0) {
      var0.anInt8739 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(var0.aBoolArray8740[var1]) {
            var0.aByteArray8749[var0.anInt8739 * 2000726887] = (byte)var1;
            var0.anInt8739 += -1863040937;
         }
      }

   }
}
