package com.jagex;

import com.jagex.Class221;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.RSByteBuffer;
import com.jagex.Class653;
import com.jagex.Class681;
import com.jagex.client;

public abstract class Class199 {
   static int anInt2200;
   public static int anInt2201;
   public int anInt2199;

   boolean method2851() {
      return true;
   }

   public abstract void method2852(byte var1);

   Class199(RSByteBuffer var1) {
      this.anInt2199 = var1.readUnsignedShort(815490741) * 1227258191;
   }

   boolean method2853(byte var1) {
      return true;
   }

   void method2854(byte var1) {
   }

   public abstract void method2855();

   public abstract void method2856();

   public abstract void method2857();

   public abstract void method2858();

   public abstract void method2859();

   boolean method2860() {
      return true;
   }

   public abstract void method2861();

   boolean method2862() {
      return true;
   }

   void method2863() {
   }

   static final void method2864(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)72);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class653.method7795(var3, var4, var0, (byte)0);
   }

   static final void method2865(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -885338537 * client.anInt10989;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 372500803 * client.anInt11260;
   }

   static final void method2866(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class242.aClass94_2456.method1264(var2, (byte)2);
   }
}
