package com.jagex;

import com.jagex.Class339;

public class Class692 {
   static int[] anIntArray8701;
   static byte[][][] aByteArrayArrayArray8702;
   public static int anInt8703;
   static int anInt8695 = 0;
   static int anInt8696 = 0;
   static int anInt8700 = 0;
   static byte[][] aByteArrayArray8698 = new byte[1000][];
   static byte[][] aByteArrayArray8699 = new byte[250][];
   static byte[][] aByteArrayArray8697 = new byte[50][];

   public static synchronized byte[] method8103(int var0) {
      return method8104(var0, false, -1098295923);
   }

   public static synchronized byte[] method8104(int var0, boolean var1, int var2) {
      byte[] var5;
      if((100 == var0 || var0 < 100 && var1) && 380103485 * anInt8695 > 0) {
         var5 = aByteArrayArray8698[(anInt8695 -= -494156779) * 380103485];
         aByteArrayArray8698[380103485 * anInt8695] = null;
         return var5;
      } else if((5000 == var0 || var0 < 5000 && var1) && anInt8696 * -1670995031 > 0) {
         var5 = aByteArrayArray8699[(anInt8696 -= -612061031) * -1670995031];
         aByteArrayArray8699[anInt8696 * -1670995031] = null;
         return var5;
      } else if((30000 == var0 || var0 < 30000 && var1) && -435349087 * anInt8700 > 0) {
         var5 = aByteArrayArray8697[(anInt8700 -= 1869154913) * -435349087];
         aByteArrayArray8697[-435349087 * anInt8700] = null;
         return var5;
      } else {
         int var3;
         if(aByteArrayArrayArray8702 != null) {
            for(var3 = 0; var3 < Class339.anIntArray3530.length; ++var3) {
               if((var0 == Class339.anIntArray3530[var3] || var0 < Class339.anIntArray3530[var3] && var1) && anIntArray8701[var3] > 0) {
                  byte[] var4 = aByteArrayArrayArray8702[var3][--anIntArray8701[var3]];
                  aByteArrayArrayArray8702[var3][anIntArray8701[var3]] = null;
                  return var4;
               }
            }
         }

         if(var1 && null != Class339.anIntArray3530) {
            for(var3 = 0; var3 < Class339.anIntArray3530.length; ++var3) {
               if(var0 <= Class339.anIntArray3530[var3] && anIntArray8701[var3] < aByteArrayArrayArray8702[var3].length) {
                  return new byte[Class339.anIntArray3530[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }

   Class692() throws Throwable {
      throw new Error();
   }

   public static synchronized byte[] method8105(int var0) {
      return method8104(var0, false, -1098295923);
   }

   public static synchronized void method8106(byte[] var0, byte var1) {
      if(100 == var0.length && 380103485 * anInt8695 < 1000) {
         aByteArrayArray8698[(anInt8695 += -494156779) * 380103485 - 1] = var0;
      } else if(var0.length == 5000 && -1670995031 * anInt8696 < 250) {
         aByteArrayArray8699[(anInt8696 += -612061031) * -1670995031 - 1] = var0;
      } else if(var0.length == 30000 && -435349087 * anInt8700 < 50) {
         aByteArrayArray8697[(anInt8700 += 1869154913) * -435349087 - 1] = var0;
      } else {
         if(null != aByteArrayArrayArray8702) {
            for(int var2 = 0; var2 < Class339.anIntArray3530.length; ++var2) {
               if(var0.length == Class339.anIntArray3530[var2] && anIntArray8701[var2] < aByteArrayArrayArray8702[var2].length) {
                  aByteArrayArrayArray8702[var2][anIntArray8701[var2]++] = var0;
                  return;
               }
            }
         }

      }
   }

   public static synchronized byte[] method8107(int var0, int var1) {
      return method8104(var0, false, -1098295923);
   }

   public static synchronized byte[] method8108(int var0) {
      return method8104(var0, false, -1098295923);
   }

   static boolean method8109(int var0, int var1) {
      return 16 == var0 || 0 == var0 || var0 == 8 || 9 == var0;
   }

   public static int method8110(int var0, int var1) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }
}
