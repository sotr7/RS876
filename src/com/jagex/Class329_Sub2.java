package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class292;
import com.jagex.Class295;
import com.jagex.Class309;
import com.jagex.Class329;
import com.jagex.Class330;
import com.jagex.Class375;
import com.jagex.Class397;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class470;
import com.jagex.Class508;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class546;
import com.jagex.Class552;
import com.jagex.Class636;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Class642;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface30;
import com.jagex.Interface59;

public class Class329_Sub2 extends Class329 {
   Interface30 anInterface30_10107;
   boolean aBool10098;
   int anInt10102 = -630937880;
   int anInt10103;
   Class446 aClass446_10099 = new Class446();
   public Class440 aClass440_10100 = new Class440();
   Class446 aClass446_10104 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_10105 = new Class446(Float.NaN, Float.NaN, Float.NaN);
   Class446 aClass446_10106 = new Class446();
   Class440 aClass440_10101 = new Class440();

   public float method9104(int var1) {
      return Class636.method7560(this.aClass440_10100, -1623958240);
   }

   public void method9105(Interface30 var1, Class446 var2, Class440 var3, boolean var4, int var5, int[][][] var6, Class470 var7, int var8, int var9, byte var10) {
      this.anInterface30_10107 = var1;
      this.aClass446_10099.method5267(var2);
      this.aClass440_10100.method5166(var3);
      this.aBool10098 = var4;
      this.anInt10102 = -969522331 * var5;
      this.anInt10103 = this.anInterface30_10107.method186(976428997).anInt10598 * -91626993;
      this.method9106(var6, var7, var8, var9, 1170842446);
   }

   public void method4202(float var1, int[][][] var2, Class470 var3, int var4, int var5, int var6) {
      if(null != this.anInterface30_10107) {
         this.method9106(var2, var3, var4, var5, 534051052);
         Class440 var7 = this.method9115(412349896);
         this.aClass440_10101.method5178(var7, this.aClass292_3492.method3921(1322011208));
         if(Float.isNaN(this.aClass440_10101.aFloat4871)) {
            this.aClass440_10101.method5166(var7);
         }

         var7.method5163();
         this.aClass446_10105.method5267(this.anInterface30_10107.method186(976428997).method9588(1686210797));
         this.aClass292_3492.method3889(true, var1, this.aClass446_10104, this.aClass292_3492.method3942(135713462), this.aClass446_10105, this.aClass446_10106, 1891273582);
      }
   }

   void method9106(int[][][] var1, Class470 var2, int var3, int var4, int var5) {
      if(this.method4222(-929091229) && (this.aClass292_3492.method3913(445981322) || this.aClass292_3492.method3925(-248605208))) {
         Class526_Sub32 var6 = this.anInterface30_10107.method186(976428997);
         this.anInt10103 = -91626993 * var6.anInt10598;
         int var7 = this.anInt10103 * 1542212425;
         boolean var8 = true;
         if(1542212425 * this.anInt10103 == 3) {
            var8 = false;
         } else if(var2 != null && var2.method5614(-1228547407 * var6.anInt10599 - var3 >> 9, var6.anInt10600 * 524465495 - var4 >> 9, 1655123577)) {
            var7 = 1 + this.anInt10103 * 1542212425;
            var8 = false;
         }

         if(this.aClass292_3492.method3925(-248605208) && null != var1) {
            float var9 = this.method9113(var1, var2, var3, var4, var7, var8, 1194775567);
            if(Float.isNaN(var9)) {
               return;
            }

            if(var9 > 0.0F) {
               float var10 = 3.1415927F;
               Class446 var11 = Class446.method5309(0.0F, 0.0F, 1.0F);
               var11.method5286(this.aClass440_10100);
               Class446 var12 = Class446.method5309(var11.aFloat4917, 0.0F, var11.aFloat4919);
               var12.method5311();
               float var13 = Class446.method5262(var11, var12);

               for(int var14 = 0; var14 < 10; ++var14) {
                  float var15 = (var10 + var13) / 2.0F - var13;
                  float var16 = var15;
                  if(var9 > 0.0F) {
                     var16 = var15 * -1.0F;
                  }

                  Class446 var17 = Class446.method5309(1.0F, 0.0F, 0.0F);
                  var17.method5286(this.aClass440_10100);
                  Class440 var18 = Class440.method5192();
                  var18.method5188(var17, var16);
                  this.aClass440_10100.method5194(var18);
                  this.aClass440_10100.method5171();
                  var17.method5278();
                  var18.method5163();
                  var9 = this.method9113(var1, var2, var3, var4, var7, var8, -1701798715);
                  if(Float.isNaN(var9)) {
                     return;
                  }

                  if(var9 > 0.0F) {
                     var13 += var15;
                  } else {
                     var10 -= var15;
                  }
               }
            }
         }
      }

   }

