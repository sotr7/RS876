package com.jagex;

import com.jagex.Class116;
import com.jagex.Class174;
import com.jagex.Class195;
import com.jagex.Class199_Sub14;
import com.jagex.Class20;
import com.jagex.Class220;
import com.jagex.Class221;
import com.jagex.Class230;
import com.jagex.Class24;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class27;
import com.jagex.Class287;
import com.jagex.Class293;
import com.jagex.Class298;
import com.jagex.Class299;
import com.jagex.Class30;
import com.jagex.Class302;
import com.jagex.Class304_Sub1;
import com.jagex.Class307;
import com.jagex.Class309;
import com.jagex.Class315_Sub1;
import com.jagex.Class325;
import com.jagex.Class329;
import com.jagex.Class329_Sub1;
import com.jagex.Class329_Sub2;
import com.jagex.Class329_Sub3_Sub1;
import com.jagex.Class329_Sub3_Sub2;
import com.jagex.Class329_Sub3_Sub3;
import com.jagex.Class422;
import com.jagex.Class433;
import com.jagex.Class440;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class45;
import com.jagex.Class470;
import com.jagex.Class474;
import com.jagex.Class497;
import com.jagex.Class499;
import com.jagex.Class507;
import com.jagex.Class525_Sub1;
import com.jagex.Class526_Sub21_Sub13;
import com.jagex.Class526_Sub24;
import com.jagex.Class526_Sub32;
import com.jagex.Class561;
import com.jagex.Class563;
import com.jagex.Class564;
import com.jagex.Class566;
import com.jagex.Class570;
import com.jagex.Class584;
import com.jagex.Class609;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class689;
import com.jagex.Class689_Sub1;
import com.jagex.Class689_Sub2;
import com.jagex.Class689_Sub3;
import com.jagex.Class689_Sub4;
import com.jagex.Class689_Sub5_Sub1;
import com.jagex.Class689_Sub5_Sub2;
import com.jagex.Class689_Sub5_Sub3;
import com.jagex.Class702;
import com.jagex.Class709;
import com.jagex.Class71;
import com.jagex.Class79;
import com.jagex.Exception_Sub2;
import com.jagex.Interface32;
import com.jagex.client;
import java.util.Iterator;

public abstract class Class292 {
   public static final float aFloat3152 = Float.POSITIVE_INFINITY;
   static final int anInt3168 = 50;
   static final int anInt3169 = 10000;
   public static int anInt3177;
   Class299 aClass299_3140;
   Class298 aClass298_3143;
   Class689 aClass689_3151;
   Class307 aClass307_3145;
   Class329 aClass329_3149;
   Class293 aClass293_3141;
   Class287 aClass287_3148;
   float aFloat3160;
   float aFloat3164;
   float aFloat3165;
   float aFloat3166;
   float aFloat3167;
   float aFloat3171;
   float aFloat3176;
   int anInt3170;
   boolean aBool3173;
   boolean aBool3142;
   int anInt3159 = 0;
   float aFloat3175 = 1.0F;
   float aFloat3172 = 5120.0F;
   float aFloat3153 = 10.0F;
   float aFloat3161 = 1.0F;
   Class446 aClass446_3150 = new Class446();
   Class446 aClass446_3157 = new Class446();
   Class446 aClass446_3154 = new Class446();
   Class446 aClass446_3174 = new Class446();
   float aFloat3156 = 5120.0F;
   float aFloat3144 = 10.0F;
   float aFloat3158 = 1.0F;
   Class446 aClass446_3162 = new Class446();
   Class446 aClass446_3163 = new Class446();
   Class20 aClass20_3146 = new Class20(8);
   Class302 aClass302_3155;
   Interface32 anInterface32_3147;

