package com.jagex;

import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;

public class Class526_Sub23_Sub5 extends Class526_Sub23 {
   long aLong11632;
   String aString11633;
   // $FF: synthetic field
   Class342 this$0;

   void method9454(RSByteBuffer var1) {
      if(var1.readUnsignedByte(96301683) != 255) {
         var1.pos -= 801976415;
         this.aLong11632 = var1.method9663(1803349849) * 8487460684275611405L;
      }

      this.aString11633 = var1.method9700((byte)2);
   }

   void method9452(RSByteBuffer var1) {
      if(var1.readUnsignedByte(1964548220) != 255) {
         var1.pos -= 801976415;
         this.aLong11632 = var1.method9663(737208455) * 8487460684275611405L;
      }

      this.aString11633 = var1.method9700((byte)2);
   }

   void method9450(Class348 var1, byte var2) {
      var1.method4493(this.aLong11632 * -5194845365258539067L, this.aString11633, -2082073823);
   }

   void method9453(RSByteBuffer var1) {
      if(var1.readUnsignedByte(1670798034) != 255) {
         var1.pos -= 801976415;
         this.aLong11632 = var1.method9663(782706193) * 8487460684275611405L;
      }

      this.aString11633 = var1.method9700((byte)2);
   }

   void method9451(RSByteBuffer var1, int var2) {
      if(var1.readUnsignedByte(1862982030) != 255) {
         var1.pos -= 801976415;
         this.aLong11632 = var1.method9663(1173999972) * 8487460684275611405L;
      }

      this.aString11633 = var1.method9700((byte)2);
   }

   void method9455(RSByteBuffer var1) {
      if(var1.readUnsignedByte(742482954) != 255) {
         var1.pos -= 801976415;
         this.aLong11632 = var1.method9663(967357799) * 8487460684275611405L;
      }

      this.aString11633 = var1.method9700((byte)2);
   }

   Class526_Sub23_Sub5(Class342 var1) {
      this.this$0 = var1;
      this.aLong11632 = -8487460684275611405L;
      this.aString11633 = null;
   }

   void method9456(RSByteBuffer var1) {
      if(var1.readUnsignedByte(904153589) != 255) {
         var1.pos -= 801976415;
         this.aLong11632 = var1.method9663(1024590673) * 8487460684275611405L;
      }

      this.aString11633 = var1.method9700((byte)2);
   }

   void method9457(Class348 var1) {
      var1.method4493(this.aLong11632 * -5194845365258539067L, this.aString11633, 644399223);
   }
}
