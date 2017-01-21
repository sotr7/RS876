package com.jagex;

import com.jagex.Class149_Sub1;
import com.jagex.Class204;
import com.jagex.InterfaceDef;
import com.jagex.Class270;
import com.jagex.Class315_Sub1;
import com.jagex.Class376;
import com.jagex.Class466;
import com.jagex.Class48;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub39;
import com.jagex.Class681;
import com.jagex.Interface6;
import com.jagex.client;

public class Class438 implements Interface6 {
   Class466 aClass466_4860;
   int anInt4859;

   public Class48 method52(byte var1) {
      return Class48.aClass48_646;
   }

   public int method56(int var1) {
      return this.aClass466_4860.method5538(this.anInt4859 * 1553240539, (byte)-66)?100:this.aClass466_4860.method5540(1553240539 * this.anInt4859, 1722794630);
   }

   public Class48 method54() {
      return Class48.aClass48_646;
   }

   public int method53() {
      return this.aClass466_4860.method5538(this.anInt4859 * 1553240539, (byte)-10)?100:this.aClass466_4860.method5540(1553240539 * this.anInt4859, -1661698311);
   }

   public Class48 method57() {
      return Class48.aClass48_646;
   }

   Class438(Class466 var1, int var2) {
      this.aClass466_4860 = var1;
      this.anInt4859 = var2 * -1318911405;
   }

   public Class48 method55() {
      return Class48.aClass48_646;
   }

   public int method21() {
      return this.aClass466_4860.method5538(this.anInt4859 * 1553240539, (byte)82)?100:this.aClass466_4860.method5540(1553240539 * this.anInt4859, -1833376100);
   }

   public Class48 method58() {
      return Class48.aClass48_646;
   }

   public static void openJSURL(String var0, boolean var1, boolean var2, int var3) {
      Class376.method4672(var0, var1, "openjs", var2, -580369667);
   }

   static final void method5152(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      int var3 = var2 >> 16;
      if(null == Class315_Sub1.aClass243Array10033[var3]) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         String var4 = Class315_Sub1.aClass243Array10033[var3].aClass245Array2459[var2].aString2494;
         if(var4 == null) {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
         } else {
            var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var4;
         }
      }

   }

   public static void method5153(int var0) {
      if(client.aBool11276) {
         InterfaceDef var1 = Class204.method2893(-367921651 * Class149_Sub1.uid, client.slot * 1280409375, 1312829600);
         if(var1 != null && var1.anObjectArray2615 != null) {
            Class526_Sub39 var2 = new Class526_Sub39();
            var2.aClass245_10694 = var1;
            var2.anObjectArray10701 = var1.anObjectArray2615;
            Class270.method3594(var2, 39400990);
         }

         client.anInt11178 = 2037720991;
         client.item = 71037981;
         client.aBool11276 = false;
         if(null != var1) {
            Class526_Sub31.method9555(var1, (byte)10);
         }

      }
   }
}
