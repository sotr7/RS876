package com.jagex;

import com.jagex.Class1;
import com.jagex.Class101;
import com.jagex.Class113;
import com.jagex.Class163;
import com.jagex.Class173_Sub2;
import com.jagex.Class176;
import com.jagex.Class181;
import com.jagex.Class234;
import com.jagex.Class235;
import com.jagex.Class255;
import com.jagex.Class309;
import com.jagex.Class376;
import com.jagex.Class380;
import com.jagex.Class40_Sub8;
import com.jagex.Class466;
import com.jagex.Class5;
import com.jagex.Class52;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub14;
import com.jagex.Class526_Sub35;
import com.jagex.Class526_Sub42;
import com.jagex.Class554;
import com.jagex.Class610;
import com.jagex.Class627;
import com.jagex.Class642;
import com.jagex.Class687;
import com.jagex.Class688;
import com.jagex.Class695;
import com.jagex.Interface33;
import com.jagex.client;

public abstract class Class325 implements Interface33 {
   static int anInt3475;
   Class163 aClass163_3472;
   int anInt3470;
   long aLong3469;
   Class466 aClass466_3474;
   Class466 aClass466_3473;
   Class380 aClass380_3471;

   public boolean method226() {
      boolean var1 = true;
      if(!this.aClass466_3474.method5537(this.aClass380_3471.anInt3935 * 2079046623, (byte)89)) {
         var1 = false;
      }

      if(!this.aClass466_3473.method5537(2079046623 * this.aClass380_3471.anInt3935, (byte)38)) {
         var1 = false;
      }

      return var1;
   }

   public void method233(boolean var1, int var2) {
      int var3 = this.aClass380_3471.aClass384_3932.method4725(-219376461 * this.aClass380_3471.anInt3936, client.anInt11229 * 1969269047, (byte)116) + this.aClass380_3471.anInt3930 * 1035562863;
      int var4 = this.aClass380_3471.aClass389_3929.method4771(874500417 * this.aClass380_3471.anInt3933, client.anInt11240 * 172204199, (byte)0) + this.aClass380_3471.anInt3931 * 26479163;
      this.method4171(var1, var3, var4, -1288609095);
      this.method4168(var1, var3, var4, 646870994);
      String var5 = Class309.aClass290_3377.method3832((byte)15);
      if(Class255.time((byte)24) - 4453924221500045397L * this.aLong3469 > 10000L) {
         var5 = var5 + " (" + Class309.aClass290_3377.method3845(-1857541175).anInt3204 * -264913027 + ")";
      }

      this.aClass163_3472.method1911(var5, var3 + -219376461 * this.aClass380_3471.anInt3936 / 2, var4 + this.aClass380_3471.anInt3933 * 874500417 / 2 + 4 + this.aClass380_3471.anInt3934 * -1403557073, this.aClass380_3471.anInt3928 * 252950473, -1, (byte)-1);
   }

   public void method228(int var1) {
      Class1 var2 = Class176.method2656(this.aClass466_3473, this.aClass380_3471.anInt3935 * 2079046623, Class627.aClass418_8195, -945621872);
      this.aClass163_3472 = Class554.aClass174_7475.method2313(var2, Class181.method2682(this.aClass466_3474, this.aClass380_3471.anInt3935 * 2079046623), true);
   }

   public boolean method227(short var1) {
      boolean var2 = true;
      if(!this.aClass466_3474.method5537(this.aClass380_3471.anInt3935 * 2079046623, (byte)29)) {
         var2 = false;
      }

      if(!this.aClass466_3473.method5537(2079046623 * this.aClass380_3471.anInt3935, (byte)66)) {
         var2 = false;
      }

      return var2;
   }

   public void method231(boolean var1) {
      int var2 = this.aClass380_3471.aClass384_3932.method4725(-219376461 * this.aClass380_3471.anInt3936, client.anInt11229 * 1969269047, (byte)-28) + this.aClass380_3471.anInt3930 * 1035562863;
      int var3 = this.aClass380_3471.aClass389_3929.method4771(874500417 * this.aClass380_3471.anInt3933, client.anInt11240 * 172204199, (byte)0) + this.aClass380_3471.anInt3931 * 26479163;
      this.method4171(var1, var2, var3, -1288609095);
      this.method4168(var1, var2, var3, 118229533);
      String var4 = Class309.aClass290_3377.method3832((byte)15);
      if(Class255.time((byte)24) - 4453924221500045397L * this.aLong3469 > 10000L) {
         var4 = var4 + " (" + Class309.aClass290_3377.method3845(-2069997420).anInt3204 * -264913027 + ")";
      }

      this.aClass163_3472.method1911(var4, var2 + -219376461 * this.aClass380_3471.anInt3936 / 2, var3 + this.aClass380_3471.anInt3933 * 874500417 / 2 + 4 + this.aClass380_3471.anInt3934 * -1403557073, this.aClass380_3471.anInt3928 * 252950473, -1, (byte)-14);
   }

