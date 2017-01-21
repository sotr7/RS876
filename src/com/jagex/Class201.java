package com.jagex;

import com.jagex.Class1;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class451;
import com.jagex.Class526_Sub18;
import com.jagex.Class570;
import com.jagex.Class581;
import com.jagex.Class636;
import com.jagex.Class681;
import com.jagex.Class97_Sub1_Sub2;

public class Class201 {
   public static Class97_Sub1_Sub2 aClass97_Sub1_Sub2_2210;
   static Class201 aClass201_2209 = new Class201();
   static Class201 aClass201_2208 = new Class201();
   static Class201 aClass201_2207 = new Class201();

   static final void method2875(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)92);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class1.method519(var3, var4, var0, (byte)23);
   }

   static final void method2876(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class451.localPlayer.aClass34_11940.method817(-618563826);
   }

   static final void method2877(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var0.anInt2599 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * -803558431;
   }

   public static void method2878(boolean var0, int var1) {
      Class526_Sub18 var2;
      for(var2 = (Class526_Sub18)Class526_Sub18.aClass702_10505.method8206((byte)119); null != var2; var2 = (Class526_Sub18)Class526_Sub18.aClass702_10505.method8181(-753421356)) {
         if(null != var2.aClass482_10506) {
            var2.aClass482_10506.method5770(150, -938617916);
            Class570.aClass231_7657.method3204(var2.aClass482_10506, -2002857753);
            var2.aClass482_10506 = null;
         }

         if(var2.aClass482_10497 != null) {
            var2.aClass482_10497.method5770(150, -938617916);
            Class570.aClass231_7657.method3204(var2.aClass482_10497, 1956461045);
            var2.aClass482_10497 = null;
         }

         var2.method6332(-1949449864);
      }

      if(var0) {
         for(var2 = (Class526_Sub18)Class526_Sub18.aClass702_10482.method8206((byte)44); var2 != null; var2 = (Class526_Sub18)Class526_Sub18.aClass702_10482.method8181(1972168527)) {
            if(null != var2.aClass482_10506) {
               var2.aClass482_10506.method5770(150, -938617916);
               Class570.aClass231_7657.method3204(var2.aClass482_10506, -774686921);
               var2.aClass482_10506 = null;
            }

            var2.method6332(-1949449864);
         }

         for(var2 = (Class526_Sub18)Class526_Sub18.aClass20_10483.method638(61068798); null != var2; var2 = (Class526_Sub18)Class526_Sub18.aClass20_10483.method639(-280056063)) {
            if(var2.aClass482_10506 != null) {
               var2.aClass482_10506.method5770(150, -938617916);
               Class570.aClass231_7657.method3204(var2.aClass482_10506, -1197142228);
               var2.aClass482_10506 = null;
            }

            var2.method6332(-1949449864);
         }
      }

   }

   static void method2879(int var0, int var1, int var2, byte var3) {
      if(var0 == 1008) {
         Class636.method7566(Class581.aClass581_7754, var1, var2, 1585784996);
      } else if(1009 == var0) {
         Class636.method7566(Class581.aClass581_7757, var1, var2, -346757370);
      } else if(1010 == var0) {
         Class636.method7566(Class581.aClass581_7766, var1, var2, -1957152383);
      } else if(1011 == var0) {
         Class636.method7566(Class581.aClass581_7755, var1, var2, 1837268397);
      } else if(1012 == var0) {
         Class636.method7566(Class581.aClass581_7756, var1, var2, -1182549351);
      }

   }
}
