package com.jagex;

import com.jagex.Class105;
import com.jagex.Class143_Sub1;
import com.jagex.Class162;
import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class231;
import com.jagex.Class237;
import com.jagex.Class242;
import com.jagex.InterfaceDef;
import com.jagex.Class267;
import com.jagex.Class286;
import com.jagex.Class32;
import com.jagex.Class327;
import com.jagex.Class422;
import com.jagex.Class446;
import com.jagex.Class449;
import com.jagex.Class451;
import com.jagex.Class499;
import com.jagex.Class519;
import com.jagex.Class526_Sub20;
import com.jagex.Class526_Sub25;
import com.jagex.Class534;
import com.jagex.Class554;
import com.jagex.Class593;
import com.jagex.Class596;
import com.jagex.Class60;
import com.jagex.Class610;
import com.jagex.Class68;
import com.jagex.Class701;
import com.jagex.Class711_Sub27;
import com.jagex.Class711_Sub29;
import com.jagex.Interface40;
import com.jagex.client;

class Class229 implements Interface40 {
   static Class701 aClass701_2331;
   // $FF: synthetic field
   Class231 this$0;

   Class229(Class231 var1) {
      this.this$0 = var1;
   }

   public float method332(int var1) {
      return (float)Class230.preferences.aClass711_Sub29_10654.method10105((byte)61) / 255.0F;
   }

   public float method331() {
      return (float)Class230.preferences.aClass711_Sub29_10654.method10105((byte)82) / 255.0F;
   }

   public float method333() {
      return (float)Class230.preferences.aClass711_Sub29_10654.method10105((byte)72) / 255.0F;
   }

