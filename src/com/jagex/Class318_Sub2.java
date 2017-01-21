package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class276;
import com.jagex.Class284;
import com.jagex.Class318;
import com.jagex.Class374;
import com.jagex.Class433;
import com.jagex.Class466;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Class526_Sub2;
import com.jagex.Class526_Sub9;
import com.jagex.Class531_Sub1;
import com.jagex.Class642;
import com.jagex.Exception_Sub5;

public class Class318_Sub2 extends Class318 {
   static final int anInt10034 = 9;
   static final int anInt10036 = 1;
   static final int anInt10037 = 2;
   static final int anInt10038 = 3;
   static final int anInt10039 = 4;
   static final int anInt10040 = 5;
   static final int anInt10041 = 6;
   static final int anInt10043 = 8;
   static final int anInt10045 = 10;
   static final int anInt10046 = 11;
   static final int anInt10047 = 12;
   static final int anInt10048 = 13;
   static final int anInt10049 = 14;
   static final int anInt10050 = 15;
   static final int anInt10051 = 16;
   static final int anInt10052 = 19;
   static final int anInt10053 = 0;
   static final int anInt10054 = 1;
   static final int anInt10055 = 7;
   static final int anInt10056 = 7;
   static final int anInt10057 = 12;
   static final int anInt10058 = 17;
   static final int anInt10060 = 0;
   static final int anInt10061 = 18;
   static final int anInt10062 = 17;
   static final int anInt10063 = 2;
   public static Class526_Sub9 aClass526_Sub9_10065;
   int[] anIntArray10064;
   Class284 aClass284_10035;
   Class433 aClass433_10044 = new Class433();
   Class276[] aClass276Array10059 = new Class276[19];
   int[][] anIntArrayArray10042 = new int[19][17];

