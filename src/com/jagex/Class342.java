package com.jagex;

import com.jagex.Class199;
import com.jagex.Class199_Sub1;
import com.jagex.Class199_Sub10;
import com.jagex.Class199_Sub11;
import com.jagex.Class199_Sub12;
import com.jagex.Class199_Sub13;
import com.jagex.Class199_Sub14;
import com.jagex.Class199_Sub15;
import com.jagex.Class199_Sub16;
import com.jagex.Class199_Sub17;
import com.jagex.Class199_Sub18;
import com.jagex.Class199_Sub19;
import com.jagex.Class199_Sub2;
import com.jagex.Class199_Sub20;
import com.jagex.Class199_Sub21;
import com.jagex.Class199_Sub22;
import com.jagex.Class199_Sub23_Sub1;
import com.jagex.Class199_Sub23_Sub2;
import com.jagex.Class199_Sub3;
import com.jagex.Class199_Sub4;
import com.jagex.Class199_Sub5;
import com.jagex.Class199_Sub6;
import com.jagex.Class199_Sub7;
import com.jagex.Class199_Sub8;
import com.jagex.Class199_Sub9;
import com.jagex.Class348;
import com.jagex.Class466;
import com.jagex.Class488;
import com.jagex.Class526;
import com.jagex.Class526_Sub23;
import com.jagex.Class526_Sub23_Sub1;
import com.jagex.Class526_Sub23_Sub10;
import com.jagex.Class526_Sub23_Sub11;
import com.jagex.Class526_Sub23_Sub12;
import com.jagex.Class526_Sub23_Sub13;
import com.jagex.Class526_Sub23_Sub14;
import com.jagex.Class526_Sub23_Sub2;
import com.jagex.Class526_Sub23_Sub3;
import com.jagex.Class526_Sub23_Sub4;
import com.jagex.Class526_Sub23_Sub5;
import com.jagex.Class526_Sub23_Sub6;
import com.jagex.Class526_Sub23_Sub7;
import com.jagex.Class526_Sub23_Sub8;
import com.jagex.Class526_Sub23_Sub9;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class702;
import com.jagex.Class91;
import com.jagex.client;

public class Class342 {
   static final int anInt3542 = 1;
   static final int anInt3544 = 11;
   static final int anInt3545 = 5;
   static final int anInt3546 = 2;
   static final int anInt3547 = 10;
   static final int anInt3548 = 4;
   static final int anInt3550 = 6;
   static final int anInt3551 = 7;
   static final int anInt3552 = 8;
   static final int anInt3554 = 3;
   static final int anInt3555 = 9;
   static final int anInt3556 = 12;
   static final int anInt3557 = 13;
   static final int anInt3558 = 14;
   protected static Class690 aClass690_3559;
   public static Class466 aClass466_3560;
   long aLong3553;
   int anInt3543 = -1378414997;
   Class702 aClass702_3549 = new Class702();

   void method4421(RSByteBuffer var1, short var2) {
      this.aLong3553 = var1.method9663(350191216) * 1232870329369563445L;
      this.anInt3543 = var1.readInt((byte)5) * 1378414997;

      for(int var3 = var1.readUnsignedByte(-461054409); var3 != 0; var3 = var1.readUnsignedByte(401926137)) {
         Object var4;
         if(var3 == 3) {
            var4 = new Class526_Sub23_Sub5(this);
         } else if(var3 == 1) {
            var4 = new Class526_Sub23_Sub13(this);
         } else if(13 == var3) {
            var4 = new Class526_Sub23_Sub8(this);
         } else if(4 == var3) {
            var4 = new Class526_Sub23_Sub9(this);
         } else if(6 == var3) {
            var4 = new Class526_Sub23_Sub14(this);
         } else if(var3 == 5) {
            var4 = new Class526_Sub23_Sub1(this);
         } else if(2 == var3) {
            var4 = new Class526_Sub23_Sub4(this);
         } else if(7 == var3) {
            var4 = new Class526_Sub23_Sub12(this);
         } else if(var3 == 14) {
            var4 = new Class526_Sub23_Sub3(this);
         } else if(var3 == 8) {
            var4 = new Class526_Sub23_Sub11(this);
         } else if(9 == var3) {
            var4 = new Class526_Sub23_Sub7(this);
         } else if(10 == var3) {
            var4 = new Class526_Sub23_Sub6(this);
         } else if(var3 == 11) {
            var4 = new Class526_Sub23_Sub2(this);
         } else {
            if(var3 != 12) {
               throw new RuntimeException("");
            }

            var4 = new Class526_Sub23_Sub10(this);
         }

         ((Class526_Sub23)var4).method9451(var1, -1149217940);
         this.aClass702_3549.method8176((Class526)var4, -1173584436);
      }

   }

