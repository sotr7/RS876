package com.jagex;

import com.jagex.Class107;
import com.jagex.Class113;
import com.jagex.Class116;
import com.jagex.Class163;
import com.jagex.Class169;
import com.jagex.Class174;
import com.jagex.Class192;
import com.jagex.Class199_Sub23;
import com.jagex.Class221;
import com.jagex.Class229;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class253;
import com.jagex.Class255;
import com.jagex.Class29;
import com.jagex.Class293;
import com.jagex.NPCDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class32;
import com.jagex.Class380;
import com.jagex.Class397;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class460;
import com.jagex.Class493;
import com.jagex.Class498;
import com.jagex.Class5;
import com.jagex.Class519;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class526_Sub24;
import com.jagex.RSByteBuffer;
import com.jagex.Class54;
import com.jagex.Class566;
import com.jagex.Class593;
import com.jagex.Class596;
import com.jagex.Class627;
import com.jagex.NPC;
import com.jagex.Class64;
import com.jagex.Class642;
import com.jagex.Class675;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.Class71;
import com.jagex.client;

public class Class187 {
   public static Class187 aClass187_2124 = new Class187(6);
   static Class187 aClass187_2125 = new Class187(3);
   public static Class187 aClass187_2131 = new Class187(9);
   static Class187 aClass187_2126 = new Class187(5);
   static Class187 aClass187_2127 = new Class187(2);
   static Class187 aClass187_2133 = new Class187(0);
   static Class187 aClass187_2129 = new Class187(1);
   static Class187 aClass187_2130 = new Class187(8);
   static Class187 aClass187_2123 = new Class187(7);
   static Class187 aClass187_2132 = new Class187(4);
   int anInt2128;

   public int method2722() {
      return 33554432 | 1901614817 * this.anInt2128;
   }

   public int method2723(int var1) {
      return 33554432 | 1901614817 * this.anInt2128;
   }

   public int method2724() {
      return 33554432 | 1901614817 * this.anInt2128;
   }

   Class187(int var1) {
      this.anInt2128 = 1300196641 * var1;
   }

   public static Class243 method2725(int var0, int[] var1, Class243 var2, boolean var3, int var4) {
      if(!Class64.aClass466_744.method5538(var0, (byte)31)) {
         return null;
      } else {
         int var5 = Class64.aClass466_744.method5544(var0, -1664525302);
         InterfaceDef[] var6;
         if(0 == var5) {
            var6 = new InterfaceDef[0];
         } else if(var2 == null) {
            var6 = new InterfaceDef[var5];
         } else {
            var6 = var2.aClass245Array2459;
         }

         if(var2 == null) {
            var2 = new Class243(var3, var6);
         } else {
            var2.aClass245Array2459 = var6;
            var2.aBool2458 = var3;
         }

         for(int var7 = 0; var7 < var5; ++var7) {
            if(null == var2.aClass245Array2459[var7]) {
               byte[] var8 = Class64.aClass466_744.method5535(var0, var7, var1, (short)-6068);
               if(null != var8) {
                  InterfaceDef var9 = var2.aClass245Array2459[var7] = new InterfaceDef();
                  var9.uid = ((var0 << 16) + var7) * 1059699313;
                  var9.decode(new RSByteBuffer(var8), -73614916);
               }
            }
         }

         return var2;
      }
   }

   static void method2726(int var0, byte var1) {
      Class192 var2 = Class54.aClass192_666;
      synchronized(var2) {
         Class54.aClass192_666.method2769(var0, (byte)-68);
      }
   }

   static final void method2727(Class681 var0, short var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class29.method733(var3, var4, var0, -2101360949);
   }

