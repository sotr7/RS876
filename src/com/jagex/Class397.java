package com.jagex;

import com.jagex.Class230;
import com.jagex.Class235;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class253;
import com.jagex.Class331;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.Class526_Sub31;
import com.jagex.Class567;
import com.jagex.Class681;
import com.jagex.Interface45;

public class Class397 implements Interface45 {
   public static byte aByte4127;
   public int anInt4125;
   public Class384 aClass384_4124;
   public Class389 aClass389_4119;
   public int anInt4118;
   public int anInt4117;
   public int anInt4123;
   public int anInt4116;
   public int anInt4120;
   public int anInt4121;
   public int anInt4122;
   public boolean aBool4126;

   Class397(int var1, Class384 var2, Class389 var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      this.anInt4125 = var1 * -774765583;
      this.aClass384_4124 = var2;
      this.aClass389_4119 = var3;
      this.anInt4118 = var4 * 791361987;
      this.anInt4117 = var5 * 1413405969;
      this.anInt4123 = 1156657671 * var6;
      this.anInt4116 = var7 * -1163912645;
      this.anInt4120 = -84286623 * var8;
      this.anInt4121 = var9 * -3204639;
      this.anInt4122 = var10 * 62798025;
      this.aBool4126 = var11;
   }

   public Class394 method345() {
      return Class394.aClass394_4102;
   }

   public Class394 method346(int var1) {
      return Class394.aClass394_4102;
   }

   static boolean method4823(int var0) {
      return Class235.method3280(Class253.aClass627_2794.aClass582_8191, 177427800);
   }

   public static int method4824(byte var0) {
      return Class331.aClass613_3498.aBool8055?2:1;
   }

   static final void method4825(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var0.anInt2550 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * -1016726723;
      Class526_Sub31.method9555(var0, (byte)10);
      if(var0.componentSlot * 1300712985 == -1 && !var1.aBool2458) {
         Class567.method6821(var0.uid * 919258769, (byte)115);
      }

   }

   static final void method4826(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub15_10610.method8313(var2, -1265340925);
   }
}
