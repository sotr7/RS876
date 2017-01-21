package com.jagex;

import com.jagex.Class199_Sub22;
import com.jagex.Class230;
import com.jagex.Class24;
import com.jagex.Class259;
import com.jagex.Class31;
import com.jagex.Class333;
import com.jagex.Class383;
import com.jagex.Class432;
import com.jagex.Class465;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.RSByteBuffer;
import com.jagex.Class535;
import com.jagex.Class569;
import com.jagex.Class573;
import com.jagex.Class681;
import com.jagex.client;

public class Class531 {
   public static Class432 aClass432_7184;
   // $FF: synthetic field
   Class535 this$0;
   Class333[] aClass333Array7183;
   Class333[] aClass333Array7182;

   Class531(Class535 var1) {
      this.this$0 = var1;
      this.aClass333Array7183 = new Class333[16];
      this.aClass333Array7182 = new Class333[16];
      new Class333(8);

      for(int var2 = 0; var2 < 16; ++var2) {
         this.aClass333Array7183[var2] = new Class333(3);
         this.aClass333Array7182[var2] = new Class333(3);
      }

   }

   static Class573 method6376(RSByteBuffer var0, int var1) {
      int var2 = var0.readUnsignedByte(-2122218051);
      int var3 = var0.readUnsignedByte(637448618);
      return new Class573(var2, var3);
   }

   static final void method6377(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub29_10605, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-13249);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static final void method6378(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub31_10635.method10118(1798670761)?1:0;
   }

   public static int method6379(Class526_Sub21_Sub6 var0, int var1) {
      if(Class31.aBool291) {
         return 6;
      } else if(var0 == null) {
         return 0;
      } else {
         int var2 = var0.anInt11659 * 976428997;
         return Class383.method4721(var2, -846759973)?1:(Class199_Sub22.method9036(var2, 1637659202)?2:(Class259.method3519(var2, 1965178923)?3:(Class569.method6840(var2, 1048820264)?4:(Class465.method5526(var2, (byte)90)?7:(16 == var2?8:5)))));
      }
   }

   static final void method6380(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      if(var3 == -1) {
         throw new RuntimeException();
      } else {
         Class24 var5 = (Class24)Class465.aClass40_Sub17_5321.method89(var3, -1881320580);
         if(var5.aClass454_234.getId() != var2) {
            throw new RuntimeException();
         } else {
            int[] var6 = var5.method702(Integer.valueOf(var4), -1843458114);
            int var7 = 0;
            if(null != var6) {
               var7 = var6.length;
            }

            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var7;
         }
      }
   }
}
