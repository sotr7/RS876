package com.jagex;

import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class177;
import com.jagex.Class40_Sub8;
import com.jagex.Class430;
import com.jagex.Class445;
import com.jagex.Class463;
import com.jagex.Class513;
import com.jagex.Class529;
import com.jagex.Class54;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class555;
import com.jagex.Class556;
import com.jagex.Class594;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class625;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub1;
import com.jagex.Class703;
import com.jagex.Interface59;

public class Class639_Sub1_Sub1_Sub2 extends Class639_Sub1_Sub1 implements Interface59 {
   boolean aBool12029 = true;
   Class550 aClass550_12028;
   public Class529 aClass529_12026;
   boolean aBool12025;
   static int[] anIntArray12027 = new int[]{1, 2, 4, 8};
   static int[] anIntArray12024 = new int[]{16, 32, 64, 128};

   public Class550 method9827(Class174 var1, int var2) {
      return this.aClass550_12028;
   }

   public int method87(int var1) {
      return this.aClass529_12026.anInt7162 * -65698791;
   }

   boolean method9822(int var1) {
      return this.aBool12029;
   }

   boolean method9841() {
      return this.aBool12029;
   }

   public int method9832(byte var1) {
      return this.aClass529_12026.method6350((byte)-114);
   }

   public int method9859(byte var1) {
      return this.aClass529_12026.method6352((byte)-86);
   }

   public void method392(Class174 var1) {
      this.aClass529_12026.method6367(var1, (short)10077);
   }

   public void method382(Class174 var1, int var2) {
      this.aClass529_12026.method6362(var1, (byte)1);
   }

