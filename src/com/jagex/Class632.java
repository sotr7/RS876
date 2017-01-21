package com.jagex;

import com.jagex.Class11;
import com.jagex.Class221;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class448_Sub1;
import com.jagex.Class467;
import com.jagex.Class526_Sub23_Sub11;
import com.jagex.Class526_Sub31;
import com.jagex.Class548;
import com.jagex.Class646;
import com.jagex.Class681;
import com.jagex.Class711_Sub9;
import com.jagex.Interface74;
import java.util.Queue;

final class Class632 implements Interface74 {
   static int anInt8238;

   public void method495(int var1, int var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = var1 & '\uffff';
      Queue var6 = Class646.aQueue8451;
      synchronized(var6) {
         Class646.aQueue8451.add(Class548.method6560(var4, var5, var2, var3, 1207577227));
      }
   }

   public void method496(boolean var1, int var2) {
   }

   public void method494(int var1, int var2, int var3, int var4) {
      int var5 = var1 >> 16;
      int var6 = var1 & '\uffff';
      Queue var7 = Class646.aQueue8451;
      synchronized(var7) {
         Class646.aQueue8451.add(Class548.method6560(var5, var6, var2, var3, 2003888765));
      }
   }

   public void method497(boolean var1) {
   }

   public void method498(int var1, int var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = var1 & '\uffff';
      Queue var6 = Class646.aQueue8451;
      synchronized(var6) {
         Class646.aQueue8451.add(Class548.method6560(var4, var5, var2, var3, -104655944));
      }
   }

   public void method499(int var1, int var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = var1 & '\uffff';
      Queue var6 = Class646.aQueue8451;
      synchronized(var6) {
         Class646.aQueue8451.add(Class548.method6560(var4, var5, var2, var3, 1455421411));
      }
   }

   public void method500(int var1, int var2, int var3) {
      int var4 = var1 >> 16;
      int var5 = var1 & '\uffff';
      Queue var6 = Class646.aQueue8451;
      synchronized(var6) {
         Class646.aQueue8451.add(Class548.method6560(var4, var5, var2, var3, 604279293));
      }
   }

   static final void method7486(Class681 var0, int var1) {
      var0.anInt8630 -= -2069360090;
      if(var0.aLongArray8626[var0.anInt8630 * -1032509157] < var0.aLongArray8626[1 + var0.anInt8630 * -1032509157]) {
         var0.anInt8644 += -873681181 * var0.anIntArray8642[var0.anInt8644 * -244840757];
      }

   }

   static final void method7487(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)25);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class711_Sub9.method9929(var3, var4, var0, -531832779);
   }

   static final void method7488(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)33);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class467.method5599(var3, var4, var0, (byte)37);
   }

   static final void method7489(InterfaceDef var0, Class243 var1, Class681 var2, short var3) {
      var0.aBool2637 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class526_Sub31.method9555(var0, (byte)10);
      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class526_Sub23_Sub11.method10581(var0.uid * 919258769, -394674076);
      }

   }

   static final void method7490(InterfaceDef var0, int var1, int var2, Class681 var3, int var4) {
      if(var0.anIntArray2588 == null) {
         if(var2 <= 0) {
            return;
         }

         var0.aByteArrayArray2584 = new byte[11][];
         var0.aByteArrayArray2585 = new byte[11][];
         var0.anIntArray2609 = new int[11];
         var0.anIntArray2587 = new int[11];
         var0.anIntArray2588 = new int[11];
      }

      var0.anIntArray2588[var1] = var2;
      if(var2 > 0) {
         var0.aBool2583 = true;
      } else {
         var0.aBool2583 = false;

         for(int var5 = 0; var5 < var0.aByteArrayArray2584.length; ++var5) {
            if(null != var0.aByteArrayArray2584[var5] || var0.anIntArray2588[var5] > 0) {
               var0.aBool2583 = true;
               break;
            }
         }
      }

   }

   static final void method7491(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class242.aClass94_2456.method1263(var2, -781795761);
   }

   static final void method7492(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class11 var4 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -1300070338);
      if(var3 >= 1 && var3 <= 5 && null != var4.aStringArray143[var3 - 1]) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var4.aStringArray143[var3 - 1];
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
