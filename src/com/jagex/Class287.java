package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class318_Sub2;
import com.jagex.Class339;
import com.jagex.Class37_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.Class460_Sub1;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub9;
import com.jagex.Class594;
import com.jagex.Class673;
import com.jagex.Class681;
import com.jagex.Class709;

public class Class287 {
   public static int anInt3106;
   int anInt3104;
   boolean aBool3101;
   static Class287 aClass287_3105 = new Class287(0, true);
   static Class287 aClass287_3102 = new Class287(1, true);
   static Class287 aClass287_3103 = new Class287(2, false);

   Class287(int var1, boolean var2) {
      this.anInt3104 = var1 * -1830491847;
      this.aBool3101 = var2;
   }

   public static void method3804(Class37_Sub1 var0, int var1) {
      Class709.method8305(var0, 1603414173);
   }

   static final void method3805(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      if(var0.anIntArray8622[var0.anInt8623 * -1730576285] >= var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1]) {
         var0.anInt8644 += var0.anIntArray8642[var0.anInt8644 * -244840757] * -873681181;
      }

   }

   static final void method3806(Class681 var0, int var1) {
      Class460_Sub1.logout(false, -1730576285);
   }

   static final void method3807(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   public static final void method3808(boolean var0, int var1, int var2) {
      Class526_Sub9 var3 = var0?Class318_Sub2.aClass526_Sub9_10065:Class673.aClass526_Sub9_8581;
      if(null != var3 && var1 >= 0 && var1 < var3.anInt10400 * 1763792899) {
         Class339 var4 = var3.aClass339Array10402[var1];
         if(var4.aByte3526 == -1) {
            String var5 = var4.aString3528;
            Class111 var6 = Class452_Sub4.method9295((byte)84);
            OutFrameBuffer var7 = Class115.method1414(OutFrame.aClass405_4229, var6.aClass14_1342, 1349363382);
            var7.out.writeByte(3 + Class594.method7039(var5, -381894287), -1150489529);
            var7.out.writeByte(var0?1:0, 1944355328);
            var7.out.writeShort(var1, -805078716);
            var7.out.method9616(var5, -118320344);
            var6.write(var7, (byte)13);
         }
      }
   }
}
