package com.jagex;

import com.jagex.Class105;
import com.jagex.Class113;
import com.jagex.Class230;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.Class40_Sub8;
import com.jagex.Class451;
import com.jagex.Class470;
import com.jagex.Class513;
import com.jagex.Class513_Sub1;
import com.jagex.Class513_Sub2;
import com.jagex.Class522;
import com.jagex.Class549;
import com.jagex.Class60;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.Interface45;
import com.jagex.Interface59;
import com.jagex.client;

public class Class380 implements Interface45 {
   static Class702 aClass702_3937;
   public Class384 aClass384_3932;
   public Class389 aClass389_3929;
   public int anInt3930;
   public int anInt3931;
   public int anInt3936;
   public int anInt3933;
   public int anInt3934;
   public int anInt3935;
   public int anInt3928;

   public Class394 method346(int var1) {
      return null;
   }

   public Class394 method345() {
      return null;
   }

   Class380(Class384 var1, Class389 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.aClass384_3932 = var1;
      this.aClass389_3929 = var2;
      this.anInt3930 = -2001678449 * var3;
      this.anInt3931 = var4 * -1845477645;
      this.anInt3936 = var5 * 281819771;
      this.anInt3933 = var6 * 1953873601;
      this.anInt3934 = var7 * 17546191;
      this.anInt3935 = -1072447457 * var8;
      this.anInt3928 = var9 * -1682828679;
   }

   public static Class513 method4703(int var0) {
      try {
         return new Class513_Sub2();
      } catch (Throwable var2) {
         return new Class513_Sub1();
      }
   }

   public static String method4704(String var0, char var1, String var2, byte var3) {
      int var4 = var0.length();
      int var5 = var2.length();
      int var6 = var4;
      int var7 = var5 - 1;
      if(var7 != 0) {
         int var8 = 0;

         while(true) {
            var8 = var0.indexOf(var1, var8);
            if(var8 < 0) {
               break;
            }

            ++var8;
            var6 += var7;
         }
      }

      StringBuilder var11 = new StringBuilder(var6);
      int var9 = 0;

      while(true) {
         int var10 = var0.indexOf(var1, var9);
         if(var10 < 0) {
            var11.append(var0.substring(var9));
            return var11.toString();
         }

         var11.append(var0.substring(var9, var10));
         var11.append(var2);
         var9 = 1 + var10;
      }
   }

   static final void method4705(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub20_10616, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] == 1?1:0, (short)-32758);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static void method4706(int var0, byte var1) {
      Class105.anInt1295 = 0;
      int var2 = client.aClass505_11204.method6056(-1746741811);
      int var3 = client.aClass505_11204.method6057(126749238);
      Class470 var4 = client.aClass505_11204.method6094((byte)11);
      Class549 var5 = client.aClass505_11204.method6072(-243654170);
      Class40_Sub8 var6 = client.aClass505_11204.method6066(-631188979);
      int var7 = var0;
      if(Class451.localPlayer != null) {
         int var8 = Class451.localPlayer.screenX[0] >> 3;
         int var9 = Class451.localPlayer.screenY[0] >> 3;
         if(var8 >= 0 && var8 < Class105.aBoolArrayArray1306.length && var9 >= 0 && var9 < Class105.aBoolArrayArray1306[var8].length && Class105.aBoolArrayArray1306[var8][var9]) {
            var7 = 0;
         }
      }

      for(int var10 = 0; var10 < var2; ++var10) {
         for(int var11 = 0; var11 < var3; ++var11) {
            for(int var12 = var7; var12 <= var0 + 1 && var12 <= 3; ++var12) {
               if((var12 < var0 || var4.method5615(var0, var12, var10, var11, 1782291149)) && !Class60.method1037((Interface59)var5.method6593(var12, var10, var11, -934138482), var6, var10, var11, (byte)-26) && !Class60.method1037((Interface59)var5.method6591(var12, var10, var11, client.anInterface64_11296, 1739430101), var6, var10, var11, (byte)-25) && !Class60.method1037((Interface59)var5.method6589(var12, var10, var11, (byte)24), var6, var10, var11, (byte)-98) && Class60.method1037((Interface59)var5.method6590(var12, var10, var11, 2008930694), var6, var10, var11, (byte)-28)) {
                  ;
               }
            }
         }
      }

   }

   static void method4707(int var0, int var1) {
      Class113.aClass192_1369.method2769(var0, (byte)-53);
   }
}
