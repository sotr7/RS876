package com.jagex;

import com.jagex.Class11;
import com.jagex.Class452_Sub2;
import com.jagex.Class511;
import com.jagex.Class584;
import com.jagex.Class639_Sub1_Sub1_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub2;
import com.jagex.Class639_Sub1_Sub3_Sub2;
import com.jagex.Class639_Sub1_Sub5_Sub1;
import com.jagex.Class655;
import com.jagex.Class681;
import com.jagex.Interface59;
import com.jagex.client;

public class Class698 {
   static Class698 aClass698_8764 = new Class698(0);
   public static Class698 aClass698_8763 = new Class698(1);
   static Class698 aClass698_8765 = new Class698(2);
   public int anInt8766;

   Class698(int var1) {
      this.anInt8766 = var1 * 79147593;
   }

   public static void method8160(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var1 >= 0 && var2 >= 0 && var1 < client.aClass505_11204.method6056(-1746741811) - 1 && var2 < client.aClass505_11204.method6057(126749238) - 1) {
         if(client.aClass505_11204.method6072(549834129) == null) {
            return;
         }

         Interface59 var9;
         if(var3 == 0) {
            var9 = (Interface59)client.aClass505_11204.method6072(-792089244).method6589(var0, var1, var2, (byte)24);
            Interface59 var10 = (Interface59)client.aClass505_11204.method6072(1565140877).method6612(var0, var1, var2, (byte)0);
            if(var9 != null && var4 != 2) {
               if(var9 instanceof Class639_Sub1_Sub1_Sub2) {
                  ((Class639_Sub1_Sub1_Sub2)var9).aClass529_12026.method6355(var6, var7, 1107465443);
               } else {
                  Class452_Sub2.method9259(var0, var3, var1, var2, var9.method56(1362187833), var5, var4, var6, var7, -314631755);
               }
            }

            if(var10 != null) {
               if(var10 instanceof Class639_Sub1_Sub1_Sub2) {
                  ((Class639_Sub1_Sub1_Sub2)var10).aClass529_12026.method6355(var6, var7, 1107465443);
               } else {
                  Class452_Sub2.method9259(var0, var3, var1, var2, var10.method56(1031752407), var5, var4, var6, var7, 2018691255);
               }
            }
         } else if(1 == var3) {
            var9 = (Interface59)client.aClass505_11204.method6072(-1164630775).method6590(var0, var1, var2, -99663398);
            if(null != var9) {
               if(var9 instanceof Class639_Sub1_Sub5_Sub1) {
                  ((Class639_Sub1_Sub5_Sub1)var9).aClass529_11971.method6355(var6, var7, 1107465443);
               } else {
                  int var11 = var9.method56(432957249);
                  if(4 != var4 && var4 != 5) {
                     if(6 == var4) {
                        Class452_Sub2.method9259(var0, var3, var1, var2, var11, 4 + var5, 4, var6, var7, 659758542);
                     } else if(7 == var4) {
                        Class452_Sub2.method9259(var0, var3, var1, var2, var11, (var5 + 2 & 3) + 4, 4, var6, var7, -85075724);
                     } else if(var4 == 8) {
                        Class452_Sub2.method9259(var0, var3, var1, var2, var11, var5 + 4, 4, var6, var7, 924352070);
                        Class452_Sub2.method9259(var0, var3, var1, var2, var11, (2 + var5 & 3) + 4, 4, var6, var7, 186576837);
                     }
                  } else {
                     Class452_Sub2.method9259(var0, var3, var1, var2, var11, var5, 4, var6, var7, 807258665);
                  }
               }
            }
         } else if(2 == var3) {
            var9 = (Interface59)client.aClass505_11204.method6072(844677603).method6591(var0, var1, var2, client.anInterface64_11296, 1739430101);
            if(null != var9) {
               if(11 == var4) {
                  var4 = 10;
               }

               if(var9 instanceof Class639_Sub1_Sub2_Sub2) {
                  ((Class639_Sub1_Sub2_Sub2)var9).aClass529_11978.method6355(var6, var7, 1107465443);
               } else {
                  Class452_Sub2.method9259(var0, var3, var1, var2, var9.method56(-94817995), var5, var4, var6, var7, 1301007089);
               }
            }
         } else if(3 == var3) {
            var9 = (Interface59)client.aClass505_11204.method6072(1662831516).method6593(var0, var1, var2, -1234352984);
            if(null != var9) {
               if(var9 instanceof Class639_Sub1_Sub3_Sub2) {
                  ((Class639_Sub1_Sub3_Sub2)var9).aClass529_12033.method6355(var6, var7, 1107465443);
               } else {
                  Class452_Sub2.method9259(var0, var3, var1, var2, var9.method56(908503200), var5, var4, var6, var7, -144308776);
               }
            }
         }
      }

   }

   static final void method8161(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(null != client.aString11017 && var2 < Class11.anInt145 * -190820129) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class655.aClass107Array8488[var2].aString1311;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static final void method8162(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
   }

   public static void method8163(int var0) {
      Class511.method6168();
   }

   static final void method8164(Class681 var0, int var1) {
      Class584.method6985(var0.aClass639_Sub1_Sub2_Sub1_8635, var0, (byte)69);
   }
}
