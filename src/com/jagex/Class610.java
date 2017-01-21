package com.jagex;

import com.jagex.Class1;
import com.jagex.Class10;
import com.jagex.Class143;
import com.jagex.Class148;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class192;
import com.jagex.Class20;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class29;
import com.jagex.Class317;
import com.jagex.Class383;
import com.jagex.Class4;
import com.jagex.Class437;
import com.jagex.Class442;
import com.jagex.Class452;
import com.jagex.Class498;
import com.jagex.Class504;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class560_Sub1;
import com.jagex.Class561;
import com.jagex.Class583;
import com.jagex.Class594;
import com.jagex.Class599;
import com.jagex.Class602;
import com.jagex.Class605;
import com.jagex.Class627;
import com.jagex.Class652;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class692;
import com.jagex.Class704;
import com.jagex.Class83;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface17;
import com.jagex.Interface19;
import com.jagex.client;
import java.awt.Frame;
import java.awt.Point;
import java.util.Arrays;

public class Class610 implements Interface12 {
   static final int anInt7952 = 127007;
   static final int anInt7990 = 6;
   byte[] aByteArray7956;
   int[][] anIntArrayArray7938;
   public String aString7939 = "null";
   public int anInt7993 = -1380494843;
   public int anInt7971 = 1867115189;
   public int anInt7953 = 1023401622;
   public int anInt7954 = 305657465;
   byte aByte7979 = 0;
   public boolean aBool7957 = false;
   public int anInt7934 = -687158827;
   int[] anIntArray7949 = null;
   public int anInt7964 = 1990979648;
   int anInt7965 = 0;
   int anInt7948 = 0;
   short[] aShortArray7940;
   short[] aShortArray7941;
   short[] aShortArray7978;
   short[] aShortArray7944;
   byte[] aByteArray7942;
   public boolean aBool7966 = false;
   byte[] aByteArray7945;
   public boolean aBool8003 = true;
   byte[] aByteArray7946;
   int anInt7976 = -741005184;
   int anInt7977 = -534050432;
   int anInt7955 = 890129536;
   int anInt7980 = 0;
   int anInt8011 = 0;
   int anInt7981 = 0;
   public boolean aBool7985 = false;
   boolean aBool7986 = false;
   public int anInt7987 = -331711675;
   int anInt7961 = -1892276983;
   int anInt7991 = 1306299811;
   public int anInt7992 = 1595541411;
   public int anInt7935 = 0;
   public int anInt7972 = 0;
   public int anInt7997 = 0;
   public int[] anIntArray7998;
   public int[] anIntArray7989;
   int anInt7932 = 1008360983;
   public boolean aBool8000 = false;
   public boolean aBool8001 = true;
   public boolean aBool7999 = true;
   public boolean aBool8002 = false;
   public boolean aBool7975 = false;
   public boolean aBool8004 = false;
   public int anInt7958 = 0;
   public int anInt7970 = -643507393;
   public int anInt7995 = 1096017369;
   public boolean aBool7973 = false;
   int[] anIntArray7962 = null;
   public int anInt7969 = -414180869;
   public int[] anIntArray7974;
   byte aByte8012;
   byte aByte7983;
   byte aByte7996;
   byte aByte7950 = 0;
   int anInt7982 = 0;
   int anInt8005 = 0;
   int anInt7984 = 0;
   public int anInt7988 = 0;
   public int anInt7951 = -2102802368;
   public int anInt7960 = 0;
   public int anInt8006 = -1872368384;
   public int anInt7947 = -153086208;
   public boolean aBool8008 = false;
   public int anInt7994 = 0;
   public Class602 aClass602_7943;
   public boolean aBool8009 = false;
   int[] anIntArray7968;
   public boolean aBool7963 = false;
   public Class437 aClass437_8007;
   Class20 aClass20_7937;
   public static short[] aShortArray7933 = new short[256];
   public String[] aStringArray7967;
   public int anInt7959;
   Class605 aClass605_8010;
   Interface14 anInterface14_7936;

   public int method7171(int var1, int var2, int var3) {
      if(this.aClass20_7937 == null) {
         return var2;
      } else {
         Class526_Sub25 var4 = (Class526_Sub25)this.aClass20_7937.get((long)var1);
         return var4 == null?var2:var4.anInt10550 * -1044108751;
      }
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1225456844);
         if(0 == var3) {
            return;
         }

