package com.jagex;

import com.jagex.Class144;
import com.jagex.Class173_Sub2;
import com.jagex.Class195;
import com.jagex.Class232;
import com.jagex.InterfaceDef;
import com.jagex.Class33;
import com.jagex.Class400;
import com.jagex.Class413;
import com.jagex.Class446;
import com.jagex.Class514;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Exception_Sub2;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class Class376 {
   static Class173_Sub2[] aClass173_Sub2Array3912;
   public static Class400 aClass400_3913;
   public static Class376 aClass376_3908 = new Class376();
   public static Class376 aClass376_3905 = new Class376();
   public static Class376 aClass376_3907 = new Class376();
   public static Class376 aClass376_3906 = new Class376();
   public static Class376 aClass376_3909 = new Class376();
   public static Class376 aClass376_3910 = new Class376();
   public static Class376 aClass376_3911 = new Class376();

   public static void method4672(String var0, boolean var1, String var2, boolean var3, int var4) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var6) {
               ;
            }
         }

         if(Class514.aString7025.startsWith("win") && !var3) {
            Class144.method1672(var0, 0, 170415238);
            return;
         }

         if(Class514.aString7025.startsWith("mac")) {
            Class232.method3261(var0, 1, var2, -1514081739);
            return;
         }

         Class144.method1672(var0, 2, 170415238);
      } else {
         Class144.method1672(var0, 3, 170415238);
      }

   }

   static final void method4673(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Integer.toString(var2);
   }

   static final void method4674(Class681 var0, byte var1) {
      Class413.aClass413_4440.method4915((byte)1);
   }

   static final void method4675(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2510 * -99858407;
   }

   static final void method4676(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class33.method813(var2 >> 14 & 16383, var2 & 16383, (short)7503);
   }

   static final void method4677(Class681 var0, byte var1) throws Exception_Sub2 {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      Class446 var5 = Class446.method5309((float)var2, (float)var3, (float)var4);
      Class195.aClass292_Sub1_2182.method3899(var5, (byte)-23);
      var5.method5278();
   }
}
