package com.jagex;

import com.jagex.Class110;
import com.jagex.Class115;
import com.jagex.Class117;
import com.jagex.Class121;
import com.jagex.Class123;
import com.jagex.Class148;
import com.jagex.Class171;
import com.jagex.Class172;
import com.jagex.Class174_Sub1;
import com.jagex.Class300;
import com.jagex.Class43;
import com.jagex.Class433;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class553;
import com.jagex.Class580;
import com.jagex.Class616;
import com.jagex.Class87;
import com.jagex.Class95;
import com.jagex.Class96;

public class Class148_Sub1 extends Class148 {
   static final int anInt9006 = 2;
   static final int anInt9007 = -1694498816;
   static final int anInt9010 = 4;
   static final boolean aBool9023 = true;
   static final int anInt9026 = 1;
   static final boolean aBool9032 = false;
   static final boolean aBool9034 = true;
   static final int anInt9038 = 64;
   Class110[][] aClass110ArrayArray9015;
   Class95[][] aClass95ArrayArray9016;
   Class117[][] aClass117ArrayArray9017;
   float aFloat9037;
   float aFloat9019;
   float aFloat9020;
   float aFloat9021;
   float aFloat9022;
   float aFloat9013;
   float aFloat9024;
   float aFloat9036;
   float aFloat9009;
   float aFloat9027;
   float aFloat9028;
   float aFloat9029;
   float aFloat9030;
   float aFloat9031;
   float aFloat9008;
   float aFloat9033;
   byte[][] aByteArrayArray9018;
   byte[][] aByteArrayArray9035;
   Class123[][] aClass123ArrayArray9025;
   Class96[][] aClass96ArrayArray9014;
   Class174_Sub1 aClass174_Sub1_9011;
   int anInt9012;

