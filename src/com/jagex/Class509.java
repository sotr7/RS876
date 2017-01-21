package com.jagex;

import com.jagex.Class199_Sub18;
import com.jagex.Class32;
import com.jagex.Class502;
import com.jagex.Buffer;
import com.jagex.Class588;
import com.jagex.Class681;
import com.jagex.client;

public class Class509 {
   Class502 aClass502_6977;
   Buffer aClass526_Sub36_Sub2_6978;

   public Class509(Class502 var1, Buffer var2) {
      this.aClass502_6977 = var1;
      this.aClass526_Sub36_Sub2_6978 = var2;
   }

   static final void method6163(Class681 var0, byte var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anInt8623 -= 379191958;
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2.substring(var3, var4);
   }

   static final void method6164(Class681 var0, int var1) {
      client.aClass245_11003 = null;
      client.aClass245_11198 = null;
   }

   static Class588 method6165(int var0, byte var1) {
      Class588[] var2 = Class199_Sub18.method9029((byte)1);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class588 var4 = var2[var3];
         if(var0 == var4.anInt7800 * 2105787051) {
            return var4;
         }
      }

      return null;
   }

   public static final boolean method6166(int var0) {
      return 7 != -1216905875 * Class32.anInt341;
   }
}
