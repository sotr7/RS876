package com.jagex;

import com.jagex.Class10;
import com.jagex.Class103;
import com.jagex.Class113;
import com.jagex.Class174_Sub1;
import com.jagex.Class199_Sub1;
import com.jagex.Class199_Sub2;
import com.jagex.Class201;
import com.jagex.Class219;
import com.jagex.Class227;
import com.jagex.Class264;
import com.jagex.Class265;
import com.jagex.Class292;
import com.jagex.Class294;
import com.jagex.Class304_Sub1;
import com.jagex.Class309;
import com.jagex.Class32;
import com.jagex.Class323;
import com.jagex.Class329;
import com.jagex.Class388;
import com.jagex.Class40_Sub1;
import com.jagex.Class446;
import com.jagex.Class448_Sub1;
import com.jagex.Class470;
import com.jagex.Class471;
import com.jagex.Class476;
import com.jagex.Class5;
import com.jagex.Class506;
import com.jagex.Class52;
import com.jagex.Class526_Sub32;
import com.jagex.Class526_Sub33;
import com.jagex.RSByteBuffer;
import com.jagex.Class599;
import com.jagex.Class623;
import com.jagex.Class627;
import com.jagex.Class680;
import com.jagex.Class689;
import com.jagex.Class697;
import com.jagex.Class709;
import com.jagex.Class76;
import com.jagex.client;

public class Class329_Sub1 extends Class329 {
   int anInt9984;
   boolean aBool9986 = false;
   Class446 aClass446_9987 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_9985 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_9983 = new Class446();

   public void method9040(Class526_Sub32 var1, int var2) {
      this.aClass446_9985.aFloat4917 = (float)(-1228547407 * var1.anInt10599);
      this.aClass446_9985.aFloat4915 = (float)(var1.anInt10597 * -1299508185);
      this.aClass446_9985.aFloat4919 = (float)(var1.anInt10600 * 524465495);
      if(Float.isNaN(this.aClass446_9987.aFloat4917)) {
         this.aClass446_9987.method5267(this.aClass446_9985);
         this.aClass446_9983.method5268();
      }

      this.anInt9984 = var1.anInt10598 * 480533175;
   }

   public void method4202(float var1, int[][][] var2, Class470 var3, int var4, int var5, int var6) {
      if(this.aBool9986) {
         this.method9041(var2, var3, var4, var5, -2060681709);
      }

      this.aClass292_3492.method3889(true, var1, this.aClass446_9987, this.aClass292_3492.method3942(358043437), this.aClass446_9985, this.aClass446_9983, 87576615);
   }

   public boolean method4222(int var1) {
      return !Float.isNaN(this.aClass446_9987.aFloat4917);
   }

   public double[] method4223() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(178031420);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public double[] method4205(byte var1) {
      double[] var2 = new double[3];
      Class446 var3 = this.method4204(256197135);
      var2[0] = (double)var3.aFloat4917;
      var2[1] = (double)var3.aFloat4915;
      var2[2] = (double)var3.aFloat4919;
      return var2;
   }

   public Class526_Sub32 method4211(int var1) {
      return new Class526_Sub32(1141650417 * this.anInt9984, (int)this.aClass446_9987.aFloat4917, (int)this.aClass446_9987.aFloat4915, (int)this.aClass446_9987.aFloat4919);
   }

   public float method4207(byte var1) {
      return 0.0F;
   }

   public void method4225(Class309 var1, int var2, int var3, int var4) {
      var1.anInt3375 = 2065471967 * ((int)this.aClass446_9987.aFloat4917 - var2);
      var1.anInt3374 = (int)(-this.aClass446_9987.aFloat4915) * 1296896295;
      var1.anInt3376 = 1395449909 * ((int)this.aClass446_9987.aFloat4919 - var3);
   }

   public void method4209(RSByteBuffer var1, int var2) {
      this.aClass446_9985.method5306(var1);
   }

   public float method4203() {
      return 0.0F;
   }

   void method9041(int[][][] var1, Class470 var2, int var3, int var4, int var5) {
      if(this.method4222(-1019868617) && (this.aClass292_3492.method3913(-600634777) || this.aClass292_3492.method3925(-248605208)) && this.aClass292_3492.method3925(-248605208) && null != var1) {
         int var6 = (int)this.aClass446_9985.aFloat4917 - var3 >> 9;
         int var7 = (int)this.aClass446_9985.aFloat4919 - var4 >> 9;
         if(var6 >= 0 && var7 >= 0 && var6 + 1 < var1[0].length && var7 + 1 < var1[0][0].length) {
            int var8 = 1141650417 * this.anInt9984;
            if(var2.method5614(var6, var7, -108905702)) {
               var8 = 1 + this.anInt9984 * 1141650417;
            }

            long var9 = (long)this.aClass446_9985.aFloat4917 % 512L;
            long var11 = (long)this.aClass446_9985.aFloat4919 % 512L;
            long var13 = (512L - var11) * (long)var1[var8][var6][var7] * (512L - var9);
            var13 += (512L - var11) * var9 * (long)var1[var8][1 + var6][var7];
            var13 += var11 * (long)var1[var8][var6][var7 + 1] * (512L - var9);
            var13 += var11 * (long)var1[var8][var6 + 1][var7 + 1] * var9;
            var13 /= 262144L;
            var13 -= 512L;
            float var15 = (float)(-var13) - this.aClass446_9985.aFloat4915;
            if(var15 > 0.0F) {
               this.aClass446_9985.aFloat4915 = (float)(-var13);
            }
         }
      }

   }

