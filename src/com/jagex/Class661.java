package com.jagex;

import com.jagex.Class113;
import com.jagex.Class201;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class231;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class28;
import com.jagex.Class290;
import com.jagex.Class315_Sub1;
import com.jagex.Class34;
import com.jagex.Class36;
import com.jagex.Class361_Sub2;
import com.jagex.Class378;
import com.jagex.Class42;
import com.jagex.Class452_Sub5;
import com.jagex.Class522;
import com.jagex.Class525_Sub1;
import com.jagex.Class554;
import com.jagex.Class593;
import com.jagex.RSSocket;
import com.jagex.Class627;
import com.jagex.Class650;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class685;
import com.jagex.Class70;
import com.jagex.Class700;
import com.jagex.Class76;
import com.jagex.Class9_Sub1;
import com.jagex.client;

public class Class661 {
   static String aString8517;
   static int anInt8515 = 0;
   static int anInt8514 = 0;
   public static int[] anIntArray8516;

   public static void method7904(boolean var0, boolean var1) {
      if(var0) {
         anInt8515 += 759532629;
         Class36.method839(-507765772);
      }

      if(var1) {
         anInt8514 += 1534686479;
         Class378.method4696((byte)-3);
      }

   }

   public static int method7905(int var0, int var1) {
      int var2 = var1 >>> 24;
      int var3 = 255 - var2;
      var1 = ((var1 & 16711935) * var2 & -16711936 | (var1 & '\uff00') * var2 & 16711680) >>> 8;
      return ((var3 * (var0 & 16711935) & -16711936 | var3 * (var0 & '\uff00') & 16711680) >>> 8) + var1;
   }

