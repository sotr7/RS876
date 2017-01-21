package com.jagex;

import com.jagex.Class153;
import com.jagex.Class195;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class40_Sub10;
import com.jagex.Class465;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub32;
import com.jagex.Class526_Sub38;
import com.jagex.Class681;
import com.jagex.Class689_Sub1;
import com.jagex.Interface7;
import com.jagex.client;
import java.util.Map;

public abstract class Class323 implements Interface7 {
   public static Class153 aClass153_3460;
   public static Class40_Sub10 aClass40_Sub10_3461;
   Map aMap3459;

   Class323(Map var1) {
      this.aMap3459 = var1;
   }

   static final void method4154(Class681 var0, byte var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629];
      String var3 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629 + 1];
      if(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3;
      }

   }

   static final void method4155(Class681 var0, int var1) {
      Class526_Sub32 var2 = (Class526_Sub32)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(Class195.aClass292_Sub1_2182.method3940(-2022819710) != Class298.aClass298_3239) {
         throw new RuntimeException();
      } else {
         Class689_Sub1 var3 = (Class689_Sub1)Class195.aClass292_Sub1_2182.method3938((byte)22);
         var3.method10147(var2, 2092890168);
         client.aBool11070 = true;
      }
   }

   static final void method4156(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(-1 != client.anInt11186 * -327748687) {
         if(0 == var2) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.anInt11186 * -327748687;
            return;
         }

         --var2;
      }

      Class526_Sub38 var3;
      for(var3 = (Class526_Sub38)client.aClass20_11187.method638(1003241700); var2-- > 0; var3 = (Class526_Sub38)client.aClass20_11187.method639(-1250347211)) {
         ;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt10684 * -870147923;
   }

   static final void method4157(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var0.aBool2650 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class526_Sub31.method9555(var0, (byte)10);
      if(1300712985 * var0.componentSlot == -1 && !var1.aBool2458) {
         Class465.method5528(var0.uid * 919258769, 700876981);
      }

   }
}
