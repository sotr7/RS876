package com.jagex;

import com.jagex.Class143;
import com.jagex.Class153;
import com.jagex.Class173;
import com.jagex.Class174;
import com.jagex.Class181;
import com.jagex.Class192;
import com.jagex.Class20;
import com.jagex.Class221;
import com.jagex.Class237;
import com.jagex.Class240;
import com.jagex.InterfaceDef;
import com.jagex.Class267;
import com.jagex.Class286;
import com.jagex.Class301;
import com.jagex.Class317;
import com.jagex.Class381;
import com.jagex.Class451;
import com.jagex.Class452;
import com.jagex.Class493;
import com.jagex.Class526;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class526_Sub9;
import com.jagex.Class554;
import com.jagex.Class561;
import com.jagex.Class681;
import com.jagex.Class692;
import com.jagex.Class704_Sub1;
import com.jagex.Class704_Sub3;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface17;
import com.jagex.Interface19;
import com.jagex.client;

public class Class238 implements Interface12 {
   public static final int anInt2406 = 0;
   public static final int anInt2425 = 1;
   public static final int anInt2431 = 2;
   public int anInt2400 = -129155123;
   public int anInt2417 = 1494519377;
   public String aString2398;
   public int anInt2403;
   public int anInt2404 = 1139015053;
   public int anInt2405 = 0;
   public boolean aBool2411 = true;
   int anInt2418 = -1930534875;
   public boolean aBool2412 = false;
   int anInt2419 = 1193048497;
   public int[] anIntArray2432;
   int anInt2430 = -861372443;
   int anInt2416 = -1855903673;
   public boolean aBool2434;
   public String aString2414;
   public int anInt2436;
   public int[] anIntArray2438;
   int anInt2415 = -1271559689;
   public int anInt2442;
   public byte[] aByteArray2439;
   int anInt2422 = 564279077;
   public int anInt2428;
   int anInt2423 = 407014271;
   public int anInt2397;
   int anInt2420;
   int anInt2421;
   public int anInt2402 = -782602661;
   public int anInt2410 = 797254689;
   public int anInt2433 = 1023204033;
   public int anInt2409;
   public int anInt2437;
   public int anInt2444;
   public int anInt2407;
   public Class286 aClass286_2408;
   public int[] anIntArray2424 = null;
   public Class267 aClass267_2441;
   Class20 aClass20_2443;
   public String[] aStringArray2413 = new String[5];
   public int anInt2426 = -1088358059;
   public int anInt2427 = 71578935;
   public int anInt2435 = Integer.MIN_VALUE;
   public int anInt2429 = Integer.MIN_VALUE;
   public int anInt2399;
   Interface14 anInterface14_2401;
   Class240 aClass240_2440;

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(1666991551);
         if(var2 == 0) {
            return;
         }

