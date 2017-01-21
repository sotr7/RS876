package com.jagex;

import com.jagex.Class115;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class296;
import com.jagex.Class315_Sub1;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.Class535;
import com.jagex.Class582;
import com.jagex.Class594;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.IcmpService_Sub1;
import com.jagex.client;

public class Class528 {
   // $FF: synthetic field
   Class535 this$0;

   Class528(Class535 var1) {
      this.this$0 = var1;
   }

   public static Class243 method6342(int var0, int var1) {
      return Class315_Sub1.aClass243Array10033[var0 >> 16];
   }

   static final void method6343(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class582.method6976(var2, var3, false, false, 976321504);
   }

   static final void method6344(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub24_10657.method10068(-1963884314) == 1?1:0;
   }

   static final void method6345(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   public static void method6346(int var0) {
      if(null != IcmpService_Sub1.anIcmpService_Sub1_10842) {
         try {
            IcmpService_Sub1.anIcmpService_Sub1_10842.quit();
         } catch (Throwable var2) {
            ;
         }

         IcmpService_Sub1.anIcmpService_Sub1_10842 = null;
      }
   }

   static final void method6347(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class296.method3965(var3, var4, var0, 1774286487);
   }

   static final void method6348(Class681 var0, short var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4261, client.aClass111_11059.aClass14_1342, -890043021);
      var3.out.writeByte(Class594.method7039(var2, -943785451), -1406867086);
      var3.out.method9616(var2, -1877841404);
      client.aClass111_11059.write(var3, (byte)6);
   }
}
