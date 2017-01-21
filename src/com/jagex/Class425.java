package com.jagex;

import com.jagex.Class157;
import com.jagex.Class159;
import com.jagex.Class174;
import com.jagex.Class193;
import com.jagex.Class199_Sub20;
import com.jagex.Class205;
import com.jagex.Class209;
import com.jagex.Class222;
import com.jagex.Class265;
import com.jagex.Class297;
import com.jagex.Class31;
import com.jagex.Class342;
import com.jagex.Class403;
import com.jagex.Class427;
import com.jagex.Class438;
import com.jagex.Class442;
import com.jagex.Class447;
import com.jagex.Class48;
import com.jagex.Class480;
import com.jagex.Class513;
import com.jagex.Class526_Sub21_Sub18;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class58;
import com.jagex.Class596;
import com.jagex.Class600;
import com.jagex.Class622;
import com.jagex.Class635;
import com.jagex.Class636;
import com.jagex.Class642;
import com.jagex.Class65;
import com.jagex.Class652;
import com.jagex.Class68;
import com.jagex.Class681;
import com.jagex.Class711_Sub16;
import com.jagex.Class75;
import com.jagex.Class80;
import com.jagex.Class97_Sub1_Sub1;
import com.jagex.Exception_Sub7;
import jaclib.ping.Ping;
import java.awt.Canvas;

public class Class425 {
   public static Canvas aCanvas4798;
   static int anInt4796 = 0;
   static int anInt4795 = 0;
   static Class58[] aClass58Array4797;

   Class425() throws Throwable {
      throw new Error();
   }

