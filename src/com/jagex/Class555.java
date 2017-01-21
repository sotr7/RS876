package com.jagex;

import com.jagex.Class174;
import com.jagex.Class199_Sub17;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class385;
import com.jagex.Class559;
import com.jagex.Class639_Sub1;
import com.jagex.Class681;
import java.util.Stack;

public class Class555 {
   Class559 aClass559_7476;
   public Class639_Sub1 aClass639_Sub1_7477;
   boolean aBool7479;
   static String aString7480;
   public static long aLong7481;
   static Stack aStack7478 = new Stack();

   public boolean method6686(Class174 var1, int var2, int var3, int var4) {
      int var5 = this.aClass639_Sub1_7477.method9837((short)-4778);
      if(this.aClass639_Sub1_7477.aClass164Array10829 != null) {
         for(int var6 = 0; var6 < this.aClass639_Sub1_7477.aClass164Array10829.length; ++var6) {
            this.aClass639_Sub1_7477.aClass164Array10829[var6].anInt1787 <<= var5;
            if(this.aClass639_Sub1_7477.aClass164Array10829[var6].method1927(-1066744549 * this.aClass559_7476.anInt7540 + var2, var3 + 1195730139 * this.aClass559_7476.anInt7542) && this.aClass639_Sub1_7477.method9818(var1, var2, var3, (byte)64)) {
               this.aClass639_Sub1_7477.aClass164Array10829[var6].anInt1787 >>= var5;
               return true;
            }

            this.aClass639_Sub1_7477.aClass164Array10829[var6].anInt1787 >>= var5;
         }
      }

      return false;
   }

   public static void method6687() {
      Stack var0 = aStack7478;
      synchronized(var0) {
         aStack7478 = new Stack();
      }
   }

   public static void method6688() {
      Stack var0 = aStack7478;
      synchronized(var0) {
         aStack7478 = new Stack();
      }
   }

   public static void method6689() {
      Stack var0 = aStack7478;
      synchronized(var0) {
         aStack7478 = new Stack();
      }
   }

   static final void method6690(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)0);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class199_Sub17.method9023(var3, var4, var0, (byte)-102);
   }

   static final void method6691(Class681 var0, byte var1) {
      Class385.anInt4038 = 0;
   }
}
