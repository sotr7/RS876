package com.jagex;

import com.jagex.Class199;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class304_Sub1;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class495;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class645;
import com.jagex.Class681;
import java.awt.event.ActionEvent;

public class Class199_Sub9 extends Class199 {
   static int[] anIntArray9918;
   int anInt9917;

   public void method2859() {
      Class645.aClass207Array8445[-1110109413 * this.anInt9917].method2911(-2063328259);
   }

   Class199_Sub9(RSByteBuffer var1) {
      super(var1);
      this.anInt9917 = var1.readUnsignedShort(1289757033) * 390270739;
   }

   public void method2861() {
      Class645.aClass207Array8445[-1110109413 * this.anInt9917].method2911(-2127390667);
   }

   public void method2855() {
      Class645.aClass207Array8445[-1110109413 * this.anInt9917].method2911(-2112634632);
   }

   public void method2856() {
      Class645.aClass207Array8445[-1110109413 * this.anInt9917].method2911(-2021170962);
   }

   public void method2852(byte var1) {
      Class645.aClass207Array8445[-1110109413 * this.anInt9917].method2911(-2038645879);
   }

   public void method2858() {
      Class645.aClass207Array8445[-1110109413 * this.anInt9917].method2911(-2025443778);
   }

   public void method2857() {
      Class645.aClass207Array8445[-1110109413 * this.anInt9917].method2911(-1980180810);
   }

   static final void method9007(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      Class570.aClass231_7657.method3193(var2, (byte)126);
   }

   static void method9008(Object var0, byte var1) {
      if(null != Class495.anEventQueue5540) {
         for(int var2 = 0; var2 < 50 && Class495.anEventQueue5540.peekEvent() != null; ++var2) {
            Class304_Sub1.method9089(1L);
         }

         try {
            if(var0 != null) {
               Class495.anEventQueue5540.postEvent(new ActionEvent(var0, 1001, "dummy"));
            }
         } catch (Exception var3) {
            ;
         }

      }
   }

   static final void method9009(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-60);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class317.method4101(var3, var4, var0, -1986638199);
   }
}
