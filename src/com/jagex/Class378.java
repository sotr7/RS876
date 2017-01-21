package com.jagex;

import com.jagex.Class113;
import com.jagex.Class149;
import com.jagex.Class153;
import com.jagex.Class173;
import com.jagex.Class181;
import com.jagex.Class230;
import com.jagex.Class255;
import com.jagex.Class287;
import com.jagex.Class318_Sub2;
import com.jagex.Class34;
import com.jagex.Class358;
import com.jagex.Class36;
import com.jagex.Class446;
import com.jagex.Class464;
import com.jagex.RSByteBuffer;
import com.jagex.Class539_Sub3;
import com.jagex.Class554;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class661;
import com.jagex.Class681;
import com.jagex.Interface40;
import com.jagex.client;

public class Class378 {
   float aFloat3925;
   float aFloat3922;
   float aFloat3923;
   long aLong3924;
   long aLong3920;
   Class378 aClass378_3919;
   Interface40 anInterface40_3918;
   float aFloat3921;

   public float method4678() {
      float var1 = 1.0F;

      for(Class378 var2 = this; var2 != null; var2 = var2.method4683(1036688891)) {
         var1 *= var2.method4685(-127066323);
      }

      return var1;
   }

   public float method4679(int var1) {
      float var2 = 1.0F;

      for(Class378 var3 = this; var3 != null; var3 = var3.method4683(-1750387832)) {
         var2 *= var3.method4685(-476460507);
      }

      return var2;
   }

   public float method4680(int var1) {
      float var2 = this.aFloat3925;

      for(Class378 var3 = this.aClass378_3919; var3 != null; var3 = var3.method4683(-1750911275)) {
         var2 *= var3.method4681((byte)3);
      }

      var2 = Math.min(Math.max(var2, 0.0F), 1.0F);
      return var2;
   }

   public float method4681(byte var1) {
      return this.aFloat3925;
   }

   void method4682(int var1) {
      if(null != this.anInterface40_3918) {
         float var2 = this.anInterface40_3918.method332(2100690001);
         if(var2 != this.aFloat3925 && this.aFloat3923 < 0.0F) {
            this.aFloat3922 = this.aFloat3925;
            this.aFloat3923 = var2;
            this.aLong3924 = Class255.time((byte)24) * -2672545237255652727L;
            this.aLong3920 = 8382961820130151579L * this.aLong3924 + -5181872617665114388L;
         }
      }

      if(this.aFloat3923 >= 0.0F) {
         long var3 = Class255.time((byte)24);
         if(var3 > this.aLong3920 * -2615416411598005189L) {
            this.aFloat3925 = this.aFloat3923;
            this.aFloat3923 = -1.0F;
         } else {
            float var5 = this.aFloat3923 - this.aFloat3922;
            long var6 = -2615416411598005189L * this.aLong3920 - this.aLong3924 * -7573938355831530567L;
            float var8 = var5 / (float)var6;
            this.aFloat3925 = this.aFloat3922 + var8 * (float)(var3 - this.aLong3924 * -7573938355831530567L);
            if(this.aFloat3923 == this.aFloat3925) {
               this.aFloat3923 = -1.0F;
            }
         }
      }

      this.aFloat3925 = Math.min(1.0F, Math.max(this.aFloat3925, 0.0F));
   }

   public Class378 method4683(int var1) {
      return this.aClass378_3919;
   }

   float method4684() {
      return this.aFloat3921;
   }

   float method4685(int var1) {
      return this.aFloat3921;
   }

   public float method4686() {
      float var1 = 1.0F;

      for(Class378 var2 = this; var2 != null; var2 = var2.method4683(-568013417)) {
         var1 *= var2.method4685(346140935);
      }

      return var1;
   }

   public float method4687() {
      float var1 = this.aFloat3925;

      for(Class378 var2 = this.aClass378_3919; var2 != null; var2 = var2.method4683(-2049087684)) {
         var1 *= var2.method4681((byte)3);
      }

      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      return var1;
   }

   public float method4688() {
      float var1 = 1.0F;

      for(Class378 var2 = this; var2 != null; var2 = var2.method4683(190438247)) {
         var1 *= var2.method4685(1017506756);
      }

      return var1;
   }

   public float method4689() {
      float var1 = 1.0F;

      for(Class378 var2 = this; var2 != null; var2 = var2.method4683(-216814671)) {
         var1 *= var2.method4685(896435916);
      }

      return var1;
   }

