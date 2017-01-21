package com.jagex;

import com.jagex.Class172;
import com.jagex.Class241;
import com.jagex.Class32;
import com.jagex.Class526_Sub16;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.RSSocket;
import com.jagex.Class60;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.client;

public abstract class Class148 {
   public int anInt1711;
   public int anInt1713;
   public int anInt1712;
   public int anInt1710;
   public int[][] anIntArrayArray1714;

   public abstract void method1698(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method1699(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12);

   public abstract void method1700(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15);

   public final int method1701(int var1, int var2) {
      int var3 = var1 >> -586661047 * this.anInt1710;
      int var4 = var2 >> -586661047 * this.anInt1710;
      if(var3 >= 0 && var4 >= 0 && var3 <= 1966165105 * this.anInt1711 - 1 && var4 <= -810756899 * this.anInt1713 - 1) {
         int var5 = var1 & this.anInt1712 * 1934131013 - 1;
         int var6 = var2 & this.anInt1712 * 1934131013 - 1;
         int var7 = this.anIntArrayArray1714[var3 + 1][var4] * var5 + (this.anInt1712 * 1934131013 - var5) * this.anIntArrayArray1714[var3][var4] >> this.anInt1710 * -586661047;
         int var8 = (1934131013 * this.anInt1712 - var5) * this.anIntArrayArray1714[var3][var4 + 1] + this.anIntArrayArray1714[1 + var3][1 + var4] * var5 >> -586661047 * this.anInt1710;
         return (this.anInt1712 * 1934131013 - var6) * var7 + var8 * var6 >> this.anInt1710 * -586661047;
      } else {
         return 0;
      }
   }

   public final int method1702(int var1, int var2, int var3) {
      return this.anIntArrayArray1714[Math.min(1966165105 * this.anInt1711 - 1, Math.max(0, var1))][Math.min(this.anInt1713 * -810756899 - 1, Math.max(0, var2))];
   }

   public abstract void method1703(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1704(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1705();

   public abstract void method1706(Class526_Sub16 var1, int[] var2);

   public final int method1707(int var1, int var2, int var3) {
      int var4 = var1 >> -586661047 * this.anInt1710;
      int var5 = var2 >> -586661047 * this.anInt1710;
      if(var4 >= 0 && var5 >= 0 && var4 <= 1966165105 * this.anInt1711 - 1 && var5 <= -810756899 * this.anInt1713 - 1) {
         int var6 = var1 & this.anInt1712 * 1934131013 - 1;
         int var7 = var2 & this.anInt1712 * 1934131013 - 1;
         int var8 = this.anIntArrayArray1714[var4 + 1][var5] * var6 + (this.anInt1712 * 1934131013 - var6) * this.anIntArrayArray1714[var4][var5] >> this.anInt1710 * -586661047;
         int var9 = (1934131013 * this.anInt1712 - var6) * this.anIntArrayArray1714[var4][var5 + 1] + this.anIntArrayArray1714[1 + var4][1 + var5] * var6 >> -586661047 * this.anInt1710;
         return (this.anInt1712 * 1934131013 - var7) * var8 + var9 * var7 >> this.anInt1710 * -586661047;
      } else {
         return 0;
      }
   }

   public abstract Class526_Sub21_Sub5 method1708(int var1, int var2, Class526_Sub21_Sub5 var3);

   public abstract void method1709(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method1710(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract boolean method1711(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1712(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method1713(int var1, int var2, int var3);

   public final int method1714(int var1, int var2, int var3) {
      return this.anIntArrayArray1714[var1][var2];
   }

   public abstract void method1715(int var1, int var2, int var3);

   public abstract void method1716(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12);

   public abstract void method1717(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12);

   public abstract void method1718();

   public abstract void method1719(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract void method1720();

   Class148(int var1, int var2, int var3, int[][] var4) {
      this.anInt1711 = var1 * 1102640273;
      this.anInt1713 = 2009244533 * var2;

      int var5;
      for(var5 = 0; var3 > 1; var3 >>= 1) {
         ++var5;
      }

      this.anInt1712 = -971424883 * (1 << var5);
      this.anInt1710 = 510926585 * var5;
      this.anIntArrayArray1714 = var4;
   }

   public abstract void method1721();

   public abstract void method1722(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method1723(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12);

   public final int method1724(int var1, int var2, byte var3) {
      int var4 = var1 >> -586661047 * this.anInt1710;
      int var5 = var2 >> -586661047 * this.anInt1710;
      var4 = Math.min(this.anInt1711 * 1966165105 - 1, Math.max(0, var4));
      var5 = Math.min(-810756899 * this.anInt1713 - 1, Math.max(0, var5));
      int var6 = Math.min(this.anInt1711 * 1966165105 - 1, 1 + var4);
      int var7 = Math.min(this.anInt1713 * -810756899 - 1, var5 + 1);
      int var8 = var1 & this.anInt1712 * 1934131013 - 1;
      int var9 = var2 & 1934131013 * this.anInt1712 - 1;
      int var10 = this.anIntArrayArray1714[var6][var5] * var8 + (1934131013 * this.anInt1712 - var8) * this.anIntArrayArray1714[var4][var5] >> -586661047 * this.anInt1710;
      int var11 = (this.anInt1712 * 1934131013 - var8) * this.anIntArrayArray1714[var4][var7] + var8 * this.anIntArrayArray1714[var6][var7] >> -586661047 * this.anInt1710;
      return var10 * (1934131013 * this.anInt1712 - var9) + var11 * var9 >> this.anInt1710 * -586661047;
   }

   public abstract void method1725(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method1726(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method1727(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract Class526_Sub21_Sub5 method1728(int var1, int var2, Class526_Sub21_Sub5 var3);

   public abstract Class526_Sub21_Sub5 method1729(int var1, int var2, Class526_Sub21_Sub5 var3);

   public abstract void method1730(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1731(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract boolean method1732(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1733(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15);

   public abstract void method1734(int var1, int var2, int var3);

   public abstract void method1735(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1736(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1737();

   public abstract void method1738(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15);

   public abstract void method1739(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class172 var11, boolean var12);

   public abstract void method1740(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class172 var14, boolean var15);

   public abstract void method1741(Class526_Sub21_Sub5 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method1742(Class526_Sub16 var1, int[] var2);

   public final int method1743(int var1, int var2) {
      int var3 = var1 >> -586661047 * this.anInt1710;
      int var4 = var2 >> -586661047 * this.anInt1710;
      var3 = Math.min(this.anInt1711 * 1966165105 - 1, Math.max(0, var3));
      var4 = Math.min(-810756899 * this.anInt1713 - 1, Math.max(0, var4));
      int var5 = Math.min(this.anInt1711 * 1966165105 - 1, 1 + var3);
      int var6 = Math.min(this.anInt1713 * -810756899 - 1, var4 + 1);
      int var7 = var1 & this.anInt1712 * 1934131013 - 1;
      int var8 = var2 & 1934131013 * this.anInt1712 - 1;
      int var9 = this.anIntArrayArray1714[var5][var4] * var7 + (1934131013 * this.anInt1712 - var7) * this.anIntArrayArray1714[var3][var4] >> -586661047 * this.anInt1710;
      int var10 = (this.anInt1712 * 1934131013 - var7) * this.anIntArrayArray1714[var3][var6] + var7 * this.anIntArrayArray1714[var5][var6] >> -586661047 * this.anInt1710;
      return var9 * (1934131013 * this.anInt1712 - var8) + var10 * var8 >> this.anInt1710 * -586661047;
   }

   static final void method1744(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(client.anInt11288 * 2029719417 == 2 && var2 < client.anInt11130 * -17244221) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass50Array11290[var2].aBool651?1:0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static RSByteBuffer method1745(int var0) {
      RSByteBuffer var1 = RSSocket.method551((byte)35);
      long var2;
      if(-1 != Class32.anInt312 * -577726201) {
         var2 = (long)(-577726201 * Class32.anInt312);
      } else if(-1L == Class32.aLong313 * -5590316573601377797L) {
         var2 = Class526_Sub32.method9592(Class32.aString315, -1967340263);
      } else {
         var2 = Class32.aLong313 * -5590316573601377797L;
      }

      Class241.aLong2452 = var2 * 659906319405651197L;
      Class680.method8026(var1, var2);
      var1.method9616(Class32.aString344, -1340020621);
      var1.method9621(7535957818991741991L * Class32.aLong342);
      var1.method9621(client.aLong11023 * 582293486398741001L);
      var1.method9651(Class60.RSA_UPDATE_EXPONENT, Class60.LOGIN_MODULUS, (byte)-33);
      return var1;
   }
}
