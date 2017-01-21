package com.jagex;

import com.jagex.Class16;
import com.jagex.Class191;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class285;
import com.jagex.Class317;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class584;
import com.jagex.RSSocket;
import com.jagex.Class638;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class691;
import com.jagex.Class76;

public class Class298 {
   public static Class298 aClass298_3239 = new Class298(0, false);
   public static Class298 aClass298_3237 = new Class298(1, false);
   static Class298 aClass298_3238 = new Class298(2, true);
   public static Class298 aClass298_3241 = new Class298(3, false);
   static Class298 aClass298_3240 = new Class298(4, true);
   static Class298 aClass298_3242 = new Class298(5, true);
   static Class298 aClass298_3236 = new Class298(6, true);
   public int anInt3243;
   boolean aBool3244;

   public boolean method3974(int var1) {
      return this.aBool3244;
   }

   public boolean method3975() {
      return this.aBool3244;
   }

   public boolean method3976() {
      return this.aBool3244;
   }

   Class298(int var1, boolean var2) {
      this.anInt3243 = -1390625911 * var1;
      this.aBool3244 = var2;
   }

   public boolean method3977() {
      return this.aBool3244;
   }

   public boolean method3978() {
      return this.aBool3244;
   }

   public boolean method3979() {
      return this.aBool3244;
   }

   static void method3980(Class243 var0, InterfaceDef var1, int var2) {
      if(null != var1) {
         int var4;
         if(-1 != var1.componentSlot * 1300712985) {
            InterfaceDef var3 = var0.aClass245Array2459[var1.parentId * -537841755 & '\uffff'];
            if(var3 != null) {
               if(var3.aClass245Array2662 == var3.aClass245Array2530) {
                  var3.aClass245Array2530 = new InterfaceDef[var3.aClass245Array2662.length];
                  var3.aClass245Array2530[0] = var1;
                  Class691.method8101(var3.aClass245Array2662, 0, var3.aClass245Array2530, 1, var1.componentSlot * 1300712985);
                  Class691.method8101(var3.aClass245Array2662, 1 + 1300712985 * var1.componentSlot, var3.aClass245Array2530, var1.componentSlot * 1300712985 + 1, var3.aClass245Array2662.length - 1300712985 * var1.componentSlot - 1);
               } else {
                  var4 = 0;

                  InterfaceDef[] var5;
                  for(var5 = var3.aClass245Array2530; var4 < var5.length && var1 != var5[var4]; ++var4) {
                     ;
                  }

                  if(var4 >= var5.length) {
                     return;
                  }

                  Class691.method8101(var5, 0, var5, 1, var4);
                  var5[0] = var1;
               }
            }
         } else {
            InterfaceDef[] var6 = var0.method3332((byte)116);

            for(var4 = 0; var4 < var6.length && var6[var4] != var1; ++var4) {
               ;
            }

            if(var4 >= var6.length) {
               return;
            }

            Class691.method8101(var6, 0, var6, 1, var4);
            var6[0] = var1;
         }
      }

   }

   static final void method3981(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class638.method7615(var2, var3, false, -2026573812);
   }

   public static boolean method3982(int var0, String var1, int var2, int var3, int var4) {
      Class16.aClass6_171 = new RSSocket();
      Class16.aClass6_171.id = -1052717481 * var0;
      Class16.aClass6_171.address = var1;
      Class16.aClass6_171.port = var2 * 1408805223;
      Class16.aClass6_171.securePort = 1633433681 * var3;
      return true;
   }

   static void method3983(int var0) {
      Class570.aBool7644 = false;
      Class584.anIntArray7784 = null;
      Class191.anIntArray2168 = null;
      Class570.aLinkedList7648.clear();
      Class570.aLinkedList7649.clear();
      Class554.aClass174_7475.method2273();
   }

   static void method3984(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 2], -696615763)).aStringArray3089[var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1]];
      var0.anInt8623 -= 379191958;
   }

   static final void method3985(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
   }

   static final void method3986(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class317.method4101(var3, var4, var0, 1011798091);
   }
}
