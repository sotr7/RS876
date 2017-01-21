package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class422;
import com.jagex.GameMap;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class661;
import com.jagex.Class681;
import com.jagex.Interface2;
import com.jagex.Interface3;
import java.awt.Point;

public class Class1 {
   static String[] aStringArray9 = new String[100];
   public Interface2 anInterface2_13;
   byte[] aByteArray15;
   public int anInt11;
   public int anInt12;
   public int anInt14;
   byte[][] aByteArrayArray10;

   public String method501(String var1, int var2, Interface3[] var3, int var4) {
      if(this.method503(var1, var3, (byte)-37) <= var2) {
         return var1;
      } else {
         var2 -= this.method503("...", (Interface3[])null, (byte)-63);
         int var5 = -1;
         int var6 = -1;
         int var7 = 0;
         int var8 = var1.length();
         String var9 = "";

         for(int var10 = 0; var10 < var8; ++var10) {
            char var11 = var1.charAt(var10);
            if(60 == var11) {
               var5 = var10;
            } else {
               if(var11 == 62 && var5 != -1) {
                  String var12 = var1.substring(var5 + 1, var10);
                  var5 = -1;
                  if(var12.equals("lt")) {
                     var11 = 60;
                  } else if(var12.equals("gt")) {
                     var11 = 62;
                  } else if(var12.equals("nbsp")) {
                     var11 = 160;
                  } else if(var12.equals("shy")) {
                     var11 = 173;
                  } else if(var12.equals("times")) {
                     var11 = 215;
                  } else if(var12.equals("euro")) {
                     var11 = 128;
                  } else if(var12.equals("copy")) {
                     var11 = 169;
                  } else {
                     if(!var12.equals("reg")) {
                        int var18;
                        if(var12.startsWith("img=") && var3 != null) {
                           try {
                              var18 = Class661.method7925(var12.substring(4), (byte)2);
                              var7 += var3[var18].method21();
                              var6 = -1;
                              if(var7 > var2) {
                                 return var9 + "...";
                              }

                              var9 = var1.substring(0, var10 + 1);
                           } catch (Exception var16) {
                              ;
                           }
                           continue;
                        }

                        if(var12.startsWith("sprite=") && null != this.anInterface2_13) {
                           try {
                              boolean var13 = true;
                              int var14 = var12.indexOf(44);
                              if(var14 == -1) {
                                 var18 = Class661.method7925(var12.substring(7), (byte)101);
                              } else {
                                 var18 = Class661.method7925(var12.substring(7, var14), (byte)81);
                              }

                              var7 += this.anInterface2_13.method13(var18, 1427804671);
                              var6 = -1;
                              if(var7 > var2) {
                                 return var9 + "...";
                              }

                              var9 = var1.substring(0, 1 + var10);
                           } catch (Exception var15) {
                              ;
                           }
                        }
                        continue;
                     }

                     var11 = 174;
                  }
               }

               if(var5 == -1) {
                  var7 += this.aByteArray15[Class422.method4994(var11, (byte)7) & 255] & 255;
                  if(this.aByteArrayArray10 != null && -1 != var6) {
                     var7 += this.aByteArrayArray10[var6][var11];
                  }

                  var6 = var11;
                  int var17 = var7;
                  if(null != this.aByteArrayArray10) {
                     var17 = var7 + this.aByteArrayArray10[var11][46];
                  }

                  if(var17 > var2) {
                     return var9 + "...";
                  }

                  var9 = var1.substring(0, var10 + 1);
               }
            }
         }

         return var1;
      }
   }

   public int method502(String var1, int[] var2, String[] var3, Interface3[] var4, int var5) {
      return this.method504(var1, var2, var3, var4, true, 1896691289);
   }

