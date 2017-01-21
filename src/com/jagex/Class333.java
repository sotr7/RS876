package com.jagex;

import com.jagex.Class149;
import com.jagex.Class21;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class357;
import com.jagex.Class429;
import com.jagex.Class51;
import com.jagex.RSByteBuffer;
import com.jagex.Class566;
import com.jagex.Class615;
import com.jagex.Class619;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.client;
import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.EOFException;

public class Class333 {
   public Class333(int var1) {
   }

   static void method4255(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      TwitchWebcamDevice var3 = Class429.method5049(var2, 1669017392);
      if(var3 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt1137 * -355702023;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString1135;
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString1136;
      }

   }

   static final void method4256(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2603 = Class615.method7280(var4, var2, -668887601);
      var0.aBool2560 = true;
   }

   public static Class51 method4257(int var0) {
      Class21 var1 = null;

      try {
         Class51 var19;
         try {
            var1 = Class619.method7340("3", client.aClass676_11127.aString8591, false, 818846928);
            byte[] var2 = new byte[(int)var1.method658((byte)-32)];
            int var18 = 0;

            while(true) {
               if(var18 >= var2.length) {
                  var19 = new Class51(new RSByteBuffer(var2));
                  break;
               }

               int var4 = var1.method653(var2, var18, var2.length - var18, (byte)73);
               if(-1 == var4) {
                  throw new EOFException();
               }

               var18 += var4;
            }
         } catch (Exception var16) {
            Class51 var3 = new Class51();

            try {
               if(var1 != null) {
                  var1.method651(1596676876);
               }
            } catch (Exception var14) {
               ;
            }

            return var3;
         }

         try {
            if(var1 != null) {
               var1.method651(336529609);
            }
         } catch (Exception var15) {
            ;
         }

         return var19;
      } finally {
         try {
            if(var1 != null) {
               var1.method651(323286687);
            }
         } catch (Exception var13) {
            ;
         }

      }
   }

   static final void method4258(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class679 var4;
      if(var0.aBool8628) {
         var4 = var0.aClass679_8631;
      } else {
         var4 = var0.aClass679_8621;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1 != var3 && var4.method8020(var2, var3, (byte)-117)?1:0;
   }

   static void method4259(int var0) {
      Class357.method4575((byte)114);
   }

   static final void method4260(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3109(1986732427);
   }
}