   static final void method2728(Class681 var0, byte var1) {
      NPC var2 = (NPC)var0.aClass639_Sub1_Sub2_Sub1_8635;
      NPCDef var3 = var2.def;
      if(null != var3.morphisms) {
         var3 = var3.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3 != null?1:0;
   }

   public static void method2729(int var0, String var1, boolean var2, int var3) {
      if(Class493.method5891((byte)41)) {
         if(var0 != Class32.anInt312 * -577726201) {
            Class32.aLong313 = 8857201640932667085L;
         }

         Class32.anInt312 = var0 * -206732105;
         Class32.aString334 = var1;
         Class32.aBool309 = var2;
         Class593.method7031(3, (byte)48);
      }
   }

   public static void method2730(Class243 var0, InterfaceDef var1, byte var2) {
      InterfaceDef var3 = Class107.method1347(var0, var1, -1244032751);
      int var4;
      int var5;
      if(var3 == null) {
         var4 = Class566.anInt7611 * 1895615023;
         var5 = 974996221 * Class526_Sub24.anInt10549;
      } else {
         var4 = var3.anInt2510 * -99858407;
         var5 = var3.anInt2576 * -667181623;
      }

      Class498.method5944(var1, var4, var5, false, (byte)73);
      Class675.method8009(var1, var4, var5, 540934629);
   }

   static final void method2731(Class174 var0, Class169 var1, int var2) {
      if(-1166497171 * Class525_Sub1.anInt10714 != 100 && null != Class525_Sub1.aClass526_Sub21_Sub17_7093) {
         Class255.time((byte)24);
         Class255.time((byte)24);
         int var3;
         int var4;
         if(-1166497171 * Class525_Sub1.anInt10714 < 10) {
            for(var3 = 0; var3 < Class525_Sub1.aClass163ArrayArray10720.length; ++var3) {
               for(var4 = 0; var4 < Class525_Sub1.aClass163ArrayArray10720[var3].length; ++var4) {
                  Class113.aClass466_1370.method5537(Class525_Sub1.aClass635_7092.anIntArrayArray8296[var3][var4], (byte)42);
                  Class642.aClass466_8429.method5537(Class525_Sub1.aClass635_7092.anIntArrayArray8296[var3][var4], (byte)59);
               }
            }

            if(!Class525_Sub1.aClass466_7095.method5552(Class525_Sub1.aClass526_Sub21_Sub17_7093.aString11837, (byte)-24)) {
               Class525_Sub1.anInt10714 = client.aClass466_11041.method5553(Class525_Sub1.aClass526_Sub21_Sub17_7093.aString11837, 1446730019) / 10 * -959582363;
               return;
            }

            Class525_Sub1.anInt10714 = -1005889038;
         }

         if(10 == Class525_Sub1.anInt10714 * -1166497171) {
            Class525_Sub1.anInt7107 = 2065808777 * Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11843 >> 6 << 6;
            Class525_Sub1.anInt7150 = -1798698645 * Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11840 >> 6 << 6;
            Class525_Sub1.anInt7102 = 64 + ((505809263 * Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11844 >> 6 << 6) - Class525_Sub1.anInt7107);
            Class525_Sub1.anInt7110 = 64 + ((-1426477541 * Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11841 >> 6 << 6) - Class525_Sub1.anInt7150);
            int[] var8 = new int[3];
            var4 = -1;
            int var5 = -1;
            Class446 var6 = Class451.localPlayer.method7635().aClass446_4816;
            Class596 var7 = client.aClass505_11204.method6128(2137037691);
            if(Class525_Sub1.aClass526_Sub21_Sub17_7093.method10717(Class451.localPlayer.aByte10827, ((int)var6.aFloat4917 >> 9) + var7.localX * -814686591, var7.localY * -845789331 + ((int)var6.aFloat4919 >> 9), var8, 1130775915)) {
               var4 = var8[1] - Class525_Sub1.anInt7107;
               var5 = var8[2] - Class525_Sub1.anInt7150;
            }

            if(!Class525_Sub1.aBool10703 && var4 >= 0 && var4 < Class525_Sub1.anInt7102 && var5 >= 0 && var5 < Class525_Sub1.anInt7110) {
               var4 += (int)(Math.random() * 10.0D) - 5;
               var5 += (int)(Math.random() * 10.0D) - 5;
               Class71.anInt800 = -521323797 * var4;
               Class116.anInt1438 = -168152273 * var5;
            } else if(-139436471 * Class525_Sub1.anInt10715 != -1 && Class525_Sub1.anInt10716 * -810713051 != -1) {
               Class525_Sub1.aClass526_Sub21_Sub17_7093.method10715(-139436471 * Class525_Sub1.anInt10715, -810713051 * Class525_Sub1.anInt10716, var8, (byte)44);
               if(null != var8) {
                  Class71.anInt800 = (var8[1] - Class525_Sub1.anInt7107) * -521323797;
                  Class116.anInt1438 = -168152273 * (var8[2] - Class525_Sub1.anInt7150);
               }

               Class525_Sub1.anInt10716 = -1231199149;
               Class525_Sub1.anInt10715 = 800197639;
               Class525_Sub1.aBool10703 = false;
            } else {
               Class525_Sub1.aClass526_Sub21_Sub17_7093.method10715(Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11836 * -1473384675 >> 14 & 16383, Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11836 * -1473384675 & 16383, var8, (byte)116);
               Class71.anInt800 = (var8[1] - Class525_Sub1.anInt7107) * -521323797;
               Class116.anInt1438 = (var8[2] - Class525_Sub1.anInt7150) * -168152273;
            }

            if(25 == -81547769 * Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11842) {
               Class525_Sub1.aFloat7103 = 2.0F;
               Class525_Sub1.aFloat7144 = 2.0F;
            } else if(Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11842 * -81547769 == 37) {
               Class525_Sub1.aFloat7103 = 3.0F;
               Class525_Sub1.aFloat7144 = 3.0F;
            } else if(-81547769 * Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11842 == 50) {
               Class525_Sub1.aFloat7103 = 4.0F;
               Class525_Sub1.aFloat7144 = 4.0F;
            } else if(-81547769 * Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11842 == 75) {
               Class525_Sub1.aFloat7103 = 6.0F;
               Class525_Sub1.aFloat7144 = 6.0F;
            } else if(Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11842 * -81547769 == 100) {
               Class525_Sub1.aFloat7103 = 8.0F;
               Class525_Sub1.aFloat7144 = 8.0F;
            } else if(200 == Class525_Sub1.aClass526_Sub21_Sub17_7093.anInt11842 * -81547769) {
               Class525_Sub1.aFloat7103 = 16.0F;
               Class525_Sub1.aFloat7144 = 16.0F;
            } else {
               Class525_Sub1.aFloat7103 = 8.0F;
               Class525_Sub1.aFloat7144 = 8.0F;
            }

            Class525_Sub1.anInt7100 = (int)Class525_Sub1.aFloat7144 >> 1;
            Class525_Sub1.aByteArrayArrayArray7105 = Class253.method3473(Class525_Sub1.anInt7100, -1331061490);
            Class526_Sub21_Sub2.method10420(302443150);
            Class525_Sub1.method6277();
            Class380.aClass702_3937 = new Class702();
            Class525_Sub1.anInt7097 += (int)(Math.random() * 5.0D) - 2;
            if(Class525_Sub1.anInt7097 < -8) {
               Class525_Sub1.anInt7097 = -8;
            }

            if(Class525_Sub1.anInt7097 > 8) {
               Class525_Sub1.anInt7097 = 8;
            }

            Class525_Sub1.anInt7098 += (int)(Math.random() * 5.0D) - 2;
            if(Class525_Sub1.anInt7098 < -16) {
               Class525_Sub1.anInt7098 = -16;
            }

            if(Class525_Sub1.anInt7098 > 16) {
               Class525_Sub1.anInt7098 = 16;
            }

            Class525_Sub1.method6282(var1, Class525_Sub1.anInt7097 >> 2 << 10, Class525_Sub1.anInt7098 >> 1);
            Class525_Sub1.aClass40_Sub6_7088.method10253(1024, 256, -1681031083);
            Class525_Sub1.aClass40_Sub3_7112.method10242(256, 256, (byte)-48);
            Class525_Sub1.aClass40_Sub8_7118.method876(4096, (byte)4);
            Class5.aClass40_Sub2_28.method876(256, (byte)4);
            Class525_Sub1.anInt10714 = -2011778076;
         } else if(20 == -1166497171 * Class525_Sub1.anInt10714) {
            if(Class525_Sub1.aBool7142) {
               if(Class525_Sub1.method6285(var0, Class525_Sub1.anInt7097, Class525_Sub1.anInt7098, Class525_Sub1.aBool7142)) {
                  Class525_Sub1.anInt10714 = -1740366932;
               }
            } else {
               Class199_Sub23.method9038(true, -435604980);
               Class525_Sub1.method6285(var0, Class525_Sub1.anInt7097, Class525_Sub1.anInt7098, Class525_Sub1.aBool7142);
               Class525_Sub1.anInt10714 = -1740366932;
               Class199_Sub23.method9038(true, 609595533);
               Class229.method3179(2017540985);
            }

         } else if(Class525_Sub1.anInt10714 * -1166497171 == 60) {
            if(Class525_Sub1.aClass466_7095.method5548(Class525_Sub1.aClass526_Sub21_Sub17_7093.aString11837, 780710299)) {
               if(!Class525_Sub1.aClass466_7095.method5552(Class525_Sub1.aClass526_Sub21_Sub17_7093.aString11837, (byte)-7)) {
                  return;
               }

               Class525_Sub1.aClass519_7117 = Class460.method5460(Class525_Sub1.aClass466_7095, Class525_Sub1.aClass526_Sub21_Sub17_7093.aString11837, client.aBool11230, 1156925942);
            } else {
               Class525_Sub1.aClass519_7117 = new Class519(0);
            }

            Class525_Sub1.method6301();
            Class525_Sub1.anInt10714 = 1548711326;
            Class199_Sub23.method9038(true, -550094968);
            Class229.method3179(1763906993);
         } else {
            if(Class525_Sub1.anInt10714 * -1166497171 >= 70) {
               var3 = 0;

               while(true) {
                  if(var3 >= 3) {
                     Class525_Sub1.anInt10714 = -1468955788;
                     System.gc();
                     break;
                  }

                  for(var4 = 0; var4 < 5; ++var4) {
                     if(null == Class525_Sub1.aClass163ArrayArray10720[var3][var4] || null == Class525_Sub1.aClass1ArrayArray10717[var3][var4]) {
                        Class525_Sub1.aClass163ArrayArray10720[var3][var4] = (Class163)Class627.aClass418_8195.method4951(client.anInterface51_11046, Class525_Sub1.aClass635_7092.anIntArrayArray8296[var3][var4], true, true, -1730576285);
                        Class525_Sub1.aClass1ArrayArray10717[var3][var4] = Class627.aClass418_8195.method4964(client.anInterface51_11046, Class525_Sub1.aClass635_7092.anIntArrayArray8296[var3][var4], (byte)2);
                        if(Class525_Sub1.aClass163ArrayArray10720[var3][var4] == null || null == Class525_Sub1.aClass1ArrayArray10717[var3][var4]) {
                           return;
                        }

                        Class525_Sub1.anInt10714 += 1416220207;
                     }
                  }

                  ++var3;
               }
            }

         }
      }
   }

   public static void method2732(int var0, int var1) {
      if(25 == var0) {
         Class525_Sub1.aFloat7144 = 2.0F;
      } else if(var0 == 37) {
         Class525_Sub1.aFloat7144 = 3.0F;
      } else if(var0 == 50) {
         Class525_Sub1.aFloat7144 = 4.0F;
      } else if(var0 == 75) {
         Class525_Sub1.aFloat7144 = 6.0F;
      } else if(var0 == 100) {
         Class525_Sub1.aFloat7144 = 8.0F;
      } else if(var0 == 200) {
         Class525_Sub1.aFloat7144 = 16.0F;
      }

      Class525_Sub1.anInt10711 = -805427121;
      Class525_Sub1.anInt10711 = -805427121;
   }

   static final void method2733(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-52);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class397.method4825(var3, var4, var0, (byte)-7);
   }

   static Class293 method2734(int var0, int var1) {
      return var0 == Class293.aClass293_3178.anInt3180 * 88466535?Class293.aClass293_3178:(88466535 * Class293.aClass293_3179.anInt3180 == var0?Class293.aClass293_3179:null);
   }
}