   public void method1713(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9035.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9035[var1].length - 1, Math.max(0, var2));
      if(this.aByteArrayArray9035[var1][var2] < var3) {
         this.aByteArrayArray9035[var1][var2] = (byte)var3;
      }

   }

   boolean method8399(int var1) {
      return (this.anInt9012 & 8) == 0?false:(var1 == 4?true:(var1 == 8?true:var1 == 9));
   }

   public void method1699(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      boolean var13 = (this.anInt9012 & 32) == 0;
      if(this.aClass110ArrayArray9015 == null && !var13) {
         this.aClass110ArrayArray9015 = new Class110[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass95ArrayArray9016 = new Class95[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass117ArrayArray9017 == null && var13) {
         this.aClass117ArrayArray9017 = new Class117[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass123ArrayArray9025 != null) {
         throw new IllegalStateException();
      }

      if(var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if(var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = Class87.anIntArray855[Class616.method7307(var7[var14], -797067006) & '\uffff'] << 8 | 255;
            }
         }

         if(var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if(var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = Class87.anIntArray855[Class616.method7307(var8[var14], 747979417) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var30;
         int var34;
         if(var13) {
            Class117 var28 = new Class117();
            var28.aShort1440 = (short)var3.length;
            var28.aShort1445 = (short)(var3.length / 3);
            var28.aShortArray1441 = new short[var28.aShort1440];
            var28.aShortArray1439 = new short[var28.aShort1440];
            var28.aShortArray1443 = new short[var28.aShort1440];
            var28.anIntArray1447 = new int[var28.aShort1440];
            var28.aShortArray1442 = new short[var28.aShort1440];
            var28.aShortArray1446 = new short[var28.aShort1440];
            var28.aByteArray1448 = new byte[var28.aShort1440];
            if(var6 != null) {
               var28.aShortArray1444 = new short[var28.aShort1440];
            }

            for(var15 = 0; var15 < var28.aShort1440; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if(var16 == 0 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
               } else if(var16 == 0 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
               } else {
                  var19 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var16;
                  var20 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var16;
                  var30 = var19 * (this.anInt1712 * 1934131013 - var17) + var20 * var17 >> this.anInt1710 * -1173322094;
               }

               var19 = (var1 << this.anInt1710 * -586661047) + var16;
               var20 = (var2 << this.anInt1710 * -586661047) + var17;
               var28.aShortArray1441[var15] = (short)var16;
               var28.aShortArray1443[var15] = (short)var17;
               var28.aShortArray1439[var15] = (short)(this.method1707(var19, var20, 102924348) + (var4 != null?var4[var15]:0));
               if(var30 < 0) {
                  var30 = 0;
               }

               if(var7[var15] == 0) {
                  var28.anIntArray1447[var15] = 0;
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               } else {
                  var21 = 0;
                  if(var6 != null) {
                     short var22 = var28.aShortArray1444[var15] = (short)var6[var15];
                     if(var11.anInt2020 * -1648426019 != 0) {
                        var21 = 255 * var22 / (var11.anInt2020 * -1648426019);
                        if(var21 < 0) {
                           var21 = 0;
                        } else if(var21 > 255) {
                           var21 = 255;
                        }
                     }
                  }

                  var34 = -16777216;
                  if(var9[var15] != -1) {
                     Class171 var23 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var15], (byte)109);
                     if(var23.aBool1987 && this.method8399(var23.aByte1966)) {
                        var34 = -1694498816;
                     }
                  }

                  var28.anIntArray1447[var15] = var34 | Class580.method6965(method8400(var7[var15] >> 8, var30), var11.anInt2019 * -1808050665, var21, 1800387779);
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               }

               var28.aShortArray1442[var15] = (short)var9[var15];
               var28.aShortArray1446[var15] = (short)var10[var15];
            }

            if(var8 != null) {
               var28.anIntArray1449 = new int[var28.aShort1445];

               for(var15 = 0; var15 < var28.aShort1445; ++var15) {
                  var16 = var15 * 3;
                  if(var8[var16] != 0) {
                     var28.anIntArray1449[var15] = -16777216 | var8[var16] >> 8;
                  }
               }
            }

            this.aClass117ArrayArray9017[var1][var2] = var28;
         } else {
            boolean var29 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            var30 = -1;
            if(var3.length != 6) {
               var29 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if(var3[var19] == 0 && var5[var19] == 0) {
                     if(var15 != -1 && var7[var15] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var15 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == 0) {
                     if(var16 != -1 && var7[var16] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var16 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var17 != -1 && var7[var17] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var17 = var19;
                  } else if(var3[var19] == 0 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var30 != -1 && var7[var30] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var30 = var19;
                  }
               }

               if(var15 == -1 || var16 == -1 || var17 == -1 || var30 == -1) {
                  var29 = false;
               }

               if(var29) {
                  if(var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if(var4[var19] != 0) {
                           var29 = false;
                           break;
                        }
                     }
                  }

                  if(var29) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if(var3[var19] != var3[0] && var3[var19] != var3[0] + this.anInt1712 * 1934131013 && var3[var19] != var3[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }

                        if(var5[var19] != var5[0] && var5[var19] != var5[0] + this.anInt1712 * 1934131013 && var5[var19] != var5[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if(var29) {
               Class110 var31 = new Class110();
               var20 = var7[0];
               var21 = var9[0];
               if(var8 != null) {
                  var31.anInt1332 = var8[0] >> 8;
                  if(var20 == 0) {
                     var31.aByte1329 = (byte)(var31.aByte1329 | 2);
                  }
               } else if(var20 == 0) {
                  return;
               }

               if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
                  var31.aByte1329 = (byte)(var31.aByte1329 | 1);
               }

               if(var21 != -1 && (var31.aByte1329 & 2) == 0 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var21, (byte)-10).aBool1981) {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1383758465);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 1986187016);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1958218399);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1693932621);
                  var31.aShort1333 = (short)var21;
               } else {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1690197947);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 1679401339);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1834814821);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1504005026);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1327 |= 255 - (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) << 25;
                  }

                  var31.aShort1333 = -1;
               }

               if(var6 != null) {
                  var31.aShort1323 = (short)var6[var17];
                  var31.aShort1331 = (short)var6[var30];
                  var31.aShort1324 = (short)var6[var16];
                  var31.aShort1328 = (short)var6[var15];
               }

               this.aClass110ArrayArray9015[var1][var2] = var31;
            } else {
               Class95 var33 = new Class95();
               var33.aShort1162 = (short)var3.length;
               var33.aShort1163 = (short)(var3.length / 3);
               var33.aShortArray1160 = new short[var33.aShort1162];
               var33.aShortArray1161 = new short[var33.aShort1162];
               var33.aShortArray1158 = new short[var33.aShort1162];
               var33.anIntArray1157 = new int[var33.aShort1162];
               if(var6 != null) {
                  var33.aShortArray1164 = new short[var33.aShort1162];
               }

               int var24;
               int var36;
               for(var20 = 0; var20 < var33.aShort1162; ++var20) {
                  var21 = var3[var20];
                  var34 = var5[var20];
                  boolean var35 = false;
                  int var25;
                  if(var21 == 0 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
                  } else if(var21 == 0 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
                  } else {
                     var24 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
                     var25 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
                     var36 = var24 * (this.anInt1712 * 1934131013 - var34) + var25 * var34 >> this.anInt1710 * -1173322094;
                  }

                  var24 = (var1 << this.anInt1710 * -586661047) + var21;
                  var25 = (var2 << this.anInt1710 * -586661047) + var34;
                  var33.aShortArray1160[var20] = (short)var21;
                  var33.aShortArray1158[var20] = (short)var34;
                  var33.aShortArray1161[var20] = (short)(this.method1707(var24, var25, 936254074) + (var4 != null?var4[var20]:0));
                  if(var36 < 0) {
                     var36 = 0;
                  }

                  if(var7[var20] == 0) {
                     if(var8 != null) {
                        var33.anIntArray1157[var20] = var36 << 25;
                     } else {
                        var33.anIntArray1157[var20] = 0;
                     }
                  } else {
                     int var26 = 0;
                     if(var6 != null) {
                        short var27 = var33.aShortArray1164[var20] = (short)var6[var20];
                        if(var11.anInt2020 * -1648426019 != 0) {
                           var26 = 255 * var27 / (var11.anInt2020 * -1648426019);
                           if(var26 < 0) {
                              var26 = 0;
                           } else if(var26 > 255) {
                              var26 = 255;
                           }
                        }
                     }

                     var33.anIntArray1157[var20] = Class580.method6965(method8400(var7[var20] >> 8, var36), var11.anInt2019 * -1808050665, var26, 2050953958);
                     if(var8 != null) {
                        var33.anIntArray1157[var20] |= var36 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  if(var9[var21 * 3] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var21 * 3], (byte)-69).aBool1981) {
                     var32 = true;
                  }
               }

               if(var8 != null) {
                  var33.anIntArray1167 = new int[var33.aShort1163];
               }

               if(var32) {
                  var33.aShortArray1165 = new short[var33.aShort1163];
                  var33.aShortArray1166 = new short[var33.aShort1163];
               }

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  var34 = var21 * 3;
                  if(var8 != null && var8[var34] != 0) {
                     var33.anIntArray1167[var21] = var8[var34] >> 8;
                  }

                  if(var32) {
                     var36 = var34 + 1;
                     var24 = var36 + 1;
                     boolean var37 = false;
                     boolean var39 = true;
                     int var38 = var9[var34];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)2).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var36];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)37).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var24];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)97).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     if(var39) {
                        var33.aShortArray1165[var21] = (short)var38;
                        var33.aShortArray1166[var21] = (short)var10[var34];
                     } else {
                        if(var37) {
                           var38 = var9[var34];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)62).aBool1981) {
                              var33.anIntArray1157[var34] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-5).aShort2015 & '\uffff', -2075394280) & '\uffff'];
                           }

                           var38 = var9[var36];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)13).aBool1981) {
                              var33.anIntArray1157[var36] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)59).aShort2015 & '\uffff', -393391553) & '\uffff'];
                           }

                           var38 = var9[var24];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-1).aBool1981) {
                              var33.anIntArray1157[var24] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)58).aShort2015 & '\uffff', 1137596734) & '\uffff'];
                           }
                        }

                        var33.aShortArray1165[var21] = -1;
                     }
                  }
               }

               this.aClass95ArrayArray9016[var1][var2] = var33;
            }
         }

      }
   }

   static int method8400(int var0, int var1) {
      int var2 = (var0 & 16711680) * var1 >> 23;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 253) {
         var2 = 253;
      }

      int var3 = (var0 & '\uff00') * var1 >> 15;
      if(var3 < 2) {
         var3 = 2;
      } else if(var3 > 253) {
         var3 = 253;
      }

      int var4 = (var0 & 255) * var1 >> 7;
      if(var4 < 2) {
         var4 = 2;
      } else if(var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   public void method1703(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method1739(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      boolean var13 = (this.anInt9012 & 32) == 0;
      if(this.aClass110ArrayArray9015 == null && !var13) {
         this.aClass110ArrayArray9015 = new Class110[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass95ArrayArray9016 = new Class95[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass117ArrayArray9017 == null && var13) {
         this.aClass117ArrayArray9017 = new Class117[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass123ArrayArray9025 != null) {
         throw new IllegalStateException();
      }

      if(var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if(var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = Class87.anIntArray855[Class616.method7307(var7[var14], -1303274869) & '\uffff'] << 8 | 255;
            }
         }

         if(var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if(var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = Class87.anIntArray855[Class616.method7307(var8[var14], -78976204) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var30;
         int var34;
         if(var13) {
            Class117 var28 = new Class117();
            var28.aShort1440 = (short)var3.length;
            var28.aShort1445 = (short)(var3.length / 3);
            var28.aShortArray1441 = new short[var28.aShort1440];
            var28.aShortArray1439 = new short[var28.aShort1440];
            var28.aShortArray1443 = new short[var28.aShort1440];
            var28.anIntArray1447 = new int[var28.aShort1440];
            var28.aShortArray1442 = new short[var28.aShort1440];
            var28.aShortArray1446 = new short[var28.aShort1440];
            var28.aByteArray1448 = new byte[var28.aShort1440];
            if(var6 != null) {
               var28.aShortArray1444 = new short[var28.aShort1440];
            }

            for(var15 = 0; var15 < var28.aShort1440; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if(var16 == 0 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
               } else if(var16 == 0 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
               } else {
                  var19 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var16;
                  var20 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var16;
                  var30 = var19 * (this.anInt1712 * 1934131013 - var17) + var20 * var17 >> this.anInt1710 * -1173322094;
               }

               var19 = (var1 << this.anInt1710 * -586661047) + var16;
               var20 = (var2 << this.anInt1710 * -586661047) + var17;
               var28.aShortArray1441[var15] = (short)var16;
               var28.aShortArray1443[var15] = (short)var17;
               var28.aShortArray1439[var15] = (short)(this.method1707(var19, var20, 260832794) + (var4 != null?var4[var15]:0));
               if(var30 < 0) {
                  var30 = 0;
               }

               if(var7[var15] == 0) {
                  var28.anIntArray1447[var15] = 0;
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               } else {
                  var21 = 0;
                  if(var6 != null) {
                     short var22 = var28.aShortArray1444[var15] = (short)var6[var15];
                     if(var11.anInt2020 * -1648426019 != 0) {
                        var21 = 255 * var22 / (var11.anInt2020 * -1648426019);
                        if(var21 < 0) {
                           var21 = 0;
                        } else if(var21 > 255) {
                           var21 = 255;
                        }
                     }
                  }

                  var34 = -16777216;
                  if(var9[var15] != -1) {
                     Class171 var23 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var15], (byte)-18);
                     if(var23.aBool1987 && this.method8399(var23.aByte1966)) {
                        var34 = -1694498816;
                     }
                  }

                  var28.anIntArray1447[var15] = var34 | Class580.method6965(method8400(var7[var15] >> 8, var30), var11.anInt2019 * -1808050665, var21, 1572759015);
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               }

               var28.aShortArray1442[var15] = (short)var9[var15];
               var28.aShortArray1446[var15] = (short)var10[var15];
            }

            if(var8 != null) {
               var28.anIntArray1449 = new int[var28.aShort1445];

               for(var15 = 0; var15 < var28.aShort1445; ++var15) {
                  var16 = var15 * 3;
                  if(var8[var16] != 0) {
                     var28.anIntArray1449[var15] = -16777216 | var8[var16] >> 8;
                  }
               }
            }

            this.aClass117ArrayArray9017[var1][var2] = var28;
         } else {
            boolean var29 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            var30 = -1;
            if(var3.length != 6) {
               var29 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if(var3[var19] == 0 && var5[var19] == 0) {
                     if(var15 != -1 && var7[var15] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var15 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == 0) {
                     if(var16 != -1 && var7[var16] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var16 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var17 != -1 && var7[var17] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var17 = var19;
                  } else if(var3[var19] == 0 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var30 != -1 && var7[var30] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var30 = var19;
                  }
               }

               if(var15 == -1 || var16 == -1 || var17 == -1 || var30 == -1) {
                  var29 = false;
               }

               if(var29) {
                  if(var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if(var4[var19] != 0) {
                           var29 = false;
                           break;
                        }
                     }
                  }

                  if(var29) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if(var3[var19] != var3[0] && var3[var19] != var3[0] + this.anInt1712 * 1934131013 && var3[var19] != var3[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }

                        if(var5[var19] != var5[0] && var5[var19] != var5[0] + this.anInt1712 * 1934131013 && var5[var19] != var5[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if(var29) {
               Class110 var31 = new Class110();
               var20 = var7[0];
               var21 = var9[0];
               if(var8 != null) {
                  var31.anInt1332 = var8[0] >> 8;
                  if(var20 == 0) {
                     var31.aByte1329 = (byte)(var31.aByte1329 | 2);
                  }
               } else if(var20 == 0) {
                  return;
               }

               if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
                  var31.aByte1329 = (byte)(var31.aByte1329 | 1);
               }

               if(var21 != -1 && (var31.aByte1329 & 2) == 0 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var21, (byte)20).aBool1981) {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1734655931);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 1478320601);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1484234301);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1367862341);
                  var31.aShort1333 = (short)var21;
               } else {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1618991209);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 2038586161);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1982777524);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1421373230);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1327 |= 255 - (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) << 25;
                  }

                  var31.aShort1333 = -1;
               }

               if(var6 != null) {
                  var31.aShort1323 = (short)var6[var17];
                  var31.aShort1331 = (short)var6[var30];
                  var31.aShort1324 = (short)var6[var16];
                  var31.aShort1328 = (short)var6[var15];
               }

               this.aClass110ArrayArray9015[var1][var2] = var31;
            } else {
               Class95 var33 = new Class95();
               var33.aShort1162 = (short)var3.length;
               var33.aShort1163 = (short)(var3.length / 3);
               var33.aShortArray1160 = new short[var33.aShort1162];
               var33.aShortArray1161 = new short[var33.aShort1162];
               var33.aShortArray1158 = new short[var33.aShort1162];
               var33.anIntArray1157 = new int[var33.aShort1162];
               if(var6 != null) {
                  var33.aShortArray1164 = new short[var33.aShort1162];
               }

               int var24;
               int var36;
               for(var20 = 0; var20 < var33.aShort1162; ++var20) {
                  var21 = var3[var20];
                  var34 = var5[var20];
                  boolean var35 = false;
                  int var25;
                  if(var21 == 0 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
                  } else if(var21 == 0 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
                  } else {
                     var24 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
                     var25 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
                     var36 = var24 * (this.anInt1712 * 1934131013 - var34) + var25 * var34 >> this.anInt1710 * -1173322094;
                  }

                  var24 = (var1 << this.anInt1710 * -586661047) + var21;
                  var25 = (var2 << this.anInt1710 * -586661047) + var34;
                  var33.aShortArray1160[var20] = (short)var21;
                  var33.aShortArray1158[var20] = (short)var34;
                  var33.aShortArray1161[var20] = (short)(this.method1707(var24, var25, -856156838) + (var4 != null?var4[var20]:0));
                  if(var36 < 0) {
                     var36 = 0;
                  }

                  if(var7[var20] == 0) {
                     if(var8 != null) {
                        var33.anIntArray1157[var20] = var36 << 25;
                     } else {
                        var33.anIntArray1157[var20] = 0;
                     }
                  } else {
                     int var26 = 0;
                     if(var6 != null) {
                        short var27 = var33.aShortArray1164[var20] = (short)var6[var20];
                        if(var11.anInt2020 * -1648426019 != 0) {
                           var26 = 255 * var27 / (var11.anInt2020 * -1648426019);
                           if(var26 < 0) {
                              var26 = 0;
                           } else if(var26 > 255) {
                              var26 = 255;
                           }
                        }
                     }

                     var33.anIntArray1157[var20] = Class580.method6965(method8400(var7[var20] >> 8, var36), var11.anInt2019 * -1808050665, var26, 1806541470);
                     if(var8 != null) {
                        var33.anIntArray1157[var20] |= var36 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  if(var9[var21 * 3] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var21 * 3], (byte)-9).aBool1981) {
                     var32 = true;
                  }
               }

               if(var8 != null) {
                  var33.anIntArray1167 = new int[var33.aShort1163];
               }

               if(var32) {
                  var33.aShortArray1165 = new short[var33.aShort1163];
                  var33.aShortArray1166 = new short[var33.aShort1163];
               }

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  var34 = var21 * 3;
                  if(var8 != null && var8[var34] != 0) {
                     var33.anIntArray1167[var21] = var8[var34] >> 8;
                  }

                  if(var32) {
                     var36 = var34 + 1;
                     var24 = var36 + 1;
                     boolean var37 = false;
                     boolean var39 = true;
                     int var38 = var9[var34];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)43).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var36];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)107).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var24];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-108).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     if(var39) {
                        var33.aShortArray1165[var21] = (short)var38;
                        var33.aShortArray1166[var21] = (short)var10[var34];
                     } else {
                        if(var37) {
                           var38 = var9[var34];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)31).aBool1981) {
                              var33.anIntArray1157[var34] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-37).aShort2015 & '\uffff', -327003061) & '\uffff'];
                           }

                           var38 = var9[var36];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)94).aBool1981) {
                              var33.anIntArray1157[var36] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-3).aShort2015 & '\uffff', -1787326415) & '\uffff'];
                           }

                           var38 = var9[var24];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-125).aBool1981) {
                              var33.anIntArray1157[var24] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-34).aShort2015 & '\uffff', 597083777) & '\uffff'];
                           }
                        }

                        var33.aShortArray1165[var21] = -1;
                     }
                  }
               }

               this.aClass95ArrayArray9016[var1][var2] = var33;
            }
         }

      }
   }

   void method8401(int var1, int var2, int var3) {
      Class115 var4 = this.aClass174_Sub1_9011.method8502(Thread.currentThread());
      var4.aClass121_1387.anInt1543 = 0;
      if(this.aClass110ArrayArray9015 != null) {
         this.method8402(var1, var2, var4.aBool1381, var4, var4.aClass121_1387, var4.aFloatArray1395, var4.aFloatArray1373, var4.aFloatArray1415, var4.aFloatArray1409, var4.aFloatArray1383, var3);
      } else if(this.aClass123ArrayArray9025 != null) {
         this.method8407(var1, var2, var4.aClass121_1387, var4.aFloatArray1395, var4.aFloatArray1373, var4.aFloatArray1415, var4.aFloatArray1409, var4.aFloatArray1383, var3);
      } else if(this.aClass117ArrayArray9017 != null) {
         this.method8403(var1, var2, var4.aBool1381, var4, var4.aClass121_1387, var4.aFloatArray1395, var4.aFloatArray1373, var4.aFloatArray1415, var4.aFloatArray1409, var4.aFloatArray1383, var3);
      }

   }

   public void method1726(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass174_Sub1_9011.anIntArray9243 != null && this.aClass174_Sub1_9011.aFloatArray9246 != null) {
         Class433 var7 = this.aClass174_Sub1_9011.aClass433_9240;
         this.aFloat9037 = var7.aFloatArray4841[0];
         this.aFloat9019 = var7.aFloatArray4841[1];
         this.aFloat9020 = var7.aFloatArray4841[2];
         this.aFloat9021 = var7.aFloatArray4841[3];
         this.aFloat9022 = var7.aFloatArray4841[4];
         this.aFloat9013 = var7.aFloatArray4841[5];
         this.aFloat9024 = var7.aFloatArray4841[6];
         this.aFloat9036 = var7.aFloatArray4841[7];
         this.aFloat9009 = var7.aFloatArray4841[8];
         this.aFloat9027 = var7.aFloatArray4841[9];
         this.aFloat9028 = var7.aFloatArray4841[10];
         this.aFloat9029 = var7.aFloatArray4841[11];
         this.aFloat9030 = var7.aFloatArray4841[12];
         this.aFloat9031 = var7.aFloatArray4841[13];
         this.aFloat9008 = var7.aFloatArray4841[14];
         this.aFloat9033 = var7.aFloatArray4841[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.anInt1711 * 1966165105 && var11 >= 0 && var11 < this.anInt1713 * -810756899) {
                     this.method8401(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   void method8402(int var1, int var2, boolean var3, Class115 var4, Class121 var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      Class110 var12 = this.aClass110ArrayArray9015[var1][var2];
      int var14;
      int var15;
      int var16;
      float var33;
      float var34;
      float var35;
      float var39;
      float var40;
      float var42;
      float var43;
      float var44;
      float var47;
      float var48;
      float var50;
      float var51;
      float var52;
      if(var12 != null) {
         if((var12.aByte1329 & 2) == 0) {
            if(var11 != 0) {
               if((var12.aByte1329 & 4) != 0) {
                  if((var11 & 1) != 0) {
                     return;
                  }
               } else if((var11 & 2) != 0) {
                  return;
               }
            }

            int var55 = var1 * this.anInt1712 * 1934131013;
            var14 = var55 + this.anInt1712 * 1934131013;
            var15 = var2 * this.anInt1712 * 1934131013;
            var16 = var15 + this.anInt1712 * 1934131013;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;
            int var21;
            float var24;
            float var25;
            float var26;
            float var27;
            float var28;
            float var29;
            float var30;
            float var31;
            float var36;
            int var38;
            float var53;
            float var61;
            float var62;
            float var64;
            float var65;
            float var66;
            float var67;
            float var69;
            if((var12.aByte1329 & 1) != 0 && !var3) {
               var21 = this.anIntArrayArray1714[var1][var2];
               float var57 = this.aFloat9024 * (float)var21;
               float var59 = this.aFloat9036 * (float)var21;
               var24 = this.aFloat9008 + this.aFloat9020 * (float)var55 + var57 + this.aFloat9028 * (float)var15;
               var25 = this.aFloat9033 + this.aFloat9021 * (float)var55 + var59 + this.aFloat9029 * (float)var15;
               if(var24 < -var25) {
                  return;
               }

               var26 = this.aFloat9008 + this.aFloat9020 * (float)var14 + var57 + this.aFloat9028 * (float)var15;
               var27 = this.aFloat9033 + this.aFloat9021 * (float)var14 + var59 + this.aFloat9029 * (float)var15;
               if(var26 < -var27) {
                  return;
               }

               var28 = this.aFloat9008 + this.aFloat9020 * (float)var14 + var57 + this.aFloat9028 * (float)var16;
               var29 = this.aFloat9033 + this.aFloat9021 * (float)var14 + var59 + this.aFloat9029 * (float)var16;
               if(var28 < -var29) {
                  return;
               }

               var30 = this.aFloat9008 + this.aFloat9020 * (float)var55 + var57 + this.aFloat9028 * (float)var16;
               var31 = this.aFloat9033 + this.aFloat9021 * (float)var55 + var59 + this.aFloat9029 * (float)var16;
               if(var30 < -var31) {
                  return;
               }

               var61 = var5.aFloat1547 + var5.aFloat1541 * var24 / var25;
               var33 = var5.aFloat1547 + var5.aFloat1541 * var26 / var27;
               var34 = var5.aFloat1547 + var5.aFloat1541 * var28 / var29;
               var35 = var5.aFloat1547 + var5.aFloat1541 * var30 / var31;
               if(var4.aBool1376) {
                  var36 = var24 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var17 = var36 / var4.aFloat1378;
                     if(var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  var36 = var26 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var18 = var36 / var4.aFloat1378;
                     if(var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  var36 = var28 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var19 = var36 / var4.aFloat1378;
                     if(var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  var36 = var30 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var20 = var36 / var4.aFloat1378;
                     if(var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               var62 = this.aFloat9022 * (float)var21;
               float var63 = this.aFloat9013 * (float)var21;
               var39 = this.aFloat9030 + this.aFloat9037 * (float)var55 + var62 + this.aFloat9009 * (float)var15;
               var40 = var5.aFloat1534 + var5.aFloat1537 * var39 / var25;
               var64 = this.aFloat9031 + this.aFloat9019 * (float)var55 + var63 + this.aFloat9027 * (float)var15;
               var42 = var5.aFloat1553 + var5.aFloat1539 * var64 / var25;
               var43 = this.aFloat9030 + this.aFloat9037 * (float)var14 + var62 + this.aFloat9009 * (float)var15;
               var44 = var5.aFloat1534 + var5.aFloat1537 * var43 / var27;
               var65 = this.aFloat9031 + this.aFloat9019 * (float)var14 + var63 + this.aFloat9027 * (float)var15;
               var66 = var5.aFloat1553 + var5.aFloat1539 * var65 / var27;
               var47 = this.aFloat9030 + this.aFloat9037 * (float)var14 + var62 + this.aFloat9009 * (float)var16;
               var48 = var5.aFloat1534 + var5.aFloat1537 * var47 / var29;
               var67 = this.aFloat9031 + this.aFloat9019 * (float)var14 + var63 + this.aFloat9027 * (float)var16;
               var50 = var5.aFloat1553 + var5.aFloat1539 * var67 / var29;
               var51 = this.aFloat9030 + this.aFloat9037 * (float)var55 + var62 + this.aFloat9009 * (float)var16;
               var52 = var5.aFloat1534 + var5.aFloat1537 * var51 / var31;
               var53 = this.aFloat9031 + this.aFloat9019 * (float)var55 + var63 + this.aFloat9027 * (float)var16;
               var69 = var5.aFloat1553 + var5.aFloat1539 * var53 / var31;
            } else {
               var21 = this.anIntArrayArray1714[var1][var2];
               int var22 = this.anIntArrayArray1714[var1 + 1][var2];
               int var23 = this.anIntArrayArray1714[var1 + 1][var2 + 1];
               int var37 = this.anIntArrayArray1714[var1][var2 + 1];
               var24 = this.aFloat9008 + this.aFloat9020 * (float)var55 + this.aFloat9024 * (float)var21 + this.aFloat9028 * (float)var15;
               var25 = this.aFloat9033 + this.aFloat9021 * (float)var55 + this.aFloat9036 * (float)var21 + this.aFloat9029 * (float)var15;
               if(var24 < -var25) {
                  return;
               }

               var26 = this.aFloat9008 + this.aFloat9020 * (float)var14 + this.aFloat9024 * (float)var22 + this.aFloat9028 * (float)var15;
               var27 = this.aFloat9033 + this.aFloat9021 * (float)var14 + this.aFloat9036 * (float)var22 + this.aFloat9029 * (float)var15;
               if(var26 < -var27) {
                  return;
               }

               var28 = this.aFloat9008 + this.aFloat9020 * (float)var14 + this.aFloat9024 * (float)var23 + this.aFloat9028 * (float)var16;
               var29 = this.aFloat9033 + this.aFloat9021 * (float)var14 + this.aFloat9036 * (float)var23 + this.aFloat9029 * (float)var16;
               if(var28 < -var29) {
                  return;
               }

               var30 = this.aFloat9008 + this.aFloat9020 * (float)var55 + this.aFloat9024 * (float)var37 + this.aFloat9028 * (float)var16;
               var31 = this.aFloat9033 + this.aFloat9021 * (float)var55 + this.aFloat9036 * (float)var37 + this.aFloat9029 * (float)var16;
               if(var30 < -var31) {
                  return;
               }

               var61 = var5.aFloat1547 + var5.aFloat1541 * var24 / var25;
               var33 = var5.aFloat1547 + var5.aFloat1541 * var26 / var27;
               var34 = var5.aFloat1547 + var5.aFloat1541 * var28 / var29;
               var35 = var5.aFloat1547 + var5.aFloat1541 * var30 / var31;
               if(var3) {
                  var36 = var24 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat1378;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var17 = var36;
                     var38 = (int)((float)var12.aShort1328 * var36);
                     if(var38 > 0) {
                        var21 -= var38;
                     }
                  }

                  var36 = var26 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat1378;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var18 = var36;
                     var38 = (int)((float)var12.aShort1324 * var36);
                     if(var38 > 0) {
                        var22 -= var38;
                     }
                  }

                  var36 = var28 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat1378;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var19 = var36;
                     var38 = (int)((float)var12.aShort1323 * var36);
                     if(var38 > 0) {
                        var23 -= var38;
                     }
                  }

                  var36 = var30 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat1378;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var20 = var36;
                     var38 = (int)((float)var12.aShort1331 * var36);
                     if(var38 > 0) {
                        var37 -= var38;
                     }
                  }
               } else if(var4.aBool1376) {
                  var36 = var24 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var17 = var36 / var4.aFloat1378;
                     if(var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  var36 = var26 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var18 = var36 / var4.aFloat1378;
                     if(var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  var36 = var28 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var19 = var36 / var4.aFloat1378;
                     if(var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  var36 = var30 - var4.aFloat1377;
                  if(var36 > 0.0F) {
                     var20 = var36 / var4.aFloat1378;
                     if(var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               var39 = this.aFloat9030 + this.aFloat9037 * (float)var55 + this.aFloat9022 * (float)var21 + this.aFloat9009 * (float)var15;
               var40 = var5.aFloat1534 + var5.aFloat1537 * var39 / var25;
               var64 = this.aFloat9031 + this.aFloat9019 * (float)var55 + this.aFloat9013 * (float)var21 + this.aFloat9027 * (float)var15;
               var42 = var5.aFloat1553 + var5.aFloat1539 * var64 / var25;
               var43 = this.aFloat9030 + this.aFloat9037 * (float)var14 + this.aFloat9022 * (float)var22 + this.aFloat9009 * (float)var15;
               var44 = var5.aFloat1534 + var5.aFloat1537 * var43 / var27;
               var65 = this.aFloat9031 + this.aFloat9019 * (float)var14 + this.aFloat9013 * (float)var22 + this.aFloat9027 * (float)var15;
               var66 = var5.aFloat1553 + var5.aFloat1539 * var65 / var27;
               var47 = this.aFloat9030 + this.aFloat9037 * (float)var14 + this.aFloat9022 * (float)var23 + this.aFloat9009 * (float)var16;
               var48 = var5.aFloat1534 + var5.aFloat1537 * var47 / var29;
               var67 = this.aFloat9031 + this.aFloat9019 * (float)var14 + this.aFloat9013 * (float)var23 + this.aFloat9027 * (float)var16;
               var50 = var5.aFloat1553 + var5.aFloat1539 * var67 / var29;
               var51 = this.aFloat9030 + this.aFloat9037 * (float)var55 + this.aFloat9022 * (float)var37 + this.aFloat9009 * (float)var16;
               var52 = var5.aFloat1534 + var5.aFloat1537 * var51 / var31;
               var53 = this.aFloat9031 + this.aFloat9019 * (float)var55 + this.aFloat9013 * (float)var37 + this.aFloat9027 * (float)var16;
               var69 = var5.aFloat1553 + var5.aFloat1539 * var53 / var31;
            }

            Class171 var56 = null;
            boolean var58 = false;
            if(var12.aShort1333 != -1) {
               var56 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var12.aShort1333 & '\uffff', (byte)65);
               var58 = var56.aBool1987;
            }

            boolean var60 = var56 != null && this.method8399(var56.aByte1966);
            var62 = var18 + var19 + var20;
            if((var48 - var52) * (var66 - var69) - (var50 - var69) * (var44 - var52) > 0.0F) {
               var5.aBool1556 = var48 < 0.0F || var52 < 0.0F || var44 < 0.0F || var48 > (float)var5.anInt1542 || var52 > (float)var5.anInt1542 || var44 > (float)var5.anInt1542;
               if(var62 < 3.0F) {
                  if(var62 > 0.0F) {
                     if(var58) {
                        var38 = -16777216;
                        if(var60) {
                           var38 = -1694498816;
                        }

                        var5.method1461(true, true, false, var50, var69, var66, var48, var52, var44, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var38 | var12.anInt1326 & 16777215, var38 | var12.anInt1327 & 16777215, var38 | var12.anInt1325 & 16777215, var4.anInt1379 * 1196864617, var19 * 255.0F, var20 * 255.0F, var18 * 255.0F, var12.aShort1333 & '\uffff');
                     } else {
                        if(var60) {
                           var5.anInt1543 = 100;
                        }

                        var5.method1469(true, true, false, var50, var69, var66, var48, var52, var44, var34, var35, var33, Class43.method911(var12.anInt1326, (int)(var19 * 255.0F) << 24 | var4.anInt1379 * 1196864617, -2059694894), Class43.method911(var12.anInt1327, (int)(var20 * 255.0F) << 24 | var4.anInt1379 * 1196864617, -2144720496), Class43.method911(var12.anInt1325, (int)(var18 * 255.0F) << 24 | var4.anInt1379 * 1196864617, -2124886817));
                        var5.anInt1543 = 0;
                     }
                  } else if(var58) {
                     var38 = -16777216;
                     if(var60) {
                        var38 = -1694498816;
                     }

                     var5.method1461(true, true, false, var50, var69, var66, var48, var52, var44, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var38 | var12.anInt1326 & 16777215, var38 | var12.anInt1327 & 16777215, var38 | var12.anInt1325 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.aShort1333 & '\uffff');
                  } else {
                     if(var60) {
                        var5.anInt1543 = 100;
                     }

                     var5.method1469(true, true, false, var50, var69, var66, var48, var52, var44, var34, var35, var33, var12.anInt1326, var12.anInt1327, var12.anInt1325);
                     var5.anInt1543 = 0;
                  }
               } else {
                  var5.method1459(true, true, false, var50, var69, var66, var48, var52, var44, var34, var35, var33, var4.anInt1379 * 1196864617);
               }
            }

            var62 = var17 + var18 + var20;
            if((var40 - var44) * (var69 - var66) - (var42 - var66) * (var52 - var44) > 0.0F) {
               var5.aBool1556 = var40 < 0.0F || var44 < 0.0F || var52 < 0.0F || var40 > (float)var5.anInt1542 || var44 > (float)var5.anInt1542 || var52 > (float)var5.anInt1542;
               if(var62 < 3.0F) {
                  if(var60) {
                     var5.anInt1543 = -1694498816;
                  }

                  if(var62 > 0.0F) {
                     if(var58) {
                        var38 = -16777216;
                        if(var60) {
                           var38 = -1694498816;
                        }

                        var5.method1461(true, true, false, var42, var66, var69, var40, var44, var52, var61, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var38 | var12.anInt1330 & 16777215, var38 | var12.anInt1325 & 16777215, var38 | var12.anInt1327 & 16777215, var4.anInt1379 * 1196864617, var17 * 255.0F, var18 * 255.0F, var20 * 255.0F, var12.aShort1333 & '\uffff');
                     } else {
                        if(var60) {
                           var5.anInt1543 = 100;
                        }

                        var5.method1469(true, true, false, var42, var66, var69, var40, var44, var52, var61, var33, var35, Class43.method911(var12.anInt1330, (int)(var17 * 255.0F) << 24 | var4.anInt1379 * 1196864617, -2010968380), Class43.method911(var12.anInt1325, (int)(var18 * 255.0F) << 24 | var4.anInt1379 * 1196864617, -2139342818), Class43.method911(var12.anInt1327, (int)(var20 * 255.0F) << 24 | var4.anInt1379 * 1196864617, -2083329586));
                        var5.anInt1543 = 0;
                     }
                  } else if(var58) {
                     var38 = -16777216;
                     if(var60) {
                        var38 = -1694498816;
                     }

                     var5.method1461(true, true, false, var42, var66, var69, var40, var44, var52, var61, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var38 | var12.anInt1330 & 16777215, var38 | var12.anInt1325 & 16777215, var38 | var12.anInt1327 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.aShort1333 & '\uffff');
                  } else {
                     if(var60) {
                        var5.anInt1543 = 100;
                     }

                     var5.method1469(true, true, false, var42, var66, var69, var40, var44, var52, var61, var33, var35, var12.anInt1330, var12.anInt1325, var12.anInt1327);
                     var5.anInt1543 = 0;
                  }
               } else {
                  var5.method1459(true, true, false, var42, var66, var69, var40, var44, var52, var61, var33, var35, var4.anInt1379 * 1196864617);
               }
            }

         }
      } else {
         Class95 var13 = this.aClass95ArrayArray9016[var1][var2];
         if(var13 != null) {
            if(var11 != 0) {
               if((var13.aByte1159 & 4) != 0) {
                  if((var11 & 1) != 0) {
                     return;
                  }
               } else if((var11 & 2) != 0) {
                  return;
               }
            }

            int var46;
            int var54;
            for(var46 = 0; var46 < var13.aShort1162; ++var46) {
               var14 = var13.aShortArray1160[var46] + (var1 << this.anInt1710 * -586661047);
               var15 = var13.aShortArray1161[var46];
               var16 = var13.aShortArray1158[var46] + (var2 << this.anInt1710 * -586661047);
               var48 = this.aFloat9008 + this.aFloat9020 * (float)var14 + this.aFloat9024 * (float)var15 + this.aFloat9028 * (float)var16;
               var52 = this.aFloat9033 + this.aFloat9021 * (float)var14 + this.aFloat9036 * (float)var15 + this.aFloat9029 * (float)var16;
               if(var48 < -var52) {
                  return;
               }

               var42 = var5.aFloat1547 + var5.aFloat1541 * var48 / var52;
               var10[var46] = 0.0F;
               if(var3) {
                  var50 = var48 - var4.aFloat1377;
                  if(var50 > 0.0F) {
                     var50 /= var4.aFloat1378;
                     if(var50 > 1.0F) {
                        var50 = 1.0F;
                     }

                     var10[var46] = var50;
                     var54 = (int)((float)var13.aShortArray1164[var46] * var50);
                     if(var54 > 0) {
                        var15 -= var54;
                     }
                  }
               } else if(var4.aBool1376) {
                  var50 = var48 - var4.aFloat1377;
                  if(var50 > 0.0F) {
                     var10[var46] = var50 / var4.aFloat1378;
                     if(var10[var46] > 1.0F) {
                        var10[var46] = 1.0F;
                     }
                  }
               }

               var40 = this.aFloat9030 + this.aFloat9037 * (float)var14 + this.aFloat9022 * (float)var15 + this.aFloat9009 * (float)var16;
               var44 = this.aFloat9031 + this.aFloat9019 * (float)var14 + this.aFloat9013 * (float)var15 + this.aFloat9027 * (float)var16;
               var6[var46] = var5.aFloat1534 + var5.aFloat1537 * var40 / var52;
               var7[var46] = var5.aFloat1553 + var5.aFloat1539 * var44 / var52;
               var8[var46] = var42;
               var9[var46] = var52;
            }

            int var32;
            int var68;
            if(var13.aShortArray1165 != null) {
               for(var46 = 0; var46 < var13.aShort1163; ++var46) {
                  var68 = var46 * 3;
                  var54 = var68 + 1;
                  var32 = var54 + 1;
                  var33 = var6[var68];
                  var34 = var6[var54];
                  var35 = var6[var32];
                  var39 = var7[var68];
                  var43 = var7[var54];
                  var47 = var7[var32];
                  var51 = var10[var68] + var10[var54] + var10[var32];
                  if((var33 - var34) * (var47 - var43) - (var39 - var43) * (var35 - var34) > 0.0F) {
                     var5.aBool1556 = var33 < 0.0F || var34 < 0.0F || var35 < 0.0F || var33 > (float)var5.anInt1542 || var34 > (float)var5.anInt1542 || var35 > (float)var5.anInt1542;
                     Class171 var41 = null;
                     boolean var45 = false;
                     if(var13.aShortArray1165[var46] != -1) {
                        var41 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var13.aShortArray1165[var46] & '\uffff', (byte)-63);
                        var45 = var41.aBool1987;
                     }

                     if(var51 < 3.0F) {
                        int var49;
                        if(var51 > 0.0F) {
                           if(var45) {
                              var49 = -16777216;
                              if(this.method8399(var41.aByte1966)) {
                                 var49 = -1694498816;
                              }

                              var5.method1461(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], var9[var68], var9[var54], var9[var32], (float)var13.aShortArray1160[var68] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1160[var54] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1160[var32] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1158[var68] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1158[var54] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1158[var32] / (float)(this.anInt1712 * 1934131013), var49 | var13.anIntArray1157[var68] & 16777215, var49 | var13.anIntArray1157[var54] & 16777215, var49 | var13.anIntArray1157[var32] & 16777215, var4.anInt1379 * 1196864617, var10[var68] * 255.0F, var10[var54] * 255.0F, var10[var32] * 255.0F, var13.aShortArray1165[var46] & '\uffff');
                           } else if((var13.anIntArray1157[var68] & 16777215) != 0) {
                              var5.method1469(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], Class43.method911(var13.anIntArray1157[var68], (int)(var10[var68] * 255.0F) << 24 | var4.anInt1379 * 1196864617, -1976908876), Class43.method911(var13.anIntArray1157[var54], (int)(var10[var54] * 255.0F) << 24 | var4.anInt1379 * 1196864617, -1981984181), Class43.method911(var13.anIntArray1157[var32], (int)(var10[var32] * 255.0F) << 24 | var4.anInt1379 * 1196864617, -2085839517));
                              var5.anInt1543 = 0;
                           }
                        } else if(var45) {
                           var49 = -16777216;
                           if(this.method8399(var41.aByte1966)) {
                              var49 = -1694498816;
                           }

                           var5.method1461(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], var9[var68], var9[var54], var9[var32], (float)var13.aShortArray1160[var68] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1160[var54] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1160[var32] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1158[var68] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1158[var54] / (float)(this.anInt1712 * 1934131013), (float)var13.aShortArray1158[var32] / (float)(this.anInt1712 * 1934131013), var49 | var13.anIntArray1157[var68] & 16777215, var49 | var13.anIntArray1157[var54] & 16777215, var49 | var13.anIntArray1157[var32] & 16777215, 0, 0.0F, 0.0F, 0.0F, var13.aShortArray1165[var46] & '\uffff');
                        } else if((var13.anIntArray1157[var68] & 16777215) != 0) {
                           var5.method1469(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], var13.anIntArray1157[var68], var13.anIntArray1157[var54], var13.anIntArray1157[var32]);
                           var5.anInt1543 = 0;
                        }
                     } else {
                        var5.method1459(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], var4.anInt1379 * 1196864617);
                     }
                  }
               }
            } else {
               for(var46 = 0; var46 < var13.aShort1163; ++var46) {
                  var68 = var46 * 3;
                  var54 = var68 + 1;
                  var32 = var54 + 1;
                  var33 = var6[var68];
                  var34 = var6[var54];
                  var35 = var6[var32];
                  var39 = var7[var68];
                  var43 = var7[var54];
                  var47 = var7[var32];
                  var51 = var10[var68] + var10[var54] + var10[var32];
                  if((var33 - var34) * (var47 - var43) - (var39 - var43) * (var35 - var34) > 0.0F) {
                     var5.aBool1556 = var33 < 0.0F || var34 < 0.0F || var35 < 0.0F || var33 > (float)var5.anInt1542 || var34 > (float)var5.anInt1542 || var35 > (float)var5.anInt1542;
                     if(var51 < 3.0F) {
                        if(var51 > 0.0F) {
                           if((var13.anIntArray1157[var68] & 16777215) != 0) {
                              var5.method1469(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], Class300.method3992(var13.anIntArray1157[var68], var4.anInt1379 * 1196864617, var10[var68] * 255.0F, 1832825041), Class300.method3992(var13.anIntArray1157[var54], var4.anInt1379 * 1196864617, var10[var54] * 255.0F, 612711497), Class300.method3992(var13.anIntArray1157[var32], var4.anInt1379 * 1196864617, var10[var32] * 255.0F, 1838153263));
                           }
                        } else if((var13.anIntArray1157[var68] & 16777215) != 0) {
                           var5.method1469(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], var13.anIntArray1157[var68], var13.anIntArray1157[var54], var13.anIntArray1157[var32]);
                        }
                     } else {
                        var5.method1459(true, true, false, var39, var43, var47, var33, var34, var35, var8[var68], var8[var54], var8[var32], var4.anInt1379 * 1196864617);
                     }
                  }
               }
            }
         }

      }
   }

   void method8403(int var1, int var2, boolean var3, Class115 var4, Class121 var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      Class117 var12 = this.aClass117ArrayArray9017[var1][var2];
      if(var11 == 0 || (var11 & 2) == 0) {
         if(var12 != null) {
            int var20;
            for(int var13 = 0; var13 < var12.aShort1440; ++var13) {
               int var14 = var12.aShortArray1441[var13] + (var1 << this.anInt1710 * -586661047);
               int var15 = var12.aShortArray1439[var13];
               int var16 = var12.aShortArray1443[var13] + (var2 << this.anInt1710 * -586661047);
               float var17 = this.aFloat9008 + this.aFloat9020 * (float)var14 + this.aFloat9024 * (float)var15 + this.aFloat9028 * (float)var16;
               float var18 = this.aFloat9033 + this.aFloat9021 * (float)var14 + this.aFloat9036 * (float)var15 + this.aFloat9029 * (float)var16;
               if(var17 < -var18) {
                  return;
               }

               var10[var13] = 0.0F;
               float var19;
               if(var3) {
                  var19 = var17 - var4.aFloat1377;
                  if(var19 > 0.0F) {
                     var19 /= var4.aFloat1378;
                     if(var19 > 1.0F) {
                        var19 = 1.0F;
                     }

                     var10[var13] = var19;
                     var20 = (int)((float)var12.aShortArray1444[var13] * var19);
                     if(var20 > 0) {
                        var15 -= var20;
                     }
                  }
               } else if(var4.aBool1376) {
                  var19 = var17 - var4.aFloat1377;
                  if(var19 > 0.0F) {
                     var10[var13] = var19 / var4.aFloat1378;
                     if(var10[var13] > 1.0F) {
                        var10[var13] = 1.0F;
                     }
                  }
               }

               float var21 = this.aFloat9030 + this.aFloat9037 * (float)var14 + this.aFloat9022 * (float)var15 + this.aFloat9009 * (float)var16;
               float var22 = this.aFloat9031 + this.aFloat9019 * (float)var14 + this.aFloat9013 * (float)var15 + this.aFloat9027 * (float)var16;
               var6[var13] = var5.aFloat1534 + var5.aFloat1537 * var21 / var18;
               var7[var13] = var5.aFloat1553 + var5.aFloat1539 * var22 / var18;
               var8[var13] = var5.aFloat1547 + var5.aFloat1541 * var17 / var18;
               var9[var13] = var18;
            }

            float var33 = (float)(this.anInt1712 * 1934131013);

            for(int var34 = 0; var34 < var12.aShort1445; ++var34) {
               var20 = var34 * 3;
               int var23 = var20 + 1;
               int var24 = var23 + 1;
               float var25 = var6[var20];
               float var26 = var6[var23];
               float var27 = var6[var24];
               float var28 = var7[var20];
               float var29 = var7[var23];
               float var30 = var7[var24];
               if((var25 - var26) * (var30 - var29) - (var28 - var29) * (var27 - var26) > 0.0F) {
                  var5.aBool1556 = var25 < 0.0F || var26 < 0.0F || var27 < 0.0F || var25 > (float)var5.anInt1542 || var26 > (float)var5.anInt1542 || var27 > (float)var5.anInt1542;
                  if(var10[var20] + var10[var23] + var10[var24] < 3.0F) {
                     int var31 = var1 << this.anInt1710 * -586661047;
                     int var32 = var2 << this.anInt1710 * -586661047;
                     if((var12.anIntArray1447[var20] & 16777215) != 0) {
                        if(var12.aShortArray1442[var20] != -1 && var12.aShortArray1442[var23] != -1 && var12.aShortArray1442[var24] != -1) {
                           if(var12.aShortArray1442[var20] == var12.aShortArray1442[var23] && var12.aShortArray1442[var20] == var12.aShortArray1442[var24] && var12.aShortArray1446[var20] == var12.aShortArray1446[var23] && var12.aShortArray1446[var20] == var12.aShortArray1446[var24]) {
                              var5.method1461(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var9[var20], var9[var23], var9[var24], (float)(var31 + var12.aShortArray1441[var20]) / (float)var12.aShortArray1446[var20], (float)(var31 + var12.aShortArray1441[var23]) / (float)var12.aShortArray1446[var23], (float)(var31 + var12.aShortArray1441[var24]) / (float)var12.aShortArray1446[var24], (float)(var32 + var12.aShortArray1443[var20]) / (float)var12.aShortArray1446[var20], (float)(var32 + var12.aShortArray1443[var23]) / (float)var12.aShortArray1446[var23], (float)(var32 + var12.aShortArray1443[var24]) / (float)var12.aShortArray1446[var24], var12.anIntArray1447[var20], var12.anIntArray1447[var23], var12.anIntArray1447[var24], var4.anInt1379 * 1196864617, var10[var20] * 255.0F, var10[var23] * 255.0F, var10[var24] * 255.0F, var12.aShortArray1442[var20] & '\uffff');
                           } else {
                              var5.method1457(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var9[var20], var9[var23], var9[var24], (float)(var31 + var12.aShortArray1441[var20]) / var33, (float)(var31 + var12.aShortArray1441[var23]) / var33, (float)(var31 + var12.aShortArray1441[var24]) / var33, (float)(var32 + var12.aShortArray1443[var20]) / var33, (float)(var32 + var12.aShortArray1443[var23]) / var33, (float)(var32 + var12.aShortArray1443[var24]) / var33, var12.anIntArray1447[var20], var12.anIntArray1447[var23], var12.anIntArray1447[var24], var4.anInt1379 * 1196864617, var10[var20] * 255.0F, var10[var23] * 255.0F, var10[var24] * 255.0F, var12.aShortArray1442[var20] & '\uffff', var33 / (float)var12.aShortArray1446[var20], var12.aShortArray1442[var23] & '\uffff', var33 / (float)var12.aShortArray1446[var23], var12.aShortArray1442[var24] & '\uffff', var33 / (float)var12.aShortArray1446[var24]);
                           }
                        } else if(var10[var20] + var10[var23] + var10[var24] > 0.0F) {
                           var5.method1469(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], Class300.method3992(var12.anIntArray1447[var20], var4.anInt1379 * 1196864617, var10[var20] * 255.0F, -137929263), Class300.method3992(var12.anIntArray1447[var23], var4.anInt1379 * 1196864617, var10[var23] * 255.0F, -1149799717), Class300.method3992(var12.anIntArray1447[var24], var4.anInt1379 * 1196864617, var10[var24] * 255.0F, 104082163));
                        } else {
                           var5.method1469(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var12.anIntArray1447[var20], var12.anIntArray1447[var23], var12.anIntArray1447[var24]);
                        }
                     }
                  } else {
                     var5.method1459(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var4.anInt1379 * 1196864617);
                  }
               }
            }
         }

      }
   }

   public void method1698(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass174_Sub1_9011.anIntArray9243 != null && this.aClass174_Sub1_9011.aFloatArray9246 != null) {
         Class433 var7 = this.aClass174_Sub1_9011.aClass433_9240;
         this.aFloat9037 = var7.aFloatArray4841[0];
         this.aFloat9019 = var7.aFloatArray4841[1];
         this.aFloat9020 = var7.aFloatArray4841[2];
         this.aFloat9021 = var7.aFloatArray4841[3];
         this.aFloat9022 = var7.aFloatArray4841[4];
         this.aFloat9013 = var7.aFloatArray4841[5];
         this.aFloat9024 = var7.aFloatArray4841[6];
         this.aFloat9036 = var7.aFloatArray4841[7];
         this.aFloat9009 = var7.aFloatArray4841[8];
         this.aFloat9027 = var7.aFloatArray4841[9];
         this.aFloat9028 = var7.aFloatArray4841[10];
         this.aFloat9029 = var7.aFloatArray4841[11];
         this.aFloat9030 = var7.aFloatArray4841[12];
         this.aFloat9031 = var7.aFloatArray4841[13];
         this.aFloat9008 = var7.aFloatArray4841[14];
         this.aFloat9033 = var7.aFloatArray4841[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.anInt1711 * 1966165105 && var11 >= 0 && var11 < this.anInt1713 * -810756899) {
                     this.method8401(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   public void method1705() {
      this.aByteArrayArray9018 = (byte[][])null;
      this.aByteArrayArray9035 = (byte[][])null;
   }

   void method8404(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, Class115 var9, Class121 var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = var9.aBool1384;
      this.aClass174_Sub1_9011.method2328(false);
      var10.aBool1530 = false;
      var10.aBool1531 = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if(var8[var18 - var4][var19 - var5]) {
               int var21;
               if(this.aClass123ArrayArray9025[var18][var19] != null) {
                  Class123 var32 = this.aClass123ArrayArray9025[var18][var19];
                  if(var32.aShort1574 != -1 && (var32.aByte1575 & 2) == 0 && var32.anInt1577 == -1) {
                     var21 = this.aClass174_Sub1_9011.method8497(var32.aShort1574 & '\uffff');
                     var10.method1456(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)Class553.method6670(var21, var32.aShort1578 & '\uffff', (byte)-27), (float)Class553.method6670(var21, var32.aShort1572 & '\uffff', (byte)-81), (float)Class553.method6670(var21, var32.aShort1576 & '\uffff', (byte)-110));
                     var10.method1456(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)Class553.method6670(var21, var32.aShort1573 & '\uffff', (byte)-64), (float)Class553.method6670(var21, var32.aShort1576 & '\uffff', (byte)-93), (float)Class553.method6670(var21, var32.aShort1572 & '\uffff', (byte)-68));
                  } else if(var32.anInt1577 == -1) {
                     var10.method1456(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)(var32.aShort1578 & '\uffff'), (float)(var32.aShort1572 & '\uffff'), (float)(var32.aShort1576 & '\uffff'));
                     var10.method1456(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var32.aShort1573 & '\uffff'), (float)(var32.aShort1576 & '\uffff'), (float)(var32.aShort1572 & '\uffff'));
                  } else {
                     var21 = var32.anInt1577;
                     var10.method1456(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                     var10.method1456(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                  }
               } else if(this.aClass96ArrayArray9014[var18][var19] != null) {
                  Class96 var20 = this.aClass96ArrayArray9014[var18][var19];

                  for(var21 = 0; var21 < var20.aShort1169; ++var21) {
                     var11[var21] = (float)(var16 + var20.aShortArray1179[var21] * var14 / (this.anInt1712 * 1934131013));
                     var12[var21] = (float)(var17 - var20.aShortArray1173[var21] * var14 / (this.anInt1712 * 1934131013));
                  }

                  for(var21 = 0; var21 < var20.aShort1168; ++var21) {
                     short var22 = var20.aShortArray1175[var21];
                     short var23 = var20.aShortArray1176[var21];
                     short var24 = var20.aShortArray1181[var21];
                     float var25 = var11[var22];
                     float var26 = var11[var23];
                     float var27 = var11[var24];
                     float var28 = var12[var22];
                     float var29 = var12[var23];
                     float var30 = var12[var24];
                     int var31;
                     if(var20.anIntArray1177 != null && var20.anIntArray1177[var21] != -1) {
                        var31 = var20.anIntArray1177[var21];
                        var10.method1456(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)Class553.method6670(var31, var20.aShortArray1174[var22], (byte)-76), (float)Class553.method6670(var31, var20.aShortArray1174[var23], (byte)-20), (float)Class553.method6670(var31, var20.aShortArray1174[var24], (byte)-46));
                     } else if(var20.aShortArray1178 != null && var20.aShortArray1178[var21] != -1) {
                        var31 = this.aClass174_Sub1_9011.method8497(var20.aShortArray1178[var21] & '\uffff');
                        var10.method1456(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)Class553.method6670(var31, var20.aShortArray1174[var22], (byte)-43), (float)Class553.method6670(var31, var20.aShortArray1174[var23], (byte)-71), (float)Class553.method6670(var31, var20.aShortArray1174[var24], (byte)-92));
                     } else {
                        var31 = var20.anIntArray1180[var21];
                        var10.method1456(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)Class553.method6670(var31, var20.aShortArray1174[var22], (byte)-45), (float)Class553.method6670(var31, var20.aShortArray1174[var23], (byte)-56), (float)Class553.method6670(var31, var20.aShortArray1174[var24], (byte)-33));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.aBool1530 = true;
      this.aClass174_Sub1_9011.method2328(var15);
   }

   void method8405(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, Class115 var9, Class121 var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = var9.aBool1384;
      this.aClass174_Sub1_9011.method2328(false);
      var10.aBool1530 = false;
      var10.aBool1531 = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if(var8[var18 - var4][var19 - var5]) {
               int var21;
               int var22;
               int var23;
               int var24;
               float var25;
               float var26;
               float var27;
               float var28;
               float var29;
               float var30;
               int var31;
               if(this.aClass110ArrayArray9015 != null) {
                  if(this.aClass110ArrayArray9015[var18][var19] != null) {
                     Class110 var33 = this.aClass110ArrayArray9015[var18][var19];
                     if(var33.aShort1333 != -1 && (var33.aByte1329 & 2) == 0 && var33.anInt1332 == 0) {
                        var21 = this.aClass174_Sub1_9011.method8497(var33.aShort1333 & '\uffff');
                        var10.method1456(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)Class553.method6670(var21, var33.anInt1326, (byte)-33), (float)Class553.method6670(var21, var33.anInt1327, (byte)-44), (float)Class553.method6670(var21, var33.anInt1325, (byte)-35));
                        var10.method1456(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)Class553.method6670(var21, var33.anInt1330, (byte)-73), (float)Class553.method6670(var21, var33.anInt1325, (byte)-68), (float)Class553.method6670(var21, var33.anInt1327, (byte)-49));
                     } else if(var33.anInt1332 == 0) {
                        var10.method1469(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, var33.anInt1326, var33.anInt1327, var33.anInt1325);
                        var10.method1469(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, var33.anInt1330, var33.anInt1325, var33.anInt1327);
                     } else {
                        var21 = var33.anInt1332;
                        var10.method1469(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, Class43.method911(var21, var33.anInt1326 & -16777216, -2128802544), Class43.method911(var21, var33.anInt1327 & -16777216, -1972155614), Class43.method911(var21, var33.anInt1325 & -16777216, -2053171426));
                        var10.method1469(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, Class43.method911(var21, var33.anInt1330 & -16777216, -2042570335), Class43.method911(var21, var33.anInt1325 & -16777216, -2122236520), Class43.method911(var21, var33.anInt1327 & -16777216, -2002996515));
                     }
                  } else if(this.aClass95ArrayArray9016[var18][var19] != null) {
                     Class95 var32 = this.aClass95ArrayArray9016[var18][var19];

                     for(var21 = 0; var21 < var32.aShort1162; ++var21) {
                        var11[var21] = (float)(var16 + var32.aShortArray1160[var21] * var14 / (this.anInt1712 * 1934131013));
                        var12[var21] = (float)(var17 - var32.aShortArray1158[var21] * var14 / (this.anInt1712 * 1934131013));
                     }

                     for(var21 = 0; var21 < var32.aShort1163; ++var21) {
                        var22 = var21 * 3;
                        var23 = var22 + 1;
                        var24 = var23 + 1;
                        var25 = var11[var22];
                        var26 = var11[var23];
                        var27 = var11[var24];
                        var28 = var12[var22];
                        var29 = var12[var23];
                        var30 = var12[var24];
                        if(var32.anIntArray1167 != null && var32.anIntArray1167[var21] != 0 && (var32.aShortArray1165 == null || var32.aShortArray1165 != null && var32.aShortArray1165[var21] == -1)) {
                           var31 = var32.anIntArray1167[var21];
                           var10.method1469(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, Class43.method911(var31, -16777216 - (var32.anIntArray1157[var22] & -16777216), -2109808221), Class43.method911(var31, -16777216 - (var32.anIntArray1157[var23] & -16777216), -2031154197), Class43.method911(var31, -16777216 - (var32.anIntArray1157[var24] & -16777216), -1965173466));
                        } else if(var32.aShortArray1165 != null && var32.aShortArray1165[var21] != -1) {
                           var31 = this.aClass174_Sub1_9011.method8497(var32.aShortArray1165[var21] & '\uffff');
                           var10.method1456(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)var31, (float)var31, (float)var31);
                        } else {
                           var10.method1469(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var32.anIntArray1157[var22], var32.anIntArray1157[var23], var32.anIntArray1157[var24]);
                        }
                     }
                  }
               } else if(this.aClass117ArrayArray9017[var18][var19] != null) {
                  Class117 var20 = this.aClass117ArrayArray9017[var18][var19];

                  for(var21 = 0; var21 < var20.aShort1440; ++var21) {
                     var11[var21] = (float)(var16 + var20.aShortArray1441[var21] * var14 / (this.anInt1712 * 1934131013));
                     var12[var21] = (float)(var17 - var20.aShortArray1443[var21] * var14 / (this.anInt1712 * 1934131013));
                  }

                  for(var21 = 0; var21 < var20.aShort1445; ++var21) {
                     var22 = var21 * 3;
                     var23 = var22 + 1;
                     var24 = var23 + 1;
                     var25 = var11[var22];
                     var26 = var11[var23];
                     var27 = var11[var24];
                     var28 = var12[var22];
                     var29 = var12[var23];
                     var30 = var12[var24];
                     if(var20.anIntArray1449 != null && var20.anIntArray1449[var21] != 0) {
                        var31 = var20.anIntArray1449[var21];
                        var10.method1469(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var31, var31, var31);
                     } else {
                        var10.method1469(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var20.anIntArray1447[var22], var20.anIntArray1447[var23], var20.anIntArray1447[var24]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.aBool1530 = true;
      this.aClass174_Sub1_9011.method2328(var15);
   }

   public void method1700(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      if(this.aClass123ArrayArray9025 == null) {
         this.aClass123ArrayArray9025 = new Class123[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass96ArrayArray9014 = new Class96[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass110ArrayArray9015 != null || this.aClass117ArrayArray9017 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if(var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if(var18 != 0 && var18 != this.anInt1712 * 1934131013 || var19 != 0 && var19 != this.anInt1712 * 1934131013) {
               var16 = false;
               break;
            }
         }
      }

      if(!var16) {
         Class96 var25 = new Class96();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.aShort1169 = var27;
         var25.aShortArray1174 = new short[var27];
         var25.aShortArray1179 = new short[var27];
         var25.aShortArray1172 = new short[var27];
         var25.aShortArray1173 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if(var21 == 0 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            } else if(var21 == 0 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            } else {
               var23 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
               var24 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
               var25.aShortArray1174[var20] = (short)(var23 * (this.anInt1712 * 1934131013 - var22) + var24 * var22 >> this.anInt1710 * -1173322094);
            }

            var23 = (var1 << this.anInt1710 * -586661047) + var21;
            var24 = (var2 << this.anInt1710 * -586661047) + var22;
            var25.aShortArray1179[var20] = (short)var21;
            var25.aShortArray1173[var20] = (short)var22;
            var25.aShortArray1172[var20] = (short)(this.method1707(var23, var24, -1676049869) + (var4 != null?var4[var20]:0));
            if(var25.aShortArray1174[var20] < 2) {
               var25.aShortArray1174[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if(var23 != -1) {
               Class171 var32 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var23, (byte)-47);
               if(!var32.aBool1981) {
                  var29 = true;
                  if(this.method8399(var32.aByte1966) || var32.aByte1986 != 0 || var32.aByte1963 != 0) {
                     var25.aByte1170 = (byte)(var25.aByte1170 | 4);
                  }
               }
            }
         }

         var25.anIntArray1180 = new int[var21];
         if(var11 != null) {
            var25.anIntArray1177 = new int[var21];
         }

         var25.aShortArray1175 = new short[var21];
         var25.aShortArray1176 = new short[var21];
         var25.aShortArray1181 = new short[var21];
         if(var29) {
            var25.aShortArray1178 = new short[var21];
            var25.aShortArray1171 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if(var10[var22] >= 0) {
                  var25.anIntArray1180[var25.aShort1168] = Class616.method7307(var10[var22], -1579148199);
               } else {
                  var25.anIntArray1180[var25.aShort1168] = -1;
               }

               if(var11 != null) {
                  if(var11[var22] != -1) {
                     var25.anIntArray1177[var25.aShort1168] = Class616.method7307(var11[var22], -1234520569);
                  } else {
                     var25.anIntArray1177[var25.aShort1168] = -1;
                  }
               }

               var25.aShortArray1175[var25.aShort1168] = (short)var7[var22];
               var25.aShortArray1176[var25.aShort1168] = (short)var8[var22];
               var25.aShortArray1181[var25.aShort1168] = (short)var9[var22];
               if(var29) {
                  if(var12[var22] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var12[var22], (byte)-5).aBool1981) {
                     var25.aShortArray1178[var25.aShort1168] = (short)var12[var22];
                     var25.aShortArray1171[var25.aShort1168] = (short)var13[var22];
                  } else {
                     var25.aShortArray1178[var25.aShort1168] = -1;
                  }
               }

               ++var25.aShort1168;
            }
         }

         this.aClass96ArrayArray9014[var1][var2] = var25;
      } else if(var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         Class123 var26 = new Class123();
         var18 = var10[0];
         var19 = var12[0];
         if(var11 != null) {
            var26.anInt1577 = Class553.method6670(Class616.method7307(var11[0], -760034005), this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-62);
            if(var18 == -1) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 2);
            }
         }

         if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
            var26.aByte1575 = (byte)(var26.aByte1575 | 1);
         }

         Class171 var30 = null;
         if(var19 != -1) {
            var30 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var19, (byte)37);
         }

         if(var30 != null && (var26.aByte1575 & 2) == 0 && !var30.aBool1981) {
            var26.aShort1573 = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            var26.aShort1576 = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            var26.aShort1578 = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            var26.aShort1572 = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            var26.aShort1574 = (short)var19;
            if(this.method8399(var30.aByte1966) || var30.aByte1986 != 0 || var30.aByte1963 != 0) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 4);
            }
         } else {
            short var31 = Class616.method7307(var18, -1865823551);
            var26.aShort1573 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-78);
            var26.aShort1576 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2], (byte)-63);
            var26.aShort1578 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1], (byte)-78);
            var26.aShort1572 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1], (byte)-79);
            var26.aShort1574 = -1;
         }

         this.aClass123ArrayArray9025[var1][var2] = var26;
      }

   }

   public boolean method1711(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   public void method1710(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method1742(Class526_Sub16 var1, int[] var2) {
   }

   public void method1734(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9035.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9035[var1].length - 1, Math.max(0, var2));
      if(this.aByteArrayArray9035[var1][var2] < var3) {
         this.aByteArrayArray9035[var1][var2] = (byte)var3;
      }

   }

   public Class526_Sub21_Sub5 method1708(int var1, int var2, Class526_Sub21_Sub5 var3) {
      return null;
   }

   public void method1741(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method1716(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      boolean var13 = (this.anInt9012 & 32) == 0;
      if(this.aClass110ArrayArray9015 == null && !var13) {
         this.aClass110ArrayArray9015 = new Class110[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass95ArrayArray9016 = new Class95[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass117ArrayArray9017 == null && var13) {
         this.aClass117ArrayArray9017 = new Class117[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass123ArrayArray9025 != null) {
         throw new IllegalStateException();
      }

      if(var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if(var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = Class87.anIntArray855[Class616.method7307(var7[var14], 423475256) & '\uffff'] << 8 | 255;
            }
         }

         if(var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if(var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = Class87.anIntArray855[Class616.method7307(var8[var14], 125029318) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var30;
         int var34;
         if(var13) {
            Class117 var28 = new Class117();
            var28.aShort1440 = (short)var3.length;
            var28.aShort1445 = (short)(var3.length / 3);
            var28.aShortArray1441 = new short[var28.aShort1440];
            var28.aShortArray1439 = new short[var28.aShort1440];
            var28.aShortArray1443 = new short[var28.aShort1440];
            var28.anIntArray1447 = new int[var28.aShort1440];
            var28.aShortArray1442 = new short[var28.aShort1440];
            var28.aShortArray1446 = new short[var28.aShort1440];
            var28.aByteArray1448 = new byte[var28.aShort1440];
            if(var6 != null) {
               var28.aShortArray1444 = new short[var28.aShort1440];
            }

            for(var15 = 0; var15 < var28.aShort1440; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if(var16 == 0 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
               } else if(var16 == 0 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
               } else {
                  var19 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var16;
                  var20 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var16;
                  var30 = var19 * (this.anInt1712 * 1934131013 - var17) + var20 * var17 >> this.anInt1710 * -1173322094;
               }

               var19 = (var1 << this.anInt1710 * -586661047) + var16;
               var20 = (var2 << this.anInt1710 * -586661047) + var17;
               var28.aShortArray1441[var15] = (short)var16;
               var28.aShortArray1443[var15] = (short)var17;
               var28.aShortArray1439[var15] = (short)(this.method1707(var19, var20, -1763330488) + (var4 != null?var4[var15]:0));
               if(var30 < 0) {
                  var30 = 0;
               }

               if(var7[var15] == 0) {
                  var28.anIntArray1447[var15] = 0;
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               } else {
                  var21 = 0;
                  if(var6 != null) {
                     short var22 = var28.aShortArray1444[var15] = (short)var6[var15];
                     if(var11.anInt2020 * -1648426019 != 0) {
                        var21 = 255 * var22 / (var11.anInt2020 * -1648426019);
                        if(var21 < 0) {
                           var21 = 0;
                        } else if(var21 > 255) {
                           var21 = 255;
                        }
                     }
                  }

                  var34 = -16777216;
                  if(var9[var15] != -1) {
                     Class171 var23 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var15], (byte)6);
                     if(var23.aBool1987 && this.method8399(var23.aByte1966)) {
                        var34 = -1694498816;
                     }
                  }

                  var28.anIntArray1447[var15] = var34 | Class580.method6965(method8400(var7[var15] >> 8, var30), var11.anInt2019 * -1808050665, var21, 1376274558);
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               }

               var28.aShortArray1442[var15] = (short)var9[var15];
               var28.aShortArray1446[var15] = (short)var10[var15];
            }

            if(var8 != null) {
               var28.anIntArray1449 = new int[var28.aShort1445];

               for(var15 = 0; var15 < var28.aShort1445; ++var15) {
                  var16 = var15 * 3;
                  if(var8[var16] != 0) {
                     var28.anIntArray1449[var15] = -16777216 | var8[var16] >> 8;
                  }
               }
            }

            this.aClass117ArrayArray9017[var1][var2] = var28;
         } else {
            boolean var29 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            var30 = -1;
            if(var3.length != 6) {
               var29 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if(var3[var19] == 0 && var5[var19] == 0) {
                     if(var15 != -1 && var7[var15] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var15 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == 0) {
                     if(var16 != -1 && var7[var16] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var16 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var17 != -1 && var7[var17] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var17 = var19;
                  } else if(var3[var19] == 0 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var30 != -1 && var7[var30] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var30 = var19;
                  }
               }

               if(var15 == -1 || var16 == -1 || var17 == -1 || var30 == -1) {
                  var29 = false;
               }

               if(var29) {
                  if(var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if(var4[var19] != 0) {
                           var29 = false;
                           break;
                        }
                     }
                  }

                  if(var29) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if(var3[var19] != var3[0] && var3[var19] != var3[0] + this.anInt1712 * 1934131013 && var3[var19] != var3[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }

                        if(var5[var19] != var5[0] && var5[var19] != var5[0] + this.anInt1712 * 1934131013 && var5[var19] != var5[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if(var29) {
               Class110 var31 = new Class110();
               var20 = var7[0];
               var21 = var9[0];
               if(var8 != null) {
                  var31.anInt1332 = var8[0] >> 8;
                  if(var20 == 0) {
                     var31.aByte1329 = (byte)(var31.aByte1329 | 2);
                  }
               } else if(var20 == 0) {
                  return;
               }

               if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
                  var31.aByte1329 = (byte)(var31.aByte1329 | 1);
               }

               if(var21 != -1 && (var31.aByte1329 & 2) == 0 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var21, (byte)2).aBool1981) {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1820214506);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 2105460251);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1914936021);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1856266513);
                  var31.aShort1333 = (short)var21;
               } else {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1775124670);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 1325698367);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1628699342);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1354090213);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1327 |= 255 - (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) << 25;
                  }

                  var31.aShort1333 = -1;
               }

               if(var6 != null) {
                  var31.aShort1323 = (short)var6[var17];
                  var31.aShort1331 = (short)var6[var30];
                  var31.aShort1324 = (short)var6[var16];
                  var31.aShort1328 = (short)var6[var15];
               }

               this.aClass110ArrayArray9015[var1][var2] = var31;
            } else {
               Class95 var33 = new Class95();
               var33.aShort1162 = (short)var3.length;
               var33.aShort1163 = (short)(var3.length / 3);
               var33.aShortArray1160 = new short[var33.aShort1162];
               var33.aShortArray1161 = new short[var33.aShort1162];
               var33.aShortArray1158 = new short[var33.aShort1162];
               var33.anIntArray1157 = new int[var33.aShort1162];
               if(var6 != null) {
                  var33.aShortArray1164 = new short[var33.aShort1162];
               }

               int var24;
               int var36;
               for(var20 = 0; var20 < var33.aShort1162; ++var20) {
                  var21 = var3[var20];
                  var34 = var5[var20];
                  boolean var35 = false;
                  int var25;
                  if(var21 == 0 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
                  } else if(var21 == 0 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
                  } else {
                     var24 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
                     var25 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
                     var36 = var24 * (this.anInt1712 * 1934131013 - var34) + var25 * var34 >> this.anInt1710 * -1173322094;
                  }

                  var24 = (var1 << this.anInt1710 * -586661047) + var21;
                  var25 = (var2 << this.anInt1710 * -586661047) + var34;
                  var33.aShortArray1160[var20] = (short)var21;
                  var33.aShortArray1158[var20] = (short)var34;
                  var33.aShortArray1161[var20] = (short)(this.method1707(var24, var25, -373555312) + (var4 != null?var4[var20]:0));
                  if(var36 < 0) {
                     var36 = 0;
                  }

                  if(var7[var20] == 0) {
                     if(var8 != null) {
                        var33.anIntArray1157[var20] = var36 << 25;
                     } else {
                        var33.anIntArray1157[var20] = 0;
                     }
                  } else {
                     int var26 = 0;
                     if(var6 != null) {
                        short var27 = var33.aShortArray1164[var20] = (short)var6[var20];
                        if(var11.anInt2020 * -1648426019 != 0) {
                           var26 = 255 * var27 / (var11.anInt2020 * -1648426019);
                           if(var26 < 0) {
                              var26 = 0;
                           } else if(var26 > 255) {
                              var26 = 255;
                           }
                        }
                     }

                     var33.anIntArray1157[var20] = Class580.method6965(method8400(var7[var20] >> 8, var36), var11.anInt2019 * -1808050665, var26, 1992283084);
                     if(var8 != null) {
                        var33.anIntArray1157[var20] |= var36 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  if(var9[var21 * 3] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var21 * 3], (byte)-42).aBool1981) {
                     var32 = true;
                  }
               }

               if(var8 != null) {
                  var33.anIntArray1167 = new int[var33.aShort1163];
               }

               if(var32) {
                  var33.aShortArray1165 = new short[var33.aShort1163];
                  var33.aShortArray1166 = new short[var33.aShort1163];
               }

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  var34 = var21 * 3;
                  if(var8 != null && var8[var34] != 0) {
                     var33.anIntArray1167[var21] = var8[var34] >> 8;
                  }

                  if(var32) {
                     var36 = var34 + 1;
                     var24 = var36 + 1;
                     boolean var37 = false;
                     boolean var39 = true;
                     int var38 = var9[var34];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-45).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var36];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-50).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var24];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)6).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     if(var39) {
                        var33.aShortArray1165[var21] = (short)var38;
                        var33.aShortArray1166[var21] = (short)var10[var34];
                     } else {
                        if(var37) {
                           var38 = var9[var34];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)62).aBool1981) {
                              var33.anIntArray1157[var34] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)4).aShort2015 & '\uffff', -267231483) & '\uffff'];
                           }

                           var38 = var9[var36];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-114).aBool1981) {
                              var33.anIntArray1157[var36] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-48).aShort2015 & '\uffff', -1444492987) & '\uffff'];
                           }

                           var38 = var9[var24];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)28).aBool1981) {
                              var33.anIntArray1157[var24] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-2).aShort2015 & '\uffff', -1329704713) & '\uffff'];
                           }
                        }

                        var33.aShortArray1165[var21] = -1;
                     }
                  }
               }

               this.aClass95ArrayArray9016[var1][var2] = var33;
            }
         }

      }
   }

   public void method1717(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      boolean var13 = (this.anInt9012 & 32) == 0;
      if(this.aClass110ArrayArray9015 == null && !var13) {
         this.aClass110ArrayArray9015 = new Class110[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass95ArrayArray9016 = new Class95[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass117ArrayArray9017 == null && var13) {
         this.aClass117ArrayArray9017 = new Class117[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass123ArrayArray9025 != null) {
         throw new IllegalStateException();
      }

      if(var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if(var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = Class87.anIntArray855[Class616.method7307(var7[var14], -1983120971) & '\uffff'] << 8 | 255;
            }
         }

         if(var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if(var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = Class87.anIntArray855[Class616.method7307(var8[var14], -1239761844) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var30;
         int var34;
         if(var13) {
            Class117 var28 = new Class117();
            var28.aShort1440 = (short)var3.length;
            var28.aShort1445 = (short)(var3.length / 3);
            var28.aShortArray1441 = new short[var28.aShort1440];
            var28.aShortArray1439 = new short[var28.aShort1440];
            var28.aShortArray1443 = new short[var28.aShort1440];
            var28.anIntArray1447 = new int[var28.aShort1440];
            var28.aShortArray1442 = new short[var28.aShort1440];
            var28.aShortArray1446 = new short[var28.aShort1440];
            var28.aByteArray1448 = new byte[var28.aShort1440];
            if(var6 != null) {
               var28.aShortArray1444 = new short[var28.aShort1440];
            }

            for(var15 = 0; var15 < var28.aShort1440; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if(var16 == 0 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
               } else if(var16 == 0 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
               } else {
                  var19 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var16;
                  var20 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var16;
                  var30 = var19 * (this.anInt1712 * 1934131013 - var17) + var20 * var17 >> this.anInt1710 * -1173322094;
               }

               var19 = (var1 << this.anInt1710 * -586661047) + var16;
               var20 = (var2 << this.anInt1710 * -586661047) + var17;
               var28.aShortArray1441[var15] = (short)var16;
               var28.aShortArray1443[var15] = (short)var17;
               var28.aShortArray1439[var15] = (short)(this.method1707(var19, var20, 1660910455) + (var4 != null?var4[var15]:0));
               if(var30 < 0) {
                  var30 = 0;
               }

               if(var7[var15] == 0) {
                  var28.anIntArray1447[var15] = 0;
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               } else {
                  var21 = 0;
                  if(var6 != null) {
                     short var22 = var28.aShortArray1444[var15] = (short)var6[var15];
                     if(var11.anInt2020 * -1648426019 != 0) {
                        var21 = 255 * var22 / (var11.anInt2020 * -1648426019);
                        if(var21 < 0) {
                           var21 = 0;
                        } else if(var21 > 255) {
                           var21 = 255;
                        }
                     }
                  }

                  var34 = -16777216;
                  if(var9[var15] != -1) {
                     Class171 var23 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var15], (byte)-65);
                     if(var23.aBool1987 && this.method8399(var23.aByte1966)) {
                        var34 = -1694498816;
                     }
                  }

                  var28.anIntArray1447[var15] = var34 | Class580.method6965(method8400(var7[var15] >> 8, var30), var11.anInt2019 * -1808050665, var21, 1831982659);
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               }

               var28.aShortArray1442[var15] = (short)var9[var15];
               var28.aShortArray1446[var15] = (short)var10[var15];
            }

            if(var8 != null) {
               var28.anIntArray1449 = new int[var28.aShort1445];

               for(var15 = 0; var15 < var28.aShort1445; ++var15) {
                  var16 = var15 * 3;
                  if(var8[var16] != 0) {
                     var28.anIntArray1449[var15] = -16777216 | var8[var16] >> 8;
                  }
               }
            }

            this.aClass117ArrayArray9017[var1][var2] = var28;
         } else {
            boolean var29 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            var30 = -1;
            if(var3.length != 6) {
               var29 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if(var3[var19] == 0 && var5[var19] == 0) {
                     if(var15 != -1 && var7[var15] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var15 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == 0) {
                     if(var16 != -1 && var7[var16] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var16 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var17 != -1 && var7[var17] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var17 = var19;
                  } else if(var3[var19] == 0 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var30 != -1 && var7[var30] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var30 = var19;
                  }
               }

               if(var15 == -1 || var16 == -1 || var17 == -1 || var30 == -1) {
                  var29 = false;
               }

               if(var29) {
                  if(var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if(var4[var19] != 0) {
                           var29 = false;
                           break;
                        }
                     }
                  }

                  if(var29) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if(var3[var19] != var3[0] && var3[var19] != var3[0] + this.anInt1712 * 1934131013 && var3[var19] != var3[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }

                        if(var5[var19] != var5[0] && var5[var19] != var5[0] + this.anInt1712 * 1934131013 && var5[var19] != var5[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if(var29) {
               Class110 var31 = new Class110();
               var20 = var7[0];
               var21 = var9[0];
               if(var8 != null) {
                  var31.anInt1332 = var8[0] >> 8;
                  if(var20 == 0) {
                     var31.aByte1329 = (byte)(var31.aByte1329 | 2);
                  }
               } else if(var20 == 0) {
                  return;
               }

               if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
                  var31.aByte1329 = (byte)(var31.aByte1329 | 1);
               }

               if(var21 != -1 && (var31.aByte1329 & 2) == 0 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var21, (byte)-35).aBool1981) {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1868588901);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 1876558269);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1516690259);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 2028319688);
                  var31.aShort1333 = (short)var21;
               } else {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1893491716);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 1449499386);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1736998554);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1405575607);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1327 |= 255 - (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) << 25;
                  }

                  var31.aShort1333 = -1;
               }

               if(var6 != null) {
                  var31.aShort1323 = (short)var6[var17];
                  var31.aShort1331 = (short)var6[var30];
                  var31.aShort1324 = (short)var6[var16];
                  var31.aShort1328 = (short)var6[var15];
               }

               this.aClass110ArrayArray9015[var1][var2] = var31;
            } else {
               Class95 var33 = new Class95();
               var33.aShort1162 = (short)var3.length;
               var33.aShort1163 = (short)(var3.length / 3);
               var33.aShortArray1160 = new short[var33.aShort1162];
               var33.aShortArray1161 = new short[var33.aShort1162];
               var33.aShortArray1158 = new short[var33.aShort1162];
               var33.anIntArray1157 = new int[var33.aShort1162];
               if(var6 != null) {
                  var33.aShortArray1164 = new short[var33.aShort1162];
               }

               int var24;
               int var36;
               for(var20 = 0; var20 < var33.aShort1162; ++var20) {
                  var21 = var3[var20];
                  var34 = var5[var20];
                  boolean var35 = false;
                  int var25;
                  if(var21 == 0 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
                  } else if(var21 == 0 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
                  } else {
                     var24 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
                     var25 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
                     var36 = var24 * (this.anInt1712 * 1934131013 - var34) + var25 * var34 >> this.anInt1710 * -1173322094;
                  }

                  var24 = (var1 << this.anInt1710 * -586661047) + var21;
                  var25 = (var2 << this.anInt1710 * -586661047) + var34;
                  var33.aShortArray1160[var20] = (short)var21;
                  var33.aShortArray1158[var20] = (short)var34;
                  var33.aShortArray1161[var20] = (short)(this.method1707(var24, var25, -495146392) + (var4 != null?var4[var20]:0));
                  if(var36 < 0) {
                     var36 = 0;
                  }

                  if(var7[var20] == 0) {
                     if(var8 != null) {
                        var33.anIntArray1157[var20] = var36 << 25;
                     } else {
                        var33.anIntArray1157[var20] = 0;
                     }
                  } else {
                     int var26 = 0;
                     if(var6 != null) {
                        short var27 = var33.aShortArray1164[var20] = (short)var6[var20];
                        if(var11.anInt2020 * -1648426019 != 0) {
                           var26 = 255 * var27 / (var11.anInt2020 * -1648426019);
                           if(var26 < 0) {
                              var26 = 0;
                           } else if(var26 > 255) {
                              var26 = 255;
                           }
                        }
                     }

                     var33.anIntArray1157[var20] = Class580.method6965(method8400(var7[var20] >> 8, var36), var11.anInt2019 * -1808050665, var26, 1435547265);
                     if(var8 != null) {
                        var33.anIntArray1157[var20] |= var36 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  if(var9[var21 * 3] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var21 * 3], (byte)-14).aBool1981) {
                     var32 = true;
                  }
               }

               if(var8 != null) {
                  var33.anIntArray1167 = new int[var33.aShort1163];
               }

               if(var32) {
                  var33.aShortArray1165 = new short[var33.aShort1163];
                  var33.aShortArray1166 = new short[var33.aShort1163];
               }

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  var34 = var21 * 3;
                  if(var8 != null && var8[var34] != 0) {
                     var33.anIntArray1167[var21] = var8[var34] >> 8;
                  }

                  if(var32) {
                     var36 = var34 + 1;
                     var24 = var36 + 1;
                     boolean var37 = false;
                     boolean var39 = true;
                     int var38 = var9[var34];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-63).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var36];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-77).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var24];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-68).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     if(var39) {
                        var33.aShortArray1165[var21] = (short)var38;
                        var33.aShortArray1166[var21] = (short)var10[var34];
                     } else {
                        if(var37) {
                           var38 = var9[var34];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-85).aBool1981) {
                              var33.anIntArray1157[var34] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)48).aShort2015 & '\uffff', -1613915017) & '\uffff'];
                           }

                           var38 = var9[var36];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-57).aBool1981) {
                              var33.anIntArray1157[var36] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-87).aShort2015 & '\uffff', -2102347014) & '\uffff'];
                           }

                           var38 = var9[var24];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-95).aBool1981) {
                              var33.anIntArray1157[var24] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-24).aShort2015 & '\uffff', 1553805323) & '\uffff'];
                           }
                        }

                        var33.aShortArray1165[var21] = -1;
                     }
                  }
               }

               this.aClass95ArrayArray9016[var1][var2] = var33;
            }
         }

      }
   }

   public void method1718() {
      this.aByteArrayArray9018 = (byte[][])null;
      this.aByteArrayArray9035 = (byte[][])null;
   }

   public void method1719(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      Class115 var9 = this.aClass174_Sub1_9011.method8502(Thread.currentThread());
      Class121 var10 = var9.aClass121_1387;
      var10.anInt1543 = 0;
      var10.aBool1556 = true;
      this.aClass174_Sub1_9011.method8498();
      if(this.aClass110ArrayArray9015 == null && this.aClass117ArrayArray9017 == null) {
         if(this.aClass123ArrayArray9025 != null) {
            this.method8404(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.aFloatArray1395, var9.aFloatArray1373);
         }
      } else {
         this.method8405(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.aFloatArray1395, var9.aFloatArray1373);
      }

   }

   public void method1720() {
      this.aByteArrayArray9018 = (byte[][])null;
      this.aByteArrayArray9035 = (byte[][])null;
   }

   public void method1715(int var1, int var2, int var3) {
      var1 = Math.min(this.aByteArrayArray9035.length - 1, Math.max(0, var1));
      var2 = Math.min(this.aByteArrayArray9035[var1].length - 1, Math.max(0, var2));
      if(this.aByteArrayArray9035[var1][var2] < var3) {
         this.aByteArrayArray9035[var1][var2] = (byte)var3;
      }

   }

   public void method1723(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12) {
      boolean var13 = (this.anInt9012 & 32) == 0;
      if(this.aClass110ArrayArray9015 == null && !var13) {
         this.aClass110ArrayArray9015 = new Class110[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass95ArrayArray9016 = new Class95[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass117ArrayArray9017 == null && var13) {
         this.aClass117ArrayArray9017 = new Class117[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass123ArrayArray9025 != null) {
         throw new IllegalStateException();
      }

      if(var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if(var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = Class87.anIntArray855[Class616.method7307(var7[var14], -377515002) & '\uffff'] << 8 | 255;
            }
         }

         if(var8 != null) {
            for(var14 = 0; var14 < var8.length; ++var14) {
               if(var8[var14] == -1) {
                  var8[var14] = 0;
               } else {
                  var8[var14] = Class87.anIntArray855[Class616.method7307(var8[var14], -890631583) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var15;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var30;
         int var34;
         if(var13) {
            Class117 var28 = new Class117();
            var28.aShort1440 = (short)var3.length;
            var28.aShort1445 = (short)(var3.length / 3);
            var28.aShortArray1441 = new short[var28.aShort1440];
            var28.aShortArray1439 = new short[var28.aShort1440];
            var28.aShortArray1443 = new short[var28.aShort1440];
            var28.anIntArray1447 = new int[var28.aShort1440];
            var28.aShortArray1442 = new short[var28.aShort1440];
            var28.aShortArray1446 = new short[var28.aShort1440];
            var28.aByteArray1448 = new byte[var28.aShort1440];
            if(var6 != null) {
               var28.aShortArray1444 = new short[var28.aShort1440];
            }

            for(var15 = 0; var15 < var28.aShort1440; ++var15) {
               var16 = var3[var15];
               var17 = var5[var15];
               boolean var18 = false;
               if(var16 == 0 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
               } else if(var16 == 0 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == this.anInt1712 * 1934131013) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
               } else if(var16 == this.anInt1712 * 1934131013 && var17 == 0) {
                  var30 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
               } else {
                  var19 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var16;
                  var20 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var16) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var16;
                  var30 = var19 * (this.anInt1712 * 1934131013 - var17) + var20 * var17 >> this.anInt1710 * -1173322094;
               }

               var19 = (var1 << this.anInt1710 * -586661047) + var16;
               var20 = (var2 << this.anInt1710 * -586661047) + var17;
               var28.aShortArray1441[var15] = (short)var16;
               var28.aShortArray1443[var15] = (short)var17;
               var28.aShortArray1439[var15] = (short)(this.method1707(var19, var20, 1341265781) + (var4 != null?var4[var15]:0));
               if(var30 < 0) {
                  var30 = 0;
               }

               if(var7[var15] == 0) {
                  var28.anIntArray1447[var15] = 0;
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               } else {
                  var21 = 0;
                  if(var6 != null) {
                     short var22 = var28.aShortArray1444[var15] = (short)var6[var15];
                     if(var11.anInt2020 * -1648426019 != 0) {
                        var21 = 255 * var22 / (var11.anInt2020 * -1648426019);
                        if(var21 < 0) {
                           var21 = 0;
                        } else if(var21 > 255) {
                           var21 = 255;
                        }
                     }
                  }

                  var34 = -16777216;
                  if(var9[var15] != -1) {
                     Class171 var23 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var15], (byte)-70);
                     if(var23.aBool1987 && this.method8399(var23.aByte1966)) {
                        var34 = -1694498816;
                     }
                  }

                  var28.anIntArray1447[var15] = var34 | Class580.method6965(method8400(var7[var15] >> 8, var30), var11.anInt2019 * -1808050665, var21, 1610902090);
                  if(var8 != null) {
                     var28.aByteArray1448[var15] = (byte)var30;
                  }
               }

               var28.aShortArray1442[var15] = (short)var9[var15];
               var28.aShortArray1446[var15] = (short)var10[var15];
            }

            if(var8 != null) {
               var28.anIntArray1449 = new int[var28.aShort1445];

               for(var15 = 0; var15 < var28.aShort1445; ++var15) {
                  var16 = var15 * 3;
                  if(var8[var16] != 0) {
                     var28.anIntArray1449[var15] = -16777216 | var8[var16] >> 8;
                  }
               }
            }

            this.aClass117ArrayArray9017[var1][var2] = var28;
         } else {
            boolean var29 = true;
            var15 = -1;
            var16 = -1;
            var17 = -1;
            var30 = -1;
            if(var3.length != 6) {
               var29 = false;
            } else {
               for(var19 = 0; var19 < 6; ++var19) {
                  if(var3[var19] == 0 && var5[var19] == 0) {
                     if(var15 != -1 && var7[var15] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var15 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == 0) {
                     if(var16 != -1 && var7[var16] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var16 = var19;
                  } else if(var3[var19] == this.anInt1712 * 1934131013 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var17 != -1 && var7[var17] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var17 = var19;
                  } else if(var3[var19] == 0 && var5[var19] == this.anInt1712 * 1934131013) {
                     if(var30 != -1 && var7[var30] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var30 = var19;
                  }
               }

               if(var15 == -1 || var16 == -1 || var17 == -1 || var30 == -1) {
                  var29 = false;
               }

               if(var29) {
                  if(var4 != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if(var4[var19] != 0) {
                           var29 = false;
                           break;
                        }
                     }
                  }

                  if(var29) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if(var3[var19] != var3[0] && var3[var19] != var3[0] + this.anInt1712 * 1934131013 && var3[var19] != var3[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }

                        if(var5[var19] != var5[0] && var5[var19] != var5[0] + this.anInt1712 * 1934131013 && var5[var19] != var5[0] - this.anInt1712 * 1934131013) {
                           var29 = false;
                           break;
                        }
                     }
                  }
               }
            }

            if(var29) {
               Class110 var31 = new Class110();
               var20 = var7[0];
               var21 = var9[0];
               if(var8 != null) {
                  var31.anInt1332 = var8[0] >> 8;
                  if(var20 == 0) {
                     var31.aByte1329 = (byte)(var31.aByte1329 | 2);
                  }
               } else if(var20 == 0) {
                  return;
               }

               if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
                  var31.aByte1329 = (byte)(var31.aByte1329 | 1);
               }

               if(var21 != -1 && (var31.aByte1329 & 2) == 0 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var21, (byte)-46).aBool1981) {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1892660550);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 2086313328);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1800402520);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1573206152);
                  var31.aShort1333 = (short)var21;
               } else {
                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var15] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1330 = Class580.method6965(method8400(var7[var15] >> 8, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]), var11.anInt2019 * -1808050665, var34, 1425449152);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1330 |= 255 - (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var16] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1325 = Class580.method6965(method8400(var7[var16] >> 8, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]), var11.anInt2019 * -1808050665, var34, 1769955464);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1325 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var17] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1326 = Class580.method6965(method8400(var7[var17] >> 8, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1308797326);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1326 |= 255 - (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt2020 * -1648426019 != 0) {
                     var34 = 255 * var6[var30] / (var11.anInt2020 * -1648426019);
                     if(var34 < 0) {
                        var34 = 0;
                     } else if(var34 > 255) {
                        var34 = 255;
                     }
                  } else {
                     var34 = 0;
                  }

                  var31.anInt1327 = Class580.method6965(method8400(var7[var30] >> 8, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]), var11.anInt2019 * -1808050665, var34, 1408495321);
                  if(var31.anInt1332 != 0) {
                     var31.anInt1327 |= 255 - (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) << 25;
                  }

                  var31.aShort1333 = -1;
               }

               if(var6 != null) {
                  var31.aShort1323 = (short)var6[var17];
                  var31.aShort1331 = (short)var6[var30];
                  var31.aShort1324 = (short)var6[var16];
                  var31.aShort1328 = (short)var6[var15];
               }

               this.aClass110ArrayArray9015[var1][var2] = var31;
            } else {
               Class95 var33 = new Class95();
               var33.aShort1162 = (short)var3.length;
               var33.aShort1163 = (short)(var3.length / 3);
               var33.aShortArray1160 = new short[var33.aShort1162];
               var33.aShortArray1161 = new short[var33.aShort1162];
               var33.aShortArray1158 = new short[var33.aShort1162];
               var33.anIntArray1157 = new int[var33.aShort1162];
               if(var6 != null) {
                  var33.aShortArray1164 = new short[var33.aShort1162];
               }

               int var24;
               int var36;
               for(var20 = 0; var20 < var33.aShort1162; ++var20) {
                  var21 = var3[var20];
                  var34 = var5[var20];
                  boolean var35 = false;
                  int var25;
                  if(var21 == 0 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2];
                  } else if(var21 == 0 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == this.anInt1712 * 1934131013) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1];
                  } else if(var21 == this.anInt1712 * 1934131013 && var34 == 0) {
                     var36 = this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2];
                  } else {
                     var24 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
                     var25 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
                     var36 = var24 * (this.anInt1712 * 1934131013 - var34) + var25 * var34 >> this.anInt1710 * -1173322094;
                  }

                  var24 = (var1 << this.anInt1710 * -586661047) + var21;
                  var25 = (var2 << this.anInt1710 * -586661047) + var34;
                  var33.aShortArray1160[var20] = (short)var21;
                  var33.aShortArray1158[var20] = (short)var34;
                  var33.aShortArray1161[var20] = (short)(this.method1707(var24, var25, 603959064) + (var4 != null?var4[var20]:0));
                  if(var36 < 0) {
                     var36 = 0;
                  }

                  if(var7[var20] == 0) {
                     if(var8 != null) {
                        var33.anIntArray1157[var20] = var36 << 25;
                     } else {
                        var33.anIntArray1157[var20] = 0;
                     }
                  } else {
                     int var26 = 0;
                     if(var6 != null) {
                        short var27 = var33.aShortArray1164[var20] = (short)var6[var20];
                        if(var11.anInt2020 * -1648426019 != 0) {
                           var26 = 255 * var27 / (var11.anInt2020 * -1648426019);
                           if(var26 < 0) {
                              var26 = 0;
                           } else if(var26 > 255) {
                              var26 = 255;
                           }
                        }
                     }

                     var33.anIntArray1157[var20] = Class580.method6965(method8400(var7[var20] >> 8, var36), var11.anInt2019 * -1808050665, var26, 2107896360);
                     if(var8 != null) {
                        var33.anIntArray1157[var20] |= var36 << 25;
                     }
                  }
               }

               boolean var32 = false;

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  if(var9[var21 * 3] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var9[var21 * 3], (byte)25).aBool1981) {
                     var32 = true;
                  }
               }

               if(var8 != null) {
                  var33.anIntArray1167 = new int[var33.aShort1163];
               }

               if(var32) {
                  var33.aShortArray1165 = new short[var33.aShort1163];
                  var33.aShortArray1166 = new short[var33.aShort1163];
               }

               for(var21 = 0; var21 < var33.aShort1163; ++var21) {
                  var34 = var21 * 3;
                  if(var8 != null && var8[var34] != 0) {
                     var33.anIntArray1167[var21] = var8[var34] >> 8;
                  }

                  if(var32) {
                     var36 = var34 + 1;
                     var24 = var36 + 1;
                     boolean var37 = false;
                     boolean var39 = true;
                     int var38 = var9[var34];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-47).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var36];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)-6).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     var38 = var9[var24];
                     if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)9).aBool1981) {
                        var37 = true;
                     } else {
                        var39 = false;
                     }

                     if(var39) {
                        var33.aShortArray1165[var21] = (short)var38;
                        var33.aShortArray1166[var21] = (short)var10[var34];
                     } else {
                        if(var37) {
                           var38 = var9[var34];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)41).aBool1981) {
                              var33.anIntArray1157[var34] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)36).aShort2015 & '\uffff', 1128717958) & '\uffff'];
                           }

                           var38 = var9[var36];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)2).aBool1981) {
                              var33.anIntArray1157[var36] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)86).aShort2015 & '\uffff', 44811561) & '\uffff'];
                           }

                           var38 = var9[var24];
                           if(var38 != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)56).aBool1981) {
                              var33.anIntArray1157[var24] = Class87.anIntArray855[Class616.method7307(this.aClass174_Sub1_9011.aClass169_2035.method2122(var38, (byte)22).aShort2015 & '\uffff', 1052799502) & '\uffff'];
                           }
                        }

                        var33.aShortArray1165[var21] = -1;
                     }
                  }
               }

               this.aClass95ArrayArray9016[var1][var2] = var33;
            }
         }

      }
   }

   public void method1722(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass174_Sub1_9011.anIntArray9243 != null && this.aClass174_Sub1_9011.aFloatArray9246 != null) {
         Class433 var7 = this.aClass174_Sub1_9011.aClass433_9240;
         this.aFloat9037 = var7.aFloatArray4841[0];
         this.aFloat9019 = var7.aFloatArray4841[1];
         this.aFloat9020 = var7.aFloatArray4841[2];
         this.aFloat9021 = var7.aFloatArray4841[3];
         this.aFloat9022 = var7.aFloatArray4841[4];
         this.aFloat9013 = var7.aFloatArray4841[5];
         this.aFloat9024 = var7.aFloatArray4841[6];
         this.aFloat9036 = var7.aFloatArray4841[7];
         this.aFloat9009 = var7.aFloatArray4841[8];
         this.aFloat9027 = var7.aFloatArray4841[9];
         this.aFloat9028 = var7.aFloatArray4841[10];
         this.aFloat9029 = var7.aFloatArray4841[11];
         this.aFloat9030 = var7.aFloatArray4841[12];
         this.aFloat9031 = var7.aFloatArray4841[13];
         this.aFloat9008 = var7.aFloatArray4841[14];
         this.aFloat9033 = var7.aFloatArray4841[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.anInt1711 * 1966165105 && var11 >= 0 && var11 < this.anInt1713 * -810756899) {
                     this.method8401(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   public void method1725(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass174_Sub1_9011.anIntArray9243 != null && this.aClass174_Sub1_9011.aFloatArray9246 != null) {
         Class433 var7 = this.aClass174_Sub1_9011.aClass433_9240;
         this.aFloat9037 = var7.aFloatArray4841[0];
         this.aFloat9019 = var7.aFloatArray4841[1];
         this.aFloat9020 = var7.aFloatArray4841[2];
         this.aFloat9021 = var7.aFloatArray4841[3];
         this.aFloat9022 = var7.aFloatArray4841[4];
         this.aFloat9013 = var7.aFloatArray4841[5];
         this.aFloat9024 = var7.aFloatArray4841[6];
         this.aFloat9036 = var7.aFloatArray4841[7];
         this.aFloat9009 = var7.aFloatArray4841[8];
         this.aFloat9027 = var7.aFloatArray4841[9];
         this.aFloat9028 = var7.aFloatArray4841[10];
         this.aFloat9029 = var7.aFloatArray4841[11];
         this.aFloat9030 = var7.aFloatArray4841[12];
         this.aFloat9031 = var7.aFloatArray4841[13];
         this.aFloat9008 = var7.aFloatArray4841[14];
         this.aFloat9033 = var7.aFloatArray4841[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.anInt1711 * 1966165105 && var11 >= 0 && var11 < this.anInt1713 * -810756899) {
                     this.method8401(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   public void method1712(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass174_Sub1_9011.anIntArray9243 != null && this.aClass174_Sub1_9011.aFloatArray9246 != null) {
         Class433 var7 = this.aClass174_Sub1_9011.aClass433_9240;
         this.aFloat9037 = var7.aFloatArray4841[0];
         this.aFloat9019 = var7.aFloatArray4841[1];
         this.aFloat9020 = var7.aFloatArray4841[2];
         this.aFloat9021 = var7.aFloatArray4841[3];
         this.aFloat9022 = var7.aFloatArray4841[4];
         this.aFloat9013 = var7.aFloatArray4841[5];
         this.aFloat9024 = var7.aFloatArray4841[6];
         this.aFloat9036 = var7.aFloatArray4841[7];
         this.aFloat9009 = var7.aFloatArray4841[8];
         this.aFloat9027 = var7.aFloatArray4841[9];
         this.aFloat9028 = var7.aFloatArray4841[10];
         this.aFloat9029 = var7.aFloatArray4841[11];
         this.aFloat9030 = var7.aFloatArray4841[12];
         this.aFloat9031 = var7.aFloatArray4841[13];
         this.aFloat9008 = var7.aFloatArray4841[14];
         this.aFloat9033 = var7.aFloatArray4841[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.anInt1711 * 1966165105 && var11 >= 0 && var11 < this.anInt1713 * -810756899) {
                     this.method8401(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   public void method1735(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   boolean method8406(int var1) {
      return (this.anInt9012 & 8) == 0?false:(var1 == 4?true:(var1 == 8?true:var1 == 9));
   }

   public void method1721() {
      this.aByteArrayArray9018 = (byte[][])null;
      this.aByteArrayArray9035 = (byte[][])null;
   }

   void method8407(int var1, int var2, Class121 var3, float[] var4, float[] var5, float[] var6, float[] var7, float[] var8, int var9) {
      Class123 var10 = this.aClass123ArrayArray9025[var1][var2];
      int var12;
      int var14;
      float var28;
      float var29;
      float var32;
      float var33;
      float var34;
      float var37;
      float var39;
      float var42;
      float var44;
      float var47;
      if(var10 != null) {
         if((var10.aByte1575 & 2) == 0) {
            if(var9 != 0) {
               if((var10.aByte1575 & 4) != 0) {
                  if((var9 & 1) != 0) {
                     return;
                  }
               } else if((var9 & 2) != 0) {
                  return;
               }
            }

            int var48 = var1 * this.anInt1712 * 1934131013;
            var12 = var48 + this.anInt1712 * 1934131013;
            int var49 = var2 * this.anInt1712 * 1934131013;
            var14 = var49 + this.anInt1712 * 1934131013;
            int var15;
            float var18;
            float var19;
            float var20;
            float var21;
            float var22;
            float var23;
            float var24;
            float var25;
            float var30;
            float var35;
            float var40;
            float var45;
            float var55;
            float var56;
            float var58;
            float var59;
            float var61;
            float var62;
            if((var10.aByte1575 & 1) != 0) {
               var15 = this.anIntArrayArray1714[var1][var2];
               float var16 = this.aFloat9024 * (float)var15;
               float var17 = this.aFloat9036 * (float)var15;
               var18 = this.aFloat9008 + this.aFloat9020 * (float)var48 + var16 + this.aFloat9028 * (float)var49;
               var19 = this.aFloat9033 + this.aFloat9021 * (float)var48 + var17 + this.aFloat9029 * (float)var49;
               if(var18 < -var19) {
                  return;
               }

               var20 = this.aFloat9008 + this.aFloat9020 * (float)var12 + var16 + this.aFloat9028 * (float)var49;
               var21 = this.aFloat9033 + this.aFloat9021 * (float)var12 + var17 + this.aFloat9029 * (float)var49;
               if(var20 < -var21) {
                  return;
               }

               var22 = this.aFloat9008 + this.aFloat9020 * (float)var12 + var16 + this.aFloat9028 * (float)var14;
               var23 = this.aFloat9033 + this.aFloat9021 * (float)var12 + var17 + this.aFloat9029 * (float)var14;
               if(var22 < -var23) {
                  return;
               }

               var24 = this.aFloat9008 + this.aFloat9020 * (float)var48 + var16 + this.aFloat9028 * (float)var14;
               var25 = this.aFloat9033 + this.aFloat9021 * (float)var48 + var17 + this.aFloat9029 * (float)var14;
               if(var24 < -var25) {
                  return;
               }

               float var26 = this.aFloat9022 * (float)var15;
               float var27 = this.aFloat9013 * (float)var15;
               var28 = this.aFloat9030 + this.aFloat9037 * (float)var48 + var26 + this.aFloat9009 * (float)var49;
               var29 = var3.aFloat1534 + var3.aFloat1537 * var28 / var19;
               var30 = this.aFloat9031 + this.aFloat9019 * (float)var48 + var27 + this.aFloat9027 * (float)var49;
               var55 = var3.aFloat1553 + var3.aFloat1539 * var30 / var19;
               var32 = var3.aFloat1547 + var3.aFloat1541 * var18 / var19;
               var33 = this.aFloat9030 + this.aFloat9037 * (float)var12 + var26 + this.aFloat9009 * (float)var49;
               var34 = var3.aFloat1534 + var3.aFloat1537 * var33 / var21;
               var35 = this.aFloat9031 + this.aFloat9019 * (float)var12 + var27 + this.aFloat9027 * (float)var49;
               var56 = var3.aFloat1553 + var3.aFloat1539 * var35 / var21;
               var37 = var3.aFloat1547 + var3.aFloat1541 * var20 / var21;
               var58 = this.aFloat9030 + this.aFloat9037 * (float)var12 + var26 + this.aFloat9009 * (float)var14;
               var39 = var3.aFloat1534 + var3.aFloat1537 * var58 / var23;
               var40 = this.aFloat9031 + this.aFloat9019 * (float)var12 + var27 + this.aFloat9027 * (float)var14;
               var59 = var3.aFloat1553 + var3.aFloat1539 * var40 / var23;
               var42 = var3.aFloat1547 + var3.aFloat1541 * var22 / var23;
               var61 = this.aFloat9030 + this.aFloat9037 * (float)var48 + var26 + this.aFloat9009 * (float)var14;
               var44 = var3.aFloat1534 + var3.aFloat1537 * var61 / var25;
               var45 = this.aFloat9031 + this.aFloat9019 * (float)var48 + var27 + this.aFloat9027 * (float)var14;
               var62 = var3.aFloat1553 + var3.aFloat1539 * var45 / var25;
               var47 = var3.aFloat1547 + var3.aFloat1541 * var24 / var25;
            } else {
               var15 = this.anIntArrayArray1714[var1][var2];
               int var51 = this.anIntArrayArray1714[var1 + 1][var2];
               int var53 = this.anIntArrayArray1714[var1 + 1][var2 + 1];
               int var54 = this.anIntArrayArray1714[var1][var2 + 1];
               var18 = this.aFloat9008 + this.aFloat9020 * (float)var48 + this.aFloat9024 * (float)var15 + this.aFloat9028 * (float)var49;
               var19 = this.aFloat9033 + this.aFloat9021 * (float)var48 + this.aFloat9036 * (float)var15 + this.aFloat9029 * (float)var49;
               if(var18 < -var19) {
                  return;
               }

               var20 = this.aFloat9008 + this.aFloat9020 * (float)var12 + this.aFloat9024 * (float)var51 + this.aFloat9028 * (float)var49;
               var21 = this.aFloat9033 + this.aFloat9021 * (float)var12 + this.aFloat9036 * (float)var51 + this.aFloat9029 * (float)var49;
               if(var20 < -var21) {
                  return;
               }

               var22 = this.aFloat9008 + this.aFloat9020 * (float)var12 + this.aFloat9024 * (float)var53 + this.aFloat9028 * (float)var14;
               var23 = this.aFloat9033 + this.aFloat9021 * (float)var12 + this.aFloat9036 * (float)var53 + this.aFloat9029 * (float)var14;
               if(var22 < -var23) {
                  return;
               }

               var24 = this.aFloat9008 + this.aFloat9020 * (float)var48 + this.aFloat9024 * (float)var54 + this.aFloat9028 * (float)var14;
               var25 = this.aFloat9033 + this.aFloat9021 * (float)var48 + this.aFloat9036 * (float)var54 + this.aFloat9029 * (float)var14;
               if(var24 < -var25) {
                  return;
               }

               var28 = this.aFloat9030 + this.aFloat9037 * (float)var48 + this.aFloat9022 * (float)var15 + this.aFloat9009 * (float)var49;
               var29 = var3.aFloat1534 + var3.aFloat1537 * var28 / var19;
               var30 = this.aFloat9031 + this.aFloat9019 * (float)var48 + this.aFloat9013 * (float)var15 + this.aFloat9027 * (float)var49;
               var55 = var3.aFloat1553 + var3.aFloat1539 * var30 / var19;
               var32 = var3.aFloat1547 + var3.aFloat1541 * var18 / var19;
               var33 = this.aFloat9030 + this.aFloat9037 * (float)var12 + this.aFloat9022 * (float)var51 + this.aFloat9009 * (float)var49;
               var34 = var3.aFloat1534 + var3.aFloat1537 * var33 / var21;
               var35 = this.aFloat9031 + this.aFloat9019 * (float)var12 + this.aFloat9013 * (float)var51 + this.aFloat9027 * (float)var49;
               var56 = var3.aFloat1553 + var3.aFloat1539 * var35 / var21;
               var37 = var3.aFloat1547 + var3.aFloat1541 * var20 / var21;
               var58 = this.aFloat9030 + this.aFloat9037 * (float)var12 + this.aFloat9022 * (float)var53 + this.aFloat9009 * (float)var14;
               var39 = var3.aFloat1534 + var3.aFloat1537 * var58 / var23;
               var40 = this.aFloat9031 + this.aFloat9019 * (float)var12 + this.aFloat9013 * (float)var53 + this.aFloat9027 * (float)var14;
               var59 = var3.aFloat1553 + var3.aFloat1539 * var40 / var23;
               var42 = var3.aFloat1547 + var3.aFloat1541 * var22 / var23;
               var61 = this.aFloat9030 + this.aFloat9037 * (float)var48 + this.aFloat9022 * (float)var54 + this.aFloat9009 * (float)var14;
               var44 = var3.aFloat1534 + var3.aFloat1537 * var61 / var25;
               var45 = this.aFloat9031 + this.aFloat9019 * (float)var48 + this.aFloat9013 * (float)var54 + this.aFloat9027 * (float)var14;
               var62 = var3.aFloat1553 + var3.aFloat1539 * var45 / var25;
               var47 = var3.aFloat1547 + var3.aFloat1541 * var24 / var25;
            }

            boolean var50 = false;
            if(var10.aShort1574 != -1) {
               Class171 var52 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var10.aShort1574 & '\uffff', (byte)25);
               var50 = var52.aBool1987;
            }

            if((var39 - var44) * (var56 - var62) - (var59 - var62) * (var34 - var44) > 0.0F) {
               var3.aBool1556 = var39 < 0.0F || var44 < 0.0F || var34 < 0.0F || var39 > (float)var3.anInt1542 || var44 > (float)var3.anInt1542 || var34 > (float)var3.anInt1542;
               if(var50) {
                  var3.method1461(true, true, false, var59, var62, var56, var39, var44, var34, var42, var47, var37, var23, var25, var21, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | Class87.anIntArray855[var10.aShort1578 & '\uffff'] & 16777215, -16777216 | Class87.anIntArray855[var10.aShort1572 & '\uffff'] & 16777215, -16777216 | Class87.anIntArray855[var10.aShort1576 & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.aShort1574 & '\uffff');
               } else {
                  var3.method1456(true, true, false, var59, var62, var56, var39, var44, var34, var42, var47, var37, (float)(var10.aShort1578 & '\uffff'), (float)(var10.aShort1572 & '\uffff'), (float)(var10.aShort1576 & '\uffff'));
               }
            }

            if((var29 - var34) * (var62 - var56) - (var55 - var56) * (var44 - var34) > 0.0F) {
               var3.aBool1556 = var29 < 0.0F || var34 < 0.0F || var44 < 0.0F || var29 > (float)var3.anInt1542 || var34 > (float)var3.anInt1542 || var44 > (float)var3.anInt1542;
               if(var50) {
                  var3.method1461(true, true, false, var55, var56, var62, var29, var34, var44, var32, var37, var47, var19, var21, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | Class87.anIntArray855[var10.aShort1573 & '\uffff'] & 16777215, -16777216 | Class87.anIntArray855[var10.aShort1576 & '\uffff'] & 16777215, -16777216 | Class87.anIntArray855[var10.aShort1572 & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.aShort1574 & '\uffff');
               } else {
                  var3.method1456(true, true, false, var55, var56, var62, var29, var34, var44, var32, var37, var47, (float)(var10.aShort1573 & '\uffff'), (float)(var10.aShort1576 & '\uffff'), (float)(var10.aShort1572 & '\uffff'));
               }
            }

         }
      } else {
         Class96 var11 = this.aClass96ArrayArray9014[var1][var2];
         if(var11 != null) {
            if(var9 != 0) {
               if((var11.aByte1170 & 4) != 0) {
                  if((var9 & 1) != 0) {
                     return;
                  }
               } else if((var9 & 2) != 0) {
                  return;
               }
            }

            int var31;
            for(var31 = 0; var31 < var11.aShort1169; ++var31) {
               var12 = var11.aShortArray1179[var31] + (var1 << this.anInt1710 * -586661047);
               short var13 = var11.aShortArray1172[var31];
               var14 = var11.aShortArray1173[var31] + (var2 << this.anInt1710 * -586661047);
               var39 = this.aFloat9008 + this.aFloat9020 * (float)var12 + this.aFloat9024 * (float)var13 + this.aFloat9028 * (float)var14;
               var44 = this.aFloat9033 + this.aFloat9021 * (float)var12 + this.aFloat9036 * (float)var13 + this.aFloat9029 * (float)var14;
               if(var39 < -var44) {
                  return;
               }

               var29 = this.aFloat9030 + this.aFloat9037 * (float)var12 + this.aFloat9022 * (float)var13 + this.aFloat9009 * (float)var14;
               var34 = this.aFloat9031 + this.aFloat9019 * (float)var12 + this.aFloat9013 * (float)var13 + this.aFloat9027 * (float)var14;
               var4[var31] = var3.aFloat1534 + var3.aFloat1537 * var29 / var44;
               var5[var31] = var3.aFloat1553 + var3.aFloat1539 * var34 / var44;
               var6[var31] = var3.aFloat1547 + var3.aFloat1541 * var39 / var44;
               var7[var31] = var44;
            }

            short var36;
            short var41;
            short var46;
            if(var11.aShortArray1178 != null) {
               for(var31 = 0; var31 < var11.aShort1168; ++var31) {
                  var36 = var11.aShortArray1175[var31];
                  var41 = var11.aShortArray1176[var31];
                  var46 = var11.aShortArray1181[var31];
                  var32 = var4[var36];
                  var37 = var4[var41];
                  var42 = var4[var46];
                  var47 = var5[var36];
                  var28 = var5[var41];
                  var33 = var5[var46];
                  if((var32 - var37) * (var33 - var28) - (var47 - var28) * (var42 - var37) > 0.0F) {
                     var3.aBool1556 = var32 < 0.0F || var37 < 0.0F || var42 < 0.0F || var32 > (float)var3.anInt1542 || var37 > (float)var3.anInt1542 || var42 > (float)var3.anInt1542;
                     boolean var38 = false;
                     if(var11.aShortArray1178[var31] != -1) {
                        Class171 var43 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var11.aShortArray1178[var31] & '\uffff', (byte)93);
                        var38 = var43.aBool1987;
                     }

                     if(var38) {
                        var3.method1461(true, true, false, var47, var28, var33, var32, var37, var42, var6[var36], var6[var41], var6[var46], var7[var36], var7[var41], var7[var46], (float)var11.aShortArray1179[var36] / (float)(this.anInt1712 * 1934131013), (float)var11.aShortArray1179[var41] / (float)(this.anInt1712 * 1934131013), (float)var11.aShortArray1179[var46] / (float)(this.anInt1712 * 1934131013), (float)var11.aShortArray1173[var36] / (float)(this.anInt1712 * 1934131013), (float)var11.aShortArray1173[var41] / (float)(this.anInt1712 * 1934131013), (float)var11.aShortArray1173[var46] / (float)(this.anInt1712 * 1934131013), -16777216 | Class87.anIntArray855[var11.aShortArray1174[var36] & '\uffff'] & 16777215, -16777216 | Class87.anIntArray855[var11.aShortArray1174[var41] & '\uffff'] & 16777215, -16777216 | Class87.anIntArray855[var11.aShortArray1174[var46] & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var11.aShortArray1178[var31] & '\uffff');
                     } else {
                        int var60 = var11.anIntArray1180[var31];
                        if(var60 != -1) {
                           var3.method1456(true, true, false, var47, var28, var33, var32, var37, var42, var6[var36], var6[var41], var6[var46], (float)Class553.method6670(var60, var11.aShortArray1174[var36], (byte)-90), (float)Class553.method6670(var60, var11.aShortArray1174[var41], (byte)-58), (float)Class553.method6670(var60, var11.aShortArray1174[var46], (byte)-51));
                        }
                     }
                  }
               }
            } else {
               for(var31 = 0; var31 < var11.aShort1168; ++var31) {
                  var36 = var11.aShortArray1175[var31];
                  var41 = var11.aShortArray1176[var31];
                  var46 = var11.aShortArray1181[var31];
                  var32 = var4[var36];
                  var37 = var4[var41];
                  var42 = var4[var46];
                  var47 = var5[var36];
                  var28 = var5[var41];
                  var33 = var5[var46];
                  if((var32 - var37) * (var33 - var28) - (var47 - var28) * (var42 - var37) > 0.0F) {
                     int var57 = var11.anIntArray1180[var31];
                     if(var57 != -1) {
                        var3.aBool1556 = var32 < 0.0F || var37 < 0.0F || var42 < 0.0F || var32 > (float)var3.anInt1542 || var37 > (float)var3.anInt1542 || var42 > (float)var3.anInt1542;
                        var3.method1456(true, true, false, var47, var28, var33, var32, var37, var42, var6[var36], var6[var41], var6[var46], (float)Class553.method6670(var57, var11.aShortArray1174[var36], (byte)-82), (float)Class553.method6670(var57, var11.aShortArray1174[var41], (byte)-92), (float)Class553.method6670(var57, var11.aShortArray1174[var46], (byte)-97));
                     }
                  }
               }
            }
         }

      }
   }

   public void method1727(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      Class115 var9 = this.aClass174_Sub1_9011.method8502(Thread.currentThread());
      Class121 var10 = var9.aClass121_1387;
      var10.anInt1543 = 0;
      var10.aBool1556 = true;
      this.aClass174_Sub1_9011.method8498();
      if(this.aClass110ArrayArray9015 == null && this.aClass117ArrayArray9017 == null) {
         if(this.aClass123ArrayArray9025 != null) {
            this.method8404(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.aFloatArray1395, var9.aFloatArray1373);
         }
      } else {
         this.method8405(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.aFloatArray1395, var9.aFloatArray1373);
      }

   }

   public void method1730(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public Class526_Sub21_Sub5 method1728(int var1, int var2, Class526_Sub21_Sub5 var3) {
      return null;
   }

   public Class526_Sub21_Sub5 method1729(int var1, int var2, Class526_Sub21_Sub5 var3) {
      return null;
   }

   public void method1737() {
      this.aByteArrayArray9018 = (byte[][])null;
      this.aByteArrayArray9035 = (byte[][])null;
   }

   public void method1731(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method1709(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aClass174_Sub1_9011.anIntArray9243 != null && this.aClass174_Sub1_9011.aFloatArray9246 != null) {
         Class433 var7 = this.aClass174_Sub1_9011.aClass433_9240;
         this.aFloat9037 = var7.aFloatArray4841[0];
         this.aFloat9019 = var7.aFloatArray4841[1];
         this.aFloat9020 = var7.aFloatArray4841[2];
         this.aFloat9021 = var7.aFloatArray4841[3];
         this.aFloat9022 = var7.aFloatArray4841[4];
         this.aFloat9013 = var7.aFloatArray4841[5];
         this.aFloat9024 = var7.aFloatArray4841[6];
         this.aFloat9036 = var7.aFloatArray4841[7];
         this.aFloat9009 = var7.aFloatArray4841[8];
         this.aFloat9027 = var7.aFloatArray4841[9];
         this.aFloat9028 = var7.aFloatArray4841[10];
         this.aFloat9029 = var7.aFloatArray4841[11];
         this.aFloat9030 = var7.aFloatArray4841[12];
         this.aFloat9031 = var7.aFloatArray4841[13];
         this.aFloat9008 = var7.aFloatArray4841[14];
         this.aFloat9033 = var7.aFloatArray4841[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.anInt1711 * 1966165105 && var11 >= 0 && var11 < this.anInt1713 * -810756899) {
                     this.method8401(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   Class148_Sub1(Class174_Sub1 var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.aClass174_Sub1_9011 = var1;
      this.anInt9012 = var3;
      this.aByteArrayArray9018 = new byte[var4 + 1][var5 + 1];
      int var9 = this.aClass174_Sub1_9011.anInt9256 * 1324304329 >> 9;

      for(int var10 = 1; var10 < var5; ++var10) {
         for(int var11 = 1; var11 < var4; ++var11) {
            int var13 = var7[var11 + 1][var10] - var7[var11 - 1][var10];
            int var14 = var7[var11][var10 + 1] - var7[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var13 * var13 + 512 * var8 + var14 * var14));
            int var16 = (var13 << 8) / var15;
            int var17 = -512 * var8 / var15;
            int var18 = (var14 << 8) / var15;
            int var12 = var9 + (this.aClass174_Sub1_9011.anInt9251 * 1023596879 * var16 + this.aClass174_Sub1_9011.anInt9252 * 904756235 * var17 + this.aClass174_Sub1_9011.anInt9253 * -2070967197 * var18 >> 17);
            var12 >>= 1;
            if(var12 < 2) {
               var12 = 2;
            } else if(var12 > 126) {
               var12 = 126;
            }

            this.aByteArrayArray9018[var11][var10] = (byte)var12;
         }
      }

      this.aByteArrayArray9035 = new byte[var4 + 1][var5 + 1];
   }

   public void method1704(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public boolean method1732(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   public void method1736(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6) {
   }

   public void method1706(Class526_Sub16 var1, int[] var2) {
   }

   public void method1738(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      if(this.aClass123ArrayArray9025 == null) {
         this.aClass123ArrayArray9025 = new Class123[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass96ArrayArray9014 = new Class96[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass110ArrayArray9015 != null || this.aClass117ArrayArray9017 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if(var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if(var18 != 0 && var18 != this.anInt1712 * 1934131013 || var19 != 0 && var19 != this.anInt1712 * 1934131013) {
               var16 = false;
               break;
            }
         }
      }

      if(!var16) {
         Class96 var25 = new Class96();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.aShort1169 = var27;
         var25.aShortArray1174 = new short[var27];
         var25.aShortArray1179 = new short[var27];
         var25.aShortArray1172 = new short[var27];
         var25.aShortArray1173 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if(var21 == 0 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            } else if(var21 == 0 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            } else {
               var23 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
               var24 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
               var25.aShortArray1174[var20] = (short)(var23 * (this.anInt1712 * 1934131013 - var22) + var24 * var22 >> this.anInt1710 * -1173322094);
            }

            var23 = (var1 << this.anInt1710 * -586661047) + var21;
            var24 = (var2 << this.anInt1710 * -586661047) + var22;
            var25.aShortArray1179[var20] = (short)var21;
            var25.aShortArray1173[var20] = (short)var22;
            var25.aShortArray1172[var20] = (short)(this.method1707(var23, var24, 364456071) + (var4 != null?var4[var20]:0));
            if(var25.aShortArray1174[var20] < 2) {
               var25.aShortArray1174[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if(var23 != -1) {
               Class171 var32 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var23, (byte)62);
               if(!var32.aBool1981) {
                  var29 = true;
                  if(this.method8399(var32.aByte1966) || var32.aByte1986 != 0 || var32.aByte1963 != 0) {
                     var25.aByte1170 = (byte)(var25.aByte1170 | 4);
                  }
               }
            }
         }

         var25.anIntArray1180 = new int[var21];
         if(var11 != null) {
            var25.anIntArray1177 = new int[var21];
         }

         var25.aShortArray1175 = new short[var21];
         var25.aShortArray1176 = new short[var21];
         var25.aShortArray1181 = new short[var21];
         if(var29) {
            var25.aShortArray1178 = new short[var21];
            var25.aShortArray1171 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if(var10[var22] >= 0) {
                  var25.anIntArray1180[var25.aShort1168] = Class616.method7307(var10[var22], 391108593);
               } else {
                  var25.anIntArray1180[var25.aShort1168] = -1;
               }

               if(var11 != null) {
                  if(var11[var22] != -1) {
                     var25.anIntArray1177[var25.aShort1168] = Class616.method7307(var11[var22], 545895012);
                  } else {
                     var25.anIntArray1177[var25.aShort1168] = -1;
                  }
               }

               var25.aShortArray1175[var25.aShort1168] = (short)var7[var22];
               var25.aShortArray1176[var25.aShort1168] = (short)var8[var22];
               var25.aShortArray1181[var25.aShort1168] = (short)var9[var22];
               if(var29) {
                  if(var12[var22] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var12[var22], (byte)74).aBool1981) {
                     var25.aShortArray1178[var25.aShort1168] = (short)var12[var22];
                     var25.aShortArray1171[var25.aShort1168] = (short)var13[var22];
                  } else {
                     var25.aShortArray1178[var25.aShort1168] = -1;
                  }
               }

               ++var25.aShort1168;
            }
         }

         this.aClass96ArrayArray9014[var1][var2] = var25;
      } else if(var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         Class123 var26 = new Class123();
         var18 = var10[0];
         var19 = var12[0];
         if(var11 != null) {
            var26.anInt1577 = Class553.method6670(Class616.method7307(var11[0], -1031480926), this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-35);
            if(var18 == -1) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 2);
            }
         }

         if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
            var26.aByte1575 = (byte)(var26.aByte1575 | 1);
         }

         Class171 var30 = null;
         if(var19 != -1) {
            var30 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var19, (byte)69);
         }

         if(var30 != null && (var26.aByte1575 & 2) == 0 && !var30.aBool1981) {
            var26.aShort1573 = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            var26.aShort1576 = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            var26.aShort1578 = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            var26.aShort1572 = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            var26.aShort1574 = (short)var19;
            if(this.method8399(var30.aByte1966) || var30.aByte1986 != 0 || var30.aByte1963 != 0) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 4);
            }
         } else {
            short var31 = Class616.method7307(var18, 357773996);
            var26.aShort1573 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-82);
            var26.aShort1576 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2], (byte)-97);
            var26.aShort1578 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1], (byte)-29);
            var26.aShort1572 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1], (byte)-53);
            var26.aShort1574 = -1;
         }

         this.aClass123ArrayArray9025[var1][var2] = var26;
      }

   }

   public void method1733(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      if(this.aClass123ArrayArray9025 == null) {
         this.aClass123ArrayArray9025 = new Class123[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass96ArrayArray9014 = new Class96[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass110ArrayArray9015 != null || this.aClass117ArrayArray9017 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if(var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if(var18 != 0 && var18 != this.anInt1712 * 1934131013 || var19 != 0 && var19 != this.anInt1712 * 1934131013) {
               var16 = false;
               break;
            }
         }
      }

      if(!var16) {
         Class96 var25 = new Class96();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.aShort1169 = var27;
         var25.aShortArray1174 = new short[var27];
         var25.aShortArray1179 = new short[var27];
         var25.aShortArray1172 = new short[var27];
         var25.aShortArray1173 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if(var21 == 0 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            } else if(var21 == 0 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            } else {
               var23 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
               var24 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
               var25.aShortArray1174[var20] = (short)(var23 * (this.anInt1712 * 1934131013 - var22) + var24 * var22 >> this.anInt1710 * -1173322094);
            }

            var23 = (var1 << this.anInt1710 * -586661047) + var21;
            var24 = (var2 << this.anInt1710 * -586661047) + var22;
            var25.aShortArray1179[var20] = (short)var21;
            var25.aShortArray1173[var20] = (short)var22;
            var25.aShortArray1172[var20] = (short)(this.method1707(var23, var24, 2027107493) + (var4 != null?var4[var20]:0));
            if(var25.aShortArray1174[var20] < 2) {
               var25.aShortArray1174[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if(var23 != -1) {
               Class171 var32 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var23, (byte)31);
               if(!var32.aBool1981) {
                  var29 = true;
                  if(this.method8399(var32.aByte1966) || var32.aByte1986 != 0 || var32.aByte1963 != 0) {
                     var25.aByte1170 = (byte)(var25.aByte1170 | 4);
                  }
               }
            }
         }

         var25.anIntArray1180 = new int[var21];
         if(var11 != null) {
            var25.anIntArray1177 = new int[var21];
         }

         var25.aShortArray1175 = new short[var21];
         var25.aShortArray1176 = new short[var21];
         var25.aShortArray1181 = new short[var21];
         if(var29) {
            var25.aShortArray1178 = new short[var21];
            var25.aShortArray1171 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if(var10[var22] >= 0) {
                  var25.anIntArray1180[var25.aShort1168] = Class616.method7307(var10[var22], -1826999624);
               } else {
                  var25.anIntArray1180[var25.aShort1168] = -1;
               }

               if(var11 != null) {
                  if(var11[var22] != -1) {
                     var25.anIntArray1177[var25.aShort1168] = Class616.method7307(var11[var22], -907233341);
                  } else {
                     var25.anIntArray1177[var25.aShort1168] = -1;
                  }
               }

               var25.aShortArray1175[var25.aShort1168] = (short)var7[var22];
               var25.aShortArray1176[var25.aShort1168] = (short)var8[var22];
               var25.aShortArray1181[var25.aShort1168] = (short)var9[var22];
               if(var29) {
                  if(var12[var22] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var12[var22], (byte)19).aBool1981) {
                     var25.aShortArray1178[var25.aShort1168] = (short)var12[var22];
                     var25.aShortArray1171[var25.aShort1168] = (short)var13[var22];
                  } else {
                     var25.aShortArray1178[var25.aShort1168] = -1;
                  }
               }

               ++var25.aShort1168;
            }
         }

         this.aClass96ArrayArray9014[var1][var2] = var25;
      } else if(var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         Class123 var26 = new Class123();
         var18 = var10[0];
         var19 = var12[0];
         if(var11 != null) {
            var26.anInt1577 = Class553.method6670(Class616.method7307(var11[0], 829348367), this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-91);
            if(var18 == -1) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 2);
            }
         }

         if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
            var26.aByte1575 = (byte)(var26.aByte1575 | 1);
         }

         Class171 var30 = null;
         if(var19 != -1) {
            var30 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var19, (byte)58);
         }

         if(var30 != null && (var26.aByte1575 & 2) == 0 && !var30.aBool1981) {
            var26.aShort1573 = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            var26.aShort1576 = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            var26.aShort1578 = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            var26.aShort1572 = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            var26.aShort1574 = (short)var19;
            if(this.method8399(var30.aByte1966) || var30.aByte1986 != 0 || var30.aByte1963 != 0) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 4);
            }
         } else {
            short var31 = Class616.method7307(var18, -2094409217);
            var26.aShort1573 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-32);
            var26.aShort1576 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2], (byte)-89);
            var26.aShort1578 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1], (byte)-97);
            var26.aShort1572 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1], (byte)-17);
            var26.aShort1574 = -1;
         }

         this.aClass123ArrayArray9025[var1][var2] = var26;
      }

   }

   public void method1740(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15) {
      if(this.aClass123ArrayArray9025 == null) {
         this.aClass123ArrayArray9025 = new Class123[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
         this.aClass96ArrayArray9014 = new Class96[this.anInt1711 * 1966165105][this.anInt1713 * -810756899];
      } else if(this.aClass110ArrayArray9015 != null || this.aClass117ArrayArray9017 != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var18;
      int var19;
      if(var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if(var18 != 0 && var18 != this.anInt1712 * 1934131013 || var19 != 0 && var19 != this.anInt1712 * 1934131013) {
               var16 = false;
               break;
            }
         }
      }

      if(!var16) {
         Class96 var25 = new Class96();
         short var27 = (short)var3.length;
         short var28 = (short)var10.length;
         var25.aShort1169 = var27;
         var25.aShortArray1174 = new short[var27];
         var25.aShortArray1179 = new short[var27];
         var25.aShortArray1172 = new short[var27];
         var25.aShortArray1173 = new short[var27];

         int var21;
         int var22;
         int var23;
         for(int var20 = 0; var20 < var27; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if(var21 == 0 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            } else if(var21 == 0 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == this.anInt1712 * 1934131013) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            } else if(var21 == this.anInt1712 * 1934131013 && var22 == 0) {
               var25.aShortArray1174[var20] = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            } else {
               var23 = (this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]) * var21;
               var24 = (this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]) * (this.anInt1712 * 1934131013 - var21) + (this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]) * var21;
               var25.aShortArray1174[var20] = (short)(var23 * (this.anInt1712 * 1934131013 - var22) + var24 * var22 >> this.anInt1710 * -1173322094);
            }

            var23 = (var1 << this.anInt1710 * -586661047) + var21;
            var24 = (var2 << this.anInt1710 * -586661047) + var22;
            var25.aShortArray1179[var20] = (short)var21;
            var25.aShortArray1173[var20] = (short)var22;
            var25.aShortArray1172[var20] = (short)(this.method1707(var23, var24, 902130813) + (var4 != null?var4[var20]:0));
            if(var25.aShortArray1174[var20] < 2) {
               var25.aShortArray1174[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if(var23 != -1) {
               Class171 var32 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var23, (byte)71);
               if(!var32.aBool1981) {
                  var29 = true;
                  if(this.method8399(var32.aByte1966) || var32.aByte1986 != 0 || var32.aByte1963 != 0) {
                     var25.aByte1170 = (byte)(var25.aByte1170 | 4);
                  }
               }
            }
         }

         var25.anIntArray1180 = new int[var21];
         if(var11 != null) {
            var25.anIntArray1177 = new int[var21];
         }

         var25.aShortArray1175 = new short[var21];
         var25.aShortArray1176 = new short[var21];
         var25.aShortArray1181 = new short[var21];
         if(var29) {
            var25.aShortArray1178 = new short[var21];
            var25.aShortArray1171 = new short[var21];
         }

         for(var22 = 0; var22 < var28; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if(var10[var22] >= 0) {
                  var25.anIntArray1180[var25.aShort1168] = Class616.method7307(var10[var22], -767162082);
               } else {
                  var25.anIntArray1180[var25.aShort1168] = -1;
               }

               if(var11 != null) {
                  if(var11[var22] != -1) {
                     var25.anIntArray1177[var25.aShort1168] = Class616.method7307(var11[var22], -1438194149);
                  } else {
                     var25.anIntArray1177[var25.aShort1168] = -1;
                  }
               }

               var25.aShortArray1175[var25.aShort1168] = (short)var7[var22];
               var25.aShortArray1176[var25.aShort1168] = (short)var8[var22];
               var25.aShortArray1181[var25.aShort1168] = (short)var9[var22];
               if(var29) {
                  if(var12[var22] != -1 && !this.aClass174_Sub1_9011.aClass169_2035.method2122(var12[var22], (byte)-1).aBool1981) {
                     var25.aShortArray1178[var25.aShort1168] = (short)var12[var22];
                     var25.aShortArray1171[var25.aShort1168] = (short)var13[var22];
                  } else {
                     var25.aShortArray1178[var25.aShort1168] = -1;
                  }
               }

               ++var25.aShort1168;
            }
         }

         this.aClass96ArrayArray9014[var1][var2] = var25;
      } else if(var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         Class123 var26 = new Class123();
         var18 = var10[0];
         var19 = var12[0];
         if(var11 != null) {
            var26.anInt1577 = Class553.method6670(Class616.method7307(var11[0], -1069051644), this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-125);
            if(var18 == -1) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 2);
            }
         }

         if(this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1 + 1][var2 + 1] && this.anIntArrayArray1714[var1][var2] == this.anIntArrayArray1714[var1][var2 + 1]) {
            var26.aByte1575 = (byte)(var26.aByte1575 | 1);
         }

         Class171 var30 = null;
         if(var19 != -1) {
            var30 = this.aClass174_Sub1_9011.aClass169_2035.method2122(var19, (byte)54);
         }

         if(var30 != null && (var26.aByte1575 & 2) == 0 && !var30.aBool1981) {
            var26.aShort1573 = (short)(this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2]);
            var26.aShort1576 = (short)(this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2]);
            var26.aShort1578 = (short)(this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1]);
            var26.aShort1572 = (short)(this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1]);
            var26.aShort1574 = (short)var19;
            if(this.method8399(var30.aByte1966) || var30.aByte1986 != 0 || var30.aByte1963 != 0) {
               var26.aByte1575 = (byte)(var26.aByte1575 | 4);
            }
         } else {
            short var31 = Class616.method7307(var18, 700868953);
            var26.aShort1573 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2] - this.aByteArrayArray9035[var1][var2], (byte)-80);
            var26.aShort1576 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2] - this.aByteArrayArray9035[var1 + 1][var2], (byte)-96);
            var26.aShort1578 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1 + 1][var2 + 1] - this.aByteArrayArray9035[var1 + 1][var2 + 1], (byte)-92);
            var26.aShort1572 = (short)Class553.method6670(var31, this.aByteArrayArray9018[var1][var2 + 1] - this.aByteArrayArray9035[var1][var2 + 1], (byte)-14);
            var26.aShort1574 = -1;
         }

         this.aClass123ArrayArray9025[var1][var2] = var26;
      }

   }
}
