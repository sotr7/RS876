package com.jagex;

import com.jagex.Class10;
import com.jagex.Class105;
import com.jagex.Class113;
import com.jagex.Class149;
import com.jagex.Class174;
import com.jagex.Class184_Sub2;
import com.jagex.Class199_Sub12;
import com.jagex.Class210;
import com.jagex.Class230;
import com.jagex.Class238;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class265;
import com.jagex.Class277;
import com.jagex.Class289;
import com.jagex.Class304_Sub1;
import com.jagex.Class317;
import com.jagex.Class322;
import com.jagex.Class327;
import com.jagex.Class380;
import com.jagex.Class387;
import com.jagex.Class439;
import com.jagex.Class451;
import com.jagex.Class452_Sub5;
import com.jagex.Class466;
import com.jagex.Class470;
import com.jagex.Class482;
import com.jagex.Class487;
import com.jagex.Class519;
import com.jagex.Class523;
import com.jagex.Class526_Sub25;
import com.jagex.Class526_Sub29_Sub1;
import com.jagex.Class547;
import com.jagex.Class549;
import com.jagex.Class576;
import com.jagex.Class596;
import com.jagex.Class605;
import com.jagex.Class610;
import com.jagex.Class615;
import com.jagex.Class618;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class68;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class83;
import com.jagex.Class9_Sub1;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface23;
import com.jagex.Interface7;
import com.jagex.client;

public class Class605_Sub1 extends Class605 implements Interface7 {
   Class466 aClass466_10691;

   public Interface12 method64(int var1, Interface14 var2, int var3) {
      return new Class610(var1, this, var2);
   }

   Class605_Sub1(boolean var1, Class466 var2, Class673 var3, Class676 var4) {
      super(var1, var3, var4);
      this.aClass466_10691 = var2;
   }

   public Class method59(int var1) {
      return Class610.class;
   }

   public Class method62() {
      return Class610.class;
   }

   boolean method7104(int var1, int var2) {
      Class466 var3 = this.aClass466_10691;
      synchronized(var3) {
         return this.aClass466_10691.method5530(var1, 0, 1878086570);
      }
   }

   public Interface12 method61(int var1, Interface14 var2) {
      return new Class610(var1, this, var2);
   }