   public Class526_Sub32 method4216() {
      Class446 var1 = this.method4204(752684186);
      Class526_Sub32 var2 = new Class526_Sub32(1542212425 * this.anInt10103, (int)var1.aFloat4917, (int)var1.aFloat4915, (int)var1.aFloat4919);
      var1.method5278();
      return var2;
   }

   public void method9107(int var1) {
      if(this.anInterface30_10107 != null) {
         this.anInterface30_10107 = this.aClass292_3492.method3912((byte)67).method225(this.anInterface30_10107.method197((byte)109), this.anInterface30_10107.method87(-481548530), (byte)88);
      }

   }

   public void method4206(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      if(null != this.anInterface30_10107) {
         this.method9106(var2, var3, var4, var5, 598096383);
         Class440 var6 = this.method9115(412349896);
         this.aClass440_10101.method5178(var6, this.aClass292_3492.method3921(-2079559368));
         if(Float.isNaN(this.aClass440_10101.aFloat4871)) {
            this.aClass440_10101.method5166(var6);
         }

         var6.method5163();
         this.aClass446_10105.method5267(this.anInterface30_10107.method186(976428997).method9588(2062305600));
         this.aClass292_3492.method3889(true, var1, this.aClass446_10104, this.aClass292_3492.method3942(-455374519), this.aClass446_10105, this.aClass446_10106, 2078073914);
      }
   }

   public Class446 method4204(int var1) {
      Class446 var2 = Class446.method5305(this.aClass446_10099);
      var2.method5286(this.aClass440_10101);
      Class446 var3 = Class446.method5273(this.aClass446_10104, var2);
      var2.method5278();
      return var3;
   }

   public double[] method4205(byte var1) {
      double[] var2 = new double[3];
      Class446 var3 = this.method4204(-1061421654);
      var2[0] = (double)var3.aFloat4917;
      var2[1] = (double)var3.aFloat4915;
      var2[2] = (double)var3.aFloat4919;
      return var2;
   }

