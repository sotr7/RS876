package com.jagex;

import com.jagex.Class192;
import com.jagex.Class195;
import com.jagex.Class210;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class277;
import com.jagex.Class322;
import com.jagex.Class327;
import com.jagex.Class375;
import com.jagex.Class387;
import com.jagex.Class439;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class466;
import com.jagex.Class470;
import com.jagex.Class487;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub12;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class576;
import com.jagex.Class596;
import com.jagex.Class64;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.client;

public abstract class Class567 {
   Class192 aClass192_7612 = new Class192(20);
   Class466 aClass466_7613;

   void method6808(int var1) {
      Class192 var2 = this.aClass192_7612;
      synchronized(var2) {
         this.aClass192_7612.method2772(-1228060619);
      }
   }

   void method6809(int var1) {
      Class192 var2 = this.aClass192_7612;
      synchronized(var2) {
         this.aClass192_7612.method2770(602596079);
      }
   }

   void method6810(int var1, byte var2) {
      Class192 var3 = this.aClass192_7612;
      synchronized(var3) {
         this.aClass192_7612.method2769(var1, (byte)-123);
      }
   }

   void method6811() {
      Class192 var1 = this.aClass192_7612;
      synchronized(var1) {
         this.aClass192_7612.method2772(-1324682874);
      }
   }

   void method6812() {
      Class192 var1 = this.aClass192_7612;
      synchronized(var1) {
         this.aClass192_7612.method2770(266384845);
      }
   }

   void method6813() {
      Class192 var1 = this.aClass192_7612;
      synchronized(var1) {
         this.aClass192_7612.method2770(20492776);
      }
   }

   void method6814() {
      Class192 var1 = this.aClass192_7612;
      synchronized(var1) {
         this.aClass192_7612.method2772(-1139059660);
      }
   }

   void method6815() {
      Class192 var1 = this.aClass192_7612;
      synchronized(var1) {
         this.aClass192_7612.method2772(486927763);
      }
   }

   Class567(Class466 var1) {
      this.aClass466_7613 = var1;
   }

