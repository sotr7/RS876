package com.jagex;

import com.jagex.Class339;
import com.jagex.Class340;
import com.jagex.Class526_Sub27;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub9;

public class Class526_Sub27_Sub5 extends Class526_Sub27 {
   String aString11718;
   int anInt11717;
   byte aByte11716;
   // $FF: synthetic field
   Class340 this$0;

   void method9518(RSByteBuffer var1) {
      if(var1.readUnsignedByte(-1767990545) != 255) {
         var1.pos -= 801976415;
         var1.method9663(1296805506);
      }

      this.aString11718 = var1.method9700((byte)2);
      this.anInt11717 = var1.readUnsignedShort(857562695) * -1136097879;
      this.aByte11716 = var1.readByte((byte)89);
      var1.method9663(1014300682);
   }

   void method9517(RSByteBuffer var1, byte var2) {
      if(var1.readUnsignedByte(-1748627919) != 255) {
         var1.pos -= 801976415;
         var1.method9663(1902696909);
      }

      this.aString11718 = var1.method9700((byte)2);
      this.anInt11717 = var1.readUnsignedShort(1268243614) * -1136097879;
      this.aByte11716 = var1.readByte((byte)21);
      var1.method9663(1559678226);
   }

   void method9519(Class526_Sub9 var1, int var2) {
      Class339 var3 = new Class339();
      var3.aString3528 = this.aString11718;
      var3.anInt3527 = this.anInt11717 * 1184434069;
      var3.aByte3526 = this.aByte11716;
      var1.method9344(var3, -871798227);
   }

   void method9516(RSByteBuffer var1) {
      if(var1.readUnsignedByte(762910012) != 255) {
         var1.pos -= 801976415;
         var1.method9663(491117425);
      }

      this.aString11718 = var1.method9700((byte)2);
      this.anInt11717 = var1.readUnsignedShort(950142584) * -1136097879;
      this.aByte11716 = var1.readByte((byte)46);
      var1.method9663(537683961);
   }

   Class526_Sub27_Sub5(Class340 var1) {
      this.this$0 = var1;
      this.aString11718 = null;
   }

   void method9521(Class526_Sub9 var1) {
      Class339 var2 = new Class339();
      var2.aString3528 = this.aString11718;
      var2.anInt3527 = this.anInt11717 * 1184434069;
      var2.aByte3526 = this.aByte11716;
      var1.method9344(var2, -871798227);
   }

   void method9522(Class526_Sub9 var1) {
      Class339 var2 = new Class339();
      var2.aString3528 = this.aString11718;
      var2.anInt3527 = this.anInt11717 * 1184434069;
      var2.aByte3526 = this.aByte11716;
      var1.method9344(var2, -871798227);
   }

   void method9520(Class526_Sub9 var1) {
      Class339 var2 = new Class339();
      var2.aString3528 = this.aString11718;
      var2.anInt3527 = this.anInt11717 * 1184434069;
      var2.aByte3526 = this.aByte11716;
      var1.method9344(var2, -871798227);
   }

   void method9523(Class526_Sub9 var1) {
      Class339 var2 = new Class339();
      var2.aString3528 = this.aString11718;
      var2.anInt3527 = this.anInt11717 * 1184434069;
      var2.aByte3526 = this.aByte11716;
      var1.method9344(var2, -871798227);
   }
}
