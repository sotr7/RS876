package com.jagex;

import com.jagex.Class11;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class177;
import com.jagex.Class40_Sub8;
import com.jagex.Class430;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class448_Sub1;
import com.jagex.Class463;
import com.jagex.Class529;
import com.jagex.Class54;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class555;
import com.jagex.Class594;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class625;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub3;
import com.jagex.Class681;
import com.jagex.Interface59;

public class Class639_Sub1_Sub3_Sub2 extends Class639_Sub1_Sub3 implements Interface59 {
   boolean aBool12031 = true;
   Class550 aClass550_12032;
   public Class529 aClass529_12033;
   boolean aBool12030;

   public int method9833() {
      return this.aClass529_12033.method6350((byte)-59);
   }

   public void method10861(Class599 var1) {
      this.aClass529_12033.method6358(var1, -1730576285);
   }

   boolean method9822(int var1) {
      return this.aBool12031;
   }

   public int method9() {
      return -544650689 * this.aClass529_12033.anInt7163;
   }

   public Class550 method9827(Class174 var1, int var2) {
      return this.aClass550_12032;
   }

   public int method9859(byte var1) {
      return this.aClass529_12033.method6352((byte)32);
   }

   Class555 method9825(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_12033.method6354(var1, 2048, false, true, 2107897858);
      if(null == var3) {
         return null;
      } else {
         Class445 var4 = this.method7623();
         Class430 var5 = this.method7635();
         Class555 var6 = Class463.method5475(this.aBool12030, (short)3178);
         int var7 = (int)var5.aClass446_4816.aFloat4917 >> 9;
         int var8 = (int)var5.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12033.method6370(var1, var3, var4, var7, var7, var8, var8, true, 1075488610);
         Class610 var9 = this.aClass529_12033.method6353(176622007);
         if(null != var9.aClass437_8007) {
            var3.method1974(var4, (Class164)null, 0);
            var1.method2303(var4, this.aClass164Array10829[0], var9.aClass437_8007);
         } else {
            var3.method1974(var4, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12033.aClass614_7178 != null) {
            Class177 var10 = this.aClass529_12033.aClass614_7178.method7253();
            var1.method2516(var10);
         }

         this.aBool12031 = var3.method2014() || this.aClass529_12033.aClass614_7178 != null;
         if(this.aClass550_12032 == null) {
            this.aClass550_12032 = Class625.method7449((int)var5.aClass446_4816.aFloat4917, (int)var5.aClass446_4816.aFloat4915, (int)var5.aClass446_4816.aFloat4919, var3, -596176838);
         } else {
            Class54.method983(this.aClass550_12032, (int)var5.aClass446_4816.aFloat4917, (int)var5.aClass446_4816.aFloat4915, (int)var5.aClass446_4816.aFloat4919, var3, -155281285);
         }

         return var6;
      }
   }

   void method9834(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_12033.method6354(var1, 262144, true, true, 2107897858);
      if(var3 != null) {
         Class446 var4 = this.method7635().aClass446_4816;
         int var5 = (int)var4.aFloat4917 >> 9;
         int var6 = (int)var4.aFloat4919 >> 9;
         this.aClass529_12033.method6370(var1, var3, this.method7623(), var5, var5, var6, var6, false, 1075488610);
      }

   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class610 var5 = this.aClass529_12033.method6353(-1981479484);
      if(null != var5.aClass437_8007) {
         return var1.method2301(var2, var3, this.method7623(), var5.aClass437_8007, -1256040092);
      } else {
         Class168 var6 = this.aClass529_12033.method6354(var1, 131072, false, false, 2107897858);
         return var6 == null?false:var6.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   Class555 method9858(Class174 var1) {
      Class168 var2 = this.aClass529_12033.method6354(var1, 2048, false, true, 2107897858);
      if(null == var2) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool12030, (short)1326);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12033.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_12033.method6353(2094471523);
         if(null != var8.aClass437_8007) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12033.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_12033.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool12031 = var2.method2014() || this.aClass529_12033.aClass614_7178 != null;
         if(this.aClass550_12032 == null) {
            this.aClass550_12032 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1000049727);
         } else {
            Class54.method983(this.aClass550_12032, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -795921953);
         }

         return var5;
      }
   }

   final boolean method9851() {
      return false;
   }

   public void method388(int var1) {
   }

   public int method56(int var1) {
      return -544650689 * this.aClass529_12033.anInt7163;
   }

   final boolean method9864(byte var1) {
      return false;
   }

   public int method379(byte var1) {
      return this.aClass529_12033.anInt7168 * 936783279;
   }

   public void method10862(Class599 var1, int var2) {
      this.aClass529_12033.method6358(var1, -1730576285);
   }

   public boolean method385() {
      return this.aClass529_12033.method6356((short)28471);
   }

   public boolean method384(byte var1) {
      return true;
   }

   public boolean method380(byte var1) {
      return this.aClass529_12033.method6356((short)17347);
   }

   public void method382(Class174 var1, int var2) {
      this.aClass529_12033.method6362(var1, (byte)1);
   }

   public void method381(Class174 var1, byte var2) {
      this.aClass529_12033.method6367(var1, (short)4027);
   }

