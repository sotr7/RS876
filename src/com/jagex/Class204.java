package com.jagex;

import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class546;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.client;

public class Class204 {
   public static Class204 aClass204_2217 = new Class204();
   static Class204 aClass204_2216 = new Class204();
   static Class204 aClass204_2218 = new Class204();
   static Class204 aClass204_2215 = new Class204();
   public static Class204 aClass204_2219 = new Class204();

   public static void method2890(boolean var0, boolean var1, int var2) {
      Class570.aBool7654 = var0;
      Class570.aBool7646 = var1;
   }

   static final void method2891(Class681 var0, int var1) {
      String var2 = null;
      if(null != Class546.aClass49_7271) {
         var2 = Class546.aClass49_7271.method934((byte)24);
      }

      if(null == var2) {
         var2 = "";
      }

      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
   }

   static final void method2892(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aBool10993?1:0;
   }

   public static InterfaceDef method2893(int var0, int var1, int var2) {
      InterfaceDef var3 = Class221.method3095(var0, (byte)22);
      return -1 == var1?var3:(null != var3 && var3.aClass245Array2662 != null && var1 < var3.aClass245Array2662.length?var3.aClass245Array2662[var1]:null);
   }
}