   Class1(byte[] var1, Interface2 var2) {
      this.anInterface2_13 = var2;
      RSByteBuffer var3 = new RSByteBuffer(var1);
      int var4 = var3.readUnsignedByte(891928643);
      if(0 != var4) {
         throw new RuntimeException("");
      } else {
         boolean var5 = var3.readUnsignedByte(-1131879569) == 1;
         this.aByteArray15 = new byte[256];
         var3.writeBytes(this.aByteArray15, 0, 256, -1375948857);
         if(var5) {
            int[] var6 = new int[256];
            int[] var7 = new int[256];

            int var8;
            for(var8 = 0; var8 < 256; ++var8) {
               var6[var8] = var3.readUnsignedByte(-621434450);
            }

            for(var8 = 0; var8 < 256; ++var8) {
               var7[var8] = var3.readUnsignedByte(-839191417);
            }

            byte[][] var13 = new byte[256][];

            int var11;
            for(int var9 = 0; var9 < 256; ++var9) {
               var13[var9] = new byte[var6[var9]];
               byte var10 = 0;

               for(var11 = 0; var11 < var13[var9].length; ++var11) {
                  var10 += var3.readByte((byte)87);
                  var13[var9][var11] = var10;
               }
            }

            byte[][] var14 = new byte[256][];

            int var15;
            for(var15 = 0; var15 < 256; ++var15) {
               var14[var15] = new byte[var6[var15]];
               byte var16 = 0;

               for(int var12 = 0; var12 < var14[var15].length; ++var12) {
                  var16 += var3.readByte((byte)79);
                  var14[var15][var12] = var16;
               }
            }

            this.aByteArrayArray10 = new byte[256][256];

            for(var15 = 0; var15 < 256; ++var15) {
               if(32 != var15 && var15 != 160) {
                  for(var11 = 0; var11 < 256; ++var11) {
                     if(var11 != 32 && var11 != 160) {
                        this.aByteArrayArray10[var15][var11] = (byte)GameMap.method6131(var13, var14, var7, this.aByteArray15, var6, var15, var11, 1469102726);
                     }
                  }
               }
            }

            this.anInt11 = (var7[32] + var6[32]) * -1720332815;
         } else {
            this.anInt11 = var3.readUnsignedByte(747515755) * -1720332815;
         }

         var3.readUnsignedByte(882945916);
         var3.readUnsignedByte(585984427);
         this.anInt12 = var3.readUnsignedByte(-832176159) * 1502343535;
         this.anInt14 = var3.readUnsignedByte(-1428117819) * 1912465843;
      }
   }