   public int method9845() {
      return this.aClass529_12033.method6352((byte)-87);
   }

   public int method137() {
      return -544650689 * this.aClass529_12033.anInt7163;
   }

   public int method130() {
      return -544650689 * this.aClass529_12033.anInt7163;
   }

   public int method139() {
      return -65698791 * this.aClass529_12033.anInt7162;
   }

   public int method394() {
      return this.aClass529_12033.anInt7168 * 936783279;
   }

   public void method386() {
   }

   Class555 method9844(Class174 var1) {
      Class168 var2 = this.aClass529_12033.method6354(var1, 2048, false, true, 2107897858);
      if(null == var2) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool12030, (short)27752);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12033.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_12033.method6353(1068687179);
         if(null != var8.aClass437_8007) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12033.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_12033.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool12031 = var2.method2014() || this.aClass529_12033.aClass614_7178 != null;
         if(this.aClass550_12032 == null) {
            this.aClass550_12032 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -966313996);
         } else {
            Class54.method983(this.aClass550_12032, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1892694986);
         }

         return var5;
      }
   }

   public boolean method265() {
      return this.aClass529_12033.method6356((short)25137);
   }

   public boolean method387() {
      return true;
   }

   public boolean method378() {
      return true;
   }

   public void method389(Class174 var1) {
      this.aClass529_12033.method6362(var1, (byte)1);
   }

   public Class550 method9829(Class174 var1) {
      return this.aClass550_12032;
   }

   public int method9832(byte var1) {
      return this.aClass529_12033.method6350((byte)-96);
   }

   public void method392(Class174 var1) {
      this.aClass529_12033.method6367(var1, (short)9667);
   }

   public void method393(Class174 var1) {
      this.aClass529_12033.method6367(var1, (short)-12340);
   }

   public void method383(Class174 var1) {
      this.aClass529_12033.method6367(var1, (short)14703);
   }

   boolean method9836() {
      return false;
   }

   boolean method9841() {
      return this.aBool12031;
   }

   public int method9838() {
      return this.aClass529_12033.method6350((byte)-54);
   }

   public int method9846() {
      return this.aClass529_12033.method6352((byte)47);
   }

   public Class550 method9840(Class174 var1) {
      return this.aClass550_12032;
   }

   boolean method9821(int var1) {
      return false;
   }

   final void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   public Class550 method9843(Class174 var1) {
      return this.aClass550_12032;
   }

   final void method9842(int var1) {
      throw new IllegalStateException();
   }

   public int method87(int var1) {
      return -65698791 * this.aClass529_12033.anInt7162;
   }

   public Class550 method9856(Class174 var1) {
      return this.aClass550_12032;
   }

   Class555 method9828(Class174 var1) {
      Class168 var2 = this.aClass529_12033.method6354(var1, 2048, false, true, 2107897858);
      if(null == var2) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool12030, (short)23151);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12033.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_12033.method6353(-1510546480);
         if(null != var8.aClass437_8007) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12033.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_12033.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool12031 = var2.method2014() || this.aClass529_12033.aClass614_7178 != null;
         if(this.aClass550_12032 == null) {
            this.aClass550_12032 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1633155729);
         } else {
            Class54.method983(this.aClass550_12032, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1789152510);
         }

         return var5;
      }
   }

   public void method390(Class174 var1) {
      this.aClass529_12033.method6362(var1, (byte)1);
   }

   void method9848(Class174 var1) {
      Class168 var2 = this.aClass529_12033.method6354(var1, 262144, true, true, 2107897858);
      if(var2 != null) {
         Class446 var3 = this.method7635().aClass446_4816;
         int var4 = (int)var3.aFloat4917 >> 9;
         int var5 = (int)var3.aFloat4919 >> 9;
         this.aClass529_12033.method6370(var1, var2, this.method7623(), var4, var4, var5, var5, false, 1075488610);
      }

   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class610 var4 = this.aClass529_12033.method6353(-1109703456);
      if(null != var4.aClass437_8007) {
         return var1.method2301(var2, var3, this.method7623(), var4.aClass437_8007, 1183323402);
      } else {
         Class168 var5 = this.aClass529_12033.method6354(var1, 131072, false, false, 2107897858);
         return var5 == null?false:var5.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   final boolean method9850() {
      return false;
   }

   public void method391(Class174 var1) {
      this.aClass529_12033.method6367(var1, (short)-7436);
   }

   final void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   final void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   final void method9847() {
      throw new IllegalStateException();
   }

   public Class639_Sub1_Sub3_Sub2(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13) {
      super(var1, var7, var8, var9, var5, var6, var4.anInt7988 * 1010119415);
      this.aClass529_12033 = new Class529(var2, var3, var4, -1226971375 * Class594.aClass594_7843.anInt7833, var11, var6, this, var10, var12, var13);
      this.aBool12030 = 0 != var4.anInt7954 * 909601847 && !var10;
      this.method9835(1, 234938793);
   }

   static final void method10863(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class11 var3 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -678783963);
      if(-1 == 2102653097 * var3.anInt124 && 2121068701 * var3.anInt123 >= 0) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt123 * 2121068701;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
      }

   }
}
