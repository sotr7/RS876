package com.jagex;

import com.jagex.Class149;
import com.jagex.Class162;
import com.jagex.Class200;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class615;
import com.jagex.Class653;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class711_Sub20;

public class Class256 {
   Class256() throws Throwable {
      throw new Error();
   }

   public static final void method3500(long var0) {
      if(var0 > 0L) {
         if(0L == var0 % 10L) {
            Class711_Sub20.method10041(var0 - 1L);
            Class711_Sub20.method10041(1L);
         } else {
            Class711_Sub20.method10041(var0);
         }

      }
   }

   public static final void method3501(long var0) {
      if(var0 > 0L) {
         if(0L == var0 % 10L) {
            Class711_Sub20.method10041(var0 - 1L);
            Class711_Sub20.method10041(1L);
         } else {
            Class711_Sub20.method10041(var0);
         }

      }
   }

   static final void method3502(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         ;
      }

   }

   static final void method3503(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         ;
      }

   }

   static final void method3504(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-106);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class200.method2869(var3, var4, var0, -604224895);
   }

   static final void method3505(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2670 = Class615.method7280(var4, var2, -1713339905);
      var0.aBool2560 = true;
   }

   static final void method3506(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class162.method1894(var3, var0, 2074537478);
   }

   static final void method3507(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)88);
      Class653.method7797(var3, var0, 221336921);
   }
}
