package com.jagex;

import com.jagex.Class115;
import com.jagex.Class265;
import com.jagex.Class37;
import com.jagex.OutFrame;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.OutFrameBuffer;
import com.jagex.Interface65;
import com.jagex.client;

public class Class37_Sub1 extends Class37 implements Interface65 {
   public void method9566(int var1) {
      this.anInt398 = 681851233 * var1;
   }

   public void method228(int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4182, client.aClass111_11060.aClass14_1342, 1136624698);
      var2.out.writeLEShort128(50103539 * this.anInt396, 1759958424);
      var2.out.write128Byte(-603051359 * this.anInt398, (byte)-31);
      var2.out.writeTriByte(this.anInt384 * -2036858365, -1342212444);
      var2.out.writeByteC(this.anInt397 * -1685067281, -802285532);
      var2.out.method9698(this.anInt383 * 1723332549, (byte)52);
      var2.out.method9698(this.anInt393 * -1434101641, (byte)-2);
      var2.out.writeLEShort128(this.anInt391 * -1548941013, 1361166726);
      var2.out.method9698(this.anInt382 * 492423633, (byte)-51);
      client.aClass111_11060.write(var2, (byte)9);
   }

   public void method9567(int var1, int var2) {
      this.anInt398 = 681851233 * var1;
   }

   public void method9568(int var1, short var2) {
      this.anInt396 = (50103539 * this.anInt396 | var1) * -1962658757;
   }

   public void method9569(int var1, int var2) {
      this.anInt397 = var1 * 924476687;
   }

   public void method9570(int var1, int var2, int var3) {
      if(var1 == 0 && var2 > 32767) {
         var2 = 32767;
      } else if(var2 > 8388607) {
         var2 = 8388607;
      }

      switch(var1) {
      case 0:
         this.anInt391 = -2077790845 * var2;
         break;
      case 1:
         this.anInt393 = var2 * -457965241;
      case 2:
      case 4:
      default:
         break;
      case 3:
         this.anInt382 = var2 * -950849743;
         break;
      case 5:
         this.anInt384 = -1677576021 * var2;
      }

   }

   public void method9571(int var1) {
      this.anInt396 = (50103539 * this.anInt396 | var1) * -1962658757;
   }

   public void method9572(int var1, int var2) {
      if(var1 == 0 && var2 > 32767) {
         var2 = 32767;
      } else if(var2 > 8388607) {
         var2 = 8388607;
      }

      switch(var1) {
      case 0:
         this.anInt391 = -2077790845 * var2;
         break;
      case 1:
         this.anInt393 = var2 * -457965241;
      case 2:
      case 4:
      default:
         break;
      case 3:
         this.anInt382 = var2 * -950849743;
         break;
      case 5:
         this.anInt384 = -1677576021 * var2;
      }

   }

   public void method9573(int var1) {
      this.anInt398 = 681851233 * var1;
   }

   public void method9574(int var1) {
      this.anInt396 = (50103539 * this.anInt396 | var1) * -1962658757;
   }

   public void method9575(int var1) {
      this.anInt398 = 681851233 * var1;
   }

   public void method9576(int var1) {
      this.anInt396 = (50103539 * this.anInt396 | var1) * -1962658757;
   }

   public void method140() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4182, client.aClass111_11060.aClass14_1342, 1502067831);
      var1.out.writeLEShort128(50103539 * this.anInt396, 1353040882);
      var1.out.write128Byte(-603051359 * this.anInt398, (byte)40);
      var1.out.writeTriByte(this.anInt384 * -2036858365, -1493702042);
      var1.out.writeByteC(this.anInt397 * -1685067281, -802285532);
      var1.out.method9698(this.anInt383 * 1723332549, (byte)-37);
      var1.out.method9698(this.anInt393 * -1434101641, (byte)5);
      var1.out.writeLEShort128(this.anInt391 * -1548941013, 548813295);
      var1.out.method9698(this.anInt382 * 492423633, (byte)9);
      client.aClass111_11060.write(var1, (byte)-61);
   }

   public void method298() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4182, client.aClass111_11060.aClass14_1342, 810091375);
      var1.out.writeLEShort128(50103539 * this.anInt396, -1749967142);
      var1.out.write128Byte(-603051359 * this.anInt398, (byte)-64);
      var1.out.writeTriByte(this.anInt384 * -2036858365, -2028286835);
      var1.out.writeByteC(this.anInt397 * -1685067281, -802285532);
      var1.out.method9698(this.anInt383 * 1723332549, (byte)-58);
      var1.out.method9698(this.anInt393 * -1434101641, (byte)-16);
      var1.out.writeLEShort128(this.anInt391 * -1548941013, -2065348180);
      var1.out.method9698(this.anInt382 * 492423633, (byte)23);
      client.aClass111_11060.write(var1, (byte)-49);
   }

   public void method9577(int var1) {
      this.anInt397 = var1 * 924476687;
   }

   public void method9578(int var1) {
      this.anInt397 = var1 * 924476687;
   }

   public void method9579(int var1) {
      this.anInt397 = var1 * 924476687;
   }

   public void method9580(int var1, int var2) {
      if(var1 == 0 && var2 > 32767) {
         var2 = 32767;
      } else if(var2 > 8388607) {
         var2 = 8388607;
      }

      switch(var1) {
      case 0:
         this.anInt391 = -2077790845 * var2;
         break;
      case 1:
         this.anInt393 = var2 * -457965241;
      case 2:
      case 4:
      default:
         break;
      case 3:
         this.anInt382 = var2 * -950849743;
         break;
      case 5:
         this.anInt384 = -1677576021 * var2;
      }

   }

   public void method9581(int var1) {
      this.anInt396 = (50103539 * this.anInt396 | var1) * -1962658757;
   }

   public void method9582(int var1, int var2) {
      if(var1 == 0 && var2 > 32767) {
         var2 = 32767;
      } else if(var2 > 8388607) {
         var2 = 8388607;
      }

      switch(var1) {
      case 0:
         this.anInt391 = -2077790845 * var2;
         break;
      case 1:
         this.anInt393 = var2 * -457965241;
      case 2:
      case 4:
      default:
         break;
      case 3:
         this.anInt382 = var2 * -950849743;
         break;
      case 5:
         this.anInt384 = -1677576021 * var2;
      }

   }

   static void method9583(int var0, int var1, int var2, byte var3) {
      Class526_Sub21_Sub9 var4 = Class265.method3560(11, (long)var0);
      var4.method10584(230428369);
      var4.anInt11678 = var1 * 1693201951;
      var4.anInt11680 = var2 * -1482432943;
   }
}