         this.method3290(var1, var2, -1631012646);
      }
   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-1629186288);
         if(var3 == 0) {
            return;
         }

         this.method3290(var1, var3, -2054168190);
      }
   }

   public Class153 method3287(Class174 var1, int var2) {
      int var3 = -598360317 * this.anInt2444 | -316183255 * var1.anInt2030 << 29;
      Class153 var4 = (Class153)this.aClass240_2440.aClass192_2450.method2765((long)var3);
      if(null != var4) {
         return var4;
      } else if(!this.aClass240_2440.aClass466_2449.method5537(-598360317 * this.anInt2444, (byte)85)) {
         return null;
      } else {
         Class173 var5 = Class181.method2679(this.aClass240_2440.aClass466_2449, -598360317 * this.anInt2444, 0);
         if(var5 != null) {
            var4 = var1.method2310(var5, true);
            this.aClass240_2440.aClass192_2450.method2768(var4, (long)var3);
         }

         return var4;
      }
   }

   void method3288(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt2400 = var1.readBigSmart((byte)6) * 129155123;
      } else if(2 == var2) {
         this.anInt2417 = var1.readBigSmart((byte)12) * -1494519377;
      } else if(3 == var2) {
         this.aString2398 = var1.readString(-1972160175);
      } else if(4 == var2) {
         this.anInt2403 = var1.read24BitInt(742041327) * 1560973951;
      } else if(var2 == 5) {
         this.anInt2404 = var1.read24BitInt(742041327) * -1139015053;
      } else if(6 == var2) {
         this.anInt2405 = var1.readUnsignedByte(802285329) * -535372319;
      } else {
         int var3;
         if(7 == var2) {
            var3 = var1.readUnsignedByte(133364565);
            if((var3 & 1) == 0) {
               this.aBool2411 = false;
            }

            if(2 == (var3 & 2)) {
               this.aBool2412 = true;
            }
         } else if(8 == var2) {
            var1.readUnsignedByte(-1750675428);
         } else if(var2 == 9) {
            this.anInt2418 = var1.readUnsignedShort(1284498247) * 1930534875;
            if(-160873389 * this.anInt2418 == '\uffff') {
               this.anInt2418 = -1930534875;
            }

            this.anInt2419 = var1.readUnsignedShort(1919771492) * -1193048497;
            if(2088358063 * this.anInt2419 == '\uffff') {
               this.anInt2419 = 1193048497;
            }

            this.anInt2430 = var1.readInt((byte)5) * 861372443;
            this.anInt2416 = var1.readInt((byte)5) * 1855903673;
         } else if(var2 >= 10 && var2 <= 14) {
            this.aStringArray2413[var2 - 10] = var1.readString(-239742282);
         } else {
            int var4;
            int var5;
            if(15 == var2) {
               var3 = var1.readUnsignedByte(-120805841);
               this.anIntArray2432 = new int[2 * var3];

               for(var4 = 0; var4 < var3 * 2; ++var4) {
                  this.anIntArray2432[var4] = var1.readShort((byte)1);
               }

               this.anInt2436 = var1.readInt((byte)5) * 483466335;
               var4 = var1.readUnsignedByte(859671007);
               this.anIntArray2438 = new int[var4];

               for(var5 = 0; var5 < this.anIntArray2438.length; ++var5) {
                  this.anIntArray2438[var5] = var1.readInt((byte)5);
               }

               this.aByteArray2439 = new byte[var3];

               for(var5 = 0; var5 < var3; ++var5) {
                  this.aByteArray2439[var5] = var1.readByte((byte)30);
               }
            } else if(var2 == 16) {
               this.aBool2434 = false;
            } else if(var2 == 17) {
               this.aString2414 = var1.readString(-1395794695);
            } else if(18 == var2) {
               this.anInt2415 = var1.readBigSmart((byte)-64) * 1271559689;
            } else if(var2 == 19) {
               this.anInt2442 = var1.readUnsignedShort(378529837) * -1193811099;
            } else if(var2 == 20) {
               this.anInt2422 = var1.readUnsignedShort(1946354510) * -564279077;
               if(282129235 * this.anInt2422 == '\uffff') {
                  this.anInt2422 = 564279077;
               }

               this.anInt2423 = var1.readUnsignedShort(2133043281) * -407014271;
               if(this.anInt2423 * 858180481 == '\uffff') {
                  this.anInt2423 = 407014271;
               }

               this.anInt2420 = var1.readInt((byte)5) * 1532440867;
               this.anInt2421 = var1.readInt((byte)5) * 1860754503;
            } else if(21 == var2) {
               this.anInt2428 = var1.readInt((byte)5) * -633551287;
            } else if(22 == var2) {
               this.anInt2397 = var1.readInt((byte)5) * -2125543481;
            } else if(var2 == 23) {
               this.anInt2402 = var1.readUnsignedByte(-945786333) * 782602661;
               this.anInt2410 = var1.readUnsignedByte(118633766) * -797254689;
               this.anInt2433 = var1.readUnsignedByte(159771328) * -1023204033;
            } else if(var2 == 24) {
               this.anInt2409 = var1.readShort((byte)1) * 1849679449;
               this.anInt2437 = var1.readShort((byte)1) * -1985370405;
            } else if(25 == var2) {
               this.anInt2444 = var1.readBigSmart((byte)-1) * 1865687979;
            } else if(var2 != 26 && var2 != 27) {
               if(var2 == 28) {
                  this.anInt2407 = var1.readUnsignedByte(1545313497) * 328334523;
               } else if(var2 == 29) {
                  this.aClass286_2408 = (Class286)Class561.findIdentifiable(Class381.method4712((byte)0), var1.readUnsignedByte(-1375153157), (byte)-109);
               } else if(var2 == 30) {
                  this.aClass267_2441 = (Class267)Class561.findIdentifiable(Class493.method5890(943633100), var1.readUnsignedByte(788349471), (byte)-44);
               } else if(249 == var2) {
                  var3 = var1.readUnsignedByte(-174132791);
                  if(this.aClass20_2443 == null) {
                     var4 = Class692.method8110(var3, -869108668);
                     this.aClass20_2443 = new Class20(var4);
                  }

                  for(var4 = 0; var4 < var3; ++var4) {
                     boolean var8 = var1.readUnsignedByte(1804015019) == 1;
                     int var6 = var1.read24BitInt(742041327);
                     Object var7;
                     if(var8) {
                        var7 = new LinkableObject(var1.readString(-555228202));
                     } else {
                        var7 = new Class526_Sub25(var1.readInt((byte)5));
                     }

                     this.aClass20_2443.put((Class526)var7, (long)var6);
                  }
               }
            } else {
               this.anInt2418 = var1.readUnsignedShort(1748100805) * 1930534875;
               if(this.anInt2418 * -160873389 == '\uffff') {
                  this.anInt2418 = -1930534875;
               }

               this.anInt2419 = var1.readUnsignedShort(477510869) * -1193048497;
               if('\uffff' == 2088358063 * this.anInt2419) {
                  this.anInt2419 = 1193048497;
               }

               var3 = -1;
               if(27 == var2) {
                  var3 = var1.readUnsignedShort(1782453055);
                  if('\uffff' == var3) {
                     var3 = -1;
                  }
               }

               var4 = var1.readUnsignedByte(60200613);
               this.anIntArray2424 = new int[var4 + 2];

               for(var5 = 0; var5 <= var4; ++var5) {
                  this.anIntArray2424[var5] = var1.readUnsignedShort(2063148823);
                  if('\uffff' == this.anIntArray2424[var5]) {
                     this.anIntArray2424[var5] = -1;
                  }
               }

               this.anIntArray2424[1 + var4] = var3;
            }
         }
      }

   }

   public int method3289(int var1, int var2) {
      if(this.aClass20_2443 == null) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_2443.get((long)var1);
         return null == var3?var2:var3.anInt10550 * -1044108751;
      }
   }

   void method3290(RSByteBuffer var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt2400 = var1.readBigSmart((byte)35) * 129155123;
      } else if(2 == var2) {
         this.anInt2417 = var1.readBigSmart((byte)-13) * -1494519377;
      } else if(3 == var2) {
         this.aString2398 = var1.readString(989368340);
      } else if(4 == var2) {
         this.anInt2403 = var1.read24BitInt(742041327) * 1560973951;
      } else if(var2 == 5) {
         this.anInt2404 = var1.read24BitInt(742041327) * -1139015053;
      } else if(6 == var2) {
         this.anInt2405 = var1.readUnsignedByte(-262462993) * -535372319;
      } else {
         int var4;
         if(7 == var2) {
            var4 = var1.readUnsignedByte(821631052);
            if((var4 & 1) == 0) {
               this.aBool2411 = false;
            }

            if(2 == (var4 & 2)) {
               this.aBool2412 = true;
            }
         } else if(8 == var2) {
            var1.readUnsignedByte(763047816);
         } else if(var2 == 9) {
            this.anInt2418 = var1.readUnsignedShort(909960134) * 1930534875;
            if(-160873389 * this.anInt2418 == '\uffff') {
               this.anInt2418 = -1930534875;
            }

            this.anInt2419 = var1.readUnsignedShort(1137145940) * -1193048497;
            if(2088358063 * this.anInt2419 == '\uffff') {
               this.anInt2419 = 1193048497;
            }

            this.anInt2430 = var1.readInt((byte)5) * 861372443;
            this.anInt2416 = var1.readInt((byte)5) * 1855903673;
         } else if(var2 >= 10 && var2 <= 14) {
            this.aStringArray2413[var2 - 10] = var1.readString(-256131381);
         } else {
            int var5;
            int var6;
            if(15 == var2) {
               var4 = var1.readUnsignedByte(1103581100);
               this.anIntArray2432 = new int[2 * var4];

               for(var5 = 0; var5 < var4 * 2; ++var5) {
                  this.anIntArray2432[var5] = var1.readShort((byte)1);
               }

               this.anInt2436 = var1.readInt((byte)5) * 483466335;
               var5 = var1.readUnsignedByte(-1575371388);
               this.anIntArray2438 = new int[var5];

               for(var6 = 0; var6 < this.anIntArray2438.length; ++var6) {
                  this.anIntArray2438[var6] = var1.readInt((byte)5);
               }

               this.aByteArray2439 = new byte[var4];

               for(var6 = 0; var6 < var4; ++var6) {
                  this.aByteArray2439[var6] = var1.readByte((byte)52);
               }
            } else if(var2 == 16) {
               this.aBool2434 = false;
            } else if(var2 == 17) {
               this.aString2414 = var1.readString(138798272);
            } else if(18 == var2) {
               this.anInt2415 = var1.readBigSmart((byte)-36) * 1271559689;
            } else if(var2 == 19) {
               this.anInt2442 = var1.readUnsignedShort(1668932597) * -1193811099;
            } else if(var2 == 20) {
               this.anInt2422 = var1.readUnsignedShort(1756021886) * -564279077;
               if(282129235 * this.anInt2422 == '\uffff') {
                  this.anInt2422 = 564279077;
               }

               this.anInt2423 = var1.readUnsignedShort(429541402) * -407014271;
               if(this.anInt2423 * 858180481 == '\uffff') {
                  this.anInt2423 = 407014271;
               }

               this.anInt2420 = var1.readInt((byte)5) * 1532440867;
               this.anInt2421 = var1.readInt((byte)5) * 1860754503;
            } else if(21 == var2) {
               this.anInt2428 = var1.readInt((byte)5) * -633551287;
            } else if(22 == var2) {
               this.anInt2397 = var1.readInt((byte)5) * -2125543481;
            } else if(var2 == 23) {
               this.anInt2402 = var1.readUnsignedByte(-1910478723) * 782602661;
               this.anInt2410 = var1.readUnsignedByte(-39285783) * -797254689;
               this.anInt2433 = var1.readUnsignedByte(1997696069) * -1023204033;
            } else if(var2 == 24) {
               this.anInt2409 = var1.readShort((byte)1) * 1849679449;
               this.anInt2437 = var1.readShort((byte)1) * -1985370405;
            } else if(25 == var2) {
               this.anInt2444 = var1.readBigSmart((byte)-90) * 1865687979;
            } else if(var2 != 26 && var2 != 27) {
               if(var2 == 28) {
                  this.anInt2407 = var1.readUnsignedByte(-1929818799) * 328334523;
               } else if(var2 == 29) {
                  this.aClass286_2408 = (Class286)Class561.findIdentifiable(Class381.method4712((byte)0), var1.readUnsignedByte(-723534846), (byte)-66);
               } else if(var2 == 30) {
                  this.aClass267_2441 = (Class267)Class561.findIdentifiable(Class493.method5890(943633100), var1.readUnsignedByte(-548664757), (byte)-62);
               } else if(249 == var2) {
                  var4 = var1.readUnsignedByte(-2042458135);
                  if(this.aClass20_2443 == null) {
                     var5 = Class692.method8110(var4, -604934612);
                     this.aClass20_2443 = new Class20(var5);
                  }

                  for(var5 = 0; var5 < var4; ++var5) {
                     boolean var9 = var1.readUnsignedByte(1982757568) == 1;
                     int var7 = var1.read24BitInt(742041327);
                     Object var8;
                     if(var9) {
                        var8 = new LinkableObject(var1.readString(221965024));
                     } else {
                        var8 = new Class526_Sub25(var1.readInt((byte)5));
                     }

                     this.aClass20_2443.put((Class526)var8, (long)var7);
                  }
               }
            } else {
               this.anInt2418 = var1.readUnsignedShort(1948413588) * 1930534875;
               if(this.anInt2418 * -160873389 == '\uffff') {
                  this.anInt2418 = -1930534875;
               }

               this.anInt2419 = var1.readUnsignedShort(497060368) * -1193048497;
               if('\uffff' == 2088358063 * this.anInt2419) {
                  this.anInt2419 = 1193048497;
               }

               var4 = -1;
               if(27 == var2) {
                  var4 = var1.readUnsignedShort(1843721463);
                  if('\uffff' == var4) {
                     var4 = -1;
                  }
               }

               var5 = var1.readUnsignedByte(379501088);
               this.anIntArray2424 = new int[var5 + 2];

               for(var6 = 0; var6 <= var5; ++var6) {
                  this.anIntArray2424[var6] = var1.readUnsignedShort(2136021035);
                  if('\uffff' == this.anIntArray2424[var6]) {
                     this.anIntArray2424[var6] = -1;
                  }
               }

               this.anIntArray2424[1 + var5] = var4;
            }
         }
      }

   }

   public String method3291(int var1, String var2) {
      if(null == this.aClass20_2443) {
         return var2;
      } else {
         LinkableObject var3 = (LinkableObject)this.aClass20_2443.get((long)var1);
         return null == var3?var2:(String)var3.anObject10399;
      }
   }

   public Class153 method3292(Class174 var1, int var2) {
      Class153 var3 = (Class153)this.aClass240_2440.aClass192_2450.method2765((long)(-574883783 * this.anInt2415 | 131072 | var1.anInt2030 * -316183255 << 29));
      if(var3 != null) {
         return var3;
      } else {
         this.aClass240_2440.aClass466_2449.method5537(-574883783 * this.anInt2415, (byte)45);
         Class173 var4 = Class181.method2679(this.aClass240_2440.aClass466_2449, this.anInt2415 * -574883783, 0);
         if(var4 != null) {
            var3 = var1.method2310(var4, true);
            this.aClass240_2440.aClass192_2450.method2768(var3, (long)(this.anInt2415 * -574883783 | 131072 | -316183255 * var1.anInt2030 << 29));
         }

         return var3;
      }
   }

   public Class153 method3293(Class174 var1) {
      Class153 var2 = (Class153)this.aClass240_2440.aClass192_2450.method2765((long)(-574883783 * this.anInt2415 | 131072 | var1.anInt2030 * -316183255 << 29));
      if(var2 != null) {
         return var2;
      } else {
         this.aClass240_2440.aClass466_2449.method5537(-574883783 * this.anInt2415, (byte)75);
         Class173 var3 = Class181.method2679(this.aClass240_2440.aClass466_2449, this.anInt2415 * -574883783, 0);
         if(var3 != null) {
            var2 = var1.method2310(var3, true);
            this.aClass240_2440.aClass192_2450.method2768(var2, (long)(this.anInt2415 * -574883783 | 131072 | -316183255 * var1.anInt2030 << 29));
         }

         return var2;
      }
   }

   public String method3294(int var1, String var2, int var3) {
      if(null == this.aClass20_2443) {
         return var2;
      } else {
         LinkableObject var4 = (LinkableObject)this.aClass20_2443.get((long)var1);
         return null == var4?var2:(String)var4.anObject10399;
      }
   }

   public final Class238 method3295(Interface17 var1, Interface19 var2, int var3) {
      int var4 = -1;
      if(-160873389 * this.anInt2418 != -1) {
         Class317 var5 = var1.method109(this.anInt2418 * -160873389, '\uff00');
         if(var5 != null) {
            var4 = var2.method116(var5, (byte)11);
         }
      } else if(this.anInt2419 * 2088358063 != -1) {
         Class143 var6 = var1.method106(Class452.aClass452_4946, this.anInt2419 * 2088358063, 1312187395);
         if(var6 != null) {
            var4 = var2.method114(var6, -638220268);
         }
      }

      if(var4 >= 0 && var4 < this.anIntArray2424.length - 1) {
         return this.anIntArray2424[var4] == -1?null:(Class238)this.anInterface14_2401.method89(this.anIntArray2424[var4], -1109856174);
      } else {
         int var7 = this.anIntArray2424[this.anIntArray2424.length - 1];
         return var7 != -1?(Class238)this.anInterface14_2401.method89(var7, 2499064):null;
      }
   }

   public Class153 method3296(Class174 var1, boolean var2, int var3) {
      int var4 = var2?-1019706033 * this.anInt2417:this.anInt2400 * -1056556293;
      int var5 = var4 | -316183255 * var1.anInt2030 << 29;
      Class153 var6 = (Class153)this.aClass240_2440.aClass192_2450.method2765((long)var5);
      if(var6 != null) {
         return var6;
      } else if(!this.aClass240_2440.aClass466_2449.method5537(var4, (byte)111)) {
         return null;
      } else {
         Class173 var7 = Class181.method2679(this.aClass240_2440.aClass466_2449, var4, 0);
         if(var7 != null) {
            var6 = var1.method2310(var7, true);
            this.aClass240_2440.aClass192_2450.method2768(var6, (long)var5);
         }

         return var6;
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1731636034);
         if(var2 == 0) {
            return;
         }

         this.method3290(var1, var2, -1758817452);
      }
   }

   Class238(int var1, Interface14 var2, Class240 var3) {
      this.aClass286_2408 = Class286.aClass286_3096;
      this.aClass267_2441 = Class267.aClass267_2984;
      this.anInt2407 = -328334523;
      this.aBool2434 = true;
      this.anInt2442 = 1193811099;
      this.anInt2444 = -1865687979;
      this.anInt2399 = var1 * 978183079;
      this.anInterface14_2401 = var2;
      this.aClass240_2440 = var3;
   }

   void method3297(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt2400 = var1.readBigSmart((byte)-14) * 129155123;
      } else if(2 == var2) {
         this.anInt2417 = var1.readBigSmart((byte)-73) * -1494519377;
      } else if(3 == var2) {
         this.aString2398 = var1.readString(1947946548);
      } else if(4 == var2) {
         this.anInt2403 = var1.read24BitInt(742041327) * 1560973951;
      } else if(var2 == 5) {
         this.anInt2404 = var1.read24BitInt(742041327) * -1139015053;
      } else if(6 == var2) {
         this.anInt2405 = var1.readUnsignedByte(-1712184636) * -535372319;
      } else {
         int var3;
         if(7 == var2) {
            var3 = var1.readUnsignedByte(-1913658994);
            if((var3 & 1) == 0) {
               this.aBool2411 = false;
            }

            if(2 == (var3 & 2)) {
               this.aBool2412 = true;
            }
         } else if(8 == var2) {
            var1.readUnsignedByte(-784992320);
         } else if(var2 == 9) {
            this.anInt2418 = var1.readUnsignedShort(372061343) * 1930534875;
            if(-160873389 * this.anInt2418 == '\uffff') {
               this.anInt2418 = -1930534875;
            }

            this.anInt2419 = var1.readUnsignedShort(1905542999) * -1193048497;
            if(2088358063 * this.anInt2419 == '\uffff') {
               this.anInt2419 = 1193048497;
            }

            this.anInt2430 = var1.readInt((byte)5) * 861372443;
            this.anInt2416 = var1.readInt((byte)5) * 1855903673;
         } else if(var2 >= 10 && var2 <= 14) {
            this.aStringArray2413[var2 - 10] = var1.readString(445707368);
         } else {
            int var4;
            int var5;
            if(15 == var2) {
               var3 = var1.readUnsignedByte(1070355810);
               this.anIntArray2432 = new int[2 * var3];

               for(var4 = 0; var4 < var3 * 2; ++var4) {
                  this.anIntArray2432[var4] = var1.readShort((byte)1);
               }

               this.anInt2436 = var1.readInt((byte)5) * 483466335;
               var4 = var1.readUnsignedByte(2138603712);
               this.anIntArray2438 = new int[var4];

               for(var5 = 0; var5 < this.anIntArray2438.length; ++var5) {
                  this.anIntArray2438[var5] = var1.readInt((byte)5);
               }

               this.aByteArray2439 = new byte[var3];

               for(var5 = 0; var5 < var3; ++var5) {
                  this.aByteArray2439[var5] = var1.readByte((byte)105);
               }
            } else if(var2 == 16) {
               this.aBool2434 = false;
            } else if(var2 == 17) {
               this.aString2414 = var1.readString(468042399);
            } else if(18 == var2) {
               this.anInt2415 = var1.readBigSmart((byte)-73) * 1271559689;
            } else if(var2 == 19) {
               this.anInt2442 = var1.readUnsignedShort(1017614293) * -1193811099;
            } else if(var2 == 20) {
               this.anInt2422 = var1.readUnsignedShort(284320477) * -564279077;
               if(282129235 * this.anInt2422 == '\uffff') {
                  this.anInt2422 = 564279077;
               }

               this.anInt2423 = var1.readUnsignedShort(2142357021) * -407014271;
               if(this.anInt2423 * 858180481 == '\uffff') {
                  this.anInt2423 = 407014271;
               }

               this.anInt2420 = var1.readInt((byte)5) * 1532440867;
               this.anInt2421 = var1.readInt((byte)5) * 1860754503;
            } else if(21 == var2) {
               this.anInt2428 = var1.readInt((byte)5) * -633551287;
            } else if(22 == var2) {
               this.anInt2397 = var1.readInt((byte)5) * -2125543481;
            } else if(var2 == 23) {
               this.anInt2402 = var1.readUnsignedByte(682046941) * 782602661;
               this.anInt2410 = var1.readUnsignedByte(-857116915) * -797254689;
               this.anInt2433 = var1.readUnsignedByte(1585640793) * -1023204033;
            } else if(var2 == 24) {
               this.anInt2409 = var1.readShort((byte)1) * 1849679449;
               this.anInt2437 = var1.readShort((byte)1) * -1985370405;
            } else if(25 == var2) {
               this.anInt2444 = var1.readBigSmart((byte)-94) * 1865687979;
            } else if(var2 != 26 && var2 != 27) {
               if(var2 == 28) {
                  this.anInt2407 = var1.readUnsignedByte(517096812) * 328334523;
               } else if(var2 == 29) {
                  this.aClass286_2408 = (Class286)Class561.findIdentifiable(Class381.method4712((byte)0), var1.readUnsignedByte(-67978682), (byte)-90);
               } else if(var2 == 30) {
                  this.aClass267_2441 = (Class267)Class561.findIdentifiable(Class493.method5890(943633100), var1.readUnsignedByte(1237201270), (byte)-108);
               } else if(249 == var2) {
                  var3 = var1.readUnsignedByte(-1713823597);
                  if(this.aClass20_2443 == null) {
                     var4 = Class692.method8110(var3, 1214483403);
                     this.aClass20_2443 = new Class20(var4);
                  }

                  for(var4 = 0; var4 < var3; ++var4) {
                     boolean var8 = var1.readUnsignedByte(376001069) == 1;
                     int var6 = var1.read24BitInt(742041327);
                     Object var7;
                     if(var8) {
                        var7 = new LinkableObject(var1.readString(522655601));
                     } else {
                        var7 = new Class526_Sub25(var1.readInt((byte)5));
                     }

                     this.aClass20_2443.put((Class526)var7, (long)var6);
                  }
               }
            } else {
               this.anInt2418 = var1.readUnsignedShort(1357491641) * 1930534875;
               if(this.anInt2418 * -160873389 == '\uffff') {
                  this.anInt2418 = -1930534875;
               }

               this.anInt2419 = var1.readUnsignedShort(432143920) * -1193048497;
               if('\uffff' == 2088358063 * this.anInt2419) {
                  this.anInt2419 = 1193048497;
               }

               var3 = -1;
               if(27 == var2) {
                  var3 = var1.readUnsignedShort(1512668285);
                  if('\uffff' == var3) {
                     var3 = -1;
                  }
               }

               var4 = var1.readUnsignedByte(-789100484);
               this.anIntArray2424 = new int[var4 + 2];

               for(var5 = 0; var5 <= var4; ++var5) {
                  this.anIntArray2424[var5] = var1.readUnsignedShort(1460694659);
                  if('\uffff' == this.anIntArray2424[var5]) {
                     this.anIntArray2424[var5] = -1;
                  }
               }

               this.anIntArray2424[1 + var4] = var3;
            }
         }
      }

   }

   void method3298(RSByteBuffer var1, int var2) {
      if(var2 == 1) {
         this.anInt2400 = var1.readBigSmart((byte)15) * 129155123;
      } else if(2 == var2) {
         this.anInt2417 = var1.readBigSmart((byte)22) * -1494519377;
      } else if(3 == var2) {
         this.aString2398 = var1.readString(1991728068);
      } else if(4 == var2) {
         this.anInt2403 = var1.read24BitInt(742041327) * 1560973951;
      } else if(var2 == 5) {
         this.anInt2404 = var1.read24BitInt(742041327) * -1139015053;
      } else if(6 == var2) {
         this.anInt2405 = var1.readUnsignedByte(-135771634) * -535372319;
      } else {
         int var3;
         if(7 == var2) {
            var3 = var1.readUnsignedByte(-934761934);
            if((var3 & 1) == 0) {
               this.aBool2411 = false;
            }

            if(2 == (var3 & 2)) {
               this.aBool2412 = true;
            }
         } else if(8 == var2) {
            var1.readUnsignedByte(883855410);
         } else if(var2 == 9) {
            this.anInt2418 = var1.readUnsignedShort(1630924468) * 1930534875;
            if(-160873389 * this.anInt2418 == '\uffff') {
               this.anInt2418 = -1930534875;
            }

            this.anInt2419 = var1.readUnsignedShort(1022114778) * -1193048497;
            if(2088358063 * this.anInt2419 == '\uffff') {
               this.anInt2419 = 1193048497;
            }

            this.anInt2430 = var1.readInt((byte)5) * 861372443;
            this.anInt2416 = var1.readInt((byte)5) * 1855903673;
         } else if(var2 >= 10 && var2 <= 14) {
            this.aStringArray2413[var2 - 10] = var1.readString(1915708976);
         } else {
            int var4;
            int var5;
            if(15 == var2) {
               var3 = var1.readUnsignedByte(-1935426656);
               this.anIntArray2432 = new int[2 * var3];

               for(var4 = 0; var4 < var3 * 2; ++var4) {
                  this.anIntArray2432[var4] = var1.readShort((byte)1);
               }

               this.anInt2436 = var1.readInt((byte)5) * 483466335;
               var4 = var1.readUnsignedByte(1886080795);
               this.anIntArray2438 = new int[var4];

               for(var5 = 0; var5 < this.anIntArray2438.length; ++var5) {
                  this.anIntArray2438[var5] = var1.readInt((byte)5);
               }

               this.aByteArray2439 = new byte[var3];

               for(var5 = 0; var5 < var3; ++var5) {
                  this.aByteArray2439[var5] = var1.readByte((byte)91);
               }
            } else if(var2 == 16) {
               this.aBool2434 = false;
            } else if(var2 == 17) {
               this.aString2414 = var1.readString(241293545);
            } else if(18 == var2) {
               this.anInt2415 = var1.readBigSmart((byte)28) * 1271559689;
            } else if(var2 == 19) {
               this.anInt2442 = var1.readUnsignedShort(50047655) * -1193811099;
            } else if(var2 == 20) {
               this.anInt2422 = var1.readUnsignedShort(660761294) * -564279077;
               if(282129235 * this.anInt2422 == '\uffff') {
                  this.anInt2422 = 564279077;
               }

               this.anInt2423 = var1.readUnsignedShort(2130117950) * -407014271;
               if(this.anInt2423 * 858180481 == '\uffff') {
                  this.anInt2423 = 407014271;
               }

               this.anInt2420 = var1.readInt((byte)5) * 1532440867;
               this.anInt2421 = var1.readInt((byte)5) * 1860754503;
            } else if(21 == var2) {
               this.anInt2428 = var1.readInt((byte)5) * -633551287;
            } else if(22 == var2) {
               this.anInt2397 = var1.readInt((byte)5) * -2125543481;
            } else if(var2 == 23) {
               this.anInt2402 = var1.readUnsignedByte(1557554839) * 782602661;
               this.anInt2410 = var1.readUnsignedByte(-490418539) * -797254689;
               this.anInt2433 = var1.readUnsignedByte(-1492639531) * -1023204033;
            } else if(var2 == 24) {
               this.anInt2409 = var1.readShort((byte)1) * 1849679449;
               this.anInt2437 = var1.readShort((byte)1) * -1985370405;
            } else if(25 == var2) {
               this.anInt2444 = var1.readBigSmart((byte)81) * 1865687979;
            } else if(var2 != 26 && var2 != 27) {
               if(var2 == 28) {
                  this.anInt2407 = var1.readUnsignedByte(-55241156) * 328334523;
               } else if(var2 == 29) {
                  this.aClass286_2408 = (Class286)Class561.findIdentifiable(Class381.method4712((byte)0), var1.readUnsignedByte(1560598090), (byte)-104);
               } else if(var2 == 30) {
                  this.aClass267_2441 = (Class267)Class561.findIdentifiable(Class493.method5890(943633100), var1.readUnsignedByte(362725996), (byte)1);
               } else if(249 == var2) {
                  var3 = var1.readUnsignedByte(655108130);
                  if(this.aClass20_2443 == null) {
                     var4 = Class692.method8110(var3, -149469317);
                     this.aClass20_2443 = new Class20(var4);
                  }

                  for(var4 = 0; var4 < var3; ++var4) {
                     boolean var8 = var1.readUnsignedByte(-1618832566) == 1;
                     int var6 = var1.read24BitInt(742041327);
                     Object var7;
                     if(var8) {
                        var7 = new LinkableObject(var1.readString(-1667756442));
                     } else {
                        var7 = new Class526_Sub25(var1.readInt((byte)5));
                     }

                     this.aClass20_2443.put((Class526)var7, (long)var6);
                  }
               }
            } else {
               this.anInt2418 = var1.readUnsignedShort(2089078734) * 1930534875;
               if(this.anInt2418 * -160873389 == '\uffff') {
                  this.anInt2418 = -1930534875;
               }

               this.anInt2419 = var1.readUnsignedShort(1519909174) * -1193048497;
               if('\uffff' == 2088358063 * this.anInt2419) {
                  this.anInt2419 = 1193048497;
               }

               var3 = -1;
               if(27 == var2) {
                  var3 = var1.readUnsignedShort(231348470);
                  if('\uffff' == var3) {
                     var3 = -1;
                  }
               }

               var4 = var1.readUnsignedByte(1276750896);
               this.anIntArray2424 = new int[var4 + 2];

               for(var5 = 0; var5 <= var4; ++var5) {
                  this.anIntArray2424[var5] = var1.readUnsignedShort(1632204651);
                  if('\uffff' == this.anIntArray2424[var5]) {
                     this.anIntArray2424[var5] = -1;
                  }
               }

               this.anIntArray2424[1 + var4] = var3;
            }
         }
      }

   }

   public int method3299(int var1, int var2, byte var3) {
      if(this.aClass20_2443 == null) {
         return var2;
      } else {
         Class526_Sub25 var4 = (Class526_Sub25)this.aClass20_2443.get((long)var1);
         return null == var4?var2:var4.anInt10550 * -1044108751;
      }
   }

   public Class153 method3300(Class174 var1) {
      Class153 var2 = (Class153)this.aClass240_2440.aClass192_2450.method2765((long)(-574883783 * this.anInt2415 | 131072 | var1.anInt2030 * -316183255 << 29));
      if(var2 != null) {
         return var2;
      } else {
         this.aClass240_2440.aClass466_2449.method5537(-574883783 * this.anInt2415, (byte)90);
         Class173 var3 = Class181.method2679(this.aClass240_2440.aClass466_2449, this.anInt2415 * -574883783, 0);
         if(var3 != null) {
            var2 = var1.method2310(var3, true);
            this.aClass240_2440.aClass192_2450.method2768(var2, (long)(this.anInt2415 * -574883783 | 131072 | -316183255 * var1.anInt2030 << 29));
         }

         return var2;
      }
   }

   public void method81(int var1) {
      if(null != this.anIntArray2432) {
         for(int var2 = 0; var2 < this.anIntArray2432.length; var2 += 2) {
            if(this.anIntArray2432[var2] < this.anInt2426 * 349750275) {
               this.anInt2426 = this.anIntArray2432[var2] * -1059125589;
            } else if(this.anIntArray2432[var2] > this.anInt2435 * -1735224795) {
               this.anInt2435 = 1106590125 * this.anIntArray2432[var2];
            }

            if(this.anIntArray2432[1 + var2] < this.anInt2427 * -1261408391) {
               this.anInt2427 = 2075904713 * this.anIntArray2432[var2 + 1];
            } else if(this.anIntArray2432[var2 + 1] > this.anInt2429 * 759879505) {
               this.anInt2429 = this.anIntArray2432[var2 + 1] * 1341706673;
            }
         }
      }

   }

   public int method3301(int var1, int var2) {
      if(this.aClass20_2443 == null) {
         return var2;
      } else {
         Class526_Sub25 var3 = (Class526_Sub25)this.aClass20_2443.get((long)var1);
         return null == var3?var2:var3.anInt10550 * -1044108751;
      }
   }

   public void method85() {
      if(null != this.anIntArray2432) {
         for(int var1 = 0; var1 < this.anIntArray2432.length; var1 += 2) {
            if(this.anIntArray2432[var1] < this.anInt2426 * 349750275) {
               this.anInt2426 = this.anIntArray2432[var1] * -1059125589;
            } else if(this.anIntArray2432[var1] > this.anInt2435 * -1735224795) {
               this.anInt2435 = 1106590125 * this.anIntArray2432[var1];
            }

            if(this.anIntArray2432[1 + var1] < this.anInt2427 * -1261408391) {
               this.anInt2427 = 2075904713 * this.anIntArray2432[var1 + 1];
            } else if(this.anIntArray2432[var1 + 1] > this.anInt2429 * 759879505) {
               this.anInt2429 = this.anIntArray2432[var1 + 1] * 1341706673;
            }
         }
      }

   }

   public boolean method3302(Interface17 var1, Interface19 var2, int var3) {
      boolean var4 = true;
      int var7;
      if(2088358063 * this.anInt2419 != -1) {
         Class143 var5 = var1.method106(Class452.aClass452_4946, 2088358063 * this.anInt2419, 479974313);
         var7 = var2.method114(var5, -58453195);
      } else {
         if(this.anInt2418 * -160873389 == -1) {
            return true;
         }

         Class317 var8 = var1.method109(this.anInt2418 * -160873389, '\uff00');
         var7 = var2.method116(var8, (byte)37);
      }

      int var9;
      if(null == this.anIntArray2424) {
         if(var7 < this.anInt2430 * 1340627475 || var7 > this.anInt2416 * 1528692361) {
            return false;
         }
      } else {
         if(var7 < 0 || var7 >= this.anIntArray2424.length - 1) {
            var9 = this.anIntArray2424[this.anIntArray2424.length - 1];
            if(var9 == -1) {
               return false;
            }

            if(this.anInt2430 * 1340627475 != -1 && 1528692361 * this.anInt2416 != -1 && (var7 < 1340627475 * this.anInt2430 || var7 > 1528692361 * this.anInt2416)) {
               return false;
            }
         }

         if(this.anIntArray2424[var7] == -1) {
            return false;
         }
      }

      boolean var10 = false;
      if(-1 != this.anInt2423 * 858180481) {
         Class143 var6 = var1.method106(Class452.aClass452_4946, 858180481 * this.anInt2423, 965913770);
         var9 = var2.method114(var6, 621710158);
      } else {
         if(282129235 * this.anInt2422 == -1) {
            return true;
         }

         Class317 var11 = var1.method109(this.anInt2422 * 282129235, '\uff00');
         var9 = var2.method116(var11, (byte)28);
      }

      if(var9 >= 55608971 * this.anInt2420 && var9 <= this.anInt2421 * 534646135) {
         return true;
      } else {
         return false;
      }
   }

   static Class301[] method3303(int var0) {
      return new Class301[]{Class301.aClass301_3257, Class301.aClass301_3259, Class301.aClass301_3255};
   }

   static final void method3304(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)8);
      Class192.method2790(var3, var0, 1926158167);
   }

   static final void method3305(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)65);
      int var4 = -1;
      int var5 = -1;
      Class237 var6 = var3.method3351(Class554.aClass174_7475, (byte)13);
      if(null != var6) {
         var4 = var6.anInt2393 * 569137057;
         var5 = var6.anInt2392 * -837894619;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
   }

   static final void method3306(InterfaceDef var0, byte var1) {
      if(var0.anInt2493 * -1805497315 == InterfaceDef.anInt2665 * -852943103) {
         if(Class451.localPlayer.aString12161 == null) {
            var0.anInt2539 = 0;
            var0.anInt2540 = 0;
            return;
         }

         var0.anInt2544 = -588612054;
         var0.anInt2545 = ((int)(Math.sin((double)client.anInt11012 / 40.0D) * 256.0D) & 2047) * -2106415021;
         var0.modelType = -1114622803;
         var0.anInt2539 = -1697811977 * client.localPlayerIndex;
         var0.anInt2540 = Class526_Sub9.method9360(Class451.localPlayer.aString12161, (byte)-5) * -2065854121;
         Class704_Sub3 var2 = Class451.localPlayer.aClass704_Sub3_11914;
         if(null != var2) {
            if(var0.aClass704_2661 == null) {
               var0.aClass704_2661 = new Class704_Sub1();
            }

            var0.anInt2660 = var2.method8220(-1511633344) * 673005851;
            var0.aClass704_2661.method8255(var2, (byte)-91);
         } else {
            var0.aClass704_2661 = null;
         }
      }

   }
}
