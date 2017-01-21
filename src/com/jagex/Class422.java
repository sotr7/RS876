package com.jagex;

import com.jagex.Class10;
import com.jagex.Class115;
import com.jagex.Class120;
import com.jagex.Class163;
import com.jagex.Class195;
import com.jagex.Class202;
import com.jagex.Class203;
import com.jagex.Class230;
import com.jagex.Class307;
import com.jagex.Class327;
import com.jagex.Class329_Sub2;
import com.jagex.OutFrame;
import com.jagex.Class46;
import com.jagex.Class510;
import com.jagex.OutFrameBuffer;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class646;
import com.jagex.Class648;
import com.jagex.Class700;
import com.jagex.Interface63;
import com.jagex.client;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Class422 {
   static int anInt4739;
   public static Class163 aClass163_4740;
   public static Class422 aClass422_4725 = new Class422(21);
   public static Class422 aClass422_4734 = new Class422(7);
   public static Class422 aClass422_4726 = new Class422(-1);
   public static Class422 aClass422_4727 = new Class422(10);
   public static Class422 aClass422_4728 = new Class422(9);
   public static Class422 aClass422_4736 = new Class422(7);
   public static Class422 aClass422_4730 = new Class422(3);
   public static Class422 aClass422_4729 = new Class422(8);
   public static Class422 aClass422_4732 = new Class422(5);
   public static Class422 aClass422_4731 = new Class422(2);
   public static Class422 aClass422_4735 = new Class422(5);
   public static Class422 aClass422_4724 = new Class422(7);
   public static Class422 aClass422_4733 = new Class422(-1);
   public static Class422 aClass422_4737 = new Class422(18);
   public static Class422 aClass422_4738 = new Class422(6);

   Class422(int var1) {
   }

   public static int method4992(String var0, byte var1) {
      return Class570.aTwitchTV7639.ChatSendMessage(var0);
   }

   public static void method4993(byte var0) {
      Class46.method927(2032321509);
      Class646.aClass654_Sub2_8449.method7811((byte)92);
      Class646.aClass654_Sub1_8450.method7811((byte)-18);
      OutFrameBuffer var1;
      int var2;
      if(1880027675 * client.anInt11034 > 0) {
         var1 = Class115.method1414(OutFrame.aClass405_4210, client.aClass111_11060.aClass14_1342, -1204026661);
         var1.out.writeShort(client.anInt11034 * -1069823892, -805078716);

         for(var2 = 0; var2 < 1880027675 * client.anInt11034; ++var2) {
            Interface63 var3 = client.anInterface63Array11010[var2];
            long var4 = var3.method423((byte)-62) - Class646.aLong8446 * 6939095161191498633L;
            if(var4 > 16777215L) {
               var4 = 16777215L;
            }

            Class646.aLong8446 = var3.method423((byte)-117) * -6787375423560883527L;
            var1.out.writeByte(var3.method421(-1448615585), -35262455);
            var1.out.writeTriByte((int)var4, -1380410137);
         }

         client.aClass111_11060.write(var1, (byte)43);
      }

      if(-1853499883 * Class646.anInt8447 > 0) {
         Class646.anInt8447 -= 1490045245;
      }

      if(client.aBool11070 && Class646.anInt8447 * -1853499883 <= 0) {
         Class646.anInt8447 = -263866172;
         client.aBool11070 = false;
         int var12;
         if(2 == Class327.anInt3488 * -265840483) {
            if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297) {
               Class329_Sub2 var13 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(476879419);
               var12 = Class648.method7709(var13.aClass440_10100, (byte)20) >> 3;
               short var6 = 1024;
               var2 = (var6 * 3 - (Class510.method6167(var13.aClass440_10100, 275585901) >> 3)) % (var6 * 2);
            } else {
               var12 = 0;
               var2 = 0;
            }
         } else {
            var12 = (int)client.aFloat11210 >> 3;
            var2 = (int)client.aFloat11105 >> 3;
         }

         OutFrameBuffer var15 = Class115.method1414(OutFrame.aClass405_4242, client.aClass111_11060.aClass14_1342, -274614153);
         var15.out.writeShort128(var12, (byte)5);
         var15.out.writeLEShort128(var2, -1166579642);
         client.aClass111_11060.write(var15, (byte)91);
      }

      if(Class10.aBool64 != Class646.aBool8448) {
         Class646.aBool8448 = Class10.aBool64;
         var1 = Class115.method1414(OutFrame.aClass405_4188, client.aClass111_11060.aClass14_1342, 1132541043);
         var1.out.writeByte(Class10.aBool64?1:0, 1398120844);
         client.aClass111_11060.write(var1, (byte)-9);
      }

      if(!client.aBool11013) {
         var1 = Class115.method1414(OutFrame.aClass405_4173, client.aClass111_11060.aClass14_1342, 473650613);
         var1.out.writeByte(0, 205291301);
         var2 = 301018015 * var1.out.pos;
         RSByteBuffer var16 = Class230.preferences.method9606((byte)73);
         var1.out.method9619(var16.buffer, 0, var16.pos * 301018015, 1414005536);
         var1.out.method9678(var1.out.pos * 301018015 - var2, (byte)-96);
         client.aClass111_11060.write(var1, (byte)-6);
         client.aBool11013 = true;
      }

      if(!client.aBool11014 && Class230.preferences.aClass711_Sub19_10632.method10022((byte)-100) == 1) {
         int[] var14 = Class554.aClass174_7475.method2246();
         OutFrameBuffer var17 = Class115.method1414(OutFrame.aClass405_4214, client.aClass111_11060.aClass14_1342, 1085172579);
         var17.out.writeShort(0, -805078716);
         int var18 = 301018015 * var17.out.pos;
         if(var14 != null && var14.length != 0) {
            var17.out.writeByte(1, -529136196);
            Class120[] var19 = Class120.method1451(-2026883889);
            HashSet var7 = new HashSet();
            ArrayList var8 = new ArrayList();
            int var9 = 0;

            label94:
            while(true) {
               if(var9 >= var14.length) {
                  Class570.method6891(var7, var17.out, 114864534);
                  var17.out.method9607(var8.size(), 2075882601);
                  if(var8.size() <= 0) {
                     break;
                  }

                  var9 = Integer.MAX_VALUE;
                  Iterator var20 = var8.iterator();

                  Integer var21;
                  while(var20.hasNext()) {
                     var21 = (Integer)var20.next();
                     if(var21.intValue() < var9) {
                        var9 = var21.intValue();
                     }
                  }

                  var17.out.method9623(var9, 962856265);
                  var20 = var8.iterator();

                  while(true) {
                     if(!var20.hasNext()) {
                        break label94;
                     }

                     var21 = (Integer)var20.next();
                     if(var21.intValue() != var9) {
                        var17.out.method9623(var21.intValue() - var9, 625075877);
                     }
                  }
               }

               boolean var10 = false;

               for(int var11 = 0; var11 < var19.length; ++var11) {
                  if(var14[var9] == var19[var11].anInt1528) {
                     var7.add(var19[var11]);
                     var10 = true;
                     break;
                  }
               }

               if(!var10) {
                  var8.add(Integer.valueOf(var14[var9]));
               }

               ++var9;
            }
         } else {
            var17.out.writeByte(0, 639910530);
         }

         var17.out.method9620(301018015 * var17.out.pos - var18, (byte)-1);
         client.aClass111_11060.write(var17, (byte)-20);
         client.aBool11014 = true;
      }

   }

   public static byte method4994(char var0, byte var1) {
      byte var2;
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(8364 == var0) {
            var2 = -128;
         } else if(var0 == 8218) {
            var2 = -126;
         } else if(var0 == 402) {
            var2 = -125;
         } else if(8222 == var0) {
            var2 = -124;
         } else if(var0 == 8230) {
            var2 = -123;
         } else if(8224 == var0) {
            var2 = -122;
         } else if(8225 == var0) {
            var2 = -121;
         } else if(var0 == 710) {
            var2 = -120;
         } else if(var0 == 8240) {
            var2 = -119;
         } else if(var0 == 352) {
            var2 = -118;
         } else if(8249 == var0) {
            var2 = -117;
         } else if(var0 == 338) {
            var2 = -116;
         } else if(381 == var0) {
            var2 = -114;
         } else if(var0 == 8216) {
            var2 = -111;
         } else if(8217 == var0) {
            var2 = -110;
         } else if(8220 == var0) {
            var2 = -109;
         } else if(var0 == 8221) {
            var2 = -108;
         } else if(8226 == var0) {
            var2 = -107;
         } else if(8211 == var0) {
            var2 = -106;
         } else if(8212 == var0) {
            var2 = -105;
         } else if(732 == var0) {
            var2 = -104;
         } else if(var0 == 8482) {
            var2 = -103;
         } else if(353 == var0) {
            var2 = -102;
         } else if(var0 == 8250) {
            var2 = -101;
         } else if(339 == var0) {
            var2 = -100;
         } else if(382 == var0) {
            var2 = -98;
         } else if(376 == var0) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   public static void method4995(byte var0) {
      if(client.anInt11038 * -558705405 == 11) {
         OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4246, client.aClass111_11059.aClass14_1342, 1505714194);
         client.aClass111_11059.write(var1, (byte)-77);
         Class203.aClass700_2214 = Class700.aClass700_8774;
         Class202.aString2212 = null;
      }
   }
}
