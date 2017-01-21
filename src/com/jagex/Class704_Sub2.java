package com.jagex;

import com.jagex.Class195;
import com.jagex.Class206;
import com.jagex.InterfaceDef;
import com.jagex.Class446;
import com.jagex.Class570;
import com.jagex.Class639_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class704;
import com.jagex.Exception_Sub2;

public class Class704_Sub2 extends Class704 {
   Class639_Sub1 aClass639_Sub1_10964;

   void method8240(Class206 var1, int var2, int var3) {
      Class570.aClass231_7657.method3215(var1, var2, this.aClass639_Sub1_10964, 378375821);
   }

   void method8242(Class206 var1, int var2) {
      Class570.aClass231_7657.method3215(var1, var2, this.aClass639_Sub1_10964, 189713905);
   }

   Class704_Sub2(Class639_Sub1 var1, boolean var2) {
      super(var2);
      this.aClass639_Sub1_10964 = var1;
   }

   static final void method10250(Class681 var0, short var1) throws Exception_Sub2 {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2];
      int var5 = var0.anIntArray8622[3 + var0.anInt8623 * -1730576285];
      Class446 var6 = Class446.method5309((float)var2, (float)var3, (float)var4);
      if(var6.aFloat4917 == -1.0F) {
         var6.aFloat4917 = Float.POSITIVE_INFINITY;
      }

      if(var6.aFloat4915 == -1.0F) {
         var6.aFloat4915 = Float.POSITIVE_INFINITY;
      }

      if(var6.aFloat4919 == -1.0F) {
         var6.aFloat4919 = Float.POSITIVE_INFINITY;
      }

      Class195.aClass292_Sub1_2182.method3935(var6, -1209503832);
      Class195.aClass292_Sub1_2182.method3894((float)var5 / 1000.0F, (byte)-107);
      var6.method5278();
   }

   static final void method10251(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1546678639 * var3.anInt2546;
   }
}
