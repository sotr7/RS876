package com.jagex;

import com.jagex.Class187;
import com.jagex.Class238;
import com.jagex.Class240;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class466;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub9;
import com.jagex.Class681;
import com.jagex.Interface12;
import com.jagex.Interface14;

public class Class240_Sub1 extends Class240 {
   public Interface12 method61(int var1, Interface14 var2) {
      return new Class238(var1, var2, this);
   }

   public Interface12 method64(int var1, Interface14 var2, int var3) {
      return new Class238(var1, var2, this);
   }

   public Class method59(int var1) {
      return Class238.class;
   }

   Class240_Sub1(Class466 var1, int var2) {
      super(var1, var2);
   }

   public Class method62() {
      return Class238.class;
   }

   public Class method63() {
      return Class238.class;
   }

   public Class method60() {
      return Class238.class;
   }

   static final void method9127(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var2.anInt8623 -= 758383916;
      var0.anInt2475 = 1808783259 * var2.anIntArray8622[-1730576285 * var2.anInt8623];
      var0.anInt2558 = var2.anIntArray8622[1 + var2.anInt8623 * -1730576285] * -660226999;
      var0.anInt2551 = 0;
      var0.anInt2552 = 0;
      int var4 = var2.anIntArray8622[-1730576285 * var2.anInt8623 + 2];
      if(var4 < 0) {
         var4 = 0;
      } else if(var4 > 4) {
         var4 = 4;
      }

      int var5 = var2.anIntArray8622[3 + -1730576285 * var2.anInt8623];
      if(var5 < 0) {
         var5 = 0;
      } else if(var5 > 4) {
         var5 = 4;
      }

      var0.aByte2502 = (byte)var4;
      var0.aByte2503 = (byte)var5;
      Class526_Sub31.method9555(var0, (byte)10);
      Class187.method2730(var1, var0, (byte)67);
      if(0 == var0.type * -449120703) {
         Class526_Sub9.method9361(var1, var0, false, (byte)69);
      }

   }
}
