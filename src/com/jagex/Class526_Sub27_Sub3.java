package com.jagex;

import com.jagex.Class340;
import com.jagex.Class526_Sub27;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub9;
import com.jagex.Class681;
import com.jagex.client;

public class Class526_Sub27_Sub3 extends Class526_Sub27 {
   String aString11647;
   byte aByte11646;
   byte aByte11648;
   // $FF: synthetic field
   Class340 this$0;

   void method9517(RSByteBuffer var1, byte var2) {
      this.aString11647 = var1.method9700((byte)2);
      if(null != this.aString11647) {
         var1.readUnsignedByte(1660485671);
         this.aByte11646 = var1.readByte((byte)74);
         this.aByte11648 = var1.readByte((byte)113);
      }

   }

   void method9516(RSByteBuffer var1) {
      this.aString11647 = var1.method9700((byte)2);
      if(null != this.aString11647) {
         var1.readUnsignedByte(-1594040982);
         this.aByte11646 = var1.readByte((byte)62);
         this.aByte11648 = var1.readByte((byte)96);
      }

   }

   void method9519(Class526_Sub9 var1, int var2) {
      var1.aString10403 = this.aString11647;
      if(null != this.aString11647) {
         var1.aByte10407 = this.aByte11646;
         var1.aByte10408 = this.aByte11648;
      }

   }

   void method9523(Class526_Sub9 var1) {
      var1.aString10403 = this.aString11647;
      if(null != this.aString11647) {
         var1.aByte10407 = this.aByte11646;
         var1.aByte10408 = this.aByte11648;
      }

   }

   void method9518(RSByteBuffer var1) {
      this.aString11647 = var1.method9700((byte)2);
      if(null != this.aString11647) {
         var1.readUnsignedByte(1246097060);
         this.aByte11646 = var1.readByte((byte)52);
         this.aByte11648 = var1.readByte((byte)100);
      }

   }

   void method9521(Class526_Sub9 var1) {
      var1.aString10403 = this.aString11647;
      if(null != this.aString11647) {
         var1.aByte10407 = this.aByte11646;
         var1.aByte10408 = this.aByte11648;
      }

   }

   Class526_Sub27_Sub3(Class340 var1) {
      this.this$0 = var1;
   }

   void method9520(Class526_Sub9 var1) {
      var1.aString10403 = this.aString11647;
      if(null != this.aString11647) {
         var1.aByte10407 = this.aByte11646;
         var1.aByte10408 = this.aByte11648;
      }

   }

   void method9522(Class526_Sub9 var1) {
      var1.aString10403 = this.aString11647;
      if(null != this.aString11647) {
         var1.aByte10407 = this.aByte11646;
         var1.aByte10408 = this.aByte11648;
      }

   }

   static final void method10567(Class681 var0, int var1) {
      if(null != client.aString11027) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = client.aString11027;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }
}
