package com.jagex;

import com.jagex.Class172;
import com.jagex.Class189;
import com.jagex.Class213;
import com.jagex.Class215;
import com.jagex.Class230;
import com.jagex.Class261;
import com.jagex.Class28;
import com.jagex.Class32;
import com.jagex.OutFrame;
import com.jagex.Class442;
import com.jagex.Class499;
import com.jagex.Class519;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub23_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class531;
import com.jagex.Class539_Sub5;
import com.jagex.Class551;
import com.jagex.Class554;
import com.jagex.Class571;
import com.jagex.Class579;
import com.jagex.Class607;
import com.jagex.Class613;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class698;
import com.jagex.Class700;
import com.jagex.Class708;
import com.jagex.Class710;
import com.jagex.client;

public class Class70 {
   int anInt784;
   int anInt785;
   int anInt786;
   boolean aBool788;
   static int anInt789;
   Class215 aClass215_787;

   Class70() {
      this.aClass215_787 = Class215.aClass215_2271;
   }

   static void method1089(RSByteBuffer var0, int var1) {
      while(true) {
         int var2 = var0.readUnsignedByte(2066800174);
         switch(var2) {
         case 0:
            Class189.anInt2151 = var0.readUnsignedShort(1546623800) * -1282576677;
            Class189.anInt2158 = var0.readUnsignedShort(350655499) * -1539944941;
            break;
         case 255:
            return;
         }
      }
   }

   static final void method1090(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.aClass392_8632.anIntArray4091[var2] = var3;
   }

   static final void method1091(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = var3 >> 14 & 16383;
      int var5 = var3 & 16383;
      int var6 = Class261.method3540(var2, var4, var5, (byte)94);
      if(var6 < 0) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var6;
      }

   }

   static final void method1092(Class681 var0, int var1) {
      if(Class710.aBool8850 && null != Class499.aFrame5603) {
         Class551.method6647(Class230.preferences.aClass711_Sub7_10637.method9899((byte)61), -1, -1, false, 1575222862);
      }

   }

   static final void method1093(Class681 var0, int var1) {
      int var2 = 1450916551 * Class172.anInt2025;
      int var3 = -1700839477 * Class499.anInt5601;
      int var4 = -1;
      if(Class710.aBool8850) {
         Class708[] var5 = Class526_Sub23_Sub9.method10566((byte)7);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            Class708 var7 = var5[var6];
            if(var2 == 14758297 * var7.anInt8840 && -1823144195 * var7.anInt8839 == var3) {
               var4 = var6;
               break;
            }
         }
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
   }

   static final void method1094(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 634180151 * Class32.anInt349;
   }

   static void method1095(short var0) {
      if(Class554.aClass174_7475 != null) {
         client.aClass505_11204.method6074(-2010966002);
         Class613.method7239((byte)47);
         Class700.method8172(-1730576285);
         Class519.method6242((byte)118);
         Class579.method6956(-836013794);
         client.aClass505_11204.method6076(true, 203362805);
         Class698.method8163(1419360212);
         Class607.method7148((byte)111);
         Class571.method6896(false, 321119509);
         Class213.method2951((byte)-57);
         OutFrame.method4875(1338560362);
         Class28.method731(1849138996);

         int var1;
         for(var1 = 0; var1 < client.aClass536Array11019.length; ++var1) {
            if(client.aClass536Array11019[var1] != null) {
               client.aClass536Array11019[var1].aClass168_7201 = null;
            }
         }

         int var3;
         for(var1 = 0; var1 < 2048; ++var1) {
            Class639_Sub1_Sub2_Sub1_Sub1 var2 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1];
            if(var2 != null) {
               for(var3 = 0; var3 < var2.aClass168Array11953.length; ++var3) {
                  var2.aClass168Array11953[var3] = null;
               }
            }
         }

         for(var1 = 0; var1 < client.anInt11051 * 2027369339; ++var1) {
            NPC var4 = (NPC)client.aClass526_Sub7Array11050[var1].anObject10399;
            if(var4 != null) {
               for(var3 = 0; var3 < var4.aClass168Array11953.length; ++var3) {
                  var4.aClass168Array11953[var3] = null;
               }
            }
         }

         client.aClass20_11160.method647(929030154);
         Class554.aClass174_7475.method2232(1135751733);
         Class554.aClass174_7475 = null;
      }

   }

   public static void method1096(int var0, int var1, int var2, int var3, int var4, int var5, String var6, byte var7) {
      Class539_Sub5 var8 = new Class539_Sub5();
      var8.anInt10350 = var0 * 13914187;
      var8.anInt10356 = -1168879969 * var1;
      var8.anInt10352 = var2 * -2010969625;
      var8.anInt10354 = -2075424115 * (client.anInt11012 + var4);
      var8.anInt10353 = var3 * 773665211;
      var8.aString10351 = var6;
      var8.anInt10355 = var5 * 1963140953;
      client.aClass686_11103.method8058(var8, (byte)-88);
   }

   static final void method1097(Class681 var0, int var1) {
      Class526_Sub21_Sub6 var2 = Class442.method5197((byte)95);
      if(Class531.method6379(var2, 1768679693) == 4) {
         LinkableObject var3 = (LinkableObject)client.npcs.get(var2.method10568((short)-2815));
         if(var3 != null) {
            var0.aClass639_Sub1_Sub2_Sub1_8635 = (Class639_Sub1_Sub2_Sub1)var3.anObject10399;
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
            return;
         }
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
