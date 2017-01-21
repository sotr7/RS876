package com.jagex;

import com.jagex.Class1;
import com.jagex.Class163;
import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class309;
import com.jagex.Class442;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class85;
import com.jagex.client;

public class Class307 {
   public static Class307 aClass307_3293 = new Class307(0, false);
   public static Class307 aClass307_3297 = new Class307(1, false);
   static Class307 aClass307_3294 = new Class307(2, true);
   static Class307 aClass307_3295 = new Class307(3, true);
   static Class307 aClass307_3296 = new Class307(4, true);
   public int anInt3298;
   boolean aBool3292;

   Class307(int var1, boolean var2) {
      this.anInt3298 = 560110247 * var1;
      this.aBool3292 = var2;
   }

   public boolean method4040(short var1) {
      return this.aBool3292;
   }

   public boolean method4041() {
      return this.aBool3292;
   }

   static final int method4042(int var0, byte var1) {
      return var0 < 7?7:10;
   }

   static final void method4043(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1448987627 * var3.anInt2550;
   }

   static final void method4044(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub26_10611.method10079(-1850502869) == 1?1:0;
   }

   static void method4045(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Class526_Sub21_Sub7 var7, Class163 var8, Class1 var9, int var10, int var11, int var12) {
      if(var0 > var2 && var0 < var4 + var2 && var1 > var6 - var9.anInt12 * 96898447 - 1 && var1 < -1329402501 * var9.anInt14 + var6) {
         var10 = var11;
      }

      String var13 = Class85.method1181(var7, 1600532433);
      var8.method1901(var13, var2 + 3, var6, var10, 0, client.aRandom11163, Class309.anInt3378, Class442.aClass153Array4878, (int[])null, 152174162);
   }
}
