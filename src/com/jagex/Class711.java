package com.jagex;

import com.jagex.Class105;
import com.jagex.Class149;
import com.jagex.Class186;
import com.jagex.Class195;
import com.jagex.Class197;
import com.jagex.Class199_Sub3;
import com.jagex.Class210;
import com.jagex.Class219;
import com.jagex.Class230;
import com.jagex.Class240_Sub1;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class26;
import com.jagex.Class273;
import com.jagex.NPCDef;
import com.jagex.Class309;
import com.jagex.Class317;
import com.jagex.Class322;
import com.jagex.Class327;
import com.jagex.Class348;
import com.jagex.Class387;
import com.jagex.Class422;
import com.jagex.Class43;
import com.jagex.Class439;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class482;
import com.jagex.Class487;
import com.jagex.Class492;
import com.jagex.Class52;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub33;
import com.jagex.Class539_Sub1;
import com.jagex.Class547;
import com.jagex.Class554;
import com.jagex.Class567;
import com.jagex.RenderDef;
import com.jagex.Class596;
import com.jagex.Class627;
import com.jagex.Class634;
import com.jagex.Class637;
import com.jagex.Class670;
import com.jagex.Class675;
import com.jagex.Class679;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.client;

public abstract class Class711 {
   protected static final int anInt8854 = 2;
   public static final int anInt8855 = 3;
   protected static final int anInt8857 = 1;
   static int anInt8858;
   protected int anInt8853;
   protected Class526_Sub33 aClass526_Sub33_8856;

   abstract int method8311();

   Class711(int var1, Class526_Sub33 var2) {
      this.anInt8853 = var1 * 1568955811;
      this.aClass526_Sub33_8856 = var2;
   }

   void method8312(int var1) {
      if(this.method8313(var1, -1942473349) != 3) {
         this.method8315(var1, 1195431937);
      }

   }

   abstract int method8313(int var1, int var2);

   void method8314(int var1, byte var2) {
      if(this.method8313(var1, -1449371573) != 3) {
         this.method8315(var1, 1849919532);
      }

   }

   abstract void method8315(int var1, int var2);

   abstract int method8316(int var1);

   abstract int method8317(int var1);

   void method8318(int var1) {
      if(this.method8313(var1, -2053482348) != 3) {
         this.method8315(var1, 572438487);
      }

   }

   abstract void method8319(int var1);

   abstract int method8320(byte var1);

   void method8321(int var1) {
      if(this.method8313(var1, -738321214) != 3) {
         this.method8315(var1, -487475181);
      }

   }

   Class711(Class526_Sub33 var1) {
      this.aClass526_Sub33_8856 = var1;
      this.anInt8853 = this.method8320((byte)127) * 1568955811;
   }

   static final void method8322(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3048(var3, (byte)8);
   }

   static final void method8323(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class240_Sub1.method9127(var3, var4, var0, (byte)1);
   }

