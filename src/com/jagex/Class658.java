package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class169;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class288;
import com.jagex.Class315_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.Class525;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.OutFrameBuffer;
import com.jagex.Class526_Sub38;
import com.jagex.Class681;
import com.jagex.client;

public class Class658 {
   public static Class169 aClass169_8508;
   public int anInt8507;
   public static Class658 aClass658_8505 = new Class658(1);
   public static Class658 aClass658_8493 = new Class658(2);
   public static Class658 aClass658_8494 = new Class658(4);
   public static Class658 aClass658_8495 = new Class658(8);
   public static Class658 aClass658_8496 = new Class658(16);
   public static Class658 aClass658_8497 = new Class658(32);
   public static Class658 aClass658_8498 = new Class658(64);
   public static Class658 aClass658_8503 = new Class658(128);
   static Class658 aClass658_8500 = new Class658(256);
   static Class658 aClass658_8501 = new Class658(512);
   static Class658 aClass658_8502 = new Class658(1024);
   static Class658 aClass658_8499 = new Class658(2048);
   static Class658 aClass658_8492 = new Class658(4096);
   static Class658 aClass658_8504 = new Class658(8192);
   static Class658 aClass658_8506 = new Class658(16384);

   Class658(int var1) {
      this.anInt8507 = -261555359 * var1;
   }

   static final void method7839(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class525.method6281(var2);
      if(null == var3) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 2065808777 * var3.anInt11843;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1798698645 * var3.anInt11840;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt11844 * 505809263;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt11841 * -1426477541;
      }

   }

   static final void method7840(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub38 var3 = (Class526_Sub38)client.aClass20_11187.get((long)var2);
      if(var3 != null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static void method7841(int var0) {
      Class111 var1 = Class452_Sub4.method9295((byte)125);
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4178, var1.aClass14_1342, 1241818155);
      var2.out.writeInt(client.anInt11062 * -1496971711, -357564953);
      var1.write(var2, (byte)5);
   }

   static final void method7842(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)10);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class288.method3813(var3, var4, var0, -1416970677);
   }
}
