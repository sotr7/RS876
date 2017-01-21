package com.jagex;

import com.jagex.Class460;
import com.jagex.RSByteBuffer;
import com.jagex.Class526_Sub39;
import com.jagex.Class546;
import com.jagex.Class623;
import com.jagex.Class681;

public class Class270 {
   int anInt2995;
   static Class270 aClass270_2994 = new Class270(0);
   static Class270 aClass270_2993 = new Class270(1);

   Class270(int var1) {
      this.anInt2995 = -1790587763 * var1;
   }

   static final void method3592(Class681 var0, int var1) {
      String var2 = null;
      if(Class546.aClass49_7271 != null) {
         var2 = Class546.aClass49_7271.method934((byte)24);
      }

      if(var2 == null) {
         var2 = "";
      }

      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
   }

   static final void method3593(Class681 var0, byte var1) {
      var0.anInt8630 -= 1112803603;
   }

   public static void method3594(Class526_Sub39 var0, int var1) {
      Class460.method5467(var0, 500000, 16711935);
   }

   static void method3595(byte[] var0, byte var1) {
      RSByteBuffer var2 = new RSByteBuffer(var0);

      while(true) {
         int var3 = var2.readUnsignedByte(1667422288);
         if(var3 == 0) {
            return;
         }

         if(1 == var3) {
            Class623.anInt8151 = var2.readUnsignedShort(1467888011) * -1554148609;
         } else if(10 == var3) {
            var2.readUnsignedShort(1439316259);
         }
      }
   }
}
