package com.jagex;

import com.jagex.Class33;
import com.jagex.Class402;
import com.jagex.Class526_Sub31;

public class Class526_Sub31_Sub1 extends Class526_Sub31 {
   static final int anInt11771 = 4;
   static final int anInt11772 = 4;
   static final int anInt11773 = 1638;
   static final boolean aBool11774 = true;
   static final int anInt11777 = 0;
   static final int anInt11781 = 8;
   byte[] aByteArray11779 = new byte[512];
   int anInt11783 = -2099359684;
   short[] aShortArray11775;
   short[] aShortArray11776;
   int anInt11784 = 0;
   int anInt11778 = -1352788932;
   int anInt11780 = 586306676;
   int anInt11782 = 495383770;
   boolean aBool11770 = true;

   void method10663(int var1, int[] var2, int var3) {
      int var4 = Class33.anIntArray366[var1] * 188011829 * this.anInt11780;
      short var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      if(1 == this.anInt11783 * -1359422737) {
         var5 = this.aShortArray11775[0];
         var6 = this.aShortArray11776[0] << 12;
         var7 = this.anInt11780 * 188011829 * var6 >> 12;
         var8 = this.anInt11778 * -1265710609 * var6 >> 12;
         var9 = var4 * var6 >> 12;
         var10 = var9 >> 12;
         var11 = var10 + 1;
         if(var11 >= var7) {
            var11 = 0;
         }

         var9 &= 4095;
         var12 = Class402.anIntArray4143[var9];
         var13 = this.aByteArray11779[var10 & 255] & 255;
         var14 = this.aByteArray11779[var11 & 255] & 255;
         if(this.aBool11770) {
            for(var15 = 0; var15 < -1119729145 * Class33.anInt363; ++var15) {
               var16 = -1265710609 * this.anInt11778 * Class33.anIntArray365[var15];
               var17 = this.method10669(var16 * var6 >> 12, var9, var13, var14, var12, var8, 1995387947);
               var17 = var17 * var5 >> 12;
               var2[var15] = (var17 >> 1) + 2048;
            }
         } else {
            for(var15 = 0; var15 < Class33.anInt363 * -1119729145; ++var15) {
               var16 = this.anInt11778 * -1265710609 * Class33.anIntArray365[var15];
               var17 = this.method10669(var6 * var16 >> 12, var9, var13, var14, var12, var8, -742727165);
               var2[var15] = var17 * var5 >> 12;
            }
         }
      } else {
         var5 = this.aShortArray11775[0];
         if(var5 > 8 || var5 < -8) {
            var6 = this.aShortArray11776[0] << 12;
            var7 = 188011829 * this.anInt11780 * var6 >> 12;
            var8 = this.anInt11778 * -1265710609 * var6 >> 12;
            var9 = var4 * var6 >> 12;
            var10 = var9 >> 12;
            var11 = 1 + var10;
            if(var11 >= var7) {
               var11 = 0;
            }

            var9 &= 4095;
            var12 = Class402.anIntArray4143[var9];
            var13 = this.aByteArray11779[var10 & 255] & 255;
            var14 = this.aByteArray11779[var11 & 255] & 255;

            for(var15 = 0; var15 < Class33.anInt363 * -1119729145; ++var15) {
               var16 = -1265710609 * this.anInt11778 * Class33.anIntArray365[var15];
               var17 = this.method10669(var16 * var6 >> 12, var9, var13, var14, var12, var8, 545836616);
               var2[var15] = var17 * var5 >> 12;
            }
         }

         for(int var18 = 1; var18 < -1359422737 * this.anInt11783; ++var18) {
            var5 = this.aShortArray11775[var18];
            if(var5 > 8 || var5 < -8) {
               var6 = this.aShortArray11776[var18] << 12;
               var7 = var6 * this.anInt11780 * 188011829 >> 12;
               var8 = this.anInt11778 * -1265710609 * var6 >> 12;
               var9 = var6 * var4 >> 12;
               var10 = var9 >> 12;
               var11 = var10 + 1;
               if(var11 >= var7) {
                  var11 = 0;
               }

               var9 &= 4095;
               var12 = Class402.anIntArray4143[var9];
               var13 = this.aByteArray11779[var10 & 255] & 255;
               var14 = this.aByteArray11779[var11 & 255] & 255;
               if(this.aBool11770 && var18 == this.anInt11783 * -1359422737 - 1) {
                  for(var15 = 0; var15 < Class33.anInt363 * -1119729145; ++var15) {
                     var16 = -1265710609 * this.anInt11778 * Class33.anIntArray365[var15];
                     var17 = this.method10669(var16 * var6 >> 12, var9, var13, var14, var12, var8, -1044136553);
                     var17 = var2[var15] + (var17 * var5 >> 12);
                     var2[var15] = (var17 >> 1) + 2048;
                  }
               } else {
                  for(var15 = 0; var15 < -1119729145 * Class33.anInt363; ++var15) {
                     var16 = this.anInt11778 * -1265710609 * Class33.anIntArray365[var15];
                     var17 = this.method10669(var6 * var16 >> 12, var9, var13, var14, var12, var8, 214307569);
                     var2[var15] += var5 * var17 >> 12;
                  }
               }
            }
         }
      }

   }

