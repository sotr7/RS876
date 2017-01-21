package com.jagex;

import com.jagex.Class10;
import com.jagex.Class113;
import com.jagex.Class149;
import com.jagex.Class195;
import com.jagex.Class199_Sub7;
import com.jagex.Class206;
import com.jagex.Class210;
import com.jagex.Class230;
import com.jagex.Class232;
import com.jagex.Class238;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class271;
import com.jagex.Class280;
import com.jagex.Class289;
import com.jagex.Class304_Sub1;
import com.jagex.Class317;
import com.jagex.Class32;
import com.jagex.Class322;
import com.jagex.Class35;
import com.jagex.Class361_Sub2;
import com.jagex.Class375;
import com.jagex.Class387;
import com.jagex.Class388;
import com.jagex.Class439;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class474;
import com.jagex.Class479;
import com.jagex.Class482;
import com.jagex.Class487;
import com.jagex.Class492;
import com.jagex.Class499;
import com.jagex.Class526_Sub21_Sub10;
import com.jagex.Class526_Sub21_Sub13;
import com.jagex.Class526_Sub21_Sub13_Sub2;
import com.jagex.Class526_Sub5;
import com.jagex.Class547;
import com.jagex.RenderDef;
import com.jagex.Class58;
import com.jagex.Class583;
import com.jagex.Class610;
import com.jagex.Class615;
import com.jagex.Class626;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.NPC;
import com.jagex.Class670;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class689;
import com.jagex.Class692;
import com.jagex.Class83;
import com.jagex.Interface59;
import com.jagex.client;
import java.awt.Container;
import java.util.HashMap;
import java.util.Iterator;

class Class152 implements Runnable {
   // $FF: synthetic field
   Class361_Sub2 this$0;