   public void method4210(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      if(this.aBool9986) {
         this.method9041(var2, var3, var4, var5, -940501072);
      }

      this.aClass292_3492.method3889(true, var1, this.aClass446_9987, this.aClass292_3492.method3942(562854199), this.aClass446_9985, this.aClass446_9983, 1217295596);
   }

   public void method4206(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      if(this.aBool9986) {
         this.method9041(var2, var3, var4, var5, -807866057);
      }

      this.aClass292_3492.method3889(true, var1, this.aClass446_9987, this.aClass292_3492.method3942(-1975034920), this.aClass446_9985, this.aClass446_9983, 278701534);
   }

   public Class446 method4215() {
      return Class446.method5305(this.aClass446_9987);
   }

   public void method9042(boolean var1, short var2) {
      this.aBool9986 = var1;
   }

   public Class446 method4214() {
      return Class446.method5305(this.aClass446_9987);
   }

   public Class446 method4204(int var1) {
      return Class446.method5305(this.aClass446_9987);
   }

   public double[] method4221() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(1479854809);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public Class329_Sub1(Class292 var1) {
      super(var1);
   }

   public double[] method4219() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(1805831992);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public boolean method4213() {
      return !Float.isNaN(this.aClass446_9987.aFloat4917);
   }

   public Class526_Sub32 method4216() {
      return new Class526_Sub32(1141650417 * this.anInt9984, (int)this.aClass446_9987.aFloat4917, (int)this.aClass446_9987.aFloat4915, (int)this.aClass446_9987.aFloat4919);
   }

   public float method4208() {
      return 0.0F;
   }

   public void method4227(Class309 var1, int var2, int var3) {
      var1.anInt3375 = 2065471967 * ((int)this.aClass446_9987.aFloat4917 - var2);
      var1.anInt3374 = (int)(-this.aClass446_9987.aFloat4915) * 1296896295;
      var1.anInt3376 = 1395449909 * ((int)this.aClass446_9987.aFloat4919 - var3);
   }

   public double[] method4217() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(143432829);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public float method4220() {
      return 0.0F;
   }

   public float method4226() {
      return 0.0F;
   }

   public double[] method4218() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(-715450419);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public void method4212(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      if(this.aBool9986) {
         this.method9041(var2, var3, var4, var5, -1896406224);
      }

      this.aClass292_3492.method3889(true, var1, this.aClass446_9987, this.aClass292_3492.method3942(1725987678), this.aClass446_9985, this.aClass446_9983, 345191479);
   }

   public float method4224() {
      return 0.0F;
   }

   public void method4228(RSByteBuffer var1) {
      this.aClass446_9985.method5306(var1);
   }

   static final void method9043(int var0) {
      Class323.aClass40_Sub10_3461.method862(2064077706);
      Class709.aClass40_Sub18_8849.method862(1476924304);
      Class264.aClass40_Sub9_2970.method862(1687028991);
      client.aClass505_11204.method6066(-631188979).method862(1921328142);
      Class76.loader.method862(1573437663);
      Class448_Sub1.aClass40_Sub1_10233.method862(1615449814);
      Class388.aClass40_Sub15_4063.method862(1763527856);
      Class689.aClass40_Sub12_8692.method862(1822751574);
      Class5.aClass40_Sub2_28.method862(1292103651);
      Class506.aClass97_Sub1_Sub1_5698.method10387(969480616);
      Class201.aClass97_Sub1_Sub2_2210.method10410((byte)127);
      Class52.aClass97_Sub1_Sub2_665.method10410((byte)127);
      Class265.aClass97_Sub1_Sub2_2974.method10410((byte)127);
      Class103.aClass97_Sub1_Sub2_1277.method10410((byte)127);
      Class476.aClass97_Sub1_Sub2_5386.method10410((byte)127);
      Class227.aClass40_Sub16_2327.method862(2014828441);
      Class32.aClass40_Sub3_361.method862(1122974451);
      Class113.aClass40_Sub6_1371.method862(1317657131);
      Class10.aClass40_Sub20_62.method862(1355860717);
      Class294.aClass40_Sub13_3189.method862(1020028504);
      Class199_Sub1.aClass40_Sub4_9867.method862(2147294347);
      Class40_Sub1.aClass40_Sub21_10958.method862(1991077185);
      Class174_Sub1.aClass40_Sub7_9280.method862(2034653998);
      Class526_Sub33.aClass40_Sub14_10659.method862(1216840006);
      Class199_Sub2.aClass40_Sub19_9875.method862(1929498085);
      Class623.method7409((byte)104);
      Class697.method8157(-527786269);
      Class627.aClass418_8195.method4954(-1848831584);
      Class599.method7079(1554744026);
      Class471.method5633(1763894067);
      client.aClass192_11286.method2772(1615066238);
      client.aClass192_11044.method2772(762523255);
      Class680.aClass192_8608.method2772(-96081622);
      client.aClass192_11299.method2772(-104701681);
      Class219.aClass40_2294.method862(1352744132);
      Class304_Sub1.aClass40_10066.method862(1771514285);
      client.aClass192_11009.method2772(-694229755);
   }

   public static boolean method9044(char var0, int var1) {
      return var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }
}
