package com.jagex;

import com.jagex.Class222;
import com.jagex.Class388;
import com.jagex.Class484;
import com.jagex.Class499;
import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class595;
import com.jagex.Class67;
import com.jagex.Class679;
import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;

public class Class526_Sub40 extends Class526 {
   static final int anInt10733 = 23;
   static final int anInt10734 = 7;
   static final int anInt10735 = 2;
   static final int anInt10736 = 3;
   static final int anInt10737 = 22;
   static final int anInt10740 = 1;
   static final int anInt10742 = 3;
   static final int anInt10744 = 24;
   static final int anInt10745 = 6;
   static final int anInt10747 = 8;
   static final int anInt10748 = 9;
   static final int anInt10749 = 10;
   static final int anInt10750 = 11;
   static final int anInt10751 = 20;
   static final int anInt10752 = 21;
   static final int anInt10754 = 4;
   static final int anInt10755 = 4;
   static final int anInt10758 = 27;
   static final int anInt10759 = 5;
   static final int anInt10760 = 1;
   static final int anInt10761 = 7;
   static final int anInt10762 = 3;
   static final int anInt10764 = 5;
   static final int anInt10765 = 2;
   static final int anInt10768 = 2;
   static final int anInt10771 = 0;
   static final int anInt10772 = 26;
   public static final int anInt10773 = 0;
   static final int anInt10775 = 1;
   static final int anInt10782 = 4;
   static final int anInt10786 = 25;
   int[] anIntArray10753 = new int[3];
   int anInt10738;
   String aString10776;
   String aString10777;
   boolean aBool10739;
   String aString10778;
   String aString10779;
   String aString10784;
   int anInt10743;
   String aString10785;
   int anInt10746;
   String aString10788;
   int anInt10766;
   int anInt10767;
   int anInt10741;
   boolean aBool10769;
   int anInt10770;
   int anInt10763;
   public int anInt10774;
   int anInt10757;
   int anInt10756;
   int anInt10781;
   int anInt10783;
   int anInt10787;
   int anInt10780;