   void method4422(RSByteBuffer var1) {
      this.aLong3553 = var1.method9663(249955409) * 1232870329369563445L;
      this.anInt3543 = var1.readInt((byte)5) * 1378414997;

      for(int var2 = var1.readUnsignedByte(317211366); var2 != 0; var2 = var1.readUnsignedByte(1978696822)) {
         Object var3;
         if(var2 == 3) {
            var3 = new Class526_Sub23_Sub5(this);
         } else if(var2 == 1) {
            var3 = new Class526_Sub23_Sub13(this);
         } else if(13 == var2) {
            var3 = new Class526_Sub23_Sub8(this);
         } else if(4 == var2) {
            var3 = new Class526_Sub23_Sub9(this);
         } else if(6 == var2) {
            var3 = new Class526_Sub23_Sub14(this);
         } else if(var2 == 5) {
            var3 = new Class526_Sub23_Sub1(this);
         } else if(2 == var2) {
            var3 = new Class526_Sub23_Sub4(this);
         } else if(7 == var2) {
            var3 = new Class526_Sub23_Sub12(this);
         } else if(var2 == 14) {
            var3 = new Class526_Sub23_Sub3(this);
         } else if(var2 == 8) {
            var3 = new Class526_Sub23_Sub11(this);
         } else if(9 == var2) {
            var3 = new Class526_Sub23_Sub7(this);
         } else if(10 == var2) {
            var3 = new Class526_Sub23_Sub6(this);
         } else if(var2 == 11) {
            var3 = new Class526_Sub23_Sub2(this);
         } else {
            if(var2 != 12) {
               throw new RuntimeException("");
            }

            var3 = new Class526_Sub23_Sub10(this);
         }

         ((Class526_Sub23)var3).method9451(var1, -911726135);
         this.aClass702_3549.method8176((Class526)var3, -975613944);
      }

   }

   void method4423(RSByteBuffer var1) {
      this.aLong3553 = var1.method9663(1028288707) * 1232870329369563445L;
      this.anInt3543 = var1.readInt((byte)5) * 1378414997;

      for(int var2 = var1.readUnsignedByte(300002938); var2 != 0; var2 = var1.readUnsignedByte(429419529)) {
         Object var3;
         if(var2 == 3) {
            var3 = new Class526_Sub23_Sub5(this);
         } else if(var2 == 1) {
            var3 = new Class526_Sub23_Sub13(this);
         } else if(13 == var2) {
            var3 = new Class526_Sub23_Sub8(this);
         } else if(4 == var2) {
            var3 = new Class526_Sub23_Sub9(this);
         } else if(6 == var2) {
            var3 = new Class526_Sub23_Sub14(this);
         } else if(var2 == 5) {
            var3 = new Class526_Sub23_Sub1(this);
         } else if(2 == var2) {
            var3 = new Class526_Sub23_Sub4(this);
         } else if(7 == var2) {
            var3 = new Class526_Sub23_Sub12(this);
         } else if(var2 == 14) {
            var3 = new Class526_Sub23_Sub3(this);
         } else if(var2 == 8) {
            var3 = new Class526_Sub23_Sub11(this);
         } else if(9 == var2) {
            var3 = new Class526_Sub23_Sub7(this);
         } else if(10 == var2) {
            var3 = new Class526_Sub23_Sub6(this);
         } else if(var2 == 11) {
            var3 = new Class526_Sub23_Sub2(this);
         } else {
            if(var2 != 12) {
               throw new RuntimeException("");
            }

            var3 = new Class526_Sub23_Sub10(this);
         }

         ((Class526_Sub23)var3).method9451(var1, -1806724818);
         this.aClass702_3549.method8176((Class526)var3, -1660062814);
      }

   }

