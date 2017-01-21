package com.jagex;

import com.jagex.Class103;
import com.jagex.Class195;
import com.jagex.Class215;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class307;
import com.jagex.Class329_Sub2;
import com.jagex.Class332;
import com.jagex.Class413;
import com.jagex.Class451;
import com.jagex.Class526_Sub1;
import com.jagex.Class526_Sub24;
import com.jagex.Buffer;
import com.jagex.Class549;
import com.jagex.Class566;
import com.jagex.Class57;
import com.jagex.Class586;
import com.jagex.Class596;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class681;
import com.jagex.Class689_Sub3;
import com.jagex.Class692;
import com.jagex.Class70;
import com.jagex.Interface59;
import com.jagex.Interface76;
import com.jagex.client;

public class NPCDirection implements Interface76 {
   public static NPCDirection EAST = new NPCDirection(3, 0);
   public static NPCDirection SOUTH_WEST = new NPCDirection(0, 1);
   public static NPCDirection NORTH_WEST = new NPCDirection(2, 2);
   public static NPCDirection NORTH = new NPCDirection(5, 3);
   public static NPCDirection NORTH_EAST = new NPCDirection(4, 4);
   public static NPCDirection SOUTH = new NPCDirection(7, 5);
   public static NPCDirection WEST = new NPCDirection(1, 6);
   public static NPCDirection SOUTH_EAST = new NPCDirection(6, 7);
   public int id;
   int value;

   public int getId() {
      return -1049120045 * this.value;
   }

   NPCDirection(int var1, int var2) {
      this.id = var1 * 924455619;
      this.value = var2 * 365131099;
   }

   public NPCDirection opposite(int var1) {
      switch(-2048807445 * this.id) {
      case 0:
         return SOUTH;
      case 1:
         return NORTH_WEST;
      case 2:
         return WEST;
      case 3:
         return NORTH_EAST;
      case 4:
         return EAST;
      case 5:
         return SOUTH_EAST;
      case 6:
         return NORTH;
      case 7:
         return SOUTH_WEST;
      default:
         throw new IllegalStateException();
      }
   }

   public int method21() {
      return -1049120045 * this.value;
   }

   public static boolean method7981(char var0, int var1) {
      return var0 >= 32 && var0 <= 126?true:(var0 >= 160 && var0 <= 255?true:var0 == 8364 || var0 == 338 || 8212 == var0 || 339 == var0 || 376 == var0);
   }

   static final void method7982(Buffer var0, byte var1) {
      var0.disableBitAccess(385105555);
      int var2 = -1204447689 * client.localPlayerIndex;
      Class639_Sub1_Sub2_Sub1_Sub1 var3 = Class451.localPlayer = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var2] = new Class639_Sub1_Sub2_Sub1_Sub1(client.aClass505_11204.method6072(-841746344));
      var3.index = var2 * 1016367843;
      int var4 = var0.readBit(30, 673441488);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      Class596 var8 = client.aClass505_11204.method6128(1968799526);
      var3.screenX[0] = var6 - -814686591 * var8.localX;
      var3.screenY[0] = var7 - -845789331 * var8.localY;
      var3.method7618((float)((var3.screenX[0] << 9) + (var3.method10781(-627148024) << 8)), var3.method7621().aClass446_4816.aFloat4915, (float)((var3.screenY[0] << 9) + (var3.method10781(-627148024) << 8)));
      Class692.anInt8703 = (var3.aByte10827 = var3.aByte10828 = var5) * 1290141957;
      if(client.aClass505_11204.method6094((byte)-7).method5614(var3.screenX[0], var3.screenY[0], 2035269967)) {
         ++var3.aByte10828;
      }

      if(null != Class103.aClass526_Sub36Array1268[var2]) {
         var3.decodeAppearance(Class103.aClass526_Sub36Array1268[var2], -1957887669);
      }

      if(null != Class103.aClass526_Sub36Array1264[var2]) {
         var3.method10966(Class103.aClass526_Sub36Array1264[var2], (byte)6);
      }

      Class103.anInt1270 = 0;
      Class103.anIntArray1276[(Class103.anInt1270 += -1951702047) * 1609310241 - 1] = var2;
      Class103.aByteArray1266[var2] = 0;
      Class103.anInt1272 = 0;