   public void method4109(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[var1 + 12]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1855563351)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3746(this.anIntArray10064[15], this.aClass433_3429, -736745636);
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -1274239308);
      this.aClass284_10035.method3749(this.anIntArray10064[3], 1, this.anInterface44_3431, 959289949);
      this.method9081(var1, -1416050544);
   }

   boolean method9079(byte var1) throws Exception_Sub5 {
      this.aClass284_10035 = this.aClass174_Sub3_3412.method8725("Model");
      Class526_Sub13_Sub1 var2 = this.aClass284_10035.method3750("DiffuseSampler", 2142900817);
      Class526_Sub13_Sub1 var3 = this.aClass284_10035.method3750("EnvironmentSampler", 2112803446);
      Class526_Sub13_Sub1 var4 = this.aClass284_10035.method3750("PointLightsPosAndRadiusInv", 2111529057);
      Class526_Sub13_Sub1 var5 = this.aClass284_10035.method3750("PointLightsDiffuseColour", 2132098920);
      Class526_Sub13_Sub1 var6 = this.aClass284_10035.method3750("WVPMatrix", 2146044178);
      Class526_Sub13_Sub1 var7 = this.aClass284_10035.method3750("TexCoordMatrix", 2142894912);
      Class526_Sub13_Sub1 var8 = this.aClass284_10035.method3750("HeightFogPlane", 2138303430);
      Class526_Sub13_Sub1 var9 = this.aClass284_10035.method3750("HeightFogColour", 2113822245);
      Class526_Sub13_Sub1 var10 = this.aClass284_10035.method3750("DistanceFogPlane", 2112823826);
      Class526_Sub13_Sub1 var11 = this.aClass284_10035.method3750("DistanceFogColour", 2135093825);
      Class526_Sub13_Sub1 var12 = this.aClass284_10035.method3750("SunDir", 2125896688);
      Class526_Sub13_Sub1 var13 = this.aClass284_10035.method3750("SunColour", 2145699663);
      Class526_Sub13_Sub1 var14 = this.aClass284_10035.method3750("AntiSunColour", 2124915405);
      Class526_Sub13_Sub1 var15 = this.aClass284_10035.method3750("AmbientColour", 2128642428);
      Class526_Sub13_Sub1 var16 = this.aClass284_10035.method3750("EyePos", 2132846336);
      Class526_Sub13_Sub1 var17 = this.aClass284_10035.method3750("SpecularExponent", 2103287426);
      Class526_Sub13_Sub1 var18 = this.aClass284_10035.method3750("WorldMatrix", 2117889492);
      this.aClass276Array10059[0] = this.aClass284_10035.method3742("Unlit", (byte)84);
      this.aClass276Array10059[1] = this.aClass284_10035.method3742("Unlit_IgnoreAlpha", (byte)106);
      this.aClass276Array10059[17] = this.aClass284_10035.method3742("UnderwaterGround", (byte)118);
      this.aClass276Array10059[18] = this.aClass284_10035.method3742("UnderwaterGroundSpecular", (byte)96);

      int var19;
      for(var19 = 0; var19 <= 4; ++var19) {
         this.aClass276Array10059[var19 + 2] = this.aClass284_10035.method3742("Standard_" + var19 + "PointLights", (byte)23);
         this.aClass276Array10059[7 + var19] = this.aClass284_10035.method3742("Specular_" + var19 + "PointLights", (byte)36);
         this.aClass276Array10059[12 + var19] = this.aClass284_10035.method3742("EnvironmentalMapping_" + var19 + "PointLights", (byte)110);
      }

      for(var19 = 0; var19 < 19; ++var19) {
         int var20 = this.aClass284_10035.method3774(this.aClass276Array10059[var19], -1880848941);
         this.anIntArrayArray10042[var19][2] = var2.method10625(var20);
         this.anIntArrayArray10042[var19][3] = var3.method10625(var20);
         this.anIntArrayArray10042[var19][1] = var4.method10625(var20);
         this.anIntArrayArray10042[var19][0] = var5.method10625(var20);
         this.anIntArrayArray10042[var19][4] = var6.method10625(var20);
         this.anIntArrayArray10042[var19][5] = var7.method10625(var20);
         this.anIntArrayArray10042[var19][7] = var8.method10625(var20);
         this.anIntArrayArray10042[var19][8] = var9.method10625(var20);
         this.anIntArrayArray10042[var19][9] = var10.method10625(var20);
         this.anIntArrayArray10042[var19][10] = var11.method10625(var20);
         this.anIntArrayArray10042[var19][11] = var12.method10625(var20);
         this.anIntArrayArray10042[var19][12] = var13.method10625(var20);
         this.anIntArrayArray10042[var19][13] = var14.method10625(var20);
         this.anIntArrayArray10042[var19][14] = var15.method10625(var20);
         this.anIntArrayArray10042[var19][6] = var16.method10625(var20);
         this.anIntArrayArray10042[var19][15] = var18.method10625(var20);
         this.anIntArrayArray10042[var19][16] = var17.method10625(var20);
      }

      this.aClass284_10035.method3757(this.aClass276Array10059[2]);
      return true;
   }

   public void method4104(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[2 + var1]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-980167781)];
      this.aClass284_10035.method3722();
      this.method9081(var1, -1834723662);
   }

   public void method4120(boolean var1) {
      if(var1) {
         this.aClass284_10035.method3757(this.aClass276Array10059[1]);
      } else {
         this.aClass284_10035.method3757(this.aClass276Array10059[0]);
      }

      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1627326439)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3749(this.anIntArray10064[2], 0, this.anInterface38_3415, 959289949);
      this.aClass284_10035.method3748(this.anIntArray10064[4], this.aClass433_10044, 16777215);
      this.aClass284_10035.method3747(this.anIntArray10064[5], this.aClass433_3420, 1632149209);
      this.aClass284_10035.method3743(this.anIntArray10064[7], this.aClass444_3421.aFloat4897, this.aClass444_3421.aFloat4898, this.aClass444_3421.aFloat4899, this.aClass444_3421.aFloat4900, 1809281350);
      this.aClass284_10035.method3744(this.anIntArray10064[8], this.aClass446_3422.aFloat4917, this.aClass446_3422.aFloat4915, this.aClass446_3422.aFloat4919, -2030843689);
      this.aClass284_10035.method3743(this.anIntArray10064[9], this.aClass444_3411.aFloat4897, this.aClass444_3411.aFloat4898, this.aClass444_3411.aFloat4899, this.aClass444_3411.aFloat4900, -234452332);
      this.aClass284_10035.method3744(this.anIntArray10064[10], this.aClass446_3432.aFloat4917, this.aClass446_3432.aFloat4915, this.aClass446_3432.aFloat4919, -491640406);
      this.aClass174_Sub3_3412.method8827(Class374.aClass374_3898, this.anInt3430, this.anInt3416, this.anInt3424, this.anInt3423);
   }

   public void method4115(boolean var1) {
      if(var1) {
         this.aClass284_10035.method3757(this.aClass276Array10059[1]);
      } else {
         this.aClass284_10035.method3757(this.aClass276Array10059[0]);
      }

      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1579576913)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3749(this.anIntArray10064[2], 0, this.anInterface38_3415, 959289949);
      this.aClass284_10035.method3748(this.anIntArray10064[4], this.aClass433_10044, 16777215);
      this.aClass284_10035.method3747(this.anIntArray10064[5], this.aClass433_3420, -645284099);
      this.aClass284_10035.method3743(this.anIntArray10064[7], this.aClass444_3421.aFloat4897, this.aClass444_3421.aFloat4898, this.aClass444_3421.aFloat4899, this.aClass444_3421.aFloat4900, -588376251);
      this.aClass284_10035.method3744(this.anIntArray10064[8], this.aClass446_3422.aFloat4917, this.aClass446_3422.aFloat4915, this.aClass446_3422.aFloat4919, -944218949);
      this.aClass284_10035.method3743(this.anIntArray10064[9], this.aClass444_3411.aFloat4897, this.aClass444_3411.aFloat4898, this.aClass444_3411.aFloat4899, this.aClass444_3411.aFloat4900, -436851695);
      this.aClass284_10035.method3744(this.anIntArray10064[10], this.aClass446_3432.aFloat4917, this.aClass446_3432.aFloat4915, this.aClass446_3432.aFloat4919, -1858147470);
      this.aClass174_Sub3_3412.method8827(Class374.aClass374_3898, this.anInt3430, this.anInt3416, this.anInt3424, this.anInt3423);
   }

   public void method4111() {
      this.aClass284_10035.method3757(this.aClass276Array10059[18]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1686106114)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -230120576);
      this.aClass284_10035.method3743(this.anIntArray10064[16], this.aFloat3419, this.aFloat3427, 0.0F, 0.0F, -372943373);
      this.method9081(0, -1298731285);
   }

   boolean method9080() throws Exception_Sub5 {
      this.aClass284_10035 = this.aClass174_Sub3_3412.method8725("Model");
      Class526_Sub13_Sub1 var1 = this.aClass284_10035.method3750("DiffuseSampler", 2102645453);
      Class526_Sub13_Sub1 var2 = this.aClass284_10035.method3750("EnvironmentSampler", 2104328061);
      Class526_Sub13_Sub1 var3 = this.aClass284_10035.method3750("PointLightsPosAndRadiusInv", 2142759118);
      Class526_Sub13_Sub1 var4 = this.aClass284_10035.method3750("PointLightsDiffuseColour", 2134393506);
      Class526_Sub13_Sub1 var5 = this.aClass284_10035.method3750("WVPMatrix", 2108552444);
      Class526_Sub13_Sub1 var6 = this.aClass284_10035.method3750("TexCoordMatrix", 2103346396);
      Class526_Sub13_Sub1 var7 = this.aClass284_10035.method3750("HeightFogPlane", 2126591744);
      Class526_Sub13_Sub1 var8 = this.aClass284_10035.method3750("HeightFogColour", 2112408343);
      Class526_Sub13_Sub1 var9 = this.aClass284_10035.method3750("DistanceFogPlane", 2118701305);
      Class526_Sub13_Sub1 var10 = this.aClass284_10035.method3750("DistanceFogColour", 2142362988);
      Class526_Sub13_Sub1 var11 = this.aClass284_10035.method3750("SunDir", 2107616603);
      Class526_Sub13_Sub1 var12 = this.aClass284_10035.method3750("SunColour", 2141071163);
      Class526_Sub13_Sub1 var13 = this.aClass284_10035.method3750("AntiSunColour", 2134014729);
      Class526_Sub13_Sub1 var14 = this.aClass284_10035.method3750("AmbientColour", 2122595500);
      Class526_Sub13_Sub1 var15 = this.aClass284_10035.method3750("EyePos", 2131695614);
      Class526_Sub13_Sub1 var16 = this.aClass284_10035.method3750("SpecularExponent", 2123744351);
      Class526_Sub13_Sub1 var17 = this.aClass284_10035.method3750("WorldMatrix", 2146043324);
      this.aClass276Array10059[0] = this.aClass284_10035.method3742("Unlit", (byte)5);
      this.aClass276Array10059[1] = this.aClass284_10035.method3742("Unlit_IgnoreAlpha", (byte)27);
      this.aClass276Array10059[17] = this.aClass284_10035.method3742("UnderwaterGround", (byte)92);
      this.aClass276Array10059[18] = this.aClass284_10035.method3742("UnderwaterGroundSpecular", (byte)8);

      int var18;
      for(var18 = 0; var18 <= 4; ++var18) {
         this.aClass276Array10059[var18 + 2] = this.aClass284_10035.method3742("Standard_" + var18 + "PointLights", (byte)3);
         this.aClass276Array10059[7 + var18] = this.aClass284_10035.method3742("Specular_" + var18 + "PointLights", (byte)87);
         this.aClass276Array10059[12 + var18] = this.aClass284_10035.method3742("EnvironmentalMapping_" + var18 + "PointLights", (byte)104);
      }

      for(var18 = 0; var18 < 19; ++var18) {
         int var19 = this.aClass284_10035.method3774(this.aClass276Array10059[var18], -834895333);
         this.anIntArrayArray10042[var18][2] = var1.method10625(var19);
         this.anIntArrayArray10042[var18][3] = var2.method10625(var19);
         this.anIntArrayArray10042[var18][1] = var3.method10625(var19);
         this.anIntArrayArray10042[var18][0] = var4.method10625(var19);
         this.anIntArrayArray10042[var18][4] = var5.method10625(var19);
         this.anIntArrayArray10042[var18][5] = var6.method10625(var19);
         this.anIntArrayArray10042[var18][7] = var7.method10625(var19);
         this.anIntArrayArray10042[var18][8] = var8.method10625(var19);
         this.anIntArrayArray10042[var18][9] = var9.method10625(var19);
         this.anIntArrayArray10042[var18][10] = var10.method10625(var19);
         this.anIntArrayArray10042[var18][11] = var11.method10625(var19);
         this.anIntArrayArray10042[var18][12] = var12.method10625(var19);
         this.anIntArrayArray10042[var18][13] = var13.method10625(var19);
         this.anIntArrayArray10042[var18][14] = var14.method10625(var19);
         this.anIntArrayArray10042[var18][6] = var15.method10625(var19);
         this.anIntArrayArray10042[var18][15] = var17.method10625(var19);
         this.anIntArrayArray10042[var18][16] = var16.method10625(var19);
      }

      this.aClass284_10035.method3757(this.aClass276Array10059[2]);
      return true;
   }

   void method9081(int var1, int var2) {
      this.aClass284_10035.method3749(this.anIntArray10064[2], 0, this.anInterface38_3415, 959289949);
      this.aClass284_10035.method3748(this.anIntArray10064[4], this.aClass433_10044, 16777215);
      this.aClass284_10035.method3747(this.anIntArray10064[5], this.aClass433_3420, -1651966159);
      this.aClass284_10035.method3743(this.anIntArray10064[7], this.aClass444_3421.aFloat4897, this.aClass444_3421.aFloat4898, this.aClass444_3421.aFloat4899, this.aClass444_3421.aFloat4900, -1681562290);
      this.aClass284_10035.method3744(this.anIntArray10064[8], this.aClass446_3422.aFloat4917, this.aClass446_3422.aFloat4915, this.aClass446_3422.aFloat4919, -1766480489);
      this.aClass284_10035.method3743(this.anIntArray10064[9], this.aClass444_3411.aFloat4897, this.aClass444_3411.aFloat4898, this.aClass444_3411.aFloat4899, this.aClass444_3411.aFloat4900, 874287618);
      this.aClass284_10035.method3744(this.anIntArray10064[10], this.aClass446_3432.aFloat4917, this.aClass446_3432.aFloat4915, this.aClass446_3432.aFloat4919, -493159797);
      this.aClass284_10035.method3734(this.anIntArray10064[11], this.aClass446_3425, (byte)-104);
      this.aClass284_10035.method3734(this.anIntArray10064[12], this.aClass446_3426, (byte)-85);
      this.aClass284_10035.method3734(this.anIntArray10064[13], this.aClass446_3428, (byte)-63);
      this.aClass284_10035.method3734(this.anIntArray10064[14], this.aClass446_3433, (byte)-7);
      if(var1 > 0) {
         this.aClass284_10035.method3745(this.anIntArray10064[1], this.aFloatArray3414, 4 * var1, -1939752876);
         this.aClass284_10035.method3745(this.anIntArray10064[0], this.aFloatArray3413, var1 * 4, -1930996220);
      }

      this.aClass174_Sub3_3412.method8827(Class374.aClass374_3898, this.anInt3430, this.anInt3416, this.anInt3424, this.anInt3423);
   }

   public void method4116(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[7 + var1]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(1602103807)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -505772352);
      this.aClass284_10035.method3743(this.anIntArray10064[16], this.aFloat3419, this.aFloat3427, 0.0F, 0.0F, 1222794703);
      this.method9081(var1, -1278068400);
   }

   public void method4108(Class433 var1) {
      this.aClass433_10044.method5083(var1);
      this.aClass433_10044.method5085(this.aClass174_Sub3_3412.aClass433_9720);
   }

   public void method4113(Class433 var1) {
      this.aClass433_10044.method5083(var1);
      this.aClass433_10044.method5085(this.aClass174_Sub3_3412.aClass433_9720);
   }

   public void method4110() {
      this.aClass284_10035.method3757(this.aClass276Array10059[17]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(199327861)];
      this.aClass284_10035.method3722();
      this.method9081(0, -1753986960);
   }

   public Class318_Sub2(Class174_Sub3 var1) throws Exception_Sub5 {
      super(var1);
      this.method9079((byte)68);
   }

   public void method4112(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[7 + var1]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1878984769)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -1707199875);
      this.aClass284_10035.method3743(this.anIntArray10064[16], this.aFloat3419, this.aFloat3427, 0.0F, 0.0F, 1046482848);
      this.method9081(var1, -1562502728);
   }

   public void method4107(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[2 + var1]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1994803853)];
      this.aClass284_10035.method3722();
      this.method9081(var1, -1945310964);
   }

   public void method4106(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[7 + var1]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(987901659)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -34671180);
      this.aClass284_10035.method3743(this.anIntArray10064[16], this.aFloat3419, this.aFloat3427, 0.0F, 0.0F, -883112790);
      this.method9081(var1, -1920843303);
   }

   public void method4105(Class433 var1) {
      this.aClass433_10044.method5083(var1);
      this.aClass433_10044.method5085(this.aClass174_Sub3_3412.aClass433_9720);
   }

   public void method4121(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[7 + var1]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-175010831)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -1551792541);
      this.aClass284_10035.method3743(this.anIntArray10064[16], this.aFloat3419, this.aFloat3427, 0.0F, 0.0F, -909083146);
      this.method9081(var1, -1756412985);
   }

   public void method4119(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[var1 + 12]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(1031009032)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3746(this.anIntArray10064[15], this.aClass433_3429, 159910294);
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -72075892);
      this.aClass284_10035.method3749(this.anIntArray10064[3], 1, this.anInterface44_3431, 959289949);
      this.method9081(var1, -2080375645);
   }

   public void method4118(int var1) {
      this.aClass284_10035.method3757(this.aClass276Array10059[var1 + 12]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-366115786)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3746(this.anIntArray10064[15], this.aClass433_3429, 1292974525);
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -816240668);
      this.aClass284_10035.method3749(this.anIntArray10064[3], 1, this.anInterface44_3431, 959289949);
      this.method9081(var1, -1925773449);
   }

   public void method4122() {
      this.aClass284_10035.method3757(this.aClass276Array10059[17]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1182864747)];
      this.aClass284_10035.method3722();
      this.method9081(0, -1532617267);
   }

   public void method4123() {
      this.aClass284_10035.method3757(this.aClass276Array10059[18]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-737282390)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -2109279733);
      this.aClass284_10035.method3743(this.anIntArray10064[16], this.aFloat3419, this.aFloat3427, 0.0F, 0.0F, 413812150);
      this.method9081(0, -1951211069);
   }

   public void method4124() {
      this.aClass284_10035.method3757(this.aClass276Array10059[18]);
      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1254508960)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3744(this.anIntArray10064[6], this.aClass446_3418.aFloat4917, this.aClass446_3418.aFloat4915, this.aClass446_3418.aFloat4919, -123518257);
      this.aClass284_10035.method3743(this.anIntArray10064[16], this.aFloat3419, this.aFloat3427, 0.0F, 0.0F, -485119741);
      this.method9081(0, -1442935238);
   }

   boolean method9082() throws Exception_Sub5 {
      this.aClass284_10035 = this.aClass174_Sub3_3412.method8725("Model");
      Class526_Sub13_Sub1 var1 = this.aClass284_10035.method3750("DiffuseSampler", 2142153257);
      Class526_Sub13_Sub1 var2 = this.aClass284_10035.method3750("EnvironmentSampler", 2115910424);
      Class526_Sub13_Sub1 var3 = this.aClass284_10035.method3750("PointLightsPosAndRadiusInv", 2116367498);
      Class526_Sub13_Sub1 var4 = this.aClass284_10035.method3750("PointLightsDiffuseColour", 2144625879);
      Class526_Sub13_Sub1 var5 = this.aClass284_10035.method3750("WVPMatrix", 2131193019);
      Class526_Sub13_Sub1 var6 = this.aClass284_10035.method3750("TexCoordMatrix", 2101657081);
      Class526_Sub13_Sub1 var7 = this.aClass284_10035.method3750("HeightFogPlane", 2147229066);
      Class526_Sub13_Sub1 var8 = this.aClass284_10035.method3750("HeightFogColour", 2134620686);
      Class526_Sub13_Sub1 var9 = this.aClass284_10035.method3750("DistanceFogPlane", 2127821061);
      Class526_Sub13_Sub1 var10 = this.aClass284_10035.method3750("DistanceFogColour", 2102783573);
      Class526_Sub13_Sub1 var11 = this.aClass284_10035.method3750("SunDir", 2143941917);
      Class526_Sub13_Sub1 var12 = this.aClass284_10035.method3750("SunColour", 2139479039);
      Class526_Sub13_Sub1 var13 = this.aClass284_10035.method3750("AntiSunColour", 2142304657);
      Class526_Sub13_Sub1 var14 = this.aClass284_10035.method3750("AmbientColour", 2138776043);
      Class526_Sub13_Sub1 var15 = this.aClass284_10035.method3750("EyePos", 2142532800);
      Class526_Sub13_Sub1 var16 = this.aClass284_10035.method3750("SpecularExponent", 2145714471);
      Class526_Sub13_Sub1 var17 = this.aClass284_10035.method3750("WorldMatrix", 2112701837);
      this.aClass276Array10059[0] = this.aClass284_10035.method3742("Unlit", (byte)82);
      this.aClass276Array10059[1] = this.aClass284_10035.method3742("Unlit_IgnoreAlpha", (byte)105);
      this.aClass276Array10059[17] = this.aClass284_10035.method3742("UnderwaterGround", (byte)18);
      this.aClass276Array10059[18] = this.aClass284_10035.method3742("UnderwaterGroundSpecular", (byte)39);

      int var18;
      for(var18 = 0; var18 <= 4; ++var18) {
         this.aClass276Array10059[var18 + 2] = this.aClass284_10035.method3742("Standard_" + var18 + "PointLights", (byte)75);
         this.aClass276Array10059[7 + var18] = this.aClass284_10035.method3742("Specular_" + var18 + "PointLights", (byte)77);
         this.aClass276Array10059[12 + var18] = this.aClass284_10035.method3742("EnvironmentalMapping_" + var18 + "PointLights", (byte)25);
      }

      for(var18 = 0; var18 < 19; ++var18) {
         int var19 = this.aClass284_10035.method3774(this.aClass276Array10059[var18], -1451171139);
         this.anIntArrayArray10042[var18][2] = var1.method10625(var19);
         this.anIntArrayArray10042[var18][3] = var2.method10625(var19);
         this.anIntArrayArray10042[var18][1] = var3.method10625(var19);
         this.anIntArrayArray10042[var18][0] = var4.method10625(var19);
         this.anIntArrayArray10042[var18][4] = var5.method10625(var19);
         this.anIntArrayArray10042[var18][5] = var6.method10625(var19);
         this.anIntArrayArray10042[var18][7] = var7.method10625(var19);
         this.anIntArrayArray10042[var18][8] = var8.method10625(var19);
         this.anIntArrayArray10042[var18][9] = var9.method10625(var19);
         this.anIntArrayArray10042[var18][10] = var10.method10625(var19);
         this.anIntArrayArray10042[var18][11] = var11.method10625(var19);
         this.anIntArrayArray10042[var18][12] = var12.method10625(var19);
         this.anIntArrayArray10042[var18][13] = var13.method10625(var19);
         this.anIntArrayArray10042[var18][14] = var14.method10625(var19);
         this.anIntArrayArray10042[var18][6] = var15.method10625(var19);
         this.anIntArrayArray10042[var18][15] = var17.method10625(var19);
         this.anIntArrayArray10042[var18][16] = var16.method10625(var19);
      }

      this.aClass284_10035.method3757(this.aClass276Array10059[2]);
      return true;
   }

   public void method4114(boolean var1) {
      if(var1) {
         this.aClass284_10035.method3757(this.aClass276Array10059[1]);
      } else {
         this.aClass284_10035.method3757(this.aClass276Array10059[0]);
      }

      this.anIntArray10064 = this.anIntArrayArray10042[this.aClass284_10035.method3732(-1632213649)];
      this.aClass284_10035.method3722();
      this.aClass284_10035.method3749(this.anIntArray10064[2], 0, this.anInterface38_3415, 959289949);
      this.aClass284_10035.method3748(this.anIntArray10064[4], this.aClass433_10044, 16777215);
      this.aClass284_10035.method3747(this.anIntArray10064[5], this.aClass433_3420, 1700496451);
      this.aClass284_10035.method3743(this.anIntArray10064[7], this.aClass444_3421.aFloat4897, this.aClass444_3421.aFloat4898, this.aClass444_3421.aFloat4899, this.aClass444_3421.aFloat4900, 326512458);
      this.aClass284_10035.method3744(this.anIntArray10064[8], this.aClass446_3422.aFloat4917, this.aClass446_3422.aFloat4915, this.aClass446_3422.aFloat4919, -611715148);
      this.aClass284_10035.method3743(this.anIntArray10064[9], this.aClass444_3411.aFloat4897, this.aClass444_3411.aFloat4898, this.aClass444_3411.aFloat4899, this.aClass444_3411.aFloat4900, -1424310402);
      this.aClass284_10035.method3744(this.anIntArray10064[10], this.aClass446_3432.aFloat4917, this.aClass446_3432.aFloat4915, this.aClass446_3432.aFloat4919, 362733779);
      this.aClass174_Sub3_3412.method8827(Class374.aClass374_3898, this.anInt3430, this.anInt3416, this.anInt3424, this.anInt3423);
   }

   boolean method9083() throws Exception_Sub5 {
      this.aClass284_10035 = this.aClass174_Sub3_3412.method8725("Model");
      Class526_Sub13_Sub1 var1 = this.aClass284_10035.method3750("DiffuseSampler", 2126512261);
      Class526_Sub13_Sub1 var2 = this.aClass284_10035.method3750("EnvironmentSampler", 2138193187);
      Class526_Sub13_Sub1 var3 = this.aClass284_10035.method3750("PointLightsPosAndRadiusInv", 2139655708);
      Class526_Sub13_Sub1 var4 = this.aClass284_10035.method3750("PointLightsDiffuseColour", 2130770520);
      Class526_Sub13_Sub1 var5 = this.aClass284_10035.method3750("WVPMatrix", 2117873609);
      Class526_Sub13_Sub1 var6 = this.aClass284_10035.method3750("TexCoordMatrix", 2136469068);
      Class526_Sub13_Sub1 var7 = this.aClass284_10035.method3750("HeightFogPlane", 2137649773);
      Class526_Sub13_Sub1 var8 = this.aClass284_10035.method3750("HeightFogColour", 2101429969);
      Class526_Sub13_Sub1 var9 = this.aClass284_10035.method3750("DistanceFogPlane", 2105147324);
      Class526_Sub13_Sub1 var10 = this.aClass284_10035.method3750("DistanceFogColour", 2147390432);
      Class526_Sub13_Sub1 var11 = this.aClass284_10035.method3750("SunDir", 2118976255);
      Class526_Sub13_Sub1 var12 = this.aClass284_10035.method3750("SunColour", 2102102355);
      Class526_Sub13_Sub1 var13 = this.aClass284_10035.method3750("AntiSunColour", 2116642612);
      Class526_Sub13_Sub1 var14 = this.aClass284_10035.method3750("AmbientColour", 2132121177);
      Class526_Sub13_Sub1 var15 = this.aClass284_10035.method3750("EyePos", 2107069390);
      Class526_Sub13_Sub1 var16 = this.aClass284_10035.method3750("SpecularExponent", 2108885639);
      Class526_Sub13_Sub1 var17 = this.aClass284_10035.method3750("WorldMatrix", 2128318184);
      this.aClass276Array10059[0] = this.aClass284_10035.method3742("Unlit", (byte)114);
      this.aClass276Array10059[1] = this.aClass284_10035.method3742("Unlit_IgnoreAlpha", (byte)77);
      this.aClass276Array10059[17] = this.aClass284_10035.method3742("UnderwaterGround", (byte)48);
      this.aClass276Array10059[18] = this.aClass284_10035.method3742("UnderwaterGroundSpecular", (byte)75);

      int var18;
      for(var18 = 0; var18 <= 4; ++var18) {
         this.aClass276Array10059[var18 + 2] = this.aClass284_10035.method3742("Standard_" + var18 + "PointLights", (byte)67);
         this.aClass276Array10059[7 + var18] = this.aClass284_10035.method3742("Specular_" + var18 + "PointLights", (byte)107);
         this.aClass276Array10059[12 + var18] = this.aClass284_10035.method3742("EnvironmentalMapping_" + var18 + "PointLights", (byte)104);
      }

      for(var18 = 0; var18 < 19; ++var18) {
         int var19 = this.aClass284_10035.method3774(this.aClass276Array10059[var18], -1700908617);
         this.anIntArrayArray10042[var18][2] = var1.method10625(var19);
         this.anIntArrayArray10042[var18][3] = var2.method10625(var19);
         this.anIntArrayArray10042[var18][1] = var3.method10625(var19);
         this.anIntArrayArray10042[var18][0] = var4.method10625(var19);
         this.anIntArrayArray10042[var18][4] = var5.method10625(var19);
         this.anIntArrayArray10042[var18][5] = var6.method10625(var19);
         this.anIntArrayArray10042[var18][7] = var7.method10625(var19);
         this.anIntArrayArray10042[var18][8] = var8.method10625(var19);
         this.anIntArrayArray10042[var18][9] = var9.method10625(var19);
         this.anIntArrayArray10042[var18][10] = var10.method10625(var19);
         this.anIntArrayArray10042[var18][11] = var11.method10625(var19);
         this.anIntArrayArray10042[var18][12] = var12.method10625(var19);
         this.anIntArrayArray10042[var18][13] = var13.method10625(var19);
         this.anIntArrayArray10042[var18][14] = var14.method10625(var19);
         this.anIntArrayArray10042[var18][6] = var15.method10625(var19);
         this.anIntArrayArray10042[var18][15] = var17.method10625(var19);
         this.anIntArrayArray10042[var18][16] = var16.method10625(var19);
      }

      this.aClass284_10035.method3757(this.aClass276Array10059[2]);
      return true;
   }

   void method9084(int var1) {
      this.aClass284_10035.method3749(this.anIntArray10064[2], 0, this.anInterface38_3415, 959289949);
      this.aClass284_10035.method3748(this.anIntArray10064[4], this.aClass433_10044, 16777215);
      this.aClass284_10035.method3747(this.anIntArray10064[5], this.aClass433_3420, -604694383);
      this.aClass284_10035.method3743(this.anIntArray10064[7], this.aClass444_3421.aFloat4897, this.aClass444_3421.aFloat4898, this.aClass444_3421.aFloat4899, this.aClass444_3421.aFloat4900, -1598357670);
      this.aClass284_10035.method3744(this.anIntArray10064[8], this.aClass446_3422.aFloat4917, this.aClass446_3422.aFloat4915, this.aClass446_3422.aFloat4919, -974926038);
      this.aClass284_10035.method3743(this.anIntArray10064[9], this.aClass444_3411.aFloat4897, this.aClass444_3411.aFloat4898, this.aClass444_3411.aFloat4899, this.aClass444_3411.aFloat4900, -1920546928);
      this.aClass284_10035.method3744(this.anIntArray10064[10], this.aClass446_3432.aFloat4917, this.aClass446_3432.aFloat4915, this.aClass446_3432.aFloat4919, 108695725);
      this.aClass284_10035.method3734(this.anIntArray10064[11], this.aClass446_3425, (byte)-77);
      this.aClass284_10035.method3734(this.anIntArray10064[12], this.aClass446_3426, (byte)-32);
      this.aClass284_10035.method3734(this.anIntArray10064[13], this.aClass446_3428, (byte)-84);
      this.aClass284_10035.method3734(this.anIntArray10064[14], this.aClass446_3433, (byte)-125);
      if(var1 > 0) {
         this.aClass284_10035.method3745(this.anIntArray10064[1], this.aFloatArray3414, 4 * var1, -1973426268);
         this.aClass284_10035.method3745(this.anIntArray10064[0], this.aFloatArray3413, var1 * 4, -2087633248);
      }

      this.aClass174_Sub3_3412.method8827(Class374.aClass374_3898, this.anInt3430, this.anInt3416, this.anInt3424, this.anInt3423);
   }

   public static int method9085(int var0, int var1, boolean var2, byte var3) {
      Class526_Sub2 var4 = Class531_Sub1.method9301(var0, var2, 1677868456);
      return null == var4?-1:(var1 >= 0 && var1 < var4.anIntArray10331.length?var4.anIntArray10331[var1]:-1);
   }

   static int method9086(Class466 var0, Class642 var1, int var2) {
      if(null != var0) {
         if(var1.method7649(1340999270) > 1) {
            int var3 = var0.method5573(-2030402206) - 1;
            return var3 * var1.method7649(304496288) + var0.method5544(var3, -501624482);
         } else {
            return var0.method5544(-1505451721 * var1.anInt8409, -371146579);
         }
      } else {
         return 0;
      }
   }
}
