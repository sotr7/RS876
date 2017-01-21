package com.jagex;

import com.jagex.Class152;
import com.jagex.Class195;
import com.jagex.Class200;
import com.jagex.Class210;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class277;
import com.jagex.Class295;
import com.jagex.Class322;
import com.jagex.Class327;
import com.jagex.Class329_Sub1;
import com.jagex.Class375;
import com.jagex.Class387;
import com.jagex.Class397;
import com.jagex.Class439;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class470;
import com.jagex.Class487;
import com.jagex.RSByteBuffer;
import com.jagex.Class549;
import com.jagex.Class576;
import com.jagex.Class59;
import com.jagex.Class596;
import com.jagex.Class64;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class97_Sub1;
import com.jagex.client;
import java.applet.Applet;

public class Class492 {
   public static Applet anApplet5526;
   byte aByte5523;
   public int anInt5521;
   public int anInt5520;
   public int anInt5522;
   public int anInt5524;
   public int anInt5525;

   public int method5876() {
      return 8 == (this.aByte5523 & 8)?1:0;
   }

   public int method5877() {
      return this.aByte5523 & 7;
   }

   public int method5878(byte var1) {
      return this.aByte5523 & 7;
   }

   public int method5879(int var1) {
      return 8 == (this.aByte5523 & 8)?1:0;
   }

   public int method5880() {
      return this.aByte5523 & 7;
   }

   public Class492(RSByteBuffer var1, Class97_Sub1 var2) {
      this.aByte5523 = var1.readByte((byte)104);
      this.anInt5521 = var1.readUnsignedShort(1505438939) * -1181307817;
      this.anInt5520 = var1.readInt((byte)5) * 149775663;
      this.anInt5522 = var1.readInt((byte)5) * 636296595;
      this.anInt5524 = var1.readInt((byte)5) * -2095587431;
      this.anInt5525 = var1.readInt((byte)5) * -211872545;
      if(var2 != null) {
         Class200.method2873(var1, var2, -799367320);
      }

   }

   public int method5881() {
      return 8 == (this.aByte5523 & 8)?1:0;
   }

   public Class492() {
   }

   public int method5882() {
      return 8 == (this.aByte5523 & 8)?1:0;
   }

   static final void method5883(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class152.method1763(var3, var4, var0, 453787520);
   }

   static final void method5884(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class295.method3962(var3, var0, (byte)8);
   }

   static final void method5885(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class397.aByte4127;
   }

   static final void method5886(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class329_Sub1.method9044((char)var2, 1995952212)?1:0;
   }

