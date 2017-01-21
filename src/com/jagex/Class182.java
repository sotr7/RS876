package com.jagex;

import com.jagex.Class38;
import com.jagex.Class385;
import com.jagex.Class681;
import com.jagex.Interface49;
import com.jagex.client;
import java.awt.datatransfer.Clipboard;

public class Class182 {
   public int anInt2079;
   public Class182 aClass182_2080;
   public int anInt2083;
   public int anInt2085;
   public int anInt2087;
   public int anInt2090;
   public int anInt2091;
   public int anInt2092;
   public int anInt2093;
   public int anInt2094;
   public static Clipboard aClipboard2095;
   public int anInt2082;
   public int anInt2081;
   public int anInt2086;
   public int anInt2088;
   public int anInt2084;
   byte aByte2089;

   public Class385 method2684(Interface49 var1, int var2) {
      return var1.method353(274808845 * this.anInt2082, (byte)1);
   }

   Class182(int var1, int var2, int var3, int var4, int var5, byte var6) {
      this.anInt2082 = 1594691269 * var1;
      this.anInt2081 = 1028712989 * var2;
      this.anInt2086 = -2086196877 * var3;
      this.anInt2088 = var4 * 32091631;
      this.anInt2084 = var5 * 686714081;
      this.aByte2089 = var6;
   }

   Class182 method2685(int var1, int var2, int var3, int var4, byte var5) {
      return new Class182(274808845 * this.anInt2082, var1, var2, var3, var4, this.aByte2089);
   }

   static final void method2686(Class681 var0, int var1) {
      var0.anInt8644 += -873681181 * var0.anIntArray8642[var0.anInt8644 * -244840757];
   }

   static final void method2687(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aShort11274;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aShort11275;
   }

   static final void method2688(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class38.method847(-1215165140).getId();
   }

   static final int method2689(int var0, int var1, int var2) {
      int var3 = var0 + var1 * 57;
      var3 ^= var3 << 13;
      int var4 = var3 * (789221 + var3 * var3 * 15731) + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   static final void method2690(Class681 var0, boolean var1, byte var2) {
      int var3 = var0.anIntArray8642[var0.anInt8644 * -244840757];
      var0.anInt8623 -= 379191958;
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var5 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      if(var4 >= 0 && var4 < var0.anIntArray8620[var3]) {
         var0.anIntArrayArray8645[var3][var4] = var5;
         if(var1) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
         }

      } else {
         throw new RuntimeException();
      }
   }
}
