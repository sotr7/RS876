package com.jagex;

import com.jagex.Class10;
import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class149;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.OutFrame;
import com.jagex.Class422;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class594;
import com.jagex.Class615;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class690;
import com.jagex.Class83;
import com.jagex.client;

public class Class626 {
   Class626() throws Throwable {
      throw new Error();
   }

   static final void method7452(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      int[] var5 = Class149.method1747(var4, var2, (byte)0);
      if(var5 != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2480 = Class615.method7280(var4, var2, -540937230);
      var0.anIntArray2625 = var5;
      var0.aBool2560 = true;
   }

   static final void method7453(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      int var4 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class83 var5 = (Class83)Class10.aClass40_Sub20_62.method89(var4, -652775500);
      if(var5.method1167(-464996284)) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.method3349(var4, var5.aString842, -2119531808);
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.method3352(var4, var5.anInt843 * 1040538721, -2072598209);
      }

   }

   public static int method7454(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + Class422.method4994(var0.charAt(var4), (byte)127);
      }

      return var3;
   }

   public static final void method7455(String var0, int var1) {
      if(!var0.equals("")) {
         Class111 var2 = Class452_Sub4.method9295((byte)30);
         OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4255, var2.aClass14_1342, 470738104);
         var3.out.writeByte(Class594.method7039(var0, -65715612), 1290930727);
         var3.out.method9616(var0, -1581528446);
         var2.write(var3, (byte)28);
      }
   }

   static final void method7456(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class690.method8098(3, var2, var3, "", -1699882382);
   }

   static final void method7457(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aBool11230?1:0;
   }
}
