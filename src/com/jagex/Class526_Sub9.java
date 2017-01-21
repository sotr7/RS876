package com.jagex;

import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class339;
import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class662_Sub1;
import com.jagex.Class681;
import com.jagex.Class73;
import java.util.BitSet;

public class Class526_Sub9 extends Class526 {
   boolean aBool10405;
   boolean aBool10401 = true;
   long aLong10406;
   public String aString10403 = null;
   public byte aByte10408;
   public byte aByte10407;
   public int anInt10400 = 0;
   public Class339[] aClass339Array10402;
   int[] anIntArray10404;

   void method9343(RSByteBuffer var1) {
      int var2 = var1.readUnsignedByte(1364805716);
      if((var2 & 1) != 0) {
         this.aBool10405 = true;
      }

      if(0 != (var2 & 2)) {
         this.aBool10401 = true;
      }

      int var3 = 2;
      if(0 != (var2 & 4)) {
         var3 = var1.readUnsignedByte(783083111);
      }

      this.aLong7156 = var1.method9663(918957651) * -7608595443915499217L;
      this.aLong10406 = var1.method9663(1785269425) * -8971307007232876929L;
      this.aString10403 = var1.readString(1536147954);
      var1.readUnsignedByte(-2092509454);
      this.aByte10408 = var1.readByte((byte)106);
      this.aByte10407 = var1.readByte((byte)114);
      this.anInt10400 = var1.readUnsignedShort(1014476209) * -1976692053;
      if(this.anInt10400 * 1763792899 > 0) {
         this.aClass339Array10402 = new Class339[1763792899 * this.anInt10400];

         for(int var4 = 0; var4 < this.anInt10400 * 1763792899; ++var4) {
            Class339 var5 = new Class339();
            if(this.aBool10405) {
               var1.method9663(362380674);
            }

            if(this.aBool10401) {
               var5.aString3528 = var1.readString(1075039845);
            }

            var5.aByte3526 = var1.readByte((byte)107);
            var5.anInt3527 = var1.readUnsignedShort(73579725) * -1445041571;
            if(var3 >= 3) {
               var1.readUnsignedByte(641065863);
            }

            this.aClass339Array10402[var4] = var5;
         }
      }

   }

   void method9344(Class339 var1, int var2) {
      if(null == this.aClass339Array10402 || 1763792899 * this.anInt10400 >= this.aClass339Array10402.length) {
         this.method9354(5 + 1763792899 * this.anInt10400, 107556864);
      }

      this.aClass339Array10402[(this.anInt10400 += -1976692053) * 1763792899 - 1] = var1;
      this.anIntArray10404 = null;
   }

   void method9345(int var1, int var2) {
      this.anInt10400 -= -1976692053;
      if(0 == this.anInt10400 * 1763792899) {
         this.aClass339Array10402 = null;
      } else {
         System.arraycopy(this.aClass339Array10402, 1 + var1, this.aClass339Array10402, var1, this.anInt10400 * 1763792899 - var1);
      }

      this.anIntArray10404 = null;
   }

