package com.jagex;

import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class177;
import com.jagex.Class40_Sub8;
import com.jagex.Class430;
import com.jagex.Class445;
import com.jagex.Class463;
import com.jagex.Class525_Sub1;
import com.jagex.Class529;
import com.jagex.Class54;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class555;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class625;
import com.jagex.Class629;
import com.jagex.Class639_Sub1_Sub5;
import com.jagex.Interface59;

public class Class639_Sub1_Sub5_Sub1 extends Class639_Sub1_Sub5 implements Interface59 {
   public static Class629 aClass629_11973;
   boolean aBool11972 = true;
   Class550 aClass550_11969;
   public Class529 aClass529_11971;
   boolean aBool11970;

   public int method379(byte var1) {
      return this.aClass529_11971.anInt7168 * 936783279;
   }

   boolean method9821(int var1) {
      return false;
   }

   boolean method9822(int var1) {
      return this.aBool11972;
   }

   public Class550 method9827(Class174 var1, int var2) {
      return this.aClass550_11969;
   }

   public int method9832(byte var1) {
      return this.aClass529_11971.method6350((byte)-109);
   }

   public int method9838() {
      return this.aClass529_11971.method6350((byte)-104);
   }

   public void method388(int var1) {
   }

   Class555 method9825(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_11971.method6354(var1, 2048, false, true, 2107897858);
      if(null == var3) {
         return null;
      } else {
         Class445 var4 = var1.method2319();
         var4.method5242(this.method7623());
         var4.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class430 var5 = this.method7635();
         Class555 var6 = Class463.method5475(this.aBool11970, (short)25521);
         int var7 = (int)var5.aClass446_4816.aFloat4917 >> 9;
         int var8 = (int)var5.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_11971.method6370(var1, var3, var4, var7, var7, var8, var8, true, 1075488610);
         Class610 var9 = this.aClass529_11971.method6353(-205397902);
         if(null != var9.aClass437_8007) {
            var3.method1974(var4, (Class164)null, 0);
            var1.method2303(var4, this.aClass164Array10829[0], var9.aClass437_8007);
         } else {
            var3.method1974(var4, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11971.aClass614_7178 != null) {
            Class177 var10 = this.aClass529_11971.aClass614_7178.method7253();
            var1.method2516(var10);
         }

         this.aBool11972 = var3.method2014() || null != this.aClass529_11971.aClass614_7178;
         if(null == this.aClass550_11969) {
            this.aClass550_11969 = Class625.method7449((int)var5.aClass446_4816.aFloat4917, (int)var5.aClass446_4816.aFloat4915, (int)var5.aClass446_4816.aFloat4919, var3, -60607677);
         } else {
            Class54.method983(this.aClass550_11969, (int)var5.aClass446_4816.aFloat4917, (int)var5.aClass446_4816.aFloat4915, (int)var5.aClass446_4816.aFloat4919, var3, -360923870);
         }

         return var6;
      }
   }

   public Class639_Sub1_Sub5_Sub1(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16) {
      super(var1, var7, var8, var9, var5, var6, var11, var12);
      this.aClass529_11971 = new Class529(var2, var3, var4, var13, var14, var6, this, var10, var15, var16);
      this.aBool11970 = var4.anInt7954 * 909601847 != 0 && !var10;
      this.method9835(1, -2104679778);
   }

   public void method381(Class174 var1, byte var2) {
      this.aClass529_11971.method6367(var1, (short)-14066);
   }

   public int method56(int var1) {
      return -544650689 * this.aClass529_11971.anInt7163;
   }

   public int method87(int var1) {
      return -65698791 * this.aClass529_11971.anInt7162;
   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class610 var5 = this.aClass529_11971.method6353(-1786786964);
      if(null != var5.aClass437_8007) {
         return var1.method2301(var2, var3, this.method7623(), var5.aClass437_8007, 802152134);
      } else {
         Class168 var6 = this.aClass529_11971.method6354(var1, 131072, false, false, 2107897858);
         return null == var6?false:var6.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   public boolean method265() {
      return this.aClass529_11971.method6356((short)9084);
   }

   public boolean method384(byte var1) {
      return true;
   }

   public int method9859(byte var1) {
      return this.aClass529_11971.method6352((byte)53);
   }

   public void method382(Class174 var1, int var2) {
      this.aClass529_11971.method6362(var1, (byte)1);
   }

   public void method386() {
   }

   public int method9() {
      return -544650689 * this.aClass529_11971.anInt7163;
   }

   public int method137() {
      return -544650689 * this.aClass529_11971.anInt7163;
   }

   void method9834(Class174 var1, int var2) {
      Class168 var3 = this.aClass529_11971.method6354(var1, 262144, false, true, 2107897858);
      if(var3 != null) {
         Class445 var4 = this.method7623();
         Class430 var5 = this.method7635();
         int var6 = (int)var5.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var5.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_11971.method6370(var1, var3, var4, var6, var6, var7, var7, false, 1075488610);
      }

   }

   public int method139() {
      return -65698791 * this.aClass529_11971.anInt7162;
   }

   public int method394() {
      return this.aClass529_11971.anInt7168 * 936783279;
   }

   public Class550 method9843(Class174 var1) {
      return this.aClass550_11969;
   }

   public boolean method385() {
      return this.aClass529_11971.method6356((short)20639);
   }

   public void method383(Class174 var1) {
      this.aClass529_11971.method6367(var1, (short)-13417);
   }

   public boolean method387() {
      return true;
   }

   public boolean method378() {
      return true;
   }

   public void method389(Class174 var1) {
      this.aClass529_11971.method6362(var1, (byte)1);
   }

   public void method10827(Class599 var1, byte var2) {
      this.aClass529_11971.method6358(var1, -1730576285);
   }

   public int method130() {
      return -544650689 * this.aClass529_11971.anInt7163;
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class610 var4 = this.aClass529_11971.method6353(1201848900);
      if(null != var4.aClass437_8007) {
         return var1.method2301(var2, var3, this.method7623(), var4.aClass437_8007, 165383630);
      } else {
         Class168 var5 = this.aClass529_11971.method6354(var1, 131072, false, false, 2107897858);
         return null == var5?false:var5.method1975(var2, var3, this.method7623(), false, 0);
      }
   }

   public int method9846() {
      return this.aClass529_11971.method6352((byte)48);
   }

   public boolean method380(byte var1) {
      return this.aClass529_11971.method6356((short)19065);
   }

   public void method390(Class174 var1) {
      this.aClass529_11971.method6362(var1, (byte)1);
   }

   boolean method9841() {
      return this.aBool11972;
   }

   public void method393(Class174 var1) {
      this.aClass529_11971.method6367(var1, (short)-4569);
   }

   public int method9833() {
      return this.aClass529_11971.method6350((byte)-70);
   }

   public Class550 method9840(Class174 var1) {
      return this.aClass550_11969;
   }

   public Class550 method9829(Class174 var1) {
      return this.aClass550_11969;
   }

   public Class550 method9856(Class174 var1) {
      return this.aClass550_11969;
   }

   public void method391(Class174 var1) {
      this.aClass529_11971.method6367(var1, (short)-3415);
   }

   public void method392(Class174 var1) {
      this.aClass529_11971.method6367(var1, (short)20104);
   }

   public int method9845() {
      return this.aClass529_11971.method6352((byte)-69);
   }

   Class555 method9858(Class174 var1) {
      Class168 var2 = this.aClass529_11971.method6354(var1, 2048, false, true, 2107897858);
      if(null == var2) {
         return null;
      } else {
         Class445 var3 = var1.method2319();
         var3.method5242(this.method7623());
         var3.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool11970, (short)19457);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_11971.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_11971.method6353(-263555605);
         if(null != var8.aClass437_8007) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11971.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_11971.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool11972 = var2.method2014() || null != this.aClass529_11971.aClass614_7178;
         if(null == this.aClass550_11969) {
            this.aClass550_11969 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1465148898);
         } else {
            Class54.method983(this.aClass550_11969, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1874050642);
         }

         return var5;
      }
   }

   Class555 method9828(Class174 var1) {
      Class168 var2 = this.aClass529_11971.method6354(var1, 2048, false, true, 2107897858);
      if(null == var2) {
         return null;
      } else {
         Class445 var3 = var1.method2319();
         var3.method5242(this.method7623());
         var3.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool11970, (short)8983);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_11971.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_11971.method6353(-2036351260);
         if(null != var8.aClass437_8007) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11971.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_11971.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool11972 = var2.method2014() || null != this.aClass529_11971.aClass614_7178;
         if(null == this.aClass550_11969) {
            this.aClass550_11969 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -1754889417);
         } else {
            Class54.method983(this.aClass550_11969, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, 379582357);
         }

         return var5;
      }
   }

   Class555 method9844(Class174 var1) {
      Class168 var2 = this.aClass529_11971.method6354(var1, 2048, false, true, 2107897858);
      if(null == var2) {
         return null;
      } else {
         Class445 var3 = var1.method2319();
         var3.method5242(this.method7623());
         var3.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class430 var4 = this.method7635();
         Class555 var5 = Class463.method5475(this.aBool11970, (short)28411);
         int var6 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var7 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_11971.method6370(var1, var2, var3, var6, var6, var7, var7, true, 1075488610);
         Class610 var8 = this.aClass529_11971.method6353(-138584853);
         if(null != var8.aClass437_8007) {
            var2.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var8.aClass437_8007);
         } else {
            var2.method1974(var3, this.aClass164Array10829[0], 0);
         }

         if(this.aClass529_11971.aClass614_7178 != null) {
            Class177 var9 = this.aClass529_11971.aClass614_7178.method7253();
            var1.method2516(var9);
         }

         this.aBool11972 = var2.method2014() || null != this.aClass529_11971.aClass614_7178;
         if(null == this.aClass550_11969) {
            this.aClass550_11969 = Class625.method7449((int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, 218080673);
         } else {
            Class54.method983(this.aClass550_11969, (int)var4.aClass446_4816.aFloat4917, (int)var4.aClass446_4816.aFloat4915, (int)var4.aClass446_4816.aFloat4919, var2, -2031324797);
         }

         return var5;
      }
   }

   void method9848(Class174 var1) {
      Class168 var2 = this.aClass529_11971.method6354(var1, 262144, false, true, 2107897858);
      if(var2 != null) {
         Class445 var3 = this.method7623();
         Class430 var4 = this.method7635();
         int var5 = (int)var4.aClass446_4816.aFloat4917 >> 9;
         int var6 = (int)var4.aClass446_4816.aFloat4919 >> 9;
         this.aClass529_11971.method6370(var1, var2, var3, var5, var5, var6, var6, false, 1075488610);
      }

   }

   boolean method9836() {
      return false;
   }

   public void method10828(Class599 var1) {
      this.aClass529_11971.method6358(var1, -1730576285);
   }

   public static void method10829(int var0, byte var1) {
      if(var0 < 1) {
         Class525_Sub1.anInt10713 = -1565126609 * Class525_Sub1.anInt10707;
      } else {
         Class525_Sub1.anInt10713 = var0 * 1479494503;
      }

   }

   static String method10830(String var0, int var1) {
      String var2 = null;
      int var3 = var0.indexOf("--> ");
      if(var3 >= 0) {
         var2 = var0.substring(0, 4 + var3);
         var0 = var0.substring(var3 + 4);
      }

      int var4 = -1;
      if(var0.startsWith("directlogin ")) {
         var4 = var0.indexOf(" ", "directlogin ".length());
      }

      if(var4 >= 0) {
         int var5 = var0.length();
         var0 = var0.substring(0, var4) + " ";

         for(int var6 = var4 + 1; var6 < var5; ++var6) {
            var0 = var0 + "*";
         }
      }

      return null != var2?var2 + var0:var0;
   }
}
