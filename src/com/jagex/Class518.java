package com.jagex;

import com.jagex.Class207;
import com.jagex.Class324;
import com.jagex.Class533;
import java.io.IOException;

public class Class518 {
   // $FF: synthetic field
   Class533 this$1;
   short[] aShortArray7042;

   Class518(Class533 var1) {
      this.this$1 = var1;
      this.aShortArray7042 = new short[768];
   }

   byte method6234(Class324 var1, byte var2) throws IOException {
      int var3 = 1;

      do {
         var3 = var3 << 1 | var1.method4162(this.aShortArray7042, var3, -2114435951);
      } while(var3 < 256);

      return (byte)var3;
   }

   void method6235() {
      Class207.method2922(this.aShortArray7042, (byte)0);
   }

   void method6236() {
      Class207.method2922(this.aShortArray7042, (byte)0);
   }

   void method6237() {
      Class207.method2922(this.aShortArray7042, (byte)0);
   }

   void method6238() {
      Class207.method2922(this.aShortArray7042, (byte)0);
   }

   void method6239() {
      Class207.method2922(this.aShortArray7042, (byte)0);
   }

   void method6240(int var1) {
      Class207.method2922(this.aShortArray7042, (byte)0);
   }

   byte method6241(Class324 var1, byte var2, byte var3) throws IOException {
      int var4 = 1;

      do {
         int var5 = var2 >> 7 & 1;
         var2 = (byte)(var2 << 1);
         int var6 = var1.method4162(this.aShortArray7042, (1 + var5 << 8) + var4, -2114435951);
         var4 = var4 << 1 | var6;
         if(var5 != var6) {
            while(var4 < 256) {
               var4 = var4 << 1 | var1.method4162(this.aShortArray7042, var4, -2114435951);
            }

            return (byte)var4;
         }
      } while(var4 < 256);

      return (byte)var4;
   }
}
