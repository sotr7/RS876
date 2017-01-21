package com.jagex;

import com.jagex.Class11;
import com.jagex.Class12;
import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class163;
import com.jagex.Class164;
import com.jagex.Class167;
import com.jagex.Class168;
import com.jagex.Class17;
import com.jagex.Class191;
import com.jagex.Class195;
import com.jagex.Class199_Sub1;
import com.jagex.Class209;
import com.jagex.Class227;
import com.jagex.Class229;
import com.jagex.Class231;
import com.jagex.Class238;
import com.jagex.Class242;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class264;
import com.jagex.Class291;
import com.jagex.Class292;
import com.jagex.Class294;
import com.jagex.Class309;
import com.jagex.Class327;
import com.jagex.Class328;
import com.jagex.Class375;
import com.jagex.Class380;
import com.jagex.Class380_Sub3;
import com.jagex.Class380_Sub3_Sub1;
import com.jagex.Class386;
import com.jagex.Class387;
import com.jagex.Class388;
import com.jagex.Class407;
import com.jagex.Class418;
import com.jagex.Class433;
import com.jagex.Class442;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class448_Sub1;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class476;
import com.jagex.Class482;
import com.jagex.Class496;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub24;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub38;
import com.jagex.Class526_Sub9;
import com.jagex.Class531_Sub1;
import com.jagex.Class536;
import com.jagex.Class554;
import com.jagex.Class563;
import com.jagex.Class565;
import com.jagex.Class566;
import com.jagex.Class569;
import com.jagex.Class592;
import com.jagex.Class627;
import com.jagex.Class633;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class64;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class689_Sub1;
import com.jagex.Class704;
import com.jagex.Class710;
import com.jagex.Class711;
import com.jagex.Class76;
import com.jagex.Class8;
import com.jagex.Class84;
import com.jagex.Class92;
import com.jagex.Interface56;
import com.jagex.client;
import java.awt.Rectangle;
import java.net.MalformedURLException;
import java.net.URL;

class Class205 implements Interface56 {
   public static Class466 aClass466_2220;
   // $FF: synthetic field
   Class231 this$0;

   public void method370(Object var1, float[] var2, Object[] var3, int var4) {
      Class482 var5 = (Class482)var1;
      Class446 var6 = var5.method5784(-1098640869);
      float var7 = var5.method5785((short)27028);
      float var8 = var5.method5791(1244881981);
      Class446 var9 = Class446.method5275(var6, this.this$0.method3188(-1894529366));
      float var10 = 0.0F;
      float var11 = var9.method5276();
      if(var11 >= var8) {
         var10 = 0.0F;
      }

      if(var11 <= var7) {
         var10 = 1.0F;
      } else {
         float var12 = 1.0F - 1.0F / (var8 - var7) * (var11 - var7);
         if((double)var12 < 0.0D || (double)var12 > 1.0D) {
            var12 = Math.min(Math.max(var12, 0.0F), 1.0F);
         }

         var10 = var12;
      }

      var2[0] = var10;
      var2[1] = var10;
   }

   public void method371(Object var1, float[] var2, Object[] var3) {
      Class482 var4 = (Class482)var1;
      Class446 var5 = var4.method5784(-8699366);
      float var6 = var4.method5785((short)855);
      float var7 = var4.method5791(1244881981);
      Class446 var8 = Class446.method5275(var5, this.this$0.method3188(-1257724895));
      float var9 = 0.0F;
      float var10 = var8.method5276();
      if(var10 >= var7) {
         var9 = 0.0F;
      }

      if(var10 <= var6) {
         var9 = 1.0F;
      } else {
         float var11 = 1.0F - 1.0F / (var7 - var6) * (var10 - var6);
         if((double)var11 < 0.0D || (double)var11 > 1.0D) {
            var11 = Math.min(Math.max(var11, 0.0F), 1.0F);
         }

         var9 = var11;
      }

      var2[0] = var9;
      var2[1] = var9;
   }

   Class205(Class231 var1) {
      this.this$0 = var1;
   }

   static void method2894(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class689_Sub1.method10149(var2, (byte)1);
   }

