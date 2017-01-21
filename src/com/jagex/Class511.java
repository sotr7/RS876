package com.jagex;

import com.jagex.Class153;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class433;
import com.jagex.Class443;
import com.jagex.Class445;
import com.jagex.Class546;
import com.jagex.Class568;
import com.jagex.Class585;
import com.jagex.Class595;
import com.jagex.Class603;
import com.jagex.Class692;

public class Class511 {
   static final int anInt6987 = 0;
   static final int anInt6989 = 2;
   static final int anInt6999 = 1;
   static final int anInt7006 = 128;
   static final int anInt7007 = 24;
   static final int anInt7008 = 24;
   static final int anInt7009 = 192;
   static final int anInt7011 = 13;
   static final int anInt7012 = 16;
   static final int anInt7016 = 512;
   static Class168 aClass168_6988;
   static Class153 aClass153_7015;
   Class153 aClass153_7003;
   static int[] anIntArray6992 = new int[4];
   int anInt7000;
   int anInt7002;
   int anInt7001;
   int anInt6995;
   int anInt6986;
   static Class153 aClass153_7014;
   int anInt7010;
   int anInt7013;
   int anInt6994;
   boolean aBool6998;
   int anInt6996;
   int anInt7004;
   int anInt6991;
   int anInt6990;
   int anInt6993;
   int anInt7005;
   int anInt6997;

   static void method6168() {
      aClass168_6988 = null;
      aClass153_7015 = null;
   }

   boolean method6169(Class174 var1, Class511 var2) {
      return this.aClass153_7003 != null || this.method6171(var1, var2);
   }

   void method6170(Class174 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if(this.aClass153_7003 != null) {
         float[] var12 = new float[3];
         float var13 = (float)(-(this.anInt7010 - var8 << 16));
         float var14 = (float)(this.anInt7013 - var9 << 15);
         float var15 = (float)(-(this.anInt6994 - var10 << 16));
         float[] var16 = new float[3];
         var1.method2372().method5255(var16);
         var13 += var16[0];
         var14 += var16[1];
         var15 += var16[2];
         var1.method2513(var13, var14, var15, var12);
         if(var12[2] >= 0.0F) {
            int var17 = (int)(var12[0] - (float)(this.anInt7002 / 2));
            int var18 = (int)(var12[1] - (float)(this.anInt7002 / 2));
            if(var18 < var5 && var18 + this.anInt7002 > 0 && var17 < var4 && var17 + this.anInt7002 > 0) {
               this.aClass153_7003.method1781(var17, var18, this.anInt7002, this.anInt7002, 0, var11 << 24 | 16777215, 1);
            }
         }

      }
   }

   boolean method6171(Class174 var1, Class511 var2) {
      if(this.aClass153_7003 == null) {
         if(this.anInt6990 == 0) {
            if(Class546.anInterface24_7270.method162(Class595.aClass595_7846, this.anInt6996, Class603.aClass603_7887, 0.7F, this.anInt7001, this.anInt7001, false, 350568332)) {
               int[] var3 = Class546.anInterface24_7270.method144(Class595.aClass595_7846, this.anInt6996, 0.7F, this.anInt7001, this.anInt7001, false, 1744692432);
               this.aClass153_7003 = var1.method2515(var3, 0, this.anInt7001, this.anInt7001, this.anInt7001, (byte)3);
            }
         } else if(this.anInt6990 == 2) {
            this.method6172(var1, var2);
         } else if(this.anInt6990 == 1) {
            this.method6173(var1, var2);
         }
      }

      return this.aClass153_7003 != null;
   }

