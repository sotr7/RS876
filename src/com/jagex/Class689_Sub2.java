package com.jagex;

import com.jagex.Class292;
import com.jagex.Class307;
import com.jagex.Class309;
import com.jagex.Class329_Sub1;
import com.jagex.Class428;
import com.jagex.Class440;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class689;

public class Class689_Sub2 extends Class689 {
   static int anInt10938 = 0;
   static int anInt10942 = 0;
   static int anInt10939 = 0;
   static int anInt10937 = 0;
   static float aFloat10943 = -1.0F;
   static float aFloat10944 = -1.0F;
   static float aFloat10945 = -1.0F;
   static float aFloat10946 = -1.0F;
   static float aFloat10947 = -1.0F;
   static float aFloat10948 = -1.0F;
   Class440 aClass440_10941 = new Class440();
   Class440 aClass440_10940 = new Class440(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

   public void method8074(RSByteBuffer var1) {
      this.aClass440_10941.method5189(var1);
   }

   public void method10202(int var1) {
      anInt10938 = var1 * 452717223;
   }

   public void method10203(int var1, int var2) {
      anInt10938 = var1 * 452717223;
   }

   public void method10204(int var1, int var2) {
      anInt10942 = -1458866683 * var1;
   }

   public void method8083(Class309 var1, Class445 var2, int var3, int var4, float var5, int var6) {
      Class446 var7 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var7.aFloat4917 -= (float)var3;
      var7.aFloat4919 -= (float)var4;
      var7.aFloat4915 *= -1.0F;
      var2.method5245(Class440.method5170(this.aClass440_10941));
      var2.method5230(var7);
      var2.method5224();
      var7.method5278();
   }

   public Class446 method8073(int var1) {
      Class446 var2 = new Class446(0.0F, 0.0F, 1000.0F);
      var2.method5286(Class440.method5170(this.aClass440_10941));
      var2.aFloat4915 *= -1.0F;
      var2.method5272(this.aClass292_8691.method3944(-1957887669));
      return var2;
   }

   public Class446 method8075(int var1) {
      Class446 var2 = new Class446(0.0F, 0.0F, 1000.0F);
      var2.method5286(Class440.method5170(this.aClass440_10940));
      var2.aFloat4915 *= -1.0F;
      var2.method5272(this.aClass292_8691.method3944(-1957887669));
      return var2;
   }

   public void method10205(int var1, int var2, int var3, int var4) {
      Class445 var5 = new Class445();
      var5.method5217(0.0D, 0.0D, 0.0D, (double)var1, (double)(-var2), (double)var3, 0.0F, 1.0F, 0.0F);
      Class428 var6 = new Class428();
      var5.method5235(var6.aFloatArray4804);
      Class440 var7 = var6.method5035();
      var7.method5187();
      this.aClass440_10941.method5166(var7);
   }

   public void method8071(float var1, byte var2) {
      Class440 var3 = this.method10208((byte)-28);
      if(0 != anInt10938 * -1508958953 || 0 != 784525005 * anInt10942) {
         Class440 var4 = Class440.method5192();
         var4.method5193(1.0F, 0.0F, 0.0F, (float)(2.0D * (double)(anInt10938 * -1508958953) * 3.141592653589793D) / 16384.0F);
         var3.method5194(var4);
         Class446 var5 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var5.method5286(var3);
         Class440 var6 = Class440.method5192();
         var5.method5311();
         var6.method5188(var5, (float)((double)(784525005 * anInt10942) * 3.141592653589793D * 2.0D) / 16384.0F);
         var3.method5194(var6);
         this.method10210(var3, 1960734086);
         anInt10938 = 0;
         anInt10942 = 0;
      }

      if(this.aClass292_8691.method3914((byte)3) == Class307.aClass307_3293 && (0 != anInt10939 * -1141526769 || 0 != 1033763049 * anInt10937)) {
         var3.method5187();
         Class329_Sub1 var9 = (Class329_Sub1)this.aClass292_8691.method3941(-2010353672);
         Class526_Sub32 var10 = var9.method4211(763085021);
         Class446 var11 = var10.method9588(1165565544);
         Class446 var7 = Class446.method5309(0.0F, 0.0F, (float)(1033763049 * anInt10937));
         var7.method5286(var3);
         var7.aFloat4915 *= -1.0F;
         var11.method5272(var7);
         Class446 var8 = Class446.method5309((float)(anInt10939 * -1141526769), 0.0F, 0.0F);
         var8.method5286(var3);
         var8.aFloat4915 *= -1.0F;
         var11.method5272(var8);
         this.method10212(var11, 1671854271);
         var9.method9040(new Class526_Sub32(-1855988921 * var10.anInt10598, (int)var11.aFloat4917, (int)var11.aFloat4915, (int)var11.aFloat4919), -2095606312);
         anInt10939 = 0;
         anInt10937 = 0;
      }

   }

   public void method10206(int var1, int var2) {
      anInt10939 = var1 * 732258287;
   }

   public void method10207(Class446 var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      aFloat10943 = -1 == var2?-1.0F:var1.aFloat4917 - (float)(var2 * 512);
      aFloat10944 = var3 == -1?-1.0F:(float)(512 * var3) + var1.aFloat4917;
      aFloat10945 = -1 == var6?-1.0F:-var1.aFloat4915 - (float)(var6 * 512);
      aFloat10946 = -1 == var7?-1.0F:-var1.aFloat4915 + (float)(512 * var7);
      aFloat10947 = -1 == var4?-1.0F:var1.aFloat4919 - (float)(512 * var4);
      aFloat10948 = var5 == -1?-1.0F:var1.aFloat4919 + (float)(512 * var5);
   }

   public boolean method8081(short var1) {
      return !Float.isNaN(this.aClass440_10941.aFloat4871) && this.aClass292_8691.method3944(-1957887669) != null;
   }

   public Class440 method10208(byte var1) {
      return new Class440(this.aClass440_10941);
   }

   public void method10209(int var1) {
      anInt10938 = var1 * 452717223;
   }

   public void method8076(float var1) {
      Class440 var2 = this.method10208((byte)27);
      if(0 != anInt10938 * -1508958953 || 0 != 784525005 * anInt10942) {
         Class440 var3 = Class440.method5192();
         var3.method5193(1.0F, 0.0F, 0.0F, (float)(2.0D * (double)(anInt10938 * -1508958953) * 3.141592653589793D) / 16384.0F);
         var2.method5194(var3);
         Class446 var4 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var4.method5286(var2);
         Class440 var5 = Class440.method5192();
         var4.method5311();
         var5.method5188(var4, (float)((double)(784525005 * anInt10942) * 3.141592653589793D * 2.0D) / 16384.0F);
         var2.method5194(var5);
         this.method10210(var2, 1960734086);
         anInt10938 = 0;
         anInt10942 = 0;
      }

      if(this.aClass292_8691.method3914((byte)3) == Class307.aClass307_3293 && (0 != anInt10939 * -1141526769 || 0 != 1033763049 * anInt10937)) {
         var2.method5187();
         Class329_Sub1 var8 = (Class329_Sub1)this.aClass292_8691.method3941(1738521066);
         Class526_Sub32 var9 = var8.method4211(404060529);
         Class446 var10 = var9.method9588(1935232966);
         Class446 var6 = Class446.method5309(0.0F, 0.0F, (float)(1033763049 * anInt10937));
         var6.method5286(var2);
         var6.aFloat4915 *= -1.0F;
         var10.method5272(var6);
         Class446 var7 = Class446.method5309((float)(anInt10939 * -1141526769), 0.0F, 0.0F);
         var7.method5286(var2);
         var7.aFloat4915 *= -1.0F;
         var10.method5272(var7);
         this.method10212(var10, 1671854271);
         var8.method9040(new Class526_Sub32(-1855988921 * var9.anInt10598, (int)var10.aFloat4917, (int)var10.aFloat4915, (int)var10.aFloat4919), -646167890);
         anInt10939 = 0;
         anInt10937 = 0;
      }

   }

   public void method8070(float var1) {
      Class440 var2 = this.method10208((byte)30);
      if(0 != anInt10938 * -1508958953 || 0 != 784525005 * anInt10942) {
         Class440 var3 = Class440.method5192();
         var3.method5193(1.0F, 0.0F, 0.0F, (float)(2.0D * (double)(anInt10938 * -1508958953) * 3.141592653589793D) / 16384.0F);
         var2.method5194(var3);
         Class446 var4 = Class446.method5309(0.0F, 1.0F, 0.0F);
         var4.method5286(var2);
         Class440 var5 = Class440.method5192();
         var4.method5311();
         var5.method5188(var4, (float)((double)(784525005 * anInt10942) * 3.141592653589793D * 2.0D) / 16384.0F);
         var2.method5194(var5);
         this.method10210(var2, 1960734086);
         anInt10938 = 0;
         anInt10942 = 0;
      }

      if(this.aClass292_8691.method3914((byte)3) == Class307.aClass307_3293 && (0 != anInt10939 * -1141526769 || 0 != 1033763049 * anInt10937)) {
         var2.method5187();
         Class329_Sub1 var8 = (Class329_Sub1)this.aClass292_8691.method3941(-636449992);
         Class526_Sub32 var9 = var8.method4211(1489784448);
         Class446 var10 = var9.method9588(1412751626);
         Class446 var6 = Class446.method5309(0.0F, 0.0F, (float)(1033763049 * anInt10937));
         var6.method5286(var2);
         var6.aFloat4915 *= -1.0F;
         var10.method5272(var6);
         Class446 var7 = Class446.method5309((float)(anInt10939 * -1141526769), 0.0F, 0.0F);
         var7.method5286(var2);
         var7.aFloat4915 *= -1.0F;
         var10.method5272(var7);
         this.method10212(var10, 1671854271);
         var8.method9040(new Class526_Sub32(-1855988921 * var9.anInt10598, (int)var10.aFloat4917, (int)var10.aFloat4915, (int)var10.aFloat4919), -459147505);
         anInt10939 = 0;
         anInt10937 = 0;
      }

   }

   public boolean method8078() {
      return !Float.isNaN(this.aClass440_10941.aFloat4871) && this.aClass292_8691.method3944(-1957887669) != null;
   }

   public boolean method8079() {
      return !Float.isNaN(this.aClass440_10941.aFloat4871) && this.aClass292_8691.method3944(-1957887669) != null;
   }

   public void method8080(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      Class446 var6 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var6.aFloat4917 -= (float)var3;
      var6.aFloat4919 -= (float)var4;
      var6.aFloat4915 *= -1.0F;
      var2.method5245(Class440.method5170(this.aClass440_10941));
      var2.method5230(var6);
      var2.method5224();
      var6.method5278();
   }

   public void method8072(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      Class446 var6 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var6.aFloat4917 -= (float)var3;
      var6.aFloat4919 -= (float)var4;
      var6.aFloat4915 *= -1.0F;
      var2.method5245(Class440.method5170(this.aClass440_10941));
      var2.method5230(var6);
      var2.method5224();
      var6.method5278();
   }

   public Class446 method8082() {
      Class446 var1 = new Class446(0.0F, 0.0F, 1000.0F);
      var1.method5286(Class440.method5170(this.aClass440_10941));
      var1.aFloat4915 *= -1.0F;
      var1.method5272(this.aClass292_8691.method3944(-1957887669));
      return var1;
   }

   public Class446 method8077() {
      Class446 var1 = new Class446(0.0F, 0.0F, 1000.0F);
      var1.method5286(Class440.method5170(this.aClass440_10941));
      var1.aFloat4915 *= -1.0F;
      var1.method5272(this.aClass292_8691.method3944(-1957887669));
      return var1;
   }

   public Class446 method8084() {
      Class446 var1 = new Class446(0.0F, 0.0F, 1000.0F);
      var1.method5286(Class440.method5170(this.aClass440_10941));
      var1.aFloat4915 *= -1.0F;
      var1.method5272(this.aClass292_8691.method3944(-1957887669));
      return var1;
   }

   public void method10210(Class440 var1, int var2) {
      this.aClass440_10940.aFloat4871 = var1.aFloat4871;
      this.aClass440_10940.aFloat4868 = var1.aFloat4868;
      this.aClass440_10940.aFloat4873 = var1.aFloat4873;
      this.aClass440_10940.aFloat4872 = var1.aFloat4872;
      this.aClass440_10941.method5166(this.aClass440_10940);
   }

   public void method8085(RSByteBuffer var1) {
      this.aClass440_10941.method5189(var1);
   }

   public void method10211(int var1) {
      anInt10942 = -1458866683 * var1;
   }

   void method10212(Class446 var1, int var2) {
      if(-1.0F != aFloat10943 && var1.aFloat4917 < aFloat10943) {
         var1.aFloat4917 = aFloat10943;
      }

      if(-1.0F != aFloat10944 && var1.aFloat4917 > aFloat10944) {
         var1.aFloat4917 = aFloat10944;
      }

      if(-1.0F != aFloat10945 && var1.aFloat4915 < aFloat10945) {
         var1.aFloat4915 = aFloat10945;
      }

      if(aFloat10946 != -1.0F && var1.aFloat4915 > aFloat10946) {
         var1.aFloat4915 = aFloat10946;
      }

      if(-1.0F != aFloat10947 && var1.aFloat4919 < aFloat10947) {
         var1.aFloat4919 = aFloat10947;
      }

      if(aFloat10948 != -1.0F && var1.aFloat4919 > aFloat10948) {
         var1.aFloat4919 = aFloat10948;
      }

   }

   public void method10213(int var1, int var2) {
      anInt10937 = var1 * -1656332455;
   }

   public void method10214(int var1) {
      anInt10939 = var1 * 732258287;
   }

   public Class440 method10215() {
      return new Class440(this.aClass440_10941);
   }

   public void method10216(int var1) {
      anInt10937 = var1 * -1656332455;
   }

   public Class446 method8087() {
      Class446 var1 = new Class446(0.0F, 0.0F, 1000.0F);
      var1.method5286(Class440.method5170(this.aClass440_10940));
      var1.aFloat4915 *= -1.0F;
      var1.method5272(this.aClass292_8691.method3944(-1957887669));
      return var1;
   }

   public Class446 method8088() {
      Class446 var1 = new Class446(0.0F, 0.0F, 1000.0F);
      var1.method5286(Class440.method5170(this.aClass440_10940));
      var1.aFloat4915 *= -1.0F;
      var1.method5272(this.aClass292_8691.method3944(-1957887669));
      return var1;
   }

   public Class689_Sub2(Class292 var1) {
      super(var1);
   }

   public void method10217(int var1) {
      anInt10939 = var1 * 732258287;
   }

   public Class440 method10218() {
      return new Class440(this.aClass440_10941);
   }

   public void method8086(RSByteBuffer var1, int var2) {
      this.aClass440_10941.method5189(var1);
   }

   public static boolean method10219(int var0, byte var1) {
      return 1 == var0 || 3 == var0 || var0 == 5;
   }
}
