package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class162;
import com.jagex.Class237;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.client;

public class Class621 {
   public static final int anInt8131 = 6;

   Class621() throws Throwable {
      throw new Error();
   }

   static final void method7350(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class162.method1887(var3, var4, var0, (byte)112);
   }

   static final void method7351(Class681 var0, short var1) {
      client.aBool11035 = true;
      Class237.method3286(-358048469);
   }

   static final void method7352(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2526 * -387736425;
   }

   static final void method7353(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class111 var3 = Class452_Sub4.method9295((byte)21);
      OutFrameBuffer var4 = Class115.method1414(OutFrame.CHAT_TYPE, var3.aClass14_1342, -107377282);
      var4.out.writeByte(var2, 1859505317);
      var3.write(var4, (byte)-105);
   }
}
