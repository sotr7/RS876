package com.jagex;

import com.jagex.Class105;
import com.jagex.Class182;
import com.jagex.Class20;
import com.jagex.Class292_Sub1;
import com.jagex.Class31;
import com.jagex.Class526_Sub21;
import com.jagex.Class681;
import com.jagex.Class696;
import com.jagex.Class8;

public final class Class195 {
   public static Class292_Sub1 aClass292_Sub1_2182;
   public static int anInt2183;
   int anInt2179;
   Class526_Sub21 aClass526_Sub21_2180 = new Class526_Sub21();
   Class696 aClass696_2181 = new Class696();
   int anInt2178;
   Class20 aClass20_2177;

   public Class526_Sub21 method2816(long var1) {
      Class526_Sub21 var3 = (Class526_Sub21)this.aClass20_2177.get(var1);
      if(null != var3) {
         this.aClass696_2181.offer(var3, (byte)-53);
      }

      return var3;
   }

   public void method2817(Class526_Sub21 var1, long var2) {
      if(0 == -807560657 * this.anInt2179) {
         Class526_Sub21 var4 = this.aClass696_2181.poll(1615984413);
         var4.method6332(-1949449864);
         var4.uncache(-1676154013);
         if(var4 == this.aClass526_Sub21_2180) {
            var4 = this.aClass696_2181.poll(1496319682);
            var4.method6332(-1949449864);
            var4.uncache(-918565851);
         }
      } else {
         this.anInt2179 -= 920906959;
      }

      this.aClass20_2177.put(var1, var2);
      this.aClass696_2181.offer(var1, (byte)-63);
   }

   public void method2818(int var1) {
      this.aClass696_2181.method8135((byte)-44);
      this.aClass20_2177.method647(929030154);
      this.aClass526_Sub21_2180 = new Class526_Sub21();
      this.anInt2179 = this.anInt2178 * -422413097;
   }

   public void method2819() {
      this.aClass696_2181.method8135((byte)0);
      this.aClass20_2177.method647(929030154);
      this.aClass526_Sub21_2180 = new Class526_Sub21();
      this.anInt2179 = this.anInt2178 * -422413097;
   }

   public void method2820() {
      this.aClass696_2181.method8135((byte)-83);
      this.aClass20_2177.method647(929030154);
      this.aClass526_Sub21_2180 = new Class526_Sub21();
      this.anInt2179 = this.anInt2178 * -422413097;
   }

   public void method2821() {
      this.aClass696_2181.method8135((byte)-91);
      this.aClass20_2177.method647(929030154);
      this.aClass526_Sub21_2180 = new Class526_Sub21();
      this.anInt2179 = this.anInt2178 * -422413097;
   }

   public Class195(int var1) {
      this.anInt2178 = 1748654281 * var1;
      this.anInt2179 = var1 * 920906959;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.aClass20_2177 = new Class20(var2);
   }

   public void method2822() {
      this.aClass696_2181.method8135((byte)-66);
      this.aClass20_2177.method647(929030154);
      this.aClass526_Sub21_2180 = new Class526_Sub21();
      this.anInt2179 = this.anInt2178 * -422413097;
   }

   public void method2823() {
      this.aClass696_2181.method8135((byte)-23);
      this.aClass20_2177.method647(929030154);
      this.aClass526_Sub21_2180 = new Class526_Sub21();
      this.anInt2179 = this.anInt2178 * -422413097;
   }

   static final void method2824(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class8.aClass547_45.method6531(946397148);
   }

   static final int method2825(int var0, int var1, int var2) {
      int var3 = Class182.method2689(var0 - 1, var1 - 1, 677315506) + Class182.method2689(var0 + 1, var1 - 1, 677315506) + Class182.method2689(var0 - 1, 1 + var1, 677315506) + Class182.method2689(var0 + 1, 1 + var1, 677315506);
      int var4 = Class182.method2689(var0 - 1, var1, 677315506) + Class182.method2689(var0 + 1, var1, 677315506) + Class182.method2689(var0, var1 - 1, 677315506) + Class182.method2689(var0, var1 + 1, 677315506);
      int var5 = Class182.method2689(var0, var1, 677315506);
      return var4 / 8 + var3 / 16 + var5 / 4;
   }

   static void method2826(byte var0) {
      Class105.anInt1304 = 0;
      Class105.anInt1300 = 2110507933;
      Class105.anInt1301 = 1654212593;
   }

   static final void method2827(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1600532433 * Class31.anInt273;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1345788195 * Class31.anInt274;
   }
}
