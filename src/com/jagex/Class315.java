package com.jagex;

import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class306;
import com.jagex.Class681;
import com.jagex.client;
import java.awt.Graphics;

public abstract class Class315 {
   // $FF: synthetic field
   Class306 this$0;
   int anInt3396;
   int anInt3395;

   abstract void method4086(Graphics var1);

   abstract void method4087(Graphics var1, int var2);

   Class315(Class306 var1, int var2, int var3) {
      this.this$0 = var1;
      this.anInt3396 = 475843131 * var2;
      this.anInt3395 = var3 * 1170788171;
   }

   abstract void method4088(Graphics var1);

   static final void method4089(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-45);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1525210059 * var3.anInt2523;
   }

   static final void method4090(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass216_11301.method2969(var2, 1517212089).method3050((byte)0);
   }
}
