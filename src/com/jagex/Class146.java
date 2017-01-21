package com.jagex;

import com.jagex.Class11;
import com.jagex.Class176;
import com.jagex.Class291;
import com.jagex.Class32;
import com.jagex.Class361_Sub2;
import com.jagex.Class448_Sub1;
import com.jagex.Class460_Sub1;
import com.jagex.Class463;
import com.jagex.Class479;
import com.jagex.Class539_Sub1;
import com.jagex.Class555;
import com.jagex.Class593;
import com.jagex.Class681;
import com.jagex.client;
import java.util.Comparator;

class Class146 implements Comparator {
   // $FF: synthetic field
   Class361_Sub2 this$0;

   public boolean method1688(Object var1) {
      return super.equals(var1);
   }

   public int method1689(Object var1, Object var2) {
      return this.method1690((Class479)var1, (Class479)var2, -415741303);
   }

   int method1690(Class479 var1, Class479 var2, int var3) {
      float var4 = var1.method5684(-1120126182);
      float var5 = var2.method5684(-1120126182);
      return var5 > var4?1:(var5 < var4?-1:0);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1690((Class479)var1, (Class479)var2, -745382243);
   }

   public int method1691(Object var1, Object var2) {
      return this.method1690((Class479)var1, (Class479)var2, -1794305316);
   }

   public int method1692(Object var1, Object var2) {
      return this.method1690((Class479)var1, (Class479)var2, -1232394180);
   }

   Class146(Class361_Sub2 var1) {
      this.this$0 = var1;
   }

   public boolean method1693(Object var1) {
      return super.equals(var1);
   }

   public boolean method1694(Object var1) {
      return super.equals(var1);
   }

   static final void method1695(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623] - 1;
      Class11 var4 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -1678438668);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4.method598(var3, 592726335);
   }

   static final void method1696(Class681 var0, byte var1) {
      var0.anInt8623 -= 758383916;
      client.aShort11211 = (short)var0.anIntArray8622[var0.anInt8623 * -1730576285];
      if(client.aShort11211 <= 0) {
         client.aShort11211 = 1;
      }

      client.aShort11189 = (short)var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      if(client.aShort11189 <= 0) {
         client.aShort11189 = 32767;
      } else if(client.aShort11189 < client.aShort11211) {
         client.aShort11189 = client.aShort11211;
      }

      client.aShort11280 = (short)var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      if(client.aShort11280 <= 0) {
         client.aShort11280 = 1;
      }

      client.aShort11144 = (short)var0.anIntArray8622[-1730576285 * var0.anInt8623 + 3];
      if(client.aShort11144 <= 0) {
         client.aShort11144 = 32767;
      } else if(client.aShort11144 < client.aShort11280) {
         client.aShort11144 = client.aShort11280;
      }

   }

   public static void method1697(byte var0) {
      Class291.aBool3132 = true;
      Class463.aString5231 = Class32.aString315;
      Class555.aString7480 = Class32.aString344;
      Class460_Sub1.logout(false, -1730576285);
      Class176.method2658(2002936867);
      Class291.aClass296Array3135 = null;
      Class539_Sub1.aClass429_10297 = null;
      Class593.method7031(18, (byte)93);
   }
}
