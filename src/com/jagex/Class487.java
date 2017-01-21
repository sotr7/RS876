package com.jagex;

import com.jagex.Class108;
import com.jagex.Class17;
import com.jagex.Class206;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class247;
import com.jagex.Class265;
import com.jagex.Class297;
import com.jagex.Class32;
import com.jagex.Class513;
import com.jagex.Class522;
import com.jagex.Class523;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class566;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class689_Sub4;
import com.jagex.Class72;
import com.jagex.Class90;
import com.jagex.client;

public class Class487 {
   public static int[] anIntArray5510;
   static int anInt5511;
   int anInt5509;
   static Class487 aClass487_5505 = new Class487(2);
   static Class487 aClass487_5502 = new Class487(3);
   static Class487 aClass487_5504 = new Class487(5);
   static Class487 aClass487_5506 = new Class487(0);
   static Class487 aClass487_5503 = new Class487(1);
   static Class487 aClass487_5507 = new Class487(4);
   static Class487 aClass487_5508 = new Class487(6);

   Class487(int var1) {
      this.anInt5509 = -1799471567 * var1;
   }

   static final void method5853(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class108.method1351(var3, var4, var0, 1213382206);
   }

   static final void method5854(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3122(var2, (byte)93).method3028((short)255)?1:0;
   }

   static final void method5855(Class681 var0, int var1) {
      var0.anInt8623 -= -1957887669;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class206.method2907(var2, -1145237759);
   }

   static final void method5856(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class108.method1349(-558705405 * client.anInt11038, -1728513157)?1:0;
   }

   static final void method5857(Class681 var0, int var1) {
      Class689_Sub4.method10247((byte)-22);
      Class297.method3972(2118834713);
      client.aClass505_11204.method6078(-2029972438);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   public static Class90 method5858(int var0, short var1) {
      Class90 var2 = (Class90)client.aClass192_11009.method2765((long)var0);
      if(null == var2) {
         var2 = new Class90(Class513.aClass466_7020, Class72.method1108(var0, 472299464), Class17.method625(var0, (byte)5));
         client.aClass192_11009.method2768(var2, (long)var0);
      }

      return var2;
   }

   static boolean method5859(int var0) {
      return -1 != Class32.anInt312 * -577726201?Class523.method6273(-1003201661):Class247.method3395(Class32.aString315, Class32.aString344, -563334274);
   }

   static void method5860(int var0, int var1, int var2, int var3, byte var4) {
      Class526_Sub21_Sub9 var5 = Class265.method3560(4, (long)var0);
      var5.method10584(230428369);
      var5.anInt11678 = 1693201951 * var1;
      var5.anInt11680 = -1482432943 * var2;
      var5.anInt11677 = 703746177 * var3;
   }
}
