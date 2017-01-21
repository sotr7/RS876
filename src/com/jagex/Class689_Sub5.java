package com.jagex;

import com.jagex.Class292;
import com.jagex.Class309;
import com.jagex.Class432;
import com.jagex.Class440;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.RSByteBuffer;
import com.jagex.Class636;
import com.jagex.Class689;

public abstract class Class689_Sub5 extends Class689 {
   int anInt10975 = 0;
   float aFloat10978 = 0.0F;
   float aFloat10977 = 0.0F;
   Class432[] aClass432Array10976;
   float[] aFloatArray10974;
   int[] anIntArray10973;

   Class689_Sub5(Class292 var1) {
      super(var1);
   }

   public void method8070(float var1) {
      Class432 var2 = this.aClass432Array10976[this.anInt10975 * -1177939923];
      if(this.aFloatArray10974[this.anInt10975 * -1177939923] > 0.0F) {
         if(this.aFloatArray10974[-1177939923 * this.anInt10975] >= var1) {
            this.aFloatArray10974[-1177939923 * this.anInt10975] -= var1;
            return;
         }

         var1 -= this.aFloatArray10974[this.anInt10975 * -1177939923];
         this.aFloatArray10974[this.anInt10975 * -1177939923] = 0.0F;
      }

      float var3 = 1.0F / (float)Class636.method7565(418754241);

      while(var1 > 0.0F) {
         float var4 = var2.method5066();
         if(this.aFloat10978 >= var4) {
            if(this.aClass432Array10976.length == 1 + this.anInt10975 * -1177939923) {
               return;
            }

            if(this.aFloatArray10974[1 + -1177939923 * this.anInt10975] >= var1) {
               this.aFloatArray10974[-1177939923 * this.anInt10975 + 1] -= var1;
               return;
            }

            this.anInt10975 += 1991950245;
            var1 -= this.aFloatArray10974[-1177939923 * this.anInt10975];
            this.aFloatArray10974[-1177939923 * this.anInt10975] = 0.0F;
            this.method10281((byte)72);
            this.aFloat10978 = 0.0F;
            this.aFloat10977 = 0.0F;
            var2 = this.aClass432Array10976[this.anInt10975 * -1177939923];
            var4 = var2.method5066();
         }

         while(var1 > 0.0F && this.aFloat10978 < var4) {
            this.aFloat10977 = this.method10280(var4, this.aFloat10977, Math.min(var1, var3), 16711935);
            var1 -= var3;
            this.method10279(this.aFloat10977, var4, -1156899078);
         }
      }

   }

   void method10279(float var1, float var2, int var3) {
      this.aFloat10978 += var1;
      if(this.aFloat10978 > var2) {
         this.aFloat10978 = var2;
      }

   }

   abstract float method10280(float var1, float var2, float var3, int var4);

   abstract void method10281(byte var1);

   public boolean method8081(short var1) {
      return null != this.aClass432Array10976;
   }

   public Class446 method8073(int var1) {
      Class446 var2 = Class446.method5312();
      double[] var3 = this.aClass432Array10976[-1177939923 * this.anInt10975].method5067(this.aFloat10978);
      var2.aFloat4917 = (float)var3[0];
      var2.aFloat4915 = (float)var3[1];
      var2.aFloat4919 = (float)var3[2];
      return var2;
   }

   double[] method10282(int var1) {
      return this.aClass432Array10976[-1177939923 * this.anInt10975].method5067(this.aFloat10978);
   }

   public Class446 method8075(int var1) {
      return this.method8073(2075799894);
   }

   abstract void method10283(RSByteBuffer var1, int var2, byte var3);

   public void method8086(RSByteBuffer var1, int var2) {
      this.aFloat10978 = 0.0F;
      this.aFloat10977 = 0.0F;
      this.anInt10975 = 0;
      int var3 = var1.readUnsignedByte(-1668304325);
      this.aClass432Array10976 = new Class432[var3];
      this.aFloatArray10974 = new float[var3];

      for(int var4 = 0; var4 < var3; ++var4) {
         this.aClass432Array10976[var4] = new Class432(var1);
         this.aFloatArray10974[var4] = var1.method9634((byte)1);
      }

      this.method10283(var1, var3, (byte)-44);
   }

