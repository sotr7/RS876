package com.jagex;

import com.jagex.Class11;
import com.jagex.Class198;
import com.jagex.Class448_Sub1;
import com.jagex.Class465;
import com.jagex.Class517;
import com.jagex.Class666;
import com.jagex.Class681;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;
import java.io.File;

public class Class185 {
   public int anInt2121;
   public int anInt2119;
   int anInt2120;
   public int anInt2118;

   Class185 method2712(int var1, int var2) {
      return new Class185(this.anInt2121 * 1134790901, var1, this.anInt2120 * -331338413, this.anInt2118 * 641681561);
   }

   Class185(int var1, int var2, int var3, int var4) {
      this.anInt2121 = var1 * -1630608547;
      this.anInt2119 = -1311219389 * var2;
      this.anInt2120 = 1314954971 * var3;
      this.anInt2118 = var4 * -1124168791;
   }

   static void method2713(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      TwitchWebcamDevice var4 = Class198.method2847(var2, -303435584);
      TwitchWebcamDeviceCapability var5 = null;
      if(null != var4) {
         var5 = var4.method1240(var3);
      }

      if(null == var5) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -387611777 * var5.anInt1146;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1476702293 * var5.anInt1147;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.anInt1148 * 1817722091;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -657337259 * var5.anInt1149;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var5.anInt1150 * 381854419;
      }

   }

   static final void method2714(Class681 var0, int var1) {
      Class465.method5524(var0, 1466481302);
   }

   static final void method2715(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class11 var3 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, 29547475);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt95 * 2010837401;
   }

   public static byte[] method2716(File var0, int var1) {
      return Class517.method6230(var0, (int)var0.length(), (byte)1);
   }

   public static boolean method2717(char var0, int var1) {
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(0 != var0) {
            char[] var2 = Class666.aCharArray8526;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if(var0 == var4) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
