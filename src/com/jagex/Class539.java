package com.jagex;

import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class594;
import com.jagex.Class681;

public class Class539 {
   public Class539 aClass539_7227;
   public Class539 aClass539_7226;

   public void method6448(int var1) {
      if(this.aClass539_7226 != null) {
         this.aClass539_7226.aClass539_7227 = this.aClass539_7227;
         this.aClass539_7227.aClass539_7226 = this.aClass539_7226;
         this.aClass539_7227 = null;
         this.aClass539_7226 = null;
      }
   }

   public void method6449() {
      if(this.aClass539_7226 != null) {
         this.aClass539_7226.aClass539_7227 = this.aClass539_7227;
         this.aClass539_7227.aClass539_7226 = this.aClass539_7226;
         this.aClass539_7227 = null;
         this.aClass539_7226 = null;
      }
   }

   static final void method6450(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class594.method7040(var2, -1977580421);
   }

   static final void method6451(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)109);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2573 * -1244891523;
   }
}
