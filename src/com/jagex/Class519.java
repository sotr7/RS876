package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class28;
import com.jagex.Class555;
import com.jagex.RSSocket;
import com.jagex.Class613;
import com.jagex.Class681;
import java.util.Stack;

public class Class519 {
   public static RSSocket aClass6_7046;
   public int anInt7044;
   public int[] anIntArray7043;
   public int[] anIntArray7045;

   public Class519(int var1) {
      this.anInt7044 = 38010251 * var1;
      this.anIntArray7043 = new int[-1277967837 * this.anInt7044];
      this.anIntArray7045 = new int[-1277967837 * this.anInt7044];
   }

   public static void method6242(byte var0) {
      Stack var1 = Class555.aStack7478;
      synchronized(var1) {
         Class555.aStack7478 = new Stack();
      }
   }

   static final void method6243(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.aBool2519 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
   }

   public static void method6244(Class613 var0, int var1) {
      Class28.anInt255 = var0.anInt8059 * -321792009;
      Class28.anInt253 = 466740549 * var0.anInt8046;
      Class28.anInt254 = var0.anInt8061 * 225188131;
   }
}
