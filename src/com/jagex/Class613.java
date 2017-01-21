package com.jagex;

import com.jagex.Class105;
import com.jagex.InterfaceDef;
import com.jagex.Class466;
import com.jagex.RSByteBuffer;
import com.jagex.Class622;
import com.jagex.Class679;
import com.jagex.Class68;
import com.jagex.Class681;
import com.jagex.client;

public class Class613 {
   static final int anInt8032 = 4;
   static final int anInt8034 = 4;
   static final int anInt8038 = 7;
   static final int anInt8058 = 4;
   public int anInt8029 = 1428466164;
   public int[] anIntArray8073 = null;
   public int[] anIntArray8031 = null;
   public int anInt8033 = -838916964;
   public int anInt8044 = -135740052;
   public int anInt8037 = -2014331173;
   public int anInt8052 = -131072037;
   public int anInt8039 = 291031947;
   public int anInt8040 = -1903937347;
   public boolean aBool8041 = true;
   public short aShort8042 = -1;
   public byte aByte8060 = 0;
   public int anInt8062 = 1925696556;
   public boolean aBool8030 = true;
   public int anInt8051 = -2112403994;
   public boolean aBool8035 = true;
   public int anInt8043 = -1696706541;
   public int anInt8028 = 1041039597;
   public int anInt8054 = 662935109;
   public int anInt8056 = 706461952;
   public int anInt8057 = -1071634911;
   public int anInt8049 = -1017253760;
   public int anInt8059 = 2095054845;
   public int anInt8046 = -1903790841;
   public int anInt8061 = -921719221;
   public int anInt8045 = 745589619;
   public int anInt8063 = 139082727;
   public int anInt8064 = -449180193;
   public int anInt8050 = 1091114509;
   public int anInt8068 = -1026815821;
   public int anInt8069 = 1154264647;
   public int anInt8070 = -1705989461;
   public int anInt8071 = 238865543;
   public int anInt8072 = -299448613;
   public int anInt8048 = 2137896873;
   public short[][] aShortArrayArray8067;
   public short[][][] aShortArrayArrayArray8053;
   public boolean aBool8055;
   public int anInt8036;
   public int anInt8066;
   public short[][] aShortArrayArray8047;
   public short[][][] aShortArrayArrayArray8065;

   public Class613(Class466 var1) {
      byte[] var2 = var1.method5541(127490303 * Class622.aClass622_8134.anInt8139, 16777472);
      this.method7236(new RSByteBuffer(var2), -1957887669);
   }

