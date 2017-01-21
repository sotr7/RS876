package com.jagex;

import com.jagex.InterfaceDef;
import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class526_Sub23_Sub8 extends Class526_Sub23 {
   long aLong11639;
   String aString11638;
   int anInt11640;
   // $FF: synthetic field
   Class342 this$0;

   void method9457(Class348 var1) {
      var1.method4490(-4623771692482899493L * this.aLong11639, this.aString11638, this.anInt11640 * 253083983, (byte)12);
   }

   void method9455(RSByteBuffer var1) {
      if(var1.readUnsignedByte(-1589508761) != 255) {
         var1.pos -= 801976415;
         this.aLong11639 = var1.method9663(909378319) * -8296444642980740525L;
      }

      this.aString11638 = var1.method9700((byte)2);
      this.anInt11640 = var1.readUnsignedShort(1472087066) * -1521699409;
   }

   void method9451(RSByteBuffer var1, int var2) {
      if(var1.readUnsignedByte(-1855661737) != 255) {
         var1.pos -= 801976415;
         this.aLong11639 = var1.method9663(652418028) * -8296444642980740525L;
      }

      this.aString11638 = var1.method9700((byte)2);
      this.anInt11640 = var1.readUnsignedShort(824792924) * -1521699409;
   }

   void method9453(RSByteBuffer var1) {
      if(var1.readUnsignedByte(1532658827) != 255) {
         var1.pos -= 801976415;
         this.aLong11639 = var1.method9663(884536907) * -8296444642980740525L;
      }

      this.aString11638 = var1.method9700((byte)2);
      this.anInt11640 = var1.readUnsignedShort(142845169) * -1521699409;
   }

   void method9454(RSByteBuffer var1) {
      if(var1.readUnsignedByte(-1050724596) != 255) {
         var1.pos -= 801976415;
         this.aLong11639 = var1.method9663(1083777618) * -8296444642980740525L;
      }

      this.aString11638 = var1.method9700((byte)2);
      this.anInt11640 = var1.readUnsignedShort(629450012) * -1521699409;
   }

   Class526_Sub23_Sub8(Class342 var1) {
      this.this$0 = var1;
      this.aLong11639 = 8296444642980740525L;
      this.aString11638 = null;
      this.anInt11640 = 0;
   }

   void method9450(Class348 var1, byte var2) {
      var1.method4490(-4623771692482899493L * this.aLong11639, this.aString11638, this.anInt11640 * 253083983, (byte)64);
   }

   void method9456(RSByteBuffer var1) {
      if(var1.readUnsignedByte(-359907908) != 255) {
         var1.pos -= 801976415;
         this.aLong11639 = var1.method9663(1752664723) * -8296444642980740525L;
      }

      this.aString11638 = var1.method9700((byte)2);
      this.anInt11640 = var1.readUnsignedShort(1079804522) * -1521699409;
   }

   void method9452(RSByteBuffer var1) {
      if(var1.readUnsignedByte(-835613781) != 255) {
         var1.pos -= 801976415;
         this.aLong11639 = var1.method9663(340241651) * -8296444642980740525L;
      }

      this.aString11638 = var1.method9700((byte)2);
      this.anInt11640 = var1.readUnsignedShort(573508305) * -1521699409;
   }

   static final void method10565(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1525210059 * var3.anInt2523;
   }
}