   public Class526_Sub40(boolean var1) {
      if(var1) {
         if(Class222.aString2308.startsWith("win")) {
            this.anInt10738 = -1441436147;
         } else if(Class222.aString2308.startsWith("mac")) {
            this.anInt10738 = 1412095002;
         } else if(Class222.aString2308.startsWith("linux")) {
            this.anInt10738 = -29341145;
         } else {
            this.anInt10738 = -1470777292;
         }

         if(!Class679.aString8601.startsWith("amd64") && !Class679.aString8601.startsWith("x86_64")) {
            this.aBool10739 = false;
         } else {
            this.aBool10739 = true;
         }

         if(1 == this.anInt10738 * 843550917) {
            if(Class570.aString7658.indexOf("4.0") != -1) {
               this.anInt10743 = 1060704409;
            } else if(Class570.aString7658.indexOf("4.1") != -1) {
               this.anInt10743 = 2121408818;
            } else if(Class570.aString7658.indexOf("4.9") != -1) {
               this.anInt10743 = -1112854069;
            } else if(Class570.aString7658.indexOf("5.0") != -1) {
               this.anInt10743 = -52149660;
            } else if(Class570.aString7658.indexOf("5.1") != -1) {
               this.anInt10743 = 1008554749;
            } else if(Class570.aString7658.indexOf("5.2") != -1) {
               this.anInt10743 = -104299320;
            } else if(Class570.aString7658.indexOf("6.0") != -1) {
               this.anInt10743 = 2069259158;
            } else if(Class570.aString7658.indexOf("6.1") != -1) {
               this.anInt10743 = -1165003729;
            } else if(Class570.aString7658.indexOf("6.2") != -1) {
               this.anInt10743 = 956405089;
            } else if(Class570.aString7658.indexOf("6.3") != -1) {
               this.anInt10743 = 2017109498;
            } else if(Class570.aString7658.indexOf("10.0") != -1) {
               this.anInt10743 = -1217153389;
            }
         } else if(this.anInt10738 * 843550917 == 2) {
            if(Class570.aString7658.indexOf("10.4") != -1) {
               this.anInt10743 = -260748300;
            } else if(Class570.aString7658.indexOf("10.5") != -1) {
               this.anInt10743 = 799956109;
            } else if(Class570.aString7658.indexOf("10.6") != -1) {
               this.anInt10743 = 1860660518;
            } else if(Class570.aString7658.indexOf("10.7") != -1) {
               this.anInt10743 = -1373602369;
            } else if(Class570.aString7658.indexOf("10.8") != -1) {
               this.anInt10743 = -312897960;
            } else if(Class570.aString7658.indexOf("10.9") != -1) {
               this.anInt10743 = 747806449;
            } else if(Class570.aString7658.indexOf("10.10") != -1) {
               this.anInt10743 = 1808510858;
            } else if(Class570.aString7658.indexOf("10.11") != -1) {
               this.anInt10743 = -1425752029;
            }
         }

         if(Class484.aString5485.toLowerCase().indexOf("sun") != -1) {
            this.anInt10746 = 1576909321;
         } else if(Class484.aString5485.toLowerCase().indexOf("microsoft") != -1) {
            this.anInt10746 = -1141148654;
         } else if(Class484.aString5485.toLowerCase().indexOf("apple") != -1) {
            this.anInt10746 = 435760667;
         } else if(Class484.aString5485.toLowerCase().indexOf("oracle") != -1) {
            this.anInt10746 = -705387987;
         } else {
            this.anInt10746 = 2012669988;
         }

         int var2 = 2;
         int var3 = 0;

         char var4;
         try {
            while(var2 < Class595.aString7849.length()) {
               var4 = Class595.aString7849.charAt(var2);
               if(var4 < 48 || var4 > 57) {
                  break;
               }

               var3 = var3 * 10 + (var4 - 48);
               ++var2;
            }
         } catch (Exception var18) {
            ;
         }

         this.anInt10766 = var3 * 1291783869;
         var2 = Class595.aString7849.indexOf(46, 2) + 1;
         var3 = 0;

         try {
            while(var2 < Class595.aString7849.length()) {
               var4 = Class595.aString7849.charAt(var2);
               if(var4 < 48 || var4 > 57) {
                  break;
               }

               var3 = 10 * var3 + (var4 - 48);
               ++var2;
            }
         } catch (Exception var17) {
            ;
         }

         this.anInt10767 = 1023231067 * var3;
         var2 = Class595.aString7849.indexOf(95, 4) + 1;
         var3 = 0;

         try {
            while(var2 < Class595.aString7849.length()) {
               var4 = Class595.aString7849.charAt(var2);
               if(var4 < 48 || var4 > 57) {
                  break;
               }

               var3 = var4 - 48 + var3 * 10;
               ++var2;
            }
         } catch (Exception var16) {
            ;
         }

         this.anInt10741 = var3 * 1720230613;
         this.aBool10769 = false;
         this.anInt10770 = Class499.anInt5628 * -1920957429;
         if(this.anInt10766 * -1853170539 > 3) {
            this.anInt10763 = Class499.anInt5629 * 1020635477;
         } else {
            this.anInt10763 = 0;
         }

         try {
            int[] var19 = HardwareInfo.getCPUInfo();
            if(var19 != null && var19.length == 3) {
               this.anInt10757 = 1464736243 * var19[0];
               this.anInt10756 = var19[1] * -664626963;
               this.anInt10774 = var19[2] * 277819327;
            }

            int[] var5 = HardwareInfo.getRawCPUInfo();
            int var7;
            int var9;
            int var10;
            int var11;
            if(var5 != null && 0 == var5.length % 5) {
               HashMap var6 = new HashMap();

               for(var7 = 0; var7 < var5.length / 5; ++var7) {
                  int var8 = var5[var7 * 5];
                  var9 = var5[5 * var7 + 1];
                  var10 = var5[2 + 5 * var7];
                  var11 = var5[5 * var7 + 3];
                  int var12 = var5[var7 * 5 + 4];
                  Class67 var13 = new Class67(var8, var9, var10, var11, var12);
                  var6.put(Integer.valueOf(var8), var13);
               }

               Class67 var21 = (Class67)var6.get(Integer.valueOf(0));
               if(var21 != null) {
                  RSByteBuffer var22 = new RSByteBuffer(13);
                  var22.method9613(-1719039593 * var21.anInt764, 1788986588);
                  var22.method9613(var21.anInt766 * 593774537, 748644285);
                  var22.method9613(var21.anInt762 * 338835953, 151834538);
                  var22.pos = 0;
                  this.aString10784 = var22.readString(1269343343);
               }

               Class67 var24 = (Class67)var6.get(Integer.valueOf(1));
               if(null != var24) {
                  this.anInt10781 = -1711956127 * var24.anInt763;
                  var9 = -1719039593 * var24.anInt764;
                  this.anInt10783 = (var9 >> 16 & 255) * -548010535;
                  this.anIntArray10753[0] = var24.anInt762 * 338835953;
                  this.anIntArray10753[1] = var24.anInt766 * 593774537;
               }

               Class67 var26 = (Class67)var6.get(Integer.valueOf(-2147483647));
               if(null != var26) {
                  this.anIntArray10753[2] = var26.anInt766 * 593774537;
               }

               RSByteBuffer var28 = new RSByteBuffer(49);

               for(var11 = -2147483646; var11 <= -2147483644; ++var11) {
                  Class67 var30 = (Class67)var6.get(Integer.valueOf(var11));
                  if(null != var30) {
                     var28.method9613(var30.anInt763 * 1594184929, 1314605147);
                     var28.method9613(var30.anInt764 * -1719039593, -709889733);
                     var28.method9613(338835953 * var30.anInt762, 1918664267);
                     var28.method9613(var30.anInt766 * 593774537, 1834986240);
                  }
               }

               var28.pos = 0;
               this.aString10785 = var28.readString(183818512);
            }

            String[][] var20 = HardwareInfo.getDXDiagDisplayDevicesProps();
            String var25;
            if(var20 != null && var20.length > 0 && var20[0] != null) {
               for(var7 = 0; var7 < var20[0].length; var7 += 2) {
                  if(var20[0][var7].equalsIgnoreCase("szDescription")) {
                     this.aString10776 = var20[0][1 + var7];
                  } else if(var20[0][var7].equalsIgnoreCase("szDriverDateEnglish")) {
                     var25 = var20[0][var7 + 1];

                     try {
                        var9 = var25.indexOf("/");
                        var10 = var25.indexOf("/", var9 + 1);
                        this.anInt10787 = Integer.parseInt(var25.substring(0, var9)) * -793814671;
                        this.anInt10780 = Integer.parseInt(var25.substring(var10 + 1, var25.indexOf(" ", var10))) * -864402921;
                     } catch (Exception var14) {
                        ;
                     }
                  }
               }
            }

            String[] var23 = HardwareInfo.getDXDiagSystemProps();
            if(null != var23) {
               var25 = "";
               String var27 = "";
               String var29 = "";

               for(var11 = 0; var11 < var23.length; var11 += 2) {
                  if(var23[var11].equalsIgnoreCase("dwDirectXVersionMajor")) {
                     var25 = var23[1 + var11];
                  } else if(var23[var11].equalsIgnoreCase("dwDirectXVersionMinor")) {
                     var27 = var23[1 + var11];
                  } else if(var23[var11].equalsIgnoreCase("dwDirectXVersionLetter")) {
                     var29 = var23[1 + var11];
                  }
               }

               this.aString10778 = var25 + "." + var27 + var29;
            }
         } catch (Throwable var15) {
            this.anInt10774 = 0;
         }
      }

      if(null == this.aString10776) {
         this.aString10776 = "";
      }

      if(null == this.aString10777) {
         this.aString10777 = "";
      }

      if(null == this.aString10778) {
         this.aString10778 = "";
      }

      if(this.aString10779 == null) {
         this.aString10779 = "";
      }

      if(this.aString10784 == null) {
         this.aString10784 = "";
      }

      if(this.aString10785 == null) {
         this.aString10785 = "";
      }

      if(null == this.aString10788) {
         this.aString10788 = "";
      }

      this.method9758(-1433169712);
   }