   public void method8083(Class309 var1, Class445 var2, int var3, int var4, float var5, int var6) {
      double[] var7 = this.aClass292_8691.method3915(-61474122);
      var7[0] -= (double)var3;
      var7[2] -= (double)var4;
      double[] var8 = this.method10282(1172231479);
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

   abstract float method10284(float var1, float var2, float var3);

   abstract float method10285(float var1, float var2, float var3);

   abstract void method10286();

   abstract void method10287();

   double[] method10288() {
      return this.aClass432Array10976[-1177939923 * this.anInt10975].method5067(this.aFloat10978);
   }

   abstract void method10289(RSByteBuffer var1, int var2);

   public void method8076(float var1) {
      Class432 var2 = this.aClass432Array10976[this.anInt10975 * -1177939923];
      if(this.aFloatArray10974[this.anInt10975 * -1177939923] > 0.0F) {
         if(this.aFloatArray10974[-1177939923 * this.anInt10975] >= var1) {
            this.aFloatArray10974[-1177939923 * this.anInt10975] -= var1;
            return;
         }

         var1 -= this.aFloatArray10974[this.anInt10975 * -1177939923];
         this.aFloatArray10974[this.anInt10975 * -1177939923] = 0.0F;
      }

      float var3 = 1.0F / (float)Class636.method7565(1979181396);

      while(var1 > 0.0F) {
         float var4 = var2.method5066();
         if(this.aFloat10978 >= var4) {
            if(this.aClass432Array10976.length == 1 + this.anInt10975 * -1177939923) {
               return;
            }

            if(this.aFloatArray10974[1 + -1177939923 * this.anInt10975] >= var1) {
               this.aFloatArray10974[-1177939923 * this.anInt10975 + 1] -= var1;
               return;
            }

            this.anInt10975 += 1991950245;
            var1 -= this.aFloatArray10974[-1177939923 * this.anInt10975];
            this.aFloatArray10974[-1177939923 * this.anInt10975] = 0.0F;
            this.method10281((byte)89);
            this.aFloat10978 = 0.0F;
            this.aFloat10977 = 0.0F;
            var2 = this.aClass432Array10976[this.anInt10975 * -1177939923];
            var4 = var2.method5066();
         }

         while(var1 > 0.0F && this.aFloat10978 < var4) {
            this.aFloat10977 = this.method10280(var4, this.aFloat10977, Math.min(var1, var3), 16711935);
            var1 -= var3;
            this.method10279(this.aFloat10977, var4, -1156899078);
         }
      }

   }

   public Class446 method8082() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10976[-1177939923 * this.anInt10975].method5067(this.aFloat10978);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public boolean method8078() {
      return null != this.aClass432Array10976;
   }

   public void method8071(float var1, byte var2) {
      Class432 var3 = this.aClass432Array10976[this.anInt10975 * -1177939923];
      if(this.aFloatArray10974[this.anInt10975 * -1177939923] > 0.0F) {
         if(this.aFloatArray10974[-1177939923 * this.anInt10975] >= var1) {
            this.aFloatArray10974[-1177939923 * this.anInt10975] -= var1;
            return;
         }

         var1 -= this.aFloatArray10974[this.anInt10975 * -1177939923];
         this.aFloatArray10974[this.anInt10975 * -1177939923] = 0.0F;
      }

      float var4 = 1.0F / (float)Class636.method7565(1206695406);

      while(var1 > 0.0F) {
         float var5 = var3.method5066();
         if(this.aFloat10978 >= var5) {
            if(this.aClass432Array10976.length == 1 + this.anInt10975 * -1177939923) {
               return;
            }

            if(this.aFloatArray10974[1 + -1177939923 * this.anInt10975] >= var1) {
               this.aFloatArray10974[-1177939923 * this.anInt10975 + 1] -= var1;
               return;
            }

            this.anInt10975 += 1991950245;
            var1 -= this.aFloatArray10974[-1177939923 * this.anInt10975];
            this.aFloatArray10974[-1177939923 * this.anInt10975] = 0.0F;
            this.method10281((byte)88);
            this.aFloat10978 = 0.0F;
            this.aFloat10977 = 0.0F;
            var3 = this.aClass432Array10976[this.anInt10975 * -1177939923];
            var5 = var3.method5066();
         }

         while(var1 > 0.0F && this.aFloat10978 < var5) {
            this.aFloat10977 = this.method10280(var5, this.aFloat10977, Math.min(var1, var4), 16711935);
            var1 -= var4;
            this.method10279(this.aFloat10977, var5, -1156899078);
         }
      }

   }

   public void method8080(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      double[] var6 = this.aClass292_8691.method3915(-61474122);
      var6[0] -= (double)var3;
      var6[2] -= (double)var4;
      double[] var7 = this.method10282(1790578010);
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

   public boolean method8079() {
      return null != this.aClass432Array10976;
   }

   public void method8072(Class309 var1, Class445 var2, int var3, int var4, float var5) {
      double[] var6 = this.aClass292_8691.method3915(-61474122);
      var6[0] -= (double)var3;
      var6[2] -= (double)var4;
      double[] var7 = this.method10282(2133617106);
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

   public Class446 method8077() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10976[-1177939923 * this.anInt10975].method5067(this.aFloat10978);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public Class446 method8084() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10976[-1177939923 * this.anInt10975].method5067(this.aFloat10978);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public void method8074(RSByteBuffer var1) {
      this.aFloat10978 = 0.0F;
      this.aFloat10977 = 0.0F;
      this.anInt10975 = 0;
      int var2 = var1.readUnsignedByte(-1929479471);
      this.aClass432Array10976 = new Class432[var2];
      this.aFloatArray10974 = new float[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aClass432Array10976[var3] = new Class432(var1);
         this.aFloatArray10974[var3] = var1.method9634((byte)1);
      }

      this.method10283(var1, var2, (byte)51);
   }

   public void method8085(RSByteBuffer var1) {
      this.aFloat10978 = 0.0F;
      this.aFloat10977 = 0.0F;
      this.anInt10975 = 0;
      int var2 = var1.readUnsignedByte(-464431065);
      this.aClass432Array10976 = new Class432[var2];
      this.aFloatArray10974 = new float[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aClass432Array10976[var3] = new Class432(var1);
         this.aFloatArray10974[var3] = var1.method9634((byte)1);
      }

      this.method10283(var1, var2, (byte)24);
   }

   double[] method10290() {
      return this.aClass432Array10976[-1177939923 * this.anInt10975].method5067(this.aFloat10978);
   }

   public Class446 method8088() {
      return this.method8073(994245901);
   }

   abstract void method10291();

   public void method10292(Class432 var1, int var2, float var3, int var4) {
      if(null == this.aClass432Array10976) {
         this.aClass432Array10976 = new Class432[]{var1};
         this.aFloatArray10974 = new float[]{var3};
         this.anIntArray10973 = new int[]{var2};
      } else {
         Class432[] var5 = new Class432[this.aClass432Array10976.length + 1];
         float[] var6 = new float[this.aClass432Array10976.length + 1];
         int[] var7 = new int[1 + this.aClass432Array10976.length];
         System.arraycopy(this.aClass432Array10976, 0, var5, 0, this.aClass432Array10976.length);
         System.arraycopy(this.aFloatArray10974, 0, var6, 0, this.aClass432Array10976.length);
         System.arraycopy(this.anIntArray10973, 0, var7, 0, this.aClass432Array10976.length);
         this.aClass432Array10976 = var5;
         this.aFloatArray10974 = var6;
         this.anIntArray10973 = var7;
         this.aClass432Array10976[this.aClass432Array10976.length - 1] = var1;
         this.aFloatArray10974[this.aFloatArray10974.length - 1] = var3;
         this.anIntArray10973[this.anIntArray10973.length - 1] = var2;
      }

   }

   void method10293(float var1, float var2) {
      this.aFloat10978 += var1;
      if(this.aFloat10978 > var2) {
         this.aFloat10978 = var2;
      }

   }

   public Class446 method8087() {
      return this.method8073(1971290616);
   }

   void method10294(float var1, float var2) {
      this.aFloat10978 += var1;
      if(this.aFloat10978 > var2) {
         this.aFloat10978 = var2;
      }

   }
}
