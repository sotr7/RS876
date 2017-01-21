package com.jagex;

import com.jagex.Class11;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class19;
import com.jagex.Class192;
import com.jagex.Class200;
import com.jagex.Class206;
import com.jagex.Class208;
import com.jagex.Class24;
import com.jagex.InterfaceDef;
import com.jagex.Class294;
import com.jagex.NPCDef;
import com.jagex.Class32;
import com.jagex.Class326;
import com.jagex.Class340;
import com.jagex.Class40_Sub1;
import com.jagex.Class40_Sub11;
import com.jagex.Class40_Sub15;
import com.jagex.Class40_Sub16;
import com.jagex.Class40_Sub9;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class465;
import com.jagex.Class510;
import com.jagex.RSByteBuffer;
import com.jagex.Class537;
import com.jagex.RenderDef;
import com.jagex.Class620;
import com.jagex.Class643;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class704;
import com.jagex.Interface17;
import com.jagex.Interface19;
import com.jagex.client;

public class Class633 {
   public static final int anInt8240 = 1073741824;
   static final int anInt8241 = 1073741823;
   public static final int anInt8242 = 4;
   public static final int anInt8243 = 10;
   public static final int anInt8244 = 4;
   public static final int anInt8249 = Integer.MIN_VALUE;
   public static final int anInt8255 = 10;
   public boolean aBool8251;
   static int[] anIntArray8248 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   static Class192 aClass192_8256 = new Class192(260);
   static Class192 aClass192_8239 = new Class192(5);
   long aLong8254;
   long aLong8253;
   public int anInt8252 = 64149907;
   int anInt8246;
   int[] anIntArray8247;
   Class19[] aClass19Array8257;
   public int[] anIntArray8245;
   public int[] anIntArray8250;

