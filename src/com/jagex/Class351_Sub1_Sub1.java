package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class276;
import com.jagex.Class344;
import com.jagex.Class351_Sub1;
import com.jagex.Class374;
import com.jagex.Class433;
import com.jagex.Class444;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Exception_Sub5;

public class Class351_Sub1_Sub1 extends Class351_Sub1 {
   public int anInt11409;
   public int anInt11413;
   public int anInt11422;
   public int anInt11423;
   float aFloat11421;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11407;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11424;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11416;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11420;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11408;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_11412;
   Class276 aClass276_11411;
   Class276 aClass276_11418;
   public Class433 aClass433_11414 = new Class433();
   public Class433 aClass433_11415 = new Class433();
   float[] aFloatArray11417 = new float[4];
   float[] aFloatArray11419 = new float[4];
   Class344 aClass344_11410;

   public void method10484(int var1, int var2, int var3) {
      float var4 = (float)(1 + (var1 & 3)) * -5.0E-4F;
      float var5 = (float)((var1 >> 3 & 3) + 1) * 5.0E-4F;
      float var6 = (var1 & 64) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var7 = (var1 & 128) != 0;
      if(var7) {
         this.aFloatArray11417[0] = var6;
         this.aFloatArray11417[1] = 0.0F;
         this.aFloatArray11417[2] = 0.0F;
         this.aFloatArray11417[3] = 0.0F;
      } else {
         this.aFloatArray11417[0] = 0.0F;
         this.aFloatArray11417[1] = 0.0F;
         this.aFloatArray11417[2] = var6;
         this.aFloatArray11417[3] = 0.0F;
      }

      this.aFloatArray11419[0] = 0.0F;
      this.aFloatArray11419[1] = var6;
      this.aFloatArray11419[2] = 0.0F;
      this.aFloatArray11419[3] = (float)this.aClass174_Sub3_3662.anInt9820 * var4 % 1.0F;
      if(!this.aClass344_11410.aBool3569) {
         int var8 = (int)(16.0F * (float)this.aClass174_Sub3_3662.anInt9820 * var5);
         this.aClass174_Sub3_3662.method8841(this.aClass344_11410.anInterface38Array3572[var8 % 16]);
      } else {
         this.aFloat11421 = (float)((double)var5 * (double)this.aClass174_Sub3_3662.anInt9820 % 1.0D);
      }

   }

   boolean method9176() throws Exception_Sub5 {
      this.aClass526_Sub13_Sub1_11407 = this.aClass284_10182.method3750("WorldMatrix", 2104195499);
      this.aClass526_Sub13_Sub1_11424 = this.aClass284_10182.method3750("WVPMatrix", 2141138030);
      this.aClass526_Sub13_Sub1_11416 = this.aClass284_10182.method3750("UGenerationPlane", 2133619242);
      this.aClass526_Sub13_Sub1_11420 = this.aClass284_10182.method3750("VGenerationPlane", 2114141281);
      this.aClass526_Sub13_Sub1_11408 = this.aClass284_10182.method3750("Time", 2118836173);
      this.aClass526_Sub13_Sub1_11412 = this.aClass284_10182.method3750("billowSampler3D", 2104676008);
      if(this.aClass344_11410.aBool3569) {
         this.aClass276_11418 = this.aClass284_10182.method3742("Waterfall3D", (byte)18);
         this.aClass284_10182.method3757(this.aClass276_11418);
      } else {
         this.aClass276_11411 = this.aClass284_10182.method3742("Waterfall2D", (byte)2);
         this.aClass284_10182.method3757(this.aClass276_11411);
      }

      return true;
   }

   public void method10485() {
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3757(this.aClass276_11418);
      } else {
         this.aClass284_10182.method3757(this.aClass276_11411);
      }

