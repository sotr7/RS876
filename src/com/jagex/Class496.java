package com.jagex;

import com.jagex.Class105;
import com.jagex.Class195;
import com.jagex.Class211;
import com.jagex.Class237;
import com.jagex.InterfaceDef;
import com.jagex.Class327;
import com.jagex.Class554;
import com.jagex.client;

public class Class496 {
   public static final int anInt5541 = 45;
   public static final int anInt5542 = -2;
   public static final int anInt5543 = -4;
   public static final int anInt5544 = -5;
   public static final int anInt5545 = 1;
   public static final int anInt5546 = 2;
   public static final int anInt5547 = 3;
   public static final int anInt5548 = 6;
   public static final int anInt5549 = 35;
   public static final int anInt5550 = 9;
   public static final int anInt5551 = 15;
   public static final int anInt5552 = 21;
   public static final int anInt5553 = 23;
   public static final int anInt5554 = 29;
   public static final int anInt5555 = 53;
   public static final int anInt5556 = 7;
   public static final int anInt5557 = -3;
   public static final int anInt5558 = 48;
   public static final int anInt5559 = 49;
   public static final int anInt5560 = 52;
   public static final int anInt5561 = 42;

   Class496() throws Throwable {
      throw new Error();
   }

   static void method5915(InterfaceDef var0, int var1, int var2, short var3) {
      Class237 var4 = var0.method3351(Class554.aClass174_7475, (byte)8);
      if(var4 != null) {
         Class554.aClass174_7475.method2538(var1, var2, var0.anInt2510 * -99858407 + var1, var0.anInt2576 * -667181623 + var2);
         if(Class105.anInt1304 * -1632118003 < 3) {
            int var5;
            if(2 == -265840483 * Class327.anInt3488) {
               var5 = (int)(-((double)Class195.aClass292_Sub1_2182.method3919(2019685062) * 2607.5945876176133D));
            } else {
               var5 = (int)(-client.aFloat11105);
            }

            var5 = var5 + -1005933966 * client.anInt11076 & 16383;
            var5 <<= 2;
            Class211.aClass153_2263.method1816((float)var1 + (float)(-99858407 * var0.anInt2510) / 2.0F, (float)(var0.anInt2576 * -667181623) / 2.0F + (float)var2, 4187, var5, var4.aClass162_2395, var1, var2);
         } else {
            Class554.aClass174_7475.method2316(-16777216, var4.aClass162_2395, var1, var2);
         }

      }
   }
}
