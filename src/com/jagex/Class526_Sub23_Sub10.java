package com.jagex;

import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;

public class Class526_Sub23_Sub10 extends Class526_Sub23 {
   // $FF: synthetic field
   Class342 this$0;
   String aString11666;

   Class526_Sub23_Sub10(Class342 var1) {
      this.this$0 = var1;
   }

   void method9451(RSByteBuffer var1, int var2) {
      this.aString11666 = var1.readString(360012044);
      var1.readInt((byte)5);
   }

   void method9450(Class348 var1, byte var2) {
      var1.aString3624 = this.aString11666;
   }

   void method9453(RSByteBuffer var1) {
      this.aString11666 = var1.readString(1320171088);
      var1.readInt((byte)5);
   }

   void method9457(Class348 var1) {
      var1.aString3624 = this.aString11666;
   }

   void method9455(RSByteBuffer var1) {
      this.aString11666 = var1.readString(110167948);
      var1.readInt((byte)5);
   }

   void method9452(RSByteBuffer var1) {
      this.aString11666 = var1.readString(-1545774782);
      var1.readInt((byte)5);
   }

   void method9456(RSByteBuffer var1) {
      this.aString11666 = var1.readString(-1185061034);
      var1.readInt((byte)5);
   }

   void method9454(RSByteBuffer var1) {
      this.aString11666 = var1.readString(-629052233);
      var1.readInt((byte)5);
   }
}
