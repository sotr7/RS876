package com.jagex;

import com.jagex.Class255;
import com.jagex.Class304;
import com.jagex.Class391;
import com.jagex.Class526_Sub25;
import com.jagex.Class619;
import com.jagex.Class681;
import com.jagex.Interface23;

public class Class130 implements Interface23 {
   static int anInt1618;
   int anInt1616;
   int anInt1615;
   float[] aFloatArray1617;

   public void method141() {
   }

   Class130(int var1, int var2) {
      this.anInt1616 = -449720211 * var1;
      this.anInt1615 = 436218487 * var2;
      this.aFloatArray1617 = new float[this.anInt1615 * 1054003015 * this.anInt1616 * -1302152859];
   }

   public int method94() {
      return 1054003015 * this.anInt1615;
   }

   public void method140() {
   }

   public int method21() {
      return -1302152859 * this.anInt1616;
   }

   public int method90() {
      return -1302152859 * this.anInt1616;
   }

   public int method95() {
      return 1054003015 * this.anInt1615;
   }

   public int method92() {
      return 1054003015 * this.anInt1615;
   }

   public int method8() {
      return 1054003015 * this.anInt1615;
   }

   public int method9() {
      return 1054003015 * this.anInt1615;
   }

   public int method1() {
      return -1302152859 * this.anInt1616;
   }

   static int method1626(int var0, int var1) {
      Class526_Sub25 var2 = (Class526_Sub25)Class619.aClass20_8111.get((long)var0);
      if(var2 == null) {
         Class391 var3 = Class304.anInterface46_3280.method350(var0, 932585041);
         if(var3 == null || 2 != -1760706667 * var3.anInt4078) {
            return -1;
         }

         var2 = new Class526_Sub25(930733103 * Class619.anInt8113);
         Class619.aClass20_8111.put(var2, (long)var0);
         Class619.aClass391Array8118[(Class619.anInt8113 += -1056118065) * 930733103 - 1] = var3;
      }

      return -1044108751 * var2.anInt10550;
   }

   static final void method1627(Class681 var0, int var1) {
      long var2 = Class255.time((byte)24);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)(var2 / 60000L);
   }
}
