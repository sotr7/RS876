package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class285;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class681;
import com.jagex.Class76;
import com.jagex.Interface76;

public class Class233 implements Interface76 {
   static Class233 aClass233_2377 = new Class233(12, 100);
   static Class233 aClass233_2369 = new Class233(17, 101);
   static Class233 aClass233_2368 = new Class233(11, 102);
   static Class233 aClass233_2371 = new Class233(0, 103);
   static Class233 aClass233_2372 = new Class233(1, 104);
   static Class233 aClass233_2386 = new Class233(8, 105);
   static Class233 aClass233_2374 = new Class233(10, 106);
   static Class233 aClass233_2375 = new Class233(16, 107);
   static Class233 aClass233_2376 = new Class233(2, 108);
   static Class233 aClass233_2387 = new Class233(4, 109);
   static Class233 aClass233_2378 = new Class233(14, 110);
   static Class233 aClass233_2384 = new Class233(5, 111);
   static Class233 aClass233_2380 = new Class233(13, 112);
   static Class233 aClass233_2381 = new Class233(7, 113);
   static Class233 aClass233_2382 = new Class233(3, 114);
   static Class233 aClass233_2383 = new Class233(15, 115);
   static Class233 aClass233_2379 = new Class233(6, 116);
   static Class233 aClass233_2385 = new Class233(9, 117);
   int anInt2370;
   int anInt2373;

   public int getId() {
      return this.anInt2373 * -242141043;
   }

   public int method21() {
      return this.anInt2373 * -242141043;
   }

   Class233(int var1, int var2) {
      this.anInt2370 = -2106140129 * var1;
      this.anInt2373 = -833664443 * var2;
   }

   static void method3269(Class681 var0, byte var1) {
      var0.anIntArray8622[var0.anInt8623 * -1730576285 - 1] = ((Class285)Class76.aClass59_Sub1_813.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623 - 1], -373165917)).aBool3074?1:0;
   }

   static final void method3270(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class111 var3 = Class452_Sub4.method9295((byte)102);
      OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4234, var3.aClass14_1342, -1004160593);
      var4.out.writeByte(0, 1552362868);
      int var5 = 301018015 * var4.out.pos;
      var4.out.writeByte(var2, -170370254);
      var4.out.writeShort(-1382935785 * var0.aClass392_8632.anInt4092, -805078716);
      var0.aClass392_8632.aClass526_Sub21_Sub12_4093.method10673(var4.out, var0.aClass392_8632.anIntArray4091, 1563362001);
      var4.out.method9678(var4.out.pos * 301018015 - var5, (byte)-31);
      var3.write(var4, (byte)6);
   }
}
