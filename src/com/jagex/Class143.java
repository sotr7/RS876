package com.jagex;

import com.jagex.Class159;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class292_Sub1;
import com.jagex.Class442;
import com.jagex.Class452;
import com.jagex.Class454;
import com.jagex.Class457;
import com.jagex.Class458;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class681;
import com.jagex.Interface13;

public abstract class Class143 implements Interface13 {
   public boolean aBool1678;
   public Class454 aClass454_1676;
   public Class458 aClass458_1677;
   public Class452 aClass452_1675;
   public int anInt1674;

   boolean method1657() {
      return this.aClass452_1675 != null && this.aClass454_1676 != null;
   }

   abstract void method1658(RSByteBuffer var1, int var2);

   abstract void method1659(RSByteBuffer var1, int var2, byte var3);

   boolean method1660(int var1) {
      return this.aClass452_1675 != null && this.aClass454_1676 != null;
   }

   public Object method1661(int var1) {
      return this.aClass452_1675.method5361(this, (byte)1);
   }

   public void method83(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(-1603203709);
         if(var2 == 0) {
            return;
         }

         Class159 var3 = (Class159)Class561.findIdentifiable(Class292_Sub1.method9125(-1499791816), var2, (byte)-114);
         if(var3 != null) {
            switch(2140308375 * var3.anInt1766) {
            case 1:
               var1.method9637(-1495866034);
               break;
            case 2:
               this.aBool1678 = false;
            case 3:
               break;
            case 4:
               int var4 = var1.readUnsignedByte(1414242010);
               this.aClass454_1676 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var4, (byte)-109);
               if(null != this.aClass454_1676) {
                  break;
               }

               throw new IllegalStateException("");
            case 5:
               this.aClass458_1677 = (Class458)Class561.findIdentifiable(Class457.method5411(1185539735), var1.readUnsignedByte(-500318424), (byte)-10);
               break;
            case 6:
               Class561.findIdentifiable(Class442.method5198(960986855), var1.readUnsignedByte(286967120), (byte)-65);
               break;
            default:
               throw new IllegalStateException("");
            }
         } else {
            this.method1659(var1, var2, (byte)67);
         }
      }
   }

   public void method84(RSByteBuffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte(858681853);
         if(var2 == 0) {
            return;
         }

         Class159 var3 = (Class159)Class561.findIdentifiable(Class292_Sub1.method9125(-628640718), var2, (byte)-31);
         if(var3 != null) {
            switch(2140308375 * var3.anInt1766) {
            case 1:
               var1.method9637(-1495866034);
               break;
            case 2:
               this.aBool1678 = false;
            case 3:
               break;
            case 4:
               int var4 = var1.readUnsignedByte(393533893);
               this.aClass454_1676 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var4, (byte)-107);
               if(null != this.aClass454_1676) {
                  break;
               }

               throw new IllegalStateException("");
            case 5:
               this.aClass458_1677 = (Class458)Class561.findIdentifiable(Class457.method5411(1185539735), var1.readUnsignedByte(1609965019), (byte)-2);
               break;
            case 6:
               Class561.findIdentifiable(Class442.method5198(-62924142), var1.readUnsignedByte(1551828374), (byte)-6);
               break;
            default:
               throw new IllegalStateException("");
            }
         } else {
            this.method1659(var1, var2, (byte)43);
         }
      }
   }

   abstract void method1662(RSByteBuffer var1, int var2);

   Class143(Class452 var1, int var2) {
      this.aClass458_1677 = Class458.aClass458_5169;
      this.aBool1678 = true;
      this.aClass452_1675 = var1;
      this.anInt1674 = -423194187 * var2;
   }

   abstract void method1663(RSByteBuffer var1, int var2);

   public void method82(RSByteBuffer var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte(-2130915863);
         if(var3 == 0) {
            return;
         }

         Class159 var4 = (Class159)Class561.findIdentifiable(Class292_Sub1.method9125(-2008108936), var3, (byte)-6);
         if(var4 != null) {
            switch(2140308375 * var4.anInt1766) {
            case 1:
               var1.method9637(-1495866034);
               break;
            case 2:
               this.aBool1678 = false;
            case 3:
               break;
            case 4:
               int var5 = var1.readUnsignedByte(895026341);
               this.aClass454_1676 = (Class454)Class561.findIdentifiable(Class454.method5391(1508098173), var5, (byte)-124);
               if(null != this.aClass454_1676) {
                  break;
               }

               throw new IllegalStateException("");
            case 5:
               this.aClass458_1677 = (Class458)Class561.findIdentifiable(Class457.method5411(1185539735), var1.readUnsignedByte(-1986402823), (byte)-124);
               break;
            case 6:
               Class561.findIdentifiable(Class442.method5198(-2031833410), var1.readUnsignedByte(2102714670), (byte)-51);
               break;
            default:
               throw new IllegalStateException("");
            }
         } else {
            this.method1659(var1, var3, (byte)-76);
         }
      }
   }

   boolean method1664() {
      return this.aClass452_1675 != null && this.aClass454_1676 != null;
   }

   public Object method1665() {
      return this.aClass452_1675.method5361(this, (byte)1);
   }

   static final void method1666(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2533 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 1135216093;
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method1667(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      int var4 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285];
      var0.aBool2528 = 1 == var4;
      Class526_Sub31.method9555(var0, (byte)10);
   }
}
