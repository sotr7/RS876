package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class195;
import com.jagex.Class264;
import com.jagex.Class266;
import com.jagex.Class274;
import com.jagex.Class276;
import com.jagex.Class278;
import com.jagex.Class281;
import com.jagex.Class433;
import com.jagex.Class438;
import com.jagex.Class444;
import com.jagex.Class446;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Class566;
import com.jagex.Class681;
import com.jagex.Exception_Sub5_Sub1;
import com.jagex.Exception_Sub5_Sub2;
import com.jagex.Interface29;
import com.jagex.Interface41;

public abstract class Class284 {
   protected int anInt3071 = -568998807;
   String aString3069;
   int anInt3065;
   Class278 aClass278_3067;
   int anInt3066;
   Class278 aClass278_3068;
   Class276[] aClass276Array3070;
   static Interface29 anInterface29_3072 = new Class264();

   public abstract void method3722();

   public abstract void method3723();

   public abstract boolean method3724();

   public String method3725(short var1) {
      return this.aString3069;
   }

   Class284(Class174_Sub3 var1, Class274 var2) {
      this.aString3069 = var2.aString3010;
      this.anInt3065 = var2.aClass281Array3012.length * -1647433039;
      this.aClass278_3067 = new Class278(this.anInt3065 * -1502618031, anInterface29_3072);

      int var3;
      for(var3 = 0; var3 < this.anInt3065 * -1502618031; ++var3) {
         this.aClass278_3067.method3679(var3, var2.aClass281Array3012[var3].aString3041, this.method3726(var2.aClass281Array3012[var3]), (byte)0);
      }

      this.anInt3066 = 1030103025 * var2.aClass281Array3013.length;
      this.aClass278_3068 = new Class278(277278993 * this.anInt3066, anInterface29_3072);

      for(var3 = 0; var3 < this.anInt3066 * 277278993; ++var3) {
         this.aClass278_3068.method3679(var3, var2.aClass281Array3013[var3].aString3041, this.method3726(var2.aClass281Array3013[var3]), (byte)0);
      }

      this.aClass276Array3070 = new Class276[var2.aClass266Array3014.length];

      for(var3 = 0; var3 < var2.aClass266Array3014.length; ++var3) {
         this.aClass276Array3070[var3] = this.method3764(var1, var2.aClass266Array3014[var3]);
      }

   }

   abstract Class526_Sub13_Sub1 method3726(Class281 var1);

   public final int method3727(int var1) {
      return this.aClass276Array3070.length;
   }

   public abstract boolean method3728();

   public abstract boolean method3729(Class276 var1);

   public final void method3730(Class526_Sub13_Sub1 var1, float[] var2, short var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3660(var1, var2, var2.length);
   }

   public final Class276 method3731(int var1) {
      return this.anInt3071 * 1682175015 >= 0?this.aClass276Array3070[this.anInt3071 * 1682175015]:null;
   }

   public final int method3732(int var1) {
      return 1682175015 * this.anInt3071;
   }

   public final void method3733(Class526_Sub13_Sub1 var1, Class444 var2, int var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3626(var1, var2.aFloat4897, var2.aFloat4898, var2.aFloat4899, var2.aFloat4900);
   }

   public final void method3734(int var1, Class446 var2, byte var3) {
      this.aClass276Array3070[1682175015 * this.anInt3071].method3631(var1, var2.aFloat4917, var2.aFloat4915, var2.aFloat4919);
   }

   public final void method3735(Class526_Sub13_Sub1 var1, float var2, float var3, float var4, float var5, byte var6) {
      this.aClass276Array3070[1682175015 * this.anInt3071].method3626(var1, var2, var3, var4, var5);
   }

   public final void method3736(Class526_Sub13_Sub1 var1, float var2, float var3, byte var4) {
      this.aClass276Array3070[1682175015 * this.anInt3071].method3627(var1, var2, var3);
   }

   public Class276 method3737(int var1) {
      Class276[] var2 = this.aClass276Array3070;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class276 var4 = var2[var3];
         if(var4.method3638()) {
            return var4;
         }
      }