   void method7236(RSByteBuffer var1, int var2) {
      boolean var3 = false;

      while(true) {
         while(true) {
            int var4 = var1.readUnsignedByte(-1334224306);
            if(0 == var4) {
               if(!var3) {
                  if(null == this.anIntArray8073) {
                     this.anInt8029 = 1428466164;
                     this.anIntArray8073 = new int[4];
                     this.anIntArray8031 = new int[4];
                  }

                  for(var4 = 0; var4 < this.anIntArray8073.length; ++var4) {
                     this.anIntArray8073[var4] = 0;
                     this.anIntArray8031[var4] = var4 * 20;
                  }
               }

               return;
            }

            int var5;
            if(var4 == 1) {
               if(null == this.anIntArray8073) {
                  this.anInt8029 = 1428466164;
                  this.anIntArray8073 = new int[4];
                  this.anIntArray8031 = new int[4];
               }

               for(var5 = 0; var5 < this.anIntArray8073.length; ++var5) {
                  this.anIntArray8073[var5] = var1.readShort((byte)1);
                  this.anIntArray8031[var5] = var1.readShort((byte)1);
               }

               var3 = true;
            } else if(var4 == 2) {
               this.anInt8052 = var1.readBigSmart((byte)-42) * 131072037;
            } else if(var4 == 3) {
               this.anInt8029 = var1.readUnsignedByte(-1971939188) * -716625283;
               this.anIntArray8073 = new int[-137814315 * this.anInt8029];
               this.anIntArray8031 = new int[this.anInt8029 * -137814315];
            } else if(var4 == 4) {
               this.aBool8041 = false;
            } else if(var4 == 5) {
               this.anInt8039 = var1.read24BitInt(742041327) * -291031947;
            } else if(var4 == 6) {
               this.anInt8040 = var1.read24BitInt(742041327) * 1903937347;
            } else {
               int var6;
               int var7;
               int var8;
               int var9;
               int var10;
               if(var4 == 7) {
                  this.aShortArrayArray8067 = new short[10][4];
                  this.aShortArrayArrayArray8053 = new short[10][4][];

                  for(var5 = 0; var5 < 10; ++var5) {
                     for(var6 = 0; var6 < 4; ++var6) {
                        var7 = var1.readUnsignedShort(1317343477);
                        if('\uffff' == var7) {
                           var7 = -1;
                        }

                        this.aShortArrayArray8067[var5][var6] = (short)var7;
                        var8 = var1.readUnsignedShort(2085399099);
                        this.aShortArrayArrayArray8053[var5][var6] = new short[var8];

                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var1.readUnsignedShort(1598671008);
                           if('\uffff' == var10) {
                              var10 = -1;
                           }

                           this.aShortArrayArrayArray8053[var5][var6][var9] = (short)var10;
                        }
                     }
                  }
               } else if(var4 == 8) {
                  this.aBool8030 = false;
               } else if(9 == var4) {
                  this.anInt8051 = var1.readUnsignedByte(1128647643) * 1091281651;
               } else if(var4 == 10) {
                  this.aBool8035 = false;
               } else if(var4 == 11) {
                  this.anInt8043 = var1.readUnsignedByte(-148584220) * -565568847;
               } else if(var4 == 12) {
                  this.anInt8028 = var1.readUnsignedShort(1451901084) * -1041039597;
                  this.anInt8054 = var1.readUnsignedShort(626825199) * -662935109;
               } else if(var4 == 13) {
                  this.anInt8044 = var1.readUnsignedByte(-1065084848) * -1107676837;
               } else if(14 == var4) {
                  this.anInt8033 = var1.readUnsignedByte(-1854003444) * -1283471065;
               } else if(15 == var4) {
                  this.anInt8037 = var1.readUnsignedByte(-393434479) * 939371917;
               } else if(16 == var4) {
                  this.aBool8055 = true;
               } else if(17 == var4) {
                  this.anInt8056 = var1.readInt((byte)5) * 1964303423;
               } else if(18 == var4) {
                  this.anInt8057 = var1.readInt((byte)5) * 517986783;
               } else if(var4 == 19) {
                  this.anInt8049 = var1.readInt((byte)5) * -1619164641;
               } else if(20 == var4) {
                  this.aShort8042 = (short)var1.readUnsignedShort(1874677656);
                  this.aByte8060 = (byte)var1.readUnsignedByte(826901196);
               } else if(var4 == 21) {
                  this.anInt8062 = var1.readUnsignedByte(-1773237171) * 1694294211;
               } else if(var4 == 22) {
                  this.anInt8059 = var1.readBigSmart((byte)-29) * -2095054845;
                  this.anInt8046 = var1.readBigSmart((byte)24) * 1903790841;
                  this.anInt8061 = var1.readBigSmart((byte)-59) * 921719221;
                  this.anInt8045 = var1.readBigSmart((byte)-56) * -745589619;
                  this.anInt8063 = var1.readBigSmart((byte)-43) * -139082727;
                  this.anInt8064 = var1.readBigSmart((byte)17) * 449180193;
                  this.anInt8036 = var1.readByte((byte)40) * -1531517411;
                  this.anInt8066 = var1.readByte((byte)40) * -421053479;
                  this.anInt8050 = var1.readBigSmart((byte)62) * -1091114509;
                  this.anInt8068 = var1.readBigSmart((byte)8) * 1026815821;
                  this.anInt8069 = var1.readBigSmart((byte)70) * -1154264647;
                  this.anInt8070 = var1.readBigSmart((byte)108) * 1705989461;
                  this.anInt8071 = var1.readBigSmart((byte)100) * -238865543;
                  this.anInt8072 = var1.readBigSmart((byte)54) * 299448613;
                  this.anInt8048 = var1.readBigSmart((byte)-39) * -2137896873;
               } else if(23 == var4) {
                  this.aShortArrayArray8047 = new short[10][4];
                  this.aShortArrayArrayArray8065 = new short[10][4][];

                  for(var5 = 0; var5 < 10; ++var5) {
                     for(var6 = 0; var6 < 4; ++var6) {
                        var7 = var1.readUnsignedShort(507399614);
                        if('\uffff' == var7) {
                           var7 = -1;
                        }

                        this.aShortArrayArray8047[var5][var6] = (short)var7;
                        var8 = var1.readUnsignedShort(266281423);
                        this.aShortArrayArrayArray8065[var5][var6] = new short[var8];

                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var1.readUnsignedShort(1303287369);
                           if(var10 == '\uffff') {
                              var10 = -1;
                           }

                           this.aShortArrayArrayArray8065[var5][var6][var9] = (short)var10;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   void method7237(RSByteBuffer var1) {
      boolean var2 = false;

      while(true) {
         while(true) {
            int var3 = var1.readUnsignedByte(1470670428);
            if(0 == var3) {
               if(!var2) {
                  if(null == this.anIntArray8073) {
                     this.anInt8029 = 1428466164;
                     this.anIntArray8073 = new int[4];
                     this.anIntArray8031 = new int[4];
                  }

                  for(var3 = 0; var3 < this.anIntArray8073.length; ++var3) {
                     this.anIntArray8073[var3] = 0;
                     this.anIntArray8031[var3] = var3 * 20;
                  }
               }

               return;
            }

            int var4;
            if(var3 == 1) {
               if(null == this.anIntArray8073) {
                  this.anInt8029 = 1428466164;
                  this.anIntArray8073 = new int[4];
                  this.anIntArray8031 = new int[4];
               }

               for(var4 = 0; var4 < this.anIntArray8073.length; ++var4) {
                  this.anIntArray8073[var4] = var1.readShort((byte)1);
                  this.anIntArray8031[var4] = var1.readShort((byte)1);
               }

               var2 = true;
            } else if(var3 == 2) {
               this.anInt8052 = var1.readBigSmart((byte)-81) * 131072037;
            } else if(var3 == 3) {
               this.anInt8029 = var1.readUnsignedByte(120711564) * -716625283;
               this.anIntArray8073 = new int[-137814315 * this.anInt8029];
               this.anIntArray8031 = new int[this.anInt8029 * -137814315];
            } else if(var3 == 4) {
               this.aBool8041 = false;
            } else if(var3 == 5) {
               this.anInt8039 = var1.read24BitInt(742041327) * -291031947;
            } else if(var3 == 6) {
               this.anInt8040 = var1.read24BitInt(742041327) * 1903937347;
            } else {
               int var5;
               int var6;
               int var7;
               int var8;
               int var9;
               if(var3 == 7) {
                  this.aShortArrayArray8067 = new short[10][4];
                  this.aShortArrayArrayArray8053 = new short[10][4][];

                  for(var4 = 0; var4 < 10; ++var4) {
                     for(var5 = 0; var5 < 4; ++var5) {
                        var6 = var1.readUnsignedShort(1887922085);
                        if('\uffff' == var6) {
                           var6 = -1;
                        }

                        this.aShortArrayArray8067[var4][var5] = (short)var6;
                        var7 = var1.readUnsignedShort(738974703);
                        this.aShortArrayArrayArray8053[var4][var5] = new short[var7];

                        for(var8 = 0; var8 < var7; ++var8) {
                           var9 = var1.readUnsignedShort(2094971448);
                           if('\uffff' == var9) {
                              var9 = -1;
                           }

                           this.aShortArrayArrayArray8053[var4][var5][var8] = (short)var9;
                        }
                     }
                  }
               } else if(var3 == 8) {
                  this.aBool8030 = false;
               } else if(9 == var3) {
                  this.anInt8051 = var1.readUnsignedByte(438561910) * 1091281651;
               } else if(var3 == 10) {
                  this.aBool8035 = false;
               } else if(var3 == 11) {
                  this.anInt8043 = var1.readUnsignedByte(1018510653) * -565568847;
               } else if(var3 == 12) {
                  this.anInt8028 = var1.readUnsignedShort(707022924) * -1041039597;
                  this.anInt8054 = var1.readUnsignedShort(1335804141) * -662935109;
               } else if(var3 == 13) {
                  this.anInt8044 = var1.readUnsignedByte(1172252519) * -1107676837;
               } else if(14 == var3) {
                  this.anInt8033 = var1.readUnsignedByte(1680258764) * -1283471065;
               } else if(15 == var3) {
                  this.anInt8037 = var1.readUnsignedByte(2124146970) * 939371917;
               } else if(16 == var3) {
                  this.aBool8055 = true;
               } else if(17 == var3) {
                  this.anInt8056 = var1.readInt((byte)5) * 1964303423;
               } else if(18 == var3) {
                  this.anInt8057 = var1.readInt((byte)5) * 517986783;
               } else if(var3 == 19) {
                  this.anInt8049 = var1.readInt((byte)5) * -1619164641;
               } else if(20 == var3) {
                  this.aShort8042 = (short)var1.readUnsignedShort(1736176284);
                  this.aByte8060 = (byte)var1.readUnsignedByte(-345741143);
               } else if(var3 == 21) {
                  this.anInt8062 = var1.readUnsignedByte(-111264724) * 1694294211;
               } else if(var3 == 22) {
                  this.anInt8059 = var1.readBigSmart((byte)22) * -2095054845;
                  this.anInt8046 = var1.readBigSmart((byte)-54) * 1903790841;
                  this.anInt8061 = var1.readBigSmart((byte)62) * 921719221;
                  this.anInt8045 = var1.readBigSmart((byte)-38) * -745589619;
                  this.anInt8063 = var1.readBigSmart((byte)-32) * -139082727;
                  this.anInt8064 = var1.readBigSmart((byte)-52) * 449180193;
                  this.anInt8036 = var1.readByte((byte)34) * -1531517411;
                  this.anInt8066 = var1.readByte((byte)94) * -421053479;
                  this.anInt8050 = var1.readBigSmart((byte)50) * -1091114509;
                  this.anInt8068 = var1.readBigSmart((byte)19) * 1026815821;
                  this.anInt8069 = var1.readBigSmart((byte)-18) * -1154264647;
                  this.anInt8070 = var1.readBigSmart((byte)2) * 1705989461;
                  this.anInt8071 = var1.readBigSmart((byte)66) * -238865543;
                  this.anInt8072 = var1.readBigSmart((byte)37) * 299448613;
                  this.anInt8048 = var1.readBigSmart((byte)-24) * -2137896873;
               } else if(23 == var3) {
                  this.aShortArrayArray8047 = new short[10][4];
                  this.aShortArrayArrayArray8065 = new short[10][4][];

                  for(var4 = 0; var4 < 10; ++var4) {
                     for(var5 = 0; var5 < 4; ++var5) {
                        var6 = var1.readUnsignedShort(603201073);
                        if('\uffff' == var6) {
                           var6 = -1;
                        }

                        this.aShortArrayArray8047[var4][var5] = (short)var6;
                        var7 = var1.readUnsignedShort(1372469221);
                        this.aShortArrayArrayArray8065[var4][var5] = new short[var7];

                        for(var8 = 0; var8 < var7; ++var8) {
                           var9 = var1.readUnsignedShort(1228131521);
                           if(var9 == '\uffff') {
                              var9 = -1;
                           }

                           this.aShortArrayArrayArray8065[var4][var5][var8] = (short)var9;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static int method7238(CharSequence var0, char var1, byte var2) {
      int var3 = 0;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         if(var0.charAt(var5) == var1) {
            ++var3;
         }
      }

      return var3;
   }

   public static void method7239(byte var0) {
      Class68.aClass153_782 = null;
      Class105.anInt1290 = 1764531429;
   }

   static final void method7240(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.method10311(var3).method9461((byte)0);
   }
}
