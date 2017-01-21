package com.jagex;

import com.jagex.Class174;

public class Class175 {
   static int anInt2067;
   static int anInt2060;
   static int anInt2061;
   static int anInt2062;
   static int anInt2064;
   static int anInt2065;
   static int anInt2066;
   static int[] anIntArray2063;

   static boolean method2636(int var0) {
      int var1 = anInt2066;
      int var2 = anInt2061;

      int var4;
      for(int var3 = anInt2062; var2 >= var1; var2 = var4) {
         ++var3;
         anInt2062 = var3;
         if(var3 >= var0) {
            return false;
         }

         int var5;
         int var6;
         for(var4 = anInt2065; var1 < anInt2064; var1 += 4) {
            var5 = anIntArray2063[var1 + 1];
            if(var3 < var5) {
               break;
            }

            var6 = anIntArray2063[var1];
            int var7 = anIntArray2063[var1 + 2];
            int var8 = anIntArray2063[var1 + 3];
            int var9 = (var7 - var6 << 16) / (var8 - var5);
            int var10 = (var6 << 16) + '\u8000';
            anIntArray2063[var1] = var10;
            anIntArray2063[var1 + 2] = var9;
         }

         for(var5 = var4; var5 < var1; var5 += 4) {
            var6 = anIntArray2063[var5 + 3];
            if(var3 >= var6) {
               anIntArray2063[var5] = anIntArray2063[var4];
               anIntArray2063[var5 + 1] = anIntArray2063[var4 + 1];
               anIntArray2063[var5 + 2] = anIntArray2063[var4 + 2];
               anIntArray2063[var5 + 3] = anIntArray2063[var4 + 3];
               var4 += 4;
            }
         }

         if(var4 == anInt2064) {
            anInt2064 = 0;
            return false;
         }

         method2645(var4, var1);
         anInt2065 = var4;
         anInt2066 = var1;
      }

      anInt2067 = anIntArray2063[var2] >> 16;
      anInt2060 = anIntArray2063[var2 + 4] >> 16;
      anIntArray2063[var2] += anIntArray2063[var2 + 2];
      anIntArray2063[var2 + 4] += anIntArray2063[var2 + 6];
      var2 += 8;
      anInt2061 = var2;
      return true;
   }

   static void method2637(Class174 var0, int[] var1, int var2, int var3, int var4, int[] var5, int[] var6) {
      int[] var7 = new int[4];
      var0.method2282(var7);
      if(var5 != null && var7[3] - var7[1] != var5.length) {
         throw new IllegalStateException();
      } else {
         method2640();
         method2641(var1, var2, var3);
         method2642(var7[1]);

         while(true) {
            int var8;
            int var9;
            int var10;
            do {
               if(!method2636(var7[3])) {
                  return;
               }

               var8 = anInt2067;
               var9 = anInt2060;
               var10 = anInt2062;
               if(var5 == null) {
                  break;
               }

               int var11 = var10 - var7[1];
               if(var8 < var5[var11] + var7[0]) {
                  var8 = var5[var11] + var7[0];
               }

               if(var9 > var5[var11] + var6[var11] + var7[0]) {
                  var9 = var5[var11] + var6[var11] + var7[0];
               }
            } while(var9 - var8 <= 0);

            var0.method2293(var8, var10, var9 - var8, var4, 1);
         }
      }
   }

   static void method2638() {
      anInt2064 = 0;
   }

   static void method2639() {
      anInt2064 = 0;
   }

   static void method2640() {
      anInt2064 = 0;
   }

   static void method2641(int[] var0, int var1, int var2) {
      int var3 = anInt2064 + (var2 << 1);
      int var5;
      if(anIntArray2063 == null || anIntArray2063.length < var3) {
         int[] var4 = new int[var3];

         for(var5 = 0; var5 < anInt2064; ++var5) {
            var4[var5] = anIntArray2063[var5];
         }

         anIntArray2063 = var4;
      }

      var2 += var1;
      int var8 = var2 - 2;

      for(var5 = var1; var5 < var2; var5 += 2) {
         int var6 = var0[var8 + 1];
         int var7 = var0[var5 + 1];
         if(var6 < var7) {
            anIntArray2063[anInt2064++] = var0[var8];
            anIntArray2063[anInt2064++] = var6;
            anIntArray2063[anInt2064++] = var0[var5];
            anIntArray2063[anInt2064++] = var7;
         } else if(var7 < var6) {
            anIntArray2063[anInt2064++] = var0[var5];
            anIntArray2063[anInt2064++] = var7;
            anIntArray2063[anInt2064++] = var0[var8];
            anIntArray2063[anInt2064++] = var6;
         }

         var8 = var5;
      }

   }

