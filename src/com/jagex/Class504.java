package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.Class31;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub32;
import com.jagex.Class606;
import com.jagex.Class611;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.client;

public class Class504 {
   public static Class504 aClass504_5648 = new Class504();
   static Class504 aClass504_5649 = new Class504();
   static Class504 aClass504_5650 = new Class504();

   static void method6046(String var0, String var1, int var2, int var3, int var4, long var5, int var7, int var8, boolean var9, boolean var10, long var11, boolean var13, byte var14) {
      if(!Class31.aBool291 && Class31.anInt273 * 1600532433 < 516) {
         var2 = -1 != var2?var2:client.anInt11178 * -877016159;
         Class526_Sub21_Sub6 var15 = new Class526_Sub21_Sub6(var0, var1, var2, var3, var4, var5, var7, var8, var9, var10, var11, var13);
         Class606.method7131(var15, 481490912);
      }
   }

   static final void method6047(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.aString2593 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
   }

   static final void method6048(Class681 var0, int var1) {
      Class526_Sub32 var2 = (Class526_Sub32)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1855988921 * var2.anInt10598;
   }

   public static Class611[] method6049(byte var0) {
      return new Class611[]{Class611.aClass611_8014, Class611.aClass611_8018, Class611.aClass611_8015, Class611.aClass611_8016, Class611.aClass611_8013, Class611.aClass611_8017};
   }

   static void method6050(Class681 var0, byte var1) {
      Class285 var2 = (Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], -1514095839);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.anIntArray3076 == null?0:var2.anIntArray3076.length;
   }
}
