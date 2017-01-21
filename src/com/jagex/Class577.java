package com.jagex;

import com.jagex.Class184_Sub2;
import com.jagex.Class195;
import com.jagex.Class220;
import com.jagex.Class231;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class466;
import com.jagex.Class526_Sub29;
import com.jagex.Class553;
import com.jagex.Class57;
import com.jagex.Class608;
import com.jagex.Class612_Sub1;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class707;
import com.jagex.Exception_Sub2;
import com.jagex.Interface63;
import com.jagex.Interface67;
import com.jagex.client;

public class Class577 implements Interface67 {
   public static Class466 aClass466_7744;
   int anInt7743;
   int anInt7741;
   int[] anIntArray7742;

   Class577(int var1, int var2, int[] var3) {
      this.anInt7743 = var1 * -417904109;
      this.anInt7741 = var2 * 2097942115;
      this.anIntArray7742 = var3;
   }

   public boolean method434(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4, int var5) {
      if(null == var1) {
         if(1101926427 * this.anInt7743 != -1) {
            return false;
         }
      } else {
         if(this.anInt7743 * 1101926427 != var1.method9528((byte)-7)) {
            return false;
         }

         if(-78453941 * this.anInt7741 > var1.method9531(1512705234)) {
            return false;
         }

         int[] var6 = this.anIntArray7742;

         for(int var7 = 0; var7 < var6.length; ++var7) {
            int var8 = var6[var7];
            if(!var4.method6666(var8, 511297784)) {
               return false;
            }
         }
      }

      return true;
   }

   public boolean method435(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4) {
      if(null == var1) {
         if(1101926427 * this.anInt7743 != -1) {
            return false;
         }
      } else {
         if(this.anInt7743 * 1101926427 != var1.method9528((byte)-96)) {
            return false;
         }

         if(-78453941 * this.anInt7741 > var1.method9531(252998576)) {
            return false;
         }

         int[] var5 = this.anIntArray7742;

         for(int var6 = 0; var6 < var5.length; ++var6) {
            int var7 = var5[var6];
            if(!var4.method6666(var7, 795701107)) {
               return false;
            }
         }
      }

      return true;
   }

   public boolean method436(Class526_Sub29 var1, Interface63[] var2, int var3, Class553 var4) {
      if(null == var1) {
         if(1101926427 * this.anInt7743 != -1) {
            return false;
         }
      } else {
         if(this.anInt7743 * 1101926427 != var1.method9528((byte)-44)) {
            return false;
         }

         if(-78453941 * this.anInt7741 > var1.method9531(1772360408)) {
            return false;
         }

         int[] var5 = this.anIntArray7742;

         for(int var6 = 0; var6 < var5.length; ++var6) {
            int var7 = var5[var6];
            if(!var4.method6666(var7, 734438771)) {
               return false;
            }
         }
      }

      return true;
   }

   static final void method6940(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class220.method3045(var3, var4, var0, 647211422);
   }

   static final void method6941(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class231.method3253(var3, var0, 1183812117);
   }

   static final void method6942(Class681 var0, byte var1) throws Exception_Sub2 {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class195.aClass292_Sub1_2182.method3891(Class184_Sub2.method8481(var2, -2144462310), true, (byte)1);
      client.aBool11070 = true;
   }

   public static Class612_Sub1 method6943(int var0, byte var1) {
      return Class608.aBool7915 && var0 >= 1255104167 * Class608.anInt7919 && var0 <= -610389965 * Class57.anInt691?Class707.aClass612_Sub1Array8837[var0 - Class608.anInt7919 * 1255104167]:null;
   }
}