   static final void method2895(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < -178271659 * client.anInt11244; ++var5) {
         Rectangle var6 = client.aRectangleArray11248[var5];
         if(var6.x + var6.width > var0 && var6.x < var2 + var0 && var6.height + var6.y > var1 && var6.y < var3 + var1) {
            client.aBoolArray11236[var5] = true;
         }
      }

   }

   static final void method2896(Class681 var0, int var1) {
      var0.anInt8623 -= -1199503753;
   }

   public static Class380 method2897(RSByteBuffer var0, byte var1) {
      Class380_Sub3 var2 = (Class380_Sub3)Class386.method4758(var0, 471143579);
      int var3 = var0.readShort((byte)1);
      return new Class380_Sub3_Sub1(var2.aClass384_3932, var2.aClass389_3929, var2.anInt3930 * 1035562863, 26479163 * var2.anInt3931, var2.anInt3936 * -219376461, var2.anInt3933 * 874500417, -1403557073 * var2.anInt3934, var2.anInt3935 * 2079046623, var2.anInt3928 * 252950473, var2.anInt10254 * -1434136933, var2.anInt10258 * -2013088249, var2.anInt10255 * 1541748783, var2.anInt10256 * 1033706277, var2.anInt10253 * -478097183, var2.anInt10257 * -226800375, var3);
   }

   public static final void method2898(InterfaceDef[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, byte var10) {
      Class554.aClass174_7475.method2538(var2, var3, var4, var5);

      for(int var11 = 0; var11 < var0.length; ++var11) {
         InterfaceDef var12 = var0[var11];
         if(null != var12 && (var12.parentId * -537841755 == var1 || var1 == -1412584499 && client.aClass245_11003 == var12)) {
            int var13;
            if(-1 == var8) {
               client.aRectangleArray11248[client.anInt11244 * -178271659].setBounds(var12.anInt2569 * 383963477 + var6, var7 + var12.anInt2572 * 1724213933, var12.anInt2510 * -99858407, var12.anInt2576 * -667181623);
               var13 = (client.anInt11244 += -1830886659) * -178271659 - 1;
            } else {
               var13 = var8;
            }

            var12.anInt2673 = var13 * -1954023587;
            var12.anInt2507 = -1207292041 * client.anInt11012;
            if(!client.method10312(var12)) {
               if(0 != -1805497315 * var12.anInt2493) {
                  Class238.method3306(var12, (byte)84);
               }

               int var14 = var6 + var12.anInt2569 * 383963477;
               int var15 = var12.anInt2572 * 1724213933 + var7;
               int var16 = -387736425 * var12.anInt2526;
               if(client.aBool11192 && (client.method10311(var12).anInt10547 * -798296491 != 0 || 0 == -449120703 * var12.type) && var16 > 127) {
                  var16 = 127;
               }

               int var17;
               int var18;
               if(var12 == client.aClass245_11003) {
                  if(-1412584499 != var1 && (-1092992397 * InterfaceDef.anInt2547 == var12.anInt2601 * 975323135 || 305104009 * InterfaceDef.anInt2629 == 975323135 * var12.anInt2601 || client.method10311(var12).method9458(579546720) && 975323135 * var12.anInt2601 != InterfaceDef.anInt2508 * -1448563083)) {
                     Class418.aClass245Array4516 = var0;
                     Class710.anInt8852 = var6 * -1431910609;
                     Class12.anInt153 = -251321291 * var7;
                     continue;
                  }

                  if(client.aBool11047 && client.aBool11202) {
                     var17 = Class8.aClass547_45.method6534(732046150);
                     var18 = Class8.aClass547_45.method6531(-1566286503);
                     var17 -= 329308709 * client.anInt11199;
                     var18 -= client.anInt11200 * 1887623781;
                     if(var17 < client.anInt11203 * 1912652721) {
                        var17 = 1912652721 * client.anInt11203;
                     }

                     if(var12.anInt2510 * -99858407 + var17 > client.anInt11203 * 1912652721 + -1723964787 * client.anInt11172) {
                        var17 = -1723964787 * client.anInt11172 + 1912652721 * client.anInt11203 - -99858407 * var12.anInt2510;
                     }

                     if(var18 < client.anInt11182 * -61327887) {
                        var18 = client.anInt11182 * -61327887;
                     }

                     if(var18 + -667181623 * var12.anInt2576 > client.anInt11182 * -61327887 + client.anInt11206 * 1743334447) {
                        var18 = client.anInt11206 * 1743334447 + client.anInt11182 * -61327887 - -667181623 * var12.anInt2576;
                     }

                     if(client.method10311(var12).method9458(579546720)) {
                        method2895(var17, var18, var12.anInt2510 * -99858407, var12.anInt2576 * -667181623, 629720294);
                     }

                     if(975323135 * var12.anInt2601 != -1448563083 * InterfaceDef.anInt2508) {
                        var14 = var17;
                        var15 = var18;
                     }
                  }

                  if(InterfaceDef.anInt2629 * 305104009 == 975323135 * var12.anInt2601) {
                     var16 = 128;
                  }
               }

               int var19;
               int var20;
               int var21;
               int var22;
               if(2 == -449120703 * var12.type) {
                  var17 = var2;
                  var18 = var3;
                  var19 = var4;
                  var20 = var5;
               } else {
                  var21 = var12.anInt2510 * -99858407 + var14;
                  var22 = var15 + var12.anInt2576 * -667181623;
                  if(9 == -449120703 * var12.type) {
                     ++var21;
                     ++var22;
                  }

                  var17 = var14 > var2?var14:var2;
                  var18 = var15 > var3?var15:var3;
                  var19 = var21 < var4?var21:var4;
                  var20 = var22 < var5?var22:var5;
               }

               if(var17 < var19 && var18 < var20) {
                  int var23;
                  int var29;
                  Class153 var37;
                  int var40;
                  int var43;
                  int var44;
                  if(0 != -1805497315 * var12.anInt2493) {
                     if(InterfaceDef.anInt2473 * -973105891 == -1805497315 * var12.anInt2493 || -1805497315 * var12.anInt2493 == InterfaceDef.anInt2474 * -271628825) {
                        if(client.aBool11298) {
                           Class554.aClass174_7475.method2312();
                           Class711.method8324(var14, var15, var12.anInt2510 * -99858407, -667181623 * var12.anInt2576, -271628825 * InterfaceDef.anInt2474 == var12.anInt2493 * -1805497315, 14758297);
                           Class536.method6426(var13, var17, var18, var19, var20, var14, var15, 2114880167);
                           Class554.aClass174_7475.method2274();
                           Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                           client.aBoolArray11236[var13] = true;
                        }
                        continue;
                     }

                     if(var12.anInt2493 * -1805497315 == InterfaceDef.anInt2556 * -1943455667 && 3 == 378016543 * client.anInt11073) {
                        if(5 != var12.type * -449120703 || var12.method3351(Class554.aClass174_7475, (byte)-90) != null) {
                           Class229.method3176(Class554.aClass174_7475, var12, var14, var15, (byte)0);
                           Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                        }
                        continue;
                     }

                     if(475835289 * InterfaceDef.anInt2482 == -1805497315 * var12.anInt2493) {
                        Class563.method6779(Class554.aClass174_7475, var14, var15, var12, 1698752828);
                        continue;
                     }

                     if(InterfaceDef.anInt2483 * 1963345941 == -1805497315 * var12.anInt2493) {
                        Class407.method4880(Class554.aClass174_7475, var14, var15, var12, var12.anInt2611 * -1115067825 % 64, (short)6914);
                        continue;
                     }

                     if(2135649753 * InterfaceDef.anInt2476 == -1805497315 * var12.anInt2493) {
                        if(var12.method3351(Class554.aClass174_7475, (byte)45) != null) {
                           Class554.aClass174_7475.method2312();
                           Class496.method5915(var12, var14, var15, (short)-5813);
                           Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                        }
                        continue;
                     }

                     if(-1805497315 * var12.anInt2493 == InterfaceDef.anInt2542 * 329044361) {
                        Class292.method3951(Class554.aClass174_7475, var14, var15, var12.anInt2510 * -99858407, -667181623 * var12.anInt2576, (byte)77);
                        client.aBoolArray11236[var13] = true;
                        Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                        continue;
                     }

                     if(var12.anInt2493 * -1805497315 == InterfaceDef.anInt2566 * 963839447) {
                        Class565.method6801(Class554.aClass174_7475, var14, var15, -99858407 * var12.anInt2510, var12.anInt2576 * -667181623, -282300004);
                        client.aBoolArray11236[var13] = true;
                        Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                        continue;
                     }

                     if(522458599 * InterfaceDef.anInt2479 == var12.anInt2493 * -1805497315) {
                        if(client.aBool11015 || client.aBool11016) {
                           Class92.method1212(var14, var15, var12, -1498406752);
                           client.aBoolArray11236[var13] = true;
                        }
                        continue;
                     }

                     if(InterfaceDef.anInt2484 * -2050221537 == var12.anInt2493 * -1805497315) {
                        var37 = Class167.method1938(-1154233161);
                        if(var37 != null) {
                           var22 = var4 - var2;
                           var23 = var5 - var3;
                           float var49 = (float)var22 / (float)var23;
                           float var48 = (float)var37.method1825() / (float)var37.method1771();
                           if(var49 < var48) {
                              var43 = var22;
                              var40 = (int)((float)var22 / var48);
                           } else {
                              var43 = (int)((float)var23 * var48);
                              var40 = var23;
                           }

                           var44 = var2 + (var22 - var43) / 2;
                           var29 = (var23 - var40) / 2 + var3;
                           var37.method1772(var44, var29, var43, var40);
                        }
                        continue;
                     }

                     if(InterfaceDef.anInt2471 * 552060255 == var12.anInt2493 * -1805497315) {
                        if(Class328.method4200(-278901837) && Class569.method6838(951417478)) {
                           Class387.method4763(var2, var3, var4, var5, 22119035);
                        }
                        continue;
                     }
                  }

                  int var24;
                  int var25;
                  if(0 == var12.type * -449120703) {
                     if(-1805497315 * var12.anInt2493 == InterfaceDef.anInt2536 * -2134870871) {
                        Class554.aClass174_7475.method2312();
                        client.aClass505_11204.method6100((byte)107).method7363(client.aClass505_11204, (short)26886);
                        Class554.aClass174_7475.method2340(var14, var15, Class566.anInt7611 * 1895615023, Class526_Sub24.anInt10549 * 974996221);
                     }

                     method2898(var0, var12.uid * 919258769, var17, var18, var19, var20, var14 - var12.anInt2520 * 480812513, var15 - var12.anInt2626 * -1580669593, var13, var9, (byte)-116);
                     if(null != var12.aClass245Array2530) {
                        method2898(var12.aClass245Array2530, 919258769 * var12.uid, var17, var18, var19, var20, var14 - 480812513 * var12.anInt2520, var15 - -1580669593 * var12.anInt2626, var13, var9, (byte)-92);
                     }

                     Class526_Sub38 var34 = (Class526_Sub38)client.aClass20_11187.get((long)(919258769 * var12.uid));
                     if(null != var34) {
                        Class17.method624(var34.anInt10684 * -870147923, var17, var18, var19, var20, var14 - 480812513 * var12.anInt2520, var15 - -1580669593 * var12.anInt2626, var13, -1870968355);
                     }

                     if(-1805497315 * var12.anInt2493 == InterfaceDef.anInt2536 * -2134870871) {
                        if(Class554.aClass174_7475.method2275()) {
                           Class554.aClass174_7475.method2341(-99858407 * var12.anInt2510, -667181623 * var12.anInt2576);
                           if(9 == -558705405 * client.anInt11038) {
                              Class680.method8025(var14, var15, -99858407 * var12.anInt2510, var12.anInt2576 * -667181623, (byte)19);
                           }
                        }

                        if(client.anInt11073 * 378016543 == 4) {
                           var22 = client.anInt11268 * -1503553591;
                           var23 = client.anInt11081 * 304631387;
                           var24 = client.anInt11112 * -245967997;
                           var25 = client.anInt11031 * -1047046611;
                           if(client.anInt11012 < 1350431305 * client.anInt11079) {
                              float var26 = (float)(client.anInt11012 - 825770265 * client.anInt11078) * 1.0F / (float)(client.anInt11079 * 1350431305 - 825770265 * client.anInt11078);
                              var22 = (int)((1.0F - var26) * (float)(Class291.anInt3139 * -311263211) + (float)(client.anInt11268 * -1503553591) * var26);
                              var23 = (int)((float)(304631387 * client.anInt11081) * var26 + (1.0F - var26) * (float)(1714565591 * Class209.anInt2255));
                              var24 = (int)(var26 * (float)(-245967997 * client.anInt11112) + (float)(-1696879767 * Class84.anInt852) * (1.0F - var26));
                              var25 = (int)((1.0F - var26) * (float)(Class64.anInt745 * -640330881) + var26 * (float)(-1047046611 * client.anInt11031));
                           }

                           if(var22 > 0) {
                              Class554.aClass174_7475.method2356(var17, var18, var19 - var17, var20 - var18, var22 << 24 | var23 << 16 | var24 << 8 | var25, (byte)57);
                           }
                        }
                     }

                     Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                  }

                  if(client.aBoolArray11195[var13] || client.anInt11249 * -1546915003 > 1) {
                     if(3 == var12.type * -449120703) {
                        if(0 == var16) {
                           if(var12.aBool2525) {
                              Class554.aClass174_7475.method2290(var14, var15, var12.anInt2510 * -99858407, -667181623 * var12.anInt2576, -16777216 | var12.anInt2611 * -1115067825, 0);
                           } else {
                              Class554.aClass174_7475.method2261(var14, var15, var12.anInt2510 * -99858407, -667181623 * var12.anInt2576, -16777216 | -1115067825 * var12.anInt2611, 0);
                           }
                        } else if(var12.aBool2525) {
                           Class554.aClass174_7475.method2290(var14, var15, -99858407 * var12.anInt2510, var12.anInt2576 * -667181623, 255 - (var16 & 255) << 24 | var12.anInt2611 * -1115067825 & 16777215, 1);
                        } else {
                           Class554.aClass174_7475.method2261(var14, var15, -99858407 * var12.anInt2510, var12.anInt2576 * -667181623, 255 - (var16 & 255) << 24 | var12.anInt2611 * -1115067825 & 16777215, 1);
                        }
                     } else if(4 == -449120703 * var12.type) {
                        var21 = 255 - (var16 & 255);
                        if(var21 != 0) {
                           Class163 var45 = var12.method3346(Class627.aClass418_8195, client.anInterface51_11046, -1161339140);
                           if(var45 == null) {
                              if(InterfaceDef.aBool2676) {
                                 Class526_Sub31.method9555(var12, (byte)10);
                              }
                           } else {
                              var23 = var12.anInt2611 * -1115067825;
                              String var46 = var12.aString2575;
                              if(var12.componentItem * -77845371 != -1) {
                                 Class11 var47 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var12.componentItem * -77845371, -1567534660);
                                 var46 = var47.aString76;
                                 if(null == var46) {
                                    var46 = "null";
                                 }

                                 if((1 == 1095415197 * var47.anInt116 || 1593645501 * var12.anInt2499 != 1) && -1 != var12.anInt2499 * 1593645501) {
                                    var46 = Class592.method7026(16748608, 1405203914) + var46 + Class64.aString743 + " x" + Class191.method2762(var12.anInt2499 * 1593645501, -302943567);
                                 }
                              }

                              if(client.aClass245_11213 == var12) {
                                 var46 = Class45.aClass45_596.method920(Class26.aClass673_247, -827840379);
                                 var23 = var12.anInt2611 * -1115067825;
                              }

                              if(client.aBool11196) {
                                 Class554.aClass174_7475.method2317(var14, var15, var14 + -99858407 * var12.anInt2510, var15 + var12.anInt2576 * -667181623);
                              }

                              var21 <<= 24;
                              if(var12.aBool2650) {
                                 var45.method1902(var46, var14, var15, var12.anInt2510 * -99858407, var12.anInt2576 * -667181623, var21 | var23, var12.aBool2562?var21:-1, var12.anInt2577 * 2121807403, 1314786171 * var12.anInt2578, client.aRandom11163, Class309.anInt3378, client.anIntArray11250, Class442.aClass153Array4878, (int[])null, (byte)44);
                              } else {
                                 var45.method1898(var46, var14, var15, var12.anInt2510 * -99858407, var12.anInt2576 * -667181623, var21 | var23, var12.aBool2562?var21:-1, 2121807403 * var12.anInt2577, var12.anInt2578 * 1314786171, var12.anInt2488 * 1371005853, var12.anInt2580 * 608447081, Class442.aClass153Array4878, (int[])null, (Class162)null, 0, 0, (byte)37);
                              }

                              if(client.aBool11196) {
                                 Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                              }
                           }
                        }
                     } else {
                        int var30;
                        boolean var39;
                        if(var12.type * -449120703 == 5) {
                           if(var12.anInt2653 * 1971463091 >= 0) {
                              var12.method3373(Class294.aClass40_Sub13_3189, Class199_Sub1.aClass40_Sub4_9867, -1105987815).method5932(Class554.aClass174_7475, 0, var14, var15, var12.anInt2510 * -99858407, var12.anInt2576 * -667181623, var12.anInt2606 * -1323711437 << 3, var12.anInt2655 * 2136398199 << 3, 0, 0, -724556620);
                           } else {
                              if(-1 != var12.componentItem * -77845371) {
                                 Class633 var42 = var12.aBool2652?Class451.localPlayer.aClass633_12181:null;
                                 var37 = Class448_Sub1.aClass40_Sub1_10233.method10233(Class554.aClass174_7475, -77845371 * var12.componentItem, 1593645501 * var12.anInt2499, 455760595 * var12.anInt2532, -16777216 | -1233094027 * var12.anInt2533, var12.anInt2555 * -1635187323, var42, -102678914);
                              } else if(-1 != -1498088313 * var12.spriteArchive) {
                                 var37 = (Class153)client.aClass192_11299.method2765((long)(var12.spriteArchive * -1498088313));
                                 if(null == var37 && !client.aMap11300.containsKey(Integer.valueOf(-1498088313 * var12.spriteArchive))) {
                                    try {
                                       client.aMap11300.put(Integer.valueOf(var12.spriteArchive * -1498088313), Class476.aClass55_5387.method985(new URL(client.aString10996 + "/img/image_" + var12.spriteArchive * -1498088313 + ".png?a=" + Class255.time((byte)24)), 1553113520));
                                    } catch (MalformedURLException var33) {
                                       Class375.method4671((String)null, var33, (byte)103);
                                    }
                                 }
                              } else {
                                 var37 = var12.method3345(Class554.aClass174_7475, -2079200450);
                              }

                              if(var37 != null) {
                                 var22 = var37.method21();
                                 var23 = var37.method1788();
                                 var24 = 255 - (var16 & 255);
                                 if(0 != var24) {
                                    if(-1115067825 * var12.anInt2611 == -1) {
                                       var25 = 16777215;
                                    } else {
                                       var25 = -1115067825 * var12.anInt2611 & 16777215;
                                       if(var25 == 0) {
                                          var25 = 16777215;
                                       }
                                    }

                                    var25 |= var24 << 24;
                                    var39 = var25 != -1;
                                    if(!var12.aBool2531) {
                                       if(var39) {
                                          if(var12.anInt2524 * -1681327621 != 0) {
                                             var37.method1829((float)var14 + (float)(var12.anInt2510 * -99858407) / 2.0F, (float)(-667181623 * var12.anInt2576) / 2.0F + (float)var15, -998141952 * var12.anInt2510 / var22, -1681327621 * var12.anInt2524, 0, var25, 1);
                                          } else if(var22 == var12.anInt2510 * -99858407 && -667181623 * var12.anInt2576 == var23) {
                                             var37.method1774(var14, var15, 0, var25, 1);
                                          } else {
                                             var37.method1781(var14, var15, var12.anInt2510 * -99858407, -667181623 * var12.anInt2576, 0, var25, 1);
                                          }
                                       } else if(-1681327621 * var12.anInt2524 != 0) {
                                          var37.method1826((float)(-99858407 * var12.anInt2510) / 2.0F + (float)var14, (float)(-667181623 * var12.anInt2576) / 2.0F + (float)var15, (float)var22 / 2.0F, (float)var23 / 2.0F, var12.anInt2510 * -998141952 / var22, var12.anInt2576 * -1176727552 / var23, -1681327621 * var12.anInt2524, 1, -1, 1);
                                       } else if(var12.anInt2510 * -99858407 == var22 && var23 == -667181623 * var12.anInt2576) {
                                          var37.method1778(var14, var15);
                                       } else {
                                          var37.method1772(var14, var15, -99858407 * var12.anInt2510, -667181623 * var12.anInt2576);
                                       }
                                    } else {
                                       Class554.aClass174_7475.method2317(var14, var15, var14 + -99858407 * var12.anInt2510, var12.anInt2576 * -667181623 + var15);
                                       if(0 != var12.anInt2524 * -1681327621) {
                                          var40 = (var12.anInt2510 * -99858407 + (var22 - 1)) / var22;
                                          var44 = (var12.anInt2576 * -667181623 + (var23 - 1)) / var23;

                                          for(var29 = 0; var29 < var40; ++var29) {
                                             for(var30 = 0; var30 < var44; ++var30) {
                                                if(var39) {
                                                   var37.method1829((float)(var14 + var29 * var22) + (float)var22 / 2.0F, (float)var23 / 2.0F + (float)(var15 + var30 * var23), 4096, -1681327621 * var12.anInt2524, 0, var25, 1);
                                                } else {
                                                   var37.method1786((float)(var29 * var22 + var14) + (float)var22 / 2.0F, (float)(var23 * var30 + var15) + (float)var23 / 2.0F, 4096, var12.anInt2524 * -1681327621);
                                                }
                                             }
                                          }
                                       } else if(var39) {
                                          var37.method1784(var14, var15, var12.anInt2510 * -99858407, -667181623 * var12.anInt2576, 0, var25, 1);
                                       } else {
                                          var37.method1783(var14, var15, var12.anInt2510 * -99858407, -667181623 * var12.anInt2576);
                                       }

                                       Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                                    }
                                 }
                              } else if(InterfaceDef.aBool2676) {
                                 Class526_Sub31.method9555(var12, (byte)10);
                              }
                           }
                        } else if(6 == var12.type * -449120703) {
                           Class554.aClass174_7475.method2312();
                           Class168 var35 = null;
                           var22 = 2048;
                           if(0 != var12.anInt2563 * 1959010293) {
                              var22 |= 524288;
                           }

                           var23 = 0;
                           if(-1 != -77845371 * var12.componentItem) {
                              Class11 var38 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var12.componentItem * -77845371, 18929663);
                              if(null != var38) {
                                 var38 = var38.method588(var12.anInt2499 * 1593645501, 682100347);
                                 var35 = var38.method587(Class554.aClass174_7475, var22, 1, var12.aBool2652?Class451.localPlayer.aClass633_12181:null, var12.aClass704_2661, 0, 0, 0, 0, (byte)89);
                                 if(null != var35) {
                                    var23 = -var35.method1981() >> 1;
                                 } else {
                                    Class526_Sub31.method9555(var12, (byte)10);
                                 }
                              }
                           } else {
                              Class639_Sub1_Sub2_Sub1_Sub1 var36;
                              if(var12.modelType * 619744185 == 3) {
                                 var24 = var12.anInt2539 * 561507777;
                                 if(var24 >= 0 && var24 < 2048) {
                                    var36 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var24];
                                    if(var36 != null && (-1204447689 * client.localPlayerIndex == var24 || Class526_Sub9.method9360(var36.aString12161, (byte)77) == var12.anInt2540 * -2040010137)) {
                                       var35 = var12.method3348(Class554.aClass174_7475, var22, Class227.aClass40_Sub16_2327, Class264.aClass40_Sub9_2970, Class76.loader, Class448_Sub1.aClass40_Sub1_10233, Class388.aClass40_Sub15_4063, Class242.aClass94_2456, Class242.aClass94_2456, var12.aClass704_2661, var36.aClass633_12181, -1642610578);
                                       if(null == var35 && InterfaceDef.aBool2676) {
                                          Class526_Sub31.method9555(var12, (byte)10);
                                       }
                                    }
                                 }
                              } else if(619744185 * var12.modelType == 5) {
                                 var24 = var12.anInt2539 * 561507777;
                                 var36 = null;
                                 var39 = false;
                                 if(var24 >= 0 && var24 < 2048) {
                                    var36 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var24];
                                    var39 = null != var36 && (var24 == client.localPlayerIndex * -1204447689 || Class526_Sub9.method9360(var36.aString12161, (byte)-114) == -2040010137 * var12.anInt2540);
                                 } else if(var24 == -1) {
                                    var39 = true;
                                    var36 = Class451.localPlayer;
                                 } else {
                                    Class639_Sub1_Sub2_Sub1_Sub1 var27 = (Class639_Sub1_Sub2_Sub1_Sub1)client.aMap11156.get(Integer.valueOf(var24));
                                    if(var27 != null && 828574411 * var27.index == var24) {
                                       var39 = true;
                                       var36 = var27;
                                    }
                                 }

                                 if(var39 && var36 != null && var36.aClass633_12181 != null) {
                                    var35 = var36.aClass633_12181.method7504(Class554.aClass174_7475, var22, Class227.aClass40_Sub16_2327, Class264.aClass40_Sub9_2970, Class76.loader, Class448_Sub1.aClass40_Sub1_10233, Class242.aClass94_2456, Class242.aClass94_2456, var12.aClass704_2661, (Class704)null, (Class704[])null, (int[])null, 0, true, Class710.aClass620_8851, (short)17430);
                                 }
                              } else if(8 != 619744185 * var12.modelType && 619744185 * var12.modelType != 9) {
                                 if(var12.aClass704_2661 != null && var12.aClass704_2661.method8218((byte)-90)) {
                                    var35 = var12.method3348(Class554.aClass174_7475, var22, Class227.aClass40_Sub16_2327, Class264.aClass40_Sub9_2970, Class76.loader, Class448_Sub1.aClass40_Sub1_10233, Class388.aClass40_Sub15_4063, Class242.aClass94_2456, Class242.aClass94_2456, var12.aClass704_2661, Class451.localPlayer.aClass633_12181, -1642610578);
                                    if(null == var35 && InterfaceDef.aBool2676) {
                                       Class526_Sub31.method9555(var12, (byte)10);
                                    }
                                 } else {
                                    var35 = var12.method3348(Class554.aClass174_7475, var22, Class227.aClass40_Sub16_2327, Class264.aClass40_Sub9_2970, Class76.loader, Class448_Sub1.aClass40_Sub1_10233, Class388.aClass40_Sub15_4063, Class242.aClass94_2456, Class242.aClass94_2456, (Class704)null, Class451.localPlayer.aClass633_12181, -1642610578);
                                    if(var35 == null && InterfaceDef.aBool2676) {
                                       Class526_Sub31.method9555(var12, (byte)10);
                                    }
                                 }
                              } else {
                                 Class526_Sub2 var41 = Class531_Sub1.method9301(var12.anInt2539 * 561507777, false, 1970031431);
                                 if(var41 != null) {
                                    var35 = var41.method9281(Class554.aClass174_7475, var22, var12.aClass704_2661, -2040010137 * var12.anInt2540, var12.modelType * 619744185 == 9, var12.aBool2652?Class451.localPlayer.aClass633_12181:null, 1833304615);
                                 }
                              }
                           }

                           if(var35 != null) {
                              if(0 != var12.anInt2563 * 1959010293) {
                                 var35.method2020(var12.anInt2514 * 863129783, var12.anInt2516 * -1267292415, -802590321 * var12.anInt2594, var12.anInt2563 * 1959010293);
                              }

                              if(var12.anInt2551 * 271174405 > 0) {
                                 var24 = (-99858407 * var12.anInt2510 << 9) / (var12.anInt2551 * 271174405);
                              } else {
                                 var24 = 512;
                              }

                              if(1199758863 * var12.anInt2552 > 0) {
                                 var25 = (-667181623 * var12.anInt2576 << 9) / (var12.anInt2552 * 1199758863);
                              } else {
                                 var25 = 512;
                              }

                              var43 = var12.anInt2510 * -99858407 / 2 + var14;
                              var40 = var12.anInt2576 * -667181623 / 2 + var15;
                              if(!var12.aBool2541) {
                                 var43 += var12.anInt2591 * 1864355683 * var24 >> 9;
                                 var40 += var25 * 2033322233 * var12.anInt2548 >> 9;
                              }

                              client.aClass445_11024.method5219();
                              Class554.aClass174_7475.method2326(client.aClass445_11024);
                              Class433 var28 = Class554.aClass174_7475.method2318();
                              var29 = client.aClass505_11204.method6107(503633831);
                              var30 = client.aClass505_11204.method6061((byte)-95);
                              var30 += var12.anInt2550 * -1448987627;
                              if(var12.aBool2553) {
                                 if(Class327.anInt3488 * -265840483 == 2) {
                                    if(var12.aBool2541) {
                                       var28.method5097((float)var43, (float)var40, (float)var24, (float)var25, Class195.aClass292_Sub1_2182.method3922(-1746370674), Class195.aClass292_Sub1_2182.method3923(-1746146774), (float)(Class566.anInt7611 * 1895615023), (float)(Class526_Sub24.anInt10549 * 974996221), (float)(var12.anInt2550 * -1448987627));
                                    } else {
                                       var28.method5097((float)var43, (float)var40, (float)var24, (float)var25, Class195.aClass292_Sub1_2182.method3922(-1698122602), Class195.aClass292_Sub1_2182.method3923(-1743435335), (float)(Class566.anInt7611 * 1895615023), (float)(974996221 * Class526_Sub24.anInt10549), (float)(var12.anInt2550 * -1448987627 << 2));
                                    }
                                 } else if(var12.aBool2541) {
                                    var28.method5097((float)var43, (float)var40, (float)var24, (float)var25, (float)var29, (float)var30, (float)(1895615023 * Class566.anInt7611), (float)(974996221 * Class526_Sub24.anInt10549), (float)(-1448987627 * var12.anInt2550));
                                 } else {
                                    var28.method5097((float)var43, (float)var40, (float)var24, (float)var25, (float)var29, (float)var30, (float)(1895615023 * Class566.anInt7611), (float)(Class526_Sub24.anInt10549 * 974996221), (float)(var12.anInt2550 * -1448987627 << 2));
                                 }
                              } else if(2 == Class327.anInt3488 * -265840483) {
                                 var28.method5096((float)var43, (float)var40, (float)var24, (float)var25, Class195.aClass292_Sub1_2182.method3922(-1632533285), Class195.aClass292_Sub1_2182.method3923(-1954048968), (float)(Class566.anInt7611 * 1895615023), (float)(974996221 * Class526_Sub24.anInt10549));
                              } else {
                                 var28.method5096((float)var43, (float)var40, (float)var24, (float)var25, (float)var29, (float)var30, (float)(1895615023 * Class566.anInt7611), (float)(Class526_Sub24.anInt10549 * 974996221));
                              }

                              Class554.aClass174_7475.method2231(var28);
                              Class554.aClass174_7475.method2283(2, 0);
                              if(var12.aBool2641) {
                                 Class554.aClass174_7475.method2328(false);
                              }

                              if(var12.aBool2541) {
                                 client.aClass445_11007.method5225(1.0F, 0.0F, 0.0F, Class443.method5200(var12.anInt2544 * 656480735));
                                 client.aClass445_11007.method5237(0.0F, 1.0F, 0.0F, Class443.method5200(487185371 * var12.anInt2545));
                                 client.aClass445_11007.method5237(0.0F, 0.0F, 1.0F, Class443.method5200(-1546678639 * var12.anInt2546));
                                 client.aClass445_11007.method5251((float)(1864355683 * var12.anInt2591), (float)(2033322233 * var12.anInt2548), (float)(var12.anInt2477 * -908972717));
                              } else {
                                 int var31 = (var12.anInt2550 * -1448987627 << 2) * Class443.anIntArray4895[var12.anInt2544 * 656480735 << 3] >> 14;
                                 int var32 = (var12.anInt2550 * -1448987627 << 2) * Class443.anIntArray4896[var12.anInt2544 * 656480735 << 3] >> 14;
                                 client.aClass445_11007.method5225(0.0F, 0.0F, 1.0F, Class443.method5200(-(-1546678639 * var12.anInt2546) << 3));
                                 client.aClass445_11007.method5237(0.0F, 1.0F, 0.0F, Class443.method5200(var12.anInt2545 * 487185371 << 3));
                                 client.aClass445_11007.method5251((float)(var12.anInt2649 * 769259159 << 2), (float)((-1115410879 * var12.anInt2543 << 2) + var31 + var23), (float)(var32 + (-1115410879 * var12.anInt2543 << 2)));
                                 client.aClass445_11007.method5237(1.0F, 0.0F, 0.0F, Class443.method5200(var12.anInt2544 * 656480735 << 3));
                              }

                              var12.method3359(Class554.aClass174_7475, var35, client.aClass445_11007, client.anInt11012, (byte)15);
                              Class554.aClass174_7475.method2274();
                              Class554.aClass174_7475.method2281(true);
                              Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                              if(client.aBool11196) {
                                 Class554.aClass174_7475.method2317(var14, var15, var14 + -99858407 * var12.anInt2510, -667181623 * var12.anInt2576 + var15);
                              }

                              if(var12.aBool2586) {
                                 client.aClass505_11204.method6100((byte)39).method7379((float)(var12.anInt2570 * -2020279687) / 256.0F, (float)(var12.anInt2568 * 170757787) / 256.0F, (float)(416742921 * var12.anInt2602) / 256.0F, -1606502979 * var12.anInt2571, 140419443 * var12.anInt2565, var12.anInt2590 * -1508028387, var12.anInt2549 * 651232459, var12.anInt2631 * -1819374983, -35417990);
                              } else {
                                 client.aClass505_11204.method6100((byte)-97).method7384(-1411474643);
                              }

                              var35.method1974(client.aClass445_11007, (Class164)null, 1);
                              if(!var12.aBool2553 && var12.aClass614_2617 != null) {
                                 Class554.aClass174_7475.method2516(var12.aClass614_2617.method7249());
                              }

                              if(client.aBool11196) {
                                 Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                              }

                              Class554.aClass174_7475.method2281(false);
                              Class554.aClass174_7475.method2278();
                              Class554.aClass174_7475.method2538(var2, var3, var4, var5);
                              if(var12.aBool2586) {
                                 client.aClass505_11204.method6100((byte)-34).method7384(-1974766324);
                              }

                              if(var12.aBool2641) {
                                 Class554.aClass174_7475.method2328(true);
                              }
                           }
                        } else if(var12.type * -449120703 == 9) {
                           if(var12.aBool2528) {
                              var21 = var14;
                              var22 = var12.anInt2576 * -667181623 + var15;
                              var23 = var14 + var12.anInt2510 * -99858407;
                              var24 = var15;
                           } else {
                              var21 = var14;
                              var22 = var15;
                              var23 = -99858407 * var12.anInt2510 + var14;
                              var24 = var12.anInt2576 * -667181623 + var15;
                           }

                           if(var12.anInt2527 * -1788868053 == 1) {
                              Class554.aClass174_7475.method2630(var21, var22, var23, var24, -16777216 | -1115067825 * var12.anInt2611, 0);
                           } else {
                              Class554.aClass174_7475.method2422(var21, var22, var23, var24, -16777216 | -1115067825 * var12.anInt2611, -1788868053 * var12.anInt2527, 0);
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
