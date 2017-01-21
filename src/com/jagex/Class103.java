package com.jagex;

import com.jagex.Class108;
import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class195;
import com.jagex.Class21;
import com.jagex.Class215;
import com.jagex.Class298;
import com.jagex.Class307;
import com.jagex.Class31;
import com.jagex.Class329_Sub2;
import com.jagex.Class380_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class451;
import com.jagex.Class452_Sub4;
import com.jagex.Class508;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Buffer;
import com.jagex.Class538;
import com.jagex.Class570;
import com.jagex.Class596;
import com.jagex.Class619;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class681;
import com.jagex.Class689_Sub3;
import com.jagex.Class692;
import com.jagex.Class70;
import com.jagex.Class97_Sub1_Sub2;
import com.jagex.client;

public class Class103 {
   static final int anInt1265 = 1;
   static final int anInt1271 = 2;
   public static Class97_Sub1_Sub2 aClass97_Sub1_Sub2_1277;
   public static int anInt1270 = 0;
   static int anInt1272 = 0;
   // $FF: synthetic field
   static boolean $assertionsDisabled = !Class103.class.desiredAssertionStatus();
   static byte[] aByteArray1266 = new byte[2048];
   static byte[] aByteArray1267 = new byte[2048];
   static RSByteBuffer[] aClass526_Sub36Array1268 = new RSByteBuffer[2048];
   static RSByteBuffer[] aClass526_Sub36Array1264 = new RSByteBuffer[2048];
   static int[] anIntArray1276 = new int[2048];
   static int[] anIntArray1273 = new int[2048];
   static Class70[] aClass70Array1274 = new Class70[2048];
   static int anInt1275 = 0;
   static int[] anIntArray1269 = new int[2048];

   Class103() throws Throwable {
      throw new Error();
   }

   static final void method1291(Buffer var0) {
      var0.disableBitAccess(385105555);
      int var1 = -1204447689 * client.localPlayerIndex;
      Class639_Sub1_Sub2_Sub1_Sub1 var2 = Class451.localPlayer = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var1] = new Class639_Sub1_Sub2_Sub1_Sub1(client.aClass505_11204.method6072(1210555997));
      var2.index = var1 * 1016367843;
      int var3 = var0.readBit(30, 673441488);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      Class596 var7 = client.aClass505_11204.method6128(2023844947);
      var2.screenX[0] = var5 - -814686591 * var7.localX;
      var2.screenY[0] = var6 - -845789331 * var7.localY;
      var2.method7618((float)((var2.screenX[0] << 9) + (var2.method10781(-627148024) << 8)), var2.method7621().aClass446_4816.aFloat4915, (float)((var2.screenY[0] << 9) + (var2.method10781(-627148024) << 8)));
      Class692.anInt8703 = (var2.aByte10827 = var2.aByte10828 = var4) * 1290141957;
      if(client.aClass505_11204.method6094((byte)-14).method5614(var2.screenX[0], var2.screenY[0], 610415100)) {
         ++var2.aByte10828;
      }

      if(null != aClass526_Sub36Array1268[var1]) {
         var2.decodeAppearance(aClass526_Sub36Array1268[var1], -1957887669);
      }

      if(null != aClass526_Sub36Array1264[var1]) {
         var2.method10966(aClass526_Sub36Array1264[var1], (byte)120);
      }

      anInt1270 = 0;
      anIntArray1276[(anInt1270 += -1951702047) * 1609310241 - 1] = var1;
      aByteArray1266[var1] = 0;
      anInt1272 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if(var1 != var8) {
            int var9 = var0.readBit(18, 673441488);
            int var10 = var9 >> 16 & 3;
            int var11 = var9 >> 8 & 255;
            int var12 = var9 & 255;
            Class70 var13 = aClass70Array1274[var8] = new Class70();
            var13.anInt784 = 274978377 * (var12 + (var10 << 28) + (var11 << 14));
            var13.anInt785 = 0;
            var13.anInt786 = -615864165;
            var13.aClass215_787 = Class215.aClass215_2271;
            var13.aBool788 = false;
            anIntArray1273[(anInt1272 += 1416214221) * -1174329851 - 1] = var8;
            aByteArray1266[var8] = 0;
         }
      }

      var0.finishBitAccess((byte)92);
      Class307 var14 = Class195.aClass292_Sub1_2182.method3914((byte)3);
      if(var14 == Class307.aClass307_3297) {
         Class329_Sub2 var15 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-1131925057);
         var15.method9107(1647381462);
      }

      Class298 var16 = Class195.aClass292_Sub1_2182.method3940(1118687351);
      if(Class298.aClass298_3237 == var16) {
         Class689_Sub3 var17 = (Class689_Sub3)Class195.aClass292_Sub1_2182.method3938((byte)25);
         var17.method10221(-918373261);
      }

   }

   static void method1292(int var0) {
      Class21 var1 = Class619.method7340("2", client.aClass676_11127.aString8591, false, 1054598094);
      Class538.aClass149_Sub1_7225.method8342(var1, 102231687);
   }

   static void method1293(Class526_Sub21_Sub6 var0, int var1) {
      if(!Class31.aBool291) {
         var0.method6332(-1949449864);
         Class31.anInt273 -= 1354402097;
         if(!var0.aBool11649) {
            long var2 = var0.aLong11658 * -3207281156750170469L;

            Class526_Sub21_Sub7 var4;
            for(var4 = (Class526_Sub21_Sub7)Class31.aClass20_276.get(var2); null != var4 && !var4.aString11663.equals(var0.aString11650); var4 = (Class526_Sub21_Sub7)Class31.aClass20_276.method635(-1734407897)) {
               ;
            }

            if(null != var4 && var4.method10576(var0, -1561244414)) {
               Class108.method1350(var4, -781527708);
            }
         } else {
            for(Class526_Sub21_Sub7 var5 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8143((byte)-1); null != var5; var5 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8139(68831625)) {
               if(var5.aString11663.equals(var0.aString11650)) {
                  boolean var6 = false;

                  for(Class526_Sub21_Sub6 var7 = (Class526_Sub21_Sub6)var5.aClass696_11662.method8143((byte)-1); null != var7; var7 = (Class526_Sub21_Sub6)var5.aClass696_11662.method8139(68831625)) {
                     if(var0 == var7) {
                        if(var5.method10576(var0, 870764673)) {
                           Class108.method1350(var5, 1550247491);
                        }

                        var6 = true;
                        break;
                     }
                  }

                  if(var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   static final void method1294(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      Class570.aClass231_7657.method3236(var0.anIntArray8622[var0.anInt8623 * -1730576285], 255, 877911551);
   }

   static final void method1295(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629];
      String var3 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629 + 1];
      if(client.anInt11064 * -1395039251 != 0 || (!client.aBool11161 || client.aBool11162) && !client.aBool11004) {
         Class111 var4 = Class452_Sub4.method9295((byte)117);
         OutFrameBuffer var5 = Class115.method1414(OutFrame.aClass405_4221, var4.aClass14_1342, -1871048393);
         var5.out.writeShort(0, -805078716);
         int var6 = 301018015 * var5.out.pos;
         var5.out.method9616(var2, -1857174059);
         Class508.method6161(var5.out, var3, 1552362270);
         var5.out.method9620(301018015 * var5.out.pos - var6, (byte)-1);
         var4.write(var5, (byte)-35);
      }
   }

   static final void method1296(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class380_Sub1.aClass269_10121.method3576(var2 != 0, (byte)71);
   }
}