   void method9758(int var1) {
      if(this.aString10776.length() > 40) {
         this.aString10776 = this.aString10776.substring(0, 40);
      }

      if(this.aString10777.length() > 40) {
         this.aString10777 = this.aString10777.substring(0, 40);
      }

      if(this.aString10778.length() > 10) {
         this.aString10778 = this.aString10778.substring(0, 10);
      }

      if(this.aString10779.length() > 10) {
         this.aString10779 = this.aString10779.substring(0, 10);
      }

      if(this.aString10788.length() > 120) {
         this.aString10788 = this.aString10788.substring(0, 120);
      }

   }

   public void method9759(RSByteBuffer var1, byte var2) {
      var1.writeByte(7, 1903266236);
      var1.writeByte(843550917 * this.anInt10738, 1992827841);
      var1.writeByte(this.aBool10739?1:0, -527338913);
      var1.writeByte(this.anInt10743 * 1700545449, 161101023);
      var1.writeByte(1407841337 * this.anInt10746, -1656841853);
      var1.writeByte(-1853170539 * this.anInt10766, -1441603306);
      var1.writeByte(1171147731 * this.anInt10767, -1591589932);
      var1.writeByte(-1772517763 * this.anInt10741, -858003003);
      var1.writeByte(this.aBool10769?1:0, -2035784268);
      var1.writeShort(this.anInt10770 * -127387725, -805078716);
      var1.writeByte(this.anInt10763 * -613378207, 1010206414);
      var1.writeTriByte(-1274232769 * this.anInt10774, -1870781572);
      var1.writeShort(492799205 * this.anInt10756, -805078716);
      var1.method9617(this.aString10776, -723270850);
      var1.method9617(this.aString10777, 2100775287);
      var1.method9617(this.aString10778, 101442278);
      var1.method9617(this.aString10779, -1276669320);
      var1.writeByte(1759528849 * this.anInt10787, -472006119);
      var1.writeShort(this.anInt10780 * 1688540583, -805078716);
      var1.method9617(this.aString10784, 1707640481);
      var1.method9617(this.aString10785, 1612717690);
      var1.writeByte(-1346099397 * this.anInt10757, -666228249);
      var1.writeByte(this.anInt10783 * -1416484247, -1134614959);

      for(int var3 = 0; var3 < this.anIntArray10753.length; ++var3) {
         var1.writeInt(this.anIntArray10753[var3], -357564953);
      }

      var1.writeInt(1217865089 * this.anInt10781, -357564953);
      var1.method9617(this.aString10788, -404026724);
   }

