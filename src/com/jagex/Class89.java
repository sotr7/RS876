package com.jagex;

import com.jagex.Class115;
import com.jagex.Class152;
import com.jagex.Class16;
import com.jagex.Class171;
import com.jagex.Class177;
import com.jagex.Class184_Sub2;
import com.jagex.Class187;
import com.jagex.Class189;
import com.jagex.Class19;
import com.jagex.Class195;
import com.jagex.Class199;
import com.jagex.Class199_Sub12;
import com.jagex.Class207;
import com.jagex.Class208;
import com.jagex.Class213;
import com.jagex.Class221;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class264;
import com.jagex.Class266;
import com.jagex.Class270;
import com.jagex.Class277;
import com.jagex.Class296;
import com.jagex.Class30;
import com.jagex.Class304;
import com.jagex.Class305;
import com.jagex.Class31;
import com.jagex.Class325;
import com.jagex.Class327;
import com.jagex.Class328;
import com.jagex.Class334;
import com.jagex.Class348;
import com.jagex.OutFrame;
import com.jagex.Class415;
import com.jagex.Class417;
import com.jagex.Class422;
import com.jagex.Class448;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class452_Sub5;
import com.jagex.Class495;
import com.jagex.Class502;
import com.jagex.Class509;
import com.jagex.Class517;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub29;
import com.jagex.Class526_Sub31;
import com.jagex.Buffer;
import com.jagex.Class526_Sub38;
import com.jagex.Class526_Sub39;
import com.jagex.Class530;
import com.jagex.Class538;
import com.jagex.Class539_Sub4;
import com.jagex.Class553;
import com.jagex.Class554;
import com.jagex.Class592;
import com.jagex.Class593;
import com.jagex.Class596;
import com.jagex.Class604;
import com.jagex.Class636;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub5_Sub1;
import com.jagex.Class645;
import com.jagex.Class658;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class688;
import com.jagex.Class97_Sub1_Sub2;
import com.jagex.client;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.Random;

public class Class89 {
   static Random aRandom858;
   static Object anObject859 = new Object();

   public static int method1190(int var0) {
      int var1 = var0 >>> 1;
      var1 |= var1 >>> 1;
      var1 |= var1 >>> 2;
      var1 |= var1 >>> 4;
      var1 |= var1 >>> 8;
      var1 |= var1 >>> 16;
      return var0 & ~var1;
   }