   public int method503(String var1, Interface3[] var2, byte var3) {
      if(null == var1) {
         return 0;
      } else {
         int var4 = -1;
         int var5 = -1;
         int var6 = 0;
         int var7 = var1.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var1.charAt(var8);
            if(60 == var9) {
               var4 = var8;
            } else {
               if(var9 == 62 && var4 != -1) {
                  String var10 = var1.substring(var4 + 1, var8);
                  var4 = -1;
                  if(var10.equals("lt")) {
                     var9 = 60;
                  } else if(var10.equals("gt")) {
                     var9 = 62;
                  } else if(var10.equals("nbsp")) {
                     var9 = 160;
                  } else if(var10.equals("shy")) {
                     var9 = 173;
                  } else if(var10.equals("times")) {
                     var9 = 215;
                  } else if(var10.equals("euro")) {
                     var9 = 128;
                  } else if(var10.equals("copy")) {
                     var9 = 169;
                  } else {
                     if(!var10.equals("reg")) {
                        int var15;
                        if(var10.startsWith("img=") && var2 != null) {
                           try {
                              var15 = Class661.method7925(var10.substring(4), (byte)62);
                              var6 += var2[var15].method21();
                              var5 = -1;
                           } catch (Exception var14) {
                              ;
                           }
                           continue;
                        }

                        if(var10.startsWith("sprite=") && this.anInterface2_13 != null) {
                           try {
                              boolean var11 = true;
                              int var12 = var10.indexOf(44);
                              if(var12 == -1) {
                                 var15 = Class661.method7925(var10.substring(7), (byte)20);
                              } else {
                                 var15 = Class661.method7925(var10.substring(7, var12), (byte)4);
                              }

                              var6 += this.anInterface2_13.method13(var15, -788173022);
                              var5 = -1;
                           } catch (Exception var13) {
                              ;
                           }
                        }
                        continue;
                     }

                     var9 = 174;
                  }
               }

               if(-1 == var4) {
                  var6 += this.aByteArray15[Class422.method4994(var9, (byte)31) & 255] & 255;
                  if(this.aByteArrayArray10 != null && var5 != -1) {
                     var6 += this.aByteArrayArray10[var5][var9];
                  }

                  var5 = var9;
               }
            }
         }

         return var6;
      }
   }

   int method504(String var1, int[] var2, String[] var3, Interface3[] var4, boolean var5, int var6) {
      if(null == var1) {
         return 0;
      } else {
         int var7 = 0;
         int var8 = 0;
         int var9 = -1;
         int var10 = 0;
         int var11 = 0;
         int var12 = -1;
         int var13 = -1;
         int var14 = 0;
         int var15 = var1.length();

         for(int var16 = 0; var16 < var15; ++var16) {
            int var17 = Class422.method4994(var1.charAt(var16), (byte)123) & 255;
            int var18 = 0;
            if(var17 == 60) {
               var12 = var16;
            } else {
               int var19;
               if(-1 != var12) {
                  if(62 != var17) {
                     continue;
                  }

                  var19 = var12;
                  String var20 = var1.substring(var12 + 1, var16);
                  var12 = -1;
                  if(var20.equals("br")) {
                     var3[var14] = var1.substring(var8, 1 + var16);
                     ++var14;
                     if(var14 >= var3.length) {
                        return 0;
                     }

                     var8 = var16 + 1;
                     var7 = 0;
                     var9 = -1;
                     var13 = -1;
                     continue;
                  }

                  if(var20.equals("lt")) {
                     var18 += this.method505(60, -1634687101);
                     if(this.aByteArrayArray10 != null && -1 != var13) {
                        var18 += this.aByteArrayArray10[var13][60];
                     }

                     var13 = 60;
                  } else if(var20.equals("gt")) {
                     var18 += this.method505(62, -1264079717);
                     if(this.aByteArrayArray10 != null && var13 != -1) {
                        var18 += this.aByteArrayArray10[var13][62];
                     }

                     var13 = 62;
                  } else if(var20.equals("nbsp")) {
                     var18 += this.method505(160, -2123887490);
                     if(null != this.aByteArrayArray10 && -1 != var13) {
                        var18 += this.aByteArrayArray10[var13][160];
                     }

                     var13 = 160;
                  } else if(var20.equals("shy")) {
                     var18 += this.method505(173, -1577897999);
                     if(null != this.aByteArrayArray10 && -1 != var13) {
                        var18 += this.aByteArrayArray10[var13][173];
                     }

                     var13 = 173;
                  } else if(var20.equals("times")) {
                     var18 += this.method505(215, -1819153106);
                     if(null != this.aByteArrayArray10 && -1 != var13) {
                        var18 += this.aByteArrayArray10[var13][215];
                     }

                     var13 = 215;
                  } else if(var20.equals("euro")) {
                     var18 += this.method505(128, -2002529453);
                     if(this.aByteArrayArray10 != null && -1 != var13) {
                        var18 += this.aByteArrayArray10[var13][128];
                     }

                     var13 = 128;
                  } else if(var20.equals("copy")) {
                     var18 += this.method505(169, -1185735871);
                     if(null != this.aByteArrayArray10 && var13 != -1) {
                        var18 += this.aByteArrayArray10[var13][169];
                     }

                     var13 = 169;
                  } else if(var20.equals("reg")) {
                     var18 += this.method505(174, -1874718064);
                     if(null != this.aByteArrayArray10 && var13 != -1) {
                        var18 += this.aByteArrayArray10[var13][174];
                     }

                     var13 = 174;
                  } else {
                     int var25;
                     if(var20.startsWith("img=") && null != var4) {
                        try {
                           var25 = Class661.method7925(var20.substring(4), (byte)80);
                           var18 += var4[var25].method21();
                           var13 = -1;
                        } catch (Exception var23) {
                           ;
                        }
                     } else if(var20.startsWith("sprite=") && null != this.anInterface2_13) {
                        try {
                           boolean var21 = true;
                           int var22 = var20.indexOf(44);
                           if(-1 == var22) {
                              var25 = Class661.method7925(var20.substring(7), (byte)66);
                           } else {
                              var25 = Class661.method7925(var20.substring(7, var22), (byte)77);
                           }

                           int var10000 = var18 + this.anInterface2_13.method13(var25, 1052622642);
                           var13 = -1;
                        } catch (Exception var24) {
                           ;
                        }
                        continue;
                     }
                  }

                  var17 = -1;
               } else {
                  var19 = var16;
                  var18 += this.method505(var17, -1528301056);
                  if(null != this.aByteArrayArray10 && -1 != var13) {
                     var18 += this.aByteArrayArray10[var13][var17];
                  }

                  var13 = var17;
               }

               if(var18 > 0) {
                  var7 += var18;
                  if(null != var2) {
                     if(var17 == 32) {
                        var9 = var16;
                        var10 = var7;
                        var11 = var5?1:0;
                     }

                     if(var7 > var2[var14 < var2.length?var14:var2.length - 1]) {
                        if(var9 >= 0) {
                           var3[var14] = var1.substring(var8, var9 + 1 - var11);
                           ++var14;
                           if(var14 >= var3.length) {
                              return 0;
                           }

                           var8 = 1 + var9;
                           var9 = -1;
                           var7 -= var10;
                           var13 = -1;
                        } else {
                           var3[var14] = var1.substring(var8, var19);
                           ++var14;
                           if(var14 >= var3.length) {
                              return 0;
                           }

                           var8 = var19;
                           var9 = -1;
                           var7 = var18;
                           var13 = -1;
                        }
                     }

                     if(45 == var17) {
                        var9 = var16;
                        var10 = var7;
                        var11 = 0;
                     }
                  }
               }
            }
         }

         if(var1.length() > var8) {
            var3[var14] = var1.substring(var8, var1.length());
            ++var14;
         }

         return var14;
      }
   }

   public int method505(int var1, int var2) {
      return this.aByteArray15[var1] & 255;
   }

   public int method506(String var1, int var2, Interface3[] var3, short var4) {
      return this.method502(var1, new int[]{var2}, aStringArray9, var3, 2026497015);
   }

   public Point method507(String var1, int var2, int var3, int var4, Interface3[] var5, int var6) {
      if(var4 <= 0) {
         return new Point(0, var3 + this.anInt12 * 96898447);
      } else {
         if(var4 > var1.length()) {
            var4 = var1.length();
         }

         if(0 == var3) {
            var3 = this.anInt11 * -730103023;
         }

         int var7 = this.method504(var1, new int[]{var2}, aStringArray9, var5, false, 1896691289);
         int var8 = 0;

         for(int var9 = 0; var9 < var7; ++var9) {
            int var10 = aStringArray9[var9].length();
            if(var10 + var8 > var4 || var7 - 1 == var9 && var4 == var1.length()) {
               String var11 = var1.substring(var8, var4);
               if(var11.endsWith("<br>")) {
                  var11 = "";
                  int var10000 = var8 + var10;
                  ++var9;
               }

               int var12 = this.method503(var11, var5, (byte)-22);
               int var13 = var9 * var3 + 96898447 * this.anInt12;
               return new Point(var12, var13);
            }

            var8 += var10;
         }

         return null;
      }
   }

   public int method508(String var1, int var2, int var3, int var4, int var5, Interface3[] var6, int var7) {
      if(var3 == 0) {
         var3 = -730103023 * this.anInt11;
      }

      int var8 = this.method504(var1, new int[]{var2}, aStringArray9, var6, false, 1896691289);
      if(var8 == 0) {
         return 0;
      } else {
         if(var5 < 0) {
            var5 = 0;
         }

         var5 /= var3;
         if(var5 >= var8) {
            var5 = var8 - 1;
         }

         String var9 = aStringArray9[var5];
         int var10 = 0;
         int var11 = 0;

         int var12;
         for(var12 = 0; var12 < var4 && var10 < var9.length(); var12 = this.method503(var9.substring(0, var10), var6, (byte)-118)) {
            var11 = var12;
            ++var10;
         }

         if(var10 == var9.length() && var9.endsWith("<br>")) {
            var10 -= 4;
         }

         if(var4 - var11 < var12 - var4) {
            --var10;
         }

         for(int var13 = 0; var13 < var5; ++var13) {
            var10 += aStringArray9[var13].length();
         }

         return var10;
      }
   }

   public int method509(String var1, int var2) {
      return this.method503(var1, (Interface3[])null, (byte)-94);
   }

   public int method510(int var1) {
      return this.aByteArray15[var1] & 255;
   }

   public int method511(String var1) {
      return this.method503(var1, (Interface3[])null, (byte)-35);
   }

   public int method512(int var1, char var2, int var3) {
      return null != this.aByteArrayArray10?this.aByteArrayArray10[var1][var2]:0;
   }

   public int method513(String var1, int var2, int var3, Interface3[] var4, byte var5) {
      if(0 == var3) {
         var3 = this.anInt11 * -730103023;
      }

      int var6 = this.method502(var1, new int[]{var2}, aStringArray9, var4, 1995515568);
      int var7 = (var6 - 1) * var3;
      return this.anInt14 * -1329402501 + this.anInt12 * 96898447 + var7;
   }

   public String method514(String var1, int var2, Interface3[] var3, int var4, byte var5) {
      int var6 = this.method502(var1, new int[]{var2}, aStringArray9, var3, 1988340101);
      return var4 >= 0 && var4 < var6?aStringArray9[var4]:null;
   }

   public int method515(String var1, int var2, Interface3[] var3, byte var4) {
      int var5 = this.method502(var1, new int[]{var2}, aStringArray9, var3, 1645033840);
      int var6 = 0;

      for(int var7 = 0; var7 < var5; ++var7) {
         int var8 = this.method503(aStringArray9[var7], var3, (byte)-122);
         if(var8 > var6) {
            var6 = var8;
         }
      }

      return var6;
   }

   static final void method516(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 & var3;
   }

   public static boolean method517(int var0, int var1) {
      return var0 == (var0 & -var0);
   }

   static final void method518(Class681 var0, int var1) {
      var0.anInt8625 -= 2019513325;
   }

   static final void method519(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var0.aBool2623 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class526_Sub31.method9555(var0, (byte)10);
   }
}
