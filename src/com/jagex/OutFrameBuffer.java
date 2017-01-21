package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class502;
import com.jagex.Class526;
import com.jagex.Buffer;
import com.jagex.Class681;

public class OutFrameBuffer extends Class526 {
   OutFrame aClass405_10554;
   public Buffer out;
   public int anInt10557;
   int anInt10559;
   static int anInt10555 = 0;
   static OutFrameBuffer[] aClass526_Sub28Array10558 = new OutFrameBuffer[300];

   public void method9525(int var1) {
      if(835651317 * anInt10555 < aClass526_Sub28Array10558.length) {
         aClass526_Sub28Array10558[(anInt10555 += -2074413731) * 835651317 - 1] = this;
      }
   }

   static final void method9526(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)50);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class502.method6023(var3, var4, var0, (byte)118);
   }
}
