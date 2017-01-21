package com.jagex;

public class Class443 {
   public static final int anInt4879 = 2048;
   public static final int anInt4880 = 16383;
   public static final int anInt4881 = 8192;
   public static final int anInt4882 = 4096;
   public static final int anInt4883 = 16384;
   public static final int anInt4884 = 16383;
   public static final int anInt4885 = 14;
   public static final int anInt4886 = 1024;
   public static final int anInt4887 = 10240;
   public static final int anInt4888 = 14;
   public static final int anInt4889 = 16384;
   public static final int anInt4890 = 16384;
   public static final double aDouble4891 = 2607.5945876176133D;
   public static final int anInt4892 = 12288;
   public static final int anInt4893 = 14336;
   public static final int anInt4894 = 6144;
   public static int[] anIntArray4895 = new int[16384];
   public static int[] anIntArray4896 = new int[16384];

   public static float method5199(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         anIntArray4895[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
         anIntArray4896[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }

   Class443() throws Throwable {
      throw new Error();
   }

   public static float method5200(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
   }
}
