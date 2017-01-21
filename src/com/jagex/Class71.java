package com.jagex;

import com.jagex.Class24;
import com.jagex.Class25;
import com.jagex.Class454;
import com.jagex.Class465;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;

public abstract class Class71 {
   static short aShort798;
   public static int anInt800;
   protected int anInt797;
   protected int anInt791;
   protected int anInt790;
   protected int anInt793;
   protected int anInt794;
   protected int anInt795;
   protected boolean aBool796;
   protected boolean aBool799;
   protected int anInt792;

   Class71(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, int var9) {
      this.anInt797 = var1 * -713362709;
      this.anInt791 = var2 * -381031919;
      this.anInt790 = (var3 > '\uffff'?'\uffff':var3) * 1827536355;
      this.anInt793 = var4 * -1603901913;
      this.anInt794 = (var5 > 255?255:var5) * 1276875281;
      this.anInt795 = 2144294231 * var6;
      this.aBool796 = var7;
      this.aBool799 = var8;
      this.anInt792 = var9 * 1391341225;
   }

   public static Object[] method1098(RSByteBuffer var0, Class454[] var1, byte var2) {
      int var3 = var0.readSmart(-1204008848);
      Object[] var4 = new Object[var1.length * var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         for(int var6 = 0; var6 < var1.length; ++var6) {
            int var7 = var1.length * var5 + var6;
            var4[var7] = var1[var6].aClass481_5149.method5757(var0, 1548442393);
         }
      }

      return var4;
   }

   static final void method1099(Class681 var0, int var1) {
      var0.anInt8623 -= -1199503753;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[2 + var0.anInt8623 * -1730576285];
      int var5 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 3];
      int var6 = var0.anIntArray8622[4 + -1730576285 * var0.anInt8623];
      if(var4 == -1) {
         throw new RuntimeException();
      } else {
         Class24 var7 = (Class24)Class465.aClass40_Sub17_5321.method89(var4, -12703503);
         if(var7.aClass454_233.getId() != var3) {
            throw new RuntimeException();
         } else if(var7.aClass454_234.getId() != var2) {
            throw new RuntimeException();
         } else {
            int[] var8 = var7.method702(Integer.valueOf(var5), -1853897003);
            if(var6 >= 0 && null != var8 && var8.length > var6) {
               var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var8[var6];
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   static void method1100(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class25.method718((byte)-1);
   }
}