   void method4690() {
      if(null != this.anInterface40_3918) {
         float var1 = this.anInterface40_3918.method332(1754304371);
         if(var1 != this.aFloat3925 && this.aFloat3923 < 0.0F) {
            this.aFloat3922 = this.aFloat3925;
            this.aFloat3923 = var1;
            this.aLong3924 = Class255.time((byte)24) * -2672545237255652727L;
            this.aLong3920 = 8382961820130151579L * this.aLong3924 + -5181872617665114388L;
         }
      }

      if(this.aFloat3923 >= 0.0F) {
         long var2 = Class255.time((byte)24);
         if(var2 > this.aLong3920 * -2615416411598005189L) {
            this.aFloat3925 = this.aFloat3923;
            this.aFloat3923 = -1.0F;
         } else {
            float var4 = this.aFloat3923 - this.aFloat3922;
            long var5 = -2615416411598005189L * this.aLong3920 - this.aLong3924 * -7573938355831530567L;
            float var7 = var4 / (float)var5;
            this.aFloat3925 = this.aFloat3922 + var7 * (float)(var2 - this.aLong3924 * -7573938355831530567L);
            if(this.aFloat3923 == this.aFloat3925) {
               this.aFloat3923 = -1.0F;
            }
         }
      }

      this.aFloat3925 = Math.min(1.0F, Math.max(this.aFloat3925, 0.0F));
   }

   void method4691() {
      if(null != this.anInterface40_3918) {
         float var1 = this.anInterface40_3918.method332(2024912548);
         if(var1 != this.aFloat3925 && this.aFloat3923 < 0.0F) {
            this.aFloat3922 = this.aFloat3925;
            this.aFloat3923 = var1;
            this.aLong3924 = Class255.time((byte)24) * -2672545237255652727L;
            this.aLong3920 = 8382961820130151579L * this.aLong3924 + -5181872617665114388L;
         }
      }

      if(this.aFloat3923 >= 0.0F) {
         long var2 = Class255.time((byte)24);
         if(var2 > this.aLong3920 * -2615416411598005189L) {
            this.aFloat3925 = this.aFloat3923;
            this.aFloat3923 = -1.0F;
         } else {
            float var4 = this.aFloat3923 - this.aFloat3922;
            long var5 = -2615416411598005189L * this.aLong3920 - this.aLong3924 * -7573938355831530567L;
            float var7 = var4 / (float)var5;
            this.aFloat3925 = this.aFloat3922 + var7 * (float)(var2 - this.aLong3924 * -7573938355831530567L);
            if(this.aFloat3923 == this.aFloat3925) {
               this.aFloat3923 = -1.0F;
            }
         }
      }

      this.aFloat3925 = Math.min(1.0F, Math.max(this.aFloat3925, 0.0F));
   }

   Class378(int var1, float var2, Object var3, Class358 var4, Interface40 var5, Class378 var6) {
      this.aClass378_3919 = var6;
      this.anInterface40_3918 = var5;
      this.aFloat3925 = 1.0F;
      this.aFloat3921 = var2;
      this.aFloat3922 = -1.0F;
      this.aFloat3923 = -1.0F;
      this.aLong3924 = 2672545237255652727L;
      this.aLong3920 = 1343090811336319757L;
   }

   public float method4692() {
      return this.aFloat3925;
   }

   public void method4693(float var1) {
      if(null == this.anInterface40_3918) {
         this.aFloat3923 = var1;
         this.aFloat3922 = this.aFloat3925;
         this.aLong3924 = Class255.time((byte)24) * -2672545237255652727L;
         this.aLong3920 = -5181872617665114388L + this.aLong3924 * 8382961820130151579L;
      }

   }

   public void method4694(float var1, byte var2) {
      if(null == this.anInterface40_3918) {
         this.aFloat3923 = var1;
         this.aFloat3922 = this.aFloat3925;
         this.aLong3924 = Class255.time((byte)24) * -2672545237255652727L;
         this.aLong3920 = -5181872617665114388L + this.aLong3924 * 8382961820130151579L;
      }

   }

   static final int method4695(int var0, byte var1) {
      var0 -= 2;
      return var0 < 4?var0:3;
   }

