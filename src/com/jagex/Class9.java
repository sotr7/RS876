package com.jagex;

import com.jagex.Class11;
import com.jagex.Class12;
import com.jagex.Class153;
import com.jagex.Class163;
import com.jagex.Class174;
import com.jagex.Class192;
import com.jagex.Class45;
import com.jagex.Class466;
import com.jagex.Class597;
import com.jagex.Class613;
import com.jagex.Class633;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Interface14;
import com.jagex.Interface7;

public abstract class Class9 implements Interface7 {
   int anInt46;
   boolean aBool47;
   Class192 aClass192_49 = new Class192(50);
   Class597 aClass597_53 = new Class597(250);
   Class12 aClass12_51 = new Class12();
   Class673 aClass673_50;
   Class466 aClass466_48;
   Interface14 anInterface14_52;
   String[] aStringArray54;
   String[] aStringArray55;

   void method560(int var1) {
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2769(var1, (byte)-89);
      }

      Class597 var7 = this.aClass597_53;
      synchronized(var7) {
         this.aClass597_53.method7066(var1);
      }
   }

   void method561(int var1) {
      this.anInt46 = -666885953 * var1;
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2770(1153025671);
      }
   }

   Class153 method562(Class174 var1, Class174 var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, int var9, Class163 var10, Class633 var11, Class613 var12, Interface14 var13, byte var14) {
      if(!var8) {
         Class153 var15 = this.method577(var2, var3, var4, var5, var6, var9, var11, (byte)-3);
         if(null != var15) {
            return var15;
         }
      }

      Class11 var19 = (Class11)var13.method89(var3, -950321069);
      if(var4 > 1 && var19.anIntArray119 != null) {
         int var16 = -1;

         for(int var17 = 0; var17 < 10; ++var17) {
            if(var4 >= var19.anIntArray118[var17] && 0 != var19.anIntArray118[var17]) {
               var16 = var19.anIntArray119[var17];
            }
         }

         if(var16 != -1) {
            var19 = (Class11)var13.method89(var16, -1086368510);
         }
      }

      int[] var20 = var19.method589(var1, var2, var4, var5, var6, var7, var9, var10, var11, var12, (byte)124);
      if(var20 == null) {
         return null;
      } else {
         Class153 var21;
         if(var8) {
            var21 = var1.method2515(var20, 0, 36, 36, 32, (byte)3);
         } else {
            var21 = var2.method2515(var20, 0, 36, 36, 32, (byte)3);
         }

         if(!var8) {
            Class12 var18 = new Class12();
            var18.anInt151 = var2.anInt2030 * -433500413;
            var18.anInt147 = var3 * -417452515;
            var18.anInt150 = var4 * -1666584247;
            var18.anInt149 = 1246830595 * var5;
            var18.anInt148 = var6 * -747396943;
            var18.anInt146 = 1114406775 * var9;
            var18.aBool152 = null != var11;
            this.aClass597_53.method7062(var21, var18);
         }

         return var21;
      }
   }

   void method563() {
      Class192 var1 = this.aClass192_49;
      synchronized(var1) {
         this.aClass192_49.method2772(240702531);
      }

      Class597 var6 = this.aClass597_53;
      synchronized(var6) {
         this.aClass597_53.method7068();
      }
   }

   void method564() {
      Class192 var1 = this.aClass192_49;
      synchronized(var1) {
         this.aClass192_49.method2770(320950142);
      }

      Class597 var6 = this.aClass597_53;
      synchronized(var6) {
         this.aClass597_53.method7067();
      }
   }

   void method565(int var1) {
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2770(670991685);
      }

      Class597 var7 = this.aClass597_53;
      synchronized(var7) {
         this.aClass597_53.method7067();
      }
   }

   void method566(int var1) {
      Class597 var2 = this.aClass597_53;
      synchronized(var2) {
         this.aClass597_53.method7067();
      }
   }

   void method567(int var1, int var2) {
      this.anInt46 = -666885953 * var1;
      Class192 var3 = this.aClass192_49;
      synchronized(var3) {
         this.aClass192_49.method2770(1245250209);
      }
   }

   void method568(int var1) {
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2772(1186157138);
      }

      Class597 var7 = this.aClass597_53;
      synchronized(var7) {
         this.aClass597_53.method7068();
      }
   }

   void method569(int var1, int var2) {
      Class192 var3 = this.aClass192_49;
      synchronized(var3) {
         this.aClass192_49.method2769(var1, (byte)-26);
      }

      Class597 var8 = this.aClass597_53;
      synchronized(var8) {
         this.aClass597_53.method7066(var1);
      }
   }

   void method570(boolean var1, int var2) {
      if(this.aBool47 != var1) {
         this.aBool47 = var1;
         this.method565(-1953245904);
      }
   }

   void method571(int var1) {
      this.anInt46 = -666885953 * var1;
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2770(1286577347);
      }
   }

   void method572(int var1) {
      this.anInt46 = -666885953 * var1;
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2770(2029596455);
      }
   }

   void method573(int var1) {
      this.anInt46 = -666885953 * var1;
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2770(966228911);
      }
   }

   Class9(Class676 var1, Class673 var2, boolean var3, Class466 var4, Interface14 var5) {
      this.aClass673_50 = var2;
      this.aBool47 = var3;
      this.aClass466_48 = var4;
      this.anInterface14_52 = var5;
      if(var1 == Class676.aClass676_8589) {
         this.aStringArray54 = new String[]{null, null, Class45.aClass45_487.method920(this.aClass673_50, -827840379), null, null, Class45.aClass45_591.method920(this.aClass673_50, -827840379)};
      } else {
         this.aStringArray54 = new String[]{null, null, Class45.aClass45_487.method920(this.aClass673_50, -827840379), null, null, null};
      }

      this.aStringArray55 = new String[]{null, null, null, null, Class45.aClass45_476.method920(this.aClass673_50, -827840379)};
   }

   void method574(int var1) {
      this.anInt46 = -666885953 * var1;
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2770(875799079);
      }
   }

   void method575(int var1) {
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2769(var1, (byte)-60);
      }

      Class597 var7 = this.aClass597_53;
      synchronized(var7) {
         this.aClass597_53.method7066(var1);
      }
   }

   void method576(int var1) {
      Class192 var2 = this.aClass192_49;
      synchronized(var2) {
         this.aClass192_49.method2769(var1, (byte)-53);
      }

      Class597 var7 = this.aClass597_53;
      synchronized(var7) {
         this.aClass597_53.method7066(var1);
      }
   }

   Class153 method577(Class174 var1, int var2, int var3, int var4, int var5, int var6, Class633 var7, byte var8) {
      this.aClass12_51.anInt151 = var1.anInt2030 * -433500413;
      this.aClass12_51.anInt147 = -417452515 * var2;
      this.aClass12_51.anInt150 = var3 * -1666584247;
      this.aClass12_51.anInt149 = var4 * 1246830595;
      this.aClass12_51.anInt148 = -747396943 * var5;
      this.aClass12_51.anInt146 = var6 * 1114406775;
      this.aClass12_51.aBool152 = null != var7;
      return (Class153)this.aClass597_53.method7064(this.aClass12_51);
   }

   void method578() {
      Class192 var1 = this.aClass192_49;
      synchronized(var1) {
         this.aClass192_49.method2772(1701627935);
      }

      Class597 var6 = this.aClass597_53;
      synchronized(var6) {
         this.aClass597_53.method7068();
      }
   }
}
