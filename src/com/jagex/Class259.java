package com.jagex;

import com.jagex.Class195;
import com.jagex.Class261;
import com.jagex.Class287;
import com.jagex.Class32;
import com.jagex.Class37_Sub1;
import com.jagex.Class609;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class708;
import java.awt.Frame;

public class Class259 {
   int anInt2836;
   static Class259 aClass259_2832 = new Class259(0);
   static Class259 aClass259_2831 = new Class259(1);
   static Class259 aClass259_2833 = new Class259(2);
   public static Class259 aClass259_2830 = new Class259(3);
   public static Class259 aClass259_2834 = new Class259(4);
   public static Class259 aClass259_2835 = new Class259(5);

   Class259(int var1) {
      this.anInt2836 = var1 * -1701472197;
   }

   static final void method3517(Class681 var0, short var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class32.anInt354 * 439217935;
   }

   public static int method3518(byte var0) {
      Class37_Sub1 var1 = Class609.method7170((byte)-59);
      Class287.method3804(var1, 766011677);
      return var1.method843(-19000540);
   }

   static boolean method3519(int var0, int var1) {
      return var0 != 3 && var0 != 4 && 5 != var0 && var0 != 6 && 1001 != var0 && 1002 != var0?2 == var0:true;
   }

   static final String[] method3520(String[] var0, int var1) {
      String[] var2 = new String[5];

      for(int var3 = 0; var3 < 5; ++var3) {
         var2[var3] = var3 + " ";
         if(null != var0 && var0[var3] != null) {
            var2[var3] = var2[var3] + var0[var3];
         }
      }

      return var2;
   }

   static final void method3521(Class681 var0, int var1) {
      Class195.aClass292_Sub1_2182.method3909(-1143587617);
   }

   public static Frame method3522(Class690 var0, int var1, int var2, int var3, int var4, int var5) {
      if(var3 == 0) {
         Class708[] var6 = Class261.method3538(var0, 1920018602);
         if(var6 == null) {
            return null;
         }

         boolean var7 = false;

         for(int var8 = 0; var8 < var6.length; ++var8) {
            if(14758297 * var6[var8].anInt8840 == var1 && var6[var8].anInt8839 * -1823144195 == var2 && (0 == var4 || var4 == -390377579 * var6[var8].anInt8841) && (!var7 || -1181563247 * var6[var8].anInt8838 > var3)) {
               var3 = -1181563247 * var6[var8].anInt8838;
               var7 = true;
            }
         }

         if(!var7) {
            return null;
         }
      }

      Frame var9 = new Frame("Jagex Full Screen");
      var9.setResizable(false);
      var0.method8097(var9, var1, var2, var3, var4, 308640873);
      return var9;
   }
}
