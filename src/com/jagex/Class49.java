package com.jagex;

import com.jagex.Class11;
import com.jagex.IsaacCipher;
import com.jagex.Class148;
import com.jagex.Class16;
import com.jagex.Class188;
import com.jagex.Class199_Sub11;
import com.jagex.Class199_Sub12;
import com.jagex.Class230;
import com.jagex.Class241;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class266;
import com.jagex.Class27;
import com.jagex.Class294;
import com.jagex.Class297;
import com.jagex.Class30;
import com.jagex.Class32;
import com.jagex.Class326;
import com.jagex.Class333;
import com.jagex.Class357;
import com.jagex.Class358;
import com.jagex.Class376;
import com.jagex.Class381;
import com.jagex.Class385;
import com.jagex.Class393;
import com.jagex.Class403;
import com.jagex.Class413;
import com.jagex.IncomingFrame;
import com.jagex.Class424;
import com.jagex.Class438;
import com.jagex.Class448_Sub1;
import com.jagex.Class45;
import com.jagex.Class451;
import com.jagex.Class46;
import com.jagex.Class460_Sub1;
import com.jagex.Class491;
import com.jagex.Class492;
import com.jagex.Class497;
import com.jagex.Class498;
import com.jagex.Class499;
import com.jagex.Class502;
import com.jagex.Class509;
import com.jagex.Class516;
import com.jagex.Class521;
import com.jagex.Class523;
import com.jagex.Class526;
import com.jagex.Class526_Sub24;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.RS3Applet;
import com.jagex.Buffer;
import com.jagex.Class53;
import com.jagex.Class535;
import com.jagex.Class537;
import com.jagex.Class538;
import com.jagex.Class54;
import com.jagex.Class546;
import com.jagex.Class555;
import com.jagex.Class566;
import com.jagex.Class57;
import com.jagex.Class573;
import com.jagex.Class593;
import com.jagex.RSSocket;
import com.jagex.Class60;
import com.jagex.Class607;
import com.jagex.Class616;
import com.jagex.Class630;
import com.jagex.Class635;
import com.jagex.Class641;
import com.jagex.Class663;
import com.jagex.NPCDirection;
import com.jagex.Class676;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class684;
import com.jagex.Class76;
import com.jagex.Class94;
import com.jagex.RuntimeException_Sub3;
import com.jagex.RuntimeException_Sub4;
import com.jagex.client;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class Class49 implements Runnable {
   InetAddress anInetAddress649;
   volatile String aString650;

   Class49(int var1) throws UnknownHostException {
      this.anInetAddress649 = InetAddress.getByAddress(new byte[]{(byte)(var1 >> 24 & 255), (byte)(var1 >> 16 & 255), (byte)(var1 >> 8 & 255), (byte)(var1 & 255)});
   }

   public String method934(byte var1) {
      return this.aString650;
   }

   public void run() {
      this.aString650 = this.anInetAddress649.getHostName();
   }

   public void method935() {
      this.aString650 = this.anInetAddress649.getHostName();
   }

   public String method936() {
      return this.aString650;
   }

   public void method937() {
      this.aString650 = this.anInetAddress649.getHostName();
   }

   public String method938() {
      return this.aString650;
   }

   public String method939() {
      return this.aString650;
   }

   static final void method940(Class681 var0, int var1) {
      if(client.aBool10981) {
         Class413.aClass413_4450.method4915((byte)1);
      }

   }

   static final void method941(int var0) {
      if(7 != -1216905875 * Class32.anInt341 && -1216905875 * Class32.anInt341 != 102) {
         try {
            short var1;
            if(0 == Class32.anInt348 * -1898670503 && -1216905875 * Class32.anInt341 < 98) {
               var1 = 500;
            } else {
               var1 = 2000;
            }

            if(Class32.aBool336 && -1216905875 * Class32.anInt341 >= 65) {
               var1 = 6000;
            }

            if(327983535 * Class32.anInt310 == 221 && 213 != -1216905875 * Class32.anInt341 && 42 != 1197569659 * Class32.anInt345 || 327983535 * Class32.anInt310 == 184 && 49 != 634180151 * Class32.anInt349 && 52 != 634180151 * Class32.anInt349) {
               Class32.anInt347 += 267910421;
            }

            if(Class32.anInt347 * -1440323011 > var1) {
               RuntimeException_Sub4.aClass111_12105.method1369(1649185198);
               if(Class32.anInt348 * -1898670503 >= 3) {
                  Class32.anInt341 = 896372419;
                  Class499.method6008(-5, 1441279488);
                  Class573.method6918(1995085411);
                  return;
               }

               if(327983535 * Class32.anInt310 == 221) {
                  Class16.aClass6_171.method548((byte)33);
               } else {
                  Class16.aClass6_179.method548((byte)55);
               }

               Class32.anInt347 = 0;
               Class32.anInt348 += 945377769;
               Class32.anInt341 = 923071676;
            }

            OutFrameBuffer var2;
            int var3;
            int var5;
            if(Class32.anInt341 * -1216905875 == 12) {
               if(Class32.anInt310 * 327983535 == 221) {
                  RuntimeException_Sub4.aClass111_12105.method1366(Class45.method925(Class16.aClass6_171.method549(439875626), '\u9c40', -2098949900), Class16.aClass6_171.address, -232643111);
               } else {
                  RuntimeException_Sub4.aClass111_12105.method1366(Class45.method925(Class16.aClass6_179.method549(1568325536), '\u9c40', -2142817964), Class16.aClass6_179.address, -232643111);
               }

               RuntimeException_Sub4.aClass111_12105.method1380((byte)-52);
               var2 = IncomingFrame.method4985(-1904482549);
               if(Class32.aBool336) {
                  var2.out.writeByte(-636933581 * Class403.aClass403_4156.anInt4153, 1992571206);
                  var2.out.writeShort(0, -805078716);
                  var3 = var2.out.pos * 301018015;
                  var2.out.writeInt(RS3Applet.REVISION, -357564953);
                  var2.out.writeInt(RS3Applet.SUB_REVISION, -357564953);
                  if(327983535 * Class32.anInt310 == 221) {
                     var2.out.writeByte(-558705405 * client.anInt11038 == 17?1:0, -1844684333);
                  }

                  RSByteBuffer var4 = RSSocket.method551((byte)115);
                  Class680.method8026(var4, (long)(Class32.anInt312 * -577726201));
                  Class241.aLong2452 = (long)Class32.anInt312 * -2368290932059387925L;
                  var4.writeByte(-577726201 * Class32.anInt312, 1521248024);
                  var4.writeByte(Class26.aClass673_247.getId(), 1068920972);
                  var4.writeInt(-264476799 * client.anInt10985, -357564953);

                  for(var5 = 0; var5 < 5; ++var5) {
                     var4.writeInt((int)(Math.random() * 9.9999999E7D), -357564953);
                  }

                  var4.method9621(client.aLong11023 * 582293486398741001L);
                  var4.writeByte(client.aClass676_11127.anInt8593 * -767001605, -1170719941);
                  var4.writeByte((int)(Math.random() * 9.9999999E7D), -1871523545);
                  var4.method9651(Class60.RSA_UPDATE_EXPONENT, Class60.LOGIN_MODULUS, (byte)-5);
                  var2.out.method9619(var4.buffer, 0, 301018015 * var4.pos, 1802076700);
                  var2.out.method9620(var2.out.pos * 301018015 - var3, (byte)-1);
               } else {
                  var2.out.writeByte(-636933581 * Class403.aClass403_4159.anInt4153, 829297880);
               }

               RuntimeException_Sub4.aClass111_12105.write(var2, (byte)52);
               RuntimeException_Sub4.aClass111_12105.method1365((byte)-61);
               Class32.anInt341 = 1029868704;
            }

            int var13;
            if(Class32.anInt341 * -1216905875 == 32) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, -641377795)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 1, -915926624);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               var13 = RuntimeException_Sub4.aClass111_12105.buffer.readUnsignedByte(916363971);
               if(var13 != 0) {
                  Class32.anInt341 = 896372419;
                  Class537.method6428(var13, -1974490759);
                  Class499.method6008(var13, -334805619);
                  RuntimeException_Sub4.aClass111_12105.method1369(1546946093);
                  Class573.method6918(890688614);
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               if(Class32.aBool336) {
                  Class32.anInt341 = 1952940380;
               } else {
                  Class32.anInt341 = -389086536;
               }
            }

            if(Class32.anInt341 * -1216905875 == 44) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(2, -1541790611)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 2, -795286170);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               RuntimeException_Sub4.aClass111_12105.buffer.pos = RuntimeException_Sub4.aClass111_12105.buffer.readUnsignedShort(1037548641) * 801976415;
               Class32.anInt341 = -1418955240;
            }

            if(56 == Class32.anInt341 * -1216905875) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(RuntimeException_Sub4.aClass111_12105.buffer.pos * 301018015, -1379215815)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 301018015 * RuntimeException_Sub4.aClass111_12105.buffer.pos, -42783015);
               RuntimeException_Sub4.aClass111_12105.buffer.method9648(Class32.anIntArray359, 1739260197);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               String var14 = RuntimeException_Sub4.aClass111_12105.buffer.method9637(-1495866034);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               String var15 = Class413.aClass413_4447.method4911(-410208306);
               Class376.method4672(var14, true, var15, client.aBool10997, 1254446386);
               Class32.anInt341 = 347090341;
            }

            if(65 == -1216905875 * Class32.anInt341) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, -1154273187)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 1, -29379876);
               if(1 == (RuntimeException_Sub4.aClass111_12105.buffer.buffer[0] & 255)) {
                  Class32.anInt341 = 1270162017;
               }
            }

            if(Class32.anInt341 * -1216905875 == 77) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(16, -148649806)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 16, -81817261);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = -53279248;
               RuntimeException_Sub4.aClass111_12105.buffer.method9648(Class32.anIntArray359, 1739260197);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               Class32.aLong313 = RuntimeException_Sub4.aClass111_12105.buffer.method9663(885537007) * -8857201640932667085L;
               Class32.aLong342 = RuntimeException_Sub4.aClass111_12105.buffer.method9663(539077702) * -547837312910220393L;
               Class32.anInt341 = -389086536;
            }

            if(88 == -1216905875 * Class32.anInt341) {
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               RuntimeException_Sub4.aClass111_12105.method1380((byte)0);
               var2 = IncomingFrame.method4985(-1749921658);
               Buffer var16 = var2.out;
               int var6;
               RSByteBuffer var7;
               RSByteBuffer var8;
               Class403 var19;
               if(327983535 * Class32.anInt310 == 221) {
                  if(Class32.aBool336) {
                     var19 = Class403.aClass403_4158;
                  } else {
                     var19 = Class403.aClass403_4147;
                  }

                  var16.writeByte(-636933581 * var19.anInt4153, -906750387);
                  var16.writeShort(0, -805078716);
                  var5 = var16.pos * 301018015;
                  var6 = 301018015 * var16.pos;
                  if(!Class32.aBool336) {
                     var16.writeInt(RS3Applet.REVISION, -357564953);
                     var16.writeInt(RS3Applet.SUB_REVISION, -357564953);
                     var16.writeByte(17 == -558705405 * client.anInt11038?1:0, 36174670);
                     var6 = 301018015 * var16.pos;
                     var7 = Class148.method1745(1788058504);
                     var16.method9619(var7.buffer, 0, var7.pos * 301018015, 2133226744);
                     var6 = var16.pos * 301018015;
                     var16.writeByte(-5590316573601377797L * Class32.aLong313 == -1L?1:0, -768677276);
                     if(Class32.aLong313 * -5590316573601377797L == -1L) {
                        var16.method9616(Class32.aString315, 1611595003);
                     } else {
                        var16.method9621(-5590316573601377797L * Class32.aLong313);
                     }
                  }

                  var16.writeByte(Class57.method1014(436930300), -1999254404);
                  var16.writeShort(1895615023 * Class566.anInt7611, -805078716);
                  var16.writeShort(Class526_Sub24.anInt10549 * 974996221, -805078716);
                  var16.writeByte(Class230.preferences.aClass711_Sub33_10645.method10135((byte)55), 1187915358);
                  Class294.method3958(var16, (byte)-49);
                  var16.method9616(client.aString10983, -1235827114);
                  var16.writeInt(client.anInt10985 * -264476799, -357564953);
                  var7 = Class230.preferences.method9606((byte)123);
                  var16.writeByte(var7.pos * 301018015, 844234779);
                  var16.method9619(var7.buffer, 0, 301018015 * var7.pos, 2004739253);
                  client.aBool11013 = true;
                  var8 = new RSByteBuffer(Class663.aClass526_Sub40_8522.method9763((byte)-75));
                  Class663.aClass526_Sub40_8522.method9759(var8, (byte)-62);
                  var16.method9619(var8.buffer, 0, var8.buffer.length, 1390926236);
                  var16.writeInt(client.anInt11062 * -1496971711, -357564953);
                  var16.writeInt(client.anInt10989 * -885338537, -357564953);
                  var16.writeInt(372500803 * client.anInt11260, -357564953);
                  var16.writeInt(client.anInt10991 * -365891393, -357564953);
                  var16.writeInt(client.anInt10990 * 1998657043, -357564953);
                  var16.method9616(Class381.aString3943, 59828523);
                  var16.writeByte(client.aString10994 == null?0:1, 521670028);
                  if(client.aString10994 != null) {
                     var16.method9616(client.aString10994, -1225492063);
                  }

                  var16.writeByte(client.aBool10981?1:0, -2059579383);
                  var16.writeByte(client.aBool10998?1:0, 1964602987);
                  var16.writeByte(914845809 * Class46.anInt642 & 1, -498428524);
                  var16.writeInt(client.anInt11307 * -426452021, -357564953);
                  var16.method9616(client.aString11002, 1613691721);
                  var16.writeByte(null != Class16.aClass6_172 && Class16.aClass6_171.id * -2107114137 == -2107114137 * Class16.aClass6_172.id?0:1, -1721192331);
                  var16.writeShort(-2107114137 * Class16.aClass6_179.id, -805078716);
                  Class616.method7303(var16, (byte)97);
                  var16.method9622(Class32.anIntArray359, var6, 301018015 * var16.pos, (short)768);
                  var16.method9620(var16.pos * 301018015 - var5, (byte)-1);
               } else {
                  if(Class32.aBool336) {
                     var19 = Class403.aClass403_4158;
                  } else {
                     var19 = Class403.aClass403_4150;
                  }

                  var16.writeByte(-636933581 * var19.anInt4153, -1440142378);
                  var16.writeShort(0, -805078716);
                  var5 = 301018015 * var16.pos;
                  var6 = 301018015 * var16.pos;
                  if(!Class32.aBool336) {
                     var16.writeInt(RS3Applet.REVISION, -357564953);
                     var16.writeInt(RS3Applet.SUB_REVISION, -357564953);
                     var7 = Class148.method1745(1264769967);
                     var16.method9619(var7.buffer, 0, 301018015 * var7.pos, 1803979285);
                     var6 = var16.pos * 301018015;
                     var16.writeByte(Class32.aLong313 * -5590316573601377797L == -1L?1:0, -434178322);
                     if(-5590316573601377797L * Class32.aLong313 == -1L) {
                        var16.method9616(Class32.aString315, 378133262);
                     } else {
                        var16.method9621(-5590316573601377797L * Class32.aLong313);
                     }
                  }

                  var16.writeByte(-767001605 * client.aClass676_11127.anInt8593, -766433546);
                  var16.writeByte(Class26.aClass673_247.getId(), -1094434626);
                  var16.writeByte(Class57.method1014(-1086608290), 1088008328);
                  var16.writeShort(Class566.anInt7611 * 1895615023, -805078716);
                  var16.writeShort(Class526_Sub24.anInt10549 * 974996221, -805078716);
                  var16.writeByte(Class230.preferences.aClass711_Sub33_10645.method10135((byte)102), 2027306290);
                  Class294.method3958(var16, (byte)-90);
                  var16.method9616(client.aString10983, 1086107187);
                  var7 = Class230.preferences.method9606((byte)118);
                  var16.writeByte(301018015 * var7.pos, 2142689488);
                  var16.method9619(var7.buffer, 0, 301018015 * var7.pos, 1359694286);
                  var8 = new RSByteBuffer(Class663.aClass526_Sub40_8522.method9763((byte)-119));
                  Class663.aClass526_Sub40_8522.method9759(var8, (byte)-16);
                  var16.method9619(var8.buffer, 0, var8.buffer.length, 2124151402);
                  var16.writeInt(-1496971711 * client.anInt11062, -357564953);
                  var16.method9616(Class381.aString3943, -1160835447);
                  var16.writeInt(client.anInt10985 * -264476799, -357564953);
                  var16.writeInt(-426452021 * client.anInt11307, -357564953);
                  var16.method9616(client.aString11002, -1341785866);
                  var16.writeByte(914845809 * Class46.anInt642 & 1, 139480538);
                  Class616.method7303(var16, (byte)23);
                  var16.method9622(Class32.anIntArray359, var6, 301018015 * var16.pos, (short)768);
                  var16.method9620(var16.pos * 301018015 - var5, (byte)-1);
               }

               RuntimeException_Sub4.aClass111_12105.write(var2, (byte)-12);
               RuntimeException_Sub4.aClass111_12105.method1365((byte)-69);
               RuntimeException_Sub4.aClass111_12105.aClass14_1342 = new IsaacCipher(Class32.anIntArray359);

               for(int var24 = 0; var24 < 4; ++var24) {
                  Class32.anIntArray359[var24] += 50;
               }

               RuntimeException_Sub4.aClass111_12105.aClass14_1340 = new IsaacCipher(Class32.anIntArray359);
               new IsaacCipher(Class32.anIntArray359);
               RuntimeException_Sub4.aClass111_12105.buffer.setCipher(RuntimeException_Sub4.aClass111_12105.aClass14_1340, 1382104870);
               Class32.anIntArray359 = null;
               Class32.anInt341 = -335688022;
            }

            if(Class32.anInt341 * -1216905875 == 98) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, -2101275611)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 1, -573083914);
               var13 = RuntimeException_Sub4.aClass111_12105.buffer.readUnsignedByte(1411493148);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               if(21 == var13) {
                  Class32.anInt341 = -202191737;
               } else {
                  if(var13 == 1) {
                     Class32.anInt341 = 1403658302;
                     Class499.method6008(var13, 1895167287);
                     return;
                  }

                  if(var13 == 52) {
                     Class393.anInt4097 = var13 * 1297813091;
                     Class32.anInt341 = -511180502;
                  } else if(2 == var13) {
                     if(Class32.aBool360) {
                        Class32.aBool360 = false;
                        Class32.anInt341 = 923071676;
                        return;
                     }

                     if(327983535 * Class32.anInt310 == 221) {
                        Class538.aClass149_Sub1_7225.method8341(-604259898);
                        Class32.anInt341 = 518688202;
                     } else {
                        Class32.anInt341 = 774278453;
                     }
                  } else if(var13 == 15) {
                     RuntimeException_Sub4.aClass111_12105.currentFrame = -169656198;
                     Class32.anInt341 = -617977530;
                  } else {
                     if(23 == var13 && -1898670503 * Class32.anInt348 < 3) {
                        Class32.anInt347 = 0;
                        Class32.anInt348 += 945377769;
                        Class32.anInt341 = 923071676;
                        RuntimeException_Sub4.aClass111_12105.method1369(1977230608);
                        return;
                     }

                     if(var13 == 42) {
                        Class32.anInt341 = 278394889;
                        Class499.method6008(var13, 26369708);
                        return;
                     }

                     if(184 == 327983535 * Class32.anInt310 && var13 == 49 && client.anInt11038 * -558705405 != 4) {
                        if(52 != 634180151 * Class32.anInt349) {
                           Class499.method6008(var13, -206049627);
                        }

                        return;
                     }

                     if(Class32.aBool351 && !Class32.aBool336 && -1 != -577726201 * Class32.anInt312 && var13 == 35) {
                        Class32.aBool336 = true;
                        Class32.anInt347 = 0;
                        Class32.anInt341 = 923071676;
                        RuntimeException_Sub4.aClass111_12105.method1369(1848461733);
                        return;
                     }

                     if(53 != var13) {
                        Class32.anInt341 = 896372419;
                        Class499.method6008(var13, -2105663240);
                        RuntimeException_Sub4.aClass111_12105.method1369(2015237547);
                        Class573.method6918(-2080879364);
                        return;
                     }

                     Class32.anInt341 = 1308263593;
                  }
               }
            }

            if(123 == Class32.anInt341 * -1216905875) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, 116384173)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 1, -1991415996);
               var13 = RuntimeException_Sub4.aClass111_12105.buffer.buffer[0] & 255;
               Class32.anInt354 = -2092942162 * var13;
               Class32.anInt341 = 896372419;
               Class499.method6008(21, 2064114600);
               RuntimeException_Sub4.aClass111_12105.method1369(1635842930);
               Class573.method6918(-1054997039);
               return;
            }

            if(213 == Class32.anInt341 * -1216905875) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(2, -1565804741)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 2, -1690207308);
               Class32.anInt357 = (((RuntimeException_Sub4.aClass111_12105.buffer.buffer[0] & 255) << 8) + (RuntimeException_Sub4.aClass111_12105.buffer.buffer[1] & 255)) * 799921787;
               Class32.anInt341 = -335688022;
               return;
            }

            if(-1216905875 * Class32.anInt341 == 245) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(4, -1034491391)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 4, -2068792654);
               Class32.anInt322 = RuntimeException_Sub4.aClass111_12105.buffer.readInt((byte)5) * -628630777;
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               Class32.anInt341 = 896372419;
               Class499.method6008(53, -58870780);
               RuntimeException_Sub4.aClass111_12105.method1369(1790503035);
               Class573.method6918(877841032);
               return;
            }

            if(-1216905875 * Class32.anInt341 == 191) {
               if(Class393.anInt4097 * 1165747019 == 29) {
                  if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, -1364104843)) {
                     return;
                  }

                  RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 1, -867129586);
                  Class32.anInt356 = 1325949865 * (RuntimeException_Sub4.aClass111_12105.buffer.buffer[0] & 255);
               } else {
                  if(45 != 1165747019 * Class393.anInt4097) {
                     throw new IllegalStateException();
                  }

                  if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(3, -1202470525)) {
                     return;
                  }

                  RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 3, -467269390);
                  Class32.anInt356 = 1325949865 * (RuntimeException_Sub4.aClass111_12105.buffer.buffer[0] & 255);
                  Class32.anInt355 = ((RuntimeException_Sub4.aClass111_12105.buffer.buffer[2] & 255) + ((RuntimeException_Sub4.aClass111_12105.buffer.buffer[1] & 255) << 8)) * 39580743;
               }

               Class32.anInt341 = 896372419;
               Class499.method6008(1165747019 * Class393.anInt4097, -1057565186);
               RuntimeException_Sub4.aClass111_12105.method1369(1927569732);
               Class573.method6918(-340842424);
               if(Class385.method4746(client.anInt11038 * -558705405, (byte)34)) {
                  Class460_Sub1.logout(true, -1730576285);
                  Class32.anInt345 = Class393.anInt4097 * -1657563791;
               }

               return;
            }

            if(-1216905875 * Class32.anInt341 == 226) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(2, -1562261098)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 2, -335738159);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               Class535.anInt7195 = RuntimeException_Sub4.aClass111_12105.buffer.readUnsignedShort(770519294) * 208290305;
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               Class32.anInt341 = -484481245;
               return;
            }

            if(Class32.anInt341 * -1216905875 == 231) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(-1533428223 * Class535.anInt7195, -895229271)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, -1533428223 * Class535.anInt7195, -547608046);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               byte[] var23 = new byte[1 + -1533428223 * Class535.anInt7195];
               RuntimeException_Sub4.aClass111_12105.buffer.readEncrypted(var23, 0, Class535.anInt7195 * -1533428223, -763778075);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               RSByteBuffer var22 = new RSByteBuffer(var23);
               String var26 = var22.readString(-542571962);
               Class438.openJSURL(var26, true, client.aBool10997, 52589382);
               Class499.method6008(1165747019 * Class393.anInt4097, 1257919184);
               if(Class32.anInt310 * 327983535 == 184 && 4 != client.anInt11038 * -558705405) {
                  Class32.anInt341 = -335688022;
               } else {
                  Class32.anInt341 = 896372419;
                  RuntimeException_Sub4.aClass111_12105.method1369(1987325889);
                  Class573.method6918(1954376366);
               }

               return;
            }

            if(258 == Class32.anInt341 * -1216905875) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(2, -328830790)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 2, -2059263863);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               RuntimeException_Sub4.aClass111_12105.currentFrame = RuntimeException_Sub4.aClass111_12105.buffer.readUnsignedShort(394732357) * -2062655549;
               Class32.anInt341 = 1415060621;
            }

            Buffer var25;
            if(Class32.anInt341 * -1216905875 == 265) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(-1225783061 * RuntimeException_Sub4.aClass111_12105.currentFrame, -1502897738)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, RuntimeException_Sub4.aClass111_12105.currentFrame * -1225783061, -398848056);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               boolean var17 = RuntimeException_Sub4.aClass111_12105.buffer.readUnsignedByte(-495893467) == 1;

               while(301018015 * RuntimeException_Sub4.aClass111_12105.buffer.pos < RuntimeException_Sub4.aClass111_12105.currentFrame * -1225783061) {
                  Class424 var18 = Class641.aClass97_Sub1_Sub2_8349.method8370(RuntimeException_Sub4.aClass111_12105.buffer, 1929985082);
                  Class538.aClass149_Sub1_7225.anInterface4_1715.method27(1602756037 * var18.anInt4793, var18.anObject4794, 172204199);
               }

               if(var17) {
                  OutFrameBuffer var21 = IncomingFrame.method4985(-1927208139);
                  var25 = var21.out;
                  var25.writeByte(Class403.aClass403_4157.anInt4153 * -636933581, -1103024872);
                  RuntimeException_Sub4.aClass111_12105.write(var21, (byte)15);
                  RuntimeException_Sub4.aClass111_12105.method1365((byte)-6);
                  Class32.anInt341 = -991767128;
               } else {
                  Class32.anInt341 = 518688202;
               }
            }

            if(136 == Class32.anInt341 * -1216905875) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, -603858788)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 1, -1403514752);
               var13 = RuntimeException_Sub4.aClass111_12105.buffer.buffer[0] & 255;
               if(var13 != 2) {
                  if(var13 != 29 && var13 != 45) {
                     Class32.anInt341 = 896372419;
                     Class499.method6008(var13, -1836449508);
                     RuntimeException_Sub4.aClass111_12105.method1369(1610159350);
                     Class573.method6918(-372413402);
                     if(Class385.method4746(client.anInt11038 * -558705405, (byte)34)) {
                        Class460_Sub1.logout(true, -1730576285);
                        Class32.anInt345 = -1186334541 * var13;
                     }

                     return;
                  }

                  Class393.anInt4097 = 1297813091 * var13;
                  Class32.anInt341 = -698075301;
                  return;
               }

               Class32.anInt341 = 774278453;
            }

            if(Class32.anInt341 * -1216905875 == 145) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, -1591525119)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 1, -793435188);
               Class54.anInt668 = 150702911 * (RuntimeException_Sub4.aClass111_12105.buffer.buffer[0] & 255);
               Class32.anInt341 = -1754643262;
            }

            Buffer var20;
            if(-1216905875 * Class32.anInt341 == 154) {
               var20 = RuntimeException_Sub4.aClass111_12105.buffer;
               if(Class32.anInt310 * 327983535 == 221) {
                  if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1391584447 * Class54.anInt668, -1042576146)) {
                     return;
                  }

                  RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(var20.buffer, 0, Class54.anInt668 * 1391584447, -1669132736);
                  var20.pos = 0;
                  Class357.method4574(var20, (byte)2);
                  client.anInt11064 = var20.readUnsignedByte(539636400) * -1939443227;
                  client.anInt11089 = var20.readUnsignedByte(546633767) * 1693960607;
                  client.aBool11161 = var20.readUnsignedByte(320318080) == 1;
                  client.aBool11162 = var20.readUnsignedByte(-469584129) == 1;
                  client.aBool11120 = var20.readUnsignedByte(1770217820) == 1;
                  client.aBool11004 = var20.readUnsignedByte(989938146) == 1;
                  client.localPlayerIndex = var20.readUnsignedShort(1294765157) * -817102969;
                  client.aBool11157 = var20.readUnsignedByte(232031292) == 1;
                  Class497.anInt5567 = var20.method9628(-1881883157) * -921164325;
                  client.aBool11230 = var20.readUnsignedByte(-932605560) == 1;
                  Class526.aString7159 = var20.readString(986870908);
                  Class266.aLong2982 = (var20.method9632(-312934789) - Class255.time((byte)24)) * -8006163965612012889L;
                  client.aClass505_11204.method6066(-631188979).method10256(client.aBool11230, (byte)32);
                  Class297.aClass517_3235.method6225(1425699831).method6066(-631188979).method10256(client.aBool11230, (byte)125);
                  Class448_Sub1.aClass40_Sub1_10233.method10235(client.aBool11230, -1832376794);
                  Class76.loader.method10265(client.aBool11230, 726517447);
               } else {
                  if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(Class54.anInt668 * 1391584447, -1781997914)) {
                     return;
                  }

                  RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(var20.buffer, 0, 1391584447 * Class54.anInt668, -1111027672);
                  var20.pos = 0;
                  Class357.method4574(var20, (byte)2);
                  client.anInt11064 = var20.readUnsignedByte(-1208590013) * -1939443227;
                  client.anInt11089 = var20.readUnsignedByte(-1980619323) * 1693960607;
                  client.aBool11161 = var20.readUnsignedByte(1230481880) == 1;
                  Class497.anInt5567 = var20.method9628(-2064710685) * -921164325;
                  Class451.localPlayer.aByte12163 = (byte)var20.readUnsignedByte(-1837777386);
                  client.aBool11162 = var20.readUnsignedByte(1830929841) == 1;
                  client.aBool11120 = var20.readUnsignedByte(1340279602) == 1;
                  Class555.aLong7481 = var20.method9663(1319345114) * -9032831304394557109L;
                  Class266.aLong2982 = (Class555.aLong7481 * -1319377014074767261L - Class255.time((byte)24) - var20.method9631(477593401)) * -8006163965612012889L;
                  var3 = var20.readUnsignedByte(2054702823);
                  client.aBool11157 = (var3 & 1) != 0;
                  Class199_Sub11.aBool9925 = 0 != (var3 & 2);
                  Class498.anInt5592 = var20.readInt((byte)5) * -2074504067;
                  Class94.anInt1156 = var20.readInt((byte)5) * 1178996835;
                  Class199_Sub12.anInt9933 = var20.readUnsignedShort(67532426) * 1659257623;
                  Class630.anInt8218 = var20.readUnsignedShort(378658692) * 1110810339;
                  Class607.anInt7914 = var20.readUnsignedShort(1888826613) * -281825261;
                  Class199_Sub12.anInt9934 = var20.readInt((byte)5) * -148241385;
                  Class546.aClass49_7271 = new Class49(Class199_Sub12.anInt9934 * 1172796327);
                  (new Thread(Class546.aClass49_7271)).start();
                  Class27.anInt251 = var20.readUnsignedByte(-1748244076) * 1089199503;
                  Class523.anInt7077 = var20.readUnsignedShort(1553447920) * 1282075223;
                  Class11.anInt144 = var20.readUnsignedShort(252464875) * 454993453;
                  Class30.aBool259 = var20.readUnsignedByte(1770098434) == 1;
                  Class451.localPlayer.aString12161 = Class451.localPlayer.aString12175 = RuntimeException_Sub3.aString12069 = var20.method9637(-1495866034);
                  Class188.anInt2147 = var20.readUnsignedByte(-1536969450) * -1334662183;
                  Class676.anInt8594 = var20.readInt((byte)5) * -1673740389;
                  Class16.aClass6_172 = new RSSocket();
                  Class16.aClass6_172.id = var20.readUnsignedShort(1388367238) * -1052717481;
                  if('\uffff' == -2107114137 * Class16.aClass6_172.id) {
                     Class16.aClass6_172.id = 1052717481;
                  }

                  Class16.aClass6_172.address = var20.method9637(-1495866034);
                  Class16.aClass6_172.port = var20.readUnsignedShort(1961029371) * 1408805223;
                  Class16.aClass6_172.securePort = var20.readUnsignedShort(843546301) * 1633433681;
                  if(Class684.aClass684_8662 != Class521.aClass684_7051 && (Class521.aClass684_7051 != Class684.aClass684_8668 || client.anInt11064 * -1395039251 < 2) && Class16.aClass6_171.method544(Class516.aClass6_7036, (byte)40)) {
                     Class358.method4584(1824180055);
                  }
               }

               if(client.aBool11120) {
                  try {
                     Class53.method968(Class492.anApplet5526, "zap", 889358318);
                  } catch (Throwable var11) {
                     if(client.aBool10982) {
                        try {
                           Class492.anApplet5526.getAppletContext().showDocument(new URL(Class492.anApplet5526.getCodeBase(), "blank.ws"), "tbi");
                        } catch (Exception var10) {
                           ;
                        }
                     }
                  }
               } else {
                  try {
                     Class53.method968(Class492.anApplet5526, "unzap", 137407062);
                  } catch (Throwable var9) {
                     ;
                  }
               }

               if(Class521.aClass684_7051 == Class684.aClass684_8665) {
                  Class413.aClass413_4439.method4915((byte)1);
               }

               if(327983535 * Class32.anInt310 != 221) {
                  Class32.anInt341 = 896372419;
                  Class499.method6008(2, -2119567973);
                  Class333.method4259(-1760460032);
                  Class593.method7031(0, (byte)85);
                  RuntimeException_Sub4.aClass111_12105.CURRENT_FRAME = null;
                  return;
               }

               Class32.anInt341 = -1647846234;
            }

            if(174 == -1216905875 * Class32.anInt341) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(3, -1706644733)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 3, -1334133591);
               Class32.anInt341 = 987872509;
            }

            if(185 == Class32.anInt341 * -1216905875) {
               var20 = RuntimeException_Sub4.aClass111_12105.buffer;
               var20.pos = 0;
               if(var20.nextIsSmart(916174161)) {
                  if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(1, -760305111)) {
                     return;
                  }

                  RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(var20.buffer, 3, 1, -330390192);
               }

               RuntimeException_Sub4.aClass111_12105.CURRENT_FRAME = Class326.method4193((byte)56)[var20.readEncryptedSmart((byte)-84)];
               RuntimeException_Sub4.aClass111_12105.currentFrame = var20.readUnsignedShort(1860149976) * -2062655549;
               Class32.anInt341 = -831571586;
            }

            if(-1216905875 * Class32.anInt341 == 166) {
               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(-1225783061 * RuntimeException_Sub4.aClass111_12105.currentFrame, -1671645901)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, -1225783061 * RuntimeException_Sub4.aClass111_12105.currentFrame, -1948933837);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               var13 = RuntimeException_Sub4.aClass111_12105.currentFrame * -1225783061;
               Class32.anInt341 = 896372419;
               Class499.method6008(2, -1367039873);
               Class491.method5874(-67270370);
               NPCDirection.method7982(RuntimeException_Sub4.aClass111_12105.buffer, (byte)1);
               var3 = var13 - 301018015 * RuntimeException_Sub4.aClass111_12105.buffer.pos;
               var25 = new Buffer(var3);
               System.arraycopy(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 301018015 * RuntimeException_Sub4.aClass111_12105.buffer.pos, var25.buffer, 0, var3);
               RuntimeException_Sub4.aClass111_12105.buffer.pos += 801976415 * var3;
               if(IncomingFrame.CONSTRUCTED_MAP == RuntimeException_Sub4.aClass111_12105.CURRENT_FRAME) {
                  client.aClass505_11204.method6120(new Class509(Class502.CONSTRUCTED, var25), (byte)1);
               } else {
                  client.aClass505_11204.method6120(new Class509(Class502.STATIC, var25), (byte)1);
               }

               if(301018015 * RuntimeException_Sub4.aClass111_12105.buffer.pos != var13) {
                  throw new RuntimeException(RuntimeException_Sub4.aClass111_12105.buffer.pos * 301018015 + " " + var13);
               }

               RuntimeException_Sub4.aClass111_12105.CURRENT_FRAME = null;
               return;
            }

            if(206 == Class32.anInt341 * -1216905875) {
               if(-2 == RuntimeException_Sub4.aClass111_12105.currentFrame * -1225783061) {
                  if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(2, -1415794870)) {
                     return;
                  }

                  RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, 2, -1481794954);
                  RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
                  RuntimeException_Sub4.aClass111_12105.currentFrame = RuntimeException_Sub4.aClass111_12105.buffer.readUnsignedShort(1822094152) * -2062655549;
               }

               if(!RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).method6727(RuntimeException_Sub4.aClass111_12105.currentFrame * -1225783061, -460487722)) {
                  return;
               }

               RuntimeException_Sub4.aClass111_12105.method1364(-1184311292).read(RuntimeException_Sub4.aClass111_12105.buffer.buffer, 0, RuntimeException_Sub4.aClass111_12105.currentFrame * -1225783061, -1344086758);
               RuntimeException_Sub4.aClass111_12105.buffer.pos = 0;
               var13 = -1225783061 * RuntimeException_Sub4.aClass111_12105.currentFrame;
               Class32.anInt341 = 896372419;
               Class499.method6008(15, -854538065);
               Class635.method7555((byte)-112);
               NPCDirection.method7982(RuntimeException_Sub4.aClass111_12105.buffer, (byte)1);
               if(301018015 * RuntimeException_Sub4.aClass111_12105.buffer.pos != var13) {
                  throw new RuntimeException(RuntimeException_Sub4.aClass111_12105.buffer.pos * 301018015 + " " + var13);
               }

               RuntimeException_Sub4.aClass111_12105.CURRENT_FRAME = null;
               return;
            }
         } catch (IOException var12) {
            RuntimeException_Sub4.aClass111_12105.method1369(2135712081);
            if(Class32.anInt348 * -1898670503 < 3) {
               if(327983535 * Class32.anInt310 == 221) {
                  Class16.aClass6_171.method548((byte)31);
               } else {
                  Class16.aClass6_179.method548((byte)49);
               }

               Class32.anInt347 = 0;
               Class32.anInt348 += 945377769;
               Class32.anInt341 = 923071676;
            } else {
               Class32.anInt341 = 896372419;
               Class499.method6008(-4, -1222259980);
               Class573.method6918(-504846122);
            }
         }

      }
   }
}
