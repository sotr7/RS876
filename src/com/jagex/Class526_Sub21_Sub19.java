package com.jagex;

import com.jagex.Class20;
import com.jagex.Class329_Sub3_Sub3;
import com.jagex.Class452;
import com.jagex.Class481;
import com.jagex.Class508;
import com.jagex.Class526_Sub21;
import com.jagex.Class526_Sub25;
import com.jagex.RSByteBuffer;
import com.jagex.Class561;
import com.jagex.Class581;
import com.jagex.Class692;
import com.jagex.Interface17;

public class Class526_Sub21_Sub19 extends Class526_Sub21 {
   public Class581 aClass581_11863;
   public int anInt11865;
   public int anInt11869;
   public int anInt11864;
   public int anInt11862;
   public int anInt11857;
   public int anInt11867;
   public Class20[] aClass20Array11868;
   public String aString11858;
   public Class508[] aClass508Array11859;
   public Object[] anObjectArray11861;
   public int[] anIntArray11860;
   Interface17 anInterface17_11866;

   int method10732(RSByteBuffer var1, byte var2) {
      var1.pos = 801976415 * (var1.buffer.length - 2);
      int var3 = var1.readUnsignedShort(2085394768);
      int var4 = var1.buffer.length - 2 - var3 - 16;
      var1.pos = var4 * 801976415;
      int var5 = var1.readInt((byte)5);
      this.anInt11865 = var1.readUnsignedShort(1864216980) * -891213711;
      this.anInt11869 = var1.readUnsignedShort(526903416) * -286211077;
      this.anInt11864 = var1.readUnsignedShort(521896170) * -1971615597;
      this.anInt11862 = var1.readUnsignedShort(1862529018) * -195609411;
      this.anInt11857 = var1.readUnsignedShort(2062412939) * 951838205;
      this.anInt11867 = var1.readUnsignedShort(129117868) * -401909401;
      int var6 = var1.readUnsignedByte(295278110);
      if(var6 > 0) {
         this.aClass20Array11868 = new Class20[var6];

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var1.readUnsignedShort(2017759929);
            Class20 var9 = new Class20(Class692.method8110(var8, -1919180583));
            this.aClass20Array11868[var7] = var9;

            while(var8-- > 0) {
               int var10 = var1.readInt((byte)5);
               int var11 = var1.readInt((byte)5);
               var9.put(new Class526_Sub25(var11), (long)var10);
            }
         }
      }

      var1.pos = 0;
      this.aString11858 = var1.method9700((byte)2);
      this.aClass508Array11859 = new Class508[var5];
      return var4;
   }

   void method10733(RSByteBuffer var1, int var2, Class508 var3, int var4) {
      int var5 = this.aClass508Array11859.length;
      if(var3 != Class508.aClass508_5705 && var3 != Class508.aClass508_6309) {
         if(var3 == Class508.aClass508_5709) {
            Class481 var8 = (Class481)Class561.findIdentifiable(Class481.method5758((byte)12), var1.readUnsignedByte(-1766741513), (byte)-91);
            switch(-1546867669 * var8.anInt5462) {
            case 0:
               if(this.anObjectArray11861 == null) {
                  this.anObjectArray11861 = new Object[var5];
               }

               var3 = Class508.aClass508_5729;
               this.anObjectArray11861[var2] = Long.valueOf(var1.method9663(2137183382));
               break;
            case 1:
            case 3:
            default:
               throw new RuntimeException();
            case 2:
               if(this.anObjectArray11861 == null) {
                  this.anObjectArray11861 = new Object[var5];
               }

               this.anObjectArray11861[var2] = var1.readString(985945859).intern();
               break;
            case 4:
               if(this.anIntArray11860 == null) {
                  this.anIntArray11860 = new int[var5];
               }

               var3 = Class508.aClass508_6354;
               this.anIntArray11860[var2] = var1.readInt((byte)5);
            }
         } else if(Class508.aClass508_6566 != var3 && var3 != Class508.aClass508_6065) {
            if(null == this.anIntArray11860) {
               this.anIntArray11860 = new int[var5];
            }

            if(null != var3 && var3.aBool6976) {
               this.anIntArray11860[var2] = var1.readInt((byte)5);
            } else {
               this.anIntArray11860[var2] = var1.readUnsignedByte(-820090738);
            }
         } else {
            int var9 = var1.readUnsignedShort(466771815);
            if(null == this.anObjectArray11861) {
               this.anObjectArray11861 = new Object[var5];
            }

            this.anObjectArray11861[var2] = this.anInterface17_11866.method109(var9, '\uff00');
            if(this.anIntArray11860 == null) {
               this.anIntArray11860 = new int[var5];
            }

            this.anIntArray11860[var2] = var1.readUnsignedByte(190623439);
         }
      } else {
         Class452 var6 = (Class452)Class561.findIdentifiable(Class452.method5363((byte)5), var1.readUnsignedByte(-151153917), (byte)-61);
         int var7 = var1.readUnsignedShort(830454568);
         if(this.anObjectArray11861 == null) {
            this.anObjectArray11861 = new Object[var5];
         }

         this.anObjectArray11861[var2] = this.anInterface17_11866.method106(var6, var7, -629577418);
         if(null == this.anIntArray11860) {
            this.anIntArray11860 = new int[var5];
         }

         this.anIntArray11860[var2] = var1.readUnsignedByte(-255062470);
      }

      this.aClass508Array11859[var2] = var3;
   }

   Class508 method10734(RSByteBuffer var1, Class508[] var2, int var3) {
      int var4 = var1.readUnsignedShort(2039729451);
      if(var4 >= 0 && var4 < var2.length) {
         Class508 var5 = var2[var4];
         return var5;
      } else {
         throw new RuntimeException("");
      }
   }

   public Class526_Sub21_Sub19(RSByteBuffer var1, Interface17 var2) {
      this.anInterface17_11866 = var2;
      int var3 = this.method10732(var1, (byte)8);
      int var4 = 0;

      for(Class508[] var5 = Class329_Sub3_Sub3.method10497((byte)-61); var1.pos * 301018015 < var3; ++var4) {
         Class508 var6 = this.method10734(var1, var5, 1647733342);
         this.method10733(var1, var4, var6, 963744279);
      }

   }
}