   static void method3176(Class174 var0, InterfaceDef var1, int var2, int var3, byte var4) {
      if(null != Class451.localPlayer) {
         var0.method2312();
         Class237 var5 = null;
         Class162 var6 = null;
         if(5 == var1.type * -449120703) {
            var5 = var1.method3351(var0, (byte)105);
            if(null == var5) {
               return;
            }

            var6 = var5.aClass162_2395;
            if(var1.anInt2510 * -99858407 != 569137057 * var5.anInt2393 || -667181623 * var1.anInt2576 != -837894619 * var5.anInt2392) {
               throw new IllegalStateException("");
            }
         }

         var0.method2538(var2, var3, var2 + -99858407 * var1.anInt2510, var3 + -667181623 * var1.anInt2576);
         if(-1632118003 * Class105.anInt1304 != 2 && Class105.anInt1304 * -1632118003 != 5 && Class68.aClass153_782 != null) {
            var0.method2276(Class105.anIntArray1293);
            var0.method2274();
            Class596 var7 = client.aClass505_11204.method6128(2070419131);
            int var8;
            int var9;
            int var10;
            int var11;
            if(6 == -265840483 * Class327.anInt3488) {
               var8 = -253127967 * client.anInt11321;
               var9 = -182161357 * client.anInt11043;
               var10 = (int)(-client.aFloat11105) & 16383;
               var11 = 4096;
            } else {
               Class446 var12 = Class451.localPlayer.method7635().aClass446_4816;
               var8 = (int)var12.aFloat4917;
               var9 = (int)var12.aFloat4919;
               if(2 == Class327.anInt3488 * -265840483) {
                  var10 = (int)(-((double)Class195.aClass292_Sub1_2182.method3919(2009401044) * 2607.5945876176133D)) + -502966983 * client.anInt11076 & 16383;
               } else {
                  var10 = -502966983 * client.anInt11076 + (int)(-client.aFloat11105) & 16383;
               }

               var11 = 4096 - 1435776880 * client.anInt11097;
            }

            int var22 = 48 + var8 / 128;
            int var13 = 48 + client.aClass505_11204.method6057(126749238) * 4 - var9 / 128;
            if(var6 != null) {
               Class68.aClass153_782.method1789((float)var2 + (float)(var1.anInt2510 * -99858407) / 2.0F, (float)var3 + (float)(var1.anInt2576 * -667181623) / 2.0F, (float)var22, (float)var13, var11, var10 << 2, var6, var2, var3);
            } else {
               Class68.aClass153_782.method1801((float)(-99858407 * var1.anInt2510) / 2.0F + (float)var2, (float)(var1.anInt2576 * -667181623) / 2.0F + (float)var3, (float)var22, (float)var13, var11, var10 << 2, 1, -1, 1);
            }

            Class519 var14 = client.aClass505_11204.method6058((byte)124);

            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            for(Class526_Sub25 var15 = (Class526_Sub25)Class105.aClass702_1299.method8206((byte)81); var15 != null; var15 = (Class526_Sub25)Class105.aClass702_1299.method8181(542789662)) {
               var16 = -1044108751 * var15.anInt10550;
               var17 = (var14.anIntArray7043[var16] >> 14 & 16383) - -814686591 * var7.localX;
               var18 = (var14.anIntArray7043[var16] & 16383) - var7.localY * -845789331;
               var19 = 4 * var17 + 2 - var8 / 128;
               var20 = 4 * var18 + 2 - var9 / 128;
               Class534.method6399(var0, var6, var1, var2, var3, var19, var20, var14.anIntArray7045[var16], -1957887669);
            }

            for(var16 = 0; var16 < -1398482913 * Class105.anInt1295; ++var16) {
               var17 = 2 + 4 * Class105.anIntArray1296[var16] - var8 / 128;
               var18 = 2 + 4 * Class105.anIntArray1292[var16] - var9 / 128;
               Class610 var23 = (Class610)client.aClass505_11204.method6066(-631188979).method89(Class105.anIntArray1298[var16], -1333538013);
               if(var23.anIntArray7989 != null) {
                  var23 = var23.method7179(Class242.aClass94_2456, Class242.aClass94_2456, (byte)-20);
                  if(var23 == null || var23.anInt7969 * -1569917235 == -1) {
                     continue;
                  }
               }

               Class534.method6399(var0, var6, var1, var2, var3, var17, var18, var23.anInt7969 * -1569917235, -1957887669);
            }

            for(Class526_Sub20 var24 = (Class526_Sub20)client.aClass20_11259.method638(387003012); var24 != null; var24 = (Class526_Sub20)client.aClass20_11259.method639(-1034106666)) {
               var17 = (int)(var24.aLong7156 * -6805155999452426801L >> 28 & 3L);
               if(var17 == -41664749 * Class105.anInt1290) {
                  var18 = (int)(var24.aLong7156 * -6805155999452426801L & 16383L) - -814686591 * var7.localX;
                  var19 = (int)(-6805155999452426801L * var24.aLong7156 >> 14 & 16383L) - var7.localY * -845789331;
                  var20 = 4 * var18 + 2 - var8 / 128;
                  int var21 = 4 * var19 + 2 - var9 / 128;
                  Class60.method1038(var1, var6, var2, var3, var20, var21, Class143_Sub1.aClass153Array8914[0], 1314597479);
               }
            }

            Class711_Sub27.method10092(var0, var8, var9, var1, var6, var2, var3, (byte)-28);
            Class449.method5337(var8, var9, var1, var6, var2, var3, 795814336);
            Class554.method6685(var8, var9, var1, var5, var2, var3, (byte)-59);
            if(6 != Class327.anInt3488 * -265840483) {
               if(Class105.anInt1300 * 1653075275 != -1) {
                  var16 = -1977633492 * Class105.anInt1300 + 2 - var8 / 128 + (Class451.localPlayer.method10781(-627148024) - 1) * 2;
                  var17 = Class105.anInt1301 * -383460420 + 2 - var9 / 128 + (Class451.localPlayer.method10781(-627148024) - 1) * 2;
                  Class231.method3255(var1, var6, var2 - Class422.anInt4739 * 1223061019, var3 - -1780760615 * Class221.anInt2301, var16, var17, Class711_Sub29.aClass153Array10896[Class105.aBool1302?1:0], 100.0D, Class286.aClass286_3100, Class267.aClass267_2983, -1617514748);
               }

               if(!Class451.localPlayer.aClass624_12183.method7416((byte)99)) {
                  var0.method2356(var2 + var1.anInt2510 * -99858407 / 2 - 1, var3 + var1.anInt2576 * -667181623 / 2 - 1, 3, 3, -1, (byte)127);
               }
            }

            var0.method2573(Class105.anIntArray1293[0], Class105.anIntArray1293[1], Class105.anIntArray1293[2], Class105.anIntArray1293[3]);
         } else {
            if(null == var6) {
               return;
            }

            var0.method2316(-16777216, var6, var2, var3);
         }

      }
   }

   public static long method3177(int var0, int var1) {
      return (long)(11745 + var0) * 86400000L;
   }

   static final void method3178(int var0) {
      Class32.aLong313 = 8857201640932667085L;
      Class32.aLong342 = 0L;
      Class32.anInt312 = 206732105;
   }

   public static final void method3179(int var0) {
      Class593.aClass513_7819.method6190((byte)-34);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         Class499.aLongArray5598[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         Class499.aLongArray5600[var1] = 0L;
      }

      Class499.anInt5630 = 0;
   }
}
