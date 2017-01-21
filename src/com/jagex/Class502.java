package com.jagex;

import com.jagex.Class11;
import com.jagex.Class16;
import com.jagex.Class19;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class448_Sub1;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class563;
import com.jagex.Class681;
import com.jagex.client;

public class Class502 {
   boolean aBool5641;
   boolean aBool5642;
   public static Class502 aClass502_5637 = new Class502(false, false);
   public static Class502 staticMapBuffer = new Class502(true, false);
   public static Class502 STATIC = new Class502(false, false);
   public static Class502 CONSTRUCTED = new Class502(true, false);
   static Class502 aClass502_5634 = new Class502(true, false);
   static Class502 aClass502_5638 = new Class502(true, true);
   static Class502 aClass502_5639 = new Class502(true, true);
   public static Class502 aClass502_5640 = new Class502(false, false);

   public boolean method6017(int var1) {
      return this.aBool5642;
   }

   public boolean method6018() {
      return this.aBool5642;
   }

   Class502(boolean var1, boolean var2) {
      this.aBool5641 = var1;
      this.aBool5642 = var2;
   }

   boolean method6019() {
      return this.aBool5641;
   }

   public boolean method6020() {
      return this.aBool5642;
   }

   public boolean method6021() {
      return this.aBool5642;
   }

   boolean method6022(byte var1) {
      return this.aBool5641;
   }

   static final void method6023(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var0.anInt2573 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * 406926037;
      Class526_Sub31.method9555(var0, (byte)10);
      if(-1 == var0.componentSlot * 1300712985 && !var1.aBool2458) {
         Class563.method6783(919258769 * var0.uid, -90506568);
      }

   }

   static final void method6024(Class681 var0, int var1) {
      if(-558705405 * client.anInt11038 == 0) {
         Class16.aBool177 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1;
      }
   }

   static Class19 method6025(Class11 var0, RSByteBuffer var1, int var2, int var3) {
      Class19 var4 = new Class19(var0);
      int var5 = var1.readUnsignedByte(1345495335);
      boolean var6 = (var5 & 1) != 0;
      boolean var7 = 0 != (var5 & 2);
      boolean var8 = (var5 & 4) != 0;
      boolean var9 = 0 != (var5 & 8);
      if(var6) {
         if(var2 <= 1) {
            var4.anIntArray186[0] = var1.readUnsignedShort(2034390604);
            var4.anIntArray189[0] = var1.readUnsignedShort(724640034);
         } else {
            var4.anIntArray186[0] = var1.readBigSmart((byte)-34);
            var4.anIntArray189[0] = var1.readBigSmart((byte)71);
         }

         if(-1 != -354629827 * var0.anInt107 || -1 != -2120012891 * var0.anInt104) {
            if(var2 <= 1) {
               var4.anIntArray186[1] = var1.readUnsignedShort(1159063747);
               var4.anIntArray189[1] = var1.readUnsignedShort(1074692361);
            } else {
               var4.anIntArray186[1] = var1.readBigSmart((byte)-21);
               var4.anIntArray189[1] = var1.readBigSmart((byte)-10);
            }
         }

         if(-1 != var0.anInt105 * -1541563083 || -1 != -490299957 * var0.anInt106) {
            if(var2 <= 1) {
               var4.anIntArray186[2] = var1.readUnsignedShort(1902165367);
               var4.anIntArray189[2] = var1.readUnsignedShort(23563856);
            } else {
               var4.anIntArray186[2] = var1.readBigSmart((byte)13);
               var4.anIntArray189[2] = var1.readBigSmart((byte)-43);
            }
         }
      }

      if(var7) {
         if(var2 <= 1) {
            var4.anIntArray191[0] = var1.readUnsignedShort(1563057342);
            var4.anIntArray194[0] = var1.readUnsignedShort(1980778509);
         } else {
            var4.anIntArray191[0] = var1.readBigSmart((byte)-34);
            var4.anIntArray194[0] = var1.readBigSmart((byte)-69);
         }

         if(2061744057 * var0.anInt81 != -1 || -1 != 1299296681 * var0.anInt97) {
            if(var2 <= 1) {
               var4.anIntArray191[1] = var1.readUnsignedShort(1235226364);
               var4.anIntArray194[1] = var1.readUnsignedShort(1983419248);
            } else {
               var4.anIntArray191[1] = var1.readBigSmart((byte)38);
               var4.anIntArray194[1] = var1.readBigSmart((byte)-96);
            }
         }
      }

      int var10;
      int[] var11;
      int var12;
      if(var8) {
         var10 = var1.readUnsignedShort(138785467);
         var11 = new int[]{var10 & 15, var10 >> 4 & 15, var10 >> 8 & 15, var10 >> 12 & 15};

         for(var12 = 0; var12 < 4; ++var12) {
            if(15 != var11[var12]) {
               var4.aShortArray195[var11[var12]] = (short)var1.readUnsignedShort(2132179211);
            }
         }
      }

      if(var9) {
         var10 = var1.readUnsignedByte(-749341633);
         var11 = new int[]{var10 & 15, var10 >> 4 & 15};

         for(var12 = 0; var12 < 2; ++var12) {
            if(15 != var11[var12]) {
               var4.aShortArray196[var11[var12]] = (short)var1.readUnsignedShort(1478410270);
            }
         }
      }

      return var4;
   }

   static final void method6026(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -370970461)).anInt116 * 1095415197 == 1?1:0;
   }
}
