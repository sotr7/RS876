package com.jagex;

import com.jagex.Class101;
import com.jagex.Class143;
import com.jagex.Class199_Sub3;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class234;
import com.jagex.Class235;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class281;
import com.jagex.Class315_Sub1;
import com.jagex.Class325;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class452_Sub1;
import com.jagex.Class452_Sub2;
import com.jagex.Class452_Sub3;
import com.jagex.Class452_Sub4;
import com.jagex.Class452_Sub5;
import com.jagex.Class526_Sub21_Sub14;
import com.jagex.Class526_Sub29_Sub1;
import com.jagex.Class642;
import com.jagex.Class646;
import com.jagex.Class681;
import com.jagex.Class687;
import com.jagex.Class695;
import com.jagex.IcmpService_Sub1;
import com.jagex.Interface76;
import java.util.Queue;

public class Class452 implements Interface76 {
   Class642 aClass642_4947;
   int anInt4948;
   public static Class452 aClass452_4946;
   public static Class452 aClass452_4937;
   public static Class452 aClass452_4938;
   static Class452 aClass452_4939;
   static Class452 aClass452_4940;
   public static Class452 aClass452_4941;
   public static Class452 aClass452_4942;
   public static Class452 aClass452_4936;
   static Class452 aClass452_4943;
   public static Class452 aClass452_4944;
   static Class452 aClass452_4945;

   // $FF: synthetic method
   Class452(Class642 var1, int var2, boolean var3, boolean var4, Class452_Sub5 var5) {
      this(var1, var2, var3, var4);
   }

   Class452(Class642 var1, int var2, boolean var3, boolean var4) {
      this.aClass642_4947 = var1;
      this.anInt4948 = var2 * -1777987003;
   }

   public final Class642 method5360(int var1) {
      return this.aClass642_4947;
   }

   public Object method5361(Class143 var1, byte var2) {
      return var1.aBool1678?this.method5362(var1, 1845367449):var1.aClass454_1676.method5390(1915984561);
   }

   Object method5362(Class143 var1, int var2) {
      return var1.aClass454_1676.method5390(1340157264);
   }

   public int method21() {
      return this.anInt4948 * -1350618995;
   }

   static {
      aClass452_4946 = new Class452_Sub5(Class642.aClass642_8403, 0, true, true);
      aClass452_4937 = new Class452_Sub4(Class642.aClass642_8404, 1, false, true);
      aClass452_4938 = new Class452_Sub1(Class642.aClass642_8405, 2, true, true);
      aClass452_4939 = new Class452_Sub3(Class642.aClass642_8406, 3, false, false);
      aClass452_4940 = new Class452(Class642.aClass642_8407, 4, false, false);
      aClass452_4941 = new Class452(Class642.aClass642_8408, 5, true, true);
      aClass452_4942 = new Class452(Class642.aClass642_8373, 6, true, true);
      aClass452_4936 = new Class452(Class642.aClass642_8410, 7, true, false);
      aClass452_4943 = new Class452_Sub2(Class642.aClass642_8385, 8, false, false);
      aClass452_4944 = new Class452(Class642.aClass642_8353, 9, false, true);
      aClass452_4945 = new Class452(Class642.aClass642_8417, 10, false, false);
   }

   public static Class452[] method5363(byte var0) {
      return new Class452[]{aClass452_4945, aClass452_4942, aClass452_4940, aClass452_4944, aClass452_4943, aClass452_4946, aClass452_4939, aClass452_4941, aClass452_4938, aClass452_4937, aClass452_4936};
   }

   Object method5364(Class143 var1) {
      return var1.aClass454_1676.method5390(1894728319);
   }

   Object method5365(Class143 var1) {
      return var1.aClass454_1676.method5390(1413560311);
   }

   public int getId() {
      return this.anInt4948 * -1350618995;
   }

   public Object method5366(Class143 var1) {
      return var1.aBool1678?this.method5362(var1, 1731957633):var1.aClass454_1676.method5390(1790078739);
   }

   public static void method5367(Class384 var0, Class389 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, byte var11) {
      Class101.aClass384_1215 = var0;
      Class101.aClass389_1208 = var1;
      IcmpService_Sub1.anInt10844 = var2 * 1428510879;
      Class101.anInt1214 = 579756943 * var3;
      Class101.anInt1210 = -1832858355 * var4;
      Class101.anInt1211 = -1735774061 * var5;
      Class234.anInt2389 = -245392783 * var6;
      Class695.anInt8753 = var7 * 708546935;
      Class235.anInt2390 = var8 * 1130105951;
      Class101.aClass173_1213 = null;
      Class526_Sub21_Sub14.aClass173_11824 = null;
      Class687.aClass173_8678 = null;
      Class101.anInt1207 = -1742781493 * var9;
      Class101.anInt1212 = var10 * 334415603;
      Class325.method4179((byte)-25);
      Class281.aBool3047 = true;
   }

   static final void method5368(Class681 var0, short var1) {
      var0.anInt8623 -= -1957887669;
   }

   static final void method5369(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub42_10607.method10199((byte)10);
   }

   public static int method5370(int var0, byte var1) {
      int var2 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var2 + var0;
   }

   static final void method5371(Class681 var0, int var1) {
      long var2 = var0.aLongArray8626[(var0.anInt8630 -= 1112803603) * -1032509157];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = -1L == var2?"":Long.toString(var2, 36).toUpperCase();
   }

   static final void method5372(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)2);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class199_Sub3.method8995(var3, var4, var0, -256083580);
   }

   public static void method5373(byte var0) {
      Queue var1 = Class646.aQueue8451;
      synchronized(var1) {
         while(true) {
            Class526_Sub29_Sub1 var2 = (Class526_Sub29_Sub1)Class646.aQueue8451.poll();
            if(var2 == null) {
               return;
            }

            var2.method9533((byte)-69);
         }
      }
   }
}
