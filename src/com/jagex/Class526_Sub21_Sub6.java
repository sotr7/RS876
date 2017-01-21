package com.jagex;

import com.jagex.Class262;
import com.jagex.Class31;
import com.jagex.Class448;
import com.jagex.Class526_Sub21;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;
import com.jagex.Class700;

public class Class526_Sub21_Sub6 extends Class526_Sub21 {
   String aString11660;
   String aString11650;
   String aString11652;
   int anInt11651;
   int anInt11659;
   int anInt11657;
   long aLong11653;
   int anInt11654;
   int anInt11655;
   boolean aBool11661;
   boolean aBool11656;
   long aLong11658;
   boolean aBool11649;

   public long method10568(short var1) {
      return this.aLong11653 * 7424828564598113295L;
   }

   public long method10569() {
      return this.aLong11658 * -3207281156750170469L;
   }

   public long method10570() {
      return this.aLong11653 * 7424828564598113295L;
   }

   Class526_Sub21_Sub6(String var1, String var2, int var3, int var4, int var5, long var6, int var8, int var9, boolean var10, boolean var11, long var12, boolean var14) {
      this.aString11650 = var2;
      this.aString11652 = var1;
      this.anInt11651 = var3 * -848669021;
      this.anInt11659 = 653592333 * var4;
      this.anInt11657 = 2051847049 * var5;
      this.aLong11653 = 1292291883977878255L * var6;
      this.anInt11654 = var8 * 47043695;
      this.anInt11655 = -1347641541 * var9;
      this.aBool11661 = var10;
      this.aBool11656 = var11;
      this.aLong11658 = -3086231605957210221L * var12;
      this.aBool11649 = var14;
   }

   public long method10571(byte var1) {
      return this.aLong11658 * -3207281156750170469L;
   }

   public long method10572() {
      return this.aLong11658 * -3207281156750170469L;
   }

   static final void method10573(Class681 var0, int var1) {
      Class700.method8172(-1730576285);
      Class31.aBool302 = false;
   }

   static String method10574(RSByteBuffer var0, int var1, int var2) {
      try {
         int var3 = var0.readSmart(-982712522);
         if(var3 > var1) {
            var3 = var1;
         }

         byte[] var4 = new byte[var3];
         var0.pos += Class262.aClass265_2965.method3554(var0.buffer, var0.pos * 301018015, var4, 0, var3, -1072331930) * 801976415;
         String var5 = Class448.method5334(var4, 0, var3, -1683579870);
         return var5;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }
}
