package com.jagex;

import com.jagex.Class265;
import com.jagex.Class285;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class76;

public abstract class Class526_Sub8 extends Class526 {
   static String method9341(int[] var0, int var1) {
      StringBuilder var2 = new StringBuilder();

      for(int var3 = 0; var3 < var0.length; ++var3) {
         Class285 var4 = (Class285)Class76.aClass59_Sub1_813.method89(var0[var3], -519455324);
         if(var4.anInt3095 * -1573051095 != -1) {
            var2.append(" <sprite=").append(var4.anInt3095 * -1573051095).append(">");
         }
      }

      return var2.toString();
   }

   static void method9342(int var0, boolean var1, int var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(22, (long)var0);
      var3.method10584(230428369);
      var3.anInt11678 = 1693201951 * (var1?1:0);
   }
}
