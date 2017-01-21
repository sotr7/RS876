package com.jagex;

import com.jagex.Class10;
import com.jagex.Class157;
import com.jagex.Class174;
import com.jagex.Class218;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class261;
import com.jagex.Class31;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.RSByteBuffer;
import com.jagex.Class622;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.Interface26;

public class Class228 implements Interface26 {
   static Class526_Sub21_Sub6 aClass526_Sub21_Sub6_2330;
   // $FF: synthetic field
   Class232 this$0;
   int anInt2328;
   Class218 aClass218_2329;

   public void method165(Class223 var1) {
      var1.method3146(2107323683 * this.anInt2328, this.aClass218_2329, (byte)-16);
   }

   public void method168(Class223 var1, byte var2) {
      var1.method3146(2107323683 * this.anInt2328, this.aClass218_2329, (byte)-70);
   }

   public void method166(Class223 var1) {
      var1.method3146(2107323683 * this.anInt2328, this.aClass218_2329, (byte)-93);
   }

   public void method167(Class223 var1) {
      var1.method3146(2107323683 * this.anInt2328, this.aClass218_2329, (byte)39);
   }

   Class228(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2328 = var2.readUnsignedShort(2057479470) * 1763615371;
      this.aClass218_2329 = new Class218(var2, false, false, var1.anInterface28_2365);
   }

   public void method169(Class223 var1) {
      var1.method3146(2107323683 * this.anInt2328, this.aClass218_2329, (byte)66);
   }

   static final void method3173(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      if(var3 == -1) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class622.aClass455_8143.method5398(var2, (byte)11).method10723((char)var3, -89159452);
      }

   }

   static final void method3174(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= 379191958;
      int var4 = var2.anIntArray8622[var2.anInt8623 * -1730576285];
      int var5 = var2.anIntArray8622[-1730576285 * var2.anInt8623 + 1];
      Class83 var6 = (Class83)Class10.aClass40_Sub20_62.method89(var4, -1343247980);
      if(var6.anInt843 * 1040538721 != var5) {
         var0.method3354(var4, var5, 2019513325);
      } else {
         var0.method3356(var4, -1462481460);
      }

   }

   static void method3175(Class174 var0, int var1) {
      if(!Class31.aBool302) {
         Class157.method1866(var0, 1491934916);
      } else {
         Class261.method3535(var0, -732219537);
      }

   }
}
