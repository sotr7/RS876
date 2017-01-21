package com.jagex;

import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class260;
import com.jagex.Class3;
import com.jagex.Class315_Sub1;
import com.jagex.Class348;
import com.jagex.Class460;
import com.jagex.Class466;
import com.jagex.Class522;
import com.jagex.Class526_Sub38;
import com.jagex.Class526_Sub39;
import com.jagex.Class681;
import com.jagex.client;

public class Class107 {
   public String aString1310;
   public String aString1311;
   String aString1312;
   public int anInt1313;
   public String aString1314;
   public byte aByte1315;
   public static Class466 aClass466_1316;

   static final void method1342(Class681 var0, int var1) {
      if(client.anInt11089 * 96539231 >= 5 && client.anInt11089 * 96539231 <= 9) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 96539231 * client.anInt11089;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method1343(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class260.method3530(var2, 23391570);
   }

   static final void method1344(Class681 var0, byte var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub28_10656, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-28224);
      Class522.method6257(-1042127423);
   }

   public static void method1345(InterfaceDef[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         InterfaceDef var3 = var0[var2];
         if(var3.anObjectArray2564 != null) {
            Class526_Sub39 var4 = new Class526_Sub39();
            var4.aClass245_10694 = var3;
            var4.anObjectArray10701 = var3.anObjectArray2564;
            Class460.method5467(var4, 5000000, 16711935);
         }
      }

   }

   public static void method1346(int var0, int[] var1, byte var2) {
      if(-1 != var0) {
         if(Class348.method4525(var0, var1, -1255297575)) {
            InterfaceDef[] var3 = Class315_Sub1.aClass243Array10033[var0].aClass245Array2459;
            method1345(var3, 1971813126);
         }
      }
   }

   public static final InterfaceDef method1347(Class243 var0, InterfaceDef var1, int var2) {
      if(-1 != -537841755 * var1.parentId) {
         return var0.method3331(var1.parentId * -537841755, -1156029899);
      } else {
         if(!var0.aBool2458) {
            int var3 = 919258769 * var1.uid >>> 16;
            Class3 var4 = new Class3(client.aClass20_11187);

            for(Class526_Sub38 var5 = (Class526_Sub38)var4.method523(-466324157); null != var5; var5 = (Class526_Sub38)var4.next()) {
               if(var3 == -870147923 * var5.anInt10684) {
                  return Class221.method3095((int)(var5.aLong7156 * -6805155999452426801L), (byte)113);
               }
            }
         }

         return null;
      }
   }
}