   void method10664(short var1) {
      this.aByteArray11779 = Class33.method805(-829178933 * this.anInt11784, -1069395334);
      this.method10665((byte)-9);

      for(int var2 = this.anInt11783 * -1359422737 - 1; var2 >= 1; --var2) {
         short var3 = this.aShortArray11775[var2];
         if(var3 > 8 || var3 < -8) {
            break;
         }

         this.anInt11783 -= -1598581745;
      }

   }

   void method10665(byte var1) {
      int var2;
      if(this.anInt11782 * -922292193 > 0) {
         this.aShortArray11775 = new short[-1359422737 * this.anInt11783];
         this.aShortArray11776 = new short[-1359422737 * this.anInt11783];

         for(var2 = 0; var2 < -1359422737 * this.anInt11783; ++var2) {
            this.aShortArray11775[var2] = (short)((int)(Math.pow((double)((float)(this.anInt11782 * -922292193) / 4096.0F), (double)var2) * 4096.0D));
            this.aShortArray11776[var2] = (short)((int)Math.pow(2.0D, (double)var2));
         }
      } else if(null != this.aShortArray11775 && this.aShortArray11775.length == this.anInt11783 * -1359422737) {
         this.aShortArray11776 = new short[this.anInt11783 * -1359422737];

         for(var2 = 0; var2 < -1359422737 * this.anInt11783; ++var2) {
            this.aShortArray11776[var2] = (short)((int)Math.pow(2.0D, (double)var2));
         }
      }

   }

   void method10666() {
      int var1;
      if(this.anInt11782 * -922292193 > 0) {
         this.aShortArray11775 = new short[-1359422737 * this.anInt11783];
         this.aShortArray11776 = new short[-1359422737 * this.anInt11783];

         for(var1 = 0; var1 < -1359422737 * this.anInt11783; ++var1) {
            this.aShortArray11775[var1] = (short)((int)(Math.pow((double)((float)(this.anInt11782 * -922292193) / 4096.0F), (double)var1) * 4096.0D));
            this.aShortArray11776[var1] = (short)((int)Math.pow(2.0D, (double)var1));
         }
      } else if(null != this.aShortArray11775 && this.aShortArray11775.length == this.anInt11783 * -1359422737) {
         this.aShortArray11776 = new short[this.anInt11783 * -1359422737];

         for(var1 = 0; var1 < -1359422737 * this.anInt11783; ++var1) {
            this.aShortArray11776[var1] = (short)((int)Math.pow(2.0D, (double)var1));
         }
      }

   }

   void method10667() {
      this.aByteArray11779 = Class33.method805(-829178933 * this.anInt11784, -1738247966);
      this.method10665((byte)-113);

      for(int var1 = this.anInt11783 * -1359422737 - 1; var1 >= 1; --var1) {
         short var2 = this.aShortArray11775[var1];
         if(var2 > 8 || var2 < -8) {
            break;
         }

         this.anInt11783 -= -1598581745;
      }

   }

   void method10668() {
      this.aByteArray11779 = Class33.method805(-829178933 * this.anInt11784, -1417847918);
      this.method10665((byte)-10);

      for(int var1 = this.anInt11783 * -1359422737 - 1; var1 >= 1; --var1) {
         short var2 = this.aShortArray11775[var1];
         if(var2 > 8 || var2 < -8) {
            break;
         }

         this.anInt11783 -= -1598581745;
      }

   }

   int method10669(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 >> 12;
      int var9 = 1 + var8;
      if(var9 >= var6) {
         var9 = 0;
      }

      var1 &= 4095;
      var8 &= 255;
      var9 &= 255;
      int var10 = var1 - 4096;
      int var11 = var2 - 4096;
      int var12 = Class402.anIntArray4143[var1];
      int var13 = this.aByteArray11779[var3 + var8] & 3;
      int var14;
      if(var13 <= 1) {
         var14 = var13 == 0?var2 + var1:var2 - var1;
      } else {
         var14 = 2 == var13?var1 - var2:-var1 - var2;
      }

      var13 = this.aByteArray11779[var3 + var9] & 3;
      int var15;
      if(var13 <= 1) {
         var15 = 0 == var13?var2 + var10:var2 - var10;
      } else {
         var15 = 2 == var13?var10 - var2:-var10 - var2;
      }

      int var16 = var14 + ((var15 - var14) * var12 >> 12);
      var13 = this.aByteArray11779[var8 + var4] & 3;
      if(var13 <= 1) {
         var14 = var13 == 0?var11 + var1:var11 - var1;
      } else {
         var14 = 2 == var13?var1 - var11:-var1 - var11;
      }

      var13 = this.aByteArray11779[var9 + var4] & 3;
      if(var13 <= 1) {
         var15 = 0 == var13?var10 + var11:var11 - var10;
      } else {
         var15 = 2 == var13?var10 - var11:-var10 - var11;
      }

      int var17 = (var12 * (var15 - var14) >> 12) + var14;
      return (var5 * (var17 - var16) >> 12) + var16;
   }

   Class526_Sub31_Sub1() {
      super(0, true);
   }
}
