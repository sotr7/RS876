package com.jagex;

import com.jagex.Class149_Sub1;
import com.jagex.Class199_Sub1;
import com.jagex.InterfaceDef;
import com.jagex.Class270;
import com.jagex.Class510;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub39;
import com.jagex.Class606;
import com.jagex.Class681;
import com.jagex.client;

public class Class475 {
   int anInt5376;
   static Class475 aClass475_5378 = new Class475(0);
   public static Class475 aClass475_5377 = new Class475(1);
   static Class475 aClass475_5381 = new Class475(2);
   public static Class475 aClass475_5379 = new Class475(3);
   public static Class475 aClass475_5385 = new Class475(4);
   public static Class475 aClass475_5380 = new Class475(5);
   static Class475 aClass475_5382 = new Class475(6);
   static Class475 aClass475_5383 = new Class475(7);
   static Class475 aClass475_5384 = new Class475(8);

   Class475(int var1) {
      this.anInt5376 = -1383311493 * var1;
   }

   static final void method5653(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aBool11157?1:0;
   }

   public static void method5654(InterfaceDef var0, int var1, int var2, int var3) {
      if(null != var0) {
         if(var0.anObjectArray2614 != null) {
            Class526_Sub39 var4 = new Class526_Sub39();
            var4.aClass245_10694 = var0;
            var4.anObjectArray10701 = var0.anObjectArray2614;
            Class270.method3594(var4, 590563285);
         }

         client.aBool11276 = true;
         Class149_Sub1.uid = 2137363861 * var0.uid;
         client.slot = 1542185927 * var0.componentSlot;
         Class199_Sub1.anInt9869 = -40560957 * var1;
         Class510.anInt6985 = 1849560063 * var2;
         client.item = 1434005743 * var0.componentItem;
         Class606.anInt7911 = var0.anInt2557 * 397091837;
         client.anInt11178 = -1410242923 * var0.anInt2537;
         Class526_Sub31.method9555(var0, (byte)10);
      }
   }
}
