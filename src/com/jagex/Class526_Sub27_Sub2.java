package com.jagex;

import com.jagex.Class340;
import com.jagex.Class526_Sub27;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub9;
import com.jagex.Class681;
import com.jagex.client;

public class Class526_Sub27_Sub2 extends Class526_Sub27 {
   // $FF: synthetic field
   Class340 this$0;
   int anInt11628;

   void method9520(Class526_Sub9 var1) {
      var1.method9345(594079567 * this.anInt11628, 1185992510);
   }

   Class526_Sub27_Sub2(Class340 var1) {
      this.this$0 = var1;
      this.anInt11628 = -1398982575;
   }

   void method9519(Class526_Sub9 var1, int var2) {
      var1.method9345(594079567 * this.anInt11628, 826602725);
   }

   void method9516(RSByteBuffer var1) {
      this.anInt11628 = var1.readUnsignedShort(1635816341) * 1398982575;
      var1.readUnsignedByte(-291753607);
      if(var1.readUnsignedByte(1918927463) != 255) {
         var1.pos -= 801976415;
         var1.method9663(637848764);
      }

   }

   void method9518(RSByteBuffer var1) {
      this.anInt11628 = var1.readUnsignedShort(220209036) * 1398982575;
      var1.readUnsignedByte(-1290613995);
      if(var1.readUnsignedByte(-1800451123) != 255) {
         var1.pos -= 801976415;
         var1.method9663(1563425712);
      }

   }

   void method9521(Class526_Sub9 var1) {
      var1.method9345(594079567 * this.anInt11628, 1593474842);
   }

   void method9517(RSByteBuffer var1, byte var2) {
      this.anInt11628 = var1.readUnsignedShort(1356473850) * 1398982575;
      var1.readUnsignedByte(1016515721);
      if(var1.readUnsignedByte(-1675729891) != 255) {
         var1.pos -= 801976415;
         var1.method9663(1889536125);
      }

   }

   void method9522(Class526_Sub9 var1) {
      var1.method9345(594079567 * this.anInt11628, 1576998397);
   }

   void method9523(Class526_Sub9 var1) {
      var1.method9345(594079567 * this.anInt11628, 994095754);
   }

   static final void method10563(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = client.aClass492ArrayArray11265[var3][var2].method5878((byte)37);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4 == 1?1:0;
   }
}
