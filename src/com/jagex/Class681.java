package com.jagex;

import com.jagex.Class149;
import com.jagex.Class204;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class348;
import com.jagex.PacketFrameDecoder;
import com.jagex.Class451;
import com.jagex.Class508;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub9;
import com.jagex.Class615;
import com.jagex.Class623;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class639_Sub1_Sub4_Sub1;
import com.jagex.Class659;
import com.jagex.Class679;
import com.jagex.Interface59;
import java.util.HashMap;
import java.util.Map;

public class Class681 {
   Object[] anObjectArray8618;
   long[] aLongArray8619;
   boolean aBool8628;
   Class526_Sub21_Sub19 aClass526_Sub21_Sub19_8629;
   PacketFrameDecoder aClass392_8632;
   Class348 aClass348_8633;
   Class508[] aClass508Array8634;
   Class639_Sub1_Sub2_Sub1 aClass639_Sub1_Sub2_Sub1_8635;
   Interface59 anInterface59_8636;
   Class639_Sub1_Sub4_Sub1 aClass639_Sub1_Sub4_Sub1_8637;
   int anInt8641;
   int[] anIntArray8642;
   int[] anIntArray8643;
   Class526_Sub9 aClass526_Sub9_8646;
   int[] anIntArray8620 = new int[5];
   int[][] anIntArrayArray8645 = new int[5][5000];
   int[] anIntArray8622 = new int[1000];
   int anInt8623 = 0;
   Object[] anObjectArray8624 = new Object[1000];
   int anInt8625 = 0;
   long[] aLongArray8626 = new long[1000];
   int anInt8630 = 0;
   int anInt8617 = 0;
   Class659[] aClass659Array8639 = new Class659[50];
   Class679 aClass679_8621 = new Class679();
   Class679 aClass679_8631 = new Class679();
   Map aMap8638 = new HashMap();
   Map aMap8627 = new HashMap();
   int anInt8640 = 0;
   int anInt8644 = 873681181;

   static final void method8027(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= -1578695711;
      var0.anInt2577 = -1269245821 * var2.anIntArray8622[-1730576285 * var2.anInt8623];
      var0.anInt2578 = -392684621 * var2.anIntArray8622[1 + -1730576285 * var2.anInt8623];
      var0.anInt2488 = -951272779 * var2.anIntArray8622[var2.anInt8623 * -1730576285 + 2];
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method8028(Class681 var0, byte var1) {
      String var2;
      if(null != Class451.localPlayer && null != Class451.localPlayer.aString12175) {
         var2 = Class451.localPlayer.method10977(true, (byte)21);
      } else {
         var2 = "";
      }

      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var2;
   }

   static final void method8029(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2643 = Class615.method7280(var4, var2, -1637297282);
      var0.aBool2560 = true;
   }

   public static void method8030(int var0, byte var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(11, (long)var0);
      var2.method10583((byte)-123);
   }

   static final void method8031(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      Class623.method7411(var4, Class204.method2893(var2, var3, 819120431), var0, 1221376142);
   }
}
