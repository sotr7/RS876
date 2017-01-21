package com.jagex;

import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.RSByteBuffer;
import com.jagex.Class539;
import com.jagex.Interface26;

public class Class251 implements Interface26 {
   // $FF: synthetic field
   Class232 this$0;
   int anInt2775;
   int anInt2774;

   public void method166(Class223 var1) {
      var1.method3140(-1446084095 * this.anInt2775, -529666107 * this.anInt2774, (byte)16);
      var1.method3122(this.anInt2775 * -1446084095, (byte)30).method3002((byte)37);
   }

   public void method168(Class223 var1, byte var2) {
      var1.method3140(-1446084095 * this.anInt2775, -529666107 * this.anInt2774, (byte)4);
      var1.method3122(this.anInt2775 * -1446084095, (byte)35).method3002((byte)9);
   }

   public void method169(Class223 var1) {
      var1.method3140(-1446084095 * this.anInt2775, -529666107 * this.anInt2774, (byte)-75);
      var1.method3122(this.anInt2775 * -1446084095, (byte)59).method3002((byte)35);
   }

   public void method165(Class223 var1) {
      var1.method3140(-1446084095 * this.anInt2775, -529666107 * this.anInt2774, (byte)22);
      var1.method3122(this.anInt2775 * -1446084095, (byte)105).method3002((byte)98);
   }

   Class251(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2775 = var2.readUnsignedShort(319409437) * -936018431;
      this.anInt2774 = var2.readUnsignedByte(671480232) * -951994611;
   }

   public void method167(Class223 var1) {
      var1.method3140(-1446084095 * this.anInt2775, -529666107 * this.anInt2774, (byte)-1);
      var1.method3122(this.anInt2775 * -1446084095, (byte)36).method3002((byte)93);
   }

   public static void method3466(Class539 var0, Class539 var1, int var2) {
      if(var0.aClass539_7226 != null) {
         var0.method6448(-1993575955);
      }

      var0.aClass539_7226 = var1;
      var0.aClass539_7227 = var1.aClass539_7227;
      var0.aClass539_7226.aClass539_7227 = var0;
      var0.aClass539_7227.aClass539_7226 = var0;
   }

   public static boolean method3467(char var0, int var1) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }
}
