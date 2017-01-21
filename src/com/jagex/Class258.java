package com.jagex;

import com.jagex.Class103;
import com.jagex.Class217;
import com.jagex.Buffer;
import com.jagex.Class637;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class681;
import com.jagex.Class711_Sub23;
import com.jagex.Class93;
import com.jagex.Interface76;
import com.jagex.client;
import java.util.Date;

public class Class258 implements Interface76 {
   public static int anInt2829;
   public int anInt2821;
   int anInt2828;
   public static Class258 aClass258_2823 = new Class258(4, 0);
   public static Class258 aClass258_2822 = new Class258(1, 1);
   public static Class258 aClass258_2826 = new Class258(5, 2);
   public static Class258 aClass258_2827 = new Class258(2, 3);
   public static Class258 aClass258_2825 = new Class258(3, 4);
   public static Class258 aClass258_2824 = new Class258(0, 5);

   Class258(int var1, int var2) {
      this.anInt2821 = var1 * 632975753;
      this.anInt2828 = var2 * -490098623;
   }

   public int getId() {
      return this.anInt2828 * -1962254399;
   }

   public int method21() {
      return this.anInt2828 * -1962254399;
   }

   static final void method3513(Buffer var0, int var1) {
      int var2 = 0;
      var0.disableBitAccess(385105555);

      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < 1609310241 * Class103.anInt1270; ++var3) {
         var4 = Class103.anIntArray1276[var3];
         if((Class103.aByteArray1266[var4] & 1) == 0) {
            if(var2 > 0) {
               --var2;
               Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
            } else {
               var5 = var0.readBit(1, 673441488);
               if(var5 == 0) {
                  var2 = Class711_Sub23.method10066(var0, 106457772);
                  Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
               } else {
                  Class637.method7612(var0, var4, -1574228444);
               }
            }
         }
      }

      var0.finishBitAccess((byte)25);
      if(var2 != 0) {
         throw new RuntimeException();
      } else {
         var0.disableBitAccess(385105555);

         for(var3 = 0; var3 < Class103.anInt1270 * 1609310241; ++var3) {
            var4 = Class103.anIntArray1276[var3];
            if((Class103.aByteArray1266[var4] & 1) != 0) {
               if(var2 > 0) {
                  --var2;
                  Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
               } else {
                  var5 = var0.readBit(1, 673441488);
                  if(var5 == 0) {
                     var2 = Class711_Sub23.method10066(var0, -1295078024);
                     Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
                  } else {
                     Class637.method7612(var0, var4, 597785706);
                  }
               }
            }
         }

         var0.finishBitAccess((byte)110);
         if(0 != var2) {
            throw new RuntimeException();
         } else {
            var0.disableBitAccess(385105555);

            for(var3 = 0; var3 < -1174329851 * Class103.anInt1272; ++var3) {
               var4 = Class103.anIntArray1273[var3];
               if((Class103.aByteArray1266[var4] & 1) != 0) {
                  if(var2 > 0) {
                     --var2;
                     Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
                  } else {
                     var5 = var0.readBit(1, 673441488);
                     if(0 == var5) {
                        var2 = Class711_Sub23.method10066(var0, 362527619);
                        Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
                     } else if(Class217.method2992(var0, var4, 1788163620)) {
                        Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
                     }
                  }
               }
            }

            var0.finishBitAccess((byte)103);
            if(var2 != 0) {
               throw new RuntimeException();
            } else {
               var0.disableBitAccess(385105555);

               for(var3 = 0; var3 < Class103.anInt1272 * -1174329851; ++var3) {
                  var4 = Class103.anIntArray1273[var3];
                  if(0 == (Class103.aByteArray1266[var4] & 1)) {
                     if(var2 > 0) {
                        --var2;
                        Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
                     } else {
                        var5 = var0.readBit(1, 673441488);
                        if(var5 == 0) {
                           var2 = Class711_Sub23.method10066(var0, -2115142805);
                           Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
                        } else if(Class217.method2992(var0, var4, 1788163620)) {
                           Class103.aByteArray1266[var4] = (byte)(Class103.aByteArray1266[var4] | 2);
                        }
                     }
                  }
               }

               var0.finishBitAccess((byte)54);
               if(var2 != 0) {
                  throw new RuntimeException();
               } else {
                  Class103.anInt1270 = 0;
                  Class103.anInt1272 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     Class103.aByteArray1266[var3] = (byte)(Class103.aByteArray1266[var3] >> 1);
                     Class639_Sub1_Sub2_Sub1_Sub1 var6 = client.aClass639_Sub1_Sub2_Sub1_Sub1Array11154[var3];
                     if(null != var6) {
                        Class103.anIntArray1276[(Class103.anInt1270 += -1951702047) * 1609310241 - 1] = var3;
                     } else {
                        Class103.anIntArray1273[(Class103.anInt1272 += 1416214221) * -1174329851 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }

   static void method3514(long var0) {
      Class93.aCalendar899.setTime(new Date(var0));
   }

   static final void method3515(Class681 var0, int var1) {
      if(client.aString11264 != null) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = client.aString11264;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static int method3516(int var0, int var1) {
      return var0 != 9 && 10 != var0?(var0 == 11?8:var0):1;
   }
}
