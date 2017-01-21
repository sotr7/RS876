package com.jagex;

import com.jagex.Class111;
import com.jagex.Class143;
import com.jagex.Class153;
import com.jagex.Class233;
import com.jagex.Class452;
import com.jagex.Class456;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class602;
import com.jagex.Class681;

public class Class143_Sub1 extends Class143 {
   static Class153[] aClass153Array8914;
   public int anInt8915;

   Class143_Sub1(Class452 var1, int var2) {
      super(var1, var2);
   }

   void method1658(RSByteBuffer var1, int var2) {
      Class233 var3 = (Class233)Class561.findIdentifiable(Class456.method5406(-368206291), var2, (byte)-116);
      if(var3 == Class233.aClass233_2378) {
         this.anInt8915 = var1.readUnsignedShort(1328598955) * 1287004073;
      }

   }

   public void method81(int var1) {
   }

   public void method85() {
   }

   void method1663(RSByteBuffer var1, int var2) {
      Class233 var3 = (Class233)Class561.findIdentifiable(Class456.method5406(1638745089), var2, (byte)-50);
      if(var3 == Class233.aClass233_2378) {
         this.anInt8915 = var1.readUnsignedShort(215172161) * 1287004073;
      }

   }

   void method1662(RSByteBuffer var1, int var2) {
      Class233 var3 = (Class233)Class561.findIdentifiable(Class456.method5406(747628103), var2, (byte)-1);
      if(var3 == Class233.aClass233_2378) {
         this.anInt8915 = var1.readUnsignedShort(802653871) * 1287004073;
      }

   }

   void method1659(RSByteBuffer var1, int var2, byte var3) {
      Class233 var4 = (Class233)Class561.findIdentifiable(Class456.method5406(-878153066), var2, (byte)-118);
      if(var4 == Class233.aClass233_2378) {
         this.anInt8915 = var1.readUnsignedShort(352243141) * 1287004073;
      }

   }

   static final void method8367(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      Class526_Sub21_Sub2 var2 = (Class526_Sub21_Sub2)Class111.aClass40_Sub22_1355.method89(var0.anIntArray8622[-1730576285 * var0.anInt8623], -1632475452);
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = -1;

      for(int var5 = 0; var5 < -1116747385 * var2.anInt11335; ++var5) {
         if(var2.anIntArray11336[var5] == var3) {
            var4 = var2.anIntArray11337[var5];
            break;
         }
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
   }

   static final void method8368(Class681 var0, int var1) {
      Class602.method7098((byte)116);
   }
}
