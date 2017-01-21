package com.jagex;

import com.jagex.Class192;
import com.jagex.Class328;
import com.jagex.Class385;
import com.jagex.Class466;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Interface49;

public class Class395 implements Interface49 {
   static int anInt4111;
   public static Class466 aClass466_4113;
   Class192 aClass192_4110 = new Class192(64);
   Class466 aClass466_4112;

   public void method4810() {
      this.aClass192_4110.method2770(1654363369);
   }

   public synchronized Class385 method354(int var1) {
      Class385 var2 = (Class385)this.aClass192_4110.method2765((long)var1);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = this.aClass466_4112.method5536(0, var1, (byte)-65);
         var2 = new Class385();
         if(null != var3) {
            var2.method4733(new RSByteBuffer(var3), (byte)-5);
         }

         var2.method4735(-1366079782);
         this.aClass192_4110.method2768(var2, (long)var1);
         return var2;
      }
   }

   public void method4811(short var1) {
      this.aClass192_4110.method2770(740337490);
   }

   public synchronized Class385 method353(int var1, byte var2) {
      Class385 var3 = (Class385)this.aClass192_4110.method2765((long)var1);
      if(var3 != null) {
         return var3;
      } else {
         byte[] var4 = this.aClass466_4112.method5536(0, var1, (byte)12);
         var3 = new Class385();
         if(null != var4) {
            var3.method4733(new RSByteBuffer(var4), (byte)-61);
         }

         var3.method4735(626295042);
         this.aClass192_4110.method2768(var3, (long)var1);
         return var3;
      }
   }

   public void method4812() {
      this.aClass192_4110.method2770(1945548358);
   }

   public Class395(Class466 var1) {
      this.aClass466_4112 = var1;
   }

   public static int method4813(int var0) {
      return !Class328.method4200(1890032818)?0:Class570.anInt7635 * 884600261;
   }
}
