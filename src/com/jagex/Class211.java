package com.jagex;

import com.jagex.Class153;
import com.jagex.Class231;
import com.jagex.Class482;
import com.jagex.Class681;
import java.util.ArrayList;
import java.util.List;

public class Class211 {
   static Class153 aClass153_2263;
   // $FF: synthetic field
   Class231 this$0;
   List aList2262;

   void method2940(Class482 var1, int var2) {
      this.aList2262.add(var1);
   }

   void method2941(Class482 var1, short var2) {
      this.aList2262.remove(var1);
   }

   Class211(Class231 var1) {
      this.this$0 = var1;
      this.aList2262 = new ArrayList();
   }

   List method2942(int var1) {
      return this.aList2262;
   }

   boolean method2943(Class482 var1, byte var2) {
      return this.aList2262.contains(var1);
   }

   static final void method2944(Class681 var0, byte var1) {
      var0.anInt8623 -= -1957887669;
   }
}