   public Class526_Sub32 method4211(int var1) {
      Class446 var2 = this.method4204(-1424037188);
      Class526_Sub32 var3 = new Class526_Sub32(1542212425 * this.anInt10103, (int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919);
      var2.method5278();
      return var3;
   }

   public Class446 method9108(int var1) {
      return this.aClass446_10099;
   }

   Class440 method9109() {
      Class440 var1 = Class440.method5161(this.aClass440_10100);
      if(this.aBool10098) {
         Class446 var2 = this.anInterface30_10107.method188(259268480);
         if(var2.method5276() < (float)(this.anInt10102 * 102119021)) {
            var2 = Class446.method5309(0.0F, 0.0F, 1.0F);
            Class440 var3 = this.anInterface30_10107.method198(1055450630);
            var2.method5286(var3);
         }

         var2.aFloat4915 = 0.0F;
         float var5 = (float)Math.atan2((double)var2.aFloat4917, (double)var2.aFloat4919);
         var2.method5278();
         Class440 var4 = new Class440();
         var4.method5193(0.0F, 1.0F, 0.0F, var5);
         var1.method5194(var4);
      }

      return var1;
   }

   public float method9110(int var1) {
      return Class330.method4240(this.aClass440_10100, (byte)49);
   }

   public float method4207(byte var1) {
      return 0.0F;
   }

   public void method4225(Class309 var1, int var2, int var3, int var4) {
      Class446 var5 = this.method4204(1051382355);
      var1.anInt3375 = 2065471967 * ((int)var5.aFloat4917 - var2);
      var1.anInt3374 = 1296896295 * (int)(-var5.aFloat4915);
      var1.anInt3376 = ((int)var5.aFloat4919 - var3) * 1395449909;
      var5.method5278();
   }

   public void method4209(RSByteBuffer var1, int var2) {
      Class295 var3 = Class642.method7657(var1.readUnsignedByte(-992981239), (short)-9310);
      int var4 = var1.readUnsignedShort(21250458);
      this.aClass446_10099.method5306(var1);
      this.aClass440_10100.method5189(var1);
      if(var1.readUnsignedByte(-996098957) == 1) {
         this.aBool10098 = true;
      } else {
         this.aBool10098 = false;
      }

      this.anInt10102 = var1.readUnsignedShort(177653195) * -969522331;
      this.anInterface30_10107 = this.aClass292_3492.method3912((byte)121).method225(var3, var4, (byte)127);
   }

   public void method4210(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      if(null != this.anInterface30_10107) {
         this.method9106(var2, var3, var4, var5, 110476000);
         Class440 var6 = this.method9115(412349896);
         this.aClass440_10101.method5178(var6, this.aClass292_3492.method3921(577120374));
         if(Float.isNaN(this.aClass440_10101.aFloat4871)) {
            this.aClass440_10101.method5166(var6);
         }

         var6.method5163();
         this.aClass446_10105.method5267(this.anInterface30_10107.method186(976428997).method9588(1148680156));
         this.aClass292_3492.method3889(true, var1, this.aClass446_10104, this.aClass292_3492.method3942(1613255856), this.aClass446_10105, this.aClass446_10106, 2116010292);
      }
   }

   public boolean method4222(int var1) {
      return !Float.isNaN(this.aClass446_10104.aFloat4917);
   }

   public float method9111() {
      return Class636.method7560(this.aClass440_10100, -1944209647);
   }

   public boolean method4213() {
      return !Float.isNaN(this.aClass446_10104.aFloat4917);
   }

   public Class446 method4214() {
      Class446 var1 = Class446.method5305(this.aClass446_10099);
      var1.method5286(this.aClass440_10101);
      Class446 var2 = Class446.method5273(this.aClass446_10104, var1);
      var1.method5278();
      return var2;
   }

   public Class446 method4215() {
      Class446 var1 = Class446.method5305(this.aClass446_10099);
      var1.method5286(this.aClass440_10101);
      Class446 var2 = Class446.method5273(this.aClass446_10104, var1);
      var1.method5278();
      return var2;
   }

   public double[] method4221() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(-326685854);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public double[] method4217() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(-901480559);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public double[] method4218() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(-879145694);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public Class446 method9112(int var1) {
      return this.aClass446_10104;
   }

   public float method4208() {
      return 0.0F;
   }

   public void method4212(float var1, int[][][] var2, Class470 var3, int var4, int var5) {
      if(null != this.anInterface30_10107) {
         this.method9106(var2, var3, var4, var5, 822757064);
         Class440 var6 = this.method9115(412349896);
         this.aClass440_10101.method5178(var6, this.aClass292_3492.method3921(872568771));
         if(Float.isNaN(this.aClass440_10101.aFloat4871)) {
            this.aClass440_10101.method5166(var6);
         }

         var6.method5163();
         this.aClass446_10105.method5267(this.anInterface30_10107.method186(976428997).method9588(1051907065));
         this.aClass292_3492.method3889(true, var1, this.aClass446_10104, this.aClass292_3492.method3942(839241875), this.aClass446_10105, this.aClass446_10106, 2043134023);
      }
   }

   public double[] method4223() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(1024048038);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   public float method4220() {
      return 0.0F;
   }

   public void method4227(Class309 var1, int var2, int var3) {
      Class446 var4 = this.method4204(984164495);
      var1.anInt3375 = 2065471967 * ((int)var4.aFloat4917 - var2);
      var1.anInt3374 = 1296896295 * (int)(-var4.aFloat4915);
      var1.anInt3376 = ((int)var4.aFloat4919 - var3) * 1395449909;
      var4.method5278();
   }

   public void method4228(RSByteBuffer var1) {
      Class295 var2 = Class642.method7657(var1.readUnsignedByte(660310703), (short)15974);
      int var3 = var1.readUnsignedShort(552933748);
      this.aClass446_10099.method5306(var1);
      this.aClass440_10100.method5189(var1);
      if(var1.readUnsignedByte(-557684800) == 1) {
         this.aBool10098 = true;
      } else {
         this.aBool10098 = false;
      }

      this.anInt10102 = var1.readUnsignedShort(1804254980) * -969522331;
      this.anInterface30_10107 = this.aClass292_3492.method3912((byte)116).method225(var2, var3, (byte)62);
   }

   public float method4203() {
      return 0.0F;
   }

   public Class329_Sub2(Class292 var1) {
      super(var1);
   }

   float method9113(int[][][] var1, Class470 var2, int var3, int var4, int var5, boolean var6, int var7) {
      Class440 var8 = this.method9115(412349896);
      Class446 var9 = this.method9116(var8, -1266663919);
      var8.method5163();
      int var10 = (int)var9.aFloat4917 - var3 >> 9;
      int var11 = (int)var9.aFloat4919 - var4 >> 9;
      if(var10 >= 0 && var11 >= 0 && var10 + 1 < var1[0].length && 1 + var11 < var1[0][0].length) {
         int var12 = var5;
         if(var6 && var2.method5614(var10, var11, -916166862)) {
            var12 = 1 + var5;
         }

         long var13 = (long)var9.aFloat4917 % 512L;
         long var15 = (long)var9.aFloat4919 % 512L;
         long var17 = (512L - var15) * (long)var1[var12][var10][var11] * (512L - var13);
         var17 += var13 * (long)var1[var12][1 + var10][var11] * (512L - var15);
         var17 += (512L - var13) * (long)var1[var12][var10][1 + var11] * var15;
         var17 += var15 * var13 * (long)var1[var12][var10 + 1][var11 + 1];
         var17 /= 262144L;
         var17 -= 1024L;
         float var19 = (float)(-var17) - var9.aFloat4915;
         var9.method5278();
         return var19;
      } else {
         var9.method5278();
         return Float.NaN;
      }
   }

   Class440 method9114() {
      Class440 var1 = Class440.method5161(this.aClass440_10100);
      if(this.aBool10098) {
         Class446 var2 = this.anInterface30_10107.method188(259268480);
         if(var2.method5276() < (float)(this.anInt10102 * 102119021)) {
            var2 = Class446.method5309(0.0F, 0.0F, 1.0F);
            Class440 var3 = this.anInterface30_10107.method198(-1929350136);
            var2.method5286(var3);
         }

         var2.aFloat4915 = 0.0F;
         float var5 = (float)Math.atan2((double)var2.aFloat4917, (double)var2.aFloat4919);
         var2.method5278();
         Class440 var4 = new Class440();
         var4.method5193(0.0F, 1.0F, 0.0F, var5);
         var1.method5194(var4);
      }

      return var1;
   }

   public double[] method4219() {
      double[] var1 = new double[3];
      Class446 var2 = this.method4204(-1196462117);
      var1[0] = (double)var2.aFloat4917;
      var1[1] = (double)var2.aFloat4915;
      var1[2] = (double)var2.aFloat4919;
      return var1;
   }

   Class440 method9115(int var1) {
      Class440 var2 = Class440.method5161(this.aClass440_10100);
      if(this.aBool10098) {
         Class446 var3 = this.anInterface30_10107.method188(259268480);
         if(var3.method5276() < (float)(this.anInt10102 * 102119021)) {
            var3 = Class446.method5309(0.0F, 0.0F, 1.0F);
            Class440 var4 = this.anInterface30_10107.method198(1041112650);
            var3.method5286(var4);
         }

         var3.aFloat4915 = 0.0F;
         float var6 = (float)Math.atan2((double)var3.aFloat4917, (double)var3.aFloat4919);
         var3.method5278();
         Class440 var5 = new Class440();
         var5.method5193(0.0F, 1.0F, 0.0F, var6);
         var2.method5194(var5);
      }

      return var2;
   }

   public float method4224() {
      return 0.0F;
   }

   Class446 method9116(Class440 var1, int var2) {
      Class446 var3 = Class446.method5305(this.aClass446_10099);
      var3.method5286(var1);
      Class446 var4 = Class446.method5273(this.aClass446_10105, var3);
      var3.method5278();
      return var4;
   }

   public float method9117() {
      return Class636.method7560(this.aClass440_10100, -2057245716);
   }

   public float method4226() {
      return 0.0F;
   }

   static final void method9118(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class397.method4825(var3, var4, var0, (byte)15);
   }

   static void method9119(Class552[][][] var0, byte var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Class552[][] var3 = var0[var2];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            for(int var5 = 0; var5 < var3[var4].length; ++var5) {
               Class552 var6 = var3[var4][var5];
               if(var6 != null) {
                  if(var6.aClass639_Sub1_Sub3_7355 instanceof Interface59) {
                     ((Interface59)var6.aClass639_Sub1_Sub3_7355).method388(-1929726790);
                  }

                  if(var6.aClass639_Sub1_Sub5_7353 instanceof Interface59) {
                     ((Interface59)var6.aClass639_Sub1_Sub5_7353).method388(15983164);
                  }

                  if(var6.aClass639_Sub1_Sub5_7352 instanceof Interface59) {
                     ((Interface59)var6.aClass639_Sub1_Sub5_7352).method388(-1260336382);
                  }

                  if(var6.aClass639_Sub1_Sub1_7351 instanceof Interface59) {
                     ((Interface59)var6.aClass639_Sub1_Sub1_7351).method388(290407420);
                  }

                  if(var6.aClass639_Sub1_Sub1_7350 instanceof Interface59) {
                     ((Interface59)var6.aClass639_Sub1_Sub1_7350).method388(350142323);
                  }

                  for(Class546 var7 = var6.aClass546_7357; var7 != null; var7 = var7.aClass546_7268) {
                     Class639_Sub1_Sub2 var8 = var7.aClass639_Sub1_Sub2_7267;
                     if(var8 instanceof Interface59) {
                        ((Interface59)var8).method388(-1430011017);
                     }
                  }
               }
            }
         }
      }

   }

   static void method9120(Class681 var0, Class508 var1, Exception var2, String var3, int var4) {
      StringBuilder var5 = new StringBuilder(30);
      var5.append(var3 + " ").append(var0.aClass526_Sub21_Sub19_8629.aLong7156 * -6805155999452426801L).append(" ");

      for(int var6 = 1253690475 * var0.anInt8617 - 1; var6 >= 0; --var6) {
         var5.append("").append(-6805155999452426801L * var0.aClass659Array8639[var6].aClass526_Sub21_Sub19_8509.aLong7156).append(" ");
      }

      var5.append("").append(Integer.valueOf(-2087699325 * var1.anInt6975));
      Class375.method4671(var5.toString(), var2, (byte)122);
   }
}
