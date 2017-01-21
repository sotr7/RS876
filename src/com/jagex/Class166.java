package com.jagex;

import com.jagex.Class1;
import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class116;
import com.jagex.Class16;
import com.jagex.Class219;
import com.jagex.Class238;
import com.jagex.Class253;
import com.jagex.Class255;
import com.jagex.Class289;
import com.jagex.Class31;
import com.jagex.Class311;
import com.jagex.Class380;
import com.jagex.OutFrame;
import com.jagex.Class41;
import com.jagex.Class452_Sub4;
import com.jagex.Class46;
import com.jagex.Class504;
import com.jagex.Class509;
import com.jagex.Class525;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class526_Sub23_Sub4;
import com.jagex.Class526_Sub25;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub6;
import com.jagex.Class581;
import com.jagex.Class582;
import com.jagex.Class636;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class695;
import com.jagex.Class697;
import com.jagex.Class71;
import com.jagex.Class711_Sub36;
import com.jagex.Class8;
import com.jagex.client;
import java.util.Iterator;
import java.util.Map.Entry;

public class Class166 {
   static Class166 aClass166_1890 = new Class166(2, 1);
   static Class166 aClass166_1885 = new Class166(3, 2);
   static Class166 aClass166_1886 = new Class166(7, 4);
   public static Class166 aClass166_1884 = new Class166(6, 1);
   public static Class166 aClass166_1888 = new Class166(4, 2);
   public static Class166 aClass166_1889 = new Class166(8, 3);
   public static Class166 aClass166_1894 = new Class166(5, 4);
   public static Class166 aClass166_1893 = new Class166(1, 2);
   public static Class166 aClass166_1892 = new Class166(0, 4);
   public int anInt1887;
   public int anInt1891;

   Class166(int var1, int var2) {
      this.anInt1887 = -511949925 * var1;
      this.anInt1891 = var2 * -636793593;
   }

