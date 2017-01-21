package com.jagex;

import com.jagex.Class10;
import com.jagex.Class103;
import com.jagex.Class11;
import com.jagex.Class149_Sub1;
import com.jagex.Class174;
import com.jagex.Class199_Sub1;
import com.jagex.Class199_Sub11;
import com.jagex.Class204;
import com.jagex.Class220;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class253;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class266;
import com.jagex.Class278;
import com.jagex.Class31;
import com.jagex.Class315_Sub1;
import com.jagex.Class319;
import com.jagex.Class390;
import com.jagex.Class394;
import com.jagex.Class425;
import com.jagex.Class433;
import com.jagex.Class438;
import com.jagex.Class446;
import com.jagex.Class448_Sub1;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class457;
import com.jagex.Class504;
import com.jagex.Class510;
import com.jagex.Class517;
import com.jagex.Class526_Sub20;
import com.jagex.Class526_Sub3;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class555;
import com.jagex.Class559;
import com.jagex.Class592;
import com.jagex.Class596;
import com.jagex.Class606;
import com.jagex.Class610;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class639_Sub1_Sub4_Sub1;
import com.jagex.Class64;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.Interface45;
import com.jagex.Interface59;
import com.jagex.client;
import java.util.Iterator;
import java.util.List;

public class Class399 implements Interface45 {
   public int anInt4130;

   public Class394 method345() {
      return Class394.aClass394_4107;
   }

   public Class394 method346(int var1) {
      return Class394.aClass394_4107;
   }

   Class399(int var1) {
      this.anInt4130 = 1149425497 * var1;
   }

   public static Class390 method4829(RSByteBuffer var0, int var1) {
      int var2 = var0.readBigSmart((byte)-17);
      return new Class390(var2);
   }

