package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class315_Sub1;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class528;
import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;
import java.util.Iterator;

public class Class215 implements Interface76 {
   static Class526_Sub21_Sub6 aClass526_Sub21_Sub6_2274;
   static Iterator anIterator2275;
   int anInt2272;
   int anInt2273;
   public static Class215 aClass215_2271 = new Class215(2, 0);
   public static Class215 aClass215_2269 = new Class215(0, 1);
   public static Class215 aClass215_2270 = new Class215(1, 2);

   Class215(int var1, int var2) {
      this.anInt2272 = var1 * 31964913;
      this.anInt2273 = var2 * -1271685115;
   }

   public int getId() {
      return -150459187 * this.anInt2273;
   }

   public static Class215[] method2963(int var0) {
      return new Class215[]{aClass215_2269, aClass215_2270, aClass215_2271};
   }

   public int method21() {
      return -150459187 * this.anInt2273;
   }

   static final void method2964(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1527682435 * client.publicTradeStatus;
   }

   static final void method2965(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-82);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class278.method3685(var3, var4, true, 1, var0, -1512420908);
   }

   public static void method2966(int var0) {
      Class528.method6346(-874851641);
   }
}
