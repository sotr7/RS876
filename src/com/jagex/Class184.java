package com.jagex;

import com.jagex.Class153;
import com.jagex.Class213;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class315_Sub1;
import com.jagex.Class526_Sub21;
import com.jagex.Class602;
import com.jagex.Class673;
import com.jagex.Class679;
import com.jagex.Class681;

public abstract class Class184 {
   public static int[] anIntArray2116;
   public static Class153 aClass153_2117;

   public abstract int method2691();

   abstract boolean method2692();

   public abstract int method2693();

   public abstract void method140();

   abstract boolean method2694();

   public abstract int method2695();

   abstract boolean method2696();

   public abstract int method2697();

   public abstract int method2698();

   public abstract int method2699();

   public abstract int method2700();

   public abstract int method2701();

   public abstract int method2702();

   abstract boolean method364();

   public abstract int method2703();

   abstract boolean method2704();

   abstract boolean method2705();

   abstract boolean method2706();

   abstract boolean method363();

   public abstract void method208();

   static final void method2707(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      boolean var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285] == 1;
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class526_Sub21.method9445(var2, var3, 2131360541);
   }

   static final void method2708(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
   }

   public static String method2709(long var0, int var2, boolean var3, Class673 var4, int var5) {
      char var6 = 44;
      char var7 = 46;
      if(Class673.aClass673_8579 == var4) {
         var6 = 46;
         var7 = 44;
      }

      if(Class673.aClass673_8570 == var4) {
         var7 = 160;
      }

      boolean var8 = false;
      if(var0 < 0L) {
         var8 = true;
         var0 = -var0;
      }

      StringBuilder var9 = new StringBuilder(26);
      int var10;
      int var11;
      if(var2 > 0) {
         for(var10 = 0; var10 < var2; ++var10) {
            var11 = (int)var0;
            var0 /= 10L;
            var9.append((char)(48 + var11 - 10 * (int)var0));
         }

         var9.append(var6);
      }

      var10 = 0;

      while(true) {
         var11 = (int)var0;
         var0 /= 10L;
         var9.append((char)(48 + var11 - 10 * (int)var0));
         if(var0 == 0L) {
            if(var8) {
               var9.append('\u002d');
            }

            return var9.reverse().toString();
         }

         if(var3) {
            ++var10;
            if(0 == var10 % 3) {
               var9.append(var7);
            }
         }
      }
   }

   static final void method2710(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      boolean var5 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class602.method7096(var3, var4, var0, var5?Class258.aClass258_2822:Class258.aClass258_2826, 1340751157);
   }

   static final void method2711(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)72);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class213.method2952(var3, var4, var0, 1094910384);
   }
}
