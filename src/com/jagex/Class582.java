package com.jagex;

import com.jagex.Class10;
import com.jagex.Class11;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class32;
import com.jagex.Class448;
import com.jagex.Class448_Sub1;
import com.jagex.Class525;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class526_Sub29;
import com.jagex.Class531_Sub1;
import com.jagex.Class553;
import com.jagex.Class646;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class83;
import com.jagex.Interface63;
import com.jagex.Interface67;

public class Class582 implements Interface67 {
   public static int anInt7777;
   int[] anIntArray7776;

   public boolean method434(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4, int var5) {
      int[] var6 = this.anIntArray7776;

      for(int var7 = 0; var7 < var6.length; ++var7) {
         int var8 = var6[var7];
         if(!var4.method6666(var8, 1294285093)) {
            return false;
         }
      }

      return true;
   }

   Class582(int[] var1) {
      this.anIntArray7776 = var1;
   }

   public boolean method436(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4) {
      int[] var5 = this.anIntArray7776;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         int var7 = var5[var6];
         if(!var4.method6666(var7, 1304526918)) {
            return false;
         }
      }

      return true;
   }

   public boolean method435(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4) {
      int[] var5 = this.anIntArray7776;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         int var7 = var5[var6];
         if(!var4.method6666(var7, 782580834)) {
            return false;
         }
      }

      return true;
   }

   static final void method6973(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class525.method6281(var2);
      if(null == var3) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1473384675 * var3.anInt11836;
      }

   }

   public static String method6974(byte[] var0, byte var1) {
      return Class448.method5334(var0, 0, var0.length, -1865583421);
   }

   static final void method6975(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class32.anInt316 * -1155696537;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class32.anInt353 * 311281909;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1005614123 * Class32.anInt323;
      Class32.anInt316 = 317438290;
      Class32.anInt353 = -1059234653;
      Class32.anInt323 = -2087758467;
   }

   public static int method6976(int var0, int var1, boolean var2, boolean var3, int var4) {
      Class526_Sub2 var5 = Class531_Sub1.method9301(var0, var3, 1498563283);
      if(null == var5) {
         return 0;
      } else {
         int var6 = 0;

         for(int var7 = 0; var7 < var5.anIntArray10331.length; ++var7) {
            if(var5.anIntArray10331[var7] >= 0 && var5.anIntArray10331[var7] < 483728625 * Class448_Sub1.aClass40_Sub1_10233.anInt447) {
               Class11 var8 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var5.anIntArray10331[var7], -628673537);
               int var9 = var8.method595(var1, ((Class83)Class10.aClass40_Sub20_62.method89(var1, -684179030)).anInt843 * 1040538721, 338140523);
               if(var2) {
                  var6 += var5.anIntArray10329[var7] * var9;
               } else {
                  var6 += var9;
               }
            }
         }

         return var6;
      }
   }

   static final void method6977(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class646.method7692(var3, var4, var0, (byte)1);
   }
}