   void method6172(Class174 var1, Class511 var2) {
      Class170 var3 = Class170.method2146(Class585.aClass466_7791, this.anInt6996, 0);
      if(var3 != null) {
         var1.method2282(anIntArray6992);
         var1.method2538(0, 0, this.anInt7001, this.anInt7001);
         var1.method2283(2, 0);
         var1.method2290(0, 0, this.anInt7001, this.anInt7001, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if(var2 != null) {
            if(var2.aBool6998) {
               var4 = -var2.anInt7010;
               var5 = -var2.anInt7013;
               var6 = -var2.anInt6994;
            } else {
               var4 = this.anInt7010 - var2.anInt7010;
               var5 = this.anInt7013 - var2.anInt7013;
               var6 = this.anInt6994 - var2.anInt6994;
            }
         }

         int var7;
         int var8;
         int var9;
         int var10;
         if(this.anInt6995 != 0) {
            var7 = -this.anInt6995 & 16383;
            var8 = Class443.anIntArray4895[var7];
            var9 = Class443.anIntArray4896[var7];
            var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if(this.anInt6986 != 0) {
            var7 = -this.anInt6986 & 16383;
            var8 = Class443.anIntArray4895[var7];
            var9 = Class443.anIntArray4896[var7];
            var10 = var6 * var8 + var4 * var9 >> 14;
            var6 = var6 * var9 - var4 * var8 >> 14;
            var4 = var10;
         }

         var1.method2331(1.0F);
         var1.method2364(this.anInt7004, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         var3.method2140(this.anInt6993 & 16383, this.anInt7005 & 16383, this.anInt6997 & 16383);
         Class168 var16 = var1.method2321(var3, 2048, 0, 64, 768);
         var8 = var16.method1980() - var16.method1979();
         var9 = var16.method1988() - var16.method1981();
         var10 = var8 > var9?var8:var9;
         int var11 = 1024 * this.anInt7001 / var10;
         Class433 var12 = var1.method2330();
         Class433 var13 = var1.method2318();
         var13.method5097((float)(this.anInt7001 / 2), (float)(this.anInt7001 / 2), (float)var11, (float)var11, 50.0F, 50000.0F, (float)var1.method2247((byte)6).method2691(), (float)var1.method2247((byte)6).method2693(), 1024.0F);
         var1.method2231(var13);
         Class445 var14 = new Class445();
         var1.method2326(var14);
         Class445 var15 = var1.method2319();
         var15.method5229(0.0F, 0.0F, (float)(50 - var16.method1983()));
         var16.method1974(var15, (Class164)null, 1);
         this.aClass153_7003 = var1.method2311(0, 0, this.anInt7001, this.anInt7001, true);
         this.aClass153_7003.method1777(0, 0, 3);
         var1.method2231(var12);
         var1.method2538(anIntArray6992[0], anIntArray6992[1], anIntArray6992[2], anIntArray6992[3]);
      }
   }

   void method6173(Class174 var1, Class511 var2) {
      method6174(var1);
      method6182(var1);
      var1.method2282(anIntArray6992);
      var1.method2538(0, 0, this.anInt7001, this.anInt7001);
      var1.method2283(2, 0);
      var1.method2290(0, 0, this.anInt7001, this.anInt7001, -16777216 | this.anInt7004, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if(var2 != null) {
         if(var2.aBool6998) {
            var3 = -var2.anInt7010;
            var4 = -var2.anInt7013;
            var5 = -var2.anInt6994;
         } else {
            var3 = var2.anInt7010 - this.anInt7010;
            var4 = var2.anInt7013 - this.anInt7013;
            var5 = var2.anInt6994 - this.anInt6994;
         }
      }

      int var6;
      int var7;
      int var8;
      if(this.anInt6995 != 0) {
         var6 = Class443.anIntArray4895[this.anInt6995];
         var7 = Class443.anIntArray4896[this.anInt6995];
         var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if(this.anInt6986 != 0) {
         var6 = Class443.anIntArray4895[this.anInt6986];
         var7 = Class443.anIntArray4896[this.anInt6986];
         var8 = var5 * var6 + var3 * var7 >> 14;
         var5 = var5 * var7 - var3 * var6 >> 14;
         var3 = var8;
      }

      Class168 var13 = aClass168_6988.method1947((byte)0, '\uc800', true);
      var13.method1992((short)0, (short)this.anInt6996);
      var1.method2331(1.0F);
      var1.method2364(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      var7 = 1024 * this.anInt7001 / (var13.method1980() - var13.method1979());
      if(this.anInt7004 != 0) {
         var7 = var7 * 13 / 16;
      }

      Class433 var14 = var1.method2330();
      Class433 var9 = var1.method2318();
      var9.method5097((float)(this.anInt7001 / 2), (float)(this.anInt7001 / 2), (float)var7, (float)var7, 50.0F, 50000.0F, (float)var1.method2247((byte)6).method2691(), (float)var1.method2247((byte)6).method2693(), 1024.0F);
      var1.method2231(var9);
      var1.method2326(new Class445());
      Class445 var10 = new Class445();
      var10.method5229(0.0F, 0.0F, (float)(50 - var13.method1983()));
      var13.method1974(var10, (Class164)null, 1);
      int var11 = this.anInt7001 * 13 / 16;
      int var12 = (this.anInt7001 - var11) / 2;
      aClass153_7014.method1781(var12, var12, var11, var11, 0, -16777216 | this.anInt7004, 1);
      this.aClass153_7003 = var1.method2311(0, 0, this.anInt7001, this.anInt7001, true);
      var1.method2283(2, 0);
      var1.method2290(0, 0, this.anInt7001, this.anInt7001, 0, 0);
      aClass153_7015.method1781(0, 0, this.anInt7001, this.anInt7001, 1, 0, 0);
      this.aClass153_7003.method1777(0, 0, 3);
      var1.method2231(var14);
      var1.method2538(anIntArray6992[0], anIntArray6992[1], anIntArray6992[2], anIntArray6992[3]);
   }

   static void method6174(Class174 var0) {
      if(aClass168_6988 == null) {
         Class170 var1 = new Class170(580, 1104, 1);
         var1.method2135((short)0, (short)32767, (short)0, (short)1024, (short)1024, (short)1024, (byte)0, (byte)0, (byte)0);
         var1.method2150(0, 128, 0);
         var1.method2150(0, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = Class443.anIntArray4895[var3];
            int var5 = Class443.anIntArray4896[var3];

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            for(var6 = 1; var6 < 24; ++var6) {
               var7 = var6 * 8192 / 24;
               var8 = Class443.anIntArray4896[var7] >> 7;
               var9 = Class443.anIntArray4895[var7] * var4 >> 21;
               var10 = Class443.anIntArray4895[var7] * var5 >> 21;
               var1.method2150(var10, var8, -var9);
            }

            if(var2 > 0) {
               var6 = var2 * 23 + 2;
               var7 = var6 - 23;
               var1.method2133(0, var7, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);

               for(var8 = 1; var8 < 23; ++var8) {
                  var9 = var7 + 1;
                  var10 = var6 + 1;
                  var1.method2133(var7, var9, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var1.method2133(var9, var10, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var7 = var9;
                  var6 = var10;
               }

               var1.method2133(var6, var7, 1, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
            }
         }

         var1.anInt1919 = var1.anInt1918;
         var1.anIntArray1949 = null;
         var1.anIntArray1924 = null;
         var1.aByteArray1937 = null;
         aClass168_6988 = var0.method2321(var1, '\uc800', 33, 64, 768);
      }

   }

   boolean method6175(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      int var7;
      if(!this.aBool6998) {
         var5 = this.anInt7010 - var1;
         var6 = this.anInt7013 - var2;
         var7 = this.anInt6994 - var3;
         this.anInt7000 = (int)Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7));
         if(this.anInt7000 == 0) {
            this.anInt7000 = 1;
         }

         var5 = (var5 << 8) / this.anInt7000;
         var6 = (var6 << 8) / this.anInt7000;
         var7 = (var7 << 8) / this.anInt7000;
      } else {
         this.anInt7000 = 1073741823;
         var5 = this.anInt7010;
         var6 = this.anInt7013;
         var7 = this.anInt6994;
      }

      int var8 = (int)(Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7)) * 256.0D);
      if(var8 > 128) {
         var5 = (var5 << 16) / var8;
         var6 = (var6 << 16) / var8;
         var7 = (var7 << 16) / var8;
         this.anInt7002 = this.anInt6991 * var4 / (this.aBool6998?1024:this.anInt7000);
      } else {
         this.anInt7002 = 0;
      }

      if(this.anInt7002 < 8) {
         this.aClass153_7003 = null;
         return false;
      } else {
         int var9 = Class692.method8110(this.anInt7002, -1295520077);
         if(var9 > var4) {
            var9 = Class568.method6836(var4, 701008013);
         }

         if(var9 > 512) {
            var9 = 512;
         }

         if(var9 != this.anInt7001) {
            this.anInt7001 = var9;
         }

         this.anInt6995 = (int)(Math.asin((double)((float)var6 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.anInt6986 = (int)(Math.atan2((double)var5, (double)(-var7)) * 2607.5945876176133D) & 16383;
         this.aClass153_7003 = null;
         return true;
      }
   }

   static void method6176(Class174 var0) {
      if(aClass153_7015 == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            var4 *= var4;
            int var5 = 128 - var3 - 1;
            int var6 = var3 * 128;
            int var7 = var5 * 128;

            for(int var8 = 0; var8 < 64; ++var8) {
               int var9 = 64 - var8;
               var9 *= var9;
               int var10 = 128 - var8 - 1;
               int var11 = 256 - (var9 + var4 << 8) / 4096;
               var11 = var11 * 3072 / 1536;
               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > 255) {
                  var11 = 255;
               }

               int var12 = var11 / 2;
               var2[var6 + var8] = var2[var6 + var10] = var2[var7 + var8] = var2[var7 + var10] = -16777216 | var11 << 16;
               var1[var6 + var8] = var1[var6 + var10] = var1[var7 + var8] = var1[var7 + var10] = 127 - var12 << 24 | 16777215;
            }
         }

         aClass153_7015 = var0.method2515(var2, 0, 128, 128, 128, (byte)3);
         aClass153_7014 = var0.method2515(var1, 0, 128, 128, 128, (byte)3);
      }

   }

   public Class511(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11) {
      this.anInt7010 = var3;
      this.anInt7013 = var4;
      this.anInt6994 = var5;
      this.aBool6998 = var8;
      this.anInt6996 = var2;
      this.anInt7004 = var7;
      this.anInt6991 = var6;
      this.anInt6990 = var1;
      this.anInt6993 = var9;
      this.anInt7005 = var10;
      this.anInt6997 = var11;
   }

   static void method6177(Class174 var0) {
      if(aClass168_6988 == null) {
         Class170 var1 = new Class170(580, 1104, 1);
         var1.method2135((short)0, (short)32767, (short)0, (short)1024, (short)1024, (short)1024, (byte)0, (byte)0, (byte)0);
         var1.method2150(0, 128, 0);
         var1.method2150(0, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = Class443.anIntArray4895[var3];
            int var5 = Class443.anIntArray4896[var3];

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            for(var6 = 1; var6 < 24; ++var6) {
               var7 = var6 * 8192 / 24;
               var8 = Class443.anIntArray4896[var7] >> 7;
               var9 = Class443.anIntArray4895[var7] * var4 >> 21;
               var10 = Class443.anIntArray4895[var7] * var5 >> 21;
               var1.method2150(var10, var8, -var9);
            }

            if(var2 > 0) {
               var6 = var2 * 23 + 2;
               var7 = var6 - 23;
               var1.method2133(0, var7, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);

               for(var8 = 1; var8 < 23; ++var8) {
                  var9 = var7 + 1;
                  var10 = var6 + 1;
                  var1.method2133(var7, var9, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var1.method2133(var9, var10, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var7 = var9;
                  var6 = var10;
               }

               var1.method2133(var6, var7, 1, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
            }
         }

         var1.anInt1919 = var1.anInt1918;
         var1.anIntArray1949 = null;
         var1.anIntArray1924 = null;
         var1.aByteArray1937 = null;
         aClass168_6988 = var0.method2321(var1, '\uc800', 33, 64, 768);
      }

   }

   boolean method6178(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      int var7;
      if(!this.aBool6998) {
         var5 = this.anInt7010 - var1;
         var6 = this.anInt7013 - var2;
         var7 = this.anInt6994 - var3;
         this.anInt7000 = (int)Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7));
         if(this.anInt7000 == 0) {
            this.anInt7000 = 1;
         }

         var5 = (var5 << 8) / this.anInt7000;
         var6 = (var6 << 8) / this.anInt7000;
         var7 = (var7 << 8) / this.anInt7000;
      } else {
         this.anInt7000 = 1073741823;
         var5 = this.anInt7010;
         var6 = this.anInt7013;
         var7 = this.anInt6994;
      }

      int var8 = (int)(Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7)) * 256.0D);
      if(var8 > 128) {
         var5 = (var5 << 16) / var8;
         var6 = (var6 << 16) / var8;
         var7 = (var7 << 16) / var8;
         this.anInt7002 = this.anInt6991 * var4 / (this.aBool6998?1024:this.anInt7000);
      } else {
         this.anInt7002 = 0;
      }

      if(this.anInt7002 < 8) {
         this.aClass153_7003 = null;
         return false;
      } else {
         int var9 = Class692.method8110(this.anInt7002, 1421724558);
         if(var9 > var4) {
            var9 = Class568.method6836(var4, 150291928);
         }

         if(var9 > 512) {
            var9 = 512;
         }

         if(var9 != this.anInt7001) {
            this.anInt7001 = var9;
         }

         this.anInt6995 = (int)(Math.asin((double)((float)var6 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.anInt6986 = (int)(Math.atan2((double)var5, (double)(-var7)) * 2607.5945876176133D) & 16383;
         this.aClass153_7003 = null;
         return true;
      }
   }

   boolean method6179(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      int var7;
      if(!this.aBool6998) {
         var5 = this.anInt7010 - var1;
         var6 = this.anInt7013 - var2;
         var7 = this.anInt6994 - var3;
         this.anInt7000 = (int)Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7));
         if(this.anInt7000 == 0) {
            this.anInt7000 = 1;
         }

         var5 = (var5 << 8) / this.anInt7000;
         var6 = (var6 << 8) / this.anInt7000;
         var7 = (var7 << 8) / this.anInt7000;
      } else {
         this.anInt7000 = 1073741823;
         var5 = this.anInt7010;
         var6 = this.anInt7013;
         var7 = this.anInt6994;
      }

      int var8 = (int)(Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7)) * 256.0D);
      if(var8 > 128) {
         var5 = (var5 << 16) / var8;
         var6 = (var6 << 16) / var8;
         var7 = (var7 << 16) / var8;
         this.anInt7002 = this.anInt6991 * var4 / (this.aBool6998?1024:this.anInt7000);
      } else {
         this.anInt7002 = 0;
      }

      if(this.anInt7002 < 8) {
         this.aClass153_7003 = null;
         return false;
      } else {
         int var9 = Class692.method8110(this.anInt7002, 32940002);
         if(var9 > var4) {
            var9 = Class568.method6836(var4, 523281220);
         }

         if(var9 > 512) {
            var9 = 512;
         }

         if(var9 != this.anInt7001) {
            this.anInt7001 = var9;
         }

         this.anInt6995 = (int)(Math.asin((double)((float)var6 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.anInt6986 = (int)(Math.atan2((double)var5, (double)(-var7)) * 2607.5945876176133D) & 16383;
         this.aClass153_7003 = null;
         return true;
      }
   }

   static void method6180(Class174 var0) {
      if(aClass168_6988 == null) {
         Class170 var1 = new Class170(580, 1104, 1);
         var1.method2135((short)0, (short)32767, (short)0, (short)1024, (short)1024, (short)1024, (byte)0, (byte)0, (byte)0);
         var1.method2150(0, 128, 0);
         var1.method2150(0, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = Class443.anIntArray4895[var3];
            int var5 = Class443.anIntArray4896[var3];

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            for(var6 = 1; var6 < 24; ++var6) {
               var7 = var6 * 8192 / 24;
               var8 = Class443.anIntArray4896[var7] >> 7;
               var9 = Class443.anIntArray4895[var7] * var4 >> 21;
               var10 = Class443.anIntArray4895[var7] * var5 >> 21;
               var1.method2150(var10, var8, -var9);
            }

            if(var2 > 0) {
               var6 = var2 * 23 + 2;
               var7 = var6 - 23;
               var1.method2133(0, var7, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);

               for(var8 = 1; var8 < 23; ++var8) {
                  var9 = var7 + 1;
                  var10 = var6 + 1;
                  var1.method2133(var7, var9, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var1.method2133(var9, var10, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var7 = var9;
                  var6 = var10;
               }

               var1.method2133(var6, var7, 1, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
            }
         }

         var1.anInt1919 = var1.anInt1918;
         var1.anIntArray1949 = null;
         var1.anIntArray1924 = null;
         var1.aByteArray1937 = null;
         aClass168_6988 = var0.method2321(var1, '\uc800', 33, 64, 768);
      }

   }

   static void method6181(Class174 var0) {
      if(aClass153_7015 == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            var4 *= var4;
            int var5 = 128 - var3 - 1;
            int var6 = var3 * 128;
            int var7 = var5 * 128;

            for(int var8 = 0; var8 < 64; ++var8) {
               int var9 = 64 - var8;
               var9 *= var9;
               int var10 = 128 - var8 - 1;
               int var11 = 256 - (var9 + var4 << 8) / 4096;
               var11 = var11 * 3072 / 1536;
               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > 255) {
                  var11 = 255;
               }

               int var12 = var11 / 2;
               var2[var6 + var8] = var2[var6 + var10] = var2[var7 + var8] = var2[var7 + var10] = -16777216 | var11 << 16;
               var1[var6 + var8] = var1[var6 + var10] = var1[var7 + var8] = var1[var7 + var10] = 127 - var12 << 24 | 16777215;
            }
         }

         aClass153_7015 = var0.method2515(var2, 0, 128, 128, 128, (byte)3);
         aClass153_7014 = var0.method2515(var1, 0, 128, 128, 128, (byte)3);
      }

   }

   static void method6182(Class174 var0) {
      if(aClass153_7015 == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            var4 *= var4;
            int var5 = 128 - var3 - 1;
            int var6 = var3 * 128;
            int var7 = var5 * 128;

            for(int var8 = 0; var8 < 64; ++var8) {
               int var9 = 64 - var8;
               var9 *= var9;
               int var10 = 128 - var8 - 1;
               int var11 = 256 - (var9 + var4 << 8) / 4096;
               var11 = var11 * 3072 / 1536;
               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > 255) {
                  var11 = 255;
               }

               int var12 = var11 / 2;
               var2[var6 + var8] = var2[var6 + var10] = var2[var7 + var8] = var2[var7 + var10] = -16777216 | var11 << 16;
               var1[var6 + var8] = var1[var6 + var10] = var1[var7 + var8] = var1[var7 + var10] = 127 - var12 << 24 | 16777215;
            }
         }

         aClass153_7015 = var0.method2515(var2, 0, 128, 128, 128, (byte)3);
         aClass153_7014 = var0.method2515(var1, 0, 128, 128, 128, (byte)3);
      }

   }
}
