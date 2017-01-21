package com.jagex;

import com.jagex.Class1;
import com.jagex.Class108;
import com.jagex.Class115;
import com.jagex.Class121;
import com.jagex.Class130;
import com.jagex.Class144;
import com.jagex.Class148;
import com.jagex.Class148_Sub1;
import com.jagex.Class153;
import com.jagex.Class153_Sub1;
import com.jagex.Class153_Sub1_Sub1;
import com.jagex.Class153_Sub1_Sub2;
import com.jagex.Class153_Sub1_Sub3;
import com.jagex.Class157;
import com.jagex.Class162;
import com.jagex.Class162_Sub2;
import com.jagex.Class163;
import com.jagex.Class163_Sub1;
import com.jagex.Class163_Sub2;
import com.jagex.Class163_Sub3;
import com.jagex.Class163_Sub6;
import com.jagex.Class164;
import com.jagex.Class166;
import com.jagex.Class168;
import com.jagex.Class168_Sub3;
import com.jagex.Class169;
import com.jagex.Class170;
import com.jagex.Class171;
import com.jagex.Class172;
import com.jagex.Class173;
import com.jagex.Class173_Sub1;
import com.jagex.Class173_Sub2;
import com.jagex.Class174;
import com.jagex.Class176;
import com.jagex.Class177;
import com.jagex.Class178;
import com.jagex.Class184_Sub1;
import com.jagex.Class184_Sub2;
import com.jagex.Class184_Sub2_Sub3;
import com.jagex.Class192;
import com.jagex.Class255;
import com.jagex.Class40_Sub7;
import com.jagex.Class433;
import com.jagex.Class437;
import com.jagex.Class445;
import com.jagex.Class481;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub22;
import com.jagex.Class526_Sub8;
import com.jagex.Class539_Sub1_Sub1;
import com.jagex.Class593;
import com.jagex.Class595;
import com.jagex.Class596;
import com.jagex.Class603;
import com.jagex.Class654;
import com.jagex.Exception_Sub4;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface24;
import com.jagex.Interface46;
import com.jagex.Interface47;
import com.jagex.Interface49;
import java.awt.Canvas;

public class Class174_Sub1 extends Class174 {
   public static Class40_Sub7 aClass40_Sub7_9280;
   static Class163 aClass163_9281;
   boolean aBool9275;
   boolean aBool9242;
   int anInt9247;
   int anInt9271;
   int anInt9267;
   int anInt9250;
   int anInt9254;
   int anInt9255;
   int anInt9256;
   float[][] aFloatArrayArray9261;
   float aFloat9270;
   float aFloat9241;
   Class192 aClass192_9259;
   int anInt9263;
   Class192 aClass192_9274;
   Class445 aClass445_9257;
   Class433 aClass433_9258;
   Class433 aClass433_9260;
   Class433 aClass433_9240;
   int anInt9244;
   Class153 aClass153_9264;
   Class184_Sub2 aClass184_Sub2_9279;
   int anInt9262;
   int anInt9248;
   int anInt9272;
   int anInt9265;
   float aFloat9266;
   float aFloat9268;
   float aFloat9278;
   float aFloat9269;
   Class153 aClass153_9276;
   int anInt9251;
   int anInt9252;
   int anInt9253;
   int anInt9249;
   Class115[] aClass115Array9273;
   int anInt9277;
   int anInt9245;
   int[] anIntArray9243;
   float[] aFloatArray9246;

