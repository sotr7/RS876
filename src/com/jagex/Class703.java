package com.jagex;

import com.jagex.Class11;
import com.jagex.Class230;
import com.jagex.Class33;
import com.jagex.Class526_Sub31_Sub1;
import com.jagex.Class655;
import com.jagex.Class681;
import com.jagex.Interface76;
import com.jagex.client;

public class Class703 implements Interface76 {
   public static Class703 aClass703_8799 = new Class703(-2);
   public static Class703 aClass703_8790 = new Class703(-3);
   static Class703 aClass703_8791 = new Class703(2);
   public static Class703 aClass703_8792 = new Class703(3);
   static Class703 aClass703_8807 = new Class703(4);
   static Class703 aClass703_8808 = new Class703(5);
   static Class703 aClass703_8795 = new Class703(6);
   static Class703 aClass703_8796 = new Class703(7);
   static Class703 aClass703_8797 = new Class703(8);
   static Class703 aClass703_8798 = new Class703(9);
   static Class703 aClass703_8789 = new Class703(10);
   static Class703 aClass703_8800 = new Class703(20);
   static Class703 aClass703_8794 = new Class703(21);
   static Class703 aClass703_8793 = new Class703(30);
   static Class703 aClass703_8802 = new Class703(31);
   static Class703 aClass703_8804 = new Class703(32);
   static Class703 aClass703_8805 = new Class703(33);
   static Class703 aClass703_8806 = new Class703(34);
   static Class703 aClass703_8803 = new Class703(38);
   int anInt8801;

   public int getId() {
      return 672759965 * this.anInt8801;
   }

   public int method21() {
      return 672759965 * this.anInt8801;
   }

   Class703(int var1) {
      this.anInt8801 = 2042168757 * var1;
   }

   static final void method8213(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub10_10623.method9931(399925588);
   }

   static final void method8214(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(client.aString11017 != null && var2 < Class11.anInt145 * -190820129) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class655.aClass107Array8488[var2].anInt1313 * 1746541627;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   public static int[] method8215(int var0, int var1, int var2, int var3, int var4, float var5, boolean var6, byte var7) {
      int[] var8 = new int[var0];
      Class526_Sub31_Sub1 var9 = new Class526_Sub31_Sub1();
      var9.anInt11784 = 697831907 * var1;
      var9.aBool11770 = var6;
      var9.anInt11778 = -1411939057 * var2;
      var9.anInt11780 = -927165155 * var3;
      var9.anInt11783 = var4 * -1598581745;
      var9.anInt11782 = (int)(4096.0F * var5) * -18052129;
      var9.method10664((short)-8136);
      Class33.method809(var0, 1, 82715900);
      var9.method10663(0, var8, -78075863);
      return var8;
   }
}