   abstract void method4168(boolean var1, int var2, int var3, int var4);

   int method4169(byte var1) {
      int var2 = Class309.aClass290_3377.method3831((byte)-13);
      int var3 = var2 * 100;
      if(2054873765 * this.anInt3470 == var2 && 0 != var2) {
         int var4 = Class309.aClass290_3377.method3830((short)-25003);
         if(var4 > var2) {
            long var5 = this.aLong3469 * 4453924221500045397L - Class309.aClass290_3377.method3838(1953688951);
            if(var5 > 0L) {
               long var7 = (long)(var4 - var2) * (var5 * 10000L / (long)var2);
               long var9 = (Class255.time((byte)24) - 4453924221500045397L * this.aLong3469) * 10000L;
               if(var9 < var7) {
                  var3 = (int)((long)(var4 - var2) * var9 * 100L / var7 + (long)(100 * var2));
               } else {
                  var3 = var4 * 100;
               }
            }
         }
      } else {
         this.anInt3470 = var2 * -1838009043;
         this.aLong3469 = Class255.time((byte)24) * 4362828854329509117L;
      }

      return var3;
   }

   public void method229(boolean var1) {
      int var2 = this.aClass380_3471.aClass384_3932.method4725(-219376461 * this.aClass380_3471.anInt3936, client.anInt11229 * 1969269047, (byte)-23) + this.aClass380_3471.anInt3930 * 1035562863;
      int var3 = this.aClass380_3471.aClass389_3929.method4771(874500417 * this.aClass380_3471.anInt3933, client.anInt11240 * 172204199, (byte)0) + this.aClass380_3471.anInt3931 * 26479163;
      this.method4171(var1, var2, var3, -1288609095);
      this.method4168(var1, var2, var3, 83981225);
      String var4 = Class309.aClass290_3377.method3832((byte)15);
      if(Class255.time((byte)24) - 4453924221500045397L * this.aLong3469 > 10000L) {
         var4 = var4 + " (" + Class309.aClass290_3377.method3845(-2113862718).anInt3204 * -264913027 + ")";
      }

      this.aClass163_3472.method1911(var4, var2 + -219376461 * this.aClass380_3471.anInt3936 / 2, var3 + this.aClass380_3471.anInt3933 * 874500417 / 2 + 4 + this.aClass380_3471.anInt3934 * -1403557073, this.aClass380_3471.anInt3928 * 252950473, -1, (byte)75);
   }

   public void method230(boolean var1) {
      int var2 = this.aClass380_3471.aClass384_3932.method4725(-219376461 * this.aClass380_3471.anInt3936, client.anInt11229 * 1969269047, (byte)1) + this.aClass380_3471.anInt3930 * 1035562863;
      int var3 = this.aClass380_3471.aClass389_3929.method4771(874500417 * this.aClass380_3471.anInt3933, client.anInt11240 * 172204199, (byte)0) + this.aClass380_3471.anInt3931 * 26479163;
      this.method4171(var1, var2, var3, -1288609095);
      this.method4168(var1, var2, var3, 842003221);
      String var4 = Class309.aClass290_3377.method3832((byte)15);
      if(Class255.time((byte)24) - 4453924221500045397L * this.aLong3469 > 10000L) {
         var4 = var4 + " (" + Class309.aClass290_3377.method3845(-1944162980).anInt3204 * -264913027 + ")";
      }

      this.aClass163_3472.method1911(var4, var2 + -219376461 * this.aClass380_3471.anInt3936 / 2, var3 + this.aClass380_3471.anInt3933 * 874500417 / 2 + 4 + this.aClass380_3471.anInt3934 * -1403557073, this.aClass380_3471.anInt3928 * 252950473, -1, (byte)-7);
   }

   abstract void method4170(boolean var1, int var2, int var3);

   abstract void method4171(boolean var1, int var2, int var3, int var4);

   public boolean method232() {
      boolean var1 = true;
      if(!this.aClass466_3474.method5537(this.aClass380_3471.anInt3935 * 2079046623, (byte)81)) {
         var1 = false;
      }

      if(!this.aClass466_3473.method5537(2079046623 * this.aClass380_3471.anInt3935, (byte)115)) {
         var1 = false;
      }

      return var1;
   }

   public void method234() {
      Class1 var1 = Class176.method2656(this.aClass466_3473, this.aClass380_3471.anInt3935 * 2079046623, Class627.aClass418_8195, 1732129583);
      this.aClass163_3472 = Class554.aClass174_7475.method2313(var1, Class181.method2682(this.aClass466_3474, this.aClass380_3471.anInt3935 * 2079046623), true);
   }

   abstract void method4172(boolean var1, int var2, int var3);

   abstract void method4173(boolean var1, int var2, int var3);

   Class325(Class466 var1, Class466 var2, Class380 var3) {
      this.aClass466_3474 = var1;
      this.aClass466_3473 = var2;
      this.aClass380_3471 = var3;
   }

   abstract void method4174(boolean var1, int var2, int var3);

   abstract void method4175(boolean var1, int var2, int var3);

