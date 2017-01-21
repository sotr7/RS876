package com.jagex;

import com.jagex.Class265;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub33;
import com.jagex.Class711;

public class Class711_Sub6 extends Class711 {
   static final int anInt10834 = 0;
   static final int anInt10835 = 4;

   void method8315(int var1, int var2) {
      this.anInt8853 = 1568955811 * var1;
   }

   void method8319(int var1) {
      this.anInt8853 = 1568955811 * var1;
   }

   public int method9894(int var1) {
      return 1174126091 * this.anInt8853;
   }

   int method8320(byte var1) {
      return 0;
   }

   int method8313(int var1, int var2) {
      return 3;
   }

   public int method9895() {
      return 1174126091 * this.anInt8853;
   }

   public Class711_Sub6(int var1, Class526_Sub33 var2) {
      super(var1, var2);
   }

   int method8311() {
      return 0;
   }

   int method8317(int var1) {
      return 3;
   }

   int method8316(int var1) {
      return 3;
   }

   public Class711_Sub6(Class526_Sub33 var1) {
      super(var1);
   }

   public void method9896(int var1) {
      if(1174126091 * this.anInt8853 < 0 || 1174126091 * this.anInt8853 > 4) {
         this.anInt8853 = this.method8320((byte)114) * 1568955811;
      }

   }

   public static void method9897(int var0, int var1, byte var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(20, (long)var1 << 32 | (long)var0);
      var3.method10583((byte)-62);
   }
}