   static int method1932(int var0) {
      if(null == client.aClass245_11003) {
         if(!Class31.aBool291) {
            if(Class253.aClass627_2794.aBool8194) {
               if(Class31.aClass526_Sub21_Sub6_275 != null) {
                  return Class31.aClass526_Sub21_Sub6_275.anInt11651 * -363328245;
               }
            } else if(Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631 != null) {
               return Class526_Sub23_Sub4.aClass526_Sub21_Sub6_11631.anInt11651 * -363328245;
            }
         } else {
            Class1 var1 = Class526_Sub6.method9340(-1938012974);
            int var2 = Class8.aClass547_45.method6534(1328544110);
            int var3 = Class8.aClass547_45.method6531(-102040949);
            int var4;
            int var5;
            int var6;
            Class526_Sub21_Sub6 var7;
            if(!Class31.aBool266) {
               if(var2 > Class41.anInt450 * 1183999269 && var2 < Class219.anInt2295 * 2110689557 + Class41.anInt450 * 1183999269) {
                  var4 = -1;

                  for(var5 = 0; var5 < Class31.anInt273 * 1600532433; ++var5) {
                     if(Class31.aBool302) {
                        var6 = Class31.anInt262 * 414128345 * (1600532433 * Class31.anInt273 - 1 - var5) + var1.anInt12 * 96898447 + Class679.anInt8602 * 1581495531 + 20 + 1;
                        if(var3 > var6 - var1.anInt12 * 96898447 - 1 && var3 < var1.anInt14 * -1329402501 + var6) {
                           var4 = var5;
                        }
                     } else {
                        var6 = Class31.anInt262 * 414128345 * (Class31.anInt273 * 1600532433 - 1 - var5) + 31 + 1581495531 * Class679.anInt8602;
                        if(var3 > var6 - 96898447 * var1.anInt12 - 1 && var3 < var6 + -1329402501 * var1.anInt14) {
                           var4 = var5;
                        }
                     }
                  }

                  if(var4 != -1) {
                     var5 = 0;
                     Class695 var8 = new Class695(Class31.aClass702_292);

                     for(var7 = (Class526_Sub21_Sub6)var8.method8120(-1190935274); var7 != null; var7 = (Class526_Sub21_Sub6)var8.next()) {
                        if(var5++ == var4) {
                           return -363328245 * var7.anInt11651;
                        }
                     }
                  }
               }
            } else {
               Class697 var9;
               if(var2 > 1183999269 * Class41.anInt450 && var2 < Class219.anInt2295 * 2110689557 + Class41.anInt450 * 1183999269) {
                  var4 = -1;

                  for(var5 = 0; var5 < -1345788195 * Class31.anInt274; ++var5) {
                     if(Class31.aBool302) {
                        var6 = var5 * Class31.anInt262 * 414128345 + 1 + var1.anInt12 * 96898447 + 20 + Class679.anInt8602 * 1581495531;
                        if(var3 > var6 - 96898447 * var1.anInt12 - 1 && var3 < var6 + -1329402501 * var1.anInt14) {
                           var4 = var5;
                        }
                     } else {
                        var6 = 31 + 1581495531 * Class679.anInt8602 + var5 * Class31.anInt262 * 414128345;
                        if(var3 > var6 - var1.anInt12 * 96898447 - 1 && var3 < -1329402501 * var1.anInt14 + var6) {
                           var4 = var5;
                        }
                     }
                  }

                  if(var4 != -1) {
                     var5 = 0;
                     var9 = new Class697(Class31.aClass696_287);

                     for(Class526_Sub21_Sub7 var10 = (Class526_Sub21_Sub7)var9.method8149(-1546802232); var10 != null; var10 = (Class526_Sub21_Sub7)var9.next()) {
                        if(var5++ == var4) {
                           return -363328245 * ((Class526_Sub21_Sub6)var10.aClass696_11662.aClass526_Sub21_8758.aClass526_Sub21_10531).anInt11651;
                        }
                     }
                  }
               } else if(null != Class31.aClass526_Sub21_Sub7_267 && var2 > -679993307 * Class711_Sub36.anInt10917 && var2 < -1423746299 * Class526_Sub25.anInt10551 + Class711_Sub36.anInt10917 * -679993307) {
                  var4 = -1;

                  for(var5 = 0; var5 < -1095890769 * Class31.aClass526_Sub21_Sub7_267.anInt11664; ++var5) {
                     if(Class31.aBool302) {
                        var6 = 414128345 * Class31.anInt262 * var5 + 20 + Class311.anInt3384 * 660573447 + var1.anInt12 * 96898447 + 1;
                        if(var3 > var6 - 96898447 * var1.anInt12 - 1 && var3 < -1329402501 * var1.anInt14 + var6) {
                           var4 = var5;
                        }
                     } else {
                        var6 = 414128345 * Class31.anInt262 * var5 + 660573447 * Class311.anInt3384 + 31;
                        if(var3 > var6 - var1.anInt12 * 96898447 - 1 && var3 < -1329402501 * var1.anInt14 + var6) {
                           var4 = var5;
                        }
                     }
                  }

                  if(var4 != -1) {
                     var5 = 0;
                     var9 = new Class697(Class31.aClass526_Sub21_Sub7_267.aClass696_11662);

                     for(var7 = (Class526_Sub21_Sub6)var9.method8149(-103942473); null != var7; var7 = (Class526_Sub21_Sub6)var9.next()) {
                        if(var5++ == var4) {
                           return var7.anInt11651 * -363328245;
                        }
                     }
                  }
               }
            }
         }
      }

      return -1;
   }

