package com.jagex;

import com.jagex.Class2;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class526;
import com.jagex.Class526_Sub2;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class526_Sub10 extends Class526 {
   public int anInt10409;
   public int anInt10410;
   public int anInt10415;
   public int anInt10414;
   public int anInt10416;
   public int anInt10412;
   public int anInt10413;
   public int anInt10411;
   public int anInt10417;

   Class526_Sub10(RSByteBuffer var1) {
      int var2 = var1.readInt((byte)5);
      this.anInt10409 = (var2 >>> 28) * -1074615613;
      this.anInt10410 = (var2 >>> 14 & 16383) * 2144636585;
      this.anInt10415 = (var2 & 16383) * 2036304977;
      this.anInt10414 = var1.readUnsignedByte(-1209315333) * -1737632147;
      this.anInt10416 = var1.readUnsignedByte(-1685159834) * 967879105;
      this.anInt10412 = var1.readUnsignedByte(-110018403) * 1516258059;
      this.anInt10413 = var1.readUnsignedByte(976813695) * 438918301;
      this.anInt10411 = var1.readUnsignedByte(546066735) * 1615070557;
      this.anInt10417 = var1.readUnsignedByte(-1419881026) * -1860391251;
   }

   static final void method9362(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class681.method8029(var3, var4, var0, 544094909);
   }

   static void method9363(int var0, int var1, int var2, int var3, Class2 var4, boolean var5, int var6) {
      long var7 = (long)(var0 | (var5?Integer.MIN_VALUE:0));
      Class526_Sub2 var9 = (Class526_Sub2)Class526_Sub2.aClass20_10333.get(var7);
      if(var9 == null) {
         var9 = new Class526_Sub2();
         Class526_Sub2.aClass20_10333.put(var9, var7);
      }

      if(var9.anIntArray10331.length <= var1) {
         int[] var10 = new int[1 + var1];
         int[] var11 = new int[1 + var1];
         Class2[] var12 = null;
         if(var9.aClass2Array10332 != null) {
            var12 = new Class2[1 + var1];
         }

         int var13;
         for(var13 = 0; var13 < var9.anIntArray10331.length; ++var13) {
            var10[var13] = var9.anIntArray10331[var13];
            var11[var13] = var9.anIntArray10329[var13];
            if(var9.aClass2Array10332 != null) {
               var12[var13] = var9.aClass2Array10332[var13];
            }
         }

         for(var13 = var9.anIntArray10331.length; var13 < var1; ++var13) {
            var10[var13] = -1;
            var11[var13] = 0;
         }

         var9.anIntArray10331 = var10;
         var9.anIntArray10329 = var11;
         var9.aClass2Array10332 = var12;
      }

      var9.anIntArray10331[var1] = var2;
      var9.anIntArray10329[var1] = var3;
      if(var4 != null) {
         if(var9.aClass2Array10332 == null) {
            var9.aClass2Array10332 = new Class2[var9.anIntArray10331.length];
         }

         var9.aClass2Array10332[var1] = var4;
      } else if(var9.aClass2Array10332 != null) {
         var9.aClass2Array10332[var1] = null;
      }

   }
}
