package com.jagex;

import com.jagex.Class153;
import com.jagex.Class163;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class17;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class19;
import com.jagex.Class192;
import com.jagex.Class20;
import com.jagex.Class200;
import com.jagex.Class433;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class45;
import com.jagex.Class510;
import com.jagex.Class526;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class537;
import com.jagex.Class592;
import com.jagex.Class613;
import com.jagex.Class633;
import com.jagex.Class643;
import com.jagex.Class673;
import com.jagex.Class692;
import com.jagex.Class704;
import com.jagex.Class83;
import com.jagex.Class9;
import com.jagex.Interface12;
import com.jagex.Interface14;
import java.util.Arrays;

public class Class11 implements Interface12 {
   public static final int anInt66 = 1;
   public static final int anInt67 = 2;
   public static final int anInt68 = 0;
   static final int anInt69 = 5;
   static final int anInt89 = 6;
   public static int anInt144;
   public static int anInt145;
   int anInt75;
   public String aString76 = "null";
   public int anInt84 = -2022481008;
   public int anInt90 = 0;
   public int anInt71 = 0;
   public int anInt141 = 0;
   public int anInt121 = 0;
   public int anInt116 = 0;
   public int anInt92 = -2035738291;
   public int anInt98 = -959628705;
   public int anInt99 = 985680679;
   public boolean aBool93 = false;
   public int anInt91 = -820694759;
   int anInt101 = -482404415;
   int anInt107 = -619497493;
   int anInt103 = -821317443;
   int anInt104 = 1399077843;
   public int anInt100 = -1303061205;
   short[] aShortArray77;
   short[] aShortArray78;
   short[] aShortArray80;
   short[] aShortArray85;
   byte[] aByteArray79;
   public int anInt117;
   public boolean aBool140 = false;
   public boolean aBool133 = false;
   byte[] aByteArray82;
   int anInt105 = -431197469;
   byte[] aByteArray83;
   int anInt106 = 1920753693;
   int anInt113 = -374413013;
   int anInt115 = 1576879767;
   int anInt81 = -1760763529;
   int anInt97 = -323846809;
   public int anInt95 = 1562389847;
   public int anInt87 = 0;
   public int anInt138 = 0;
   public int anInt120 = 1476473693;
   public int anInt86 = -1993936959;
   int anInt109 = 1068052864;
   int[] anIntArray119;
   int[] anIntArray118;
   int anInt128 = 1770526336;
   int anInt129 = -1575942528;
   int anInt130 = 0;
   int anInt131 = 0;
   public int anInt132 = 0;
   int anInt134 = 878791725;
   public int anInt122 = -209975231;
   int anInt74 = 0;
   int anInt102 = 0;
   int anInt111 = 0;
   int anInt127 = 0;
   int anInt110 = 0;
   int anInt112 = 0;
   public int[] anIntArray136;
   public int anInt137 = 0;
   int anInt114 = -733486543;
   public int anInt88 = 1666050441;
   int[] anIntArray96;
   int[] anIntArray65;
   public boolean aBool142 = false;
   public int anInt123 = -2099320245;
   public int anInt124 = 512248935;
   public int anInt126 = 0;
   String aString125 = "null";
   Class20 aClass20_135;
   public static short[] aShortArray70 = new short[256];
   static String aString108 = "</col>";
   public String[] aStringArray143;
   public String[] aStringArray94;
   int anInt73;
   Interface14 anInterface14_139;
   Class9 aClass9_72;