   static final void method1933(Class681 var0, int var1) {
      if((0 == client.anInt11038 * -558705405 || 9 == client.anInt11038 * -558705405) && !Class509.method6166(-1813112198)) {
         if(Class16.aBool174) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         } else if(-5901831343202857847L * Class289.aLong3116 > Class255.time((byte)24) - 1000L) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
         } else {
            Class16.aBool174 = true;
            Class111 var2 = Class452_Sub4.method9295((byte)38);
            OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4271, var2.aClass14_1342, -619292329);
            var3.out.writeInt(Class582.anInt7777 * -253649593, -357564953);
            var2.write(var3, (byte)-28);
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         }

      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      }
   }

   static final void method1934(Class681 var0, int var1) {
      if(0 == 2029719417 * client.anInt11288) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -2;
      } else if(client.anInt11288 * 2029719417 == 1) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -17244221 * client.anInt11130;
      }

   }

   static final void method1935(Class681 var0, byte var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      boolean var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623] == 1;
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      boolean var5 = 1 == var0.anIntArray8622[3 + -1730576285 * var0.anInt8623];
      Class255.method3498(var2, var3, var4, var5, -1538915029);
   }

   static final void method1936(int var0, int var1, byte var2) {
      if(Class525_Sub1.aFloat7103 < Class525_Sub1.aFloat7144) {
         Class525_Sub1.aFloat7103 = (float)((double)Class525_Sub1.aFloat7103 + (double)Class525_Sub1.aFloat7103 / 30.0D);
         if(Class525_Sub1.aFloat7103 > Class525_Sub1.aFloat7144) {
            Class525_Sub1.aFloat7103 = Class525_Sub1.aFloat7144;
         }

         Class526_Sub21_Sub2.method10420(1939365888);
         Class525_Sub1.anInt7100 = (int)Class525_Sub1.aFloat7144 >> 1;
         Class525_Sub1.aByteArrayArrayArray7105 = Class253.method3473(Class525_Sub1.anInt7100, -1331061490);
      } else if(Class525_Sub1.aFloat7103 > Class525_Sub1.aFloat7144) {
         Class525_Sub1.aFloat7103 = (float)((double)Class525_Sub1.aFloat7103 - (double)Class525_Sub1.aFloat7103 / 30.0D);
         if(Class525_Sub1.aFloat7103 < Class525_Sub1.aFloat7144) {
            Class525_Sub1.aFloat7103 = Class525_Sub1.aFloat7144;
         }

         Class526_Sub21_Sub2.method10420(1206139712);
         Class525_Sub1.anInt7100 = (int)Class525_Sub1.aFloat7144 >> 1;
         Class525_Sub1.aByteArrayArrayArray7105 = Class253.method3473(Class525_Sub1.anInt7100, -1331061490);
      }

      if(-1 != -2007768009 * Class525_Sub1.anInt10710 && -1 != Class525_Sub1.anInt10711 * 1335365969) {
         int var3 = -2007768009 * Class525_Sub1.anInt10710 - -335635005 * Class71.anInt800;
         if(var3 != 0) {
            var3 /= Math.min(Class525_Sub1.anInt10706 * -1562449173, Math.abs(var3));
         }

         int var4 = 1335365969 * Class525_Sub1.anInt10711 - -623512625 * Class116.anInt1438;
         if(var4 != 0) {
            var4 /= Math.min(-1562449173 * Class525_Sub1.anInt10706, Math.abs(var4));
         }

         Class71.anInt800 = -521323797 * (-335635005 * Class71.anInt800 + var3);
         Class116.anInt1438 = (var4 + Class116.anInt1438 * -623512625) * -168152273;
         if(0 == var3 && var4 == 0) {
            Class525_Sub1.anInt10710 = 608366201;
            Class525_Sub1.anInt10711 = -805427121;
         }

         Class526_Sub21_Sub2.method10420(1435614287);
      }

      Iterator var5 = Class525_Sub1.aHashMap10718.entrySet().iterator();

      while(true) {
         while(true) {
            Class46 var7;
            do {
               if(!var5.hasNext()) {
                  var5 = Class525_Sub1.aHashMap10719.entrySet().iterator();

                  while(true) {
                     while(true) {
                        do {
                           if(!var5.hasNext()) {
                              if(Class525_Sub1.aBool10712 && null != Class380.aClass702_3937) {
                                 for(Class526_Sub6 var6 = (Class526_Sub6)Class380.aClass702_3937.method8206((byte)121); null != var6; var6 = (Class526_Sub6)Class380.aClass702_3937.method8181(-239616425)) {
                                    Class238 var8 = (Class238)Class525_Sub1.aClass40_Sub6_7088.method89(var6.aClass526_Sub35_10397.anInt10664 * -1572922363, -766081431);
                                    if(var6.method9338(var0, var1, 1560750609)) {
                                       if(var8.aStringArray2413 != null) {
                                          if(null != var8.aStringArray2413[4]) {
                                             Class504.method6046(var8.aStringArray2413[4], var8.aString2414, -1, 1012, -1, (long)(-1572922363 * var6.aClass526_Sub35_10397.anInt10664), var8.anInt2442 * 831231597, 0, true, false, (long)(var6.aClass526_Sub35_10397.anInt10664 * -1572922363), false, (byte)-71);
                                          }

                                          if(var8.aStringArray2413[3] != null) {
                                             Class504.method6046(var8.aStringArray2413[3], var8.aString2414, -1, 1011, -1, (long)(var6.aClass526_Sub35_10397.anInt10664 * -1572922363), var8.anInt2442 * 831231597, 0, true, false, (long)(-1572922363 * var6.aClass526_Sub35_10397.anInt10664), false, (byte)-28);
                                          }

                                          if(var8.aStringArray2413[2] != null) {
                                             Class504.method6046(var8.aStringArray2413[2], var8.aString2414, -1, 1010, -1, (long)(-1572922363 * var6.aClass526_Sub35_10397.anInt10664), var8.anInt2442 * 831231597, 0, true, false, (long)(-1572922363 * var6.aClass526_Sub35_10397.anInt10664), false, (byte)-16);
                                          }

                                          if(var8.aStringArray2413[1] != null) {
                                             Class504.method6046(var8.aStringArray2413[1], var8.aString2414, -1, 1009, -1, (long)(-1572922363 * var6.aClass526_Sub35_10397.anInt10664), var8.anInt2442 * 831231597, 0, true, false, (long)(-1572922363 * var6.aClass526_Sub35_10397.anInt10664), false, (byte)36);
                                          }

                                          if(var8.aStringArray2413[0] != null) {
                                             Class504.method6046(var8.aStringArray2413[0], var8.aString2414, -1, 1008, -1, (long)(-1572922363 * var6.aClass526_Sub35_10397.anInt10664), 831231597 * var8.anInt2442, 0, true, false, (long)(var6.aClass526_Sub35_10397.anInt10664 * -1572922363), false, (byte)-97);
                                          }
                                       }

                                       if(!var6.aClass526_Sub35_10397.aBool10668) {
                                          var6.aClass526_Sub35_10397.aBool10668 = true;
                                          Class636.method7566(Class581.aClass581_7758, var6.aClass526_Sub35_10397.anInt10664 * -1572922363, 831231597 * var8.anInt2442, 1271066344);
                                       }

                                       if(var6.aClass526_Sub35_10397.aBool10668) {
                                          Class636.method7566(Class581.aClass581_7759, var6.aClass526_Sub35_10397.anInt10664 * -1572922363, var8.anInt2442 * 831231597, 631409382);
                                       }
                                    } else if(var6.aClass526_Sub35_10397.aBool10668) {
                                       var6.aClass526_Sub35_10397.aBool10668 = false;
                                       Class636.method7566(Class581.aClass581_7771, var6.aClass526_Sub35_10397.anInt10664 * -1572922363, 831231597 * var8.anInt2442, -1118195416);
                                    }
                                 }
                              }

                              return;
                           }

                           var7 = (Class46)((Entry)var5.next()).getValue();
                           var7.anInt640 -= 1060177073;
                        } while(var7.anInt640 * -1446591407 != 0);

                        if(1947298327 * var7.anInt641 <= 1 && !Class525_Sub1.aBool10722) {
                           var5.remove();
                        } else {
                           var7.anInt641 -= 944270759;
                           var7.anInt640 = Class525_Sub1.anInt10721 * -928702537;
                        }
                     }
                  }
               }

               var7 = (Class46)((Entry)var5.next()).getValue();
               var7.anInt640 -= 1060177073;
            } while(0 != -1446591407 * var7.anInt640);

            if(var7.anInt641 * 1947298327 <= 1 && !Class525_Sub1.aBool10722) {
               var5.remove();
            } else {
               var7.anInt641 -= 944270759;
               var7.anInt640 = -928702537 * Class525_Sub1.anInt10721;
            }
         }
      }
   }

   static final void method1937(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = null != Class525.aClass526_Sub21_Sub17_7093?929626277 * Class525.aClass526_Sub21_Sub17_7093.anInt11846:-1;
   }
}
