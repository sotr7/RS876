package com.jagex;

import com.jagex.Class143_Sub1;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class323;
import com.jagex.Class498;
import com.jagex.Class523;
import com.jagex.Class681;
import com.jagex.Class97_Sub1_Sub1;
import java.util.Iterator;

class Class241 implements Iterator {
   static long aLong2452;
   // $FF: synthetic field
   Class97_Sub1_Sub1 this$0;
   int anInt2451;

   Class241(Class97_Sub1_Sub1 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.anInt2451 * -164389195 < this.this$0.method87(-1400220793);
   }

   public Object next() {
      int var1 = (this.anInt2451 += -1246175331) * -164389195 - 1;
      Class143_Sub1 var2 = (Class143_Sub1)this.this$0.aClass192_11322.method2765((long)var1);
      return var2 != null?var2:this.this$0.method10384(var1, (byte)34);
   }

   public void method3311() {
      throw new UnsupportedOperationException();
   }

   public boolean method3312() {
      return this.anInt2451 * -164389195 < this.this$0.method87(-75992209);
   }

   public void method3313() {
      throw new UnsupportedOperationException();
   }

   public void method3314() {
      throw new UnsupportedOperationException();
   }

   public void method3315() {
      throw new UnsupportedOperationException();
   }

   public void method3316() {
      throw new UnsupportedOperationException();
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public Object method3317() {
      int var1 = (this.anInt2451 += -1246175331) * -164389195 - 1;
      Class143_Sub1 var2 = (Class143_Sub1)this.this$0.aClass192_11322.method2765((long)var1);
      return var2 != null?var2:this.this$0.method10384(var1, (byte)-19);
   }

   public Object method3318() {
      int var1 = (this.anInt2451 += -1246175331) * -164389195 - 1;
      Class143_Sub1 var2 = (Class143_Sub1)this.this$0.aClass192_11322.method2765((long)var1);
      return var2 != null?var2:this.this$0.method10384(var1, (byte)30);
   }

   public static void method3319(int var0) {
      InterfaceDef.aClass192_2489.method2770(288925511);
      InterfaceDef.aClass192_2492.method2770(1040712660);
      InterfaceDef.aClass192_2490.method2770(1773410552);
      InterfaceDef.aClass192_2559.method2770(1148181888);
   }

   static final void method3320(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)26);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class323.method4157(var3, var4, var0, (byte)51);
   }

   static final void method3321(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class523.anInt7077 * -295853721;
   }

   static final void method3322(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1278444757 * Class498.anInt5592;
   }
}