         this.method7173(var1, var3, (byte)1);
      }
   }

   public int method7172(int var1, int var2) {
      if(this.aClass20_7937 == null) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_7937.get((long)var1);
         return var3 == null?var2:var3.anInt10550 * -1044108751;
      }
   }

   void method7173(RSByteBuffer var1, int var2, byte var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(1 == var2) {
         var4 = var1.readUnsignedByte(2034302387);
         this.aByteArray7956 = new byte[var4];
         this.anIntArrayArray7938 = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            this.aByteArray7956[var5] = var1.readByte((byte)104);
            var6 = var1.readUnsignedByte(-2103610168);
            this.anIntArrayArray7938[var5] = new int[var6];

            for(var7 = 0; var7 < var6; ++var7) {
               this.anIntArrayArray7938[var5][var7] = var1.readBigSmart((byte)63);
            }
         }
      } else if(2 == var2) {
         this.aString7939 = var1.readString(-1474541695).intern();
      } else if(var2 == 14) {
         this.anInt7993 = var1.readUnsignedByte(1119038876) * -1380494843;
      } else if(var2 == 15) {
         this.anInt7971 = var1.readUnsignedByte(-87925302) * 1867115189;
      } else if(var2 == 17) {
         this.anInt7953 = 0;
      } else if(18 != var2) {
         if(var2 == 19) {
            this.anInt7954 = var1.readUnsignedByte(-49088510) * -305657465;
         } else if(21 == var2) {
            this.aByte7979 = 1;
         } else if(var2 == 22) {
            this.aBool7957 = true;
         } else if(var2 == 23) {
            this.anInt7934 = 687158827;
         } else if(var2 == 24) {
            var4 = var1.readBigSmart((byte)72);
            if(var4 != -1) {
               this.anIntArray7949 = new int[]{var4};
            }
         } else if(27 == var2) {
            this.anInt7953 = -1635782837;
         } else if(var2 == 28) {
            this.anInt7964 = (var1.readUnsignedByte(-1619921229) << 2) * -237326399;
         } else if(var2 == 29) {
            this.anInt7965 = var1.readByte((byte)95) * -1996177481;
         } else if(var2 == 39) {
            this.anInt7948 = var1.readByte((byte)118) * -391478137;
         } else if(var2 >= 30 && var2 < 35) {
            this.aStringArray7967[var2 - 30] = var1.readString(373092472).intern();
         } else if(var2 == 40) {
            var4 = var1.readUnsignedByte(-1116714089);
            this.aShortArray7940 = new short[var4];
            this.aShortArray7941 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray7940[var5] = (short)var1.readUnsignedShort(1544369919);
               this.aShortArray7941[var5] = (short)var1.readUnsignedShort(994238298);
            }
         } else if(var2 == 41) {
            var4 = var1.readUnsignedByte(1526598542);
            this.aShortArray7978 = new short[var4];
            this.aShortArray7944 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray7978[var5] = (short)var1.readUnsignedShort(751213232);
               this.aShortArray7944[var5] = (short)var1.readUnsignedShort(136501207);
            }
         } else if(42 == var2) {
            var4 = var1.readUnsignedByte(481707909);
            this.aByteArray7942 = new byte[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aByteArray7942[var5] = var1.readByte((byte)17);
            }
         } else {
            byte var9;
            if(var2 == 44) {
               var4 = var1.readUnsignedShort(1620070938);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray7945 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray7945[var7] = var9++;
                  } else {
                     this.aByteArray7945[var7] = -1;
                  }
               }
            } else if(var2 == 45) {
               var4 = var1.readUnsignedShort(1151414596);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray7946 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray7946[var7] = var9++;
                  } else {
                     this.aByteArray7946[var7] = -1;
                  }
               }
            } else if(62 == var2) {
               this.aBool7966 = true;
            } else if(var2 == 64) {
               this.aBool8003 = false;
            } else if(var2 == 65) {
               this.anInt7976 = var1.readUnsignedShort(1503491658) * 732408401;
            } else if(66 == var2) {
               this.anInt7977 = var1.readUnsignedShort(34819638) * -1514121709;
            } else if(var2 == 67) {
               this.anInt7955 = var1.readUnsignedShort(1970622496) * -295035751;
            } else if(var2 == 69) {
               var1.readUnsignedByte(-35388410);
            } else if(70 == var2) {
               this.anInt7980 = (var1.readShort((byte)1) << 2) * -1678999409;
            } else if(var2 == 71) {
               this.anInt8011 = (var1.readShort((byte)1) << 2) * 1414135369;
            } else if(72 == var2) {
               this.anInt7981 = (var1.readShort((byte)1) << 2) * -761157945;
            } else if(var2 == 73) {
               this.aBool7985 = true;
            } else if(var2 == 74) {
               this.aBool7986 = true;
            } else if(75 == var2) {
               this.anInt7987 = var1.readUnsignedByte(1613179391) * 331711675;
            } else if(77 != var2 && var2 != 92) {
               if(var2 == 78) {
                  this.anInt7992 = var1.readUnsignedShort(378862255) * -1595541411;
                  this.anInt7935 = var1.readUnsignedByte(400463823) * -2112554183;
               } else if(79 == var2) {
                  this.anInt7972 = var1.readUnsignedShort(2008672497) * -1061319567;
                  this.anInt7997 = var1.readUnsignedShort(501974505) * 1618572221;
                  this.anInt7935 = var1.readUnsignedByte(-1282891771) * -2112554183;
                  var4 = var1.readUnsignedByte(986107114);
                  this.anIntArray7998 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.anIntArray7998[var5] = var1.readUnsignedShort(383036453);
                  }
               } else if(81 == var2) {
                  this.aByte7979 = 2;
                  this.anInt7932 = var1.readUnsignedByte(-1056705638) * -442373888;
               } else if(82 == var2) {
                  this.aBool8000 = true;
               } else if(88 == var2) {
                  this.aBool8001 = false;
               } else if(89 == var2) {
                  this.aBool7999 = false;
               } else if(var2 == 91) {
                  this.aBool8002 = true;
               } else if(var2 == 93) {
                  this.aByte7979 = 3;
                  this.anInt7932 = var1.readUnsignedShort(1984054376) * -1008360983;
               } else if(94 == var2) {
                  this.aByte7979 = 4;
               } else if(var2 == 95) {
                  this.aByte7979 = 5;
                  this.anInt7932 = var1.readShort((byte)1) * -1008360983;
               } else if(var2 == 97) {
                  this.aBool7975 = true;
               } else if(98 == var2) {
                  this.aBool8004 = true;
               } else if(99 != var2 && 100 != var2) {
                  if(101 == var2) {
                     this.anInt7958 = var1.readUnsignedByte(436421126) * 1920607701;
                  } else if(var2 == 102) {
                     this.anInt7970 = var1.readUnsignedShort(1461751289) * 643507393;
                  } else if(var2 == 103) {
                     this.anInt7934 = 0;
                  } else if(104 == var2) {
                     this.anInt7995 = var1.readUnsignedByte(-1649118461) * -1410514649;
                  } else if(105 == var2) {
                     this.aBool7973 = true;
                  } else if(106 == var2) {
                     var4 = var1.readUnsignedByte(1348016396);
                     var5 = 0;
                     this.anIntArray7949 = new int[var4];
                     this.anIntArray7962 = new int[var4];

                     for(var6 = 0; var6 < var4; ++var6) {
                        this.anIntArray7949[var6] = var1.readBigSmart((byte)2);
                        var5 += this.anIntArray7962[var6] = var1.readUnsignedByte(763167431);
                     }

                     for(var6 = 0; var6 < var4; ++var6) {
                        this.anIntArray7962[var6] = this.anIntArray7962[var6] * '\uffff' / var5;
                     }
                  } else if(107 == var2) {
                     this.anInt7969 = var1.readUnsignedShort(1091646025) * 414180869;
                  } else if(var2 >= 150 && var2 < 155) {
                     this.aStringArray7967[var2 - 150] = var1.readString(-512948661).intern();
                     if(!this.aClass605_8010.aBool7903) {
                        this.aStringArray7967[var2 - 150] = null;
                     }
                  } else if(var2 == 160) {
                     var4 = var1.readUnsignedByte(20596589);
                     this.anIntArray7974 = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        this.anIntArray7974[var5] = var1.readUnsignedShort(1215210262);
                     }
                  } else if(var2 == 162) {
                     this.aByte7979 = 3;
                     this.anInt7932 = var1.readInt((byte)5) * -1008360983;
                  } else if(var2 == 163) {
                     this.aByte8012 = var1.readByte((byte)112);
                     this.aByte7983 = var1.readByte((byte)25);
                     this.aByte7996 = var1.readByte((byte)72);
                     this.aByte7950 = var1.readByte((byte)114);
                  } else if(164 == var2) {
                     this.anInt7982 = var1.readShort((byte)1) * -1661894679;
                  } else if(165 == var2) {
                     this.anInt8005 = var1.readShort((byte)1) * 1461616649;
                  } else if(166 == var2) {
                     this.anInt7984 = var1.readShort((byte)1) * -1334166003;
                  } else if(167 == var2) {
                     this.anInt7988 = var1.readUnsignedShort(298568355) * -1943327033;
                  } else if(168 != var2 && 169 != var2) {
                     if(170 == var2) {
                        this.anInt7951 = var1.readSmart(-428148387) * -1845447217;
                     } else if(var2 == 171) {
                        this.anInt7960 = var1.readSmart(-929871742) * -1581043887;
                     } else if(173 == var2) {
                        this.anInt8006 = var1.readUnsignedShort(846392110) * 764437997;
                        this.anInt7947 = var1.readUnsignedShort(660562526) * 318169111;
                     } else if(177 == var2) {
                        this.aBool8008 = true;
                     } else if(var2 == 178) {
                        this.anInt7994 = var1.readUnsignedByte(2109888386) * -604369629;
                     } else if(var2 == 186) {
                        this.aClass602_7943 = (Class602)Class561.findIdentifiable(Class383.method4719(1379038514), var1.readUnsignedByte(-1532146693), (byte)-42);
                     } else if(var2 != 188) {
                        if(189 == var2) {
                           this.aBool8009 = true;
                        } else if(var2 >= 190 && var2 < 196) {
                           if(this.anIntArray7968 == null) {
                              this.anIntArray7968 = new int[6];
                              Arrays.fill(this.anIntArray7968, -1);
                           }

                           this.anIntArray7968[var2 - 190] = var1.readUnsignedShort(1925204732);
                        } else if(var2 == 196) {
                           Class561.findIdentifiable(Class504.method6049((byte)-54), var1.readUnsignedByte(8959078), (byte)-55);
                        } else if(var2 == 197) {
                           Class561.findIdentifiable(Class29.method732(906378122), var1.readUnsignedByte(887596462), (byte)-29);
                        } else if(198 != var2 && 199 != var2) {
                           if(var2 == 200) {
                              this.aBool7963 = true;
                           } else if(var2 == 201) {
                              this.aClass437_8007 = new Class437();
                              this.aClass437_8007.aFloat4856 = (float)var1.readUnsignedSmart(-215485116);
                              this.aClass437_8007.aFloat4858 = (float)var1.readUnsignedSmart(730191870);
                              this.aClass437_8007.aFloat4852 = (float)var1.readUnsignedSmart(702340221);
                              this.aClass437_8007.aFloat4853 = (float)var1.readUnsignedSmart(1399648262);
                              this.aClass437_8007.aFloat4854 = (float)var1.readUnsignedSmart(380438514);
                              this.aClass437_8007.aFloat4855 = (float)var1.readUnsignedSmart(619974559);
                           } else if(249 == var2) {
                              var4 = var1.readUnsignedByte(-1552108498);
                              if(this.aClass20_7937 == null) {
                                 var5 = Class692.method8110(var4, 1989460038);
                                 this.aClass20_7937 = new Class20(var5);
                              }

                              for(var5 = 0; var5 < var4; ++var5) {
                                 boolean var10 = var1.readUnsignedByte(519443623) == 1;
                                 var7 = var1.read24BitInt(742041327);
                                 Object var8;
                                 if(var10) {
                                    var8 = new LinkableObject(var1.readString(-1182430048).intern());
                                 } else {
                                    var8 = new Class526_Sub25(var1.readInt((byte)5));
                                 }

                                 this.aClass20_7937.put((Class526)var8, (long)var7);
                              }
                           }
                        }
                     }
                  }
               } else {
                  var1.readUnsignedByte(1202079231);
                  var1.readUnsignedShort(350673245);
               }
            } else {
               this.anInt7961 = var1.readUnsignedShort(2144025240) * 1892276983;
               if(-579664185 * this.anInt7961 == '\uffff') {
                  this.anInt7961 = -1892276983;
               }

               this.anInt7991 = var1.readUnsignedShort(402063473) * -1306299811;
               if(-1737297419 * this.anInt7991 == '\uffff') {
                  this.anInt7991 = 1306299811;
               }

               var4 = -1;
               if(var2 == 92) {
                  var4 = var1.readBigSmart((byte)45);
               }

               var5 = var1.readUnsignedByte(1727224953);
               this.anIntArray7989 = new int[2 + var5];

               for(var6 = 0; var6 <= var5; ++var6) {
                  this.anIntArray7989[var6] = var1.readBigSmart((byte)-42);
               }

               this.anIntArray7989[1 + var5] = var4;
            }
         }
      }

   }

   public final boolean method7174(int var1, int var2) {
      if(this.anIntArrayArray7938 == null) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.aByteArray7956.length; ++var4) {
            if(var1 == this.aByteArray7956[var4]) {
               for(int var5 = 0; var5 < this.anIntArrayArray7938[var4].length; ++var5) {
                  if(!this.aClass605_8010.method7104(this.anIntArrayArray7938[var4][var5], -188091579)) {
                     var3 = false;
                  }
               }
            }
         }

         return var3;
      }
   }

   public final boolean method7175(Class652 var1, int var2) {
      if(this.anIntArrayArray7938 == null) {
         return true;
      } else {
         boolean var3 = true;

         for(int var4 = 0; var4 < this.anIntArrayArray7938.length; ++var4) {
            for(int var5 = 0; var5 < this.anIntArrayArray7938[var4].length; ++var5) {
               boolean var6 = this.aClass605_8010.method7104(this.anIntArrayArray7938[var4][var5], -1935505713);
               var3 &= var6;
               if(!var6) {
                  var1.anInt8464 = -640524961 * this.anIntArrayArray7938[var4][var5];
               }
            }
         }

         return var3;
      }
   }

   public final synchronized Class4 method7176(Class174 var1, int var2, int var3, int var4, Class148 var5, Class148 var6, int var7, int var8, int var9, boolean var10, Class599 var11, int var12) {
      if(Class560_Sub1.method9740(var3, 1814032908)) {
         var3 = Class594.aClass594_7826.anInt7833 * -1226971375;
      }

      long var13 = (long)(var4 + (var3 << 3) + (this.anInt7959 * 445039693 << 10));
      var13 |= (long)(-316183255 * var1.anInt2030 << 29);
      if(var11 != null) {
         var13 |= 1772984577379465485L * var11.aLong7865 << 32;
      }

      int var15 = var2;
      if(this.aByte7979 == 3) {
         var15 = var2 | 7;
      } else {
         if(0 != this.aByte7979 || 0 != this.anInt8005 * 684527161) {
            var15 = var2 | 2;
         }

         if(-1310111655 * this.anInt7982 != 0) {
            var15 |= 1;
         }

         if(0 != -1135132475 * this.anInt7984) {
            var15 |= 4;
         }
      }

      if(var10) {
         var15 |= 262144;
      }

      boolean var16 = this.aByte7979 != 0 && (null != var5 || null != var6);
      boolean var17 = this.anInt7982 * -1310111655 != 0 || 684527161 * this.anInt8005 != 0 || 0 != -1135132475 * this.anInt7984;
      Class192 var18 = this.aClass605_8010.aClass192_7898;
      Class4 var19;
      synchronized(var18) {
         var19 = (Class4)this.aClass605_8010.aClass192_7898.method2765(var13);
      }

      Class168 var26 = (Class168)(null != var19?var19.anObject23:null);
      Class526_Sub21_Sub5 var20 = null;
      if(null != var26 && var1.method2464(var26.method2101(), var15) == 0) {
         var20 = (Class526_Sub21_Sub5)var19.anObject24;
         if(var10 && var20 == null && !var16 && !var17) {
            var20 = (Class526_Sub21_Sub5)(var19.anObject24 = var26.method1976((Class526_Sub21_Sub5)null));
         }
      } else {
         if(var26 != null) {
            var15 = var1.method2533(var15, var26.method2101());
         }

         int var21 = var15;
         if(var3 == -1226971375 * Class594.aClass594_7841.anInt7833 && var4 > 3) {
            var21 = var15 | 5;
         }

         var26 = this.method7178(var1, var21, var3, var4, var11, 374552189);
         if(null == var26) {
            return null;
         }

         if(var3 == Class594.aClass594_7841.anInt7833 * -1226971375 && var4 > 3) {
            var26.method1951(2048);
         }

         if(var10 && !var16 && !var17) {
            var20 = var26.method1976((Class526_Sub21_Sub5)null);
         }

         var26.method2110(var15);
         var19 = new Class4(var26, var20);
         Class192 var22 = this.aClass605_8010.aClass192_7898;
         synchronized(var22) {
            this.aClass605_8010.aClass192_7898.method2768(var19, var13);
         }
      }

      if(!var16 && !var17) {
         var26 = var26.method1947((byte)0, var2, true);
      } else {
         var26 = var26.method1947((byte)0, var15, true);
         if(var16) {
            var26.method2036(this.aByte7979, this.anInt7932 * -140687783, var5, var6, var7, var8, var9);
         }

         if(var17) {
            var26.method1955(this.anInt7982 * -1310111655, this.anInt8005 * 684527161, -1135132475 * this.anInt7984);
         }

         if(var10) {
            var20 = var26.method1976((Class526_Sub21_Sub5)null);
         }

         var26.method2110(var2);
      }

      this.aClass605_8010.aClass4_7896.anObject23 = var26;
      this.aClass605_8010.aClass4_7896.anObject24 = var20;
      return this.aClass605_8010.aClass4_7896;
   }

   public final synchronized Class168 method7177(Class174 var1, int var2, int var3, int var4, Class148 var5, Class148 var6, int var7, int var8, int var9, Class704 var10, Class599 var11, int var12) {
      if(Class560_Sub1.method9740(var3, 1234267556)) {
         var3 = Class594.aClass594_7826.anInt7833 * -1226971375;
      }

      long var13 = (long)((445039693 * this.anInt7959 << 10) + (var3 << 3) + var4);
      var13 |= (long)(var1.anInt2030 * -316183255 << 29);
      if(null != var11) {
         var13 |= 1772984577379465485L * var11.aLong7865 << 32;
      }

      if(null != var10) {
         var2 |= var10.method8221((byte)49);
      }

      if(3 == this.aByte7979) {
         var2 |= 7;
      } else {
         if(0 != this.aByte7979 || 0 != this.anInt8005 * 684527161) {
            var2 |= 2;
         }

         if(-1310111655 * this.anInt7982 != 0) {
            var2 |= 1;
         }

         if(0 != -1135132475 * this.anInt7984) {
            var2 |= 4;
         }
      }

      if(Class594.aClass594_7841.anInt7833 * -1226971375 == var3 && var4 > 3) {
         var2 |= 5;
      }

      Class192 var16 = this.aClass605_8010.aClass192_7899;
      Class168 var17;
      synchronized(var16) {
         var17 = (Class168)this.aClass605_8010.aClass192_7899.method2765(var13);
      }

      if(null == var17 || var1.method2464(var17.method2101(), var2) != 0) {
         if(null != var17) {
            var2 = var1.method2533(var2, var17.method2101());
         }

         var17 = this.method7178(var1, var2, var3, var4, var11, 374552189);
         if(null == var17) {
            return null;
         }

         var16 = this.aClass605_8010.aClass192_7899;
         synchronized(var16) {
            this.aClass605_8010.aClass192_7899.method2768(var17, var13);
         }
      }

      boolean var22 = false;
      if(null != var10) {
         var17 = var17.method1947((byte)1, var2, true);
         var22 = true;
         var10.method8231(var17, var4 & 3, 1355181477);
      }

      if(Class594.aClass594_7841.anInt7833 * -1226971375 == var3 && var4 > 3) {
         if(!var22) {
            var17 = var17.method1947((byte)3, var2, true);
            var22 = true;
         }

         var17.method1951(2048);
      }

      if(this.aByte7979 != 0) {
         if(!var22) {
            var17 = var17.method1947((byte)3, var2, true);
            var22 = true;
         }

         var17.method2036(this.aByte7979, this.anInt7932 * -140687783, var5, var6, var7, var8, var9);
      }

      if(this.anInt7982 * -1310111655 != 0 || this.anInt8005 * 684527161 != 0 || -1135132475 * this.anInt7984 != 0) {
         if(!var22) {
            var17 = var17.method1947((byte)3, var2, true);
            var22 = true;
         }

         var17.method1955(this.anInt7982 * -1310111655, this.anInt8005 * 684527161, -1135132475 * this.anInt7984);
      }

      if(var22) {
         var17.method2110(var2);
      }

      return var17;
   }

   Class168 method7178(Class174 var1, int var2, int var3, int var4, Class599 var5, int var6) {
      int var7 = 64 + 1261653511 * this.anInt7965;
      int var8 = 850 + this.anInt7948 * -1373960685;
      int var9 = var2;
      boolean var10 = this.aBool7966 || -1226971375 * Class594.aClass594_7823.anInt7833 == var3 && var4 > 3;
      if(var10) {
         var2 |= 16;
      }

      if(var4 == 0) {
         if(128 != 1544674993 * this.anInt7976 || this.anInt7980 * -1759207825 != 0) {
            var2 |= 1;
         }

         if(128 != 250116009 * this.anInt7955 || 0 != this.anInt7981 * 751385335) {
            var2 |= 4;
         }
      } else {
         var2 |= 13;
      }

      if(128 != this.anInt7977 * 1635443739 || 0 != this.anInt8011 * 166089721) {
         var2 |= 2;
      }

      if(null != this.aShortArray7940) {
         var2 |= 16384;
      }

      if(this.aShortArray7978 != null) {
         var2 |= '\u8000';
      }

      if(this.aByte7950 != 0) {
         var2 |= 524288;
      }

      Class168 var11 = null;
      int var14;
      if(null != this.aByteArray7956) {
         int var12 = -1;

         for(int var13 = 0; var13 < this.aByteArray7956.length; ++var13) {
            if(var3 == this.aByteArray7956[var13]) {
               var12 = var13;
               break;
            }
         }

         if(var12 == -1) {
            return null;
         }

         int[] var28 = null != var5 && null != var5.anIntArray7863?var5.anIntArray7863:this.anIntArrayArray7938[var12];
         var14 = var28.length;
         if(var14 > 0) {
            long var15 = (long)(var1.anInt2030 * -316183255);

            int var17;
            for(var17 = 0; var17 < var14; ++var17) {
               var15 = (long)var28[var17] + var15 * 67783L;
            }

            Class192 var30 = this.aClass605_8010.aClass192_7897;
            synchronized(var30) {
               var11 = (Class168)this.aClass605_8010.aClass192_7897.method2765(var15);
            }

            if(null != var11) {
               if(var7 != var11.method1965()) {
                  var2 |= 4096;
               }

               if(var8 != var11.method2083()) {
                  var2 |= 8192;
               }
            }

            if(null == var11 || var1.method2464(var11.method2101(), var2) != 0) {
               var17 = var2 | 127007;
               if(var11 != null) {
                  var17 = var1.method2533(var17, var11.method2101());
               }

               Class170 var18 = null;
               Class170[] var19 = this.aClass605_8010.aClass170Array7902;
               synchronized(var19) {
                  int var20 = 0;

                  while(true) {
                     if(var20 >= var14) {
                        if(var14 > 1) {
                           var18 = new Class170(this.aClass605_8010.aClass170Array7902, var14);
                        }
                        break;
                     }

                     byte[] var21 = this.aClass605_8010.method7107(var28[var20], (byte)28);
                     if(null == var21) {
                        return null;
                     }

                     var18 = new Class170(var21);
                     if(var18.anInt1942 < 13) {
                        var18.method2148(2);
                     }

                     if(var14 > 1) {
                        this.aClass605_8010.aClass170Array7902[var20] = var18;
                     }

                     ++var20;
                  }
               }

               var11 = var1.method2321(var18, var17, this.aClass605_8010.anInt7900 * 775322737, var7, var8);
               Class192 var31 = this.aClass605_8010.aClass192_7897;
               synchronized(var31) {
                  this.aClass605_8010.aClass192_7897.method2768(var11, var15);
               }
            }
         }
      }

      if(var11 == null) {
         return null;
      } else {
         Class168 var27 = var11.method1947((byte)0, var2, true);
         if(var7 != var11.method1965()) {
            var27.method1987(var7);
         }

         if(var8 != var11.method2083()) {
            var27.method1973(var8);
         }

         if(var10) {
            var27.method1956();
         }

         if(-1226971375 * Class594.aClass594_7826.anInt7833 == var3 && var4 > 3) {
            var27.method1952(2048);
            var27.method1955(180, 0, -180);
         }

         var4 &= 3;
         if(var4 == 1) {
            var27.method1952(4096);
         } else if(var4 == 2) {
            var27.method1952(8192);
         } else if(var4 == 3) {
            var27.method1952(12288);
         }

         short[] var29;
         if(null != this.aShortArray7940) {
            if(null != var5 && var5.aShortArray7864 != null) {
               var29 = var5.aShortArray7864;
            } else {
               var29 = this.aShortArray7941;
            }

            for(var14 = 0; var14 < this.aShortArray7940.length; ++var14) {
               if(this.aByteArray7942 != null && var14 < this.aByteArray7942.length) {
                  var27.method1940(this.aShortArray7940[var14], aShortArray7933[this.aByteArray7942[var14] & 255]);
               } else {
                  var27.method1940(this.aShortArray7940[var14], var29[var14]);
               }
            }
         }

         if(null != this.aShortArray7978) {
            if(var5 != null && var5.aShortArray7862 != null) {
               var29 = var5.aShortArray7862;
            } else {
               var29 = this.aShortArray7944;
            }

            for(var14 = 0; var14 < this.aShortArray7978.length; ++var14) {
               var27.method1992(this.aShortArray7978[var14], var29[var14]);
            }
         }

         if(this.aByte7950 != 0) {
            var27.method2020(this.aByte8012, this.aByte7983, this.aByte7996, this.aByte7950 & 255);
         }

         if(128 != this.anInt7976 * 1544674993 || 128 != 1635443739 * this.anInt7977 || 128 != 250116009 * this.anInt7955) {
            var27.method1957(this.anInt7976 * 1544674993, 1635443739 * this.anInt7977, 250116009 * this.anInt7955);
         }

         if(0 != -1759207825 * this.anInt7980 || this.anInt8011 * 166089721 != 0 || 0 != 751385335 * this.anInt7981) {
            var27.method1955(this.anInt7980 * -1759207825, this.anInt8011 * 166089721, 751385335 * this.anInt7981);
         }

         var27.method2110(var9);
         return var27;
      }
   }

   public final Class610 method7179(Interface17 var1, Interface19 var2, byte var3) {
      int var4 = -1;
      if(-1 != -579664185 * this.anInt7961) {
         Class317 var5 = var1.method109(this.anInt7961 * -579664185, '\uff00');
         if(null != var5) {
            var4 = var2.method116(var5, (byte)11);
         }
      } else if(-1 != -1737297419 * this.anInt7991) {
         Class143 var6 = var1.method106(Class452.aClass452_4946, -1737297419 * this.anInt7991, 34785190);
         if(null != var6) {
            var4 = var2.method114(var6, -2114692157);
         }
      }

      if(var4 >= 0 && var4 < this.anIntArray7989.length - 1) {
         return this.anIntArray7989[var4] == -1?null:(Class610)this.anInterface14_7936.method89(this.anIntArray7989[var4], -1853768165);
      } else {
         int var7 = this.anIntArray7989[this.anIntArray7989.length - 1];
         return var7 != -1?(Class610)this.anInterface14_7936.method89(var7, -1871547010):null;
      }
   }

   void method7180(RSByteBuffer var1, int var2) {
      int var3;
      int var4;
      int var5;
      int var6;
      if(1 == var2) {
         var3 = var1.readUnsignedByte(-497745056);
         this.aByteArray7956 = new byte[var3];
         this.anIntArrayArray7938 = new int[var3][];

         for(var4 = 0; var4 < var3; ++var4) {
            this.aByteArray7956[var4] = var1.readByte((byte)106);
            var5 = var1.readUnsignedByte(45487704);
            this.anIntArrayArray7938[var4] = new int[var5];

            for(var6 = 0; var6 < var5; ++var6) {
               this.anIntArrayArray7938[var4][var6] = var1.readBigSmart((byte)-46);
            }
         }
      } else if(2 == var2) {
         this.aString7939 = var1.readString(2098482252).intern();
      } else if(var2 == 14) {
         this.anInt7993 = var1.readUnsignedByte(906667773) * -1380494843;
      } else if(var2 == 15) {
         this.anInt7971 = var1.readUnsignedByte(1608066784) * 1867115189;
      } else if(var2 == 17) {
         this.anInt7953 = 0;
      } else if(18 != var2) {
         if(var2 == 19) {
            this.anInt7954 = var1.readUnsignedByte(-1657568765) * -305657465;
         } else if(21 == var2) {
            this.aByte7979 = 1;
         } else if(var2 == 22) {
            this.aBool7957 = true;
         } else if(var2 == 23) {
            this.anInt7934 = 687158827;
         } else if(var2 == 24) {
            var3 = var1.readBigSmart((byte)-2);
            if(var3 != -1) {
               this.anIntArray7949 = new int[]{var3};
            }
         } else if(27 == var2) {
            this.anInt7953 = -1635782837;
         } else if(var2 == 28) {
            this.anInt7964 = (var1.readUnsignedByte(1153393005) << 2) * -237326399;
         } else if(var2 == 29) {
            this.anInt7965 = var1.readByte((byte)51) * -1996177481;
         } else if(var2 == 39) {
            this.anInt7948 = var1.readByte((byte)118) * -391478137;
         } else if(var2 >= 30 && var2 < 35) {
            this.aStringArray7967[var2 - 30] = var1.readString(264090331).intern();
         } else if(var2 == 40) {
            var3 = var1.readUnsignedByte(899887687);
            this.aShortArray7940 = new short[var3];
            this.aShortArray7941 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aShortArray7940[var4] = (short)var1.readUnsignedShort(1060932110);
               this.aShortArray7941[var4] = (short)var1.readUnsignedShort(1122774210);
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte(-210440437);
            this.aShortArray7978 = new short[var3];
            this.aShortArray7944 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aShortArray7978[var4] = (short)var1.readUnsignedShort(236532121);
               this.aShortArray7944[var4] = (short)var1.readUnsignedShort(540603011);
            }
         } else if(42 == var2) {
            var3 = var1.readUnsignedByte(116846987);
            this.aByteArray7942 = new byte[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aByteArray7942[var4] = var1.readByte((byte)56);
            }
         } else {
            byte var8;
            if(var2 == 44) {
               var3 = var1.readUnsignedShort(368981092);
               var4 = 0;

               for(var5 = var3; var5 > 0; var5 >>= 1) {
                  ++var4;
               }

               this.aByteArray7945 = new byte[var4];
               var8 = 0;

               for(var6 = 0; var6 < var4; ++var6) {
                  if((var3 & 1 << var6) > 0) {
                     this.aByteArray7945[var6] = var8++;
                  } else {
                     this.aByteArray7945[var6] = -1;
                  }
               }
            } else if(var2 == 45) {
               var3 = var1.readUnsignedShort(1466193114);
               var4 = 0;

               for(var5 = var3; var5 > 0; var5 >>= 1) {
                  ++var4;
               }

               this.aByteArray7946 = new byte[var4];
               var8 = 0;

               for(var6 = 0; var6 < var4; ++var6) {
                  if((var3 & 1 << var6) > 0) {
                     this.aByteArray7946[var6] = var8++;
                  } else {
                     this.aByteArray7946[var6] = -1;
                  }
               }
            } else if(62 == var2) {
               this.aBool7966 = true;
            } else if(var2 == 64) {
               this.aBool8003 = false;
            } else if(var2 == 65) {
               this.anInt7976 = var1.readUnsignedShort(784411153) * 732408401;
            } else if(66 == var2) {
               this.anInt7977 = var1.readUnsignedShort(1355141182) * -1514121709;
            } else if(var2 == 67) {
               this.anInt7955 = var1.readUnsignedShort(460454884) * -295035751;
            } else if(var2 == 69) {
               var1.readUnsignedByte(-1121057454);
            } else if(70 == var2) {
               this.anInt7980 = (var1.readShort((byte)1) << 2) * -1678999409;
            } else if(var2 == 71) {
               this.anInt8011 = (var1.readShort((byte)1) << 2) * 1414135369;
            } else if(72 == var2) {
               this.anInt7981 = (var1.readShort((byte)1) << 2) * -761157945;
            } else if(var2 == 73) {
               this.aBool7985 = true;
            } else if(var2 == 74) {
               this.aBool7986 = true;
            } else if(75 == var2) {
               this.anInt7987 = var1.readUnsignedByte(-1961440503) * 331711675;
            } else if(77 != var2 && var2 != 92) {
               if(var2 == 78) {
                  this.anInt7992 = var1.readUnsignedShort(1160812241) * -1595541411;
                  this.anInt7935 = var1.readUnsignedByte(-697656828) * -2112554183;
               } else if(79 == var2) {
                  this.anInt7972 = var1.readUnsignedShort(1091439059) * -1061319567;
                  this.anInt7997 = var1.readUnsignedShort(29192230) * 1618572221;
                  this.anInt7935 = var1.readUnsignedByte(1398989444) * -2112554183;
                  var3 = var1.readUnsignedByte(-1634311850);
                  this.anIntArray7998 = new int[var3];

                  for(var4 = 0; var4 < var3; ++var4) {
                     this.anIntArray7998[var4] = var1.readUnsignedShort(1157231640);
                  }
               } else if(81 == var2) {
                  this.aByte7979 = 2;
                  this.anInt7932 = var1.readUnsignedByte(-281677559) * -442373888;
               } else if(82 == var2) {
                  this.aBool8000 = true;
               } else if(88 == var2) {
                  this.aBool8001 = false;
               } else if(89 == var2) {
                  this.aBool7999 = false;
               } else if(var2 == 91) {
                  this.aBool8002 = true;
               } else if(var2 == 93) {
                  this.aByte7979 = 3;
                  this.anInt7932 = var1.readUnsignedShort(198378278) * -1008360983;
               } else if(94 == var2) {
                  this.aByte7979 = 4;
               } else if(var2 == 95) {
                  this.aByte7979 = 5;
                  this.anInt7932 = var1.readShort((byte)1) * -1008360983;
               } else if(var2 == 97) {
                  this.aBool7975 = true;
               } else if(98 == var2) {
                  this.aBool8004 = true;
               } else if(99 != var2 && 100 != var2) {
                  if(101 == var2) {
                     this.anInt7958 = var1.readUnsignedByte(-876168049) * 1920607701;
                  } else if(var2 == 102) {
                     this.anInt7970 = var1.readUnsignedShort(671894495) * 643507393;
                  } else if(var2 == 103) {
                     this.anInt7934 = 0;
                  } else if(104 == var2) {
                     this.anInt7995 = var1.readUnsignedByte(896378574) * -1410514649;
                  } else if(105 == var2) {
                     this.aBool7973 = true;
                  } else if(106 == var2) {
                     var3 = var1.readUnsignedByte(-198547850);
                     var4 = 0;
                     this.anIntArray7949 = new int[var3];
                     this.anIntArray7962 = new int[var3];

                     for(var5 = 0; var5 < var3; ++var5) {
                        this.anIntArray7949[var5] = var1.readBigSmart((byte)-73);
                        var4 += this.anIntArray7962[var5] = var1.readUnsignedByte(40772279);
                     }

                     for(var5 = 0; var5 < var3; ++var5) {
                        this.anIntArray7962[var5] = this.anIntArray7962[var5] * '\uffff' / var4;
                     }
                  } else if(107 == var2) {
                     this.anInt7969 = var1.readUnsignedShort(470212067) * 414180869;
                  } else if(var2 >= 150 && var2 < 155) {
                     this.aStringArray7967[var2 - 150] = var1.readString(-397617528).intern();
                     if(!this.aClass605_8010.aBool7903) {
                        this.aStringArray7967[var2 - 150] = null;
                     }
                  } else if(var2 == 160) {
                     var3 = var1.readUnsignedByte(270371855);
                     this.anIntArray7974 = new int[var3];

                     for(var4 = 0; var4 < var3; ++var4) {
                        this.anIntArray7974[var4] = var1.readUnsignedShort(451575692);
                     }
                  } else if(var2 == 162) {
                     this.aByte7979 = 3;
                     this.anInt7932 = var1.readInt((byte)5) * -1008360983;
                  } else if(var2 == 163) {
                     this.aByte8012 = var1.readByte((byte)22);
                     this.aByte7983 = var1.readByte((byte)110);
                     this.aByte7996 = var1.readByte((byte)103);
                     this.aByte7950 = var1.readByte((byte)99);
                  } else if(164 == var2) {
                     this.anInt7982 = var1.readShort((byte)1) * -1661894679;
                  } else if(165 == var2) {
                     this.anInt8005 = var1.readShort((byte)1) * 1461616649;
                  } else if(166 == var2) {
                     this.anInt7984 = var1.readShort((byte)1) * -1334166003;
                  } else if(167 == var2) {
                     this.anInt7988 = var1.readUnsignedShort(1898563925) * -1943327033;
                  } else if(168 != var2 && 169 != var2) {
                     if(170 == var2) {
                        this.anInt7951 = var1.readSmart(-2039475990) * -1845447217;
                     } else if(var2 == 171) {
                        this.anInt7960 = var1.readSmart(-563289157) * -1581043887;
                     } else if(173 == var2) {
                        this.anInt8006 = var1.readUnsignedShort(1105925047) * 764437997;
                        this.anInt7947 = var1.readUnsignedShort(1315797973) * 318169111;
                     } else if(177 == var2) {
                        this.aBool8008 = true;
                     } else if(var2 == 178) {
                        this.anInt7994 = var1.readUnsignedByte(493072544) * -604369629;
                     } else if(var2 == 186) {
                        this.aClass602_7943 = (Class602)Class561.findIdentifiable(Class383.method4719(1379038514), var1.readUnsignedByte(-1444514643), (byte)4);
                     } else if(var2 != 188) {
                        if(189 == var2) {
                           this.aBool8009 = true;
                        } else if(var2 >= 190 && var2 < 196) {
                           if(this.anIntArray7968 == null) {
                              this.anIntArray7968 = new int[6];
                              Arrays.fill(this.anIntArray7968, -1);
                           }

                           this.anIntArray7968[var2 - 190] = var1.readUnsignedShort(511745483);
                        } else if(var2 == 196) {
                           Class561.findIdentifiable(Class504.method6049((byte)-94), var1.readUnsignedByte(1844495826), (byte)-67);
                        } else if(var2 == 197) {
                           Class561.findIdentifiable(Class29.method732(906378122), var1.readUnsignedByte(473043121), (byte)-65);
                        } else if(198 != var2 && 199 != var2) {
                           if(var2 == 200) {
                              this.aBool7963 = true;
                           } else if(var2 == 201) {
                              this.aClass437_8007 = new Class437();
                              this.aClass437_8007.aFloat4856 = (float)var1.readUnsignedSmart(1075323309);
                              this.aClass437_8007.aFloat4858 = (float)var1.readUnsignedSmart(689692956);
                              this.aClass437_8007.aFloat4852 = (float)var1.readUnsignedSmart(1629293037);
                              this.aClass437_8007.aFloat4853 = (float)var1.readUnsignedSmart(628493541);
                              this.aClass437_8007.aFloat4854 = (float)var1.readUnsignedSmart(1276095006);
                              this.aClass437_8007.aFloat4855 = (float)var1.readUnsignedSmart(-99307206);
                           } else if(249 == var2) {
                              var3 = var1.readUnsignedByte(-1295132273);
                              if(this.aClass20_7937 == null) {
                                 var4 = Class692.method8110(var3, 2040169461);
                                 this.aClass20_7937 = new Class20(var4);
                              }

                              for(var4 = 0; var4 < var3; ++var4) {
                                 boolean var9 = var1.readUnsignedByte(-1490560607) == 1;
                                 var6 = var1.read24BitInt(742041327);
                                 Object var7;
                                 if(var9) {
                                    var7 = new LinkableObject(var1.readString(-31656493).intern());
                                 } else {
                                    var7 = new Class526_Sub25(var1.readInt((byte)5));
                                 }

                                 this.aClass20_7937.put((Class526)var7, (long)var6);
                              }
                           }
                        }
                     }
                  }
               } else {
                  var1.readUnsignedByte(-1908765691);
                  var1.readUnsignedShort(1600499321);
               }
            } else {
               this.anInt7961 = var1.readUnsignedShort(1169632983) * 1892276983;
               if(-579664185 * this.anInt7961 == '\uffff') {
                  this.anInt7961 = -1892276983;
               }

               this.anInt7991 = var1.readUnsignedShort(918296070) * -1306299811;
               if(-1737297419 * this.anInt7991 == '\uffff') {
                  this.anInt7991 = 1306299811;
               }

               var3 = -1;
               if(var2 == 92) {
                  var3 = var1.readBigSmart((byte)-8);
               }

               var4 = var1.readUnsignedByte(1633517185);
               this.anIntArray7989 = new int[2 + var4];

               for(var5 = 0; var5 <= var4; ++var5) {
                  this.anIntArray7989[var5] = var1.readBigSmart((byte)54);
               }

               this.anIntArray7989[1 + var4] = var3;
            }
         }
      }

   }

   public int method7181(int var1) {
      return null == this.anIntArray7968?-1:this.anIntArray7968[var1];
   }

   void method7182(byte var1) {
      if(909601847 * this.anInt7954 == -1) {
         this.anInt7954 = 0;
         if(null != this.aByteArray7956 && 1 == this.aByteArray7956.length && -1226971375 * Class594.aClass594_7841.anInt7833 == this.aByteArray7956[0]) {
            this.anInt7954 = -305657465;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if(null != this.aStringArray7967[var2]) {
               this.anInt7954 = -305657465;
               break;
            }
         }
      }

      if(86646899 * this.anInt7987 == -1) {
         this.anInt7987 = 331711675 * (0 != this.anInt7953 * -1196711325?1:0);
      }

      if(this.method7183((byte)0) || this.aBool8004 || null != this.anIntArray7989) {
         this.aBool8008 = true;
      }

      if(909601847 * this.anInt7954 <= 0 && this.aClass602_7943 == Class602.aClass602_7883) {
         ;
      }

   }

   public boolean method7183(byte var1) {
      return null != this.anIntArray7949;
   }

   public boolean method7184(int var1) {
      return null != this.anIntArray7949 && this.anIntArray7949.length > 1;
   }

   public int[] method7185(int var1) {
      return this.anIntArray7949;
   }

   public boolean method7186(int var1, int var2) {
      if(this.anIntArray7949 != null && -1 != var1) {
         for(int var3 = 0; var3 < this.anIntArray7949.length; ++var3) {
            if(var1 == this.anIntArray7949[var3]) {
               return true;
            }
         }
      }

      return false;
   }

   public int method7187(int var1, byte var2) {
      return null == this.anIntArray7968?-1:this.anIntArray7968[var1];
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1115645779);
         if(0 == var2) {
            return;
         }

         this.method7173(var1, var2, (byte)1);
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1288559693);
         if(0 == var2) {
            return;
         }

         this.method7173(var1, var2, (byte)1);
      }
   }

   public void method85() {
      this.method7182((byte)1);
      if(this.aBool7986) {
         this.anInt7953 = 0;
      }

      if(!this.aClass605_8010.aBool7903 && this.aBool8002) {
         this.aStringArray7967 = null;
         this.anIntArray7974 = null;
      }

   }

   public int method7188(int var1, int var2) {
      if(this.aClass20_7937 == null) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_7937.get((long)var1);
         return var3 == null?var2:var3.anInt10550 * -1044108751;
      }
   }

   public String method7189(int var1, String var2, byte var3) {
      if(this.aClass20_7937 == null) {
         return var2;
      } else {
         LinkableObject var4 = (LinkableObject)this.aClass20_7937.get((long)var1);
         return null == var4?var2:(String)var4.anObject10399;
      }
   }

   void method7190() {
      if(909601847 * this.anInt7954 == -1) {
         this.anInt7954 = 0;
         if(null != this.aByteArray7956 && 1 == this.aByteArray7956.length && -1226971375 * Class594.aClass594_7841.anInt7833 == this.aByteArray7956[0]) {
            this.anInt7954 = -305657465;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if(null != this.aStringArray7967[var1]) {
               this.anInt7954 = -305657465;
               break;
            }
         }
      }

      if(86646899 * this.anInt7987 == -1) {
         this.anInt7987 = 331711675 * (0 != this.anInt7953 * -1196711325?1:0);
      }

      if(this.method7183((byte)0) || this.aBool8004 || null != this.anIntArray7989) {
         this.aBool8008 = true;
      }

      if(909601847 * this.anInt7954 <= 0 && this.aClass602_7943 == Class602.aClass602_7883) {
         ;
      }

   }

   public final boolean method7191(int var1) {
      if(this.anIntArrayArray7938 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aByteArray7956.length; ++var3) {
            if(var1 == this.aByteArray7956[var3]) {
               for(int var4 = 0; var4 < this.anIntArrayArray7938[var3].length; ++var4) {
                  if(!this.aClass605_8010.method7104(this.anIntArrayArray7938[var3][var4], 1066450231)) {
                     var2 = false;
                  }
               }
            }
         }

         return var2;
      }
   }

   public int method7192(byte var1) {
      if(this.anIntArray7949 != null) {
         if(this.anIntArray7949.length <= 1) {
            return this.anIntArray7949[0];
         }

         int var2 = (int)(Math.random() * 65535.0D);

         for(int var3 = 0; var3 < this.anIntArray7949.length; ++var3) {
            if(var2 <= this.anIntArray7962[var3]) {
               return this.anIntArray7949[var3];
            }

            var2 -= this.anIntArray7962[var3];
         }
      }

      return -1;
   }

   Class610(int var1, Class605 var2, Interface14 var3) {
      this.aClass602_7943 = Class602.aClass602_7884;
      this.anInt7959 = -1103227771 * var1;
      this.aClass605_8010 = var2;
      this.anInterface14_7936 = var3;
      this.aStringArray7967 = (String[])((String[])this.aClass605_8010.aStringArray7901.clone());
   }

   public boolean method7193(int var1) {
      if(null == this.anIntArray7989) {
         return -199386123 * this.anInt7992 != -1 || null != this.anIntArray7998;
      } else {
         for(int var2 = 0; var2 < this.anIntArray7989.length; ++var2) {
            if(-1 != this.anIntArray7989[var2]) {
               Class610 var3 = (Class610)this.anInterface14_7936.method89(this.anIntArray7989[var2], -808017700);
               if(-1 != var3.anInt7992 * -199386123 || var3.anIntArray7998 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   void method7194() {
      if(909601847 * this.anInt7954 == -1) {
         this.anInt7954 = 0;
         if(null != this.aByteArray7956 && 1 == this.aByteArray7956.length && -1226971375 * Class594.aClass594_7841.anInt7833 == this.aByteArray7956[0]) {
            this.anInt7954 = -305657465;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if(null != this.aStringArray7967[var1]) {
               this.anInt7954 = -305657465;
               break;
            }
         }
      }

      if(86646899 * this.anInt7987 == -1) {
         this.anInt7987 = 331711675 * (0 != this.anInt7953 * -1196711325?1:0);
      }

      if(this.method7183((byte)0) || this.aBool8004 || null != this.anIntArray7989) {
         this.aBool8008 = true;
      }

      if(909601847 * this.anInt7954 <= 0 && this.aClass602_7943 == Class602.aClass602_7883) {
         ;
      }

   }

   public boolean method7195() {
      return null != this.anIntArray7949 && this.anIntArray7949.length > 1;
   }

   public int method7196(int var1, int var2) {
      if(this.aClass20_7937 == null) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_7937.get((long)var1);
         return var3 == null?var2:var3.anInt10550 * -1044108751;
      }
   }

   public boolean method7197() {
      return null != this.anIntArray7949;
   }

   public void method81(int var1) {
      this.method7182((byte)1);
      if(this.aBool7986) {
         this.anInt7953 = 0;
      }

      if(!this.aClass605_8010.aBool7903 && this.aBool8002) {
         this.aStringArray7967 = null;
         this.anIntArray7974 = null;
      }

   }

   public int method7198() {
      if(this.anIntArray7949 != null) {
         if(this.anIntArray7949.length <= 1) {
            return this.anIntArray7949[0];
         }

         int var1 = (int)(Math.random() * 65535.0D);

         for(int var2 = 0; var2 < this.anIntArray7949.length; ++var2) {
            if(var1 <= this.anIntArray7962[var2]) {
               return this.anIntArray7949[var2];
            }

            var1 -= this.anIntArray7962[var2];
         }
      }

      return -1;
   }

   public boolean method7199() {
      return null != this.anIntArray7949;
   }

   public boolean method7200(int var1) {
      if(this.anIntArray7949 != null && -1 != var1) {
         for(int var2 = 0; var2 < this.anIntArray7949.length; ++var2) {
            if(var1 == this.anIntArray7949[var2]) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method7201(int var1) {
      if(this.anIntArray7949 != null && -1 != var1) {
         for(int var2 = 0; var2 < this.anIntArray7949.length; ++var2) {
            if(var1 == this.anIntArray7949[var2]) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method7202(int var1) {
      if(this.anIntArray7949 != null && -1 != var1) {
         for(int var2 = 0; var2 < this.anIntArray7949.length; ++var2) {
            if(var1 == this.anIntArray7949[var2]) {
               return true;
            }
         }
      }

      return false;
   }

   public int method7203(int var1) {
      return null == this.anIntArray7968?-1:this.anIntArray7968[var1];
   }

   public int method7204(int var1) {
      return null == this.anIntArray7968?-1:this.anIntArray7968[var1];
   }

   public static void method7205(int[] var0, Object[] var1, int var2, int var3, int var4) {
      if(var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         int var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         Object var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;
         int var9 = Integer.MAX_VALUE == var7?0:1;

         for(int var10 = var2; var10 < var3; ++var10) {
            if(var0[var10] < (var10 & var9) + var7) {
               int var11 = var0[var10];
               var0[var10] = var0[var6];
               var0[var6] = var11;
               Object var12 = var1[var10];
               var1[var10] = var1[var6];
               var1[var6++] = var12;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method7205(var0, var1, var2, var6 - 1, 717462738);
         method7205(var0, var1, 1 + var6, var3, 691539653);
      }

   }

   static final void method7206(InterfaceDef var0, Class681 var1, int var2) {
      Class1 var3 = var0.method3347(Class627.aClass418_8195, client.anInterface51_11046, 951015941);
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      Point var5 = var3.method507(var0.aString2575, var0.anInt2510 * -99858407, var0.anInt2488 * 1371005853, var4, Class442.aClass153Array4878, 863239645);
      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var5.x;
      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var5.y;
   }

   static final void method7207(Class681 var0, int var1) {
      Class498.method5945((byte)43);
   }

   public static void method7208(Class690 var0, Frame var1, int var2) {
      var0.method8095(-1944356887);
      var1.setVisible(false);
      var1.dispose();
   }

   static final void method7209(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      int var4 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285];
      String var5 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      Class83 var6 = (Class83)Class10.aClass40_Sub20_62.method89(var4, -1257118591);
      if(!var6.aString842.equals(var5)) {
         var0.method3355(var4, var5, -618930169);
      } else {
         var0.method3356(var4, -666694295);
      }

   }

   static final void method7210(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class583.method6978(var3, var4, var0, 961520947);
   }

   static final void method7211(Class681 var0, byte var1) {
      var0.anInt8623 -= -820311795;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1] << 1;
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      int var5 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 3];
      int var6 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 4];
      int var7 = var0.anIntArray8622[5 + -1730576285 * var0.anInt8623];
      int var8 = var0.anIntArray8622[6 + var0.anInt8623 * -1730576285];
      if(var2 >= 0 && var2 < 2 && client.anIntArrayArrayArray11100[var2] != null && var3 >= 0 && var3 < client.anIntArrayArrayArray11100[var2].length) {
         client.anIntArrayArrayArray11100[var2][var3] = new int[]{(var4 >> 14 & 16383) << 9, var5 << 2, (var4 & 16383) << 9, var8};
         client.anIntArrayArrayArray11100[var2][var3 + 1] = new int[]{(var6 >> 14 & 16383) << 9, var7 << 2, (var6 & 16383) << 9};
      }

   }
}
