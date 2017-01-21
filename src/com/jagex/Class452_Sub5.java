package com.jagex;

import com.jagex.Class143;
import com.jagex.Class230;
import com.jagex.Class232;
import com.jagex.InterfaceDef;
import com.jagex.Class260;
import com.jagex.Class266;
import com.jagex.Class270;
import com.jagex.Class297;
import com.jagex.Class305;
import com.jagex.Class31;
import com.jagex.Class315_Sub1;
import com.jagex.Class330;
import com.jagex.Class388;
import com.jagex.Class400;
import com.jagex.Class438;
import com.jagex.Class448_Sub1;
import com.jagex.Class452;
import com.jagex.Class454;
import com.jagex.Class48;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub39;
import com.jagex.Class539_Sub1;
import com.jagex.Class565;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class642;
import com.jagex.Class689;
import com.jagex.Class73;
import com.jagex.Class76;
import com.jagex.Class8;
import com.jagex.client;

final class Class452_Sub5 extends Class452 {
   static int anInt10358;

   Object method5362(Class143 var1, int var2) {
      return var1.aClass454_1676 == Class454.aClass454_4962?Integer.valueOf(-1):var1.aClass454_1676.method5390(2003544745);
   }

   Object method5364(Class143 var1) {
      return var1.aClass454_1676 == Class454.aClass454_4962?Integer.valueOf(-1):var1.aClass454_1676.method5390(1682213088);
   }

   Object method5365(Class143 var1) {
      return var1.aClass454_1676 == Class454.aClass454_4962?Integer.valueOf(-1):var1.aClass454_1676.method5390(1606306918);
   }