   public void method9760(RSByteBuffer var1) {
      var1.writeByte(7, 355826396);
      var1.writeByte(843550917 * this.anInt10738, 1691515675);
      var1.writeByte(this.aBool10739?1:0, -468456798);
      var1.writeByte(this.anInt10743 * 1700545449, -584137984);
      var1.writeByte(1407841337 * this.anInt10746, -1520321421);
      var1.writeByte(-1853170539 * this.anInt10766, 835423908);
      var1.writeByte(1171147731 * this.anInt10767, 1384307441);
      var1.writeByte(-1772517763 * this.anInt10741, 1455189122);
      var1.writeByte(this.aBool10769?1:0, 179021580);
      var1.writeShort(this.anInt10770 * -127387725, -805078716);
      var1.writeByte(this.anInt10763 * -613378207, 1746170542);
      var1.writeTriByte(-1274232769 * this.anInt10774, -1936672272);
      var1.writeShort(492799205 * this.anInt10756, -805078716);
      var1.method9617(this.aString10776, -958318322);
      var1.method9617(this.aString10777, 1243651508);
      var1.method9617(this.aString10778, 1130905434);
      var1.method9617(this.aString10779, 1162051617);
      var1.writeByte(1759528849 * this.anInt10787, -334827571);
      var1.writeShort(this.anInt10780 * 1688540583, -805078716);
      var1.method9617(this.aString10784, 929078349);
      var1.method9617(this.aString10785, -380316157);
      var1.writeByte(-1346099397 * this.anInt10757, -1916075229);
      var1.writeByte(this.anInt10783 * -1416484247, 1514772270);

      for(int var2 = 0; var2 < this.anIntArray10753.length; ++var2) {
         var1.writeInt(this.anIntArray10753[var2], -357564953);
      }

      var1.writeInt(1217865089 * this.anInt10781, -357564953);
      var1.method9617(this.aString10788, -742958476);
   }

