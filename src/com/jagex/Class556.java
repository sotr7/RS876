package com.jagex;

import com.jagex.Class174;
import com.jagex.Class208;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class443;
import com.jagex.Class526_Sub16;
import com.jagex.RSByteBuffer;
import com.jagex.Class602;
import com.jagex.Class616;
import com.jagex.Class639_Sub1_Sub1_Sub2;
import com.jagex.Class661;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class703;
import com.jagex.Class87;

public class Class556 {
   static final int anInt7482 = 15;
   static final int anInt7483 = 1;
   static final int anInt7484 = 2;
   public static final int anInt7486 = 31;
   static final int anInt7487 = 5;
   static final int anInt7488 = 2;
   static final int anInt7489 = 4;
   static final int anInt7490 = 3;
   static final int anInt7491 = 5;
   static final int anInt7492 = 6;
   static final int anInt7493 = 7;
   static final int anInt7494 = 8;
   static final int anInt7495 = 9;
   static final int anInt7496 = 11;
   static final int anInt7498 = 12;
   static final int anInt7499 = 13;
   static final int anInt7502 = 16;
   static final int anInt7503 = 3;
   static final int anInt7506 = 10;
   public static final int anInt7508 = 0;
   static final int anInt7515 = 14;
   static final int anInt7516 = 4;
   static int[] anIntArray7512;
   public Class526_Sub16 aClass526_Sub16_7504;
   int anInt7514;
   int anInt7510;
   int anInt7513;
   int anInt7511;
   int anInt7500 = -1430623681;
   public int anInt7507;
   boolean aBool7505;
   boolean aBool7501;
   short[] aShortArray7485;
   public int anInt7497;
   int anInt7509;

   static void method6692() {
      anIntArray7512 = Class703.method8215(2048, 35, 8, 8, 4, 0.4F, true, (byte)1);
   }

   void method6693(Class174 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.aClass526_Sub16_7504 = var1.method2335(var2, var3, var4, var5, var6, 1.0F);
   }

   void method6694(int var1, boolean var2, int var3) {
      int var5;
      if(!var2) {
         int var4 = var1 * this.anInt7511 * 132687771 / 50 + this.anInt7509 * -769020329 & 2047;
         switch(this.anInt7510 * -337772189) {
         case 1:
            var5 = 1024 + (Class443.anIntArray4895[var4 << 3] >> 4);
            break;
         case 2:
            var5 = var4;
            break;
         case 3:
            var5 = anIntArray7512[var4] >> 1;
            break;
         case 4:
            var5 = var4 >> 10 << 11;
            break;
         case 5:
            var5 = (var4 < 1024?var4:2048 - var4) << 1;
            break;
         default:
            var5 = 2048;
         }
      } else {
         var5 = 2048;
      }

      this.aClass526_Sub16_7504.method9421((float)((var5 * this.anInt7513 * 570037141 >> 11) + this.anInt7514 * -1145896577) / 2048.0F, (byte)-56);
      this.aClass526_Sub16_7504.method9415((byte)-4);
   }

   void method6695(int var1) {
      switch(this.anInt7497 * 447692401) {
      case 2:
         this.anInt7510 = 531859531;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 3:
         this.anInt7510 = 531859531;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 107556864;
         break;
      case 4:
         this.anInt7510 = 2127438124;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 5:
         this.anInt7510 = 2127438124;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 215113728;
         break;
      case 6:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 53778432;
         break;
      case 7:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 107556864;
         break;
      case 8:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1426457600;
         this.anInt7513 = 2055140352;
         this.anInt7511 = 53778432;
         break;
      case 9:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1426457600;
         this.anInt7513 = 2055140352;
         this.anInt7511 = 107556864;
         break;
      case 10:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 53778432;
         break;
      case 11:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 107556864;
         break;
      case 12:
         this.anInt7510 = 1063719062;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 13:
         this.anInt7510 = 1063719062;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 215113728;
         break;
      case 14:
         this.anInt7510 = 531859531;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 53778432;
         break;
      case 15:
         this.anInt7510 = 531859531;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 107556864;
         break;
      case 16:
         this.anInt7510 = 531859531;
         this.anInt7514 = 1798666496;
         this.anInt7513 = -559956736;
         this.anInt7511 = 215113728;
         break;
      default:
         this.anInt7514 = 0;
         this.anInt7510 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
      }

   }