   static final void method4830(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)108);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class278.method3685(var3, var4, false, 2, var0, -1364071552);
   }

   static final void method4831(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub8_10625.method8313(var2, -1410763876);
   }

   static void method4832(Class174 var0, int var1, int var2, int var3) {
      if(var1 >= 0 && var2 >= 0 && Class31.aClass433_288 != null) {
         Class596 var4 = client.aClass505_11204.method6128(2136189740);
         Class433 var5 = var0.method2318();
         Class425.method5008(var0, (byte)-39);
         var5.method5110(Class31.aClass445_260);
         var5.method5085(Class31.aClass433_288);
         var5.method5105();
         int var6 = var1 - 532518695 * Class31.anInt284;
         int var7 = var2 - -1854471021 * Class31.anInt290;
         if(client.aClass505_11204.method6072(-1371779660) != null) {
            int var9;
            int var21;
            int var22;
            int var61;
            if(!client.aBool11276 || 0 != (257411563 * Class199_Sub1.anInt9869 & 64)) {
               int var8 = -1;
               var9 = -1;
               float var10 = 2.0F * (float)var6 / (float)(Class31.anInt286 * 1676211751) - 1.0F;
               float var11 = 2.0F * (float)var7 / (float)(-129848535 * Class31.anInt294) - 1.0F;
               var5.method5089(var10, var11, -1.0F, Class31.aFloatArray296);
               float var12 = Class31.aFloatArray296[0] / Class31.aFloatArray296[3];
               float var13 = Class31.aFloatArray296[1] / Class31.aFloatArray296[3];
               float var14 = Class31.aFloatArray296[2] / Class31.aFloatArray296[3];
               var5.method5089(var10, var11, 1.0F, Class31.aFloatArray296);
               float var15 = Class31.aFloatArray296[0] / Class31.aFloatArray296[3];
               float var16 = Class31.aFloatArray296[1] / Class31.aFloatArray296[3];
               float var17 = Class31.aFloatArray296[2] / Class31.aFloatArray296[3];
               float var18 = Class673.method8003(var12, var13, var14, var15, var16, var17, 4, (byte)82);
               if(var18 > 0.0F) {
                  float var19 = var15 - var12;
                  float var20 = var17 - var14;
                  var21 = (int)(var19 * var18 + var12);
                  var22 = (int)(var14 + var20 * var18);
                  var8 = var21 + (Class451.localPlayer.method10781(-627148024) - 1 << 8) >> 9;
                  var9 = var22 + (Class451.localPlayer.method10781(-627148024) - 1 << 8) >> 9;
                  byte var23 = Class451.localPlayer.aByte10827;
                  if(var23 < 3 && (client.aClass505_11204.method6094((byte)-38).aByteArrayArrayArray5356[1][var21 >> 9][var22 >> 9] & 2) != 0) {
                     var61 = var23 + 1;
                  }
               }

               if(var8 != -1 && var9 != -1) {
                  if(client.aBool11276 && (257411563 * Class199_Sub1.anInt9869 & 64) != 0) {
                     InterfaceDef var48 = Class204.method2893(Class149_Sub1.uid * -367921651, 1280409375 * client.slot, -1486420026);
                     if(var48 != null) {
                        Class504.method6046(client.aString11184, " " + Class64.aString741 + " ", Class606.anInt7911 * 1441183119, 59, -1, 0L, var8, var9, true, false, (long)(var8 << 0 | var9), true, (byte)68);
                     } else {
                        Class438.method5153(-552366078);
                     }
                  } else {
                     if(Class457.aBool5160) {
                        Class504.method6046(Class45.aClass45_613.method920(Class26.aClass673_247, -827840379), "", -1, 60, -1, 0L, var8, var9, true, false, (long)(var8 << 0 | var9), true, (byte)23);
                     }

                     Class504.method6046(Class220.aString2297, "", client.anInt11171 * 1231338057, 23, -1, 0L, var8, var9, true, false, (long)(var8 << 0 | var9), true, (byte)-51);
                  }
               }
            }

            Class559 var28 = client.aClass505_11204.method6072(-721582714).aClass559_7318;
            var9 = var1;
            int var36 = var2;
            List var38 = var28.aList7541;
            Iterator var39 = var38.iterator();

            while(true) {
               Interface59 var35;
               Class610 var37;
               int var42;
               int var44;
               int var50;
               String[] var51;
               do {
                  Class555 var40;
                  do {
                     do {
                        do {
                           int var26;
                           int var27;
                           int var32;
                           int var65;
                           while(true) {
                              Class446 var24;
                              int var25;
                              int var52;
                              while(true) {
                                 do {
                                    do {
                                       if(!var39.hasNext()) {
                                          return;
                                       }

                                       var40 = (Class555)var39.next();
                                    } while(!client.aBool11175 && var40.aClass639_Sub1_7477.aByte10827 != Class451.localPlayer.aByte10827);
                                 } while(!var40.method6686(var0, var9, var36, 768564750));

                                 boolean var41 = false;
                                 boolean var43 = false;
                                 if(var40.aClass639_Sub1_7477 instanceof Class639_Sub1_Sub2) {
                                    var42 = ((Class639_Sub1_Sub2)var40.aClass639_Sub1_7477).aShort11803;
                                    var44 = ((Class639_Sub1_Sub2)var40.aClass639_Sub1_7477).aShort11799;
                                 } else {
                                    Class446 var29 = var40.aClass639_Sub1_7477.method7635().aClass446_4816;
                                    var42 = (int)var29.aFloat4917 >> 9;
                                    var44 = (int)var29.aFloat4919 >> 9;
                                 }

                                 if(!(var40.aClass639_Sub1_7477 instanceof Class639_Sub1_Sub2_Sub1_Sub1)) {
                                    break;
                                 }

                                 Class639_Sub1_Sub2_Sub1_Sub1 var30 = (Class639_Sub1_Sub2_Sub1_Sub1)var40.aClass639_Sub1_7477;
                                 var32 = var30.method10781(-627148024);
                                 Class446 var45 = var30.method7635().aClass446_4816;
                                 if((var32 & 1) == 0 && 0 == ((int)var45.aFloat4917 & 511) && ((int)var45.aFloat4919 & 511) == 0 || 1 == (var32 & 1) && 256 == ((int)var45.aFloat4917 & 511) && ((int)var45.aFloat4919 & 511) == 256) {
                                    var50 = (int)var45.aFloat4917 - (var30.method10781(-627148024) - 1 << 8);
                                    var52 = (int)var45.aFloat4919 - (var30.method10781(-627148024) - 1 << 8);

                                    for(var21 = 0; var21 < client.npcCount * 1139938345; ++var21) {
                                       LinkableObject var54 = (LinkableObject)client.npcs.get((long)client.npcsIndicies[var21]);
                                       if(null != var54) {
                                          NPC var62 = (NPC)var54.anObject10399;
                                          if(var62.anInt11897 * -1915398771 != client.anInt11012 && var62.aBool11894) {
                                             var24 = var62.method7635().aClass446_4816;
                                             var25 = (int)var24.aFloat4917 - (459047587 * var62.def.boundSize - 1 << 8);
                                             var26 = (int)var24.aFloat4919 - (459047587 * var62.def.boundSize - 1 << 8);
                                             if(var25 >= var50 && 459047587 * var62.def.boundSize <= var30.method10781(-627148024) - (var25 - var50 >> 9) && var26 >= var52 && 459047587 * var62.def.boundSize <= var30.method10781(-627148024) - (var26 - var52 >> 9)) {
                                                Class319.method4127(var62, var40.aClass639_Sub1_7477.aByte10827 != Class451.localPlayer.aByte10827, -1186334541);
                                                var62.anInt11897 = client.anInt11012 * -853478075;
                                             }
                                          }
                                       }
                                    }

                                    var21 = 1609310241 * Class103.anInt1270;
                                    int[] var57 = Class103.anIntArray1276;

                                    for(var61 = 0; var61 < var21; ++var61) {
                                       Class639_Sub1_Sub2_Sub1_Sub1 var63 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var57[var61]];
                                       if(null != var63 && -1915398771 * var63.anInt11897 != client.anInt11012 && var63 != var30 && var63.aBool11894) {
                                          Class446 var67 = var63.method7635().aClass446_4816;
                                          var26 = (int)var67.aFloat4917 - (var63.method10781(-627148024) - 1 << 8);
                                          var27 = (int)var67.aFloat4919 - (var63.method10781(-627148024) - 1 << 8);
                                          if(var26 >= var50 && var63.method10781(-627148024) <= var30.method10781(-627148024) - (var26 - var50 >> 9) && var27 >= var52 && var63.method10781(-627148024) <= var30.method10781(-627148024) - (var27 - var52 >> 9)) {
                                             Class253.method3472(var63, var40.aClass639_Sub1_7477.aByte10827 != Class451.localPlayer.aByte10827, 2124518007);
                                             var63.anInt11897 = client.anInt11012 * -853478075;
                                          }
                                       }
                                    }
                                 }

                                 if(client.anInt11012 != var30.anInt11897 * -1915398771) {
                                    Class253.method3472(var30, var40.aClass639_Sub1_7477.aByte10827 != Class451.localPlayer.aByte10827, 2115522927);
                                    var30.anInt11897 = client.anInt11012 * -853478075;
                                    break;
                                 }
                              }

                              if(!(var40.aClass639_Sub1_7477 instanceof NPC)) {
                                 break;
                              }

                              NPC var31 = (NPC)var40.aClass639_Sub1_7477;
                              if(null == var31.def) {
                                 break;
                              }

                              Class446 var34 = var31.method7635().aClass446_4816;
                              if((459047587 * var31.def.boundSize & 1) == 0 && 0 == ((int)var34.aFloat4917 & 511) && ((int)var34.aFloat4919 & 511) == 0 || 1 == (459047587 * var31.def.boundSize & 1) && 256 == ((int)var34.aFloat4917 & 511) && ((int)var34.aFloat4919 & 511) == 256) {
                                 int var46 = (int)var34.aFloat4917 - (var31.def.boundSize * 459047587 - 1 << 8);
                                 var50 = (int)var34.aFloat4919 - (var31.def.boundSize * 459047587 - 1 << 8);

                                 for(var52 = 0; var52 < client.npcCount * 1139938345; ++var52) {
                                    LinkableObject var55 = (LinkableObject)client.npcs.get((long)client.npcsIndicies[var52]);
                                    if(null != var55) {
                                       NPC var60 = (NPC)var55.anObject10399;
                                       if(var60.anInt11897 * -1915398771 != client.anInt11012 && var31 != var60 && var60.aBool11894) {
                                          Class446 var64 = var60.method7635().aClass446_4816;
                                          var65 = (int)var64.aFloat4917 - (459047587 * var60.def.boundSize - 1 << 8);
                                          var25 = (int)var64.aFloat4919 - (459047587 * var60.def.boundSize - 1 << 8);
                                          if(var65 >= var46 && var60.def.boundSize * 459047587 <= 459047587 * var31.def.boundSize - (var65 - var46 >> 9) && var25 >= var50 && var60.def.boundSize * 459047587 <= 459047587 * var31.def.boundSize - (var25 - var50 >> 9)) {
                                             Class319.method4127(var60, Class451.localPlayer.aByte10827 != var40.aClass639_Sub1_7477.aByte10827, -1186334541);
                                             var60.anInt11897 = -853478075 * client.anInt11012;
                                          }
                                       }
                                    }
                                 }

                                 var52 = 1609310241 * Class103.anInt1270;
                                 int[] var58 = Class103.anIntArray1276;

                                 for(var22 = 0; var22 < var52; ++var22) {
                                    Class639_Sub1_Sub2_Sub1_Sub1 var66 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var58[var22]];
                                    if(null != var66 && client.anInt11012 != var66.anInt11897 * -1915398771 && var66.aBool11894) {
                                       var24 = var66.method7635().aClass446_4816;
                                       var25 = (int)var24.aFloat4917 - (var66.method10781(-627148024) - 1 << 8);
                                       var26 = (int)var24.aFloat4919 - (var66.method10781(-627148024) - 1 << 8);
                                       if(var25 >= var46 && var66.method10781(-627148024) <= var31.def.boundSize * 459047587 - (var25 - var46 >> 9) && var26 >= var50 && var66.method10781(-627148024) <= var31.def.boundSize * 459047587 - (var26 - var50 >> 9)) {
                                          Class253.method3472(var66, var40.aClass639_Sub1_7477.aByte10827 != Class451.localPlayer.aByte10827, 2120885774);
                                          var66.anInt11897 = -853478075 * client.anInt11012;
                                       }
                                    }
                                 }
                              }

                              if(var31.anInt11897 * -1915398771 != client.anInt11012) {
                                 Class319.method4127(var31, Class451.localPlayer.aByte10827 != var40.aClass639_Sub1_7477.aByte10827, -1186334541);
                                 var31.anInt11897 = -853478075 * client.anInt11012;
                                 break;
                              }
                           }

                           if(var40.aClass639_Sub1_7477 instanceof Class639_Sub1_Sub4_Sub1) {
                              int var33 = var42 + -814686591 * var4.localX;
                              var32 = var44 + var4.localY * -845789331;
                              Class526_Sub20 var47 = (Class526_Sub20)client.aClass20_11259.get((long)(var40.aClass639_Sub1_7477.aByte10827 << 28 | var32 << 14 | var33));
                              if(null != var47) {
                                 var50 = 0;

                                 for(Class526_Sub3 var53 = (Class526_Sub3)var47.aClass702_10529.method8180((byte)8); var53 != null; ++var50) {
                                    Class11 var59 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var53.anInt10370 * -1804739063, 292547390);
                                    if(var59.aBool140) {
                                       var22 = var59.anInt117 * 1978196225;
                                    } else if(var59.aBool93) {
                                       var22 = -1506973855 * Class253.aClass627_2794.anInt8192;
                                    } else {
                                       var22 = Class253.aClass627_2794.anInt8190 * 264323767;
                                    }

                                    if(client.aBool11276 && Class451.localPlayer.aByte10827 == var40.aClass639_Sub1_7477.aByte10827) {
                                       Class83 var68 = (Class83)(20050943 * Class510.anInt6985 != -1?Class10.aClass40_Sub20_62.method89(Class510.anInt6985 * 20050943, -1600886712):null);
                                       if((257411563 * Class199_Sub1.anInt9869 & 1) != 0 && (null == var68 || var59.method595(20050943 * Class510.anInt6985, 1040538721 * var68.anInt843, 1852834907) != var68.anInt843 * 1040538721)) {
                                          Class504.method6046(client.aString11184, client.aString11271 + " " + Class64.aString741 + " " + Class592.method7026(var22, 1300508360) + var59.aString76, Class606.anInt7911 * 1441183119, 17, -1, (long)(-1804739063 * var53.anInt10370), var42, var44, true, false, (long)var50, false, (byte)28);
                                       }
                                    }

                                    if(var40.aClass639_Sub1_7477.aByte10827 == Class451.localPlayer.aByte10827) {
                                       String[] var69 = var59.aStringArray94;

                                       for(var65 = var69.length - 1; var65 >= 0; --var65) {
                                          if(null != var69[var65]) {
                                             short var70 = 0;
                                             var26 = 85637115 * client.anInt10987;
                                             if(var65 == 0) {
                                                var70 = 18;
                                             }

                                             if(1 == var65) {
                                                var70 = 19;
                                             }

                                             if(2 == var65) {
                                                var70 = 20;
                                             }

                                             if(3 == var65) {
                                                var70 = 21;
                                             }

                                             if(4 == var65) {
                                                var70 = 22;
                                             }

                                             if(var65 == 5) {
                                                var70 = 1004;
                                             }

                                             var27 = var59.method597(var65, 171538550);
                                             if(var27 != -1) {
                                                var26 = var27;
                                             }

                                             Class504.method6046(var69[var65], Class592.method7026(var22, 1659789693) + var59.aString76, var26, var70, -1, (long)(-1804739063 * var53.anInt10370), var42, var44, true, false, (long)var50, false, (byte)-100);
                                          }
                                       }
                                    }

                                    var53 = (Class526_Sub3)var47.aClass702_10529.method8182(-1345397284);
                                 }
                              }
                           }
                        } while(!(var40.aClass639_Sub1_7477 instanceof Interface59));

                        var35 = (Interface59)var40.aClass639_Sub1_7477;
                        var37 = (Class610)client.aClass505_11204.method6066(-631188979).method89(var35.method56(-117322354), 93243281);
                        if(var37.anIntArray7989 != null) {
                           var37 = var37.method7179(Class242.aClass94_2456, Class242.aClass94_2456, (byte)-63);
                        }
                     } while(var37 == null);

                     if(client.aBool11276 && var40.aClass639_Sub1_7477.aByte10827 == Class451.localPlayer.aByte10827) {
                        Class83 var49 = (Class83)(-1 != 20050943 * Class510.anInt6985?Class10.aClass40_Sub20_62.method89(20050943 * Class510.anInt6985, -814774500):null);
                        if((257411563 * Class199_Sub1.anInt9869 & 4) != 0 && (var49 == null || var37.method7171(20050943 * Class510.anInt6985, var49.anInt843 * 1040538721, -295265672) != var49.anInt843 * 1040538721)) {
                           Class504.method6046(client.aString11184, client.aString11271 + " " + Class64.aString741 + " " + Class592.method7026('\uffff', 457015279) + var37.aString7939, 1441183119 * Class606.anInt7911, 2, -1, Class517.method6233(var35, var42, var44, -995073706), var42, var44, true, false, (long)var35.hashCode(), false, (byte)82);
                        }
                     }
                  } while(var40.aClass639_Sub1_7477.aByte10827 != Class451.localPlayer.aByte10827);

                  var51 = var37.aStringArray7967;
               } while(var51 == null);

               for(var50 = var51.length - 1; var50 >= 0; --var50) {
                  if(var51[var50] != null) {
                     short var56 = 0;
                     var21 = 85637115 * client.anInt10987;
                     if(var50 == 0) {
                        var56 = 3;
                     }

                     if(var50 == 1) {
                        var56 = 4;
                     }

                     if(var50 == 2) {
                        var56 = 5;
                     }

                     if(3 == var50) {
                        var56 = 6;
                     }

                     if(4 == var50) {
                        var56 = 1001;
                     }

                     if(5 == var50) {
                        var56 = 1002;
                     }

                     var22 = var37.method7187(var50, (byte)35);
                     if(var22 != -1) {
                        var21 = var22;
                     }

                     Class504.method6046(var51[var50], Class592.method7026('\uffff', -516012841) + var37.aString7939, var21, var56, -1, Class517.method6233(var35, var42, var44, 1285330781), var42, var44, true, false, (long)var35.hashCode(), false, (byte)-109);
                  }
               }
            }
         }
      }
   }

   static final void method4833(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)(Class555.aLong7481 * -1319377014074767261L / 60000L);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)((-1319377014074767261L * Class555.aLong7481 - Class255.time((byte)24) - Class266.aLong2982 * 1411796210146295063L) / 60000L);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class199_Sub11.aBool9925?1:0;
   }
}
