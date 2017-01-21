package com.jagex;

import com.jagex.Class184;
import com.jagex.Class216;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class26;
import com.jagex.Class278;
import com.jagex.Class315_Sub1;
import com.jagex.Class361_Sub1;
import com.jagex.Class479;
import com.jagex.Class523;
import com.jagex.Class526_Sub29_Sub1;
import com.jagex.Class628;
import com.jagex.Class630;
import com.jagex.Class681;
import java.util.Comparator;
import java.util.Map;

class Class548 implements Comparator {
   public static Map aMap7273;
   // $FF: synthetic field
   Class361_Sub1 this$0;

   int method6549(Class479 var1, Class479 var2, int var3) {
      float var4 = var1.method5684(-1120126182);
      float var5 = var2.method5684(-1120126182);
      return var5 > var4?1:(var5 < var4?-1:0);
   }

   public int compare(Object var1, Object var2) {
      return this.method6549((Class479)var1, (Class479)var2, -2140686670);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int method6550(Object var1, Object var2) {
      return this.method6549((Class479)var1, (Class479)var2, -830192110);
   }

   public int method6551(Object var1, Object var2) {
      return this.method6549((Class479)var1, (Class479)var2, 1664818948);
   }

   Class548(Class361_Sub1 var1) {
      this.this$0 = var1;
   }

   public boolean method6552(Object var1) {
      return super.equals(var1);
   }

   public boolean method6553(Object var1) {
      return super.equals(var1);
   }

   public boolean method6554(Object var1) {
      return super.equals(var1);
   }

   public int method6555(Object var1, Object var2) {
      return this.method6549((Class479)var1, (Class479)var2, -351446252);
   }

   static final void method6556(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)6);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class278.method3685(var3, var4, false, 1, var0, -1967926949);
   }

   static final void method6557(Class681 var0, byte var1) {
      boolean var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] != 0;
      int var3 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class184.method2709((long)var3, 0, var2, Class26.aClass673_247, -577158686);
   }

   static final void method6558(Class681 var0, short var1) {
      CharSequence var2 = (CharSequence)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class216.method2985(var2, -1976426078);
   }

   static final void method6559(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class630.anInt8218 * -1783195957;
   }

   public static Class526_Sub29_Sub1 method6560(int var0, int var1, int var2, int var3, int var4) {
      Class526_Sub29_Sub1[] var5 = Class526_Sub29_Sub1.aClass526_Sub29_Sub1Array11760;
      synchronized(var5) {
         Class526_Sub29_Sub1 var6;
         if(Class523.anInt7076 * 197486103 == 0) {
            var6 = new Class526_Sub29_Sub1();
         } else {
            var6 = Class526_Sub29_Sub1.aClass526_Sub29_Sub1Array11760[(Class523.anInt7076 -= -2117062233) * 197486103];
         }

         var6.anInt11764 = 2006613079 * var0;
         var6.anInt11769 = var1 * 785650471;
         var6.anInt11765 = 1724759827 * var2;
         var6.anInt11766 = var3 * 1557609233;
         var6.aLong11744 = Class255.time((byte)24) * 5465175754072885841L;
         return var6;
      }
   }

   static Class628[] method6561(int var0) {
      return new Class628[]{Class628.aClass628_8210, Class628.aClass628_8205, Class628.aClass628_8214, Class628.aClass628_8201, Class628.aClass628_8197, Class628.aClass628_8209, Class628.aClass628_8207, Class628.aClass628_8202, Class628.aClass628_8199, Class628.aClass628_8203, Class628.aClass628_8206, Class628.aClass628_8198, Class628.aClass628_8204, Class628.aClass628_8208};
   }
}