   void method4424(RSByteBuffer var1) {
      this.aLong3553 = var1.method9663(670384176) * 1232870329369563445L;
      this.anInt3543 = var1.readInt((byte)5) * 1378414997;

      for(int var2 = var1.readUnsignedByte(527356539); var2 != 0; var2 = var1.readUnsignedByte(-32176865)) {
         Object var3;
         if(var2 == 3) {
            var3 = new Class526_Sub23_Sub5(this);
         } else if(var2 == 1) {
            var3 = new Class526_Sub23_Sub13(this);
         } else if(13 == var2) {
            var3 = new Class526_Sub23_Sub8(this);
         } else if(4 == var2) {
            var3 = new Class526_Sub23_Sub9(this);
         } else if(6 == var2) {
            var3 = new Class526_Sub23_Sub14(this);
         } else if(var2 == 5) {
            var3 = new Class526_Sub23_Sub1(this);
         } else if(2 == var2) {
            var3 = new Class526_Sub23_Sub4(this);
         } else if(7 == var2) {
            var3 = new Class526_Sub23_Sub12(this);
         } else if(var2 == 14) {
            var3 = new Class526_Sub23_Sub3(this);
         } else if(var2 == 8) {
            var3 = new Class526_Sub23_Sub11(this);
         } else if(9 == var2) {
            var3 = new Class526_Sub23_Sub7(this);
         } else if(10 == var2) {
            var3 = new Class526_Sub23_Sub6(this);
         } else if(var2 == 11) {
            var3 = new Class526_Sub23_Sub2(this);
         } else {
            if(var2 != 12) {
               throw new RuntimeException("");
            }

            var3 = new Class526_Sub23_Sub10(this);
         }

         ((Class526_Sub23)var3).method9451(var1, -1231388346);
         this.aClass702_3549.method8176((Class526)var3, -1791945431);
      }

   }

   public void method4425(Class348 var1, byte var2) {
      if(4815194713006446181L * var1.aLong3622 == this.aLong3553 * -7724641626136282851L && var1.anInt3635 * -836445283 == -1549807171 * this.anInt3543) {
         for(Class526_Sub23 var3 = (Class526_Sub23)this.aClass702_3549.method8206((byte)22); var3 != null; var3 = (Class526_Sub23)this.aClass702_3549.method8181(322058608)) {
            var3.method9450(var1, (byte)1);
         }

         var1.anInt3635 += -911768907;
      } else {
         throw new RuntimeException("");
      }
   }

   public Class342(RSByteBuffer var1) {
      this.method4421(var1, (short)-6375);
   }

   static Class199 method4426(RSByteBuffer var0, int var1) {
      int var2 = var0.readUnsignedByte(123705493);
      Class91 var3 = Class488.method5867(var2, (byte)54);
      Object var4 = null;
      switch(var3.anInt895 * -1845005795) {
      case 0:
         var4 = new Class199_Sub1(var0);
         break;
      case 1:
         var4 = new Class199_Sub2(var0);
         break;
      case 2:
         var4 = new Class199_Sub4(var0);
         break;
      case 3:
         var4 = new Class199_Sub7(var0);
         break;
      case 4:
         var4 = new Class199_Sub18(var0, 0, 1);
         break;
      case 5:
         var4 = new Class199_Sub3(var0);
         break;
      case 6:
         var4 = new Class199_Sub18(var0, 1, 1);
         break;
      case 7:
         var4 = new Class199_Sub13(var0);
         break;
      case 8:
         var4 = new Class199_Sub16(var0);
      case 9:
      case 12:
      case 20:
      default:
         break;
      case 10:
         var4 = new Class199_Sub12(var0);
         break;
      case 11:
         var4 = new Class199_Sub5(var0);
         break;
      case 13:
         var4 = new Class199_Sub22(var0);
         break;
      case 14:
         var4 = new Class199_Sub23_Sub1(var0);
         break;
      case 15:
         var4 = new Class199_Sub17(var0, false);
         break;
      case 16:
         var4 = new Class199_Sub8(var0);
         break;
      case 17:
         var4 = new Class199_Sub15(var0);
         break;
      case 18:
         var4 = new Class199_Sub9(var0);
         break;
      case 19:
         var4 = new Class199_Sub18(var0, 0, 0);
         break;
      case 21:
         var4 = new Class199_Sub17(var0, true);
         break;
      case 22:
         var4 = new Class199_Sub11(var0);
         break;
      case 23:
         var4 = new Class199_Sub19(var0);
         break;
      case 24:
         var4 = new Class199_Sub6(var0);
         break;
      case 25:
         var4 = new Class199_Sub20(var0);
         break;
      case 26:
         var4 = new Class199_Sub14(var0);
         break;
      case 27:
         var4 = new Class199_Sub18(var0, 1, 0);
         break;
      case 28:
         var4 = new Class199_Sub10(var0);
         break;
      case 29:
         var4 = new Class199_Sub21(var0);
         break;
      case 30:
         var4 = new Class199_Sub23_Sub2(var0);
      }

      return (Class199)var4;
   }

   static final void method4427(Class681 var0, int var1) {
      var0.anObjectArray8618[var0.anIntArray8642[var0.anInt8644 * -244840757]] = var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
   }

   static final void method4428(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aBool11276?1:0;
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = client.aString11271 == null?"":client.aString11271;
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = null == client.aString11184?"":client.aString11184;
   }
}
