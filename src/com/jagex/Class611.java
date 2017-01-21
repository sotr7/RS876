package com.jagex;

import com.jagex.Class195;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class446;
import com.jagex.Class520;
import com.jagex.Class557;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import com.jagex.Interface76;
import com.jagex.client;

public class Class611 implements Interface76 {
   public static Class520 aClass520_8020;
   static Class611 aClass611_8015 = new Class611(0);
   static Class611 aClass611_8016 = new Class611(1);
   static Class611 aClass611_8013 = new Class611(2);
   static Class611 aClass611_8014 = new Class611(3);
   static Class611 aClass611_8017 = new Class611(4);
   static Class611 aClass611_8018 = new Class611(5);
   int anInt8019;

   Class611(int var1) {
      this.anInt8019 = -598622243 * var1;
   }

   public int getId() {
      return -1113354123 * this.anInt8019;
   }

   public int method21() {
      return -1113354123 * this.anInt8019;
   }

   static final void method7212(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1461126313 * client.aClass492ArrayArray11265[var3][var2].anInt5524;
   }

   static final void method7213(Class681 var0, byte var1) throws Exception_Sub2 {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      Class446 var3 = Class446.method5309((float)var2, (float)var2, (float)var2);
      Class195.aClass292_Sub1_2182.method3899(var3, (byte)-95);
      var3.method5278();
   }

   static final void method7214(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)36);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1681327621 * var3.anInt2524;
   }

   static final void method7215(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)68);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class557.method6710(var3, var4, var0, -326955003);
   }
}
