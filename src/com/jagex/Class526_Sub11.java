package com.jagex;

import com.jagex.Class107;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class526_Sub11 extends Class526 {
   public static final int anInt10418 = 5;
   public static final int anInt10419 = 1;
   public static final int anInt10420 = 2;
   public static final int anInt10421 = 3;
   public static final int anInt10424 = 9;
   public static final int anInt10425 = 8;
   public static final int anInt10427 = 10;
   static final int anInt10430 = 6;
   public static final int anInt10432 = 0;
   public static final int anInt10433 = 7;
   int anInt10428;
   int anInt10429;
   int[] anIntArray10426;
   int[][] anIntArrayArray10431;
   boolean[] aBoolArray10423;
   int[] anIntArray10422;

   Class526_Sub11(int var1, byte[] var2) {
      this.anInt10428 = 42030557 * var1;
      RSByteBuffer var3 = new RSByteBuffer(var2);
      this.anInt10429 = var3.readUnsignedShort(1727110436) * 1195452111;
      this.anIntArray10426 = new int[1657806895 * this.anInt10429];
      this.anIntArrayArray10431 = new int[1657806895 * this.anInt10429][];
      this.aBoolArray10423 = new boolean[this.anInt10429 * 1657806895];
      this.anIntArray10422 = new int[this.anInt10429 * 1657806895];

      int var4;
      for(var4 = 0; var4 < this.anInt10429 * 1657806895; ++var4) {
         this.anIntArray10426[var4] = var3.readUnsignedByte(-1977204437);
         if(this.anIntArray10426[var4] == 6) {
            this.anIntArray10426[var4] = 2;
         }
      }

      for(var4 = 0; var4 < this.anInt10429 * 1657806895; ++var4) {
         this.aBoolArray10423[var4] = var3.readUnsignedByte(1619933621) == 1;
      }

      for(var4 = 0; var4 < 1657806895 * this.anInt10429; ++var4) {
         this.anIntArray10422[var4] = var3.readUnsignedShort(252053367);
      }

      for(var4 = 0; var4 < 1657806895 * this.anInt10429; ++var4) {
         this.anIntArrayArray10431[var4] = new int[var3.readSmart(-1501303981)];
      }

      for(var4 = 0; var4 < this.anInt10429 * 1657806895; ++var4) {
         for(int var5 = 0; var5 < this.anIntArrayArray10431[var4].length; ++var5) {
            this.anIntArrayArray10431[var4][var5] = var3.readSmart(-1276831413);
         }
      }

   }

   static final void method9364(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      InterfaceDef var5 = Class107.method1347(var4, var3, -1244032751);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = null == var5?-1:919258769 * var5.uid;
   }
}