      for(int var9 = 1; var9 < 2048; ++var9) {
         if(var2 != var9) {
            int var10 = var0.readBit(18, 673441488);
            int var11 = var10 >> 16 & 3;
            int var12 = var10 >> 8 & 255;
            int var13 = var10 & 255;
            Class70 var14 = Class103.aClass70Array1274[var9] = new Class70();
            var14.anInt784 = 274978377 * (var13 + (var11 << 28) + (var12 << 14));
            var14.anInt785 = 0;
            var14.anInt786 = -615864165;
            var14.aClass215_787 = Class215.aClass215_2271;
            var14.aBool788 = false;
            Class103.anIntArray1273[(Class103.anInt1272 += 1416214221) * -1174329851 - 1] = var9;
            Class103.aByteArray1266[var9] = 0;
         }
      }

      var0.finishBitAccess((byte)29);
      Class307 var15 = Class195.aClass292_Sub1_2182.method3914((byte)3);
      if(var15 == Class307.aClass307_3297) {
         Class329_Sub2 var16 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-374642422);
         var16.method9107(1410787330);
      }

      Class298 var17 = Class195.aClass292_Sub1_2182.method3940(40876596);
      if(Class298.aClass298_3237 == var17) {
         Class689_Sub3 var18 = (Class689_Sub3)Class195.aClass292_Sub1_2182.method3938((byte)90);
         var18.method10221(-918373261);
      }

   }

   static final void method7983(Class526_Sub1 var0, byte var1) {
      Class549 var2 = client.aClass505_11204.method6072(-1758968978);
      if(var2 != null) {
         Interface59 var3 = null;
         if(0 == -1514081739 * var0.anInt10299) {
            var3 = (Interface59)var2.method6589(-1761255799 * var0.anInt10306, 195793035 * var0.anInt10301, var0.anInt10298 * 64888215, (byte)24);
         }

         if(1 == -1514081739 * var0.anInt10299) {
            var3 = (Interface59)var2.method6590(-1761255799 * var0.anInt10306, 195793035 * var0.anInt10301, var0.anInt10298 * 64888215, 985681133);
         }

         if(2 == -1514081739 * var0.anInt10299) {
            var3 = (Interface59)var2.method6591(-1761255799 * var0.anInt10306, var0.anInt10301 * 195793035, 64888215 * var0.anInt10298, client.anInterface64_11296, 1739430101);
         }

         if(var0.anInt10299 * -1514081739 == 3) {
            var3 = (Interface59)var2.method6593(var0.anInt10306 * -1761255799, var0.anInt10301 * 195793035, 64888215 * var0.anInt10298, -971204254);
         }

         if(null != var3) {
            var0.anInt10302 = var3.method56(1486787271) * -1522880601;
            var0.anInt10304 = var3.method87(522425724) * -68053765;
            var0.anInt10303 = var3.method379((byte)12) * 281673033;
         } else {
            var0.anInt10302 = 1522880601;
            var0.anInt10304 = 0;
            var0.anInt10303 = 0;
         }

      }
   }

   static void method7984(byte var0) {
      int var1 = Class566.anInt7611 * 1895615023;
      int var2 = Class526_Sub24.anInt10549 * 974996221;
      if(1405944805 * Class332.anInt3505 < var1) {
         var1 = Class332.anInt3505 * 1405944805;
      }

      if(Class586.anInt7792 * 542147681 < var2) {
         var2 = 542147681 * Class586.anInt7792;
      }

      try {
         if(Class230.preferences != null) {
            Class413.aClass413_4444.method4914(new Object[]{Integer.valueOf(var1), Integer.valueOf(var2), Integer.valueOf(Class57.method1014(-1601994815)), Integer.valueOf(Class230.preferences.aClass711_Sub43_10628.method10226(768393344))}, (byte)54);
         }
      } catch (Throwable var4) {
         ;
      }

   }

   static final void method7985(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)29);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1 == 619744185 * var3.modelType?var3.anInt2539 * 561507777:-1;
   }

   static final void method7986(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub13_10647.method8313(var2, -1017037117);
   }
}
