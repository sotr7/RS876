package com.jagex;

import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class192;
import com.jagex.Class235;
import com.jagex.Class253;
import com.jagex.Class443;
import com.jagex.Class54;
import com.jagex.Class559;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.Class704;

public abstract class Class178 {
   public static void method2663(byte var0) {
      if(Class570.aBool7638) {
         int var1 = Class570.aTwitchTV7639.ShutdownTTV();
         if(var1 == 0) {
            Class570.aTwitchTV7639 = null;
            Class570.aBool7638 = false;
         }
      }

   }

   static final void method2664(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      boolean var3 = 1 == var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class559.method6722(var2, var3, -703963215);
   }

   static Class method2665(String var0, byte var1) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }

   public static Class168 method2666(Class174 var0, int var1, int var2, int var3, int var4, int var5, Class168 var6, int var7, int var8, int var9, int var10, Class704 var11, int var12) {
      if(var6 == null) {
         return null;
      } else {
         int var13 = 2055;
         if(null != var11) {
            var13 |= var11.method8221((byte)124);
            var13 &= -513;
         }

         long var14 = ((long)var8 << 48) + (long)((var9 << 16) + var5 + (var10 << 24)) + ((long)var7 << 32);
         Class192 var16 = Class54.aClass192_666;
         Class168 var17;
         synchronized(var16) {
            var17 = (Class168)Class54.aClass192_666.method2765(var14);
         }

         int var33;
         if(null == var17 || var0.method2464(var17.method2101(), var13) != 0) {
            if(null != var17) {
               var13 = var0.method2533(var13, var17.method2101());
            }

            var33 = 6 + var5 * 3;
            byte var18 = 3;
            int[] var19 = new int[]{64, 96, 128};
            Class170 var20 = new Class170(var33 * var18 + 1, 2 * var18 * var33 - var33, 0);
            int var21 = var20.method2150(0, 0, 0);
            int[][] var22 = new int[var18][var33];

            int var23;
            int var24;
            int var25;
            int var28;
            for(var23 = 0; var23 < var18; ++var23) {
               var24 = var19[var23];
               var25 = var19[var23];

               for(int var26 = 0; var26 < var33; ++var26) {
                  int var27 = (var26 << 14) / var33;
                  var28 = var24 * Class443.anIntArray4895[var27] >> 14;
                  int var29 = Class443.anIntArray4896[var27] * var25 >> 14;
                  var22[var23][var26] = var20.method2150(var28, 0, var29);
               }
            }

            for(var23 = 0; var23 < var18; ++var23) {
               var24 = (256 * var23 + 128) / var18;
               var25 = 256 - var24;
               byte var38 = (byte)(var10 * var24 + var9 * var25 >> 8);
               short var39 = (short)(((var7 & 127) * var25 + (var8 & 127) * var24 & 32512) + ((var7 & '\ufc00') * var25 + var24 * (var8 & '\ufc00') & 16515072) + ((var8 & 896) * var24 + var25 * (var7 & 896) & 229376) >> 8);

               for(var28 = 0; var28 < var33; ++var28) {
                  if(0 == var23) {
                     var20.method2133(var21, var22[0][(var28 + 1) % var33], var22[0][var28], (byte)1, (byte)-1, var39, var38, (short)-1);
                  } else {
                     var20.method2133(var22[var23 - 1][var28], var22[var23 - 1][(1 + var28) % var33], var22[var23][(1 + var28) % var33], (byte)1, (byte)-1, var39, var38, (short)-1);
                     var20.method2133(var22[var23 - 1][var28], var22[var23][(1 + var28) % var33], var22[var23][var28], (byte)1, (byte)-1, var39, var38, (short)-1);
                  }
               }
            }

            var17 = var0.method2321(var20, var13, 149397041 * Class54.anInt667, 64, 768);
            Class192 var37 = Class54.aClass192_666;
            synchronized(var37) {
               Class54.aClass192_666.method2768(var17, var14);
            }
         }

         var33 = var6.method1979();
         int var34 = var6.method1980();
         int var35 = var6.method1983();
         int var36 = var6.method1984();
         if(null != var11) {
            var17 = var17.method1947((byte)3, var13, true);
            var17.method1957(var34 - var33 >> 1, 128, var36 - var35 >> 1);
            var17.method1955(var34 + var33 >> 1, 0, var35 + var36 >> 1);
            var11.method8233(var17, -378787521);
         } else {
            var17 = var17.method1947((byte)3, var13, true);
            var17.method1957(var34 - var33 >> 1, 128, var36 - var35 >> 1);
            var17.method1955(var33 + var34 >> 1, 0, var36 + var35 >> 1);
         }

         if(var2 != 0) {
            var17.method2076(var2);
         }

         if(var3 != 0) {
            var17.method1954(var3);
         }

         if(var4 != 0) {
            var17.method1955(0, var4, 0);
         }

         return var17;
      }
   }

   static boolean method2667(int var0) {
      return Class235.method3280(Class253.aClass627_2794.aClass582_8193, -153844917);
   }
}
