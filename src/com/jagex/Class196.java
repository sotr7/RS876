package com.jagex;

import com.jagex.Class11;
import com.jagex.Class153;
import com.jagex.Class176;
import com.jagex.Class181;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.Class266;
import com.jagex.Class280;
import com.jagex.Class285;
import com.jagex.Class289;
import com.jagex.Class395;
import com.jagex.Class448_Sub1;
import com.jagex.Class466;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub21_Sub10;
import com.jagex.RSByteBuffer;
import com.jagex.Class531_Sub1;
import com.jagex.Class539_Sub4;
import com.jagex.Class554;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.client;

public class Class196 {
   public static Class395 aClass395_2191;
   int[] anIntArray2184;
   int[] anIntArray2185;
   int[] anIntArray2190;
   int[] anIntArray2187;
   int[] anIntArray2188;
   int[] anIntArray2186;
   int[] anIntArray2189;

   void method2828(int var1) {
      int[][] var2 = new int[this.anIntArray2184.length << 1][4];

      for(int var3 = 0; var3 < this.anIntArray2184.length; ++var3) {
         var2[var3 * 2][0] = this.anIntArray2184[var3];
         var2[2 * var3][1] = this.anIntArray2185[var3];
         var2[2 * var3][2] = this.anIntArray2190[var3];
         var2[2 * var3][3] = this.anIntArray2187[var3];
         var2[1 + 2 * var3][0] = this.anIntArray2188[var3];
         var2[1 + 2 * var3][1] = this.anIntArray2186[var3];
         var2[1 + 2 * var3][2] = this.anIntArray2189[var3];
         var2[var3 * 2 + 1][3] = this.anIntArray2187[var3];
      }

      client.anIntArrayArrayArray11100[var1] = var2;
   }

   void method2829(int var1, byte var2) {
      int[][] var3 = new int[this.anIntArray2184.length << 1][4];

      for(int var4 = 0; var4 < this.anIntArray2184.length; ++var4) {
         var3[var4 * 2][0] = this.anIntArray2184[var4];
         var3[2 * var4][1] = this.anIntArray2185[var4];
         var3[2 * var4][2] = this.anIntArray2190[var4];
         var3[2 * var4][3] = this.anIntArray2187[var4];
         var3[1 + 2 * var4][0] = this.anIntArray2188[var4];
         var3[1 + 2 * var4][1] = this.anIntArray2186[var4];
         var3[1 + 2 * var4][2] = this.anIntArray2189[var4];
         var3[var4 * 2 + 1][3] = this.anIntArray2187[var4];
      }

      client.anIntArrayArrayArray11100[var1] = var3;
   }

   Class196(RSByteBuffer var1) {
      int var2 = var1.readSmart(-1255757185);
      this.anIntArray2184 = new int[var2];
      this.anIntArray2185 = new int[var2];
      this.anIntArray2190 = new int[var2];
      this.anIntArray2187 = new int[var2];
      this.anIntArray2188 = new int[var2];
      this.anIntArray2186 = new int[var2];
      this.anIntArray2189 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.anIntArray2184[var3] = var1.readUnsignedShort(932621548) - 5120;
         this.anIntArray2190[var3] = var1.readUnsignedShort(2101710301) - 5120;
         this.anIntArray2185[var3] = var1.readShort((byte)1);
         this.anIntArray2188[var3] = var1.readUnsignedShort(1661224537) - 5120;
         this.anIntArray2189[var3] = var1.readUnsignedShort(2001210537) - 5120;
         this.anIntArray2186[var3] = var1.readShort((byte)1);
         this.anIntArray2187[var3] = var1.readShort((byte)1);
      }

   }

   static final void method2830(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   public static int method2831(int var0, int var1, boolean var2, int var3) {
      int var4 = 0;
      Class526_Sub2 var5 = Class531_Sub1.method9301(var0, var2, 1588792328);
      if(null == var5) {
         return 0;
      } else {
         for(int var6 = 0; var6 < var5.anIntArray10331.length; ++var6) {
            if(var5.anIntArray10331[var6] >= 0 && ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var5.anIntArray10331[var6], -237126240)).anInt95 * 2010837401 == var1) {
               var4 += Class539_Sub4.method9293(var0, var6, var2, (short)19120);
            }
         }

         return var4;
      }
   }

   static final void method2832(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub12_10613.method8313(var2, -1097407272);
   }

   public static Class526_Sub21_Sub10 method2833(int var0, byte var1) {
      return (Class526_Sub21_Sub10)Class280.aClass20_3036.get((long)var0);
   }

   static void method2834(Class681 var0, byte var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2], -1394426649)).method3788(Class242.aClass94_2456, var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1], 1433180454)?1:0;
      var0.anInt8623 -= -1957887669;
   }

   public static Class153 method2835(Class466 var0, int var1, byte var2) {
      Class153 var3 = (Class153)Class289.aClass192_3109.method2765((long)var1);
      if(null == var3) {
         if(Class266.aBool2981) {
            var3 = Class554.aClass174_7475.method2310(Class181.method2680(var0, var1), true);
         } else {
            var3 = Class176.method2657(var0.method5541(var1, 16777472), (byte)-21);
         }

         Class289.aClass192_3109.method2768(var3, (long)var1);
      }

      return var3;
   }
}
