package com.jagex;

import com.jagex.Class265;
import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;

public class Class526_Sub23_Sub11 extends Class526_Sub23 {
   int anInt11667;
   int anInt11668;
   // $FF: synthetic field
   Class342 this$0;

   void method9451(RSByteBuffer var1, int var2) {
      this.anInt11667 = var1.readInt((byte)5) * 824564457;
      this.anInt11668 = var1.readInt((byte)5) * -172216129;
   }

   void method9453(RSByteBuffer var1) {
      this.anInt11667 = var1.readInt((byte)5) * 824564457;
      this.anInt11668 = var1.readInt((byte)5) * -172216129;
   }

   void method9450(Class348 var1, byte var2) {
      var1.method4496(338074969 * this.anInt11667, this.anInt11668 * 76496703, (byte)-127);
   }

   void method9456(RSByteBuffer var1) {
      this.anInt11667 = var1.readInt((byte)5) * 824564457;
      this.anInt11668 = var1.readInt((byte)5) * -172216129;
   }

   void method9454(RSByteBuffer var1) {
      this.anInt11667 = var1.readInt((byte)5) * 824564457;
      this.anInt11668 = var1.readInt((byte)5) * -172216129;
   }

   Class526_Sub23_Sub11(Class342 var1) {
      this.this$0 = var1;
   }

   void method9455(RSByteBuffer var1) {
      this.anInt11667 = var1.readInt((byte)5) * 824564457;
      this.anInt11668 = var1.readInt((byte)5) * -172216129;
   }

   void method9452(RSByteBuffer var1) {
      this.anInt11667 = var1.readInt((byte)5) * 824564457;
      this.anInt11668 = var1.readInt((byte)5) * -172216129;
   }

   void method9457(Class348 var1) {
      var1.method4496(338074969 * this.anInt11667, this.anInt11668 * 76496703, (byte)-111);
   }

   public static void method10581(int var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(22, (long)var0);
      var2.method10583((byte)-50);
   }
}