   public void run() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10284) {
               HashMap var1 = this.this$0.method9242(-1492910780);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(25L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5694((byte)115);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)101);
         }

         return;
      }
   }

   public void method1755() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10284) {
               HashMap var1 = this.this$0.method9242(-1492910780);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(25L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5694((byte)64);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)31);
         }

         return;
      }
   }

   public void method1756() {
      label36:
      while(true) {
         try {
            if(!this.this$0.aBool10284) {
               HashMap var1 = this.this$0.method9242(-1492910780);
               Iterator var2 = var1.keySet().iterator();

               while(true) {
                  Class474 var3;
                  do {
                     if(!var2.hasNext()) {
                        Class304_Sub1.method9089(25L);
                        continue label36;
                     }

                     var3 = (Class474)var2.next();
                  } while(var3.aBool5374);

                  Class479[] var4 = (Class479[])((Class479[])var1.get(var3));

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     var4[var5].method5694((byte)79);
                  }
               }
            }
         } catch (Exception var6) {
            Class375.method4671((String)null, var6, (byte)30);
         }

         return;
      }
   }

   Class152(Class361_Sub2 var1) {
      this.this$0 = var1;
   }

   public static Container method1757(byte var0) {
      return (Container)(null != Class499.aFrame5603?Class499.aFrame5603:(Class242.aFrame2454 != null?Class242.aFrame2454:Class492.anApplet5526));
   }

   static final void method1758(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class626.method7452(var3, var4, var0, -2027369625);
   }

   static final void method1759(Class681 var0, short var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class610.method7206(var3, var0, 436345877);
   }

   static final void method1760(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub20_10616.method10037((byte)-41) == 1?1:0;
   }

   static final void method1761(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class238 var3 = (Class238)Class113.aClass40_Sub6_1371.method89(var2, -1867434211);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1056556293 * var3.anInt2400;
   }

   public static int method1762(int var0, int var1) {
      Class526_Sub21_Sub10 var2 = (Class526_Sub21_Sub10)Class280.aClass20_3036.get((long)var0);
      return null == var2?-1:(Class280.aClass696_3038.aClass526_Sub21_8758 == var2.aClass526_Sub21_10532?-1:((Class526_Sub21_Sub10)var2.aClass526_Sub21_10532).anInt11729 * 731545197);
   }

   static final void method1763(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2521 = Class615.method7280(var4, var2, -1986346121);
      var0.aBool2560 = true;
   }

   static boolean method1764(Interface59 var0, int var1) {
      Class610 var2 = (Class610)client.aClass505_11204.method6066(-631188979).method89(var0.method56(-203784618), -2043834154);
      if(-1 == var2.anInt7970 * -549491903) {
         return true;
      } else {
         Class35 var3 = (Class35)Class32.aClass40_Sub3_361.method89(var2.anInt7970 * -549491903, -1357406788);
         return 322011983 * var3.anInt373 == -1?true:var3.method828(-1547339128);
      }
   }

   static final void method1765(byte var0) {
      int var1 = Class583.anInt7782 * -142358016 + 256;
      int var2 = Class526_Sub5.anInt10388 * -1570243072 + 256;
      int var3 = Class387.method4762(var1, var2, Class692.anInt8703 * -395336755, 2002977125) - Class199_Sub7.anInt9911 * 1962751689;
      if(1773890933 * Class242.anInt2455 >= 100) {
         Class439.anInt4866 = Class583.anInt7782 * -12133888 + -253564672;
         Class210.anInt2259 = -307852800 * Class526_Sub5.anInt10388 + -97993984;
         Class322.anInt3458 = (Class387.method4762(822351193 * Class439.anInt4866, Class210.anInt2259 * 1215159411, Class692.anInt8703 * -395336755, 1582334277) - Class199_Sub7.anInt9911 * 1962751689) * 1608934313;
      } else {
         if(Class439.anInt4866 * 822351193 < var1) {
            Class439.anInt4866 += (-216218513 * Class271.anInt2999 + Class242.anInt2455 * 1773890933 * (var1 - Class439.anInt4866 * 822351193) / 1000) * 1307632361;
            if(822351193 * Class439.anInt4866 > var1) {
               Class439.anInt4866 = var1 * 1307632361;
            }
         }

         if(822351193 * Class439.anInt4866 > var1) {
            Class439.anInt4866 -= (1773890933 * Class242.anInt2455 * (Class439.anInt4866 * 822351193 - var1) / 1000 + -216218513 * Class271.anInt2999) * 1307632361;
            if(822351193 * Class439.anInt4866 < var1) {
               Class439.anInt4866 = 1307632361 * var1;
            }
         }

         if(1323364505 * Class322.anInt3458 < var3) {
            Class322.anInt3458 += 1608934313 * (Class271.anInt2999 * -216218513 + 1773890933 * Class242.anInt2455 * (var3 - 1323364505 * Class322.anInt3458) / 1000);
            if(Class322.anInt3458 * 1323364505 > var3) {
               Class322.anInt3458 = var3 * 1608934313;
            }
         }

         if(1323364505 * Class322.anInt3458 > var3) {
            Class322.anInt3458 -= 1608934313 * (Class242.anInt2455 * 1773890933 * (1323364505 * Class322.anInt3458 - var3) / 1000 + -216218513 * Class271.anInt2999);
            if(Class322.anInt3458 * 1323364505 < var3) {
               Class322.anInt3458 = var3 * 1608934313;
            }
         }

         if(1215159411 * Class210.anInt2259 < var2) {
            Class210.anInt2259 += -2013648709 * ((var2 - 1215159411 * Class210.anInt2259) * Class242.anInt2455 * 1773890933 / 1000 + Class271.anInt2999 * -216218513);
            if(Class210.anInt2259 * 1215159411 > var2) {
               Class210.anInt2259 = -2013648709 * var2;
            }
         }

         if(1215159411 * Class210.anInt2259 > var2) {
            Class210.anInt2259 -= -2013648709 * (Class242.anInt2455 * 1773890933 * (Class210.anInt2259 * 1215159411 - var2) / 1000 + -216218513 * Class271.anInt2999);
            if(Class210.anInt2259 * 1215159411 < var2) {
               Class210.anInt2259 = var2 * -2013648709;
            }
         }
      }

      var1 = 1759028736 * Class289.anInt3117 + 256;
      var2 = Class482.anInt5484 * -1744620032 + 256;
      var3 = Class387.method4762(var1, var2, Class692.anInt8703 * -395336755, 1456073716) - -1207730477 * Class265.anInt2975;
      int var4 = var1 - Class439.anInt4866 * 822351193;
      int var5 = var3 - Class322.anInt3458 * 1323364505;
      int var6 = var2 - 1215159411 * Class210.anInt2259;
      int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
      int var8 = (int)(Math.atan2((double)var5, (double)var7) * 2607.5945876176133D) & 16383;
      int var9 = (int)(Math.atan2((double)var4, (double)var6) * -2607.5945876176133D) & 16383;
      if(var8 < 1024) {
         var8 = 1024;
      }

      if(var8 > 3072) {
         var8 = 3072;
      }

      if(1962594051 * Class487.anInt5511 < var8) {
         Class487.anInt5511 += (-1476824933 * Class83.anInt846 + (var8 - Class487.anInt5511 * 1962594051 >> 3) * Class10.anInt63 * 398115341 / 1000 << 3) * -567045205;
         if(1962594051 * Class487.anInt5511 > var8) {
            Class487.anInt5511 = -567045205 * var8;
         }
      }

      if(Class487.anInt5511 * 1962594051 > var8) {
         Class487.anInt5511 -= -567045205 * (-1476824933 * Class83.anInt846 + Class10.anInt63 * 398115341 * (1962594051 * Class487.anInt5511 - var8 >> 3) / 1000 << 3);
         if(Class487.anInt5511 * 1962594051 < var8) {
            Class487.anInt5511 = var8 * -567045205;
         }
      }

      int var10 = var9 - Class317.anInt3410 * -871798227;
      if(var10 > 8192) {
         var10 -= 16384;
      }

      if(var10 < -8192) {
         var10 += 16384;
      }

      var10 >>= 3;
      if(var10 > 0) {
         Class317.anInt3410 += -1157073499 * (398115341 * Class10.anInt63 * var10 / 1000 + Class83.anInt846 * -1476824933 << 3);
         Class317.anInt3410 = (-871798227 * Class317.anInt3410 & 16383) * -1157073499;
      }

      if(var10 < 0) {
         Class317.anInt3410 -= -1157073499 * (-1476824933 * Class83.anInt846 + 398115341 * Class10.anInt63 * -var10 / 1000 << 3);
         Class317.anInt3410 = (Class317.anInt3410 * -871798227 & 16383) * -1157073499;
      }

      int var11 = var9 - Class317.anInt3410 * -871798227;
      if(var11 > 8192) {
         var11 -= 16384;
      }

      if(var11 < -8192) {
         var11 += 16384;
      }

      if(var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
         Class317.anInt3410 = -1157073499 * var9;
      }

      Class547.anInt7272 = 0;
   }

   static final void method1766(Class639_Sub1_Sub2_Sub1 var0, boolean var1, int var2) {
      RenderDef var3 = var0.method10786(-16777216);
      if(0 == var0.anInt11943 * -577323399) {
         var0.anInt11957 = 0;
         Class232.anInt2367 = MovementDirection.aClass683_8651.id * 1522213543;
         Class58.anInt721 = 0;
      } else {
         if(var0.aClass704_11915.method8218((byte)-123) && !var0.aClass704_11915.method8227((byte)59)) {
            Class206 var4 = var0.aClass704_11915.method8219((byte)23);
            if(-1360714979 * var0.anInt11948 > 0 && 0 == 796997263 * var4.anInt2236) {
               var0.anInt11957 += 1890564681;
               Class232.anInt2367 = 1522213543 * MovementDirection.aClass683_8651.id;
               Class58.anInt721 = 0;
               return;
            }

            if(-1360714979 * var0.anInt11948 <= 0 && 0 == var4.anInt2237 * -571300867) {
               var0.anInt11957 += 1890564681;
               Class232.anInt2367 = MovementDirection.aClass683_8651.id * 1522213543;
               Class58.anInt721 = 0;
               return;
            }
         }

         for(int var18 = 0; var18 < var0.aClass510Array11906.length; ++var18) {
            if(901715121 * var0.aClass510Array11906[var18].anInt6980 != -1 && var0.aClass510Array11906[var18].aClass704_6979.method8227((byte)23)) {
               Class670 var5 = (Class670)Class689.aClass40_Sub12_8692.method89(var0.aClass510Array11906[var18].anInt6980 * 901715121, -52605449);
               if(var5.aBool8552 && 1305328919 * var5.anInt8550 != -1) {
                  Class206 var6 = (Class206)Class388.aClass40_Sub15_4063.method89(var5.anInt8550 * 1305328919, -1602378539);
                  if(-1360714979 * var0.anInt11948 > 0 && 0 == var6.anInt2236 * 796997263) {
                     var0.anInt11957 += 1890564681;
                     Class232.anInt2367 = MovementDirection.aClass683_8651.id * 1522213543;
                     Class58.anInt721 = 0;
                     return;
                  }

                  if(-1360714979 * var0.anInt11948 <= 0 && var6.anInt2237 * -571300867 == 0) {
                     var0.anInt11957 += 1890564681;
                     Class232.anInt2367 = MovementDirection.aClass683_8651.id * 1522213543;
                     Class58.anInt721 = 0;
                     return;
                  }
               }
            }
         }

         Class446 var19 = Class446.method5305(var0.method7635().aClass446_4816);
         int var20 = (int)var19.aFloat4917;
         int var21 = (int)var19.aFloat4919;
         int var7 = 512 * var0.screenX[var0.anInt11943 * -577323399 - 1] + var0.method10781(-627148024) * 256;
         int var8 = var0.screenY[var0.anInt11943 * -577323399 - 1] * 512 + var0.method10781(-627148024) * 256;
         if(var20 < var7) {
            if(var21 < var8) {
               var0.method10771(10240, 1228654554);
            } else if(var21 > var8) {
               var0.method10771(14336, 1194757336);
            } else {
               var0.method10771(12288, 578203885);
            }
         } else if(var20 > var7) {
            if(var21 < var8) {
               var0.method10771(6144, 177963850);
            } else if(var21 > var8) {
               var0.method10771(2048, 1006152020);
            } else {
               var0.method10771(4096, 228187239);
            }
         } else if(var21 < var8) {
            var0.method10771(8192, 404729768);
         } else if(var21 > var8) {
            var0.method10771(0, 651449081);
         }

         byte var9 = var0.aByteArray11946[var0.anInt11943 * -577323399 - 1];
         if(var1 || var7 - var20 <= 1024 && var7 - var20 >= -1024 && var8 - var21 <= 1024 && var8 - var21 >= -1024) {
            int var10 = 16;
            boolean var11 = true;
            if(var0 instanceof NPC) {
               var11 = ((NPC)var0).def.slowWalk;
            }

            int var12;
            if(var11) {
               var12 = 2144242701 * var0.anInt11931 - var0.aClass34_11940.anInt370 * 604797385;
               if(0 != var12 && -1 == 1208301397 * var0.anInt11911 && var0.anInt11938 * -1313691021 != 0) {
                  var10 = 8;
               }

               if(!var1 && -577323399 * var0.anInt11943 > 2) {
                  var10 = 24;
               }

               if(!var1 && -577323399 * var0.anInt11943 > 3) {
                  var10 = 32;
               }
            } else {
               if(!var1 && var0.anInt11943 * -577323399 > 1) {
                  var10 = 24;
               }

               if(!var1 && -577323399 * var0.anInt11943 > 2) {
                  var10 = 32;
               }
            }

            if(var0.anInt11957 * -23242759 > 0 && -577323399 * var0.anInt11943 > 1) {
               var10 = 32;
               var0.anInt11957 -= 1890564681;
            }

            if(MovementDirection.RUNNING.id == var9) {
               var10 <<= 1;
            } else if(var9 == MovementDirection.TELEPORTING.id) {
               var10 >>= 1;
            }

            if(-1491200215 * var3.anInt7731 != -1) {
               var10 <<= 9;
               if(1 == -577323399 * var0.anInt11943) {
                  var12 = var0.anInt11949 * 1892933239 * var0.anInt11949 * 1892933239;
                  int var13 = ((int)var19.aFloat4917 > var7?(int)var19.aFloat4917 - var7:var7 - (int)var19.aFloat4917) << 9;
                  int var14 = ((int)var19.aFloat4919 > var8?(int)var19.aFloat4919 - var8:var8 - (int)var19.aFloat4919) << 9;
                  int var15 = var13 > var14?var13:var14;
                  int var16 = var15 * 1312566866 * var3.anInt7731;
                  if(var12 > var16) {
                     var0.anInt11949 = -1587586233 * (var0.anInt11949 * 1892933239 / 2);
                  } else if(var12 / 2 > var15) {
                     var0.anInt11949 -= 1825242975 * var3.anInt7731;
                     if(var0.anInt11949 * 1892933239 < 0) {
                        var0.anInt11949 = 0;
                     }
                  } else if(1892933239 * var0.anInt11949 < var10) {
                     var0.anInt11949 += var3.anInt7731 * 1825242975;
                     if(var0.anInt11949 * 1892933239 > var10) {
                        var0.anInt11949 = -1587586233 * var10;
                     }
                  }
               } else if(var0.anInt11949 * 1892933239 < var10) {
                  var0.anInt11949 += var3.anInt7731 * 1825242975;
                  if(1892933239 * var0.anInt11949 > var10) {
                     var0.anInt11949 = -1587586233 * var10;
                  }
               } else if(var0.anInt11949 * 1892933239 > 0) {
                  var0.anInt11949 -= var3.anInt7731 * 1825242975;
                  if(var0.anInt11949 * 1892933239 < 0) {
                     var0.anInt11949 = 0;
                  }
               }

               var10 = var0.anInt11949 * 1892933239 >> 9;
               if(var10 < 1) {
                  var10 = 1;
               }
            }

            Class58.anInt721 = 0;
            if(var20 == var7 && var8 == var21) {
               Class232.anInt2367 = 1522213543 * MovementDirection.aClass683_8651.id;
            } else {
               if(var20 < var7) {
                  var19.aFloat4917 += (float)var10;
                  Class58.anInt721 = 925810089 * (-1275644263 * Class58.anInt721 | 4);
                  if(var19.aFloat4917 > (float)var7) {
                     var19.aFloat4917 = (float)var7;
                  }
               } else if(var20 > var7) {
                  var19.aFloat4917 -= (float)var10;
                  Class58.anInt721 = 925810089 * (Class58.anInt721 * -1275644263 | 8);
                  if(var19.aFloat4917 < (float)var7) {
                     var19.aFloat4917 = (float)var7;
                  }
               }

               if(var21 < var8) {
                  var19.aFloat4919 += (float)var10;
                  Class58.anInt721 = (Class58.anInt721 * -1275644263 | 1) * 925810089;
                  if(var19.aFloat4919 > (float)var8) {
                     var19.aFloat4919 = (float)var8;
                  }
               } else if(var21 > var8) {
                  var19.aFloat4919 -= (float)var10;
                  Class58.anInt721 = 925810089 * (Class58.anInt721 * -1275644263 | 2);
                  if(var19.aFloat4919 < (float)var8) {
                     var19.aFloat4919 = (float)var8;
                  }
               }

               var0.method7632(var19);
               if(var10 >= 32) {
                  Class232.anInt2367 = MovementDirection.RUNNING.id * 1522213543;
               } else {
                  Class232.anInt2367 = var9 * 1522213543;
               }
            }

            if(var7 == (int)var19.aFloat4917 && var8 == (int)var19.aFloat4919) {
               var0.anInt11943 -= -808498231;
               if(var0.anInt11948 * -1360714979 > 0) {
                  var0.anInt11948 -= 141473589;
               }
            }

            var19.method5278();
         } else {
            var0.method7618((float)var7, var19.aFloat4915, (float)var8);
            var0.turn(var0.anInt11931 * 2144242701, false, 87658788);
            var0.anInt11943 -= -808498231;
            if(var0.anInt11948 * -1360714979 > 0) {
               var0.anInt11948 -= 141473589;
            }

            Class232.anInt2367 = 1522213543 * MovementDirection.aClass683_8651.id;
            Class58.anInt721 = 0;
            var19.method5278();
         }
      }
   }

   static final void method1767(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      float var3 = Class443.method5200(var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1]);
      Class526_Sub21_Sub13 var4 = Class195.aClass292_Sub1_2182.method3908(var2, -43631542);
      if(null == var4) {
         throw new RuntimeException("");
      } else if(!(var4 instanceof Class526_Sub21_Sub13_Sub2)) {
         throw new RuntimeException("");
      } else {
         ((Class526_Sub21_Sub13_Sub2)var4).method10911(var3, (byte)91);
      }
   }
}