   void method9834(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_12026.method6354(var1, 262144, true, true, 2107897858);
      if(null != var3) {
         Class445 var4 = this.method7623();
         Class430 var5 = this.method7635();
         int var6 = (int)var5.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var5.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12026.method6370(var1, var3, var4, var6, var6, var7, var7, false, 1075488610);
      }

   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class610 var5 = this.aClass529_12026.method6353(384197536);
      if(var5.aClass437_8007 != null) {
         return var1.method2301(var2, var3, this.method7623(), var5.aClass437_8007, -2017349449);
      } else {
         Class168 var6 = this.aClass529_12026.method6354(var1, 131072, false, false, 2107897858);
         return null == var6?false:var6.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   Class555 method9828(Class174 var1) {
      Class168 var2 = this.aClass529_12026.method6354(var1, 2048, false, true, 2107897858);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool12025, (short)30124);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12026.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_12026.method6353(-2086202189);
         if(var8.aClass437_8007 != null) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12026.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_12026.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool12029 = var2.method2014() || null != this.aClass529_12026.aClass614_7178;
         if(this.aClass550_12028 == null) {
            this.aClass550_12028 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1756279636);
         } else {
            Class54.method983(this.aClass550_12028, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -2005597196);
         }

         return var5;
      }
   }

   final void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      throw new IllegalStateException();
   }

   final void method9842(int var1) {
      throw new IllegalStateException();
   }

   public void method10858(Class599 var1, int var2) {
      this.aClass529_12026.method6358(var1, -1730576285);
   }

   Class555 method9858(Class174 var1) {
      Class168 var2 = this.aClass529_12026.method6354(var1, 2048, false, true, 2107897858);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool12025, (short)32597);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12026.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_12026.method6353(-467333037);
         if(var8.aClass437_8007 != null) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12026.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_12026.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool12029 = var2.method2014() || null != this.aClass529_12026.aClass614_7178;
         if(this.aClass550_12028 == null) {
            this.aClass550_12028 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -263916377);
         } else {
            Class54.method983(this.aClass550_12028, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, 133293576);
         }

         return var5;
      }
   }

   Class555 method9844(Class174 var1) {
      Class168 var2 = this.aClass529_12026.method6354(var1, 2048, false, true, 2107897858);
      if(var2 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool12025, (short)10630);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12026.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_12026.method6353(1707993688);
         if(var8.aClass437_8007 != null) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12026.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_12026.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool12029 = var2.method2014() || null != this.aClass529_12026.aClass614_7178;
         if(this.aClass550_12028 == null) {
            this.aClass550_12028 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, 342892941);
         } else {
            Class54.method983(this.aClass550_12028, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -53322206);
         }

         return var5;
      }
   }

   public void method388(int var1) {
   }

   public boolean method384(byte var1) {
      return true;
   }

   boolean method9821(int var1) {
      return false;
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class610 var4 = this.aClass529_12026.method6353(-495575948);
      if(var4.aClass437_8007 != null) {
         return var1.method2301(var2, var3, this.method7623(), var4.aClass437_8007, -1784816066);
      } else {
         Class168 var5 = this.aClass529_12026.method6354(var1, 131072, false, false, 2107897858);
         return null == var5?false:var5.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   public void method381(Class174 var1, byte var2) {
      this.aClass529_12026.method6367(var1, (short)11125);
   }

   public int method379(byte var1) {
      return this.aClass529_12026.anInt7168 * 936783279;
   }

   public int method9() {
      return -544650689 * this.aClass529_12026.anInt7163;
   }

   public int method137() {
      return -544650689 * this.aClass529_12026.anInt7163;
   }

   public int method130() {
      return -544650689 * this.aClass529_12026.anInt7163;
   }

   public int method139() {
      return this.aClass529_12026.anInt7162 * -65698791;
   }

   public int method394() {
      return this.aClass529_12026.anInt7168 * 936783279;
   }

   public void method386() {
   }

   public boolean method385() {
      return this.aClass529_12026.method6356((short)17777);
   }

   public int method56(int var1) {
      return -544650689 * this.aClass529_12026.anInt7163;
   }

   public boolean method387() {
      return true;
   }

   public boolean method378() {
      return true;
   }

   final boolean method9864(byte var1) {
      return false;
   }

   public void method390(Class174 var1) {
      this.aClass529_12026.method6362(var1, (byte)1);
   }

   public void method391(Class174 var1) {
      this.aClass529_12026.method6367(var1, (short)-13970);
   }

   public boolean method265() {
      return this.aClass529_12026.method6356((short)18950);
   }

   public void method393(Class174 var1) {
      this.aClass529_12026.method6367(var1, (short)-9773);
   }

   public void method383(Class174 var1) {
      this.aClass529_12026.method6367(var1, (short)420);
   }

   boolean method9836() {
      return false;
   }

   public Class550 method9856(Class174 var1) {
      return this.aClass550_12028;
   }

   public int method9838() {
      return this.aClass529_12026.method6350((byte)-116);
   }

   public boolean method380(byte var1) {
      return this.aClass529_12026.method6356((short)31988);
   }

   public Class550 method9840(Class174 var1) {
      return this.aClass550_12028;
   }

   public Class550 method9829(Class174 var1) {
      return this.aClass550_12028;
   }

   public Class639_Sub1_Sub1_Sub2(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14) {
      super(var1, var7, var8, var9, var5, var6, Class513.method6205(var11, var12, (byte)0));
      this.aClass529_12026 = new Class529(var2, var3, var4, var11, var12, var6, this, var10, var13, var14);
      this.aBool12025 = 909601847 * var4.anInt7954 != 0 && !var10;
      this.method9835(1, 2044858391);
   }

   public Class550 method9843(Class174 var1) {
      return this.aClass550_12028;
   }

   public int method9846() {
      return this.aClass529_12026.method6352((byte)97);
   }

   public int method9845() {
      return this.aClass529_12026.method6352((byte)-77);
   }

   final void method9847() {
      throw new IllegalStateException();
   }

   public void method389(Class174 var1) {
      this.aClass529_12026.method6362(var1, (byte)1);
   }

   void method9848(Class174 var1) {
      Class168 var2 = this.aClass529_12026.method6354(var1, 262144, true, true, 2107897858);
      if(null != var2) {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         int var5 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var6 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12026.method6370(var1, var2, var3, var5, var5, var6, var6, false, 1075488610);
      }

   }

   Class555 method9825(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_12026.method6354(var1, 2048, false, true, 2107897858);
      if(var3 == null) {
         return null;
      } else {
         Class445 var4 = this.method7623();
         Class430 var5 = this.method7635();
         Class555 var6 = Class463.method5475(this.aBool12025, (short)25460);
         int var7 = (int)var5.aClass446_4816.aFloat4917 >> 9;
         int var8 = (int)var5.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_12026.method6370(var1, var3, var4, var7, var7, var8, var8, true, 1075488610);
         Class610 var9 = this.aClass529_12026.method6353(842020822);
         if(var9.aClass437_8007 != null) {
            var3.method1974(var4, (Class164)null, 0);
            var1.method2303(var4, this.aClass164Array10829[0], var9.aClass437_8007);
         } else {
            var3.method1974(var4, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_12026.aClass614_7178 != null) {
            Class177 var10 = this.aClass529_12026.aClass614_7178.method7253();
            var1.method2516(var10);
         }

         this.aBool12029 = var3.method2014() || null != this.aClass529_12026.aClass614_7178;
         if(this.aClass550_12028 == null) {
            this.aClass550_12028 = Class625.method7449((int)var5.aClass446_4816.aFloat4917, (int)var5.aClass446_4816.aFloat4915, (int)var5.aClass446_4816.aFloat4919, var3, -1676448852);
         } else {
            Class54.method983(this.aClass550_12028, (int)var5.aClass446_4816.aFloat4917, (int)var5.aClass446_4816.aFloat4915, (int)var5.aClass446_4816.aFloat4919, var3, 342285707);
         }

         return var6;
      }
   }

   final boolean method9850() {
      return false;
   }

   final boolean method9851() {
      return false;
   }

   final void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   final void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   public int method9833() {
      return this.aClass529_12026.method6350((byte)-118);
   }

   static int method10859(int var0, int var1) {
      return var0 != Class594.aClass594_7836.anInt7833 * -1226971375 && -1226971375 * Class594.aClass594_7824.anInt7833 != var0?anIntArray12027[var1 & 3]:anIntArray12024[var1 & 3];
   }

   static void method10860(int var0) {
      Class556.anIntArray7512 = Class703.method8215(2048, 35, 8, 8, 4, 0.4F, true, (byte)1);
   }
}
