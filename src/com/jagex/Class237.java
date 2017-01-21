package com.jagex;

import com.jagex.Class162;
import com.jagex.Class255;
import com.jagex.Class411;
import com.jagex.Class492;
import com.jagex.Class504;
import com.jagex.Class53;
import com.jagex.Class585;

public class Class237 {
   public int anInt2393;
   public int anInt2392;
   public int[] anIntArray2391;
   public int[] anIntArray2394;
   public Class162 aClass162_2395;
   int anInt2396;

   public boolean method3283(int var1, int var2) {
      if(var2 >= 0 && var2 < this.anIntArray2394.length) {
         int var3 = this.anIntArray2394[var2];
         if(var1 >= var3 && var1 <= var3 + this.anIntArray2391[var2]) {
            return true;
         }
      }

      return false;
   }

   public boolean method3284(int var1, int var2, byte var3) {
      if(var2 >= 0 && var2 < this.anIntArray2394.length) {
         int var4 = this.anIntArray2394[var2];
         if(var1 >= var4 && var1 <= var4 + this.anIntArray2391[var2]) {
            return true;
         }
      }

      return false;
   }

   Class237(int var1, int var2, int[] var3, int[] var4, Class162 var5, int var6) {
      this.anInt2393 = var1 * 957303905;
      this.anInt2392 = 186199469 * var2;
      this.anIntArray2391 = var3;
      this.anIntArray2394 = var4;
      this.aClass162_2395 = var5;
      this.anInt2396 = 981553627 * var6;
   }

   public boolean method3285(int var1, int var2) {
      if(var2 >= 0 && var2 < this.anIntArray2394.length) {
         int var3 = this.anIntArray2394[var2];
         if(var1 >= var3 && var1 <= var3 + this.anIntArray2391[var2]) {
            return true;
         }
      }

      return false;
   }

   public static void method3286(int var0) {
      if(Class585.method6988((byte)-3) != Class504.aClass504_5648) {
         try {
            String var1 = Class492.anApplet5526.getParameter(Class411.aClass411_4427.aString4408);
            int var2 = (int)(Class255.time((byte)24) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            Class53.method967(Class492.anApplet5526, "document.cookie=\"" + var3 + "\"", -1316944826);
         } catch (Throwable var4) {
            ;
         }

      }
   }
}