   public Class556(Class174 var1, int var2, RSByteBuffer var3, int var4) {
      if(anIntArray7512 == null) {
         Class639_Sub1_Sub1_Sub2.method10860(-930430523);
      }

      this.anInt7507 = var3.readUnsignedByte(706368064) * -1932998737;
      this.aBool7505 = 0 != (this.anInt7507 * 130215759 & 8);
      this.aBool7501 = 0 != (130215759 * this.anInt7507 & 16);
      this.anInt7507 = -1932998737 * (130215759 * this.anInt7507 & 7);
      int var5 = var3.readUnsignedShort(639593513) << var4;
      int var6 = var3.readUnsignedShort(324398185) << var4;
      int var7 = var3.readUnsignedShort(869815719) << var4;
      int var8 = var3.readUnsignedByte(-680615157);
      int var9 = var8 * 2 + 1;
      this.aShortArray7485 = new short[var9];

      int var10;
      for(var10 = 0; var10 < this.aShortArray7485.length; ++var10) {
         short var11 = (short)var3.readUnsignedShort(917465013);
         int var12 = var11 >>> 8;
         int var13 = var11 & 255;
         if(var12 >= var9) {
            var12 = var9 - 1;
         }

         if(var13 > var9 - var12) {
            var13 = var9 - var12;
         }

         this.aShortArray7485[var10] = (short)(var12 << 8 | var13);
      }

      var8 = (var8 << var2) + (1 << var2 >> 1);
      var10 = null != Class661.anIntArray8516?Class661.anIntArray8516[var3.readUnsignedShort(897192015)]:Class87.anIntArray855[Class616.method7307(var3.readUnsignedShort(79447740), 1141260659) & '\uffff'];
      int var14 = var3.readUnsignedByte(-568992884);
      this.anInt7497 = (var14 & 31) * -97729903;
      this.anInt7509 = ((var14 & 224) << 3) * 679288167;
      if(31 != 447692401 * this.anInt7497) {
         this.method6695(1515441295);
      }

      this.anInt7500 = var3.readShort((byte)1) * 1430623681;
      this.method6693(var1, var5, var7, var6, var8, var10, 694504571);
   }

   public void method6696(int var1, int var2, int var3, int var4) {
      this.anInt7510 = 531859531 * var1;
      this.anInt7514 = var4 * -672481665;
      this.anInt7513 = -371286083 * var3;
      this.anInt7511 = -2116000109 * var2;
   }

   public void method6697(int var1, int var2, int var3, int var4) {
      this.anInt7510 = 531859531 * var1;
      this.anInt7514 = var4 * -672481665;
      this.anInt7513 = -371286083 * var3;
      this.anInt7511 = -2116000109 * var2;
   }

   void method6698() {
      switch(this.anInt7497 * 447692401) {
      case 2:
         this.anInt7510 = 531859531;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 3:
         this.anInt7510 = 531859531;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 107556864;
         break;
      case 4:
         this.anInt7510 = 2127438124;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 5:
         this.anInt7510 = 2127438124;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 215113728;
         break;
      case 6:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 53778432;
         break;
      case 7:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 107556864;
         break;
      case 8:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1426457600;
         this.anInt7513 = 2055140352;
         this.anInt7511 = 53778432;
         break;
      case 9:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1426457600;
         this.anInt7513 = 2055140352;
         this.anInt7511 = 107556864;
         break;
      case 10:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 53778432;
         break;
      case 11:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 107556864;
         break;
      case 12:
         this.anInt7510 = 1063719062;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 13:
         this.anInt7510 = 1063719062;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 215113728;
         break;
      case 14:
         this.anInt7510 = 531859531;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 53778432;
         break;
      case 15:
         this.anInt7510 = 531859531;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 107556864;
         break;
      case 16:
         this.anInt7510 = 531859531;
         this.anInt7514 = 1798666496;
         this.anInt7513 = -559956736;
         this.anInt7511 = 215113728;
         break;
      default:
         this.anInt7514 = 0;
         this.anInt7510 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
      }

   }

   void method6699() {
      switch(this.anInt7497 * 447692401) {
      case 2:
         this.anInt7510 = 531859531;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 3:
         this.anInt7510 = 531859531;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 107556864;
         break;
      case 4:
         this.anInt7510 = 2127438124;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 5:
         this.anInt7510 = 2127438124;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 215113728;
         break;
      case 6:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 53778432;
         break;
      case 7:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 107556864;
         break;
      case 8:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1426457600;
         this.anInt7513 = 2055140352;
         this.anInt7511 = 53778432;
         break;
      case 9:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -1426457600;
         this.anInt7513 = 2055140352;
         this.anInt7511 = 107556864;
         break;
      case 10:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 53778432;
         break;
      case 11:
         this.anInt7510 = 1595578593;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 107556864;
         break;
      case 12:
         this.anInt7510 = 1063719062;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
         break;
      case 13:
         this.anInt7510 = 1063719062;
         this.anInt7514 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 215113728;
         break;
      case 14:
         this.anInt7510 = 531859531;
         this.anInt7514 = -1783072000;
         this.anInt7513 = -1679870208;
         this.anInt7511 = 53778432;
         break;
      case 15:
         this.anInt7510 = 531859531;
         this.anInt7514 = -2139686400;
         this.anInt7513 = -1119913472;
         this.anInt7511 = 107556864;
         break;
      case 16:
         this.anInt7510 = 531859531;
         this.anInt7514 = 1798666496;
         this.anInt7513 = -559956736;
         this.anInt7511 = 215113728;
         break;
      default:
         this.anInt7514 = 0;
         this.anInt7510 = 0;
         this.anInt7513 = -184686592;
         this.anInt7511 = 53778432;
      }

   }

   public void method6700(int var1, int var2, int var3, int var4, byte var5) {
      this.anInt7510 = 531859531 * var1;
      this.anInt7514 = var4 * -672481665;
      this.anInt7513 = -371286083 * var3;
      this.anInt7511 = -2116000109 * var2;
   }

   static final void method6701(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class602.method7096(var3, var4, var0, Class258.aClass258_2823, 1340751157);
   }

   static void method6702(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class208.method2935(-806461617);
   }
}