   byte[] method7110(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5536(var1, 0, (byte)-28);
      }
   }

   byte[] method7107(int var1, byte var2) {
      Class466 var3 = this.aClass466_10691;
      synchronized(var3) {
         return this.aClass466_10691.method5536(var1, 0, (byte)-11);
      }
   }

   public Class method60() {
      return Class610.class;
   }

   byte[] method7118(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5536(var1, 0, (byte)-89);
      }
   }

   public Class method63() {
      return Class610.class;
   }

   byte[] method7111(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5536(var1, 0, (byte)85);
      }
   }

   byte[] method7112(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5536(var1, 0, (byte)39);
      }
   }

   boolean method7114(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5530(var1, 0, 2128966047);
      }
   }

   boolean method7115(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5530(var1, 0, 1854880022);
      }
   }

   boolean method7116(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5530(var1, 0, 1941058931);
      }
   }

   boolean method7113(int var1) {
      Class466 var2 = this.aClass466_10691;
      synchronized(var2) {
         return this.aClass466_10691.method5530(var1, 0, 1640380936);
      }
   }

   static boolean method9743(Class174 var0, int var1, byte var2) {
      var0.method2312();
      Class255.time((byte)24);
      if(!var0.method2324((byte)-76)) {
         return false;
      } else {
         int var3 = client.aClass505_11204.method6056(-1746741811);
         int var4 = client.aClass505_11204.method6057(126749238);
         Class470 var5 = client.aClass505_11204.method6094((byte)62);
         Class549 var6 = client.aClass505_11204.method6072(-514239118);
         int var7 = var1;
         if(Class451.localPlayer != null) {
            int var8 = Class451.localPlayer.screenX[0] >> 3;
            int var9 = Class451.localPlayer.screenY[0] >> 3;
            if(var8 >= 0 && var8 < Class105.aBoolArrayArray1306.length && var9 >= 0 && var9 < Class105.aBoolArrayArray1306[var8].length && Class105.aBoolArrayArray1306[var8][var9]) {
               var7 = 0;
            }
         }

         int var10 = var3 / 2;
         byte var11 = 0;
         byte var12 = 0;
         boolean var13 = true;

         int var14;
         int var16;
         for(var14 = var11; var14 < var3 + var11; ++var14) {
            for(int var15 = var12; var15 < var4 + var12; ++var15) {
               for(var16 = var7; var16 <= 3; ++var16) {
                  if(var16 < var1 || var5.method5615(var1, var16, var14, var15, 439311254)) {
                     int var17 = var16;
                     if(var5.method5614(var14, var15, 1677448648)) {
                        var17 = var16 - 1;
                     }

                     if(var17 >= 0) {
                        var13 &= Class618.method7322(var17, var14, var15, (byte)-97);
                     }
                  }
               }
            }
         }

         if(!var13) {
            return false;
         } else {
            var14 = 48 + 4 * var3 + 48;
            int[] var40 = new int[var14 * var14];

            for(var16 = 0; var16 < var40.length; ++var16) {
               var40[var16] = 0;
            }

            Class184_Sub2 var41 = null;
            byte var42 = 0;
            byte var18 = 0;
            if(Class105.aBool1294) {
               Class68.aClass153_782 = var0.method2307(var14, var14, false, true);
               var41 = var0.method2257();
               var41.method8465(0, Class68.aClass153_782.method1773());
               Interface23 var19 = var0.method2263(var14, var14);
               var41.method8476(var19);
               var0.method2623(var41, (short)128);
               var10 = var3;
               var42 = 48;
               var18 = 48;
               var0.method2283(1, 0);
            } else {
               Class68.aClass153_782 = var0.method2515(var40, 0, var14, var14, var14, (byte)3);
            }

            client.aClass505_11204.method6100((byte)-8).method7384(-1806119284);
            int var43 = -16777216 | (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
            int var20 = -16777216 | 238 + (int)(Math.random() * 20.0D) - 10 << 16;
            int var21 = (int)(Math.random() * 8.0D) << 16 | (int)(Math.random() * 8.0D) << 8 | (int)(Math.random() * 8.0D);
            boolean[][] var22 = new boolean[var10 + 1 + 2][var10 + 1 + 2];
            var0.method2276(Class105.anIntArray1293);
            var0.method2274();

            int var25;
            int var26;
            int var27;
            int var28;
            for(int var23 = var11; var23 < var11 + var3; var23 += var10) {
               for(int var24 = var12; var24 < var12 + var4; var24 += var10) {
                  var25 = var42;
                  var26 = var18;
                  var27 = var23;
                  if(var23 > 0) {
                     var27 = var23 - 1;
                     var25 = var42 + 4;
                  }

                  var28 = var24;
                  if(var24 > 0) {
                     var28 = var24 - 1;
                  }

                  int var29 = var23 + var10;
                  if(var29 < var3) {
                     ++var29;
                  }

                  int var30 = var24 + var10;
                  if(var30 < var4) {
                     ++var30;
                     var26 = var18 + 4;
                  }

                  if(Class105.aBool1291) {
                     var0.method2278();
                  } else {
                     var0.method2538(0, 0, var25 + 4 * var10, var26 + 4 * var10);
                  }

                  var0.method2283(3, -16777216);
                  int var31 = var10;
                  if(var10 > var3 - 1) {
                     var31 = var3 - 1;
                  }

                  for(int var32 = var7; var32 <= 3; ++var32) {
                     int var33;
                     int var34;
                     for(var33 = 0; var33 <= var31; ++var33) {
                        for(var34 = 0; var34 <= var31; ++var34) {
                           var22[var33][var34] = var32 < var1 || var5.method5615(var1, var32, var33 + var27, var28 + var34, -1647810966);
                        }
                     }

                     var6.aClass148Array7290[var32].method1719(var42, var18, 1024, var27, var28, var29, var30, var22);

                     for(var33 = -4; var33 < var10; ++var33) {
                        for(var34 = -4; var34 < var10; ++var34) {
                           int var35 = var23 + var33;
                           int var36 = var24 + var34;
                           if(var35 >= var11 && var36 >= var12 && (var32 < var1 || var5.method5615(var1, var32, var35, var36, 1453792647))) {
                              int var37 = var32;
                              if(var5.method5614(var35, var36, -892874935)) {
                                 var37 = var32 - 1;
                              }

                              if(var37 >= 0) {
                                 Class230.method3180(var0, var37, var35, var36, var25 + var33 * 4, (var10 - var34) * 4 + var26 - 4, var43, var20, 146096018);
                              }
                           }
                        }
                     }
                  }

                  var0.method2290(var25, var26, var10 * 4, var10 * 4, var21, 2);
                  var0.method2312();
                  if(!Class105.aBool1294) {
                     Class68.aClass153_782.method1776((var23 - var11) * 4 + 48, 48 + 4 * var4 - (var24 - var12) * 4 - 4 * var10, var10 * 4, 4 * var10, var25, var26);
                     if(Class105.aBool1291) {
                        Class68.aClass153_782.method1778(256, 0);

                        try {
                           var0.method2229((byte)-44);
                           Class304_Sub1.method9089(2000L);
                        } catch (Exception var39) {
                           ;
                        }
                     }
                  }
               }
            }

            if(Class105.aBool1294) {
               var0.method2456(var41, (byte)0);
               if(Class105.aBool1291) {
                  Class68.aClass153_782.method1778(256, 0);

                  try {
                     var0.method2229((byte)-29);
                     Class304_Sub1.method9089(2000L);
                  } catch (Exception var38) {
                     ;
                  }
               }
            }

            var0.method2278();
            var0.method2573(Class105.anIntArray1293[0], Class105.anIntArray1293[1], Class105.anIntArray1293[2], Class105.anIntArray1293[3]);
            var0.method2283(1, 1);
            Class9_Sub1.method10244(-784188836);
            Class105.anInt1295 = 0;
            Class105.aClass702_1299.method8188(1437696679);
            if(!Class105.aBool1303) {
               Class380.method4706(var1, (byte)-83);
               Class519 var44 = client.aClass505_11204.method6058((byte)28);
               if(var44 != null) {
                  Class113.aClass40_Sub6_1371.method10253(1024, 64, -1629443606);
                  Class596 var45 = client.aClass505_11204.method6128(2002842647);

                  for(var25 = 0; var25 < var44.anInt7044 * -1277967837; ++var25) {
                     var26 = var44.anIntArray7043[var25];
                     if(var26 >> 28 == Class451.localPlayer.aByte10827) {
                        var27 = (var26 >> 14 & 16383) - -814686591 * var45.localX;
                        var28 = (var26 & 16383) - -845789331 * var45.localY;
                        if(var27 >= 0 && var27 < var3 && var28 >= 0 && var28 < var4) {
                           Class105.aClass702_1299.method8176(new Class526_Sub25(var25), -803496961);
                        } else {
                           Class238 var46 = (Class238)Class113.aClass40_Sub6_1371.method89(var44.anIntArray7045[var25], -886227915);
                           if(null != var46.anIntArray2432 && var27 + -1735224795 * var46.anInt2435 >= 0 && var46.anInt2426 * 349750275 + var27 < var3 && 759879505 * var46.anInt2429 + var28 >= 0 && var28 + -1261408391 * var46.anInt2427 < var4) {
                              Class105.aClass702_1299.method8176(new Class526_Sub25(var25), -472262719);
                           }
                        }
                     }
                  }

                  Class113.aClass40_Sub6_1371.method10253(128, 64, -1807874570);
               }
            }

            return true;
         }
      }
   }

   static final void method9744(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2518 = Class615.method7280(var4, var2, -663261263);
      var0.aBool2560 = true;
   }

   public static final void method9745(int var0, int var1, int var2, int var3, int var4, byte var5) {
      Class289.anInt3117 = var0 * 199800795;
      Class482.anInt5484 = -2013496173 * var1;
      Class265.anInt2975 = var2 * -659453605;
      Class83.anInt846 = var3 * 687928723;
      Class10.anInt63 = 381443269 * var4;
      if(Class327.anInt3488 * -265840483 == 2) {
         Class199_Sub12.method9013((byte)11);
      }

      if(Class10.anInt63 * 398115341 >= 100) {
         int var6 = 256 + Class289.anInt3117 * 1759028736;
         int var7 = 256 + Class482.anInt5484 * -1744620032;
         int var8 = Class387.method4762(var6, var7, -395336755 * Class692.anInt8703, 1028508599) - Class265.anInt2975 * -1207730477;
         int var9 = var6 - Class439.anInt4866 * 822351193;
         int var10 = var8 - Class322.anInt3458 * 1323364505;
         int var11 = var7 - Class210.anInt2259 * 1215159411;
         int var12 = (int)Math.sqrt((double)(var11 * var11 + var9 * var9));
         Class487.anInt5511 = ((int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D) & 16383) * -567045205;
         Class317.anInt3410 = ((int)(Math.atan2((double)var9, (double)var11) * -2607.5945876176133D) & 16383) * -1157073499;
         Class547.anInt7272 = 0;
         if(1962594051 * Class487.anInt5511 < 1024) {
            Class487.anInt5511 = -833704960;
         }

         if(Class487.anInt5511 * 1962594051 > 3072) {
            Class487.anInt5511 = 1793852416;
         }
      }

      Class327.anInt3488 = -1593636577;
      Class576.anInt7740 = 1775818497;
      Class277.anInt3029 = -1852613725;
   }

   public static void method9746(int var0, short var1) {
      Class452_Sub5.anInt10358 = -863046485 * var0;
      Class526_Sub29_Sub1.aClass526_Sub29_Sub1Array11760 = new Class526_Sub29_Sub1[var0];
      Class523.anInt7076 = 0;
   }
}
