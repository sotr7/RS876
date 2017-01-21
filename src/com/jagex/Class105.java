package com.jagex;

import com.jagex.Class162;
import com.jagex.Class174;
import com.jagex.Class208;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class255;
import com.jagex.Class297;
import com.jagex.Class387;
import com.jagex.Class40_Sub8;
import com.jagex.Class418;
import com.jagex.Class446;
import com.jagex.Class451;
import com.jagex.Class470;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.Class549;
import com.jagex.Class60;
import com.jagex.Class605_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class679;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.Interface59;
import com.jagex.client;

public class Class105 {
   static final int anInt1297 = 48;
   static final double aDouble1305 = 100.0D;
   static boolean[][] aBoolArrayArray1306;
   static int anInt1304 = 0;
   static int anInt1290 = 1764531429;
   public static int anInt1300 = 2110507933;
   public static int anInt1301 = 1654212593;
   static int anInt1295 = 0;
   static boolean aBool1291 = false;
   static boolean aBool1294 = false;
   static int[] anIntArray1293 = new int[4];
   static int[] anIntArray1296 = new int[1010];
   static int[] anIntArray1292 = new int[1003];
   static int[] anIntArray1298 = new int[1002];
   static Class702 aClass702_1299 = new Class702();
   static boolean aBool1302 = true;
   static boolean aBool1303 = false;

   public static void method1316() {
      int var0 = client.aClass505_11204.method6056(-1746741811);
      int var1 = client.aClass505_11204.method6057(126749238);
      aBoolArrayArray1306 = new boolean[var0 >> 3][var1 >> 3];
   }

   static void method1317() {
      anInt1304 = 0;
      anInt1290 = 1764531429;
      anInt1300 = 2110507933;
      anInt1301 = 1654212593;
   }

   static void method1318() {
      anInt1304 = 0;
      anInt1290 = 1764531429;
      anInt1300 = 2110507933;
      anInt1301 = 1654212593;
   }

   public static void method1319() {
      anInt1290 = 1764531429;
   }

   static void method1320(int var0) {
      anInt1295 = 0;
      int var1 = client.aClass505_11204.method6056(-1746741811);
      int var2 = client.aClass505_11204.method6057(126749238);
      Class470 var3 = client.aClass505_11204.method6094((byte)-51);
      Class549 var4 = client.aClass505_11204.method6072(-1063842413);
      Class40_Sub8 var5 = client.aClass505_11204.method6066(-631188979);
      int var6 = var0;
      if(Class451.localPlayer != null) {
         int var7 = Class451.localPlayer.screenX[0] >> 3;
         int var8 = Class451.localPlayer.screenY[0] >> 3;
         if(var7 >= 0 && var7 < aBoolArrayArray1306.length && var8 >= 0 && var8 < aBoolArrayArray1306[var7].length && aBoolArrayArray1306[var7][var8]) {
            var6 = 0;
         }
      }

      for(int var9 = 0; var9 < var1; ++var9) {
         for(int var10 = 0; var10 < var2; ++var10) {
            for(int var11 = var6; var11 <= var0 + 1 && var11 <= 3; ++var11) {
               if((var11 < var0 || var3.method5615(var0, var11, var9, var10, 1155779413)) && !Class60.method1037((Interface59)var4.method6593(var11, var9, var10, 320411087), var5, var9, var10, (byte)-73) && !Class60.method1037((Interface59)var4.method6591(var11, var9, var10, client.anInterface64_11296, 1739430101), var5, var9, var10, (byte)-62) && !Class60.method1037((Interface59)var4.method6589(var11, var9, var10, (byte)24), var5, var9, var10, (byte)-4) && Class60.method1037((Interface59)var4.method6590(var11, var9, var10, 1861324754), var5, var9, var10, (byte)-120)) {
                  ;
               }
            }
         }
      }

   }

   static void method1321(Class174 var0) {
      if(Class451.localPlayer.aByte10827 != -41664749 * anInt1290) {
         if(client.aClass505_11204.method6072(-1465944853) != null) {
            Class255.time((byte)24);
            if(Class605_Sub1.method9743(var0, Class451.localPlayer.aByte10827, (byte)-33)) {
               anInt1290 = Class451.localPlayer.aByte10827 * -1764531429;
            }

         }
      }
   }

   static void method1322(Class174 var0) {
      if(Class451.localPlayer.aByte10827 != -41664749 * anInt1290) {
         if(client.aClass505_11204.method6072(1798089400) != null) {
            Class255.time((byte)24);
            if(Class605_Sub1.method9743(var0, Class451.localPlayer.aByte10827, (byte)4)) {
               anInt1290 = Class451.localPlayer.aByte10827 * -1764531429;
            }

         }
      }
   }

