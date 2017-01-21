package com.jagex;

import com.jagex.Class195;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class471;
import com.jagex.Class526_Sub29;
import com.jagex.Class539_Sub4;
import com.jagex.Class545;
import com.jagex.Class553;
import com.jagex.Class593;
import com.jagex.Class642;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class689_Sub2;
import com.jagex.Class690;
import com.jagex.Interface63;
import com.jagex.Interface67;
import com.jagex.client;

public class Class573 implements Interface67 {
   static int anInt7689;
   int anInt7688;
   int anInt7687;

   public boolean method436(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4) {
      for(int var5 = 0; var5 < var3 && var5 < var2.length; ++var5) {
         Interface63 var6 = var2[var5];
         if(null != var6 && var6.method421(396454789) == -1677356861 * this.anInt7688 && var6.method424(2111179032) == this.anInt7687 * -1946430031) {
            return true;
         }
      }

      return false;
   }

   public boolean method434(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4, int var5) {
      for(int var6 = 0; var6 < var3 && var6 < var2.length; ++var6) {
         Interface63 var7 = var2[var6];
         if(null != var7 && var7.method421(-971074786) == -1677356861 * this.anInt7688 && var7.method424(696203391) == this.anInt7687 * -1946430031) {
            return true;
         }
      }

      return false;
   }

   public boolean method435(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4) {
      for(int var5 = 0; var5 < var3 && var5 < var2.length; ++var5) {
         Interface63 var6 = var2[var5];
         if(null != var6 && var6.method421(876656366) == -1677356861 * this.anInt7688 && var6.method424(1705138158) == this.anInt7687 * -1946430031) {
            return true;
         }
      }

      return false;
   }

   Class573(int var1, int var2) {
      this.anInt7688 = var1 * 644456427;
      this.anInt7687 = -1395043503 * var2;
   }

   static final void method6913(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class642.method7658(var3, var4, var0, -1426195587);
   }

   static final void method6914(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      if(Class195.aClass292_Sub1_2182.method3940(-1607028355) != Class298.aClass298_3241) {
         throw new RuntimeException();
      } else {
         ((Class689_Sub2)Class195.aClass292_Sub1_2182.method3938((byte)26)).method10205(var0.anIntArray8622[var0.anInt8623 * -1730576285], var0.anIntArray8622[1 + -1730576285 * var0.anInt8623], var0.anIntArray8622[-1730576285 * var0.anInt8623 + 2], 1843839397);
      }
   }

   static final void method6915(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class690.method8098(8, var2, var3, "", -429252788);
   }

   static final void method6916(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      Class471.method5634(var0.anIntArray8622[-1730576285 * var0.anInt8623], var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1], 0, -238649033);
   }

   static final void method6917(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class539_Sub4.method9293(var2, var3, true, (short)15411);
   }

   static void method6918(int var0) {
      if(Class545.method6513(-558705405 * client.anInt11038, 1465283087)) {
         if(client.aClass111_11059.method1364(-1184311292) == null) {
            Class593.method7031(1, (byte)18);
         } else {
            Class593.method7031(0, (byte)58);
         }
      } else if(client.anInt11038 * -558705405 != 1 && -558705405 * client.anInt11038 != 3) {
         if(-558705405 * client.anInt11038 == 4) {
            Class593.method7031(16, (byte)61);
         }
      } else {
         Class593.method7031(16, (byte)42);
      }

   }
}
