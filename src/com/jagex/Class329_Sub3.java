package com.jagex;

import com.jagex.InterfaceDef;
import com.jagex.Class292;
import com.jagex.Class309;
import com.jagex.Class329;
import com.jagex.Class432;
import com.jagex.Class446;
import com.jagex.Class470;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class636;
import com.jagex.Class679;
import com.jagex.Class681;

public abstract class Class329_Sub3 extends Class329 {
   Class432[] aClass432Array10168;
   float[] aFloatArray10170;
   int[] anIntArray10166;
   int anInt10167 = 0;
   float aFloat10165 = 0.0F;
   float aFloat10169 = 0.0F;

   public double[] method4218() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
   }

   public void method9159(Class432 var1, int var2, float var3, int var4) {
      if(null == this.aClass432Array10168) {
         this.aClass432Array10168 = new Class432[]{var1};
         this.aFloatArray10170 = new float[]{var3};
         this.anIntArray10166 = new int[]{var2};
      } else {
         Class432[] var5 = new Class432[this.aClass432Array10168.length + 1];
         float[] var6 = new float[1 + this.aClass432Array10168.length];
         int[] var7 = new int[this.aClass432Array10168.length + 1];
         System.arraycopy(this.aClass432Array10168, 0, var5, 0, this.aClass432Array10168.length);
         System.arraycopy(this.aFloatArray10170, 0, var6, 0, this.aClass432Array10168.length);
         System.arraycopy(this.anIntArray10166, 0, var7, 0, this.aClass432Array10168.length);
         this.aClass432Array10168 = var5;
         this.aFloatArray10170 = var6;
         this.anIntArray10166 = var7;
         this.aClass432Array10168[this.aClass432Array10168.length - 1] = var1;
         this.aFloatArray10170[this.aFloatArray10170.length - 1] = var3;
         this.anIntArray10166[this.anIntArray10166.length - 1] = var2;
      }

   }

   public void method4202(float var1, int[][][] var2, Class470 var3, int var4, int var5, int var6) {
      Class432 var7 = this.aClass432Array10168[this.anInt10167 * -1949730181];
      if(this.aFloatArray10170[this.anInt10167 * -1949730181] > 0.0F) {
         if(this.aFloatArray10170[this.anInt10167 * -1949730181] >= var1) {
            this.aFloatArray10170[-1949730181 * this.anInt10167] -= var1;
            return;
         }

         var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
         this.aFloatArray10170[-1949730181 * this.anInt10167] = 0.0F;
      }

      float var8 = 1.0F / (float)Class636.method7565(1044493008);

      while(var1 > 0.0F) {
         float var9 = var7.method5066();
         if(this.aFloat10165 >= var9) {
            if(-1949730181 * this.anInt10167 + 1 == this.aClass432Array10168.length) {
               return;
            }

            if(this.aFloatArray10170[1 + this.anInt10167 * -1949730181] >= var1) {
               this.aFloatArray10170[this.anInt10167 * -1949730181 + 1] -= var1;
               return;
            }

            this.anInt10167 += -232958797;
            var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
            this.aFloatArray10170[this.anInt10167 * -1949730181] = 0.0F;
            this.method9161(-302947303);
            this.aFloat10165 = 0.0F;
            this.aFloat10169 = 0.0F;
            var7 = this.aClass432Array10168[-1949730181 * this.anInt10167];
            var9 = var7.method5066();
         }

         while(var1 > 0.0F && this.aFloat10165 < var9) {
            this.aFloat10169 = this.method9160(var9, this.aFloat10169, Math.min(var1, var8), -2119001927);
            var1 -= var8;
            this.method9168(this.aFloat10169, var9, -1760586438);
         }
      }

   }

   Class329_Sub3(Class292 var1) {
      super(var1);
   }

   abstract float method9160(float var1, float var2, float var3, int var4);

   abstract void method9161(int var1);

   public float method4220() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5070(this.aFloat10165);
   }

   public Class446 method4204(int var1) {
      Class446 var2 = Class446.method5312();
      double[] var3 = this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
      var2.aFloat4917 = (float)var3[0];
      var2.aFloat4915 = (float)var3[1];
      var2.aFloat4919 = (float)var3[2];
      return var2;
   }

   public boolean method4213() {
      return this.aClass432Array10168 != null;
   }

   public Class526_Sub32 method4211(int var1) {
      Class446 var2 = this.method4204(-1193700034);
      return new Class526_Sub32(0, (int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919);
   }

   public float method9162(byte var1) {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5068(this.aFloat10165);
   }

   public float method4207(byte var1) {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5070(this.aFloat10165);
   }

   public void method4227(Class309 var1, int var2, int var3) {
      Class446 var4 = this.method4204(1750082398);
      var1.anInt3375 = ((int)var4.aFloat4917 - var2) * 2065471967;
      var1.anInt3374 = 1296896295 * (int)(-var4.aFloat4915);
      var1.anInt3376 = 1395449909 * ((int)var4.aFloat4919 - var3);
   }

   public void method4209(RSByteBuffer var1, int var2) {
      this.aFloat10165 = 0.0F;
      this.aFloat10169 = 0.0F;
      this.anInt10167 = 0;
      int var3 = var1.readUnsignedByte(400261048);
      this.aClass432Array10168 = new Class432[var3];
      this.aFloatArray10170 = new float[var3];

      for(int var4 = 0; var4 < var3; ++var4) {
         this.aClass432Array10168[var4] = new Class432(var1);
         this.aFloatArray10170[var4] = var1.method9634((byte)1);
      }

      this.method9167(var1, var3, (byte)-70);
   }

   public Class446 method4215() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   abstract float method9163(float var1, float var2, float var3);

   abstract void method9164();

   abstract void method9165(RSByteBuffer var1, int var2);

   public float method4226() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5070(this.aFloat10165);
   }

   public void method4210(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      Class432 var6 = this.aClass432Array10168[this.anInt10167 * -1949730181];
      if(this.aFloatArray10170[this.anInt10167 * -1949730181] > 0.0F) {
         if(this.aFloatArray10170[this.anInt10167 * -1949730181] >= var1) {
            this.aFloatArray10170[-1949730181 * this.anInt10167] -= var1;
            return;
         }

         var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
         this.aFloatArray10170[-1949730181 * this.anInt10167] = 0.0F;
      }

      float var7 = 1.0F / (float)Class636.method7565(666086146);

      while(var1 > 0.0F) {
         float var8 = var6.method5066();
         if(this.aFloat10165 >= var8) {
            if(-1949730181 * this.anInt10167 + 1 == this.aClass432Array10168.length) {
               return;
            }

            if(this.aFloatArray10170[1 + this.anInt10167 * -1949730181] >= var1) {
               this.aFloatArray10170[this.anInt10167 * -1949730181 + 1] -= var1;
               return;
            }

            this.anInt10167 += -232958797;
            var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
            this.aFloatArray10170[this.anInt10167 * -1949730181] = 0.0F;
            this.method9161(-289768544);
            this.aFloat10165 = 0.0F;
            this.aFloat10169 = 0.0F;
            var6 = this.aClass432Array10168[-1949730181 * this.anInt10167];
            var8 = var6.method5066();
         }

         while(var1 > 0.0F && this.aFloat10165 < var8) {
            this.aFloat10169 = this.method9160(var8, this.aFloat10169, Math.min(var1, var7), -2139559258);
            var1 -= var7;
            this.method9168(this.aFloat10169, var8, -1706739288);
         }
      }

   }

   abstract void method9166(RSByteBuffer var1, int var2);

   public void method4212(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      Class432 var6 = this.aClass432Array10168[this.anInt10167 * -1949730181];
      if(this.aFloatArray10170[this.anInt10167 * -1949730181] > 0.0F) {
         if(this.aFloatArray10170[this.anInt10167 * -1949730181] >= var1) {
            this.aFloatArray10170[-1949730181 * this.anInt10167] -= var1;
            return;
         }

         var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
         this.aFloatArray10170[-1949730181 * this.anInt10167] = 0.0F;
      }

      float var7 = 1.0F / (float)Class636.method7565(356091637);

      while(var1 > 0.0F) {
         float var8 = var6.method5066();
         if(this.aFloat10165 >= var8) {
            if(-1949730181 * this.anInt10167 + 1 == this.aClass432Array10168.length) {
               return;
            }

            if(this.aFloatArray10170[1 + this.anInt10167 * -1949730181] >= var1) {
               this.aFloatArray10170[this.anInt10167 * -1949730181 + 1] -= var1;
               return;
            }

            this.anInt10167 += -232958797;
            var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
            this.aFloatArray10170[this.anInt10167 * -1949730181] = 0.0F;
            this.method9161(-1999880525);
            this.aFloat10165 = 0.0F;
            this.aFloat10169 = 0.0F;
            var6 = this.aClass432Array10168[-1949730181 * this.anInt10167];
            var8 = var6.method5066();
         }

         while(var1 > 0.0F && this.aFloat10165 < var8) {
            this.aFloat10169 = this.method9160(var8, this.aFloat10169, Math.min(var1, var7), -2147044689);
            var1 -= var7;
            this.method9168(this.aFloat10169, var8, -2058913905);
         }
      }

   }

   abstract void method9167(RSByteBuffer var1, int var2, byte var3);

   public Class446 method4214() {
      Class446 var1 = Class446.method5312();
      double[] var2 = this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
      var1.aFloat4917 = (float)var2[0];
      var1.aFloat4915 = (float)var2[1];
      var1.aFloat4919 = (float)var2[2];
      return var1;
   }

   public double[] method4221() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
   }

   public double[] method4217() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
   }

   public void method4206(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      Class432 var6 = this.aClass432Array10168[this.anInt10167 * -1949730181];
      if(this.aFloatArray10170[this.anInt10167 * -1949730181] > 0.0F) {
         if(this.aFloatArray10170[this.anInt10167 * -1949730181] >= var1) {
            this.aFloatArray10170[-1949730181 * this.anInt10167] -= var1;
            return;
         }

         var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
         this.aFloatArray10170[-1949730181 * this.anInt10167] = 0.0F;
      }

      float var7 = 1.0F / (float)Class636.method7565(366664864);

      while(var1 > 0.0F) {
         float var8 = var6.method5066();
         if(this.aFloat10165 >= var8) {
            if(-1949730181 * this.anInt10167 + 1 == this.aClass432Array10168.length) {
               return;
            }

            if(this.aFloatArray10170[1 + this.anInt10167 * -1949730181] >= var1) {
               this.aFloatArray10170[this.anInt10167 * -1949730181 + 1] -= var1;
               return;
            }

            this.anInt10167 += -232958797;
            var1 -= this.aFloatArray10170[-1949730181 * this.anInt10167];
            this.aFloatArray10170[this.anInt10167 * -1949730181] = 0.0F;
            this.method9161(-433732472);
            this.aFloat10165 = 0.0F;
            this.aFloat10169 = 0.0F;
            var6 = this.aClass432Array10168[-1949730181 * this.anInt10167];
            var8 = var6.method5066();
         }

         while(var1 > 0.0F && this.aFloat10165 < var8) {
            this.aFloat10169 = this.method9160(var8, this.aFloat10169, Math.min(var1, var7), -2125374725);
            var1 -= var7;
            this.method9168(this.aFloat10169, var8, 1941107246);
         }
      }

   }

   public double[] method4219() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
   }

   public double[] method4223() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
   }

   public Class526_Sub32 method4216() {
      Class446 var1 = this.method4204(1577619802);
      return new Class526_Sub32(0, (int)var1.aFloat4917, (int)var1.aFloat4915, (int)var1.aFloat4919);
   }

   public float method4208() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5070(this.aFloat10165);
   }

   public double[] method4205(byte var1) {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5067(this.aFloat10165);
   }

   void method9168(float var1, float var2, int var3) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > var2) {
         this.aFloat10165 = var2;
      }

   }

   public float method4224() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5070(this.aFloat10165);
   }

   public float method9169() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5068(this.aFloat10165);
   }

   void method9170(float var1, float var2) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > var2) {
         this.aFloat10165 = var2;
      }

   }

   public void method4228(RSByteBuffer var1) {
      this.aFloat10165 = 0.0F;
      this.aFloat10169 = 0.0F;
      this.anInt10167 = 0;
      int var2 = var1.readUnsignedByte(-416851693);
      this.aClass432Array10168 = new Class432[var2];
      this.aFloatArray10170 = new float[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aClass432Array10168[var3] = new Class432(var1);
         this.aFloatArray10170[var3] = var1.method9634((byte)1);
      }

      this.method9167(var1, var2, (byte)-117);
   }

   void method9171(float var1, float var2) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > var2) {
         this.aFloat10165 = var2;
      }

   }

   void method9172(float var1, float var2) {
      this.aFloat10165 += var1;
      if(this.aFloat10165 > var2) {
         this.aFloat10165 = var2;
      }

   }

   public void method4225(Class309 var1, int var2, int var3, int var4) {
      Class446 var5 = this.method4204(161274836);
      var1.anInt3375 = ((int)var5.aFloat4917 - var2) * 2065471967;
      var1.anInt3374 = 1296896295 * (int)(-var5.aFloat4915);
      var1.anInt3376 = 1395449909 * ((int)var5.aFloat4919 - var3);
   }

   public boolean method4222(int var1) {
      return this.aClass432Array10168 != null;
   }

   public float method4203() {
      return this.aClass432Array10168[-1949730181 * this.anInt10167].method5070(this.aFloat10165);
   }

   static final void method9173(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      if(null == var3.aString2593) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString2593;
      }

   }
}
