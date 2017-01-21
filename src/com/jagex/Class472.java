package com.jagex;

import com.jagex.Class467;
import com.jagex.Class468;
import com.jagex.Class681;
import com.jagex.client;
import java.util.Comparator;

class Class472 implements Comparator {
   // $FF: synthetic field
   Class467 this$0;

   public boolean method5636(Object var1) {
      return super.equals(var1);
   }

   public boolean method5637(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5642((Class468)var1, (Class468)var2, (short)-6858);
   }

   Class472(Class467 var1) {
      this.this$0 = var1;
   }

   public int method5638(Object var1, Object var2) {
      return this.method5642((Class468)var1, (Class468)var2, (short)14555);
   }

   public int method5639(Object var1, Object var2) {
      return this.method5642((Class468)var1, (Class468)var2, (short)7435);
   }

   public int method5640(Object var1, Object var2) {
      return this.method5642((Class468)var1, (Class468)var2, (short)14894);
   }

   public boolean method5641(Object var1) {
      return super.equals(var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   int method5642(Class468 var1, Class468 var2, short var3) {
      return var1.aLong5344 * -2736634324646376187L > var2.aLong5344 * -2736634324646376187L?1:(var1.aLong5344 * -2736634324646376187L < var2.aLong5344 * -2736634324646376187L?-1:0);
   }

   static final void method5643(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3052(var3, (byte)79);
   }

   static final void method5644(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.anInt10985 * -264476799;
   }
}