   static final void method8324(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if(client.aClass505_11204.method6072(1324063757) == null) {
         Class554.aClass174_7475.method2356(var0, var1, var2, var3, -16777216, (byte)106);
      } else {
         Class446 var6 = Class451.localPlayer.method7635().aClass446_4816;
         boolean var7 = false;
         if(3 != 378016543 * client.anInt11073) {
            if(!client.aBool11247) {
               var7 = true;
            }
         } else {
            if((int)var6.aFloat4917 < 0 || (int)var6.aFloat4917 >= client.aClass505_11204.method6056(-1746741811) * 512 || (int)var6.aFloat4919 < 0 || (int)var6.aFloat4919 >= client.aClass505_11204.method6057(126749238) * 512) {
               var7 = true;
            }

            if(Class327.anInt3488 * -265840483 == 2 && !Class195.aClass292_Sub1_2182.method3929((byte)16)) {
               var7 = true;
            }
         }

         if(var7) {
            Class554.aClass174_7475.method2356(var0, var1, var2, var3, -16777216, (byte)98);
         } else {
            client.anInt11126 += -1651513981;
            if(Class451.localPlayer != null && (int)var6.aFloat4917 - (Class451.localPlayer.method10781(-627148024) - 1) * 256 >> 9 == Class105.anInt1300 * 1653075275 && (int)var6.aFloat4919 - (Class451.localPlayer.method10781(-627148024) - 1) * 256 >> 9 == Class105.anInt1301 * -1169606929) {
               Class105.anInt1300 = 2110507933;
               Class105.anInt1301 = 1654212593;
               NPCDef.method4065(-2027363908);
            }

            Class149.method1748((byte)8);
            if(!var4) {
               Class482.method5830(573624712);
            }

            Class197.method2841((byte)77);

            int var8;
            for(var8 = 0; var8 < client.aClass536Array11019.length; ++var8) {
               if(null != client.aClass536Array11019[var8] && !client.aClass536Array11019[var8].method6411(1424638468) && client.aClass536Array11019[var8].method6410(Class554.aClass174_7475, 1886920489)) {
                  client.aClass536Array11019[var8].method6405(client.aClass505_11204.method6072(1201751899), 815727000);
               }
            }

            Class273.method3612(var0, var1, var2, var3, true, (byte)10);
            var0 = 1133414285 * client.anInt11282;
            var1 = 932092123 * client.anInt11283;
            var2 = client.anInt11284 * 553698849;
            var3 = client.anInt11285 * 2102424733;
            Class539_Sub1.method9250(var0, var1, (byte)63);
            int var9;
            if(-265840483 * Class327.anInt3488 == 1) {
               var8 = (int)client.aFloat11210;
               if(client.anInt11113 * 1723323455 >> 8 > var8) {
                  var8 = 1723323455 * client.anInt11113 >> 8;
               }

               if(client.aBoolArray11263[4] && client.anIntArray11005[4] + 128 > var8) {
                  var8 = client.anIntArray11005[4] + 128;
               }

               var9 = 1729917477 * client.anInt11092 + (int)client.aFloat11105 & 16383;
               Class675.method8010(-445020973 * Class45.anInt639, Class387.method4762((int)var6.aFloat4917, (int)var6.aFloat4919, -395336755 * Class692.anInt8703, 2071499721) - 1449227059 * client.anInt11111, 1090885877 * Class186.anInt2122, var8, var9, 3 * (var8 >> 3) + 600 << 2, var3, -418322696);
            } else if(6 == Class327.anInt3488 * -265840483) {
               var8 = (int)client.aFloat11210;
               if(client.anInt11113 * 1723323455 >> 8 > var8) {
                  var8 = 1723323455 * client.anInt11113 >> 8;
               }

               if(client.aBoolArray11263[4] && 128 + client.anIntArray11005[4] > var8) {
                  var8 = 128 + client.anIntArray11005[4];
               }

               var9 = (int)client.aFloat11105 & 16383;
               Class675.method8010(Class45.anInt639 * -445020973, Class387.method4762(client.anInt11321 * -253127967, client.anInt11043 * -182161357, -395336755 * Class692.anInt8703, 1516344384) - client.anInt11111 * 1449227059, 1090885877 * Class186.anInt2122, var8, var9, (var8 >> 3) * 3 + 600 << 2, var3, -1621773969);
            } else if(5 == Class327.anInt3488 * -265840483) {
               Class670.method7977(var3, -1957887669);
            }

            var8 = 822351193 * Class439.anInt4866;
            var9 = 1323364505 * Class322.anInt3458;
            int var10 = 1215159411 * Class210.anInt2259;
            int var11 = 1962594051 * Class487.anInt5511;
            int var12 = Class317.anInt3410 * -871798227;

            int var14;
            for(int var13 = 0; var13 < 5; ++var13) {
               if(client.aBoolArray11263[var13]) {
                  var14 = (int)(Math.random() * (double)(1 + client.anIntArray11270[var13] * 2) - (double)client.anIntArray11270[var13] + Math.sin((double)client.anIntArray11273[var13] * ((double)client.anIntArray11272[var13] / 100.0D)) * (double)client.anIntArray11005[var13]);
                  if(0 == var13) {
                     Class439.anInt4866 += 1307632361 * (var14 << 2);
                  }

                  if(var13 == 1) {
                     Class322.anInt3458 += 1608934313 * (var14 << 2);
                  }

                  if(2 == var13) {
                     Class210.anInt2259 += (var14 << 2) * -2013648709;
                  }

                  if(3 == var13) {
                     Class317.anInt3410 = (var14 + -871798227 * Class317.anInt3410 & 16383) * -1157073499;
                  }

                  if(var13 == 4) {
                     Class487.anInt5511 += var14 * -567045205;
                     if(Class487.anInt5511 * 1962594051 < 1024) {
                        Class487.anInt5511 = -833704960;
                     } else if(1962594051 * Class487.anInt5511 > 3072) {
                        Class487.anInt5511 = 1793852416;
                     }
                  }
               }
            }

            if(822351193 * Class439.anInt4866 < 0) {
               Class439.anInt4866 = 0;
            }

            if(822351193 * Class439.anInt4866 > (client.aClass505_11204.method6072(1564279801).anInt7285 * -447634797 << 9) - 1) {
               Class439.anInt4866 = ((client.aClass505_11204.method6072(-1371664266).anInt7285 * -447634797 << 9) - 1) * 1307632361;
            }

            if(1215159411 * Class210.anInt2259 < 0) {
               Class210.anInt2259 = 0;
            }

            if(1215159411 * Class210.anInt2259 > (client.aClass505_11204.method6072(154692742).anInt7286 * 1913648871 << 9) - 1) {
               Class210.anInt2259 = ((client.aClass505_11204.method6072(-796601772).anInt7286 * 1913648871 << 9) - 1) * -2013648709;
            }

            if(Class230.preferences.aClass711_Sub18_10627.method10015(1162182661) == 2) {
               Class492.method5887(-736551699);
            } else if(Class230.preferences.aClass711_Sub18_10627.method10015(-1071835591) == 3) {
               Class567.method6820(846553134);
            }

            Class554.aClass174_7475.method2573(var0, var1, var2, var3);
            Class554.aClass174_7475.method2281(true);
            Class554.aClass174_7475.method2538(var0, var1, var0 + var2, var1 + var3);
            Class634 var19 = client.aClass505_11204.method6100((byte)-17).method7366(841161783);
            var14 = var19.method7538(537893496);
            Class309 var15 = new Class309();
            Class596 var16 = client.aClass505_11204.method6128(2110655231);
            if(Class348.method4524((byte)-70)) {
               Class43.aClass292_Sub1_458.method3911(var15, client.aClass445_11024, client.aClass433_11011, var16.localX * -814686591 << 9, var16.localY * -845789331 << 9, (byte)-1);
            } else if(2 == Class327.anInt3488 * -265840483) {
               Class195.aClass292_Sub1_2182.method3911(var15, client.aClass445_11024, client.aClass433_11011, var16.localX * -814686591 << 9, var16.localY * -845789331 << 9, (byte)-1);
            } else {
               client.aClass445_11024.method5229((float)(-(822351193 * Class439.anInt4866)), (float)(-(Class322.anInt3458 * 1323364505)), (float)(-(Class210.anInt2259 * 1215159411)));
               client.aClass445_11024.method5237(0.0F, -1.0F, 0.0F, Class443.method5200(-(-871798227 * Class317.anInt3410) & 16383));
               client.aClass445_11024.method5237(-1.0F, 0.0F, 0.0F, Class443.method5200(-(1962594051 * Class487.anInt5511) & 16383));
               client.aClass445_11024.method5237(0.0F, 0.0F, -1.0F, Class443.method5200(-(Class547.anInt7272 * 1704366871) & 16383));
               Class219.method3040(client.aClass433_11011, true, (float)(var2 / 2), (float)(var3 / 2), (float)(-1269456053 * client.anInt11292 << 1), (float)(-1269456053 * client.anInt11292 << 1), var2, var3, 351552591);
            }

            Class554.aClass174_7475.method2326(client.aClass445_11024);
            Class554.aClass174_7475.method2231(client.aClass433_11011);
            int var18;
            if(var19.method7537(-1023545967) != null) {
               Class554.aClass174_7475.method2331(1.0F);
               Class554.aClass174_7475.method2364(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
               if(2 == Class327.anInt3488 * -265840483) {
                  int var17 = (int)((double)Class195.aClass292_Sub1_2182.method3918(622393064) * 2607.5945876176133D);
                  var18 = (int)((double)Class195.aClass292_Sub1_2182.method3919(1600854552) * 2607.5945876176133D);
                  var19.method7537(1864528720).method5929(Class554.aClass174_7475, 752821667 * Class627.anInt8196 << 3, var0, var1, var2, var3, var17, var18, 0, var14, true, false, -593015477);
               } else {
                  var19.method7537(-2018800478).method5929(Class554.aClass174_7475, 752821667 * Class627.anInt8196 << 3, var0, var1, var2, var3, Class487.anInt5511 * 1962594051, Class317.anInt3410 * -871798227, Class547.anInt7272 * 1704366871, var14, true, false, 387977316);
               }

               Class554.aClass174_7475.method2312();
            } else {
               Class554.aClass174_7475.method2283(3, var14);
            }

            Class554.aClass174_7475.method2281(false);
            Class637.method7611(client.aClass445_11024, client.aClass433_11011, var2, var3, (byte)-52);
            client.aClass505_11204.method6100((byte)21).method7362(client.aClass505_11204, 1280674707);
            var18 = Class230.preferences.aClass711_Sub18_10627.method10015(-1489147704);
            byte var20;
            if(2 == var18) {
               var20 = (byte)(1242714411 * client.anInt11126);
            } else if(var18 == 3) {
               var20 = (byte)(client.aBool11068?1:-1);
            } else {
               var20 = 1;
            }

            if(!Class348.method4524((byte)-11) && Class327.anInt3488 * -265840483 != 2) {
               client.aClass505_11204.method6072(454116905).method6597(client.anInt11012, Class439.anInt4866 * 822351193, Class322.anInt3458 * 1323364505, Class210.anInt2259 * 1215159411, client.aClass505_11204.method6069((byte)-24), client.anIntArray11142, client.anIntArray11143, client.anIntArray11279, client.anIntArray11145, client.anIntArray11131, 1 + Class451.localPlayer.aByte10827, var20, (int)var6.aFloat4917 >> 9, (int)var6.aFloat4919 >> 9, Class230.preferences.aClass711_Sub20_10616.method10037((byte)-78) == 0, true, 0, true);
            } else {
               client.aClass505_11204.method6072(454745857).method6597(client.anInt11012, 1939759647 * var15.anInt3375, var15.anInt3374 * 298274455, -1339592163 * var15.anInt3376, client.aClass505_11204.method6069((byte)100), client.anIntArray11142, client.anIntArray11143, client.anIntArray11279, client.anIntArray11145, client.anIntArray11131, 1 + Class451.localPlayer.aByte10827, var20, (int)var6.aFloat4917 >> 9, (int)var6.aFloat4919 >> 9, Class230.preferences.aClass711_Sub20_10616.method10037((byte)-91) == 0, true, 0, true);
            }

            client.anInt11026 += 1831244773;
            if(!Class554.aClass174_7475.method2275() && -558705405 * client.anInt11038 == 9) {
               Class680.method8025(var0, var1, var2, var3, (byte)93);
            }

            client.aClass505_11204.method6072(-148544307).method6581(-845789331);
            Class439.anInt4866 = 1307632361 * var8;
            Class322.anInt3458 = 1608934313 * var9;
            Class210.anInt2259 = -2013648709 * var10;
            Class487.anInt5511 = var11 * -567045205;
            Class317.anInt3410 = -1157073499 * var12;
            if(client.aBool11054 && Class247.aClass460_2688.priorities(-171802183) == 0) {
               client.aBool11054 = false;
            }

            if(client.aBool11054) {
               Class554.aClass174_7475.method2356(var0, var1, var2, var3, -16777216, (byte)110);
               Class52.method965(Class45.aClass45_560.method920(Class26.aClass673_247, -827840379), false, Class554.aClass174_7475, Class422.aClass163_4740, Class199_Sub3.aClass1_9887, (byte)-59);
            }

            Class219.method3040(client.aClass433_11011, false, (float)(var0 + var2 / 2), (float)(var3 / 2 + var1), (float)(-1269456053 * client.anInt11292 << 1), (float)(-1269456053 * client.anInt11292 << 1), var2, var3, 1271157290);
            Class554.aClass174_7475.method2231(client.aClass433_11011);
            RenderDef.method6933(client.aClass433_11011, (byte)0);
         }
      }
   }

   static final void method8325(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class525_Sub1.anInt10714 * -1166497171 == 100?1:0;
   }
}
