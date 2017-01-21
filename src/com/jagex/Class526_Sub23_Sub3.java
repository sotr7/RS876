package com.jagex;

import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;

public class Class526_Sub23_Sub3 extends Class526_Sub23 {
   int anInt11626;
   boolean aBool11627;
   // $FF: synthetic field
   Class342 this$0;

   void method9452(RSByteBuffer var1) {
      this.anInt11626 = var1.readUnsignedShort(1972026973) * 583548939;
      this.aBool11627 = var1.readUnsignedByte(2138283071) == 1;
   }

   void method9450(Class348 var1, byte var2) {
      var1.method4499(2025081763 * this.anInt11626, this.aBool11627, (byte)74);
   }

   void method9453(RSByteBuffer var1) {
      this.anInt11626 = var1.readUnsignedShort(1203855877) * 583548939;
      this.aBool11627 = var1.readUnsignedByte(-1936025380) == 1;
   }

   Class526_Sub23_Sub3(Class342 var1) {
      this.this$0 = var1;
      this.anInt11626 = -583548939;
   }

   void method9454(RSByteBuffer var1) {
      this.anInt11626 = var1.readUnsignedShort(250373661) * 583548939;
      this.aBool11627 = var1.readUnsignedByte(-1619969944) == 1;
   }

   void method9455(RSByteBuffer var1) {
      this.anInt11626 = var1.readUnsignedShort(893768407) * 583548939;
      this.aBool11627 = var1.readUnsignedByte(-1799265961) == 1;
   }

   void method9456(RSByteBuffer var1) {
      this.anInt11626 = var1.readUnsignedShort(1368160839) * 583548939;
      this.aBool11627 = var1.readUnsignedByte(1142262875) == 1;
   }

   void method9451(RSByteBuffer var1, int var2) {
      this.anInt11626 = var1.readUnsignedShort(351790821) * 583548939;
      this.aBool11627 = var1.readUnsignedByte(-1338324135) == 1;
   }

   void method9457(Class348 var1) {
      var1.method4499(2025081763 * this.anInt11626, this.aBool11627, (byte)68);
   }
}