   public void method3888(boolean var1, int var2) {
      this.aClass299_3140 = Class299.aClass299_3246;
      this.aClass298_3143 = null;
      this.aClass689_3151 = null;
      this.aClass307_3145 = null;
      this.aClass329_3149 = null;
      if(this.aClass302_3155 != Class302.aClass302_3261 && var1) {
         this.aClass293_3141 = Class293.aClass293_3179;
      } else {
         this.aClass293_3141 = Class293.aClass293_3178;
      }

      this.aClass287_3148 = Class287.aClass287_3102;
      this.aClass446_3150.method5266(100.0F, 100.0F, 100.0F);
      this.aClass446_3157.method5266(100.0F, 100.0F, 100.0F);
      this.aFloat3160 = 0.05F;
      this.aClass446_3154.method5266(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      this.aClass446_3174.method5266(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
      this.aClass446_3162.method5266(1.0F, 1.0F, 1.0F);
      this.aClass446_3163.method5266(1.0F, 1.0F, 1.0F);
      this.aFloat3164 = 1.1F;
      this.aFloat3165 = 1.1F;
      this.aFloat3166 = 50.0F;
      this.aFloat3167 = 10000.0F;
      this.aFloat3171 = 1.5707964F;
      this.aFloat3176 = 1.5707964F;
      this.anInt3170 = -2110845647;
      this.aBool3173 = true;
      this.aBool3142 = true;
      this.anInt3159 = 0;
      this.aFloat3175 = 1.0F;
      this.aClass20_3146.method647(929030154);
   }

   public void method3889(boolean var1, float var2, Class446 var3, Class440 var4, Class446 var5, Class446 var6, int var7) {
      if(Class287.aClass287_3105 == this.aClass287_3148) {
         Class30.method740(var2, var3, var5, var6, var1?this.aClass446_3174:this.aClass446_3154, var1?this.aClass446_3157:this.aClass446_3150, (float)(this.anInt3159 * -2071541057), this.aFloat3175, this.aFloat3172, this.aFloat3153, -1492460879);
      } else if(Class287.aClass287_3102 == this.aClass287_3148) {
         Class507.method6153(var2, var3, var4, var5, var6, var1?this.aClass446_3174:this.aClass446_3154, var1?this.aClass446_3157:this.aClass446_3150, (float)(-2071541057 * this.anInt3159), this.aFloat3175, this.aFloat3172, this.aFloat3153, (byte)-4);
      } else if(Class287.aClass287_3103 == this.aClass287_3148) {
         Class563.method6776(var2, var3, var4, var5, var6, var1?this.aClass446_3163:this.aClass446_3162, var1?this.aFloat3165:this.aFloat3164, this.aFloat3172, this.aFloat3161, (short)-29083);
      }

   }

   public void method3890(Class293 var1, int var2) {
      this.aClass293_3141 = var1;
   }

   public Class689 method3891(Class298 var1, boolean var2, byte var3) throws Exception_Sub2 {
      if(this.aClass293_3141 == Class293.aClass293_3178 && !var2) {
         throw new Exception_Sub2();
      } else {
         this.aClass298_3143 = var1;
         if(var1 == Class298.aClass298_3237) {
            this.aClass689_3151 = new Class689_Sub3(this);
         } else if(var1 == Class298.aClass298_3241) {
            this.aClass689_3151 = new Class689_Sub2(this);
         } else if(var1 == Class298.aClass298_3239) {
            this.aClass689_3151 = new Class689_Sub1(this);
         } else if(var1 == Class298.aClass298_3238) {
            this.aClass689_3151 = new Class689_Sub5_Sub1(this);
         } else if(var1 == Class298.aClass298_3240) {
            this.aClass689_3151 = new Class689_Sub5_Sub3(this);
         } else if(var1 == Class298.aClass298_3242) {
            this.aClass689_3151 = new Class689_Sub4(this);
         } else if(var1 == Class298.aClass298_3236) {
            this.aClass689_3151 = new Class689_Sub5_Sub2(this);
         }

         return this.aClass689_3151;
      }
   }

   public Class329 method3892(Class307 var1, boolean var2, int var3) throws Exception_Sub2 {
      if(this.aClass293_3141 == Class293.aClass293_3178 && !var2) {
         throw new Exception_Sub2();
      } else {
         this.aClass307_3145 = var1;
         if(Class307.aClass307_3297 == var1) {
            this.aClass329_3149 = new Class329_Sub2(this);
         } else if(var1 == Class307.aClass307_3293) {
            this.aClass329_3149 = new Class329_Sub1(this);
         } else if(var1 == Class307.aClass307_3294) {
            this.aClass329_3149 = new Class329_Sub3_Sub3(this);
         } else if(var1 == Class307.aClass307_3295) {
            this.aClass329_3149 = new Class329_Sub3_Sub2(this);
         } else if(Class307.aClass307_3296 == var1) {
            this.aClass329_3149 = new Class329_Sub3_Sub1(this);
         }

         return this.aClass329_3149;
      }
   }

   boolean method3893(int var1) {
      return Class302.aClass302_3261 == this.aClass302_3155 && this.aClass293_3141 == Class293.aClass293_3178?true:Class302.aClass302_3260 == this.aClass302_3155 && Class293.aClass293_3179 == this.aClass293_3141;
   }

   public void method3894(float var1, byte var2) throws Exception_Sub2 {
      if(!this.method3893(1168488987)) {
         throw new Exception_Sub2();
      } else {
         this.aFloat3160 = var1;
      }
   }

   public void method3895(Class287 var1, int var2) throws Exception_Sub2 {
      if(!this.method3893(359771776)) {
         throw new Exception_Sub2();
      } else {
         this.aClass287_3148 = var1;
      }
   }

   public void method3896(Class446 var1, byte var2) throws Exception_Sub2 {
      if(this.method3893(1526822265) && this.aClass287_3148.aBool3101) {
         this.aClass446_3154.method5267(var1);
      } else {
         throw new Exception_Sub2();
      }
   }

   public void method3897(float var1, float var2, float var3, int var4) throws Exception_Sub2 {
      if(!this.method3893(1958434286)) {
         throw new Exception_Sub2();
      } else {
         this.aFloat3172 = var1;
         this.aFloat3153 = var2;
         this.aFloat3161 = var3;
      }
   }

   public void method3898(int var1) throws Exception_Sub2 {
      if(!this.method3893(1730790912)) {
         throw new Exception_Sub2();
      } else {
         this.aFloat3172 = 5120.0F;
         this.aFloat3153 = 10.0F;
         this.aFloat3161 = 1.0F;
      }
   }

   public void method3899(Class446 var1, byte var2) throws Exception_Sub2 {
      if(this.method3893(1421171318) && this.aClass287_3148.aBool3101) {
         this.aClass446_3157.method5267(var1);
      } else {
         throw new Exception_Sub2();
      }
   }

   public void method3900(Class446 var1, float var2, byte var3) throws Exception_Sub2 {
      if(this.method3893(1437200014) && !this.aClass287_3148.aBool3101) {
         this.aClass446_3162.method5267(var1);
         this.aClass446_3163.method5267(var1);
         this.aFloat3164 = var2;
         this.aFloat3165 = var2;
      } else {
         throw new Exception_Sub2();
      }
   }

   public void method3901(Class446 var1, float var2, int var3) throws Exception_Sub2 {
      if(this.method3893(43914471) && !this.aClass287_3148.aBool3101) {
         this.aClass446_3162.method5267(var1);
         this.aFloat3164 = var2;
      } else {
         throw new Exception_Sub2();
      }
   }

   public void method3902(float var1, float var2, int var3) throws Exception_Sub2 {
      if(!this.method3893(1457692939)) {
         throw new Exception_Sub2();
      } else {
         if(var1 < 1.0F) {
            var1 = 50.0F;
         }

         if(var2 < 1.0F) {
            var2 = 10000.0F;
         }

         if(var1 >= var2) {
            throw new Exception_Sub2();
         } else {
            this.aFloat3166 = var1;
            this.aFloat3167 = var2;
         }
      }
   }

   public void method3903(Class446 var1, float var2, int var3) throws Exception_Sub2 {
      if(this.method3893(1193119171) && !this.aClass287_3148.aBool3101) {
         this.aClass446_3163.method5267(var1);
         this.aFloat3165 = var2;
      } else {
         throw new Exception_Sub2();
      }
   }

   public void method3904(boolean var1, boolean var2, int var3) throws Exception_Sub2 {
      if(!this.method3893(2503385)) {
         throw new Exception_Sub2();
      } else {
         this.aBool3173 = var1;
         this.aBool3142 = var2;
      }
   }

   public void method3905(float var1, int[][][] var2, Class470 var3, int var4, int var5, int var6) {
      if(this.aClass689_3151 != null) {
         this.aClass689_3151.method8071(var1, (byte)0);
      }

      if(this.aClass329_3149 != null) {
         this.aClass329_3149.method4202(var1, var2, var3, var4, var5, 303185888);
      }

      Iterator var7 = this.aClass20_3146.iterator();

      while(var7.hasNext()) {
         Class526_Sub21_Sub13 var8 = (Class526_Sub21_Sub13)var7.next();
         var8.method10696(var1, 415491356);
      }

   }

   public void method3906(Class526_Sub21_Sub13 var1, byte var2) {
      this.aClass20_3146.put(var1, (long)(var1.anInt11813 * -631717655));
   }

   public void method3907(int var1, byte var2) {
      Class526_Sub21_Sub13 var3 = (Class526_Sub21_Sub13)this.aClass20_3146.get((long)var1);
      if(var3 != null) {
         var3.method6332(-1949449864);
      }

   }

   public Class526_Sub21_Sub13 method3908(int var1, int var2) {
      return (Class526_Sub21_Sub13)this.aClass20_3146.get((long)var1);
   }

   public void method3909(int var1) {
      this.aClass20_3146.method647(929030154);
   }

   public Class293 method3910(int var1) {
      return this.aClass293_3141;
   }

   public void method3911(Class309 var1, Class445 var2, Class433 var3, int var4, int var5, byte var6) {
      if(this.method3929((byte)16)) {
         this.aClass689_3151.method8083(var1, var2, var4, var5, this.aClass329_3149.method4207((byte)84), -2051367815);
         this.aClass329_3149.method4225(var1, var4, var5, -1508225426);
         if(this.aClass299_3140 == Class299.aClass299_3246) {
            var3.method5093(this.aFloat3166, this.aFloat3167, this.aFloat3176, this.aFloat3171);
         } else {
            var3.method5081(this.aFloat3166, this.aFloat3167, (float)(this.anInt3170 * 1556863765));
         }

         Iterator var7 = this.aClass20_3146.iterator();

         while(var7.hasNext()) {
            Class526_Sub21_Sub13 var8 = (Class526_Sub21_Sub13)var7.next();
            var8.method10692(var1, var2, var3, (byte)68);
         }
      }

   }

   public Interface32 method3912(byte var1) {
      return this.anInterface32_3147;
   }

   public boolean method3913(int var1) {
      return this.aBool3173;
   }

   public Class307 method3914(byte var1) {
      return this.aClass307_3145;
   }

   public double[] method3915(int var1) {
      return this.aClass329_3149 != null && this.aClass329_3149.method4222(-1253141014)?this.aClass329_3149.method4205((byte)1):null;
   }

   public Class446 method3916(int var1) {
      return this.aClass689_3151 != null && this.aClass689_3151.method8081((short)-2229)?this.aClass689_3151.method8073(1870111824):null;
   }

   public Class526_Sub32 method3917(byte var1) {
      return null != this.aClass329_3149 && this.aClass329_3149.method4222(-806448417)?this.aClass329_3149.method4211(446357399):null;
   }

   public float method3918(int var1) {
      Class446 var2 = this.method3944(-1957887669);
      Class446 var3 = this.method3916(-1488926957);
      float var4 = 0.0F;
      if(var2 != null && null != var3) {
         Class446 var5 = Class446.method5275(var3, var2);
         float var6 = (float)Math.sqrt((double)(var5.aFloat4917 * var5.aFloat4917 + var5.aFloat4919 * var5.aFloat4919));
         var4 = (float)Math.atan2((double)(-var5.aFloat4915), (double)var6);
         var2.method5278();
         var3.method5278();
      }

      return var4;
   }

   public float method3919(int var1) {
      Class446 var2 = this.method3944(-1957887669);
      Class446 var3 = this.method3916(-1488926957);
      float var4 = 0.0F;
      if(var2 != null && null != var3) {
         Class446 var5 = Class446.method5275(var2, var3);
         var5.aFloat4915 = 0.0F;
         var4 = (float)Math.atan2((double)var5.aFloat4917, (double)var5.aFloat4919);
         var2.method5278();
         var3.method5278();
      }

      return (float)(3.141592653589793D - (double)var4);
   }

   public Class446 method3920(byte var1) {
      return this.aClass446_3154;
   }

   public float method3921(int var1) {
      return this.aFloat3160;
   }

   public float method3922(int var1) {
      return this.aFloat3166;
   }

   public float method3923(int var1) {
      return this.aFloat3167;
   }

   public float method3924(int var1) {
      return this.aFloat3176;
   }

   public boolean method3925(int var1) {
      return this.aBool3142;
   }

   public void method3926(float var1, float var2, byte var3) throws Exception_Sub2 {
      if(!this.method3893(2147078578)) {
         throw new Exception_Sub2();
      } else {
         this.aFloat3176 = var1;
         this.aFloat3171 = var2;
      }
   }

   public Class446 method3927(int var1) {
      return this.aClass446_3150;
   }

   Class292(Class302 var1, Interface32 var2) {
      this.aClass302_3155 = var1;
      this.anInterface32_3147 = var2;
      this.method3888(true, -785023546);
   }

   boolean method3928() {
      return Class302.aClass302_3261 == this.aClass302_3155 && this.aClass293_3141 == Class293.aClass293_3178?true:Class302.aClass302_3260 == this.aClass302_3155 && Class293.aClass293_3179 == this.aClass293_3141;
   }

   public boolean method3929(byte var1) {
      return this.aClass689_3151 != null && null != this.aClass329_3149?(!this.aClass689_3151.method8081((short)-32061)?false:this.aClass329_3149.method4222(-1609295453)):false;
   }

   public void method3930(Class446 var1) throws Exception_Sub2 {
      if(this.method3893(1032584010) && this.aClass287_3148.aBool3101) {
         this.aClass446_3154.method5267(var1);
      } else {
         throw new Exception_Sub2();
      }
   }

   public void method3931(int var1, float var2, short var3) throws Exception_Sub2 {
      if(this.method3893(459325488) && this.aClass287_3148.aBool3101) {
         this.anInt3159 = 714712383 * var1;
         this.aFloat3175 = var2;
      } else {
         throw new Exception_Sub2();
      }
   }

   public Class446 method3932(int var1) {
      return this.aClass446_3174;
   }

   public void method3933() {
      this.aClass20_3146.method647(929030154);
   }

   public void method3934(float var1, int var2) throws Exception_Sub2 {
      if(!this.method3893(1893450937)) {
         throw new Exception_Sub2();
      }
   }

   public void method3935(Class446 var1, int var2) throws Exception_Sub2 {
      if(this.method3893(-349973529) && this.aClass287_3148.aBool3101) {
         this.aClass446_3174.method5267(var1);
      } else {
         throw new Exception_Sub2();
      }
   }

   public Class446 method3936(byte var1) {
      return this.aClass446_3157;
   }

   public void method3937(Class446 var1, int var2) throws Exception_Sub2 {
      if(this.method3893(841530587) && this.aClass287_3148.aBool3101) {
         this.aClass446_3150.method5267(var1);
      } else {
         throw new Exception_Sub2();
      }
   }

   public Class689 method3938(byte var1) {
      return this.aClass689_3151;
   }

   float method3939(int var1) {
      return 0.0F;
   }

   public Class298 method3940(int var1) {
      return this.aClass298_3143;
   }

   public Class329 method3941(int var1) {
      return this.aClass329_3149;
   }

   public Class440 method3942(int var1) {
      Class440 var2 = Class440.method5192();
      var2.method5160(this.method3919(2007789835), this.method3918(-256238134), this.method3939(-1375737097));
      return var2;
   }

   public void method3943() throws Exception_Sub2 {
      if(!this.method3893(23080762)) {
         throw new Exception_Sub2();
      } else {
         this.aFloat3172 = 5120.0F;
         this.aFloat3153 = 10.0F;
         this.aFloat3161 = 1.0F;
      }
   }

   public Class446 method3944(int var1) {
      return null != this.aClass329_3149 && this.aClass329_3149.method4222(-533384395)?this.aClass329_3149.method4204(1987559301):null;
   }

   public static int method3945(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return 0 == var2?var0:(var2 == 1?var1:(var2 == 2?4095 - var0:4095 - var1));
   }

   public static int method3946(int var0, int var1, int var2, boolean var3, int var4) {
      if(0 != var0 && (var0 < 50 || var0 > 100)) {
         var0 = 0;
      }

      if(var1 != 0 && (var1 < 50 || var1 > 100)) {
         var1 = 0;
      }

      boolean var5 = Class497.aString5565.startsWith("mac");
      int[] var6 = Class570.aTwitchTV7639.GetRecommendedSettings(1895615023 * Class566.anInt7611, Class526_Sub24.anInt10549 * 974996221, var0, 2000, var2, Class570.aFloat7629, var5);
      if(0 != var6[0]) {
         return var6[0];
      } else {
         int var7 = var6[1];
         int var8 = var6[2];
         int var9 = var6[3];
         Class570.aLong7640 = 0L;
         Class561.aLong7557 = (long)(1000.0F / (float)var2) * 1574976579667415957L;
         Class570.anInt7645 = var7 * 1876530135;
         Class325.anInt3475 = 1052917321 * var8;
         if(0 != var1) {
            var9 = var9 * var1 / 100;
         }

         Class27.method722("Stream - Input: " + 1895615023 * Class566.anInt7611 + "x" + Class526_Sub24.anInt10549 * 974996221 + " (" + var9 + "kbps)" + " => " + "Output: " + var7 + "x" + var8 + " [" + (0 == var0?"auto":var0 + "%") + "] (" + var9 + "kbps [" + (var1 == 0?"auto":var1 + "%") + "])", -315839031);
         return Class570.aTwitchTV7639.StartStreaming(var7, var8, var2, var9, var1 != 0, Class570.aFloat7629, 633513217 * Class570.anInt7630, var3);
      }
   }

   static final void method3947(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class199_Sub14.method9017(var3, var4, var0, (byte)12);
   }

   static final void method3948(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-27);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class564.method6794(var3, var4, var0, -2138738800);
   }

   static final void method3949(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub42_10607.method8313(var2, -1694644457);
   }

   static final void method3950(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-22);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class220.method3045(var3, var4, var0, -1871646592);
   }

