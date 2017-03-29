package com.jagex;

import com.RS3Applet;
import com.jagex.Class115;
import com.jagex.IsaacCipher;
import com.jagex.Class16;
import com.jagex.Class199_Sub13;
import com.jagex.Class202;
import com.jagex.Class203;
import com.jagex.Class221;
import com.jagex.Class240;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class294;
import com.jagex.Class315_Sub1;
import com.jagex.Class325;
import com.jagex.Class381;
import com.jagex.Class390;
import com.jagex.Class403;
import com.jagex.OutFrame;
import com.jagex.IncomingFrame;
import com.jagex.Class44;
import com.jagex.Class45;
import com.jagex.Class463;
import com.jagex.Class476;
import com.jagex.Class497;
import com.jagex.Class509;
import com.jagex.Class512;
import com.jagex.OutFrameBuffer;
import com.jagex.Class561;
import com.jagex.Class568;
import com.jagex.Class569;
import com.jagex.Class570;
import com.jagex.Class587;
import com.jagex.Class590;
import com.jagex.Class593;
import com.jagex.Class663;
import com.jagex.Class681;
import com.jagex.Class688;
import com.jagex.Class693;
import com.jagex.Class700;
import com.jagex.Class703;
import com.jagex.Class709;
import com.jagex.Class710;
import com.jagex.client;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Class57 {
   static final int anInt689 = 3;
   public static int anInt691;
   static int anInt683 = 0;
   static int anInt686 = 0;
   static int[] anIntArray685;
   static Class44 aClass44_687;
   static Class693 aClass693_684;
   static Class709 aClass709_688;
   static Class688 aClass688_690;

   public static void method999() {
      if(16 == client.anInt11038 * -558705405) {
         if(!Class509.method6166(-1432808454) && !Class476.method5657(572423609)) {
            Class593.method7031(13, (byte)79);
         }
      }
   }

   static void method1000() {
      if(aClass44_687 != null) {
         try {
            short var0;
            if(-2014531435 * anInt686 == 0) {
               var0 = 250;
            } else {
               var0 = 2000;
            }

            anInt683 += 1750647843;
            if(-1591735413 * anInt683 > var0) {
               Class569.method6841((byte)25);
            }

            int var2;
            if(aClass44_687 == Class44.aClass44_459) {
               client.aClass111_11059.method1366(Class45.method925(Class16.aClass6_179.method549(1800690351), '\u9c40', -2023927843), Class16.aClass6_179.address, -232643111);
               client.aClass111_11059.method1380((byte)-37);
               OutFrameBuffer var1 = IncomingFrame.method4985(-1964720981);
               var1.out.writeByte(Class403.aClass403_4155.anInt4153 * -636933581, -789935518);
               var1.out.writeShort(0, -805078716);
               var2 = var1.out.pos * 301018015;
               var1.out.writeShort(RS3Applet.REVISION, -805078716);
               var1.out.writeShort(RS3Applet.SUB_REVISION, -805078716);
               anIntArray685 = Class512.method6186(var1, 23862821);
               int var3 = 301018015 * var1.out.pos;
               var1.out.method9616(client.aString11002, 1175215773);
               var1.out.writeShort(-264476799 * client.anInt10985, -805078716);
               var1.out.writeInt(client.anInt10989 * -885338537, -357564953);
               var1.out.writeInt(372500803 * client.anInt11260, -357564953);
               var1.out.method9616(Class381.aString3943, -1535903337);
               var1.out.writeByte(Class26.aClass673_247.getId(), -211936409);
               var1.out.writeByte(-767001605 * client.aClass676_11127.anInt8593, 112868951);
               Class294.method3958(var1.out, (byte)-96);
               String var4 = client.aString10994;
               var1.out.writeByte(null == var4?0:1, -526030756);
               if(null != var4) {
                  var1.out.method9616(var4, 1642263478);
               }

               Class663.aClass526_Sub40_8522.method9759(var1.out, (byte)-75);
               var1.out.pos += 1318867609;
               var1.out.method9622(anIntArray685, var3, 301018015 * var1.out.pos, (short)768);
               var1.out.method9620(var1.out.pos * 301018015 - var2, (byte)-1);
               client.aClass111_11059.write(var1, (byte)102);
               client.aClass111_11059.method1365((byte)-90);
               aClass44_687 = Class44.aClass44_460;
            }

            if(Class44.aClass44_460 == aClass44_687) {
               if(client.aClass111_11059.method1364(-1184311292) == null) {
                  Class569.method6841((byte)16);
                  return;
               }

               if(!client.aClass111_11059.method1364(-1184311292).method6727(1, -335384369)) {
                  return;
               }

               client.aClass111_11059.method1364(-1184311292).read(client.aClass111_11059.buffer.buffer, 0, 1, -364768129);
               aClass693_684 = (Class693)Class561.findIdentifiable(Class390.method4776((byte)57), client.aClass111_11059.buffer.buffer[0] & 255, (byte)-76);
               if(aClass693_684 != Class693.aClass693_8709) {
                  client.aClass111_11059.method1369(1986322690);
               } else {
                  client.aClass111_11059.aClass14_1342 = new IsaacCipher(anIntArray685);
                  int[] var6 = new int[4];

                  for(var2 = 0; var2 < 4; ++var2) {
                     var6[var2] = 50 + anIntArray685[var2];
                  }

                  client.aClass111_11059.aClass14_1340 = new IsaacCipher(var6);
                  new IsaacCipher(var6);
                  client.aClass111_11059.buffer.setCipher(client.aClass111_11059.aClass14_1340, 2020169067);
                  Class593.method7031(11, (byte)8);
                  client.aClass111_11059.method1380((byte)-32);
                  client.aClass111_11059.buffer.pos = 0;
                  client.aClass111_11059.aClass420_1348 = null;
                  client.aClass111_11059.aClass420_1351 = null;
                  client.aClass111_11059.aClass420_1352 = null;
                  client.aClass111_11059.anInt1349 = 0;
                  Class242.aClass94_2456.aClass600_1154.method7081((byte)-3);
                  Class590.method7012(-1009802275);
               }

               client.aClass111_11059.CURRENT_FRAME = null;
               aClass44_687 = null;
            }
         } catch (IOException var5) {
            Class569.method6841((byte)14);
         }

      }
   }

   static boolean method1001() {
      return null != aClass44_687;
   }

   static boolean method1002() {
      return null != aClass44_687;
   }

   static void method1003() {
      aClass44_687 = Class44.aClass44_459;
      aClass693_684 = Class693.aClass693_8706;
      Class568.aClass703_7616 = Class703.aClass703_8799;
      aClass709_688 = Class709.aClass709_8847;
      Class203.aClass700_2214 = Class700.aClass700_8777;
      aClass688_690 = Class688.aClass688_8683;
      Class202.aString2212 = null;
   }

   public static void method1004() {
      if(client.anInt11038 * -558705405 == 11) {
         OutFrameBuffer var0 = Class115.method1414(OutFrame.aClass405_4246, client.aClass111_11059.aClass14_1342, 545379927);
         client.aClass111_11059.write(var0, (byte)-7);
         Class203.aClass700_2214 = Class700.aClass700_8774;
         Class202.aString2212 = null;
      }
   }

   public static void method1005(int var0) {
      if(client.anInt11038 * -558705405 == 11) {
         OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4280, client.aClass111_11059.aClass14_1342, -204758633);
         var1.out.writeByte(var0, 1976729643);
         client.aClass111_11059.write(var1, (byte)13);
      }
   }

   public static void method1006(int var0) {
      if(client.anInt11038 * -558705405 == 11) {
         OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4280, client.aClass111_11059.aClass14_1342, -1201952654);
         var1.out.writeByte(var0, 1795142667);
         client.aClass111_11059.write(var1, (byte)-11);
      }
   }

   static boolean method1007() {
      return null != aClass44_687;
   }

   Class57() throws Throwable {
      throw new Error();
   }

   static void method1008(String var0) {
      Class203.aClass700_2214 = Class700.aClass700_8775;
      Class202.aString2212 = var0;
   }

   static void method1009(String var0) {
      Class203.aClass700_2214 = Class700.aClass700_8775;
      Class202.aString2212 = var0;
   }

   public static void method1010() {
      if(16 == client.anInt11038 * -558705405) {
         if(!Class509.method6166(21441995) && !Class476.method5657(572423609)) {
            Class593.method7031(13, (byte)22);
         }
      }
   }

   static void method1011(int[] var0, LinkedList var1, int var2, int var3, float var4, int var5) {
      if(!var1.isEmpty()) {
         for(int var6 = 0; var6 < var1.size(); ++var6) {
            Class587 var7 = (Class587)var1.get(var6);
            int var8 = var2 + (int)((float)(-1023869259 * var7.anInt7795) * var4);
            int var9 = var3 + (int)(var4 * (float)(var7.anInt7794 * -1572464413));
            int var10 = (int)((float)(var7.anInt7793 * 1131576241) * var4);
            int var11 = (int)((float)(-72348939 * var7.anInt7796) * var4);
            if(var8 < Class570.anInt7645 * 80613351 && var9 < 518132729 * Class325.anInt3475) {
               if(var8 + var10 > Class570.anInt7645 * 80613351) {
                  var10 = Class570.anInt7645 * 80613351 - var8;
               }

               if(var11 + var9 > 518132729 * Class325.anInt3475) {
                  var11 = Class325.anInt3475 * 518132729 - var9;
               }

               for(int var12 = var9; var12 < var9 + var11; ++var12) {
                  int var13 = var8 + 80613351 * Class570.anInt7645 * var12;
                  Arrays.fill(var0, var13, var10 + var13, -16777216);
               }
            }
         }

      }
   }

   static final void method1012(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-57);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class463.method5476(var3, var4, var0, (short)544);
   }

   static final void method1013(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(client.anInt11288 * 2029719417 == 2 && var2 < -17244221 * client.anInt11130) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = client.aClass50Array11290[var2].aString654;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   public static int method1014(int var0) {
      return Class710.aBool8850 && null != client.aFrame5603?3:(client.aBool11020?2:1);
   }

   static final void method1015(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class497.aString5565.startsWith("mac")?1:0;
   }

   static final void method1016(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(var2.startsWith(Class199_Sub13.method9016(0, 16711935)) || var2.startsWith(Class199_Sub13.method9016(1, 16711935))) {
         var2 = var2.substring(7);
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class240.method3308(var2, 350930100);
   }

   static final void method1017(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[540934629 * var0.anInt8625];
      String var3 = (String)var0.anObjectArray8624[1 + var0.anInt8625 * 540934629];
      int var4 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.indexOf(var3, var4);
   }
}