   static void method7906() {
      if(null == anIntArray8516) {
         anIntArray8516 = new int[65536];
         Class34.anIntArray371 = new int[65536];
         double var0 = 0.7D + (Math.random() * 0.03D - 0.015D);

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
            double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if(0.0D != var5) {
               double var15;
               if(var7 < 0.5D) {
                  var15 = var7 * (var5 + 1.0D);
               } else {
                  var15 = var5 + var7 - var7 * var5;
               }

               double var17 = 2.0D * var7 - var15;
               double var19 = 0.3333333333333333D + var3;
               if(var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if(var23 < 0.0D) {
                  ++var23;
               }

               if(var19 * 6.0D < 1.0D) {
                  var9 = (var15 - var17) * 6.0D * var19 + var17;
               } else if(2.0D * var19 < 1.0D) {
                  var9 = var15;
               } else if(3.0D * var19 < 2.0D) {
                  var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
               } else {
                  var9 = var17;
               }

               if(6.0D * var3 < 1.0D) {
                  var11 = var3 * (var15 - var17) * 6.0D + var17;
               } else if(var3 * 2.0D < 1.0D) {
                  var11 = var15;
               } else if(3.0D * var3 < 2.0D) {
                  var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
               } else {
                  var11 = var17;
               }

               if(6.0D * var23 < 1.0D) {
                  var13 = var17 + var23 * 6.0D * (var15 - var17);
               } else if(2.0D * var23 < 1.0D) {
                  var13 = var15;
               } else if(var23 * 3.0D < 2.0D) {
                  var13 = (0.6666666666666666D - var23) * (var15 - var17) * 6.0D + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(var9 * 256.0D);
            int var26 = (int)(var11 * 256.0D);
            int var27 = (int)(256.0D * var13);
            int var28 = (var26 << 8) + (var25 << 16) + var27;
            anIntArray8516[var2] = var28 & 16777215;
            int var29 = var25 + (var27 << 16) + (var26 << 8);
            Class34.anIntArray371[var2] = var29;
         }

      }
   }

   public static final int method7907(int var0, int var1) {
      if(-2 == var0) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 >> 7;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   public static void method7908(boolean var0, boolean var1) {
      if(var0) {
         anInt8515 += 759532629;
         Class36.method839(1169391202);
      }

      if(var1) {
         anInt8514 += 1534686479;
         Class378.method4696((byte)-3);
      }

   }

   static void method7909() {
      if(null == anIntArray8516) {
         anIntArray8516 = new int[65536];
         Class34.anIntArray371 = new int[65536];
         double var0 = 0.7D + (Math.random() * 0.03D - 0.015D);

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
            double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if(0.0D != var5) {
               double var15;
               if(var7 < 0.5D) {
                  var15 = var7 * (var5 + 1.0D);
               } else {
                  var15 = var5 + var7 - var7 * var5;
               }

               double var17 = 2.0D * var7 - var15;
               double var19 = 0.3333333333333333D + var3;
               if(var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if(var23 < 0.0D) {
                  ++var23;
               }

               if(var19 * 6.0D < 1.0D) {
                  var9 = (var15 - var17) * 6.0D * var19 + var17;
               } else if(2.0D * var19 < 1.0D) {
                  var9 = var15;
               } else if(3.0D * var19 < 2.0D) {
                  var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
               } else {
                  var9 = var17;
               }

               if(6.0D * var3 < 1.0D) {
                  var11 = var3 * (var15 - var17) * 6.0D + var17;
               } else if(var3 * 2.0D < 1.0D) {
                  var11 = var15;
               } else if(3.0D * var3 < 2.0D) {
                  var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
               } else {
                  var11 = var17;
               }

               if(6.0D * var23 < 1.0D) {
                  var13 = var17 + var23 * 6.0D * (var15 - var17);
               } else if(2.0D * var23 < 1.0D) {
                  var13 = var15;
               } else if(var23 * 3.0D < 2.0D) {
                  var13 = (0.6666666666666666D - var23) * (var15 - var17) * 6.0D + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(var9 * 256.0D);
            int var26 = (int)(var11 * 256.0D);
            int var27 = (int)(256.0D * var13);
            int var28 = (var26 << 8) + (var25 << 16) + var27;
            anIntArray8516[var2] = var28 & 16777215;
            int var29 = var25 + (var27 << 16) + (var26 << 8);
            Class34.anIntArray371[var2] = var29;
         }

      }
   }

   static void method7910() {
      if(null == anIntArray8516) {
         anIntArray8516 = new int[65536];
         Class34.anIntArray371 = new int[65536];
         double var0 = 0.7D + (Math.random() * 0.03D - 0.015D);

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
            double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if(0.0D != var5) {
               double var15;
               if(var7 < 0.5D) {
                  var15 = var7 * (var5 + 1.0D);
               } else {
                  var15 = var5 + var7 - var7 * var5;
               }

               double var17 = 2.0D * var7 - var15;
               double var19 = 0.3333333333333333D + var3;
               if(var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if(var23 < 0.0D) {
                  ++var23;
               }

               if(var19 * 6.0D < 1.0D) {
                  var9 = (var15 - var17) * 6.0D * var19 + var17;
               } else if(2.0D * var19 < 1.0D) {
                  var9 = var15;
               } else if(3.0D * var19 < 2.0D) {
                  var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
               } else {
                  var9 = var17;
               }

               if(6.0D * var3 < 1.0D) {
                  var11 = var3 * (var15 - var17) * 6.0D + var17;
               } else if(var3 * 2.0D < 1.0D) {
                  var11 = var15;
               } else if(3.0D * var3 < 2.0D) {
                  var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
               } else {
                  var11 = var17;
               }

               if(6.0D * var23 < 1.0D) {
                  var13 = var17 + var23 * 6.0D * (var15 - var17);
               } else if(2.0D * var23 < 1.0D) {
                  var13 = var15;
               } else if(var23 * 3.0D < 2.0D) {
                  var13 = (0.6666666666666666D - var23) * (var15 - var17) * 6.0D + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(var9 * 256.0D);
            int var26 = (int)(var11 * 256.0D);
            int var27 = (int)(256.0D * var13);
            int var28 = (var26 << 8) + (var25 << 16) + var27;
            anIntArray8516[var2] = var28 & 16777215;
            int var29 = var25 + (var27 << 16) + (var26 << 8);
            Class34.anIntArray371[var2] = var29;
         }

      }
   }

   static void method7911() {
      if(null == anIntArray8516) {
         anIntArray8516 = new int[65536];
         Class34.anIntArray371 = new int[65536];
         double var0 = 0.7D + (Math.random() * 0.03D - 0.015D);

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
            double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if(0.0D != var5) {
               double var15;
               if(var7 < 0.5D) {
                  var15 = var7 * (var5 + 1.0D);
               } else {
                  var15 = var5 + var7 - var7 * var5;
               }

               double var17 = 2.0D * var7 - var15;
               double var19 = 0.3333333333333333D + var3;
               if(var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if(var23 < 0.0D) {
                  ++var23;
               }

               if(var19 * 6.0D < 1.0D) {
                  var9 = (var15 - var17) * 6.0D * var19 + var17;
               } else if(2.0D * var19 < 1.0D) {
                  var9 = var15;
               } else if(3.0D * var19 < 2.0D) {
                  var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
               } else {
                  var9 = var17;
               }

               if(6.0D * var3 < 1.0D) {
                  var11 = var3 * (var15 - var17) * 6.0D + var17;
               } else if(var3 * 2.0D < 1.0D) {
                  var11 = var15;
               } else if(3.0D * var3 < 2.0D) {
                  var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
               } else {
                  var11 = var17;
               }

               if(6.0D * var23 < 1.0D) {
                  var13 = var17 + var23 * 6.0D * (var15 - var17);
               } else if(2.0D * var23 < 1.0D) {
                  var13 = var15;
               } else if(var23 * 3.0D < 2.0D) {
                  var13 = (0.6666666666666666D - var23) * (var15 - var17) * 6.0D + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var0);
            var11 = Math.pow(var11, var0);
            var13 = Math.pow(var13, var0);
            int var25 = (int)(var9 * 256.0D);
            int var26 = (int)(var11 * 256.0D);
            int var27 = (int)(256.0D * var13);
            int var28 = (var26 << 8) + (var25 << 16) + var27;
            anIntArray8516[var2] = var28 & 16777215;
            int var29 = var25 + (var27 << 16) + (var26 << 8);
            Class34.anIntArray371[var2] = var29;
         }

      }
   }

   public static int method7912(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return var1 + (var0 & '\uff80');
   }

   Class661() throws Throwable {
      throw new Error();
   }

   public static int method7913(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      var1 = ((var1 & 16711935) * var2 & -16711936 | var2 * (var1 & '\uff00') & 16711680) >>> 8;
      return var1 + ((var3 * (var0 & 16711935) & -16711936 | var3 * (var0 & '\uff00') & 16711680) >>> 8);
   }

   public static int method7914(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return var1 + (var0 & '\uff80');
   }

   public static int method7915(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      var1 = ((var1 & 16711935) * var2 & -16711936 | var2 * (var1 & '\uff00') & 16711680) >>> 8;
      return var1 + ((var3 * (var0 & 16711935) & -16711936 | var3 * (var0 & '\uff00') & 16711680) >>> 8);
   }

   public static int method7916(int var0) {
      double var1 = (double)(var0 >> 16 & 255) / 256.0D;
      double var3 = (double)(var0 >> 8 & 255) / 256.0D;
      double var5 = (double)(var0 & 255) / 256.0D;
      double var7 = var1;
      if(var3 < var1) {
         var7 = var3;
      }

      if(var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if(var3 > var1) {
         var9 = var3;
      }

      if(var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if(var7 != var9) {
         if(var15 < 0.5D) {
            var13 = (var9 - var7) / (var7 + var9);
         }

         if(var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if(var9 == var1) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if(var9 == var3) {
            var11 = (var5 - var1) / (var9 - var7) + 2.0D;
         } else if(var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      var11 /= 6.0D;
      int var17 = (int)(var11 * 256.0D);
      int var18 = (int)(var13 * 256.0D);
      int var19 = (int)(256.0D * var15);
      if(var18 < 0) {
         var18 = 0;
      } else if(var18 > 255) {
         var18 = 255;
      }

      if(var19 < 0) {
         var19 = 0;
      } else if(var19 > 255) {
         var19 = 255;
      }

      if(var19 > 243) {
         var18 >>= 4;
      } else if(var19 > 217) {
         var18 >>= 3;
      } else if(var19 > 192) {
         var18 >>= 2;
      } else if(var19 > 179) {
         var18 >>= 1;
      }

      return (var19 >> 1) + ((var17 & 255) >> 2 << 10) + (var18 >> 5 << 7);
   }

   public static int method7917(int var0) {
      double var1 = (double)(var0 >> 16 & 255) / 256.0D;
      double var3 = (double)(var0 >> 8 & 255) / 256.0D;
      double var5 = (double)(var0 & 255) / 256.0D;
      double var7 = var1;
      if(var3 < var1) {
         var7 = var3;
      }

      if(var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if(var3 > var1) {
         var9 = var3;
      }

      if(var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if(var7 != var9) {
         if(var15 < 0.5D) {
            var13 = (var9 - var7) / (var7 + var9);
         }

         if(var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if(var9 == var1) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if(var9 == var3) {
            var11 = (var5 - var1) / (var9 - var7) + 2.0D;
         } else if(var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      var11 /= 6.0D;
      int var17 = (int)(var11 * 256.0D);
      int var18 = (int)(var13 * 256.0D);
      int var19 = (int)(256.0D * var15);
      if(var18 < 0) {
         var18 = 0;
      } else if(var18 > 255) {
         var18 = 255;
      }

      if(var19 < 0) {
         var19 = 0;
      } else if(var19 > 255) {
         var19 = 255;
      }

      if(var19 > 243) {
         var18 >>= 4;
      } else if(var19 > 217) {
         var18 >>= 3;
      } else if(var19 > 192) {
         var18 >>= 2;
      } else if(var19 > 179) {
         var18 >>= 1;
      }

      return (var19 >> 1) + ((var17 & 255) >> 2 << 10) + (var18 >> 5 << 7);
   }

   public static int method7918(int var0) {
      double var1 = (double)(var0 >> 16 & 255) / 256.0D;
      double var3 = (double)(var0 >> 8 & 255) / 256.0D;
      double var5 = (double)(var0 & 255) / 256.0D;
      double var7 = var1;
      if(var3 < var1) {
         var7 = var3;
      }

      if(var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if(var3 > var1) {
         var9 = var3;
      }

      if(var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if(var7 != var9) {
         if(var15 < 0.5D) {
            var13 = (var9 - var7) / (var7 + var9);
         }

         if(var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if(var9 == var1) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if(var9 == var3) {
            var11 = (var5 - var1) / (var9 - var7) + 2.0D;
         } else if(var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      var11 /= 6.0D;
      int var17 = (int)(var11 * 256.0D);
      int var18 = (int)(var13 * 256.0D);
      int var19 = (int)(256.0D * var15);
      if(var18 < 0) {
         var18 = 0;
      } else if(var18 > 255) {
         var18 = 255;
      }

      if(var19 < 0) {
         var19 = 0;
      } else if(var19 > 255) {
         var19 = 255;
      }

      if(var19 > 243) {
         var18 >>= 4;
      } else if(var19 > 217) {
         var18 >>= 3;
      } else if(var19 > 192) {
         var18 >>= 2;
      } else if(var19 > 179) {
         var18 >>= 1;
      }

      return (var19 >> 1) + ((var17 & 255) >> 2 << 10) + (var18 >> 5 << 7);
   }

   public static final int method7919(int var0, int var1) {
      if(-2 == var0) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 >> 7;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   public static int method7920(int var0, int var1, int var2) {
      int var3 = 255 - var2;
      var1 = ((var1 & 16711935) * var2 & -16711936 | var2 * (var1 & '\uff00') & 16711680) >>> 8;
      return var1 + ((var3 * (var0 & 16711935) & -16711936 | var3 * (var0 & '\uff00') & 16711680) >>> 8);
   }

   public static final int method7921(int var0, int var1) {
      if(-2 == var0) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 >> 7;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   static final void method7922(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      RSSocket.method550(var3, var4, var0, (byte)-16);
   }

   static final void method7923(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(0 == var2) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class525_Sub1.aBool10727?1:0;
      } else if(var2 == 1) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class525_Sub1.aBool10728?1:0;
      } else {
         if(2 != var2) {
            throw new RuntimeException();
         }

         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class525_Sub1.aBool10730?1:0;
      }

   }

   static final void method7924(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub24_10657, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1?1:0, (short)-19188);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   public static int method7925(CharSequence var0, byte var1) {
      return Class231.method3257(var0, 10, true, (byte)-15);
   }

   static void method7926(int var0, String var1, boolean var2, int var3) {
      Class685.method8048((byte)-85);
      Class70.method1095((short)623);
      Class290.method3854(-1920346541);
      Class76.method1128(var0, var1, var2, (byte)45);
      Class627.aClass418_8195.method4948((byte)34);
      Class627.aClass418_8195.method4947(client.anInterface51_11046, -970426943);
      Class627.aClass418_8195.method4952(-735285713);
      Class361_Sub2.method9243(Class554.aClass174_7475, (byte)-79);
      Class650.method7723(Class554.aClass174_7475, Class113.aClass466_1370, 87559322);
      Class700.method8172(-1730576285);
      Class9_Sub1.method10244(-1047972501);
      Class452_Sub5.method9307(1637687887);
      if(client.anInt11038 * -558705405 == 16) {
         Class593.method7031(7, (byte)96);
      } else if(-558705405 * client.anInt11038 == 0) {
         Class593.method7031(14, (byte)80);
      } else if(-558705405 * client.anInt11038 == 8) {
         Class593.method7031(6, (byte)80);
      } else if(-558705405 * client.anInt11038 == 9) {
         Class593.method7031(10, (byte)29);
      } else if(15 != client.anInt11038 * -558705405 && 12 != client.anInt11038 * -558705405) {
         if(11 == -558705405 * client.anInt11038) {
            Class593.method7031(5, (byte)58);
         } else if(10 == client.anInt11038 * -558705405) {
            Class201.method2878(false, 1407479497);
         }
      } else {
         Class28.method731(1997555296);
      }

   }

   static final void method7927(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-10);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class42.method900(var3, var4, var0, 288640017);
   }
}
