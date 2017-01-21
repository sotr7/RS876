package com.jagex;

import com.jagex.Class171;
import com.jagex.Class329_Sub1;
import com.jagex.Class43;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class526_Sub32;
import com.jagex.Class570;
import com.jagex.Class596;
import com.jagex.Class632;
import com.jagex.Class689_Sub2;
import com.jagex.Class8;
import com.jagex.Exception_Sub2;
import com.jagex.client;

public class Class328 {
   String aString3490;
   String aString3489;
   String aString3491;

   Class328(String var1, String var2, String var3) {
      this.aString3490 = var1;
      this.aString3489 = var2;
      this.aString3491 = var3;
   }

   public static boolean method4200(int var0) {
      return Class570.aTwitchTV7639 != null && Class570.aTwitchTV7639.IsStreaming();
   }

   static void method4201(byte var0) {
      Class329_Sub1 var1 = (Class329_Sub1)Class43.aClass292_Sub1_458.method3941(-264640984);
      Class689_Sub2 var2 = (Class689_Sub2)Class43.aClass292_Sub1_458.method3938((byte)-25);
      Class446 var3 = var1.method4204(516976140);
      Class440 var4 = var2.method10208((byte)-46);
      if(client.aClass245_11194 != null) {
         int var5 = client.aClass245_11194.anInt2510 * -99858407;
         int var6 = -667181623 * client.aClass245_11194.anInt2576;
         float var7 = 1000.0F;
         float var8 = (float)(2.0D * Math.atan((double)((float)var5 / 2.0F / var7)));
         float var9 = (float)(2.0D * Math.atan((double)((float)var6 / 2.0F / var7)));

         try {
            Class43.aClass292_Sub1_458.method3926(var8, var9, (byte)-46);
         } catch (Exception_Sub2 var11) {
            ;
         }
      }

      if(Class8.aClass547_45.method6547(1305328919)) {
         Class440 var12 = Class440.method5192();
         var12.method5193(1.0F, 0.0F, 0.0F, (float)(Class8.aClass547_45.method6531(-1323336072) - -87662467 * Class632.anInt8238) / 200.0F);
         var4.method5194(var12);
         Class446 var14 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var14.method5286(var4);
         Class440 var17 = Class440.method5192();
         var17.method5188(var14, (float)(-1754354777 * Class43.anInt456 - Class8.aClass547_45.method6534(272369925)) / 200.0F);
         var4.method5194(var17);
         var2.method10210(var4, 1960734086);
      }

      Class43.anInt456 = Class8.aClass547_45.method6534(895767331) * -734049257;
      Class632.anInt8238 = Class8.aClass547_45.method6531(-224226026) * 979245269;
      var4.method5187();
      Class446 var13;
      if(Class171.aClass553_2016.method6666(98, 1669022477)) {
         var13 = Class446.method5309(0.0F, 0.0F, 25.0F);
         var13.method5286(var4);
         var13.aFloat4915 *= -1.0F;
         var3.method5272(var13);
      }

      if(Class171.aClass553_2016.method6666(99, 1253404961)) {
         var13 = Class446.method5309(0.0F, 0.0F, -25.0F);
         var13.method5286(var4);
         var13.aFloat4915 *= -1.0F;
         var3.method5272(var13);
      }

      if(Class171.aClass553_2016.method6666(96, 967071528)) {
         var13 = Class446.method5309(-25.0F, 0.0F, 0.0F);
         var13.method5286(var4);
         var13.aFloat4915 *= -1.0F;
         var3.method5272(var13);
      }

      if(Class171.aClass553_2016.method6666(97, 360164568)) {
         var13 = Class446.method5309(25.0F, 0.0F, 0.0F);
         var13.method5286(var4);
         var13.aFloat4915 *= -1.0F;
         var3.method5272(var13);
      }

      Class526_Sub32 var16 = new Class526_Sub32(0, (int)var3.aFloat4917, (int)var3.aFloat4915, (int)var3.aFloat4919);
      var1.method9040(var16, 1272960556);
      Class596 var15 = client.aClass505_11204.method6128(2118138240);
      int var18 = -814686591 * var15.localX << 9;
      int var19 = var15.localY * -845789331 << 9;
      Class43.aClass292_Sub1_458.method3905(0.02F, client.aClass505_11204.method6125(-2105012139).anIntArrayArrayArray5312, client.aClass505_11204.method6094((byte)29), var18, var19, 2028386226);
   }
}
