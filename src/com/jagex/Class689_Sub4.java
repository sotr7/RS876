package com.jagex;

import com.jagex.Class230;
import com.jagex.Class273;
import com.jagex.Class292;
import com.jagex.Class309;
import com.jagex.Class329_Sub3;
import com.jagex.Class358;
import com.jagex.Class432;
import com.jagex.Class440;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class452_Sub5;
import com.jagex.RSByteBuffer;
import com.jagex.Class554;
import com.jagex.Class689;
import com.jagex.client;

public class Class689_Sub4 extends Class689 {
   Class432 aClass432_10963 = null;
   Class329_Sub3 aClass329_Sub3_10962 = null;

   public void method8086(RSByteBuffer var1, int var2) {
      this.aClass432_10963 = new Class432(var1);
   }

   public void method8071(float var1, byte var2) {
   }

   public boolean method8081(short var1) {
      return null != this.aClass432_10963 && this.aClass329_Sub3_10962 != null && this.aClass329_Sub3_10962.method4222(-1457676096);
   }

   double[] method10246(int var1) {
      return this.aClass432_10963.method5065(this.aClass329_Sub3_10962.method9162((byte)3));
   }

   public Class446 method8075(int var1) {
      return this.method8073(1824603079);
   }

   public void method8072(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      double[] var6 = this.aClass292_8691.method3915(-61474122);
      var6[0] -= (double)var3;
      var6[2] -= (double)var4;
      double[] var7 = this.method10246(-729259733);
      var7[0] -= (double)var3;
      var7[2] -= (double)var4;
      var6[1] *= -1.0D;
      var7[1] *= -1.0D;
      Class446 var8 = Class446.method5312();
      var8.aFloat4917 = (float)(var7[0] - var6[0]);
      var8.aFloat4915 = (float)(var7[1] - var6[1]);
      var8.aFloat4919 = (float)(var7[2] - var6[2]);
      var8.method5311();
      Class440 var9 = new Class440();
      var9.method5188(var8, var5);
      Class446 var10 = Class446.method5309(0.0F, 1.0F, 0.0F);
      Class446 var11 = Class446.method5308(var8, var10);
      var10 = Class446.method5308(var11, var8);
      var10.method5286(var9);
      var2.method5217(var6[0], var6[1], var6[2], var7[0], var7[1], var7[2], var10.aFloat4917, var10.aFloat4915, var10.aFloat4919);
      var10.method5278();
   }

   public void method8074(RSByteBuffer var1) {
      this.aClass432_10963 = new Class432(var1);
   }

   public void method8076(float var1) {
   }

   public void method8070(float var1) {
   }

   public boolean method8079() {
      return null != this.aClass432_10963 && this.aClass329_Sub3_10962 != null && this.aClass329_Sub3_10962.method4222(-1814193106);
   }

   public Class689_Sub4(Class292 var1) {
      super(var1);
   }

   public void method8080(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      double[] var6 = this.aClass292_8691.method3915(-61474122);
      var6[0] -= (double)var3;
      var6[2] -= (double)var4;
      double[] var7 = this.method10246(-1484452331);
      var7[0] -= (double)var3;
      var7[2] -= (double)var4;
      var6[1] *= -1.0D;
      var7[1] *= -1.0D;
      Class446 var8 = Class446.method5312();
      var8.aFloat4917 = (float)(var7[0] - var6[0]);
      var8.aFloat4915 = (float)(var7[1] - var6[1]);
      var8.aFloat4919 = (float)(var7[2] - var6[2]);
      var8.method5311();
      Class440 var9 = new Class440();
      var9.method5188(var8, var5);
      Class446 var10 = Class446.method5309(0.0F, 1.0F, 0.0F);
      Class446 var11 = Class446.method5308(var8, var10);
      var10 = Class446.method5308(var11, var8);
      var10.method5286(var9);
      var2.method5217(var6[0], var6[1], var6[2], var7[0], var7[1], var7[2], var10.aFloat4917, var10.aFloat4915, var10.aFloat4919);
      var10.method5278();
   }

