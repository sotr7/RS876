package com.jagex;

import com.jagex.Class143;
import com.jagex.Class230;
import com.jagex.Class380;
import com.jagex.Class451;
import com.jagex.Class452;
import com.jagex.Class454;
import com.jagex.Class554;
import com.jagex.Class642;
import com.jagex.client;

final class Class452_Sub2 extends Class452 {
   Object method5364(Class143 var1) {
      return Class454.aClass454_4962 == var1.aClass454_1676?Integer.valueOf(-1):var1.aClass454_1676.method5390(1459492499);
   }

   Object method5362(Class143 var1, int var2) {
      return Class454.aClass454_4962 == var1.aClass454_1676?Integer.valueOf(-1):var1.aClass454_1676.method5390(1764157513);
   }

   Class452_Sub2(Class642 var1, int var2, boolean var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   Object method5365(Class143 var1) {
      return Class454.aClass454_4962 == var1.aClass454_1676?Integer.valueOf(-1):var1.aClass454_1676.method5390(1695967671);
   }

   static final void method9259(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var2 >= 1 && var3 >= 1 && var2 <= client.aClass505_11204.method6056(-1746741811) - 2 && var3 <= client.aClass505_11204.method6057(126749238) - 2) {
         int var10 = var0;
         if(var0 < 3 && client.aClass505_11204.method6094((byte)-116).method5614(var2, var3, 576309325)) {
            var10 = var0 + 1;
         }

         if(client.aClass505_11204.method6072(-2117590128) == null) {
            return;
         }

         client.aClass505_11204.method6125(-2089733599).method9275(Class554.aClass174_7475, var0, var1, var2, var3, -928218362);
         if(var4 >= 0) {
            int var11 = Class230.preferences.aClass711_Sub11_10609.method9948((byte)113);
            Class230.preferences.method9602(Class230.preferences.aClass711_Sub11_10609, 1, (short)-23547);
            client.aClass505_11204.method6125(-2076028239).method9272(Class554.aClass174_7475, var10, var0, var2, var3, var4, var5, var6, var7, var8, 620672654);
            Class230.preferences.method9602(Class230.preferences.aClass711_Sub11_10609, var11, (short)-29891);
         }

         Class380.method4706(Class451.localPlayer.aByte10827, (byte)-62);
      }

   }
}
