package com.jagex;

import com.jagex.Class153;
import com.jagex.Class159;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class171;
import com.jagex.Class174;
import com.jagex.Class182;
import com.jagex.InterfaceDef;
import com.jagex.Class280;
import com.jagex.Class433;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class511;
import com.jagex.Class526_Sub39;
import com.jagex.Class546;
import com.jagex.Class568;
import com.jagex.Class583;
import com.jagex.Class585;
import com.jagex.Class593;
import com.jagex.Class595;
import com.jagex.Class603;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.client;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class Class498 {
   static final int anInt5579 = 512;
   public static int anInt5592;
   int anInt5591;
   boolean aBool5583;
   Class498 aClass498_5588;
   int anInt5589;
   int anInt5575 = -1740613631;
   boolean aBool5571 = true;
   int anInt5576;
   int anInt5590;
   int anInt5568;
   int anInt5569;
   Class511[] aClass511Array5572;
   Class583 aClass583_5580;
   Class511[] aClass511Array5573;
   Class511 aClass511_5578;
   int anInt5584;
   Class168 aClass168_5577;
   int anInt5570;
   Class153 aClass153_5587;
   int anInt5574;
   byte[] aByteArray5586;
   int anInt5581;
   int anInt5585;
   int anInt5582;

   public static void method5922() {
      Class511.method6168();
   }

   public boolean method5923() {
      return this.aBool5583;
   }

   public void method5924(Class498 var1, int var2) {
      if(this.aBool5583) {
         this.anInt5591 = -1017076869 * this.anInt5589;
      } else if(null != var1 && var1.aBool5583) {
         this.anInt5591 = 770349207 - var1.anInt5589 * -1017076869;
      } else {
         this.anInt5591 = 0;
      }

      this.aBool5583 = true;
      this.aClass498_5588 = var1;
      this.anInt5589 = 0;
   }

   public void method5925(int var1) {
      this.aBool5583 = false;
      this.aClass498_5588 = null;
      this.anInt5589 = 0;
   }

   public Class498(int var1, Class511[] var2, int var3, int var4, int var5, int var6, Class583 var7, int var8) {
      this.anInt5576 = var4 * -134610163;
      this.anInt5590 = -1191250115 * var5;
      this.anInt5568 = var6 * 1418299547;
      this.anInt5569 = 1819999145 * var1;
      this.aClass511Array5572 = var2;
      this.aClass583_5580 = var7;
      if(var2 != null) {
         this.aClass511Array5573 = new Class511[var2.length];
         this.aClass511_5578 = var3 >= 0?var2[var3]:null;
      } else {
         this.aClass511Array5573 = null;
         this.aClass511_5578 = null;
      }

      this.anInt5584 = 84880619 * var8;
   }

   public Class498 method5926(int var1) {
      return this.aClass498_5588;
   }

   public boolean method5927(Class174 var1, int var2, int var3, byte var4) {
      if(2046842879 * this.anInt5575 != var2) {
         this.anInt5575 = 1740613631 * var2;
         int var5 = Class568.method6836(var2, 401485821);
         if(var5 > 512) {
            var5 = 512;
         }

         if(var5 <= 0) {
            var5 = 1;
         }

         if(this.anInt5570 * -1241451743 != var5) {
            this.anInt5570 = 1194348769 * var5;
            this.aClass153_5587 = null;
         }

         if(this.aClass511Array5572 != null) {
            this.anInt5574 = 0;
            int[] var6 = new int[this.aClass511Array5572.length];

            for(int var7 = 0; var7 < this.aClass511Array5572.length; ++var7) {
               Class511 var8 = this.aClass511Array5572[var7];
               if(var8.method6179(this.anInt5576 * 507282373, this.anInt5590 * 436738069, this.anInt5568 * -369681005, 2046842879 * this.anInt5575)) {
                  var6[-789478897 * this.anInt5574] = var8.anInt7000;
                  this.aClass511Array5573[(this.anInt5574 += -1174197009) * -789478897 - 1] = var8;
               }
            }

            Class610.method7205(var6, this.aClass511Array5573, 0, -789478897 * this.anInt5574 - 1, -22407083);
         }

         this.aBool5571 = true;
      }

      boolean var10 = false;
      if(this.aBool5571) {
         this.aBool5571 = false;

         for(int var9 = -789478897 * this.anInt5574 - 1; var9 >= 0; --var9) {
            boolean var11 = this.aClass511Array5573[var9].method6169(var1, this.aClass511_5578);
            this.aBool5571 |= !var11;
            var10 |= var11;
         }
      }

      if(0 != var3 && var1.method2241()) {
         if(null == this.aClass168_5577 && this.anInt5584 * 1713118147 >= 0) {
            this.method5928(var1, 1980988960);
         }
      } else {
         this.aClass168_5577 = null;
      }

      if(null != this.aClass498_5588 && this.aClass498_5588 != this) {
         this.aClass498_5588.method5925(-811835673);
         var10 |= this.aClass498_5588.method5927(var1, var2, var3, (byte)37);
      }

      return var10;
   }

   void method5928(Class174 var1, int var2) {
      try {
         boolean var3 = Class585.aClass466_7791.method5538(1713118147 * this.anInt5584, (byte)85);
         if(var3) {
            var1.method2364(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            Class170 var4 = Class170.method2146(Class585.aClass466_7791, this.anInt5584 * 1713118147, 0);
            this.aClass168_5577 = var1.method2321(var4, 1099776, 0, 255, 1);
            byte[] var5 = this.aClass168_5577.method2078();
            if(var5 == null) {
               this.aByteArray5586 = null;
            } else {
               this.aByteArray5586 = new byte[var5.length];
               System.arraycopy(var5, 0, this.aByteArray5586, 0, var5.length);
            }
         }
      } catch (Exception var6) {
         ;
      }

   }

   public void method5929(Class174 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, int var13) {
      int var14 = 0;
      if(this.aBool5583) {
         var14 = this.anInt5589 * 2063554627;
      }

      if(this.aClass498_5588 != null) {
         Class498 var15 = this;
         Class498 var16 = this.aClass498_5588;
         if(this.hashCode() > var16.hashCode()) {
            var15 = this.aClass498_5588;
            var16 = this;
            var14 = 255 - var14;
         }

         var15.method5930(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, (byte)-23);
         var16.method5930(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, false, var12, 255 - var14, (byte)-3);
      } else {
         if(-1501439847 * this.anInt5569 == -1) {
            var1.method2290(var3, var4, var5, var6, -16777216 | var10, 0);
         }

         this.method5930(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14, (byte)36);
      }

   }

   void method5930(Class174 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, int var13, byte var14) {
      int var15 = 255 - var13;
      var1.method2312();
      var1.method2396();
      if(this.aClass168_5577 == null) {
         var1.method2283(2, 0);
         var8 = var2 + var8 & 16383;
         if(this.anInt5569 * -1501439847 != -1 && 0 != -1241451743 * this.anInt5570) {
            Class171 var16 = Class159.aClass169_1769.method2122(this.anInt5569 * -1501439847, (byte)-89);
            if(null == this.aClass153_5587 && Class546.anInterface24_7270.method162(Class595.aClass595_7846, var16.anInt2008 * -2107547335, Class593.aClass593_7815 == var16.aClass593_1982?Class603.aClass603_7887:Class603.aClass603_7888, 0.7F, -1241451743 * this.anInt5570, -1241451743 * this.anInt5570, false, -1321202436)) {
               int[] var17 = Class593.aClass593_7815 == var16.aClass593_1982?Class546.anInterface24_7270.method144(Class595.aClass595_7846, var16.anInt2008 * -2107547335, 0.7F, -1241451743 * this.anInt5570, this.anInt5570 * -1241451743, false, 1689708893):Class546.anInterface24_7270.method143(Class595.aClass595_7846, var16.anInt2008 * -2107547335, 0.7F, -1241451743 * this.anInt5570, this.anInt5570 * -1241451743, false, 1009178635);
               this.anInt5581 = -612498803 * var17[0];
               this.anInt5585 = var17[var17.length - 1] * -1639702125;
               this.aClass153_5587 = var1.method2515(var17, 0, -1178632371 * var16.anInt1985, -1178632371 * var16.anInt1985, var16.anInt1985 * -1178632371, (byte)3);
            }

            int var24 = 255 == var15?(Class593.aClass593_7815 == var16.aClass593_1982?1:0):1;
            if(var24 == 1 && var11) {
               var1.method2290(var3, var4, var5, var6, var10, 0);
            }

            if(null != this.aClass153_5587) {
               int var18 = var7 * var6 / -4096;

               int var19;
               for(var19 = var6 * var8 / 4096 + (var5 - var6) / 2; var19 > var6; var19 -= var6) {
                  ;
               }

               while(var19 < 0) {
                  var19 += var6;
               }

               int var20;
               if(Class583.aClass583_7780 != this.aClass583_5580) {
                  while(var18 > var6) {
                     var18 -= var6;
                  }

                  while(var18 < 0) {
                     var18 += var6;
                  }

                  for(var20 = var19 - var6; var20 < var5; var20 += var6) {
                     for(int var21 = var18 - var6; var21 < var6; var21 += var6) {
                        this.aClass153_5587.method1781(var20 + var3, var21 + var4, var6, var6, 0, var15 << 24 | 16777215, var24);
                     }
                  }
               } else {
                  for(var20 = var19 - var6; var20 < var5; var20 += var6) {
                     this.aClass153_5587.method1781(var3 + var20, var18 + var4, var6, var6, 0, var15 << 24 | 16777215, var24);
                  }

                  if(0 != (this.anInt5581 * -763195323 & -16777216)) {
                     var1.method2356(0, 0, var5, 1 + var18 + var4, this.anInt5581 * -763195323, (byte)66);
                  }

                  if(0 != (138224795 * this.anInt5585 & -16777216)) {
                     var1.method2356(0, var18 + var4 + var6, var5, var6 - (var4 + var18 + var6), 138224795 * this.anInt5585, (byte)116);
                  }
               }
            }
         } else {
            var1.method2290(var3, var4, var5, var6, var15 << 24 | var10, var11?0:1);
         }
      } else if(var12) {
         Class433 var22 = var1.method2330();
         Class433 var25 = var1.method2330();
         var22.aFloatArray4841[2] = var22.aFloatArray4841[3];
         var22.aFloatArray4841[6] = var22.aFloatArray4841[7];
         var22.aFloatArray4841[10] = var22.aFloatArray4841[11];
         var22.aFloatArray4841[14] = var22.aFloatArray4841[15];
         var1.method2231(var22);
         this.method5931(var1, var7, var8, var9, var13, (byte)0);
         var1.method2231(var25);
      } else {
         if(var11) {
            var1.method2283(3, var10);
         }

         this.method5931(var1, var7, var8, var9, var13, (byte)0);
      }

      for(int var23 = -789478897 * this.anInt5574 - 1; var23 >= 0; --var23) {
         this.aClass511Array5573[var23].method6170(var1, var3, var4, var5, var6, var7, var8, 507282373 * this.anInt5576, this.anInt5590 * 436738069, this.anInt5568 * -369681005, var15);
      }

      var1.method2283(2, 0);
      var1.method2314();
   }

   void method5931(Class174 var1, int var2, int var3, int var4, int var5, byte var6) {
      Class445 var7 = var1.method2372();
      Class445 var8 = new Class445();
      var8.method5229(0.0F, 0.0F, 0.0F);
      var8.method5237(0.0F, -1.0F, 0.0F, Class443.method5200(-var3 & 16383));
      var8.method5237(-1.0F, 0.0F, 0.0F, Class443.method5200(-var2 & 16383));
      var8.method5237(0.0F, 0.0F, -1.0F, Class443.method5200(-var4 & 16383));
      var1.method2326(var8);
      Class445 var9 = new Class445();
      if(var5 != this.anInt5582 * 821940549) {
         this.aClass168_5577.method2028((byte)var5, this.aByteArray5586);
         this.anInt5582 = -2114709107 * var5;
      }

      this.aClass168_5577.method1974(var9, (Class164)null, 0);
      var1.method2326(var7);
   }

   public void method5932(Class174 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.method5929(var1, var2, var3, var4, var5, var6, var7, var8, 0, var10, true, false, 2111698948);
   }

   public static void method5933() {
      Class511.method6168();
   }

   public void method5934(int var1, int var2) {
      if(!this.aBool5583) {
         ;
      }

      this.anInt5589 = ((var2 - this.anInt5591 * 1939128281) * var1 / 255 + this.anInt5591 * 1939128281) * 838710379;
   }

   public boolean method5935(int var1) {
      return this.aBool5583;
   }

   public void method5936(int var1, int var2) {
      if(!this.aBool5583) {
         ;
      }

      this.anInt5589 = ((var2 - this.anInt5591 * 1939128281) * var1 / 255 + this.anInt5591 * 1939128281) * 838710379;
   }

   public void method5937(int var1, int var2) {
      if(!this.aBool5583) {
         ;
      }

      this.anInt5589 = ((var2 - this.anInt5591 * 1939128281) * var1 / 255 + this.anInt5591 * 1939128281) * 838710379;
   }

   public void method5938(int var1, int var2, byte var3) {
      if(!this.aBool5583) {
         ;
      }

      this.anInt5589 = ((var2 - this.anInt5591 * 1939128281) * var1 / 255 + this.anInt5591 * 1939128281) * 838710379;
   }

   public void method5939() {
      this.aBool5583 = false;
      this.aClass498_5588 = null;
      this.anInt5589 = 0;
   }

   public boolean method5940() {
      return this.aBool5583;
   }

   void method5941(Class174 var1) {
      try {
         boolean var2 = Class585.aClass466_7791.method5538(1713118147 * this.anInt5584, (byte)22);
         if(var2) {
            var1.method2364(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            Class170 var3 = Class170.method2146(Class585.aClass466_7791, this.anInt5584 * 1713118147, 0);
            this.aClass168_5577 = var1.method2321(var3, 1099776, 0, 255, 1);
            byte[] var4 = this.aClass168_5577.method2078();
            if(var4 == null) {
               this.aByteArray5586 = null;
            } else {
               this.aByteArray5586 = new byte[var4.length];
               System.arraycopy(var4, 0, this.aByteArray5586, 0, var4.length);
            }
         }
      } catch (Exception var5) {
         ;
      }

   }

   public static void method5942() {
      Class511.method6168();
   }

   static final void method5943(Class681 var0, int var1) {
      String var2 = "";
      if(null != Class182.aClipboard2095) {
         Transferable var3 = Class182.aClipboard2095.getContents((Object)null);
         if(null != var3) {
            try {
               var2 = (String)var3.getTransferData(DataFlavor.stringFlavor);
               if(null == var2) {
                  var2 = "";
               }
            } catch (Exception var5) {
               ;
            }
         }
      }

      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
   }

   static void method5944(InterfaceDef var0, int var1, int var2, boolean var3, byte var4) {
      int var5 = -99858407 * var0.anInt2510;
      int var6 = var0.anInt2576 * -667181623;
      if(var0.aByte2502 == 0) {
         var0.anInt2510 = -115525237 * var0.anInt2475;
      } else if(1 == var0.aByte2502) {
         var0.anInt2510 = 6984745 * (var1 - var0.anInt2475 * -57821549);
      } else if(var0.aByte2502 == 2) {
         var0.anInt2510 = 6984745 * (var1 * -57821549 * var0.anInt2475 >> 14);
      }

      if(var0.aByte2503 == 0) {
         var0.anInt2576 = var0.anInt2558 * 483585713;
      } else if(var0.aByte2503 == 1) {
         var0.anInt2576 = (var2 - var0.anInt2558 * 1489696249) * 1334119545;
      } else if(2 == var0.aByte2503) {
         var0.anInt2576 = 1334119545 * (var2 * var0.anInt2558 * 1489696249 >> 14);
      }

      if(4 == var0.aByte2502) {
         var0.anInt2510 = 6984745 * (-1751288197 * var0.anInt2512 * var0.anInt2576 * -667181623 / (2135192583 * var0.anInt2513));
      }

      if(4 == var0.aByte2503) {
         var0.anInt2576 = -99858407 * var0.anInt2510 * 2135192583 * var0.anInt2513 / (var0.anInt2512 * -1751288197) * 1334119545;
      }

      if(client.aBool11192 && (client.method10311(var0).anInt10547 * -798296491 != 0 || var0.type * -449120703 == 0)) {
         if(-667181623 * var0.anInt2576 < 5 && -99858407 * var0.anInt2510 < 5) {
            var0.anInt2576 = -1919336867;
            var0.anInt2510 = 34923725;
         } else {
            if(var0.anInt2576 * -667181623 <= 0) {
               var0.anInt2576 = -1919336867;
            }

            if(-99858407 * var0.anInt2510 <= 0) {
               var0.anInt2510 = 34923725;
            }
         }
      }

      if(var0.anInt2493 * -1805497315 == InterfaceDef.anInt2473 * -973105891) {
         client.aClass245_11194 = var0;
      }

      if(var3 && null != var0.anObjectArray2643 && (var5 != -99858407 * var0.anInt2510 || var6 != -667181623 * var0.anInt2576)) {
         Class526_Sub39 var7 = new Class526_Sub39();
         var7.aClass245_10694 = var0;
         var7.anObjectArray10701 = var0.anObjectArray2643;
         client.aClass702_11239.method8176(var7, -2016017520);
      }

   }

   public static void method5945(byte var0) {
      Class280.aMap3037.clear();
      Class280.aClass20_3036.method647(929030154);
      Class280.aClass696_3038.method8135((byte)-8);
      Class280.anInt3035 = 0;
   }

   static final void method5946(Class681 var0, int var1) {
      var0.anInt8623 -= -1199503753;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      int var5 = var0.anIntArray8622[3 + var0.anInt8623 * -1730576285];
      int var6 = var0.anIntArray8622[4 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (var6 - var4) * (var3 - var2) / (var5 - var4) + var2;
   }
}