   public static int method1191(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int method1192(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int method1193(int var0) {
      int var1 = var0 >>> 1;
      var1 |= var1 >>> 1;
      var1 |= var1 >>> 2;
      var1 |= var1 >>> 4;
      var1 |= var1 >>> 8;
      var1 |= var1 >>> 16;
      return var0 & ~var1;
   }

   public static boolean method1194(int var0) {
      return var0 == (var0 & -var0);
   }

   public static boolean method1195(int var0) {
      return var0 == (var0 & -var0);
   }

   public static int method1196(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var1 + var0;
   }

   public static int method1197(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int method1198(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var1 + var0;
   }

   public static int method1199(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var1 + var0;
   }

   public static int method1200(int var0, int var1) {
      int var2;
      for(var2 = 0; var1 > 0; --var1) {
         var2 = var2 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var2;
   }

   public static int method1201(int var0, int var1) {
      int var2;
      for(var2 = 0; var1 > 0; --var1) {
         var2 = var2 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var2;
   }

   static int method1202(int var0, int var1) {
      int var2 = var0 >> 31 & var1 - 1;
      return ((var0 >>> 31) + var0) % var1 + var2;
   }

   static int method1203(int var0, int var1) {
      int var2 = var0 >> 31 & var1 - 1;
      return ((var0 >>> 31) + var0) % var1 + var2;
   }

   Class89() throws Throwable {
      throw new Error();
   }

   public static int method1204(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var1 + var0;
   }

   public static int method1205(int var0) {
      int var1 = var0 >>> 1;
      var1 |= var1 >>> 1;
      var1 |= var1 >>> 2;
      var1 |= var1 >>> 4;
      var1 |= var1 >>> 8;
      var1 |= var1 >>> 16;
      return var0 & ~var1;
   }

   static final void method1206(int var0) {
      if(-574170037 * client.anInt11159 > 1) {
         client.anInt11159 -= 1427836259;
         client.anInt11235 = client.anInt11214 * -1386702209;
      }

      if(client.aClass111_11060.aBool1346) {
         client.aClass111_11060.aBool1346 = false;
         Class199_Sub12.method9012(-1498324187);
      } else {
         if(!Class31.aBool291) {
            Class304.method4018(1224488994);
         }

         for(int var1 = 0; var1 < 100 && Class266.method3569(client.aClass111_11060, 1442895300); ++var1) {
            ;
         }

         if(9 == -558705405 * client.anInt11038) {
            int var2;
            OutFrameBuffer var18;
            while(Class325.method4180(-1888472453)) {
               var18 = Class115.method1414(OutFrame.aClass405_4209, client.aClass111_11060.aClass14_1342, -1327406679);
               var18.out.writeByte(0, -27109169);
               var2 = var18.out.pos * 301018015;
               Class223.method3149(var18.out, (byte)120);
               var18.out.method9678(301018015 * var18.out.pos - var2, (byte)-86);
               client.aClass111_11060.write(var18, (byte)48);
            }

            int var6;
            if(null != Class593.aClass657_7820) {
               if(Class593.aClass657_7820.anInt8491 * -1432920957 != -1) {
                  var18 = Class115.method1414(OutFrame.aClass405_4238, client.aClass111_11060.aClass14_1342, 1282613474);
                  if(null == Class171.aGarbageCollectorMXBean2017 || !Class171.aGarbageCollectorMXBean2017.isValid()) {
                     try {
                        Iterator var20 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                        while(var20.hasNext()) {
                           GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var20.next();
                           if(var3.isValid()) {
                              Class171.aGarbageCollectorMXBean2017 = var3;
                              client.aLong11289 = 1765527360838100649L;
                              client.aLong11269 = 5929936462019784685L;
                           }
                        }
                     } catch (Throwable var17) {
                        ;
                     }
                  }

                  long var4 = Class255.time((byte)24);
                  var6 = -1;
                  if(Class171.aGarbageCollectorMXBean2017 != null) {
                     long var7 = Class171.aGarbageCollectorMXBean2017.getCollectionTime();
                     if(-3336266375298172389L * client.aLong11269 != -1L) {
                        long var9 = var7 - -3336266375298172389L * client.aLong11269;
                        long var11 = var4 - -4162482883498417561L * client.aLong11289;
                        if(var11 != 0L) {
                           var6 = (int)(100L * var9 / var11);
                        }
                     }

                     client.aLong11269 = var7 * -5929936462019784685L;
                     client.aLong11289 = -1765527360838100649L * var4;
                  }

                  var18.out.write128Byte(client.anInt5627 * -421428705, (byte)-55);
                  var18.out.writeLEShort128(Class593.aClass657_7820.anInt8491 * -1432920957, 1030741828);
                  var18.out.writeByte(var6, -700001708);
                  client.aClass111_11060.write(var18, (byte)-109);
                  Class593.aClass657_7820 = null;
                  Class417.aLong4507 = -9073787023541698449L * (var4 + 30000L);
               }
            } else if(Class255.time((byte)24) >= 168584764033982095L * Class417.aLong4507) {
               Class593.aClass657_7820 = client.aClass647_11147.method7696(Class16.aClass6_171.address, (byte)116);
            }

            Class422.method4993((byte)88);
            Class296.method3966((byte)-101);
            Class526_Sub29 var19 = (Class526_Sub29)client.aClass702_11028.method8206((byte)57);
            if(client.aClass505_11204.method6072(-816978814) != null) {
               if(-265840483 * Class327.anInt3488 == 3) {
                  Class152.method1765((byte)-75);
               } else if(-265840483 * Class327.anInt3488 == 4) {
                  Class19.method632((byte)1);
               }
            }

            if(client.aBool11108) {
               client.aBool11108 = false;
            } else {
               client.aFloat10992 /= 2.0F;
            }

            if(client.aBool11278) {
               client.aBool11278 = false;
            } else {
               client.aFloat11106 /= 2.0F;
            }

            int var22;
            if(Class348.method4524((byte)-33)) {
               Class328.method4201((byte)92);
            } else if(Class327.anInt3488 * -265840483 == 2) {
               Class596 var21 = client.aClass505_11204.method6128(2069429128);
               var22 = -814686591 * var21.localX << 9;
               var6 = var21.localY * -845789331 << 9;
               if(Class604.aLong7895 * -2354278665451933919L <= 0L) {
                  Class604.aLong7895 = Class255.time((byte)24) * -2944112277673782047L;
               }

               float var13 = (float)(Class255.time((byte)24) - -2354278665451933919L * Class604.aLong7895);
               int var14 = 1000 / Class636.method7565(2022550569);

               for(var14 = (int)((double)var14 * 1.25D); var13 > 0.0F; var13 -= (float)var14) {
                  float var15 = Math.min(var13, (float)var14);
                  Class195.aClass292_Sub1_2182.method3905(var15 / 1000.0F, client.aClass505_11204.method6125(-2080741122).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)-61), var22, var6, 2028386226);
               }

               Class604.aLong7895 = Class255.time((byte)24) * -2944112277673782047L;
            }

            Class526_Sub38.method9733(1586969155);
            if(-558705405 * client.anInt11038 == 9) {
               client.aClass505_11204.method6100((byte)-12).method7362(client.aClass505_11204, -436871627);
               Class208.method2933(-1765945056);
               if(client.anInt11026 * -303205907 > 10) {
                  client.aClass111_11060.anInt1349 += -969796887;
               }

               if(client.aClass111_11060.anInt1349 * -1037703847 > 2250) {
                  Class199_Sub12.method9012(-1261622276);
               } else {
                  if(client.anInt11073 * 378016543 == 3) {
                     Class30.method741(-2135307757);
                     Class334.method4264(437401477);
                  } else if(Class639_Sub1_Sub5_Sub1.aClass629_11973.anInterface67_8216.method434(var19, client.anInterface63Array11010, client.anInt11034 * 1880027675, Class171.aClass553_2016, 128367934)) {
                     Class592.method7019(false, -1638460626);
                  } else {
                     if(0 == client.anInt11073 * 378016543 && Class277.method3675(-1498975703 * client.anInt11072, 512085862)) {
                        client.aClass505_11204.method6120(new Class509(Class502.staticMapBuffer, (Buffer)null), (byte)1);
                        client.anInt11073 = -1296717601;
                     }

                     if(client.anInt11073 * 378016543 == 1 && 10 != client.anInt11038 * -558705405) {
                        Class189.aClass20_2152.method647(929030154);
                        client.anInt11073 = -891903108;
                        client.anInt11075 = client.anInt11012 * -1730876415;
                        client.anInt11152 = 0;
                        client.aBool11247 = false;
                        Class530.method6374((short)8220);
                     }

                     if(378016543 * client.anInt11073 == 4) {
                        var2 = client.anInt11012 - client.anInt11075 * 1622873089;
                        if(-946738741 * client.anInt11152 < Class189.aClass199Array2148.length) {
                           do {
                              Class199 var25 = Class189.aClass199Array2148[-946738741 * client.anInt11152];
                              if(-1506738769 * var25.anInt2199 > var2) {
                                 break;
                              }

                              var25.method2852((byte)-89);
                           } while(4 == 378016543 * client.anInt11073 && (client.anInt11152 += 735507427) * -946738741 < Class189.aClass199Array2148.length);
                        }

                        if(4 == client.anInt11073 * 378016543) {
                           for(var22 = 0; var22 < Class645.aClass207Array8445.length; ++var22) {
                              Class207 var29 = Class645.aClass207Array8445[var22];
                              if(var29.aBool2251) {
                                 Class639_Sub1_Sub2_Sub1 var31 = var29.method2913((byte)62);
                                 Class247.method3399(var31, true, (byte)55);
                              }
                           }
                        }
                     }
                  }

                  Class495.method5913((byte)-85);
                  Class242.method3328((byte)126);
                  Class184_Sub2.method8479(-1916289884);
                  Class553.method6668(false, -2129031421);
                  Class187.method2731(Class554.aClass174_7475, Class658.aClass169_8508, -2035444518);
                  client.anInt11225 += -691122179;
                  if(0 != client.anInt11136 * -1392152109) {
                     client.anInt11135 += -1721267948;
                     if(537289409 * client.anInt11135 >= 400) {
                        client.anInt11136 = 0;
                     }
                  }

                  if(null != Class264.aClass245_2969) {
                     client.anInt11137 += 1985832337;
                     if(1856109425 * client.anInt11137 >= 15) {
                        Class526_Sub31.method9555(Class264.aClass245_2969, (byte)10);
                        Class264.aClass245_2969 = null;
                     }
                  }

                  client.aClass245_11255 = null;
                  client.aBool11123 = false;
                  client.aBool11202 = false;
                  Class688.aClass245_8690 = null;
                  Class684.method8046((InterfaceDef)null, -1, -1, (short)255);
                  if(!client.aBool11276) {
                     client.anInt11178 = 2037720991;
                  }

                  Class645.method7672((byte)-23);
                  client.anInt11214 += -1001513713;
                  OutFrameBuffer var23;
                  if(client.aBool11179) {
                     var23 = Class115.method1414(OutFrame.aClass405_4215, client.aClass111_11060.aClass14_1342, 590782140);
                     var23.out.writeIntV2(-2027560301 * Class305.anInt3283 << 28 | -2143057997 * Class448.anInt4922 << 14 | Class530.anInt7181 * 286577481, (byte)-71);
                     client.aClass111_11060.write(var23, (byte)-41);
                     client.aBool11179 = false;
                  }

                  while(true) {
                     Class526_Sub39 var24;
                     InterfaceDef var26;
                     InterfaceDef var30;
                     do {
                        var24 = (Class526_Sub39)client.aClass702_11116.method8177((short)16573);
                        if(null == var24) {
                           while(true) {
                              do {
                                 var24 = (Class526_Sub39)client.aClass702_11241.method8177((short)-744);
                                 if(null == var24) {
                                    while(true) {
                                       do {
                                          var24 = (Class526_Sub39)client.aClass702_11239.method8177((short)-18057);
                                          if(null == var24) {
                                             if(Class688.aClass245_8690 == null) {
                                                client.anInt11242 = 0;
                                             }

                                             if(null != client.aClass245_11003) {
                                                Class452_Sub5.method9306(-486076038);
                                             }

                                             Class232.method3265((short)29115);
                                             if(client.anInt11064 * -1395039251 > 0 && Class171.aClass553_2016.method6666(82, 1776392195) && Class171.aClass553_2016.method6666(81, 2101742256) && -1882874795 * client.anInt11029 != 0) {
                                                var2 = Class451.localPlayer.aByte10827 - client.anInt11029 * -1882874795;
                                                if(var2 < 0) {
                                                   var2 = 0;
                                                } else if(var2 > 3) {
                                                   var2 = 3;
                                                }

                                                Class596 var27 = client.aClass505_11204.method6128(1949142594);
                                                Class97_Sub1_Sub2.method10415(var2, -814686591 * var27.localX + Class451.localPlayer.screenX[0], Class451.localPlayer.screenY[0] + var27.localY * -845789331, 1341722485);
                                             }

                                             for(var2 = 0; var2 < 5; ++var2) {
                                                ++client.anIntArray11273[var2];
                                             }

                                             if(Class538.aClass149_Sub1_7225.aBool8891 && -2816284197199323079L * Class538.aClass149_Sub1_7225.aLong8892 < Class255.time((byte)24) - 60000L) {
                                                Class517.method6231(2133269127);
                                             }

                                             Class538.aClass149_Sub1_7225.method8347(-1626055643);

                                             for(Class539_Sub4 var28 = (Class539_Sub4)client.aClass686_11048.method8053((byte)1); var28 != null; var28 = (Class539_Sub4)client.aClass686_11048.method8054(687323157)) {
                                                if((long)(1619754573 * var28.anInt10342) < Class255.time((byte)24) / 1000L - 5L) {
                                                   if(var28.aShort10343 > 0) {
                                                      Class177.method2659(5, 0, "", "", "", var28.aString10341 + Class45.aClass45_467.method920(Class26.aClass673_247, -827840379), (Class415)null, -563891349);
                                                   }

                                                   if(var28.aShort10343 == 0) {
                                                      Class177.method2659(5, 0, "", "", "", var28.aString10341 + Class45.aClass45_588.method920(Class26.aClass673_247, -827840379), (Class415)null, -1569051041);
                                                   }

                                                   var28.method6448(346501192);
                                                }
                                             }

                                             client.anInt11094 += 1677673351;
                                             if(-1618013641 * client.anInt11094 > 502) {
                                                client.anInt11094 = 0;
                                                var2 = (int)(Math.random() * 8.0D);
                                                if(1 == (var2 & 1)) {
                                                   client.anInt11088 += -229848631 * client.anInt11082;
                                                }

                                                if((var2 & 2) == 2) {
                                                   client.anInt11090 += -1500567619 * client.anInt10995;
                                                }

                                                if(4 == (var2 & 4)) {
                                                   client.anInt11092 += 1505388059 * client.anInt11093;
                                                }
                                             }

                                             if(-2095210217 * client.anInt11088 < -57) {
                                                client.anInt11082 = 1234323934;
                                             }

                                             if(-2095210217 * client.anInt11088 > 50) {
                                                client.anInt11082 = -1234323934;
                                             }

                                             if(471803279 * client.anInt11090 < -56) {
                                                client.anInt10995 = -303028938;
                                             }

                                             if(471803279 * client.anInt11090 > 63) {
                                                client.anInt10995 = 303028938;
                                             }

                                             if(client.anInt11092 * 1729917477 < -40) {
                                                client.anInt11093 = -348955689;
                                             }

                                             if(client.anInt11092 * 1729917477 > 44) {
                                                client.anInt11093 = 348955689;
                                             }

                                             client.anInt11099 += 655877897;
                                             if(800970553 * client.anInt11099 > 509) {
                                                client.anInt11099 = 0;
                                                var2 = (int)(Math.random() * 8.0D);
                                                if(1 == (var2 & 1)) {
                                                   client.anInt11076 += 1300435865 * client.anInt11096;
                                                }

                                                if(2 == (var2 & 2)) {
                                                   client.anInt11097 += client.anInt11098 * -621085817;
                                                }
                                             }

                                             if(-502966983 * client.anInt11076 < -65) {
                                                client.anInt11096 = -1168372254;
                                             }

                                             if(-502966983 * client.anInt11076 > 60) {
                                                client.anInt11096 = 1168372254;
                                             }

                                             if(1163477879 * client.anInt11097 < -21) {
                                                client.anInt11098 = 1787187009;
                                             }

                                             if(client.anInt11097 * 1163477879 > 12) {
                                                client.anInt11098 = -1787187009;
                                             }

                                             client.aClass111_11060.anInt1345 += 1298387453;
                                             if(client.aClass111_11060.anInt1345 * -2003594411 > 50) {
                                                var23 = Class115.method1414(OutFrame.aClass405_4282, client.aClass111_11060.aClass14_1342, 511026816);
                                                client.aClass111_11060.write(var23, (byte)-8);
                                             }

                                             if(client.aBool11063) {
                                                Class658.method7841(1210698422);
                                                client.aBool11063 = false;
                                             }

                                             try {
                                                client.aClass111_11060.method1365((byte)-1);
                                             } catch (IOException var16) {
                                                Class199_Sub12.method9012(-912760760);
                                             }

                                             return;
                                          }

                                          var26 = var24.aClass245_10694;
                                          if(var26.componentSlot * 1300712985 < 0) {
                                             break;
                                          }

                                          var30 = Class221.method3095(var26.parentId * -537841755, (byte)-74);
                                       } while(null == var30 || null == var30.aClass245Array2662 || var26.componentSlot * 1300712985 >= var30.aClass245Array2662.length || var30.aClass245Array2662[1300712985 * var26.componentSlot] != var26);

                                       Class270.method3594(var24, -1105249168);
                                    }
                                 }

                                 var26 = var24.aClass245_10694;
                                 if(1300712985 * var26.componentSlot < 0) {
                                    break;
                                 }

                                 var30 = Class221.method3095(-537841755 * var26.parentId, (byte)-12);
                              } while(null == var30 || null == var30.aClass245Array2662 || var26.componentSlot * 1300712985 >= var30.aClass245Array2662.length || var26 != var30.aClass245Array2662[var26.componentSlot * 1300712985]);

                              Class270.method3594(var24, -1739466260);
                           }
                        }

                        var26 = var24.aClass245_10694;
                        if(1300712985 * var26.componentSlot < 0) {
                           break;
                        }

                        var30 = Class221.method3095(var26.parentId * -537841755, (byte)2);
                     } while(var30 == null || null == var30.aClass245Array2662 || var26.componentSlot * 1300712985 >= var30.aClass245Array2662.length || var30.aClass245Array2662[var26.componentSlot * 1300712985] != var26);

                     Class270.method3594(var24, -411524643);
                  }
               }
            }
         }
      }
   }

   static final void method1207(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class213.method2952(var3, var4, var0, 1731180310);
   }
}
