package com.jagex;

import com.jagex.InterfaceDef;
import com.jagex.Class305;
import com.jagex.Class31;
import com.jagex.Class456;
import com.jagex.Class467;
import com.jagex.Class525_Sub1;
import com.jagex.Class526;
import com.jagex.Class535;
import com.jagex.Class565;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.client;
import java.util.Random;

public class Class33 {
   static final int anInt364 = 12;
   static long aLong368;
   static Class467 aClass467_367;
   public static int[] anIntArray365;
   public static int anInt363;
   public static int[] anIntArray366;
   static int anInt362;

   static final void method804(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2573 * -1244891523;
   }

   static {
      aClass467_367 = new Class467(16, Class456.aClass456_5158);
   }

   public static byte[] method805(int var0, int var1) {
      byte[] var2 = (byte[])((byte[])aClass467_367.method5593(Integer.valueOf(var0), 314888509));
      if(null == var2) {
         var2 = new byte[512];
         Random var3 = new Random((long)var0);

         int var4;
         for(var4 = 0; var4 < 255; ++var4) {
            var2[var4] = (byte)var4;
         }

         for(var4 = 0; var4 < 255; ++var4) {
            int var5 = 255 - var4;
            int var6 = Class535.method6402(var3, var5, (short)23031);
            byte var7 = var2[var6];
            var2[var6] = var2[var5];
            var2[var5] = var2[511 - var4] = var7;
         }

         aClass467_367.method5594(Integer.valueOf(var0), var2, 450844169);
      }

      return var2;
   }

   public static void method806(int var0, int var1) {
      int var2;
      if(-1119729145 * anInt363 != var0) {
         anIntArray365 = new int[var0];

         for(var2 = 0; var2 < var0; ++var2) {
            anIntArray365[var2] = (var2 << 12) / var0;
         }

         anInt363 = -410451017 * var0;
      }

      if(var1 != -8875913 * anInt362) {
         if(var1 != -1119729145 * anInt363) {
            anIntArray366 = new int[var1];

            for(var2 = 0; var2 < var1; ++var2) {
               anIntArray366[var2] = (var2 << 12) / var1;
            }
         } else {
            anIntArray366 = anIntArray365;
         }

         anInt362 = 1142049095 * var1;
      }

   }

   public static void method807(int var0, int var1) {
      int var2;
      if(-1119729145 * anInt363 != var0) {
         anIntArray365 = new int[var0];

         for(var2 = 0; var2 < var0; ++var2) {
            anIntArray365[var2] = (var2 << 12) / var0;
         }

         anInt363 = -410451017 * var0;
      }

      if(var1 != -8875913 * anInt362) {
         if(var1 != -1119729145 * anInt363) {
            anIntArray366 = new int[var1];

            for(var2 = 0; var2 < var1; ++var2) {
               anIntArray366[var2] = (var2 << 12) / var1;
            }
         } else {
            anIntArray366 = anIntArray365;
         }

         anInt362 = 1142049095 * var1;
      }

   }

   public static byte[] method808(int var0) {
      byte[] var1 = (byte[])((byte[])aClass467_367.method5593(Integer.valueOf(var0), 314888509));
      if(null == var1) {
         var1 = new byte[512];
         Random var2 = new Random((long)var0);

         int var3;
         for(var3 = 0; var3 < 255; ++var3) {
            var1[var3] = (byte)var3;
         }

         for(var3 = 0; var3 < 255; ++var3) {
            int var4 = 255 - var3;
            int var5 = Class535.method6402(var2, var4, (short)18567);
            byte var6 = var1[var5];
            var1[var5] = var1[var4];
            var1[var4] = var1[511 - var3] = var6;
         }

         aClass467_367.method5594(Integer.valueOf(var0), var1, 1851606623);
      }

      return var1;
   }

   Class33() throws Throwable {
      throw new Error();
   }

   public static void method809(int var0, int var1, int var2) {
      int var3;
      if(-1119729145 * anInt363 != var0) {
         anIntArray365 = new int[var0];

         for(var3 = 0; var3 < var0; ++var3) {
            anIntArray365[var3] = (var3 << 12) / var0;
         }

         anInt363 = -410451017 * var0;
      }

      if(var1 != -8875913 * anInt362) {
         if(var1 != -1119729145 * anInt363) {
            anIntArray366 = new int[var1];

            for(var3 = 0; var3 < var1; ++var3) {
               anIntArray366[var3] = (var3 << 12) / var1;
            }
         } else {
            anIntArray366 = anIntArray365;
         }

         anInt362 = 1142049095 * var1;
      }

   }

   public static byte[] method810(int var0) {
      byte[] var1 = (byte[])((byte[])aClass467_367.method5593(Integer.valueOf(var0), 314888509));
      if(null == var1) {
         var1 = new byte[512];
         Random var2 = new Random((long)var0);

         int var3;
         for(var3 = 0; var3 < 255; ++var3) {
            var1[var3] = (byte)var3;
         }

         for(var3 = 0; var3 < 255; ++var3) {
            int var4 = 255 - var3;
            int var5 = Class535.method6402(var2, var4, (short)20496);
            byte var6 = var1[var5];
            var1[var5] = var1[var4];
            var1[var4] = var1[511 - var3] = var6;
         }

         aClass467_367.method5594(Integer.valueOf(var0), var1, 803676488);
      }

      return var1;
   }

   public static byte[] method811(int var0) {
      byte[] var1 = (byte[])((byte[])aClass467_367.method5593(Integer.valueOf(var0), 314888509));
      if(null == var1) {
         var1 = new byte[512];
         Random var2 = new Random((long)var0);

         int var3;
         for(var3 = 0; var3 < 255; ++var3) {
            var1[var3] = (byte)var3;
         }

         for(var3 = 0; var3 < 255; ++var3) {
            int var4 = 255 - var3;
            int var5 = Class535.method6402(var2, var4, (short)26716);
            byte var6 = var1[var5];
            var1[var5] = var1[var4];
            var1[var4] = var1[511 - var3] = var6;
         }

         aClass467_367.method5594(Integer.valueOf(var0), var1, 536833380);
      }

      return var1;
   }

   public static final void method812(InterfaceDef var0, int var1, int var2, short var3) {
      if(null == client.aClass245_11003 && !Class31.aBool291) {
         if(null != var0 && Class526.method6337(var0, (byte)123)) {
            client.aClass245_11003 = var0;
            client.aClass245_11198 = Class305.method4025(var0, (byte)-114);
            client.anInt11199 = -607800915 * var1;
            client.anInt11200 = var2 * 1475037037;
            Class565.anInt7609 = 0;
            client.aBool11047 = false;
         }
      }
   }

   public static void method813(int var0, int var1, short var2) {
      Class525_Sub1.anInt10710 = -608366201 * (var0 - Class525_Sub1.anInt7107);
      Class525_Sub1.anInt10711 = (var1 - Class525_Sub1.anInt7150) * 805427121;
   }

   static final void method814(Class681 var0, int var1) {
      throw new RuntimeException("");
   }
}