   void method581(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt75 = var1.readBigSmart((byte)-19) * 354238193;
      } else if(2 == var2) {
         this.aString76 = var1.readString(-1702998095);
      } else if(var2 == 4) {
         this.anInt84 = var1.readUnsignedShort(449435592) * 209442157;
      } else if(var2 == 5) {
         this.anInt90 = var1.readUnsignedShort(485505790) * 327768319;
      } else if(var2 == 6) {
         this.anInt71 = var1.readUnsignedShort(670314854) * -271953827;
      } else if(7 == var2) {
         this.anInt141 = var1.readUnsignedShort(86032302) * 524537267;
         if(56338811 * this.anInt141 > 32767) {
            this.anInt141 -= -843907072;
         }
      } else if(8 == var2) {
         this.anInt121 = var1.readUnsignedShort(262313965) * 32891111;
         if(-1116392745 * this.anInt121 > 32767) {
            this.anInt121 -= -521732096;
         }
      } else if(var2 == 11) {
         this.anInt116 = 1836873909;
      } else if(var2 == 12) {
         this.anInt92 = var1.readInt((byte)5) * -2035738291;
      } else if(13 == var2) {
         this.anInt98 = var1.readUnsignedByte(-103724497) * 959628705;
      } else if(var2 == 14) {
         this.anInt99 = var1.readUnsignedByte(-1230430692) * -985680679;
      } else if(16 == var2) {
         this.aBool93 = true;
      } else if(18 == var2) {
         this.anInt91 = var1.readUnsignedShort(971588258) * 820694759;
      } else if(23 == var2) {
         this.anInt101 = var1.readBigSmart((byte)-79) * 482404415;
      } else if(24 == var2) {
         this.anInt107 = var1.readBigSmart((byte)111) * 619497493;
      } else if(var2 == 25) {
         this.anInt103 = var1.readBigSmart((byte)-48) * 821317443;
      } else if(26 == var2) {
         this.anInt104 = var1.readBigSmart((byte)89) * -1399077843;
      } else if(var2 == 27) {
         this.anInt100 = var1.readUnsignedByte(-1022820769) * 1303061205;
      } else if(var2 >= 30 && var2 < 35) {
         this.aStringArray94[var2 - 30] = var1.readString(-1322223280);
      } else if(var2 >= 35 && var2 < 40) {
         this.aStringArray143[var2 - 35] = var1.readString(-1233239180);
      } else {
         int var3;
         int var4;
         if(40 == var2) {
            var3 = var1.readUnsignedByte(-37425468);
            this.aShortArray77 = new short[var3];
            this.aShortArray78 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aShortArray77[var4] = (short)var1.readUnsignedShort(187906602);
               this.aShortArray78[var4] = (short)var1.readUnsignedShort(626305516);
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte(2011048784);
            this.aShortArray80 = new short[var3];
            this.aShortArray85 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aShortArray80[var4] = (short)var1.readUnsignedShort(354517162);
               this.aShortArray85[var4] = (short)var1.readUnsignedShort(95289690);
            }
         } else if(var2 == 42) {
            var3 = var1.readUnsignedByte(703217476);
            this.aByteArray79 = new byte[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aByteArray79[var4] = var1.readByte((byte)114);
            }
         } else if(var2 == 43) {
            this.anInt117 = var1.readInt((byte)5) * 2128092929;
            this.aBool140 = true;
         } else {
            int var5;
            int var6;
            byte var8;
            if(var2 == 44) {
               var3 = var1.readUnsignedShort(1713789822);
               var4 = 0;

               for(var5 = var3; var5 > 0; var5 >>= 1) {
                  ++var4;
               }

               this.aByteArray82 = new byte[var4];
               var8 = 0;

               for(var6 = 0; var6 < var4; ++var6) {
                  if((var3 & 1 << var6) > 0) {
                     this.aByteArray82[var6] = var8++;
                  } else {
                     this.aByteArray82[var6] = -1;
                  }
               }
            } else if(var2 == 45) {
               var3 = var1.readUnsignedShort(295965741);
               var4 = 0;

               for(var5 = var3; var5 > 0; var5 >>= 1) {
                  ++var4;
               }

               this.aByteArray83 = new byte[var4];
               var8 = 0;

               for(var6 = 0; var6 < var4; ++var6) {
                  if((var3 & 1 << var6) > 0) {
                     this.aByteArray83[var6] = var8++;
                  } else {
                     this.aByteArray83[var6] = -1;
                  }
               }
            } else if(65 == var2) {
               this.aBool133 = true;
            } else if(78 == var2) {
               this.anInt105 = var1.readBigSmart((byte)-100) * 431197469;
            } else if(var2 == 79) {
               this.anInt106 = var1.readBigSmart((byte)1) * -1920753693;
            } else if(var2 == 90) {
               this.anInt113 = var1.readBigSmart((byte)-3) * 374413013;
            } else if(var2 == 91) {
               this.anInt115 = var1.readBigSmart((byte)-1) * -1576879767;
            } else if(var2 == 92) {
               this.anInt81 = var1.readBigSmart((byte)6) * 1760763529;
            } else if(93 == var2) {
               this.anInt97 = var1.readBigSmart((byte)-12) * 323846809;
            } else if(var2 == 94) {
               this.anInt95 = var1.readUnsignedShort(1713956882) * -1562389847;
            } else if(95 == var2) {
               this.anInt87 = var1.readUnsignedShort(41372366) * -73963663;
            } else if(96 == var2) {
               this.anInt138 = var1.readUnsignedByte(-986608095) * 30170199;
            } else if(var2 == 97) {
               this.anInt120 = var1.readUnsignedShort(701614965) * -1476473693;
            } else if(var2 == 98) {
               this.anInt86 = var1.readUnsignedShort(1240176586) * 1993936959;
            } else if(var2 >= 100 && var2 < 110) {
               if(this.anIntArray119 == null) {
                  this.anIntArray119 = new int[10];
                  this.anIntArray118 = new int[10];
               }

               this.anIntArray119[var2 - 100] = var1.readUnsignedShort(950525129);
               this.anIntArray118[var2 - 100] = var1.readUnsignedShort(643678676);
            } else if(var2 == 110) {
               this.anInt109 = var1.readUnsignedShort(1456988539) * 1988055651;
            } else if(var2 == 111) {
               this.anInt128 = var1.readUnsignedShort(529451718) * 1288900653;
            } else if(var2 == 112) {
               this.anInt129 = var1.readUnsignedShort(1061118749) * 994320909;
            } else if(var2 == 113) {
               this.anInt130 = var1.readByte((byte)95) * 1360175599;
            } else if(var2 == 114) {
               this.anInt131 = var1.readByte((byte)17) * 1832859519;
            } else if(var2 == 115) {
               this.anInt132 = var1.readUnsignedByte(-1627404198) * -1124257223;
            } else if(121 == var2) {
               this.anInt134 = var1.readUnsignedShort(1463692016) * -878791725;
            } else if(var2 == 122) {
               this.anInt122 = var1.readUnsignedShort(381406018) * 209975231;
            } else if(125 == var2) {
               this.anInt74 = (var1.readByte((byte)40) << 2) * 17091139;
               this.anInt102 = (var1.readByte((byte)45) << 2) * -1543586929;
               this.anInt111 = (var1.readByte((byte)67) << 2) * 66946685;
            } else if(var2 == 126) {
               this.anInt127 = (var1.readByte((byte)77) << 2) * 1289699803;
               this.anInt110 = (var1.readByte((byte)28) << 2) * -911827491;
               this.anInt112 = (var1.readByte((byte)74) << 2) * -1414814919;
            } else if(var2 != 127 && 128 != var2 && 129 != var2 && 130 != var2) {
               if(132 == var2) {
                  var3 = var1.readUnsignedByte(1448727736);
                  this.anIntArray136 = new int[var3];

                  for(var4 = 0; var4 < var3; ++var4) {
                     this.anIntArray136[var4] = var1.readUnsignedShort(373561114);
                  }
               } else if(134 == var2) {
                  this.anInt137 = var1.readUnsignedByte(701782230) * -10839459;
               } else if(var2 == 139) {
                  this.anInt114 = var1.readUnsignedShort(1519263429) * 733486543;
               } else if(140 == var2) {
                  this.anInt88 = var1.readUnsignedShort(1207894015) * -1666050441;
               } else if(var2 >= 142 && var2 < 147) {
                  if(this.anIntArray96 == null) {
                     this.anIntArray96 = new int[6];
                     Arrays.fill(this.anIntArray96, -1);
                  }

                  this.anIntArray96[var2 - 142] = var1.readUnsignedShort(451114320);
               } else if(var2 >= 150 && var2 < 155) {
                  if(this.anIntArray65 == null) {
                     this.anIntArray65 = new int[5];
                     Arrays.fill(this.anIntArray65, -1);
                  }

                  this.anIntArray65[var2 - 150] = var1.readUnsignedShort(507108648);
               } else if(156 != var2) {
                  if(157 == var2) {
                     this.aBool142 = true;
                  } else if(var2 == 161) {
                     this.anInt123 = var1.readUnsignedShort(2069309738) * 2099320245;
                  } else if(var2 == 162) {
                     this.anInt124 = var1.readUnsignedShort(760916801) * -512248935;
                  } else if(var2 == 163) {
                     this.anInt126 = var1.readUnsignedShort(1523653155) * -1868400551;
                  } else if(164 == var2) {
                     this.aString125 = var1.readString(360055711);
                  } else if(var2 == 165) {
                     this.anInt116 = -621219478;
                  } else if(249 == var2) {
                     var3 = var1.readUnsignedByte(-81277167);
                     if(null == this.aClass20_135) {
                        var4 = Class692.method8110(var3, -1087938277);
                        this.aClass20_135 = new Class20(var4);
                     }

                     for(var4 = 0; var4 < var3; ++var4) {
                        boolean var9 = var1.readUnsignedByte(-1746205277) == 1;
                        var6 = var1.read24BitInt(742041327);
                        Object var7;
                        if(var9) {
                           var7 = new LinkableObject(var1.readString(-126046584));
                        } else {
                           var7 = new Class526_Sub25(var1.readInt((byte)5));
                        }

                        this.aClass20_135.put((Class526)var7, (long)var6);
                     }
                  }
               }
            } else {
               var1.readUnsignedByte(-81629640);
               var1.readUnsignedShort(344482383);
            }
         }
      }

   }

   void method582(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt75 = var1.readBigSmart((byte)1) * 354238193;
      } else if(2 == var2) {
         this.aString76 = var1.readString(-1198887228);
      } else if(var2 == 4) {
         this.anInt84 = var1.readUnsignedShort(300288031) * 209442157;
      } else if(var2 == 5) {
         this.anInt90 = var1.readUnsignedShort(1003380581) * 327768319;
      } else if(var2 == 6) {
         this.anInt71 = var1.readUnsignedShort(56694632) * -271953827;
      } else if(7 == var2) {
         this.anInt141 = var1.readUnsignedShort(473640553) * 524537267;
         if(56338811 * this.anInt141 > 32767) {
            this.anInt141 -= -843907072;
         }
      } else if(8 == var2) {
         this.anInt121 = var1.readUnsignedShort(1067143934) * 32891111;
         if(-1116392745 * this.anInt121 > 32767) {
            this.anInt121 -= -521732096;
         }
      } else if(var2 == 11) {
         this.anInt116 = 1836873909;
      } else if(var2 == 12) {
         this.anInt92 = var1.readInt((byte)5) * -2035738291;
      } else if(13 == var2) {
         this.anInt98 = var1.readUnsignedByte(-402781125) * 959628705;
      } else if(var2 == 14) {
         this.anInt99 = var1.readUnsignedByte(-1834929541) * -985680679;
      } else if(16 == var2) {
         this.aBool93 = true;
      } else if(18 == var2) {
         this.anInt91 = var1.readUnsignedShort(685281162) * 820694759;
      } else if(23 == var2) {
         this.anInt101 = var1.readBigSmart((byte)-104) * 482404415;
      } else if(24 == var2) {
         this.anInt107 = var1.readBigSmart((byte)-34) * 619497493;
      } else if(var2 == 25) {
         this.anInt103 = var1.readBigSmart((byte)-71) * 821317443;
      } else if(26 == var2) {
         this.anInt104 = var1.readBigSmart((byte)65) * -1399077843;
      } else if(var2 == 27) {
         this.anInt100 = var1.readUnsignedByte(-327599915) * 1303061205;
      } else if(var2 >= 30 && var2 < 35) {
         this.aStringArray94[var2 - 30] = var1.readString(1906366208);
      } else if(var2 >= 35 && var2 < 40) {
         this.aStringArray143[var2 - 35] = var1.readString(530830042);
      } else {
         int var4;
         int var5;
         if(40 == var2) {
            var4 = var1.readUnsignedByte(489653953);
            this.aShortArray77 = new short[var4];
            this.aShortArray78 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray77[var5] = (short)var1.readUnsignedShort(1307296039);
               this.aShortArray78[var5] = (short)var1.readUnsignedShort(1363035305);
            }
         } else if(var2 == 41) {
            var4 = var1.readUnsignedByte(556136361);
            this.aShortArray80 = new short[var4];
            this.aShortArray85 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray80[var5] = (short)var1.readUnsignedShort(768989586);
               this.aShortArray85[var5] = (short)var1.readUnsignedShort(2125449544);
            }
         } else if(var2 == 42) {
            var4 = var1.readUnsignedByte(2142469814);
            this.aByteArray79 = new byte[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aByteArray79[var5] = var1.readByte((byte)116);
            }
         } else if(var2 == 43) {
            this.anInt117 = var1.readInt((byte)5) * 2128092929;
            this.aBool140 = true;
         } else {
            int var6;
            int var7;
            byte var9;
            if(var2 == 44) {
               var4 = var1.readUnsignedShort(1955902115);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray82 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray82[var7] = var9++;
                  } else {
                     this.aByteArray82[var7] = -1;
                  }
               }
            } else if(var2 == 45) {
               var4 = var1.readUnsignedShort(572928354);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray83 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray83[var7] = var9++;
                  } else {
                     this.aByteArray83[var7] = -1;
                  }
               }
            } else if(65 == var2) {
               this.aBool133 = true;
            } else if(78 == var2) {
               this.anInt105 = var1.readBigSmart((byte)64) * 431197469;
            } else if(var2 == 79) {
               this.anInt106 = var1.readBigSmart((byte)-118) * -1920753693;
            } else if(var2 == 90) {
               this.anInt113 = var1.readBigSmart((byte)13) * 374413013;
            } else if(var2 == 91) {
               this.anInt115 = var1.readBigSmart((byte)-14) * -1576879767;
            } else if(var2 == 92) {
               this.anInt81 = var1.readBigSmart((byte)-39) * 1760763529;
            } else if(93 == var2) {
               this.anInt97 = var1.readBigSmart((byte)3) * 323846809;
            } else if(var2 == 94) {
               this.anInt95 = var1.readUnsignedShort(335961724) * -1562389847;
            } else if(95 == var2) {
               this.anInt87 = var1.readUnsignedShort(861058437) * -73963663;
            } else if(96 == var2) {
               this.anInt138 = var1.readUnsignedByte(1691948081) * 30170199;
            } else if(var2 == 97) {
               this.anInt120 = var1.readUnsignedShort(628355925) * -1476473693;
            } else if(var2 == 98) {
               this.anInt86 = var1.readUnsignedShort(72324122) * 1993936959;
            } else if(var2 >= 100 && var2 < 110) {
               if(this.anIntArray119 == null) {
                  this.anIntArray119 = new int[10];
                  this.anIntArray118 = new int[10];
               }

               this.anIntArray119[var2 - 100] = var1.readUnsignedShort(2108796661);
               this.anIntArray118[var2 - 100] = var1.readUnsignedShort(1681145188);
            } else if(var2 == 110) {
               this.anInt109 = var1.readUnsignedShort(1267608810) * 1988055651;
            } else if(var2 == 111) {
               this.anInt128 = var1.readUnsignedShort(1854355860) * 1288900653;
            } else if(var2 == 112) {
               this.anInt129 = var1.readUnsignedShort(1279999664) * 994320909;
            } else if(var2 == 113) {
               this.anInt130 = var1.readByte((byte)93) * 1360175599;
            } else if(var2 == 114) {
               this.anInt131 = var1.readByte((byte)22) * 1832859519;
            } else if(var2 == 115) {
               this.anInt132 = var1.readUnsignedByte(665665337) * -1124257223;
            } else if(121 == var2) {
               this.anInt134 = var1.readUnsignedShort(2075144510) * -878791725;
            } else if(var2 == 122) {
               this.anInt122 = var1.readUnsignedShort(726119884) * 209975231;
            } else if(125 == var2) {
               this.anInt74 = (var1.readByte((byte)57) << 2) * 17091139;
               this.anInt102 = (var1.readByte((byte)53) << 2) * -1543586929;
               this.anInt111 = (var1.readByte((byte)94) << 2) * 66946685;
            } else if(var2 == 126) {
               this.anInt127 = (var1.readByte((byte)24) << 2) * 1289699803;
               this.anInt110 = (var1.readByte((byte)95) << 2) * -911827491;
               this.anInt112 = (var1.readByte((byte)61) << 2) * -1414814919;
            } else if(var2 != 127 && 128 != var2 && 129 != var2 && 130 != var2) {
               if(132 == var2) {
                  var4 = var1.readUnsignedByte(-478244222);
                  this.anIntArray136 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.anIntArray136[var5] = var1.readUnsignedShort(2138587951);
                  }
               } else if(134 == var2) {
                  this.anInt137 = var1.readUnsignedByte(713815420) * -10839459;
               } else if(var2 == 139) {
                  this.anInt114 = var1.readUnsignedShort(1973715700) * 733486543;
               } else if(140 == var2) {
                  this.anInt88 = var1.readUnsignedShort(465173613) * -1666050441;
               } else if(var2 >= 142 && var2 < 147) {
                  if(this.anIntArray96 == null) {
                     this.anIntArray96 = new int[6];
                     Arrays.fill(this.anIntArray96, -1);
                  }

                  this.anIntArray96[var2 - 142] = var1.readUnsignedShort(1179719006);
               } else if(var2 >= 150 && var2 < 155) {
                  if(this.anIntArray65 == null) {
                     this.anIntArray65 = new int[5];
                     Arrays.fill(this.anIntArray65, -1);
                  }

                  this.anIntArray65[var2 - 150] = var1.readUnsignedShort(925150987);
               } else if(156 != var2) {
                  if(157 == var2) {
                     this.aBool142 = true;
                  } else if(var2 == 161) {
                     this.anInt123 = var1.readUnsignedShort(358231559) * 2099320245;
                  } else if(var2 == 162) {
                     this.anInt124 = var1.readUnsignedShort(1984980326) * -512248935;
                  } else if(var2 == 163) {
                     this.anInt126 = var1.readUnsignedShort(1333146408) * -1868400551;
                  } else if(164 == var2) {
                     this.aString125 = var1.readString(-1522153869);
                  } else if(var2 == 165) {
                     this.anInt116 = -621219478;
                  } else if(249 == var2) {
                     var4 = var1.readUnsignedByte(1999455409);
                     if(null == this.aClass20_135) {
                        var5 = Class692.method8110(var4, -978199900);
                        this.aClass20_135 = new Class20(var5);
                     }

                     for(var5 = 0; var5 < var4; ++var5) {
                        boolean var10 = var1.readUnsignedByte(477353382) == 1;
                        var7 = var1.read24BitInt(742041327);
                        Object var8;
                        if(var10) {
                           var8 = new LinkableObject(var1.readString(556908812));
                        } else {
                           var8 = new Class526_Sub25(var1.readInt((byte)5));
                        }

                        this.aClass20_135.put((Class526)var8, (long)var7);
                     }
                  }
               }
            } else {
               var1.readUnsignedByte(-213360812);
               var1.readUnsignedShort(471937587);
            }
         }
      }

   }

   void method583(Class17 var1, Class11 var2, Class11 var3, Class45 var4, Class673 var5, int var6) {
      this.anInt75 = 1 * var2.anInt75;
      this.anInt84 = var2.anInt84 * 1;
      this.anInt90 = var2.anInt90 * 1;
      this.anInt71 = 1 * var2.anInt71;
      this.anInt87 = var2.anInt87 * 1;
      this.anInt141 = 1 * var2.anInt141;
      this.anInt121 = 1 * var2.anInt121;
      Class11 var7 = Class17.aClass17_182 == var1?var2:var3;
      this.aShortArray77 = var7.aShortArray77;
      this.aShortArray78 = var7.aShortArray78;
      this.aByteArray79 = var7.aByteArray79;
      this.aShortArray80 = var7.aShortArray80;
      this.aShortArray85 = var7.aShortArray85;
      this.aString76 = var3.aString76;
      this.aBool93 = var3.aBool93;
      if(Class17.aClass17_182 == var1) {
         this.anInt92 = 1 * var3.anInt92;
         this.anInt116 = 1836873909;
      } else if(Class17.aClass17_183 == var1) {
         this.aString76 = var3.aString125;
         this.anInt92 = (int)Math.floor((double)(1340589957 * var3.anInt92 / (-247115799 * var3.anInt126))) * -2035738291;
         this.anInt116 = 1836873909;
         this.aBool133 = var3.aBool133;
         this.anInt95 = 1 * var2.anInt95;
         this.anIntArray96 = var2.anIntArray96;
         this.anIntArray65 = var2.anIntArray65;
         this.aStringArray143 = new String[5];
         this.aStringArray143[0] = Class45.aClass45_474.method920(var5, -827840379);
         this.aStringArray143[4] = var4.method920(var5, -827840379);
      } else {
         this.anInt92 = 0;
         this.anInt116 = 1 * var3.anInt116;
         this.anInt98 = var3.anInt98 * 1;
         this.anInt99 = 1 * var3.anInt99;
         this.anInt100 = 1 * var3.anInt100;
         this.anInt101 = 1 * var3.anInt101;
         this.anInt107 = var3.anInt107 * 1;
         this.anInt105 = var3.anInt105 * 1;
         this.anInt103 = 1 * var3.anInt103;
         this.anInt104 = var3.anInt104 * 1;
         this.anInt106 = var3.anInt106 * 1;
         this.anInt74 = var3.anInt74 * 1;
         this.anInt127 = 1 * var3.anInt127;
         this.anInt102 = var3.anInt102 * 1;
         this.anInt110 = var3.anInt110 * 1;
         this.anInt111 = var3.anInt111 * 1;
         this.anInt112 = var3.anInt112 * 1;
         this.anInt113 = 1 * var3.anInt113;
         this.anInt81 = 1 * var3.anInt81;
         this.anInt115 = var3.anInt115 * 1;
         this.anInt97 = var3.anInt97 * 1;
         this.anInt95 = var3.anInt95 * 1;
         this.anInt132 = var3.anInt132 * 1;
         this.aStringArray94 = var3.aStringArray94;
         this.aClass20_135 = var3.aClass20_135;
         this.aStringArray143 = new String[5];
         if(null != var3.aStringArray143) {
            for(int var8 = 0; var8 < 4; ++var8) {
               this.aStringArray143[var8] = var3.aStringArray143[var8];
            }
         }

         this.aStringArray143[4] = var4.method920(var5, -827840379);
      }
   }

   public final boolean method584(boolean var1, Class19 var2, int var3) {
      int var4;
      int var5;
      int var6;
      if(var1) {
         if(null != var2 && null != var2.anIntArray189) {
            var4 = var2.anIntArray189[0];
            var5 = var2.anIntArray189[1];
            var6 = var2.anIntArray189[2];
         } else {
            var4 = -604097173 * this.anInt103;
            var5 = -2120012891 * this.anInt104;
            var6 = this.anInt106 * -490299957;
         }
      } else if(var2 != null && null != var2.anIntArray186) {
         var4 = var2.anIntArray186[0];
         var5 = var2.anIntArray186[1];
         var6 = var2.anIntArray186[2];
      } else {
         var4 = 336005055 * this.anInt101;
         var5 = this.anInt107 * -354629827;
         var6 = this.anInt105 * -1541563083;
      }

      if(-1 == var4) {
         return true;
      } else {
         boolean var7 = true;
         if(!this.aClass9_72.aClass466_48.method5530(var4, 0, 1517915844)) {
            var7 = false;
         }

         if(var5 != -1 && !this.aClass9_72.aClass466_48.method5530(var5, 0, 1633407866)) {
            var7 = false;
         }

         if(-1 != var6 && !this.aClass9_72.aClass466_48.method5530(var6, 0, 1602326173)) {
            var7 = false;
         }

         return var7;
      }
   }

   void method585(Class11 var1, Class11 var2, Class673 var3, short var4) {
      this.method583(Class17.aClass17_180, var1, var2, Class45.aClass45_503, var3, -239211606);
   }

   void method586(Class11 var1, Class11 var2, Class673 var3, byte var4) {
      this.method583(Class17.aClass17_183, var1, var2, Class45.aClass45_476, var3, 106258719);
   }

   public final Class168 method587(Class174 var1, int var2, int var3, Class633 var4, Class704 var5, int var6, int var7, int var8, int var9, byte var10) {
      int var11;
      if(this.anIntArray119 != null && var3 > 1) {
         var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if(var3 >= this.anIntArray118[var12] && 0 != this.anIntArray118[var12]) {
               var11 = this.anIntArray119[var12];
            }
         }

         if(-1 != var11) {
            return ((Class11)this.anInterface14_139.method89(var11, -1194684950)).method587(var1, var2, 1, var4, var5, var6, var7, var8, var9, (byte)89);
         }
      }

      var11 = var2;
      if(null != var5) {
         var11 = var2 | var5.method8221((byte)25);
      }

      Class192 var13 = this.aClass9_72.aClass192_49;
      Class168 var20;
      synchronized(var13) {
         var20 = (Class168)this.aClass9_72.aClass192_49.method2765((long)(this.anInt73 * 2082231759 | var1.anInt2030 * -316183255 << 29));
      }

      if(var20 == null || var1.method2464(var20.method2101(), var11) != 0) {
         if(var20 != null) {
            var11 = var1.method2533(var11, var20.method2101());
         }

         int var21 = var11;
         if(null != this.aShortArray80) {
            var21 = var11 | '\u8000';
         }

         if(this.aShortArray77 != null || null != var4) {
            var21 |= 16384;
         }

         if(-1001799861 * this.anInt109 != 128) {
            var21 |= 1;
         }

         if(128 != -1197883483 * this.anInt128) {
            var21 |= 2;
         }

         if(128 != this.anInt129 * -1258160955) {
            var21 |= 4;
         }

         Class170 var14 = Class170.method2146(this.aClass9_72.aClass466_48, this.anInt75 * 1518334481, 0);
         if(var14 == null) {
            return null;
         }

         if(var14.anInt1942 < 13) {
            var14.method2148(2);
         }

         var20 = var1.method2321(var14, var21, 2082688831 * this.aClass9_72.anInt46, this.anInt130 * 1361489167 + 64, -1959089541 * this.anInt131 + 850);
         if(-1001799861 * this.anInt109 != 128 || 128 != -1197883483 * this.anInt128 || this.anInt129 * -1258160955 != 128) {
            var20.method1957(this.anInt109 * -1001799861, this.anInt128 * -1197883483, -1258160955 * this.anInt129);
         }

         int var15;
         if(null != this.aShortArray77) {
            for(var15 = 0; var15 < this.aShortArray77.length; ++var15) {
               if(this.aByteArray79 != null && var15 < this.aByteArray79.length) {
                  var20.method1940(this.aShortArray77[var15], aShortArray70[this.aByteArray79[var15] & 255]);
               } else {
                  var20.method1940(this.aShortArray77[var15], this.aShortArray78[var15]);
               }
            }
         }

         if(null != this.aShortArray80) {
            for(var15 = 0; var15 < this.aShortArray80.length; ++var15) {
               var20.method1992(this.aShortArray80[var15], this.aShortArray85[var15]);
            }
         }

         if(null != var4) {
            var15 = 0;

            label131:
            while(true) {
               int var16;
               if(var15 >= 10) {
                  var15 = 0;

                  while(true) {
                     if(var15 >= 10) {
                        break label131;
                     }

                     for(var16 = 0; var16 < Class643.aShortArrayArray8430[var15].length; ++var16) {
                        if(var4.anIntArray8250[var15] < Class537.aShortArrayArrayArray7205[var15][var16].length) {
                           var20.method1992(Class643.aShortArrayArray8430[var15][var16], Class537.aShortArrayArrayArray7205[var15][var16][var4.anIntArray8250[var15]]);
                        }
                     }

                     ++var15;
                  }
               }

               for(var16 = 0; var16 < Class200.aShortArrayArray2206[var15].length; ++var16) {
                  if(var4.anIntArray8245[var15] < Class510.aShortArrayArrayArray6984[var15][var16].length) {
                     var20.method1940(Class200.aShortArrayArray2206[var15][var16], Class510.aShortArrayArrayArray6984[var15][var16][var4.anIntArray8245[var15]]);
                  }
               }

               ++var15;
            }
         }

         var20.method2110(var11);
         Class192 var22 = this.aClass9_72.aClass192_49;
         synchronized(var22) {
            this.aClass9_72.aClass192_49.method2768(var20, (long)(this.anInt73 * 2082231759 | -316183255 * var1.anInt2030 << 29));
         }
      }

      if(null != var5 || var9 != 0) {
         var20 = var20.method1947((byte)1, var11, true);
         if(null != var5) {
            var5.method8231(var20, 0, 1178148368);
         }

         if(0 != var9) {
            var20.method2020(var6, var7, var8, var9);
         }
      }

      var20.method2110(var2);
      return var20;
   }

   public Class11 method588(int var1, int var2) {
      if(null != this.anIntArray119 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if(var1 >= this.anIntArray118[var4] && this.anIntArray118[var4] != 0) {
               var3 = this.anIntArray119[var4];
            }
         }

         if(var3 != -1) {
            return (Class11)this.anInterface14_139.method89(var3, -415101926);
         }
      }

      return this;
   }

   int[] method589(Class174 var1, Class174 var2, int var3, int var4, int var5, boolean var6, int var7, Class163 var8, Class633 var9, Class613 var10, byte var11) {
      Class170 var12 = Class170.method2146(this.aClass9_72.aClass466_48, 1518334481 * this.anInt75, 0);
      if(var12 == null) {
         return null;
      } else {
         if(var12.anInt1942 < 13) {
            var12.method2148(2);
         }

         int var13;
         if(this.aShortArray77 != null) {
            for(var13 = 0; var13 < this.aShortArray77.length; ++var13) {
               if(null != this.aByteArray79 && var13 < this.aByteArray79.length) {
                  var12.method2138(this.aShortArray77[var13], aShortArray70[this.aByteArray79[var13] & 255]);
               } else {
                  var12.method2138(this.aShortArray77[var13], this.aShortArray78[var13]);
               }
            }
         }

         if(null != this.aShortArray80) {
            for(var13 = 0; var13 < this.aShortArray80.length; ++var13) {
               var12.method2139(this.aShortArray80[var13], this.aShortArray85[var13]);
            }
         }

         if(null != var9) {
            int var14;
            for(var13 = 0; var13 < 10; ++var13) {
               for(var14 = 0; var14 < Class200.aShortArrayArray2206[var13].length; ++var14) {
                  if(var9.anIntArray8245[var13] < Class510.aShortArrayArrayArray6984[var13][var14].length) {
                     var12.method2138(Class200.aShortArrayArray2206[var13][var14], Class510.aShortArrayArrayArray6984[var13][var14][var9.anIntArray8245[var13]]);
                  }
               }
            }

            for(var13 = 0; var13 < 10; ++var13) {
               for(var14 = 0; var14 < Class643.aShortArrayArray8430[var13].length; ++var14) {
                  if(var9.anIntArray8250[var13] < Class537.aShortArrayArrayArray7205[var13][var14].length) {
                     var12.method2139(Class643.aShortArrayArray8430[var13][var14], Class537.aShortArrayArrayArray7205[var13][var14][var9.anIntArray8250[var13]]);
                  }
               }
            }
         }

         var13 = 2048;
         boolean var24 = false;
         if(this.anInt109 * -1001799861 != 128 || this.anInt128 * -1197883483 != 128 || -1258160955 * this.anInt129 != 128) {
            var24 = true;
            var13 |= 7;
         }

         Class168 var15 = var1.method2321(var12, var13, 64, 1361489167 * this.anInt130 + 64, 768 + this.anInt131 * -1959089541);
         if(!var15.method1994()) {
            return null;
         } else {
            if(var24) {
               var15.method1957(-1001799861 * this.anInt109, -1197883483 * this.anInt128, this.anInt129 * -1258160955);
            }

            Class153 var16 = null;
            if(1201332159 * this.anInt86 != -1) {
               var16 = this.aClass9_72.method562(var1, var2, this.anInt120 * 1447315211, 10, 1, 0, true, true, 0, var8, var9, var10, this.anInterface14_139, (byte)-29);
               if(var16 == null) {
                  return null;
               }
            } else if(-1 != -1514407873 * this.anInt122) {
               var16 = this.aClass9_72.method562(var1, var2, this.anInt134 * 2106137691, var3, var4, var5, false, true, 0, var8, var9, var10, this.anInterface14_139, (byte)-33);
               if(var16 == null) {
                  return null;
               }
            } else if(-1 != this.anInt88 * 1235395399) {
               var16 = this.aClass9_72.method562(var1, var2, this.anInt114 * -817510097, var3, var4, var5, false, true, 0, var8, var9, var10, this.anInterface14_139, (byte)-101);
               if(null == var16) {
                  return null;
               }
            } else if(this.anInt124 * 2102653097 != -1) {
               var16 = this.aClass9_72.method562(var1, var2, 2121068701 * this.anInt123, 10, 1, 0, true, true, 0, var8, var9, var10, this.anInterface14_139, (byte)-86);
               if(null == var16) {
                  return null;
               }
            }

            int var17;
            if(var6) {
               var17 = (int)(1.5D * (double)(1347714149 * this.anInt84)) << 2;
            } else if(var4 == 2) {
               var17 = (int)(1.04D * (double)(this.anInt84 * 1347714149)) << 2;
            } else {
               var17 = 1347714149 * this.anInt84 << 2;
            }

            Class433 var18 = var1.method2330();
            Class433 var19 = var1.method2318();
            var19.method5096(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float)var1.method2247((byte)6).method2691(), (float)var1.method2247((byte)6).method2693());
            var1.method2231(var19);
            var1.method2573(0, 0, var1.method2247((byte)6).method2691(), var1.method2247((byte)6).method2693());
            Class445 var20 = new Class445();
            var1.method2326(var20);
            var1.method2331(0.95F + (float)(Math.random() / 10.0D));
            var1.method2364(16777215, 0.95F + (float)(Math.random() / 10.0D), 0.95F + (float)(Math.random() / 10.0D), -50.0F, -10.0F, -50.0F);
            Class445 var21 = var1.method2319();
            var21.method5225(0.0F, 0.0F, 1.0F, Class443.method5200(-(this.anInt87 * 469399953) << 3));
            var21.method5237(0.0F, 1.0F, 0.0F, Class443.method5200(this.anInt71 * 791675893 << 3));
            var21.method5251((float)(this.anInt141 * 56338811 << 2), (float)((Class443.anIntArray4895[-1031428353 * this.anInt90 << 3] * var17 >> 14) - var15.method1981() / 2 + (-1116392745 * this.anInt121 << 2)), (float)((-1116392745 * this.anInt121 << 2) + (Class443.anIntArray4896[-1031428353 * this.anInt90 << 3] * var17 >> 14)));
            var21.method5237(1.0F, 0.0F, 0.0F, Class443.method5200(this.anInt90 * -1031428353 << 3));
            var1.method2538(0, 0, 36, 32);
            var1.method2283(2, 0);
            var1.method2290(0, 0, 36, 32, 0, 0);
            var1.method2333(0, -1, 0);
            var15.method1974(var21, (Class164)null, 1);
            var1.method2231(var18);
            int[] var22 = var1.method2479(0, 0, 36, 32);
            if(var4 >= 1) {
               var22 = this.method590(var22, -16777214, 1709757317);
               if(var4 >= 2) {
                  var22 = this.method590(var22, -1, 274452902);
               }
            }

            if(0 != var5) {
               this.method591(var22, var5, 1873053904);
            }

            if(-1 != this.anInt122 * -1514407873) {
               var16.method1778(0, 0);
            } else if(this.anInt88 * 1235395399 != -1) {
               var16.method1778(0, 0);
            }

            var1.method2515(var22, 0, 36, 36, 32, (byte)3).method1778(0, 0);
            if(-1 != this.anInt86 * 1201332159) {
               var16.method1778(0, 0);
            }

            if(2102653097 * this.anInt124 != -1) {
               var16.method1778(0, 0);
            }

            if(1 == var7 || 2 == var7 && (1 == 1095415197 * this.anInt116 || 1 != var3) && -1 != var3) {
               var8.method1895(Class592.method7025(var3, this.aClass9_72.aClass673_50, var10, 1861315691), 0, 9, -256, -16777215, 1035237901);
            }

            var22 = var1.method2479(0, 0, 36, 32);

            for(int var23 = 0; var23 < var22.length; ++var23) {
               if((var22[var23] & 16777215) == 0) {
                  var22[var23] = 0;
               } else {
                  var22[var23] |= -16777216;
               }
            }

            return var22;
         }
      }
   }

   int[] method590(int[] var1, int var2, int var3) {
      int[] var4 = new int[1152];
      int var5 = 0;

      for(int var6 = 0; var6 < 32; ++var6) {
         for(int var7 = 0; var7 < 36; ++var7) {
            int var8 = var1[var5];
            if(0 == var8) {
               if(var7 > 0 && var1[var5 - 1] != 0) {
                  var8 = var2;
               } else if(var6 > 0 && 0 != var1[var5 - 36]) {
                  var8 = var2;
               } else if(var7 < 35 && 0 != var1[var5 + 1]) {
                  var8 = var2;
               } else if(var6 < 31 && 0 != var1[36 + var5]) {
                  var8 = var2;
               }
            }

            var4[var5++] = var8;
         }
      }

      return var4;
   }

   void method591(int[] var1, int var2, int var3) {
      for(int var4 = 31; var4 > 0; --var4) {
         int var5 = 36 * var4;

         for(int var6 = 35; var6 > 0; --var6) {
            if(var1[var6 + var5] == 0 && var1[var5 + var6 - 1 - 36] != 0) {
               var1[var5 + var6] = var2;
            }
         }
      }

   }

   void method592(Class11 var1, Class11 var2, Class673 var3, int var4) {
      this.method583(Class17.aClass17_182, var1, var2, (Class45)null, var3, 2130932849);
   }

   public final Class170 method593(boolean var1, Class19 var2, byte var3) {
      int var4;
      int var5;
      int var6;
      if(var1) {
         if(var2 != null && null != var2.anIntArray189) {
            var4 = var2.anIntArray189[0];
            var5 = var2.anIntArray189[1];
            var6 = var2.anIntArray189[2];
         } else {
            var4 = this.anInt103 * -604097173;
            var5 = -2120012891 * this.anInt104;
            var6 = -490299957 * this.anInt106;
         }
      } else if(var2 != null && var2.anIntArray186 != null) {
         var4 = var2.anIntArray186[0];
         var5 = var2.anIntArray186[1];
         var6 = var2.anIntArray186[2];
      } else {
         var4 = 336005055 * this.anInt101;
         var5 = this.anInt107 * -354629827;
         var6 = this.anInt105 * -1541563083;
      }

      if(var4 == -1) {
         return null;
      } else {
         Class170 var7 = Class170.method2146(this.aClass9_72.aClass466_48, var4, 0);
         if(var7 == null) {
            return null;
         } else {
            if(var7.anInt1942 < 13) {
               var7.method2148(2);
            }

            if(-1 != var5) {
               Class170 var8 = Class170.method2146(this.aClass9_72.aClass466_48, var5, 0);
               if(var8.anInt1942 < 13) {
                  var8.method2148(2);
               }

               if(-1 != var6) {
                  Class170 var9 = Class170.method2146(this.aClass9_72.aClass466_48, var6, 0);
                  if(var9.anInt1942 < 13) {
                     var9.method2148(2);
                  }

                  Class170[] var10 = new Class170[]{var7, var8, var9};
                  var7 = new Class170(var10, 3);
               } else {
                  Class170[] var12 = new Class170[]{var7, var8};
                  var7 = new Class170(var12, 2);
               }
            }

            if(!var1 && (0 != -1869458837 * this.anInt74 || this.anInt102 * -855243921 != 0 || 0 != -922443051 * this.anInt111)) {
               var7.method2129(this.anInt74 * -1869458837, -855243921 * this.anInt102, -922443051 * this.anInt111);
            }

            if(var1 && (0 != this.anInt127 * 1581830739 || 0 != 1971626613 * this.anInt110 || -1719510263 * this.anInt112 != 0)) {
               var7.method2129(1581830739 * this.anInt127, this.anInt110 * 1971626613, -1719510263 * this.anInt112);
            }

            short[] var11;
            int var13;
            if(null != this.aShortArray77) {
               if(var2 != null && null != var2.aShortArray195) {
                  var11 = var2.aShortArray195;
               } else {
                  var11 = this.aShortArray78;
               }

               for(var13 = 0; var13 < this.aShortArray77.length; ++var13) {
                  var7.method2138(this.aShortArray77[var13], var11[var13]);
               }
            }

            if(this.aShortArray80 != null) {
               if(var2 != null && var2.aShortArray196 != null) {
                  var11 = var2.aShortArray196;
               } else {
                  var11 = this.aShortArray85;
               }

               for(var13 = 0; var13 < this.aShortArray80.length; ++var13) {
                  var7.method2139(this.aShortArray80[var13], var11[var13]);
               }
            }

            return var7;
         }
      }
   }

   public void method81(int var1) {
      if(this.anInt86 * 1201332159 != -1) {
         this.method592((Class11)this.anInterface14_139.method89(this.anInt86 * 1201332159, -843858264), (Class11)this.anInterface14_139.method89(this.anInt120 * 1447315211, -626376035), this.aClass9_72.aClass673_50, 1853457491);
      } else if(-1 != -1514407873 * this.anInt122) {
         this.method601((Class11)this.anInterface14_139.method89(this.anInt122 * -1514407873, 344180031), (Class11)this.anInterface14_139.method89(2106137691 * this.anInt134, 86687823), this.aClass9_72.aClass673_50, (byte)1);
      } else if(1235395399 * this.anInt88 != -1) {
         this.method585((Class11)this.anInterface14_139.method89(1235395399 * this.anInt88, -157288134), (Class11)this.anInterface14_139.method89(-817510097 * this.anInt114, -1607680661), this.aClass9_72.aClass673_50, (short)172);
      } else if(this.anInt124 * 2102653097 != -1) {
         this.method586((Class11)this.anInterface14_139.method89(this.anInt124 * 2102653097, 289063258), (Class11)this.anInterface14_139.method89(this.anInt123 * 2121068701, 134506804), this.aClass9_72.aClass673_50, (byte)-27);
      }

      if(!this.aClass9_72.aBool47 && this.aBool93) {
         this.anInt132 = 0;
         this.aStringArray94 = this.aClass9_72.aStringArray54;
         this.aStringArray143 = this.aClass9_72.aStringArray55;
         this.aBool133 = false;
         this.anIntArray136 = null;
         if(null != this.aClass20_135) {
            boolean var2 = false;

            for(Class526 var3 = this.aClass20_135.method638(1867593359); var3 != null; var3 = this.aClass20_135.method639(-568458364)) {
               Class83 var4 = (Class83)this.aClass9_72.anInterface14_52.method89((int)(var3.aLong7156 * -6805155999452426801L), 227662228);
               if(var4.aBool844) {
                  var3.method6332(-1949449864);
               } else {
                  var2 = true;
               }
            }

            if(!var2) {
               this.aClass20_135 = null;
            }
         }
      }

   }

   public final Class170 method594(boolean var1, Class19 var2, int var3) {
      int var4;
      int var5;
      if(var1) {
         if(null != var2 && null != var2.anIntArray194) {
            var4 = var2.anIntArray194[0];
            var5 = var2.anIntArray194[1];
         } else {
            var4 = this.anInt115 * 1143563993;
            var5 = 1299296681 * this.anInt97;
         }
      } else if(null != var2 && null != var2.anIntArray191) {
         var4 = var2.anIntArray191[0];
         var5 = var2.anIntArray191[1];
      } else {
         var4 = 1305047677 * this.anInt113;
         var5 = this.anInt81 * 2061744057;
      }

      if(-1 == var4) {
         return null;
      } else {
         Class170 var6 = Class170.method2146(this.aClass9_72.aClass466_48, var4, 0);
         if(var6.anInt1942 < 13) {
            var6.method2148(2);
         }

         if(var5 != -1) {
            Class170 var7 = Class170.method2146(this.aClass9_72.aClass466_48, var5, 0);
            if(var7.anInt1942 < 13) {
               var7.method2148(2);
            }

            Class170[] var8 = new Class170[]{var6, var7};
            var6 = new Class170(var8, 2);
         }

         short[] var9;
         int var10;
         if(null != this.aShortArray77) {
            if(var2 != null && null != var2.aShortArray195) {
               var9 = var2.aShortArray195;
            } else {
               var9 = this.aShortArray78;
            }

            for(var10 = 0; var10 < this.aShortArray77.length; ++var10) {
               var6.method2138(this.aShortArray77[var10], var9[var10]);
            }
         }

         if(this.aShortArray80 != null) {
            if(var2 != null && var2.aShortArray196 != null) {
               var9 = var2.aShortArray196;
            } else {
               var9 = this.aShortArray85;
            }

            for(var10 = 0; var10 < this.aShortArray80.length; ++var10) {
               var6.method2139(this.aShortArray80[var10], var9[var10]);
            }
         }

         return var6;
      }
   }

   public int method595(int var1, int var2, int var3) {
      if(this.aClass20_135 == null) {
         return var2;
      } else {
         Class526_Sub25 var4 = (Class526_Sub25)this.aClass20_135.get((long)var1);
         return null == var4?var2:-1044108751 * var4.anInt10550;
      }
   }

   public String method596(int var1, String var2, int var3) {
      if(null == this.aClass20_135) {
         return var2;
      } else {
         LinkableObject var4 = (LinkableObject)this.aClass20_135.get((long)var1);
         return var4 == null?var2:(String)var4.anObject10399;
      }
   }

   public int method597(int var1, int var2) {
      return null == this.anIntArray96?-1:this.anIntArray96[var1];
   }

   public int method598(int var1, int var2) {
      return null == this.anIntArray65?-1:this.anIntArray65[var1];
   }

   Class11(int var1, Interface14 var2, Class9 var3) {
      this.anInt73 = 288264495 * var1;
      this.anInterface14_139 = var2;
      this.aClass9_72 = var3;
      this.aStringArray94 = (String[])((String[])this.aClass9_72.aStringArray54.clone());
      this.aStringArray143 = (String[])((String[])this.aClass9_72.aStringArray55.clone());
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(995446479);
         if(var3 == 0) {
            return;
         }

         this.method582(var1, var3, -2019321746);
      }
   }

   public int method599(int var1) {
      return null == this.anIntArray65?-1:this.anIntArray65[var1];
   }

   public void method85() {
      if(this.anInt86 * 1201332159 != -1) {
         this.method592((Class11)this.anInterface14_139.method89(this.anInt86 * 1201332159, -418694217), (Class11)this.anInterface14_139.method89(this.anInt120 * 1447315211, -162299372), this.aClass9_72.aClass673_50, 1865330851);
      } else if(-1 != -1514407873 * this.anInt122) {
         this.method601((Class11)this.anInterface14_139.method89(this.anInt122 * -1514407873, 263324857), (Class11)this.anInterface14_139.method89(2106137691 * this.anInt134, 195933860), this.aClass9_72.aClass673_50, (byte)1);
      } else if(1235395399 * this.anInt88 != -1) {
         this.method585((Class11)this.anInterface14_139.method89(1235395399 * this.anInt88, -578234252), (Class11)this.anInterface14_139.method89(-817510097 * this.anInt114, -1430007962), this.aClass9_72.aClass673_50, (short)172);
      } else if(this.anInt124 * 2102653097 != -1) {
         this.method586((Class11)this.anInterface14_139.method89(this.anInt124 * 2102653097, 164198080), (Class11)this.anInterface14_139.method89(this.anInt123 * 2121068701, -1089154424), this.aClass9_72.aClass673_50, (byte)-3);
      }

      if(!this.aClass9_72.aBool47 && this.aBool93) {
         this.anInt132 = 0;
         this.aStringArray94 = this.aClass9_72.aStringArray54;
         this.aStringArray143 = this.aClass9_72.aStringArray55;
         this.aBool133 = false;
         this.anIntArray136 = null;
         if(null != this.aClass20_135) {
            boolean var1 = false;

            for(Class526 var2 = this.aClass20_135.method638(1704814688); var2 != null; var2 = this.aClass20_135.method639(152090864)) {
               Class83 var3 = (Class83)this.aClass9_72.anInterface14_52.method89((int)(var2.aLong7156 * -6805155999452426801L), -1203917697);
               if(var3.aBool844) {
                  var2.method6332(-1949449864);
               } else {
                  var1 = true;
               }
            }

            if(!var1) {
               this.aClass20_135 = null;
            }
         }
      }

   }

   public final boolean method600(boolean var1, Class19 var2, int var3) {
      int var4;
      int var5;
      if(var1) {
         if(null != var2 && var2.anIntArray194 != null) {
            var4 = var2.anIntArray194[0];
            var5 = var2.anIntArray194[1];
         } else {
            var4 = this.anInt115 * 1143563993;
            var5 = this.anInt97 * 1299296681;
         }
      } else if(null != var2 && null != var2.anIntArray191) {
         var4 = var2.anIntArray191[0];
         var5 = var2.anIntArray191[1];
      } else {
         var4 = this.anInt113 * 1305047677;
         var5 = 2061744057 * this.anInt81;
      }

      if(var4 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if(!this.aClass9_72.aClass466_48.method5530(var4, 0, 1759903709)) {
            var6 = false;
         }

         if(-1 != var5 && !this.aClass9_72.aClass466_48.method5530(var5, 0, 1788718363)) {
            var6 = false;
         }

         return var6;
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1594218860);
         if(var2 == 0) {
            return;
         }

         this.method582(var1, var2, -2145420337);
      }
   }

   void method601(Class11 var1, Class11 var2, Class673 var3, byte var4) {
      this.method583(Class17.aClass17_181, var1, var2, Class45.aClass45_499, var3, -1005431811);
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1986312543);
         if(var2 == 0) {
            return;
         }

         this.method582(var1, var2, -2102282287);
      }
   }

   public int method602(int var1) {
      return null == this.anIntArray96?-1:this.anIntArray96[var1];
   }
}