      return null;
   }

   public abstract void method3738();

   public final void method3739(Class526_Sub13_Sub1 var1, int var2, int var3) {
      float var4 = (float)(var2 >> 16 & 255) / 255.0F;
      float var5 = (float)(var2 >> 8 & 255) / 255.0F;
      float var6 = (float)(var2 & 255) / 255.0F;
      float var7 = (float)(var2 >> 24 & 255) / 255.0F;
      this.method3735(var1, var4, var5, var6, var7, (byte)20);
   }

   public final void method3740(Class526_Sub13_Sub1 var1, Class433 var2, int var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3624(var1, var2);
   }

   public final void method3741(Class526_Sub13_Sub1 var1, Class433 var2, byte var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3629(var1, var2);
   }

   public Class276 method3742(String var1, byte var2) throws Exception_Sub5_Sub2 {
      Class276[] var3 = this.aClass276Array3070;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Class276 var5 = var3[var4];
         String var6 = var5.method3621(1557683390);
         if(null != var6 && var6.equals(var1)) {
            if(!var5.method3638()) {
               throw new Exception_Sub5_Sub2(var1);
            }

            return var5;
         }
      }

      throw new Exception_Sub5_Sub2(var1);
   }

   public final void method3743(int var1, float var2, float var3, float var4, float var5, int var6) {
      this.aClass276Array3070[1682175015 * this.anInt3071].method3632(var1, var2, var3, var4, var5);
   }

   public final void method3744(int var1, float var2, float var3, float var4, int var5) {
      this.aClass276Array3070[1682175015 * this.anInt3071].method3631(var1, var2, var3, var4);
   }

   public final void method3745(int var1, float[] var2, int var3, int var4) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3633(var1, var2, var3);
   }

   public final void method3746(int var1, Class433 var2, int var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3634(var1, var2);
   }

   public final void method3747(int var1, Class433 var2, int var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3650(var1, var2);
   }

   public final void method3748(int var1, Class433 var2, int var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3636(var1, var2);
   }

   public final void method3749(int var1, int var2, Interface41 var3, int var4) {
      this.aClass276Array3070[1682175015 * this.anInt3071].method3637(var1, var2, var3);
   }

   public Class526_Sub13_Sub1 method3750(String var1, int var2) throws Exception_Sub5_Sub1 {
      Class526_Sub13_Sub1 var3 = (Class526_Sub13_Sub1)this.aClass278_3067.method3680(var1, (byte)41);
      if(null == var3) {
         throw new Exception_Sub5_Sub1(var1);
      } else {
         return var3;
      }
   }

   public int method3751(short var1) {
      return 277278993 * this.anInt3066;
   }

   public Class526_Sub13_Sub1 method3752(String var1, byte var2) {
      return (Class526_Sub13_Sub1)this.aClass278_3068.method3680(var1, (byte)19);
   }

   public int method3753(int var1) {
      return this.anInt3065 * -1502618031;
   }

   public abstract boolean method3754();

   public final Class276 method3755(int var1, int var2) {
      return this.aClass276Array3070[var1];
   }

   public final void method3756(Class526_Sub13_Sub1 var1, Class446 var2, byte var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3635(var1, var2.aFloat4917, var2.aFloat4915, var2.aFloat4919);
   }

   public abstract boolean method3757(Class276 var1);

   void method3758() {
   }

   public final int method3759() {
      return this.aClass276Array3070.length;
   }

   public final void method3760(Class526_Sub13_Sub1 var1, int var2, Interface41 var3, byte var4) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3630(var1, var2, var3);
   }

   public final int method3761() {
      return this.aClass276Array3070.length;
   }

   public abstract boolean method3762(Class276 var1);

   public abstract boolean method3763(Class276 var1);

   abstract Class276 method3764(Class174_Sub3 var1, Class266 var2);

   abstract Class526_Sub13_Sub1 method3765(Class281 var1);

   public abstract void method3766();

   public final int method3767() {
      return this.aClass276Array3070.length;
   }

   public final int method3768() {
      return 1682175015 * this.anInt3071;
   }

   public final void method3769(Class526_Sub13_Sub1 var1, float var2, float var3, float var4, int var5) {
      this.aClass276Array3070[1682175015 * this.anInt3071].method3635(var1, var2, var3, var4);
   }

   public Class526_Sub13_Sub1 method3770(int var1, int var2) {
      return (Class526_Sub13_Sub1)this.aClass278_3068.method3682(var1, (byte)-126);
   }

   public abstract void method3771();

   public final void method3772(Class526_Sub13_Sub1 var1, float var2, int var3) {
      this.aClass276Array3070[this.anInt3071 * 1682175015].method3640(var1, var2);
   }

   public abstract void method3773();

   public int method3774(Class276 var1, int var2) {
      for(int var3 = 0; var3 < this.aClass276Array3070.length; ++var3) {
         if(this.aClass276Array3070[var3] == var1) {
            return var3;
         }
      }

      return -1;
   }

   abstract Class276 method3775(Class174_Sub3 var1, Class266 var2);

   public int method3776() {
      return this.anInt3065 * -1502618031;
   }

   public Class526_Sub13_Sub1 method3777(int var1, int var2) {
      return (Class526_Sub13_Sub1)this.aClass278_3067.method3682(var1, (byte)-13);
   }

   void method3778() {
   }

   abstract Class276 method3779(Class174_Sub3 var1, Class266 var2);

   static final void method3780(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class195.aClass292_Sub1_2182.method3910(-234675979).anInt3180 * 88466535;
   }

   static final void method3781(Class681 var0, short var1) {
      Class438.method5153(1955463341);
   }

   static final void method3782(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3122(var2, (byte)91).method3007((byte)1).getId();
   }
}
