package com.jagex;

import com.jagex.Class262;
import com.jagex.Class265;
import com.jagex.Class292;
import com.jagex.Class309;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class570;
import com.jagex.Class689;
import com.jagex.client;

public class Class689_Sub1 extends Class689 {
   Class446 aClass446_10910 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_10911 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_10909 = new Class446();

   public void method8086(RSByteBuffer var1, int var2) {
      this.aClass446_10911.method5306(var1);
   }

   public void method10147(Class526_Sub32 var1, int var2) {
      this.aClass446_10911.aFloat4917 = (float)(-1228547407 * var1.anInt10599);
      this.aClass446_10911.aFloat4915 = (float)(-1299508185 * var1.anInt10597);
      this.aClass446_10911.aFloat4919 = (float)(524465495 * var1.anInt10600);
      if(Float.isNaN(this.aClass446_10910.aFloat4917)) {
         this.aClass446_10910.method5267(this.aClass446_10911);
         this.aClass446_10909.method5268();
      }

   }

   public Class446 method8082() {
      return Class446.method5305(this.aClass446_10910);
   }

   public boolean method8081(short var1) {
      return !Float.isNaN(this.aClass446_10910.aFloat4917);
   }

   public Class446 method8088() {
      return Class446.method5305(this.aClass446_10911);
   }

   public Class446 method8073(int var1) {
      return Class446.method5305(this.aClass446_10910);
   }

   public Class446 method8075(int var1) {
      return Class446.method5305(this.aClass446_10911);
   }

   public void method8083(Class309 var1, Class445 var2, int var3, int var4, float var5, int var6) {
      Class446 var7 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var7.aFloat4917 -= (float)var3;
      var7.aFloat4919 -= (float)var4;
      var7.aFloat4915 *= -1.0F;
      Class446 var8 = Class446.method5305(this.aClass446_10910);
      var8.aFloat4917 -= (float)var3;
      var8.aFloat4919 -= (float)var4;
      var8.aFloat4915 *= -1.0F;
      var2.method5217((double)var7.aFloat4917, (double)var7.aFloat4915, (double)var7.aFloat4919, (double)var8.aFloat4917, (double)var8.aFloat4915, (double)var8.aFloat4919, 0.0F, 1.0F, 0.0F);
      var7.method5278();
      var8.method5278();
   }

   public void method8070(float var1) {
      this.aClass292_8691.method3889(false, var1, this.aClass446_10910, this.aClass292_8691.method3942(338590503), this.aClass446_10911, this.aClass446_10909, 1322477991);
   }

   public void method8076(float var1) {
      this.aClass292_8691.method3889(false, var1, this.aClass446_10910, this.aClass292_8691.method3942(1527107297), this.aClass446_10911, this.aClass446_10909, 1853570098);
   }

   public void method8080(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      Class446 var6 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var6.aFloat4917 -= (float)var3;
      var6.aFloat4919 -= (float)var4;
      var6.aFloat4915 *= -1.0F;
      Class446 var7 = Class446.method5305(this.aClass446_10910);
      var7.aFloat4917 -= (float)var3;
      var7.aFloat4919 -= (float)var4;
      var7.aFloat4915 *= -1.0F;
      var2.method5217((double)var6.aFloat4917, (double)var6.aFloat4915, (double)var6.aFloat4919, (double)var7.aFloat4917, (double)var7.aFloat4915, (double)var7.aFloat4919, 0.0F, 1.0F, 0.0F);
      var6.method5278();
      var7.method5278();
   }

   public boolean method8078() {
      return !Float.isNaN(this.aClass446_10910.aFloat4917);
   }

   public boolean method8079() {
      return !Float.isNaN(this.aClass446_10910.aFloat4917);
   }

   public Class446 method8084() {
      return Class446.method5305(this.aClass446_10910);
   }

   public Class689_Sub1(Class292 var1) {
      super(var1);
   }

   public Class446 method8077() {
      return Class446.method5305(this.aClass446_10910);
   }

   public void method8072(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      Class446 var6 = Class446.method5305(this.aClass292_8691.method3944(-1957887669));
      var6.aFloat4917 -= (float)var3;
      var6.aFloat4919 -= (float)var4;
      var6.aFloat4915 *= -1.0F;
      Class446 var7 = Class446.method5305(this.aClass446_10910);
      var7.aFloat4917 -= (float)var3;
      var7.aFloat4919 -= (float)var4;
      var7.aFloat4915 *= -1.0F;
      var2.method5217((double)var6.aFloat4917, (double)var6.aFloat4915, (double)var6.aFloat4919, (double)var7.aFloat4917, (double)var7.aFloat4915, (double)var7.aFloat4919, 0.0F, 1.0F, 0.0F);
      var6.method5278();
      var7.method5278();
   }

   public void method8074(RSByteBuffer var1) {
      this.aClass446_10911.method5306(var1);
   }

   public void method8085(RSByteBuffer var1) {
      this.aClass446_10911.method5306(var1);
   }

   public Class446 method8087() {
      return Class446.method5305(this.aClass446_10911);
   }

   public void method8071(float var1, byte var2) {
      this.aClass292_8691.method3889(false, var1, this.aClass446_10910, this.aClass292_8691.method3942(-349569566), this.aClass446_10911, this.aClass446_10909, 287846161);
   }

   public static void method10148(Class265 var0, int var1) {
      Class262.aClass265_2965 = var0;
   }

   public static int method10149(String var0, byte var1) {
      return Class570.aTwitchTV7639.SetStreamTitle(var0, client.aClass676_11127.aString8586);
   }
}