   abstract void method4176(boolean var1, int var2, int var3);

   abstract void method4177(boolean var1, int var2, int var3);

   int method4178() {
      int var1 = Class309.aClass290_3377.method3831((byte)-17);
      int var2 = var1 * 100;
      if(2054873765 * this.anInt3470 == var1 && 0 != var1) {
         int var3 = Class309.aClass290_3377.method3830((short)-4692);
         if(var3 > var1) {
            long var4 = this.aLong3469 * 4453924221500045397L - Class309.aClass290_3377.method3838(1953688951);
            if(var4 > 0L) {
               long var6 = (long)(var3 - var1) * (var4 * 10000L / (long)var1);
               long var8 = (Class255.time((byte)24) - 4453924221500045397L * this.aLong3469) * 10000L;
               if(var8 < var6) {
                  var2 = (int)((long)(var3 - var1) * var8 * 100L / var6 + (long)(100 * var1));
               } else {
                  var2 = var3 * 100;
               }
            }
         }
      } else {
         this.anInt3470 = var1 * -1838009043;
         this.aLong3469 = Class255.time((byte)24) * 4362828854329509117L;
      }

      return var2;
   }

   static boolean method4179(byte var0) {
      boolean var1 = true;
      if(null == Class101.aClass173_1213) {
         if(Class113.aClass466_1370.method5537(Class234.anInt2389 * 1100539537, (byte)100)) {
            Class101.aClass173_1213 = Class181.method2680(Class113.aClass466_1370, 1100539537 * Class234.anInt2389);
         } else {
            var1 = false;
         }
      }

      if(null == Class526_Sub21_Sub14.aClass173_11824) {
         if(Class113.aClass466_1370.method5537(-725313465 * Class695.anInt8753, (byte)82)) {
            Class526_Sub21_Sub14.aClass173_11824 = Class181.method2680(Class113.aClass466_1370, Class695.anInt8753 * -725313465);
         } else {
            var1 = false;
         }
      }

      if(null == Class687.aClass173_8678) {
         if(Class113.aClass466_1370.method5537(Class235.anInt2390 * 1826443167, (byte)125)) {
            Class687.aClass173_8678 = Class181.method2680(Class113.aClass466_1370, 1826443167 * Class235.anInt2390);
         } else {
            var1 = false;
         }
      }

      if(null == Class101.aClass1_1209) {
         if(Class642.aClass466_8429.method5537(Class101.anInt1212 * 1794949691, (byte)38)) {
            Class101.aClass1_1209 = Class627.aClass418_8195.method4964(client.anInterface51_11046, 1794949691 * Class101.anInt1212, (byte)2);
         } else {
            var1 = false;
         }
      }

      if(Class376.aClass173_Sub2Array3912 == null) {
         if(Class113.aClass466_1370.method5537(Class101.anInt1212 * 1794949691, (byte)116)) {
            Class376.aClass173_Sub2Array3912 = (Class173_Sub2[])((Class173_Sub2[])Class181.method2682(Class113.aClass466_1370, 1794949691 * Class101.anInt1212));
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public static boolean method4180(int var0) {
      Class526_Sub42 var1 = (Class526_Sub42)Class52.aClass702_664.method8206((byte)31);
      return null != var1;
   }

   static final boolean method4181(Class40_Sub8 var0, int var1, int var2, byte var3) {
      Class610 var4 = (Class610)var0.method89(var1, -1651560694);
      if(11 == var2) {
         var2 = 10;
      }

      if(var2 >= 5 && var2 <= 8) {
         var2 = 4;
      }

      return var4.method7174(var2, -1754405788);
   }

   static void method4182(int var0) {
      Class380.aClass702_3937 = null;
      Class525_Sub1.anInt10714 = 0;
      Class525_Sub1.anInt7085 = 0;
      Class688.aClass245_8690 = null;
      Class525_Sub1.method6278();
      Class525_Sub1.aClass702_7106.method8188(1812302964);
      Class525_Sub1.aClass519_7117 = null;
      Class525_Sub1.aClass192_7089.method2770(3755444);
      Class525_Sub1.aClass192_7132.method2770(2053868942);
      Class526_Sub35.aClass153_10669 = null;
      Class525_Sub1.anInt10710 = 608366201;
      Class525_Sub1.anInt10711 = -805427121;
      if(Class525_Sub1.aClass40_Sub6_7088 != null) {
         Class525_Sub1.aClass40_Sub6_7088.method864((byte)-94);
         Class525_Sub1.aClass40_Sub6_7088.method10253(128, 64, -1842632379);
      }

      if(null != Class525_Sub1.aClass40_Sub3_7112) {
         Class525_Sub1.aClass40_Sub3_7112.method10242(64, 64, (byte)-56);
      }

      if(null != Class525_Sub1.aClass40_Sub8_7118) {
         Class525_Sub1.aClass40_Sub8_7118.method876(256, (byte)4);
      }

      Class5.aClass40_Sub2_28.method876(64, (byte)4);
   }
}
