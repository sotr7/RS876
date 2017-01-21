package com.jagex;

import com.jagex.Class549;
import com.jagex.Class581;
import com.jagex.Class59;
import com.jagex.client;

final class Class581_Sub1 extends Class581 {
   Class581_Sub1(String var1, int var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   static final void method9725(byte var0) {
      int var1 = 0;
      Class549 var2 = client.aClass505_11204.method6072(2100449268);

      for(int var3 = 0; var3 < client.aClass505_11204.method6056(-1746741811); ++var3) {
         for(int var4 = 0; var4 < client.aClass505_11204.method6057(126749238); ++var4) {
            if(Class59.method1034(var2.aClass552ArrayArrayArray7287, var1, var3, var4, true, (byte)10)) {
               ++var1;
            }

            if(var1 >= 512) {
               return;
            }
         }
      }

   }
}
