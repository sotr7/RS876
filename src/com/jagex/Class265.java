package com.jagex;

import com.jagex.Class102;
import com.jagex.InterfaceDef;
import com.jagex.Class260;
import com.jagex.Class294;
import com.jagex.NPCDef;
import com.jagex.Class526_Sub21;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub31;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Class97_Sub1_Sub2;

public class Class265 {
   public static Class97_Sub1_Sub2 aClass97_Sub1_Sub2_2974;
   static int anInt2975;
   int[] anIntArray2971;
   byte[] aByteArray2972;
   int[] anIntArray2973;

   int method3552(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if(var5 == 0) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while(true) {
            byte var8 = var1[var7];
            if(var8 < 0) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            int var9;
            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 64)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 32) != 0) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 16)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 8)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 4)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 2)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 1) != 0) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            ++var7;
         }

         return 1 + var7 - var2;
      }
   }

   int method3553(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
      int var7 = 0;
      int var8 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var9 = var1[var2] & 255;
         int var10 = this.anIntArray2971[var9];
         byte var11 = this.aByteArray2972[var9];
         if(0 == var11) {
            throw new RuntimeException("" + var9);
         }

         int var12 = var8 >> 3;
         int var13 = var8 & 7;
         var7 &= -var13 >> 31;
         int var14 = (var13 + var11 - 1 >> 3) + var12;
         var13 += 24;
         var4[var12] = (byte)(var7 |= var10 >>> var13);
         if(var12 < var14) {
            ++var12;
            var13 -= 8;
            var4[var12] = (byte)(var7 = var10 >>> var13);
            if(var12 < var14) {
               ++var12;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if(var12 < var14) {
                  ++var12;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if(var12 < var14) {
                     ++var12;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 << -var13);
                  }
               }
            }
         }

         var8 += var11;
      }

      return (7 + var8 >> 3) - var5;
   }

   int method3554(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      if(var5 == 0) {
         return 0;
      } else {
         int var7 = 0;
         var5 += var4;
         int var8 = var2;

         while(true) {
            byte var9 = var1[var8];
            if(var9 < 0) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            int var10;
            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (var9 & 64)) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 32) != 0) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (var9 & 16)) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (var9 & 8)) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (var9 & 4)) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if(0 != (var9 & 2)) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if((var9 & 1) != 0) {
               var7 = this.anIntArray2973[var7];
            } else {
               ++var7;
            }

            if((var10 = this.anIntArray2973[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if(var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            ++var8;
         }

         return 1 + var8 - var2;
      }
   }

   public Class265(byte[] var1) {
      int var2 = var1.length;
      this.anIntArray2971 = new int[var2];
      this.aByteArray2972 = var1;
      int[] var3 = new int[33];
      this.anIntArray2973 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         byte var6 = var1[var5];
         if(0 != var6) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.anIntArray2971[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if(0 != (var8 & var7)) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if(var11 != var8) {
                     break;
                  }

                  var12 = 1 << 32 - var10;
                  if(0 != (var11 & var12)) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for(var10 = var6 + 1; var10 <= 32; ++var10) {
               if(var3[var10] == var8) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if((var8 & var12) != 0) {
                  if(0 == this.anIntArray2973[var10]) {
                     this.anIntArray2973[var10] = var4;
                  }

                  var10 = this.anIntArray2973[var10];
               } else {
                  ++var10;
               }

               if(var10 >= this.anIntArray2973.length) {
                  int[] var13 = new int[this.anIntArray2973.length * 2];

                  for(int var14 = 0; var14 < this.anIntArray2973.length; ++var14) {
                     var13[var14] = this.anIntArray2973[var14];
                  }

                  this.anIntArray2973 = var13;
               }

               var12 >>>= 1;
            }

            this.anIntArray2973[var10] = ~var5;
            if(var10 >= var4) {
               var4 = 1 + var10;
            }
         }
      }

   }

   int method3555(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if(var5 == 0) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while(true) {
            byte var8 = var1[var7];
            if(var8 < 0) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            int var9;
            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 64)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 32) != 0) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 16)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 8)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 4)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if(0 != (var8 & 2)) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if((var8 & 1) != 0) {
               var6 = this.anIntArray2973[var6];
            } else {
               ++var6;
            }

            if((var9 = this.anIntArray2973[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if(var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            ++var7;
         }

         return 1 + var7 - var2;
      }
   }

   static final void method3556(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class260.method3523(-2080599612);
   }

   public static void method3557(Class526_Sub21 var0, Class526_Sub21 var1, byte var2) {
      if(var0.aClass526_Sub21_10532 != null) {
         var0.uncache(-2086529634);
      }

      var0.aClass526_Sub21_10532 = var1.aClass526_Sub21_10532;
      var0.aClass526_Sub21_10531 = var1;
      var0.aClass526_Sub21_10532.aClass526_Sub21_10531 = var0;
      var0.aClass526_Sub21_10531.aClass526_Sub21_10532 = var0;
   }

   static final void method3558(InterfaceDef var0, Class681 var1, int var2) {
      int var3 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      int var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285] - 1;
      int var5 = var4;
      if(6 != 619744185 * var0.modelType && var0.modelType * 619744185 != 2) {
         throw new RuntimeException("");
      } else {
         NPCDef var6 = (NPCDef)Class76.loader.method89(561507777 * var0.anInt2539, -1987314338);
         if(null == var0.aClass294_2677) {
            var0.aClass294_2677 = new Class294(var6, 6 == var0.modelType * 619744185);
         }

         var0.aClass294_2677.aLong3183 = Class102.method1290(908498662) * 4070890070923293839L;
         if(null != var6.aByteArray3341) {
            if(var4 < 0 || var4 >= var6.aByteArray3341.length) {
               throw new RuntimeException("");
            }

            var5 = var6.aByteArray3341[var4];
         }

         if(null != var6.replacementColours && var5 >= 0 && var5 < var6.replacementColours.length) {
            var0.aClass294_2677.aShortArray3186[var5] = (short)var3;
            Class526_Sub31.method9555(var0, (byte)10);
         } else {
            throw new RuntimeException("");
         }
      }
   }

   static final void method3559(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 & -1 - (1 << var3);
   }

   static Class526_Sub21_Sub9 method3560(int var0, long var1) {
      Class526_Sub21_Sub9.aBool11694 = false;
      Class526_Sub21_Sub9 var3 = (Class526_Sub21_Sub9)Class526_Sub21_Sub9.aClass20_11696.get((long)var0 << 56 | var1);
      if(null == var3) {
         var3 = new Class526_Sub21_Sub9(var0, var1);
         Class526_Sub21_Sub9.aClass20_11696.put(var3, var3.aLong7156 * -6805155999452426801L);
         Class526_Sub21_Sub9.aBool11694 = true;
      }

      return var3;
   }
}
