package com.jagex;

import com.jagex.Class10;
import com.jagex.Class11;
import com.jagex.Class115;
import com.jagex.Class120;
import com.jagex.Class149;
import com.jagex.Class160;
import com.jagex.Class195;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class307;
import com.jagex.Class327;
import com.jagex.Class329_Sub2;
import com.jagex.Class387;
import com.jagex.OutFrame;
import com.jagex.Class425;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class448_Sub1;
import com.jagex.Class46;
import com.jagex.Class469;
import com.jagex.Class502;
import com.jagex.Class510;
import com.jagex.Class52;
import com.jagex.Class522;
import com.jagex.Class526_Sub20;
import com.jagex.Class526_Sub24;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub29_Sub1;
import com.jagex.Class526_Sub3;
import com.jagex.RSByteBuffer;
import com.jagex.Class528;
import com.jagex.Class554;
import com.jagex.Class564;
import com.jagex.Class566;
import com.jagex.Class570;
import com.jagex.Class596;
import com.jagex.Class615;
import com.jagex.Class618;
import com.jagex.Class632;
import com.jagex.Class639_Sub1_Sub4_Sub1;
import com.jagex.Class648;
import com.jagex.Class654_Sub1;
import com.jagex.Class654_Sub2;
import com.jagex.Class670;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import com.jagex.Interface63;
import com.jagex.client;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Class646 {
   static int anInt8447 = 0;
   static long aLong8446 = 6787375423560883527L;
   static boolean aBool8448 = true;
   static Class654_Sub2 aClass654_Sub2_8449 = new Class654_Sub2();
   static Class654_Sub1 aClass654_Sub1_8450 = new Class654_Sub1();
   static Queue aQueue8451 = new LinkedList();

   public static void method7673() {
      Class46.method927(2032321509);
      aClass654_Sub2_8449.method7811((byte)75);
      aClass654_Sub1_8450.method7811((byte)-40);
      OutFrameBuffer var0;
      int var1;
      if(1880027675 * client.anInt11034 > 0) {
         var0 = Class115.method1414(OutFrame.aClass405_4210, client.aClass111_11060.aClass14_1342, -2053105224);
         var0.out.writeShort(client.anInt11034 * -1069823892, -805078716);

         for(var1 = 0; var1 < 1880027675 * client.anInt11034; ++var1) {
            Interface63 var2 = client.anInterface63Array11010[var1];
            long var3 = var2.method423((byte)-71) - aLong8446 * 6939095161191498633L;
            if(var3 > 16777215L) {
               var3 = 16777215L;
            }

            aLong8446 = var2.method423((byte)-66) * -6787375423560883527L;
            var0.out.writeByte(var2.method421(-559974506), 1275316142);
            var0.out.writeTriByte((int)var3, -1497535959);
         }

         client.aClass111_11060.write(var0, (byte)69);
      }

      if(-1853499883 * anInt8447 > 0) {
         anInt8447 -= 1490045245;
      }

      if(client.aBool11070 && anInt8447 * -1853499883 <= 0) {
         anInt8447 = -263866172;
         client.aBool11070 = false;
         int var11;
         if(2 == Class327.anInt3488 * -265840483) {
            if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297) {
               Class329_Sub2 var12 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(911138140);
               var11 = Class648.method7709(var12.aClass440_10100, (byte)115) >> 3;
               short var5 = 1024;
               var1 = (var5 * 3 - (Class510.method6167(var12.aClass440_10100, 1832916872) >> 3)) % (var5 * 2);
            } else {
               var11 = 0;
               var1 = 0;
            }
         } else {
            var11 = (int)client.aFloat11210 >> 3;
            var1 = (int)client.aFloat11105 >> 3;
         }

         OutFrameBuffer var14 = Class115.method1414(OutFrame.aClass405_4242, client.aClass111_11060.aClass14_1342, 238527415);
         var14.out.writeShort128(var11, (byte)52);
         var14.out.writeLEShort128(var1, 80457472);
         client.aClass111_11060.write(var14, (byte)-15);
      }

      if(Class10.aBool64 != aBool8448) {
         aBool8448 = Class10.aBool64;
         var0 = Class115.method1414(OutFrame.aClass405_4188, client.aClass111_11060.aClass14_1342, 1131341986);
         var0.out.writeByte(Class10.aBool64?1:0, 1946081884);
         client.aClass111_11060.write(var0, (byte)-65);
      }

      if(!client.aBool11013) {
         var0 = Class115.method1414(OutFrame.aClass405_4173, client.aClass111_11060.aClass14_1342, 1449094190);
         var0.out.writeByte(0, -215530030);
         var1 = 301018015 * var0.out.pos;
         RSByteBuffer var15 = Class230.preferences.method9606((byte)95);
         var0.out.method9619(var15.buffer, 0, var15.pos * 301018015, 1857719430);
         var0.out.method9678(var0.out.pos * 301018015 - var1, (byte)-39);
         client.aClass111_11060.write(var0, (byte)24);
         client.aBool11013 = true;
      }

      if(!client.aBool11014 && Class230.preferences.aClass711_Sub19_10632.method10022((byte)-11) == 1) {
         int[] var13 = Class554.aClass174_7475.method2246();
         OutFrameBuffer var16 = Class115.method1414(OutFrame.aClass405_4214, client.aClass111_11060.aClass14_1342, 729351014);
         var16.out.writeShort(0, -805078716);
         int var17 = 301018015 * var16.out.pos;
         if(var13 != null && var13.length != 0) {
            var16.out.writeByte(1, -717335283);
            Class120[] var18 = Class120.method1451(-2026883889);
            HashSet var6 = new HashSet();
            ArrayList var7 = new ArrayList();
            int var8 = 0;

            label94:
            while(true) {
               if(var8 >= var13.length) {
                  Class570.method6891(var6, var16.out, 486635895);
                  var16.out.method9607(var7.size(), 1167548114);
                  if(var7.size() <= 0) {
                     break;
                  }

                  var8 = Integer.MAX_VALUE;
                  Iterator var19 = var7.iterator();

                  Integer var20;
                  while(var19.hasNext()) {
                     var20 = (Integer)var19.next();
                     if(var20.intValue() < var8) {
                        var8 = var20.intValue();
                     }
                  }

                  var16.out.method9623(var8, 307851228);
                  var19 = var7.iterator();

                  while(true) {
                     if(!var19.hasNext()) {
                        break label94;
                     }

                     var20 = (Integer)var19.next();
                     if(var20.intValue() != var8) {
                        var16.out.method9623(var20.intValue() - var8, 752322235);
                     }
                  }
               }

               boolean var9 = false;

               for(int var10 = 0; var10 < var18.length; ++var10) {
                  if(var13[var8] == var18[var10].anInt1528) {
                     var6.add(var18[var10]);
                     var9 = true;
                     break;
                  }
               }

               if(!var9) {
                  var7.add(Integer.valueOf(var13[var8]));
               }

               ++var8;
            }
         } else {
            var16.out.writeByte(0, 1914861135);
         }

         var16.out.method9620(301018015 * var16.out.pos - var17, (byte)-1);
         client.aClass111_11060.write(var16, (byte)-18);
         client.aBool11014 = true;
      }

   }

   public static void method7674() {
      Class46.method927(2032321509);
      aClass654_Sub2_8449.method7811((byte)-11);
      aClass654_Sub1_8450.method7811((byte)-51);
      OutFrameBuffer var0;
      int var1;
      if(1880027675 * client.anInt11034 > 0) {
         var0 = Class115.method1414(OutFrame.aClass405_4210, client.aClass111_11060.aClass14_1342, -492666467);
         var0.out.writeShort(client.anInt11034 * -1069823892, -805078716);

         for(var1 = 0; var1 < 1880027675 * client.anInt11034; ++var1) {
            Interface63 var2 = client.anInterface63Array11010[var1];
            long var3 = var2.method423((byte)-10) - aLong8446 * 6939095161191498633L;
            if(var3 > 16777215L) {
               var3 = 16777215L;
            }

            aLong8446 = var2.method423((byte)-107) * -6787375423560883527L;
            var0.out.writeByte(var2.method421(109241454), 977493133);
            var0.out.writeTriByte((int)var3, -1460029560);
         }

         client.aClass111_11060.write(var0, (byte)-14);
      }

      if(-1853499883 * anInt8447 > 0) {
         anInt8447 -= 1490045245;
      }

      if(client.aBool11070 && anInt8447 * -1853499883 <= 0) {
         anInt8447 = -263866172;
         client.aBool11070 = false;
         int var11;
         if(2 == Class327.anInt3488 * -265840483) {
            if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297) {
               Class329_Sub2 var12 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-288956246);
               var11 = Class648.method7709(var12.aClass440_10100, (byte)104) >> 3;
               short var5 = 1024;
               var1 = (var5 * 3 - (Class510.method6167(var12.aClass440_10100, 1277620662) >> 3)) % (var5 * 2);
            } else {
               var11 = 0;
               var1 = 0;
            }
         } else {
            var11 = (int)client.aFloat11210 >> 3;
            var1 = (int)client.aFloat11105 >> 3;
         }

         OutFrameBuffer var14 = Class115.method1414(OutFrame.aClass405_4242, client.aClass111_11060.aClass14_1342, -468285312);
         var14.out.writeShort128(var11, (byte)25);
         var14.out.writeLEShort128(var1, -728436722);
         client.aClass111_11060.write(var14, (byte)-36);
      }

      if(Class10.aBool64 != aBool8448) {
         aBool8448 = Class10.aBool64;
         var0 = Class115.method1414(OutFrame.aClass405_4188, client.aClass111_11060.aClass14_1342, 399146839);
         var0.out.writeByte(Class10.aBool64?1:0, -1396647849);
         client.aClass111_11060.write(var0, (byte)-14);
      }

      if(!client.aBool11013) {
         var0 = Class115.method1414(OutFrame.aClass405_4173, client.aClass111_11060.aClass14_1342, 560398287);
         var0.out.writeByte(0, -783852698);
         var1 = 301018015 * var0.out.pos;
         RSByteBuffer var15 = Class230.preferences.method9606((byte)73);
         var0.out.method9619(var15.buffer, 0, var15.pos * 301018015, 1538897001);
         var0.out.method9678(var0.out.pos * 301018015 - var1, (byte)-6);
         client.aClass111_11060.write(var0, (byte)-39);
         client.aBool11013 = true;
      }

      if(!client.aBool11014 && Class230.preferences.aClass711_Sub19_10632.method10022((byte)-120) == 1) {
         int[] var13 = Class554.aClass174_7475.method2246();
         OutFrameBuffer var16 = Class115.method1414(OutFrame.aClass405_4214, client.aClass111_11060.aClass14_1342, -2091284173);
         var16.out.writeShort(0, -805078716);
         int var17 = 301018015 * var16.out.pos;
         if(var13 != null && var13.length != 0) {
            var16.out.writeByte(1, 85864916);
            Class120[] var18 = Class120.method1451(-2026883889);
            HashSet var6 = new HashSet();
            ArrayList var7 = new ArrayList();
            int var8 = 0;

            label94:
            while(true) {
               if(var8 >= var13.length) {
                  Class570.method6891(var6, var16.out, 1974584492);
                  var16.out.method9607(var7.size(), -964132455);
                  if(var7.size() <= 0) {
                     break;
                  }

                  var8 = Integer.MAX_VALUE;
                  Iterator var19 = var7.iterator();

                  Integer var20;
                  while(var19.hasNext()) {
                     var20 = (Integer)var19.next();
                     if(var20.intValue() < var8) {
                        var8 = var20.intValue();
                     }
                  }

                  var16.out.method9623(var8, 1153996855);
                  var19 = var7.iterator();

                  while(true) {
                     if(!var19.hasNext()) {
                        break label94;
                     }

                     var20 = (Integer)var19.next();
                     if(var20.intValue() != var8) {
                        var16.out.method9623(var20.intValue() - var8, 298388713);
                     }
                  }
               }

               boolean var9 = false;

               for(int var10 = 0; var10 < var18.length; ++var10) {
                  if(var13[var8] == var18[var10].anInt1528) {
                     var6.add(var18[var10]);
                     var9 = true;
                     break;
                  }
               }

               if(!var9) {
                  var7.add(Integer.valueOf(var13[var8]));
               }

               ++var8;
            }
         } else {
            var16.out.writeByte(0, -760251860);
         }

         var16.out.method9620(301018015 * var16.out.pos - var17, (byte)-1);
         client.aClass111_11060.write(var16, (byte)-57);
         client.aBool11014 = true;
      }

   }

   public static void method7675() {
      Class528.method6346(43324753);
   }

   public static void method7676() {
      if(Class670.method7979(-1781377502)) {
         Class160.method1883(new Class632(), 922141972);
      }

   }

   public static void method7677() {
      Class528.method6346(-80240791);
   }

   public static void method7678() {
      aClass654_Sub2_8449.method7809((byte)-71);
      aClass654_Sub1_8450.method7809((byte)-76);
      aLong8446 = 6787375423560883527L;
      aBool8448 = true;
   }

   public static void method7679() {
      Class528.method6346(1525324353);
   }

   static void method7680() {
      Queue var0 = aQueue8451;
      synchronized(var0) {
         Point var1;
         if(Class425.aCanvas4798.isShowing()) {
            var1 = Class425.aCanvas4798.getLocationOnScreen();
         } else {
            var1 = null;
         }

         while(true) {
            while(true) {
               Class526_Sub29_Sub1 var2 = (Class526_Sub29_Sub1)aQueue8451.poll();
               if(var2 == null) {
                  return;
               }

               if(null != var1 && Class425.aCanvas4798.isShowing() && Class10.aBool64) {
                  var2.method10653(var1, (byte)0);
                  if(!var2.method10652((byte)71) && var2.method9527((byte)94) < Class566.anInt7611 * 1895615023 && var2.method9530(1762748637) < 974996221 * Class526_Sub24.anInt10549 && var2.method9527((byte)99) >= 0 && var2.method9530(1762748637) >= 0) {
                     int var3 = var2.method9528((byte)51);
                     if(var2.method9528((byte)4) == -1) {
                        aClass654_Sub1_8450.method7814(var2, -945063152);
                     } else if(Class618.method7326(var3, (byte)-82)) {
                        aClass654_Sub1_8450.method9884(var2, (byte)99);
                     }
                  }
               } else {
                  var2.method9533((byte)-6);
               }
            }
         }
      }
   }

   static void method7681() {
      Queue var0 = aQueue8451;
      synchronized(var0) {
         Point var1;
         if(Class425.aCanvas4798.isShowing()) {
            var1 = Class425.aCanvas4798.getLocationOnScreen();
         } else {
            var1 = null;
         }

         while(true) {
            while(true) {
               Class526_Sub29_Sub1 var2 = (Class526_Sub29_Sub1)aQueue8451.poll();
               if(var2 == null) {
                  return;
               }

               if(null != var1 && Class425.aCanvas4798.isShowing() && Class10.aBool64) {
                  var2.method10653(var1, (byte)0);
                  if(!var2.method10652((byte)79) && var2.method9527((byte)36) < Class566.anInt7611 * 1895615023 && var2.method9530(1762748637) < 974996221 * Class526_Sub24.anInt10549 && var2.method9527((byte)27) >= 0 && var2.method9530(1762748637) >= 0) {
                     int var3 = var2.method9528((byte)71);
                     if(var2.method9528((byte)48) == -1) {
                        aClass654_Sub1_8450.method7814(var2, 197941131);
                     } else if(Class618.method7326(var3, (byte)-53)) {
                        aClass654_Sub1_8450.method9884(var2, (byte)35);
                     }
                  }
               } else {
                  var2.method9533((byte)-2);
               }
            }
         }
      }
   }

   Class646() throws Throwable {
      throw new Error();
   }

   public static void method7682() {
      Queue var0 = aQueue8451;
      synchronized(var0) {
         while(true) {
            Class526_Sub29_Sub1 var1 = (Class526_Sub29_Sub1)aQueue8451.poll();
            if(var1 == null) {
               return;
            }

            var1.method9533((byte)-2);
         }
      }
   }

   public static void method7683() {
      Queue var0 = aQueue8451;
      synchronized(var0) {
         while(true) {
            Class526_Sub29_Sub1 var1 = (Class526_Sub29_Sub1)aQueue8451.poll();
            if(var1 == null) {
               return;
            }

            var1.method9533((byte)-29);
         }
      }
   }

   public static void method7684() {
      Class46.method927(2032321509);
      aClass654_Sub2_8449.method7811((byte)-13);
      aClass654_Sub1_8450.method7811((byte)87);
      OutFrameBuffer var0;
      int var1;
      if(1880027675 * client.anInt11034 > 0) {
         var0 = Class115.method1414(OutFrame.aClass405_4210, client.aClass111_11060.aClass14_1342, 1168373508);
         var0.out.writeShort(client.anInt11034 * -1069823892, -805078716);

         for(var1 = 0; var1 < 1880027675 * client.anInt11034; ++var1) {
            Interface63 var2 = client.anInterface63Array11010[var1];
            long var3 = var2.method423((byte)-69) - aLong8446 * 6939095161191498633L;
            if(var3 > 16777215L) {
               var3 = 16777215L;
            }

            aLong8446 = var2.method423((byte)-22) * -6787375423560883527L;
            var0.out.writeByte(var2.method421(149226993), -748993681);
            var0.out.writeTriByte((int)var3, -2036863711);
         }

         client.aClass111_11060.write(var0, (byte)10);
      }

      if(-1853499883 * anInt8447 > 0) {
         anInt8447 -= 1490045245;
      }

      if(client.aBool11070 && anInt8447 * -1853499883 <= 0) {
         anInt8447 = -263866172;
         client.aBool11070 = false;
         int var11;
         if(2 == Class327.anInt3488 * -265840483) {
            if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297) {
               Class329_Sub2 var12 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(1147957679);
               var11 = Class648.method7709(var12.aClass440_10100, (byte)39) >> 3;
               short var5 = 1024;
               var1 = (var5 * 3 - (Class510.method6167(var12.aClass440_10100, -1193847077) >> 3)) % (var5 * 2);
            } else {
               var11 = 0;
               var1 = 0;
            }
         } else {
            var11 = (int)client.aFloat11210 >> 3;
            var1 = (int)client.aFloat11105 >> 3;
         }

         OutFrameBuffer var14 = Class115.method1414(OutFrame.aClass405_4242, client.aClass111_11060.aClass14_1342, -530887609);
         var14.out.writeShort128(var11, (byte)119);
         var14.out.writeLEShort128(var1, -1174503370);
         client.aClass111_11060.write(var14, (byte)3);
      }

      if(Class10.aBool64 != aBool8448) {
         aBool8448 = Class10.aBool64;
         var0 = Class115.method1414(OutFrame.aClass405_4188, client.aClass111_11060.aClass14_1342, 1645360081);
         var0.out.writeByte(Class10.aBool64?1:0, 1778860283);
         client.aClass111_11060.write(var0, (byte)-60);
      }

      if(!client.aBool11013) {
         var0 = Class115.method1414(OutFrame.aClass405_4173, client.aClass111_11060.aClass14_1342, 1834762212);
         var0.out.writeByte(0, 1151649315);
         var1 = 301018015 * var0.out.pos;
         RSByteBuffer var15 = Class230.preferences.method9606((byte)32);
         var0.out.method9619(var15.buffer, 0, var15.pos * 301018015, 1721760845);
         var0.out.method9678(var0.out.pos * 301018015 - var1, (byte)-67);
         client.aClass111_11060.write(var0, (byte)-19);
         client.aBool11013 = true;
      }

      if(!client.aBool11014 && Class230.preferences.aClass711_Sub19_10632.method10022((byte)-8) == 1) {
         int[] var13 = Class554.aClass174_7475.method2246();
         OutFrameBuffer var16 = Class115.method1414(OutFrame.aClass405_4214, client.aClass111_11060.aClass14_1342, -307056037);
         var16.out.writeShort(0, -805078716);
         int var17 = 301018015 * var16.out.pos;
         if(var13 != null && var13.length != 0) {
            var16.out.writeByte(1, 1015640292);
            Class120[] var18 = Class120.method1451(-2026883889);
            HashSet var6 = new HashSet();
            ArrayList var7 = new ArrayList();
            int var8 = 0;

            label94:
            while(true) {
               if(var8 >= var13.length) {
                  Class570.method6891(var6, var16.out, -161251755);
                  var16.out.method9607(var7.size(), 66987234);
                  if(var7.size() <= 0) {
                     break;
                  }

                  var8 = Integer.MAX_VALUE;
                  Iterator var19 = var7.iterator();

                  Integer var20;
                  while(var19.hasNext()) {
                     var20 = (Integer)var19.next();
                     if(var20.intValue() < var8) {
                        var8 = var20.intValue();
                     }
                  }

                  var16.out.method9623(var8, -308916373);
                  var19 = var7.iterator();

                  while(true) {
                     if(!var19.hasNext()) {
                        break label94;
                     }

                     var20 = (Integer)var19.next();
                     if(var20.intValue() != var8) {
                        var16.out.method9623(var20.intValue() - var8, 39039416);
                     }
                  }
               }

               boolean var9 = false;

               for(int var10 = 0; var10 < var18.length; ++var10) {
                  if(var13[var8] == var18[var10].anInt1528) {
                     var6.add(var18[var10]);
                     var9 = true;
                     break;
                  }
               }

               if(!var9) {
                  var7.add(Integer.valueOf(var13[var8]));
               }

               ++var8;
            }
         } else {
            var16.out.writeByte(0, 1844429393);
         }

         var16.out.method9620(301018015 * var16.out.pos - var17, (byte)-1);
         client.aClass111_11060.write(var16, (byte)119);
         client.aBool11014 = true;
      }

   }

   public static void method7685() {
      Class46.method927(2032321509);
      aClass654_Sub2_8449.method7811((byte)10);
      aClass654_Sub1_8450.method7811((byte)-30);
      OutFrameBuffer var0;
      int var1;
      if(1880027675 * client.anInt11034 > 0) {
         var0 = Class115.method1414(OutFrame.aClass405_4210, client.aClass111_11060.aClass14_1342, 1130753206);
         var0.out.writeShort(client.anInt11034 * -1069823892, -805078716);

         for(var1 = 0; var1 < 1880027675 * client.anInt11034; ++var1) {
            Interface63 var2 = client.anInterface63Array11010[var1];
            long var3 = var2.method423((byte)-19) - aLong8446 * 6939095161191498633L;
            if(var3 > 16777215L) {
               var3 = 16777215L;
            }

            aLong8446 = var2.method423((byte)-66) * -6787375423560883527L;
            var0.out.writeByte(var2.method421(335090086), -1222632878);
            var0.out.writeTriByte((int)var3, -1700212064);
         }

         client.aClass111_11060.write(var0, (byte)-7);
      }

      if(-1853499883 * anInt8447 > 0) {
         anInt8447 -= 1490045245;
      }

      if(client.aBool11070 && anInt8447 * -1853499883 <= 0) {
         anInt8447 = -263866172;
         client.aBool11070 = false;
         int var11;
         if(2 == Class327.anInt3488 * -265840483) {
            if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297) {
               Class329_Sub2 var12 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(2085332425);
               var11 = Class648.method7709(var12.aClass440_10100, (byte)24) >> 3;
               short var5 = 1024;
               var1 = (var5 * 3 - (Class510.method6167(var12.aClass440_10100, 273488287) >> 3)) % (var5 * 2);
            } else {
               var11 = 0;
               var1 = 0;
            }
         } else {
            var11 = (int)client.aFloat11210 >> 3;
            var1 = (int)client.aFloat11105 >> 3;
         }

         OutFrameBuffer var14 = Class115.method1414(OutFrame.aClass405_4242, client.aClass111_11060.aClass14_1342, 1282712513);
         var14.out.writeShort128(var11, (byte)3);
         var14.out.writeLEShort128(var1, 1767334769);
         client.aClass111_11060.write(var14, (byte)-76);
      }

      if(Class10.aBool64 != aBool8448) {
         aBool8448 = Class10.aBool64;
         var0 = Class115.method1414(OutFrame.aClass405_4188, client.aClass111_11060.aClass14_1342, -1362839163);
         var0.out.writeByte(Class10.aBool64?1:0, 231057472);
         client.aClass111_11060.write(var0, (byte)35);
      }

      if(!client.aBool11013) {
         var0 = Class115.method1414(OutFrame.aClass405_4173, client.aClass111_11060.aClass14_1342, -311955178);
         var0.out.writeByte(0, 1130040944);
         var1 = 301018015 * var0.out.pos;
         RSByteBuffer var15 = Class230.preferences.method9606((byte)74);
         var0.out.method9619(var15.buffer, 0, var15.pos * 301018015, 1579871715);
         var0.out.method9678(var0.out.pos * 301018015 - var1, (byte)-42);
         client.aClass111_11060.write(var0, (byte)45);
         client.aBool11013 = true;
      }

      if(!client.aBool11014 && Class230.preferences.aClass711_Sub19_10632.method10022((byte)-92) == 1) {
         int[] var13 = Class554.aClass174_7475.method2246();
         OutFrameBuffer var16 = Class115.method1414(OutFrame.aClass405_4214, client.aClass111_11060.aClass14_1342, 1103096048);
         var16.out.writeShort(0, -805078716);
         int var17 = 301018015 * var16.out.pos;
         if(var13 != null && var13.length != 0) {
            var16.out.writeByte(1, -221449260);
            Class120[] var18 = Class120.method1451(-2026883889);
            HashSet var6 = new HashSet();
            ArrayList var7 = new ArrayList();
            int var8 = 0;

            label94:
            while(true) {
               if(var8 >= var13.length) {
                  Class570.method6891(var6, var16.out, -1655463905);
                  var16.out.method9607(var7.size(), -1587854566);
                  if(var7.size() <= 0) {
                     break;
                  }

                  var8 = Integer.MAX_VALUE;
                  Iterator var19 = var7.iterator();

                  Integer var20;
                  while(var19.hasNext()) {
                     var20 = (Integer)var19.next();
                     if(var20.intValue() < var8) {
                        var8 = var20.intValue();
                     }
                  }

                  var16.out.method9623(var8, 1651686479);
                  var19 = var7.iterator();

                  while(true) {
                     if(!var19.hasNext()) {
                        break label94;
                     }

                     var20 = (Integer)var19.next();
                     if(var20.intValue() != var8) {
                        var16.out.method9623(var20.intValue() - var8, 914146135);
                     }
                  }
               }

               boolean var9 = false;

               for(int var10 = 0; var10 < var18.length; ++var10) {
                  if(var13[var8] == var18[var10].anInt1528) {
                     var6.add(var18[var10]);
                     var9 = true;
                     break;
                  }
               }

               if(!var9) {
                  var7.add(Integer.valueOf(var13[var8]));
               }

               ++var8;
            }
         } else {
            var16.out.writeByte(0, -938998834);
         }

         var16.out.method9620(301018015 * var16.out.pos - var17, (byte)-1);
         client.aClass111_11060.write(var16, (byte)-42);
         client.aBool11014 = true;
      }

   }

   public static void method7686() {
      Class46.method927(2032321509);
      aClass654_Sub2_8449.method7811((byte)55);
      aClass654_Sub1_8450.method7811((byte)13);
      OutFrameBuffer var0;
      int var1;
      if(1880027675 * client.anInt11034 > 0) {
         var0 = Class115.method1414(OutFrame.aClass405_4210, client.aClass111_11060.aClass14_1342, -982046357);
         var0.out.writeShort(client.anInt11034 * -1069823892, -805078716);

         for(var1 = 0; var1 < 1880027675 * client.anInt11034; ++var1) {
            Interface63 var2 = client.anInterface63Array11010[var1];
            long var3 = var2.method423((byte)-87) - aLong8446 * 6939095161191498633L;
            if(var3 > 16777215L) {
               var3 = 16777215L;
            }

            aLong8446 = var2.method423((byte)-34) * -6787375423560883527L;
            var0.out.writeByte(var2.method421(167919076), -1092277923);
            var0.out.writeTriByte((int)var3, -1458856615);
         }

         client.aClass111_11060.write(var0, (byte)15);
      }

      if(-1853499883 * anInt8447 > 0) {
         anInt8447 -= 1490045245;
      }

      if(client.aBool11070 && anInt8447 * -1853499883 <= 0) {
         anInt8447 = -263866172;
         client.aBool11070 = false;
         int var11;
         if(2 == Class327.anInt3488 * -265840483) {
            if(Class195.aClass292_Sub1_2182.method3914((byte)3) == Class307.aClass307_3297) {
               Class329_Sub2 var12 = (Class329_Sub2)Class195.aClass292_Sub1_2182.method3941(-481221138);
               var11 = Class648.method7709(var12.aClass440_10100, (byte)114) >> 3;
               short var5 = 1024;
               var1 = (var5 * 3 - (Class510.method6167(var12.aClass440_10100, -185508212) >> 3)) % (var5 * 2);
            } else {
               var11 = 0;
               var1 = 0;
            }
         } else {
            var11 = (int)client.aFloat11210 >> 3;
            var1 = (int)client.aFloat11105 >> 3;
         }

         OutFrameBuffer var14 = Class115.method1414(OutFrame.aClass405_4242, client.aClass111_11060.aClass14_1342, -198648321);
         var14.out.writeShort128(var11, (byte)98);
         var14.out.writeLEShort128(var1, -1636343087);
         client.aClass111_11060.write(var14, (byte)62);
      }

      if(Class10.aBool64 != aBool8448) {
         aBool8448 = Class10.aBool64;
         var0 = Class115.method1414(OutFrame.aClass405_4188, client.aClass111_11060.aClass14_1342, -807911196);
         var0.out.writeByte(Class10.aBool64?1:0, -712153164);
         client.aClass111_11060.write(var0, (byte)10);
      }

      if(!client.aBool11013) {
         var0 = Class115.method1414(OutFrame.aClass405_4173, client.aClass111_11060.aClass14_1342, 521148854);
         var0.out.writeByte(0, 1653854059);
         var1 = 301018015 * var0.out.pos;
         RSByteBuffer var15 = Class230.preferences.method9606((byte)40);
         var0.out.method9619(var15.buffer, 0, var15.pos * 301018015, 2072635601);
         var0.out.method9678(var0.out.pos * 301018015 - var1, (byte)-33);
         client.aClass111_11060.write(var0, (byte)-43);
         client.aBool11013 = true;
      }

      if(!client.aBool11014 && Class230.preferences.aClass711_Sub19_10632.method10022((byte)-86) == 1) {
         int[] var13 = Class554.aClass174_7475.method2246();
         OutFrameBuffer var16 = Class115.method1414(OutFrame.aClass405_4214, client.aClass111_11060.aClass14_1342, -1288687420);
         var16.out.writeShort(0, -805078716);
         int var17 = 301018015 * var16.out.pos;
         if(var13 != null && var13.length != 0) {
            var16.out.writeByte(1, 1969157225);
            Class120[] var18 = Class120.method1451(-2026883889);
            HashSet var6 = new HashSet();
            ArrayList var7 = new ArrayList();
            int var8 = 0;

            label94:
            while(true) {
               if(var8 >= var13.length) {
                  Class570.method6891(var6, var16.out, 638787332);
                  var16.out.method9607(var7.size(), 1588272079);
                  if(var7.size() <= 0) {
                     break;
                  }

                  var8 = Integer.MAX_VALUE;
                  Iterator var19 = var7.iterator();

                  Integer var20;
                  while(var19.hasNext()) {
                     var20 = (Integer)var19.next();
                     if(var20.intValue() < var8) {
                        var8 = var20.intValue();
                     }
                  }

                  var16.out.method9623(var8, 754088302);
                  var19 = var7.iterator();

                  while(true) {
                     if(!var19.hasNext()) {
                        break label94;
                     }

                     var20 = (Integer)var19.next();
                     if(var20.intValue() != var8) {
                        var16.out.method9623(var20.intValue() - var8, 2099166594);
                     }
                  }
               }

               boolean var9 = false;

               for(int var10 = 0; var10 < var18.length; ++var10) {
                  if(var13[var8] == var18[var10].anInt1528) {
                     var6.add(var18[var10]);
                     var9 = true;
                     break;
                  }
               }

               if(!var9) {
                  var7.add(Integer.valueOf(var13[var8]));
               }

               ++var8;
            }
         } else {
            var16.out.writeByte(0, 1605711254);
         }

         var16.out.method9620(301018015 * var16.out.pos - var17, (byte)-1);
         client.aClass111_11060.write(var16, (byte)16);
         client.aBool11014 = true;
      }

   }

   static void method7687() {
      Queue var0 = aQueue8451;
      synchronized(var0) {
         Point var1;
         if(Class425.aCanvas4798.isShowing()) {
            var1 = Class425.aCanvas4798.getLocationOnScreen();
         } else {
            var1 = null;
         }

         while(true) {
            while(true) {
               Class526_Sub29_Sub1 var2 = (Class526_Sub29_Sub1)aQueue8451.poll();
               if(var2 == null) {
                  return;
               }

               if(null != var1 && Class425.aCanvas4798.isShowing() && Class10.aBool64) {
                  var2.method10653(var1, (byte)0);
                  if(!var2.method10652((byte)83) && var2.method9527((byte)75) < Class566.anInt7611 * 1895615023 && var2.method9530(1762748637) < 974996221 * Class526_Sub24.anInt10549 && var2.method9527((byte)86) >= 0 && var2.method9530(1762748637) >= 0) {
                     int var3 = var2.method9528((byte)82);
                     if(var2.method9528((byte)-102) == -1) {
                        aClass654_Sub1_8450.method7814(var2, 694839796);
                     } else if(Class618.method7326(var3, (byte)-39)) {
                        aClass654_Sub1_8450.method9884(var2, (byte)48);
                     }
                  }
               } else {
                  var2.method9533((byte)-92);
               }
            }
         }
      }
   }

   static final void method7688(Class681 var0, int var1) throws Exception_Sub2 {
      var0.anInt8623 -= 758383916;
      float var2 = (float)var0.anIntArray8622[-1730576285 * var0.anInt8623];
      float var3 = (float)var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      float var4 = (float)var0.anIntArray8622[var0.anInt8623 * -1730576285 + 2];
      float var5 = (float)var0.anIntArray8622[3 + -1730576285 * var0.anInt8623] / 1000.0F;
      Class195.aClass292_Sub1_2182.method3901(Class446.method5309(var2, var3, var4), var5, 2036209966);
   }

   static final void method7689(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub30_10621, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] != 0?1:0, (short)-12331);
      Class522.method6257(-1042127423);
   }

   public static String method7690(CharSequence var0, int var1) {
      String var2 = Class52.method964(Class564.method6792(var0, (byte)-48));
      if(var2 == null) {
         var2 = "";
      }

      return var2;
   }

   public static void method7691(int var0, int var1, int var2, int var3) {
      Class596 var4 = client.aClass505_11204.method6128(2042002619);
      int var5 = var1 + var4.localX * -814686591;
      int var6 = -845789331 * var4.localY + var2;
      if(client.aClass505_11204.method6072(-1284639361) != null && client.aClass505_11204.method6051(-1656530587) != Class502.staticMapBuffer && var1 >= 0 && var2 >= 0 && var1 < client.aClass505_11204.method6056(-1746741811) && var2 < client.aClass505_11204.method6057(126749238)) {
         long var7 = (long)(var0 << 28 | var6 << 14 | var5);
         Class526_Sub20 var9 = (Class526_Sub20)client.aClass20_11259.get(var7);
         if(var9 == null) {
            client.aClass505_11204.method6072(285146106).method6587(var0, var1, var2, (byte)-80);
         } else {
            Class526_Sub3 var10 = (Class526_Sub3)var9.aClass702_10529.method8206((byte)105);
            if(null == var10) {
               client.aClass505_11204.method6072(-1771633561).method6587(var0, var1, var2, (byte)-111);
            } else {
               int var11 = -1;
               int var12 = -1;
               int var13 = -1;
               Class445 var14 = null;
               Class445 var15 = null;
               Class445 var16 = null;
               Class639_Sub1_Sub4_Sub1 var17 = (Class639_Sub1_Sub4_Sub1)client.aClass505_11204.method6072(39476636).method6587(var0, var1, var2, (byte)-93);
               if(var17 == null) {
                  var17 = new Class639_Sub1_Sub4_Sub1(client.aClass505_11204.method6072(773557416), var1 << 9, client.aClass505_11204.method6072(-1370136636).aClass148Array7288[var0].method1714(var1, var2, 790518682), var2 << 9, var0, var0);
               } else {
                  var11 = var17.anInt12130 * 2007455345;
                  var12 = 1131359607 * var17.anInt12145;
                  var13 = 1325103215 * var17.anInt12134;
                  var14 = var17.aClass445_12136;
                  var15 = var17.aClass445_12132;
                  var16 = var17.aClass445_12131;
                  var17.anInt12134 = -1676469903;
                  var17.anInt12145 = -1697758279;
                  var17.aClass549_10826 = client.aClass505_11204.method6072(-1858437093);
               }

               var17.anInt12130 = var10.anInt10370 * -216679143;
               var17.anInt12139 = 106716879 * var10.anInt10371;

               label98:
               while(true) {
                  Class526_Sub3 var18 = (Class526_Sub3)var9.aClass702_10529.method8181(-4002950);
                  if(var18 == null) {
                     break;
                  }

                  if(-1804739063 * var18.anInt10370 != var17.anInt12130 * 2007455345) {
                     var17.anInt12145 = -432000897 * var18.anInt10370;
                     var17.anInt12133 = var18.anInt10371 * 1160863815;

                     while(true) {
                        Class526_Sub3 var19 = (Class526_Sub3)var9.aClass702_10529.method8181(199557687);
                        if(var19 == null) {
                           break label98;
                        }

                        if(var19.anInt10370 * -1804739063 != var17.anInt12130 * 2007455345 && var19.anInt10370 * -1804739063 != 1131359607 * var17.anInt12145) {
                           var17.anInt12134 = -903406329 * var19.anInt10370;
                           var17.anInt12135 = 902208363 * var19.anInt10371;
                        }
                     }
                  }
               }

               int var20 = Class387.method4762((var1 << 9) + 256, 256 + (var2 << 9), var0, 1802118109);
               var17.method7618((float)(var1 << 9), (float)var20, (float)(var2 << 9));
               if(2007455345 * var17.anInt12130 != var11) {
                  if(var12 == var17.anInt12130 * 2007455345) {
                     var17.aClass445_12136 = var15;
                  } else if(2007455345 * var17.anInt12130 == var13) {
                     var17.aClass445_12136 = var16;
                  } else if(((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var17.anInt12130 * 2007455345, -1063969229)).aBool142) {
                     var17.aClass445_12136 = Class469.method5611((byte)-8);
                  } else {
                     var17.aClass445_12136 = null;
                  }
               }

               if(1131359607 * var17.anInt12145 == -1) {
                  var17.aClass445_12132 = null;
               } else if(var12 != 1131359607 * var17.anInt12145) {
                  if(var11 == 1131359607 * var17.anInt12145) {
                     var17.aClass445_12132 = var14;
                  } else if(1131359607 * var17.anInt12145 == var13) {
                     var17.aClass445_12132 = var16;
                  } else if(((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(1131359607 * var17.anInt12145, 338397761)).aBool142) {
                     var17.aClass445_12132 = Class469.method5611((byte)-20);
                  } else {
                     var17.aClass445_12132 = null;
                  }
               }

               if(-1 == var17.anInt12134 * 1325103215) {
                  var17.aClass445_12131 = null;
               } else if(var13 != var17.anInt12134 * 1325103215) {
                  if(var11 == var17.anInt12134 * 1325103215) {
                     var17.aClass445_12131 = var14;
                  } else if(1325103215 * var17.anInt12134 == var12) {
                     var17.aClass445_12131 = var15;
                  } else if(((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var17.anInt12134 * 1325103215, -1988311867)).aBool142) {
                     var17.aClass445_12131 = Class469.method5611((byte)-111);
                  } else {
                     var17.aClass445_12131 = null;
                  }
               }

               var17.anInt12142 = 0;
               var17.aByte10827 = (byte)var0;
               var17.aByte10828 = (byte)var0;
               if(client.aClass505_11204.method6094((byte)-22).method5614(var1, var2, 1202578293)) {
                  ++var17.aByte10828;
               }

               client.aClass505_11204.method6072(781822436).method6577(var0, var1, var2, var20, var17, 1385885247);
            }
         }
      }
   }

   static final void method7692(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2506 = Class615.method7280(var4, var2, -1210103032);
      var0.aBool2560 = true;
   }
}
