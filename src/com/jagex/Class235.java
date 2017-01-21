package com.jagex;

import com.jagex.Class16;
import com.jagex.Class526_Sub29;
import com.jagex.Class57;
import com.jagex.Class577;
import com.jagex.Class582;
import com.jagex.Class608;
import com.jagex.Class612_Sub1;
import com.jagex.Class622;
import com.jagex.client;

public class Class235 {
   static int anInt2390;

   Class235(int var1, Object[] var2) {
   }

   static boolean method3280(Class582 var0, int var1) {
      return Class622.method7358(var0, (Class526_Sub29)null, -377538593);
   }

   public static void method3281(int var0) {
      if(Class16.aBool177) {
         if(-483119539 * Class16.anInt173 < 1255104167 * Class608.anInt7919) {
            Class16.anInt173 = Class608.anInt7919 * 1564574403;
         }

         while(true) {
            while(Class16.anInt173 * -483119539 < Class57.anInt691 * -610389965) {
               Class612_Sub1 var1 = Class577.method6943(-483119539 * Class16.anInt173, (byte)101);
               if(null != var1 && var1.anInt10814 * -2134698331 == -1) {
                  if(Class16.aClass657_178 == null) {
                     Class16.aClass657_178 = client.aClass647_11147.method7696(var1.aString10813, (byte)118);
                  }

                  int var2 = Class16.aClass657_178.anInt8491 * -1432920957;
                  if(-1 == var2) {
                     return;
                  }

                  var1.anInt10814 = -1607016147 * var2;
                  Class16.anInt173 += -582960507;
                  Class16.aClass657_178 = null;
               } else {
                  Class16.anInt173 += -582960507;
               }
            }

            return;
         }
      }
   }
}
