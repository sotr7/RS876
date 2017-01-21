package com.jagex;

import com.jagex.Class143;
import com.jagex.Class189;
import com.jagex.Class242;
import com.jagex.Class26;
import com.jagex.Class317;
import com.jagex.Class45;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub25;
import com.jagex.Class592;
import com.jagex.Class64;
import com.jagex.Class681;
import com.jagex.Interface19;

final class Class191 implements Interface19 {
   static int[] anIntArray2168;

   public int method116(Class317 var1, byte var2) {
      Class526_Sub25 var3 = (Class526_Sub25)Class189.aClass20_2152.get(4294967296L | (long)(-258504047 * var1.anInt3404));
      return var3 == null?Class242.aClass94_2456.method116(var1, (byte)-22):var3.anInt10550 * -1044108751;
   }

   public int method118(Class317 var1) {
      Class526_Sub25 var2 = (Class526_Sub25)Class189.aClass20_2152.get(4294967296L | (long)(-258504047 * var1.anInt3404));
      return var2 == null?Class242.aClass94_2456.method116(var1, (byte)-29):var2.anInt10550 * -1044108751;
   }

   public int method114(Class143 var1, int var2) {
      Class526_Sub25 var3 = (Class526_Sub25)Class189.aClass20_2152.get((long)(var1.anInt1674 * 697078941));
      return null == var3?Class242.aClass94_2456.method114(var1, 1874542929):var3.anInt10550 * -1044108751;
   }

   public int method117(Class317 var1) {
      Class526_Sub25 var2 = (Class526_Sub25)Class189.aClass20_2152.get(4294967296L | (long)(-258504047 * var1.anInt3404));
      return var2 == null?Class242.aClass94_2456.method116(var1, (byte)-35):var2.anInt10550 * -1044108751;
   }

   public int method120(Class317 var1) {
      Class526_Sub25 var2 = (Class526_Sub25)Class189.aClass20_2152.get(4294967296L | (long)(-258504047 * var1.anInt3404));
      return var2 == null?Class242.aClass94_2456.method116(var1, (byte)-9):var2.anInt10550 * -1044108751;
   }

   public int method119(Class317 var1) {
      Class526_Sub25 var2 = (Class526_Sub25)Class189.aClass20_2152.get(4294967296L | (long)(-258504047 * var1.anInt3404));
      return var2 == null?Class242.aClass94_2456.method116(var1, (byte)2):var2.anInt10550 * -1044108751;
   }

   public int method122(Class143 var1) {
      Class526_Sub25 var2 = (Class526_Sub25)Class189.aClass20_2152.get((long)(var1.anInt1674 * 697078941));
      return null == var2?Class242.aClass94_2456.method114(var1, -717573417):var2.anInt10550 * -1044108751;
   }

   static final void method2760(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
   }

   public static int method2761(int var0) {
      return (double)Class525_Sub1.aFloat7144 == 2.0D?25:(3.0D == (double)Class525_Sub1.aFloat7144?37:((double)Class525_Sub1.aFloat7144 == 4.0D?50:(6.0D == (double)Class525_Sub1.aFloat7144?75:(8.0D == (double)Class525_Sub1.aFloat7144?100:200))));
   }

   static final String method2762(int var0, int var1) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + Class64.aString738 + var2.substring(var3);
      }

      return var2.length() > 9?" " + Class592.method7026('\uff80', 2116387795) + var2.substring(0, var2.length() - 8) + Class45.aClass45_603.method920(Class26.aClass673_247, -827840379) + " (" + var2 + ")" + Class64.aString743:(var2.length() > 6?" " + Class592.method7026(16777215, 1410417465) + var2.substring(0, var2.length() - 4) + Class45.aClass45_605.method920(Class26.aClass673_247, -827840379) + " (" + var2 + ")" + Class64.aString743:" " + Class592.method7026(16776960, -1990375681) + var2 + Class64.aString743);
   }
}
