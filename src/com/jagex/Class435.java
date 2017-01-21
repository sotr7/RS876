package com.jagex;

public class Class435 {
   static float[] aFloatArray4849 = new float[16384];
   static float[] aFloatArray4848 = new float[16384];

   Class435() throws Throwable {
      throw new Error();
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         aFloatArray4849[var2] = (float)Math.sin((double)var2 * var0);
         aFloatArray4848[var2] = (float)Math.cos((double)var2 * var0);
      }

   }
}
