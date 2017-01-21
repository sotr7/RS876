package com.jagex;

import com.jagex.Class105;
import com.jagex.Class115;
import com.jagex.Class130;
import com.jagex.Class174;
import com.jagex.Class187;
import com.jagex.Class188;
import com.jagex.Class204;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class279;
import com.jagex.Class293;
import com.jagex.Class300;
import com.jagex.NPCDef;
import com.jagex.Class375;
import com.jagex.Class387;
import com.jagex.OutFrame;
import com.jagex.Class422;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class460_Sub1;
import com.jagex.Class502;
import com.jagex.Class526_Sub1;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub20;
import com.jagex.Class526_Sub21_Sub4;
import com.jagex.Class526_Sub21_Sub8;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub3;
import com.jagex.Class526_Sub31;
import com.jagex.Buffer;
import com.jagex.Class570;
import com.jagex.Class588;
import com.jagex.Class594;
import com.jagex.Class596;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class639_Sub1_Sub2_Sub4;
import com.jagex.Class639_Sub1_Sub2_Sub6;
import com.jagex.Class646;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.Class698;
import com.jagex.Class70;
import com.jagex.Class711;
import com.jagex.Class93;
import com.jagex.client;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class246 {
   public static final long aLong2678 = 60000L;
   public static final long aLong2679 = 1000L;
   static Map aMap2681;
   static HashMap aHashMap2680 = new HashMap();

   public static String method3385(Date var0, String var1, int var2) {
      return method3386(var0, var1, method3387((byte)-17), Class673.aClass673_8579, 1883797157);
   }

   static String method3386(Date var0, String var1, TimeZone var2, Class673 var3, int var4) {
      if(null == aMap2681) {
         aMap2681 = new HashMap(7);
         Class673[] var5 = Class673.method7997(2071759250);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            Class673 var7 = var5[var6];
            aMap2681.put(var7, new ConcurrentLinkedQueue());
         }
      }

      ConcurrentLinkedQueue var8 = (ConcurrentLinkedQueue)aMap2681.get(var3);
      SimpleDateFormat var9 = (SimpleDateFormat)var8.poll();
      if(var9 == null) {
         var9 = new SimpleDateFormat(var1, var3.method7999(1768365344));
      } else {
         var9.applyPattern(var1);
      }

      var9.setTimeZone(var2);
      String var10 = var9.format(var0);
      var8.add(var9);
      return var10;
   }

   static TimeZone method3387(byte var0) {
      return method3388("Europe/London", -1931305376);
   }

   static TimeZone method3388(String var0, int var1) {
      HashMap var2 = aHashMap2680;
      synchronized(var2) {
         TimeZone var3 = (TimeZone)aHashMap2680.get(var0);
         if(null == var3) {
            var3 = TimeZone.getTimeZone(var0);
            aHashMap2680.put(var0, var3);
         }

         return var3;
      }
   }

   Class246() throws Throwable {
      throw new Error();
   }

   static {
      Calendar.getInstance(method3388("Europe/London", -2039747293));
   }

   static OutFrameBuffer method3389(int var0, int var1, int var2, int var3) {
      OutFrameBuffer var4 = null;
      if(var2 == 0) {
         var4 = Class115.method1414(OutFrame.aClass405_4249, client.aClass111_11060.aClass14_1342, -308097033);
      }

      if(var2 == 1) {
         var4 = Class115.method1414(OutFrame.aClass405_4207, client.aClass111_11060.aClass14_1342, -1874787351);
      }

      Class596 var5 = client.aClass505_11204.method6128(1968267687);
      var4.out.writeShort(var0 + var5.localX * -814686591, -805078716);
      var4.out.writeLEShort(var1 + var5.localY * -845789331, (byte)0);
      var4.out.write128Byte(Class279.crtlClick((byte)33)?1:0, -955186016);
      Class105.anInt1300 = var0 * -2110507933;
      Class105.anInt1301 = -1654212593 * var1;
      Class105.aBool1302 = false;
      NPCDef.method4065(417127513);
      return var4;
   }

   static final void method3390(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= 758383916;
      var0.anInt2514 = 1491963143 * var2.anIntArray8622[var2.anInt8623 * -1730576285];
      var0.anInt2516 = var2.anIntArray8622[-1730576285 * var2.anInt8623 + 1] * 1970952449;
      var0.anInt2594 = -138113681 * var2.anIntArray8622[2 + var2.anInt8623 * -1730576285];
      var0.anInt2563 = 2058638429 * var2.anIntArray8622[3 + -1730576285 * var2.anInt8623];
      Class526_Sub31.method9555(var0, (byte)10);
   }

   public static int method3391(long var0) {
      Class258.method3514(var0);
      return Class93.aCalendar899.get(1);
   }

   static final void method3392(Class422 var0, int var1) {
      Buffer var2 = client.aClass111_11060.buffer;
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      int var24;
      int var28;
      if(var0 == Class422.aClass422_4734) {
         var3 = var2.readUnsignedShort128((short)14487);
         var4 = var2.readUnsignedLEShort((byte)126);
         var24 = var2.readByteC((byte)8);
         Class596 var30 = client.aClass505_11204.method6128(1997319941);
         var7 = Class300.anInt3254 * 76546883 + (var24 & 7);
         var8 = var7 + var30.localY * -845789331;
         var9 = (var24 >> 4 & 7) + 381658035 * Class130.anInt1618;
         var10 = -814686591 * var30.localX + var9;
         var28 = var2.readUnsignedLEShort((byte)119);
         if(-1204447689 * client.localPlayerIndex != var3) {
            boolean var38 = var9 >= 0 && var7 >= 0 && var9 < client.aClass505_11204.method6056(-1746741811) && var7 < client.aClass505_11204.method6057(126749238);
            if(var38 || client.aClass505_11204.method6051(-1656530587).method6017(2003590813)) {
               Class588.method7001(1728196755 * Class711.anInt8858, var10, var8, new Class526_Sub3(var28, var4), (byte)-83);
               if(var38) {
                  Class646.method7691(1728196755 * Class711.anInt8858, var9, var7, -880214732);
               }
            }
         }

      } else {
         int var6;
         int var12;
         int var13;
         int var15;
         if(var0 == Class422.aClass422_4729) {
            var3 = var2.readUnsignedByte(517416329);
            var4 = Class130.anInt1618 * 381658035 + (var3 >> 4 & 7);
            var24 = (var3 & 7) + 76546883 * Class300.anInt3254;
            var6 = var2.readUnsignedShort(1929830535);
            if(var6 == '\uffff') {
               var6 = -1;
            }

            var7 = var2.readUnsignedByte(-520752094);
            var8 = var7 >> 4 & 15;
            var9 = var7 & 7;
            var10 = var2.readUnsignedByte(-1959817328);
            var28 = var2.readUnsignedByte(-742480043);
            var12 = var2.readUnsignedShort(718684085);
            if(client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer) {
               if(var4 >= 0 && var24 >= 0 && var4 < client.aClass505_11204.method6056(-1746741811) && var24 < client.aClass505_11204.method6057(126749238)) {
                  var13 = 1 + var8;
                  if(Class451.localPlayer.screenX[0] >= var4 - var13 && Class451.localPlayer.screenX[0] <= var13 + var4 && Class451.localPlayer.screenY[0] >= var24 - var13 && Class451.localPlayer.screenY[0] <= var24 + var13) {
                     Class446 var39 = new Class446((float)(var4 << 9), 0.0F, (float)(var24 << 9));
                     var15 = 1728196755 * Class711.anInt8858;
                     Class570.aClass231_7657.method3246(Class188.aClass188_2142, var6, var9, var28, Class187.aClass187_2124.method2723(-1774811822), Class204.aClass204_2217, 0.0F, (float)(var8 << 9), var39, var15, var12, var10, -1637010211);
                  }
               }

            }
         } else {
            int var14;
            int var16;
            int var17;
            if(Class422.aClass422_4728 == var0) {
               var3 = var2.readUnsignedByte(-438175745);
               var4 = (var3 >> 4 & 7) + Class130.anInt1618 * 381658035;
               var24 = (var3 & 7) + Class300.anInt3254 * 76546883;
               var6 = var2.readUnsignedShort(1649119975);
               if(var6 == '\uffff') {
                  var6 = -1;
               }

               var7 = var2.readUnsignedByte(918170294);
               var8 = var7 >> 4 & 15;
               var9 = var7 & 7;
               var10 = var2.readUnsignedByte(-1258951159);
               var28 = var2.readUnsignedByte(-1898957917);
               var12 = var2.readUnsignedShort(843913801);
               boolean var41 = var2.readUnsignedByte(-89098374) == 1;
               if(client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer) {
                  if(var4 >= 0 && var24 >= 0 && var4 < client.aClass505_11204.method6056(-1746741811) && var24 < client.aClass505_11204.method6057(126749238)) {
                     var14 = var8 + 1;
                     if(Class451.localPlayer.screenX[0] >= var4 - var14 && Class451.localPlayer.screenX[0] <= var4 + var14 && Class451.localPlayer.screenY[0] >= var24 - var14 && Class451.localPlayer.screenY[0] <= var14 + var24) {
                        Class446 var42 = new Class446((float)(var4 << 9), 0.0F, (float)(var24 << 9));
                        var16 = Class711.anInt8858 * 1728196755;
                        var17 = var41?Class187.aClass187_2131.method2723(-1798174864):Class187.aClass187_2124.method2723(-1912203489);
                        Class570.aClass231_7657.method3246(Class188.aClass188_2142, var6, var9, var28, var17, Class204.aClass204_2217, 0.0F, (float)(var8 << 9), var42, var16, var12, var10, 382776179);
                     }
                  }

               }
            } else if(Class422.aClass422_4724 == var0) {
               var3 = var2.readIntV2((byte)37);
               var4 = var2.readUnsigned128Byte((byte)-66);
               var24 = (var4 >> 4 & 7) + 381658035 * Class130.anInt1618;
               var6 = (var4 & 7) + 76546883 * Class300.anInt3254;
               var7 = var2.readUnsigned128Byte((byte)-53);
               var8 = var2.readUnsignedByte(-903866824);
               var9 = var8 >> 2;
               var10 = var8 & 3;
               var28 = client.anIntArray11071[var9];
               if(client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer) {
                  Class698.method8160(Class711.anInt8858 * 1728196755, var24, var6, var28, var9, var10, var3, var7, -1038783962);
               }
            } else {
               Class596 var5;
               if(Class422.aClass422_4730 == var0) {
                  var3 = var2.readUnsignedShort128((short)25276);
                  var4 = var2.readUnsignedByte128((byte)36);
                  var5 = client.aClass505_11204.method6128(1980673529);
                  var6 = (var4 & 7) + 76546883 * Class300.anInt3254;
                  var7 = var6 + -845789331 * var5.localY;
                  var8 = (var4 >> 4 & 7) + 381658035 * Class130.anInt1618;
                  var9 = var8 + -814686591 * var5.localX;
                  Class526_Sub20 var31 = (Class526_Sub20)client.aClass20_11259.get((long)(Class711.anInt8858 * 1728196755 << 28 | var7 << 14 | var9));
                  if(var31 != null) {
                     for(Class526_Sub3 var37 = (Class526_Sub3)var31.aClass702_10529.method8206((byte)76); var37 != null; var37 = (Class526_Sub3)var31.aClass702_10529.method8181(246951841)) {
                        if(var3 == var37.anInt10370 * -1804739063) {
                           var37.method6332(-1949449864);
                           break;
                        }
                     }

                     if(var31.aClass702_10529.method8209(1212757216)) {
                        var31.method6332(-1949449864);
                     }

                     if(var8 >= 0 && var6 >= 0 && var8 < client.aClass505_11204.method6056(-1746741811) && var6 < client.aClass505_11204.method6057(126749238)) {
                        Class646.method7691(1728196755 * Class711.anInt8858, var8, var6, -810480303);
                     }
                  }

               } else if(var0 == Class422.aClass422_4726) {
                  var3 = var2.readUnsigned128Byte((byte)-32);
                  var4 = var2.readUnsignedByte128((byte)36);
                  var24 = (var4 >> 4 & 7) + 381658035 * Class130.anInt1618;
                  var6 = (var4 & 7) + Class300.anInt3254 * 76546883;
                  var7 = var2.readIntV2((byte)22);
                  var8 = var2.readUnsigned128Byte((byte)-63);
                  var9 = var8 >> 2;
                  var10 = client.anIntArray11071[var9];
                  if(var9 == Class594.aClass594_7842.anInt7833 * -1226971375) {
                     var9 = -1226971375 * Class594.aClass594_7841.anInt7833;
                  }

                  if(1 == (var3 & 1)) {
                     Class526_Sub2.method9292(Class711.anInt8858 * 1728196755, var24, var6, var10, var7, var9, (Class599)null, 845117895);
                  } else {
                     int[] var33 = null;
                     if((var3 & 2) == 2) {
                        var12 = var2.readUnsignedByte(1236943175);
                        var33 = new int[var12];

                        for(var13 = 0; var13 < var12; ++var13) {
                           var33[var13] = var2.readInt((byte)5);
                        }
                     }

                     short[] var34 = null;
                     if((var3 & 4) == 4) {
                        var13 = var2.readUnsignedByte(2005946469);
                        var34 = new short[var13];

                        for(var14 = 0; var14 < var13; ++var14) {
                           var34[var14] = (short)var2.readUnsignedShort(2069863940);
                        }
                     }

                     short[] var40 = null;
                     if(8 == (var3 & 8)) {
                        var14 = var2.readUnsignedByte(-1871820514);
                        var40 = new short[var14];

                        for(var15 = 0; var15 < var14; ++var15) {
                           var40[var15] = (short)var2.readUnsignedShort(582849858);
                        }
                     }

                     Class526_Sub2.method9292(1728196755 * Class711.anInt8858, var24, var6, var10, var7, var9, new Class599(Class526_Sub1.aLong10313 * 7411269484759484337L, var33, var34, var40), -620769522);
                     Class526_Sub1.aLong10313 += 4856571393835524433L;
                  }

               } else if(var0 == Class422.aClass422_4731) {
                  var3 = var2.readByteC((byte)8);
                  var4 = var3 >> 2;
                  var24 = var3 & 3;
                  var6 = client.anIntArray11071[var4];
                  var7 = var2.readUnsignedByte(313636346);
                  var8 = 381658035 * Class130.anInt1618 + (var7 >> 4 & 7);
                  var9 = Class300.anInt3254 * 76546883 + (var7 & 7);
                  if(client.aClass505_11204.method6051(-1656530587).method6017(1861865949) || var8 >= 0 && var9 >= 0 && var8 < client.aClass505_11204.method6056(-1746741811) && var9 < client.aClass505_11204.method6057(126749238)) {
                     Class174.method2634(Class711.anInt8858 * 1728196755, var8, var9, var6, -1, var4, var24, -1969279263);
                  }

               } else if(Class422.aClass422_4738 == var0) {
                  var3 = var2.readUnsigned128Byte((byte)-62);
                  var4 = var3 >> 2;
                  var24 = var3 & 3;
                  var6 = client.anIntArray11071[var4];
                  var7 = var2.readUnsignedByte128((byte)36);
                  var8 = (var7 >> 4 & 7) + Class130.anInt1618 * 381658035;
                  var9 = Class300.anInt3254 * 76546883 + (var7 & 7);
                  var10 = var2.readIntLE(728013516);
                  if(client.aClass505_11204.method6051(-1656530587).method6017(1349456629) || var8 >= 0 && var9 >= 0 && var8 < client.aClass505_11204.method6056(-1746741811) && var9 < client.aClass505_11204.method6057(126749238)) {
                     Class174.method2634(Class711.anInt8858 * 1728196755, var8, var9, var6, var10, var4, var24, -1119209842);
                  }

               } else if(var0 == Class422.aClass422_4735) {
                  var3 = var2.readInt((byte)5);
                  var4 = var2.readUnsignedByte(-557871117);
                  ((Class610)client.aClass505_11204.method6066(-631188979).method89(var3, -72361663)).method7174(var4, -1754405788);
               } else if(var0 == Class422.aClass422_4725) {
                  var3 = var2.readUnsignedByte(1575964089);
                  var4 = 763316070 * Class130.anInt1618 + (var3 >> 4 & 15);
                  var24 = (var3 & 15) + Class300.anInt3254 * 153093766;
                  var6 = var2.readUnsignedByte(1753048471);
                  boolean var25 = 0 != (var6 & 1);
                  boolean var27 = 0 != (var6 & 2);
                  var9 = var27?var6 >> 2:-1;
                  var10 = var4 + var2.readByte((byte)85);
                  var28 = var24 + var2.readByte((byte)39);
                  var12 = var2.readShort((byte)1);
                  var13 = var2.readShort((byte)1);
                  var14 = var2.readUnsignedShort(999071706);
                  var15 = var2.readUnsignedByte(-1853558941);
                  if(var27) {
                     var15 = (byte)var15;
                  } else {
                     var15 *= 4;
                  }

                  var16 = var2.readUnsignedByte(-257499837) * 4;
                  var17 = var2.readUnsignedShort(1204033215);
                  int var43 = var2.readUnsignedShort(2103996023);
                  int var19 = var2.readUnsignedByte(-1723354421);
                  int var20 = var2.readUnsignedShort(1835991844);
                  if(var19 == 255) {
                     var19 = -1;
                  }

                  int var21 = var2.readShort((byte)1);
                  if(client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer) {
                     if(var4 >= 0 && var24 >= 0 && var4 < client.aClass505_11204.method6056(-1746741811) * 2 && var24 < client.aClass505_11204.method6056(-1746741811) * 2 && var10 >= 0 && var28 >= 0 && var10 < client.aClass505_11204.method6057(126749238) * 2 && var28 < client.aClass505_11204.method6057(126749238) * 2 && var14 != '\uffff') {
                        var4 *= 256;
                        var24 *= 256;
                        var10 *= 256;
                        var28 *= 256;
                        var15 <<= 2;
                        var16 <<= 2;
                        var20 <<= 2;
                        Class293.method3955(var14, var12, var13, var9, var15, var16, var4, var24, var10, var28, var17, var43, var19, var20, var25, var21, -1164320019);
                     }

                  }
               } else if(var0 == Class422.aClass422_4736) {
                  var3 = var2.readUnsignedByte(-621348056);
                  Class596 var23 = client.aClass505_11204.method6128(1964004721);
                  var24 = (var3 & 7) + 76546883 * Class300.anInt3254;
                  var6 = var24 + -845789331 * var23.localY;
                  var7 = Class130.anInt1618 * 381658035 + (var3 >> 4 & 7);
                  var8 = var7 + var23.localX * -814686591;
                  var9 = var2.readUnsignedShort(1243278276);
                  var10 = var2.readUnsignedShort(769903892);
                  var28 = var2.readUnsignedShort(1049036731);
                  if(null != client.aClass20_11259) {
                     Class526_Sub20 var32 = (Class526_Sub20)client.aClass20_11259.get((long)(Class711.anInt8858 * 1728196755 << 28 | var6 << 14 | var8));
                     if(var32 != null) {
                        for(Class526_Sub3 var35 = (Class526_Sub3)var32.aClass702_10529.method8206((byte)101); null != var35; var35 = (Class526_Sub3)var32.aClass702_10529.method8181(1701735490)) {
                           if(var35.anInt10370 * -1804739063 == var9 && var10 == 2030746333 * var35.anInt10371) {
                              var35.method6332(-1949449864);
                              var35.anInt10371 = 1759702389 * var28;
                              Class588.method7001(Class711.anInt8858 * 1728196755, var8, var6, var35, (byte)93);
                              break;
                           }
                        }

                        if(var7 >= 0 && var24 >= 0 && var7 < client.aClass505_11204.method6056(-1746741811) && var24 < client.aClass505_11204.method6057(126749238)) {
                           Class646.method7691(Class711.anInt8858 * 1728196755, var7, var24, -1411795433);
                        }
                     }
                  }

               } else if(Class422.aClass422_4732 != var0) {
                  if(Class422.aClass422_4727 == var0) {
                     var3 = var2.readUnsignedByte(384581606);
                     var4 = Class130.anInt1618 * 381658035 + (var3 >> 4 & 7);
                     var24 = (var3 & 7) + Class300.anInt3254 * 76546883;
                     var6 = var2.readUnsignedShort(1503192688);
                     if('\uffff' == var6) {
                        var6 = -1;
                     }

                     var7 = var2.readUnsignedShort(981388930);
                     var8 = var2.readUnsignedShort(363860661);
                     var9 = var2.readUnsignedByte(534522625);
                     var10 = var2.readShort((byte)1);
                     if(client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer) {
                        if(var4 >= 0 && var24 >= 0 && var4 < client.aClass505_11204.method6056(-1746741811) && var24 < client.aClass505_11204.method6057(126749238)) {
                           if(var6 == -1) {
                              Class526_Sub21_Sub8 var29 = (Class526_Sub21_Sub8)client.aClass20_11160.get((long)(var4 << 16 | var24));
                              if(var29 != null) {
                                 var29.aClass639_Sub1_Sub2_Sub6_11665.method10952(-1181161680);
                                 var29.method6332(-1949449864);
                              }
                           } else {
                              var28 = var4 * 512 + 256;
                              var12 = 256 + 512 * var24;
                              var13 = 1728196755 * Class711.anInt8858;
                              if(var13 < 3 && client.aClass505_11204.method6094((byte)-82).method5614(var4, var24, 1426902433)) {
                                 ++var13;
                              }

                              Class639_Sub1_Sub2_Sub6 var36 = new Class639_Sub1_Sub2_Sub6(client.aClass505_11204.method6072(1292622721), var6, var8, 1728196755 * Class711.anInt8858, var13, var28, Class387.method4762(var28, var12, 1728196755 * Class711.anInt8858, 1543941825) - var7, var12, var4, var4, var24, var24, var9, false, var10);
                              client.aClass20_11160.put(new Class526_Sub21_Sub8(var36), (long)(var4 << 16 | var24));
                           }
                        }

                     }
                  } else if(var0 == Class422.aClass422_4733) {
                     var2.readUnsignedByte(-752349224);
                     var3 = var2.readUnsignedByte(-1515810911);
                     var4 = (var3 >> 4 & 7) + Class130.anInt1618 * 381658035;
                     var24 = (var3 & 7) + 76546883 * Class300.anInt3254;
                     var6 = var2.readUnsignedShort(1178829458);
                     var7 = var2.readUnsignedByte(919318279);
                     var8 = var2.read24BitInt(742041327);
                     String var26 = var2.readString(-1468750823);
                     if(client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer) {
                        Class70.method1096(Class711.anInt8858 * 1728196755, var4, var24, var7, var6, var8, var26, (byte)95);
                     }
                  } else if(var0 == Class422.aClass422_4737) {
                     var3 = var2.readUnsignedByte(-119424122);
                     boolean var22 = 0 != (var3 & 128);
                     var24 = 381658035 * Class130.anInt1618 + (var3 >> 3 & 7);
                     var6 = (var3 & 7) + 76546883 * Class300.anInt3254;
                     var7 = var24 + var2.readByte((byte)54);
                     var8 = var6 + var2.readByte((byte)104);
                     var9 = var2.readShort((byte)1);
                     var10 = var2.readUnsignedShort(1236854285);
                     var28 = var2.readUnsignedByte(-557510612) * 4;
                     var12 = var2.readUnsignedByte(2122801763) * 4;
                     var13 = var2.readUnsignedShort(1424270565);
                     var14 = var2.readUnsignedShort(2070212022);
                     var15 = var2.readUnsignedByte(64618588);
                     var16 = var2.readUnsignedShort(1260310671);
                     var17 = var2.readShort((byte)1);
                     if(var15 == 255) {
                        var15 = -1;
                     }

                     if(client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer) {
                        if(var24 >= 0 && var6 >= 0 && var24 < client.aClass505_11204.method6056(-1746741811) && var6 < client.aClass505_11204.method6057(126749238) && var7 >= 0 && var8 >= 0 && var7 < client.aClass505_11204.method6056(-1746741811) && var8 < client.aClass505_11204.method6057(126749238) && '\uffff' != var10) {
                           var24 = 512 * var24 + 256;
                           var6 = var6 * 512 + 256;
                           var7 = 256 + 512 * var7;
                           var8 = 256 + var8 * 512;
                           var28 <<= 2;
                           var12 <<= 2;
                           var16 <<= 2;
                           Class639_Sub1_Sub2_Sub4 var18 = new Class639_Sub1_Sub2_Sub4(client.aClass505_11204.method6072(1258720635), var10, Class711.anInt8858 * 1728196755, Class711.anInt8858 * 1728196755, var24, var6, var28, var13 + client.anInt11012, client.anInt11012 + var14, var15, var16, 0, var9, var12, var22, -1, var17);
                           var18.method10925(var7, var8, Class387.method4762(var7, var8, Class711.anInt8858 * 1728196755, 1780832608) - var12, client.anInt11012 + var13, -750733342);
                           client.aClass702_11173.method8176(new Class526_Sub21_Sub4(var18), -1391013078);
                        }

                     }
                  } else {
                     Class375.method4671("" + var0, new RuntimeException(), (byte)13);
                     Class460_Sub1.logout(false, -1730576285);
                  }
               } else {
                  var3 = var2.readUnsignedShortLE128((short)5888);
                  var4 = var2.readUnsignedByte128((byte)36);
                  var5 = client.aClass505_11204.method6128(2036194228);
                  var6 = (var4 & 7) + Class300.anInt3254 * 76546883;
                  var7 = -845789331 * var5.localY + var6;
                  var8 = Class130.anInt1618 * 381658035 + (var4 >> 4 & 7);
                  var9 = var8 + var5.localX * -814686591;
                  var10 = var2.readUnsignedShort(1033410525);
                  boolean var11 = var8 >= 0 && var6 >= 0 && var8 < client.aClass505_11204.method6056(-1746741811) && var6 < client.aClass505_11204.method6057(126749238);
                  if(var11 || client.aClass505_11204.method6051(-1656530587).method6017(718819081)) {
                     Class588.method7001(1728196755 * Class711.anInt8858, var9, var7, new Class526_Sub3(var3, var10), (byte)-117);
                     if(var11) {
                        Class646.method7691(Class711.anInt8858 * 1728196755, var8, var6, 559639635);
                     }
                  }

               }
            }
         }
      }
   }
}
