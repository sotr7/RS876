package com.jagex;

import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;

public class Class526_Sub23_Sub6 extends Class526_Sub23 {
   int anInt11635;
   String aString11634;
   // $FF: synthetic field
   Class342 this$0;

   void method9453(RSByteBuffer var1) {
      this.anInt11635 = var1.readInt((byte)5) * 569440121;
      this.aString11634 = var1.readString(1787511878);
   }

   void method9451(RSByteBuffer var1, int var2) {
      this.anInt11635 = var1.readInt((byte)5) * 569440121;
      this.aString11634 = var1.readString(-1794931298);
   }

   Class526_Sub23_Sub6(Class342 var1) {
      this.this$0 = var1;
   }

   void method9450(Class348 var1, byte var2) {
      var1.method4500(-345718071 * this.anInt11635, this.aString11634, -1951969038);
   }

   void method9457(Class348 var1) {
      var1.method4500(-345718071 * this.anInt11635, this.aString11634, -1951969038);
   }

   void method9455(RSByteBuffer var1) {
      this.anInt11635 = var1.readInt((byte)5) * 569440121;
      this.aString11634 = var1.readString(-1481912232);
   }

   void method9452(RSByteBuffer var1) {
      this.anInt11635 = var1.readInt((byte)5) * 569440121;
      this.aString11634 = var1.readString(-158987789);
   }

   void method9456(RSByteBuffer var1) {
      this.anInt11635 = var1.readInt((byte)5) * 569440121;
      this.aString11634 = var1.readString(-1668377194);
   }

   void method9454(RSByteBuffer var1) {
      this.anInt11635 = var1.readInt((byte)5) * 569440121;
      this.aString11634 = var1.readString(148883801);
   }
}