   public int method9346(String var1, byte var2) {
      for(int var3 = 0; var3 < 1763792899 * this.anInt10400; ++var3) {
         if(this.aClass339Array10402[var3].aString3528.equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return -1;
   }

   void method9347(RSByteBuffer var1, int var2) {
      int var3 = var1.readUnsignedByte(2053528088);
      if((var3 & 1) != 0) {
         this.aBool10405 = true;
      }

      if(0 != (var3 & 2)) {
         this.aBool10401 = true;
      }

      int var4 = 2;
      if(0 != (var3 & 4)) {
         var4 = var1.readUnsignedByte(2068990421);
      }

      this.aLong7156 = var1.method9663(1163731963) * -7608595443915499217L;
      this.aLong10406 = var1.method9663(236860313) * -8971307007232876929L;
      this.aString10403 = var1.readString(-1002803442);
      var1.readUnsignedByte(-1130002025);
      this.aByte10408 = var1.readByte((byte)83);
      this.aByte10407 = var1.readByte((byte)84);
      this.anInt10400 = var1.readUnsignedShort(1966439062) * -1976692053;
      if(this.anInt10400 * 1763792899 > 0) {
         this.aClass339Array10402 = new Class339[1763792899 * this.anInt10400];

         for(int var5 = 0; var5 < this.anInt10400 * 1763792899; ++var5) {
            Class339 var6 = new Class339();
            if(this.aBool10405) {
               var1.method9663(1318638776);
            }

            if(this.aBool10401) {
               var6.aString3528 = var1.readString(1417900579);
            }

            var6.aByte3526 = var1.readByte((byte)14);
            var6.anInt3527 = var1.readUnsignedShort(283585535) * -1445041571;
            if(var4 >= 3) {
               var1.readUnsignedByte(-1306374536);
            }

            this.aClass339Array10402[var5] = var6;
         }
      }

   }

   public int[] method9348(int var1) {
      if(this.anIntArray10404 == null) {
         String[] var2 = new String[this.anInt10400 * 1763792899];
         this.anIntArray10404 = new int[1763792899 * this.anInt10400];

         for(int var3 = 0; var3 < this.anInt10400 * 1763792899; this.anIntArray10404[var3] = var3++) {
            var2[var3] = this.aClass339Array10402[var3].aString3528;
         }

         Class662_Sub1.method9941(var2, this.anIntArray10404, -2043891195);
      }

      return this.anIntArray10404;
   }

   void method9349(int var1) {
      if(null != this.aClass339Array10402) {
         System.arraycopy(this.aClass339Array10402, 0, this.aClass339Array10402 = new Class339[var1], 0, 1763792899 * this.anInt10400);
      } else {
         this.aClass339Array10402 = new Class339[var1];
      }

   }

   void method9350(int var1) {
      if(null != this.aClass339Array10402) {
         System.arraycopy(this.aClass339Array10402, 0, this.aClass339Array10402 = new Class339[var1], 0, 1763792899 * this.anInt10400);
      } else {
         this.aClass339Array10402 = new Class339[var1];
      }

   }

   void method9351(int var1) {
      if(null != this.aClass339Array10402) {
         System.arraycopy(this.aClass339Array10402, 0, this.aClass339Array10402 = new Class339[var1], 0, 1763792899 * this.anInt10400);
      } else {
         this.aClass339Array10402 = new Class339[var1];
      }

   }

   static {
      new BitSet(65536);
   }

   public int[] method9352() {
      if(this.anIntArray10404 == null) {
         String[] var1 = new String[this.anInt10400 * 1763792899];
         this.anIntArray10404 = new int[1763792899 * this.anInt10400];

         for(int var2 = 0; var2 < this.anInt10400 * 1763792899; this.anIntArray10404[var2] = var2++) {
            var1[var2] = this.aClass339Array10402[var2].aString3528;
         }

         Class662_Sub1.method9941(var1, this.anIntArray10404, -1400231272);
      }

      return this.anIntArray10404;
   }

   void method9353(int var1) {
      this.anInt10400 -= -1976692053;
      if(0 == this.anInt10400 * 1763792899) {
         this.aClass339Array10402 = null;
      } else {
         System.arraycopy(this.aClass339Array10402, 1 + var1, this.aClass339Array10402, var1, this.anInt10400 * 1763792899 - var1);
      }

      this.anIntArray10404 = null;
   }

   void method9354(int var1, int var2) {
      if(null != this.aClass339Array10402) {
         System.arraycopy(this.aClass339Array10402, 0, this.aClass339Array10402 = new Class339[var1], 0, 1763792899 * this.anInt10400);
      } else {
         this.aClass339Array10402 = new Class339[var1];
      }

   }

   void method9355(int var1) {
      this.anInt10400 -= -1976692053;
      if(0 == this.anInt10400 * 1763792899) {
         this.aClass339Array10402 = null;
      } else {
         System.arraycopy(this.aClass339Array10402, 1 + var1, this.aClass339Array10402, var1, this.anInt10400 * 1763792899 - var1);
      }

      this.anIntArray10404 = null;
   }

   void method9356(int var1) {
      this.anInt10400 -= -1976692053;
      if(0 == this.anInt10400 * 1763792899) {
         this.aClass339Array10402 = null;
      } else {
         System.arraycopy(this.aClass339Array10402, 1 + var1, this.aClass339Array10402, var1, this.anInt10400 * 1763792899 - var1);
      }

      this.anIntArray10404 = null;
   }

   public int method9357(String var1) {
      for(int var2 = 0; var2 < 1763792899 * this.anInt10400; ++var2) {
         if(this.aClass339Array10402[var2].aString3528.equalsIgnoreCase(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public int method9358(String var1) {
      for(int var2 = 0; var2 < 1763792899 * this.anInt10400; ++var2) {
         if(this.aClass339Array10402[var2].aString3528.equalsIgnoreCase(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public Class526_Sub9(RSByteBuffer var1) {
      this.method9347(var1, 954718418);
   }

   static final void method9359(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.method3185(2133993776).getId();
   }

   public static int method9360(CharSequence var0, byte var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }

   public static void method9361(Class243 var0, InterfaceDef var1, boolean var2, byte var3) {
      Class73.method1110(var0.aClass245Array2459, var1, var2, 1970060912);
   }
}