   static final void method6816(Class681 var0, boolean var1, boolean var2, short var3) {
      int var4 = var0.anIntArray8642[-244840757 * var0.anInt8644];
      int var5 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var5 >= 0 && var5 < var0.anIntArray8620[var4]) {
         if(!var1) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.anIntArrayArray8645[var4][var5];
         } else if(var2) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.anIntArrayArray8645[var4][var5];
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
         } else {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.anIntArrayArray8645[var4][var5];
         }

      } else {
         throw new RuntimeException();
      }
   }

   static final void method6817(Class681 var0, byte var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      Class526_Sub21_Sub12 var5 = Class277.aClass56_3028.method994(var2, (byte)0);
      if(var5.method10680(var3, (byte)8).anInt8211 * 2090725263 != 0) {
         throw new RuntimeException("");
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.method10675(var3, var4, -745212789);
      }
   }

   static final void method6818(Class681 var0, byte var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub15_10610, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1?1:0, (short)-18144);
      client.aClass505_11204.method6078(-2079592395);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static final void method6819(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)1);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.method10312(var3)?1:0;
   }

   static final void method6820(int var0) {
      client.aBool11068 = false;
      if(3 != -395336755 * Class692.anInt8703) {
         Class446 var1 = Class451.localPlayer.method7635().aClass446_4816;
         Class470 var2 = client.aClass505_11204.method6094((byte)4);
         int var5;
         if(Class327.anInt3488 * -265840483 != 1 && 2 != Class327.anInt3488 * -265840483 && -1549381643 * Class277.anInt3029 == -1) {
            var5 = Class387.method4762(822351193 * Class439.anInt4866, Class210.anInt2259 * 1215159411, -395336755 * Class692.anInt8703, 1401065779);
            if(var5 - 1323364505 * Class322.anInt3458 < 3200 && 0 != (var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][Class439.anInt4866 * 822351193 >> 9][Class210.anInt2259 * 1215159411 >> 9] & 4)) {
               client.aBool11068 = true;
            }
         } else {
            Class596 var3 = client.aClass505_11204.method6128(2016923659);
            int var6;
            if(2 == Class327.anInt3488 * -265840483) {
               Class446 var4 = Class195.aClass292_Sub1_2182.method3938((byte)-29).method8075(2117251609);
               if(Float.isNaN(var4.aFloat4917)) {
                  return;
               }

               var5 = (int)var4.aFloat4917 - (var3.localX * -814686591 << 9);
               var6 = (int)var4.aFloat4919 - (-845789331 * var3.localY << 9);
               if(var5 < 0 || var6 < 0 || var5 >> 9 >= var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703].length || var6 >> 9 >= var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var5 >> 9].length) {
                  return;
               }
            } else if(Class327.anInt3488 * -265840483 == 1) {
               var5 = (int)var1.aFloat4917;
               var6 = (int)var1.aFloat4919;
            } else {
               var5 = -1549381643 * Class277.anInt3029;
               var6 = Class576.anInt7740 * -1404578049;
            }

            if((var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var5 >> 9][var6 >> 9] & 4) != 0) {
               client.aBool11068 = true;
               return;
            }

            int var8;
            int var14;
            if(2 == -265840483 * Class327.anInt3488) {
               Class446 var7 = Class195.aClass292_Sub1_2182.method3941(444676273).method4204(-92073626);
               var14 = ((int)var7.aFloat4917 >> 9) - var3.localX * -814686591;
               var8 = ((int)var7.aFloat4919 >> 9) - var3.localY * -845789331;
               if(var14 < 0 || var8 < 0 || var14 >= var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755].length || var8 >= var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var14].length) {
                  return;
               }
            } else {
               var14 = 822351193 * Class439.anInt4866 >> 9;
               var8 = Class210.anInt2259 * 1215159411 >> 9;
            }

            int var15 = var5 >> 9;
            int var9 = var6 >> 9;
            int var10;
            if(var2.method5619(var14, var8, 486676402)) {
               var10 = Class387.method4762(822351193 * Class439.anInt4866, Class210.anInt2259 * 1215159411, 3, 2120591269);
               if(1323364505 * Class322.anInt3458 >= var10) {
                  client.aBool11068 = true;
               }

               return;
            }

            if(1962594051 * Class487.anInt5511 < 2560) {
               if(var15 > var14) {
                  var10 = var15 - var14;
               } else {
                  var10 = var14 - var15;
               }

               int var11;
               if(var9 > var8) {
                  var11 = var9 - var8;
               } else {
                  var11 = var8 - var9;
               }

               if(0 == var10 && 0 == var11 || var10 <= -client.aClass505_11204.method6056(-1746741811) || var10 >= client.aClass505_11204.method6056(-1746741811) || var11 <= -client.aClass505_11204.method6057(126749238) || var11 >= client.aClass505_11204.method6057(126749238)) {
                  if(-265840483 * Class327.anInt3488 != 2) {
                     Class375.method4671(var14 + Class64.aString738 + var8 + " " + var15 + Class64.aString738 + var9 + " " + var3.localX * -814686591 + Class64.aString738 + var3.localY * -845789331, new RuntimeException(), (byte)58);
                  }

                  return;
               }

               int var12;
               int var13;
               if(var10 > var11) {
                  var12 = var11 * 65536 / var10;
                  var13 = '\u8000';

                  while(var15 != var14) {
                     if(var14 < var15) {
                        ++var14;
                     } else if(var14 > var15) {
                        --var14;
                     }

                     if((var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var14][var8] & 4) != 0) {
                        client.aBool11068 = true;
                        return;
                     }

                     if(1 + var8 < var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var14].length && 0 != (var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var14][1 + var8] & 4)) {
                        client.aBool11068 = true;
                        return;
                     }

                     if(var8 > 0 && (var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var14][var8 - 1] & 4) != 0) {
                        client.aBool11068 = true;
                        return;
                     }

                     var13 += var12;
                     if(var13 >= 65536) {
                        var13 -= 65536;
                        if(var8 < var9) {
                           ++var8;
                           if(1 + var8 < var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var14].length && 0 != (var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var14][var8 + 1] & 4)) {
                              client.aBool11068 = true;
                              return;
                           }
                        } else if(var8 > var9) {
                           --var8;
                           if(var8 > 0 && (var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var14][var8 - 1] & 4) != 0) {
                              client.aBool11068 = true;
                              return;
                           }
                        }
                     }
                  }
               } else {
                  var12 = 65536 * var10 / var11;
                  var13 = '\u8000';

                  while(var8 != var9) {
                     if(var8 < var9) {
                        ++var8;
                     } else if(var8 > var9) {
                        --var8;
                     }

                     if((var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var14][var8] & 4) != 0) {
                        client.aBool11068 = true;
                        return;
                     }

                     if(1 + var14 < var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755].length && (var2.aByteArrayArrayArray5356[-395336755 * Class692.anInt8703][var14 + 1][var8] & 4) != 0) {
                        client.aBool11068 = true;
                        return;
                     }

                     if(var14 > 0 && 0 != (var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var14 - 1][var8] & 4)) {
                        client.aBool11068 = true;
                        return;
                     }

                     var13 += var12;
                     if(var13 >= 65536) {
                        var13 -= 65536;
                        if(var14 < var15) {
                           ++var14;
                           if(var14 + 1 < var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755].length && 0 != (var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var14 + 1][var8] & 4)) {
                              client.aBool11068 = true;
                              return;
                           }
                        } else if(var14 > var15) {
                           --var14;
                           if(var14 > 0 && 0 != (var2.aByteArrayArrayArray5356[Class692.anInt8703 * -395336755][var14 - 1][var8] & 4)) {
                              client.aBool11068 = true;
                              return;
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public static void method6821(int var0, byte var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(8, (long)var0);
      var2.method10583((byte)-89);
   }
}
