package com.jagex;

import com.jagex.Class273;
import com.jagex.Class285;
import com.jagex.Class460_Sub1;
import com.jagex.Class526_Sub24;
import com.jagex.Class566;
import com.jagex.Class639_Sub1_Sub2_Sub1_Sub1;
import com.jagex.Class681;
import com.jagex.Interface14;
import com.jagex.Interface19;
import com.jagex.client;

public class Class474 {
   static int anInt5375;
   int anInt5373;
   public boolean aBool5374;
   static Class474 aClass474_5369 = new Class474(0, false);
   public static Class474 aClass474_5365 = new Class474(1, false);
   static Class474 aClass474_5371 = new Class474(2, false);
   static Class474 aClass474_5367 = new Class474(3, false);
   static Class474 aClass474_5364 = new Class474(4, false);
   static Class474 aClass474_5368 = new Class474(5, true);
   static Class474 aClass474_5370 = new Class474(6, true);
   static Class474 aClass474_5366 = new Class474(7, true);
   static Class474 aClass474_5372 = new Class474(8, true);

   Class474(int var1, boolean var2) {
      this.anInt5373 = -1884092337 * var1;
      this.aBool5374 = var2;
   }

   static int method5648(Interface19 var0, Interface14 var1, int var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1.method87(-1642944435); ++var4) {
         Class285 var5 = (Class285)var1.method89(var4, -659680258);
         if(var5.method3790(var0, 1453293452)) {
            var3 += -250286175 * var5.anInt3083;
         }
      }

      return var3;
   }

   static Class273[] method5649(int var0) {
      return new Class273[]{Class273.aClass273_3003, Class273.aClass273_3004, Class273.aClass273_3007, Class273.aClass273_3001, Class273.aClass273_3000, Class273.aClass273_3005};
   }

   static final void method5650(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.aByte3629;
   }

   static final void method5651(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class639_Sub1_Sub2_Sub1_Sub1)var0.aClass639_Sub1_Sub2_Sub1_8635).method10977(true, (byte)116);
   }

   static final void method5652(boolean var0, short var1) {
      Class460_Sub1.method9304(client.anInt11186 * -327748687, 1895615023 * Class566.anInt7611, Class526_Sub24.anInt10549 * 974996221, var0, -2058416463);
   }
}