   static void method2642(int var0) {
      if(anInt2064 < 0) {
         anInt2061 = 0;
         anInt2066 = 0;
         anInt2065 = 0;
         anInt2062 = 2147483646;
      } else {
         method2644(0, anInt2064);
         int var1 = anIntArray2063[1];
         if(var1 < var0) {
            var1 = var0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < anInt2064; var3 += 4) {
            int var4 = anIntArray2063[var3 + 1];
            if(var1 < var4) {
               break;
            }

            int var5 = anIntArray2063[var3];
            int var6 = anIntArray2063[var3 + 2];
            int var7 = anIntArray2063[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + '\u8000';
            anIntArray2063[var3] = var9 + (var1 - var4) * var8;
            anIntArray2063[var3 + 2] = var8;
         }

         anInt2065 = var2;
         anInt2066 = var3;
         anInt2061 = var3;
         anInt2062 = var1 - 1;
      }
   }

   static void method2643(int var0, int var1) {
      if(var1 > var0 + 4) {
         int var2 = var0;
         int var3 = anIntArray2063[var0];
         int var4 = anIntArray2063[var0 + 1];
         int var5 = anIntArray2063[var0 + 2];
         int var6 = anIntArray2063[var0 + 3];

         for(int var7 = var0 + 4; var7 < var1; var7 += 4) {
            int var8 = anIntArray2063[var7 + 1];
            if(var8 < var4) {
               anIntArray2063[var2] = anIntArray2063[var7];
               anIntArray2063[var2 + 1] = var8;
               anIntArray2063[var2 + 2] = anIntArray2063[var7 + 2];
               anIntArray2063[var2 + 3] = anIntArray2063[var7 + 3];
               var2 += 4;
               anIntArray2063[var7] = anIntArray2063[var2];
               anIntArray2063[var7 + 1] = anIntArray2063[var2 + 1];
               anIntArray2063[var7 + 2] = anIntArray2063[var2 + 2];
               anIntArray2063[var7 + 3] = anIntArray2063[var2 + 3];
            }
         }

         anIntArray2063[var2] = var3;
         anIntArray2063[var2 + 1] = var4;
         anIntArray2063[var2 + 2] = var5;
         anIntArray2063[var2 + 3] = var6;
         method2644(var0, var2);
         method2644(var2 + 4, var1);
      }
   }

   static void method2644(int var0, int var1) {
      if(var1 > var0 + 4) {
         int var2 = var0;
         int var3 = anIntArray2063[var0];
         int var4 = anIntArray2063[var0 + 1];
         int var5 = anIntArray2063[var0 + 2];
         int var6 = anIntArray2063[var0 + 3];

         for(int var7 = var0 + 4; var7 < var1; var7 += 4) {
            int var8 = anIntArray2063[var7 + 1];
            if(var8 < var4) {
               anIntArray2063[var2] = anIntArray2063[var7];
               anIntArray2063[var2 + 1] = var8;
               anIntArray2063[var2 + 2] = anIntArray2063[var7 + 2];
               anIntArray2063[var2 + 3] = anIntArray2063[var7 + 3];
               var2 += 4;
               anIntArray2063[var7] = anIntArray2063[var2];
               anIntArray2063[var7 + 1] = anIntArray2063[var2 + 1];
               anIntArray2063[var7 + 2] = anIntArray2063[var2 + 2];
               anIntArray2063[var7 + 3] = anIntArray2063[var2 + 3];
            }
         }

         anIntArray2063[var2] = var3;
         anIntArray2063[var2 + 1] = var4;
         anIntArray2063[var2 + 2] = var5;
         anIntArray2063[var2 + 3] = var6;
         method2644(var0, var2);
         method2644(var2 + 4, var1);
      }
   }

   static void method2645(int var0, int var1) {
      while(true) {
         if(var1 >= var0 + 8) {
            boolean var2 = true;

            for(int var3 = var0 + 4; var3 < var1; var3 += 4) {
               int var4 = anIntArray2063[var3 - 4];
               int var5 = anIntArray2063[var3];
               if(var4 > var5) {
                  var2 = false;
                  anIntArray2063[var3 - 4] = var5;
                  anIntArray2063[var3] = var4;
                  var4 = anIntArray2063[var3 - 2];
                  anIntArray2063[var3 - 2] = anIntArray2063[var3 + 2];
                  anIntArray2063[var3 + 2] = var4;
                  var4 = anIntArray2063[var3 - 1];
                  anIntArray2063[var3 - 1] = anIntArray2063[var3 + 3];
                  anIntArray2063[var3 + 3] = var4;
               }
            }

            if(!var2) {
               var1 -= 4;
               continue;
            }
         }

         return;
      }
   }

   static void method2646(int var0, int var1) {
      if(var1 > var0 + 4) {
         int var2 = var0;
         int var3 = anIntArray2063[var0];
         int var4 = anIntArray2063[var0 + 1];
         int var5 = anIntArray2063[var0 + 2];
         int var6 = anIntArray2063[var0 + 3];

         for(int var7 = var0 + 4; var7 < var1; var7 += 4) {
            int var8 = anIntArray2063[var7 + 1];
            if(var8 < var4) {
               anIntArray2063[var2] = anIntArray2063[var7];
               anIntArray2063[var2 + 1] = var8;
               anIntArray2063[var2 + 2] = anIntArray2063[var7 + 2];
               anIntArray2063[var2 + 3] = anIntArray2063[var7 + 3];
               var2 += 4;
               anIntArray2063[var7] = anIntArray2063[var2];
               anIntArray2063[var7 + 1] = anIntArray2063[var2 + 1];
               anIntArray2063[var7 + 2] = anIntArray2063[var2 + 2];
               anIntArray2063[var7 + 3] = anIntArray2063[var2 + 3];
            }
         }

         anIntArray2063[var2] = var3;
         anIntArray2063[var2 + 1] = var4;
         anIntArray2063[var2 + 2] = var5;
         anIntArray2063[var2 + 3] = var6;
         method2644(var0, var2);
         method2644(var2 + 4, var1);
      }
   }

   static void method2647(int var0, int var1) {
      while(true) {
         if(var1 >= var0 + 8) {
            boolean var2 = true;

            for(int var3 = var0 + 4; var3 < var1; var3 += 4) {
               int var4 = anIntArray2063[var3 - 4];
               int var5 = anIntArray2063[var3];
               if(var4 > var5) {
                  var2 = false;
                  anIntArray2063[var3 - 4] = var5;
                  anIntArray2063[var3] = var4;
                  var4 = anIntArray2063[var3 - 2];
                  anIntArray2063[var3 - 2] = anIntArray2063[var3 + 2];
                  anIntArray2063[var3 + 2] = var4;
                  var4 = anIntArray2063[var3 - 1];
                  anIntArray2063[var3 - 1] = anIntArray2063[var3 + 3];
                  anIntArray2063[var3 + 3] = var4;
               }
            }

            if(!var2) {
               var1 -= 4;
               continue;
            }
         }

         return;
      }
   }

   static void method2648(int var0) {
      if(anInt2064 < 0) {
         anInt2061 = 0;
         anInt2066 = 0;
         anInt2065 = 0;
         anInt2062 = 2147483646;
      } else {
         method2644(0, anInt2064);
         int var1 = anIntArray2063[1];
         if(var1 < var0) {
            var1 = var0;
         }

         byte var2 = 0;

         int var3;
         for(var3 = 0; var3 < anInt2064; var3 += 4) {
            int var4 = anIntArray2063[var3 + 1];
            if(var1 < var4) {
               break;
            }

            int var5 = anIntArray2063[var3];
            int var6 = anIntArray2063[var3 + 2];
            int var7 = anIntArray2063[var3 + 3];
            int var8 = (var6 - var5 << 16) / (var7 - var4);
            int var9 = (var5 << 16) + '\u8000';
            anIntArray2063[var3] = var9 + (var1 - var4) * var8;
            anIntArray2063[var3 + 2] = var8;
         }

         anInt2065 = var2;
         anInt2066 = var3;
         anInt2061 = var3;
         anInt2062 = var1 - 1;
      }
   }

   Class175() throws Throwable {
      throw new Error();
   }

   static void method2649(int var0, int var1) {
      if(var1 > var0 + 4) {
         int var2 = var0;
         int var3 = anIntArray2063[var0];
         int var4 = anIntArray2063[var0 + 1];
         int var5 = anIntArray2063[var0 + 2];
         int var6 = anIntArray2063[var0 + 3];

         for(int var7 = var0 + 4; var7 < var1; var7 += 4) {
            int var8 = anIntArray2063[var7 + 1];
            if(var8 < var4) {
               anIntArray2063[var2] = anIntArray2063[var7];
               anIntArray2063[var2 + 1] = var8;
               anIntArray2063[var2 + 2] = anIntArray2063[var7 + 2];
               anIntArray2063[var2 + 3] = anIntArray2063[var7 + 3];
               var2 += 4;
               anIntArray2063[var7] = anIntArray2063[var2];
               anIntArray2063[var7 + 1] = anIntArray2063[var2 + 1];
               anIntArray2063[var7 + 2] = anIntArray2063[var2 + 2];
               anIntArray2063[var7 + 3] = anIntArray2063[var2 + 3];
            }
         }

         anIntArray2063[var2] = var3;
         anIntArray2063[var2 + 1] = var4;
         anIntArray2063[var2 + 2] = var5;
         anIntArray2063[var2 + 3] = var6;
         method2644(var0, var2);
         method2644(var2 + 4, var1);
      }
   }

   public static void method2650(Class174 var0, int[] var1, int var2, int[] var3, int[] var4) {
      method2637(var0, var1, 0, var1.length, var2, var3, var4);
   }

   static void method2651(int var0, int var1) {
      if(var1 > var0 + 4) {
         int var2 = var0;
         int var3 = anIntArray2063[var0];
         int var4 = anIntArray2063[var0 + 1];
         int var5 = anIntArray2063[var0 + 2];
         int var6 = anIntArray2063[var0 + 3];

         for(int var7 = var0 + 4; var7 < var1; var7 += 4) {
            int var8 = anIntArray2063[var7 + 1];
            if(var8 < var4) {
               anIntArray2063[var2] = anIntArray2063[var7];
               anIntArray2063[var2 + 1] = var8;
               anIntArray2063[var2 + 2] = anIntArray2063[var7 + 2];
               anIntArray2063[var2 + 3] = anIntArray2063[var7 + 3];
               var2 += 4;
               anIntArray2063[var7] = anIntArray2063[var2];
               anIntArray2063[var7 + 1] = anIntArray2063[var2 + 1];
               anIntArray2063[var7 + 2] = anIntArray2063[var2 + 2];
               anIntArray2063[var7 + 3] = anIntArray2063[var2 + 3];
            }
         }

         anIntArray2063[var2] = var3;
         anIntArray2063[var2 + 1] = var4;
         anIntArray2063[var2 + 2] = var5;
         anIntArray2063[var2 + 3] = var6;
         method2644(var0, var2);
         method2644(var2 + 4, var1);
      }
   }

   static void method2652(int var0, int var1) {
      while(true) {
         if(var1 >= var0 + 8) {
            boolean var2 = true;

            for(int var3 = var0 + 4; var3 < var1; var3 += 4) {
               int var4 = anIntArray2063[var3 - 4];
               int var5 = anIntArray2063[var3];
               if(var4 > var5) {
                  var2 = false;
                  anIntArray2063[var3 - 4] = var5;
                  anIntArray2063[var3] = var4;
                  var4 = anIntArray2063[var3 - 2];
                  anIntArray2063[var3 - 2] = anIntArray2063[var3 + 2];
                  anIntArray2063[var3 + 2] = var4;
                  var4 = anIntArray2063[var3 - 1];
                  anIntArray2063[var3 - 1] = anIntArray2063[var3 + 3];
                  anIntArray2063[var3 + 3] = var4;
               }
            }

            if(!var2) {
               var1 -= 4;
               continue;
            }
         }

         return;
      }
   }

   public static void method2653(Class174 var0, int[] var1, int var2) {
      method2637(var0, var1, 0, var1.length, var2, (int[])null, (int[])null);
   }

   static void method2654(int var0, int var1) {
      while(true) {
         if(var1 >= var0 + 8) {
            boolean var2 = true;

            for(int var3 = var0 + 4; var3 < var1; var3 += 4) {
               int var4 = anIntArray2063[var3 - 4];
               int var5 = anIntArray2063[var3];
               if(var4 > var5) {
                  var2 = false;
                  anIntArray2063[var3 - 4] = var5;
                  anIntArray2063[var3] = var4;
                  var4 = anIntArray2063[var3 - 2];
                  anIntArray2063[var3 - 2] = anIntArray2063[var3 + 2];
                  anIntArray2063[var3 + 2] = var4;
                  var4 = anIntArray2063[var3 - 1];
                  anIntArray2063[var3 - 1] = anIntArray2063[var3 + 3];
                  anIntArray2063[var3 + 3] = var4;
               }
            }

            if(!var2) {
               var1 -= 4;
               continue;
            }
         }

         return;
      }
   }
}