   void method2539(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.anIntArray9243) {
         if(var2 >= this.anInt9267 * 1511023883 && var2 < this.anInt9250 * -288042733) {
            if(var1 < this.anInt9247 * -217416947) {
               var3 -= this.anInt9247 * -217416947 - var1;
               var1 = -217416947 * this.anInt9247;
            }

            if(var1 + var3 > 1270312011 * this.anInt9271) {
               var3 = 1270312011 * this.anInt9271 - var1;
            }

            int var6 = var1 + this.anInt9277 * -2145294317 * var2;
            int var7 = var4 >>> 24;
            int var8;
            if(var5 != 0 && (var5 != 1 || 255 != var7)) {
               int var9;
               int var10;
               if(1 == var5) {
                  var4 = ((var4 & 16711935) * var7 >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00') + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = this.anIntArray9243[var6 + var9];
                     var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     this.anIntArray9243[var6 + var9] = var4 + var10;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.anIntArray9243[var8 + var6];
                     var10 = var4 + var9;
                     int var11 = (var9 & 16711935) + (var4 & 16711935);
                     var9 = (var10 - var11 & 65536) + (var11 & 16777472);
                     this.anIntArray9243[var8 + var6] = var10 - var9 | var9 - (var9 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.anIntArray9243[var6 + var8] = var4;
               }
            }

         }
      }
   }

   Class174_Sub1(Class169 var1, Interface24 var2, Interface47 var3, Interface49 var4, Interface46 var5) {
      super(var1, var2, var3, var4, var5);
      this.aBool9275 = false;
      this.aBool9242 = false;
      this.anInt9247 = 0;
      this.anInt9271 = 0;
      this.anInt9267 = 0;
      this.anInt9250 = 0;
      this.anInt9254 = -1630965059;
      this.anInt9255 = -1837800586;
      this.anInt9256 = -1096652274;
      this.aFloatArrayArray9261 = new float[6][4];
      this.aFloat9270 = 1.0F;
      this.aFloat9241 = 0.0F;
      this.aClass192_9259 = new Class192(16);
      this.anInt9263 = -1238595545;

      try {
         this.aClass192_9274 = new Class192(10485760, 256);
         this.aClass445_9257 = new Class445();
         this.aClass433_9258 = new Class433();
         this.aClass433_9260 = new Class433();
         this.aClass433_9240 = new Class433();
         this.method8505(1);
         this.method8511(0);
         Class654.method7818(true, true, (byte)120);
         this.aBool9242 = true;
         this.anInt9244 = (int)Class255.time((byte)24) * -183487143;
      } catch (Throwable var7) {
         var7.printStackTrace();
         this.method2232(1135751733);
         throw new RuntimeException("");
      }
   }

   public Class157 method2502() {
      return new Class157(0, "Pure Java", 1, "CPU", 0L, false);
   }

   void method2230(int var1, int var2) throws Exception_Sub4 {
      this.aClass184_Sub1_2026.method8453(var1, var2);
      if(this.anInterface24_2034 != null) {
         this.anInterface24_2034.method150((byte)1);
      }

   }

   public void method2327() {
   }

   void method2233() {
      if(this.aBool9242) {
         Class596.method7055(true, false, 1721831832);
         this.aBool9242 = false;
      }

      this.aBool9275 = true;
   }

   public void method2234(int var1) {
      int var2 = var1 - this.anInt9244 * -2044542231;

      for(Class526_Sub22 var3 = (Class526_Sub22)this.aClass192_9274.method2773(1306495605); var3 != null; var3 = (Class526_Sub22)this.aClass192_9274.method2775(-207460949)) {
         if(var3.aBool10537) {
            var3.anInt10535 += var2;
            int var4 = var3.anInt10535 / 50;
            if(var4 > 0) {
               Class171 var5 = this.aClass169_2035.method2122(var3.anInt10533, (byte)21);
               float var6 = (float)(var5.anInt1985 * -1178632371);
               var3.method9448((int)((float)var2 / 1000.0F * (float)var5.aByte1986 / 64.0F * var6), (int)((float)var2 / 1000.0F * (float)var5.aByte1963 / 64.0F * var6));
               var3.anInt10535 -= 50 * var4;
            }

            var3.aBool10537 = false;
         }
      }

      this.anInt9244 = -183487143 * var1;
      this.aClass192_9259.method2769(5, (byte)-58);
      this.aClass192_9274.method2769(5, (byte)-102);
   }

   public void method2231(Class433 var1) {
      this.aClass433_9260.method5083(var1);
      this.method8510();
   }

   boolean method8494() {
      return this.aBool9275;
   }

   void method2447(int var1, int var2, int var3, int var4, int var5) {
      if(this.anIntArray9243 != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var6 = var2 - var3;
         if(var6 < this.anInt9267 * 1511023883) {
            var6 = this.anInt9267 * 1511023883;
         }

         int var7 = 1 + var2 + var3;
         if(var7 > -288042733 * this.anInt9250) {
            var7 = -288042733 * this.anInt9250;
         }

         int var8 = var6;
         int var9 = var3 * var3;
         int var10 = 0;
         int var11 = var2 - var6;
         int var12 = var11 * var11;
         int var13 = var12 - var11;
         if(var2 > var7) {
            var2 = var7;
         }

         int var14 = var4 >>> 24;
         int var15;
         int var16;
         int var17;
         int var18;
         if(0 == var5 || var5 == 1 && 255 == var14) {
            while(var8 < var2) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               var15 = 1 + (var1 - var10);
               if(var15 < this.anInt9247 * -217416947) {
                  var15 = this.anInt9247 * -217416947;
               }

               var16 = var10 + var1;
               if(var16 > this.anInt9271 * 1270312011) {
                  var16 = this.anInt9271 * 1270312011;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 < var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            var10 = var3;
            var11 = var8 - var2;
            var13 = var11 * var11 + var9;
            var12 = var13 - var3;

            for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
               while(var13 > var9 && var12 > var9) {
                  var13 -= var10-- + var10;
                  var12 -= var10 + var10;
               }

               var15 = var1 - var10;
               if(var15 < -217416947 * this.anInt9247) {
                  var15 = -217416947 * this.anInt9247;
               }

               var16 = var10 + var1;
               if(var16 > 1270312011 * this.anInt9271 - 1) {
                  var16 = this.anInt9271 * 1270312011 - 1;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 <= var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var13 += var11 + var11;
            }

            return;
         } else {
            int var19;
            int var20;
            if(1 == var5) {
               var4 = ((var4 & '\uff00') * var14 >> 8 & '\uff00') + ((var4 & 16711935) * var14 >> 8 & 16711935) + (var14 << 24);

               for(var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var16 = var1 - var10 + 1;
                  if(var16 < -217416947 * this.anInt9247) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > this.anInt9271 * 1270312011) {
                     var17 = 1270312011 * this.anInt9271;
                  }

                  var18 = -2145294317 * this.anInt9277 * var8 + var16;

                  for(var19 = var16; var19 < var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = ((var20 & '\uff00') * var15 >> 8 & '\uff00') + ((var20 & 16711935) * var15 >> 8 & 16711935);
                     this.anIntArray9243[var18++] = var4 + var20;
                  }

                  ++var8;
                  var12 -= var11-- + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var16 = var1 - var10;
                  if(var16 < this.anInt9247 * -217416947) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > 1270312011 * this.anInt9271 - 1) {
                     var17 = 1270312011 * this.anInt9271 - 1;
                  }

                  var18 = var8 * -2145294317 * this.anInt9277 + var16;

                  for(var19 = var16; var19 <= var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = (var15 * (var20 & 16711935) >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                     this.anIntArray9243[var18++] = var20 + var4;
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            } else {
               if(2 != var5) {
                  throw new IllegalArgumentException();
               }

               int var21;
               while(var8 < var2) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var15 = 1 + (var1 - var10);
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var10 + var1;
                  if(var16 > this.anInt9271 * 1270312011) {
                     var16 = 1270312011 * this.anInt9271;
                  }

                  var17 = var15 + this.anInt9277 * -2145294317 * var8;

                  for(var18 = var15; var18 < var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var19 + var4;
                     var21 = (var4 & 16711935) + (var19 & 16711935);
                     var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var12 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var15 = var1 - var10;
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var1 + var10;
                  if(var16 > 1270312011 * this.anInt9271 - 1) {
                     var16 = 1270312011 * this.anInt9271 - 1;
                  }

                  var17 = var15 + var8 * -2145294317 * this.anInt9277;

                  for(var18 = var15; var18 <= var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var4 + var19;
                     var21 = (var19 & 16711935) + (var4 & 16711935);
                     var19 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            }
         }

      }
   }

   boolean method8495(int var1) {
      Class171 var2 = this.aClass169_2035.method2122(var1, (byte)22);
      return this.anInterface24_2034.method162(Class595.aClass595_7846, var1, Class603.aClass603_7887, 0.7F, var2.anInt1985 * -1178632371, -1178632371 * var2.anInt1985, true, 1323377274);
   }

   public void method2532(int var1, int var2, int var3) {
   }

   byte method8496(int var1) {
      return this.aClass169_2035.method2122(var1, (byte)-88).aByte1990;
   }

   int method8497(int var1) {
      return this.aClass169_2035.method2122(var1, (byte)-62).aShort2015 & '\uffff';
   }

   public boolean method2236() {
      return false;
   }

   public boolean method2237() {
      return false;
   }

   public boolean method2238() {
      return true;
   }

   public boolean method2240() {
      return false;
   }

   public boolean method2241() {
      return false;
   }

   public boolean method2239() {
      return false;
   }

   public boolean method2242() {
      return false;
   }

   public boolean method2405() {
      return false;
   }

   public boolean method2244() {
      return false;
   }

   public String method2245() {
      return "";
   }

   public int[] method2246() {
      return null;
   }

   Class184_Sub1 method2606(Canvas var1, int var2, int var3) {
      return Class481.method5764(this, var1, var2, var3, 863521792);
   }

   public boolean method2512() {
      return false;
   }

   public int[] method2479(int var1, int var2, int var3, int var4) {
      if(null == this.anIntArray9243) {
         throw new IllegalStateException("");
      } else {
         int[] var5 = new int[var4 * var3];
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = var1 + this.anInt9277 * -2145294317 * (var2 + var7);

            for(int var9 = 0; var9 < var3; ++var9) {
               var5[var6++] = this.anIntArray9243[var8 + var9];
            }
         }

         return var5;
      }
   }

   public void method2438(int var1, int var2, int var3, int var4) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 < 0) {
         var2 = 0;
      }

      if(var3 > this.anInt9277 * -2145294317) {
         var3 = this.anInt9277 * -2145294317;
      }

      if(var4 > this.anInt9245 * 1496863415) {
         var4 = this.anInt9245 * 1496863415;
      }

      this.anInt9247 = var1 * 1204603845;
      this.anInt9271 = -113115805 * var3;
      this.anInt9267 = var2 * 228933283;
      this.anInt9250 = -624189157 * var4;
      this.method8519();
   }

   public void method2376(int[] var1) {
      var1[0] = -2145294317 * this.anInt9277;
      var1[1] = this.anInt9245 * 1496863415;
   }

   public boolean method2416() {
      return false;
   }

   boolean method2466(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6) {
      Class433 var7 = this.method2318();
      var7.method5110(var5);
      var7.method5085(this.aClass433_9240);
      return var6.method5150(var1, var2, var3, var4, var7, this.aFloat9278, this.aFloat9269, this.aFloat9266, this.aFloat9268);
   }

   public boolean method2401() {
      return false;
   }

   public boolean method2265() {
      return false;
   }

   public int method2352() {
      return -1;
   }

   public void method2268(int var1, int var2, int var3) {
   }

   public void method2267() {
   }

   public long method2269(int var1, int var2) {
      return 0L;
   }

   public void method2395(long var1) {
   }

   public void method2271(int var1, int var2, int[] var3, int[] var4) {
      this.method2272(var1, var2, (short)-6466);
      if(null == this.aClass153_9264 || this.aClass153_9264.method1825() != var1 || this.aClass153_9264.method1771() != var2) {
         this.aClass153_9264 = this.method2307(var1, var2, true, true);
         this.aClass184_Sub2_9279 = null;
      }

      if(null == this.aClass184_Sub2_9279) {
         this.aClass184_Sub2_9279 = this.method2257();
         this.aClass184_Sub2_9279.method8465(0, this.aClass153_9264.method1773());
      }

      Class153_Sub1_Sub1 var5 = new Class153_Sub1_Sub1(this, this.anIntArray9243, this.anInt9277 * -2145294317, 1496863415 * this.anInt9245);
      this.method2623(this.aClass184_Sub2_9279, (short)128);
      this.method2283(1, -16777216);
      var5.method1775(1228368769 * this.anInt2055, this.anInt2039 * 1714687685, -1550496547 * this.anInt2033, 568592699 * this.anInt2058, 1, 0, 0, 0);
      this.aClass153_9264.method1768(0, 0, var1, var2, var3, var4, 0, var1);
      this.method2456(this.aClass184_Sub2_9279, (byte)0);
   }

   public void method2434(float var1, float var2) {
      this.aFloat9270 = var2 - var1;
      this.aFloat9241 = var2 + var1 - 1.0F;

      for(int var3 = 0; var3 < this.anInt9249 * 768566339; ++var3) {
         Class115 var4 = this.aClass115Array9273[var3];
         Class121 var5 = var4.aClass121_1387;
         var5.aFloat1541 = this.aFloat9270;
         var5.aFloat1547 = this.aFloat9241;
      }

   }

   void method8498() {
      if(this.aFloatArray9246 != null) {
         int var1;
         int var2;
         int var3;
         if(-217416947 * this.anInt9247 == 0 && this.anInt9271 * 1270312011 == this.anInt9277 * -2145294317 && 1511023883 * this.anInt9267 == 0 && this.anInt9250 * -288042733 == 1496863415 * this.anInt9245) {
            var1 = this.aFloatArray9246.length;
            var2 = var1 - (var1 & 7);

            for(var3 = 0; var3 < var2; this.aFloatArray9246[var3++] = 2.14748365E9F) {
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
            }

            while(var3 < var1) {
               this.aFloatArray9246[var3++] = 2.14748365E9F;
            }
         } else {
            var1 = this.anInt9271 * 1270312011 - -217416947 * this.anInt9247;
            var2 = -288042733 * this.anInt9250 - 1511023883 * this.anInt9267;
            var3 = -2145294317 * this.anInt9277 - var1;
            int var4 = -2145294317 * this.anInt9277 * 1511023883 * this.anInt9267 + this.anInt9247 * -217416947;
            int var5 = var1 >> 3;
            int var6 = var1 & 7;
            var1 = var4 - 1;

            for(int var7 = -var2; var7 < 0; ++var7) {
               int var8;
               if(var5 > 0) {
                  var8 = var5;

                  do {
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     --var8;
                  } while(var8 > 0);
               }

               if(var6 > 0) {
                  var8 = var6;

                  do {
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     --var8;
                  } while(var8 > 0);
               }

               var1 += var3;
            }
         }

      }
   }

   public void method2328(boolean var1) {
      Class115 var2 = this.method8502(Thread.currentThread());
      var2.aBool1384 = var1;
   }

   public int method2463(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = this.aClass433_9240.aFloatArray4841[2] * (float)var1 + this.aClass433_9240.aFloatArray4841[14] + (float)var2 * this.aClass433_9240.aFloatArray4841[6] + (float)var3 * this.aClass433_9240.aFloatArray4841[10];
      float var9 = (float)var6 * this.aClass433_9240.aFloatArray4841[10] + this.aClass433_9240.aFloatArray4841[14] + (float)var4 * this.aClass433_9240.aFloatArray4841[2] + this.aClass433_9240.aFloatArray4841[6] * (float)var5;
      float var10 = this.aClass433_9240.aFloatArray4841[11] * (float)var3 + this.aClass433_9240.aFloatArray4841[3] * (float)var1 + this.aClass433_9240.aFloatArray4841[15] + (float)var2 * this.aClass433_9240.aFloatArray4841[7];
      float var11 = (float)var6 * this.aClass433_9240.aFloatArray4841[11] + (float)var4 * this.aClass433_9240.aFloatArray4841[3] + this.aClass433_9240.aFloatArray4841[15] + (float)var5 * this.aClass433_9240.aFloatArray4841[7];
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.aClass433_9240.aFloatArray4841[8] * (float)var3 + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[0] * (float)var1 + (float)var2 * this.aClass433_9240.aFloatArray4841[4];
      float var13 = this.aClass433_9240.aFloatArray4841[0] * (float)var4 + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[4] * (float)var5 + this.aClass433_9240.aFloatArray4841[8] * (float)var6;
      if(var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if(var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = (float)var3 * this.aClass433_9240.aFloatArray4841[9] + this.aClass433_9240.aFloatArray4841[1] * (float)var1 + this.aClass433_9240.aFloatArray4841[13] + (float)var2 * this.aClass433_9240.aFloatArray4841[5];
      float var15 = this.aClass433_9240.aFloatArray4841[5] * (float)var5 + this.aClass433_9240.aFloatArray4841[13] + (float)var4 * this.aClass433_9240.aFloatArray4841[1] + (float)var6 * this.aClass433_9240.aFloatArray4841[9];
      if(var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if(var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   public void method2573(int var1, int var2, int var3, int var4) {
      this.anInt9262 = var1 * 201562419;
      this.anInt9248 = 320933757 * var2;
      this.anInt9272 = 995589721 * var3;
      this.anInt9265 = var4 * 834763039;
      this.method8519();
   }

   public void method2276(int[] var1) {
      var1[0] = this.anInt9262 * 1670515195;
      var1[1] = -2102713899 * this.anInt9248;
      var1[2] = this.anInt9272 * -1602754071;
      var1[3] = this.anInt9265 * 697483999;
   }

   public boolean method2460() {
      return false;
   }

   public void method2398() {
   }

   public void method2278() {
      this.anInt9247 = 0;
      this.anInt9267 = 0;
      this.anInt9271 = 2023294553 * this.anInt9277;
      this.anInt9250 = 1108529229 * this.anInt9245;
      this.method8519();
   }

   public void method2538(int var1, int var2, int var3, int var4) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 < 0) {
         var2 = 0;
      }

      if(var3 > this.anInt9277 * -2145294317) {
         var3 = this.anInt9277 * -2145294317;
      }

      if(var4 > this.anInt9245 * 1496863415) {
         var4 = this.anInt9245 * 1496863415;
      }

      this.anInt9247 = var1 * 1204603845;
      this.anInt9271 = -113115805 * var3;
      this.anInt9267 = var2 * 228933283;
      this.anInt9250 = -624189157 * var4;
      this.method8519();
   }

   public boolean method2270() {
      return true;
   }

   public boolean method2404() {
      return false;
   }

   public void method2283(int var1, int var2) {
      if(0 != (var1 & 1)) {
         this.method2290(0, 0, -2145294317 * this.anInt9277, this.anInt9245 * 1496863415, var2, 0);
      }

      if((var1 & 2) != 0) {
         this.method8498();
      }

   }

   public void method2261(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method2293(var1, var2, var3, var5, var6);
      this.method2293(var1, var2 + var4 - 1, var3, var5, var6);
      this.method2294(var1, 1 + var2, var4 - 2, var5, var6);
      this.method2294(var3 + var1 - 1, 1 + var2, var4 - 2, var5, var6);
   }

   public void method2290(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != this.anIntArray9243) {
         if(var1 < this.anInt9247 * -217416947) {
            var3 -= this.anInt9247 * -217416947 - var1;
            var1 = -217416947 * this.anInt9247;
         }

         if(var2 < this.anInt9267 * 1511023883) {
            var4 -= this.anInt9267 * 1511023883 - var2;
            var2 = 1511023883 * this.anInt9267;
         }

         if(var3 + var1 > this.anInt9271 * 1270312011) {
            var3 = 1270312011 * this.anInt9271 - var1;
         }

         if(var2 + var4 > -288042733 * this.anInt9250) {
            var4 = this.anInt9250 * -288042733 - var2;
         }

         if(var3 > 0 && var4 > 0 && var1 <= 1270312011 * this.anInt9271 && var2 <= this.anInt9250 * -288042733) {
            int var7 = this.anInt9277 * -2145294317 - var3;
            int var8 = var1 + this.anInt9277 * -2145294317 * var2;
            int var9 = var5 >>> 24;
            int var10;
            int var11;
            int var12;
            if(var6 != 0 && (1 != var6 || var9 != 255)) {
               int var13;
               if(var6 == 1) {
                  var5 = (var9 * ((var5 & -16711936) >>> 8) & -16711936) + (var9 * (var5 & 16711935) >> 8 & 16711935);
                  var10 = 256 - var9;

                  for(var11 = 0; var11 < var4; ++var11) {
                     for(var12 = -var3; var12 < 0; ++var12) {
                        var13 = this.anIntArray9243[var8];
                        var13 = (var10 * (var13 & 16711935) >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                        this.anIntArray9243[var8++] = var5 + var13;
                     }

                     var8 += var7;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  for(var10 = 0; var10 < var4; ++var10) {
                     for(var11 = -var3; var11 < 0; ++var11) {
                        var12 = this.anIntArray9243[var8];
                        var13 = var12 + var5;
                        int var14 = (var5 & 16711935) + (var12 & 16711935);
                        var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                        this.anIntArray9243[var8++] = var13 - var12 | var12 - (var12 >>> 8);
                     }

                     var8 += var7;
                  }
               }
            } else {
               var10 = var3 >> 3;
               var11 = var3 & 7;
               var3 = var8 - 1;

               for(var12 = -var4; var12 < 0; ++var12) {
                  if(var10 > 0) {
                     var1 = var10;

                     do {
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  if(var11 > 0) {
                     var1 = var11;

                     do {
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  var3 += var7;
               }
            }

         }
      }
   }

   void method2436(int var1, int var2, int var3, int var4, int var5) {
      if(this.anIntArray9243 != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var6 = var2 - var3;
         if(var6 < this.anInt9267 * 1511023883) {
            var6 = this.anInt9267 * 1511023883;
         }

         int var7 = 1 + var2 + var3;
         if(var7 > -288042733 * this.anInt9250) {
            var7 = -288042733 * this.anInt9250;
         }

         int var8 = var6;
         int var9 = var3 * var3;
         int var10 = 0;
         int var11 = var2 - var6;
         int var12 = var11 * var11;
         int var13 = var12 - var11;
         if(var2 > var7) {
            var2 = var7;
         }

         int var14 = var4 >>> 24;
         int var15;
         int var16;
         int var17;
         int var18;
         if(0 == var5 || var5 == 1 && 255 == var14) {
            while(var8 < var2) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               var15 = 1 + (var1 - var10);
               if(var15 < this.anInt9247 * -217416947) {
                  var15 = this.anInt9247 * -217416947;
               }

               var16 = var10 + var1;
               if(var16 > this.anInt9271 * 1270312011) {
                  var16 = this.anInt9271 * 1270312011;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 < var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            var10 = var3;
            var11 = var8 - var2;
            var13 = var11 * var11 + var9;
            var12 = var13 - var3;

            for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
               while(var13 > var9 && var12 > var9) {
                  var13 -= var10-- + var10;
                  var12 -= var10 + var10;
               }

               var15 = var1 - var10;
               if(var15 < -217416947 * this.anInt9247) {
                  var15 = -217416947 * this.anInt9247;
               }

               var16 = var10 + var1;
               if(var16 > 1270312011 * this.anInt9271 - 1) {
                  var16 = this.anInt9271 * 1270312011 - 1;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 <= var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var13 += var11 + var11;
            }

            return;
         } else {
            int var19;
            int var20;
            if(1 == var5) {
               var4 = ((var4 & '\uff00') * var14 >> 8 & '\uff00') + ((var4 & 16711935) * var14 >> 8 & 16711935) + (var14 << 24);

               for(var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var16 = var1 - var10 + 1;
                  if(var16 < -217416947 * this.anInt9247) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > this.anInt9271 * 1270312011) {
                     var17 = 1270312011 * this.anInt9271;
                  }

                  var18 = -2145294317 * this.anInt9277 * var8 + var16;

                  for(var19 = var16; var19 < var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = ((var20 & '\uff00') * var15 >> 8 & '\uff00') + ((var20 & 16711935) * var15 >> 8 & 16711935);
                     this.anIntArray9243[var18++] = var4 + var20;
                  }

                  ++var8;
                  var12 -= var11-- + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var16 = var1 - var10;
                  if(var16 < this.anInt9247 * -217416947) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > 1270312011 * this.anInt9271 - 1) {
                     var17 = 1270312011 * this.anInt9271 - 1;
                  }

                  var18 = var8 * -2145294317 * this.anInt9277 + var16;

                  for(var19 = var16; var19 <= var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = (var15 * (var20 & 16711935) >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                     this.anIntArray9243[var18++] = var20 + var4;
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            } else {
               if(2 != var5) {
                  throw new IllegalArgumentException();
               }

               int var21;
               while(var8 < var2) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var15 = 1 + (var1 - var10);
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var10 + var1;
                  if(var16 > this.anInt9271 * 1270312011) {
                     var16 = 1270312011 * this.anInt9271;
                  }

                  var17 = var15 + this.anInt9277 * -2145294317 * var8;

                  for(var18 = var15; var18 < var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var19 + var4;
                     var21 = (var4 & 16711935) + (var19 & 16711935);
                     var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var12 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var15 = var1 - var10;
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var1 + var10;
                  if(var16 > 1270312011 * this.anInt9271 - 1) {
                     var16 = 1270312011 * this.anInt9271 - 1;
                  }

                  var17 = var15 + var8 * -2145294317 * this.anInt9277;

                  for(var18 = var15; var18 <= var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var4 + var19;
                     var21 = (var19 & 16711935) + (var4 & 16711935);
                     var19 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            }
         }

      }
   }

   void method2293(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.anIntArray9243) {
         if(var2 >= this.anInt9267 * 1511023883 && var2 < this.anInt9250 * -288042733) {
            if(var1 < this.anInt9247 * -217416947) {
               var3 -= this.anInt9247 * -217416947 - var1;
               var1 = -217416947 * this.anInt9247;
            }

            if(var1 + var3 > 1270312011 * this.anInt9271) {
               var3 = 1270312011 * this.anInt9271 - var1;
            }

            int var6 = var1 + this.anInt9277 * -2145294317 * var2;
            int var7 = var4 >>> 24;
            int var8;
            if(var5 != 0 && (var5 != 1 || 255 != var7)) {
               int var9;
               int var10;
               if(1 == var5) {
                  var4 = ((var4 & 16711935) * var7 >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00') + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = this.anIntArray9243[var6 + var9];
                     var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     this.anIntArray9243[var6 + var9] = var4 + var10;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.anIntArray9243[var8 + var6];
                     var10 = var4 + var9;
                     int var11 = (var9 & 16711935) + (var4 & 16711935);
                     var9 = (var10 - var11 & 65536) + (var11 & 16777472);
                     this.anIntArray9243[var8 + var6] = var10 - var9 | var9 - (var9 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.anIntArray9243[var6 + var8] = var4;
               }
            }

         }
      }
   }

   void method8499(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.anIntArray9243 != null) {
         if(var2 >= 1511023883 * this.anInt9267 && var2 < -288042733 * this.anInt9250) {
            int var9 = var1 + -2145294317 * this.anInt9277 * var2;
            int var10 = var4 >>> 24;
            int var11 = var6 + var7;
            int var12 = var8 % var11;
            int var13;
            if(0 == var5 || var5 == 1 && 255 == var10) {
               for(var13 = 0; var13 < var3; var12 %= var11) {
                  if(var1 + var13 >= -217416947 * this.anInt9247 && var13 + var1 < 1270312011 * this.anInt9271 && var12 < var6) {
                     this.anIntArray9243[var9 + var13] = var4;
                  }

                  ++var13;
                  ++var12;
               }
            } else {
               int var14;
               int var15;
               if(var5 == 1) {
                  var4 = (var10 * (var4 & '\uff00') >> 8 & '\uff00') + (var10 * (var4 & 16711935) >> 8 & 16711935) + (var10 << 24);
                  var13 = 256 - var10;

                  for(var14 = 0; var14 < var3; var12 %= var11) {
                     if(var14 + var1 >= this.anInt9247 * -217416947 && var1 + var14 < this.anInt9271 * 1270312011 && var12 < var6) {
                        var15 = this.anIntArray9243[var9 + var14];
                        var15 = (var13 * (var15 & '\uff00') >> 8 & '\uff00') + (var13 * (var15 & 16711935) >> 8 & 16711935);
                        this.anIntArray9243[var14 + var9] = var4 + var15;
                     }

                     ++var14;
                     ++var12;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var13 = 0; var13 < var3; var12 %= var11) {
                     if(var1 + var13 >= this.anInt9247 * -217416947 && var13 + var1 < this.anInt9271 * 1270312011 && var12 < var6) {
                        var14 = this.anIntArray9243[var9 + var13];
                        var15 = var14 + var4;
                        int var16 = (var4 & 16711935) + (var14 & 16711935);
                        var14 = (var16 & 16777472) + (var15 - var16 & 65536);
                        this.anIntArray9243[var9 + var13] = var15 - var14 | var14 - (var14 >>> 8);
                     }

                     ++var13;
                     ++var12;
                  }
               }
            }

         }
      }
   }

   void method2294(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.anIntArray9243) {
         if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011) {
            if(var2 < this.anInt9267 * 1511023883) {
               var3 -= this.anInt9267 * 1511023883 - var2;
               var2 = 1511023883 * this.anInt9267;
            }

            if(var3 + var2 > -288042733 * this.anInt9250) {
               var3 = -288042733 * this.anInt9250 - var2;
            }

            int var6 = var2 * -2145294317 * this.anInt9277 + var1;
            int var7 = var4 >>> 24;
            int var8;
            if(0 != var5 && (1 != var5 || var7 != 255)) {
               int var9;
               int var10;
               int var11;
               if(var5 == 1) {
                  var4 = (var7 << 24) + (var7 * (var4 & 16711935) >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00');
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = var6 + var9 * this.anInt9277 * -2145294317;
                     var11 = this.anIntArray9243[var10];
                     var11 = (var8 * (var11 & '\uff00') >> 8 & '\uff00') + (var8 * (var11 & 16711935) >> 8 & 16711935);
                     this.anIntArray9243[var10] = var11 + var4;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.anInt9277 * -2145294317 * var8 + var6;
                     var10 = this.anIntArray9243[var9];
                     var11 = var4 + var10;
                     int var12 = (var4 & 16711935) + (var10 & 16711935);
                     var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                     this.anIntArray9243[var9] = var11 - var10 | var10 - (var10 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.anIntArray9243[var6 + var8 * this.anInt9277 * -2145294317] = var4;
               }
            }

         }
      }
   }

   void method8500(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(null != this.anIntArray9243) {
         if(var1 >= this.anInt9247 * -217416947 && var1 < 1270312011 * this.anInt9271) {
            int var9 = this.anInt9277 * -2145294317 * var2 + var1;
            int var10 = var4 >>> 24;
            int var11 = var6 + var7;
            int var12 = var8 % var11;
            int var13;
            if(0 == var5 || var5 == 1 && 255 == var10) {
               for(var13 = 0; var13 < var3; var12 %= var11) {
                  if(var13 + var2 >= 1511023883 * this.anInt9267 && var13 + var2 < -288042733 * this.anInt9250 && var12 < var6) {
                     this.anIntArray9243[var13 * -2145294317 * this.anInt9277 + var9] = var4;
                  }

                  ++var13;
                  ++var12;
               }
            } else {
               int var14;
               int var15;
               int var16;
               if(var5 == 1) {
                  var4 = (var10 * (var4 & 16711935) >> 8 & 16711935) + ((var4 & '\uff00') * var10 >> 8 & '\uff00') + (var10 << 24);
                  var13 = 256 - var10;

                  for(var14 = 0; var14 < var3; var12 %= var11) {
                     if(var14 + var2 >= this.anInt9267 * 1511023883 && var2 + var14 < this.anInt9250 * -288042733 && var12 < var6) {
                        var15 = -2145294317 * this.anInt9277 * var14 + var9;
                        var16 = this.anIntArray9243[var15];
                        var16 = ((var16 & '\uff00') * var13 >> 8 & '\uff00') + ((var16 & 16711935) * var13 >> 8 & 16711935);
                        this.anIntArray9243[var15] = var16 + var4;
                     }

                     ++var14;
                     ++var12;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var13 = 0; var13 < var3; var12 %= var11) {
                     if(var2 + var13 >= this.anInt9267 * 1511023883 && var13 + var2 < this.anInt9250 * -288042733 && var12 < var6) {
                        var14 = var13 * -2145294317 * this.anInt9277 + var9;
                        var15 = this.anIntArray9243[var14];
                        var16 = var4 + var15;
                        int var17 = (var4 & 16711935) + (var15 & 16711935);
                        var15 = (var16 - var17 & 65536) + (var17 & 16777472);
                        this.anIntArray9243[var14] = var16 - var15 | var15 - (var15 >>> 8);
                     }

                     ++var13;
                     ++var12;
                  }
               }
            }

         }
      }
   }

   public Interface23 method2260(int var1, int var2, int var3) {
      return new Class130(var1, var2);
   }

   public boolean method2412() {
      return false;
   }

   public void method2296(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9) {
      if(null != this.anIntArray9243) {
         Class162_Sub2 var10 = (Class162_Sub2)var7;
         int[] var11 = var10.anIntArray9211;
         int[] var12 = var10.anIntArray9210;
         int var13 = 1511023883 * this.anInt9267 > var9?1511023883 * this.anInt9267:var9;
         int var14 = -288042733 * this.anInt9250 < var11.length + var9?this.anInt9250 * -288042733:var9 + var11.length;
         var3 -= var1;
         var4 -= var2;
         if(var3 + var4 < 0) {
            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var15 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            if(var1 < this.anInt9247 * -217416947) {
               var2 += var15 * (this.anInt9247 * -217416947 - var1);
               var1 = -217416947 * this.anInt9247;
            }

            if(var3 >= 1270312011 * this.anInt9271) {
               var3 = this.anInt9271 * 1270312011 - 1;
            }

            var16 = var5 >>> 24;
            if(var6 != 0 && (1 != var6 || 255 != var16)) {
               if(1 == var6) {
                  var5 = (var16 * (var5 & 16711935) >> 8 & 16711935) + (var16 * (var5 & '\uff00') >> 8 & '\uff00') + (var16 << 24);

                  for(var17 = 256 - var16; var1 <= var3; ++var1) {
                     var18 = var2 >> 16;
                     var19 = var18 - var9;
                     if(var18 >= var13 && var18 < var14) {
                        var20 = var11[var19] + var8;
                        if(var1 >= var20 && var1 < var20 + var12[var19]) {
                           var21 = var18 * -2145294317 * this.anInt9277 + var1;
                           var22 = this.anIntArray9243[var21];
                           var22 = (var17 * (var22 & 16711935) >> 8 & 16711935) + (var17 * (var22 & '\uff00') >> 8 & '\uff00');
                           this.anIntArray9243[var21] = var22 + var5;
                        }
                     }

                     var2 += var15;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var17 = var2 >> 16;
                     var18 = var17 - var9;
                     if(var17 >= var13 && var17 < var14) {
                        var19 = var8 + var11[var18];
                        if(var1 >= var19 && var1 < var12[var18] + var19) {
                           var20 = var17 * -2145294317 * this.anInt9277 + var1;
                           var21 = this.anIntArray9243[var20];
                           var22 = var5 + var21;
                           var23 = (var5 & 16711935) + (var21 & 16711935);
                           var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                           this.anIntArray9243[var20] = var22 - var21 | var21 - (var21 >>> 8);
                        }
                     }

                     var2 += var15;
                     ++var1;
                  }
               }
            } else {
               while(var1 <= var3) {
                  var17 = var2 >> 16;
                  var18 = var17 - var9;
                  if(var17 >= var13 && var17 < var14) {
                     var19 = var8 + var11[var18];
                     if(var1 >= var19 && var1 < var19 + var12[var18]) {
                        this.anIntArray9243[var1 + -2145294317 * this.anInt9277 * var17] = var5;
                     }
                  }

                  var2 += var15;
                  ++var1;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var15 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var4 += var2;
            if(var2 < var13) {
               var1 += (var13 - var2) * var15;
               var2 = var13;
            }

            if(var4 >= var14) {
               var4 = var14 - 1;
            }

            var16 = var5 >>> 24;
            if(0 == var6 || var6 == 1 && var16 == 255) {
               while(var2 <= var4) {
                  var17 = var1 >> 16;
                  var18 = var2 - var9;
                  var19 = var11[var18] + var8;
                  if(var17 >= this.anInt9247 * -217416947 && var17 < 1270312011 * this.anInt9271 && var17 >= var19 && var17 < var12[var18] + var19) {
                     this.anIntArray9243[var17 + -2145294317 * this.anInt9277 * var2] = var5;
                  }

                  var1 += var15;
                  ++var2;
               }
            } else if(1 == var6) {
               var5 = (var16 << 24) + ((var5 & '\uff00') * var16 >> 8 & '\uff00') + ((var5 & 16711935) * var16 >> 8 & 16711935);

               for(var17 = 256 - var16; var2 <= var4; ++var2) {
                  var18 = var1 >> 16;
                  var19 = var2 - var9;
                  var20 = var11[var19] + var8;
                  if(var18 >= -217416947 * this.anInt9247 && var18 < this.anInt9271 * 1270312011 && var18 >= var20 && var18 < var20 + var12[var19]) {
                     var21 = var18 + var2 * -2145294317 * this.anInt9277;
                     var22 = this.anIntArray9243[var21];
                     var22 = ((var22 & 16711935) * var17 >> 8 & 16711935) + ((var22 & '\uff00') * var17 >> 8 & '\uff00');
                     this.anIntArray9243[this.anInt9277 * -2145294317 * var2 + var18] = var5 + var22;
                  }

                  var1 += var15;
               }
            } else {
               if(2 != var6) {
                  throw new IllegalArgumentException();
               }

               while(var2 <= var4) {
                  var17 = var1 >> 16;
                  var18 = var2 - var9;
                  var19 = var11[var18] + var8;
                  if(var17 >= -217416947 * this.anInt9247 && var17 < this.anInt9271 * 1270312011 && var17 >= var19 && var17 < var19 + var12[var18]) {
                     var20 = var17 + this.anInt9277 * -2145294317 * var2;
                     var21 = this.anIntArray9243[var20];
                     var22 = var21 + var5;
                     var23 = (var5 & 16711935) + (var21 & 16711935);
                     var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                     this.anIntArray9243[var20] = var22 - var21 | var21 - (var21 >>> 8);
                  }

                  var1 += var15;
                  ++var2;
               }
            }
         }

      }
   }

   public void method2342(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var13 = (Class162_Sub2)var7;
         int[] var14 = var13.anIntArray9211;
         int[] var15 = var13.anIntArray9210;
         int var16 = this.anInt9267 * 1511023883 > var9?1511023883 * this.anInt9267:var9;
         int var17 = -288042733 * this.anInt9250 < var9 + var14.length?-288042733 * this.anInt9250:var9 + var14.length;
         var12 <<= 8;
         var10 <<= 8;
         var11 <<= 8;
         int var18 = var10 + var11;
         var12 %= var18;
         var3 -= var1;
         var4 -= var2;
         int var19;
         int var20;
         if(var3 + var4 < 0) {
            var19 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
            var20 = var19 % var18;
            var12 = var18 + var10 - var12 - var20;
            var12 %= var18;
            if(var12 < 0) {
               var12 += var18;
            }

            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var19 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            var20 = var5 >>> 24;
            var21 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            if(0 == var6 || var6 == 1 && var20 == 255) {
               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var14[var23] + var8;
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        this.anIntArray9243[this.anInt9277 * -2145294317 * var22 + var1] = var5;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var20 << 24) + ((var5 & '\uff00') * var20 >> 8 & '\uff00') + ((var5 & 16711935) * var20 >> 8 & 16711935);

               for(var22 = 256 - var20; var1 <= var3; var12 %= var18) {
                  var23 = var2 >> 16;
                  var24 = var23 - var9;
                  if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011 && var23 >= var16 && var23 < var17 && var12 < var10) {
                     var25 = var8 + var14[var24];
                     if(var1 >= var25 && var1 < var15[var24] + var25) {
                        var26 = var1 + this.anInt9277 * -2145294317 * var23;
                        var27 = this.anIntArray9243[var26];
                        var27 = (var22 * (var27 & '\uff00') >> 8 & '\uff00') + ((var27 & 16711935) * var22 >> 8 & 16711935);
                        this.anIntArray9243[var26] = var5 + var27;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var8 + var14[var23];
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        var25 = var1 + var22 * this.anInt9277 * -2145294317;
                        var26 = this.anIntArray9243[var25];
                        var27 = var26 + var5;
                        int var28 = (var26 & 16711935) + (var5 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        this.anIntArray9243[var25] = var27 - var26 | var26 - (var26 >>> 8);
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var19 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var20 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            var4 += var2;
            var21 = var5 >>> 24;
            if(var6 == 0 || 1 == var6 && var21 == 255) {
               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= this.anInt9247 * -217416947 && var22 < 1270312011 * this.anInt9271 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var15[var23] + var8 + var14[var23]) {
                     this.anIntArray9243[var22 + var2 * this.anInt9277 * -2145294317] = var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var21 << 24) + (var21 * (var5 & '\uff00') >> 8 & '\uff00') + (var21 * (var5 & 16711935) >> 8 & 16711935);

               for(var22 = 256 - var21; var2 <= var4; var12 %= var18) {
                  var23 = var1 >> 16;
                  var24 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var23 >= -217416947 * this.anInt9247 && var23 < this.anInt9271 * 1270312011 && var12 < var10 && var23 >= var14[var24] + var8 && var23 < var8 + var14[var24] + var15[var24]) {
                     var25 = this.anInt9277 * -2145294317 * var2 + var23;
                     var26 = this.anIntArray9243[var25];
                     var26 = (var22 * (var26 & '\uff00') >> 8 & '\uff00') + ((var26 & 16711935) * var22 >> 8 & 16711935);
                     this.anIntArray9243[var23 + var2 * this.anInt9277 * -2145294317] = var26 + var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
               }
            } else {
               if(2 != var6) {
                  throw new IllegalArgumentException();
               }

               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= -217416947 * this.anInt9247 && var22 < this.anInt9271 * 1270312011 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var8 + var14[var23] + var15[var23]) {
                     var24 = -2145294317 * this.anInt9277 * var2 + var22;
                     var25 = this.anIntArray9243[var24];
                     var26 = var5 + var25;
                     var27 = (var5 & 16711935) + (var25 & 16711935);
                     var25 = (var26 - var27 & 65536) + (var27 & 16777472);
                     this.anIntArray9243[var24] = var26 - var25 | var25 - (var25 >>> 8);
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            }
         }

      }
   }

   public void method2422(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(null != this.anIntArray9243) {
         Class115 var8 = this.method8502(Thread.currentThread());
         Class121 var9 = var8.aClass121_1387;
         int var10 = var3 - var1;
         int var11 = var4 - var2;
         int var12 = var10 >= 0?var10:-var10;
         int var13 = var11 >= 0?var11:-var11;
         int var14 = var12;
         if(var12 < var13) {
            var14 = var13;
         }

         if(0 != var14) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            var10 += var15 >> 16;
            var11 += var16 >> 16;
            if(var16 <= var15) {
               var15 = -var15;
            } else {
               var16 = -var16;
            }

            int var17 = var6 * var16 >> 17;
            int var18 = var6 * var16 + 1 >> 17;
            int var19 = var6 * var15 >> 17;
            int var20 = var15 * var6 + 1 >> 17;
            var1 -= var9.method1453();
            var2 -= var9.method1454();
            int var21 = var17 + var1;
            int var22 = var1 - var18;
            int var23 = var10 + var1 - var18;
            int var24 = var10 + var1 + var17;
            int var25 = var2 + var19;
            int var26 = var2 - var20;
            int var27 = var11 + var2 - var20;
            int var28 = var11 + var2 + var19;
            if(0 == var7) {
               var9.anInt1543 = 0;
            } else {
               if(1 != var7) {
                  throw new IllegalArgumentException();
               }

               var9.anInt1543 = 255 - (var5 >>> 24);
            }

            this.method2328(false);
            var9.aBool1556 = var21 < 0 || var21 > var9.anInt1542 || var22 < 0 || var22 > var9.anInt1542 || var23 < 0 || var23 > var9.anInt1542;
            var9.method1459(true, false, false, (float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0F, 100.0F, 100.0F, var5);
            var9.aBool1556 = var21 < 0 || var21 > var9.anInt1542 || var23 < 0 || var23 > var9.anInt1542 || var24 < 0 || var24 > var9.anInt1542;
            var9.method1459(true, false, false, (float)var25, (float)var27, (float)var28, (float)var21, (float)var23, (float)var24, 100.0F, 100.0F, 100.0F, var5);
            this.method2328(true);
         }
      }
   }

   public int method2300(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = this.aClass433_9240.aFloatArray4841[2] * (float)var1 + this.aClass433_9240.aFloatArray4841[14] + (float)var2 * this.aClass433_9240.aFloatArray4841[6] + (float)var3 * this.aClass433_9240.aFloatArray4841[10];
      float var9 = (float)var6 * this.aClass433_9240.aFloatArray4841[10] + this.aClass433_9240.aFloatArray4841[14] + (float)var4 * this.aClass433_9240.aFloatArray4841[2] + this.aClass433_9240.aFloatArray4841[6] * (float)var5;
      float var10 = this.aClass433_9240.aFloatArray4841[11] * (float)var3 + this.aClass433_9240.aFloatArray4841[3] * (float)var1 + this.aClass433_9240.aFloatArray4841[15] + (float)var2 * this.aClass433_9240.aFloatArray4841[7];
      float var11 = (float)var6 * this.aClass433_9240.aFloatArray4841[11] + (float)var4 * this.aClass433_9240.aFloatArray4841[3] + this.aClass433_9240.aFloatArray4841[15] + (float)var5 * this.aClass433_9240.aFloatArray4841[7];
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.aClass433_9240.aFloatArray4841[8] * (float)var3 + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[0] * (float)var1 + (float)var2 * this.aClass433_9240.aFloatArray4841[4];
      float var13 = this.aClass433_9240.aFloatArray4841[0] * (float)var4 + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[4] * (float)var5 + this.aClass433_9240.aFloatArray4841[8] * (float)var6;
      if(var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if(var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = (float)var3 * this.aClass433_9240.aFloatArray4841[9] + this.aClass433_9240.aFloatArray4841[1] * (float)var1 + this.aClass433_9240.aFloatArray4841[13] + (float)var2 * this.aClass433_9240.aFloatArray4841[5];
      float var15 = this.aClass433_9240.aFloatArray4841[5] * (float)var5 + this.aClass433_9240.aFloatArray4841[13] + (float)var4 * this.aClass433_9240.aFloatArray4841[1] + (float)var6 * this.aClass433_9240.aFloatArray4841[9];
      if(var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if(var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   boolean method2302(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6) {
      Class433 var7 = this.method2318();
      var7.method5110(var5);
      var7.method5085(this.aClass433_9240);
      return var6.method5150(var1, var2, var3, var4, var7, this.aFloat9278, this.aFloat9269, this.aFloat9266, this.aFloat9268);
   }

   public void method2303(Class445 var1, Class164 var2, Class437 var3) {
      Class433 var4 = this.method2318();
      var4.method5110(var1);
      var4.method5085(this.aClass433_9240);
      var2.method1928(var3, this.aClass433_9260, var4, this.aFloat9278, this.aFloat9269, this.aFloat9266, this.aFloat9268);
   }

   public boolean method2408() {
      return true;
   }

   public void method2305(Class526_Sub8 var1) {
   }

   public Class153 method2307(int var1, int var2, boolean var3, boolean var4) {
      return (Class153)(var3?new Class153_Sub1_Sub1(this, var1, var2):new Class153_Sub1_Sub2(this, var1, var2));
   }

   public Class153 method2613(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = false;
      int var8 = var2;

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var1[var8++] >>> 24;
            if(0 != var11 && 255 != var11) {
               var7 = true;
               return (Class153)(var7?new Class153_Sub1_Sub1(this, var1, var2, var3, var4, var5, var6):new Class153_Sub1_Sub2(this, var1, var2, var3, var4, var5, var6));
            }
         }
      }

      return (Class153)(var7?new Class153_Sub1_Sub1(this, var1, var2, var3, var4, var5, var6):new Class153_Sub1_Sub2(this, var1, var2, var3, var4, var5, var6));
   }

   public Class157 method2360() {
      return new Class157(0, "Pure Java", 1, "CPU", 0L, false);
   }

   public void method2336(int var1, Class526_Sub16[] var2) {
   }

   public Class162 method2570(int var1, int var2, int[] var3, int[] var4) {
      return new Class162_Sub2(var1, var2, var3, var4);
   }

   public void method2316(int var1, Class162 var2, int var3, int var4) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var5 = (Class162_Sub2)var2;
         int[] var6 = var5.anIntArray9211;
         int[] var7 = var5.anIntArray9210;
         int var8;
         if(-288042733 * this.anInt9250 < var4 + var6.length) {
            var8 = -288042733 * this.anInt9250 - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(this.anInt9267 * 1511023883 > var4) {
            var9 = 1511023883 * this.anInt9267 - var4;
            var4 = this.anInt9267 * 1511023883;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = var4 * -2145294317 * this.anInt9277;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var3 + var6[var11];
               int var13 = var7[var11];
               if(-217416947 * this.anInt9247 > var12) {
                  var13 -= this.anInt9247 * -217416947 - var12;
                  var12 = -217416947 * this.anInt9247;
               }

               if(1270312011 * this.anInt9271 < var12 + var13) {
                  var13 = this.anInt9271 * 1270312011 - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.anIntArray9243[var12++] = var1;
               }

               var10 += this.anInt9277 * -2145294317;
            }

         }
      }
   }

   public Class163 method2313(Class1 var1, Class173[] var2, boolean var3) {
      int[] var4 = new int[var2.length];
      int[] var5 = new int[var2.length];
      boolean var6 = false;
      boolean var7 = false;

      for(int var8 = 0; var8 < var2.length; ++var8) {
         var4[var8] = var2[var8].method2168();
         var5[var8] = var2[var8].method2175();
         if(var2[var8].method2224()) {
            var6 = true;
         }

         if(var2[var8].method2166()) {
            var7 = true;
         }
      }

      if(var3) {
         if(var7) {
            if(var6) {
               return new Class163_Sub1(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            } else {
               return new Class163_Sub6(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            }
         } else if(var6) {
            return new Class163_Sub1(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         } else {
            return new Class163_Sub6(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         }
      } else if(var7) {
         if(var6) {
            throw new IllegalArgumentException("");
         } else {
            return new Class163_Sub2(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
         }
      } else {
         return new Class163_Sub3(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
      }
   }

   void method8501() {
      int var1 = this.anInt9271 * 1270312011 - -217416947 * this.anInt9247;
      int var2 = this.anInt9250 * -288042733 - this.anInt9267 * 1511023883;
      float var3 = this.aFloat9266 = (float)(-1602754071 * this.anInt9272) / 2.0F;
      float var4 = this.aFloat9268 = (float)(this.anInt9265 * 697483999) / 2.0F;
      this.aFloat9278 = (float)(this.anInt9262 * 1670515195) + var3;
      this.aFloat9269 = (float)(this.anInt9248 * -2102713899) + var4;

      int var5;
      for(var5 = 0; var5 < this.anInt9249 * 768566339; ++var5) {
         Class115 var6 = this.aClass115Array9273[var5];
         Class121 var7 = var6.aClass121_1387;
         var7.aFloat1537 = var3;
         var7.aFloat1539 = var4;
         var7.aFloat1534 = this.aFloat9278 - (float)(this.anInt9247 * -217416947);
         var7.aFloat1553 = this.aFloat9269 - (float)(1511023883 * this.anInt9267);
         var7.anInt1542 = var1;
         var7.anInt1540 = var2;
      }

      var5 = this.anInt9247 * -217416947 + -2145294317 * this.anInt9277 * 1511023883 * this.anInt9267;

      for(int var8 = 1511023883 * this.anInt9267; var8 < this.anInt9250 * -288042733; ++var8) {
         for(int var9 = 0; var9 < this.anInt9249 * 768566339; ++var9) {
            this.aClass115Array9273[var9].aClass121_1387.anIntArray1538[var8 - 1511023883 * this.anInt9267] = var5;
         }

         var5 += this.anInt9277 * -2145294317;
      }

   }

   public Class168 method2321(Class170 var1, int var2, int var3, int var4, int var5) {
      return new Class168_Sub3(this, var1, var2, var4, var5, var3);
   }

   public int method2464(int var1, int var2) {
      var1 |= 133120;
      return var1 & var2 ^ var2;
   }

   public void method2309(int var1, Class172 var2) {
      Class115 var3 = this.method8502(Thread.currentThread());
      var3.anInt1412 = -915810697 * var1;
      var3.anInt1379 = 1592157823 * var2.anInt2019;
      var3.anInt1416 = 1905149801 * var2.anInt2020;
   }

   public void method2325() {
   }

   public Class433 method2318() {
      Class115 var1 = this.method8502(Thread.currentThread());
      return var1.aClass433_1385;
   }

   public Class445 method2319() {
      Class115 var1 = this.method8502(Thread.currentThread());
      return var1.aClass445_1386;
   }

   public int method2334() {
      return 0;
   }

   public void method2555(int var1, Class172 var2) {
      for(int var3 = 0; var3 < this.aClass115Array9273.length; ++var3) {
         this.aClass115Array9273[var3].anInt1380 = this.aClass115Array9273[var3].anInt1379 * -2138309751;
         this.aClass115Array9273[var3].anInt1412 = var1 * -915810697;
         this.aClass115Array9273[var3].anInt1379 = 1592157823 * var2.anInt2019;
         this.aClass115Array9273[var3].anInt1416 = 1905149801 * var2.anInt2020;
         this.aClass115Array9273[var3].aBool1381 = true;
      }

   }

   void method2363(int var1, int var2) throws Exception_Sub4 {
      this.aClass184_Sub1_2026.method8453(var1, var2);
      if(this.anInterface24_2034 != null) {
         this.anInterface24_2034.method150((byte)1);
      }

   }

   public void method2510(Class433 var1) {
      this.aClass433_9260.method5083(var1);
      this.method8510();
   }

   public int[] method2397(int var1, int var2, int var3, int var4) {
      if(null == this.anIntArray9243) {
         throw new IllegalStateException("");
      } else {
         int[] var5 = new int[var4 * var3];
         int var6 = 0;

         for(int var7 = 0; var7 < var4; ++var7) {
            int var8 = var1 + this.anInt9277 * -2145294317 * (var2 + var7);

            for(int var9 = 0; var9 < var3; ++var9) {
               var5[var6++] = this.anIntArray9243[var8 + var9];
            }
         }

         return var5;
      }
   }

   Class115 method8502(Runnable var1) {
      for(int var2 = 0; var2 < 768566339 * this.anInt9249; ++var2) {
         if(this.aClass115Array9273[var2].aRunnable1382 == var1) {
            return this.aClass115Array9273[var2];
         }
      }

      return null;
   }

   public void method2516(Class177 var1) {
      this.method8508(this.anIntArray9243 != null, null != this.aFloatArray9246, false, var1);
   }

   public int method2415() {
      return -1;
   }

   void method8503(boolean var1, boolean var2, boolean var3, Class539_Sub1_Sub1 var4, int var5, int var6, float var7, int var8) {
      int var9 = var4.anInt11548;
      int var10 = var8;
      var8 <<= 1;
      if(var9 == -1) {
         this.method8512(var2, var5, var6, var7, var10, var4.anInt11547, 1);
      } else {
         if(var9 != -468477847 * this.anInt9263) {
            Class153 var11 = (Class153)this.aClass192_9259.method2765((long)var9);
            if(null == var11) {
               Class171 var12 = this.aClass169_2035.method2122(var9, (byte)-85);
               int[] var13 = this.method8517(var9);
               if(var13 == null) {
                  return;
               }

               int var14 = -1178632371 * var12.anInt1985;
               var11 = this.method2515(var13, 0, var14, var14, var14, (byte)3);
               this.aClass192_9259.method2768(var11, (long)var9);
            }

            this.anInt9263 = 1238595545 * var9;
            this.aClass153_9276 = var11;
         }

         ++var8;
         ((Class153_Sub1)this.aClass153_9276).method8377(var1, var2, var3, var5 - var10, var6 - var10, var7, var8, var8, 0, var4.anInt11547, 1, 1, false);
      }

   }

   void method8504(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, short var9, int var10, int var11, int var12) {
      if(var7 != 0 && var8 != 0) {
         if(var9 != -1) {
            Class171 var13 = this.aClass169_2035.method2122(var9, (byte)-20);
            if(!var13.aBool1981) {
               if(var9 != -468477847 * this.anInt9263) {
                  Class153 var14 = (Class153)this.aClass192_9259.method2765((long)var9);
                  if(null == var14) {
                     int[] var15 = this.method8517(var9);
                     if(var15 == null) {
                        return;
                     }

                     int var16 = var13.anInt1985 * -1178632371;
                     var14 = this.method2515(var15, 0, var16, var16, var16, (byte)3);
                     this.aClass192_9259.method2768(var14, (long)var9);
                  }

                  this.anInt9263 = var9 * 1238595545;
                  this.aClass153_9276 = var14;
               }

               ((Class153_Sub1)this.aClass153_9276).method8377(var1, var2, var3, var4 - var7, var5 - var8, var6, var7 << 1, var8 << 1, var11, var10, var12, 1, Class593.aClass593_7815 != var13.aClass593_1982);
               return;
            }
         }

         this.method8512(var2, var4, var5, var6, var7, var10, var12);
      }
   }

   void method2601(int var1, int var2, int var3, int var4, int var5) {
      if(this.anIntArray9243 != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var6 = var2 - var3;
         if(var6 < this.anInt9267 * 1511023883) {
            var6 = this.anInt9267 * 1511023883;
         }

         int var7 = 1 + var2 + var3;
         if(var7 > -288042733 * this.anInt9250) {
            var7 = -288042733 * this.anInt9250;
         }

         int var8 = var6;
         int var9 = var3 * var3;
         int var10 = 0;
         int var11 = var2 - var6;
         int var12 = var11 * var11;
         int var13 = var12 - var11;
         if(var2 > var7) {
            var2 = var7;
         }

         int var14 = var4 >>> 24;
         int var15;
         int var16;
         int var17;
         int var18;
         if(0 == var5 || var5 == 1 && 255 == var14) {
            while(var8 < var2) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               var15 = 1 + (var1 - var10);
               if(var15 < this.anInt9247 * -217416947) {
                  var15 = this.anInt9247 * -217416947;
               }

               var16 = var10 + var1;
               if(var16 > this.anInt9271 * 1270312011) {
                  var16 = this.anInt9271 * 1270312011;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 < var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            var10 = var3;
            var11 = var8 - var2;
            var13 = var11 * var11 + var9;
            var12 = var13 - var3;

            for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
               while(var13 > var9 && var12 > var9) {
                  var13 -= var10-- + var10;
                  var12 -= var10 + var10;
               }

               var15 = var1 - var10;
               if(var15 < -217416947 * this.anInt9247) {
                  var15 = -217416947 * this.anInt9247;
               }

               var16 = var10 + var1;
               if(var16 > 1270312011 * this.anInt9271 - 1) {
                  var16 = this.anInt9271 * 1270312011 - 1;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 <= var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var13 += var11 + var11;
            }

            return;
         } else {
            int var19;
            int var20;
            if(1 == var5) {
               var4 = ((var4 & '\uff00') * var14 >> 8 & '\uff00') + ((var4 & 16711935) * var14 >> 8 & 16711935) + (var14 << 24);

               for(var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var16 = var1 - var10 + 1;
                  if(var16 < -217416947 * this.anInt9247) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > this.anInt9271 * 1270312011) {
                     var17 = 1270312011 * this.anInt9271;
                  }

                  var18 = -2145294317 * this.anInt9277 * var8 + var16;

                  for(var19 = var16; var19 < var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = ((var20 & '\uff00') * var15 >> 8 & '\uff00') + ((var20 & 16711935) * var15 >> 8 & 16711935);
                     this.anIntArray9243[var18++] = var4 + var20;
                  }

                  ++var8;
                  var12 -= var11-- + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var16 = var1 - var10;
                  if(var16 < this.anInt9247 * -217416947) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > 1270312011 * this.anInt9271 - 1) {
                     var17 = 1270312011 * this.anInt9271 - 1;
                  }

                  var18 = var8 * -2145294317 * this.anInt9277 + var16;

                  for(var19 = var16; var19 <= var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = (var15 * (var20 & 16711935) >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                     this.anIntArray9243[var18++] = var20 + var4;
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            } else {
               if(2 != var5) {
                  throw new IllegalArgumentException();
               }

               int var21;
               while(var8 < var2) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var15 = 1 + (var1 - var10);
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var10 + var1;
                  if(var16 > this.anInt9271 * 1270312011) {
                     var16 = 1270312011 * this.anInt9271;
                  }

                  var17 = var15 + this.anInt9277 * -2145294317 * var8;

                  for(var18 = var15; var18 < var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var19 + var4;
                     var21 = (var4 & 16711935) + (var19 & 16711935);
                     var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var12 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var15 = var1 - var10;
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var1 + var10;
                  if(var16 > 1270312011 * this.anInt9271 - 1) {
                     var16 = 1270312011 * this.anInt9271 - 1;
                  }

                  var17 = var15 + var8 * -2145294317 * this.anInt9277;

                  for(var18 = var15; var18 <= var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var4 + var19;
                     var21 = (var19 & 16711935) + (var4 & 16711935);
                     var19 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            }
         }

      }
   }

   public void method2326(Class445 var1) {
      this.aClass445_9257 = var1;
      this.method8510();
   }

   public boolean method2403() {
      return false;
   }

   public boolean method2537() {
      return false;
   }

   public Class433 method2330() {
      return new Class433(this.aClass433_9260);
   }

   public void method2536(int var1, Class172 var2) {
      for(int var3 = 0; var3 < this.aClass115Array9273.length; ++var3) {
         this.aClass115Array9273[var3].anInt1380 = this.aClass115Array9273[var3].anInt1379 * -2138309751;
         this.aClass115Array9273[var3].anInt1412 = var1 * -915810697;
         this.aClass115Array9273[var3].anInt1379 = 1592157823 * var2.anInt2019;
         this.aClass115Array9273[var3].anInt1416 = 1905149801 * var2.anInt2020;
         this.aClass115Array9273[var3].aBool1381 = true;
      }

   }

   public void method2364(int var1, float var2, float var3, float var4, float var5, float var6) {
      this.anInt9254 = (int)(65535.0F * var2) * -1648925117;
      this.anInt9255 = 140935795 * (int)(65535.0F * var3);
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var4 * var4 + var6 * var6));
      this.anInt9251 = 901291439 * (int)(var4 * 65535.0F / var7);
      this.anInt9252 = (int)(var5 * 65535.0F / var7) * -292802653;
      this.anInt9253 = -773368501 * (int)(var6 * 65535.0F / var7);
   }

   void method8505(int var1) {
      this.anInt9249 = 1084557419 * var1;
      this.aClass115Array9273 = new Class115[this.anInt9249 * 768566339];

      for(int var2 = 0; var2 < this.anInt9249 * 768566339; ++var2) {
         this.aClass115Array9273[var2] = new Class115(this);
      }

   }

   public void method2333(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aClass115Array9273.length; ++var4) {
         Class115 var5 = this.aClass115Array9273[var4];
         var5.anInt1379 = (var1 & 16777215) * 1466571737;
         int var6 = 1196864617 * var5.anInt1379 >>> 16 & 255;
         if(var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.anInt1379 * 1196864617 >> 8 & 255;
         if(var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.anInt1379 * 1196864617 & 255;
         if(var8 < 2) {
            var8 = 2;
         }

         var5.anInt1379 = (var6 << 16 | var7 << 8 | var8) * 1466571737;
         if(var2 < 0) {
            var5.aBool1376 = false;
         } else {
            var5.aBool1376 = true;
         }
      }

   }

   public Class148 method2323(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new Class148_Sub1(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public Class178 method2338(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return null;
   }

   public void method2621(Class178 var1) {
   }

   public void method2340(int var1, int var2, int var3, int var4) {
   }

   public void method2341(int var1, int var2) {
   }

   public boolean method2275() {
      return false;
   }

   public Class176 method2541(int[] var1) {
      return null;
   }

   public void method2455(float var1, float var2, float var3, float var4, float var5) {
   }

   public Class176 method2345(int[] var1) {
      return null;
   }

   public Class153 method2311(int var1, int var2, int var3, int var4, boolean var5) {
      if(null == this.anIntArray9243) {
         throw new IllegalStateException("");
      } else {
         int[] var6 = new int[var4 * var3];
         int var7 = var1 + this.anInt9277 * -2145294317 * var2;
         int var8 = -2145294317 * this.anInt9277 - var3;

         for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var3 * var9;

            for(int var11 = 0; var11 < var3; ++var11) {
               var6[var10 + var11] = this.anIntArray9243[var7++];
            }

            var7 += var8;
         }

         if(var5) {
            return new Class153_Sub1_Sub1(this, var6, var3, var4);
         } else {
            return new Class153_Sub1_Sub2(this, var6, var3, var4);
         }
      }
   }

   public void method2347(Class176 var1, float var2, Class176 var3, float var4, Class176 var5, float var6) {
   }

   public Class526_Sub8 method2470(int var1) {
      return null;
   }

   public void method2534(int var1, int var2) {
   }

   public boolean method2548() {
      return false;
   }

   public void method2542(int var1, float var2, float var3, float var4, float var5, float var6) {
      this.anInt9254 = (int)(65535.0F * var2) * -1648925117;
      this.anInt9255 = 140935795 * (int)(65535.0F * var3);
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var4 * var4 + var6 * var6));
      this.anInt9251 = 901291439 * (int)(var4 * 65535.0F / var7);
      this.anInt9252 = (int)(var5 * 65535.0F / var7) * -292802653;
      this.anInt9253 = -773368501 * (int)(var6 * 65535.0F / var7);
   }

   public Class526_Sub8 method2304(int var1) {
      return null;
   }

   public void method2353(int var1, Class172 var2) {
      Class115 var3 = this.method8502(Thread.currentThread());
      var3.anInt1412 = -915810697 * var1;
      var3.anInt1379 = 1592157823 * var2.anInt2019;
      var3.anInt1416 = 1905149801 * var2.anInt2020;
   }

   public Class445 method2372() {
      return new Class445(this.aClass445_9257);
   }

   public void method2285(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      boolean var14 = this.anIntArray9243 != null;
      boolean var15 = null != this.aFloatArray9246;
      if(var14 || var15) {
         Class115 var16 = this.method8502(Thread.currentThread());
         Class121 var17 = var16.aClass121_1387;
         var17.aBool1530 = false;
         var1 -= -217416947 * this.anInt9247;
         var4 -= this.anInt9247 * -217416947;
         var7 -= this.anInt9247 * -217416947;
         var2 -= this.anInt9267 * 1511023883;
         var5 -= this.anInt9267 * 1511023883;
         var8 -= this.anInt9267 * 1511023883;
         var17.aBool1556 = var1 < 0 || var1 > var17.anInt1542 || var4 < 0 || var4 > var17.anInt1542 || var7 < 0 || var7 > var17.anInt1542;
         int var18 = var10 >>> 24;
         if(var13 == 0 || var13 == 1 && 255 == var18) {
            var17.anInt1543 = 0;
            var17.aBool1531 = false;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         } else if(var13 == 1) {
            var17.anInt1543 = 255 - var18;
            var17.aBool1531 = false;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         } else {
            if(var13 != 2) {
               throw new IllegalArgumentException();
            }

            var17.anInt1543 = 128;
            var17.aBool1531 = true;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         }

         var17.aBool1530 = true;
      }
   }

   void method2337(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void method2355(float var1, float var2, float var3, float[] var4) {
      float var5 = this.aClass433_9240.aFloatArray4841[2] * var1 + this.aClass433_9240.aFloatArray4841[14] + var2 * this.aClass433_9240.aFloatArray4841[6] + var3 * this.aClass433_9240.aFloatArray4841[10];
      float var6 = var2 * this.aClass433_9240.aFloatArray4841[7] + this.aClass433_9240.aFloatArray4841[15] + var1 * this.aClass433_9240.aFloatArray4841[3] + this.aClass433_9240.aFloatArray4841[11] * var3;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = this.aClass433_9240.aFloatArray4841[8] * var3 + var2 * this.aClass433_9240.aFloatArray4841[4] + this.aClass433_9240.aFloatArray4841[12] + var1 * this.aClass433_9240.aFloatArray4841[0];
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = var3 * this.aClass433_9240.aFloatArray4841[9] + var2 * this.aClass433_9240.aFloatArray4841[5] + this.aClass433_9240.aFloatArray4841[1] * var1 + this.aClass433_9240.aFloatArray4841[13];
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = var3 * this.aClass433_9258.aFloatArray4841[10] + this.aClass433_9258.aFloatArray4841[6] * var2 + this.aClass433_9258.aFloatArray4841[14] + this.aClass433_9258.aFloatArray4841[2] * var1;
               var4[0] = this.aFloat9278 + var7 * this.aFloat9266 / var6;
               var4[1] = this.aFloat9269 + this.aFloat9268 * var8 / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   public Class184_Sub2 method2257() {
      return new Class184_Sub2_Sub3(this);
   }

   Interface21 method8506(int var1, int var2) {
      return new Class108(var1, var2);
   }

   public void method2616(int var1, Class526_Sub16[] var2) {
   }

   public Interface23 method2263(int var1, int var2) {
      return new Class130(var1, var2);
   }

   public void method2331(float var1) {
      this.anInt9256 = 1515946617 * (int)(65535.0F * var1);
   }

   public boolean method2588() {
      return false;
   }

   public Class157 method2599() {
      return new Class157(0, "Pure Java", 1, "CPU", 0L, false);
   }

   public Class157 method2362() {
      return new Class157(0, "Pure Java", 1, "CPU", 0L, false);
   }

   public boolean method2386() {
      return true;
   }

   Class593 method8507(int var1) {
      return this.aClass169_2035.method2122(var1, (byte)10).aClass593_1982;
   }

   public boolean method2378() {
      return false;
   }

   void method2366() {
      if(this.aBool9242) {
         Class596.method7055(true, false, -1768396800);
         this.aBool9242 = false;
      }

      this.aBool9275 = true;
   }

   public void method2498(int var1) {
      int var2 = var1 - this.anInt9244 * -2044542231;

      for(Class526_Sub22 var3 = (Class526_Sub22)this.aClass192_9274.method2773(884347114); var3 != null; var3 = (Class526_Sub22)this.aClass192_9274.method2775(1473958004)) {
         if(var3.aBool10537) {
            var3.anInt10535 += var2;
            int var4 = var3.anInt10535 / 50;
            if(var4 > 0) {
               Class171 var5 = this.aClass169_2035.method2122(var3.anInt10533, (byte)4);
               float var6 = (float)(var5.anInt1985 * -1178632371);
               var3.method9448((int)((float)var2 / 1000.0F * (float)var5.aByte1986 / 64.0F * var6), (int)((float)var2 / 1000.0F * (float)var5.aByte1963 / 64.0F * var6));
               var3.anInt10535 -= 50 * var4;
            }

            var3.aBool10537 = false;
         }
      }

      this.anInt9244 = -183487143 * var1;
      this.aClass192_9259.method2769(5, (byte)-38);
      this.aClass192_9274.method2769(5, (byte)-107);
   }

   public void method2564(int var1) {
      int var2 = var1 - this.anInt9244 * -2044542231;

      for(Class526_Sub22 var3 = (Class526_Sub22)this.aClass192_9274.method2773(956944457); var3 != null; var3 = (Class526_Sub22)this.aClass192_9274.method2775(1550921231)) {
         if(var3.aBool10537) {
            var3.anInt10535 += var2;
            int var4 = var3.anInt10535 / 50;
            if(var4 > 0) {
               Class171 var5 = this.aClass169_2035.method2122(var3.anInt10533, (byte)71);
               float var6 = (float)(var5.anInt1985 * -1178632371);
               var3.method9448((int)((float)var2 / 1000.0F * (float)var5.aByte1986 / 64.0F * var6), (int)((float)var2 / 1000.0F * (float)var5.aByte1963 / 64.0F * var6));
               var3.anInt10535 -= 50 * var4;
            }

            var3.aBool10537 = false;
         }
      }

      this.anInt9244 = -183487143 * var1;
      this.aClass192_9259.method2769(5, (byte)-24);
      this.aClass192_9274.method2769(5, (byte)-21);
   }

   public void method2461(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(null != this.anIntArray9243) {
         Class115 var8 = this.method8502(Thread.currentThread());
         Class121 var9 = var8.aClass121_1387;
         int var10 = var3 - var1;
         int var11 = var4 - var2;
         int var12 = var10 >= 0?var10:-var10;
         int var13 = var11 >= 0?var11:-var11;
         int var14 = var12;
         if(var12 < var13) {
            var14 = var13;
         }

         if(0 != var14) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            var10 += var15 >> 16;
            var11 += var16 >> 16;
            if(var16 <= var15) {
               var15 = -var15;
            } else {
               var16 = -var16;
            }

            int var17 = var6 * var16 >> 17;
            int var18 = var6 * var16 + 1 >> 17;
            int var19 = var6 * var15 >> 17;
            int var20 = var15 * var6 + 1 >> 17;
            var1 -= var9.method1453();
            var2 -= var9.method1454();
            int var21 = var17 + var1;
            int var22 = var1 - var18;
            int var23 = var10 + var1 - var18;
            int var24 = var10 + var1 + var17;
            int var25 = var2 + var19;
            int var26 = var2 - var20;
            int var27 = var11 + var2 - var20;
            int var28 = var11 + var2 + var19;
            if(0 == var7) {
               var9.anInt1543 = 0;
            } else {
               if(1 != var7) {
                  throw new IllegalArgumentException();
               }

               var9.anInt1543 = 255 - (var5 >>> 24);
            }

            this.method2328(false);
            var9.aBool1556 = var21 < 0 || var21 > var9.anInt1542 || var22 < 0 || var22 > var9.anInt1542 || var23 < 0 || var23 > var9.anInt1542;
            var9.method1459(true, false, false, (float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0F, 100.0F, 100.0F, var5);
            var9.aBool1556 = var21 < 0 || var21 > var9.anInt1542 || var23 < 0 || var23 > var9.anInt1542 || var24 < 0 || var24 > var9.anInt1542;
            var9.method1459(true, false, false, (float)var25, (float)var27, (float)var28, (float)var21, (float)var23, (float)var24, 100.0F, 100.0F, 100.0F, var5);
            this.method2328(true);
         }
      }
   }

   public int method2369() {
      return 0;
   }

   public void method2297(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(null != this.anIntArray9243) {
         var3 -= var1;
         var4 -= var2;
         int var10;
         if(var4 == 0) {
            if(var3 >= 0) {
               this.method8499(var1, var2, 1 + var3, var5, var6, var7, var8, var9);
            } else {
               var10 = var7 + var8;
               var9 %= var10;
               var9 = var7 + var10 - var9 - (-var3 + 1) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               this.method8499(var1 + var3, var2, 1 + -var3, var5, var6, var7, var8, var9);
            }

         } else if(var3 == 0) {
            if(var4 >= 0) {
               this.method8500(var1, var2, 1 + var4, var5, var6, var7, var8, var9);
            } else {
               var10 = var8 + var7;
               var9 %= var10;
               var9 = var7 + var10 - var9 - (-var4 + 1) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               this.method8500(var1, var4 + var2, 1 + -var4, var5, var6, var7, var8, var9);
            }

         } else {
            var9 <<= 8;
            var7 <<= 8;
            var8 <<= 8;
            var10 = var8 + var7;
            var9 %= var10;
            int var11;
            int var12;
            if(var3 + var4 < 0) {
               var11 = (int)(Math.sqrt((double)(var4 * var4 + var3 * var3)) * 256.0D);
               var12 = var11 % var10;
               var9 = var7 + var10 - var9 - var12;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var11 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
               var3 += var1;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)(65536 + (var11 >> 8) * (var11 >> 8)));
               if(0 != var6 && (var6 != 1 || 255 != var12)) {
                  if(1 == var6) {
                     var5 = ((var5 & 16711935) * var12 >> 8 & 16711935) + ((var5 & '\uff00') * var12 >> 8 & '\uff00') + (var12 << 24);

                     for(var14 = 256 - var12; var1 <= var3; var9 %= var10) {
                        var15 = var2 >> 16;
                        if(var1 >= this.anInt9247 * -217416947 && var1 < 1270312011 * this.anInt9271 && var15 >= this.anInt9267 * 1511023883 && var15 < -288042733 * this.anInt9250 && var9 < var7) {
                           var16 = var1 + var15 * -2145294317 * this.anInt9277;
                           var17 = this.anIntArray9243[var16];
                           var17 = (var14 * (var17 & '\uff00') >> 8 & '\uff00') + (var14 * (var17 & 16711935) >> 8 & 16711935);
                           this.anIntArray9243[var16] = var5 + var17;
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                     }
                  } else {
                     if(2 != var6) {
                        throw new IllegalArgumentException();
                     }

                     while(var1 <= var3) {
                        var14 = var2 >> 16;
                        if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011 && var14 >= this.anInt9267 * 1511023883 && var14 < -288042733 * this.anInt9250 && var9 < var7) {
                           var15 = var14 * this.anInt9277 * -2145294317 + var1;
                           var16 = this.anIntArray9243[var15];
                           var17 = var16 + var5;
                           var18 = (var16 & 16711935) + (var5 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           this.anIntArray9243[var15] = var17 - var16 | var16 - (var16 >>> 8);
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                        var9 %= var10;
                     }
                  }
               } else {
                  while(var1 <= var3) {
                     var14 = var2 >> 16;
                     if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var14 >= this.anInt9267 * 1511023883 && var14 < -288042733 * this.anInt9250 && var9 < var7) {
                        this.anIntArray9243[var1 + var14 * this.anInt9277 * -2145294317] = var5;
                     }

                     var2 += var11;
                     ++var1;
                     var9 += var13;
                     var9 %= var10;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var11 = (int)Math.floor(0.5D + (double)var3 / (double)var4);
               var4 += var2;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)(65536 + (var11 >> 8) * (var11 >> 8)));
               if(0 == var6 || 1 == var6 && var12 == 255) {
                  while(var2 <= var4) {
                     var14 = var1 >> 16;
                     if(var2 >= 1511023883 * this.anInt9267 && var2 < this.anInt9250 * -288042733 && var14 >= this.anInt9247 * -217416947 && var14 < 1270312011 * this.anInt9271 && var9 < var7) {
                        this.anIntArray9243[var14 + var2 * -2145294317 * this.anInt9277] = var5;
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                     var9 %= var10;
                  }
               } else if(var6 == 1) {
                  var5 = (var12 * (var5 & '\uff00') >> 8 & '\uff00') + (var12 * (var5 & 16711935) >> 8 & 16711935) + (var12 << 24);

                  for(var14 = 256 - var12; var2 <= var4; var9 %= var10) {
                     var15 = var1 >> 16;
                     if(var2 >= this.anInt9267 * 1511023883 && var2 < -288042733 * this.anInt9250 && var15 >= -217416947 * this.anInt9247 && var15 < 1270312011 * this.anInt9271 && var9 < var7) {
                        var16 = -2145294317 * this.anInt9277 * var2 + var15;
                        var17 = this.anIntArray9243[var16];
                        var17 = ((var17 & 16711935) * var14 >> 8 & 16711935) + (var14 * (var17 & '\uff00') >> 8 & '\uff00');
                        this.anIntArray9243[var15 + var2 * -2145294317 * this.anInt9277] = var17 + var5;
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var2 <= var4) {
                     var14 = var1 >> 16;
                     if(var2 >= this.anInt9267 * 1511023883 && var2 < this.anInt9250 * -288042733 && var14 >= -217416947 * this.anInt9247 && var14 < 1270312011 * this.anInt9271 && var9 < var7) {
                        var15 = -2145294317 * this.anInt9277 * var2 + var14;
                        var16 = this.anIntArray9243[var15];
                        var17 = var5 + var16;
                        var18 = (var16 & 16711935) + (var5 & 16711935);
                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                        this.anIntArray9243[var15] = var17 - var16 | var16 - (var16 >>> 8);
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                     var9 %= var10;
                  }
               }
            }

         }
      }
   }

   void method2351(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void method2494(int var1) {
      Class168_Sub3.anInt9372 = var1;
      Class168_Sub3.anInt9366 = var1;
      if(this.anInt9249 * 768566339 > 1) {
         throw new IllegalStateException();
      } else {
         this.method8505(this.anInt9249 * 768566339);
         this.method8511(0);
      }
   }

   void method2554(int var1, int var2, int var3, int var4, int var5) {
      if(this.anIntArray9243 != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var6 = var2 - var3;
         if(var6 < this.anInt9267 * 1511023883) {
            var6 = this.anInt9267 * 1511023883;
         }

         int var7 = 1 + var2 + var3;
         if(var7 > -288042733 * this.anInt9250) {
            var7 = -288042733 * this.anInt9250;
         }

         int var8 = var6;
         int var9 = var3 * var3;
         int var10 = 0;
         int var11 = var2 - var6;
         int var12 = var11 * var11;
         int var13 = var12 - var11;
         if(var2 > var7) {
            var2 = var7;
         }

         int var14 = var4 >>> 24;
         int var15;
         int var16;
         int var17;
         int var18;
         if(0 == var5 || var5 == 1 && 255 == var14) {
            while(var8 < var2) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               var15 = 1 + (var1 - var10);
               if(var15 < this.anInt9247 * -217416947) {
                  var15 = this.anInt9247 * -217416947;
               }

               var16 = var10 + var1;
               if(var16 > this.anInt9271 * 1270312011) {
                  var16 = this.anInt9271 * 1270312011;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 < var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            var10 = var3;
            var11 = var8 - var2;
            var13 = var11 * var11 + var9;
            var12 = var13 - var3;

            for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
               while(var13 > var9 && var12 > var9) {
                  var13 -= var10-- + var10;
                  var12 -= var10 + var10;
               }

               var15 = var1 - var10;
               if(var15 < -217416947 * this.anInt9247) {
                  var15 = -217416947 * this.anInt9247;
               }

               var16 = var10 + var1;
               if(var16 > 1270312011 * this.anInt9271 - 1) {
                  var16 = this.anInt9271 * 1270312011 - 1;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 <= var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var13 += var11 + var11;
            }

            return;
         } else {
            int var19;
            int var20;
            if(1 == var5) {
               var4 = ((var4 & '\uff00') * var14 >> 8 & '\uff00') + ((var4 & 16711935) * var14 >> 8 & 16711935) + (var14 << 24);

               for(var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var16 = var1 - var10 + 1;
                  if(var16 < -217416947 * this.anInt9247) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > this.anInt9271 * 1270312011) {
                     var17 = 1270312011 * this.anInt9271;
                  }

                  var18 = -2145294317 * this.anInt9277 * var8 + var16;

                  for(var19 = var16; var19 < var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = ((var20 & '\uff00') * var15 >> 8 & '\uff00') + ((var20 & 16711935) * var15 >> 8 & 16711935);
                     this.anIntArray9243[var18++] = var4 + var20;
                  }

                  ++var8;
                  var12 -= var11-- + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var16 = var1 - var10;
                  if(var16 < this.anInt9247 * -217416947) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > 1270312011 * this.anInt9271 - 1) {
                     var17 = 1270312011 * this.anInt9271 - 1;
                  }

                  var18 = var8 * -2145294317 * this.anInt9277 + var16;

                  for(var19 = var16; var19 <= var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = (var15 * (var20 & 16711935) >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                     this.anIntArray9243[var18++] = var20 + var4;
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            } else {
               if(2 != var5) {
                  throw new IllegalArgumentException();
               }

               int var21;
               while(var8 < var2) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var15 = 1 + (var1 - var10);
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var10 + var1;
                  if(var16 > this.anInt9271 * 1270312011) {
                     var16 = 1270312011 * this.anInt9271;
                  }

                  var17 = var15 + this.anInt9277 * -2145294317 * var8;

                  for(var18 = var15; var18 < var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var19 + var4;
                     var21 = (var4 & 16711935) + (var19 & 16711935);
                     var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var12 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var15 = var1 - var10;
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var1 + var10;
                  if(var16 > 1270312011 * this.anInt9271 - 1) {
                     var16 = 1270312011 * this.anInt9271 - 1;
                  }

                  var17 = var15 + var8 * -2145294317 * this.anInt9277;

                  for(var18 = var15; var18 <= var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var4 + var19;
                     var21 = (var19 & 16711935) + (var4 & 16711935);
                     var19 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            }
         }

      }
   }

   public void method2611() {
   }

   public Class163 method2491(Class1 var1, Class173[] var2, boolean var3) {
      int[] var4 = new int[var2.length];
      int[] var5 = new int[var2.length];
      boolean var6 = false;
      boolean var7 = false;

      for(int var8 = 0; var8 < var2.length; ++var8) {
         var4[var8] = var2[var8].method2168();
         var5[var8] = var2[var8].method2175();
         if(var2[var8].method2224()) {
            var6 = true;
         }

         if(var2[var8].method2166()) {
            var7 = true;
         }
      }

      if(var3) {
         if(var7) {
            if(var6) {
               return new Class163_Sub1(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            } else {
               return new Class163_Sub6(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            }
         } else if(var6) {
            return new Class163_Sub1(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         } else {
            return new Class163_Sub6(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         }
      } else if(var7) {
         if(var6) {
            throw new IllegalArgumentException("");
         } else {
            return new Class163_Sub2(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
         }
      } else {
         return new Class163_Sub3(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
      }
   }

   public Interface21 method2569(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return this.method8506(var1, var2);
   }

   public void method2469(Class445 var1, Class164 var2, Class437 var3) {
      Class433 var4 = this.method2318();
      var4.method5110(var1);
      var4.method5085(this.aClass433_9240);
      var2.method1928(var3, this.aClass433_9260, var4, this.aFloat9278, this.aFloat9269, this.aFloat9266, this.aFloat9268);
   }

   public boolean method2371() {
      return false;
   }

   public boolean method2385() {
      return false;
   }

   public boolean method2373() {
      return false;
   }

   public boolean method2374() {
      return false;
   }

   public boolean method2375() {
      return false;
   }

   public boolean method2235() {
      return false;
   }

   public boolean method2482() {
      return false;
   }

   public void method2582(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      boolean var14 = this.anIntArray9243 != null;
      boolean var15 = null != this.aFloatArray9246;
      if(var14 || var15) {
         Class115 var16 = this.method8502(Thread.currentThread());
         Class121 var17 = var16.aClass121_1387;
         var17.aBool1530 = false;
         var1 -= -217416947 * this.anInt9247;
         var4 -= this.anInt9247 * -217416947;
         var7 -= this.anInt9247 * -217416947;
         var2 -= this.anInt9267 * 1511023883;
         var5 -= this.anInt9267 * 1511023883;
         var8 -= this.anInt9267 * 1511023883;
         var17.aBool1556 = var1 < 0 || var1 > var17.anInt1542 || var4 < 0 || var4 > var17.anInt1542 || var7 < 0 || var7 > var17.anInt1542;
         int var18 = var10 >>> 24;
         if(var13 == 0 || var13 == 1 && 255 == var18) {
            var17.anInt1543 = 0;
            var17.aBool1531 = false;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         } else if(var13 == 1) {
            var17.anInt1543 = 255 - var18;
            var17.aBool1531 = false;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         } else {
            if(var13 != 2) {
               throw new IllegalArgumentException();
            }

            var17.anInt1543 = 128;
            var17.aBool1531 = true;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         }

         var17.aBool1530 = true;
      }
   }

   public boolean method2379() {
      return false;
   }

   public boolean method2381() {
      return false;
   }

   public boolean method2629() {
      return false;
   }

   public boolean method2383() {
      return false;
   }

   public boolean method2384() {
      return false;
   }

   void method8508(boolean var1, boolean var2, boolean var3, Class177 var4) {
      Class115 var5 = this.method8502(Thread.currentThread());

      for(Class539_Sub1_Sub1 var6 = (Class539_Sub1_Sub1)var4.aClass687_2068.method8064(172890149); null != var6; var6 = (Class539_Sub1_Sub1)var4.aClass687_2068.method8061(1234746131)) {
         int var7 = var6.anInt11552 >> 12;
         int var8 = var6.anInt11545 >> 12;
         int var9 = var6.anInt11550 >> 12;
         float var10 = this.aClass433_9240.aFloatArray4841[14] + this.aClass433_9240.aFloatArray4841[6] * (float)var8 + (float)var7 * this.aClass433_9240.aFloatArray4841[2] + this.aClass433_9240.aFloatArray4841[10] * (float)var9;
         float var11 = this.aClass433_9240.aFloatArray4841[7] * (float)var8 + (float)var7 * this.aClass433_9240.aFloatArray4841[3] + (float)var9 * this.aClass433_9240.aFloatArray4841[11] + this.aClass433_9240.aFloatArray4841[15];
         if(var10 >= -var11) {
            float var12 = this.aFloat9270 * var10 / var11 + this.aFloat9241;
            if(var10 <= var5.aFloat1377) {
               float var13 = this.aClass433_9240.aFloatArray4841[0] * (float)var7 + this.aClass433_9240.aFloatArray4841[4] * (float)var8 + (float)var9 * this.aClass433_9240.aFloatArray4841[8] + this.aClass433_9240.aFloatArray4841[12];
               float var14 = (float)var8 * this.aClass433_9240.aFloatArray4841[5] + (float)var7 * this.aClass433_9240.aFloatArray4841[1] + this.aClass433_9240.aFloatArray4841[9] * (float)var9 + this.aClass433_9240.aFloatArray4841[13];
               if(var13 >= -var11 && var13 <= var11 && var14 >= -var11 && var14 <= var11) {
                  float var15 = (float)var6.anInt11551 / 4096.0F;
                  float var16 = var13 + this.aClass433_9260.aFloatArray4841[0] * var15;
                  float var17 = var11 + this.aClass433_9260.aFloatArray4841[3] * var15;
                  float var18 = this.aFloat9278 + var13 * this.aFloat9266 / var11;
                  float var19 = this.aFloat9268 * var14 / var11 + this.aFloat9269;
                  float var20 = this.aFloat9278 + var16 * this.aFloat9266 / var17;
                  this.method8503(var1, var2, var3, var6, (int)var18, (int)var19, var12, (int)(var20 < var18?var18 - var20:var20 - var18));
               }
            }
         }
      }

   }

   public void method2453(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(null != this.anIntArray9243) {
         var3 -= var1;
         var4 -= var2;
         int var10;
         if(var4 == 0) {
            if(var3 >= 0) {
               this.method8499(var1, var2, 1 + var3, var5, var6, var7, var8, var9);
            } else {
               var10 = var7 + var8;
               var9 %= var10;
               var9 = var7 + var10 - var9 - (-var3 + 1) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               this.method8499(var1 + var3, var2, 1 + -var3, var5, var6, var7, var8, var9);
            }

         } else if(var3 == 0) {
            if(var4 >= 0) {
               this.method8500(var1, var2, 1 + var4, var5, var6, var7, var8, var9);
            } else {
               var10 = var8 + var7;
               var9 %= var10;
               var9 = var7 + var10 - var9 - (-var4 + 1) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               this.method8500(var1, var4 + var2, 1 + -var4, var5, var6, var7, var8, var9);
            }

         } else {
            var9 <<= 8;
            var7 <<= 8;
            var8 <<= 8;
            var10 = var8 + var7;
            var9 %= var10;
            int var11;
            int var12;
            if(var3 + var4 < 0) {
               var11 = (int)(Math.sqrt((double)(var4 * var4 + var3 * var3)) * 256.0D);
               var12 = var11 % var10;
               var9 = var7 + var10 - var9 - var12;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var11 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
               var3 += var1;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)(65536 + (var11 >> 8) * (var11 >> 8)));
               if(0 != var6 && (var6 != 1 || 255 != var12)) {
                  if(1 == var6) {
                     var5 = ((var5 & 16711935) * var12 >> 8 & 16711935) + ((var5 & '\uff00') * var12 >> 8 & '\uff00') + (var12 << 24);

                     for(var14 = 256 - var12; var1 <= var3; var9 %= var10) {
                        var15 = var2 >> 16;
                        if(var1 >= this.anInt9247 * -217416947 && var1 < 1270312011 * this.anInt9271 && var15 >= this.anInt9267 * 1511023883 && var15 < -288042733 * this.anInt9250 && var9 < var7) {
                           var16 = var1 + var15 * -2145294317 * this.anInt9277;
                           var17 = this.anIntArray9243[var16];
                           var17 = (var14 * (var17 & '\uff00') >> 8 & '\uff00') + (var14 * (var17 & 16711935) >> 8 & 16711935);
                           this.anIntArray9243[var16] = var5 + var17;
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                     }
                  } else {
                     if(2 != var6) {
                        throw new IllegalArgumentException();
                     }

                     while(var1 <= var3) {
                        var14 = var2 >> 16;
                        if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011 && var14 >= this.anInt9267 * 1511023883 && var14 < -288042733 * this.anInt9250 && var9 < var7) {
                           var15 = var14 * this.anInt9277 * -2145294317 + var1;
                           var16 = this.anIntArray9243[var15];
                           var17 = var16 + var5;
                           var18 = (var16 & 16711935) + (var5 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           this.anIntArray9243[var15] = var17 - var16 | var16 - (var16 >>> 8);
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                        var9 %= var10;
                     }
                  }
               } else {
                  while(var1 <= var3) {
                     var14 = var2 >> 16;
                     if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var14 >= this.anInt9267 * 1511023883 && var14 < -288042733 * this.anInt9250 && var9 < var7) {
                        this.anIntArray9243[var1 + var14 * this.anInt9277 * -2145294317] = var5;
                     }

                     var2 += var11;
                     ++var1;
                     var9 += var13;
                     var9 %= var10;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var11 = (int)Math.floor(0.5D + (double)var3 / (double)var4);
               var4 += var2;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)(65536 + (var11 >> 8) * (var11 >> 8)));
               if(0 == var6 || 1 == var6 && var12 == 255) {
                  while(var2 <= var4) {
                     var14 = var1 >> 16;
                     if(var2 >= 1511023883 * this.anInt9267 && var2 < this.anInt9250 * -288042733 && var14 >= this.anInt9247 * -217416947 && var14 < 1270312011 * this.anInt9271 && var9 < var7) {
                        this.anIntArray9243[var14 + var2 * -2145294317 * this.anInt9277] = var5;
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                     var9 %= var10;
                  }
               } else if(var6 == 1) {
                  var5 = (var12 * (var5 & '\uff00') >> 8 & '\uff00') + (var12 * (var5 & 16711935) >> 8 & 16711935) + (var12 << 24);

                  for(var14 = 256 - var12; var2 <= var4; var9 %= var10) {
                     var15 = var1 >> 16;
                     if(var2 >= this.anInt9267 * 1511023883 && var2 < -288042733 * this.anInt9250 && var15 >= -217416947 * this.anInt9247 && var15 < 1270312011 * this.anInt9271 && var9 < var7) {
                        var16 = -2145294317 * this.anInt9277 * var2 + var15;
                        var17 = this.anIntArray9243[var16];
                        var17 = ((var17 & 16711935) * var14 >> 8 & 16711935) + (var14 * (var17 & '\uff00') >> 8 & '\uff00');
                        this.anIntArray9243[var15 + var2 * -2145294317 * this.anInt9277] = var17 + var5;
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var2 <= var4) {
                     var14 = var1 >> 16;
                     if(var2 >= this.anInt9267 * 1511023883 && var2 < this.anInt9250 * -288042733 && var14 >= -217416947 * this.anInt9247 && var14 < 1270312011 * this.anInt9271 && var9 < var7) {
                        var15 = -2145294317 * this.anInt9277 * var2 + var14;
                        var16 = this.anIntArray9243[var15];
                        var17 = var5 + var16;
                        var18 = (var16 & 16711935) + (var5 & 16711935);
                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                        this.anIntArray9243[var15] = var17 - var16 | var16 - (var16 >>> 8);
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                     var9 %= var10;
                  }
               }
            }

         }
      }
   }

   public boolean method2387() {
      return true;
   }

   public void method2473(Class526_Sub8 var1) {
   }

   public String method2389() {
      return "";
   }

   public String method2602() {
      return "";
   }

   public int[] method2390() {
      return null;
   }

   int method8509(int var1) {
      return this.aClass169_2035.method2122(var1, (byte)103).anInt1985 * -1178632371;
   }

   public int method2295(int var1, int var2) {
      return var1 | var2;
   }

   public void method2393(boolean var1) {
   }

   public void method2617(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != this.anIntArray9243) {
         if(var1 < this.anInt9247 * -217416947) {
            var3 -= this.anInt9247 * -217416947 - var1;
            var1 = -217416947 * this.anInt9247;
         }

         if(var2 < this.anInt9267 * 1511023883) {
            var4 -= this.anInt9267 * 1511023883 - var2;
            var2 = 1511023883 * this.anInt9267;
         }

         if(var3 + var1 > this.anInt9271 * 1270312011) {
            var3 = 1270312011 * this.anInt9271 - var1;
         }

         if(var2 + var4 > -288042733 * this.anInt9250) {
            var4 = this.anInt9250 * -288042733 - var2;
         }

         if(var3 > 0 && var4 > 0 && var1 <= 1270312011 * this.anInt9271 && var2 <= this.anInt9250 * -288042733) {
            int var7 = this.anInt9277 * -2145294317 - var3;
            int var8 = var1 + this.anInt9277 * -2145294317 * var2;
            int var9 = var5 >>> 24;
            int var10;
            int var11;
            int var12;
            if(var6 != 0 && (1 != var6 || var9 != 255)) {
               int var13;
               if(var6 == 1) {
                  var5 = (var9 * ((var5 & -16711936) >>> 8) & -16711936) + (var9 * (var5 & 16711935) >> 8 & 16711935);
                  var10 = 256 - var9;

                  for(var11 = 0; var11 < var4; ++var11) {
                     for(var12 = -var3; var12 < 0; ++var12) {
                        var13 = this.anIntArray9243[var8];
                        var13 = (var10 * (var13 & 16711935) >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                        this.anIntArray9243[var8++] = var5 + var13;
                     }

                     var8 += var7;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  for(var10 = 0; var10 < var4; ++var10) {
                     for(var11 = -var3; var11 < 0; ++var11) {
                        var12 = this.anIntArray9243[var8];
                        var13 = var12 + var5;
                        int var14 = (var5 & 16711935) + (var12 & 16711935);
                        var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                        this.anIntArray9243[var8++] = var13 - var12 | var12 - (var12 >>> 8);
                     }

                     var8 += var7;
                  }
               }
            } else {
               var10 = var3 >> 3;
               var11 = var3 & 7;
               var3 = var8 - 1;

               for(var12 = -var4; var12 < 0; ++var12) {
                  if(var10 > 0) {
                     var1 = var10;

                     do {
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  if(var11 > 0) {
                     var1 = var11;

                     do {
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  var3 += var7;
               }
            }

         }
      }
   }

   Class184_Sub1 method2619(Canvas var1, int var2, int var3) {
      return Class481.method5764(this, var1, var2, var3, 1124943306);
   }

   public boolean method2308() {
      return false;
   }

   public int method2522() {
      return 0;
   }

   public void method2399() {
   }

   public void method2400() {
   }

   public void method2266(int[] var1) {
      var1[0] = -2145294317 * this.anInt9277;
      var1[1] = this.anInt9245 * 1496863415;
   }

   public void method2402(int[] var1) {
      var1[0] = -2145294317 * this.anInt9277;
      var1[1] = this.anInt9245 * 1496863415;
   }

   public Class433 method2243() {
      Class115 var1 = this.method8502(Thread.currentThread());
      return var1.aClass433_1385;
   }

   public void method2423(int var1, int var2, int[] var3, int[] var4) {
      this.method2272(var1, var2, (short)18026);
      if(null == this.aClass153_9264 || this.aClass153_9264.method1825() != var1 || this.aClass153_9264.method1771() != var2) {
         this.aClass153_9264 = this.method2307(var1, var2, true, true);
         this.aClass184_Sub2_9279 = null;
      }

      if(null == this.aClass184_Sub2_9279) {
         this.aClass184_Sub2_9279 = this.method2257();
         this.aClass184_Sub2_9279.method8465(0, this.aClass153_9264.method1773());
      }

      Class153_Sub1_Sub1 var5 = new Class153_Sub1_Sub1(this, this.anIntArray9243, this.anInt9277 * -2145294317, 1496863415 * this.anInt9245);
      this.method2623(this.aClass184_Sub2_9279, (short)128);
      this.method2283(1, -16777216);
      var5.method1775(1228368769 * this.anInt2055, this.anInt2039 * 1714687685, -1550496547 * this.anInt2033, 568592699 * this.anInt2058, 1, 0, 0, 0);
      this.aClass153_9264.method1768(0, 0, var1, var2, var3, var4, 0, var1);
      this.method2456(this.aClass184_Sub2_9279, (byte)0);
   }

   void method8510() {
      this.aClass433_9258.method5110(this.aClass445_9257);
      this.aClass433_9240.method5083(this.aClass433_9258);
      this.aClass433_9240.method5085(this.aClass433_9260);
      this.aClass433_9240.method5142(this.aFloatArrayArray9261[0]);
      this.aClass433_9240.method5131(this.aFloatArrayArray9261[1]);
      this.aClass433_9240.method5100(this.aFloatArrayArray9261[2]);
      this.aClass433_9240.method5101(this.aFloatArrayArray9261[3]);
      this.aClass433_9240.method5102(this.aFloatArrayArray9261[4]);
      this.aClass433_9240.method5103(this.aFloatArrayArray9261[5]);
      float var1 = this.aClass433_9260.method5099();
      float var2 = this.aClass433_9260.aFloatArray4841[14] + (var1 - 255.0F) * this.aClass433_9260.aFloatArray4841[10];
      float var3 = this.aClass433_9260.aFloatArray4841[10] * var1 + this.aClass433_9260.aFloatArray4841[14];
      float var4 = var3 - var2;

      for(int var5 = 0; var5 < 768566339 * this.anInt9249; ++var5) {
         Class115 var6 = this.aClass115Array9273[var5];
         var6.aFloat1377 = var2;
         var6.aFloat1378 = var4;
      }

   }

   public void method2287() {
      this.anInt9247 = 0;
      this.anInt9267 = 0;
      this.anInt9271 = 2023294553 * this.anInt9277;
      this.anInt9250 = 1108529229 * this.anInt9245;
      this.method8519();
   }

   public boolean method2407() {
      return true;
   }

   void method2226(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.anIntArray9243) {
         if(var2 >= this.anInt9267 * 1511023883 && var2 < this.anInt9250 * -288042733) {
            if(var1 < this.anInt9247 * -217416947) {
               var3 -= this.anInt9247 * -217416947 - var1;
               var1 = -217416947 * this.anInt9247;
            }

            if(var1 + var3 > 1270312011 * this.anInt9271) {
               var3 = 1270312011 * this.anInt9271 - var1;
            }

            int var6 = var1 + this.anInt9277 * -2145294317 * var2;
            int var7 = var4 >>> 24;
            int var8;
            if(var5 != 0 && (var5 != 1 || 255 != var7)) {
               int var9;
               int var10;
               if(1 == var5) {
                  var4 = ((var4 & 16711935) * var7 >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00') + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = this.anIntArray9243[var6 + var9];
                     var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     this.anIntArray9243[var6 + var9] = var4 + var10;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.anIntArray9243[var8 + var6];
                     var10 = var4 + var9;
                     int var11 = (var9 & 16711935) + (var4 & 16711935);
                     var9 = (var10 - var11 & 65536) + (var11 & 16777472);
                     this.anIntArray9243[var8 + var6] = var10 - var9 | var9 - (var9 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.anIntArray9243[var6 + var8] = var4;
               }
            }

         }
      }
   }

   public boolean method2409() {
      return false;
   }

   public boolean method2410() {
      return false;
   }

   public void method2349() {
   }

   public Class178 method2562(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return null;
   }

   public boolean method2413() {
      return false;
   }

   public void method2607(int var1, Class172 var2) {
      for(int var3 = 0; var3 < this.aClass115Array9273.length; ++var3) {
         this.aClass115Array9273[var3].anInt1380 = this.aClass115Array9273[var3].anInt1379 * -2138309751;
         this.aClass115Array9273[var3].anInt1412 = var1 * -915810697;
         this.aClass115Array9273[var3].anInt1379 = 1592157823 * var2.anInt2019;
         this.aClass115Array9273[var3].anInt1416 = 1905149801 * var2.anInt2020;
         this.aClass115Array9273[var3].aBool1381 = true;
      }

   }

   public void method2332(int var1) {
   }

   public void method2433(int[] var1) {
      var1[0] = this.anInt9262 * 1670515195;
      var1[1] = -2102713899 * this.anInt9248;
      var1[2] = this.anInt9272 * -1602754071;
      var1[3] = this.anInt9265 * 697483999;
   }

   public void method2417(int var1, int var2, int var3) {
   }

   public void method2418() {
   }

   void method8511(int var1) {
      this.aClass115Array9273[var1].method1403(Thread.currentThread(), 1460633715);
   }

   public long method2420(int var1, int var2) {
      return 0L;
   }

   public long method2421(int var1, int var2) {
      return 0L;
   }

   public void method2426(long var1) {
   }

   public int method2614() {
      return 0;
   }

   public Class153 method2476(int var1, int var2, boolean var3, boolean var4) {
      return (Class153)(var3?new Class153_Sub1_Sub1(this, var1, var2):new Class153_Sub1_Sub2(this, var1, var2));
   }

   public void method2274() {
      this.anInt9262 = 0;
      this.anInt9248 = 0;
      this.anInt9272 = -1135900517 * this.anInt9277;
      this.anInt9265 = this.anInt9245 * -807304407;
      this.method8519();
   }

   void method8512(boolean var1, int var2, int var3, float var4, int var5, int var6, int var7) {
      if(this.anIntArray9243 != null) {
         if(var5 < 0) {
            var5 = -var5;
         }

         int var8 = var3 - var5;
         if(var8 < this.anInt9267 * 1511023883) {
            var8 = 1511023883 * this.anInt9267;
         }

         int var9 = 1 + var3 + var5;
         if(var9 > this.anInt9250 * -288042733) {
            var9 = -288042733 * this.anInt9250;
         }

         int var10 = var8;
         int var11 = var5 * var5;
         int var12 = 0;
         int var13 = var3 - var8;
         int var14 = var13 * var13;
         int var15 = var14 - var13;
         if(var3 > var9) {
            var3 = var9;
         }

         int var16 = var6 >>> 24;
         int var17;
         int var18;
         int var19;
         int var20;
         if(var7 == 0 || 1 == var7 && var16 == 255) {
            while(var10 < var3) {
               while(var15 <= var11 || var14 <= var11) {
                  var14 += var12 + var12;
                  var15 += var12++ + var12;
               }

               var17 = var2 - var12 + 1;
               if(var17 < this.anInt9247 * -217416947) {
                  var17 = this.anInt9247 * -217416947;
               }

               var18 = var12 + var2;
               if(var18 > 1270312011 * this.anInt9271) {
                  var18 = 1270312011 * this.anInt9271;
               }

               var19 = var17 + -2145294317 * this.anInt9277 * var10;

               for(var20 = var17; var20 < var18; ++var20) {
                  if(!var1 || var4 < this.aFloatArray9246[var19]) {
                     this.anIntArray9243[var19] = var6;
                  }

                  ++var19;
               }

               ++var10;
               var14 -= var13-- + var13;
               var15 -= var13 + var13;
            }

            var12 = var5;
            var13 = var10 - var3;
            var15 = var11 + var13 * var13;
            var14 = var15 - var5;

            for(var15 -= var13; var10 < var9; var14 += var13++ + var13) {
               while(var15 > var11 && var14 > var11) {
                  var15 -= var12-- + var12;
                  var14 -= var12 + var12;
               }

               var17 = var2 - var12;
               if(var17 < -217416947 * this.anInt9247) {
                  var17 = -217416947 * this.anInt9247;
               }

               var18 = var12 + var2;
               if(var18 > this.anInt9271 * 1270312011 - 1) {
                  var18 = this.anInt9271 * 1270312011 - 1;
               }

               var19 = -2145294317 * this.anInt9277 * var10 + var17;

               for(var20 = var17; var20 <= var18; ++var20) {
                  if(!var1 || var4 < this.aFloatArray9246[var19]) {
                     this.anIntArray9243[var19] = var6;
                  }

                  ++var19;
               }

               ++var10;
               var15 += var13 + var13;
            }

            return;
         } else {
            int var21;
            int var22;
            if(1 == var7) {
               var6 = (var16 << 24) + ((var6 & 16711935) * var16 >> 8 & 16711935) + (var16 * (var6 & '\uff00') >> 8 & '\uff00');

               for(var17 = 256 - var16; var10 < var3; var15 -= var13 + var13) {
                  while(var15 <= var11 || var14 <= var11) {
                     var14 += var12 + var12;
                     var15 += var12++ + var12;
                  }

                  var18 = var2 - var12 + 1;
                  if(var18 < -217416947 * this.anInt9247) {
                     var18 = this.anInt9247 * -217416947;
                  }

                  var19 = var12 + var2;
                  if(var19 > this.anInt9271 * 1270312011) {
                     var19 = this.anInt9271 * 1270312011;
                  }

                  var20 = var10 * this.anInt9277 * -2145294317 + var18;

                  for(var21 = var18; var21 < var19; ++var21) {
                     if(!var1 || var4 < this.aFloatArray9246[var20]) {
                        var22 = this.anIntArray9243[var20];
                        var22 = ((var22 & '\uff00') * var17 >> 8 & '\uff00') + ((var22 & 16711935) * var17 >> 8 & 16711935);
                        this.anIntArray9243[var20] = var22 + var6;
                     }

                     ++var20;
                  }

                  ++var10;
                  var14 -= var13-- + var13;
               }

               var12 = var5;
               var13 = -var13;
               var15 = var11 + var13 * var13;
               var14 = var15 - var5;

               for(var15 -= var13; var10 < var9; var14 += var13++ + var13) {
                  while(var15 > var11 && var14 > var11) {
                     var15 -= var12-- + var12;
                     var14 -= var12 + var12;
                  }

                  var18 = var2 - var12;
                  if(var18 < -217416947 * this.anInt9247) {
                     var18 = -217416947 * this.anInt9247;
                  }

                  var19 = var12 + var2;
                  if(var19 > this.anInt9271 * 1270312011 - 1) {
                     var19 = this.anInt9271 * 1270312011 - 1;
                  }

                  var20 = var10 * -2145294317 * this.anInt9277 + var18;

                  for(var21 = var18; var21 <= var19; ++var21) {
                     if(!var1 || var4 < this.aFloatArray9246[var20]) {
                        var22 = this.anIntArray9243[var20];
                        var22 = ((var22 & '\uff00') * var17 >> 8 & '\uff00') + (var17 * (var22 & 16711935) >> 8 & 16711935);
                        this.anIntArray9243[var20] = var6 + var22;
                     }

                     ++var20;
                  }

                  ++var10;
                  var15 += var13 + var13;
               }
            } else {
               if(var7 != 2) {
                  throw new IllegalArgumentException();
               }

               int var23;
               while(var10 < var3) {
                  while(var15 <= var11 || var14 <= var11) {
                     var14 += var12 + var12;
                     var15 += var12++ + var12;
                  }

                  var17 = 1 + (var2 - var12);
                  if(var17 < this.anInt9247 * -217416947) {
                     var17 = this.anInt9247 * -217416947;
                  }

                  var18 = var12 + var2;
                  if(var18 > this.anInt9271 * 1270312011) {
                     var18 = 1270312011 * this.anInt9271;
                  }

                  var19 = var10 * this.anInt9277 * -2145294317 + var17;

                  for(var20 = var17; var20 < var18; ++var20) {
                     if(!var1 || var4 < this.aFloatArray9246[var19]) {
                        var21 = this.anIntArray9243[var19];
                        var22 = var21 + var6;
                        var23 = (var21 & 16711935) + (var6 & 16711935);
                        var21 = (var22 - var23 & 65536) + (var23 & 16777472);
                        this.anIntArray9243[var19] = var22 - var21 | var21 - (var21 >>> 8);
                     }

                     ++var19;
                  }

                  ++var10;
                  var14 -= var13-- + var13;
                  var15 -= var13 + var13;
               }

               var12 = var5;
               var13 = -var13;
               var15 = var13 * var13 + var11;
               var14 = var15 - var5;

               for(var15 -= var13; var10 < var9; var14 += var13++ + var13) {
                  while(var15 > var11 && var14 > var11) {
                     var15 -= var12-- + var12;
                     var14 -= var12 + var12;
                  }

                  var17 = var2 - var12;
                  if(var17 < -217416947 * this.anInt9247) {
                     var17 = -217416947 * this.anInt9247;
                  }

                  var18 = var2 + var12;
                  if(var18 > 1270312011 * this.anInt9271 - 1) {
                     var18 = this.anInt9271 * 1270312011 - 1;
                  }

                  var19 = var17 + -2145294317 * this.anInt9277 * var10;

                  for(var20 = var17; var20 <= var18; ++var20) {
                     if(!var1 || var4 < this.aFloatArray9246[var19]) {
                        var21 = this.anIntArray9243[var19];
                        var22 = var6 + var21;
                        var23 = (var6 & 16711935) + (var21 & 16711935);
                        var21 = (var22 - var23 & 65536) + (var23 & 16777472);
                        this.anIntArray9243[var19] = var22 - var21 | var21 - (var21 >>> 8);
                     }

                     ++var19;
                  }

                  ++var10;
                  var15 += var13 + var13;
               }
            }
         }

      }
   }

   void method8513() {
      if(this.aFloatArray9246 != null) {
         int var1;
         int var2;
         int var3;
         if(-217416947 * this.anInt9247 == 0 && this.anInt9271 * 1270312011 == this.anInt9277 * -2145294317 && 1511023883 * this.anInt9267 == 0 && this.anInt9250 * -288042733 == 1496863415 * this.anInt9245) {
            var1 = this.aFloatArray9246.length;
            var2 = var1 - (var1 & 7);

            for(var3 = 0; var3 < var2; this.aFloatArray9246[var3++] = 2.14748365E9F) {
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
               this.aFloatArray9246[var3++] = 2.14748365E9F;
            }

            while(var3 < var1) {
               this.aFloatArray9246[var3++] = 2.14748365E9F;
            }
         } else {
            var1 = this.anInt9271 * 1270312011 - -217416947 * this.anInt9247;
            var2 = -288042733 * this.anInt9250 - 1511023883 * this.anInt9267;
            var3 = -2145294317 * this.anInt9277 - var1;
            int var4 = -2145294317 * this.anInt9277 * 1511023883 * this.anInt9267 + this.anInt9247 * -217416947;
            int var5 = var1 >> 3;
            int var6 = var1 & 7;
            var1 = var4 - 1;

            for(int var7 = -var2; var7 < 0; ++var7) {
               int var8;
               if(var5 > 0) {
                  var8 = var5;

                  do {
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     --var8;
                  } while(var8 > 0);
               }

               if(var6 > 0) {
                  var8 = var6;

                  do {
                     ++var1;
                     this.aFloatArray9246[var1] = 2.14748365E9F;
                     --var8;
                  } while(var8 > 0);
               }

               var1 += var3;
            }
         }

      }
   }

   public void method2443(boolean var1) {
      Class115 var2 = this.method8502(Thread.currentThread());
      var2.aBool1384 = var1;
   }

   public void method2427(boolean var1) {
      Class115 var2 = this.method8502(Thread.currentThread());
      var2.aBool1384 = var1;
   }

   public void method2227(boolean var1) {
      Class115 var2 = this.method8502(Thread.currentThread());
      var2.aBool1384 = var1;
   }

   public void method2429(boolean var1) {
      Class115 var2 = this.method8502(Thread.currentThread());
      var2.aBool1384 = var1;
   }

   public Interface21 method2567(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return this.method8506(var1, var2);
   }

   public void method2431(int var1, int var2, int var3, int var4) {
      this.anInt9262 = var1 * 201562419;
      this.anInt9248 = 320933757 * var2;
      this.anInt9272 = 995589721 * var3;
      this.anInt9265 = var4 * 834763039;
      this.method8519();
   }

   public void method2432(int var1, int var2, int var3, int var4) {
      this.anInt9262 = var1 * 201562419;
      this.anInt9248 = 320933757 * var2;
      this.anInt9272 = 995589721 * var3;
      this.anInt9265 = var4 * 834763039;
      this.method8519();
   }

   public void method2604() {
   }

   void method2553(float var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void method2435(float var1, float var2) {
      this.aFloat9270 = var2 - var1;
      this.aFloat9241 = var2 + var1 - 1.0F;

      for(int var3 = 0; var3 < this.anInt9249 * 768566339; ++var3) {
         Class115 var4 = this.aClass115Array9273[var3];
         Class121 var5 = var4.aClass121_1387;
         var5.aFloat1541 = this.aFloat9270;
         var5.aFloat1547 = this.aFloat9241;
      }

   }

   public void method2289(float var1, float var2) {
      this.aFloat9270 = var2 - var1;
      this.aFloat9241 = var2 + var1 - 1.0F;

      for(int var3 = 0; var3 < this.anInt9249 * 768566339; ++var3) {
         Class115 var4 = this.aClass115Array9273[var3];
         Class121 var5 = var4.aClass121_1387;
         var5.aFloat1541 = this.aFloat9270;
         var5.aFloat1547 = this.aFloat9241;
      }

   }

   public Interface21 method2258(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return this.method8506(var1, var2);
   }

   public Class163 method2492(Class1 var1, Class173[] var2, boolean var3) {
      int[] var4 = new int[var2.length];
      int[] var5 = new int[var2.length];
      boolean var6 = false;
      boolean var7 = false;

      for(int var8 = 0; var8 < var2.length; ++var8) {
         var4[var8] = var2[var8].method2168();
         var5[var8] = var2[var8].method2175();
         if(var2[var8].method2224()) {
            var6 = true;
         }

         if(var2[var8].method2166()) {
            var7 = true;
         }
      }

      if(var3) {
         if(var7) {
            if(var6) {
               return new Class163_Sub1(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            } else {
               return new Class163_Sub6(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            }
         } else if(var6) {
            return new Class163_Sub1(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         } else {
            return new Class163_Sub6(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         }
      } else if(var7) {
         if(var6) {
            throw new IllegalArgumentException("");
         } else {
            return new Class163_Sub2(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
         }
      } else {
         return new Class163_Sub3(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
      }
   }

   public void method2277() {
      this.anInt9247 = 0;
      this.anInt9267 = 0;
      this.anInt9271 = 2023294553 * this.anInt9277;
      this.anInt9250 = 1108529229 * this.anInt9245;
      this.method8519();
   }

   public void method2437(int var1, int var2, int var3, int var4) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 < 0) {
         var2 = 0;
      }

      if(var3 > this.anInt9277 * -2145294317) {
         var3 = this.anInt9277 * -2145294317;
      }

      if(var4 > this.anInt9245 * 1496863415) {
         var4 = this.anInt9245 * 1496863415;
      }

      this.anInt9247 = var1 * 1204603845;
      this.anInt9271 = -113115805 * var3;
      this.anInt9267 = var2 * 228933283;
      this.anInt9250 = -624189157 * var4;
      this.method8519();
   }

   public int method2533(int var1, int var2) {
      return var1 | var2;
   }

   public Class153 method2475(int var1, int var2, boolean var3, boolean var4) {
      return (Class153)(var3?new Class153_Sub1_Sub1(this, var1, var2):new Class153_Sub1_Sub2(this, var1, var2));
   }

   public void method2439(int var1, int var2) {
      if(0 != (var1 & 1)) {
         this.method2290(0, 0, -2145294317 * this.anInt9277, this.anInt9245 * 1496863415, var2, 0);
      }

      if((var1 & 2) != 0) {
         this.method8498();
      }

   }

   public void method2440(int var1, int var2) {
      if(0 != (var1 & 1)) {
         this.method2290(0, 0, -2145294317 * this.anInt9277, this.anInt9245 * 1496863415, var2, 0);
      }

      if((var1 & 2) != 0) {
         this.method8498();
      }

   }

   public void method2441(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method2293(var1, var2, var3, var5, var6);
      this.method2293(var1, var2 + var4 - 1, var3, var5, var6);
      this.method2294(var1, 1 + var2, var4 - 2, var5, var6);
      this.method2294(var3 + var1 - 1, 1 + var2, var4 - 2, var5, var6);
   }

   public void method2442(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != this.anIntArray9243) {
         if(var1 < this.anInt9247 * -217416947) {
            var3 -= this.anInt9247 * -217416947 - var1;
            var1 = -217416947 * this.anInt9247;
         }

         if(var2 < this.anInt9267 * 1511023883) {
            var4 -= this.anInt9267 * 1511023883 - var2;
            var2 = 1511023883 * this.anInt9267;
         }

         if(var3 + var1 > this.anInt9271 * 1270312011) {
            var3 = 1270312011 * this.anInt9271 - var1;
         }

         if(var2 + var4 > -288042733 * this.anInt9250) {
            var4 = this.anInt9250 * -288042733 - var2;
         }

         if(var3 > 0 && var4 > 0 && var1 <= 1270312011 * this.anInt9271 && var2 <= this.anInt9250 * -288042733) {
            int var7 = this.anInt9277 * -2145294317 - var3;
            int var8 = var1 + this.anInt9277 * -2145294317 * var2;
            int var9 = var5 >>> 24;
            int var10;
            int var11;
            int var12;
            if(var6 != 0 && (1 != var6 || var9 != 255)) {
               int var13;
               if(var6 == 1) {
                  var5 = (var9 * ((var5 & -16711936) >>> 8) & -16711936) + (var9 * (var5 & 16711935) >> 8 & 16711935);
                  var10 = 256 - var9;

                  for(var11 = 0; var11 < var4; ++var11) {
                     for(var12 = -var3; var12 < 0; ++var12) {
                        var13 = this.anIntArray9243[var8];
                        var13 = (var10 * (var13 & 16711935) >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                        this.anIntArray9243[var8++] = var5 + var13;
                     }

                     var8 += var7;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  for(var10 = 0; var10 < var4; ++var10) {
                     for(var11 = -var3; var11 < 0; ++var11) {
                        var12 = this.anIntArray9243[var8];
                        var13 = var12 + var5;
                        int var14 = (var5 & 16711935) + (var12 & 16711935);
                        var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                        this.anIntArray9243[var8++] = var13 - var12 | var12 - (var12 >>> 8);
                     }

                     var8 += var7;
                  }
               }
            } else {
               var10 = var3 >> 3;
               var11 = var3 & 7;
               var3 = var8 - 1;

               for(var12 = -var4; var12 < 0; ++var12) {
                  if(var10 > 0) {
                     var1 = var10;

                     do {
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  if(var11 > 0) {
                     var1 = var11;

                     do {
                        ++var3;
                        this.anIntArray9243[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  var3 += var7;
               }
            }

         }
      }
   }

   void method2367(int var1, int var2, int var3, int var4, int var5) {
      if(this.anIntArray9243 != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var6 = var2 - var3;
         if(var6 < this.anInt9267 * 1511023883) {
            var6 = this.anInt9267 * 1511023883;
         }

         int var7 = 1 + var2 + var3;
         if(var7 > -288042733 * this.anInt9250) {
            var7 = -288042733 * this.anInt9250;
         }

         int var8 = var6;
         int var9 = var3 * var3;
         int var10 = 0;
         int var11 = var2 - var6;
         int var12 = var11 * var11;
         int var13 = var12 - var11;
         if(var2 > var7) {
            var2 = var7;
         }

         int var14 = var4 >>> 24;
         int var15;
         int var16;
         int var17;
         int var18;
         if(0 == var5 || var5 == 1 && 255 == var14) {
            while(var8 < var2) {
               while(var13 <= var9 || var12 <= var9) {
                  var12 += var10 + var10;
                  var13 += var10++ + var10;
               }

               var15 = 1 + (var1 - var10);
               if(var15 < this.anInt9247 * -217416947) {
                  var15 = this.anInt9247 * -217416947;
               }

               var16 = var10 + var1;
               if(var16 > this.anInt9271 * 1270312011) {
                  var16 = this.anInt9271 * 1270312011;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 < var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var12 -= var11-- + var11;
               var13 -= var11 + var11;
            }

            var10 = var3;
            var11 = var8 - var2;
            var13 = var11 * var11 + var9;
            var12 = var13 - var3;

            for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
               while(var13 > var9 && var12 > var9) {
                  var13 -= var10-- + var10;
                  var12 -= var10 + var10;
               }

               var15 = var1 - var10;
               if(var15 < -217416947 * this.anInt9247) {
                  var15 = -217416947 * this.anInt9247;
               }

               var16 = var10 + var1;
               if(var16 > 1270312011 * this.anInt9271 - 1) {
                  var16 = this.anInt9271 * 1270312011 - 1;
               }

               var17 = var8 * this.anInt9277 * -2145294317 + var15;

               for(var18 = var15; var18 <= var16; ++var18) {
                  this.anIntArray9243[var17++] = var4;
               }

               ++var8;
               var13 += var11 + var11;
            }

            return;
         } else {
            int var19;
            int var20;
            if(1 == var5) {
               var4 = ((var4 & '\uff00') * var14 >> 8 & '\uff00') + ((var4 & 16711935) * var14 >> 8 & 16711935) + (var14 << 24);

               for(var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var16 = var1 - var10 + 1;
                  if(var16 < -217416947 * this.anInt9247) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > this.anInt9271 * 1270312011) {
                     var17 = 1270312011 * this.anInt9271;
                  }

                  var18 = -2145294317 * this.anInt9277 * var8 + var16;

                  for(var19 = var16; var19 < var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = ((var20 & '\uff00') * var15 >> 8 & '\uff00') + ((var20 & 16711935) * var15 >> 8 & 16711935);
                     this.anIntArray9243[var18++] = var4 + var20;
                  }

                  ++var8;
                  var12 -= var11-- + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var16 = var1 - var10;
                  if(var16 < this.anInt9247 * -217416947) {
                     var16 = this.anInt9247 * -217416947;
                  }

                  var17 = var1 + var10;
                  if(var17 > 1270312011 * this.anInt9271 - 1) {
                     var17 = 1270312011 * this.anInt9271 - 1;
                  }

                  var18 = var8 * -2145294317 * this.anInt9277 + var16;

                  for(var19 = var16; var19 <= var17; ++var19) {
                     var20 = this.anIntArray9243[var18];
                     var20 = (var15 * (var20 & 16711935) >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                     this.anIntArray9243[var18++] = var20 + var4;
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            } else {
               if(2 != var5) {
                  throw new IllegalArgumentException();
               }

               int var21;
               while(var8 < var2) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var15 = 1 + (var1 - var10);
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var10 + var1;
                  if(var16 > this.anInt9271 * 1270312011) {
                     var16 = 1270312011 * this.anInt9271;
                  }

                  var17 = var15 + this.anInt9277 * -2145294317 * var8;

                  for(var18 = var15; var18 < var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var19 + var4;
                     var21 = (var4 & 16711935) + (var19 & 16711935);
                     var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var12 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var10 = var3;
               var11 = -var11;
               var13 = var9 + var11 * var11;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  var15 = var1 - var10;
                  if(var15 < this.anInt9247 * -217416947) {
                     var15 = this.anInt9247 * -217416947;
                  }

                  var16 = var1 + var10;
                  if(var16 > 1270312011 * this.anInt9271 - 1) {
                     var16 = 1270312011 * this.anInt9271 - 1;
                  }

                  var17 = var15 + var8 * -2145294317 * this.anInt9277;

                  for(var18 = var15; var18 <= var16; ++var18) {
                     var19 = this.anIntArray9243[var17];
                     var20 = var4 + var19;
                     var21 = (var19 & 16711935) + (var4 & 16711935);
                     var19 = (var20 - var21 & 65536) + (var21 & 16777472);
                     this.anIntArray9243[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            }
         }

      }
   }

   public void method2273() {
      this.aClass184_Sub2_9279 = null;
      this.aClass153_9264 = null;
   }

   public boolean method2406() {
      return true;
   }

   public void method2394(boolean var1) {
   }

   public void method2488(int var1, Class162 var2, int var3, int var4) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var5 = (Class162_Sub2)var2;
         int[] var6 = var5.anIntArray9211;
         int[] var7 = var5.anIntArray9210;
         int var8;
         if(-288042733 * this.anInt9250 < var4 + var6.length) {
            var8 = -288042733 * this.anInt9250 - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(this.anInt9267 * 1511023883 > var4) {
            var9 = 1511023883 * this.anInt9267 - var4;
            var4 = this.anInt9267 * 1511023883;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = var4 * -2145294317 * this.anInt9277;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var3 + var6[var11];
               int var13 = var7[var11];
               if(-217416947 * this.anInt9247 > var12) {
                  var13 -= this.anInt9247 * -217416947 - var12;
                  var12 = -217416947 * this.anInt9247;
               }

               if(1270312011 * this.anInt9271 < var12 + var13) {
                  var13 = this.anInt9271 * 1270312011 - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.anIntArray9243[var12++] = var1;
               }

               var10 += this.anInt9277 * -2145294317;
            }

         }
      }
   }

   public int[] method2391() {
      return null;
   }

   public void method2424() {
      this.aClass184_Sub2_9279 = null;
      this.aClass153_9264 = null;
   }

   void method2451(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.anIntArray9243) {
         if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011) {
            if(var2 < this.anInt9267 * 1511023883) {
               var3 -= this.anInt9267 * 1511023883 - var2;
               var2 = 1511023883 * this.anInt9267;
            }

            if(var3 + var2 > -288042733 * this.anInt9250) {
               var3 = -288042733 * this.anInt9250 - var2;
            }

            int var6 = var2 * -2145294317 * this.anInt9277 + var1;
            int var7 = var4 >>> 24;
            int var8;
            if(0 != var5 && (1 != var5 || var7 != 255)) {
               int var9;
               int var10;
               int var11;
               if(var5 == 1) {
                  var4 = (var7 << 24) + (var7 * (var4 & 16711935) >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00');
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = var6 + var9 * this.anInt9277 * -2145294317;
                     var11 = this.anIntArray9243[var10];
                     var11 = (var8 * (var11 & '\uff00') >> 8 & '\uff00') + (var8 * (var11 & 16711935) >> 8 & 16711935);
                     this.anIntArray9243[var10] = var11 + var4;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.anInt9277 * -2145294317 * var8 + var6;
                     var10 = this.anIntArray9243[var9];
                     var11 = var4 + var10;
                     int var12 = (var4 & 16711935) + (var10 & 16711935);
                     var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                     this.anIntArray9243[var9] = var11 - var10 | var10 - (var10 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.anIntArray9243[var6 + var8 * this.anInt9277 * -2145294317] = var4;
               }
            }

         }
      }
   }

   void method2505(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.anIntArray9243) {
         if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011) {
            if(var2 < this.anInt9267 * 1511023883) {
               var3 -= this.anInt9267 * 1511023883 - var2;
               var2 = 1511023883 * this.anInt9267;
            }

            if(var3 + var2 > -288042733 * this.anInt9250) {
               var3 = -288042733 * this.anInt9250 - var2;
            }

            int var6 = var2 * -2145294317 * this.anInt9277 + var1;
            int var7 = var4 >>> 24;
            int var8;
            if(0 != var5 && (1 != var5 || var7 != 255)) {
               int var9;
               int var10;
               int var11;
               if(var5 == 1) {
                  var4 = (var7 << 24) + (var7 * (var4 & 16711935) >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00');
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = var6 + var9 * this.anInt9277 * -2145294317;
                     var11 = this.anIntArray9243[var10];
                     var11 = (var8 * (var11 & '\uff00') >> 8 & '\uff00') + (var8 * (var11 & 16711935) >> 8 & 16711935);
                     this.anIntArray9243[var10] = var11 + var4;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.anInt9277 * -2145294317 * var8 + var6;
                     var10 = this.anIntArray9243[var9];
                     var11 = var4 + var10;
                     int var12 = (var4 & 16711935) + (var10 & 16711935);
                     var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                     this.anIntArray9243[var9] = var11 - var10 | var10 - (var10 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.anIntArray9243[var6 + var8 * this.anInt9277 * -2145294317] = var4;
               }
            }

         }
      }
   }

   public void method2523(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != this.anIntArray9243) {
         var3 -= var1;
         var4 -= var2;
         if(0 == var4) {
            if(var3 >= 0) {
               this.method2293(var1, var2, 1 + var3, var5, var6);
            } else {
               this.method2293(var1 + var3, var2, -var3 + 1, var5, var6);
            }

         } else if(0 == var3) {
            if(var4 >= 0) {
               this.method2294(var1, var2, var4 + 1, var5, var6);
            } else {
               this.method2294(var1, var4 + var2, 1 + -var4, var5, var6);
            }

         } else {
            if(var3 + var4 < 0) {
               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var7 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
               var3 += var1;
               if(var1 < -217416947 * this.anInt9247) {
                  var2 += (-217416947 * this.anInt9247 - var1) * var7;
                  var1 = this.anInt9247 * -217416947;
               }

               if(var3 >= this.anInt9271 * 1270312011) {
                  var3 = 1270312011 * this.anInt9271 - 1;
               }

               var8 = var5 >>> 24;
               if(var6 == 0 || var6 == 1 && 255 == var8) {
                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= this.anInt9267 * 1511023883 && var9 < this.anInt9250 * -288042733) {
                        this.anIntArray9243[var9 * this.anInt9277 * -2145294317 + var1] = var5;
                     }

                     var2 += var7;
                     ++var1;
                  }
               } else if(var6 == 1) {
                  var5 = (var8 * (var5 & 16711935) >> 8 & 16711935) + (var8 * (var5 & '\uff00') >> 8 & '\uff00') + (var8 << 24);

                  for(var9 = 256 - var8; var1 <= var3; ++var1) {
                     var10 = var2 >> 16;
                     if(var10 >= 1511023883 * this.anInt9267 && var10 < this.anInt9250 * -288042733) {
                        var11 = var10 * -2145294317 * this.anInt9277 + var1;
                        var12 = this.anIntArray9243[var11];
                        var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                        this.anIntArray9243[var11] = var12 + var5;
                     }

                     var2 += var7;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= this.anInt9267 * 1511023883 && var9 < -288042733 * this.anInt9250) {
                        var10 = -2145294317 * this.anInt9277 * var9 + var1;
                        var11 = this.anIntArray9243[var10];
                        var12 = var11 + var5;
                        var13 = (var11 & 16711935) + (var5 & 16711935);
                        var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                        this.anIntArray9243[var10] = var12 - var11 | var11 - (var11 >>> 8);
                     }

                     var2 += var7;
                     ++var1;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var7 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               if(var2 < 1511023883 * this.anInt9267) {
                  var1 += (1511023883 * this.anInt9267 - var2) * var7;
                  var2 = this.anInt9267 * 1511023883;
               }

               if(var4 >= this.anInt9250 * -288042733) {
                  var4 = this.anInt9250 * -288042733 - 1;
               }

               var8 = var5 >>> 24;
               if(0 == var6 || 1 == var6 && 255 == var8) {
                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= this.anInt9247 * -217416947 && var9 < 1270312011 * this.anInt9271) {
                        this.anIntArray9243[var2 * this.anInt9277 * -2145294317 + var9] = var5;
                     }

                     var1 += var7;
                     ++var2;
                  }
               } else if(1 == var6) {
                  var5 = (var8 * (var5 & 16711935) >> 8 & 16711935) + ((var5 & '\uff00') * var8 >> 8 & '\uff00') + (var8 << 24);

                  for(var9 = 256 - var8; var2 <= var4; ++var2) {
                     var10 = var1 >> 16;
                     if(var10 >= -217416947 * this.anInt9247 && var10 < 1270312011 * this.anInt9271) {
                        var11 = var10 + this.anInt9277 * -2145294317 * var2;
                        var12 = this.anIntArray9243[var11];
                        var12 = ((var12 & '\uff00') * var9 >> 8 & '\uff00') + ((var12 & 16711935) * var9 >> 8 & 16711935);
                        this.anIntArray9243[var10 + var2 * -2145294317 * this.anInt9277] = var5 + var12;
                     }

                     var1 += var7;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= -217416947 * this.anInt9247 && var9 < this.anInt9271 * 1270312011) {
                        var10 = var2 * this.anInt9277 * -2145294317 + var9;
                        var11 = this.anIntArray9243[var10];
                        var12 = var11 + var5;
                        var13 = (var5 & 16711935) + (var11 & 16711935);
                        var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                        this.anIntArray9243[var10] = var12 - var11 | var11 - (var11 >>> 8);
                     }

                     var1 += var7;
                     ++var2;
                  }
               }
            }

         }
      }
   }

   public void method2454(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != this.anIntArray9243) {
         var3 -= var1;
         var4 -= var2;
         if(0 == var4) {
            if(var3 >= 0) {
               this.method2293(var1, var2, 1 + var3, var5, var6);
            } else {
               this.method2293(var1 + var3, var2, -var3 + 1, var5, var6);
            }

         } else if(0 == var3) {
            if(var4 >= 0) {
               this.method2294(var1, var2, var4 + 1, var5, var6);
            } else {
               this.method2294(var1, var4 + var2, 1 + -var4, var5, var6);
            }

         } else {
            if(var3 + var4 < 0) {
               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var7 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
               var3 += var1;
               if(var1 < -217416947 * this.anInt9247) {
                  var2 += (-217416947 * this.anInt9247 - var1) * var7;
                  var1 = this.anInt9247 * -217416947;
               }

               if(var3 >= this.anInt9271 * 1270312011) {
                  var3 = 1270312011 * this.anInt9271 - 1;
               }

               var8 = var5 >>> 24;
               if(var6 == 0 || var6 == 1 && 255 == var8) {
                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= this.anInt9267 * 1511023883 && var9 < this.anInt9250 * -288042733) {
                        this.anIntArray9243[var9 * this.anInt9277 * -2145294317 + var1] = var5;
                     }

                     var2 += var7;
                     ++var1;
                  }
               } else if(var6 == 1) {
                  var5 = (var8 * (var5 & 16711935) >> 8 & 16711935) + (var8 * (var5 & '\uff00') >> 8 & '\uff00') + (var8 << 24);

                  for(var9 = 256 - var8; var1 <= var3; ++var1) {
                     var10 = var2 >> 16;
                     if(var10 >= 1511023883 * this.anInt9267 && var10 < this.anInt9250 * -288042733) {
                        var11 = var10 * -2145294317 * this.anInt9277 + var1;
                        var12 = this.anIntArray9243[var11];
                        var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                        this.anIntArray9243[var11] = var12 + var5;
                     }

                     var2 += var7;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= this.anInt9267 * 1511023883 && var9 < -288042733 * this.anInt9250) {
                        var10 = -2145294317 * this.anInt9277 * var9 + var1;
                        var11 = this.anIntArray9243[var10];
                        var12 = var11 + var5;
                        var13 = (var11 & 16711935) + (var5 & 16711935);
                        var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                        this.anIntArray9243[var10] = var12 - var11 | var11 - (var11 >>> 8);
                     }

                     var2 += var7;
                     ++var1;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var7 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               if(var2 < 1511023883 * this.anInt9267) {
                  var1 += (1511023883 * this.anInt9267 - var2) * var7;
                  var2 = this.anInt9267 * 1511023883;
               }

               if(var4 >= this.anInt9250 * -288042733) {
                  var4 = this.anInt9250 * -288042733 - 1;
               }

               var8 = var5 >>> 24;
               if(0 == var6 || 1 == var6 && 255 == var8) {
                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= this.anInt9247 * -217416947 && var9 < 1270312011 * this.anInt9271) {
                        this.anIntArray9243[var2 * this.anInt9277 * -2145294317 + var9] = var5;
                     }

                     var1 += var7;
                     ++var2;
                  }
               } else if(1 == var6) {
                  var5 = (var8 * (var5 & 16711935) >> 8 & 16711935) + ((var5 & '\uff00') * var8 >> 8 & '\uff00') + (var8 << 24);

                  for(var9 = 256 - var8; var2 <= var4; ++var2) {
                     var10 = var1 >> 16;
                     if(var10 >= -217416947 * this.anInt9247 && var10 < 1270312011 * this.anInt9271) {
                        var11 = var10 + this.anInt9277 * -2145294317 * var2;
                        var12 = this.anIntArray9243[var11];
                        var12 = ((var12 & '\uff00') * var9 >> 8 & '\uff00') + ((var12 & 16711935) * var9 >> 8 & 16711935);
                        this.anIntArray9243[var10 + var2 * -2145294317 * this.anInt9277] = var5 + var12;
                     }

                     var1 += var7;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= -217416947 * this.anInt9247 && var9 < this.anInt9271 * 1270312011) {
                        var10 = var2 * this.anInt9277 * -2145294317 + var9;
                        var11 = this.anIntArray9243[var10];
                        var12 = var11 + var5;
                        var13 = (var5 & 16711935) + (var11 & 16711935);
                        var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                        this.anIntArray9243[var10] = var12 - var11 | var11 - (var11 >>> 8);
                     }

                     var1 += var7;
                     ++var2;
                  }
               }
            }

         }
      }
   }

   boolean method2315(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6) {
      Class433 var7 = this.method2318();
      var7.method5110(var5);
      var7.method5085(this.aClass433_9240);
      return var6.method5150(var1, var2, var3, var4, var7, this.aFloat9278, this.aFloat9269, this.aFloat9266, this.aFloat9268);
   }

   public void method2486(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9) {
      if(null != this.anIntArray9243) {
         Class162_Sub2 var10 = (Class162_Sub2)var7;
         int[] var11 = var10.anIntArray9211;
         int[] var12 = var10.anIntArray9210;
         int var13 = 1511023883 * this.anInt9267 > var9?1511023883 * this.anInt9267:var9;
         int var14 = -288042733 * this.anInt9250 < var11.length + var9?this.anInt9250 * -288042733:var9 + var11.length;
         var3 -= var1;
         var4 -= var2;
         if(var3 + var4 < 0) {
            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var15 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            if(var1 < this.anInt9247 * -217416947) {
               var2 += var15 * (this.anInt9247 * -217416947 - var1);
               var1 = -217416947 * this.anInt9247;
            }

            if(var3 >= 1270312011 * this.anInt9271) {
               var3 = this.anInt9271 * 1270312011 - 1;
            }

            var16 = var5 >>> 24;
            if(var6 != 0 && (1 != var6 || 255 != var16)) {
               if(1 == var6) {
                  var5 = (var16 * (var5 & 16711935) >> 8 & 16711935) + (var16 * (var5 & '\uff00') >> 8 & '\uff00') + (var16 << 24);

                  for(var17 = 256 - var16; var1 <= var3; ++var1) {
                     var18 = var2 >> 16;
                     var19 = var18 - var9;
                     if(var18 >= var13 && var18 < var14) {
                        var20 = var11[var19] + var8;
                        if(var1 >= var20 && var1 < var20 + var12[var19]) {
                           var21 = var18 * -2145294317 * this.anInt9277 + var1;
                           var22 = this.anIntArray9243[var21];
                           var22 = (var17 * (var22 & 16711935) >> 8 & 16711935) + (var17 * (var22 & '\uff00') >> 8 & '\uff00');
                           this.anIntArray9243[var21] = var22 + var5;
                        }
                     }

                     var2 += var15;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var17 = var2 >> 16;
                     var18 = var17 - var9;
                     if(var17 >= var13 && var17 < var14) {
                        var19 = var8 + var11[var18];
                        if(var1 >= var19 && var1 < var12[var18] + var19) {
                           var20 = var17 * -2145294317 * this.anInt9277 + var1;
                           var21 = this.anIntArray9243[var20];
                           var22 = var5 + var21;
                           var23 = (var5 & 16711935) + (var21 & 16711935);
                           var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                           this.anIntArray9243[var20] = var22 - var21 | var21 - (var21 >>> 8);
                        }
                     }

                     var2 += var15;
                     ++var1;
                  }
               }
            } else {
               while(var1 <= var3) {
                  var17 = var2 >> 16;
                  var18 = var17 - var9;
                  if(var17 >= var13 && var17 < var14) {
                     var19 = var8 + var11[var18];
                     if(var1 >= var19 && var1 < var19 + var12[var18]) {
                        this.anIntArray9243[var1 + -2145294317 * this.anInt9277 * var17] = var5;
                     }
                  }

                  var2 += var15;
                  ++var1;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var15 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var4 += var2;
            if(var2 < var13) {
               var1 += (var13 - var2) * var15;
               var2 = var13;
            }

            if(var4 >= var14) {
               var4 = var14 - 1;
            }

            var16 = var5 >>> 24;
            if(0 == var6 || var6 == 1 && var16 == 255) {
               while(var2 <= var4) {
                  var17 = var1 >> 16;
                  var18 = var2 - var9;
                  var19 = var11[var18] + var8;
                  if(var17 >= this.anInt9247 * -217416947 && var17 < 1270312011 * this.anInt9271 && var17 >= var19 && var17 < var12[var18] + var19) {
                     this.anIntArray9243[var17 + -2145294317 * this.anInt9277 * var2] = var5;
                  }

                  var1 += var15;
                  ++var2;
               }
            } else if(1 == var6) {
               var5 = (var16 << 24) + ((var5 & '\uff00') * var16 >> 8 & '\uff00') + ((var5 & 16711935) * var16 >> 8 & 16711935);

               for(var17 = 256 - var16; var2 <= var4; ++var2) {
                  var18 = var1 >> 16;
                  var19 = var2 - var9;
                  var20 = var11[var19] + var8;
                  if(var18 >= -217416947 * this.anInt9247 && var18 < this.anInt9271 * 1270312011 && var18 >= var20 && var18 < var20 + var12[var19]) {
                     var21 = var18 + var2 * -2145294317 * this.anInt9277;
                     var22 = this.anIntArray9243[var21];
                     var22 = ((var22 & 16711935) * var17 >> 8 & 16711935) + ((var22 & '\uff00') * var17 >> 8 & '\uff00');
                     this.anIntArray9243[this.anInt9277 * -2145294317 * var2 + var18] = var5 + var22;
                  }

                  var1 += var15;
               }
            } else {
               if(2 != var6) {
                  throw new IllegalArgumentException();
               }

               while(var2 <= var4) {
                  var17 = var1 >> 16;
                  var18 = var2 - var9;
                  var19 = var11[var18] + var8;
                  if(var17 >= -217416947 * this.anInt9247 && var17 < this.anInt9271 * 1270312011 && var17 >= var19 && var17 < var19 + var12[var18]) {
                     var20 = var17 + this.anInt9277 * -2145294317 * var2;
                     var21 = this.anIntArray9243[var20];
                     var22 = var21 + var5;
                     var23 = (var5 & 16711935) + (var21 & 16711935);
                     var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                     this.anIntArray9243[var20] = var22 - var21 | var21 - (var21 >>> 8);
                  }

                  var1 += var15;
                  ++var2;
               }
            }
         }

      }
   }

   public void method2457(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9) {
      if(null != this.anIntArray9243) {
         Class162_Sub2 var10 = (Class162_Sub2)var7;
         int[] var11 = var10.anIntArray9211;
         int[] var12 = var10.anIntArray9210;
         int var13 = 1511023883 * this.anInt9267 > var9?1511023883 * this.anInt9267:var9;
         int var14 = -288042733 * this.anInt9250 < var11.length + var9?this.anInt9250 * -288042733:var9 + var11.length;
         var3 -= var1;
         var4 -= var2;
         if(var3 + var4 < 0) {
            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var15;
         int var16;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var15 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            if(var1 < this.anInt9247 * -217416947) {
               var2 += var15 * (this.anInt9247 * -217416947 - var1);
               var1 = -217416947 * this.anInt9247;
            }

            if(var3 >= 1270312011 * this.anInt9271) {
               var3 = this.anInt9271 * 1270312011 - 1;
            }

            var16 = var5 >>> 24;
            if(var6 != 0 && (1 != var6 || 255 != var16)) {
               if(1 == var6) {
                  var5 = (var16 * (var5 & 16711935) >> 8 & 16711935) + (var16 * (var5 & '\uff00') >> 8 & '\uff00') + (var16 << 24);

                  for(var17 = 256 - var16; var1 <= var3; ++var1) {
                     var18 = var2 >> 16;
                     var19 = var18 - var9;
                     if(var18 >= var13 && var18 < var14) {
                        var20 = var11[var19] + var8;
                        if(var1 >= var20 && var1 < var20 + var12[var19]) {
                           var21 = var18 * -2145294317 * this.anInt9277 + var1;
                           var22 = this.anIntArray9243[var21];
                           var22 = (var17 * (var22 & 16711935) >> 8 & 16711935) + (var17 * (var22 & '\uff00') >> 8 & '\uff00');
                           this.anIntArray9243[var21] = var22 + var5;
                        }
                     }

                     var2 += var15;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var17 = var2 >> 16;
                     var18 = var17 - var9;
                     if(var17 >= var13 && var17 < var14) {
                        var19 = var8 + var11[var18];
                        if(var1 >= var19 && var1 < var12[var18] + var19) {
                           var20 = var17 * -2145294317 * this.anInt9277 + var1;
                           var21 = this.anIntArray9243[var20];
                           var22 = var5 + var21;
                           var23 = (var5 & 16711935) + (var21 & 16711935);
                           var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                           this.anIntArray9243[var20] = var22 - var21 | var21 - (var21 >>> 8);
                        }
                     }

                     var2 += var15;
                     ++var1;
                  }
               }
            } else {
               while(var1 <= var3) {
                  var17 = var2 >> 16;
                  var18 = var17 - var9;
                  if(var17 >= var13 && var17 < var14) {
                     var19 = var8 + var11[var18];
                     if(var1 >= var19 && var1 < var19 + var12[var18]) {
                        this.anIntArray9243[var1 + -2145294317 * this.anInt9277 * var17] = var5;
                     }
                  }

                  var2 += var15;
                  ++var1;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var15 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var4 += var2;
            if(var2 < var13) {
               var1 += (var13 - var2) * var15;
               var2 = var13;
            }

            if(var4 >= var14) {
               var4 = var14 - 1;
            }

            var16 = var5 >>> 24;
            if(0 == var6 || var6 == 1 && var16 == 255) {
               while(var2 <= var4) {
                  var17 = var1 >> 16;
                  var18 = var2 - var9;
                  var19 = var11[var18] + var8;
                  if(var17 >= this.anInt9247 * -217416947 && var17 < 1270312011 * this.anInt9271 && var17 >= var19 && var17 < var12[var18] + var19) {
                     this.anIntArray9243[var17 + -2145294317 * this.anInt9277 * var2] = var5;
                  }

                  var1 += var15;
                  ++var2;
               }
            } else if(1 == var6) {
               var5 = (var16 << 24) + ((var5 & '\uff00') * var16 >> 8 & '\uff00') + ((var5 & 16711935) * var16 >> 8 & 16711935);

               for(var17 = 256 - var16; var2 <= var4; ++var2) {
                  var18 = var1 >> 16;
                  var19 = var2 - var9;
                  var20 = var11[var19] + var8;
                  if(var18 >= -217416947 * this.anInt9247 && var18 < this.anInt9271 * 1270312011 && var18 >= var20 && var18 < var20 + var12[var19]) {
                     var21 = var18 + var2 * -2145294317 * this.anInt9277;
                     var22 = this.anIntArray9243[var21];
                     var22 = ((var22 & 16711935) * var17 >> 8 & 16711935) + ((var22 & '\uff00') * var17 >> 8 & '\uff00');
                     this.anIntArray9243[this.anInt9277 * -2145294317 * var2 + var18] = var5 + var22;
                  }

                  var1 += var15;
               }
            } else {
               if(2 != var6) {
                  throw new IllegalArgumentException();
               }

               while(var2 <= var4) {
                  var17 = var1 >> 16;
                  var18 = var2 - var9;
                  var19 = var11[var18] + var8;
                  if(var17 >= -217416947 * this.anInt9247 && var17 < this.anInt9271 * 1270312011 && var17 >= var19 && var17 < var19 + var12[var18]) {
                     var20 = var17 + this.anInt9277 * -2145294317 * var2;
                     var21 = this.anIntArray9243[var20];
                     var22 = var21 + var5;
                     var23 = (var5 & 16711935) + (var21 & 16711935);
                     var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                     this.anIntArray9243[var20] = var22 - var21 | var21 - (var21 >>> 8);
                  }

                  var1 += var15;
                  ++var2;
               }
            }
         }

      }
   }

   public void method2458(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var13 = (Class162_Sub2)var7;
         int[] var14 = var13.anIntArray9211;
         int[] var15 = var13.anIntArray9210;
         int var16 = this.anInt9267 * 1511023883 > var9?1511023883 * this.anInt9267:var9;
         int var17 = -288042733 * this.anInt9250 < var9 + var14.length?-288042733 * this.anInt9250:var9 + var14.length;
         var12 <<= 8;
         var10 <<= 8;
         var11 <<= 8;
         int var18 = var10 + var11;
         var12 %= var18;
         var3 -= var1;
         var4 -= var2;
         int var19;
         int var20;
         if(var3 + var4 < 0) {
            var19 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
            var20 = var19 % var18;
            var12 = var18 + var10 - var12 - var20;
            var12 %= var18;
            if(var12 < 0) {
               var12 += var18;
            }

            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var19 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            var20 = var5 >>> 24;
            var21 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            if(0 == var6 || var6 == 1 && var20 == 255) {
               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var14[var23] + var8;
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        this.anIntArray9243[this.anInt9277 * -2145294317 * var22 + var1] = var5;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var20 << 24) + ((var5 & '\uff00') * var20 >> 8 & '\uff00') + ((var5 & 16711935) * var20 >> 8 & 16711935);

               for(var22 = 256 - var20; var1 <= var3; var12 %= var18) {
                  var23 = var2 >> 16;
                  var24 = var23 - var9;
                  if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011 && var23 >= var16 && var23 < var17 && var12 < var10) {
                     var25 = var8 + var14[var24];
                     if(var1 >= var25 && var1 < var15[var24] + var25) {
                        var26 = var1 + this.anInt9277 * -2145294317 * var23;
                        var27 = this.anIntArray9243[var26];
                        var27 = (var22 * (var27 & '\uff00') >> 8 & '\uff00') + ((var27 & 16711935) * var22 >> 8 & 16711935);
                        this.anIntArray9243[var26] = var5 + var27;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var8 + var14[var23];
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        var25 = var1 + var22 * this.anInt9277 * -2145294317;
                        var26 = this.anIntArray9243[var25];
                        var27 = var26 + var5;
                        int var28 = (var26 & 16711935) + (var5 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        this.anIntArray9243[var25] = var27 - var26 | var26 - (var26 >>> 8);
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var19 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var20 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            var4 += var2;
            var21 = var5 >>> 24;
            if(var6 == 0 || 1 == var6 && var21 == 255) {
               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= this.anInt9247 * -217416947 && var22 < 1270312011 * this.anInt9271 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var15[var23] + var8 + var14[var23]) {
                     this.anIntArray9243[var22 + var2 * this.anInt9277 * -2145294317] = var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var21 << 24) + (var21 * (var5 & '\uff00') >> 8 & '\uff00') + (var21 * (var5 & 16711935) >> 8 & 16711935);

               for(var22 = 256 - var21; var2 <= var4; var12 %= var18) {
                  var23 = var1 >> 16;
                  var24 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var23 >= -217416947 * this.anInt9247 && var23 < this.anInt9271 * 1270312011 && var12 < var10 && var23 >= var14[var24] + var8 && var23 < var8 + var14[var24] + var15[var24]) {
                     var25 = this.anInt9277 * -2145294317 * var2 + var23;
                     var26 = this.anIntArray9243[var25];
                     var26 = (var22 * (var26 & '\uff00') >> 8 & '\uff00') + ((var26 & 16711935) * var22 >> 8 & 16711935);
                     this.anIntArray9243[var23 + var2 * this.anInt9277 * -2145294317] = var26 + var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
               }
            } else {
               if(2 != var6) {
                  throw new IllegalArgumentException();
               }

               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= -217416947 * this.anInt9247 && var22 < this.anInt9271 * 1270312011 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var8 + var14[var23] + var15[var23]) {
                     var24 = -2145294317 * this.anInt9277 * var2 + var22;
                     var25 = this.anIntArray9243[var24];
                     var26 = var5 + var25;
                     var27 = (var5 & 16711935) + (var25 & 16711935);
                     var25 = (var26 - var27 & 65536) + (var27 & 16777472);
                     this.anIntArray9243[var24] = var26 - var25 | var25 - (var25 >>> 8);
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            }
         }

      }
   }

   public void method2459(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var13 = (Class162_Sub2)var7;
         int[] var14 = var13.anIntArray9211;
         int[] var15 = var13.anIntArray9210;
         int var16 = this.anInt9267 * 1511023883 > var9?1511023883 * this.anInt9267:var9;
         int var17 = -288042733 * this.anInt9250 < var9 + var14.length?-288042733 * this.anInt9250:var9 + var14.length;
         var12 <<= 8;
         var10 <<= 8;
         var11 <<= 8;
         int var18 = var10 + var11;
         var12 %= var18;
         var3 -= var1;
         var4 -= var2;
         int var19;
         int var20;
         if(var3 + var4 < 0) {
            var19 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
            var20 = var19 % var18;
            var12 = var18 + var10 - var12 - var20;
            var12 %= var18;
            if(var12 < 0) {
               var12 += var18;
            }

            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var19 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            var20 = var5 >>> 24;
            var21 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            if(0 == var6 || var6 == 1 && var20 == 255) {
               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var14[var23] + var8;
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        this.anIntArray9243[this.anInt9277 * -2145294317 * var22 + var1] = var5;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var20 << 24) + ((var5 & '\uff00') * var20 >> 8 & '\uff00') + ((var5 & 16711935) * var20 >> 8 & 16711935);

               for(var22 = 256 - var20; var1 <= var3; var12 %= var18) {
                  var23 = var2 >> 16;
                  var24 = var23 - var9;
                  if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011 && var23 >= var16 && var23 < var17 && var12 < var10) {
                     var25 = var8 + var14[var24];
                     if(var1 >= var25 && var1 < var15[var24] + var25) {
                        var26 = var1 + this.anInt9277 * -2145294317 * var23;
                        var27 = this.anIntArray9243[var26];
                        var27 = (var22 * (var27 & '\uff00') >> 8 & '\uff00') + ((var27 & 16711935) * var22 >> 8 & 16711935);
                        this.anIntArray9243[var26] = var5 + var27;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var8 + var14[var23];
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        var25 = var1 + var22 * this.anInt9277 * -2145294317;
                        var26 = this.anIntArray9243[var25];
                        var27 = var26 + var5;
                        int var28 = (var26 & 16711935) + (var5 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        this.anIntArray9243[var25] = var27 - var26 | var26 - (var26 >>> 8);
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var19 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var20 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            var4 += var2;
            var21 = var5 >>> 24;
            if(var6 == 0 || 1 == var6 && var21 == 255) {
               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= this.anInt9247 * -217416947 && var22 < 1270312011 * this.anInt9271 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var15[var23] + var8 + var14[var23]) {
                     this.anIntArray9243[var22 + var2 * this.anInt9277 * -2145294317] = var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var21 << 24) + (var21 * (var5 & '\uff00') >> 8 & '\uff00') + (var21 * (var5 & 16711935) >> 8 & 16711935);

               for(var22 = 256 - var21; var2 <= var4; var12 %= var18) {
                  var23 = var1 >> 16;
                  var24 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var23 >= -217416947 * this.anInt9247 && var23 < this.anInt9271 * 1270312011 && var12 < var10 && var23 >= var14[var24] + var8 && var23 < var8 + var14[var24] + var15[var24]) {
                     var25 = this.anInt9277 * -2145294317 * var2 + var23;
                     var26 = this.anIntArray9243[var25];
                     var26 = (var22 * (var26 & '\uff00') >> 8 & '\uff00') + ((var26 & 16711935) * var22 >> 8 & 16711935);
                     this.anIntArray9243[var23 + var2 * this.anInt9277 * -2145294317] = var26 + var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
               }
            } else {
               if(2 != var6) {
                  throw new IllegalArgumentException();
               }

               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= -217416947 * this.anInt9247 && var22 < this.anInt9271 * 1270312011 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var8 + var14[var23] + var15[var23]) {
                     var24 = -2145294317 * this.anInt9277 * var2 + var22;
                     var25 = this.anIntArray9243[var24];
                     var26 = var5 + var25;
                     var27 = (var5 & 16711935) + (var25 & 16711935);
                     var25 = (var26 - var27 & 65536) + (var27 & 16777472);
                     this.anIntArray9243[var24] = var26 - var25 | var25 - (var25 >>> 8);
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            }
         }

      }
   }

   public void method2255(int var1, int var2, int var3, int var4, int var5, int var6, Class162 var7, int var8, int var9, int var10, int var11, int var12) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var13 = (Class162_Sub2)var7;
         int[] var14 = var13.anIntArray9211;
         int[] var15 = var13.anIntArray9210;
         int var16 = this.anInt9267 * 1511023883 > var9?1511023883 * this.anInt9267:var9;
         int var17 = -288042733 * this.anInt9250 < var9 + var14.length?-288042733 * this.anInt9250:var9 + var14.length;
         var12 <<= 8;
         var10 <<= 8;
         var11 <<= 8;
         int var18 = var10 + var11;
         var12 %= var18;
         var3 -= var1;
         var4 -= var2;
         int var19;
         int var20;
         if(var3 + var4 < 0) {
            var19 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
            var20 = var19 % var18;
            var12 = var18 + var10 - var12 - var20;
            var12 %= var18;
            if(var12 < 0) {
               var12 += var18;
            }

            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         int var27;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var19 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
            var3 += var1;
            var20 = var5 >>> 24;
            var21 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            if(0 == var6 || var6 == 1 && var20 == 255) {
               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var14[var23] + var8;
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        this.anIntArray9243[this.anInt9277 * -2145294317 * var22 + var1] = var5;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var20 << 24) + ((var5 & '\uff00') * var20 >> 8 & '\uff00') + ((var5 & 16711935) * var20 >> 8 & 16711935);

               for(var22 = 256 - var20; var1 <= var3; var12 %= var18) {
                  var23 = var2 >> 16;
                  var24 = var23 - var9;
                  if(var1 >= this.anInt9247 * -217416947 && var1 < this.anInt9271 * 1270312011 && var23 >= var16 && var23 < var17 && var12 < var10) {
                     var25 = var8 + var14[var24];
                     if(var1 >= var25 && var1 < var15[var24] + var25) {
                        var26 = var1 + this.anInt9277 * -2145294317 * var23;
                        var27 = this.anIntArray9243[var26];
                        var27 = (var22 * (var27 & '\uff00') >> 8 & '\uff00') + ((var27 & 16711935) * var22 >> 8 & 16711935);
                        this.anIntArray9243[var26] = var5 + var27;
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               while(var1 <= var3) {
                  var22 = var2 >> 16;
                  var23 = var22 - var9;
                  if(var1 >= -217416947 * this.anInt9247 && var1 < this.anInt9271 * 1270312011 && var22 >= var16 && var22 < var17 && var12 < var10) {
                     var24 = var8 + var14[var23];
                     if(var1 >= var24 && var1 < var15[var23] + var24) {
                        var25 = var1 + var22 * this.anInt9277 * -2145294317;
                        var26 = this.anIntArray9243[var25];
                        var27 = var26 + var5;
                        int var28 = (var26 & 16711935) + (var5 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        this.anIntArray9243[var25] = var27 - var26 | var26 - (var26 >>> 8);
                     }
                  }

                  var2 += var19;
                  ++var1;
                  var12 += var21;
                  var12 %= var18;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var19 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var20 = (int)Math.sqrt((double)(65536 + (var19 >> 8) * (var19 >> 8)));
            var4 += var2;
            var21 = var5 >>> 24;
            if(var6 == 0 || 1 == var6 && var21 == 255) {
               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= this.anInt9247 * -217416947 && var22 < 1270312011 * this.anInt9271 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var15[var23] + var8 + var14[var23]) {
                     this.anIntArray9243[var22 + var2 * this.anInt9277 * -2145294317] = var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            } else if(1 == var6) {
               var5 = (var21 << 24) + (var21 * (var5 & '\uff00') >> 8 & '\uff00') + (var21 * (var5 & 16711935) >> 8 & 16711935);

               for(var22 = 256 - var21; var2 <= var4; var12 %= var18) {
                  var23 = var1 >> 16;
                  var24 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var23 >= -217416947 * this.anInt9247 && var23 < this.anInt9271 * 1270312011 && var12 < var10 && var23 >= var14[var24] + var8 && var23 < var8 + var14[var24] + var15[var24]) {
                     var25 = this.anInt9277 * -2145294317 * var2 + var23;
                     var26 = this.anIntArray9243[var25];
                     var26 = (var22 * (var26 & '\uff00') >> 8 & '\uff00') + ((var26 & 16711935) * var22 >> 8 & 16711935);
                     this.anIntArray9243[var23 + var2 * this.anInt9277 * -2145294317] = var26 + var5;
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
               }
            } else {
               if(2 != var6) {
                  throw new IllegalArgumentException();
               }

               while(var2 <= var4) {
                  var22 = var1 >> 16;
                  var23 = var2 - var9;
                  if(var2 >= var16 && var2 < var17 && var22 >= -217416947 * this.anInt9247 && var22 < this.anInt9271 * 1270312011 && var12 < var10 && var22 >= var8 + var14[var23] && var22 < var8 + var14[var23] + var15[var23]) {
                     var24 = -2145294317 * this.anInt9277 * var2 + var22;
                     var25 = this.anIntArray9243[var24];
                     var26 = var5 + var25;
                     var27 = (var5 & 16711935) + (var25 & 16711935);
                     var25 = (var26 - var27 & 65536) + (var27 & 16777472);
                     this.anIntArray9243[var24] = var26 - var25 | var25 - (var25 >>> 8);
                  }

                  var1 += var19;
                  ++var2;
                  var12 += var20;
                  var12 %= var18;
               }
            }
         }

      }
   }

   public Class153 method2310(Class173 var1, boolean var2) {
      int var3 = var1.method2168();
      int var4 = var1.method2175();
      Object var11;
      if(var2 && !var1.method2224() && var1.method2166()) {
         Class173_Sub2 var12 = (Class173_Sub2)var1;
         int[] var6 = new int[var12.anIntArray9857.length];
         byte[] var7 = new byte[var3 * var4];

         int var8;
         for(var8 = 0; var8 < var4; ++var8) {
            int var9 = var3 * var8;

            for(int var10 = 0; var10 < var3; ++var10) {
               var7[var9 + var10] = var12.aByteArray9858[var10 + var9];
            }
         }

         for(var8 = 0; var8 < var12.anIntArray9857.length; ++var8) {
            var6[var8] = var12.anIntArray9857[var8];
         }

         var11 = new Class153_Sub1_Sub3(this, var7, var6, var3, var4);
      } else {
         int[] var5 = var1.method2204(false);
         if(var1.method2224()) {
            var11 = new Class153_Sub1_Sub1(this, var5, var3, var4);
         } else {
            var11 = new Class153_Sub1_Sub2(this, var5, var3, var4);
         }
      }

      ((Class153)var11).method1828(var1.method2170(), var1.method2172(), var1.method2171(), var1.method2173());
      return (Class153)var11;
   }

   void method2450(int var1, int var2, int var3, int var4, int var5) {
      if(null != this.anIntArray9243) {
         if(var2 >= this.anInt9267 * 1511023883 && var2 < this.anInt9250 * -288042733) {
            if(var1 < this.anInt9247 * -217416947) {
               var3 -= this.anInt9247 * -217416947 - var1;
               var1 = -217416947 * this.anInt9247;
            }

            if(var1 + var3 > 1270312011 * this.anInt9271) {
               var3 = 1270312011 * this.anInt9271 - var1;
            }

            int var6 = var1 + this.anInt9277 * -2145294317 * var2;
            int var7 = var4 >>> 24;
            int var8;
            if(var5 != 0 && (var5 != 1 || 255 != var7)) {
               int var9;
               int var10;
               if(1 == var5) {
                  var4 = ((var4 & 16711935) * var7 >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00') + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = this.anIntArray9243[var6 + var9];
                     var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     this.anIntArray9243[var6 + var9] = var4 + var10;
                  }
               } else {
                  if(2 != var5) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = this.anIntArray9243[var8 + var6];
                     var10 = var4 + var9;
                     int var11 = (var9 & 16711935) + (var4 & 16711935);
                     var9 = (var10 - var11 & 65536) + (var11 & 16777472);
                     this.anIntArray9243[var8 + var6] = var10 - var9 | var9 - (var9 >>> 8);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  this.anIntArray9243[var6 + var8] = var4;
               }
            }

         }
      }
   }

   public boolean method2576() {
      return false;
   }

   public int method2448(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = this.aClass433_9240.aFloatArray4841[2] * (float)var1 + this.aClass433_9240.aFloatArray4841[14] + (float)var2 * this.aClass433_9240.aFloatArray4841[6] + (float)var3 * this.aClass433_9240.aFloatArray4841[10];
      float var9 = (float)var6 * this.aClass433_9240.aFloatArray4841[10] + this.aClass433_9240.aFloatArray4841[14] + (float)var4 * this.aClass433_9240.aFloatArray4841[2] + this.aClass433_9240.aFloatArray4841[6] * (float)var5;
      float var10 = this.aClass433_9240.aFloatArray4841[11] * (float)var3 + this.aClass433_9240.aFloatArray4841[3] * (float)var1 + this.aClass433_9240.aFloatArray4841[15] + (float)var2 * this.aClass433_9240.aFloatArray4841[7];
      float var11 = (float)var6 * this.aClass433_9240.aFloatArray4841[11] + (float)var4 * this.aClass433_9240.aFloatArray4841[3] + this.aClass433_9240.aFloatArray4841[15] + (float)var5 * this.aClass433_9240.aFloatArray4841[7];
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.aClass433_9240.aFloatArray4841[8] * (float)var3 + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[0] * (float)var1 + (float)var2 * this.aClass433_9240.aFloatArray4841[4];
      float var13 = this.aClass433_9240.aFloatArray4841[0] * (float)var4 + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[4] * (float)var5 + this.aClass433_9240.aFloatArray4841[8] * (float)var6;
      if(var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if(var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = (float)var3 * this.aClass433_9240.aFloatArray4841[9] + this.aClass433_9240.aFloatArray4841[1] * (float)var1 + this.aClass433_9240.aFloatArray4841[13] + (float)var2 * this.aClass433_9240.aFloatArray4841[5];
      float var15 = this.aClass433_9240.aFloatArray4841[5] * (float)var5 + this.aClass433_9240.aFloatArray4841[13] + (float)var4 * this.aClass433_9240.aFloatArray4841[1] + (float)var6 * this.aClass433_9240.aFloatArray4841[9];
      if(var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if(var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   public void method2468(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aClass115Array9273.length; ++var4) {
         Class115 var5 = this.aClass115Array9273[var4];
         var5.anInt1379 = (var1 & 16777215) * 1466571737;
         int var6 = 1196864617 * var5.anInt1379 >>> 16 & 255;
         if(var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.anInt1379 * 1196864617 >> 8 & 255;
         if(var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.anInt1379 * 1196864617 & 255;
         if(var8 < 2) {
            var8 = 2;
         }

         var5.anInt1379 = (var6 << 16 | var7 << 8 | var8) * 1466571737;
         if(var2 < 0) {
            var5.aBool1376 = false;
         } else {
            var5.aBool1376 = true;
         }
      }

   }

   boolean method2557(int var1, int var2, int var3, int var4, Class445 var5, Class437 var6) {
      Class433 var7 = this.method2318();
      var7.method5110(var5);
      var7.method5085(this.aClass433_9240);
      return var6.method5150(var1, var2, var3, var4, var7, this.aFloat9278, this.aFloat9269, this.aFloat9266, this.aFloat9268);
   }

   public void method2279(Class445 var1, Class164 var2, Class437 var3) {
      Class433 var4 = this.method2318();
      var4.method5110(var1);
      var4.method5085(this.aClass433_9240);
      var2.method1928(var3, this.aClass433_9260, var4, this.aFloat9278, this.aFloat9269, this.aFloat9266, this.aFloat9268);
   }

   public Class526_Sub16 method2335(int var1, int var2, int var3, int var4, int var5, float var6) {
      return null;
   }

   public Class184_Sub2 method2566() {
      return new Class184_Sub2_Sub3(this);
   }

   public long method2419(int var1, int var2) {
      return 0L;
   }

   public Class526_Sub8 method2605(int var1) {
      return null;
   }

   public boolean method2612() {
      return false;
   }

   public void method2474(Class526_Sub8 var1) {
   }

   public void method2329(Class433 var1) {
      this.aClass433_9260.method5083(var1);
      this.method8510();
   }

   public void method2292(Class178 var1) {
   }

   public void method2430() {
      this.anInt9262 = 0;
      this.anInt9248 = 0;
      this.anInt9272 = -1135900517 * this.anInt9277;
      this.anInt9265 = this.anInt9245 * -807304407;
      this.method8519();
   }

   public Class153 method2478(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = false;
      int var8 = var2;

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var1[var8++] >>> 24;
            if(0 != var11 && 255 != var11) {
               var7 = true;
               return (Class153)(var7?new Class153_Sub1_Sub1(this, var1, var2, var3, var4, var5, var6):new Class153_Sub1_Sub2(this, var1, var2, var3, var4, var5, var6));
            }
         }
      }

      return (Class153)(var7?new Class153_Sub1_Sub1(this, var1, var2, var3, var4, var5, var6):new Class153_Sub1_Sub2(this, var1, var2, var3, var4, var5, var6));
   }

   Class184_Sub1 method2286(Canvas var1, int var2, int var3) {
      return Class481.method5764(this, var1, var2, var3, 1508825702);
   }

   public Class153 method2480(int var1, int var2, int var3, int var4, boolean var5) {
      if(null == this.anIntArray9243) {
         throw new IllegalStateException("");
      } else {
         int[] var6 = new int[var4 * var3];
         int var7 = var1 + this.anInt9277 * -2145294317 * var2;
         int var8 = -2145294317 * this.anInt9277 - var3;

         for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var3 * var9;

            for(int var11 = 0; var11 < var3; ++var11) {
               var6[var10 + var11] = this.anIntArray9243[var7++];
            }

            var7 += var8;
         }

         if(var5) {
            return new Class153_Sub1_Sub1(this, var6, var3, var4);
         } else {
            return new Class153_Sub1_Sub2(this, var6, var3, var4);
         }
      }
   }

   public Class153 method2481(int var1, int var2, int var3, int var4, boolean var5) {
      if(null == this.anIntArray9243) {
         throw new IllegalStateException("");
      } else {
         int[] var6 = new int[var4 * var3];
         int var7 = var1 + this.anInt9277 * -2145294317 * var2;
         int var8 = -2145294317 * this.anInt9277 - var3;

         for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var3 * var9;

            for(int var11 = 0; var11 < var3; ++var11) {
               var6[var10 + var11] = this.anIntArray9243[var7++];
            }

            var7 += var8;
         }

         if(var5) {
            return new Class153_Sub1_Sub1(this, var6, var3, var4);
         } else {
            return new Class153_Sub1_Sub2(this, var6, var3, var4);
         }
      }
   }

   public Class162 method2511(int var1, int var2, int[] var3, int[] var4) {
      return new Class162_Sub2(var1, var2, var3, var4);
   }

   public void method2506(Class177 var1) {
      this.method8508(this.anIntArray9243 != null, null != this.aFloatArray9246, false, var1);
   }

   public void method2615(int var1, Class162 var2, int var3, int var4) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var5 = (Class162_Sub2)var2;
         int[] var6 = var5.anIntArray9211;
         int[] var7 = var5.anIntArray9210;
         int var8;
         if(-288042733 * this.anInt9250 < var4 + var6.length) {
            var8 = -288042733 * this.anInt9250 - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(this.anInt9267 * 1511023883 > var4) {
            var9 = 1511023883 * this.anInt9267 - var4;
            var4 = this.anInt9267 * 1511023883;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = var4 * -2145294317 * this.anInt9277;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var3 + var6[var11];
               int var13 = var7[var11];
               if(-217416947 * this.anInt9247 > var12) {
                  var13 -= this.anInt9247 * -217416947 - var12;
                  var12 = -217416947 * this.anInt9247;
               }

               if(1270312011 * this.anInt9271 < var12 + var13) {
                  var13 = this.anInt9271 * 1270312011 - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.anIntArray9243[var12++] = var1;
               }

               var10 += this.anInt9277 * -2145294317;
            }

         }
      }
   }

   public void method2361(int var1, Class162 var2, int var3, int var4) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var5 = (Class162_Sub2)var2;
         int[] var6 = var5.anIntArray9211;
         int[] var7 = var5.anIntArray9210;
         int var8;
         if(-288042733 * this.anInt9250 < var4 + var6.length) {
            var8 = -288042733 * this.anInt9250 - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(this.anInt9267 * 1511023883 > var4) {
            var9 = 1511023883 * this.anInt9267 - var4;
            var4 = this.anInt9267 * 1511023883;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = var4 * -2145294317 * this.anInt9277;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var3 + var6[var11];
               int var13 = var7[var11];
               if(-217416947 * this.anInt9247 > var12) {
                  var13 -= this.anInt9247 * -217416947 - var12;
                  var12 = -217416947 * this.anInt9247;
               }

               if(1270312011 * this.anInt9271 < var12 + var13) {
                  var13 = this.anInt9271 * 1270312011 - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.anIntArray9243[var12++] = var1;
               }

               var10 += this.anInt9277 * -2145294317;
            }

         }
      }
   }

   public void method2589(int var1, Class162 var2, int var3, int var4) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var5 = (Class162_Sub2)var2;
         int[] var6 = var5.anIntArray9211;
         int[] var7 = var5.anIntArray9210;
         int var8;
         if(-288042733 * this.anInt9250 < var4 + var6.length) {
            var8 = -288042733 * this.anInt9250 - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(this.anInt9267 * 1511023883 > var4) {
            var9 = 1511023883 * this.anInt9267 - var4;
            var4 = this.anInt9267 * 1511023883;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = var4 * -2145294317 * this.anInt9277;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var3 + var6[var11];
               int var13 = var7[var11];
               if(-217416947 * this.anInt9247 > var12) {
                  var13 -= this.anInt9247 * -217416947 - var12;
                  var12 = -217416947 * this.anInt9247;
               }

               if(1270312011 * this.anInt9271 < var12 + var13) {
                  var13 = this.anInt9271 * 1270312011 - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.anIntArray9243[var12++] = var1;
               }

               var10 += this.anInt9277 * -2145294317;
            }

         }
      }
   }

   public void method2262(int var1, Class162 var2, int var3, int var4) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var5 = (Class162_Sub2)var2;
         int[] var6 = var5.anIntArray9211;
         int[] var7 = var5.anIntArray9210;
         int var8;
         if(-288042733 * this.anInt9250 < var4 + var6.length) {
            var8 = -288042733 * this.anInt9250 - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(this.anInt9267 * 1511023883 > var4) {
            var9 = 1511023883 * this.anInt9267 - var4;
            var4 = this.anInt9267 * 1511023883;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = var4 * -2145294317 * this.anInt9277;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var3 + var6[var11];
               int var13 = var7[var11];
               if(-217416947 * this.anInt9247 > var12) {
                  var13 -= this.anInt9247 * -217416947 - var12;
                  var12 = -217416947 * this.anInt9247;
               }

               if(1270312011 * this.anInt9271 < var12 + var13) {
                  var13 = this.anInt9271 * 1270312011 - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.anIntArray9243[var12++] = var1;
               }

               var10 += this.anInt9277 * -2145294317;
            }

         }
      }
   }

   boolean method8514(int var1) {
      Class171 var2 = this.aClass169_2035.method2122(var1, (byte)62);
      return var2.aByte1991 != 0 || var2.aByte1992 != 0;
   }

   public void method2489(int var1, Class162 var2, int var3, int var4) {
      if(this.anIntArray9243 != null) {
         Class162_Sub2 var5 = (Class162_Sub2)var2;
         int[] var6 = var5.anIntArray9211;
         int[] var7 = var5.anIntArray9210;
         int var8;
         if(-288042733 * this.anInt9250 < var4 + var6.length) {
            var8 = -288042733 * this.anInt9250 - var4;
         } else {
            var8 = var6.length;
         }

         int var9;
         if(this.anInt9267 * 1511023883 > var4) {
            var9 = 1511023883 * this.anInt9267 - var4;
            var4 = this.anInt9267 * 1511023883;
         } else {
            var9 = 0;
         }

         if(var8 - var9 > 0) {
            int var10 = var4 * -2145294317 * this.anInt9277;

            for(int var11 = var9; var11 < var8; ++var11) {
               int var12 = var3 + var6[var11];
               int var13 = var7[var11];
               if(-217416947 * this.anInt9247 > var12) {
                  var13 -= this.anInt9247 * -217416947 - var12;
                  var12 = -217416947 * this.anInt9247;
               }

               if(1270312011 * this.anInt9271 < var12 + var13) {
                  var13 = this.anInt9271 * 1270312011 - var12;
               }

               var12 += var10;

               for(int var14 = -var13; var14 < 0; ++var14) {
                  this.anIntArray9243[var12++] = var1;
               }

               var10 += this.anInt9277 * -2145294317;
            }

         }
      }
   }

   public Class163 method2490(Class1 var1, Class173[] var2, boolean var3) {
      int[] var4 = new int[var2.length];
      int[] var5 = new int[var2.length];
      boolean var6 = false;
      boolean var7 = false;

      for(int var8 = 0; var8 < var2.length; ++var8) {
         var4[var8] = var2[var8].method2168();
         var5[var8] = var2[var8].method2175();
         if(var2[var8].method2224()) {
            var6 = true;
         }

         if(var2[var8].method2166()) {
            var7 = true;
         }
      }

      if(var3) {
         if(var7) {
            if(var6) {
               return new Class163_Sub1(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            } else {
               return new Class163_Sub6(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
            }
         } else if(var6) {
            return new Class163_Sub1(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         } else {
            return new Class163_Sub6(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
         }
      } else if(var7) {
         if(var6) {
            throw new IllegalArgumentException("");
         } else {
            return new Class163_Sub2(this, var1, (Class173_Sub2[])((Class173_Sub2[])var2), var4, var5);
         }
      } else {
         return new Class163_Sub3(this, var1, (Class173_Sub1[])((Class173_Sub1[])var2), var4, var5);
      }
   }

   public void method2609() {
      this.aClass184_Sub2_9279 = null;
      this.aClass153_9264 = null;
   }

   public void method2630(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(null != this.anIntArray9243) {
         var3 -= var1;
         var4 -= var2;
         if(0 == var4) {
            if(var3 >= 0) {
               this.method2293(var1, var2, 1 + var3, var5, var6);
            } else {
               this.method2293(var1 + var3, var2, -var3 + 1, var5, var6);
            }

         } else if(0 == var3) {
            if(var4 >= 0) {
               this.method2294(var1, var2, var4 + 1, var5, var6);
            } else {
               this.method2294(var1, var4 + var2, 1 + -var4, var5, var6);
            }

         } else {
            if(var3 + var4 < 0) {
               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var7 = (int)Math.floor(0.5D + (double)var4 / (double)var3);
               var3 += var1;
               if(var1 < -217416947 * this.anInt9247) {
                  var2 += (-217416947 * this.anInt9247 - var1) * var7;
                  var1 = this.anInt9247 * -217416947;
               }

               if(var3 >= this.anInt9271 * 1270312011) {
                  var3 = 1270312011 * this.anInt9271 - 1;
               }

               var8 = var5 >>> 24;
               if(var6 == 0 || var6 == 1 && 255 == var8) {
                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= this.anInt9267 * 1511023883 && var9 < this.anInt9250 * -288042733) {
                        this.anIntArray9243[var9 * this.anInt9277 * -2145294317 + var1] = var5;
                     }

                     var2 += var7;
                     ++var1;
                  }
               } else if(var6 == 1) {
                  var5 = (var8 * (var5 & 16711935) >> 8 & 16711935) + (var8 * (var5 & '\uff00') >> 8 & '\uff00') + (var8 << 24);

                  for(var9 = 256 - var8; var1 <= var3; ++var1) {
                     var10 = var2 >> 16;
                     if(var10 >= 1511023883 * this.anInt9267 && var10 < this.anInt9250 * -288042733) {
                        var11 = var10 * -2145294317 * this.anInt9277 + var1;
                        var12 = this.anIntArray9243[var11];
                        var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                        this.anIntArray9243[var11] = var12 + var5;
                     }

                     var2 += var7;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= this.anInt9267 * 1511023883 && var9 < -288042733 * this.anInt9250) {
                        var10 = -2145294317 * this.anInt9277 * var9 + var1;
                        var11 = this.anIntArray9243[var10];
                        var12 = var11 + var5;
                        var13 = (var11 & 16711935) + (var5 & 16711935);
                        var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                        this.anIntArray9243[var10] = var12 - var11 | var11 - (var11 >>> 8);
                     }

                     var2 += var7;
                     ++var1;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var7 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               if(var2 < 1511023883 * this.anInt9267) {
                  var1 += (1511023883 * this.anInt9267 - var2) * var7;
                  var2 = this.anInt9267 * 1511023883;
               }

               if(var4 >= this.anInt9250 * -288042733) {
                  var4 = this.anInt9250 * -288042733 - 1;
               }

               var8 = var5 >>> 24;
               if(0 == var6 || 1 == var6 && 255 == var8) {
                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= this.anInt9247 * -217416947 && var9 < 1270312011 * this.anInt9271) {
                        this.anIntArray9243[var2 * this.anInt9277 * -2145294317 + var9] = var5;
                     }

                     var1 += var7;
                     ++var2;
                  }
               } else if(1 == var6) {
                  var5 = (var8 * (var5 & 16711935) >> 8 & 16711935) + ((var5 & '\uff00') * var8 >> 8 & '\uff00') + (var8 << 24);

                  for(var9 = 256 - var8; var2 <= var4; ++var2) {
                     var10 = var1 >> 16;
                     if(var10 >= -217416947 * this.anInt9247 && var10 < 1270312011 * this.anInt9271) {
                        var11 = var10 + this.anInt9277 * -2145294317 * var2;
                        var12 = this.anIntArray9243[var11];
                        var12 = ((var12 & '\uff00') * var9 >> 8 & '\uff00') + ((var12 & 16711935) * var9 >> 8 & 16711935);
                        this.anIntArray9243[var10 + var2 * -2145294317 * this.anInt9277] = var5 + var12;
                     }

                     var1 += var7;
                  }
               } else {
                  if(2 != var6) {
                     throw new IllegalArgumentException();
                  }

                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= -217416947 * this.anInt9247 && var9 < this.anInt9271 * 1270312011) {
                        var10 = var2 * this.anInt9277 * -2145294317 + var9;
                        var11 = this.anIntArray9243[var10];
                        var12 = var11 + var5;
                        var13 = (var5 & 16711935) + (var11 & 16711935);
                        var11 = (var12 - var13 & 65536) + (var13 & 16777472);
                        this.anIntArray9243[var10] = var12 - var11 | var11 - (var11 >>> 8);
                     }

                     var1 += var7;
                     ++var2;
                  }
               }
            }

         }
      }
   }

   public void method2493(int var1) {
      Class168_Sub3.anInt9372 = var1;
      Class168_Sub3.anInt9366 = var1;
      if(this.anInt9249 * 768566339 > 1) {
         throw new IllegalStateException();
      } else {
         this.method8505(this.anInt9249 * 768566339);
         this.method8511(0);
      }
   }

   public void method2558() {
      for(int var1 = 0; var1 < this.aClass115Array9273.length; ++var1) {
         this.aClass115Array9273[var1].anInt1379 = this.aClass115Array9273[var1].anInt1380 * -661853511;
         this.aClass115Array9273[var1].aBool1381 = false;
      }

   }

   public void method2495(int var1) {
      Class168_Sub3.anInt9372 = var1;
      Class168_Sub3.anInt9366 = var1;
      if(this.anInt9249 * 768566339 > 1) {
         throw new IllegalStateException();
      } else {
         this.method8505(this.anInt9249 * 768566339);
         this.method8511(0);
      }
   }

   public void method2339() {
      this.aClass184_Sub2_9279 = null;
      this.aClass153_9264 = null;
   }

   public int method2608(int var1, int var2) {
      var1 |= 133120;
      return var1 & var2 ^ var2;
   }

   public int method2501() {
      return 0;
   }

   public Class445 method2499() {
      Class115 var1 = this.method8502(Thread.currentThread());
      return var1.aClass445_1386;
   }

   public Class445 method2500() {
      Class115 var1 = this.method8502(Thread.currentThread());
      return var1.aClass445_1386;
   }

   public int method2414() {
      return -1;
   }

   public int method2368() {
      return 0;
   }

   public Class526_Sub16 method2503(int var1, int var2, int var3, int var4, int var5, float var6) {
      return null;
   }

   public void method2504(int var1, Class526_Sub16[] var2) {
   }

   void method8515() {
      this.aClass433_9258.method5110(this.aClass445_9257);
      this.aClass433_9240.method5083(this.aClass433_9258);
      this.aClass433_9240.method5085(this.aClass433_9260);
      this.aClass433_9240.method5142(this.aFloatArrayArray9261[0]);
      this.aClass433_9240.method5131(this.aFloatArrayArray9261[1]);
      this.aClass433_9240.method5100(this.aFloatArrayArray9261[2]);
      this.aClass433_9240.method5101(this.aFloatArrayArray9261[3]);
      this.aClass433_9240.method5102(this.aFloatArrayArray9261[4]);
      this.aClass433_9240.method5103(this.aFloatArrayArray9261[5]);
      float var1 = this.aClass433_9260.method5099();
      float var2 = this.aClass433_9260.aFloatArray4841[14] + (var1 - 255.0F) * this.aClass433_9260.aFloatArray4841[10];
      float var3 = this.aClass433_9260.aFloatArray4841[10] * var1 + this.aClass433_9260.aFloatArray4841[14];
      float var4 = var3 - var2;

      for(int var5 = 0; var5 < 768566339 * this.anInt9249; ++var5) {
         Class115 var6 = this.aClass115Array9273[var5];
         var6.aFloat1377 = var2;
         var6.aFloat1378 = var4;
      }

   }

   public void method2514(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aClass115Array9273.length; ++var4) {
         Class115 var5 = this.aClass115Array9273[var4];
         var5.anInt1379 = (var1 & 16777215) * 1466571737;
         int var6 = 1196864617 * var5.anInt1379 >>> 16 & 255;
         if(var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.anInt1379 * 1196864617 >> 8 & 255;
         if(var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.anInt1379 * 1196864617 & 255;
         if(var8 < 2) {
            var8 = 2;
         }

         var5.anInt1379 = (var6 << 16 | var7 << 8 | var8) * 1466571737;
         if(var2 < 0) {
            var5.aBool1376 = false;
         } else {
            var5.aBool1376 = true;
         }
      }

   }

   void method8516(int var1) {
      this.anInt9249 = 1084557419 * var1;
      this.aClass115Array9273 = new Class115[this.anInt9249 * 768566339];

      for(int var2 = 0; var2 < this.anInt9249 * 768566339; ++var2) {
         this.aClass115Array9273[var2] = new Class115(this);
      }

   }

   public boolean method2603() {
      return false;
   }

   public void method2354() {
      for(int var1 = 0; var1 < this.aClass115Array9273.length; ++var1) {
         this.aClass115Array9273[var1].anInt1379 = this.aClass115Array9273[var1].anInt1380 * -661853511;
         this.aClass115Array9273[var1].aBool1381 = false;
      }

   }

   public Class178 method2477(int var1) {
      return null;
   }

   int[] method8517(int var1) {
      Class192 var2 = this.aClass192_9274;
      Class526_Sub22 var3;
      synchronized(var2) {
         var3 = (Class526_Sub22)this.aClass192_9274.method2765((long)(var1 & '\uffff') | Long.MIN_VALUE);
         if(var3 == null) {
            Class171 var4 = this.aClass169_2035.method2122(var1, (byte)26);
            int var5 = -1178632371 * var4.anInt1985;
            if(!this.anInterface24_2034.method162(Class595.aClass595_7846, var1, Class603.aClass603_7887, 0.7F, var5, var5, true, -354942798)) {
               return null;
            }

            int[] var6;
            if(Class593.aClass593_7817 != var4.aClass593_1982) {
               var6 = this.anInterface24_2034.method144(Class595.aClass595_7846, var1, 0.7F, var5, var5, true, 2040667789);
            } else {
               var6 = this.anInterface24_2034.method143(Class595.aClass595_7846, var1, 0.7F, var5, var5, true, 1014844582);
            }

            var3 = new Class526_Sub22(var1, var5, var6, Class593.aClass593_7816 != var4.aClass593_1982);
            this.aClass192_9274.method2781(var3, (long)(var1 & '\uffff') | Long.MIN_VALUE, var5 * var5, (byte)-4);
         }
      }

      var3.aBool10537 = true;
      return var3.method9447();
   }

   public int method2496(int var1, int var2) {
      var1 |= 133120;
      return var1 & var2 ^ var2;
   }

   public Class445 method2228() {
      return new Class445(this.aClass445_9257);
   }

   public Class445 method2507() {
      return new Class445(this.aClass445_9257);
   }

   public void method2508(Class433 var1) {
      this.aClass433_9260.method5083(var1);
      this.method8510();
   }

   public void method2509(Class433 var1) {
      this.aClass433_9260.method5083(var1);
      this.method8510();
   }

   public int[] method2392() {
      return null;
   }

   public void method2520(float var1, float var2, float var3, float var4, float var5) {
   }

   public void method2377(Class433 var1) {
      this.aClass433_9260.method5083(var1);
      this.method8510();
   }

   public void method2583(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      boolean var14 = this.anIntArray9243 != null;
      boolean var15 = null != this.aFloatArray9246;
      if(var14 || var15) {
         Class115 var16 = this.method8502(Thread.currentThread());
         Class121 var17 = var16.aClass121_1387;
         var17.aBool1530 = false;
         var1 -= -217416947 * this.anInt9247;
         var4 -= this.anInt9247 * -217416947;
         var7 -= this.anInt9247 * -217416947;
         var2 -= this.anInt9267 * 1511023883;
         var5 -= this.anInt9267 * 1511023883;
         var8 -= this.anInt9267 * 1511023883;
         var17.aBool1556 = var1 < 0 || var1 > var17.anInt1542 || var4 < 0 || var4 > var17.anInt1542 || var7 < 0 || var7 > var17.anInt1542;
         int var18 = var10 >>> 24;
         if(var13 == 0 || var13 == 1 && 255 == var18) {
            var17.anInt1543 = 0;
            var17.aBool1531 = false;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         } else if(var13 == 1) {
            var17.anInt1543 = 255 - var18;
            var17.aBool1531 = false;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         } else {
            if(var13 != 2) {
               throw new IllegalArgumentException();
            }

            var17.anInt1543 = 128;
            var17.aBool1531 = true;
            var17.method1469(var14, var15, false, (float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
         }

         var17.aBool1530 = true;
      }
   }

   public Class433 method2618() {
      return new Class433(this.aClass433_9260);
   }

   public void method2591(int[] var1) {
      var1[0] = -217416947 * this.anInt9247;
      var1[1] = this.anInt9267 * 1511023883;
      var1[2] = this.anInt9271 * 1270312011;
      var1[3] = this.anInt9250 * -288042733;
   }

   public void method2529(float var1) {
      this.anInt9256 = 1515946617 * (int)(65535.0F * var1);
   }

   public void method2388(int var1) {
   }

   public void method2517(int var1) {
   }

   public boolean method2348() {
      return false;
   }

   public void method2497(float var1, float var2) {
      this.aFloat9270 = var2 - var1;
      this.aFloat9241 = var2 + var1 - 1.0F;

      for(int var3 = 0; var3 < this.anInt9249 * 768566339; ++var3) {
         Class115 var4 = this.aClass115Array9273[var3];
         Class121 var5 = var4.aClass121_1387;
         var5.aFloat1541 = this.aFloat9270;
         var5.aFloat1547 = this.aFloat9241;
      }

   }

   public void method2521(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aClass115Array9273.length; ++var4) {
         Class115 var5 = this.aClass115Array9273[var4];
         var5.anInt1379 = (var1 & 16777215) * 1466571737;
         int var6 = 1196864617 * var5.anInt1379 >>> 16 & 255;
         if(var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.anInt1379 * 1196864617 >> 8 & 255;
         if(var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.anInt1379 * 1196864617 & 255;
         if(var8 < 2) {
            var8 = 2;
         }

         var5.anInt1379 = (var6 << 16 | var7 << 8 | var8) * 1466571737;
         if(var2 < 0) {
            var5.aBool1376 = false;
         } else {
            var5.aBool1376 = true;
         }
      }

   }

   void method8518(int var1) {
      this.anInt9249 = 1084557419 * var1;
      this.aClass115Array9273 = new Class115[this.anInt9249 * 768566339];

      for(int var2 = 0; var2 < this.anInt9249 * 768566339; ++var2) {
         this.aClass115Array9273[var2] = new Class115(this);
      }

   }

   public Class178 method2487(int var1) {
      return null;
   }

   public Class178 method2444(int var1) {
      return null;
   }

   public boolean method2264() {
      return true;
   }

   public Class178 method2524(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return null;
   }

   public Class178 method2525(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return null;
   }

   public Class184_Sub2 method2346() {
      return new Class184_Sub2_Sub3(this);
   }

   public Class178 method2527(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return null;
   }

   public void method2317(int var1, int var2, int var3, int var4) {
      if(this.anInt9247 * -217416947 < var1) {
         this.anInt9247 = var1 * 1204603845;
      }

      if(this.anInt9267 * 1511023883 < var2) {
         this.anInt9267 = var2 * 228933283;
      }

      if(this.anInt9271 * 1270312011 > var3) {
         this.anInt9271 = var3 * -113115805;
      }

      if(-288042733 * this.anInt9250 > var4) {
         this.anInt9250 = var4 * -624189157;
      }

      this.method8519();
   }

   public void method2528(Class178 var1) {
   }

   public void method2449(Class178 var1) {
   }

   public void method2622(int var1, int var2, int var3, int var4) {
   }

   public void method2531(int var1, int var2, int var3, int var4) {
   }

   public void method2445(int var1, int var2, int var3, int var4) {
   }

   public void method2600(int var1, int var2, int var3, int var4) {
   }

   public Class433 method2587() {
      return new Class433(this.aClass433_9260);
   }

   public void method2535(int var1, int var2) {
   }

   public boolean method2578() {
      return false;
   }

   public boolean method2610() {
      return false;
   }

   public Class526_Sub8 method2471(int var1) {
      return null;
   }

   public Class162 method2483(int var1, int var2, int[] var3, int[] var4) {
      return new Class162_Sub2(var1, var2, var3, var4);
   }

   public void method2540(float var1, float var2, float var3, float var4, float var5) {
   }

   public Class176 method2585(int[] var1) {
      return null;
   }

   public Class176 method2543(int[] var1) {
      return null;
   }

   public boolean method2544() {
      return false;
   }

   public boolean method2545() {
      return false;
   }

   public void method2546(Class176 var1, float var2, Class176 var3, float var4, Class176 var5, float var6) {
   }

   public void method2547(Class176 var1, float var2, Class176 var3, float var4, Class176 var5, float var6) {
   }

   public boolean method2485() {
      return false;
   }

   public void method2549() {
   }

   public boolean method2550() {
      return false;
   }

   public boolean method2551() {
      return false;
   }

   public boolean method2552() {
      return false;
   }

   public boolean method2411() {
      return false;
   }

   public boolean method2370() {
      return false;
   }

   public Class184_Sub2 method2563() {
      return new Class184_Sub2_Sub3(this);
   }

   public void method2446(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.aClass115Array9273.length; ++var4) {
         Class115 var5 = this.aClass115Array9273[var4];
         var5.anInt1379 = (var1 & 16777215) * 1466571737;
         int var6 = 1196864617 * var5.anInt1379 >>> 16 & 255;
         if(var6 < 2) {
            var6 = 2;
         }

         int var7 = var5.anInt1379 * 1196864617 >> 8 & 255;
         if(var7 < 2) {
            var7 = 2;
         }

         int var8 = var5.anInt1379 * 1196864617 & 255;
         if(var8 < 2) {
            var8 = 2;
         }

         var5.anInt1379 = (var6 << 16 | var7 << 8 | var8) * 1466571737;
         if(var2 < 0) {
            var5.aBool1376 = false;
         } else {
            var5.aBool1376 = true;
         }
      }

   }

   public Class153 method2380(Class173 var1, boolean var2) {
      int var3 = var1.method2168();
      int var4 = var1.method2175();
      Object var11;
      if(var2 && !var1.method2224() && var1.method2166()) {
         Class173_Sub2 var12 = (Class173_Sub2)var1;
         int[] var6 = new int[var12.anIntArray9857.length];
         byte[] var7 = new byte[var3 * var4];

         int var8;
         for(var8 = 0; var8 < var4; ++var8) {
            int var9 = var3 * var8;

            for(int var10 = 0; var10 < var3; ++var10) {
               var7[var9 + var10] = var12.aByteArray9858[var10 + var9];
            }
         }

         for(var8 = 0; var8 < var12.anIntArray9857.length; ++var8) {
            var6[var8] = var12.anIntArray9857[var8];
         }

         var11 = new Class153_Sub1_Sub3(this, var7, var6, var3, var4);
      } else {
         int[] var5 = var1.method2204(false);
         if(var1.method2224()) {
            var11 = new Class153_Sub1_Sub1(this, var5, var3, var4);
         } else {
            var11 = new Class153_Sub1_Sub2(this, var5, var3, var4);
         }
      }

      ((Class153)var11).method1828(var1.method2170(), var1.method2172(), var1.method2171(), var1.method2173());
      return (Class153)var11;
   }

   public void method2631() {
      for(int var1 = 0; var1 < this.aClass115Array9273.length; ++var1) {
         this.aClass115Array9273[var1].anInt1379 = this.aClass115Array9273[var1].anInt1380 * -661853511;
         this.aClass115Array9273[var1].aBool1381 = false;
      }

   }

   public void method2425() {
      for(int var1 = 0; var1 < this.aClass115Array9273.length; ++var1) {
         this.aClass115Array9273[var1].anInt1379 = this.aClass115Array9273[var1].anInt1380 * -661853511;
         this.aClass115Array9273[var1].aBool1381 = false;
      }

   }

   public void method2513(float var1, float var2, float var3, float[] var4) {
      float var5 = this.aClass433_9240.aFloatArray4841[7] * var2 + this.aClass433_9240.aFloatArray4841[3] * var1 + this.aClass433_9240.aFloatArray4841[15] + this.aClass433_9240.aFloatArray4841[11] * var3;
      float var6 = var2 * this.aClass433_9240.aFloatArray4841[4] + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[0] * var1 + this.aClass433_9240.aFloatArray4841[8] * var3;
      float var7 = var3 * this.aClass433_9240.aFloatArray4841[9] + this.aClass433_9240.aFloatArray4841[13] + this.aClass433_9240.aFloatArray4841[1] * var1 + var2 * this.aClass433_9240.aFloatArray4841[5];
      float var8 = this.aClass433_9258.aFloatArray4841[2] * var1 + this.aClass433_9258.aFloatArray4841[14] + this.aClass433_9258.aFloatArray4841[6] * var2 + this.aClass433_9258.aFloatArray4841[10] * var3;
      var4[0] = this.aFloat9278 + this.aFloat9266 * var6 / var5;
      var4[1] = var7 * this.aFloat9268 / var5 + this.aFloat9269;
      var4[2] = var8;
   }

   public void method2559() {
      for(int var1 = 0; var1 < this.aClass115Array9273.length; ++var1) {
         this.aClass115Array9273[var1].anInt1379 = this.aClass115Array9273[var1].anInt1380 * -661853511;
         this.aClass115Array9273[var1].aBool1381 = false;
      }

   }

   public void method2560(float var1, float var2, float var3, float[] var4) {
      float var5 = this.aClass433_9240.aFloatArray4841[7] * var2 + this.aClass433_9240.aFloatArray4841[3] * var1 + this.aClass433_9240.aFloatArray4841[15] + this.aClass433_9240.aFloatArray4841[11] * var3;
      float var6 = var2 * this.aClass433_9240.aFloatArray4841[4] + this.aClass433_9240.aFloatArray4841[12] + this.aClass433_9240.aFloatArray4841[0] * var1 + this.aClass433_9240.aFloatArray4841[8] * var3;
      float var7 = var3 * this.aClass433_9240.aFloatArray4841[9] + this.aClass433_9240.aFloatArray4841[13] + this.aClass433_9240.aFloatArray4841[1] * var1 + var2 * this.aClass433_9240.aFloatArray4841[5];
      float var8 = this.aClass433_9258.aFloatArray4841[2] * var1 + this.aClass433_9258.aFloatArray4841[14] + this.aClass433_9258.aFloatArray4841[6] * var2 + this.aClass433_9258.aFloatArray4841[10] * var3;
      var4[0] = this.aFloat9278 + this.aFloat9266 * var6 / var5;
      var4[1] = var7 * this.aFloat9268 / var5 + this.aFloat9269;
      var4[2] = var8;
   }

   public void method2256(float var1, float var2, float var3, float[] var4) {
      float var5 = this.aClass433_9240.aFloatArray4841[2] * var1 + this.aClass433_9240.aFloatArray4841[14] + var2 * this.aClass433_9240.aFloatArray4841[6] + var3 * this.aClass433_9240.aFloatArray4841[10];
      float var6 = var2 * this.aClass433_9240.aFloatArray4841[7] + this.aClass433_9240.aFloatArray4841[15] + var1 * this.aClass433_9240.aFloatArray4841[3] + this.aClass433_9240.aFloatArray4841[11] * var3;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = this.aClass433_9240.aFloatArray4841[8] * var3 + var2 * this.aClass433_9240.aFloatArray4841[4] + this.aClass433_9240.aFloatArray4841[12] + var1 * this.aClass433_9240.aFloatArray4841[0];
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = var3 * this.aClass433_9240.aFloatArray4841[9] + var2 * this.aClass433_9240.aFloatArray4841[5] + this.aClass433_9240.aFloatArray4841[1] * var1 + this.aClass433_9240.aFloatArray4841[13];
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = var3 * this.aClass433_9258.aFloatArray4841[10] + this.aClass433_9258.aFloatArray4841[6] * var2 + this.aClass433_9258.aFloatArray4841[14] + this.aClass433_9258.aFloatArray4841[2] * var1;
               var4[0] = this.aFloat9278 + var7 * this.aFloat9266 / var6;
               var4[1] = this.aFloat9269 + this.aFloat9268 * var8 / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   public void method2561(float var1, float var2, float var3, float[] var4) {
      float var5 = this.aClass433_9240.aFloatArray4841[2] * var1 + this.aClass433_9240.aFloatArray4841[14] + var2 * this.aClass433_9240.aFloatArray4841[6] + var3 * this.aClass433_9240.aFloatArray4841[10];
      float var6 = var2 * this.aClass433_9240.aFloatArray4841[7] + this.aClass433_9240.aFloatArray4841[15] + var1 * this.aClass433_9240.aFloatArray4841[3] + this.aClass433_9240.aFloatArray4841[11] * var3;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = this.aClass433_9240.aFloatArray4841[8] * var3 + var2 * this.aClass433_9240.aFloatArray4841[4] + this.aClass433_9240.aFloatArray4841[12] + var1 * this.aClass433_9240.aFloatArray4841[0];
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = var3 * this.aClass433_9240.aFloatArray4841[9] + var2 * this.aClass433_9240.aFloatArray4841[5] + this.aClass433_9240.aFloatArray4841[1] * var1 + this.aClass433_9240.aFloatArray4841[13];
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = var3 * this.aClass433_9258.aFloatArray4841[10] + this.aClass433_9258.aFloatArray4841[6] * var2 + this.aClass433_9258.aFloatArray4841[14] + this.aClass433_9258.aFloatArray4841[2] * var1;
               var4[0] = this.aFloat9278 + var7 * this.aFloat9266 / var6;
               var4[1] = this.aFloat9269 + this.aFloat9268 * var8 / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   public Class184_Sub2 method2467() {
      return new Class184_Sub2_Sub3(this);
   }

   void method8519() {
      int var1 = this.anInt9271 * 1270312011 - -217416947 * this.anInt9247;
      int var2 = this.anInt9250 * -288042733 - this.anInt9267 * 1511023883;
      float var3 = this.aFloat9266 = (float)(-1602754071 * this.anInt9272) / 2.0F;
      float var4 = this.aFloat9268 = (float)(this.anInt9265 * 697483999) / 2.0F;
      this.aFloat9278 = (float)(this.anInt9262 * 1670515195) + var3;
      this.aFloat9269 = (float)(this.anInt9248 * -2102713899) + var4;

      int var5;
      for(var5 = 0; var5 < this.anInt9249 * 768566339; ++var5) {
         Class115 var6 = this.aClass115Array9273[var5];
         Class121 var7 = var6.aClass121_1387;
         var7.aFloat1537 = var3;
         var7.aFloat1539 = var4;
         var7.aFloat1534 = this.aFloat9278 - (float)(this.anInt9247 * -217416947);
         var7.aFloat1553 = this.aFloat9269 - (float)(1511023883 * this.anInt9267);
         var7.anInt1542 = var1;
         var7.anInt1540 = var2;
      }

      var5 = this.anInt9247 * -217416947 + -2145294317 * this.anInt9277 * 1511023883 * this.anInt9267;

      for(int var8 = 1511023883 * this.anInt9267; var8 < this.anInt9250 * -288042733; ++var8) {
         for(int var9 = 0; var9 < this.anInt9249 * 768566339; ++var9) {
            this.aClass115Array9273[var9].aClass121_1387.anIntArray1538[var8 - 1511023883 * this.anInt9267] = var5;
         }

         var5 += this.anInt9277 * -2145294317;
      }

   }

   public Class178 method2526(Class178 var1, Class178 var2, float var3, Class178 var4) {
      return null;
   }

   public Class184_Sub2 method2565() {
      return new Class184_Sub2_Sub3(this);
   }

   public void method2428(float var1) {
      this.anInt9256 = 1515946617 * (int)(65535.0F * var1);
   }

   public void method2594(int var1, float var2, float var3, float var4, float var5, float var6) {
      this.anInt9254 = (int)(65535.0F * var2) * -1648925117;
      this.anInt9255 = 140935795 * (int)(65535.0F * var3);
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var4 * var4 + var6 * var6));
      this.anInt9251 = 901291439 * (int)(var4 * 65535.0F / var7);
      this.anInt9252 = (int)(var5 * 65535.0F / var7) * -292802653;
      this.anInt9253 = -773368501 * (int)(var6 * 65535.0F / var7);
   }

   public void method2320(int var1) {
      Class168_Sub3.anInt9372 = var1;
      Class168_Sub3.anInt9366 = var1;
      if(this.anInt9249 * 768566339 > 1) {
         throw new IllegalStateException();
      } else {
         this.method8505(this.anInt9249 * 768566339);
         this.method8511(0);
      }
   }

   public Interface21 method2568(int var1, int var2, Class144 var3, Class166 var4, int var5) {
      return this.method8506(var1, var2);
   }

   public void method2282(int[] var1) {
      var1[0] = -217416947 * this.anInt9247;
      var1[1] = this.anInt9267 * 1511023883;
      var1[2] = this.anInt9271 * 1270312011;
      var1[3] = this.anInt9250 * -288042733;
   }

   public Interface23 method2620(int var1, int var2) {
      return new Class130(var1, var2);
   }

   public Interface23 method2571(int var1, int var2, int var3) {
      return new Class130(var1, var2);
   }

   public Interface23 method2572(int var1, int var2, int var3) {
      return new Class130(var1, var2);
   }

   public String method2322() {
      return "";
   }

   public Class153 method2597(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = false;
      int var8 = var2;

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var1[var8++] >>> 24;
            if(0 != var11 && 255 != var11) {
               var7 = true;
               return (Class153)(var7?new Class153_Sub1_Sub1(this, var1, var2, var3, var4, var5, var6):new Class153_Sub1_Sub2(this, var1, var2, var3, var4, var5, var6));
            }
         }
      }

      return (Class153)(var7?new Class153_Sub1_Sub1(this, var1, var2, var3, var4, var5, var6):new Class153_Sub1_Sub2(this, var1, var2, var3, var4, var5, var6));
   }

   void method8520(int var1, int var2, int[] var3, float[] var4) {
      this.anInt9277 = var1 * 1420468763;
      this.anInt9245 = 234302215 * var2;
      this.anIntArray9243 = var3;
      this.aFloatArray9246 = var4;

      for(int var5 = 0; var5 < 768566339 * this.anInt9249; ++var5) {
         this.aClass115Array9273[var5].method1404((byte)-56);
      }

      this.method2278();
      this.method2274();
   }

   public boolean method2577() {
      return false;
   }

   public Class148 method2365(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new Class148_Sub1(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public boolean method2579() {
      return true;
   }

   public boolean method2580() {
      return false;
   }

   public void method2359(boolean var1) {
   }

   public boolean method2581() {
      return false;
   }

   public void method2556(int var1, int var2, int var3, int var4) {
      if(this.anInt9247 * -217416947 < var1) {
         this.anInt9247 = var1 * 1204603845;
      }

      if(this.anInt9267 * 1511023883 < var2) {
         this.anInt9267 = var2 * 228933283;
      }

      if(this.anInt9271 * 1270312011 > var3) {
         this.anInt9271 = var3 * -113115805;
      }

      if(-288042733 * this.anInt9250 > var4) {
         this.anInt9250 = var4 * -624189157;
      }

      this.method8519();
   }

   public Class168 method2584(Class170 var1, int var2, int var3, int var4, int var5) {
      return new Class168_Sub3(this, var1, var2, var4, var5, var3);
   }

   public Interface23 method2259(int var1, int var2, int var3) {
      return new Class130(var1, var2);
   }

   public Class148 method2586(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new Class148_Sub1(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public Class148 method2280(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new Class148_Sub1(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public Class433 method2382() {
      Class115 var1 = this.method8502(Thread.currentThread());
      return var1.aClass433_1385;
   }

   public Class433 method2291() {
      Class115 var1 = this.method8502(Thread.currentThread());
      return var1.aClass433_1385;
   }

   public void method2462(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(null != this.anIntArray9243) {
         Class115 var8 = this.method8502(Thread.currentThread());
         Class121 var9 = var8.aClass121_1387;
         int var10 = var3 - var1;
         int var11 = var4 - var2;
         int var12 = var10 >= 0?var10:-var10;
         int var13 = var11 >= 0?var11:-var11;
         int var14 = var12;
         if(var12 < var13) {
            var14 = var13;
         }

         if(0 != var14) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            var10 += var15 >> 16;
            var11 += var16 >> 16;
            if(var16 <= var15) {
               var15 = -var15;
            } else {
               var16 = -var16;
            }

            int var17 = var6 * var16 >> 17;
            int var18 = var6 * var16 + 1 >> 17;
            int var19 = var6 * var15 >> 17;
            int var20 = var15 * var6 + 1 >> 17;
            var1 -= var9.method1453();
            var2 -= var9.method1454();
            int var21 = var17 + var1;
            int var22 = var1 - var18;
            int var23 = var10 + var1 - var18;
            int var24 = var10 + var1 + var17;
            int var25 = var2 + var19;
            int var26 = var2 - var20;
            int var27 = var11 + var2 - var20;
            int var28 = var11 + var2 + var19;
            if(0 == var7) {
               var9.anInt1543 = 0;
            } else {
               if(1 != var7) {
                  throw new IllegalArgumentException();
               }

               var9.anInt1543 = 255 - (var5 >>> 24);
            }

            this.method2328(false);
            var9.aBool1556 = var21 < 0 || var21 > var9.anInt1542 || var22 < 0 || var22 > var9.anInt1542 || var23 < 0 || var23 > var9.anInt1542;
            var9.method1459(true, false, false, (float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0F, 100.0F, 100.0F, var5);
            var9.aBool1556 = var21 < 0 || var21 > var9.anInt1542 || var23 < 0 || var23 > var9.anInt1542 || var24 < 0 || var24 > var9.anInt1542;
            var9.method1459(true, false, false, (float)var25, (float)var27, (float)var28, (float)var21, (float)var23, (float)var24, 100.0F, 100.0F, 100.0F, var5);
            this.method2328(true);
         }
      }
   }

   public void method2590(int[] var1) {
      var1[0] = -217416947 * this.anInt9247;
      var1[1] = this.anInt9267 * 1511023883;
      var1[2] = this.anInt9271 * 1270312011;
      var1[3] = this.anInt9250 * -288042733;
   }

   Class174_Sub1(Canvas var1, Class169 var2, Interface24 var3, Interface47 var4, Interface49 var5, Interface46 var6, int var7, int var8) {
      this(var2, var3, var4, var5, var6);

      try {
         this.method2249(var1, var7, var8, 962177455);
         this.method2252(var1, (byte)78);
      } catch (Throwable var10) {
         var10.printStackTrace();
         this.method2232(1135751733);
         throw new RuntimeException("");
      }
   }

   public void method2592(Class445 var1) {
      this.aClass445_9257 = var1;
      this.method8510();
   }

   public boolean method2299() {
      return true;
   }

   public boolean method2343() {
      return false;
   }
}
