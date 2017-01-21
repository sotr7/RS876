package com.jagex;

import com.jagex.Class174;
import com.jagex.Class21;
import com.jagex.Class230;
import com.jagex.RSByteBuffer;
import com.jagex.Class619;
import com.jagex.Class681;
import com.jagex.client;

public class Class522 {
   static final int anInt7052 = 8;
   static final int anInt7053 = 2;
   static final int anInt7054 = 1;
   static final int anInt7055 = 16;
   static final int anInt7056 = 62;
   static final int anInt7057 = 63;

   Class522() throws Throwable {
      throw new Error();
   }

   static final void method6256(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub21_10629.method8313(var2, -1759264039);
   }

   public static void method6257(int var0) {
      Class21 var1 = null;

      try {
         var1 = Class619.method7340("", client.aClass676_11127.aString8591, true, -123336143);
         RSByteBuffer var2 = Class230.preferences.method9606((byte)52);
         var1.method650(var2.buffer, 0, var2.pos * 301018015, (byte)-89);
      } catch (Exception var4) {
         ;
      }

      try {
         if(null != var1) {
            var1.method651(1660259151);
         }
      } catch (Exception var3) {
         ;
      }

   }

   static void method6258(Class174 var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      var0.method2356(var1, var2, var3, var4, var5, (byte)76);
      var0.method2356(1 + var1, var2 + 1, var3 - 2, 16, var6, (byte)62);
      var0.method2284(var1 + 1, var2 + 18, var3 - 2, var4 - 19, var6, -1799473633);
   }

   static int method6259(int var0, int var1, int var2) {
      if(9 == var1) {
         var0 = var0 + 1 & 3;
      }

      if(var1 == 10) {
         var0 = var0 + 3 & 3;
      }

      if(var1 == 11) {
         var0 = var0 + 3 & 3;
      }

      return var0;
   }
}
