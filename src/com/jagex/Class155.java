package com.jagex;

public class Class155 {
   static float[] aFloatArray1727 = new float[16384];
   static float[] aFloatArray1726 = new float[16384];

   Class155() throws Throwable {
      throw new Error();
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         aFloatArray1727[var2] = (float)Math.sin((double)var2 * var0);
         aFloatArray1726[var2] = (float)Math.cos((double)var2 * var0);
      }

   }
}