   public Class446 method8087() {
      return this.method8073(647598421);
   }

   public void method8083(Class309 var1, Class445 var2, int var3, int var4, float var5, int var6) {
      double[] var7 = this.aClass292_8691.method3915(-61474122);
      var7[0] -= (double)var3;
      var7[2] -= (double)var4;
      double[] var8 = this.method10246(-1830800995);
      var8[0] -= (double)var3;
      var8[2] -= (double)var4;
      var7[1] *= -1.0D;
      var8[1] *= -1.0D;
      Class446 var9 = Class446.method5312();
      var9.aFloat4917 = (float)(var8[0] - var7[0]);
      var9.aFloat4915 = (float)(var8[1] - var7[1]);
      var9.aFloat4919 = (float)(var8[2] - var7[2]);
      var9.method5311();
      Class440 var10 = new Class440();
      var10.method5188(var9, var5);
      Class446 var11 = Class446.method5309(0.0F, 1.0F, 0.0F);
      Class446 var12 = Class446.method5308(var9, var11);
      var11 = Class446.method5308(var12, var9);
      var11.method5286(var10);
      var2.method5217(var7[0], var7[1], var7[2], var8[0], var8[1], var8[2], var11.aFloat4917, var11.aFloat4915, var11.aFloat4919);
      var11.method5278();
   }

   public Class446 method8077() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432_10963.method5065(this.aClass329_Sub3_10962.method9162((byte)12));
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public Class446 method8084() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432_10963.method5065(this.aClass329_Sub3_10962.method9162((byte)4));
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public Class446 method8073(int var1) {
      Class446 var2 = Class446.method5312();
      double[] var3 = this.aClass432_10963.method5065(this.aClass329_Sub3_10962.method9162((byte)-80));
      var2.aFloat4917 = (float)var3[0];
      var2.aFloat4915 = (float)var3[1];
      var2.aFloat4919 = (float)var3[2];
      return var2;
   }

   public void method8085(RSByteBuffer var1) {
      this.aClass432_10963 = new Class432(var1);
   }

   public boolean method8078() {
      return null != this.aClass432_10963 && this.aClass329_Sub3_10962 != null && this.aClass329_Sub3_10962.method4222(-1303427693);
   }

   public Class446 method8088() {
      return this.method8073(1830876281);
   }

   public Class446 method8082() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432_10963.method5065(this.aClass329_Sub3_10962.method9162((byte)-28));
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public static void method10247(byte var0) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10619, 1, (short)-27995);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub18_10627, 1, (short)-24336);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub11_10609, 1, (short)-29205);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub31_10635, 1, (short)-7062);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub39_10617, 0, (short)-23854);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub20_10616, 0, (short)-10453);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub3_10644, 0, (short)-2874);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub1_10622, 0, (short)-28580);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub17_10601, 0, (short)-31059);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub9_10618, 0, (short)-20106);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub16_10634, 0, (short)-6554);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub15_10610, 0, (short)-29260);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10608, 0, (short)-27259);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub33_10645, 0, (short)-8198);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub8_10625, 0, (short)5);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub12_10613, 676914057 * Class273.aClass273_3000.anInt3006, (short)-15572);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub26_10611, 0, (short)-24084);
      if(Class554.aClass174_7475 != null && Class554.aClass174_7475.method2240() && Class554.aClass174_7475.method2548()) {
         Class554.aClass174_7475.method2604();
      }

      Class230.preferences.method9602(Class230.preferences.aClass711_Sub21_10629, 0, (short)-9141);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub42_10607, 0, (short)-11987);
      Class358.method4586((byte)2);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub43_10628, 2, (short)-8549);
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub27_10648, 2, (short)-24778);
      Class452_Sub5.method9307(1873282654);
      client.aClass505_11204.method6100((byte)34).method7377((byte)0);
      client.aBool11104 = true;
   }
}