   public static void method7493() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         aClass192_8256.method2770(360478495);
      }

      var0 = aClass192_8239;
      synchronized(var0) {
         aClass192_8239.method2770(2023804696);
      }
   }

   public static void method7494(int var0) {
      Class340.anInt3539 = 1247682365 * var0;
      Class192 var1 = aClass192_8239;
      synchronized(var1) {
         aClass192_8239.method2770(18324697);
      }

      var1 = aClass192_8256;
      synchronized(var1) {
         aClass192_8256.method2770(441584547);
      }
   }

   public void method7495(int var1, int var2, Class40_Sub9 var3, int var4) {
      int var5 = anIntArray8248[var1];
      if(var3.method89(var2, 289588554) != null) {
         this.anIntArray8247[var5] = var2 | Integer.MIN_VALUE;
         this.method7512((short)19336);
      }
   }

   public void method7496(int var1, int var2, int var3) {
      this.anIntArray8245[var1] = var2;
      this.method7512((short)29263);
   }

   public void method7497(int var1, int var2, byte var3) {
      this.anIntArray8250[var1] = var2;
      this.method7512((short)22502);
   }

   public void method7498(boolean var1, int var2) {
      this.aBool8251 = var1;
      this.method7512((short)2445);
   }

   public static void method7499(int var0) {
      Class192 var1 = aClass192_8256;
      synchronized(var1) {
         aClass192_8256.method2769(var0, (byte)-91);
      }

      var1 = aClass192_8239;
      synchronized(var1) {
         aClass192_8239.method2769(var0, (byte)-80);
      }
   }

   public static void method7500(int var0) {
      Class340.anInt3539 = 1247682365 * var0;
      Class192 var1 = aClass192_8239;
      synchronized(var1) {
         aClass192_8239.method2770(777707996);
      }

      var1 = aClass192_8256;
      synchronized(var1) {
         aClass192_8256.method2770(1070702506);
      }
   }

   public static void method7501(int var0) {
      Class340.anInt3539 = 1247682365 * var0;
      Class192 var1 = aClass192_8239;
      synchronized(var1) {
         aClass192_8239.method2770(708454630);
      }

      var1 = aClass192_8256;
      synchronized(var1) {
         aClass192_8256.method2770(1903494397);
      }
   }

   public Class168 method7502(Class174 var1, int var2, Class40_Sub9 var3, Class40_Sub15 var4, Class704 var5, int var6, int var7, int var8, int var9) {
      int var10 = var5 != null?var2 | var5.method8221((byte)110):var2;
      long var11 = (long)var8 << 32 | (long)(var7 << 16) | (long)var6;
      Class192 var13 = aClass192_8239;
      Class168 var14;
      synchronized(var13) {
         var14 = (Class168)aClass192_8239.method2765(var11);
      }

      if(null == var14 || var1.method2464(var14.method2101(), var10) != 0) {
         if(null != var14) {
            var10 = var1.method2533(var10, var14.method2101());
         }

         Class170[] var15 = new Class170[3];
         int var16 = 0;
         if(!((Class326)var3.method89(var6, -9327586)).method4183(1152569016) || !((Class326)var3.method89(var7, 289808704)).method4183(1418595892) || !((Class326)var3.method89(var8, -731393671)).method4183(1573075575)) {
            return null;
         }

         Class170 var17 = ((Class326)var3.method89(var6, -137675576)).method4186(-2003927447);
         if(null != var17) {
            var15[var16++] = var17;
         }

         var17 = ((Class326)var3.method89(var7, -2015695133)).method4186(-796089316);
         if(null != var17) {
            var15[var16++] = var17;
         }

         var17 = ((Class326)var3.method89(var8, -476116526)).method4186(-2095343752);
         if(null != var17) {
            var15[var16++] = var17;
         }

         var17 = new Class170(var15, var16);
         int var23 = var10 | 16384;
         var14 = var1.method2321(var17, var23, -1998835691 * Class340.anInt3539, 64, 768);

         int var18;
         int var19;
         for(var18 = 0; var18 < 10; ++var18) {
            for(var19 = 0; var19 < Class200.aShortArrayArray2206[var18].length; ++var19) {
               if(this.anIntArray8245[var18] < Class510.aShortArrayArrayArray6984[var18][var19].length) {
                  var14.method1940(Class200.aShortArrayArray2206[var18][var19], Class510.aShortArrayArrayArray6984[var18][var19][this.anIntArray8245[var18]]);
               }
            }
         }

         for(var18 = 0; var18 < 10; ++var18) {
            for(var19 = 0; var19 < Class643.aShortArrayArray8430[var18].length; ++var19) {
               if(this.anIntArray8250[var18] < Class537.aShortArrayArrayArray7205[var18][var19].length) {
                  var14.method1992(Class643.aShortArrayArray8430[var18][var19], Class537.aShortArrayArrayArray7205[var18][var19][this.anIntArray8250[var18]]);
               }
            }
         }

         var14.method2110(var10);
         Class192 var24 = aClass192_8239;
         synchronized(var24) {
            aClass192_8239.method2768(var14, var11);
         }
      }

      if(var5 == null) {
         return var14;
      } else {
         var14 = var14.method1947((byte)4, var10, true);
         var5.method8231(var14, 0, -1568969564);
         return var14;
      }
   }

   public void method7503(int var1, int var2) {
      this.anIntArray8245[var1] = var2;
      this.method7512((short)12794);
   }

   public Class168 method7504(Class174 var1, int var2, Class40_Sub16 var3, Class40_Sub9 var4, Class40_Sub11 var5, Class40_Sub1 var6, Interface17 var7, Interface19 var8, Class704 var9, Class704 var10, Class704[] var11, int[] var12, int var13, boolean var14, Class620 var15, short var16) {
      if(this.anInt8252 * -1760242843 != -1) {
         return ((NPCDef)var5.method89(this.anInt8252 * -1760242843, -1413046134)).method4047(var1, var2, var3, var7, var8, var9, var10, var11, var12, var13, (Class294)null, 16711935);
      } else {
         int var17 = var2;
         long var18 = this.aLong8253 * 2878033130569746253L;
         int[] var20 = this.anIntArray8247;
         boolean var21 = false;
         boolean var22 = false;
         int var24;
         if(var9 != null) {
            Class206 var23 = var9.method8219((byte)-31);
            if(var23 != null && (-1130666303 * var23.anInt2230 >= 0 || -1974513111 * var23.anInt2240 >= 0)) {
               var20 = new int[this.anIntArray8247.length];

               for(var24 = 0; var24 < var20.length; ++var24) {
                  var20[var24] = this.anIntArray8247[var24];
               }

               if(var23.anInt2230 * -1130666303 >= 0 && var15.anInt8127 * 134323147 != -1) {
                  var21 = true;
                  if('\uffff' == var23.anInt2230 * -1130666303) {
                     var20[var15.anInt8127 * 134323147] = 0;

                     for(var24 = 0; var24 < var15.anIntArray8129.length; ++var24) {
                        var20[var15.anIntArray8129[var24]] = 0;
                     }

                     var18 ^= -4294967296L;
                  } else {
                     var20[134323147 * var15.anInt8127] = var23.anInt2230 * -1130666303 | 1073741824;

                     for(var24 = 0; var24 < var15.anIntArray8129.length; ++var24) {
                        var20[var15.anIntArray8129[var24]] = 0;
                     }

                     var18 ^= (long)var20[134323147 * var15.anInt8127] << 32;
                  }
               }

               if(var23.anInt2240 * -1974513111 >= 0 && -405871267 * var15.anInt8128 != -1) {
                  var22 = true;
                  if(-1974513111 * var23.anInt2240 == '\uffff') {
                     var20[var15.anInt8128 * -405871267] = 0;

                     for(var24 = 0; var24 < var15.anIntArray8130.length; ++var24) {
                        var20[var15.anIntArray8130[var24]] = 0;
                     }

                     var18 ^= 4294967295L;
                  } else {
                     var20[var15.anInt8128 * -405871267] = var23.anInt2240 * -1974513111 | 1073741824;

                     for(var24 = 0; var24 < var15.anIntArray8130.length; ++var24) {
                        var20[var15.anIntArray8130[var24]] = 0;
                     }

                     var18 ^= (long)var20[-405871267 * var15.anInt8128];
                  }
               }
            }
         }

         boolean var42 = false;
         var24 = var11 != null?var11.length:0;

         for(int var25 = 0; var25 < var24; ++var25) {
            if(null != var11[var25]) {
               var17 |= var11[var25].method8221((byte)106);
               var42 = true;
            }
         }

         if(var9 != null) {
            var17 |= var9.method8221((byte)84);
            var42 = true;
         }

         if(var10 != null) {
            var17 |= var10.method8221((byte)63);
            var42 = true;
         }

         boolean var43 = false;
         if(var12 != null) {
            for(int var26 = 0; var26 < var12.length; ++var26) {
               if(-1 != var12[var26]) {
                  var17 |= 32;
                  var43 = true;
               }
            }
         }

         Class192 var27 = aClass192_8256;
         Class168 var44;
         synchronized(var27) {
            var44 = (Class168)aClass192_8256.method2765(var18);
         }

         RenderDef var45 = null;
         if(1026557661 * this.anInt8246 != -1) {
            var45 = (RenderDef)var3.method89(1026557661 * this.anInt8246, -1349206722);
         }

         int var30;
         int var31;
         if(var44 == null || var1.method2464(var44.method2101(), var17) != 0) {
            if(null != var44) {
               var17 = var1.method2533(var17, var44.method2101());
            }

            boolean var29 = false;
            var30 = 0;

            while(true) {
               int var34;
               if(var30 >= var20.length) {
                  if(var29) {
                     if(8386608082071829033L * this.aLong8254 != -1L) {
                        Class192 var48 = aClass192_8256;
                        synchronized(var48) {
                           var44 = (Class168)aClass192_8256.method2765(this.aLong8254 * 8386608082071829033L);
                        }
                     }

                     if(var44 == null || var1.method2464(var44.method2101(), var17) != 0) {
                        return null;
                     }
                  } else {
                     Class170[] var49 = new Class170[var20.length];

                     int var51;
                     for(var31 = 0; var31 < var20.length; ++var31) {
                        var51 = var20[var31];
                        Class19 var52 = null;
                        boolean var53 = var31 == 5 && var21 || var31 == 3 && var22;
                        Class170 var35;
                        if(0 != (var51 & 1073741824)) {
                           if(!var53 && this.aClass19Array8257 != null && this.aClass19Array8257[var31] != null) {
                              var52 = this.aClass19Array8257[var31];
                           }

                           var35 = ((Class11)var6.method89(var51 & 1073741823, -869806781)).method593(this.aBool8251, var52, (byte)-52);
                           if(var35 != null) {
                              var49[var31] = var35;
                           }
                        } else if((var51 & Integer.MIN_VALUE) != 0) {
                           var35 = ((Class326)var4.method89(var51 & 1073741823, -45272990)).method4185(1190212893);
                           if(null != var35) {
                              var49[var31] = var35;
                           }
                        }
                     }

                     int var57;
                     if(null != var45 && var45.anIntArrayArray7704 != null) {
                        for(var31 = 0; var31 < var45.anIntArrayArray7704.length; ++var31) {
                           if(null != var49[var31]) {
                              var51 = 0;
                              var57 = 0;
                              var34 = 0;
                              int var54 = 0;
                              int var36 = 0;
                              int var37 = 0;
                              if(var45.anIntArrayArray7704[var31] != null) {
                                 var51 = var45.anIntArrayArray7704[var31][0];
                                 var57 = var45.anIntArrayArray7704[var31][1];
                                 var34 = var45.anIntArrayArray7704[var31][2];
                                 var54 = var45.anIntArrayArray7704[var31][3] << 3;
                                 var36 = var45.anIntArrayArray7704[var31][4] << 3;
                                 var37 = var45.anIntArrayArray7704[var31][5] << 3;
                              }

                              if(0 != var54 || var36 != 0 || var37 != 0) {
                                 var49[var31].method2140(var54, var36, var37);
                              }

                              if(var51 != 0 || 0 != var57 || 0 != var34) {
                                 var49[var31].method2129(var51, var57, var34);
                              }
                           }
                        }
                     }

                     Class170 var50 = new Class170(var49, var49.length);
                     int var28 = var17 | 16384;
                     var44 = var1.method2321(var50, var28, Class340.anInt3539 * -1998835691, 64, 850);

                     for(var51 = 0; var51 < 10; ++var51) {
                        for(var57 = 0; var57 < Class200.aShortArrayArray2206[var51].length; ++var57) {
                           if(this.anIntArray8245[var51] < Class510.aShortArrayArrayArray6984[var51][var57].length) {
                              var44.method1940(Class200.aShortArrayArray2206[var51][var57], Class510.aShortArrayArrayArray6984[var51][var57][this.anIntArray8245[var51]]);
                           }
                        }
                     }

                     for(var51 = 0; var51 < 10; ++var51) {
                        for(var57 = 0; var57 < Class643.aShortArrayArray8430[var51].length; ++var57) {
                           if(this.anIntArray8250[var51] < Class537.aShortArrayArrayArray7205[var51][var57].length) {
                              var44.method1992(Class643.aShortArrayArray8430[var51][var57], Class537.aShortArrayArrayArray7205[var51][var57][this.anIntArray8250[var51]]);
                           }
                        }
                     }

                     var44.method1986();
                     if(var14) {
                        var44.method2110(var17);
                        Class192 var55 = aClass192_8256;
                        synchronized(var55) {
                           aClass192_8256.method2768(var44, var18);
                        }

                        this.aLong8254 = var18 * 2319179156438286873L;
                     }
                  }
                  break;
               }

               var31 = var20[var30];
               Class19 var32 = null;
               boolean var33 = false;
               if(var21) {
                  if(134323147 * var15.anInt8127 == var30) {
                     var33 = true;
                  } else {
                     for(var34 = 0; var34 < var15.anIntArray8129.length; ++var34) {
                        if(var30 == var15.anIntArray8129[var34]) {
                           var33 = true;
                           break;
                        }
                     }
                  }
               }

               if(var22) {
                  if(var30 == -405871267 * var15.anInt8128) {
                     var33 = true;
                  } else {
                     for(var34 = 0; var34 < var15.anIntArray8130.length; ++var34) {
                        if(var30 == var15.anIntArray8130[var34]) {
                           var33 = true;
                           break;
                        }
                     }
                  }
               }

               if(0 != (var31 & 1073741824)) {
                  if(!var33 && this.aClass19Array8257 != null && null != this.aClass19Array8257[var30]) {
                     var32 = this.aClass19Array8257[var30];
                  }

                  if(!((Class11)var6.method89(var31 & 1073741823, -752915020)).method584(this.aBool8251, var32, -1759200281)) {
                     var29 = true;
                  }
               } else if((var31 & Integer.MIN_VALUE) != 0 && !((Class326)var4.method89(var31 & 1073741823, -771192544)).method4187((short)-932)) {
                  var29 = true;
               }

               ++var30;
            }
         }

         Class168 var46 = var44.method1947((byte)4, var17, true);
         if(!var42 && !var43) {
            return var46;
         } else {
            Class445[] var47 = null;
            if(var45 != null) {
               var47 = var45.method6922(1952302124);
            }

            if(var43 && var47 != null) {
               for(var30 = 0; var30 < var12.length; ++var30) {
                  if(null != var47[var30]) {
                     var46.method1948(var47[var30], 1 << var30, true);
                  }
               }
            }

            var30 = 0;

            for(var31 = 1; var30 < var24; var31 <<= 1) {
               if(var11[var30] != null) {
                  var11[var30].method8248(var46, 0, var31, -938005178);
               }

               ++var30;
            }

            if(var43) {
               for(var30 = 0; var30 < var12.length; ++var30) {
                  if(-1 != var12[var30]) {
                     var31 = var12[var30] - var13;
                     var31 &= 16383;
                     Class445 var56 = new Class445();
                     var56.method5225(0.0F, 1.0F, 0.0F, Class443.method5200(var31));
                     var46.method1948(var56, 1 << var30, false);
                  }
               }
            }

            if(var43 && var47 != null) {
               for(var30 = 0; var30 < var12.length; ++var30) {
                  if(null != var47[var30]) {
                     var46.method1948(var47[var30], 1 << var30, false);
                  }
               }
            }

            if(null != var9 && var10 != null) {
               Class208.method2931(var46, var9, var10, -600134475);
            } else if(var9 != null) {
               var9.method8231(var46, 0, 64863440);
            } else if(null != var10) {
               var10.method8231(var46, 0, 1220914521);
            }

            return var46;
         }
      }
   }

   public void method7505(int var1, int var2) {
      this.anIntArray8245[var1] = var2;
      this.method7512((short)10427);
   }

   public void method7506(int var1, int var2) {
      this.anIntArray8250[var1] = var2;
      this.method7512((short)31072);
   }

   public void method7507(int var1, int var2) {
      this.anIntArray8250[var1] = var2;
      this.method7512((short)9208);
   }

   public void method7508(int var1, int var2) {
      this.anIntArray8250[var1] = var2;
      this.method7512((short)20013);
   }

   public void method7509(int var1, int var2, Class40_Sub1 var3, int var4) {
      if(-1 == var2) {
         this.anIntArray8247[var1] = 0;
      } else {
         if(var3.method89(var2, -1135141586) == null) {
            return;
         }

         this.anIntArray8247[var1] = var2 | 1073741824;
         this.method7512((short)1836);
      }

   }

   void method7510() {
      long[] var1 = RSByteBuffer.aLongArray10676;
      this.aLong8253 = 7955369982181488251L;
      this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.anInt8246 * 1026557661 >> 8)) & 255L)]);
      this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(1026557661 * this.anInt8246)) & 255L)]) * -7955369982181488251L;

      int var2;
      for(var2 = 0; var2 < this.anIntArray8247.length; ++var2) {
         this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.anIntArray8247[var2] >> 24)) & 255L)]);
         this.aLong8253 = (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.anIntArray8247[var2] >> 16)) & 255L)]) * -7955369982181488251L;
         this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.anIntArray8247[var2] >> 8)) & 255L)]) * -7955369982181488251L;
         this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8247[var2]) & 255L)]) * -7955369982181488251L;
      }

      if(null != this.aClass19Array8257) {
         for(var2 = 0; var2 < this.aClass19Array8257.length; ++var2) {
            if(null != this.aClass19Array8257[var2]) {
               int[] var3;
               int[] var4;
               if(this.aBool8251) {
                  var3 = this.aClass19Array8257[var2].anIntArray189;
                  var4 = this.aClass19Array8257[var2].anIntArray194;
               } else {
                  var3 = this.aClass19Array8257[var2].anIntArray186;
                  var4 = this.aClass19Array8257[var2].anIntArray191;
               }

               int var5;
               if(var3 != null) {
                  for(var5 = 0; var5 < var3.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(var3[var5] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)var3[var5]) & 255L)]);
                  }
               }

               if(var4 != null) {
                  for(var5 = 0; var5 < var4.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(var4[var5] >> 8)) & 255L)]);
                     this.aLong8253 = (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)var4[var5]) & 255L)]) * -7955369982181488251L;
                  }
               }

               if(this.aClass19Array8257[var2].aShortArray195 != null) {
                  for(var5 = 0; var5 < this.aClass19Array8257[var2].aShortArray195.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.aClass19Array8257[var2].aShortArray195[var5] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)this.aClass19Array8257[var2].aShortArray195[var5]) & 255L)]);
                  }
               }

               if(this.aClass19Array8257[var2].aShortArray196 != null) {
                  for(var5 = 0; var5 < this.aClass19Array8257[var2].aShortArray196.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.aClass19Array8257[var2].aShortArray196[var5] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.aClass19Array8257[var2].aShortArray196[var5]) & 255L)]);
                  }
               }
            }
         }
      }

      for(var2 = 0; var2 < 10; ++var2) {
         this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8245[var2]) & 255L)]);
      }

      for(var2 = 0; var2 < 10; ++var2) {
         this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8250[var2]) & 255L)]);
      }

      this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.aBool8251?1:0)) & 255L)]);
   }

   public static void method7511() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         aClass192_8256.method2772(-1274479478);
      }

      var0 = aClass192_8239;
      synchronized(var0) {
         aClass192_8239.method2772(292959618);
      }
   }

   void method7512(short var1) {
      long[] var2 = RSByteBuffer.aLongArray10676;
      this.aLong8253 = 7955369982181488251L;
      this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.anInt8246 * 1026557661 >> 8)) & 255L)]);
      this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(1026557661 * this.anInt8246)) & 255L)]) * -7955369982181488251L;

      int var3;
      for(var3 = 0; var3 < this.anIntArray8247.length; ++var3) {
         this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.anIntArray8247[var3] >> 24)) & 255L)]);
         this.aLong8253 = (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.anIntArray8247[var3] >> 16)) & 255L)]) * -7955369982181488251L;
         this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.anIntArray8247[var3] >> 8)) & 255L)]) * -7955369982181488251L;
         this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8247[var3]) & 255L)]) * -7955369982181488251L;
      }

      if(null != this.aClass19Array8257) {
         for(var3 = 0; var3 < this.aClass19Array8257.length; ++var3) {
            if(null != this.aClass19Array8257[var3]) {
               int[] var4;
               int[] var5;
               if(this.aBool8251) {
                  var4 = this.aClass19Array8257[var3].anIntArray189;
                  var5 = this.aClass19Array8257[var3].anIntArray194;
               } else {
                  var4 = this.aClass19Array8257[var3].anIntArray186;
                  var5 = this.aClass19Array8257[var3].anIntArray191;
               }

               int var6;
               if(var4 != null) {
                  for(var6 = 0; var6 < var4.length; ++var6) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)(var4[var6] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)var4[var6]) & 255L)]);
                  }
               }

               if(var5 != null) {
                  for(var6 = 0; var6 < var5.length; ++var6) {
                     this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(var5[var6] >> 8)) & 255L)]);
                     this.aLong8253 = (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((this.aLong8253 * 2878033130569746253L ^ (long)var5[var6]) & 255L)]) * -7955369982181488251L;
                  }
               }

               if(this.aClass19Array8257[var3].aShortArray195 != null) {
                  for(var6 = 0; var6 < this.aClass19Array8257[var3].aShortArray195.length; ++var6) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.aClass19Array8257[var3].aShortArray195[var6] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((this.aLong8253 * 2878033130569746253L ^ (long)this.aClass19Array8257[var3].aShortArray195[var6]) & 255L)]);
                  }
               }

               if(this.aClass19Array8257[var3].aShortArray196 != null) {
                  for(var6 = 0; var6 < this.aClass19Array8257[var3].aShortArray196.length; ++var6) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.aClass19Array8257[var3].aShortArray196[var6] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.aClass19Array8257[var3].aShortArray196[var6]) & 255L)]);
                  }
               }
            }
         }
      }

      for(var3 = 0; var3 < 10; ++var3) {
         this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8245[var3]) & 255L)]);
      }

      for(var3 = 0; var3 < 10; ++var3) {
         this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8250[var3]) & 255L)]);
      }

      this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var2[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.aBool8251?1:0)) & 255L)]);
   }

   public static int method7513() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         return aClass192_8256.method2764((byte)122);
      }
   }

   public static int method7514() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         return aClass192_8256.method2764((byte)21);
      }
   }

   public static int method7515() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         return aClass192_8256.method2764((byte)-5);
      }
   }

   public static int method7516() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         return aClass192_8256.method2764((byte)23);
      }
   }

   void method7517() {
      long[] var1 = RSByteBuffer.aLongArray10676;
      this.aLong8253 = 7955369982181488251L;
      this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.anInt8246 * 1026557661 >> 8)) & 255L)]);
      this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(1026557661 * this.anInt8246)) & 255L)]) * -7955369982181488251L;

      int var2;
      for(var2 = 0; var2 < this.anIntArray8247.length; ++var2) {
         this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.anIntArray8247[var2] >> 24)) & 255L)]);
         this.aLong8253 = (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.anIntArray8247[var2] >> 16)) & 255L)]) * -7955369982181488251L;
         this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.anIntArray8247[var2] >> 8)) & 255L)]) * -7955369982181488251L;
         this.aLong8253 = (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8247[var2]) & 255L)]) * -7955369982181488251L;
      }

      if(null != this.aClass19Array8257) {
         for(var2 = 0; var2 < this.aClass19Array8257.length; ++var2) {
            if(null != this.aClass19Array8257[var2]) {
               int[] var3;
               int[] var4;
               if(this.aBool8251) {
                  var3 = this.aClass19Array8257[var2].anIntArray189;
                  var4 = this.aClass19Array8257[var2].anIntArray194;
               } else {
                  var3 = this.aClass19Array8257[var2].anIntArray186;
                  var4 = this.aClass19Array8257[var2].anIntArray191;
               }

               int var5;
               if(var3 != null) {
                  for(var5 = 0; var5 < var3.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(var3[var5] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)var3[var5]) & 255L)]);
                  }
               }

               if(var4 != null) {
                  for(var5 = 0; var5 < var4.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(var4[var5] >> 8)) & 255L)]);
                     this.aLong8253 = (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)var4[var5]) & 255L)]) * -7955369982181488251L;
                  }
               }

               if(this.aClass19Array8257[var2].aShortArray195 != null) {
                  for(var5 = 0; var5 < this.aClass19Array8257[var2].aShortArray195.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.aClass19Array8257[var2].aShortArray195[var5] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)this.aClass19Array8257[var2].aShortArray195[var5]) & 255L)]);
                  }
               }

               if(this.aClass19Array8257[var2].aShortArray196 != null) {
                  for(var5 = 0; var5 < this.aClass19Array8257[var2].aShortArray196.length; ++var5) {
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((this.aLong8253 * 2878033130569746253L ^ (long)(this.aClass19Array8257[var2].aShortArray196[var5] >> 8)) & 255L)]);
                     this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.aClass19Array8257[var2].aShortArray196[var5]) & 255L)]);
                  }
               }
            }
         }
      }

      for(var2 = 0; var2 < 10; ++var2) {
         this.aLong8253 = -7955369982181488251L * (this.aLong8253 * 2878033130569746253L >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8245[var2]) & 255L)]);
      }

      for(var2 = 0; var2 < 10; ++var2) {
         this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)this.anIntArray8250[var2]) & 255L)]);
      }

      this.aLong8253 = -7955369982181488251L * (2878033130569746253L * this.aLong8253 >>> 8 ^ var1[(int)((2878033130569746253L * this.aLong8253 ^ (long)(this.aBool8251?1:0)) & 255L)]);
   }

   public static void method7518(int var0) {
      Class340.anInt3539 = 1247682365 * var0;
      Class192 var1 = aClass192_8239;
      synchronized(var1) {
         aClass192_8239.method2770(175069617);
      }

      var1 = aClass192_8256;
      synchronized(var1) {
         aClass192_8256.method2770(1827851919);
      }
   }

   public void method7519(int var1, int[] var2, Class19[] var3, int[] var4, int[] var5, boolean var6, int var7, int var8) {
      if(1026557661 * this.anInt8246 != var1) {
         this.anInt8246 = 901644661 * var1;
      }

      this.anIntArray8247 = var2;
      this.aClass19Array8257 = var3;
      this.anIntArray8245 = var4;
      this.anIntArray8250 = var5;
      this.aBool8251 = var6;
      this.anInt8252 = -64149907 * var7;
      this.method7512((short)8946);
   }

   public static void method7520(int var0) {
      Class340.anInt3539 = 1247682365 * var0;
      Class192 var1 = aClass192_8239;
      synchronized(var1) {
         aClass192_8239.method2770(1222728533);
      }

      var1 = aClass192_8256;
      synchronized(var1) {
         aClass192_8256.method2770(1474858083);
      }
   }

   public static void method7521() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         aClass192_8256.method2770(1477709031);
      }

      var0 = aClass192_8239;
      synchronized(var0) {
         aClass192_8239.method2770(1186268511);
      }
   }

   public static void method7522(int var0) {
      Class192 var1 = aClass192_8256;
      synchronized(var1) {
         aClass192_8256.method2769(var0, (byte)-65);
      }

      var1 = aClass192_8239;
      synchronized(var1) {
         aClass192_8239.method2769(var0, (byte)-54);
      }
   }

   public Class168 method7523(Class174 var1, int var2, Class40_Sub9 var3, Class40_Sub11 var4, Class40_Sub1 var5, Interface17 var6, Interface19 var7, Class704 var8, int var9) {
      if(-1 != this.anInt8252 * -1760242843) {
         return ((NPCDef)var4.method89(this.anInt8252 * -1760242843, -1706447398)).method4061(var1, var2, var6, var7, var8, (Class294)null, (byte)69);
      } else {
         int var10 = var8 != null?var2 | var8.method8221((byte)41):var2;
         Class192 var11 = aClass192_8239;
         Class168 var12;
         synchronized(var11) {
            var12 = (Class168)aClass192_8239.method2765(2878033130569746253L * this.aLong8253);
         }

         if(var12 == null || var1.method2464(var12.method2101(), var10) != 0) {
            if(null != var12) {
               var10 = var1.method2533(var10, var12.method2101());
            }

            boolean var13 = false;

            int var15;
            for(int var14 = 0; var14 < this.anIntArray8247.length; ++var14) {
               var15 = this.anIntArray8247[var14];
               Class19 var16 = null;
               if((var15 & 1073741824) != 0) {
                  if(this.aClass19Array8257 != null && null != this.aClass19Array8257[var14]) {
                     var16 = this.aClass19Array8257[var14];
                  }

                  if(!((Class11)var5.method89(var15 & 1073741823, -517016848)).method600(this.aBool8251, var16, 1253539647)) {
                     var13 = true;
                  }
               } else if(0 != (var15 & Integer.MIN_VALUE) && !((Class326)var3.method89(var15 & 1073741823, -2056952900)).method4183(1197863358)) {
                  var13 = true;
               }
            }

            if(var13) {
               return null;
            }

            Class170[] var25 = new Class170[this.anIntArray8247.length];
            var15 = 0;

            int var17;
            for(int var26 = 0; var26 < this.anIntArray8247.length; ++var26) {
               var17 = this.anIntArray8247[var26];
               Class19 var18 = null;
               Class170 var19;
               if((var17 & 1073741824) != 0) {
                  if(null != this.aClass19Array8257 && null != this.aClass19Array8257[var26]) {
                     var18 = this.aClass19Array8257[var26];
                  }

                  var19 = ((Class11)var5.method89(var17 & 1073741823, -1416806700)).method594(this.aBool8251, var18, -271904055);
                  if(null != var19) {
                     var25[var15++] = var19;
                  }
               } else if(0 != (var17 & Integer.MIN_VALUE)) {
                  var19 = ((Class326)var3.method89(var17 & 1073741823, -566444041)).method4186(-1035490026);
                  if(null != var19) {
                     var25[var15++] = var19;
                  }
               }
            }

            Class170 var27 = new Class170(var25, var15);
            int var23 = var10 | 16384;
            var12 = var1.method2321(var27, var23, Class340.anInt3539 * -1998835691, 64, 768);

            int var29;
            for(var17 = 0; var17 < 10; ++var17) {
               for(var29 = 0; var29 < Class200.aShortArrayArray2206[var17].length; ++var29) {
                  if(this.anIntArray8245[var17] < Class510.aShortArrayArrayArray6984[var17][var29].length) {
                     var12.method1940(Class200.aShortArrayArray2206[var17][var29], Class510.aShortArrayArrayArray6984[var17][var29][this.anIntArray8245[var17]]);
                  }
               }
            }

            for(var17 = 0; var17 < 10; ++var17) {
               for(var29 = 0; var29 < Class643.aShortArrayArray8430[var17].length; ++var29) {
                  if(this.anIntArray8250[var17] < Class537.aShortArrayArrayArray7205[var17][var29].length) {
                     var12.method1992(Class643.aShortArrayArray8430[var17][var29], Class537.aShortArrayArrayArray7205[var17][var29][this.anIntArray8250[var17]]);
                  }
               }
            }

            var12.method2110(var10);
            Class192 var28 = aClass192_8239;
            synchronized(var28) {
               aClass192_8239.method2768(var12, 2878033130569746253L * this.aLong8253);
            }
         }

         if(var8 == null) {
            return var12;
         } else {
            Class168 var24 = var12.method1947((byte)4, var10, true);
            var8.method8231(var24, 0, 787652551);
            return var24;
         }
      }
   }

   public static void method7524() {
      Class192 var0 = aClass192_8256;
      synchronized(var0) {
         aClass192_8256.method2772(1845601622);
      }

      var0 = aClass192_8239;
      synchronized(var0) {
         aClass192_8239.method2772(-1742446843);
      }
   }

   static final void method7525(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1115410879 * var3.anInt2543;
   }

   static final void method7526(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class24 var3 = (Class24)Class465.aClass40_Sub17_5321.method89(var2, -739397392);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.method703(-1635734925);
   }

   static final void method7527(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1197569659 * Class32.anInt345;
   }

   static void method7528(byte var0) {
      client.anInt11216 = 0;
      client.anInt11220 = 0;
      client.anInt11222 = 0;
      client.anInt11313 = 0;
      client.anInt11226 = 0;
      client.anInt11228 = 0;
      client.anInt11215 = 0;
      client.anInt11246 = 0;
      client.anInt11231 = 0;
      client.anInt11197 = 0;
      client.anInt11233 = 0;
      client.anInt11234 = 0;
      client.anInt11235 = 0;
      client.anInt11052 = 0;
      client.anInt11237 = 0;
   }

   static final boolean method7529(int var0, int var1) {
      return var0 < 7;
   }
}
