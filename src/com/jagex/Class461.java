package com.jagex;

import com.jagex.Class149;
import com.jagex.Class221;
import com.jagex.Class229;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class315_Sub1;
import com.jagex.Class32;
import com.jagex.Class40_Sub15;
import com.jagex.Class493;
import com.jagex.Class522;
import com.jagex.Class593;
import com.jagex.Class615;
import com.jagex.Class681;
import java.awt.Image;

public class Class461 {
   public static Image anImage5204;
   static int anInt5205;
   static Class40_Sub15 aClass40_Sub15_5206;
   public int anInt5203;
   public static Class461 aClass461_5197 = new Class461(0);
   public static Class461 aClass461_5195 = new Class461(1);
   public static Class461 aClass461_5196 = new Class461(2);
   public static Class461 aClass461_5194 = new Class461(3);
   public static Class461 aClass461_5198 = new Class461(4);
   static Class461 aClass461_5201 = new Class461(5);
   static Class461 aClass461_5200 = new Class461(6);
   static Class461 aClass461_5199 = new Class461(7);
   static Class461 aClass461_5202 = new Class461(8);

   Class461(int var1) {
      this.anInt5203 = var1 * 2142115169;
   }

   static final void method5468(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10608, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-1036);
      Class522.method6257(-1042127423);
   }

   static final void method5469(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)14);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class278.method3685(var3, var4, true, 0, var0, -1934014086);
   }

   public static void method5470(String var0, String var1, String var2, boolean var3, int var4) {
      if(var0.length() <= 320) {
         if(Class493.method5891((byte)-3)) {
            Class229.method3178(115661581);
            Class32.aString315 = var0;
            Class32.aString344 = var1;
            Class32.aString334 = var2;
            Class32.aBool309 = var3;
            Class593.method7031(3, (byte)59);
         }
      }
   }

   static final void method5471(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2472 = Class615.method7280(var4, var2, -901984605);
      var0.aBool2560 = true;
   }
}