      this.aClass284_10182.method3722();
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11412, 0, this.aClass344_11410.anInterface37_3573, (byte)-71);
      }

      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11407, this.aClass433_11415, (byte)-124);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11424, this.aClass433_11414, (byte)-6);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11416, new Class444(this.aFloatArray11417[0], this.aFloatArray11417[1], this.aFloatArray11417[2], this.aFloatArray11417[3]), 1841801056);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11420, new Class444(this.aFloatArray11419[0], this.aFloatArray11419[1], this.aFloatArray11419[2], this.aFloatArray11419[3]), 911913601);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11408, new Class444(this.aFloat11421, 0.0F, 0.0F, 0.0F), 872313024);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, -2015086279 * this.anInt11413, this.anInt11422 * 327676671, this.anInt11423 * 283919, this.anInt11409 * -1584447261);
   }

   public void method10486(byte var1) {
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3757(this.aClass276_11418);
      } else {
         this.aClass284_10182.method3757(this.aClass276_11411);
      }

      this.aClass284_10182.method3722();
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11412, 0, this.aClass344_11410.anInterface37_3573, (byte)-106);
      }

      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11407, this.aClass433_11415, (byte)-55);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11424, this.aClass433_11414, (byte)-11);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11416, new Class444(this.aFloatArray11417[0], this.aFloatArray11417[1], this.aFloatArray11417[2], this.aFloatArray11417[3]), 1209891009);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11420, new Class444(this.aFloatArray11419[0], this.aFloatArray11419[1], this.aFloatArray11419[2], this.aFloatArray11419[3]), 1465215181);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11408, new Class444(this.aFloat11421, 0.0F, 0.0F, 0.0F), 1756339099);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, -2015086279 * this.anInt11413, this.anInt11422 * 327676671, this.anInt11423 * 283919, this.anInt11409 * -1584447261);
   }

   boolean method9174() throws Exception_Sub5 {
      this.aClass526_Sub13_Sub1_11407 = this.aClass284_10182.method3750("WorldMatrix", 2119281518);
      this.aClass526_Sub13_Sub1_11424 = this.aClass284_10182.method3750("WVPMatrix", 2134328169);
      this.aClass526_Sub13_Sub1_11416 = this.aClass284_10182.method3750("UGenerationPlane", 2106677088);
      this.aClass526_Sub13_Sub1_11420 = this.aClass284_10182.method3750("VGenerationPlane", 2128497037);
      this.aClass526_Sub13_Sub1_11408 = this.aClass284_10182.method3750("Time", 2101468254);
      this.aClass526_Sub13_Sub1_11412 = this.aClass284_10182.method3750("billowSampler3D", 2132684637);
      if(this.aClass344_11410.aBool3569) {
         this.aClass276_11418 = this.aClass284_10182.method3742("Waterfall3D", (byte)15);
         this.aClass284_10182.method3757(this.aClass276_11418);
      } else {
         this.aClass276_11411 = this.aClass284_10182.method3742("Waterfall2D", (byte)42);
         this.aClass284_10182.method3757(this.aClass276_11411);
      }

      return true;
   }

   public void method10487(int var1, int var2) {
      float var3 = (float)(1 + (var1 & 3)) * -5.0E-4F;
      float var4 = (float)((var1 >> 3 & 3) + 1) * 5.0E-4F;
      float var5 = (var1 & 64) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var6 = (var1 & 128) != 0;
      if(var6) {
         this.aFloatArray11417[0] = var5;
         this.aFloatArray11417[1] = 0.0F;
         this.aFloatArray11417[2] = 0.0F;
         this.aFloatArray11417[3] = 0.0F;
      } else {
         this.aFloatArray11417[0] = 0.0F;
         this.aFloatArray11417[1] = 0.0F;
         this.aFloatArray11417[2] = var5;
         this.aFloatArray11417[3] = 0.0F;
      }

      this.aFloatArray11419[0] = 0.0F;
      this.aFloatArray11419[1] = var5;
      this.aFloatArray11419[2] = 0.0F;
      this.aFloatArray11419[3] = (float)this.aClass174_Sub3_3662.anInt9820 * var3 % 1.0F;
      if(!this.aClass344_11410.aBool3569) {
         int var7 = (int)(16.0F * (float)this.aClass174_Sub3_3662.anInt9820 * var4);
         this.aClass174_Sub3_3662.method8841(this.aClass344_11410.anInterface38Array3572[var7 % 16]);
      } else {
         this.aFloat11421 = (float)((double)var4 * (double)this.aClass174_Sub3_3662.anInt9820 % 1.0D);
      }

   }

   public void method10488(int var1, int var2) {
      float var3 = (float)(1 + (var1 & 3)) * -5.0E-4F;
      float var4 = (float)((var1 >> 3 & 3) + 1) * 5.0E-4F;
      float var5 = (var1 & 64) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var6 = (var1 & 128) != 0;
      if(var6) {
         this.aFloatArray11417[0] = var5;
         this.aFloatArray11417[1] = 0.0F;
         this.aFloatArray11417[2] = 0.0F;
         this.aFloatArray11417[3] = 0.0F;
      } else {
         this.aFloatArray11417[0] = 0.0F;
         this.aFloatArray11417[1] = 0.0F;
         this.aFloatArray11417[2] = var5;
         this.aFloatArray11417[3] = 0.0F;
      }

      this.aFloatArray11419[0] = 0.0F;
      this.aFloatArray11419[1] = var5;
      this.aFloatArray11419[2] = 0.0F;
      this.aFloatArray11419[3] = (float)this.aClass174_Sub3_3662.anInt9820 * var3 % 1.0F;
      if(!this.aClass344_11410.aBool3569) {
         int var7 = (int)(16.0F * (float)this.aClass174_Sub3_3662.anInt9820 * var4);
         this.aClass174_Sub3_3662.method8841(this.aClass344_11410.anInterface38Array3572[var7 % 16]);
      } else {
         this.aFloat11421 = (float)((double)var4 * (double)this.aClass174_Sub3_3662.anInt9820 % 1.0D);
      }

   }

   public void method10489() {
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3757(this.aClass276_11418);
      } else {
         this.aClass284_10182.method3757(this.aClass276_11411);
      }

      this.aClass284_10182.method3722();
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11412, 0, this.aClass344_11410.anInterface37_3573, (byte)-99);
      }

      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11407, this.aClass433_11415, (byte)-1);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11424, this.aClass433_11414, (byte)-54);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11416, new Class444(this.aFloatArray11417[0], this.aFloatArray11417[1], this.aFloatArray11417[2], this.aFloatArray11417[3]), 1510583485);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11420, new Class444(this.aFloatArray11419[0], this.aFloatArray11419[1], this.aFloatArray11419[2], this.aFloatArray11419[3]), 1410395933);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11408, new Class444(this.aFloat11421, 0.0F, 0.0F, 0.0F), 1198393421);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, -2015086279 * this.anInt11413, this.anInt11422 * 327676671, this.anInt11423 * 283919, this.anInt11409 * -1584447261);
   }

   public void method10490() {
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3757(this.aClass276_11418);
      } else {
         this.aClass284_10182.method3757(this.aClass276_11411);
      }

      this.aClass284_10182.method3722();
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11412, 0, this.aClass344_11410.anInterface37_3573, (byte)-113);
      }

      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11407, this.aClass433_11415, (byte)-20);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11424, this.aClass433_11414, (byte)-32);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11416, new Class444(this.aFloatArray11417[0], this.aFloatArray11417[1], this.aFloatArray11417[2], this.aFloatArray11417[3]), 1133123591);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11420, new Class444(this.aFloatArray11419[0], this.aFloatArray11419[1], this.aFloatArray11419[2], this.aFloatArray11419[3]), 2080458310);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11408, new Class444(this.aFloat11421, 0.0F, 0.0F, 0.0F), 1938133429);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, -2015086279 * this.anInt11413, this.anInt11422 * 327676671, this.anInt11423 * 283919, this.anInt11409 * -1584447261);
   }

   public Class351_Sub1_Sub1(Class174_Sub3 var1, Class344 var2) throws Exception_Sub5 {
      super(var1);
      this.aClass344_11410 = var2;
      if(this.aClass344_11410.method4435() && var1.method8898()) {
         this.method9175("Waterfall");
      }

   }

   public void method10491() {
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3757(this.aClass276_11418);
      } else {
         this.aClass284_10182.method3757(this.aClass276_11411);
      }

      this.aClass284_10182.method3722();
      if(this.aClass344_11410.aBool3569) {
         this.aClass284_10182.method3760(this.aClass526_Sub13_Sub1_11412, 0, this.aClass344_11410.anInterface37_3573, (byte)-122);
      }

      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11407, this.aClass433_11415, (byte)-112);
      this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_11424, this.aClass433_11414, (byte)-34);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11416, new Class444(this.aFloatArray11417[0], this.aFloatArray11417[1], this.aFloatArray11417[2], this.aFloatArray11417[3]), 1299308743);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11420, new Class444(this.aFloatArray11419[0], this.aFloatArray11419[1], this.aFloatArray11419[2], this.aFloatArray11419[3]), 1974236818);
      this.aClass284_10182.method3733(this.aClass526_Sub13_Sub1_11408, new Class444(this.aFloat11421, 0.0F, 0.0F, 0.0F), 1666224486);
      this.aClass174_Sub3_3662.method8827(Class374.aClass374_3898, -2015086279 * this.anInt11413, this.anInt11422 * 327676671, this.anInt11423 * 283919, this.anInt11409 * -1584447261);
   }
}
