package com.jagex;

import com.jagex.Class157;
import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class292;
import com.jagex.Class309;
import com.jagex.Class446;
import com.jagex.Class470;
import com.jagex.Class488;
import com.jagex.Class525;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;

public abstract class Class329 {
   Class292 aClass292_3492;

   Class329(Class292 var1) {
      this.aClass292_3492 = var1;
   }

   public abstract void method4202(float var1, int[][][] var2, Class470 var3, int var4, int var5, int var6);

   public abstract float method4203();

   public abstract Class446 method4204(int var1);

   public abstract double[] method4205(byte var1);

   public abstract void method4206(float var1, int[][][] var2, Class470 var3, int var4, int var5);

   public abstract float method4207(byte var1);

   public abstract float method4208();

   public abstract void method4209(RSByteBuffer var1, int var2);

   public abstract void method4210(float var1, int[][][] var2, Class470 var3, int var4, int var5);

   public abstract Class526_Sub32 method4211(int var1);

   public abstract void method4212(float var1, int[][][] var2, Class470 var3, int var4, int var5);

   public abstract boolean method4213();

   public abstract Class446 method4214();

   public abstract Class446 method4215();

   public abstract Class526_Sub32 method4216();

   public abstract double[] method4217();

   public abstract double[] method4218();

   public abstract double[] method4219();

   public abstract float method4220();

   public abstract double[] method4221();

   public abstract boolean method4222(int var1);

   public abstract double[] method4223();

   public abstract float method4224();

   public abstract void method4225(Class309 var1, int var2, int var3, int var4);

   public abstract float method4226();

   public abstract void method4227(Class309 var1, int var2, int var3);

   public abstract void method4228(RSByteBuffer var1);

   static final void method4229(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-62);
      Class488.method5862(var3, var0, -1684397753);
   }

   static final void method4230(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class525.method6281(var2);
      if(var3 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt11844 * 505809263 - var3.anInt11843 * 2065808777;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1426477541 * var3.anInt11841 - -1798698645 * var3.anInt11840;
      }

   }

   static final void method4231(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      Class157.method1863((String)var0.anObjectArray8624[var0.anInt8625 * 540934629], (String)var0.anObjectArray8624[var0.anInt8625 * 540934629 + 1], "", var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1, false, (byte)46);
   }

   static final void method4232(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
   }
}