   static void method4696(byte var0) {
      if(null == Class661.anIntArray8516) {
         Class661.anIntArray8516 = new int[65536];
         Class34.anIntArray371 = new int[65536];
         double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);

         for(int var3 = 0; var3 < 65536; ++var3) {
            double var4 = 0.0078125D + (double)(var3 >> 10 & 63) / 64.0D;
            double var6 = (double)(var3 >> 7 & 7) / 8.0D + 0.0625D;
            double var8 = (double)(var3 & 127) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if(0.0D != var6) {
               double var16;
               if(var8 < 0.5D) {
                  var16 = var8 * (var6 + 1.0D);
               } else {
                  var16 = var6 + var8 - var8 * var6;
               }

               double var18 = 2.0D * var8 - var16;
               double var20 = 0.3333333333333333D + var4;
               if(var20 > 1.0D) {
                  --var20;
               }

               double var24 = var4 - 0.3333333333333333D;
               if(var24 < 0.0D) {
                  ++var24;
               }

               if(var20 * 6.0D < 1.0D) {
                  var10 = (var16 - var18) * 6.0D * var20 + var18;
               } else if(2.0D * var20 < 1.0D) {
                  var10 = var16;
               } else if(3.0D * var20 < 2.0D) {
                  var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
               } else {
                  var10 = var18;
               }

               if(6.0D * var4 < 1.0D) {
                  var12 = var4 * (var16 - var18) * 6.0D + var18;
               } else if(var4 * 2.0D < 1.0D) {
                  var12 = var16;
               } else if(3.0D * var4 < 2.0D) {
                  var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
               } else {
                  var12 = var18;
               }

               if(6.0D * var24 < 1.0D) {
                  var14 = var18 + var24 * 6.0D * (var16 - var18);
               } else if(2.0D * var24 < 1.0D) {
                  var14 = var16;
               } else if(var24 * 3.0D < 2.0D) {
                  var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
               } else {
                  var14 = var18;
               }
            }

            var10 = Math.pow(var10, var1);
            var12 = Math.pow(var12, var1);
            var14 = Math.pow(var14, var1);
            int var26 = (int)(var10 * 256.0D);
            int var27 = (int)(var12 * 256.0D);
            int var28 = (int)(256.0D * var14);
            int var29 = (var27 << 8) + (var26 << 16) + var28;
            Class661.anIntArray8516[var3] = var29 & 16777215;
            int var30 = var26 + (var28 << 16) + (var27 << 8);
            Class34.anIntArray371[var3] = var30;
         }

      }
   }

   static final void method4697(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      Class464.method5493(var2, (short)-9873);
   }

   static final void method4698(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class287.method3808(Class318_Sub2.aClass526_Sub9_10065 == var0.aClass526_Sub9_8646, var2, -1551862497);
   }

   static final void method4699(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub19_10632.method8313(var2, -2117642935);
   }

   static final void method4700(Class681 var0, int var1) {
      throw new RuntimeException("");
   }

   static final void method4701(Class639_Sub1_Sub2_Sub1 var0, Class639_Sub1_Sub2_Sub1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var1.method10788(982058136);
      if(-1 != var10) {
         Class153 var11 = null;
         var11 = (Class153)client.aClass192_11286.method2765((long)var10);
         if(var11 == null) {
            Class173[] var12 = Class181.method2681(Class113.aClass466_1370, var10, 0);
            if(null == var12) {
               return;
            }

            var11 = Class554.aClass174_7475.method2310(var12[0], true);
            client.aClass192_11286.method2768(var11, (long)var10);
         }

         Class446 var16 = var0.method7635().aClass446_4816;
         Class149.method1751(var0.aByte10827, (int)var16.aFloat4917, (int)var16.aFloat4919, var0.method10781(-627148024) * 256, 0, false, false, -579745226);
         int var13 = (int)(client.aFloatArray11132[0] + (float)var3 - 18.0F);
         int var14 = (int)((float)var4 + client.aFloatArray11132[1] - 16.0F - 54.0F);
         var13 += 18 * (var2 / 4);
         var14 += var2 % 4 * 18;
         var11.method1778(var13, var14);
         if(var0 == var1) {
            Class554.aClass174_7475.method2284(var13 - 1, var14 - 1, 18, 18, -256, -1939382970);
         }

         Class539_Sub3 var15 = Class36.method841(426010303);
         var15.aClass639_Sub1_Sub2_Sub1_10336 = var1;
         var15.anInt10337 = 739962021 * var13;
         var15.anInt10334 = 1889966219 * var14;
         var15.anInt10339 = 1402968851 * (var13 + 16);
         var15.anInt10340 = -1721694925 * (16 + var14);
         client.aClass686_11083.method8058(var15, (byte)-116);
      }
   }

   static int method4702(byte[] var0, int var1, int var2, int var3) {
      int var4 = -1;

      for(int var5 = var1; var5 < var2; ++var5) {
         var4 = var4 >>> 8 ^ RSByteBuffer.anIntArray10674[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }
}