   void method9761() {
      if(this.aString10776.length() > 40) {
         this.aString10776 = this.aString10776.substring(0, 40);
      }

      if(this.aString10777.length() > 40) {
         this.aString10777 = this.aString10777.substring(0, 40);
      }

      if(this.aString10778.length() > 10) {
         this.aString10778 = this.aString10778.substring(0, 10);
      }

      if(this.aString10779.length() > 10) {
         this.aString10779 = this.aString10779.substring(0, 10);
      }

      if(this.aString10788.length() > 120) {
         this.aString10788 = this.aString10788.substring(0, 120);
      }

   }

   public void method9762(RSByteBuffer var1) {
      var1.writeByte(7, 1486497518);
      var1.writeByte(843550917 * this.anInt10738, -785476901);
      var1.writeByte(this.aBool10739?1:0, -334786252);
      var1.writeByte(this.anInt10743 * 1700545449, -1145036498);
      var1.writeByte(1407841337 * this.anInt10746, 1076469199);
      var1.writeByte(-1853170539 * this.anInt10766, -1294109039);
      var1.writeByte(1171147731 * this.anInt10767, 1928059626);
      var1.writeByte(-1772517763 * this.anInt10741, 1897632747);
      var1.writeByte(this.aBool10769?1:0, 1629916182);
      var1.writeShort(this.anInt10770 * -127387725, -805078716);
      var1.writeByte(this.anInt10763 * -613378207, -1567894903);
      var1.writeTriByte(-1274232769 * this.anInt10774, -1635290218);
      var1.writeShort(492799205 * this.anInt10756, -805078716);
      var1.method9617(this.aString10776, -1773176477);
      var1.method9617(this.aString10777, 757585721);
      var1.method9617(this.aString10778, -606180228);
      var1.method9617(this.aString10779, 731663276);
      var1.writeByte(1759528849 * this.anInt10787, -1677558889);
      var1.writeShort(this.anInt10780 * 1688540583, -805078716);
      var1.method9617(this.aString10784, -1220095106);
      var1.method9617(this.aString10785, 1384038775);
      var1.writeByte(-1346099397 * this.anInt10757, -15868421);
      var1.writeByte(this.anInt10783 * -1416484247, 1449038010);

      for(int var2 = 0; var2 < this.anIntArray10753.length; ++var2) {
         var1.writeInt(this.anIntArray10753[var2], -357564953);
      }

      var1.writeInt(1217865089 * this.anInt10781, -357564953);
      var1.method9617(this.aString10788, -915885406);
   }

   public int method9763(byte var1) {
      byte var2 = 38;
      int var3 = var2 + Class388.method4767(this.aString10776, 506706124);
      var3 += Class388.method4767(this.aString10777, -1161384935);
      var3 += Class388.method4767(this.aString10778, 710591830);
      var3 += Class388.method4767(this.aString10779, -1601937600);
      var3 += Class388.method4767(this.aString10784, -6483363);
      var3 += Class388.method4767(this.aString10785, -211972283);
      var3 += Class388.method4767(this.aString10788, -138374419);
      return var3;
   }

   public int method9764() {
      byte var1 = 38;
      int var2 = var1 + Class388.method4767(this.aString10776, -531991538);
      var2 += Class388.method4767(this.aString10777, 78313186);
      var2 += Class388.method4767(this.aString10778, -1718890805);
      var2 += Class388.method4767(this.aString10779, 93064554);
      var2 += Class388.method4767(this.aString10784, 1373428523);
      var2 += Class388.method4767(this.aString10785, 748535892);
      var2 += Class388.method4767(this.aString10788, 1295415326);
      return var2;
   }
}