   static void method3951(Class174 var0, int var1, int var2, int var3, int var4, byte var5) {
      var0.method2538(var1, var2, var1 + var3, var4 + var2);
      int var7;
      int var8;
      if(Class525_Sub1.anInt10714 * -1166497171 < 100) {
         byte var16 = 20;
         var7 = var1 + var3 / 2;
         var8 = var4 / 2 + var2 - 18 - var16;
         var0.method2290(var1, var2, var3, var4, -16777216, 0);
         var0.method2261(var7 - 152, var8, 304, 34, client.aColorArray11037[-949066349 * client.anInt10986].getRGB(), 0);
         var0.method2290(var7 - 150, 2 + var8, 795475783 * Class525_Sub1.anInt10714, 30, client.aColorArray11036[-949066349 * client.anInt10986].getRGB(), 0);
         Class609.aClass163_7930.method1911(Class45.aClass45_583.method920(Class26.aClass673_247, -827840379), var7, var8 + var16, client.aColorArray11032[client.anInt10986 * -949066349].getRGB(), -1, (byte)32);
      } else {
         int var6 = Class71.anInt800 * -335635005 - (int)((float)var3 / Class525_Sub1.aFloat7103);
         var7 = Class116.anInt1438 * -623512625 + (int)((float)var4 / Class525_Sub1.aFloat7103);
         var8 = -335635005 * Class71.anInt800 + (int)((float)var3 / Class525_Sub1.aFloat7103);
         int var9 = Class116.anInt1438 * -623512625 - (int)((float)var4 / Class525_Sub1.aFloat7103);
         Class474.anInt5375 = 1932224057 * (-335635005 * Class71.anInt800 - (int)((float)var3 / Class525_Sub1.aFloat7103));
         Class24.anInt241 = 405924533 * (Class116.anInt1438 * -623512625 - (int)((float)var4 / Class525_Sub1.aFloat7103));
         Class195.anInt2183 = -1085782777 * (int)((float)(var3 * 2) / Class525_Sub1.aFloat7103);
         Class79.anInt821 = (int)((float)(2 * var4) / Class525_Sub1.aFloat7103) * -1856740259;
         Class525_Sub1.aClass192_7133 = Class525_Sub1.aClass192_7089;
         Class525_Sub1.method6327(Class525_Sub1.anInt7107 + var6, var7 + Class525_Sub1.anInt7150, Class525_Sub1.anInt7107 + var8, Class525_Sub1.anInt7150 + var9, var1, var2, var3 + var1, 1 + var4 + var2);
         Class525_Sub1.method6290(var0, !Class525_Sub1.aBool10726, !Class525_Sub1.aBool10731, client.aBool11230, false);
         Class702 var10 = Class525_Sub1.method6295(var0);
         Class304_Sub1.method9088(var0, var10, 0, 0, -775394940);
         if(client.aBool11015) {
            int var11 = var3 + var1 - 5;
            int var12 = var2 + var4 - 8;
            Class422.aClass163_4740.method1896("Fps: " + -421428705 * Class499.anInt5627 + " (" + 908183553 * Class499.anInt5618 + " ms)", var11, var12, 16776960, -1, (byte)-22);
            var12 -= 15;
            Runtime var13 = Runtime.getRuntime();
            int var14 = (int)((var13.totalMemory() - var13.freeMemory()) / 1024L);
            int var15 = 16776960;
            if(var14 > 65536) {
               var15 = 16711680;
            }

            Class422.aClass163_4740.method1896("Mem:" + var14 + "k", var11, var12, var15, -1, (byte)-101);
            var12 -= 15;
         }

         Class525_Sub1.aClass192_7089.method2769(5, (byte)-32);
      }
   }

   public static void method3952(int var0, int var1) {
      Class709.method8305(new Class584(var0), 1663338529);
   }
}