   Class452_Sub5(Class642 var1, int var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   static final void method9306(int var0) {
      Class526_Sub31.method9555(client.aClass245_11003, (byte)10);
      Class565.anInt7609 += 94708725;
      if(client.aBool11123 && client.aBool11202) {
         int var1 = Class8.aClass547_45.method6534(1533679616);
         int var2 = Class8.aClass547_45.method6531(1874107716);
         var1 -= 329308709 * client.anInt11199;
         var2 -= 1887623781 * client.anInt11200;
         if(var1 < 1912652721 * client.anInt11203) {
            var1 = client.anInt11203 * 1912652721;
         }

         if(-99858407 * client.aClass245_11003.anInt2510 + var1 > 1912652721 * client.anInt11203 + client.anInt11172 * -1723964787) {
            var1 = 1912652721 * client.anInt11203 + -1723964787 * client.anInt11172 - client.aClass245_11003.anInt2510 * -99858407;
         }

         if(var2 < -61327887 * client.anInt11182) {
            var2 = -61327887 * client.anInt11182;
         }

         if(client.aClass245_11003.anInt2576 * -667181623 + var2 > -61327887 * client.anInt11182 + client.anInt11206 * 1743334447) {
            var2 = -61327887 * client.anInt11182 + 1743334447 * client.anInt11206 - client.aClass245_11003.anInt2576 * -667181623;
         }

         int var3;
         int var4;
         if(Class73.aClass245_802 == client.aClass245_11198) {
            var3 = var1;
            var4 = var2;
         } else {
            var3 = client.aClass245_11198.anInt2520 * 480812513 + (var1 - client.anInt11203 * 1912652721);
            var4 = var2 - -61327887 * client.anInt11182 + client.aClass245_11198.anInt2626 * -1580669593;
         }

         Class526_Sub39 var5;
         if(!Class8.aClass547_45.method6526(-34814712)) {
            if(client.aBool11047) {
               Class438.method5153(1937346346);
               if(null != client.aClass245_11003.anObjectArray2613) {
                  var5 = new Class526_Sub39();
                  var5.aClass245_10694 = client.aClass245_11003;
                  var5.anInt10695 = var3 * -1928015707;
                  var5.anInt10696 = var4 * 1973505579;
                  InterfaceDef var6 = client.method10354(client.aClass245_11003);
                  InterfaceDef var7 = client.aClass245_11255;

                  boolean var8;
                  for(var8 = false; null != var7 && -1 != var7.parentId * -537841755 && var6 != null; var7 = Class315_Sub1.aClass243Array10033[var7.uid * 919258769 >> 16].aClass245Array2459[var7.parentId * -537841755 & '\uffff']) {
                     if(919258769 * var7.uid == var6.uid * 919258769) {
                        var8 = true;
                        break;
                     }
                  }

                  if(null != var7 && var6 != null && Class73.aClass245_802 != var6 && !var8) {
                     var5.aClass245_10698 = Class73.aClass245_802;
                  } else {
                     var5.aClass245_10698 = client.aClass245_11255;
                  }

                  var5.anObjectArray10701 = client.aClass245_11003.anObjectArray2613;
                  Class270.method3594(var5, -1706727482);
               }

               if(client.aClass245_11255 != null && client.method10354(client.aClass245_11003) != null) {
                  Class260.method3526(client.aClass245_11003, client.aClass245_11255, -1369022986);
               }
            } else if((client.anInt11176 * 531712101 == 1 || Class639_Sub1_Sub2_Sub1_Sub1.method10980(-1926787303)) && 1600532433 * Class31.anInt273 > 2) {
               Class232.method3266(-1153538465 * client.anInt11101 + client.anInt11199 * 329308709, 1887623781 * client.anInt11200 + 610632451 * client.anInt11209, (byte)0);
            } else if(Class330.method4242(1121122817)) {
               Class232.method3266(client.anInt11199 * 329308709 + -1153538465 * client.anInt11101, 610632451 * client.anInt11209 + client.anInt11200 * 1887623781, (byte)0);
            }

            client.aClass245_11003 = null;
            client.aClass245_11198 = null;
         } else {
            if(Class565.anInt7609 * 1689530461 > client.aClass245_11003.anInt2600 * 304776369) {
               int var9 = var1 - -1153538465 * client.anInt11101;
               int var10 = var2 - client.anInt11209 * 610632451;
               if(var9 > client.aClass245_11003.anInt2599 * -1932863455 || var9 < -(client.aClass245_11003.anInt2599 * -1932863455) || var10 > client.aClass245_11003.anInt2599 * -1932863455 || var10 < -(client.aClass245_11003.anInt2599 * -1932863455)) {
                  client.aBool11047 = true;
               }
            }

            if(client.aClass245_11003.anObjectArray2612 != null && client.aBool11047) {
               var5 = new Class526_Sub39();
               var5.aClass245_10694 = client.aClass245_11003;
               var5.anInt10695 = -1928015707 * var3;
               var5.anInt10696 = var4 * 1973505579;
               var5.anObjectArray10701 = client.aClass245_11003.anObjectArray2612;
               Class270.method3594(var5, -1420080895);
            }
         }

      } else {
         if(Class565.anInt7609 * 1689530461 > 1) {
            client.aClass245_11003 = null;
            client.aClass245_11198 = null;
         }

      }
   }

   public static void method9307(int var0) {
      int var1 = 0;
      if(Class230.preferences.aClass711_Sub9_10618.method9924(1801887626) == 1) {
         var1 |= 1;
         var1 |= 16;
         var1 |= 32;
         var1 |= 2;
         var1 |= 4;
      }

      if(Class230.preferences.aClass711_Sub17_10601.method10004(29768870) == 0) {
         var1 |= 64;
      }

      Class539_Sub1.method9249(var1, -788710749);
      client.aClass505_11204.method6066(-631188979).method10257(var1, (byte)3);
      Class297.aClass517_3235.method6225(1069365489).method6066(-631188979).method10257(var1, (byte)3);
      Class448_Sub1.aClass40_Sub1_10233.method10236(var1, (short)-14107);
      Class76.loader.method10266(var1, (byte)8);
      Class689.aClass40_Sub12_8692.method10270(var1, 1674533916);
      Class305.method4026(var1, -21847103);
      Class266.method3564(var1, (short)19125);
      Class388.method4769(var1, 707198767);
      Class400.method4836(var1, 1234750539);
      Class48.method933(var1, -2128494782);
      client.aClass505_11204.method6078(-2025301712);
   }
}