   static void method1323(Class174 var0) {
      if(Class451.localPlayer.aByte10827 != -41664749 * anInt1290) {
         if(client.aClass505_11204.method6072(-1714939412) != null) {
            Class255.time((byte)24);
            if(Class605_Sub1.method9743(var0, Class451.localPlayer.aByte10827, (byte)-49)) {
               anInt1290 = Class451.localPlayer.aByte10827 * -1764531429;
            }

         }
      }
   }

   public static void method1324() {
      int var0 = client.aClass505_11204.method6056(-1746741811);
      int var1 = client.aClass505_11204.method6057(126749238);
      aBoolArrayArray1306 = new boolean[var0 >> 3][var1 >> 3];
   }

   static void method1325(int var0) {
      anInt1295 = 0;
      int var1 = client.aClass505_11204.method6056(-1746741811);
      int var2 = client.aClass505_11204.method6057(126749238);
      Class470 var3 = client.aClass505_11204.method6094((byte)-6);
      Class549 var4 = client.aClass505_11204.method6072(-1641235381);
      Class40_Sub8 var5 = client.aClass505_11204.method6066(-631188979);
      int var6 = var0;
      if(Class451.localPlayer != null) {
         int var7 = Class451.localPlayer.screenX[0] >> 3;
         int var8 = Class451.localPlayer.screenY[0] >> 3;
         if(var7 >= 0 && var7 < aBoolArrayArray1306.length && var8 >= 0 && var8 < aBoolArrayArray1306[var7].length && aBoolArrayArray1306[var7][var8]) {
            var6 = 0;
         }
      }

      for(int var9 = 0; var9 < var1; ++var9) {
         for(int var10 = 0; var10 < var2; ++var10) {
            for(int var11 = var6; var11 <= var0 + 1 && var11 <= 3; ++var11) {
               if((var11 < var0 || var3.method5615(var0, var11, var9, var10, 1137091488)) && !Class60.method1037((Interface59)var4.method6593(var11, var9, var10, 2000584692), var5, var9, var10, (byte)-100) && !Class60.method1037((Interface59)var4.method6591(var11, var9, var10, client.anInterface64_11296, 1739430101), var5, var9, var10, (byte)-54) && !Class60.method1037((Interface59)var4.method6589(var11, var9, var10, (byte)24), var5, var9, var10, (byte)-3) && Class60.method1037((Interface59)var4.method6590(var11, var9, var10, 1452778223), var5, var9, var10, (byte)-126)) {
                  ;
               }
            }
         }
      }

   }

   public static void method1326() {
      int var0 = client.aClass505_11204.method6056(-1746741811);
      int var1 = client.aClass505_11204.method6057(126749238);
      aBoolArrayArray1306 = new boolean[var0 >> 3][var1 >> 3];
   }

   public static void method1327() {
      int var0 = client.aClass505_11204.method6056(-1746741811);
      int var1 = client.aClass505_11204.method6057(126749238);
      aBoolArrayArray1306 = new boolean[var0 >> 3][var1 >> 3];
   }

   Class105() throws Throwable {
      throw new Error();
   }

   static final void method1328(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class208.method2934((byte)-98);
      if(var3 != null) {
         boolean var4 = var3.method10717(var2 >> 28 & 3, var2 >> 14 & 16383, var2 & 16383, Class680.anIntArray8612, 971600343);
         if(var4) {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class680.anIntArray8612[1];
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class680.anIntArray8612[2];
         } else {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         }
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      }

   }

   static final void method1329(Class681 var0, byte var1) {
      var0.anInt8623 -= -1957887669;
   }

   static final void method1330(Class681 var0, int var1) {
      Class162.method1885((byte)69);
      Class297.method3972(1205166968);
      client.aClass505_11204.method6078(-2048719889);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static final void method1331(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   static final void method1332(Class639_Sub1_Sub2_Sub1 var0, int var1) {
      int var2 = var0.anInt11923 * -1021573293 - client.anInt11012;
      int var3 = var0.anInt11912 * 195925504 + var0.method10781(-627148024) * 256;
      int var4 = var0.anInt11919 * 426277376 + var0.method10781(-627148024) * 256;
      int var5 = Class387.method4762(var3, var4, var0.anInt11921 * 1480241191, 1265569552);
      Class446 var6 = var0.method7635().aClass446_4816;
      var0.method7618((float)((var3 - (int)var6.aFloat4917) / var2 + (int)var6.aFloat4917), (float)((var5 - (int)var6.aFloat4915) / var2 + (int)var6.aFloat4915), (float)((int)var6.aFloat4919 + (var4 - (int)var6.aFloat4919) / var2));
      var0.anInt11957 = 0;
      var0.method10771(var0.anInt11925 * 660870405, 626158815);
   }

   static final void method1333(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class418.method4972(var3, var4, var0, -1530102152);
   }
}
