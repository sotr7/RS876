package com.jagex;

import com.jagex.Class526_Sub11;
import com.jagex.RSByteBuffer;

public class Class183 {
   static final int anInt2108 = 2;
   static final int anInt2113 = 1;
   static final int anInt2115 = 2;
   Class526_Sub11 aClass526_Sub11_2102 = null;
   int anInt2103 = 0;
   boolean aBool2110 = false;
   boolean aBool2111 = false;
   boolean aBool2112 = false;
   short[] aShortArray2104;
   short[] aShortArray2100;
   short[] aShortArray2106;
   short[] aShortArray2107;
   short[] aShortArray2098;
   byte[] aByteArray2109;
   static short[] aShortArray2105 = new short[500];
   static short[] aShortArray2114 = new short[500];
   static short[] aShortArray2099 = new short[500];
   static short[] aShortArray2097 = new short[500];
   static short[] aShortArray2096 = new short[500];
   static byte[] aByteArray2101 = new byte[500];

   Class183(byte[] var1, Class526_Sub11 var2) {
      this.aClass526_Sub11_2102 = var2;

      try {
         RSByteBuffer var3 = new RSByteBuffer(var1);
         RSByteBuffer var4 = new RSByteBuffer(var1);
         int var5 = var3.readUnsignedByte(698129992);
         var3.pos += 1603952830;
         int var6 = var3.readUnsignedShort(464975484);
         int var7 = 0;
         int var8 = -1;
         int var9 = -1;
         var4.pos = (var3.pos * 301018015 + var6) * 801976415;

         int var10;
         for(var10 = 0; var10 < var6; ++var10) {
            int var11 = this.aClass526_Sub11_2102.anIntArray10426[var10];
            if(var11 == 0) {
               var8 = var10;
            }

            int var12 = var3.readUnsignedByte(656352910);
            if(var12 > 0) {
               if(var11 == 0) {
                  var9 = var10;
               }

               aShortArray2105[var7] = (short)var10;
               short var13 = 0;
               if(var11 == 3 || var11 == 10) {
                  var13 = 128;
               }

               if(var5 >= 2 && var11 == 7) {
                  if((var12 & 1) != 0) {
                     aShortArray2114[var7] = (short)var4.readUnsignedSmart(1351495269);
                     var4.readUnsignedSmart(1943241159);
                  } else {
                     aShortArray2114[var7] = var13;
                  }

                  if((var12 & 2) != 0) {
                     aShortArray2099[var7] = (short)var4.readUnsignedSmart(768857063);
                     var4.readUnsignedSmart(1652399556);
                  } else {
                     aShortArray2099[var7] = var13;
                  }

                  if((var12 & 4) != 0) {
                     aShortArray2097[var7] = (short)var4.readUnsignedSmart(571450049);
                     var4.readUnsignedSmart(971546913);
                  } else {
                     aShortArray2097[var7] = var13;
                  }
               } else {
                  if((var12 & 1) != 0) {
                     aShortArray2114[var7] = (short)var4.readUnsignedSmart(1523124718);
                  } else {
                     aShortArray2114[var7] = var13;
                  }

                  if((var12 & 2) != 0) {
                     aShortArray2099[var7] = (short)var4.readUnsignedSmart(115638818);
                  } else {
                     aShortArray2099[var7] = var13;
                  }

                  if((var12 & 4) != 0) {
                     aShortArray2097[var7] = (short)var4.readUnsignedSmart(880796257);
                  } else {
                     aShortArray2097[var7] = var13;
                  }
               }

               aByteArray2101[var7] = (byte)(var12 >>> 3 & 3);
               if(var11 == 2 || var11 == 9) {
                  aShortArray2114[var7] = (short)(aShortArray2114[var7] << 2 & 16383);
                  aShortArray2099[var7] = (short)(aShortArray2099[var7] << 2 & 16383);
                  aShortArray2097[var7] = (short)(aShortArray2097[var7] << 2 & 16383);
               }

               aShortArray2096[var7] = -1;
               if(var11 != 1 && var11 != 2 && var11 != 3) {
                  if(var11 == 5) {
                     this.aBool2110 = true;
                  } else if(var11 == 7) {
                     this.aBool2111 = true;
                  } else if(var11 == 9 || var11 == 10 || var11 == 8) {
                     this.aBool2112 = true;
                  }
               } else if(var8 > var9) {
                  aShortArray2096[var7] = (short)var8;
                  var9 = var8;
               }

               ++var7;
            }
         }

         if(var4.pos * 301018015 != var1.length) {
            throw new RuntimeException();
         }

         this.anInt2103 = var7;
         this.aShortArray2104 = new short[var7];
         this.aShortArray2100 = new short[var7];
         this.aShortArray2106 = new short[var7];
         this.aShortArray2107 = new short[var7];
         this.aShortArray2098 = new short[var7];
         this.aByteArray2109 = new byte[var7];

         for(var10 = 0; var10 < var7; ++var10) {
            this.aShortArray2104[var10] = aShortArray2105[var10];
            this.aShortArray2100[var10] = aShortArray2114[var10];
            this.aShortArray2106[var10] = aShortArray2099[var10];
            this.aShortArray2107[var10] = aShortArray2097[var10];
            this.aShortArray2098[var10] = aShortArray2096[var10];
            this.aByteArray2109[var10] = aByteArray2101[var10];
         }
      } catch (Exception var14) {
         this.anInt2103 = 0;
         this.aBool2110 = false;
         this.aBool2111 = false;
      }

   }
}
