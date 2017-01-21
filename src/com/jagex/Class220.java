package com.jagex;

import com.jagex.Class149;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class27;
import com.jagex.Class27_Sub1;
import com.jagex.RSByteBuffer;
import com.jagex.Class615;
import com.jagex.Class681;

public class Class220 {
   static String aString2297;
   String aString2296;

   Class220(RSByteBuffer var1, boolean var2, boolean var3) {
      if(var2) {
         var1.method9663(1536758578);
      }

      if(var3) {
         this.aString2296 = var1.method9700((byte)2);
      } else {
         this.aString2296 = null;
      }

   }

   public String method3041(int var1) {
      return this.aString2296;
   }

   public String method3042() {
      return this.aString2296;
   }

   public String method3043() {
      return this.aString2296;
   }

   public String method3044() {
      return this.aString2296;
   }

   static final void method3045(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2640 = Class615.method7280(var4, var2, -585519298);
      var0.aBool2560 = true;
   }

   static final void method3046(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub31_10635.method10119(221807002) == 1?1:0;
   }

   public static Class27 method3047(String var0, int var1, int var2) {
      Class27_Sub1 var3 = new Class27_Sub1();
      var3.aString248 = var0;
      var3.anInt249 = -1435449725 * var1;
      return var3;
   }
}
