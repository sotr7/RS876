package com.jagex;

import com.jagex.Class193;
import com.jagex.Class20;
import com.jagex.Class202;
import com.jagex.Class280;
import com.jagex.Class396;
import com.jagex.Class453;
import com.jagex.Class461;
import com.jagex.Class497;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub10;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.LinkableObject;
import com.jagex.Class570;
import com.jagex.Class692;
import com.jagex.Interface12;

public class Class206 implements Interface12 {
   public static Class396 aClass396_2246;
   public static Class453 aClass453_2247;
   public int[] anIntArray2226;
   public int anInt2243 = -328862319;
   public int anInt2234 = 1255828091;
   public int[] anIntArray2232;
   public int anInt2230 = -76949825;
   public int anInt2240 = -333212185;
   public int anInt2235 = 1073877223;
   public int anInt2236 = 1814222737;
   public int anInt2237 = -187093333;
   public int anInt2238 = -1473627774;
   public int[][] anIntArrayArray2228;
   public int[] anIntArray2225;
   public boolean aBool2239 = false;
   public boolean aBool2223 = false;
   public int[] anIntArray2241;
   public int[] anIntArray2242;
   public int[] anIntArray2233;
   public int anInt2245 = 885096599;
   int anInt2229 = -45577045;
   public Class202 aClass202_2221;
   Class20 aClass20_2244;
   public int anInt2227 = 0;
   public static boolean aBool2224 = false;
   public int anInt2222;
   Class193 aClass193_2231;

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1443561369);
         if(0 == var2) {
            return;
         }

         this.method2905(var1, var2, 1903830697);
      }
   }

   void method2899(RSByteBuffer var1, int var2) {
      int var3;
      int var4;
      if(1 == var2) {
         var3 = var1.readUnsignedShort(1750518053);
         this.anIntArray2226 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2226[var4] = var1.readUnsignedShort(2016847586);
         }

         this.anIntArray2232 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2232[var4] = var1.readUnsignedShort(1215974998);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2232[var4] += var1.readUnsignedShort(243964450) << 16;
         }
      } else if(2 == var2) {
         this.anInt2243 = var1.readUnsignedShort(460114608) * 328862319;
      } else if(var2 == 5) {
         this.anInt2234 = var1.readUnsignedByte(56710859) * -607827841;
      } else if(6 == var2) {
         this.anInt2230 = var1.readUnsignedShort(1179369528) * 76949825;
      } else if(var2 == 7) {
         this.anInt2240 = var1.readUnsignedShort(1667102516) * 333212185;
      } else if(8 == var2) {
         this.anInt2235 = var1.readUnsignedByte(1769786609) * 357915309;
      } else if(var2 == 9) {
         this.anInt2236 = var1.readUnsignedByte(-1247989335) * -1814222737;
      } else if(10 == var2) {
         this.anInt2237 = var1.readUnsignedByte(2139324607) * 187093333;
      } else if(var2 == 11) {
         this.anInt2238 = var1.readUnsignedByte(728805751) * -736813887;
      } else if(var2 != 12 && 112 != var2) {
         int var6;
         if(var2 == 13) {
            var3 = var1.readUnsignedShort(1346765814);
            this.anIntArrayArray2228 = new int[var3][];

            for(var4 = 0; var4 < var3; ++var4) {
               int var5 = var1.readUnsignedByte(2029779637);
               if(var5 > 0) {
                  this.anIntArrayArray2228[var4] = new int[var5];
                  this.anIntArrayArray2228[var4][0] = var1.read24BitInt(742041327);

                  for(var6 = 1; var6 < var5; ++var6) {
                     this.anIntArrayArray2228[var4][var6] = var1.readUnsignedShort(2123303491);
                  }
               }
            }
         } else if(14 == var2) {
            this.aBool2239 = true;
         } else if(var2 == 15) {
            this.aBool2223 = true;
         } else if(16 != var2 && 18 != var2) {
            if(var2 != 19 && var2 != 119) {
               if(20 != var2 && var2 != 120) {
                  if(22 == var2) {
                     this.anInt2245 = var1.readUnsignedByte(-1266084197) * -885096599;
                  } else if(23 == var2) {
                     var1.readUnsignedShort(2077032041);
                  } else if(var2 == 24) {
                     this.anInt2229 = var1.readUnsignedShort(1839045365) * 45577045;
                     if(null != this.aClass193_2231) {
                        this.aClass202_2221 = (Class202)this.aClass193_2231.anInterface14_2174.method89(1755378173 * this.anInt2229, -756300301);
                     }
                  } else if(var2 == 249) {
                     var3 = var1.readUnsignedByte(706130385);
                     if(null == this.aClass20_2244) {
                        var4 = Class692.method8110(var3, -2015977649);
                        this.aClass20_2244 = new Class20(var4);
                     }

                     for(var4 = 0; var4 < var3; ++var4) {
                        boolean var8 = var1.readUnsignedByte(-1973214572) == 1;
                        var6 = var1.read24BitInt(742041327);
                        Object var7;
                        if(var8) {
                           var7 = new LinkableObject(var1.readString(893297633));
                        } else {
                           var7 = new Class526_Sub25(var1.readInt((byte)5));
                        }

                        this.aClass20_2244.put((Class526)var7, (long)var6);
                     }
                  }
               } else {
                  if(this.anIntArray2242 == null || this.anIntArray2233 == null) {
                     this.anIntArray2242 = new int[this.anIntArrayArray2228.length];
                     this.anIntArray2233 = new int[this.anIntArrayArray2228.length];

                     for(var3 = 0; var3 < this.anIntArrayArray2228.length; ++var3) {
                        this.anIntArray2242[var3] = 256;
                        this.anIntArray2233[var3] = 256;
                     }
                  }

                  if(var2 == 20) {
                     var3 = var1.readUnsignedByte(-232770144);
                  } else {
                     var3 = var1.readUnsignedShort(1607082918);
                  }

                  this.anIntArray2242[var3] = var1.readUnsignedShort(41742455);
                  this.anIntArray2233[var3] = var1.readUnsignedShort(111209839);
               }
            } else {
               if(this.anIntArray2241 == null) {
                  this.anIntArray2241 = new int[this.anIntArrayArray2228.length];

                  for(var3 = 0; var3 < this.anIntArrayArray2228.length; ++var3) {
                     this.anIntArray2241[var3] = 255;
                  }
               }

               if(19 == var2) {
                  var3 = var1.readUnsignedByte(487202149);
               } else {
                  var3 = var1.readUnsignedShort(749154701);
               }

               this.anIntArray2241[var3] = var1.readUnsignedByte(1896284593);
            }
         }
      } else {
         if(12 == var2) {
            var3 = var1.readUnsignedByte(519873738);
         } else {
            var3 = var1.readUnsignedShort(500745130);
         }

         this.anIntArray2225 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2225[var4] = var1.readUnsignedShort(471531087);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2225[var4] += var1.readUnsignedShort(24953432) << 16;
         }
      }

   }

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-54870436);
         if(0 == var3) {
            return;
         }

         this.method2905(var1, var3, 2012158534);
      }
   }

   public void method81(int var1) {
      if(-1 == 796997263 * this.anInt2236) {
         if(null != this.aClass202_2221 && null != this.aClass202_2221.aBoolArray2211) {
            this.anInt2236 = 666521822;
         } else {
            this.anInt2236 = 0;
         }
      }

      if(-571300867 * this.anInt2237 == -1) {
         if(null != this.aClass202_2221 && null != this.aClass202_2221.aBoolArray2211) {
            this.anInt2237 = 374186666;
         } else {
            this.anInt2237 = 0;
         }
      }

      if(this.anIntArray2226 != null) {
         this.anInt2227 = 0;

         for(int var2 = 0; var2 < this.anIntArray2226.length; ++var2) {
            this.anInt2227 += -1100187443 * this.anIntArray2226[var2];
         }
      }

   }

   public boolean method2900(int var1) {
      if(null == this.anIntArray2232) {
         return true;
      } else {
         boolean var2 = true;
         int[] var3 = this.anIntArray2232;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var3[var4];
            if(this.aClass193_2231.method2793(var5 >>> 16, 1171006592) == null) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public int method2901(int var1, int var2, byte var3) {
      if(null == this.aClass20_2244) {
         return var2;
      } else {
         Class526_Sub25 var4 = (Class526_Sub25)this.aClass20_2244.get((long)var1);
         return var4 == null?var2:-1044108751 * var4.anInt10550;
      }
   }

   public String method2902(int var1, String var2, int var3) {
      if(null == this.aClass20_2244) {
         return var2;
      } else {
         LinkableObject var4 = (LinkableObject)this.aClass20_2244.get((long)var1);
         return null == var4?var2:(String)var4.anObject10399;
      }
   }

   Class206(int var1, Class193 var2) {
      this.anInt2222 = var1 * 555234849;
      this.aClass193_2231 = var2;
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-986661814);
         if(0 == var2) {
            return;
         }

         this.method2905(var1, var2, 2096409743);
      }
   }

   public void method85() {
      if(-1 == 796997263 * this.anInt2236) {
         if(null != this.aClass202_2221 && null != this.aClass202_2221.aBoolArray2211) {
            this.anInt2236 = 666521822;
         } else {
            this.anInt2236 = 0;
         }
      }

      if(-571300867 * this.anInt2237 == -1) {
         if(null != this.aClass202_2221 && null != this.aClass202_2221.aBoolArray2211) {
            this.anInt2237 = 374186666;
         } else {
            this.anInt2237 = 0;
         }
      }

      if(this.anIntArray2226 != null) {
         this.anInt2227 = 0;

         for(int var1 = 0; var1 < this.anIntArray2226.length; ++var1) {
            this.anInt2227 += -1100187443 * this.anIntArray2226[var1];
         }
      }

   }

   void method2903(RSByteBuffer var1, int var2) {
      int var3;
      int var4;
      if(1 == var2) {
         var3 = var1.readUnsignedShort(1221901233);
         this.anIntArray2226 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2226[var4] = var1.readUnsignedShort(1975595109);
         }

         this.anIntArray2232 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2232[var4] = var1.readUnsignedShort(953420485);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2232[var4] += var1.readUnsignedShort(1155208898) << 16;
         }
      } else if(2 == var2) {
         this.anInt2243 = var1.readUnsignedShort(1555380963) * 328862319;
      } else if(var2 == 5) {
         this.anInt2234 = var1.readUnsignedByte(878837018) * -607827841;
      } else if(6 == var2) {
         this.anInt2230 = var1.readUnsignedShort(66018588) * 76949825;
      } else if(var2 == 7) {
         this.anInt2240 = var1.readUnsignedShort(1491563826) * 333212185;
      } else if(8 == var2) {
         this.anInt2235 = var1.readUnsignedByte(-1505879833) * 357915309;
      } else if(var2 == 9) {
         this.anInt2236 = var1.readUnsignedByte(-571752470) * -1814222737;
      } else if(10 == var2) {
         this.anInt2237 = var1.readUnsignedByte(-1022676321) * 187093333;
      } else if(var2 == 11) {
         this.anInt2238 = var1.readUnsignedByte(857832354) * -736813887;
      } else if(var2 != 12 && 112 != var2) {
         int var6;
         if(var2 == 13) {
            var3 = var1.readUnsignedShort(1983016583);
            this.anIntArrayArray2228 = new int[var3][];

            for(var4 = 0; var4 < var3; ++var4) {
               int var5 = var1.readUnsignedByte(-1351075511);
               if(var5 > 0) {
                  this.anIntArrayArray2228[var4] = new int[var5];
                  this.anIntArrayArray2228[var4][0] = var1.read24BitInt(742041327);

                  for(var6 = 1; var6 < var5; ++var6) {
                     this.anIntArrayArray2228[var4][var6] = var1.readUnsignedShort(2092911662);
                  }
               }
            }
         } else if(14 == var2) {
            this.aBool2239 = true;
         } else if(var2 == 15) {
            this.aBool2223 = true;
         } else if(16 != var2 && 18 != var2) {
            if(var2 != 19 && var2 != 119) {
               if(20 != var2 && var2 != 120) {
                  if(22 == var2) {
                     this.anInt2245 = var1.readUnsignedByte(-696162825) * -885096599;
                  } else if(23 == var2) {
                     var1.readUnsignedShort(1797729652);
                  } else if(var2 == 24) {
                     this.anInt2229 = var1.readUnsignedShort(1232053141) * 45577045;
                     if(null != this.aClass193_2231) {
                        this.aClass202_2221 = (Class202)this.aClass193_2231.anInterface14_2174.method89(1755378173 * this.anInt2229, -1973417658);
                     }
                  } else if(var2 == 249) {
                     var3 = var1.readUnsignedByte(1268179233);
                     if(null == this.aClass20_2244) {
                        var4 = Class692.method8110(var3, 1949044945);
                        this.aClass20_2244 = new Class20(var4);
                     }

                     for(var4 = 0; var4 < var3; ++var4) {
                        boolean var8 = var1.readUnsignedByte(127205940) == 1;
                        var6 = var1.read24BitInt(742041327);
                        Object var7;
                        if(var8) {
                           var7 = new LinkableObject(var1.readString(210796826));
                        } else {
                           var7 = new Class526_Sub25(var1.readInt((byte)5));
                        }

                        this.aClass20_2244.put((Class526)var7, (long)var6);
                     }
                  }
               } else {
                  if(this.anIntArray2242 == null || this.anIntArray2233 == null) {
                     this.anIntArray2242 = new int[this.anIntArrayArray2228.length];
                     this.anIntArray2233 = new int[this.anIntArrayArray2228.length];

                     for(var3 = 0; var3 < this.anIntArrayArray2228.length; ++var3) {
                        this.anIntArray2242[var3] = 256;
                        this.anIntArray2233[var3] = 256;
                     }
                  }

                  if(var2 == 20) {
                     var3 = var1.readUnsignedByte(-397075552);
                  } else {
                     var3 = var1.readUnsignedShort(903932978);
                  }

                  this.anIntArray2242[var3] = var1.readUnsignedShort(709073551);
                  this.anIntArray2233[var3] = var1.readUnsignedShort(1318045636);
               }
            } else {
               if(this.anIntArray2241 == null) {
                  this.anIntArray2241 = new int[this.anIntArrayArray2228.length];

                  for(var3 = 0; var3 < this.anIntArrayArray2228.length; ++var3) {
                     this.anIntArray2241[var3] = 255;
                  }
               }

               if(19 == var2) {
                  var3 = var1.readUnsignedByte(-1835072806);
               } else {
                  var3 = var1.readUnsignedShort(892203824);
               }

               this.anIntArray2241[var3] = var1.readUnsignedByte(1190355630);
            }
         }
      } else {
         if(12 == var2) {
            var3 = var1.readUnsignedByte(1011211512);
         } else {
            var3 = var1.readUnsignedShort(188836038);
         }

         this.anIntArray2225 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2225[var4] = var1.readUnsignedShort(1338138806);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2225[var4] += var1.readUnsignedShort(1304306342) << 16;
         }
      }

   }

   void method2904(RSByteBuffer var1, int var2) {
      int var3;
      int var4;
      if(1 == var2) {
         var3 = var1.readUnsignedShort(1363952111);
         this.anIntArray2226 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2226[var4] = var1.readUnsignedShort(1537675742);
         }

         this.anIntArray2232 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2232[var4] = var1.readUnsignedShort(1842408906);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2232[var4] += var1.readUnsignedShort(1434239034) << 16;
         }
      } else if(2 == var2) {
         this.anInt2243 = var1.readUnsignedShort(871975006) * 328862319;
      } else if(var2 == 5) {
         this.anInt2234 = var1.readUnsignedByte(1273920294) * -607827841;
      } else if(6 == var2) {
         this.anInt2230 = var1.readUnsignedShort(569042988) * 76949825;
      } else if(var2 == 7) {
         this.anInt2240 = var1.readUnsignedShort(2128914746) * 333212185;
      } else if(8 == var2) {
         this.anInt2235 = var1.readUnsignedByte(1042720189) * 357915309;
      } else if(var2 == 9) {
         this.anInt2236 = var1.readUnsignedByte(89945146) * -1814222737;
      } else if(10 == var2) {
         this.anInt2237 = var1.readUnsignedByte(1582597708) * 187093333;
      } else if(var2 == 11) {
         this.anInt2238 = var1.readUnsignedByte(212010653) * -736813887;
      } else if(var2 != 12 && 112 != var2) {
         int var6;
         if(var2 == 13) {
            var3 = var1.readUnsignedShort(1826806516);
            this.anIntArrayArray2228 = new int[var3][];

            for(var4 = 0; var4 < var3; ++var4) {
               int var5 = var1.readUnsignedByte(541915497);
               if(var5 > 0) {
                  this.anIntArrayArray2228[var4] = new int[var5];
                  this.anIntArrayArray2228[var4][0] = var1.read24BitInt(742041327);

                  for(var6 = 1; var6 < var5; ++var6) {
                     this.anIntArrayArray2228[var4][var6] = var1.readUnsignedShort(647108195);
                  }
               }
            }
         } else if(14 == var2) {
            this.aBool2239 = true;
         } else if(var2 == 15) {
            this.aBool2223 = true;
         } else if(16 != var2 && 18 != var2) {
            if(var2 != 19 && var2 != 119) {
               if(20 != var2 && var2 != 120) {
                  if(22 == var2) {
                     this.anInt2245 = var1.readUnsignedByte(-1368426826) * -885096599;
                  } else if(23 == var2) {
                     var1.readUnsignedShort(665826980);
                  } else if(var2 == 24) {
                     this.anInt2229 = var1.readUnsignedShort(1930339957) * 45577045;
                     if(null != this.aClass193_2231) {
                        this.aClass202_2221 = (Class202)this.aClass193_2231.anInterface14_2174.method89(1755378173 * this.anInt2229, -213711854);
                     }
                  } else if(var2 == 249) {
                     var3 = var1.readUnsignedByte(292748866);
                     if(null == this.aClass20_2244) {
                        var4 = Class692.method8110(var3, -1400120197);
                        this.aClass20_2244 = new Class20(var4);
                     }

                     for(var4 = 0; var4 < var3; ++var4) {
                        boolean var8 = var1.readUnsignedByte(140586026) == 1;
                        var6 = var1.read24BitInt(742041327);
                        Object var7;
                        if(var8) {
                           var7 = new LinkableObject(var1.readString(-1182844803));
                        } else {
                           var7 = new Class526_Sub25(var1.readInt((byte)5));
                        }

                        this.aClass20_2244.put((Class526)var7, (long)var6);
                     }
                  }
               } else {
                  if(this.anIntArray2242 == null || this.anIntArray2233 == null) {
                     this.anIntArray2242 = new int[this.anIntArrayArray2228.length];
                     this.anIntArray2233 = new int[this.anIntArrayArray2228.length];

                     for(var3 = 0; var3 < this.anIntArrayArray2228.length; ++var3) {
                        this.anIntArray2242[var3] = 256;
                        this.anIntArray2233[var3] = 256;
                     }
                  }

                  if(var2 == 20) {
                     var3 = var1.readUnsignedByte(111765920);
                  } else {
                     var3 = var1.readUnsignedShort(697975760);
                  }

                  this.anIntArray2242[var3] = var1.readUnsignedShort(293123992);
                  this.anIntArray2233[var3] = var1.readUnsignedShort(523736368);
               }
            } else {
               if(this.anIntArray2241 == null) {
                  this.anIntArray2241 = new int[this.anIntArrayArray2228.length];

                  for(var3 = 0; var3 < this.anIntArrayArray2228.length; ++var3) {
                     this.anIntArray2241[var3] = 255;
                  }
               }

               if(19 == var2) {
                  var3 = var1.readUnsignedByte(-1452210152);
               } else {
                  var3 = var1.readUnsignedShort(269837667);
               }

               this.anIntArray2241[var3] = var1.readUnsignedByte(687153363);
            }
         }
      } else {
         if(12 == var2) {
            var3 = var1.readUnsignedByte(874496147);
         } else {
            var3 = var1.readUnsignedShort(44974665);
         }

         this.anIntArray2225 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2225[var4] = var1.readUnsignedShort(381945123);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.anIntArray2225[var4] += var1.readUnsignedShort(1617724382) << 16;
         }
      }

   }

   void method2905(RSByteBuffer var1, int var2, int var3) {
      int var4;
      int var5;
      if(1 == var2) {
         var4 = var1.readUnsignedShort(1778464058);
         this.anIntArray2226 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray2226[var5] = var1.readUnsignedShort(1045834227);
         }

         this.anIntArray2232 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray2232[var5] = var1.readUnsignedShort(469581870);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray2232[var5] += var1.readUnsignedShort(664445568) << 16;
         }
      } else if(2 == var2) {
         this.anInt2243 = var1.readUnsignedShort(1739344655) * 328862319;
      } else if(var2 == 5) {
         this.anInt2234 = var1.readUnsignedByte(-1606762168) * -607827841;
      } else if(6 == var2) {
         this.anInt2230 = var1.readUnsignedShort(1497641155) * 76949825;
      } else if(var2 == 7) {
         this.anInt2240 = var1.readUnsignedShort(1271895831) * 333212185;
      } else if(8 == var2) {
         this.anInt2235 = var1.readUnsignedByte(-421666795) * 357915309;
      } else if(var2 == 9) {
         this.anInt2236 = var1.readUnsignedByte(-1620975044) * -1814222737;
      } else if(10 == var2) {
         this.anInt2237 = var1.readUnsignedByte(-1278345906) * 187093333;
      } else if(var2 == 11) {
         this.anInt2238 = var1.readUnsignedByte(1617596151) * -736813887;
      } else if(var2 != 12 && 112 != var2) {
         int var7;
         if(var2 == 13) {
            var4 = var1.readUnsignedShort(1466221595);
            this.anIntArrayArray2228 = new int[var4][];

            for(var5 = 0; var5 < var4; ++var5) {
               int var6 = var1.readUnsignedByte(-267284203);
               if(var6 > 0) {
                  this.anIntArrayArray2228[var5] = new int[var6];
                  this.anIntArrayArray2228[var5][0] = var1.read24BitInt(742041327);

                  for(var7 = 1; var7 < var6; ++var7) {
                     this.anIntArrayArray2228[var5][var7] = var1.readUnsignedShort(1521090803);
                  }
               }
            }
         } else if(14 == var2) {
            this.aBool2239 = true;
         } else if(var2 == 15) {
            this.aBool2223 = true;
         } else if(16 != var2 && 18 != var2) {
            if(var2 != 19 && var2 != 119) {
               if(20 != var2 && var2 != 120) {
                  if(22 == var2) {
                     this.anInt2245 = var1.readUnsignedByte(1640557001) * -885096599;
                  } else if(23 == var2) {
                     var1.readUnsignedShort(145285262);
                  } else if(var2 == 24) {
                     this.anInt2229 = var1.readUnsignedShort(247028595) * 45577045;
                     if(null != this.aClass193_2231) {
                        this.aClass202_2221 = (Class202)this.aClass193_2231.anInterface14_2174.method89(1755378173 * this.anInt2229, -1933490336);
                     }
                  } else if(var2 == 249) {
                     var4 = var1.readUnsignedByte(703032237);
                     if(null == this.aClass20_2244) {
                        var5 = Class692.method8110(var4, 116062174);
                        this.aClass20_2244 = new Class20(var5);
                     }

                     for(var5 = 0; var5 < var4; ++var5) {
                        boolean var9 = var1.readUnsignedByte(-369877870) == 1;
                        var7 = var1.read24BitInt(742041327);
                        Object var8;
                        if(var9) {
                           var8 = new LinkableObject(var1.readString(-851697725));
                        } else {
                           var8 = new Class526_Sub25(var1.readInt((byte)5));
                        }

                        this.aClass20_2244.put((Class526)var8, (long)var7);
                     }
                  }
               } else {
                  if(this.anIntArray2242 == null || this.anIntArray2233 == null) {
                     this.anIntArray2242 = new int[this.anIntArrayArray2228.length];
                     this.anIntArray2233 = new int[this.anIntArrayArray2228.length];

                     for(var4 = 0; var4 < this.anIntArrayArray2228.length; ++var4) {
                        this.anIntArray2242[var4] = 256;
                        this.anIntArray2233[var4] = 256;
                     }
                  }

                  if(var2 == 20) {
                     var4 = var1.readUnsignedByte(-762860320);
                  } else {
                     var4 = var1.readUnsignedShort(1724117316);
                  }

                  this.anIntArray2242[var4] = var1.readUnsignedShort(184106656);
                  this.anIntArray2233[var4] = var1.readUnsignedShort(151135171);
               }
            } else {
               if(this.anIntArray2241 == null) {
                  this.anIntArray2241 = new int[this.anIntArrayArray2228.length];

                  for(var4 = 0; var4 < this.anIntArrayArray2228.length; ++var4) {
                     this.anIntArray2241[var4] = 255;
                  }
               }

               if(19 == var2) {
                  var4 = var1.readUnsignedByte(1522163329);
               } else {
                  var4 = var1.readUnsignedShort(2006104001);
               }

               this.anIntArray2241[var4] = var1.readUnsignedByte(-190483925);
            }
         }
      } else {
         if(12 == var2) {
            var4 = var1.readUnsignedByte(-275742459);
         } else {
            var4 = var1.readUnsignedShort(974301477);
         }

         this.anIntArray2225 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray2225[var5] = var1.readUnsignedShort(873509491);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray2225[var5] += var1.readUnsignedShort(2095060202) << 16;
         }
      }

   }

   public static final void method2906(int var0) {
      Class461.anImage5204 = null;
      Class497.aFont5566 = null;
   }

   public static int method2907(int var0, int var1) {
      Class526_Sub21_Sub10 var2 = (Class526_Sub21_Sub10)Class280.aClass20_3036.get((long)var0);
      return var2 == null?-1:(var2.aClass526_Sub21_10531 == Class280.aClass696_3038.aClass526_Sub21_8758?-1:((Class526_Sub21_Sub10)var2.aClass526_Sub21_10531).anInt11729 * 731545197);
   }

   public static void method2908(byte var0) {
      Class570.anInt7651 = -783098807;
   }
}
