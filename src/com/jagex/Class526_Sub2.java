package com.jagex;

import com.jagex.Class11;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class19;
import com.jagex.Class192;
import com.jagex.Class2;
import com.jagex.Class20;
import com.jagex.Class200;
import com.jagex.Class227;
import com.jagex.Class448_Sub1;
import com.jagex.Class510;
import com.jagex.Class526;
import com.jagex.Class526_Sub1;
import com.jagex.RSByteBuffer;
import com.jagex.Class531_Sub1;
import com.jagex.Class537;
import com.jagex.RenderDef;
import com.jagex.Class599;
import com.jagex.Class633;
import com.jagex.Class643;
import com.jagex.Class704;
import com.jagex.Exception_Sub3;

public class Class526_Sub2 extends Class526 {
   static Class20 aClass20_10333 = new Class20(32);
   static Class192 aClass192_10330 = new Class192(11);
   int[] anIntArray10331 = new int[]{-1};
   int[] anIntArray10329 = new int[]{0};
   Class2[] aClass2Array10332 = null;

   static void method9279(int var0) {
      Exception_Sub3.anInt11355 = var0 * 147457581;
      aClass192_10330.method2770(1380006611);
   }

   long method9280(int[] var1, int var2, int[] var3, boolean var4, byte var5) {
      long[] var6 = RSByteBuffer.aLongArray10676;
      long var7 = -1L;
      var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var2 >> 8)) & 255L)];
      var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var2) & 255L)];

      int var9;
      for(var9 = 0; var9 < var1.length; ++var9) {
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 24)) & 255L)];
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 16)) & 255L)];
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 8)) & 255L)];
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var1[var9]) & 255L)];
      }

      if(var3 != null) {
         for(var9 = 0; var9 < 5; ++var9) {
            var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var3[var9]) & 255L)];
         }
      }

      var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var4?1:0)) & 255L)];
      return var7;
   }

   final Class168 method9281(Class174 var1, int var2, Class704 var3, int var4, boolean var5, Class633 var6, int var7) {
      Class168 var8 = null;
      int var9 = var2;
      RenderDef var10 = null;
      if(var4 != -1) {
         var10 = (RenderDef)Class227.aClass40_Sub16_2327.method89(var4, -1502435751);
      }

      int[] var11 = this.anIntArray10331;
      if(null != var10 && null != var10.anIntArray7722) {
         var11 = new int[var10.anIntArray7722.length];

         for(int var12 = 0; var12 < var10.anIntArray7722.length; ++var12) {
            int var13 = var10.anIntArray7722[var12];
            if(var13 >= 0 && var13 < this.anIntArray10331.length) {
               var11[var12] = this.anIntArray10331[var13];
            } else {
               var11[var12] = -1;
            }
         }
      }

      if(null != var3) {
         var9 = var2 | var3.method8221((byte)22);
      }

      long var14 = this.method9280(var11, var4, null != var6?var6.anIntArray8245:null, var5, (byte)0);
      if(aClass192_10330 != null) {
         var8 = (Class168)aClass192_10330.method2765(var14);
      }

      if(var8 == null || var1.method2464(var8.method2101(), var9) != 0) {
         if(null != var8) {
            var9 = var1.method2533(var9, var8.method2101());
         }

         int var16 = var9;
         boolean var17 = false;

         for(int var18 = 0; var18 < var11.length; ++var18) {
            if(var11[var18] != -1 && !((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var11[var18], -506161095)).method584(var5, (Class19)null, 1229803552)) {
               var17 = true;
            }
         }

         if(var17) {
            return null;
         }

         Class170[] var27 = new Class170[var11.length];

         int var19;
         for(var19 = 0; var19 < var11.length; ++var19) {
            if(var11[var19] != -1) {
               var27[var19] = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var11[var19], -1926897663)).method593(var5, (Class19)null, (byte)-77);
            }
         }

         int var20;
         int var21;
         if(var10 != null && var10.anIntArrayArray7704 != null) {
            for(var19 = 0; var19 < var10.anIntArrayArray7704.length; ++var19) {
               if(null != var10.anIntArrayArray7704[var19] && var27[var19] != null) {
                  var20 = var10.anIntArrayArray7704[var19][0];
                  var21 = var10.anIntArrayArray7704[var19][1];
                  int var22 = var10.anIntArrayArray7704[var19][2];
                  int var23 = var10.anIntArrayArray7704[var19][3];
                  int var24 = var10.anIntArrayArray7704[var19][4];
                  int var25 = var10.anIntArrayArray7704[var19][5];
                  if(var23 != 0 || var24 != 0 || var25 != 0) {
                     var27[var19].method2140(var23, var24, var25);
                  }

                  if(var20 != 0 || 0 != var21 || 0 != var22) {
                     var27[var19].method2129(var20, var21, var22);
                  }
               }
            }
         }

         Class170 var28 = new Class170(var27, var27.length);
         if(var6 != null) {
            var16 = var9 | 16384;
         }

         var8 = var1.method2321(var28, var16, Exception_Sub3.anInt11355 * -531482203, 65, 853);
         if(var6 != null) {
            var20 = 0;

            label123:
            while(true) {
               if(var20 >= 10) {
                  var20 = 0;

                  while(true) {
                     if(var20 >= 10) {
                        break label123;
                     }

                     for(var21 = 0; var21 < Class643.aShortArrayArray8430[var20].length; ++var21) {
                        if(var6.anIntArray8250[var20] < Class537.aShortArrayArrayArray7205[var20][var21].length) {
                           var8.method1992(Class643.aShortArrayArray8430[var20][var21], Class537.aShortArrayArrayArray7205[var20][var21][var6.anIntArray8250[var20]]);
                        }
                     }

                     ++var20;
                  }
               }

               for(var21 = 0; var21 < Class200.aShortArrayArray2206[var20].length; ++var21) {
                  if(var6.anIntArray8245[var20] < Class510.aShortArrayArrayArray6984[var20][var21].length) {
                     var8.method1940(Class200.aShortArrayArray2206[var20][var21], Class510.aShortArrayArrayArray6984[var20][var21][var6.anIntArray8245[var20]]);
                  }
               }

               ++var20;
            }
         }

         if(aClass192_10330 != null) {
            var8.method2110(var9);
            aClass192_10330.method2768(var8, var14);
         }
      }

      if(null == var3) {
         return var8;
      } else {
         Class168 var26 = var8.method1947((byte)1, var9, true);
         var3.method8231(var26, 0, -1399532750);
         return var26;
      }
   }

   static void method9282(int var0) {
      Exception_Sub3.anInt11355 = var0 * 147457581;
      aClass192_10330.method2770(1854502685);
   }

   static void method9283() {
      aClass192_10330.method2770(283955407);
   }

   static void method9284(int var0, boolean var1) {
      Class526_Sub2 var2 = Class531_Sub1.method9301(var0, var1, 1711881989);
      if(null != var2) {
         for(int var3 = 0; var3 < var2.anIntArray10331.length; ++var3) {
            var2.anIntArray10331[var3] = -1;
            var2.anIntArray10329[var3] = 0;
         }

         var2.aClass2Array10332 = null;
      }
   }

   static void method9285(int var0, boolean var1) {
      Class526_Sub2 var2 = Class531_Sub1.method9301(var0, var1, 1864412939);
      if(null != var2) {
         var2.method6332(-1949449864);
      }
   }

   static void method9286() {
      aClass20_10333.method647(929030154);
   }

   static void method9287(int var0) {
      Exception_Sub3.anInt11355 = var0 * 147457581;
      aClass192_10330.method2770(1292359691);
   }

   static void method9288(int var0) {
      Exception_Sub3.anInt11355 = var0 * 147457581;
      aClass192_10330.method2770(160667524);
   }

   static void method9289(int var0) {
      Exception_Sub3.anInt11355 = var0 * 147457581;
      aClass192_10330.method2770(212091056);
   }

   static void method9290(int var0) {
      Exception_Sub3.anInt11355 = var0 * 147457581;
      aClass192_10330.method2770(2007235757);
   }

   static void method9291() {
      aClass192_10330.method2770(633425145);
   }

   static void method9292(int var0, int var1, int var2, int var3, int var4, int var5, Class599 var6, int var7) {
      Class526_Sub1 var8 = null;

      for(Class526_Sub1 var9 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8206((byte)86); var9 != null; var9 = (Class526_Sub1)Class526_Sub1.aClass702_10309.method8181(-267329982)) {
         if(-1761255799 * var9.anInt10306 == var0 && var1 == var9.anInt10301 * 195793035 && var2 == 64888215 * var9.anInt10298 && var3 == var9.anInt10299 * -1514081739) {
            var8 = var9;
            break;
         }
      }

      if(var8 == null) {
         var8 = new Class526_Sub1();
         var8.anInt10306 = var0 * -108693575;
         var8.anInt10299 = var3 * 639914013;
         var8.anInt10301 = var1 * 767842083;
         var8.anInt10298 = var2 * 1139683879;
         Class526_Sub1.aClass702_10309.method8176(var8, -362360315);
      }

      var8.anInt10305 = var4 * 1868655893;
      var8.anInt10307 = var5 * -369321043;
      var8.aClass599_10308 = var6;
      var8.aBool10300 = true;
      var8.aBool10310 = false;
   }
}