   static final void method5887(int var0) {
      byte[][][] var1 = client.aClass505_11204.method6069((byte)-21);
      byte var2 = (byte)(client.anInt11126 * 1242714411 - 4 & 255);
      int var3 = 1242714411 * client.anInt11126 % client.aClass505_11204.method6056(-1746741811);

      int var4;
      for(var4 = 0; var4 < 4; ++var4) {
         for(int var5 = 0; var5 < client.aClass505_11204.method6057(126749238); ++var5) {
            var1[var4][var3][var5] = var2;
         }
      }

      if(3 != -395336755 * Class692.anInt8703) {
         for(var4 = 0; var4 < 2; ++var4) {
            client.anIntArray11142[var4] = -1000000;
            client.anIntArray11143[var4] = 1000000;
            client.anIntArray11279[var4] = 0;
            client.anIntArray11131[var4] = 1000000;
            client.anIntArray11145[var4] = 0;
         }

         Class446 var18 = Class451.localPlayer.method7635().aClass446_4816;
         Class470 var19 = client.aClass505_11204.method6094((byte)19);
         Class549 var6 = client.aClass505_11204.method6072(-1449942807);
         int var9;
         if(Class327.anInt3488 * -265840483 != 1 && 2 != Class327.anInt3488 * -265840483 && -1 == Class277.anInt3029 * -1549381643) {
            var9 = Class387.method4762(822351193 * Class439.anInt4866, 1215159411 * Class210.anInt2259, -395336755 * Class692.anInt8703, 1136747422);
            if(var9 - 1323364505 * Class322.anInt3458 < 3200 && (var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][822351193 * Class439.anInt4866 >> 9][Class210.anInt2259 * 1215159411 >> 9] & 4) != 0) {
               Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, Class439.anInt4866 * 822351193 >> 9, 1215159411 * Class210.anInt2259 >> 9, false, (byte)74);
            }
         } else {
            Class596 var7 = client.aClass505_11204.method6128(2079785194);
            int var10;
            if(2 == -265840483 * Class327.anInt3488) {
               Class446 var8 = Class195.aClass292_Sub1_2182.method3938((byte)42).method8075(2050374187);
               if(Float.isNaN(var8.aFloat4917)) {
                  return;
               }

               var9 = (int)var8.aFloat4917 - (var7.localX * -814686591 << 9);
               var10 = (int)var8.aFloat4919 - (var7.localY * -845789331 << 9);
               if(var9 < 0 || var10 < 0 || var9 >> 9 >= var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703].length || var10 >> 9 >= var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var9 >> 9].length) {
                  return;
               }
            } else if(1 == Class327.anInt3488 * -265840483) {
               var9 = (int)var18.aFloat4917;
               var10 = (int)var18.aFloat4919;
            } else {
               var9 = Class277.anInt3029 * -1549381643;
               var10 = -1404578049 * Class576.anInt7740;
            }

            if(0 != (var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var9 >> 9][var10 >> 9] & 4)) {
               Class59.method1034(var6.aClass552ArrayArrayArray7287, 0, var9 >> 9, var10 >> 9, false, (byte)32);
               return;
            }

            int var12;
            int var20;
            if(2 == Class327.anInt3488 * -265840483) {
               Class446 var11 = Class195.aClass292_Sub1_2182.method3941(502673720).method4204(838898333);
               var20 = ((int)var11.aFloat4917 >> 9) - -814686591 * var7.localX;
               var12 = ((int)var11.aFloat4919 >> 9) - var7.localY * -845789331;
               if(var20 < 0 || var12 < 0 || var20 >= var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755].length || var12 >= var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var20].length) {
                  return;
               }
            } else {
               var20 = 822351193 * Class439.anInt4866 >> 9;
               var12 = Class210.anInt2259 * 1215159411 >> 9;
            }

            int var21 = var9 >> 9;
            int var13 = var10 >> 9;
            int var14;
            if(var19.method5619(var20, var12, 486676402)) {
               var14 = Class387.method4762(Class439.anInt4866 * 822351193, Class210.anInt2259 * 1215159411, 3, 1579062880);
               if(Class322.anInt3458 * 1323364505 >= var14) {
                  Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20, var12, false, (byte)47);
               }

               return;
            }

            if(1962594051 * Class487.anInt5511 < 2560) {
               if(var21 > var20) {
                  var14 = var21 - var20;
               } else {
                  var14 = var20 - var21;
               }

               int var15;
               if(var13 > var12) {
                  var15 = var13 - var12;
               } else {
                  var15 = var12 - var13;
               }

               if(0 == var14 && 0 == var15 || var14 <= -client.aClass505_11204.method6056(-1746741811) || var14 >= client.aClass505_11204.method6056(-1746741811) || var15 <= -client.aClass505_11204.method6057(126749238) || var15 >= client.aClass505_11204.method6057(126749238)) {
                  if(2 != Class327.anInt3488 * -265840483) {
                     Class375.method4671(var20 + Class64.aString738 + var12 + " " + var21 + Class64.aString738 + var13 + " " + var7.localX * -814686591 + Class64.aString738 + var7.localY * -845789331, new RuntimeException(), (byte)34);
                  }

                  return;
               }

               int var16;
               int var17;
               if(var14 > var15) {
                  var16 = 65536 * var15 / var14;
                  var17 = '\u8000';

                  while(var21 != var20) {
                     if(var20 < var21) {
                        ++var20;
                     } else if(var20 > var21) {
                        --var20;
                     }

                     if((var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var20][var12] & 4) != 0) {
                        Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20, var12, false, (byte)78);
                        break;
                     }

                     if(1 + var12 < var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var20].length && (var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var20][1 + var12] & 4) != 0) {
                        Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20, var12 + 1, false, (byte)36);
                        break;
                     }

                     if(var12 > 0 && (var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var20][var12 - 1] & 4) != 0) {
                        Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20, var12 - 1, false, (byte)96);
                        break;
                     }

                     var17 += var16;
                     if(var17 >= 65536) {
                        var17 -= 65536;
                        if(var12 < var13) {
                           ++var12;
                           if(1 + var12 < var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var20].length && 0 != (var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var20][1 + var12] & 4)) {
                              Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20, 1 + var12, false, (byte)44);
                              break;
                           }
                        } else if(var12 > var13) {
                           --var12;
                           if(var12 > 0 && (var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var20][var12 - 1] & 4) != 0) {
                              Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20, var12 - 1, false, (byte)75);
                              break;
                           }
                        }
                     }
                  }
               } else {
                  var16 = 65536 * var14 / var15;
                  var17 = '\u8000';

                  while(var12 != var13) {
                     if(var12 < var13) {
                        ++var12;
                     } else if(var12 > var13) {
                        --var12;
                     }

                     if(0 != (var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var20][var12] & 4)) {
                        Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20, var12, false, (byte)29);
                        break;
                     }

                     if(var20 + 1 < var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703].length && 0 != (var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var20 + 1][var12] & 4)) {
                        Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20 + 1, var12, false, (byte)55);
                        break;
                     }

                     if(var20 > 0 && (var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var20 - 1][var12] & 4) != 0) {
                        Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20 - 1, var12, false, (byte)21);
                        break;
                     }

                     var17 += var16;
                     if(var17 >= 65536) {
                        var17 -= 65536;
                        if(var20 < var21) {
                           ++var20;
                           if(var20 + 1 < var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755].length && (var19.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var20 + 1][var12] & 4) != 0) {
                              Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20 + 1, var12, false, (byte)34);
                              break;
                           }
                        } else if(var20 > var21) {
                           --var20;
                           if(var20 > 0 && (var19.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var20 - 1][var12] & 4) != 0) {
                              Class59.method1034(var6.aClass552ArrayArrayArray7287, 1, var20 - 1, var12, false, (byte)66);
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static final void method5888(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub29_10605.method10105((byte)22);
   }
}