   public static int method5005() {
      if(0 == anInt4796 * -833865599) {
         Class58.aClass58_693.method1024(new Class427("jaclib"), (byte)2);
         if(Class58.aClass58_693.method1025(2097623540).method56(-1153623513) != 100) {
            return 1;
         }

         if(!((Class427)Class58.aClass58_693.method1025(453355987)).method5025((byte)50) && !Class652.method7783(428884743)) {
            try {
               Class636.aclient8310.method5969(-1730576285);
               Class209.method2938(806297421);
               Ping.init();
            } catch (Exception_Sub7 var8) {
               Class157.method1862(Class65.aClass65_747, var8.aString11379, var8.anInt11378 * 44688167, var8.getCause(), (byte)9);
            } catch (Throwable var9) {
               ;
            }
         }

         anInt4796 = 1342965633;
      }

      int var1;
      int var3;
      int var6;
      if(1 == -833865599 * anInt4796) {
         aClass58Array4797 = Class58.method1021(-536182098);
         Class58.aClass58_706.method1024(new Class447(Class205.aClass466_2220), (byte)2);
         Class58.aClass58_694.method1024(new Class427("jaggl"), (byte)2);
         Class427 var0 = new Class427("jagdx");
         if(!Class222.aString2308.startsWith("win")) {
            var0.method5026(-481930135);
         }

         Class58.aClass58_720.method1024(var0, (byte)2);
         Class58.aClass58_696.method1024(new Class427("sw3d"), (byte)2);
         Class58.aClass58_697.method1024(new Class427("hw3d"), (byte)2);
         Class58.aClass58_698.method1024(new Class447(Class342.aClass466_3560), (byte)2);
         Class58.aClass58_711.method1024(new Class447(Class68.aClass466_783), (byte)2);
         Class58.aClass58_700.method1024(new Class447(Class193.aClass466_2176), (byte)2);
         Class58.aClass58_704.method1024(new Class447(Class403.aClass466_4161), (byte)2);
         Class58.aClass58_699.method1024(new Class447(Class600.aClass466_7873), (byte)2);
         Class58.aClass58_703.method1024(new Class447(Class297.aClass466_3234), (byte)2);
         Class58.aClass58_719.method1024(new Class447(Class97_Sub1_Sub1.aClass466_11324), (byte)2);
         Class58.aClass58_705.method1024(new Class447(Class635.aClass466_8297), (byte)2);
         Class58.aClass58_712.method1024(new Class447(Class75.aClass466_808), (byte)2);
         Class58.aClass58_707.method1024(new Class447(Class199_Sub20.aClass466_9971), (byte)2);
         Class58.aClass58_708.method1024(new Class447(Class513.aClass466_7020), (byte)2);
         Class58.aClass58_709.method1024(new Class447(Class711_Sub16.aClass466_10862), (byte)2);
         Class58.aClass58_710.method1024(new Class447(Class48.aClass466_648), (byte)2);
         Class58.aClass58_695.method1024(new Class447(Class596.aClass466_7853), (byte)2);
         Class58.aClass58_692.method1024(new Class447(Class447.aClass466_4921), (byte)2);
         Class58.aClass58_713.method1024(new Class442(Class80.aClass466_825, "huffman"), (byte)2);
         Class58.aClass58_714.method1024(new Class447(Class159.aClass466_1768), (byte)2);
         Class58.aClass58_715.method1024(new Class447(Class526_Sub21_Sub2.aClass466_11339), (byte)2);
         Class58.aClass58_716.method1024(new Class447(Class642.aClass466_8429), (byte)2);
         Class58.aClass58_717.method1024(new Class438(Class480.aClass466_5455, 0), (byte)2);

         for(var1 = 0; var1 < aClass58Array4797.length; ++var1) {
            if(aClass58Array4797[var1].method1025(372865346) == null) {
               throw new RuntimeException();
            }
         }

         var1 = 0;
         Class58[] var2 = aClass58Array4797;

         for(var3 = 0; var3 < var2.length; ++var3) {
            Class58 var4 = var2[var3];
            int var5 = var4.method1019(-1184796068);
            var6 = var4.method1025(-338898493).method56(424761910);
            var1 += var6 * var5 / 100;
         }

         anInt4795 = -812499343 * var1;
         anInt4796 = -1609036030;
      }

      if(null == aClass58Array4797) {
         return 100;
      } else {
         int var10 = 0;
         var1 = 0;
         boolean var11 = true;
         Class58[] var12 = aClass58Array4797;

         for(int var13 = 0; var13 < var12.length; ++var13) {
            Class58 var14 = var12[var13];
            var6 = var14.method1019(-1395974172);
            int var7 = var14.method1025(-470407991).method56(1592533549);
            if(var7 < 100) {
               var11 = false;
            }

            var10 += var6;
            var1 += var6 * var7 / 100;
         }

         if(var11) {
            aClass58Array4797 = null;
         }

         var1 -= 652853905 * anInt4795;
         var10 -= 652853905 * anInt4795;
         var3 = var10 > 0?100 * var1 / var10:100;
         if(!var11 && var3 > 99) {
            var3 = 99;
         }

         return var3;
      }
   }

   static final void method5006(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub18 var3 = Class622.aClass455_8143.method5398(var2, (byte)127);
      if(null == var3.anIntArray11848) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anIntArray11848.length;
      }

   }

   static final void method5007(Class681 var0, int var1) {
      var0.anInt8630 -= -2069360090;
      if(var0.aLongArray8626[var0.anInt8630 * -1032509157] == var0.aLongArray8626[1 + -1032509157 * var0.anInt8630]) {
         var0.anInt8644 += var0.anIntArray8642[var0.anInt8644 * -244840757] * -873681181;
      }

   }

   static void method5008(Class174 var0, byte var1) {
      if(null != Class31.aClass433_288) {
         var0.method2231(Class31.aClass433_288);
         var0.method2326(Class31.aClass445_260);
         var0.method2538(532518695 * Class31.anInt284, Class31.anInt290 * -1854471021, Class31.anInt286 * 1676211751 + Class31.anInt284 * 532518695, Class31.anInt294 * -129848535 + -1854471021 * Class31.anInt290);
         var0.method2573(532518695 * Class31.anInt284, Class31.anInt290 * -1854471021, Class31.anInt286 * 1676211751, Class31.anInt294 * -129848535);
      }
   }

   static void method5009(int var0, int var1, byte var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(13, (long)var0);
      var3.method10584(230428369);
      var3.anInt11678 = var1 * 1693201951;
   }
}
