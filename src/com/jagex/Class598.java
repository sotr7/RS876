package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class288;
import com.jagex.Class499;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface76;

public class Class598 implements Interface76 {
   int anInt7860;
   static Class598 aClass598_7861 = new Class598(0);
   static Class598 aClass598_7858 = new Class598(1);
   static Class598 aClass598_7859 = new Class598(2);

   public int method21() {
      return 429255923 * this.anInt7860;
   }

   Class598(int var1) {
      this.anInt7860 = var1 * -1995633605;
   }

   public int getId() {
      return 429255923 * this.anInt7860;
   }

   static final void method7072(Class681 var0, int var1) {
      var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1] = var0.aClass526_Sub9_8646.method9348(-1043114055)[var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1]];
   }

   static final void method7073(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class288.method3813(var3, var4, var0, -1416970677);
   }

   static void method7074(RSByteBuffer var0, int var1, int var2) {
      if(null != Class499.aClass23_5619) {
         try {
            Class499.aClass23_5619.method679(0L);
            Class499.aClass23_5619.method684(var0.buffer, var1, 24, -1488621173);
         } catch (Exception var4) {
            ;
         }
      }

   }
}
