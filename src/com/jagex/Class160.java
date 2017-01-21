package com.jagex;

import com.jagex.Class230;
import com.jagex.Class238;
import com.jagex.Class269;
import com.jagex.Class27_Sub1;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub35;
import com.jagex.Class57;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.IcmpService_Sub1;
import com.jagex.Interface74;

public class Class160 {
   Class160() throws Throwable {
      throw new Error();
   }

   static final void method1878(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class57.method1014(-404676821);
   }

   static final void method1879(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      Class690.method8098(10, var2, var3, "", -803150077);
   }

   static final void method1880(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub1_10622.method8313(var2, -1059354517);
   }

   static boolean method1881(int var0, int var1, int var2) {
      return var1 >= 1000 && var0 < 1000?true:(var1 < 1000 && var0 < 1000?(Class269.method3588(var0, (byte)121)?true:!Class269.method3588(var1, (byte)39)):var1 >= 1000 && var0 >= 1000);
   }

   public static Class526_Sub35 method1882(byte var0) {
      if(Class525_Sub1.aClass702_7106 != null && null != Class525_Sub1.aClass695_10709) {
         Class525_Sub1.aClass695_10709.method8130(Class525_Sub1.aClass702_7106, -1117580632);
         Class526_Sub35 var1 = (Class526_Sub35)Class525_Sub1.aClass695_10709.method8120(-996254832);
         if(var1 == null) {
            return null;
         } else {
            Class238 var2 = (Class238)Class525_Sub1.aClass40_Sub6_7088.method89(-1572922363 * var1.anInt10664, 102808695);
            return null != var2 && var2.aBool2434 && var2.method3302(Class525_Sub1.anInterface17_7091, Class525_Sub1.anInterface19_7090, -1095803508)?var1:Class27_Sub1.method10277(-2022481008);
         }
      } else {
         return null;
      }
   }

   public static void method1883(Interface74 var0, int var1) {
      if(null == IcmpService_Sub1.anIcmpService_Sub1_10842) {
         throw new IllegalStateException("");
      } else {
         IcmpService_Sub1.anIcmpService_Sub1_10842.aList10843.add(var0);
      }
   }
}
