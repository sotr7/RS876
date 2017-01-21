package com.jagex;

import com.jagex.Class141;
import com.jagex.Class304;
import com.jagex.Class391;
import com.jagex.Class526;
import com.jagex.Class614;
import com.jagex.Class638;
import com.jagex.Class681;

public class Class526_Sub30 extends Class526 {
   static float[] aFloatArray10575 = new float[3];
   int anInt10570;
   int anInt10571;
   int anInt10572;
   float aFloat10573;
   float aFloat10574;
   Class141 aClass141_10568;
   Class391 aClass391_10569;

   void method9550(int var1) {
      this.anInt10570 = this.aClass141_10568.anInt1668 * -1609999465;
      this.anInt10571 = this.aClass141_10568.anInt1670 * -907884397;
      this.anInt10572 = this.aClass141_10568.anInt1669 * -1704718655;
      if(null != this.aClass141_10568.aClass433_1665) {
         this.aClass141_10568.aClass433_1665.method5091((float)(this.aClass391_10569.anInt4080 * -2017397953), (float)(this.aClass391_10569.anInt4081 * 2127383065), (float)(this.aClass391_10569.anInt4083 * -1493442421), aFloatArray10575);
      }

      this.aFloat10573 = aFloatArray10575[0];
      this.aFloat10574 = aFloatArray10575[2];
   }

   Class526_Sub30(Class141 var1, Class614 var2) {
      this.aClass141_10568 = var1;
      this.aClass391_10569 = this.aClass141_10568.method1652(Class304.anInterface46_3280, (byte)91);
      this.method9550(-1951758929);
   }

   void method9551() {
      this.anInt10570 = this.aClass141_10568.anInt1668 * -1609999465;
      this.anInt10571 = this.aClass141_10568.anInt1670 * -907884397;
      this.anInt10572 = this.aClass141_10568.anInt1669 * -1704718655;
      if(null != this.aClass141_10568.aClass433_1665) {
         this.aClass141_10568.aClass433_1665.method5091((float)(this.aClass391_10569.anInt4080 * -2017397953), (float)(this.aClass391_10569.anInt4081 * 2127383065), (float)(this.aClass391_10569.anInt4083 * -1493442421), aFloatArray10575);
      }

      this.aFloat10573 = aFloatArray10575[0];
      this.aFloat10574 = aFloatArray10575[2];
   }

   static final void method9552(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class638.method7615(var2, var3, true, -2129772465);
   }
}
